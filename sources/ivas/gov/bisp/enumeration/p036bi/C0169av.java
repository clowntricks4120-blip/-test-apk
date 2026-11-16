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

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bi.av, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0169av implements J {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ ShockQuestion c;

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bi.av$bmT */
    public class bmT implements AdapterView.OnItemSelectedListener {
        private static int a = 0;
        private static int b = 1;

        public bmT() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 83;
            int i4 = (i2 ^ 83) | i3;
            int i5 = (i3 & i4) + (i4 | i3);
            b = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = (-2) - (((i3 ^ 26) + ((i3 & 26) << 1)) ^ (-1));
            b = i4 % 128;
            int i5 = i4 % 2;
            if (i == 0) {
                int i6 = (i3 ^ 9) + ((i3 & 9) << 1);
                b = i6 % 128;
                int i7 = i6 % 2;
                Spinner spinner = C0169av.this.c.aC;
                int i8 = b;
                int i9 = ((i8 ^ 35) | (i8 & 35)) << 1;
                int i10 = -(((~i8) & 35) | (i8 & (-36)));
                int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
                a = i11 % 128;
                int i12 = i11 % 2;
                spinner.setBackgroundResource(R.drawable.spinner_bg);
                int i13 = a + 79;
                b = i13 % 128;
                if (i13 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Spinner spinner2 = C0169av.this.c.aC;
            int i14 = b;
            int i15 = i14 & 77;
            int i16 = (i14 ^ 77) | i15;
            int i17 = (i15 & i16) + (i16 | i15);
            a = i17 % 128;
            int i18 = i17 % 2;
            spinner2.setBackgroundResource(R.drawable.spinner_bg_selected);
            ShockQuestion shockQuestion = C0169av.this.c;
            int i19 = b + 51;
            a = i19 % 128;
            if (i19 % 2 != 0) {
                shockQuestion.bU = adapterView.getItemAtPosition(i).toString();
                int i20 = 25 / 0;
            } else {
                shockQuestion.bU = adapterView.getItemAtPosition(i).toString();
            }
            int i21 = a;
            int i22 = (i21 & (-120)) | ((~i21) & 119);
            int i23 = (i21 & 119) << 1;
            int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
            b = i24 % 128;
            int i25 = i24 % 2;
        }
    }

    public C0169av(ShockQuestion shockQuestion) {
        this.c = shockQuestion;
    }

    @Override // ivas.gov.bisp.enumeration.W.J
    public void fillList(ArrayList<Item> arrayList) {
        int i = 2 % 2;
        Objects.requireNonNull(this.c);
        Spinner spinner = this.c.aC;
        bmT bmt = new bmT();
        int i2 = b;
        int i3 = (i2 & 85) + (i2 | 85);
        a = i3 % 128;
        int i4 = i3 % 2;
        spinner.setOnItemSelectedListener(bmt);
        int i5 = a;
        int i6 = (i5 & (-18)) | ((~i5) & 17);
        int i7 = -(-((i5 & 17) << 1));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        b = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
    }
}
