package ivas.gov.bisp.enumeration.p023aw;

import ivas.gov.bisp.enumeration.o0ooOO0.o00Ooo;
import ivas.gov.bisp.enumeration.o0ooOOo.OooOOO0;
import ivas.gov.bisp.enumeration.p022av.C0094m;
import ivas.gov.bisp.enumeration.p022av.C0095o;
import ivas.gov.bisp.enumeration.p022av.x;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aw.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0098p extends OooOOO0<JSONObject> {
    private static int a = 1;
    private static int b;

    /* JADX WARN: Illegal instructions before constructor call */
    public C0098p(int i, String str, JSONObject jSONObject, o00Ooo.OooO0O0<JSONObject> oooO0O0, C0094m.bas basVar) {
        String string;
        if (jSONObject != null) {
            int i2 = b;
            int i3 = i2 ^ 9;
            int i4 = -(-((i2 & 9) << 1));
            int i5 = (i3 & i4) + (i4 | i3);
            a = i5 % 128;
            int i6 = i5 % 2;
            string = jSONObject.toString();
            int i7 = a + 23;
            b = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 2 % 2;
            }
        } else {
            int i9 = b + 7;
            a = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 2 % 2;
            }
            string = null;
        }
        super(i, str, string, oooO0O0, basVar);
    }

    public o00Ooo<JSONObject> p(C0095o c0095o) {
        int i = 2 % 2;
        try {
            C0094m c0094m = new C0094m(new JSONObject(new String(c0095o.d, r.d(c0095o.e, "utf-8"))), r.c(c0095o));
            int i2 = b;
            int i3 = i2 & 53;
            int i4 = -(-((i2 ^ 53) | i3));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            a = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 38 / 0;
            }
            return c0094m;
        } catch (UnsupportedEncodingException e) {
            return new C0094m(new x(e));
        } catch (JSONException e2) {
            return new C0094m(new x(e2));
        }
    }
}
