package ivas.gov.bisp.enumeration.M;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class D {
    private static int a = 0;
    private static int b = 1;
    public final Object c;

    public static class aXG extends AccessibilityNodeProvider {
        private static int a = 0;
        private static int b = 1;
        public final D c;

        public aXG(D d) {
            this.c = d;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            int i2 = 2 % 2;
            int i3 = a + 77;
            b = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                this.c.d(i);
                obj.hashCode();
                throw null;
            }
            al alVarD = this.c.d(i);
            if (alVarD != null) {
                AccessibilityNodeInfo accessibilityNodeInfo = alVarD.d;
                int i4 = b + 55;
                a = i4 % 128;
                int i5 = i4 % 2;
                return accessibilityNodeInfo;
            }
            int i6 = a;
            int i7 = i6 + 113;
            b = i7 % 128;
            int i8 = i7 % 2;
            int i9 = i6 ^ 63;
            int i10 = (((i6 & 63) | i9) << 1) - i9;
            b = i10 % 128;
            int i11 = i10 % 2;
            return null;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i, int i2, Bundle bundle) {
            int i3 = 2 % 2;
            int i4 = b;
            int i5 = (i4 ^ 77) + ((i4 & 77) << 1);
            a = i5 % 128;
            if (i5 % 2 != 0) {
                this.c.f(i, i2, bundle);
                throw null;
            }
            boolean zF = this.c.f(i, i2, bundle);
            int i6 = a;
            int i7 = i6 ^ 59;
            int i8 = -(-((i6 & 59) << 1));
            int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
            b = i9 % 128;
            int i10 = i9 % 2;
            return zF;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = (((i3 ^ 15) | (i3 & 15)) << 1) - (((~i3) & 15) | (i3 & (-16)));
            b = i4 % 128;
            int i5 = i4 % 2;
            Objects.requireNonNull(this.c);
            int i6 = b;
            int i7 = i6 & 85;
            int i8 = ((i6 ^ 85) | i7) << 1;
            int i9 = -((i6 | 85) & (~i7));
            int i10 = (i8 & i9) + (i9 | i8);
            a = i10 % 128;
            int i11 = i10 % 2;
            return null;
        }
    }

    public static class aXH extends aXG {
        private static int a = 1;
        private static int b;

        public aXH(D d) {
            super(d);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i) {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = i3 & 99;
            int i5 = (i3 | 99) & (~i4);
            int i6 = i4 << 1;
            int i7 = (i5 & i6) + (i5 | i6);
            b = i7 % 128;
            Object obj = null;
            if (i7 % 2 != 0) {
                this.c.e(i);
                obj.hashCode();
                throw null;
            }
            al alVarE = this.c.e(i);
            if (alVarE == null) {
                int i8 = a + 43;
                b = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 51 / 0;
                }
                return null;
            }
            AccessibilityNodeInfo accessibilityNodeInfo = alVarE.d;
            int i10 = a;
            int i11 = ((i10 | 115) << 1) - (i10 ^ 115);
            b = i11 % 128;
            if (i11 % 2 == 0) {
                return accessibilityNodeInfo;
            }
            throw null;
        }
    }

    public static class aXI extends aXH {
        private static int a = 0;
        private static int b = 1;

        public aXI(D d) {
            super(d);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = i3 & 99;
            int i5 = (i3 ^ 99) | i4;
            int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
            a = i6 % 128;
            int i7 = i6 % 2;
            Objects.requireNonNull(this.c);
            int i8 = b;
            int i9 = ((i8 | 61) << 1) - (i8 ^ 61);
            a = i9 % 128;
            int i10 = i9 % 2;
        }
    }

    public D() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.c = new aXI(this);
            int i = a;
            int i2 = i & 51;
            int i3 = (i ^ 51) | i2;
            int i4 = (i2 & i3) + (i3 | i2);
            b = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 60 / 0;
                return;
            }
            return;
        }
        this.c = new aXH(this);
        int i6 = b;
        int i7 = i6 & 125;
        int i8 = -(-(i6 | 125));
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        a = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 55 / 0;
        }
    }

    public al d(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 ^ 63;
        int i5 = -(-((i3 & 63) << 1));
        int i6 = (i4 & i5) + (i5 | i4);
        int i7 = i6 % 128;
        a = i7;
        if (i6 % 2 != 0) {
            int i8 = 88 / 0;
        }
        int i9 = i7 + 69;
        b = i9 % 128;
        Object obj = null;
        if (i9 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public al e(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 | 109;
        int i5 = i4 << 1;
        int i6 = -((~(i3 & 109)) & i4);
        int i7 = (i5 & i6) + (i6 | i5);
        int i8 = i7 % 128;
        b = i8;
        int i9 = i7 % 2;
        int i10 = (i8 | 69) << 1;
        int i11 = -(i8 ^ 69);
        int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
        a = i12 % 128;
        int i13 = i12 % 2;
        return null;
    }

    public boolean f(int i, int i2, Bundle bundle) {
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = i4 & 81;
        int i6 = (i5 - (~((i4 ^ 81) | i5))) - 1;
        a = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public D(Object obj) {
        this.c = obj;
    }
}
