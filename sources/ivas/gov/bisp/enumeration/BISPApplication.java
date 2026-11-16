package ivas.gov.bisp.enumeration;

import android.app.ProgressDialog;
import android.content.Context;
import android.location.Location;
import bin.mt.signature.KillerApplication;
import com.orm.SugarContext;
import ivas.gov.bisp.enumeration.W.z;
import ivas.gov.bisp.enumeration.bK.ah;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import ivas.gov.bisp.enumeration.models.Crop;
import ivas.gov.bisp.enumeration.models.RosterItem;
import ivas.gov.bisp.enumeration.o0ooOO0.o00O0O;
import ivas.gov.bisp.enumeration.p018ar.ay;
import ivas.gov.bisp.enumeration.p022av.N;
import ivas.gov.bisp.enumeration.p023aw.a;
import ivas.gov.bisp.enumeration.p043bp.C0200b;
import ivas.gov.bisp.enumeration.p043bp.C0202d;
import ivas.gov.bisp.enumeration.p043bp.af;
import java.util.ArrayList;
import java.util.List;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class BISPApplication extends KillerApplication {
    private static int a = 0;
    private static int b = 1;
    public static BISPApplication c = null;
    public static Location d = null;
    public static int e = -1;
    public static boolean f;
    public String A;
    public List<Crop> G;
    public List<Crop> H;
    public List<Item> I;
    public String J;
    public String K;
    public ArrayList<Item> L;
    public ArrayList<Item> M;
    public List<RosterItem> N;
    public ArrayList<Item> O;
    public ArrayList<Item> P;
    public ArrayList<Item> Q;
    public ArrayList<Item> R;
    public ArrayList<Item> S;
    public String U;
    public ArrayList<Item> V;
    public String W;
    public int X;
    public int Y;
    public N h;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f42o;
    public boolean x;
    public boolean i = true;
    public int j = 0;
    public int l = 0;
    public int k = 0;
    public int m = 0;
    public int n = 0;
    public boolean g = false;
    public int p = 1;
    public String q = BuildConfig.FLAVOR;
    public String s = BuildConfig.FLAVOR;
    public boolean r = false;
    public boolean t = false;
    public boolean u = false;
    public int w = 0;
    public ArrayList<RosterItem> v = new ArrayList<>();
    public int z = 0;
    public int B = 0;
    public int C = 0;
    public int y = 0;
    public int E = 0;
    public int D = 0;
    public int F = 0;
    public int T = -1;

    public static BISPApplication c() {
        BISPApplication bISPApplication;
        synchronized (BISPApplication.class) {
            bISPApplication = c;
        }
        return bISPApplication;
    }

    public static boolean d() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-6)) | ((~i2) & 5);
        int i4 = -(-((i2 & 5) << 1));
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        a = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
        boolean z = f;
        int i6 = i2 + 65;
        a = i6 % 128;
        if (i6 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public static String e() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 ^ 119) | (i2 & 119)) << 1) - (((~i2) & 119) | (i2 & (-120)));
        b = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (d != null) {
            StringBuilder sb = new StringBuilder();
            double latitude = d.getLatitude();
            int i4 = a;
            int i5 = (i4 ^ 123) + ((i4 & 123) << 1);
            b = i5 % 128;
            if (i5 % 2 == 0) {
                sb.append(latitude);
                sb.append(",");
                obj.hashCode();
                throw null;
            }
            sb.append(latitude);
            sb.append(",");
            Location location = d;
            int i6 = a;
            int i7 = (((i6 ^ 17) | (i6 & 17)) << 1) - (((~i6) & 17) | (i6 & (-18)));
            b = i7 % 128;
            int i8 = i7 % 2;
            sb.append(location.getLongitude());
            String string = sb.toString();
            int i9 = b;
            int i10 = i9 | 7;
            int i11 = (i10 << 1) - ((~(i9 & 7)) & i10);
            a = i11 % 128;
            int i12 = i11 % 2;
            return string;
        }
        Location location2 = new Location(BuildConfig.FLAVOR);
        d = location2;
        location2.setLatitude(0.0d);
        d.setLongitude(0.0d);
        StringBuilder sb2 = new StringBuilder();
        int i13 = a;
        int i14 = i13 & 109;
        int i15 = (i13 | 109) & (~i14);
        int i16 = i14 << 1;
        int i17 = (i15 & i16) + (i15 | i16);
        b = i17 % 128;
        if (i17 % 2 == 0) {
            sb2.append(d.getLatitude());
            throw null;
        }
        sb2.append(d.getLatitude());
        int i18 = a;
        int i19 = (((i18 | 74) << 1) - (i18 ^ 74)) - 1;
        b = i19 % 128;
        if (i19 % 2 == 0) {
            sb2.append(",");
            sb2.append(d.getLongitude());
            int i20 = 8 / 0;
        } else {
            sb2.append(",");
            sb2.append(d.getLongitude());
        }
        String string2 = sb2.toString();
        int i21 = b + 105;
        a = i21 % 128;
        if (i21 % 2 == 0) {
            return string2;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x005d  */
    public static boolean f() {
        boolean z;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 | 9) << 1) - (~(-(((~i2) & 9) | (i2 & (-10)))))) - 1;
        a = i3 % 128;
        if (i3 % 2 != 0) {
            e();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (e() != null) {
            int i4 = b + 65;
            a = i4 % 128;
            int i5 = i4 % 2;
            if (e().equals(BuildConfig.FLAVOR)) {
                int i6 = a;
                int i7 = (i6 | 97) << 1;
                int i8 = -(((~i6) & 97) | (i6 & (-98)));
                int i9 = (i7 & i8) + (i8 | i7);
                b = i9 % 128;
                int i10 = i9 % 2;
                z = true;
            } else {
                int i11 = b;
                int i12 = i11 & 93;
                int i13 = ((i11 ^ 93) | i12) << 1;
                int i14 = -((i11 | 93) & (~i12));
                int i15 = (i13 & i14) + (i14 | i13);
                int i16 = i15 % 128;
                a = i16;
                int i17 = i15 % 2;
                int i18 = (-2) - (((i16 ^ 80) + ((i16 & 80) << 1)) ^ (-1));
                b = i18 % 128;
                int i19 = i18 % 2;
                z = false;
            }
        } else {
            int i20 = a;
            int i21 = (i20 | 97) << 1;
            int i22 = -(((~i20) & 97) | (i20 & (-98)));
            int i23 = (i21 & i22) + (i22 | i21);
            b = i23 % 128;
            int i110 = i23 % 2;
            z = true;
        }
        int i24 = b;
        int i25 = i24 & 49;
        int i26 = ((i24 ^ 49) | i25) << 1;
        int i27 = -((i24 | 49) & (~i25));
        int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
        a = i28 % 128;
        int i29 = i28 % 2;
        return z;
    }

    public List<RosterItem> A() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 91;
        int i4 = -(-((i2 ^ 91) | i3));
        int i5 = (i3 & i4) + (i4 | i3);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        List<RosterItem> list = this.N;
        int i8 = i6 + 79;
        a = i8 % 128;
        int i9 = i8 % 2;
        return list;
    }

    public boolean B() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 + 85;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.g;
        int i4 = i2 & 43;
        int i5 = (i4 - (~(-(-((i2 ^ 43) | i4))))) - 1;
        b = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public void C(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 + 81;
        a = i4 % 128;
        int i5 = i4 % 2;
        this.y = i;
        int i6 = (i3 | 65) << 1;
        int i7 = -(((~i3) & 65) | (i3 & (-66)));
        int i8 = ((i6 | i7) << 1) - (i6 ^ i7);
        a = i8 % 128;
        int i9 = i8 % 2;
    }

    public void D(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 99;
        int i5 = (i4 - (~(-(-((i3 ^ 99) | i4))))) - 1;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            this.D = i;
            return;
        }
        this.D = i;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void E(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 41;
        int i5 = (i3 ^ 41) | i4;
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            this.E = i;
            return;
        }
        this.E = i;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void F(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 ^ 22) + ((i3 & 22) << 1)) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        this.F = i;
        int i6 = i3 ^ 13;
        int i7 = ((i3 & 13) | i6) << 1;
        int i8 = -i6;
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        b = i9 % 128;
        int i10 = i9 % 2;
    }

    public void G(boolean z) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 105;
        int i4 = (i2 ^ 105) | i3;
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        this.r = z;
        int i7 = i2 + 109;
        b = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void I(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 123;
        int i4 = i2 | 123;
        int i5 = (i3 & i4) + (i3 | i4);
        a = i5 % 128;
        int i6 = i5 % 2;
        this.s = str;
        int i7 = i2 & 123;
        int i8 = (i7 - (~(-(-((i2 ^ 123) | i7))))) - 1;
        a = i8 % 128;
        if (i8 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void J(boolean z) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-58)) | ((~i2) & 57);
        int i4 = (i2 & 57) << 1;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        this.t = z;
        int i8 = (i6 & (-2)) | ((~i6) & 1);
        int i9 = (i6 & 1) << 1;
        int i10 = ((i8 | i9) << 1) - (i8 ^ i9);
        a = i10 % 128;
        int i11 = i10 % 2;
    }

    public void K(String str) {
        int i = 2 % 2;
        int i2 = a + 5;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        this.A = str;
        if (i4 == 0) {
            int i5 = 61 / 0;
        }
        int i6 = (i3 ^ 113) + ((i3 & 113) << 1);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 95 / 0;
        }
    }

    public void L(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 & (-124)) | ((~i3) & 123);
        int i5 = -(-((i3 & 123) << 1));
        int i6 = (i4 & i5) + (i4 | i5);
        b = i6 % 128;
        int i7 = i6 % 2;
        this.p = i;
        int i8 = i3 & 83;
        int i9 = -(-((i3 ^ 83) | i8));
        int i10 = (i8 ^ i9) + ((i8 & i9) << 1);
        b = i10 % 128;
        int i11 = i10 % 2;
    }

    public void M(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 35) + ((i2 & 35) << 1);
        a = i3 % 128;
        if (i3 % 2 == 0) {
            this.J = str;
            return;
        }
        this.J = str;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void N(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & 111) - (~(-(-(i2 | 111))))) - 1;
        a = i3 % 128;
        if (i3 % 2 == 0) {
            this.K = str;
        } else {
            this.K = str;
            int i4 = 60 / 0;
        }
    }

    public void O(int i) {
        int i2 = 2 % 2;
        int i3 = a + 120;
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        b = i4 % 128;
        if (i4 % 2 != 0) {
            this.C = i;
            return;
        }
        this.C = i;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void P(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 | 61;
        int i4 = i3 << 1;
        int i5 = -((~(i2 & 61)) & i3);
        int i6 = (i4 & i5) + (i5 | i4);
        int i7 = i6 % 128;
        b = i7;
        if (i6 % 2 == 0) {
            this.q = str;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.q = str;
        int i8 = i7 & 125;
        int i9 = -(-((i7 ^ 125) | i8));
        int i10 = (i8 & i9) + (i8 | i9);
        a = i10 % 128;
        int i11 = i10 % 2;
    }

    public void Q(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 & 115) + (i3 | 115);
        a = i4 % 128;
        int i5 = i4 % 2;
        this.B = i;
        int i6 = ((i3 & 100) + (i3 | 100)) - 1;
        a = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public void R(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 15;
        int i5 = i3 | 15;
        int i6 = (i4 & i5) + (i5 | i4);
        int i7 = i6 % 128;
        a = i7;
        int i8 = i6 % 2;
        this.z = i;
        int i9 = (i7 ^ 33) + ((i7 & 33) << 1);
        b = i9 % 128;
        if (i9 % 2 == 0) {
            throw null;
        }
    }

    public int g() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 119;
        int i4 = (i3 - (~(-(-((i2 ^ 119) | i3))))) - 1;
        int i5 = i4 % 128;
        b = i5;
        int i6 = i4 % 2;
        int i7 = this.D;
        int i8 = ((i5 | 41) << 1) - (i5 ^ 41);
        a = i8 % 128;
        int i9 = i8 % 2;
        return i7;
    }

    public String i() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 51;
        int i4 = ((i2 | 51) & (~i3)) + (i3 << 1);
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        String str = this.U;
        int i7 = (((i5 | 58) << 1) - (i5 ^ 58)) - 1;
        b = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 2 / 0;
        }
        return str;
    }

    public int j() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 ^ 95) | (i2 & 95)) << 1) - ((i2 & (-96)) | ((~i2) & 95));
        b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.m;
        int i6 = ((i2 | 15) << 1) - (i2 ^ 15);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int k() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 76) << 1) - (i2 ^ 76);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return this.k;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int l() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 35;
        int i4 = ((i2 ^ 35) | i3) << 1;
        int i5 = -((i2 | 35) & (~i3));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        int i7 = i6 % 128;
        a = i7;
        int i8 = i6 % 2;
        int i9 = this.j;
        int i10 = (i7 & 21) + (i7 | 21);
        b = i10 % 128;
        int i11 = i10 % 2;
        return i9;
    }

    public int m() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 101;
        int i4 = (~i3) & (i2 | 101);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 & i5) + (i5 | i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        int i8 = this.n;
        int i9 = i2 ^ 49;
        int i10 = -(-((i2 & 49) << 1));
        int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
        a = i11 % 128;
        if (i11 % 2 == 0) {
            return i8;
        }
        throw null;
    }

    public int n() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-82)) | ((~i2) & 81);
        int i4 = -(-((i2 & 81) << 1));
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = this.y;
        int i7 = ((i2 ^ 19) | (i2 & 19)) << 1;
        int i8 = -(((~i2) & 19) | (i2 & (-20)));
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        b = i9 % 128;
        int i10 = i9 % 2;
        return i6;
    }

    public int o() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 77;
        int i4 = (((~i3) & (i2 | 77)) - (~(-(-(i3 << 1))))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.E;
        int i7 = i2 ^ 75;
        int i8 = (i2 & 75) << 1;
        int i9 = (i7 & i8) + (i8 | i7);
        b = i9 % 128;
        int i10 = i9 % 2;
        return i6;
    }

    public int p() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 7) << 1) - (i2 ^ 7);
        b = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.F;
        int i5 = (((i2 | 86) << 1) - (i2 ^ 86)) - 1;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 52 / 0;
        }
        return i4;
    }

    public int q() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-14)) | ((~i2) & 13);
        int i4 = -(-((i2 & 13) << 1));
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        int i7 = this.l;
        int i8 = (-2) - ((i2 + 88) ^ (-1));
        b = i8 % 128;
        int i9 = i8 % 2;
        return i7;
    }

    public String r() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 + 17;
        b = i3 % 128;
        int i4 = i3 % 2;
        String str = this.A;
        int i5 = i2 & 21;
        int i6 = i2 | 21;
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        b = i7 % 128;
        if (i7 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int s() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 + 51;
        b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.Y;
        int i6 = i2 + 75;
        b = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 12 / 0;
        }
        return i5;
    }

    public String t() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 53;
        int i4 = ((~i3) & (i2 | 53)) + (i3 << 1);
        a = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.W;
        int i5 = i2 & 109;
        int i6 = (i5 - (~(-(-((i2 ^ 109) | i5))))) - 1;
        a = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public String u() {
        int i = 2 % 2;
        int i2 = b + 71;
        int i3 = i2 % 128;
        a = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.K;
        int i4 = i3 & 39;
        int i5 = (i3 ^ 39) | i4;
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public String v() {
        int i = 2 % 2;
        int i2 = a + 1;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            return this.q;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int w() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 123;
        a = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.C;
        int i6 = i2 ^ 81;
        int i7 = ((i2 & 81) | i6) << 1;
        int i8 = -i6;
        int i9 = (i7 & i8) + (i7 | i8);
        a = i9 % 128;
        int i10 = i9 % 2;
        return i5;
    }

    public int x() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 109) - (~((i2 & 109) << 1))) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.B;
        int i6 = i2 & 5;
        int i7 = i6 + ((i2 ^ 5) | i6);
        a = i7 % 128;
        int i8 = i7 % 2;
        return i5;
    }

    public int y() {
        int i = 2 % 2;
        int i2 = b + 64;
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.X;
        if (i4 != 0) {
            int i6 = 21 / 0;
        }
        return i5;
    }

    public int z() {
        int i = 2 % 2;
        int i2 = a + 17;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            return this.z;
        }
        throw null;
    }

    static {
        int i = 1 & 89;
        int i2 = (i - (~(-(-((1 ^ 89) | i))))) - 1;
        a = i2 % 128;
        int i3 = i2 % 2;
    }

    public void H(boolean z) {
        ah ahVar;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 125;
        int i4 = ((i2 | 125) & (~i3)) + (i3 << 1);
        a = i4 % 128;
        if (i4 % 2 != 0) {
            ahVar = ah.c;
            ahVar.e.putInt("IsTimeableScreen", z ? 1 : 0);
            int i5 = 20 / 0;
        } else {
            ahVar = ah.c;
            ahVar.e.putInt("IsTimeableScreen", z ? 1 : 0);
        }
        ahVar.e.commit();
        this.g = z;
        int i6 = b;
        int i7 = i6 ^ 61;
        int i8 = (i6 & 61) << 1;
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        a = i9 % 128;
        if (i9 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 | 83) << 1;
        int i4 = -(i2 ^ 83);
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        super.attachBaseContext(context);
        SugarContext.init(this);
        int i7 = b;
        int i8 = i7 & 39;
        int i9 = (((i7 ^ 39) | i8) << 1) - ((i7 | 39) & (~i8));
        a = i9 % 128;
        int i10 = i9 % 2;
    }

    public <T> void h(o00O0O<T> o00o0o) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 19;
        int i4 = ((i2 & 19) | i3) << 1;
        int i5 = -i3;
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.h == null) {
            int i7 = i2 & 63;
            int i8 = (i2 | 63) & (~i7);
            int i9 = -(-(i7 << 1));
            int i10 = (i8 & i9) + (i8 | i9);
            a = i10 % 128;
            int i11 = i10 % 2;
            this.h = a.b(getApplicationContext());
            int i12 = a;
            int i13 = i12 & 89;
            int i14 = ((i12 | 89) & (~i13)) + (i13 << 1);
            b = i14 % 128;
            int i15 = i14 % 2;
        }
        this.h.c(o00o0o);
        int i16 = a;
        int i17 = i16 & 105;
        int i18 = (i16 | 105) & (~i17);
        int i19 = i17 << 1;
        int i20 = ((i18 | i19) << 1) - (i18 ^ i19);
        b = i20 % 128;
        int i21 = i20 % 2;
    }

    @Override // android.app.Application
    public void onCreate() {
        int i = 2 % 2;
        int i2 = b + 95;
        a = i2 % 128;
        if (i2 % 2 == 0) {
            super.onCreate();
            c = this;
            ay.g(this);
        } else {
            super.onCreate();
            c = this;
            ay.g(this);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public void S(Context context, String str, String str2, z zVar) {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        int i2 = b + 105;
        a = i2 % 128;
        int i3 = i2 % 2;
        sb.append("https://meladeskapp.bisp.gov.pk");
        sb.append("/api/Roster/VerifyElectricityRefStatus");
        if (i3 != 0) {
            int i4 = 17 / 0;
        }
        sb.append("?ReferenceNo=");
        sb.append(str2);
        int i5 = b;
        int i6 = (i5 ^ 26) + ((i5 & 26) << 1);
        int i7 = (i6 ^ (-1)) + (i6 << 1);
        a = i7 % 128;
        Object obj = null;
        if (i7 % 2 != 0) {
            sb.append("&cnic=");
            throw null;
        }
        sb.append("&cnic=");
        sb.append(str);
        String string = sb.toString();
        ProgressDialog progressDialog = new ProgressDialog(context);
        int i8 = a;
        int i9 = i8 & 103;
        int i10 = i9 + ((i8 ^ 103) | i9);
        b = i10 % 128;
        int i11 = i10 % 2;
        progressDialog.setCancelable(false);
        progressDialog.setMessage("Please Wait...");
        int i12 = a + 91;
        b = i12 % 128;
        int i13 = i12 % 2;
        progressDialog.setProgressStyle(0);
        if (!progressDialog.isShowing()) {
            int i14 = b;
            int i15 = ((i14 | 17) << 1) - (i14 ^ 17);
            a = i15 % 128;
            if (i15 % 2 != 0) {
                progressDialog.show();
                obj.hashCode();
                throw null;
            }
            progressDialog.show();
            int i16 = a;
            int i17 = i16 & 55;
            int i18 = -(-((i16 ^ 55) | i17));
            int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
            b = i19 % 128;
            if (i19 % 2 == 0) {
                int i20 = 2 / 3;
            }
        }
        C0202d c0202d = new C0202d(this, 0, string, new af(this, progressDialog, zVar, context), new C0200b(this, zVar, progressDialog, context), context);
        ivas.gov.bisp.enumeration.p022av.z zVar2 = new ivas.gov.bisp.enumeration.p022av.z(130000, 0, 0.0f);
        int i21 = b + 53;
        a = i21 % 128;
        int i22 = i21 % 2;
        c0202d.m = zVar2;
        c0202d.k = false;
        a.b(this).c(c0202d);
        int i23 = b + 11;
        a = i23 % 128;
        if (i23 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
