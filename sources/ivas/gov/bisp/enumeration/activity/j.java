package ivas.gov.bisp.enumeration.activity;

import android.content.DialogInterface;
import android.view.View;
import androidx.appcompat.app.b;
import ivas.gov.bisp.enumeration.p044bq.w;

/* JADX INFO: loaded from: classes.dex */
public class j implements View.OnClickListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ b c;
    public final /* synthetic */ CnicValidationActivity d;

    public class bax implements DialogInterface.OnClickListener {
        private static int a = 1;
        private static int b;

        public bax() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            CnicValidationActivity cnicValidationActivity = j.this.d;
            w wVar = new w(cnicValidationActivity, cnicValidationActivity.ag);
            int i3 = a + 85;
            b = i3 % 128;
            int i4 = i3 % 2;
            wVar.execute(new Void[0]);
            dialogInterface.cancel();
            int i5 = b;
            int i6 = (((i5 ^ 39) | (i5 & 39)) << 1) - (((~i5) & 39) | (i5 & (-40)));
            a = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    public j(CnicValidationActivity cnicValidationActivity, b bVar) {
        this.d = cnicValidationActivity;
        this.c = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0082, code lost:
    
        if (r1.ag.k().length() > 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0084, code lost:
    
        r0 = ivas.gov.bisp.enumeration.activity.j.a;
        r1 = r0 | 21;
        r4 = ((r1 << 1) - (~(-((~(r0 & 21)) & r1)))) - 1;
        ivas.gov.bisp.enumeration.activity.j.b = r4 % 128;
        r4 = r4 % 2;
        r0 = ivas.gov.bisp.enumeration.BISPApplication.c;
        r0 = r7.d.S;
        r1 = ivas.gov.bisp.enumeration.activity.j.a;
        r4 = ((r1 & 71) - (~(-(-(r1 | 71))))) - 1;
        ivas.gov.bisp.enumeration.activity.j.b = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b4, code lost:
    
        if ((!r0.equals(net.sqlcipher.BuildConfig.FLAVOR)) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b7, code lost:
    
        r0 = ivas.gov.bisp.enumeration.activity.j.a;
        r4 = r0 & 77;
        r0 = r0 | 77;
        r5 = (r4 & r0) + (r0 | r4);
        ivas.gov.bisp.enumeration.activity.j.b = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00c6, code lost:
    
        if ((r5 % 2) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00d0, code lost:
    
        if (r7.d.ag.v() != 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00db, code lost:
    
        if (r7.d.ag.v() != 1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00dd, code lost:
    
        android.widget.Toast.makeText(r7.d, "Please scan finger", 0).show();
        r0 = ivas.gov.bisp.enumeration.activity.j.b;
        r1 = (r0 & 1) + (r0 | 1);
        ivas.gov.bisp.enumeration.activity.j.a = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00f3, code lost:
    
        if ((r1 % 2) != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00f5, code lost:
    
        r8 = 23 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f8, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0101, code lost:
    
        if (r7.d.X.isChecked() == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0103, code lost:
    
        r0 = ivas.gov.bisp.enumeration.activity.j.a;
        r5 = r0 & 1;
        r4 = ((((r0 ^ 1) | r5) << 1) - (~(-((r0 | 1) & (~r5))))) - 1;
        ivas.gov.bisp.enumeration.activity.j.b = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0117, code lost:
    
        if ((r4 % 2) == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0119, code lost:
    
        r4 = 19 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0122, code lost:
    
        if (r7.d.am.x == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x012b, code lost:
    
        if (r7.d.am.x == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x012d, code lost:
    
        r0 = r7.d;
        r4 = r0.new OooOOO0(r0.V, net.sqlcipher.BuildConfig.FLAVOR);
        r0 = (-2) - ((ivas.gov.bisp.enumeration.activity.j.a + 62) ^ (-1));
        ivas.gov.bisp.enumeration.activity.j.b = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0143, code lost:
    
        if ((r0 % 2) == 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0145, code lost:
    
        r4.execute(new java.lang.Void[1]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x014b, code lost:
    
        r4.execute(new java.lang.Void[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0150, code lost:
    
        r0 = ivas.gov.bisp.enumeration.activity.j.a;
        r2 = r0 & 101;
        r1 = ((((r0 ^ 101) | r2) << 1) - (~(-((r0 | 101) & (~r2))))) - 1;
        ivas.gov.bisp.enumeration.activity.j.b = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0165, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0166, code lost:
    
        android.widget.Toast.makeText(r7.d, "Not a Valid Entry", 0).show();
        r0 = ivas.gov.bisp.enumeration.activity.j.b + 43;
        ivas.gov.bisp.enumeration.activity.j.a = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x017a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x017b, code lost:
    
        r1 = new android.app.AlertDialog.Builder(r7.d);
        r2 = ivas.gov.bisp.enumeration.activity.j.a;
        r4 = (r2 ^ 27) + ((r2 & 27) << 1);
        ivas.gov.bisp.enumeration.activity.j.b = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0191, code lost:
    
        if ((r4 % 2) != 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0193, code lost:
    
        r1.setTitle("Session Expire");
        r1.setMessage("Session Expire Please Login Again.!");
        r1.setCancelable(true);
        r1.setPositiveButton("Confirm", new ivas.gov.bisp.enumeration.activity.j.bax(r7));
        r2 = ivas.gov.bisp.enumeration.activity.j.b;
        r3 = ((r2 | 35) << 1) - (((~r2) & 35) | (r2 & (-36)));
        ivas.gov.bisp.enumeration.activity.j.a = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01bb, code lost:
    
        if ((r3 % 2) == 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01bd, code lost:
    
        r1.create().show();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01c4, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01c5, code lost:
    
        r1.create().show();
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01cf, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01d0, code lost:
    
        r1.setTitle("Session Expire");
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01d6, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0075, code lost:
    
        if (r1.ag.k().length() > 0) goto L13;
     */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onClick(android.view.View r8) {
        /*
            Method dump skipped, instruction units count: 492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.activity.j.onClick(android.view.View):void");
    }
}
