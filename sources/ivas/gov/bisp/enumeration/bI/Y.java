package ivas.gov.bisp.enumeration.bI;

import android.widget.AdapterView;
import ivas.gov.bisp.enumeration.rosterActivity.OfflineRosterActivity;

/* JADX INFO: loaded from: classes.dex */
public class Y implements AdapterView.OnItemSelectedListener {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ OfflineRosterActivity c;

    public Y(OfflineRosterActivity offlineRosterActivity) {
        this.c = offlineRosterActivity;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0045, code lost:
    
        r0.c.sp_banks.setBackgroundResource(ivas.gov.bisp.enumeration.R.drawable.spinner_bg_selected);
        r2 = ivas.gov.bisp.enumeration.bI.Y.a;
        r3 = (r2 & (-28)) | ((~r2) & 27);
        r2 = (r2 & 27) << 1;
        r4 = (r3 & r2) + (r2 | r3);
        ivas.gov.bisp.enumeration.bI.Y.b = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0064, code lost:
    
        if ((r4 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0066, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0067, code lost:
    
        r1 = null;
        r1.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r3 == 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r3 == 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r2 = ((r4 & 46) + (r4 | 46)) - 1;
        ivas.gov.bisp.enumeration.bI.Y.b = r2 % 128;
        r2 = r2 % 2;
        r0.c.sp_banks.setBackgroundResource(ivas.gov.bisp.enumeration.R.drawable.spinner_bg);
        r2 = ivas.gov.bisp.enumeration.bI.Y.a;
        r4 = r2 & 53;
        r3 = ((((r2 ^ 53) | r4) << 1) - (~(-((r2 | 53) & (~r4))))) - 1;
        ivas.gov.bisp.enumeration.bI.Y.b = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0044, code lost:
    
        return;
     */
    @Override // android.widget.AdapterView.OnItemSelectedListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onItemSelected(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
        /*
            r0 = this;
            r1 = 2
            int r2 = r1 % r1
            int r2 = ivas.gov.bisp.enumeration.bI.Y.b
            int r2 = r2 + 43
            int r4 = r2 % 128
            ivas.gov.bisp.enumeration.bI.Y.a = r4
            int r2 = r2 % r1
            if (r2 == 0) goto L15
            r2 = 68
            int r2 = r2 / 0
            if (r3 != 0) goto L45
            goto L17
        L15:
            if (r3 != 0) goto L45
        L17:
            r2 = r4 & 46
            r3 = r4 | 46
            int r2 = r2 + r3
            int r2 = r2 + (-1)
            int r3 = r2 % 128
            ivas.gov.bisp.enumeration.bI.Y.b = r3
            int r2 = r2 % r1
            ivas.gov.bisp.enumeration.rosterActivity.OfflineRosterActivity r2 = r0.c
            android.widget.Spinner r2 = r2.sp_banks
            r3 = 2131230998(0x7f080116, float:1.8078065E38)
            r2.setBackgroundResource(r3)
            int r2 = ivas.gov.bisp.enumeration.bI.Y.a
            r3 = r2 ^ 53
            r4 = r2 & 53
            r3 = r3 | r4
            int r3 = r3 << 1
            int r4 = ~r4
            r2 = r2 | 53
            r2 = r2 & r4
            int r2 = -r2
            int r2 = ~r2
            int r3 = r3 - r2
            int r3 = r3 + (-1)
            int r2 = r3 % 128
            ivas.gov.bisp.enumeration.bI.Y.b = r2
            int r3 = r3 % r1
            return
        L45:
            ivas.gov.bisp.enumeration.rosterActivity.OfflineRosterActivity r2 = r0.c
            android.widget.Spinner r2 = r2.sp_banks
            r3 = 2131231000(0x7f080118, float:1.8078069E38)
            r2.setBackgroundResource(r3)
            int r2 = ivas.gov.bisp.enumeration.bI.Y.a
            r3 = r2 & (-28)
            int r4 = ~r2
            r4 = r4 & 27
            r3 = r3 | r4
            r2 = r2 & 27
            int r2 = r2 << 1
            r4 = r3 & r2
            r2 = r2 | r3
            int r4 = r4 + r2
            int r2 = r4 % 128
            ivas.gov.bisp.enumeration.bI.Y.b = r2
            int r4 = r4 % r1
            if (r4 == 0) goto L67
            return
        L67:
            r1 = 0
            r1.hashCode()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.bI.Y.onItemSelected(android.widget.AdapterView, android.view.View, int, long):void");
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 105) + (i2 | 105);
        b = i3 % 128;
        int i4 = i3 % 2;
    }
}
