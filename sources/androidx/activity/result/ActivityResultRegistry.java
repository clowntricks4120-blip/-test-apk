package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.a;
import androidx.lifecycle.c;
import androidx.lifecycle.d;
import ivas.gov.bisp.enumeration.I.r;
import ivas.gov.bisp.enumeration.OooO0Oo.OooO;
import ivas.gov.bisp.enumeration.p084g.h;
import ivas.gov.bisp.enumeration.p085h.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public abstract class ActivityResultRegistry {
    public Random a;
    public final Map<Integer, String> b;
    public final Map<String, Integer> c;
    public final Map<String, OooO0o> d;
    public final transient Map<String, OooO0OO<?>> e;
    public ArrayList<String> f;
    public final Map<String, Object> g;
    public final Bundle h;

    /* JADX INFO: Add missing generic type declarations: [I] */
    public class OooO00o<I> extends OooO<I> {
        public final /* synthetic */ String a;
        public final /* synthetic */ int b;
        public final /* synthetic */ r c;

        public OooO00o(String str, int i, r rVar) {
            this.a = str;
            this.b = i;
            this.c = rVar;
        }

        public void c(I i, w wVar) {
            ActivityResultRegistry.this.f.add(this.a);
            Integer num = ActivityResultRegistry.this.c.get(this.a);
            ActivityResultRegistry.this.c(num != null ? num.intValue() : this.b, this.c, i, wVar);
        }

        public void d() {
            ActivityResultRegistry.this.f(this.a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    public class OooO0O0<I> extends OooO<I> {
        public final /* synthetic */ String a;
        public final /* synthetic */ int b;
        public final /* synthetic */ r c;

        public OooO0O0(String str, int i, r rVar) {
            this.a = str;
            this.b = i;
            this.c = rVar;
        }

        public void c(I i, w wVar) {
            ActivityResultRegistry.this.f.add(this.a);
            Integer num = ActivityResultRegistry.this.c.get(this.a);
            ActivityResultRegistry.this.c(num != null ? num.intValue() : this.b, this.c, i, wVar);
        }

        public void d() {
            ActivityResultRegistry.this.f(this.a);
        }
    }

    public static class OooO0OO<O> {
        public final ivas.gov.bisp.enumeration.OooO0Oo.OooO0o<O> a;
        public final ivas.gov.bisp.enumeration.OooO0o0.OooO0o<?, O> b;

        public OooO0OO(ivas.gov.bisp.enumeration.OooO0Oo.OooO0o<O> oooO0o, ivas.gov.bisp.enumeration.OooO0o0.OooO0o<?, O> oooO0o2) {
            this.a = oooO0o;
            this.b = oooO0o2;
        }
    }

    public static class OooO0o {
        public final d a;
        public final ArrayList<a> b = new ArrayList<>();

        public OooO0o(d dVar) {
            this.a = dVar;
        }
    }

    public ActivityResultRegistry() throws Throwable {
        try {
            this.a = (Random) Random.class.getDeclaredConstructor(null).newInstance(null);
            this.b = new HashMap();
            this.c = new HashMap();
            this.d = new HashMap();
            this.f = new ArrayList<>();
            this.e = new HashMap();
            this.g = new HashMap();
            this.h = new Bundle();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public final boolean b(int i, int i2, Intent intent) {
        ivas.gov.bisp.enumeration.OooO0Oo.OooO0o<?> oooO0o;
        String str = this.b.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        this.f.remove(str);
        OooO0OO<?> oooO0OO = this.e.get(str);
        if (oooO0OO != null && (oooO0o = oooO0OO.a) != null) {
            oooO0o.b(oooO0OO.b.e(i2, intent));
            return true;
        }
        this.g.remove(str);
        this.h.putParcelable(str, new h(i2, intent));
        return true;
    }

    public abstract <I, O> void c(int i, ivas.gov.bisp.enumeration.OooO0o0.OooO0o<I, O> oooO0o, @SuppressLint({"UnknownNullness"}) I i2, w wVar);

    /* JADX WARN: Multi-variable type inference failed */
    public final <I, O> OooO<I> d(String str, ivas.gov.bisp.enumeration.OooO0o0.OooO0o<I, O> oooO0o, ivas.gov.bisp.enumeration.OooO0Oo.OooO0o<O> oooO0o2) {
        int iG = g(str);
        this.e.put(str, new OooO0OO<>(oooO0o2, oooO0o));
        if (this.g.containsKey(str)) {
            Object obj = this.g.get(str);
            this.g.remove(str);
            oooO0o2.b(obj);
        }
        h hVar = (h) this.h.getParcelable(str);
        if (hVar != null) {
            this.h.remove(str);
            oooO0o2.b(oooO0o.e(hVar.d, hVar.e));
        }
        return new OooO0O0(str, iG, oooO0o);
    }

    public final <I, O> OooO<I> e(final String str, ivas.gov.bisp.enumeration.p027b.d dVar, final ivas.gov.bisp.enumeration.OooO0o0.OooO0o<I, O> oooO0o, final ivas.gov.bisp.enumeration.OooO0Oo.OooO0o<O> oooO0o2) {
        d lifecycle = dVar.getLifecycle();
        c cVar = (c) lifecycle;
        if (cVar.b.compareTo(d.aMa.STARTED) >= 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("LifecycleOwner ");
            sb.append(dVar);
            sb.append(" is attempting to register while current state is ");
            sb.append(cVar.b);
            sb.append(". LifecycleOwners must call register before they are STARTED.");
            throw new IllegalStateException(sb.toString());
        }
        int iG = g(str);
        OooO0o oooO0o3 = this.d.get(str);
        if (oooO0o3 == null) {
            oooO0o3 = new OooO0o(lifecycle);
        }
        a aVar = new a() { // from class: androidx.activity.result.ActivityResultRegistry.1
            @Override // androidx.lifecycle.a
            public void a(ivas.gov.bisp.enumeration.p027b.d dVar2, d.aLZ alz) {
                if (!d.aLZ.ON_START.equals(alz)) {
                    if (d.aLZ.ON_STOP.equals(alz)) {
                        ActivityResultRegistry.this.e.remove(str);
                        return;
                    } else {
                        if (d.aLZ.ON_DESTROY.equals(alz)) {
                            ActivityResultRegistry.this.f(str);
                            return;
                        }
                        return;
                    }
                }
                ActivityResultRegistry.this.e.put(str, new OooO0OO<>(oooO0o2, oooO0o));
                if (ActivityResultRegistry.this.g.containsKey(str)) {
                    Object obj = ActivityResultRegistry.this.g.get(str);
                    ActivityResultRegistry.this.g.remove(str);
                    oooO0o2.b(obj);
                }
                h hVar = (h) ActivityResultRegistry.this.h.getParcelable(str);
                if (hVar != null) {
                    ActivityResultRegistry.this.h.remove(str);
                    oooO0o2.b(oooO0o.e(hVar.d, hVar.e));
                }
            }
        };
        oooO0o3.a.b(aVar);
        oooO0o3.b.add(aVar);
        this.d.put(str, oooO0o3);
        return new OooO00o(str, iG, oooO0o);
    }

    public final void f(String str) {
        Integer numRemove;
        if (!this.f.contains(str) && (numRemove = this.c.remove(str)) != null) {
            this.b.remove(numRemove);
        }
        this.e.remove(str);
        if (this.g.containsKey(str)) {
            Objects.toString(this.g.get(str));
            this.g.remove(str);
        }
        if (this.h.containsKey(str)) {
            Objects.toString(this.h.getParcelable(str));
            this.h.remove(str);
        }
        OooO0o oooO0o = this.d.get(str);
        if (oooO0o != null) {
            Iterator<a> it = oooO0o.b.iterator();
            while (it.hasNext()) {
                oooO0o.a.c(it.next());
            }
            oooO0o.b.clear();
            this.d.remove(str);
        }
    }

    public final int g(String str) {
        int iNextInt;
        Integer num = this.c.get(str);
        if (num != null) {
            return num.intValue();
        }
        do {
            iNextInt = this.a.nextInt(2147418112) + 65536;
        } while (this.b.containsKey(Integer.valueOf(iNextInt)));
        this.b.put(Integer.valueOf(iNextInt), str);
        this.c.put(str, Integer.valueOf(iNextInt));
        return iNextInt;
    }
}
