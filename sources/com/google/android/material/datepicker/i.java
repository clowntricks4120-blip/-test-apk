package com.google.android.material.datepicker;

import android.content.Context;
import android.icu.text.DateFormat;
import android.icu.util.TimeZone;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import ivas.gov.bisp.enumeration.Q.C0022m;
import ivas.gov.bisp.enumeration.Q.J;
import ivas.gov.bisp.enumeration.Q.O;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.o00000Oo.OooO0o;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class i extends BaseAdapter {
    public static final int a = O.g().getMaximum(4);
    public final J b;
    public final OooO0o<?> c;
    public Collection<Long> d;
    public final j e;
    public ivas.gov.bisp.enumeration.Q.h f;

    public i(J j, OooO0o<?> oooO0o, j jVar) {
        this.b = j;
        this.c = oooO0o;
        this.e = jVar;
        this.d = oooO0o.z();
    }

    public int c(int i) {
        return d() + (i - 1);
    }

    public int d() {
        return this.b.f();
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Long getItem(int i) {
        if (i < this.b.f() || i > f()) {
            return null;
        }
        J j = this.b;
        int iF = j.f();
        Calendar calendarC = O.c(j.d);
        calendarC.set(5, (i - iF) + 1);
        return Long.valueOf(calendarC.getTimeInMillis());
    }

    public int f() {
        return (this.b.f() + this.b.g) - 1;
    }

    public final void g(MaterialCalendarGridView materialCalendarGridView, long j) {
        if (J.d(j).equals(this.b)) {
            Calendar calendarC = O.c(this.b.d);
            calendarC.setTimeInMillis(j);
            h((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().c(calendarC.get(5)) - materialCalendarGridView.getFirstVisiblePosition()), j);
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return d() + this.b.g;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i / this.b.h;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0100  */
    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        CharSequence charSequence;
        CharSequence charSequence2;
        Context context = viewGroup.getContext();
        if (this.f == null) {
            this.f = new ivas.gov.bisp.enumeration.Q.h(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) ivas.gov.bisp.enumeration.p091n.j.d(viewGroup, R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int iD = i - d();
        if (iD >= 0) {
            J j = this.b;
            if (iD < j.g) {
                int i2 = iD + 1;
                textView.setTag(j);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(i2)));
                Calendar calendarC = O.c(this.b.d);
                calendarC.set(5, i2);
                long timeInMillis = calendarC.getTimeInMillis();
                int i3 = this.b.f;
                Calendar calendarE = O.e();
                calendarE.set(5, 1);
                Calendar calendarC2 = O.c(calendarE);
                calendarC2.get(2);
                int i4 = calendarC2.get(1);
                calendarC2.getMaximum(7);
                calendarC2.getActualMaximum(5);
                calendarC2.getTimeInMillis();
                if (i3 == i4) {
                    Locale locale = Locale.getDefault();
                    if (Build.VERSION.SDK_INT >= 24) {
                        AtomicReference<C0022m> atomicReference = O.c;
                        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("MMMEd", locale);
                        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
                        charSequence2 = instanceForSkeleton.format(new Date(timeInMillis));
                    } else {
                        AtomicReference<C0022m> atomicReference2 = O.c;
                        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(0, locale);
                        dateInstance.setTimeZone(O.d());
                        charSequence2 = dateInstance.format(new Date(timeInMillis));
                    }
                    textView.setContentDescription(charSequence2);
                } else {
                    Locale locale2 = Locale.getDefault();
                    if (Build.VERSION.SDK_INT >= 24) {
                        AtomicReference<C0022m> atomicReference3 = O.c;
                        DateFormat instanceForSkeleton2 = DateFormat.getInstanceForSkeleton("yMMMEd", locale2);
                        instanceForSkeleton2.setTimeZone(TimeZone.getTimeZone("UTC"));
                        charSequence = instanceForSkeleton2.format(new Date(timeInMillis));
                    } else {
                        AtomicReference<C0022m> atomicReference4 = O.c;
                        java.text.DateFormat dateInstance2 = java.text.DateFormat.getDateInstance(0, locale2);
                        dateInstance2.setTimeZone(O.d());
                        charSequence = dateInstance2.format(new Date(timeInMillis));
                    }
                    textView.setContentDescription(charSequence);
                }
                textView.setVisibility(0);
                textView.setEnabled(true);
            } else {
                textView.setVisibility(8);
                textView.setEnabled(false);
            }
        } else {
            textView.setVisibility(8);
            textView.setEnabled(false);
        }
        Long item = getItem(i);
        if (item != null) {
            h(textView, item.longValue());
        }
        return textView;
    }

    public final void h(TextView textView, long j) {
        ivas.gov.bisp.enumeration.Q.c cVar;
        if (textView == null) {
            return;
        }
        if (this.e.d.p(j)) {
            textView.setEnabled(true);
            Iterator<Long> it = this.c.z().iterator();
            while (it.hasNext()) {
                if (O.b(j) == O.b(it.next().longValue())) {
                    cVar = this.f.b;
                }
            }
            cVar = O.e().getTimeInMillis() == j ? this.f.c : this.f.a;
        } else {
            textView.setEnabled(false);
            cVar = this.f.g;
        }
        cVar.d(textView);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }
}
