package ivas.gov.bisp.enumeration.p025ay;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.b;
import ivas.gov.bisp.enumeration.BISPApplication;
import ivas.gov.bisp.enumeration.p022av.z;
import ivas.gov.bisp.enumeration.p023aw.a;
import java.util.ArrayList;
import java.util.Objects;
import net.sqlcipher.BuildConfig;
import o.k;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class aA implements View.OnClickListener {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char a$s60$37 = 31405;
    private static int c = 1;
    private static char[] c$s59$37 = {31400, 20298, 20310, 31403, 20337, 31404, 20289, 31402, 31405, 20311, 20316, 20319, 20295, 20343, 20346, 20288};
    private static int d;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ int h;
    public final /* synthetic */ long i;
    public final /* synthetic */ aI j;
    public final /* synthetic */ b k;

    public aA(aI aIVar, boolean z, int i, long j, b bVar) {
        this.j = aIVar;
        this.g = z;
        this.h = i;
        this.i = j;
        this.k = bVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2 % 2;
        int i2 = c + 25;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this.g) {
            this.j.g.remove(this.h);
            this.j.e(this.h);
            aI aIVar = this.j;
            aIVar.a.d(this.h, aIVar.g.size());
            BISPApplication.c().w = 0;
            BISPApplication.c().v = new ArrayList<>();
            Toast.makeText(this.j.f, "Record Deleted", 0).show();
            int i3 = c + 31;
            d = i3 % 128;
            int i4 = i3 % 2;
        } else {
            aI aIVar2 = this.j;
            long j = this.i;
            int i5 = this.h;
            Objects.requireNonNull(aIVar2);
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject.put("roster_id", j);
                aIVar2.l.setCancelable(false);
                aIVar2.l.setTitle("Deleting Roster");
                aIVar2.l.setMessage("Please Wait...");
                aIVar2.l.setProgressStyle(0);
                aIVar2.l.show();
                jSONObject2.put("string1", ivas.gov.bisp.enumeration.bK.b.d(jSONObject.toString(), ivas.gov.bisp.enumeration.bK.b.b(aIVar2.m.k()), ivas.gov.bisp.enumeration.bK.b.b(aIVar2.m.m())));
                byte[] bArrB = ivas.gov.bisp.enumeration.bK.b.b(aIVar2.m.k());
                byte[] bArrB2 = ivas.gov.bisp.enumeration.bK.b.b(aIVar2.m.m());
                Object[] objArr = new Object[1];
                a((byte) (TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0) + 75), 15 - ((byte) KeyEvent.getModifierMetaStateMask()), new char[]{14, 1, '\n', 3, 14, 0, '\n', 14, '\f', '\r', 6, '\n', 5, 0, '\r', '\n'}, objArr);
                jSONObject2.put("string2", ivas.gov.bisp.enumeration.bK.b.d(((String) objArr[0]).intern(), bArrB, bArrB2));
                aF aFVar = new aF(aIVar2, 1, "https://meladeskapp.bisp.gov.pk/api/Roster/bZJVzTu9rHlQm0D", jSONObject2, new aE(aIVar2, i5), new I(aIVar2));
                aFVar.m = new z(130000, 0, 0.0f);
                aFVar.k = false;
                a.b(aIVar2.f).c(aFVar);
            } catch (JSONException unused) {
            }
        }
        this.k.dismiss();
    }

    private static void a(byte b, int i, char[] cArr, Object[] objArr) {
        int i2;
        int i3 = 2 % 2;
        k kVar = new k();
        char[] cArr2 = c$s59$37;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                int i5 = $10 + 85;
                $11 = i5 % 128;
                if (i5 % 2 == 0) {
                    cArr3[i4] = (char) (((long) cArr2[i4]) * 3459633260503792297L);
                } else {
                    cArr3[i4] = (char) (((long) cArr2[i4]) ^ 3459633260503792297L);
                    i4++;
                }
            }
            cArr2 = cArr3;
        }
        char c2 = (char) (3459633260503792297L ^ ((long) a$s60$37));
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i6 = $10 + 23;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                i2 = i + 39;
                cArr4[i2] = (char) (cArr[i2] >>> b);
            } else {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            kVar.c = 0;
            while (kVar.c < i2) {
                kVar.e = cArr[kVar.c];
                kVar.b = cArr[kVar.c + 1];
                if (kVar.e == kVar.b) {
                    int i7 = $11 + 109;
                    $10 = i7 % 128;
                    if (i7 % 2 != 0) {
                        cArr4[kVar.c] = (char) (kVar.e % b);
                        cArr4[kVar.c % 0] = (char) (kVar.b + b);
                    } else {
                        cArr4[kVar.c] = (char) (kVar.e - b);
                        cArr4[kVar.c + 1] = (char) (kVar.b - b);
                    }
                } else {
                    kVar.a = kVar.e / c2;
                    kVar.h = kVar.e % c2;
                    kVar.d = kVar.b / c2;
                    kVar.f = kVar.b % c2;
                    if (kVar.h == kVar.f) {
                        int i8 = $10 + 15;
                        $11 = i8 % 128;
                        int i9 = i8 % 2;
                        kVar.a = ((kVar.a + c2) - 1) % c2;
                        kVar.d = ((kVar.d + c2) - 1) % c2;
                        int i10 = (kVar.a * c2) + kVar.h;
                        int i11 = (kVar.d * c2) + kVar.f;
                        cArr4[kVar.c] = cArr2[i10];
                        cArr4[kVar.c + 1] = cArr2[i11];
                    } else if (kVar.a == kVar.d) {
                        int i12 = $10 + 39;
                        $11 = i12 % 128;
                        int i13 = i12 % 2;
                        kVar.h = ((kVar.h + c2) - 1) % c2;
                        kVar.f = ((kVar.f + c2) - 1) % c2;
                        int i14 = (kVar.a * c2) + kVar.h;
                        int i15 = (kVar.d * c2) + kVar.f;
                        cArr4[kVar.c] = cArr2[i14];
                        cArr4[kVar.c + 1] = cArr2[i15];
                    } else {
                        int i16 = (kVar.a * c2) + kVar.f;
                        int i17 = (kVar.d * c2) + kVar.h;
                        cArr4[kVar.c] = cArr2[i16];
                        cArr4[kVar.c + 1] = cArr2[i17];
                    }
                }
                kVar.c += 2;
            }
        }
        for (int i18 = 0; i18 < i; i18++) {
            cArr4[i18] = (char) (cArr4[i18] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }
}
