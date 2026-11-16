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
public class f extends RecyclerView.OooO<brv> {
    private static int d = 0;
    private static int e = 1;
    public final Activity f;
    public final List<RosterItem> g;
    public ArrayList<Item> h;
    public ArrayList<Item> i;
    public String j;
    public String k;

    public class brv extends RecyclerView.o0O0O00 {
        public ImageView A;
        public ImageView B;
        public TextView u;
        public CardView v;
        public TextView w;
        public TextView x;
        public TextView y;
        public TextView z;

        public brv(f fVar, View view) {
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

    public f(Activity activity, List<RosterItem> list) {
        this.f = activity;
        this.g = list;
        new ArrayList().addAll(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public int b() {
        int i = 2 % 2;
        int i2 = e;
        int i3 = (i2 & (-4)) | ((~i2) & 3);
        int i4 = -(-((i2 & 3) << 1));
        int i5 = (i3 & i4) + (i4 | i3);
        d = i5 % 128;
        int i6 = i5 % 2;
        int size = this.g.size();
        int i7 = d + 31;
        e = i7 % 128;
        int i8 = i7 % 2;
        return size;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public RecyclerView.o0O0O00 f(ViewGroup viewGroup, int i) {
        int i2 = 2 % 2;
        brv brvVar = new brv(this, j.d(viewGroup, R.layout.layout_roster_list_item, viewGroup, false));
        int i3 = e + 67;
        d = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 21 / 0;
        }
        return brvVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public void g(RecyclerView.o0O0O00 o0o0o00, @SuppressLint({"RecyclerView"}) int i) {
        TextView textView;
        int iJ;
        String strSubstring;
        int i2 = 2 % 2;
        int i3 = d;
        int i4 = ((i3 | 29) << 1) - (i3 ^ 29);
        e = i4 % 128;
        int i5 = i4 % 2;
        brv brvVar = (brv) o0o0o00;
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
        new au(activity, "relation_to_household_head", activity.getResources().getString(R.string.relation_to_head), new H(this, relationToHouseholdHead, brvVar)).execute(new Void[0]);
        Activity activity2 = this.f;
        au auVar = new au(activity2, "marital_status", activity2.getResources().getString(R.string.marital_status), new G(this, maritalStatusCode, brvVar));
        int i6 = d;
        int i7 = ((i6 | 11) << 1) - (i6 ^ 11);
        e = i7 % 128;
        if (i7 % 2 == 0) {
            auVar.execute(new Void[1]);
            textView = brvVar.w;
            iJ = j.j(cnic, 2, cnic.length());
            strSubstring = cnic.substring(1, iJ);
        } else {
            auVar.execute(new Void[0]);
            textView = brvVar.w;
            iJ = j.j(cnic, 4, cnic.length());
            strSubstring = cnic.substring(0, iJ);
        }
        j.B(new StringBuilder(), strSubstring.replaceAll("[A-Za-z0-9]", "X"), cnic, iJ, textView);
        brvVar.x.setText(hhMemberNames);
        brvVar.u.setText(gender);
        int i8 = d + 39;
        e = i8 % 128;
        int i9 = i8 % 2;
        brvVar.z.setText(this.k);
        brvVar.y.setText(this.j);
        brvVar.B.setVisibility(8);
        Object obj = null;
        if (string.contains("Discrepancy")) {
            int i10 = d;
            int i11 = ((i10 & 32) + (i10 | 32)) - 1;
            e = i11 % 128;
            if (i11 % 2 == 0) {
                string2.contains("Discrepancy");
                throw null;
            }
            if (string2.contains("Discrepancy")) {
                int i12 = e;
                int i13 = i12 ^ 3;
                int i14 = (i12 & 3) << 1;
                int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
                d = i15 % 128;
                if (i15 % 2 != 0) {
                    discrepancy_status.equals(BuildConfig.FLAVOR);
                    obj.hashCode();
                    throw null;
                }
                if (discrepancy_status.equals(BuildConfig.FLAVOR)) {
                    brvVar.v.setVisibility(8);
                    int i16 = e;
                    int i17 = ((i16 ^ 19) | (i16 & 19)) << 1;
                    int i18 = -(((~i16) & 19) | (i16 & (-20)));
                    int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
                    d = i19 % 128;
                    int i20 = i19 % 2;
                } else {
                    brvVar.v.setVisibility(0);
                    int i21 = d + 125;
                    e = i21 % 128;
                    int i22 = i21 % 2;
                }
            } else {
                brvVar.v.setVisibility(8);
                int i23 = d;
                int i24 = i23 & 5;
                int i25 = -(-((i23 ^ 5) | i24));
                int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
                e = i26 % 128;
                int i27 = i26 % 2;
            }
        } else {
            brvVar.v.setVisibility(0);
            int i28 = d;
            int i29 = (i28 & (-62)) | ((~i28) & 61);
            int i30 = (i28 & 61) << 1;
            int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
            e = i31 % 128;
            if (i31 % 2 == 0) {
                int i32 = 2 % 4;
            }
        }
        brvVar.A.setVisibility(0);
        ImageView imageView = brvVar.A;
        ViewOnClickListenerC0099an viewOnClickListenerC0099an = new ViewOnClickListenerC0099an(this, rosterItem, i);
        int i33 = e;
        int i34 = ((((i33 ^ 25) | (i33 & 25)) << 1) - (~(-(((~i33) & 25) | (i33 & (-26)))))) - 1;
        d = i34 % 128;
        if (i34 % 2 != 0) {
            imageView.setOnClickListener(viewOnClickListenerC0099an);
            throw null;
        }
        imageView.setOnClickListener(viewOnClickListenerC0099an);
        int i35 = e + 97;
        d = i35 % 128;
        int i36 = i35 % 2;
    }
}
