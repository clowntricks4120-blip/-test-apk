package ivas.gov.bisp.enumeration.dd;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import ivas.gov.bisp.enumeration.activity.singlediscrepancy.MaritalStatusActivity;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import ivas.gov.bisp.enumeration.models.RosterItem;
import java.util.ArrayList;
import net.sqlcipher.BuildConfig;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.dd.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0296s implements AdapterView.OnItemSelectedListener {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ Spinner c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ MaritalStatusActivity e;

    public C0296s(MaritalStatusActivity maritalStatusActivity, Spinner spinner, ArrayList arrayList) {
        this.e = maritalStatusActivity;
        this.c = spinner;
        this.d = arrayList;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 45;
        int i4 = -(-(i2 | 45));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        this.e.aV = false;
        int i7 = b + 73;
        a = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 | 29) << 1;
        int i5 = -(((~i3) & 29) | (i3 & (-30)));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        MaritalStatusActivity maritalStatusActivity = this.e;
        maritalStatusActivity.aV = true;
        if (i == 0) {
            int i8 = a;
            int i9 = i8 & 45;
            int i10 = i9 + ((i8 ^ 45) | i9);
            b = i10 % 128;
            int i11 = i10 % 2;
            this.c.setBackgroundResource(ivas.gov.bisp.enumeration.R.drawable.spinner_bg);
            int i12 = a;
            int i13 = (i12 & 67) + (i12 | 67);
            b = i13 % 128;
            int i14 = i13 % 2;
            return;
        }
        maritalStatusActivity.ap = ((Item) this.d.get(i)).getOption();
        MaritalStatusActivity maritalStatusActivity2 = this.e;
        ArrayList arrayList = this.d;
        int i15 = b;
        int i16 = ((i15 | 99) << 1) - (i15 ^ 99);
        a = i16 % 128;
        Object obj = null;
        if (i16 % 2 != 0) {
            maritalStatusActivity2.am = ((Item) arrayList.get(i)).getOptionId();
            this.c.setBackgroundResource(ivas.gov.bisp.enumeration.R.drawable.spinner_bg_selected);
            throw null;
        }
        maritalStatusActivity2.am = ((Item) arrayList.get(i)).getOptionId();
        this.c.setBackgroundResource(ivas.gov.bisp.enumeration.R.drawable.spinner_bg_selected);
        MaritalStatusActivity maritalStatusActivity3 = this.e;
        RosterItem rosterItem = new RosterItem(maritalStatusActivity3.aF, maritalStatusActivity3.aG, maritalStatusActivity3.aH, BuildConfig.FLAVOR, maritalStatusActivity3.aK, maritalStatusActivity3.aT, maritalStatusActivity3.aJ, maritalStatusActivity3.aI, maritalStatusActivity3.aQ, maritalStatusActivity3.aR, maritalStatusActivity3.aS, maritalStatusActivity3.aN, maritalStatusActivity3.aO, maritalStatusActivity3.aM, maritalStatusActivity3.aU, maritalStatusActivity3.aL, maritalStatusActivity3.aD, maritalStatusActivity3.an, maritalStatusActivity3.ao, maritalStatusActivity3.ap, maritalStatusActivity3.am, maritalStatusActivity3.ar, maritalStatusActivity3.aq, maritalStatusActivity3.as, maritalStatusActivity3.at, maritalStatusActivity3.aB, maritalStatusActivity3.ax, maritalStatusActivity3.au, maritalStatusActivity3.aA, maritalStatusActivity3.av, maritalStatusActivity3.aw, maritalStatusActivity3.al, maritalStatusActivity3.ay, maritalStatusActivity3.aC);
        int i17 = b;
        int i18 = ((i17 ^ 25) - (~((i17 & 25) << 1))) - 1;
        a = i18 % 128;
        int i19 = i18 % 2;
        maritalStatusActivity3.aP = rosterItem;
        int i20 = a + 99;
        b = i20 % 128;
        if (i20 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
