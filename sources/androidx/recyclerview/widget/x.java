package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class x implements C0012b.aML {
    public final /* synthetic */ RecyclerView a;

    public x(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public View b(int i) {
        return this.a.getChildAt(i);
    }

    public int c() {
        return this.a.getChildCount();
    }

    public void d(int i) {
        View childAt = this.a.getChildAt(i);
        if (childAt != null) {
            this.a.u(childAt);
            childAt.clearAnimation();
        }
        this.a.removeViewAt(i);
    }
}
