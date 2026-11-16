package ivas.gov.bisp.enumeration.p031bd;

import android.content.DialogInterface;
import android.widget.TextView;
import ivas.gov.bisp.enumeration.activity.discrepancy.DisabilityDiscrepancyActivity;
import ivas.gov.bisp.enumeration.bK.af;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.p024ax.I;
import ivas.gov.bisp.enumeration.p024ax.ax;

/* JADX INFO: loaded from: classes.dex */
public class e implements I {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ DisabilityDiscrepancyActivity c;

    public class bhU implements DialogInterface.OnClickListener {
        private static int a = 0;
        private static int b = 1;

        public bhU(e eVar) {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = i3 & 37;
            int i5 = i4 + ((i3 ^ 37) | i4);
            b = i5 % 128;
            int i6 = i5 % 2;
            dialogInterface.cancel();
            int i7 = b + 67;
            a = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    public e(DisabilityDiscrepancyActivity disabilityDiscrepancyActivity) {
        this.c = disabilityDiscrepancyActivity;
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onError(ResponseMessage responseMessage) {
        TextView textView;
        DisabilityDiscrepancyActivity disabilityDiscrepancyActivity;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 119;
        int i4 = ((i2 & 119) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        a = i6 % 128;
        if (i6 % 2 == 0) {
            ax.b(this.c.aQ);
            textView = this.c.aj;
            int i7 = 84 / 0;
        } else {
            ax.b(this.c.aQ);
            textView = this.c.aj;
        }
        int i8 = b;
        int i9 = (((i8 | 80) << 1) - (i8 ^ 80)) - 1;
        a = i9 % 128;
        if (i9 % 2 == 0) {
            textView.setVisibility(18);
            disabilityDiscrepancyActivity = this.c;
        } else {
            textView.setVisibility(8);
            disabilityDiscrepancyActivity = this.c;
        }
        disabilityDiscrepancyActivity.ak.setVisibility(0);
        this.c.aj.setEnabled(false);
        DisabilityDiscrepancyActivity disabilityDiscrepancyActivity2 = this.c;
        int i10 = a;
        int i11 = i10 & 47;
        int i12 = ((((i10 ^ 47) | i11) << 1) - (~(-((i10 | 47) & (~i11))))) - 1;
        b = i12 % 128;
        if (i12 % 2 != 0) {
            disabilityDiscrepancyActivity2.ae.setEnabled(false);
        } else {
            disabilityDiscrepancyActivity2.ae.setEnabled(true);
        }
        DisabilityDiscrepancyActivity disabilityDiscrepancyActivity3 = this.c;
        String errorMessage = responseMessage.getErrorMessage();
        int i13 = b;
        int i14 = ((i13 & (-72)) | ((~i13) & 71)) + ((i13 & 71) << 1);
        a = i14 % 128;
        int i15 = i14 % 2;
        af.b(disabilityDiscrepancyActivity3, errorMessage, responseMessage.isLogout());
        int i16 = a + 103;
        b = i16 % 128;
        if (i16 % 2 != 0) {
            int i17 = 13 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:129:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:131:0x0308 A[Catch: JSONException -> 0x05b6, TRY_ENTER, TRY_LEAVE, TryCatch #12 {JSONException -> 0x05b6, blocks: (B:5:0x001b, B:8:0x0040, B:11:0x006f, B:14:0x0093, B:16:0x00a5, B:19:0x00c6, B:21:0x00d3, B:27:0x00e3, B:30:0x0101, B:33:0x013a, B:35:0x0144, B:43:0x016d, B:45:0x017b, B:191:0x04c4, B:76:0x0201, B:78:0x0207, B:86:0x0215, B:91:0x0227, B:93:0x022d, B:98:0x0232, B:84:0x020e, B:118:0x02df, B:120:0x02e5, B:131:0x0308, B:133:0x030e, B:142:0x031d, B:145:0x0334, B:147:0x0341, B:149:0x0353, B:151:0x0363, B:154:0x0380, B:155:0x0384, B:139:0x0315, B:126:0x02ec, B:50:0x0180, B:40:0x0149, B:194:0x04e8, B:196:0x04f0, B:197:0x04f3, B:26:0x00d8, B:200:0x04f6, B:202:0x050b, B:205:0x0520, B:206:0x0522, B:208:0x052b, B:211:0x0558, B:216:0x057c, B:218:0x0587, B:207:0x0528, B:222:0x058b, B:224:0x0596, B:228:0x059a, B:230:0x05a2, B:234:0x05a6, B:236:0x05b0, B:237:0x05b3), top: B:266:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:139:0x0315 A[Catch: JSONException -> 0x05b6, TRY_ENTER, TryCatch #12 {JSONException -> 0x05b6, blocks: (B:5:0x001b, B:8:0x0040, B:11:0x006f, B:14:0x0093, B:16:0x00a5, B:19:0x00c6, B:21:0x00d3, B:27:0x00e3, B:30:0x0101, B:33:0x013a, B:35:0x0144, B:43:0x016d, B:45:0x017b, B:191:0x04c4, B:76:0x0201, B:78:0x0207, B:86:0x0215, B:91:0x0227, B:93:0x022d, B:98:0x0232, B:84:0x020e, B:118:0x02df, B:120:0x02e5, B:131:0x0308, B:133:0x030e, B:142:0x031d, B:145:0x0334, B:147:0x0341, B:149:0x0353, B:151:0x0363, B:154:0x0380, B:155:0x0384, B:139:0x0315, B:126:0x02ec, B:50:0x0180, B:40:0x0149, B:194:0x04e8, B:196:0x04f0, B:197:0x04f3, B:26:0x00d8, B:200:0x04f6, B:202:0x050b, B:205:0x0520, B:206:0x0522, B:208:0x052b, B:211:0x0558, B:216:0x057c, B:218:0x0587, B:207:0x0528, B:222:0x058b, B:224:0x0596, B:228:0x059a, B:230:0x05a2, B:234:0x05a6, B:236:0x05b0, B:237:0x05b3), top: B:266:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:141:0x031c  */
    /* JADX WARN: Code duplicated, block: B:142:0x031d A[Catch: JSONException -> 0x05b6, TRY_LEAVE, TryCatch #12 {JSONException -> 0x05b6, blocks: (B:5:0x001b, B:8:0x0040, B:11:0x006f, B:14:0x0093, B:16:0x00a5, B:19:0x00c6, B:21:0x00d3, B:27:0x00e3, B:30:0x0101, B:33:0x013a, B:35:0x0144, B:43:0x016d, B:45:0x017b, B:191:0x04c4, B:76:0x0201, B:78:0x0207, B:86:0x0215, B:91:0x0227, B:93:0x022d, B:98:0x0232, B:84:0x020e, B:118:0x02df, B:120:0x02e5, B:131:0x0308, B:133:0x030e, B:142:0x031d, B:145:0x0334, B:147:0x0341, B:149:0x0353, B:151:0x0363, B:154:0x0380, B:155:0x0384, B:139:0x0315, B:126:0x02ec, B:50:0x0180, B:40:0x0149, B:194:0x04e8, B:196:0x04f0, B:197:0x04f3, B:26:0x00d8, B:200:0x04f6, B:202:0x050b, B:205:0x0520, B:206:0x0522, B:208:0x052b, B:211:0x0558, B:216:0x057c, B:218:0x0587, B:207:0x0528, B:222:0x058b, B:224:0x0596, B:228:0x059a, B:230:0x05a2, B:234:0x05a6, B:236:0x05b0, B:237:0x05b3), top: B:266:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:144:0x0325  */
    /* JADX WARN: Code duplicated, block: B:151:0x0363 A[Catch: JSONException -> 0x05b6, TRY_ENTER, TRY_LEAVE, TryCatch #12 {JSONException -> 0x05b6, blocks: (B:5:0x001b, B:8:0x0040, B:11:0x006f, B:14:0x0093, B:16:0x00a5, B:19:0x00c6, B:21:0x00d3, B:27:0x00e3, B:30:0x0101, B:33:0x013a, B:35:0x0144, B:43:0x016d, B:45:0x017b, B:191:0x04c4, B:76:0x0201, B:78:0x0207, B:86:0x0215, B:91:0x0227, B:93:0x022d, B:98:0x0232, B:84:0x020e, B:118:0x02df, B:120:0x02e5, B:131:0x0308, B:133:0x030e, B:142:0x031d, B:145:0x0334, B:147:0x0341, B:149:0x0353, B:151:0x0363, B:154:0x0380, B:155:0x0384, B:139:0x0315, B:126:0x02ec, B:50:0x0180, B:40:0x0149, B:194:0x04e8, B:196:0x04f0, B:197:0x04f3, B:26:0x00d8, B:200:0x04f6, B:202:0x050b, B:205:0x0520, B:206:0x0522, B:208:0x052b, B:211:0x0558, B:216:0x057c, B:218:0x0587, B:207:0x0528, B:222:0x058b, B:224:0x0596, B:228:0x059a, B:230:0x05a2, B:234:0x05a6, B:236:0x05b0, B:237:0x05b3), top: B:266:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:154:0x0380 A[Catch: JSONException -> 0x05b6, TRY_ENTER, TryCatch #12 {JSONException -> 0x05b6, blocks: (B:5:0x001b, B:8:0x0040, B:11:0x006f, B:14:0x0093, B:16:0x00a5, B:19:0x00c6, B:21:0x00d3, B:27:0x00e3, B:30:0x0101, B:33:0x013a, B:35:0x0144, B:43:0x016d, B:45:0x017b, B:191:0x04c4, B:76:0x0201, B:78:0x0207, B:86:0x0215, B:91:0x0227, B:93:0x022d, B:98:0x0232, B:84:0x020e, B:118:0x02df, B:120:0x02e5, B:131:0x0308, B:133:0x030e, B:142:0x031d, B:145:0x0334, B:147:0x0341, B:149:0x0353, B:151:0x0363, B:154:0x0380, B:155:0x0384, B:139:0x0315, B:126:0x02ec, B:50:0x0180, B:40:0x0149, B:194:0x04e8, B:196:0x04f0, B:197:0x04f3, B:26:0x00d8, B:200:0x04f6, B:202:0x050b, B:205:0x0520, B:206:0x0522, B:208:0x052b, B:211:0x0558, B:216:0x057c, B:218:0x0587, B:207:0x0528, B:222:0x058b, B:224:0x0596, B:228:0x059a, B:230:0x05a2, B:234:0x05a6, B:236:0x05b0, B:237:0x05b3), top: B:266:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:155:0x0384 A[Catch: JSONException -> 0x05b6, TRY_LEAVE, TryCatch #12 {JSONException -> 0x05b6, blocks: (B:5:0x001b, B:8:0x0040, B:11:0x006f, B:14:0x0093, B:16:0x00a5, B:19:0x00c6, B:21:0x00d3, B:27:0x00e3, B:30:0x0101, B:33:0x013a, B:35:0x0144, B:43:0x016d, B:45:0x017b, B:191:0x04c4, B:76:0x0201, B:78:0x0207, B:86:0x0215, B:91:0x0227, B:93:0x022d, B:98:0x0232, B:84:0x020e, B:118:0x02df, B:120:0x02e5, B:131:0x0308, B:133:0x030e, B:142:0x031d, B:145:0x0334, B:147:0x0341, B:149:0x0353, B:151:0x0363, B:154:0x0380, B:155:0x0384, B:139:0x0315, B:126:0x02ec, B:50:0x0180, B:40:0x0149, B:194:0x04e8, B:196:0x04f0, B:197:0x04f3, B:26:0x00d8, B:200:0x04f6, B:202:0x050b, B:205:0x0520, B:206:0x0522, B:208:0x052b, B:211:0x0558, B:216:0x057c, B:218:0x0587, B:207:0x0528, B:222:0x058b, B:224:0x0596, B:228:0x059a, B:230:0x05a2, B:234:0x05a6, B:236:0x05b0, B:237:0x05b3), top: B:266:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:164:0x03c8 A[Catch: JSONException -> 0x04c1, TRY_ENTER, TryCatch #0 {JSONException -> 0x04c1, blocks: (B:57:0x01aa, B:61:0x01bf, B:67:0x01e0, B:99:0x0236, B:101:0x024c, B:104:0x0263, B:107:0x0283, B:110:0x02a2, B:111:0x02a5, B:113:0x02ac, B:167:0x03dc, B:171:0x0493, B:178:0x04af, B:179:0x04b1, B:180:0x04b4, B:157:0x0388, B:159:0x039e, B:161:0x03b4, B:164:0x03c8, B:165:0x03cc, B:112:0x02a8, B:105:0x0269, B:71:0x01ea, B:183:0x04b7, B:185:0x04bb, B:186:0x04be), top: B:243:0x01aa }] */
    /* JADX WARN: Code duplicated, block: B:165:0x03cc A[Catch: JSONException -> 0x04c1, TRY_LEAVE, TryCatch #0 {JSONException -> 0x04c1, blocks: (B:57:0x01aa, B:61:0x01bf, B:67:0x01e0, B:99:0x0236, B:101:0x024c, B:104:0x0263, B:107:0x0283, B:110:0x02a2, B:111:0x02a5, B:113:0x02ac, B:167:0x03dc, B:171:0x0493, B:178:0x04af, B:179:0x04b1, B:180:0x04b4, B:157:0x0388, B:159:0x039e, B:161:0x03b4, B:164:0x03c8, B:165:0x03cc, B:112:0x02a8, B:105:0x0269, B:71:0x01ea, B:183:0x04b7, B:185:0x04bb, B:186:0x04be), top: B:243:0x01aa }] */
    /* JADX WARN: Code duplicated, block: B:190:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:86:0x0215 A[Catch: JSONException -> 0x05b6, TRY_LEAVE, TryCatch #12 {JSONException -> 0x05b6, blocks: (B:5:0x001b, B:8:0x0040, B:11:0x006f, B:14:0x0093, B:16:0x00a5, B:19:0x00c6, B:21:0x00d3, B:27:0x00e3, B:30:0x0101, B:33:0x013a, B:35:0x0144, B:43:0x016d, B:45:0x017b, B:191:0x04c4, B:76:0x0201, B:78:0x0207, B:86:0x0215, B:91:0x0227, B:93:0x022d, B:98:0x0232, B:84:0x020e, B:118:0x02df, B:120:0x02e5, B:131:0x0308, B:133:0x030e, B:142:0x031d, B:145:0x0334, B:147:0x0341, B:149:0x0353, B:151:0x0363, B:154:0x0380, B:155:0x0384, B:139:0x0315, B:126:0x02ec, B:50:0x0180, B:40:0x0149, B:194:0x04e8, B:196:0x04f0, B:197:0x04f3, B:26:0x00d8, B:200:0x04f6, B:202:0x050b, B:205:0x0520, B:206:0x0522, B:208:0x052b, B:211:0x0558, B:216:0x057c, B:218:0x0587, B:207:0x0528, B:222:0x058b, B:224:0x0596, B:228:0x059a, B:230:0x05a2, B:234:0x05a6, B:236:0x05b0, B:237:0x05b3), top: B:266:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:89:0x021c  */
    /* JADX WARN: Code duplicated, block: B:91:0x0227 A[Catch: JSONException -> 0x05b6, TRY_ENTER, TRY_LEAVE, TryCatch #12 {JSONException -> 0x05b6, blocks: (B:5:0x001b, B:8:0x0040, B:11:0x006f, B:14:0x0093, B:16:0x00a5, B:19:0x00c6, B:21:0x00d3, B:27:0x00e3, B:30:0x0101, B:33:0x013a, B:35:0x0144, B:43:0x016d, B:45:0x017b, B:191:0x04c4, B:76:0x0201, B:78:0x0207, B:86:0x0215, B:91:0x0227, B:93:0x022d, B:98:0x0232, B:84:0x020e, B:118:0x02df, B:120:0x02e5, B:131:0x0308, B:133:0x030e, B:142:0x031d, B:145:0x0334, B:147:0x0341, B:149:0x0353, B:151:0x0363, B:154:0x0380, B:155:0x0384, B:139:0x0315, B:126:0x02ec, B:50:0x0180, B:40:0x0149, B:194:0x04e8, B:196:0x04f0, B:197:0x04f3, B:26:0x00d8, B:200:0x04f6, B:202:0x050b, B:205:0x0520, B:206:0x0522, B:208:0x052b, B:211:0x0558, B:216:0x057c, B:218:0x0587, B:207:0x0528, B:222:0x058b, B:224:0x0596, B:228:0x059a, B:230:0x05a2, B:234:0x05a6, B:236:0x05b0, B:237:0x05b3), top: B:266:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0232 A[Catch: JSONException -> 0x05b6, TRY_ENTER, TRY_LEAVE, TryCatch #12 {JSONException -> 0x05b6, blocks: (B:5:0x001b, B:8:0x0040, B:11:0x006f, B:14:0x0093, B:16:0x00a5, B:19:0x00c6, B:21:0x00d3, B:27:0x00e3, B:30:0x0101, B:33:0x013a, B:35:0x0144, B:43:0x016d, B:45:0x017b, B:191:0x04c4, B:76:0x0201, B:78:0x0207, B:86:0x0215, B:91:0x0227, B:93:0x022d, B:98:0x0232, B:84:0x020e, B:118:0x02df, B:120:0x02e5, B:131:0x0308, B:133:0x030e, B:142:0x031d, B:145:0x0334, B:147:0x0341, B:149:0x0353, B:151:0x0363, B:154:0x0380, B:155:0x0384, B:139:0x0315, B:126:0x02ec, B:50:0x0180, B:40:0x0149, B:194:0x04e8, B:196:0x04f0, B:197:0x04f3, B:26:0x00d8, B:200:0x04f6, B:202:0x050b, B:205:0x0520, B:206:0x0522, B:208:0x052b, B:211:0x0558, B:216:0x057c, B:218:0x0587, B:207:0x0528, B:222:0x058b, B:224:0x0596, B:228:0x059a, B:230:0x05a2, B:234:0x05a6, B:236:0x05b0, B:237:0x05b3), top: B:266:0x001b }] */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01e7, code lost:
    
        if (r10.equalsIgnoreCase("null") == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01ee, code lost:
    
        if (r10.equalsIgnoreCase("null") == false) goto L73;
     */
    @Override // ivas.gov.bisp.enumeration.p024ax.I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onSuccess(org.json.JSONObject r46) {
        /*
            Method dump skipped, instruction units count: 1472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p031bd.e.onSuccess(org.json.JSONObject):void");
    }
}
