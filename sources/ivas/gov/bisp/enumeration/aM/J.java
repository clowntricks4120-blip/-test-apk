package ivas.gov.bisp.enumeration.aM;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListAdapter;
import android.widget.ListView;
import ivas.gov.bisp.enumeration.OooOOoo.OooO0o;
import ivas.gov.bisp.enumeration.p001aa.C0083p;
import ivas.gov.bisp.enumeration.p001aa.r;
import ivas.gov.bisp.enumeration.p003ac.e;
import ivas.gov.bisp.enumeration.p091n.j;
import ivas.gov.bisp.enumeration.p096p.h;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public abstract class J implements Cloneable {
    private static int a = 0;
    private static int b = 1;
    public ArrayList<T> p;
    public ArrayList<T> r;
    public bHg y;
    public static final int[] d = {2, 1, 3, 4};
    public static final h e = new bHC();
    public static ThreadLocal<OooO0o<Animator, bHD>> c = new ThreadLocal<>();
    public String g = getClass().getName();
    public long h = -1;
    public long i = -1;
    public TimeInterpolator k = null;
    public ArrayList<Integer> j = new ArrayList<>();
    public ArrayList<View> l = new ArrayList<>();
    public e m = new e(2);
    public e f = new e(2);
    public O n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int[] f61o = d;
    public ArrayList<Animator> q = new ArrayList<>();
    public int s = 0;
    public boolean t = false;
    public boolean v = false;
    public ArrayList<InterfaceC0070bHc> u = null;
    public ArrayList<Animator> w = new ArrayList<>();
    public h x = e;

    public static final class bHC extends h {
        private static int a = 1;
        private static int b;

        @Override // ivas.gov.bisp.enumeration.p096p.h
        public final Path al(float f, float f2, float f3, float f4) {
            int i = 2 % 2;
            Path path = new Path();
            int i2 = a;
            int i3 = i2 & 13;
            int i4 = ((i2 ^ 13) | i3) << 1;
            int i5 = -((i2 | 13) & (~i3));
            int i6 = (i4 & i5) + (i5 | i4);
            b = i6 % 128;
            int i7 = i6 % 2;
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            int i8 = b;
            int i9 = i8 ^ 31;
            int i10 = -(-((i8 & 31) << 1));
            int i11 = (i9 & i10) + (i10 | i9);
            a = i11 % 128;
            if (i11 % 2 != 0) {
                return path;
            }
            throw null;
        }
    }

    public static class bHD {
        public View a;
        public String b;
        public T c;
        public W d;
        public J e;

        public bHD(View view, String str, J j, W w, T t) {
            this.a = view;
            this.b = str;
            this.c = t;
            this.d = w;
            this.e = j;
        }
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aM.J$bHc, reason: case insensitive filesystem */
    public interface InterfaceC0070bHc {
        void a(J j);

        void b(J j);

        void c(J j);

        void d(J j);

        void e(J j);
    }

    public static abstract class bHg {
    }

    public J A(long j) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 114) + ((i2 & 114) << 1)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        this.i = j;
        int i5 = i2 & 121;
        int i6 = (~i5) & (i2 | 121);
        int i7 = -(-(i5 << 1));
        int i8 = (i6 & i7) + (i7 | i6);
        b = i8 % 128;
        if (i8 % 2 != 0) {
            return this;
        }
        throw null;
    }

    public void C(bHg bhg) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 93;
        int i4 = i3 + ((i2 ^ 93) | i3);
        a = i4 % 128;
        int i5 = i4 % 2;
        this.y = bhg;
        int i6 = i2 & 47;
        int i7 = i6 + ((i2 ^ 47) | i6);
        a = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        r4.x = ivas.gov.bisp.enumeration.aM.J.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        r4.x = ivas.gov.bisp.enumeration.aM.J.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        r4.x = r5;
        r5 = r1 & 103;
        r1 = -(-((r1 ^ 103) | r5));
        r3 = ((r5 | r1) << 1) - (r5 ^ r1);
        ivas.gov.bisp.enumeration.aM.J.b = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        if ((r3 % 2) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        if (r5 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r5 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        r5 = ((r1 & 107) - (~(-(-(r1 | 107))))) - 1;
        ivas.gov.bisp.enumeration.aM.J.b = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
    
        if ((r5 % 2) == 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void D(ivas.gov.bisp.enumeration.p096p.h r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.aM.J.b
            r2 = r1 ^ 27
            r1 = r1 & 27
            int r1 = r1 << 1
            r3 = r2 & r1
            r1 = r1 | r2
            int r3 = r3 + r1
            int r1 = r3 % 128
            ivas.gov.bisp.enumeration.aM.J.a = r1
            int r3 = r3 % r0
            r2 = 0
            if (r3 == 0) goto L1e
            r3 = 46
            int r3 = r3 / 0
            if (r5 != 0) goto L3b
            goto L20
        L1e:
            if (r5 != 0) goto L3b
        L20:
            r5 = r1 & 107(0x6b, float:1.5E-43)
            r1 = r1 | 107(0x6b, float:1.5E-43)
            int r1 = -r1
            int r1 = -r1
            int r1 = ~r1
            int r5 = r5 - r1
            int r5 = r5 + (-1)
            int r1 = r5 % 128
            ivas.gov.bisp.enumeration.aM.J.b = r1
            int r5 = r5 % r0
            if (r5 == 0) goto L36
            ivas.gov.bisp.enumeration.p.h r5 = ivas.gov.bisp.enumeration.aM.J.e
            r4.x = r5
            return
        L36:
            ivas.gov.bisp.enumeration.p.h r5 = ivas.gov.bisp.enumeration.aM.J.e
            r4.x = r5
            throw r2
        L3b:
            r4.x = r5
            r5 = r1 & 103(0x67, float:1.44E-43)
            r1 = r1 ^ 103(0x67, float:1.44E-43)
            r1 = r1 | r5
            int r1 = -r1
            int r1 = -r1
            r3 = r5 | r1
            int r3 = r3 << 1
            r5 = r5 ^ r1
            int r3 = r3 - r5
            int r5 = r3 % 128
            ivas.gov.bisp.enumeration.aM.J.b = r5
            int r3 = r3 % r0
            if (r3 == 0) goto L52
            return
        L52:
            r2.hashCode()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.aM.J.D(ivas.gov.bisp.enumeration.p.h):void");
    }

    public J E(TimeInterpolator timeInterpolator) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 125;
        int i4 = (i2 ^ 125) | i3;
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        this.k = timeInterpolator;
        int i7 = i2 & 109;
        int i8 = (((i2 ^ 109) | i7) << 1) - ((i2 | 109) & (~i7));
        b = i8 % 128;
        if (i8 % 2 != 0) {
            return this;
        }
        throw null;
    }

    public void F(h hVar) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 77) + ((i2 & 77) << 1);
        b = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public J G(long j) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 3) << 1) - (i2 ^ 3);
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        this.h = j;
        int i6 = i4 & 19;
        int i7 = ((i4 ^ 19) | i6) << 1;
        int i8 = -((~i6) & (i4 | 19));
        int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
        a = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 61 / 0;
        }
        return this;
    }

    public /* synthetic */ Object clone() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 121;
        int i4 = ((i2 & 121) | i3) << 1;
        int i5 = -i3;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        b = i6 % 128;
        int i7 = i6 % 2;
        J jN = n();
        int i8 = a;
        int i9 = i8 ^ 89;
        int i10 = (i8 & 89) << 1;
        int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
        b = i11 % 128;
        int i12 = i11 % 2;
        return jN;
    }

    public J g(InterfaceC0070bHc interfaceC0070bHc) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-108)) | ((~i2) & 107);
        int i4 = -(-((i2 & 107) << 1));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
        if (this.u == null) {
            this.u = new ArrayList<>();
            int i6 = a;
            int i7 = (i6 & (-116)) | ((~i6) & 115);
            int i8 = (i6 & 115) << 1;
            int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
            b = i9 % 128;
            int i10 = i9 % 2;
        }
        this.u.add(interfaceC0070bHc);
        int i11 = b;
        int i12 = (i11 ^ 32) + ((i11 & 32) << 1);
        int i13 = (i12 ^ (-1)) + (i12 << 1);
        a = i13 % 128;
        if (i13 % 2 == 0) {
            return this;
        }
        throw null;
    }

    public J h(View view) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 49) + (i2 | 49);
        b = i3 % 128;
        int i4 = i3 % 2;
        this.l.add(view);
        if (i4 == 0) {
            int i5 = 56 / 0;
        }
        return this;
    }

    public abstract void i(T t);

    public void j(T t) {
        int i = 2 % 2;
        int i2 = a + 49;
        b = i2 % 128;
        int i3 = i2 % 2;
    }

    public abstract void l(T t);

    public Animator o(ViewGroup viewGroup, T t, T t2) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 | 30) << 1) - (i2 ^ 30)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = (i2 ^ 40) + ((i2 & 40) << 1);
        int i6 = (i5 ^ (-1)) + (i5 << 1);
        b = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 73 / 0;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:11:0x006e  */
    /* JADX WARN: Code duplicated, block: B:133:0x0417 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x033b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x0234 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x022b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x031b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x02ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x040f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x0405 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:0x0426 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x0325 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:146:0x02e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:0x02f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:149:0x02f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x0077  */
    /* JADX WARN: Code duplicated, block: B:23:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:27:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:28:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:37:0x011d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0140  */
    /* JADX WARN: Code duplicated, block: B:41:0x0157 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0159  */
    /* JADX WARN: Code duplicated, block: B:44:0x016a  */
    /* JADX WARN: Code duplicated, block: B:46:0x0182  */
    /* JADX WARN: Code duplicated, block: B:48:0x01ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:52:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:54:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:56:0x01f6 A[LOOP:1: B:50:0x01c2->B:56:0x01f6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:63:0x0252  */
    /* JADX WARN: Code duplicated, block: B:66:0x0257  */
    /* JADX WARN: Code duplicated, block: B:68:0x0285  */
    /* JADX WARN: Code duplicated, block: B:70:0x028f  */
    /* JADX WARN: Code duplicated, block: B:72:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:74:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:76:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:82:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:89:0x0340  */
    /* JADX WARN: Code duplicated, block: B:91:0x0359  */
    /* JADX WARN: Code duplicated, block: B:94:0x0386  */
    /* JADX WARN: Code duplicated, block: B:96:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:98:0x03dc  */
    public void p(ViewGroup viewGroup, e eVar, e eVar2, ArrayList<T> arrayList, ArrayList<T> arrayList2) {
        Animator animatorO;
        int i;
        View view;
        Animator animator;
        T t;
        bHD bhd;
        int i2;
        int i3;
        View view2;
        String[] strArrS;
        int i4;
        View view3;
        int i5;
        Animator animator2;
        T t2;
        T t3;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        Animator animator3;
        int i11;
        bHD bhd2;
        int i12;
        String str;
        String str2;
        int i13;
        int i14;
        Map<String, Object> map;
        String str3;
        int i15;
        int i16 = 2;
        int i17 = 2 % 2;
        OooO0o<Animator, bHD> oooO0oD = d();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int i18 = a + 41;
        b = i18 % 128;
        int i19 = i18 % 2;
        int size = arrayList.size();
        int i20 = a + 120;
        int i21 = 1;
        int i22 = (i20 ^ (-1)) + (i20 << 1);
        b = i22 % 128;
        int i23 = i22 % 2;
        int i24 = 0;
        int i25 = 0;
        while (i25 < size) {
            int i26 = b + i21;
            a = i26 % 128;
            int i27 = i26 % i16;
            T t4 = arrayList.get(i25);
            int i28 = a;
            int i29 = (i28 & 99) + (i28 | 99);
            b = i29 % 128;
            int i30 = i29 % i16;
            T t5 = arrayList2.get(i25);
            int i31 = a;
            int i32 = (-2) - (((i31 & 94) + (i31 | 94)) ^ (-1));
            b = i32 % 128;
            if (i32 % i16 == 0) {
                int i33 = 98 / i24;
                if (t4 != null) {
                    if (!t4.e.contains(this)) {
                        int i34 = a;
                        int i35 = ((i34 | 97) << i21) - (i34 ^ 97);
                        int i36 = i35 % 128;
                        b = i36;
                        int i37 = i35 % i16;
                        int i38 = ((i36 & 75) - (~(-(-(i36 | 75))))) - i21;
                        a = i38 % 128;
                        int i39 = i38 % i16;
                        t4 = null;
                    }
                }
            } else if (t4 != null) {
                if (!t4.e.contains(this)) {
                    int i310 = a;
                    int i311 = ((i310 | 97) << i21) - (i310 ^ 97);
                    int i312 = i311 % 128;
                    b = i312;
                    int i313 = i311 % i16;
                    int i314 = ((i312 & 75) - (~(-(-(i312 | 75))))) - i21;
                    a = i314 % 128;
                    int i315 = i314 % i16;
                    t4 = null;
                }
            }
            if (t5 != null) {
                int i40 = b + 79;
                a = i40 % 128;
                if (i40 % i16 != 0) {
                    int i41 = 39 / i24;
                    if (!t5.e.contains(this)) {
                        int i42 = b + 49;
                        a = i42 % 128;
                        int i43 = i42 % 2;
                        t5 = null;
                    }
                } else if (t5.e.contains(this) != i21) {
                    int i44 = b + 49;
                    a = i44 % 128;
                    int i45 = i44 % 2;
                    t5 = null;
                }
            }
            if (t4 == null) {
                int i46 = a;
                int i47 = i46 ^ 103;
                int i48 = (i46 & 103) << i21;
                int i49 = (i47 ^ i48) + ((i48 & i47) << i21);
                b = i49 % 128;
                int i50 = i49 % i16;
                if (t5 == null) {
                    int i51 = b;
                    int i52 = (i51 & 77) + (i51 | 77);
                    a = i52 % 128;
                    int i53 = i52 % 2;
                } else if (t4 != null || t5 == null) {
                    int i54 = a;
                    int i55 = i54 & 121;
                    int i56 = (i54 | 121) & (~i55);
                    int i57 = i55 << i21;
                    int i58 = (i56 & i57) + (i56 | i57);
                    int i59 = i58 % 128;
                    b = i59;
                    int i60 = i58 % i16;
                    int i61 = i59 & 29;
                    int i62 = i61 + ((i59 ^ 29) | i61);
                    a = i62 % 128;
                    int i63 = i62 % i16;
                    animatorO = o(viewGroup, t4, t5);
                    if (animatorO != null) {
                        int i64 = b;
                        int i65 = i64 & 69;
                        int i66 = (i64 | 69) & (~i65);
                        int i67 = i65 << i21;
                        i = ((i66 | i67) << i21) - (i66 ^ i67);
                        a = i % 128;
                        if (i % i16 == 0) {
                            throw null;
                        }
                        if (t5 != null) {
                            view2 = t5.d;
                            strArrS = s();
                            int i68 = b + 63;
                            i4 = i68 % 128;
                            a = i4;
                            int i69 = i68 % i16;
                            if (strArrS != null) {
                                int i70 = (i4 & (-88)) | ((~i4) & 87);
                                int i71 = -(-((i4 & 87) << i21));
                                int i72 = (i70 ^ i71) + ((i70 & i71) << i21);
                                b = i72 % 128;
                                int i73 = i72 % i16;
                                if (strArrS.length > 0) {
                                    t2 = new T(view2);
                                    int i74 = b;
                                    int i75 = i74 & 75;
                                    int i76 = i75 + ((i74 ^ 75) | i75);
                                    a = i76 % 128;
                                    int i77 = i76 % i16;
                                    t3 = (T) ((r) eVar2.c).get(view2);
                                    i6 = a;
                                    i7 = i6 + 103;
                                    b = i7 % 128;
                                    if (i7 % 2 != 0) {
                                        Object obj = null;
                                        obj.hashCode();
                                        throw null;
                                    }
                                    if (t3 != null) {
                                        int i78 = ((i6 & (-26)) | ((~i6) & 25)) + ((i6 & 25) << 1);
                                        b = i78 % 128;
                                        int i79 = i78 % 2;
                                        i13 = 0;
                                        while (i13 < strArrS.length) {
                                            int i80 = a;
                                            i14 = (i80 & 51) + (i80 | 51);
                                            b = i14 % 128;
                                            if (i14 % 2 != 0) {
                                                Object obj2 = null;
                                                Map<String, Object> map2 = t2.c;
                                                String str4 = strArrS[i13];
                                                obj2.hashCode();
                                                throw null;
                                            }
                                            map = t2.c;
                                            str3 = strArrS[i13];
                                            int i81 = b;
                                            int i82 = (i81 & (-20)) | ((~i81) & 19);
                                            int i83 = -(-((i81 & 19) << 1));
                                            i15 = (i82 & i83) + (i83 | i82);
                                            a = i15 % 128;
                                            if (i15 % 2 == 0) {
                                                Map<String, Object> map3 = t3.c;
                                                String str5 = strArrS[i13];
                                                Object obj3 = null;
                                                obj3.hashCode();
                                                throw null;
                                            }
                                            map.put(str3, t3.c.get(strArrS[i13]));
                                            int i84 = a;
                                            int i85 = i84 & 93;
                                            int i86 = -(-(i84 | 93));
                                            int i87 = (i85 & i86) + (i85 | i86);
                                            b = i87 % 128;
                                            int i88 = i87 % 2;
                                            int i89 = i13 & 1;
                                            int i90 = i13 | 1;
                                            i13 = ((i89 | i90) << 1) - (i90 ^ i89);
                                            int i91 = i84 + 7;
                                            b = i91 % 128;
                                            int i92 = i91 % 2;
                                        }
                                    }
                                    i8 = oooO0oD.i;
                                    int i93 = a;
                                    int i94 = i93 & 77;
                                    i9 = ((i93 | 77) & (~i94)) + (i94 << 1);
                                    b = i9 % 128;
                                    if (i9 % 2 == 0) {
                                        int i95 = 5 % 5;
                                    }
                                    i10 = 0;
                                    while (true) {
                                        if (i10 < i8) {
                                            view3 = view2;
                                            int i96 = a;
                                            int i97 = i96 & 19;
                                            int i98 = (i97 - (~((i96 ^ 19) | i97))) - 1;
                                            b = i98 % 128;
                                            int i99 = i98 % 2;
                                            animator2 = animatorO;
                                            break;
                                        }
                                        int i100 = b;
                                        int i101 = i100 & 21;
                                        int i102 = (i100 ^ 21) | i101;
                                        int i103 = (i101 ^ i102) + ((i102 & i101) << 1);
                                        a = i103 % 128;
                                        int i104 = i103 % 2;
                                        animator3 = (Animator) oooO0oD.k(i10);
                                        int i105 = b;
                                        int i106 = i105 & 11;
                                        int i107 = -(-((i105 ^ 11) | i106));
                                        i11 = (i106 & i107) + (i107 | i106);
                                        a = i11 % 128;
                                        if (i11 % 2 == 0) {
                                            T t6 = ((bHD) oooO0oD.get(animator3)).c;
                                            throw null;
                                        }
                                        bhd2 = (bHD) oooO0oD.get(animator3);
                                        if (bhd2.c != null) {
                                            int i108 = b;
                                            int i109 = i108 & 49;
                                            int i110 = (i108 | 49) & (~i109);
                                            int i111 = i109 << 1;
                                            i12 = ((i110 | i111) << 1) - (i110 ^ i111);
                                            a = i12 % 128;
                                            if (i12 % 2 == 0) {
                                                View view4 = bhd2.a;
                                                Object obj4 = null;
                                                obj4.hashCode();
                                                throw null;
                                            }
                                            if (bhd2.a == view2) {
                                                str = bhd2.b;
                                                str2 = this.g;
                                                int i112 = b;
                                                view3 = view2;
                                                int i113 = (-2) - (((i112 ^ 110) + ((i112 & 110) << 1)) ^ (-1));
                                                a = i113 % 128;
                                                int i114 = i113 % 2;
                                                if (!(!str.equals(str2))) {
                                                    int i115 = b;
                                                    int i116 = i115 & 35;
                                                    int i117 = -(-((i115 ^ 35) | i116));
                                                    int i118 = ((i116 | i117) << 1) - (i117 ^ i116);
                                                    a = i118 % 128;
                                                    int i119 = i118 % 2;
                                                    if (!bhd2.c.equals(t2)) {
                                                        animator2 = null;
                                                        break;
                                                    }
                                                } else {
                                                    continue;
                                                }
                                            } else {
                                                view3 = view2;
                                            }
                                        } else {
                                            view3 = view2;
                                        }
                                        int i120 = i10 & (-108);
                                        int i121 = i10 | (-108);
                                        int i122 = (i120 & i121) + (i120 | i121);
                                        int i123 = (i122 | 109) << 1;
                                        int i124 = -(i122 ^ 109);
                                        int i125 = ((i123 | i124) << 1) - (i123 ^ i124);
                                        int i126 = b;
                                        int i127 = ((i126 | 93) << 1) - (i126 ^ 93);
                                        a = i127 % 128;
                                        int i128 = i127 % 2;
                                        i10 = i125;
                                        view2 = view3;
                                    }
                                } else {
                                    view3 = view2;
                                    int i129 = b;
                                    i5 = ((i129 ^ 106) + ((i129 & 106) << 1)) - 1;
                                    a = i5 % 128;
                                    if (i5 % 2 != 0) {
                                        int i130 = 3 / 2;
                                    }
                                    animator2 = animatorO;
                                    t2 = null;
                                }
                            } else {
                                view3 = view2;
                                int i1210 = b;
                                i5 = ((i1210 ^ 106) + ((i1210 & 106) << 1)) - 1;
                                a = i5 % 128;
                                if (i5 % 2 != 0) {
                                    int i131 = 3 / 2;
                                }
                                animator2 = animatorO;
                                t2 = null;
                            }
                            int i132 = a;
                            int i133 = ((i132 | 83) << 1) - (i132 ^ 83);
                            int i134 = i133 % 128;
                            b = i134;
                            int i135 = i133 % 2;
                            int i136 = (i134 | 69) << 1;
                            int i137 = -((69 & (~i134)) | (i134 & (-70)));
                            int i138 = (i136 & i137) + (i137 | i136);
                            a = i138 % 128;
                            int i139 = i138 % 2;
                            animator = animator2;
                            t = t2;
                            view = view3;
                        } else {
                            View view5 = t4.d;
                            int i140 = b;
                            int i141 = i140 & 51;
                            int i142 = ((~i141) & (i140 | 51)) + (i141 << 1);
                            a = i142 % 128;
                            int i143 = i142 % 2;
                            int i144 = ((i140 | 81) << 1) - (i140 ^ 81);
                            a = i144 % 128;
                            int i145 = i144 % 2;
                            view = view5;
                            animator = animatorO;
                            t = null;
                        }
                        if (animator != null) {
                            String str6 = this.g;
                            ivas.gov.bisp.enumeration.p006af.h hVar = L.c;
                            bhd = new bHD(view, str6, this, new y(viewGroup), t);
                            int i146 = b;
                            int i147 = ((i146 ^ 7) | (i146 & 7)) << 1;
                            int i148 = -(((~i146) & 7) | (i146 & (-8)));
                            i2 = ((i147 | i148) << 1) - (i148 ^ i147);
                            a = i2 % 128;
                            if (i2 % 2 == 0) {
                                Object obj5 = null;
                                oooO0oD.put(animator, bhd);
                                obj5.hashCode();
                                throw null;
                            }
                            oooO0oD.put(animator, bhd);
                            int i149 = a;
                            i3 = (i149 ^ 7) + ((i149 & 7) << 1);
                            b = i3 % 128;
                            if (i3 % 2 != 0) {
                                this.w.add(animator);
                                Object obj6 = null;
                                obj6.hashCode();
                                throw null;
                            }
                            this.w.add(animator);
                            int i150 = b + 16;
                            int i151 = (i150 ^ (-1)) + (i150 << 1);
                            a = i151 % 128;
                            int i152 = i151 % 2;
                        } else {
                            continue;
                        }
                    } else {
                        int i510 = b;
                        int i511 = (i510 & 77) + (i510 | 77);
                        a = i511 % 128;
                        int i512 = i511 % 2;
                    }
                } else {
                    int i153 = a + 41;
                    b = i153 % 128;
                    if (i153 % i16 == 0) {
                        t(t4, t5);
                        throw null;
                    }
                    if (t(t4, t5)) {
                        int i513 = a;
                        int i514 = i513 & 121;
                        int i515 = (i513 | 121) & (~i514);
                        int i516 = i514 << i21;
                        int i517 = (i515 & i516) + (i515 | i516);
                        int i518 = i517 % 128;
                        b = i518;
                        int i610 = i517 % i16;
                        int i611 = i518 & 29;
                        int i612 = i611 + ((i518 ^ 29) | i611);
                        a = i612 % 128;
                        int i613 = i612 % i16;
                        animatorO = o(viewGroup, t4, t5);
                        if (animatorO != null) {
                            int i614 = b;
                            int i615 = i614 & 69;
                            int i616 = (i614 | 69) & (~i615);
                            int i617 = i615 << i21;
                            i = ((i616 | i617) << i21) - (i616 ^ i617);
                            a = i % 128;
                            if (i % i16 == 0) {
                                throw null;
                            }
                            if (t5 != null) {
                                view2 = t5.d;
                                strArrS = s();
                                int i618 = b + 63;
                                i4 = i618 % 128;
                                a = i4;
                                int i619 = i618 % i16;
                                if (strArrS != null) {
                                    int i710 = (i4 & (-88)) | ((~i4) & 87);
                                    int i711 = -(-((i4 & 87) << i21));
                                    int i712 = (i710 ^ i711) + ((i710 & i711) << i21);
                                    b = i712 % 128;
                                    int i713 = i712 % i16;
                                    if (strArrS.length > 0) {
                                        t2 = new T(view2);
                                        int i714 = b;
                                        int i715 = i714 & 75;
                                        int i716 = i715 + ((i714 ^ 75) | i715);
                                        a = i716 % 128;
                                        int i717 = i716 % i16;
                                        t3 = (T) ((r) eVar2.c).get(view2);
                                        i6 = a;
                                        i7 = i6 + 103;
                                        b = i7 % 128;
                                        if (i7 % 2 != 0) {
                                            Object obj7 = null;
                                            obj7.hashCode();
                                            throw null;
                                        }
                                        if (t3 != null) {
                                            int i718 = ((i6 & (-26)) | ((~i6) & 25)) + ((i6 & 25) << 1);
                                            b = i718 % 128;
                                            int i719 = i718 % 2;
                                            i13 = 0;
                                            while (i13 < strArrS.length) {
                                                int i810 = a;
                                                i14 = (i810 & 51) + (i810 | 51);
                                                b = i14 % 128;
                                                if (i14 % 2 != 0) {
                                                    Object obj8 = null;
                                                    Map<String, Object> map4 = t2.c;
                                                    String str7 = strArrS[i13];
                                                    obj8.hashCode();
                                                    throw null;
                                                }
                                                map = t2.c;
                                                str3 = strArrS[i13];
                                                int i811 = b;
                                                int i812 = (i811 & (-20)) | ((~i811) & 19);
                                                int i813 = -(-((i811 & 19) << 1));
                                                i15 = (i812 & i813) + (i813 | i812);
                                                a = i15 % 128;
                                                if (i15 % 2 == 0) {
                                                    Map<String, Object> map5 = t3.c;
                                                    String str8 = strArrS[i13];
                                                    Object obj9 = null;
                                                    obj9.hashCode();
                                                    throw null;
                                                }
                                                map.put(str3, t3.c.get(strArrS[i13]));
                                                int i814 = a;
                                                int i815 = i814 & 93;
                                                int i816 = -(-(i814 | 93));
                                                int i817 = (i815 & i816) + (i815 | i816);
                                                b = i817 % 128;
                                                int i818 = i817 % 2;
                                                int i819 = i13 & 1;
                                                int i910 = i13 | 1;
                                                i13 = ((i819 | i910) << 1) - (i910 ^ i819);
                                                int i911 = i814 + 7;
                                                b = i911 % 128;
                                                int i912 = i911 % 2;
                                            }
                                        }
                                        i8 = oooO0oD.i;
                                        int i913 = a;
                                        int i914 = i913 & 77;
                                        i9 = ((i913 | 77) & (~i914)) + (i914 << 1);
                                        b = i9 % 128;
                                        if (i9 % 2 == 0) {
                                            int i915 = 5 % 5;
                                        }
                                        i10 = 0;
                                        while (true) {
                                            if (i10 < i8) {
                                                view3 = view2;
                                                int i916 = a;
                                                int i917 = i916 & 19;
                                                int i918 = (i917 - (~((i916 ^ 19) | i917))) - 1;
                                                b = i918 % 128;
                                                int i919 = i918 % 2;
                                                animator2 = animatorO;
                                                break;
                                            }
                                            int i1010 = b;
                                            int i1011 = i1010 & 21;
                                            int i1012 = (i1010 ^ 21) | i1011;
                                            int i1013 = (i1011 ^ i1012) + ((i1012 & i1011) << 1);
                                            a = i1013 % 128;
                                            int i1014 = i1013 % 2;
                                            animator3 = (Animator) oooO0oD.k(i10);
                                            int i1015 = b;
                                            int i1016 = i1015 & 11;
                                            int i1017 = -(-((i1015 ^ 11) | i1016));
                                            i11 = (i1016 & i1017) + (i1017 | i1016);
                                            a = i11 % 128;
                                            if (i11 % 2 == 0) {
                                                T t7 = ((bHD) oooO0oD.get(animator3)).c;
                                                throw null;
                                            }
                                            bhd2 = (bHD) oooO0oD.get(animator3);
                                            if (bhd2.c != null) {
                                                int i1018 = b;
                                                int i1019 = i1018 & 49;
                                                int i1110 = (i1018 | 49) & (~i1019);
                                                int i1111 = i1019 << 1;
                                                i12 = ((i1110 | i1111) << 1) - (i1110 ^ i1111);
                                                a = i12 % 128;
                                                if (i12 % 2 == 0) {
                                                    View view6 = bhd2.a;
                                                    Object obj10 = null;
                                                    obj10.hashCode();
                                                    throw null;
                                                }
                                                if (bhd2.a == view2) {
                                                    str = bhd2.b;
                                                    str2 = this.g;
                                                    int i1112 = b;
                                                    view3 = view2;
                                                    int i1113 = (-2) - (((i1112 ^ 110) + ((i1112 & 110) << 1)) ^ (-1));
                                                    a = i1113 % 128;
                                                    int i1114 = i1113 % 2;
                                                    if (!(!str.equals(str2))) {
                                                        int i1115 = b;
                                                        int i1116 = i1115 & 35;
                                                        int i1117 = -(-((i1115 ^ 35) | i1116));
                                                        int i1118 = ((i1116 | i1117) << 1) - (i1117 ^ i1116);
                                                        a = i1118 % 128;
                                                        int i1119 = i1118 % 2;
                                                        if (!bhd2.c.equals(t2)) {
                                                            animator2 = null;
                                                            break;
                                                        }
                                                    } else {
                                                        continue;
                                                    }
                                                } else {
                                                    view3 = view2;
                                                }
                                            } else {
                                                view3 = view2;
                                            }
                                            int i1211 = i10 & (-108);
                                            int i1212 = i10 | (-108);
                                            int i1213 = (i1211 & i1212) + (i1211 | i1212);
                                            int i1214 = (i1213 | 109) << 1;
                                            int i1215 = -(i1213 ^ 109);
                                            int i1216 = ((i1214 | i1215) << 1) - (i1214 ^ i1215);
                                            int i1217 = b;
                                            int i1218 = ((i1217 | 93) << 1) - (i1217 ^ 93);
                                            a = i1218 % 128;
                                            int i1219 = i1218 % 2;
                                            i10 = i1216;
                                            view2 = view3;
                                        }
                                    } else {
                                        view3 = view2;
                                        int i12110 = b;
                                        i5 = ((i12110 ^ 106) + ((i12110 & 106) << 1)) - 1;
                                        a = i5 % 128;
                                        if (i5 % 2 != 0) {
                                            int i1310 = 3 / 2;
                                        }
                                        animator2 = animatorO;
                                        t2 = null;
                                    }
                                } else {
                                    view3 = view2;
                                    int i12111 = b;
                                    i5 = ((i12111 ^ 106) + ((i12111 & 106) << 1)) - 1;
                                    a = i5 % 128;
                                    if (i5 % 2 != 0) {
                                        int i1311 = 3 / 2;
                                    }
                                    animator2 = animatorO;
                                    t2 = null;
                                }
                                int i1312 = a;
                                int i1313 = ((i1312 | 83) << 1) - (i1312 ^ 83);
                                int i1314 = i1313 % 128;
                                b = i1314;
                                int i1315 = i1313 % 2;
                                int i1316 = (i1314 | 69) << 1;
                                int i1317 = -((69 & (~i1314)) | (i1314 & (-70)));
                                int i1318 = (i1316 & i1317) + (i1317 | i1316);
                                a = i1318 % 128;
                                int i1319 = i1318 % 2;
                                animator = animator2;
                                t = t2;
                                view = view3;
                            } else {
                                View view7 = t4.d;
                                int i1410 = b;
                                int i1411 = i1410 & 51;
                                int i1412 = ((~i1411) & (i1410 | 51)) + (i1411 << 1);
                                a = i1412 % 128;
                                int i1413 = i1412 % 2;
                                int i1414 = ((i1410 | 81) << 1) - (i1410 ^ 81);
                                a = i1414 % 128;
                                int i1415 = i1414 % 2;
                                view = view7;
                                animator = animatorO;
                                t = null;
                            }
                            if (animator != null) {
                                String str9 = this.g;
                                ivas.gov.bisp.enumeration.p006af.h hVar2 = L.c;
                                bhd = new bHD(view, str9, this, new y(viewGroup), t);
                                int i1416 = b;
                                int i1417 = ((i1416 ^ 7) | (i1416 & 7)) << 1;
                                int i1418 = -(((~i1416) & 7) | (i1416 & (-8)));
                                i2 = ((i1417 | i1418) << 1) - (i1418 ^ i1417);
                                a = i2 % 128;
                                if (i2 % 2 == 0) {
                                    Object obj11 = null;
                                    oooO0oD.put(animator, bhd);
                                    obj11.hashCode();
                                    throw null;
                                }
                                oooO0oD.put(animator, bhd);
                                int i1419 = a;
                                i3 = (i1419 ^ 7) + ((i1419 & 7) << 1);
                                b = i3 % 128;
                                if (i3 % 2 != 0) {
                                    this.w.add(animator);
                                    Object obj12 = null;
                                    obj12.hashCode();
                                    throw null;
                                }
                                this.w.add(animator);
                                int i154 = b + 16;
                                int i155 = (i154 ^ (-1)) + (i154 << 1);
                                a = i155 % 128;
                                int i156 = i155 % 2;
                            } else {
                                continue;
                            }
                        }
                    } else {
                        int i157 = a;
                        int i158 = (i157 & (-56)) | ((~i157) & 55);
                        int i159 = (i157 & 55) << i21;
                        int i160 = (i158 ^ i159) + ((i158 & i159) << i21);
                        b = i160 % 128;
                        int i161 = i160 % i16;
                        int i162 = (i157 & (-28)) | ((~i157) & 27);
                        int i163 = -(-((i157 & 27) << i21));
                        int i164 = ((i162 | i163) << i21) - (i163 ^ i162);
                        b = i164 % 128;
                        int i165 = i164 % i16;
                    }
                    int i519 = b;
                    int i5110 = (i519 & 77) + (i519 | 77);
                    a = i5110 % 128;
                    int i5111 = i5110 % 2;
                }
            } else if (t4 != null) {
                int i5112 = a;
                int i5113 = i5112 & 121;
                int i5114 = (i5112 | 121) & (~i5113);
                int i5115 = i5113 << i21;
                int i5116 = (i5114 & i5115) + (i5114 | i5115);
                int i5117 = i5116 % 128;
                b = i5117;
                int i6110 = i5116 % i16;
                int i6111 = i5117 & 29;
                int i6112 = i6111 + ((i5117 ^ 29) | i6111);
                a = i6112 % 128;
                int i6113 = i6112 % i16;
                animatorO = o(viewGroup, t4, t5);
                if (animatorO != null) {
                    int i6114 = b;
                    int i6115 = i6114 & 69;
                    int i6116 = (i6114 | 69) & (~i6115);
                    int i6117 = i6115 << i21;
                    i = ((i6116 | i6117) << i21) - (i6116 ^ i6117);
                    a = i % 128;
                    if (i % i16 == 0) {
                        throw null;
                    }
                    if (t5 != null) {
                        view2 = t5.d;
                        strArrS = s();
                        int i6118 = b + 63;
                        i4 = i6118 % 128;
                        a = i4;
                        int i6119 = i6118 % i16;
                        if (strArrS != null) {
                            int i7110 = (i4 & (-88)) | ((~i4) & 87);
                            int i7111 = -(-((i4 & 87) << i21));
                            int i7112 = (i7110 ^ i7111) + ((i7110 & i7111) << i21);
                            b = i7112 % 128;
                            int i7113 = i7112 % i16;
                            if (strArrS.length > 0) {
                                t2 = new T(view2);
                                int i7114 = b;
                                int i7115 = i7114 & 75;
                                int i7116 = i7115 + ((i7114 ^ 75) | i7115);
                                a = i7116 % 128;
                                int i7117 = i7116 % i16;
                                t3 = (T) ((r) eVar2.c).get(view2);
                                i6 = a;
                                i7 = i6 + 103;
                                b = i7 % 128;
                                if (i7 % 2 != 0) {
                                    Object obj13 = null;
                                    obj13.hashCode();
                                    throw null;
                                }
                                if (t3 != null) {
                                    int i7118 = ((i6 & (-26)) | ((~i6) & 25)) + ((i6 & 25) << 1);
                                    b = i7118 % 128;
                                    int i7119 = i7118 % 2;
                                    i13 = 0;
                                    while (i13 < strArrS.length) {
                                        int i8110 = a;
                                        i14 = (i8110 & 51) + (i8110 | 51);
                                        b = i14 % 128;
                                        if (i14 % 2 != 0) {
                                            Object obj14 = null;
                                            Map<String, Object> map6 = t2.c;
                                            String str10 = strArrS[i13];
                                            obj14.hashCode();
                                            throw null;
                                        }
                                        map = t2.c;
                                        str3 = strArrS[i13];
                                        int i8111 = b;
                                        int i8112 = (i8111 & (-20)) | ((~i8111) & 19);
                                        int i8113 = -(-((i8111 & 19) << 1));
                                        i15 = (i8112 & i8113) + (i8113 | i8112);
                                        a = i15 % 128;
                                        if (i15 % 2 == 0) {
                                            Map<String, Object> map7 = t3.c;
                                            String str11 = strArrS[i13];
                                            Object obj15 = null;
                                            obj15.hashCode();
                                            throw null;
                                        }
                                        map.put(str3, t3.c.get(strArrS[i13]));
                                        int i8114 = a;
                                        int i8115 = i8114 & 93;
                                        int i8116 = -(-(i8114 | 93));
                                        int i8117 = (i8115 & i8116) + (i8115 | i8116);
                                        b = i8117 % 128;
                                        int i8118 = i8117 % 2;
                                        int i8119 = i13 & 1;
                                        int i9110 = i13 | 1;
                                        i13 = ((i8119 | i9110) << 1) - (i9110 ^ i8119);
                                        int i9111 = i8114 + 7;
                                        b = i9111 % 128;
                                        int i9112 = i9111 % 2;
                                    }
                                }
                                i8 = oooO0oD.i;
                                int i9113 = a;
                                int i9114 = i9113 & 77;
                                i9 = ((i9113 | 77) & (~i9114)) + (i9114 << 1);
                                b = i9 % 128;
                                if (i9 % 2 == 0) {
                                    int i9115 = 5 % 5;
                                }
                                i10 = 0;
                                while (true) {
                                    if (i10 < i8) {
                                        view3 = view2;
                                        int i9116 = a;
                                        int i9117 = i9116 & 19;
                                        int i9118 = (i9117 - (~((i9116 ^ 19) | i9117))) - 1;
                                        b = i9118 % 128;
                                        int i9119 = i9118 % 2;
                                        animator2 = animatorO;
                                        break;
                                    }
                                    int i10110 = b;
                                    int i10111 = i10110 & 21;
                                    int i10112 = (i10110 ^ 21) | i10111;
                                    int i10113 = (i10111 ^ i10112) + ((i10112 & i10111) << 1);
                                    a = i10113 % 128;
                                    int i10114 = i10113 % 2;
                                    animator3 = (Animator) oooO0oD.k(i10);
                                    int i10115 = b;
                                    int i10116 = i10115 & 11;
                                    int i10117 = -(-((i10115 ^ 11) | i10116));
                                    i11 = (i10116 & i10117) + (i10117 | i10116);
                                    a = i11 % 128;
                                    if (i11 % 2 == 0) {
                                        T t8 = ((bHD) oooO0oD.get(animator3)).c;
                                        throw null;
                                    }
                                    bhd2 = (bHD) oooO0oD.get(animator3);
                                    if (bhd2.c != null) {
                                        int i10118 = b;
                                        int i10119 = i10118 & 49;
                                        int i11110 = (i10118 | 49) & (~i10119);
                                        int i11111 = i10119 << 1;
                                        i12 = ((i11110 | i11111) << 1) - (i11110 ^ i11111);
                                        a = i12 % 128;
                                        if (i12 % 2 == 0) {
                                            View view8 = bhd2.a;
                                            Object obj16 = null;
                                            obj16.hashCode();
                                            throw null;
                                        }
                                        if (bhd2.a == view2) {
                                            str = bhd2.b;
                                            str2 = this.g;
                                            int i11112 = b;
                                            view3 = view2;
                                            int i11113 = (-2) - (((i11112 ^ 110) + ((i11112 & 110) << 1)) ^ (-1));
                                            a = i11113 % 128;
                                            int i11114 = i11113 % 2;
                                            if (!(!str.equals(str2))) {
                                                int i11115 = b;
                                                int i11116 = i11115 & 35;
                                                int i11117 = -(-((i11115 ^ 35) | i11116));
                                                int i11118 = ((i11116 | i11117) << 1) - (i11117 ^ i11116);
                                                a = i11118 % 128;
                                                int i11119 = i11118 % 2;
                                                if (!bhd2.c.equals(t2)) {
                                                    animator2 = null;
                                                    break;
                                                }
                                            } else {
                                                continue;
                                            }
                                        } else {
                                            view3 = view2;
                                        }
                                    } else {
                                        view3 = view2;
                                    }
                                    int i12112 = i10 & (-108);
                                    int i12113 = i10 | (-108);
                                    int i12114 = (i12112 & i12113) + (i12112 | i12113);
                                    int i12115 = (i12114 | 109) << 1;
                                    int i12116 = -(i12114 ^ 109);
                                    int i12117 = ((i12115 | i12116) << 1) - (i12115 ^ i12116);
                                    int i12118 = b;
                                    int i12119 = ((i12118 | 93) << 1) - (i12118 ^ 93);
                                    a = i12119 % 128;
                                    int i12120 = i12119 % 2;
                                    i10 = i12117;
                                    view2 = view3;
                                }
                            } else {
                                view3 = view2;
                                int i121110 = b;
                                i5 = ((i121110 ^ 106) + ((i121110 & 106) << 1)) - 1;
                                a = i5 % 128;
                                if (i5 % 2 != 0) {
                                    int i13110 = 3 / 2;
                                }
                                animator2 = animatorO;
                                t2 = null;
                            }
                        } else {
                            view3 = view2;
                            int i121111 = b;
                            i5 = ((i121111 ^ 106) + ((i121111 & 106) << 1)) - 1;
                            a = i5 % 128;
                            if (i5 % 2 != 0) {
                                int i13111 = 3 / 2;
                            }
                            animator2 = animatorO;
                            t2 = null;
                        }
                        int i13112 = a;
                        int i13113 = ((i13112 | 83) << 1) - (i13112 ^ 83);
                        int i13114 = i13113 % 128;
                        b = i13114;
                        int i13115 = i13113 % 2;
                        int i13116 = (i13114 | 69) << 1;
                        int i13117 = -((69 & (~i13114)) | (i13114 & (-70)));
                        int i13118 = (i13116 & i13117) + (i13117 | i13116);
                        a = i13118 % 128;
                        int i13119 = i13118 % 2;
                        animator = animator2;
                        t = t2;
                        view = view3;
                    } else {
                        View view9 = t4.d;
                        int i14110 = b;
                        int i14111 = i14110 & 51;
                        int i14112 = ((~i14111) & (i14110 | 51)) + (i14111 << 1);
                        a = i14112 % 128;
                        int i14113 = i14112 % 2;
                        int i14114 = ((i14110 | 81) << 1) - (i14110 ^ 81);
                        a = i14114 % 128;
                        int i14115 = i14114 % 2;
                        view = view9;
                        animator = animatorO;
                        t = null;
                    }
                    if (animator != null) {
                        String str12 = this.g;
                        ivas.gov.bisp.enumeration.p006af.h hVar3 = L.c;
                        bhd = new bHD(view, str12, this, new y(viewGroup), t);
                        int i14116 = b;
                        int i14117 = ((i14116 ^ 7) | (i14116 & 7)) << 1;
                        int i14118 = -(((~i14116) & 7) | (i14116 & (-8)));
                        i2 = ((i14117 | i14118) << 1) - (i14118 ^ i14117);
                        a = i2 % 128;
                        if (i2 % 2 == 0) {
                            Object obj17 = null;
                            oooO0oD.put(animator, bhd);
                            obj17.hashCode();
                            throw null;
                        }
                        oooO0oD.put(animator, bhd);
                        int i14119 = a;
                        i3 = (i14119 ^ 7) + ((i14119 & 7) << 1);
                        b = i3 % 128;
                        if (i3 % 2 != 0) {
                            this.w.add(animator);
                            Object obj18 = null;
                            obj18.hashCode();
                            throw null;
                        }
                        this.w.add(animator);
                        int i1510 = b + 16;
                        int i1511 = (i1510 ^ (-1)) + (i1510 << 1);
                        a = i1511 % 128;
                        int i1512 = i1511 % 2;
                    } else {
                        continue;
                    }
                } else {
                    int i5118 = b;
                    int i5119 = (i5118 & 77) + (i5118 | 77);
                    a = i5119 % 128;
                    int i51110 = i5119 % 2;
                }
            } else {
                int i51111 = a;
                int i51112 = i51111 & 121;
                int i51113 = (i51111 | 121) & (~i51112);
                int i51114 = i51112 << i21;
                int i51115 = (i51113 & i51114) + (i51113 | i51114);
                int i51116 = i51115 % 128;
                b = i51116;
                int i61110 = i51115 % i16;
                int i61111 = i51116 & 29;
                int i61112 = i61111 + ((i51116 ^ 29) | i61111);
                a = i61112 % 128;
                int i61113 = i61112 % i16;
                animatorO = o(viewGroup, t4, t5);
                if (animatorO != null) {
                    int i61114 = b;
                    int i61115 = i61114 & 69;
                    int i61116 = (i61114 | 69) & (~i61115);
                    int i61117 = i61115 << i21;
                    i = ((i61116 | i61117) << i21) - (i61116 ^ i61117);
                    a = i % 128;
                    if (i % i16 == 0) {
                        throw null;
                    }
                    if (t5 != null) {
                        view2 = t5.d;
                        strArrS = s();
                        int i61118 = b + 63;
                        i4 = i61118 % 128;
                        a = i4;
                        int i61119 = i61118 % i16;
                        if (strArrS != null) {
                            int i71110 = (i4 & (-88)) | ((~i4) & 87);
                            int i71111 = -(-((i4 & 87) << i21));
                            int i71112 = (i71110 ^ i71111) + ((i71110 & i71111) << i21);
                            b = i71112 % 128;
                            int i71113 = i71112 % i16;
                            if (strArrS.length > 0) {
                                t2 = new T(view2);
                                int i71114 = b;
                                int i71115 = i71114 & 75;
                                int i71116 = i71115 + ((i71114 ^ 75) | i71115);
                                a = i71116 % 128;
                                int i71117 = i71116 % i16;
                                t3 = (T) ((r) eVar2.c).get(view2);
                                i6 = a;
                                i7 = i6 + 103;
                                b = i7 % 128;
                                if (i7 % 2 != 0) {
                                    Object obj19 = null;
                                    obj19.hashCode();
                                    throw null;
                                }
                                if (t3 != null) {
                                    int i71118 = ((i6 & (-26)) | ((~i6) & 25)) + ((i6 & 25) << 1);
                                    b = i71118 % 128;
                                    int i71119 = i71118 % 2;
                                    i13 = 0;
                                    while (i13 < strArrS.length) {
                                        int i81110 = a;
                                        i14 = (i81110 & 51) + (i81110 | 51);
                                        b = i14 % 128;
                                        if (i14 % 2 != 0) {
                                            Object obj110 = null;
                                            Map<String, Object> map8 = t2.c;
                                            String str13 = strArrS[i13];
                                            obj110.hashCode();
                                            throw null;
                                        }
                                        map = t2.c;
                                        str3 = strArrS[i13];
                                        int i81111 = b;
                                        int i81112 = (i81111 & (-20)) | ((~i81111) & 19);
                                        int i81113 = -(-((i81111 & 19) << 1));
                                        i15 = (i81112 & i81113) + (i81113 | i81112);
                                        a = i15 % 128;
                                        if (i15 % 2 == 0) {
                                            Map<String, Object> map9 = t3.c;
                                            String str14 = strArrS[i13];
                                            Object obj111 = null;
                                            obj111.hashCode();
                                            throw null;
                                        }
                                        map.put(str3, t3.c.get(strArrS[i13]));
                                        int i81114 = a;
                                        int i81115 = i81114 & 93;
                                        int i81116 = -(-(i81114 | 93));
                                        int i81117 = (i81115 & i81116) + (i81115 | i81116);
                                        b = i81117 % 128;
                                        int i81118 = i81117 % 2;
                                        int i81119 = i13 & 1;
                                        int i91110 = i13 | 1;
                                        i13 = ((i81119 | i91110) << 1) - (i91110 ^ i81119);
                                        int i91111 = i81114 + 7;
                                        b = i91111 % 128;
                                        int i91112 = i91111 % 2;
                                    }
                                }
                                i8 = oooO0oD.i;
                                int i91113 = a;
                                int i91114 = i91113 & 77;
                                i9 = ((i91113 | 77) & (~i91114)) + (i91114 << 1);
                                b = i9 % 128;
                                if (i9 % 2 == 0) {
                                    int i91115 = 5 % 5;
                                }
                                i10 = 0;
                                while (true) {
                                    if (i10 < i8) {
                                        view3 = view2;
                                        int i91116 = a;
                                        int i91117 = i91116 & 19;
                                        int i91118 = (i91117 - (~((i91116 ^ 19) | i91117))) - 1;
                                        b = i91118 % 128;
                                        int i91119 = i91118 % 2;
                                        animator2 = animatorO;
                                        break;
                                    }
                                    int i101110 = b;
                                    int i101111 = i101110 & 21;
                                    int i101112 = (i101110 ^ 21) | i101111;
                                    int i101113 = (i101111 ^ i101112) + ((i101112 & i101111) << 1);
                                    a = i101113 % 128;
                                    int i101114 = i101113 % 2;
                                    animator3 = (Animator) oooO0oD.k(i10);
                                    int i101115 = b;
                                    int i101116 = i101115 & 11;
                                    int i101117 = -(-((i101115 ^ 11) | i101116));
                                    i11 = (i101116 & i101117) + (i101117 | i101116);
                                    a = i11 % 128;
                                    if (i11 % 2 == 0) {
                                        T t9 = ((bHD) oooO0oD.get(animator3)).c;
                                        throw null;
                                    }
                                    bhd2 = (bHD) oooO0oD.get(animator3);
                                    if (bhd2.c != null) {
                                        int i101118 = b;
                                        int i101119 = i101118 & 49;
                                        int i111110 = (i101118 | 49) & (~i101119);
                                        int i111111 = i101119 << 1;
                                        i12 = ((i111110 | i111111) << 1) - (i111110 ^ i111111);
                                        a = i12 % 128;
                                        if (i12 % 2 == 0) {
                                            View view10 = bhd2.a;
                                            Object obj112 = null;
                                            obj112.hashCode();
                                            throw null;
                                        }
                                        if (bhd2.a == view2) {
                                            str = bhd2.b;
                                            str2 = this.g;
                                            int i111112 = b;
                                            view3 = view2;
                                            int i111113 = (-2) - (((i111112 ^ 110) + ((i111112 & 110) << 1)) ^ (-1));
                                            a = i111113 % 128;
                                            int i111114 = i111113 % 2;
                                            if (!(!str.equals(str2))) {
                                                int i111115 = b;
                                                int i111116 = i111115 & 35;
                                                int i111117 = -(-((i111115 ^ 35) | i111116));
                                                int i111118 = ((i111116 | i111117) << 1) - (i111117 ^ i111116);
                                                a = i111118 % 128;
                                                int i111119 = i111118 % 2;
                                                if (!bhd2.c.equals(t2)) {
                                                    animator2 = null;
                                                    break;
                                                }
                                            } else {
                                                continue;
                                            }
                                        } else {
                                            view3 = view2;
                                        }
                                    } else {
                                        view3 = view2;
                                    }
                                    int i121112 = i10 & (-108);
                                    int i121113 = i10 | (-108);
                                    int i121114 = (i121112 & i121113) + (i121112 | i121113);
                                    int i121115 = (i121114 | 109) << 1;
                                    int i121116 = -(i121114 ^ 109);
                                    int i121117 = ((i121115 | i121116) << 1) - (i121115 ^ i121116);
                                    int i121118 = b;
                                    int i121119 = ((i121118 | 93) << 1) - (i121118 ^ 93);
                                    a = i121119 % 128;
                                    int i12121 = i121119 % 2;
                                    i10 = i121117;
                                    view2 = view3;
                                }
                            } else {
                                view3 = view2;
                                int i1211110 = b;
                                i5 = ((i1211110 ^ 106) + ((i1211110 & 106) << 1)) - 1;
                                a = i5 % 128;
                                if (i5 % 2 != 0) {
                                    int i131110 = 3 / 2;
                                }
                                animator2 = animatorO;
                                t2 = null;
                            }
                        } else {
                            view3 = view2;
                            int i1211111 = b;
                            i5 = ((i1211111 ^ 106) + ((i1211111 & 106) << 1)) - 1;
                            a = i5 % 128;
                            if (i5 % 2 != 0) {
                                int i131111 = 3 / 2;
                            }
                            animator2 = animatorO;
                            t2 = null;
                        }
                        int i131112 = a;
                        int i131113 = ((i131112 | 83) << 1) - (i131112 ^ 83);
                        int i131114 = i131113 % 128;
                        b = i131114;
                        int i131115 = i131113 % 2;
                        int i131116 = (i131114 | 69) << 1;
                        int i131117 = -((69 & (~i131114)) | (i131114 & (-70)));
                        int i131118 = (i131116 & i131117) + (i131117 | i131116);
                        a = i131118 % 128;
                        int i131119 = i131118 % 2;
                        animator = animator2;
                        t = t2;
                        view = view3;
                    } else {
                        View view11 = t4.d;
                        int i141110 = b;
                        int i141111 = i141110 & 51;
                        int i141112 = ((~i141111) & (i141110 | 51)) + (i141111 << 1);
                        a = i141112 % 128;
                        int i141113 = i141112 % 2;
                        int i141114 = ((i141110 | 81) << 1) - (i141110 ^ 81);
                        a = i141114 % 128;
                        int i141115 = i141114 % 2;
                        view = view11;
                        animator = animatorO;
                        t = null;
                    }
                    if (animator != null) {
                        String str15 = this.g;
                        ivas.gov.bisp.enumeration.p006af.h hVar4 = L.c;
                        bhd = new bHD(view, str15, this, new y(viewGroup), t);
                        int i141116 = b;
                        int i141117 = ((i141116 ^ 7) | (i141116 & 7)) << 1;
                        int i141118 = -(((~i141116) & 7) | (i141116 & (-8)));
                        i2 = ((i141117 | i141118) << 1) - (i141118 ^ i141117);
                        a = i2 % 128;
                        if (i2 % 2 == 0) {
                            Object obj113 = null;
                            oooO0oD.put(animator, bhd);
                            obj113.hashCode();
                            throw null;
                        }
                        oooO0oD.put(animator, bhd);
                        int i141119 = a;
                        i3 = (i141119 ^ 7) + ((i141119 & 7) << 1);
                        b = i3 % 128;
                        if (i3 % 2 != 0) {
                            this.w.add(animator);
                            Object obj114 = null;
                            obj114.hashCode();
                            throw null;
                        }
                        this.w.add(animator);
                        int i1513 = b + 16;
                        int i1514 = (i1513 ^ (-1)) + (i1513 << 1);
                        a = i1514 % 128;
                        int i1515 = i1514 % 2;
                    } else {
                        continue;
                    }
                } else {
                    int i51117 = b;
                    int i51118 = (i51117 & 77) + (i51117 | 77);
                    a = i51118 % 128;
                    int i51119 = i51118 % 2;
                }
            }
            int i166 = (i25 & 97) + (i25 | 97);
            i25 = (i166 ^ (-96)) + ((i166 & (-96)) << 1);
            int i167 = a;
            int i168 = ((i167 ^ 126) + ((i167 & 126) << 1)) - 1;
            b = i168 % 128;
            int i169 = i168 % 2;
            i16 = 2;
            i21 = 1;
            i24 = 0;
        }
        if (sparseIntArray.size() != 0) {
            int i170 = b;
            int i171 = i170 & 99;
            int i172 = (i171 - (~((i170 ^ 99) | i171))) - 1;
            a = i172 % 128;
            int i173 = i172 % 2;
            int i174 = i170 & 93;
            int i175 = (i174 - (~(-(-((i170 ^ 93) | i174))))) - 1;
            a = i175 % 128;
            int i176 = i175 % 2;
            int i177 = 0;
            while (i177 < sparseIntArray.size()) {
                int iKeyAt = sparseIntArray.keyAt(i177);
                ArrayList<Animator> arrayList3 = this.w;
                int i178 = b;
                int i179 = i178 & 43;
                int i180 = (i179 - (~((i178 ^ 43) | i179))) - 1;
                a = i180 % 128;
                if (i180 % 2 != 0) {
                    arrayList3.get(iKeyAt);
                    sparseIntArray.valueAt(i177);
                    throw null;
                }
                Animator animator4 = arrayList3.get(iKeyAt);
                long jValueAt = sparseIntArray.valueAt(i177);
                int i181 = b;
                int i182 = ((i181 | 65) << 1) - (i181 ^ 65);
                a = i182 % 128;
                if (i182 % 2 != 0) {
                    animator4.getStartDelay();
                    throw null;
                }
                long startDelay = animator4.getStartDelay();
                int i183 = a;
                int i184 = ((i183 ^ 18) + ((i183 & 18) << 1)) - 1;
                b = i184 % 128;
                if (i184 % 2 == 0) {
                    animator4.setStartDelay(startDelay + (jValueAt | Long.MAX_VALUE));
                    i177 = (((i177 ^ 124) | (i177 & 124)) << 1) - ((i177 & (-125)) | ((~i177) & 124));
                } else {
                    animator4.setStartDelay(startDelay + (jValueAt - Long.MAX_VALUE));
                    i177++;
                }
                int i185 = b;
                int i186 = (i185 ^ 13) + ((i185 & 13) << 1);
                a = i186 % 128;
                if (i186 % 2 != 0) {
                    int i187 = 2 / 3;
                }
            }
        }
        int i188 = b;
        int i189 = (i188 & 113) + (i188 | 113);
        a = i189 % 128;
        int i190 = i189 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:32:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:37:0x0109  */
    /* JADX WARN: Code duplicated, block: B:39:0x0112  */
    /* JADX WARN: Code duplicated, block: B:40:0x0115  */
    /* JADX WARN: Code duplicated, block: B:42:0x0119 A[LOOP:0: B:19:0x009f->B:42:0x0119, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x00fb A[SYNTHETIC] */
    public T q(View view, boolean z) {
        ArrayList<T> arrayList;
        ArrayList<T> arrayList2;
        T t;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        int i7 = a;
        int i8 = (i7 ^ 33) + ((i7 & 33) << 1);
        int i9 = i8 % 128;
        b = i9;
        int i10 = i8 % 2;
        O o2 = this.n;
        T t2 = null;
        if (o2 != null) {
            int i11 = i9 & 101;
            int i12 = i11 + ((i9 ^ 101) | i11);
            a = i12 % 128;
            if (i12 % 2 == 0) {
                return o2.q(view, z);
            }
            o2.q(view, z);
            throw null;
        }
        if (z) {
            int i13 = (((i7 ^ 43) | (i7 & 43)) << 1) - ((i7 & (-44)) | ((~i7) & 43));
            b = i13 % 128;
            int i14 = i13 % 2;
            arrayList = this.p;
            int i15 = i7 & 93;
            int i16 = (((i7 ^ 93) | i15) << 1) - ((i7 | 93) & (~i15));
            b = i16 % 128;
            int i17 = i16 % 2;
        } else {
            arrayList = this.r;
            int i18 = (i9 & 85) + (i9 | 85);
            a = i18 % 128;
            int i19 = i18 % 2;
        }
        if (arrayList == null) {
            int i20 = b;
            int i21 = (i20 & 23) + (i20 | 23);
            a = i21 % 128;
            int i22 = i21 % 2;
            int i23 = (i20 | 65) << 1;
            int i24 = -(i20 ^ 65);
            int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
            a = i25 % 128;
            if (i25 % 2 == 0) {
                return null;
            }
            throw null;
        }
        int size = arrayList.size();
        int i26 = b;
        int i27 = ((i26 ^ 95) | (i26 & 95)) << 1;
        int i28 = -(((~i26) & 95) | (i26 & (-96)));
        int i29 = (i27 & i28) + (i28 | i27);
        a = i29 % 128;
        int i30 = i29 % 2;
        int i31 = 0;
        while (true) {
            if (i31 < size) {
                int i32 = b;
                int i33 = i32 & 47;
                int i34 = -(-((i32 ^ 47) | i33));
                int i35 = ((i33 | i34) << 1) - (i34 ^ i33);
                a = i35 % 128;
                if (i35 % 2 != 0) {
                    t = arrayList.get(i31);
                    int i36 = 45 / 0;
                    if (t == null) {
                        int i37 = b;
                        int i38 = i37 & 7;
                        int i39 = -(-((i37 ^ 7) | i38));
                        i = ((i38 | i39) << 1) - (i39 ^ i38);
                        i2 = i % 128;
                        a = i2;
                        if (i % 2 == 0) {
                            throw null;
                        }
                        int i40 = i2 & 61;
                        int i41 = ((i2 ^ 61) | i40) << 1;
                        int i42 = -((i2 | 61) & (~i40));
                        int i43 = (i41 ^ i42) + ((i42 & i41) << 1);
                        b = i43 % 128;
                        int i44 = i43 % 2;
                        return null;
                    }
                    if (t.d == view) {
                        i3 = a;
                        i4 = (i3 & 11) + (i3 | 11);
                        b = i4 % 128;
                        if (i4 % 2 != 0) {
                            t2.hashCode();
                            throw null;
                        }
                        i5 = i3 + 75;
                        b = i5 % 128;
                        if (i5 % 2 == 0) {
                            int i45 = 5 / 3;
                        }
                    } else {
                        int i46 = (i31 ^ 6) + ((i31 & 6) << 1);
                        i31 = ((i46 | (-5)) << 1) - (i46 ^ (-5));
                        int i47 = b;
                        int i48 = i47 & 89;
                        int i49 = ((((i47 ^ 89) | i48) << 1) - (~(-((i47 | 89) & (~i48))))) - 1;
                        a = i49 % 128;
                        int i50 = i49 % 2;
                    }
                } else {
                    t = arrayList.get(i31);
                    if (t == null) {
                        int i310 = b;
                        int i311 = i310 & 7;
                        int i312 = -(-((i310 ^ 7) | i311));
                        i = ((i311 | i312) << 1) - (i312 ^ i311);
                        i2 = i % 128;
                        a = i2;
                        if (i % 2 == 0) {
                            throw null;
                        }
                        int i410 = i2 & 61;
                        int i411 = ((i2 ^ 61) | i410) << 1;
                        int i412 = -((i2 | 61) & (~i410));
                        int i413 = (i411 ^ i412) + ((i412 & i411) << 1);
                        b = i413 % 128;
                        int i414 = i413 % 2;
                        return null;
                    }
                    if (t.d == view) {
                        i3 = a;
                        i4 = (i3 & 11) + (i3 | 11);
                        b = i4 % 128;
                        if (i4 % 2 != 0) {
                            t2.hashCode();
                            throw null;
                        }
                        i5 = i3 + 75;
                        b = i5 % 128;
                        if (i5 % 2 == 0) {
                            int i415 = 5 / 3;
                        }
                    } else {
                        int i416 = (i31 ^ 6) + ((i31 & 6) << 1);
                        i31 = ((i416 | (-5)) << 1) - (i416 ^ (-5));
                        int i417 = b;
                        int i418 = i417 & 89;
                        int i419 = ((((i417 ^ 89) | i418) << 1) - (~(-((i417 | 89) & (~i418))))) - 1;
                        a = i419 % 128;
                        int i51 = i419 % 2;
                    }
                }
            } else {
                i31 = -1;
            }
            if (i31 >= 0) {
                int i52 = b;
                int i53 = (((i52 & (-104)) | ((~i52) & 103)) - (~(-(-((i52 & 103) << 1))))) - 1;
                int i54 = i53 % 128;
                a = i54;
                if (i53 % 2 != 0) {
                    throw null;
                }
                if (!z) {
                    arrayList2 = this.p;
                    int i55 = ((i54 | 17) << 1) - (i54 ^ 17);
                    b = i55 % 128;
                    int i56 = i55 % 2;
                } else {
                    int i57 = i54 ^ 71;
                    int i58 = (i54 & 71) << 1;
                    int i59 = (i57 ^ i58) + ((i58 & i57) << 1);
                    int i60 = i59 % 128;
                    b = i60;
                    int i61 = i59 % 2;
                    arrayList2 = this.r;
                    int i62 = (i60 & 23) + (i60 | 23);
                    a = i62 % 128;
                    int i63 = i62 % 2;
                }
                t2 = arrayList2.get(i31);
                int i64 = b;
                int i65 = (i64 ^ 105) + ((i64 & 105) << 1);
                a = i65 % 128;
                if (i65 % 2 != 0) {
                    int i66 = 5 % 4;
                }
            }
            int i67 = a;
            int i68 = i67 ^ 89;
            int i69 = (i67 & 89) << 1;
            int i70 = (i68 ^ i69) + ((i69 & i68) << 1);
            b = i70 % 128;
            if (i70 % 2 == 0) {
                int i71 = 73 / 0;
            }
            return t2;
        }
    }

    public String[] s() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 39) | (i2 & 39)) << 1;
        int i4 = -(((~i2) & 39) | (i2 & (-40)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        int i6 = i5 % 128;
        a = i6;
        if (i5 % 2 != 0) {
            int i7 = 4 / 0;
        }
        int i8 = i6 ^ 91;
        int i9 = ((i6 & 91) | i8) << 1;
        int i10 = -i8;
        int i11 = ((i9 | i10) << 1) - (i9 ^ i10);
        b = i11 % 128;
        Object obj = null;
        if (i11 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 97;
        int i4 = -(-((i2 ^ 97) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            I(BuildConfig.FLAVOR);
            throw null;
        }
        String strI = I(BuildConfig.FLAVOR);
        int i6 = a;
        int i7 = ((i6 | 125) << 1) - (i6 ^ 125);
        b = i7 % 128;
        if (i7 % 2 != 0) {
            return strI;
        }
        obj.hashCode();
        throw null;
    }

    public J z(View view) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 69;
        int i4 = (i2 | 69) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 & i5) + (i4 | i5);
        b = i6 % 128;
        Object obj = null;
        if (i6 % 2 == 0) {
            this.l.remove(view);
            obj.hashCode();
            throw null;
        }
        this.l.remove(view);
        int i7 = a;
        int i8 = i7 & 13;
        int i9 = (i7 ^ 13) | i8;
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        b = i10 % 128;
        if (i10 % 2 != 0) {
            return this;
        }
        obj.hashCode();
        throw null;
    }

    public J n() {
        int i = 2 % 2;
        try {
            J j = (J) super.clone();
            j.w = new ArrayList<>();
            j.m = new e(2);
            j.f = new e(2);
            int i2 = b + 59;
            int i3 = i2 % 128;
            a = i3;
            int i4 = i2 % 2;
            j.p = null;
            j.r = null;
            int i5 = (i3 ^ 101) + ((i3 & 101) << 1);
            b = i5 % 128;
            if (i5 % 2 != 0) {
                return j;
            }
            throw null;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public boolean v(View view) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 36) + ((i2 & 36) << 1)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        int id = view.getId();
        if (this.j.size() == 0) {
            int i5 = b + 68;
            int i6 = (i5 ^ (-1)) + (i5 << 1);
            a = i6 % 128;
            int i7 = i6 % 2;
            if (this.l.size() == 0) {
                int i8 = a;
                int i9 = i8 & 109;
                int i10 = (i8 | 109) & (~i9);
                int i11 = i9 << 1;
                int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
                int i13 = i12 % 128;
                b = i13;
                int i14 = i12 % 2;
                int i15 = (i13 ^ 84) + ((i13 & 84) << 1);
                int i16 = (i15 ^ (-1)) + (i15 << 1);
                a = i16 % 128;
                int i17 = i16 % 2;
                return true;
            }
        }
        Object obj = null;
        if (!this.j.contains(Integer.valueOf(id))) {
            int i18 = a;
            int i19 = i18 & 91;
            int i20 = i19 + ((i18 ^ 91) | i19);
            b = i20 % 128;
            if (i20 % 2 == 0) {
                this.l.contains(view);
                throw null;
            }
            if (!this.l.contains(view)) {
                int i21 = b;
                int i22 = (i21 ^ 45) + ((i21 & 45) << 1);
                a = i22 % 128;
                boolean z = i22 % 2 != 0;
                int i23 = i21 & 81;
                int i24 = (((i21 ^ 81) | i23) << 1) - ((i21 | 81) & (~i23));
                a = i24 % 128;
                if (i24 % 2 == 0) {
                    return z;
                }
                obj.hashCode();
                throw null;
            }
        }
        int i25 = b;
        int i26 = (i25 & 3) + (i25 | 3);
        a = i26 % 128;
        if (i26 % 2 == 0) {
            return true;
        }
        throw null;
    }

    static {
        int i = b;
        int i2 = i & 13;
        int i3 = (((i | 13) & (~i2)) - (~(-(-(i2 << 1))))) - 1;
        a = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static OooO0o<Animator, bHD> d() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 63) << 1) - (((~i2) & 63) | (i2 & (-64)));
        a = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            c.get();
            throw null;
        }
        OooO0o<Animator, bHD> rVar = (r) c.get();
        if (rVar == null) {
            rVar = new r<>();
            ThreadLocal<OooO0o<Animator, bHD>> threadLocal = c;
            int i4 = b;
            int i5 = i4 & 67;
            int i6 = (i4 ^ 67) | i5;
            int i7 = (i5 & i6) + (i6 | i5);
            a = i7 % 128;
            int i8 = i7 % 2;
            threadLocal.set(rVar);
            if (i8 != 0) {
                obj.hashCode();
                throw null;
            }
            int i9 = (-2) - ((a + 114) ^ (-1));
            b = i9 % 128;
            int i10 = i9 % 2;
        }
        int i11 = a;
        int i12 = (-2) - (((i11 ^ 88) + ((i11 & 88) << 1)) ^ (-1));
        b = i12 % 128;
        int i13 = i12 % 2;
        return rVar;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:12:0x005b  */
    /* JADX WARN: Code duplicated, block: B:13:0x0069  */
    /* JADX WARN: Code duplicated, block: B:24:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:9:0x0044 A[PHI: r7
  0x0044: PHI (r7v3 java.lang.Object) = (r7v2 java.lang.Object), (r7v27 java.lang.Object) binds: [B:8:0x0042, B:5:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    public static boolean e(T t, T t2, String str) {
        Object obj;
        int i;
        int i2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        int i5 = b;
        int i6 = (((i5 & (-120)) | ((~i5) & 119)) - (~(-(-((i5 & 119) << 1))))) - 1;
        a = i6 % 128;
        int i7 = i6 % 2;
        Object obj2 = t.c.get(str);
        int i8 = a;
        int i9 = ((i8 & 84) + (i8 | 84)) - 1;
        b = i9 % 128;
        if (i9 % 2 != 0) {
            obj = t2.c.get(str);
            if (obj2 == null) {
                int i10 = b;
                int i11 = i10 ^ 67;
                int i12 = -(-((i10 & 67) << 1));
                i = ((i11 | i12) << 1) - (i12 ^ i11);
                i2 = i % 128;
                a = i2;
                if (i % 2 == 0) {
                    throw null;
                }
                if (obj == null) {
                    int i13 = ((i2 & 97) - (~(i2 | 97))) - 1;
                    b = i13 % 128;
                    int i14 = i13 % 2;
                    z = 0;
                }
            }
            int i15 = b;
            i3 = ((i15 ^ 18) + ((i15 & 18) << 1)) - 1;
            a = i3 % 128;
            if (i3 % 2 != 0) {
                int i16 = 20 / 0;
            }
            return z;
        }
        obj = t2.c.get(str);
        int i17 = 28 / 0;
        if (obj2 == null) {
            int i18 = b;
            int i19 = i18 ^ 67;
            int i110 = -(-((i18 & 67) << 1));
            i = ((i19 | i110) << 1) - (i110 ^ i19);
            i2 = i % 128;
            a = i2;
            if (i % 2 == 0) {
                throw null;
            }
            if (obj == null) {
                int i111 = ((i2 & 97) - (~(i2 | 97))) - 1;
                b = i111 % 128;
                int i112 = i111 % 2;
                z = 0;
            }
        }
        int i113 = b;
        i3 = ((i113 ^ 18) + ((i113 & 18) << 1)) - 1;
        a = i3 % 128;
        if (i3 % 2 != 0) {
            int i114 = 20 / 0;
        }
        return z;
        if (obj2 != null) {
            int i20 = a;
            int i21 = (i20 ^ 59) + ((i20 & 59) << 1);
            b = i21 % 128;
            if (i21 % 2 == 0) {
                throw null;
            }
            if (obj == null) {
                int i22 = i20 + 102;
                int i23 = (i22 ^ (-1)) + (i22 << 1);
                b = i23 % 128;
                int i24 = i23 % 2;
                int i25 = i20 & 31;
                int i26 = -(-((i20 ^ 31) | i25));
                int i27 = (i25 ^ i26) + ((i25 & i26) << 1);
                b = i27 % 128;
                int i28 = i27 % 2;
                z = 1;
            } else {
                boolean zEquals = obj2.equals(obj);
                int i29 = ((zEquals ? 1 : 0) & (-2)) | ((~(zEquals ? 1 : 0)) & 1);
                int i30 = b;
                int i31 = ((i30 | 93) << 1) - (i30 ^ 93);
                a = i31 % 128;
                int i32 = i31 % 2;
                z = i29;
            }
        } else {
            z = 1;
        }
        int i115 = b;
        i3 = ((i115 ^ 18) + ((i115 & 18) << 1)) - 1;
        a = i3 % 128;
        if (i3 % 2 != 0) {
            int i116 = 20 / 0;
        }
        return z;
    }

    public T u(View view, boolean z) {
        e eVar;
        T tU;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 55;
        int i4 = (((i2 ^ 55) | i3) << 1) - ((i2 | 55) & (~i3));
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        O o2 = this.n;
        Object obj = null;
        if (o2 != null) {
            int i7 = i5 + 35;
            b = i7 % 128;
            if (i7 % 2 == 0) {
                tU = o2.u(view, z);
                int i8 = 10 / 0;
            } else {
                tU = o2.u(view, z);
            }
            int i9 = b + 29;
            a = i9 % 128;
            if (i9 % 2 == 0) {
                return tU;
            }
            obj.hashCode();
            throw null;
        }
        if (!z) {
            eVar = this.f;
            int i10 = i5 ^ 21;
            int i11 = -(-((i5 & 21) << 1));
            int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
            b = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 4 % 5;
            }
        } else {
            int i14 = (((i5 | 93) << 1) - (~(-(i5 ^ 93)))) - 1;
            b = i14 % 128;
            if (i14 % 2 == 0) {
                eVar = this.m;
                int i15 = 49 / 0;
            } else {
                eVar = this.m;
            }
            int i16 = ((i5 ^ 47) | (i5 & 47)) << 1;
            int i17 = -(((~i5) & 47) | (i5 & (-48)));
            int i18 = (i16 & i17) + (i17 | i16);
            b = i18 % 128;
            if (i18 % 2 == 0) {
                int i19 = 4 / 2;
            }
        }
        Object orDefault = ((r) eVar.c).getOrDefault(view, null);
        int i20 = a;
        int i21 = i20 + 117;
        b = i21 % 128;
        int i22 = i21 % 2;
        T t = (T) orDefault;
        int i23 = i20 & 15;
        int i24 = -(-((i20 ^ 15) | i23));
        int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
        b = i25 % 128;
        int i26 = i25 % 2;
        return t;
    }

    public void m(ViewGroup viewGroup, boolean z) {
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 ^ 33) + ((i3 & 33) << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        f(z);
        Object obj = null;
        if (this.j.size() <= 0) {
            int i6 = a;
            int i7 = i6 | 109;
            int i8 = ((i7 << 1) - (~(-((~(i6 & 109)) & i7)))) - 1;
            b = i8 % 128;
            if (i8 % 2 == 0) {
                this.l.size();
                obj.hashCode();
                throw null;
            }
            if (this.l.size() <= 0) {
                k(viewGroup, z);
                int i9 = a + 27;
                b = i9 % 128;
                if (i9 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        }
        int i10 = a;
        int i11 = i10 & 107;
        int i12 = i11 + ((i10 ^ 107) | i11);
        b = i12 % 128;
        int i13 = i12 % 2;
        int i14 = 0;
        int i15 = 0;
        while (i15 < this.j.size()) {
            int i16 = a;
            int i17 = i16 & 95;
            int i18 = -(-((i16 ^ 95) | i17));
            int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
            b = i19 % 128;
            int i20 = i19 % 2;
            int iIntValue = this.j.get(i15).intValue();
            int i21 = a + 58;
            int i22 = (i21 ^ (-1)) + (i21 << 1);
            b = i22 % 128;
            if (i22 % 2 == 0) {
                viewGroup.findViewById(iIntValue);
                throw null;
            }
            View viewFindViewById = viewGroup.findViewById(iIntValue);
            if (viewFindViewById != null) {
                T t = new T(viewFindViewById);
                if (z) {
                    int i23 = b;
                    int i24 = (((i23 ^ 121) | (i23 & 121)) << 1) - (((~i23) & 121) | (i23 & (-122)));
                    a = i24 % 128;
                    int i25 = i24 % 2;
                    l(t);
                    int i26 = b;
                    int i27 = ((((i26 ^ 73) | (i26 & 73)) << 1) - (~(-(((~i26) & 73) | (i26 & (-74)))))) - 1;
                    a = i27 % 128;
                    int i28 = i27 % 2;
                } else {
                    i(t);
                    int i29 = a;
                    int i30 = (i29 & 101) + (i29 | 101);
                    b = i30 % 128;
                    int i31 = i30 % 2;
                }
                t.e.add(this);
                int i32 = b;
                int i33 = (i32 & 85) + (i32 | 85);
                a = i33 % 128;
                int i34 = i33 % 2;
                j(t);
                if (!z) {
                    c(this.f, viewFindViewById, t);
                    int i35 = a;
                    int i36 = i35 & 99;
                    int i37 = (i35 | 99) & (~i36);
                    int i38 = i36 << 1;
                    int i39 = (i37 ^ i38) + ((i37 & i38) << 1);
                    b = i39 % 128;
                    int i40 = i39 % 2;
                } else {
                    int i41 = a;
                    int i42 = i41 & 101;
                    int i43 = ((((i41 ^ 101) | i42) << 1) - (~(-((i41 | 101) & (~i42))))) - 1;
                    b = i43 % 128;
                    int i44 = i43 % 2;
                    c(this.m, viewFindViewById, t);
                    int i45 = b;
                    int i46 = ((i45 & 123) - (~(i45 | 123))) - 1;
                    a = i46 % 128;
                    int i47 = i46 % 2;
                }
            }
            int i48 = (((i15 | 26) << 1) - (~(-(((~i15) & 26) | (i15 & (-27)))))) - 1;
            i15 = (-2) - ((((i48 | (-24)) << 1) - (i48 ^ (-24))) ^ (-1));
            int i49 = b;
            int i50 = i49 ^ 41;
            int i51 = ((i49 & 41) | i50) << 1;
            int i52 = -i50;
            int i53 = (i51 ^ i52) + ((i51 & i52) << 1);
            a = i53 % 128;
            int i54 = i53 % 2;
        }
        while (i14 < this.l.size()) {
            View view = this.l.get(i14);
            T t2 = new T(view);
            int i55 = b;
            int i56 = ((i55 & 16) + (i55 | 16)) - 1;
            a = i56 % 128;
            int i57 = i56 % 2;
            if (!z) {
                i(t2);
                int i58 = b;
                int i59 = (((i58 | 66) << 1) - (i58 ^ 66)) - 1;
                a = i59 % 128;
                if (i59 % 2 != 0) {
                    int i60 = 3 / 2;
                }
            } else {
                int i61 = i55 & 89;
                int i62 = -(-((i55 ^ 89) | i61));
                int i63 = (i61 & i62) + (i62 | i61);
                a = i63 % 128;
                int i64 = i63 % 2;
                l(t2);
                int i65 = a;
                int i66 = (((i65 | 32) << 1) - (i65 ^ 32)) - 1;
                b = i66 % 128;
                int i67 = i66 % 2;
            }
            t2.e.add(this);
            j(t2);
            int i68 = a;
            int i69 = i68 ^ 47;
            int i70 = ((i68 & 47) | i69) << 1;
            int i71 = -i69;
            int i72 = (i70 & i71) + (i71 | i70);
            b = i72 % 128;
            int i73 = i72 % 2;
            if (!(!z)) {
                int i74 = (i68 & (-34)) | ((~i68) & 33);
                int i75 = (i68 & 33) << 1;
                int i76 = (i74 ^ i75) + ((i75 & i74) << 1);
                b = i76 % 128;
                if (i76 % 2 == 0) {
                    c(this.m, view, t2);
                    obj.hashCode();
                    throw null;
                }
                c(this.m, view, t2);
                int i77 = b;
                int i78 = (i77 & (-112)) | ((~i77) & 111);
                int i79 = (i77 & 111) << 1;
                i = ((i78 | i79) << 1) - (i79 ^ i78);
                a = i % 128;
            } else {
                c(this.f, view, t2);
                int i80 = a;
                int i81 = (i80 & (-70)) | ((~i80) & 69);
                int i82 = -(-((i80 & 69) << 1));
                i = ((i81 | i82) << 1) - (i82 ^ i81);
                b = i % 128;
            }
            int i83 = i % 2;
            i14++;
            int i84 = a + 51;
            b = i84 % 128;
            int i85 = i84 % 2;
        }
        int i86 = b;
        int i87 = i86 & 41;
        int i88 = (((i86 | 41) & (~i87)) - (~(-(-(i87 << 1))))) - 1;
        a = i88 % 128;
        int i89 = i88 % 2;
    }

    public boolean t(T t, T t2) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 49;
        int i4 = -(-((i2 ^ 49) | i3));
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        a = i5 % 128;
        boolean z = false;
        if (i5 % 2 == 0 ? t != null : t != null) {
            if (t2 != null) {
                int i6 = i2 + 89;
                a = i6 % 128;
                int i7 = i6 % 2;
                String[] strArrS = s();
                if (strArrS == null) {
                    int i8 = b;
                    int i9 = (i8 ^ 59) + ((i8 & 59) << 1);
                    a = i9 % 128;
                    int i10 = i9 % 2;
                    int i11 = i8 & 85;
                    int i12 = (i8 ^ 85) | i11;
                    int i13 = (i11 & i12) + (i12 | i11);
                    a = i13 % 128;
                    int i14 = i13 % 2;
                    for (String str : t.c.keySet()) {
                        int i15 = a;
                        int i16 = (((i15 | 82) << 1) - (i15 ^ 82)) - 1;
                        b = i16 % 128;
                        int i17 = i16 % 2;
                        int i18 = b;
                        int i19 = ((i18 | 27) << 1) - (i18 ^ 27);
                        a = i19 % 128;
                        int i20 = i19 % 2;
                        if (e(t, t2, str)) {
                            int i21 = b;
                            int i22 = (-2) - (((i21 & 54) + (i21 | 54)) ^ (-1));
                            a = i22 % 128;
                            int i23 = i22 % 2;
                            z = true;
                            break;
                        }
                    }
                } else {
                    int i24 = b;
                    int i25 = i24 & 3;
                    int i26 = (i24 ^ 3) | i25;
                    int i27 = (i25 ^ i26) + ((i25 & i26) << 1);
                    a = i27 % 128;
                    int i28 = i27 % 2;
                    int length = strArrS.length;
                    int i29 = (-2) - (((i24 & 116) + (i24 | 116)) ^ (-1));
                    a = i29 % 128;
                    int i30 = i29 % 2;
                    int i31 = 0;
                    while (i31 < length) {
                        int i32 = a;
                        int i33 = i32 & 51;
                        int i34 = (i32 ^ 51) | i33;
                        int i35 = ((i33 | i34) << 1) - (i34 ^ i33);
                        b = i35 % 128;
                        int i36 = i35 % 2;
                        if (e(t, t2, strArrS[i31])) {
                            int i210 = b;
                            int i211 = (-2) - (((i210 & 54) + (i210 | 54)) ^ (-1));
                            a = i211 % 128;
                            int i212 = i211 % 2;
                            z = true;
                            break;
                        }
                        int i37 = a;
                        int i38 = (((i37 | 59) << 1) - (~(-((i37 & (-60)) | ((~i37) & 59))))) - 1;
                        b = i38 % 128;
                        int i39 = i38 % 2;
                        int i40 = i31 ^ 1;
                        int i41 = -(-((i31 & 1) << 1));
                        i31 = ((i41 & i40) << 1) + (i40 ^ i41);
                        int i42 = i37 & 121;
                        int i43 = -(-((i37 ^ 121) | i42));
                        int i44 = (i42 ^ i43) + ((i43 & i42) << 1);
                        b = i44 % 128;
                        int i45 = i44 % 2;
                    }
                }
            }
        }
        int i46 = b;
        int i47 = i46 & 103;
        int i48 = ((i46 ^ 103) | i47) << 1;
        int i49 = -((i46 | 103) & (~i47));
        int i50 = (i48 & i49) + (i49 | i48);
        a = i50 % 128;
        if (i50 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public J y(InterfaceC0070bHc interfaceC0070bHc) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 35) + ((i2 & 35) << 1);
        a = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        ArrayList<InterfaceC0070bHc> arrayList = this.u;
        if (arrayList == null) {
            int i4 = i2 & 93;
            int i5 = (i4 - (~(-(-((i2 ^ 93) | i4))))) - 1;
            a = i5 % 128;
            if (i5 % 2 == 0) {
                return this;
            }
            throw null;
        }
        arrayList.remove(interfaceC0070bHc);
        if (this.u.size() == 0) {
            int i6 = b;
            int i7 = i6 + 32;
            int i8 = (i7 ^ (-1)) + (i7 << 1);
            a = i8 % 128;
            if (i8 % 2 != 0) {
                this.u = null;
                obj.hashCode();
                throw null;
            }
            this.u = null;
            int i9 = i6 + 67;
            a = i9 % 128;
            int i10 = i9 % 2;
        }
        int i11 = a;
        int i12 = i11 & 45;
        int i13 = -(-((i11 ^ 45) | i12));
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        b = i14 % 128;
        int i15 = i14 % 2;
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0052  */
    /* JADX WARN: Code duplicated, block: B:15:0x0071  */
    /* JADX WARN: Code duplicated, block: B:16:0x0073  */
    /* JADX WARN: Code duplicated, block: B:19:0x0081  */
    /* JADX WARN: Code duplicated, block: B:21:0x0085  */
    /* JADX WARN: Code duplicated, block: B:23:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:24:0x00c8  */
    public void H() {
        ArrayList arrayList;
        int size;
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = a;
        int i7 = i6 & 45;
        int i8 = ((i6 ^ 45) | i7) << 1;
        int i9 = -((i6 | 45) & (~i7));
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        int i11 = i10 % 128;
        b = i11;
        int i12 = i10 % 2;
        if (this.s == 0) {
            int i13 = i11 ^ 55;
            int i14 = ((i11 & 55) | i13) << 1;
            int i15 = -i13;
            int i16 = ((i14 | i15) << 1) - (i14 ^ i15);
            int i17 = i16 % 128;
            a = i17;
            int i18 = i16 % 2;
            ArrayList<InterfaceC0070bHc> arrayList2 = this.u;
            if (arrayList2 != null) {
                int i19 = i17 & 125;
                int i20 = i19 + ((i17 ^ 125) | i19);
                b = i20 % 128;
                if (i20 % 2 == 0) {
                    int size2 = arrayList2.size();
                    int i21 = 82 / 0;
                    if (size2 > 0) {
                        arrayList = (ArrayList) this.u.clone();
                        size = arrayList.size();
                        int i22 = a;
                        int i23 = i22 & 15;
                        i = (i23 - (~(-(-((i22 ^ 15) | i23))))) - 1;
                        b = i % 128;
                        if (i % 2 == 0) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        i3 = (-2) - ((i22 + 16) ^ (-1));
                        b = i3 % 128;
                        if (i3 % 2 == 0) {
                            int i24 = 5 % 2;
                        }
                        while (i2 < size) {
                            int i25 = a;
                            int i26 = ((i25 ^ 51) | (i25 & 51)) << 1;
                            int i27 = -(((~i25) & 51) | (i25 & (-52)));
                            int i28 = (i26 & i27) + (i27 | i26);
                            b = i28 % 128;
                            int i29 = i28 % 2;
                            ((InterfaceC0070bHc) arrayList.get(i2)).a(this);
                            int i30 = b;
                            int i31 = (i30 & (-72)) | ((~i30) & 71);
                            int i32 = (i30 & 71) << 1;
                            i4 = (i31 ^ i32) + ((i32 & i31) << 1);
                            int i33 = i4 % 128;
                            a = i33;
                            if (i4 % 2 != 0) {
                                int i34 = i2 & 27;
                                i2 = ((i2 | 27) & (~i34)) + (i34 << 1);
                            } else {
                                int i35 = (i2 & (-2)) | ((~i2) & 1);
                                int i36 = -(-((i2 & 1) << 1));
                                i2 = (i35 ^ i36) + ((i36 & i35) << 1);
                            }
                            int i37 = ((i33 & (-94)) | ((~i33) & 93)) + ((i33 & 93) << 1);
                            b = i37 % 128;
                            int i38 = i37 % 2;
                        }
                    }
                } else if (arrayList2.size() > 0) {
                    arrayList = (ArrayList) this.u.clone();
                    size = arrayList.size();
                    int i210 = a;
                    int i211 = i210 & 15;
                    i = (i211 - (~(-(-((i210 ^ 15) | i211))))) - 1;
                    b = i % 128;
                    if (i % 2 == 0) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    i3 = (-2) - ((i210 + 16) ^ (-1));
                    b = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i212 = 5 % 2;
                    }
                    while (i2 < size) {
                        int i213 = a;
                        int i214 = ((i213 ^ 51) | (i213 & 51)) << 1;
                        int i215 = -(((~i213) & 51) | (i213 & (-52)));
                        int i216 = (i214 & i215) + (i215 | i214);
                        b = i216 % 128;
                        int i217 = i216 % 2;
                        ((InterfaceC0070bHc) arrayList.get(i2)).a(this);
                        int i39 = b;
                        int i310 = (i39 & (-72)) | ((~i39) & 71);
                        int i311 = (i39 & 71) << 1;
                        i4 = (i310 ^ i311) + ((i311 & i310) << 1);
                        int i312 = i4 % 128;
                        a = i312;
                        if (i4 % 2 != 0) {
                            int i313 = i2 & 27;
                            i2 = ((i2 | 27) & (~i313)) + (i313 << 1);
                        } else {
                            int i314 = (i2 & (-2)) | ((~i2) & 1);
                            int i315 = -(-((i2 & 1) << 1));
                            i2 = (i314 ^ i315) + ((i315 & i314) << 1);
                        }
                        int i316 = ((i312 & (-94)) | ((~i312) & 93)) + ((i312 & 93) << 1);
                        b = i316 % 128;
                        int i317 = i316 % 2;
                    }
                }
            }
            this.v = false;
            int i40 = b;
            int i41 = i40 & 7;
            int i42 = -(-((i40 ^ 7) | i41));
            int i43 = ((i41 | i42) << 1) - (i42 ^ i41);
            a = i43 % 128;
            int i44 = i43 % 2;
        }
        int i45 = this.s;
        int i46 = i45 & 1;
        this.s = i46 + ((i45 ^ 1) | i46);
        int i47 = b;
        int i48 = i47 & 17;
        int i49 = (i47 ^ 17) | i48;
        int i50 = ((i48 | i49) << 1) - (i49 ^ i48);
        a = i50 % 128;
        int i51 = i50 % 2;
    }

    public void f(boolean z) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 67;
        int i4 = (((~i3) & (i2 | 67)) - (~(-(-(i3 << 1))))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        Object obj = null;
        if (!z) {
            ((r) this.f.c).clear();
            int i6 = a;
            int i7 = (((i6 & (-44)) | ((~i6) & 43)) - (~(-(-((i6 & 43) << 1))))) - 1;
            b = i7 % 128;
            int i8 = i7 % 2;
            ((SparseArray) this.f.d).clear();
            int i9 = b + 79;
            a = i9 % 128;
            if (i9 % 2 != 0) {
                ((C0083p) this.f.e).e();
                obj.hashCode();
                throw null;
            }
            ((C0083p) this.f.e).e();
            int i10 = b;
            int i11 = i10 & 79;
            int i12 = i11 + ((i10 ^ 79) | i11);
            a = i12 % 128;
            if (i12 % 2 != 0) {
                throw null;
            }
            return;
        }
        int i13 = i2 + 16;
        int i14 = (i13 ^ (-1)) + (i13 << 1);
        a = i14 % 128;
        int i15 = i14 % 2;
        ((r) this.m.c).clear();
        int i16 = a;
        int i17 = i16 & 33;
        int i18 = (i16 ^ 33) | i17;
        int i19 = (i17 & i18) + (i18 | i17);
        b = i19 % 128;
        int i20 = i19 % 2;
        ((SparseArray) this.m.d).clear();
        e eVar = this.m;
        int i21 = a + 73;
        b = i21 % 128;
        if (i21 % 2 == 0) {
            ((C0083p) eVar.e).e();
            throw null;
        }
        ((C0083p) eVar.e).e();
        int i22 = b;
        int i23 = (i22 & 75) + (i22 | 75);
        a = i23 % 128;
        if (i23 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void B() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 119) + ((i2 & 119) << 1);
        b = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            H();
            d();
            obj.hashCode();
            throw null;
        }
        H();
        OooO0o<Animator, bHD> oooO0oD = d();
        int i4 = a;
        int i5 = ((i4 | 40) << 1) - (i4 ^ 40);
        int i6 = (i5 ^ (-1)) + (i5 << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        for (Animator animator : this.w) {
            int i8 = a;
            int i9 = (i8 & 35) + (i8 | 35);
            b = i9 % 128;
            int i10 = i9 % 2;
            int i11 = b;
            int i12 = (i11 ^ 33) + ((i11 & 33) << 1);
            a = i12 % 128;
            if (i12 % 2 != 0) {
                oooO0oD.containsKey(animator);
                throw null;
            }
            if (oooO0oD.containsKey(animator)) {
                int i13 = b + 14;
                int i14 = (i13 ^ (-1)) + (i13 << 1);
                a = i14 % 128;
                int i15 = i14 % 2;
                H();
                if (animator != null) {
                    animator.addListener(new x(this, oooO0oD));
                    long j = this.i;
                    int i16 = b;
                    int i17 = i16 & 95;
                    int i18 = ((i16 ^ 95) | i17) << 1;
                    int i19 = -((i16 | 95) & (~i17));
                    int i20 = (i18 & i19) + (i19 | i18);
                    int i21 = i20 % 128;
                    a = i21;
                    int i22 = i20 % 2;
                    if (j >= 0) {
                        int i23 = (i21 & 43) + (i21 | 43);
                        b = i23 % 128;
                        int i24 = i23 % 2;
                        animator.setDuration(j);
                        int i25 = b + 29;
                        a = i25 % 128;
                        if (i25 % 2 != 0) {
                            int i26 = 5 % 4;
                        }
                    }
                    long j2 = this.h;
                    if (j2 >= 0) {
                        int i27 = (-2) - ((b + 34) ^ (-1));
                        a = i27 % 128;
                        if (i27 % 2 != 0) {
                            animator.setStartDelay(j2 ^ animator.getStartDelay());
                        } else {
                            animator.setStartDelay(animator.getStartDelay() + j2);
                        }
                    }
                    TimeInterpolator timeInterpolator = this.k;
                    if (timeInterpolator != null) {
                        int i28 = b + 120;
                        int i29 = (i28 ^ (-1)) + (i28 << 1);
                        a = i29 % 128;
                        if (i29 % 2 != 0) {
                            animator.setInterpolator(timeInterpolator);
                            obj.hashCode();
                            throw null;
                        }
                        animator.setInterpolator(timeInterpolator);
                        int i30 = b;
                        int i31 = i30 & 33;
                        int i32 = i31 + ((i30 ^ 33) | i31);
                        a = i32 % 128;
                        int i33 = i32 % 2;
                    }
                    animator.addListener(new M(this));
                    int i34 = a;
                    int i35 = (i34 & 3) + (i34 | 3);
                    b = i35 % 128;
                    int i36 = i35 % 2;
                    animator.start();
                    int i37 = b;
                    int i38 = ((i37 & (-52)) | ((~i37) & 51)) + ((i37 & 51) << 1);
                    a = i38 % 128;
                    int i39 = i38 % 2;
                } else {
                    continue;
                }
            }
        }
        this.w.clear();
        r();
        int i40 = a;
        int i41 = i40 | 105;
        int i42 = i41 << 1;
        int i43 = -((~(i40 & 105)) & i41);
        int i44 = (i42 ^ i43) + ((i43 & i42) << 1);
        b = i44 % 128;
        if (i44 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x010e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0128  */
    /* JADX WARN: Code duplicated, block: B:36:0x012d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0144  */
    /* JADX WARN: Code duplicated, block: B:54:0x0172 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0165 A[SYNTHETIC] */
    public void x(View view) {
        int i;
        ArrayList arrayList;
        int i2;
        int size;
        int i3;
        int i4 = 2 % 2;
        int i5 = b + 115;
        int i6 = i5 % 128;
        a = i6;
        if (i5 % 2 != 0) {
            throw null;
        }
        if (!this.v) {
            int i7 = i6 + 122;
            int i8 = (i7 ^ (-1)) + (i7 << 1);
            b = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = d().i;
                ivas.gov.bisp.enumeration.p006af.h hVar = L.c;
                throw null;
            }
            OooO0o<Animator, bHD> oooO0oD = d();
            int i10 = oooO0oD.i;
            ivas.gov.bisp.enumeration.p006af.h hVar2 = L.c;
            WindowId windowId = view.getWindowId();
            int i11 = ~i10;
            int i12 = ((i10 | i11) << 1) - i11;
            int i13 = a;
            int i14 = i13 & 109;
            int i15 = ((i13 ^ 109) | i14) << 1;
            int i16 = -((i13 | 109) & (~i14));
            int i17 = (i15 & i16) + (i16 | i15);
            b = i17 % 128;
            int i18 = i17 % 2;
            while (true) {
                i = 0;
                if (i12 < 0) {
                    break;
                }
                int i19 = b + 95;
                a = i19 % 128;
                int i20 = i19 % 2;
                bHD bhd = (bHD) oooO0oD.n(i12);
                if (bhd.a != null) {
                    int i21 = b + 36;
                    int i22 = (i21 ^ (-1)) + (i21 << 1);
                    a = i22 % 128;
                    int i23 = i22 % 2;
                    W w = bhd.d;
                    if (w instanceof y) {
                        int i24 = a;
                        int i25 = i24 & 65;
                        int i26 = ((i24 ^ 65) | i25) << 1;
                        int i27 = -((i24 | 65) & (~i25));
                        int i28 = (i26 & i27) + (i27 | i26);
                        b = i28 % 128;
                        int i29 = i28 % 2;
                        WindowId windowId2 = ((y) w).c;
                        int i30 = a + 107;
                        b = i30 % 128;
                        int i31 = i30 % 2;
                        if (!(!windowId2.equals(windowId))) {
                            int i32 = b + 51;
                            a = i32 % 128;
                            int i33 = i32 % 2;
                            i = 1;
                        }
                    }
                    if ((i ^ 1) == 0) {
                        int i34 = b + 9;
                        a = i34 % 128;
                        int i35 = i34 % 2;
                        ((Animator) oooO0oD.k(i12)).pause();
                        int i36 = a;
                        int i37 = (((i36 ^ 81) | (i36 & 81)) << 1) - (((~i36) & 81) | (i36 & (-82)));
                        b = i37 % 128;
                        int i38 = i37 % 2;
                    }
                }
                int i39 = -(-((~i12) | i12));
                i12 = (i12 | i39) + (i12 & i39);
                int i40 = a;
                int i41 = i40 & 3;
                int i42 = (i41 - (~((i40 ^ 3) | i41))) - 1;
                b = i42 % 128;
                int i43 = i42 % 2;
            }
            ArrayList<InterfaceC0070bHc> arrayList2 = this.u;
            if (arrayList2 != null) {
                int i44 = a;
                int i45 = ((i44 | 43) << 1) - (i44 ^ 43);
                b = i45 % 128;
                if (i45 % 2 == 0) {
                    int i46 = 46 / 0;
                    if (arrayList2.size() > 0) {
                        arrayList = (ArrayList) this.u.clone();
                        int i47 = a;
                        i2 = ((i47 & 7) - (~(-(-(i47 | 7))))) - 1;
                        b = i2 % 128;
                        if (i2 % 2 == 0) {
                            size = arrayList.size();
                        } else {
                            size = arrayList.size();
                        }
                        int i48 = b;
                        int i49 = i48 & 3;
                        int i50 = (i49 - (~(-(-((i48 ^ 3) | i49))))) - 1;
                        a = i50 % 128;
                        int i51 = i50 % 2;
                        while (i < size) {
                            int i52 = a;
                            int i53 = (i52 & 71) + (i52 | 71);
                            b = i53 % 128;
                            int i54 = i53 % 2;
                            ((InterfaceC0070bHc) arrayList.get(i)).d(this);
                            i3 = a + 85;
                            b = i3 % 128;
                            if (i3 % 2 == 0) {
                                int i55 = (i ^ 111) + ((i & 111) << 1);
                                i = ((i55 ^ (-1)) + (i55 << 1)) - 51;
                            } else {
                                int i56 = i + 96;
                                int i57 = i56 & (-95);
                                i = (((i56 ^ (-95)) | i57) << 1) - ((i56 | (-95)) & (~i57));
                            }
                        }
                    }
                } else if (arrayList2.size() > 0) {
                    arrayList = (ArrayList) this.u.clone();
                    int i410 = a;
                    i2 = ((i410 & 7) - (~(-(-(i410 | 7))))) - 1;
                    b = i2 % 128;
                    if (i2 % 2 == 0) {
                        size = arrayList.size();
                    } else {
                        size = arrayList.size();
                    }
                    int i411 = b;
                    int i412 = i411 & 3;
                    int i58 = (i412 - (~(-(-((i411 ^ 3) | i412))))) - 1;
                    a = i58 % 128;
                    int i59 = i58 % 2;
                    while (i < size) {
                        int i510 = a;
                        int i511 = (i510 & 71) + (i510 | 71);
                        b = i511 % 128;
                        int i512 = i511 % 2;
                        ((InterfaceC0070bHc) arrayList.get(i)).d(this);
                        i3 = a + 85;
                        b = i3 % 128;
                        if (i3 % 2 == 0) {
                            int i513 = (i ^ 111) + ((i & 111) << 1);
                            i = ((i513 ^ (-1)) + (i513 << 1)) - 51;
                        } else {
                            int i514 = i + 96;
                            int i515 = i514 & (-95);
                            i = (((i514 ^ (-95)) | i515) << 1) - ((i514 | (-95)) & (~i515));
                        }
                    }
                }
            }
            this.t = true;
            int i60 = a;
            int i61 = ((i60 ^ 97) | (i60 & 97)) << 1;
            int i62 = -(((~i60) & 97) | (i60 & (-98)));
            int i63 = (i61 & i62) + (i62 | i61);
            b = i63 % 128;
            int i64 = i63 % 2;
        }
        int i65 = a;
        int i66 = (i65 | 83) << 1;
        int i67 = -(i65 ^ 83);
        int i68 = ((i66 | i67) << 1) - (i67 ^ i66);
        b = i68 % 128;
        int i69 = i68 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00ee  */
    public void w(View view) {
        WindowId windowId;
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 ^ 52) + ((i3 & 52) << 1)) - 1;
        a = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        if (this.t) {
            int i5 = ((i3 ^ 109) | (i3 & 109)) << 1;
            int i6 = -(((~i3) & 109) | (i3 & (-110)));
            int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
            int i8 = i7 % 128;
            a = i8;
            int i9 = i7 % 2;
            if (!this.v) {
                int i10 = ((i8 ^ 15) | (i8 & 15)) << 1;
                int i11 = -(((~i8) & 15) | (i8 & (-16)));
                int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
                b = i12 % 128;
                int i13 = i12 % 2;
                OooO0o<Animator, bHD> oooO0oD = d();
                int i14 = oooO0oD.i;
                ivas.gov.bisp.enumeration.p006af.h hVar = L.c;
                int i15 = b;
                int i16 = i15 & 101;
                int i17 = ((i15 ^ 101) | i16) << 1;
                int i18 = -((i15 | 101) & (~i16));
                int i19 = (i17 & i18) + (i18 | i17);
                a = i19 % 128;
                if (i19 % 2 != 0) {
                    windowId = view.getWindowId();
                    int i20 = (i14 & (-28)) | ((~i14) & 27);
                    int i21 = (i14 & 27) << 1;
                    int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
                    int i23 = i22 & 75;
                    int i24 = (~i23) & (i22 | 75);
                    int i25 = -(-(i23 << 1));
                    i = (i24 ^ i25) + ((i25 & i24) << 1);
                } else {
                    windowId = view.getWindowId();
                    i = (~i14) + (i14 << 1);
                }
                while (i >= 0) {
                    int i26 = b;
                    int i27 = i26 & 103;
                    int i28 = (((i26 ^ 103) | i27) << 1) - ((i26 | 103) & (~i27));
                    a = i28 % 128;
                    if (i28 % 2 != 0) {
                        View view2 = ((bHD) oooO0oD.n(i)).a;
                        throw null;
                    }
                    bHD bhd = (bHD) oooO0oD.n(i);
                    if (bhd.a != null) {
                        W w = bhd.d;
                        if (w instanceof y) {
                            int i29 = b + 69;
                            a = i29 % 128;
                            int i30 = i29 % 2;
                            if (!((y) w).c.equals(windowId)) {
                                int i31 = a;
                                int i32 = (i31 ^ 1) + ((i31 & 1) << 1);
                                b = i32 % 128;
                                int i33 = i32 % 2;
                                z = false;
                            } else {
                                int i34 = b;
                                int i35 = (-2) - (((i34 ^ 60) + ((i34 & 60) << 1)) ^ (-1));
                                a = i35 % 128;
                                int i36 = i35 % 2;
                                int i37 = (i34 & 97) + (i34 | 97);
                                a = i37 % 128;
                                int i38 = i37 % 2;
                                z = true;
                            }
                        } else {
                            int i39 = a;
                            int i310 = (i39 ^ 1) + ((i39 & 1) << 1);
                            b = i310 % 128;
                            int i311 = i310 % 2;
                            z = false;
                        }
                        if (!(!z)) {
                            int i40 = b + 107;
                            a = i40 % 128;
                            if (i40 % 2 != 0) {
                                ((Animator) oooO0oD.k(i)).resume();
                                int i41 = 61 / 0;
                            } else {
                                ((Animator) oooO0oD.k(i)).resume();
                            }
                        }
                    }
                    int i42 = (-2) - (((i ^ (-81)) + ((i & (-81)) << 1)) ^ (-1));
                    i = (((i42 ^ 81) | (i42 & 81)) << 1) - (((~i42) & 81) | (i42 & (-82)));
                    int i43 = b;
                    int i44 = ((i43 | 119) << 1) - (i43 ^ 119);
                    a = i44 % 128;
                    int i45 = i44 % 2;
                }
                ArrayList<InterfaceC0070bHc> arrayList = this.u;
                if (arrayList != null) {
                    int i46 = a;
                    int i47 = i46 & 5;
                    int i48 = -(-((i46 ^ 5) | i47));
                    int i49 = ((i47 | i48) << 1) - (i48 ^ i47);
                    b = i49 % 128;
                    int i50 = i49 % 2;
                    if (arrayList.size() > 0) {
                        int i51 = a;
                        int i52 = i51 & 37;
                        int i53 = (i52 - (~((i51 ^ 37) | i52))) - 1;
                        b = i53 % 128;
                        int i54 = i53 % 2;
                        ArrayList arrayList2 = (ArrayList) this.u.clone();
                        int size = arrayList2.size();
                        int i55 = a;
                        int i56 = (i55 & 107) + (i55 | 107);
                        b = i56 % 128;
                        int i57 = i56 % 2;
                        int i58 = 0;
                        while (i58 < size) {
                            int i59 = a;
                            int i60 = ((i59 | 49) << 1) - (i59 ^ 49);
                            b = i60 % 128;
                            if (i60 % 2 == 0) {
                                ((InterfaceC0070bHc) arrayList2.get(i58)).e(this);
                                throw null;
                            }
                            ((InterfaceC0070bHc) arrayList2.get(i58)).e(this);
                            int i61 = a;
                            int i62 = (-2) - ((((i61 | 20) << 1) - (i61 ^ 20)) ^ (-1));
                            b = i62 % 128;
                            if (i62 % 2 == 0) {
                                int i63 = i58 & 104;
                                int i64 = i63 + ((i58 ^ 104) | i63);
                                int i65 = ((i64 ^ (-67)) | (i64 & (-67))) << 1;
                                int i66 = -(((~i64) & (-67)) | (i64 & 66));
                                i58 = (i65 ^ i66) + ((i65 & i66) << 1);
                            } else {
                                i58 = (-2) - (((i58 ^ 2) + ((i58 & 2) << 1)) ^ (-1));
                            }
                        }
                    }
                }
            }
            this.t = false;
            int i67 = b;
            int i68 = ((i67 & (-74)) | ((~i67) & 73)) + ((i67 & 73) << 1);
            a = i68 % 128;
            int i69 = i68 % 2;
        }
        int i70 = a;
        int i71 = (i70 ^ 75) + ((i70 & 75) << 1);
        b = i71 % 128;
        int i72 = i71 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0036  */
    /* JADX WARN: Code duplicated, block: B:13:0x0043  */
    /* JADX WARN: Code duplicated, block: B:15:0x0049  */
    /* JADX WARN: Code duplicated, block: B:17:0x006e  */
    /* JADX WARN: Code duplicated, block: B:18:0x0070  */
    /* JADX WARN: Code duplicated, block: B:21:0x007d A[LOOP:0: B:20:0x007b->B:21:0x007d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:22:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:26:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:30:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:37:0x0121  */
    /* JADX WARN: Code duplicated, block: B:42:0x0185  */
    /* JADX WARN: Code duplicated, block: B:44:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:45:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:48:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:54:0x0165 A[EDGE_INSN: B:54:0x0165->B:39:0x0165 BREAK  A[LOOP:1: B:28:0x00c4->B:38:0x0145], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0165 A[EDGE_INSN: B:55:0x0165->B:39:0x0165 BREAK  A[LOOP:1: B:28:0x00c4->B:38:0x0145], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0145 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x01db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0031  */
    public void r() {
        ArrayList<InterfaceC0070bHc> arrayList;
        int i;
        int i2;
        C0083p c0083p;
        int i3;
        int i4;
        int i5;
        Object objC;
        View view;
        View view2;
        int i6;
        int i7;
        ArrayList arrayList2;
        int size;
        int i8;
        int i9;
        int i10 = 2 % 2;
        int i11 = a;
        int i12 = i11 & 119;
        int i13 = i11 | 119;
        int i14 = (i12 & i13) + (i13 | i12);
        int i15 = i14 % 128;
        b = i15;
        if (i14 % 2 == 0) {
            int i16 = this.s;
            int i17 = i16 << 1;
            int i18 = -i16;
            int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
            this.s = i19;
            if (i19 == 0) {
                arrayList = this.u;
                if (arrayList != null) {
                    i7 = (-2) - ((i15 + 76) ^ (-1));
                    a = i7 % 128;
                    if (i7 % 2 == 0) {
                        arrayList.size();
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (arrayList.size() > 0) {
                        arrayList2 = (ArrayList) this.u.clone();
                        size = arrayList2.size();
                        int i20 = a;
                        int i21 = i20 & 73;
                        int i22 = ((i20 ^ 73) | i21) << 1;
                        int i23 = -((i20 | 73) & (~i21));
                        i8 = (i22 ^ i23) + ((i23 & i22) << 1);
                        int i24 = i8 % 128;
                        b = i24;
                        if (i8 % 2 == 0) {
                            i9 = 1;
                        } else {
                            i9 = 0;
                        }
                        int i25 = (i24 & 65) + (i24 | 65);
                        a = i25 % 128;
                        int i26 = i25 % 2;
                        while (i9 < size) {
                            int i27 = b + 49;
                            a = i27 % 128;
                            int i28 = i27 % 2;
                            ((InterfaceC0070bHc) arrayList2.get(i9)).b(this);
                            i9 = (i9 | 1) + (i9 & 1);
                            int i29 = a;
                            int i30 = (i29 ^ 15) + ((i29 & 15) << 1);
                            b = i30 % 128;
                            int i31 = i30 % 2;
                        }
                    }
                }
                int i32 = b;
                i = (((i32 & (-40)) | ((~i32) & 39)) - (~((i32 & 39) << 1))) - 1;
                a = i % 128;
                if (i % 2 != 0) {
                    int i33 = 4 / 3;
                }
                i2 = 0;
                while (true) {
                    c0083p = (C0083p) this.m.e;
                    int i34 = a;
                    int i35 = (i34 & (-70)) | ((~i34) & 69);
                    int i36 = -(-((i34 & 69) << 1));
                    i3 = (i35 & i36) + (i36 | i35);
                    b = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i37 = 45 / 0;
                        if (i2 >= c0083p.k()) {
                            break;
                        }
                        int i38 = a;
                        int i39 = i38 & 57;
                        int i40 = ((i38 | 57) & (~i39)) + (i39 << 1);
                        b = i40 % 128;
                        int i41 = i40 % 2;
                        view2 = (View) ((C0083p) this.m.e).c(i2);
                        int i42 = b;
                        int i43 = i42 & 7;
                        int i44 = -(-((i42 ^ 7) | i43));
                        int i45 = (i43 & i44) + (i44 | i43);
                        i6 = i45 % 128;
                        a = i6;
                        int i46 = i45 % 2;
                        if (view2 != null) {
                            int i47 = ((i6 & 13) - (~(-(-(i6 | 13))))) - 1;
                            b = i47 % 128;
                            int i48 = i47 % 2;
                            WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = ivas.gov.bisp.enumeration.p081d.T.c;
                            ivas.gov.bisp.enumeration.d.T.aWX.r(view2, false);
                            int i49 = b;
                            int i50 = i49 & 41;
                            int i51 = (i50 - (~(-(-((i49 ^ 41) | i50))))) - 1;
                            a = i51 % 128;
                            int i52 = i51 % 2;
                        }
                        int i53 = i2 & (-34);
                        int i54 = (((i2 | (-34)) & (~i53)) - (~(i53 << 1))) - 1;
                        int i55 = i54 & 35;
                        int i56 = (i54 ^ 35) | i55;
                        i2 = ((i55 | i56) << 1) - (i56 ^ i55);
                        int i57 = b + 31;
                        a = i57 % 128;
                        int i58 = i57 % 2;
                    } else {
                        if (i2 >= c0083p.k()) {
                            break;
                        }
                        int i310 = a;
                        int i311 = i310 & 57;
                        int i410 = ((i310 | 57) & (~i311)) + (i311 << 1);
                        b = i410 % 128;
                        int i411 = i410 % 2;
                        view2 = (View) ((C0083p) this.m.e).c(i2);
                        int i412 = b;
                        int i413 = i412 & 7;
                        int i414 = -(-((i412 ^ 7) | i413));
                        int i415 = (i413 & i414) + (i414 | i413);
                        i6 = i415 % 128;
                        a = i6;
                        int i416 = i415 % 2;
                        if (view2 != null) {
                            int i417 = ((i6 & 13) - (~(-(-(i6 | 13))))) - 1;
                            b = i417 % 128;
                            int i418 = i417 % 2;
                            WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap2 = ivas.gov.bisp.enumeration.p081d.T.c;
                            ivas.gov.bisp.enumeration.d.T.aWX.r(view2, false);
                            int i419 = b;
                            int i59 = i419 & 41;
                            int i510 = (i59 - (~(-(-((i419 ^ 41) | i59))))) - 1;
                            a = i510 % 128;
                            int i511 = i510 % 2;
                        }
                        int i512 = i2 & (-34);
                        int i513 = (((i2 | (-34)) & (~i512)) - (~(i512 << 1))) - 1;
                        int i514 = i513 & 35;
                        int i515 = (i513 ^ 35) | i514;
                        i2 = ((i514 | i515) << 1) - (i515 ^ i514);
                        int i516 = b + 31;
                        a = i516 % 128;
                        int i517 = i516 % 2;
                    }
                }
                int i60 = b;
                int i61 = i60 & 69;
                int i62 = (i60 | 69) & (~i61);
                int i63 = -(-(i61 << 1));
                int i64 = (i62 & i63) + (i62 | i63);
                a = i64 % 128;
                int i65 = i64 % 2;
                i4 = 0;
                while (i4 < ((C0083p) this.f.e).k()) {
                    int i66 = b;
                    int i67 = ((i66 ^ 85) | (i66 & 85)) << 1;
                    int i68 = -(((~i66) & 85) | (i66 & (-86)));
                    i5 = ((i67 | i68) << 1) - (i68 ^ i67);
                    a = i5 % 128;
                    if (i5 % 2 != 0) {
                        objC = ((C0083p) this.f.e).c(i4);
                        int i69 = 55 / 0;
                    } else {
                        objC = ((C0083p) this.f.e).c(i4);
                    }
                    view = (View) objC;
                    if (view != null) {
                        int i70 = a;
                        int i71 = ((i70 | 125) << 1) - (i70 ^ 125);
                        b = i71 % 128;
                        int i72 = i71 % 2;
                        WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap3 = ivas.gov.bisp.enumeration.p081d.T.c;
                        ivas.gov.bisp.enumeration.d.T.aWX.r(view, false);
                        int i73 = a;
                        int i74 = ((i73 & 8) + (i73 | 8)) - 1;
                        b = i74 % 128;
                        int i75 = i74 % 2;
                    }
                    int i76 = (i4 & 60) + (i4 | 60);
                    i4 = ((i76 | (-59)) << 1) - (i76 ^ (-59));
                    int i77 = b;
                    int i78 = ((i77 & 75) - (~(-(-(i77 | 75))))) - 1;
                    a = i78 % 128;
                    int i79 = i78 % 2;
                }
                this.v = true;
                int i80 = a + 64;
                int i81 = (i80 ^ (-1)) + (i80 << 1);
                b = i81 % 128;
                int i82 = i81 % 2;
            }
        } else {
            int i83 = this.s;
            int i84 = (i83 << 1) - i83;
            int i85 = (i84 ^ (-1)) + (i84 << 1);
            this.s = i85;
            if (i85 == 0) {
                arrayList = this.u;
                if (arrayList != null) {
                    i7 = (-2) - ((i15 + 76) ^ (-1));
                    a = i7 % 128;
                    if (i7 % 2 == 0) {
                        arrayList.size();
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    if (arrayList.size() > 0) {
                        arrayList2 = (ArrayList) this.u.clone();
                        size = arrayList2.size();
                        int i210 = a;
                        int i211 = i210 & 73;
                        int i212 = ((i210 ^ 73) | i211) << 1;
                        int i213 = -((i210 | 73) & (~i211));
                        i8 = (i212 ^ i213) + ((i213 & i212) << 1);
                        int i214 = i8 % 128;
                        b = i214;
                        if (i8 % 2 == 0) {
                            i9 = 1;
                        } else {
                            i9 = 0;
                        }
                        int i215 = (i214 & 65) + (i214 | 65);
                        a = i215 % 128;
                        int i216 = i215 % 2;
                        while (i9 < size) {
                            int i217 = b + 49;
                            a = i217 % 128;
                            int i218 = i217 % 2;
                            ((InterfaceC0070bHc) arrayList2.get(i9)).b(this);
                            i9 = (i9 | 1) + (i9 & 1);
                            int i219 = a;
                            int i312 = (i219 ^ 15) + ((i219 & 15) << 1);
                            b = i312 % 128;
                            int i313 = i312 % 2;
                        }
                    }
                }
                int i314 = b;
                i = (((i314 & (-40)) | ((~i314) & 39)) - (~((i314 & 39) << 1))) - 1;
                a = i % 128;
                if (i % 2 != 0) {
                    int i315 = 4 / 3;
                }
                i2 = 0;
                while (true) {
                    c0083p = (C0083p) this.m.e;
                    int i316 = a;
                    int i317 = (i316 & (-70)) | ((~i316) & 69);
                    int i318 = -(-((i316 & 69) << 1));
                    i3 = (i317 & i318) + (i318 | i317);
                    b = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i319 = 45 / 0;
                        if (i2 >= c0083p.k()) {
                            break;
                            break;
                        }
                        int i3110 = a;
                        int i3111 = i3110 & 57;
                        int i4110 = ((i3110 | 57) & (~i3111)) + (i3111 << 1);
                        b = i4110 % 128;
                        int i4111 = i4110 % 2;
                        view2 = (View) ((C0083p) this.m.e).c(i2);
                        int i4112 = b;
                        int i4113 = i4112 & 7;
                        int i4114 = -(-((i4112 ^ 7) | i4113));
                        int i4115 = (i4113 & i4114) + (i4114 | i4113);
                        i6 = i4115 % 128;
                        a = i6;
                        int i4116 = i4115 % 2;
                        if (view2 != null) {
                            int i4117 = ((i6 & 13) - (~(-(-(i6 | 13))))) - 1;
                            b = i4117 % 128;
                            int i4118 = i4117 % 2;
                            WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap4 = ivas.gov.bisp.enumeration.p081d.T.c;
                            ivas.gov.bisp.enumeration.d.T.aWX.r(view2, false);
                            int i4119 = b;
                            int i518 = i4119 & 41;
                            int i519 = (i518 - (~(-(-((i4119 ^ 41) | i518))))) - 1;
                            a = i519 % 128;
                            int i5110 = i519 % 2;
                        }
                        int i5111 = i2 & (-34);
                        int i5112 = (((i2 | (-34)) & (~i5111)) - (~(i5111 << 1))) - 1;
                        int i5113 = i5112 & 35;
                        int i5114 = (i5112 ^ 35) | i5113;
                        i2 = ((i5113 | i5114) << 1) - (i5114 ^ i5113);
                        int i5115 = b + 31;
                        a = i5115 % 128;
                        int i5116 = i5115 % 2;
                    } else {
                        if (i2 >= c0083p.k()) {
                            break;
                            break;
                        }
                        int i3112 = a;
                        int i3113 = i3112 & 57;
                        int i41110 = ((i3112 | 57) & (~i3113)) + (i3113 << 1);
                        b = i41110 % 128;
                        int i41111 = i41110 % 2;
                        view2 = (View) ((C0083p) this.m.e).c(i2);
                        int i41112 = b;
                        int i41113 = i41112 & 7;
                        int i41114 = -(-((i41112 ^ 7) | i41113));
                        int i41115 = (i41113 & i41114) + (i41114 | i41113);
                        i6 = i41115 % 128;
                        a = i6;
                        int i41116 = i41115 % 2;
                        if (view2 != null) {
                            int i41117 = ((i6 & 13) - (~(-(-(i6 | 13))))) - 1;
                            b = i41117 % 128;
                            int i41118 = i41117 % 2;
                            WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap5 = ivas.gov.bisp.enumeration.p081d.T.c;
                            ivas.gov.bisp.enumeration.d.T.aWX.r(view2, false);
                            int i41119 = b;
                            int i5117 = i41119 & 41;
                            int i5118 = (i5117 - (~(-(-((i41119 ^ 41) | i5117))))) - 1;
                            a = i5118 % 128;
                            int i5119 = i5118 % 2;
                        }
                        int i51110 = i2 & (-34);
                        int i51111 = (((i2 | (-34)) & (~i51110)) - (~(i51110 << 1))) - 1;
                        int i51112 = i51111 & 35;
                        int i51113 = (i51111 ^ 35) | i51112;
                        i2 = ((i51112 | i51113) << 1) - (i51113 ^ i51112);
                        int i51114 = b + 31;
                        a = i51114 % 128;
                        int i51115 = i51114 % 2;
                    }
                }
                int i610 = b;
                int i611 = i610 & 69;
                int i612 = (i610 | 69) & (~i611);
                int i613 = -(-(i611 << 1));
                int i614 = (i612 & i613) + (i612 | i613);
                a = i614 % 128;
                int i615 = i614 % 2;
                i4 = 0;
                while (i4 < ((C0083p) this.f.e).k()) {
                    int i616 = b;
                    int i617 = ((i616 ^ 85) | (i616 & 85)) << 1;
                    int i618 = -(((~i616) & 85) | (i616 & (-86)));
                    i5 = ((i617 | i618) << 1) - (i618 ^ i617);
                    a = i5 % 128;
                    if (i5 % 2 != 0) {
                        objC = ((C0083p) this.f.e).c(i4);
                        int i619 = 55 / 0;
                    } else {
                        objC = ((C0083p) this.f.e).c(i4);
                    }
                    view = (View) objC;
                    if (view != null) {
                        int i710 = a;
                        int i711 = ((i710 | 125) << 1) - (i710 ^ 125);
                        b = i711 % 128;
                        int i712 = i711 % 2;
                        WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap6 = ivas.gov.bisp.enumeration.p081d.T.c;
                        ivas.gov.bisp.enumeration.d.T.aWX.r(view, false);
                        int i713 = a;
                        int i714 = ((i713 & 8) + (i713 | 8)) - 1;
                        b = i714 % 128;
                        int i715 = i714 % 2;
                    }
                    int i716 = (i4 & 60) + (i4 | 60);
                    i4 = ((i716 | (-59)) << 1) - (i716 ^ (-59));
                    int i717 = b;
                    int i718 = ((i717 & 75) - (~(-(-(i717 | 75))))) - 1;
                    a = i718 % 128;
                    int i719 = i718 % 2;
                }
                this.v = true;
                int i86 = a + 64;
                int i87 = (i86 ^ (-1)) + (i86 << 1);
                b = i87 % 128;
                int i88 = i87 % 2;
            }
        }
        int i89 = b;
        int i90 = i89 & 31;
        int i91 = -(-((i89 ^ 31) | i90));
        int i92 = ((i90 | i91) << 1) - (i91 ^ i90);
        a = i92 % 128;
        int i93 = i92 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        r9.getId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        if ((r9.getParent() instanceof android.view.ViewGroup) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        r1 = new ivas.gov.bisp.enumeration.aM.T(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
    
        if (r10 == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
    
        r2 = ivas.gov.bisp.enumeration.aM.J.a;
        r6 = r2 & 119;
        r2 = (r2 | 119) & (~r6);
        r6 = r6 << 1;
        r7 = (r2 & r6) + (r2 | r6);
        ivas.gov.bisp.enumeration.aM.J.b = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
    
        if ((r7 % 2) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
    
        l(r1);
        r2 = ivas.gov.bisp.enumeration.aM.J.b;
        r2 = (-2) - (((r2 ^ 126) + ((r2 & 126) << 1)) ^ (-1));
        ivas.gov.bisp.enumeration.aM.J.a = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0078, code lost:
    
        l(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007c, code lost:
    
        i(r1);
        r2 = ivas.gov.bisp.enumeration.aM.J.b;
        r6 = r2 & 61;
        r2 = ((r2 | 61) & (~r6)) + (r6 << 1);
        ivas.gov.bisp.enumeration.aM.J.a = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008e, code lost:
    
        r1.e.add(r8);
        r2 = ivas.gov.bisp.enumeration.aM.J.b;
        r6 = r2 | 19;
        r7 = ((r6 << 1) - (~(-((~(r2 & 19)) & r6)))) - 1;
        ivas.gov.bisp.enumeration.aM.J.a = r7 % 128;
        r7 = r7 % 2;
        j(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a9, code lost:
    
        if (r10 == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ab, code lost:
    
        r2 = ivas.gov.bisp.enumeration.aM.J.a;
        r6 = ((r2 ^ 46) + ((r2 & 46) << 1)) - 1;
        ivas.gov.bisp.enumeration.aM.J.b = r6 % 128;
        r6 = r6 % 2;
        c(r8.m, r9, r1);
        r1 = ivas.gov.bisp.enumeration.aM.J.a;
        r2 = r1 & 61;
        r1 = (r1 ^ 61) | r2;
        r6 = (r2 & r1) + (r1 | r2);
        ivas.gov.bisp.enumeration.aM.J.b = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00cf, code lost:
    
        c(r8.f, r9, r1);
        r1 = ivas.gov.bisp.enumeration.aM.J.a;
        r2 = ((r1 ^ 16) + ((r1 & 16) << 1)) - 1;
        ivas.gov.bisp.enumeration.aM.J.b = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e4, code lost:
    
        if ((r9 instanceof android.view.ViewGroup) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e6, code lost:
    
        r1 = ivas.gov.bisp.enumeration.aM.J.a;
        r2 = r1 + 67;
        ivas.gov.bisp.enumeration.aM.J.b = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ef, code lost:
    
        if ((r2 % 2) != 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00f1, code lost:
    
        r9 = (android.view.ViewGroup) r9;
        r4 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f5, code lost:
    
        r9 = (android.view.ViewGroup) r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f7, code lost:
    
        r2 = (r1 & (-104)) | ((~r1) & 103);
        r1 = (r1 & 103) << 1;
        r6 = (r2 & r1) + (r1 | r2);
        ivas.gov.bisp.enumeration.aM.J.b = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x010d, code lost:
    
        if (r4 >= r9.getChildCount()) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x010f, code lost:
    
        r1 = ivas.gov.bisp.enumeration.aM.J.b;
        r2 = r1 & 33;
        r1 = (r1 ^ 33) | r2;
        r6 = (r2 ^ r1) + ((r1 & r2) << 1);
        ivas.gov.bisp.enumeration.aM.J.a = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0120, code lost:
    
        if ((r6 % 2) == 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0122, code lost:
    
        k(r9.getChildAt(r4), r10);
        r4 = r4 + 46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x012c, code lost:
    
        k(r9.getChildAt(r4), r10);
        r4 = ((r4 ^ (-78)) + ((r4 & (-78)) << 1)) + 79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x013c, code lost:
    
        r1 = ivas.gov.bisp.enumeration.aM.J.b;
        r2 = r1 & 37;
        r2 = (r2 - (~((r1 ^ 37) | r2))) - 1;
        ivas.gov.bisp.enumeration.aM.J.a = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x014c, code lost:
    
        r9 = ivas.gov.bisp.enumeration.aM.J.a;
        r10 = r9 & 29;
        r10 = (r10 - (~((r9 ^ 29) | r10))) - 1;
        ivas.gov.bisp.enumeration.aM.J.b = r10 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x015b, code lost:
    
        if ((r10 % 2) == 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x015d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x015e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
    
        if (r9 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
    
        if (r9 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        r9 = r1 & 73;
        r10 = (~r9) & (r1 | 73);
        r9 = -(-(r9 << 1));
        r1 = (r10 ^ r9) + ((r9 & r10) << 1);
        ivas.gov.bisp.enumeration.aM.J.a = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
    
        if ((r1 % 2) != 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(android.view.View r9, boolean r10) {
        /*
            Method dump skipped, instruction units count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.aM.J.k(android.view.View, boolean):void");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x007e  */
    /* JADX WARN: Code duplicated, block: B:13:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:15:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:16:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:44:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:46:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:48:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:49:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:52:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:54:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:57:0x01fa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:60:0x020b  */
    /* JADX WARN: Code duplicated, block: B:66:0x0253  */
    /* JADX WARN: Code duplicated, block: B:69:0x0274  */
    /* JADX WARN: Code duplicated, block: B:71:0x0283 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x0285  */
    /* JADX WARN: Code duplicated, block: B:86:0x0210 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0214 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0214 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x02e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x02cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x02bd A[SYNTHETIC] */
    public String I(String str) {
        StringBuilder sbB;
        long j;
        int i;
        int i2;
        String strR;
        ArrayList<Integer> arrayList;
        int i3;
        int i4;
        StringBuilder sbW;
        View view;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        StringBuilder sbB2;
        int i11 = 2 % 2;
        int i12 = b;
        int i13 = i12 & 95;
        int i14 = ((i12 ^ 95) | i13) << 1;
        int i15 = -((i12 | 95) & (~i13));
        int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
        a = i16 % 128;
        int i17 = i16 % 2;
        StringBuilder sbW2 = j.w(str);
        sbW2.append(getClass().getSimpleName());
        int i18 = b;
        int i19 = ((i18 | 119) << 1) - (i18 ^ 119);
        a = i19 % 128;
        Object obj = null;
        if (i19 % 2 != 0) {
            sbW2.append("@");
            Integer.toHexString(hashCode());
            throw null;
        }
        sbW2.append("@");
        String hexString = Integer.toHexString(hashCode());
        int i20 = b + 2;
        int i21 = (i20 ^ (-1)) + (i20 << 1);
        a = i21 % 128;
        int i22 = i21 % 2;
        sbW2.append(hexString);
        sbW2.append(": ");
        String string = sbW2.toString();
        int i23 = a + 107;
        int i24 = i23 % 128;
        b = i24;
        int i25 = i23 % 2;
        int i26 = 0;
        long j2 = this.i;
        if (i25 == 0) {
            int i27 = 28 / 0;
            if (j2 != -1) {
                int i28 = ((i24 ^ 54) + ((i24 & 54) << 1)) - 1;
                a = i28 % 128;
                int i29 = i28 % 2;
                sbB = ivas.gov.bisp.enumeration.p003ac.P.b(string, "dur(");
                j = this.i;
                int i30 = a;
                int i31 = i30 & 69;
                int i32 = -(-((i30 ^ 69) | i31));
                i = (i31 & i32) + (i32 | i31);
                b = i % 128;
                if (i % 2 != 0) {
                    sbB.append(j);
                    sbB.append(") ");
                    obj.hashCode();
                    throw null;
                }
                sbB.append(j);
                sbB.append(") ");
                int i33 = a;
                int i34 = (i33 ^ 52) + ((i33 & 52) << 1);
                int i35 = (i34 ^ (-1)) + (i34 << 1);
                b = i35 % 128;
                int i36 = i35 % 2;
                string = sbB.toString();
                i2 = b + 27;
                a = i2 % 128;
                if (i2 % 2 != 0) {
                    int i37 = 2 / 2;
                }
            }
        } else if (j2 != -1) {
            int i210 = ((i24 ^ 54) + ((i24 & 54) << 1)) - 1;
            a = i210 % 128;
            int i211 = i210 % 2;
            sbB = ivas.gov.bisp.enumeration.p003ac.P.b(string, "dur(");
            j = this.i;
            int i38 = a;
            int i39 = i38 & 69;
            int i310 = -(-((i38 ^ 69) | i39));
            i = (i39 & i310) + (i310 | i39);
            b = i % 128;
            if (i % 2 != 0) {
                sbB.append(j);
                sbB.append(") ");
                obj.hashCode();
                throw null;
            }
            sbB.append(j);
            sbB.append(") ");
            int i311 = a;
            int i312 = (i311 ^ 52) + ((i311 & 52) << 1);
            int i313 = (i312 ^ (-1)) + (i312 << 1);
            b = i313 % 128;
            int i314 = i313 % 2;
            string = sbB.toString();
            i2 = b + 27;
            a = i2 % 128;
            if (i2 % 2 != 0) {
                int i315 = 2 / 2;
            }
        }
        if (this.h != -1) {
            int i40 = b;
            int i41 = (i40 ^ 59) + ((i40 & 59) << 1);
            a = i41 % 128;
            if (i41 % 2 != 0) {
                sbB2 = ivas.gov.bisp.enumeration.p003ac.P.b(string, "dly(");
                sbB2.append(this.h);
                int i42 = 95 / 0;
            } else {
                sbB2 = ivas.gov.bisp.enumeration.p003ac.P.b(string, "dly(");
                sbB2.append(this.h);
            }
            int i43 = b;
            int i44 = (i43 & (-88)) | ((~i43) & 87);
            int i45 = (i43 & 87) << 1;
            int i46 = (i44 & i45) + (i45 | i44);
            a = i46 % 128;
            int i47 = i46 % 2;
            sbB2.append(") ");
            string = sbB2.toString();
            int i48 = b;
            int i49 = ((i48 | 3) << 1) - (i48 ^ 3);
            a = i49 % 128;
            int i50 = i49 % 2;
        }
        if (this.k != null) {
            int i51 = b;
            int i52 = ((i51 | 57) << 1) - (i51 ^ 57);
            a = i52 % 128;
            if (i52 % 2 != 0) {
                ivas.gov.bisp.enumeration.p003ac.P.b(string, "interp(");
                obj.hashCode();
                throw null;
            }
            StringBuilder sbB3 = ivas.gov.bisp.enumeration.p003ac.P.b(string, "interp(");
            TimeInterpolator timeInterpolator = this.k;
            int i53 = b;
            int i54 = i53 & 31;
            int i55 = (i53 ^ 31) | i54;
            int i56 = (i54 ^ i55) + ((i55 & i54) << 1);
            a = i56 % 128;
            if (i56 % 2 != 0) {
                sbB3.append(timeInterpolator);
                sbB3.append(") ");
                obj.hashCode();
                throw null;
            }
            sbB3.append(timeInterpolator);
            sbB3.append(") ");
            int i57 = b;
            int i58 = i57 & 35;
            int i59 = (i57 ^ 35) | i58;
            int i60 = (i58 & i59) + (i59 | i58);
            a = i60 % 128;
            if (i60 % 2 != 0) {
                sbB3.toString();
                obj.hashCode();
                throw null;
            }
            string = sbB3.toString();
        }
        if (this.j.size() <= 0) {
            int i61 = b + 5;
            a = i61 % 128;
            int i62 = i61 % 2;
            if (this.l.size() > 0) {
                strR = j.r(string, "tgts(");
                arrayList = this.j;
                int i63 = a;
                int i64 = (i63 & 39) + (i63 | 39);
                b = i64 % 128;
                int i65 = i64 % 2;
                if (arrayList.size() > 0) {
                    int i66 = a;
                    i6 = (i66 & 17) + (i66 | 17);
                    b = i6 % 128;
                    if (i6 % 2 == 0) {
                        i7 = 1;
                    } else {
                        i7 = 0;
                    }
                    while (i7 < this.j.size()) {
                        int i67 = a;
                        i8 = (-2) - ((((i67 | 12) << 1) - (i67 ^ 12)) ^ (-1));
                        i9 = i8 % 128;
                        b = i9;
                        if (i8 % 2 == 0) {
                            int i68 = 65 / 0;
                            if (i7 > 0) {
                                i10 = (((i9 | 80) << 1) - (i9 ^ 80)) - 1;
                                a = i10 % 128;
                                if (i10 % 2 == 0) {
                                    j.r(strR, ", ");
                                    throw null;
                                }
                                strR = j.r(strR, ", ");
                            } else {
                                continue;
                            }
                        } else if (i7 > 0) {
                            i10 = (((i9 | 80) << 1) - (i9 ^ 80)) - 1;
                            a = i10 % 128;
                            if (i10 % 2 == 0) {
                                j.r(strR, ", ");
                                throw null;
                            }
                            strR = j.r(strR, ", ");
                        } else {
                            continue;
                        }
                        StringBuilder sbW3 = j.w(strR);
                        Integer num = this.j.get(i7);
                        int i69 = b;
                        int i70 = i69 & 79;
                        int i71 = (i70 - (~((i69 ^ 79) | i70))) - 1;
                        a = i71 % 128;
                        int i72 = i71 % 2;
                        sbW3.append(num);
                        strR = sbW3.toString();
                        int i73 = i7 - 14;
                        int i74 = i73 & 15;
                        i7 = (i74 - (~(-(-((i73 ^ 15) | i74))))) - 1;
                        int i75 = a + 99;
                        b = i75 % 128;
                        int i76 = i75 % 2;
                    }
                }
                if (this.l.size() > 0) {
                    int i77 = b;
                    int i78 = i77 + 115;
                    a = i78 % 128;
                    int i79 = i78 % 2;
                    int i80 = (i77 | 49) << 1;
                    int i81 = -(i77 ^ 49);
                    int i82 = (i80 ^ i81) + ((i81 & i80) << 1);
                    a = i82 % 128;
                    int i83 = i82 % 2;
                    while (i26 < this.l.size()) {
                        int i84 = a;
                        i3 = (i84 ^ 37) + ((i84 & 37) << 1);
                        i4 = i3 % 128;
                        b = i4;
                        if (i3 % 2 != 0) {
                            throw null;
                        }
                        if (i26 > 0) {
                            int i85 = i4 & 11;
                            int i86 = (i85 - (~((i4 ^ 11) | i85))) - 1;
                            a = i86 % 128;
                            int i87 = i86 % 2;
                            strR = j.r(strR, ", ");
                            int i88 = a + 41;
                            b = i88 % 128;
                            int i89 = i88 % 2;
                        }
                        sbW = j.w(strR);
                        view = this.l.get(i26);
                        int i90 = b;
                        int i91 = i90 ^ 19;
                        int i92 = ((i90 & 19) | i91) << 1;
                        int i93 = -i91;
                        i5 = (i92 & i93) + (i92 | i93);
                        a = i5 % 128;
                        if (i5 % 2 != 0) {
                            sbW.append(view);
                            strR = sbW.toString();
                            i26 = (-89) - ((i26 + 160) ^ (-1));
                        } else {
                            sbW.append(view);
                            strR = sbW.toString();
                            int i94 = (i26 | 1) << 1;
                            int i95 = -((i26 & (-2)) | ((~i26) & 1));
                            i26 = (i94 & i95) + (i94 | i95);
                        }
                    }
                }
                string = j.r(strR, ")");
                int i96 = a;
                int i97 = i96 & 117;
                int i98 = (i97 - (~((i96 ^ 117) | i97))) - 1;
                b = i98 % 128;
                int i99 = i98 % 2;
            }
        } else {
            strR = j.r(string, "tgts(");
            arrayList = this.j;
            int i610 = a;
            int i611 = (i610 & 39) + (i610 | 39);
            b = i611 % 128;
            int i612 = i611 % 2;
            if (arrayList.size() > 0) {
                int i613 = a;
                i6 = (i613 & 17) + (i613 | 17);
                b = i6 % 128;
                if (i6 % 2 == 0) {
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                while (i7 < this.j.size()) {
                    int i614 = a;
                    i8 = (-2) - ((((i614 | 12) << 1) - (i614 ^ 12)) ^ (-1));
                    i9 = i8 % 128;
                    b = i9;
                    if (i8 % 2 == 0) {
                        int i615 = 65 / 0;
                        if (i7 > 0) {
                            i10 = (((i9 | 80) << 1) - (i9 ^ 80)) - 1;
                            a = i10 % 128;
                            if (i10 % 2 == 0) {
                                j.r(strR, ", ");
                                throw null;
                            }
                            strR = j.r(strR, ", ");
                        } else {
                            continue;
                        }
                    } else if (i7 > 0) {
                        i10 = (((i9 | 80) << 1) - (i9 ^ 80)) - 1;
                        a = i10 % 128;
                        if (i10 % 2 == 0) {
                            j.r(strR, ", ");
                            throw null;
                        }
                        strR = j.r(strR, ", ");
                    } else {
                        continue;
                    }
                    StringBuilder sbW4 = j.w(strR);
                    Integer num2 = this.j.get(i7);
                    int i616 = b;
                    int i710 = i616 & 79;
                    int i711 = (i710 - (~((i616 ^ 79) | i710))) - 1;
                    a = i711 % 128;
                    int i712 = i711 % 2;
                    sbW4.append(num2);
                    strR = sbW4.toString();
                    int i713 = i7 - 14;
                    int i714 = i713 & 15;
                    i7 = (i714 - (~(-(-((i713 ^ 15) | i714))))) - 1;
                    int i715 = a + 99;
                    b = i715 % 128;
                    int i716 = i715 % 2;
                }
            }
            if (this.l.size() > 0) {
                int i717 = b;
                int i718 = i717 + 115;
                a = i718 % 128;
                int i719 = i718 % 2;
                int i810 = (i717 | 49) << 1;
                int i811 = -(i717 ^ 49);
                int i812 = (i810 ^ i811) + ((i811 & i810) << 1);
                a = i812 % 128;
                int i813 = i812 % 2;
                while (i26 < this.l.size()) {
                    int i814 = a;
                    i3 = (i814 ^ 37) + ((i814 & 37) << 1);
                    i4 = i3 % 128;
                    b = i4;
                    if (i3 % 2 != 0) {
                        throw null;
                    }
                    if (i26 > 0) {
                        int i815 = i4 & 11;
                        int i816 = (i815 - (~((i4 ^ 11) | i815))) - 1;
                        a = i816 % 128;
                        int i817 = i816 % 2;
                        strR = j.r(strR, ", ");
                        int i818 = a + 41;
                        b = i818 % 128;
                        int i819 = i818 % 2;
                    }
                    sbW = j.w(strR);
                    view = this.l.get(i26);
                    int i910 = b;
                    int i911 = i910 ^ 19;
                    int i912 = ((i910 & 19) | i911) << 1;
                    int i913 = -i911;
                    i5 = (i912 & i913) + (i912 | i913);
                    a = i5 % 128;
                    if (i5 % 2 != 0) {
                        sbW.append(view);
                        strR = sbW.toString();
                        i26 = (-89) - ((i26 + 160) ^ (-1));
                    } else {
                        sbW.append(view);
                        strR = sbW.toString();
                        int i914 = (i26 | 1) << 1;
                        int i915 = -((i26 & (-2)) | ((~i26) & 1));
                        i26 = (i914 & i915) + (i914 | i915);
                    }
                }
            }
            string = j.r(strR, ")");
            int i916 = a;
            int i917 = i916 & 117;
            int i918 = (i917 - (~((i916 ^ 117) | i917))) - 1;
            b = i918 % 128;
            int i919 = i918 % 2;
        }
        int i100 = a + 57;
        b = i100 % 128;
        if (i100 % 2 != 0) {
            return string;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:22:0x00d8  */
    public static void c(e eVar, View view, T t) {
        boolean z;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-36)) | ((~i2) & 35);
        int i4 = -(-((i2 & 35) << 1));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            ((r) eVar.c).put(view, t);
            int i6 = 15 / 0;
        } else {
            ((r) eVar.c).put(view, t);
        }
        int id = view.getId();
        Object obj = null;
        if (id >= 0) {
            int i7 = b;
            int i8 = i7 & 41;
            int i9 = (i7 | 41) & (~i8);
            int i10 = i8 << 1;
            int i11 = (i9 & i10) + (i9 | i10);
            a = i11 % 128;
            int i12 = i11 % 2;
            if (((SparseArray) eVar.d).indexOfKey(id) >= 0) {
                int i13 = b;
                int i14 = (i13 ^ 95) + ((i13 & 95) << 1);
                a = i14 % 128;
                int i15 = i14 % 2;
                ((SparseArray) eVar.d).put(id, null);
                int i16 = a;
                int i17 = i16 & 85;
                int i18 = -(-((i16 ^ 85) | i17));
                int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
                b = i19 % 128;
                int i20 = i19 % 2;
            } else {
                ((SparseArray) eVar.d).put(id, view);
                int i21 = b;
                int i22 = i21 & 117;
                int i23 = (i22 - (~(-(-((i21 ^ 117) | i22))))) - 1;
                a = i23 % 128;
                int i24 = i23 % 2;
            }
        }
        WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = ivas.gov.bisp.enumeration.p081d.T.c;
        String strL = ivas.gov.bisp.enumeration.d.T.aXb.l(view);
        if (strL != null) {
            int i25 = a;
            int i26 = (i25 | 77) << 1;
            int i27 = -(i25 ^ 77);
            int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
            b = i28 % 128;
            if (i28 % 2 == 0) {
                int i29 = 49 / 0;
                if (((r) eVar.f).i(strL) >= 0) {
                    int i30 = b;
                    int i31 = i30 & 51;
                    int i32 = (i31 - (~((i30 ^ 51) | i31))) - 1;
                    a = i32 % 128;
                    int i33 = i32 % 2;
                    z = true;
                } else {
                    int i34 = b;
                    int i35 = i34 & 67;
                    int i36 = ((i34 ^ 67) | i35) << 1;
                    int i37 = -((i34 | 67) & (~i35));
                    int i38 = ((i36 | i37) << 1) - (i37 ^ i36);
                    a = i38 % 128;
                    int i39 = i38 % 2;
                    z = false;
                }
            } else if (((r) eVar.f).i(strL) >= 0) {
                int i310 = b;
                int i311 = i310 & 51;
                int i312 = (i311 - (~((i310 ^ 51) | i311))) - 1;
                a = i312 % 128;
                int i313 = i312 % 2;
                z = true;
            } else {
                int i314 = b;
                int i315 = i314 & 67;
                int i316 = ((i314 ^ 67) | i315) << 1;
                int i317 = -((i314 | 67) & (~i315));
                int i318 = ((i316 | i317) << 1) - (i317 ^ i316);
                a = i318 % 128;
                int i319 = i318 % 2;
                z = false;
            }
            if (z) {
                int i40 = a;
                int i41 = (i40 & 31) + (i40 | 31);
                b = i41 % 128;
                if (i41 % 2 == 0) {
                    ((r) eVar.f).put(strL, null);
                    int i42 = 45 / 0;
                } else {
                    ((r) eVar.f).put(strL, null);
                }
                int i43 = a + 49;
                b = i43 % 128;
                int i44 = i43 % 2;
            } else {
                ((r) eVar.f).put(strL, view);
                int i45 = a;
                int i46 = ((i45 | 77) << 1) - (i45 ^ 77);
                b = i46 % 128;
                int i47 = i46 % 2;
            }
        }
        if (view.getParent() instanceof ListView) {
            int i48 = b;
            int i49 = i48 & 111;
            int i50 = -(-((i48 ^ 111) | i49));
            int i51 = (i49 ^ i50) + ((i50 & i49) << 1);
            a = i51 % 128;
            int i52 = i51 % 2;
            ListView listView = (ListView) view.getParent();
            ListAdapter adapter = listView.getAdapter();
            int i53 = a;
            int i54 = (i53 ^ 109) + ((i53 & 109) << 1);
            b = i54 % 128;
            int i55 = i54 % 2;
            if (adapter.hasStableIds()) {
                int i56 = a;
                int i57 = (-2) - ((((i56 | 90) << 1) - (i56 ^ 90)) ^ (-1));
                b = i57 % 128;
                if (i57 % 2 == 0) {
                    listView.getItemIdAtPosition(listView.getPositionForView(view));
                    obj.hashCode();
                    throw null;
                }
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                C0083p c0083p = (C0083p) eVar.e;
                if (c0083p.d) {
                    int i58 = a;
                    int i59 = ((i58 ^ 10) + ((i58 & 10) << 1)) - 1;
                    b = i59 % 128;
                    if (i59 % 2 == 0) {
                        c0083p.g();
                        obj.hashCode();
                        throw null;
                    }
                    c0083p.g();
                    int i60 = b;
                    int i61 = i60 ^ 43;
                    int i62 = -(-((i60 & 43) << 1));
                    int i63 = (i61 ^ i62) + ((i62 & i61) << 1);
                    a = i63 % 128;
                    int i64 = i63 % 2;
                }
                if (ivas.gov.bisp.enumeration.p006af.h.f(c0083p.e, c0083p.g, itemIdAtPosition) >= 0) {
                    int i65 = b;
                    int i66 = i65 & 65;
                    int i67 = (((i65 ^ 65) | i66) << 1) - ((i65 | 65) & (~i66));
                    a = i67 % 128;
                    int i68 = i67 % 2;
                    View view2 = (View) ((C0083p) eVar.e).i(itemIdAtPosition);
                    int i69 = a;
                    int i70 = ((i69 | 19) << 1) - (i69 ^ 19);
                    b = i70 % 128;
                    int i71 = i70 % 2;
                    if (view2 != null) {
                        int i72 = i69 + 91;
                        b = i72 % 128;
                        int i73 = i72 % 2;
                        ivas.gov.bisp.enumeration.d.T.aWX.r(view2, false);
                        C0083p c0083p2 = (C0083p) eVar.e;
                        int i74 = b;
                        int i75 = ((i74 ^ 105) | (i74 & 105)) << 1;
                        int i76 = -(((~i74) & 105) | (i74 & (-106)));
                        int i77 = (i75 ^ i76) + ((i76 & i75) << 1);
                        a = i77 % 128;
                        int i78 = i77 % 2;
                        c0083p2.j(itemIdAtPosition, null);
                        int i79 = b + 77;
                        a = i79 % 128;
                        int i80 = i79 % 2;
                        return;
                    }
                } else {
                    ivas.gov.bisp.enumeration.d.T.aWX.r(view, true);
                    C0083p c0083p3 = (C0083p) eVar.e;
                    int i81 = a;
                    int i82 = i81 ^ 61;
                    int i83 = ((i81 & 61) | i82) << 1;
                    int i84 = -i82;
                    int i85 = (i83 ^ i84) + ((i83 & i84) << 1);
                    b = i85 % 128;
                    if (i85 % 2 == 0) {
                        c0083p3.j(itemIdAtPosition, view);
                        int i86 = 89 / 0;
                    } else {
                        c0083p3.j(itemIdAtPosition, view);
                    }
                }
            }
        }
        int i87 = b + 23;
        a = i87 % 128;
        if (i87 % 2 != 0) {
            throw null;
        }
    }
}
