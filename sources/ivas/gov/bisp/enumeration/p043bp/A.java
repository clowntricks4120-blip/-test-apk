package ivas.gov.bisp.enumeration.p043bp;

import android.content.DialogInterface;
import ivas.gov.bisp.enumeration.q;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class A implements DialogInterface.OnClickListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ q d;

    public /* synthetic */ A(q qVar, int i) {
        this.c = i;
        this.d = qVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0045, code lost:
    
        if ((r0 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0047, code lost:
    
        r5 = r3.d;
        java.util.Objects.requireNonNull(r5);
        r0 = ivas.gov.bisp.enumeration.enumerator.ActivityEnumeratorMain.ac;
        r1 = 69 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0052, code lost:
    
        if (r0 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
    
        r5 = r3.d;
        java.util.Objects.requireNonNull(r5);
        r0 = ivas.gov.bisp.enumeration.enumerator.ActivityEnumeratorMain.ac;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005c, code lost:
    
        if (r0 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
    
        r0.finish();
        r0 = ivas.gov.bisp.enumeration.p043bp.A.b;
        r1 = r0 & 41;
        r0 = (r0 ^ 41) | r1;
        r2 = (r1 ^ r0) + ((r0 & r1) << 1);
        ivas.gov.bisp.enumeration.p043bp.A.a = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0073, code lost:
    
        ivas.gov.bisp.enumeration.ActivityBeginSurvey.this.finish();
        r5 = ivas.gov.bisp.enumeration.p043bp.A.b;
        r0 = r5 & 113;
        r0 = r0 + ((r5 ^ 113) | r0);
        ivas.gov.bisp.enumeration.p043bp.A.a = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0087, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0088, code lost:
    
        ivas.gov.bisp.enumeration.ActivityBeginSurvey.this.finish();
        r5 = ivas.gov.bisp.enumeration.p043bp.A.b;
        r0 = r5 & 55;
        r0 = r0 + ((r5 ^ 55) | r0);
        ivas.gov.bisp.enumeration.p043bp.A.a = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
    
        if (r3.c != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r3.c != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r0 = (r5 & 117) + (r5 | 117);
        ivas.gov.bisp.enumeration.p043bp.A.b = r0 % 128;
        r0 = r0 % 2;
        r0 = r5 | 67;
        r1 = r0 << 1;
        r5 = -((~(r5 & 67)) & r0);
        r0 = (r1 ^ r5) + ((r5 & r1) << 1);
        ivas.gov.bisp.enumeration.p043bp.A.b = r0 % 128;
     */
    @Override // android.content.DialogInterface.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onClick(android.content.DialogInterface r4, int r5) {
        /*
            r3 = this;
            r4 = 2
            int r5 = r4 % r4
            int r5 = ivas.gov.bisp.enumeration.p043bp.A.b
            r0 = r5 ^ 47
            r1 = r5 & 47
            r0 = r0 | r1
            int r0 = r0 << 1
            r1 = r5 & (-48)
            int r5 = ~r5
            r2 = 47
            r5 = r5 & r2
            r5 = r5 | r1
            int r0 = r0 - r5
            int r5 = r0 % 128
            ivas.gov.bisp.enumeration.p043bp.A.a = r5
            int r0 = r0 % r4
            if (r0 != 0) goto L23
            int r0 = r3.c
            r1 = 6
            int r1 = r1 / 0
            if (r0 == 0) goto L88
            goto L27
        L23:
            int r0 = r3.c
            if (r0 == 0) goto L88
        L27:
            r0 = r5 & 117(0x75, float:1.64E-43)
            r1 = r5 | 117(0x75, float:1.64E-43)
            int r0 = r0 + r1
            int r1 = r0 % 128
            ivas.gov.bisp.enumeration.p043bp.A.b = r1
            int r0 = r0 % r4
            r0 = r5 | 67
            int r1 = r0 << 1
            r5 = r5 & 67
            int r5 = ~r5
            r5 = r5 & r0
            int r5 = -r5
            r0 = r1 ^ r5
            r5 = r5 & r1
            int r5 = r5 << 1
            int r0 = r0 + r5
            int r5 = r0 % 128
            ivas.gov.bisp.enumeration.p043bp.A.b = r5
            int r0 = r0 % r4
            if (r0 == 0) goto L55
            ivas.gov.bisp.enumeration.q r5 = r3.d
            java.util.Objects.requireNonNull(r5)
            ivas.gov.bisp.enumeration.enumerator.ActivityEnumeratorMain r0 = ivas.gov.bisp.enumeration.enumerator.ActivityEnumeratorMain.ac
            r1 = 69
            int r1 = r1 / 0
            if (r0 == 0) goto L73
            goto L5e
        L55:
            ivas.gov.bisp.enumeration.q r5 = r3.d
            java.util.Objects.requireNonNull(r5)
            ivas.gov.bisp.enumeration.enumerator.ActivityEnumeratorMain r0 = ivas.gov.bisp.enumeration.enumerator.ActivityEnumeratorMain.ac
            if (r0 == 0) goto L73
        L5e:
            r0.finish()
            int r0 = ivas.gov.bisp.enumeration.p043bp.A.b
            r1 = r0 & 41
            r0 = r0 ^ 41
            r0 = r0 | r1
            r2 = r1 ^ r0
            r0 = r0 & r1
            int r0 = r0 << 1
            int r2 = r2 + r0
            int r0 = r2 % 128
            ivas.gov.bisp.enumeration.p043bp.A.a = r0
            int r2 = r2 % r4
        L73:
            ivas.gov.bisp.enumeration.ActivityBeginSurvey$OooO0o r5 = r5.c
            ivas.gov.bisp.enumeration.ActivityBeginSurvey r5 = ivas.gov.bisp.enumeration.ActivityBeginSurvey.this
            r5.finish()
            int r5 = ivas.gov.bisp.enumeration.p043bp.A.b
            r0 = r5 & 113(0x71, float:1.58E-43)
            r5 = r5 ^ 113(0x71, float:1.58E-43)
            r5 = r5 | r0
            int r0 = r0 + r5
            int r5 = r0 % 128
            ivas.gov.bisp.enumeration.p043bp.A.a = r5
            int r0 = r0 % r4
            return
        L88:
            ivas.gov.bisp.enumeration.q r5 = r3.d
            ivas.gov.bisp.enumeration.ActivityBeginSurvey$OooO0o r5 = r5.c
            ivas.gov.bisp.enumeration.ActivityBeginSurvey r5 = ivas.gov.bisp.enumeration.ActivityBeginSurvey.this
            r5.finish()
            int r5 = ivas.gov.bisp.enumeration.p043bp.A.b
            r0 = r5 & 55
            r5 = r5 ^ 55
            r5 = r5 | r0
            int r0 = r0 + r5
            int r5 = r0 % 128
            ivas.gov.bisp.enumeration.p043bp.A.a = r5
            int r0 = r0 % r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p043bp.A.onClick(android.content.DialogInterface, int):void");
    }
}
