package ivas.gov.bisp.enumeration.models;

import java.io.Serializable;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class AgriResource implements Serializable {
    private static int a = 1;
    private static int b;
    private int isSelected;
    private String name;
    private String resourceName;
    private int resourceOwnerPosition;

    public AgriResource(String str) {
        setEmptyValues();
        this.name = str;
    }

    public int getIsSelected() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-108)) | ((~i2) & 107);
        int i4 = -(-((i2 & 107) << 1));
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        int i7 = this.isSelected;
        if (i6 == 0) {
            int i8 = 61 / 0;
        }
        int i9 = (i2 & 13) + (i2 | 13);
        a = i9 % 128;
        int i10 = i9 % 2;
        return i7;
    }

    public String getName() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 67) | (i2 & 67)) << 1;
        int i4 = -((i2 & (-68)) | ((~i2) & 67));
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        String str = this.name;
        int i7 = i2 & 41;
        int i8 = (i2 ^ 41) | i7;
        int i9 = (i7 & i8) + (i8 | i7);
        a = i9 % 128;
        int i10 = i9 % 2;
        return str;
    }

    public String getResourceName() {
        int i = 2 % 2;
        int i2 = b + 5;
        int i3 = i2 % 128;
        a = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.resourceName;
        int i4 = i3 | 1;
        int i5 = ((i4 << 1) - (~(-((~(i3 & 1)) & i4)))) - 1;
        b = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public int getResourceOwnerPosition() {
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 & 108) + (i3 | 108)) - 1;
        int i5 = i4 % 128;
        b = i5;
        if (i4 % 2 != 0) {
            i = this.resourceOwnerPosition;
            int i6 = 79 / 0;
        } else {
            i = this.resourceOwnerPosition;
        }
        int i7 = ((i5 ^ 102) + ((i5 & 102) << 1)) - 1;
        a = i7 % 128;
        int i8 = i7 % 2;
        return i;
    }

    public void setIsSelected(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 & 106) + (i3 | 106)) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        this.isSelected = i;
        if (i5 == 0) {
            throw null;
        }
    }

    public void setName(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 57;
        int i4 = i2 | 57;
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        a = i5 % 128;
        int i6 = i5 % 2;
        this.name = str;
        int i7 = ((i2 ^ 87) | (i2 & 87)) << 1;
        int i8 = -(((~i2) & 87) | (i2 & (-88)));
        int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
        a = i9 % 128;
        int i10 = i9 % 2;
    }

    public void setResourceName(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 | 106) << 1) - (i2 ^ 106)) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        this.resourceName = str;
        int i5 = i2 + 117;
        a = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setResourceOwnerPosition(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (((i3 ^ 71) | (i3 & 71)) << 1) - ((i3 & (-72)) | ((~i3) & 71));
        a = i4 % 128;
        int i5 = i4 % 2;
        this.resourceOwnerPosition = i;
        if (i5 == 0) {
            throw null;
        }
        int i6 = i3 + 119;
        a = i6 % 128;
        int i7 = i6 % 2;
    }

    public AgriResource(String str, int i) {
        this.name = str;
        this.isSelected = i;
    }

    private void setEmptyValues() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 100) << 1) - (i2 ^ 100);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        setName(BuildConfig.FLAVOR);
        setIsSelected(0);
        int i6 = a;
        int i7 = i6 & 1;
        int i8 = ((((i6 ^ 1) | i7) << 1) - (~(-((i6 | 1) & (~i7))))) - 1;
        b = i8 % 128;
        if (i8 % 2 != 0) {
            setResourceName(BuildConfig.FLAVOR);
            setResourceOwnerPosition(1);
        } else {
            setResourceName(BuildConfig.FLAVOR);
            setResourceOwnerPosition(0);
        }
        int i9 = a;
        int i10 = ((i9 & 11) - (~(i9 | 11))) - 1;
        b = i10 % 128;
        int i11 = i10 % 2;
    }

    public AgriResource(String str, int i, int i2, String str2) {
        this.name = str;
        this.isSelected = i;
        this.resourceOwnerPosition = i2;
        this.resourceName = str2;
    }
}
