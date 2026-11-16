package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class r extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ TimePickerView a;

    public r(TimePickerView timePickerView) {
        this.a = timePickerView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        Objects.requireNonNull(this.a);
        return false;
    }
}
