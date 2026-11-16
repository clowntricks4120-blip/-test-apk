package ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class CitizenData {
    private static int a = 1;
    private static int b;
    public String cnic;
    public String data;

    public CitizenData(String str, String str2) {
        this.cnic = str;
        this.data = str2;
    }

    public String getCnic() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (-2) - ((((i2 | 36) << 1) - (i2 ^ 36)) ^ (-1));
        a = i3 % 128;
        if (i3 % 2 != 0) {
            return this.cnic;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getData() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-2)) | ((~i2) & 1);
        int i4 = -(-((i2 & 1) << 1));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        String str = this.data;
        if (i7 != 0) {
            int i8 = 68 / 0;
        }
        int i9 = i6 & 61;
        int i10 = ((i6 ^ 61) | i9) << 1;
        int i11 = -((i6 | 61) & (~i9));
        int i12 = (i10 & i11) + (i11 | i10);
        a = i12 % 128;
        int i13 = i12 % 2;
        return str;
    }

    public void setCnic(String str) {
        int i = 2 % 2;
        int i2 = a + 77;
        b = i2 % 128;
        int i3 = i2 % 2;
        this.cnic = str;
        if (i3 != 0) {
            throw null;
        }
    }

    public void setData(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 77;
        int i4 = i3 + ((i2 ^ 77) | i3);
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        Object obj = null;
        this.data = str;
        if (i6 == 0) {
            obj.hashCode();
            throw null;
        }
        int i7 = i5 & 73;
        int i8 = (i5 ^ 73) | i7;
        int i9 = (i7 & i8) + (i7 | i8);
        b = i9 % 128;
        if (i9 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
