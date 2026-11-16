package ivas.gov.bisp.enumeration.p050bw;

import com.google.gson.reflect.TypeToken;
import ivas.gov.bisp.enumeration.o000O0O.o0OoOo0;
import ivas.gov.bisp.enumeration.o000O0o.o000O000;
import ivas.gov.bisp.enumeration.p032be.j;
import ivas.gov.bisp.enumeration.p035bh.C;
import ivas.gov.bisp.enumeration.p035bh.E;
import ivas.gov.bisp.enumeration.p102y.C0328j;
import ivas.gov.bisp.enumeration.p102y.r;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class c implements E {
    private static int a = 0;
    private static int b = 1;
    public final r c;

    public static final class brW<E> extends o000O000<Collection<E>> {
        private static int a = 0;
        private static int b = 1;
        public final o000O000<E> c;
        public final o0OoOo0<? extends Collection<E>> d;

        public brW(C c, Type type, o000O000<E> o000o000, o0OoOo0<? extends Collection<E>> o0oooo0) {
            this.c = new o(c, o000o000, type);
            this.d = o0oooo0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Object c(j jVar) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 & (-58)) | ((~i2) & 57)) + ((i2 & 57) << 1);
            a = i3 % 128;
            int i4 = i3 % 2;
            Object obj = null;
            Object obj2 = null;
            if (jVar.y() == 9) {
                int i5 = a;
                int i6 = i5 & 9;
                int i7 = ((i5 ^ 9) | i6) << 1;
                int i8 = -((i5 | 9) & (~i6));
                int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
                b = i9 % 128;
                int i10 = i9 % 2;
                jVar.s();
                int i11 = a;
                int i12 = ((i11 ^ 9) | (i11 & 9)) << 1;
                int i13 = -(((~i11) & 9) | (i11 & (-10)));
                int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
                b = i14 % 128;
                int i15 = i14 % 2;
            } else {
                Collection collection = (Collection) this.d.d();
                int i16 = b;
                int i17 = (i16 ^ 39) + ((i16 & 39) << 1);
                a = i17 % 128;
                if (i17 % 2 != 0) {
                    jVar.d();
                    obj.hashCode();
                    throw null;
                }
                jVar.d();
                int i18 = a;
                int i19 = ((i18 & (-12)) | ((~i18) & 11)) + ((i18 & 11) << 1);
                b = i19 % 128;
                int i20 = i19 % 2;
                while (jVar.c()) {
                    int i21 = a;
                    int i22 = i21 & 9;
                    int i23 = i22 + ((i21 ^ 9) | i22);
                    b = i23 % 128;
                    int i24 = i23 % 2;
                    Object objC = this.c.c(jVar);
                    int i25 = b;
                    int i26 = (i25 & (-2)) | ((~i25) & 1);
                    int i27 = (i25 & 1) << 1;
                    int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
                    a = i28 % 128;
                    int i29 = i28 % 2;
                    collection.add(objC);
                    int i30 = b + 85;
                    a = i30 % 128;
                    int i31 = i30 % 2;
                }
                jVar.i();
                int i32 = b + 27;
                a = i32 % 128;
                int i33 = i32 % 2;
                obj2 = collection;
            }
            int i34 = a;
            int i35 = (((i34 ^ 109) | (i34 & 109)) << 1) - (((~i34) & 109) | (i34 & (-110)));
            b = i35 % 128;
            int i36 = i35 % 2;
            return obj2;
        }

        public final void d(ivas.gov.bisp.enumeration.p032be.c cVar, Object obj) throws IOException {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (-2) - (((i2 & 118) + (i2 | 118)) ^ (-1));
            b = i3 % 128;
            int i4 = i3 % 2;
            Collection collection = (Collection) obj;
            if (collection == null) {
                int i5 = i2 & 97;
                int i6 = i5 + ((i2 ^ 97) | i5);
                b = i6 % 128;
                int i7 = i6 % 2;
                cVar.c();
                int i8 = a;
                int i9 = i8 & 55;
                int i10 = (i8 ^ 55) | i9;
                int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
                b = i11 % 128;
                if (i11 % 2 == 0) {
                    throw null;
                }
                return;
            }
            cVar.e();
            Iterator<E> it = collection.iterator();
            int i12 = a;
            int i13 = (-2) - ((i12 + 48) ^ (-1));
            b = i13 % 128;
            int i14 = i13 % 2;
            int i15 = i12 + 67;
            b = i15 % 128;
            int i16 = i15 % 2;
            while (!(!it.hasNext())) {
                int i17 = b;
                int i18 = i17 ^ 89;
                int i19 = ((i17 & 89) | i18) << 1;
                int i20 = -i18;
                int i21 = ((i19 | i20) << 1) - (i19 ^ i20);
                a = i21 % 128;
                int i22 = i21 % 2;
                E next = it.next();
                o000O000<E> o000o000 = this.c;
                int i23 = a;
                int i24 = i23 & 63;
                int i25 = i24 + ((i23 ^ 63) | i24);
                b = i25 % 128;
                int i26 = i25 % 2;
                o000o000.d(cVar, next);
                int i27 = b + 111;
                a = i27 % 128;
                int i28 = i27 % 2;
            }
            cVar.i();
            int i29 = b;
            int i30 = i29 & 83;
            int i31 = ((i29 | 83) & (~i30)) + (i30 << 1);
            a = i31 % 128;
            int i32 = i31 % 2;
        }
    }

    public c(r rVar) {
        this.c = rVar;
    }

    @Override // ivas.gov.bisp.enumeration.p035bh.E
    public final <T> o000O000<T> b(C c, TypeToken<T> typeToken) throws Throwable {
        Type type;
        Class<? super T> cls;
        Class<Collection> cls2;
        Type type2;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 29;
        int i4 = ((((i2 ^ 29) | i3) << 1) - (~(-((i2 | 29) & (~i3))))) - 1;
        a = i4 % 128;
        if (i4 % 2 != 0) {
            type = typeToken.b;
            cls = typeToken.a;
            cls2 = Collection.class;
            int i5 = 35 / 0;
        } else {
            type = typeToken.b;
            cls = typeToken.a;
            cls2 = Collection.class;
        }
        int i6 = a;
        int i7 = i6 & 99;
        int i8 = i6 | 99;
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        b = i9 % 128;
        Object obj = null;
        if (i9 % 2 == 0) {
            cls2.isAssignableFrom(cls);
            throw null;
        }
        if (!cls2.isAssignableFrom(cls)) {
            int i10 = b;
            int i11 = i10 & 93;
            int i12 = (~i11) & (i10 | 93);
            int i13 = i11 << 1;
            int i14 = (i12 & i13) + (i13 | i12);
            a = i14 % 128;
            int i15 = i14 % 2;
            int i16 = (i10 | 59) << 1;
            int i17 = -(i10 ^ 59);
            int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
            a = i18 % 128;
            int i19 = i18 % 2;
            return null;
        }
        Type typeG = C0328j.g(type, cls, Collection.class);
        if (!(!(typeG instanceof WildcardType))) {
            int i20 = a + 3;
            b = i20 % 128;
            typeG = i20 % 2 == 0 ? ((WildcardType) typeG).getUpperBounds()[1] : ((WildcardType) typeG).getUpperBounds()[0];
            int i21 = a;
            int i22 = i21 ^ 75;
            int i23 = (((i21 & 75) | i22) << 1) - i22;
            b = i23 % 128;
            int i24 = i23 % 2;
        }
        if (typeG instanceof ParameterizedType) {
            int i25 = a + 7;
            b = i25 % 128;
            type2 = i25 % 2 == 0 ? ((ParameterizedType) typeG).getActualTypeArguments()[1] : ((ParameterizedType) typeG).getActualTypeArguments()[0];
            int i26 = b + 95;
            a = i26 % 128;
            int i27 = i26 % 2;
        } else {
            type2 = Object.class;
            int i28 = a + 11;
            b = i28 % 128;
            int i29 = i28 % 2;
        }
        TypeToken<T> typeToken2 = new TypeToken<>(type2);
        int i30 = b;
        int i31 = ((i30 ^ 8) + ((i30 & 8) << 1)) - 1;
        a = i31 % 128;
        int i32 = i31 % 2;
        brW brw = new brW(c, type2, c.h(typeToken2), this.c.c(typeToken));
        int i33 = a;
        int i34 = (i33 & (-90)) | ((~i33) & 89);
        int i35 = -(-((i33 & 89) << 1));
        int i36 = ((i34 | i35) << 1) - (i35 ^ i34);
        b = i36 % 128;
        if (i36 % 2 != 0) {
            return brw;
        }
        obj.hashCode();
        throw null;
    }
}
