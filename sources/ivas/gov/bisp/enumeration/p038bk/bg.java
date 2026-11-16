package ivas.gov.bisp.enumeration.p038bk;

import android.view.KeyEvent;
import android.view.View;
import ivas.gov.bisp.enumeration.BISPApplication;
import ivas.gov.bisp.enumeration.bK.ac;
import ivas.gov.bisp.enumeration.bK.b;
import ivas.gov.bisp.enumeration.models.RosterItem;
import o.h;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class bg implements View.OnClickListener {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char a$s76$36 = 54302;
    private static char b$s75$36 = 7261;
    private static int c = 1;
    private static char c$s74$36 = 33428;
    private static int d = 0;
    private static char d$s73$36 = 29088;
    public final /* synthetic */ RosterItem i;
    public final /* synthetic */ bk j;

    public bg(bk bkVar, RosterItem rosterItem) {
        this.j = bkVar;
        this.i = rosterItem;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2 % 2;
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put("hH_ID", this.i.getHhid());
            jSONObject.put("cnic", this.i.getCnic());
            jSONObject.put("r_id", this.i.getrId());
            jSONObject.put("SessionId", BISPApplication.c().s);
            jSONObject.put("IpAddress", ac.h(true));
            jSONObject.put("sessionUserCnic", this.j.g.r());
            jSONObject.put("update_type", "duplicate_cnic");
            jSONObject2.put("string1", b.d(jSONObject.toString(), b.b(this.j.g.k()), b.b(this.j.g.m())));
            byte[] bArrB = b.b(this.j.g.k());
            byte[] bArrB2 = b.b(this.j.g.m());
            Object[] objArr = new Object[1];
            a(((byte) KeyEvent.getModifierMetaStateMask()) + 22, new char[]{48787, 39474, 27528, 1359, 7346, 9570, 54765, 5060, 24684, 35174, 60340, 61809, 55155, 57413, 17569, 58479, 608, 42947, 38565, 5760, 60541, 58541}, objArr);
            jSONObject2.put("string2", b.d(((String) objArr[0]).intern(), bArrB, bArrB2));
            bk.h(this.j, jSONObject2);
            int i2 = c + 11;
            d = i2 % 128;
            int i3 = i2 % 2;
        } catch (JSONException unused) {
        }
    }

    private static void a(int i, char[] cArr, Object[] objArr) {
        int i2 = 2 % 2;
        h hVar = new h();
        char[] cArr2 = new char[cArr.length];
        hVar.d = 0;
        char[] cArr3 = new char[2];
        while (hVar.d < cArr.length) {
            int i3 = $10 + 75;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            cArr3[0] = cArr[hVar.d];
            cArr3[1] = cArr[hVar.d + 1];
            int i5 = 58224;
            for (int i6 = 0; i6 < 16; i6++) {
                int i7 = $11 + 83;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                char c4 = (char) (c2 - (((c3 + i5) ^ ((c3 << 4) + ((char) (((long) b$s75$36) ^ 6963871449151285300L)))) ^ ((c3 >>> 5) + ((char) (((long) a$s76$36) ^ 6963871449151285300L)))));
                cArr3[1] = c4;
                cArr3[0] = (char) (c3 - (((c4 >>> 5) + ((char) (((long) c$s74$36) ^ 6963871449151285300L))) ^ ((c4 + i5) ^ ((c4 << 4) + ((char) (((long) d$s73$36) ^ 6963871449151285300L))))));
                i5 -= 40503;
            }
            cArr2[hVar.d] = cArr3[0];
            cArr2[hVar.d + 1] = cArr3[1];
            hVar.d += 2;
        }
        String str = new String(cArr2, 0, i);
        int i9 = $10 + 37;
        $11 = i9 % 128;
        if (i9 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        objArr[0] = str;
    }
}
