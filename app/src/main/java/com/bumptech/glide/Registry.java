package com.bumptech.glide;

import androidx.core.util.Pools;
import com.bumptech.glide.load.ImageHeaderParser;
import defpackage.cv;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class Registry {
    private final fy c;
    private final Pools.Pool<List<Throwable>> j;
    private final jt h = new jt();
    private final js i = new js();
    public final jq a = new jq();
    private final ju d = new ju();
    public final jv b = new jv();
    private final cw e = new cw();
    private final ip f = new ip();
    private final jr g = new jr();

    public Registry() {
        Pools.Pool<List<Throwable>> a = lh.a();
        this.j = a;
        this.c = new fy(a);
        a(Arrays.asList("Animation", "Bitmap", "BitmapDrawable"));
    }

    public final <Data> Registry a(Class<Data> cls, ci<Data> ciVar) {
        this.a.a(cls, ciVar);
        return this;
    }

    public final <Data, TResource> Registry a(Class<Data> cls, Class<TResource> cls2, co<Data, TResource> coVar) {
        a("legacy_append", cls, cls2, coVar);
        return this;
    }

    public final <Data, TResource> Registry a(String str, Class<Data> cls, Class<TResource> cls2, co<Data, TResource> coVar) {
        this.d.a(str, coVar, cls, cls2);
        return this;
    }

    private Registry a(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.add("legacy_prepend_all");
        for (String str : list) {
            arrayList.add(str);
        }
        arrayList.add("legacy_append");
        this.d.a(arrayList);
        return this;
    }

    public final <TResource> Registry a(Class<TResource> cls, cp<TResource> cpVar) {
        this.b.a(cls, cpVar);
        return this;
    }

    public final Registry a(cv.a<?> aVar) {
        this.e.a(aVar);
        return this;
    }

    public final <TResource, Transcode> Registry a(Class<TResource> cls, Class<Transcode> cls2, io<TResource, Transcode> ioVar) {
        this.f.a(cls, cls2, ioVar);
        return this;
    }

    public final Registry a(ImageHeaderParser imageHeaderParser) {
        this.g.a(imageHeaderParser);
        return this;
    }

    public final <Model, Data> Registry a(Class<Model> cls, Class<Data> cls2, fx<Model, Data> fxVar) {
        this.c.a(cls, cls2, fxVar);
        return this;
    }

    public final <Data, TResource, Transcode> ec<Data, TResource, Transcode> a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        ec<Data, TResource, Transcode> a = this.i.a(cls, cls2, cls3);
        if (js.a(a)) {
            return null;
        }
        if (a == null) {
            ArrayList arrayList = new ArrayList();
            for (Class cls4 : this.d.b(cls, cls2)) {
                for (Class cls5 : this.f.b(cls4, cls3)) {
                    arrayList.add(new ds(cls, cls4, cls5, this.d.a(cls, cls4), this.f.a(cls4, cls5), this.j));
                }
            }
            a = arrayList.isEmpty() ? null : new ec<>(cls, cls2, cls3, arrayList, this.j);
            js jsVar = this.i;
            synchronized (jsVar.b) {
                jsVar.b.put(new le(cls, cls2, cls3), a != null ? a : js.a);
            }
        }
        return a;
    }

    public final <Model, TResource, Transcode> List<Class<?>> b(Class<Model> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        List<Class<?>> a = this.h.a(cls, cls2, cls3);
        if (a == null) {
            a = new ArrayList<>();
            for (Class<?> cls4 : this.c.a(cls)) {
                for (Class<?> cls5 : this.d.b(cls4, cls2)) {
                    if (!this.f.b(cls5, cls3).isEmpty() && !a.contains(cls5)) {
                        a.add(cls5);
                    }
                }
            }
            jt jtVar = this.h;
            List<Class<?>> unmodifiableList = Collections.unmodifiableList(a);
            synchronized (jtVar.a) {
                jtVar.a.put(new le(cls, cls2, cls3), unmodifiableList);
            }
        }
        return a;
    }

    public final <X> cv<X> a(X x) {
        return this.e.a((cw) x);
    }

    public final <Model> List<fw<Model, ?>> b(Model model) {
        List b = this.c.b(model.getClass());
        if (b.isEmpty()) {
            throw new NoModelLoaderAvailableException(model);
        }
        int size = b.size();
        List<fw<Model, ?>> emptyList = Collections.emptyList();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            fw<Model, ?> fwVar = (fw) b.get(i);
            if (fwVar.a(model)) {
                if (z) {
                    emptyList = new ArrayList<>(size - i);
                    z = false;
                }
                emptyList.add(fwVar);
            }
        }
        if (emptyList.isEmpty()) {
            throw new NoModelLoaderAvailableException(model, b);
        }
        return emptyList;
    }

    public final List<ImageHeaderParser> a() {
        List<ImageHeaderParser> a = this.g.a();
        if (!a.isEmpty()) {
            return a;
        }
        throw new NoImageHeaderParserException();
    }

    /* loaded from: classes.dex */
    public static class NoModelLoaderAvailableException extends MissingComponentException {
        public NoModelLoaderAvailableException(Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public <M> NoModelLoaderAvailableException(M m, List<fw<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m);
        }

        public NoModelLoaderAvailableException(Class<?> cls, Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }

    /* loaded from: classes.dex */
    public static class NoResultEncoderAvailableException extends MissingComponentException {
        public NoResultEncoderAvailableException(Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    /* loaded from: classes.dex */
    public static class NoSourceEncoderAvailableException extends MissingComponentException {
        public NoSourceEncoderAvailableException(Class<?> cls) {
            super("Failed to find source encoder for data class: ".concat(String.valueOf(cls)));
        }
    }

    /* loaded from: classes.dex */
    public static class MissingComponentException extends RuntimeException {
        public MissingComponentException(String str) {
            super(str);
        }
    }

    /* loaded from: classes.dex */
    public static final class NoImageHeaderParserException extends MissingComponentException {
        public NoImageHeaderParserException() {
            super("Failed to find image header parser.");
        }
    }
}
