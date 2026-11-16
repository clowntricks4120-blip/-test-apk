package ivas.gov.bisp.enumeration.aM;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import ivas.gov.bisp.enumeration.p003ac.e;
import ivas.gov.bisp.enumeration.p091n.j;
import ivas.gov.bisp.enumeration.p096p.h;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class O extends J {
    private static int a = 0;
    private static int b = 1;
    public int B;
    public ArrayList<J> A = new ArrayList<>();
    public boolean z = true;
    public boolean D = false;
    public int C = 0;

    public class bHP extends N {
        private static int a = 0;
        private static int b = 1;
        public final /* synthetic */ J c;

        public bHP(O o2, J j) {
            this.c = j;
        }

        @Override // ivas.gov.bisp.enumeration.aM.J.InterfaceC0070bHc
        public void b(J j) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 ^ 91;
            int i4 = ((i2 & 91) | i3) << 1;
            int i5 = -i3;
            int i6 = (i4 & i5) + (i4 | i5);
            a = i6 % 128;
            int i7 = i6 % 2;
            this.c.B();
            j.y(this);
            int i8 = b + 49;
            a = i8 % 128;
            if (i8 % 2 != 0) {
                throw null;
            }
        }
    }

    @Override // ivas.gov.bisp.enumeration.aM.J
    public /* synthetic */ J A(long j) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 92) + ((i2 & 92) << 1)) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        M(j);
        int i5 = a;
        int i6 = ((i5 | 103) << 1) - (i5 ^ 103);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            return this;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.aM.J
    public /* synthetic */ J E(TimeInterpolator timeInterpolator) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 119;
        int i4 = (i2 ^ 119) | i3;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            N(timeInterpolator);
            int i6 = 1 / 0;
        } else {
            N(timeInterpolator);
        }
        int i7 = b;
        int i8 = i7 ^ 35;
        int i9 = (((i7 & 35) | i8) << 1) - i8;
        a = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 28 / 0;
        }
        return this;
    }

    @Override // ivas.gov.bisp.enumeration.aM.J
    public void F(h hVar) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 19;
        int i4 = (((i2 | 19) & (~i3)) - (~(i3 << 1))) - 1;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = this.C;
            int i6 = (i5 & (-3)) | ((~i5) & 2);
            int i7 = i5 & 2;
            this.C = (i7 & i6) | (i6 ^ i7);
        } else {
            int i8 = this.C;
            int i9 = i8 ^ 2;
            int i10 = i8 & 2;
            this.C = (i10 & i9) | (i9 ^ i10);
        }
        int size = this.A.size();
        int i11 = b + 123;
        a = i11 % 128;
        int i12 = i11 % 2;
        int i13 = 0;
        while (i13 < size) {
            int i14 = a;
            int i15 = i14 & 93;
            int i16 = (i15 - (~((i14 ^ 93) | i15))) - 1;
            b = i16 % 128;
            if (i16 % 2 == 0) {
                this.A.get(i13).F(hVar);
                throw null;
            }
            this.A.get(i13).F(hVar);
            int i17 = a;
            int i18 = i17 + 19;
            b = i18 % 128;
            int i19 = i18 % 2;
            i13++;
            int i20 = i17 & 75;
            int i21 = ((((i17 ^ 75) | i20) << 1) - (~(-((i17 | 75) & (~i20))))) - 1;
            b = i21 % 128;
            if (i21 % 2 == 0) {
                int i22 = 5 / 4;
            }
        }
        int i23 = b;
        int i24 = i23 & 53;
        int i25 = i23 | 53;
        int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
        a = i26 % 128;
        int i27 = i26 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.aM.J
    public J G(long j) {
        int i = 2 % 2;
        int i2 = b + 19;
        a = i2 % 128;
        int i3 = i2 % 2;
        this.h = j;
        if (i3 != 0) {
            int i4 = 60 / 0;
        }
        int i5 = a;
        int i6 = (i5 & (-62)) | ((~i5) & 61);
        int i7 = -(-((i5 & 61) << 1));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        b = i8 % 128;
        int i9 = i8 % 2;
        return this;
    }

    public J J(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (-2) - ((((i3 | 86) << 1) - (i3 ^ 86)) ^ (-1));
        b = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (i >= 0) {
            int i5 = i3 & 121;
            int i6 = (i3 | 121) & (~i5);
            int i7 = -(-(i5 << 1));
            int i8 = (i6 & i7) + (i6 | i7);
            b = i8 % 128;
            if (i8 % 2 == 0) {
                this.A.size();
                throw null;
            }
            if (i < this.A.size()) {
                int i9 = b;
                int i10 = (-2) - ((((i9 | 112) << 1) - (i9 ^ 112)) ^ (-1));
                a = i10 % 128;
                int i11 = i10 % 2;
                J j = this.A.get(i);
                int i12 = b + 111;
                a = i12 % 128;
                int i13 = i12 % 2;
                return j;
            }
        }
        int i14 = a;
        int i15 = i14 & 47;
        int i16 = ((((i14 ^ 47) | i15) << 1) - (~(-((i14 | 47) & (~i15))))) - 1;
        b = i16 % 128;
        if (i16 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x004f  */
    /* JADX WARN: Code duplicated, block: B:13:0x0053  */
    /* JADX WARN: Code duplicated, block: B:15:0x0068 A[LOOP:0: B:12:0x0051->B:15:0x0068, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x009a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x002f A[PHI: r1
  0x002f: PHI (r1v11 java.util.ArrayList<ivas.gov.bisp.enumeration.aM.J>) = 
  (r1v10 java.util.ArrayList<ivas.gov.bisp.enumeration.aM.J>)
  (r1v17 java.util.ArrayList<ivas.gov.bisp.enumeration.aM.J>)
 binds: [B:8:0x002d, B:5:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    public O N(TimeInterpolator timeInterpolator) {
        ArrayList<J> arrayList;
        int size;
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = b + 117;
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        int i7 = this.C;
        this.C = (i7 & 1) | (i7 ^ 1);
        int i8 = (i5 & 35) + (i5 | 35);
        b = i8 % 128;
        int i9 = 0;
        Object obj = null;
        if (i8 % 2 == 0) {
            arrayList = this.A;
            int i10 = 64 / 0;
            if (arrayList != null) {
                int i11 = (i5 & 31) + (i5 | 31);
                b = i11 % 128;
                int i12 = i11 % 2;
                size = arrayList.size();
                int i13 = b;
                int i14 = i13 & 5;
                i = (i14 - (~((i13 ^ 5) | i14))) - 1;
                a = i % 128;
                if (i % 2 != 0) {
                    int i15 = 4 / 4;
                }
                while (i9 < size) {
                    int i16 = b;
                    int i17 = i16 & 43;
                    int i18 = (i16 | 43) & (~i17);
                    int i19 = i17 << 1;
                    i2 = (i18 & i19) + (i18 | i19);
                    a = i2 % 128;
                    if (i2 % 2 == 0) {
                        this.A.get(i9).E(timeInterpolator);
                        obj.hashCode();
                        throw null;
                    }
                    this.A.get(i9).E(timeInterpolator);
                    int i20 = (((i9 ^ 126) | (i9 & 126)) << 1) - (((~i9) & 126) | (i9 & (-127)));
                    int i21 = i20 & (-125);
                    int i22 = -(-((i20 ^ (-125)) | i21));
                    i9 = ((i21 | i22) << 1) - (i22 ^ i21);
                    int i23 = a + 3;
                    b = i23 % 128;
                    int i24 = i23 % 2;
                }
            }
        } else {
            arrayList = this.A;
            if (arrayList != null) {
                int i110 = (i5 & 31) + (i5 | 31);
                b = i110 % 128;
                int i111 = i110 % 2;
                size = arrayList.size();
                int i112 = b;
                int i113 = i112 & 5;
                i = (i113 - (~((i112 ^ 5) | i113))) - 1;
                a = i % 128;
                if (i % 2 != 0) {
                    int i114 = 4 / 4;
                }
                while (i9 < size) {
                    int i115 = b;
                    int i116 = i115 & 43;
                    int i117 = (i115 | 43) & (~i116);
                    int i118 = i116 << 1;
                    i2 = (i117 & i118) + (i117 | i118);
                    a = i2 % 128;
                    if (i2 % 2 == 0) {
                        this.A.get(i9).E(timeInterpolator);
                        obj.hashCode();
                        throw null;
                    }
                    this.A.get(i9).E(timeInterpolator);
                    int i25 = (((i9 ^ 126) | (i9 & 126)) << 1) - (((~i9) & 126) | (i9 & (-127)));
                    int i26 = i25 & (-125);
                    int i27 = -(-((i25 ^ (-125)) | i26));
                    i9 = ((i26 | i27) << 1) - (i27 ^ i26);
                    int i28 = a + 3;
                    b = i28 % 128;
                    int i29 = i28 % 2;
                }
            }
        }
        this.k = timeInterpolator;
        int i30 = a;
        int i31 = ((i30 & 126) + (i30 | 126)) - 1;
        b = i31 % 128;
        if (i31 % 2 != 0) {
            return this;
        }
        obj.hashCode();
        throw null;
    }

    public O O(int i) {
        int i2 = 2 % 2;
        int i3 = a + 77;
        int i4 = i3 % 128;
        b = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (i == 0) {
            this.z = true;
            int i5 = (i4 ^ 2) + ((i4 & 2) << 1);
            int i6 = (i5 ^ (-1)) + (i5 << 1);
            a = i6 % 128;
            int i7 = i6 % 2;
        } else {
            if (i != 1) {
                throw new AndroidRuntimeException(j.o("Invalid parameter for TransitionSet ordering: ", i));
            }
            int i8 = ((i4 | 71) << 1) - (i4 ^ 71);
            a = i8 % 128;
            int i9 = i8 % 2;
            this.z = false;
        }
        int i10 = (i4 & (-124)) | ((~i4) & 123);
        int i11 = (i4 & 123) << 1;
        int i12 = (i10 & i11) + (i10 | i11);
        a = i12 % 128;
        int i13 = i12 % 2;
        return this;
    }

    @Override // ivas.gov.bisp.enumeration.aM.J
    public /* synthetic */ Object clone() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 13) << 1) - (i2 ^ 13);
        b = i3 % 128;
        int i4 = i3 % 2;
        J jN = n();
        int i5 = a;
        int i6 = (i5 & (-2)) | ((~i5) & 1);
        int i7 = (i5 & 1) << 1;
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        b = i8 % 128;
        if (i8 % 2 != 0) {
            return jN;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.aM.J
    public J g(J.InterfaceC0070bHc interfaceC0070bHc) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 60) + ((i2 & 60) << 1)) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        super.g(interfaceC0070bHc);
        int i5 = b;
        int i6 = (((i5 | 50) << 1) - (i5 ^ 50)) - 1;
        a = i6 % 128;
        int i7 = i6 % 2;
        return this;
    }

    @Override // ivas.gov.bisp.enumeration.aM.J
    public void j(T t) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 123;
        int i4 = ((((i2 ^ 123) | i3) << 1) - (~(-((i2 | 123) & (~i3))))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        int size = this.A.size();
        int i6 = a;
        int i7 = (i6 & (-100)) | ((~i6) & 99);
        int i8 = -(-((i6 & 99) << 1));
        int i9 = (i7 & i8) + (i8 | i7);
        b = i9 % 128;
        int i10 = i9 % 2;
        int i11 = 0;
        while (i11 < size) {
            int i12 = b + 71;
            a = i12 % 128;
            if (i12 % 2 != 0) {
                this.A.get(i11).j(t);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            this.A.get(i11).j(t);
            int i13 = b;
            int i14 = (-2) - ((i13 + 96) ^ (-1));
            a = i14 % 128;
            int i15 = i14 % 2;
            int i16 = ((i11 | 41) << 1) - (i11 ^ 41);
            int i17 = (i16 ^ (-1)) + (i16 << 1);
            int i18 = ((i17 ^ (-39)) | (i17 & (-39))) << 1;
            int i19 = -(((~i17) & (-39)) | (i17 & 38));
            i11 = ((i19 & i18) << 1) + (i18 ^ i19);
            int i20 = i13 & 93;
            int i21 = (i13 | 93) & (~i20);
            int i22 = i20 << 1;
            int i23 = (i21 ^ i22) + ((i21 & i22) << 1);
            a = i23 % 128;
            int i24 = i23 % 2;
        }
        int i25 = b;
        int i26 = i25 & 45;
        int i27 = ((i25 ^ 45) | i26) << 1;
        int i28 = -((i25 | 45) & (~i26));
        int i29 = (i27 & i28) + (i28 | i27);
        a = i29 % 128;
        int i30 = i29 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x004b  */
    /* JADX WARN: Code duplicated, block: B:16:0x007c  */
    /* JADX WARN: Code duplicated, block: B:17:0x0088  */
    /* JADX WARN: Code duplicated, block: B:22:0x006b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0045 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x002d  */
    @Override // ivas.gov.bisp.enumeration.aM.J
    public void l(T t) {
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 ^ 115) - (~(-(-((i3 & 115) << 1))))) - 1;
        a = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 22 / 0;
            if (v(t.d)) {
                int i6 = a;
                int i7 = i6 & 123;
                int i8 = (i6 ^ 123) | i7;
                int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
                b = i9 % 128;
                int i10 = i9 % 2;
                for (J j : this.A) {
                    int i11 = a;
                    int i12 = i11 & 105;
                    int i13 = (i11 ^ 105) | i12;
                    int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
                    b = i14 % 128;
                    int i15 = i14 % 2;
                    if (j.v(t.d)) {
                        int i16 = a;
                        i = ((i16 | 111) << 1) - (i16 ^ 111);
                        b = i % 128;
                        if (i % 2 == 0) {
                            j.l(t);
                            t.e.add(j);
                            int i17 = 4 / 0;
                        } else {
                            j.l(t);
                            t.e.add(j);
                        }
                        int i18 = a;
                        int i19 = (i18 & 73) + (i18 | 73);
                        b = i19 % 128;
                        int i20 = i19 % 2;
                    }
                }
            }
        } else if (v(t.d)) {
            int i21 = a;
            int i22 = i21 & 123;
            int i23 = (i21 ^ 123) | i22;
            int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
            b = i24 % 128;
            int i110 = i24 % 2;
            while (r1.hasNext()) {
                int i111 = a;
                int i112 = i111 & 105;
                int i113 = (i111 ^ 105) | i112;
                int i114 = ((i112 | i113) << 1) - (i113 ^ i112);
                b = i114 % 128;
                int i115 = i114 % 2;
                if (j.v(t.d)) {
                    int i116 = a;
                    i = ((i116 | 111) << 1) - (i116 ^ 111);
                    b = i % 128;
                    if (i % 2 == 0) {
                        j.l(t);
                        t.e.add(j);
                        int i117 = 4 / 0;
                    } else {
                        j.l(t);
                        t.e.add(j);
                    }
                    int i118 = a;
                    int i119 = (i118 & 73) + (i118 | 73);
                    b = i119 % 128;
                    int i25 = i119 % 2;
                }
            }
        }
        int i26 = a;
        int i27 = ((i26 ^ 23) | (i26 & 23)) << 1;
        int i28 = -(((~i26) & 23) | (i26 & (-24)));
        int i29 = (i27 & i28) + (i28 | i27);
        b = i29 % 128;
        int i30 = i29 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.aM.J
    public J y(J.InterfaceC0070bHc interfaceC0070bHc) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 | 67;
        int i4 = (i3 << 1) - ((~(i2 & 67)) & i3);
        b = i4 % 128;
        int i5 = i4 % 2;
        super.y(interfaceC0070bHc);
        int i6 = a;
        int i7 = (-2) - ((((i6 | 94) << 1) - (i6 ^ 94)) ^ (-1));
        b = i7 % 128;
        if (i7 % 2 != 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.aM.J
    public J z(View view) {
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = ((i4 & 54) + (i4 | 54)) - 1;
        int i6 = i5 % 128;
        a = i6;
        int i7 = i5 % 2;
        int i8 = i6 + 53;
        b = i8 % 128;
        int i9 = i8 % 2;
        int i10 = 0;
        while (i10 < this.A.size()) {
            int i11 = a;
            int i12 = i11 ^ 21;
            int i13 = ((i11 & 21) | i12) << 1;
            int i14 = -i12;
            int i15 = ((i13 | i14) << 1) - (i13 ^ i14);
            b = i15 % 128;
            int i16 = i15 % 2;
            J j = this.A.get(i10);
            if (i16 == 0) {
                j.z(view);
                int i17 = 7 / 0;
            } else {
                j.z(view);
            }
            int i18 = b;
            int i19 = i18 & 3;
            int i20 = ((i18 ^ 3) | i19) << 1;
            int i21 = -((i18 | 3) & (~i19));
            int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
            a = i22 % 128;
            if (i22 % 2 != 0) {
                int i23 = i10 & 63;
                int i24 = (i10 | 63) & (~i23);
                int i25 = i23 << 1;
                i = i24 ^ i25;
                i2 = (i24 & i25) << 1;
            } else {
                int i26 = i10 & 1;
                int i27 = (i10 | 1) & (~i26);
                int i28 = -(-(i26 << 1));
                i = i27 & i28;
                i2 = i27 | i28;
            }
            i10 = i + i2;
        }
        this.l.remove(view);
        int i29 = b;
        int i30 = ((i29 | 66) << 1) - (i29 ^ 66);
        int i31 = (i30 ^ (-1)) + (i30 << 1);
        a = i31 % 128;
        if (i31 % 2 == 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static class bHQ extends N {
        private static int a = 1;
        private static int b;
        public O c;

        public bHQ(O o2) {
            this.c = o2;
        }

        @Override // ivas.gov.bisp.enumeration.aM.J.InterfaceC0070bHc
        public void b(J j) {
            O o2;
            int i;
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = (i3 & (-100)) | ((~i3) & 99);
            int i5 = -(-((i3 & 99) << 1));
            int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
            a = i6 % 128;
            if (i6 % 2 == 0) {
                o2 = this.c;
                int i7 = o2.B;
                i = (i7 - (~((i7 ^ (-1)) | i7))) - 1;
            } else {
                o2 = this.c;
                int i8 = -(o2.B ^ (-1));
                i = (((-2) | i8) << 1) - (i8 ^ (-2));
            }
            o2.B = i;
            if (i == 0) {
                int i9 = a;
                int i10 = ((i9 ^ 95) | (i9 & 95)) << 1;
                int i11 = -(((~i9) & 95) | (i9 & (-96)));
                int i12 = (i10 & i11) + (i11 | i10);
                b = i12 % 128;
                int i13 = i12 % 2;
                o2.D = false;
                o2.r();
            }
            j.y(this);
            int i14 = b + 55;
            a = i14 % 128;
            int i15 = i14 % 2;
        }

        @Override // ivas.gov.bisp.enumeration.aM.N, ivas.gov.bisp.enumeration.aM.J.InterfaceC0070bHc
        public void a(J j) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((((i2 ^ 81) | (i2 & 81)) << 1) - (~(-(((~i2) & 81) | (i2 & (-82)))))) - 1;
            b = i3 % 128;
            int i4 = i3 % 2;
            O o2 = this.c;
            if (!o2.D) {
                int i5 = b;
                int i6 = i5 & 11;
                int i7 = -(-(i5 | 11));
                int i8 = (i6 & i7) + (i7 | i6);
                a = i8 % 128;
                int i9 = i8 % 2;
                o2.H();
                this.c.D = true;
                int i10 = a + 5;
                b = i10 % 128;
                int i11 = i10 % 2;
            }
            int i12 = b;
            int i13 = i12 & 91;
            int i14 = (i12 | 91) & (~i13);
            int i15 = -(-(i13 << 1));
            int i16 = (i14 ^ i15) + ((i14 & i15) << 1);
            a = i16 % 128;
            if (i16 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // ivas.gov.bisp.enumeration.aM.J
    public void C(J.bHg bhg) {
        int i;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = (-2) - ((b + 30) ^ (-1));
        a = i5 % 128;
        if (i5 % 2 != 0) {
            this.y = bhg;
            i = this.C;
            i2 = 97;
        } else {
            this.y = bhg;
            i = this.C;
            i2 = 8;
        }
        int i6 = a;
        int i7 = i6 & 25;
        int i8 = -(-((i6 ^ 25) | i7));
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        b = i9 % 128;
        int i10 = i9 % 2;
        int i11 = i & i2;
        int i12 = (i | i2) & (~i11);
        this.C = (i12 & i11) | (i12 ^ i11);
        int size = this.A.size();
        int i13 = b;
        int i14 = (i13 & (-104)) | ((~i13) & 103);
        int i15 = (i13 & 103) << 1;
        int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
        a = i16 % 128;
        int i17 = i16 % 2;
        int i18 = 0;
        while (i18 < size) {
            int i19 = a;
            int i20 = (i19 ^ 31) + ((i19 & 31) << 1);
            b = i20 % 128;
            int i21 = i20 % 2;
            this.A.get(i18).C(bhg);
            int i22 = a;
            int i23 = (i22 | 5) << 1;
            int i24 = -(i22 ^ 5);
            int i25 = (i23 & i24) + (i24 | i23);
            b = i25 % 128;
            if (i25 % 2 == 0) {
                int i26 = ((i18 ^ 1) | (i18 & 1)) << 1;
                int i27 = -(((~i18) & 1) | (i18 & (-2)));
                i3 = (i26 & i27) + (i27 | i26);
            } else {
                int i28 = ((i18 | (-127)) << 1) - (i18 ^ (-127));
                int i29 = i28 & 128;
                int i30 = (i28 | 128) & (~i29);
                int i31 = i29 << 1;
                i3 = ((i30 | i31) << 1) - (i31 ^ i30);
            }
            i18 = i3;
        }
        int i32 = a;
        int i33 = i32 & 93;
        int i34 = (i33 - (~((i32 ^ 93) | i33))) - 1;
        b = i34 % 128;
        int i35 = i34 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.aM.J
    public void w(View view) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 85;
        int i4 = ((i2 ^ 85) | i3) << 1;
        int i5 = -((i2 | 85) & (~i3));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        super.w(view);
        int size = this.A.size();
        int i8 = a;
        int i9 = ((i8 & 16) + (i8 | 16)) - 1;
        int i10 = i9 % 128;
        b = i10;
        int i11 = i9 % 2 == 0 ? 1 : 0;
        int i12 = i10 + 97;
        a = i12 % 128;
        int i13 = i12 % 2;
        while (true) {
            Object obj = null;
            if (i11 >= size) {
                int i14 = b;
                int i15 = i14 & 45;
                int i16 = (i14 | 45) & (~i15);
                int i17 = -(-(i15 << 1));
                int i18 = (i16 & i17) + (i16 | i17);
                a = i18 % 128;
                if (i18 % 2 != 0) {
                    throw null;
                }
                return;
            }
            int i19 = b + 109;
            a = i19 % 128;
            if (i19 % 2 != 0) {
                this.A.get(i11).w(view);
                obj.hashCode();
                throw null;
            }
            this.A.get(i11).w(view);
            i11 = (-2) - ((((i11 | 2) << 1) - (i11 ^ 2)) ^ (-1));
            int i20 = b;
            int i21 = (i20 ^ 59) + ((i20 & 59) << 1);
            a = i21 % 128;
            int i22 = i21 % 2;
        }
    }

    @Override // ivas.gov.bisp.enumeration.aM.J
    public void x(View view) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 81) << 1) - (i2 ^ 81);
        b = i3 % 128;
        int i4 = i3 % 2;
        super.x(view);
        int size = this.A.size();
        int i5 = a;
        int i6 = i5 & 47;
        int i7 = (i5 ^ 47) | i6;
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        int i9 = i8 % 128;
        b = i9;
        Object obj = null;
        if (i8 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i10 = ((i9 | 75) << 1) - (i9 ^ 75);
        a = i10 % 128;
        int i11 = i10 % 2;
        int i12 = 0;
        while (i12 < size) {
            int i13 = b;
            int i14 = ((i13 | 101) << 1) - (i13 ^ 101);
            a = i14 % 128;
            int i15 = i14 % 2;
            J j = this.A.get(i12);
            int i16 = b;
            int i17 = (i16 & (-108)) | ((~i16) & 107);
            int i18 = -(-((i16 & 107) << 1));
            int i19 = (i17 & i18) + (i18 | i17);
            a = i19 % 128;
            int i20 = i19 % 2;
            j.x(view);
            int i21 = i12 ^ 1;
            int i22 = ((i12 & 1) | i21) << 1;
            int i23 = -i21;
            i12 = ((i22 | i23) << 1) - (i22 ^ i23);
            int i24 = b;
            int i25 = i24 & 105;
            int i26 = (i24 ^ 105) | i25;
            int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
            a = i27 % 128;
            int i28 = i27 % 2;
        }
        int i29 = a;
        int i30 = ((i29 ^ 37) - (~(-(-((i29 & 37) << 1))))) - 1;
        b = i30 % 128;
        if (i30 % 2 == 0) {
            throw null;
        }
    }

    @Override // ivas.gov.bisp.enumeration.aM.J
    public String I(String str) {
        StringBuilder sbB;
        ArrayList<J> arrayList;
        int i = 2 % 2;
        int i2 = (-2) - ((b + 70) ^ (-1));
        a = i2 % 128;
        int i3 = i2 % 2;
        String strI = super.I(str);
        int i4 = b;
        int i5 = (i4 & 37) + (i4 | 37);
        a = i5 % 128;
        int i6 = i5 % 2;
        int i7 = 0;
        while (i7 < this.A.size()) {
            int i8 = b;
            int i9 = (((i8 ^ 41) | (i8 & 41)) << 1) - (((~i8) & 41) | (i8 & (-42)));
            a = i9 % 128;
            if (i9 % 2 != 0) {
                sbB = ivas.gov.bisp.enumeration.p003ac.P.b(strI, "\n");
                arrayList = this.A;
                int i10 = 57 / 0;
            } else {
                sbB = ivas.gov.bisp.enumeration.p003ac.P.b(strI, "\n");
                arrayList = this.A;
            }
            J j = arrayList.get(i7);
            StringBuilder sb = new StringBuilder();
            int i11 = a + 49;
            b = i11 % 128;
            if (i11 % 2 == 0) {
                sb.append(str);
                int i12 = 89 / 0;
            } else {
                sb.append(str);
            }
            sb.append("  ");
            String string = sb.toString();
            int i13 = b;
            int i14 = (i13 ^ 55) + ((i13 & 55) << 1);
            a = i14 % 128;
            int i15 = i14 % 2;
            sbB.append(j.I(string));
            strI = sbB.toString();
            int i16 = b;
            int i17 = (-2) - (((i16 ^ 122) + ((i16 & 122) << 1)) ^ (-1));
            int i18 = i17 % 128;
            a = i18;
            if (i17 % 2 != 0) {
                int i19 = (i7 & 108) + (i7 | 108);
                i7 = (i19 ^ (-39)) + ((i19 & (-39)) << 1);
            } else {
                int i20 = (i7 & 103) | ((~i7) & (-104));
                int i21 = -(-((i7 & (-104)) << 1));
                int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
                i7 = ((i22 & 105) - (~(-(-(i22 | 105))))) - 1;
            }
            int i23 = (i18 & 125) + (i18 | 125);
            b = i23 % 128;
            int i24 = i23 % 2;
        }
        int i25 = a;
        int i26 = i25 & 7;
        int i27 = (i26 - (~((i25 ^ 7) | i26))) - 1;
        b = i27 % 128;
        if (i27 % 2 != 0) {
            return strI;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.aM.J
    public J h(View view) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 63) | (i2 & 63)) << 1;
        int i4 = -(((~i2) & 63) | (i2 & (-64)));
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        int i7 = 0;
        while (true) {
            Object obj = null;
            if (i7 >= this.A.size()) {
                this.l.add(view);
                int i8 = b;
                int i9 = i8 & 95;
                int i10 = (((i8 | 95) & (~i9)) - (~(-(-(i9 << 1))))) - 1;
                a = i10 % 128;
                if (i10 % 2 == 0) {
                    return this;
                }
                obj.hashCode();
                throw null;
            }
            int i11 = b + 11;
            a = i11 % 128;
            if (i11 % 2 != 0) {
                this.A.get(i7).h(view);
                throw null;
            }
            this.A.get(i7).h(view);
            int i12 = a;
            int i13 = (i12 & (-6)) | ((~i12) & 5);
            int i14 = -(-((i12 & 5) << 1));
            int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
            int i16 = i15 % 128;
            b = i16;
            int i17 = i15 % 2;
            int i18 = i7 & (-50);
            int i19 = (i7 | (-50)) & (~i18);
            int i20 = -(-(i18 << 1));
            int i21 = (i19 & i20) + (i19 | i20);
            i7 = ((i21 & 51) - (~(i21 | 51))) - 1;
            int i22 = ((i16 ^ 51) | (i16 & 51)) << 1;
            int i23 = -(((~i16) & 51) | (i16 & (-52)));
            int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
            a = i24 % 128;
            int i25 = i24 % 2;
        }
    }

    @Override // ivas.gov.bisp.enumeration.aM.J
    public void i(T t) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-50)) | ((~i2) & 49);
        int i4 = -(-((i2 & 49) << 1));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            v(t.d);
            obj.hashCode();
            throw null;
        }
        if (v(t.d)) {
            int i6 = b + 115;
            a = i6 % 128;
            if (i6 % 2 != 0) {
                this.A.iterator();
                throw null;
            }
            Iterator<J> it = this.A.iterator();
            int i7 = b + 39;
            a = i7 % 128;
            int i8 = i7 % 2;
            while (it.hasNext()) {
                int i9 = a;
                int i10 = i9 & 119;
                int i11 = -(-((i9 ^ 119) | i10));
                int i12 = (i10 & i11) + (i11 | i10);
                b = i12 % 128;
                if (i12 % 2 == 0) {
                    it.next();
                    View view = t.d;
                    obj.hashCode();
                    throw null;
                }
                J next = it.next();
                if (!(!next.v(t.d))) {
                    int i13 = a;
                    int i14 = (i13 | 83) << 1;
                    int i15 = -(i13 ^ 83);
                    int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
                    b = i16 % 128;
                    if (i16 % 2 == 0) {
                        next.i(t);
                        t.e.add(next);
                        throw null;
                    }
                    next.i(t);
                    t.e.add(next);
                    int i17 = b;
                    int i18 = ((i17 ^ 86) + ((i17 & 86) << 1)) - 1;
                    int i19 = i18 % 128;
                    a = i19;
                    int i20 = i18 % 2;
                    int i21 = i19 ^ 101;
                    int i22 = (i19 & 101) << 1;
                    int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
                    b = i23 % 128;
                    int i24 = i23 % 2;
                }
            }
        }
        int i25 = b;
        int i26 = (i25 & 99) + (i25 | 99);
        a = i26 % 128;
        int i27 = i26 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.aM.J
    public void p(ViewGroup viewGroup, e eVar, e eVar2, ArrayList<T> arrayList, ArrayList<T> arrayList2) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 11;
        int i4 = i3 + ((i2 ^ 11) | i3);
        b = i4 % 128;
        int i5 = i4 % 2;
        long j = this.h;
        int size = this.A.size();
        int i6 = a;
        int i7 = ((i6 & (-126)) | ((~i6) & 125)) + ((i6 & 125) << 1);
        b = i7 % 128;
        int i8 = i7 % 2;
        int i9 = 0;
        while (i9 < size) {
            int i10 = b;
            int i11 = i10 & 51;
            int i12 = -(-(i10 | 51));
            int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
            a = i13 % 128;
            int i14 = i13 % 2;
            J j2 = this.A.get(i9);
            int i15 = a;
            int i16 = i15 ^ 69;
            int i17 = -(-((i15 & 69) << 1));
            int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
            b = i18 % 128;
            if (i18 % 2 != 0 ? j > 0 : j > 1) {
                int i19 = (-2) - ((((i15 | 44) << 1) - (i15 ^ 44)) ^ (-1));
                b = i19 % 128;
                if (i19 % 2 == 0) {
                    throw null;
                }
                if (this.z || i9 == 0) {
                    long j3 = j2.h;
                    if (j3 > 0) {
                        int i20 = a;
                        int i21 = (((i20 | 40) << 1) - (i20 ^ 40)) - 1;
                        b = i21 % 128;
                        if (i21 % 2 == 0) {
                            j2.G(j3 ^ j);
                        } else {
                            j2.G(j3 + j);
                        }
                    } else {
                        j2.G(j);
                        int i22 = a;
                        int i23 = i22 & 9;
                        int i24 = i22 | 9;
                        int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
                        b = i25 % 128;
                        int i26 = i25 % 2;
                    }
                }
            }
            j2.p(viewGroup, eVar, eVar2, arrayList, arrayList2);
            int i27 = b;
            int i28 = (((i27 & (-110)) | ((~i27) & 109)) - (~((i27 & 109) << 1))) - 1;
            a = i28 % 128;
            if (i28 % 2 != 0) {
                int i29 = i9 + 17;
                int i30 = (i29 ^ (-1)) + (i29 << 1);
                int i31 = i30 & 60;
                int i32 = (i30 | 60) & (~i31);
                int i33 = i31 << 1;
                i9 = (i32 & i33) + (i33 | i32);
            } else {
                i9 = (-2) - ((i9 + 2) ^ (-1));
            }
        }
        int i34 = b;
        int i35 = (i34 ^ 57) + ((i34 & 57) << 1);
        a = i35 % 128;
        int i36 = i35 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.aM.J
    public void D(h hVar) {
        int i = 2 % 2;
        int i2 = (-2) - ((b + 90) ^ (-1));
        a = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (hVar == null) {
            this.x = J.e;
            int i3 = a;
            int i4 = (i3 & (-16)) | ((~i3) & 15);
            int i5 = -(-((i3 & 15) << 1));
            int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
            b = i6 % 128;
            int i7 = i6 % 2;
        } else {
            this.x = hVar;
            int i8 = b;
            int i9 = i8 & 71;
            int i10 = i9 + ((i8 ^ 71) | i9);
            a = i10 % 128;
            int i11 = i10 % 2;
        }
        int i12 = this.C;
        int i13 = i12 & 4;
        int i14 = (i12 | 4) & (~i13);
        this.C = (i14 & i13) | (i14 ^ i13);
        if (this.A != null) {
            int i15 = b;
            int i16 = (-2) - (((i15 & 58) + (i15 | 58)) ^ (-1));
            a = i16 % 128;
            int i17 = i16 % 2;
            int i18 = 0;
            while (i18 < this.A.size()) {
                int i19 = a;
                int i20 = i19 & 15;
                int i21 = ((i19 ^ 15) | i20) << 1;
                int i22 = -((i19 | 15) & (~i20));
                int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
                b = i23 % 128;
                int i24 = i23 % 2;
                J j = this.A.get(i18);
                int i25 = b;
                int i26 = (((i25 & (-92)) | ((~i25) & 91)) - (~(-(-((i25 & 91) << 1))))) - 1;
                a = i26 % 128;
                if (i26 % 2 != 0) {
                    j.D(hVar);
                    int i27 = ((i18 ^ 33) | (i18 & 33)) << 1;
                    int i28 = -(((~i18) & 33) | (i18 & (-34)));
                    i18 = ((i27 | i28) << 1) - (i28 ^ i27);
                } else {
                    j.D(hVar);
                    i18 = (-2) - (((i18 ^ 2) + ((i18 & 2) << 1)) ^ (-1));
                }
                int i29 = b;
                int i30 = i29 & 93;
                int i31 = ((i29 | 93) & (~i30)) + (i30 << 1);
                a = i31 % 128;
                int i32 = i31 % 2;
            }
        }
        int i33 = a;
        int i34 = (i33 & (-126)) | ((~i33) & 125);
        int i35 = -(-((i33 & 125) << 1));
        int i36 = (i34 ^ i35) + ((i35 & i34) << 1);
        b = i36 % 128;
        if (i36 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0039 A[PHI: r2
  0x0039: PHI (r2v9 long) = (r2v8 long), (r2v61 long) binds: [B:10:0x0037, B:7:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    public O L(J j) {
        long j2;
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & (-102)) | ((~i2) & 101)) + ((i2 & 101) << 1);
        b = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            this.A.add(j);
            j.n = this;
            throw null;
        }
        this.A.add(j);
        j.n = this;
        int i4 = a + 41;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            j2 = this.i;
            if (j2 >= 0) {
                j.A(j2);
                int i5 = a;
                int i6 = i5 & 15;
                int i7 = (i5 ^ 15) | i6;
                int i8 = (i6 & i7) + (i7 | i6);
                b = i8 % 128;
                int i9 = i8 % 2;
            }
        } else {
            j2 = this.i;
            if (j2 >= 0) {
                j.A(j2);
                int i10 = a;
                int i11 = i10 & 15;
                int i12 = (i10 ^ 15) | i11;
                int i13 = (i11 & i12) + (i12 | i11);
                b = i13 % 128;
                int i14 = i13 % 2;
            }
        }
        if ((this.C & 1) != 0) {
            int i15 = b;
            int i16 = (i15 ^ 1) + ((i15 & 1) << 1);
            a = i16 % 128;
            if (i16 % 2 != 0) {
                j.E(this.k);
                obj.hashCode();
                throw null;
            }
            j.E(this.k);
            int i17 = b;
            int i18 = (((i17 | 84) << 1) - (i17 ^ 84)) - 1;
            a = i18 % 128;
            int i19 = i18 % 2;
        }
        if ((this.C & 2) != 0) {
            int i20 = b;
            int i21 = i20 & 101;
            int i22 = ((i20 | 101) & (~i21)) + (i21 << 1);
            a = i22 % 128;
            int i23 = i22 % 2;
            j.F(null);
            int i24 = b + 43;
            a = i24 % 128;
            if (i24 % 2 != 0) {
                int i25 = 5 / 4;
            }
        }
        if ((this.C & 4) != 0) {
            int i26 = (-2) - ((a + 34) ^ (-1));
            b = i26 % 128;
            if (i26 % 2 == 0) {
                j.D(this.x);
                throw null;
            }
            j.D(this.x);
        }
        if ((this.C & 8) != 0) {
            int i27 = b;
            int i28 = i27 & 125;
            int i29 = ((i27 ^ 125) | i28) << 1;
            int i30 = -((i27 | 125) & (~i28));
            int i31 = (i29 ^ i30) + ((i30 & i29) << 1);
            a = i31 % 128;
            if (i31 % 2 != 0) {
                j.C(this.y);
                int i32 = 78 / 0;
            } else {
                j.C(this.y);
            }
            int i33 = a;
            int i34 = i33 & 21;
            int i35 = (i33 | 21) & (~i34);
            int i36 = -(-(i34 << 1));
            int i37 = (i35 ^ i36) + ((i35 & i36) << 1);
            b = i37 % 128;
            int i38 = i37 % 2;
        }
        int i39 = b + 23;
        a = i39 % 128;
        if (i39 % 2 == 0) {
            return this;
        }
        obj.hashCode();
        throw null;
    }

    public O M(long j) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 125;
        int i4 = (((i2 | 125) & (~i3)) - (~(-(-(i3 << 1))))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        this.i = j;
        if (j >= 0) {
            int i6 = a + 99;
            int i7 = i6 % 128;
            b = i7;
            Object obj = null;
            if (i6 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            ArrayList<J> arrayList = this.A;
            if (arrayList != null) {
                int i8 = i7 | 83;
                int i9 = (i8 << 1) - ((~(i7 & 83)) & i8);
                a = i9 % 128;
                int i10 = i9 % 2;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    int i12 = a + 59;
                    b = i12 % 128;
                    if (i12 % 2 == 0) {
                        this.A.get(i11).A(j);
                        obj.hashCode();
                        throw null;
                    }
                    this.A.get(i11).A(j);
                    int i13 = a;
                    int i14 = i13 & 19;
                    int i15 = i14 + ((i13 ^ 19) | i14);
                    int i16 = i15 % 128;
                    b = i16;
                    if (i15 % 2 == 0) {
                        int i17 = i11 & 10;
                        int i18 = -(-((i11 ^ 10) | i17));
                        int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
                        int i20 = i19 ^ 87;
                        int i21 = -(-((i19 & 87) << 1));
                        i11 = (i20 & i21) + (i20 | i21);
                    } else {
                        int i22 = ((i11 ^ (-112)) - (~(-(-((i11 & (-112)) << 1))))) - 1;
                        i11 = (((i22 | 114) << 1) - (i22 ^ 114)) - 1;
                    }
                    int i23 = i16 ^ 69;
                    int i24 = ((i16 & 69) | i23) << 1;
                    int i25 = -i23;
                    int i26 = (i24 ^ i25) + ((i24 & i25) << 1);
                    a = i26 % 128;
                    if (i26 % 2 != 0) {
                        int i27 = 5 % 4;
                    }
                }
            }
        }
        int i28 = b;
        int i29 = (i28 & 12) + (i28 | 12);
        int i30 = (i29 ^ (-1)) + (i29 << 1);
        a = i30 % 128;
        int i31 = i30 % 2;
        return this;
    }

    @Override // ivas.gov.bisp.enumeration.aM.J
    public J n() {
        int i = 2 % 2;
        O o2 = (O) super.n();
        ArrayList<J> arrayList = new ArrayList<>();
        int i2 = a;
        int i3 = (i2 ^ 57) + ((i2 & 57) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        o2.A = arrayList;
        int size = this.A.size();
        int i5 = b;
        int i6 = ((i5 ^ 99) | (i5 & 99)) << 1;
        int i7 = -(((~i5) & 99) | (i5 & (-100)));
        int i8 = (i6 & i7) + (i7 | i6);
        a = i8 % 128;
        int i9 = i8 % 2;
        int i10 = 0;
        while (i10 < size) {
            int i11 = a;
            int i12 = ((i11 ^ 17) | (i11 & 17)) << 1;
            int i13 = -(((~i11) & 17) | (i11 & (-18)));
            int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
            b = i14 % 128;
            if (i14 % 2 == 0) {
                this.A.get(i10);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            J j = this.A.get(i10);
            int i15 = a;
            int i16 = i15 & 7;
            int i17 = (i16 - (~((i15 ^ 7) | i16))) - 1;
            b = i17 % 128;
            int i18 = i17 % 2;
            J jN = j.n();
            ArrayList<J> arrayList2 = o2.A;
            int i19 = b;
            int i20 = (i19 ^ 62) + ((i19 & 62) << 1);
            int i21 = (i20 ^ (-1)) + (i20 << 1);
            a = i21 % 128;
            int i22 = i21 % 2;
            arrayList2.add(jN);
            jN.n = o2;
            i10 = (i10 | 1) + (i10 & 1);
            int i23 = b;
            int i24 = ((i23 & 118) + (i23 | 118)) - 1;
            a = i24 % 128;
            int i25 = i24 % 2;
        }
        int i26 = b;
        int i27 = (i26 ^ 7) + ((i26 & 7) << 1);
        a = i27 % 128;
        int i28 = i27 % 2;
        return o2;
    }

    @Override // ivas.gov.bisp.enumeration.aM.J
    public void B() {
        J j;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (-2) - ((((i2 | 68) << 1) - (i2 ^ 68)) ^ (-1));
        a = i3 % 128;
        int i4 = i3 % 2;
        if (this.A.isEmpty()) {
            int i5 = b;
            int i6 = ((i5 ^ 51) | (i5 & 51)) << 1;
            int i7 = -(((~i5) & 51) | (i5 & (-52)));
            int i8 = (i6 & i7) + (i7 | i6);
            a = i8 % 128;
            if (i8 % 2 != 0) {
                H();
                r();
                int i9 = 61 / 0;
            } else {
                H();
                r();
            }
            int i10 = b + 61;
            a = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 61 / 0;
                return;
            }
            return;
        }
        bHQ bhq = new bHQ(this);
        ArrayList<J> arrayList = this.A;
        int i12 = a;
        int i13 = (((i12 | 110) << 1) - (i12 ^ 110)) - 1;
        b = i13 % 128;
        int i14 = i13 % 2;
        Iterator<J> it = arrayList.iterator();
        int i15 = a;
        int i16 = i15 | 59;
        int i17 = ((i16 << 1) - (~(-((~(i15 & 59)) & i16)))) - 1;
        b = i17 % 128;
        while (true) {
            int i18 = i17 % 2;
            if (!it.hasNext()) {
                this.B = this.A.size();
                if (!this.z) {
                    int i19 = a;
                    int i20 = i19 + 38;
                    int i21 = (i20 ^ (-1)) + (i20 << 1);
                    b = i21 % 128;
                    int i22 = i21 % 2;
                    int i23 = (i19 ^ 19) + ((i19 & 19) << 1);
                    b = i23 % 128;
                    int i24 = i23 % 2;
                    int i25 = 1;
                    while (i25 < this.A.size()) {
                        int i26 = a;
                        int i27 = i26 & 97;
                        int i28 = (((i26 | 97) & (~i27)) - (~(i27 << 1))) - 1;
                        b = i28 % 128;
                        if (i28 % 2 == 0) {
                            j = this.A.get(i25);
                        } else {
                            ArrayList<J> arrayList2 = this.A;
                            int i29 = ~i25;
                            int i30 = i25 << 1;
                            j = arrayList2.get((i29 ^ i30) + ((i29 & i30) << 1));
                        }
                        J j2 = j;
                        int i31 = b;
                        int i32 = ((i31 ^ 20) + ((i31 & 20) << 1)) - 1;
                        a = i32 % 128;
                        int i33 = i32 % 2;
                        j2.g(new bHP(this, this.A.get(i25)));
                        int i34 = i25 & 111;
                        int i35 = (i34 - (~(-(-((i25 ^ 111) | i34))))) - 1;
                        i25 = ((i35 & 109) | ((~i35) & (-110))) + ((i35 & (-110)) << 1);
                        int i36 = b;
                        int i37 = (i36 ^ 13) + ((i36 & 13) << 1);
                        a = i37 % 128;
                        int i38 = i37 % 2;
                    }
                    J j3 = this.A.get(0);
                    if (j3 != null) {
                        int i39 = b;
                        int i40 = i39 & 11;
                        int i41 = (i39 | 11) & (~i40);
                        int i42 = -(-(i40 << 1));
                        int i43 = ((i41 | i42) << 1) - (i41 ^ i42);
                        a = i43 % 128;
                        if (i43 % 2 != 0) {
                            j3.B();
                            int i44 = 59 / 0;
                        } else {
                            j3.B();
                        }
                        int i45 = a;
                        int i46 = i45 & 37;
                        int i47 = (i45 ^ 37) | i46;
                        int i48 = (i46 & i47) + (i47 | i46);
                        b = i48 % 128;
                        if (i48 % 2 == 0) {
                            int i49 = 9 / 0;
                            return;
                        }
                        return;
                    }
                } else {
                    Iterator<J> it2 = this.A.iterator();
                    int i50 = b;
                    int i51 = ((i50 | 63) << 1) - (i50 ^ 63);
                    a = i51 % 128;
                    if (i51 % 2 != 0) {
                        int i52 = 2 / 3;
                    }
                    while (it2.hasNext()) {
                        int i53 = b;
                        int i54 = i53 & 85;
                        int i55 = -(-(i53 | 85));
                        int i56 = (i54 ^ i55) + ((i55 & i54) << 1);
                        a = i56 % 128;
                        if (i56 % 2 != 0) {
                            it2.next().B();
                            int i57 = 42 / 0;
                        } else {
                            it2.next().B();
                        }
                        int i58 = b;
                        int i59 = i58 & 25;
                        int i60 = (i58 ^ 25) | i59;
                        int i61 = (i59 ^ i60) + ((i60 & i59) << 1);
                        a = i61 % 128;
                        int i62 = i61 % 2;
                    }
                }
                int i63 = a;
                int i64 = i63 & 5;
                int i65 = ((i63 ^ 5) | i64) << 1;
                int i66 = -((i63 | 5) & (~i64));
                int i67 = (i65 ^ i66) + ((i66 & i65) << 1);
                b = i67 % 128;
                int i68 = i67 % 2;
                return;
            }
            int i69 = b;
            int i70 = (i69 ^ 19) + ((i69 & 19) << 1);
            a = i70 % 128;
            int i71 = i70 % 2;
            it.next().g(bhq);
            int i72 = a;
            int i73 = i72 & 3;
            int i74 = -(-(i72 | 3));
            int i75 = ((i73 | i74) << 1) - (i74 ^ i73);
            int i76 = i75 % 128;
            b = i76;
            if (i75 % 2 == 0) {
                throw null;
            }
            int i77 = i76 & 67;
            int i78 = -(-(i76 | 67));
            i17 = (i77 & i78) + (i78 | i77);
            a = i17 % 128;
        }
    }
}
