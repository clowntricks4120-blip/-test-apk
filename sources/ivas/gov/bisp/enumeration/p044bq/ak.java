package ivas.gov.bisp.enumeration.p044bq;

import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.p024ax.aE;
import ivas.gov.bisp.enumeration.p096p.h;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class ak implements aE {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ ag c;

    public ak(ag agVar) {
        this.c = agVar;
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.aE
    public void onError(ResponseMessage responseMessage) {
        h hVar;
        String errorMessage;
        boolean z;
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 24) + ((i2 & 24) << 1)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        this.c.h.dismiss();
        int i5 = b;
        int i6 = i5 & 53;
        int i7 = i6 + ((i5 ^ 53) | i6);
        a = i7 % 128;
        if (i7 % 2 == 0) {
            hVar = this.c.k;
            errorMessage = responseMessage.getErrorMessage();
            z = false;
        } else {
            hVar = this.c.k;
            errorMessage = responseMessage.getErrorMessage();
            z = true;
        }
        int i8 = a;
        int i9 = i8 & 31;
        int i10 = i8 | 31;
        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
        b = i11 % 128;
        int i12 = i11 % 2;
        hVar.aJ(z, errorMessage);
        if (responseMessage.isLogout()) {
            ag agVar = this.c;
            w wVar = new w(agVar.m, agVar.A);
            int i13 = a;
            int i14 = i13 & 59;
            int i15 = (i13 | 59) & (~i14);
            int i16 = -(-(i14 << 1));
            int i17 = ((i15 | i16) << 1) - (i15 ^ i16);
            b = i17 % 128;
            int i18 = i17 % 2;
            wVar.execute(new Void[0]);
            int i19 = a;
            int i20 = (i19 ^ 93) + ((i19 & 93) << 1);
            b = i20 % 128;
            int i21 = i20 % 2;
        }
        int i22 = b;
        int i23 = i22 & 99;
        int i24 = (i22 ^ 99) | i23;
        int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
        a = i25 % 128;
        int i26 = i25 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.aE
    public void onSuccess(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 69;
        int i4 = -(-((i2 ^ 69) | i3));
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        Object obj = null;
        try {
            if (i5 % 2 != 0) {
                jSONObject.getString("message").contains("Image Saved");
                throw null;
            }
            jSONObject.getString("message").contains("Image Saved");
            int i6 = b;
            int i7 = i6 & 59;
            int i8 = -(-((i6 ^ 59) | i7));
            int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
            a = i9 % 128;
            int i10 = i9 % 2;
            int i11 = (i6 & 62) + (i6 | 62);
            int i12 = (i11 ^ (-1)) + (i11 << 1);
            a = i12 % 128;
            if (i12 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        } catch (Exception unused) {
        }
    }
}
