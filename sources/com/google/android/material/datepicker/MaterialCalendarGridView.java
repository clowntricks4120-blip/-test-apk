package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import ivas.gov.bisp.enumeration.Oooo0o0.o0ooOOo;
import ivas.gov.bisp.enumeration.P.J;
import ivas.gov.bisp.enumeration.Q.O;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.o00000Oo.OooO0o;
import ivas.gov.bisp.enumeration.p081d.T;
import java.util.Calendar;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {
    public final Calendar a;
    public final boolean b;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.a = O.g();
        if (e.c(getContext())) {
            setNextFocusLeftId(R.id.cancel_button);
            setNextFocusRightId(R.id.confirm_button);
        }
        this.b = e.d(getContext(), R.attr.nestedScrollable);
        T.q(this, new r(this));
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final i getAdapter() {
        return (i) super.getAdapter();
    }

    public final View c(int i) {
        return getChildAt(i - getFirstVisiblePosition());
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int iC;
        int width;
        int iC2;
        int width2;
        int width3;
        int i;
        int right;
        int right2;
        this = this;
        super.onDraw(canvas);
        i adapter = getAdapter();
        OooO0o<?> oooO0o = adapter.c;
        ivas.gov.bisp.enumeration.Q.h hVar = adapter.f;
        int iMax = Math.max(adapter.d(), getFirstVisiblePosition());
        int iMin = Math.min(adapter.f(), getLastVisiblePosition());
        Long item = adapter.getItem(iMax);
        Long item2 = adapter.getItem(iMin);
        Iterator<o0ooOOo<Long, Long>> it = oooO0o.i().iterator();
        while (it.hasNext()) {
            ivas.gov.bisp.enumeration.p010aj.T next = it.next();
            F f = next.c;
            if (f != 0 && next.d != 0) {
                long jLongValue = ((Long) f).longValue();
                long jLongValue2 = ((Long) next.d).longValue();
                Long lValueOf = Long.valueOf(jLongValue);
                Long lValueOf2 = Long.valueOf(jLongValue2);
                if (item == null || item2 == null || lValueOf == null || lValueOf2 == null || lValueOf.longValue() > item2.longValue() || lValueOf2.longValue() < item.longValue()) {
                    iMax = iMax;
                    iMin = iMin;
                    it = it;
                    adapter = adapter;
                } else {
                    boolean zC = J.c(this);
                    if (jLongValue < item.longValue()) {
                        if (iMax % adapter.b.h == 0) {
                            right2 = 0;
                        } else {
                            right2 = !zC ? this.c(iMax - 1).getRight() : this.c(iMax - 1).getLeft();
                        }
                        width = right2;
                        iC = iMax;
                    } else {
                        this.a.setTimeInMillis(jLongValue);
                        iC = adapter.c(this.a.get(5));
                        View viewC = this.c(iC);
                        width = (viewC.getWidth() / 2) + viewC.getLeft();
                    }
                    if (jLongValue2 > item2.longValue()) {
                        if ((iMin + 1) % adapter.b.h == 0) {
                            right = getWidth();
                        } else {
                            right = !zC ? this.c(iMin).getRight() : this.c(iMin).getLeft();
                        }
                        width2 = right;
                        iC2 = iMin;
                    } else {
                        this.a.setTimeInMillis(jLongValue2);
                        iC2 = adapter.c(this.a.get(5));
                        View viewC2 = this.c(iC2);
                        width2 = (viewC2.getWidth() / 2) + viewC2.getLeft();
                    }
                    int itemId = (int) adapter.getItemId(iC);
                    int i2 = iMax;
                    int i3 = iMin;
                    int itemId2 = (int) adapter.getItemId(iC2);
                    while (itemId <= itemId2) {
                        int numColumns = getNumColumns() * itemId;
                        int numColumns2 = (getNumColumns() + numColumns) - 1;
                        View viewC3 = this.c(numColumns);
                        int top = viewC3.getTop();
                        int i4 = hVar.a.c.top;
                        int bottom = viewC3.getBottom();
                        i iVar = adapter;
                        int i5 = hVar.a.c.bottom;
                        if (zC) {
                            int i6 = iC2 > numColumns2 ? 0 : width2;
                            width3 = numColumns > iC ? getWidth() : width;
                            i = i6;
                        } else {
                            i = numColumns > iC ? 0 : width;
                            width3 = iC2 > numColumns2 ? getWidth() : width2;
                        }
                        canvas.drawRect(i, top + i4, width3, bottom - i5, hVar.h);
                        itemId++;
                        this = this;
                        it = it;
                        adapter = iVar;
                    }
                    iMax = i2;
                    iMin = i3;
                }
            }
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        if (!z) {
            super.onFocusChanged(false, i, rect);
            return;
        }
        if (i == 33) {
            setSelection(getAdapter().f());
        } else if (i == 130) {
            setSelection(getAdapter().d());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().d()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(getAdapter().d());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.b) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.AdapterView
    public final /* bridge */ /* synthetic */ void setAdapter(Adapter adapter) {
        setAdapter((ListAdapter) adapter);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        if (i < getAdapter().d()) {
            super.setSelection(getAdapter().d());
        } else {
            super.setSelection(i);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof i)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), i.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}
