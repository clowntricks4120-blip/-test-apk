package ivas.gov.bisp.enumeration.databaseModels;

import androidx.annotation.Keep;
import com.orm.SugarRecord;
import ivas.gov.bisp.enumeration.o000Ooo.o0OO00O;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class Villagemaps extends SugarRecord {
    private static int a = 0;
    private static int b = 1;

    @o0OO00O("file_name")
    private String fileName;

    @o0OO00O("map_link")
    private String mapLink;

    @o0OO00O("village_id")
    private long villageId;

    public String getFileName() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 34) << 1) - (i2 ^ 34);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        String str = this.fileName;
        int i6 = ((i2 & (-46)) | ((~i2) & 45)) + ((i2 & 45) << 1);
        a = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getMapLink() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 ^ 63) | (i2 & 63)) << 1) - (((~i2) & 63) | (i2 & (-64)));
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        String str = this.mapLink;
        int i6 = i4 & 21;
        int i7 = ((i4 ^ 21) | i6) << 1;
        int i8 = -((i4 | 21) & (~i6));
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        b = i9 % 128;
        int i10 = i9 % 2;
        return str;
    }

    public long getVillageId() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 1;
        int i4 = ((i2 ^ 1) | i3) << 1;
        int i5 = -((~i3) & (i2 | 1));
        int i6 = (i4 & i5) + (i4 | i5);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
        long j = this.villageId;
        int i7 = i2 & 79;
        int i8 = ((i2 | 79) & (~i7)) + (i7 << 1);
        a = i8 % 128;
        int i9 = i8 % 2;
        return j;
    }

    public void setFileName(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (-2) - ((((i2 | 108) << 1) - (i2 ^ 108)) ^ (-1));
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        this.fileName = str;
        int i6 = i4 & 95;
        int i7 = i4 | 95;
        int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
        b = i8 % 128;
        int i9 = i8 % 2;
    }

    public void setMapLink(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 39;
        a = i3 % 128;
        int i4 = i3 % 2;
        this.mapLink = str;
        int i5 = (i2 ^ 81) + ((i2 & 81) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setVillageId(long j) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-56)) | ((~i2) & 55);
        int i4 = (i2 & 55) << 1;
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        this.villageId = j;
        int i7 = (i2 | 17) << 1;
        int i8 = -((i2 & (-18)) | ((~i2) & 17));
        int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
        a = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 72 / 0;
        }
    }
}
