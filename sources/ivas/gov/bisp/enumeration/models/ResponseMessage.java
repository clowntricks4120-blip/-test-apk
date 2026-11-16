package ivas.gov.bisp.enumeration.models;

/* JADX INFO: loaded from: classes.dex */
public class ResponseMessage {
    private static int a = 0;
    private static int b = 1;
    private String errorMessage;
    public boolean isLogout;
    private int statusCode;

    public ResponseMessage(int i, String str, boolean z) {
        this.statusCode = i;
        this.errorMessage = str;
        this.isLogout = z;
    }

    public String getErrorMessage() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 35) + ((i2 & 35) << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        String str = this.errorMessage;
        int i5 = (i2 ^ 79) + ((i2 & 79) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public int getStatusCode() {
        int i = 2 % 2;
        int i2 = b + 83;
        a = i2 % 128;
        if (i2 % 2 == 0) {
            return this.statusCode;
        }
        throw null;
    }

    public boolean isLogout() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 | 81;
        int i4 = i3 << 1;
        int i5 = -((~(i2 & 81)) & i3);
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            return this.isLogout;
        }
        int i7 = 92 / 0;
        return this.isLogout;
    }

    public void setErrorMessage(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 45;
        int i4 = -(-((i2 ^ 45) | i3));
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        if (i5 % 2 == 0) {
            this.errorMessage = str;
            return;
        }
        this.errorMessage = str;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setLogout(boolean z) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 101;
        int i4 = (i2 | 101) & (~i3);
        int i5 = i3 << 1;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        int i7 = i6 % 128;
        b = i7;
        int i8 = i6 % 2;
        this.isLogout = z;
        int i9 = (-2) - ((i7 + 116) ^ (-1));
        a = i9 % 128;
        int i10 = i9 % 2;
    }

    public void setStatusCode(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 + 29;
        a = i4 % 128;
        int i5 = i4 % 2;
        this.statusCode = i;
        int i6 = (i3 & (-124)) | ((~i3) & 123);
        int i7 = -(-((i3 & 123) << 1));
        int i8 = (i6 & i7) + (i6 | i7);
        a = i8 % 128;
        int i9 = i8 % 2;
    }
}
