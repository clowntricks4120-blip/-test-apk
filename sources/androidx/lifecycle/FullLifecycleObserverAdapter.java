package androidx.lifecycle;

import ivas.gov.bisp.enumeration.p027b.B;

/* JADX INFO: loaded from: classes.dex */
class FullLifecycleObserverAdapter implements a {
    public final B a;
    public final a b;

    public static /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[d.aLZ.values().length];
            a = iArr;
            try {
                iArr[d.aLZ.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[d.aLZ.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[d.aLZ.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[d.aLZ.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[d.aLZ.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[d.aLZ.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[d.aLZ.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public FullLifecycleObserverAdapter(B b, a aVar) {
        this.a = b;
        this.b = aVar;
    }

    @Override // androidx.lifecycle.a
    public void a(ivas.gov.bisp.enumeration.p027b.d dVar, d.aLZ alz) {
        switch (OooO00o.a[alz.ordinal()]) {
            case 1:
                this.a.e(dVar);
                break;
            case 2:
                this.a.f(dVar);
                break;
            case 3:
                this.a.g(dVar);
                break;
            case 4:
                this.a.d(dVar);
                break;
            case 5:
                this.a.b(dVar);
                break;
            case 6:
                this.a.c(dVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        a aVar = this.b;
        if (aVar != null) {
            aVar.a(dVar, alz);
        }
    }
}
