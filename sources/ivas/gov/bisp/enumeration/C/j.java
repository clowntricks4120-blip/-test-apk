package ivas.gov.bisp.enumeration.C;

import android.os.Parcelable;
import ivas.gov.bisp.enumeration.OooOOoo.OooO0o;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    private static int a = 0;
    private static int b = 1;
    public final OooO0o<String, Method> c;
    public final OooO0o<String, Method> d;
    public final OooO0o<String, Class> e;

    public j(OooO0o<String, Method> oooO0o, OooO0o<String, Method> oooO0o2, OooO0o<String, Class> oooO0o3) {
        this.c = oooO0o;
        this.d = oooO0o2;
        this.e = oooO0o3;
    }

    public abstract boolean c(int i);

    public abstract void d();

    public abstract j e();

    public abstract boolean h();

    public abstract byte[] j();

    public abstract CharSequence k();

    public abstract int l();

    public abstract <T extends Parcelable> T n();

    public abstract String o();

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
    
        r4 = null;
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
    
        r5 = ivas.gov.bisp.enumeration.C.j.b;
        r1 = (r5 & 119) + (r5 | 119);
        ivas.gov.bisp.enumeration.C.j.a = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if ((r1 % 2) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
    
        r5 = 49 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if (r5 == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
    
        if (r5 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        r4 = (T) n();
        r5 = ivas.gov.bisp.enumeration.C.j.b;
        r1 = r5 & 95;
        r5 = (r5 ^ 95) | r1;
        r2 = (r1 ^ r5) + ((r5 & r1) << 1);
        ivas.gov.bisp.enumeration.C.j.a = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        if ((r2 % 2) != 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <T extends android.os.Parcelable> T p(T r4, int r5) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.C.j.a
            r2 = r1 & 81
            r1 = r1 | 81
            int r1 = ~r1
            int r2 = r2 - r1
            int r2 = r2 + (-1)
            int r1 = r2 % 128
            ivas.gov.bisp.enumeration.C.j.b = r1
            int r2 = r2 % r0
            boolean r5 = r3.c(r5)
            if (r2 != 0) goto L1f
            r1 = 94
            int r1 = r1 / 0
            if (r5 != 0) goto L21
            goto L3f
        L1f:
            if (r5 == 0) goto L3f
        L21:
            android.os.Parcelable r4 = r3.n()
            int r5 = ivas.gov.bisp.enumeration.C.j.b
            r1 = r5 & 95
            r5 = r5 ^ 95
            r5 = r5 | r1
            r2 = r1 ^ r5
            r5 = r5 & r1
            int r5 = r5 << 1
            int r2 = r2 + r5
            int r5 = r2 % 128
            ivas.gov.bisp.enumeration.C.j.a = r5
            int r2 = r2 % r0
            if (r2 != 0) goto L3a
            return r4
        L3a:
            r4 = 0
            r4.hashCode()
            throw r4
        L3f:
            int r5 = ivas.gov.bisp.enumeration.C.j.b
            r1 = r5 & 119(0x77, float:1.67E-43)
            r5 = r5 | 119(0x77, float:1.67E-43)
            int r1 = r1 + r5
            int r5 = r1 % 128
            ivas.gov.bisp.enumeration.C.j.a = r5
            int r1 = r1 % r0
            if (r1 == 0) goto L51
            r5 = 49
            int r5 = r5 / 0
        L51:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.C.j.p(android.os.Parcelable, int):android.os.Parcelable");
    }

    public abstract void r(int i);

    public abstract void s(byte[] bArr);

    public abstract void t(boolean z);

    public abstract void u(CharSequence charSequence);

    public abstract void v(Parcelable parcelable);

    public abstract void w(int i);

    public abstract void x(String str);

    public int m(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = (i4 ^ 33) + ((i4 & 33) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        if (!(!c(i2))) {
            int iL = l();
            int i7 = b;
            int i8 = (((i7 ^ 53) | (i7 & 53)) << 1) - (((~i7) & 53) | (i7 & (-54)));
            a = i8 % 128;
            int i9 = i8 % 2;
            return iL;
        }
        int i10 = b;
        int i11 = (i10 | 71) << 1;
        int i12 = -((i10 & (-72)) | ((~i10) & 71));
        int i13 = (i11 & i12) + (i11 | i12);
        a = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
        int i14 = i10 & 47;
        int i15 = (i10 ^ 47) | i14;
        int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
        a = i16 % 128;
        if (i16 % 2 == 0) {
            return i;
        }
        throw null;
    }

    public <T extends h> T q() {
        Object objInvoke;
        int i = 2 % 2;
        int i2 = a + 79;
        b = i2 % 128;
        int i3 = i2 % 2;
        String strO = o();
        if (strO == null) {
            int i4 = a;
            int i5 = i4 ^ 15;
            int i6 = ((((i4 & 15) | i5) << 1) - (~(-i5))) - 1;
            b = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i4 | 1;
            int i9 = i8 << 1;
            int i10 = -((~(i4 & 1)) & i8);
            int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
            b = i11 % 128;
            int i12 = i11 % 2;
            return null;
        }
        j jVarE = e();
        try {
            try {
                Method methodG = g(strO);
                Object[] objArr = new Object[1];
                int i13 = b;
                int i14 = i13 | 69;
                int i15 = ((i14 << 1) - (~(-((~(i13 & 69)) & i14)))) - 1;
                a = i15 % 128;
                if (i15 % 2 != 0) {
                    objArr[1] = jVarE;
                    objInvoke = methodG.invoke(null, objArr);
                } else {
                    objArr[0] = jVarE;
                    objInvoke = methodG.invoke(null, objArr);
                }
                T t = (T) objInvoke;
                int i16 = a;
                int i17 = i16 & 123;
                int i18 = (i16 ^ 123) | i17;
                int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
                b = i19 % 128;
                if (i19 % 2 == 0) {
                    int i20 = 7 / 0;
                }
                return t;
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (e4.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e4.getCause());
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
            }
        } catch (IllegalArgumentException e5) {
            throw e5;
        }
    }

    public final Method g(String str) throws NoSuchMethodException {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 105;
        int i4 = -(-((i2 ^ 105) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        Method declaredMethod = (Method) this.c.getOrDefault(str, null);
        if (declaredMethod == null) {
            int i7 = b;
            int i8 = i7 & 105;
            int i9 = ((i7 ^ 105) | i8) << 1;
            int i10 = -((i7 | 105) & (~i8));
            int i11 = (i9 & i10) + (i10 | i9);
            a = i11 % 128;
            Class<?> cls = i11 % 2 != 0 ? Class.forName(str, false, j.class.getClassLoader()) : Class.forName(str, true, j.class.getClassLoader());
            Class<?>[] clsArr = new Class[1];
            int i12 = b;
            int i13 = ((i12 & 62) + (i12 | 62)) - 1;
            a = i13 % 128;
            if (i13 % 2 != 0) {
                clsArr[1] = j.class;
            } else {
                clsArr[0] = j.class;
            }
            declaredMethod = cls.getDeclaredMethod("read", clsArr);
            this.c.put(str, declaredMethod);
            int i14 = b;
            int i15 = i14 & 41;
            int i16 = ((i14 | 41) & (~i15)) + (i15 << 1);
            a = i16 % 128;
            int i17 = i16 % 2;
        }
        int i18 = b;
        int i19 = i18 & 19;
        int i20 = i19 + ((i18 ^ 19) | i19);
        a = i20 % 128;
        if (i20 % 2 != 0) {
            int i21 = 64 / 0;
        }
        return declaredMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Method i(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        Class[] clsArr;
        Class clsF;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 49) + (i2 | 49);
        b = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        Object orDefault = this.d.getOrDefault(cls.getName(), null);
        int i5 = a;
        int i6 = i5 & 55;
        int i7 = ((i5 ^ 55) | i6) << 1;
        int i8 = -((~i6) & (i5 | 55));
        int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
        b = i9 % 128;
        if (i9 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        Method method = (Method) orDefault;
        if (method == null) {
            int i10 = i5 ^ 31;
            int i11 = ((i5 & 31) | i10) << 1;
            int i12 = -i10;
            int i13 = (i11 & i12) + (i12 | i11);
            b = i13 % 128;
            if (i13 % 2 == 0) {
                clsArr = new Class[3];
                clsF = f(cls);
            } else {
                clsArr = new Class[2];
                clsF = f(cls);
            }
            int i14 = a;
            int i15 = i14 & 17;
            int i16 = (((i14 | 17) & (~i15)) - (~(i15 << 1))) - 1;
            b = i16 % 128;
            if (i16 % 2 == 0) {
                clsArr[0] = cls;
                clsArr[0] = j.class;
            } else {
                clsArr[0] = cls;
                clsArr[1] = j.class;
            }
            Method declaredMethod = clsF.getDeclaredMethod("write", clsArr);
            int i17 = b;
            int i18 = i17 & 107;
            int i19 = ((i17 | 107) & (~i18)) + (i18 << 1);
            a = i19 % 128;
            if (i19 % 2 != 0) {
                this.d.put(cls.getName(), declaredMethod);
                obj.hashCode();
                throw null;
            }
            this.d.put(cls.getName(), declaredMethod);
            int i20 = b;
            int i21 = ((i20 ^ 82) + ((i20 & 82) << 1)) - 1;
            a = i21 % 128;
            if (i21 % 2 != 0) {
                int i22 = 4 % 3;
            }
            method = declaredMethod;
        }
        int i23 = b;
        int i24 = i23 & 113;
        int i25 = i24 + ((i23 ^ 113) | i24);
        a = i25 % 128;
        if (i25 % 2 != 0) {
            int i26 = 55 / 0;
        }
        return method;
    }

    public final Class f(Class<? extends h> cls) throws ClassNotFoundException {
        String name;
        Object[] objArr;
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 67) << 1) - (i2 ^ 67);
        a = i3 % 128;
        int i4 = i3 % 2;
        OooO0o<String, Class> oooO0o = this.e;
        String name2 = cls.getName();
        int i5 = a + 35;
        b = i5 % 128;
        int i6 = i5 % 2;
        Class<?> cls2 = (Class) oooO0o.getOrDefault(name2, null);
        if (cls2 == null) {
            int i7 = b;
            int i8 = (i7 | 119) << 1;
            int i9 = -(i7 ^ 119);
            int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
            a = i10 % 128;
            if (i10 % 2 != 0) {
                name = cls.getPackage().getName();
                objArr = new Object[4];
            } else {
                name = cls.getPackage().getName();
                objArr = new Object[2];
            }
            objArr[0] = name;
            objArr[1] = cls.getSimpleName();
            String str = String.format("%s.%sParcelizer", objArr);
            int i11 = a + 73;
            b = i11 % 128;
            int i12 = i11 % 2;
            cls2 = Class.forName(str, false, cls.getClassLoader());
            OooO0o<String, Class> oooO0o2 = this.e;
            String name3 = cls.getName();
            int i13 = a;
            int i14 = ((i13 | 95) << 1) - (i13 ^ 95);
            b = i14 % 128;
            if (i14 % 2 == 0) {
                oooO0o2.put(name3, cls2);
                throw null;
            }
            oooO0o2.put(name3, cls2);
        }
        int i15 = a;
        int i16 = i15 & 45;
        int i17 = (i15 ^ 45) | i16;
        int i18 = (i16 & i17) + (i17 | i16);
        b = i18 % 128;
        if (i18 % 2 != 0) {
            return cls2;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void y(h hVar) {
        j jVarE;
        Method methodI;
        Object[] objArr;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 69;
        int i4 = (((i2 & 69) | i3) << 1) - i3;
        a = i4 % 128;
        int i5 = i4 % 2;
        if (hVar == null) {
            int i6 = (((i2 ^ 53) | (i2 & 53)) << 1) - (((~i2) & 53) | (i2 & (-54)));
            a = i6 % 128;
            int i7 = i6 % 2;
            x(null);
            int i8 = b;
            int i9 = ((i8 ^ 13) | (i8 & 13)) << 1;
            int i10 = -(((~i8) & 13) | (i8 & (-14)));
            int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
            a = i11 % 128;
            int i12 = i11 % 2;
            return;
        }
        try {
            x(f(hVar.getClass()).getName());
            int i13 = a + 71;
            b = i13 % 128;
            try {
                if (i13 % 2 == 0) {
                    jVarE = e();
                    try {
                        methodI = i(hVar.getClass());
                        objArr = new Object[5];
                    } catch (NullPointerException e) {
                        throw e;
                    }
                } else {
                    jVarE = e();
                    methodI = i(hVar.getClass());
                    objArr = new Object[2];
                }
                objArr[0] = hVar;
                objArr[1] = jVarE;
                methodI.invoke(null, objArr);
                int i14 = a;
                int i15 = (((i14 & (-24)) | ((~i14) & 23)) - (~((i14 & 23) << 1))) - 1;
                b = i15 % 128;
                int i16 = i15 % 2;
                jVarE.d();
                int i17 = b + 55;
                a = i17 % 128;
                int i18 = i17 % 2;
            } catch (ClassNotFoundException e2) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e2);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e3);
            } catch (NoSuchMethodException e4) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
            } catch (InvocationTargetException e5) {
                if (!(e5.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e5);
                }
                throw ((RuntimeException) e5.getCause());
            }
        } catch (ClassNotFoundException e6) {
            StringBuilder sb = new StringBuilder();
            sb.append(hVar.getClass().getSimpleName());
            sb.append(" does not have a Parcelizer");
            throw new RuntimeException(sb.toString(), e6);
        }
    }
}
