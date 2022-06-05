package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.Xml;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class KeyFrames {
    private static final String CUSTOM_ATTRIBUTE = "CustomAttribute";
    private static final String CUSTOM_METHOD = "CustomMethod";
    private static final String TAG = "KeyFrames";
    public static final int UNSET = -1;
    static HashMap<String, Constructor<? extends Key>> sKeyMakers;
    private HashMap<Integer, ArrayList<Key>> mFramesMap = new HashMap<>();

    static {
        HashMap<String, Constructor<? extends Key>> hashMap = new HashMap<>();
        sKeyMakers = hashMap;
        try {
            hashMap.put("KeyAttribute", KeyAttributes.class.getConstructor(new Class[0]));
            sKeyMakers.put(TypedValues.Position.NAME, KeyPosition.class.getConstructor(new Class[0]));
            sKeyMakers.put(TypedValues.Cycle.NAME, KeyCycle.class.getConstructor(new Class[0]));
            sKeyMakers.put("KeyTimeCycle", KeyTimeCycle.class.getConstructor(new Class[0]));
            sKeyMakers.put(TypedValues.Trigger.NAME, KeyTrigger.class.getConstructor(new Class[0]));
        } catch (NoSuchMethodException unused) {
        }
    }

    public void addKey(Key key) {
        if (!this.mFramesMap.containsKey(Integer.valueOf(key.mTargetId))) {
            this.mFramesMap.put(Integer.valueOf(key.mTargetId), new ArrayList<>());
        }
        ArrayList<Key> arrayList = this.mFramesMap.get(Integer.valueOf(key.mTargetId));
        if (arrayList != null) {
            arrayList.add(key);
        }
    }

    public KeyFrames() {
    }

    public KeyFrames(Context context, XmlPullParser xmlPullParser) {
        Key key = null;
        try {
            int eventType = xmlPullParser.getEventType();
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (sKeyMakers.containsKey(name)) {
                        try {
                            Constructor<? extends Key> constructor = sKeyMakers.get(name);
                            if (constructor != null) {
                                Key newInstance = constructor.newInstance(new Object[0]);
                                try {
                                    newInstance.load(context, Xml.asAttributeSet(xmlPullParser));
                                    addKey(newInstance);
                                } catch (Exception unused) {
                                }
                                key = newInstance;
                            } else {
                                StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 23);
                                sb.append("Keymaker for ");
                                sb.append(name);
                                sb.append(" not found");
                                throw new NullPointerException(sb.toString());
                                break;
                            }
                        } catch (Exception unused2) {
                            continue;
                        }
                    } else if (name.equalsIgnoreCase("CustomAttribute")) {
                        if (key != null && key.mCustomConstraints != null) {
                            ConstraintAttribute.parse(context, xmlPullParser, key.mCustomConstraints);
                        }
                    } else if (name.equalsIgnoreCase("CustomMethod") && key != null && key.mCustomConstraints != null) {
                        ConstraintAttribute.parse(context, xmlPullParser, key.mCustomConstraints);
                    }
                } else if (eventType == 3) {
                    if (ViewTransition.KEY_FRAME_SET_TAG.equals(xmlPullParser.getName())) {
                        return;
                    }
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    public void addAllFrames(MotionController motionController) {
        ArrayList<Key> arrayList = this.mFramesMap.get(-1);
        if (arrayList != null) {
            motionController.addKeys(arrayList);
        }
    }

    public void addFrames(MotionController motionController) {
        ArrayList<Key> arrayList = this.mFramesMap.get(Integer.valueOf(motionController.mId));
        if (arrayList != null) {
            motionController.addKeys(arrayList);
        }
        ArrayList<Key> arrayList2 = this.mFramesMap.get(-1);
        if (arrayList2 != null) {
            Iterator<Key> it = arrayList2.iterator();
            while (it.hasNext()) {
                Key next = it.next();
                if (next.matches(((ConstraintLayout.LayoutParams) motionController.mView.getLayoutParams()).constraintTag)) {
                    motionController.addKey(next);
                }
            }
        }
    }

    static String name(int i, Context context) {
        return context.getResources().getResourceEntryName(i);
    }

    public Set<Integer> getKeys() {
        return this.mFramesMap.keySet();
    }

    public ArrayList<Key> getKeyFramesForView(int i) {
        return this.mFramesMap.get(Integer.valueOf(i));
    }
}
