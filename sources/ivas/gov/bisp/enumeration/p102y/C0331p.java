package ivas.gov.bisp.enumeration.p102y;

import ivas.gov.bisp.enumeration.o000O0O.o0OoOo0;
import ivas.gov.bisp.enumeration.p035bh.X;
import ivas.gov.bisp.enumeration.p091n.j;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.y.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0331p implements o0OoOo0<Object> {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ Type c;

    public C0331p(r rVar, Type type) {
        this.c = type;
    }

    public Object d() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 49;
        int i4 = -(-((i2 ^ 49) | i3));
        int i5 = (i3 & i4) + (i4 | i3);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        Type type = this.c;
        if (!(type instanceof ParameterizedType)) {
            StringBuilder sbW = j.w("Invalid EnumSet type: ");
            sbW.append(this.c.toString());
            throw new X(sbW.toString());
        }
        int i8 = (i6 ^ 46) + ((i6 & 46) << 1);
        int i9 = (i8 ^ (-1)) + (i8 << 1);
        a = i9 % 128;
        int i10 = i9 % 2;
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (!(type2 instanceof Class)) {
            StringBuilder sbW2 = j.w("Invalid EnumSet type: ");
            sbW2.append(this.c.toString());
            throw new X(sbW2.toString());
        }
        int i11 = a + 31;
        b = i11 % 128;
        Object obj = null;
        Class cls = (Class) type2;
        if (i11 % 2 == 0) {
            EnumSet.noneOf(cls);
            obj.hashCode();
            throw null;
        }
        EnumSet enumSetNoneOf = EnumSet.noneOf(cls);
        int i12 = a;
        int i13 = (((i12 ^ 47) | (i12 & 47)) << 1) - (((~i12) & 47) | (i12 & (-48)));
        b = i13 % 128;
        if (i13 % 2 != 0) {
            return enumSetNoneOf;
        }
        obj.hashCode();
        throw null;
    }
}
