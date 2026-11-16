package ivas.gov.bisp.enumeration.p024ax;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.appcompat.app.AppCompatActivity;
import ivas.gov.bisp.enumeration.BISPApplication;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.o0ooOO0.o00Ooo;
import ivas.gov.bisp.enumeration.p022av.C0094m;
import ivas.gov.bisp.enumeration.p022av.T;
import ivas.gov.bisp.enumeration.p022av.z;
import ivas.gov.bisp.enumeration.p023aw.C0098p;
import ivas.gov.bisp.enumeration.p023aw.a;
import ivas.gov.bisp.enumeration.p091n.j;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class ax {
    private static int a = 0;
    private static int b = 1;

    public class bvb implements o00Ooo.OooO0O0<JSONObject> {
        private static int a = 1;
        private static int b;
        public final /* synthetic */ I c;

        public bvb(I i) {
            this.c = i;
        }

        public void b(Object obj) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & 89) + (i2 | 89);
            b = i3 % 128;
            if (i3 % 2 == 0) {
                this.c.onSuccess((JSONObject) obj);
            } else {
                this.c.onSuccess((JSONObject) obj);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }
    }

    public class bvc implements DialogInterface.OnClickListener {
        private static int a = 1;
        private static int b;

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = i3 & 7;
            int i5 = (i3 ^ 7) | i4;
            int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
            b = i6 % 128;
            int i7 = i6 % 2;
            dialogInterface.dismiss();
            int i8 = a;
            int i9 = i8 & 119;
            int i10 = (((i8 ^ 119) | i9) << 1) - ((i8 | 119) & (~i9));
            b = i10 % 128;
            int i11 = i10 % 2;
        }
    }

    public class bvd implements DialogInterface.OnClickListener {
        private static int a = 0;
        private static int b = 1;
        public final /* synthetic */ AppCompatActivity c;

        public bvd(AppCompatActivity appCompatActivity) {
            this.c = appCompatActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = i3 & 9;
            int i5 = -(-((i3 ^ 9) | i4));
            int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
            b = i6 % 128;
            int i7 = i6 % 2;
            dialogInterface.dismiss();
            this.c.finish();
            int i8 = a + 20;
            int i9 = (i8 ^ (-1)) + (i8 << 1);
            b = i9 % 128;
            if (i9 % 2 == 0) {
                throw null;
            }
        }
    }

    public class bvf extends C0098p {
        private static int a = 1;
        private static int b;
        public final /* synthetic */ Activity t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public bvf(int i, String str, JSONObject jSONObject, C0094m.bar barVar, C0094m.bas basVar, Activity activity) {
            super(i, str, jSONObject, barVar, basVar);
            this.t = activity;
        }

        public Map<String, String> i() {
            int i = 2 % 2;
            HashMap map = new HashMap();
            StringBuilder sbW = j.w("Bearer ");
            SessionManager sessionManager = new SessionManager(this.t);
            int i2 = b;
            int i3 = (i2 & 61) + (i2 | 61);
            a = i3 % 128;
            int i4 = i3 % 2;
            j.z(sessionManager, sbW, map, "Authorization");
            int i5 = b + 95;
            a = i5 % 128;
            int i6 = i5 % 2;
            return map;
        }
    }

    public class bvh implements C0094m.bas {
        private static int a = 0;
        private static int b = 1;
        public final /* synthetic */ aE c;

        public bvh(aE aEVar) {
            this.c = aEVar;
        }

        @Override // ivas.gov.bisp.enumeration.p022av.C0094m.bas
        public void b(T t) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & (-66)) | ((~i2) & 65);
            int i4 = (i2 & 65) << 1;
            int i5 = (i3 & i4) + (i4 | i3);
            b = i5 % 128;
            if (i5 % 2 != 0) {
                this.c.onError(ag.e(t));
            } else {
                this.c.onError(ag.e(t));
                throw null;
            }
        }
    }

    public class bvi extends C0098p {
        private static int a = 0;
        private static int b = 1;
        public final /* synthetic */ Context t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public bvi(int i, String str, JSONObject jSONObject, C0094m.bar barVar, C0094m.bas basVar, Context context) {
            super(i, str, jSONObject, barVar, basVar);
            this.t = context;
        }

        public Map<String, String> i() {
            int i = 2 % 2;
            HashMap map = new HashMap();
            StringBuilder sbW = j.w("Bearer ");
            SessionManager sessionManager = new SessionManager(this.t);
            int i2 = a;
            int i3 = (((i2 ^ 97) | (i2 & 97)) << 1) - (((~i2) & 97) | (i2 & (-98)));
            b = i3 % 128;
            if (i3 % 2 == 0) {
                j.z(sessionManager, sbW, map, "Authorization");
                int i4 = 52 / 0;
            } else {
                j.z(sessionManager, sbW, map, "Authorization");
            }
            return map;
        }
    }

    public static void e(JSONObject jSONObject, Activity activity, String str, I i) {
        int i2 = 2 % 2;
        try {
            bvf bvfVar = new bvf(1, str, jSONObject, new bvb(i), new bve(i), activity);
            z zVar = new z(130000, 0, 0.0f);
            int i3 = a;
            int i4 = i3 & 57;
            int i5 = (i3 ^ 57) | i4;
            int i6 = (i4 & i5) + (i5 | i4);
            b = i6 % 128;
            int i7 = i6 % 2;
            bvfVar.m = zVar;
            bvfVar.k = false;
            int i8 = a;
            int i9 = i8 & 35;
            int i10 = ((i8 ^ 35) | i9) << 1;
            int i11 = -((i8 | 35) & (~i9));
            int i12 = (i10 & i11) + (i11 | i10);
            b = i12 % 128;
            int i13 = i12 % 2;
            a.b(activity).c(bvfVar);
            int i14 = b + 35;
            a = i14 % 128;
            int i15 = i14 % 2;
        } catch (Exception e) {
            i.onError(new ResponseMessage(0, e.getMessage(), false));
        }
    }

    public static void h(ProgressDialog progressDialog, String str) {
        int i = 2 % 2;
        int i2 = b + 125;
        a = i2 % 128;
        int i3 = i2 % 2;
        try {
            progressDialog.setCancelable(false);
            progressDialog.setTitle(str);
            int i4 = a;
            int i5 = i4 & 3;
            int i6 = (i4 ^ 3) | i5;
            int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
            b = i7 % 128;
            if (i7 % 2 == 0) {
                progressDialog.setMessage("Please Wait...");
            } else {
                progressDialog.setMessage("Please Wait...");
            }
            progressDialog.setIndeterminate(true);
            progressDialog.show();
        } catch (Exception unused) {
        }
    }

    public class bvg implements o00Ooo.OooO0O0<JSONObject> {
        private static int a = 1;
        private static int b;
        public final /* synthetic */ aE c;

        public bvg(aE aEVar) {
            this.c = aEVar;
        }

        public void b(Object obj) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 ^ 93;
            int i4 = -(-((i2 & 93) << 1));
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            a = i5 % 128;
            int i6 = i5 % 2;
            JSONObject jSONObject = (JSONObject) obj;
            try {
                if (jSONObject.toString().contains("Record Submitted")) {
                    int i7 = b;
                    int i8 = i7 & 3;
                    int i9 = -(-((i7 ^ 3) | i8));
                    int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
                    a = i10 % 128;
                    if (i10 % 2 != 0) {
                        this.c.onSuccess(jSONObject);
                        return;
                    } else {
                        this.c.onSuccess(jSONObject);
                        int i11 = 97 / 0;
                        return;
                    }
                }
                ResponseMessage responseMessage = new ResponseMessage(0, jSONObject.toString(), false);
                int i12 = b;
                int i13 = ((i12 ^ 98) + ((i12 & 98) << 1)) - 1;
                a = i13 % 128;
                int i14 = i13 % 2;
                this.c.onError(responseMessage);
                int i15 = a;
                int i16 = (i15 | 45) << 1;
                int i17 = -(i15 ^ 45);
                int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
                b = i18 % 128;
                if (i18 % 2 != 0) {
                    throw null;
                }
            } catch (Exception unused) {
                this.c.onError(new ResponseMessage(0, "Data not send, something went wrong", false));
            }
        }
    }

    public static void b(ProgressDialog progressDialog) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 125;
        int i4 = (((~i3) & (i2 | 125)) - (~(-(-(i3 << 1))))) - 1;
        b = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (progressDialog != null) {
            int i5 = i2 + 105;
            b = i5 % 128;
            try {
                if (i5 % 2 == 0) {
                    progressDialog.isShowing();
                    obj.hashCode();
                    throw null;
                }
                if (progressDialog.isShowing()) {
                    progressDialog.dismiss();
                    int i6 = a + 71;
                    b = i6 % 128;
                    int i7 = i6 % 2;
                }
            } catch (Exception unused) {
                return;
            }
        }
        int i8 = b;
        int i9 = ((i8 | 42) << 1) - (i8 ^ 42);
        int i10 = (i9 ^ (-1)) + (i9 << 1);
        a = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x006a  */
    public static boolean c(AppCompatActivity appCompatActivity) {
        NetworkInfo activeNetworkInfo;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 21) + (i2 | 21);
        a = i3 % 128;
        boolean z = false;
        if (i3 % 2 != 0) {
            activeNetworkInfo = ((ConnectivityManager) appCompatActivity.getSystemService("connectivity")).getActiveNetworkInfo();
            int i4 = 19 / 0;
        } else {
            activeNetworkInfo = ((ConnectivityManager) appCompatActivity.getSystemService("connectivity")).getActiveNetworkInfo();
        }
        if (activeNetworkInfo != null) {
            int i5 = b;
            int i6 = i5 & 35;
            int i7 = -(-((i5 ^ 35) | i6));
            int i8 = (i6 & i7) + (i7 | i6);
            a = i8 % 128;
            int i9 = i8 % 2;
            if (activeNetworkInfo.isConnected()) {
                int i10 = b;
                int i11 = i10 & 81;
                int i12 = -(-((i10 ^ 81) | i11));
                int i13 = (i11 & i12) + (i11 | i12);
                a = i13 % 128;
                int i14 = i13 % 2;
                int i15 = ((i10 & (-60)) | ((~i10) & 59)) + ((i10 & 59) << 1);
                a = i15 % 128;
                int i16 = i15 % 2;
                z = true;
            } else {
                int i17 = a;
                int i18 = ((i17 | 17) << 1) - (i17 ^ 17);
                b = i18 % 128;
                int i19 = i18 % 2;
            }
        } else {
            int i110 = a;
            int i111 = ((i110 | 17) << 1) - (i110 ^ 17);
            b = i111 % 128;
            int i112 = i111 % 2;
        }
        int i20 = b;
        int i21 = i20 & 59;
        int i22 = i21 + ((i20 ^ 59) | i21);
        a = i22 % 128;
        if (i22 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public static void f(AppCompatActivity appCompatActivity, String str, String str2) {
        int i = 2 % 2;
        AlertDialog alertDialogCreate = new AlertDialog.Builder(appCompatActivity).create();
        int i2 = a;
        int i3 = ((i2 | 36) << 1) - (i2 ^ 36);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        b = i4 % 128;
        if (i4 % 2 == 0) {
            alertDialogCreate.setTitle(str);
            alertDialogCreate.setMessage(str2);
            throw null;
        }
        alertDialogCreate.setTitle(str);
        alertDialogCreate.setMessage(str2);
        bvd bvdVar = new bvd(appCompatActivity);
        int i5 = a + 49;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            alertDialogCreate.setButton(-3, "OK", bvdVar);
            alertDialogCreate.setCancelable(true);
        } else {
            alertDialogCreate.setButton(-3, "OK", bvdVar);
            alertDialogCreate.setCancelable(false);
        }
        alertDialogCreate.show();
        int i6 = a;
        int i7 = i6 & 49;
        int i8 = i6 | 49;
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        b = i9 % 128;
        int i10 = i9 % 2;
    }

    public static AlertDialog g(AppCompatActivity appCompatActivity, String str, String str2) {
        int i = 2 % 2;
        AlertDialog alertDialogCreate = new AlertDialog.Builder(appCompatActivity).create();
        alertDialogCreate.setTitle(str);
        alertDialogCreate.setMessage(str2);
        bvc bvcVar = new bvc();
        int i2 = a;
        int i3 = i2 & 125;
        int i4 = ((i2 | 125) & (~i3)) + (i3 << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        alertDialogCreate.setButton(-3, "OK", bvcVar);
        alertDialogCreate.setCancelable(false);
        alertDialogCreate.show();
        int i6 = a;
        int i7 = (i6 | 85) << 1;
        int i8 = -(((~i6) & 85) | (i6 & (-86)));
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        b = i9 % 128;
        int i10 = i9 % 2;
        return alertDialogCreate;
    }

    public class bve implements C0094m.bas {
        private static int a = 1;
        private static int b;
        public final /* synthetic */ I c;

        public bve(I i) {
            this.c = i;
        }

        /* JADX WARN: Code duplicated, block: B:18:0x00d6  */
        /* JADX WARN: Code duplicated, block: B:19:0x00f3  */
        @Override // ivas.gov.bisp.enumeration.p022av.C0094m.bas
        public void b(T t) {
            int i = 2 % 2;
            int i2 = b + 49;
            a = i2 % 128;
            int i3 = i2 % 2;
            ResponseMessage responseMessageE = ag.e(t);
            responseMessageE.setLogout(false);
            String lowerCase = responseMessageE.getErrorMessage().toLowerCase();
            int i4 = b;
            int i5 = i4 & 31;
            int i6 = (i5 - (~(-(-((i4 ^ 31) | i5))))) - 1;
            a = i6 % 128;
            int i7 = i6 % 2;
            if (!lowerCase.contains("version")) {
                int i8 = b;
                int i9 = (((i8 ^ 1) | (i8 & 1)) << 1) - (((~i8) & 1) | (i8 & (-2)));
                a = i9 % 128;
                int i10 = i9 % 2;
                if (!responseMessageE.getErrorMessage().toLowerCase().contains("session")) {
                    int i11 = b;
                    int i12 = (i11 & 23) + (i11 | 23);
                    a = i12 % 128;
                    int i13 = i12 % 2;
                    if (!(!responseMessageE.getErrorMessage().contains("401"))) {
                        int i14 = b;
                        int i15 = i14 & 87;
                        int i16 = -(-((i14 ^ 87) | i15));
                        int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
                        a = i17 % 128;
                        if (i17 % 2 == 0) {
                            int i18 = 79 / 0;
                            if (!responseMessageE.getErrorMessage().contains("OTP")) {
                                responseMessageE.setErrorMessage("Username, password or IMEI is wrong.");
                                int i19 = b + 125;
                                a = i19 % 128;
                                int i20 = i19 % 2;
                            } else {
                                responseMessageE.setErrorMessage("401 , OTP is invalid");
                                int i21 = b;
                                int i22 = (i21 & (-76)) | ((~i21) & 75);
                                int i23 = -(-((i21 & 75) << 1));
                                int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
                                a = i24 % 128;
                                int i25 = i24 % 2;
                            }
                        } else if (responseMessageE.getErrorMessage().contains("OTP")) {
                            responseMessageE.setErrorMessage("401 , OTP is invalid");
                            int i26 = b;
                            int i27 = (i26 & (-76)) | ((~i26) & 75);
                            int i28 = -(-((i26 & 75) << 1));
                            int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
                            a = i29 % 128;
                            int i210 = i29 % 2;
                        } else {
                            responseMessageE.setErrorMessage("Username, password or IMEI is wrong.");
                            int i110 = b + 125;
                            a = i110 % 128;
                            int i211 = i110 % 2;
                        }
                    } else if (!(!responseMessageE.getErrorMessage().contains("403"))) {
                        int i30 = b;
                        int i31 = i30 & 19;
                        int i32 = (i30 | 19) & (~i31);
                        int i33 = i31 << 1;
                        int i34 = ((i32 | i33) << 1) - (i32 ^ i33);
                        a = i34 % 128;
                        int i35 = i34 % 2;
                        responseMessageE.setErrorMessage("You have been blocked temporarily. Please contact admin.");
                        int i36 = a;
                        int i37 = ((i36 | 49) << 1) - (i36 ^ 49);
                        b = i37 % 128;
                        int i38 = i37 % 2;
                    }
                }
            }
            this.c.onError(responseMessageE);
            int i39 = b;
            int i40 = ((i39 & 90) + (i39 | 90)) - 1;
            a = i40 % 128;
            int i41 = i40 % 2;
        }
    }

    public static void d(boolean z, JSONObject jSONObject, Context context, String str, aE aEVar) {
        String string;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 51;
        int i4 = (i2 | 51) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        Object obj = null;
        try {
            if (z) {
                StringBuilder sb = new StringBuilder();
                int i8 = a;
                int i9 = i8 ^ 91;
                int i10 = ((i8 & 91) | i9) << 1;
                int i11 = -i9;
                int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
                b = i12 % 128;
                int i13 = i12 % 2;
                sb.append("https://meladeskapp.bisp.gov.pk");
                sb.append(str);
                int i14 = a;
                int i15 = (((i14 | 46) << 1) - (i14 ^ 46)) - 1;
                b = i15 % 128;
                if (i15 % 2 == 0) {
                    sb.toString();
                    obj.hashCode();
                    throw null;
                }
                string = sb.toString();
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("https://meladeskapp.bisp.gov.pk");
                int i16 = b;
                int i17 = i16 & 125;
                int i18 = ((i16 ^ 125) | i17) << 1;
                int i19 = -((i16 | 125) & (~i17));
                int i20 = (i18 & i19) + (i19 | i18);
                a = i20 % 128;
                if (i20 % 2 != 0) {
                    sb2.append(str);
                    sb2.toString();
                    throw null;
                }
                sb2.append(str);
                string = sb2.toString();
                int i21 = b;
                int i22 = i21 & 23;
                int i23 = -(-((i21 ^ 23) | i22));
                int i24 = (i22 & i23) + (i23 | i22);
                a = i24 % 128;
                int i25 = i24 % 2;
            }
            bvi bviVar = new bvi(1, string, jSONObject, new bvg(aEVar), new bvh(aEVar), context);
            z zVar = new z(130000, 0, 0.0f);
            int i26 = a;
            int i27 = i26 & 21;
            int i28 = i27 + ((i26 ^ 21) | i27);
            b = i28 % 128;
            int i29 = i28 % 2;
            bviVar.m = zVar;
            bviVar.k = false;
            BISPApplication bISPApplicationC = BISPApplication.c();
            int i30 = a;
            int i31 = (i30 ^ 71) + ((i30 & 71) << 1);
            b = i31 % 128;
            if (i31 % 2 != 0) {
                bISPApplicationC.h(bviVar);
            } else {
                bISPApplicationC.h(bviVar);
                throw null;
            }
        } catch (Exception e) {
            aEVar.onError(new ResponseMessage(0, e.getMessage(), false));
        }
    }
}
