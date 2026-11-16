package androidx.lifecycle;

import android.annotation.SuppressLint;
import ivas.gov.bisp.enumeration.OooOOOO.OooO00o;
import ivas.gov.bisp.enumeration.OooOOOO.OooO0O0;
import ivas.gov.bisp.enumeration.p027b.B;
import ivas.gov.bisp.enumeration.p027b.InterfaceC0105b;
import ivas.gov.bisp.enumeration.p027b.ag;
import ivas.gov.bisp.enumeration.p090m.j;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class c extends d {
    public final WeakReference<ivas.gov.bisp.enumeration.p027b.d> c;
    public OooO00o<InterfaceC0105b, aLT> a = new j();
    public int d = 0;
    public boolean f = false;
    public boolean e = false;
    public ArrayList<d.aMa> g = new ArrayList<>();
    public d.aMa b = d.aMa.INITIALIZED;
    public final boolean h = true;

    public static class aLT {
        public d.aMa a;
        public a b;

        public aLT(InterfaceC0105b interfaceC0105b, d.aMa ama) {
            a reflectiveGenericLifecycleObserver;
            Map<Class<?>, Integer> map = ag.c;
            boolean z = interfaceC0105b instanceof a;
            boolean z2 = interfaceC0105b instanceof B;
            if (z && z2) {
                reflectiveGenericLifecycleObserver = new FullLifecycleObserverAdapter((B) interfaceC0105b, (a) interfaceC0105b);
            } else if (z2) {
                reflectiveGenericLifecycleObserver = new FullLifecycleObserverAdapter((B) interfaceC0105b, null);
            } else if (z) {
                reflectiveGenericLifecycleObserver = (a) interfaceC0105b;
            } else {
                Class<?> cls = interfaceC0105b.getClass();
                if (ag.d(cls) == 2) {
                    List list = (List) ((HashMap) ag.d).get(cls);
                    if (list.size() == 1) {
                        reflectiveGenericLifecycleObserver = new SingleGeneratedAdapterObserver(ag.b((Constructor) list.get(0), interfaceC0105b));
                    } else {
                        e[] eVarArr = new e[list.size()];
                        for (int i = 0; i < list.size(); i++) {
                            eVarArr[i] = ag.b((Constructor) list.get(i), interfaceC0105b);
                        }
                        reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(eVarArr);
                    }
                } else {
                    reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(interfaceC0105b);
                }
            }
            this.b = reflectiveGenericLifecycleObserver;
            this.a = ama;
        }

        public void b(ivas.gov.bisp.enumeration.p027b.d dVar, d.aLZ alz) {
            d.aMa amaF = alz.f();
            this.a = c.d(this.a, amaF);
            this.b.a(dVar, alz);
            this.a = amaF;
        }
    }

    public c(ivas.gov.bisp.enumeration.p027b.d dVar) {
        this.c = new WeakReference<>(dVar);
    }

    public static d.aMa d(d.aMa ama, d.aMa ama2) {
        return (ama2 == null || ama2.compareTo(ama) >= 0) ? ama : ama2;
    }

    @Override // androidx.lifecycle.d
    public void b(InterfaceC0105b interfaceC0105b) {
        ivas.gov.bisp.enumeration.p027b.d dVar;
        i("addObserver");
        d.aMa ama = this.b;
        d.aMa ama2 = d.aMa.DESTROYED;
        if (ama != ama2) {
            ama2 = d.aMa.INITIALIZED;
        }
        aLT alt = new aLT(interfaceC0105b, ama2);
        if (((aLT) this.a.f(interfaceC0105b, alt)) == null && (dVar = this.c.get()) != null) {
            boolean z = this.d != 0 || this.f;
            d.aMa amaH = h(interfaceC0105b);
            this.d++;
            while (alt.a.compareTo(amaH) < 0 && this.a.g.containsKey(interfaceC0105b)) {
                this.g.add(alt.a);
                d.aLZ alzC = d.aLZ.c(alt.a);
                if (alzC == null) {
                    StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("no event up from ");
                    sbW.append(alt.a);
                    throw new IllegalStateException(sbW.toString());
                }
                alt.b(dVar, alzC);
                l();
                amaH = h(interfaceC0105b);
            }
            if (!z) {
                e();
            }
            this.d--;
        }
    }

    @Override // androidx.lifecycle.d
    public void c(InterfaceC0105b interfaceC0105b) {
        i("removeObserver");
        this.a.g(interfaceC0105b);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void e() {
        d.aLZ alz;
        ivas.gov.bisp.enumeration.p027b.d dVar = this.c.get();
        if (dVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            OooO00o<InterfaceC0105b, aLT> oooO00o = this.a;
            if (oooO00o.f == 0) {
                break;
            }
            d.aMa ama = ((aLT) oooO00o.c.d).a;
            d.aMa ama2 = ((aLT) oooO00o.d.d).a;
            if (ama == ama2 && this.b == ama2) {
                break;
            }
            this.e = false;
            if (this.b.compareTo(((aLT) oooO00o.c.d).a) < 0) {
                OooO00o<InterfaceC0105b, aLT> oooO00o2 = this.a;
                ivas.gov.bisp.enumeration.m.c.aTi ati = new ivas.gov.bisp.enumeration.m.c.aTi(oooO00o2.d, oooO00o2.c);
                oooO00o2.e.put((OooO0O0.OooOO0<K, V>) ati, Boolean.FALSE);
                while (ati.hasNext() && !this.e) {
                    Map.Entry entry = (Map.Entry) ati.next();
                    aLT alt = (aLT) entry.getValue();
                    while (alt.a.compareTo(this.b) > 0 && !this.e && this.a.contains((InterfaceC0105b) entry.getKey())) {
                        int iOrdinal = alt.a.ordinal();
                        if (iOrdinal == 2) {
                            alz = d.aLZ.ON_DESTROY;
                        } else if (iOrdinal != 3) {
                            alz = iOrdinal != 4 ? null : d.aLZ.ON_PAUSE;
                        } else {
                            alz = d.aLZ.ON_STOP;
                        }
                        if (alz == null) {
                            StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("no event down from ");
                            sbW.append(alt.a);
                            throw new IllegalStateException(sbW.toString());
                        }
                        this.g.add(alz.f());
                        alt.b(dVar, alz);
                        l();
                    }
                }
            }
            OooO0O0.OooO0OO<K, V> oooO0OO = this.a.d;
            if (!this.e && oooO0OO != 0 && this.b.compareTo(((aLT) oooO0OO.d).a) > 0) {
                ivas.gov.bisp.enumeration.m.c.aTk atkE = this.a.e();
                while (atkE.hasNext() && !this.e) {
                    Map.Entry entry2 = (Map.Entry) atkE.next();
                    aLT alt2 = (aLT) entry2.getValue();
                    while (alt2.a.compareTo(this.b) < 0 && !this.e && this.a.contains((InterfaceC0105b) entry2.getKey())) {
                        this.g.add(alt2.a);
                        d.aLZ alzC = d.aLZ.c(alt2.a);
                        if (alzC == null) {
                            StringBuilder sbW2 = ivas.gov.bisp.enumeration.p091n.j.w("no event up from ");
                            sbW2.append(alt2.a);
                            throw new IllegalStateException(sbW2.toString());
                        }
                        alt2.b(dVar, alzC);
                        l();
                    }
                }
            }
        }
        this.e = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final d.aMa h(InterfaceC0105b interfaceC0105b) {
        OooO00o<InterfaceC0105b, aLT> oooO00o = this.a;
        d.aMa ama = null;
        ivas.gov.bisp.enumeration.m.c.aTj atj = oooO00o.g.containsKey(interfaceC0105b) ? ((ivas.gov.bisp.enumeration.m.c.aTj) oooO00o.g.get(interfaceC0105b)).f : null;
        d.aMa ama2 = atj != null ? ((aLT) atj.d).a : null;
        if (!this.g.isEmpty()) {
            ArrayList<d.aMa> arrayList = this.g;
            ama = arrayList.get(arrayList.size() - 1);
        }
        return d(d(this.b, ama2), ama);
    }

    @SuppressLint({"RestrictedApi"})
    public final void i(String str) {
        if (this.h && !ivas.gov.bisp.enumeration.p096p.j.bx().az()) {
            throw new IllegalStateException(ivas.gov.bisp.enumeration.p091n.j.t("Method ", str, " must be called on the main thread"));
        }
    }

    public void j(d.aLZ alz) {
        i("handleLifecycleEvent");
        k(alz.f());
    }

    public final void k(d.aMa ama) {
        if (this.b == ama) {
            return;
        }
        this.b = ama;
        if (this.f || this.d != 0) {
            this.e = true;
            return;
        }
        this.f = true;
        e();
        this.f = false;
    }

    public final void l() {
        ArrayList<d.aMa> arrayList = this.g;
        arrayList.remove(arrayList.size() - 1);
    }
}
