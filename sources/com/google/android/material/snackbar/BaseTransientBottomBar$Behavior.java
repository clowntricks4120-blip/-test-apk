package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import ivas.gov.bisp.enumeration.aN.r;
import ivas.gov.bisp.enumeration.o0000OO.OooO0OO;
import ivas.gov.bisp.enumeration.p006af.h;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {
    public final h h = new h(this);

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.OooO0OO
    public boolean j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        Objects.requireNonNull(this.h);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (r.a == null) {
                    r.a = new r();
                }
                synchronized (r.a.b) {
                }
            }
        } else if (coordinatorLayout.y(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (r.a == null) {
                r.a = new r();
            }
            synchronized (r.a.b) {
            }
        }
        return super.j(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public boolean u(View view) {
        Objects.requireNonNull(this.h);
        return view instanceof OooO0OO;
    }
}
