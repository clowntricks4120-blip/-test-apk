package ivas.gov.bisp.enumeration.p036bi;

import ivas.gov.bisp.enumeration.activity.DisabilityActivity;
import ivas.gov.bisp.enumeration.o0ooOO0.o00Ooo;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class X implements o00Ooo.OooO0O0<JSONObject> {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ DisabilityActivity c;

    public X(DisabilityActivity disabilityActivity) {
        this.c = disabilityActivity;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x009a, code lost:
    
        if (r10.contains("Updated") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a6, code lost:
    
        if (r10.contains("Updated") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a8, code lost:
    
        r10 = new android.app.AlertDialog.Builder(r9.c);
        r10.setTitle("Disability.!");
        r3 = new java.lang.StringBuilder();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b9, code lost:
    
        r4 = ivas.gov.bisp.enumeration.p036bi.X.a;
        r5 = (r4 & 31) + (r4 | 31);
        ivas.gov.bisp.enumeration.p036bi.X.b = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c7, code lost:
    
        if ((r5 % 2) != 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c9, code lost:
    
        r3.append("Disability is Updated against this CNIC : ");
        r3.append(ivas.gov.bisp.enumeration.bK.ag.b(r9.c.aH));
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d7, code lost:
    
        r4 = ivas.gov.bisp.enumeration.p036bi.X.b;
        r5 = r4 & 97;
        r5 = r5 + ((r4 ^ 97) | r5);
        ivas.gov.bisp.enumeration.p036bi.X.a = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e4, code lost:
    
        if ((r5 % 2) != 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e6, code lost:
    
        r10.setMessage(r3.toString());
        r10.setCancelable(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f1, code lost:
    
        r10.setMessage(r3.toString());
        r10.setCancelable(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00fb, code lost:
    
        r3 = new ivas.gov.bisp.enumeration.p036bi.DialogInterfaceOnClickListenerC0185n(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0102, code lost:
    
        r5 = ivas.gov.bisp.enumeration.p036bi.X.b;
        r7 = r5 & 111;
        r5 = -(-(r5 | 111));
        r8 = (r7 ^ r5) + ((r5 & r7) << 1);
        ivas.gov.bisp.enumeration.p036bi.X.a = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0114, code lost:
    
        r10.setPositiveButton("ok", r3);
        r10.create().show();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x011e, code lost:
    
        r10 = ivas.gov.bisp.enumeration.p036bi.X.b;
        r1 = (((r10 | 126) << 1) - (r10 ^ 126)) - 1;
        ivas.gov.bisp.enumeration.p036bi.X.a = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x012c, code lost:
    
        if ((r1 % 2) != 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x012e, code lost:
    
        r10 = 34 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0131, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0132, code lost:
    
        r3.append("Disability is Updated against this CNIC : ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0135, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0136, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0137, code lost:
    
        throw r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p036bi.X.b(java.lang.Object):void");
    }
}
