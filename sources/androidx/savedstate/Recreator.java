package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.a;
import androidx.lifecycle.c;
import ivas.gov.bisp.enumeration.p027b.d;
import ivas.gov.bisp.enumeration.p082e.g;
import ivas.gov.bisp.enumeration.p091n.j;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedApi"})
final class Recreator implements a {
    public final g a;

    public static final class OooO00o implements b.aIh {
        public final Set<String> a = new HashSet();

        public OooO00o(b bVar) {
            bVar.c("androidx.savedstate.Restarter", this);
        }

        @Override // androidx.savedstate.b.aIh
        public final Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.a));
            return bundle;
        }
    }

    public Recreator(g gVar) {
        this.a = gVar;
    }

    @Override // androidx.lifecycle.a
    public final void a(d dVar, androidx.lifecycle.d.aLZ alz) {
        if (alz != androidx.lifecycle.d.aLZ.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        c cVar = (c) dVar.getLifecycle();
        cVar.i("removeObserver");
        cVar.a.g(this);
        Bundle bundleB = this.a.getSavedStateRegistry().b("androidx.savedstate.Restarter");
        if (bundleB == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleB.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        for (String str : stringArrayList) {
            try {
                Class<? extends U> clsAsSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(b.aMl.class);
                try {
                    Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(new Class[0]);
                    declaredConstructor.setAccessible(true);
                    try {
                        ((b.aMl) declaredConstructor.newInstance(new Object[0])).b(this.a);
                    } catch (Exception e) {
                        throw new RuntimeException(j.r("Failed to instantiate ", str), e);
                    }
                } catch (NoSuchMethodException e2) {
                    StringBuilder sbW = j.w("Class");
                    sbW.append(clsAsSubclass.getSimpleName());
                    sbW.append(" must have default constructor in order to be automatically recreated");
                    throw new IllegalStateException(sbW.toString(), e2);
                }
            } catch (ClassNotFoundException e3) {
                throw new RuntimeException(j.t("Class ", str, " wasn't found"), e3);
            }
        }
    }
}
