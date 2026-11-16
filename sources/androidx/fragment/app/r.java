package androidx.fragment.app;

import ivas.gov.bisp.enumeration.OooOOoo.OooOOOO;

/* JADX INFO: loaded from: classes.dex */
public class r {
    public static final OooOOOO<ClassLoader, OooOOOO<String, Class<?>>> a = new ivas.gov.bisp.enumeration.p001aa.t();

    public static Class<?> c(ClassLoader classLoader, String str) throws ClassNotFoundException {
        OooOOOO<ClassLoader, OooOOOO<String, Class<?>>> oooOOOO = a;
        ivas.gov.bisp.enumeration.p001aa.t tVar = (ivas.gov.bisp.enumeration.p001aa.t) oooOOOO.getOrDefault(classLoader, null);
        if (tVar == null) {
            tVar = new ivas.gov.bisp.enumeration.p001aa.t();
            oooOOOO.put(classLoader, tVar);
        }
        Class<?> cls = (Class) tVar.getOrDefault(str, null);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        tVar.put(str, cls2);
        return cls2;
    }

    public static Class<? extends Fragment> d(ClassLoader classLoader, String str) {
        try {
            return c(classLoader, str);
        } catch (ClassCastException e) {
            throw new Fragment.OooOOOO(ivas.gov.bisp.enumeration.p091n.j.t("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new Fragment.OooOOOO(ivas.gov.bisp.enumeration.p091n.j.t("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    public Fragment e(ClassLoader classLoader, String str) {
        throw null;
    }
}
