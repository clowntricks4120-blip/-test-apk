package ivas.gov.bisp.enumeration.Q;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.OooO0OO;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.p091n.j;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class T extends RecyclerView.OooO<bet> {
    private static int d = 0;
    private static int e = 1;
    public final OooO0OO<?> f;

    public static class bet extends RecyclerView.o0O0O00 {
        public final TextView u;

        public bet(TextView textView) {
            super(textView);
            this.u = textView;
        }
    }

    public T(OooO0OO<?> oooO0OO) {
        this.f = oooO0OO;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public int b() {
        int i = 2 % 2;
        int i2 = e;
        int i3 = i2 & 23;
        int i4 = (i2 ^ 23) | i3;
        int i5 = (i3 & i4) + (i4 | i3);
        d = i5 % 128;
        int i6 = i5 % 2;
        int i7 = this.f.g.e;
        int i8 = e;
        int i9 = (i8 & (-86)) | ((~i8) & 85);
        int i10 = -(-((i8 & 85) << 1));
        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
        d = i11 % 128;
        if (i11 % 2 == 0) {
            return i7;
        }
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public RecyclerView.o0O0O00 f(ViewGroup viewGroup, int i) {
        int i2 = 2 % 2;
        bet betVar = new bet((TextView) j.d(viewGroup, R.layout.mtrl_calendar_year, viewGroup, false));
        int i3 = d;
        int i4 = i3 & 7;
        int i5 = (((i3 ^ 7) | i4) << 1) - ((i3 | 7) & (~i4));
        e = i5 % 128;
        int i6 = i5 % 2;
        return betVar;
    }

    public int h(int i) {
        J j;
        int i2 = 2 % 2;
        int i3 = (-2) - ((e + 56) ^ (-1));
        d = i3 % 128;
        if (i3 % 2 != 0) {
            j = this.f.g.b;
            int i4 = 20 / 0;
        } else {
            j = this.f.g.b;
        }
        int i5 = -j.f;
        int i6 = ((i | i5) << 1) - (i ^ i5);
        int i7 = e + 43;
        d = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 4 / 0;
        }
        return i6;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x01a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x013d A[SYNTHETIC] */
    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public void g(RecyclerView.o0O0O00 o0o0o00, int i) {
        TextView textView;
        Locale locale;
        Object[] objArr;
        TextView textView2;
        Object[] objArr2;
        c cVar;
        int i2;
        int i3 = 2 % 2;
        int i4 = d + 123;
        e = i4 % 128;
        int i5 = i4 % 2;
        bet betVar = (bet) o0o0o00;
        int i6 = this.f.g.b.f;
        int i7 = e;
        int i8 = (i7 | 75) << 1;
        int i9 = -(((~i7) & 75) | (i7 & (-76)));
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        d = i10 % 128;
        int i11 = i10 % 2;
        int i12 = (i6 - (~(-(-i)))) - 1;
        String string = betVar.u.getContext().getString(R.string.mtrl_picker_navigate_to_year_description);
        int i13 = e;
        int i14 = ((i13 ^ 56) + ((i13 & 56) << 1)) - 1;
        d = i14 % 128;
        if (i14 % 2 != 0) {
            textView = betVar.u;
            locale = Locale.getDefault();
            objArr = new Object[0];
        } else {
            textView = betVar.u;
            locale = Locale.getDefault();
            objArr = new Object[1];
        }
        int i15 = e;
        int i16 = (i15 & (-120)) | ((~i15) & 119);
        int i17 = -(-((i15 & 119) << 1));
        int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
        d = i18 % 128;
        int i19 = i18 % 2;
        objArr[0] = Integer.valueOf(i12);
        int i20 = d + 77;
        e = i20 % 128;
        if (i20 % 2 == 0) {
            textView.setText(String.format(locale, "%d", objArr));
            textView2 = betVar.u;
            objArr2 = new Object[0];
        } else {
            textView.setText(String.format(locale, "%d", objArr));
            textView2 = betVar.u;
            objArr2 = new Object[1];
        }
        int i21 = e;
        int i22 = ((i21 ^ 42) + ((i21 & 42) << 1)) - 1;
        d = i22 % 128;
        int i23 = i22 % 2;
        objArr2[0] = Integer.valueOf(i12);
        String str = String.format(string, objArr2);
        int i24 = d;
        int i25 = (i24 | 99) << 1;
        int i26 = -(((~i24) & 99) | (i24 & (-100)));
        int i27 = (i25 & i26) + (i26 | i25);
        e = i27 % 128;
        int i28 = i27 % 2;
        textView2.setContentDescription(str);
        h hVar = this.f.i;
        Calendar calendarE = O.e();
        int i29 = d;
        int i30 = i29 | 105;
        int i31 = i30 << 1;
        int i32 = -((~(i29 & 105)) & i30);
        int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
        e = i33 % 128;
        Object obj = null;
        if (i33 % 2 != 0 ? calendarE.get(1) != i12 : calendarE.get(0) != i12) {
            cVar = hVar.d;
            int i34 = e;
            int i35 = (i34 ^ 79) + ((i34 & 79) << 1);
            d = i35 % 128;
            int i36 = i35 % 2;
        } else {
            int i37 = e + 43;
            d = i37 % 128;
            if (i37 % 2 != 0) {
                c cVar2 = hVar.e;
                throw null;
            }
            cVar = hVar.e;
        }
        Collection<Long> collectionZ = this.f.e.z();
        int i38 = e;
        int i39 = i38 & 87;
        int i40 = i39 + ((i38 ^ 87) | i39);
        d = i40 % 128;
        if (i40 % 2 != 0) {
            collectionZ.iterator();
            obj.hashCode();
            throw null;
        }
        Iterator<Long> it = collectionZ.iterator();
        while (it.hasNext()) {
            int i41 = d;
            int i42 = (((i41 ^ 11) | (i41 & 11)) << 1) - (((~i41) & 11) | (i41 & (-12)));
            e = i42 % 128;
            if (i42 % 2 == 0) {
                it.next();
                obj.hashCode();
                throw null;
            }
            calendarE.setTimeInMillis(it.next().longValue());
            int i43 = calendarE.get(1);
            int i44 = d;
            int i45 = i44 & 47;
            int i46 = ((((i44 ^ 47) | i45) << 1) - (~(-((~i45) & (i44 | 47))))) - 1;
            e = i46 % 128;
            if (i46 % 2 == 0) {
                int i47 = 46 / 0;
                if (i43 == i12) {
                    int i48 = (i44 | 3) << 1;
                    int i49 = -((i44 & (-4)) | ((~i44) & 3));
                    int i50 = (i48 & i49) + (i48 | i49);
                    e = i50 % 128;
                    i2 = i50 % 2;
                    cVar = hVar.f;
                    if (i2 == 0) {
                        int i51 = 62 / 0;
                    }
                }
            } else if (i43 == i12) {
                int i410 = (i44 | 3) << 1;
                int i411 = -((i44 & (-4)) | ((~i44) & 3));
                int i52 = (i410 & i411) + (i410 | i411);
                e = i52 % 128;
                i2 = i52 % 2;
                cVar = hVar.f;
                if (i2 == 0) {
                    int i53 = 62 / 0;
                }
            }
        }
        cVar.d(betVar.u);
        TextView textView3 = betVar.u;
        Q q = new Q(this, i12);
        int i54 = e;
        int i55 = (((i54 & (-90)) | ((~i54) & 89)) - (~(-(-((i54 & 89) << 1))))) - 1;
        d = i55 % 128;
        if (i55 % 2 == 0) {
            textView3.setOnClickListener(q);
        } else {
            textView3.setOnClickListener(q);
            throw null;
        }
    }
}
