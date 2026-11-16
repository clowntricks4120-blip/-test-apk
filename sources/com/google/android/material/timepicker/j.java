package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public class j implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ClockFaceView a;

    public j(ClockFaceView clockFaceView) {
        this.a = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        if (!this.a.isShown()) {
            return true;
        }
        this.a.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = this.a.getHeight() / 2;
        ClockFaceView clockFaceView = this.a;
        int i = (height - clockFaceView.u.h) - clockFaceView.z;
        if (i != clockFaceView.r) {
            clockFaceView.r = i;
            clockFaceView.l();
            ClockHandView clockHandView = clockFaceView.u;
            clockHandView.f40o = clockFaceView.r;
            clockHandView.invalidate();
        }
        return true;
    }
}
