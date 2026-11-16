package ivas.gov.bisp.enumeration.p038bk;

import android.content.res.Resources;
import android.widget.CompoundButton;
import androidx.cardview.widget.CardView;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.models.NADRARosterItem;

/* JADX INFO: loaded from: classes.dex */
public class bn implements CompoundButton.OnCheckedChangeListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ NADRARosterItem c;
    public final /* synthetic */ bt.bpa d;
    public final /* synthetic */ bt e;

    public bn(bt btVar, NADRARosterItem nADRARosterItem, bt.bpa bpaVar) {
        this.e = btVar;
        this.c = nADRARosterItem;
        this.d = bpaVar;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int color;
        int i = 2 % 2;
        int i2 = a + 81;
        b = i2 % 128;
        int i3 = i2 % 2;
        this.c.set_isSelected(z);
        CardView cardView = this.d.v;
        int i4 = b;
        int i5 = i4 & 55;
        int i6 = -(-((i4 ^ 55) | i5));
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        a = i7 % 128;
        int i8 = i7 % 2;
        if (!this.c.get_isSelected()) {
            Resources resources = this.e.g.getResources();
            int i9 = b;
            int i10 = (i9 & 43) + (i9 | 43);
            a = i10 % 128;
            int i11 = i10 % 2;
            color = resources.getColor(R.color.md_blue_grey_500);
            int i12 = a;
            int i13 = i12 & 117;
            int i14 = i13 + ((i12 ^ 117) | i13);
            b = i14 % 128;
            int i15 = i14 % 2;
        } else {
            int i16 = b;
            int i17 = (i16 & 123) + (i16 | 123);
            a = i17 % 128;
            int i18 = i17 % 2;
            int i19 = (i16 ^ 29) + ((i16 & 29) << 1);
            a = i19 % 128;
            int i20 = i19 % 2;
            color = -16711681;
        }
        cardView.setCardBackgroundColor(color);
        int i21 = a;
        int i22 = (i21 ^ 95) + ((i21 & 95) << 1);
        b = i22 % 128;
        int i23 = i22 % 2;
    }
}
