package ivas.gov.bisp.enumeration.p038bk;

import android.view.View;
import android.view.ViewConfiguration;
import ivas.gov.bisp.enumeration.BISPApplication;
import ivas.gov.bisp.enumeration.bK.ac;
import ivas.gov.bisp.enumeration.bK.b;
import ivas.gov.bisp.enumeration.models.RosterItem;
import o.m;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class bb implements View.OnClickListener {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int c = 0;
    private static int d = 1;
    private static long d$s51$33 = -8756289471732485565L;
    public final /* synthetic */ RosterItem f;
    public final /* synthetic */ bs g;

    public bb(bs bsVar, RosterItem rosterItem) {
        this.g = bsVar;
        this.f = rosterItem;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2 % 2;
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put("hH_ID", this.f.getHhid());
            jSONObject.put("cnic", this.f.getCnic());
            jSONObject.put("r_id", this.f.getrId());
            jSONObject.put("SessionId", BISPApplication.c().s);
            jSONObject.put("IpAddress", ac.h(true));
            jSONObject.put("sessionUserCnic", this.g.g.r());
            jSONObject.put("update_type", "duplicate_cnic");
            jSONObject2.put("string1", b.d(jSONObject.toString(), b.b(this.g.g.k()), b.b(this.g.g.m())));
            byte[] bArrB = b.b(this.g.g.k());
            byte[] bArrB2 = b.b(this.g.g.m());
            Object[] objArr = new Object[1];
            a(27407 - (ViewConfiguration.getLongPressTimeout() >> 16), new char[]{64690, 38808, 10909, 48555, 20655, 60361, 32495, 4577, 42220, 16148, 53780, 25904, 63505, 37701, 9798, 47471, 19572, 59217, 31623, 3740, 41380}, objArr);
            jSONObject2.put("string2", b.d(((String) objArr[0]).intern(), bArrB, bArrB2));
            bs.h(this.g, jSONObject2);
            int i2 = d + 37;
            c = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (JSONException unused) {
        }
    }

    private static void a(int i, char[] cArr, Object[] objArr) {
        int i2;
        int i3 = 2 % 2;
        m mVar = new m();
        mVar.d = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        mVar.e = 0;
        while (mVar.e < cArr.length) {
            int i4 = $10 + 43;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            jArr[mVar.e] = (((long) cArr[mVar.e]) ^ (((long) mVar.e) * ((long) mVar.d))) ^ (d$s51$33 ^ 6031393033645231780L);
            mVar.e++;
        }
        char[] cArr2 = new char[length];
        mVar.e = 0;
        while (mVar.e < cArr.length) {
            int i6 = $10 + 107;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                cArr2[mVar.e] = (char) jArr[mVar.e];
                i2 = mVar.e;
            } else {
                cArr2[mVar.e] = (char) jArr[mVar.e];
                i2 = mVar.e + 1;
            }
            mVar.e = i2;
        }
        objArr[0] = new String(cArr2);
    }
}
