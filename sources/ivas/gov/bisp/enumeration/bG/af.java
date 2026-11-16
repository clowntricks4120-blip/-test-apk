package ivas.gov.bisp.enumeration.bG;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import ivas.gov.bisp.enumeration.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class af extends ArrayAdapter<B> {
    private static int a = 0;
    private static int b = 1;
    public Activity c;
    public ArrayList<B> d;
    public ArrayList<Integer> e;

    public af(Activity activity, int i, ArrayList<B> arrayList) {
        super(activity, i, arrayList);
        this.d = null;
        this.e = new ArrayList<>();
        this.c = activity;
        this.d = arrayList;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public int getCount() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 123) + (i2 | 123);
        b = i3 % 128;
        int i4 = i3 % 2;
        int count = super.getCount();
        int i5 = (-2) - ((a + 56) ^ (-1));
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return count;
        }
        throw null;
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 59;
        int i5 = i4 + ((i3 ^ 59) | i4);
        b = i5 % 128;
        int i6 = i5 % 2;
        View viewC = c(i, view, viewGroup);
        int i7 = b;
        int i8 = i7 & 85;
        int i9 = i8 + ((i7 ^ 85) | i8);
        a = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 11 / 0;
        }
        return viewC;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 69;
        int i5 = (i4 - (~((i3 ^ 69) | i4))) - 1;
        a = i5 % 128;
        if (i5 % 2 == 0) {
            return c(i, view, viewGroup);
        }
        c(i, view, viewGroup);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003a A[Catch: Exception -> 0x0115, TRY_ENTER, TryCatch #1 {Exception -> 0x0115, blocks: (B:13:0x0043, B:15:0x005a, B:18:0x0070, B:20:0x008b, B:23:0x00a2, B:25:0x00ae, B:27:0x00bc, B:30:0x00e3, B:33:0x00fe, B:34:0x0102, B:35:0x0106, B:36:0x0109, B:37:0x010c, B:40:0x010f, B:41:0x0112, B:8:0x0022, B:11:0x003a, B:12:0x003f), top: B:51:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:12:0x003f A[Catch: Exception -> 0x0115, TryCatch #1 {Exception -> 0x0115, blocks: (B:13:0x0043, B:15:0x005a, B:18:0x0070, B:20:0x008b, B:23:0x00a2, B:25:0x00ae, B:27:0x00bc, B:30:0x00e3, B:33:0x00fe, B:34:0x0102, B:35:0x0106, B:36:0x0109, B:37:0x010c, B:40:0x010f, B:41:0x0112, B:8:0x0022, B:11:0x003a, B:12:0x003f), top: B:51:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0124 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x0125  */
    /* JADX WARN: Code duplicated, block: B:51:0x0022 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final View c(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = i5 & 115;
        int i7 = (((i5 ^ 115) | i6) << 1) - ((i5 | 115) & (~i6));
        b = i7 % 128;
        Object obj = null;
        if (i7 % 2 != 0) {
            if (view == null) {
                layoutInflater = this.c.getLayoutInflater();
                int i8 = a;
                i2 = ((i8 | 67) << 1) - (i8 ^ 67);
                b = i2 % 128;
                if (i2 % 2 == 0) {
                    view = layoutInflater.inflate(R.layout.point_row, viewGroup, false);
                } else {
                    view = layoutInflater.inflate(R.layout.point_row, viewGroup, false);
                }
            }
            int i9 = a;
            i3 = ((i9 | 5) << 1) - (i9 ^ 5);
            b = i3 % 128;
            if (i3 % 2 != 0) {
                return view;
            }
            throw null;
        }
        int i10 = 50 / 0;
        if (view == null) {
            try {
                layoutInflater = this.c.getLayoutInflater();
                int i11 = a;
                i2 = ((i11 | 67) << 1) - (i11 ^ 67);
                b = i2 % 128;
                if (i2 % 2 == 0) {
                    view = layoutInflater.inflate(R.layout.point_row, viewGroup, false);
                } else {
                    view = layoutInflater.inflate(R.layout.point_row, viewGroup, false);
                }
            } catch (Exception unused) {
            }
        }
        int i12 = a;
        i3 = ((i12 | 5) << 1) - (i12 ^ 5);
        b = i3 % 128;
        if (i3 % 2 != 0) {
            return view;
        }
        throw null;
        B b2 = this.d.get(i);
        int i13 = a;
        int i14 = i13 ^ 103;
        int i15 = (i13 & 103) << 1;
        int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
        b = i16 % 128;
        int i17 = i16 % 2;
        String str = b2.e;
        int i18 = b;
        int i19 = i18 & 53;
        int i20 = i19 + ((i18 ^ 53) | i19);
        a = i20 % 128;
        if (i20 % 2 != 0) {
            view.findViewById(R.id.point_name);
            throw null;
        }
        View viewFindViewById = view.findViewById(R.id.point_name);
        int i21 = b;
        int i22 = (i21 & (-80)) | ((~i21) & 79);
        int i23 = -(-((i21 & 79) << 1));
        int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
        a = i24 % 128;
        int i25 = i24 % 2;
        TextView textView = (TextView) viewFindViewById;
        textView.setText(str);
        int i26 = a;
        int i27 = (-2) - (((i26 & 94) + (i26 | 94)) ^ (-1));
        b = i27 % 128;
        if (i27 % 2 == 0) {
            Integer.valueOf(i);
            obj.hashCode();
            throw null;
        }
        if (!this.e.contains(Integer.valueOf(i))) {
            textView.setTextColor(-16777216);
            int i28 = a + 19;
            b = i28 % 128;
            int i29 = i28 % 2;
            textView.setTypeface(null, 0);
            int i30 = a;
            int i31 = (i30 ^ 49) + ((i30 & 49) << 1);
            b = i31 % 128;
            int i32 = i31 % 2;
        } else {
            int i33 = b;
            int i34 = i33 | 125;
            int i35 = i34 << 1;
            int i36 = -((~(i33 & 125)) & i34);
            int i37 = (i35 & i36) + (i36 | i35);
            a = i37 % 128;
            int i38 = i37 % 2;
            textView.setTextColor(-65536);
            int i39 = a;
            int i40 = (i39 & (-8)) | ((~i39) & 7);
            int i41 = -(-((i39 & 7) << 1));
            int i42 = (i40 & i41) + (i41 | i40);
            b = i42 % 128;
            if (i42 % 2 == 0) {
                textView.setTypeface(null, 0);
            } else {
                textView.setTypeface(null, 1);
            }
        }
        int i110 = a;
        i3 = ((i110 | 5) << 1) - (i110 ^ 5);
        b = i3 % 128;
        if (i3 % 2 != 0) {
            return view;
        }
        throw null;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 43;
        int i5 = -(-(i3 | 43));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            this.e.contains(Integer.valueOf(i));
            throw null;
        }
        if (!this.e.contains(Integer.valueOf(i))) {
            boolean zIsEnabled = super.isEnabled(i);
            int i7 = (-2) - ((a + 106) ^ (-1));
            b = i7 % 128;
            int i8 = i7 % 2;
            return zIsEnabled;
        }
        int i9 = b;
        int i10 = i9 & 27;
        int i11 = (i10 - (~(-(-((i9 ^ 27) | i10))))) - 1;
        a = i11 % 128;
        int i12 = i11 % 2;
        return false;
    }

    public void d(int i, boolean z) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 & 47) + (i3 | 47);
        a = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (i != 0 && i != this.d.size() - 1) {
            int i5 = a;
            int i6 = ((i5 | 40) << 1) - (i5 ^ 40);
            int i7 = (i6 ^ (-1)) + (i6 << 1);
            b = i7 % 128;
            int i8 = i7 % 2;
            int size = this.d.size();
            int i9 = size & (-2);
            int i10 = ((size ^ (-2)) | i9) << 1;
            int i11 = -((size | (-2)) & (~i9));
            if (i != (i10 & i11) + (i11 | i10)) {
                int i12 = b;
                int i13 = i12 & 33;
                int i14 = (i13 - (~(-(-((i12 ^ 33) | i13))))) - 1;
                int i15 = i14 % 128;
                a = i15;
                if (i14 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                if (!z) {
                    int i16 = i15 + 93;
                    b = i16 % 128;
                    int i17 = i16 % 2;
                    ArrayList<Integer> arrayList = this.e;
                    if (i17 == 0) {
                        arrayList.contains(Integer.valueOf(i));
                        throw null;
                    }
                    if (!arrayList.contains(Integer.valueOf(i))) {
                        this.e.add(Integer.valueOf(i));
                        int i18 = b;
                        int i19 = i18 & 61;
                        int i20 = i19 + ((i18 ^ 61) | i19);
                        a = i20 % 128;
                        if (i20 % 2 != 0) {
                            throw null;
                        }
                        return;
                    }
                } else if (this.e.contains(Integer.valueOf(i))) {
                    int i21 = a;
                    int i22 = i21 & 23;
                    int i23 = (i21 ^ 23) | i22;
                    int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
                    b = i24 % 128;
                    if (i24 % 2 == 0) {
                        this.e.remove(Integer.valueOf(i));
                        throw null;
                    }
                    this.e.remove(Integer.valueOf(i));
                    int i25 = a;
                    int i26 = i25 & 111;
                    int i27 = (i25 ^ 111) | i26;
                    int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
                    b = i28 % 128;
                    int i29 = i28 % 2;
                }
            }
        }
        int i30 = b;
        int i31 = i30 & 13;
        int i32 = -(-((i30 ^ 13) | i31));
        int i33 = (i31 & i32) + (i32 | i31);
        a = i33 % 128;
        if (i33 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
