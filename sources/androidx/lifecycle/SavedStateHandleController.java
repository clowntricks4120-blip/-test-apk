package androidx.lifecycle;

import ivas.gov.bisp.enumeration.p027b.InterfaceC0106f;
import ivas.gov.bisp.enumeration.p027b.ak;
import ivas.gov.bisp.enumeration.p027b.an;
import ivas.gov.bisp.enumeration.p027b.ap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class SavedStateHandleController implements a {
    public final String a;
    public boolean b = false;
    public final ak c;

    public static final class OooO00o implements androidx.savedstate.b.aMl {
        @Override // androidx.savedstate.b.aMl
        public final void b(ivas.gov.bisp.enumeration.p082e.g gVar) {
            if (!(gVar instanceof InterfaceC0106f)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
            }
            an viewModelStore = ((InterfaceC0106f) gVar).getViewModelStore();
            androidx.savedstate.b savedStateRegistry = gVar.getSavedStateRegistry();
            Objects.requireNonNull(viewModelStore);
            Iterator it = new HashSet(viewModelStore.a.keySet()).iterator();
            while (it.hasNext()) {
                SavedStateHandleController.b(viewModelStore.a.get((String) it.next()), savedStateRegistry, gVar.getLifecycle());
            }
            if (new HashSet(viewModelStore.a.keySet()).isEmpty()) {
                return;
            }
            savedStateRegistry.d(OooO00o.class);
        }
    }

    public SavedStateHandleController(String str, ak akVar) {
        this.a = str;
        this.c = akVar;
    }

    public static void b(ap apVar, androidx.savedstate.b bVar, d dVar) {
        Object obj;
        Map<String, Object> map = apVar.c;
        if (map == null) {
            obj = null;
        } else {
            synchronized (map) {
                obj = apVar.c.get("androidx.lifecycle.savedstate.vm.tag");
            }
        }
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
        if (savedStateHandleController == null || savedStateHandleController.b) {
            return;
        }
        savedStateHandleController.d(bVar, dVar);
        c(bVar, dVar);
    }

    public static void c(final androidx.savedstate.b bVar, final d dVar) {
        d.aMa ama = ((c) dVar).b;
        if (ama == d.aMa.INITIALIZED || ama.compareTo(d.aMa.STARTED) >= 0) {
            bVar.d(OooO00o.class);
        } else {
            dVar.b(new a() { // from class: androidx.lifecycle.SavedStateHandleController.1
                @Override // androidx.lifecycle.a
                public void a(ivas.gov.bisp.enumeration.p027b.d dVar2, d.aLZ alz) {
                    if (alz == d.aLZ.ON_START) {
                        c cVar = (c) dVar;
                        cVar.i("removeObserver");
                        cVar.a.g(this);
                        bVar.d(OooO00o.class);
                    }
                }
            });
        }
    }

    @Override // androidx.lifecycle.a
    public final void a(ivas.gov.bisp.enumeration.p027b.d dVar, d.aLZ alz) {
        if (alz == d.aLZ.ON_DESTROY) {
            this.b = false;
            c cVar = (c) dVar.getLifecycle();
            cVar.i("removeObserver");
            cVar.a.g(this);
        }
    }

    public final void d(androidx.savedstate.b bVar, d dVar) {
        if (this.b) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.b = true;
        dVar.b(this);
        bVar.c(this.a, this.c.g);
    }
}
