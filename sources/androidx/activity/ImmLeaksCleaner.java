package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.a;
import ivas.gov.bisp.enumeration.p027b.d;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
final class ImmLeaksCleaner implements a {
    public static int a;
    public static Field b;
    public static Field c;
    public static Field d;
    public Activity e;

    public ImmLeaksCleaner(Activity activity) {
        this.e = activity;
    }

    @Override // androidx.lifecycle.a
    public final void a(d dVar, androidx.lifecycle.d.aLZ alz) {
        if (alz != androidx.lifecycle.d.aLZ.ON_DESTROY) {
            return;
        }
        if (a == 0) {
            try {
                a = 2;
                Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                c = declaredField;
                declaredField.setAccessible(true);
                Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                d = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                b = declaredField3;
                declaredField3.setAccessible(true);
                a = 1;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (a == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.e.getSystemService("input_method");
            try {
                Object obj = b.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        View view = (View) c.get(inputMethodManager);
                        if (view == null) {
                            return;
                        }
                        if (view.isAttachedToWindow()) {
                            return;
                        }
                        try {
                            d.set(inputMethodManager, null);
                            inputMethodManager.isActive();
                        } catch (IllegalAccessException unused2) {
                        }
                    } catch (ClassCastException unused3) {
                    } catch (IllegalAccessException unused4) {
                    }
                }
            } catch (IllegalAccessException unused5) {
            }
        }
    }
}
