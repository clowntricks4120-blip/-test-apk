package ivas.gov.bisp.enumeration.p031bd;

import android.content.DialogInterface;
import android.widget.TextView;
import ivas.gov.bisp.enumeration.activity.discrepancy.DobDiscrepancy;
import ivas.gov.bisp.enumeration.bK.af;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.p024ax.I;
import ivas.gov.bisp.enumeration.p024ax.ax;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bd.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0133a implements I {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ DobDiscrepancy c;

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bd.a$bih */
    public class bih implements DialogInterface.OnClickListener {
        private static int a = 0;
        private static int b = 1;

        public bih(C0133a c0133a) {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = i3 & 119;
            int i5 = i4 + ((i3 ^ 119) | i4);
            a = i5 % 128;
            int i6 = i5 % 2;
            dialogInterface.cancel();
            if (i6 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public C0133a(DobDiscrepancy dobDiscrepancy) {
        this.c = dobDiscrepancy;
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onError(ResponseMessage responseMessage) {
        DobDiscrepancy dobDiscrepancy;
        int i = 2 % 2;
        int i2 = b + 31;
        a = i2 % 128;
        if (i2 % 2 == 0) {
            ax.b(this.c.ad);
            TextView textView = this.c.ai;
            throw null;
        }
        ax.b(this.c.ad);
        this.c.ai.setVisibility(8);
        this.c.ak.setVisibility(0);
        int i3 = b;
        int i4 = i3 & 71;
        int i5 = (((i3 | 71) & (~i4)) - (~(-(-(i4 << 1))))) - 1;
        a = i5 % 128;
        int i6 = i5 % 2;
        this.c.ai.setEnabled(false);
        TextView textView2 = this.c.aY;
        int i7 = a;
        int i8 = ((i7 | 101) << 1) - (i7 ^ 101);
        b = i8 % 128;
        if (i8 % 2 != 0) {
            textView2.setEnabled(false);
            dobDiscrepancy = this.c;
        } else {
            textView2.setEnabled(false);
            dobDiscrepancy = this.c;
        }
        dobDiscrepancy.aj.setEnabled(true);
        int i9 = a;
        int i10 = (((i9 | 30) << 1) - (i9 ^ 30)) - 1;
        b = i10 % 128;
        if (i10 % 2 != 0) {
            af.b(this.c, responseMessage.getErrorMessage(), responseMessage.isLogout());
            throw null;
        }
        af.b(this.c, responseMessage.getErrorMessage(), responseMessage.isLogout());
        int i11 = a;
        int i12 = (i11 ^ 113) + ((i11 & 113) << 1);
        b = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x01b6, code lost:
    
        if (r11.equalsIgnoreCase("null") != false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01c0, code lost:
    
        if (r11.equalsIgnoreCase("null") != false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01c2, code lost:
    
        r0 = ivas.gov.bisp.enumeration.p031bd.C0133a.b;
        r3 = ((r0 ^ 97) | (r0 & 97)) << 1;
        r0 = -(((~r0) & 97) | (r0 & (-98)));
        r4 = (r3 ^ r0) + ((r0 & r3) << 1);
        ivas.gov.bisp.enumeration.p031bd.C0133a.a = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01dc, code lost:
    
        r45.c.aK = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01e7, code lost:
    
        r0 = new java.text.SimpleDateFormat("dd-MM-yyyy").parse(r10);
        r3 = new java.text.SimpleDateFormat("MMM dd, yyyy");
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01f2, code lost:
    
        r5 = ivas.gov.bisp.enumeration.p031bd.C0133a.b;
        r5 = (-2) - (((r5 ^ 12) + ((r5 & 12) << 1)) ^ (-1));
        ivas.gov.bisp.enumeration.p031bd.C0133a.a = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0203, code lost:
    
        if ((r5 % 2) == 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0205, code lost:
    
        r0 = r3.format(r0);
        r3 = r45.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x020b, code lost:
    
        r5 = ivas.gov.bisp.enumeration.p031bd.C0133a.b;
        r9 = r5 & 49;
        r9 = r9 + ((r5 ^ 49) | r9);
        ivas.gov.bisp.enumeration.p031bd.C0133a.a = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0218, code lost:
    
        r3.aY.setText(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x021d, code lost:
    
        r0 = ivas.gov.bisp.enumeration.p031bd.C0133a.a;
        r3 = (r0 & 13) + (r0 | 13);
        ivas.gov.bisp.enumeration.p031bd.C0133a.b = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x022a, code lost:
    
        r3.format(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x022d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x022e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0230, code lost:
    
        throw r0;
     */
    @Override // ivas.gov.bisp.enumeration.p024ax.I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onSuccess(org.json.JSONObject r46) {
        /*
            Method dump skipped, instruction units count: 1210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p031bd.C0133a.onSuccess(org.json.JSONObject):void");
    }
}
