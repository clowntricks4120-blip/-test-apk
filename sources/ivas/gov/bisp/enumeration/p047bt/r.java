package ivas.gov.bisp.enumeration.p047bt;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.bK.au;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import ivas.gov.bisp.enumeration.models.RosterItem;
import ivas.gov.bisp.enumeration.p091n.j;
import java.util.ArrayList;
import java.util.List;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class r extends RecyclerView.OooO<brG> {
    private static int d = 0;
    private static int e = 1;
    public final Activity f;
    public final List<RosterItem> g;
    public ArrayList<Item> h;
    public ArrayList<Item> i;
    public String j;
    public String k;

    public class brG extends RecyclerView.o0O0O00 {
        public ImageView A;
        public ImageView B;
        public TextView u;
        public CardView v;
        public TextView w;
        public TextView x;
        public TextView y;
        public TextView z;

        public brG(r rVar, View view) {
            super(view);
            this.v = (CardView) view.findViewById(R.id.cv_parent);
            this.w = (TextView) view.findViewById(R.id.tv_cnic);
            this.x = (TextView) view.findViewById(R.id.tv_name);
            this.u = (TextView) view.findViewById(R.id.tv_gender);
            this.B = (ImageView) view.findViewById(R.id.iv_delete);
            this.A = (ImageView) view.findViewById(R.id.iv_edit);
            this.z = (TextView) view.findViewById(R.id.tv_marital_status);
            this.y = (TextView) view.findViewById(R.id.tv_relationship);
        }
    }

    public r(Activity activity, List<RosterItem> list) {
        this.f = activity;
        this.g = list;
        new ArrayList().addAll(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public int b() {
        int i = 2 % 2;
        int i2 = e;
        int i3 = i2 & 33;
        int i4 = i2 | 33;
        int i5 = (i3 & i4) + (i4 | i3);
        d = i5 % 128;
        int i6 = i5 % 2;
        int size = this.g.size();
        if (i6 != 0) {
            int i7 = 93 / 0;
        }
        int i8 = e;
        int i9 = ((i8 & 22) + (i8 | 22)) - 1;
        d = i9 % 128;
        int i10 = i9 % 2;
        return size;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public RecyclerView.o0O0O00 f(ViewGroup viewGroup, int i) {
        int i2 = 2 % 2;
        brG brg = new brG(this, j.d(viewGroup, R.layout.layout_roster_list_item, viewGroup, false));
        int i3 = e;
        int i4 = (-2) - (((i3 ^ 44) + ((i3 & 44) << 1)) ^ (-1));
        d = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 83 / 0;
        }
        return brg;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0146  */
    /* JADX WARN: Code duplicated, block: B:16:0x014e  */
    /* JADX WARN: Code duplicated, block: B:17:0x017d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0192  */
    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public void g(RecyclerView.o0O0O00 o0o0o00, @SuppressLint({"RecyclerView"}) int i) {
        int i2 = 2 % 2;
        int i3 = d;
        int i4 = (-2) - (((i3 ^ 34) + ((i3 & 34) << 1)) ^ (-1));
        e = i4 % 128;
        if (i4 % 2 == 0) {
            RosterItem rosterItem = this.g.get(i);
            rosterItem.getCnic();
            rosterItem.getHhMemberNames();
            rosterItem.getGender();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        brG brg = (brG) o0o0o00;
        RosterItem rosterItem2 = this.g.get(i);
        String cnic = rosterItem2.getCnic();
        String hhMemberNames = rosterItem2.getHhMemberNames();
        String gender = rosterItem2.getGender();
        rosterItem2.getForm_no();
        int maritalStatusCode = rosterItem2.getMaritalStatusCode();
        int relationToHouseholdHead = rosterItem2.getRelationToHouseholdHead();
        String discrepancy_status = rosterItem2.getDiscrepancy_status();
        StringBuilder sb = new StringBuilder();
        sb.append(rosterItem2.getMessage());
        String string = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(rosterItem2.getRoster_message());
        String string2 = sb2.toString();
        Activity activity = this.f;
        new au(activity, "relation_to_household_head", activity.getResources().getString(R.string.relation_to_head), new j(this, relationToHouseholdHead, brg)).execute(new Void[0]);
        Activity activity2 = this.f;
        new au(activity2, "marital_status", activity2.getResources().getString(R.string.marital_status), new c(this, maritalStatusCode, brg)).execute(new Void[0]);
        TextView textView = brg.w;
        int iJ = j.j(cnic, 4, cnic.length());
        String strSubstring = cnic.substring(0, iJ);
        StringBuilder sb3 = new StringBuilder();
        int i5 = e;
        int i6 = ((i5 | 126) << 1) - (i5 ^ 126);
        int i7 = (i6 ^ (-1)) + (i6 << 1);
        d = i7 % 128;
        int i8 = i7 % 2;
        j.B(sb3, strSubstring.replaceAll("[A-Za-z0-9]", "X"), cnic, iJ, textView);
        brg.x.setText(hhMemberNames);
        brg.u.setText(gender);
        TextView textView2 = brg.z;
        String str = this.k;
        int i9 = e + 85;
        d = i9 % 128;
        int i10 = i9 % 2;
        textView2.setText(str);
        brg.y.setText(this.j);
        brg.B.setVisibility(8);
        if (!string.contains("Discrepancy")) {
            brg.v.setVisibility(0);
            int i11 = d;
            int i12 = i11 & 5;
            int i13 = (i11 | 5) & (~i12);
            int i14 = i12 << 1;
            int i15 = ((i13 | i14) << 1) - (i13 ^ i14);
            e = i15 % 128;
            int i16 = i15 % 2;
        } else {
            int i17 = e;
            int i18 = i17 & 71;
            int i19 = (i17 ^ 71) | i18;
            int i20 = (i18 & i19) + (i19 | i18);
            d = i20 % 128;
            if (i20 % 2 != 0) {
                int i21 = 0 / 0;
                if (!string2.contains("Discrepancy")) {
                    brg.v.setVisibility(8);
                    int i22 = e;
                    int i23 = i22 & 7;
                    int i24 = ((i22 ^ 7) | i23) << 1;
                    int i25 = -((i22 | 7) & (~i23));
                    int i26 = (i24 & i25) + (i25 | i24);
                    d = i26 % 128;
                    int i27 = i26 % 2;
                } else if (discrepancy_status.equals(BuildConfig.FLAVOR)) {
                    int i28 = d;
                    int i29 = i28 & 121;
                    int i30 = (i28 | 121) & (~i29);
                    int i31 = i29 << 1;
                    int i32 = (i30 & i31) + (i30 | i31);
                    e = i32 % 128;
                    int i33 = i32 % 2;
                    brg.v.setVisibility(8);
                    int i34 = e;
                    int i35 = i34 | 121;
                    int i36 = i35 << 1;
                    int i37 = -((~(i34 & 121)) & i35);
                    int i38 = (i36 ^ i37) + ((i37 & i36) << 1);
                    d = i38 % 128;
                    int i39 = i38 % 2;
                } else {
                    brg.v.setVisibility(0);
                    int i40 = (-2) - ((d + 62) ^ (-1));
                    e = i40 % 128;
                    int i41 = i40 % 2;
                }
            } else if (!string2.contains("Discrepancy")) {
                brg.v.setVisibility(8);
                int i210 = e;
                int i211 = i210 & 7;
                int i212 = ((i210 ^ 7) | i211) << 1;
                int i213 = -((i210 | 7) & (~i211));
                int i214 = (i212 & i213) + (i213 | i212);
                d = i214 % 128;
                int i215 = i214 % 2;
            } else if (discrepancy_status.equals(BuildConfig.FLAVOR)) {
                int i216 = d;
                int i217 = i216 & 121;
                int i310 = (i216 | 121) & (~i217);
                int i311 = i217 << 1;
                int i312 = (i310 & i311) + (i310 | i311);
                e = i312 % 128;
                int i313 = i312 % 2;
                brg.v.setVisibility(8);
                int i314 = e;
                int i315 = i314 | 121;
                int i316 = i315 << 1;
                int i317 = -((~(i314 & 121)) & i315);
                int i318 = (i316 ^ i317) + ((i317 & i316) << 1);
                d = i318 % 128;
                int i319 = i318 % 2;
            } else {
                brg.v.setVisibility(0);
                int i42 = (-2) - ((d + 62) ^ (-1));
                e = i42 % 128;
                int i43 = i42 % 2;
            }
        }
        brg.A.setVisibility(0);
        brg.A.setOnClickListener(new h(this, rosterItem2));
        int i44 = e;
        int i45 = i44 ^ 105;
        int i46 = ((i44 & 105) | i45) << 1;
        int i47 = -i45;
        int i48 = (i46 ^ i47) + ((i46 & i47) << 1);
        d = i48 % 128;
        int i49 = i48 % 2;
    }
}
