package ivas.gov.bisp.enumeration.p099u;

import android.view.View;
import android.view.animation.Interpolator;
import ivas.gov.bisp.enumeration.p081d.R;
import ivas.gov.bisp.enumeration.p081d.v;
import ivas.gov.bisp.enumeration.p100w.r;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class p {
    private static int a = 1;
    private static int b;
    public Interpolator e;
    public v f;
    public boolean h;
    public long d = -1;
    public final r g = new aRm();
    public final ArrayList<R> c = new ArrayList<>();

    public void c() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 93) + (i2 | 93);
        a = i3 % 128;
        int i4 = i3 % 2;
        if (!this.h) {
            int i5 = ((i2 & 15) - (~(i2 | 15))) - 1;
            a = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        Iterator<R> it = this.c.iterator();
        int i7 = a;
        int i8 = i7 & 115;
        int i9 = ((i7 ^ 115) | i8) << 1;
        int i10 = -((i7 | 115) & (~i8));
        int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
        b = i11 % 128;
        int i12 = i11 % 2;
        while (it.hasNext()) {
            int i13 = a;
            int i14 = (((i13 | 62) << 1) - (i13 ^ 62)) - 1;
            b = i14 % 128;
            int i15 = i14 % 2;
            it.next().d();
            int i16 = b;
            int i17 = (-2) - (((i16 ^ 68) + ((i16 & 68) << 1)) ^ (-1));
            a = i17 % 128;
            int i18 = i17 % 2;
        }
        this.h = false;
        int i19 = b + 15;
        a = i19 % 128;
        if (i19 % 2 == 0) {
            throw null;
        }
    }

    public class aRm extends r {
        private static int a = 1;
        private static int b;
        public boolean v = false;
        public int u = 0;

        public aRm() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
        
            r4.v = true;
            r0 = r4.w.f;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
        
            if (r0 == null) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
        
            r2 = ivas.gov.bisp.enumeration.u.p.aRm.a;
            r3 = ((r2 ^ 74) + ((r2 & 74) << 1)) - 1;
            ivas.gov.bisp.enumeration.u.p.aRm.b = r3 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
        
            if ((r3 % 2) != 0) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
        
            r0.c(null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
        
            r0.c(null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
        
            r0 = ivas.gov.bisp.enumeration.u.p.aRm.a + 13;
            ivas.gov.bisp.enumeration.u.p.aRm.b = r0 % 128;
            r0 = r0 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
        
            if (r4.v != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
        
            if (r4.v != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
        
            r0 = r0 + 83;
            ivas.gov.bisp.enumeration.u.p.aRm.b = r0 % 128;
            r0 = r0 % 2;
         */
        @Override // ivas.gov.bisp.enumeration.p100w.r, ivas.gov.bisp.enumeration.p081d.v
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void c(android.view.View r5) {
            /*
                r4 = this;
                r5 = 2
                int r0 = r5 % r5
                int r0 = ivas.gov.bisp.enumeration.u.p.aRm.b
                r1 = r0 & 77
                r0 = r0 ^ 77
                r0 = r0 | r1
                r2 = r1 ^ r0
                r0 = r0 & r1
                r1 = 1
                int r0 = r0 << r1
                int r2 = r2 + r0
                int r0 = r2 % 128
                ivas.gov.bisp.enumeration.u.p.aRm.a = r0
                int r2 = r2 % r5
                if (r2 != 0) goto L1f
                boolean r2 = r4.v
                r3 = 6
                int r3 = r3 / 0
                if (r2 == 0) goto L2b
                goto L23
            L1f:
                boolean r2 = r4.v
                if (r2 == 0) goto L2b
            L23:
                int r0 = r0 + 83
                int r1 = r0 % 128
                ivas.gov.bisp.enumeration.u.p.aRm.b = r1
                int r0 = r0 % r5
                return
            L2b:
                r4.v = r1
                ivas.gov.bisp.enumeration.u.p r0 = ivas.gov.bisp.enumeration.p099u.p.this
                ivas.gov.bisp.enumeration.d.v r0 = r0.f
                if (r0 == 0) goto L4e
                int r2 = ivas.gov.bisp.enumeration.u.p.aRm.a
                r3 = r2 ^ 74
                r2 = r2 & 74
                int r1 = r2 << 1
                int r3 = r3 + r1
                int r3 = r3 + (-1)
                int r1 = r3 % 128
                ivas.gov.bisp.enumeration.u.p.aRm.b = r1
                int r3 = r3 % r5
                r1 = 0
                if (r3 != 0) goto L4a
                r0.c(r1)
                goto L4e
            L4a:
                r0.c(r1)
                throw r1
            L4e:
                int r0 = ivas.gov.bisp.enumeration.u.p.aRm.a
                int r0 = r0 + 13
                int r1 = r0 % 128
                ivas.gov.bisp.enumeration.u.p.aRm.b = r1
                int r0 = r0 % r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.u.p.aRm.c(android.view.View):void");
        }

        @Override // ivas.gov.bisp.enumeration.p081d.v
        public void e(View view) {
            int i;
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = ((i3 | 11) << 1) - (i3 ^ 11);
            b = i4 % 128;
            if (i4 % 2 != 0) {
                i = this.u << 1;
            } else {
                int i5 = this.u;
                i = ((i5 & 1) << 1) + (i5 ^ 1);
            }
            this.u = i;
            int i6 = ((i3 | 7) << 1) - (i3 ^ 7);
            b = i6 % 128;
            if (i6 % 2 != 0) {
                p.this.c.size();
                throw null;
            }
            if (i == p.this.c.size()) {
                v vVar = p.this.f;
                if (vVar != null) {
                    int i7 = b;
                    int i8 = i7 & 67;
                    int i9 = -(-((i7 ^ 67) | i8));
                    int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
                    a = i10 % 128;
                    int i11 = i10 % 2;
                    vVar.e(null);
                    int i12 = b;
                    int i13 = i12 ^ 93;
                    int i14 = (((i12 & 93) | i13) << 1) - i13;
                    a = i14 % 128;
                    if (i14 % 2 == 0) {
                        int i15 = 5 % 2;
                    }
                }
                this.u = 0;
                this.v = false;
                p.this.h = false;
                int i16 = b;
                int i17 = (i16 ^ 65) + ((i16 & 65) << 1);
                a = i17 % 128;
                int i18 = i17 % 2;
            }
            int i19 = b;
            int i20 = (((i19 & (-18)) | ((~i19) & 17)) - (~((i19 & 17) << 1))) - 1;
            a = i20 % 128;
            if (i20 % 2 == 0) {
                throw null;
            }
        }
    }

    public void d() {
        int i = 2 % 2;
        int i2 = (-2) - ((b + 62) ^ (-1));
        int i3 = i2 % 128;
        a = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this.h) {
            int i4 = ((i3 ^ 5) | (i3 & 5)) << 1;
            int i5 = -(((~i3) & 5) | (i3 & (-6)));
            int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
            b = i6 % 128;
            int i7 = i6 % 2;
            return;
        }
        int i8 = b + 105;
        a = i8 % 128;
        int i9 = i8 % 2;
        for (R r : this.c) {
            int i10 = b + 105;
            a = i10 % 128;
            int i11 = i10 % 2;
            long j = this.d;
            int i12 = b;
            int i13 = i12 ^ 81;
            int i14 = (((i12 & 81) | i13) << 1) - i13;
            a = i14 % 128;
            int i15 = i14 % 2;
            if (j >= 0) {
                int i16 = (i12 & (-24)) | ((~i12) & 23);
                int i17 = -(-((i12 & 23) << 1));
                int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
                a = i18 % 128;
                int i19 = i18 % 2;
                r.e(j);
                int i20 = a + 35;
                b = i20 % 128;
                int i21 = i20 % 2;
            }
            Interpolator interpolator = this.e;
            if (interpolator != null) {
                int i22 = a;
                int i23 = i22 & 121;
                int i24 = (i22 ^ 121) | i23;
                int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
                b = i25 % 128;
                if (i25 % 2 != 0) {
                    r.c.get();
                    throw null;
                }
                View view = r.c.get();
                if (view != null) {
                    view.animate().setInterpolator(interpolator);
                    int i26 = b;
                    int i27 = ((i26 & 94) + (i26 | 94)) - 1;
                    a = i27 % 128;
                    int i28 = i27 % 2;
                }
            }
            if (this.f != null) {
                int i29 = b + 13;
                a = i29 % 128;
                int i30 = i29 % 2;
                r.f(this.g);
                int i31 = b;
                int i32 = i31 & 31;
                int i33 = i32 + ((i31 ^ 31) | i32);
                a = i33 % 128;
                int i34 = i33 % 2;
            }
            View view2 = r.c.get();
            int i35 = b;
            int i36 = (i35 ^ 35) + ((i35 & 35) << 1);
            int i37 = i36 % 128;
            a = i37;
            if (i36 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (view2 != null) {
                int i38 = i37 ^ 11;
                int i39 = ((((i37 & 11) | i38) << 1) - (~(-i38))) - 1;
                b = i39 % 128;
                if (i39 % 2 != 0) {
                    view2.animate().start();
                    obj.hashCode();
                    throw null;
                }
                view2.animate().start();
                int i40 = b + 18;
                int i41 = (i40 ^ (-1)) + (i40 << 1);
                a = i41 % 128;
                int i42 = i41 % 2;
            }
        }
        this.h = true;
        int i43 = b;
        int i44 = i43 & 1;
        int i45 = (i43 ^ 1) | i44;
        int i46 = (i44 ^ i45) + ((i45 & i44) << 1);
        a = i46 % 128;
        if (i46 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
