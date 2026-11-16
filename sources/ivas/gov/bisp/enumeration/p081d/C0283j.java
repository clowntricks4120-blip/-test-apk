package ivas.gov.bisp.enumeration.p081d;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import ivas.gov.bisp.enumeration.M.D;
import ivas.gov.bisp.enumeration.M.al;
import ivas.gov.bisp.enumeration.M.n;
import ivas.gov.bisp.enumeration.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.d.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0283j {
    private static int a = 1;
    private static int b;
    public static final View.AccessibilityDelegate c = new View.AccessibilityDelegate();
    public final View.AccessibilityDelegate d;
    public final View.AccessibilityDelegate e;

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.d.j$aWk */
    public static final class aWk extends View.AccessibilityDelegate {
        private static int a = 1;
        private static int b;
        public final C0283j c;

        public aWk(C0283j c0283j) {
            this.c = c0283j;
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 107;
            int i4 = ((i2 | 107) & (~i3)) + (i3 << 1);
            b = i4 % 128;
            int i5 = i4 % 2;
            boolean zE = this.c.e(view, accessibilityEvent);
            int i6 = a;
            int i7 = i6 & 37;
            int i8 = i7 + ((i6 ^ 37) | i7);
            b = i8 % 128;
            int i9 = i8 % 2;
            return zE;
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 | 61;
            int i4 = i3 << 1;
            int i5 = -((~(i2 & 61)) & i3);
            int i6 = (i4 & i5) + (i5 | i4);
            a = i6 % 128;
            Object obj = null;
            if (i6 % 2 == 0) {
                this.c.g(view, accessibilityEvent);
                obj.hashCode();
                throw null;
            }
            this.c.g(view, accessibilityEvent);
            int i7 = b;
            int i8 = i7 & 21;
            int i9 = ((i7 ^ 21) | i8) << 1;
            int i10 = -((i7 | 21) & (~i8));
            int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
            a = i11 % 128;
            if (i11 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 121;
            int i4 = i2 | 121;
            int i5 = (i3 & i4) + (i4 | i3);
            b = i5 % 128;
            int i6 = i5 % 2;
            this.c.j(view, accessibilityEvent);
            int i7 = a + 78;
            int i8 = (i7 ^ (-1)) + (i7 << 1);
            b = i8 % 128;
            if (i8 % 2 != 0) {
                throw null;
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            boolean zI;
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 ^ 81;
            int i4 = (i2 & 81) << 1;
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            b = i5 % 128;
            if (i5 % 2 != 0) {
                zI = this.c.i(viewGroup, view, accessibilityEvent);
                int i6 = 11 / 0;
            } else {
                zI = this.c.i(viewGroup, view, accessibilityEvent);
            }
            int i7 = b;
            int i8 = i7 & 123;
            int i9 = (i8 - (~((i7 ^ 123) | i8))) - 1;
            a = i9 % 128;
            int i10 = i9 % 2;
            return zI;
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = i3 ^ 43;
            int i5 = (i3 & 43) << 1;
            int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
            b = i6 % 128;
            Object obj = null;
            if (i6 % 2 != 0) {
                this.c.k(view, i, bundle);
                throw null;
            }
            boolean zK = this.c.k(view, i, bundle);
            int i7 = b;
            int i8 = i7 | 119;
            int i9 = (i8 << 1) - ((~(i7 & 119)) & i8);
            a = i9 % 128;
            if (i9 % 2 != 0) {
                return zK;
            }
            obj.hashCode();
            throw null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void sendAccessibilityEvent(View view, int i) {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = (i3 | 33) << 1;
            int i5 = -(((~i3) & 33) | (i3 & (-34)));
            int i6 = (i4 & i5) + (i5 | i4);
            b = i6 % 128;
            if (i6 % 2 == 0) {
                this.c.l(view, i);
                return;
            }
            this.c.l(view, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            int i = 2 % 2;
            int i2 = a + 82;
            int i3 = (i2 ^ (-1)) + (i2 << 1);
            b = i3 % 128;
            int i4 = i3 % 2;
            this.c.d(view, accessibilityEvent);
            if (i4 != 0) {
                int i5 = 17 / 0;
            }
            int i6 = b;
            int i7 = (((i6 | 66) << 1) - (i6 ^ 66)) - 1;
            a = i7 % 128;
            int i8 = i7 % 2;
        }

        @Override // android.view.View.AccessibilityDelegate
        public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            AccessibilityNodeProvider accessibilityNodeProvider;
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 ^ 55;
            int i4 = (((i2 & 55) | i3) << 1) - i3;
            a = i4 % 128;
            int i5 = i4 % 2;
            D dF = this.c.f(view);
            if (dF != null) {
                int i6 = b;
                int i7 = ((i6 ^ 36) + ((i6 & 36) << 1)) - 1;
                a = i7 % 128;
                int i8 = i7 % 2;
                accessibilityNodeProvider = (AccessibilityNodeProvider) dF.c;
                int i9 = a;
                int i10 = ((i9 | 89) << 1) - (i9 ^ 89);
                b = i10 % 128;
                int i11 = i10 % 2;
            } else {
                int i12 = b;
                int i13 = i12 & 29;
                int i14 = ((i12 ^ 29) | i13) << 1;
                int i15 = -((i12 | 29) & (~i13));
                int i16 = (i14 & i15) + (i15 | i14);
                a = i16 % 128;
                int i17 = i16 % 2;
                accessibilityNodeProvider = null;
            }
            int i18 = a;
            int i19 = (i18 & 1) + (i18 | 1);
            b = i19 % 128;
            if (i19 % 2 != 0) {
                int i20 = 90 / 0;
            }
            return accessibilityNodeProvider;
        }

        /* JADX WARN: Code duplicated, block: B:45:0x0163  */
        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            boolean z;
            Object objValueOf;
            boolean z2;
            boolean z3;
            Object objValueOf2;
            boolean z4;
            Object tag;
            SparseArray sparseArray;
            int i;
            SparseArray sparseArray2;
            int iKeyAt;
            int i2 = 2;
            int i3 = 2 % 2;
            al alVar = new al(accessibilityNodeInfo);
            WeakHashMap<View, R> weakHashMap = T.c;
            int i4 = Build.VERSION.SDK_INT;
            int i5 = b;
            int i6 = i5 & 7;
            int i7 = (~i6) & (i5 | 7);
            int i8 = 1;
            int i9 = i6 << 1;
            int i10 = (i7 & i9) + (i9 | i7);
            a = i10 % 128;
            int i11 = i10 % 2;
            if (i4 >= 28) {
                int i12 = i5 & 55;
                int i13 = ((i5 | 55) & (~i12)) + (i12 << 1);
                a = i13 % 128;
                int i14 = i13 % 2;
                z = true;
            } else {
                z = false;
            }
            Object obj = null;
            if (!z) {
                objValueOf = view.getTag(R.id.tag_screen_reader_focusable);
                if (!Boolean.class.isInstance(objValueOf)) {
                    int i15 = a;
                    int i16 = i15 & 3;
                    int i17 = (((i15 | 3) & (~i16)) - (~(-(-(i16 << 1))))) - 1;
                    b = i17 % 128;
                    int i18 = i17 % 2;
                    objValueOf = null;
                }
            } else {
                int i19 = a;
                int i20 = i19 & 97;
                int i21 = i19 | 97;
                int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
                b = i22 % 128;
                int i23 = i22 % 2;
                objValueOf = Boolean.valueOf(T.aXh.f(view));
                int i24 = a + 69;
                b = i24 % 128;
                int i25 = i24 % 2;
            }
            Boolean bool = (Boolean) objValueOf;
            if (bool == null || (!bool.booleanValue())) {
                z2 = false;
            } else {
                int i26 = a;
                int i27 = i26 & 95;
                int i28 = (i26 | 95) & (~i27);
                int i29 = -(-(i27 << 1));
                int i30 = (i28 ^ i29) + ((i28 & i29) << 1);
                b = i30 % 128;
                int i31 = i30 % 2;
                z2 = true;
            }
            if (i4 >= 28) {
                int i32 = b;
                int i33 = (i32 ^ 103) + ((i32 & 103) << 1);
                a = i33 % 128;
                if (i33 % 2 == 0) {
                    accessibilityNodeInfo.setScreenReaderFocusable(z2);
                    obj.hashCode();
                    throw null;
                }
                accessibilityNodeInfo.setScreenReaderFocusable(z2);
            } else {
                alVar.k(1, z2);
                int i34 = a;
                int i35 = (((i34 | 58) << 1) - (i34 ^ 58)) - 1;
                b = i35 % 128;
                int i36 = i35 % 2;
            }
            if (i4 >= 28) {
                int i37 = a;
                int i38 = (i37 & 51) + (i37 | 51);
                int i39 = i38 % 128;
                b = i39;
                int i40 = i38 % 2;
                int i41 = (((i39 | 54) << 1) - (i39 ^ 54)) - 1;
                a = i41 % 128;
                int i42 = i41 % 2;
                z3 = true;
            } else {
                int i43 = b;
                int i44 = (i43 & 117) + (i43 | 117);
                a = i44 % 128;
                int i45 = i44 % 2;
                z3 = false;
            }
            if (!z3) {
                objValueOf2 = view.getTag(R.id.tag_accessibility_heading);
                if (!Boolean.class.isInstance(objValueOf2)) {
                    int i46 = b;
                    int i47 = (i46 & 11) + (i46 | 11);
                    a = i47 % 128;
                    int i48 = i47 % 2;
                    int i49 = i46 & 103;
                    int i50 = ((i46 | 103) & (~i49)) + (i49 << 1);
                    a = i50 % 128;
                    int i51 = i50 % 2;
                    objValueOf2 = null;
                }
            } else {
                int i52 = b;
                int i53 = i52 & 125;
                int i54 = (((i52 ^ 125) | i53) << 1) - ((i52 | 125) & (~i53));
                a = i54 % 128;
                int i55 = i54 % 2;
                objValueOf2 = Boolean.valueOf(T.aXh.e(view));
            }
            Boolean bool2 = (Boolean) objValueOf2;
            if (bool2 != null) {
                int i56 = b;
                int i57 = (i56 ^ 107) + ((i56 & 107) << 1);
                a = i57 % 128;
                if (i57 % 2 == 0) {
                    bool2.booleanValue();
                    throw null;
                }
                if (bool2.booleanValue()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
            } else {
                z4 = false;
            }
            if (i4 >= 28) {
                int i58 = b;
                int i59 = i58 & 43;
                int i60 = (i58 | 43) & (~i59);
                int i61 = i59 << 1;
                int i62 = (i60 ^ i61) + ((i60 & i61) << 1);
                a = i62 % 128;
                if (i62 % 2 == 0) {
                    accessibilityNodeInfo.setHeading(z4);
                    int i63 = 63 / 0;
                } else {
                    accessibilityNodeInfo.setHeading(z4);
                }
            } else {
                alVar.k(2, z4);
            }
            CharSequence charSequenceI = T.i(view);
            if (i4 >= 28) {
                int i64 = b;
                int i65 = (i64 & 57) + (i64 | 57);
                a = i65 % 128;
                if (i65 % 2 == 0) {
                    accessibilityNodeInfo.setPaneTitle(charSequenceI);
                    obj.hashCode();
                    throw null;
                }
                accessibilityNodeInfo.setPaneTitle(charSequenceI);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequenceI);
            }
            if (i4 >= 30) {
                int i66 = b;
                int i67 = (((i66 & (-74)) | ((~i66) & 73)) - (~((i66 & 73) << 1))) - 1;
                a = i67 % 128;
                int i68 = i67 % 2;
                tag = T.aXj.b(view);
            } else {
                tag = view.getTag(R.id.tag_state_description);
                int i69 = b;
                int i70 = i69 & 37;
                int i71 = -(-(i69 | 37));
                int i72 = (i70 & i71) + (i71 | i70);
                a = i72 % 128;
                if (i72 % 2 == 0) {
                    CharSequence.class.isInstance(tag);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                if (!(!CharSequence.class.isInstance(tag))) {
                    int i73 = b;
                    int i74 = ((i73 & 38) + (i73 | 38)) - 1;
                    a = i74 % 128;
                    int i75 = i74 % 2;
                } else {
                    tag = null;
                }
            }
            CharSequence charSequence = (CharSequence) tag;
            if (i4 >= 30) {
                int i76 = b;
                int i77 = i76 & 53;
                int i78 = ((i76 ^ 53) | i77) << 1;
                int i79 = -((~i77) & (i76 | 53));
                int i80 = (i78 & i79) + (i78 | i79);
                a = i80 % 128;
                int i81 = i80 % 2;
                int i82 = i76 + 25;
                a = i82 % 128;
                int i83 = i82 % 2;
                int i84 = ((i76 ^ 112) + ((i76 & 112) << 1)) - 1;
                a = i84 % 128;
                int i85 = i84 % 2;
                accessibilityNodeInfo.setStateDescription(charSequence);
                int i86 = b;
                int i87 = i86 & 15;
                int i88 = -(-((i86 ^ 15) | i87));
                int i89 = (i87 & i88) + (i88 | i87);
                a = i89 % 128;
                if (i89 % 2 == 0) {
                    int i90 = 5 % 4;
                }
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
                int i91 = a;
                int i92 = ((i91 ^ 65) - (~(-(-((i91 & 65) << 1))))) - 1;
                b = i92 % 128;
                int i93 = i92 % 2;
            }
            this.c.h(view, alVar);
            CharSequence text = accessibilityNodeInfo.getText();
            int i94 = a;
            int i95 = (((i94 | 4) << 1) - (i94 ^ 4)) - 1;
            int i96 = i95 % 128;
            b = i96;
            int i97 = i95 % 2;
            if (i4 < 26) {
                int i98 = ((i96 | 69) << 1) - (i96 ^ 69);
                a = i98 % 128;
                if (i98 % 2 == 0) {
                    accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
                    accessibilityNodeInfo.getExtras();
                    throw null;
                }
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
                Bundle extras = accessibilityNodeInfo.getExtras();
                int i99 = b + 121;
                a = i99 % 128;
                if (i99 % 2 == 0) {
                    extras.remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
                    sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
                    int i100 = 5 / 0;
                } else {
                    extras.remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
                    sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
                }
                if (sparseArray != null) {
                    ArrayList arrayList = new ArrayList();
                    for (int i101 = 0; i101 < sparseArray.size(); i101 = (i101 ^ (-55)) + ((i101 & (-55)) << 1) + 56) {
                        int i102 = b + 9;
                        a = i102 % 128;
                        if (i102 % 2 == 0) {
                            ((WeakReference) sparseArray.valueAt(i101)).get();
                            obj.hashCode();
                            throw null;
                        }
                        if (((WeakReference) sparseArray.valueAt(i101)).get() == null) {
                            arrayList.add(Integer.valueOf(i101));
                        }
                    }
                    int i103 = 0;
                    while (i103 < arrayList.size()) {
                        sparseArray.remove(((Integer) arrayList.get(i103)).intValue());
                        int i104 = b;
                        int i105 = i104 & 39;
                        int i106 = ((i104 ^ 39) | i105) << 1;
                        int i107 = -((~i105) & (i104 | 39));
                        int i108 = ((i106 | i107) << 1) - (i107 ^ i106);
                        a = i108 % 128;
                        if (i108 % 2 == 0) {
                            int i109 = i103 ^ 125;
                            int i110 = -(-((i103 & 125) << 1));
                            int i111 = (i109 ^ i110) + ((i110 & i109) << 1);
                            i103 = (((i111 | (-116)) << 1) - (~(-(i111 ^ (-116))))) - 1;
                        } else {
                            int i112 = i103 & 23;
                            int i113 = -(-(i103 | 23));
                            int i114 = ((i112 | i113) << 1) - (i113 ^ i112);
                            int i115 = (i114 | (-22)) << 1;
                            int i116 = -((i114 & 21) | ((-22) & (~i114)));
                            i103 = (i115 & i116) + (i115 | i116);
                        }
                        int i117 = i104 & 71;
                        int i118 = i117 + ((i104 ^ 71) | i117);
                        a = i118 % 128;
                        int i119 = i118 % 2;
                    }
                }
                ClickableSpan[] clickableSpanArrD = al.d(text);
                if (clickableSpanArrD != null) {
                    int i120 = b;
                    int i121 = ((((i120 ^ 7) | (i120 & 7)) << 1) - (~(-(((~i120) & 7) | (i120 & (-8)))))) - 1;
                    int i122 = i121 % 128;
                    a = i122;
                    int i123 = i121 % 2;
                    if (clickableSpanArrD.length > 0) {
                        int i124 = ((i122 & 52) + (i122 | 52)) - 1;
                        b = i124 % 128;
                        int i125 = i124 % 2;
                        alVar.h().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
                        int i126 = b;
                        int i127 = (i126 & 115) + (i126 | 115);
                        a = i127 % 128;
                        if (i127 % 2 == 0) {
                            i = R.id.tag_accessibility_clickable_spans;
                            sparseArray2 = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
                            int i128 = 39 / 0;
                        } else {
                            i = R.id.tag_accessibility_clickable_spans;
                            sparseArray2 = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
                        }
                        if (sparseArray2 == null) {
                            sparseArray2 = new SparseArray();
                            view.setTag(i, sparseArray2);
                            int i129 = a;
                            int i130 = i129 & 37;
                            int i131 = -(-((i129 ^ 37) | i130));
                            int i132 = ((i130 | i131) << 1) - (i131 ^ i130);
                            b = i132 % 128;
                            int i133 = i132 % 2;
                        }
                        int i134 = a;
                        int i135 = i134 & 109;
                        int i136 = ((i134 ^ 109) | i135) << 1;
                        int i137 = -((i134 | 109) & (~i135));
                        int i138 = (i136 ^ i137) + ((i137 & i136) << 1);
                        b = i138 % 128;
                        if (i138 % 2 != 0) {
                            int i139 = 5 % 5;
                        }
                        int i140 = 0;
                        while (i140 < clickableSpanArrD.length) {
                            int i141 = a;
                            int i142 = i141 & 97;
                            int i143 = (((i141 ^ 97) | i142) << i8) - ((i141 | 97) & (~i142));
                            int i144 = i143 % 128;
                            b = i144;
                            int i145 = i143 % i2;
                            ClickableSpan clickableSpan = clickableSpanArrD[i140];
                            int i146 = i144 & 109;
                            int i147 = (((~i146) & (i144 | 109)) - (~(-(-(i146 << 1))))) - i8;
                            a = i147 % 128;
                            if (i147 % 2 == 0) {
                                int i148 = 2 / 4;
                            }
                            int i149 = 0;
                            while (true) {
                                if (i149 >= sparseArray2.size()) {
                                    iKeyAt = al.c;
                                    int i150 = iKeyAt & 1;
                                    al.c = i150 + ((iKeyAt ^ 1) | i150);
                                    break;
                                }
                                int i151 = a;
                                int i152 = (i151 & 51) + (i151 | 51);
                                b = i152 % 128;
                                int i153 = i152 % 2;
                                ClickableSpan clickableSpan2 = (ClickableSpan) ((WeakReference) sparseArray2.valueAt(i149)).get();
                                int i154 = b;
                                int i155 = i154 & 45;
                                int i156 = ((i154 ^ 45) | i155) << 1;
                                int i157 = -((~i155) & (i154 | 45));
                                int i158 = (i156 & i157) + (i156 | i157);
                                a = i158 % 128;
                                if (i158 % 2 == 0) {
                                    int i159 = 89 / 0;
                                    if (clickableSpan.equals(clickableSpan2)) {
                                        iKeyAt = sparseArray2.keyAt(i149);
                                        break;
                                    }
                                    int i160 = i149 & 1;
                                    int i161 = (i149 | 1) & (~i160);
                                    int i162 = -(-(i160 << i8));
                                    i149 = ((i161 | i162) << i8) - (i161 ^ i162);
                                } else {
                                    if (clickableSpan.equals(clickableSpan2)) {
                                        iKeyAt = sparseArray2.keyAt(i149);
                                        break;
                                    }
                                    int i163 = i149 & 1;
                                    int i164 = (i149 | 1) & (~i163);
                                    int i165 = -(-(i163 << i8));
                                    i149 = ((i164 | i165) << i8) - (i164 ^ i165);
                                }
                            }
                            sparseArray2.put(iKeyAt, new WeakReference(clickableSpanArrD[i140]));
                            int i166 = b;
                            int i167 = i166 + 97;
                            a = i167 % 128;
                            int i168 = i167 % 2;
                            ClickableSpan clickableSpan3 = clickableSpanArrD[i140];
                            Spanned spanned = (Spanned) text;
                            int i169 = i166 & 99;
                            int i170 = -(-(i166 | 99));
                            int i171 = (i169 ^ i170) + ((i169 & i170) << i8);
                            a = i171 % 128;
                            if (i171 % 2 == 0) {
                                alVar.g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan3)));
                                throw null;
                            }
                            alVar.g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan3)));
                            List<Integer> listG = alVar.g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
                            int spanEnd = spanned.getSpanEnd(clickableSpan3);
                            int i172 = b;
                            ClickableSpan[] clickableSpanArr = clickableSpanArrD;
                            int i173 = (((i172 & (-50)) | (49 & (~i172))) - (~((i172 & 49) << 1))) - 1;
                            a = i173 % 128;
                            int i174 = i173 % 2;
                            listG.add(Integer.valueOf(spanEnd));
                            List<Integer> listG2 = alVar.g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
                            int i175 = a;
                            int i176 = (i175 & 11) + (i175 | 11);
                            b = i176 % 128;
                            if (i176 % 2 != 0) {
                                listG2.add(Integer.valueOf(spanned.getSpanFlags(clickableSpan3)));
                                throw null;
                            }
                            listG2.add(Integer.valueOf(spanned.getSpanFlags(clickableSpan3)));
                            alVar.g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(iKeyAt));
                            int i177 = b;
                            int i178 = i177 & 67;
                            int i179 = (i178 - (~((i177 ^ 67) | i178))) - 1;
                            a = i179 % 128;
                            int i180 = i179 % 2;
                            int i181 = i140 & 11;
                            int i182 = ((i140 ^ 11) | i181) << 1;
                            int i183 = -((~i181) & (i140 | 11));
                            int i184 = ((i182 | i183) << 1) - (i182 ^ i183);
                            int i185 = i184 ^ (-10);
                            i140 = (((i184 & (-10)) | i185) << 1) - i185;
                            int i186 = i177 & 95;
                            int i187 = (i177 | 95) & (~i186);
                            int i188 = -(-(i186 << 1));
                            int i189 = ((i187 | i188) << 1) - (i187 ^ i188);
                            a = i189 % 128;
                            int i190 = i189 % 2;
                            clickableSpanArrD = clickableSpanArr;
                            i2 = 2;
                            i8 = 1;
                        }
                    }
                }
            }
            List listEmptyList = (List) view.getTag(R.id.tag_accessibility_actions);
            if (listEmptyList == null) {
                int i191 = b;
                int i192 = (i191 ^ 74) + ((i191 & 74) << 1);
                int i193 = (i192 ^ (-1)) + (i192 << 1);
                a = i193 % 128;
                int i194 = i193 % 2;
                listEmptyList = Collections.emptyList();
                int i195 = a;
                int i196 = (i195 | 81) << 1;
                int i197 = -(((~i195) & 81) | (i195 & (-82)));
                int i198 = (i196 ^ i197) + ((i197 & i196) << 1);
                b = i198 % 128;
                int i199 = i198 % 2;
            }
            int i200 = 0;
            while (i200 < listEmptyList.size()) {
                int i201 = a + 59;
                b = i201 % 128;
                int i202 = i201 % 2;
                alVar.f((al.aXC) listEmptyList.get(i200));
                int i203 = i200 & 1;
                int i204 = ((i200 ^ 1) | i203) << 1;
                int i205 = -((~i203) & (i200 | 1));
                i200 = (i204 & i205) + (i204 | i205);
                int i206 = a;
                int i207 = ((i206 | 77) << 1) - (i206 ^ 77);
                b = i207 % 128;
                int i208 = i207 % 2;
            }
        }
    }

    static {
        int i = a;
        int i2 = i ^ 93;
        int i3 = ((i & 93) | i2) << 1;
        int i4 = -i2;
        int i5 = (i3 & i4) + (i3 | i4);
        b = i5 % 128;
        int i6 = i5 % 2;
    }

    public C0283j() {
        this.d = c;
        this.e = new aWk(this);
    }

    public void d(View view, AccessibilityEvent accessibilityEvent) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 65;
        int i4 = (i2 ^ 65) | i3;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        this.d.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        int i7 = b;
        int i8 = i7 & 105;
        int i9 = (i7 ^ 105) | i8;
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        a = i10 % 128;
        if (i10 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean e(View view, AccessibilityEvent accessibilityEvent) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 59) + (i2 | 59);
        a = i3 % 128;
        if (i3 % 2 == 0) {
            this.d.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
            throw null;
        }
        boolean zDispatchPopulateAccessibilityEvent = this.d.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        int i4 = b;
        int i5 = i4 & 73;
        int i6 = (i4 | 73) & (~i5);
        int i7 = -(-(i5 << 1));
        int i8 = (i6 & i7) + (i6 | i7);
        a = i8 % 128;
        int i9 = i8 % 2;
        return zDispatchPopulateAccessibilityEvent;
    }

    public void g(View view, AccessibilityEvent accessibilityEvent) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 103) - (~((i2 & 103) << 1))) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        this.d.onInitializeAccessibilityEvent(view, accessibilityEvent);
        int i5 = b;
        int i6 = i5 & 119;
        int i7 = (i5 | 119) & (~i6);
        int i8 = i6 << 1;
        int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
        a = i9 % 128;
        int i10 = i9 % 2;
    }

    public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 11;
        int i4 = i2 | 11;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        boolean zOnRequestSendAccessibilityEvent = this.d.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        int i7 = a + 50;
        int i8 = (i7 ^ (-1)) + (i7 << 1);
        b = i8 % 128;
        if (i8 % 2 == 0) {
            return zOnRequestSendAccessibilityEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void j(View view, AccessibilityEvent accessibilityEvent) {
        int i = 2 % 2;
        int i2 = a + 15;
        b = i2 % 128;
        int i3 = i2 % 2;
        this.d.onPopulateAccessibilityEvent(view, accessibilityEvent);
        int i4 = b;
        int i5 = (-2) - ((((i4 | 104) << 1) - (i4 ^ 104)) ^ (-1));
        a = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 45 / 0;
        }
    }

    public void l(View view, int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 & (-108)) | ((~i3) & 107)) + ((i3 & 107) << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        this.d.sendAccessibilityEvent(view, i);
        int i6 = b;
        int i7 = i6 | 57;
        int i8 = i7 << 1;
        int i9 = -((~(i6 & 57)) & i7);
        int i10 = (i8 & i9) + (i9 | i8);
        a = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
    
        r5 = ivas.gov.bisp.enumeration.p081d.C0283j.a;
        r2 = r5 & 47;
        r1 = ((r5 ^ 47) | r2) << 1;
        r5 = -((r5 | 47) & (~r2));
        r2 = (r1 & r5) + (r5 | r1);
        ivas.gov.bisp.enumeration.p081d.C0283j.b = r2 % 128;
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0057, code lost:
    
        if ((r2 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0059, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
    
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001f, code lost:
    
        if (r5 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r5 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
    
        r1 = new ivas.gov.bisp.enumeration.M.D(r5);
        r5 = ivas.gov.bisp.enumeration.p081d.C0283j.b;
        r2 = r5 ^ 71;
        r5 = (((r5 & 71) | r2) << 1) - r2;
        ivas.gov.bisp.enumeration.p081d.C0283j.a = r5 % 128;
        r5 = r5 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ivas.gov.bisp.enumeration.M.D f(android.view.View r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.p081d.C0283j.b
            r2 = r1 & 75
            r1 = r1 ^ 75
            r1 = r1 | r2
            r3 = r2 & r1
            r1 = r1 | r2
            int r3 = r3 + r1
            int r1 = r3 % 128
            ivas.gov.bisp.enumeration.p081d.C0283j.a = r1
            int r3 = r3 % r0
            if (r3 != 0) goto L22
            android.view.View$AccessibilityDelegate r1 = r4.d
            android.view.accessibility.AccessibilityNodeProvider r5 = r1.getAccessibilityNodeProvider(r5)
            r1 = 29
            int r1 = r1 / 0
            if (r5 == 0) goto L3f
            goto L2a
        L22:
            android.view.View$AccessibilityDelegate r1 = r4.d
            android.view.accessibility.AccessibilityNodeProvider r5 = r1.getAccessibilityNodeProvider(r5)
            if (r5 == 0) goto L3f
        L2a:
            ivas.gov.bisp.enumeration.M.D r1 = new ivas.gov.bisp.enumeration.M.D
            r1.<init>(r5)
            int r5 = ivas.gov.bisp.enumeration.p081d.C0283j.b
            r2 = r5 ^ 71
            r5 = r5 & 71
            r5 = r5 | r2
            int r5 = r5 << 1
            int r5 = r5 - r2
            int r2 = r5 % 128
            ivas.gov.bisp.enumeration.p081d.C0283j.a = r2
            int r5 = r5 % r0
            return r1
        L3f:
            int r5 = ivas.gov.bisp.enumeration.p081d.C0283j.a
            r1 = r5 ^ 47
            r2 = r5 & 47
            r1 = r1 | r2
            int r1 = r1 << 1
            int r2 = ~r2
            r5 = r5 | 47
            r5 = r5 & r2
            int r5 = -r5
            r2 = r1 & r5
            r5 = r5 | r1
            int r2 = r2 + r5
            int r5 = r2 % 128
            ivas.gov.bisp.enumeration.p081d.C0283j.b = r5
            int r2 = r2 % r0
            r5 = 0
            if (r2 != 0) goto L5a
            return r5
        L5a:
            r5.hashCode()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p081d.C0283j.f(android.view.View):ivas.gov.bisp.enumeration.M.D");
    }

    public void h(View view, al alVar) {
        int i = 2 % 2;
        int i2 = a + 99;
        b = i2 % 128;
        int i3 = i2 % 2;
        View.AccessibilityDelegate accessibilityDelegate = this.d;
        AccessibilityNodeInfo accessibilityNodeInfo = alVar.d;
        int i4 = b;
        int i5 = i4 ^ 17;
        int i6 = ((i4 & 17) | i5) << 1;
        int i7 = -i5;
        int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
        a = i8 % 128;
        int i9 = i8 % 2;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int i10 = a;
        int i11 = i10 & 65;
        int i12 = (i10 ^ 65) | i11;
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        b = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    public C0283j(View.AccessibilityDelegate accessibilityDelegate) {
        this.d = accessibilityDelegate;
        this.e = new aWk(this);
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0317 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x0317 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x0303 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0284 A[PHI: r0 r4
  0x0284: PHI (r0v34 android.text.style.ClickableSpan) = (r0v33 android.text.style.ClickableSpan), (r0v42 android.text.style.ClickableSpan) binds: [B:79:0x0282, B:76:0x0278] A[DONT_GENERATE, DONT_INLINE]
  0x0284: PHI (r4v17 boolean) = (r4v16 boolean), (r4v21 boolean) binds: [B:79:0x0282, B:76:0x0278] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:82:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:84:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:86:0x02ed A[LOOP:1: B:81:0x02b6->B:86:0x02ed, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:91:0x0327  */
    /* JADX WARN: Code duplicated, block: B:94:0x0346  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v55 */
    public boolean k(View view, int i, Bundle bundle) {
        Object obj;
        boolean zPerformAccessibilityAction;
        boolean z;
        boolean z2;
        ClickableSpan clickableSpan;
        ClickableSpan[] clickableSpanArrD;
        ?? r6;
        int i2;
        boolean z3;
        n.aXs axsNewInstance;
        String name;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = (i4 ^ 89) + ((i4 & 89) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        int i7 = 0;
        List listEmptyList = (List) view.getTag(R.id.tag_accessibility_actions);
        if (i6 == 0) {
            int i8 = 96 / 0;
        }
        if (listEmptyList == null) {
            int i9 = a;
            int i10 = (((i9 & (-12)) | ((~i9) & 11)) - (~((i9 & 11) << 1))) - 1;
            b = i10 % 128;
            if (i10 % 2 != 0) {
                listEmptyList = Collections.emptyList();
                int i11 = 30 / 0;
            } else {
                listEmptyList = Collections.emptyList();
            }
            int i12 = b;
            int i13 = i12 & 5;
            int i14 = i13 + ((i12 ^ 5) | i13);
            a = i14 % 128;
            int i15 = i14 % 2;
        }
        int i16 = b;
        int i17 = ((i16 ^ 70) + ((i16 & 70) << 1)) - 1;
        a = i17 % 128;
        if (i17 % 2 == 0) {
            int i18 = 4 / 2;
        }
        int i19 = 0;
        while (true) {
            obj = null;
            if (i19 < listEmptyList.size()) {
                int i20 = b;
                int i21 = ((i20 | 91) << 1) - (i20 ^ 91);
                a = i21 % 128;
                if (i21 % 2 == 0) {
                    throw null;
                }
                al.aXC axc = (al.aXC) listEmptyList.get(i19);
                if (axc.e() == i) {
                    int i22 = a;
                    int i23 = i22 & 53;
                    int i24 = -(-((i22 ^ 53) | i23));
                    int i25 = (i23 & i24) + (i24 | i23);
                    b = i25 % 128;
                    int i26 = i25 % 2;
                    if (axc.n != null) {
                        int i27 = a;
                        int i28 = i27 & 13;
                        int i29 = (i27 ^ 13) | i28;
                        int i30 = (i28 & i29) + (i29 | i28);
                        b = i30 % 128;
                        int i31 = i30 % 2;
                        Class<? extends n.aXs> cls = axc.m;
                        if (cls != null) {
                            int i32 = b + 3;
                            a = i32 % 128;
                            int i33 = i32 % 2;
                            try {
                                Constructor<? extends n.aXs> declaredConstructor = cls.getDeclaredConstructor(new Class[i7]);
                                Object[] objArr = new Object[i7];
                                int i34 = a;
                                int i35 = i34 & 117;
                                int i36 = ((i34 | 117) & (~i35)) + (i35 << 1);
                                b = i36 % 128;
                                int i37 = i36 % 2;
                                axsNewInstance = declaredConstructor.newInstance(objArr);
                                try {
                                    Objects.requireNonNull(axsNewInstance);
                                    int i38 = a;
                                    int i39 = i38 & 1;
                                    int i40 = i39 + ((i38 ^ 1) | i39);
                                    b = i40 % 128;
                                    int i41 = i40 % 2;
                                } catch (Exception e) {
                                    e = e;
                                    Class<? extends n.aXs> cls2 = axc.m;
                                    if (cls2 == null) {
                                        int i42 = a;
                                        int i43 = i42 & 77;
                                        int i44 = ((i42 | 77) & (~i43)) + (i43 << 1);
                                        b = i44 % 128;
                                        if (i44 % 2 != 0) {
                                            int i45 = 88 / i7;
                                        }
                                        name = "null";
                                    } else {
                                        name = cls2.getName();
                                        int i46 = b;
                                        int i47 = (i46 & 11) + (i46 | 11);
                                        a = i47 % 128;
                                        int i48 = i47 % 2;
                                    }
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("Failed to execute command with argument class ViewCommandArgument: ");
                                    int i49 = b;
                                    int i50 = i49 & 71;
                                    int i51 = i50 + ((i49 ^ 71) | i50);
                                    a = i51 % 128;
                                    if (i51 % 2 == 0) {
                                        sb.append(name);
                                        sb.toString();
                                        obj.hashCode();
                                        throw null;
                                    }
                                    sb.append(name);
                                    Log.e("A11yActionCompat", sb.toString(), e);
                                    int i52 = a;
                                    int i53 = (i52 & 55) + (i52 | 55);
                                    b = i53 % 128;
                                    int i54 = i53 % 2;
                                }
                            } catch (Exception e2) {
                                e = e2;
                                axsNewInstance = null;
                            }
                        } else {
                            axsNewInstance = null;
                        }
                        zPerformAccessibilityAction = axc.n.b(view, axsNewInstance);
                        int i55 = b;
                        int i56 = ((i55 | 121) << 1) - (i55 ^ 121);
                        int i57 = i56 % 128;
                        a = i57;
                        if (i56 % 2 == 0) {
                            obj.hashCode();
                            throw null;
                        }
                        int i58 = i57 & 97;
                        int i59 = (((i57 ^ 97) | i58) << 1) - ((i57 | 97) & (~i58));
                        b = i59 % 128;
                        int i60 = i59 % 2;
                        break;
                    }
                } else {
                    int i61 = (i19 | (-92)) << 1;
                    int i62 = -(((~i19) & (-92)) | (i19 & 91));
                    int i63 = ((i61 | i62) << 1) - (i61 ^ i62);
                    int i64 = i63 ^ 93;
                    int i65 = -(-((i63 & 93) << 1));
                    i19 = ((i64 | i65) << 1) - (i64 ^ i65);
                    int i66 = b;
                    int i67 = (i66 & 122) + (i66 | 122);
                    int i68 = (i67 ^ (-1)) + (i67 << 1);
                    a = i68 % 128;
                    int i69 = i68 % 2;
                    i7 = 0;
                }
            }
            int i70 = b;
            int i71 = ((i70 | 79) << 1) - (i70 ^ 79);
            a = i71 % 128;
            int i72 = i71 % 2;
            zPerformAccessibilityAction = false;
            break;
        }
        if (!zPerformAccessibilityAction) {
            int i73 = a;
            int i74 = ((i73 | 23) << 1) - (i73 ^ 23);
            b = i74 % 128;
            if (i74 % 2 != 0) {
                this.d.performAccessibilityAction(view, i, bundle);
                throw null;
            }
            zPerformAccessibilityAction = this.d.performAccessibilityAction(view, i, bundle);
        }
        if (!zPerformAccessibilityAction) {
            int i75 = a;
            int i76 = i75 & 93;
            int i77 = -(-((i75 ^ 93) | i76));
            int i78 = ((i76 | i77) << 1) - (i77 ^ i76);
            int i79 = i78 % 128;
            b = i79;
            if (i78 % 2 != 0) {
                throw null;
            }
            if (i == R.id.accessibility_action_clickable_span) {
                int i80 = i79 & 95;
                int i81 = ((((i79 ^ 95) | i80) << 1) - (~(-((~i80) & (i79 | 95))))) - 1;
                a = i81 % 128;
                int i82 = i81 % 2;
                int i83 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
                SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
                int i84 = a + 97;
                int i85 = i84 % 128;
                b = i85;
                int i86 = i84 % 2;
                if (sparseArray != null) {
                    int i87 = i85 + 89;
                    a = i87 % 128;
                    int i88 = i87 % 2;
                    WeakReference weakReference = (WeakReference) sparseArray.get(i83);
                    int i89 = b;
                    int i90 = (i89 & (-72)) | ((~i89) & 71);
                    int i91 = -(-((i89 & 71) << 1));
                    int i92 = (i90 ^ i91) + ((i90 & i91) << 1);
                    a = i92 % 128;
                    if (i92 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    if (weakReference != null) {
                        int i93 = i89 & 41;
                        int i94 = (i89 | 41) & (~i93);
                        int i95 = -(-(i93 << 1));
                        int i96 = (i94 & i95) + (i94 | i95);
                        a = i96 % 128;
                        if (i96 % 2 == 0) {
                            clickableSpan = (ClickableSpan) weakReference.get();
                            z = false;
                            int i97 = 81 / 0;
                            if (clickableSpan != null) {
                                clickableSpanArrD = al.d(view.createAccessibilityNodeInfo().getText());
                                int i98 = b;
                                int i99 = ((i98 ^ 34) + ((i98 & 34) << 1)) - 1;
                                a = i99 % 128;
                                int i100 = i99 % 2;
                                int i101 = ((i98 ^ 119) | (i98 & 119)) << 1;
                                int i102 = -(((~i98) & 119) | (i98 & (-120)));
                                int i103 = ((i101 | i102) << 1) - (i102 ^ i101);
                                a = i103 % 128;
                                int i104 = i103 % 2;
                                r6 = z;
                                while (true) {
                                    if (clickableSpanArrD != null) {
                                        int i105 = a;
                                        int i106 = i105 & 35;
                                        int i107 = -(-((i105 ^ 35) | i106));
                                        int i108 = ((i106 | i107) << 1) - (i107 ^ i106);
                                        i2 = i108 % 128;
                                        b = i2;
                                        int i109 = i108 % 2;
                                        if (r6 < clickableSpanArrD.length) {
                                            int i110 = ((i2 ^ 105) | (i2 & 105)) << 1;
                                            int i111 = -(((~i2) & 105) | (i2 & (-106)));
                                            int i112 = (i110 ^ i111) + ((i111 & i110) << 1);
                                            a = i112 % 128;
                                            int i113 = i112 % 2;
                                            if (!clickableSpan.equals(clickableSpanArrD[r6])) {
                                                int i114 = a;
                                                int i115 = i114 + 75;
                                                b = i115 % 128;
                                                int i116 = i115 % 2;
                                                int i117 = (i114 & 1) + (i114 | 1);
                                                b = i117 % 128;
                                                int i118 = i117 % 2;
                                                z3 = true;
                                                break;
                                            }
                                            int i119 = (r6 ^ 75) + ((r6 & 75) << 1);
                                            int i120 = ((i119 | (-74)) << 1) - (i119 ^ (-74));
                                            int i121 = a + 77;
                                            b = i121 % 128;
                                            int i122 = i121 % 2;
                                            r6 = i120;
                                        }
                                    }
                                }
                            }
                            if (!(!z3)) {
                                int i123 = b + 83;
                                a = i123 % 128;
                                int i124 = i123 % 2;
                                clickableSpan.onClick(view);
                                int i125 = a;
                                int i126 = (i125 ^ 31) + ((i125 & 31) << 1);
                                b = i126 % 128;
                                int i127 = i126 % 2;
                                z2 = true;
                            }
                        } else {
                            z = false;
                            clickableSpan = (ClickableSpan) weakReference.get();
                            if (clickableSpan != null) {
                                clickableSpanArrD = al.d(view.createAccessibilityNodeInfo().getText());
                                int i910 = b;
                                int i911 = ((i910 ^ 34) + ((i910 & 34) << 1)) - 1;
                                a = i911 % 128;
                                int i1010 = i911 % 2;
                                int i1011 = ((i910 ^ 119) | (i910 & 119)) << 1;
                                int i1012 = -(((~i910) & 119) | (i910 & (-120)));
                                int i1013 = ((i1011 | i1012) << 1) - (i1012 ^ i1011);
                                a = i1013 % 128;
                                int i1014 = i1013 % 2;
                                r6 = z;
                                while (true) {
                                    if (clickableSpanArrD != null) {
                                        int i1015 = a;
                                        int i1016 = i1015 & 35;
                                        int i1017 = -(-((i1015 ^ 35) | i1016));
                                        int i1018 = ((i1016 | i1017) << 1) - (i1017 ^ i1016);
                                        i2 = i1018 % 128;
                                        b = i2;
                                        int i1019 = i1018 % 2;
                                        if (r6 < clickableSpanArrD.length) {
                                            int i1110 = ((i2 ^ 105) | (i2 & 105)) << 1;
                                            int i1111 = -(((~i2) & 105) | (i2 & (-106)));
                                            int i1112 = (i1110 ^ i1111) + ((i1111 & i1110) << 1);
                                            a = i1112 % 128;
                                            int i1113 = i1112 % 2;
                                            if (!clickableSpan.equals(clickableSpanArrD[r6])) {
                                                int i1114 = a;
                                                int i1115 = i1114 + 75;
                                                b = i1115 % 128;
                                                int i1116 = i1115 % 2;
                                                int i1117 = (i1114 & 1) + (i1114 | 1);
                                                b = i1117 % 128;
                                                int i1118 = i1117 % 2;
                                                z3 = true;
                                                break;
                                            }
                                            int i1119 = (r6 ^ 75) + ((r6 & 75) << 1);
                                            int i128 = ((i1119 | (-74)) << 1) - (i1119 ^ (-74));
                                            int i129 = a + 77;
                                            b = i129 % 128;
                                            int i1210 = i129 % 2;
                                            r6 = i128;
                                        }
                                    }
                                }
                            }
                            if (!(!z3)) {
                                int i1211 = b + 83;
                                a = i1211 % 128;
                                int i1212 = i1211 % 2;
                                clickableSpan.onClick(view);
                                int i1213 = a;
                                int i1214 = (i1213 ^ 31) + ((i1213 & 31) << 1);
                                b = i1214 % 128;
                                int i1215 = i1214 % 2;
                                z2 = true;
                            }
                        }
                        int i130 = b;
                        int i131 = (i130 & 51) + (i130 | 51);
                        a = i131 % 128;
                        int i132 = i131 % 2;
                        z3 = z;
                        if (!(!z3)) {
                            int i1216 = b + 83;
                            a = i1216 % 128;
                            int i1217 = i1216 % 2;
                            clickableSpan.onClick(view);
                            int i1218 = a;
                            int i1219 = (i1218 ^ 31) + ((i1218 & 31) << 1);
                            b = i1219 % 128;
                            int i12110 = i1219 % 2;
                            z2 = true;
                        }
                    } else {
                        z = false;
                    }
                    z2 = z;
                } else {
                    z = false;
                    z2 = z;
                }
                int i133 = b;
                int i134 = i133 & 23;
                int i135 = ((i133 | 23) & (~i134)) + (i134 << 1);
                a = i135 % 128;
                int i136 = i135 % 2;
                zPerformAccessibilityAction = z2;
            }
        }
        int i137 = a;
        int i138 = i137 & 35;
        int i139 = i138 + ((i137 ^ 35) | i138);
        b = i139 % 128;
        int i140 = i139 % 2;
        return zPerformAccessibilityAction;
    }
}
