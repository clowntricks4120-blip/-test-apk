package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import ivas.gov.bisp.enumeration.OooOOOO.OooO0O0;
import ivas.gov.bisp.enumeration.p082e.g;
import ivas.gov.bisp.enumeration.p090m.c;
import ivas.gov.bisp.enumeration.p091n.j;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedApi"})
public final class b {
    public Bundle b;
    public boolean c;
    public Recreator.OooO00o d;
    public OooO0O0<String, aIh> a = new c();
    public boolean e = true;

    public interface aIh {
        Bundle b();
    }

    public interface aMl {
        void b(g gVar);
    }

    public final Bundle b(String str) {
        if (!this.c) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.b;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        this.b.remove(str);
        if (this.b.isEmpty()) {
            this.b = null;
        }
        return bundle2;
    }

    public final void c(String str, aIh aih) {
        if (((aIh) this.a.f(str, aih)) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public final void d(Class<? extends aMl> cls) {
        if (!this.e) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.d == null) {
            this.d = new Recreator.OooO00o(this);
        }
        try {
            cls.getDeclaredConstructor(new Class[0]);
            Recreator.OooO00o oooO00o = this.d;
            oooO00o.a.add(cls.getName());
        } catch (NoSuchMethodException e) {
            StringBuilder sbW = j.w("Class");
            sbW.append(cls.getSimpleName());
            sbW.append(" must have default constructor in order to be automatically recreated");
            throw new IllegalArgumentException(sbW.toString(), e);
        }
    }
}
