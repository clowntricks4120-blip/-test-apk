package androidx.lifecycle;

import ivas.gov.bisp.enumeration.p027b.InterfaceC0105b;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    public static /* synthetic */ class aLY {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[aLZ.values().length];
            b = iArr;
            try {
                iArr[aLZ.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[aLZ.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[aLZ.ON_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[aLZ.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[aLZ.ON_RESUME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[aLZ.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[aLZ.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[aMa.values().length];
            a = iArr2;
            try {
                iArr2[2] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[3] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[4] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[0] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[1] = 5;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public enum aLZ {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;

        public static aLZ c(aMa ama) {
            int iOrdinal = ama.ordinal();
            if (iOrdinal == 1) {
                return ON_CREATE;
            }
            if (iOrdinal == 2) {
                return ON_START;
            }
            if (iOrdinal != 3) {
                return null;
            }
            return ON_RESUME;
        }

        public final aMa f() {
            switch (aLY.b[ordinal()]) {
                case 1:
                case 2:
                    return aMa.CREATED;
                case 3:
                case 4:
                    return aMa.STARTED;
                case 5:
                    return aMa.RESUMED;
                case 6:
                    return aMa.DESTROYED;
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append(this);
                    sb.append(" has no target state");
                    throw new IllegalArgumentException(sb.toString());
            }
        }
    }

    public enum aMa {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED
    }

    public d() {
        new AtomicReference();
    }

    public abstract void b(InterfaceC0105b interfaceC0105b);

    public abstract void c(InterfaceC0105b interfaceC0105b);
}
