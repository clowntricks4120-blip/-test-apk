package ivas.gov.bisp.enumeration.models;

/* JADX INFO: loaded from: classes.dex */
public class KeyValue {
    private static int a = 1;
    private static int b;
    private String key;
    private String value;

    public KeyValue(String str, String str2) {
        this.key = str;
        this.value = str2;
    }

    public String getKey() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 86) + ((i2 & 86) << 1)) - 1;
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        String str = this.key;
        int i6 = (i4 & (-70)) | ((~i4) & 69);
        int i7 = (i4 & 69) << 1;
        int i8 = (i6 & i7) + (i7 | i6);
        b = i8 % 128;
        if (i8 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getValue() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 87) + ((i2 & 87) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        String str = this.value;
        int i5 = (i2 ^ 111) + ((i2 & 111) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setKey(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 65;
        int i4 = (i3 - (~(-(-((i2 ^ 65) | i3))))) - 1;
        int i5 = i4 % 128;
        b = i5;
        int i6 = i4 % 2;
        this.key = str;
        if (i6 != 0) {
            int i7 = 63 / 0;
        }
        int i8 = i5 & 77;
        int i9 = ((((i5 ^ 77) | i8) << 1) - (~(-((i5 | 77) & (~i8))))) - 1;
        a = i9 % 128;
        if (i9 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setValue(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 | 55;
        int i4 = i3 << 1;
        int i5 = -(i3 & (~(i2 & 55)));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        this.value = str;
        int i8 = (i2 ^ 53) + ((i2 & 53) << 1);
        b = i8 % 128;
        int i9 = i8 % 2;
    }
}
