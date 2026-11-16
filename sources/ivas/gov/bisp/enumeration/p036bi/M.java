package ivas.gov.bisp.enumeration.p036bi;

import android.util.Log;
import android.widget.ProgressBar;
import ivas.gov.bisp.enumeration.activity.BikeRegistryActivity;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.p024ax.I;

/* JADX INFO: loaded from: classes.dex */
public class M implements I {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ BikeRegistryActivity c;

    public M(BikeRegistryActivity bikeRegistryActivity) {
        this.c = bikeRegistryActivity;
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onError(ResponseMessage responseMessage) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 21) << 1) - (i2 ^ 21);
        a = i3 % 128;
        int i4 = i3 % 2;
        this.c.z.setEnabled(true);
        ProgressBar progressBar = this.c.R;
        int i5 = b;
        int i6 = i5 & 35;
        int i7 = i5 | 35;
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        a = i8 % 128;
        if (i8 % 2 != 0) {
            progressBar.setVisibility(60);
        } else {
            progressBar.setVisibility(8);
        }
        Log.e("API_ERROR", responseMessage.toString());
        Log.e("API_ERROR_MSG", responseMessage.getErrorMessage());
        BikeRegistryActivity bikeRegistryActivity = this.c;
        String errorMessage = responseMessage.getErrorMessage();
        int i9 = b;
        int i10 = i9 & 55;
        int i11 = (((i9 ^ 55) | i10) << 1) - ((i9 | 55) & (~i10));
        a = i11 % 128;
        int i12 = i11 % 2;
        BikeRegistryActivity.o(bikeRegistryActivity, "Failed", errorMessage);
        if (responseMessage.getErrorMessage().toLowerCase().contains("session")) {
            int i13 = a;
            int i14 = i13 & 37;
            int i15 = i14 + ((i13 ^ 37) | i14);
            b = i15 % 128;
            int i16 = i15 % 2;
            this.c.q();
            int i17 = b + 89;
            a = i17 % 128;
            int i18 = i17 % 2;
        }
        int i19 = b;
        int i20 = (i19 & (-54)) | ((~i19) & 53);
        int i21 = (i19 & 53) << 1;
        int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
        a = i22 % 128;
        if (i22 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x009b, code lost:
    
        if (r12.toString().contains("Bike registration completed") != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x009d, code lost:
    
        r11.c.F.clear();
        r12 = r11.c;
        r1 = ivas.gov.bisp.enumeration.p036bi.M.b;
        r4 = r1 | 55;
        r6 = r4 << 1;
        r1 = -((~(r1 & 55)) & r4);
        r4 = (r6 & r1) + (r1 | r6);
        ivas.gov.bisp.enumeration.p036bi.M.a = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00bc, code lost:
    
        if ((r4 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00be, code lost:
    
        r12.z.setVisibility(31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00c4, code lost:
    
        r12.z.setVisibility(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00c9, code lost:
    
        r11.c.L.setVisibility(8);
        r12 = r11.c.w;
        r4 = ivas.gov.bisp.enumeration.p036bi.M.a;
        r6 = r4 ^ 19;
        r4 = ((r4 & 19) | r6) << 1;
        r6 = -r6;
        r7 = (r4 & r6) + (r4 | r6);
        ivas.gov.bisp.enumeration.p036bi.M.b = r7 % 128;
        r7 = r7 % 2;
        r12.setText(net.sqlcipher.BuildConfig.FLAVOR);
        r11.c.x.setText(net.sqlcipher.BuildConfig.FLAVOR);
        r12 = ivas.gov.bisp.enumeration.p036bi.M.a;
        r6 = r12 | 89;
        r7 = ((r6 << 1) - (~(-((~(r12 & 89)) & r6)))) - 1;
        ivas.gov.bisp.enumeration.p036bi.M.b = r7 % 128;
        r7 = r7 % 2;
        r11.c.v.setVisibility(8);
        r12 = r11.c;
        r6 = ivas.gov.bisp.enumeration.p036bi.M.b;
        r7 = (r6 & (-30)) | ((~r6) & 29);
        r6 = (r6 & 29) << 1;
        r8 = ((r7 | r6) << 1) - (r6 ^ r7);
        ivas.gov.bisp.enumeration.p036bi.M.a = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0123, code lost:
    
        if ((r8 % 2) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0125, code lost:
    
        r12.K.setVisibility(31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x012f, code lost:
    
        r12.K.setVisibility(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0135, code lost:
    
        r11.c.u.setText(net.sqlcipher.BuildConfig.FLAVOR);
        r12 = ivas.gov.bisp.enumeration.p036bi.M.a;
        r1 = r12 & 59;
        r1 = (r1 - (~(-(-((r12 ^ 59) | r1))))) - 1;
        ivas.gov.bisp.enumeration.p036bi.M.b = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0149, code lost:
    
        if ((r1 % 2) == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x014b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x014c, code lost:
    
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x014f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x008c, code lost:
    
        if (r12.toString().contains("Bike registration completed") != true) goto L30;
     */
    @Override // ivas.gov.bisp.enumeration.p024ax.I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onSuccess(org.json.JSONObject r12) {
        /*
            Method dump skipped, instruction units count: 415
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p036bi.M.onSuccess(org.json.JSONObject):void");
    }
}
