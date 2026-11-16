package ivas.gov.bisp.enumeration.databaseModels;

import androidx.annotation.Keep;
import ivas.gov.bisp.enumeration.o000Ooo.o0OO00O;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class Data {
    private static int a = 1;
    private static int b;

    @o0OO00O("server_apk_version")
    private ServerApkVersion serverApkVersion;

    @o0OO00O("structure")
    private Structure structure;

    @o0OO00O("survey_time_limits")
    private SurveyTimeLimits surveyTimeLimits;

    @o0OO00O("user")
    private User user;

    @o0OO00O("exemptions")
    private List<VillageExemption> villageExemptions = null;

    @o0OO00O("map_listing")
    private List<Villagemaps> mapListing = null;

    public List<Villagemaps> getMapListing() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 111) + (i2 | 111);
        a = i3 % 128;
        int i4 = i3 % 2;
        List<Villagemaps> list = this.mapListing;
        int i5 = (i2 ^ 75) + ((i2 & 75) << 1);
        a = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public ServerApkVersion getServerApkVersion() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 ^ 59) | (i2 & 59)) << 1) - (((~i2) & 59) | (i2 & (-60)));
        int i4 = i3 % 128;
        a = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        ServerApkVersion serverApkVersion = this.serverApkVersion;
        int i5 = ((i4 & 90) + (i4 | 90)) - 1;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return serverApkVersion;
        }
        throw null;
    }

    public Structure getStructure() {
        Structure structure;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 & (-92)) | ((~i2) & 91)) - (~((i2 & 91) << 1))) - 1;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            structure = this.structure;
            int i4 = 35 / 0;
        } else {
            structure = this.structure;
        }
        int i5 = (i2 | 87) << 1;
        int i6 = -(((~i2) & 87) | (i2 & (-88)));
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        b = i7 % 128;
        if (i7 % 2 == 0) {
            return structure;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public SurveyTimeLimits getSurveyTimeLimits() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 25) | (i2 & 25)) << 1;
        int i4 = -((i2 & (-26)) | ((~i2) & 25));
        int i5 = (i3 & i4) + (i3 | i4);
        a = i5 % 128;
        if (i5 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SurveyTimeLimits surveyTimeLimits = this.surveyTimeLimits;
        int i6 = i2 & 51;
        int i7 = (i2 | 51) & (~i6);
        int i8 = -(-(i6 << 1));
        int i9 = (i7 & i8) + (i7 | i8);
        a = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 65 / 0;
        }
        return surveyTimeLimits;
    }

    public User getUser() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 55) + (i2 | 55);
        b = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        User user = this.user;
        int i4 = (i2 ^ 3) + ((i2 & 3) << 1);
        b = i4 % 128;
        if (i4 % 2 == 0) {
            return user;
        }
        throw null;
    }

    public List<VillageExemption> getVillageExemptions() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 10) + ((i2 & 10) << 1)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        List<VillageExemption> list = this.villageExemptions;
        int i5 = (i2 ^ 15) + ((i2 & 15) << 1);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 58 / 0;
        }
        return list;
    }

    public void setMapListing(List<Villagemaps> list) {
        int i = 2 % 2;
        int i2 = (-2) - ((b + 124) ^ (-1));
        int i3 = i2 % 128;
        a = i3;
        int i4 = i2 % 2;
        this.mapListing = list;
        int i5 = (((i3 & (-32)) | ((~i3) & 31)) - (~((i3 & 31) << 1))) - 1;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 88 / 0;
        }
    }

    public void setServerApkVersion(ServerApkVersion serverApkVersion) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 5;
        int i4 = -(-((i2 & 5) << 1));
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        a = i5 % 128;
        if (i5 % 2 == 0) {
            this.serverApkVersion = serverApkVersion;
            int i6 = 83 / 0;
        } else {
            this.serverApkVersion = serverApkVersion;
        }
        int i7 = i2 & 67;
        int i8 = (i7 - (~((i2 ^ 67) | i7))) - 1;
        a = i8 % 128;
        int i9 = i8 % 2;
    }

    public void setStructure(Structure structure) {
        int i = 2 % 2;
        int i2 = (-2) - ((b + 80) ^ (-1));
        a = i2 % 128;
        if (i2 % 2 != 0) {
            this.structure = structure;
            return;
        }
        this.structure = structure;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setSurveyTimeLimits(SurveyTimeLimits surveyTimeLimits) {
        int i = 2 % 2;
        int i2 = a + 51;
        b = i2 % 128;
        int i3 = i2 % 2;
        this.surveyTimeLimits = surveyTimeLimits;
        if (i3 != 0) {
            throw null;
        }
    }

    public void setUser(User user) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 61) + (i2 | 61);
        a = i3 % 128;
        int i4 = i3 % 2;
        this.user = user;
        if (i4 == 0) {
            throw null;
        }
    }

    public void setVillageExemptions(List<VillageExemption> list) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 39) + (i2 | 39);
        b = i3 % 128;
        int i4 = i3 % 2;
        this.villageExemptions = list;
        int i5 = ((i2 & (-22)) | ((~i2) & 21)) + ((i2 & 21) << 1);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 23 / 0;
        }
    }
}
