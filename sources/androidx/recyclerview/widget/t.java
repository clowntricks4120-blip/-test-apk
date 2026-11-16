package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class t extends g {
    public t(RecyclerView.Oooo000 oooo000) {
        super(oooo000, null);
    }

    @Override // androidx.recyclerview.widget.g
    public int c() {
        return this.a.n;
    }

    @Override // androidx.recyclerview.widget.g
    public int d(View view) {
        return this.a.C(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.Oooo0) view.getLayoutParams())).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.g
    public int e(View view) {
        RecyclerView.Oooo0 oooo0 = (RecyclerView.Oooo0) view.getLayoutParams();
        return this.a.F(view) + ((ViewGroup.MarginLayoutParams) oooo0).topMargin + ((ViewGroup.MarginLayoutParams) oooo0).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.g
    public int f(View view) {
        RecyclerView.Oooo0 oooo0 = (RecyclerView.Oooo0) view.getLayoutParams();
        return this.a.G(view) + ((ViewGroup.MarginLayoutParams) oooo0).leftMargin + ((ViewGroup.MarginLayoutParams) oooo0).rightMargin;
    }

    @Override // androidx.recyclerview.widget.g
    public int g() {
        return this.a.f26o;
    }

    @Override // androidx.recyclerview.widget.g
    public int h(View view) {
        return this.a.K(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.Oooo0) view.getLayoutParams())).topMargin;
    }

    @Override // androidx.recyclerview.widget.g
    public int i() {
        RecyclerView.Oooo000 oooo000 = this.a;
        return oooo000.f26o - oooo000.O();
    }

    @Override // androidx.recyclerview.widget.g
    public int j() {
        return this.a.O();
    }

    @Override // androidx.recyclerview.widget.g
    public int k() {
        return this.a.l;
    }

    @Override // androidx.recyclerview.widget.g
    public int l() {
        return this.a.H();
    }

    @Override // androidx.recyclerview.widget.g
    public int m() {
        RecyclerView.Oooo000 oooo000 = this.a;
        return (oooo000.f26o - oooo000.H()) - this.a.O();
    }

    @Override // androidx.recyclerview.widget.g
    public int n(View view) {
        this.a.S(view, true, this.c);
        return this.c.bottom;
    }

    @Override // androidx.recyclerview.widget.g
    public int p(View view) {
        this.a.S(view, true, this.c);
        return this.c.top;
    }

    @Override // androidx.recyclerview.widget.g
    public void q(int i) {
        this.a.Y(i);
    }
}
