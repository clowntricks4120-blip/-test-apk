package ivas.gov.bisp.enumeration.p032be;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class c implements Closeable, Flushable {
    private static int a = 0;
    private static int b = 1;
    public static final String[] c = new String[128];
    public static final String[] d;
    public String e;
    public final Writer f;
    public int[] g = new int[32];
    public int h = 0;
    public String i;
    public String j;
    public boolean k;
    public boolean l;
    public boolean m;

    public c(Writer writer) {
        m(6);
        this.i = ":";
        this.m = true;
        Objects.requireNonNull(writer, "out == null");
        this.f = writer;
    }

    public c f() throws IOException {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 77;
        int i4 = (i2 ^ 77) | i3;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        u();
        d();
        m(3);
        Writer writer = this.f;
        int i7 = a;
        int i8 = (i7 ^ 27) + ((i7 & 27) << 1);
        b = i8 % 128;
        if (i8 % 2 == 0) {
            writer.write(16);
        } else {
            writer.write(123);
        }
        int i9 = b;
        int i10 = i9 & 27;
        int i11 = (i9 ^ 27) | i10;
        int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
        a = i12 % 128;
        int i13 = i12 % 2;
        return this;
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 85;
        int i4 = (i3 - (~(-(-((i2 ^ 85) | i3))))) - 1;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        if (this.h == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f.flush();
        int i5 = b;
        int i6 = i5 & 35;
        int i7 = (i5 | 35) & (~i6);
        int i8 = -(-(i6 << 1));
        int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
        a = i9 % 128;
        if (i9 % 2 != 0) {
            throw null;
        }
    }

    public c h() throws IOException {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 67) << 1) - (i2 ^ 67);
        a = i3 % 128;
        g(3, 5, i3 % 2 != 0 ? 'R' : '}');
        int i4 = a;
        int i5 = ((i4 & (-114)) | ((~i4) & 113)) + ((i4 & 113) << 1);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public c i() throws IOException {
        int i = 2 % 2;
        int i2 = a + 84;
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        g(1, 2, ']');
        int i5 = b;
        int i6 = i5 & 113;
        int i7 = ((i5 ^ 113) | i6) << 1;
        int i8 = -((i5 | 113) & (~i6));
        int i9 = (i7 & i8) + (i8 | i7);
        a = i9 % 128;
        if (i9 % 2 == 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        throw new java.lang.IllegalStateException("JsonWriter is closed.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (r2 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r2 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        r2 = r4.g[r2 - 1];
        r3 = (r1 & 69) + (r1 | 69);
        ivas.gov.bisp.enumeration.p032be.c.a = r3 % 128;
        r3 = r3 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int l() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.p032be.c.a
            r2 = r1 | 81
            int r2 = r2 << 1
            r1 = r1 ^ 81
            int r2 = r2 - r1
            int r1 = r2 % 128
            ivas.gov.bisp.enumeration.p032be.c.b = r1
            int r2 = r2 % r0
            if (r2 != 0) goto L1c
            int r2 = r4.h
            r3 = 87
            int r3 = r3 / 0
            if (r2 == 0) goto L31
            goto L20
        L1c:
            int r2 = r4.h
            if (r2 == 0) goto L31
        L20:
            int[] r3 = r4.g
            int r2 = r2 + (-1)
            r2 = r3[r2]
            r3 = r1 & 69
            r1 = r1 | 69
            int r3 = r3 + r1
            int r1 = r3 % 128
            ivas.gov.bisp.enumeration.p032be.c.a = r1
            int r3 = r3 % r0
            return r2
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "JsonWriter is closed."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p032be.c.l():int");
    }

    public final void n(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 ^ 68) + ((i3 & 68) << 1)) - 1;
        a = i4 % 128;
        if (i4 % 2 != 0) {
            this.g[this.h % 1] = i;
        } else {
            this.g[(-2) - (this.h ^ (-1))] = i;
        }
    }

    public c q(Boolean bool) throws IOException {
        String str;
        int i = 2 % 2;
        int i2 = a + 69;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        Object obj = null;
        if (bool == null) {
            int i5 = i3 + 49;
            a = i5 % 128;
            if (i5 % 2 == 0) {
                return c();
            }
            c();
            obj.hashCode();
            throw null;
        }
        u();
        d();
        Writer writer = this.f;
        if (bool.booleanValue()) {
            int i6 = a + 121;
            b = i6 % 128;
            if (i6 % 2 == 0) {
                throw null;
            }
            str = "true";
        } else {
            str = "false";
            int i7 = a;
            int i8 = (i7 & 11) + (i7 | 11);
            b = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 4 / 2;
            }
        }
        writer.write(str);
        int i10 = b;
        int i11 = i10 ^ 101;
        int i12 = ((i10 & 101) | i11) << 1;
        int i13 = -i11;
        int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
        a = i14 % 128;
        int i15 = i14 % 2;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x003e, code lost:
    
        if (r7.g[(r1 ^ (-1)) + (r1 << 1)] == 7) goto L8;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void close() throws java.io.IOException {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.p032be.c.a
            r2 = r1 | 57
            r3 = 1
            int r2 = r2 << r3
            r1 = r1 ^ 57
            int r2 = r2 - r1
            int r1 = r2 % 128
            ivas.gov.bisp.enumeration.p032be.c.b = r1
            int r2 = r2 % r0
            java.io.Writer r1 = r7.f
            r1.close()
            int r1 = r7.h
            if (r1 > r3) goto L57
            int r2 = ivas.gov.bisp.enumeration.p032be.c.a
            int r4 = r2 + 39
            int r5 = r4 % 128
            ivas.gov.bisp.enumeration.p032be.c.b = r5
            int r4 = r4 % r0
            if (r1 != r3) goto L40
            r4 = r2 ^ 57
            r5 = r2 & 57
            int r5 = r5 << r3
            int r5 = -r5
            int r5 = -r5
            r6 = r4 & r5
            r4 = r4 | r5
            int r6 = r6 + r4
            int r4 = r6 % 128
            ivas.gov.bisp.enumeration.p032be.c.b = r4
            int r6 = r6 % r0
            int[] r4 = r7.g
            r5 = r1 ^ (-1)
            int r1 = r1 << r3
            int r5 = r5 + r1
            r1 = r4[r5]
            r4 = 7
            if (r1 != r4) goto L57
        L40:
            r1 = 0
            r7.h = r1
            r1 = r2 & (-20)
            int r4 = ~r2
            r5 = 19
            r4 = r4 & r5
            r1 = r1 | r4
            r2 = r2 & r5
            int r2 = r2 << r3
            int r1 = r1 + r2
            int r2 = r1 % 128
            ivas.gov.bisp.enumeration.p032be.c.b = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L55
            return
        L55:
            r0 = 0
            throw r0
        L57:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Incomplete document"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p032be.c.close():void");
    }

    public final void d() throws IOException {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 35) | (i2 & 35)) << 1;
        int i4 = -(((~i2) & 35) | (i2 & (-36)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        int iL = l();
        if (iL == 1) {
            n(2);
            k();
            int i7 = a + 9;
            b = i7 % 128;
            if (i7 % 2 == 0) {
                throw null;
            }
            return;
        }
        int i8 = b;
        int i9 = (i8 | 117) << 1;
        int i10 = -((i8 & (-118)) | ((~i8) & 117));
        int i11 = ((i9 | i10) << 1) - (i9 ^ i10);
        a = i11 % 128;
        if (i11 % 2 == 0 ? iL == 2 : iL == 2) {
            this.f.append(',');
            k();
            int i12 = a + 35;
            b = i12 % 128;
            int i13 = i12 % 2;
            return;
        }
        int i14 = i8 & 47;
        int i15 = i14 + ((i8 ^ 47) | i14);
        a = i15 % 128;
        if (i15 % 2 == 0 ? iL == 4 : iL == 3) {
            this.f.append((CharSequence) this.i);
            int i16 = a;
            int i17 = ((i16 ^ 34) + ((i16 & 34) << 1)) - 1;
            b = i17 % 128;
            if (i17 % 2 == 0) {
                n(4);
                return;
            } else {
                n(5);
                return;
            }
        }
        if (iL != 6) {
            int i18 = (i8 & 61) + (i8 | 61);
            a = i18 % 128;
            if (i18 % 2 == 0 ? iL != 7 : iL != 23) {
                throw new IllegalStateException("Nesting problem.");
            }
            if (!this.k) {
                throw new IllegalStateException("JSON must have only one top-level value.");
            }
        }
        n(7);
        int i19 = a;
        int i20 = i19 & 89;
        int i21 = ((i19 ^ 89) | i20) << 1;
        int i22 = -((i19 | 89) & (~i20));
        int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
        b = i23 % 128;
        if (i23 % 2 == 0) {
            int i24 = 35 / 0;
        }
    }

    public final void m(int i) {
        int i2;
        int[] iArr;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = i4 ^ 51;
        int i6 = (i4 & 51) << 1;
        int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
        a = i7 % 128;
        if (i7 % 2 != 0) {
            i2 = this.h;
            iArr = this.g;
            int i8 = 94 / 0;
        } else {
            i2 = this.h;
            iArr = this.g;
        }
        int i9 = ((i4 ^ 94) + ((i4 & 94) << 1)) - 1;
        a = i9 % 128;
        if (i9 % 2 != 0) {
            int length = iArr.length;
            throw null;
        }
        if (i2 == iArr.length) {
            int i10 = i4 & 77;
            int i11 = ((i4 | 77) & (~i10)) + (i10 << 1);
            a = i11 % 128;
            int i12 = i11 % 2;
            this.g = Arrays.copyOf(iArr, i2 * 2);
            int i13 = b + 97;
            a = i13 % 128;
            int i14 = i13 % 2;
        }
        int[] iArr2 = this.g;
        int i15 = this.h;
        this.h = i15 + 1;
        int i16 = a;
        int i17 = (-2) - ((i16 + 52) ^ (-1));
        b = i17 % 128;
        if (i17 % 2 == 0) {
            iArr2[i15] = i;
            int i18 = 55 / 0;
        } else {
            iArr2[i15] = i;
        }
        int i19 = (i16 & 15) + (i16 | 15);
        b = i19 % 128;
        if (i19 % 2 == 0) {
            int i20 = 21 / 0;
        }
    }

    public c c() throws IOException {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 87;
        int i4 = (((i2 ^ 87) | i3) << 1) - ((~i3) & (i2 | 87));
        b = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            throw null;
        }
        if (this.e != null) {
            if (!this.m) {
                this.e = null;
                int i5 = i2 + 37;
                b = i5 % 128;
                int i6 = i5 % 2;
                return this;
            }
            int i7 = i2 & 105;
            int i8 = (i2 | 105) & (~i7);
            int i9 = i7 << 1;
            int i10 = (i8 & i9) + (i8 | i9);
            b = i10 % 128;
            if (i10 % 2 == 0) {
                u();
                obj.hashCode();
                throw null;
            }
            u();
        }
        d();
        this.f.write("null");
        int i11 = b;
        int i12 = (((i11 ^ 45) | (i11 & 45)) << 1) - (((~i11) & 45) | (i11 & (-46)));
        int i13 = i12 % 128;
        a = i13;
        if (i12 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i14 = i13 & 85;
        int i15 = i14 + ((i13 ^ 85) | i14);
        b = i15 % 128;
        int i16 = i15 % 2;
        return this;
    }

    public c e() throws IOException {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 41;
        int i4 = (i2 ^ 41) | i3;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        u();
        d();
        m(1);
        int i7 = b;
        int i8 = i7 & 59;
        int i9 = -(-((i7 ^ 59) | i8));
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        a = i10 % 128;
        int i11 = i10 % 2;
        this.f.write(91);
        int i12 = b;
        int i13 = i12 & 85;
        int i14 = (i12 ^ 85) | i13;
        int i15 = (i13 & i14) + (i14 | i13);
        a = i15 % 128;
        int i16 = i15 % 2;
        return this;
    }

    public c o(long j) throws IOException {
        Writer writer;
        int i = 2 % 2;
        int i2 = b + 64;
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        a = i3 % 128;
        if (i3 % 2 != 0) {
            u();
            d();
            writer = this.f;
            int i4 = 58 / 0;
        } else {
            u();
            d();
            writer = this.f;
        }
        int i5 = a + 117;
        b = i5 % 128;
        int i6 = i5 % 2;
        writer.write(Long.toString(j));
        if (i6 != 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public c s(boolean z) throws IOException {
        String str;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 | 8) << 1) - (i2 ^ 8)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        u();
        d();
        Writer writer = this.f;
        int i5 = b;
        int i6 = i5 + 93;
        int i7 = i6 % 128;
        a = i7;
        int i8 = i6 % 2;
        if (z) {
            int i9 = (i5 ^ 17) + ((i5 & 17) << 1);
            a = i9 % 128;
            int i10 = i9 % 2;
            str = "true";
            int i11 = i5 + 77;
            a = i11 % 128;
            int i12 = i11 % 2;
        } else {
            int i13 = (i7 & (-40)) | ((~i7) & 39);
            int i14 = (i7 & 39) << 1;
            int i15 = (i13 & i14) + (i13 | i14);
            b = i15 % 128;
            int i16 = i15 % 2;
            str = "false";
        }
        writer.write(str);
        int i17 = b;
        int i18 = ((i17 & 120) + (i17 | 120)) - 1;
        a = i18 % 128;
        int i19 = i18 % 2;
        return this;
    }

    public final void k() throws IOException {
        int i = 2 % 2;
        int i2 = b + 41;
        int i3 = i2 % 128;
        a = i3;
        int i4 = i2 % 2;
        if (this.j == null) {
            int i5 = i3 + 1;
            b = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        this.f.write(10);
        int i7 = this.h;
        int i8 = b;
        int i9 = (i8 & (-16)) | ((~i8) & 15);
        int i10 = -(-((i8 & 15) << 1));
        int i11 = (i9 & i10) + (i9 | i10);
        a = i11 % 128;
        int i12 = i11 % 2;
        int i13 = ((i8 | 95) << 1) - (i8 ^ 95);
        a = i13 % 128;
        int i14 = i13 % 2;
        int i15 = 1;
        while (i15 < i7) {
            int i16 = a;
            int i17 = (i16 & 39) + (i16 | 39);
            b = i17 % 128;
            int i18 = i17 % 2;
            Writer writer = this.f;
            if (i18 == 0) {
                writer.write(this.j);
                int i19 = i15 & 46;
                int i20 = -(-((i15 ^ 46) | i19));
                i15 = ((i19 | i20) << 1) - (i20 ^ i19);
            } else {
                writer.write(this.j);
                int i21 = i15 & (-20);
                int i22 = i21 + ((i15 ^ (-20)) | i21);
                i15 = ((i22 | 21) << 1) - (i22 ^ 21);
            }
            int i23 = a;
            int i24 = i23 ^ 71;
            int i25 = ((((i23 & 71) | i24) << 1) - (~(-i24))) - 1;
            b = i25 % 128;
            int i26 = i25 % 2;
        }
        int i27 = a;
        int i28 = (-2) - ((((i27 | 60) << 1) - (i27 ^ 60)) ^ (-1));
        b = i28 % 128;
        int i29 = i28 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0125  */
    /* JADX WARN: Code duplicated, block: B:35:0x013e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0146  */
    public final void p(String str) throws IOException {
        String[] strArr;
        Writer writer;
        int i;
        char cCharAt;
        String str2;
        int i2;
        Writer writer2;
        int i3;
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = (((i5 ^ 43) | (i5 & 43)) << 1) - (((~i5) & 43) | (i5 & (-44)));
        int i7 = i6 % 128;
        b = i7;
        int i8 = i6 % 2;
        Object obj = null;
        if (this.l) {
            int i9 = i7 + 35;
            int i10 = i9 % 128;
            a = i10;
            if (i9 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            strArr = d;
            int i11 = i10 & 65;
            int i12 = (i10 | 65) & (~i11);
            int i13 = -(-(i11 << 1));
            int i14 = (i12 & i13) + (i12 | i13);
            b = i14 % 128;
            int i15 = i14 % 2;
        } else {
            String[] strArr2 = c;
            int i16 = i7 & 93;
            int i17 = -(-((i7 ^ 93) | i16));
            int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
            a = i18 % 128;
            int i19 = i18 % 2;
            strArr = strArr2;
        }
        this.f.write(34);
        int length = str.length();
        int i20 = b;
        int i21 = i20 ^ 43;
        int i22 = (i20 & 43) << 1;
        int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
        int i24 = i23 % 128;
        a = i24;
        int i25 = i23 % 2;
        int i26 = i24 ^ 3;
        int i27 = ((i24 & 3) | i26) << 1;
        int i28 = -i26;
        int i29 = (i27 ^ i28) + ((i27 & i28) << 1);
        b = i29 % 128;
        int i30 = i29 % 2;
        int i31 = 0;
        int i32 = 0;
        while (i31 < length) {
            int i33 = a;
            int i34 = i33 & 11;
            int i35 = i34 + ((i33 ^ 11) | i34);
            b = i35 % 128;
            if (i35 % 2 != 0 ? (cCharAt = str.charAt(i31)) >= 128 : (cCharAt = str.charAt(i31)) >= 18853) {
                if (cCharAt == 8232) {
                    int i36 = b;
                    int i37 = i36 & 33;
                    int i38 = (((~i37) & (i36 | 33)) - (~(-(-(i37 << 1))))) - 1;
                    a = i38 % 128;
                    int i39 = i38 % 2;
                    int i40 = ((i36 ^ 78) + ((i36 & 78) << 1)) - 1;
                    a = i40 % 128;
                    int i41 = i40 % 2;
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    int i42 = a;
                    int i43 = (i42 & (-46)) | ((~i42) & 45);
                    int i44 = -(-((i42 & 45) << 1));
                    int i45 = (i43 ^ i44) + ((i44 & i43) << 1);
                    int i46 = i45 % 128;
                    b = i46;
                    int i47 = i45 % 2;
                    int i48 = (i46 & 125) + (i46 | 125);
                    a = i48 % 128;
                    int i49 = i48 % 2;
                    str2 = "\\u2029";
                }
                if (i32 < i31) {
                    int i50 = b;
                    int i51 = (i50 & (-86)) | ((~i50) & 85);
                    int i52 = (i50 & 85) << 1;
                    i2 = ((i51 | i52) << 1) - (i52 ^ i51);
                    a = i2 % 128;
                    if (i2 % 2 != 0) {
                        writer2 = this.f;
                        i3 = i31 % i32;
                    } else {
                        writer2 = this.f;
                        i3 = (i31 - (~(-i32))) - 1;
                    }
                    writer2.write(str, i32, i3);
                    int i53 = a;
                    int i54 = i53 & 63;
                    int i55 = ((i53 | 63) & (~i54)) + (i54 << 1);
                    b = i55 % 128;
                    int i56 = i55 % 2;
                }
                this.f.write(str2);
                int i57 = i31 ^ 1;
                int i58 = ((i31 & 1) | i57) << 1;
                int i59 = -i57;
                int i60 = (i58 & i59) + (i59 | i58);
                int i61 = a;
                int i62 = (-2) - (((i61 ^ 58) + ((i61 & 58) << 1)) ^ (-1));
                b = i62 % 128;
                int i63 = i62 % 2;
                i32 = i60;
            } else {
                int i64 = a;
                int i65 = (i64 ^ 69) + ((i64 & 69) << 1);
                b = i65 % 128;
                if (i65 % 2 == 0) {
                    String str3 = strArr[cCharAt];
                    throw null;
                }
                str2 = strArr[cCharAt];
                if (str2 == null) {
                    int i66 = ((i64 | 9) << 1) - (i64 ^ 9);
                    b = i66 % 128;
                    int i67 = i66 % 2;
                } else {
                    if (i32 < i31) {
                        int i510 = b;
                        int i511 = (i510 & (-86)) | ((~i510) & 85);
                        int i512 = (i510 & 85) << 1;
                        i2 = ((i511 | i512) << 1) - (i512 ^ i511);
                        a = i2 % 128;
                        if (i2 % 2 != 0) {
                            writer2 = this.f;
                            i3 = i31 % i32;
                        } else {
                            writer2 = this.f;
                            i3 = (i31 - (~(-i32))) - 1;
                        }
                        writer2.write(str, i32, i3);
                        int i513 = a;
                        int i514 = i513 & 63;
                        int i515 = ((i513 | 63) & (~i514)) + (i514 << 1);
                        b = i515 % 128;
                        int i516 = i515 % 2;
                    }
                    this.f.write(str2);
                    int i517 = i31 ^ 1;
                    int i518 = ((i31 & 1) | i517) << 1;
                    int i519 = -i517;
                    int i68 = (i518 & i519) + (i519 | i518);
                    int i69 = a;
                    int i610 = (-2) - (((i69 ^ 58) + ((i69 & 58) << 1)) ^ (-1));
                    b = i610 % 128;
                    int i611 = i610 % 2;
                    i32 = i68;
                }
            }
            int i70 = ((i31 ^ 26) + ((i31 & 26) << 1)) - 1;
            i31 = ((i70 & (-23)) + (i70 | (-23))) - 1;
            int i71 = a + 69;
            b = i71 % 128;
            if (i71 % 2 == 0) {
                int i72 = 3 % 4;
            }
        }
        if (i32 < length) {
            int i73 = a + 59;
            b = i73 % 128;
            if (i73 % 2 == 0) {
                writer = this.f;
                i = length >> i32;
            } else {
                writer = this.f;
                i = length - i32;
            }
            writer.write(str, i32, i);
            int i74 = a;
            int i75 = ((i74 ^ 13) | (i74 & 13)) << 1;
            int i76 = -(((~i74) & 13) | (i74 & (-14)));
            int i77 = (i75 ^ i76) + ((i76 & i75) << 1);
            b = i77 % 128;
            int i78 = i77 % 2;
        }
        this.f.write(34);
        int i79 = b;
        int i80 = i79 | 11;
        int i81 = i80 << 1;
        int i82 = -((~(i79 & 11)) & i80);
        int i83 = (i81 ^ i82) + ((i82 & i81) << 1);
        a = i83 % 128;
        int i84 = i83 % 2;
    }

    public c t(String str) throws IOException {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 | 61;
        int i4 = ((i3 << 1) - (~(-(i3 & (~(i2 & 61)))))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        if (str != null) {
            u();
            d();
            p(str);
            int i6 = a;
            int i7 = i6 & 19;
            int i8 = i7 + ((i6 ^ 19) | i7);
            b = i8 % 128;
            int i9 = i8 % 2;
            return this;
        }
        int i10 = i2 + 109;
        a = i10 % 128;
        int i11 = i10 % 2;
        c cVarC = c();
        int i12 = a;
        int i13 = (i12 ^ 115) + ((i12 & 115) << 1);
        b = i13 % 128;
        if (i13 % 2 != 0) {
            return cVarC;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003d  */
    /* JADX WARN: Code duplicated, block: B:14:0x0044 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:9:0x002e A[PHI: r1
  0x002e: PHI (r1v10 int) = (r1v9 int), (r1v16 int) binds: [B:8:0x002c, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
    
        if (r1 == r6) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        if (r1 == r6) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        throw new java.lang.IllegalStateException("Nesting problem.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ivas.gov.bisp.enumeration.p032be.c g(int r6, int r7, char r8) throws java.io.IOException {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.p032be.c.b
            r2 = r1 | 35
            int r2 = r2 << 1
            r3 = r1 & (-36)
            int r1 = ~r1
            r1 = r1 & 35
            r1 = r1 | r3
            int r1 = -r1
            r3 = r2 ^ r1
            r1 = r1 & r2
            int r1 = r1 << 1
            int r3 = r3 + r1
            int r1 = r3 % 128
            ivas.gov.bisp.enumeration.p032be.c.a = r1
            int r3 = r3 % r0
            if (r3 == 0) goto L28
            int r1 = r5.l()
            r2 = 62
            int r2 = r2 / 0
            if (r1 == r7) goto L4f
            goto L2e
        L28:
            int r1 = r5.l()
            if (r1 == r7) goto L4f
        L2e:
            int r2 = ivas.gov.bisp.enumeration.p032be.c.a
            r3 = r2 & 121(0x79, float:1.7E-43)
            r2 = r2 ^ 121(0x79, float:1.7E-43)
            r2 = r2 | r3
            int r3 = r3 + r2
            int r2 = r3 % 128
            ivas.gov.bisp.enumeration.p032be.c.b = r2
            int r3 = r3 % r0
            if (r3 != 0) goto L44
            r2 = 57
            int r2 = r2 / 0
            if (r1 != r6) goto L47
            goto L4f
        L44:
            if (r1 != r6) goto L47
            goto L4f
        L47:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Nesting problem."
            r6.<init>(r7)
            throw r6
        L4f:
            java.lang.String r6 = r5.e
            if (r6 != 0) goto Laf
            int r6 = ivas.gov.bisp.enumeration.p032be.c.b
            r2 = r6 ^ 73
            r3 = r6 & 73
            r3 = r3 | r2
            int r3 = r3 << 1
            int r2 = -r2
            r4 = r3 | r2
            int r4 = r4 << 1
            r2 = r2 ^ r3
            int r4 = r4 - r2
            int r2 = r4 % 128
            ivas.gov.bisp.enumeration.p032be.c.a = r2
            int r4 = r4 % r0
            int r2 = r5.h
            int r3 = ~r2
            int r2 = r2 << 1
            r4 = r3 & r2
            r2 = r2 | r3
            int r4 = r4 + r2
            r5.h = r4
            if (r1 != r7) goto L95
            r7 = r6 & 87
            int r1 = ~r7
            r6 = r6 | 87
            r6 = r6 & r1
            int r7 = r7 << 1
            int r7 = -r7
            int r7 = -r7
            r1 = r6 & r7
            r6 = r6 | r7
            int r1 = r1 + r6
            int r6 = r1 % 128
            ivas.gov.bisp.enumeration.p032be.c.a = r6
            int r1 = r1 % r0
            if (r1 == 0) goto L92
            r5.k()
            r6 = 29
            int r6 = r6 / 0
            goto L95
        L92:
            r5.k()
        L95:
            java.io.Writer r6 = r5.f
            r6.write(r8)
            int r6 = ivas.gov.bisp.enumeration.p032be.c.a
            r7 = r6 ^ 33
            r6 = r6 & 33
            int r6 = r6 << 1
            int r7 = r7 + r6
            int r6 = r7 % 128
            ivas.gov.bisp.enumeration.p032be.c.b = r6
            int r7 = r7 % r0
            if (r7 != 0) goto Lae
            r6 = 51
            int r6 = r6 / 0
        Lae:
            return r5
        Laf:
            java.lang.String r6 = "Dangling name: "
            java.lang.StringBuilder r6 = ivas.gov.bisp.enumeration.p091n.j.w(r6)
            java.lang.String r7 = r5.e
            r6.append(r7)
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p032be.c.g(int, int, char):ivas.gov.bisp.enumeration.be.c");
    }

    public c j(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 95;
        int i4 = (i2 & 95) << 1;
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        Objects.requireNonNull(str, "name == null");
        if (this.e != null) {
            throw new IllegalStateException();
        }
        int i7 = a;
        int i8 = i7 & 39;
        int i9 = ((i7 ^ 39) | i8) << 1;
        int i10 = -((~i8) & (i7 | 39));
        int i11 = ((i9 | i10) << 1) - (i9 ^ i10);
        b = i11 % 128;
        int i12 = i11 % 2;
        if (this.h == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        int i13 = (i7 & 26) + (i7 | 26);
        int i14 = (i13 ^ (-1)) + (i13 << 1);
        int i15 = i14 % 128;
        b = i15;
        int i16 = i14 % 2;
        this.e = str;
        int i17 = i15 + 25;
        a = i17 % 128;
        if (i17 % 2 != 0) {
            int i18 = 10 / 0;
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0088, code lost:
    
        if (r1.equals("NaN") == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ivas.gov.bisp.enumeration.p032be.c r(java.lang.Number r7) throws java.io.IOException {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.p032be.c.b
            r2 = r1 & 25
            r3 = r1 ^ 25
            r3 = r3 | r2
            r4 = r2 | r3
            r5 = 1
            int r4 = r4 << r5
            r2 = r2 ^ r3
            int r4 = r4 - r2
            int r2 = r4 % 128
            ivas.gov.bisp.enumeration.p032be.c.a = r2
            int r4 = r4 % r0
            if (r7 != 0) goto L38
            r7 = r1 & 71
            r1 = r1 ^ 71
            r1 = r1 | r7
            int r1 = -r1
            int r1 = -r1
            int r1 = ~r1
            int r7 = r7 - r1
            int r7 = r7 - r5
            int r1 = r7 % 128
            ivas.gov.bisp.enumeration.p032be.c.a = r1
            int r7 = r7 % r0
            ivas.gov.bisp.enumeration.be.c r7 = r6.c()
            int r1 = ivas.gov.bisp.enumeration.p032be.c.b
            r2 = r1 | 113(0x71, float:1.58E-43)
            int r2 = r2 << r5
            r1 = r1 ^ 113(0x71, float:1.58E-43)
            int r2 = r2 - r1
            int r1 = r2 % 128
            ivas.gov.bisp.enumeration.p032be.c.a = r1
            int r2 = r2 % r0
            return r7
        L38:
            r6.u()
            java.lang.String r1 = r7.toString()
            boolean r2 = r6.k
            if (r2 != 0) goto Laa
            int r2 = ivas.gov.bisp.enumeration.p032be.c.a
            r3 = r2 ^ 94
            r2 = r2 & 94
            int r2 = r2 << r5
            int r3 = r3 + r2
            int r3 = r3 - r5
            int r2 = r3 % 128
            ivas.gov.bisp.enumeration.p032be.c.b = r2
            int r3 = r3 % r0
            java.lang.String r2 = "-Infinity"
            boolean r2 = r1.equals(r2)
            r2 = r2 ^ r5
            if (r2 == 0) goto L93
            int r2 = ivas.gov.bisp.enumeration.p032be.c.a
            r3 = r2 & 90
            r2 = r2 | 90
            int r3 = r3 + r2
            int r3 = r3 - r5
            int r2 = r3 % 128
            ivas.gov.bisp.enumeration.p032be.c.b = r2
            int r3 = r3 % r0
            java.lang.String r2 = "Infinity"
            boolean r2 = r1.equals(r2)
            if (r2 == r5) goto L93
            int r2 = ivas.gov.bisp.enumeration.p032be.c.a
            r3 = r2 | 96
            int r3 = r3 << r5
            r2 = r2 ^ 96
            int r3 = r3 - r2
            r2 = r3 ^ (-1)
            int r2 = (-2) - r2
            int r3 = r2 % 128
            ivas.gov.bisp.enumeration.p032be.c.b = r3
            int r2 = r2 % r0
            java.lang.String r3 = "NaN"
            if (r2 == 0) goto L8b
            boolean r2 = r1.equals(r3)
            if (r2 != 0) goto L93
            goto Laa
        L8b:
            r1.equals(r3)
            r7 = 0
            r7.hashCode()
            throw r7
        L93:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Numeric values must be finite, but was "
            r0.append(r1)
            r0.append(r7)
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        Laa:
            r6.d()
            java.io.Writer r7 = r6.f
            r7.append(r1)
            int r7 = ivas.gov.bisp.enumeration.p032be.c.b
            r1 = r7 & 41
            int r2 = ~r1
            r7 = r7 | 41
            r7 = r7 & r2
            int r1 = r1 << r5
            int r7 = r7 + r1
            int r1 = r7 % 128
            ivas.gov.bisp.enumeration.p032be.c.a = r1
            int r7 = r7 % r0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p032be.c.r(java.lang.Number):ivas.gov.bisp.enumeration.be.c");
    }

    public final void u() throws IOException {
        int iL;
        int i = 2 % 2;
        int i2 = a + 9;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        if (this.e == null) {
            int i5 = i3 ^ 79;
            int i6 = (((i3 & 79) | i5) << 1) - i5;
            a = i6 % 128;
            int i7 = i6 % 2;
            return;
        }
        int i8 = (((i3 | 14) << 1) - (i3 ^ 14)) - 1;
        a = i8 % 128;
        if (i8 % 2 == 0 ? (iL = l()) == 5 : (iL = l()) == 3) {
            int i9 = b + 9;
            a = i9 % 128;
            int i10 = i9 % 2;
            this.f.write(44);
            int i11 = b + 91;
            a = i11 % 128;
            int i12 = i11 % 2;
        } else if (iL != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        k();
        n(4);
        String str = this.e;
        int i13 = b;
        int i14 = i13 & 33;
        int i15 = -(-((i13 ^ 33) | i14));
        int i16 = (i14 & i15) + (i15 | i14);
        a = i16 % 128;
        int i17 = i16 % 2;
        p(str);
        this.e = null;
        int i18 = a;
        int i19 = (i18 & 17) + (i18 | 17);
        b = i19 % 128;
        if (i19 % 2 == 0) {
            int i20 = 80 / 0;
        }
    }

    static {
        char c2;
        char c3;
        int i = ((1 | 59) << 1) - (1 ^ 59);
        a = i % 128;
        if (i % 2 == 0) {
            int i2 = 2 % 2;
        }
        int i3 = 0;
        while (i3 <= 31) {
            int i4 = b;
            int i5 = i4 & 79;
            int i6 = (i4 | 79) & (~i5);
            int i7 = -(-(i5 << 1));
            int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
            int i9 = i8 % 128;
            a = i9;
            int i10 = i8 % 2;
            String[] strArr = c;
            int i11 = i9 & 69;
            int i12 = i11 + ((i9 ^ 69) | i11);
            b = i12 % 128;
            int i13 = i12 % 2;
            String str = String.format("\\u%04x", Integer.valueOf(i3));
            int i14 = b;
            int i15 = i14 & 113;
            int i16 = -(-(i14 | 113));
            int i17 = (i15 & i16) + (i16 | i15);
            int i18 = i17 % 128;
            a = i18;
            int i19 = i17 % 2;
            strArr[i3] = str;
            int i20 = ((i3 | (-49)) << 1) - (i3 ^ (-49));
            i3 = (i20 & 50) + (i20 | 50);
            int i21 = ((i18 ^ 85) - (~(-(-((i18 & 85) << 1))))) - 1;
            b = i21 % 128;
            if (i21 % 2 != 0) {
                int i22 = 2 % 2;
            }
        }
        String[] strArr2 = c;
        strArr2[34] = "\\\"";
        int i23 = a;
        int i24 = ((i23 | 81) << 1) - (i23 ^ 81);
        b = i24 % 128;
        if (i24 % 2 == 0) {
            strArr2[92] = "\\\\";
            strArr2[28] = "\\t";
            c2 = '{';
        } else {
            strArr2[92] = "\\\\";
            strArr2[9] = "\\t";
            c2 = '\b';
        }
        int i25 = i23 & 35;
        int i26 = (i25 - (~((i23 ^ 35) | i25))) - 1;
        int i27 = i26 % 128;
        b = i27;
        int i28 = i26 % 2;
        strArr2[c2] = "\\b";
        strArr2[10] = "\\n";
        int i29 = ((i27 ^ 107) - (~((i27 & 107) << 1))) - 1;
        a = i29 % 128;
        if (i29 % 2 != 0) {
            strArr2[13] = "\\r";
            strArr2[125] = "\\f";
        } else {
            strArr2[13] = "\\r";
            strArr2[12] = "\\f";
        }
        String[] strArr3 = (String[]) strArr2.clone();
        d = strArr3;
        int i30 = a;
        int i31 = i30 ^ 101;
        int i32 = ((i30 & 101) | i31) << 1;
        int i33 = -i31;
        int i34 = ((i32 | i33) << 1) - (i32 ^ i33);
        int i35 = i34 % 128;
        b = i35;
        int i36 = i34 % 2;
        strArr3[60] = "\\u003c";
        strArr3[62] = "\\u003e";
        int i37 = i35 + 113;
        a = i37 % 128;
        if (i37 % 2 != 0) {
            strArr3[38] = "\\u0026";
            strArr3[83] = "\\u003d";
            c3 = '(';
        } else {
            strArr3[38] = "\\u0026";
            strArr3[61] = "\\u003d";
            c3 = '\'';
        }
        int i38 = i35 ^ 97;
        int i39 = (i35 & 97) << 1;
        int i40 = (i38 ^ i39) + ((i38 & i39) << 1);
        a = i40 % 128;
        int i41 = i40 % 2;
        strArr3[c3] = "\\u0027";
        int i42 = i35 ^ 69;
        int i43 = (((i35 & 69) | i42) << 1) - i42;
        a = i43 % 128;
        int i44 = i43 % 2;
    }
}
