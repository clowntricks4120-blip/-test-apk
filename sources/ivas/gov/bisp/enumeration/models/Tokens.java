package ivas.gov.bisp.enumeration.models;

import ivas.gov.bisp.enumeration.o000Ooo.o0OO00O;

/* JADX INFO: loaded from: classes.dex */
public class Tokens {
    private static int a = 1;
    private static int b;

    @o0OO00O("cnic")
    private String cnic;

    @o0OO00O("id")
    private int id;
    private boolean isSkip;

    @o0OO00O("message")
    private String message;

    @o0OO00O("name")
    private String name;

    @o0OO00O("servingdate")
    private String servingDate;

    @o0OO00O("status")
    private int status;

    @o0OO00O("tehsilcode")
    private int tehsilCode;

    @o0OO00O("tokengenerateddata")
    private String tokenGeneratedData;

    @o0OO00O("tokennumber")
    private String tokenNumber;

    @o0OO00O("tokensequence")
    private int tokenSequence;

    @o0OO00O("tokentype")
    private String tokenType;

    @o0OO00O("uniquehhid")
    private String uniqueHhId;

    public String getCnic() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 85;
        int i4 = -(-((i2 ^ 85) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        if (i5 % 2 != 0) {
            return this.cnic;
        }
        throw null;
    }

    public int getId() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 7;
        int i4 = i3 + ((i2 ^ 7) | i3);
        int i5 = i4 % 128;
        b = i5;
        int i6 = i4 % 2;
        int i7 = this.id;
        int i8 = i5 + 43;
        a = i8 % 128;
        int i9 = i8 % 2;
        return i7;
    }

    public String getMessage() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 87;
        int i4 = (((i2 | 87) & (~i3)) - (~(-(-(i3 << 1))))) - 1;
        int i5 = i4 % 128;
        b = i5;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.message;
        int i6 = (((i5 | 10) << 1) - (i5 ^ 10)) - 1;
        a = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public String getName() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 15;
        int i4 = -(-((i2 ^ 15) | i3));
        int i5 = (i3 & i4) + (i3 | i4);
        b = i5 % 128;
        int i6 = i5 % 2;
        String str = this.name;
        if (i6 != 0) {
            int i7 = 44 / 0;
        }
        int i8 = i2 + 109;
        b = i8 % 128;
        int i9 = i8 % 2;
        return str;
    }

    public String getServingDate() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 & (-90)) | ((~i2) & 89)) - (~(-(-((i2 & 89) << 1))))) - 1;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            return this.servingDate;
        }
        throw null;
    }

    public int getStatus() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 65;
        int i4 = (i2 ^ 65) | i3;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        int i6 = i5 % 128;
        a = i6;
        int i7 = i5 % 2;
        int i8 = this.status;
        int i9 = (i6 & 67) + (i6 | 67);
        b = i9 % 128;
        int i10 = i9 % 2;
        return i8;
    }

    public int getTehsilCode() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & (-8)) | ((~i2) & 7)) + ((i2 & 7) << 1);
        a = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.tehsilCode;
        int i5 = (((i2 | 70) << 1) - (i2 ^ 70)) - 1;
        a = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 44 / 0;
        }
        return i4;
    }

    public String getTokenGeneratedData() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 | 27;
        int i4 = ((i3 << 1) - (~(-((~(i2 & 27)) & i3)))) - 1;
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        String str = this.tokenGeneratedData;
        int i7 = i5 & 119;
        int i8 = i7 + ((i5 ^ 119) | i7);
        b = i8 % 128;
        int i9 = i8 % 2;
        return str;
    }

    public String getTokenNumber() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 | 125;
        int i4 = i3 << 1;
        int i5 = -((~(i2 & 125)) & i3);
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            return this.tokenNumber;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int getTokenSequence() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 111) | (i2 & 111)) << 1;
        int i4 = -(((~i2) & 111) | (i2 & (-112)));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        int i7 = this.tokenSequence;
        if (i6 != 0) {
            int i8 = 14 / 0;
        }
        return i7;
    }

    public String getTokenType() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 89;
        int i4 = -(-(i2 | 89));
        int i5 = (i3 & i4) + (i3 | i4);
        a = i5 % 128;
        int i6 = i5 % 2;
        String str = this.tokenType;
        int i7 = i2 & 29;
        int i8 = (i2 ^ 29) | i7;
        int i9 = (i7 & i8) + (i8 | i7);
        a = i9 % 128;
        if (i9 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public String getUniqueHhId() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 41;
        int i4 = i2 | 41;
        int i5 = (i3 & i4) + (i4 | i3);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        String str = this.uniqueHhId;
        int i8 = (i6 & 121) + (i6 | 121);
        a = i8 % 128;
        if (i8 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public boolean isSkip() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 | 65;
        int i4 = i3 << 1;
        int i5 = -((~(i2 & 65)) & i3);
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        int i7 = i6 % 128;
        b = i7;
        int i8 = i6 % 2;
        boolean z = this.isSkip;
        int i9 = (-2) - ((i7 + 24) ^ (-1));
        a = i9 % 128;
        if (i9 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setCnic(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 81) << 1) - (i2 ^ 81);
        a = i3 % 128;
        int i4 = i3 % 2;
        this.cnic = str;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 & 43;
        int i6 = ((i2 ^ 43) | i5) << 1;
        int i7 = -((i2 | 43) & (~i5));
        int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
        a = i8 % 128;
        int i9 = i8 % 2;
    }

    public void setId(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 | 63) << 1;
        int i5 = -((i3 & (-64)) | ((~i3) & 63));
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        this.id = i;
        int i8 = i3 & 125;
        int i9 = ((i3 ^ 125) | i8) << 1;
        int i10 = -((i3 | 125) & (~i8));
        int i11 = (i9 ^ i10) + ((i9 & i10) << 1);
        a = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    public void setMessage(String str) {
        int i = 2 % 2;
        int i2 = a + 91;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        this.message = str;
        int i5 = (i3 & 63) + (i3 | 63);
        a = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setName(String str) {
        int i = 2 % 2;
        int i2 = b + 37;
        int i3 = i2 % 128;
        a = i3;
        int i4 = i2 % 2;
        this.name = str;
        int i5 = i3 & 115;
        int i6 = (~i5) & (i3 | 115);
        int i7 = -(-(i5 << 1));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        b = i8 % 128;
        int i9 = i8 % 2;
    }

    public void setServingDate(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 87;
        int i4 = (i2 ^ 87) | i3;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        if (i5 % 2 != 0) {
            this.servingDate = str;
            return;
        }
        this.servingDate = str;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setSkip(boolean z) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 61) + (i2 | 61);
        b = i3 % 128;
        if (i3 % 2 == 0) {
            this.isSkip = z;
        } else {
            this.isSkip = z;
            int i4 = 61 / 0;
        }
    }

    public void setStatus(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 ^ 113;
        int i5 = ((i3 & 113) | i4) << 1;
        int i6 = -i4;
        int i7 = (i5 & i6) + (i5 | i6);
        int i8 = i7 % 128;
        b = i8;
        if (i7 % 2 != 0) {
            this.status = i;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.status = i;
        int i9 = ((i8 & (-64)) | ((~i8) & 63)) + ((i8 & 63) << 1);
        a = i9 % 128;
        int i10 = i9 % 2;
    }

    public void setTehsilCode(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 | 19) << 1) - (((~i3) & 19) | (i3 & (-20)));
        int i5 = i4 % 128;
        b = i5;
        int i6 = i4 % 2;
        this.tehsilCode = i;
        if (i6 != 0) {
            throw null;
        }
        int i7 = i5 & 95;
        int i8 = (i5 ^ 95) | i7;
        int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
        a = i9 % 128;
        if (i9 % 2 == 0) {
            throw null;
        }
    }

    public void setTokenGeneratedData(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 | 43) << 1;
        int i4 = -(((~i2) & 43) | (i2 & (-44)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        this.tokenGeneratedData = str;
        if (i6 == 0) {
            throw null;
        }
    }

    public void setTokenNumber(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 116) + ((i2 & 116) << 1);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        b = i4 % 128;
        if (i4 % 2 == 0) {
            this.tokenNumber = str;
        } else {
            this.tokenNumber = str;
            throw null;
        }
    }

    public void setTokenSequence(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 + 111;
        b = i4 % 128;
        int i5 = i4 % 2;
        this.tokenSequence = i;
        int i6 = i3 + 97;
        b = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 77 / 0;
        }
    }

    public void setTokenType(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 123;
        int i4 = -(-((i2 & 123) << 1));
        int i5 = (i3 & i4) + (i4 | i3);
        int i6 = i5 % 128;
        a = i6;
        int i7 = i5 % 2;
        Object obj = null;
        this.tokenType = str;
        if (i7 == 0) {
            obj.hashCode();
            throw null;
        }
        int i8 = i6 & 83;
        int i9 = (i8 - (~((i6 ^ 83) | i8))) - 1;
        b = i9 % 128;
        if (i9 % 2 != 0) {
            throw null;
        }
    }

    public void setUniqueHhId(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 77;
        int i4 = i2 | 77;
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        this.uniqueHhId = str;
        if (i6 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
