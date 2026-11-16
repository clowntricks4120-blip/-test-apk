package androidx.recyclerview.widget;

import ivas.gov.bisp.enumeration.OooOOoo.OooOO0O;
import ivas.gov.bisp.enumeration.OooOOoo.OooOOOO;
import ivas.gov.bisp.enumeration.p001aa.C0083p;
import ivas.gov.bisp.enumeration.p010aj.S;

/* JADX INFO: loaded from: classes.dex */
public class A {
    public final OooOOOO<RecyclerView.o0O0O00, aNm> a = new ivas.gov.bisp.enumeration.p001aa.t();
    public final OooOO0O<RecyclerView.o0O0O00> b = new C0083p();

    public interface aNj {
    }

    public static class aNm {
        public static S a = new S(20);
        public int b;
        public RecyclerView.OooOOOO.OooO0OO c;
        public RecyclerView.OooOOOO.OooO0OO d;

        public static aNm c() {
            aNm anm = (aNm) a.e();
            return anm == null ? new aNm() : anm;
        }

        public static void d(aNm anm) {
            anm.b = 0;
            anm.c = null;
            anm.d = null;
            a.g(anm);
        }
    }

    public void b(RecyclerView.o0O0O00 o0o0o00) {
        aNm anmC = (aNm) this.a.getOrDefault(o0o0o00, null);
        if (anmC == null) {
            anmC = aNm.c();
            this.a.put(o0o0o00, anmC);
        }
        anmC.b |= 1;
    }

    public void c(RecyclerView.o0O0O00 o0o0o00, RecyclerView.OooOOOO.OooO0OO oooO0OO) {
        aNm anmC = (aNm) this.a.getOrDefault(o0o0o00, null);
        if (anmC == null) {
            anmC = aNm.c();
            this.a.put(o0o0o00, anmC);
        }
        anmC.d = oooO0OO;
        anmC.b |= 8;
    }

    public void d(RecyclerView.o0O0O00 o0o0o00, RecyclerView.OooOOOO.OooO0OO oooO0OO) {
        aNm anmC = (aNm) this.a.getOrDefault(o0o0o00, null);
        if (anmC == null) {
            anmC = aNm.c();
            this.a.put(o0o0o00, anmC);
        }
        anmC.c = oooO0OO;
        anmC.b |= 4;
    }

    public boolean e(RecyclerView.o0O0O00 o0o0o00) {
        aNm anm = (aNm) this.a.getOrDefault(o0o0o00, null);
        return (anm == null || (anm.b & 1) == 0) ? false : true;
    }

    public void f(RecyclerView.o0O0O00 o0o0o00) {
        aNm anm = (aNm) this.a.getOrDefault(o0o0o00, null);
        if (anm == null) {
            return;
        }
        anm.b &= -2;
    }

    public final RecyclerView.OooOOOO.OooO0OO g(RecyclerView.o0O0O00 o0o0o00, int i) {
        aNm anm;
        RecyclerView.OooOOOO.OooO0OO oooO0OO;
        int i2 = this.a.i(o0o0o00);
        if (i2 >= 0 && (anm = (aNm) this.a.n(i2)) != null) {
            int i3 = anm.b;
            if ((i3 & i) != 0) {
                int i4 = (~i) & i3;
                anm.b = i4;
                if (i == 4) {
                    oooO0OO = anm.c;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    oooO0OO = anm.d;
                }
                if ((i4 & 12) == 0) {
                    this.a.l(i2);
                    aNm.d(anm);
                }
                return oooO0OO;
            }
        }
        return null;
    }

    public void h(RecyclerView.o0O0O00 o0o0o00) {
        for (int iK = this.b.k() - 1; iK >= 0; iK--) {
            if (o0o0o00 == this.b.c(iK)) {
                OooOO0O<RecyclerView.o0O0O00> oooOO0O = this.b;
                Object[] objArr = oooOO0O.f;
                Object obj = objArr[iK];
                Object obj2 = C0083p.c;
                if (obj == obj2) {
                    break;
                }
                objArr[iK] = obj2;
                oooOO0O.d = true;
                break;
            }
        }
        aNm anm = (aNm) this.a.remove(o0o0o00);
        if (anm != null) {
            aNm.d(anm);
        }
    }
}
