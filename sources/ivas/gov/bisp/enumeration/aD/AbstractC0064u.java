package ivas.gov.bisp.enumeration.aD;

import ivas.gov.bisp.enumeration.o000O000.OooOo00;
import ivas.gov.bisp.enumeration.o000O000.oo00o;
import java.io.IOException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aD.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0064u extends ivas.gov.bisp.enumeration.p096p.h {
    private static int a = 1;
    private static int b;
    public static final Logger d = Logger.getLogger(AbstractC0064u.class.getName());
    public static final boolean e;
    public C0055l f;

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aD.u$bji */
    public static class bji extends AbstractC0064u {
        private static int a = 1;
        private static int b;
        public final byte[] g;
        public final int h;
        public int i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public bji(byte[] bArr, int i, int i2) {
            Integer numValueOf;
            super(null);
            Object obj = null;
            Objects.requireNonNull(bArr, "buffer");
            int length = bArr.length;
            int i3 = (i - (~(-(-i2)))) - 1;
            int i4 = i ^ i2;
            int i5 = i & i2;
            int i6 = (i4 & i5) | (i4 ^ i5);
            int i7 = -i3;
            int i8 = length & i7;
            int i9 = (length ^ i7) | i8;
            if ((i6 | ((i8 & i9) + (i9 | i8))) >= 0) {
                this.g = bArr;
                this.i = i;
                int i10 = a;
                int i11 = i10 & 89;
                int i12 = (i11 - (~(-(-((i10 ^ 89) | i11))))) - 1;
                b = i12 % 128;
                if (i12 % 2 == 0) {
                    this.h = i3;
                    return;
                } else {
                    this.h = i3;
                    obj.hashCode();
                    throw null;
                }
            }
            Object[] objArr = new Object[3];
            Integer numValueOf2 = Integer.valueOf(bArr.length);
            int i13 = a;
            int i14 = i13 ^ 5;
            int i15 = -(-((i13 & 5) << 1));
            int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
            b = i16 % 128;
            if (i16 % 2 != 0) {
                objArr[0] = numValueOf2;
                objArr[0] = Integer.valueOf(i);
                numValueOf = Integer.valueOf(i2);
            } else {
                objArr[0] = numValueOf2;
                objArr[1] = Integer.valueOf(i);
                numValueOf = Integer.valueOf(i2);
            }
            objArr[2] = numValueOf;
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", objArr));
        }

        @Override // ivas.gov.bisp.enumeration.aD.AbstractC0064u
        public final int ca() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & (-54)) | ((~i2) & 53);
            int i4 = (i2 & 53) << 1;
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            int i6 = i5 % 128;
            b = i6;
            int i7 = i5 % 2;
            int i8 = (this.h - (~(-this.i))) - 1;
            int i9 = ((i6 | 87) << 1) - (i6 ^ 87);
            a = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 61 / 0;
            }
            return i8;
        }

        @Override // ivas.gov.bisp.enumeration.aD.AbstractC0064u
        public final void cb(byte b2) throws bjj {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 & 17) - (~(i2 | 17))) - 1;
            int i4 = i3 % 128;
            a = i4;
            try {
                if (i3 % 2 == 0) {
                    try {
                        throw null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                byte[] bArr = this.g;
                int i5 = this.i;
                int i6 = i4 + 11;
                b = i6 % 128;
                if (i6 % 2 != 0) {
                    this.i = i5 % 1;
                    bArr[i5] = b2;
                } else {
                    this.i = ((i5 & (-2)) | ((~i5) & 1)) + ((i5 & 1) << 1);
                    bArr[i5] = b2;
                }
            } catch (IndexOutOfBoundsException e) {
                throw new bjj(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.i), Integer.valueOf(this.h), 1), e);
            }
        }

        @Override // ivas.gov.bisp.enumeration.aD.AbstractC0064u
        public final void cc(int i, AbstractC0069z abstractC0069z) {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = (i3 & 117) + (i3 | 117);
            a = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i << 3;
            cp((i6 & 2) | (i6 & (-3)) | ((~i6) & 2));
            cN(abstractC0069z);
            int i7 = a;
            int i8 = ((i7 & 59) - (~(-(-(i7 | 59))))) - 1;
            b = i8 % 128;
            int i9 = i8 % 2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
        
            if ((r6 % 2) == 0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
        
            cs(r6);
            r5 = ivas.gov.bisp.enumeration.aD.AbstractC0064u.bji.a;
            r6 = (r5 | 75) << 1;
            r5 = -(((~r5) & 75) | (r5 & (-76)));
            r1 = ((r6 | r5) << 1) - (r5 ^ r6);
            ivas.gov.bisp.enumeration.aD.AbstractC0064u.bji.b = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0058, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
        
            if (r6 >= 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
        
            if (r6 >= 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
        
            cp(r6);
            r5 = ivas.gov.bisp.enumeration.aD.AbstractC0064u.bji.b;
            r6 = r5 & 63;
            r6 = r6 + ((r5 ^ 63) | r6);
            ivas.gov.bisp.enumeration.aD.AbstractC0064u.bji.a = r6 % 128;
         */
        @Override // ivas.gov.bisp.enumeration.aD.AbstractC0064u
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void ci(int r5, int r6) {
            /*
                r4 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = ivas.gov.bisp.enumeration.aD.AbstractC0064u.bji.a
                r2 = r1 & (-94)
                int r3 = ~r1
                r3 = r3 & 93
                r2 = r2 | r3
                r1 = r1 & 93
                int r1 = r1 << 1
                int r2 = r2 + r1
                int r1 = r2 % 128
                ivas.gov.bisp.enumeration.aD.AbstractC0064u.bji.b = r1
                int r2 = r2 % r0
                if (r2 == 0) goto L1f
                int r5 = r5 % 4
                r4.cp(r5)
                if (r6 < 0) goto L3b
                goto L26
            L1f:
                int r5 = r5 << 3
                r4.cp(r5)
                if (r6 < 0) goto L3b
            L26:
                r4.cp(r6)
                int r5 = ivas.gov.bisp.enumeration.aD.AbstractC0064u.bji.b
                r6 = r5 & 63
                r5 = r5 ^ 63
                r5 = r5 | r6
                int r6 = r6 + r5
                int r5 = r6 % 128
                ivas.gov.bisp.enumeration.aD.AbstractC0064u.bji.a = r5
                int r6 = r6 % r0
                if (r6 == 0) goto L39
                return
            L39:
                r5 = 0
                throw r5
            L3b:
                long r5 = (long) r6
                r4.cs(r5)
                int r5 = ivas.gov.bisp.enumeration.aD.AbstractC0064u.bji.a
                r6 = r5 | 75
                int r6 = r6 << 1
                r1 = r5 & (-76)
                int r5 = ~r5
                r2 = 75
                r5 = r5 & r2
                r5 = r5 | r1
                int r5 = -r5
                r1 = r6 | r5
                int r1 = r1 << 1
                r5 = r5 ^ r6
                int r1 = r1 - r5
                int r5 = r1 % 128
                ivas.gov.bisp.enumeration.aD.AbstractC0064u.bji.b = r5
                int r1 = r1 % r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.aD.AbstractC0064u.bji.ci(int, int):void");
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0044, code lost:
        
            r5 = 19 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0049, code lost:
        
            cs(r5);
            r5 = (-2) - ((ivas.gov.bisp.enumeration.aD.AbstractC0064u.bji.b + 124) ^ (-1));
            ivas.gov.bisp.enumeration.aD.AbstractC0064u.bji.a = r5 % 128;
            r5 = r5 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x005a, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        
            if (r5 >= 0) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
        
            if (r5 >= 0) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
        
            r1 = r2 & 109;
            r2 = r2 | 109;
            r3 = ((r1 | r2) << 1) - (r1 ^ r2);
            ivas.gov.bisp.enumeration.aD.AbstractC0064u.bji.b = r3 % 128;
            r3 = r3 % 2;
            cp(r5);
            r5 = ivas.gov.bisp.enumeration.aD.AbstractC0064u.bji.a;
            r1 = ((((r5 ^ 73) | (r5 & 73)) << 1) - (~(-(((~r5) & 73) | (r5 & (-74)))))) - 1;
            ivas.gov.bisp.enumeration.aD.AbstractC0064u.bji.b = r1 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0042, code lost:
        
            if ((r1 % 2) == 0) goto L14;
         */
        @Override // ivas.gov.bisp.enumeration.aD.AbstractC0064u
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void ck(int r5) {
            /*
                r4 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = ivas.gov.bisp.enumeration.aD.AbstractC0064u.bji.b
                int r1 = r1 + 109
                int r2 = r1 % 128
                ivas.gov.bisp.enumeration.aD.AbstractC0064u.bji.a = r2
                int r1 = r1 % r0
                if (r1 != 0) goto L15
                r1 = 40
                int r1 = r1 / 0
                if (r5 < 0) goto L49
                goto L17
            L15:
                if (r5 < 0) goto L49
            L17:
                r1 = r2 & 109(0x6d, float:1.53E-43)
                r2 = r2 | 109(0x6d, float:1.53E-43)
                r3 = r1 | r2
                int r3 = r3 << 1
                r1 = r1 ^ r2
                int r3 = r3 - r1
                int r1 = r3 % 128
                ivas.gov.bisp.enumeration.aD.AbstractC0064u.bji.b = r1
                int r3 = r3 % r0
                r4.cp(r5)
                int r5 = ivas.gov.bisp.enumeration.aD.AbstractC0064u.bji.a
                r1 = r5 ^ 73
                r2 = r5 & 73
                r1 = r1 | r2
                int r1 = r1 << 1
                r2 = r5 & (-74)
                int r5 = ~r5
                r5 = r5 & 73
                r5 = r5 | r2
                int r5 = -r5
                int r5 = ~r5
                int r1 = r1 - r5
                int r1 = r1 + (-1)
                int r5 = r1 % 128
                ivas.gov.bisp.enumeration.aD.AbstractC0064u.bji.b = r5
                int r1 = r1 % r0
                if (r1 == 0) goto L48
                r5 = 19
                int r5 = r5 / 0
            L48:
                return
            L49:
                long r1 = (long) r5
                r4.cs(r1)
                int r5 = ivas.gov.bisp.enumeration.aD.AbstractC0064u.bji.b
                int r5 = r5 + 124
                r5 = r5 ^ (-1)
                int r5 = (-2) - r5
                int r1 = r5 % 128
                ivas.gov.bisp.enumeration.aD.AbstractC0064u.bji.a = r1
                int r5 = r5 % r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.aD.AbstractC0064u.bji.ck(int):void");
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: ivas.gov.bisp.enumeration.o000O000.OooOo00$OooO0OO */
        @Override // ivas.gov.bisp.enumeration.aD.AbstractC0064u
        public final void cm(int i, String str) throws OooOo00.OooO0OO, bjj {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = (((i3 & (-22)) | ((~i3) & 21)) - (~((i3 & 21) << 1))) - 1;
            b = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i << 3;
            int i7 = i6 & 2;
            int i8 = (i6 | 2) & (~i7);
            cp((i8 & i7) | (i8 ^ i7));
            cO(str);
            int i9 = b;
            int i10 = i9 & 63;
            int i11 = (i10 - (~(-(-((i9 ^ 63) | i10))))) - 1;
            a = i11 % 128;
            if (i11 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.aD.AbstractC0064u
        public final void co(int i, int i2) {
            int i3;
            int i4 = 2 % 2;
            int i5 = b;
            int i6 = i5 & 93;
            int i7 = ((i5 | 93) & (~i6)) + (i6 << 1);
            a = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = i & 5;
                int i9 = -(-((i ^ 5) | i8));
                int i10 = (i8 & i9) + (i9 | i8);
                i3 = ((~i2) & i10) | (i2 & (~i10));
            } else {
                int i11 = i << 3;
                int i12 = ((~i2) & i11) | ((~i11) & i2);
                int i13 = i11 & i2;
                i3 = (i13 & i12) | (i12 ^ i13);
            }
            cp(i3);
            int i14 = a;
            int i15 = (i14 | 7) << 1;
            int i16 = -(((~i14) & 7) | (i14 & (-8)));
            int i17 = (i15 & i16) + (i16 | i15);
            b = i17 % 128;
            if (i17 % 2 != 0) {
                int i18 = 91 / 0;
            }
        }

        @Override // ivas.gov.bisp.enumeration.aD.AbstractC0064u
        public final void cr(int i, long j) {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = i3 & 27;
            int i5 = (i3 ^ 27) | i4;
            int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
            b = i6 % 128;
            int i7 = i6 % 2;
            cp(i << 3);
            int i8 = b + 17;
            a = i8 % 128;
            int i9 = i8 % 2;
            cs(j);
            int i10 = b;
            int i11 = i10 & 9;
            int i12 = ((i10 ^ 9) | i11) << 1;
            int i13 = -((i10 | 9) & (~i11));
            int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
            a = i14 % 128;
            if (i14 % 2 == 0) {
                int i15 = 25 / 0;
            }
        }

        public final void cN(AbstractC0069z abstractC0069z) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 121;
            int i4 = (i2 | 121) & (~i3);
            int i5 = -(-(i3 << 1));
            int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
            a = i6 % 128;
            int i7 = i6 % 2;
            cp(abstractC0069z.size());
            abstractC0069z.o(this);
            int i8 = a + 13;
            b = i8 % 128;
            int i9 = i8 % 2;
        }

        @Override // ivas.gov.bisp.enumeration.aD.AbstractC0064u
        public final void cd(int i, boolean z) {
            int i2 = 2 % 2;
            int i3 = b + 19;
            a = i3 % 128;
            int i4 = i3 % 2;
            cp(i << 3);
            byte b2 = z ? (byte) 1 : (byte) 0;
            int i5 = b + 81;
            a = i5 % 128;
            if (i5 % 2 != 0) {
                cb(b2);
                return;
            }
            cb(b2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.aD.AbstractC0064u
        public final void ce(int i, int i2) {
            int i3;
            int i4 = 2 % 2;
            int i5 = a;
            int i6 = (i5 & (-78)) | ((~i5) & 77);
            int i7 = (i5 & 77) << 1;
            int i8 = (i6 & i7) + (i7 | i6);
            b = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = i / 5;
                i3 = ((~i9) & 2) ^ (i9 & (-3));
            } else {
                int i10 = i << 3;
                i3 = (i10 & 5) | (i10 ^ 5);
            }
            cp(i3);
            cf(i2);
            int i11 = a + 45;
            b = i11 % 128;
            int i12 = i11 % 2;
        }

        @Override // ivas.gov.bisp.enumeration.aD.AbstractC0064u
        public final void cg(int i, long j) {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = (((i3 | 96) << 1) - (i3 ^ 96)) - 1;
            a = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i << 3;
            int i7 = i6 & 1;
            int i8 = (i6 | 1) & (~i7);
            cp((i8 & i7) | (i8 ^ i7));
            cj(j);
            int i9 = b;
            int i10 = (i9 & 67) + (i9 | 67);
            a = i10 % 128;
            int i11 = i10 % 2;
        }

        @Override // ivas.gov.bisp.enumeration.aD.AbstractC0064u
        public final void cl(int i, aa aaVar, ah ahVar) {
            int i2;
            C0055l c0055l;
            int i3 = 2 % 2;
            int i4 = b;
            int i5 = i4 & 113;
            int i6 = (((i4 | 113) & (~i5)) - (~(-(-(i5 << 1))))) - 1;
            a = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = i << 3;
                i2 = (i7 & 3) | (i7 ^ 3);
            } else {
                int i8 = i << 3;
                int i9 = i8 & 2;
                int i10 = (i8 | 2) & (~i9);
                i2 = (i10 & i9) | (i10 ^ i9);
            }
            cp(i2);
            AbstractC0053j abstractC0053j = (AbstractC0053j) aaVar;
            int i11 = b;
            int i12 = (-2) - ((((i11 | 86) << 1) - (i11 ^ 86)) ^ (-1));
            a = i12 % 128;
            if (i12 % 2 == 0) {
                cp(abstractC0053j.k(ahVar));
                c0055l = this.f;
                int i13 = 50 / 0;
            } else {
                cp(abstractC0053j.k(ahVar));
                c0055l = this.f;
            }
            ahVar.c(aaVar, c0055l);
            int i14 = b;
            int i15 = i14 & 103;
            int i16 = (i14 ^ 103) | i15;
            int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
            a = i17 % 128;
            int i18 = i17 % 2;
        }

        @Override // ivas.gov.bisp.enumeration.aD.AbstractC0064u
        public final void cq(int i, int i2) {
            int i3;
            int i4 = 2 % 2;
            int i5 = b + 119;
            a = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = i * 2;
                int i7 = i6 ^ 1;
                int i8 = i6 & 1;
                i3 = (i8 & i7) | (i7 ^ i8);
            } else {
                i3 = i << 3;
            }
            cp(i3);
            cp(i2);
            int i9 = a;
            int i10 = i9 & 63;
            int i11 = -(-((i9 ^ 63) | i10));
            int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
            b = i12 % 128;
            if (i12 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.aD.AbstractC0064u
        public final void cn(int i, AbstractC0069z abstractC0069z) {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = ((i3 ^ 125) - (~(-(-((i3 & 125) << 1))))) - 1;
            b = i4 % 128;
            if (i4 % 2 != 0) {
                co(1, 2);
                cq(3, i);
            } else {
                co(1, 3);
                cq(2, i);
            }
            cc(3, abstractC0069z);
            co(1, 4);
            int i5 = a;
            int i6 = ((i5 & (-66)) | ((~i5) & 65)) + ((i5 & 65) << 1);
            b = i6 % 128;
            if (i6 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void ct(byte[] bArr, int i, int i2) {
            int i3 = 2 % 2;
            int i4 = a;
            int i5 = i4 & 119;
            int i6 = -(-(i4 | 119));
            int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
            b = i7 % 128;
            int i8 = i7 % 2;
            try {
                System.arraycopy(bArr, i, this.g, this.i, i2);
                int i9 = b;
                int i10 = ((i9 | 3) << 1) - (((~i9) & 3) | (i9 & (-4)));
                int i11 = i10 % 128;
                a = i11;
                int i12 = i10 % 2;
                int i13 = this.i - (~i2);
                this.i = (i13 ^ (-1)) + (i13 << 1);
                int i14 = i11 ^ 19;
                int i15 = ((i11 & 19) | i14) << 1;
                int i16 = -i14;
                int i17 = (i15 & i16) + (i15 | i16);
                b = i17 % 128;
                int i18 = i17 % 2;
            } catch (IndexOutOfBoundsException e) {
                throw new bjj(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.i), Integer.valueOf(this.h), Integer.valueOf(i2)), e);
            }
        }

        /* JADX WARN: Code duplicated, block: B:11:0x002d  */
        /* JADX WARN: Code duplicated, block: B:16:0x0044  */
        /* JADX WARN: Code duplicated, block: B:17:0x004a  */
        /* JADX WARN: Code duplicated, block: B:20:0x006f A[LOOP:0: B:12:0x002f->B:20:0x006f, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:9:0x0025  */
        @Override // ivas.gov.bisp.enumeration.aD.AbstractC0064u
        public final void cs(long j) throws bjj {
            int i;
            int i2;
            long j2;
            int i3;
            byte[] bArr;
            int i4;
            int i5;
            int i6 = 2 % 2;
            int i7 = b + 9;
            a = i7 % 128;
            long j3 = 0;
            if (i7 % 2 == 0) {
                int i8 = 3 / 0;
                if (AbstractC0064u.e) {
                    if (ca() >= 10) {
                        j2 = j;
                        while ((j2 & (-128)) != 0) {
                            byte[] bArr2 = this.g;
                            int i9 = this.i;
                            int i10 = b;
                            int i11 = i10 & 99;
                            int i12 = ((i10 ^ 99) | i11) << 1;
                            int i13 = -((i10 | 99) & (~i11));
                            int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
                            int i15 = i14 % 128;
                            a = i15;
                            int i16 = i14 % 2;
                            this.i = ((i9 | 1) << 1) - (i9 ^ 1);
                            long j4 = i9;
                            int i17 = i15 | 79;
                            int i18 = i17 << 1;
                            int i19 = -(i17 & (~(i15 & 79)));
                            int i20 = (i18 & i19) + (i18 | i19);
                            b = i20 % 128;
                            int i21 = i20 % 2;
                            ar.t(bArr2, j4, (byte) ((((int) j2) & 127) ^ 128));
                            int i22 = a;
                            int i23 = ((i22 ^ 51) | (i22 & 51)) << 1;
                            int i24 = -((i22 & (-52)) | ((~i22) & 51));
                            int i25 = (i23 ^ i24) + ((i23 & i24) << 1);
                            b = i25 % 128;
                            int i26 = i25 % 2;
                            j2 >>>= 7;
                            int i27 = i22 ^ 91;
                            int i28 = ((((i22 & 91) | i27) << 1) - (~(-i27))) - 1;
                            b = i28 % 128;
                            int i29 = i28 % 2;
                        }
                        int i30 = b;
                        i3 = ((i30 | 93) << 1) - (i30 ^ 93);
                        a = i3 % 128;
                        if (i3 % 2 == 0) {
                            bArr = this.g;
                            i5 = this.i;
                            i4 = i5;
                        } else {
                            bArr = this.g;
                            int i31 = this.i;
                            int i32 = i31 & 1;
                            int i33 = (i31 ^ 1) | i32;
                            int i34 = ((i32 & i33) << 1) + (i32 ^ i33);
                            i4 = i31;
                            i5 = i34;
                        }
                        this.i = i5;
                        ar.t(bArr, i4, (byte) j2);
                        int i35 = b + 39;
                        a = i35 % 128;
                        int i36 = i35 % 2;
                        return;
                    }
                }
            } else if (AbstractC0064u.e) {
                if (ca() >= 10) {
                    j2 = j;
                    while ((j2 & (-128)) != 0) {
                        byte[] bArr3 = this.g;
                        int i37 = this.i;
                        int i110 = b;
                        int i111 = i110 & 99;
                        int i112 = ((i110 ^ 99) | i111) << 1;
                        int i113 = -((i110 | 99) & (~i111));
                        int i114 = (i112 ^ i113) + ((i113 & i112) << 1);
                        int i115 = i114 % 128;
                        a = i115;
                        int i116 = i114 % 2;
                        this.i = ((i37 | 1) << 1) - (i37 ^ 1);
                        long j5 = i37;
                        int i117 = i115 | 79;
                        int i118 = i117 << 1;
                        int i119 = -(i117 & (~(i115 & 79)));
                        int i210 = (i118 & i119) + (i118 | i119);
                        b = i210 % 128;
                        int i211 = i210 % 2;
                        ar.t(bArr3, j5, (byte) ((((int) j2) & 127) ^ 128));
                        int i212 = a;
                        int i213 = ((i212 ^ 51) | (i212 & 51)) << 1;
                        int i214 = -((i212 & (-52)) | ((~i212) & 51));
                        int i215 = (i213 ^ i214) + ((i213 & i214) << 1);
                        b = i215 % 128;
                        int i216 = i215 % 2;
                        j2 >>>= 7;
                        int i217 = i212 ^ 91;
                        int i218 = ((((i212 & 91) | i217) << 1) - (~(-i217))) - 1;
                        b = i218 % 128;
                        int i219 = i218 % 2;
                    }
                    int i38 = b;
                    i3 = ((i38 | 93) << 1) - (i38 ^ 93);
                    a = i3 % 128;
                    if (i3 % 2 == 0) {
                        bArr = this.g;
                        i5 = this.i;
                        i4 = i5;
                    } else {
                        bArr = this.g;
                        int i39 = this.i;
                        int i310 = i39 & 1;
                        int i311 = (i39 ^ 1) | i310;
                        int i312 = ((i310 & i311) << 1) + (i310 ^ i311);
                        i4 = i39;
                        i5 = i312;
                    }
                    this.i = i5;
                    ar.t(bArr, i4, (byte) j2);
                    int i313 = b + 39;
                    a = i313 % 128;
                    int i314 = i313 % 2;
                    return;
                }
            }
            long j6 = j;
            for (long j7 = -128; (j6 & j7) != j3; j7 = -128) {
                try {
                    byte[] bArr4 = this.g;
                    int i40 = this.i;
                    int i41 = a;
                    int i42 = ((~i41) & 103) | (i41 & (-104));
                    int i43 = -(-((103 & i41) << 1));
                    int i44 = (i42 & i43) + (i42 | i43);
                    int i45 = i44 % 128;
                    b = i45;
                    if (i44 % 2 != 0) {
                        this.i = i40 + 1;
                        i = ((int) j6) & 62;
                        i2 = 28904;
                    } else {
                        this.i = ((i40 ^ 1) - (~((i40 & 1) << 1))) - 1;
                        i = ((int) j6) & 127;
                        i2 = 128;
                    }
                    int i46 = ((~i) & i2) | ((~i2) & i);
                    int i47 = i & i2;
                    bArr4[i40] = (byte) ((i47 & i46) | (i46 ^ i47));
                    j6 >>>= 7;
                    int i48 = (i45 ^ 105) + ((i45 & 105) << 1);
                    a = i48 % 128;
                    if (i48 % 2 == 0) {
                        int i49 = 4 % 5;
                    }
                    j3 = 0;
                } catch (IndexOutOfBoundsException e) {
                    throw new bjj(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.i), Integer.valueOf(this.h), 1), e);
                }
            }
            int i50 = a;
            int i51 = i50 + 23;
            b = i51 % 128;
            int i52 = i51 % 2;
            byte[] bArr5 = this.g;
            int i53 = this.i;
            this.i = (((i53 | 2) << 1) - (i53 ^ 2)) - 1;
            int i54 = ((i50 | 95) << 1) - (i50 ^ 95);
            b = i54 % 128;
            if (i54 % 2 != 0) {
                bArr5[i53] = (byte) j6;
                throw null;
            }
            bArr5[i53] = (byte) j6;
        }

        @Override // ivas.gov.bisp.enumeration.aD.AbstractC0064u
        public final void cf(int i) throws bjj {
            byte[] bArr;
            int i2;
            int i3;
            int i4 = 2 % 2;
            int i5 = a;
            int i6 = ((i5 ^ 120) + ((i5 & 120) << 1)) - 1;
            b = i6 % 128;
            try {
                if (i6 % 2 != 0) {
                    bArr = this.g;
                    i2 = this.i;
                    int i7 = 86 / 0;
                } else {
                    bArr = this.g;
                    i2 = this.i;
                }
                int i8 = i5 & 111;
                int i9 = i8 + ((i5 ^ 111) | i8);
                int i10 = i9 % 128;
                b = i10;
                int i11 = i9 % 2;
                int i12 = (-2) - ((i2 + 2) ^ (-1));
                this.i = i12;
                int i13 = ((((i10 ^ 119) | (i10 & 119)) << 1) - (~(-((i10 & (-120)) | ((~i10) & 119))))) - 1;
                a = i13 % 128;
                int i14 = i13 % 2;
                bArr[i2] = (byte) (i & 255);
                int i15 = i12 & 1;
                int i16 = -(-(i12 | 1));
                int i17 = ((i15 | i16) << 1) - (i15 ^ i16);
                int i18 = i10 + 113;
                a = i18 % 128;
                int i19 = i18 % 2;
                this.i = i17;
                int i20 = i >> 8;
                int i21 = i10 & 91;
                int i22 = (~i21) & (i10 | 91);
                int i23 = -(-(i21 << 1));
                int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
                a = i24 % 128;
                if (i24 % 2 == 0) {
                    bArr[i12] = (byte) (i20 & 255);
                    i3 = i17 >>> 1;
                } else {
                    bArr[i12] = (byte) (i20 & 255);
                    int i25 = i17 | 1;
                    i3 = ((i25 << 1) - (~(-(i25 & (~(i17 & 1)))))) - 1;
                }
                this.i = i3;
                byte b2 = (byte) ((i >> 16) & 255);
                int i26 = (((i10 | 20) << 1) - (i10 ^ 20)) - 1;
                a = i26 % 128;
                if (i26 % 2 == 0) {
                    bArr[i17] = b2;
                    this.i = i3;
                } else {
                    bArr[i17] = b2;
                    this.i = (i3 & 1) + (i3 | 1);
                }
                bArr[i3] = (byte) ((i >> 24) & 255);
                int i27 = i10 + 49;
                a = i27 % 128;
                if (i27 % 2 == 0) {
                    throw null;
                }
            } catch (IndexOutOfBoundsException e) {
                throw new bjj(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.i), Integer.valueOf(this.h), 1), e);
            }
        }

        @Override // ivas.gov.bisp.enumeration.aD.AbstractC0064u
        public final void ch(int i, aa aaVar) {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = ((i3 ^ 49) | (i3 & 49)) << 1;
            int i5 = -(((~i3) & 49) | (i3 & (-50)));
            int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
            b = i6 % 128;
            int i7 = i6 % 2;
            co(1, 3);
            cq(2, i);
            int i8 = a;
            int i9 = ((i8 | 45) << 1) - (i8 ^ 45);
            b = i9 % 128;
            int i10 = i9 % 2;
            cp(26);
            cp(aaVar.c());
            int i11 = b;
            int i12 = i11 & 69;
            int i13 = (i11 | 69) & (~i12);
            int i14 = -(-(i12 << 1));
            int i15 = (i13 ^ i14) + ((i13 & i14) << 1);
            a = i15 % 128;
            int i16 = i15 % 2;
            aaVar.b(this);
            co(1, 4);
            int i17 = a;
            int i18 = i17 & 77;
            int i19 = (i17 ^ 77) | i18;
            int i20 = (i18 & i19) + (i19 | i18);
            b = i20 % 128;
            if (i20 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:44:0x0210, code lost:
        
            if ((r6 & 6) == 0) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x0217, code lost:
        
            if ((r6 & (-128)) == 0) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x0219, code lost:
        
            r13 = (-2) - (((r3 & 112) + (r3 | 112)) ^ (-1));
            ivas.gov.bisp.enumeration.aD.AbstractC0064u.bji.a = r13 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0227, code lost:
        
            if ((r13 % 2) != 0) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0229, code lost:
        
            r13 = r12.g;
            r2 = r12.i;
            r4 = 19 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x0231, code lost:
        
            r13 = r12.g;
            r2 = r12.i;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0235, code lost:
        
            r4 = r2 ^ 1;
            r5 = ((r2 & 1) | r4) << 1;
            r4 = -r4;
            r12.i = (r5 ^ r4) + ((r4 & r5) << 1);
            r4 = r2;
            r2 = (byte) r6;
            r6 = (r3 & 93) + (r3 | 93);
            ivas.gov.bisp.enumeration.aD.AbstractC0064u.bji.a = r6 % 128;
            r6 = r6 % 2;
            ivas.gov.bisp.enumeration.aD.ar.t(r13, r4, r2);
            r13 = ivas.gov.bisp.enumeration.aD.AbstractC0064u.bji.a;
            r2 = r13 ^ 123;
            r13 = ((((r13 & 123) | r2) << 1) - (~(-r2))) - 1;
            ivas.gov.bisp.enumeration.aD.AbstractC0064u.bji.b = r13 % 128;
            r13 = r13 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x0263, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0264, code lost:
        
            r13 = r12.g;
            r2 = r12.i;
            r5 = r3 + 103;
            ivas.gov.bisp.enumeration.aD.AbstractC0064u.bji.a = r5 % 128;
            r5 = r5 % 2;
            r5 = r2 & 1;
            r12.i = r5 + ((r2 ^ 1) | r5);
            r7 = r2;
            r2 = (-2) - ((r3 + 54) ^ (-1));
            ivas.gov.bisp.enumeration.aD.AbstractC0064u.bji.a = r2 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x0283, code lost:
        
            if ((r2 % 2) != 0) goto L57;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x0285, code lost:
        
            ivas.gov.bisp.enumeration.aD.ar.t(r13, r7, (byte) (r6 & 128));
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x028c, code lost:
        
            ivas.gov.bisp.enumeration.aD.ar.t(r13, r7, (byte) ((r6 ^ 128) | (r6 & 128)));
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x0295, code lost:
        
            r13 = r12.g;
            r2 = ivas.gov.bisp.enumeration.aD.AbstractC0064u.bji.a;
            r3 = (r2 & (-86)) | ((~r2) & 85);
            r2 = -(-((r2 & 85) << 1));
            r1 = ((r3 | r2) << 1) - (r2 ^ r3);
            r2 = r1 % 128;
            ivas.gov.bisp.enumeration.aD.AbstractC0064u.bji.b = r2;
            r1 = r1 % 2;
            r1 = r12.i;
            r12.i = (-2) - (((r1 & 2) + (r1 | 2)) ^ (-1));
            r2 = r2 + 29;
            ivas.gov.bisp.enumeration.aD.AbstractC0064u.bji.a = r2 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x02c1, code lost:
        
            if ((r2 % 2) != 0) goto L61;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x02c3, code lost:
        
            r2 = r6 & (-90);
            r3 = -(-((r6 ^ (-90)) | r2));
            ivas.gov.bisp.enumeration.aD.ar.t(r13, r1, (byte) ((r2 & r3) + (r2 | r3)));
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x02d4, code lost:
        
            ivas.gov.bisp.enumeration.aD.ar.t(r13, r1, (byte) (r6 >>> 7));
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x02db, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:90:?, code lost:
        
            return;
         */
        @Override // ivas.gov.bisp.enumeration.aD.AbstractC0064u
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void cp(int r13) throws ivas.gov.bisp.enumeration.aD.AbstractC0064u.bjj {
            /*
                Method dump skipped, instruction units count: 929
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.aD.AbstractC0064u.bji.cp(int):void");
        }

        @Override // ivas.gov.bisp.enumeration.aD.AbstractC0064u
        public final void cj(long j) throws bjj {
            byte[] bArr;
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = 2 % 2;
            int i6 = a;
            int i7 = (i6 ^ 123) + ((i6 & 123) << 1);
            int i8 = i7 % 128;
            b = i8;
            try {
                if (i7 % 2 != 0) {
                    bArr = this.g;
                    i = this.i;
                    this.i = i;
                    i2 = i;
                } else {
                    bArr = this.g;
                    i = this.i;
                    int i9 = i & 1;
                    i2 = i9 + ((i ^ 1) | i9);
                    this.i = i2;
                }
                bArr[i] = (byte) (((int) j) & 255);
                int i10 = i2 ^ 1;
                int i11 = ((i2 & 1) | i10) << 1;
                int i12 = -i10;
                int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
                this.i = i13;
                int i14 = i8 & 123;
                int i15 = (i8 ^ 123) | i14;
                int i16 = (i14 & i15) + (i15 | i14);
                int i17 = i16 % 128;
                a = i17;
                int i18 = (int) (j >> 8);
                if (i16 % 2 == 0) {
                    bArr[i2] = (byte) (i18 & 26624);
                    this.i = i13;
                    i4 = (int) (j >> 53);
                    i3 = i13;
                } else {
                    bArr[i2] = (byte) (i18 & 255);
                    int i19 = (i13 | 1) << 1;
                    int i20 = -(i13 ^ 1);
                    i3 = ((i19 | i20) << 1) - (i19 ^ i20);
                    this.i = i3;
                    i4 = (int) (j >> 16);
                }
                bArr[i13] = (byte) (i4 & 255);
                int i21 = i3 & 1;
                int i22 = (~i21) & (i3 | 1);
                int i23 = i21 << 1;
                int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
                this.i = i24;
                int i25 = i17 & 59;
                int i26 = (i17 | 59) & (~i25);
                int i27 = i25 << 1;
                int i28 = (i26 & i27) + (i26 | i27);
                int i29 = i28 % 128;
                b = i29;
                int i30 = i28 % 2;
                bArr[i3] = (byte) (((int) (j >> 24)) & 255);
                int i31 = ((i24 ^ 1) | (i24 & 1)) << 1;
                int i32 = -((i24 & (-2)) | ((~i24) & 1));
                int i33 = (i31 ^ i32) + ((i31 & i32) << 1);
                this.i = i33;
                int i34 = ((i29 & 14) + (i29 | 14)) - 1;
                a = i34 % 128;
                int i35 = i34 % 2;
                bArr[i24] = (byte) (((int) (j >> 32)) & 255);
                int i36 = i33 & 1;
                int i37 = (i33 ^ 1) | i36;
                int i38 = (i36 & i37) + (i36 | i37);
                this.i = i38;
                byte b2 = (byte) (((int) (j >> 40)) & 255);
                int i39 = (i29 & 109) + (i29 | 109);
                int i40 = i39 % 128;
                a = i40;
                int i41 = i39 % 2;
                bArr[i33] = b2;
                int i42 = i38 & 1;
                int i43 = (~i42) & (i38 | 1);
                int i44 = i42 << 1;
                int i45 = (i43 ^ i44) + ((i44 & i43) << 1);
                this.i = i45;
                bArr[i38] = (byte) (((int) (j >> 48)) & 255);
                int i46 = (-2) - ((((i40 | 116) << 1) - (i40 ^ 116)) ^ (-1));
                b = i46 % 128;
                if (i46 % 2 != 0) {
                    this.i = i45;
                    int i47 = (int) (j << 108);
                    bArr[i45] = (byte) ((i47 & 19112) | (i47 & (-19113)) | ((~i47) & 19112));
                } else {
                    int i48 = i45 & 1;
                    this.i = i48 + ((i45 ^ 1) | i48);
                    bArr[i45] = (byte) (((int) (j >> 56)) & 255);
                }
                int i49 = i40 & 45;
                int i50 = -(-(i40 | 45));
                int i51 = ((i49 | i50) << 1) - (i49 ^ i50);
                b = i51 % 128;
                int i52 = i51 % 2;
            } catch (IndexOutOfBoundsException e) {
                throw new bjj(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.i), Integer.valueOf(this.h), 1), e);
            }
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: ivas.gov.bisp.enumeration.o000O000.OooOo00$OooO0OO */
        public final void cO(String str) throws OooOo00.OooO0OO, bjj {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 37;
            int i4 = i3 + ((i2 ^ 37) | i3);
            a = i4 % 128;
            int i5 = i4 % 2;
            int i6 = this.i;
            try {
                int length = str.length();
                int i7 = a;
                int i8 = i7 & 113;
                int i9 = (i7 ^ 113) | i8;
                int i10 = (i8 & i9) + (i9 | i8);
                b = i10 % 128;
                int i11 = i10 % 2;
                int iBU = AbstractC0064u.bU(length * 3);
                int iBU2 = AbstractC0064u.bU(str.length());
                int i12 = a;
                int i13 = ((((i12 ^ 115) | (i12 & 115)) << 1) - (~(-((i12 & (-116)) | ((~i12) & 115))))) - 1;
                b = i13 % 128;
                if (i13 % 2 != 0) {
                    throw null;
                }
                if (iBU2 != iBU) {
                    cp(as.d(str));
                    byte[] bArr = this.g;
                    int i14 = b;
                    int i15 = (i14 ^ 79) + ((i14 & 79) << 1);
                    a = i15 % 128;
                    int i16 = i15 % 2;
                    int i17 = this.i;
                    int iCa = ca();
                    as.bkT bkt = as.c;
                    int i18 = a;
                    int i19 = i18 & 79;
                    int i20 = -(-((i18 ^ 79) | i19));
                    int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
                    b = i21 % 128;
                    int i22 = i21 % 2;
                    this.i = bkt.d(str, bArr, i17, iCa);
                    int i23 = a;
                    int i24 = i23 | 91;
                    int i25 = (i24 << 1) - ((~(i23 & 91)) & i24);
                    b = i25 % 128;
                    if (i25 % 2 != 0) {
                        int i26 = 99 / 0;
                        return;
                    }
                    return;
                }
                int i27 = i6 ^ iBU2;
                int i28 = -(-((i6 & iBU2) << 1));
                int i29 = (i27 ^ i28) + ((i27 & i28) << 1);
                this.i = i29;
                byte[] bArr2 = this.g;
                int i30 = i12 + 57;
                b = i30 % 128;
                int i31 = i30 % 2;
                int iCa2 = ca();
                as.bkT bkt2 = as.c;
                int i32 = b;
                int i33 = (i32 ^ 107) + ((i32 & 107) << 1);
                a = i33 % 128;
                int i34 = i33 % 2;
                int iD = bkt2.d(str, bArr2, i29, iCa2);
                this.i = i6;
                int i35 = b;
                int i36 = (i35 & (-36)) | ((~i35) & 35);
                int i37 = (i35 & 35) << 1;
                int i38 = (i36 ^ i37) + ((i37 & i36) << 1);
                a = i38 % 128;
                if (i38 % 2 == 0) {
                    cp((iD % i6) >> iBU2);
                } else {
                    int i39 = -i6;
                    int i40 = ((iD ^ i39) - (~(-(-((i39 & iD) << 1))))) - 1;
                    int i41 = -iBU2;
                    cp((((i40 ^ i41) | (i40 & i41)) << 1) - ((i41 & (~i40)) | ((~i41) & i40)));
                }
                this.i = iD;
                int i42 = b;
                int i43 = ((i42 ^ 10) + ((i42 & 10) << 1)) - 1;
                a = i43 % 128;
                if (i43 % 2 == 0) {
                    throw null;
                }
            } catch (IndexOutOfBoundsException e) {
                throw new bjj(e);
            } catch (oo00o.OooO0o e2) {
                this.i = i6;
                AbstractC0064u.d.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", e2);
                byte[] bytes = str.getBytes(R.c);
                try {
                    cp(bytes.length);
                    ct(bytes, 0, bytes.length);
                } catch (OooOo00.OooO0OO e3) {
                    throw e3;
                } catch (IndexOutOfBoundsException e4) {
                    throw new bjj(e4);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aD.u$bjj */
    public static class bjj extends IOException {
        public bjj(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        public bjj(String str, Throwable th) {
            super(ivas.gov.bisp.enumeration.p091n.j.r("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str), th);
        }
    }

    static {
        boolean z = ar.k;
        int i = a;
        int i2 = i + 3;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            e = z;
            throw null;
        }
        e = z;
        int i3 = (((i ^ 121) | (i & 121)) << 1) - (((~i) & 121) | (i & (-122)));
        b = i3 % 128;
        int i4 = i3 % 2;
    }

    public AbstractC0064u() {
    }

    public static int bA(int i, double d2) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 & (-30)) | ((~i3) & 29);
        int i5 = (i3 & 29) << 1;
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        int iBT = bT(i);
        int i8 = (-2) - (((iBT & 9) + (iBT | 9)) ^ (-1));
        int i9 = b;
        int i10 = i9 & 99;
        int i11 = i9 | 99;
        int i12 = (i10 & i11) + (i11 | i10);
        a = i12 % 128;
        if (i12 % 2 != 0) {
            return i8;
        }
        throw null;
    }

    public static int bB(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = i4 ^ 123;
        int i6 = ((((i4 & 123) | i5) << 1) - (~(-i5))) - 1;
        a = i6 % 128;
        int i7 = i6 % 2;
        int iBT = bT(i);
        int i8 = -(-bG(i2));
        int i9 = iBT & i8;
        int i10 = (((iBT | i8) & (~i9)) - (~(-(-(i9 << 1))))) - 1;
        int i11 = a;
        int i12 = ((i11 | 75) << 1) - (i11 ^ 75);
        b = i12 % 128;
        int i13 = i12 % 2;
        return i10;
    }

    public static int bC(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = (i4 & 9) + (i4 | 9);
        a = i5 % 128;
        int i6 = i5 % 2;
        int iBT = bT(i);
        int i7 = iBT ^ 4;
        int i8 = (((iBT & 4) | i7) << 1) - i7;
        int i9 = b;
        int i10 = (-2) - (((i9 ^ 16) + ((i9 & 16) << 1)) ^ (-1));
        a = i10 % 128;
        int i11 = i10 % 2;
        return i8;
    }

    public static int bD(int i, float f) {
        int i2 = 2 % 2;
        int i3 = b + 57;
        a = i3 % 128;
        int i4 = i3 % 2;
        int iBT = bT(i);
        if (i4 == 0) {
            return iBT >> 2;
        }
        int i5 = iBT & 4;
        return ((iBT | 4) & (~i5)) + (i5 << 1);
    }

    public static int bF(int i, int i2) {
        int i3;
        int i4 = 2 % 2;
        int i5 = b;
        int i6 = ((i5 & 84) + (i5 | 84)) - 1;
        a = i6 % 128;
        int i7 = i6 % 2;
        int iBT = bT(i);
        int iBG = bG(i2);
        if (i7 == 0) {
            i3 = iBG * iBT;
        } else {
            int i8 = -(-iBT);
            i3 = ((iBG ^ i8) - (~(-(-((i8 & iBG) << 1))))) - 1;
        }
        int i9 = b;
        int i10 = (-2) - (((i9 ^ 34) + ((i9 & 34) << 1)) ^ (-1));
        a = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 24 / 0;
        }
        return i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        r1 = r1 + 77;
        ivas.gov.bisp.enumeration.aD.AbstractC0064u.b = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
    
        if ((r1 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
    
        r0 = 83 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        return 10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if (r4 >= 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
    
        if (r4 >= 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        r4 = bU(r4);
        r1 = ivas.gov.bisp.enumeration.aD.AbstractC0064u.a;
        r2 = ((r1 & (-44)) | ((~r1) & 43)) + ((r1 & 43) << 1);
        ivas.gov.bisp.enumeration.aD.AbstractC0064u.b = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int bG(int r4) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.aD.AbstractC0064u.a
            r2 = r1 ^ 123(0x7b, float:1.72E-43)
            r3 = r1 & 123(0x7b, float:1.72E-43)
            int r3 = r3 << 1
            int r2 = r2 + r3
            int r3 = r2 % 128
            ivas.gov.bisp.enumeration.aD.AbstractC0064u.b = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L1a
            r2 = 76
            int r2 = r2 / 0
            if (r4 < 0) goto L33
            goto L1c
        L1a:
            if (r4 < 0) goto L33
        L1c:
            int r4 = bU(r4)
            int r1 = ivas.gov.bisp.enumeration.aD.AbstractC0064u.a
            r2 = r1 & (-44)
            int r3 = ~r1
            r3 = r3 & 43
            r2 = r2 | r3
            r1 = r1 & 43
            int r1 = r1 << 1
            int r2 = r2 + r1
            int r1 = r2 % 128
            ivas.gov.bisp.enumeration.aD.AbstractC0064u.b = r1
            int r2 = r2 % r0
            return r4
        L33:
            int r1 = r1 + 77
            int r4 = r1 % 128
            ivas.gov.bisp.enumeration.aD.AbstractC0064u.b = r4
            int r1 = r1 % r0
            r4 = 10
            if (r1 == 0) goto L42
            r0 = 83
            int r0 = r0 / 0
        L42:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.aD.AbstractC0064u.bG(int):int");
    }

    public static int bI(V v) {
        int iC;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 45;
        int i4 = (i2 | 45) & (~i3);
        int i5 = i3 << 1;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        a = i6 % 128;
        int i7 = i6 % 2;
        Object obj = null;
        if (v.d != null) {
            int i8 = a;
            int i9 = i8 & 111;
            int i10 = ((i8 ^ 111) | i9) << 1;
            int i11 = -((i8 | 111) & (~i9));
            int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
            b = i12 % 128;
            int i13 = i12 % 2;
            AbstractC0069z abstractC0069z = v.d;
            if (i13 != 0) {
                abstractC0069z.size();
                obj.hashCode();
                throw null;
            }
            iC = abstractC0069z.size();
        } else if (v.c != null) {
            int i14 = b;
            int i15 = i14 & 99;
            int i16 = (i14 | 99) & (~i15);
            int i17 = -(-(i15 << 1));
            int i18 = (i16 ^ i17) + ((i16 & i17) << 1);
            a = i18 % 128;
            int i19 = i18 % 2;
            iC = v.c.c();
            int i20 = a;
            int i21 = (i20 & 19) + (i20 | 19);
            b = i21 % 128;
            int i22 = i21 % 2;
        } else {
            int i23 = a;
            int i24 = i23 & 77;
            int i25 = (((i23 | 77) & (~i24)) - (~(-(-(i24 << 1))))) - 1;
            b = i25 % 128;
            int i26 = i25 % 2;
            iC = 0;
        }
        int iBK = bK(iC);
        int i27 = a;
        int i28 = (i27 & 5) + (i27 | 5);
        b = i28 % 128;
        if (i28 % 2 == 0) {
            return iBK;
        }
        throw null;
    }

    public static int bJ(int i, int i2) {
        int iBN;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = ((i4 & (-2)) | ((~i4) & 1)) + ((i4 & 1) << 1);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            iBN = bN(i2) * bT(i);
        } else {
            iBN = bN(i2) + bT(i);
        }
        int i6 = a;
        int i7 = ((i6 ^ 117) | (i6 & 117)) << 1;
        int i8 = -(((~i6) & 117) | (i6 & (-118)));
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        b = i9 % 128;
        int i10 = i9 % 2;
        return iBN;
    }

    public static int bK(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 5;
        int i5 = i4 + ((i3 ^ 5) | i4);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return bU(i) >>> i;
        }
        int iBU = bU(i);
        int i6 = ((~i) & iBU) | ((~iBU) & i);
        int i7 = (i & iBU) << 1;
        return ((i6 | i7) << 1) - (i7 ^ i6);
    }

    public static int bL(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = b + 11;
        a = i4 % 128;
        int i5 = i4 % 2;
        int iBT = bT(i);
        return i5 == 0 ? iBT / 4 : (((iBT & (-5)) | ((~iBT) & 4)) - (~(-(-((iBT & 4) << 1))))) - 1;
    }

    public static int bM(int i, long j) {
        int iBT;
        int i2 = 2 % 2;
        int i3 = a + 103;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            iBT = bT(i) * 53;
        } else {
            int iBT2 = bT(i);
            int i4 = (iBT2 | 8) << 1;
            int i5 = -(((~iBT2) & 8) | (iBT2 & (-9)));
            iBT = (i5 | i4) + (i4 & i5);
        }
        int i6 = b + 59;
        a = i6 % 128;
        int i7 = i6 % 2;
        return iBT;
    }

    public static int bN(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 41;
        int i5 = -(-((i3 ^ 41) | i4));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        a = i6 % 128;
        if (i6 % 2 == 0) {
            bU(bX(i));
            throw null;
        }
        int iBU = bU(bX(i));
        int i7 = a;
        int i8 = (i7 | 91) << 1;
        int i9 = -(((~i7) & 91) | (i7 & (-92)));
        int i10 = (i8 & i9) + (i9 | i8);
        b = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 15 / 0;
        }
        return iBU;
    }

    public static int bO(int i, long j) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (((i3 | 94) << 1) - (i3 ^ 94)) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        int iBT = bT(i);
        int iBP = bP(j);
        if (i5 == 0) {
            return iBP % iBT;
        }
        int i6 = -(-iBT);
        int i7 = ((~i6) & iBP) | ((~iBP) & i6);
        int i8 = (i6 & iBP) << 1;
        return (i7 ^ i8) + ((i8 & i7) << 1);
    }

    public static int bP(long j) {
        int i = 2 % 2;
        int i2 = (-2) - ((a + 80) ^ (-1));
        b = i2 % 128;
        if (i2 % 2 != 0) {
            bZ(bW(j));
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iBZ = bZ(bW(j));
        int i3 = b;
        int i4 = i3 & 93;
        int i5 = (i4 - (~((i3 ^ 93) | i4))) - 1;
        a = i5 % 128;
        int i6 = i5 % 2;
        return iBZ;
    }

    public static int bQ(int i, String str) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 ^ 123) + ((i3 & 123) << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        int iBT = bT(i);
        int iBR = bR(str);
        int i6 = (iBR ^ iBT) + ((iBT & iBR) << 1);
        int i7 = b;
        int i8 = i7 & 27;
        int i9 = (((i7 ^ 27) | i8) << 1) - ((i7 | 27) & (~i8));
        a = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 18 / 0;
        }
        return i6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11, types: [int] */
    public static int bR(String str) {
        int length;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 23;
        int i4 = -(-((i2 & 23) << 1));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        try {
            if (i5 % 2 != 0) {
                length = as.d(str);
                int i6 = 4 / 0;
            } else {
                length = as.d(str);
            }
            int i7 = a;
            int i8 = ((((i7 ^ 93) | (i7 & 93)) << 1) - (~(-(((~i7) & 93) | (i7 & (-94)))))) - 1;
            str = i8 % 128;
            b = str;
            int i9 = i8 % 2;
        } catch (oo00o.OooO0o unused) {
            length = str.getBytes(R.c).length;
        }
        int iBK = bK(length);
        int i10 = a;
        int i11 = ((i10 ^ 93) | (i10 & 93)) << 1;
        int i12 = -((93 & (~i10)) | (i10 & (-94)));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        b = i13 % 128;
        if (i13 % 2 == 0) {
            return iBK;
        }
        throw null;
    }

    public static int bS(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = ((((i4 ^ 9) | (i4 & 9)) << 1) - (~(-(((~i4) & 9) | (i4 & (-10)))))) - 1;
        b = i5 % 128;
        int i6 = i5 % 2;
        int iBT = bT(i);
        int iBU = bU(i2);
        int i7 = i6 != 0 ? iBU * iBT : (iBU & iBT) + (iBT | iBU);
        int i8 = a + 52;
        int i9 = (i8 ^ (-1)) + (i8 << 1);
        b = i9 % 128;
        int i10 = i9 % 2;
        return i7;
    }

    public static int bT(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 11;
        int i5 = (i3 ^ 11) | i4;
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        int iBU = bU(i << 3);
        int i8 = b;
        int i9 = i8 & 91;
        int i10 = (i9 - (~((i8 ^ 91) | i9))) - 1;
        a = i10 % 128;
        int i11 = i10 % 2;
        return iBU;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if ((r3 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        if ((r8 & (-16384)) != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        r8 = ((r1 | 107) << 1) - (((~r1) & 107) | (r1 & (-108)));
        r1 = r8 % 128;
        ivas.gov.bisp.enumeration.aD.AbstractC0064u.b = r1;
        r8 = r8 % 2;
        r8 = (r1 & (-76)) | ((~r1) & 75);
        r1 = (r1 & 75) << 1;
        r2 = ((r8 | r1) << 1) - (r8 ^ r1);
        ivas.gov.bisp.enumeration.aD.AbstractC0064u.a = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
    
        if ((r2 % 2) != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        r8 = 98 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
    
        return 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        if (((-2097152) & r8) != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        r8 = (r3 ^ 71) + ((r3 & 71) << 1);
        r1 = r8 % 128;
        ivas.gov.bisp.enumeration.aD.AbstractC0064u.a = r1;
        r8 = r8 % 2;
        r8 = (r1 & 27) + (r1 | 27);
        ivas.gov.bisp.enumeration.aD.AbstractC0064u.b = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0077, code lost:
    
        if ((r8 % 2) != 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0079, code lost:
    
        return 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
    
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0082, code lost:
    
        if ((r8 & (-268435456)) != 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0084, code lost:
    
        r8 = r1 & 15;
        r1 = (r1 | 15) & (~r8);
        r8 = r8 << 1;
        r2 = ((r1 | r8) << 1) - (r8 ^ r1);
        r8 = r2 % 128;
        ivas.gov.bisp.enumeration.aD.AbstractC0064u.b = r8;
        r2 = r2 % 2;
        r1 = r8 & 33;
        r8 = (((r8 | 33) & (~r1)) - (~(-(-(r1 << 1))))) - 1;
        ivas.gov.bisp.enumeration.aD.AbstractC0064u.a = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a7, code lost:
    
        return 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a8, code lost:
    
        r8 = r1 & 125;
        r1 = -(-(r1 | 125));
        r2 = (r8 & r1) + (r8 | r1);
        ivas.gov.bisp.enumeration.aD.AbstractC0064u.b = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b8, code lost:
    
        return 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (((r2 & r6) | (r6 ^ r2)) == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if ((r8 & (-128)) == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        r3 = r3 + 59;
        ivas.gov.bisp.enumeration.aD.AbstractC0064u.a = r3 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int bU(int r8) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.aD.AbstractC0064u.a
            int r2 = r1 + 93
            int r3 = r2 % 128
            ivas.gov.bisp.enumeration.aD.AbstractC0064u.b = r3
            int r2 = r2 % r0
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L1d
            r2 = r8 & 123(0x7b, float:1.72E-43)
            int r6 = ~r2
            r7 = r8 | 123(0x7b, float:1.72E-43)
            r6 = r6 & r7
            r7 = r6 ^ r2
            r2 = r2 & r6
            r2 = r2 | r7
            if (r2 != 0) goto L2f
            goto L21
        L1d:
            r2 = r8 & (-128(0xffffffffffffff80, float:NaN))
            if (r2 != 0) goto L2f
        L21:
            int r3 = r3 + 59
            int r8 = r3 % 128
            ivas.gov.bisp.enumeration.aD.AbstractC0064u.a = r8
            int r3 = r3 % r0
            if (r3 == 0) goto L2b
            return r5
        L2b:
            r4.hashCode()
            throw r4
        L2f:
            r2 = r8 & (-16384(0xffffffffffffc000, float:NaN))
            if (r2 != 0) goto L5d
            r8 = r1 | 107(0x6b, float:1.5E-43)
            int r8 = r8 << r5
            r2 = r1 & (-108(0xffffffffffffff94, float:NaN))
            int r1 = ~r1
            r3 = 107(0x6b, float:1.5E-43)
            r1 = r1 & r3
            r1 = r1 | r2
            int r8 = r8 - r1
            int r1 = r8 % 128
            ivas.gov.bisp.enumeration.aD.AbstractC0064u.b = r1
            int r8 = r8 % r0
            r8 = r1 & (-76)
            int r2 = ~r1
            r3 = 75
            r2 = r2 & r3
            r8 = r8 | r2
            r1 = r1 & r3
            int r1 = r1 << r5
            r2 = r8 | r1
            int r2 = r2 << r5
            r8 = r8 ^ r1
            int r2 = r2 - r8
            int r8 = r2 % 128
            ivas.gov.bisp.enumeration.aD.AbstractC0064u.a = r8
            int r2 = r2 % r0
            if (r2 != 0) goto L5c
            r8 = 98
            int r8 = r8 / 0
        L5c:
            return r0
        L5d:
            r2 = -2097152(0xffffffffffe00000, float:NaN)
            r2 = r2 & r8
            if (r2 != 0) goto L7f
            r8 = r3 ^ 71
            r1 = r3 & 71
            int r1 = r1 << r5
            int r8 = r8 + r1
            int r1 = r8 % 128
            ivas.gov.bisp.enumeration.aD.AbstractC0064u.a = r1
            int r8 = r8 % r0
            r8 = r1 & 27
            r1 = r1 | 27
            int r8 = r8 + r1
            int r1 = r8 % 128
            ivas.gov.bisp.enumeration.aD.AbstractC0064u.b = r1
            int r8 = r8 % r0
            if (r8 != 0) goto L7b
            r8 = 3
            return r8
        L7b:
            r4.hashCode()
            throw r4
        L7f:
            r2 = -268435456(0xfffffffff0000000, float:-1.5845633E29)
            r8 = r8 & r2
            if (r8 != 0) goto La8
            r8 = r1 & 15
            int r2 = ~r8
            r1 = r1 | 15
            r1 = r1 & r2
            int r8 = r8 << r5
            r2 = r1 | r8
            int r2 = r2 << r5
            r8 = r8 ^ r1
            int r2 = r2 - r8
            int r8 = r2 % 128
            ivas.gov.bisp.enumeration.aD.AbstractC0064u.b = r8
            int r2 = r2 % r0
            r1 = r8 & 33
            int r2 = ~r1
            r8 = r8 | 33
            r8 = r8 & r2
            int r1 = r1 << r5
            int r1 = -r1
            int r1 = -r1
            int r1 = ~r1
            int r8 = r8 - r1
            int r8 = r8 - r5
            int r1 = r8 % 128
            ivas.gov.bisp.enumeration.aD.AbstractC0064u.a = r1
            int r8 = r8 % r0
            r8 = 4
            return r8
        La8:
            r8 = r1 & 125(0x7d, float:1.75E-43)
            r1 = r1 | 125(0x7d, float:1.75E-43)
            int r1 = -r1
            int r1 = -r1
            r2 = r8 & r1
            r8 = r8 | r1
            int r2 = r2 + r8
            int r8 = r2 % 128
            ivas.gov.bisp.enumeration.aD.AbstractC0064u.b = r8
            int r2 = r2 % r0
            r8 = 5
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.aD.AbstractC0064u.bU(int):int");
    }

    public static int bV(int i, long j) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 79;
        int i5 = -(-(i3 | 79));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        int iBT = bT(i);
        int iBZ = bZ(j);
        int i8 = iBZ ^ iBT;
        int i9 = ((iBT & iBZ) | i8) << 1;
        int i10 = -i8;
        int i11 = (i9 ^ i10) + ((i9 & i10) << 1);
        int i12 = a;
        int i13 = i12 & 119;
        int i14 = i13 + ((i12 ^ 119) | i13);
        b = i14 % 128;
        int i15 = i14 % 2;
        return i11;
    }

    public static long bW(long j) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & 58) + (i2 | 58)) - 1;
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        long j2 = (j << 1) ^ (j >> 63);
        int i6 = ((i4 ^ 116) + ((i4 & 116) << 1)) - 1;
        a = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }

    public static int bX(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 ^ 41) | (i3 & 41)) << 1;
        int i5 = -((i3 & (-42)) | ((~i3) & 41));
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        int i8 = i >> 31;
        int i9 = i << 1;
        int i10 = (i9 | i8) & (~(i8 & i9));
        int i11 = i3 + 43;
        a = i11 % 128;
        int i12 = i11 % 2;
        return i10;
    }

    public static int bZ(long j) {
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 & 77) + (i3 | 77);
        int i5 = i4 % 128;
        b = i5;
        int i6 = i4 % 2;
        if (((-128) & j) == 0) {
            int i7 = i5 ^ 77;
            int i8 = ((i5 & 77) | i7) << 1;
            int i9 = -i7;
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            a = i10 % 128;
            int i11 = i10 % 2;
            int i12 = ((i5 ^ 9) - (~((i5 & 9) << 1))) - 1;
            a = i12 % 128;
            int i13 = i12 % 2;
            return 1;
        }
        if (j < 0) {
            int i14 = i5 & 41;
            int i15 = (i5 ^ 41) | i14;
            int i16 = (i14 ^ i15) + ((i14 & i15) << 1);
            a = i16 % 128;
            return i16 % 2 == 0 ? 113 : 10;
        }
        if (((-34359738368L) & j) != 0) {
            int i17 = i5 & 71;
            int i18 = -(-((i5 ^ 71) | i17));
            int i19 = ((i17 | i18) << 1) - (i17 ^ i18);
            a = i19 % 128;
            if (i19 % 2 == 0) {
                j >>>= 31;
                i = 49;
            } else {
                j >>>= 28;
                i = 6;
            }
            int i20 = i5 + 93;
            a = i20 % 128;
            if (i20 % 2 == 0) {
                int i21 = 4 % 3;
            }
        } else {
            int i22 = i3 & 107;
            int i23 = ((i3 ^ 107) | i22) << 1;
            int i24 = -((i3 | 107) & (~i22));
            int i25 = (i23 & i24) + (i24 | i23);
            b = i25 % 128;
            int i26 = i25 % 2;
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            int i27 = b;
            int i28 = ((i27 | 121) << 1) - (i27 ^ 121);
            int i29 = i28 % 128;
            a = i29;
            int i30 = i28 % 2;
            int i31 = i & 2;
            i = ((i | 2) & (~i31)) + (i31 << 1);
            j >>>= 14;
            int i32 = (((i29 | 56) << 1) - (i29 ^ 56)) - 1;
            b = i32 % 128;
            int i33 = i32 % 2;
        }
        if ((j & (-16384)) != 0) {
            int i34 = b;
            int i35 = i34 ^ 45;
            int i36 = ((((i34 & 45) | i35) << 1) - (~(-i35))) - 1;
            int i37 = i36 % 128;
            a = i37;
            int i38 = i36 % 2;
            i = (-2) - ((i + 2) ^ (-1));
            int i39 = ((i37 ^ 121) | (i37 & 121)) << 1;
            int i40 = -(((~i37) & 121) | (i37 & (-122)));
            int i41 = ((i39 | i40) << 1) - (i39 ^ i40);
            b = i41 % 128;
            if (i41 % 2 != 0) {
                int i42 = 3 % 2;
            }
        }
        int i43 = a + 69;
        b = i43 % 128;
        if (i43 % 2 == 0) {
            return i;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static int bx(int i, long j) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 & 15) + (i3 | 15);
        a = i4 % 128;
        int i5 = i4 % 2;
        int iBT = bT(i) + 8;
        int i6 = b;
        int i7 = (i6 ^ 43) + ((i6 & 43) << 1);
        a = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 24 / 0;
        }
        return iBT;
    }

    public static int by(AbstractC0069z abstractC0069z) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 45) + ((i2 & 45) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        int iBK = bK(abstractC0069z.size());
        int i5 = b;
        int i6 = i5 & 125;
        int i7 = i6 + ((i5 ^ 125) | i6);
        a = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 43 / 0;
        }
        return iBK;
    }

    public static int bz(int i, boolean z) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((((i3 ^ 87) | (i3 & 87)) << 1) - (~(-(((~i3) & 87) | (i3 & (-88)))))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        int iBT = bT(i);
        int i6 = iBT & 1;
        int i7 = (iBT | 1) & (~i6);
        int i8 = -(-(i6 << 1));
        int i9 = (i7 & i8) + (i7 | i8);
        int i10 = b + 38;
        int i11 = (i10 ^ (-1)) + (i10 << 1);
        a = i11 % 128;
        if (i11 % 2 != 0) {
            return i9;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public abstract int ca();

    public abstract void cb(byte b2);

    public abstract void cc(int i, AbstractC0069z abstractC0069z);

    public abstract void cd(int i, boolean z);

    public abstract void ce(int i, int i2);

    public abstract void cf(int i);

    public abstract void cg(int i, long j);

    public abstract void ch(int i, aa aaVar);

    public abstract void ci(int i, int i2);

    public abstract void cj(long j);

    public abstract void ck(int i);

    public abstract void cl(int i, aa aaVar, ah ahVar);

    public abstract void cm(int i, String str);

    public abstract void cn(int i, AbstractC0069z abstractC0069z);

    public abstract void co(int i, int i2);

    public abstract void cp(int i);

    public abstract void cq(int i, int i2);

    public abstract void cr(int i, long j);

    public abstract void cs(long j);

    public AbstractC0064u(bjh bjhVar) {
    }

    public static int bE(int i, AbstractC0069z abstractC0069z) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 | 59) << 1;
        int i5 = -(((~i3) & 59) | (i3 & (-60)));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        int iBT = bT(i);
        int iBK = bK(abstractC0069z.size());
        int i8 = ((~iBK) & iBT) | ((~iBT) & iBK);
        int i9 = (iBT & iBK) << 1;
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        int i11 = a;
        int i12 = (i11 & 71) + (i11 | 71);
        b = i12 % 128;
        int i13 = i12 % 2;
        return i10;
    }

    public static int bH(int i, long j) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 | 53) << 1;
        int i5 = -(((~i3) & 53) | (i3 & (-54)));
        int i6 = (i4 & i5) + (i5 | i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        int iBT = bT(i);
        int i8 = -(-bZ(j));
        int i9 = ((iBT ^ i8) | (iBT & i8)) << 1;
        int i10 = -(((~iBT) & i8) | ((~i8) & iBT));
        int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
        int i12 = b;
        int i13 = ((i12 & 92) + (i12 | 92)) - 1;
        a = i13 % 128;
        if (i13 % 2 != 0) {
            return i11;
        }
        throw null;
    }

    @Deprecated
    public static int bY(int i, aa aaVar, ah ahVar) {
        int i2;
        int i3 = 2 % 2;
        int i4 = b + 95;
        a = i4 % 128;
        if (i4 % 2 == 0) {
            int iBT = bT(i) >>> 4;
            int i5 = -((AbstractC0053j) aaVar).k(ahVar);
            i2 = (((iBT ^ i5) | (iBT & i5)) << 1) - (((~iBT) & i5) | ((~i5) & iBT));
        } else {
            int iBT2 = bT(i) * 2;
            int i6 = -(-((AbstractC0053j) aaVar).k(ahVar));
            i2 = (iBT2 ^ i6) + ((iBT2 & i6) << 1);
        }
        int i7 = a;
        int i8 = i7 & 21;
        int i9 = ((i7 ^ 21) | i8) << 1;
        int i10 = -((i7 | 21) & (~i8));
        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
        b = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 19 / 0;
        }
        return i2;
    }
}
