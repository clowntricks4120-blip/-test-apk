package ivas.gov.bisp.enumeration.p050bw;

import com.google.gson.reflect.TypeToken;
import ivas.gov.bisp.enumeration.p032be.c;
import ivas.gov.bisp.enumeration.p032be.j;
import ivas.gov.bisp.enumeration.p035bh.C;
import ivas.gov.bisp.enumeration.p035bh.ad;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public class P extends t.bsh {
    private static int d = 1;
    private static int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Field g;
    public final /* synthetic */ ad h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ C j;
    public final /* synthetic */ TypeToken k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(t tVar, String str, boolean z, boolean z2, Field field, boolean z3, ad adVar, C c, TypeToken typeToken, boolean z4) {
        super(str, z, z2);
        this.g = field;
        this.i = z3;
        int i = d;
        int i2 = i & 123;
        int i3 = (i2 - (~(-(-((i ^ 123) | i2))))) - 1;
        e = i3 % 128;
        int i4 = i3 % 2;
        this.h = adVar;
        this.j = c;
        if (i4 != 0) {
            throw null;
        }
        this.k = typeToken;
        this.f = z4;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0032  */
    @Override // ivas.gov.bisp.enumeration.bw.t.bsh
    public void c(j jVar, Object obj) throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = e;
        int i3 = i2 & 15;
        int i4 = (i3 - (~(-(-((i2 ^ 15) | i3))))) - 1;
        d = i4 % 128;
        int i5 = i4 % 2;
        Object objC = this.h.c(jVar);
        if (objC == null) {
            int i6 = e;
            int i7 = (i6 & 9) + (i6 | 9);
            d = i7 % 128;
            if (i7 % 2 == 0) {
                throw null;
            }
            if (!this.f) {
                this.g.set(obj, objC);
                int i8 = e;
                int i9 = ((i8 & 59) - (~(-(-(i8 | 59))))) - 1;
                d = i9 % 128;
                int i10 = i9 % 2;
            }
        } else {
            this.g.set(obj, objC);
            int i11 = e;
            int i12 = ((i11 & 59) - (~(-(-(i11 | 59))))) - 1;
            d = i12 % 128;
            int i13 = i12 % 2;
        }
        int i14 = e;
        int i15 = i14 & 3;
        int i16 = ((i14 ^ 3) | i15) << 1;
        int i17 = -((i14 | 3) & (~i15));
        int i18 = (i16 & i17) + (i17 | i16);
        d = i18 % 128;
        if (i18 % 2 == 0) {
            int i19 = 78 / 0;
        }
    }

    @Override // ivas.gov.bisp.enumeration.bw.t.bsh
    public boolean e(Object obj) {
        boolean z;
        int i = 2 % 2;
        int i2 = d;
        int i3 = (-2) - (((i2 & 12) + (i2 | 12)) ^ (-1));
        e = i3 % 128;
        if (i3 % 2 == 0 ? !this.b : (!this.b)) {
            int i4 = e;
            int i5 = i4 & 49;
            int i6 = (i4 | 49) & (~i5);
            int i7 = i5 << 1;
            int i8 = ((i6 | i7) << 1) - (i6 ^ i7);
            d = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (this.g.get(obj) != obj) {
            int i10 = e;
            int i11 = (i10 & 61) + (i10 | 61);
            int i12 = i11 % 128;
            d = i12;
            int i13 = i11 % 2;
            int i14 = (-2) - (((i12 & 56) + (i12 | 56)) ^ (-1));
            e = i14 % 128;
            int i15 = i14 % 2;
            z = true;
        } else {
            z = false;
        }
        int i16 = e;
        int i17 = i16 & 11;
        int i18 = -(-((i16 ^ 11) | i17));
        int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
        d = i19 % 128;
        if (i19 % 2 == 0) {
            int i20 = 86 / 0;
        }
        return z;
    }

    @Override // ivas.gov.bisp.enumeration.bw.t.bsh
    public void d(c cVar, Object obj) throws IllegalAccessException {
        ad adVar;
        int i = 2 % 2;
        int i2 = e + 23;
        d = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            this.g.get(obj);
            obj2.hashCode();
            throw null;
        }
        Object obj3 = this.g.get(obj);
        if (!(!this.i)) {
            int i3 = d;
            int i4 = i3 & 35;
            int i5 = (((i3 ^ 35) | i4) << 1) - ((~i4) & (i3 | 35));
            e = i5 % 128;
            int i6 = i5 % 2;
            adVar = this.h;
            int i7 = i3 ^ 21;
            int i8 = (i3 & 21) << 1;
            int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
            e = i9 % 128;
            int i10 = i9 % 2;
        } else {
            o oVar = new o(this.j, this.h, this.k.b);
            int i11 = d;
            int i12 = ((i11 | 97) << 1) - (i11 ^ 97);
            e = i12 % 128;
            if (i12 % 2 != 0) {
                throw null;
            }
            adVar = oVar;
        }
        adVar.d(cVar, obj3);
        int i13 = d;
        int i14 = ((i13 ^ 55) | (i13 & 55)) << 1;
        int i15 = -(((~i13) & 55) | (i13 & (-56)));
        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
        e = i16 % 128;
        int i17 = i16 % 2;
    }
}
