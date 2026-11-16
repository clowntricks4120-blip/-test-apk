package ivas.gov.bisp.enumeration.p036bi;

import ivas.gov.bisp.enumeration.activity.DashboardActivity;
import ivas.gov.bisp.enumeration.bK.af;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.p024ax.I;
import ivas.gov.bisp.enumeration.p024ax.ax;

/* JADX INFO: loaded from: classes.dex */
public class L implements I {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ DashboardActivity c;

    public L(DashboardActivity dashboardActivity) {
        this.c = dashboardActivity;
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onError(ResponseMessage responseMessage) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 43;
        int i4 = (i2 ^ 43) | i3;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            ax.b(this.c.am);
            responseMessage.getErrorMessage();
            throw null;
        }
        ax.b(this.c.am);
        DashboardActivity dashboardActivity = this.c;
        String errorMessage = responseMessage.getErrorMessage();
        int i6 = b + 10;
        int i7 = (i6 ^ (-1)) + (i6 << 1);
        a = i7 % 128;
        int i8 = i7 % 2;
        af.b(dashboardActivity, errorMessage, responseMessage.isLogout());
        int i9 = a;
        int i10 = i9 & 101;
        int i11 = -(-((i9 ^ 101) | i10));
        int i12 = (i10 & i11) + (i11 | i10);
        b = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x024a, code lost:
    
        throw r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x024b, code lost:
    
        ivas.gov.bisp.enumeration.activity.DashboardActivity.v(r12.c, "Fetching Data", "Problem in Fetching Data");
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0250, code lost:
    
        r13 = ivas.gov.bisp.enumeration.p036bi.L.a + 51;
        ivas.gov.bisp.enumeration.p036bi.L.b = r13 % 128;
        r13 = r13 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0259, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ce, code lost:
    
        if (r1.has("code") != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d6, code lost:
    
        if (r1.has("code") != true) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d8, code lost:
    
        r1 = r1.getString("message".toLowerCase());
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e0, code lost:
    
        r2 = ivas.gov.bisp.enumeration.p036bi.L.b;
        r3 = (r2 & 85) + (r2 | 85);
        ivas.gov.bisp.enumeration.p036bi.L.a = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f0, code lost:
    
        if (r1.equalsIgnoreCase("Cnic Found In Nadra Family") == true) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f6, code lost:
    
        if (r1.equalsIgnoreCase("Cnic Not Found In Nadra Family") == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f8, code lost:
    
        r13 = ivas.gov.bisp.enumeration.p036bi.L.a;
        r1 = (r13 ^ 66) + ((r13 & 66) << 1);
        r13 = (r1 ^ (-1)) + (r1 << 1);
        ivas.gov.bisp.enumeration.p036bi.L.b = r13 % 128;
        r13 = r13 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0109, code lost:
    
        ivas.gov.bisp.enumeration.activity.DashboardActivity.u(r12.c, "CNIC Not Found", "Cnic Not Found In Nadra Family", true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x010e, code lost:
    
        r13 = ivas.gov.bisp.enumeration.p036bi.L.b + 33;
        ivas.gov.bisp.enumeration.p036bi.L.a = r13 % 128;
        r13 = r13 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0117, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0118, code lost:
    
        r12.c.A();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x011d, code lost:
    
        r13 = ivas.gov.bisp.enumeration.p036bi.L.a;
        r1 = r13 | 55;
        r2 = ((r1 << 1) - (~(-((~(r13 & 55)) & r1)))) - 1;
        ivas.gov.bisp.enumeration.p036bi.L.b = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0130, code lost:
    
        if ((r2 % 2) != 0) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0132, code lost:
    
        r13 = 97 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0136, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0137, code lost:
    
        r13 = ivas.gov.bisp.enumeration.p036bi.L.a;
        r1 = ((r13 & 38) + (r13 | 38)) - 1;
        ivas.gov.bisp.enumeration.p036bi.L.b = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0144, code lost:
    
        r12.c.A();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0149, code lost:
    
        r13 = ivas.gov.bisp.enumeration.p036bi.L.b;
        r1 = r13 & 69;
        r13 = (r13 | 69) & (~r1);
        r1 = -(-(r1 << 1));
        r2 = ((r13 | r1) << 1) - (r13 ^ r1);
        ivas.gov.bisp.enumeration.p036bi.L.a = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x015e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x015f, code lost:
    
        r2 = ivas.gov.bisp.enumeration.p036bi.L.b;
        r9 = (r2 & 95) + (r2 | 95);
        ivas.gov.bisp.enumeration.p036bi.L.a = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x016f, code lost:
    
        if ((r9 % 2) == 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0179, code lost:
    
        r11 = 96 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x017d, code lost:
    
        if (r1.isNull("code".toLowerCase()) != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0189, code lost:
    
        if ((!r1.isNull("code".toLowerCase())) == true) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x018b, code lost:
    
        ivas.gov.bisp.enumeration.activity.DashboardActivity.v(r12.c, "Fetching Data", "Problem in Fetching Data");
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0190, code lost:
    
        r13 = ivas.gov.bisp.enumeration.p036bi.L.b;
        r1 = (r13 ^ 107) + ((r13 & 107) << 1);
        ivas.gov.bisp.enumeration.p036bi.L.a = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x019d, code lost:
    
        if ((r1 % 2) != 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x019f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01a0, code lost:
    
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01a3, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01a4, code lost:
    
        r8 = r1.getInt("code");
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01aa, code lost:
    
        if (r8 != 200) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01ac, code lost:
    
        r2 = ivas.gov.bisp.enumeration.p036bi.L.b + 53;
        ivas.gov.bisp.enumeration.p036bi.L.a = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01b5, code lost:
    
        r1 = r1.getString("message".toLowerCase());
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01c2, code lost:
    
        if ((!r1.equalsIgnoreCase("Cnic Found In Nadra Family")) == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01c8, code lost:
    
        if (r1.equalsIgnoreCase("Cnic Not Found In Nadra Family") == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01ca, code lost:
    
        r13 = ivas.gov.bisp.enumeration.p036bi.L.a + 59;
        ivas.gov.bisp.enumeration.p036bi.L.b = r13 % 128;
        r13 = r13 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01d3, code lost:
    
        ivas.gov.bisp.enumeration.activity.DashboardActivity.u(r12.c, "CNIC Not Found", "Cnic Not Found In Nadra Family", true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01d8, code lost:
    
        r13 = ivas.gov.bisp.enumeration.p036bi.L.a + 34;
        r1 = (r13 ^ (-1)) + (r13 << 1);
        ivas.gov.bisp.enumeration.p036bi.L.b = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01e5, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01e6, code lost:
    
        r12.c.A();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01eb, code lost:
    
        r13 = ivas.gov.bisp.enumeration.p036bi.L.a + 5;
        ivas.gov.bisp.enumeration.p036bi.L.b = r13 % 128;
        r13 = r13 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01f4, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01f5, code lost:
    
        r13 = ivas.gov.bisp.enumeration.p036bi.L.a;
        r1 = ((r13 ^ 22) + ((r13 & 22) << 1)) - 1;
        ivas.gov.bisp.enumeration.p036bi.L.b = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0204, code lost:
    
        r12.c.A();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0209, code lost:
    
        r13 = ivas.gov.bisp.enumeration.p036bi.L.b;
        r13 = (-2) - (((r13 & 106) + (r13 | 106)) ^ (-1));
        ivas.gov.bisp.enumeration.p036bi.L.a = r13 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0219, code lost:
    
        if ((r13 % 2) != 0) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x021b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x021c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x021d, code lost:
    
        if (r8 != 0) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x021f, code lost:
    
        r13 = (-2) - ((ivas.gov.bisp.enumeration.p036bi.L.a + 10) ^ (-1));
        ivas.gov.bisp.enumeration.p036bi.L.b = r13 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x022c, code lost:
    
        if ((r13 % 2) == 0) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x022e, code lost:
    
        ivas.gov.bisp.enumeration.activity.DashboardActivity.v(r12.c, "Fetching Data", "Problem in Fetching Data");
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0233, code lost:
    
        r13 = ivas.gov.bisp.enumeration.p036bi.L.a + 91;
        ivas.gov.bisp.enumeration.p036bi.L.b = r13 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x023c, code lost:
    
        if ((r13 % 2) == 0) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x023e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x023f, code lost:
    
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0242, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0243, code lost:
    
        ivas.gov.bisp.enumeration.activity.DashboardActivity.v(r12.c, "Fetching Data", "Problem in Fetching Data");
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0248, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0249, code lost:
    
        r13 = move-exception;
     */
    @Override // ivas.gov.bisp.enumeration.p024ax.I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onSuccess(org.json.JSONObject r13) {
        /*
            Method dump skipped, instruction units count: 627
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p036bi.L.onSuccess(org.json.JSONObject):void");
    }
}
