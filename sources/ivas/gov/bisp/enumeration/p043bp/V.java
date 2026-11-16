package ivas.gov.bisp.enumeration.p043bp;

import android.app.DatePickerDialog;
import ivas.gov.bisp.enumeration.activitybase.BaseTouch;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class V implements DatePickerDialog.OnDateSetListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ V(BaseTouch baseTouch, int i) {
        this.c = i;
        this.d = baseTouch;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0132  */
    /* JADX WARN: Code duplicated, block: B:28:0x0145  */
    /* JADX WARN: Code duplicated, block: B:29:0x014e  */
    /* JADX WARN: Code duplicated, block: B:31:0x016e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0215  */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x032e, code lost:
    
        if (r1 > 115.0d) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0339, code lost:
    
        if (r1 > 115.0d) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x033b, code lost:
    
        android.widget.Toast.makeText(r4, "Maximum Age should be 115", r7).show();
        r4.K();
        r1 = ivas.gov.bisp.enumeration.p043bp.V.a;
        r2 = r1 & 17;
        r1 = -(-((r1 ^ 17) | r2));
        r3 = ((r2 | r1) << 1) - (r1 ^ r2);
        ivas.gov.bisp.enumeration.p043bp.V.b = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x035a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x035b, code lost:
    
        r4.H(r1);
        r4.M(r4.br);
        r1 = ivas.gov.bisp.enumeration.p043bp.V.b;
        r2 = r1 & 19;
        r1 = (r1 ^ 19) | r2;
        r3 = (r2 ^ r1) + ((r1 & r2) << 1);
        ivas.gov.bisp.enumeration.p043bp.V.a = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0376, code lost:
    
        if ((r3 % 2) != 0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0378, code lost:
    
        r1 = 92 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x037c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:?, code lost:
    
        return;
     */
    @Override // android.app.DatePickerDialog.OnDateSetListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onDateSet(android.widget.DatePicker r19, int r20, int r21, int r22) {
        /*
            Method dump skipped, instruction units count: 898
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p043bp.V.onDateSet(android.widget.DatePicker, int, int, int):void");
    }
}
