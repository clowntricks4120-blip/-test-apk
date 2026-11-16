package ivas.gov.bisp.enumeration.p050bw;

import ivas.gov.bisp.enumeration.o000O0o.o000O000;
import ivas.gov.bisp.enumeration.p032be.c;
import ivas.gov.bisp.enumeration.p032be.j;
import ivas.gov.bisp.enumeration.p035bh.C;
import ivas.gov.bisp.enumeration.p035bh.E;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bw.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0226j<E> extends o000O000<Object> {
    private static int a = 1;
    private static int b;
    public static final E c = new brU();
    public final Class<E> d;
    public final o000O000<E> e;

    static {
        int i = b;
        int i2 = i & 53;
        int i3 = (i | 53) & (~i2);
        int i4 = -(-(i2 << 1));
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        a = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public C0226j(C c2, o000O000<E> o000o000, Class<E> cls) {
        this.e = new o(c2, o000o000, cls);
        this.d = cls;
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bw.j$brU */
    public class brU implements E {
        private static int a = 1;
        private static int b;

        /* JADX WARN: Code restructure failed: missing block: B:9:0x004e, code lost:
        
            if (((java.lang.Class) r8).isArray() == false) goto L13;
         */
        @Override // ivas.gov.bisp.enumeration.p035bh.E
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public <T> ivas.gov.bisp.enumeration.o000O0o.o000O000<T> b(ivas.gov.bisp.enumeration.p035bh.C r7, com.google.gson.reflect.TypeToken<T> r8) {
            /*
                Method dump skipped, instruction units count: 236
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p050bw.C0226j.brU.b(ivas.gov.bisp.enumeration.bh.C, com.google.gson.reflect.TypeToken):ivas.gov.bisp.enumeration.bh.ad");
        }
    }

    public final void d(c cVar, Object obj) throws IOException {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 17) << 1) - (i2 ^ 17);
        a = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = 0;
        if (obj == null) {
            int i5 = (((i2 ^ 55) | (i2 & 55)) << 1) - (((~i2) & 55) | (i2 & (-56)));
            a = i5 % 128;
            int i6 = i5 % 2;
            cVar.c();
            int i7 = a;
            int i8 = (i7 ^ 16) + ((i7 & 16) << 1);
            int i9 = (i8 ^ (-1)) + (i8 << 1);
            b = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 27 / 0;
                return;
            }
            return;
        }
        cVar.e();
        int length = Array.getLength(obj);
        int i11 = a;
        int i12 = i11 & 7;
        int i13 = -(-((i11 ^ 7) | i12));
        int i14 = (i12 & i13) + (i13 | i12);
        b = i14 % 128;
        int i15 = i14 % 2;
        while (i4 < length) {
            int i16 = b;
            int i17 = (i16 | 63) << 1;
            int i18 = -(i16 ^ 63);
            int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
            a = i19 % 128;
            int i20 = i19 % 2;
            Object obj3 = Array.get(obj, i4);
            o000O000<E> o000o000 = this.e;
            int i21 = b;
            int i22 = i21 & 11;
            int i23 = -(-(i21 | 11));
            int i24 = (i22 & i23) + (i23 | i22);
            a = i24 % 128;
            if (i24 % 2 == 0) {
                o000o000.d(cVar, obj3);
                i4 = ((i4 ^ 98) - (~(-(-((i4 & 98) << 1))))) - 1;
            } else {
                o000o000.d(cVar, obj3);
                i4++;
            }
            int i25 = b + 115;
            a = i25 % 128;
            int i26 = i25 % 2;
        }
        cVar.i();
        int i27 = a;
        int i28 = i27 & 63;
        int i29 = (((i27 ^ 63) | i28) << 1) - ((i27 | 63) & (~i28));
        b = i29 % 128;
        int i30 = i29 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object c(j jVar) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (-2) - ((((i2 | 118) << 1) - (i2 ^ 118)) ^ (-1));
        a = i3 % 128;
        int i4 = 0;
        Object obj = null;
        if (i3 % 2 != 0 ? jVar.y() == 9 : jVar.y() == 42) {
            jVar.s();
            int i5 = b;
            int i6 = (i5 & 99) + (i5 | 99);
            a = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 48 / 0;
            }
            return null;
        }
        ArrayList arrayList = new ArrayList();
        jVar.d();
        int i8 = b + 51;
        a = i8 % 128;
        while (true) {
            int i9 = i8 % 2;
            if (!jVar.c()) {
                jVar.i();
                int size = arrayList.size();
                Class<E> cls = this.d;
                int i10 = a + 1;
                b = i10 % 128;
                int i11 = i10 % 2;
                Object objNewInstance = Array.newInstance((Class<?>) cls, size);
                int i12 = a;
                int i13 = i12 & 49;
                int i14 = (i12 ^ 49) | i13;
                int i15 = (i13 & i14) + (i14 | i13);
                b = i15 % 128;
                int i16 = i15 % 2;
                while (i4 < size) {
                    int i17 = b;
                    int i18 = ((i17 & 88) + (i17 | 88)) - 1;
                    a = i18 % 128;
                    int i19 = i18 % 2;
                    Array.set(objNewInstance, i4, arrayList.get(i4));
                    if (i19 == 0) {
                        i4 += 26;
                    } else {
                        int i20 = i4 & (-25);
                        int i21 = (((i4 ^ (-25)) | i20) << 1) - ((i4 | (-25)) & (~i20));
                        int i22 = i21 & 26;
                        int i23 = ((i21 ^ 26) | i22) << 1;
                        int i24 = -((i21 | 26) & (~i22));
                        i4 = (i23 ^ i24) + ((i23 & i24) << 1);
                    }
                }
                int i25 = b;
                int i26 = i25 ^ 1;
                int i27 = (((i25 & 1) | i26) << 1) - i26;
                a = i27 % 128;
                if (i27 % 2 != 0) {
                    return objNewInstance;
                }
                throw null;
            }
            int i28 = a;
            int i29 = i28 & 91;
            int i30 = -(-((i28 ^ 91) | i29));
            int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
            b = i31 % 128;
            if (i31 % 2 != 0) {
                arrayList.add(this.e.c(jVar));
                throw null;
            }
            arrayList.add(this.e.c(jVar));
            int i32 = b;
            int i33 = (i32 ^ 71) + ((i32 & 71) << 1);
            int i34 = i33 % 128;
            a = i34;
            if (i33 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i35 = i34 & 37;
            i8 = ((i34 | 37) & (~i35)) + (i35 << 1);
            b = i8 % 128;
        }
    }
}
