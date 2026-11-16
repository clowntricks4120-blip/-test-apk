package ivas.gov.bisp.enumeration.models;

import ivas.gov.bisp.enumeration.o000Ooo.o0OO00O;

/* JADX INFO: loaded from: classes.dex */
public class LocalityData {
    private static int a = 1;
    private static int b;

    @o0OO00O("is_force_update")
    private int isForceUpdate;

    @o0OO00O("locality")
    private NewLocationForm locality;

    @o0OO00O("server_app_version")
    private int serverAppVersion;

    @o0OO00O("supervisor_id")
    private int supervisorId;

    @o0OO00O("supervisor_version")
    private int supervisorVersion;

    public int getIsForceUpdate() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 23;
        int i4 = ((~i3) & (i2 | 23)) + (i3 << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.isForceUpdate;
        if (i5 == 0) {
            int i7 = 54 / 0;
        }
        int i8 = i2 & 3;
        int i9 = -(-((i2 ^ 3) | i8));
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        a = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 39 / 0;
        }
        return i6;
    }

    public NewLocationForm getLocality() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 47) + ((i2 & 47) << 1);
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        NewLocationForm newLocationForm = this.locality;
        int i6 = (i4 ^ 85) + ((i4 & 85) << 1);
        b = i6 % 128;
        if (i6 % 2 == 0) {
            return newLocationForm;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int getServerAppVersion() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 1) + (i2 | 1);
        b = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.serverAppVersion;
        int i5 = i2 & 97;
        int i6 = -(-((i2 ^ 97) | i5));
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        b = i7 % 128;
        int i8 = i7 % 2;
        return i4;
    }

    public int getSupervisorId() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 15;
        int i4 = -(-(i2 | 15));
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        int i7 = this.supervisorId;
        int i8 = i2 & 25;
        int i9 = (i2 ^ 25) | i8;
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        a = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 60 / 0;
        }
        return i7;
    }

    public int getSupervisorVersion() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 97;
        int i4 = (~i3) & (i2 | 97);
        int i5 = i3 << 1;
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        int i8 = this.supervisorVersion;
        if (i7 == 0) {
            int i9 = 56 / 0;
        }
        int i10 = ((i2 ^ 39) | (i2 & 39)) << 1;
        int i11 = -(((~i2) & 39) | (i2 & (-40)));
        int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
        a = i12 % 128;
        int i13 = i12 % 2;
        return i8;
    }

    public void setIsForceUpdate(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 & 17) + (i3 | 17);
        int i5 = i4 % 128;
        b = i5;
        int i6 = i4 % 2;
        this.isForceUpdate = i;
        int i7 = i5 | 43;
        int i8 = (i7 << 1) - (i7 & (~(i5 & 43)));
        a = i8 % 128;
        int i9 = i8 % 2;
    }

    public void setLocality(NewLocationForm newLocationForm) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-52)) | ((~i2) & 51);
        int i4 = (i2 & 51) << 1;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        this.locality = newLocationForm;
        if (i6 == 0) {
            throw null;
        }
    }

    public void setServerAppVersion(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 121;
        int i5 = (i3 | 121) & (~i4);
        int i6 = i4 << 1;
        int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
        a = i7 % 128;
        int i8 = i7 % 2;
        this.serverAppVersion = i;
        if (i8 == 0) {
            int i9 = 57 / 0;
        }
    }

    public void setSupervisorId(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (((i3 | 38) << 1) - (i3 ^ 38)) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        this.supervisorId = i;
        if (i5 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setSupervisorVersion(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 & 97) + (i3 | 97);
        int i5 = i4 % 128;
        b = i5;
        int i6 = i4 % 2;
        this.supervisorVersion = i;
        int i7 = ((i5 & 58) + (i5 | 58)) - 1;
        a = i7 % 128;
        int i8 = i7 % 2;
    }
}
