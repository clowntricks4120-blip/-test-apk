package com.google.android.material.datepicker;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ivas.gov.bisp.enumeration.Q.J;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.o00000Oo.OooO0o;
import ivas.gov.bisp.enumeration.p081d.Q;
import ivas.gov.bisp.enumeration.p081d.T;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class z extends RecyclerView.OooO<aOw> {
    public final Context d;
    public final OooO0o<?> e;
    public final j f;
    public final h.aOq g;
    public final int h;

    public static class aOw extends RecyclerView.o0O0O00 {
        public final TextView u;
        public final MaterialCalendarGridView v;

        public aOw(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
            this.u = textView;
            WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
            new Q(R.id.tag_accessibility_heading, Boolean.class, 28).i(textView, Boolean.TRUE);
            this.v = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
            if (z) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    public z(Context context, OooO0o<?> oooO0o, j jVar, h.aOq aoq) {
        J j = jVar.b;
        J j2 = jVar.c;
        J j3 = jVar.f;
        if (j.e(j3) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (j3.e(j2) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        int i = i.a;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height);
        int dimensionPixelSize2 = e.c(context) ? context.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0;
        this.d = context;
        this.h = (i * dimensionPixelSize) + dimensionPixelSize2;
        this.f = jVar;
        this.e = oooO0o;
        this.g = aoq;
        if (this.a.b()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.b = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public int b() {
        return this.f.g;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public long c(int i) {
        return this.f.b.i(i).d.getTimeInMillis();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public RecyclerView.o0O0O00 f(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) ivas.gov.bisp.enumeration.p091n.j.d(viewGroup, R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!e.c(viewGroup.getContext())) {
            return new aOw(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.Oooo0(-1, this.h));
        return new aOw(linearLayout, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public void g(RecyclerView.o0O0O00 o0o0o00, int i) {
        aOw aow = (aOw) o0o0o00;
        J jI = this.f.b.i(i);
        aow.u.setText(jI.g(aow.c.getContext()));
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) aow.v.findViewById(R.id.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !jI.equals(materialCalendarGridView.getAdapter().b)) {
            i iVar = new i(jI, this.e, this.f);
            materialCalendarGridView.setNumColumns(jI.h);
            materialCalendarGridView.setAdapter((ListAdapter) iVar);
        } else {
            materialCalendarGridView.invalidate();
            i adapter = materialCalendarGridView.getAdapter();
            Iterator<Long> it = adapter.d.iterator();
            while (it.hasNext()) {
                adapter.g(materialCalendarGridView, it.next().longValue());
            }
            OooO0o<?> oooO0o = adapter.c;
            if (oooO0o != null) {
                Iterator<Long> it2 = oooO0o.z().iterator();
                while (it2.hasNext()) {
                    adapter.g(materialCalendarGridView, it2.next().longValue());
                }
                adapter.d = adapter.c.z();
            }
        }
        materialCalendarGridView.setOnItemClickListener(new p(this, materialCalendarGridView));
    }

    public J h(int i) {
        return this.f.b.i(i);
    }

    public int i(J j) {
        return this.f.b.h(j);
    }
}
