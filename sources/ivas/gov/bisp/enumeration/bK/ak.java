package ivas.gov.bisp.enumeration.bK;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.location.Location;
import android.widget.Toast;
import ivas.gov.bisp.enumeration.BISPApplication;
import ivas.gov.bisp.enumeration.W.t;
import ivas.gov.bisp.enumeration.models.LocalityData;
import ivas.gov.bisp.enumeration.p026az.C0104p;
import ivas.gov.bisp.enumeration.p026az.z;
import ivas.gov.bisp.enumeration.p035bh.C;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class ak {
    private static int a = 0;
    private static int b = 1;
    public static int c;

    public static void f(t tVar) {
        int supervisorId;
        SharedPreferences sharedPreferences;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 107) + ((i2 & 107) << 1);
        b = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            ah.c.d.getString("localityString", BuildConfig.FLAVOR);
            throw null;
        }
        String string = ah.c.d.getString("localityString", BuildConfig.FLAVOR);
        if (string != null) {
            int i4 = b + 61;
            a = i4 % 128;
            if (i4 % 2 != 0) {
                string.equals(BuildConfig.FLAVOR);
                obj.hashCode();
                throw null;
            }
            if (!string.equals(BuildConfig.FLAVOR)) {
                Object objF = new C().f(string, LocalityData.class);
                int i5 = a;
                int i6 = i5 & 37;
                int i7 = i6 + ((i5 ^ 37) | i6);
                b = i7 % 128;
                if (i7 % 2 == 0) {
                    ((LocalityData) objF).getSupervisorId();
                    obj.hashCode();
                    throw null;
                }
                LocalityData localityData = (LocalityData) objF;
                if (localityData.getSupervisorId() != -1) {
                    int i8 = b + 121;
                    a = i8 % 128;
                    if (i8 % 2 != 0) {
                        supervisorId = localityData.getSupervisorId();
                        sharedPreferences = ah.c.d;
                        int i9 = 74 / 0;
                    } else {
                        supervisorId = localityData.getSupervisorId();
                        sharedPreferences = ah.c.d;
                    }
                    if (supervisorId == sharedPreferences.getInt("supervisorID", 0)) {
                        int i10 = a;
                        int i11 = (i10 & 63) + (i10 | 63);
                        b = i11 % 128;
                        int i12 = i11 % 2;
                        if (localityData.getServerAppVersion() > 33) {
                            int i13 = b;
                            int i14 = (i13 & (-4)) | ((~i13) & 3);
                            int i15 = (i13 & 3) << 1;
                            int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
                            a = i16 % 128;
                            int i17 = i16 % 2;
                            if (localityData.getIsForceUpdate() == 1) {
                                int i18 = a;
                                int i19 = ((i18 & 117) - (~(i18 | 117))) - 1;
                                b = i19 % 128;
                                int i20 = i19 % 2;
                                ah ahVar = ah.c;
                                ahVar.e.putBoolean("syncRequired", true);
                                ahVar.e.commit();
                                ah ahVar2 = ah.c;
                                int i21 = a;
                                int i22 = (-2) - ((((i21 | 58) << 1) - (i21 ^ 58)) ^ (-1));
                                b = i22 % 128;
                                int i23 = i22 % 2;
                                ahVar2.e.putInt("StructuralVersion", 1);
                                SharedPreferences.Editor editor = ahVar2.e;
                                int i24 = b + 88;
                                int i25 = (i24 ^ (-1)) + (i24 << 1);
                                a = i25 % 128;
                                if (i25 % 2 == 0) {
                                    editor.commit();
                                    tVar.notValidVersion();
                                    return;
                                } else {
                                    editor.commit();
                                    tVar.notValidVersion();
                                    int i26 = 80 / 0;
                                    return;
                                }
                            }
                        }
                        tVar.validData(localityData.getLocality());
                        int i27 = a;
                        int i28 = ((i27 & 124) + (i27 | 124)) - 1;
                        b = i28 % 128;
                        int i29 = i28 % 2;
                        return;
                    }
                }
                tVar.notValidSupervisor();
                int i30 = b;
                int i31 = (i30 & (-58)) | ((~i30) & 57);
                int i32 = (i30 & 57) << 1;
                int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
                a = i33 % 128;
                int i34 = i33 % 2;
                return;
            }
        }
        tVar.notValidData();
        int i35 = a;
        int i36 = i35 & 115;
        int i37 = (i35 | 115) & (~i36);
        int i38 = i36 << 1;
        int i39 = (i37 ^ i38) + ((i37 & i38) << 1);
        b = i39 % 128;
        int i40 = i39 % 2;
    }

    public static String d() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 39;
        int i4 = ((i2 & 39) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        b = i6 % 128;
        Object obj = null;
        if (i6 % 2 == 0) {
            Location location = BISPApplication.d;
            obj.hashCode();
            throw null;
        }
        if (BISPApplication.d != null) {
            try {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                Date date = new Date(BISPApplication.d.getTime());
                int i7 = a;
                int i8 = i7 ^ 91;
                int i9 = -(-((i7 & 91) << 1));
                int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
                b = i10 % 128;
                if (i10 % 2 == 0) {
                    simpleDateFormat.format(date);
                    obj.hashCode();
                    throw null;
                }
                String str = simpleDateFormat.format(date);
                if (str != null) {
                    if (!str.equals(BuildConfig.FLAVOR)) {
                        int i11 = a + 10;
                        int i12 = (i11 ^ (-1)) + (i11 << 1);
                        b = i12 % 128;
                        int i13 = i12 % 2;
                        return str;
                    }
                    int i14 = b + 33;
                    a = i14 % 128;
                    int i15 = i14 % 2;
                }
                String strF = z.f();
                int i16 = b + 61;
                a = i16 % 128;
                if (i16 % 2 == 0) {
                    return strF;
                }
                throw null;
            } catch (Exception unused) {
                return z.f();
            }
        }
        if (BISPApplication.f()) {
            String strF2 = z.f();
            int i17 = a;
            int i18 = (i17 ^ 41) + ((i17 & 41) << 1);
            b = i18 % 128;
            int i19 = i18 % 2;
            return strF2;
        }
        try {
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
            Date date2 = new Date(BISPApplication.d.getTime());
            int i20 = b;
            int i21 = i20 & 101;
            int i22 = (i20 ^ 101) | i21;
            int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
            a = i23 % 128;
            if (i23 % 2 != 0) {
                simpleDateFormat2.format(date2);
                obj.hashCode();
                throw null;
            }
            String str2 = simpleDateFormat2.format(date2);
            if (str2 != null) {
                if (!str2.equals(BuildConfig.FLAVOR)) {
                    int i24 = a;
                    int i25 = i24 & 43;
                    int i26 = i25 + ((i24 ^ 43) | i25);
                    b = i26 % 128;
                    int i27 = i26 % 2;
                    return str2;
                }
                int i28 = b;
                int i29 = ((((i28 ^ 27) | (i28 & 27)) << 1) - (~(-(((~i28) & 27) | (i28 & (-28)))))) - 1;
                a = i29 % 128;
                int i30 = i29 % 2;
            }
            String strE = z.e();
            int i31 = b + 43;
            a = i31 % 128;
            int i32 = i31 % 2;
            return strE;
        } catch (Exception unused2) {
            return z.e();
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00cd A[PHI: r2
  0x00cd: PHI (r2v20 java.lang.String) = (r2v19 java.lang.String), (r2v27 java.lang.String) binds: [B:34:0x00cb, B:31:0x00c4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x00e4 A[Catch: Exception -> 0x012f, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x012f, blocks: (B:26:0x00a1, B:29:0x00bc, B:48:0x0114, B:37:0x00e4, B:44:0x010e, B:45:0x0111, B:33:0x00c7), top: B:61:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:40:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:42:0x0109  */
    /* JADX WARN: Code duplicated, block: B:44:0x010e A[Catch: Exception -> 0x012f, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x012f, blocks: (B:26:0x00a1, B:29:0x00bc, B:48:0x0114, B:37:0x00e4, B:44:0x010e, B:45:0x0111, B:33:0x00c7), top: B:61:0x00a1 }] */
    public static String e() {
        String str;
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = (i4 & (-110)) | ((~i4) & 109);
        int i6 = -(-((i4 & 109) << 1));
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        b = i7 % 128;
        Object obj = null;
        if (i7 % 2 == 0) {
            Location location = BISPApplication.d;
            obj.hashCode();
            throw null;
        }
        if (BISPApplication.d != null) {
            try {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
                Date date = new Date(BISPApplication.d.getTime());
                int i8 = a;
                int i9 = i8 & 101;
                int i10 = (i8 | 101) & (~i9);
                int i11 = -(-(i9 << 1));
                int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
                b = i12 % 128;
                if (i12 % 2 == 0) {
                    simpleDateFormat.format(date);
                    obj.hashCode();
                    throw null;
                }
                String str2 = simpleDateFormat.format(date);
                if (str2 != null) {
                    if (!str2.equals(BuildConfig.FLAVOR)) {
                        int i13 = a;
                        int i14 = i13 & 33;
                        int i15 = ((i13 | 33) & (~i14)) + (i14 << 1);
                        b = i15 % 128;
                        int i16 = i15 % 2;
                        return str2;
                    }
                    int i17 = a;
                    int i18 = ((i17 & (-18)) | ((~i17) & 17)) + ((i17 & 17) << 1);
                    b = i18 % 128;
                    int i19 = i18 % 2;
                }
                String strB = z.b();
                int i20 = b + 9;
                a = i20 % 128;
                int i21 = i20 % 2;
                return strB;
            } catch (Exception unused) {
                return z.b();
            }
        }
        if (BISPApplication.f()) {
            String strB2 = z.b();
            int i22 = a;
            int i23 = i22 & 83;
            int i24 = (i22 | 83) & (~i23);
            int i25 = i23 << 1;
            int i26 = (i24 ^ i25) + ((i24 & i25) << 1);
            b = i26 % 128;
            if (i26 % 2 == 0) {
                int i27 = 98 / 0;
            }
            return strB2;
        }
        try {
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("HH:mm:ss");
            Date date2 = new Date(BISPApplication.d.getTime());
            int i28 = b + 91;
            a = i28 % 128;
            if (i28 % 2 != 0) {
                str = simpleDateFormat2.format(date2);
                int i29 = 59 / 0;
                if (str != null) {
                    int i30 = b;
                    i = (((i30 | 33) << 1) - (~(-((33 & (~i30)) | (i30 & (-34)))))) - 1;
                    a = i % 128;
                    if (i % 2 == 0) {
                        str.equals(BuildConfig.FLAVOR);
                        throw null;
                    }
                    if (str.equals(BuildConfig.FLAVOR)) {
                        int i31 = a;
                        i2 = (i31 & 65) + (i31 | 65);
                        b = i2 % 128;
                        if (i2 % 2 == 0) {
                            int i32 = 92 / 0;
                        }
                        return str;
                    }
                    int i33 = a;
                    int i34 = i33 & 29;
                    int i35 = (i33 ^ 29) | i34;
                    int i36 = (i34 & i35) + (i35 | i34);
                    b = i36 % 128;
                    int i37 = i36 % 2;
                }
            } else {
                str = simpleDateFormat2.format(date2);
                if (str != null) {
                    int i38 = b;
                    i = (((i38 | 33) << 1) - (~(-((33 & (~i38)) | (i38 & (-34)))))) - 1;
                    a = i % 128;
                    if (i % 2 == 0) {
                        str.equals(BuildConfig.FLAVOR);
                        throw null;
                    }
                    if (str.equals(BuildConfig.FLAVOR)) {
                        int i39 = a;
                        i2 = (i39 & 65) + (i39 | 65);
                        b = i2 % 128;
                        if (i2 % 2 == 0) {
                            int i310 = 92 / 0;
                        }
                        return str;
                    }
                    int i311 = a;
                    int i312 = i311 & 29;
                    int i313 = (i311 ^ 29) | i312;
                    int i314 = (i312 & i313) + (i313 | i312);
                    b = i314 % 128;
                    int i315 = i314 % 2;
                }
            }
            String strE = z.e();
            int i40 = b;
            int i41 = ((i40 ^ 37) - (~(-(-((i40 & 37) << 1))))) - 1;
            a = i41 % 128;
            if (i41 % 2 == 0) {
                return strE;
            }
            throw null;
        } catch (Exception unused2) {
            return z.e();
        }
    }

    public static void b(Context context, String str, String str2, DialogInterface.OnClickListener onClickListener) {
        ah ahVar;
        SharedPreferences.Editor editor;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 11;
        int i4 = ((i2 ^ 11) | i3) << 1;
        int i5 = -((i2 | 11) & (~i3));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        ah ahVar2 = ah.c;
        SharedPreferences.Editor editor2 = ahVar2.e;
        int i8 = a;
        int i9 = i8 & 51;
        int i10 = (i8 | 51) & (~i9);
        int i11 = i9 << 1;
        int i12 = (i10 & i11) + (i10 | i11);
        b = i12 % 128;
        int i13 = i12 % 2;
        editor2.putBoolean("syncRequired", true);
        ahVar2.e.commit();
        int i14 = b + 49;
        a = i14 % 128;
        if (i14 % 2 != 0) {
            ahVar = ah.c;
            editor = ahVar.e;
            int i15 = 52 / 0;
        } else {
            ahVar = ah.c;
            editor = ahVar.e;
        }
        editor.putInt("StructuralVersion", 1);
        SharedPreferences.Editor editor3 = ahVar.e;
        int i16 = b + 66;
        int i17 = (i16 ^ (-1)) + (i16 << 1);
        a = i17 % 128;
        if (i17 % 2 != 0) {
            editor3.commit();
            C0104p.c();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        editor3.commit();
        C0104p.c().e(context, str, str2, onClickListener, false);
        int i18 = a;
        int i19 = (i18 | 45) << 1;
        int i20 = -(((~i18) & 45) | (i18 & (-46)));
        int i21 = (i19 & i20) + (i20 | i19);
        b = i21 % 128;
        int i22 = i21 % 2;
    }

    public static String c() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 47;
        int i4 = (i2 | 47) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        a = i6 % 128;
        int i7 = i6 % 2;
        Object obj = null;
        if (BISPApplication.d != null) {
            try {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Date date = new Date(BISPApplication.d.getTime());
                int i8 = a;
                int i9 = (-2) - ((((i8 | 68) << 1) - (i8 ^ 68)) ^ (-1));
                b = i9 % 128;
                int i10 = i9 % 2;
                String str = simpleDateFormat.format(date);
                if (str != null) {
                    int i11 = a;
                    int i12 = i11 & 3;
                    int i13 = (i11 ^ 3) | i12;
                    int i14 = (i12 & i13) + (i13 | i12);
                    b = i14 % 128;
                    if (i14 % 2 == 0) {
                        str.equals(BuildConfig.FLAVOR);
                        obj.hashCode();
                        throw null;
                    }
                    if (!str.equals(BuildConfig.FLAVOR)) {
                        int i15 = b;
                        int i16 = i15 & 85;
                        int i17 = (i15 | 85) & (~i16);
                        int i18 = -(-(i16 << 1));
                        int i19 = (i17 ^ i18) + ((i17 & i18) << 1);
                        a = i19 % 128;
                        if (i19 % 2 == 0) {
                            return str;
                        }
                        obj.hashCode();
                        throw null;
                    }
                    int i20 = a + 37;
                    b = i20 % 128;
                    int i21 = i20 % 2;
                }
                String strE = z.e();
                int i22 = a;
                int i23 = ((i22 | 55) << 1) - (i22 ^ 55);
                b = i23 % 128;
                if (i23 % 2 != 0) {
                    return strE;
                }
                obj.hashCode();
                throw null;
            } catch (Exception unused) {
                return z.e();
            }
        }
        if (BISPApplication.f()) {
            String strE2 = z.e();
            int i24 = a;
            int i25 = i24 & 13;
            int i26 = (i24 ^ 13) | i25;
            int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
            b = i27 % 128;
            if (i27 % 2 == 0) {
                int i28 = 9 / 0;
            }
            return strE2;
        }
        try {
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date2 = new Date(BISPApplication.d.getTime());
            int i29 = b;
            int i30 = (i29 | 73) << 1;
            int i31 = -(((~i29) & 73) | (i29 & (-74)));
            int i32 = (i30 & i31) + (i31 | i30);
            a = i32 % 128;
            int i33 = i32 % 2;
            String str2 = simpleDateFormat2.format(date2);
            if (str2 != null) {
                int i34 = a;
                int i35 = ((i34 | 15) << 1) - (i34 ^ 15);
                b = i35 % 128;
                if (i35 % 2 == 0) {
                    str2.equals(BuildConfig.FLAVOR);
                    throw null;
                }
                if (!str2.equals(BuildConfig.FLAVOR)) {
                    int i36 = a;
                    int i37 = i36 & 101;
                    int i38 = (i36 | 101) & (~i37);
                    int i39 = -(-(i37 << 1));
                    int i40 = ((i38 | i39) << 1) - (i38 ^ i39);
                    b = i40 % 128;
                    if (i40 % 2 == 0) {
                        int i41 = 79 / 0;
                    }
                    return str2;
                }
                int i42 = a;
                int i43 = i42 ^ 11;
                int i44 = (i42 & 11) << 1;
                int i45 = ((i43 | i44) << 1) - (i44 ^ i43);
                b = i45 % 128;
                int i46 = i45 % 2;
            }
            String strE3 = z.e();
            int i47 = b + 51;
            a = i47 % 128;
            int i48 = i47 % 2;
            return strE3;
        } catch (Exception unused2) {
            return z.e();
        }
    }

    public static boolean g(Context context) {
        long jConvert;
        ah ahVar;
        int i = 2 % 2;
        int i2 = a + 43;
        b = i2 % 128;
        int i3 = i2 % 2;
        try {
            SharedPreferences sharedPreferences = ah.c.d;
            int i4 = b;
            int i5 = (i4 ^ 69) + ((i4 & 69) << 1);
            a = i5 % 128;
            int i6 = i5 % 2;
            c = sharedPreferences.getInt("sync_days", 20);
            ah ahVar2 = ah.c;
            int i7 = b;
            int i8 = (i7 & 89) + (i7 | 89);
            a = i8 % 128;
            int i9 = i8 % 2;
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(ahVar2.d.getString("sync_date", BuildConfig.FLAVOR));
            Date date2 = new Date();
            int i10 = b + 39;
            a = i10 % 128;
            int i11 = i10 % 2;
            long time = date2.getTime();
            long time2 = date.getTime();
            TimeUnit timeUnit = TimeUnit.DAYS;
            int i12 = a;
            int i13 = (i12 ^ 65) + ((i12 & 65) << 1);
            b = i13 % 128;
            if (i13 % 2 == 0) {
                jConvert = timeUnit.convert(time - time2, TimeUnit.MILLISECONDS);
            } else {
                jConvert = timeUnit.convert(time - time2, TimeUnit.MILLISECONDS);
            }
            if (jConvert < c) {
                int i14 = b + 75;
                a = i14 % 128;
                int i15 = i14 % 2;
                return true;
            }
            int i16 = a;
            int i17 = ((i16 & 78) + (i16 | 78)) - 1;
            b = i17 % 128;
            int i18 = i17 % 2;
            ah ahVar3 = ah.c;
            ahVar3.e.putBoolean("syncRequired", true);
            SharedPreferences.Editor editor = ahVar3.e;
            int i19 = a + 54;
            int i20 = (i19 ^ (-1)) + (i19 << 1);
            b = i20 % 128;
            int i21 = i20 % 2;
            editor.commit();
            ah ahVar4 = ah.c;
            ahVar4.e.putInt("StructuralVersion", 1);
            int i22 = a;
            int i23 = i22 & 107;
            int i24 = i22 | 107;
            int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
            b = i25 % 128;
            Object obj = null;
            if (i25 % 2 == 0) {
                ahVar4.e.commit();
                SharedPreferences.Editor editor2 = ah.c.e;
                obj.hashCode();
                throw null;
            }
            ahVar4.e.commit();
            ah ahVar5 = ah.c;
            SharedPreferences.Editor editor3 = ahVar5.e;
            int i26 = a;
            int i27 = i26 & 59;
            int i28 = -(-((i26 ^ 59) | i27));
            int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
            b = i29 % 128;
            if (i29 % 2 == 0) {
                editor3.putString("forceUpdateUser", "0");
                ahVar5.e.commit();
                ahVar = ah.c;
                int i30 = 8 / 0;
            } else {
                editor3.putString("forceUpdateUser", "0");
                ahVar5.e.commit();
                ahVar = ah.c;
            }
            ahVar.e.putString("localityString", BuildConfig.FLAVOR);
            ahVar.e.commit();
            StringBuilder sb = new StringBuilder();
            sb.append("Please sync your application as your last sync was ");
            int i31 = c;
            int i32 = a;
            int i33 = ((i32 | 24) << 1) - (i32 ^ 24);
            int i34 = (i33 ^ (-1)) + (i33 << 1);
            b = i34 % 128;
            int i35 = i34 % 2;
            sb.append(i31);
            sb.append(" days ago.");
            Toast toastMakeText = Toast.makeText(context, sb.toString(), 1);
            int i36 = a;
            int i37 = i36 & 119;
            int i38 = i36 | 119;
            int i39 = (i37 ^ i38) + ((i38 & i37) << 1);
            b = i39 % 128;
            int i40 = i39 % 2;
            toastMakeText.show();
            int i41 = b;
            int i42 = ((i41 | 45) << 1) - (((~i41) & 45) | (i41 & (-46)));
            a = i42 % 128;
            if (i42 % 2 == 0) {
                return false;
            }
            throw null;
        } catch (ParseException unused) {
            ah ahVar6 = ah.c;
            ahVar6.e.putBoolean("syncRequired", true);
            ahVar6.e.commit();
            ah ahVar7 = ah.c;
            ahVar7.e.putInt("StructuralVersion", 1);
            ahVar7.e.commit();
            ah ahVar8 = ah.c;
            ahVar8.e.putString("forceUpdateUser", "0");
            ahVar8.e.commit();
            ah ahVar9 = ah.c;
            ahVar9.e.putString("localityString", BuildConfig.FLAVOR);
            ahVar9.e.commit();
            Toast.makeText(context, "As you have updated your application you have to sync your application.", 1).show();
            return false;
        }
    }
}
