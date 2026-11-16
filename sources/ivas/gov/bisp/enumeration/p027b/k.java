package ivas.gov.bisp.enumeration.p027b;

import android.app.Application;
import ivas.gov.bisp.enumeration.p100w.r;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public class k extends r {
    private static int a = 1;
    private static int b;
    public static k u;
    public Application v;

    public k(Application application) {
        this.v = application;
    }

    @Override // ivas.gov.bisp.enumeration.p100w.r, ivas.gov.bisp.enumeration.p027b.w
    public <T extends ap> T b(Class<T> cls) {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-34)) | ((~i2) & 33);
        int i4 = (i2 & 33) << 1;
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            ae.class.isAssignableFrom(cls);
            throw null;
        }
        if (!ae.class.isAssignableFrom(cls)) {
            T t = (T) super.b(cls);
            int i6 = a;
            int i7 = i6 & 11;
            int i8 = -(-(i6 | 11));
            int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
            b = i9 % 128;
            int i10 = i9 % 2;
            return t;
        }
        try {
            Constructor<T> constructor = cls.getConstructor(Application.class);
            int i11 = a;
            int i12 = i11 & 57;
            int i13 = (i11 ^ 57) | i12;
            int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
            b = i14 % 128;
            if (i14 % 2 != 0) {
                objArr = new Object[0];
                objArr[1] = this.v;
            } else {
                objArr = new Object[]{this.v};
            }
            T tNewInstance = constructor.newInstance(objArr);
            int i15 = b;
            int i16 = i15 & 111;
            int i17 = (i15 | 111) & (~i16);
            int i18 = -(-(i16 << 1));
            int i19 = (i17 ^ i18) + ((i17 & i18) << 1);
            a = i19 % 128;
            if (i19 % 2 != 0) {
                return tNewInstance;
            }
            obj.hashCode();
            throw null;
        } catch (IllegalAccessException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot create an instance of ");
            sb.append(cls);
            throw new RuntimeException(sb.toString(), e);
        } catch (InstantiationException e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot create an instance of ");
            sb2.append(cls);
            throw new RuntimeException(sb2.toString(), e2);
        } catch (NoSuchMethodException e3) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Cannot create an instance of ");
            sb3.append(cls);
            throw new RuntimeException(sb3.toString(), e3);
        } catch (InvocationTargetException e4) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Cannot create an instance of ");
            sb4.append(cls);
            throw new RuntimeException(sb4.toString(), e4);
        }
    }
}
