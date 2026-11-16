package ivas.gov.bisp.enumeration.O;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* JADX INFO: loaded from: classes.dex */
public class t {
    private static int a = 1;
    private static int b;
    public static final h c = new z(0.5f);
    public i d;
    public r e;
    public r f;
    public r g;
    public r h;
    public h i;
    public h j;
    public h k;
    public h l;
    public i m;
    public i n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public i f49o;

    static {
        int i = b;
        int i2 = ((i ^ 63) - (~(-(-((i & 63) << 1))))) - 1;
        a = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public t(bfu bfuVar, bft bftVar) {
        this.e = bfuVar.d;
        this.f = bfuVar.e;
        this.g = bfuVar.f;
        this.h = bfuVar.g;
        this.j = bfuVar.i;
        this.i = bfuVar.h;
        this.k = bfuVar.j;
        this.l = bfuVar.k;
        this.d = bfuVar.c;
        this.m = bfuVar.l;
        this.n = bfuVar.m;
        this.f49o = bfuVar.n;
    }

    public static bfu e(Context context, AttributeSet attributeSet, int i, int i2) {
        int i3 = 2 % 2;
        j jVar = new j(0.0f);
        int i4 = a;
        int i5 = ((i4 & 109) - (~(-(-(i4 | 109))))) - 1;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return f(context, attributeSet, i, i2, jVar);
        }
        f(context, attributeSet, i, i2, jVar);
        throw null;
    }

    public static h g(TypedArray typedArray, int i, h hVar) {
        int i2 = 2 % 2;
        int i3 = a + 29;
        b = i3 % 128;
        int i4 = i3 % 2;
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        Object obj = null;
        if (typedValuePeekValue == null) {
            int i5 = a;
            int i6 = i5 ^ 29;
            int i7 = ((((i5 & 29) | i6) << 1) - (~(-i6))) - 1;
            int i8 = i7 % 128;
            b = i8;
            if (i7 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i9 = ((i8 | 9) << 1) - (i8 ^ 9);
            a = i9 % 128;
            int i10 = i9 % 2;
            return hVar;
        }
        int i11 = typedValuePeekValue.type;
        if (i11 == 5) {
            j jVar = new j(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            int i12 = a;
            int i13 = (i12 & 77) + (i12 | 77);
            b = i13 % 128;
            if (i13 % 2 == 0) {
                return jVar;
            }
            throw null;
        }
        if (i11 == 6) {
            z zVar = new z(typedValuePeekValue.getFraction(1.0f, 1.0f));
            int i14 = a;
            int i15 = ((i14 | 77) << 1) - (i14 ^ 77);
            b = i15 % 128;
            if (i15 % 2 != 0) {
                int i16 = 53 / 0;
            }
            return zVar;
        }
        int i17 = b;
        int i18 = i17 & 81;
        int i19 = (((i17 ^ 81) | i18) << 1) - ((i17 | 81) & (~i18));
        a = i19 % 128;
        if (i19 % 2 != 0) {
            return hVar;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:37:0x0134  */
    /* JADX WARN: Code duplicated, block: B:39:0x0145  */
    /* JADX WARN: Code duplicated, block: B:55:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:64:0x01d0  */
    public boolean i(RectF rectF) {
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        int i2;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = i4 & 39;
        int i6 = i5 + ((i4 ^ 39) | i5);
        b = i6 % 128;
        Object obj = null;
        if (i6 % 2 != 0) {
            this.f49o.getClass().equals(i.class);
            obj.hashCode();
            throw null;
        }
        boolean zEquals = this.f49o.getClass().equals(i.class);
        int i7 = b;
        int i8 = i7 | 103;
        int i9 = i8 << 1;
        int i10 = -((~(i7 & 103)) & i8);
        int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
        int i12 = i11 % 128;
        a = i12;
        boolean z4 = false;
        if (i11 % 2 != 0 ? zEquals : zEquals) {
            int i13 = i12 & 31;
            int i14 = (i13 - (~(-(-((i12 ^ 31) | i13))))) - 1;
            b = i14 % 128;
            if (i14 % 2 != 0) {
                this.m.getClass().equals(i.class);
                obj.hashCode();
                throw null;
            }
            if (this.m.getClass().equals(i.class) && this.d.getClass().equals(i.class)) {
                int i15 = b;
                int i16 = i15 & 27;
                int i17 = -(-((i15 ^ 27) | i16));
                int i18 = (i16 & i17) + (i17 | i16);
                a = i18 % 128;
                if (i18 % 2 == 0) {
                    int i19 = 2 / 0;
                    if (!this.n.getClass().equals(i.class)) {
                        int i20 = a + 89;
                        b = i20 % 128;
                        int i21 = i20 % 2;
                    } else {
                        int i22 = b;
                        int i23 = i22 ^ 51;
                        int i24 = ((i22 & 51) | i23) << 1;
                        int i25 = -i23;
                        i2 = ((i24 | i25) << 1) - (i24 ^ i25);
                        a = i2 % 128;
                        if (i2 % 2 == 0) {
                            z = true;
                        }
                    }
                    z = false;
                } else {
                    if (this.n.getClass().equals(i.class)) {
                        int i26 = b;
                        int i27 = i26 ^ 51;
                        int i28 = ((i26 & 51) | i27) << 1;
                        int i29 = -i27;
                        i2 = ((i28 | i29) << 1) - (i28 ^ i29);
                        a = i2 % 128;
                        if (i2 % 2 == 0) {
                            z = true;
                        }
                    } else {
                        int i210 = a + 89;
                        b = i210 % 128;
                        int i211 = i210 % 2;
                    }
                    z = false;
                }
            } else {
                int i212 = a + 89;
                b = i212 % 128;
                int i213 = i212 % 2;
                z = false;
            }
        } else {
            int i214 = a + 89;
            b = i214 % 128;
            int i215 = i214 % 2;
            z = false;
        }
        float fB = this.j.b(rectF);
        h hVar = this.i;
        int i30 = a;
        int i31 = ((i30 | 67) << 1) - (i30 ^ 67);
        b = i31 % 128;
        int i32 = i31 % 2;
        if (hVar.b(rectF) == fB) {
            int i33 = b;
            int i34 = i33 & 113;
            int i35 = i34 + ((i33 ^ 113) | i34);
            a = i35 % 128;
            int i36 = i35 % 2;
            if (this.l.b(rectF) == fB) {
                int i37 = b;
                int i38 = ((i37 | 79) << 1) - (i37 ^ 79);
                a = i38 % 128;
                int i39 = i38 % 2;
                if (this.k.b(rectF) == fB) {
                    int i40 = a;
                    int i41 = i40 & 75;
                    int i42 = ((i40 ^ 75) | i41) << 1;
                    int i43 = -((i40 | 75) & (~i41));
                    int i44 = (i42 & i43) + (i43 | i42);
                    int i45 = i44 % 128;
                    b = i45;
                    int i46 = i44 % 2;
                    int i47 = i45 & 59;
                    int i48 = (i47 - (~((i45 ^ 59) | i47))) - 1;
                    a = i48 % 128;
                    int i49 = i48 % 2;
                    z2 = true;
                } else {
                    int i50 = a;
                    i = (((i50 | 40) << 1) - (i50 ^ 40)) - 1;
                    b = i % 128;
                    if (i % 2 != 0) {
                        int i51 = 3 / 4;
                    }
                    z2 = false;
                }
            } else {
                int i52 = a;
                i = (((i52 | 40) << 1) - (i52 ^ 40)) - 1;
                b = i % 128;
                if (i % 2 != 0) {
                    int i53 = 3 / 4;
                }
                z2 = false;
            }
        } else {
            int i54 = a;
            i = (((i54 | 40) << 1) - (i54 ^ 40)) - 1;
            b = i % 128;
            if (i % 2 != 0) {
                int i55 = 3 / 4;
            }
            z2 = false;
        }
        if (!(this.f instanceof P)) {
            int i56 = a;
            int i57 = ((i56 | 55) << 1) - (i56 ^ 55);
            b = i57 % 128;
            int i58 = i57 % 2;
            z3 = false;
        } else {
            int i59 = b;
            int i60 = i59 & 29;
            int i61 = -(-(i59 | 29));
            int i62 = (i60 ^ i61) + ((i60 & i61) << 1);
            a = i62 % 128;
            int i63 = i62 % 2;
            if (this.e instanceof P) {
                int i64 = ((((i59 ^ 13) | (i59 & 13)) << 1) - (~(-(((~i59) & 13) | (i59 & (-14)))))) - 1;
                int i65 = i64 % 128;
                a = i65;
                if (i64 % 2 == 0) {
                    boolean z5 = this.g instanceof P;
                    throw null;
                }
                if ((this.g instanceof P) && (this.h instanceof P)) {
                    int i66 = ((i65 ^ 110) + ((i65 & 110) << 1)) - 1;
                    int i67 = i66 % 128;
                    b = i67;
                    int i68 = i66 % 2;
                    int i69 = i67 + 123;
                    a = i69 % 128;
                    int i70 = i69 % 2;
                    z3 = true;
                } else {
                    int i510 = a;
                    int i511 = ((i510 | 55) << 1) - (i510 ^ 55);
                    b = i511 % 128;
                    int i512 = i511 % 2;
                    z3 = false;
                }
            } else {
                int i513 = a;
                int i514 = ((i513 | 55) << 1) - (i513 ^ 55);
                b = i514 % 128;
                int i515 = i514 % 2;
                z3 = false;
            }
        }
        if (z) {
            int i71 = a;
            int i72 = (i71 ^ 62) + ((i71 & 62) << 1);
            int i73 = (i72 ^ (-1)) + (i72 << 1);
            b = i73 % 128;
            if (i73 % 2 != 0) {
                throw null;
            }
            if (z2 && z3) {
                z4 = true;
            } else {
                int i74 = b;
                int i75 = i74 & 99;
                int i76 = -(-((i74 ^ 99) | i75));
                int i77 = ((i75 | i76) << 1) - (i76 ^ i75);
                a = i77 % 128;
                int i78 = i77 % 2;
            }
        } else {
            int i79 = b;
            int i710 = i79 & 99;
            int i711 = -(-((i79 ^ 99) | i710));
            int i712 = ((i710 | i711) << 1) - (i711 ^ i710);
            a = i712 % 128;
            int i713 = i712 % 2;
        }
        int i80 = b;
        int i81 = i80 & 105;
        int i82 = (i81 - (~(-(-((i80 ^ 105) | i81))))) - 1;
        a = i82 % 128;
        int i83 = i82 % 2;
        return z4;
    }

    public t h(float f) {
        int i = 2 % 2;
        bfu bfuVar = new bfu(this);
        bfuVar.i(f);
        int i2 = a + 41;
        b = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            bfuVar.h(f);
            bfuVar.g(f);
            obj.hashCode();
            throw null;
        }
        bfuVar.h(f);
        bfuVar.g(f);
        int i3 = a + 103;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            bfuVar.f(f);
            bfuVar.e();
            obj.hashCode();
            throw null;
        }
        bfuVar.f(f);
        t tVarE = bfuVar.e();
        int i4 = a;
        int i5 = i4 & 111;
        int i6 = (i4 ^ 111) | i5;
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        b = i7 % 128;
        int i8 = i7 % 2;
        return tVarE;
    }

    public static bfu f(Context context, AttributeSet attributeSet, int i, int i2, h hVar) {
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = ((i4 ^ 123) - (~((i4 & 123) << 1))) - 1;
        a = i5 % 128;
        int i6 = i5 % 2;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.C, i, i2);
        int i7 = b;
        int i8 = i7 & 117;
        int i9 = (i8 - (~(-(-((i7 ^ 117) | i8))))) - 1;
        a = i9 % 128;
        int i10 = i9 % 2;
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        int i11 = b;
        int i12 = (((i11 | 30) << 1) - (i11 ^ 30)) - 1;
        a = i12 % 128;
        int i13 = i12 % 2;
        bfu bfuVarD = d(context, resourceId, resourceId2, hVar);
        if (i13 == 0) {
            int i14 = 64 / 0;
        }
        return bfuVarD;
    }

    public static bfu d(Context context, int i, int i2, h hVar) {
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = a;
        int i7 = (((i6 ^ 83) | (i6 & 83)) << 1) - (((~i6) & 83) | (i6 & (-84)));
        b = i7 % 128;
        Object obj = null;
        if (i7 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (i2 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
            int i8 = a;
            int i9 = i8 ^ 101;
            int i10 = -(-((i8 & 101) << 1));
            int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
            b = i11 % 128;
            int i12 = i11 % 2;
            i = i2;
            context = contextThemeWrapper;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, r.M);
        try {
            int i13 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i14 = typedArrayObtainStyledAttributes.getInt(3, i13);
            int i15 = b;
            int i16 = i15 & 29;
            int i17 = (i15 | 29) & (~i16);
            int i18 = i16 << 1;
            int i19 = (i17 & i18) + (i17 | i18);
            a = i19 % 128;
            if (i19 % 2 == 0) {
                i3 = typedArrayObtainStyledAttributes.getInt(4, i13);
                i4 = typedArrayObtainStyledAttributes.getInt(5, i13);
            } else {
                i3 = typedArrayObtainStyledAttributes.getInt(4, i13);
                i4 = typedArrayObtainStyledAttributes.getInt(2, i13);
            }
            int i20 = typedArrayObtainStyledAttributes.getInt(1, i13);
            h hVarG = g(typedArrayObtainStyledAttributes, 5, hVar);
            h hVarG2 = g(typedArrayObtainStyledAttributes, 8, hVarG);
            h hVarG3 = g(typedArrayObtainStyledAttributes, 9, hVarG);
            h hVarG4 = g(typedArrayObtainStyledAttributes, 7, hVarG);
            h hVarG5 = g(typedArrayObtainStyledAttributes, 6, hVarG);
            bfu bfuVar = new bfu();
            int i21 = b;
            int i22 = ((i21 ^ 97) | (i21 & 97)) << 1;
            int i23 = -(((~i21) & 97) | (i21 & (-98)));
            int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
            a = i24 % 128;
            int i25 = i24 % 2;
            r rVarP = r.p(i14);
            bfuVar.d = rVarP;
            bfu.d(rVarP);
            bfuVar.i = hVarG2;
            r rVarP2 = r.p(i3);
            int i26 = b;
            int i27 = (i26 & 119) + (i26 | 119);
            a = i27 % 128;
            int i28 = i27 % 2;
            bfuVar.e = rVarP2;
            bfu.d(rVarP2);
            bfuVar.h = hVarG3;
            r rVarP3 = r.p(i4);
            int i29 = a;
            int i30 = ((((i29 ^ 63) | (i29 & 63)) << 1) - (~(-(((~i29) & 63) | (i29 & (-64)))))) - 1;
            b = i30 % 128;
            int i31 = i30 % 2;
            bfuVar.f = rVarP3;
            bfu.d(rVarP3);
            bfuVar.j = hVarG4;
            r rVarP4 = r.p(i20);
            bfuVar.g = rVarP4;
            int i32 = b;
            int i33 = (-2) - (((i32 ^ 90) + ((i32 & 90) << 1)) ^ (-1));
            a = i33 % 128;
            if (i33 % 2 == 0) {
                bfu.d(rVarP4);
                bfuVar.k = hVarG5;
                typedArrayObtainStyledAttributes.recycle();
                throw null;
            }
            bfu.d(rVarP4);
            bfuVar.k = hVarG5;
            typedArrayObtainStyledAttributes.recycle();
            int i34 = b;
            int i35 = i34 ^ 121;
            int i36 = ((i34 & 121) | i35) << 1;
            int i37 = -i35;
            int i38 = (i36 & i37) + (i36 | i37);
            a = i38 % 128;
            int i39 = i38 % 2;
            return bfuVar;
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static final class bfu {
        private static int a = 1;
        private static int b;
        public i c;
        public r d;
        public r e;
        public r f;
        public r g;
        public h h;
        public h i;
        public h j;
        public h k;
        public i l;
        public i m;
        public i n;

        public bfu() {
            this.d = new P();
            this.e = new P();
            this.f = new P();
            this.g = new P();
            this.i = new j(0.0f);
            this.h = new j(0.0f);
            this.j = new j(0.0f);
            this.k = new j(0.0f);
            this.c = new i();
            this.l = new i();
            this.m = new i();
            this.n = new i();
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0045, code lost:
        
            return -1.0f;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0046, code lost:
        
            r5 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0049, code lost:
        
            if ((r8 instanceof ivas.gov.bisp.enumeration.O.e) == true) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
        
            r2 = ((((r1 ^ 31) | (r1 & 31)) << 1) - (~(-(((~r1) & 31) | (r1 & (-32)))))) - 1;
            ivas.gov.bisp.enumeration.O.t.bfu.b = r2 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0062, code lost:
        
            if ((r2 % 2) != 0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0064, code lost:
        
            java.util.Objects.requireNonNull((ivas.gov.bisp.enumeration.O.e) r8);
            r8 = ivas.gov.bisp.enumeration.O.t.bfu.b;
            r1 = r8 & 55;
            r8 = -(-(r8 | 55));
            r2 = (r1 & r8) + (r8 | r1);
            ivas.gov.bisp.enumeration.O.t.bfu.a = r2 % 128;
            r2 = r2 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x007a, code lost:
        
            r8 = ivas.gov.bisp.enumeration.O.t.bfu.b;
            r1 = r8 & 105;
            r8 = (r8 | 105) & (~r1);
            r1 = -(-(r1 << 1));
            r2 = ((r8 | r1) << 1) - (r8 ^ r1);
            ivas.gov.bisp.enumeration.O.t.bfu.a = r2 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x008f, code lost:
        
            if ((r2 % 2) == 0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0091, code lost:
        
            return -1.0f;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0092, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0093, code lost:
        
            java.util.Objects.requireNonNull((ivas.gov.bisp.enumeration.O.e) r8);
            r5.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x009b, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
        
            if ((r8 instanceof ivas.gov.bisp.enumeration.O.P) != true) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
        
            if ((r8 instanceof ivas.gov.bisp.enumeration.O.P) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
        
            r2 = (r1 ^ 101) + ((r1 & 101) << 1);
            ivas.gov.bisp.enumeration.O.t.bfu.b = r2 % 128;
            r2 = r2 % 2;
            java.util.Objects.requireNonNull((ivas.gov.bisp.enumeration.O.P) r8);
            r8 = ivas.gov.bisp.enumeration.O.t.bfu.b;
            r1 = r8 & 77;
            r8 = r8 | 77;
            r2 = ((r1 | r8) << 1) - (r8 ^ r1);
            ivas.gov.bisp.enumeration.O.t.bfu.a = r2 % 128;
            r2 = r2 % 2;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static float d(ivas.gov.bisp.enumeration.O.r r8) {
            /*
                r0 = 2
                int r1 = r0 % r0
                int r1 = ivas.gov.bisp.enumeration.O.t.bfu.a
                r2 = r1 | 107(0x6b, float:1.5E-43)
                r3 = 1
                int r2 = r2 << r3
                r4 = r1 ^ 107(0x6b, float:1.5E-43)
                int r4 = -r4
                int r4 = ~r4
                int r2 = r2 - r4
                int r2 = r2 - r3
                int r4 = r2 % 128
                ivas.gov.bisp.enumeration.O.t.bfu.b = r4
                int r2 = r2 % r0
                r4 = -1082130432(0xffffffffbf800000, float:-1.0)
                if (r2 == 0) goto L21
                boolean r2 = r8 instanceof ivas.gov.bisp.enumeration.O.P
                r5 = 92
                int r5 = r5 / 0
                if (r2 == r3) goto L25
                goto L46
            L21:
                boolean r2 = r8 instanceof ivas.gov.bisp.enumeration.O.P
                if (r2 == 0) goto L46
            L25:
                r2 = r1 ^ 101(0x65, float:1.42E-43)
                r1 = r1 & 101(0x65, float:1.42E-43)
                int r1 = r1 << r3
                int r2 = r2 + r1
                int r1 = r2 % 128
                ivas.gov.bisp.enumeration.O.t.bfu.b = r1
                int r2 = r2 % r0
                ivas.gov.bisp.enumeration.O.P r8 = (ivas.gov.bisp.enumeration.O.P) r8
                java.util.Objects.requireNonNull(r8)
                int r8 = ivas.gov.bisp.enumeration.O.t.bfu.b
                r1 = r8 & 77
                r8 = r8 | 77
                r2 = r1 | r8
                int r2 = r2 << r3
                r8 = r8 ^ r1
                int r2 = r2 - r8
                int r8 = r2 % 128
                ivas.gov.bisp.enumeration.O.t.bfu.a = r8
                int r2 = r2 % r0
                return r4
            L46:
                boolean r2 = r8 instanceof ivas.gov.bisp.enumeration.O.e
                r5 = 0
                if (r2 == r3) goto L4c
                goto L7a
            L4c:
                r2 = r1 ^ 31
                r6 = r1 & 31
                r2 = r2 | r6
                int r2 = r2 << r3
                r6 = r1 & (-32)
                int r1 = ~r1
                r7 = 31
                r1 = r1 & r7
                r1 = r1 | r6
                int r1 = -r1
                int r1 = ~r1
                int r2 = r2 - r1
                int r2 = r2 - r3
                int r1 = r2 % 128
                ivas.gov.bisp.enumeration.O.t.bfu.b = r1
                int r2 = r2 % r0
                if (r2 != 0) goto L93
                ivas.gov.bisp.enumeration.O.e r8 = (ivas.gov.bisp.enumeration.O.e) r8
                java.util.Objects.requireNonNull(r8)
                int r8 = ivas.gov.bisp.enumeration.O.t.bfu.b
                r1 = r8 & 55
                r8 = r8 | 55
                int r8 = -r8
                int r8 = -r8
                r2 = r1 & r8
                r8 = r8 | r1
                int r2 = r2 + r8
                int r8 = r2 % 128
                ivas.gov.bisp.enumeration.O.t.bfu.a = r8
                int r2 = r2 % r0
            L7a:
                int r8 = ivas.gov.bisp.enumeration.O.t.bfu.b
                r1 = r8 & 105(0x69, float:1.47E-43)
                int r2 = ~r1
                r8 = r8 | 105(0x69, float:1.47E-43)
                r8 = r8 & r2
                int r1 = r1 << r3
                int r1 = -r1
                int r1 = -r1
                r2 = r8 | r1
                int r2 = r2 << r3
                r8 = r8 ^ r1
                int r2 = r2 - r8
                int r8 = r2 % 128
                ivas.gov.bisp.enumeration.O.t.bfu.a = r8
                int r2 = r2 % r0
                if (r2 == 0) goto L92
                return r4
            L92:
                throw r5
            L93:
                ivas.gov.bisp.enumeration.O.e r8 = (ivas.gov.bisp.enumeration.O.e) r8
                java.util.Objects.requireNonNull(r8)
                r5.hashCode()
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.O.t.bfu.d(ivas.gov.bisp.enumeration.O.r):float");
        }

        public final t e() {
            int i = 2 % 2;
            Object obj = null;
            t tVar = new t(this, null);
            int i2 = a;
            int i3 = i2 & 41;
            int i4 = ((i2 ^ 41) | i3) << 1;
            int i5 = -((i2 | 41) & (~i3));
            int i6 = (i4 & i5) + (i5 | i4);
            b = i6 % 128;
            if (i6 % 2 == 0) {
                return tVar;
            }
            obj.hashCode();
            throw null;
        }

        public final bfu f(float f) {
            int i = 2 % 2;
            this.k = new j(f);
            int i2 = b;
            int i3 = (((i2 ^ 11) | (i2 & 11)) << 1) - (((~i2) & 11) | (i2 & (-12)));
            a = i3 % 128;
            if (i3 % 2 != 0) {
                return this;
            }
            throw null;
        }

        public final bfu g(float f) {
            int i = 2 % 2;
            this.j = new j(f);
            int i2 = b;
            int i3 = i2 ^ 59;
            int i4 = (i2 & 59) << 1;
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            int i6 = i5 % 128;
            a = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 115;
            b = i8 % 128;
            int i9 = i8 % 2;
            return this;
        }

        public final bfu h(float f) {
            int i = 2 % 2;
            this.h = new j(f);
            int i2 = a;
            int i3 = i2 & 43;
            int i4 = -(-((i2 ^ 43) | i3));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            b = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 71 / 0;
            }
            return this;
        }

        public final bfu i(float f) {
            int i = 2 % 2;
            this.i = new j(f);
            int i2 = a;
            int i3 = (i2 ^ 33) + ((i2 & 33) << 1);
            int i4 = i3 % 128;
            b = i4;
            Object obj = null;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = (((i4 & (-64)) | ((~i4) & 63)) - (~(-(-((i4 & 63) << 1))))) - 1;
            a = i5 % 128;
            if (i5 % 2 != 0) {
                return this;
            }
            throw null;
        }

        public bfu(t tVar) {
            this.d = new P();
            this.e = new P();
            this.f = new P();
            this.g = new P();
            this.i = new j(0.0f);
            this.h = new j(0.0f);
            this.j = new j(0.0f);
            this.k = new j(0.0f);
            this.c = new i();
            this.l = new i();
            this.m = new i();
            this.n = new i();
            this.d = tVar.e;
            this.e = tVar.f;
            this.f = tVar.g;
            this.g = tVar.h;
            this.i = tVar.j;
            this.h = tVar.i;
            this.j = tVar.k;
            this.k = tVar.l;
            this.c = tVar.d;
            this.l = tVar.m;
            this.m = tVar.n;
            this.n = tVar.f49o;
        }
    }

    public t() {
        this.e = new P();
        this.f = new P();
        this.g = new P();
        this.h = new P();
        this.j = new j(0.0f);
        this.i = new j(0.0f);
        this.k = new j(0.0f);
        this.l = new j(0.0f);
        this.d = new i();
        this.m = new i();
        this.n = new i();
        this.f49o = new i();
    }
}
