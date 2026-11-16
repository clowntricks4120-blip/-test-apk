package ivas.gov.bisp.enumeration.aD;

import java.io.IOException;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aD.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0065v extends IOException {
    private static int a = 1;
    private static int b;

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aD.v$bkY */
    public static class bkY extends C0065v {
        public bkY(String str) {
            super(str);
        }
    }

    public C0065v(String str) {
        super(str);
    }

    public static C0065v c() {
        int i = 2 % 2;
        C0065v c0065v = new C0065v("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        int i2 = a + 113;
        b = i2 % 128;
        int i3 = i2 % 2;
        return c0065v;
    }

    public static C0065v d() {
        int i = 2 % 2;
        C0065v c0065v = new C0065v("Protocol message end-group tag did not match expected tag.");
        int i2 = b + 119;
        a = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 69 / 0;
        }
        return c0065v;
    }

    public static C0065v e() {
        int i = 2 % 2;
        C0065v c0065v = new C0065v("Protocol message contained an invalid tag (zero).");
        int i2 = b;
        int i3 = (i2 & (-28)) | ((~i2) & 27);
        int i4 = (i2 & 27) << 1;
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        if (i5 % 2 != 0) {
            return c0065v;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static C0065v f() {
        int i = 2 % 2;
        C0065v c0065v = new C0065v("Protocol message had invalid UTF-8.");
        int i2 = b;
        int i3 = (i2 & 93) + (i2 | 93);
        a = i3 % 128;
        int i4 = i3 % 2;
        return c0065v;
    }

    public static bkY g() {
        int i = 2 % 2;
        bkY bky = new bkY("Protocol message tag had invalid wire type.");
        int i2 = b;
        int i3 = (i2 ^ 79) + ((i2 & 79) << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        return bky;
    }

    public static C0065v h() {
        int i = 2 % 2;
        C0065v c0065v = new C0065v("CodedInputStream encountered a malformed varint.");
        int i2 = a;
        int i3 = i2 & 55;
        int i4 = (i3 - (~((i2 ^ 55) | i3))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        return c0065v;
    }

    public static C0065v i() {
        int i = 2 % 2;
        C0065v c0065v = new C0065v("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        int i2 = a;
        int i3 = (i2 & 75) + (i2 | 75);
        b = i3 % 128;
        if (i3 % 2 == 0) {
            return c0065v;
        }
        throw null;
    }

    public static C0065v j() {
        int i = 2 % 2;
        C0065v c0065v = new C0065v("Failed to parse the message.");
        int i2 = b;
        int i3 = i2 & 49;
        int i4 = (i2 ^ 49) | i3;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 99 / 0;
        }
        return c0065v;
    }
}
