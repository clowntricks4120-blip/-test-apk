package ivas.gov.bisp.enumeration.p075cu;

import java.security.AccessController;
import java.security.PrivilegedAction;

/* JADX INFO: loaded from: classes.dex */
public class P {
    private static int a = 1;
    private static int b;

    public static final class bBH implements PrivilegedAction {
        private static int a = 1;
        private static int b;
        public final /* synthetic */ String c;

        public bBH(String str) {
            this.c = str;
        }

        @Override // java.security.PrivilegedAction
        public final Object run() {
            int i = 2 % 2;
            int i2 = (-2) - ((b + 40) ^ (-1));
            a = i2 % 128;
            int i3 = i2 % 2;
            try {
                Class<?> cls = Class.forName(this.c);
                int i4 = a;
                int i5 = (((i4 | 104) << 1) - (i4 ^ 104)) - 1;
                b = i5 % 128;
                int i6 = i5 % 2;
                return cls;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public static Class b(Class cls, String str) {
        int i = 2 % 2;
        int i2 = b + 61;
        a = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        try {
            ClassLoader classLoader = cls.getClassLoader();
            if (classLoader != null) {
                int i4 = a;
                int i5 = ((i4 | 125) << 1) - (i4 ^ 125);
                b = i5 % 128;
                if (i5 % 2 == 0) {
                    return classLoader.loadClass(str);
                }
                classLoader.loadClass(str);
                obj.hashCode();
                throw null;
            }
            Class cls2 = (Class) AccessController.doPrivileged(new bBH(str));
            int i6 = a + 99;
            int i7 = i6 % 128;
            b = i7;
            int i8 = i6 % 2;
            int i9 = i7 & 111;
            int i10 = (i7 ^ 111) | i9;
            int i11 = (i9 ^ i10) + ((i9 & i10) << 1);
            a = i11 % 128;
            int i12 = i11 % 2;
            return cls2;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
