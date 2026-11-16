package ivas.gov.bisp.enumeration.p007ag;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import ivas.gov.bisp.enumeration.p002ab.M;
import ivas.gov.bisp.enumeration.p009ai.N;
import ivas.gov.bisp.enumeration.p091n.j;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class z extends i {
    private static int a = 1;
    private static int b;
    public final Method i;
    public final Class<?> j;
    public final Constructor<?> k;
    public final Method l;
    public final Method m;
    public final Method n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Method f67o;

    public z() {
        Method methodT;
        Class<?> cls;
        Constructor<?> constructor;
        Method methodS;
        Method method;
        Method method2;
        Method methodU;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            methodS = s(cls);
            methodT = t(cls);
            method = cls.getMethod("freeze", new Class[0]);
            method2 = cls.getMethod("abortCreation", new Class[0]);
            methodU = u(cls);
            int i = 2 % 2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            StringBuilder sbW = j.w("Unable to collect necessary methods for class ");
            Class<?> cls2 = e.getClass();
            int i2 = a;
            int i3 = i2 & 57;
            int i4 = -(-((i2 ^ 57) | i3));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            b = i5 % 128;
            methodT = null;
            if (i5 % 2 != 0) {
                sbW.append(cls2.getName());
                sbW.toString();
                methodT.hashCode();
                throw null;
            }
            sbW.append(cls2.getName());
            Log.e("TypefaceCompatApi26Impl", sbW.toString(), e);
            int i6 = (-2) - ((a + 68) ^ (-1));
            int i7 = i6 % 128;
            b = i7;
            if (i6 % 2 != 0) {
                throw null;
            }
            int i8 = ((i7 | 37) << 1) - (i7 ^ 37);
            a = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 2 % 2;
            }
            cls = null;
            constructor = null;
            methodS = null;
            method = null;
            method2 = null;
            methodU = null;
        }
        this.j = cls;
        this.k = constructor;
        this.i = methodS;
        int i10 = b + 61;
        int i11 = i10 % 128;
        a = i11;
        if (i10 % 2 == 0) {
            this.l = methodT;
            this.m = method;
            int i12 = 65 / 0;
        } else {
            this.l = methodT;
            this.m = method;
        }
        this.n = method2;
        this.f67o = methodU;
        int i13 = (i11 ^ 123) + ((i11 & 123) << 1);
        b = i13 % 128;
        int i14 = i13 % 2;
    }

    private Object j() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 77;
        int i4 = -(-((i2 & 77) << 1));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        try {
            Object objNewInstance = i5 % 2 != 0 ? this.k.newInstance(new Object[0]) : this.k.newInstance(new Object[0]);
            int i6 = b;
            int i7 = (i6 & 65) + (i6 | 65);
            a = i7 % 128;
            int i8 = i7 % 2;
            return objNewInstance;
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean k(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        char c;
        int i4 = 2 % 2;
        int i5 = b;
        int i6 = i5 & 103;
        int i7 = i6 + ((i5 ^ 103) | i6);
        int i8 = i7 % 128;
        a = i8;
        int i9 = i7 % 2;
        try {
            Method method = this.i;
            Object[] objArr = new Object[8];
            int i10 = (i8 & (-84)) | ((~i8) & 83);
            int i11 = (i8 & 83) << 1;
            int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
            b = i12 % 128;
            if (i12 % 2 != 0) {
                objArr[1] = context.getAssets();
                c = 0;
            } else {
                objArr[0] = context.getAssets();
                c = 1;
            }
            int i13 = a;
            int i14 = i13 & 47;
            int i15 = ((i13 ^ 47) | i14) << 1;
            int i16 = -((i13 | 47) & (~i14));
            int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
            b = i17 % 128;
            if (i17 % 2 != 0) {
                objArr[c] = str;
                objArr[5] = 0;
            } else {
                objArr[c] = str;
                objArr[2] = 0;
            }
            int i18 = b;
            int i19 = (i18 & 35) + (i18 | 35);
            a = i19 % 128;
            int i20 = i19 % 2;
            objArr[3] = Boolean.FALSE;
            Integer numValueOf = Integer.valueOf(i);
            int i21 = a;
            int i22 = i21 & 11;
            int i23 = (i21 | 11) & (~i22);
            int i24 = i22 << 1;
            int i25 = ((i23 | i24) << 1) - (i23 ^ i24);
            b = i25 % 128;
            int i26 = i25 % 2;
            objArr[4] = numValueOf;
            objArr[5] = Integer.valueOf(i2);
            int i27 = a;
            int i28 = (((i27 & (-54)) | ((~i27) & 53)) - (~((i27 & 53) << 1))) - 1;
            b = i28 % 128;
            int i29 = i28 % 2;
            objArr[6] = Integer.valueOf(i3);
            int i30 = a;
            int i31 = (i30 ^ 77) + ((i30 & 77) << 1);
            b = i31 % 128;
            if (i31 % 2 != 0) {
                objArr[7] = fontVariationAxisArr;
                throw null;
            }
            objArr[7] = fontVariationAxisArr;
            Boolean bool = (Boolean) method.invoke(obj, objArr);
            int i32 = a;
            int i33 = i32 & 47;
            int i34 = -(-((i32 ^ 47) | i33));
            int i35 = ((i33 | i34) << 1) - (i34 ^ i33);
            b = i35 % 128;
            int i36 = i35 % 2;
            boolean zBooleanValue = bool.booleanValue();
            int i37 = a;
            int i38 = (i37 ^ 123) + ((i37 & 123) << 1);
            b = i38 % 128;
            if (i38 % 2 != 0) {
                int i39 = 3 / 0;
            }
            return zBooleanValue;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final void o(Object obj) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 41) << 1) - (i2 ^ 41);
        b = i3 % 128;
        try {
            if (i3 % 2 != 0) {
                this.n.invoke(obj, new Object[0]);
            } else {
                this.n.invoke(obj, new Object[0]);
            }
            int i4 = b + 37;
            a = i4 % 128;
            int i5 = i4 % 2;
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean q(Object obj) {
        boolean zBooleanValue;
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & 66) + (i2 | 66)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        try {
            Object objInvoke = this.m.invoke(obj, new Object[0]);
            int i5 = a;
            int i6 = ((i5 | 13) << 1) - (i5 ^ 13);
            b = i6 % 128;
            if (i6 % 2 != 0) {
                zBooleanValue = ((Boolean) objInvoke).booleanValue();
                int i7 = 18 / 0;
            } else {
                zBooleanValue = ((Boolean) objInvoke).booleanValue();
            }
            int i8 = a + 47;
            b = i8 % 128;
            if (i8 % 2 == 0) {
                return zBooleanValue;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean r() {
        boolean z;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 94) + ((i2 & 94) << 1);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        int i5 = i4 % 128;
        b = i5;
        int i6 = i4 % 2;
        if (this.i != null) {
            int i7 = i5 ^ 21;
            int i8 = (((i5 & 21) | i7) << 1) - i7;
            a = i8 % 128;
            int i9 = i8 % 2;
            int i10 = (i5 & (-126)) | ((~i5) & 125);
            int i11 = (i5 & 125) << 1;
            int i12 = (i10 & i11) + (i10 | i11);
            a = i12 % 128;
            int i13 = i12 % 2;
            z = true;
        } else {
            int i14 = (i5 & 57) + (i5 | 57);
            a = i14 % 128;
            int i15 = i14 % 2;
            z = false;
        }
        int i16 = i5 | 69;
        int i17 = ((i16 << 1) - (~(-((~(i5 & 69)) & i16)))) - 1;
        a = i17 % 128;
        if (i17 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public Method s(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2;
        char c;
        char c2;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 103;
        a = i3 % 128;
        int i4 = i3 % 2;
        Class<?>[] clsArr = new Class[8];
        clsArr[0] = AssetManager.class;
        int i5 = (((i2 ^ 51) | (i2 & 51)) << 1) - (((~i2) & 51) | (i2 & (-52)));
        a = i5 % 128;
        if (i5 % 2 == 0) {
            clsArr[1] = String.class;
            cls2 = Integer.TYPE;
            clsArr[5] = cls2;
            c = 4;
        } else {
            clsArr[1] = String.class;
            cls2 = Integer.TYPE;
            clsArr[2] = cls2;
            c = 3;
        }
        int i6 = a;
        int i7 = i6 & 55;
        int i8 = (((i6 ^ 55) | i7) << 1) - ((i6 | 55) & (~i7));
        b = i8 % 128;
        if (i8 % 2 != 0) {
            clsArr[c] = Boolean.TYPE;
            clsArr[3] = cls2;
            clsArr[3] = cls2;
            c2 = 'T';
        } else {
            clsArr[c] = Boolean.TYPE;
            clsArr[4] = cls2;
            clsArr[5] = cls2;
            c2 = 6;
        }
        clsArr[c2] = cls2;
        clsArr[7] = FontVariationAxis[].class;
        int i9 = a;
        int i10 = ((i9 ^ 49) | (i9 & 49)) << 1;
        int i11 = -(((~i9) & 49) | (i9 & (-50)));
        int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
        b = i12 % 128;
        int i13 = i12 % 2;
        Method method = cls.getMethod("addFontFromAssetManager", clsArr);
        if (i13 != 0) {
            int i14 = 48 / 0;
        }
        return method;
    }

    public Method t(Class<?> cls) throws NoSuchMethodException {
        Class<?>[] clsArr;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 115) + ((i2 & 115) << 1);
        a = i3 % 128;
        char c = 5;
        if (i3 % 2 == 0) {
            clsArr = new Class[5];
            clsArr[0] = ByteBuffer.class;
        } else {
            clsArr = new Class[5];
            clsArr[0] = ByteBuffer.class;
        }
        Class<?> cls2 = Integer.TYPE;
        int i4 = b + 42;
        int i5 = (i4 ^ (-1)) + (i4 << 1);
        a = i5 % 128;
        if (i5 % 2 == 0) {
            clsArr[0] = cls2;
            clsArr[5] = FontVariationAxis[].class;
            clsArr[3] = cls2;
        } else {
            clsArr[1] = cls2;
            clsArr[2] = FontVariationAxis[].class;
            clsArr[3] = cls2;
            c = 4;
        }
        clsArr[c] = cls2;
        Method method = cls.getMethod("addFontFromBuffer", clsArr);
        int i6 = b;
        int i7 = (((i6 | 48) << 1) - (i6 ^ 48)) - 1;
        a = i7 % 128;
        int i8 = i7 % 2;
        return method;
    }

    public Typeface p(Object obj) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (-2) - (((i2 & 38) + (i2 | 38)) ^ (-1));
        b = i3 % 128;
        int i4 = i3 % 2;
        try {
            Object objNewInstance = Array.newInstance(this.j, 1);
            int i5 = b + 122;
            int i6 = (i5 ^ (-1)) + (i5 << 1);
            a = i6 % 128;
            int i7 = i6 % 2;
            Array.set(objNewInstance, 0, obj);
            Method method = this.f67o;
            Object[] objArr = new Object[3];
            int i8 = b;
            int i9 = ((i8 | 53) << 1) - (i8 ^ 53);
            a = i9 % 128;
            int i10 = i9 % 2;
            objArr[0] = objNewInstance;
            int i11 = a;
            int i12 = i11 & 1;
            int i13 = (i11 | 1) & (~i12);
            int i14 = -(-(i12 << 1));
            int i15 = ((i13 | i14) << 1) - (i13 ^ i14);
            b = i15 % 128;
            int i16 = i15 % 2;
            objArr[1] = -1;
            objArr[2] = -1;
            int i17 = a;
            int i18 = i17 & 77;
            int i19 = (i17 ^ 77) | i18;
            int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
            b = i20 % 128;
            int i21 = i20 % 2;
            Typeface typeface = (Typeface) method.invoke(null, objArr);
            int i22 = b;
            int i23 = i22 & 27;
            int i24 = (((i22 ^ 27) | i23) << 1) - ((i22 | 27) & (~i23));
            a = i24 % 128;
            int i25 = i24 % 2;
            return typeface;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        if ((r11 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r11 = 31 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        r11 = j();
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        if (r11 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        r10 = ivas.gov.bisp.enumeration.p007ag.z.b + 21;
        ivas.gov.bisp.enumeration.p007ag.z.a = r10 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
    
        if ((r10 % 2) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        r10 = 22 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        if (k(r10, r11, r13, 0, -1, -1, null) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if ((!q(r11)) == true) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        r10 = p(r11);
        r11 = ivas.gov.bisp.enumeration.p007ag.z.a + 3;
        ivas.gov.bisp.enumeration.p007ag.z.b = r11 % 128;
        r11 = r11 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0072, code lost:
    
        r10 = ivas.gov.bisp.enumeration.p007ag.z.b;
        r11 = (r10 & (-114)) | ((~r10) & 113);
        r14 = (r10 & 113) << 1;
        r1 = (r11 ^ r14) + ((r11 & r14) << 1);
        ivas.gov.bisp.enumeration.p007ag.z.a = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0087, code lost:
    
        if ((r1 % 2) == 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0089, code lost:
    
        r11 = (r10 & 41) + (r10 | 41);
        ivas.gov.bisp.enumeration.p007ag.z.a = r11 % 128;
        r11 = r11 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0093, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0094, code lost:
    
        r12.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0097, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0098, code lost:
    
        r10 = ivas.gov.bisp.enumeration.p007ag.z.a;
        r14 = ((r10 & 86) + (r10 | 86)) - 1;
        ivas.gov.bisp.enumeration.p007ag.z.b = r14 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a5, code lost:
    
        if ((r14 % 2) != 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a7, code lost:
    
        o(r11);
        r10 = ivas.gov.bisp.enumeration.p007ag.z.b;
        r11 = (((r10 & (-94)) | ((~r10) & 93)) - (~(-(-((r10 & 93) << 1))))) - 1;
        ivas.gov.bisp.enumeration.p007ag.z.a = r11 % 128;
        r11 = r11 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bf, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c0, code lost:
    
        o(r11);
        r12.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c6, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (r() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        r10 = super.f(r10, r11, r12, r13, r14);
        r11 = ivas.gov.bisp.enumeration.p007ag.z.b + 33;
        ivas.gov.bisp.enumeration.p007ag.z.a = r11 % 128;
     */
    @Override // ivas.gov.bisp.enumeration.p007ag.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.graphics.Typeface f(android.content.Context r10, android.content.res.Resources r11, int r12, java.lang.String r13, int r14) {
        /*
            r9 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.p007ag.z.b
            int r1 = r1 + 66
            r1 = r1 ^ (-1)
            int r1 = (-2) - r1
            int r2 = r1 % 128
            ivas.gov.bisp.enumeration.p007ag.z.a = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L1d
            boolean r1 = r9.r()
            r2 = 35
            int r2 = r2 / 0
            if (r1 != 0) goto L37
            goto L23
        L1d:
            boolean r1 = r9.r()
            if (r1 != 0) goto L37
        L23:
            android.graphics.Typeface r10 = super.f(r10, r11, r12, r13, r14)
            int r11 = ivas.gov.bisp.enumeration.p007ag.z.b
            int r11 = r11 + 33
            int r12 = r11 % 128
            ivas.gov.bisp.enumeration.p007ag.z.a = r12
            int r11 = r11 % r0
            if (r11 != 0) goto L36
            r11 = 31
            int r11 = r11 / 0
        L36:
            return r10
        L37:
            java.lang.Object r11 = r9.j()
            r12 = 0
            if (r11 != 0) goto L4e
            int r10 = ivas.gov.bisp.enumeration.p007ag.z.b
            int r10 = r10 + 21
            int r11 = r10 % 128
            ivas.gov.bisp.enumeration.p007ag.z.a = r11
            int r10 = r10 % r0
            if (r10 != 0) goto L4d
            r10 = 22
            int r10 = r10 / 0
        L4d:
            return r12
        L4e:
            r5 = 0
            r6 = -1
            r7 = -1
            r8 = 0
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r13
            boolean r10 = r1.k(r2, r3, r4, r5, r6, r7, r8)
            r13 = 1
            if (r10 == 0) goto L98
            boolean r10 = r9.q(r11)
            r10 = r10 ^ r13
            if (r10 == r13) goto L72
            android.graphics.Typeface r10 = r9.p(r11)
            int r11 = ivas.gov.bisp.enumeration.p007ag.z.a
            int r11 = r11 + 3
            int r12 = r11 % 128
            ivas.gov.bisp.enumeration.p007ag.z.b = r12
            int r11 = r11 % r0
            return r10
        L72:
            int r10 = ivas.gov.bisp.enumeration.p007ag.z.b
            r11 = r10 & (-114(0xffffffffffffff8e, float:NaN))
            int r14 = ~r10
            r14 = r14 & 113(0x71, float:1.58E-43)
            r11 = r11 | r14
            r14 = r10 & 113(0x71, float:1.58E-43)
            int r14 = r14 << r13
            r1 = r11 ^ r14
            r11 = r11 & r14
            int r11 = r11 << r13
            int r1 = r1 + r11
            int r11 = r1 % 128
            ivas.gov.bisp.enumeration.p007ag.z.a = r11
            int r1 = r1 % r0
            if (r1 == 0) goto L94
            r11 = r10 & 41
            r10 = r10 | 41
            int r11 = r11 + r10
            int r10 = r11 % 128
            ivas.gov.bisp.enumeration.p007ag.z.a = r10
            int r11 = r11 % r0
            return r12
        L94:
            r12.hashCode()
            throw r12
        L98:
            int r10 = ivas.gov.bisp.enumeration.p007ag.z.a
            r14 = r10 & 86
            r10 = r10 | 86
            int r14 = r14 + r10
            int r14 = r14 - r13
            int r10 = r14 % 128
            ivas.gov.bisp.enumeration.p007ag.z.b = r10
            int r14 = r14 % r0
            if (r14 != 0) goto Lc0
            r9.o(r11)
            int r10 = ivas.gov.bisp.enumeration.p007ag.z.b
            r11 = r10 & (-94)
            int r14 = ~r10
            r14 = r14 & 93
            r11 = r11 | r14
            r10 = r10 & 93
            int r10 = r10 << r13
            int r10 = -r10
            int r10 = -r10
            int r10 = ~r10
            int r11 = r11 - r10
            int r11 = r11 - r13
            int r10 = r11 % 128
            ivas.gov.bisp.enumeration.p007ag.z.a = r10
            int r11 = r11 % r0
            return r12
        Lc0:
            r9.o(r11)
            r12.hashCode()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p007ag.z.f(android.content.Context, android.content.res.Resources, int, java.lang.String, int):android.graphics.Typeface");
    }

    public Method u(Class<?> cls) throws NoSuchMethodException {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 51;
        int i4 = (i2 ^ 51) | i3;
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        Object objNewInstance = Array.newInstance(cls, 1);
        Class[] clsArr = new Class[3];
        int i7 = a;
        int i8 = i7 & 119;
        int i9 = -(-(i7 | 119));
        int i10 = (i8 & i9) + (i9 | i8);
        b = i10 % 128;
        if (i10 % 2 != 0) {
            clsArr[1] = objNewInstance.getClass();
        } else {
            clsArr[0] = objNewInstance.getClass();
        }
        Class cls2 = Integer.TYPE;
        int i11 = a;
        int i12 = ((i11 & 22) + (i11 | 22)) - 1;
        b = i12 % 128;
        if (i12 % 2 != 0) {
            clsArr[1] = cls2;
            clsArr[2] = cls2;
        } else {
            clsArr[1] = cls2;
            clsArr[2] = cls2;
        }
        int i13 = i11 + 69;
        b = i13 % 128;
        int i14 = i13 % 2;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", clsArr);
        declaredMethod.setAccessible(true);
        int i15 = a;
        int i16 = (((i15 | 9) << 1) - (~(-(i15 ^ 9)))) - 1;
        b = i16 % 128;
        if (i16 % 2 == 0) {
            return declaredMethod;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p007ag.i, ivas.gov.bisp.enumeration.p007ag.u
    public Typeface c(Context context, M.aUO auo, Resources resources, int i) {
        int i2 = 2 % 2;
        int i3 = b + 28;
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        if (!r()) {
            int i6 = a;
            int i7 = (((i6 | 100) << 1) - (i6 ^ 100)) - 1;
            b = i7 % 128;
            int i8 = i7 % 2;
            Typeface typefaceC = super.c(context, auo, resources, i);
            int i9 = b;
            int i10 = (i9 & (-100)) | ((~i9) & 99);
            int i11 = -(-((99 & i9) << 1));
            int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
            a = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 89 / 0;
            }
            return typefaceC;
        }
        Object objJ = j();
        Object obj = null;
        if (objJ == null) {
            int i14 = b;
            int i15 = ((i14 | 99) << 1) - (i14 ^ 99);
            int i16 = i15 % 128;
            a = i16;
            int i17 = i15 % 2;
            int i18 = i16 & 125;
            int i19 = (((i16 ^ 125) | i18) << 1) - ((i16 | 125) & (~i18));
            b = i19 % 128;
            int i20 = i19 % 2;
            return null;
        }
        M.aUP[] aupArr = auo.a;
        int length = aupArr.length;
        int i21 = a;
        int i22 = ((i21 | 5) << 1) - (i21 ^ 5);
        b = i22 % 128;
        int i23 = i22 % 2;
        int i24 = 0;
        while (i24 < length) {
            int i25 = b;
            int i26 = ((i25 & 15) - (~(-(-(i25 | 15))))) - 1;
            a = i26 % 128;
            int i27 = i26 % 2;
            M.aUP aup = aupArr[i24];
            String str = aup.a;
            int i28 = a + 47;
            b = i28 % 128;
            if (i28 % 2 != 0) {
                int i29 = aup.f;
                int i30 = aup.b;
                obj.hashCode();
                throw null;
            }
            int i31 = aup.f;
            int i32 = aup.b;
            int i33 = a;
            int i34 = ((i33 | 2) << 1) - (i33 ^ 2);
            int i35 = (i34 ^ (-1)) + (i34 << 1);
            b = i35 % 128;
            if (i35 % 2 != 0) {
                boolean z = aup.c;
                FontVariationAxis.fromFontVariationSettings(aup.d);
                obj.hashCode();
                throw null;
            }
            boolean z2 = aup.c;
            FontVariationAxis[] fontVariationAxisArrFromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(aup.d);
            int i36 = a;
            int i37 = i36 & 11;
            int i38 = i36 | 11;
            int i39 = (i37 & i38) + (i38 | i37);
            b = i39 % 128;
            int i40 = i39 % 2;
            int i41 = i24;
            if (!k(context, objJ, str, i31, i32, z2 ? 1 : 0, fontVariationAxisArrFromFontVariationSettings)) {
                int i42 = a;
                int i43 = i42 & 47;
                int i44 = i42 | 47;
                int i45 = ((i43 | i44) << 1) - (i44 ^ i43);
                b = i45 % 128;
                if (i45 % 2 != 0) {
                    o(objJ);
                    int i46 = 58 / 0;
                } else {
                    o(objJ);
                }
                return null;
            }
            int i47 = (i41 ^ 53) + ((i41 & 53) << 1);
            i24 = (i47 & (-52)) + (i47 | (-52));
            int i48 = a;
            int i49 = ((i48 ^ 33) | (i48 & 33)) << 1;
            int i50 = -(((~i48) & 33) | (i48 & (-34)));
            int i51 = (i49 & i50) + (i50 | i49);
            b = i51 % 128;
            int i52 = i51 % 2;
        }
        if (q(objJ)) {
            Typeface typefaceP = p(objJ);
            int i53 = b + 95;
            a = i53 % 128;
            if (i53 % 2 != 0) {
                return typefaceP;
            }
            throw null;
        }
        int i54 = b;
        int i55 = ((i54 & (-114)) | ((~i54) & 113)) + ((i54 & 113) << 1);
        a = i55 % 128;
        int i56 = i55 % 2;
        int i57 = ((i54 & 124) + (i54 | 124)) - 1;
        a = i57 % 128;
        if (i57 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a9 A[Catch: IOException -> 0x0147, TRY_ENTER, TRY_LEAVE, TryCatch #1 {IOException -> 0x0147, blocks: (B:16:0x0067, B:18:0x006b, B:26:0x008a, B:34:0x00a9, B:48:0x0122, B:61:0x0146, B:60:0x0143, B:24:0x0078, B:56:0x013d, B:41:0x00d9, B:43:0x00eb, B:45:0x00fe, B:47:0x011e), top: B:155:0x005d, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01cc  */
    @Override // ivas.gov.bisp.enumeration.p007ag.i, ivas.gov.bisp.enumeration.p007ag.u
    public Typeface d(Context context, CancellationSignal cancellationSignal, N[] nArr, int i) throws Throwable {
        char c;
        N nG;
        ContentResolver contentResolver;
        Uri uri;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 15;
        int i5 = (i3 ^ 15) | i4;
        int i6 = 1;
        int i7 = ((i4 | i5) << 1) - (i5 ^ i4);
        int i8 = i7 % 128;
        b = i8;
        int i9 = i7 % 2;
        Throwable th = null;
        if (nArr.length <= 0) {
            int i10 = (i8 & (-18)) | ((~i8) & 17);
            int i11 = (i8 & 17) << 1;
            int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
            int i13 = i12 % 128;
            a = i13;
            if (i12 % 2 == 0) {
                throw null;
            }
            int i14 = ((i13 | 43) << 1) - (((~i13) & 43) | (i13 & (-44)));
            b = i14 % 128;
            if (i14 % 2 != 0) {
                int i15 = 89 / 0;
            }
            return null;
        }
        if (!r()) {
            int i16 = b + 49;
            a = i16 % 128;
            try {
                if (i16 % 2 == 0) {
                    nG = g(nArr, i);
                    contentResolver = context.getContentResolver();
                    uri = nG.a;
                    int i17 = 95 / 0;
                } else {
                    nG = g(nArr, i);
                    contentResolver = context.getContentResolver();
                    uri = nG.a;
                }
                int i18 = a;
                int i19 = i18 & 73;
                int i20 = i18 | 73;
                int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
                b = i21 % 128;
                int i22 = i21 % 2;
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r", cancellationSignal);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    int i23 = (-2) - ((b + 124) ^ (-1));
                    a = i23 % 128;
                    if (i23 % 2 == 0) {
                        int i24 = 66 / 0;
                        if (parcelFileDescriptorOpenFileDescriptor != null) {
                            parcelFileDescriptorOpenFileDescriptor.close();
                            int i25 = b;
                            int i26 = (i25 & (-102)) | ((~i25) & 101);
                            int i27 = -(-((i25 & 101) << 1));
                            int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
                            a = i28 % 128;
                            int i29 = i28 % 2;
                        }
                    } else if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        int i210 = b;
                        int i211 = (i210 & (-102)) | ((~i210) & 101);
                        int i212 = -(-((i210 & 101) << 1));
                        int i213 = (i211 ^ i212) + ((i212 & i211) << 1);
                        a = i213 % 128;
                        int i214 = i213 % 2;
                    }
                    int i30 = a;
                    int i31 = i30 & 55;
                    int i32 = (i31 - (~((i30 ^ 55) | i31))) - 1;
                    b = i32 % 128;
                    if (i32 % 2 == 0) {
                        return null;
                    }
                    th.hashCode();
                    throw null;
                }
                try {
                    Typeface.Builder builder = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    int i33 = a + 13;
                    b = i33 % 128;
                    int i34 = i33 % 2;
                    Typeface.Builder weight = builder.setWeight(nG.c);
                    int i35 = (-2) - ((b + 12) ^ (-1));
                    a = i35 % 128;
                    int i36 = i35 % 2;
                    Typeface.Builder italic = weight.setItalic(nG.d);
                    int i37 = b;
                    int i38 = ((i37 ^ 79) | (i37 & 79)) << 1;
                    int i39 = -(((~i37) & 79) | (i37 & (-80)));
                    int i40 = (i38 ^ i39) + ((i39 & i38) << 1);
                    a = i40 % 128;
                    int i41 = i40 % 2;
                    Typeface typefaceBuild = italic.build();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    int i42 = b;
                    int i43 = i42 & 19;
                    int i44 = (i43 - (~((i42 ^ 19) | i43))) - 1;
                    a = i44 % 128;
                    if (i44 % 2 != 0) {
                        return typefaceBuild;
                    }
                    th.hashCode();
                    throw null;
                } catch (Throwable th2) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap map = new HashMap();
        int length = nArr.length;
        int i45 = b;
        int i46 = (i45 ^ 62) + ((i45 & 62) << 1);
        int i47 = (i46 ^ (-1)) + (i46 << 1);
        a = i47 % 128;
        int i48 = i47 % 2;
        int i49 = i45 & 103;
        int i50 = (((i45 | 103) & (~i49)) - (~(-(-(i49 << 1))))) - 1;
        a = i50 % 128;
        char c2 = 5;
        if (i50 % 2 == 0) {
            int i51 = 5 % 5;
        }
        int i52 = 0;
        while (i52 < length) {
            int i53 = a + 49;
            b = i53 % 128;
            if (i53 % 2 != 0) {
                int i54 = nArr[i52].e;
                th.hashCode();
                throw null;
            }
            N n = nArr[i52];
            if (n.e == 0) {
                Uri uri2 = n.a;
                if (!map.containsKey(uri2)) {
                    int i55 = b;
                    int i56 = (((i55 & (-106)) | ((~i55) & 105)) - (~(-(-((i55 & 105) << 1))))) - 1;
                    a = i56 % 128;
                    int i57 = i56 % 2;
                    ByteBuffer byteBufferE = l.e(context, cancellationSignal, uri2);
                    int i58 = b;
                    int i59 = i58 ^ 37;
                    int i60 = ((i59 | (i58 & 37)) << 1) - i59;
                    a = i60 % 128;
                    int i61 = i60 % 2;
                    map.put(uri2, byteBufferE);
                    int i62 = b + 77;
                    a = i62 % 128;
                    int i63 = i62 % 2;
                }
            }
            int i64 = (i52 & (-2)) | ((~i52) & 1);
            int i65 = -(-((i52 & 1) << 1));
            i52 = (i64 & i65) + (i64 | i65);
            int i66 = b;
            int i67 = i66 ^ 65;
            int i68 = (i66 & 65) << 1;
            int i69 = (i67 & i68) + (i68 | i67);
            a = i69 % 128;
            int i70 = i69 % 2;
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
        Object objJ = j();
        if (objJ == null) {
            int i71 = a;
            int i72 = ((((i71 ^ 29) | (i71 & 29)) << 1) - (~(-(((~i71) & 29) | (i71 & (-30)))))) - 1;
            int i73 = i72 % 128;
            b = i73;
            if (i72 % 2 != 0) {
                th.hashCode();
                throw null;
            }
            int i74 = i73 + 119;
            a = i74 % 128;
            if (i74 % 2 != 0) {
                return null;
            }
            th.hashCode();
            throw null;
        }
        int length2 = nArr.length;
        int i75 = b;
        int i76 = ((i75 | 80) << 1) - (i75 ^ 80);
        int i77 = (i76 ^ (-1)) + (i76 << 1);
        a = i77 % 128;
        int i78 = i77 % 2;
        int i79 = 0;
        boolean z = false;
        while (true) {
            if (i79 >= length2) {
                if (!z) {
                    int i80 = (-2) - ((a + 82) ^ (-1));
                    b = i80 % 128;
                    if (i80 % 2 != 0) {
                        o(objJ);
                        int i81 = 74 / 0;
                    } else {
                        o(objJ);
                    }
                    int i82 = b;
                    int i83 = ((i82 ^ 60) + ((i82 & 60) << 1)) - 1;
                    a = i83 % 128;
                    int i84 = i83 % 2;
                    return null;
                }
                if (!q(objJ)) {
                    int i85 = a;
                    int i86 = (i85 & (-50)) | ((~i85) & 49);
                    int i87 = (i85 & 49) << 1;
                    int i88 = (i86 ^ i87) + ((i87 & i86) << 1);
                    int i89 = i88 % 128;
                    b = i89;
                    int i90 = i88 % 2;
                    int i91 = i89 | 43;
                    int i92 = (i91 << 1) - ((~(i89 & 43)) & i91);
                    a = i92 % 128;
                    if (i92 % 2 != 0) {
                        return null;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Typeface typefaceP = p(objJ);
                if (typefaceP != null) {
                    Typeface typefaceCreate = Typeface.create(typefaceP, i);
                    int i93 = a;
                    int i94 = ((i93 | 53) << 1) - (i93 ^ 53);
                    b = i94 % 128;
                    int i95 = i94 % 2;
                    return typefaceCreate;
                }
                int i96 = b;
                int i97 = i96 & 27;
                int i98 = (i96 | 27) & (~i97);
                int i99 = -(-(i97 << 1));
                int i100 = (i98 ^ i99) + ((i98 & i99) << 1);
                int i101 = i100 % 128;
                a = i101;
                if (i100 % 2 == 0) {
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                int i102 = i101 & 27;
                int i103 = (i101 ^ 27) | i102;
                int i104 = (i102 ^ i103) + ((i103 & i102) << 1);
                b = i104 % 128;
                int i105 = i104 % 2;
                return null;
            }
            int i106 = a + 107;
            b = i106 % 128;
            if (i106 % 2 != 0) {
                Uri uri3 = nArr[i79].a;
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            N n2 = nArr[i79];
            ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(n2.a);
            if (byteBuffer != null) {
                int i107 = a;
                int i108 = (i107 & 29) + (i107 | 29);
                b = i108 % 128;
                if (i108 % 2 != 0) {
                    Throwable th4 = th;
                    int i109 = n2.b;
                    int i110 = n2.c;
                    throw th4;
                }
                int i111 = n2.b;
                int i112 = n2.c;
                int i113 = b + 83;
                a = i113 % 128;
                int i114 = i113 % 2;
                boolean z2 = n2.d;
                try {
                    Method method = this.l;
                    int i115 = b;
                    int i116 = i115 & 57;
                    int i117 = -(-((i115 ^ 57) | i116));
                    int i118 = (i116 ^ i117) + ((i116 & i117) << i6);
                    a = i118 % 128;
                    int i119 = i118 % 2;
                    c = 5;
                    Object[] objArr = new Object[5];
                    objArr[0] = byteBuffer;
                    int i120 = (i115 ^ 31) + ((i115 & 31) << 1);
                    a = i120 % 128;
                    int i121 = i120 % 2;
                    objArr[1] = Integer.valueOf(i111);
                    objArr[2] = null;
                    int i122 = a;
                    int i123 = (((i122 | 30) << 1) - (i122 ^ 30)) - 1;
                    b = i123 % 128;
                    if (i123 % 2 != 0) {
                        objArr[3] = Integer.valueOf(i112);
                        objArr[3] = Integer.valueOf(z2 ? 1 : 0);
                    } else {
                        objArr[3] = Integer.valueOf(i112);
                        objArr[4] = Integer.valueOf(z2 ? 1 : 0);
                    }
                    int i124 = a;
                    int i125 = i124 & 93;
                    int i126 = (i124 | 93) & (~i125);
                    int i127 = -(-(i125 << 1));
                    int i128 = (i126 ^ i127) + ((i126 & i127) << 1);
                    b = i128 % 128;
                    int i129 = i128 % 2;
                    boolean zBooleanValue = ((Boolean) method.invoke(objJ, objArr)).booleanValue();
                    int i130 = b;
                    int i131 = (((i130 ^ 95) | (i130 & 95)) << 1) - (((~i130) & 95) | (i130 & (-96)));
                    int i132 = i131 % 128;
                    a = i132;
                    int i133 = i131 % 2;
                    if (!zBooleanValue) {
                        break;
                    }
                    int i134 = ((i132 & 56) + (i132 | 56)) - 1;
                    b = i134 % 128;
                    int i135 = i134 % 2;
                    z = true;
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            } else {
                c = c2;
            }
            int i136 = i79 & 17;
            int i137 = ((i79 ^ 17) | i136) << 1;
            int i138 = -((i79 | 17) & (~i136));
            int i139 = ((i137 | i138) << 1) - (i138 ^ i137);
            i79 = (-2) - ((((i139 | (-15)) << 1) - (i139 ^ (-15))) ^ (-1));
            int i140 = a;
            int i141 = (i140 & (-10)) | ((~i140) & 9);
            int i142 = (i140 & 9) << 1;
            int i143 = (i141 ^ i142) + ((i142 & i141) << 1);
            b = i143 % 128;
            int i144 = i143 % 2;
            c2 = c;
            i6 = 1;
            th = null;
        }
        int i145 = b + 49;
        a = i145 % 128;
        if (i145 % 2 == 0) {
            o(objJ);
            int i146 = 88 / 0;
        } else {
            o(objJ);
        }
        int i147 = b;
        int i148 = i147 ^ 85;
        int i149 = ((((i147 & 85) | i148) << 1) - (~(-i148))) - 1;
        a = i149 % 128;
        int i150 = i149 % 2;
        return null;
    }
}
