package ivas.gov.bisp.enumeration.aM;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import ivas.gov.bisp.enumeration.OooOOoo.OooO0o;
import ivas.gov.bisp.enumeration.p001aa.C0083p;
import ivas.gov.bisp.enumeration.p001aa.r;
import ivas.gov.bisp.enumeration.p003ac.e;
import ivas.gov.bisp.enumeration.p006af.h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aM.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0073m {
    private static int a = 1;
    private static int b;
    public static J c = new P();
    public static ThreadLocal<WeakReference<OooO0o<ViewGroup, ArrayList<J>>>> d = new ThreadLocal<>();
    public static ArrayList<ViewGroup> e = new ArrayList<>();

    static {
        int i = a;
        int i2 = i & 3;
        int i3 = -(-((i ^ 3) | i2));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        b = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void b(ViewGroup viewGroup, J j) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 125;
        int i4 = -(-((i2 & 125) << 1));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            e.contains(viewGroup);
            obj.hashCode();
            throw null;
        }
        if (!e.contains(viewGroup)) {
            int i6 = a + 3;
            b = i6 % 128;
            int i7 = i6 % 2;
            WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = ivas.gov.bisp.enumeration.p081d.T.c;
            if (ivas.gov.bisp.enumeration.d.T.aXa.d(viewGroup)) {
                int i8 = a;
                int i9 = (((i8 | 12) << 1) - (i8 ^ 12)) - 1;
                b = i9 % 128;
                int i10 = i9 % 2;
                e.add(viewGroup);
                if (j == null) {
                    int i11 = b;
                    int i12 = ((i11 ^ 54) + ((i11 & 54) << 1)) - 1;
                    int i13 = i12 % 128;
                    a = i13;
                    int i14 = i12 % 2;
                    J j2 = c;
                    int i15 = i13 + 25;
                    b = i15 % 128;
                    int i16 = i15 % 2;
                    j = j2;
                }
                J jN = j.n();
                Object orDefault = c().getOrDefault(viewGroup, null);
                int i17 = a;
                int i18 = ((i17 | 27) << 1) - (i17 ^ 27);
                b = i18 % 128;
                int i19 = i18 % 2;
                ArrayList arrayList = (ArrayList) orDefault;
                if (arrayList != null) {
                    int i20 = i17 + 17;
                    b = i20 % 128;
                    if (i20 % 2 != 0) {
                        arrayList.size();
                        obj.hashCode();
                        throw null;
                    }
                    if (arrayList.size() > 0) {
                        Iterator it = arrayList.iterator();
                        int i21 = a + 6;
                        int i22 = (i21 ^ (-1)) + (i21 << 1);
                        b = i22 % 128;
                        int i23 = i22 % 2;
                        while (it.hasNext()) {
                            int i24 = a;
                            int i25 = i24 ^ 71;
                            int i26 = ((i24 & 71) | i25) << 1;
                            int i27 = -i25;
                            int i28 = (i26 & i27) + (i26 | i27);
                            b = i28 % 128;
                            if (i28 % 2 != 0) {
                                ((J) it.next()).x(viewGroup);
                                throw null;
                            }
                            ((J) it.next()).x(viewGroup);
                            int i29 = b;
                            int i30 = ((i29 | 57) << 1) - (i29 ^ 57);
                            a = i30 % 128;
                            if (i30 % 2 == 0) {
                                int i31 = 4 / 4;
                            }
                        }
                    }
                }
                if (jN != null) {
                    int i32 = b + 77;
                    a = i32 % 128;
                    int i33 = i32 % 2;
                    jN.m(viewGroup, true);
                    int i34 = (-2) - ((a + 50) ^ (-1));
                    b = i34 % 128;
                    int i35 = i34 % 2;
                }
                if (((C0074o) viewGroup.getTag(ivas.gov.bisp.enumeration.R.id.transition_current_scene)) != null) {
                    throw null;
                }
                int i36 = b;
                int i37 = ((i36 ^ 92) + ((i36 & 92) << 1)) - 1;
                a = i37 % 128;
                int i38 = i37 % 2;
                viewGroup.setTag(ivas.gov.bisp.enumeration.R.id.transition_current_scene, null);
                if (jN != null) {
                    bHG bhg = new bHG(jN, viewGroup);
                    int i39 = (-2) - ((a + 110) ^ (-1));
                    b = i39 % 128;
                    if (i39 % 2 != 0) {
                        viewGroup.addOnAttachStateChangeListener(bhg);
                        viewGroup.getViewTreeObserver().addOnPreDrawListener(bhg);
                        obj.hashCode();
                        throw null;
                    }
                    viewGroup.addOnAttachStateChangeListener(bhg);
                    viewGroup.getViewTreeObserver().addOnPreDrawListener(bhg);
                    int i40 = b;
                    int i41 = i40 ^ 75;
                    int i42 = ((i40 & 75) | i41) << 1;
                    int i43 = -i41;
                    int i44 = ((i42 | i43) << 1) - (i42 ^ i43);
                    a = i44 % 128;
                    int i45 = i44 % 2;
                    return;
                }
            }
        }
        int i46 = b;
        int i47 = i46 & 77;
        int i48 = i47 + ((i46 ^ 77) | i47);
        a = i48 % 128;
        if (i48 % 2 == 0) {
            int i49 = 59 / 0;
        }
    }

    public static OooO0o<ViewGroup, ArrayList<J>> c() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 93;
        int i4 = (i2 ^ 93) | i3;
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            d.get();
            throw null;
        }
        WeakReference<OooO0o<ViewGroup, ArrayList<J>>> weakReference = d.get();
        if (weakReference != null) {
            int i6 = b;
            int i7 = (i6 | 83) << 1;
            int i8 = -(i6 ^ 83);
            int i9 = (i7 & i8) + (i8 | i7);
            a = i9 % 128;
            if (i9 % 2 == 0) {
                weakReference.get();
                throw null;
            }
            r rVar = weakReference.get();
            if (rVar != null) {
                int i10 = a;
                int i11 = (i10 ^ 33) + ((i10 & 33) << 1);
                b = i11 % 128;
                int i12 = i11 % 2;
                return rVar;
            }
        }
        r rVar2 = new r();
        WeakReference<OooO0o<ViewGroup, ArrayList<J>>> weakReference2 = new WeakReference<>(rVar2);
        int i13 = a;
        int i14 = (-2) - (((i13 & 36) + (i13 | 36)) ^ (-1));
        b = i14 % 128;
        if (i14 % 2 != 0) {
            d.set(weakReference2);
            obj.hashCode();
            throw null;
        }
        d.set(weakReference2);
        int i15 = b;
        int i16 = i15 | 43;
        int i17 = (i16 << 1) - ((~(i15 & 43)) & i16);
        a = i17 % 128;
        if (i17 % 2 != 0) {
            return rVar2;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aM.m$bHG */
    public static class bHG implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
        private static int a = 0;
        private static int b = 1;
        public J c;
        public ViewGroup d;

        /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aM.m$bHG$bHH */
        public class bHH extends N {
            private static int a = 0;
            private static int b = 1;
            public final /* synthetic */ r c;

            public bHH(r rVar) {
                this.c = rVar;
            }

            @Override // ivas.gov.bisp.enumeration.aM.J.InterfaceC0070bHc
            public void b(J j) {
                Object obj;
                int i = 2 % 2;
                int i2 = b;
                int i3 = (((i2 | 126) << 1) - (i2 ^ 126)) - 1;
                a = i3 % 128;
                int i4 = i3 % 2;
                r rVar = this.c;
                if (i4 != 0) {
                    obj = rVar.get(bHG.this.d);
                    int i5 = 49 / 0;
                } else {
                    obj = rVar.get(bHG.this.d);
                }
                ((ArrayList) obj).remove(j);
                j.y(this);
                int i6 = b;
                int i7 = (i6 & (-4)) | ((~i6) & 3);
                int i8 = -(-((i6 & 3) << 1));
                int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
                a = i9 % 128;
                if (i9 % 2 == 0) {
                    return;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }

        public bHG(J j, ViewGroup viewGroup) {
            this.c = j;
            this.d = viewGroup;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (((i2 ^ 91) | (i2 & 91)) << 1) - (((~i2) & 91) | (i2 & (-92)));
            a = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 93 / 0;
            }
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0075  */
        /* JADX WARN: Code duplicated, block: B:14:0x007b  */
        /* JADX WARN: Code duplicated, block: B:17:0x00b2  */
        /* JADX WARN: Code duplicated, block: B:23:0x00d6 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:25:0x00ac A[SYNTHETIC] */
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            Iterator it;
            int i;
            int i2 = 2 % 2;
            int i3 = b + 41;
            a = i3 % 128;
            if (i3 % 2 != 0) {
                this.d.getViewTreeObserver().removeOnPreDrawListener(this);
                int i4 = 43 / 0;
            } else {
                this.d.getViewTreeObserver().removeOnPreDrawListener(this);
            }
            this.d.removeOnAttachStateChangeListener(this);
            ArrayList<ViewGroup> arrayList = C0073m.e;
            int i5 = b;
            int i6 = i5 & 77;
            int i7 = (i5 ^ 77) | i6;
            int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
            a = i8 % 128;
            int i9 = i8 % 2;
            arrayList.remove(this.d);
            OooO0o<ViewGroup, ArrayList<J>> oooO0oC = C0073m.c();
            int i10 = (-2) - ((b + 66) ^ (-1));
            a = i10 % 128;
            int i11 = i10 % 2;
            ArrayList arrayList2 = (ArrayList) oooO0oC.get(this.d);
            int i12 = a;
            int i13 = ((i12 & 28) + (i12 | 28)) - 1;
            b = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = 51 / 0;
                if (arrayList2 != null) {
                    if (arrayList2.size() > 0) {
                        int i15 = b;
                        int i16 = ((i15 ^ 25) | (i15 & 25)) << 1;
                        int i17 = -(((~i15) & 25) | (i15 & (-26)));
                        int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
                        a = i18 % 128;
                        int i19 = i18 % 2;
                        it = arrayList2.iterator();
                        int i20 = a;
                        int i21 = i20 & 97;
                        int i22 = -(-((i20 ^ 97) | i21));
                        int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
                        b = i23 % 128;
                        int i24 = i23 % 2;
                        while (it.hasNext()) {
                            int i25 = b;
                            int i26 = ((i25 ^ 38) + ((i25 & 38) << 1)) - 1;
                            a = i26 % 128;
                            int i27 = i26 % 2;
                            ((J) it.next()).w(this.d);
                            i = b + 63;
                            a = i % 128;
                            if (i % 2 != 0) {
                                int i28 = 2 % 4;
                            }
                        }
                    }
                }
            } else if (arrayList2 != null) {
                if (arrayList2.size() > 0) {
                    int i110 = b;
                    int i111 = ((i110 ^ 25) | (i110 & 25)) << 1;
                    int i112 = -(((~i110) & 25) | (i110 & (-26)));
                    int i113 = ((i111 | i112) << 1) - (i112 ^ i111);
                    a = i113 % 128;
                    int i114 = i113 % 2;
                    it = arrayList2.iterator();
                    int i29 = a;
                    int i210 = i29 & 97;
                    int i211 = -(-((i29 ^ 97) | i210));
                    int i212 = ((i210 | i211) << 1) - (i211 ^ i210);
                    b = i212 % 128;
                    int i213 = i212 % 2;
                    while (it.hasNext()) {
                        int i214 = b;
                        int i215 = ((i214 ^ 38) + ((i214 & 38) << 1)) - 1;
                        a = i215 % 128;
                        int i216 = i215 % 2;
                        ((J) it.next()).w(this.d);
                        i = b + 63;
                        a = i % 128;
                        if (i % 2 != 0) {
                            int i217 = 2 % 4;
                        }
                    }
                }
            }
            this.c.f(true);
            int i30 = b;
            int i31 = i30 & 81;
            int i32 = (i31 - (~(-(-((i30 ^ 81) | i31))))) - 1;
            a = i32 % 128;
            int i33 = i32 % 2;
        }

        /* JADX WARN: Code duplicated, block: B:104:0x039c  */
        /* JADX WARN: Code duplicated, block: B:106:0x03cb  */
        /* JADX WARN: Code duplicated, block: B:108:0x03da  */
        /* JADX WARN: Code duplicated, block: B:121:0x042f  */
        /* JADX WARN: Code duplicated, block: B:126:0x046a  */
        /* JADX WARN: Code duplicated, block: B:127:0x046e  */
        /* JADX WARN: Code duplicated, block: B:129:0x0473  */
        /* JADX WARN: Code duplicated, block: B:132:0x047b  */
        /* JADX WARN: Code duplicated, block: B:149:0x04eb  */
        /* JADX WARN: Code duplicated, block: B:159:0x0532  */
        /* JADX WARN: Code duplicated, block: B:162:0x054d  */
        /* JADX WARN: Code duplicated, block: B:164:0x0560  */
        /* JADX WARN: Code duplicated, block: B:171:0x05ba  */
        /* JADX WARN: Code duplicated, block: B:173:0x05c8  */
        /* JADX WARN: Code duplicated, block: B:175:0x05f4  */
        /* JADX WARN: Code duplicated, block: B:176:0x05ff  */
        /* JADX WARN: Code duplicated, block: B:17:0x00b1  */
        /* JADX WARN: Code duplicated, block: B:180:0x0628  */
        /* JADX WARN: Code duplicated, block: B:181:0x0636  */
        /* JADX WARN: Code duplicated, block: B:183:0x063e  */
        /* JADX WARN: Code duplicated, block: B:185:0x065a  */
        /* JADX WARN: Code duplicated, block: B:187:0x0670  */
        /* JADX WARN: Code duplicated, block: B:190:0x067e  */
        /* JADX WARN: Code duplicated, block: B:192:0x0687 A[PHI: r5
  0x0687: PHI (r5v10 ivas.gov.bisp.enumeration.aM.J$bHD) = (r5v9 ivas.gov.bisp.enumeration.aM.J$bHD), (r5v26 ivas.gov.bisp.enumeration.aM.J$bHD) binds: [B:191:0x0685, B:188:0x067b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:194:0x068b  */
        /* JADX WARN: Code duplicated, block: B:197:0x0694  */
        /* JADX WARN: Code duplicated, block: B:201:0x06dd  */
        /* JADX WARN: Code duplicated, block: B:203:0x06f4  */
        /* JADX WARN: Code duplicated, block: B:205:0x070b  */
        /* JADX WARN: Code duplicated, block: B:206:0x0716  */
        /* JADX WARN: Code duplicated, block: B:209:0x0729  */
        /* JADX WARN: Code duplicated, block: B:20:0x00cf A[LOOP:0: B:18:0x00c9->B:20:0x00cf, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:212:0x073c  */
        /* JADX WARN: Code duplicated, block: B:214:0x073f A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:215:0x0741  */
        /* JADX WARN: Code duplicated, block: B:219:0x0768  */
        /* JADX WARN: Code duplicated, block: B:222:0x0772  */
        /* JADX WARN: Code duplicated, block: B:224:0x07a1  */
        /* JADX WARN: Code duplicated, block: B:231:0x052d A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:232:0x0272 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:238:0x043b A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:240:0x0506 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:243:0x0516 A[EDGE_INSN: B:243:0x0516->B:155:0x0516 BREAK  A[LOOP:5: B:130:0x0477->B:265:0x0477], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:24:0x010c  */
        /* JADX WARN: Code duplicated, block: B:268:0x059c A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:26:0x0111  */
        /* JADX WARN: Code duplicated, block: B:271:0x057e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:274:0x0605 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:276:0x0731 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:28:0x0114 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:29:0x0116  */
        /* JADX WARN: Code duplicated, block: B:37:0x014b  */
        /* JADX WARN: Code duplicated, block: B:39:0x015a  */
        /* JADX WARN: Code duplicated, block: B:41:0x0162  */
        /* JADX WARN: Code duplicated, block: B:62:0x022f  */
        /* JADX WARN: Code duplicated, block: B:67:0x025b  */
        /* JADX WARN: Code duplicated, block: B:73:0x0291  */
        /* JADX WARN: Code duplicated, block: B:75:0x02c6  */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            ArrayList arrayList;
            int i;
            J j;
            ViewGroup viewGroup;
            e eVar;
            e eVar2;
            r rVar;
            r rVar2;
            int i2;
            int[] iArr;
            int i3;
            int i4;
            OooO0o<Animator, J.bHD> oooO0oD;
            int i5;
            int i6;
            int i7;
            WindowId windowId;
            int i8;
            Animator animator;
            int i9;
            J.bHD bhd;
            W w;
            View view;
            T tU;
            T tQ;
            int i10;
            int i11;
            r rVar3;
            int i12;
            T t;
            int i13;
            T t2;
            int i14;
            int i15;
            char c;
            int i16;
            View view2;
            ArrayList<T> arrayList2;
            int i17;
            r rVar4;
            int i18;
            int i19;
            View view3;
            int i20;
            char c2;
            View view4;
            T t3;
            T t4;
            int i21;
            SparseArray sparseArray;
            int size;
            int i22;
            View view5;
            int i23;
            int i24;
            C0083p c0083p;
            C0083p c0083p2;
            int iK;
            int i25;
            int i26;
            View view6;
            C0083p c0083p3;
            int i27;
            Iterator it;
            int i28 = 2;
            int i29 = 2 % 2;
            int i30 = a;
            int i31 = 1;
            int i32 = (i30 ^ 25) + ((i30 & 25) << 1);
            b = i32 % 128;
            if (i32 % 2 == 0) {
                this.d.getViewTreeObserver().removeOnPreDrawListener(this);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            this.d.getViewTreeObserver().removeOnPreDrawListener(this);
            this.d.removeOnAttachStateChangeListener(this);
            char c3 = 23;
            if (!C0073m.e.remove(this.d)) {
                int i33 = b;
                int i34 = ((i33 ^ 23) | (i33 & 23)) << 1;
                int i35 = -(((~i33) & 23) | (i33 & (-24)));
                int i36 = (i34 ^ i35) + ((i35 & i34) << 1);
                a = i36 % 128;
                int i37 = i36 % 2;
                return true;
            }
            OooO0o<ViewGroup, ArrayList<J>> oooO0oC = C0073m.c();
            ArrayList arrayList3 = (ArrayList) oooO0oC.get(this.d);
            int i38 = a;
            int i39 = i38 ^ 107;
            int i40 = (i38 & 107) << 1;
            int i41 = (i39 & i40) + (i40 | i39);
            b = i41 % 128;
            int i42 = i41 % 2;
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                oooO0oC.put(this.d, arrayList3);
                int i43 = a;
                int i44 = (i43 ^ 58) + ((i43 & 58) << 1);
                int i45 = (i44 ^ (-1)) + (i44 << 1);
                b = i45 % 128;
                int i46 = i45 % 2;
            } else {
                arrayList = arrayList3.size() > 0 ? new ArrayList(arrayList3) : null;
                arrayList3.add(this.c);
                this.c.g(new bHH(oooO0oC));
                i = 0;
                this.c.m(this.d, false);
                if (arrayList != null) {
                    int i47 = a;
                    int i48 = (i47 & (-34)) | ((~i47) & 33);
                    int i49 = (i47 & 33) << 1;
                    int i50 = (i48 & i49) + (i49 | i48);
                    b = i50 % 128;
                    int i51 = i50 % 2;
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((J) it.next()).w(this.d);
                    }
                }
                j = this.c;
                viewGroup = this.d;
                Objects.requireNonNull(j);
                j.p = new ArrayList<>();
                j.r = new ArrayList<>();
                eVar = j.m;
                eVar2 = j.f;
                rVar = new r((r) eVar.c);
                rVar2 = new r((r) eVar2.c);
                i2 = 0;
                while (true) {
                    iArr = j.f61o;
                    if (i2 < iArr.length) {
                        i3 = 0;
                        while (i3 < rVar.i) {
                            int i52 = b + 47;
                            a = i52 % 128;
                            int i53 = i52 % 2;
                            t2 = (T) rVar.n(i3);
                            if (!j.v(t2.d)) {
                                int i54 = b;
                                int i55 = i54 & 1;
                                int i56 = (i54 ^ 1) | i55;
                                i14 = (i55 ^ i56) + ((i56 & i55) << 1);
                                a = i14 % 128;
                                if (i14 % 2 == 0) {
                                    j.p.add(t2);
                                    throw null;
                                }
                                j.p.add(t2);
                                j.r.add(null);
                                int i57 = a;
                                int i58 = ((i57 & (-94)) | ((~i57) & 93)) + ((i57 & 93) << 1);
                                b = i58 % 128;
                                int i59 = i58 % 2;
                            }
                            int i60 = ((i3 ^ 51) - (~((i3 & 51) << 1))) - 1;
                            int i61 = ((i60 ^ (-50)) | (i60 & (-50))) << 1;
                            int i62 = -(((~i60) & (-50)) | (i60 & 49));
                            i3 = ((i61 | i62) << 1) - (i61 ^ i62);
                        }
                        int i63 = a;
                        int i64 = i63 & 13;
                        int i65 = i63 | 13;
                        int i66 = ((i64 | i65) << 1) - (i65 ^ i64);
                        b = i66 % 128;
                        int i67 = i66 % 2;
                        for (i4 = 0; i4 < rVar2.i; i4 = ((i4 | 1) << 1) - (i4 ^ 1)) {
                            t = (T) rVar2.n(i4);
                            if (j.v(t.d)) {
                                int i68 = b + 61;
                                a = i68 % 128;
                                int i69 = i68 % 2;
                                j.r.add(t);
                                int i70 = b;
                                int i71 = ((i70 ^ 9) | (i70 & 9)) << 1;
                                int i72 = -(((~i70) & 9) | (i70 & (-10)));
                                i13 = (i71 ^ i72) + ((i72 & i71) << 1);
                                a = i13 % 128;
                                if (i13 % 2 != 0) {
                                    j.p.add(null);
                                    int i73 = 66 / 0;
                                } else {
                                    j.p.add(null);
                                }
                            }
                        }
                        oooO0oD = J.d();
                        i5 = oooO0oD.i;
                        h hVar = L.c;
                        int i74 = b;
                        i6 = 1;
                        i7 = ((i74 ^ 58) + ((i74 & 58) << 1)) - 1;
                        a = i7 % 128;
                        if (i7 % 2 != 0) {
                            windowId = viewGroup.getWindowId();
                            int i75 = i5 ^ 14;
                            int i76 = (i5 & 14) << 1;
                            i8 = (i75 & i76) + (i76 | i75);
                        } else {
                            windowId = viewGroup.getWindowId();
                            i8 = i5 - 1;
                        }
                        while (i8 >= 0) {
                            int i77 = a;
                            int i78 = i77 ^ 13;
                            int i79 = ((i77 & 13) | i78) << i6;
                            int i80 = -i78;
                            int i81 = (i79 ^ i80) + ((i79 & i80) << i6);
                            b = i81 % 128;
                            int i82 = i81 % 2;
                            animator = (Animator) oooO0oD.k(i8);
                            if (animator != null) {
                                int i83 = a;
                                int i84 = i83 & 101;
                                int i85 = -(-(i83 | 101));
                                i9 = (i84 ^ i85) + ((i85 & i84) << 1);
                                b = i9 % 128;
                                if (i9 % 2 == 0) {
                                    bhd = (J.bHD) oooO0oD.getOrDefault(animator, null);
                                    int i86 = 16 / 0;
                                    if (bhd != null) {
                                        if (bhd.a != null) {
                                            w = bhd.d;
                                            if ((w instanceof y) && ((y) w).c.equals(windowId)) {
                                                int i87 = b;
                                                int i88 = (i87 ^ 115) + ((i87 & 115) << 1);
                                                a = i88 % 128;
                                                int i89 = i88 % 2;
                                                T t5 = bhd.c;
                                                view = bhd.a;
                                                int i90 = b;
                                                int i91 = i90 & 115;
                                                int i92 = i91 + ((i90 ^ 115) | i91);
                                                a = i92 % 128;
                                                int i93 = i92 % 2;
                                                tU = j.u(view, true);
                                                int i94 = b;
                                                int i95 = i94 & 115;
                                                int i96 = -(-((i94 ^ 115) | i95));
                                                int i97 = ((i95 | i96) << 1) - (i96 ^ i95);
                                                a = i97 % 128;
                                                int i98 = i97 % 2;
                                                tQ = j.q(view, true);
                                                if (tU == null) {
                                                    i10 = b;
                                                    int i99 = i10 & 117;
                                                    int i100 = (i10 ^ 117) | i99;
                                                    int i101 = ((i99 | i100) << 1) - (i99 ^ i100);
                                                    a = i101 % 128;
                                                    int i102 = i101 % 2;
                                                    if (tQ == null) {
                                                        int i103 = i10 & 105;
                                                        i11 = ((((i10 ^ 105) | i103) << 1) - (~(-((~i103) & (i10 | 105))))) - 1;
                                                        a = i11 % 128;
                                                        if (i11 % 2 != 0) {
                                                            rVar3 = (r) j.f.c;
                                                            int i104 = 53 / 0;
                                                        } else {
                                                            rVar3 = (r) j.f.c;
                                                        }
                                                        i12 = b + 19;
                                                        a = i12 % 128;
                                                        if (i12 % 2 == 0) {
                                                            Object obj2 = null;
                                                            obj2.hashCode();
                                                            throw null;
                                                        }
                                                        tQ = (T) rVar3.get(view);
                                                    }
                                                }
                                                if ((tU == null || tQ != null) && bhd.e.t(t5, tQ)) {
                                                    int i105 = a;
                                                    int i106 = i105 & 109;
                                                    int i107 = i106 + ((i105 ^ 109) | i106);
                                                    b = i107 % 128;
                                                    int i108 = i107 % 2;
                                                    int i109 = (i105 & 43) + (i105 | 43);
                                                    b = i109 % 128;
                                                    int i110 = i109 % 2;
                                                    if (!animator.isRunning() || animator.isStarted()) {
                                                        animator.cancel();
                                                        int i111 = b;
                                                        int i112 = i111 & 113;
                                                        int i113 = (i111 ^ 113) | i112;
                                                        int i114 = (i112 ^ i113) + ((i113 & i112) << 1);
                                                        a = i114 % 128;
                                                        int i115 = i114 % 2;
                                                    } else {
                                                        oooO0oD.remove(animator);
                                                    }
                                                } else {
                                                    int i116 = a;
                                                    int i117 = (((i116 ^ 75) | (i116 & 75)) << 1) - (((~i116) & 75) | (i116 & (-76)));
                                                    b = i117 % 128;
                                                    int i118 = i117 % 2;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    bhd = (J.bHD) oooO0oD.getOrDefault(animator, null);
                                    if (bhd != null) {
                                        if (bhd.a != null) {
                                            w = bhd.d;
                                            if (w instanceof y) {
                                                int i810 = b;
                                                int i811 = (i810 ^ 115) + ((i810 & 115) << 1);
                                                a = i811 % 128;
                                                int i812 = i811 % 2;
                                                T t6 = bhd.c;
                                                view = bhd.a;
                                                int i910 = b;
                                                int i911 = i910 & 115;
                                                int i912 = i911 + ((i910 ^ 115) | i911);
                                                a = i912 % 128;
                                                int i913 = i912 % 2;
                                                tU = j.u(view, true);
                                                int i914 = b;
                                                int i915 = i914 & 115;
                                                int i916 = -(-((i914 ^ 115) | i915));
                                                int i917 = ((i915 | i916) << 1) - (i916 ^ i915);
                                                a = i917 % 128;
                                                int i918 = i917 % 2;
                                                tQ = j.q(view, true);
                                                if (tU == null) {
                                                    i10 = b;
                                                    int i919 = i10 & 117;
                                                    int i1010 = (i10 ^ 117) | i919;
                                                    int i1011 = ((i919 | i1010) << 1) - (i919 ^ i1010);
                                                    a = i1011 % 128;
                                                    int i1012 = i1011 % 2;
                                                    if (tQ == null) {
                                                        int i1013 = i10 & 105;
                                                        i11 = ((((i10 ^ 105) | i1013) << 1) - (~(-((~i1013) & (i10 | 105))))) - 1;
                                                        a = i11 % 128;
                                                        if (i11 % 2 != 0) {
                                                            rVar3 = (r) j.f.c;
                                                            int i1014 = 53 / 0;
                                                        } else {
                                                            rVar3 = (r) j.f.c;
                                                        }
                                                        i12 = b + 19;
                                                        a = i12 % 128;
                                                        if (i12 % 2 == 0) {
                                                            Object obj3 = null;
                                                            obj3.hashCode();
                                                            throw null;
                                                        }
                                                        tQ = (T) rVar3.get(view);
                                                    }
                                                }
                                                if (tU == null) {
                                                    int i1015 = a;
                                                    int i1016 = i1015 & 109;
                                                    int i1017 = i1016 + ((i1015 ^ 109) | i1016);
                                                    b = i1017 % 128;
                                                    int i1018 = i1017 % 2;
                                                    int i1019 = (i1015 & 43) + (i1015 | 43);
                                                    b = i1019 % 128;
                                                    int i119 = i1019 % 2;
                                                    if (!animator.isRunning()) {
                                                        animator.cancel();
                                                        int i1110 = b;
                                                        int i1111 = i1110 & 113;
                                                        int i1112 = (i1110 ^ 113) | i1111;
                                                        int i1113 = (i1111 ^ i1112) + ((i1112 & i1111) << 1);
                                                        a = i1113 % 128;
                                                        int i1114 = i1113 % 2;
                                                    } else {
                                                        animator.cancel();
                                                        int i1115 = b;
                                                        int i1116 = i1115 & 113;
                                                        int i1117 = (i1115 ^ 113) | i1116;
                                                        int i1118 = (i1116 ^ i1117) + ((i1117 & i1116) << 1);
                                                        a = i1118 % 128;
                                                        int i1119 = i1118 % 2;
                                                    }
                                                } else {
                                                    int i10110 = a;
                                                    int i10111 = i10110 & 109;
                                                    int i10112 = i10111 + ((i10110 ^ 109) | i10111);
                                                    b = i10112 % 128;
                                                    int i10113 = i10112 % 2;
                                                    int i10114 = (i10110 & 43) + (i10110 | 43);
                                                    b = i10114 % 128;
                                                    int i1120 = i10114 % 2;
                                                    if (!animator.isRunning()) {
                                                        animator.cancel();
                                                        int i11110 = b;
                                                        int i11111 = i11110 & 113;
                                                        int i11112 = (i11110 ^ 113) | i11111;
                                                        int i11113 = (i11111 ^ i11112) + ((i11112 & i11111) << 1);
                                                        a = i11113 % 128;
                                                        int i11114 = i11113 % 2;
                                                    } else {
                                                        animator.cancel();
                                                        int i11115 = b;
                                                        int i11116 = i11115 & 113;
                                                        int i11117 = (i11115 ^ 113) | i11116;
                                                        int i11118 = (i11116 ^ i11117) + ((i11117 & i11116) << 1);
                                                        a = i11118 % 128;
                                                        int i11119 = i11118 % 2;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            i8--;
                            i6 = 1;
                        }
                        j.p(viewGroup, j.m, j.f, j.p, j.r);
                        j.B();
                        int i120 = b + 25;
                        a = i120 % 128;
                        int i121 = i120 % 2;
                        return true;
                    }
                    i15 = iArr[i2];
                    if (i15 != i31) {
                        c = c3;
                        i16 = rVar.i;
                        while (true) {
                            i16--;
                            if (i16 >= 0) {
                                break;
                            }
                            view2 = (View) rVar.k(i16);
                            if (view2 == null && j.v(view2)) {
                                int i122 = (-2) - ((a + 34) ^ (-1));
                                b = i122 % 128;
                                if (i122 % 2 == 0) {
                                    throw null;
                                }
                                T t7 = (T) rVar2.remove(view2);
                                if (t7 != null) {
                                    int i123 = b;
                                    int i124 = i123 & 55;
                                    int i125 = (i123 | 55) & (~i124);
                                    int i126 = i124 << 1;
                                    int i127 = ((i125 | i126) << 1) - (i125 ^ i126);
                                    a = i127 % 128;
                                    if (i127 % 2 != 0) {
                                        int i128 = 75 / 0;
                                        if (j.v(t7.d)) {
                                            j.p.add((T) rVar.l(i16));
                                            arrayList2 = j.r;
                                            int i129 = a;
                                            i17 = ((i129 & 106) + (i129 | 106)) - 1;
                                            b = i17 % 128;
                                            if (i17 % 2 != 0) {
                                                arrayList2.add(t7);
                                                throw null;
                                            }
                                            arrayList2.add(t7);
                                            int i130 = b;
                                            int i131 = (i130 & (-4)) | ((~i130) & 3);
                                            int i132 = (i130 & 3) << 1;
                                            int i133 = (i131 ^ i132) + ((i132 & i131) << 1);
                                            a = i133 % 128;
                                            int i134 = i133 % 2;
                                        }
                                    } else if (j.v(t7.d)) {
                                        j.p.add((T) rVar.l(i16));
                                        arrayList2 = j.r;
                                        int i1210 = a;
                                        i17 = ((i1210 & 106) + (i1210 | 106)) - 1;
                                        b = i17 % 128;
                                        if (i17 % 2 != 0) {
                                            arrayList2.add(t7);
                                            throw null;
                                        }
                                        arrayList2.add(t7);
                                        int i135 = b;
                                        int i136 = (i135 & (-4)) | ((~i135) & 3);
                                        int i137 = (i135 & 3) << 1;
                                        int i138 = (i136 ^ i137) + ((i137 & i136) << 1);
                                        a = i138 % 128;
                                        int i139 = i138 % 2;
                                    }
                                }
                            }
                        }
                    } else if (i15 != i28) {
                        if (i15 != 3) {
                            int i140 = b;
                            i24 = (i140 ^ 59) + ((i140 & 59) << i31);
                            a = i24 % 128;
                            if (i24 % i28 != 0 ? i15 == 4 : i15 == 4) {
                                c0083p = (C0083p) eVar.e;
                                int i141 = a;
                                int i142 = i141 ^ 27;
                                int i143 = (((i141 & 27) | i142) << i31) - i142;
                                b = i143 % 128;
                                int i144 = i143 % i28;
                                c0083p2 = (C0083p) eVar2.e;
                                iK = c0083p.k();
                                i25 = i;
                                while (i25 < iK) {
                                    i26 = (-2) - ((b + 124) ^ (-1));
                                    a = i26 % 128;
                                    if (i26 % i28 != 0) {
                                        throw null;
                                    }
                                    view6 = (View) c0083p.c(i25);
                                    if (view6 == null && j.v(view6)) {
                                        if (c0083p.d) {
                                            int i145 = b;
                                            int i146 = ((i145 ^ 123) | (i145 & 123)) << 1;
                                            int i147 = -((i145 & (-124)) | ((~i145) & 123));
                                            int i148 = (i146 & i147) + (i146 | i147);
                                            a = i148 % 128;
                                            int i149 = i148 % i28;
                                            c0083p.g();
                                        }
                                        Object objI = c0083p2.i(c0083p.e[i25]);
                                        int i150 = b;
                                        int i151 = i150 | 63;
                                        int i152 = i151 << 1;
                                        int i153 = -(i151 & (~(i150 & 63)));
                                        int i154 = (i152 ^ i153) + ((i152 & i153) << 1);
                                        a = i154 % 128;
                                        if (i154 % 2 != 0) {
                                            throw null;
                                        }
                                        View view7 = (View) objI;
                                        if (view7 != null) {
                                            int i155 = i150 | 77;
                                            int i156 = i155 << 1;
                                            int i157 = -((~(i150 & 77)) & i155);
                                            int i158 = (i156 ^ i157) + ((i156 & i157) << 1);
                                            a = i158 % 128;
                                            int i159 = i158 % 2;
                                            if (j.v(view7)) {
                                                int i160 = b;
                                                int i161 = i160 & 19;
                                                int i162 = (i160 | 19) & (~i161);
                                                int i163 = -(-(i161 << 1));
                                                int i164 = (i162 ^ i163) + ((i162 & i163) << 1);
                                                a = i164 % 128;
                                                if (i164 % 2 != 0) {
                                                    Object obj4 = null;
                                                    obj4.hashCode();
                                                    throw null;
                                                }
                                                T t8 = (T) rVar.getOrDefault(view6, null);
                                                T t9 = (T) rVar2.getOrDefault(view7, null);
                                                if (t8 != null) {
                                                    int i165 = b;
                                                    int i166 = i165 & 111;
                                                    c0083p3 = c0083p2;
                                                    int i167 = -(-((i165 ^ 111) | i166));
                                                    int i168 = ((i166 | i167) << 1) - (i166 ^ i167);
                                                    i27 = iK;
                                                    a = i168 % 128;
                                                    if (i168 % 2 != 0) {
                                                        int i169 = 19 / 0;
                                                        if (t9 != null) {
                                                            j.p.add(t8);
                                                            j.r.add(t9);
                                                            rVar.remove(view6);
                                                            rVar2.remove(view7);
                                                            int i170 = a + 109;
                                                            b = i170 % 128;
                                                            int i171 = i170 % 2;
                                                        }
                                                    } else if (t9 != null) {
                                                        j.p.add(t8);
                                                        j.r.add(t9);
                                                        rVar.remove(view6);
                                                        rVar2.remove(view7);
                                                        int i172 = a + 109;
                                                        b = i172 % 128;
                                                        int i173 = i172 % 2;
                                                    }
                                                } else {
                                                    c0083p3 = c0083p2;
                                                    i27 = iK;
                                                }
                                            } else {
                                                c0083p3 = c0083p2;
                                                i27 = iK;
                                            }
                                        } else {
                                            c0083p3 = c0083p2;
                                            i27 = iK;
                                        }
                                    } else {
                                        c0083p3 = c0083p2;
                                        i27 = iK;
                                    }
                                    int i174 = i25 + 16;
                                    i25 = (i174 ^ (-15)) + ((i174 & (-15)) << 1);
                                    iK = i27;
                                    c0083p2 = c0083p3;
                                    i28 = 2;
                                }
                            }
                            int i175 = b;
                            int i176 = i175 ^ 21;
                            int i177 = ((((i175 & 21) | i176) << 1) - (~(-i176))) - 1;
                            a = i177 % 128;
                            int i178 = i177 % 2;
                        } else {
                            sparseArray = (SparseArray) eVar.d;
                            int i179 = (-2) - ((b + 88) ^ (-1));
                            a = i179 % 128;
                            int i180 = i179 % 2;
                            SparseArray sparseArray2 = (SparseArray) eVar2.d;
                            int i181 = b;
                            int i182 = ((i181 | 91) << 1) - (i181 ^ 91);
                            a = i182 % 128;
                            int i183 = i182 % 2;
                            size = sparseArray.size();
                            int i184 = a + 55;
                            b = i184 % 128;
                            int i185 = i184 % 2;
                            i22 = 0;
                            while (i22 < size) {
                                view5 = (View) sparseArray.valueAt(i22);
                                if (view5 == null && j.v(view5)) {
                                    int i186 = a;
                                    int i187 = i186 & 23;
                                    int i188 = -(-(i186 | 23));
                                    int i189 = (i187 ^ i188) + ((i188 & i187) << 1);
                                    b = i189 % 128;
                                    if (i189 % 2 == 0) {
                                        Object obj5 = null;
                                        sparseArray2.get(sparseArray.keyAt(i22));
                                        obj5.hashCode();
                                        throw null;
                                    }
                                    View view8 = (View) sparseArray2.get(sparseArray.keyAt(i22));
                                    if (view8 == null || (!j.v(view8))) {
                                        i23 = size;
                                    } else {
                                        T t10 = (T) rVar.getOrDefault(view5, null);
                                        int i190 = a;
                                        int i191 = (i190 | 5) << 1;
                                        int i192 = -((i190 & (-6)) | (5 & (~i190)));
                                        int i193 = (i191 & i192) + (i191 | i192);
                                        i23 = size;
                                        b = i193 % 128;
                                        if (i193 % 2 == 0) {
                                            Object obj6 = null;
                                            obj6.hashCode();
                                            throw null;
                                        }
                                        T t11 = (T) rVar2.getOrDefault(view8, null);
                                        if (t10 != null && t11 != null) {
                                            int i194 = a + 73;
                                            b = i194 % 128;
                                            if (i194 % 2 == 0) {
                                                j.p.add(t10);
                                                throw null;
                                            }
                                            j.p.add(t10);
                                            j.r.add(t11);
                                            rVar.remove(view5);
                                            int i195 = a;
                                            int i196 = (i195 & (-88)) | ((~i195) & 87);
                                            int i197 = -(-((i195 & 87) << 1));
                                            int i198 = (i196 & i197) + (i197 | i196);
                                            b = i198 % 128;
                                            if (i198 % 2 == 0) {
                                                rVar2.remove(view8);
                                                int i199 = 7 / 0;
                                            } else {
                                                rVar2.remove(view8);
                                            }
                                        }
                                    }
                                } else {
                                    i23 = size;
                                }
                                int i200 = ((i22 | 58) << 1) - (((~i22) & 58) | (i22 & (-59)));
                                i22 = ((i200 & (-57)) - (~(i200 | (-57)))) - 1;
                                int i201 = a;
                                int i202 = i201 & 43;
                                int i203 = i201 | 43;
                                int i204 = ((i202 | i203) << 1) - (i202 ^ i203);
                                b = i204 % 128;
                                int i205 = i204 % 2;
                                size = i23;
                            }
                        }
                        c = 23;
                    } else {
                        c = c3;
                        rVar4 = (r) eVar.f;
                        r rVar5 = (r) eVar2.f;
                        i18 = rVar4.i;
                        i19 = 0;
                        while (i19 < i18) {
                            view3 = (View) rVar4.n(i19);
                            if (view3 != null && j.v(view3) && (view4 = (View) rVar5.get(rVar4.k(i19))) != null && j.v(view4)) {
                                t3 = (T) rVar.getOrDefault(view3, null);
                                t4 = (T) rVar2.getOrDefault(view4, null);
                                if (t3 != null && t4 != null) {
                                    j.p.add(t3);
                                    int i206 = b;
                                    int i207 = i206 & 7;
                                    int i208 = -(-((i206 ^ 7) | i207));
                                    i21 = ((i207 | i208) << 1) - (i208 ^ i207);
                                    a = i21 % 128;
                                    if (i21 % 2 == 0) {
                                        j.r.add(t4);
                                        Object obj7 = null;
                                        obj7.hashCode();
                                        throw null;
                                    }
                                    j.r.add(t4);
                                    rVar.remove(view3);
                                    rVar2.remove(view4);
                                }
                            }
                            int i209 = i19 & 1;
                            int i210 = ((i19 ^ 1) | i209) << 1;
                            int i211 = -((i19 | 1) & (~i209));
                            i19 = (i211 | i210) + (i210 & i211);
                            int i212 = a;
                            int i213 = (i212 | 3) << 1;
                            int i214 = -(i212 ^ 3);
                            i20 = (i213 & i214) + (i214 | i213);
                            b = i20 % 128;
                            if (i20 % 2 == 0) {
                                c2 = 4;
                                int i215 = 2 % 4;
                            } else {
                                c2 = 4;
                            }
                        }
                    }
                    int i216 = i2 & (-24);
                    int i217 = i216 + ((i2 ^ (-24)) | i216) + 26;
                    i2 = (i217 ^ (-1)) + (i217 << 1);
                    c3 = c;
                    i28 = 2;
                    i31 = 1;
                    i = 0;
                }
            }
            int i218 = a + 9;
            b = i218 % 128;
            int i219 = i218 % 2;
            arrayList3.add(this.c);
            this.c.g(new bHH(oooO0oC));
            i = 0;
            this.c.m(this.d, false);
            if (arrayList != null) {
                int i410 = a;
                int i411 = (i410 & (-34)) | ((~i410) & 33);
                int i412 = (i410 & 33) << 1;
                int i510 = (i411 & i412) + (i412 | i411);
                b = i510 % 128;
                int i511 = i510 % 2;
                it = arrayList.iterator();
                while (it.hasNext()) {
                    ((J) it.next()).w(this.d);
                }
            }
            j = this.c;
            viewGroup = this.d;
            Objects.requireNonNull(j);
            j.p = new ArrayList<>();
            j.r = new ArrayList<>();
            eVar = j.m;
            eVar2 = j.f;
            rVar = new r((r) eVar.c);
            rVar2 = new r((r) eVar2.c);
            i2 = 0;
            while (true) {
                iArr = j.f61o;
                if (i2 < iArr.length) {
                    i3 = 0;
                    while (i3 < rVar.i) {
                        int i512 = b + 47;
                        a = i512 % 128;
                        int i513 = i512 % 2;
                        t2 = (T) rVar.n(i3);
                        if (!j.v(t2.d)) {
                            int i514 = b;
                            int i515 = i514 & 1;
                            int i516 = (i514 ^ 1) | i515;
                            i14 = (i515 ^ i516) + ((i516 & i515) << 1);
                            a = i14 % 128;
                            if (i14 % 2 == 0) {
                                j.p.add(t2);
                                throw null;
                            }
                            j.p.add(t2);
                            j.r.add(null);
                            int i517 = a;
                            int i518 = ((i517 & (-94)) | ((~i517) & 93)) + ((i517 & 93) << 1);
                            b = i518 % 128;
                            int i519 = i518 % 2;
                        }
                        int i610 = ((i3 ^ 51) - (~((i3 & 51) << 1))) - 1;
                        int i611 = ((i610 ^ (-50)) | (i610 & (-50))) << 1;
                        int i612 = -(((~i610) & (-50)) | (i610 & 49));
                        i3 = ((i611 | i612) << 1) - (i611 ^ i612);
                    }
                    int i613 = a;
                    int i614 = i613 & 13;
                    int i615 = i613 | 13;
                    int i616 = ((i614 | i615) << 1) - (i615 ^ i614);
                    b = i616 % 128;
                    int i617 = i616 % 2;
                    while (i4 < rVar2.i) {
                        t = (T) rVar2.n(i4);
                        if (j.v(t.d)) {
                            int i618 = b + 61;
                            a = i618 % 128;
                            int i619 = i618 % 2;
                            j.r.add(t);
                            int i710 = b;
                            int i711 = ((i710 ^ 9) | (i710 & 9)) << 1;
                            int i712 = -(((~i710) & 9) | (i710 & (-10)));
                            i13 = (i711 ^ i712) + ((i712 & i711) << 1);
                            a = i13 % 128;
                            if (i13 % 2 != 0) {
                                j.p.add(null);
                                int i713 = 66 / 0;
                            } else {
                                j.p.add(null);
                            }
                        }
                    }
                    oooO0oD = J.d();
                    i5 = oooO0oD.i;
                    h hVar2 = L.c;
                    int i714 = b;
                    i6 = 1;
                    i7 = ((i714 ^ 58) + ((i714 & 58) << 1)) - 1;
                    a = i7 % 128;
                    if (i7 % 2 != 0) {
                        windowId = viewGroup.getWindowId();
                        int i715 = i5 ^ 14;
                        int i716 = (i5 & 14) << 1;
                        i8 = (i715 & i716) + (i716 | i715);
                    } else {
                        windowId = viewGroup.getWindowId();
                        i8 = i5 - 1;
                    }
                    while (i8 >= 0) {
                        int i717 = a;
                        int i718 = i717 ^ 13;
                        int i719 = ((i717 & 13) | i718) << i6;
                        int i813 = -i718;
                        int i814 = (i719 ^ i813) + ((i719 & i813) << i6);
                        b = i814 % 128;
                        int i815 = i814 % 2;
                        animator = (Animator) oooO0oD.k(i8);
                        if (animator != null) {
                            int i816 = a;
                            int i817 = i816 & 101;
                            int i818 = -(-(i816 | 101));
                            i9 = (i817 ^ i818) + ((i818 & i817) << 1);
                            b = i9 % 128;
                            if (i9 % 2 == 0) {
                                bhd = (J.bHD) oooO0oD.getOrDefault(animator, null);
                                int i819 = 16 / 0;
                                if (bhd != null) {
                                    if (bhd.a != null) {
                                        w = bhd.d;
                                        if (w instanceof y) {
                                            int i8110 = b;
                                            int i8111 = (i8110 ^ 115) + ((i8110 & 115) << 1);
                                            a = i8111 % 128;
                                            int i8112 = i8111 % 2;
                                            T t12 = bhd.c;
                                            view = bhd.a;
                                            int i9110 = b;
                                            int i9111 = i9110 & 115;
                                            int i9112 = i9111 + ((i9110 ^ 115) | i9111);
                                            a = i9112 % 128;
                                            int i9113 = i9112 % 2;
                                            tU = j.u(view, true);
                                            int i9114 = b;
                                            int i9115 = i9114 & 115;
                                            int i9116 = -(-((i9114 ^ 115) | i9115));
                                            int i9117 = ((i9115 | i9116) << 1) - (i9116 ^ i9115);
                                            a = i9117 % 128;
                                            int i9118 = i9117 % 2;
                                            tQ = j.q(view, true);
                                            if (tU == null) {
                                                i10 = b;
                                                int i9119 = i10 & 117;
                                                int i10115 = (i10 ^ 117) | i9119;
                                                int i10116 = ((i9119 | i10115) << 1) - (i9119 ^ i10115);
                                                a = i10116 % 128;
                                                int i10117 = i10116 % 2;
                                                if (tQ == null) {
                                                    int i10118 = i10 & 105;
                                                    i11 = ((((i10 ^ 105) | i10118) << 1) - (~(-((~i10118) & (i10 | 105))))) - 1;
                                                    a = i11 % 128;
                                                    if (i11 % 2 != 0) {
                                                        rVar3 = (r) j.f.c;
                                                        int i10119 = 53 / 0;
                                                    } else {
                                                        rVar3 = (r) j.f.c;
                                                    }
                                                    i12 = b + 19;
                                                    a = i12 % 128;
                                                    if (i12 % 2 == 0) {
                                                        Object obj8 = null;
                                                        obj8.hashCode();
                                                        throw null;
                                                    }
                                                    tQ = (T) rVar3.get(view);
                                                }
                                            }
                                            if (tU == null) {
                                                int i101110 = a;
                                                int i101111 = i101110 & 109;
                                                int i101112 = i101111 + ((i101110 ^ 109) | i101111);
                                                b = i101112 % 128;
                                                int i101113 = i101112 % 2;
                                                int i101114 = (i101110 & 43) + (i101110 | 43);
                                                b = i101114 % 128;
                                                int i1121 = i101114 % 2;
                                                if (!animator.isRunning()) {
                                                    animator.cancel();
                                                    int i111110 = b;
                                                    int i111111 = i111110 & 113;
                                                    int i111112 = (i111110 ^ 113) | i111111;
                                                    int i111113 = (i111111 ^ i111112) + ((i111112 & i111111) << 1);
                                                    a = i111113 % 128;
                                                    int i111114 = i111113 % 2;
                                                } else {
                                                    animator.cancel();
                                                    int i111115 = b;
                                                    int i111116 = i111115 & 113;
                                                    int i111117 = (i111115 ^ 113) | i111116;
                                                    int i111118 = (i111116 ^ i111117) + ((i111117 & i111116) << 1);
                                                    a = i111118 % 128;
                                                    int i111119 = i111118 % 2;
                                                }
                                            } else {
                                                int i101115 = a;
                                                int i101116 = i101115 & 109;
                                                int i101117 = i101116 + ((i101115 ^ 109) | i101116);
                                                b = i101117 % 128;
                                                int i101118 = i101117 % 2;
                                                int i101119 = (i101115 & 43) + (i101115 | 43);
                                                b = i101119 % 128;
                                                int i1122 = i101119 % 2;
                                                if (!animator.isRunning()) {
                                                    animator.cancel();
                                                    int i1111110 = b;
                                                    int i1111111 = i1111110 & 113;
                                                    int i1111112 = (i1111110 ^ 113) | i1111111;
                                                    int i1111113 = (i1111111 ^ i1111112) + ((i1111112 & i1111111) << 1);
                                                    a = i1111113 % 128;
                                                    int i1111114 = i1111113 % 2;
                                                } else {
                                                    animator.cancel();
                                                    int i1111115 = b;
                                                    int i1111116 = i1111115 & 113;
                                                    int i1111117 = (i1111115 ^ 113) | i1111116;
                                                    int i1111118 = (i1111116 ^ i1111117) + ((i1111117 & i1111116) << 1);
                                                    a = i1111118 % 128;
                                                    int i1111119 = i1111118 % 2;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                bhd = (J.bHD) oooO0oD.getOrDefault(animator, null);
                                if (bhd != null) {
                                    if (bhd.a != null) {
                                        w = bhd.d;
                                        if (w instanceof y) {
                                            int i8113 = b;
                                            int i8114 = (i8113 ^ 115) + ((i8113 & 115) << 1);
                                            a = i8114 % 128;
                                            int i8115 = i8114 % 2;
                                            T t13 = bhd.c;
                                            view = bhd.a;
                                            int i91110 = b;
                                            int i91111 = i91110 & 115;
                                            int i91112 = i91111 + ((i91110 ^ 115) | i91111);
                                            a = i91112 % 128;
                                            int i91113 = i91112 % 2;
                                            tU = j.u(view, true);
                                            int i91114 = b;
                                            int i91115 = i91114 & 115;
                                            int i91116 = -(-((i91114 ^ 115) | i91115));
                                            int i91117 = ((i91115 | i91116) << 1) - (i91116 ^ i91115);
                                            a = i91117 % 128;
                                            int i91118 = i91117 % 2;
                                            tQ = j.q(view, true);
                                            if (tU == null) {
                                                i10 = b;
                                                int i91119 = i10 & 117;
                                                int i101120 = (i10 ^ 117) | i91119;
                                                int i101121 = ((i91119 | i101120) << 1) - (i91119 ^ i101120);
                                                a = i101121 % 128;
                                                int i101122 = i101121 % 2;
                                                if (tQ == null) {
                                                    int i101123 = i10 & 105;
                                                    i11 = ((((i10 ^ 105) | i101123) << 1) - (~(-((~i101123) & (i10 | 105))))) - 1;
                                                    a = i11 % 128;
                                                    if (i11 % 2 != 0) {
                                                        rVar3 = (r) j.f.c;
                                                        int i101124 = 53 / 0;
                                                    } else {
                                                        rVar3 = (r) j.f.c;
                                                    }
                                                    i12 = b + 19;
                                                    a = i12 % 128;
                                                    if (i12 % 2 == 0) {
                                                        Object obj9 = null;
                                                        obj9.hashCode();
                                                        throw null;
                                                    }
                                                    tQ = (T) rVar3.get(view);
                                                }
                                            }
                                            if (tU == null) {
                                                int i1011110 = a;
                                                int i1011111 = i1011110 & 109;
                                                int i1011112 = i1011111 + ((i1011110 ^ 109) | i1011111);
                                                b = i1011112 % 128;
                                                int i1011113 = i1011112 % 2;
                                                int i1011114 = (i1011110 & 43) + (i1011110 | 43);
                                                b = i1011114 % 128;
                                                int i1123 = i1011114 % 2;
                                                if (!animator.isRunning()) {
                                                    animator.cancel();
                                                    int i11111110 = b;
                                                    int i11111111 = i11111110 & 113;
                                                    int i11111112 = (i11111110 ^ 113) | i11111111;
                                                    int i11111113 = (i11111111 ^ i11111112) + ((i11111112 & i11111111) << 1);
                                                    a = i11111113 % 128;
                                                    int i11111114 = i11111113 % 2;
                                                } else {
                                                    animator.cancel();
                                                    int i11111115 = b;
                                                    int i11111116 = i11111115 & 113;
                                                    int i11111117 = (i11111115 ^ 113) | i11111116;
                                                    int i11111118 = (i11111116 ^ i11111117) + ((i11111117 & i11111116) << 1);
                                                    a = i11111118 % 128;
                                                    int i11111119 = i11111118 % 2;
                                                }
                                            } else {
                                                int i1011115 = a;
                                                int i1011116 = i1011115 & 109;
                                                int i1011117 = i1011116 + ((i1011115 ^ 109) | i1011116);
                                                b = i1011117 % 128;
                                                int i1011118 = i1011117 % 2;
                                                int i1011119 = (i1011115 & 43) + (i1011115 | 43);
                                                b = i1011119 % 128;
                                                int i1124 = i1011119 % 2;
                                                if (!animator.isRunning()) {
                                                    animator.cancel();
                                                    int i111111110 = b;
                                                    int i111111111 = i111111110 & 113;
                                                    int i111111112 = (i111111110 ^ 113) | i111111111;
                                                    int i111111113 = (i111111111 ^ i111111112) + ((i111111112 & i111111111) << 1);
                                                    a = i111111113 % 128;
                                                    int i111111114 = i111111113 % 2;
                                                } else {
                                                    animator.cancel();
                                                    int i111111115 = b;
                                                    int i111111116 = i111111115 & 113;
                                                    int i111111117 = (i111111115 ^ 113) | i111111116;
                                                    int i111111118 = (i111111116 ^ i111111117) + ((i111111117 & i111111116) << 1);
                                                    a = i111111118 % 128;
                                                    int i111111119 = i111111118 % 2;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i8--;
                        i6 = 1;
                    }
                    j.p(viewGroup, j.m, j.f, j.p, j.r);
                    j.B();
                    int i1211 = b + 25;
                    a = i1211 % 128;
                    int i1212 = i1211 % 2;
                    return true;
                }
                i15 = iArr[i2];
                if (i15 != i31) {
                    c = c3;
                    i16 = rVar.i;
                    while (true) {
                        i16--;
                        if (i16 >= 0) {
                            break;
                            break;
                        }
                        view2 = (View) rVar.k(i16);
                        if (view2 == null) {
                        }
                    }
                } else if (i15 != i28) {
                    if (i15 != 3) {
                        int i1410 = b;
                        i24 = (i1410 ^ 59) + ((i1410 & 59) << i31);
                        a = i24 % 128;
                        if (i24 % i28 != 0) {
                            c0083p = (C0083p) eVar.e;
                            int i1411 = a;
                            int i1412 = i1411 ^ 27;
                            int i1413 = (((i1411 & 27) | i1412) << i31) - i1412;
                            b = i1413 % 128;
                            int i1414 = i1413 % i28;
                            c0083p2 = (C0083p) eVar2.e;
                            iK = c0083p.k();
                            i25 = i;
                            while (i25 < iK) {
                                i26 = (-2) - ((b + 124) ^ (-1));
                                a = i26 % 128;
                                if (i26 % i28 != 0) {
                                    throw null;
                                }
                                view6 = (View) c0083p.c(i25);
                                if (view6 == null) {
                                    c0083p3 = c0083p2;
                                    i27 = iK;
                                } else {
                                    c0083p3 = c0083p2;
                                    i27 = iK;
                                }
                                int i1710 = i25 + 16;
                                i25 = (i1710 ^ (-15)) + ((i1710 & (-15)) << 1);
                                iK = i27;
                                c0083p2 = c0083p3;
                                i28 = 2;
                            }
                        } else {
                            c0083p = (C0083p) eVar.e;
                            int i1415 = a;
                            int i1416 = i1415 ^ 27;
                            int i1417 = (((i1415 & 27) | i1416) << i31) - i1416;
                            b = i1417 % 128;
                            int i1418 = i1417 % i28;
                            c0083p2 = (C0083p) eVar2.e;
                            iK = c0083p.k();
                            i25 = i;
                            while (i25 < iK) {
                                i26 = (-2) - ((b + 124) ^ (-1));
                                a = i26 % 128;
                                if (i26 % i28 != 0) {
                                    throw null;
                                }
                                view6 = (View) c0083p.c(i25);
                                if (view6 == null) {
                                    c0083p3 = c0083p2;
                                    i27 = iK;
                                } else {
                                    c0083p3 = c0083p2;
                                    i27 = iK;
                                }
                                int i1711 = i25 + 16;
                                i25 = (i1711 ^ (-15)) + ((i1711 & (-15)) << 1);
                                iK = i27;
                                c0083p2 = c0083p3;
                                i28 = 2;
                            }
                        }
                        int i1712 = b;
                        int i1713 = i1712 ^ 21;
                        int i1714 = ((((i1712 & 21) | i1713) << 1) - (~(-i1713))) - 1;
                        a = i1714 % 128;
                        int i1715 = i1714 % 2;
                    } else {
                        sparseArray = (SparseArray) eVar.d;
                        int i1716 = (-2) - ((b + 88) ^ (-1));
                        a = i1716 % 128;
                        int i1810 = i1716 % 2;
                        SparseArray sparseArray3 = (SparseArray) eVar2.d;
                        int i1811 = b;
                        int i1812 = ((i1811 | 91) << 1) - (i1811 ^ 91);
                        a = i1812 % 128;
                        int i1813 = i1812 % 2;
                        size = sparseArray.size();
                        int i1814 = a + 55;
                        b = i1814 % 128;
                        int i1815 = i1814 % 2;
                        i22 = 0;
                        while (i22 < size) {
                            view5 = (View) sparseArray.valueAt(i22);
                            if (view5 == null) {
                                i23 = size;
                            } else {
                                i23 = size;
                            }
                            int i2010 = ((i22 | 58) << 1) - (((~i22) & 58) | (i22 & (-59)));
                            i22 = ((i2010 & (-57)) - (~(i2010 | (-57)))) - 1;
                            int i2011 = a;
                            int i2012 = i2011 & 43;
                            int i2013 = i2011 | 43;
                            int i2014 = ((i2012 | i2013) << 1) - (i2012 ^ i2013);
                            b = i2014 % 128;
                            int i2015 = i2014 % 2;
                            size = i23;
                        }
                    }
                    c = 23;
                } else {
                    c = c3;
                    rVar4 = (r) eVar.f;
                    r rVar6 = (r) eVar2.f;
                    i18 = rVar4.i;
                    i19 = 0;
                    while (i19 < i18) {
                        view3 = (View) rVar4.n(i19);
                        if (view3 != null) {
                            t3 = (T) rVar.getOrDefault(view3, null);
                            t4 = (T) rVar2.getOrDefault(view4, null);
                            if (t3 != null) {
                                j.p.add(t3);
                                int i2016 = b;
                                int i2017 = i2016 & 7;
                                int i2018 = -(-((i2016 ^ 7) | i2017));
                                i21 = ((i2017 | i2018) << 1) - (i2018 ^ i2017);
                                a = i21 % 128;
                                if (i21 % 2 == 0) {
                                    j.r.add(t4);
                                    Object obj10 = null;
                                    obj10.hashCode();
                                    throw null;
                                }
                                j.r.add(t4);
                                rVar.remove(view3);
                                rVar2.remove(view4);
                            }
                        }
                        int i2019 = i19 & 1;
                        int i2110 = ((i19 ^ 1) | i2019) << 1;
                        int i2111 = -((i19 | 1) & (~i2019));
                        i19 = (i2111 | i2110) + (i2110 & i2111);
                        int i2112 = a;
                        int i2113 = (i2112 | 3) << 1;
                        int i2114 = -(i2112 ^ 3);
                        i20 = (i2113 & i2114) + (i2114 | i2113);
                        b = i20 % 128;
                        if (i20 % 2 == 0) {
                            c2 = 4;
                            int i2115 = 2 % 4;
                        } else {
                            c2 = 4;
                        }
                    }
                }
                int i2116 = i2 & (-24);
                int i2117 = i2116 + ((i2 ^ (-24)) | i2116) + 26;
                i2 = (i2117 ^ (-1)) + (i2117 << 1);
                c3 = c;
                i28 = 2;
                i31 = 1;
                i = 0;
            }
        }
    }
}
