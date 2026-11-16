package ivas.gov.bisp.enumeration.p031bd;

import ivas.gov.bisp.enumeration.activity.discrepancy.DobDiscrepancy;
import ivas.gov.bisp.enumeration.o0ooOO0.o00Ooo;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class x implements o00Ooo.OooO0O0<JSONObject> {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ DobDiscrepancy c;

    public x(DobDiscrepancy dobDiscrepancy) {
        this.c = dobDiscrepancy;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0056, code lost:
    
        if (r12.contains("DoB Updated") != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005f, code lost:
    
        if (r12.contains("DoB Updated") != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
    
        r12 = new android.app.AlertDialog.Builder(r11.c);
        r12.setTitle("DoB Discrepancy.!");
        r0 = new java.lang.StringBuilder();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0074, code lost:
    
        r5 = ivas.gov.bisp.enumeration.p031bd.x.a + 35;
        ivas.gov.bisp.enumeration.p031bd.x.b = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007d, code lost:
    
        r0.append("DoB is Updated agaist this CNIC : ");
        r0.append(r11.c.aK);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0087, code lost:
    
        r2 = ivas.gov.bisp.enumeration.p031bd.x.a;
        r5 = r2 ^ 7;
        r2 = ((r2 & 7) | r5) << 1;
        r5 = -r5;
        r6 = ((r2 | r5) << 1) - (r2 ^ r5);
        ivas.gov.bisp.enumeration.p031bd.x.b = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009a, code lost:
    
        r12.setMessage(r0.toString());
        r12.setCancelable(true);
        r12.setPositiveButton("Confirm", new ivas.gov.bisp.enumeration.p031bd.J(r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ae, code lost:
    
        r0 = ivas.gov.bisp.enumeration.p031bd.x.a;
        r2 = r0 & 95;
        r0 = (((r0 | 95) & (~r2)) - (~(r2 << 1))) - 1;
        ivas.gov.bisp.enumeration.p031bd.x.b = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00bf, code lost:
    
        r12.create().show();
        r12 = r11.c.ae;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ca, code lost:
    
        r0 = ivas.gov.bisp.enumeration.p031bd.x.a + 75;
        ivas.gov.bisp.enumeration.p031bd.x.b = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d3, code lost:
    
        r12.t = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d5, code lost:
    
        r12 = ivas.gov.bisp.enumeration.p031bd.x.b;
        r0 = ((r12 | 1) << 1) - (r12 ^ 1);
        ivas.gov.bisp.enumeration.p031bd.x.a = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e1, code lost:
    
        if ((r0 % 2) != 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e3, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e4, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ed, code lost:
    
        if (r12.contains("Cnic Not Found In Nadra") == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ef, code lost:
    
        r12 = r11.c;
        r2 = new java.lang.StringBuilder();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f6, code lost:
    
        r7 = ivas.gov.bisp.enumeration.p031bd.x.a;
        r8 = ((r7 ^ 5) | (r7 & 5)) << 1;
        r7 = -(((~r7) & 5) | (r7 & (-6)));
        r9 = (r8 ^ r7) + ((r7 & r8) << 1);
        ivas.gov.bisp.enumeration.p031bd.x.b = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0111, code lost:
    
        if ((r9 % 2) == 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0113, code lost:
    
        r2.append("This CNIC : ");
        r2.append(r11.c.aj.getText().toString());
        r2.append(" Not Found in Nadra Family of this HouseHold");
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0128, code lost:
    
        r3 = ivas.gov.bisp.enumeration.p031bd.x.a;
        r8 = r3 & 85;
        r8 = (r8 - (~(-(-((r3 ^ 85) | r8))))) - 1;
        ivas.gov.bisp.enumeration.p031bd.x.b = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0139, code lost:
    
        android.widget.Toast.makeText(r12, r2.toString(), 0).show();
        r12 = r11.c;
        r2 = new java.lang.StringBuilder();
        r2.append("This CNIC : ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x014e, code lost:
    
        r3 = ivas.gov.bisp.enumeration.p031bd.x.b;
        r3 = (-2) - ((((r3 | 10) << 1) - (r3 ^ 10)) ^ (-1));
        ivas.gov.bisp.enumeration.p031bd.x.a = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x015f, code lost:
    
        r3 = r11.c.aj.getText();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0167, code lost:
    
        r7 = ivas.gov.bisp.enumeration.p031bd.x.b;
        r9 = r7 & 103;
        r8 = (((r7 ^ 103) | r9) << 1) - ((r7 | 103) & (~r9));
        ivas.gov.bisp.enumeration.p031bd.x.a = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0179, code lost:
    
        r2.append(r3.toString());
        r2.append(" Not Found in Nadra Family of this HouseHold");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0183, code lost:
    
        r0 = ivas.gov.bisp.enumeration.p031bd.x.a + 43;
        ivas.gov.bisp.enumeration.p031bd.x.b = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x018c, code lost:
    
        if ((r0 % 2) != 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x018e, code lost:
    
        ivas.gov.bisp.enumeration.activity.discrepancy.DobDiscrepancy.u(r12, 1, "Alert.!", r2.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0197, code lost:
    
        r12 = 14 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x019b, code lost:
    
        ivas.gov.bisp.enumeration.activity.discrepancy.DobDiscrepancy.u(r12, 1, "Alert.!", r2.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01a2, code lost:
    
        r12 = ivas.gov.bisp.enumeration.p031bd.x.b;
        r0 = (r12 | 37) << 1;
        r12 = -(((~r12) & 37) | (r12 & (-38)));
        r2 = (r0 & r12) + (r12 | r0);
        ivas.gov.bisp.enumeration.p031bd.x.a = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01b7, code lost:
    
        if ((r2 % 2) == 0) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01b9, code lost:
    
        r12 = 86 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01bc, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01bd, code lost:
    
        r2.append("This CNIC : ");
        r12 = r11.c.aj;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01c4, code lost:
    
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01c7, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01c8, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01c9, code lost:
    
        throw r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01ca, code lost:
    
        ivas.gov.bisp.enumeration.activity.discrepancy.DobDiscrepancy.u(r11.c, 1, "Alert.!", r12);
        r0 = r11.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01d1, code lost:
    
        r2 = ivas.gov.bisp.enumeration.p031bd.x.b;
        r3 = r2 & 101;
        r2 = -(-(r2 | 101));
        r4 = ((r3 | r2) << 1) - (r2 ^ r3);
        ivas.gov.bisp.enumeration.p031bd.x.a = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01e4, code lost:
    
        android.widget.Toast.makeText(r0, r12, 0).show();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01eb, code lost:
    
        r12 = ivas.gov.bisp.enumeration.p031bd.x.a + 33;
        ivas.gov.bisp.enumeration.p031bd.x.b = r12 % 128;
        r12 = r12 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01f4, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 501
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p031bd.x.b(java.lang.Object):void");
    }
}
