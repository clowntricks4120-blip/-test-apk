package ivas.gov.bisp.enumeration;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.b;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.orm.SugarContext;
import ivas.gov.bisp.enumeration.W.u;
import ivas.gov.bisp.enumeration.activity.authentication.Authentication;
import ivas.gov.bisp.enumeration.bK.ah;
import ivas.gov.bisp.enumeration.bK.ak;
import ivas.gov.bisp.enumeration.bK.ao;
import ivas.gov.bisp.enumeration.databaseModels.SyncData;
import ivas.gov.bisp.enumeration.de.j;
import ivas.gov.bisp.enumeration.enumerator.ActivityEnumeratorMain;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.lib_mobile;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.locality;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.question_options;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.sync;
import ivas.gov.bisp.enumeration.p021au.aJ;
import ivas.gov.bisp.enumeration.p024ax.ax;
import ivas.gov.bisp.enumeration.p026az.C0104p;
import ivas.gov.bisp.enumeration.p026az.z;
import ivas.gov.bisp.enumeration.p035bh.C;
import ivas.gov.bisp.enumeration.p043bp.ac;
import ivas.gov.bisp.enumeration.p043bp.ag;
import ivas.gov.bisp.enumeration.p043bp.aj;
import ivas.gov.bisp.enumeration.p044bq.w;
import ivas.gov.bisp.enumeration.p085h.k;
import ivas.gov.bisp.enumeration.p086i.l;
import ivas.gov.bisp.enumeration.p096p.h;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Constructor;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import net.sqlcipher.BuildConfig;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class SplashScreen extends AppCompatActivity implements aJ.bal {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char a$s60$1710 = 0;
    private static char[] c$s59$1710 = null;
    private static int p = 1;
    private static int q;
    public static final String[] r;

    @BindView
    public TextView textViewType;

    @BindView
    public TextView textViewVersion;
    public SessionManager u;
    public ProgressDialog v;
    public aJ w;
    public DialogInterface.OnClickListener x = new ag(this, 2);
    public AppCompatActivity y;

    public class OooO00o implements DialogInterface.OnClickListener {
        private static int a = 0;
        private static int b = 1;

        public OooO00o() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            SplashScreen splashScreen = SplashScreen.this;
            w wVar = new w(splashScreen, splashScreen.u);
            int i3 = a;
            int i4 = i3 & 59;
            int i5 = i4 + ((i3 ^ 59) | i4);
            b = i5 % 128;
            if (i5 % 2 == 0) {
                wVar.execute(new Void[1]);
            } else {
                wVar.execute(new Void[0]);
            }
            dialogInterface.cancel();
        }
    }

    static {
        o();
        r = new String[]{"android.permission.READ_PHONE_STATE", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.BLUETOOTH", "android.permission.BLUETOOTH_ADMIN"};
        int i = p + 41;
        q = i % 128;
        if (i % 2 != 0) {
            int i2 = 57 / 0;
        }
    }

    static void o() {
        a$s60$1710 = (char) 31405;
        c$s59$1710 = new char[]{31400, 20325, 20338, 20288, 31402, 20344, 20316, 20289, 20340, 20295, 20317, 31403, 20310, 20314, 20323, 20225};
    }

    public static boolean p() {
        int i = 2 % 2;
        int i2 = q;
        int i3 = i2 + 79;
        p = i3 % 128;
        int i4 = i3 % 2;
        String[] strArr = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su"};
        int i5 = i2 + 115;
        p = i5 % 128;
        int i6 = i5 % 2;
        int i7 = 0;
        while (i7 < 10) {
            if (new File(strArr[i7]).exists()) {
                return true;
            }
            i7++;
            int i8 = q + 35;
            p = i8 % 128;
            int i9 = i8 % 2;
        }
        return false;
    }

    public static boolean q() {
        int i = 2 % 2;
        Process process = null;
        try {
            Process processExec = Runtime.getRuntime().exec(new String[]{"/system/xbin/which", "su"});
            try {
                if (new BufferedReader(new InputStreamReader(processExec.getInputStream())).readLine() != null) {
                    int i2 = p + 49;
                    q = i2 % 128;
                    int i3 = i2 % 2;
                    processExec.destroy();
                    return true;
                }
                processExec.destroy();
                int i4 = q + 61;
                p = i4 % 128;
                if (i4 % 2 != 0) {
                    return false;
                }
                process.hashCode();
                throw null;
            } catch (Throwable unused) {
                process = processExec;
                if (process != null) {
                    process.destroy();
                }
                return false;
            }
        } catch (Throwable unused2) {
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = 2 % 2;
        int i4 = q + 19;
        p = i4 % 128;
        int i5 = i4 % 2;
        super.onActivityResult(i, i2, intent);
        if (i == 12345) {
            int i6 = q + 117;
            p = i6 % 128;
            int i7 = i6 % 2;
            s();
        }
        int i8 = q + 73;
        p = i8 % 128;
        if (i8 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        int i2 = 2 % 2;
        super.onRequestPermissionsResult(i, strArr, iArr);
        aJ aJVar = this.w;
        if (i == aJVar.c) {
            int i3 = p + 47;
            q = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                int length = iArr.length;
                obj.hashCode();
                throw null;
            }
            if (iArr.length > 0) {
                int length2 = iArr.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length2) {
                        ((SplashScreen) aJVar.b).y();
                        int i5 = p + 111;
                        q = i5 % 128;
                        int i6 = i5 % 2;
                        return;
                    }
                    int i7 = p + 11;
                    q = i7 % 128;
                    if (i7 % 2 != 0) {
                        int i8 = iArr[i4];
                        throw null;
                    }
                    if (iArr[i4] != 0) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
            ((SplashScreen) aJVar.b).x();
            int i9 = q + 65;
            p = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 2 / 2;
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        int i = 2 % 2;
        int i2 = q + 29;
        p = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = q + 117;
        p = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003e  */
    /* JADX WARN: Code duplicated, block: B:15:0x004c  */
    /* JADX WARN: Code duplicated, block: B:33:0x004f A[SYNTHETIC] */
    public final void s() {
        int i;
        int i2 = 2 % 2;
        aJ aJVar = this.w;
        String[] strArr = r;
        aJVar.a = this;
        aJVar.c = 12345;
        aJVar.b = this;
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = q + 79;
            p = i4 % 128;
            if (i4 % 2 == 0) {
                l.b(aJVar.a, strArr[i3]);
                throw null;
            }
            String str = strArr[i3];
            if (l.b(aJVar.a, str) == 0) {
                int i5 = p + 21;
                q = i5 % 128;
                if (!(i5 % 2 == 0)) {
                    int i6 = q + 85;
                    p = i6 % 128;
                    i = i6 % 2;
                    arrayList.add(str);
                    if (i == 0) {
                        int i7 = 84 / 0;
                    }
                }
            } else {
                int i8 = q + 85;
                p = i8 % 128;
                i = i8 % 2;
                arrayList.add(str);
                if (i == 0) {
                    int i9 = 84 / 0;
                }
            }
        }
        String[] strArr2 = (String[]) arrayList.toArray(new String[0]);
        if (strArr2.length != 0) {
            k.c(aJVar.a, strArr2, 12345);
            return;
        }
        int i10 = q + 19;
        p = i10 % 128;
        if (i10 % 2 != 0) {
            ((SplashScreen) aJVar.b).y();
        } else {
            ((SplashScreen) aJVar.b).y();
            int i11 = 39 / 0;
        }
    }

    public void z() {
        int i = 2 % 2;
        b.aIz aiz = new b.aIz(this);
        AlertController.OooO0O0 oooO0O0 = aiz.a;
        oooO0O0.e = "Session Expire";
        oooO0O0.f = "Session Expire Please Login Again.!";
        oooO0O0.k = true;
        OooO00o oooO00o = new OooO00o();
        oooO0O0.h = "Confirm";
        oooO0O0.i = oooO00o;
        aiz.b().show();
        int i2 = q + 89;
        p = i2 % 128;
        int i3 = i2 % 2;
    }

    public final String u(int i) {
        int i2 = 2 % 2;
        try {
            InputStream inputStreamOpenRawResource = getResources().openRawResource(i);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                try {
                    try {
                        int i3 = inputStreamOpenRawResource.read(bArr);
                        if (i3 != -1) {
                            byteArrayOutputStream.write(bArr, 0, i3);
                        } else {
                            try {
                                break;
                            } catch (IOException unused) {
                            }
                        }
                    } catch (IOException unused2) {
                        inputStreamOpenRawResource.close();
                        byteArrayOutputStream.close();
                        int i4 = p + 97;
                        q = i4 % 128;
                        int i5 = i4 % 2;
                        return null;
                    } catch (Throwable th) {
                        try {
                            inputStreamOpenRawResource.close();
                            byteArrayOutputStream.close();
                            int i6 = q + 99;
                            p = i6 % 128;
                            int i7 = i6 % 2;
                        } catch (IOException unused3) {
                        }
                        throw th;
                    }
                } catch (IOException unused4) {
                }
                int i8 = p + 97;
                q = i8 % 128;
                int i9 = i8 % 2;
                return null;
            }
            inputStreamOpenRawResource.close();
            byteArrayOutputStream.close();
            try {
                return byteArrayOutputStream.toString("UTF-8");
            } catch (UnsupportedEncodingException unused5) {
                return null;
            }
        } catch (Resources.NotFoundException unused6) {
        }
    }

    public class OooO0O0 implements u {
        private static int a = 0;
        private static int b = 1;

        public OooO0O0() {
        }

        public void c() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (-2) - ((((i2 | 116) << 1) - (i2 ^ 116)) ^ (-1));
            a = i3 % 128;
            int i4 = i3 % 2;
            ax.b(SplashScreen.this.v);
            SplashScreen splashScreen = SplashScreen.this;
            int i5 = b;
            int i6 = i5 & 65;
            int i7 = -(-((i5 ^ 65) | i6));
            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
            a = i8 % 128;
            int i9 = i8 % 2;
            Toast.makeText(splashScreen, "Sync Failed", 0).show();
            int i10 = b;
            int i11 = (i10 & 114) + (i10 | 114);
            int i12 = (i11 ^ (-1)) + (i11 << 1);
            a = i12 % 128;
            if (i12 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public class OooO0OO extends h {
        private static int a = 0;
        private static int b = 1;
        public final /* synthetic */ u d;
        public final /* synthetic */ JSONObject e;
        public final /* synthetic */ ArrayList f;
        public final /* synthetic */ ArrayList g;

        public OooO0OO(u uVar, JSONObject jSONObject, ArrayList arrayList, ArrayList arrayList2) {
            this.d = uVar;
            this.e = jSONObject;
            this.g = arrayList;
            this.f = arrayList2;
        }

        @Override // ivas.gov.bisp.enumeration.p096p.h
        public void aI(ivas.gov.bisp.enumeration.bF.c cVar) {
            int i = 2 % 2;
            int i2 = a + 19;
            b = i2 % 128;
            if (i2 % 2 == 0) {
                SplashScreen.this.v.dismiss();
                throw null;
            }
            SplashScreen.this.v.dismiss();
            u uVar = this.d;
            if (uVar != null) {
                int i3 = b;
                int i4 = (((i3 | 112) << 1) - (i3 ^ 112)) - 1;
                a = i4 % 128;
                if (i4 % 2 != 0) {
                    ((OooO0O0) uVar).c();
                    throw null;
                }
                ((OooO0O0) uVar).c();
                int i5 = b + 117;
                a = i5 % 128;
                int i6 = i5 % 2;
            }
            C0104p c0104pC = C0104p.c();
            SplashScreen splashScreen = SplashScreen.this;
            AppCompatActivity appCompatActivity = splashScreen.y;
            int i7 = b;
            int i8 = (((i7 | 100) << 1) - (i7 ^ 100)) - 1;
            a = i8 % 128;
            if (i8 % 2 != 0) {
                DialogInterface.OnClickListener onClickListener = splashScreen.x;
                throw null;
            }
            DialogInterface.OnClickListener onClickListener2 = splashScreen.x;
            int i9 = a + 103;
            b = i9 % 128;
            int i10 = i9 % 2;
            c0104pC.e(appCompatActivity, "Server Error", "Invalid response from Server. Please contact admin.", onClickListener2, false);
            int i11 = b + 121;
            a = i11 % 128;
            int i12 = i11 % 2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x011a, code lost:
        
            if ((r12 / ((int) r4)) > 0) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0128, code lost:
        
            if ((((r5 | r12) << 1) - (r12 ^ r5)) > 1) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x012a, code lost:
        
            r2 = r2 + 51;
            ivas.gov.bisp.enumeration.SplashScreen.OooO0OO.b = r2 % 128;
            r2 = r2 % 2;
            r11.t();
            r11 = ivas.gov.bisp.enumeration.SplashScreen.OooO0OO.b;
            r12 = r11 & 65;
            r11 = (r11 ^ 65) | r12;
            r2 = (r12 & r11) + (r11 | r12);
            ivas.gov.bisp.enumeration.SplashScreen.OooO0OO.a = r2 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0144, code lost:
        
            if ((r2 % 2) == 0) goto L57;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0146, code lost:
        
            r11 = 9 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0149, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:?, code lost:
        
            return;
         */
        @Override // ivas.gov.bisp.enumeration.p096p.h
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void aJ(boolean r11, java.lang.String r12) {
            /*
                Method dump skipped, instruction units count: 506
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.SplashScreen.OooO0OO.aJ(boolean, java.lang.String):void");
        }
    }

    public final boolean v() {
        int i = 2 % 2;
        String str = Build.BRAND;
        if (str.startsWith("generic")) {
            int i2 = q + 65;
            p = i2 % 128;
            int i3 = i2 % 2;
            if (Build.DEVICE.startsWith("generic")) {
                return true;
            }
        }
        if (str.contains("Windows")) {
            return true;
        }
        int i4 = p + 71;
        q = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 63 / 0;
            if (Build.BOARD.contains("windows")) {
                return true;
            }
        } else if (Build.BOARD.contains("windows")) {
            return true;
        }
        int i6 = q + 79;
        p = i6 % 128;
        int i7 = i6 % 2;
        String str2 = Build.MANUFACTURER;
        if (str2.contains("Microsoft Corporation")) {
            return true;
        }
        int i8 = q + 11;
        p = i8 % 128;
        if (i8 % 2 == 0) {
            Build.MODEL.contains("Subsystem for Android(TM)");
            throw null;
        }
        String str3 = Build.MODEL;
        if (str3.contains("Subsystem for Android(TM)")) {
            return true;
        }
        String str4 = Build.FINGERPRINT;
        if (!(!str4.startsWith("generic"))) {
            return true;
        }
        int i9 = p + 47;
        q = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 74 / 0;
            if (str4.startsWith("unknown")) {
                return true;
            }
        } else if (str4.startsWith("unknown")) {
            return true;
        }
        String str5 = Build.HARDWARE;
        if (str5.contains("goldfish") || str5.contains("ranchu") || str3.contains("google_sdk") || str3.contains("Emulator") || str3.contains("Android SDK built for x86") || str2.contains("Genymotion")) {
            return true;
        }
        String str6 = Build.PRODUCT;
        if (str6.contains("sdk_google")) {
            return true;
        }
        int i11 = q + 85;
        p = i11 % 128;
        int i12 = i11 % 2;
        if (str6.contains("google_sdk") || str6.contains("sdk") || str6.contains("sdk_x86") || str6.contains("vbox86p") || str6.contains("emulator") || str6.contains("simulator") || str2 == "Google" || str == "google" || str4.startsWith("google/sdk_gphone_")) {
            return true;
        }
        int i13 = p + 35;
        q = i13 % 128;
        if (i13 % 2 != 0) {
            str4.endsWith(":user/release-keys");
            throw null;
        }
        if (str4.endsWith(":user/release-keys") || str6.startsWith("sdk_gphone_") || str3.startsWith("sdk_gphone_") || str4.startsWith("google/sdk_gphone64_")) {
            return true;
        }
        int i14 = q + 47;
        p = i14 % 128;
        if (i14 % 2 == 0) {
            str4.endsWith(":userdebug/dev-keys");
            throw null;
        }
        if (str4.endsWith(":userdebug/dev-keys") || str4.endsWith(":user/release-keys") || str6.startsWith("sdk_gphone64_") || str3.startsWith("sdk_gphone64_")) {
            return true;
        }
        int i15 = p + 101;
        q = i15 % 128;
        if (i15 % 2 != 0) {
            str4.startsWith("generic");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (str4.startsWith("generic") || !(!str4.startsWith("unknown"))) {
            return true;
        }
        int i16 = p + 115;
        q = i16 % 128;
        if (i16 % 2 != 0) {
            int i17 = 77 / 0;
            if (str3.contains("google_sdk")) {
                return true;
            }
        } else if (str3.contains("google_sdk")) {
            return true;
        }
        if (str3.contains("Emulator") || str3.contains("Android SDK built for x86")) {
            return true;
        }
        return ("QC_Reference_Phone" == Build.BOARD && !"Xiaomi".equals(str2)) || str2.contains("Genymotion") || Build.HOST.startsWith("Build") || str6 == "google_sdk";
    }

    public class OooO extends AsyncTask<Void, Void, Void> {
        private static int a = 0;
        private static int b = 1;
        public sync c;

        public OooO(sync syncVar) {
            this.c = syncVar;
        }

        @Override // android.os.AsyncTask
        public Void doInBackground(Void[] voidArr) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 & 77) + (i2 | 77);
            a = i3 % 128;
            int i4 = i3 % 2;
            AppDatabase appDatabaseL = AppDatabase.l(SplashScreen.this.getApplicationContext());
            int i5 = b + 126;
            int i6 = (i5 ^ (-1)) + (i5 << 1);
            a = i6 % 128;
            int i7 = i6 % 2;
            try {
                appDatabaseL.m().D();
                int i8 = a;
                int i9 = ((i8 & 116) + (i8 | 116)) - 1;
                b = i9 % 128;
                int i10 = i9 % 2;
            } catch (Exception unused) {
            }
            try {
                appDatabaseL.m().bv(this.c);
                int i11 = b;
                int i12 = i11 & 103;
                int i13 = -(-((i11 ^ 103) | i12));
                int i14 = (i12 & i13) + (i13 | i12);
                a = i14 % 128;
                int i15 = i14 % 2;
            } catch (Exception unused2) {
            }
            int i16 = b;
            int i17 = i16 & 21;
            int i18 = ((i16 ^ 21) | i17) << 1;
            int i19 = -((i16 | 21) & (~i17));
            int i20 = (i18 & i19) + (i19 | i18);
            a = i20 % 128;
            if (i20 % 2 != 0) {
                int i21 = 46 / 0;
            }
            return null;
        }
    }

    public class OooO0o extends AsyncTask<Void, Void, Void> {
        private static int a = 1;
        private static int b;
        public locality c;
        public ArrayList<question_options> d;
        public ArrayList<lib_mobile> e;

        public OooO0o(locality localityVar, ArrayList<question_options> arrayList, ArrayList<lib_mobile> arrayList2) {
            this.c = localityVar;
            this.d = arrayList;
            this.e = arrayList2;
        }

        @Override // android.os.AsyncTask
        public Void doInBackground(Void[] voidArr) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 | 19) << 1;
            int i4 = -(((~i2) & 19) | (i2 & (-20)));
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            a = i5 % 128;
            int i6 = i5 % 2;
            AppDatabase appDatabaseL = AppDatabase.l(SplashScreen.this.getApplicationContext());
            int i7 = a + 109;
            b = i7 % 128;
            Object obj = null;
            if (i7 % 2 != 0) {
                appDatabaseL.m().C();
                appDatabaseL.m().H();
                obj.hashCode();
                throw null;
            }
            appDatabaseL.m().C();
            appDatabaseL.m().H();
            int i8 = a;
            int i9 = i8 | 9;
            int i10 = (i9 << 1) - ((~(i8 & 9)) & i9);
            b = i10 % 128;
            if (i10 % 2 != 0) {
                appDatabaseL.m().K();
                appDatabaseL.m();
                throw null;
            }
            appDatabaseL.m().K();
            h hVarM = appDatabaseL.m();
            locality localityVar = this.c;
            int i11 = a;
            int i12 = ((i11 | 45) << 1) - (i11 ^ 45);
            b = i12 % 128;
            if (i12 % 2 != 0) {
                hVarM.bk(localityVar);
                appDatabaseL.m().bo(this.d);
                int i13 = 43 / 0;
            } else {
                hVarM.bk(localityVar);
                appDatabaseL.m().bo(this.d);
            }
            appDatabaseL.m().av(this.e);
            int i14 = b;
            int i15 = (((i14 | 58) << 1) - (i14 ^ 58)) - 1;
            a = i15 % 128;
            int i16 = i15 % 2;
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0063  */
    /* JADX WARN: Code duplicated, block: B:24:0x006e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0074  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:31:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:32:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ee  */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i;
        int i2 = 2 % 2;
        int i3 = p + 91;
        q = i3 % 128;
        if (i3 % 2 != 0) {
            super.onCreate(bundle);
            setContentView(R.layout.activity_splash_screen);
            int i4 = 7 / 0;
            if (!ao.b(this)) {
                return;
            }
        } else {
            super.onCreate(bundle);
            setContentView(R.layout.activity_splash_screen);
            if (!ao.b(this)) {
                return;
            }
        }
        if (v()) {
            Toast.makeText(getApplicationContext(), "Application installed on Emulator", 0).show();
            finishAffinity();
            return;
        }
        String str = Build.TAGS;
        if (str != null && str.contains("test-keys")) {
            int i5 = p + 15;
            q = i5 % 128;
            if (i5 % 2 != 0) {
                if (!p()) {
                    i = q + 43;
                    p = i % 128;
                    if (i % 2 != 0) {
                        q();
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (!q()) {
                        this.y = this;
                        this.u = new SessionManager(this);
                        ah.c = new ah(this);
                        this.w = new aJ();
                        Map<Class<?>, Constructor<? extends Unbinder>> map = ButterKnife.a;
                        ButterKnife.c(this, getWindow().getDecorView());
                        SugarContext.init(this);
                        ProgressDialog progressDialog = new ProgressDialog(this);
                        this.v = progressDialog;
                        progressDialog.setCancelable(false);
                        if (ah.c.d.getInt("userType", 1) == 1) {
                            int i6 = p + 49;
                            q = i6 % 128;
                            int i7 = i6 % 2;
                            this.textViewType.setText("MELA NSER - Enumerator Application");
                        } else if (ah.c.d.getInt("userType", 2) == 1) {
                            int i8 = q + 1;
                            p = i8 % 128;
                            int i9 = i8 % 2;
                            this.textViewType.setText("MELA NSER - Spot-Check User Application");
                        } else {
                            this.textViewType.setText("MELA NSER - Supervisor Application");
                        }
                        this.textViewVersion.setText("v7.6 (LIVE)\n11 Nov 2026");
                        s();
                        return;
                    }
                }
            }
        } else if (!p()) {
            i = q + 43;
            p = i % 128;
            if (i % 2 != 0) {
                q();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (!q()) {
                this.y = this;
                this.u = new SessionManager(this);
                ah.c = new ah(this);
                this.w = new aJ();
                Map<Class<?>, Constructor<? extends Unbinder>> map2 = ButterKnife.a;
                ButterKnife.c(this, getWindow().getDecorView());
                SugarContext.init(this);
                ProgressDialog progressDialog2 = new ProgressDialog(this);
                this.v = progressDialog2;
                progressDialog2.setCancelable(false);
                if (ah.c.d.getInt("userType", 1) == 1) {
                    int i10 = p + 49;
                    q = i10 % 128;
                    int i11 = i10 % 2;
                    this.textViewType.setText("MELA NSER - Enumerator Application");
                } else if (ah.c.d.getInt("userType", 2) == 1) {
                    int i12 = q + 1;
                    p = i12 % 128;
                    int i13 = i12 % 2;
                    this.textViewType.setText("MELA NSER - Spot-Check User Application");
                } else {
                    this.textViewType.setText("MELA NSER - Supervisor Application");
                }
                this.textViewVersion.setText("v7.6 (LIVE)\n11 Nov 2026");
                s();
                return;
            }
        }
        Toast.makeText(getApplicationContext(), "Application installed on Rooted Device", 1).show();
        finishAffinity();
    }

    public void x() {
        int i = 2 % 2;
        C0104p c0104pC = C0104p.c();
        AppCompatActivity appCompatActivity = this.y;
        String string = getString(R.string.title_settings_dialog);
        String string2 = getString(R.string.rationale_ask_again);
        ag agVar = new ag(this, 1);
        ac acVar = new ac(this, 2);
        Objects.requireNonNull(c0104pC);
        try {
            b bVarB = new b.aIz(appCompatActivity).b();
            bVarB.setCancelable(false);
            bVarB.setTitle(string);
            AlertController alertController = bVarB.a;
            alertController.f = string2;
            TextView textView = alertController.H;
            if (textView != null) {
                int i2 = p + 37;
                q = i2 % 128;
                if (i2 % 2 != 0) {
                    textView.setText(string2);
                    try {
                        throw null;
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    textView.setText(string2);
                    int i3 = q + 35;
                    p = i3 % 128;
                    int i4 = i3 % 2;
                }
            }
            bVarB.setCanceledOnTouchOutside(false);
            bVarB.i(-1, "Settings", agVar);
            bVarB.i(-2, "Cancel", acVar);
            bVarB.show();
        } catch (WindowManager.BadTokenException unused) {
        }
    }

    public final void y() {
        int i = 2 % 2;
        try {
            ax.h(this.v, "Syncing data");
            JSONObject jSONObject = new JSONObject(u(R.raw.enumeration_sync));
            Object obj = null;
            if (!(!jSONObject.getString("status").equals("false"))) {
                int i2 = q + 61;
                p = i2 % 128;
                int i3 = i2 % 2;
                ax.f(this, "Alert", jSONObject.getString("message"));
                int i4 = p + 53;
                q = i4 % 128;
                if (i4 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            String str = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a").format(new Date());
            SessionManager sessionManager = new SessionManager(this);
            this.u = sessionManager;
            sessionManager.d.putString("k_tv_sync_time", str);
            sessionManager.d.apply();
            new OooO(new sync(new Date().getTime(), jSONObject.toString())).execute(new Void[0]);
            w(jSONObject);
            int i5 = p + 9;
            q = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("syncApplication: ");
            sb.append(e.getMessage());
            Log.e("SplashScreen", sb.toString());
        }
    }

    public final void t() {
        int i = 2 % 2;
        if (ah.c.d.getInt("is_sms_activated", 1) == 1) {
            int i2 = p + 15;
            q = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 64 / 0;
                if (ah.c.d.getString("sms_timestamp", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
                    return;
                }
            } else if (ah.c.d.getString("sms_timestamp", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
                return;
            }
            try {
                if (((new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(z.e()).getTime() - new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(ah.c.d.getString("sms_timestamp", BuildConfig.FLAVOR)).getTime()) / 3600000) % 24 >= 72) {
                    ah ahVar = ah.c;
                    ahVar.e.putString("sms_timestamp", BuildConfig.FLAVOR);
                    ahVar.e.commit();
                    return;
                }
            } catch (ParseException unused) {
            }
        }
        if (ah.c.d.getInt("userType", 1) != 1) {
            ax.f(this, "Alert", "You are not allowed to use this application!");
            int i4 = q + 37;
            p = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        if (!this.u.c.getBoolean("isUserLoggedIn", false)) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Calendar calendar = Calendar.getInstance();
            calendar.add(5, -1);
            this.u.B(simpleDateFormat.format(calendar.getTime()));
            startActivity(new Intent(this, (Class<?>) Authentication.class));
            finish();
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("Data", "BISP NSER Dynamic Registry");
            jSONObject2.put("string1", ivas.gov.bisp.enumeration.bK.b.d(jSONObject.toString(), ivas.gov.bisp.enumeration.bK.b.b(this.u.k()), ivas.gov.bisp.enumeration.bK.b.b(this.u.m())));
            byte[] bArrB = ivas.gov.bisp.enumeration.bK.b.b(this.u.k());
            byte[] bArrB2 = ivas.gov.bisp.enumeration.bK.b.b(this.u.m());
            Object[] objArr = new Object[1];
            a((byte) (getPackageName().codePointAt(17) - 46), getApplicationInfo().targetSdkVersion - 16, new char[]{'\f', 0, '\n', 1, '\r', 6, 0, '\r', 11, 7, 14, 5, '\t', 2, 13799}, objArr);
            jSONObject2.put("string2", ivas.gov.bisp.enumeration.bK.b.d(((String) objArr[0]).intern(), bArrB, bArrB2));
            ax.h(this.v, "Kindly wait for version checking!");
            if (this.u.l().intValue() != 2 && this.u.l().intValue() != 3) {
                ax.e(jSONObject2, this, "https://meladeskapp.bisp.gov.pk/api/Users/UbZJVzTu9rHlQm0D", new aj(this));
                return;
            }
            if (BISPApplication.c().g) {
                ax.e(jSONObject2, this, "https://meladeskapp.bisp.gov.pk/api/Users/UbZJVzTu9rHlQm0D", new aj(this));
            } else {
                startActivity(new Intent(this, (Class<?>) ActivityEnumeratorMain.class));
                finish();
            }
        } catch (JSONException unused2) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r16v5, types: [ivas.gov.bisp.enumeration.SplashScreen$OooO0O0, ivas.gov.bisp.enumeration.W.u] */
    public void w(JSONObject jSONObject) {
        OooO0O0 oooO0O0Equals;
        int i = 2 % 2;
        OooO0O0 oooO0O0 = new OooO0O0();
        try {
            String string = jSONObject.toString();
            oooO0O0Equals = string.equals(BuildConfig.FLAVOR);
            try {
                if (oooO0O0Equals != 0) {
                    this.v.dismiss();
                    oooO0O0.c();
                    ak.b(this.y, "Server Error", "No response from server.Please contact admin.", this.x);
                    return;
                }
                oooO0O0Equals = oooO0O0;
                try {
                    SyncData syncData = (SyncData) new C().f(string, SyncData.class);
                    if (!syncData.getStatus().toLowerCase().equals("success")) {
                        if (syncData.getStatus().toLowerCase().equals("error")) {
                            ah ahVar = ah.c;
                            ahVar.e.putBoolean("syncRequired", true);
                            ahVar.e.commit();
                            ah ahVar2 = ah.c;
                            ahVar2.e.putInt("StructuralVersion", 1);
                            ahVar2.e.commit();
                            ah ahVar3 = ah.c;
                            ahVar3.e.putString("forceUpdate", syncData.getForceUpdate());
                            ahVar3.e.commit();
                            ah ahVar4 = ah.c;
                            ahVar4.e.putString("forceUpdateUser", "0");
                            ahVar4.e.commit();
                            oooO0O0Equals.c();
                            C0104p.c().e(this.y, "Error", syncData.getMessage(), new ac(this, 1), false);
                            int i2 = q + 3;
                            p = i2 % 128;
                            int i3 = i2 % 2;
                            return;
                        }
                        return;
                    }
                    ArrayList arrayList = new ArrayList(Arrays.asList((question_options[]) new C().f(jSONObject.getJSONObject("data").getJSONArray("QuestionOptions").toString(), question_options[].class)));
                    ArrayList arrayList2 = new ArrayList(Arrays.asList((lib_mobile[]) new C().f(jSONObject.getJSONObject("data").getJSONArray("lib_mobile").toString(), lib_mobile[].class)));
                    String string2 = jSONObject.getJSONObject("data").getJSONObject("user").getString("firm_id");
                    String string3 = jSONObject.getJSONObject("data").getJSONObject("user").getString("phone");
                    int i4 = jSONObject.getJSONObject("data").getJSONObject("user").getInt("supervisor_id");
                    String string4 = jSONObject.getJSONObject("data").getJSONObject("user").getString("cnic");
                    String string5 = jSONObject.getJSONObject("data").getJSONObject("user").getString("supervisor_phone");
                    jSONObject.getJSONObject("data").getJSONObject("user").getInt("user_role_id");
                    int i5 = jSONObject.getJSONObject("data").getJSONObject("locality").getInt("is_recollection");
                    j.bJI bji = (j.bJI) ((j) this.u.h(this.y)).edit();
                    bji.putInt("firm_id", Integer.parseInt(string2));
                    bji.apply();
                    j.bJI bji2 = (j.bJI) ((j) this.u.h(this.y)).edit();
                    bji2.putInt("is_recollected", i5);
                    bji2.apply();
                    j.bJI bji3 = (j.bJI) ((j) this.u.h(this.y)).edit();
                    bji3.putInt("supervisor_id", i4);
                    bji3.apply();
                    StringBuilder sb = new StringBuilder();
                    sb.append("handleSyncData: Sync data: Enum Id:  ");
                    sb.append(syncData.getData().getUser().getId());
                    Log.e("SplashScreen", sb.toString());
                    j.bJI bji4 = (j.bJI) ((j) this.u.h(this.y)).edit();
                    bji4.putInt("enum_id", syncData.getData().getUser().getId());
                    bji4.apply();
                    j.bJI bji5 = (j.bJI) ((j) this.u.h(this.y)).edit();
                    bji5.putString("enum_phone", string3);
                    bji5.apply();
                    j.bJI bji6 = (j.bJI) ((j) this.u.h(this.y)).edit();
                    bji6.putString("supervisor_cnic", string4);
                    bji6.apply();
                    j.bJI bji7 = (j.bJI) ((j) this.u.h(this.y)).edit();
                    bji7.putString("supervisor_phone", string5);
                    bji7.apply();
                    BISPApplication bISPApplication = (BISPApplication) getApplicationContext();
                    bISPApplication.Y = Integer.parseInt(string2);
                    bISPApplication.W = string3;
                    bISPApplication.X = i5;
                    bISPApplication.K = BuildConfig.FLAVOR;
                    bISPApplication.U = "release";
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("handleSyncData: Sync data: user id Global: ");
                    sb2.append(syncData.getData().getUser().getId());
                    Log.e("SplashScreen", sb2.toString());
                    syncData.getData().getUser().getId();
                    try {
                        bISPApplication.T = jSONObject.getInt("no_cnic_count");
                        int i6 = p + 33;
                        q = i6 % 128;
                        int i7 = i6 % 2;
                    } catch (Exception unused) {
                    }
                    try {
                        if (jSONObject.has("daily_survey_limit")) {
                            jSONObject.getInt("daily_survey_limit");
                        }
                    } catch (Exception unused2) {
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    JSONObject jSONObject3 = jSONObject.getJSONObject("data").getJSONObject("locality");
                    jSONObject3.getInt("village_id");
                    JSONArray jSONArray = jSONObject3.getJSONArray("village_boundaries");
                    JSONArray jSONArray2 = jSONObject3.getJSONArray("village_structure_number");
                    JSONArray jSONArray3 = jSONObject3.getJSONArray("village_map_list");
                    jSONObject3.put("village_boundaries", jSONArray.toString());
                    jSONObject3.put("village_structure_number", jSONArray2.toString());
                    jSONObject3.put("village_map_list", jSONArray3.toString());
                    jSONObject2.put("server_app_version", 0);
                    jSONObject2.put("is_force_update", 0);
                    jSONObject2.put("supervisor_version", 1);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("handleSyncData: Sync data: Supervisor Id: ");
                    sb3.append(syncData.getData().getUser().getSupervisorId());
                    Log.e("SplashScreen", sb3.toString());
                    jSONObject2.put("supervisor_id", syncData.getData().getUser().getSupervisorId());
                    jSONObject2.put("locality", jSONObject3);
                    ah ahVar5 = ah.c;
                    ahVar5.e.putString("sync_date", new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date()));
                    ahVar5.e.commit();
                    ah ahVar6 = ah.c;
                    ahVar6.e.putString("apk_version", syncData.getData().getServerApkVersion().getApkVersion());
                    ahVar6.e.commit();
                    ah ahVar7 = ah.c;
                    ahVar7.e.putInt("forceUpdate", syncData.getData().getServerApkVersion().getForceUpdate());
                    ahVar7.e.commit();
                    ah ahVar8 = ah.c;
                    ahVar8.e.putString("forceUpdateUser", syncData.getData().getUser().getForceUpdate());
                    ahVar8.e.commit();
                    String string6 = ah.c.d.getString("apk_version", BuildConfig.FLAVOR);
                    if (ah.c.d.getString("forceUpdateUser", "0").equalsIgnoreCase("1")) {
                        int i8 = p + 95;
                        q = i8 % 128;
                        if (i8 % 2 != 0) {
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        if (string6 == null || !string6.equalsIgnoreCase("7.6")) {
                            ah ahVar9 = ah.c;
                            ahVar9.e.putString("forceUpdateUser", "0");
                            ahVar9.e.commit();
                            ah ahVar10 = ah.c;
                            ahVar10.e.putBoolean("syncRequired", true);
                            ahVar10.e.commit();
                            ah ahVar11 = ah.c;
                            ahVar11.e.putInt("StructuralVersion", 1);
                            ahVar11.e.commit();
                            oooO0O0Equals.c();
                            C0104p.c().f(this.y, "Oops!", "Your application version is old. Kindly update the new version to proceed.", new ac(this, 0), new ag(this, 0));
                            return;
                        }
                    }
                    ivas.gov.bisp.enumeration.bK.ag.p(syncData.getData().getUser());
                    ivas.gov.bisp.enumeration.bK.ag.o(syncData.getData().getVillageExemptions());
                    new ivas.gov.bisp.enumeration.bK.aj(new OooO0OO(oooO0O0Equals, jSONObject2, arrayList, arrayList2)).execute(new Void[0]);
                } catch (Exception e) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("handleSyncData: ExceptionSyncData: ");
                    sb4.append(e.getMessage());
                    Log.e("SplashScreen", sb4.toString());
                }
            } catch (Exception e2) {
                e = e2;
                StringBuilder sb5 = new StringBuilder();
                sb5.append("handleSyncData: Exception: ");
                sb5.append(e.getMessage());
                Log.e("SplashScreen", sb5.toString());
                oooO0O0Equals.c();
                AppCompatActivity appCompatActivity = this.y;
                StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("Error while syncing. Try again later. If error persist than contact admin\n");
                sbW.append(e.getStackTrace());
                sbW.append("\n");
                sbW.append(e.getCause());
                sbW.append("\n");
                sbW.append(e.getLocalizedMessage());
                ak.b(appCompatActivity, "Application Error", sbW.toString(), this.x);
            }
        } catch (Exception e3) {
            e = e3;
            oooO0O0Equals = oooO0O0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:33:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:34:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:36:0x0104  */
    /* JADX WARN: Code duplicated, block: B:37:0x0135  */
    private static void a(byte b, int i, char[] cArr, Object[] objArr) {
        int i2;
        int i3 = 2 % 2;
        o.k kVar = new o.k();
        char[] cArr2 = c$s59$1710;
        if (cArr2 != null) {
            int i4 = $10 + 105;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $11 + 31;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    cArr3[i6] = (char) (((long) cArr2[i6]) + 3459633260503792297L);
                } else {
                    cArr3[i6] = (char) (((long) cArr2[i6]) ^ 3459633260503792297L);
                    i6++;
                }
            }
            cArr2 = cArr3;
        }
        char c = (char) (3459633260503792297L ^ ((long) a$s60$1710));
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i8 = $11 + 43;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                kVar.c = 1;
            } else {
                kVar.c = 0;
            }
            while (kVar.c < i2) {
                int i9 = $11 + 3;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    kVar.e = cArr[kVar.c];
                    kVar.b = cArr[kVar.c >>> 1];
                    if (kVar.e == kVar.b) {
                        cArr4[kVar.c] = (char) (kVar.e - b);
                        cArr4[kVar.c + 1] = (char) (kVar.b - b);
                    } else {
                        kVar.a = kVar.e / c;
                        kVar.h = kVar.e % c;
                        kVar.d = kVar.b / c;
                        kVar.f = kVar.b % c;
                        if (kVar.h == kVar.f) {
                            int i10 = $10 + 19;
                            $11 = i10 % 128;
                            int i11 = i10 % 2;
                            kVar.a = ((kVar.a + c) - 1) % c;
                            kVar.d = ((kVar.d + c) - 1) % c;
                            int i12 = (kVar.a * c) + kVar.h;
                            int i13 = (kVar.d * c) + kVar.f;
                            cArr4[kVar.c] = cArr2[i12];
                            cArr4[kVar.c + 1] = cArr2[i13];
                        } else if (kVar.a == kVar.d) {
                            int i14 = $11 + 97;
                            $10 = i14 % 128;
                            int i15 = i14 % 2;
                            kVar.h = ((kVar.h + c) - 1) % c;
                            kVar.f = ((kVar.f + c) - 1) % c;
                            int i16 = (kVar.a * c) + kVar.h;
                            int i17 = (kVar.d * c) + kVar.f;
                            cArr4[kVar.c] = cArr2[i16];
                            cArr4[kVar.c + 1] = cArr2[i17];
                        } else {
                            int i18 = (kVar.a * c) + kVar.f;
                            int i19 = (kVar.d * c) + kVar.h;
                            cArr4[kVar.c] = cArr2[i18];
                            cArr4[kVar.c + 1] = cArr2[i19];
                        }
                    }
                } else {
                    kVar.e = cArr[kVar.c];
                    kVar.b = cArr[kVar.c + 1];
                    if (kVar.e == kVar.b) {
                        cArr4[kVar.c] = (char) (kVar.e - b);
                        cArr4[kVar.c + 1] = (char) (kVar.b - b);
                    } else {
                        kVar.a = kVar.e / c;
                        kVar.h = kVar.e % c;
                        kVar.d = kVar.b / c;
                        kVar.f = kVar.b % c;
                        if (kVar.h == kVar.f) {
                            int i110 = $10 + 19;
                            $11 = i110 % 128;
                            int i111 = i110 % 2;
                            kVar.a = ((kVar.a + c) - 1) % c;
                            kVar.d = ((kVar.d + c) - 1) % c;
                            int i112 = (kVar.a * c) + kVar.h;
                            int i113 = (kVar.d * c) + kVar.f;
                            cArr4[kVar.c] = cArr2[i112];
                            cArr4[kVar.c + 1] = cArr2[i113];
                        } else if (kVar.a == kVar.d) {
                            int i114 = $11 + 97;
                            $10 = i114 % 128;
                            int i115 = i114 % 2;
                            kVar.h = ((kVar.h + c) - 1) % c;
                            kVar.f = ((kVar.f + c) - 1) % c;
                            int i116 = (kVar.a * c) + kVar.h;
                            int i117 = (kVar.d * c) + kVar.f;
                            cArr4[kVar.c] = cArr2[i116];
                            cArr4[kVar.c + 1] = cArr2[i117];
                        } else {
                            int i118 = (kVar.a * c) + kVar.f;
                            int i119 = (kVar.d * c) + kVar.h;
                            cArr4[kVar.c] = cArr2[i118];
                            cArr4[kVar.c + 1] = cArr2[i119];
                        }
                    }
                }
                kVar.c += 2;
            }
        }
        int i20 = $11 + 65;
        $10 = i20 % 128;
        int i21 = i20 % 2;
        for (int i22 = 0; i22 < i; i22++) {
            cArr4[i22] = (char) (cArr4[i22] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }
}
