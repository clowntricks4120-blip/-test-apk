package ivas.gov.bisp.enumeration.p049bv;

import android.graphics.ImageFormat;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import ivas.gov.bisp.enumeration.BISPApplication;
import ivas.gov.bisp.enumeration.bK.b;
import ivas.gov.bisp.enumeration.enumerator.ActivityEnumeratorMain;
import ivas.gov.bisp.enumeration.p024ax.ax;
import ivas.gov.bisp.enumeration.p091n.j;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import o.h;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bv.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class ViewOnClickListenerC0219p implements View.OnClickListener {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char a$s76$35 = 37888;
    private static char b$s75$35 = 8453;
    private static int c = 0;
    private static char c$s74$35 = 36301;
    private static int d = 1;
    private static char d$s73$35 = 8499;
    public final /* synthetic */ ActivityEnumeratorMain i;

    public ViewOnClickListenerC0219p(ActivityEnumeratorMain activityEnumeratorMain) {
        this.i = activityEnumeratorMain;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2 % 2;
        Log.e("TAG", "onClick: actionSync");
        ActivityEnumeratorMain activityEnumeratorMain = this.i;
        ActivityEnumeratorMain activityEnumeratorMain2 = ActivityEnumeratorMain.ac;
        Objects.requireNonNull(activityEnumeratorMain);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("Data", "BISP NSER Dynamic Registry");
            jSONObject2.put("string1", b.d(jSONObject.toString(), b.b(activityEnumeratorMain.aj.k()), b.b(activityEnumeratorMain.aj.m())));
            byte[] bArrB = b.b(activityEnumeratorMain.aj.k());
            byte[] bArrB2 = b.b(activityEnumeratorMain.aj.m());
            Object[] objArr = new Object[1];
            a(15 - ImageFormat.getBitsPerPixel(0), new char[]{53672, 21126, 49020, 40454, 11736, 22779, 22025, 51047, 59448, 59317, 24209, 54151, 26732, 21083, 25695, 37080}, objArr);
            jSONObject2.put("string2", b.d(((String) objArr[0]).intern(), bArrB, bArrB2));
            ax.h(activityEnumeratorMain.ai, "Please wait!");
            ax.e(jSONObject2, activityEnumeratorMain, "https://meladeskapp.bisp.gov.pk/api/Users/UbZJVzTu9rHlQm0D", new c(activityEnumeratorMain));
        } catch (JSONException unused) {
        }
        ActivityEnumeratorMain activityEnumeratorMain3 = this.i;
        Objects.requireNonNull(activityEnumeratorMain3);
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory());
        String str = File.separator;
        File file = new File(j.u(sb, str, ".Backup"));
        boolean zMkdirs = !file.exists() ? file.mkdirs() : true;
        if (zMkdirs) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(file.getPath());
            sb2.append(str);
            sb2.append(new SimpleDateFormat("dd-MM-yyyy").format(new Date()));
            activityEnumeratorMain3.am = sb2.toString();
            File file2 = new File(activityEnumeratorMain3.am);
            if (true ^ file2.exists()) {
                int i2 = d + 41;
                c = i2 % 128;
                if (i2 % 2 != 0) {
                    file2.mkdirs();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                zMkdirs = file2.mkdirs();
            }
            if (zMkdirs) {
                try {
                    FileInputStream fileInputStream = new FileInputStream(new File("/data/data/ivas.gov.bisp.enumeration/databases/enumeration"));
                    BISPApplication bISPApplication = (BISPApplication) activityEnumeratorMain3.getApplicationContext();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(activityEnumeratorMain3.am);
                    sb3.append(str);
                    sb3.append(bISPApplication.f42o);
                    FileOutputStream fileOutputStream = new FileOutputStream(sb3.toString());
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i3 = fileInputStream.read(bArr);
                        if (i3 <= 0) {
                            break;
                        } else {
                            fileOutputStream.write(bArr, 0, i3);
                        }
                    }
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    fileInputStream.close();
                    int i4 = c + 85;
                    d = i4 % 128;
                    int i5 = i4 % 2;
                } catch (IOException e) {
                    Log.e("dbBackup:", e.getMessage());
                }
            }
        }
        ActivityEnumeratorMain activityEnumeratorMain4 = this.i;
        activityEnumeratorMain4.al.setVisibility(0);
        ax.e(new JSONObject(), activityEnumeratorMain4, "https://meladeskapp.bisp.gov.pk/api/Roster/GetEWalletOperators", new h(activityEnumeratorMain4));
    }

    private static void a(int i, char[] cArr, Object[] objArr) {
        int i2;
        int i3 = 2 % 2;
        h hVar = new h();
        char[] cArr2 = new char[cArr.length];
        hVar.d = 0;
        char[] cArr3 = new char[2];
        while (hVar.d < cArr.length) {
            int i4 = $10 + 57;
            $11 = i4 % 128;
            int i5 = 58224;
            if (i4 % 2 == 0) {
                cArr3[1] = cArr[hVar.d];
                cArr3[0] = cArr[hVar.d];
                i2 = 1;
            } else {
                cArr3[0] = cArr[hVar.d];
                cArr3[1] = cArr[hVar.d + 1];
                i2 = 0;
            }
            while (i2 < 16) {
                int i6 = $11 + 47;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                char c4 = (char) (c2 - (((c3 + i5) ^ ((c3 << 4) + ((char) (((long) b$s75$35) ^ 6963871449151285300L)))) ^ ((c3 >>> 5) + ((char) (((long) a$s76$35) ^ 6963871449151285300L)))));
                cArr3[1] = c4;
                cArr3[0] = (char) (c3 - (((c4 >>> 5) + ((char) (((long) c$s74$35) ^ 6963871449151285300L))) ^ ((c4 + i5) ^ ((c4 << 4) + ((char) (((long) d$s73$35) ^ 6963871449151285300L))))));
                i5 -= 40503;
                i2++;
            }
            cArr2[hVar.d] = cArr3[0];
            cArr2[hVar.d + 1] = cArr3[1];
            hVar.d += 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }
}
