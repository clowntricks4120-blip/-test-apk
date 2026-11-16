package ivas.gov.bisp.enumeration.p025ay;

import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.app.b;
import ivas.gov.bisp.enumeration.p022av.z;
import ivas.gov.bisp.enumeration.p023aw.a;
import java.util.Objects;
import o.m;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class aV implements View.OnClickListener {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int c = 0;
    private static int d = 1;
    private static long d$s51$35 = -4339250396902253743L;
    public final /* synthetic */ long f;
    public final /* synthetic */ int g;
    public final /* synthetic */ b h;
    public final /* synthetic */ aT i;

    public aV(aT aTVar, long j, int i, b bVar) {
        this.i = aTVar;
        this.f = j;
        this.g = i;
        this.h = bVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2 % 2;
        aT aTVar = this.i;
        long j = this.f;
        int i2 = this.g;
        Objects.requireNonNull(aTVar);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("roster_id", j);
            aTVar.l.setCancelable(false);
            aTVar.l.setTitle("Deleting Roster");
            aTVar.l.setMessage("Please Wait...");
            aTVar.l.setProgressStyle(0);
            aTVar.l.show();
            jSONObject2.put("string1", ivas.gov.bisp.enumeration.bK.b.d(jSONObject.toString(), ivas.gov.bisp.enumeration.bK.b.b(aTVar.m.k()), ivas.gov.bisp.enumeration.bK.b.b(aTVar.m.m())));
            byte[] bArrB = ivas.gov.bisp.enumeration.bK.b.b(aTVar.m.k());
            byte[] bArrB2 = ivas.gov.bisp.enumeration.bK.b.b(aTVar.m.m());
            Object[] objArr = new Object[1];
            a(53591 - (ViewConfiguration.getScrollDefaultDelay() >> 16), new char[]{38321, 17607, 14135, 57749, 53469, 33571, 32141, 11515, 7998, 51598, 47350, 27450, 17827, 13543, 59262, 53640}, objArr);
            jSONObject2.put("string2", ivas.gov.bisp.enumeration.bK.b.d(((String) objArr[0]).intern(), bArrB, bArrB2));
            aW aWVar = new aW(aTVar, 1, "https://meladeskapp.bisp.gov.pk/api/Roster/bZJVzTu9rHlQm0D", jSONObject2, new aM(aTVar, i2), new aN(aTVar));
            aWVar.m = new z(130000, 0, 0.0f);
            aWVar.k = false;
            a.b(aTVar.f).c(aWVar);
        } catch (JSONException unused) {
        }
        this.h.dismiss();
        int i3 = d + 101;
        c = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    private static void a(int i, char[] cArr, Object[] objArr) {
        int i2 = 2 % 2;
        m mVar = new m();
        mVar.d = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        mVar.e = 0;
        while (mVar.e < cArr.length) {
            int i3 = $11 + 55;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                jArr[mVar.e] = (6031393033645231780L | d$s51$35) & (((long) cArr[mVar.e]) | (((long) mVar.e) + ((long) mVar.d)));
                int i4 = mVar.e;
                mVar.e = 0;
            } else {
                jArr[mVar.e] = (6031393033645231780L ^ d$s51$35) ^ (((long) cArr[mVar.e]) ^ (((long) mVar.e) * ((long) mVar.d)));
                mVar.e++;
            }
            int i5 = $11 + 75;
            $10 = i5 % 128;
            int i6 = i5 % 2;
        }
        char[] cArr2 = new char[length];
        mVar.e = 0;
        while (mVar.e < cArr.length) {
            cArr2[mVar.e] = (char) jArr[mVar.e];
            mVar.e++;
        }
        objArr[0] = new String(cArr2);
    }
}
