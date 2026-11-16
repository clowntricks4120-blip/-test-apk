package ivas.gov.bisp.enumeration.p044bq;

import android.app.ProgressDialog;
import android.util.Base64;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import ivas.gov.bisp.enumeration.bK.b;
import ivas.gov.bisp.enumeration.bq.ag.bwE;
import ivas.gov.bisp.enumeration.bq.ag.bwF;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.p024ax.aE;
import ivas.gov.bisp.enumeration.p024ax.ax;
import net.sqlcipher.BuildConfig;
import o.e;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class aj implements aE {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int c = 1;
    private static int d;
    public final /* synthetic */ JSONObject g;
    public final /* synthetic */ ag h;
    private static char[] e$s2$44 = {45058, 21675, 31019, 7570, 8723, 50830, 60247, 36844, 37954, 47304, 23882, 25115, 1704, 11047, 53147, 54321, 63736, 40296, 41467, 18006, 27349, 3938, 5170, 14498, 56592, 57758, 34332};
    private static long d$s3$44 = 4611089050517282295L;

    public aj(ag agVar, JSONObject jSONObject) {
        this.h = agVar;
        this.g = jSONObject;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    @Override // ivas.gov.bisp.enumeration.p024ax.aE
    public void onError(ResponseMessage responseMessage) {
        int i = 2 % 2;
        ProgressDialog progressDialog = this.h.h;
        if (progressDialog != null) {
            int i2 = c + 21;
            d = i2 % 128;
            int i3 = i2 % 2;
            boolean zIsShowing = progressDialog.isShowing();
            if (i3 != 0) {
                int i4 = 59 / 0;
                if (zIsShowing) {
                    int i5 = d + 63;
                    c = i5 % 128;
                    int i6 = i5 % 2;
                    this.h.h.dismiss();
                }
            } else if (zIsShowing) {
                int i7 = d + 63;
                c = i7 % 128;
                int i8 = i7 % 2;
                this.h.h.dismiss();
            }
        }
        AppDatabase appDatabaseL = AppDatabase.l(this.h.m.getApplicationContext());
        appDatabaseL.m().F();
        appDatabaseL.m().E();
        appDatabaseL.m().A();
        this.h.new bwE(this.g.toString()).execute(new Void[0]);
        this.h.k.aJ(true, responseMessage.getErrorMessage());
        if (responseMessage.isLogout()) {
            ag agVar = this.h;
            new w(agVar.m, agVar.A).execute(new Void[0]);
        }
        int i9 = d + 111;
        c = i9 % 128;
        int i10 = i9 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.aE
    public void onSuccess(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = d + 85;
        c = i2 % 128;
        int i3 = i2 % 2;
        try {
            String string = jSONObject.getString("message");
            AppDatabase appDatabaseL = AppDatabase.l(this.h.m.getApplicationContext());
            appDatabaseL.m().F();
            appDatabaseL.m().E();
            appDatabaseL.m().A();
            if (!string.contains("Record Submitted")) {
                this.h.new bwE(this.g.toString()).execute(new Void[0]);
                return;
            }
            this.h.w = new JSONObject();
            this.h.B = new JSONObject();
            for (int i4 = 0; i4 < this.h.f74o.size(); i4++) {
                if (this.h.f74o.get(i4).bioImage != null) {
                    this.h.w.put("image_thumb_roster", Base64.encodeToString(this.h.f74o.get(i4).bioImage, 0));
                    ag agVar = this.h;
                    agVar.w.put("cnic", agVar.f74o.get(i4).cnic.replaceAll("-", BuildConfig.FLAVOR));
                    this.h.B.put("string1", b.d(this.h.w.toString(), b.b(this.h.A.k()), b.b(this.h.A.m())));
                    ag agVar2 = this.h;
                    JSONObject jSONObject2 = agVar2.B;
                    byte[] bArrB = b.b(agVar2.A.k());
                    byte[] bArrB2 = b.b(this.h.A.m());
                    Object[] objArr = new Object[1];
                    a(27 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 51500), KeyEvent.normalizeMetaState(0), objArr);
                    jSONObject2.put("string2", b.d(((String) objArr[0]).intern(), bArrB, bArrB2));
                    ag agVar3 = this.h;
                    ax.d(false, agVar3.B, agVar3.m, "/api/Roster/bZJVzTu9rHlQm0D", new ak(agVar3));
                    int i5 = c + 51;
                    d = i5 % 128;
                    int i6 = i5 % 2;
                }
            }
            this.h.new bwF().execute(new Void[0]);
        } catch (Exception unused) {
            AppDatabase appDatabaseL2 = AppDatabase.l(this.h.m.getApplicationContext());
            appDatabaseL2.m().F();
            appDatabaseL2.m().E();
            appDatabaseL2.m().A();
            this.h.new bwE(this.g.toString()).execute(new Void[0]);
        }
    }

    private static void a(int i, char c2, int i2, Object[] objArr) {
        int i3;
        int i4 = 2 % 2;
        e eVar = new e();
        long[] jArr = new long[i];
        eVar.d = 0;
        while (eVar.d < i) {
            int i5 = $10 + 101;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            jArr[eVar.d] = (((long) ((char) (((long) e$s2$44[i2 + eVar.d]) ^ (-9150281428767639173L)))) ^ (((long) eVar.d) * ((-9150281428767639173L) ^ d$s3$44))) ^ ((long) c2);
            eVar.d++;
        }
        char[] cArr = new char[i];
        eVar.d = 0;
        while (eVar.d < i) {
            int i7 = $11 + 87;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                cArr[eVar.d] = (char) jArr[eVar.d];
                i3 = eVar.d / 0;
            } else {
                cArr[eVar.d] = (char) jArr[eVar.d];
                i3 = eVar.d + 1;
            }
            eVar.d = i3;
        }
        objArr[0] = new String(cArr);
    }
}
