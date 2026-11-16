package ivas.gov.bisp.enumeration.p016ap;

import ivas.gov.bisp.enumeration.OooOOoo.OooOo00;
import ivas.gov.bisp.enumeration.OoooOoO.o00;
import ivas.gov.bisp.enumeration.OoooOoO.o000OOo0;
import ivas.gov.bisp.enumeration.p001aa.u;
import ivas.gov.bisp.enumeration.p027b.G;
import ivas.gov.bisp.enumeration.p027b.H;
import ivas.gov.bisp.enumeration.p027b.an;
import ivas.gov.bisp.enumeration.p027b.ap;
import ivas.gov.bisp.enumeration.p027b.d;
import ivas.gov.bisp.enumeration.p027b.w;
import ivas.gov.bisp.enumeration.p091n.j;
import ivas.gov.bisp.enumeration.p100w.r;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class ar extends ao {
    private static int a = 1;
    private static int b;
    public final d c;
    public final aZt d;

    public static class aZt extends ap {
        private static int a = 0;
        private static int b = 1;
        public static final w e = new aZu();
        public OooOo00<aZs> f = new u();

        public static final class aZu implements w {
            private static int a = 0;
            private static int b = 1;

            @Override // ivas.gov.bisp.enumeration.p027b.w
            public final <T extends ap> T b(Class<T> cls) {
                int i = 2 % 2;
                aZt azt = new aZt();
                int i2 = a;
                int i3 = i2 & 105;
                int i4 = (i3 - (~(-(-((i2 ^ 105) | i3))))) - 1;
                b = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 9 / 0;
                }
                return azt;
            }
        }

        static {
            int i = a;
            int i2 = ((i | 11) << 1) - (i ^ 11);
            b = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 38 / 0;
            }
        }

        @Override // ivas.gov.bisp.enumeration.p027b.ap
        public void c() {
            Object[] objArr;
            int i;
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = i3 & 51;
            int i5 = i4 + ((i3 ^ 51) | i4);
            a = i5 % 128;
            int i6 = i5 % 2;
            OooOo00<aZs> oooOo00 = this.f;
            int i7 = oooOo00.f;
            if (i7 > 0) {
                Objects.requireNonNull((aZs) oooOo00.e[0]);
                throw null;
            }
            int i8 = b;
            int i9 = i8 & 59;
            int i10 = ((i8 | 59) & (~i9)) + (i9 << 1);
            a = i10 % 128;
            if (i10 % 2 != 0) {
                objArr = oooOo00.e;
                i = 1;
            } else {
                objArr = oooOo00.e;
                i = 0;
            }
            int i11 = b;
            int i12 = i11 ^ 89;
            int i13 = (((i11 & 89) | i12) << 1) - i12;
            a = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 2 % 3;
            }
            while (i < i7) {
                int i15 = a;
                int i16 = i15 ^ 117;
                int i17 = ((i15 & 117) | i16) << 1;
                int i18 = -i16;
                int i19 = (i17 & i18) + (i17 | i18);
                b = i19 % 128;
                if (i19 % 2 == 0) {
                    objArr[i] = null;
                    int i20 = ((i ^ 29) | (i & 29)) << 1;
                    int i21 = -(((~i) & 29) | (i & (-30)));
                    int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
                    int i23 = (i22 & (-47)) | ((~i22) & 46);
                    int i24 = (i22 & 46) << 1;
                    i = (i23 ^ i24) + ((i23 & i24) << 1);
                } else {
                    objArr[i] = null;
                    int i25 = ((i & 111) | ((~i) & (-112))) + ((i & (-112)) << 1);
                    i = (((i25 | 114) << 1) - (i25 ^ 114)) - 1;
                }
            }
            oooOo00.f = 0;
            int i26 = b + 39;
            a = i26 % 128;
            int i27 = i26 % 2;
        }
    }

    public ar(d dVar, an anVar) {
        ap apVarB;
        this.c = dVar;
        Object obj = aZt.e;
        String canonicalName = aZt.class.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        String strR = j.r("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
        HashMap<String, ap> map = anVar.a;
        int i = a;
        int i2 = ((i ^ 74) + ((i & 74) << 1)) - 1;
        b = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            aZt.class.isInstance(map.get(strR));
            throw null;
        }
        ap apVar = map.get(strR);
        if (aZt.class.isInstance(apVar)) {
            int i3 = a;
            int i4 = (((i3 ^ 101) | (i3 & 101)) << 1) - (((~i3) & 101) | (i3 & (-102)));
            b = i4 % 128;
            if (i4 % 2 != 0) {
                boolean z = obj instanceof G;
                obj2.hashCode();
                throw null;
            }
            if (obj instanceof G) {
                ((G) obj).c(apVar);
                int i5 = a;
                int i6 = (i5 ^ 19) + ((i5 & 19) << 1);
                b = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 2 % 2;
                }
            }
        } else {
            if (obj instanceof H) {
                int i8 = a;
                int i9 = (((i8 | 66) << 1) - (i8 ^ 66)) - 1;
                b = i9 % 128;
                int i10 = i9 % 2;
                apVarB = ((H) obj).d(strR, aZt.class);
                int i11 = b;
                int i12 = (i11 ^ 27) + ((i11 & 27) << 1);
                a = i12 % 128;
                int i13 = i12 % 2;
                int i14 = 2 % 2;
            } else {
                apVarB = ((aZt.aZu) obj).b(aZt.class);
                int i15 = a;
                int i16 = (i15 ^ 109) + ((i15 & 109) << 1);
                b = i16 % 128;
                int i17 = i16 % 2;
                int i18 = 2 % 2;
            }
            apVar = apVarB;
            ap apVarPut = anVar.a.put(strR, apVar);
            int i19 = b;
            int i20 = ((i19 ^ 83) - (~(-(-((i19 & 83) << 1))))) - 1;
            int i21 = i20 % 128;
            a = i21;
            int i22 = i20 % 2;
            if (apVarPut != null) {
                int i23 = (-2) - ((i21 + 22) ^ (-1));
                b = i23 % 128;
                int i24 = i23 % 2;
                apVarPut.c();
                int i25 = b;
                int i26 = (i25 ^ 95) + ((i25 & 95) << 1);
                a = i26 % 128;
                if (i26 % 2 != 0) {
                    int i27 = 2 % 2;
                }
            }
        }
        this.d = (aZt) apVar;
        int i28 = b;
        int i29 = i28 & 1;
        int i30 = (i28 ^ 1) | i29;
        int i31 = (i29 & i30) + (i30 | i29);
        a = i31 % 128;
        int i32 = i31 % 2;
    }

    public String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder(128);
        int i2 = b;
        int i3 = i2 & 121;
        int i4 = -(-((i2 ^ 121) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        int i7 = b;
        int i8 = i7 & 53;
        int i9 = -(-((i7 ^ 53) | i8));
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        a = i10 % 128;
        if (i10 % 2 == 0) {
            sb.append(" in ");
            r.g(this.c, sb);
            int i11 = 22 / 0;
        } else {
            sb.append(" in ");
            r.g(this.c, sb);
        }
        sb.append("}}");
        String string = sb.toString();
        int i12 = b;
        int i13 = (i12 & (-38)) | ((~i12) & 37);
        int i14 = -(-((i12 & 37) << 1));
        int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
        a = i15 % 128;
        int i16 = i15 % 2;
        return string;
    }

    public static class aZs<D> extends o000OOo0<D> {
        private static int k = 1;
        private static int l;

        public void g() {
            int i = 2 % 2;
            int i2 = k;
            int i3 = (-2) - ((((i2 | 120) << 1) - (i2 ^ 120)) ^ (-1));
            l = i3 % 128;
            int i4 = i3 % 2;
            throw null;
        }

        public void h() {
            int i = 2 % 2;
            int i2 = l;
            int i3 = (i2 & 1) + (i2 | 1);
            k = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            int i4 = 55 / 0;
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void i(o00<? super D> o00Var) {
            int i = 2 % 2;
            int i2 = (-2) - ((l + 28) ^ (-1));
            k = i2 % 128;
            int i3 = i2 % 2;
            super.i(o00Var);
            if (i3 == 0) {
                int i4 = 95 / 0;
            }
        }

        public void j(D d) {
            int i = 2 % 2;
            int i2 = l;
            int i3 = (i2 & 15) + (i2 | 15);
            k = i3 % 128;
            int i4 = i3 % 2;
            super.j(d);
            int i5 = k;
            int i6 = ((i5 | 29) << 1) - (i5 ^ 29);
            l = i6 % 128;
            int i7 = i6 % 2;
        }

        public String toString() {
            int i = 2 % 2;
            StringBuilder sb = new StringBuilder(64);
            int i2 = l;
            int i3 = ((i2 & 58) + (i2 | 58)) - 1;
            k = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                sb.append("LoaderInfo{");
                Integer.toHexString(System.identityHashCode(this));
                throw null;
            }
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            int i4 = l;
            int i5 = i4 & 77;
            int i6 = (i4 ^ 77) | i5;
            int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
            k = i7 % 128;
            int i8 = i7 % 2;
            sb.append(0);
            sb.append(" : ");
            int i9 = l;
            int i10 = ((i9 ^ 19) | (i9 & 19)) << 1;
            int i11 = -(((~i9) & 19) | (i9 & (-20)));
            int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
            k = i12 % 128;
            int i13 = i12 % 2;
            r.g(null, sb);
            sb.append("}}");
            int i14 = k;
            int i15 = i14 & 1;
            int i16 = (i15 - (~((i14 ^ 1) | i15))) - 1;
            l = i16 % 128;
            int i17 = i16 % 2;
            String string = sb.toString();
            int i18 = l;
            int i19 = (i18 & (-44)) | ((~i18) & 43);
            int i20 = (i18 & 43) << 1;
            int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
            k = i21 % 128;
            if (i21 % 2 != 0) {
                return string;
            }
            obj.hashCode();
            throw null;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p016ap.ao
    @Deprecated
    public void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 49;
        int i4 = (((i2 & 49) | i3) << 1) - i3;
        b = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            int i5 = this.d.f.f;
            obj.hashCode();
            throw null;
        }
        aZt azt = this.d;
        if (azt.f.f > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            StringBuilder sb = new StringBuilder();
            int i6 = a;
            int i7 = ((i6 | 121) << 1) - (i6 ^ 121);
            b = i7 % 128;
            int i8 = i7 % 2;
            sb.append(str);
            int i9 = b;
            int i10 = ((i9 ^ 24) + ((i9 & 24) << 1)) - 1;
            a = i10 % 128;
            int i11 = i10 % 2;
            sb.append("    ");
            String string = sb.toString();
            int i12 = a;
            int i13 = (i12 & (-2)) | ((~i12) & 1);
            int i14 = -(-((i12 & 1) << 1));
            int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
            b = i15 % 128;
            int i16 = i15 % 2;
            OooOo00<aZs> oooOo00 = azt.f;
            if (oooOo00.f > 0) {
                int i17 = b;
                int i18 = (i17 ^ 100) + ((i17 & 100) << 1);
                int i19 = (i18 ^ (-1)) + (i18 << 1);
                a = i19 % 128;
                aZs azs = (aZs) (i19 % 2 == 0 ? oooOo00.e[1] : oooOo00.e[0]);
                printWriter.print(str);
                printWriter.print("  #");
                OooOo00<aZs> oooOo01 = azt.f;
                int i20 = a;
                int i21 = i20 ^ 83;
                int i22 = (((i20 & 83) | i21) << 1) - i21;
                b = i22 % 128;
                int i23 = i22 % 2;
                printWriter.print(oooOo01.d[0]);
                int i24 = a;
                int i25 = i24 & 51;
                int i26 = -(-((i24 ^ 51) | i25));
                int i27 = (i25 & i26) + (i26 | i25);
                b = i27 % 128;
                if (i27 % 2 != 0) {
                    printWriter.print(": ");
                    printWriter.println(azs.toString());
                    int i28 = 15 / 0;
                } else {
                    printWriter.print(": ");
                    printWriter.println(azs.toString());
                }
                printWriter.print(string);
                printWriter.print("mId=");
                int i29 = a + 71;
                b = i29 % 128;
                int i30 = i29 % 2;
                printWriter.print(0);
                printWriter.print(" mArgs=");
                printWriter.println((Object) null);
                int i31 = a + 49;
                b = i31 % 128;
                int i32 = i31 % 2;
                printWriter.print(string);
                printWriter.print("mLoader=");
                int i33 = b;
                int i34 = (i33 & 61) + (i33 | 61);
                a = i34 % 128;
                if (i34 % 2 == 0) {
                    printWriter.println((Object) null);
                    throw null;
                }
                printWriter.println((Object) null);
                throw null;
            }
        }
        int i35 = (-2) - ((b + 120) ^ (-1));
        a = i35 % 128;
        if (i35 % 2 == 0) {
            throw null;
        }
    }
}
