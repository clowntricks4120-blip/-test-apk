package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.p081d.T;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
class TimePickerView extends ConstraintLayout {
    public static final /* synthetic */ int p = 0;
    public final Chip q;
    public final Chip r;
    public final MaterialButtonToggleGroup s;
    public final View.OnClickListener t;

    public class OooO00o implements View.OnClickListener {
        public OooO00o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Objects.requireNonNull(TimePickerView.this);
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        OooO00o oooO00o = new OooO00o();
        this.t = oooO00o;
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle);
        this.s = materialButtonToggleGroup;
        materialButtonToggleGroup.g.add(new h(this));
        Chip chip = (Chip) findViewById(R.id.material_minute_tv);
        this.r = chip;
        Chip chip2 = (Chip) findViewById(R.id.material_hour_tv);
        this.q = chip2;
        WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
        T.aXa.f(chip, 2);
        T.aXa.f(chip2, 2);
        e eVar = new e(this, new GestureDetector(getContext(), new r(this)));
        chip.setOnTouchListener(eVar);
        chip2.setOnTouchListener(eVar);
        chip.setTag(R.id.selection_type, 12);
        chip2.setTag(R.id.selection_type, 10);
        chip.setOnClickListener(oooO00o);
        chip2.setOnClickListener(oooO00o);
    }

    public final void b() {
        if (this.s.getVisibility() == 0) {
            b bVar = new b();
            bVar.d(this);
            WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
            char c = T.aWY.f(this) == 0 ? (char) 2 : (char) 1;
            if (bVar.e.containsKey(Integer.valueOf(R.id.material_clock_display))) {
                b.aJN ajn = bVar.e.get(Integer.valueOf(R.id.material_clock_display));
                if (c != 1) {
                    b.aJO ajo = ajn.d;
                    ajo.l = -1;
                    ajo.k = -1;
                    ajo.F = -1;
                    ajo.O = -1;
                } else {
                    b.aJO ajo2 = ajn.d;
                    ajo2.b = -1;
                    ajo2.j = -1;
                    ajo2.E = -1;
                    ajo2.L = -1;
                }
            }
            bVar.c(this, true);
            setConstraintSet(null);
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        b();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            b();
        }
    }
}
