package butterknife;

import android.view.View;
import ivas.gov.bisp.enumeration.p091n.j;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ButterKnife {
    public static final Map<Class<?>, Constructor<? extends Unbinder>> a = new LinkedHashMap();

    private ButterKnife() {
        throw new AssertionError("No instances.");
    }

    public static Unbinder c(Object obj, View view) {
        Constructor<? extends Unbinder> constructorD = d(obj.getClass());
        if (constructorD == null) {
            return new Unbinder() { // from class: ivas.gov.bisp.enumeration.cW.l
                private static int a = 0;
                private static int b = 1;

                static {
                    int i = a;
                    int i2 = ((i ^ 19) | (i & 19)) << 1;
                    int i3 = -(((~i) & 19) | (i & (-20)));
                    int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
                    b = i4 % 128;
                    int i5 = i4 % 2;
                }
            };
        }
        try {
            return constructorD.newInstance(obj, view);
        } catch (IllegalAccessException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to invoke ");
            sb.append(constructorD);
            throw new RuntimeException(sb.toString(), e);
        } catch (InstantiationException e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unable to invoke ");
            sb2.append(constructorD);
            throw new RuntimeException(sb2.toString(), e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unable to create binding instance.", cause);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Constructor<? extends Unbinder> d(Class<?> cls) {
        Constructor<? extends Unbinder> constructorD;
        Map<Class<?>, Constructor<? extends Unbinder>> map = a;
        Constructor<? extends Unbinder> constructor = (Constructor) ((LinkedHashMap) map).get(cls);
        if (constructor != null || map.containsKey(cls)) {
            return constructor;
        }
        String name = cls.getName();
        if (name.startsWith("android.") || name.startsWith("java.") || name.startsWith("androidx.")) {
            return null;
        }
        try {
            ClassLoader classLoader = cls.getClassLoader();
            StringBuilder sb = new StringBuilder();
            sb.append(name);
            sb.append("_ViewBinding");
            constructorD = classLoader.loadClass(sb.toString()).getConstructor(cls, View.class);
        } catch (ClassNotFoundException unused) {
            constructorD = d(cls.getSuperclass());
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(j.r("Unable to find binding constructor for ", name), e);
        }
        a.put(cls, constructorD);
        return constructorD;
    }
}
