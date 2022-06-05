package io.realm.internal;

import defpackage.dlh;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class RealmNotifier implements Closeable {
    private OsSharedRealm sharedRealm;
    private dlh<a> realmObserverPairs = new dlh<>();
    private final dlh.a<a> onChangeCallBack = new dlh.a<a>() { // from class: io.realm.internal.RealmNotifier.1
        @Override // defpackage.dlh.a
        public final /* synthetic */ void a(a aVar) {
            if (RealmNotifier.this.sharedRealm != null) {
                RealmNotifier.this.sharedRealm.isClosed();
            }
        }
    };
    private List<Runnable> transactionCallbacks = new ArrayList();
    private List<Runnable> startSendingNotificationsCallbacks = new ArrayList();
    private List<Runnable> finishedSendingNotificationsCallbacks = new ArrayList();

    public abstract boolean post(Runnable runnable);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class a<T> extends dlh.b<T, dkr<T>> {
        public a(T t, dkr<T> dkrVar) {
            super(t, dkrVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public RealmNotifier(OsSharedRealm osSharedRealm) {
        this.sharedRealm = osSharedRealm;
    }

    void didChange() {
        this.realmObserverPairs.a(this.onChangeCallBack);
        if (!this.transactionCallbacks.isEmpty()) {
            List<Runnable> list = this.transactionCallbacks;
            this.transactionCallbacks = new ArrayList();
            for (Runnable runnable : list) {
                runnable.run();
            }
        }
    }

    void beforeNotify() {
        this.sharedRealm.invalidateIterators();
    }

    void willSendNotifications() {
        for (int i = 0; i < this.startSendingNotificationsCallbacks.size(); i++) {
            this.startSendingNotificationsCallbacks.get(i).run();
        }
    }

    void didSendNotifications() {
        for (int i = 0; i < this.startSendingNotificationsCallbacks.size(); i++) {
            this.finishedSendingNotificationsCallbacks.get(i).run();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        removeAllChangeListeners();
        this.startSendingNotificationsCallbacks.clear();
        this.finishedSendingNotificationsCallbacks.clear();
    }

    public <T> void addChangeListener(T t, dkr<T> dkrVar) {
        this.realmObserverPairs.a((dlh<a>) new a(t, dkrVar));
    }

    public <E> void removeChangeListener(E e, dkr<E> dkrVar) {
        this.realmObserverPairs.a(e, dkrVar);
    }

    public <E> void removeChangeListeners(E e) {
        this.realmObserverPairs.a(e);
    }

    private void removeAllChangeListeners() {
        dlh<a> dlhVar = this.realmObserverPairs;
        dlhVar.b = true;
        dlhVar.a.clear();
    }

    public void addTransactionCallback(Runnable runnable) {
        this.transactionCallbacks.add(runnable);
    }

    public int getListenersListSize() {
        return this.realmObserverPairs.a.size();
    }

    public void addBeginSendingNotificationsCallback(Runnable runnable) {
        this.startSendingNotificationsCallbacks.add(runnable);
    }

    public void addFinishedSendingNotificationsCallback(Runnable runnable) {
        this.finishedSendingNotificationsCallbacks.add(runnable);
    }
}
