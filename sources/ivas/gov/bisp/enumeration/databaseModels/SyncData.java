package ivas.gov.bisp.enumeration.databaseModels;

import androidx.annotation.Keep;
import ivas.gov.bisp.enumeration.o000Ooo.o0OO00O;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class SyncData {
    private static int a = 0;
    private static int b = 1;

    @o0OO00O("data")
    private Data data;

    @o0OO00O("force_update")
    private String forceUpdate;

    @o0OO00O("message")
    private String message;

    @o0OO00O("status")
    private String status;

    @o0OO00O("version")
    private String version;

    public Data getData() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 75;
        int i4 = i3 + ((i2 ^ 75) | i3);
        int i5 = i4 % 128;
        b = i5;
        int i6 = i4 % 2;
        Data data = this.data;
        int i7 = ((i5 ^ 105) - (~(-(-((i5 & 105) << 1))))) - 1;
        a = i7 % 128;
        int i8 = i7 % 2;
        return data;
    }

    public String getForceUpdate() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 51) << 1) - (i2 ^ 51);
        b = i3 % 128;
        if (i3 % 2 != 0) {
            return this.forceUpdate;
        }
        throw null;
    }

    public String getMessage() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 33;
        int i4 = i3 + ((i2 ^ 33) | i3);
        a = i4 % 128;
        int i5 = i4 % 2;
        String str = this.message;
        if (i5 != 0) {
            int i6 = 8 / 0;
        }
        return str;
    }

    public String getStatus() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 & (-18)) | ((~i2) & 17)) - (~((i2 & 17) << 1))) - 1;
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        String str = this.status;
        int i6 = i4 + 99;
        a = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public String getVersion() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 | 57;
        int i4 = i3 << 1;
        int i5 = -((~(i2 & 57)) & i3);
        int i6 = (i4 & i5) + (i5 | i4);
        int i7 = i6 % 128;
        b = i7;
        if (i6 % 2 == 0) {
            throw null;
        }
        String str = this.version;
        int i8 = i7 + 19;
        a = i8 % 128;
        int i9 = i8 % 2;
        return str;
    }

    public void setData(Data data) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 55) + ((i2 & 55) << 1);
        b = i3 % 128;
        if (i3 % 2 == 0) {
            this.data = data;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.data = data;
        int i4 = i2 & 33;
        int i5 = i4 + ((i2 ^ 33) | i4);
        b = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setForceUpdate(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 73;
        int i4 = i3 + ((i2 ^ 73) | i3);
        a = i4 % 128;
        int i5 = i4 % 2;
        this.forceUpdate = str;
        int i6 = i2 & 27;
        int i7 = (i2 | 27) & (~i6);
        int i8 = i6 << 1;
        int i9 = (i7 & i8) + (i8 | i7);
        a = i9 % 128;
        int i10 = i9 % 2;
    }

    public void setMessage(String str) {
        int i = 2 % 2;
        int i2 = (-2) - ((b + 102) ^ (-1));
        a = i2 % 128;
        int i3 = i2 % 2;
        this.message = str;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setStatus(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 & (-100)) | ((~i2) & 99)) - (~((i2 & 99) << 1))) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        this.status = str;
        if (i4 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setVersion(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 121;
        int i4 = -(-((i2 ^ 121) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        this.version = str;
        int i8 = i6 & 63;
        int i9 = (i6 | 63) & (~i8);
        int i10 = i8 << 1;
        int i11 = (i9 & i10) + (i10 | i9);
        a = i11 % 128;
        if (i11 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
