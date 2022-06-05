package defpackage;

/* renamed from: dt  reason: default package */
/* loaded from: classes2.dex */
public abstract class dt {
    public static final dt a = new dt() { // from class: dt.1
        @Override // defpackage.dt
        public final boolean a() {
            return true;
        }

        @Override // defpackage.dt
        public final boolean b() {
            return true;
        }

        @Override // defpackage.dt
        public final boolean a(cf cfVar) {
            return cfVar == cf.REMOTE;
        }

        @Override // defpackage.dt
        public final boolean a(boolean z, cf cfVar, ch chVar) {
            return (cfVar == cf.RESOURCE_DISK_CACHE || cfVar == cf.MEMORY_CACHE) ? false : true;
        }
    };
    public static final dt b = new dt() { // from class: dt.2
        @Override // defpackage.dt
        public final boolean a() {
            return false;
        }

        @Override // defpackage.dt
        public final boolean a(cf cfVar) {
            return false;
        }

        @Override // defpackage.dt
        public final boolean a(boolean z, cf cfVar, ch chVar) {
            return false;
        }

        @Override // defpackage.dt
        public final boolean b() {
            return false;
        }
    };
    public static final dt c = new dt() { // from class: dt.3
        @Override // defpackage.dt
        public final boolean a() {
            return false;
        }

        @Override // defpackage.dt
        public final boolean a(boolean z, cf cfVar, ch chVar) {
            return false;
        }

        @Override // defpackage.dt
        public final boolean b() {
            return true;
        }

        @Override // defpackage.dt
        public final boolean a(cf cfVar) {
            return (cfVar == cf.DATA_DISK_CACHE || cfVar == cf.MEMORY_CACHE) ? false : true;
        }
    };
    public static final dt d = new dt() { // from class: dt.4
        @Override // defpackage.dt
        public final boolean a() {
            return true;
        }

        @Override // defpackage.dt
        public final boolean a(cf cfVar) {
            return false;
        }

        @Override // defpackage.dt
        public final boolean b() {
            return false;
        }

        @Override // defpackage.dt
        public final boolean a(boolean z, cf cfVar, ch chVar) {
            return (cfVar == cf.RESOURCE_DISK_CACHE || cfVar == cf.MEMORY_CACHE) ? false : true;
        }
    };
    public static final dt e = new dt() { // from class: dt.5
        @Override // defpackage.dt
        public final boolean a() {
            return true;
        }

        @Override // defpackage.dt
        public final boolean b() {
            return true;
        }

        @Override // defpackage.dt
        public final boolean a(cf cfVar) {
            return cfVar == cf.REMOTE;
        }

        @Override // defpackage.dt
        public final boolean a(boolean z, cf cfVar, ch chVar) {
            return ((z && cfVar == cf.DATA_DISK_CACHE) || cfVar == cf.LOCAL) && chVar == ch.TRANSFORMED;
        }
    };

    public abstract boolean a();

    public abstract boolean a(cf cfVar);

    public abstract boolean a(boolean z, cf cfVar, ch chVar);

    public abstract boolean b();
}
