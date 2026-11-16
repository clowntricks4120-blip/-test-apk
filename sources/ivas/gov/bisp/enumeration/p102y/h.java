package ivas.gov.bisp.enumeration.p102y;

import ivas.gov.bisp.enumeration.o000O0O.o0OoOo0;
import ivas.gov.bisp.enumeration.p091n.j;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public class h implements o0OoOo0<Object> {
    private static int a = 0;
    private static int b = 1;
    public final ivas.gov.bisp.enumeration.p096p.h c;
    public final /* synthetic */ Class d;
    public final /* synthetic */ Type e;

    public h(r rVar, Class cls, Type type) {
        ivas.gov.bisp.enumeration.p096p.h o2;
        this.d = cls;
        this.e = type;
        try {
            try {
                try {
                    Class<?> cls2 = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls2.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    o2 = new M(cls2.getMethod("allocateInstance", Class.class), declaredField.get(null));
                    int i = 2 % 2;
                } catch (ClassCastException e) {
                    throw e;
                } catch (Exception unused) {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    int iIntValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    o2 = new N(declaredMethod2, iIntValue);
                }
            } catch (Exception unused2) {
                o2 = new O();
            }
        } catch (Exception unused3) {
            Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
            declaredMethod3.setAccessible(true);
            o2 = new C0329m(declaredMethod3);
        }
        this.c = o2;
        int i2 = a + 15;
        b = i2 % 128;
        int i3 = i2 % 2;
    }

    public Object d() {
        int i = 2 % 2;
        int i2 = a + 113;
        b = i2 % 128;
        int i3 = i2 % 2;
        try {
            Object objAC = this.c.aC(this.d);
            int i4 = b;
            int i5 = (((i4 ^ 89) | (i4 & 89)) << 1) - (((~i4) & 89) | (i4 & (-90)));
            a = i5 % 128;
            if (i5 % 2 == 0) {
                return objAC;
            }
            throw null;
        } catch (Exception e) {
            StringBuilder sbW = j.w("Unable to invoke no-args constructor for ");
            sbW.append(this.e);
            sbW.append(". Registering an InstanceCreator with Gson for this type may fix this problem.");
            throw new RuntimeException(sbW.toString(), e);
        }
    }
}
