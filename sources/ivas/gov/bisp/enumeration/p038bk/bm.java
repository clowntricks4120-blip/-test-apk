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
public class bm extends RecyclerView.OooO<boR> {
    private static int d = 1;
    private static int e;
    public final List<NADRARosterItem> f;
    public final Activity g;

    public class boR extends RecyclerView.o0O0O00 {
        public TextView u;
        public CardView v;
        public CheckBox w;
        public TextView x;
        public TextView y;
        public TextView z;

        public boR(bm bmVar, View view) {
            super(view);
            this.v = (CardView) view.findViewById(R.id.cv_parent);
            this.w = (CheckBox) view.findViewById(R.id.cb_select);
            this.x = (TextView) view.findViewById(R.id.tv_nadra_status);
            this.u = (TextView) view.findViewById(R.id.tv_cnic);
            this.z = (TextView) view.findViewById(R.id.tv_name);
            this.y = (TextView) view.findViewById(R.id.tv_relationship);
        }
    }

    public bm(Activity activity, List<NADRARosterItem> list) {
        this.g = activity;
        this.f = list;
        new ArrayList().addAll(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public int b() {
        int i = 2 % 2;
        int i2 = e;
        int i3 = i2 ^ 103;
        int i4 = (i2 & 103) << 1;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        d = i5 % 128;
        int i6 = i5 % 2;
        int size = this.f.size();
        int i7 = e;
        int i8 = (i7 & (-102)) | ((~i7) & 101);
        int i9 = (i7 & 101) << 1;
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        d = i10 % 128;
        if (i10 % 2 != 0) {
            return size;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public RecyclerView.o0O0O00 f(ViewGroup viewGroup, int i) {
        int i2 = 2 % 2;
        boR bor = new boR(this, j.d(viewGroup, R.layout.layout_nadra_roster_list_item, viewGroup, false));
        int i3 = d + 20;
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        e = i4 % 128;
        int i5 = i4 % 2;
        return bor;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0086  */
    /* JADX WARN: Code duplicated, block: B:15:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:16:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:18:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:20:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:21:0x00f1  */
    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public void g(RecyclerView.o0O0O00 o0o0o00, @SuppressLint({"RecyclerView"}) int i) {
        NADRARosterItem nADRARosterItem;
        String citizen_number;
        TextView textView;
        int i2;
        int i3;
        TextView textView2;
        int i4 = 2 % 2;
        int i5 = e;
        int i6 = i5 & 99;
        int i7 = i6 + ((i5 ^ 99) | i6);
        d = i7 % 128;
        int i8 = i7 % 2;
        boR bor = (boR) o0o0o00;
        NADRARosterItem nADRARosterItem2 = this.f.get(i);
        int i9 = e;
        int i10 = (-2) - ((((i9 | 96) << 1) - (i9 ^ 96)) ^ (-1));
        d = i10 % 128;
        if (i10 % 2 == 0) {
            nADRARosterItem = nADRARosterItem2;
            citizen_number = nADRARosterItem.getCitizen_number();
            int i11 = 87 / 0;
        } else {
            nADRARosterItem = nADRARosterItem2;
            citizen_number = nADRARosterItem.getCitizen_number();
        }
        String name = nADRARosterItem.getName();
        String relation = nADRARosterItem.getRelation();
        int i12 = d;
        int i13 = i12 & 63;
        int i14 = (i12 ^ 63) | i13;
        int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
        e = i15 % 128;
        int i16 = i15 % 2;
        String card_status = nADRARosterItem.getCard_status();
        CheckBox checkBox = bor.w;
        int i17 = d;
        int i18 = (i17 ^ 45) + ((i17 & 45) << 1);
        e = i18 % 128;
        Object obj = null;
        if (i18 % 2 != 0) {
            checkBox.setVisibility(111);
            if (!card_status.equals("verified")) {
                bor.x.setText("Not Verified");
                textView = bor.x;
                int i19 = d;
                i2 = (((i19 | 88) << 1) - (i19 ^ 88)) - 1;
                e = i2 % 128;
                if (i2 % 2 == 0) {
                    this.g.getResources().getColor(R.color.red_cnic);
                    obj.hashCode();
                    throw null;
                }
                int color = this.g.getResources().getColor(R.color.red_cnic);
                int i20 = e + 1;
                d = i20 % 128;
                int i21 = i20 % 2;
                textView.setTextColor(color);
                int i22 = e;
                int i23 = i22 ^ 105;
                int i24 = ((i22 & 105) | i23) << 1;
                int i25 = -i23;
                int i26 = (i24 ^ i25) + ((i24 & i25) << 1);
                d = i26 % 128;
                int i27 = i26 % 2;
            } else {
                i3 = d + 107;
                e = i3 % 128;
                if (i3 % 2 != 0) {
                    bor.x.setText("Verified");
                    textView2 = bor.x;
                    int i28 = 76 / 0;
                } else {
                    bor.x.setText("Verified");
                    textView2 = bor.x;
                }
                int color2 = this.g.getResources().getColor(R.color.green);
                int i29 = e;
                int i30 = i29 & 119;
                int i31 = (i29 | 119) & (~i30);
                int i32 = -(-(i30 << 1));
                int i33 = ((i31 | i32) << 1) - (i31 ^ i32);
                d = i33 % 128;
                int i34 = i33 % 2;
                textView2.setTextColor(color2);
                int i35 = d;
                int i36 = i35 & 105;
                int i37 = ((((i35 ^ 105) | i36) << 1) - (~(-((i35 | 105) & (~i36))))) - 1;
                e = i37 % 128;
                int i38 = i37 % 2;
            }
        } else {
            checkBox.setVisibility(8);
            if (!card_status.equals("verified")) {
                bor.x.setText("Not Verified");
                textView = bor.x;
                int i110 = d;
                i2 = (((i110 | 88) << 1) - (i110 ^ 88)) - 1;
                e = i2 % 128;
                if (i2 % 2 == 0) {
                    this.g.getResources().getColor(R.color.red_cnic);
                    obj.hashCode();
                    throw null;
                }
                int color3 = this.g.getResources().getColor(R.color.red_cnic);
                int i210 = e + 1;
                d = i210 % 128;
                int i211 = i210 % 2;
                textView.setTextColor(color3);
                int i212 = e;
                int i213 = i212 ^ 105;
                int i214 = ((i212 & 105) | i213) << 1;
                int i215 = -i213;
                int i216 = (i214 ^ i215) + ((i214 & i215) << 1);
                d = i216 % 128;
                int i217 = i216 % 2;
            } else {
                i3 = d + 107;
                e = i3 % 128;
                if (i3 % 2 != 0) {
                    bor.x.setText("Verified");
                    textView2 = bor.x;
                    int i218 = 76 / 0;
                } else {
                    bor.x.setText("Verified");
                    textView2 = bor.x;
                }
                int color4 = this.g.getResources().getColor(R.color.green);
                int i219 = e;
                int i39 = i219 & 119;
                int i310 = (i219 | 119) & (~i39);
                int i311 = -(-(i39 << 1));
                int i312 = ((i310 | i311) << 1) - (i310 ^ i311);
                d = i312 % 128;
                int i313 = i312 % 2;
                textView2.setTextColor(color4);
                int i314 = d;
                int i315 = i314 & 105;
                int i316 = ((((i314 ^ 105) | i315) << 1) - (~(-((i314 | 105) & (~i315))))) - 1;
                e = i316 % 128;
                int i317 = i316 % 2;
            }
        }
        TextView textView3 = bor.u;
        int length = citizen_number.length();
        int i40 = d;
        int i41 = i40 & 101;
        int i42 = (i41 - (~((i40 ^ 101) | i41))) - 1;
        e = i42 % 128;
        int i43 = i42 % 2;
        int iJ = j.j(citizen_number, 4, length);
        String strSubstring = citizen_number.substring(0, iJ);
        StringBuilder sb = new StringBuilder();
        int i44 = d + 39;
        e = i44 % 128;
        if (i44 % 2 != 0) {
            j.B(sb, strSubstring.replaceAll("[A-Za-z0-9]", "X"), citizen_number, iJ, textView3);
            obj.hashCode();
            throw null;
        }
        j.B(sb, strSubstring.replaceAll("[A-Za-z0-9]", "X"), citizen_number, iJ, textView3);
        int i45 = d;
        int i46 = ((i45 ^ 45) | (i45 & 45)) << 1;
        int i47 = -(((~i45) & 45) | (i45 & (-46)));
        int i48 = (i46 & i47) + (i47 | i46);
        e = i48 % 128;
        int i49 = i48 % 2;
        bor.z.setText(name);
        bor.y.setText(relation);
        CardView cardView = bor.v;
        bl blVar = new bl(this, name, citizen_number, relation);
        int i50 = d;
        int i51 = ((i50 ^ 111) - (~((i50 & 111) << 1))) - 1;
        e = i51 % 128;
        if (i51 % 2 != 0) {
            cardView.setOnClickListener(blVar);
            obj.hashCode();
            throw null;
        }
        cardView.setOnClickListener(blVar);
        int i52 = d;
        int i53 = (i52 & 107) + (i52 | 107);
        e = i53 % 128;
        int i54 = i53 % 2;
    }
}
