package ivas.gov.bisp.enumeration.aM;

import android.view.View;
import ivas.gov.bisp.enumeration.p091n.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class T {
    private static int a = 1;
    private static int b;
    public View d;
    public final Map<String, Object> c = new HashMap();
    public final ArrayList<J> e = new ArrayList<>();

    @Deprecated
    public T() {
    }

    public boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = a + 15;
        int i3 = i2 % 128;
        b = i3;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            boolean z = obj instanceof T;
            obj2.hashCode();
            throw null;
        }
        if (!(!(obj instanceof T))) {
            T t = (T) obj;
            if (this.d == t.d) {
                int i4 = i3 ^ 35;
                int i5 = (((i3 & 35) | i4) << 1) - i4;
                a = i5 % 128;
                if (i5 % 2 == 0) {
                    this.c.equals(t.c);
                    throw null;
                }
                if (this.c.equals(t.c)) {
                    int i6 = b;
                    int i7 = (-2) - (((i6 & 122) + (i6 | 122)) ^ (-1));
                    a = i7 % 128;
                    int i8 = i7 % 2;
                    int i9 = (-2) - (((i6 ^ 126) + ((i6 & 126) << 1)) ^ (-1));
                    a = i9 % 128;
                    int i10 = i9 % 2;
                    return true;
                }
            }
        }
        int i11 = a;
        int i12 = ((i11 | 79) << 1) - (i11 ^ 79);
        b = i12 % 128;
        if (i12 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 101;
        int i4 = (i2 ^ 101) | i3;
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            this.d.hashCode();
            this.c.hashCode();
            throw null;
        }
        int iHashCode = this.d.hashCode();
        int iHashCode2 = this.c.hashCode();
        int i6 = a;
        int i7 = i6 + 115;
        b = i7 % 128;
        int i8 = i7 % 2;
        int i9 = -(-(iHashCode * 31));
        int i10 = iHashCode2 ^ i9;
        int i11 = ((i9 & iHashCode2) | i10) << 1;
        int i12 = -i10;
        int i13 = (i11 & i12) + (i11 | i12);
        int i14 = i6 + 117;
        b = i14 % 128;
        if (i14 % 2 == 0) {
            return i13;
        }
        obj.hashCode();
        throw null;
    }

    public String toString() {
        StringBuilder sbW;
        String hexString;
        Iterator<String> it;
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((((i2 ^ 83) | (i2 & 83)) << 1) - (~(-(((~i2) & 83) | (i2 & (-84)))))) - 1;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            sbW = j.w("TransitionValues@");
            hexString = Integer.toHexString(hashCode());
            int i4 = 85 / 0;
        } else {
            sbW = j.w("TransitionValues@");
            hexString = Integer.toHexString(hashCode());
        }
        int i5 = a;
        int i6 = ((i5 ^ 83) | (i5 & 83)) << 1;
        int i7 = -(((~i5) & 83) | (i5 & (-84)));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        b = i8 % 128;
        Object obj = null;
        if (i8 % 2 != 0) {
            sbW.append(hexString);
            sbW.append(":\n");
            obj.hashCode();
            throw null;
        }
        sbW.append(hexString);
        sbW.append(":\n");
        StringBuilder sbB = ivas.gov.bisp.enumeration.p003ac.P.b(sbW.toString(), "    view = ");
        View view = this.d;
        int i9 = a;
        int i10 = (((i9 | 40) << 1) - (i9 ^ 40)) - 1;
        b = i10 % 128;
        int i11 = i10 % 2;
        sbB.append(view);
        sbB.append("\n");
        int i12 = a;
        int i13 = (i12 ^ 87) + ((i12 & 87) << 1);
        b = i13 % 128;
        if (i13 % 2 != 0) {
            j.r(sbB.toString(), "    values:");
            throw null;
        }
        String strR = j.r(sbB.toString(), "    values:");
        Map<String, Object> map = this.c;
        int i14 = b;
        int i15 = ((i14 & 3) - (~(i14 | 3))) - 1;
        a = i15 % 128;
        if (i15 % 2 == 0) {
            it = map.keySet().iterator();
            int i16 = 45 / 0;
        } else {
            it = map.keySet().iterator();
        }
        while (it.hasNext()) {
            String next = it.next();
            StringBuilder sb = new StringBuilder();
            int i17 = a;
            int i18 = i17 & 23;
            int i19 = ((i17 ^ 23) | i18) << 1;
            int i20 = -((i17 | 23) & (~i18));
            int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
            b = i21 % 128;
            if (i21 % 2 != 0) {
                sb.append(strR);
                sb.append("    ");
                throw null;
            }
            sb.append(strR);
            sb.append("    ");
            int i22 = b;
            int i23 = i22 ^ 125;
            int i24 = (i22 & 125) << 1;
            int i25 = (i23 & i24) + (i24 | i23);
            a = i25 % 128;
            int i26 = i25 % 2;
            sb.append(next);
            sb.append(": ");
            int i27 = b;
            int i28 = (((i27 & (-70)) | ((~i27) & 69)) - (~((i27 & 69) << 1))) - 1;
            a = i28 % 128;
            if (i28 % 2 == 0) {
                sb.append(this.c.get(next));
                int i29 = 32 / 0;
            } else {
                sb.append(this.c.get(next));
            }
            sb.append("\n");
            strR = sb.toString();
            int i30 = a;
            int i31 = (((i30 ^ 53) | (i30 & 53)) << 1) - (((~i30) & 53) | (i30 & (-54)));
            b = i31 % 128;
            if (i31 % 2 != 0) {
                int i32 = 5 % 2;
            }
        }
        int i33 = a;
        int i34 = i33 & 117;
        int i35 = (i33 | 117) & (~i34);
        int i36 = -(-(i34 << 1));
        int i37 = ((i35 | i36) << 1) - (i35 ^ i36);
        b = i37 % 128;
        int i38 = i37 % 2;
        return strR;
    }

    public T(View view) {
        this.d = view;
    }
}
