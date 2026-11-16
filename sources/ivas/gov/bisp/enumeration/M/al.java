package ivas.gov.bisp.enumeration.M;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.media.session.IMediaSession;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class al {
    private static int a = 0;
    private static int b = 1;
    public static int c;
    public final AccessibilityNodeInfo d;
    public int e = -1;
    public int f = -1;

    public static class aXC {
        private static int a = 1;
        private static int b;
        public static final aXC c;
        public static final aXC d;
        public static final aXC e;
        public static final aXC f;
        public static final aXC g;
        public static final aXC h;
        public static final aXC i;
        public static final aXC j;
        public final Object k;
        public final int l;
        public final Class<? extends n.aXs> m;
        public final n n;

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction10 = null;
            new aXC(1, null);
            new aXC(2, null);
            new aXC(4, null);
            new aXC(8, null);
            e = new aXC(16, null);
            new aXC(32, null);
            new aXC(64, null);
            new aXC(128, null);
            new aXC(256, null, n.aXt.class);
            new aXC(512, null, n.aXt.class);
            new aXC(1024, null, n.aXu.class);
            new aXC(2048, null, n.aXu.class);
            d = new aXC(4096, null);
            f = new aXC(8192, null);
            new aXC(16384, null);
            new aXC(32768, null);
            new aXC(65536, null);
            new aXC(131072, null, n.aXy.class);
            g = new aXC(262144, null);
            c = new aXC(524288, null);
            h = new aXC(1048576, null);
            new aXC(2097152, null, n.aXz.class);
            int i2 = Build.VERSION.SDK_INT;
            new aXC(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
            new aXC(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, n.aXw.class);
            i = new aXC(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
            new aXC(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
            j = new aXC(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
            new aXC(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
            if (i2 >= 29) {
                int i3 = b;
                int i4 = i3 ^ 13;
                int i5 = ((((i3 & 13) | i4) << 1) - (~(-i4))) - 1;
                a = i5 % 128;
                if (i5 % 2 == 0) {
                    AccessibilityNodeInfo.AccessibilityAction accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
                    throw null;
                }
                AccessibilityNodeInfo.AccessibilityAction accessibilityAction12 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
                int i6 = a;
                int i7 = (i6 & 103) + (i6 | 103);
                b = i7 % 128;
                int i8 = i7 % 2;
                int i9 = 2 % 2;
                accessibilityAction = accessibilityAction12;
            } else {
                int i10 = a + 109;
                b = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 4 % 2;
                } else {
                    int i12 = 2 % 2;
                }
                accessibilityAction = null;
            }
            new aXC(accessibilityAction, R.id.accessibilityActionPageUp, null, null, null);
            int i13 = a;
            int i14 = (i13 ^ 13) + ((i13 & 13) << 1);
            int i15 = i14 % 128;
            b = i15;
            int i16 = i14 % 2;
            if (i2 >= 29) {
                int i17 = i15 + 11;
                a = i17 % 128;
                if (i17 % 2 == 0) {
                    AccessibilityNodeInfo.AccessibilityAction accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
                    throw null;
                }
                int i18 = 2 % 2;
                accessibilityAction2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
            } else {
                int i19 = i15 | 87;
                int i20 = i19 << 1;
                int i21 = -((~(i15 & 87)) & i19);
                int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
                a = i22 % 128;
                int i23 = i22 % 2;
                int i24 = 2 % 2;
                accessibilityAction2 = null;
            }
            new aXC(accessibilityAction2, R.id.accessibilityActionPageDown, null, null, null);
            int i25 = b;
            int i26 = (i25 ^ 35) + ((i25 & 35) << 1);
            a = i26 % 128;
            int i27 = i26 % 2;
            if (i2 >= 29) {
                int i28 = ((((i25 ^ 125) | (i25 & 125)) << 1) - (~(-(((~i25) & 125) | (i25 & (-126)))))) - 1;
                a = i28 % 128;
                if (i28 % 2 == 0) {
                    AccessibilityNodeInfo.AccessibilityAction accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
                    throw null;
                }
                int i29 = 2 % 2;
                accessibilityAction3 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
            } else {
                int i30 = ((i25 | 13) << 1) - (i25 ^ 13);
                a = i30 % 128;
                int i31 = i30 % 2;
                int i32 = 2 % 2;
                accessibilityAction3 = null;
            }
            new aXC(accessibilityAction3, R.id.accessibilityActionPageLeft, null, null, null);
            if (i2 >= 29) {
                int i33 = a;
                int i34 = i33 & 35;
                int i35 = (i33 | 35) & (~i34);
                int i36 = -(-(i34 << 1));
                int i37 = (i35 & i36) + (i35 | i36);
                b = i37 % 128;
                if (i37 % 2 != 0) {
                    AccessibilityNodeInfo.AccessibilityAction accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
                    throw null;
                }
                AccessibilityNodeInfo.AccessibilityAction accessibilityAction16 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
                int i38 = b;
                int i39 = (((i38 | 36) << 1) - (i38 ^ 36)) - 1;
                a = i39 % 128;
                int i40 = i39 % 2;
                int i41 = 2 % 2;
                accessibilityAction4 = accessibilityAction16;
            } else {
                int i42 = b;
                int i43 = i42 & 99;
                int i44 = -(-(i42 | 99));
                int i45 = (i43 ^ i44) + ((i44 & i43) << 1);
                a = i45 % 128;
                int i46 = i45 % 2;
                int i47 = 2 % 2;
                accessibilityAction4 = null;
            }
            new aXC(accessibilityAction4, R.id.accessibilityActionPageRight, null, null, null);
            new aXC(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
            int i48 = (-2) - ((a + 110) ^ (-1));
            int i49 = i48 % 128;
            b = i49;
            int i50 = i48 % 2;
            if (i2 >= 24) {
                int i51 = (((i49 & (-94)) | ((~i49) & 93)) - (~(-(-((i49 & 93) << 1))))) - 1;
                a = i51 % 128;
                int i52 = i51 % 2;
                AccessibilityNodeInfo.AccessibilityAction accessibilityAction17 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
                int i53 = b;
                int i54 = ((i53 & 98) + (i53 | 98)) - 1;
                a = i54 % 128;
                if (i54 % 2 != 0) {
                    int i55 = 2 % 2;
                }
                accessibilityAction5 = accessibilityAction17;
            } else {
                int i56 = i49 & 57;
                int i57 = (i49 | 57) & (~i56);
                int i58 = -(-(i56 << 1));
                int i59 = (i57 ^ i58) + ((i58 & i57) << 1);
                a = i59 % 128;
                if (i59 % 2 != 0) {
                    int i60 = 2 % 2;
                }
                accessibilityAction5 = null;
            }
            new aXC(accessibilityAction5, R.id.accessibilityActionSetProgress, null, null, n.aXx.class);
            int i61 = b;
            int i62 = i61 & 41;
            int i63 = i61 | 41;
            int i64 = (i62 & i63) + (i62 | i63);
            int i65 = i64 % 128;
            a = i65;
            int i66 = i64 % 2;
            if (i2 >= 26) {
                int i67 = (i65 ^ 63) + ((i65 & 63) << 1);
                b = i67 % 128;
                if (i67 % 2 != 0) {
                    AccessibilityNodeInfo.AccessibilityAction accessibilityAction18 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
                    accessibilityAction10.hashCode();
                    throw null;
                }
                int i68 = 2 % 2;
                accessibilityAction6 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
            } else {
                int i69 = i61 + 103;
                a = i69 % 128;
                int i70 = i69 % 2;
                int i71 = 2 % 2;
                accessibilityAction6 = null;
            }
            new aXC(accessibilityAction6, R.id.accessibilityActionMoveWindow, null, null, n.aXv.class);
            int i72 = b;
            int i73 = i72 & 17;
            int i74 = (i73 - (~((i72 ^ 17) | i73))) - 1;
            int i75 = i74 % 128;
            a = i75;
            int i76 = i74 % 2;
            if (i2 >= 28) {
                int i77 = (i75 & 107) + (i75 | 107);
                b = i77 % 128;
                int i78 = i77 % 2;
                AccessibilityNodeInfo.AccessibilityAction accessibilityAction19 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
                int i79 = a;
                int i80 = (i79 | 63) << 1;
                int i81 = -(i79 ^ 63);
                int i82 = (i80 & i81) + (i81 | i80);
                b = i82 % 128;
                if (i82 % 2 != 0) {
                    int i83 = 2 / 2;
                } else {
                    int i84 = 2 % 2;
                }
                accessibilityAction7 = accessibilityAction19;
            } else {
                int i85 = ((i72 ^ 58) + ((i72 & 58) << 1)) - 1;
                a = i85 % 128;
                if (i85 % 2 != 0) {
                    int i86 = 2 % 2;
                }
                accessibilityAction7 = null;
            }
            new aXC(accessibilityAction7, R.id.accessibilityActionShowTooltip, null, null, null);
            if (i2 >= 28) {
                int i87 = b;
                int i88 = i87 & 69;
                int i89 = (i87 | 69) & (~i88);
                int i90 = i88 << 1;
                int i91 = (i89 ^ i90) + ((i89 & i90) << 1);
                a = i91 % 128;
                int i92 = i91 % 2;
                AccessibilityNodeInfo.AccessibilityAction accessibilityAction20 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
                int i93 = a;
                int i94 = i93 & 57;
                int i95 = -(-((i93 ^ 57) | i94));
                int i96 = ((i94 | i95) << 1) - (i95 ^ i94);
                b = i96 % 128;
                int i97 = i96 % 2;
                int i98 = 2 % 2;
                accessibilityAction8 = accessibilityAction20;
            } else {
                int i99 = a;
                int i100 = i99 & 89;
                int i101 = i100 + ((i99 ^ 89) | i100);
                b = i101 % 128;
                int i102 = i101 % 2;
                int i103 = 2 % 2;
                accessibilityAction8 = null;
            }
            new aXC(accessibilityAction8, R.id.accessibilityActionHideTooltip, null, null, null);
            int i104 = b + 73;
            int i105 = i104 % 128;
            a = i105;
            if (i104 % 2 != 0 ? i2 < 30 : i2 < 105) {
                int i106 = ((i105 & (-8)) | ((~i105) & 7)) + ((i105 & 7) << 1);
                b = i106 % 128;
                if (i106 % 2 != 0) {
                    int i107 = 5 / 4;
                } else {
                    int i108 = 2 % 2;
                }
                accessibilityAction9 = null;
            } else {
                AccessibilityNodeInfo.AccessibilityAction accessibilityAction21 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
                int i109 = a + 67;
                b = i109 % 128;
                int i110 = i109 % 2;
                int i111 = 2 % 2;
                accessibilityAction9 = accessibilityAction21;
            }
            new aXC(accessibilityAction9, R.id.accessibilityActionPressAndHold, null, null, null);
            int i112 = a;
            int i113 = ((i112 & 42) + (i112 | 42)) - 1;
            int i114 = i113 % 128;
            b = i114;
            int i115 = i113 % 2;
            if (i2 >= 30) {
                int i116 = (((i114 | 96) << 1) - (i114 ^ 96)) - 1;
                a = i116 % 128;
                int i117 = i116 % 2;
                accessibilityAction10 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
                int i118 = a;
                int i119 = ((i118 | 93) << 1) - (i118 ^ 93);
                b = i119 % 128;
                if (i119 % 2 == 0) {
                    int i120 = 2 % 2;
                }
            }
            new aXC(accessibilityAction10, R.id.accessibilityActionImeEnter, null, null, null);
            int i121 = b;
            int i122 = (i121 & 105) + (i121 | 105);
            a = i122 % 128;
            int i123 = i122 % 2;
        }

        public aXC(int i2, CharSequence charSequence) {
            this(null, i2, null, null, null);
        }

        public int e() {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = i3 & 21;
            int i5 = (((i3 ^ 21) | i4) << 1) - ((i3 | 21) & (~i4));
            b = i5 % 128;
            int i6 = i5 % 2;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = (AccessibilityNodeInfo.AccessibilityAction) this.k;
            if (i6 == 0) {
                return accessibilityAction.getId();
            }
            int i7 = 87 / 0;
            return accessibilityAction.getId();
        }

        public CharSequence f() {
            int i2 = 2 % 2;
            int i3 = a + 47;
            b = i3 % 128;
            int i4 = i3 % 2;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = (AccessibilityNodeInfo.AccessibilityAction) this.k;
            if (i4 == 0) {
                return accessibilityAction.getLabel();
            }
            accessibilityAction.getLabel();
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x003f  */
        /* JADX WARN: Code duplicated, block: B:12:0x004b  */
        /* JADX WARN: Code duplicated, block: B:9:0x002c A[PHI: r3
  0x002c: PHI (r3v6 java.lang.Object) = (r3v5 java.lang.Object), (r3v21 java.lang.Object) binds: [B:8:0x002a, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
        public int hashCode() {
            Object obj;
            int iHashCode;
            int i2;
            int i3 = 2 % 2;
            int i4 = b;
            int i5 = ((i4 ^ 29) | (i4 & 29)) << 1;
            int i6 = -(((~i4) & 29) | (i4 & (-30)));
            int i7 = (i5 & i6) + (i6 | i5);
            int i8 = i7 % 128;
            a = i8;
            if (i7 % 2 == 0) {
                obj = this.k;
                int i9 = 85 / 0;
                if (obj != null) {
                    iHashCode = obj.hashCode();
                    int i10 = b + 58;
                    int i11 = (i10 ^ (-1)) + (i10 << 1);
                    a = i11 % 128;
                    int i12 = i11 % 2;
                } else {
                    i2 = (i8 & 117) + (i8 | 117);
                    b = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i13 = 2 % 5;
                    }
                    iHashCode = 0;
                }
            } else {
                obj = this.k;
                if (obj != null) {
                    iHashCode = obj.hashCode();
                    int i14 = b + 58;
                    int i15 = (i14 ^ (-1)) + (i14 << 1);
                    a = i15 % 128;
                    int i16 = i15 % 2;
                } else {
                    i2 = (i8 & 117) + (i8 | 117);
                    b = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i17 = 2 % 5;
                    }
                    iHashCode = 0;
                }
            }
            int i18 = b;
            int i19 = (((i18 & (-106)) | ((~i18) & 105)) - (~(-(-((i18 & 105) << 1))))) - 1;
            a = i19 % 128;
            if (i19 % 2 == 0) {
                int i20 = 3 / 0;
            }
            return iHashCode;
        }

        public aXC(int i2, CharSequence charSequence, Class<? extends n.aXs> cls) {
            this(null, i2, null, null, cls);
        }

        public aXC(Object obj, int i2, CharSequence charSequence, n nVar, Class<? extends n.aXs> cls) {
            this.l = i2;
            this.n = nVar;
            if (obj != null) {
                this.k = obj;
                int i3 = b + 83;
                a = i3 % 128;
                if (i3 % 2 != 0) {
                }
                this.m = cls;
                int i4 = b;
                int i5 = i4 & 9;
                int i6 = i4 | 9;
                int i7 = (i5 & i6) + (i6 | i5);
                a = i7 % 128;
                int i8 = i7 % 2;
            }
            this.k = new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence);
            int i9 = b;
            int i10 = i9 ^ 79;
            int i11 = -(-((i9 & 79) << 1));
            int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
            a = i12 % 128;
            int i13 = i12 % 2;
            int i14 = 2 % 2;
            this.m = cls;
            int i15 = b;
            int i16 = i15 & 9;
            int i17 = i15 | 9;
            int i18 = (i16 & i17) + (i17 | i16);
            a = i18 % 128;
            int i19 = i18 % 2;
        }

        public boolean equals(Object obj) {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = i3 & 55;
            int i5 = (((i3 | 55) & (~i4)) - (~(-(-(i4 << 1))))) - 1;
            int i6 = i5 % 128;
            b = i6;
            int i7 = i5 % 2;
            if (obj == null) {
                int i8 = (((i6 & (-118)) | ((~i6) & 117)) - (~((i6 & 117) << 1))) - 1;
                a = i8 % 128;
                int i9 = i8 % 2;
                int i10 = i6 & 117;
                int i11 = ((i6 ^ 117) | i10) << 1;
                int i12 = -((i6 | 117) & (~i10));
                int i13 = (i11 ^ i12) + ((i11 & i12) << 1);
                a = i13 % 128;
                if (i13 % 2 == 0) {
                    int i14 = 64 / 0;
                }
                return false;
            }
            if (!(obj instanceof aXC)) {
                int i15 = i6 + 107;
                a = i15 % 128;
                int i16 = i15 % 2;
                int i17 = i6 + 71;
                a = i17 % 128;
                int i18 = i17 % 2;
                return false;
            }
            aXC axc = (aXC) obj;
            Object obj2 = this.k;
            if (obj2 == null) {
                int i19 = i6 & 103;
                int i20 = ((((i6 ^ 103) | i19) << 1) - (~(-((~i19) & (i6 | 103))))) - 1;
                a = i20 % 128;
                int i21 = i20 % 2;
                if (axc.k != null) {
                    int i22 = i6 & 117;
                    int i23 = ((i6 | 117) & (~i22)) + (i22 << 1);
                    a = i23 % 128;
                    int i24 = i23 % 2;
                    return false;
                }
            } else if (!obj2.equals(axc.k)) {
                int i25 = a;
                int i26 = (i25 ^ 55) + ((i25 & 55) << 1);
                b = i26 % 128;
                int i27 = i26 % 2;
                int i28 = (-2) - ((i25 + 90) ^ (-1));
                b = i28 % 128;
                int i29 = i28 % 2;
                return false;
            }
            int i30 = b;
            int i31 = i30 & 79;
            int i32 = -(-(i30 | 79));
            int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
            a = i33 % 128;
            if (i33 % 2 == 0) {
                int i34 = 41 / 0;
            }
            return true;
        }
    }

    public static class aXD {
        private static int a = 0;
        private static int b = 1;
        public final Object c;

        public aXD(Object obj) {
            this.c = obj;
        }

        public static aXD c(int i, int i2, boolean z, int i3) {
            int i4 = 2 % 2;
            aXD axd = new aXD(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3));
            int i5 = a;
            int i6 = ((i5 ^ 86) + ((i5 & 86) << 1)) - 1;
            b = i6 % 128;
            int i7 = i6 % 2;
            return axd;
        }
    }

    public static class aXE {
        private static int a = 0;
        private static int b = 1;
        public final Object c;

        public aXE(Object obj) {
            this.c = obj;
        }

        public static aXE c(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            int i5 = 2 % 2;
            aXE axe = new aXE(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
            int i6 = b + 25;
            a = i6 % 128;
            if (i6 % 2 == 0) {
                return axe;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public al(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.d = accessibilityNodeInfo;
    }

    public static String c(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 ^ 73;
        int i5 = -(-((i3 & 73) << 1));
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        int i7 = i6 % 128;
        a = i7;
        int i8 = i6 % 2;
        if (i == 1) {
            int i9 = (-2) - (((i7 & 106) + (i7 | 106)) ^ (-1));
            b = i9 % 128;
            int i10 = i9 % 2;
            return "ACTION_FOCUS";
        }
        int i11 = i3 & 115;
        int i12 = (i3 | 115) & (~i11);
        int i13 = -(-(i11 << 1));
        int i14 = (i12 & i13) + (i12 | i13);
        int i15 = i14 % 128;
        a = i15;
        int i16 = i14 % 2;
        if (i == 2) {
            int i17 = i15 & 11;
            int i18 = i17 + ((i15 ^ 11) | i17);
            b = i18 % 128;
            if (i18 % 2 != 0) {
                return "ACTION_CLEAR_FOCUS";
            }
            throw null;
        }
        int i19 = ((i15 | 6) << 1) - (i15 ^ 6);
        int i20 = (i19 ^ (-1)) + (i19 << 1);
        int i21 = i20 % 128;
        b = i21;
        int i22 = i20 % 2;
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case IMediaSession.Stub.TRANSACTION_getRatingType /* 32 */:
                return "ACTION_LONG_CLICK";
            case 64:
                int i23 = i15 & 81;
                int i24 = ((((i15 ^ 81) | i23) << 1) - (~(-((i15 | 81) & (~i23))))) - 1;
                b = i24 % 128;
                int i25 = i24 % 2;
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                int i26 = i15 + 41;
                b = i26 % 128;
                int i27 = i26 % 2;
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                int i28 = (((i15 ^ 117) | (i15 & 117)) << 1) - (((~i15) & 117) | (i15 & (-118)));
                b = i28 % 128;
                int i29 = i28 % 2;
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                int i30 = i15 & 47;
                int i31 = (i30 - (~((i15 ^ 47) | i30))) - 1;
                b = i31 % 128;
                int i32 = i31 % 2;
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                int i33 = i15 & 45;
                int i34 = i15 | 45;
                int i35 = ((i33 | i34) << 1) - (i33 ^ i34);
                b = i35 % 128;
                if (i35 % 2 != 0) {
                    return "ACTION_SCROLL_BACKWARD";
                }
                throw null;
            case 16384:
                int i36 = ((i21 & 64) + (i21 | 64)) - 1;
                a = i36 % 128;
                int i37 = i36 % 2;
                return "ACTION_COPY";
            case 32768:
                int i38 = i21 & 47;
                int i39 = i38 + ((i21 ^ 47) | i38);
                a = i39 % 128;
                if (i39 % 2 != 0) {
                    int i40 = 69 / 0;
                }
                return "ACTION_PASTE";
            case 65536:
                int i41 = i15 & 55;
                int i42 = (i15 | 55) & (~i41);
                int i43 = -(-(i41 << 1));
                int i44 = (i42 ^ i43) + ((i43 & i42) << 1);
                b = i44 % 128;
                int i45 = i44 % 2;
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                int i46 = i15 + 59;
                b = i46 % 128;
                if (i46 % 2 == 0) {
                    int i47 = 6 / 0;
                }
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                int i48 = i15 + 69;
                b = i48 % 128;
                int i49 = i48 % 2;
                return "ACTION_MOVE_WINDOW";
            case R.id.accessibilityActionImeEnter:
                return "ACTION_IME_ENTER";
            default:
                switch (i) {
                    case R.id.accessibilityActionShowOnScreen:
                        int i50 = (((i15 | 110) << 1) - (i15 ^ 110)) - 1;
                        b = i50 % 128;
                        int i51 = i50 % 2;
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        int i52 = (i15 & 95) + (i15 | 95);
                        b = i52 % 128;
                        int i53 = i52 % 2;
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        int i54 = i15 & 113;
                        int i55 = -(-((i15 ^ 113) | i54));
                        int i56 = (i54 & i55) + (i54 | i55);
                        b = i56 % 128;
                        if (i56 % 2 != 0) {
                            return "ACTION_SCROLL_LEFT";
                        }
                        throw null;
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        int i57 = (i21 & (-82)) | ((~i21) & 81);
                        int i58 = -(-((i21 & 81) << 1));
                        int i59 = ((i57 | i58) << 1) - (i57 ^ i58);
                        a = i59 % 128;
                        int i60 = i59 % 2;
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case R.id.accessibilityActionShowTooltip:
                                int i61 = ((i21 & 86) + (i21 | 86)) - 1;
                                a = i61 % 128;
                                if (i61 % 2 == 0) {
                                    return "ACTION_SHOW_TOOLTIP";
                                }
                                throw null;
                            case R.id.accessibilityActionHideTooltip:
                                int i62 = ((i15 ^ 125) - (~((i15 & 125) << 1))) - 1;
                                b = i62 % 128;
                                if (i62 % 2 != 0) {
                                    return "ACTION_HIDE_TOOLTIP";
                                }
                                throw null;
                            case R.id.accessibilityActionPageUp:
                                int i63 = i21 + 7;
                                a = i63 % 128;
                                if (i63 % 2 != 0) {
                                    int i64 = 85 / 0;
                                }
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                return "ACTION_UNKNOWN";
                        }
                }
        }
    }

    public static ClickableSpan[] d(CharSequence charSequence) {
        Spanned spanned;
        int length;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 + 27;
        int i4 = i3 % 128;
        b = i4;
        if (i3 % 2 == 0) {
            boolean z = charSequence instanceof Spanned;
            throw null;
        }
        if (!(charSequence instanceof Spanned)) {
            int i5 = i4 & 13;
            int i6 = -(-((i4 ^ 13) | i5));
            int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
            a = i7 % 128;
            if (i7 % 2 == 0) {
                return null;
            }
            throw null;
        }
        int i8 = ((i2 & (-96)) | ((~i2) & 95)) + ((i2 & 95) << 1);
        b = i8 % 128;
        if (i8 % 2 == 0) {
            spanned = (Spanned) charSequence;
            length = charSequence.length();
        } else {
            spanned = (Spanned) charSequence;
            length = charSequence.length();
        }
        Object[] spans = spanned.getSpans(0, length, ClickableSpan.class);
        int i9 = a;
        int i10 = i9 & 7;
        int i11 = -(-((i9 ^ 7) | i10));
        int i12 = (i10 & i11) + (i11 | i10);
        b = i12 % 128;
        if (i12 % 2 != 0) {
            return (ClickableSpan[]) spans;
        }
        int i13 = 38 / 0;
        return (ClickableSpan[]) spans;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Code duplicated, block: B:9:0x0045  */
    public void e(Object obj) {
        AccessibilityNodeInfo.CollectionInfo collectionInfo;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 | 125) << 1;
        int i4 = -(i2 ^ 125);
        int i5 = (i3 & i4) + (i3 | i4);
        a = i5 % 128;
        int i6 = i5 % 2;
        AccessibilityNodeInfo accessibilityNodeInfo = this.d;
        if (i6 != 0) {
            int i7 = 87 / 0;
            if (obj == null) {
                int i8 = i2 & 55;
                int i9 = ((((i2 ^ 55) | i8) << 1) - (~(-((~i8) & (i2 | 55))))) - 1;
                a = i9 % 128;
                int i10 = i9 % 2;
                int i11 = (i2 ^ 97) + ((i2 & 97) << 1);
                a = i11 % 128;
                int i12 = i11 % 2;
                collectionInfo = null;
            } else {
                collectionInfo = (AccessibilityNodeInfo.CollectionInfo) ((aXD) obj).c;
                int i13 = b + 115;
                a = i13 % 128;
                int i14 = i13 % 2;
            }
        } else if (obj == null) {
            int i15 = i2 & 55;
            int i16 = ((((i2 ^ 55) | i15) << 1) - (~(-((~i15) & (i2 | 55))))) - 1;
            a = i16 % 128;
            int i17 = i16 % 2;
            int i18 = (i2 ^ 97) + ((i2 & 97) << 1);
            a = i18 % 128;
            int i19 = i18 % 2;
            collectionInfo = null;
        } else {
            collectionInfo = (AccessibilityNodeInfo.CollectionInfo) ((aXD) obj).c;
            int i110 = b + 115;
            a = i110 % 128;
            int i111 = i110 % 2;
        }
        accessibilityNodeInfo.setCollectionInfo(collectionInfo);
        int i20 = a + 7;
        b = i20 % 128;
        if (i20 % 2 == 0) {
            int i21 = 8 / 0;
        }
    }

    public void f(aXC axc) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 5) + ((i2 & 5) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        this.d.addAction((AccessibilityNodeInfo.AccessibilityAction) axc.k);
        int i5 = b;
        int i6 = (-2) - ((((i5 | 106) << 1) - (i5 ^ 106)) ^ (-1));
        a = i6 % 128;
        int i7 = i6 % 2;
    }

    public Bundle h() {
        int i = 2 % 2;
        int i2 = a + 115;
        b = i2 % 128;
        int i3 = i2 % 2;
        AccessibilityNodeInfo accessibilityNodeInfo = this.d;
        if (i3 != 0) {
            return accessibilityNodeInfo.getExtras();
        }
        accessibilityNodeInfo.getExtras();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 24;
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        AccessibilityNodeInfo accessibilityNodeInfo = this.d;
        if (accessibilityNodeInfo == null) {
            int i6 = (i2 & 47) + (i2 | 47);
            a = i6 % 128;
            iHashCode = i6 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = accessibilityNodeInfo.hashCode();
            int i7 = a;
            int i8 = ((i7 | 4) << 1) - (i7 ^ 4);
            int i9 = (i8 ^ (-1)) + (i8 << 1);
            b = i9 % 128;
            int i10 = i9 % 2;
        }
        int i11 = b;
        int i12 = (-2) - (((i11 ^ 92) + ((i11 & 92) << 1)) ^ (-1));
        a = i12 % 128;
        int i13 = i12 % 2;
        return iHashCode;
    }

    public CharSequence i() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 5;
        int i4 = ((((i2 ^ 5) | i3) << 1) - (~(-((i2 | 5) & (~i3))))) - 1;
        a = i4 % 128;
        if (i4 % 2 == 0) {
            return this.d.getContentDescription();
        }
        this.d.getContentDescription();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void m(CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 43;
        int i4 = (i3 - (~(-(-((i2 ^ 43) | i3))))) - 1;
        b = i4 % 128;
        if (i4 % 2 != 0 ? Build.VERSION.SDK_INT < 26 : Build.VERSION.SDK_INT < 26) {
            this.d.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
            int i5 = b;
            int i6 = i5 ^ 113;
            int i7 = (i5 & 113) << 1;
            int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
            a = i8 % 128;
            if (i8 % 2 != 0) {
                throw null;
            }
            return;
        }
        int i9 = b + 53;
        a = i9 % 128;
        int i10 = i9 % 2;
        this.d.setHintText(charSequence);
        int i11 = a;
        int i12 = i11 & 121;
        int i13 = ((i11 | 121) & (~i12)) + (i12 << 1);
        b = i13 % 128;
        int i14 = i13 % 2;
    }

    public final List<Integer> g(String str) {
        ArrayList<Integer> integerArrayList;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 | 77) << 1) - (~(-(((~i2) & 77) | (i2 & (-78)))))) - 1;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            integerArrayList = this.d.getExtras().getIntegerArrayList(str);
            int i4 = 94 / 0;
        } else {
            integerArrayList = this.d.getExtras().getIntegerArrayList(str);
        }
        if (integerArrayList == null) {
            integerArrayList = new ArrayList<>();
            Bundle extras = this.d.getExtras();
            int i5 = a;
            int i6 = i5 & 77;
            int i7 = ((i5 ^ 77) | i6) << 1;
            int i8 = -((i5 | 77) & (~i6));
            int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
            b = i9 % 128;
            int i10 = i9 % 2;
            extras.putIntegerArrayList(str, integerArrayList);
            int i11 = a + 11;
            b = i11 % 128;
            int i12 = i11 % 2;
        }
        int i13 = b;
        int i14 = ((i13 | 13) << 1) - (i13 ^ 13);
        a = i14 % 128;
        int i15 = i14 % 2;
        return integerArrayList;
    }

    public final void k(int i, boolean z) {
        int i2 = 2 % 2;
        int i3 = a + 5;
        b = i3 % 128;
        int i4 = i3 % 2;
        Bundle bundleH = h();
        if (bundleH != null) {
            int i5 = b;
            int i6 = (i5 | 27) << 1;
            int i7 = -(((~i5) & 27) | (i5 & (-28)));
            int i8 = (i6 & i7) + (i7 | i6);
            a = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 0;
            int i11 = bundleH.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0);
            if (z) {
                int i12 = a;
                int i13 = i12 & 25;
                int i14 = ((i12 ^ 25) | i13) << 1;
                int i15 = -((i12 | 25) & (~i13));
                int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
                int i17 = i16 % 128;
                b = i17;
                int i18 = i16 % 2;
                int i19 = i17 + 94;
                int i20 = (i19 ^ (-1)) + (i19 << 1);
                a = i20 % 128;
                int i21 = i20 % 2;
                i10 = i;
            } else {
                int i22 = a + 29;
                b = i22 % 128;
                int i23 = i22 % 2;
            }
            bundleH.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", ((i | (~i)) & (~i) & i11) | i10);
            int i24 = b;
            int i25 = i24 & 87;
            int i26 = ((i24 ^ 87) | i25) << 1;
            int i27 = -((i24 | 87) & (~i25));
            int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
            a = i28 % 128;
            int i29 = i28 % 2;
        }
        int i30 = b;
        int i31 = (i30 ^ 95) + ((i30 & 95) << 1);
        a = i31 % 128;
        int i32 = i31 % 2;
    }

    public void l(Object obj) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-66)) | ((~i2) & 65);
        int i4 = -(-((i2 & 65) << 1));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        AccessibilityNodeInfo accessibilityNodeInfo = this.d;
        Object obj2 = ((aXE) obj).c;
        int i7 = b + 17;
        a = i7 % 128;
        int i8 = i7 % 2;
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) obj2);
        int i9 = b + 102;
        int i10 = (i9 ^ (-1)) + (i9 << 1);
        a = i10 % 128;
        if (i10 % 2 == 0) {
            return;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }

    public boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 61;
        int i4 = i3 + ((i2 ^ 61) | i3);
        int i5 = i4 % 128;
        b = i5;
        int i6 = i4 % 2;
        if (this == obj) {
            int i7 = ((i5 & 92) + (i5 | 92)) - 1;
            int i8 = i7 % 128;
            a = i8;
            int i9 = i7 % 2;
            int i10 = i8 & 31;
            int i11 = -(-((i8 ^ 31) | i10));
            int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
            b = i12 % 128;
            int i13 = i12 % 2;
            return true;
        }
        Object obj2 = null;
        if (obj == null) {
            int i14 = ((i5 | 53) << 1) - ((i5 & (-54)) | ((~i5) & 53));
            int i15 = i14 % 128;
            a = i15;
            int i16 = i14 % 2;
            int i17 = i15 & 107;
            int i18 = (i15 | 107) & (~i17);
            int i19 = i17 << 1;
            int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
            b = i20 % 128;
            if (i20 % 2 != 0) {
                return false;
            }
            obj2.hashCode();
            throw null;
        }
        if (!(obj instanceof al)) {
            int i21 = i5 + 15;
            a = i21 % 128;
            int i22 = i21 % 2;
            int i23 = i5 ^ 17;
            int i24 = ((i5 & 17) | i23) << 1;
            int i25 = -i23;
            int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
            a = i26 % 128;
            int i27 = i26 % 2;
            return false;
        }
        al alVar = (al) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.d;
        if (accessibilityNodeInfo == null) {
            int i28 = i2 & 75;
            int i29 = (i2 ^ 75) | i28;
            int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
            int i31 = i30 % 128;
            b = i31;
            int i32 = i30 % 2;
            if (alVar.d != null) {
                int i33 = i31 & 31;
                int i34 = (i33 - (~((i31 ^ 31) | i33))) - 1;
                int i35 = i34 % 128;
                a = i35;
                boolean z = i34 % 2 != 0;
                int i36 = ((i35 & (-56)) | ((~i35) & 55)) + ((i35 & 55) << 1);
                b = i36 % 128;
                if (i36 % 2 != 0) {
                    return z;
                }
                obj2.hashCode();
                throw null;
            }
        } else if (!accessibilityNodeInfo.equals(alVar.d)) {
            int i37 = a;
            int i38 = (-2) - ((((i37 | 20) << 1) - (i37 ^ 20)) ^ (-1));
            b = i38 % 128;
            return i38 % 2 == 0;
        }
        if (this.f != alVar.f) {
            int i39 = a + 23;
            int i40 = i39 % 128;
            b = i40;
            int i41 = i39 % 2;
            int i42 = i40 & 37;
            int i43 = ((i40 ^ 37) | i42) << 1;
            int i44 = -((i40 | 37) & (~i42));
            int i45 = (i43 & i44) + (i43 | i44);
            a = i45 % 128;
            int i46 = i45 % 2;
            return false;
        }
        if (this.e == alVar.e) {
            int i47 = a;
            int i48 = ((i47 & 59) - (~(i47 | 59))) - 1;
            b = i48 % 128;
            if (i48 % 2 != 0) {
                return true;
            }
            throw null;
        }
        int i49 = b;
        int i50 = i49 + 8;
        int i51 = (i50 ^ (-1)) + (i50 << 1);
        a = i51 % 128;
        int i52 = i51 % 2;
        int i53 = i49 ^ 115;
        int i54 = (i49 & 115) << 1;
        int i55 = ((i53 | i54) << 1) - (i54 ^ i53);
        a = i55 % 128;
        int i56 = i55 % 2;
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public String toString() {
        ?? EmptyList;
        int size;
        int i;
        int i2 = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        this.d.getBoundsInParent(rect);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("; boundsInParent: ");
        sb2.append(rect);
        sb.append(sb2.toString());
        this.d.getBoundsInScreen(rect);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("; boundsInScreen: ");
        sb3.append(rect);
        sb.append(sb3.toString());
        sb.append("; packageName: ");
        AccessibilityNodeInfo accessibilityNodeInfo = this.d;
        int i3 = b;
        int i4 = ((i3 | 101) << 1) - (i3 ^ 101);
        a = i4 % 128;
        int i5 = i4 % 2;
        sb.append(accessibilityNodeInfo.getPackageName());
        sb.append("; className: ");
        sb.append(this.d.getClassName());
        sb.append("; text: ");
        sb.append(j());
        sb.append("; contentDescription: ");
        int i6 = a;
        int i7 = (i6 ^ 104) + ((i6 & 104) << 1);
        int i8 = (i7 ^ (-1)) + (i7 << 1);
        b = i8 % 128;
        int i9 = i8 % 2;
        sb.append(i());
        sb.append("; viewId: ");
        sb.append(this.d.getViewIdResourceName());
        sb.append("; checkable: ");
        sb.append(this.d.isCheckable());
        int i10 = a + 41;
        b = i10 % 128;
        int i11 = i10 % 2;
        sb.append("; checked: ");
        sb.append(this.d.isChecked());
        sb.append("; focusable: ");
        sb.append(this.d.isFocusable());
        sb.append("; focused: ");
        sb.append(this.d.isFocused());
        int i12 = a;
        int i13 = i12 & 79;
        int i14 = ((i12 ^ 79) | i13) << 1;
        int i15 = -((i12 | 79) & (~i13));
        int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
        b = i16 % 128;
        int i17 = i16 % 2;
        sb.append("; selected: ");
        sb.append(this.d.isSelected());
        sb.append("; clickable: ");
        sb.append(this.d.isClickable());
        sb.append("; longClickable: ");
        sb.append(this.d.isLongClickable());
        sb.append("; enabled: ");
        sb.append(this.d.isEnabled());
        sb.append("; password: ");
        sb.append(this.d.isPassword());
        StringBuilder sb4 = new StringBuilder();
        int i18 = a;
        int i19 = (i18 ^ 101) + ((i18 & 101) << 1);
        b = i19 % 128;
        int i20 = i19 % 2;
        sb4.append("; scrollable: ");
        sb4.append(this.d.isScrollable());
        sb.append(sb4.toString());
        sb.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.d.getActionList();
        if (actionList != null) {
            EmptyList = new ArrayList();
            int i21 = a;
            int i22 = (i21 | 105) << 1;
            int i23 = -(((~i21) & 105) | (i21 & (-106)));
            int i24 = (i22 & i23) + (i23 | i22);
            b = i24 % 128;
            if (i24 % 2 == 0) {
                size = actionList.size();
                i = 1;
            } else {
                size = actionList.size();
                i = 0;
            }
            while (i < size) {
                aXC axc = new aXC(actionList.get(i), 0, null, null, null);
                int i25 = a;
                int i26 = ((i25 ^ 121) | (i25 & 121)) << 1;
                int i27 = -(((~i25) & 121) | (i25 & (-122)));
                int i28 = (i26 & i27) + (i27 | i26);
                b = i28 % 128;
                if (i28 % 2 == 0) {
                    EmptyList.add(axc);
                    int i29 = (i | 117) << 1;
                    int i30 = -(i ^ 117);
                    int i31 = (i29 ^ i30) + ((i29 & i30) << 1);
                    int i32 = i31 & (-44);
                    i = (((i31 ^ (-44)) | i32) << 1) - ((~i32) & (i31 | (-44)));
                } else {
                    EmptyList.add(axc);
                    int i33 = i | 1;
                    int i34 = i33 << 1;
                    int i35 = -(i33 & (~(i & 1)));
                    i = (i34 & i35) + (i35 | i34);
                }
                int i36 = a;
                int i37 = (i36 & (-98)) | ((~i36) & 97);
                int i38 = (i36 & 97) << 1;
                int i39 = (i37 & i38) + (i38 | i37);
                b = i39 % 128;
                int i40 = i39 % 2;
            }
        } else {
            EmptyList = Collections.emptyList();
            int i41 = (-2) - ((a + 126) ^ (-1));
            b = i41 % 128;
            int i42 = i41 % 2;
        }
        int i43 = 0;
        while (i43 < EmptyList.size()) {
            int i44 = b;
            int i45 = (((i44 | 12) << 1) - (i44 ^ 12)) - 1;
            a = i45 % 128;
            if (i45 % 2 != 0) {
                ((aXC) EmptyList.get(i43)).e();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            aXC axc2 = (aXC) EmptyList.get(i43);
            String strC = c(axc2.e());
            if (strC.equals("ACTION_UNKNOWN")) {
                int i46 = b;
                int i47 = (i46 & (-32)) | ((~i46) & 31);
                int i48 = -(-((i46 & 31) << 1));
                int i49 = (i47 & i48) + (i48 | i47);
                a = i49 % 128;
                int i50 = i49 % 2;
                if (axc2.f() != null) {
                    int i51 = a + 7;
                    b = i51 % 128;
                    int i52 = i51 % 2;
                    strC = axc2.f().toString();
                    int i53 = b;
                    int i54 = i53 & 97;
                    int i55 = (i53 | 97) & (~i54);
                    int i56 = i54 << 1;
                    int i57 = (i55 & i56) + (i55 | i56);
                    a = i57 % 128;
                    int i58 = i57 % 2;
                }
            }
            sb.append(strC);
            int i59 = a;
            int i60 = i59 & 75;
            int i61 = -(-((i59 ^ 75) | i60));
            int i62 = (i60 ^ i61) + ((i61 & i60) << 1);
            b = i62 % 128;
            int i63 = i62 % 2;
            int size2 = EmptyList.size();
            if (i43 != ((((size2 ^ (-1)) | size2) << 1) - (~(-(~size2)))) - 1) {
                int i64 = b;
                int i65 = i64 & 121;
                int i66 = -(-((i64 ^ 121) | i65));
                int i67 = (i65 & i66) + (i66 | i65);
                a = i67 % 128;
                int i68 = i67 % 2;
                sb.append(", ");
                int i69 = b;
                int i70 = (i69 & (-10)) | ((~i69) & 9);
                int i71 = (i69 & 9) << 1;
                int i72 = (i70 ^ i71) + ((i71 & i70) << 1);
                a = i72 % 128;
                int i73 = i72 % 2;
            }
            i43 = ((i43 & 2) + (i43 | 2)) - 1;
            int i74 = b;
            int i75 = (((i74 ^ 111) | (i74 & 111)) << 1) - (((~i74) & 111) | (i74 & (-112)));
            a = i75 % 128;
            int i76 = i75 % 2;
        }
        sb.append("]");
        String string = sb.toString();
        int i77 = b;
        int i78 = ((i77 ^ 81) - (~((i77 & 81) << 1))) - 1;
        a = i78 % 128;
        int i79 = i78 % 2;
        return string;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0047, code lost:
    
        if ((r5 % 2) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0049, code lost:
    
        r2 = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        r1 = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        r4 = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        r5 = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        r6 = ivas.gov.bisp.enumeration.M.al.a;
        r8 = r6 & 15;
        r7 = (((r6 ^ 15) | r8) << 1) - ((r6 | 15) & (~r8));
        ivas.gov.bisp.enumeration.M.al.b = r7 % 128;
        r7 = r7 % 2;
        r8 = new android.text.SpannableString(android.text.TextUtils.substring(r15.d.getText(), 0, r15.d.getText().length()));
        r6 = ivas.gov.bisp.enumeration.M.al.b;
        r7 = ((r6 | 19) << 1) - (r6 ^ 19);
        ivas.gov.bisp.enumeration.M.al.a = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0098, code lost:
    
        if ((r7 % 2) != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x009a, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x009f, code lost:
    
        if (r3 >= r2.size()) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a1, code lost:
    
        r6 = ivas.gov.bisp.enumeration.M.al.b;
        r7 = (r6 & 47) + (r6 | 47);
        ivas.gov.bisp.enumeration.M.al.a = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00ad, code lost:
    
        if ((r7 % 2) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00af, code lost:
    
        r6 = r5.get(r3).intValue();
        r7 = 43 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00bd, code lost:
    
        r6 = r5.get(r3).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c7, code lost:
    
        r7 = new ivas.gov.bisp.enumeration.M.W(r6, r15, h().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY"));
        r6 = ivas.gov.bisp.enumeration.M.al.b;
        r10 = r6 & 25;
        r6 = -(-((r6 ^ 25) | r10));
        r11 = (r10 & r6) + (r6 | r10);
        ivas.gov.bisp.enumeration.M.al.a = r11 % 128;
        r11 = r11 % 2;
        r6 = r2.get(r3);
        r10 = ivas.gov.bisp.enumeration.M.al.a;
        r11 = r10 & 79;
        r10 = (r10 | 79) & (~r11);
        r11 = -(-(r11 << 1));
        r12 = (r10 ^ r11) + ((r10 & r11) << 1);
        ivas.gov.bisp.enumeration.M.al.b = r12 % 128;
        r12 = r12 % 2;
        r6 = r6.intValue();
        r10 = r1.get(r3);
        r11 = ivas.gov.bisp.enumeration.M.al.b;
        r12 = ((r11 & 102) + (r11 | 102)) - 1;
        ivas.gov.bisp.enumeration.M.al.a = r12 % 128;
        r12 = r12 % 2;
        r10 = r10.intValue();
        r11 = r4.get(r3);
        r12 = ivas.gov.bisp.enumeration.M.al.b;
        r13 = r12 & 37;
        r12 = r12 | 37;
        r14 = ((r13 | r12) << 1) - (r12 ^ r13);
        ivas.gov.bisp.enumeration.M.al.a = r14 % 128;
        r14 = r14 % 2;
        r11 = r11.intValue();
        r12 = ivas.gov.bisp.enumeration.M.al.b;
        r13 = ((r12 & 110) + (r12 | 110)) - 1;
        ivas.gov.bisp.enumeration.M.al.a = r13 % 128;
        r13 = r13 % 2;
        r8.setSpan(r7, r6, r10, r11);
        r3 = (((r3 & (-2)) | ((~r3) & 1)) - (~((r3 & 1) << 1))) - 1;
        r6 = ivas.gov.bisp.enumeration.M.al.a;
        r7 = r6 & 51;
        r6 = (r6 ^ 51) | r7;
        r10 = ((r7 | r6) << 1) - (r6 ^ r7);
        ivas.gov.bisp.enumeration.M.al.b = r10 % 128;
        r10 = r10 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0170, code lost:
    
        r1 = ivas.gov.bisp.enumeration.M.al.b + 79;
        ivas.gov.bisp.enumeration.M.al.a = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0179, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x017a, code lost:
    
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x017d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x017e, code lost:
    
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0187, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0188, code lost:
    
        r1 = r15.d.getText();
        r2 = ivas.gov.bisp.enumeration.M.al.b;
        r4 = r2 & 35;
        r4 = r4 + ((r2 ^ 35) | r4);
        ivas.gov.bisp.enumeration.M.al.a = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x019b, code lost:
    
        if ((r4 % 2) != 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x019d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x019e, code lost:
    
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01a1, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        if ((((~(r1 ? 1 : 0)) & 1) ^ ((r1 ? 1 : 0) & (-2))) != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        r1 = ivas.gov.bisp.enumeration.M.al.b;
        r4 = (r1 & (-24)) | ((~r1) & 23);
        r1 = -(-((r1 & 23) << 1));
        r5 = (r4 ^ r1) + ((r1 & r4) << 1);
        ivas.gov.bisp.enumeration.M.al.a = r5 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.CharSequence j() {
        /*
            Method dump skipped, instruction units count: 418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.M.al.j():java.lang.CharSequence");
    }
}
