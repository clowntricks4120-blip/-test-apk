package ivas.gov.bisp.enumeration.dc;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ivas.gov.bisp.enumeration.O.C0019p;
import ivas.gov.bisp.enumeration.P.a;
import ivas.gov.bisp.enumeration.P.t;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.aL.h;
import ivas.gov.bisp.enumeration.aL.r;
import ivas.gov.bisp.enumeration.p081d.T;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.WeakHashMap;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class j extends Drawable implements t.aNV {
    private static int a = 1;
    private static int b;
    public final bIE c;
    public final WeakReference<Context> d;
    public final C0019p e;
    public final t f;
    public float g;
    public final Rect h;
    public float i;
    public float j;
    public float k;
    public float l;
    public int m;
    public float n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f94o;
    public float p;
    public WeakReference<View> q;
    public WeakReference<FrameLayout> r;

    public j(Context context) {
        r rVar;
        WeakReference<Context> weakReference = new WeakReference<>(context);
        this.d = weakReference;
        a.d(context, a.d, "Theme.MaterialComponents");
        Resources resources = context.getResources();
        this.h = new Rect();
        this.e = new C0019p();
        this.g = resources.getDimensionPixelSize(R.dimen.mtrl_badge_radius);
        this.j = resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding);
        this.i = resources.getDimensionPixelSize(R.dimen.mtrl_badge_with_text_radius);
        t tVar = new t(this);
        this.f = tVar;
        tVar.c.setTextAlign(Paint.Align.CENTER);
        this.c = new bIE(context);
        Context context2 = weakReference.get();
        if (context2 != null && tVar.g != (rVar = new r(context2, R.style.TextAppearance_MaterialComponents_Badge))) {
            int i = b;
            int i2 = i & 37;
            int i3 = (i ^ 37) | i2;
            int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
            a = i4 % 128;
            if (i4 % 2 == 0) {
                weakReference.get();
                throw null;
            }
            Context context3 = weakReference.get();
            if (context3 != null) {
                tVar.d(rVar, context3);
                i();
                int i5 = a;
                int i6 = ((i5 ^ 23) | (i5 & 23)) << 1;
                int i7 = -(((~i5) & 23) | (i5 & (-24)));
                int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
                b = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 2 % 2;
                }
            }
        }
        int i10 = a;
        int i11 = i10 ^ 25;
        int i12 = ((((i10 & 25) | i11) << 1) - (~(-i11))) - 1;
        b = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 30 / 0;
        }
    }

    @Override // ivas.gov.bisp.enumeration.P.t.aNV
    public void b() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 83;
        int i4 = (i2 | 83) & (~i3);
        int i5 = i3 << 1;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        Object obj = null;
        invalidateSelf();
        if (i7 == 0) {
            obj.hashCode();
            throw null;
        }
        int i8 = b + 43;
        a = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
    }

    public final String d() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 103;
        int i4 = -(-((i2 ^ 103) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        Object obj = null;
        if (f() <= this.m) {
            int i7 = b + 45;
            a = i7 % 128;
            if (i7 % 2 == 0) {
                NumberFormat.getInstance().format(f());
                throw null;
            }
            String str = NumberFormat.getInstance().format(f());
            int i8 = a;
            int i9 = (i8 | 113) << 1;
            int i10 = -(((~i8) & 113) | (i8 & (-114)));
            int i11 = (i9 & i10) + (i9 | i10);
            b = i11 % 128;
            if (i11 % 2 == 0) {
                return str;
            }
            obj.hashCode();
            throw null;
        }
        Context context = this.d.get();
        if (context == null) {
            int i12 = a;
            int i13 = i12 ^ 51;
            int i14 = ((((i12 & 51) | i13) << 1) - (~(-i13))) - 1;
            int i15 = i14 % 128;
            b = i15;
            if (i14 % 2 != 0) {
                throw null;
            }
            int i16 = i15 & 41;
            int i17 = i16 + ((i15 ^ 41) | i16);
            a = i17 % 128;
            if (i17 % 2 == 0) {
                int i18 = 31 / 0;
            }
            return BuildConfig.FLAVOR;
        }
        Integer numValueOf = Integer.valueOf(this.m);
        int i19 = a;
        int i20 = i19 ^ 35;
        int i21 = -(-((i19 & 35) << 1));
        int i22 = (i20 & i21) + (i21 | i20);
        b = i22 % 128;
        int i23 = i22 % 2;
        String string = context.getString(R.string.mtrl_exceed_max_badge_number_suffix, numValueOf, "+");
        int i24 = a + 61;
        b = i24 % 128;
        if (i24 % 2 == 0) {
            return string;
        }
        throw null;
    }

    public FrameLayout e() {
        FrameLayout frameLayout;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 | 25) << 1;
        int i4 = -((i2 & (-26)) | ((~i2) & 25));
        int i5 = (i3 & i4) + (i3 | i4);
        b = i5 % 128;
        int i6 = i5 % 2;
        WeakReference<FrameLayout> weakReference = this.r;
        if (weakReference != null) {
            int i7 = (i2 & 31) + (i2 | 31);
            b = i7 % 128;
            int i8 = i7 % 2;
            frameLayout = weakReference.get();
            int i9 = b;
            int i10 = i9 & 71;
            int i11 = (i9 | 71) & (~i10);
            int i12 = -(-(i10 << 1));
            int i13 = ((i11 | i12) << 1) - (i11 ^ i12);
            a = i13 % 128;
            int i14 = i13 % 2;
        } else {
            int i15 = i2 + 45;
            b = i15 % 128;
            if (i15 % 2 != 0) {
                int i16 = 5 % 4;
            }
            frameLayout = null;
        }
        int i17 = a + 61;
        b = i17 % 128;
        if (i17 % 2 != 0) {
            int i18 = 66 / 0;
        }
        return frameLayout;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0050, code lost:
    
        r1 = r5.c.i;
        r2 = ivas.gov.bisp.enumeration.dc.j.b;
        r3 = ((r2 ^ 65) | (r2 & 65)) << 1;
        r2 = -(((~r2) & 65) | (r2 & (-66)));
        r4 = (r3 ^ r2) + ((r2 & r3) << 1);
        ivas.gov.bisp.enumeration.dc.j.a = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x006f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0023, code lost:
    
        if (r2 == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0026, code lost:
    
        if (r2 == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        r2 = ivas.gov.bisp.enumeration.dc.j.b;
        r3 = r2 & 25;
        r2 = -(-((r2 ^ 25) | r3));
        r4 = (r3 ^ r2) + ((r2 & r3) << 1);
        r2 = r4 % 128;
        ivas.gov.bisp.enumeration.dc.j.a = r2;
        r4 = r4 % 2;
        r3 = r2 ^ 83;
        r2 = ((r2 & 83) | r3) << 1;
        r3 = -r3;
        r4 = (r2 ^ r3) + ((r2 & r3) << 1);
        ivas.gov.bisp.enumeration.dc.j.b = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004f, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int f() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.dc.j.a
            r2 = r1 & 103(0x67, float:1.44E-43)
            int r3 = ~r2
            r1 = r1 | 103(0x67, float:1.44E-43)
            r1 = r1 & r3
            int r2 = r2 << 1
            int r2 = -r2
            int r2 = -r2
            r3 = r1 | r2
            int r3 = r3 << 1
            r1 = r1 ^ r2
            int r3 = r3 - r1
            int r1 = r3 % 128
            ivas.gov.bisp.enumeration.dc.j.b = r1
            int r3 = r3 % r0
            r1 = 0
            boolean r2 = r5.h()
            if (r3 == 0) goto L26
            r3 = 1
            int r3 = r3 / r1
            if (r2 != 0) goto L50
            goto L28
        L26:
            if (r2 != 0) goto L50
        L28:
            int r2 = ivas.gov.bisp.enumeration.dc.j.b
            r3 = r2 & 25
            r2 = r2 ^ 25
            r2 = r2 | r3
            int r2 = -r2
            int r2 = -r2
            r4 = r3 ^ r2
            r2 = r2 & r3
            int r2 = r2 << 1
            int r4 = r4 + r2
            int r2 = r4 % 128
            ivas.gov.bisp.enumeration.dc.j.a = r2
            int r4 = r4 % r0
            r3 = r2 ^ 83
            r2 = r2 & 83
            r2 = r2 | r3
            int r2 = r2 << 1
            int r3 = -r3
            r4 = r2 ^ r3
            r2 = r2 & r3
            int r2 = r2 << 1
            int r4 = r4 + r2
            int r2 = r4 % 128
            ivas.gov.bisp.enumeration.dc.j.b = r2
            int r4 = r4 % r0
            return r1
        L50:
            ivas.gov.bisp.enumeration.dc.j$bIE r1 = r5.c
            int r1 = r1.i
            int r2 = ivas.gov.bisp.enumeration.dc.j.b
            r3 = r2 ^ 65
            r4 = r2 & 65
            r3 = r3 | r4
            int r3 = r3 << 1
            r4 = r2 & (-66)
            int r2 = ~r2
            r2 = r2 & 65
            r2 = r2 | r4
            int r2 = -r2
            r4 = r3 ^ r2
            r2 = r2 & r3
            int r2 = r2 << 1
            int r4 = r4 + r2
            int r2 = r4 % 128
            ivas.gov.bisp.enumeration.dc.j.a = r2
            int r4 = r4 % r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.dc.j.f():int");
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        int i = 2 % 2;
        int i2 = b + 25;
        a = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.c.g;
        int i5 = a;
        int i6 = ((i5 ^ 11) | (i5 & 11)) << 1;
        int i7 = -(((~i5) & 11) | (i5 & (-12)));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        b = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 27 / 0;
        }
        return i4;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & (-74)) | ((~i2) & 73)) + ((i2 & 73) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        Rect rect = this.h;
        if (i4 == 0) {
            return rect.height();
        }
        rect.height();
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 37) + ((i2 & 37) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        int iWidth = this.h.width();
        int i5 = b;
        int i6 = i5 ^ 89;
        int i7 = ((((i5 & 89) | i6) << 1) - (~(-i6))) - 1;
        a = i7 % 128;
        int i8 = i7 % 2;
        return iWidth;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((((i2 ^ 101) | (i2 & 101)) << 1) - (~(-((i2 & (-102)) | ((~i2) & 101))))) - 1;
        a = i3 % 128;
        int i4 = i3 % 2 == 0 ? 122 : -3;
        int i5 = i2 & 93;
        int i6 = (i2 ^ 93) | i5;
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        a = i7 % 128;
        int i8 = i7 % 2;
        return i4;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 63) << 1) - (i2 ^ 63);
        a = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 | 21;
        int i6 = i5 << 1;
        int i7 = -((~(i2 & 21)) & i5);
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        a = i8 % 128;
        if (i8 % 2 != 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.graphics.drawable.Drawable, ivas.gov.bisp.enumeration.P.t.aNV
    public boolean onStateChange(int[] iArr) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 19;
        int i4 = i2 | 19;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        if (i5 % 2 != 0) {
            return super.onStateChange(iArr);
        }
        super.onStateChange(iArr);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 87;
        int i4 = ((i2 ^ 87) | i3) << 1;
        int i5 = -((i2 | 87) & (~i3));
        int i6 = (i4 & i5) + (i5 | i4);
        a = i6 % 128;
        int i7 = i6 % 2;
    }

    public boolean h() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & 16) + (i2 | 16)) - 1;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = this.c.i;
            throw null;
        }
        boolean z = false;
        if (this.c.i != -1) {
            int i5 = (-2) - ((b + 34) ^ (-1));
            int i6 = i5 % 128;
            a = i6;
            z = i5 % 2 != 0;
            int i7 = i6 & 47;
            int i8 = (((i6 ^ 47) | i7) << 1) - ((i6 | 47) & (~i7));
            b = i8 % 128;
            int i9 = i8 % 2;
        } else {
            int i10 = b;
            int i11 = i10 & 99;
            int i12 = -(-((i10 ^ 99) | i11));
            int i13 = (i11 & i12) + (i12 | i11);
            a = i13 % 128;
            int i14 = i13 % 2;
        }
        int i15 = b;
        int i16 = (i15 ^ 34) + ((i15 & 34) << 1);
        int i17 = (i16 ^ (-1)) + (i16 << 1);
        a = i17 % 128;
        int i18 = i17 % 2;
        return z;
    }

    public void g(View view, FrameLayout frameLayout) {
        int i = 2 % 2;
        this.q = new WeakReference<>(view);
        this.r = new WeakReference<>(frameLayout);
        int i2 = a;
        int i3 = i2 & 45;
        int i4 = ((i2 ^ 45) | i3) << 1;
        int i5 = -((i2 | 45) & (~i3));
        int i6 = (i4 & i5) + (i5 | i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        int i8 = b;
        int i9 = i8 & 61;
        int i10 = ((((i8 ^ 61) | i9) << 1) - (~(-((i8 | 61) & (~i9))))) - 1;
        a = i10 % 128;
        if (i10 % 2 == 0) {
            viewGroup.setClipToPadding(false);
        } else {
            viewGroup.setClipToPadding(false);
        }
        i();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 | 47) << 1;
        int i5 = -(((~i3) & 47) | (i3 & (-48)));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        this.c.g = i;
        TextPaint textPaint = this.f.c;
        int i8 = b;
        int i9 = ((i8 | 11) << 1) - (i8 ^ 11);
        a = i9 % 128;
        if (i9 % 2 == 0) {
            textPaint.setAlpha(i);
            invalidateSelf();
            int i10 = 69 / 0;
        } else {
            textPaint.setAlpha(i);
            invalidateSelf();
        }
        int i11 = b;
        int i12 = (i11 & 71) + (i11 | 71);
        a = i12 % 128;
        int i13 = i12 % 2;
    }

    public static final class bIE implements Parcelable {
        public static final Parcelable.Creator<bIE> CREATOR = new bIF();
        private static int b = 0;
        private static int c = 1;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
        public CharSequence j;
        public int k;
        public int l;
        public boolean m;
        public int n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f95o;
        public int p;
        public int q;
        public int r;
        public int s;

        public static final class bIF implements Parcelable.Creator<bIE> {
            private static int a = 1;
            private static int b;

            @Override // android.os.Parcelable.Creator
            public final bIE createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                bIE bie = new bIE(parcel);
                int i2 = b;
                int i3 = i2 & 121;
                int i4 = (i2 | 121) & (~i3);
                int i5 = i3 << 1;
                int i6 = (i4 & i5) + (i4 | i5);
                a = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 47 / 0;
                }
                return bie;
            }

            @Override // android.os.Parcelable.Creator
            public final bIE[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = b;
                int i4 = i3 & 119;
                int i5 = i3 | 119;
                int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
                int i7 = i6 % 128;
                a = i7;
                int i8 = i6 % 2;
                bIE[] bieArr = new bIE[i];
                int i9 = (i7 ^ 27) + ((i7 & 27) << 1);
                b = i9 % 128;
                if (i9 % 2 == 0) {
                    return bieArr;
                }
                throw null;
            }
        }

        static {
            int i = c;
            int i2 = (i ^ 51) + ((i & 51) << 1);
            b = i2 % 128;
            int i3 = i2 % 2;
        }

        public bIE(Context context) {
            TypedArray typedArrayObtainStyledAttributes;
            this.g = 255;
            this.i = -1;
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(R.style.TextAppearance_MaterialComponents_Badge, ivas.gov.bisp.enumeration.O.r.N);
            typedArrayObtainStyledAttributes2.getDimension(0, 0.0f);
            ColorStateList colorStateListB = h.b(context, typedArrayObtainStyledAttributes2, 3);
            h.b(context, typedArrayObtainStyledAttributes2, 4);
            h.b(context, typedArrayObtainStyledAttributes2, 5);
            typedArrayObtainStyledAttributes2.getInt(2, 0);
            typedArrayObtainStyledAttributes2.getInt(1, 1);
            int i = 12;
            if (!typedArrayObtainStyledAttributes2.hasValue(12)) {
                int i2 = c;
                int i3 = i2 & 103;
                int i4 = ((i2 ^ 103) | i3) << 1;
                int i5 = -((i2 | 103) & (~i3));
                int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
                b = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 5 / 3;
                } else {
                    int i8 = 2 % 2;
                }
                i = 10;
            }
            typedArrayObtainStyledAttributes2.getResourceId(i, 0);
            typedArrayObtainStyledAttributes2.getString(i);
            int i9 = b;
            int i10 = (i9 & (-94)) | ((~i9) & 93);
            int i11 = (i9 & 93) << 1;
            int i12 = (i10 & i11) + (i11 | i10);
            c = i12 % 128;
            int i13 = i12 % 2;
            typedArrayObtainStyledAttributes2.getBoolean(14, false);
            h.b(context, typedArrayObtainStyledAttributes2, 6);
            int i14 = c;
            int i15 = (-2) - ((-1) ^ ((i14 ^ 114) + ((i14 & 114) << 1)));
            b = i15 % 128;
            if (i15 % 2 != 0) {
                typedArrayObtainStyledAttributes2.getFloat(39, 2.0f);
                typedArrayObtainStyledAttributes2.getFloat(64, 2.0f);
            } else {
                typedArrayObtainStyledAttributes2.getFloat(7, 0.0f);
                typedArrayObtainStyledAttributes2.getFloat(8, 0.0f);
            }
            typedArrayObtainStyledAttributes2.getFloat(9, 0.0f);
            typedArrayObtainStyledAttributes2.recycle();
            int[] iArr = ivas.gov.bisp.enumeration.O.r.E;
            int i16 = c;
            int i17 = ((((i16 ^ 75) | (i16 & 75)) << 1) - (~(-(((~i16) & 75) | (i16 & (-76)))))) - 1;
            b = i17 % 128;
            if (i17 % 2 != 0) {
                typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.TextAppearance_MaterialComponents_Badge, iArr);
                typedArrayObtainStyledAttributes.hasValue(0);
                typedArrayObtainStyledAttributes.getFloat(1, 0.0f);
            } else {
                typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.TextAppearance_MaterialComponents_Badge, iArr);
                typedArrayObtainStyledAttributes.hasValue(0);
                typedArrayObtainStyledAttributes.getFloat(0, 0.0f);
            }
            typedArrayObtainStyledAttributes.recycle();
            this.f = colorStateListB.getDefaultColor();
            int i18 = b;
            int i19 = (i18 & (-50)) | ((~i18) & 49);
            int i20 = -(-((i18 & 49) << 1));
            int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
            c = i21 % 128;
            if (i21 % 2 == 0) {
                this.j = context.getString(R.string.mtrl_badge_numberless_content_description);
                this.k = R.plurals.mtrl_badge_content_description;
                this.d = R.string.mtrl_exceed_max_badge_number_content_description;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            this.j = context.getString(R.string.mtrl_badge_numberless_content_description);
            this.k = R.plurals.mtrl_badge_content_description;
            this.d = R.string.mtrl_exceed_max_badge_number_content_description;
            int i22 = c;
            int i23 = (i22 | 85) << 1;
            int i24 = -(((~i22) & 85) | (i22 & (-86)));
            int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
            int i26 = i25 % 128;
            b = i26;
            int i27 = i25 % 2;
            this.m = true;
            int i28 = i26 & 107;
            int i29 = (((i26 | 107) & (~i28)) - (~(i28 << 1))) - 1;
            c = i29 % 128;
            if (i29 % 2 == 0) {
                int i30 = 95 / 0;
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 | 78) << 1) - (i2 ^ 78);
            int i4 = (i3 ^ (-1)) + (i3 << 1);
            c = i4 % 128;
            return i4 % 2 == 0 ? 1 : 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int i2;
            int i3;
            int i4 = 2 % 2;
            int i5 = b + 51;
            c = i5 % 128;
            if (i5 % 2 == 0) {
                parcel.writeInt(this.e);
                parcel.writeInt(this.f);
                throw null;
            }
            parcel.writeInt(this.e);
            parcel.writeInt(this.f);
            int i6 = b + 53;
            c = i6 % 128;
            int i7 = i6 % 2;
            parcel.writeInt(this.g);
            parcel.writeInt(this.i);
            int i8 = c;
            int i9 = (i8 ^ 87) + ((i8 & 87) << 1);
            b = i9 % 128;
            int i10 = i9 % 2;
            parcel.writeInt(this.h);
            String string = this.j.toString();
            int i11 = b;
            int i12 = i11 & 33;
            int i13 = (((i11 | 33) & (~i12)) - (~(-(-(i12 << 1))))) - 1;
            c = i13 % 128;
            int i14 = i13 % 2;
            parcel.writeString(string);
            parcel.writeInt(this.k);
            int i15 = this.l;
            int i16 = b;
            int i17 = (i16 ^ 93) + ((i16 & 93) << 1);
            c = i17 % 128;
            if (i17 % 2 == 0) {
                parcel.writeInt(i15);
                parcel.writeInt(this.n);
                i2 = this.p;
                int i18 = 94 / 0;
            } else {
                parcel.writeInt(i15);
                parcel.writeInt(this.n);
                i2 = this.p;
            }
            int i19 = b;
            int i20 = i19 | 59;
            int i21 = i20 << 1;
            int i22 = -((~(i19 & 59)) & i20);
            int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
            c = i23 % 128;
            if (i23 % 2 == 0) {
                parcel.writeInt(i2);
                parcel.writeInt(this.f95o);
                i3 = this.q;
                int i24 = 82 / 0;
            } else {
                parcel.writeInt(i2);
                parcel.writeInt(this.f95o);
                i3 = this.q;
            }
            int i25 = b;
            int i26 = i25 & 111;
            int i27 = ((i25 ^ 111) | i26) << 1;
            int i28 = -((i25 | 111) & (~i26));
            int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
            c = i29 % 128;
            int i30 = i29 % 2;
            parcel.writeInt(i3);
            parcel.writeInt(this.r);
            int i31 = this.s;
            int i32 = b + 59;
            c = i32 % 128;
            int i33 = i32 % 2;
            parcel.writeInt(i31);
            parcel.writeInt(this.m ? 1 : 0);
            int i34 = b;
            int i35 = (i34 ^ 123) + ((i34 & 123) << 1);
            c = i35 % 128;
            if (i35 % 2 == 0) {
                throw null;
            }
        }

        public bIE(Parcel parcel) {
            boolean z;
            this.g = 255;
            this.i = -1;
            this.e = parcel.readInt();
            this.f = parcel.readInt();
            this.g = parcel.readInt();
            this.i = parcel.readInt();
            this.h = parcel.readInt();
            this.j = parcel.readString();
            this.k = parcel.readInt();
            this.l = parcel.readInt();
            this.n = parcel.readInt();
            this.p = parcel.readInt();
            this.f95o = parcel.readInt();
            this.q = parcel.readInt();
            this.r = parcel.readInt();
            this.s = parcel.readInt();
            if (parcel.readInt() != 0) {
                int i = b;
                int i2 = i & 47;
                int i3 = i | 47;
                int i4 = (i2 & i3) + (i3 | i2);
                c = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 2 % 2;
                }
                z = true;
            } else {
                int i6 = c;
                int i7 = i6 & 39;
                int i8 = (i6 ^ 39) | i7;
                int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
                b = i9 % 128;
                int i10 = i9 % 2;
                int i11 = 2 % 2;
                z = false;
            }
            this.m = z;
            int i12 = c;
            int i13 = i12 ^ 25;
            int i14 = ((i12 & 25) | i13) << 1;
            int i15 = -i13;
            int i16 = ((i14 | i15) << 1) - (i14 ^ i15);
            b = i16 % 128;
            if (i16 % 2 != 0) {
                int i17 = 75 / 0;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        TextPaint textPaint;
        int i = 2 % 2;
        int i2 = (-2) - ((b + 80) ^ (-1));
        a = i2 % 128;
        int i3 = i2 % 2;
        if (!getBounds().isEmpty()) {
            int i4 = b;
            int i5 = i4 | 125;
            int i6 = i5 << 1;
            int i7 = -((~(i4 & 125)) & i5);
            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
            a = i8 % 128;
            int i9 = i8 % 2;
            if (this.c.g != 0) {
                int i10 = b;
                int i11 = i10 ^ 23;
                int i12 = ((i10 & 23) | i11) << 1;
                int i13 = -i11;
                int i14 = (i12 & i13) + (i12 | i13);
                a = i14 % 128;
                Object obj = null;
                if (i14 % 2 == 0) {
                    isVisible();
                    obj.hashCode();
                    throw null;
                }
                if (isVisible()) {
                    int i15 = a + 15;
                    b = i15 % 128;
                    int i16 = i15 % 2;
                    this.e.draw(canvas);
                    if (h()) {
                        Rect rect = new Rect();
                        String strD = d();
                        int i17 = b + 75;
                        a = i17 % 128;
                        if (i17 % 2 == 0) {
                            TextPaint textPaint2 = this.f.c;
                            obj.hashCode();
                            throw null;
                        }
                        TextPaint textPaint3 = this.f.c;
                        int i18 = b;
                        int i19 = (i18 ^ 89) + ((i18 & 89) << 1);
                        a = i19 % 128;
                        if (i19 % 2 == 0) {
                            textPaint3.getTextBounds(strD, 1, strD.length(), rect);
                        } else {
                            textPaint3.getTextBounds(strD, 0, strD.length(), rect);
                        }
                        float f = this.k;
                        float f2 = this.l;
                        int i20 = b;
                        int i21 = i20 & 107;
                        int i22 = i21 + ((i20 ^ 107) | i21);
                        a = i22 % 128;
                        int i23 = i22 % 2;
                        float fHeight = rect.height() / 2;
                        t tVar = this.f;
                        int i24 = a;
                        int i25 = i24 & 27;
                        int i26 = i25 + ((i24 ^ 27) | i25);
                        b = i26 % 128;
                        if (i26 % 2 != 0) {
                            textPaint = tVar.c;
                            int i27 = 36 / 0;
                        } else {
                            textPaint = tVar.c;
                        }
                        int i28 = a + 81;
                        b = i28 % 128;
                        int i29 = i28 % 2;
                        canvas.drawText(strD, f, f2 + fHeight, textPaint);
                        int i30 = b + 80;
                        int i31 = (i30 ^ (-1)) + (i30 << 1);
                        a = i31 % 128;
                        int i32 = i31 % 2;
                    }
                }
            }
        }
        int i33 = b;
        int i34 = (i33 & 43) + (i33 | 43);
        a = i34 % 128;
        int i35 = i34 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:102:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:105:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:106:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:107:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:109:0x0409  */
    /* JADX WARN: Code duplicated, block: B:10:0x004b  */
    /* JADX WARN: Code duplicated, block: B:110:0x040c  */
    /* JADX WARN: Code duplicated, block: B:114:0x043e  */
    /* JADX WARN: Code duplicated, block: B:12:0x0060  */
    /* JADX WARN: Code duplicated, block: B:43:0x017b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0199  */
    /* JADX WARN: Code duplicated, block: B:97:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:99:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:9:0x0044 A[PHI: r6
  0x0044: PHI (r6v6 java.lang.ref.WeakReference<android.view.View>) = (r6v5 java.lang.ref.WeakReference<android.view.View>), (r6v22 java.lang.ref.WeakReference<android.view.View>) binds: [B:8:0x0042, B:5:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    public final void i() {
        WeakReference<View> weakReference;
        View view;
        FrameLayout frameLayout;
        int i;
        int i2;
        int i3;
        int i4;
        float f;
        int i5;
        float f2;
        int i6;
        int i7;
        float f3;
        int i8;
        float f4;
        float f5;
        int i9;
        int i10;
        float f6;
        float f7;
        float f8;
        float f9;
        int i11;
        int i12 = 2 % 2;
        int i13 = b;
        int i14 = i13 & 13;
        int i15 = (((i13 ^ 13) | i14) << 1) - ((i13 | 13) & (~i14));
        a = i15 % 128;
        int i16 = i15 % 2;
        Context context = this.d.get();
        int i17 = b;
        int i18 = (i17 ^ 62) + ((i17 & 62) << 1);
        int i19 = (i18 ^ (-1)) + (i18 << 1);
        a = i19 % 128;
        Object obj = null;
        if (i19 % 2 == 0) {
            weakReference = this.q;
            int i20 = 80 / 0;
            if (weakReference != null) {
                view = weakReference.get();
            } else {
                int i21 = i17 & 85;
                i11 = (((i17 | 85) & (~i21)) - (~(-(-(i21 << 1))))) - 1;
                a = i11 % 128;
                if (i11 % 2 == 0) {
                    int i22 = 3 % 5;
                }
                view = null;
            }
        } else {
            weakReference = this.q;
            if (weakReference != null) {
                view = weakReference.get();
            } else {
                int i23 = i17 & 85;
                i11 = (((i17 | 85) & (~i23)) - (~(-(-(i23 << 1))))) - 1;
                a = i11 % 128;
                if (i11 % 2 == 0) {
                    int i24 = 3 % 5;
                }
                view = null;
            }
        }
        if (context != null) {
            int i25 = a;
            int i26 = i25 | 89;
            int i27 = i26 << 1;
            int i28 = -((~(i25 & 89)) & i26);
            int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
            b = i29 % 128;
            int i30 = i29 % 2;
            if (view != null) {
                Rect rect = new Rect();
                rect.set(this.h);
                Rect rect2 = new Rect();
                int i31 = b;
                int i32 = ((i31 | 27) << 1) - (i31 ^ 27);
                a = i32 % 128;
                int i33 = i32 % 2;
                view.getDrawingRect(rect2);
                WeakReference<FrameLayout> weakReference2 = this.r;
                if (weakReference2 != null) {
                    int i34 = b;
                    int i35 = i34 & 29;
                    int i36 = i35 + ((i34 ^ 29) | i35);
                    a = i36 % 128;
                    int i37 = i36 % 2;
                    frameLayout = weakReference2.get();
                    int i38 = (-2) - ((a + 82) ^ (-1));
                    b = i38 % 128;
                    int i39 = i38 % 2;
                } else {
                    frameLayout = null;
                }
                if (frameLayout != null) {
                    int i40 = b;
                    int i41 = ((i40 & 74) + (i40 | 74)) - 1;
                    a = i41 % 128;
                    if (i41 % 2 == 0) {
                        throw null;
                    }
                    if (frameLayout == null) {
                        frameLayout = (ViewGroup) view.getParent();
                        int i42 = b;
                        int i43 = (i42 & 16) + (i42 | 16);
                        int i44 = (i43 ^ (-1)) + (i43 << 1);
                        a = i44 % 128;
                        int i45 = i44 % 2;
                    }
                    frameLayout.offsetDescendantRectToMyCoords(view, rect2);
                    int i46 = b;
                    int i47 = (-2) - (((i46 & 60) + (i46 | 60)) ^ (-1));
                    a = i47 % 128;
                    int i48 = i47 % 2;
                }
                if (h()) {
                    int i49 = b + 111;
                    a = i49 % 128;
                    int i50 = i49 % 2;
                    i = this.c.q;
                } else {
                    i = this.c.p;
                }
                bIE bie = this.c;
                int i51 = -(~(-(-bie.s)));
                int i52 = (((i | i51) << 1) - (i ^ i51)) - 1;
                int i53 = a + 75;
                b = i53 % 128;
                if (i53 % 2 != 0) {
                    int i54 = bie.l;
                    throw null;
                }
                int i55 = bie.l;
                if (i55 != 8388691) {
                    int i56 = a;
                    int i57 = i56 & 7;
                    int i58 = (i56 ^ 7) | i57;
                    int i59 = ((i57 | i58) << 1) - (i57 ^ i58);
                    b = i59 % 128;
                    int i60 = i59 % 2;
                    if (i55 != 8388693) {
                        int i61 = (i56 ^ 109) + ((i56 & 109) << 1);
                        b = i61 % 128;
                        if (i61 % 2 != 0) {
                            f9 = rect2.top % i52;
                        } else {
                            int i62 = rect2.top;
                            int i63 = -(~(-(-i52)));
                            f9 = (((i62 | i63) << 1) - (i62 ^ i63)) - 1;
                        }
                        this.l = f9;
                    } else {
                        int i64 = rect2.bottom;
                        int i65 = -i52;
                        int i66 = i64 ^ i65;
                        int i67 = (i64 & i65) << 1;
                        this.l = (i66 & i67) + (i67 | i66);
                        i2 = (-2) - ((b + 42) ^ (-1));
                        a = i2 % 128;
                        if (i2 % 2 == 0) {
                            int i68 = 4 / 3;
                        }
                    }
                } else {
                    int i69 = rect2.bottom;
                    int i610 = -i52;
                    int i611 = i69 ^ i610;
                    int i612 = (i69 & i610) << 1;
                    this.l = (i611 & i612) + (i612 | i611);
                    i2 = (-2) - ((b + 42) ^ (-1));
                    a = i2 % 128;
                    if (i2 % 2 == 0) {
                        int i613 = 4 / 3;
                    }
                }
                if (f() <= 9) {
                    int i70 = b;
                    int i71 = (i70 ^ 57) + ((i70 & 57) << 1);
                    a = i71 % 128;
                    int i72 = i71 % 2;
                    if (h()) {
                        f8 = this.i;
                    } else {
                        int i73 = a;
                        int i74 = i73 ^ 33;
                        int i75 = ((i73 & 33) | i74) << 1;
                        int i76 = -i74;
                        int i77 = (i75 ^ i76) + ((i75 & i76) << 1);
                        int i78 = i77 % 128;
                        b = i78;
                        int i79 = i77 % 2;
                        f8 = this.g;
                        int i80 = ((i78 & 88) + (i78 | 88)) - 1;
                        a = i80 % 128;
                        int i81 = i80 % 2;
                    }
                    this.f94o = f8;
                    this.p = f8;
                    int i82 = b;
                    int i83 = i82 & 111;
                    int i84 = (((i82 | 111) & (~i83)) - (~(-(-(i83 << 1))))) - 1;
                    int i85 = i84 % 128;
                    a = i85;
                    if (i84 % 2 == 0) {
                        this.n = f8;
                        int i86 = 57 / 0;
                    } else {
                        this.n = f8;
                    }
                    int i87 = (((i85 | 52) << 1) - (i85 ^ 52)) - 1;
                    b = i87 % 128;
                    int i88 = i87 % 2;
                } else {
                    float f10 = this.i;
                    this.f94o = f10;
                    this.p = f10;
                    int i89 = b;
                    int i90 = i89 ^ 85;
                    int i91 = ((i89 & 85) | i90) << 1;
                    int i92 = -i90;
                    int i93 = (i91 ^ i92) + ((i91 & i92) << 1);
                    a = i93 % 128;
                    int i94 = i93 % 2;
                    float fC = this.f.c(d());
                    int i95 = b;
                    int i96 = ((i95 | 53) << 1) - (i95 ^ 53);
                    int i97 = i96 % 128;
                    a = i97;
                    if (i96 % 2 == 0) {
                        this.n = (fC * 0.0f) - this.j;
                    } else {
                        this.n = (fC / 2.0f) + this.j;
                    }
                    int i98 = i97 & 35;
                    int i99 = (i97 | 35) & (~i98);
                    int i100 = i98 << 1;
                    int i101 = ((i99 | i100) << 1) - (i100 ^ i99);
                    b = i101 % 128;
                    int i102 = i101 % 2;
                }
                Resources resources = context.getResources();
                if (h()) {
                    int i103 = b;
                    int i104 = i103 ^ 119;
                    int i105 = ((i103 & 119) | i104) << 1;
                    int i106 = -i104;
                    int i107 = (i105 & i106) + (i105 | i106);
                    a = i107 % 128;
                    int i108 = i107 % 2;
                    i3 = R.dimen.mtrl_badge_text_horizontal_edge_offset;
                } else {
                    int i109 = a;
                    int i110 = i109 & 25;
                    int i111 = (((i109 | 25) & (~i110)) - (~(i110 << 1))) - 1;
                    b = i111 % 128;
                    int i112 = i111 % 2;
                    i3 = R.dimen.mtrl_badge_horizontal_edge_offset;
                }
                int dimensionPixelSize = resources.getDimensionPixelSize(i3);
                if (h()) {
                    int i113 = a;
                    int i114 = ((i113 | 12) << 1) - (i113 ^ 12);
                    int i115 = (i114 ^ (-1)) + (i114 << 1);
                    b = i115 % 128;
                    if (i115 % 2 != 0) {
                        int i116 = this.c.f95o;
                        obj.hashCode();
                        throw null;
                    }
                    i4 = this.c.f95o;
                } else {
                    i4 = this.c.n;
                    int i117 = a;
                    int i118 = i117 ^ 101;
                    int i119 = -(-((i117 & 101) << 1));
                    int i120 = ((i118 | i119) << 1) - (i119 ^ i118);
                    b = i120 % 128;
                    int i121 = i120 % 2;
                }
                bIE bie2 = this.c;
                int i122 = bie2.r;
                int i123 = b;
                int i124 = (61 & (~i123)) | (i123 & (-62));
                int i125 = (i123 & 61) << 1;
                int i126 = (i124 ^ i125) + ((i124 & i125) << 1);
                a = i126 % 128;
                int i127 = i126 % 2;
                int i128 = (i4 - (~(-(-i122)))) - 1;
                int i129 = bie2.l;
                if (i129 != 8388659) {
                    int i130 = a;
                    int i131 = ((i130 & 34) + (i130 | 34)) - 1;
                    b = i131 % 128;
                    int i132 = i131 % 2;
                    if (i129 != 8388691) {
                        int i133 = i130 + 43;
                        b = i133 % 128;
                        if (i133 % 2 != 0) {
                            WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
                            T.aWY.f(view);
                            throw null;
                        }
                        WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap2 = T.c;
                        if (T.aWY.f(view) == 0) {
                            int i134 = a;
                            int i135 = ((i134 & 48) + (i134 | 48)) - 1;
                            b = i135 % 128;
                            f7 = ((i135 % 2 != 0 ? rect2.right * this.n : rect2.right + this.n) - dimensionPixelSize) - i128;
                            int i136 = a;
                            int i137 = ((i136 | 63) << 1) - (i136 ^ 63);
                            b = i137 % 128;
                            int i138 = i137 % 2;
                        } else {
                            float f11 = (rect2.left - this.n) + dimensionPixelSize;
                            int i139 = b;
                            int i140 = (i139 ^ 7) + ((i139 & 7) << 1);
                            int i141 = i140 % 128;
                            a = i141;
                            f7 = i140 % 2 == 0 ? f11 - i128 : f11 + i128;
                            int i142 = i141 & 41;
                            int i143 = i142 + ((i141 ^ 41) | i142);
                            b = i143 % 128;
                            if (i143 % 2 != 0) {
                                int i144 = 3 / 4;
                            }
                        }
                        this.k = f7;
                        int i145 = b;
                        int i146 = i145 & 61;
                        int i147 = (i145 | 61) & (~i146);
                        int i148 = -(-(i146 << 1));
                        int i149 = (i147 ^ i148) + ((i147 & i148) << 1);
                        a = i149 % 128;
                        int i150 = i149 % 2;
                    } else {
                        WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap3 = T.c;
                        if (T.aWY.f(view) == 0) {
                            i7 = b + 95;
                            a = i7 % 128;
                            if (i7 % 2 == 0) {
                                f3 = rect2.left + this.n;
                            } else {
                                f3 = rect2.left - this.n;
                            }
                            int i151 = b;
                            i8 = ((((i151 ^ 23) | (i151 & 23)) << 1) - (~(-(((~i151) & 23) | (i151 & (-24)))))) - 1;
                            a = i8 % 128;
                            if (i8 % 2 == 0) {
                                f2 = (f3 * dimensionPixelSize) - i128;
                            } else {
                                f2 = f3 + dimensionPixelSize + i128;
                            }
                        } else {
                            f = (rect2.right + this.n) - dimensionPixelSize;
                            int i152 = a;
                            i5 = (-2) - ((i152 + 82) ^ (-1));
                            b = i5 % 128;
                            if (i5 % 2 != 0) {
                                f2 = f / i128;
                            } else {
                                f2 = f - i128;
                            }
                            int i153 = ((i152 ^ 49) | (i152 & 49)) << 1;
                            int i154 = -(((~i152) & 49) | (i152 & (-50)));
                            int i155 = (i153 ^ i154) + ((i154 & i153) << 1);
                            b = i155 % 128;
                            int i156 = i155 % 2;
                        }
                        this.k = f2;
                        int i157 = b;
                        int i158 = (i157 ^ 12) + ((i157 & 12) << 1);
                        i6 = (i158 ^ (-1)) + (i158 << 1);
                        a = i6 % 128;
                        if (i6 % 2 == 0) {
                            int i159 = 4 % 5;
                        }
                    }
                } else {
                    WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap4 = T.c;
                    if (T.aWY.f(view) == 0) {
                        i7 = b + 95;
                        a = i7 % 128;
                        if (i7 % 2 == 0) {
                            f3 = rect2.left + this.n;
                        } else {
                            f3 = rect2.left - this.n;
                        }
                        int i1510 = b;
                        i8 = ((((i1510 ^ 23) | (i1510 & 23)) << 1) - (~(-(((~i1510) & 23) | (i1510 & (-24)))))) - 1;
                        a = i8 % 128;
                        if (i8 % 2 == 0) {
                            f2 = (f3 * dimensionPixelSize) - i128;
                        } else {
                            f2 = f3 + dimensionPixelSize + i128;
                        }
                    } else {
                        f = (rect2.right + this.n) - dimensionPixelSize;
                        int i1511 = a;
                        i5 = (-2) - ((i1511 + 82) ^ (-1));
                        b = i5 % 128;
                        if (i5 % 2 != 0) {
                            f2 = f / i128;
                        } else {
                            f2 = f - i128;
                        }
                        int i1512 = ((i1511 ^ 49) | (i1511 & 49)) << 1;
                        int i1513 = -(((~i1511) & 49) | (i1511 & (-50)));
                        int i1514 = (i1512 ^ i1513) + ((i1513 & i1512) << 1);
                        b = i1514 % 128;
                        int i1515 = i1514 % 2;
                    }
                    this.k = f2;
                    int i1516 = b;
                    int i1517 = (i1516 ^ 12) + ((i1516 & 12) << 1);
                    i6 = (i1517 ^ (-1)) + (i1517 << 1);
                    a = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i1518 = 4 % 5;
                    }
                }
                Rect rect3 = this.h;
                float f12 = this.k;
                float f13 = this.l;
                int i160 = b;
                int i161 = ((i160 & 68) + (i160 | 68)) - 1;
                a = i161 % 128;
                if (i161 % 2 == 0) {
                    f4 = this.n;
                    f5 = this.p;
                    int i162 = 15 / 0;
                } else {
                    f4 = this.n;
                    f5 = this.p;
                }
                int i163 = (i160 | 33) << 1;
                int i164 = -(((~i160) & 33) | (i160 & (-34)));
                int i165 = (i163 & i164) + (i164 | i163);
                int i166 = i165 % 128;
                a = i166;
                if (i165 % 2 == 0) {
                    i9 = (int) (f12 % f4);
                    i10 = (int) (f13 / f5);
                    f6 = f12 / f4;
                } else {
                    i9 = (int) (f12 - f4);
                    i10 = (int) (f13 - f5);
                    f6 = f12 + f4;
                }
                int i167 = i166 + 95;
                b = i167 % 128;
                int i168 = i167 % 2;
                rect3.set(i9, i10, (int) f6, (int) (f13 + f5));
                C0019p c0019p = this.e;
                float f14 = this.f94o;
                int i169 = a;
                int i170 = (i169 & 81) + (i169 | 81);
                b = i170 % 128;
                if (i170 % 2 != 0) {
                    c0019p.e.d.h(f14);
                    throw null;
                }
                ivas.gov.bisp.enumeration.O.t tVarH = c0019p.e.d.h(f14);
                int i171 = b;
                int i172 = (((i171 ^ 13) | (i171 & 13)) << 1) - (((~i171) & 13) | (i171 & (-14)));
                a = i172 % 128;
                if (i172 % 2 == 0) {
                    c0019p.e.d = tVarH;
                    c0019p.invalidateSelf();
                    throw null;
                }
                c0019p.e.d = tVarH;
                c0019p.invalidateSelf();
                if (rect.equals(this.h)) {
                    return;
                }
                int i173 = b;
                int i174 = (i173 ^ 119) + ((i173 & 119) << 1);
                a = i174 % 128;
                int i175 = i174 % 2;
                this.e.setBounds(this.h);
                int i176 = (-2) - ((a + 60) ^ (-1));
                b = i176 % 128;
                int i177 = i176 % 2;
            }
        }
    }
}
