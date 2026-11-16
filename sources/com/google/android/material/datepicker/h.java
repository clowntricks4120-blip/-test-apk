package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Scroller;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.u;
import com.google.android.material.button.MaterialButton;
import ivas.gov.bisp.enumeration.M.al;
import ivas.gov.bisp.enumeration.Q.C0024p;
import ivas.gov.bisp.enumeration.Q.J;
import ivas.gov.bisp.enumeration.Q.N;
import ivas.gov.bisp.enumeration.Q.P;
import ivas.gov.bisp.enumeration.Q.T;
import ivas.gov.bisp.enumeration.Q.ViewOnClickListenerC0025t;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.o00000Oo.OooO0o;
import ivas.gov.bisp.enumeration.o00000Oo.o00O0O;
import ivas.gov.bisp.enumeration.o00000Oo.o0OoOo0;
import ivas.gov.bisp.enumeration.p081d.C0283j;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h<S> extends o00O0O<S> {
    public static final /* synthetic */ int a = 0;
    public RecyclerView b;
    public int d;
    public OooO0o<S> e;
    public J f;
    public j g;
    public int h;
    public ivas.gov.bisp.enumeration.Q.h i;
    public RecyclerView j;
    public View k;
    public View l;

    public class aOm implements Runnable {
        public final /* synthetic */ int a;

        public aOm(int i) {
            this.a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = h.this.j;
            int i = this.a;
            if (recyclerView.B) {
                return;
            }
            RecyclerView.Oooo000 oooo000 = recyclerView.f25o;
            if (oooo000 == null) {
                Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else {
                oooo000.ap(recyclerView, recyclerView.ai, i);
            }
        }
    }

    public class aOn extends C0283j {
        public aOn(h hVar) {
        }

        @Override // ivas.gov.bisp.enumeration.p081d.C0283j
        public void h(View view, al alVar) {
            this.d.onInitializeAccessibilityNodeInfo(view, alVar.d);
            alVar.e(null);
        }
    }

    public class aOp extends N {
        public final /* synthetic */ int E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public aOp(Context context, int i, boolean z, int i2) {
            super(context, i, z);
            this.E = i2;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void aP(RecyclerView.o0Oo0oo o0oo0oo, int[] iArr) {
            if (this.E == 0) {
                iArr[0] = h.this.j.getWidth();
                iArr[1] = h.this.j.getWidth();
            } else {
                iArr[0] = h.this.j.getHeight();
                iArr[1] = h.this.j.getHeight();
            }
        }
    }

    public interface aOq {
    }

    public class aOr implements aOq {
        public aOr() {
        }
    }

    public final boolean c(o0OoOo0<S> o0oooo0) {
        return this.c.add(o0oooo0);
    }

    public final LinearLayoutManager d() {
        return (LinearLayoutManager) this.j.getLayoutManager();
    }

    public final void e(int i) {
        this.j.post(new aOm(i));
    }

    public final void f(int i) {
        this.h = i;
        if (i == 2) {
            this.b.getLayoutManager().aB(((T) this.b.getAdapter()).h(this.f.f));
            this.k.setVisibility(0);
            this.l.setVisibility(8);
        } else if (i == 1) {
            this.k.setVisibility(8);
            this.l.setVisibility(0);
            g(this.f);
        }
    }

    public final void g(J j) {
        z zVar = (z) this.j.getAdapter();
        int iH = zVar.f.b.h(j);
        int i = iH - zVar.i(this.f);
        boolean z = Math.abs(i) > 3;
        boolean z2 = i > 0;
        this.f = j;
        if (z && z2) {
            this.j.ag(iH - 3);
        } else if (z) {
            this.j.ag(iH + 3);
        }
        e(iH);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.d = bundle.getInt("THEME_RES_ID_KEY");
        this.e = (ivas.gov.bisp.enumeration.Q.r) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.g = (j) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f = (J) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        u uVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.d);
        this.i = new ivas.gov.bisp.enumeration.Q.h(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        J j = this.g.b;
        if (e.c(contextThemeWrapper)) {
            i = R.layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = R.layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i, viewGroup, false);
        Resources resources = requireContext().getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_top_padding);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_bottom_padding);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_days_of_week_height);
        int i3 = i.a;
        viewInflate.setMinimumHeight(dimensionPixelOffset2 + dimensionPixelOffset + dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding) * (i3 - 1)) + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i3) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) viewInflate.findViewById(R.id.mtrl_calendar_days_of_week);
        ivas.gov.bisp.enumeration.p081d.T.q(gridView, new aOn(this));
        gridView.setAdapter((ListAdapter) new ivas.gov.bisp.enumeration.Q.e());
        gridView.setNumColumns(j.h);
        gridView.setEnabled(false);
        this.j = (RecyclerView) viewInflate.findViewById(R.id.mtrl_calendar_months);
        this.j.setLayoutManager(new aOp(getContext(), i2, false, i2));
        this.j.setTag("MONTHS_VIEW_GROUP_TAG");
        z zVar = new z(contextThemeWrapper, this.e, this.g, new aOr());
        this.j.setAdapter(zVar);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView3 = (RecyclerView) viewInflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.b = recyclerView3;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
            this.b.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.b.setAdapter(new T(this));
            this.b.n(new ivas.gov.bisp.enumeration.Q.i(this));
        }
        if (viewInflate.findViewById(R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            ivas.gov.bisp.enumeration.p081d.T.q(materialButton, new C0024p(this));
            MaterialButton materialButton2 = (MaterialButton) viewInflate.findViewById(R.id.month_navigation_previous);
            materialButton2.setTag("NAVIGATION_PREV_TAG");
            MaterialButton materialButton3 = (MaterialButton) viewInflate.findViewById(R.id.month_navigation_next);
            materialButton3.setTag("NAVIGATION_NEXT_TAG");
            this.k = viewInflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
            this.l = viewInflate.findViewById(R.id.mtrl_calendar_day_selector_frame);
            f(1);
            materialButton.setText(this.f.g(viewInflate.getContext()));
            this.j.o(new ivas.gov.bisp.enumeration.Q.z(this, zVar, materialButton));
            materialButton.setOnClickListener(new P(this));
            materialButton3.setOnClickListener(new ViewOnClickListenerC0025t(this, zVar));
            materialButton2.setOnClickListener(new ivas.gov.bisp.enumeration.Q.u(this, zVar));
        }
        if (!e.c(contextThemeWrapper) && (recyclerView2 = (uVar = new u()).a) != (recyclerView = this.j)) {
            if (recyclerView2 != null) {
                RecyclerView.o00O0O o00o0o = uVar.b;
                List<RecyclerView.o00O0O> list = recyclerView2.al;
                if (list != null) {
                    list.remove(o00o0o);
                }
                uVar.a.setOnFlingListener(null);
            }
            uVar.a = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getOnFlingListener() != null) {
                    throw new IllegalStateException("An instance of OnFlingListener already set.");
                }
                uVar.a.o(uVar.b);
                uVar.a.setOnFlingListener(uVar);
                new Scroller(uVar.a.getContext(), new DecelerateInterpolator());
                uVar.c();
            }
        }
        this.j.ag(zVar.i(this.f));
        return viewInflate;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.d);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.e);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.g);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f);
    }
}
