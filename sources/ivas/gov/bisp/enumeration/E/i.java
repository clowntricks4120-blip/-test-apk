package ivas.gov.bisp.enumeration.E;

import android.content.Context;
import android.os.Trace;
import ivas.gov.bisp.enumeration.cV.j;
import ivas.gov.bisp.enumeration.o00Oo0.OooOO0O;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class i {
    private static int a = 1;
    private static int b;
    public static volatile i c;
    public static final Object d = new Object();
    public final Context g;
    public final Set<Class<? extends OooOO0O<?>>> f = new HashSet();
    public final Map<Class<?>, Object> e = new HashMap();

    static {
        int i = a;
        int i2 = i & 23;
        int i3 = (i | 23) & (~i2);
        int i4 = -(-(i2 << 1));
        int i5 = (i3 & i4) + (i3 | i4);
        b = i5 % 128;
        int i6 = i5 % 2;
    }

    public i(Context context) {
        this.g = context.getApplicationContext();
    }

    public static i c(Context context) {
        if (c == null) {
            synchronized (d) {
                if (c == null) {
                    c = new i(context);
                }
            }
        }
        return c;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001f A[Catch: all -> 0x008c, TRY_LEAVE, TryCatch #2 {all -> 0x008c, blocks: (B:6:0x0009, B:7:0x0010, B:9:0x0017, B:11:0x001f, B:23:0x0066, B:24:0x006b, B:25:0x006c, B:30:0x0078, B:31:0x008b, B:12:0x0022, B:14:0x003a, B:15:0x003e, B:17:0x0044, B:19:0x0052, B:20:0x0056), top: B:41:0x0009, outer: #0, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:14:0x003a A[Catch: all -> 0x0065, TryCatch #1 {all -> 0x0065, blocks: (B:12:0x0022, B:14:0x003a, B:15:0x003e, B:17:0x0044, B:19:0x0052, B:20:0x0056), top: B:39:0x0022, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x0044 A[Catch: all -> 0x0065, TryCatch #1 {all -> 0x0065, blocks: (B:12:0x0022, B:14:0x003a, B:15:0x003e, B:17:0x0044, B:19:0x0052, B:20:0x0056), top: B:39:0x0022, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x006c A[Catch: all -> 0x008c, TRY_LEAVE, TryCatch #2 {all -> 0x008c, blocks: (B:6:0x0009, B:7:0x0010, B:9:0x0017, B:11:0x001f, B:23:0x0066, B:24:0x006b, B:25:0x006c, B:30:0x0078, B:31:0x008b, B:12:0x0022, B:14:0x003a, B:15:0x003e, B:17:0x0044, B:19:0x0052, B:20:0x0056), top: B:41:0x0009, outer: #0, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0077  */
    /* JADX WARN: Code duplicated, block: B:43:0x0052 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x003e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0017 A[Catch: all -> 0x008c, TryCatch #2 {all -> 0x008c, blocks: (B:6:0x0009, B:7:0x0010, B:9:0x0017, B:11:0x001f, B:23:0x0066, B:24:0x006b, B:25:0x006c, B:30:0x0078, B:31:0x008b, B:12:0x0022, B:14:0x003a, B:15:0x003e, B:17:0x0044, B:19:0x0052, B:20:0x0056), top: B:41:0x0009, outer: #0, inners: #1 }] */
    public final <T> T d(Class<? extends OooOO0O<?>> cls, Set<Class<?>> set) {
        T t;
        List<Class<? extends OooOO0O<?>>> listB;
        synchronized (d) {
            if (j.b()) {
                try {
                    Trace.beginSection(cls.getSimpleName());
                    if (!set.contains(cls)) {
                        throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
                    }
                    if (this.e.containsKey(cls)) {
                        t = (T) this.e.get(cls);
                    } else {
                        set.add(cls);
                        try {
                            p pVarNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                            listB = pVarNewInstance.b();
                            if (!listB.isEmpty()) {
                                for (Class<? extends OooOO0O<?>> cls2 : listB) {
                                    if (!this.e.containsKey(cls2)) {
                                        d(cls2, set);
                                    }
                                }
                            }
                            t = (T) pVarNewInstance.create(this.g);
                            set.remove(cls);
                            this.e.put(cls, t);
                        } catch (Throwable th) {
                            throw new z(th);
                        }
                    }
                    Trace.endSection();
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            } else {
                if (!set.contains(cls)) {
                    throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
                }
                if (this.e.containsKey(cls)) {
                    set.add(cls);
                    p pVarNewInstance2 = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    listB = pVarNewInstance2.b();
                    if (!listB.isEmpty()) {
                        while (r2.hasNext()) {
                            if (!this.e.containsKey(cls2)) {
                                d(cls2, set);
                            }
                        }
                    }
                    t = (T) pVarNewInstance2.create(this.g);
                    set.remove(cls);
                    this.e.put(cls, t);
                } else {
                    t = (T) this.e.get(cls);
                }
                Trace.endSection();
            }
            throw th;
        }
        return t;
    }
}
