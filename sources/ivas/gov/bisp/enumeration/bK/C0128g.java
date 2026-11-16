package ivas.gov.bisp.enumeration.bK;

import android.view.View;
import android.widget.AdapterView;
import ivas.gov.bisp.enumeration.R;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bK.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0128g implements AdapterView.OnItemSelectedListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ av c;

    public C0128g(av avVar) {
        this.c = avVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 53;
        int i4 = ((i2 & 53) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (((i3 | 76) << 1) - (i3 ^ 76)) - 1;
        int i5 = i4 % 128;
        b = i5;
        int i6 = i4 % 2;
        if (i != 0) {
            this.c.e.setBackgroundResource(R.drawable.spinner_bg_selected);
            int i7 = a;
            int i8 = (((i7 | 88) << 1) - (i7 ^ 88)) - 1;
            b = i8 % 128;
            int i9 = i8 % 2;
            return;
        }
        int i10 = i5 + 65;
        a = i10 % 128;
        if (i10 % 2 != 0) {
            this.c.e.setBackgroundResource(R.drawable.spinner_bg);
        } else {
            this.c.e.setBackgroundResource(R.drawable.spinner_bg);
            throw null;
        }
    }
}
