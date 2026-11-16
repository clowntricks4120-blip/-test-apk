package ivas.gov.bisp.enumeration.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.gson.reflect.TypeToken;
import ivas.gov.bisp.enumeration.de.c;
import ivas.gov.bisp.enumeration.de.j;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.CitizenData;
import ivas.gov.bisp.enumeration.p035bh.C;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class SessionManager {
    private static int a = 0;
    private static int b = 1;
    public SharedPreferences c;
    public SharedPreferences.Editor d;

    public SessionManager(Context context) {
        SharedPreferences sharedPreferencesH = h(context);
        this.c = sharedPreferencesH;
        this.d = sharedPreferencesH.edit();
    }

    public void A(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 31) << 1) - (i2 ^ 31);
        b = i3 % 128;
        if (i3 % 2 == 0) {
            this.d.putString("k_beneficiary", str);
            throw null;
        }
        this.d.putString("k_beneficiary", str);
        this.d.apply();
        int i4 = b;
        int i5 = i4 & 73;
        int i6 = ((i4 ^ 73) | i5) << 1;
        int i7 = -((i4 | 73) & (~i5));
        int i8 = (i6 & i7) + (i7 | i6);
        a = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
    }

    public void B(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & 54) + (i2 | 54)) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        this.d.putString("addressLibraryCallTime", str);
        int i5 = b;
        int i6 = i5 & 119;
        int i7 = (i5 ^ 119) | i6;
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        a = i8 % 128;
        if (i8 % 2 == 0) {
            this.d.apply();
            return;
        }
        this.d.apply();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void D(String str) {
        int i = 2 % 2;
        int i2 = (-2) - ((b + 118) ^ (-1));
        a = i2 % 128;
        int i3 = i2 % 2;
        this.d.putString("k_form", str);
        int i4 = b;
        int i5 = (i4 & (-104)) | ((~i4) & 103);
        int i6 = -(-((i4 & 103) << 1));
        int i7 = (i5 & i6) + (i6 | i5);
        a = i7 % 128;
        if (i7 % 2 != 0) {
            this.d.apply();
            int i8 = 51 / 0;
        } else {
            this.d.apply();
        }
        int i9 = a;
        int i10 = ((i9 ^ 110) + ((i9 & 110) << 1)) - 1;
        b = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 57 / 0;
        }
    }

    public void I(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-70)) | ((~i2) & 69);
        int i4 = -(-((i2 & 69) << 1));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        this.d.putString("k_nadra_data", str);
        int i7 = b + 103;
        a = i7 % 128;
        int i8 = i7 % 2;
        this.d.apply();
        int i9 = a;
        int i10 = i9 & 101;
        int i11 = (i9 ^ 101) | i10;
        int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
        b = i12 % 128;
        if (i12 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void J(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 26) << 1) - (i2 ^ 26);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        this.d.putString("k_hhid", str);
        SharedPreferences.Editor editor = this.d;
        int i6 = b;
        int i7 = ((i6 | 98) << 1) - (i6 ^ 98);
        int i8 = (i7 ^ (-1)) + (i7 << 1);
        a = i8 % 128;
        int i9 = i8 % 2;
        editor.apply();
        int i10 = b;
        int i11 = ((i10 ^ 112) + ((i10 & 112) << 1)) - 1;
        a = i11 % 128;
        int i12 = i11 % 2;
    }

    public void K(Integer num) {
        int i = 2 % 2;
        int i2 = b + 15;
        a = i2 % 128;
        int i3 = i2 % 2;
        this.d.putInt("user_login_mode", num.intValue());
        int i4 = b;
        int i5 = ((i4 & (-86)) | ((~i4) & 85)) + ((i4 & 85) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        this.d.apply();
        SharedPreferences.Editor editor = this.d;
        int i7 = a;
        int i8 = i7 & 73;
        int i9 = (i8 - (~(-(-((i7 ^ 73) | i8))))) - 1;
        b = i9 % 128;
        if (i9 % 2 != 0) {
            editor.commit();
        } else {
            editor.commit();
            throw null;
        }
    }

    public void N(String str) {
        int i = 2 % 2;
        int i2 = a + 111;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            this.d.putString("k_r_cnic", str);
            int i3 = 3 / 0;
        } else {
            this.d.putString("k_r_cnic", str);
        }
        this.d.apply();
        this.d.commit();
        int i4 = a + 33;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 9 / 0;
        }
    }

    public void R(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 11;
        int i4 = -(-((i2 ^ 11) | i3));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        this.d.putString("k_token_expiry", str);
        int i7 = a;
        int i8 = i7 & 71;
        int i9 = -(-((i7 ^ 71) | i8));
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        b = i10 % 128;
        if (i10 % 2 == 0) {
            this.d.apply();
            throw null;
        }
        this.d.apply();
        SharedPreferences.Editor editor = this.d;
        int i11 = b;
        int i12 = ((i11 & (-50)) | ((~i11) & 49)) + ((i11 & 49) << 1);
        a = i12 % 128;
        int i13 = i12 % 2;
        editor.commit();
        int i14 = a;
        int i15 = (i14 & 1) + (i14 | 1);
        b = i15 % 128;
        int i16 = i15 % 2;
    }

    public void S(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & 106) + (i2 | 106)) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        this.d.putString("k_user_name", str);
        int i5 = b + 71;
        a = i5 % 128;
        int i6 = i5 % 2;
        this.d.apply();
        SharedPreferences.Editor editor = this.d;
        int i7 = b;
        int i8 = i7 & 119;
        int i9 = -(-((i7 ^ 119) | i8));
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        a = i10 % 128;
        if (i10 % 2 != 0) {
            editor.commit();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        editor.commit();
        int i11 = a + 67;
        b = i11 % 128;
        int i12 = i11 % 2;
    }

    public String c() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 79;
        int i4 = -(-((i2 ^ 79) | i3));
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return this.c.getString("k_hhid", BuildConfig.FLAVOR);
        }
        this.c.getString("k_hhid", BuildConfig.FLAVOR);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String d() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 117;
        int i4 = -(-((i2 & 117) << 1));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        String string = this.c.getString("k_beneficiary", BuildConfig.FLAVOR);
        int i7 = a;
        int i8 = (i7 & 123) + (i7 | 123);
        b = i8 % 128;
        int i9 = i8 % 2;
        return string;
    }

    public int e() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 69;
        int i4 = ((i2 ^ 69) | i3) << 1;
        int i5 = -((i2 | 69) & (~i3));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        int i8 = this.c.getInt("centerCode", 0);
        int i9 = a;
        int i10 = (((i9 | 8) << 1) - (i9 ^ 8)) - 1;
        b = i10 % 128;
        int i11 = i10 % 2;
        return i8;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0047  */
    public ArrayList<CitizenData> f() {
        int i = 2 % 2;
        C c = new C();
        String string = this.c.getString("citizenData", BuildConfig.FLAVOR);
        TypeToken<List<CitizenData>> typeToken = new TypeToken<List<CitizenData>>(this) { // from class: ivas.gov.bisp.enumeration.utils.SessionManager.1
        };
        int i2 = a + 85;
        b = i2 % 128;
        int i3 = i2 % 2;
        ArrayList<CitizenData> arrayList = (ArrayList) c.g(string, typeToken.b);
        int i4 = a;
        int i5 = i4 & 37;
        int i6 = (i4 | 37) & (~i5);
        int i7 = i5 << 1;
        int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
        b = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 33 / 0;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                int i10 = b;
                int i11 = i10 & 7;
                int i12 = -(-((i10 ^ 7) | i11));
                int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
                a = i13 % 128;
                int i14 = i13 % 2;
            }
        } else if (arrayList == null) {
            arrayList = new ArrayList<>();
            int i15 = b;
            int i16 = i15 & 7;
            int i17 = -(-((i15 ^ 7) | i16));
            int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
            a = i18 % 128;
            int i19 = i18 % 2;
        }
        int i20 = a;
        int i21 = i20 & 53;
        int i22 = (i20 | 53) & (~i21);
        int i23 = i21 << 1;
        int i24 = (i22 ^ i23) + ((i22 & i23) << 1);
        b = i24 % 128;
        if (i24 % 2 == 0) {
            int i25 = 1 / 0;
        }
        return arrayList;
    }

    public String g() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-112)) | ((~i2) & 111);
        int i4 = (i2 & 111) << 1;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        String string = this.c.getString("dist", BuildConfig.FLAVOR);
        int i7 = b + 33;
        a = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 12 / 0;
        }
        return string;
    }

    public String i() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 | 28) << 1) - (i2 ^ 28)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        String string = this.c.getString("distcode", BuildConfig.FLAVOR);
        int i5 = a + 46;
        int i6 = (i5 ^ (-1)) + (i5 << 1);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String j() {
        String string;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 25;
        int i4 = (i3 - (~((i2 ^ 25) | i3))) - 1;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            string = this.c.getString("k_form", BuildConfig.FLAVOR);
            int i5 = 67 / 0;
        } else {
            string = this.c.getString("k_form", BuildConfig.FLAVOR);
        }
        int i6 = a;
        int i7 = i6 & 37;
        int i8 = (i6 | 37) & (~i7);
        int i9 = -(-(i7 << 1));
        int i10 = (i8 ^ i9) + ((i8 & i9) << 1);
        b = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 62 / 0;
        }
        return string;
    }

    public String k() {
        int i = 2 % 2;
        int i2 = b + 119;
        a = i2 % 128;
        int i3 = i2 % 2;
        String string = this.c.getString("k_fu", BuildConfig.FLAVOR);
        int i4 = b;
        int i5 = i4 & 59;
        int i6 = -(-((i4 ^ 59) | i5));
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        a = i7 % 128;
        int i8 = i7 % 2;
        return string;
    }

    public Integer l() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 87) + ((i2 & 87) << 1);
        a = i3 % 128;
        int i4 = i3 % 2 != 0 ? this.c.getInt("user_login_mode", 3) : this.c.getInt("user_login_mode", 2);
        int i5 = a;
        int i6 = (i5 ^ 11) + ((i5 & 11) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        Integer numValueOf = Integer.valueOf(i4);
        int i8 = b;
        int i9 = (-2) - (((i8 ^ 122) + ((i8 & 122) << 1)) ^ (-1));
        a = i9 % 128;
        int i10 = i9 % 2;
        return numValueOf;
    }

    public String m() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 15;
        int i4 = -(-((i2 & 15) << 1));
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        String string = this.c.getString("k_mu", BuildConfig.FLAVOR);
        int i7 = b;
        int i8 = i7 ^ 23;
        int i9 = (i7 & 23) << 1;
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        a = i10 % 128;
        int i11 = i10 % 2;
        return string;
    }

    public String n() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-26)) | ((~i2) & 25);
        int i4 = -(-((i2 & 25) << 1));
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        if (i5 % 2 != 0) {
            this.c.getString("k_nadra_data", BuildConfig.FLAVOR);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String string = this.c.getString("k_nadra_data", BuildConfig.FLAVOR);
        int i6 = a;
        int i7 = ((i6 & 11) - (~(-(-(i6 | 11))))) - 1;
        b = i7 % 128;
        int i8 = i7 % 2;
        return string;
    }

    public String o() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 19;
        int i4 = (i2 | 19) & (~i3);
        int i5 = i3 << 1;
        int i6 = (i4 & i5) + (i4 | i5);
        a = i6 % 128;
        if (i6 % 2 == 0) {
            return this.c.getString("province", BuildConfig.FLAVOR);
        }
        this.c.getString("province", BuildConfig.FLAVOR);
        throw null;
    }

    public String p() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 55;
        int i4 = (((i2 | 55) & (~i3)) - (~(-(-(i3 << 1))))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        String string = this.c.getString("k_phone", BuildConfig.FLAVOR);
        int i6 = b;
        int i7 = i6 ^ 75;
        int i8 = ((i6 & 75) | i7) << 1;
        int i9 = -i7;
        int i10 = (i8 ^ i9) + ((i8 & i9) << 1);
        a = i10 % 128;
        if (i10 % 2 == 0) {
            return string;
        }
        throw null;
    }

    public String q() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 7;
        int i4 = -(-((i2 ^ 7) | i3));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        SharedPreferences sharedPreferences = this.c;
        if (i6 != 0) {
            return sharedPreferences.getString("provincecode", BuildConfig.FLAVOR);
        }
        sharedPreferences.getString("provincecode", BuildConfig.FLAVOR);
        throw null;
    }

    public String r() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-42)) | ((~i2) & 41);
        int i4 = -(-((i2 & 41) << 1));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        String string = this.c.getString("k_r_cnic", BuildConfig.FLAVOR);
        int i7 = b;
        int i8 = (i7 & 105) + (i7 | 105);
        a = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 65 / 0;
        }
        return string;
    }

    public int s() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 3) + ((i2 & 3) << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        return this.c.getInt("k_status", 0);
    }

    public String t() {
        int i = 2 % 2;
        int i2 = a + 87;
        b = i2 % 128;
        int i3 = i2 % 2;
        String string = this.c.getString("k_resurvey_status", BuildConfig.FLAVOR);
        int i4 = b;
        int i5 = i4 ^ 49;
        int i6 = -(-((i4 & 49) << 1));
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        a = i7 % 128;
        int i8 = i7 % 2;
        return string;
    }

    public String u() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 93;
        int i4 = ((i2 ^ 93) | i3) << 1;
        int i5 = -((i2 | 93) & (~i3));
        int i6 = (i4 & i5) + (i5 | i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        String string = this.c.getString("k_token", BuildConfig.FLAVOR);
        int i8 = a;
        int i9 = i8 & 7;
        int i10 = (i9 - (~(-(-((i8 ^ 7) | i9))))) - 1;
        b = i10 % 128;
        int i11 = i10 % 2;
        return string;
    }

    public int v() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 | 26) << 1) - (i2 ^ 26)) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.c.getInt("fingerprintAllowed", 1);
        int i6 = a;
        int i7 = i6 & 79;
        int i8 = (i6 ^ 79) | i7;
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        b = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 66 / 0;
        }
        return i5;
    }

    public String w() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 | 17) << 1) - (~(-(i2 ^ 17)))) - 1;
        a = i3 % 128;
        if (i3 % 2 != 0) {
            this.c.getString("tehsilcode", BuildConfig.FLAVOR);
            throw null;
        }
        String string = this.c.getString("tehsilcode", BuildConfig.FLAVOR);
        int i4 = a + 87;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 77 / 0;
        }
        return string;
    }

    public String x() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 & (-6)) | ((~i2) & 5)) - (~((i2 & 5) << 1))) - 1;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            return this.c.getString("tehsil", BuildConfig.FLAVOR);
        }
        int i4 = 61 / 0;
        return this.c.getString("tehsil", BuildConfig.FLAVOR);
    }

    public String y() {
        int i = 2 % 2;
        int i2 = a + 95;
        b = i2 % 128;
        int i3 = i2 % 2;
        String string = this.c.getString("k_userid", BuildConfig.FLAVOR);
        int i4 = b;
        int i5 = i4 & 5;
        int i6 = ((i4 ^ 5) | i5) << 1;
        int i7 = -((i4 | 5) & (~i5));
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        a = i8 % 128;
        int i9 = i8 % 2;
        return string;
    }

    public String z() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 75;
        int i4 = -(-((i2 ^ 75) | i3));
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        if (i5 % 2 != 0) {
            this.c.getString("k_user_name", BuildConfig.FLAVOR);
            throw null;
        }
        String string = this.c.getString("k_user_name", BuildConfig.FLAVOR);
        int i6 = a;
        int i7 = ((i6 ^ 20) + ((i6 & 20) << 1)) - 1;
        b = i7 % 128;
        int i8 = i7 % 2;
        return string;
    }

    public void E(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 105;
        int i5 = (((i3 | 105) & (~i4)) - (~(-(-(i4 << 1))))) - 1;
        a = i5 % 128;
        int i6 = i5 % 2;
        this.d.putInt("fingerprintAllowed", i);
        int i7 = a;
        int i8 = (i7 ^ 45) + ((i7 & 45) << 1);
        b = i8 % 128;
        if (i8 % 2 != 0) {
            this.d.apply();
        } else {
            this.d.apply();
            int i9 = 56 / 0;
        }
    }

    public void F(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 39;
        int i4 = ((i2 ^ 39) | i3) << 1;
        int i5 = -((i2 | 39) & (~i3));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        this.d.putString("k_fu", str);
        SharedPreferences.Editor editor = this.d;
        int i8 = a;
        int i9 = (-2) - ((((i8 | 22) << 1) - (i8 ^ 22)) ^ (-1));
        b = i9 % 128;
        if (i9 % 2 == 0) {
            editor.apply();
            throw null;
        }
        editor.apply();
        int i10 = a;
        int i11 = (i10 & (-100)) | ((~i10) & 99);
        int i12 = (i10 & 99) << 1;
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        b = i13 % 128;
        int i14 = i13 % 2;
    }

    public void G(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 83;
        int i4 = ((i2 & 83) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        this.d.putString("k_hh_name", str);
        int i8 = a;
        int i9 = i8 | 67;
        int i10 = ((i9 << 1) - (~(-((~(i8 & 67)) & i9)))) - 1;
        b = i10 % 128;
        if (i10 % 2 != 0) {
            this.d.apply();
            return;
        }
        this.d.apply();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void H(boolean z) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 13;
        int i4 = i3 + ((i2 ^ 13) | i3);
        b = i4 % 128;
        int i5 = i4 % 2;
        this.d.putBoolean("isUserLoggedIn", z);
        SharedPreferences.Editor editor = this.d;
        int i6 = b;
        int i7 = (((i6 | 68) << 1) - (i6 ^ 68)) - 1;
        a = i7 % 128;
        int i8 = i7 % 2;
        editor.apply();
        this.d.commit();
        int i9 = b;
        int i10 = ((((i9 ^ 17) | (i9 & 17)) << 1) - (~(-(((~i9) & 17) | (i9 & (-18)))))) - 1;
        a = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    public void L(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 57;
        int i4 = (((i2 ^ 57) | i3) << 1) - ((i2 | 57) & (~i3));
        b = i4 % 128;
        int i5 = i4 % 2;
        this.d.putString("k_mu", str);
        int i6 = (-2) - ((a + 34) ^ (-1));
        b = i6 % 128;
        if (i6 % 2 == 0) {
            this.d.apply();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.d.apply();
        int i7 = a;
        int i8 = i7 & 13;
        int i9 = ((i7 | 13) & (~i8)) + (i8 << 1);
        b = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 68 / 0;
        }
    }

    public void M(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & (-124)) | ((~i2) & 123)) + ((i2 & 123) << 1);
        a = i3 % 128;
        if (i3 % 2 != 0) {
            this.d.putString("k_phone", str);
            int i4 = 95 / 0;
        } else {
            this.d.putString("k_phone", str);
        }
        int i5 = a;
        int i6 = (i5 | 79) << 1;
        int i7 = -(i5 ^ 79);
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        b = i8 % 128;
        int i9 = i8 % 2;
        this.d.apply();
        int i10 = b;
        int i11 = (((i10 | 95) << 1) - (~(-(((~i10) & 95) | (i10 & (-96)))))) - 1;
        a = i11 % 128;
        int i12 = i11 % 2;
    }

    public void O(int i) {
        int i2 = 2 % 2;
        int i3 = a + 69;
        b = i3 % 128;
        int i4 = i3 % 2;
        this.d.putInt("k_status", i);
        SharedPreferences.Editor editor = this.d;
        int i5 = b;
        int i6 = i5 & 51;
        int i7 = ((i5 ^ 51) | i6) << 1;
        int i8 = -((i5 | 51) & (~i6));
        int i9 = (i7 & i8) + (i8 | i7);
        a = i9 % 128;
        if (i9 % 2 == 0) {
            editor.apply();
        } else {
            editor.apply();
            int i10 = 73 / 0;
        }
    }

    public void P(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 67;
        int i4 = (i3 - (~((i2 ^ 67) | i3))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        this.d.putString("k_resurvey_status", str);
        int i6 = b + 99;
        a = i6 % 128;
        if (i6 % 2 == 0) {
            this.d.apply();
        } else {
            this.d.apply();
            int i7 = 76 / 0;
        }
    }

    public void Q(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 81;
        int i4 = (i2 ^ 81) | i3;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            this.d.putString("k_token", str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.d.putString("k_token", str);
        int i6 = b;
        int i7 = i6 & 93;
        int i8 = -(-(i6 | 93));
        int i9 = (i7 & i8) + (i8 | i7);
        a = i9 % 128;
        int i10 = i9 % 2;
        this.d.apply();
        this.d.commit();
        int i11 = b;
        int i12 = ((i11 | 37) << 1) - (i11 ^ 37);
        a = i12 % 128;
        int i13 = i12 % 2;
        int i14 = (((i11 | 109) << 1) - (~(-(i11 ^ 109)))) - 1;
        a = i14 % 128;
        int i15 = i14 % 2;
    }

    public SharedPreferences h(Context context) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 115;
        int i4 = i2 | 115;
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        SharedPreferences sharedPreferencesC = null;
        try {
            if (i5 % 2 == 0) {
                c.b(c.c);
                j.bJJ bjj = j.bJJ.c;
                j.bJK bjk = j.bJK.c;
                throw null;
            }
            sharedPreferencesC = j.c("ApplicationDetails", c.b(c.c), context, j.bJJ.c, j.bJK.c);
            int i6 = b + 65;
            a = i6 % 128;
            int i7 = i6 % 2;
            int i8 = b;
            int i9 = (i8 & (-56)) | ((~i8) & 55);
            int i10 = (i8 & 55) << 1;
            int i11 = (i9 & i10) + (i10 | i9);
            a = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 88 / 0;
            }
            return sharedPreferencesC;
        } catch (IOException | GeneralSecurityException unused) {
            int i13 = b;
            int i14 = i13 & 77;
            int i15 = (i13 | 77) & (~i14);
            int i16 = -(-(i14 << 1));
            int i17 = ((i15 | i16) << 1) - (i15 ^ i16);
            a = i17 % 128;
            int i18 = i17 % 2;
        }
    }

    public void C(ArrayList<CitizenData> arrayList) {
        int i = 2 % 2;
        String strK = new C().k(arrayList);
        SharedPreferences.Editor editor = this.d;
        int i2 = a + 31;
        b = i2 % 128;
        int i3 = i2 % 2;
        editor.putString("citizenData", strK);
        this.d.apply();
        int i4 = b;
        int i5 = i4 | 123;
        int i6 = i5 << 1;
        int i7 = -((~(i4 & 123)) & i5);
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        a = i8 % 128;
        int i9 = i8 % 2;
        this.d.commit();
        int i10 = a;
        int i11 = (i10 ^ 25) + ((i10 & 25) << 1);
        b = i11 % 128;
        int i12 = i11 % 2;
    }
}
