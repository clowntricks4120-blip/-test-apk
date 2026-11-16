package ivas.gov.bisp.enumeration.bG;

import android.view.View;
import android.widget.AdapterView;
import ivas.gov.bisp.enumeration.W.InterfaceC0029o;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bG.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0118b implements AdapterView.OnItemSelectedListener {
    private static int a = 0;
    private static int b = 1;
    public boolean c = false;
    public InterfaceC0029o d;

    public C0118b() {
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 & 77) - (~(i3 | 77))) - 1;
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        if (this.c) {
            int i7 = i5 & 103;
            int i8 = ((i5 ^ 103) | i7) << 1;
            int i9 = -((i5 | 103) & (~i7));
            int i10 = (i8 & i9) + (i9 | i8);
            b = i10 % 128;
            int i11 = i10 % 2;
            this.d.onItemSelected(adapterView, view, i, j);
            int i12 = a;
            int i13 = i12 & 79;
            int i14 = -(-((i12 ^ 79) | i13));
            int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
            b = i15 % 128;
            int i16 = i15 % 2;
        }
        int i17 = a;
        int i18 = ((i17 ^ 109) - (~((i17 & 109) << 1))) - 1;
        b = i18 % 128;
        if (i18 % 2 == 0) {
            int i19 = 82 / 0;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
        int i = 2 % 2;
        int i2 = b + 87;
        a = i2 % 128;
        int i3 = i2 % 2;
    }

    public C0118b(InterfaceC0029o interfaceC0029o) {
        this.d = interfaceC0029o;
    }
}
