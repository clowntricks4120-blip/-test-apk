package ivas.gov.bisp.enumeration.aM;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import ivas.gov.bisp.enumeration.p006af.h;
import java.util.Map;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aM.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0075s extends J {
    private static int a = 0;
    private static int b = 1;
    public static final String[] z;
    public int A = 3;

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aM.s$bHs */
    public static class bHs extends AnimatorListenerAdapter implements J.InterfaceC0070bHc {
        private static int a = 0;
        private static int b = 1;
        public final View c;
        public final int d;
        public final ViewGroup e;
        public final boolean f;
        public boolean g = false;
        public boolean h;

        public bHs(View view, int i, boolean z) {
            this.c = view;
            this.d = i;
            this.e = (ViewGroup) view.getParent();
            this.f = z;
            i(true);
        }

        @Override // ivas.gov.bisp.enumeration.aM.J.InterfaceC0070bHc
        public void a(J j) {
            int i = 2 % 2;
            int i2 = b + 59;
            a = i2 % 128;
            int i3 = i2 % 2;
        }

        @Override // ivas.gov.bisp.enumeration.aM.J.InterfaceC0070bHc
        public void c(J j) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 79;
            int i4 = ((i2 ^ 79) | i3) << 1;
            int i5 = -((i2 | 79) & (~i3));
            int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
            a = i6 % 128;
            int i7 = i6 % 2;
        }

        @Override // ivas.gov.bisp.enumeration.aM.J.InterfaceC0070bHc
        public void d(J j) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 123;
            int i4 = ((i2 ^ 123) | i3) << 1;
            int i5 = -((i2 | 123) & (~i3));
            int i6 = (i4 & i5) + (i5 | i4);
            a = i6 % 128;
            int i7 = i6 % 2;
            i(false);
            int i8 = a;
            int i9 = i8 & 107;
            int i10 = (i8 | 107) & (~i9);
            int i11 = i9 << 1;
            int i12 = (i10 & i11) + (i10 | i11);
            b = i12 % 128;
            int i13 = i12 % 2;
        }

        @Override // ivas.gov.bisp.enumeration.aM.J.InterfaceC0070bHc
        public void e(J j) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & 67) + (i2 | 67);
            b = i3 % 128;
            int i4 = i3 % 2;
            i(true);
            int i5 = b;
            int i6 = i5 & 119;
            int i7 = (((i5 ^ 119) | i6) << 1) - ((i5 | 119) & (~i6));
            a = i7 % 128;
            if (i7 % 2 != 0) {
                throw null;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            int i = 2 % 2;
            int i2 = b + 17;
            int i3 = i2 % 128;
            a = i3;
            int i4 = i2 % 2;
            this.g = true;
            int i5 = (i3 & 21) + (i3 | 21);
            b = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 | 109) << 1;
            int i4 = -(i2 ^ 109);
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            b = i5 % 128;
            if (i5 % 2 == 0) {
                g();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            g();
            int i6 = b + 97;
            a = i6 % 128;
            int i7 = i6 % 2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 45;
            int i4 = (i2 ^ 45) | i3;
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            a = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            int i = 2 % 2;
            int i2 = b + 31;
            a = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (!this.g) {
                L.c.p(this.c, 0);
                int i3 = b;
                int i4 = (i3 ^ 19) + ((i3 & 19) << 1);
                a = i4 % 128;
                int i5 = i4 % 2;
            }
            int i6 = a;
            int i7 = (((i6 & (-58)) | ((~i6) & 57)) - (~(-(-((i6 & 57) << 1))))) - 1;
            b = i7 % 128;
            int i8 = i7 % 2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            int i = 2 % 2;
            int i2 = a + 125;
            b = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }

        @Override // ivas.gov.bisp.enumeration.aM.J.InterfaceC0070bHc
        public void b(J j) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 77;
            int i4 = (((i2 ^ 77) | i3) << 1) - ((i2 | 77) & (~i3));
            b = i4 % 128;
            if (i4 % 2 != 0) {
                g();
                j.y(this);
            } else {
                g();
                j.y(this);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        public final void i(boolean z) {
            int i = 2 % 2;
            int i2 = (-2) - ((b + 36) ^ (-1));
            int i3 = i2 % 128;
            a = i3;
            int i4 = i2 % 2;
            if (this.f) {
                int i5 = (i3 & 74) + (i3 | 74);
                int i6 = (i5 ^ (-1)) + (i5 << 1);
                b = i6 % 128;
                int i7 = i6 % 2;
                if (this.h != z) {
                    int i8 = ((i3 & (-116)) | ((~i3) & 115)) + ((i3 & 115) << 1);
                    int i9 = i8 % 128;
                    b = i9;
                    int i10 = i8 % 2;
                    ViewGroup viewGroup = this.e;
                    if (viewGroup != null) {
                        int i11 = i9 & 21;
                        int i12 = ((((i9 ^ 21) | i11) << 1) - (~(-((i9 | 21) & (~i11))))) - 1;
                        a = i12 % 128;
                        if (i12 % 2 != 0) {
                            this.h = z;
                            S.b(viewGroup, z);
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        this.h = z;
                        S.b(viewGroup, z);
                        int i13 = a;
                        int i14 = ((i13 & 30) + (i13 | 30)) - 1;
                        b = i14 % 128;
                        int i15 = i14 % 2;
                    }
                }
            }
            int i16 = b;
            int i17 = ((i16 | 21) << 1) - (i16 ^ 21);
            a = i17 % 128;
            int i18 = i17 % 2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 ^ 92) + ((i2 & 92) << 1)) - 1;
            a = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (!this.g) {
                View view = this.c;
                int i4 = this.d;
                h hVar = L.c;
                int i5 = a;
                int i6 = i5 ^ 37;
                int i7 = (i5 & 37) << 1;
                int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
                b = i8 % 128;
                int i9 = i8 % 2;
                hVar.p(view, i4);
                int i10 = a;
                int i11 = i10 & 81;
                int i12 = i11 + ((i10 ^ 81) | i11);
                b = i12 % 128;
                int i13 = i12 % 2;
            }
            int i14 = a + 31;
            b = i14 % 128;
            if (i14 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        public final void g() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 31;
            int i4 = (~i3) & (i2 | 31);
            int i5 = i3 << 1;
            int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
            a = i6 % 128;
            if (i6 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (!this.g) {
                int i7 = (i2 ^ 69) + ((i2 & 69) << 1);
                a = i7 % 128;
                int i8 = i7 % 2;
                View view = this.c;
                int i9 = this.d;
                h hVar = L.c;
                int i10 = b;
                int i11 = (i10 & 49) + (i10 | 49);
                a = i11 % 128;
                int i12 = i11 % 2;
                hVar.p(view, i9);
                ViewGroup viewGroup = this.e;
                if (viewGroup != null) {
                    int i13 = b;
                    int i14 = (i13 & (-76)) | ((~i13) & 75);
                    int i15 = -(-((i13 & 75) << 1));
                    int i16 = (i14 & i15) + (i15 | i14);
                    a = i16 % 128;
                    int i17 = i16 % 2;
                    viewGroup.invalidate();
                    int i18 = b;
                    int i19 = i18 & 89;
                    int i20 = (i18 | 89) & (~i19);
                    int i21 = -(-(i19 << 1));
                    int i22 = (i20 ^ i21) + ((i20 & i21) << 1);
                    a = i22 % 128;
                    int i23 = i22 % 2;
                }
            }
            i(false);
            int i24 = b;
            int i25 = ((i24 ^ 106) + ((i24 & 106) << 1)) - 1;
            a = i25 % 128;
            int i26 = i25 % 2;
        }
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aM.s$bHt */
    public static class bHt {
        public boolean a;
        public boolean b;
        public int c;
        public int d;
        public ViewGroup e;
        public ViewGroup f;
    }

    static {
        int i = (~0) & 121;
        int i2 = i % 128;
        b = i2;
        int i3 = i % 2;
        z = new String[]{"android:visibility:visibility", "android:visibility:parent"};
        int i4 = (-2) - ((i2 + 26) ^ (-1));
        a = i4 % 128;
        int i5 = i4 % 2;
    }

    public abstract Animator L(ViewGroup viewGroup, View view, T t, T t2);

    @Override // ivas.gov.bisp.enumeration.aM.J
    public void i(T t) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 | 117) << 1;
        int i4 = -(((~i2) & 117) | (i2 & (-118)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            K(t);
        } else {
            K(t);
            int i6 = 15 / 0;
        }
    }

    @Override // ivas.gov.bisp.enumeration.aM.J
    public String[] s() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 43;
        int i4 = ((i2 & 43) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        String[] strArr = z;
        int i8 = i2 ^ 107;
        int i9 = ((i2 & 107) | i8) << 1;
        int i10 = -i8;
        int i11 = (i9 ^ i10) + ((i9 & i10) << 1);
        a = i11 % 128;
        int i12 = i11 % 2;
        return strArr;
    }

    public final void K(T t) {
        Map<String, Object> map;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 95) + ((i2 & 95) << 1);
        a = i3 % 128;
        if (i3 % 2 != 0) {
            t.d.getVisibility();
            Map<String, Object> map2 = t.c;
            throw null;
        }
        t.c.put("android:visibility:visibility", Integer.valueOf(t.d.getVisibility()));
        int i4 = a;
        int i5 = (((i4 & (-86)) | ((~i4) & 85)) - (~((i4 & 85) << 1))) - 1;
        b = i5 % 128;
        int i6 = i5 % 2;
        Map<String, Object> map3 = t.c;
        View view = t.d;
        int i7 = a + 15;
        b = i7 % 128;
        int i8 = i7 % 2;
        map3.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        int i9 = b;
        int i10 = i9 & 81;
        int i11 = (((i9 ^ 81) | i10) << 1) - ((i9 | 81) & (~i10));
        a = i11 % 128;
        if (i11 % 2 != 0) {
            t.d.getLocationOnScreen(iArr);
            map = t.c;
            int i12 = 67 / 0;
        } else {
            t.d.getLocationOnScreen(iArr);
            map = t.c;
        }
        map.put("android:visibility:screenLocation", iArr);
        int i13 = b + 107;
        a = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    @Override // ivas.gov.bisp.enumeration.aM.J
    public boolean t(T t, T t2) {
        boolean zContainsKey;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 43) + ((i2 & 43) << 1);
        a = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        boolean z2 = false;
        if (t == null) {
            int i4 = i2 & 119;
            int i5 = i4 + ((i2 ^ 119) | i4);
            a = i5 % 128;
            int i6 = i5 % 2;
            if (t2 == null) {
                int i7 = ((i2 ^ 59) | (i2 & 59)) << 1;
                int i8 = -((i2 & (-60)) | ((~i2) & 59));
                int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
                int i10 = i9 % 128;
                a = i10;
                z2 = i9 % 2 != 0;
                int i11 = i10 & 93;
                int i12 = (i10 | 93) & (~i11);
                int i13 = -(-(i11 << 1));
                int i14 = (i12 & i13) + (i12 | i13);
                b = i14 % 128;
                int i15 = i14 % 2;
                return z2;
            }
        }
        if (t != null) {
            int i16 = a;
            int i17 = i16 & 91;
            int i18 = (i17 - (~(-(-((i16 ^ 91) | i17))))) - 1;
            b = i18 % 128;
            int i19 = i18 % 2;
            if (t2 != null) {
                int i20 = ((i16 ^ 68) + ((i16 & 68) << 1)) - 1;
                b = i20 % 128;
                if (i20 % 2 == 0) {
                    zContainsKey = t2.c.containsKey("android:visibility:visibility");
                    int i21 = 2 / 0;
                } else {
                    zContainsKey = t2.c.containsKey("android:visibility:visibility");
                }
                int i22 = a;
                int i23 = (i22 & 41) + (i22 | 41);
                b = i23 % 128;
                int i24 = i23 % 2;
                Map<String, Object> map = t.c;
                int i25 = a;
                int i26 = i25 & 105;
                int i27 = (i25 | 105) & (~i26);
                int i28 = -(-(i26 << 1));
                int i29 = (i27 & i28) + (i27 | i28);
                b = i29 % 128;
                if (i29 % 2 == 0) {
                    map.containsKey("android:visibility:visibility");
                    obj.hashCode();
                    throw null;
                }
                if (zContainsKey != map.containsKey("android:visibility:visibility")) {
                    int i30 = a;
                    int i31 = i30 & 39;
                    int i32 = ((i30 | 39) & (~i31)) + (i31 << 1);
                    b = i32 % 128;
                    if (i32 % 2 == 0) {
                        int i33 = 82 / 0;
                    }
                    return false;
                }
            }
        }
        bHt bhtJ = J(t, t2);
        if (bhtJ.a) {
            int i34 = b;
            int i35 = i34 & 113;
            int i36 = i34 | 113;
            int i37 = (i35 & i36) + (i36 | i35);
            a = i37 % 128;
            if (i37 % 2 != 0) {
                int i38 = bhtJ.c;
                obj.hashCode();
                throw null;
            }
            if (bhtJ.c == 0 || bhtJ.d == 0) {
                int i39 = b;
                int i40 = (i39 ^ 25) + ((i39 & 25) << 1);
                a = i40 % 128;
                int i41 = i40 % 2;
                z2 = true;
            }
        }
        int i42 = a;
        int i43 = (i42 | 5) << 1;
        int i44 = -(i42 ^ 5);
        int i45 = (i43 ^ i44) + ((i44 & i43) << 1);
        b = i45 % 128;
        if (i45 % 2 != 0) {
            return z2;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0334  */
    /* JADX WARN: Code duplicated, block: B:117:0x034b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x034d  */
    /* JADX WARN: Code duplicated, block: B:120:0x0350  */
    /* JADX WARN: Code duplicated, block: B:121:0x0355  */
    /* JADX WARN: Code duplicated, block: B:122:0x0383  */
    /* JADX WARN: Code duplicated, block: B:124:0x0388  */
    /* JADX WARN: Code duplicated, block: B:128:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:130:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:132:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:134:0x03db  */
    /* JADX WARN: Code duplicated, block: B:135:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:138:0x0427  */
    /* JADX WARN: Code duplicated, block: B:139:0x0431  */
    /* JADX WARN: Code duplicated, block: B:142:0x0452  */
    /* JADX WARN: Code duplicated, block: B:145:0x045a  */
    /* JADX WARN: Code duplicated, block: B:147:0x045e  */
    /* JADX WARN: Code duplicated, block: B:149:0x0499  */
    /* JADX WARN: Code duplicated, block: B:150:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:152:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:153:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:157:0x04f2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:160:0x050e  */
    /* JADX WARN: Code duplicated, block: B:162:0x051a  */
    /* JADX WARN: Code duplicated, block: B:163:0x051e  */
    /* JADX WARN: Code duplicated, block: B:167:0x0556  */
    /* JADX WARN: Code duplicated, block: B:168:0x055f  */
    /* JADX WARN: Code duplicated, block: B:171:0x057d  */
    /* JADX WARN: Code duplicated, block: B:172:0x0585  */
    /* JADX WARN: Code duplicated, block: B:174:0x058d  */
    /* JADX WARN: Code duplicated, block: B:185:0x05f2  */
    /* JADX WARN: Code duplicated, block: B:207:0x06b2  */
    /* JADX WARN: Code duplicated, block: B:209:0x06c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:210:0x06c7  */
    /* JADX WARN: Code duplicated, block: B:211:0x06cf  */
    /* JADX WARN: Code duplicated, block: B:213:0x06ed  */
    /* JADX WARN: Code duplicated, block: B:214:0x06f5  */
    /* JADX WARN: Code duplicated, block: B:215:0x06f9  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:53:0x012f  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:89:0x01db  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0091, code lost:
    
        if (J(r5, r1).a == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
    
        if (r5.e != null) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ivas.gov.bisp.enumeration.aM.J
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.animation.Animator o(android.view.ViewGroup r27, ivas.gov.bisp.enumeration.aM.T r28, ivas.gov.bisp.enumeration.aM.T r29) {
        /*
            Method dump skipped, instruction units count: 1904
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.aM.AbstractC0075s.o(android.view.ViewGroup, ivas.gov.bisp.enumeration.aM.T, ivas.gov.bisp.enumeration.aM.T):android.animation.Animator");
    }

    /* JADX WARN: Code duplicated, block: B:15:0x008f  */
    /* JADX WARN: Code duplicated, block: B:24:0x012a  */
    /* JADX WARN: Code duplicated, block: B:52:0x024c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x024e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0260  */
    /* JADX WARN: Code duplicated, block: B:58:0x0268  */
    /* JADX WARN: Code duplicated, block: B:60:0x026c  */
    /* JADX WARN: Code duplicated, block: B:61:0x027e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x0280  */
    /* JADX WARN: Code duplicated, block: B:64:0x0290  */
    /* JADX WARN: Code duplicated, block: B:66:0x0294  */
    /* JADX WARN: Code duplicated, block: B:67:0x02a5  */
    public final bHt J(T t, T t2) {
        int i;
        int i2;
        int i3 = 2 % 2;
        bHt bht = new bHt();
        bht.a = false;
        bht.b = false;
        int i4 = b + 24;
        int i5 = (i4 ^ (-1)) + (i4 << 1);
        int i6 = i5 % 128;
        a = i6;
        int i7 = i5 % 2;
        Object obj = null;
        if (t != null) {
            int i8 = (i6 & (-50)) | ((~i6) & 49);
            int i9 = -(-((i6 & 49) << 1));
            int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
            b = i10 % 128;
            if (i10 % 2 == 0) {
                t.c.containsKey("android:visibility:visibility");
                throw null;
            }
            if (t.c.containsKey("android:visibility:visibility")) {
                Integer num = (Integer) t.c.get("android:visibility:visibility");
                int i11 = a;
                int i12 = i11 ^ 45;
                int i13 = -(-((i11 & 45) << 1));
                int i14 = (i12 & i13) + (i13 | i12);
                b = i14 % 128;
                int i15 = i14 % 2;
                bht.c = num.intValue();
                Object obj2 = t.c.get("android:visibility:parent");
                int i16 = a;
                int i17 = i16 & 47;
                int i18 = (i16 | 47) & (~i17);
                int i19 = -(-(i17 << 1));
                int i20 = (i18 ^ i19) + ((i18 & i19) << 1);
                b = i20 % 128;
                if (i20 % 2 == 0) {
                    bht.f = (ViewGroup) obj2;
                    throw null;
                }
                bht.f = (ViewGroup) obj2;
            } else {
                bht.c = -1;
                bht.f = null;
                int i21 = a;
                int i22 = (i21 | 107) << 1;
                int i23 = -(((~i21) & 107) | (i21 & (-108)));
                int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
                b = i24 % 128;
                int i25 = i24 % 2;
            }
        } else {
            bht.c = -1;
            bht.f = null;
            int i26 = a;
            int i27 = (i26 | 107) << 1;
            int i28 = -(((~i26) & 107) | (i26 & (-108)));
            int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
            b = i29 % 128;
            int i210 = i29 % 2;
        }
        if (t2 != null) {
            int i30 = a;
            int i31 = i30 & 65;
            int i32 = (i30 | 65) & (~i31);
            int i33 = -(-(i31 << 1));
            int i34 = (i32 & i33) + (i32 | i33);
            b = i34 % 128;
            int i35 = i34 % 2;
            if (!(!t2.c.containsKey("android:visibility:visibility"))) {
                int i36 = b;
                int i37 = i36 & 103;
                int i38 = i36 | 103;
                int i39 = (i37 ^ i38) + ((i38 & i37) << 1);
                a = i39 % 128;
                int i40 = i39 % 2;
                Integer num2 = (Integer) t2.c.get("android:visibility:visibility");
                int i41 = b;
                int i42 = (i41 & (-106)) | ((~i41) & 105);
                int i43 = (i41 & 105) << 1;
                int i44 = (i42 ^ i43) + ((i43 & i42) << 1);
                a = i44 % 128;
                int i45 = i44 % 2;
                bht.d = num2.intValue();
                Object obj3 = t2.c.get("android:visibility:parent");
                int i46 = a;
                int i47 = i46 & 45;
                int i48 = i46 | 45;
                int i49 = (i47 ^ i48) + ((i48 & i47) << 1);
                b = i49 % 128;
                if (i49 % 2 == 0) {
                    bht.e = (ViewGroup) obj3;
                    throw null;
                }
                bht.e = (ViewGroup) obj3;
                int i50 = a;
                int i51 = (i50 ^ 51) + ((i50 & 51) << 1);
                b = i51 % 128;
                int i52 = i51 % 2;
            } else {
                bht.d = -1;
                bht.e = null;
                int i53 = b;
                int i54 = (((i53 | 67) << 1) - (~(-(((~i53) & 67) | (i53 & (-68)))))) - 1;
                a = i54 % 128;
                int i55 = i54 % 2;
            }
        } else {
            bht.d = -1;
            bht.e = null;
            int i56 = b;
            int i57 = (((i56 | 67) << 1) - (~(-(((~i56) & 67) | (i56 & (-68)))))) - 1;
            a = i57 % 128;
            int i58 = i57 % 2;
        }
        if (t != null) {
            int i59 = b;
            int i60 = ((i59 | 101) << 1) - (i59 ^ 101);
            a = i60 % 128;
            int i61 = i60 % 2;
            if (t2 != null) {
                int i62 = (i59 & 119) + (i59 | 119);
                a = i62 % 128;
                int i63 = i62 % 2;
                int i64 = bht.c;
                int i65 = bht.d;
                int i66 = b;
                int i67 = i66 & 39;
                int i68 = i66 | 39;
                int i69 = (i67 ^ i68) + ((i68 & i67) << 1);
                int i70 = i69 % 128;
                a = i70;
                int i71 = i69 % 2;
                if (i64 == i65) {
                    int i72 = ((i70 | 123) << 1) - (i70 ^ 123);
                    b = i72 % 128;
                    int i73 = i72 % 2;
                    if (bht.f == bht.e) {
                        int i74 = b;
                        int i75 = i74 ^ 123;
                        int i76 = ((i74 & 123) | i75) << 1;
                        int i77 = -i75;
                        int i78 = (i76 & i77) + (i76 | i77);
                        a = i78 % 128;
                        if (i78 % 2 == 0) {
                            return bht;
                        }
                        throw null;
                    }
                }
                if (i64 != i65) {
                    int i79 = b;
                    int i80 = (i79 & 123) + (i79 | 123);
                    int i81 = i80 % 128;
                    a = i81;
                    int i82 = i80 % 2;
                    if (i64 == 0) {
                        int i83 = i81 & 19;
                        int i84 = (i83 - (~(-(-((i81 ^ 19) | i83))))) - 1;
                        b = i84 % 128;
                        int i85 = i84 % 2;
                        bht.b = false;
                        bht.a = true;
                        int i86 = b + 19;
                        a = i86 % 128;
                        int i87 = i86 % 2;
                    } else if (i65 == 0) {
                        int i88 = i79 & 93;
                        int i89 = ((~i88) & (i79 | 93)) + (i88 << 1);
                        a = i89 % 128;
                        if (i89 % 2 != 0) {
                            bht.b = true;
                            bht.a = false;
                        } else {
                            bht.b = true;
                            bht.a = true;
                        }
                        int i90 = a;
                        int i91 = (i90 & (-18)) | ((~i90) & 17);
                        int i92 = -(-((i90 & 17) << 1));
                        int i93 = (i91 ^ i92) + ((i92 & i91) << 1);
                        b = i93 % 128;
                        int i94 = i93 % 2;
                    }
                } else if (bht.e == null) {
                    int i95 = a;
                    int i96 = i95 ^ 125;
                    int i97 = -(-((i95 & 125) << 1));
                    int i98 = (i96 & i97) + (i97 | i96);
                    b = i98 % 128;
                    int i99 = i98 % 2;
                    bht.b = false;
                    bht.a = true;
                    int i100 = b;
                    int i101 = i100 ^ 49;
                    int i102 = (((i100 & 49) | i101) << 1) - i101;
                    a = i102 % 128;
                    int i103 = i102 % 2;
                } else if (bht.f == null) {
                    int i104 = b;
                    int i105 = i104 & 11;
                    int i106 = ((i104 | 11) & (~i105)) + (i105 << 1);
                    a = i106 % 128;
                    int i107 = i106 % 2;
                    bht.b = true;
                    bht.a = true;
                    int i108 = b;
                    int i109 = (-2) - (((i108 & 16) + (i108 | 16)) ^ (-1));
                    a = i109 % 128;
                    int i110 = i109 % 2;
                }
            } else if (t == null) {
                int i111 = a;
                int i112 = (i111 & 84) + (i111 | 84);
                i2 = (i112 ^ (-1)) + (i112 << 1);
                b = i2 % 128;
                if (i2 % 2 == 0) {
                    int i113 = 82 / 0;
                    if (bht.d == 0) {
                        bht.b = true;
                        bht.a = true;
                        int i114 = a;
                        int i115 = (i114 ^ 95) + ((i114 & 95) << 1);
                        b = i115 % 128;
                        int i116 = i115 % 2;
                    } else if (t2 == null) {
                        int i117 = b;
                        i = ((i117 ^ 56) + ((i117 & 56) << 1)) - 1;
                        a = i % 128;
                        if (i % 2 == 0) {
                            int i118 = bht.c;
                            obj.hashCode();
                            throw null;
                        }
                        if (bht.c == 0) {
                            bht.b = false;
                            bht.a = true;
                            int i119 = b;
                            int i120 = (i119 & 113) + (i119 | 113);
                            a = i120 % 128;
                            int i121 = i120 % 2;
                        }
                    }
                } else if (bht.d == 0) {
                    bht.b = true;
                    bht.a = true;
                    int i1110 = a;
                    int i1111 = (i1110 ^ 95) + ((i1110 & 95) << 1);
                    b = i1111 % 128;
                    int i1112 = i1111 % 2;
                } else if (t2 == null) {
                    int i1113 = b;
                    i = ((i1113 ^ 56) + ((i1113 & 56) << 1)) - 1;
                    a = i % 128;
                    if (i % 2 == 0) {
                        int i1114 = bht.c;
                        obj.hashCode();
                        throw null;
                    }
                    if (bht.c == 0) {
                        bht.b = false;
                        bht.a = true;
                        int i1115 = b;
                        int i122 = (i1115 & 113) + (i1115 | 113);
                        a = i122 % 128;
                        int i123 = i122 % 2;
                    }
                }
            } else if (t2 == null) {
                int i1116 = b;
                i = ((i1116 ^ 56) + ((i1116 & 56) << 1)) - 1;
                a = i % 128;
                if (i % 2 == 0) {
                    int i1117 = bht.c;
                    obj.hashCode();
                    throw null;
                }
                if (bht.c == 0) {
                    bht.b = false;
                    bht.a = true;
                    int i1118 = b;
                    int i124 = (i1118 & 113) + (i1118 | 113);
                    a = i124 % 128;
                    int i125 = i124 % 2;
                }
            }
        } else if (t == null) {
            int i1119 = a;
            int i1120 = (i1119 & 84) + (i1119 | 84);
            i2 = (i1120 ^ (-1)) + (i1120 << 1);
            b = i2 % 128;
            if (i2 % 2 == 0) {
                int i1121 = 82 / 0;
                if (bht.d == 0) {
                    bht.b = true;
                    bht.a = true;
                    int i11110 = a;
                    int i11111 = (i11110 ^ 95) + ((i11110 & 95) << 1);
                    b = i11111 % 128;
                    int i11112 = i11111 % 2;
                } else if (t2 == null) {
                    int i11113 = b;
                    i = ((i11113 ^ 56) + ((i11113 & 56) << 1)) - 1;
                    a = i % 128;
                    if (i % 2 == 0) {
                        int i11114 = bht.c;
                        obj.hashCode();
                        throw null;
                    }
                    if (bht.c == 0) {
                        bht.b = false;
                        bht.a = true;
                        int i11115 = b;
                        int i126 = (i11115 & 113) + (i11115 | 113);
                        a = i126 % 128;
                        int i127 = i126 % 2;
                    }
                }
            } else if (bht.d == 0) {
                bht.b = true;
                bht.a = true;
                int i11116 = a;
                int i11117 = (i11116 ^ 95) + ((i11116 & 95) << 1);
                b = i11117 % 128;
                int i11118 = i11117 % 2;
            } else if (t2 == null) {
                int i11119 = b;
                i = ((i11119 ^ 56) + ((i11119 & 56) << 1)) - 1;
                a = i % 128;
                if (i % 2 == 0) {
                    int i111110 = bht.c;
                    obj.hashCode();
                    throw null;
                }
                if (bht.c == 0) {
                    bht.b = false;
                    bht.a = true;
                    int i111111 = b;
                    int i128 = (i111111 & 113) + (i111111 | 113);
                    a = i128 % 128;
                    int i129 = i128 % 2;
                }
            }
        } else if (t2 == null) {
            int i111112 = b;
            i = ((i111112 ^ 56) + ((i111112 & 56) << 1)) - 1;
            a = i % 128;
            if (i % 2 == 0) {
                int i111113 = bht.c;
                obj.hashCode();
                throw null;
            }
            if (bht.c == 0) {
                bht.b = false;
                bht.a = true;
                int i111114 = b;
                int i1210 = (i111114 & 113) + (i111114 | 113);
                a = i1210 % 128;
                int i1211 = i1210 % 2;
            }
        }
        int i130 = b;
        int i131 = i130 & 37;
        int i132 = ((i130 ^ 37) | i131) << 1;
        int i133 = -((i130 | 37) & (~i131));
        int i134 = (i132 ^ i133) + ((i133 & i132) << 1);
        a = i134 % 128;
        int i135 = i134 % 2;
        return bht;
    }
}
