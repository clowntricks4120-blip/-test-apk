package ivas.gov.bisp.enumeration.databaseModels;

import androidx.annotation.Keep;
import ivas.gov.bisp.enumeration.o000Ooo.o0OO00O;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class BoundaryResponse {
    private static int a = 0;
    private static int b = 1;

    @o0OO00O("boundary")
    private List<Boundary> boundary;

    @o0OO00O("enumeration_structure")
    private List<EnumerationStructure> enumerationStructure = null;

    @o0OO00O("message")
    private String message;

    @o0OO00O("status")
    private String status;

    public List<Boundary> getBoundary() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 3;
        int i4 = (~i3) & (i2 | 3);
        int i5 = i3 << 1;
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        List<Boundary> list = this.boundary;
        int i8 = i2 & 97;
        int i9 = (i2 | 97) & (~i8);
        int i10 = -(-(i8 << 1));
        int i11 = (i9 ^ i10) + ((i9 & i10) << 1);
        b = i11 % 128;
        int i12 = i11 % 2;
        return list;
    }

    public List<EnumerationStructure> getEnumerationStructure() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 91;
        int i4 = (i2 | 91) & (~i3);
        int i5 = i3 << 1;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        a = i6 % 128;
        int i7 = i6 % 2;
        List<EnumerationStructure> list = this.enumerationStructure;
        if (i7 != 0) {
            int i8 = 51 / 0;
        }
        return list;
    }

    public String getMessage() {
        int i = 2 % 2;
        int i2 = a + 123;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        String str = this.message;
        int i5 = ((i3 ^ 58) + ((i3 & 58) << 1)) - 1;
        a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public String getStatus() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 | 29) << 1) - (~(-(i2 ^ 29)))) - 1;
        int i4 = i3 % 128;
        a = i4;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.status;
        int i5 = i4 & 89;
        int i6 = (((i4 | 89) & (~i5)) - (~(i5 << 1))) - 1;
        b = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public void setBoundary(List<Boundary> list) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (-2) - (((i2 ^ 34) + ((i2 & 34) << 1)) ^ (-1));
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        this.boundary = list;
        if (i5 != 0) {
            int i6 = 30 / 0;
        }
        int i7 = i4 & 125;
        int i8 = (i4 ^ 125) | i7;
        int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
        b = i9 % 128;
        if (i9 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setEnumerationStructure(List<EnumerationStructure> list) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 41;
        int i4 = -(-((i2 ^ 41) | i3));
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        b = i5 % 128;
        int i6 = i5 % 2;
        this.enumerationStructure = list;
        int i7 = i2 + 37;
        b = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    public void setMessage(String str) {
        int i = 2 % 2;
        int i2 = b + 113;
        int i3 = i2 % 128;
        a = i3;
        if (i2 % 2 != 0) {
            this.message = str;
            throw null;
        }
        this.message = str;
        int i4 = i3 & 33;
        int i5 = i3 | 33;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        b = i6 % 128;
        int i7 = i6 % 2;
    }

    public void setStatus(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 117;
        int i4 = (((i2 ^ 117) | i3) << 1) - ((i2 | 117) & (~i3));
        int i5 = i4 % 128;
        b = i5;
        int i6 = i4 % 2;
        this.status = str;
        int i7 = i5 ^ 75;
        int i8 = ((i5 & 75) | i7) << 1;
        int i9 = -i7;
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        a = i10 % 128;
        int i11 = i10 % 2;
    }
}
