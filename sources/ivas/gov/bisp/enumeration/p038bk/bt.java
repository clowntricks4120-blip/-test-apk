package ivas.gov.bisp.enumeration.p038bk;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.models.NADRARosterItem;
import ivas.gov.bisp.enumeration.p091n.j;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class bt extends RecyclerView.OooO<bpa> {
    private static int d = 1;
    private static int e;
    public final List<NADRARosterItem> f;
    public final Activity g;

    public class bpa extends RecyclerView.o0O0O00 {
        public TextView u;
        public CardView v;
        public CheckBox w;
        public TextView x;
        public TextView y;
        public TextView z;

        public bpa(bt btVar, View view) {
            super(view);
            this.v = (CardView) view.findViewById(R.id.cv_parent);
            this.w = (CheckBox) view.findViewById(R.id.cb_select);
            this.x = (TextView) view.findViewById(R.id.tv_nadra_status);
            this.u = (TextView) view.findViewById(R.id.tv_cnic);
            this.z = (TextView) view.findViewById(R.id.tv_name);
            this.y = (TextView) view.findViewById(R.id.tv_relationship);
        }
    }

    public bt(Activity activity, List<NADRARosterItem> list) {
        this.g = activity;
        this.f = list;
        new ArrayList().addAll(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public int b() {
        int i = 2 % 2;
        int i2 = e;
        int i3 = i2 ^ 107;
        int i4 = (i2 & 107) << 1;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        d = i5 % 128;
        if (i5 % 2 == 0) {
            this.f.size();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int size = this.f.size();
        int i6 = d;
        int i7 = (i6 & (-56)) | ((~i6) & 55);
        int i8 = (i6 & 55) << 1;
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        e = i9 % 128;
        int i10 = i9 % 2;
        return size;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public long c(int i) {
        int i2 = 2 % 2;
        int i3 = d;
        int i4 = (i3 ^ 55) + ((i3 & 55) << 1);
        e = i4 % 128;
        int i5 = i4 % 2;
        long j = i;
        int i6 = i3 & 3;
        int i7 = (i3 | 3) & (~i6);
        int i8 = -(-(i6 << 1));
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        e = i9 % 128;
        int i10 = i9 % 2;
        return j;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public int d(int i) {
        int i2 = 2 % 2;
        int i3 = d;
        int i4 = i3 & 53;
        int i5 = ((i3 ^ 53) | i4) << 1;
        int i6 = -((i3 | 53) & (~i4));
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        e = i7 % 128;
        if (i7 % 2 == 0) {
            return i;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public RecyclerView.o0O0O00 f(ViewGroup viewGroup, int i) {
        int i2 = 2 % 2;
        bpa bpaVar = new bpa(this, j.d(viewGroup, R.layout.layout_nadra_roster_list_item, viewGroup, false));
        int i3 = d + 121;
        e = i3 % 128;
        if (i3 % 2 == 0) {
            return bpaVar;
        }
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public void g(RecyclerView.o0O0O00 o0o0o00, @SuppressLint({"RecyclerView"}) int i) {
        bpa bpaVar;
        NADRARosterItem nADRARosterItem;
        int i2 = 2 % 2;
        int i3 = d;
        int i4 = (-2) - (((i3 & 54) + (i3 | 54)) ^ (-1));
        e = i4 % 128;
        if (i4 % 2 != 0) {
            bpaVar = (bpa) o0o0o00;
            nADRARosterItem = this.f.get(i);
            int i5 = 10 / 0;
        } else {
            bpaVar = (bpa) o0o0o00;
            nADRARosterItem = this.f.get(i);
        }
        NADRARosterItem nADRARosterItem2 = nADRARosterItem;
        String citizen_number = nADRARosterItem2.getCitizen_number();
        String name = nADRARosterItem2.getName();
        int i6 = e;
        int i7 = ((((i6 ^ 57) | (i6 & 57)) << 1) - (~(-(((~i6) & 57) | (i6 & (-58)))))) - 1;
        d = i7 % 128;
        Object obj = null;
        if (i7 % 2 == 0) {
            nADRARosterItem2.getRelation();
            nADRARosterItem2.getCard_status();
            obj.hashCode();
            throw null;
        }
        String relation = nADRARosterItem2.getRelation();
        if (nADRARosterItem2.getCard_status().equals("verified")) {
            int i8 = e;
            int i9 = (i8 & (-66)) | ((~i8) & 65);
            int i10 = (i8 & 65) << 1;
            int i11 = (i9 & i10) + (i10 | i9);
            d = i11 % 128;
            int i12 = i11 % 2;
            bpaVar.x.setText("Verified");
            TextView textView = bpaVar.x;
            int i13 = d;
            int i14 = ((i13 | 91) << 1) - (i13 ^ 91);
            e = i14 % 128;
            if (i14 % 2 != 0) {
                this.g.getResources().getColor(R.color.green);
                throw null;
            }
            textView.setTextColor(this.g.getResources().getColor(R.color.green));
            int i15 = e;
            int i16 = ((i15 ^ 53) - (~((i15 & 53) << 1))) - 1;
            d = i16 % 128;
            int i17 = i16 % 2;
        } else {
            bpaVar.x.setText("Not Verified");
            TextView textView2 = bpaVar.x;
            Activity activity = this.g;
            int i18 = e;
            int i19 = ((i18 & 20) + (i18 | 20)) - 1;
            d = i19 % 128;
            int i20 = i19 % 2;
            textView2.setTextColor(activity.getResources().getColor(R.color.red_cnic));
            int i21 = e + 1;
            d = i21 % 128;
            int i22 = i21 % 2;
        }
        TextView textView3 = bpaVar.u;
        int length = citizen_number.length();
        int i23 = e;
        int i24 = ((i23 ^ 7) | (i23 & 7)) << 1;
        int i25 = -(((~i23) & 7) | (i23 & (-8)));
        int i26 = (i24 & i25) + (i25 | i24);
        d = i26 % 128;
        int i27 = i26 % 2;
        int iJ = j.j(citizen_number, 4, length);
        String strSubstring = citizen_number.substring(0, iJ);
        StringBuilder sb = new StringBuilder();
        int i28 = d;
        int i29 = i28 & 47;
        int i30 = (i28 | 47) & (~i29);
        int i31 = -(-(i29 << 1));
        int i32 = ((i30 | i31) << 1) - (i30 ^ i31);
        e = i32 % 128;
        int i33 = i32 % 2;
        j.B(sb, strSubstring.replaceAll("[A-Za-z0-9]", "X"), citizen_number, iJ, textView3);
        TextView textView4 = bpaVar.z;
        int i34 = d;
        int i35 = (-2) - ((((i34 | 66) << 1) - (i34 ^ 66)) ^ (-1));
        e = i35 % 128;
        int i36 = i35 % 2;
        textView4.setText(name);
        bpaVar.y.setText(relation);
        CheckBox checkBox = bpaVar.w;
        bn bnVar = new bn(this, nADRARosterItem2, bpaVar);
        int i37 = e;
        int i38 = (i37 & (-104)) | ((~i37) & 103);
        int i39 = (i37 & 103) << 1;
        int i40 = ((i38 | i39) << 1) - (i39 ^ i38);
        d = i40 % 128;
        int i41 = i40 % 2;
        checkBox.setOnCheckedChangeListener(bnVar);
        int i42 = e;
        int i43 = (i42 & (-82)) | ((~i42) & 81);
        int i44 = (i42 & 81) << 1;
        int i45 = ((i43 | i44) << 1) - (i44 ^ i43);
        d = i45 % 128;
        int i46 = i45 % 2;
    }

    public ArrayList<NADRARosterItem> h() {
        int i = 2 % 2;
        ArrayList<NADRARosterItem> arrayList = new ArrayList<>();
        int size = this.f.size();
        int i2 = d;
        int i3 = ((((i2 ^ 29) | (i2 & 29)) << 1) - (~(-(((~i2) & 29) | (i2 & (-30)))))) - 1;
        int i4 = i3 % 128;
        e = i4;
        int i5 = i3 % 2;
        int i6 = ((i4 ^ 80) + ((i4 & 80) << 1)) - 1;
        d = i6 % 128;
        int i7 = i6 % 2;
        int i8 = 0;
        while (true) {
            Object obj = null;
            if (i8 >= size) {
                int i9 = d + 95;
                e = i9 % 128;
                if (i9 % 2 == 0) {
                    return arrayList;
                }
                obj.hashCode();
                throw null;
            }
            int i10 = d;
            int i11 = i10 & 83;
            int i12 = ((i10 ^ 83) | i11) << 1;
            int i13 = -((i10 | 83) & (~i11));
            int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
            e = i14 % 128;
            if (i14 % 2 != 0) {
                this.f.get(i8).get_isSelected();
                obj.hashCode();
                throw null;
            }
            if (this.f.get(i8).get_isSelected()) {
                int i15 = e;
                int i16 = (((i15 ^ 21) | (i15 & 21)) << 1) - (((~i15) & 21) | (i15 & (-22)));
                d = i16 % 128;
                int i17 = i16 % 2;
                arrayList.add(this.f.get(i8));
                int i18 = d;
                int i19 = i18 & 41;
                int i20 = (i19 - (~(-(-((i18 ^ 41) | i19))))) - 1;
                int i21 = i20 % 128;
                e = i21;
                int i22 = i20 % 2;
                int i23 = (((i21 ^ 65) | (i21 & 65)) << 1) - (((~i21) & 65) | (i21 & (-66)));
                d = i23 % 128;
                int i24 = i23 % 2;
            }
            i8 = ((i8 & 2) + (i8 | 2)) - 1;
            int i25 = e;
            int i26 = ((i25 ^ 11) | (i25 & 11)) << 1;
            int i27 = -(((~i25) & 11) | (i25 & (-12)));
            int i28 = (i26 & i27) + (i27 | i26);
            d = i28 % 128;
            int i29 = i28 % 2;
        }
    }
}
