package androidx.lifecycle;

import ivas.gov.bisp.enumeration.p087j.Q;

/* JADX INFO: loaded from: classes.dex */
class CompositeGeneratedAdaptersObserver implements a {
    public final e[] a;

    public CompositeGeneratedAdaptersObserver(e[] eVarArr) {
        this.a = eVarArr;
    }

    @Override // androidx.lifecycle.a
    public void a(ivas.gov.bisp.enumeration.p027b.d dVar, d.aLZ alz) {
        Q q = new Q(1);
        for (e eVar : this.a) {
            eVar.b(dVar, alz, false, q);
        }
        for (e eVar2 : this.a) {
            eVar2.b(dVar, alz, true, q);
        }
    }
}
