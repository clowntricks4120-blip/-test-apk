package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.a;
import androidx.lifecycle.c;
import androidx.lifecycle.d;
import ivas.gov.bisp.enumeration.p082e.g;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    public final g a;
    public final b b = new b();

    public e(g gVar) {
        this.a = gVar;
    }

    public final void b(Bundle bundle) {
        d lifecycle = this.a.getLifecycle();
        if (((c) lifecycle).b != d.aMa.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        lifecycle.b(new Recreator(this.a));
        final b bVar = this.b;
        if (bVar.c) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        if (bundle != null) {
            bVar.b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
        }
        lifecycle.b(new a() { // from class: androidx.savedstate.SavedStateRegistry$1
            @Override // androidx.lifecycle.a
            public void a(ivas.gov.bisp.enumeration.p027b.d dVar, d.aLZ alz) {
                if (alz == d.aLZ.ON_START) {
                    bVar.e = true;
                } else if (alz == d.aLZ.ON_STOP) {
                    bVar.e = false;
                }
            }
        });
        bVar.c = true;
    }

    public final void c(Bundle bundle) {
        b bVar = this.b;
        Objects.requireNonNull(bVar);
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = bVar.b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        ivas.gov.bisp.enumeration.m.c.aTk atkE = bVar.a.e();
        while (atkE.hasNext()) {
            Map.Entry entry = (Map.Entry) atkE.next();
            bundle2.putBundle((String) entry.getKey(), ((b.aIh) entry.getValue()).b());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
