package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import ivas.gov.bisp.enumeration.O.r;
import ivas.gov.bisp.enumeration.p013am.P;
import ivas.gov.bisp.enumeration.p014an.as;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    public final as a;
    public final char[] b;
    public final aKx c = new aKx(1024);
    public final Typeface d;

    public f(Typeface typeface, as asVar) {
        this.d = typeface;
        this.a = asVar;
        this.b = new char[asVar.e() * 2];
        int iE = asVar.e();
        for (int i = 0; i < iE; i++) {
            P p = new P(this, i);
            Character.toChars(p.f(), this.b, i * 2);
            r.h(p.d() > 0, "invalid metadata codepoint length");
            this.c.c(p, 0, p.d() - 1);
        }
    }

    public static class aKx {
        public final SparseArray<aKx> a;
        public P b;

        public aKx() {
            this.a = new SparseArray<>(1);
        }

        public void c(P p, int i, int i2) {
            int iC = p.c(i);
            SparseArray<aKx> sparseArray = this.a;
            aKx akx = sparseArray == null ? null : sparseArray.get(iC);
            if (akx == null) {
                akx = new aKx();
                this.a.put(p.c(i), akx);
            }
            if (i2 > i) {
                akx.c(p, i + 1, i2);
            } else {
                akx.b = p;
            }
        }

        public aKx(int i) {
            this.a = new SparseArray<>(i);
        }
    }
}
