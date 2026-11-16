package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import ivas.gov.bisp.enumeration.Q.x;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class p implements AdapterView.OnItemClickListener {
    public final /* synthetic */ MaterialCalendarGridView a;
    public final /* synthetic */ z b;

    public p(z zVar, MaterialCalendarGridView materialCalendarGridView) {
        this.b = zVar;
        this.a = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        i adapter = this.a.getAdapter();
        if (i < adapter.d() || i > adapter.f()) {
            return;
        }
        h.aOq aoq = this.b.g;
        long jLongValue = this.a.getAdapter().getItem(i).longValue();
        h.aOr aor = (h.aOr) aoq;
        if (h.this.g.d.p(jLongValue)) {
            h.this.e.j(jLongValue);
            Iterator it = h.this.c.iterator();
            while (it.hasNext()) {
                ((x) it.next()).c(h.this.e.d());
            }
            h.this.j.getAdapter().a.c();
            RecyclerView recyclerView = h.this.b;
            if (recyclerView != null) {
                recyclerView.getAdapter().a.c();
            }
        }
    }
}
