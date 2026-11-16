package com.google.android.material.timepicker;

import com.google.android.material.button.MaterialButtonToggleGroup;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class h implements MaterialButtonToggleGroup.OooO {
    public final /* synthetic */ TimePickerView a;

    public h(TimePickerView timePickerView) {
        this.a = timePickerView;
    }

    @Override // com.google.android.material.button.MaterialButtonToggleGroup.OooO
    public void b(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z) {
        Objects.requireNonNull(this.a);
    }
}
