package ivas.gov.bisp.enumeration.models;

/* JADX INFO: loaded from: classes.dex */
public class Questions {
    private static int a = 0;
    private static int b = 1;
    private String option;
    private int option_id;
    private String question;
    private int sort_order;
    private String updated_time;

    public Questions(String str, String str2, int i, int i2, String str3) {
        this.question = str;
        this.option = str2;
        this.option_id = i;
        this.sort_order = i2;
        this.updated_time = str3;
    }

    public String getOption() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 105) + ((i2 & 105) << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        String str = this.option;
        if (i4 != 0) {
            int i5 = 7 / 0;
        }
        return str;
    }

    public int getOption_id() {
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (-2) - (((i3 & 12) + (i3 | 12)) ^ (-1));
        b = i4 % 128;
        if (i4 % 2 == 0) {
            i = this.option_id;
            int i5 = 67 / 0;
        } else {
            i = this.option_id;
        }
        int i6 = i3 + 13;
        b = i6 % 128;
        int i7 = i6 % 2;
        return i;
    }

    public String getQuestion() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & 15) - (~(i2 | 15))) - 1;
        a = i3 % 128;
        if (i3 % 2 == 0) {
            return this.question;
        }
        int i4 = 69 / 0;
        return this.question;
    }

    public int getSort_order() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-60)) | ((~i2) & 59);
        int i4 = (i2 & 59) << 1;
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        b = i5 % 128;
        int i6 = i5 % 2;
        int i7 = this.sort_order;
        int i8 = i2 ^ 25;
        int i9 = ((i2 & 25) | i8) << 1;
        int i10 = -i8;
        int i11 = ((i9 | i10) << 1) - (i9 ^ i10);
        b = i11 % 128;
        if (i11 % 2 != 0) {
            return i7;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getUpdated_time() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 33) << 1) - (i2 ^ 33);
        b = i3 % 128;
        int i4 = i3 % 2;
        String str = this.updated_time;
        int i5 = (((i2 | 124) << 1) - (i2 ^ 124)) - 1;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public void setOption(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 3;
        int i4 = (i3 - (~(-(-((i2 ^ 3) | i3))))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        this.option = str;
        if (i5 == 0) {
            int i6 = 10 / 0;
        }
    }

    public void setOption_id(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 ^ 37) | (i3 & 37)) << 1;
        int i5 = -((i3 & (-38)) | ((~i3) & 37));
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        a = i6 % 128;
        int i7 = i6 % 2;
        this.option_id = i;
        int i8 = ((i3 ^ 3) | (i3 & 3)) << 1;
        int i9 = -(((~i3) & 3) | (i3 & (-4)));
        int i10 = (i8 ^ i9) + ((i8 & i9) << 1);
        a = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    public void setQuestion(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 ^ 19) | (i2 & 19)) << 1) - (((~i2) & 19) | (i2 & (-20)));
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        this.question = str;
        int i6 = i4 & 47;
        int i7 = -(-((i4 ^ 47) | i6));
        int i8 = (i6 & i7) + (i6 | i7);
        b = i8 % 128;
        int i9 = i8 % 2;
    }

    public void setSort_order(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 ^ 44) + ((i3 & 44) << 1)) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        this.sort_order = i;
        int i6 = ((i3 ^ 75) - (~(-(-((i3 & 75) << 1))))) - 1;
        a = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setUpdated_time(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-42)) | ((~i2) & 41);
        int i4 = (i2 & 41) << 1;
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            this.updated_time = str;
            return;
        }
        this.updated_time = str;
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
