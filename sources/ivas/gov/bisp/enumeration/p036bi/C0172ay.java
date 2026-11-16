package ivas.gov.bisp.enumeration.p036bi;

import android.view.View;
import android.widget.AdapterView;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.W.J;
import ivas.gov.bisp.enumeration.activity.ShockQuestion;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bi.ay, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0172ay implements J {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ ShockQuestion c;

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bi.ay$bnO */
    public class bnO implements AdapterView.OnItemSelectedListener {
        private static int a = 0;
        private static int b = 1;

        public bnO() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            ShockQuestion shockQuestion;
            String string;
            int i2 = 2 % 2;
            int i3 = a + 108;
            int i4 = (i3 ^ (-1)) + (i3 << 1);
            b = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            if (i == 0) {
                C0172ay.this.c.aQ.setBackgroundResource(R.drawable.spinner_bg);
                int i5 = b;
                int i6 = (i5 ^ 15) + ((i5 & 15) << 1);
                a = i6 % 128;
                int i7 = i6 % 2;
                return;
            }
            C0172ay.this.c.aQ.setBackgroundResource(R.drawable.spinner_bg_selected);
            int i8 = b;
            int i9 = (i8 & (-122)) | ((~i8) & 121);
            int i10 = (i8 & 121) << 1;
            int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
            a = i11 % 128;
            if (i11 % 2 != 0) {
                shockQuestion = C0172ay.this.c;
                string = adapterView.getItemAtPosition(i).toString();
                int i12 = 81 / 0;
            } else {
                shockQuestion = C0172ay.this.c;
                string = adapterView.getItemAtPosition(i).toString();
            }
            shockQuestion.bW = string;
            int i13 = b;
            int i14 = (i13 & (-42)) | ((~i13) & 41);
            int i15 = -(-((i13 & 41) << 1));
            int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
            a = i16 % 128;
            int i17 = i16 % 2;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 121;
            int i4 = ((i2 ^ 121) | i3) << 1;
            int i5 = -((i2 | 121) & (~i3));
            int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
            a = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    public C0172ay(ShockQuestion shockQuestion) {
        this.c = shockQuestion;
    }

    @Override // ivas.gov.bisp.enumeration.W.J
    public void fillList(ArrayList<Item> arrayList) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 109) + (i2 | 109);
        a = i3 % 128;
        int i4 = i3 % 2;
        Objects.requireNonNull(this.c);
        this.c.aQ.setOnItemSelectedListener(new bnO());
        int i5 = a;
        int i6 = (i5 & (-62)) | ((~i5) & 61);
        int i7 = (i5 & 61) << 1;
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        b = i8 % 128;
        int i9 = i8 % 2;
    }
}
