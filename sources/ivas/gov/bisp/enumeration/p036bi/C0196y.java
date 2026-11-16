package ivas.gov.bisp.enumeration.p036bi;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.activity.DisabilityActivity;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import ivas.gov.bisp.enumeration.models.RosterItem;
import java.util.ArrayList;
import java.util.Objects;
import net.sqlcipher.BuildConfig;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bi.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0196y implements AdapterView.OnItemSelectedListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ Spinner c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ DisabilityActivity e;

    public C0196y(DisabilityActivity disabilityActivity, Spinner spinner, ArrayList arrayList) {
        this.e = disabilityActivity;
        this.c = spinner;
        this.d = arrayList;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
        int i = 2 % 2;
        int i2 = (-2) - ((a + 18) ^ (-1));
        b = i2 % 128;
        int i3 = i2 % 2;
        this.e.aP = false;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    /* JADX WARN: Code duplicated, block: B:9:0x003f  */
    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (((i3 | 90) << 1) - (i3 ^ 90)) - 1;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 19 / 0;
            if (i == 0) {
                this.c.setBackgroundResource(R.drawable.spinner_bg);
                int i6 = b;
                int i7 = i6 ^ 59;
                int i8 = -(-((i6 & 59) << 1));
                int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
                a = i9 % 128;
                int i10 = i9 % 2;
            } else {
                this.e.aP = true;
                Spinner spinner = this.c;
                int i11 = b;
                int i12 = i11 & 19;
                int i13 = -(-((i11 ^ 19) | i12));
                int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
                a = i14 % 128;
                int i15 = i14 % 2;
                spinner.setBackgroundResource(R.drawable.spinner_bg_selected);
                int i16 = b;
                int i17 = (((i16 | 126) << 1) - (i16 ^ 126)) - 1;
                a = i17 % 128;
                int i18 = i17 % 2;
            }
        } else if (i == 0) {
            this.c.setBackgroundResource(R.drawable.spinner_bg);
            int i19 = b;
            int i20 = i19 ^ 59;
            int i21 = -(-((i19 & 59) << 1));
            int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
            a = i22 % 128;
            int i110 = i22 % 2;
        } else {
            this.e.aP = true;
            Spinner spinner2 = this.c;
            int i111 = b;
            int i112 = i111 & 19;
            int i113 = -(-((i111 ^ 19) | i112));
            int i114 = (i112 ^ i113) + ((i113 & i112) << 1);
            a = i114 % 128;
            int i115 = i114 % 2;
            spinner2.setBackgroundResource(R.drawable.spinner_bg_selected);
            int i116 = b;
            int i117 = (((i116 | 126) << 1) - (i116 ^ 126)) - 1;
            a = i117 % 128;
            int i118 = i117 % 2;
        }
        DisabilityActivity disabilityActivity = this.e;
        ((Item) this.d.get(i)).getOptionId();
        Objects.requireNonNull(disabilityActivity);
        int i23 = a;
        int i24 = (i23 & 113) + (i23 | 113);
        b = i24 % 128;
        if (i24 % 2 != 0) {
            DisabilityActivity disabilityActivity2 = this.e;
            ((Item) this.d.get(i)).getOption();
            Objects.requireNonNull(disabilityActivity2);
            throw null;
        }
        DisabilityActivity disabilityActivity3 = this.e;
        ((Item) this.d.get(i)).getOption();
        Objects.requireNonNull(disabilityActivity3);
        DisabilityActivity disabilityActivity4 = this.e;
        RosterItem rosterItem = new RosterItem(disabilityActivity4.aE, disabilityActivity4.aF, disabilityActivity4.aG, BuildConfig.FLAVOR, disabilityActivity4.aH, disabilityActivity4.aK, disabilityActivity4.aT, disabilityActivity4.aJ, disabilityActivity4.aI, disabilityActivity4.aQ, disabilityActivity4.aR, disabilityActivity4.aS, disabilityActivity4.aN, disabilityActivity4.aO, disabilityActivity4.aM, disabilityActivity4.aU, disabilityActivity4.aL, disabilityActivity4.aD, disabilityActivity4.an, disabilityActivity4.ao, disabilityActivity4.ap, disabilityActivity4.am, disabilityActivity4.ar, disabilityActivity4.aq, disabilityActivity4.as, disabilityActivity4.aC, disabilityActivity4.aB, disabilityActivity4.at, disabilityActivity4.au, disabilityActivity4.aA, disabilityActivity4.av, disabilityActivity4.aw, disabilityActivity4.al, disabilityActivity4.ay);
        int i25 = b;
        int i26 = ((i25 & (-20)) | ((~i25) & 19)) + ((i25 & 19) << 1);
        a = i26 % 128;
        if (i26 % 2 == 0) {
            disabilityActivity4.ak = rosterItem;
            int i27 = 54 / 0;
        } else {
            disabilityActivity4.ak = rosterItem;
        }
        int i28 = a;
        int i29 = i28 & 21;
        int i30 = (i28 ^ 21) | i29;
        int i31 = (i29 ^ i30) + ((i30 & i29) << 1);
        b = i31 % 128;
        int i32 = i31 % 2;
    }
}
