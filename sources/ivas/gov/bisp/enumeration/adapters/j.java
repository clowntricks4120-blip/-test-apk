package ivas.gov.bisp.enumeration.adapters;

import android.text.Editable;
import android.text.TextWatcher;
import ivas.gov.bisp.enumeration.models.Crop;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class j implements TextWatcher {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ AdapterAgriCrop.ViewHolder d;

    public j(AdapterAgriCrop.ViewHolder viewHolder, int i) {
        this.d = viewHolder;
        this.c = i;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 | 73) << 1;
        int i4 = -(((~i2) & 73) | (i2 & (-74)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = b + 9;
        a = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        Crop crop;
        String string;
        int i4 = 2 % 2;
        int i5 = b;
        int i6 = i5 & 97;
        int i7 = -(-((i5 ^ 97) | i6));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        a = i8 % 128;
        if (i8 % 2 == 0) {
            List<Crop> list = AdapterAgriCrop.this.f;
            throw null;
        }
        List<Crop> list2 = AdapterAgriCrop.this.f;
        int i9 = this.c;
        int i10 = b;
        int i11 = ((i10 & 50) + (i10 | 50)) - 1;
        a = i11 % 128;
        if (i11 % 2 == 0) {
            crop = list2.get(i9);
            string = charSequence.toString();
            int i12 = 62 / 0;
        } else {
            crop = list2.get(i9);
            string = charSequence.toString();
        }
        int i13 = a;
        int i14 = (i13 | 93) << 1;
        int i15 = -(i13 ^ 93);
        int i16 = (i14 & i15) + (i15 | i14);
        b = i16 % 128;
        int i17 = i16 % 2;
        crop.setLandMeasure(string);
        if (i17 != 0) {
            throw null;
        }
    }
}
