package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.MotionScene;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.R;
import androidx.recyclerview.widget.ItemTouchHelper;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class Carousel extends MotionHelper {
    private static final boolean DEBUG = false;
    private static final String TAG = "Carousel";
    public static final int TOUCH_UP_CARRY_ON = 2;
    public static final int TOUCH_UP_IMMEDIATE_STOP = 1;
    private MotionLayout mMotionLayout;
    private Adapter mAdapter = null;
    private final ArrayList<View> mList = new ArrayList<>();
    private int mPreviousIndex = 0;
    private int mIndex = 0;
    private int firstViewReference = -1;
    private boolean infiniteCarousel = false;
    private int backwardTransition = -1;
    private int forwardTransition = -1;
    private int previousState = -1;
    private int nextState = -1;
    private float dampening = 0.9f;
    private int startIndex = 0;
    private int emptyViewBehavior = 4;
    private int touchUpMode = 1;
    private float velocityThreshold = 2.0f;
    private int mTargetIndex = -1;
    private int mAnimateTargetDelay = ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION;
    int mLastStartId = -1;
    Runnable mUpdateRunnable = new Runnable() { // from class: androidx.constraintlayout.helper.widget.Carousel.1
        @Override // java.lang.Runnable
        public void run() {
            Carousel.this.mMotionLayout.setProgress(0.0f);
            Carousel.this.updateItems();
            Carousel.this.mAdapter.onNewItem(Carousel.this.mIndex);
            float velocity = Carousel.this.mMotionLayout.getVelocity();
            if (Carousel.this.touchUpMode != 2 || velocity <= Carousel.this.velocityThreshold || Carousel.this.mIndex >= Carousel.this.mAdapter.count() - 1) {
                return;
            }
            final float f = velocity * Carousel.this.dampening;
            if (Carousel.this.mIndex == 0 && Carousel.this.mPreviousIndex > Carousel.this.mIndex) {
                return;
            }
            if (Carousel.this.mIndex == Carousel.this.mAdapter.count() - 1 && Carousel.this.mPreviousIndex < Carousel.this.mIndex) {
                return;
            }
            Carousel.this.mMotionLayout.post(new Runnable() { // from class: androidx.constraintlayout.helper.widget.Carousel.1.1
                @Override // java.lang.Runnable
                public void run() {
                    Carousel.this.mMotionLayout.touchAnimateTo(5, 1.0f, f);
                }
            });
        }
    };

    /* loaded from: classes.dex */
    public interface Adapter {
        int count();

        void onNewItem(int i);

        void populate(View view, int i);
    }

    public Carousel(Context context) {
        super(context);
    }

    public Carousel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }

    public Carousel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet);
    }

    private void init(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Carousel);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.Carousel_carousel_firstView) {
                    this.firstViewReference = obtainStyledAttributes.getResourceId(index, this.firstViewReference);
                } else if (index == R.styleable.Carousel_carousel_backwardTransition) {
                    this.backwardTransition = obtainStyledAttributes.getResourceId(index, this.backwardTransition);
                } else if (index == R.styleable.Carousel_carousel_forwardTransition) {
                    this.forwardTransition = obtainStyledAttributes.getResourceId(index, this.forwardTransition);
                } else if (index == R.styleable.Carousel_carousel_emptyViewsBehavior) {
                    this.emptyViewBehavior = obtainStyledAttributes.getInt(index, this.emptyViewBehavior);
                } else if (index == R.styleable.Carousel_carousel_previousState) {
                    this.previousState = obtainStyledAttributes.getResourceId(index, this.previousState);
                } else if (index == R.styleable.Carousel_carousel_nextState) {
                    this.nextState = obtainStyledAttributes.getResourceId(index, this.nextState);
                } else if (index == R.styleable.Carousel_carousel_touchUp_dampeningFactor) {
                    this.dampening = obtainStyledAttributes.getFloat(index, this.dampening);
                } else if (index == R.styleable.Carousel_carousel_touchUpMode) {
                    this.touchUpMode = obtainStyledAttributes.getInt(index, this.touchUpMode);
                } else if (index == R.styleable.Carousel_carousel_touchUp_velocityThreshold) {
                    this.velocityThreshold = obtainStyledAttributes.getFloat(index, this.velocityThreshold);
                } else if (index == R.styleable.Carousel_carousel_infinite) {
                    this.infiniteCarousel = obtainStyledAttributes.getBoolean(index, this.infiniteCarousel);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void setAdapter(Adapter adapter) {
        this.mAdapter = adapter;
    }

    public int getCount() {
        Adapter adapter = this.mAdapter;
        if (adapter != null) {
            return adapter.count();
        }
        return 0;
    }

    public int getCurrentIndex() {
        return this.mIndex;
    }

    public void transitionToIndex(int i, int i2) {
        this.mTargetIndex = Math.max(0, Math.min(getCount() - 1, i));
        int max = Math.max(0, i2);
        this.mAnimateTargetDelay = max;
        this.mMotionLayout.setTransitionDuration(max);
        if (i < this.mIndex) {
            this.mMotionLayout.transitionToState(this.previousState, this.mAnimateTargetDelay);
        } else {
            this.mMotionLayout.transitionToState(this.nextState, this.mAnimateTargetDelay);
        }
    }

    public void jumpToIndex(int i) {
        this.mIndex = Math.max(0, Math.min(getCount() - 1, i));
        refresh();
    }

    public void refresh() {
        int size = this.mList.size();
        for (int i = 0; i < size; i++) {
            View view = this.mList.get(i);
            if (this.mAdapter.count() == 0) {
                updateViewVisibility(view, this.emptyViewBehavior);
            } else {
                updateViewVisibility(view, 0);
            }
        }
        this.mMotionLayout.rebuildScene();
        updateItems();
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
    public void onTransitionChange(MotionLayout motionLayout, int i, int i2, float f) {
        this.mLastStartId = i;
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
    public void onTransitionCompleted(MotionLayout motionLayout, int i) {
        int i2 = this.mIndex;
        this.mPreviousIndex = i2;
        if (i == this.nextState) {
            this.mIndex = i2 + 1;
        } else if (i == this.previousState) {
            this.mIndex = i2 - 1;
        }
        if (this.infiniteCarousel) {
            if (this.mIndex >= this.mAdapter.count()) {
                this.mIndex = 0;
            }
            if (this.mIndex < 0) {
                this.mIndex = this.mAdapter.count() - 1;
            }
        } else {
            if (this.mIndex >= this.mAdapter.count()) {
                this.mIndex = this.mAdapter.count() - 1;
            }
            if (this.mIndex < 0) {
                this.mIndex = 0;
            }
        }
        if (this.mPreviousIndex != this.mIndex) {
            this.mMotionLayout.post(this.mUpdateRunnable);
        }
    }

    private void enableAllTransitions(boolean z) {
        Iterator<MotionScene.Transition> it = this.mMotionLayout.getDefinedTransitions().iterator();
        while (it.hasNext()) {
            it.next().setEnabled(z);
        }
    }

    private boolean enableTransition(int i, boolean z) {
        MotionLayout motionLayout;
        MotionScene.Transition transition;
        if (i == -1 || (motionLayout = this.mMotionLayout) == null || (transition = motionLayout.getTransition(i)) == null || z == transition.isEnabled()) {
            return false;
        }
        transition.setEnabled(z);
        return true;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getParent() instanceof MotionLayout) {
            MotionLayout motionLayout = (MotionLayout) getParent();
            for (int i = 0; i < this.mCount; i++) {
                int i2 = this.mIds[i];
                View viewById = motionLayout.getViewById(i2);
                if (this.firstViewReference == i2) {
                    this.startIndex = i;
                }
                this.mList.add(viewById);
            }
            this.mMotionLayout = motionLayout;
            if (this.touchUpMode == 2) {
                MotionScene.Transition transition = motionLayout.getTransition(this.forwardTransition);
                if (transition != null) {
                    transition.setOnTouchUp(5);
                }
                MotionScene.Transition transition2 = this.mMotionLayout.getTransition(this.backwardTransition);
                if (transition2 != null) {
                    transition2.setOnTouchUp(5);
                }
            }
            updateItems();
        }
    }

    private boolean updateViewVisibility(View view, int i) {
        MotionLayout motionLayout = this.mMotionLayout;
        if (motionLayout == null) {
            return false;
        }
        boolean z = false;
        for (int i2 : motionLayout.getConstraintSetIds()) {
            z |= updateViewVisibility(i2, view, i);
        }
        return z;
    }

    private boolean updateViewVisibility(int i, View view, int i2) {
        ConstraintSet.Constraint constraint;
        ConstraintSet constraintSet = this.mMotionLayout.getConstraintSet(i);
        if (constraintSet == null || (constraint = constraintSet.getConstraint(view.getId())) == null) {
            return false;
        }
        constraint.propertySet.mVisibilityMode = 1;
        view.setVisibility(i2);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateItems() {
        Adapter adapter = this.mAdapter;
        if (adapter == null || this.mMotionLayout == null || adapter.count() == 0) {
            return;
        }
        int size = this.mList.size();
        for (int i = 0; i < size; i++) {
            View view = this.mList.get(i);
            int i2 = (this.mIndex + i) - this.startIndex;
            if (this.infiniteCarousel) {
                if (i2 < 0) {
                    int i3 = this.emptyViewBehavior;
                    if (i3 != 4) {
                        updateViewVisibility(view, i3);
                    } else {
                        updateViewVisibility(view, 0);
                    }
                    if (i2 % this.mAdapter.count() == 0) {
                        this.mAdapter.populate(view, 0);
                    } else {
                        Adapter adapter2 = this.mAdapter;
                        adapter2.populate(view, adapter2.count() + (i2 % this.mAdapter.count()));
                    }
                } else if (i2 >= this.mAdapter.count()) {
                    if (i2 == this.mAdapter.count()) {
                        i2 = 0;
                    } else if (i2 > this.mAdapter.count()) {
                        i2 %= this.mAdapter.count();
                    }
                    int i4 = this.emptyViewBehavior;
                    if (i4 != 4) {
                        updateViewVisibility(view, i4);
                    } else {
                        updateViewVisibility(view, 0);
                    }
                    this.mAdapter.populate(view, i2);
                } else {
                    updateViewVisibility(view, 0);
                    this.mAdapter.populate(view, i2);
                }
            } else if (i2 < 0) {
                updateViewVisibility(view, this.emptyViewBehavior);
            } else if (i2 >= this.mAdapter.count()) {
                updateViewVisibility(view, this.emptyViewBehavior);
            } else {
                updateViewVisibility(view, 0);
                this.mAdapter.populate(view, i2);
            }
        }
        int i5 = this.mTargetIndex;
        if (i5 != -1 && i5 != this.mIndex) {
            this.mMotionLayout.post(new Runnable() { // from class: androidx.constraintlayout.helper.widget.-$$Lambda$Carousel$JBatl87K4qY5jYYwcTRf6eJYe7o
                @Override // java.lang.Runnable
                public final void run() {
                    Carousel.this.lambda$updateItems$0$Carousel();
                }
            });
        } else if (this.mTargetIndex == this.mIndex) {
            this.mTargetIndex = -1;
        }
        if (this.backwardTransition == -1 || this.forwardTransition == -1 || this.infiniteCarousel) {
            return;
        }
        int count = this.mAdapter.count();
        if (this.mIndex == 0) {
            enableTransition(this.backwardTransition, false);
        } else {
            enableTransition(this.backwardTransition, true);
            this.mMotionLayout.setTransition(this.backwardTransition);
        }
        if (this.mIndex == count - 1) {
            enableTransition(this.forwardTransition, false);
            return;
        }
        enableTransition(this.forwardTransition, true);
        this.mMotionLayout.setTransition(this.forwardTransition);
    }

    public /* synthetic */ void lambda$updateItems$0$Carousel() {
        this.mMotionLayout.setTransitionDuration(this.mAnimateTargetDelay);
        if (this.mTargetIndex < this.mIndex) {
            this.mMotionLayout.transitionToState(this.previousState, this.mAnimateTargetDelay);
        } else {
            this.mMotionLayout.transitionToState(this.nextState, this.mAnimateTargetDelay);
        }
    }
}
