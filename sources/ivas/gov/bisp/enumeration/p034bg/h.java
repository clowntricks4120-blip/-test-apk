package ivas.gov.bisp.enumeration.p034bg;

import ivas.gov.bisp.enumeration.p035bh.X;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class h extends c {
    private static int a = 1;
    private static int b;
    public static Class d;
    public final Object e;
    public final Field f;

    public h() {
        Object obj;
        Field declaredField = null;
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            d = cls;
            Field declaredField2 = cls.getDeclaredField("theUnsafe");
            declaredField2.setAccessible(true);
            obj = declaredField2.get(null);
            int i = 2 % 2;
        } catch (Exception unused) {
            obj = null;
        }
        this.e = obj;
        try {
            declaredField = AccessibleObject.class.getDeclaredField("override");
            int i2 = b + 123;
            a = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
        } catch (ArrayStoreException e) {
            throw e;
        } catch (NoSuchFieldException unused2) {
        }
        this.f = declaredField;
        int i4 = a;
        int i5 = i4 ^ 9;
        int i6 = ((((i4 & 9) | i5) << 1) - (~(-i5))) - 1;
        b = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 44 / 0;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p034bg.c
    public final void c(AccessibleObject accessibleObject) {
        Class cls;
        Class<?>[] clsArr;
        long jLongValue;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 11;
        int i4 = (~i3) & (i2 | 11);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        b = i6 % 128;
        try {
            if (i6 % 2 != 0) {
                if (this.e != null) {
                }
                int i7 = a + 13;
                b = i7 % 128;
                int i8 = i7 % 2;
                return;
            }
            if (this.e != null) {
            }
            int i9 = b;
            int i10 = (i9 & (-36)) | ((~i9) & 35);
            int i11 = -(-((i9 & 35) << 1));
            int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
            a = i12 % 128;
            int i13 = i12 % 2;
            accessibleObject.setAccessible(true);
            return;
            accessibleObject.setAccessible(true);
            return;
        } catch (SecurityException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Gson couldn't modify fields for ");
            sb.append(accessibleObject);
            sb.append("\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.");
            throw new X(sb.toString(), e);
        }
        int i14 = i2 & 5;
        int i15 = (i2 | 5) & (~i14);
        int i16 = i14 << 1;
        int i17 = (i15 & i16) + (i15 | i16);
        int i18 = i17 % 128;
        b = i18;
        int i19 = i17 % 2;
        if (this.f != null) {
            int i20 = i18 + 83;
            a = i20 % 128;
            try {
                if (i20 % 2 == 0) {
                    cls = d;
                    clsArr = new Class[]{Field.class};
                } else {
                    cls = d;
                    clsArr = new Class[]{Field.class};
                }
                int i21 = ((i18 ^ 40) + ((i18 & 40) << 1)) - 1;
                a = i21 % 128;
                Method method = i21 % 2 == 0 ? cls.getMethod("objectFieldOffset", clsArr) : cls.getMethod("objectFieldOffset", clsArr);
                Object obj = this.e;
                Object[] objArr = new Object[1];
                int i22 = b;
                int i23 = (i22 & 78) + (i22 | 78);
                int i24 = (i23 ^ (-1)) + (i23 << 1);
                a = i24 % 128;
                if (i24 % 2 == 0) {
                    objArr[0] = this.f;
                    jLongValue = ((Long) method.invoke(obj, objArr)).longValue();
                } else {
                    objArr[0] = this.f;
                    jLongValue = ((Long) method.invoke(obj, objArr)).longValue();
                }
                int i25 = b;
                int i26 = ((i25 ^ 47) | (i25 & 47)) << 1;
                int i27 = -((i25 & (-48)) | ((~i25) & 47));
                int i28 = (i26 ^ i27) + ((i26 & i27) << 1);
                a = i28 % 128;
                int i29 = i28 % 2;
                Class cls2 = d;
                Class<?>[] clsArr2 = new Class[3];
                clsArr2[0] = Object.class;
                int i30 = i25 + 97;
                a = i30 % 128;
                int i31 = i30 % 2;
                clsArr2[1] = Long.TYPE;
                clsArr2[2] = Boolean.TYPE;
                Method method2 = cls2.getMethod("putBoolean", clsArr2);
                int i32 = a;
                int i33 = i32 ^ 87;
                int i34 = -(-((i32 & 87) << 1));
                int i35 = ((i33 | i34) << 1) - (i34 ^ i33);
                int i36 = i35 % 128;
                b = i36;
                int i37 = i35 % 2;
                Object obj2 = this.e;
                Object[] objArr2 = new Object[3];
                objArr2[0] = accessibleObject;
                int i38 = i36 & 63;
                int i39 = i36 | 63;
                int i40 = ((i38 | i39) << 1) - (i38 ^ i39);
                a = i40 % 128;
                if (i40 % 2 == 0) {
                    objArr2[1] = Long.valueOf(jLongValue);
                    objArr2[5] = Boolean.TRUE;
                } else {
                    objArr2[1] = Long.valueOf(jLongValue);
                    objArr2[2] = Boolean.TRUE;
                }
                method2.invoke(obj2, objArr2);
                int i41 = a;
                int i42 = (i41 ^ 77) + ((i41 & 77) << 1);
                b = i42 % 128;
                if (i42 % 2 != 0) {
                    int i43 = 4 % 4;
                }
                int i44 = a + 13;
                b = i44 % 128;
                int i45 = i44 % 2;
                return;
            } catch (Exception unused) {
            }
        }
        int i46 = b;
        int i110 = (i46 & (-36)) | ((~i46) & 35);
        int i111 = -(-((i46 & 35) << 1));
        int i112 = ((i110 | i111) << 1) - (i111 ^ i110);
        a = i112 % 128;
        int i113 = i112 % 2;
    }
}
