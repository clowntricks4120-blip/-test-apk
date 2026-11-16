package ivas.gov.bisp.enumeration.bM;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.emoji2.text.b;
import ivas.gov.bisp.enumeration.O.r;

/* JADX INFO: loaded from: classes.dex */
public final class V {
    private static int a = 0;
    private static int b = 1;
    public final bxH c;

    public static class bxH {
        private static int a = 0;
        private static int b = 1;

        public InputFilter[] c(InputFilter[] inputFilterArr) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 & (-30)) | ((~i2) & 29);
            int i4 = -(-((i2 & 29) << 1));
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            a = i5 % 128;
            int i6 = i5 % 2;
            throw null;
        }

        public void d(boolean z) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 ^ 31;
            int i4 = ((i2 & 31) | i3) << 1;
            int i5 = -i3;
            int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
            b = i6 % 128;
            int i7 = i6 % 2;
            throw null;
        }

        public void e(boolean z) {
            int i = 2 % 2;
            int i2 = b + 35;
            a = i2 % 128;
            int i3 = i2 % 2;
            throw null;
        }
    }

    public static class bxJ extends bxH {
        private static int a = 1;
        private static int b;
        public final bxI c;

        public bxJ(TextView textView) {
            this.c = new bxI(textView);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0044, code lost:
        
            if ((r1 % 2) == 0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0046, code lost:
        
            r0 = 61 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x004a, code lost:
        
            return r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
        
            r5 = r4.c.c(r5);
            r1 = ivas.gov.bisp.enumeration.bM.V.bxJ.a;
            r2 = r1 ^ 15;
            r1 = (r1 & 15) << 1;
            r3 = (r2 & r1) + (r1 | r2);
            ivas.gov.bisp.enumeration.bM.V.bxJ.b = r3 % 128;
            r3 = r3 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0062, code lost:
        
            return r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
        
            if (f() != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
        
            if (f() != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
        
            r1 = ivas.gov.bisp.enumeration.bM.V.bxJ.b;
            r2 = r1 ^ 63;
            r1 = ((r1 & 63) | r2) << 1;
            r2 = -r2;
            r3 = (r1 ^ r2) + ((r1 & r2) << 1);
            r1 = r3 % 128;
            ivas.gov.bisp.enumeration.bM.V.bxJ.a = r1;
            r3 = r3 % 2;
            r1 = (-2) - (((r1 ^ 52) + ((r1 & 52) << 1)) ^ (-1));
            ivas.gov.bisp.enumeration.bM.V.bxJ.b = r1 % 128;
         */
        @Override // ivas.gov.bisp.enumeration.bM.V.bxH
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public android.text.InputFilter[] c(android.text.InputFilter[] r5) {
            /*
                r4 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = ivas.gov.bisp.enumeration.bM.V.bxJ.a
                int r1 = r1 + 95
                int r2 = r1 % 128
                ivas.gov.bisp.enumeration.bM.V.bxJ.b = r2
                int r1 = r1 % r0
                if (r1 == 0) goto L19
                boolean r1 = r4.f()
                r2 = 86
                int r2 = r2 / 0
                if (r1 == 0) goto L4b
                goto L1f
            L19:
                boolean r1 = r4.f()
                if (r1 == 0) goto L4b
            L1f:
                int r1 = ivas.gov.bisp.enumeration.bM.V.bxJ.b
                r2 = r1 ^ 63
                r1 = r1 & 63
                r1 = r1 | r2
                int r1 = r1 << 1
                int r2 = -r2
                r3 = r1 ^ r2
                r1 = r1 & r2
                int r1 = r1 << 1
                int r3 = r3 + r1
                int r1 = r3 % 128
                ivas.gov.bisp.enumeration.bM.V.bxJ.a = r1
                int r3 = r3 % r0
                r2 = r1 ^ 52
                r1 = r1 & 52
                int r1 = r1 << 1
                int r2 = r2 + r1
                r1 = r2 ^ (-1)
                int r1 = (-2) - r1
                int r2 = r1 % 128
                ivas.gov.bisp.enumeration.bM.V.bxJ.b = r2
                int r1 = r1 % r0
                if (r1 == 0) goto L4a
                r0 = 61
                int r0 = r0 / 0
            L4a:
                return r5
            L4b:
                ivas.gov.bisp.enumeration.bM.V$bxI r1 = r4.c
                android.text.InputFilter[] r5 = r1.c(r5)
                int r1 = ivas.gov.bisp.enumeration.bM.V.bxJ.a
                r2 = r1 ^ 15
                r1 = r1 & 15
                int r1 = r1 << 1
                r3 = r2 & r1
                r1 = r1 | r2
                int r3 = r3 + r1
                int r1 = r3 % 128
                ivas.gov.bisp.enumeration.bM.V.bxJ.b = r1
                int r3 = r3 % r0
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.bM.V.bxJ.c(android.text.InputFilter[]):android.text.InputFilter[]");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final boolean f() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 75;
            int i4 = ((i2 | 75) & (~i3)) + (i3 << 1);
            b = i4 % 128;
            int i5 = i4 % 2;
            boolean zD = b.d();
            if (i5 == 0) {
                return ((~(zD ? 1 : 0)) & 1) ^ ((zD ? 1 : 0) & (-2));
            }
            int i6 = !zD ? 1 : 0;
            int i7 = (zD ? 1 : 0) & 1;
            return (i7 & i6) | (i6 ^ i7);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
        
            if ((r1 % 2) != 0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
        
            r1 = r5.c;
            java.util.Objects.requireNonNull(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
        
            if (r6 == false) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
        
            r6 = ivas.gov.bisp.enumeration.bM.V.bxJ.a;
            r3 = r6 & 107;
            r6 = -(-((r6 ^ 107) | r3));
            r4 = (r3 & r6) + (r6 | r3);
            ivas.gov.bisp.enumeration.bM.V.bxJ.b = r4 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
        
            if ((r4 % 2) != 0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
        
            r1.f();
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
        
            r1.f();
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
        
            r6 = ivas.gov.bisp.enumeration.bM.V.bxJ.b;
            r1 = (((r6 ^ 67) | (r6 & 67)) << 1) - (((~r6) & 67) | (r6 & (-68)));
            ivas.gov.bisp.enumeration.bM.V.bxJ.a = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
        
            if (f() != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
        
            if (f() != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
        
            r6 = ivas.gov.bisp.enumeration.bM.V.bxJ.a;
            r1 = (r6 ^ 23) + ((r6 & 23) << 1);
            ivas.gov.bisp.enumeration.bM.V.bxJ.b = r1 % 128;
         */
        @Override // ivas.gov.bisp.enumeration.bM.V.bxH
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void d(boolean r6) {
            /*
                r5 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = ivas.gov.bisp.enumeration.bM.V.bxJ.a
                int r1 = r1 + 83
                int r2 = r1 % 128
                ivas.gov.bisp.enumeration.bM.V.bxJ.b = r2
                int r1 = r1 % r0
                r2 = 0
                if (r1 == 0) goto L1a
                boolean r1 = r5.f()
                r3 = 94
                int r3 = r3 / 0
                if (r1 == 0) goto L32
                goto L20
            L1a:
                boolean r1 = r5.f()
                if (r1 == 0) goto L32
            L20:
                int r6 = ivas.gov.bisp.enumeration.bM.V.bxJ.a
                r1 = r6 ^ 23
                r6 = r6 & 23
                int r6 = r6 << 1
                int r1 = r1 + r6
                int r6 = r1 % 128
                ivas.gov.bisp.enumeration.bM.V.bxJ.b = r6
                int r1 = r1 % r0
                if (r1 != 0) goto L31
                return
            L31:
                throw r2
            L32:
                ivas.gov.bisp.enumeration.bM.V$bxI r1 = r5.c
                java.util.Objects.requireNonNull(r1)
                if (r6 == 0) goto L55
                int r6 = ivas.gov.bisp.enumeration.bM.V.bxJ.a
                r3 = r6 & 107(0x6b, float:1.5E-43)
                r6 = r6 ^ 107(0x6b, float:1.5E-43)
                r6 = r6 | r3
                int r6 = -r6
                int r6 = -r6
                r4 = r3 & r6
                r6 = r6 | r3
                int r4 = r4 + r6
                int r6 = r4 % 128
                ivas.gov.bisp.enumeration.bM.V.bxJ.b = r6
                int r4 = r4 % r0
                if (r4 != 0) goto L51
                r1.f()
                goto L55
            L51:
                r1.f()
                throw r2
            L55:
                int r6 = ivas.gov.bisp.enumeration.bM.V.bxJ.b
                r1 = r6 ^ 67
                r2 = r6 & 67
                r1 = r1 | r2
                int r1 = r1 << 1
                r2 = r6 & (-68)
                int r6 = ~r6
                r6 = r6 & 67
                r6 = r6 | r2
                int r1 = r1 - r6
                int r6 = r1 % 128
                ivas.gov.bisp.enumeration.bM.V.bxJ.a = r6
                int r1 = r1 % r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.bM.V.bxJ.d(boolean):void");
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0042, code lost:
        
            if ((r4 % 2) != 0) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0044, code lost:
        
            r6.c.e = r7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
        
            r6.c.e = r7;
            r2.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
        
            r1 = r6.c;
            r1.e = r7;
            r1.f();
            r7 = ivas.gov.bisp.enumeration.bM.V.bxJ.b;
            r3 = ((r7 | 17) << 1) - (r7 ^ 17);
            ivas.gov.bisp.enumeration.bM.V.bxJ.a = r3 % 128;
            r3 = r3 % 2;
            r7 = r1.c.getFilters();
            r3 = r1.c;
            r4 = ivas.gov.bisp.enumeration.bM.V.bxJ.b + 31;
            ivas.gov.bisp.enumeration.bM.V.bxJ.a = r4 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0077, code lost:
        
            if ((r4 % 2) != 0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0079, code lost:
        
            r3.setFilters(r1.c(r7));
            r7 = 32 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0085, code lost:
        
            r3.setFilters(r1.c(r7));
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x008c, code lost:
        
            r7 = ivas.gov.bisp.enumeration.bM.V.bxJ.a;
            r1 = ((r7 | 104) << 1) - (r7 ^ 104);
            r7 = (r1 ^ (-1)) + (r1 << 1);
            ivas.gov.bisp.enumeration.bM.V.bxJ.b = r7 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x009f, code lost:
        
            if ((r7 % 2) != 0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x00a1, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x00a2, code lost:
        
            r2.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00a5, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
        
            if (f() != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
        
            if (f() != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
        
            r1 = ivas.gov.bisp.enumeration.bM.V.bxJ.a;
            r3 = ((r1 ^ 53) | (r1 & 53)) << 1;
            r1 = -(((~r1) & 53) | (r1 & (-54)));
            r4 = ((r3 | r1) << 1) - (r1 ^ r3);
            ivas.gov.bisp.enumeration.bM.V.bxJ.b = r4 % 128;
         */
        @Override // ivas.gov.bisp.enumeration.bM.V.bxH
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void e(boolean r7) {
            /*
                r6 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = ivas.gov.bisp.enumeration.bM.V.bxJ.a
                r2 = r1 ^ 1
                r1 = r1 & 1
                r1 = r1 | r2
                int r1 = r1 << 1
                int r1 = r1 - r2
                int r2 = r1 % 128
                ivas.gov.bisp.enumeration.bM.V.bxJ.b = r2
                int r1 = r1 % r0
                r2 = 0
                if (r1 == 0) goto L20
                boolean r1 = r6.f()
                r3 = 89
                int r3 = r3 / 0
                if (r1 == 0) goto L51
                goto L26
            L20:
                boolean r1 = r6.f()
                if (r1 == 0) goto L51
            L26:
                int r1 = ivas.gov.bisp.enumeration.bM.V.bxJ.a
                r3 = r1 ^ 53
                r4 = r1 & 53
                r3 = r3 | r4
                int r3 = r3 << 1
                r4 = r1 & (-54)
                int r1 = ~r1
                r5 = 53
                r1 = r1 & r5
                r1 = r1 | r4
                int r1 = -r1
                r4 = r3 | r1
                int r4 = r4 << 1
                r1 = r1 ^ r3
                int r4 = r4 - r1
                int r1 = r4 % 128
                ivas.gov.bisp.enumeration.bM.V.bxJ.b = r1
                int r4 = r4 % r0
                if (r4 != 0) goto L49
                ivas.gov.bisp.enumeration.bM.V$bxI r0 = r6.c
                r0.e = r7
                return
            L49:
                ivas.gov.bisp.enumeration.bM.V$bxI r0 = r6.c
                r0.e = r7
                r2.hashCode()
                throw r2
            L51:
                ivas.gov.bisp.enumeration.bM.V$bxI r1 = r6.c
                r1.e = r7
                r1.f()
                int r7 = ivas.gov.bisp.enumeration.bM.V.bxJ.b
                r3 = r7 | 17
                int r3 = r3 << 1
                r7 = r7 ^ 17
                int r3 = r3 - r7
                int r7 = r3 % 128
                ivas.gov.bisp.enumeration.bM.V.bxJ.a = r7
                int r3 = r3 % r0
                android.widget.TextView r7 = r1.c
                android.text.InputFilter[] r7 = r7.getFilters()
                android.widget.TextView r3 = r1.c
                int r4 = ivas.gov.bisp.enumeration.bM.V.bxJ.b
                int r4 = r4 + 31
                int r5 = r4 % 128
                ivas.gov.bisp.enumeration.bM.V.bxJ.a = r5
                int r4 = r4 % r0
                if (r4 != 0) goto L85
                android.text.InputFilter[] r7 = r1.c(r7)
                r3.setFilters(r7)
                r7 = 32
                int r7 = r7 / 0
                goto L8c
            L85:
                android.text.InputFilter[] r7 = r1.c(r7)
                r3.setFilters(r7)
            L8c:
                int r7 = ivas.gov.bisp.enumeration.bM.V.bxJ.a
                r1 = r7 | 104(0x68, float:1.46E-43)
                int r1 = r1 << 1
                r7 = r7 ^ 104(0x68, float:1.46E-43)
                int r1 = r1 - r7
                r7 = r1 ^ (-1)
                int r1 = r1 << 1
                int r7 = r7 + r1
                int r1 = r7 % 128
                ivas.gov.bisp.enumeration.bM.V.bxJ.b = r1
                int r7 = r7 % r0
                if (r7 != 0) goto La2
                return
            La2:
                r2.hashCode()
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.bM.V.bxJ.e(boolean):void");
        }
    }

    public V(TextView textView, boolean z) {
        r.k(textView, "textView cannot be null");
        if (!z) {
            this.c = new bxJ(textView);
            int i = a;
            int i2 = (i & (-124)) | ((~i) & 123);
            int i3 = -(-((i & 123) << 1));
            int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
            b = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        this.c = new bxI(textView);
        int i6 = b;
        int i7 = (i6 ^ 22) + ((i6 & 22) << 1);
        int i8 = (i7 ^ (-1)) + (i7 << 1);
        a = i8 % 128;
        if (i8 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static class bxI extends bxH {
        private static int a = 0;
        private static int b = 1;
        public final TextView c;
        public final A d;
        public boolean e = true;

        public bxI(TextView textView) {
            this.c = textView;
            this.d = new A(textView);
        }

        @Override // ivas.gov.bisp.enumeration.bM.V.bxH
        public void d(boolean z) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 | 55) << 1) - (i2 ^ 55);
            b = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (z) {
                f();
                int i4 = a;
                int i5 = (((i4 | 4) << 1) - (i4 ^ 4)) - 1;
                b = i5 % 128;
                int i6 = i5 % 2;
            }
            int i7 = a;
            int i8 = i7 & 93;
            int i9 = -(-((i7 ^ 93) | i8));
            int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
            b = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
        }

        public void f() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 & 126) + (i2 | 126)) - 1;
            a = i3 % 128;
            int i4 = i3 % 2;
            TransformationMethod transformationMethod = this.c.getTransformationMethod();
            Object obj = null;
            if (this.e) {
                int i5 = a;
                int i6 = (i5 & 121) + (i5 | 121);
                int i7 = i6 % 128;
                b = i7;
                int i8 = i6 % 2;
                if (transformationMethod instanceof s) {
                    int i9 = (i7 & 110) + (i7 | 110);
                    int i10 = (i9 ^ (-1)) + (i9 << 1);
                    int i11 = i10 % 128;
                    a = i11;
                    int i12 = i10 % 2;
                    int i13 = i11 ^ 7;
                    int i14 = (((i11 & 7) | i13) << 1) - i13;
                    b = i14 % 128;
                    int i15 = i14 % 2;
                } else if (!(transformationMethod instanceof PasswordTransformationMethod)) {
                    s sVar = new s(transformationMethod);
                    int i16 = a;
                    int i17 = i16 ^ 3;
                    int i18 = ((i16 & 3) | i17) << 1;
                    int i19 = -i17;
                    int i20 = ((i18 | i19) << 1) - (i18 ^ i19);
                    b = i20 % 128;
                    int i21 = i20 % 2;
                    transformationMethod = sVar;
                } else {
                    int i22 = i7 ^ 5;
                    int i23 = ((i7 & 5) | i22) << 1;
                    int i24 = -i22;
                    int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
                    a = i25 % 128;
                    if (i25 % 2 != 0) {
                        throw null;
                    }
                    int i26 = i7 & 9;
                    int i27 = -(-((i7 ^ 9) | i26));
                    int i28 = (i26 & i27) + (i27 | i26);
                    a = i28 % 128;
                    if (i28 % 2 != 0) {
                        int i29 = 2 % 5;
                    }
                }
            } else if (!(!(transformationMethod instanceof s))) {
                int i30 = a;
                int i31 = i30 & 33;
                int i32 = (((i30 ^ 33) | i31) << 1) - ((i30 | 33) & (~i31));
                b = i32 % 128;
                if (i32 % 2 == 0) {
                    TransformationMethod transformationMethod2 = ((s) transformationMethod).c;
                    obj.hashCode();
                    throw null;
                }
                transformationMethod = ((s) transformationMethod).c;
                int i33 = b;
                int i34 = i33 & 5;
                int i35 = ((i33 | 5) & (~i34)) + (i34 << 1);
                a = i35 % 128;
                int i36 = i35 % 2;
            }
            this.c.setTransformationMethod(transformationMethod);
            int i37 = b;
            int i38 = i37 ^ 11;
            int i39 = (((i37 & 11) | i38) << 1) - i38;
            a = i39 % 128;
            if (i39 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.bM.V.bxH
        public void e(boolean z) {
            int i = 2 % 2;
            int i2 = (-2) - ((a + 10) ^ (-1));
            b = i2 % 128;
            int i3 = i2 % 2;
            this.e = z;
            f();
            InputFilter[] filters = this.c.getFilters();
            int i4 = b + 89;
            a = i4 % 128;
            if (i4 % 2 != 0) {
                this.c.setFilters(c(filters));
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            this.c.setFilters(c(filters));
            int i5 = b;
            int i6 = (i5 | 5) << 1;
            int i7 = -(((~i5) & 5) | (i5 & (-6)));
            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
            a = i8 % 128;
            int i9 = i8 % 2;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0062  */
        /* JADX WARN: Code duplicated, block: B:37:0x0111  */
        @Override // ivas.gov.bisp.enumeration.bM.V.bxH
        public InputFilter[] c(InputFilter[] inputFilterArr) {
            InputFilter[] inputFilterArr2;
            int i;
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = i3 ^ 105;
            int i5 = ((i3 & 105) | i4) << 1;
            int i6 = -i4;
            int i7 = (i5 & i6) + (i6 | i5);
            b = i7 % 128;
            if (i7 % 2 == 0) {
                throw null;
            }
            if (this.e) {
                int length = inputFilterArr.length;
                int i8 = i3 ^ 77;
                int i9 = ((i3 & 77) | i8) << 1;
                int i10 = -i8;
                int i11 = (i9 & i10) + (i9 | i10);
                b = i11 % 128;
                int i12 = i11 % 2;
                int i13 = 0;
                while (true) {
                    if (i13 >= length) {
                        InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                        int i14 = a;
                        int i15 = i14 & 51;
                        int i16 = i14 | 51;
                        int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
                        b = i17 % 128;
                        if (i17 % 2 == 0) {
                            System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length);
                        } else {
                            System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length);
                        }
                        inputFilterArr3[length] = this.d;
                        int i18 = b;
                        int i19 = i18 & 69;
                        int i20 = -(-(i18 | 69));
                        int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
                        a = i21 % 128;
                        int i22 = i21 % 2;
                        inputFilterArr = inputFilterArr3;
                        break;
                    }
                    int i23 = a;
                    int i24 = i23 & 121;
                    int i25 = (~i24) & (i23 | 121);
                    int i26 = -(-(i24 << 1));
                    int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
                    b = i27 % 128;
                    if (i27 % 2 == 0) {
                        InputFilter inputFilter = inputFilterArr[i13];
                        throw null;
                    }
                    if (inputFilterArr[i13] == this.d) {
                        break;
                    }
                    int i28 = i23 & 27;
                    int i29 = (i23 ^ 27) | i28;
                    int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
                    b = i30 % 128;
                    if (i30 % 2 == 0) {
                        int i31 = i13 & 43;
                        int i32 = (i13 ^ 43) | i31;
                        i13 = (i31 ^ i32) + ((i32 & i31) << 1);
                    } else {
                        i13++;
                    }
                }
                int i33 = a;
                int i34 = (i33 ^ 69) + ((i33 & 69) << 1);
                b = i34 % 128;
                if (i34 % 2 != 0) {
                    return inputFilterArr;
                }
                throw null;
            }
            SparseArray sparseArray = new SparseArray(1);
            int i35 = b;
            int i36 = i35 & 123;
            int i37 = ((((i35 ^ 123) | i36) << 1) - (~(-((i35 | 123) & (~i36))))) - 1;
            a = i37 % 128;
            int i38 = i37 % 2;
            int i39 = 0;
            while (i39 < inputFilterArr.length) {
                int i40 = b;
                int i41 = i40 & 115;
                int i42 = (i40 | 115) & (~i41);
                int i43 = i41 << 1;
                int i44 = ((i42 | i43) << 1) - (i42 ^ i43);
                a = i44 % 128;
                if (i44 % 2 != 0) {
                    int i45 = 53 / 0;
                    if (!(!(inputFilterArr[i39] instanceof A))) {
                        sparseArray.put(i39, inputFilterArr[i39]);
                        int i46 = b;
                        int i47 = i46 & 11;
                        int i48 = ((i46 | 11) & (~i47)) + (i47 << 1);
                        a = i48 % 128;
                        int i49 = i48 % 2;
                    }
                } else if (inputFilterArr[i39] instanceof A) {
                    sparseArray.put(i39, inputFilterArr[i39]);
                    int i410 = b;
                    int i411 = i410 & 11;
                    int i412 = ((i410 | 11) & (~i411)) + (i411 << 1);
                    a = i412 % 128;
                    int i413 = i412 % 2;
                }
                int i50 = (((i39 ^ (-12)) | (i39 & (-12))) << 1) - (((~i39) & (-12)) | (i39 & 11));
                i39 = ((i50 & 13) - (~(-(-(i50 | 13))))) - 1;
                int i51 = a;
                int i52 = ((i51 ^ 119) | (i51 & 119)) << 1;
                int i53 = -(((~i51) & 119) | (i51 & (-120)));
                int i54 = (i52 ^ i53) + ((i53 & i52) << 1);
                b = i54 % 128;
                if (i54 % 2 == 0) {
                    int i55 = 5 % 2;
                }
            }
            if (sparseArray.size() != 0) {
                int i56 = b;
                int i57 = i56 ^ 103;
                int i58 = (i56 & 103) << 1;
                int i59 = (i57 ^ i58) + ((i58 & i57) << 1);
                a = i59 % 128;
                if (i59 % 2 != 0) {
                    int length2 = inputFilterArr.length;
                    int length3 = inputFilterArr.length;
                    sparseArray.size();
                    throw null;
                }
                int length4 = inputFilterArr.length;
                int length5 = inputFilterArr.length;
                int size = sparseArray.size();
                int i60 = a;
                int i61 = ((i60 ^ 3) | (i60 & 3)) << 1;
                int i62 = -(((~i60) & 3) | (i60 & (-4)));
                int i63 = (i61 & i62) + (i62 | i61);
                b = i63 % 128;
                if (i63 % 2 == 0) {
                    inputFilterArr2 = new InputFilter[length5 << size];
                    i = 1;
                } else {
                    int i64 = -size;
                    inputFilterArr2 = new InputFilter[(length5 ^ i64) + ((length5 & i64) << 1)];
                    i = 0;
                }
                int i65 = i;
                while (i < length4) {
                    int i66 = b + 31;
                    a = i66 % 128;
                    if (i66 % 2 != 0) {
                        int i67 = 24 / 0;
                        if (sparseArray.indexOfKey(i) < 0) {
                            inputFilterArr2[i65] = inputFilterArr[i];
                            int i68 = i65 ^ 1;
                            int i69 = (i65 & 1) << 1;
                            int i70 = (i68 & i69) + (i69 | i68);
                            int i71 = a;
                            int i72 = i71 ^ 43;
                            int i73 = (((i71 & 43) | i72) << 1) - i72;
                            b = i73 % 128;
                            int i74 = i73 % 2;
                            i65 = i70;
                        }
                    } else if (sparseArray.indexOfKey(i) < 0) {
                        inputFilterArr2[i65] = inputFilterArr[i];
                        int i610 = i65 ^ 1;
                        int i611 = (i65 & 1) << 1;
                        int i75 = (i610 & i611) + (i611 | i610);
                        int i76 = a;
                        int i77 = i76 ^ 43;
                        int i78 = (((i76 & 43) | i77) << 1) - i77;
                        b = i78 % 128;
                        int i79 = i78 % 2;
                        i65 = i75;
                    }
                    int i80 = i & 1;
                    i = ((i ^ 1) | i80) + i80;
                    int i81 = b;
                    int i82 = i81 & 111;
                    int i83 = i82 + ((i81 ^ 111) | i82);
                    a = i83 % 128;
                    int i84 = i83 % 2;
                }
                int i85 = b;
                int i86 = ((i85 & 96) + (i85 | 96)) - 1;
                a = i86 % 128;
                int i87 = i86 % 2;
                inputFilterArr = inputFilterArr2;
            }
            int i88 = b;
            int i89 = (i88 & 105) + (i88 | 105);
            a = i89 % 128;
            if (i89 % 2 != 0) {
                int i90 = 33 / 0;
            }
            return inputFilterArr;
        }
    }
}
