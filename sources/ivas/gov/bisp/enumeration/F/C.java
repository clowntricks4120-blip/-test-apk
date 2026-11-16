package ivas.gov.bisp.enumeration.F;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.h;
import ivas.gov.bisp.enumeration.O.r;

/* JADX INFO: loaded from: classes.dex */
public abstract class C<E> extends A {
    public final Activity a;
    public final Context b;
    public final Handler c;
    public final h d;

    public C(FragmentActivity fragmentActivity) {
        Handler handler = new Handler();
        this.d = new W();
        this.a = fragmentActivity;
        r.k(fragmentActivity, "context == null");
        this.b = fragmentActivity;
        this.c = handler;
    }

    public abstract boolean e(String str);

    public abstract E f();

    public abstract LayoutInflater g();

    public abstract boolean h(Fragment fragment);

    public abstract void i();
}
