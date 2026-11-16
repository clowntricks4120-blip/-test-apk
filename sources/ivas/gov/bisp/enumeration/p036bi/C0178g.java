package ivas.gov.bisp.enumeration.p036bi;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.W.J;
import ivas.gov.bisp.enumeration.activity.ShockQuestion;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bi.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0178g implements J {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ ShockQuestion c;

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bi.g$bmQ */
    public class bmQ implements AdapterView.OnItemSelectedListener {
        private static int a = 1;
        private static int b;

        public bmQ() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = ((((i3 ^ 87) | (i3 & 87)) << 1) - (~(-((i3 & (-88)) | ((~i3) & 87))))) - 1;
            b = i4 % 128;
            int i5 = i4 % 2;
            if (i == 0) {
                int i6 = i3 & 75;
                int i7 = (i6 - (~((i3 ^ 75) | i6))) - 1;
                b = i7 % 128;
                int i8 = i7 % 2;
                C0178g.this.c.ao.setBackgroundResource(R.drawable.spinner_bg);
                int i9 = a;
                int i10 = i9 ^ 93;
                int i11 = ((i9 & 93) | i10) << 1;
                int i12 = -i10;
                int i13 = ((i11 | i12) << 1) - (i11 ^ i12);
                b = i13 % 128;
                if (i13 % 2 != 0) {
                    int i14 = 70 / 0;
                    return;
                }
                return;
            }
            C0178g.this.c.ao.setBackgroundResource(R.drawable.spinner_bg_selected);
            int i15 = a;
            int i16 = i15 & 111;
            int i17 = (i15 | 111) & (~i16);
            int i18 = i16 << 1;
            int i19 = (i17 & i18) + (i17 | i18);
            b = i19 % 128;
            int i20 = i19 % 2;
            ShockQuestion shockQuestion = C0178g.this.c;
            String string = adapterView.getItemAtPosition(i).toString();
            int i21 = a + 113;
            b = i21 % 128;
            int i22 = i21 % 2;
            shockQuestion.bT = string;
            int i23 = a;
            int i24 = i23 ^ 81;
            int i25 = (i23 & 81) << 1;
            int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
            b = i26 % 128;
            int i27 = i26 % 2;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 21;
            int i4 = i3 + ((i2 ^ 21) | i3);
            b = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public C0178g(ShockQuestion shockQuestion) {
        this.c = shockQuestion;
    }

    @Override // ivas.gov.bisp.enumeration.W.J
    public void fillList(ArrayList<Item> arrayList) {
        int i = 2 % 2;
        int i2 = a + 39;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            Objects.requireNonNull(this.c);
            Spinner spinner = this.c.ao;
            throw null;
        }
        Objects.requireNonNull(this.c);
        this.c.ao.setOnItemSelectedListener(new bmQ());
        int i3 = b;
        int i4 = (((i3 | 20) << 1) - (i3 ^ 20)) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
    }
}
