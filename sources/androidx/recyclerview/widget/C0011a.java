package androidx.recyclerview.widget;

import ivas.gov.bisp.enumeration.p010aj.S;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: androidx.recyclerview.widget.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0011a implements h.aMG {
    public final aMH d;
    public S a = new S(30);
    public final ArrayList<aMI> b = new ArrayList<>();
    public final ArrayList<aMI> c = new ArrayList<>();
    public int e = 0;
    public final h f = new h(this);

    /* JADX INFO: renamed from: androidx.recyclerview.widget.a$aMH */
    public interface aMH {
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.a$aMI */
    public static final class aMI {
        public int a;
        public int b;
        public Object c;
        public int d;

        public aMI(int i, int i2, int i3, Object obj) {
            this.a = i;
            this.b = i2;
            this.d = i3;
            this.c = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof aMI)) {
                return false;
            }
            aMI ami = (aMI) obj;
            int i = this.a;
            if (i != ami.a) {
                return false;
            }
            if (i == 8 && Math.abs(this.d - this.b) == 1 && this.d == ami.b && this.b == ami.d) {
                return true;
            }
            if (this.d != ami.d || this.b != ami.b) {
                return false;
            }
            Object obj2 = this.c;
            if (obj2 != null) {
                if (!obj2.equals(ami.c)) {
                    return false;
                }
            } else if (ami.c != null) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return (((this.a * 31) + this.b) * 31) + this.d;
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("[");
            int i = this.a;
            if (i == 1) {
                str = "add";
            } else if (i == 2) {
                str = "rm";
            } else if (i != 4) {
                str = i != 8 ? "??" : "mv";
            } else {
                str = "up";
            }
            sb.append(str);
            sb.append(",s:");
            sb.append(this.b);
            sb.append("c:");
            sb.append(this.d);
            sb.append(",p:");
            sb.append(this.c);
            sb.append("]");
            return sb.toString();
        }
    }

    public C0011a(aMH amh) {
        this.d = amh;
    }

    public final void b(aMI ami) {
        this.c.add(ami);
        int i = ami.a;
        if (i == 1) {
            ((v) this.d).e(ami.b, ami.d);
            return;
        }
        if (i == 2) {
            aMH amh = this.d;
            v vVar = (v) amh;
            vVar.a.U(ami.b, ami.d, false);
            vVar.a.ak = true;
            return;
        }
        if (i == 4) {
            ((v) this.d).d(ami.b, ami.d, ami.c);
        } else if (i == 8) {
            ((v) this.d).f(ami.b, ami.d);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown update op type for ");
            sb.append(ami);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final boolean c(int i) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            aMI ami = this.c.get(i2);
            int i3 = ami.a;
            if (i3 == 8) {
                if (g(ami.d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = ami.b;
                int i5 = ami.d;
                for (int i6 = i4; i6 < i5 + i4; i6++) {
                    if (g(i6, i2 + 1) == i) {
                        return true;
                    }
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public final void d() {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            ((v) this.d).b(this.c.get(i));
        }
        m(this.c);
        this.e = 0;
    }

    public final void e() {
        d();
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            aMI ami = this.b.get(i);
            int i2 = ami.a;
            if (i2 == 1) {
                ((v) this.d).b(ami);
                ((v) this.d).e(ami.b, ami.d);
            } else if (i2 == 2) {
                ((v) this.d).b(ami);
                aMH amh = this.d;
                int i3 = ami.b;
                int i4 = ami.d;
                v vVar = (v) amh;
                vVar.a.U(i3, i4, true);
                RecyclerView recyclerView = vVar.a;
                recyclerView.ak = true;
                recyclerView.ai.d += i4;
            } else if (i2 == 4) {
                ((v) this.d).b(ami);
                ((v) this.d).d(ami.b, ami.d, ami.c);
            } else if (i2 == 8) {
                ((v) this.d).b(ami);
                ((v) this.d).f(ami.b, ami.d);
            }
        }
        m(this.b);
        this.e = 0;
    }

    public final void f(aMI ami) {
        int i;
        int i2 = ami.a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iN = n(ami.b, i2);
        int i3 = ami.b;
        int i4 = ami.a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                StringBuilder sb = new StringBuilder();
                sb.append("op should be remove or update.");
                sb.append(ami);
                throw new IllegalArgumentException(sb.toString());
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < ami.d; i6++) {
            int iN2 = n((i * i6) + ami.b, ami.a);
            int i7 = ami.a;
            if (i7 == 2 ? iN2 != iN : !(i7 == 4 && iN2 == iN + 1)) {
                aMI amiJ = j(i7, iN, i5, ami.c);
                h(amiJ, i3);
                amiJ.c = null;
                this.a.g(amiJ);
                if (ami.a == 4) {
                    i3 += i5;
                }
                i5 = 1;
                iN = iN2;
            } else {
                i5++;
            }
        }
        Object obj = ami.c;
        ami.c = null;
        this.a.g(ami);
        if (i5 > 0) {
            aMI amiJ2 = j(ami.a, iN, i5, obj);
            h(amiJ2, i3);
            amiJ2.c = null;
            this.a.g(amiJ2);
        }
    }

    public final int g(int i, int i2) {
        int size = this.c.size();
        while (i2 < size) {
            aMI ami = this.c.get(i2);
            int i3 = ami.a;
            if (i3 == 8) {
                int i4 = ami.b;
                if (i4 == i) {
                    i = ami.d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (ami.d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = ami.b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = ami.d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += ami.d;
                }
            }
            i2++;
        }
        return i;
    }

    public final void h(aMI ami, int i) {
        ((v) this.d).b(ami);
        int i2 = ami.a;
        if (i2 != 2) {
            if (i2 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            ((v) this.d).d(i, ami.d, ami.c);
            return;
        }
        aMH amh = this.d;
        int i3 = ami.d;
        v vVar = (v) amh;
        vVar.a.U(i, i3, true);
        RecyclerView recyclerView = vVar.a;
        recyclerView.ak = true;
        recyclerView.ai.d += i3;
    }

    public final boolean i() {
        return this.b.size() > 0;
    }

    public final aMI j(int i, int i2, int i3, Object obj) {
        aMI ami = (aMI) this.a.e();
        if (ami == null) {
            return new aMI(i, i2, i3, obj);
        }
        ami.a = i;
        ami.b = i2;
        ami.d = i3;
        ami.c = obj;
        return ami;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:103:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:171:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:179:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x013e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x0128 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x01af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x006a  */
    /* JADX WARN: Code duplicated, block: B:29:0x006f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0074  */
    /* JADX WARN: Code duplicated, block: B:35:0x008f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0093  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:74:0x0140  */
    /* JADX WARN: Code duplicated, block: B:75:0x0142  */
    /* JADX WARN: Code duplicated, block: B:77:0x0148  */
    /* JADX WARN: Code duplicated, block: B:80:0x0153  */
    /* JADX WARN: Code duplicated, block: B:83:0x015e  */
    /* JADX WARN: Code duplicated, block: B:86:0x0169  */
    /* JADX WARN: Code duplicated, block: B:87:0x016f  */
    /* JADX WARN: Code duplicated, block: B:88:0x0171  */
    /* JADX WARN: Code duplicated, block: B:90:0x0177  */
    /* JADX WARN: Code duplicated, block: B:93:0x0182  */
    /* JADX WARN: Code duplicated, block: B:96:0x018d  */
    /* JADX WARN: Code duplicated, block: B:99:0x0198  */
    public final void k() {
        int i;
        boolean z;
        byte b;
        aMI amiJ;
        int i2;
        int i3;
        int i4;
        aMI amiJ2;
        boolean z2;
        boolean z3;
        aMI amiJ3;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        h hVar = this.f;
        ArrayList<aMI> arrayList = this.b;
        Objects.requireNonNull(hVar);
        while (true) {
            int size = arrayList.size() - 1;
            boolean z4 = false;
            while (true) {
                i = 8;
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (arrayList.get(size).a != 8) {
                    z4 = true;
                } else if (z4) {
                    break;
                }
                size--;
            }
            if (size == -1) {
                break;
            }
            int i13 = size + 1;
            aMI ami = arrayList.get(size);
            aMI ami2 = arrayList.get(i13);
            int i14 = ami2.a;
            if (i14 == 1) {
                int i15 = ami.d;
                int i16 = ami2.b;
                int i17 = i15 < i16 ? -1 : 0;
                int i18 = ami.b;
                if (i18 < i16) {
                    i17++;
                }
                if (i16 <= i18) {
                    ami.b = i18 + ami2.d;
                }
                int i19 = ami2.b;
                if (i19 <= i15) {
                    ami.d = i15 + ami2.d;
                }
                ami2.b = i19 + i17;
                arrayList.set(size, ami2);
                arrayList.set(i13, ami);
            } else if (i14 == 2) {
                int i20 = ami.b;
                int i21 = ami.d;
                if (i20 < i21) {
                    if (ami2.b == i20 && ami2.d == i21 - i20) {
                        z3 = true;
                        z2 = false;
                    } else {
                        z3 = false;
                        z2 = z3;
                    }
                } else if (ami2.b == i21 + 1 && ami2.d == i20 - i21) {
                    z3 = true;
                    z2 = z3;
                } else {
                    z2 = true;
                    z3 = false;
                }
                int i22 = ami2.b;
                if (i21 < i22) {
                    ami2.b = i22 - 1;
                } else {
                    int i23 = ami2.d;
                    if (i21 < i22 + i23) {
                        ami2.d = i23 - 1;
                        ami.a = 2;
                        ami.d = 1;
                        if (ami2.d == 0) {
                            arrayList.remove(i13);
                            C0011a c0011a = (C0011a) hVar.a;
                            Objects.requireNonNull(c0011a);
                            ami2.c = null;
                            c0011a.a.g(ami2);
                        }
                    }
                }
                int i24 = ami.b;
                int i25 = ami2.b;
                if (i24 <= i25) {
                    ami2.b = i25 + 1;
                } else {
                    int i26 = i25 + ami2.d;
                    if (i24 < i26) {
                        amiJ3 = ((C0011a) hVar.a).j(2, i24 + 1, i26 - i24, null);
                        ami2.d = ami.b - ami2.b;
                    }
                    if (z3) {
                        arrayList.set(size, ami2);
                        arrayList.remove(i13);
                        C0011a c0011a2 = (C0011a) hVar.a;
                        Objects.requireNonNull(c0011a2);
                        ami.c = null;
                        c0011a2.a.g(ami);
                    } else {
                        if (z2) {
                            if (amiJ3 != null) {
                                i11 = ami.b;
                                if (i11 > amiJ3.b) {
                                    ami.b = i11 - amiJ3.d;
                                }
                                i12 = ami.d;
                                if (i12 > amiJ3.b) {
                                    ami.d = i12 - amiJ3.d;
                                }
                            }
                            i9 = ami.b;
                            if (i9 > ami2.b) {
                                ami.b = i9 - ami2.d;
                            }
                            i10 = ami.d;
                            if (i10 > ami2.b) {
                                ami.d = i10 - ami2.d;
                            }
                        } else {
                            if (amiJ3 != null) {
                                i7 = ami.b;
                                if (i7 >= amiJ3.b) {
                                    ami.b = i7 - amiJ3.d;
                                }
                                i8 = ami.d;
                                if (i8 >= amiJ3.b) {
                                    ami.d = i8 - amiJ3.d;
                                }
                            }
                            i5 = ami.b;
                            if (i5 >= ami2.b) {
                                ami.b = i5 - ami2.d;
                            }
                            i6 = ami.d;
                            if (i6 >= ami2.b) {
                                ami.d = i6 - ami2.d;
                            }
                        }
                        arrayList.set(size, ami2);
                        if (ami.b != ami.d) {
                            arrayList.set(i13, ami);
                        } else {
                            arrayList.remove(i13);
                        }
                        if (amiJ3 != null) {
                            arrayList.add(size, amiJ3);
                        }
                    }
                }
                amiJ3 = null;
                if (z3) {
                    arrayList.set(size, ami2);
                    arrayList.remove(i13);
                    C0011a c0011a3 = (C0011a) hVar.a;
                    Objects.requireNonNull(c0011a3);
                    ami.c = null;
                    c0011a3.a.g(ami);
                } else {
                    if (z2) {
                        if (amiJ3 != null) {
                            i11 = ami.b;
                            if (i11 > amiJ3.b) {
                                ami.b = i11 - amiJ3.d;
                            }
                            i12 = ami.d;
                            if (i12 > amiJ3.b) {
                                ami.d = i12 - amiJ3.d;
                            }
                        }
                        i9 = ami.b;
                        if (i9 > ami2.b) {
                            ami.b = i9 - ami2.d;
                        }
                        i10 = ami.d;
                        if (i10 > ami2.b) {
                            ami.d = i10 - ami2.d;
                        }
                    } else {
                        if (amiJ3 != null) {
                            i7 = ami.b;
                            if (i7 >= amiJ3.b) {
                                ami.b = i7 - amiJ3.d;
                            }
                            i8 = ami.d;
                            if (i8 >= amiJ3.b) {
                                ami.d = i8 - amiJ3.d;
                            }
                        }
                        i5 = ami.b;
                        if (i5 >= ami2.b) {
                            ami.b = i5 - ami2.d;
                        }
                        i6 = ami.d;
                        if (i6 >= ami2.b) {
                            ami.d = i6 - ami2.d;
                        }
                    }
                    arrayList.set(size, ami2);
                    if (ami.b != ami.d) {
                        arrayList.set(i13, ami);
                    } else {
                        arrayList.remove(i13);
                    }
                    if (amiJ3 != null) {
                        arrayList.add(size, amiJ3);
                    }
                }
            } else if (i14 == 4) {
                int i27 = ami.d;
                int i28 = ami2.b;
                if (i27 < i28) {
                    ami2.b = i28 - 1;
                } else {
                    int i29 = ami2.d;
                    if (i27 < i28 + i29) {
                        ami2.d = i29 - 1;
                        amiJ = ((C0011a) hVar.a).j(4, ami.b, 1, ami2.c);
                    }
                    i2 = ami.b;
                    i3 = ami2.b;
                    if (i2 <= i3) {
                        ami2.b = i3 + 1;
                    } else {
                        i4 = i3 + ami2.d;
                        if (i2 < i4) {
                            int i30 = i4 - i2;
                            amiJ2 = ((C0011a) hVar.a).j(4, i2 + 1, i30, ami2.c);
                            ami2.d -= i30;
                        }
                        arrayList.set(i13, ami);
                        if (ami2.d > 0) {
                            arrayList.set(size, ami2);
                        } else {
                            arrayList.remove(size);
                            C0011a c0011a4 = (C0011a) hVar.a;
                            Objects.requireNonNull(c0011a4);
                            ami2.c = null;
                            c0011a4.a.g(ami2);
                        }
                        if (amiJ != null) {
                            arrayList.add(size, amiJ);
                        }
                        if (amiJ2 != null) {
                            arrayList.add(size, amiJ2);
                        }
                    }
                    amiJ2 = null;
                    arrayList.set(i13, ami);
                    if (ami2.d > 0) {
                        arrayList.set(size, ami2);
                    } else {
                        arrayList.remove(size);
                        C0011a c0011a5 = (C0011a) hVar.a;
                        Objects.requireNonNull(c0011a5);
                        ami2.c = null;
                        c0011a5.a.g(ami2);
                    }
                    if (amiJ != null) {
                        arrayList.add(size, amiJ);
                    }
                    if (amiJ2 != null) {
                        arrayList.add(size, amiJ2);
                    }
                }
                amiJ = null;
                i2 = ami.b;
                i3 = ami2.b;
                if (i2 <= i3) {
                    ami2.b = i3 + 1;
                } else {
                    i4 = i3 + ami2.d;
                    if (i2 < i4) {
                        int i31 = i4 - i2;
                        amiJ2 = ((C0011a) hVar.a).j(4, i2 + 1, i31, ami2.c);
                        ami2.d -= i31;
                    }
                    arrayList.set(i13, ami);
                    if (ami2.d > 0) {
                        arrayList.set(size, ami2);
                    } else {
                        arrayList.remove(size);
                        C0011a c0011a6 = (C0011a) hVar.a;
                        Objects.requireNonNull(c0011a6);
                        ami2.c = null;
                        c0011a6.a.g(ami2);
                    }
                    if (amiJ != null) {
                        arrayList.add(size, amiJ);
                    }
                    if (amiJ2 != null) {
                        arrayList.add(size, amiJ2);
                    }
                }
                amiJ2 = null;
                arrayList.set(i13, ami);
                if (ami2.d > 0) {
                    arrayList.set(size, ami2);
                } else {
                    arrayList.remove(size);
                    C0011a c0011a7 = (C0011a) hVar.a;
                    Objects.requireNonNull(c0011a7);
                    ami2.c = null;
                    c0011a7.a.g(ami2);
                }
                if (amiJ != null) {
                    arrayList.add(size, amiJ);
                }
                if (amiJ2 != null) {
                    arrayList.add(size, amiJ2);
                }
            }
        }
        int size2 = this.b.size();
        int i32 = 0;
        while (i32 < size2) {
            aMI amiJ4 = this.b.get(i32);
            int i33 = amiJ4.a;
            if (i33 == 1) {
                b(amiJ4);
            } else if (i33 == 2) {
                int i34 = amiJ4.b;
                int i35 = amiJ4.d + i34;
                int i36 = i34;
                byte b2 = -1;
                int i37 = 0;
                while (i36 < i35) {
                    if (((v) this.d).c(i36) != null || c(i36)) {
                        if (b2 == 0) {
                            f(j(2, i34, i37, null));
                            z = true;
                        } else {
                            z = false;
                        }
                        b = 1;
                    } else {
                        if (b2 == 1) {
                            b(j(2, i34, i37, null));
                            z = true;
                        } else {
                            z = false;
                        }
                        b = 0;
                    }
                    if (z) {
                        i36 -= i37;
                        i35 -= i37;
                        i37 = 1;
                    } else {
                        i37++;
                    }
                    i36++;
                    b2 = b;
                }
                if (i37 != amiJ4.d) {
                    amiJ4.c = null;
                    this.a.g(amiJ4);
                    amiJ4 = j(2, i34, i37, null);
                }
                if (b2 == 0) {
                    f(amiJ4);
                } else {
                    b(amiJ4);
                }
            } else if (i33 == 4) {
                int i38 = amiJ4.b;
                int i39 = amiJ4.d;
                byte b3 = -1;
                int i40 = i38;
                int i41 = i40;
                int i42 = 0;
                while (i40 < i39 + i38) {
                    if (((v) this.d).c(i40) != null || c(i40)) {
                        if (b3 == 0) {
                            f(j(4, i41, i42, amiJ4.c));
                            i41 = i40;
                            i42 = 0;
                        }
                        b3 = 1;
                    } else {
                        if (b3 == 1) {
                            b(j(4, i41, i42, amiJ4.c));
                            i41 = i40;
                            i42 = 0;
                        }
                        b3 = 0;
                    }
                    i42++;
                    i40++;
                }
                if (i42 != amiJ4.d) {
                    Object obj = amiJ4.c;
                    amiJ4.c = null;
                    this.a.g(amiJ4);
                    amiJ4 = j(4, i41, i42, obj);
                }
                if (b3 == 0) {
                    f(amiJ4);
                } else {
                    b(amiJ4);
                }
            } else if (i33 == i) {
                b(amiJ4);
            }
            i32++;
            i = 8;
        }
        this.b.clear();
    }

    public final void l(aMI ami) {
        ami.c = null;
        this.a.g(ami);
    }

    public final void m(List<aMI> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            l(list.get(i));
        }
        list.clear();
    }

    public final int n(int i, int i2) {
        int i3;
        int i4;
        for (int size = this.c.size() - 1; size >= 0; size--) {
            aMI ami = this.c.get(size);
            int i5 = ami.a;
            if (i5 == 8) {
                int i6 = ami.b;
                int i7 = ami.d;
                if (i6 < i7) {
                    i4 = i6;
                    i3 = i7;
                } else {
                    i3 = i6;
                    i4 = i7;
                }
                if (i < i4 || i > i3) {
                    if (i < i6) {
                        if (i2 == 1) {
                            ami.b = i6 + 1;
                            ami.d = i7 + 1;
                        } else if (i2 == 2) {
                            ami.b = i6 - 1;
                            ami.d = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        ami.d = i7 + 1;
                    } else if (i2 == 2) {
                        ami.d = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        ami.b = i6 + 1;
                    } else if (i2 == 2) {
                        ami.b = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = ami.b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= ami.d;
                    } else if (i5 == 2) {
                        i += ami.d;
                    }
                } else if (i2 == 1) {
                    ami.b = i8 + 1;
                } else if (i2 == 2) {
                    ami.b = i8 - 1;
                }
            }
        }
        for (int size2 = this.c.size() - 1; size2 >= 0; size2--) {
            aMI ami2 = this.c.get(size2);
            if (ami2.a == 8) {
                int i9 = ami2.d;
                if (i9 == ami2.b || i9 < 0) {
                    this.c.remove(size2);
                    ami2.c = null;
                    this.a.g(ami2);
                }
            } else if (ami2.d <= 0) {
                this.c.remove(size2);
                ami2.c = null;
                this.a.g(ami2);
            }
        }
        return i;
    }
}
