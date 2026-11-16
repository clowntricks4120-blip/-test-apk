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

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bi.at, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0167at implements J {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ ShockQuestion c;

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bi.at$bmW */
    public class bmW implements AdapterView.OnItemSelectedListener {
        private static int a = 0;
        private static int b = 1;

        public bmW() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 & (-92)) | ((~i2) & 91)) + ((i2 & 91) << 1);
            a = i3 % 128;
            int i4 = i3 % 2;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            ShockQuestion shockQuestion;
            String string;
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = ((i3 & 44) + (i3 | 44)) - 1;
            int i5 = i4 % 128;
            b = i5;
            int i6 = i4 % 2;
            Object obj = null;
            if (i == 0) {
                int i7 = i5 & 3;
                int i8 = (((~i7) & (i5 | 3)) - (~(-(-(i7 << 1))))) - 1;
                a = i8 % 128;
                if (i8 % 2 != 0) {
                    Spinner spinner = C0167at.this.c.aU;
                    obj.hashCode();
                    throw null;
                }
                Spinner spinner2 = C0167at.this.c.aU;
                int i9 = a;
                int i10 = i9 & 99;
                int i11 = (i9 | 99) & (~i10);
                int i12 = i10 << 1;
                int i13 = ((i11 | i12) << 1) - (i11 ^ i12);
                b = i13 % 128;
                if (i13 % 2 != 0) {
                    spinner2.setBackgroundResource(R.drawable.spinner_bg);
                    return;
                } else {
                    spinner2.setBackgroundResource(R.drawable.spinner_bg);
                    throw null;
                }
            }
            C0167at.this.c.aU.setBackgroundResource(R.drawable.spinner_bg_selected);
            int i14 = b;
            int i15 = (-2) - (((i14 ^ 20) + ((i14 & 20) << 1)) ^ (-1));
            a = i15 % 128;
            if (i15 % 2 != 0) {
                shockQuestion = C0167at.this.c;
                string = adapterView.getItemAtPosition(i).toString();
                int i16 = 43 / 0;
            } else {
                shockQuestion = C0167at.this.c;
                string = adapterView.getItemAtPosition(i).toString();
            }
            shockQuestion.bQ = string;
            int i17 = b;
            int i18 = (((i17 ^ 75) | (i17 & 75)) << 1) - (((~i17) & 75) | (i17 & (-76)));
            a = i18 % 128;
            if (i18 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    public C0167at(ShockQuestion shockQuestion) {
        this.c = shockQuestion;
    }

    @Override // ivas.gov.bisp.enumeration.W.J
    public void fillList(ArrayList<Item> arrayList) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 | 5;
        int i4 = ((i3 << 1) - (~(-((~(i2 & 5)) & i3)))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        Objects.requireNonNull(this.c);
        this.c.aU.setOnItemSelectedListener(new bmW());
        int i6 = a;
        int i7 = ((i6 | 49) << 1) - (i6 ^ 49);
        b = i7 % 128;
        int i8 = i7 % 2;
    }
}
