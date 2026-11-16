package ivas.gov.bisp.enumeration.bK;

import android.widget.AdapterView;

/* JADX INFO: loaded from: classes.dex */
public class at implements AdapterView.OnItemSelectedListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ ay c;

    public at(ay ayVar) {
        this.c = ayVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 ^ 97) | (i2 & 97)) << 1) - (((~i2) & 97) | (i2 & (-98)));
        a = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
    
        r0.c.f.setBackgroundResource(ivas.gov.bisp.enumeration.R.drawable.spinner_bg_selected);
        r2 = ivas.gov.bisp.enumeration.bK.at.a;
        r3 = r2 & 55;
        r2 = ((r2 | 55) & (~r3)) + (r3 << 1);
        ivas.gov.bisp.enumeration.bK.at.b = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x005b, code lost:
    
        if ((r2 % 2) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005e, code lost:
    
        r1 = null;
        r1.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0062, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r3 == 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r3 == 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r3 = r2 & 61;
        r2 = -(-((r2 ^ 61) | r3));
        r4 = (r3 ^ r2) + ((r2 & r3) << 1);
        ivas.gov.bisp.enumeration.bK.at.b = r4 % 128;
        r4 = r4 % 2;
        r0.c.f.setBackgroundResource(ivas.gov.bisp.enumeration.R.drawable.spinner_bg);
        r2 = ivas.gov.bisp.enumeration.bK.at.a;
        r3 = r2 & 107;
        r3 = r3 + ((r2 ^ 107) | r3);
        ivas.gov.bisp.enumeration.bK.at.b = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0040, code lost:
    
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
            int r2 = ivas.gov.bisp.enumeration.bK.at.a
            int r4 = r2 + 33
            int r5 = r4 % 128
            ivas.gov.bisp.enumeration.bK.at.b = r5
            int r4 = r4 % r1
            if (r4 == 0) goto L15
            r4 = 13
            int r4 = r4 / 0
            if (r3 != 0) goto L41
            goto L17
        L15:
            if (r3 != 0) goto L41
        L17:
            r3 = r2 & 61
            r2 = r2 ^ 61
            r2 = r2 | r3
            int r2 = -r2
            int r2 = -r2
            r4 = r3 ^ r2
            r2 = r2 & r3
            int r2 = r2 << 1
            int r4 = r4 + r2
            int r2 = r4 % 128
            ivas.gov.bisp.enumeration.bK.at.b = r2
            int r4 = r4 % r1
            ivas.gov.bisp.enumeration.bK.ay r2 = r0.c
            android.widget.Spinner r2 = r2.f
            r3 = 2131230998(0x7f080116, float:1.8078065E38)
            r2.setBackgroundResource(r3)
            int r2 = ivas.gov.bisp.enumeration.bK.at.a
            r3 = r2 & 107(0x6b, float:1.5E-43)
            r2 = r2 ^ 107(0x6b, float:1.5E-43)
            r2 = r2 | r3
            int r3 = r3 + r2
            int r2 = r3 % 128
            ivas.gov.bisp.enumeration.bK.at.b = r2
            int r3 = r3 % r1
            return
        L41:
            ivas.gov.bisp.enumeration.bK.ay r2 = r0.c
            android.widget.Spinner r2 = r2.f
            r3 = 2131231000(0x7f080118, float:1.8078069E38)
            r2.setBackgroundResource(r3)
            int r2 = ivas.gov.bisp.enumeration.bK.at.a
            r3 = r2 & 55
            int r4 = ~r3
            r2 = r2 | 55
            r2 = r2 & r4
            int r3 = r3 << 1
            int r2 = r2 + r3
            int r3 = r2 % 128
            ivas.gov.bisp.enumeration.bK.at.b = r3
            int r2 = r2 % r1
            if (r2 != 0) goto L5e
            return
        L5e:
            r1 = 0
            r1.hashCode()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.bK.at.onItemSelected(android.widget.AdapterView, android.view.View, int, long):void");
    }
}
