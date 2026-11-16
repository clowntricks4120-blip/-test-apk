package androidx.lifecycle;

import android.view.View;
import ivas.gov.bisp.enumeration.F.L;
import ivas.gov.bisp.enumeration.OoooOoO.o00;
import ivas.gov.bisp.enumeration.p096p.j;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class LiveData<T> {
    public static final Object a = new Object();
    public boolean b;
    public final Object c = new Object();
    public ivas.gov.bisp.enumeration.OooOOOO.OooO0O0<o00<? super T>, LiveData<T>.OooO0O0> d = new ivas.gov.bisp.enumeration.p090m.c();
    public int e = 0;
    public boolean f;
    public volatile Object g;
    public volatile Object h;
    public int i;
    public boolean j;

    public class LifecycleBoundObserver extends OooO0O0 implements a {
        public final /* synthetic */ LiveData e;
        public final ivas.gov.bisp.enumeration.p027b.d f;

        @Override // androidx.lifecycle.a
        public void a(ivas.gov.bisp.enumeration.p027b.d dVar, d.aLZ alz) {
            d.aMa ama = ((c) this.f.getLifecycle()).b;
            if (ama == d.aMa.DESTROYED) {
                this.e.i(this.a);
                return;
            }
            d.aMa ama2 = null;
            while (ama2 != ama) {
                c(d());
                ama2 = ama;
                ama = ((c) this.f.getLifecycle()).b;
            }
        }

        @Override // androidx.lifecycle.LiveData.OooO0O0
        public void b() {
            c cVar = (c) this.f.getLifecycle();
            cVar.i("removeObserver");
            cVar.a.g(this);
        }

        @Override // androidx.lifecycle.LiveData.OooO0O0
        public boolean d() {
            return ((c) this.f.getLifecycle()).b.compareTo(d.aMa.STARTED) >= 0;
        }
    }

    public class OooO00o extends OooO0O0 {
        public OooO00o(LiveData liveData, o00<? super T> o00Var) {
            super(o00Var);
        }

        @Override // androidx.lifecycle.LiveData.OooO0O0
        public boolean d() {
            return true;
        }
    }

    public abstract class OooO0O0 {
        public final o00<? super T> a;
        public boolean b;
        public int c = -1;

        public OooO0O0(o00<? super T> o00Var) {
            this.a = o00Var;
        }

        public void b() {
        }

        public void c(boolean z) {
            if (z == this.b) {
                return;
            }
            this.b = z;
            LiveData liveData = LiveData.this;
            int i = z ? 1 : -1;
            int i2 = liveData.e;
            liveData.e = i + i2;
            if (!liveData.f) {
                liveData.f = true;
                while (true) {
                    try {
                        int i3 = liveData.e;
                        if (i2 == i3) {
                            break;
                        }
                        boolean z2 = i2 == 0 && i3 > 0;
                        boolean z3 = i2 > 0 && i3 == 0;
                        if (z2) {
                            liveData.h();
                        } else if (z3) {
                            liveData.g();
                        }
                        i2 = i3;
                    } catch (Throwable th) {
                        liveData.f = false;
                        throw th;
                    }
                }
                liveData.f = false;
            }
            if (this.b) {
                LiveData.this.e(this);
            }
        }

        public abstract boolean d();
    }

    public LiveData() {
        Object obj = a;
        this.g = obj;
        this.h = obj;
        this.i = -1;
    }

    public static void c(String str) {
        if (!j.bx().az()) {
            throw new IllegalStateException(ivas.gov.bisp.enumeration.p091n.j.t("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void d(LiveData<T>.OooO0O0 oooO0O0) {
        if (oooO0O0.b) {
            if (!oooO0O0.d()) {
                oooO0O0.c(false);
                return;
            }
            int i = oooO0O0.c;
            int i2 = this.i;
            if (i >= i2) {
                return;
            }
            oooO0O0.c = i2;
            L.aYZ ayz = oooO0O0.a;
            Object obj = this.h;
            L.aYZ ayz2 = ayz;
            Objects.requireNonNull(ayz2);
            if (((ivas.gov.bisp.enumeration.p027b.d) obj) == null || !L.access$200(L.this)) {
                return;
            }
            View viewRequireView = L.this.requireView();
            if (viewRequireView.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            if (L.access$000(L.this) != null) {
                if (androidx.fragment.app.h.b(3)) {
                    Objects.toString(L.access$000(L.this));
                }
                L.access$000(L.this).setContentView(viewRequireView);
            }
        }
    }

    public void e(LiveData<T>.OooO0O0 oooO0O0) {
        if (this.j) {
            this.b = true;
            return;
        }
        this.j = true;
        do {
            this.b = false;
            if (oooO0O0 != null) {
                d(oooO0O0);
                oooO0O0 = null;
            } else {
                ivas.gov.bisp.enumeration.m.c.aTk atkE = this.d.e();
                while (atkE.hasNext()) {
                    d((OooO0O0) ((Map.Entry) atkE.next()).getValue());
                    if (this.b) {
                        break;
                    }
                }
            }
        } while (this.b);
        this.j = false;
    }

    public void f(o00<? super T> o00Var) {
        c("observeForever");
        OooO00o oooO00o = new OooO00o(this, o00Var);
        OooO0O0 oooO0O0 = (OooO0O0) this.d.f(o00Var, oooO00o);
        if (oooO0O0 instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (oooO0O0 != null) {
            return;
        }
        oooO00o.c(true);
    }

    public void g() {
    }

    public void h() {
    }

    public void i(o00<? super T> o00Var) {
        c("removeObserver");
        OooO0O0 oooO0O0 = (OooO0O0) this.d.g(o00Var);
        if (oooO0O0 == null) {
            return;
        }
        oooO0O0.b();
        oooO0O0.c(false);
    }
}
