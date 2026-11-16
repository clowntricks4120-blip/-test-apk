package ivas.gov.bisp.enumeration.Q;

import android.annotation.SuppressLint;
import android.content.res.Configuration;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.p091n.j;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class e extends BaseAdapter {
    private static int a = 1;
    private static int b;
    public static final int c;
    public final Calendar d;
    public final int e;
    public final int f;

    static {
        int i;
        if (Build.VERSION.SDK_INT >= 26) {
            int i2 = a;
            int i3 = i2 & 89;
            int i4 = (i2 ^ 89) | i3;
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            int i6 = i5 % 128;
            b = i6;
            i = i5 % 2 != 0 ? 3 : 4;
            int i7 = (i6 & 119) + (i6 | 119);
            a = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
        } else {
            int i10 = a + 91;
            b = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 2 % 2;
            }
            i = 1;
        }
        c = i;
        int i12 = a;
        int i13 = ((i12 & 63) - (~(-(-(i12 | 63))))) - 1;
        b = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    public e() {
        Calendar calendarG = O.g();
        this.d = calendarG;
        this.e = calendarG.getMaximum(7);
        this.f = calendarG.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 ^ 45) | (i2 & 45)) << 1) - ((i2 & (-46)) | ((~i2) & 45));
        a = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.e;
        int i6 = ((i2 | 101) << 1) - (i2 ^ 101);
        a = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 | 95) << 1) - (i3 ^ 95);
        a = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 & 59;
        int i7 = ((((i3 ^ 59) | i6) << 1) - (~(-((i3 | 59) & (~i6))))) - 1;
        a = i7 % 128;
        int i8 = i7 % 2;
        return 0L;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        Integer numValueOf;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 + 117;
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        int i7 = this.e;
        Object obj = null;
        if (i >= i7) {
            int i8 = i3 & 25;
            int i9 = -(-(i3 | 25));
            int i10 = (i8 ^ i9) + ((i8 & i9) << 1);
            a = i10 % 128;
            int i11 = i10 % 2;
            int i12 = ((((i3 ^ 75) | (i3 & 75)) << 1) - (~(-(((~i3) & 75) | (i3 & (-76)))))) - 1;
            a = i12 % 128;
            int i13 = i12 % 2;
            numValueOf = null;
        } else {
            int i14 = this.f;
            int i15 = i & i14;
            int i16 = i15 + ((i ^ i14) | i15);
            if (i16 > i7) {
                int i17 = i5 & 71;
                int i18 = (i5 ^ 71) | i17;
                int i19 = (i17 & i18) + (i17 | i18);
                int i20 = i19 % 128;
                b = i20;
                int i21 = i19 % 2;
                int i22 = -i7;
                int i23 = i16 & i22;
                int i24 = (i22 ^ i16) | i23;
                i16 = (i23 & i24) + (i24 | i23);
                int i25 = ((i20 ^ 18) + ((i20 & 18) << 1)) - 1;
                a = i25 % 128;
                int i26 = i25 % 2;
            }
            numValueOf = Integer.valueOf(i16);
            int i27 = a;
            int i28 = ((i27 & 37) - (~(-(-(i27 | 37))))) - 1;
            b = i28 % 128;
            int i29 = i28 % 2;
        }
        int i30 = b;
        int i31 = i30 & 33;
        int i32 = i30 | 33;
        int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
        a = i33 % 128;
        if (i33 % 2 != 0) {
            return numValueOf;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"WrongConstant"})
    public View getView(int i, View view, ViewGroup viewGroup) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 ^ 21;
        int i5 = -(-((i3 & 21) << 1));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        int i7 = i6 % 128;
        a = i7;
        int i8 = i6 % 2;
        TextView textView = (TextView) view;
        if (view == null) {
            int i9 = ((i7 & (-20)) | ((~i7) & 19)) + ((i7 & 19) << 1);
            b = i9 % 128;
            int i10 = i9 % 2;
            textView = (TextView) j.d(viewGroup, R.layout.mtrl_calendar_day_of_week, viewGroup, false);
            int i11 = a + 77;
            b = i11 % 128;
            int i12 = i11 % 2;
        }
        Calendar calendar = this.d;
        int i13 = this.f;
        int i14 = i & i13;
        int i15 = (i14 - (~(-(-((i ^ i13) | i14))))) - 1;
        int i16 = b;
        int i17 = (i16 ^ 93) + ((i16 & 93) << 1);
        a = i17 % 128;
        Object obj = null;
        if (i17 % 2 == 0) {
            throw null;
        }
        int i18 = this.e;
        if (i15 > i18) {
            int i19 = i16 & 103;
            int i20 = (i19 - (~((i16 ^ 103) | i19))) - 1;
            a = i20 % 128;
            int i21 = i20 % 2;
            int i22 = -i18;
            i15 = (i15 ^ i22) + ((i22 & i15) << 1);
            int i23 = ((i16 ^ 16) + ((i16 & 16) << 1)) - 1;
            a = i23 % 128;
            int i24 = i23 % 2;
        }
        calendar.set(7, i15);
        Configuration configuration = textView.getResources().getConfiguration();
        int i25 = a;
        int i26 = i25 & 47;
        int i27 = -(-(i25 | 47));
        int i28 = (i26 & i27) + (i27 | i26);
        b = i28 % 128;
        int i29 = i28 % 2;
        Locale locale = configuration.locale;
        Calendar calendar2 = this.d;
        int i30 = c;
        int i31 = a;
        int i32 = i31 & 119;
        int i33 = (i32 - (~((i31 ^ 119) | i32))) - 1;
        b = i33 % 128;
        int i34 = i33 % 2;
        textView.setText(calendar2.getDisplayName(7, i30, locale));
        int i35 = a;
        int i36 = i35 & 115;
        int i37 = (i35 | 115) & (~i36);
        int i38 = i36 << 1;
        int i39 = ((i37 | i38) << 1) - (i37 ^ i38);
        b = i39 % 128;
        int i40 = i39 % 2;
        String string = viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header);
        int i41 = a;
        int i42 = i41 & 51;
        int i43 = (i41 ^ 51) | i42;
        int i44 = (i42 & i43) + (i42 | i43);
        b = i44 % 128;
        int i45 = i44 % 2;
        Calendar calendar3 = this.d;
        int i46 = ((i41 ^ 26) + ((i41 & 26) << 1)) - 1;
        b = i46 % 128;
        int i47 = i46 % 2;
        String str = String.format(string, calendar3.getDisplayName(7, 2, Locale.getDefault()));
        int i48 = b + 119;
        a = i48 % 128;
        int i49 = i48 % 2;
        textView.setContentDescription(str);
        int i50 = a;
        int i51 = (i50 & 65) + (i50 | 65);
        b = i51 % 128;
        if (i51 % 2 == 0) {
            return textView;
        }
        obj.hashCode();
        throw null;
    }
}
