package ivas.gov.bisp.enumeration.B;

import ivas.gov.bisp.enumeration.p004ad.C0087m;
import ivas.gov.bisp.enumeration.p091n.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class s implements V {
    private static int a = 1;
    private static int b;
    public Y g;
    public int h;
    public int j;
    public V d = null;
    public boolean e = false;
    public boolean f = false;
    public int i = 1;
    public int k = 1;
    public C0015y c = null;
    public boolean l = false;
    public List<V> m = new ArrayList();
    public List<s> n = new ArrayList();

    public s(Y y) {
        this.g = y;
    }

    public String toString() {
        Object objValueOf;
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        C0087m c0087m = this.g.e;
        int i2 = a;
        int i3 = i2 & 57;
        int i4 = (i2 | 57) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        b = i6 % 128;
        Object obj = null;
        if (i6 % 2 != 0) {
            sb.append(c0087m.Z);
            obj.hashCode();
            throw null;
        }
        sb.append(c0087m.Z);
        int i7 = b;
        int i8 = ((i7 | 45) << 1) - (i7 ^ 45);
        a = i8 % 128;
        if (i8 % 2 == 0) {
            sb.append(":");
            sb.append(j.D(this.i));
            obj.hashCode();
            throw null;
        }
        sb.append(":");
        sb.append(j.D(this.i));
        int i9 = b;
        int i10 = i9 & 77;
        int i11 = (i9 ^ 77) | i10;
        int i12 = (i10 & i11) + (i11 | i10);
        a = i12 % 128;
        int i13 = i12 % 2;
        sb.append("(");
        if (!(!this.l)) {
            int i14 = a;
            int i15 = (((i14 | 14) << 1) - (i14 ^ 14)) - 1;
            b = i15 % 128;
            int i16 = i15 % 2;
            objValueOf = Integer.valueOf(this.j);
            int i17 = b + 19;
            a = i17 % 128;
            int i18 = i17 % 2;
        } else {
            int i19 = b;
            int i20 = ((i19 & (-68)) | ((~i19) & 67)) + ((i19 & 67) << 1);
            a = i20 % 128;
            int i21 = i20 % 2;
            objValueOf = "unresolved";
        }
        sb.append(objValueOf);
        sb.append(") <t=");
        int i22 = b;
        int i23 = (i22 ^ 93) + ((i22 & 93) << 1);
        a = i23 % 128;
        if (i23 % 2 == 0) {
            sb.append(this.n.size());
            obj.hashCode();
            throw null;
        }
        sb.append(this.n.size());
        int i24 = b;
        int i25 = (i24 ^ 79) + ((i24 & 79) << 1);
        a = i25 % 128;
        int i26 = i25 % 2;
        sb.append(":d=");
        List<V> list = this.m;
        int i27 = b;
        int i28 = (i27 & (-42)) | ((~i27) & 41);
        int i29 = -(-((i27 & 41) << 1));
        int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
        a = i30 % 128;
        int i31 = i30 % 2;
        sb.append(list.size());
        int i32 = b;
        int i33 = ((i32 | 9) << 1) - (i32 ^ 9);
        a = i33 % 128;
        int i34 = i33 % 2;
        sb.append(">");
        String string = sb.toString();
        int i35 = b;
        int i36 = ((i35 | 43) << 1) - (i35 ^ 43);
        a = i36 % 128;
        if (i36 % 2 != 0) {
            return string;
        }
        throw null;
    }

    public void e(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 99;
        int i5 = (i4 - (~(-(-((i3 ^ 99) | i4))))) - 1;
        b = i5 % 128;
        int i6 = i5 % 2;
        if (this.l) {
            int i7 = i3 & 9;
            int i8 = i7 + ((i3 ^ 9) | i7);
            b = i8 % 128;
            int i9 = i8 % 2;
            return;
        }
        this.l = true;
        this.j = i;
        List<V> list = this.m;
        int i10 = i3 ^ 27;
        int i11 = (i3 & 27) << 1;
        int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
        b = i12 % 128;
        Object obj = null;
        if (i12 % 2 != 0) {
            list.iterator();
            throw null;
        }
        Iterator<V> it = list.iterator();
        int i13 = a;
        int i14 = (((i13 | 42) << 1) - (i13 ^ 42)) - 1;
        b = i14 % 128;
        int i15 = i14 % 2;
        while (!(!it.hasNext())) {
            int i16 = a;
            int i17 = i16 & 45;
            int i18 = (i16 | 45) & (~i17);
            int i19 = -(-(i17 << 1));
            int i20 = (i18 ^ i19) + ((i18 & i19) << 1);
            b = i20 % 128;
            int i21 = i20 % 2;
            V next = it.next();
            next.b(next);
            int i22 = b + 101;
            a = i22 % 128;
            int i23 = i22 % 2;
        }
        int i24 = a;
        int i25 = i24 ^ 71;
        int i26 = ((i24 & 71) | i25) << 1;
        int i27 = -i25;
        int i28 = ((i26 | i27) << 1) - (i26 ^ i27);
        b = i28 % 128;
        if (i28 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void d() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 101) + (i2 | 101);
        b = i3 % 128;
        int i4 = i3 % 2;
        this.n.clear();
        this.m.clear();
        int i5 = a;
        int i6 = (i5 & (-94)) | ((~i5) & 93);
        int i7 = (i5 & 93) << 1;
        int i8 = (i6 & i7) + (i6 | i7);
        b = i8 % 128;
        if (i8 % 2 != 0) {
            this.l = false;
            this.j = 1;
        } else {
            this.l = false;
            this.j = 0;
        }
        this.f = false;
        this.e = false;
        int i9 = ((i5 & 49) - (~(-(-(i5 | 49))))) - 1;
        b = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 42 / 0;
        }
    }

    @Override // ivas.gov.bisp.enumeration.B.V
    public void b(V v) {
        int i = 2 % 2;
        int i2 = b + 41;
        a = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            this.n.iterator();
            throw null;
        }
        Iterator<s> it = this.n.iterator();
        while (!(!it.hasNext())) {
            int i3 = a;
            int i4 = ((i3 ^ 106) + ((i3 & 106) << 1)) - 1;
            b = i4 % 128;
            int i5 = i4 % 2;
            if (!it.next().l) {
                int i6 = b;
                int i7 = i6 & 99;
                int i8 = ((i6 ^ 99) | i7) << 1;
                int i9 = -((i6 | 99) & (~i7));
                int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
                a = i10 % 128;
                int i11 = i10 % 2;
                return;
            }
        }
        this.f = true;
        V v2 = this.d;
        if (v2 != null) {
            int i12 = a;
            int i13 = i12 & 17;
            int i14 = -(-(i12 | 17));
            int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
            b = i15 % 128;
            if (i15 % 2 != 0) {
                v2.b(this);
                obj.hashCode();
                throw null;
            }
            v2.b(this);
            int i16 = a + 39;
            b = i16 % 128;
            int i17 = i16 % 2;
        }
        if (this.e) {
            int i18 = a;
            int i19 = ((i18 & 90) + (i18 | 90)) - 1;
            b = i19 % 128;
            int i20 = i19 % 2;
            this.g.b(this);
            int i21 = (-2) - ((a + 100) ^ (-1));
            b = i21 % 128;
            if (i21 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        int i22 = b;
        int i23 = (-2) - (((i22 ^ 114) + ((i22 & 114) << 1)) ^ (-1));
        int i24 = i23 % 128;
        a = i24;
        int i25 = i23 % 2;
        int i26 = i24 & 85;
        int i27 = i26 + ((i24 ^ 85) | i26);
        b = i27 % 128;
        int i28 = i27 % 2;
        s sVar = null;
        int i29 = 0;
        for (s sVar2 : this.n) {
            int i30 = b;
            int i31 = ((i30 & (-90)) | ((~i30) & 89)) + ((i30 & 89) << 1);
            a = i31 % 128;
            int i32 = i31 % 2;
            if (!(sVar2 instanceof C0015y)) {
                int i33 = a;
                int i34 = (i33 ^ 13) + ((i33 & 13) << 1);
                int i35 = i34 % 128;
                b = i35;
                int i36 = i34 % 2;
                int i37 = i29 ^ 1;
                int i38 = (i29 & 1) << 1;
                i29 = ((i37 | i38) << 1) - (i38 ^ i37);
                int i39 = i35 & 99;
                int i40 = (i35 ^ 99) | i39;
                int i41 = ((i39 | i40) << 1) - (i40 ^ i39);
                a = i41 % 128;
                int i42 = i41 % 2;
                sVar = sVar2;
            }
        }
        if (sVar != null) {
            int i43 = b;
            int i44 = ((i43 ^ 91) | (i43 & 91)) << 1;
            int i45 = -(((~i43) & 91) | (i43 & (-92)));
            int i46 = (i44 & i45) + (i45 | i44);
            int i47 = i46 % 128;
            a = i47;
            if (i46 % 2 != 0 ? i29 == 1 : i29 == 0) {
                int i48 = ((i47 ^ 86) + ((i47 & 86) << 1)) - 1;
                int i49 = i48 % 128;
                b = i49;
                if (i48 % 2 != 0) {
                    boolean z = sVar.l;
                    throw null;
                }
                if (sVar.l) {
                    int i50 = i49 & 73;
                    int i51 = (i49 | 73) & (~i50);
                    int i52 = -(-(i50 << 1));
                    int i53 = (i51 & i52) + (i51 | i52);
                    int i54 = i53 % 128;
                    a = i54;
                    int i55 = i53 % 2;
                    C0015y c0015y = this.c;
                    if (c0015y != null) {
                        int i56 = i54 & 17;
                        int i57 = (((i54 ^ 17) | i56) << 1) - ((~i56) & (i54 | 17));
                        b = i57 % 128;
                        int i58 = i57 % 2;
                        if (!c0015y.l) {
                            int i59 = (i54 & 3) + (i54 | 3);
                            b = i59 % 128;
                            if (i59 % 2 != 0) {
                                throw null;
                            }
                            return;
                        }
                        int i60 = (-2) - ((i54 + 66) ^ (-1));
                        int i61 = i60 % 128;
                        b = i61;
                        int i62 = i60 % 2;
                        this.h = this.k * c0015y.j;
                        int i63 = (((i61 ^ 15) | (i61 & 15)) << 1) - (((~i61) & 15) | (i61 & (-16)));
                        a = i63 % 128;
                        int i64 = i63 % 2;
                    }
                    e((sVar.j - (~(-(-this.h)))) - 1);
                    int i65 = b + 47;
                    a = i65 % 128;
                    int i66 = i65 % 2;
                }
            }
        }
        V v3 = this.d;
        if (v3 != null) {
            int i67 = a;
            int i68 = i67 & 49;
            int i69 = (i67 | 49) & (~i68);
            int i70 = i68 << 1;
            int i71 = (i69 ^ i70) + ((i69 & i70) << 1);
            b = i71 % 128;
            int i72 = i71 % 2;
            v3.b(this);
            int i73 = a;
            int i74 = ((i73 ^ 81) - (~(-(-((i73 & 81) << 1))))) - 1;
            b = i74 % 128;
            if (i74 % 2 != 0) {
                int i75 = 4 % 5;
            }
        }
        int i76 = b + 1;
        a = i76 % 128;
        if (i76 % 2 == 0) {
            int i77 = 1 / 0;
        }
    }
}
