package androidx.lifecycle;

import ivas.gov.bisp.enumeration.p091n.j;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class b {
    public static b a = new b();
    public final Map<Class<?>, aLV> b = new HashMap();
    public final Map<Class<?>, Boolean> c = new HashMap();

    @Deprecated
    public static class aLV {
        public final Map<d.aLZ, List<aLW>> a = new HashMap();
        public final Map<aLW, d.aLZ> b;

        public aLV(Map<aLW, d.aLZ> map) {
            this.b = map;
            for (Map.Entry<aLW, d.aLZ> entry : map.entrySet()) {
                d.aLZ value = entry.getValue();
                List<aLW> arrayList = this.a.get(value);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.a.put(value, arrayList);
                }
                arrayList.add(entry.getKey());
            }
        }

        public static void b(List<aLW> list, ivas.gov.bisp.enumeration.p027b.d dVar, d.aLZ alz, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    aLW alw = list.get(size);
                    Objects.requireNonNull(alw);
                    try {
                        int i = alw.a;
                        if (i == 0) {
                            alw.b.invoke(obj, new Object[0]);
                        } else if (i == 1) {
                            alw.b.invoke(obj, dVar);
                        } else if (i == 2) {
                            alw.b.invoke(obj, dVar, alz);
                        }
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    } catch (InvocationTargetException e2) {
                        throw new RuntimeException("Failed to call observer method", e2.getCause());
                    }
                }
            }
        }
    }

    @Deprecated
    public static final class aLW {
        public final int a;
        public final Method b;

        public aLW(int i, Method method) {
            this.a = i;
            this.b = method;
            method.setAccessible(true);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof aLW)) {
                return false;
            }
            aLW alw = (aLW) obj;
            return this.a == alw.a && this.b.getName().equals(alw.b.getName());
        }

        public final int hashCode() {
            return this.b.getName().hashCode() + (this.a * 31);
        }
    }

    public final aLV c(Class<?> cls, Method[] methodArr) {
        int i;
        aLV alvD;
        Class<?> superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null && (alvD = d(superclass)) != null) {
            map.putAll(alvD.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<aLW, d.aLZ> entry : d(cls2).b.entrySet()) {
                e(map, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            f fVar = (f) method.getAnnotation(f.class);
            if (fVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!parameterTypes[0].isAssignableFrom(ivas.gov.bisp.enumeration.p027b.d.class)) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                d.aLZ alzValue = fVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(d.aLZ.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (alzValue != d.aLZ.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                e(map, new aLW(i, method), alzValue, cls);
                z = true;
            }
        }
        aLV alv = new aLV(map);
        this.b.put(cls, alv);
        this.c.put(cls, Boolean.valueOf(z));
        return alv;
    }

    public final aLV d(Class<?> cls) {
        aLV alv = this.b.get(cls);
        return alv != null ? alv : c(cls, null);
    }

    public final void e(Map<aLW, d.aLZ> map, aLW alw, d.aLZ alz, Class<?> cls) {
        d.aLZ alz2 = map.get(alw);
        if (alz2 == null || alz == alz2) {
            if (alz2 == null) {
                map.put(alw, alz);
                return;
            }
            return;
        }
        Method method = alw.b;
        StringBuilder sbW = j.w("Method ");
        sbW.append(method.getName());
        sbW.append(" in ");
        sbW.append(cls.getName());
        sbW.append(" already declared with different @OnLifecycleEvent value: previous value ");
        sbW.append(alz2);
        sbW.append(", new value ");
        sbW.append(alz);
        throw new IllegalArgumentException(sbW.toString());
    }
}
