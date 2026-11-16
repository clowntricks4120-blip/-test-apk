package ivas.gov.bisp.enumeration.dd;

import ivas.gov.bisp.enumeration.activity.singlediscrepancy.CnicActivity;
import ivas.gov.bisp.enumeration.o0ooOO0.o00Ooo;
import org.json.JSONObject;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.dd.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0291l implements o00Ooo.OooO0O0<JSONObject> {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ CnicActivity d;

    public C0291l(CnicActivity cnicActivity, String str) {
        this.d = cnicActivity;
        this.c = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0098, code lost:
    
        if (r3 != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009b, code lost:
    
        if (r3 != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009d, code lost:
    
        r2 = ((r7 | 81) << 1) - (r7 ^ 81);
        ivas.gov.bisp.enumeration.dd.C0291l.b = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a8, code lost:
    
        if ((r2 % 2) == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00aa, code lost:
    
        r42.d.ae.setError(r6);
        r2 = r42.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b4, code lost:
    
        r3 = 6 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b9, code lost:
    
        r42.d.ae.setError(r6);
        r2 = r42.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c2, code lost:
    
        ivas.gov.bisp.enumeration.activity.singlediscrepancy.CnicActivity.u(r2, 1, "Alert.!", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c5, code lost:
    
        r2 = ivas.gov.bisp.enumeration.dd.C0291l.a + 77;
        ivas.gov.bisp.enumeration.dd.C0291l.b = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ce, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d7, code lost:
    
        if (r6.equalsIgnoreCase("Cnic Found In Nadra Family") == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d9, code lost:
    
        r3 = ivas.gov.bisp.enumeration.dd.C0291l.b + 64;
        r7 = (r3 ^ (-1)) + (r3 << 1);
        ivas.gov.bisp.enumeration.dd.C0291l.a = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e8, code lost:
    
        if ((r7 % 2) != 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ea, code lost:
    
        android.widget.Toast.makeText(r42.d, "CNIC is Validated", 0).show();
        r3 = r42.d.ae;
        r7 = r42.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f9, code lost:
    
        r3.setText(ivas.gov.bisp.enumeration.bK.ag.b(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0101, code lost:
    
        android.widget.Toast.makeText(r42.d, "CNIC is Validated", 0).show();
        r3 = r42.d.ae;
        r7 = r42.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0111, code lost:
    
        r42.d.af.setVisibility(0);
        r42.d.af.setEnabled(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x011f, code lost:
    
        r3 = ivas.gov.bisp.enumeration.dd.C0291l.a + 69;
        ivas.gov.bisp.enumeration.dd.C0291l.b = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0128, code lost:
    
        if ((r3 % 2) == 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x012a, code lost:
    
        r42.d.ae.setEnabled(true);
        r42.d.ag.setVisibility(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x013a, code lost:
    
        r3 = r42.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x013d, code lost:
    
        r42.d.ae.setEnabled(false);
        r42.d.ag.setVisibility(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x014c, code lost:
    
        r15 = new ivas.gov.bisp.enumeration.models.RosterItem(r3.ak, r3.aM, r3.aS, net.sqlcipher.BuildConfig.FLAVOR, r42.c, r3.aC, r3.aD, r3.aE, r3.aH, r3.aQ, r3.aG, r3.aF, r3.aN, r3.aO, r3.aP, r3.aK, r3.aL, r3.aJ, r3.aR, r3.aI, r3.aA, r3.an, r3.ao, r3.ap, r3.am, r3.aw, r3.al, r3.ar, r3.aq, r3.as, r3.at, r3.au, r3.ay, r3.av);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01cc, code lost:
    
        r0 = ivas.gov.bisp.enumeration.dd.C0291l.a;
        r1 = r0 | 107;
        r2 = (r1 << 1) - ((~(r0 & 107)) & r1);
        ivas.gov.bisp.enumeration.dd.C0291l.b = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01df, code lost:
    
        r3.ah = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01e1, code lost:
    
        r0 = ivas.gov.bisp.enumeration.dd.C0291l.b;
        r1 = ((r0 | 101) << 1) - (r0 ^ 101);
        ivas.gov.bisp.enumeration.dd.C0291l.a = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01f0, code lost:
    
        if ((r1 % 2) == 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01f2, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01f3, code lost:
    
        r0 = null;
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01f7, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01f8, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01f9, code lost:
    
        ivas.gov.bisp.enumeration.activity.singlediscrepancy.CnicActivity.u(r42.d, 1, "Alert.!", "CNIC Not Found In NADRA Family");
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0201, code lost:
    
        r0 = ivas.gov.bisp.enumeration.dd.C0291l.b;
        r2 = r0 & 35;
        r2 = (r2 - (~(-(-((r0 ^ 35) | r2))))) - 1;
        ivas.gov.bisp.enumeration.dd.C0291l.a = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0214, code lost:
    
        r0 = r42.d.af;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0218, code lost:
    
        r2 = ivas.gov.bisp.enumeration.dd.C0291l.b;
        r3 = ((r2 & (-66)) | ((~r2) & 65)) + ((r2 & 65) << 1);
        ivas.gov.bisp.enumeration.dd.C0291l.a = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x022b, code lost:
    
        r0.setVisibility(8);
        r0 = r42.d.af;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0232, code lost:
    
        r2 = ivas.gov.bisp.enumeration.dd.C0291l.b;
        r3 = ((r2 & (-70)) | ((~r2) & 69)) + ((r2 & 69) << 1);
        ivas.gov.bisp.enumeration.dd.C0291l.a = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0245, code lost:
    
        r0.setEnabled(false);
        r0 = r42.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x024a, code lost:
    
        r2 = ivas.gov.bisp.enumeration.dd.C0291l.b;
        r3 = r2 & 33;
        r2 = (r2 | 33) & (~r3);
        r3 = -(-(r3 << 1));
        r6 = ((r2 | r3) << 1) - (r2 ^ r3);
        ivas.gov.bisp.enumeration.dd.C0291l.a = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0261, code lost:
    
        r0.ag.setVisibility(0);
        r0 = r42.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0268, code lost:
    
        r2 = ivas.gov.bisp.enumeration.dd.C0291l.a;
        r3 = (r2 ^ 18) + ((r2 & 18) << 1);
        r2 = (r3 ^ (-1)) + (r3 << 1);
        ivas.gov.bisp.enumeration.dd.C0291l.b = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x027b, code lost:
    
        if ((r2 % 2) == 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x027d, code lost:
    
        r2 = 1;
        r0 = r0.af;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0280, code lost:
    
        r0.setEnabled(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0284, code lost:
    
        r2 = 1;
        r0 = r0.af;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0288, code lost:
    
        r42.d.ae.setEnabled(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x028f, code lost:
    
        r0 = ivas.gov.bisp.enumeration.dd.C0291l.a;
        r3 = ((r0 ^ 29) | (r0 & 29)) << r2;
        r0 = -(((~r0) & 29) | (r0 & (-30)));
        r4 = (r3 ^ r0) + ((r0 & r3) << r2);
        ivas.gov.bisp.enumeration.dd.C0291l.b = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x02aa, code lost:
    
        if ((r4 % 2) != 0) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x02ac, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x02ae, code lost:
    
        throw null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v48, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v49 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(java.lang.Object r43) {
        /*
            Method dump skipped, instruction units count: 717
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.dd.C0291l.b(java.lang.Object):void");
    }
}
