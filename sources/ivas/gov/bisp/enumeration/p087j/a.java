package ivas.gov.bisp.enumeration.p087j;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import ivas.gov.bisp.enumeration.OooOOoo.OooOO0;
import ivas.gov.bisp.enumeration.p001aa.i;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    private static int a = 0;
    private static int b = 1;
    public static final OooOO0<WeakReference<a>> c = new i();
    public static final Object d;

    static {
        Object obj = new Object();
        int i = b;
        int i2 = (-2) - ((i + 54) ^ (-1));
        a = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        d = obj;
        if (i3 != 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = ((i ^ 121) - (~((i & 121) << 1))) - 1;
        a = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static void c(a aVar) {
        synchronized (d) {
            Iterator it = c.iterator();
            while (it.hasNext()) {
                a aVar2 = (a) ((WeakReference) it.next()).get();
                if (aVar2 == aVar || aVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    public abstract void d();

    public abstract void e(View view, ViewGroup.LayoutParams layoutParams);

    public Context f(Context context) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 | 5) << 1;
        int i4 = -(i2 ^ 5);
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return context;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int g() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 91) | (i2 & 91)) << 1;
        int i4 = -(((~i2) & 91) | (i2 & (-92)));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        int i6 = i5 % 128;
        a = i6;
        int i7 = i5 % 2;
        int i8 = (i6 & 113) + (i6 | 113);
        b = i8 % 128;
        int i9 = i8 % 2;
        return -100;
    }

    public abstract <T extends View> T h(int i);

    public abstract MenuInflater i();

    public abstract z j();

    public abstract void k();

    public abstract void l(Configuration configuration);

    public abstract void m(Bundle bundle);

    public abstract void n(Bundle bundle);

    public abstract void o();

    public abstract void p();

    public abstract void q(Bundle bundle);

    public abstract void r();

    public abstract void s();

    public abstract void t(Toolbar toolbar);

    public abstract void u(int i);

    public abstract boolean v(int i);

    public abstract void w(View view);

    public abstract void x(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void y(CharSequence charSequence);

    public void z(int i) {
        int i2 = 2 % 2;
        int i3 = b + 17;
        a = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }
}
