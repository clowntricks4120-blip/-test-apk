package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
class ReflectiveGenericLifecycleObserver implements a {
    public final Object a;
    public final b.aLV b;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.a = obj;
        this.b = b.a.d(obj.getClass());
    }

    @Override // androidx.lifecycle.a
    public void a(ivas.gov.bisp.enumeration.p027b.d dVar, d.aLZ alz) {
        b.aLV alv = this.b;
        Object obj = this.a;
        b.aLV.b(alv.a.get(alz), dVar, alz, obj);
        b.aLV.b(alv.a.get(d.aLZ.ON_ANY), dVar, alz, obj);
    }
}
