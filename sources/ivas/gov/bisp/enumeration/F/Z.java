package ivas.gov.bisp.enumeration.F;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import ivas.gov.bisp.enumeration.H.c;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class Z extends K {
    private static int a = 0;
    private static int b = 1;

    public class aYH extends Transition.EpicenterCallback {
        private static int a = 1;
        private static int b;
        public final /* synthetic */ Rect c;

        public aYH(Z z, Rect rect) {
            this.c = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 9;
            int i4 = (~i3) & (i2 | 9);
            int i5 = -(-(i3 << 1));
            int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
            a = i6 % 128;
            int i7 = i6 % 2;
            Rect rect = this.c;
            int i8 = ((i2 | 33) << 1) - (i2 ^ 33);
            a = i8 % 128;
            if (i8 % 2 != 0) {
                return rect;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public class aYI implements Transition.TransitionListener {
        private static int a = 0;
        private static int b = 1;
        public final /* synthetic */ View c;
        public final /* synthetic */ ArrayList d;

        public aYI(Z z, View view, ArrayList arrayList) {
            this.c = view;
            this.d = arrayList;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 95;
            int i4 = i2 | 95;
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            a = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 85;
            int i4 = -(-(i2 | 85));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            a = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (-2) - ((((i2 | 122) << 1) - (i2 ^ 122)) ^ (-1));
            a = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 33 / 0;
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            int i = 2 % 2;
            int i2 = a + 49;
            b = i2 % 128;
            int i3 = i2 % 2;
            transition.removeListener(this);
            transition.addListener(this);
            int i4 = a;
            int i5 = (i4 & (-32)) | ((~i4) & 31);
            int i6 = (i4 & 31) << 1;
            int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
            b = i7 % 128;
            int i8 = i7 % 2;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 & 24) + (i2 | 24);
            int i4 = (i3 ^ (-1)) + (i3 << 1);
            a = i4 % 128;
            int i5 = i4 % 2;
            transition.removeListener(this);
            View view = this.c;
            int i6 = b;
            int i7 = i6 & 41;
            int i8 = (i6 | 41) & (~i7);
            int i9 = i7 << 1;
            int i10 = ((i8 | i9) << 1) - (i8 ^ i9);
            a = i10 % 128;
            int i11 = i10 % 2;
            view.setVisibility(8);
            int size = this.d.size();
            int i12 = a;
            int i13 = (((i12 & (-20)) | ((~i12) & 19)) - (~(-(-((i12 & 19) << 1))))) - 1;
            b = i13 % 128;
            if (i13 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i14 = 0;
            while (i14 < size) {
                int i15 = b;
                int i16 = i15 & 85;
                int i17 = -(-((i15 ^ 85) | i16));
                int i18 = (i16 & i17) + (i17 | i16);
                a = i18 % 128;
                int i19 = i18 % 2;
                View view2 = (View) this.d.get(i14);
                int i20 = a;
                int i21 = i20 & 11;
                int i22 = ((i20 | 11) & (~i21)) + (i21 << 1);
                b = i22 % 128;
                if (i22 % 2 == 0) {
                    view2.setVisibility(0);
                    int i23 = i14 & 50;
                    int i24 = (i14 ^ 50) | i23;
                    i14 = (i23 ^ i24) + ((i24 & i23) << 1);
                } else {
                    view2.setVisibility(0);
                    i14 = ((i14 ^ 15) + ((i14 & 15) << 1)) - 14;
                }
                int i25 = a;
                int i26 = (i25 & 41) + (i25 | 41);
                b = i26 % 128;
                int i27 = i26 % 2;
            }
            int i28 = a;
            int i29 = (i28 | 103) << 1;
            int i30 = -(((~i28) & 103) | (i28 & (-104)));
            int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
            b = i31 % 128;
            int i32 = i31 % 2;
        }
    }

    public class aYJ implements Transition.TransitionListener {
        private static int a = 0;
        private static int b = 1;
        public final /* synthetic */ Object c;
        public final /* synthetic */ ArrayList d;
        public final /* synthetic */ Object e;
        public final /* synthetic */ ArrayList f;
        public final /* synthetic */ ArrayList g;
        public final /* synthetic */ Object h;

        public aYJ(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.c = obj;
            this.d = arrayList;
            int i = b + 67;
            a = i % 128;
            int i2 = i % 2;
            this.e = obj2;
            this.f = arrayList2;
            this.h = obj3;
            this.g = arrayList3;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (-2) - ((((i2 | 6) << 1) - (i2 ^ 6)) ^ (-1));
            b = i3 % 128;
            int i4 = i3 % 2;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 | 84) << 1) - (i2 ^ 84);
            int i4 = (i3 ^ (-1)) + (i3 << 1);
            a = i4 % 128;
            if (i4 % 2 != 0) {
                transition.removeListener(this);
                int i5 = 99 / 0;
            } else {
                transition.removeListener(this);
            }
            int i6 = b;
            int i7 = i6 & 41;
            int i8 = (i6 | 41) & (~i7);
            int i9 = i7 << 1;
            int i10 = ((i8 | i9) << 1) - (i8 ^ i9);
            a = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
            int i = 2 % 2;
            int i2 = b + 49;
            a = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 111;
            int i4 = (i2 ^ 111) | i3;
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            b = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 ^ 81) + ((i2 & 81) << 1);
            a = i3 % 128;
            int i4 = i3 % 2;
            Object obj = this.c;
            if (obj != null) {
                int i5 = i2 & 55;
                int i6 = (i5 - (~(-(-((i2 ^ 55) | i5))))) - 1;
                a = i6 % 128;
                int i7 = i6 % 2;
                Z.this.r(obj, this.d, null);
                int i8 = b;
                int i9 = i8 ^ 19;
                int i10 = ((i8 & 19) | i9) << 1;
                int i11 = -i9;
                int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
                a = i12 % 128;
                int i13 = i12 % 2;
            }
            Object obj2 = this.e;
            if (obj2 != null) {
                int i14 = a;
                int i15 = i14 ^ 41;
                int i16 = ((i14 & 41) | i15) << 1;
                int i17 = -i15;
                int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
                b = i18 % 128;
                int i19 = i18 % 2;
                Z.this.r(obj2, this.f, null);
                int i20 = b;
                int i21 = ((i20 | 27) << 1) - (i20 ^ 27);
                a = i21 % 128;
                int i22 = i21 % 2;
            }
            Object obj3 = this.h;
            if (obj3 != null) {
                int i23 = b;
                int i24 = i23 ^ 41;
                int i25 = ((i23 & 41) | i24) << 1;
                int i26 = -i24;
                int i27 = ((i25 | i26) << 1) - (i25 ^ i26);
                a = i27 % 128;
                int i28 = i27 % 2;
                Z.this.r(obj3, this.g, null);
                int i29 = b;
                int i30 = (((i29 ^ 87) | (i29 & 87)) << 1) - (((~i29) & 87) | (i29 & (-88)));
                a = i30 % 128;
                int i31 = i30 % 2;
            }
            int i32 = a;
            int i33 = ((i32 ^ 39) | (i32 & 39)) << 1;
            int i34 = -(((~i32) & 39) | (i32 & (-40)));
            int i35 = (i33 & i34) + (i34 | i33);
            b = i35 % 128;
            int i36 = i35 % 2;
        }
    }

    public class aYK implements Transition.TransitionListener {
        private static int a = 1;
        private static int b;
        public final /* synthetic */ Runnable c;

        public aYK(Z z, Runnable runnable) {
            this.c = runnable;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 ^ 99;
            int i4 = ((i2 & 99) | i3) << 1;
            int i5 = -i3;
            int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
            b = i6 % 128;
            int i7 = i6 % 2;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 ^ 124) + ((i2 & 124) << 1)) - 1;
            a = i3 % 128;
            int i4 = i3 % 2;
            this.c.run();
            int i5 = b;
            int i6 = i5 & 75;
            int i7 = ((i5 ^ 75) | i6) << 1;
            int i8 = -((i5 | 75) & (~i6));
            int i9 = (i7 & i8) + (i8 | i7);
            a = i9 % 128;
            int i10 = i9 % 2;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 69;
            int i4 = ((((i2 ^ 69) | i3) << 1) - (~(-((i2 | 69) & (~i3))))) - 1;
            a = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 4 / 0;
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 ^ 100) + ((i2 & 100) << 1)) - 1;
            b = i3 % 128;
            int i4 = i3 % 2;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            int i = 2 % 2;
            int i2 = a + 119;
            b = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }
    }

    public class aYL extends Transition.EpicenterCallback {
        private static int a = 1;
        private static int b;
        public final /* synthetic */ Rect c;

        public aYL(Z z, Rect rect) {
            this.c = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 | 31) << 1) - (i2 ^ 31);
            int i4 = i3 % 128;
            a = i4;
            int i5 = i3 % 2;
            Rect rect = this.c;
            Object obj = null;
            if (rect != null) {
                int i6 = i4 & 85;
                int i7 = i4 | 85;
                int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
                b = i8 % 128;
                int i9 = i8 % 2;
                if (!rect.isEmpty()) {
                    int i10 = a;
                    int i11 = i10 ^ 9;
                    int i12 = ((((i10 & 9) | i11) << 1) - (~(-i11))) - 1;
                    int i13 = i12 % 128;
                    b = i13;
                    if (i12 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                    Rect rect2 = this.c;
                    int i14 = (i13 & (-108)) | ((~i13) & 107);
                    int i15 = -(-((i13 & 107) << 1));
                    int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
                    a = i16 % 128;
                    int i17 = i16 % 2;
                    return rect2;
                }
            }
            int i18 = a;
            int i19 = (((i18 ^ 65) | (i18 & 65)) << 1) - (((~i18) & 65) | (i18 & (-66)));
            b = i19 % 128;
            if (i19 % 2 == 0) {
                return null;
            }
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0069  */
    /* JADX WARN: Code duplicated, block: B:18:0x007a  */
    public static boolean B(Transition transition) {
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 ^ 103;
        boolean z = true;
        int i5 = (((i3 & 103) | i4) << 1) - i4;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            K.e(transition.getTargetIds());
            throw null;
        }
        if (!K.e(transition.getTargetIds())) {
            int i6 = b;
            i = ((i6 ^ 103) - (~((i6 & 103) << 1))) - 1;
            a = i % 128;
            if (i % 2 != 0) {
                int i7 = 4 % 3;
            }
        } else {
            int i8 = b;
            int i9 = i8 & 55;
            int i10 = -(-(i8 | 55));
            int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
            a = i11 % 128;
            int i12 = i11 % 2;
            if (K.e(transition.getTargetNames())) {
                int i13 = a + 11;
                b = i13 % 128;
                int i14 = i13 % 2;
                List<Class> targetTypes = transition.getTargetTypes();
                if (i14 == 0) {
                    K.e(targetTypes);
                    throw null;
                }
                if (K.e(targetTypes)) {
                    int i15 = a;
                    int i16 = (-2) - (((i15 ^ 120) + ((i15 & 120) << 1)) ^ (-1));
                    b = i16 % 128;
                    int i17 = i16 % 2;
                    z = false;
                } else {
                    int i18 = b;
                    i = ((i18 ^ 103) - (~((i18 & 103) << 1))) - 1;
                    a = i % 128;
                    if (i % 2 != 0) {
                        int i19 = 4 % 3;
                    }
                }
            } else {
                int i110 = b;
                i = ((i110 ^ 103) - (~((i110 & 103) << 1))) - 1;
                a = i % 128;
                if (i % 2 != 0) {
                    int i111 = 4 % 3;
                }
            }
        }
        int i20 = a + 119;
        b = i20 % 128;
        if (i20 % 2 != 0) {
            return z;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.F.K
    public void i(ViewGroup viewGroup, Object obj) {
        int i = 2 % 2;
        int i2 = b + 65;
        a = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = a;
        int i5 = (i4 & 69) + (i4 | 69);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.F.K
    public boolean k(Object obj) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 47;
        int i4 = (((i2 | 47) & (~i3)) - (~(-(-(i3 << 1))))) - 1;
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        boolean z = obj instanceof Transition;
        int i7 = i5 & 89;
        int i8 = (i7 - (~(-(-((i5 ^ 89) | i7))))) - 1;
        b = i8 % 128;
        if (i8 % 2 != 0) {
            return z;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.F.K
    public Object l(Object obj) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 19) << 1) - ((i2 & (-20)) | ((~i2) & 19));
        b = i3 % 128;
        Transition transitionClone = null;
        if (i3 % 2 == 0) {
            transitionClone.hashCode();
            throw null;
        }
        if (obj != null) {
            transitionClone = ((Transition) obj).clone();
            int i4 = b + 43;
            a = i4 % 128;
            int i5 = i4 % 2;
        } else {
            int i6 = i2 ^ 105;
            int i7 = (((i2 & 105) | i6) << 1) - i6;
            b = i7 % 128;
            int i8 = i7 % 2;
        }
        int i9 = (-2) - ((a + 22) ^ (-1));
        b = i9 % 128;
        int i10 = i9 % 2;
        return transitionClone;
    }

    @Override // ivas.gov.bisp.enumeration.F.K
    public void v(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 55;
        int i4 = i3 + ((i2 ^ 55) | i3);
        a = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            int i5 = i2 & 11;
            int i6 = (i2 | 11) & (~i5);
            int i7 = i5 << 1;
            int i8 = ((i6 | i7) << 1) - (i6 ^ i7);
            a = i8 % 128;
            int i9 = i8 % 2;
            transitionSet.getTargets().clear();
            List<View> targets = transitionSet.getTargets();
            int i10 = a + 113;
            b = i10 % 128;
            if (i10 % 2 == 0) {
                targets.addAll(arrayList2);
                r(transitionSet, arrayList, arrayList2);
                int i11 = 39 / 0;
            } else {
                targets.addAll(arrayList2);
                r(transitionSet, arrayList, arrayList2);
            }
            int i12 = a;
            int i13 = (i12 & 89) + (i12 | 89);
            b = i13 % 128;
            int i14 = i13 % 2;
        }
        int i15 = b;
        int i16 = ((i15 | 43) << 1) - (i15 ^ 43);
        a = i16 % 128;
        int i17 = i16 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.F.K
    public void w(Fragment fragment, Object obj, c cVar, Runnable runnable) {
        int i = 2 % 2;
        Transition transition = (Transition) obj;
        aYK ayk = new aYK(this, runnable);
        int i2 = a;
        int i3 = i2 & 7;
        int i4 = -(-((i2 ^ 7) | i3));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            transition.addListener(ayk);
            throw null;
        }
        transition.addListener(ayk);
        int i6 = a;
        int i7 = i6 & 101;
        int i8 = (i6 | 101) & (~i7);
        int i9 = -(-(i7 << 1));
        int i10 = (i8 ^ i9) + ((i8 & i9) << 1);
        b = i10 % 128;
        int i11 = i10 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.F.K
    public Object A(Object obj) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 47) | (i2 & 47)) << 1;
        int i4 = -(((~i2) & 47) | (i2 & (-48)));
        int i5 = (i3 & i4) + (i4 | i3);
        int i6 = i5 % 128;
        a = i6;
        int i7 = i5 % 2;
        Object obj2 = null;
        if (obj == null) {
            int i8 = i6 + 19;
            b = i8 % 128;
            if (i8 % 2 != 0) {
                return null;
            }
            obj2.hashCode();
            throw null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        int i9 = b;
        int i10 = i9 & 51;
        int i11 = i10 + ((i9 ^ 51) | i10);
        a = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        int i12 = ((i9 & 37) - (~(i9 | 37))) - 1;
        a = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 45 / 0;
        }
        return transitionSet;
    }

    @Override // ivas.gov.bisp.enumeration.F.K
    public void g(Object obj, View view) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (-2) - ((i2 + 46) ^ (-1));
        a = i3 % 128;
        int i4 = i3 % 2;
        if (obj != null) {
            int i5 = i2 + 7;
            a = i5 % 128;
            int i6 = i5 % 2;
            ((Transition) obj).addTarget(view);
            int i7 = a;
            int i8 = i7 & 19;
            int i9 = (i7 | 19) & (~i8);
            int i10 = i8 << 1;
            int i11 = (i9 & i10) + (i9 | i10);
            b = i11 % 128;
            int i12 = i11 % 2;
        }
        int i13 = b;
        int i14 = (-2) - ((((i13 | 10) << 1) - (i13 ^ 10)) ^ (-1));
        a = i14 % 128;
        if (i14 % 2 != 0) {
            throw null;
        }
    }

    @Override // ivas.gov.bisp.enumeration.F.K
    public Object p(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            int i2 = a;
            int i3 = (-2) - (((i2 & 90) + (i2 | 90)) ^ (-1));
            b = i3 % 128;
            int i4 = i3 % 2;
            transitionSet.addTransition((Transition) obj);
            if (i4 == 0) {
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
            int i5 = b;
            int i6 = (i5 | 71) << 1;
            int i7 = -(((~i5) & 71) | (i5 & (-72)));
            int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
            a = i8 % 128;
            int i9 = i8 % 2;
        }
        if (obj2 != null) {
            int i10 = a;
            int i11 = ((i10 | 55) << 1) - (i10 ^ 55);
            b = i11 % 128;
            int i12 = i11 % 2;
            transitionSet.addTransition((Transition) obj2);
            int i13 = b;
            int i14 = ((i13 | 61) << 1) - (i13 ^ 61);
            a = i14 % 128;
            int i15 = i14 % 2;
        }
        if (obj3 != null) {
            int i16 = a + 23;
            b = i16 % 128;
            int i17 = i16 % 2;
            transitionSet.addTransition((Transition) obj3);
            int i18 = a;
            int i19 = ((i18 | 33) << 1) - (i18 ^ 33);
            b = i19 % 128;
            int i20 = i19 % 2;
        }
        int i21 = b;
        int i22 = (-2) - ((((i21 | 96) << 1) - (i21 ^ 96)) ^ (-1));
        a = i22 % 128;
        if (i22 % 2 != 0) {
            int i23 = 1 / 0;
        }
        return transitionSet;
    }

    @Override // ivas.gov.bisp.enumeration.F.K
    public void q(Object obj, View view) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 99;
        int i4 = (((i2 ^ 99) | i3) << 1) - ((~i3) & (i2 | 99));
        a = i4 % 128;
        int i5 = i4 % 2;
        if (obj != null) {
            int i6 = i2 & 63;
            int i7 = (i2 ^ 63) | i6;
            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
            a = i8 % 128;
            if (i8 % 2 != 0) {
                ((Transition) obj).removeTarget(view);
                throw null;
            }
            ((Transition) obj).removeTarget(view);
            int i9 = b;
            int i10 = i9 & 77;
            int i11 = -(-((i9 ^ 77) | i10));
            int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
            a = i12 % 128;
            int i13 = i12 % 2;
        }
        int i14 = a + 75;
        b = i14 % 128;
        int i15 = i14 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.F.K
    public void s(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        int i = 2 % 2;
        aYJ ayj = new aYJ(obj2, arrayList, obj3, arrayList2, obj4, arrayList3);
        int i2 = a;
        int i3 = (i2 & 83) + (i2 | 83);
        b = i3 % 128;
        int i4 = i3 % 2;
        ((Transition) obj).addListener(ayj);
        int i5 = a;
        int i6 = i5 & 97;
        int i7 = (i5 ^ 97) | i6;
        int i8 = (i6 & i7) + (i7 | i6);
        b = i8 % 128;
        int i9 = i8 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.F.K
    public void t(Object obj, View view, ArrayList<View> arrayList) {
        int i = 2 % 2;
        aYI ayi = new aYI(this, view, arrayList);
        int i2 = b;
        int i3 = i2 & 9;
        int i4 = ((i2 | 9) & (~i3)) + (i3 << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        ((Transition) obj).addListener(ayi);
        int i6 = a;
        int i7 = (i6 & 95) + (i6 | 95);
        b = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 37 / 0;
        }
    }

    @Override // ivas.gov.bisp.enumeration.F.K
    public void u(Object obj, Rect rect) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 | 25;
        int i4 = i3 << 1;
        int i5 = -((~(i2 & 25)) & i3);
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        if (obj != null) {
            aYL ayl = new aYL(this, rect);
            int i8 = b;
            int i9 = ((i8 ^ 55) | (i8 & 55)) << 1;
            int i10 = -(((~i8) & 55) | (i8 & (-56)));
            int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
            a = i11 % 128;
            int i12 = i11 % 2;
            ((Transition) obj).setEpicenterCallback(ayl);
            if (i12 != 0) {
                int i13 = 89 / 0;
            }
            int i14 = b;
            int i15 = i14 ^ 5;
            int i16 = (i14 & 5) << 1;
            int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
            a = i17 % 128;
            int i18 = i17 % 2;
        }
        int i19 = b;
        int i20 = i19 ^ 51;
        int i21 = -(-((i19 & 51) << 1));
        int i22 = (i20 & i21) + (i21 | i20);
        a = i22 % 128;
        int i23 = i22 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.F.K
    public void x(Object obj, View view) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 | 47) << 1;
        int i4 = -(((~i2) & 47) | (i2 & (-48)));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        Object obj2 = null;
        if (i5 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        if (view != null) {
            Rect rect = new Rect();
            m(view, rect);
            ((Transition) obj).setEpicenterCallback(new aYH(this, rect));
            int i6 = a;
            int i7 = i6 & 7;
            int i8 = ((((i6 ^ 7) | i7) << 1) - (~(-((i6 | 7) & (~i7))))) - 1;
            b = i8 % 128;
            int i9 = i8 % 2;
        }
        int i10 = b;
        int i11 = i10 | 37;
        int i12 = (i11 << 1) - ((~(i10 & 37)) & i11);
        a = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    @Override // ivas.gov.bisp.enumeration.F.K
    public void z(Object obj, View view, ArrayList<View> arrayList) {
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 53;
        int i5 = i3 | 53;
        int i6 = (i4 & i5) + (i5 | i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int i8 = b;
        int i9 = i8 & 7;
        int i10 = (i9 - (~((i8 ^ 7) | i9))) - 1;
        a = i10 % 128;
        int i11 = i10 % 2;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            int i13 = a;
            int i14 = i13 & 1;
            int i15 = (i13 ^ 1) | i14;
            int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
            b = i16 % 128;
            int i17 = i16 % 2;
            View view2 = arrayList.get(i12);
            int i18 = a;
            int i19 = (i18 & (-118)) | ((~i18) & 117);
            int i20 = (i18 & 117) << 1;
            int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
            b = i21 % 128;
            if (i21 % 2 == 0) {
                K.c(targets, view2);
                i = ((i12 ^ 17) + ((i12 & 17) << 1)) - 1;
            } else {
                K.c(targets, view2);
                i = (i12 & 1) + (i12 | 1);
            }
            i12 = i;
            int i22 = b + 5;
            a = i22 % 128;
            if (i22 % 2 != 0) {
                int i23 = 4 % 3;
            }
        }
        targets.add(view);
        arrayList.add(view);
        int i24 = a;
        int i25 = i24 & 95;
        int i26 = (i24 | 95) & (~i25);
        int i27 = -(-(i25 << 1));
        int i28 = (i26 & i27) + (i26 | i27);
        b = i28 % 128;
        int i29 = i28 % 2;
        h(transitionSet, arrayList);
        if (i29 == 0) {
            int i30 = 23 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0067 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:12:0x0069  */
    /* JADX WARN: Code duplicated, block: B:14:0x007b  */
    /* JADX WARN: Code duplicated, block: B:15:0x008f  */
    @Override // ivas.gov.bisp.enumeration.F.K
    public Object n(Object obj, Object obj2, Object obj3) {
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 + 57;
        b = i4 % 128;
        int i5 = i4 % 2;
        Transition ordering = (Transition) obj;
        Transition transition = (Transition) obj2;
        int i6 = ((i3 ^ 116) + ((i3 & 116) << 1)) - 1;
        int i7 = i6 % 128;
        b = i7;
        int i8 = i6 % 2;
        Transition transition2 = (Transition) obj3;
        if (ordering != null) {
            int i9 = i7 + 75;
            a = i9 % 128;
            if (i9 % 2 != 0) {
                throw null;
            }
            if (transition != null) {
                TransitionSet transitionSetAddTransition = new TransitionSet().addTransition(ordering).addTransition(transition);
                int i10 = b;
                int i11 = (i10 & (-110)) | ((~i10) & 109);
                int i12 = (i10 & 109) << 1;
                int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
                a = i13 % 128;
                int i14 = i13 % 2;
                ordering = transitionSetAddTransition.setOrdering(1);
                int i15 = b;
                int i16 = i15 & 35;
                int i17 = i16 + ((i15 ^ 35) | i16);
                a = i17 % 128;
                if (i17 % 2 != 0) {
                    int i18 = 3 % 5;
                }
            } else if (ordering == null) {
                int i19 = i7 & 111;
                int i20 = (((i7 ^ 111) | i19) << 1) - ((~i19) & (i7 | 111));
                i = i20 % 128;
                a = i;
                int i21 = i20 % 2;
                if (transition != null) {
                    int i22 = i7 + 91;
                    a = i22 % 128;
                    int i23 = i22 % 2;
                    int i24 = (-2) - ((i7 + 14) ^ (-1));
                    a = i24 % 128;
                    int i25 = i24 % 2;
                    ordering = transition;
                } else {
                    int i26 = i & 119;
                    int i27 = (i ^ 119) | i26;
                    int i28 = (i26 ^ i27) + ((i26 & i27) << 1);
                    b = i28 % 128;
                    int i29 = i28 % 2;
                    ordering = null;
                }
            }
        } else if (ordering == null) {
            int i110 = i7 & 111;
            int i210 = (((i7 ^ 111) | i110) << 1) - ((~i110) & (i7 | 111));
            i = i210 % 128;
            a = i;
            int i211 = i210 % 2;
            if (transition != null) {
                int i212 = i7 + 91;
                a = i212 % 128;
                int i213 = i212 % 2;
                int i214 = (-2) - ((i7 + 14) ^ (-1));
                a = i214 % 128;
                int i215 = i214 % 2;
                ordering = transition;
            } else {
                int i216 = i & 119;
                int i217 = (i ^ 119) | i216;
                int i218 = (i216 ^ i217) + ((i216 & i217) << 1);
                b = i218 % 128;
                int i219 = i218 % 2;
                ordering = null;
            }
        }
        if (transition2 == null) {
            int i30 = b;
            int i31 = ((i30 & 66) + (i30 | 66)) - 1;
            a = i31 % 128;
            int i32 = i31 % 2;
            return ordering;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (ordering != null) {
            int i33 = b;
            int i34 = ((i33 | 19) << 1) - (i33 ^ 19);
            a = i34 % 128;
            if (i34 % 2 != 0) {
                transitionSet.addTransition(ordering);
                int i35 = 91 / 0;
            } else {
                transitionSet.addTransition(ordering);
            }
        }
        transitionSet.addTransition(transition2);
        int i36 = (-2) - ((a + 74) ^ (-1));
        b = i36 % 128;
        int i37 = i36 % 2;
        return transitionSet;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006e  */
    /* JADX WARN: Code duplicated, block: B:25:0x007d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0083  */
    /* JADX WARN: Code duplicated, block: B:29:0x0097  */
    /* JADX WARN: Code duplicated, block: B:31:0x009b  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ca A[SYNTHETIC] */
    @Override // ivas.gov.bisp.enumeration.F.K
    public void h(Object obj, ArrayList<View> arrayList) {
        int i;
        int size;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = b;
        int i6 = (((i5 & (-54)) | ((~i5) & 53)) - (~(-(-((i5 & 53) << 1))))) - 1;
        int i7 = i6 % 128;
        a = i7;
        Object obj2 = null;
        if (i6 % 2 != 0) {
            throw null;
        }
        Transition transition = (Transition) obj;
        if (transition == null) {
            int i8 = i5 ^ 9;
            int i9 = ((((i5 & 9) | i8) << 1) - (~(-i8))) - 1;
            a = i9 % 128;
            if (i9 % 2 == 0) {
                return;
            }
            obj2.hashCode();
            throw null;
        }
        int i10 = 0;
        if (!(!(transition instanceof TransitionSet))) {
            int i11 = i7 & 111;
            int i12 = (i7 | 111) & (~i11);
            int i13 = i11 << 1;
            int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
            b = i14 % 128;
            int i15 = i14 % 2;
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            int i16 = a;
            int i17 = i16 ^ 13;
            int i18 = (i16 & 13) << 1;
            int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
            b = i19 % 128;
            int i20 = i19 % 2;
            int i21 = 0;
            while (i21 < transitionCount) {
                int i22 = b;
                int i23 = i22 & 99;
                int i24 = (i22 ^ 99) | i23;
                int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
                a = i25 % 128;
                if (i25 % 2 != 0) {
                    h(transitionSet.getTransitionAt(i21), arrayList);
                    int i26 = 89 / 0;
                } else {
                    h(transitionSet.getTransitionAt(i21), arrayList);
                }
                i21++;
                int i27 = a;
                int i28 = i27 & 19;
                int i29 = i28 + ((i27 ^ 19) | i28);
                b = i29 % 128;
                int i30 = i29 % 2;
            }
        } else if (!B(transition)) {
            int i31 = b;
            int i32 = ((i31 & 94) + (i31 | 94)) - 1;
            a = i32 % 128;
            if (i32 % 2 != 0) {
                int i33 = 79 / 0;
                if (K.e(transition.getTargets())) {
                    int i34 = a;
                    int i35 = i34 & 121;
                    i = i35 + ((i34 ^ 121) | i35);
                    b = i % 128;
                    if (i % 2 == 0) {
                        size = arrayList.size();
                        i10 = 1;
                    } else {
                        size = arrayList.size();
                    }
                    int i36 = a;
                    i2 = ((i36 ^ 52) + ((i36 & 52) << 1)) - 1;
                    b = i2 % 128;
                    if (i2 % 2 == 0) {
                        int i37 = 2 % 4;
                    }
                    while (i10 < size) {
                        int i38 = a;
                        int i39 = i38 & 125;
                        int i40 = (i38 ^ 125) | i39;
                        int i41 = (i39 ^ i40) + ((i40 & i39) << 1);
                        b = i41 % 128;
                        int i42 = i41 % 2;
                        transition.addTarget(arrayList.get(i10));
                        int i43 = a;
                        int i44 = i43 & 45;
                        i3 = (((i43 | 45) & (~i44)) - (~(-(-(i44 << 1))))) - 1;
                        b = i3 % 128;
                        if (i3 % 2 == 0) {
                            int i45 = i10 & 20;
                            int i46 = -(-(i10 | 20));
                            int i47 = ((i45 | i46) << 1) - (i46 ^ i45);
                            int i48 = i47 ^ 5;
                            int i49 = ((i47 & 5) | i48) << 1;
                            int i50 = -i48;
                            i10 = (i49 & i50) + (i50 | i49);
                        } else {
                            int i51 = i10 ^ 1;
                            i10 = ((((i10 & 1) | i51) << 1) - (~(-i51))) - 1;
                        }
                    }
                }
            } else if (!(!K.e(transition.getTargets()))) {
                int i310 = a;
                int i311 = i310 & 121;
                i = i311 + ((i310 ^ 121) | i311);
                b = i % 128;
                if (i % 2 == 0) {
                    size = arrayList.size();
                    i10 = 1;
                } else {
                    size = arrayList.size();
                }
                int i312 = a;
                i2 = ((i312 ^ 52) + ((i312 & 52) << 1)) - 1;
                b = i2 % 128;
                if (i2 % 2 == 0) {
                    int i313 = 2 % 4;
                }
                while (i10 < size) {
                    int i314 = a;
                    int i315 = i314 & 125;
                    int i410 = (i314 ^ 125) | i315;
                    int i411 = (i315 ^ i410) + ((i410 & i315) << 1);
                    b = i411 % 128;
                    int i412 = i411 % 2;
                    transition.addTarget(arrayList.get(i10));
                    int i413 = a;
                    int i414 = i413 & 45;
                    i3 = (((i413 | 45) & (~i414)) - (~(-(-(i414 << 1))))) - 1;
                    b = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i415 = i10 & 20;
                        int i416 = -(-(i10 | 20));
                        int i417 = ((i415 | i416) << 1) - (i416 ^ i415);
                        int i418 = i417 ^ 5;
                        int i419 = ((i417 & 5) | i418) << 1;
                        int i52 = -i418;
                        i10 = (i419 & i52) + (i52 | i419);
                    } else {
                        int i53 = i10 ^ 1;
                        i10 = ((((i10 & 1) | i53) << 1) - (~(-i53))) - 1;
                    }
                }
            }
        }
        int i54 = b;
        int i55 = (-2) - (((i54 ^ 10) + ((i54 & 10) << 1)) ^ (-1));
        a = i55 % 128;
        int i56 = i55 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x010d  */
    /* JADX WARN: Code duplicated, block: B:30:0x011a  */
    /* JADX WARN: Code duplicated, block: B:32:0x011e  */
    @Override // ivas.gov.bisp.enumeration.F.K
    public void r(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        int i;
        int size;
        Transition transitionAt;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 101;
        int i5 = (i3 ^ 101) | i4;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        a = i6 % 128;
        int i7 = i6 % 2;
        Transition transition = (Transition) obj;
        boolean z = transition instanceof TransitionSet;
        int i8 = i3 & 83;
        int i9 = (i8 - (~((i3 ^ 83) | i8))) - 1;
        int i10 = i9 % 128;
        a = i10;
        int i11 = i9 % 2;
        int i12 = 0;
        if (z) {
            int i13 = i10 & 7;
            int i14 = (i10 | 7) & (~i13);
            int i15 = i13 << 1;
            int i16 = (i14 & i15) + (i14 | i15);
            b = i16 % 128;
            int i17 = i16 % 2;
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            int i18 = a + 87;
            b = i18 % 128;
            int i19 = i18 % 2;
            int i20 = 0;
            while (i20 < transitionCount) {
                int i21 = b;
                int i22 = ((i21 | 95) << 1) - (i21 ^ 95);
                a = i22 % 128;
                if (i22 % 2 != 0) {
                    transitionAt = transitionSet.getTransitionAt(i20);
                    int i23 = 35 / 0;
                } else {
                    transitionAt = transitionSet.getTransitionAt(i20);
                }
                int i24 = b;
                int i25 = i24 & 89;
                int i26 = (i24 ^ 89) | i25;
                int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
                a = i27 % 128;
                if (i27 % 2 != 0) {
                    r(transitionAt, arrayList, arrayList2);
                    int i28 = i20 & 36;
                    int i29 = ((i20 ^ 36) | i28) << 1;
                    int i30 = -((i20 | 36) & (~i28));
                    i20 = (i29 ^ i30) + ((i30 & i29) << 1);
                } else {
                    r(transitionAt, arrayList, arrayList2);
                    i20++;
                }
            }
        } else if (!B(transition)) {
            int i31 = b;
            int i32 = i31 & 105;
            int i33 = (((i31 ^ 105) | i32) << 1) - ((i31 | 105) & (~i32));
            a = i33 % 128;
            int i34 = i33 % 2;
            List<View> targets = transition.getTargets();
            if (targets != null) {
                int i35 = b;
                int i36 = (((i35 ^ 25) | (i35 & 25)) << 1) - (((~i35) & 25) | (i35 & (-26)));
                a = i36 % 128;
                int i37 = i36 % 2;
                if (targets.size() == arrayList.size()) {
                    int i38 = a;
                    int i39 = (i38 & (-32)) | ((~i38) & 31);
                    int i40 = (i38 & 31) << 1;
                    int i41 = ((i39 | i40) << 1) - (i40 ^ i39);
                    b = i41 % 128;
                    int i42 = i41 % 2;
                    if (targets.containsAll(arrayList)) {
                        int i43 = b;
                        int i44 = (i43 ^ 51) + ((i43 & 51) << 1);
                        a = i44 % 128;
                        if (i44 % 2 != 0) {
                            int i45 = 51 / 0;
                            if (arrayList2 == null) {
                                int i46 = i43 & 55;
                                i = i46 + ((i43 ^ 55) | i46);
                                a = i % 128;
                                if (i % 2 != 0) {
                                    int i47 = 5 % 2;
                                }
                                size = 0;
                            } else {
                                size = arrayList2.size();
                                int i48 = a + 125;
                                b = i48 % 128;
                                int i49 = i48 % 2;
                            }
                        } else if (arrayList2 == null) {
                            int i410 = i43 & 55;
                            i = i410 + ((i43 ^ 55) | i410);
                            a = i % 128;
                            if (i % 2 != 0) {
                                int i411 = 5 % 2;
                            }
                            size = 0;
                        } else {
                            size = arrayList2.size();
                            int i412 = a + 125;
                            b = i412 % 128;
                            int i413 = i412 % 2;
                        }
                        while (i12 < size) {
                            int i50 = a;
                            int i51 = (i50 ^ 67) + ((i50 & 67) << 1);
                            b = i51 % 128;
                            int i52 = i51 % 2;
                            transition.addTarget(arrayList2.get(i12));
                            int i53 = b;
                            int i54 = ((((i53 ^ 11) | (i53 & 11)) << 1) - (~(-((11 & (~i53)) | (i53 & (-12)))))) - 1;
                            a = i54 % 128;
                            if (i54 % 2 != 0) {
                                int i55 = ((((i12 ^ 204) | (i12 & 204)) << 1) - (~(-(((~i12) & 204) | (i12 & (-205)))))) - 1;
                                int i56 = (i55 | (-84)) << 1;
                                int i57 = -(((~i55) & (-84)) | (i55 & 83));
                                i12 = (i56 ^ i57) + ((i57 & i56) << 1);
                            } else {
                                int i58 = i12 & 118;
                                int i59 = (i12 | 118) & (~i58);
                                int i60 = i58 << 1;
                                int i61 = (i59 & i60) + (i60 | i59);
                                int i62 = i61 & (-117);
                                i12 = i62 + ((i61 ^ (-117)) | i62);
                            }
                        }
                        int size2 = arrayList.size() - 1;
                        int i63 = b;
                        int i64 = i63 & 49;
                        int i65 = (i63 ^ 49) | i64;
                        int i66 = (i64 & i65) + (i65 | i64);
                        a = i66 % 128;
                        int i67 = i66 % 2;
                        while (size2 >= 0) {
                            int i68 = b;
                            int i69 = i68 & 11;
                            int i70 = -(-((i68 ^ 11) | i69));
                            int i71 = (i69 & i70) + (i70 | i69);
                            a = i71 % 128;
                            int i72 = i71 % 2;
                            transition.removeTarget(arrayList.get(size2));
                            int i73 = b;
                            int i74 = (((i73 & (-82)) | ((~i73) & 81)) - (~((i73 & 81) << 1))) - 1;
                            a = i74 % 128;
                            if (i74 % 2 != 0) {
                                int i75 = ((size2 ^ 14) | (size2 & 14)) << 1;
                                int i76 = -(((~size2) & 14) | (size2 & (-15)));
                                size2 = (i75 & i76) + (i76 | i75);
                            } else {
                                size2--;
                            }
                            int i77 = (-2) - ((i73 + 56) ^ (-1));
                            a = i77 % 128;
                            int i78 = i77 % 2;
                        }
                    }
                }
            }
        }
        int i79 = b;
        int i80 = (i79 & 103) + (i79 | 103);
        a = i80 % 128;
        int i81 = i80 % 2;
    }
}
