package ivas.gov.bisp.enumeration.databaseModels;

import androidx.annotation.Keep;
import ivas.gov.bisp.enumeration.o000Ooo.o0OO00O;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class Supervisor {
    private static int a = 0;
    private static int b = 1;

    @o0OO00O("structural_version")
    private int structuralVersion;

    @o0OO00O("provinces")
    private List<Province> provinces = null;

    @o0OO00O("districts")
    private List<District> districts = null;

    @o0OO00O("tehsils")
    private List<Tehsil> tehsils = null;

    @o0OO00O("union_councils")
    private List<UnionCouncil> unionCouncils = null;

    @o0OO00O("villages")
    private List<Village> villages = null;

    @o0OO00O("post_offices")
    private List<PostOffice> postOffices = null;

    @o0OO00O("percentages")
    private List<Percentage> percentages = null;

    public List<District> getDistricts() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 63;
        int i4 = ((i2 & 63) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        a = i6 % 128;
        if (i6 % 2 == 0) {
            return this.districts;
        }
        throw null;
    }

    public List<Percentage> getPercentages() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 63) + ((i2 & 63) << 1);
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        List<Percentage> list = this.percentages;
        int i6 = i4 & 65;
        int i7 = (((i4 | 65) & (~i6)) - (~(-(-(i6 << 1))))) - 1;
        b = i7 % 128;
        int i8 = i7 % 2;
        return list;
    }

    public List<PostOffice> getPostOffices() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 115;
        int i4 = (i3 - (~(-(-((i2 ^ 115) | i3))))) - 1;
        a = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        List<PostOffice> list = this.postOffices;
        int i5 = ((i2 & (-108)) | ((~i2) & 107)) + ((i2 & 107) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public List<Province> getProvinces() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 69;
        int i4 = (i2 | 69) & (~i3);
        int i5 = i3 << 1;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            return this.provinces;
        }
        throw null;
    }

    public int getStructuralVersion() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 97;
        int i4 = (i2 & 97) << 1;
        int i5 = (i3 & i4) + (i4 | i3);
        int i6 = i5 % 128;
        b = i6;
        Object obj = null;
        if (i5 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i7 = this.structuralVersion;
        int i8 = (((i6 | 98) << 1) - (i6 ^ 98)) - 1;
        a = i8 % 128;
        if (i8 % 2 == 0) {
            return i7;
        }
        throw null;
    }

    public List<Tehsil> getTehsils() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 3;
        int i4 = -(-((i2 ^ 3) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        List<Tehsil> list = this.tehsils;
        if (i7 == 0) {
            int i8 = 51 / 0;
        }
        int i9 = (-2) - (((i6 ^ 44) + ((i6 & 44) << 1)) ^ (-1));
        a = i9 % 128;
        if (i9 % 2 == 0) {
            return list;
        }
        throw null;
    }

    public List<UnionCouncil> getUnionCouncils() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 83;
        int i4 = (i2 | 83) & (~i3);
        int i5 = i3 << 1;
        int i6 = (i4 & i5) + (i4 | i5);
        int i7 = i6 % 128;
        a = i7;
        int i8 = i6 % 2;
        List<UnionCouncil> list = this.unionCouncils;
        int i9 = (((i7 | 34) << 1) - (i7 ^ 34)) - 1;
        b = i9 % 128;
        int i10 = i9 % 2;
        return list;
    }

    public List<Village> getVillages() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-72)) | ((~i2) & 71);
        int i4 = (i2 & 71) << 1;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        if (i5 % 2 == 0) {
            return this.villages;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setDistricts(List<District> list) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 11) << 1) - (i2 ^ 11);
        b = i3 % 128;
        int i4 = i3 % 2;
        this.districts = list;
        if (i4 == 0) {
            int i5 = 1 / 0;
        }
    }

    public void setPercentages(List<Percentage> list) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 103;
        int i4 = i3 + ((i2 ^ 103) | i3);
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        this.percentages = list;
        int i7 = i5 & 51;
        int i8 = (((i5 ^ 51) | i7) << 1) - ((i5 | 51) & (~i7));
        b = i8 % 128;
        int i9 = i8 % 2;
    }

    public void setPostOffices(List<PostOffice> list) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 | 51) << 1;
        int i4 = -((i2 & (-52)) | ((~i2) & 51));
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        this.postOffices = list;
        int i7 = i2 & 15;
        int i8 = (i2 | 15) & (~i7);
        int i9 = i7 << 1;
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        a = i10 % 128;
        int i11 = i10 % 2;
    }

    public void setProvinces(List<Province> list) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((((i2 ^ 83) | (i2 & 83)) << 1) - (~(-(((~i2) & 83) | (i2 & (-84)))))) - 1;
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        this.provinces = list;
        int i6 = i4 & 37;
        int i7 = (i4 | 37) & (~i6);
        int i8 = -(-(i6 << 1));
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        a = i9 % 128;
        if (i9 % 2 != 0) {
            throw null;
        }
    }

    public void setStructuralVersion(int i) {
        int i2 = 2 % 2;
        int i3 = a + 13;
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        this.structuralVersion = i;
        if (i5 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i4 & 49;
        int i7 = (((i4 ^ 49) | i6) << 1) - ((~i6) & (i4 | 49));
        a = i7 % 128;
        int i8 = i7 % 2;
    }

    public void setTehsils(List<Tehsil> list) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 87) << 1) - (i2 ^ 87);
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        this.tehsils = list;
        int i6 = (i4 | 109) << 1;
        int i7 = -(((~i4) & 109) | (i4 & (-110)));
        int i8 = (i6 & i7) + (i6 | i7);
        b = i8 % 128;
        if (i8 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setUnionCouncils(List<UnionCouncil> list) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 117;
        int i4 = i3 + ((i2 ^ 117) | i3);
        int i5 = i4 % 128;
        b = i5;
        int i6 = i4 % 2;
        this.unionCouncils = list;
        int i7 = i5 | 43;
        int i8 = i7 << 1;
        int i9 = -(i7 & (~(i5 & 43)));
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        a = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 31 / 0;
        }
    }

    public void setVillages(List<Village> list) {
        int i = 2 % 2;
        int i2 = a + 99;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        this.villages = list;
        int i5 = i3 + 19;
        a = i5 % 128;
        int i6 = i5 % 2;
    }
}
