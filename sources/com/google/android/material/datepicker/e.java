package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import ivas.gov.bisp.enumeration.F.L;
import ivas.gov.bisp.enumeration.O.C0019p;
import ivas.gov.bisp.enumeration.O.t;
import ivas.gov.bisp.enumeration.Q.C0023o;
import ivas.gov.bisp.enumeration.Q.J;
import ivas.gov.bisp.enumeration.Q.O;
import ivas.gov.bisp.enumeration.Q.a;
import ivas.gov.bisp.enumeration.Q.l;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.Y.A;
import ivas.gov.bisp.enumeration.aK.S;
import ivas.gov.bisp.enumeration.o00000Oo.OooO0o;
import ivas.gov.bisp.enumeration.o00000Oo.Oooo000;
import ivas.gov.bisp.enumeration.o00000Oo.o00O0O;
import ivas.gov.bisp.enumeration.o00000Oo.o0OoOo0;
import ivas.gov.bisp.enumeration.p081d.T;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class e<S> extends L {
    public static final /* synthetic */ int a = 0;
    public j b;
    public int f;
    public OooO0o<S> h;
    public o00O0O<S> i;
    public OooO0OO<S> j;
    public int k;
    public CharSequence l;
    public int m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f35o;
    public CheckableImageButton p;
    public Button q;
    public C0019p r;
    public final LinkedHashSet<Oooo000<? super S>> c = new LinkedHashSet<>();
    public final LinkedHashSet<View.OnClickListener> d = new LinkedHashSet<>();
    public final LinkedHashSet<DialogInterface.OnCancelListener> e = new LinkedHashSet<>();
    public final LinkedHashSet<DialogInterface.OnDismissListener> g = new LinkedHashSet<>();

    public class aOa implements View.OnClickListener {
        public aOa() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator<Oooo000<? super S>> it = e.this.c.iterator();
            while (it.hasNext()) {
                ((a) it.next()).b(e.this.e().d());
            }
            e.this.dismiss();
        }
    }

    public class aOb implements View.OnClickListener {
        public aOb() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator<View.OnClickListener> it = e.this.d.iterator();
            while (it.hasNext()) {
                it.next().onClick(view);
            }
            e.this.dismiss();
        }
    }

    public class aOd extends o0OoOo0<S> {
        public aOd() {
        }

        public void c(S s) {
            e.this.g();
            e eVar = e.this;
            eVar.q.setEnabled(eVar.e().q());
        }
    }

    public static int b(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar calendarE = O.e();
        calendarE.set(5, 1);
        Calendar calendarC = O.c(calendarE);
        calendarC.get(2);
        calendarC.get(1);
        int maximum = calendarC.getMaximum(7);
        calendarC.getActualMaximum(5);
        calendarC.getTimeInMillis();
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum) + (dimensionPixelOffset * 2);
    }

    public static boolean c(Context context) {
        return d(context, android.R.attr.windowFullscreen);
    }

    public final OooO0o<S> e() {
        if (this.h == null) {
            this.h = (ivas.gov.bisp.enumeration.Q.r) getArguments().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.h;
    }

    public final void f() {
        C0023o c0023o;
        Context contextRequireContext = requireContext();
        int iF = this.f;
        if (iF == 0) {
            iF = e().f(contextRequireContext);
        }
        Parcelable parcelableE = e();
        j jVar = this.b;
        h hVar = new h();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", iF);
        bundle.putParcelable("GRID_SELECTOR_KEY", parcelableE);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", jVar);
        bundle.putParcelable("CURRENT_MONTH_KEY", jVar.f);
        hVar.setArguments(bundle);
        this.j = hVar;
        if (this.p.isChecked()) {
            OooO0o<S> oooO0oE = e();
            j jVar2 = this.b;
            c0023o = new C0023o();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", iF);
            bundle2.putParcelable("DATE_SELECTOR_KEY", oooO0oE);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", jVar2);
            c0023o.setArguments(bundle2);
        } else {
            c0023o = this.j;
        }
        this.i = c0023o;
        g();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(getChildFragmentManager());
        aVar.d(R.id.mtrl_calendar_frame, this.i, null, 2);
        if (aVar.h) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        aVar.p.F(aVar, false);
        this.i.c(new aOd());
    }

    public final void g() {
        String strA = e().a(getContext());
        this.f35o.setContentDescription(String.format(getString(R.string.mtrl_picker_announce_current_selection), strA));
        this.f35o.setText(strA);
    }

    public final void h(CheckableImageButton checkableImageButton) {
        this.p.setContentDescription(this.p.isChecked() ? checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
    }

    @Override // ivas.gov.bisp.enumeration.F.L, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // ivas.gov.bisp.enumeration.F.L, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.h = (ivas.gov.bisp.enumeration.Q.r) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.b = (j) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.k = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.l = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.m = bundle.getInt("INPUT_MODE_KEY");
    }

    @Override // ivas.gov.bisp.enumeration.F.L
    public final Dialog onCreateDialog(Bundle bundle) {
        Context contextRequireContext = requireContext();
        Context contextRequireContext2 = requireContext();
        int iF = this.f;
        if (iF == 0) {
            iF = e().f(contextRequireContext2);
        }
        Dialog dialog = new Dialog(contextRequireContext, iF);
        Context context = dialog.getContext();
        this.n = c(context);
        int iD = ivas.gov.bisp.enumeration.aL.c.d(context, R.attr.colorSurface, e.class.getCanonicalName());
        C0019p c0019p = new C0019p(t.e(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar).e());
        this.r = c0019p;
        c0019p.e.e = new S(context);
        c0019p.w();
        this.r.u(ColorStateList.valueOf(iD));
        C0019p c0019p2 = this.r;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
        c0019p2.s(T.aXb.b(decorView));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.n ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        if (this.n) {
            viewInflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(b(context), -2));
        } else {
            viewInflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(b(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(R.id.mtrl_picker_header_selection_text);
        this.f35o = textView;
        WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
        T.aXa.f(textView, 1);
        this.p = (CheckableImageButton) viewInflate.findViewById(R.id.mtrl_picker_header_toggle);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.mtrl_picker_title_text);
        CharSequence charSequence = this.l;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.k);
        }
        this.p.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.p;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, A.c(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], A.c(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.p.setChecked(this.m != 0);
        T.q(this.p, null);
        h(this.p);
        this.p.setOnClickListener(new l(this));
        this.q = (Button) viewInflate.findViewById(R.id.confirm_button);
        if (e().q()) {
            this.q.setEnabled(true);
        } else {
            this.q.setEnabled(false);
        }
        this.q.setTag("CONFIRM_BUTTON_TAG");
        this.q.setOnClickListener(new aOa());
        Button button = (Button) viewInflate.findViewById(R.id.cancel_button);
        button.setTag("CANCEL_BUTTON_TAG");
        button.setOnClickListener(new aOb());
        return viewInflate;
    }

    @Override // ivas.gov.bisp.enumeration.F.L, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.g.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // ivas.gov.bisp.enumeration.F.L, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.h);
        j.aOg aog = new j.aOg(this.b);
        J j = this.j.f;
        if (j != null) {
            aog.e = Long.valueOf(j.i);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", aog.f);
        J jD = J.d(aog.c);
        J jD2 = J.d(aog.d);
        j.aOh aoh = (j.aOh) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l = aog.e;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new j(jD, jD2, aoh, l == null ? null : J.d(l.longValue()), null));
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.k);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.l);
    }

    @Override // ivas.gov.bisp.enumeration.F.L, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.n) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.r);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.r, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new ivas.gov.bisp.enumeration.aJ.c(requireDialog(), rect));
        }
        f();
    }

    @Override // ivas.gov.bisp.enumeration.F.L, androidx.fragment.app.Fragment
    public final void onStop() {
        this.i.c.clear();
        super.onStop();
    }

    public static boolean d(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(ivas.gov.bisp.enumeration.aL.c.d(context, R.attr.materialCalendarStyle, h.class.getCanonicalName()), new int[]{i});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z;
    }
}
