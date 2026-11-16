package ivas.gov.bisp.enumeration.databaseModels;

import androidx.annotation.Keep;
import com.orm.SugarRecord;
import ivas.gov.bisp.enumeration.o000Ooo.o0OO00O;
import ivas.gov.bisp.enumeration.p026az.t;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class PostOffice extends SugarRecord implements t {
    private static int a = 1;
    private static int b;

    @o0OO00O("post_office_id")
    private int postOfficeId;

    @o0OO00O("post_office_name")
    private String postOfficeName;

    @o0OO00O("tehsil_id")
    private int tehsilId;

    public PostOffice() {
        setPostOfficeId(0);
        setTehsilId(0);
        setPostOfficeName(BuildConfig.FLAVOR);
    }

    @Override // ivas.gov.bisp.enumeration.p026az.t
    public String getDropDownViewLabel() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 107;
        int i4 = (i2 ^ 107) | i3;
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        String postOfficeName = getPostOfficeName();
        int i7 = b;
        int i8 = i7 ^ 31;
        int i9 = -(-((i7 & 31) << 1));
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        a = i10 % 128;
        if (i10 % 2 != 0) {
            return postOfficeName;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int getPostOfficeId() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 27;
        int i4 = ((((i2 ^ 27) | i3) << 1) - (~(-((~i3) & (i2 | 27))))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.postOfficeId;
        int i7 = (i2 ^ 59) + ((i2 & 59) << 1);
        b = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public String getPostOfficeName() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 33;
        int i4 = (((i2 ^ 33) | i3) << 1) - ((i2 | 33) & (~i3));
        int i5 = i4 % 128;
        b = i5;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.postOfficeName;
        int i6 = i5 & 119;
        int i7 = (i5 ^ 119) | i6;
        int i8 = (i6 & i7) + (i7 | i6);
        a = i8 % 128;
        int i9 = i8 % 2;
        return str;
    }

    public int getTehsilId() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 1) + ((i2 & 1) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.tehsilId;
        if (i4 != 0) {
            int i6 = 58 / 0;
        }
        return i5;
    }

    public String getViewLabel() {
        int i = 2 % 2;
        int i2 = a + 12;
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        String postOfficeName = getPostOfficeName();
        int i5 = b;
        int i6 = ((i5 | 19) << 1) - (i5 ^ 19);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            return postOfficeName;
        }
        throw null;
    }

    public boolean isChecked() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 93) << 1) - (i2 ^ 93);
        b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 15;
        b = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public void setPostOfficeId(int i) {
        int i2 = 2 % 2;
        int i3 = a + 45;
        int i4 = i3 % 128;
        b = i4;
        if (i3 % 2 != 0) {
            this.postOfficeId = i;
            throw null;
        }
        this.postOfficeId = i;
        int i5 = (i4 ^ 117) + ((i4 & 117) << 1);
        a = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 71 / 0;
        }
    }

    public void setPostOfficeName(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 55;
        int i4 = ((i2 & 55) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        int i7 = i6 % 128;
        b = i7;
        int i8 = i6 % 2;
        this.postOfficeName = str;
        int i9 = (i7 ^ 4) + ((i7 & 4) << 1);
        int i10 = (i9 ^ (-1)) + (i9 << 1);
        a = i10 % 128;
        if (i10 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setTehsilId(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (((i3 | 20) << 1) - (i3 ^ 20)) - 1;
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        Object obj = null;
        this.tehsilId = i;
        if (i6 == 0) {
            throw null;
        }
        int i7 = i5 & 101;
        int i8 = (((i5 | 101) & (~i7)) - (~(i7 << 1))) - 1;
        b = i8 % 128;
        if (i8 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public PostOffice(String str) {
        this.postOfficeName = str;
    }

    public PostOffice(int i, int i2, String str) {
        this.postOfficeId = i2;
        this.tehsilId = i;
        this.postOfficeName = str;
    }
}
