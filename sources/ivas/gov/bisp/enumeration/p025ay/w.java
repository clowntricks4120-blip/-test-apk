package ivas.gov.bisp.enumeration.p025ay;

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
public class w extends RecyclerView.OooO<bqO> {
    private static int d = 0;
    private static int e = 1;
    public final Activity f;
    public final List<RosterItem> g;
    public ArrayList<Item> h;
    public ArrayList<Item> i;
    public String j;
    public String k;

    public class bqO extends RecyclerView.o0O0O00 {
        public ImageView A;
        public ImageView B;
        public TextView u;
        public CardView v;
        public TextView w;
        public TextView x;
        public TextView y;
        public TextView z;

        public bqO(w wVar, View view) {
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

    public w(Activity activity, List<RosterItem> list) {
        this.f = activity;
        this.g = list;
        new ArrayList().addAll(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public int b() {
        int i = 2 % 2;
        int i2 = e;
        int i3 = (i2 ^ 65) + ((i2 & 65) << 1);
        d = i3 % 128;
        if (i3 % 2 == 0) {
            return this.g.size();
        }
        this.g.size();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public RecyclerView.o0O0O00 f(ViewGroup viewGroup, int i) {
        int i2 = 2 % 2;
        bqO bqo = new bqO(this, j.d(viewGroup, R.layout.layout_roster_list_item, viewGroup, false));
        int i3 = d;
        int i4 = i3 & 23;
        int i5 = (i3 | 23) & (~i4);
        int i6 = i4 << 1;
        int i7 = (i5 & i6) + (i5 | i6);
        e = i7 % 128;
        int i8 = i7 % 2;
        return bqo;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public void g(RecyclerView.o0O0O00 o0o0o00, @SuppressLint({"RecyclerView"}) int i) {
        CardView cardView;
        int i2 = 2 % 2;
        int i3 = e + 47;
        d = i3 % 128;
        int i4 = i3 % 2;
        bqO bqo = (bqO) o0o0o00;
        RosterItem rosterItem = this.g.get(i);
        String cnic = rosterItem.getCnic();
        String hhMemberNames = rosterItem.getHhMemberNames();
        String gender = rosterItem.getGender();
        rosterItem.getForm_no();
        int maritalStatusCode = rosterItem.getMaritalStatusCode();
        int relationToHouseholdHead = rosterItem.getRelationToHouseholdHead();
        String discrepancy_status = rosterItem.getDiscrepancy_status();
        StringBuilder sb = new StringBuilder();
        sb.append(rosterItem.getMessage());
        String string = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(rosterItem.getRoster_message());
        String string2 = sb2.toString();
        Activity activity = this.f;
        new au(activity, "relation_to_household_head", activity.getResources().getString(R.string.relation_to_head), new ak(this, relationToHouseholdHead, bqo)).execute(new Void[0]);
        Activity activity2 = this.f;
        au auVar = new au(activity2, "marital_status", activity2.getResources().getString(R.string.marital_status), new ap(this, maritalStatusCode, bqo));
        int i5 = d;
        int i6 = ((i5 & 126) + (i5 | 126)) - 1;
        e = i6 % 128;
        int i7 = i6 % 2;
        auVar.execute(new Void[0]);
        TextView textView = bqo.w;
        int iJ = j.j(cnic, 4, cnic.length());
        j.B(new StringBuilder(), cnic.substring(0, iJ).replaceAll("[A-Za-z0-9]", "X"), cnic, iJ, textView);
        bqo.x.setText(hhMemberNames);
        bqo.u.setText(gender);
        int i8 = e;
        int i9 = (i8 & 89) + (i8 | 89);
        d = i9 % 128;
        int i10 = i9 % 2;
        bqo.z.setText(this.k);
        bqo.y.setText(this.j);
        int i11 = 8;
        bqo.B.setVisibility(8);
        if (string.contains("Discrepancy")) {
            int i12 = d;
            int i13 = (i12 & (-98)) | ((~i12) & 97);
            int i14 = -(-((i12 & 97) << 1));
            int i15 = (i13 & i14) + (i14 | i13);
            e = i15 % 128;
            if (i15 % 2 == 0) {
                string2.contains("Discrepancy");
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (!string2.contains("Discrepancy")) {
                bqo.v.setVisibility(8);
                int i16 = e;
                int i17 = ((i16 | 97) << 1) - (i16 ^ 97);
                d = i17 % 128;
                int i18 = i17 % 2;
            } else {
                int i19 = (-2) - ((d + 66) ^ (-1));
                e = i19 % 128;
                int i20 = i19 % 2;
                if (discrepancy_status.equals(BuildConfig.FLAVOR)) {
                    int i21 = e;
                    int i22 = (((i21 | 58) << 1) - (i21 ^ 58)) - 1;
                    d = i22 % 128;
                    if (i22 % 2 != 0) {
                        cardView = bqo.v;
                        i11 = 68;
                    } else {
                        cardView = bqo.v;
                    }
                    cardView.setVisibility(i11);
                    int i23 = d;
                    int i24 = (((i23 ^ 113) | (i23 & 113)) << 1) - (((~i23) & 113) | (i23 & (-114)));
                    e = i24 % 128;
                    int i25 = i24 % 2;
                } else {
                    bqo.v.setVisibility(0);
                    int i26 = d;
                    int i27 = (i26 ^ 101) + ((i26 & 101) << 1);
                    e = i27 % 128;
                    int i28 = i27 % 2;
                }
            }
        } else {
            bqo.v.setVisibility(0);
            int i29 = (-2) - ((d + 108) ^ (-1));
            e = i29 % 128;
            if (i29 % 2 == 0) {
                int i30 = 4 % 2;
            }
        }
        bqo.A.setVisibility(0);
        ImageView imageView = bqo.A;
        k kVar = new k(this, rosterItem, i);
        int i31 = e;
        int i32 = (i31 & (-120)) | ((~i31) & 119);
        int i33 = -(-((i31 & 119) << 1));
        int i34 = ((i32 | i33) << 1) - (i33 ^ i32);
        d = i34 % 128;
        int i35 = i34 % 2;
        imageView.setOnClickListener(kVar);
        int i36 = d;
        int i37 = (i36 & (-106)) | ((~i36) & 105);
        int i38 = -(-((i36 & 105) << 1));
        int i39 = (i37 ^ i38) + ((i38 & i37) << 1);
        e = i39 % 128;
        int i40 = i39 % 2;
    }
}
