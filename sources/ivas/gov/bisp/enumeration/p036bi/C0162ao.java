package ivas.gov.bisp.enumeration.p036bi;

import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.W.J;
import ivas.gov.bisp.enumeration.activity.ShockQuestion;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bi.ao, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0162ao implements J {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ ShockQuestion c;

    public C0162ao(ShockQuestion shockQuestion) {
        this.c = shockQuestion;
    }

    @Override // ivas.gov.bisp.enumeration.W.J
    public void fillList(ArrayList<Item> arrayList) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 57;
        int i4 = -(-((i2 ^ 57) | i3));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        Objects.requireNonNull(this.c);
        this.c.aA.setOnItemSelectedListener(new bmM());
        int i7 = a;
        int i8 = i7 & 101;
        int i9 = (((i7 ^ 101) | i8) << 1) - ((i7 | 101) & (~i8));
        b = i9 % 128;
        int i10 = i9 % 2;
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bi.ao$bmM */
    public class bmM implements AdapterView.OnItemSelectedListener {
        private static int a = 0;
        private static int b = 1;

        public bmM() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 91;
            int i4 = i2 | 91;
            int i5 = (i3 & i4) + (i4 | i3);
            b = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 15 / 0;
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = ((((i3 ^ 61) | (i3 & 61)) << 1) - (~(-(((~i3) & 61) | (i3 & (-62)))))) - 1;
            int i5 = i4 % 128;
            b = i5;
            int i6 = i4 % 2;
            if (i == 0) {
                int i7 = i5 & 61;
                int i8 = i7 + ((i5 ^ 61) | i7);
                a = i8 % 128;
                int i9 = i8 % 2;
                C0162ao.this.c.aA.setBackgroundResource(R.drawable.spinner_bg);
                int i10 = b;
                int i11 = i10 & 65;
                int i12 = (i10 | 65) & (~i11);
                int i13 = -(-(i11 << 1));
                int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
                a = i14 % 128;
                int i15 = i14 % 2;
                C0162ao.this.c.cn.setVisibility(8);
                int i16 = a + 41;
                b = i16 % 128;
                if (i16 % 2 == 0) {
                    int i17 = 91 / 0;
                    return;
                }
                return;
            }
            C0162ao.this.c.aA.setBackgroundResource(R.drawable.spinner_bg_selected);
            int i18 = a;
            int i19 = ((i18 & (-42)) | ((~i18) & 41)) + ((i18 & 41) << 1);
            b = i19 % 128;
            if (i19 % 2 == 0) {
                ShockQuestion shockQuestion = C0162ao.this.c;
                adapterView.getItemAtPosition(i).toString();
                throw null;
            }
            ShockQuestion shockQuestion2 = C0162ao.this.c;
            String string = adapterView.getItemAtPosition(i).toString();
            int i20 = a + 101;
            b = i20 % 128;
            int i21 = i20 % 2;
            shockQuestion2.bR = string;
            LinearLayout linearLayout = C0162ao.this.c.cn;
            int i22 = b;
            int i23 = (i22 ^ 59) + ((i22 & 59) << 1);
            a = i23 % 128;
            int i24 = i23 % 2;
            linearLayout.setVisibility(0);
            int i25 = a;
            int i26 = i25 ^ 75;
            int i27 = -(-((i25 & 75) << 1));
            int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
            b = i28 % 128;
            int i29 = i28 % 2;
        }
    }
}
