package ivas.gov.bisp.enumeration.p035bh;

import ivas.gov.bisp.enumeration.o000O0o.o000O000;
import ivas.gov.bisp.enumeration.p032be.c;
import ivas.gov.bisp.enumeration.p032be.j;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: loaded from: classes.dex */
public class V extends o000O000<AtomicLongArray> {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ ad c;

    public V(ad adVar) {
        this.c = adVar;
    }

    public void d(c cVar, Object obj) throws IOException {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-96)) | ((~i2) & 95);
        int i4 = (i2 & 95) << 1;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        Object obj2 = null;
        if (i5 % 2 == 0) {
            cVar.e();
            ((AtomicLongArray) obj).length();
            throw null;
        }
        AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
        cVar.e();
        int length = atomicLongArray.length();
        int i6 = b;
        int i7 = i6 & 63;
        int i8 = (i7 - (~(-(-((i6 ^ 63) | i7))))) - 1;
        a = i8 % 128;
        int i9 = i8 % 2;
        int i10 = 0;
        while (i10 < length) {
            int i11 = a + 75;
            b = i11 % 128;
            if (i11 % 2 != 0) {
                this.c.d(cVar, Long.valueOf(atomicLongArray.get(i10)));
                obj2.hashCode();
                throw null;
            }
            this.c.d(cVar, Long.valueOf(atomicLongArray.get(i10)));
            int i12 = i10 ^ 61;
            int i13 = -(-((i10 & 61) << 1));
            int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
            int i15 = ((i14 ^ (-60)) | (i14 & (-60))) << 1;
            int i16 = -((i14 & 59) | ((~i14) & (-60)));
            i10 = ((i15 & i16) << 1) + (i15 ^ i16);
            int i17 = b + 91;
            a = i17 % 128;
            int i18 = i17 % 2;
        }
        cVar.i();
        int i19 = b;
        int i20 = i19 ^ 123;
        int i21 = -(-((i19 & 123) << 1));
        int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
        a = i22 % 128;
        if (i22 % 2 != 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    public Object c(j jVar) {
        long jLongValue;
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        jVar.d();
        int i2 = a;
        int i3 = i2 & 49;
        int i4 = (i3 - (~(-(-((i2 ^ 49) | i3))))) - 1;
        b = i4 % 128;
        while (true) {
            int i5 = i4 % 2;
            if (!jVar.c()) {
                break;
            }
            int i6 = b;
            int i7 = (i6 ^ 107) + ((i6 & 107) << 1);
            a = i7 % 128;
            int i8 = i7 % 2;
            Number number = (Number) this.c.c(jVar);
            int i9 = a + 109;
            b = i9 % 128;
            int i10 = i9 % 2;
            Long lValueOf = Long.valueOf(number.longValue());
            int i11 = a;
            int i12 = i11 & 1;
            int i13 = -(-((i11 ^ 1) | i12));
            int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
            b = i14 % 128;
            int i15 = i14 % 2;
            arrayList.add(lValueOf);
            int i16 = a;
            i4 = (i16 & 79) + (i16 | 79);
            b = i4 % 128;
        }
        jVar.i();
        int size = arrayList.size();
        AtomicLongArray atomicLongArray = new AtomicLongArray(size);
        int i17 = a;
        int i18 = ((i17 | 115) << 1) - (i17 ^ 115);
        b = i18 % 128;
        int i19 = i18 % 2;
        int i20 = i17 & 95;
        int i21 = -(-((i17 ^ 95) | i20));
        int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
        b = i22 % 128;
        int i23 = i22 % 2;
        int i24 = 0;
        while (i24 < size) {
            int i25 = b + 92;
            int i26 = (i25 ^ (-1)) + (i25 << 1);
            a = i26 % 128;
            if (i26 % 2 == 0) {
                jLongValue = ((Long) arrayList.get(i24)).longValue();
                int i27 = 88 / 0;
            } else {
                jLongValue = ((Long) arrayList.get(i24)).longValue();
            }
            atomicLongArray.set(i24, jLongValue);
            int i28 = (-2) - ((i24 - 70) ^ (-1));
            int i29 = i28 & 72;
            i24 = (i29 - (~((i28 ^ 72) | i29))) - 1;
            int i30 = b;
            int i31 = ((i30 | 115) << 1) - (i30 ^ 115);
            a = i31 % 128;
            int i32 = i31 % 2;
        }
        int i33 = b;
        int i34 = i33 & 103;
        int i35 = -(-((i33 ^ 103) | i34));
        int i36 = ((i34 | i35) << 1) - (i35 ^ i34);
        a = i36 % 128;
        int i37 = i36 % 2;
        return atomicLongArray;
    }
}
