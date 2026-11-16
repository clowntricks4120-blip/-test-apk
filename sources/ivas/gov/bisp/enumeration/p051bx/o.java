package ivas.gov.bisp.enumeration.p051bx;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.p026az.t;
import ivas.gov.bisp.enumeration.p086i.l;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class o<T extends t> extends ArrayAdapter<T> {
    private static int a = 0;
    private static int b = 1;
    public int c;
    public Context d;

    public o(Context context, int i, ArrayList<T> arrayList) {
        super(context, i, arrayList);
        this.c = -1;
        this.d = context;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 ^ 1) | (i3 & 1)) << 1;
        int i5 = -((i3 & (-2)) | ((~i3) & 1));
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        a = i6 % 128;
        int i7 = i6 % 2;
        if (view == null) {
            int i8 = i3 & 123;
            int i9 = (((i3 ^ 123) | i8) << 1) - ((i3 | 123) & (~i8));
            a = i9 % 128;
            int i10 = i9 % 2;
            LayoutInflater layoutInflater = (LayoutInflater) this.d.getSystemService("layout_inflater");
            int i11 = b;
            int i12 = i11 & 97;
            int i13 = (i11 | 97) & (~i12);
            int i14 = -(-(i12 << 1));
            int i15 = (i13 & i14) + (i13 | i14);
            a = i15 % 128;
            int i16 = i15 % 2;
            view = layoutInflater.inflate(R.layout.spinner_item, (ViewGroup) null);
            int i17 = a + 95;
            b = i17 % 128;
            int i18 = i17 % 2;
        }
        TextView textView = (TextView) view;
        T item = getItem(i);
        int i19 = b;
        int i20 = i19 & 19;
        int i21 = (i20 - (~(-(-((i19 ^ 19) | i20))))) - 1;
        a = i21 % 128;
        int i22 = i21 % 2;
        if (textView != null) {
            int i23 = ((i19 ^ 40) + ((i19 & 40) << 1)) - 1;
            a = i23 % 128;
            int i24 = i23 % 2;
            textView.setText(item.getDropDownViewLabel());
            int i25 = a + 67;
            b = i25 % 128;
            int i26 = i25 % 2;
        }
        if (i == 0) {
            int i27 = (-2) - ((a + 22) ^ (-1));
            b = i27 % 128;
            if (i27 % 2 == 0) {
                viewGroup.setBackgroundResource(R.drawable.spinner_bg);
                int i28 = 67 / 0;
            } else {
                viewGroup.setBackgroundResource(R.drawable.spinner_bg);
            }
            int i29 = a;
            int i30 = (-2) - (((i29 ^ 58) + ((i29 & 58) << 1)) ^ (-1));
            b = i30 % 128;
            int i31 = i30 % 2;
        } else {
            viewGroup.setBackgroundResource(R.drawable.spinner_bg_selected);
            int i32 = b + 98;
            int i33 = (i32 ^ (-1)) + (i32 << 1);
            a = i33 % 128;
            int i34 = i33 % 2;
        }
        int i35 = b;
        int i36 = i35 | 19;
        int i37 = i36 << 1;
        int i38 = -((~(i35 & 19)) & i36);
        int i39 = (i37 & i38) + (i38 | i37);
        a = i39 % 128;
        int i40 = i39 % 2;
        return view;
    }

    @Override // android.widget.ArrayAdapter
    public void setDropDownViewResource(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 ^ 25) + ((i3 & 25) << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        super.setDropDownViewResource(i);
        int i6 = a;
        int i7 = i6 & 1;
        int i8 = (i6 ^ 1) | i7;
        int i9 = (i7 & i8) + (i8 | i7);
        b = i9 % 128;
        int i10 = i9 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0044  */
    /* JADX WARN: Code duplicated, block: B:11:0x004c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater;
        int i2;
        TextView textView;
        T item;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = (-2) - (((i4 ^ 78) + ((i4 & 78) << 1)) ^ (-1));
        b = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            int i6 = 1 / 0;
            if (view == null) {
                layoutInflater = (LayoutInflater) this.d.getSystemService("layout_inflater");
                int i7 = b;
                int i8 = i7 & 25;
                i2 = ((((i7 ^ 25) | i8) << 1) - (~(-((i7 | 25) & (~i8))))) - 1;
                a = i2 % 128;
                if (i2 % 2 != 0) {
                    view = layoutInflater.inflate(R.layout.hightlight_spinner_item, (ViewGroup) null);
                    int i9 = 94 / 0;
                } else {
                    view = layoutInflater.inflate(R.layout.hightlight_spinner_item, (ViewGroup) null);
                }
                int i10 = b;
                int i11 = i10 & 13;
                int i12 = i11 + ((i10 ^ 13) | i11);
                a = i12 % 128;
                int i13 = i12 % 2;
            }
        } else if (view == null) {
            layoutInflater = (LayoutInflater) this.d.getSystemService("layout_inflater");
            int i14 = b;
            int i15 = i14 & 25;
            i2 = ((((i14 ^ 25) | i15) << 1) - (~(-((i14 | 25) & (~i15))))) - 1;
            a = i2 % 128;
            if (i2 % 2 != 0) {
                view = layoutInflater.inflate(R.layout.hightlight_spinner_item, (ViewGroup) null);
                int i16 = 94 / 0;
            } else {
                view = layoutInflater.inflate(R.layout.hightlight_spinner_item, (ViewGroup) null);
            }
            int i17 = b;
            int i18 = i17 & 13;
            int i19 = i18 + ((i17 ^ 13) | i18);
            a = i19 % 128;
            int i110 = i19 % 2;
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_selected);
        int i20 = b;
        int i21 = (i20 & 81) + (i20 | 81);
        a = i21 % 128;
        if (i21 % 2 != 0) {
            textView = (TextView) view.findViewById(R.id.tv_text);
            item = getItem(i);
            int i22 = 27 / 0;
        } else {
            textView = (TextView) view.findViewById(R.id.tv_text);
            item = getItem(i);
        }
        T t = item;
        if (textView != null) {
            int i23 = (-2) - ((b + 14) ^ (-1));
            a = i23 % 128;
            if (i23 % 2 != 0) {
                textView.setText(t.getDropDownViewLabel());
                int i24 = 37 / 0;
            } else {
                textView.setText(t.getDropDownViewLabel());
            }
            int i25 = b;
            int i26 = (i25 | 69) << 1;
            int i27 = -(((~i25) & 69) | (i25 & (-70)));
            int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
            a = i28 % 128;
            int i29 = i28 % 2;
        }
        if (i == 0) {
            int i30 = b;
            int i31 = (i30 & 19) + (i30 | 19);
            a = i31 % 128;
            if (i31 % 2 != 0) {
                imageView.setVisibility(83);
            } else {
                imageView.setVisibility(8);
            }
            Context context = this.d;
            Object obj2 = l.c;
            view.setBackgroundColor(l.aUI.b(context, R.color.md_blue_grey_500));
            int i32 = a;
            int i33 = (i32 ^ 9) + ((i32 & 9) << 1);
            b = i33 % 128;
            int i34 = i33 % 2;
            textView.setTextColor(l.aUI.b(this.d, R.color.white));
            int i35 = b + 19;
            a = i35 % 128;
            int i36 = i35 % 2;
        } else if (i == this.c) {
            int i37 = a;
            int i38 = i37 & 63;
            int i39 = (i37 | 63) & (~i38);
            int i40 = i38 << 1;
            int i41 = (i39 ^ i40) + ((i39 & i40) << 1);
            b = i41 % 128;
            if (i41 % 2 == 0) {
                imageView.setVisibility(1);
            } else {
                imageView.setVisibility(0);
            }
            Context context2 = this.d;
            Object obj3 = l.c;
            view.setBackgroundColor(l.aUI.b(context2, R.color.md_blue_grey_100));
            int i42 = a;
            int i43 = i42 & 77;
            int i44 = -(-(i42 | 77));
            int i45 = (i43 & i44) + (i44 | i43);
            b = i45 % 128;
            if (i45 % 2 == 0) {
                textView.setTextColor(l.aUI.b(this.d, R.color.black));
                obj.hashCode();
                throw null;
            }
            textView.setTextColor(l.aUI.b(this.d, R.color.black));
        } else {
            imageView.setVisibility(8);
            view.setBackgroundColor(0);
            int i46 = b;
            int i47 = i46 & 95;
            int i48 = ((((i46 ^ 95) | i47) << 1) - (~(-((i46 | 95) & (~i47))))) - 1;
            a = i48 % 128;
            if (i48 % 2 != 0) {
                Object obj4 = l.c;
                throw null;
            }
            Context context3 = this.d;
            Object obj5 = l.c;
            textView.setTextColor(l.aUI.b(context3, R.color.black));
            int i49 = a;
            int i50 = (((i49 | 32) << 1) - (i49 ^ 32)) - 1;
            b = i50 % 128;
            int i51 = i50 % 2;
        }
        int i52 = b + 75;
        a = i52 % 128;
        if (i52 % 2 == 0) {
            return view;
        }
        obj.hashCode();
        throw null;
    }
}
