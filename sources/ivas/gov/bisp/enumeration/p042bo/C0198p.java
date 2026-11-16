package ivas.gov.bisp.enumeration.p042bo;

import android.content.Intent;
import android.widget.Toast;
import ivas.gov.bisp.enumeration.activity.UpdateSplittingRosterListActivity;
import ivas.gov.bisp.enumeration.activity.nadra.UpdateNadraRosterList;
import ivas.gov.bisp.enumeration.bK.af;
import ivas.gov.bisp.enumeration.bK.b;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.p024ax.I;
import ivas.gov.bisp.enumeration.p024ax.ax;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bo.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0198p implements I {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ UpdateNadraRosterList c;

    public C0198p(UpdateNadraRosterList updateNadraRosterList) {
        this.c = updateNadraRosterList;
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onError(ResponseMessage responseMessage) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 103;
        int i4 = -(-(i2 | 103));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        ax.b(this.c.al);
        UpdateNadraRosterList updateNadraRosterList = this.c;
        int i7 = a;
        int i8 = i7 & 75;
        int i9 = (((i7 ^ 75) | i8) << 1) - ((i7 | 75) & (~i8));
        b = i9 % 128;
        int i10 = i9 % 2;
        af.b(updateNadraRosterList, responseMessage.getErrorMessage(), responseMessage.isLogout());
        int i11 = a;
        int i12 = i11 & 17;
        int i13 = (((i11 ^ 17) | i12) << 1) - ((i11 | 17) & (~i12));
        b = i13 % 128;
        int i14 = i13 % 2;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onSuccess(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 29;
        int i4 = ((i2 ^ 29) | i3) << 1;
        int i5 = -((i2 | 29) & (~i3));
        int i6 = (i4 & i5) + (i5 | i4);
        a = i6 % 128;
        try {
            if (i6 % 2 == 0) {
                ax.b(this.c.al);
                throw null;
            }
            ax.b(this.c.al);
            String string = jSONObject.getString("result");
            SessionManager sessionManager = this.c.ag;
            int i7 = b;
            int i8 = i7 & 45;
            int i9 = i8 + ((i7 ^ 45) | i8);
            a = i9 % 128;
            int i10 = i9 % 2;
            byte[] bArrB = b.b(sessionManager.k());
            UpdateNadraRosterList updateNadraRosterList = this.c;
            int i11 = a;
            int i12 = i11 & 13;
            int i13 = (((i11 ^ 13) | i12) << 1) - ((i11 | 13) & (~i12));
            b = i13 % 128;
            int i14 = i13 % 2;
            byte[] bArrB2 = b.b(updateNadraRosterList.ag.m());
            int i15 = b;
            int i16 = i15 | 41;
            int i17 = i16 << 1;
            int i18 = -((~(i15 & 41)) & i16);
            int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
            a = i19 % 128;
            if (i19 % 2 == 0) {
                this.c.w(b.c(string, bArrB, bArrB2));
                int i20 = 55 / 0;
            } else {
                this.c.w(b.c(string, bArrB, bArrB2));
            }
            int i21 = b;
            int i22 = (-2) - (((i21 & 50) + (i21 | 50)) ^ (-1));
            a = i22 % 128;
            if (i22 % 2 == 0) {
                throw null;
            }
        } catch (JSONException unused) {
            Toast.makeText(this.c, "Error : No Family Members Return", 0).show();
            Toast.makeText(this.c, "Please Enter Another CNIC", 0).show();
            this.c.startActivity(new Intent(this.c, (Class<?>) UpdateSplittingRosterListActivity.class));
            this.c.finish();
        }
    }
}
