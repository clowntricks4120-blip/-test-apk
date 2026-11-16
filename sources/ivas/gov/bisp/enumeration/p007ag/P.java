package ivas.gov.bisp.enumeration.p007ag;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class P extends z {
    private static int a = 1;
    private static int b;

    @Override // ivas.gov.bisp.enumeration.p007ag.z
    public Typeface p(Object obj) {
        Method method;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 3;
        int i4 = i3 + ((i2 ^ 3) | i3);
        a = i4 % 128;
        try {
            Object objNewInstance = Array.newInstance(i4 % 2 == 0 ? this.j : this.j, 1);
            int i5 = a;
            int i6 = (i5 & 107) + (i5 | 107);
            b = i6 % 128;
            if (i6 % 2 != 0) {
                Array.set(objNewInstance, 0, obj);
                method = this.f67o;
            } else {
                Array.set(objNewInstance, 0, obj);
                method = this.f67o;
            }
            Object[] objArr = new Object[4];
            int i7 = b;
            int i8 = (-2) - (((i7 ^ 68) + ((i7 & 68) << 1)) ^ (-1));
            int i9 = i8 % 128;
            a = i9;
            int i10 = i8 % 2;
            objArr[0] = objNewInstance;
            objArr[1] = "sans-serif";
            int i11 = ((i9 | 97) << 1) - (i9 ^ 97);
            b = i11 % 128;
            if (i11 % 2 != 0) {
                objArr[2] = -1;
                objArr[2] = -1;
            } else {
                objArr[2] = -1;
                objArr[3] = -1;
            }
            Typeface typeface = (Typeface) method.invoke(null, objArr);
            int i12 = a;
            int i13 = (((i12 & (-98)) | ((~i12) & 97)) - (~((i12 & 97) << 1))) - 1;
            b = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 89 / 0;
            }
            return typeface;
        } catch (IllegalAccessException e) {
            e = e;
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            e = e2;
            throw new RuntimeException(e);
        }
    }

    @Override // ivas.gov.bisp.enumeration.p007ag.z
    public Method u(Class<?> cls) throws NoSuchMethodException {
        Object objNewInstance;
        int i;
        int i2 = 2 % 2;
        int i3 = a + 107;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            objNewInstance = Array.newInstance(cls, 1);
            i = 5;
        } else {
            objNewInstance = Array.newInstance(cls, 1);
            i = 4;
        }
        Class[] clsArr = new Class[i];
        int i4 = a + 61;
        b = i4 % 128;
        int i5 = i4 % 2;
        clsArr[0] = objNewInstance.getClass();
        int i6 = a;
        int i7 = (i6 | 115) << 1;
        int i8 = -(((~i6) & 115) | (i6 & (-116)));
        int i9 = (i7 & i8) + (i8 | i7);
        b = i9 % 128;
        int i10 = i9 % 2;
        clsArr[1] = String.class;
        Class cls2 = Integer.TYPE;
        clsArr[2] = cls2;
        int i11 = a;
        int i12 = i11 & 73;
        int i13 = (((i11 | 73) & (~i12)) - (~(i12 << 1))) - 1;
        b = i13 % 128;
        if (i13 % 2 != 0) {
            clsArr[3] = cls2;
            Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", clsArr);
            throw null;
        }
        clsArr[3] = cls2;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", clsArr);
        declaredMethod.setAccessible(true);
        int i14 = a;
        int i15 = i14 ^ 79;
        int i16 = (i14 & 79) << 1;
        int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
        b = i17 % 128;
        if (i17 % 2 == 0) {
            return declaredMethod;
        }
        throw null;
    }
}
