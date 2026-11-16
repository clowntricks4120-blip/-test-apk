package ivas.gov.bisp.enumeration.aA;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Typeface;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import androidx.appcompat.app.b;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.p002ab.C0084m;

/* JADX INFO: loaded from: classes.dex */
public class aR extends b.aIz {
    private static int c = 0;
    private static int d = 1;
    public TableLayout e;
    public final int f;
    public final int g;
    public int h;
    public Typeface i;
    public ScrollView j;
    public HorizontalScrollView k;
    public b l;

    public aR(Context context, String str) {
        super(context);
        this.i = C0084m.b(context, R.font.jameel_noori_nastaleeq);
        this.a.e = str;
        TableLayout tableLayout = new TableLayout(this.a.b);
        this.e = tableLayout;
        tableLayout.setBackgroundColor(Color.parseColor("#3ea8e9"));
        this.e.setGravity(17);
        this.e.setOrientation(1);
        this.e.setPadding(0, 0, 0, 0);
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(this.a.b);
        this.k = horizontalScrollView;
        horizontalScrollView.setScrollbarFadingEnabled(false);
        this.k.setPadding(0, 0, 0, 0);
        this.k.addView(this.e, new ViewGroup.LayoutParams(-1, -2));
        ScrollView scrollView = new ScrollView(this.a.b);
        this.j = scrollView;
        scrollView.setScrollbarFadingEnabled(false);
        this.j.setPadding(0, 0, 0, 0);
        this.j.addView(this.k, new ViewGroup.LayoutParams(-1, -1));
        Point point = new Point();
        ((Activity) context).getWindowManager().getDefaultDisplay().getSize(point);
        int i = point.x;
        this.f = i;
        this.g = point.y;
        this.h = (int) (((double) i) * 0.01d);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:24:0x00e2  */
    public void e(String str, String str2) {
        int i;
        int i2 = 2 % 2;
        TextView textView = new TextView(this.a.b);
        int i3 = d;
        int i4 = i3 ^ 113;
        int i5 = ((i3 & 113) | i4) << 1;
        int i6 = -i4;
        int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
        c = i7 % 128;
        if (i7 % 2 != 0) {
            textView.setGravity(28);
        } else {
            textView.setGravity(19);
        }
        textView.setTextColor(Color.parseColor("#555555"));
        Typeface typeface = this.i;
        int i8 = d;
        int i9 = (i8 ^ 63) + ((i8 & 63) << 1);
        c = i9 % 128;
        if (i9 % 2 != 0) {
            textView.setTypeface(typeface);
            textView.setTextSize(16.0f);
            textView.setPadding(this.h, 1, 1, 0);
        } else {
            textView.setTypeface(typeface);
            textView.setTextSize(16.0f);
            textView.setPadding(this.h, 0, 0, 0);
        }
        textView.setText(str);
        TextView textView2 = new TextView(this.a.b);
        int i10 = d;
        int i11 = (i10 & 69) + (i10 | 69);
        c = i11 % 128;
        textView2.setGravity(i11 % 2 != 0 ? 60 : 21);
        textView2.setTextColor(Color.parseColor("#000000"));
        Typeface typeface2 = this.i;
        int i12 = d;
        int i13 = i12 & 5;
        int i14 = -(-(i12 | 5));
        int i15 = (i13 & i14) + (i14 | i13);
        c = i15 % 128;
        int i16 = i15 % 2;
        textView2.setTypeface(typeface2);
        textView2.setTextSize(16.0f);
        textView2.setText(str2);
        int i17 = this.h;
        textView2.setPadding(i17, 0, i17, 0);
        textView2.setHint("Not Available");
        TableLayout.LayoutParams layoutParams = new TableLayout.LayoutParams(-1, -2);
        int i18 = d + 117;
        c = i18 % 128;
        if (i18 % 2 != 0) {
            layoutParams.setMargins(0, 1, 1, 1);
            if (this.e.getChildCount() > 0) {
                i = this.h;
                layoutParams.topMargin = i;
                if (i > 2) {
                    int i19 = c;
                    int i20 = (i19 | 95) << 1;
                    int i21 = -(((~i19) & 95) | (i19 & (-96)));
                    int i22 = (i20 & i21) + (i21 | i20);
                    d = i22 % 128;
                    int i23 = i22 % 2;
                    layoutParams.topMargin = 2;
                    int i24 = d;
                    int i25 = ((i24 ^ 37) | (i24 & 37)) << 1;
                    int i26 = -(((~i24) & 37) | (i24 & (-38)));
                    int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
                    c = i27 % 128;
                    int i28 = i27 % 2;
                }
            }
        } else {
            layoutParams.setMargins(0, 0, 0, 0);
            if (this.e.getChildCount() > 0) {
                i = this.h;
                layoutParams.topMargin = i;
                if (i > 2) {
                    int i110 = c;
                    int i29 = (i110 | 95) << 1;
                    int i210 = -(((~i110) & 95) | (i110 & (-96)));
                    int i211 = (i29 & i210) + (i210 | i29);
                    d = i211 % 128;
                    int i212 = i211 % 2;
                    layoutParams.topMargin = 2;
                    int i213 = d;
                    int i214 = ((i213 ^ 37) | (i213 & 37)) << 1;
                    int i215 = -(((~i213) & 37) | (i213 & (-38)));
                    int i216 = ((i214 | i215) << 1) - (i215 ^ i214);
                    c = i216 % 128;
                    int i217 = i216 % 2;
                }
            }
        }
        TableRow tableRow = new TableRow(this.a.b);
        int i30 = c + 35;
        d = i30 % 128;
        Object obj = null;
        if (i30 % 2 == 0) {
            tableRow.setBackgroundColor(-1);
            tableRow.addView(textView);
            obj.hashCode();
            throw null;
        }
        tableRow.setBackgroundColor(-1);
        tableRow.addView(textView);
        tableRow.addView(textView2);
        int i31 = this.h;
        int i32 = c;
        int i33 = (i32 & 27) + (i32 | 27);
        d = i33 % 128;
        if (i33 % 2 == 0) {
            tableRow.setPadding(i31, i31, i31, i31);
            throw null;
        }
        tableRow.setPadding(i31, i31, i31, i31);
        this.e.addView(tableRow, layoutParams);
        int i34 = c;
        int i35 = i34 & 1;
        int i36 = -(-((i34 ^ 1) | i35));
        int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
        d = i37 % 128;
        int i38 = i37 % 2;
    }
}
