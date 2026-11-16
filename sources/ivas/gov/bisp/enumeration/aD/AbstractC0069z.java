package ivas.gov.bisp.enumeration.aD;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aD.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0069z implements Iterable<Byte>, Serializable {
    private static int a = 1;
    private static int b;
    public static final AbstractC0069z c = new bjb(R.d);
    public static final biY d;
    public int e = 0;

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aD.z$biT */
    public static abstract class biT implements Iterator {
        private static int a = 1;
        private static int b;

        @Override // java.util.Iterator
        public Object next() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 65;
            int i4 = i3 + ((i2 ^ 65) | i3);
            a = i4 % 128;
            int i5 = i4 % 2;
            byte bC = ((C0059p) this).c();
            if (i5 != 0) {
                return Byte.valueOf(bC);
            }
            Byte.valueOf(bC);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            int i = 2 % 2;
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aD.z$biY */
    public interface biY {
        byte[] b(byte[] bArr, int i, int i2);
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aD.z$biZ */
    public static final class biZ implements biY {
        private static int a = 0;
        private static int b = 1;

        public biZ(C0059p c0059p) {
        }

        @Override // ivas.gov.bisp.enumeration.aD.AbstractC0069z.biY
        public final byte[] b(byte[] bArr, int i, int i2) {
            int i3 = 2 % 2;
            int i4 = a;
            int i5 = i4 & 3;
            int i6 = i5 + ((i4 ^ 3) | i5);
            b = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i2 & i;
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i, (i8 - (~((i2 ^ i) | i8))) - 1);
            int i9 = a;
            int i10 = ((((i9 ^ 119) | (i9 & 119)) << 1) - (~(-(((~i9) & 119) | (i9 & (-120)))))) - 1;
            b = i10 % 128;
            int i11 = i10 % 2;
            return bArrCopyOfRange;
        }
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aD.z$bja */
    public static abstract class bja extends AbstractC0069z {
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aD.z$bjb */
    public static class bjb extends bja {
        private static int a = 0;
        private static int b = 1;
        public final byte[] f;

        public bjb(byte[] bArr) {
            Objects.requireNonNull(bArr);
            this.f = bArr;
        }

        @Override // ivas.gov.bisp.enumeration.aD.AbstractC0069z
        public byte f(int i) {
            int i2 = 2 % 2;
            int i3 = b + 109;
            a = i3 % 128;
            int i4 = i3 % 2;
            byte[] bArr = this.f;
            if (i4 == 0) {
                return bArr[i];
            }
            byte b2 = bArr[i];
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.aD.AbstractC0069z
        public void g(byte[] bArr, int i, int i2, int i3) {
            int i4 = 2 % 2;
            int i5 = b + 81;
            a = i5 % 128;
            int i6 = i5 % 2;
            System.arraycopy(this.f, i, bArr, i2, i3);
            int i7 = b;
            int i8 = (((i7 | 18) << 1) - (i7 ^ 18)) - 1;
            a = i8 % 128;
            int i9 = i8 % 2;
        }

        @Override // ivas.gov.bisp.enumeration.aD.AbstractC0069z
        public byte h(int i) {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = i3 & 73;
            int i5 = (i3 ^ 73) | i4;
            int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
            b = i6 % 128;
            int i7 = i6 % 2;
            byte b2 = this.f[i];
            int i8 = (i3 & 46) + (i3 | 46);
            int i9 = (i8 ^ (-1)) + (i8 << 1);
            b = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 51 / 0;
            }
            return b2;
        }

        @Override // ivas.gov.bisp.enumeration.aD.AbstractC0069z
        public final AbstractC0069z l(int i, int i2) {
            int i3 = 2 % 2;
            int i4 = a;
            int i5 = i4 & 121;
            int i6 = ((i4 ^ 121) | i5) << 1;
            int i7 = -((i4 | 121) & (~i5));
            int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
            b = i8 % 128;
            int i9 = i8 % 2;
            int iC = AbstractC0069z.c(i, i2, size());
            Object obj = null;
            if (iC == 0) {
                int i10 = a;
                int i11 = i10 & 101;
                int i12 = (((i10 ^ 101) | i11) << 1) - ((i10 | 101) & (~i11));
                b = i12 % 128;
                int i13 = i12 % 2;
                AbstractC0069z abstractC0069z = AbstractC0069z.c;
                int i14 = b;
                int i15 = (((i14 & (-108)) | ((~i14) & 107)) - (~((i14 & 107) << 1))) - 1;
                a = i15 % 128;
                if (i15 % 2 == 0) {
                    return abstractC0069z;
                }
                obj.hashCode();
                throw null;
            }
            byte[] bArr = this.f;
            int iP = p();
            int i16 = -(-i);
            int i17 = iP ^ i16;
            int i18 = ((i16 & iP) | i17) << 1;
            int i19 = -i17;
            bjc bjcVar = new bjc(bArr, ((i18 | i19) << 1) - (i18 ^ i19), iC);
            int i20 = b;
            int i21 = i20 & 51;
            int i22 = i21 + ((i20 ^ 51) | i21);
            a = i22 % 128;
            if (i22 % 2 == 0) {
                return bjcVar;
            }
            obj.hashCode();
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.aD.AbstractC0069z
        public final String m(Charset charset) {
            int i = 2 % 2;
            String str = new String(this.f, p(), size(), charset);
            int i2 = a;
            int i3 = (i2 & 95) + (i2 | 95);
            b = i3 % 128;
            int i4 = i3 % 2;
            return str;
        }

        @Override // ivas.gov.bisp.enumeration.aD.AbstractC0069z
        public final void o(ivas.gov.bisp.enumeration.p096p.h hVar) {
            byte[] bArr;
            int iP;
            int size;
            int i = 2 % 2;
            int i2 = b + 81;
            a = i2 % 128;
            if (i2 % 2 != 0) {
                bArr = this.f;
                iP = p();
                size = size();
                int i3 = 54 / 0;
            } else {
                bArr = this.f;
                iP = p();
                size = size();
            }
            int i4 = b;
            int i5 = i4 & 51;
            int i6 = (((i4 | 51) & (~i5)) - (~(i5 << 1))) - 1;
            a = i6 % 128;
            int i7 = i6 % 2;
            ((AbstractC0064u.bji) hVar).ct(bArr, iP, size);
            int i8 = a;
            int i9 = (i8 & 88) + (i8 | 88);
            int i10 = (i9 ^ (-1)) + (i9 << 1);
            b = i10 % 128;
            if (i10 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public int p() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 ^ 113) + ((i2 & 113) << 1);
            a = i3 % 128;
            return i3 % 2 != 0 ? 1 : 0;
        }

        @Override // ivas.gov.bisp.enumeration.aD.AbstractC0069z
        public int size() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & (-114)) | ((~i2) & 113);
            int i4 = -(-((i2 & 113) << 1));
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            b = i5 % 128;
            int i6 = i5 % 2;
            byte[] bArr = this.f;
            if (i6 != 0) {
                return bArr.length;
            }
            int length = bArr.length;
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.aD.AbstractC0069z
        public final boolean i() {
            boolean zF;
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 ^ 115;
            int i4 = (((i2 & 115) | i3) << 1) - i3;
            a = i4 % 128;
            Object obj = null;
            if (i4 % 2 != 0) {
                p();
                size();
                obj.hashCode();
                throw null;
            }
            int iP = p();
            byte[] bArr = this.f;
            int size = size();
            int i5 = b;
            int i6 = ((i5 & (-76)) | ((~i5) & 75)) + ((i5 & 75) << 1);
            a = i6 % 128;
            if (i6 % 2 != 0) {
                zF = as.f(bArr, iP, size / iP);
            } else {
                int i7 = -(~(-(-iP)));
                zF = as.f(bArr, iP, ((size ^ i7) + ((size & i7) << 1)) - 1);
            }
            int i8 = a;
            int i9 = ((i8 | 63) << 1) - (i8 ^ 63);
            b = i9 % 128;
            if (i9 % 2 != 0) {
                return zF;
            }
            obj.hashCode();
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.aD.AbstractC0069z
        public final int j(int i, int i2, int i3) {
            int i4;
            int i5 = 2 % 2;
            int i6 = b + 17;
            a = i6 % 128;
            int i7 = i6 % 2;
            byte[] bArr = this.f;
            int iP = p();
            int i8 = -(-i2);
            int i9 = (iP & i8) + (i8 | iP);
            int i10 = b + 17;
            a = i10 % 128;
            int i11 = i10 % 2;
            Charset charset = R.c;
            int i12 = a;
            int i13 = (-2) - ((((i12 | 76) << 1) - (i12 ^ 76)) ^ (-1));
            b = i13 % 128;
            int i14 = i13 % 2;
            int i15 = i9;
            while (true) {
                int i16 = i9 & i3;
                int i17 = (i9 ^ i3) | i16;
                if (i15 >= ((i16 | i17) << 1) - (i16 ^ i17)) {
                    break;
                }
                int i18 = a;
                int i19 = i18 & 13;
                int i20 = (i19 - (~(-(-((i18 ^ 13) | i19))))) - 1;
                b = i20 % 128;
                if (i20 % 2 == 0) {
                    i = (i << 29) >> bArr[i15];
                    int i21 = i15 & 71;
                    int i22 = (i15 | 71) & (~i21);
                    int i23 = i21 << 1;
                    i4 = (i22 & i23) + (i22 | i23);
                } else {
                    int i24 = i * 31;
                    byte b2 = bArr[i15];
                    int i25 = ((i24 ^ b2) | (i24 & b2)) << 1;
                    int i26 = -(((~i24) & b2) | ((~b2) & i24));
                    int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
                    int i28 = i15 & 33;
                    int i29 = (i15 ^ 33) | i28;
                    int i30 = ((i28 | i29) << 1) - (i28 ^ i29);
                    int i31 = i30 & (-32);
                    int i32 = i30 | (-32);
                    i4 = (i31 & i32) + (i31 | i32);
                    i = i27;
                }
                i15 = i4;
                int i33 = i18 & 25;
                int i34 = (i18 | 25) & (~i33);
                int i35 = -(-(i33 << 1));
                int i36 = (i34 ^ i35) + ((i34 & i35) << 1);
                b = i36 % 128;
                int i37 = i36 % 2;
            }
            int i38 = a;
            int i39 = (i38 & (-58)) | ((~i38) & 57);
            int i40 = (i38 & 57) << 1;
            int i41 = (i39 ^ i40) + ((i40 & i39) << 1);
            b = i41 % 128;
            if (i41 % 2 != 0) {
                return i;
            }
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.aD.AbstractC0069z
        public final P k() {
            byte[] bArr;
            int iP;
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 31;
            int i4 = (i2 ^ 31) | i3;
            int i5 = (i3 & i4) + (i4 | i3);
            a = i5 % 128;
            if (i5 % 2 != 0) {
                bArr = this.f;
                iP = p();
                int i6 = 96 / 0;
            } else {
                bArr = this.f;
                iP = p();
            }
            P pE = P.e(bArr, iP, size(), true);
            int i7 = b;
            int i8 = i7 & 97;
            int i9 = (i7 | 97) & (~i8);
            int i10 = -(-(i8 << 1));
            int i11 = (i9 ^ i10) + ((i9 & i10) << 1);
            a = i11 % 128;
            if (i11 % 2 == 0) {
                return pE;
            }
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
        
            r6 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
        
            if ((!(r13 instanceof ivas.gov.bisp.enumeration.aD.AbstractC0069z)) == true) goto L78;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
        
            if (size() == ((ivas.gov.bisp.enumeration.aD.AbstractC0069z) r13).size()) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
        
            r13 = ivas.gov.bisp.enumeration.aD.AbstractC0069z.bjb.b + 67;
            r0 = r13 % 128;
            ivas.gov.bisp.enumeration.aD.AbstractC0069z.bjb.a = r0;
            r13 = r13 % 2;
            r13 = ((r0 & 21) - (~(-(-(r0 | 21))))) - 1;
            ivas.gov.bisp.enumeration.aD.AbstractC0069z.bjb.b = r13 % 128;
            r13 = r13 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
        
            if (size() != 0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
        
            r13 = ivas.gov.bisp.enumeration.aD.AbstractC0069z.bjb.b + 3;
            r0 = r13 % 128;
            ivas.gov.bisp.enumeration.aD.AbstractC0069z.bjb.a = r0;
            r13 = r13 % 2;
            r13 = ((r0 ^ 89) | (r0 & 89)) << 1;
            r0 = -(((~r0) & 89) | (r0 & (-90)));
            r2 = ((r13 | r0) << 1) - (r13 ^ r0);
            ivas.gov.bisp.enumeration.aD.AbstractC0069z.bjb.b = r2 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x007b, code lost:
        
            if ((r2 % 2) != 0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x007d, code lost:
        
            r13 = 47 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0080, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0084, code lost:
        
            if ((!(r13 instanceof ivas.gov.bisp.enumeration.aD.AbstractC0069z.bjb)) == true) goto L76;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0086, code lost:
        
            r2 = ivas.gov.bisp.enumeration.aD.AbstractC0069z.bjb.a + 43;
            ivas.gov.bisp.enumeration.aD.AbstractC0069z.bjb.b = r2 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x008f, code lost:
        
            if ((r2 % 2) == 0) goto L74;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0091, code lost:
        
            r13 = (ivas.gov.bisp.enumeration.aD.AbstractC0069z.bjb) r13;
            r2 = r12.e;
            r3 = r13.e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0097, code lost:
        
            if (r2 == 0) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0099, code lost:
        
            r7 = ivas.gov.bisp.enumeration.aD.AbstractC0069z.bjb.a;
            r8 = ((r7 | 99) << 1) - (r7 ^ 99);
            ivas.gov.bisp.enumeration.aD.AbstractC0069z.bjb.b = r8 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00a6, code lost:
        
            if ((r8 % 2) == 0) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00a8, code lost:
        
            if (r3 == 0) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00aa, code lost:
        
            if (r2 == r3) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00ac, code lost:
        
            r7 = r7 + 15;
            r13 = r7 % 128;
            ivas.gov.bisp.enumeration.aD.AbstractC0069z.bjb.b = r13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00b3, code lost:
        
            if ((r7 % 2) != 0) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00b6, code lost:
        
            r4 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00b7, code lost:
        
            r0 = r13 & 33;
            r13 = (r13 ^ 33) | r0;
            r2 = (r0 & r13) + (r13 | r0);
            ivas.gov.bisp.enumeration.aD.AbstractC0069z.bjb.a = r2 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00c5, code lost:
        
            if ((r2 % 2) != 0) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00c7, code lost:
        
            return r4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00c8, code lost:
        
            r6.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00cb, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00cc, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00cd, code lost:
        
            r2 = size();
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00d5, code lost:
        
            if (r2 > r13.size()) goto L72;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00d7, code lost:
        
            r3 = ivas.gov.bisp.enumeration.aD.AbstractC0069z.bjb.b;
            r7 = r3 & 89;
            r3 = (r3 | 89) & (~r7);
            r7 = -(-(r7 << 1));
            r8 = (r3 ^ r7) + ((r3 & r7) << 1);
            ivas.gov.bisp.enumeration.aD.AbstractC0069z.bjb.a = r8 % 128;
            r8 = r8 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00f2, code lost:
        
            if ((-(-r2)) > r13.size()) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00f4, code lost:
        
            r0 = ivas.gov.bisp.enumeration.aD.AbstractC0069z.bjb.a;
            r3 = (-2) - (((r0 & 112) + (r0 | 112)) ^ (-1));
            ivas.gov.bisp.enumeration.aD.AbstractC0069z.bjb.b = r3 % 128;
            r3 = r3 % 2;
            r3 = r12.f;
            r7 = r13.f;
            r8 = r0 & 103;
            r0 = ((r0 | 103) & (~r8)) + (r8 << 1);
            ivas.gov.bisp.enumeration.aD.AbstractC0069z.bjb.b = r0 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x0115, code lost:
        
            if ((r0 % 2) != 0) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x0117, code lost:
        
            r0 = p();
            r8 = p();
            r9 = 76 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0123, code lost:
        
            r0 = p();
            r8 = p();
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x012b, code lost:
        
            r9 = ivas.gov.bisp.enumeration.aD.AbstractC0069z.bjb.a;
            r10 = r9 & 81;
            r9 = (r9 ^ 81) | r10;
            r11 = (r10 & r9) + (r9 | r10);
            ivas.gov.bisp.enumeration.aD.AbstractC0069z.bjb.b = r11 % 128;
            r11 = r11 % 2;
            r13 = r13.p();
            r9 = ivas.gov.bisp.enumeration.aD.AbstractC0069z.bjb.b;
            r10 = ((r9 | 31) << 1) - (r9 ^ 31);
            ivas.gov.bisp.enumeration.aD.AbstractC0069z.bjb.a = r10 % 128;
            r10 = r10 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x014c, code lost:
        
            r9 = r0 & r2;
            r10 = -(-((r0 ^ r2) | r9));
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0157, code lost:
        
            if (r8 >= ((r9 & r10) + (r9 | r10))) goto L85;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x0159, code lost:
        
            r9 = ivas.gov.bisp.enumeration.aD.AbstractC0069z.bjb.a;
            r10 = ((r9 & 68) + (r9 | 68)) - 1;
            r9 = r10 % 128;
            ivas.gov.bisp.enumeration.aD.AbstractC0069z.bjb.b = r9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0167, code lost:
        
            if ((r10 % 2) == 0) goto L86;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x016d, code lost:
        
            if (r3[r8] == r7[r13]) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x016f, code lost:
        
            r13 = ((r9 ^ 17) | (r9 & 17)) << 1;
            r0 = -((r9 & (-18)) | ((~r9) & 17));
            r2 = (r13 ^ r0) + ((r13 & r0) << 1);
            r13 = r2 % 128;
            ivas.gov.bisp.enumeration.aD.AbstractC0069z.bjb.a = r13;
            r2 = r2 % 2;
            r0 = r13 & 75;
            r13 = (r13 ^ 75) | r0;
            r2 = (r0 & r13) + (r13 | r0);
            ivas.gov.bisp.enumeration.aD.AbstractC0069z.bjb.b = r2 % 128;
            r2 = r2 % 2;
            r13 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x0196, code lost:
        
            r8 = r8 + 1;
            r13 = r13 + 1;
            r9 = r9 + 47;
            ivas.gov.bisp.enumeration.aD.AbstractC0069z.bjb.a = r9 % 128;
            r9 = r9 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x01a2, code lost:
        
            r0 = r3[r8];
            r13 = r7[r13];
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
        
            if (r13 == r12) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x01a6, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x01a7, code lost:
        
            r13 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x01a8, code lost:
        
            r0 = ivas.gov.bisp.enumeration.aD.AbstractC0069z.bjb.b;
            r2 = (r0 ^ 107) + ((r0 & 107) << 1);
            ivas.gov.bisp.enumeration.aD.AbstractC0069z.bjb.a = r2 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x01b5, code lost:
        
            if ((r2 % 2) == 0) goto L65;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x01b7, code lost:
        
            r0 = 86 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x01ba, code lost:
        
            return r13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x01bb, code lost:
        
            r3 = new java.lang.StringBuilder();
            r3.append("Ran off end of other: ");
            r7 = ivas.gov.bisp.enumeration.aD.AbstractC0069z.bjb.a;
            r9 = r7 & 67;
            r4 = ((r7 ^ 67) | r9) << 1;
            r7 = -((r7 | 67) & (~r9));
            r8 = (r4 & r7) + (r4 | r7);
            ivas.gov.bisp.enumeration.aD.AbstractC0069z.bjb.b = r8 % 128;
            r8 = r8 % 2;
            r3.append(0);
            r3.append(", ");
            r4 = ivas.gov.bisp.enumeration.aD.AbstractC0069z.bjb.a + 107;
            ivas.gov.bisp.enumeration.aD.AbstractC0069z.bjb.b = r4 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x01eb, code lost:
        
            if ((r4 % 2) != 0) goto L70;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x01ed, code lost:
        
            r3.append(r2);
            r3.append(", ");
            r6.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x01f6, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x01f7, code lost:
        
            r3.append(r2);
            r3.append(", ");
            r3.append(r13.size());
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x020d, code lost:
        
            throw new java.lang.IllegalArgumentException(r3.toString());
         */
        /* JADX WARN: Code restructure failed: missing block: B:72:0x020e, code lost:
        
            r13 = new java.lang.StringBuilder();
            r13.append("Length too large: ");
            r13.append(r2);
            r13.append(size());
         */
        /* JADX WARN: Code restructure failed: missing block: B:73:0x022b, code lost:
        
            throw new java.lang.IllegalArgumentException(r13.toString());
         */
        /* JADX WARN: Code restructure failed: missing block: B:74:0x022c, code lost:
        
            r0 = r12.e;
            r13 = ((ivas.gov.bisp.enumeration.aD.AbstractC0069z.bjb) r13).e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x0232, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:76:0x0233, code lost:
        
            r13 = r13.equals(r12);
            r0 = ivas.gov.bisp.enumeration.aD.AbstractC0069z.bjb.b;
            r2 = ((r0 & 95) - (~(-(-(r0 | 95))))) - 1;
            ivas.gov.bisp.enumeration.aD.AbstractC0069z.bjb.a = r2 % 128;
            r2 = r2 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:77:0x0247, code lost:
        
            return r13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:78:0x0248, code lost:
        
            r13 = ((r3 ^ 31) - (~(-(-((r3 & 31) << 1))))) - 1;
            ivas.gov.bisp.enumeration.aD.AbstractC0069z.bjb.b = r13 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:79:0x0257, code lost:
        
            if ((r13 % 2) != 0) goto L81;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
        
            if (r13 == r12) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:80:0x0259, code lost:
        
            r5 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:81:0x025a, code lost:
        
            r13 = r3 & 105;
            r0 = (r3 ^ 105) | r13;
            r2 = (r13 ^ r0) + ((r13 & r0) << 1);
            ivas.gov.bisp.enumeration.aD.AbstractC0069z.bjb.b = r2 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:82:0x0269, code lost:
        
            if ((r2 % 2) == 0) goto L84;
         */
        /* JADX WARN: Code restructure failed: missing block: B:83:0x026b, code lost:
        
            return r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:84:0x026c, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
        
            r3 = r3 + 17;
            ivas.gov.bisp.enumeration.aD.AbstractC0069z.bjb.b = r3 % 128;
            r3 = r3 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
        
            return true;
         */
        @Override // ivas.gov.bisp.enumeration.aD.AbstractC0069z
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean equals(java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 621
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.aD.AbstractC0069z.bjb.equals(java.lang.Object):boolean");
        }
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aD.z$bjd */
    public static final class bjd implements biY {
        private static int a = 0;
        private static int b = 1;

        public bjd(C0059p c0059p) {
        }

        @Override // ivas.gov.bisp.enumeration.aD.AbstractC0069z.biY
        public final byte[] b(byte[] bArr, int i, int i2) {
            byte[] bArr2;
            int i3 = 2 % 2;
            int i4 = a + 59;
            b = i4 % 128;
            if (i4 % 2 == 0) {
                bArr2 = new byte[i2];
                System.arraycopy(bArr, i, bArr2, 0, i2);
            } else {
                bArr2 = new byte[i2];
                System.arraycopy(bArr, i, bArr2, 0, i2);
            }
            int i5 = a;
            int i6 = i5 & 53;
            int i7 = ((i5 | 53) & (~i6)) + (i6 << 1);
            int i8 = i7 % 128;
            b = i8;
            int i9 = i7 % 2;
            int i10 = i8 ^ 89;
            int i11 = -(-((i8 & 89) << 1));
            int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
            a = i12 % 128;
            if (i12 % 2 == 0) {
                return bArr2;
            }
            throw null;
        }
    }

    static {
        biY biz;
        int i = a;
        int i2 = i ^ 97;
        int i3 = ((i & 97) | i2) << 1;
        int i4 = -i2;
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        if (C0061r.b()) {
            biz = new bjd(null);
            int i7 = b;
            int i8 = i7 & 27;
            int i9 = (i7 ^ 27) | i8;
            int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
            a = i10 % 128;
            int i11 = i10 % 2;
            int i12 = 2 % 2;
        } else {
            biz = new biZ(null);
            int i13 = b;
            int i14 = i13 ^ 71;
            int i15 = (i13 & 71) << 1;
            int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
            a = i16 % 128;
            if (i16 % 2 != 0) {
                int i17 = 2 % 2;
            }
        }
        d = biz;
        int i18 = b;
        int i19 = (i18 & (-40)) | ((~i18) & 39);
        int i20 = -(-((i18 & 39) << 1));
        int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
        a = i21 % 128;
        if (i21 % 2 == 0) {
            throw null;
        }
    }

    public static AbstractC0069z d(byte[] bArr) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 | 91) << 1;
        int i4 = -(((~i2) & 91) | (i2 & (-92)));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        AbstractC0069z abstractC0069zE = e(bArr, 0, bArr.length);
        int i7 = b;
        int i8 = (i7 & 89) + (i7 | 89);
        a = i8 % 128;
        int i9 = i8 % 2;
        return abstractC0069zE;
    }

    public static AbstractC0069z e(byte[] bArr, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = i & i2;
        int i5 = (i ^ i2) | i4;
        c(i, ((i4 | i5) << 1) - (i4 ^ i5), bArr.length);
        bjb bjbVar = new bjb(d.b(bArr, i, i2));
        int i6 = a;
        int i7 = i6 & 57;
        int i8 = -(-((i6 ^ 57) | i7));
        int i9 = (i7 & i8) + (i8 | i7);
        b = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 64 / 0;
        }
        return bjbVar;
    }

    public abstract boolean equals(Object obj);

    public abstract byte f(int i);

    public abstract void g(byte[] bArr, int i, int i2, int i3);

    public abstract byte h(int i);

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 47;
        int i4 = -(-((i2 ^ 47) | i3));
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        a = i5 % 128;
        int i6 = i5 % 2;
        int i7 = this.e;
        if (i7 == 0) {
            int i8 = ((i2 | 122) << 1) - (i2 ^ 122);
            int i9 = (i8 ^ (-1)) + (i8 << 1);
            a = i9 % 128;
            int i10 = i9 % 2;
            int size = size();
            int iJ = j(size, 0, size);
            if (iJ == 0) {
                int i11 = a;
                int i12 = i11 & 57;
                int i13 = ((i11 | 57) & (~i12)) + (i12 << 1);
                b = i13 % 128;
                iJ = i13 % 2 != 0 ? 0 : 1;
            }
            i7 = iJ;
            this.e = i7;
            int i14 = b;
            int i15 = i14 & 63;
            int i16 = ((i14 ^ 63) | i15) << 1;
            int i17 = -((i14 | 63) & (~i15));
            int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
            a = i18 % 128;
            int i19 = i18 % 2;
        }
        int i20 = a;
        int i21 = ((i20 & 120) + (i20 | 120)) - 1;
        b = i21 % 128;
        if (i21 % 2 != 0) {
            int i22 = 96 / 0;
        }
        return i7;
    }

    public abstract boolean i();

    @Override // java.lang.Iterable
    public Iterator<Byte> iterator() {
        int i = 2 % 2;
        C0059p c0059p = new C0059p(this);
        int i2 = b;
        int i3 = i2 | 93;
        int i4 = i3 << 1;
        int i5 = -((~(i2 & 93)) & i3);
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        a = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 73 / 0;
        }
        return c0059p;
    }

    public abstract int j(int i, int i2, int i3);

    public abstract P k();

    public abstract AbstractC0069z l(int i, int i2);

    public abstract String m(Charset charset);

    public abstract void o(ivas.gov.bisp.enumeration.p096p.h hVar);

    public abstract int size();

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aD.z$bjc */
    public static final class bjc extends bjb {
        private static int a = 1;
        private static int b;
        public final int g;
        public final int h;

        public bjc(byte[] bArr, int i, int i2) {
            super(bArr);
            int i3 = i ^ i2;
            int i4 = -(-((i & i2) << 1));
            AbstractC0069z.c(i, ((i3 | i4) << 1) - (i3 ^ i4), bArr.length);
            this.g = i;
            this.h = i2;
        }

        @Override // ivas.gov.bisp.enumeration.aD.AbstractC0069z.bjb, ivas.gov.bisp.enumeration.aD.AbstractC0069z
        public final byte h(int i) {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = ((i3 ^ 4) + ((i3 & 4) << 1)) - 1;
            b = i4 % 128;
            int i5 = i4 % 2;
            byte[] bArr = this.f;
            int i6 = this.g;
            int i7 = -(-i);
            byte b2 = bArr[((i6 & i7) - (~(-(-(i7 | i6))))) - 1];
            int i8 = b;
            int i9 = i8 & 59;
            int i10 = i9 + ((i8 ^ 59) | i9);
            a = i10 % 128;
            int i11 = i10 % 2;
            return b2;
        }

        @Override // ivas.gov.bisp.enumeration.aD.AbstractC0069z.bjb
        public final int p() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (((i2 | 100) << 1) - (i2 ^ 100)) - 1;
            int i4 = i3 % 128;
            b = i4;
            int i5 = i3 % 2;
            int i6 = this.g;
            int i7 = (i4 & 125) + (i4 | 125);
            a = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 78 / 0;
            }
            return i6;
        }

        @Override // ivas.gov.bisp.enumeration.aD.AbstractC0069z.bjb, ivas.gov.bisp.enumeration.aD.AbstractC0069z
        public final int size() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (((i2 | 120) << 1) - (i2 ^ 120)) - 1;
            a = i3 % 128;
            int i4 = i3 % 2;
            int i5 = this.h;
            int i6 = i2 & 89;
            int i7 = ((((i2 ^ 89) | i6) << 1) - (~(-((i2 | 89) & (~i6))))) - 1;
            a = i7 % 128;
            if (i7 % 2 != 0) {
                return i5;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.aD.AbstractC0069z.bjb, ivas.gov.bisp.enumeration.aD.AbstractC0069z
        public final void g(byte[] bArr, int i, int i2, int i3) {
            int i4 = 2 % 2;
            int i5 = a;
            int i6 = ((i5 & 64) + (i5 | 64)) - 1;
            b = i6 % 128;
            int i7 = i6 % 2;
            byte[] bArr2 = this.f;
            int i8 = this.g;
            int i9 = a;
            int i10 = i9 ^ 23;
            int i11 = ((i9 & 23) | i10) << 1;
            int i12 = -i10;
            int i13 = ((i11 | i12) << 1) - (i11 ^ i12);
            b = i13 % 128;
            int i14 = i13 % 2;
            System.arraycopy(bArr2, (i8 - (~i)) - 1, bArr, i2, i3);
            int i15 = b;
            int i16 = i15 & 117;
            int i17 = (i16 - (~(-(-((i15 ^ 117) | i16))))) - 1;
            a = i17 % 128;
            if (i17 % 2 == 0) {
                int i18 = 12 / 0;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
        
            r2 = new java.lang.StringBuilder();
            r2.append("Index > length: ");
            r3 = ivas.gov.bisp.enumeration.aD.AbstractC0069z.bjc.a;
            r5 = r3 & 107;
            r4 = ((r3 ^ 107) | r5) << 1;
            r3 = -((r3 | 107) & (~r5));
            r5 = ((r4 | r3) << 1) - (r3 ^ r4);
            ivas.gov.bisp.enumeration.aD.AbstractC0069z.bjc.b = r5 % 128;
            r5 = r5 % 2;
            r2.append(r7);
            r2.append(", ");
            r2.append(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0070, code lost:
        
            throw new java.lang.ArrayIndexOutOfBoundsException(r2.toString());
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x007c, code lost:
        
            throw new java.lang.ArrayIndexOutOfBoundsException(ivas.gov.bisp.enumeration.p091n.j.o("Index < 0: ", r7));
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x007d, code lost:
        
            r1 = r6.f;
            r2 = r6.g;
            r7 = -(~(-(-r7)));
            r7 = r1[((r2 & r7) + (r7 | r2)) - 1];
            r1 = ivas.gov.bisp.enumeration.aD.AbstractC0069z.bjc.b;
            r2 = r1 ^ 71;
            r1 = ((r1 & 71) | r2) << 1;
            r2 = -r2;
            r3 = (r1 ^ r2) + ((r1 & r2) << 1);
            ivas.gov.bisp.enumeration.aD.AbstractC0069z.bjc.a = r3 % 128;
            r3 = r3 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x00a2, code lost:
        
            return r7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
        
            if ((((r1 ^ r7) + ((r1 & r7) << 1)) & r7) < 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
        
            if (((((~r7) & r4) | ((~r4) & r7)) | (r4 & r7)) < 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
        
            if (r7 < 0) goto L12;
         */
        @Override // ivas.gov.bisp.enumeration.aD.AbstractC0069z.bjb, ivas.gov.bisp.enumeration.aD.AbstractC0069z
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final byte f(int r7) {
            /*
                r6 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = ivas.gov.bisp.enumeration.aD.AbstractC0069z.bjc.b
                r2 = r1 & 19
                r1 = r1 | 19
                int r2 = r2 + r1
                int r1 = r2 % 128
                ivas.gov.bisp.enumeration.aD.AbstractC0069z.bjc.a = r1
                int r2 = r2 % r0
                int r1 = r6.h
                if (r2 != 0) goto L1e
                r2 = r1 ^ r7
                r3 = r1 & r7
                int r3 = r3 << 1
                int r2 = r2 + r3
                r2 = r2 & r7
                if (r2 >= 0) goto L7d
                goto L37
            L1e:
                int r2 = r7 + 1
                int r2 = -r2
                r3 = r1 & r2
                r2 = r2 ^ r1
                r2 = r2 | r3
                int r2 = -r2
                int r2 = -r2
                r4 = r3 | r2
                int r4 = r4 << 1
                r2 = r2 ^ r3
                int r4 = r4 - r2
                int r2 = ~r7
                r2 = r2 & r4
                int r3 = ~r4
                r3 = r3 & r7
                r2 = r2 | r3
                r3 = r4 & r7
                r2 = r2 | r3
                if (r2 >= 0) goto L7d
            L37:
                if (r7 < 0) goto L71
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Index > length: "
                r2.append(r3)
                int r3 = ivas.gov.bisp.enumeration.aD.AbstractC0069z.bjc.a
                r4 = r3 ^ 107(0x6b, float:1.5E-43)
                r5 = r3 & 107(0x6b, float:1.5E-43)
                r4 = r4 | r5
                int r4 = r4 << 1
                int r5 = ~r5
                r3 = r3 | 107(0x6b, float:1.5E-43)
                r3 = r3 & r5
                int r3 = -r3
                r5 = r4 | r3
                int r5 = r5 << 1
                r3 = r3 ^ r4
                int r5 = r5 - r3
                int r3 = r5 % 128
                ivas.gov.bisp.enumeration.aD.AbstractC0069z.bjc.b = r3
                int r5 = r5 % r0
                r2.append(r7)
                java.lang.String r7 = ", "
                r2.append(r7)
                r2.append(r1)
                java.lang.ArrayIndexOutOfBoundsException r7 = new java.lang.ArrayIndexOutOfBoundsException
                java.lang.String r0 = r2.toString()
                r7.<init>(r0)
                throw r7
            L71:
                java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
                java.lang.String r1 = "Index < 0: "
                java.lang.String r7 = ivas.gov.bisp.enumeration.p091n.j.o(r1, r7)
                r0.<init>(r7)
                throw r0
            L7d:
                byte[] r1 = r6.f
                int r2 = r6.g
                int r7 = -r7
                int r7 = -r7
                int r7 = ~r7
                int r7 = -r7
                r3 = r2 & r7
                r7 = r7 | r2
                int r3 = r3 + r7
                int r3 = r3 + (-1)
                r7 = r1[r3]
                int r1 = ivas.gov.bisp.enumeration.aD.AbstractC0069z.bjc.b
                r2 = r1 ^ 71
                r1 = r1 & 71
                r1 = r1 | r2
                int r1 = r1 << 1
                int r2 = -r2
                r3 = r1 ^ r2
                r1 = r1 & r2
                int r1 = r1 << 1
                int r3 = r3 + r1
                int r1 = r3 % 128
                ivas.gov.bisp.enumeration.aD.AbstractC0069z.bjc.a = r1
                int r3 = r3 % r0
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.aD.AbstractC0069z.bjc.f(int):byte");
        }
    }

    public static int c(int i, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = (i5 ^ 102) + ((i5 & 102) << 1);
        int i7 = (i6 ^ (-1)) + (i6 << 1);
        int i8 = i7 % 128;
        b = i8;
        int i9 = i7 % 2;
        int i10 = -i;
        int i11 = (i2 & i10) + (i10 | i2);
        int i12 = ((~i2) & i) | ((~i) & i2);
        int i13 = i & i2;
        int i14 = (i12 & i13) | (i12 ^ i13);
        int i15 = (i14 & i11) | (i14 ^ i11);
        int i16 = -i2;
        int i17 = i3 & i16;
        int i18 = (i16 ^ i3) | i17;
        int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
        if (((i15 & i19) | (i15 ^ i19)) >= 0) {
            int i20 = i8 & 117;
            int i21 = ((i8 ^ 117) | i20) << 1;
            int i22 = -((~i20) & (i8 | 117));
            int i23 = ((i21 | i22) << 1) - (i21 ^ i22);
            a = i23 % 128;
            int i24 = i23 % 2;
            return i11;
        }
        int i25 = i5 & 65;
        int i26 = -(-(i5 | 65));
        int i27 = ((i25 | i26) << 1) - (i25 ^ i26);
        b = i27 % 128;
        Object obj = null;
        if (i27 % 2 != 0) {
            throw null;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Beginning index: ");
            int i28 = b;
            int i29 = (i28 | 23) << 1;
            int i30 = -(i28 ^ 23);
            int i31 = (i29 ^ i30) + ((i30 & i29) << 1);
            a = i31 % 128;
            int i32 = i31 % 2;
            sb.append(i);
            sb.append(" < 0");
            if (i32 == 0) {
                throw null;
            }
            throw new IndexOutOfBoundsException(sb.toString());
        }
        int i33 = (((i5 & (-72)) | ((~i5) & 71)) - (~((i5 & 71) << 1))) - 1;
        b = i33 % 128;
        int i34 = i33 % 2;
        if (i2 < i) {
            StringBuilder sb2 = new StringBuilder();
            int i35 = a + 15;
            b = i35 % 128;
            int i36 = i35 % 2;
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            int i37 = a;
            int i38 = ((i37 ^ 79) - (~(-(-((i37 & 79) << 1))))) - 1;
            b = i38 % 128;
            if (i38 % 2 == 0) {
                sb2.append(", ");
                sb2.append(i2);
                throw new IndexOutOfBoundsException(sb2.toString());
            }
            sb2.append(", ");
            sb2.append(i2);
            obj.hashCode();
            throw null;
        }
        StringBuilder sb3 = new StringBuilder();
        int i39 = a;
        int i40 = ((i39 ^ 55) | (i39 & 55)) << 1;
        int i41 = -(((~i39) & 55) | (i39 & (-56)));
        int i42 = (i40 & i41) + (i41 | i40);
        b = i42 % 128;
        int i43 = i42 % 2;
        sb3.append("End index: ");
        sb3.append(i2);
        if (i43 != 0) {
            obj.hashCode();
            throw null;
        }
        int i44 = a + 93;
        b = i44 % 128;
        int i45 = i44 % 2;
        sb3.append(" >= ");
        sb3.append(i3);
        throw new IndexOutOfBoundsException(sb3.toString());
    }

    public final byte[] n() {
        int i = 2 % 2;
        int i2 = b + 105;
        a = i2 % 128;
        int i3 = i2 % 2;
        int size = size();
        if (size != 0) {
            byte[] bArr = new byte[size];
            g(bArr, 0, 0, size);
            int i4 = a;
            int i5 = (i4 ^ 53) + ((i4 & 53) << 1);
            b = i5 % 128;
            int i6 = i5 % 2;
            return bArr;
        }
        int i7 = b;
        int i8 = (i7 & 19) + (i7 | 19);
        a = i8 % 128;
        if (i8 % 2 == 0) {
            byte[] bArr2 = R.d;
            throw null;
        }
        byte[] bArr3 = R.d;
        int i9 = a + 28;
        int i10 = (i9 ^ (-1)) + (i9 << 1);
        b = i10 % 128;
        int i11 = i10 % 2;
        return bArr3;
    }

    public final String toString() {
        Locale locale;
        Object[] objArr;
        int iIdentityHashCode;
        char c2;
        String strS;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-30)) | ((~i2) & 29);
        int i4 = -(-((i2 & 29) << 1));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        if (i5 % 2 == 0) {
            locale = Locale.ROOT;
            objArr = new Object[2];
            iIdentityHashCode = System.identityHashCode(this);
            c2 = 1;
        } else {
            locale = Locale.ROOT;
            objArr = new Object[3];
            iIdentityHashCode = System.identityHashCode(this);
            c2 = 0;
        }
        objArr[c2] = Integer.toHexString(iIdentityHashCode);
        objArr[1] = Integer.valueOf(size());
        int i6 = b + 88;
        int i7 = (i6 ^ (-1)) + (i6 << 1);
        a = i7 % 128;
        Object obj = null;
        if (i7 % 2 != 0 ? size() > 50 : size() > 81) {
            StringBuilder sb = new StringBuilder();
            int i8 = b;
            int i9 = (i8 ^ 73) + ((i8 & 73) << 1);
            a = i9 % 128;
            if (i9 % 2 == 0) {
                sb.append(ivas.gov.bisp.enumeration.O.r.s(l(0, 47)));
                int i10 = 84 / 0;
            } else {
                sb.append(ivas.gov.bisp.enumeration.O.r.s(l(0, 47)));
            }
            sb.append("...");
            strS = sb.toString();
            int i11 = (-2) - ((b + 116) ^ (-1));
            a = i11 % 128;
            int i12 = i11 % 2;
        } else {
            int i13 = (-2) - ((b + 44) ^ (-1));
            a = i13 % 128;
            if (i13 % 2 == 0) {
                ivas.gov.bisp.enumeration.O.r.s(this);
                throw null;
            }
            strS = ivas.gov.bisp.enumeration.O.r.s(this);
        }
        objArr[2] = strS;
        String str = String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
        int i14 = b;
        int i15 = i14 ^ 33;
        int i16 = ((i14 & 33) | i15) << 1;
        int i17 = -i15;
        int i18 = (i16 ^ i17) + ((i16 & i17) << 1);
        a = i18 % 128;
        if (i18 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }
}
