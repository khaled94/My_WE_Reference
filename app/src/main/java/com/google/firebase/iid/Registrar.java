package com.google.firebase.iid;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class Registrar implements cmf {

    /* loaded from: classes.dex */
    public static class a implements cmw {
        private final FirebaseInstanceId a;

        public a(FirebaseInstanceId firebaseInstanceId) {
            this.a = firebaseInstanceId;
        }
    }

    @Override // defpackage.cmf
    public final List<clz<?>> getComponents() {
        return Arrays.asList(clz.a(FirebaseInstanceId.class).a(cml.a(cgw.class)).a(cml.a(cmt.class)).a(cml.a(cpn.class)).a(cnk.a).a(1).a(), clz.a(cmw.class).a(cml.a(FirebaseInstanceId.class)).a(cnl.a).a());
    }
}
