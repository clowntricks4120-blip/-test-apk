package ivas.gov.bisp.enumeration.databaseModels;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class ItemDistrict extends Item {
    public int distcode;
    public String district;
    public int divcode;
    public int id;
    public int provcode;

    public ItemDistrict(int i, int i2, int i3, int i4, String str) {
        this.id = i;
        this.distcode = i2;
        this.divcode = i3;
        this.provcode = i4;
        this.district = str;
    }
}
