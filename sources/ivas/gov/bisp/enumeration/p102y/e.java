package ivas.gov.bisp.enumeration.p102y;

import ivas.gov.bisp.enumeration.o000O0O.o0OoOo0;
import ivas.gov.bisp.enumeration.p091n.j;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public class e implements o0OoOo0<Object> {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ Constructor c;

    public e(r rVar, Constructor constructor) {
        this.c = constructor;
    }

    public Object d() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 71;
        int i4 = (i2 ^ 71) | i3;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        Object obj = null;
        try {
            if (i5 % 2 == 0) {
                this.c.newInstance(null);
                obj.hashCode();
                throw null;
            }
            Object objNewInstance = this.c.newInstance(null);
            int i6 = a;
            int i7 = (i6 & (-2)) | ((~i6) & 1);
            int i8 = (i6 & 1) << 1;
            int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
            b = i9 % 128;
            int i10 = i9 % 2;
            return objNewInstance;
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (InstantiationException e2) {
            StringBuilder sbW = j.w("Failed to invoke ");
            sbW.append(this.c);
            sbW.append(" with no args");
            throw new RuntimeException(sbW.toString(), e2);
        } catch (InvocationTargetException e3) {
            StringBuilder sbW2 = j.w("Failed to invoke ");
            sbW2.append(this.c);
            sbW2.append(" with no args");
            throw new RuntimeException(sbW2.toString(), e3.getTargetException());
        }
    }
}
