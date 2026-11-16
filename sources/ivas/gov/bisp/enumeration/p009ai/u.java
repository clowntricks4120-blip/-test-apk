package ivas.gov.bisp.enumeration.p009ai;

import android.util.Base64;
import ivas.gov.bisp.enumeration.p091n.j;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class u {
    private static int a = 1;
    private static int b;
    public final String c;
    public final String d;
    public final String e;
    public final List<List<byte[]>> f;
    public final String g;

    public u(String str, String str2, String str3, List<List<byte[]>> list) {
        Objects.requireNonNull(str);
        this.c = str;
        Objects.requireNonNull(str2);
        this.d = str2;
        this.e = str3;
        Objects.requireNonNull(list);
        this.f = list;
        StringBuilder sb = new StringBuilder(str);
        sb.append("-");
        sb.append(str2);
        sb.append("-");
        sb.append(str3);
        this.g = sb.toString();
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        StringBuilder sbW = j.w("FontRequest {mProviderAuthority: ");
        int i2 = a;
        int i3 = ((i2 | 41) << 1) - (i2 ^ 41);
        b = i3 % 128;
        if (i3 % 2 != 0) {
            sbW.append(this.c);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        sbW.append(this.c);
        int i4 = a + 81;
        b = i4 % 128;
        int i5 = i4 % 2;
        sbW.append(", mProviderPackage: ");
        String str = this.d;
        int i6 = b;
        int i7 = i6 | 117;
        int i8 = i7 << 1;
        int i9 = -((~(i6 & 117)) & i7);
        int i10 = (i8 & i9) + (i9 | i8);
        a = i10 % 128;
        int i11 = i10 % 2;
        sbW.append(str);
        sbW.append(", mQuery: ");
        int i12 = b;
        int i13 = (((i12 | 28) << 1) - (i12 ^ 28)) - 1;
        a = i13 % 128;
        int i14 = i13 % 2;
        sbW.append(this.e);
        int i15 = b + 107;
        a = i15 % 128;
        int i16 = i15 % 2;
        sbW.append(", mCertificates:");
        String string = sbW.toString();
        int i17 = a;
        int i18 = i17 & 15;
        int i19 = (((i17 | 15) & (~i18)) - (~(-(-(i18 << 1))))) - 1;
        b = i19 % 128;
        int i20 = i19 % 2;
        sb.append(string);
        int i21 = b;
        int i22 = i21 ^ 91;
        int i23 = -(-((i21 & 91) << 1));
        int i24 = (i22 & i23) + (i23 | i22);
        a = i24 % 128;
        int i25 = i24 % 2;
        int i26 = 0;
        while (i26 < this.f.size()) {
            int i27 = b;
            int i28 = i27 | 9;
            int i29 = i28 << 1;
            int i30 = -((~(i27 & 9)) & i28);
            int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
            a = i31 % 128;
            int i32 = i31 % 2;
            sb.append(" [");
            List<byte[]> list = this.f.get(i26);
            int i33 = a;
            int i34 = ((i33 | 11) << 1) - (i33 ^ 11);
            int i35 = i34 % 128;
            b = i35;
            int i36 = i34 % 2;
            List<byte[]> list2 = list;
            int i37 = i35 + 19;
            a = i37 % 128;
            int i38 = i37 % 2;
            int i39 = 0;
            while (i39 < list2.size()) {
                int i40 = b;
                int i41 = i40 & 3;
                int i42 = (((i40 ^ 3) | i41) << 1) - ((i40 | 3) & (~i41));
                a = i42 % 128;
                int i43 = i42 % 2;
                sb.append(" \"");
                byte[] bArr = list2.get(i39);
                int i44 = a;
                int i45 = ((i44 ^ 41) | (i44 & 41)) << 1;
                int i46 = -(((~i44) & 41) | (i44 & (-42)));
                int i47 = (i45 ^ i46) + ((i46 & i45) << 1);
                b = i47 % 128;
                sb.append(i47 % 2 != 0 ? Base64.encodeToString(bArr, 0) : Base64.encodeToString(bArr, 0));
                sb.append("\"");
                int i48 = ((i39 ^ 1) | (i39 & 1)) << 1;
                int i49 = -(((~i39) & 1) | (i39 & (-2)));
                i39 = ((i48 | i49) << 1) - (i49 ^ i48);
                int i50 = a + 65;
                b = i50 % 128;
                int i51 = i50 % 2;
            }
            sb.append(" ]");
            int i52 = i26 & 14;
            int i53 = -(-((i26 ^ 14) | i52));
            int i54 = (i52 ^ i53) + ((i53 & i52) << 1);
            int i55 = i54 & (-13);
            int i56 = -(-((i54 ^ (-13)) | i55));
            i26 = (i55 | i56) + (i55 & i56);
            int i57 = a;
            int i58 = (((i57 ^ 55) | (i57 & 55)) << 1) - (((~i57) & 55) | (i57 & (-56)));
            b = i58 % 128;
            if (i58 % 2 != 0) {
                int i59 = 4 / 2;
            }
        }
        String strU = j.u(sb, "}", "mCertificatesArray: 0");
        int i60 = a;
        int i61 = (i60 ^ 95) + ((i60 & 95) << 1);
        b = i61 % 128;
        if (i61 % 2 != 0) {
            int i62 = 0 / 0;
        }
        return strU;
    }
}
