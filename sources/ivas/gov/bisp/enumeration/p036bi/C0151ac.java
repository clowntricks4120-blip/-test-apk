package ivas.gov.bisp.enumeration.p036bi;

import ivas.gov.bisp.enumeration.activity.DiscrepancyRosterListActivity;
import ivas.gov.bisp.enumeration.bK.af;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.p024ax.I;
import ivas.gov.bisp.enumeration.p024ax.ax;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bi.ac, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0151ac implements I {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ DiscrepancyRosterListActivity c;

    public C0151ac(DiscrepancyRosterListActivity discrepancyRosterListActivity) {
        this.c = discrepancyRosterListActivity;
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onError(ResponseMessage responseMessage) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-106)) | ((~i2) & 105);
        int i4 = (i2 & 105) << 1;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        ax.b(this.c.ac);
        int i7 = b + 67;
        a = i7 % 128;
        int i8 = i7 % 2;
        DiscrepancyRosterListActivity discrepancyRosterListActivity = this.c;
        String errorMessage = responseMessage.getErrorMessage();
        boolean zIsLogout = responseMessage.isLogout();
        int i9 = b;
        int i10 = i9 & 71;
        int i11 = ((i9 | 71) & (~i10)) + (i10 << 1);
        a = i11 % 128;
        int i12 = i11 % 2;
        af.b(discrepancyRosterListActivity, errorMessage, zIsLogout);
        int i13 = a + 104;
        int i14 = (i13 ^ (-1)) + (i13 << 1);
        b = i14 % 128;
        if (i14 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x025a, code lost:
    
        r13 = ivas.gov.bisp.enumeration.p036bi.C0151ac.b + 27;
        ivas.gov.bisp.enumeration.p036bi.C0151ac.a = r13 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0263, code lost:
    
        if ((r13 % 2) == 0) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0265, code lost:
    
        r13 = 84 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0269, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0131, code lost:
    
        if (r2.isNull("code".toLowerCase()) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x013c, code lost:
    
        if (r2.isNull("code".toLowerCase()) != true) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x013e, code lost:
    
        r13 = ivas.gov.bisp.enumeration.p036bi.C0151ac.a;
        r11 = r13 & 21;
        r11 = r11 + ((r13 ^ 21) | r11);
        ivas.gov.bisp.enumeration.p036bi.C0151ac.b = r11 % 128;
        r11 = r11 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x014b, code lost:
    
        r13 = r2.getInt("code");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0151, code lost:
    
        if (r13 != 200) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0153, code lost:
    
        r13 = ivas.gov.bisp.enumeration.p036bi.C0151ac.a;
        r0 = r13 & 37;
        r13 = -(-((r13 ^ 37) | r0));
        r4 = (r0 & r13) + (r13 | r0);
        ivas.gov.bisp.enumeration.p036bi.C0151ac.b = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0165, code lost:
    
        if ((r4 % 2) != 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0167, code lost:
    
        r13 = r2.getString("message".toLowerCase());
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0175, code lost:
    
        r2 = 86 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0177, code lost:
    
        if (r13.equalsIgnoreCase("Cnic Found In Nadra Family") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x017c, code lost:
    
        r13 = r2.getString("message".toLowerCase());
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0189, code lost:
    
        if ((!r13.equalsIgnoreCase("Cnic Found In Nadra Family")) == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0194, code lost:
    
        if ((!r13.equalsIgnoreCase("Cnic Not Found In Nadra Family")) == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0196, code lost:
    
        r12.c.A();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x019b, code lost:
    
        r13 = ivas.gov.bisp.enumeration.p036bi.C0151ac.b + 29;
        ivas.gov.bisp.enumeration.p036bi.C0151ac.a = r13 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01a3, code lost:
    
        if ((r13 % 2) == 0) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01a5, code lost:
    
        r0 = 89 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01a7, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01a8, code lost:
    
        r13 = ivas.gov.bisp.enumeration.p036bi.C0151ac.b;
        r4 = r13 & 87;
        r13 = (r13 | 87) & (~r4);
        r4 = -(-(r4 << 1));
        r6 = (r13 ^ r4) + ((r13 & r4) << 1);
        ivas.gov.bisp.enumeration.p036bi.C0151ac.a = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01bd, code lost:
    
        ivas.gov.bisp.enumeration.activity.DiscrepancyRosterListActivity.v(r12.c, "CNIC Not Found", "Cnic Not Found In Nadra Family", true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01c2, code lost:
    
        r13 = ivas.gov.bisp.enumeration.p036bi.C0151ac.b;
        r3 = r13 & 89;
        r13 = -(-((r13 ^ 89) | r3));
        r0 = (r3 & r13) + (r13 | r3);
        ivas.gov.bisp.enumeration.p036bi.C0151ac.a = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01d3, code lost:
    
        if ((r0 % 2) == 0) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01d5, code lost:
    
        r2 = 29 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01d7, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01d8, code lost:
    
        r13 = ivas.gov.bisp.enumeration.p036bi.C0151ac.a;
        r0 = (r13 ^ 43) + ((r13 & 43) << 1);
        ivas.gov.bisp.enumeration.p036bi.C0151ac.b = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01e5, code lost:
    
        if ((r0 % 2) != 0) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01e7, code lost:
    
        r12.c.A();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01ee, code lost:
    
        r13 = 71 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01f3, code lost:
    
        r12.c.A();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01f8, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01f9, code lost:
    
        if (r13 != 0) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01fb, code lost:
    
        r13 = ivas.gov.bisp.enumeration.p036bi.C0151ac.a;
        r0 = ((((r13 ^ 85) | (r13 & 85)) << 1) - (~(-(((~r13) & 85) | (r13 & (-86)))))) - 1;
        ivas.gov.bisp.enumeration.p036bi.C0151ac.b = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0213, code lost:
    
        if ((r0 % 2) == 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0215, code lost:
    
        ivas.gov.bisp.enumeration.activity.DiscrepancyRosterListActivity.w(r12.c, "Fetching Data", "Problem in Fetching Data");
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x021a, code lost:
    
        r13 = ivas.gov.bisp.enumeration.p036bi.C0151ac.a;
        r2 = r13 & 7;
        r0 = ((r13 ^ 7) | r2) << 1;
        r13 = -((r13 | 7) & (~r2));
        r2 = (r0 & r13) + (r13 | r0);
        ivas.gov.bisp.enumeration.p036bi.C0151ac.b = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0230, code lost:
    
        if ((r2 % 2) == 0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0232, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0233, code lost:
    
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0236, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0237, code lost:
    
        ivas.gov.bisp.enumeration.activity.DiscrepancyRosterListActivity.w(r12.c, "Fetching Data", "Problem in Fetching Data");
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x023c, code lost:
    
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x023f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0240, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0241, code lost:
    
        throw r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0242, code lost:
    
        ivas.gov.bisp.enumeration.activity.DiscrepancyRosterListActivity.w(r12.c, "Fetching Data", "Problem in Fetching Data");
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0247, code lost:
    
        r13 = ivas.gov.bisp.enumeration.p036bi.C0151ac.a;
        r0 = r13 & 63;
        r0 = r0 + ((r13 ^ 63) | r0);
        ivas.gov.bisp.enumeration.p036bi.C0151ac.b = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0254, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0255, code lost:
    
        ivas.gov.bisp.enumeration.activity.DiscrepancyRosterListActivity.w(r12.c, "Fetching Data", "Problem in Fetching Data");
     */
    @Override // ivas.gov.bisp.enumeration.p024ax.I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onSuccess(org.json.JSONObject r13) {
        /*
            Method dump skipped, instruction units count: 646
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p036bi.C0151ac.onSuccess(org.json.JSONObject):void");
    }
}
