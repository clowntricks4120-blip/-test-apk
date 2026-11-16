package ivas.gov.bisp.enumeration.p031bd;

import android.widget.AdapterView;
import android.widget.Spinner;
import ivas.gov.bisp.enumeration.activity.discrepancy.MaritalDiscrepancy;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class am implements AdapterView.OnItemSelectedListener {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ Spinner c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ MaritalDiscrepancy e;

    public am(MaritalDiscrepancy maritalDiscrepancy, Spinner spinner, ArrayList arrayList) {
        this.e = maritalDiscrepancy;
        this.c = spinner;
        this.d = arrayList;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
        MaritalDiscrepancy maritalDiscrepancy;
        boolean z;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 81) + (i2 | 81);
        b = i3 % 128;
        if (i3 % 2 == 0) {
            maritalDiscrepancy = this.e;
            z = true;
        } else {
            maritalDiscrepancy = this.e;
            z = false;
        }
        maritalDiscrepancy.as = z;
        int i4 = b + 119;
        a = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004a, code lost:
    
        if ((r3 % 2) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
    
        r1 = 81 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0050, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0051, code lost:
    
        r3.aP = ((ivas.gov.bisp.enumeration.databaseModels.Item) r42.d.get(r45)).getOption();
        r3 = r42.e;
        r4 = r42.d;
        r6 = ivas.gov.bisp.enumeration.p031bd.am.b + 97;
        ivas.gov.bisp.enumeration.p031bd.am.a = r6 % 128;
        r6 = r6 % 2;
        r3.ay = ((ivas.gov.bisp.enumeration.databaseModels.Item) r4.get(r45)).getOptionId();
        r42.c.setBackgroundResource(ivas.gov.bisp.enumeration.R.drawable.spinner_bg_selected);
        r1 = r42.e;
        r3 = new ivas.gov.bisp.enumeration.models.RosterItem(r1.aG, r1.ar, r1.aI, net.sqlcipher.BuildConfig.FLAVOR, r1.aL, r1.at, r1.aU, r1.aK, r1.aJ, r1.au, r1.aA, r1.aR, r1.aS, r1.aT, r1.av, r1.aw, r1.aO, r1.aq, r1.al, r1.aP, r1.ay, r1.aN, r1.aC, r1.aD, r1.aV, r1.ax, r1.az, r1.aM, r1.aE, r1.an, r1.aB, r1.ao, r1.ap, r1.am);
        r2 = ivas.gov.bisp.enumeration.p031bd.am.a;
        r3 = r2 & 35;
        r2 = (r2 | 35) & (~r3);
        r3 = r3 << 1;
        r4 = (r2 & r3) + (r2 | r3);
        ivas.gov.bisp.enumeration.p031bd.am.b = r4 % 128;
        r4 = r4 % 2;
        r1.ae = r3;
        r1 = ivas.gov.bisp.enumeration.p031bd.am.b;
        r2 = ((r1 | 1) << 1) - (r1 ^ 1);
        ivas.gov.bisp.enumeration.p031bd.am.a = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0124, code lost:
    
        if ((r2 % 2) != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0126, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0128, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if (r45 == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (r45 == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        r1 = ivas.gov.bisp.enumeration.p031bd.am.b;
        r3 = r1 & 119;
        r1 = (r1 ^ 119) | r3;
        r4 = ((r3 | r1) << 1) - (r1 ^ r3);
        ivas.gov.bisp.enumeration.p031bd.am.a = r4 % 128;
        r4 = r4 % 2;
        r42.c.setBackgroundResource(ivas.gov.bisp.enumeration.R.drawable.spinner_bg);
        r1 = ivas.gov.bisp.enumeration.p031bd.am.a;
        r3 = (r1 & 5) + (r1 | 5);
        ivas.gov.bisp.enumeration.p031bd.am.b = r3 % 128;
     */
    @Override // android.widget.AdapterView.OnItemSelectedListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onItemSelected(android.widget.AdapterView<?> r43, android.view.View r44, int r45, long r46) {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p031bd.am.onItemSelected(android.widget.AdapterView, android.view.View, int, long):void");
    }
}
