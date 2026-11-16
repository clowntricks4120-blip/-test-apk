package ivas.gov.bisp.enumeration.db;

import android.content.Context;
import ivas.gov.bisp.enumeration.bN.C0130y;
import ivas.gov.bisp.enumeration.p100w.r;
import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class j {
    private static int a = 1;
    private static int b;
    public final Context c;

    public static final class bIC<T> implements Comparator {
        private static int a = 1;
        private static int b;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 | 125) << 1) - (i2 ^ 125);
            b = i3 % 128;
            int i4 = i3 % 2;
            Long lValueOf = Long.valueOf(((File) t).lastModified());
            int i5 = b;
            int i6 = i5 & 99;
            int i7 = (i5 ^ 99) | i6;
            int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
            a = i8 % 128;
            int i9 = i8 % 2;
            int iL = r.l(lValueOf, Long.valueOf(((File) t2).lastModified()));
            int i10 = b;
            int i11 = (i10 ^ 95) + ((i10 & 95) << 1);
            a = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 89 / 0;
            }
            return iL;
        }
    }

    public j(Context context) {
        this.c = context;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:22:0x00da  */
    public final File[] c() {
        File[] fileArr;
        Object[] array;
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 55;
        int i5 = (((i3 | 55) & (~i4)) - (~(i4 << 1))) - 1;
        b = i5 % 128;
        int i6 = i5 % 2;
        File dir = this.c.getDir("ACRA-approved", 0);
        ivas.gov.bisp.enumeration.O.r.m(dir, "context.getDir(APPROVED_…ME, Context.MODE_PRIVATE)");
        Object[] objArrListFiles = dir.listFiles();
        if (objArrListFiles != null) {
            bIC bic = new bIC();
            Object obj = null;
            if (objArrListFiles.length == 0) {
                int i7 = b;
                int i8 = i7 & 105;
                int i9 = -(-((i7 ^ 105) | i8));
                int i10 = (i8 & i9) + (i9 | i8);
                int i11 = i10 % 128;
                a = i11;
                boolean z = i10 % 2 != 0;
                int i12 = (i11 & 125) + (i11 | 125);
                b = i12 % 128;
                int i13 = i12 % 2;
                if (!z) {
                }
                array = C0130y.am(objArrListFiles).toArray(new File[0]);
                int i14 = b;
                int i15 = i14 & 27;
                int i16 = -(-((i14 ^ 27) | i15));
                i = ((i15 | i16) << 1) - (i16 ^ i15);
                a = i % 128;
                if (i % 2 != 0) {
                    ivas.gov.bisp.enumeration.O.r.e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    obj.hashCode();
                    throw null;
                }
                ivas.gov.bisp.enumeration.O.r.e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                fileArr = (File[]) array;
            } else {
                int i17 = a;
                int i18 = i17 & 53;
                int i19 = (i17 ^ 53) | i18;
                int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
                b = i20 % 128;
                int i21 = i20 % 2;
            }
            int i22 = b;
            int i23 = i22 & 11;
            int i24 = i23 + ((i22 ^ 11) | i23);
            a = i24 % 128;
            if (i24 % 2 == 0) {
                ivas.gov.bisp.enumeration.O.r.m(Arrays.copyOf(objArrListFiles, objArrListFiles.length), "copyOf(this, size)");
                throw null;
            }
            objArrListFiles = Arrays.copyOf(objArrListFiles, objArrListFiles.length);
            ivas.gov.bisp.enumeration.O.r.m(objArrListFiles, "copyOf(this, size)");
            int i25 = a;
            int i26 = (i25 & 63) + (i25 | 63);
            b = i26 % 128;
            int i27 = i26 % 2;
            if (objArrListFiles.length > 1) {
                int i28 = i25 ^ 121;
                int i29 = (((i25 & 121) | i28) << 1) - i28;
                b = i29 % 128;
                int i30 = i29 % 2;
                Arrays.sort(objArrListFiles, bic);
                int i31 = a;
                int i32 = i31 & 123;
                int i33 = ((((i31 ^ 123) | i32) << 1) - (~(-((i31 | 123) & (~i32))))) - 1;
                b = i33 % 128;
                int i34 = i33 % 2;
            }
            array = C0130y.am(objArrListFiles).toArray(new File[0]);
            int i110 = b;
            int i111 = i110 & 27;
            int i112 = -(-((i110 ^ 27) | i111));
            i = ((i111 | i112) << 1) - (i112 ^ i111);
            a = i % 128;
            if (i % 2 != 0) {
                ivas.gov.bisp.enumeration.O.r.e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                obj.hashCode();
                throw null;
            }
            ivas.gov.bisp.enumeration.O.r.e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            fileArr = (File[]) array;
        } else {
            fileArr = new File[0];
            int i35 = a;
            int i36 = (i35 ^ 1) + ((i35 & 1) << 1);
            b = i36 % 128;
            int i37 = i36 % 2;
        }
        int i38 = b;
        int i39 = (-2) - (((i38 ^ 54) + ((i38 & 54) << 1)) ^ (-1));
        a = i39 % 128;
        int i40 = i39 % 2;
        return fileArr;
    }
}
