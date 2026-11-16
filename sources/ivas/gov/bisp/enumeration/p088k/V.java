package ivas.gov.bisp.enumeration.p088k;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.TypedValue;
import android.widget.TextView;
import ivas.gov.bisp.enumeration.OooOOO0.OooOOOO;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class V {
    private static int a = 0;
    private static int b = 1;
    public final TextView f;
    public TextPaint n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Context f101o;
    public final aRV p;
    public static final RectF c = new RectF();

    @SuppressLint({"BanConcurrentHashMap"})
    public static ConcurrentHashMap<String, Method> e = new ConcurrentHashMap<>();

    @SuppressLint({"BanConcurrentHashMap"})
    public static ConcurrentHashMap<String, Field> d = new ConcurrentHashMap<>();
    public int g = 0;
    public boolean h = false;
    public float i = -1.0f;
    public float j = -1.0f;
    public float l = -1.0f;
    public int[] k = new int[0];
    public boolean m = false;

    public static class aRV {
        private static int a = 1;
        private static int b;

        public void c(StaticLayout.Builder builder, TextView textView) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 65;
            int i4 = -(-((i2 ^ 65) | i3));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            a = i5 % 128;
            Object obj = null;
            if (i5 % 2 != 0) {
                throw null;
            }
            obj.hashCode();
            throw null;
        }

        public boolean d(TextView textView) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (((i2 & (-70)) | ((~i2) & 69)) - (~((i2 & 69) << 1))) - 1;
            b = i3 % 128;
            int i4 = i3 % 2;
            boolean zBooleanValue = ((Boolean) V.d(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
            int i5 = a;
            int i6 = i5 & 61;
            int i7 = -(-((i5 ^ 61) | i6));
            int i8 = (i6 & i7) + (i7 | i6);
            b = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 1 / 0;
            }
            return zBooleanValue;
        }
    }

    public static class aRX extends aRW {
        private static int a = 0;
        private static int b = 1;

        @Override // ivas.gov.bisp.enumeration.k.V.aRW, ivas.gov.bisp.enumeration.k.V.aRV
        public void c(StaticLayout.Builder builder, TextView textView) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 ^ 27) + ((i2 & 27) << 1);
            b = i3 % 128;
            if (i3 % 2 == 0) {
                builder.setTextDirection(textView.getTextDirectionHeuristic());
                throw null;
            }
            builder.setTextDirection(textView.getTextDirectionHeuristic());
            int i4 = a;
            int i5 = (-2) - ((((i4 | 6) << 1) - (i4 ^ 6)) ^ (-1));
            b = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // ivas.gov.bisp.enumeration.k.V.aRV
        public boolean d(TextView textView) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 65;
            int i4 = (i3 - (~(-(-((i2 ^ 65) | i3))))) - 1;
            b = i4 % 128;
            int i5 = i4 % 2;
            boolean zIsHorizontallyScrollable = textView.isHorizontallyScrollable();
            if (i5 == 0) {
                int i6 = 88 / 0;
            }
            int i7 = a + 35;
            b = i7 % 128;
            int i8 = i7 % 2;
            return zIsHorizontallyScrollable;
        }
    }

    static {
        int i = a + 97;
        b = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public V(TextView textView) {
        this.f = textView;
        this.f101o = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.p = new aRX();
            int i = a;
            int i2 = (i ^ 21) + ((i & 21) << 1);
            b = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 37 / 0;
                return;
            }
            return;
        }
        this.p = new aRW();
        int i4 = b;
        int i5 = i4 & 31;
        int i6 = -(-(i4 | 31));
        int i7 = (i5 & i6) + (i6 | i5);
        a = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static Method c(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & 108) + (i2 | 108)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        try {
            Method declaredMethod = e.get(str);
            if (declaredMethod == null) {
                int i5 = a;
                int i6 = (-2) - (((i5 ^ 78) + ((i5 & 78) << 1)) ^ (-1));
                b = i6 % 128;
                declaredMethod = i6 % 2 == 0 ? TextView.class.getDeclaredMethod(str, new Class[1]) : TextView.class.getDeclaredMethod(str, new Class[0]);
                if (declaredMethod != null) {
                    int i7 = b;
                    int i8 = (i7 ^ 23) + ((i7 & 23) << 1);
                    a = i8 % 128;
                    int i9 = i8 % 2;
                    declaredMethod.setAccessible(true);
                    e.put(str, declaredMethod);
                    int i10 = a;
                    int i11 = ((i10 ^ 31) | (i10 & 31)) << 1;
                    int i12 = -((i10 & (-32)) | ((~i10) & 31));
                    int i13 = (i11 & i12) + (i11 | i12);
                    b = i13 % 128;
                    int i14 = i13 % 2;
                    int i15 = ((i10 ^ 10) + ((i10 & 10) << 1)) - 1;
                    b = i15 % 128;
                    int i16 = i15 % 2;
                }
            }
            int i17 = b + 65;
            a = i17 % 128;
            if (i17 % 2 != 0) {
                int i18 = 17 / 0;
            }
            return declaredMethod;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean e() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 29) << 1) - (i2 ^ 29);
        a = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.f instanceof OooOOOO;
        if (i4 != 0) {
            return (z ? 1 : 0) & true;
        }
        int i5 = (z ? 1 : 0) & 1;
        return ((!z ? 1 : 0) | i5) & (~i5);
    }

    public void f() {
        int i;
        if (!e() || this.g == 0) {
            return;
        }
        if (this.h) {
            if (this.f.getMeasuredHeight() <= 0 || this.f.getMeasuredWidth() <= 0) {
                return;
            }
            if (this.p.d(this.f)) {
                i = 1048576;
            } else {
                int measuredWidth = this.f.getMeasuredWidth();
                int i2 = -this.f.getTotalPaddingLeft();
                int i3 = measuredWidth ^ i2;
                int i4 = ((measuredWidth & i2) | i3) << 1;
                int i5 = -i3;
                int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
                int i7 = -this.f.getTotalPaddingRight();
                i = (i7 | i6) + (i6 & i7);
            }
            int height = this.f.getHeight();
            int compoundPaddingBottom = this.f.getCompoundPaddingBottom();
            TextView textView = this.f;
            int i8 = -compoundPaddingBottom;
            int i9 = height & i8;
            int i10 = (((height | i8) & (~i9)) - (~(i9 << 1))) - 1;
            int i11 = -textView.getCompoundPaddingTop();
            int i12 = (i10 & i11) + (i10 | i11);
            if (i <= 0 || i12 <= 0) {
                return;
            }
            RectF rectF = c;
            synchronized (rectF) {
                rectF.setEmpty();
                rectF.right = i;
                rectF.bottom = i12;
                float fH = h(rectF);
                if (fH != this.f.getTextSize()) {
                    i(0, fH);
                }
            }
        }
        this.h = true;
    }

    public static class aRW extends aRV {
        private static int a = 0;
        private static int b = 1;

        @Override // ivas.gov.bisp.enumeration.k.V.aRV
        public void c(StaticLayout.Builder builder, TextView textView) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 37;
            int i4 = ((i2 | 37) & (~i3)) + (i3 << 1);
            a = i4 % 128;
            int i5 = i4 % 2;
            TextDirectionHeuristic textDirectionHeuristic = (TextDirectionHeuristic) V.d(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR);
            int i6 = a;
            int i7 = (i6 ^ 9) + ((i6 & 9) << 1);
            b = i7 % 128;
            if (i7 % 2 != 0) {
                builder.setTextDirection(textDirectionHeuristic);
            } else {
                builder.setTextDirection(textDirectionHeuristic);
                throw null;
            }
        }
    }

    public static <T> T d(Object obj, String str, T t) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 83) | (i2 & 83)) << 1;
        int i4 = -(((~i2) & 83) | (i2 & (-84)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        try {
            Method methodC = c(str);
            Object[] objArr = new Object[0];
            int i7 = a;
            int i8 = ((i7 ^ 39) - (~(-(-((i7 & 39) << 1))))) - 1;
            b = i8 % 128;
            if (i8 % 2 == 0) {
                methodC.invoke(obj, objArr);
                throw null;
            }
            t = (T) methodC.invoke(obj, objArr);
            int i9 = a;
            int i10 = ((i9 | 101) << 1) - (i9 ^ 101);
            b = i10 % 128;
            int i11 = i10 % 2;
            return t;
        } catch (Exception unused) {
        }
    }

    public void i(int i, float f) {
        Resources resources;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 81;
        int i5 = ((i3 ^ 81) | i4) << 1;
        int i6 = -((~i4) & (i3 | 81));
        int i7 = (i5 & i6) + (i5 | i6);
        a = i7 % 128;
        Object obj = null;
        if (i7 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        Context context = this.f101o;
        if (context == null) {
            int i8 = (((i3 ^ 91) | (i3 & 91)) << 1) - (((~i3) & 91) | (i3 & (-92)));
            a = i8 % 128;
            int i9 = i8 % 2;
            resources = Resources.getSystem();
            int i10 = b + 61;
            a = i10 % 128;
            int i11 = i10 % 2;
        } else {
            resources = context.getResources();
            int i12 = a;
            int i13 = ((i12 & 60) + (i12 | 60)) - 1;
            b = i13 % 128;
            int i14 = i13 % 2;
        }
        float fApplyDimension = TypedValue.applyDimension(i, f, resources.getDisplayMetrics());
        TextPaint paint = this.f.getPaint();
        int i15 = b;
        int i16 = i15 & 57;
        int i17 = -(-((i15 ^ 57) | i16));
        int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
        a = i18 % 128;
        int i19 = i18 % 2;
        if (fApplyDimension != paint.getTextSize()) {
            int i20 = a;
            int i21 = i20 & 33;
            int i22 = i20 | 33;
            int i23 = (i21 & i22) + (i22 | i21);
            b = i23 % 128;
            if (i23 % 2 == 0) {
                this.f.getPaint().setTextSize(fApplyDimension);
                throw null;
            }
            this.f.getPaint().setTextSize(fApplyDimension);
            int i24 = a;
            int i25 = ((i24 & 48) + (i24 | 48)) - 1;
            b = i25 % 128;
            if (i25 % 2 == 0) {
                this.f.isInLayout();
                throw null;
            }
            boolean zIsInLayout = this.f.isInLayout();
            if (this.f.getLayout() != null) {
                int i26 = b;
                int i27 = i26 & 103;
                int i28 = (i27 - (~(-(-((i26 ^ 103) | i27))))) - 1;
                a = i28 % 128;
                int i29 = i28 % 2;
                this.h = false;
                try {
                    Method methodC = c("nullLayouts");
                    if (methodC != null) {
                        int i30 = b;
                        int i31 = ((i30 & (-46)) | ((~i30) & 45)) + ((i30 & 45) << 1);
                        a = i31 % 128;
                        if (i31 % 2 != 0) {
                            methodC.invoke(this.f, new Object[0]);
                        } else {
                            methodC.invoke(this.f, new Object[0]);
                        }
                        int i32 = b + 15;
                        a = i32 % 128;
                        int i33 = i32 % 2;
                    }
                } catch (Exception unused) {
                }
                if (zIsInLayout) {
                    this.f.forceLayout();
                    int i34 = b;
                    int i35 = (i34 ^ 28) + ((i34 & 28) << 1);
                    int i36 = (i35 ^ (-1)) + (i35 << 1);
                    a = i36 % 128;
                    int i37 = i36 % 2;
                } else {
                    int i38 = b;
                    int i39 = i38 & 35;
                    int i40 = -(-((i38 ^ 35) | i39));
                    int i41 = ((i39 | i40) << 1) - (i40 ^ i39);
                    a = i41 % 128;
                    if (i41 % 2 != 0) {
                        this.f.requestLayout();
                        int i42 = 6 / 0;
                    } else {
                        this.f.requestLayout();
                    }
                    int i43 = b;
                    int i44 = ((((i43 ^ 83) | (i43 & 83)) << 1) - (~(-(((~i43) & 83) | (i43 & (-84)))))) - 1;
                    a = i44 % 128;
                    int i45 = i44 % 2;
                }
                this.f.invalidate();
                int i46 = b;
                int i47 = i46 & 1;
                int i48 = ((i46 ^ 1) | i47) << 1;
                int i49 = -((i46 | 1) & (~i47));
                int i50 = (i48 & i49) + (i49 | i48);
                a = i50 % 128;
                int i51 = i50 % 2;
            }
        }
        int i52 = b + 19;
        a = i52 % 128;
        if (i52 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003d  */
    /* JADX WARN: Code duplicated, block: B:16:0x0062  */
    /* JADX WARN: Code duplicated, block: B:17:0x0065  */
    /* JADX WARN: Code duplicated, block: B:21:0x0097 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0098  */
    public final boolean k() {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = (i5 & 91) + (i5 | 91);
        int i7 = i6 % 128;
        b = i7;
        Object obj = null;
        if (i6 % 2 == 0) {
            int length = this.k.length;
            obj.hashCode();
            throw null;
        }
        int[] iArr = this.k;
        int length2 = iArr.length;
        if (length2 > 0) {
            int i8 = (i5 & 9) + (i5 | 9);
            b = i8 % 128;
            if (i8 % 2 != 0) {
                z = true;
            }
            this.m = z;
            if (z) {
                int i9 = a;
                int i10 = (i9 | 21) << 1;
                int i11 = -(i9 ^ 21);
                int i12 = (i10 & i11) + (i11 | i10);
                int i13 = i12 % 128;
                b = i13;
                int i14 = i12 % 2;
                this.g = 1;
                this.j = iArr[0];
                int i15 = i13 & 85;
                i2 = i15 + ((i13 ^ 85) | i15);
                a = i2 % 128;
                if (i2 % 2 != 0) {
                    i3 = iArr[length2];
                } else {
                    i3 = iArr[(length2 - (~((length2 ^ (-1)) | length2))) - 1];
                }
                this.l = i3;
                this.i = -1.0f;
                int i16 = (((i13 | 43) << 1) - (~(-(((~i13) & 43) | (i13 & (-44)))))) - 1;
                a = i16 % 128;
                int i17 = i16 % 2;
            }
            int i18 = a;
            int i19 = i18 & 21;
            i = (i19 - (~((i18 ^ 21) | i19))) - 1;
            b = i % 128;
            if (i % 2 != 0) {
                return z;
            }
            throw null;
        }
        int i20 = i7 & 57;
        int i21 = (i7 | 57) & (~i20);
        int i22 = i20 << 1;
        int i23 = (i21 & i22) + (i22 | i21);
        a = i23 % 128;
        int i24 = i23 % 2;
        z = false;
        this.m = z;
        if (z) {
            int i25 = a;
            int i110 = (i25 | 21) << 1;
            int i111 = -(i25 ^ 21);
            int i112 = (i110 & i111) + (i111 | i110);
            int i113 = i112 % 128;
            b = i113;
            int i114 = i112 % 2;
            this.g = 1;
            this.j = iArr[0];
            int i115 = i113 & 85;
            i2 = i115 + ((i113 ^ 85) | i115);
            a = i2 % 128;
            if (i2 % 2 != 0) {
                i3 = iArr[length2];
            } else {
                i3 = iArr[(length2 - (~((length2 ^ (-1)) | length2))) - 1];
            }
            this.l = i3;
            this.i = -1.0f;
            int i116 = (((i113 | 43) << 1) - (~(-(((~i113) & 43) | (i113 & (-44)))))) - 1;
            a = i116 % 128;
            int i117 = i116 % 2;
        }
        int i118 = a;
        int i119 = i118 & 21;
        i = (i119 - (~((i118 ^ 21) | i119))) - 1;
        b = i % 128;
        if (i % 2 != 0) {
            return z;
        }
        throw null;
    }

    public final int[] g(int[] iArr) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & (-96)) | ((~i2) & 95)) + ((i2 & 95) << 1);
        int i4 = i3 % 128;
        b = i4;
        Object obj = null;
        if (i3 % 2 == 0) {
            int length = iArr.length;
            throw null;
        }
        int length2 = iArr.length;
        if (length2 == 0) {
            int i5 = i4 + 8;
            int i6 = (i5 ^ (-1)) + (i5 << 1);
            a = i6 % 128;
            if (i6 % 2 == 0) {
                return iArr;
            }
            obj.hashCode();
            throw null;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        int i7 = b + 7;
        a = i7 % 128;
        int i8 = i7 % 2;
        int i9 = 0;
        int i10 = 0;
        while (i10 < length2) {
            int i11 = a + 89;
            int i12 = i11 % 128;
            b = i12;
            int i13 = i11 % 2;
            int i14 = iArr[i10];
            if (i14 > 0) {
                int i15 = i12 & 91;
                int i16 = (i12 | 91) & (~i15);
                int i17 = -(-(i15 << 1));
                int i18 = (i16 & i17) + (i16 | i17);
                a = i18 % 128;
                int i19 = i18 % 2;
                if (Collections.binarySearch(arrayList, Integer.valueOf(i14)) < 0) {
                    int i20 = b;
                    int i21 = ((i20 | 119) << 1) - (i20 ^ 119);
                    a = i21 % 128;
                    int i22 = i21 % 2;
                    arrayList.add(Integer.valueOf(i14));
                    int i23 = b;
                    int i24 = i23 & 115;
                    int i25 = i24 + ((i23 ^ 115) | i24);
                    a = i25 % 128;
                    int i26 = i25 % 2;
                }
            }
            int i27 = i10 & (-89);
            int i28 = ((i10 ^ (-89)) | i27) << 1;
            int i29 = -((i10 | (-89)) & (~i27));
            int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
            int i31 = i30 & 90;
            i10 = i31 + ((i30 ^ 90) | i31);
            int i32 = b;
            int i33 = ((i32 | 43) << 1) - (i32 ^ 43);
            a = i33 % 128;
            int i34 = i33 % 2;
        }
        if (length2 == arrayList.size()) {
            int i35 = a + 107;
            b = i35 % 128;
            if (i35 % 2 == 0) {
                int i36 = 66 / 0;
            }
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        int i37 = b;
        int i38 = (i37 & 9) + (i37 | 9);
        int i39 = i38 % 128;
        a = i39;
        int i40 = i38 % 2;
        int i41 = i39 ^ 115;
        int i42 = ((((i39 & 115) | i41) << 1) - (~(-i41))) - 1;
        b = i42 % 128;
        int i43 = i42 % 2;
        while (i9 < size) {
            int i44 = a;
            int i45 = i44 & 121;
            int i46 = (i44 | 121) & (~i45);
            int i47 = -(-(i45 << 1));
            int i48 = (i46 & i47) + (i46 | i47);
            b = i48 % 128;
            int i49 = i48 % 2;
            Integer num = (Integer) arrayList.get(i9);
            int i50 = a;
            int i51 = (i50 & (-48)) | ((~i50) & 47);
            int i52 = (i50 & 47) << 1;
            int i53 = (i51 ^ i52) + ((i52 & i51) << 1);
            b = i53 % 128;
            int i54 = i53 % 2;
            iArr2[i9] = num.intValue();
            int i55 = i9 & 1;
            i9 = (((i9 ^ 1) | i55) << 1) - ((i9 | 1) & (~i55));
            int i56 = b;
            int i57 = (i56 ^ 125) + ((i56 & 125) << 1);
            a = i57 % 128;
            int i58 = i57 % 2;
        }
        int i59 = a;
        int i60 = (i59 & 13) + (i59 | 13);
        b = i60 % 128;
        int i61 = i60 % 2;
        return iArr2;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0060  */
    /* JADX WARN: Code duplicated, block: B:24:0x009b  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:33:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:40:0x00db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0099 A[SYNTHETIC] */
    public final boolean j() {
        int i;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        int i7;
        int i8 = 2 % 2;
        int i9 = a;
        int i10 = ((i9 & (-18)) | ((~i9) & 17)) + ((i9 & 17) << 1);
        b = i10 % 128;
        if (i10 % 2 != 0) {
            if (e()) {
                i = 0;
                int i11 = b;
                int i12 = i11 & 73;
                int i13 = (i11 | 73) & (~i12);
                int i14 = -(-(i12 << 1));
                i3 = ((i13 | i14) << 1) - (i13 ^ i14);
                int i15 = i3 % 128;
                a = i15;
                if (i3 % 2 != 0) {
                }
            }
            int i16 = i2 % 2;
            boolean z = this.h;
            int i17 = b;
            int i18 = ((i17 ^ 111) | (i17 & 111)) << 1;
            int i19 = -(((~i17) & 111) | (i17 & (-112)));
            int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
            a = i20 % 128;
            int i21 = i20 % 2;
            return z;
        }
        if (!(!e())) {
            i = 1;
            int i110 = b;
            int i111 = i110 & 73;
            int i112 = (i110 | 73) & (~i111);
            int i113 = -(-(i111 << 1));
            i3 = ((i112 | i113) << 1) - (i112 ^ i113);
            int i114 = i3 % 128;
            a = i114;
            if (i3 % 2 != 0 ? this.g == 1 : this.g == 0) {
                if (this.m) {
                    int i22 = i114 & 103;
                    int i23 = (i22 - (~((i114 ^ 103) | i22))) - 1;
                    b = i23 % 128;
                    int i24 = i23 % 2;
                    if (this.k.length == 0) {
                        float f = this.l - this.j;
                        float f2 = this.i;
                        int i25 = b + 7;
                        a = i25 % 128;
                        int i26 = i25 % 2;
                        int iFloor = (int) Math.floor(f / f2);
                        int i27 = (iFloor & (-2)) | ((~iFloor) & 1);
                        int i28 = (iFloor & 1) << 1;
                        i4 = ((i27 | i28) << 1) - (i28 ^ i27);
                        iArr = new int[i4];
                        int i29 = a + 15;
                        int i30 = i29 % 128;
                        b = i30;
                        int i31 = i29 % 2;
                        int i32 = (i30 ^ 67) + ((i30 & 67) << 1);
                        a = i32 % 128;
                        int i33 = i32 % 2;
                        while (i < i4) {
                            int i34 = b;
                            int i35 = (i34 & 98) + (i34 | 98);
                            i6 = (i35 ^ (-1)) + (i35 << 1);
                            a = i6 % 128;
                            if (i6 % 2 == 0) {
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                            iArr[i] = Math.round((i * this.i) + this.j);
                            int i36 = i ^ 1;
                            i = (((i & 1) | i36) << 1) - i36;
                            int i37 = a;
                            i7 = (((i37 & (-94)) | ((~i37) & 93)) - (~(-(-((i37 & 93) << 1))))) - 1;
                            b = i7 % 128;
                            if (i7 % 2 == 0) {
                                int i38 = 2 % 4;
                            }
                        }
                        this.k = g(iArr);
                        int i39 = a;
                        i5 = ((i39 & (-62)) | ((~i39) & 61)) + ((i39 & 61) << 1);
                        b = i5 % 128;
                        if (i5 % 2 == 0) {
                            int i40 = 3 / 3;
                        }
                    }
                } else {
                    float f3 = this.l - this.j;
                    float f4 = this.i;
                    int i210 = b + 7;
                    a = i210 % 128;
                    int i211 = i210 % 2;
                    int iFloor2 = (int) Math.floor(f3 / f4);
                    int i212 = (iFloor2 & (-2)) | ((~iFloor2) & 1);
                    int i213 = (iFloor2 & 1) << 1;
                    i4 = ((i212 | i213) << 1) - (i213 ^ i212);
                    iArr = new int[i4];
                    int i214 = a + 15;
                    int i310 = i214 % 128;
                    b = i310;
                    int i311 = i214 % 2;
                    int i312 = (i310 ^ 67) + ((i310 & 67) << 1);
                    a = i312 % 128;
                    int i313 = i312 % 2;
                    while (i < i4) {
                        int i314 = b;
                        int i315 = (i314 & 98) + (i314 | 98);
                        i6 = (i315 ^ (-1)) + (i315 << 1);
                        a = i6 % 128;
                        if (i6 % 2 == 0) {
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        iArr[i] = Math.round((i * this.i) + this.j);
                        int i316 = i ^ 1;
                        i = (((i & 1) | i316) << 1) - i316;
                        int i317 = a;
                        i7 = (((i317 & (-94)) | ((~i317) & 93)) - (~(-(-((i317 & 93) << 1))))) - 1;
                        b = i7 % 128;
                        if (i7 % 2 == 0) {
                            int i318 = 2 % 4;
                        }
                    }
                    this.k = g(iArr);
                    int i319 = a;
                    i5 = ((i319 & (-62)) | ((~i319) & 61)) + ((i319 & 61) << 1);
                    b = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i41 = 3 / 3;
                    }
                }
                this.h = true;
                int i42 = b;
                int i43 = i42 & 109;
                int i44 = -(-((i42 ^ 109) | i43));
                i2 = (i43 ^ i44) + ((i44 & i43) << 1);
                a = i2 % 128;
            }
        }
        int i115 = i2 % 2;
        boolean z2 = this.h;
        int i116 = b;
        int i117 = ((i116 ^ 111) | (i116 & 111)) << 1;
        int i118 = -(((~i116) & 111) | (i116 & (-112)));
        int i215 = ((i117 | i118) << 1) - (i118 ^ i117);
        a = i215 % 128;
        int i216 = i215 % 2;
        return z2;
        this.h = false;
        int i45 = a;
        int i46 = i45 & 59;
        int i47 = (i45 ^ 59) | i46;
        i2 = (i46 & i47) + (i47 | i46);
        b = i2 % 128;
        int i119 = i2 % 2;
        boolean z3 = this.h;
        int i1110 = b;
        int i1111 = ((i1110 ^ 111) | (i1110 & 111)) << 1;
        int i1112 = -(((~i1110) & 111) | (i1110 & (-112)));
        int i217 = ((i1111 | i1112) << 1) - (i1112 ^ i1111);
        a = i217 % 128;
        int i218 = i217 % 2;
        return z3;
    }

    public final void l(float f, float f2, float f3) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 54) + ((i2 & 54) << 1)) - 1;
        b = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0 ? f <= 0.0f : f <= 2.0f) {
            StringBuilder sb = new StringBuilder();
            int i4 = a;
            int i5 = ((i4 & 92) + (i4 | 92)) - 1;
            b = i5 % 128;
            if (i5 % 2 == 0) {
                sb.append("Minimum auto-size text size (");
                sb.append(f);
                throw null;
            }
            sb.append("Minimum auto-size text size (");
            sb.append(f);
            sb.append("px) is less or equal to (0px)");
            throw new IllegalArgumentException(sb.toString());
        }
        int i6 = ((i2 ^ 75) - (~((i2 & 75) << 1))) - 1;
        b = i6 % 128;
        if (i6 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (f2 <= f) {
            StringBuilder sb2 = new StringBuilder();
            int i7 = b + 119;
            a = i7 % 128;
            int i8 = i7 % 2;
            sb2.append("Maximum auto-size text size (");
            sb2.append(f2);
            int i9 = b;
            int i10 = (((i9 | 86) << 1) - (i9 ^ 86)) - 1;
            a = i10 % 128;
            int i11 = i10 % 2;
            sb2.append("px) is less or equal to minimum auto-size text size (");
            int i12 = b + 95;
            a = i12 % 128;
            int i13 = i12 % 2;
            sb2.append(f);
            sb2.append("px)");
            throw new IllegalArgumentException(sb2.toString());
        }
        if (f3 <= 0.0f) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("The auto-size step granularity (");
            int i14 = b;
            int i15 = i14 ^ 11;
            int i16 = ((((i14 & 11) | i15) << 1) - (~(-i15))) - 1;
            a = i16 % 128;
            if (i16 % 2 == 0) {
                sb3.append(f3);
                sb3.append("px) is less or equal to (0px)");
                throw new IllegalArgumentException(sb3.toString());
            }
            sb3.append(f3);
            sb3.append("px) is less or equal to (0px)");
            obj.hashCode();
            throw null;
        }
        int i17 = i2 ^ 27;
        int i18 = ((i2 & 27) | i17) << 1;
        int i19 = -i17;
        int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
        b = i20 % 128;
        int i21 = i20 % 2;
        this.g = 1;
        this.j = f;
        this.l = f2;
        int i22 = i2 & 65;
        int i23 = (~i22) & (i2 | 65);
        int i24 = i22 << 1;
        int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
        b = i25 % 128;
        int i26 = i25 % 2;
        this.i = f3;
        this.m = false;
        int i27 = ((i2 & 101) - (~(-(-(i2 | 101))))) - 1;
        b = i27 % 128;
        int i28 = i27 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x01e7 A[PHI: r7
  0x01e7: PHI (r7v31 android.text.StaticLayout$Builder) = (r7v30 android.text.StaticLayout$Builder), (r7v58 android.text.StaticLayout$Builder) binds: [B:39:0x01e5, B:36:0x01da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x01f4 A[PHI: r7
  0x01f4: PHI (r7v57 android.text.StaticLayout$Builder) = (r7v30 android.text.StaticLayout$Builder), (r7v58 android.text.StaticLayout$Builder) binds: [B:39:0x01e5, B:36:0x01da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x024d  */
    /* JADX WARN: Code duplicated, block: B:64:0x0266  */
    /* JADX WARN: Code duplicated, block: B:65:0x026f  */
    /* JADX WARN: Code duplicated, block: B:68:0x0292  */
    /* JADX WARN: Code duplicated, block: B:73:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:74:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:95:0x02cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x029d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x029d A[SYNTHETIC] */
    public final int h(RectF rectF) {
        int i;
        CharSequence text;
        StaticLayout.Builder breakStrategy;
        TextView textView;
        StaticLayout.Builder hyphenationFrequency;
        int i2;
        int i3;
        int i4;
        int i5;
        int lineEnd;
        int i6 = 2 % 2;
        int i7 = b;
        int i8 = (((i7 | 16) << 1) - (i7 ^ 16)) - 1;
        int i9 = i8 % 128;
        a = i9;
        int i10 = i8 % 2;
        int length = this.k.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i11 = i9 & 115;
        int i12 = ((i9 ^ 115) | i11) << 1;
        int i13 = -((~i11) & (i9 | 115));
        int i14 = (i12 & i13) + (i12 | i13);
        b = i14 % 128;
        int i15 = i14 % 2;
        int i16 = (~length) + (length << 1);
        int i17 = i9 & 53;
        int i18 = (i17 - (~((i9 ^ 53) | i17))) - 1;
        b = i18 % 128;
        if (i18 % 2 == 0) {
            int i19 = 2 / 5;
        }
        int i20 = 0;
        int i21 = 1;
        while (i21 <= i16) {
            int i22 = a;
            int i23 = i22 & 97;
            int i24 = (((i22 | 97) & (~i23)) - (~(i23 << 1))) - 1;
            int i25 = i24 % 128;
            b = i25;
            int i26 = i24 % 2;
            int i27 = (i21 | i16) << 1;
            int i28 = -(((~i16) & i21) | ((~i21) & i16));
            int i29 = (((i27 | i28) << 1) - (i27 ^ i28)) / 2;
            int[] iArr = this.k;
            int i30 = i25 | 61;
            int i31 = i30 << 1;
            int i32 = -((~(i25 & 61)) & i30);
            int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
            a = i33 % 128;
            if (i33 % 2 != 0) {
                i = iArr[i29];
                text = this.f.getText();
                int i34 = 58 / 0;
            } else {
                i = iArr[i29];
                text = this.f.getText();
            }
            TransformationMethod transformationMethod = this.f.getTransformationMethod();
            int i35 = b;
            int i36 = i35 & 7;
            int i37 = i36 + ((i35 ^ 7) | i36);
            int i38 = i37 % 128;
            a = i38;
            int i39 = i37 % 2;
            Object obj = null;
            if (transformationMethod != null) {
                int i40 = (i38 | 119) << 1;
                int i41 = -(i38 ^ 119);
                int i42 = (i40 ^ i41) + ((i41 & i40) << 1);
                b = i42 % 128;
                int i43 = i42 % 2;
                CharSequence transformation = transformationMethod.getTransformation(text, this.f);
                int i44 = b;
                int i45 = i44 & 93;
                int i46 = (i44 | 93) & (~i45);
                int i47 = i45 << 1;
                int i48 = ((i46 | i47) << 1) - (i46 ^ i47);
                int i49 = i48 % 128;
                a = i49;
                int i50 = i48 % 2;
                if (transformation != null) {
                    int i51 = i49 + 31;
                    b = i51 % 128;
                    if (i51 % 2 == 0) {
                        throw null;
                    }
                    text = transformation;
                }
            }
            int maxLines = this.f.getMaxLines();
            TextPaint textPaint = this.n;
            if (textPaint == null) {
                this.n = new TextPaint();
                int i52 = a;
                int i53 = (i52 & 3) + (i52 | 3);
                b = i53 % 128;
                int i54 = i53 % 2;
            } else {
                textPaint.reset();
                int i55 = b;
                int i56 = (((i55 | 126) << 1) - (i55 ^ 126)) - 1;
                a = i56 % 128;
                int i57 = i56 % 2;
            }
            this.n.set(this.f.getPaint());
            TextPaint textPaint2 = this.n;
            float f = i;
            int i58 = b + 45;
            a = i58 % 128;
            if (i58 % 2 != 0) {
                textPaint2.setTextSize(f);
                obj.hashCode();
                throw null;
            }
            textPaint2.setTextSize(f);
            Layout.Alignment alignment = (Layout.Alignment) d(this.f, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
            int iRound = Math.round(rectF.right);
            int length2 = text.length();
            TextPaint textPaint3 = this.n;
            int i59 = a;
            int i60 = i59 & 89;
            int i61 = i59 | 89;
            int i62 = (i60 ^ i61) + ((i60 & i61) << 1);
            b = i62 % 128;
            int i63 = i62 % 2;
            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(text, 0, length2, textPaint3, iRound);
            StaticLayout.Builder alignment2 = builderObtain.setAlignment(alignment);
            int i64 = b;
            int i65 = (i64 & 69) + (i64 | 69);
            a = i65 % 128;
            if (i65 % 2 != 0) {
                this.f.getLineSpacingExtra();
                this.f.getLineSpacingMultiplier();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            StaticLayout.Builder includePad = alignment2.setLineSpacing(this.f.getLineSpacingExtra(), this.f.getLineSpacingMultiplier()).setIncludePad(this.f.getIncludeFontPadding());
            int i66 = b;
            int i67 = i66 & 81;
            int i68 = ((i66 ^ 81) | i67) << 1;
            int i69 = -((i66 | 81) & (~i67));
            int i70 = (i68 & i69) + (i69 | i68);
            a = i70 % 128;
            if (i70 % 2 != 0) {
                breakStrategy = includePad.setBreakStrategy(this.f.getBreakStrategy());
                textView = this.f;
                int i71 = 42 / 0;
            } else {
                breakStrategy = includePad.setBreakStrategy(this.f.getBreakStrategy());
                textView = this.f;
            }
            int i72 = b;
            int i73 = i72 & 15;
            int i74 = -(-((i72 ^ 15) | i73));
            int i75 = (i73 & i74) + (i74 | i73);
            a = i75 % 128;
            if (i75 % 2 != 0) {
                hyphenationFrequency = breakStrategy.setHyphenationFrequency(textView.getHyphenationFrequency());
                int i76 = 53 / 0;
                if (maxLines == -1) {
                    int i77 = b + 89;
                    a = i77 % 128;
                    int i78 = i77 % 2;
                    i2 = Integer.MAX_VALUE;
                } else {
                    int i79 = b;
                    int i80 = i79 & 65;
                    int i81 = (i79 | 65) & (~i80);
                    int i82 = i80 << 1;
                    int i83 = (i81 & i82) + (i81 | i82);
                    a = i83 % 128;
                    int i84 = i83 % 2;
                    i2 = maxLines;
                }
            } else {
                hyphenationFrequency = breakStrategy.setHyphenationFrequency(textView.getHyphenationFrequency());
                if (maxLines == -1) {
                    int i710 = b + 89;
                    a = i710 % 128;
                    int i711 = i710 % 2;
                    i2 = Integer.MAX_VALUE;
                } else {
                    int i712 = b;
                    int i85 = i712 & 65;
                    int i86 = (i712 | 65) & (~i85);
                    int i87 = i85 << 1;
                    int i88 = (i86 & i87) + (i86 | i87);
                    a = i88 % 128;
                    int i89 = i88 % 2;
                    i2 = maxLines;
                }
            }
            hyphenationFrequency.setMaxLines(i2);
            try {
                aRV arv = this.p;
                TextView textView2 = this.f;
                int i90 = (-2) - ((a + 100) ^ (-1));
                b = i90 % 128;
                if (i90 % 2 == 0) {
                    arv.c(builderObtain, textView2);
                    throw null;
                }
                arv.c(builderObtain, textView2);
            } catch (ClassCastException unused) {
            }
            StaticLayout staticLayoutBuild = builderObtain.build();
            if (maxLines != -1) {
                int i91 = b;
                int i92 = (i91 ^ 25) + ((i91 & 25) << 1);
                a = i92 % 128;
                if (i92 % 2 != 0) {
                    int i93 = 28 / 0;
                    if (staticLayoutBuild.getLineCount() <= maxLines) {
                        int i94 = b;
                        int i95 = (i94 & (-42)) | ((~i94) & 41);
                        int i96 = -(-((i94 & 41) << 1));
                        i5 = (i95 ^ i96) + ((i96 & i95) << 1);
                        a = i5 % 128;
                        if (i5 % 2 != 0) {
                            lineEnd = staticLayoutBuild.getLineEnd(staticLayoutBuild.getLineCount());
                        } else {
                            int lineCount = staticLayoutBuild.getLineCount();
                            int i97 = ~lineCount;
                            int i98 = lineCount << 1;
                            lineEnd = staticLayoutBuild.getLineEnd((i97 ^ i98) + ((i98 & i97) << 1));
                        }
                        int i99 = b;
                        int i100 = i99 & 1;
                        int i101 = (i100 - (~((i99 ^ 1) | i100))) - 1;
                        a = i101 % 128;
                        int i102 = i101 % 2;
                        if (lineEnd == text.length()) {
                            if (staticLayoutBuild.getHeight() > rectF.bottom) {
                                int i103 = b;
                                int i104 = ((i103 ^ 106) + ((i103 & 106) << 1)) - 1;
                                a = i104 % 128;
                                int i105 = i104 % 2;
                                i3 = (((i103 ^ 101) | (i103 & 101)) << 1) - (((~i103) & 101) | (i103 & (-102)));
                                a = i3 % 128;
                                if (i3 % 2 != 0) {
                                    i4 = i29 >>> 1;
                                } else {
                                    int i106 = i29 & 1;
                                    i4 = ((((i29 ^ 1) | i106) << 1) - (~(-((~i106) & (i29 | 1))))) - 1;
                                }
                                int i107 = i4;
                                i20 = i21;
                                i21 = i107;
                            }
                        }
                    }
                } else if (staticLayoutBuild.getLineCount() <= maxLines) {
                    int i910 = b;
                    int i911 = (i910 & (-42)) | ((~i910) & 41);
                    int i912 = -(-((i910 & 41) << 1));
                    i5 = (i911 ^ i912) + ((i912 & i911) << 1);
                    a = i5 % 128;
                    if (i5 % 2 != 0) {
                        lineEnd = staticLayoutBuild.getLineEnd(staticLayoutBuild.getLineCount());
                    } else {
                        int lineCount2 = staticLayoutBuild.getLineCount();
                        int i913 = ~lineCount2;
                        int i914 = lineCount2 << 1;
                        lineEnd = staticLayoutBuild.getLineEnd((i913 ^ i914) + ((i914 & i913) << 1));
                    }
                    int i915 = b;
                    int i108 = i915 & 1;
                    int i109 = (i108 - (~((i915 ^ 1) | i108))) - 1;
                    a = i109 % 128;
                    int i1010 = i109 % 2;
                    if (lineEnd == text.length()) {
                        if (staticLayoutBuild.getHeight() > rectF.bottom) {
                            int i1011 = b;
                            int i1012 = ((i1011 ^ 106) + ((i1011 & 106) << 1)) - 1;
                            a = i1012 % 128;
                            int i1013 = i1012 % 2;
                            i3 = (((i1011 ^ 101) | (i1011 & 101)) << 1) - (((~i1011) & 101) | (i1011 & (-102)));
                            a = i3 % 128;
                            if (i3 % 2 != 0) {
                                i4 = i29 >>> 1;
                            } else {
                                int i1014 = i29 & 1;
                                i4 = ((((i29 ^ 1) | i1014) << 1) - (~(-((~i1014) & (i29 | 1))))) - 1;
                            }
                            int i1015 = i4;
                            i20 = i21;
                            i21 = i1015;
                        }
                    }
                }
                int i110 = b;
                int i111 = (i110 & (-126)) | ((~i110) & 125);
                int i112 = -(-((i110 & 125) << 1));
                int i113 = (i111 ^ i112) + ((i112 & i111) << 1);
                int i114 = i113 % 128;
                a = i114;
                int i115 = i113 % 2;
                i20 = (i29 ^ (-1)) + (i29 << 1);
                int i116 = i114 & 5;
                int i117 = (i116 - (~(-(-((i114 ^ 5) | i116))))) - 1;
                b = i117 % 128;
                int i118 = i117 % 2;
                i16 = i20;
            } else if (staticLayoutBuild.getHeight() > rectF.bottom) {
                int i119 = b;
                int i1110 = (i119 & (-126)) | ((~i119) & 125);
                int i1111 = -(-((i119 & 125) << 1));
                int i1112 = (i1110 ^ i1111) + ((i1111 & i1110) << 1);
                int i1113 = i1112 % 128;
                a = i1113;
                int i1114 = i1112 % 2;
                i20 = (i29 ^ (-1)) + (i29 << 1);
                int i1115 = i1113 & 5;
                int i1116 = (i1115 - (~(-(-((i1113 ^ 5) | i1115))))) - 1;
                b = i1116 % 128;
                int i1117 = i1116 % 2;
                i16 = i20;
            } else {
                int i1016 = b;
                int i1017 = ((i1016 ^ 106) + ((i1016 & 106) << 1)) - 1;
                a = i1017 % 128;
                int i1018 = i1017 % 2;
                i3 = (((i1016 ^ 101) | (i1016 & 101)) << 1) - (((~i1016) & 101) | (i1016 & (-102)));
                a = i3 % 128;
                if (i3 % 2 != 0) {
                    i4 = i29 >>> 1;
                } else {
                    int i1019 = i29 & 1;
                    i4 = ((((i29 ^ 1) | i1019) << 1) - (~(-((~i1019) & (i29 | 1))))) - 1;
                }
                int i10110 = i4;
                i20 = i21;
                i21 = i10110;
            }
        }
        int i120 = this.k[i20];
        int i121 = b;
        int i122 = i121 & 103;
        int i123 = (i121 ^ 103) | i122;
        int i124 = (i122 ^ i123) + ((i123 & i122) << 1);
        a = i124 % 128;
        if (i124 % 2 != 0) {
            int i125 = 57 / 0;
        }
        return i120;
    }
}
