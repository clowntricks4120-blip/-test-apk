package ivas.gov.bisp.enumeration.p099u;

import android.view.ActionMode;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: loaded from: classes.dex */
public class z implements Window.Callback {
    private static int a = 0;
    private static int b = 1;
    public final Window.Callback c;

    public z(Window.Callback callback) {
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.c = callback;
        int i = a;
        int i2 = (i & 21) + (i | 21);
        b = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((((i2 ^ 93) | (i2 & 93)) << 1) - (~(-(((~i2) & 93) | (i2 & (-94)))))) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        boolean zDispatchGenericMotionEvent = this.c.dispatchGenericMotionEvent(motionEvent);
        int i5 = b;
        int i6 = i5 & 79;
        int i7 = (i5 | 79) & (~i6);
        int i8 = -(-(i6 << 1));
        int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
        a = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 72 / 0;
        }
        return zDispatchGenericMotionEvent;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 15) << 1) - (i2 ^ 15);
        a = i3 % 128;
        int i4 = i3 % 2;
        boolean zDispatchPopulateAccessibilityEvent = this.c.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        int i5 = a;
        int i6 = i5 & 19;
        int i7 = -(-((i5 ^ 19) | i6));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        b = i8 % 128;
        int i9 = i8 % 2;
        return zDispatchPopulateAccessibilityEvent;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 77;
        int i4 = (i3 - (~(-(-((i2 ^ 77) | i3))))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        boolean zDispatchTouchEvent = this.c.dispatchTouchEvent(motionEvent);
        int i6 = a;
        int i7 = i6 & 79;
        int i8 = i7 + ((i6 ^ 79) | i7);
        b = i8 % 128;
        int i9 = i8 % 2;
        return zDispatchTouchEvent;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 23;
        int i4 = -(-((i2 ^ 23) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        boolean zDispatchTrackballEvent = this.c.dispatchTrackballEvent(motionEvent);
        int i7 = a;
        int i8 = (i7 & (-118)) | ((~i7) & 117);
        int i9 = -(-((i7 & 117) << 1));
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        b = i10 % 128;
        int i11 = i10 % 2;
        return zDispatchTrackballEvent;
    }

    @Override // android.view.Window.Callback
    public void onActionModeFinished(ActionMode actionMode) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 115;
        int i4 = (i2 ^ 115) | i3;
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        this.c.onActionModeFinished(actionMode);
        if (i6 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.view.Window.Callback
    public void onActionModeStarted(ActionMode actionMode) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 79) << 1) - (i2 ^ 79);
        a = i3 % 128;
        if (i3 % 2 != 0) {
            this.c.onActionModeStarted(actionMode);
            throw null;
        }
        this.c.onActionModeStarted(actionMode);
        int i4 = a;
        int i5 = i4 & 39;
        int i6 = (i4 ^ 39) | i5;
        int i7 = (i5 & i6) + (i6 | i5);
        b = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 10 / 0;
        }
    }

    @Override // android.view.Window.Callback
    public void onAttachedToWindow() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 89;
        int i4 = (i2 | 89) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        this.c.onAttachedToWindow();
        if (i7 == 0) {
            int i8 = 64 / 0;
        }
    }

    @Override // android.view.Window.Callback
    public void onDetachedFromWindow() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 89) + ((i2 & 89) << 1);
        b = i3 % 128;
        if (i3 % 2 == 0) {
            this.c.onDetachedFromWindow();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.c.onDetachedFromWindow();
        int i4 = a;
        int i5 = (i4 ^ 63) + ((i4 & 63) << 1);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 66 / 0;
        }
    }

    @Override // android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 | 118) << 1) - (i3 ^ 118);
        int i5 = (i4 ^ (-1)) + (i4 << 1);
        a = i5 % 128;
        if (i5 % 2 == 0) {
            return this.c.onMenuItemSelected(i, menuItem);
        }
        this.c.onMenuItemSelected(i, menuItem);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.view.Window.Callback
    public void onPointerCaptureChanged(boolean z) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 47) + (i2 | 47);
        a = i3 % 128;
        int i4 = i3 % 2;
        this.c.onPointerCaptureChanged(z);
        int i5 = b;
        int i6 = (((i5 | 120) << 1) - (i5 ^ 120)) - 1;
        a = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested(SearchEvent searchEvent) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 53;
        int i4 = ((i2 ^ 53) | i3) << 1;
        int i5 = -((i2 | 53) & (~i3));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        boolean zOnSearchRequested = this.c.onSearchRequested(searchEvent);
        int i8 = (-2) - ((a + 50) ^ (-1));
        b = i8 % 128;
        if (i8 % 2 != 0) {
            return zOnSearchRequested;
        }
        throw null;
    }

    @Override // android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 27;
        int i4 = ((i2 & 27) | i3) << 1;
        int i5 = -i3;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        b = i6 % 128;
        int i7 = i6 % 2;
        this.c.onWindowAttributesChanged(layoutParams);
        int i8 = b + 29;
        a = i8 % 128;
        if (i8 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 113;
        int i4 = (i3 - (~((i2 ^ 113) | i3))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        this.c.onWindowFocusChanged(z);
        int i6 = b;
        int i7 = (i6 & 13) + (i6 | 13);
        a = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 70 / 0;
        }
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 | 117;
        int i4 = (i3 << 1) - ((~(i2 & 117)) & i3);
        b = i4 % 128;
        int i5 = i4 % 2;
        boolean zOnSearchRequested = this.c.onSearchRequested();
        int i6 = b;
        int i7 = i6 & 125;
        int i8 = (i6 ^ 125) | i7;
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        a = i9 % 128;
        int i10 = i9 % 2;
        return zOnSearchRequested;
    }
}
