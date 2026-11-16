package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import ivas.gov.bisp.enumeration.p027b.H;
import ivas.gov.bisp.enumeration.p027b.ae;
import ivas.gov.bisp.enumeration.p027b.ak;
import ivas.gov.bisp.enumeration.p027b.ap;
import ivas.gov.bisp.enumeration.p027b.k;
import ivas.gov.bisp.enumeration.p027b.w;
import ivas.gov.bisp.enumeration.p100w.r;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class i extends H {
    public static final Class<?>[] a = {Application.class, ak.class};
    public static final Class<?>[] b = {ak.class};
    public final Application c;
    public final w d;
    public final Bundle e;
    public final androidx.savedstate.b f;
    public final d g;

    @SuppressLint({"LambdaLast"})
    public i(Application application, ivas.gov.bisp.enumeration.p082e.g gVar, Bundle bundle) {
        w wVar;
        this.f = gVar.getSavedStateRegistry();
        this.g = gVar.getLifecycle();
        this.e = bundle;
        this.c = application;
        if (application != null) {
            if (k.u == null) {
                k.u = new k(application);
            }
            wVar = k.u;
        } else {
            if (r.s == null) {
                r.s = new r();
            }
            wVar = r.s;
        }
        this.d = wVar;
    }

    public static <T> Constructor<T> e(Class<T> cls, Class<?>[] clsArr) {
        for (Object obj : cls.getConstructors()) {
            Constructor<T> constructor = (Constructor<T>) obj;
            if (Arrays.equals(clsArr, constructor.getParameterTypes())) {
                return constructor;
            }
        }
        return null;
    }

    @Override // ivas.gov.bisp.enumeration.p027b.H, ivas.gov.bisp.enumeration.p027b.w
    public final <T extends ap> T b(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) d(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // ivas.gov.bisp.enumeration.p027b.G
    public final void c(ap apVar) {
        SavedStateHandleController.b(apVar, this.f, this.g);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00c0 A[Catch: InvocationTargetException -> 0x00ba, InstantiationException -> 0x00bc, IllegalAccessException -> 0x00be, TryCatch #2 {IllegalAccessException -> 0x00be, InstantiationException -> 0x00bc, InvocationTargetException -> 0x00ba, blocks: (B:35:0x00a8, B:37:0x00ac, B:45:0x00ca, B:44:0x00c0), top: B:55:0x00a8 }] */
    @Override // ivas.gov.bisp.enumeration.p027b.H
    public final <T extends ap> T d(String str, Class<T> cls) {
        ak akVar;
        T t;
        boolean zIsAssignableFrom = ae.class.isAssignableFrom(cls);
        Constructor constructorE = (!zIsAssignableFrom || this.c == null) ? e(cls, b) : e(cls, a);
        if (constructorE == null) {
            return (T) this.d.b(cls);
        }
        androidx.savedstate.b bVar = this.f;
        d dVar = this.g;
        Bundle bundle = this.e;
        Bundle bundleB = bVar.b(str);
        Class[] clsArr = ak.c;
        if (bundleB == null && bundle == null) {
            akVar = new ak();
        } else {
            HashMap map = new HashMap();
            if (bundle != null) {
                for (String str2 : bundle.keySet()) {
                    map.put(str2, bundle.get(str2));
                }
            }
            if (bundleB == null) {
                akVar = new ak(map);
            } else {
                ArrayList parcelableArrayList = bundleB.getParcelableArrayList("keys");
                ArrayList parcelableArrayList2 = bundleB.getParcelableArrayList("values");
                if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                    throw new IllegalStateException("Invalid bundle passed as restored state");
                }
                for (int i = 0; i < parcelableArrayList.size(); i++) {
                    map.put((String) parcelableArrayList.get(i), parcelableArrayList2.get(i));
                }
                akVar = new ak(map);
            }
        }
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, akVar);
        savedStateHandleController.d(bVar, dVar);
        SavedStateHandleController.c(bVar, dVar);
        if (zIsAssignableFrom) {
            try {
                Application application = this.c;
                if (application != null) {
                    t = (T) constructorE.newInstance(application, akVar);
                } else {
                    t = (T) constructorE.newInstance(akVar);
                }
            } catch (IllegalAccessException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to access ");
                sb.append(cls);
                throw new RuntimeException(sb.toString(), e);
            } catch (InstantiationException e2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("A ");
                sb2.append(cls);
                sb2.append(" cannot be instantiated.");
                throw new RuntimeException(sb2.toString(), e2);
            } catch (InvocationTargetException e3) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("An exception happened in constructor of ");
                sb3.append(cls);
                throw new RuntimeException(sb3.toString(), e3.getCause());
            }
        } else {
            t = (T) constructorE.newInstance(akVar);
        }
        t.d("androidx.lifecycle.savedstate.vm.tag", savedStateHandleController);
        return t;
    }
}
