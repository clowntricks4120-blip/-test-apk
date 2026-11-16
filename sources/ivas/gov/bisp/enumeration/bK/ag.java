package ivas.gov.bisp.enumeration.bK;

import android.content.Context;
import android.content.SharedPreferences;
import com.orm.SugarRecord;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.databaseModels.SurveyTimeLimits;
import ivas.gov.bisp.enumeration.databaseModels.User;
import ivas.gov.bisp.enumeration.databaseModels.VillageExemption;
import ivas.gov.bisp.enumeration.models.Batch;
import ivas.gov.bisp.enumeration.models.PersonInfo;
import ivas.gov.bisp.enumeration.p022av.T;
import ivas.gov.bisp.enumeration.p026az.C0104p;
import ivas.gov.bisp.enumeration.p026az.z;
import ivas.gov.bisp.enumeration.p035bh.C;
import ivas.gov.bisp.enumeration.p035bh.C0145s;
import ivas.gov.bisp.enumeration.p035bh.W;
import ivas.gov.bisp.enumeration.p035bh.Y;
import ivas.gov.bisp.enumeration.p035bh.n;
import ivas.gov.bisp.enumeration.p043bp.DialogInterfaceOnClickListenerC0204j;
import ivas.gov.bisp.enumeration.p050bw.i;
import ivas.gov.bisp.enumeration.p091n.j;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import net.sqlcipher.BuildConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class ag {
    private static int a = 0;
    private static int b = 1;
    public static boolean c = false;
    public static boolean d = false;
    public static boolean e = false;
    public static String f = "";
    public static boolean g = false;
    public static String h = "";
    public static String i = "";
    public static int j = 0;
    public static int k = 0;
    public static boolean l = false;
    public static boolean m = false;
    public static int n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static boolean f71o = true;
    public static boolean p = false;
    public static int q = 1;
    public static boolean r = false;
    public static String s = "";
    public static String t = "";
    public static String u = "";
    public static int v;

    public static boolean j(String str, double d2) {
        int i2 = 2 % 2;
        C c2 = new C0145s().c();
        int i3 = b + 13;
        a = i3 % 128;
        int i4 = Integer.parseInt(i3 % 2 != 0 ? str.split("_")[1] : str.split("_")[0]);
        ArrayList arrayList = new ArrayList(Arrays.asList((VillageExemption[]) c2.f(ah.c.d.getString("super_exemptions", BuildConfig.FLAVOR), VillageExemption[].class)));
        int i5 = b;
        int i6 = i5 | 85;
        int i7 = i6 << 1;
        int i8 = -((~(i5 & 85)) & i6);
        int i9 = (i7 & i8) + (i8 | i7);
        int i10 = i9 % 128;
        a = i10;
        int i11 = (i9 % 2 != 0 ? 0 : 1) ^ 1;
        int i12 = i10 & 27;
        int i13 = i12 + ((i10 ^ 27) | i12);
        b = i13 % 128;
        while (true) {
            int i14 = i13 % 2;
            if (i11 >= arrayList.size()) {
                int i15 = a;
                int i16 = i15 & 45;
                int i17 = (i15 ^ 45) | i16;
                int i18 = (i16 & i17) + (i17 | i16);
                b = i18 % 128;
                if (i18 % 2 != 0) {
                    return false;
                }
                throw null;
            }
            int i19 = a;
            int i20 = i19 & 35;
            int i21 = -(-((i19 ^ 35) | i20));
            int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
            b = i22 % 128;
            int i23 = i22 % 2;
            VillageExemption villageExemption = (VillageExemption) arrayList.get(i11);
            int enumeratorID = villageExemption.getEnumeratorID();
            int i24 = a;
            int i25 = i24 + 99;
            b = i25 % 128;
            int i26 = i25 % 2;
            if (enumeratorID == i4) {
                int i27 = (i24 ^ 17) + ((i24 & 17) << 1);
                b = i27 % 128;
                if (i27 % 2 == 0) {
                    villageExemption.getSupervisorID();
                    ah ahVar = ah.c;
                    throw null;
                }
                if (villageExemption.getSupervisorID() == ah.c.d.getInt("user_id", 0)) {
                    int i28 = a;
                    int i29 = i28 & 83;
                    int i30 = (i29 - (~((i28 ^ 83) | i29))) - 1;
                    b = i30 % 128;
                    int i31 = i30 % 2;
                    if (villageExemption.getVillageID() == d2) {
                        int i32 = b + 95;
                        int i33 = i32 % 128;
                        a = i33;
                        boolean z = i32 % 2 == 0;
                        int i34 = i33 & 51;
                        int i35 = -(-(i33 | 51));
                        int i36 = (i34 & i35) + (i34 | i35);
                        b = i36 % 128;
                        if (i36 % 2 != 0) {
                            return z;
                        }
                        throw null;
                    }
                } else {
                    continue;
                }
            }
            int i37 = (i11 ^ 92) + ((i11 & 92) << 1);
            i11 = (i37 & (-91)) + (i37 | (-91));
            int i38 = a;
            i13 = (((i38 | 108) << 1) - (i38 ^ 108)) - 1;
            b = i13 % 128;
        }
    }

    public static void q(Context context, int i2) {
        String string;
        C0104p c0104pC;
        Object obj = null;
        int i3 = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append("App type : v7.6 (LIVE)\n");
        int i4 = a;
        int i5 = i4 & 39;
        int i6 = -(-((i4 ^ 39) | i5));
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        b = i7 % 128;
        if (i7 % 2 == 0) {
            sb.append("User ID : ");
            sb.append(i2);
            obj.hashCode();
            throw null;
        }
        sb.append("User ID : ");
        sb.append(i2);
        int i8 = b;
        int i9 = (i8 & 94) + (i8 | 94);
        int i10 = (i9 ^ (-1)) + (i9 << 1);
        a = i10 % 128;
        int i11 = i10 % 2;
        sb.append("\n");
        String string2 = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(string2);
        int i12 = b;
        int i13 = i12 & 39;
        int i14 = -(-((i12 ^ 39) | i13));
        int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
        a = i15 % 128;
        int i16 = i15 % 2;
        sb2.append("App Version Name : ");
        int i17 = a + 111;
        b = i17 % 128;
        int i18 = i17 % 2;
        sb2.append("7.6");
        sb2.append("\n");
        int i19 = a;
        int i20 = i19 ^ 91;
        int i21 = ((((i19 & 91) | i20) << 1) - (~(-i20))) - 1;
        b = i21 % 128;
        if (i21 % 2 == 0) {
            string = sb2.toString();
            c0104pC = C0104p.c();
            int i22 = 99 / 0;
        } else {
            string = sb2.toString();
            c0104pC = C0104p.c();
        }
        c0104pC.e(context, "App info", string, null, true);
        int i23 = b;
        int i24 = i23 & 95;
        int i25 = i24 + ((i23 ^ 95) | i24);
        a = i25 % 128;
        int i26 = i25 % 2;
    }

    public static String b(String str) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 15;
        int i5 = ((i3 | 15) & (~i4)) + (i4 << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        int iJ = j.j(str, 4, str.length());
        String strSubstring = str.substring(0, iJ);
        StringBuilder sb = new StringBuilder();
        int i7 = b;
        int i8 = (i7 ^ 57) + ((i7 & 57) << 1);
        a = i8 % 128;
        if (i8 % 2 != 0) {
            sb.append(strSubstring.replaceAll("[A-Za-z0-9]", "X"));
            throw null;
        }
        sb.append(strSubstring.replaceAll("[A-Za-z0-9]", "X"));
        int i9 = a;
        int i10 = ((i9 | 33) << 1) - (i9 ^ 33);
        b = i10 % 128;
        int i11 = i10 % 2;
        sb.append(str.substring(iJ));
        if (i11 != 0) {
            return sb.toString();
        }
        int i12 = 54 / 0;
        return sb.toString();
    }

    public static long f(String str) {
        int i2 = 2 % 2;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            try {
                String str2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
                int i3 = (-2) - ((b + 2) ^ (-1));
                a = i3 % 128;
                if (i3 % 2 != 0) {
                    Date date = simpleDateFormat.parse(str2);
                    simpleDateFormat.parse(str);
                    date.getTime();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                long time = simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime();
                long j2 = time / 86400000;
                int i4 = b;
                int i5 = i4 & 13;
                int i6 = (i4 ^ 13) | i5;
                int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
                int i8 = i7 % 128;
                a = i8;
                int i9 = i7 % 2;
                long j3 = (j2 * 24) + ((time % 86400000) / 3600000);
                int i10 = i8 & 119;
                int i11 = ((i8 ^ 119) | i10) << 1;
                int i12 = -((i8 | 119) & (~i10));
                int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
                b = i13 % 128;
                int i14 = i13 % 2;
                return j3;
            } catch (ParseException unused) {
                return 0L;
            }
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public static boolean h(Context context) {
        int i2 = 2 % 2;
        int i3 = a + 65;
        b = i3 % 128;
        Object obj = null;
        try {
            if (i3 % 2 == 0) {
                SharedPreferences sharedPreferences = ah.c.d;
                throw null;
            }
            SharedPreferences sharedPreferences2 = ah.c.d;
            int i4 = b;
            int i5 = i4 ^ 39;
            int i6 = ((((i4 & 39) | i5) << 1) - (~(-i5))) - 1;
            a = i6 % 128;
            int i7 = i6 % 2;
            String string = sharedPreferences2.getString("last_survey_loc_timestamp", BuildConfig.FLAVOR);
            if (!string.equals(BuildConfig.FLAVOR)) {
                Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(z.e());
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                int i8 = b;
                int i9 = i8 & 21;
                int i10 = i9 + ((i8 ^ 21) | i9);
                a = i10 % 128;
                if (i10 % 2 != 0) {
                    date.before(simpleDateFormat.parse(string));
                    obj.hashCode();
                    throw null;
                }
                if (date.before(simpleDateFormat.parse(string))) {
                    C0104p c0104pC = C0104p.c();
                    String string2 = context.getResources().getString(R.string.time_mismatch);
                    DialogInterfaceOnClickListenerC0204j dialogInterfaceOnClickListenerC0204j = new DialogInterfaceOnClickListenerC0204j(context, 6);
                    int i11 = b;
                    int i12 = i11 & 9;
                    int i13 = (i11 | 9) & (~i12);
                    int i14 = -(-(i12 << 1));
                    int i15 = (i13 & i14) + (i13 | i14);
                    a = i15 % 128;
                    int i16 = i15 % 2;
                    c0104pC.e(context, "Time mismatch", string2, dialogInterfaceOnClickListenerC0204j, false);
                    int i17 = a;
                    int i18 = ((i17 | 101) << 1) - (i17 ^ 101);
                    b = i18 % 128;
                    int i19 = i18 % 2;
                    return false;
                }
            }
            int i20 = a;
            int i21 = i20 & 93;
            int i22 = (i20 | 93) & (~i21);
            int i23 = i21 << 1;
            int i24 = (i22 & i23) + (i22 | i23);
            b = i24 % 128;
            if (i24 % 2 != 0) {
                return true;
            }
            obj.hashCode();
            throw null;
        } catch (ParseException unused) {
            return true;
        }
    }

    public static String k(String str) {
        int i2 = 2 % 2;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yy hh.mm.ss.SSS aa");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MM-yyyy");
        int i3 = a;
        int i4 = (i3 & 21) + (i3 | 21);
        b = i4 % 128;
        try {
            if (i4 % 2 == 0) {
                simpleDateFormat2.format(simpleDateFormat.parse(str));
                throw null;
            }
            simpleDateFormat2.format(simpleDateFormat.parse(str));
            int i5 = a;
            int i6 = (-2) - (((i5 ^ 90) + ((i5 & 90) << 1)) ^ (-1));
            b = i6 % 128;
            int i7 = i6 % 2;
            int i8 = b;
            int i9 = i8 & 45;
            int i10 = ((i8 | 45) & (~i9)) + (i9 << 1);
            a = i10 % 128;
            int i11 = i10 % 2;
            return str;
        } catch (ParseException unused) {
        }
    }

    public static double m(double d2, int i2) {
        int i3 = 2 % 2;
        int i4 = a + 117;
        b = i4 % 128;
        int i5 = i4 % 2;
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        BigDecimal scale = new BigDecimal(d2).setScale(i2, RoundingMode.HALF_UP);
        int i6 = b + 31;
        a = i6 % 128;
        if (i6 % 2 != 0) {
            scale.doubleValue();
            throw null;
        }
        double dDoubleValue = scale.doubleValue();
        int i7 = a;
        int i8 = i7 ^ 51;
        int i9 = ((i7 & 51) | i8) << 1;
        int i10 = -i8;
        int i11 = (i9 ^ i10) + ((i9 & i10) << 1);
        b = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 27 / 0;
        }
        return dDoubleValue;
    }

    public static String l(T t2) {
        int i2 = 2 % 2;
        try {
            JSONObject jSONObject = new JSONObject(new String(t2.a.d, "utf-8"));
            int i3 = b;
            int i4 = i3 & 83;
            int i5 = ((i3 | 83) & (~i4)) + (i4 << 1);
            a = i5 % 128;
            int i6 = i5 % 2;
            String string = jSONObject.getString("message");
            int i7 = b;
            int i8 = (i7 & 22) + (i7 | 22);
            int i9 = (i8 ^ (-1)) + (i8 << 1);
            a = i9 % 128;
            int i10 = i9 % 2;
            return string;
        } catch (UnsupportedEncodingException | JSONException unused) {
            byte[] bArr = t2.a.d;
            if (bArr != null) {
                try {
                    String str = new String(bArr, "UTF-8");
                    int i11 = b;
                    int i12 = ((i11 | 63) << 1) - (i11 ^ 63);
                    a = i12 % 128;
                    int i13 = i12 % 2;
                    return str;
                } catch (UnsupportedEncodingException unused2) {
                    int i14 = a;
                    int i15 = (i14 & (-32)) | ((~i14) & 31);
                    int i16 = (i14 & 31) << 1;
                    int i17 = (i15 & i16) + (i16 | i15);
                    b = i17 % 128;
                    int i18 = i17 % 2;
                    return "Exception";
                }
            }
            int i19 = a;
            int i110 = (i19 & (-32)) | ((~i19) & 31);
            int i111 = (i19 & 31) << 1;
            int i112 = (i110 & i111) + (i111 | i110);
            b = i112 % 128;
            int i113 = i112 % 2;
            return "Exception";
        }
    }

    public static double c(int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = b;
        int i7 = ((i6 ^ 82) + ((i6 & 82) << 1)) - 1;
        a = i7 % 128;
        int i8 = i7 % 2;
        Date dateH = z.h(j.l(i2, "-", i3, "-", i4), "dd-MM-yyyy");
        Date date = new Date();
        GregorianCalendar gregorianCalendarY = j.y(dateH);
        int i9 = a + 89;
        b = i9 % 128;
        int i10 = i9 % 2;
        GregorianCalendar gregorianCalendarY2 = j.y(date);
        int i11 = gregorianCalendarY2.get(1);
        int i12 = -gregorianCalendarY.get(1);
        int i13 = (i11 & i12) + (i11 | i12);
        int i14 = a;
        int i15 = (-2) - (((i14 ^ 26) + ((i14 & 26) << 1)) ^ (-1));
        int i16 = i15 % 128;
        b = i16;
        int i17 = i15 % 2;
        if (i13 > 115) {
            int i18 = (((i16 & (-96)) | ((~i16) & 95)) - (~(-(-((i16 & 95) << 1))))) - 1;
            int i19 = i18 % 128;
            a = i19;
            int i20 = i18 % 2;
            double d2 = i13;
            int i21 = (i19 ^ 37) + ((i19 & 37) << 1);
            b = i21 % 128;
            int i22 = i21 % 2;
            return d2;
        }
        int i23 = gregorianCalendarY2.get(2);
        if ((i23 & 1) + (i23 | 1) < gregorianCalendarY.get(2) + 1) {
            int i24 = b;
            int i25 = i24 & 29;
            int i26 = -(-((i24 ^ 29) | i25));
            int i27 = (i25 & i26) + (i26 | i25);
            a = i27 % 128;
            int i28 = i27 % 2;
            gregorianCalendarY.get(2);
            gregorianCalendarY2.get(2);
            int i29 = ((i13 & (-116)) + (i13 | (-116))) - 1;
            i13 = ((i29 & (-117)) | ((~i29) & 116)) + ((i29 & 116) << 1);
            int i30 = a;
            int i31 = i30 & 87;
            int i32 = i31 + ((i30 ^ 87) | i31);
            b = i32 % 128;
            int i33 = i32 % 2;
        } else {
            gregorianCalendarY2.get(2);
            gregorianCalendarY.get(2);
            int i34 = a;
            int i35 = ((i34 & 92) + (i34 | 92)) - 1;
            b = i35 % 128;
            int i36 = i35 % 2;
        }
        double d3 = i13;
        int i37 = b;
        int i38 = (i37 | 115) << 1;
        int i39 = -((115 & (~i37)) | (i37 & (-116)));
        int i40 = (i38 & i39) + (i39 | i38);
        a = i40 % 128;
        int i41 = i40 % 2;
        return d3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d0, code lost:
    
        if (r14 != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d3, code lost:
    
        if (r14 != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d5, code lost:
    
        r14 = (r13 & (-112)) | ((~r13) & 111);
        r3 = (r13 & 111) << 1;
        r7 = (r14 & r3) + (r14 | r3);
        ivas.gov.bisp.enumeration.bK.ag.b = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e7, code lost:
    
        if ((r7 % 2) != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00eb, code lost:
    
        if (r1 <= 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f0, code lost:
    
        if (r1 <= 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f2, code lost:
    
        r14 = ((r13 & 77) - (~(r13 | 77))) - 1;
        ivas.gov.bisp.enumeration.bK.ag.b = r14 % 128;
        r14 = r14 % 2;
        r14 = ((r13 ^ 66) + ((r13 & 66) << 1)) - 1;
        ivas.gov.bisp.enumeration.bK.ag.b = r14 % 128;
        r14 = r14 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x010b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x010c, code lost:
    
        r14 = ((r13 ^ 31) | (r13 & 31)) << 1;
        r13 = -(((~r13) & 31) | (r13 & (-32)));
        r1 = (r14 ^ r13) + ((r13 & r14) << 1);
        ivas.gov.bisp.enumeration.bK.ag.b = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0123, code lost:
    
        if ((r1 % 2) == 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0125, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0126, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0129, code lost:
    
        if (r9 < 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x012b, code lost:
    
        r14 = (r13 ^ 119) + ((r13 & 119) << 1);
        r13 = r14 % 128;
        ivas.gov.bisp.enumeration.bK.ag.b = r13;
        r14 = r14 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0138, code lost:
    
        if (r7 <= 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x013a, code lost:
    
        r14 = r13 & 43;
        r1 = (~r14) & (r13 | 43);
        r14 = r14 << 1;
        r2 = ((r1 | r14) << 1) - (r14 ^ r1);
        ivas.gov.bisp.enumeration.bK.ag.a = r2 % 128;
        r2 = r2 % 2;
        r14 = r13 ^ 75;
        r13 = (((r13 & 75) | r14) << 1) - r14;
        ivas.gov.bisp.enumeration.bK.ag.a = r13 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0157, code lost:
    
        if ((r13 % 2) == 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0159, code lost:
    
        r13 = 16 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x015c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x015d, code lost:
    
        r13 = ivas.gov.bisp.enumeration.bK.ag.b;
        r14 = ((r13 | 51) << 1) - (r13 ^ 51);
        ivas.gov.bisp.enumeration.bK.ag.a = r14 % 128;
        r14 = r14 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x016a, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean g(java.lang.String r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.bK.ag.g(java.lang.String, boolean):boolean");
    }

    public static void o(List<VillageExemption> list) {
        n nVarW;
        int i2 = 2 % 2;
        C c2 = new C0145s().c();
        int i3 = b;
        int i4 = ((i3 ^ 78) + ((i3 & 78) << 1)) - 1;
        a = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (list == null) {
            nVarW = Y.c;
            int i5 = a;
            int i6 = (i5 & 83) + (i5 | 83);
            b = i6 % 128;
            int i7 = i6 % 2;
        } else {
            Class<?> cls = list.getClass();
            i iVar = new i();
            int i8 = a + 57;
            b = i8 % 128;
            int i9 = i8 % 2;
            c2.e(list, cls, iVar);
            nVarW = iVar.w();
            int i10 = a;
            int i11 = (i10 ^ 81) + ((i10 & 81) << 1);
            b = i11 % 128;
            if (i11 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
        }
        W wC = nVarW.c();
        ah ahVar = ah.c;
        String string = wC.toString();
        int i12 = a;
        int i13 = ((i12 | 65) << 1) - (i12 ^ 65);
        b = i13 % 128;
        int i14 = i13 % 2;
        ahVar.e.putString("super_exemptions", string);
        SharedPreferences.Editor editor = ahVar.e;
        int i15 = b;
        int i16 = (i15 & (-100)) | ((~i15) & 99);
        int i17 = (i15 & 99) << 1;
        int i18 = (i16 & i17) + (i17 | i16);
        a = i18 % 128;
        if (i18 % 2 != 0) {
            editor.commit();
            throw null;
        }
        editor.commit();
        int i19 = b;
        int i20 = ((i19 ^ 39) | (i19 & 39)) << 1;
        int i21 = -(((~i19) & 39) | (i19 & (-40)));
        int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
        a = i22 % 128;
        int i23 = i22 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:259:0x0718 A[Catch: Exception -> 0x074e, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x074e, blocks: (B:252:0x06e3, B:262:0x0727, B:259:0x0718), top: B:283:0x06e3, outer: #6 }] */
    /* JADX WARN: Code duplicated, block: B:261:0x071f  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        if (r8 == 400) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static ivas.gov.bisp.enumeration.models.ResponseMessage e(ivas.gov.bisp.enumeration.p022av.T r11) {
        /*
            Method dump skipped, instruction units count: 1983
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.bK.ag.e(ivas.gov.bisp.enumeration.av.T):ivas.gov.bisp.enumeration.models.ResponseMessage");
    }

    public static void n(SurveyTimeLimits surveyTimeLimits) {
        ah ahVar;
        int isTimeableScreen;
        SharedPreferences.Editor editor;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 25;
        int i5 = (i3 ^ 25) | i4;
        int i6 = (i4 & i5) + (i5 | i4);
        b = i6 % 128;
        Object obj = null;
        if (i6 % 2 == 0) {
            ah ahVar2 = ah.c;
            ahVar2.e.putInt("contact_time", surveyTimeLimits.getContactTime());
            ahVar2.e.commit();
            ah ahVar3 = ah.c;
            obj.hashCode();
            throw null;
        }
        ah ahVar4 = ah.c;
        ahVar4.e.putInt("contact_time", surveyTimeLimits.getContactTime());
        ahVar4.e.commit();
        ah ahVar5 = ah.c;
        ahVar5.e.putInt("roster_time", surveyTimeLimits.getRosterTime());
        ahVar5.e.commit();
        ah ahVar6 = ah.c;
        int i7 = a;
        int i8 = ((i7 & 40) + (i7 | 40)) - 1;
        b = i8 % 128;
        int i9 = i8 % 2;
        ahVar6.e.putInt("asset_time", surveyTimeLimits.getAssetsTime());
        ahVar6.e.commit();
        ah ahVar7 = ah.c;
        int i10 = b + 59;
        a = i10 % 128;
        if (i10 % 2 != 0) {
            ahVar7.e.putInt("mis_time", surveyTimeLimits.getMiscleanousTime());
            ahVar7.e.commit();
            ah ahVar8 = ah.c;
            surveyTimeLimits.getAgriTime();
            obj.hashCode();
            throw null;
        }
        ahVar7.e.putInt("mis_time", surveyTimeLimits.getMiscleanousTime());
        ahVar7.e.commit();
        ah ahVar9 = ah.c;
        ahVar9.e.putInt("agri_time", surveyTimeLimits.getAgriTime());
        ahVar9.e.commit();
        ah ahVar10 = ah.c;
        int houseHoldComposition = surveyTimeLimits.getHouseHoldComposition();
        int i11 = a;
        int i12 = i11 & 15;
        int i13 = (((i11 ^ 15) | i12) << 1) - ((i11 | 15) & (~i12));
        b = i13 % 128;
        int i14 = i13 % 2;
        ahVar10.e.putInt("hh_composition_time", houseHoldComposition);
        ahVar10.e.commit();
        ah ahVar11 = ah.c;
        int familyTree = surveyTimeLimits.getFamilyTree();
        int i15 = b;
        int i16 = i15 & 19;
        int i17 = ((i15 ^ 19) | i16) << 1;
        int i18 = -((i15 | 19) & (~i16));
        int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
        a = i19 % 128;
        if (i19 % 2 != 0) {
            ahVar11.e.putInt("family_tree_time", familyTree);
            ahVar11.e.commit();
            ahVar = ah.c;
            isTimeableScreen = surveyTimeLimits.getIsTimeableScreen();
            editor = ahVar.e;
            int i20 = 80 / 0;
        } else {
            ahVar11.e.putInt("family_tree_time", familyTree);
            ahVar11.e.commit();
            ahVar = ah.c;
            isTimeableScreen = surveyTimeLimits.getIsTimeableScreen();
            editor = ahVar.e;
        }
        int i21 = b;
        int i22 = ((((i21 ^ 1) | (i21 & 1)) << 1) - (~(-(((~i21) & 1) | (i21 & (-2)))))) - 1;
        a = i22 % 128;
        if (i22 % 2 == 0) {
            editor.putInt("IsTimeableScreen", isTimeableScreen);
            ahVar.e.commit();
        } else {
            editor.putInt("IsTimeableScreen", isTimeableScreen);
            ahVar.e.commit();
            int i23 = 21 / 0;
        }
    }

    public static void d(String str, String str2, String str3, int i2, String str4, String str5, String str6, String str7, int i3, int i4, int i5, String str8) {
        String lowerCase;
        int i6;
        int i7 = 2 % 2;
        Batch batch = new Batch();
        batch.setTimeStampEnumerator(str);
        batch.setTimeStampSupervisor(str2);
        int i8 = a;
        int i9 = ((i8 & 124) + (i8 | 124)) - 1;
        b = i9 % 128;
        int i10 = i9 % 2;
        batch.setName(str3);
        batch.setEnumeratorId(i2);
        int i11 = ah.c.d.getInt("firm_id", 0);
        int i12 = a;
        int i13 = ((i12 | 75) << 1) - (i12 ^ 75);
        b = i13 % 128;
        if (i13 % 2 == 0) {
            batch.setFirmId(i11);
            batch.setEnumeratorName(str4);
            lowerCase = str5.toLowerCase();
            int i14 = 3 / 0;
        } else {
            batch.setFirmId(i11);
            batch.setEnumeratorName(str4);
            lowerCase = str5.toLowerCase();
        }
        int i15 = a;
        int i16 = i15 & 75;
        int i17 = -(-((i15 ^ 75) | i16));
        int i18 = (i16 & i17) + (i17 | i16);
        b = i18 % 128;
        if (i18 % 2 == 0) {
            batch.setEnumeratorImei(lowerCase);
            batch.setEnumeratorCnic(str6);
            batch.setEnumeratorPhone(str7);
            int i19 = 70 / 0;
        } else {
            batch.setEnumeratorImei(lowerCase);
            batch.setEnumeratorCnic(str6);
            batch.setEnumeratorPhone(str7);
        }
        batch.setTotalCount(i3);
        batch.setTotalContinueCount(i4);
        batch.setEnum_app_version(i5);
        int i20 = a;
        int i21 = i20 & 79;
        int i22 = -(-(i20 | 79));
        int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
        b = i23 % 128;
        if (i23 % 2 == 0) {
            batch.setEnum_app_version_name(str8);
            i6 = ah.c.d.getInt("app_version", 1);
        } else {
            batch.setEnum_app_version_name(str8);
            i6 = ah.c.d.getInt("app_version", 0);
        }
        int i24 = a;
        int i25 = i24 & 67;
        int i26 = (((i24 | 67) & (~i25)) - (~(-(-(i25 << 1))))) - 1;
        b = i26 % 128;
        if (i26 % 2 == 0) {
            batch.setServer_app_version(i6);
        } else {
            batch.setServer_app_version(i6);
        }
        batch.setIsMarked(1);
        batch.setIsMarkedForCnic(1);
        batch.setIsMarkedForNH(1);
        batch.setBatchDetail("recovered");
        batch.save();
        int i27 = a;
        int i28 = i27 & 51;
        int i29 = -(-((i27 ^ 51) | i28));
        int i30 = (i28 & i29) + (i29 | i28);
        b = i30 % 128;
        if (i30 % 2 == 0) {
            int i31 = 75 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:83:0x01dd A[Catch: Exception -> 0x0272, ParseException -> 0x0275, TRY_LEAVE, TryCatch #2 {ParseException -> 0x0275, blocks: (B:30:0x00a9, B:32:0x00c5, B:36:0x00e4, B:41:0x0106, B:44:0x011c, B:46:0x012b, B:53:0x0147, B:57:0x015c, B:58:0x015f, B:63:0x0174, B:68:0x0195, B:70:0x01af, B:73:0x01c9, B:75:0x01d0, B:92:0x0221, B:98:0x0248, B:83:0x01dd, B:87:0x01fe, B:88:0x0201, B:90:0x020f, B:89:0x020a, B:81:0x01d7, B:64:0x0178, B:66:0x0180, B:51:0x0131, B:38:0x00f5), top: B:112:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:89:0x020a A[Catch: Exception -> 0x0272, ParseException -> 0x0275, TryCatch #2 {ParseException -> 0x0275, blocks: (B:30:0x00a9, B:32:0x00c5, B:36:0x00e4, B:41:0x0106, B:44:0x011c, B:46:0x012b, B:53:0x0147, B:57:0x015c, B:58:0x015f, B:63:0x0174, B:68:0x0195, B:70:0x01af, B:73:0x01c9, B:75:0x01d0, B:92:0x0221, B:98:0x0248, B:83:0x01dd, B:87:0x01fe, B:88:0x0201, B:90:0x020f, B:89:0x020a, B:81:0x01d7, B:64:0x0178, B:66:0x0180, B:51:0x0131, B:38:0x00f5), top: B:112:0x00a9 }] */
    public static boolean i(String str, String str2, String str3, boolean z) {
        String[] strArrSplit;
        String str4;
        SimpleDateFormat simpleDateFormat;
        Date date;
        Calendar calendar;
        Calendar calendar2;
        int i2;
        String str5 = str3;
        int i3 = 2 % 2;
        boolean z2 = z;
        while (true) {
            try {
                try {
                    String[] strArrSplit2 = str2.split(":");
                    int i4 = b + 23;
                    a = i4 % 128;
                    if (i4 % 2 != 0) {
                        strArrSplit = str5.split(":");
                        str4 = strArrSplit2[0];
                    } else {
                        strArrSplit = str5.split(":");
                        str4 = strArrSplit2[0];
                    }
                    int i5 = Integer.parseInt(str4);
                    int i6 = b;
                    int i7 = (i6 ^ 43) + ((i6 & 43) << 1);
                    a = i7 % 128;
                    int i8 = Integer.parseInt(i7 % 2 != 0 ? strArrSplit2[1] : strArrSplit2[1]);
                    int i9 = a;
                    int i10 = (i9 ^ 61) + ((i9 & 61) << 1);
                    b = i10 % 128;
                    int i11 = Integer.parseInt(i10 % 2 == 0 ? strArrSplit[0] : strArrSplit[0]);
                    int i12 = Integer.parseInt(strArrSplit[1]);
                    if (z2) {
                        simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS", Locale.ENGLISH);
                        int i13 = b;
                        int i14 = i13 | 37;
                        int i15 = i14 << 1;
                        int i16 = -((~(i13 & 37)) & i14);
                        int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
                        a = i17 % 128;
                        int i18 = i17 % 2;
                    } else {
                        simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss aa");
                        int i19 = b;
                        int i20 = i19 & 93;
                        int i21 = -(-((i19 ^ 93) | i20));
                        int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
                        a = i22 % 128;
                        int i23 = i22 % 2;
                    }
                    Calendar calendar3 = Calendar.getInstance();
                    try {
                        Date date2 = simpleDateFormat.parse(str);
                        int i24 = b;
                        int i25 = i24 & 31;
                        int i26 = ((i24 ^ 31) | i25) << 1;
                        int i27 = -((~i25) & (i24 | 31));
                        int i28 = (i26 & i27) + (i27 | i26);
                        a = i28 % 128;
                        int i29 = i28 % 2;
                        calendar3.set(10, i11);
                        if (i12 == 0) {
                            int i30 = b;
                            int i31 = i30 & 33;
                            int i32 = (i30 | 33) & (~i31);
                            int i33 = -(-(i31 << 1));
                            int i34 = ((i32 | i33) << 1) - (i32 ^ i33);
                            a = i34 % 128;
                            int i35 = i34 % 2;
                            calendar3.set(12, 0);
                            int i36 = a;
                            int i37 = (i36 ^ 97) + ((i36 & 97) << 1);
                            b = i37 % 128;
                            int i38 = i37 % 2;
                        } else {
                            calendar3.set(12, i12);
                            int i39 = (-2) - ((b + 118) ^ (-1));
                            a = i39 % 128;
                            int i40 = i39 % 2;
                        }
                        calendar3.set(9, 1);
                        Date time = calendar3.getTime();
                        int i41 = b;
                        int i42 = i41 & 15;
                        int i43 = i42 + ((i41 ^ 15) | i42);
                        a = i43 % 128;
                        if (i43 % 2 != 0) {
                            date = simpleDateFormat.parse(simpleDateFormat.format(time));
                            calendar = Calendar.getInstance();
                            int i44 = 1 / 0;
                        } else {
                            date = simpleDateFormat.parse(simpleDateFormat.format(time));
                            calendar = Calendar.getInstance();
                        }
                        int i45 = a + 77;
                        b = i45 % 128;
                        int i46 = i45 % 2;
                        if (date2.after(date)) {
                            int i47 = b;
                            int i48 = (i47 ^ 21) + ((i47 & 21) << 1);
                            a = i48 % 128;
                            int i49 = i48 % 2;
                            calendar.add(5, 1);
                        }
                        calendar.set(10, i5);
                        if (i8 == 0) {
                            int i50 = a + 41;
                            b = i50 % 128;
                            if (i50 % 2 == 0) {
                                calendar.set(81, 0);
                            } else {
                                calendar.set(12, 0);
                            }
                        } else {
                            calendar.set(12, i8);
                            int i51 = a;
                            int i52 = ((i51 & 119) - (~(-(-(i51 | 119))))) - 1;
                            b = i52 % 128;
                            int i53 = i52 % 2;
                        }
                        calendar.set(9, 0);
                        Date time2 = calendar.getTime();
                        int i54 = b;
                        int i55 = i54 & 97;
                        int i56 = -(-((i54 ^ 97) | i55));
                        int i57 = (i55 ^ i56) + ((i56 & i55) << 1);
                        a = i57 % 128;
                        int i58 = i57 % 2;
                        Date date3 = simpleDateFormat.parse(simpleDateFormat.format(time2));
                        int i59 = a;
                        int i60 = i59 & 117;
                        int i61 = ((i59 | 117) & (~i60)) + (i60 << 1);
                        b = i61 % 128;
                        if (i61 % 2 == 0) {
                            int i62 = 50 / 0;
                            if (date2.before(date3)) {
                                calendar2 = Calendar.getInstance();
                                calendar2.setTime(date);
                                int i63 = b;
                                int i64 = i63 & 53;
                                int i65 = ((i63 ^ 53) | i64) << 1;
                                int i66 = -((i63 | 53) & (~i64));
                                i2 = (i65 ^ i66) + ((i66 & i65) << 1);
                                a = i2 % 128;
                                if (i2 % 2 != 0) {
                                    calendar2.add(2, -1);
                                } else {
                                    calendar2.add(5, -1);
                                }
                                date = simpleDateFormat.parse(simpleDateFormat.format(calendar2.getTime()));
                                int i67 = b;
                                int i68 = i67 ^ 7;
                                int i69 = (((i67 & 7) | i68) << 1) - i68;
                                a = i69 % 128;
                                int i70 = i69 % 2;
                            }
                        } else if (date2.before(date3)) {
                            calendar2 = Calendar.getInstance();
                            calendar2.setTime(date);
                            int i610 = b;
                            int i611 = i610 & 53;
                            int i612 = ((i610 ^ 53) | i611) << 1;
                            int i613 = -((i610 | 53) & (~i611));
                            i2 = (i612 ^ i613) + ((i613 & i612) << 1);
                            a = i2 % 128;
                            if (i2 % 2 != 0) {
                                calendar2.add(2, -1);
                            } else {
                                calendar2.add(5, -1);
                            }
                            date = simpleDateFormat.parse(simpleDateFormat.format(calendar2.getTime()));
                            int i614 = b;
                            int i615 = i614 ^ 7;
                            int i616 = (((i614 & 7) | i615) << 1) - i615;
                            a = i616 % 128;
                            int i71 = i616 % 2;
                        }
                        if (date2.after(date)) {
                            int i72 = a;
                            int i73 = i72 & 19;
                            int i74 = (i73 - (~((i72 ^ 19) | i73))) - 1;
                            int i75 = i74 % 128;
                            b = i75;
                            int i76 = i74 % 2;
                            int i77 = (-2) - ((i75 + 42) ^ (-1));
                            a = i77 % 128;
                            if (i77 % 2 != 0) {
                                int i78 = 89 / 0;
                            }
                            return true;
                        }
                        if (!date2.before(date3)) {
                            int i79 = a;
                            int i80 = (-2) - ((-1) ^ ((i79 & 122) + (i79 | 122)));
                            b = i80 % 128;
                            int i81 = i80 % 2;
                            return false;
                        }
                        int i82 = b;
                        int i83 = i82 & 43;
                        int i84 = (i82 ^ 43) | i83;
                        int i85 = (i83 ^ i84) + ((i84 & i83) << 1);
                        a = i85 % 128;
                        int i86 = i85 % 2;
                        return true;
                    } catch (ParseException unused) {
                        continue;
                    }
                } catch (Exception unused2) {
                    return true;
                }
            } catch (ParseException unused3) {
            }
            z2 = true;
        }
    }

    public static void p(User user) {
        int i2 = 2 % 2;
        SugarRecord.deleteAll(PersonInfo.class);
        new PersonInfo(user.getUsername(), user.getPhone(), user.getCnic()).save();
        ah ahVar = ah.c;
        ahVar.e.putInt("firm_id", user.getFirmId());
        ahVar.e.commit();
        ah ahVar2 = ah.c;
        ahVar2.e.putString("survey_limit_total", user.getSurveyLimitTotal());
        ahVar2.e.commit();
        ah ahVar3 = ah.c;
        StringBuilder sb = new StringBuilder();
        String firstName = user.getFirstName();
        int i3 = (-2) - ((a + 8) ^ (-1));
        b = i3 % 128;
        int i4 = i3 % 2;
        sb.append(firstName);
        sb.append(" ");
        sb.append(user.getLastName());
        ahVar3.e.putString("full_name", sb.toString());
        ahVar3.e.commit();
        ah ahVar4 = ah.c;
        int i5 = b;
        int i6 = (i5 & (-88)) | ((~i5) & 87);
        int i7 = (i5 & 87) << 1;
        int i8 = (i6 & i7) + (i7 | i6);
        a = i8 % 128;
        int i9 = i8 % 2;
        ahVar4.e.putString("user_cnic", user.getCnic());
        ahVar4.e.commit();
        ah ahVar5 = ah.c;
        ahVar5.e.putString("user_name", user.getUsername());
        SharedPreferences.Editor editor = ahVar5.e;
        int i10 = b + 13;
        a = i10 % 128;
        int i11 = i10 % 2;
        editor.commit();
        ah ahVar6 = ah.c;
        ahVar6.e.putInt("shouldValidate", user.getIsValidate());
        ahVar6.e.commit();
        ah ahVar7 = ah.c;
        int supervisorId = user.getSupervisorId();
        SharedPreferences.Editor editor2 = ahVar7.e;
        int i12 = a + 123;
        b = i12 % 128;
        int i13 = i12 % 2;
        editor2.putInt("supervisorID", supervisorId);
        ahVar7.e.commit();
        ah ahVar8 = ah.c;
        ahVar8.e.putString("imei_mac", user.getImeiMac());
        ahVar8.e.commit();
        ah ahVar9 = ah.c;
        int i14 = b;
        int i15 = i14 & 61;
        int i16 = (i14 | 61) & (~i15);
        int i17 = -(-(i15 << 1));
        int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
        a = i18 % 128;
        int i19 = i18 % 2;
        ahVar9.e.putInt("reset_enum_surveys", user.getRecover());
        ahVar9.e.commit();
        ah ahVar10 = ah.c;
        ahVar10.e.putInt("recover_batch", user.getBatchRecover());
        SharedPreferences.Editor editor3 = ahVar10.e;
        int i20 = b;
        int i21 = i20 & 117;
        int i22 = (i20 ^ 117) | i21;
        int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
        a = i23 % 128;
        int i24 = i23 % 2;
        editor3.commit();
        ah ahVar11 = ah.c;
        ahVar11.e.putInt("is_sms_activated", user.getIsSmsActivated());
        ahVar11.e.commit();
        if (user.getUserRoleId() == 4) {
            int i25 = b;
            int i26 = i25 ^ 53;
            int i27 = (((i25 & 53) | i26) << 1) - i26;
            a = i27 % 128;
            int i28 = i27 % 2;
            ah ahVar12 = ah.c;
            ahVar12.e.putInt("userType", 1);
            ahVar12.e.commit();
            int i29 = a;
            int i30 = ((i29 ^ 72) + ((i29 & 72) << 1)) - 1;
            b = i30 % 128;
            int i31 = i30 % 2;
            return;
        }
        if (user.getUserRoleId() == 3) {
            int i32 = b + 107;
            a = i32 % 128;
            int i33 = i32 % 2;
            ah ahVar13 = ah.c;
            ahVar13.e.putInt("userType", 0);
            int i34 = a + 11;
            b = i34 % 128;
            if (i34 % 2 != 0) {
                ahVar13.e.commit();
                return;
            }
            ahVar13.e.commit();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (user.getUserRoleId() == 5) {
            int i35 = b + 105;
            a = i35 % 128;
            int i36 = i35 % 2;
            ah ahVar14 = ah.c;
            ahVar14.e.putInt("userType", 2);
            ahVar14.e.commit();
            int i37 = a;
            int i38 = ((i37 & (-124)) | ((~i37) & 123)) + ((i37 & 123) << 1);
            b = i38 % 128;
            int i39 = i38 % 2;
        }
        int i40 = a;
        int i41 = i40 & 39;
        int i42 = ((i40 | 39) & (~i41)) + (i41 << 1);
        b = i42 % 128;
        if (i42 % 2 == 0) {
            int i43 = 64 / 0;
        }
    }
}
