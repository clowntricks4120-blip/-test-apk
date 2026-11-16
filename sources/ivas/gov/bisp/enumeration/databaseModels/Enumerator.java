package ivas.gov.bisp.enumeration.databaseModels;

import androidx.annotation.Keep;
import ivas.gov.bisp.enumeration.o000Ooo.o0OO00O;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class Enumerator {
    private static int a = 0;
    private static int b = 1;

    @o0OO00O("question_options")
    private List<Item> items;

    @o0OO00O("message")
    private String message;

    @o0OO00O("status")
    private String status;

    @o0OO00O("structural_version")
    private int structuralVersion;

    public List<Item> getItems() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 111) + ((i2 & 111) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        List<Item> list = this.items;
        int i5 = ((i2 ^ 82) + ((i2 & 82) << 1)) - 1;
        b = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public String getMessage() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & (-4)) | ((~i2) & 3)) + ((i2 & 3) << 1);
        b = i3 % 128;
        if (i3 % 2 != 0) {
            return this.message;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getStatus() {
        String str;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 35;
        int i4 = (((~i3) & (i2 | 35)) - (~(i3 << 1))) - 1;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            str = this.status;
            int i5 = 42 / 0;
        } else {
            str = this.status;
        }
        int i6 = (i2 & 2) + (i2 | 2);
        int i7 = (i6 ^ (-1)) + (i6 << 1);
        b = i7 % 128;
        int i8 = i7 % 2;
        return str;
    }

    public int getStructuralVersion() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 11;
        int i4 = (((i2 & 11) | i3) << 1) - i3;
        a = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.structuralVersion;
        if (i5 != 0) {
            int i7 = 23 / 0;
        }
        int i8 = (i2 & (-4)) | ((~i2) & 3);
        int i9 = -(-((i2 & 3) << 1));
        int i10 = (i8 & i9) + (i9 | i8);
        a = i10 % 128;
        int i11 = i10 % 2;
        return i6;
    }

    public void setItems(List<Item> list) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 13;
        int i4 = -(-((i2 ^ 13) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        this.items = list;
        if (i6 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setMessage(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 115;
        int i4 = -(-((i2 ^ 115) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        int i6 = i5 % 128;
        a = i6;
        int i7 = i5 % 2;
        this.message = str;
        int i8 = i6 & 39;
        int i9 = (i6 ^ 39) | i8;
        int i10 = ((i8 | i9) << 1) - (i8 ^ i9);
        b = i10 % 128;
        if (i10 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setStatus(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 ^ 101) | (i2 & 101)) << 1) - ((i2 & (-102)) | ((~i2) & 101));
        b = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        this.status = str;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 109;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void setStructuralVersion(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 + 103;
        a = i4 % 128;
        int i5 = i4 % 2;
        this.structuralVersion = i;
        int i6 = (((i3 | 8) << 1) - (i3 ^ 8)) - 1;
        a = i6 % 128;
        int i7 = i6 % 2;
    }
}
