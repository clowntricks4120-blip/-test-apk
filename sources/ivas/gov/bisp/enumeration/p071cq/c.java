package ivas.gov.bisp.enumeration.p071cq;

import ivas.gov.bisp.enumeration.p096p.h;
import ivas.gov.bisp.enumeration.p101x.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class c implements i {
    private static int a = 1;
    private static int b;
    public static final long[] c = {4794697086780616226L, 8158064640168781261L, -5349999486874862801L, -1606136188198331460L, 4131703408338449720L, 6480981068601479193L, -7908458776815382629L, -6116909921290321640L, -2880145864133508542L, 1334009975649890238L, 2608012711638119052L, 6128411473006802146L, 8268148722764581231L, -9160688886553864527L, -7215885187991268811L, -4495734319001033068L, -1973867731355612462L, -1171420211273849373L, 1135362057144423861L, 2597628984639134821L, 3308224258029322869L, 5365058923640841347L, 6679025012923562964L, 8573033837759648693L, -7476448914759557205L, -6327057829258317296L, -5763719355590565569L, -4658551843659510044L, -4116276920077217854L, -3051310485924567259L, 489312712824947311L, 1452737877330783856L, 2861767655752347644L, 3322285676063803686L, 5560940570517711597L, 5996557281743188959L, 7280758554555802590L, 8532644243296465576L, -9096487096722542874L, -7894198246740708037L, -6719396339535248540L, -6333637450476146687L, -4446306890439682159L, -4076793802049405392L, -3345356375505022440L, -2983346525034927856L, -860691631967231958L, 1182934255886127544L, 1847814050463011016L, 2177327727835720531L, 2830643537854262169L, 3796741975233480872L, 4115178125766777443L, 5681478168544905931L, 6601373596472566643L, 7507060721942968483L, 8399075790359081724L, 8693463985226723168L, -8878714635349349518L, -8302665154208450068L, -8016688836872298968L, -6606660893046293015L, -4685533653050689259L, -4147400797238176981L, -3880063495543823972L, -3348786107499101689L, -1523767162380948706L, -757361751448694408L, 500013540394364858L, 748580250866718886L, 1242879168328830382L, 1977374033974150939L, 2944078676154940804L, 3659926193048069267L, 4368137639120453308L, 4836135668995329356L, 5532061633213252278L, 6448918945643986474L, 6902733635092675308L, 7801388544844847127L};
    public long d;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;
    public long m;
    public long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f90o;
    public int p;
    public byte[] e = new byte[8];
    public long[] q = new long[80];
    public int f = 0;

    static {
        int i = 1 & 51;
        int i2 = (((1 ^ 51) | i) << 1) - ((~i) & (1 | 51));
        b = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public c() {
        q();
    }

    @Override // ivas.gov.bisp.enumeration.p101x.i
    public void e(byte b2) {
        int i = 2 % 2;
        int i2 = a + 121;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        byte[] bArr = this.e;
        int i5 = this.f;
        int i6 = (i3 ^ 105) + ((i3 & 105) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        int i8 = i5 & 1;
        int i9 = (i8 - (~(-(-((i5 ^ 1) | i8))))) - 1;
        this.f = i9;
        bArr[i5] = b2;
        int i10 = i3 & 33;
        int i11 = (i3 ^ 33) | i10;
        int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
        a = i12 % 128;
        int i13 = i12 % 2;
        if (i9 == bArr.length) {
            int i14 = i3 & 117;
            int i15 = (((i3 ^ 117) | i14) << 1) - ((i3 | 117) & (~i14));
            a = i15 % 128;
            int i16 = i15 % 2;
            o(bArr, 0);
            this.f = 0;
        }
        this.g++;
        int i17 = b;
        int i18 = (i17 & (-120)) | ((~i17) & 119);
        int i19 = -(-((i17 & 119) << 1));
        int i20 = (i18 & i19) + (i19 | i18);
        a = i20 % 128;
        int i21 = i20 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.p101x.i
    public void f(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        byte[] bArr2;
        int i5;
        int i6 = 2 % 2;
        int i7 = a;
        int i8 = i7 ^ 115;
        int i9 = (i7 & 115) << 1;
        int i10 = (i8 & i9) + (i9 | i8);
        int i11 = i10 % 128;
        b = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 69;
        a = i13 % 128;
        loop0: while (true) {
            int i14 = i13 % 2;
            do {
                if (this.f == 0) {
                    break loop0;
                }
                int i15 = a;
                int i16 = ((i15 | 41) << 1) - (i15 ^ 41);
                int i17 = i16 % 128;
                b = i17;
                int i18 = i16 % 2;
                if (i2 <= 0) {
                    break loop0;
                }
                int i19 = ((i17 | 63) << 1) - (i17 ^ 63);
                a = i19 % 128;
                int i20 = i19 % 2;
                e(bArr[i]);
                int i21 = (i & (-2)) | ((~i) & 1);
                int i22 = (i & 1) << 1;
                i = ((i22 & i21) << 1) + (i21 ^ i22);
                int i23 = i2 & (-24);
                int i24 = (i2 ^ (-24)) | i23;
                int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
                i2 = ((((i25 ^ 23) | (i25 & 23)) << 1) - (~(-((i25 & (-24)) | ((~i25) & 23))))) - 1;
                int i26 = b;
                i5 = (i26 ^ 71) + ((i26 & 71) << 1);
                a = i5 % 128;
            } while (i5 % 2 != 0);
            i13 = 4;
        }
        while (i2 > this.e.length) {
            int i27 = a;
            int i28 = i27 & 15;
            int i29 = (((i27 | 15) & (~i28)) - (~(i28 << 1))) - 1;
            b = i29 % 128;
            int i30 = i29 % 2;
            o(bArr, i);
            if (i30 != 0) {
                bArr2 = this.e;
                int i31 = 28 / 0;
            } else {
                bArr2 = this.e;
            }
            int i32 = b;
            int i33 = ((i32 & (-112)) | ((~i32) & 111)) + ((i32 & 111) << 1);
            a = i33 % 128;
            int i34 = i33 % 2;
            i += bArr2.length;
            int i35 = -bArr2.length;
            i2 = ((i2 & i35) << 1) + (i2 ^ i35);
            long j = this.g;
            int i36 = i32 & 63;
            int i37 = -(-(i32 | 63));
            int i38 = (i36 & i37) + (i37 | i36);
            a = i38 % 128;
            int i39 = i38 % 2;
            long length = bArr2.length;
            this.g = i39 == 0 ? j - length : j + length;
        }
        while (i2 > 0) {
            int i40 = a;
            int i41 = ((i40 | 13) << 1) - (((~i40) & 13) | (i40 & (-14)));
            b = i41 % 128;
            if (i41 % 2 != 0) {
                e(bArr[i]);
                int i42 = i & 59;
                int i43 = (i ^ 59) | i42;
                i3 = i42 & i43;
                i4 = i43 | i42;
            } else {
                e(bArr[i]);
                int i44 = i & 1;
                int i45 = i | 1;
                i3 = i44 ^ i45;
                i4 = (i45 & i44) << 1;
            }
            i = i3 + i4;
            int i46 = i2 & (-11);
            int i47 = -(-((i2 ^ (-11)) | i46));
            int i48 = (i46 ^ i47) + ((i47 & i46) << 1);
            int i49 = (i48 & (-11)) | ((~i48) & 10);
            int i50 = -(-((i48 & 10) << 1));
            i2 = ((i49 & i50) << 1) + (i49 ^ i50);
            int i51 = b;
            int i52 = (((i51 ^ 95) | (i51 & 95)) << 1) - (((~i51) & 95) | (i51 & (-96)));
            a = i52 % 128;
            int i53 = i52 % 2;
        }
        int i54 = a;
        int i55 = ((i54 & 89) - (~(i54 | 89))) - 1;
        b = i55 % 128;
        int i56 = i55 % 2;
    }

    public final long g(long j) {
        long j2;
        long j3;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 115;
        int i4 = (~i3) & (i2 | 115);
        int i5 = -(-(i3 << 1));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        long j4 = (j >>> 39) | (j << 25);
        int i8 = i2 & 101;
        int i9 = (i2 ^ 101) | i8;
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        int i11 = i10 % 128;
        b = i11;
        if (i10 % 2 != 0) {
            j2 = (j >> 36) + (j >> 57);
            j3 = j >>> 82;
        } else {
            j2 = (j << 36) | (j >>> 28);
            j3 = j << 30;
        }
        long j5 = (((j >>> 34) | j3) ^ j2) ^ j4;
        int i12 = (((i11 | 91) << 1) - (~(-(((~i11) & 91) | (i11 & (-92)))))) - 1;
        a = i12 % 128;
        int i13 = i12 % 2;
        return j5;
    }

    public final long j(long j, long j2, long j3) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 39;
        int i4 = ((i2 ^ 39) | i3) << 1;
        int i5 = -((i2 | 39) & (~i3));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        a = i6 % 128;
        if (i6 % 2 == 0) {
            return ((-1) / j3) & (j2 % j);
        }
        return (j & j2) ^ (j3 & (~j));
    }

    public final long k(long j, long j2, long j3) {
        long j4;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 119) + ((i2 & 119) << 1);
        b = i3 % 128;
        if (i3 % 2 != 0) {
            j4 = (j * j2) & (j - j3);
        } else {
            j4 = (j & j2) ^ (j & j3);
        }
        long j5 = j4 ^ (j2 & j3);
        int i4 = (i2 & (-100)) | ((~i2) & 99);
        int i5 = (i2 & 99) << 1;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        b = i6 % 128;
        int i7 = i6 % 2;
        return j5;
    }

    public final long l(long j) {
        long j2;
        long j3;
        long j4;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 + 45;
        b = i3 % 128;
        int i4 = i3 % 2;
        long j5 = (j >>> 41) | (j << 23);
        long j6 = j << 50;
        int i5 = (-2) - (((i2 ^ 122) + ((i2 & 122) << 1)) ^ (-1));
        int i6 = i5 % 128;
        b = i6;
        if (i5 % 2 != 0) {
            j2 = j6 - (j >> 14);
            j3 = j >> 125;
            j4 = j << 11;
        } else {
            j2 = j6 | (j >>> 14);
            j3 = j << 46;
            j4 = j >>> 18;
        }
        long j7 = ((j4 | j3) ^ j2) ^ j5;
        int i7 = (i6 & 61) + (i6 | 61);
        a = i7 % 128;
        int i8 = i7 % 2;
        return j7;
    }

    public final void m() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 29;
        int i4 = (i2 ^ 29) | i3;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        int i6 = i5 % 128;
        a = i6;
        int i7 = i5 % 2;
        long j = this.g;
        if (j > 2305843009213693951L) {
            int i8 = (i6 ^ 25) + ((i6 & 25) << 1);
            int i9 = i8 % 128;
            b = i9;
            this.h = i8 % 2 != 0 ? this.h ^ (j >>> 39) : this.h + (j >>> 61);
            int i10 = i9 & 65;
            int i11 = i9 | 65;
            int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
            a = i12 % 128;
            int i13 = i12 % 2;
            this.g = j & 2305843009213693951L;
            int i14 = i9 & 43;
            int i15 = (i9 | 43) & (~i14);
            int i16 = -(-(i14 << 1));
            int i17 = ((i15 | i16) << 1) - (i15 ^ i16);
            a = i17 % 128;
            int i18 = i17 % 2;
        }
        int i19 = b;
        int i20 = i19 & 7;
        int i21 = -(-(i19 | 7));
        int i22 = (i20 & i21) + (i21 | i20);
        a = i22 % 128;
        int i23 = i22 % 2;
    }

    public void n() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 70) + ((i2 & 70) << 1)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        m();
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j = this.g;
        long j2 = this.h;
        int i5 = a;
        int i6 = i5 ^ 87;
        int i7 = ((((i5 & 87) | i6) << 1) - (~(-i6))) - 1;
        b = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 4 % 5;
        }
        byte b2 = -128;
        while (true) {
            e(b2);
            if (this.f == 0) {
                break;
            }
            int i9 = a;
            int i10 = i9 & 89;
            int i11 = ((((i9 ^ 89) | i10) << 1) - (~(-((i9 | 89) & (~i10))))) - 1;
            b = i11 % 128;
            int i12 = i11 % 2;
            b2 = 0;
        }
        if (this.p > 14) {
            int i13 = b;
            int i14 = (i13 ^ 105) + ((i13 & 105) << 1);
            a = i14 % 128;
            int i15 = i14 % 2;
            p();
            int i16 = a;
            int i17 = (i16 ^ 2) + ((i16 & 2) << 1);
            int i18 = (i17 ^ (-1)) + (i17 << 1);
            b = i18 % 128;
            int i19 = i18 % 2;
        }
        long[] jArr = this.q;
        jArr[14] = j2;
        int i20 = (-2) - ((b + 114) ^ (-1));
        a = i20 % 128;
        int i21 = i20 % 2;
        jArr[15] = j << 3;
        p();
        int i22 = b;
        int i23 = i22 & 83;
        int i24 = (((i22 ^ 83) | i23) << 1) - ((i22 | 83) & (~i23));
        a = i24 % 128;
        int i25 = i24 % 2;
    }

    public void o(byte[] bArr, int i) {
        int i2;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = i4 & 31;
        int i6 = i5 + ((i4 ^ 31) | i5);
        b = i6 % 128;
        int i7 = i6 % 2;
        long[] jArr = this.q;
        int i8 = this.p;
        long jF = h.f(bArr, i);
        int i9 = b;
        int i10 = ((i9 ^ 62) + ((i9 & 62) << 1)) - 1;
        a = i10 % 128;
        if (i10 % 2 == 0) {
            jArr[i8] = jF;
            i2 = this.p >> 1;
        } else {
            jArr[i8] = jF;
            int i11 = this.p;
            int i12 = i11 & 1;
            i2 = ((i11 | 1) & (~i12)) + (i12 << 1);
        }
        this.p = i2;
        int i13 = i9 & 61;
        int i14 = ((i9 ^ 61) | i13) << 1;
        int i15 = -((~i13) & (i9 | 61));
        int i16 = (i14 & i15) + (i14 | i15);
        int i17 = i16 % 128;
        a = i17;
        if (i16 % 2 != 0 ? i2 == 16 : i2 == 118) {
            int i18 = i17 & 89;
            int i19 = (i18 - (~(-(-((i17 ^ 89) | i18))))) - 1;
            b = i19 % 128;
            int i20 = i19 % 2;
            p();
            int i21 = a;
            int i22 = i21 ^ 117;
            int i23 = ((i21 & 117) | i22) << 1;
            int i24 = -i22;
            int i25 = ((i23 | i24) << 1) - (i23 ^ i24);
            b = i25 % 128;
            int i26 = i25 % 2;
        }
        int i27 = b + 71;
        a = i27 % 128;
        if (i27 % 2 == 0) {
            int i28 = 22 / 0;
        }
    }

    public void p() {
        long j;
        int i;
        long j2;
        long j3;
        char c2;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 ^ 22) + ((i3 & 22) << 1)) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        m();
        int i6 = i5 == 0 ? 32 : 16;
        int i7 = a;
        int i8 = (i7 & 79) + (i7 | 79);
        b = i8 % 128;
        int i9 = i8 % 2;
        for (int i10 = 79; i6 <= i10; i10 = 79) {
            int i11 = a;
            int i12 = (i11 & (-94)) | ((~i11) & 93);
            int i13 = (i11 & 93) << 1;
            int i14 = (i12 & i13) + (i12 | i13);
            b = i14 % 128;
            int i15 = i14 % 2;
            long[] jArr = this.q;
            int i16 = i6 & (-2);
            long j4 = jArr[(((~i16) & (i6 | (-2))) - (~(i16 << 1))) - 1];
            int i17 = ((i11 | 67) << 1) - (i11 ^ 67);
            int i18 = i17 % 128;
            b = i18;
            int i19 = i17 % 2;
            int i20 = i6 & (-7);
            long j5 = jArr[i20 + ((i6 ^ (-7)) | i20)];
            long j6 = jArr[i6 - 15];
            int i21 = i18 ^ 79;
            int i22 = (i18 & 79) << 1;
            int i23 = (i21 & i22) + (i21 | i22);
            a = i23 % 128;
            if (i23 % 2 == 0) {
                j2 = j4 << 85;
                j3 = j4 >> 54;
                c2 = 27;
            } else {
                j2 = j4 >>> 6;
                j3 = j4 << 45;
                c2 = 19;
            }
            int i24 = (i18 & 9) + (i18 | 9);
            int i25 = i24 % 128;
            a = i25;
            int i26 = i24 % 2;
            int i27 = (i25 ^ 91) + ((i25 & 91) << 1);
            b = i27 % 128;
            int i28 = i27 % 2;
            long j7 = (j2 ^ ((j3 | (j4 >>> c2)) ^ ((j4 << 3) | (j4 >>> 61)))) + j5;
            long j8 = j6 >>> 7;
            long j9 = (j6 << 63) | (j6 >>> 1);
            int i29 = ((i25 | 81) << 1) - (i25 ^ 81);
            int i30 = i29 % 128;
            b = i30;
            long j10 = i29 % 2 != 0 ? j7 - (j8 ^ (j9 & ((j6 << 98) - (j6 >>> 71)))) : j7 + (j8 ^ (j9 ^ ((j6 << 56) | (j6 >>> 8))));
            int i31 = i30 | 1;
            int i32 = i31 << 1;
            int i33 = -((~(i30 & 1)) & i31);
            int i34 = (i32 ^ i33) + ((i33 & i32) << 1);
            a = i34 % 128;
            if (i34 % 2 == 0) {
                jArr[i6] = j10 % jArr[i6 % 16];
                int i35 = i6 & 41;
                int i36 = -(-((i6 ^ 41) | i35));
                i6 = (i35 & i36) + (i36 | i35);
            } else {
                jArr[i6] = j10 + jArr[i6 - 16];
                i6++;
            }
        }
        long j11 = this.j;
        long j12 = this.i;
        long j13 = this.k;
        int i37 = a;
        int i38 = (i37 ^ 27) + ((i37 & 27) << 1);
        b = i38 % 128;
        int i39 = i38 % 2;
        long j14 = this.l;
        long j15 = this.d;
        long j16 = this.m;
        int i40 = (i37 & 17) + (i37 | 17);
        int i41 = i40 % 128;
        b = i41;
        long j17 = i40 % 2 != 0 ? this.n : this.n;
        int i42 = (i41 | 99) << 1;
        int i43 = -(i41 ^ 99);
        int i44 = (i42 ^ i43) + ((i42 & i43) << 1);
        long j18 = this.f90o;
        a = i44 % 128;
        boolean z = false;
        long j19 = j16;
        long j20 = j14;
        long j21 = j12;
        long j22 = j17;
        int i45 = i44 % 2 == 0 ? 1 : 0;
        long j23 = j11;
        long j24 = j22;
        int i46 = 0;
        long j25 = j13;
        long j26 = j15;
        while (i45 < 10) {
            int i47 = b;
            int i48 = (-2) - (((i47 ^ 114) + ((i47 & 114) << 1)) ^ (-1));
            a = i48 % 128;
            int i49 = i48 % 2;
            long jL = l(j26);
            long j27 = j26;
            long j28 = j(j26, j19, j24);
            long[] jArr2 = c;
            long j29 = jArr2[i46];
            long[] jArr3 = this.q;
            int i50 = ((i46 ^ 1) | (i46 & 1)) << 1;
            int i51 = i45;
            int i52 = -((i46 & (-2)) | ((~i46) & 1));
            int i53 = (i50 & i52) + (i50 | i52);
            long j30 = jL + j28 + j29 + jArr3[i46] + j18;
            long j31 = j20 + j30;
            long j32 = j21;
            long jG = g(j23) + k(j23, j21, j25);
            int i54 = b;
            int i55 = (i54 ^ 49) + ((i54 & 49) << 1);
            a = i55 % 128;
            int i56 = i55 % 2;
            long j33 = jG + j30;
            int i57 = (i53 & 1) + (i53 | 1);
            long jL2 = l(j31) + j(j31, j27, j19) + jArr2[i53] + this.q[i53] + j24;
            long j34 = j25 + jL2;
            long jG2 = g(j33) + k(j33, j23, j32);
            int i58 = b;
            int i59 = i58 ^ 41;
            int i60 = (i58 & 41) << 1;
            int i61 = (i59 & i60) + (i60 | i59);
            a = i61 % 128;
            int i62 = i61 % 2;
            long j35 = jG2 + jL2;
            int i63 = (-2) - ((((i57 | 2) << 1) - (i57 ^ 2)) ^ (-1));
            long jL3 = l(j34) + j(j34, j31, j27) + jArr2[i57] + this.q[i57] + j19;
            long j36 = j32 + jL3;
            long jG3 = g(j35) + k(j35, j33, j23);
            int i64 = a;
            int i65 = i64 & 1;
            int i66 = (i64 | 1) & (~i65);
            int i67 = -(-(i65 << 1));
            int i68 = (i66 ^ i67) + ((i66 & i67) << 1);
            b = i68 % 128;
            int i69 = i68 % 2;
            long j37 = jG3 + jL3;
            long jL4 = l(j36);
            long j38 = j(j36, j34, j31);
            int i70 = i63 & 1;
            int i71 = (i63 ^ 1) | i70;
            int i72 = ((i70 | i71) << 1) - (i70 ^ i71);
            long j39 = jL4 + j38 + jArr2[i63] + this.q[i63] + j27;
            long j40 = j23 + j39;
            long jG4 = g(j37) + k(j37, j35, j33);
            int i73 = b;
            int i74 = ((i73 ^ 30) + ((i73 & 30) << 1)) - 1;
            a = i74 % 128;
            int i75 = i74 % 2;
            long j41 = jG4 + j39;
            int i76 = i72 + 1;
            long jL5 = l(j40) + j(j40, j36, j34) + jArr2[i72] + this.q[i72] + j31;
            long j42 = j33 + jL5;
            long jG5 = g(j41) + k(j41, j37, j35);
            int i77 = a;
            int i78 = i77 & 75;
            int i79 = ((((i77 ^ 75) | i78) << 1) - (~(-((i77 | 75) & (~i78))))) - 1;
            b = i79 % 128;
            int i80 = i79 % 2;
            long j43 = jG5 + jL5;
            long jL6 = l(j42);
            long j44 = j(j42, j40, j36);
            long j45 = jArr2[i76];
            long[] jArr4 = this.q;
            int i81 = i76 & 1;
            int i82 = (~i81) & (i76 | 1);
            int i83 = i81 << 1;
            int i84 = ((i82 | i83) << 1) - (i83 ^ i82);
            long j46 = jL6 + j44 + j45 + jArr4[i76] + j34;
            long j47 = j35 + j46;
            long jG6 = g(j43) + k(j43, j41, j37);
            int i85 = b;
            int i86 = (i85 & 37) + (i85 | 37);
            a = i86 % 128;
            int i87 = i86 % 2;
            long j48 = jG6 + j46;
            long jL7 = l(j47);
            j25 = j48;
            int i88 = ((i84 | 1) << 1) - (i84 ^ 1);
            long j49 = jL7 + j(j47, j42, j40) + jArr2[i84] + this.q[i84] + j36;
            long j50 = j37 + j49;
            long jG7 = g(j25) + k(j25, j43, j41);
            int i89 = b;
            int i90 = (i89 ^ 30) + ((i89 & 30) << 1);
            int i91 = (i90 ^ (-1)) + (i90 << 1);
            a = i91 % 128;
            int i92 = i91 % 2;
            long j51 = jG7 + j49;
            j19 = j50;
            j21 = j51;
            long jL8 = l(j50) + j(j50, j47, j42) + jArr2[i88] + this.q[i88] + j40;
            long jG8 = g(j21);
            long jK = k(j21, j25, j43);
            int i93 = i51 & 115;
            int i94 = ((((i51 ^ 115) | i93) << 1) - (~(-((~i93) & (i51 | 115))))) - 1;
            int i95 = ((i94 ^ (-114)) | (i94 & (-114))) << 1;
            int i96 = -(((~i94) & (-114)) | (i94 & 113));
            int i97 = ((i95 | i96) << 1) - (i96 ^ i95);
            i46 = ((i88 ^ 2) + ((i88 & 2) << 1)) - 1;
            j26 = j41 + jL8;
            j23 = jG8 + jK + jL8;
            int i98 = a;
            int i99 = i98 & 75;
            int i100 = ((i98 ^ 75) | i99) << 1;
            int i101 = -((i98 | 75) & (~i99));
            int i102 = (i100 ^ i101) + ((i101 & i100) << 1);
            b = i102 % 128;
            int i103 = i102 % 2;
            i45 = i97;
            j24 = j47;
            j18 = j42;
            j20 = j43;
            z = false;
        }
        long j52 = j26;
        long j53 = j21;
        this.j += j23;
        long j54 = this.i;
        int i104 = b;
        int i105 = i104 & 105;
        int i106 = (~i105) & (i104 | 105);
        int i107 = -(-(i105 << 1));
        int i108 = (i106 & i107) + (i107 | i106);
        a = i108 % 128;
        if (i108 % 2 == 0) {
            this.i = j54 ^ j53;
            j = this.k & j25;
        } else {
            this.i = j54 + j53;
            j = this.k + j25;
        }
        this.k = j;
        int i109 = (i104 & (-4)) | ((~i104) & 3);
        int i110 = -(-((i104 & 3) << 1));
        int i111 = (i109 & i110) + (i109 | i110);
        int i112 = i111 % 128;
        a = i112;
        int i113 = i111 % 2;
        this.l += j20;
        long j55 = this.d;
        int i114 = i112 ^ 9;
        int i115 = -(-((i112 & 9) << 1));
        int i116 = ((i114 | i115) << 1) - (i115 ^ i114);
        int i117 = i116 % 128;
        b = i117;
        int i118 = i116 % 2;
        this.d = j55 + j52;
        this.m += j19;
        int i119 = i117 & 77;
        int i120 = ((i117 ^ 77) | i119) << 1;
        int i121 = -((~i119) & (i117 | 77));
        int i122 = (i120 ^ i121) + ((i120 & i121) << 1);
        a = i122 % 128;
        int i123 = i122 % 2;
        this.n += j24;
        long j56 = this.f90o;
        int i124 = (i117 & 3) + (i117 | 3);
        a = i124 % 128;
        if (i124 % 2 == 0) {
            this.f90o = j56 / j18;
            i = 0;
        } else {
            i = 0;
            this.f90o = j56 + j18;
        }
        this.p = i;
        int i125 = i;
        while (i125 < 16) {
            int i126 = b;
            int i127 = (i126 ^ 57) + ((i126 & 57) << 1);
            a = i127 % 128;
            int i128 = i127 % 2;
            this.q[i125] = 0;
            int i129 = (-2) - (((i125 & (-22)) + (i125 | (-22))) ^ (-1));
            int i130 = i129 & 24;
            int i131 = -(-((i129 ^ 24) | i130));
            i125 = ((i131 & i130) << 1) + (i130 ^ i131);
            int i132 = (i126 ^ 49) + ((i126 & 49) << 1);
            a = i132 % 128;
            int i133 = i132 % 2;
        }
        int i134 = a;
        int i135 = (i134 ^ 119) + ((i134 & 119) << 1);
        b = i135 % 128;
        int i136 = i135 % 2;
    }

    public void q() {
        int i;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = b;
        int i6 = i5 & 59;
        int i7 = (i6 - (~(-(-((i5 ^ 59) | i6))))) - 1;
        int i8 = i7 % 128;
        a = i8;
        int i9 = i7 % 2;
        int i10 = 0;
        this.g = 0L;
        if (i9 == 0) {
            this.h = 1L;
            this.f = 1;
            i = 1;
        } else {
            this.h = 0L;
            this.f = 0;
            i = 0;
        }
        int i11 = i8 & 105;
        int i12 = -(-(i8 | 105));
        int i13 = (i11 & i12) + (i12 | i11);
        b = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 5 % 2;
        }
        while (true) {
            byte[] bArr = this.e;
            if (i >= bArr.length) {
                break;
            }
            int i15 = b;
            int i16 = (i15 ^ 93) + ((i15 & 93) << 1);
            a = i16 % 128;
            int i17 = i16 % 2;
            bArr[i] = 0;
            int i18 = i | 1;
            int i19 = i18 << 1;
            int i20 = -((~(i & 1)) & i18);
            i = ((i20 & i19) << 1) + (i19 ^ i20);
            int i21 = (-2) - ((i15 + 102) ^ (-1));
            a = i21 % 128;
            int i22 = i21 % 2;
        }
        this.p = 0;
        int i23 = a + 37;
        b = i23 % 128;
        int i24 = i23 % 2;
        while (true) {
            long[] jArr = this.q;
            if (i10 == jArr.length) {
                break;
            }
            int i25 = b;
            int i26 = i25 & 61;
            int i27 = -(-((i25 ^ 61) | i26));
            int i28 = (i26 & i27) + (i26 | i27);
            a = i28 % 128;
            if (i28 % 2 == 0) {
                jArr[i10] = 1;
                int i29 = ((i10 ^ 10) | (i10 & 10)) << 1;
                int i30 = -(((~i10) & 10) | (i10 & (-11)));
                i2 = i29 ^ i30;
                i3 = (i29 & i30) << 1;
            } else {
                jArr[i10] = 0;
                int i31 = i10 & (-74);
                int i32 = i10 | (-74);
                int i33 = (i31 & i32) + (i31 | i32);
                int i34 = i33 & 75;
                int i35 = ((i33 ^ 75) | i34) << 1;
                int i36 = -((~i34) & (i33 | 75));
                i2 = i35 & i36;
                i3 = i35 | i36;
            }
            i10 = i2 + i3;
            int i37 = ((i25 ^ 81) | (i25 & 81)) << 1;
            int i38 = -(((~i25) & 81) | (i25 & (-82)));
            int i39 = (i37 & i38) + (i37 | i38);
            a = i39 % 128;
            int i40 = i39 % 2;
        }
        int i41 = a;
        int i42 = (i41 & (-76)) | ((~i41) & 75);
        int i43 = -(-((i41 & 75) << 1));
        int i44 = (i42 & i43) + (i43 | i42);
        b = i44 % 128;
        if (i44 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
