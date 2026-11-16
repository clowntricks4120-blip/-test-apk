package ivas.gov.bisp.enumeration.p025ay;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ProgressDialog;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.bK.au;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import ivas.gov.bisp.enumeration.models.RosterItem;
import ivas.gov.bisp.enumeration.p091n.j;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class aT extends RecyclerView.OooO<brq> {
    private static int d = 1;
    private static int e;
    public final Activity f;
    public final List<RosterItem> g;
    public ArrayList<Item> h;
    public ArrayList<Item> i;
    public String j;
    public String k;
    public ProgressDialog l;
    public SessionManager m;

    public class brq extends RecyclerView.o0O0O00 {
        public TextView A;
        public ImageView B;
        public ImageView C;
        public TextView u;
        public TextView v;
        public TextView w;
        public TextView x;
        public TextView y;
        public TextView z;

        public brq(aT aTVar, View view) {
            super(view);
            this.v = (TextView) view.findViewById(R.id.tv_cnic);
            this.w = (TextView) view.findViewById(R.id.tv_name);
            this.x = (TextView) view.findViewById(R.id.tv_gender);
            this.u = (TextView) view.findViewById(R.id.tv_marital_status);
            this.z = (TextView) view.findViewById(R.id.tv_relationship);
            this.y = (TextView) view.findViewById(R.id.tv_discrepancy);
            this.A = (TextView) view.findViewById(R.id.tv_roster_status);
            this.C = (ImageView) view.findViewById(R.id.iv_edit);
            this.B = (ImageView) view.findViewById(R.id.iv_delete);
        }
    }

    public aT(Activity activity, List<RosterItem> list) {
        this.f = activity;
        this.g = list;
        this.m = new SessionManager(activity.getApplicationContext());
        this.l = new ProgressDialog(activity);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public int b() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = (i2 & 29) + (i2 | 29);
        e = i3 % 128;
        if (i3 % 2 == 0) {
            return this.g.size();
        }
        int i4 = 57 / 0;
        return this.g.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public RecyclerView.o0O0O00 f(ViewGroup viewGroup, int i) {
        int i2 = 2 % 2;
        brq brqVar = new brq(this, j.d(viewGroup, R.layout.layout_roster_list_item, viewGroup, false));
        int i3 = d;
        int i4 = i3 & 115;
        int i5 = ((i3 | 115) & (~i4)) + (i4 << 1);
        e = i5 % 128;
        int i6 = i5 % 2;
        return brqVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public void g(RecyclerView.o0O0O00 o0o0o00, @SuppressLint({"RecyclerView"}) int i) {
        int i2 = 2 % 2;
        int i3 = e;
        int i4 = ((i3 | 40) << 1) - (i3 ^ 40);
        int i5 = (i4 ^ (-1)) + (i4 << 1);
        d = i5 % 128;
        if (i5 % 2 == 0) {
            RosterItem rosterItem = this.g.get(i);
            rosterItem.getCnic();
            rosterItem.getHhMemberNames();
            rosterItem.getGender();
            throw null;
        }
        brq brqVar = (brq) o0o0o00;
        RosterItem rosterItem2 = this.g.get(i);
        String cnic = rosterItem2.getCnic();
        String hhMemberNames = rosterItem2.getHhMemberNames();
        String gender = rosterItem2.getGender();
        String form_no = rosterItem2.getForm_no();
        int maritalStatusCode = rosterItem2.getMaritalStatusCode();
        int relationToHouseholdHead = rosterItem2.getRelationToHouseholdHead();
        rosterItem2.getDiscrepancy_status();
        StringBuilder sb = new StringBuilder();
        sb.append(rosterItem2.getMessage());
        String string = sb.toString();
        rosterItem2.getRoster_message();
        Activity activity = this.f;
        new au(activity, "relation_to_household_head", activity.getResources().getString(R.string.relation_to_head), new aB(this, relationToHouseholdHead, brqVar)).execute(new Void[0]);
        Activity activity2 = this.f;
        au auVar = new au(activity2, "marital_status", activity2.getResources().getString(R.string.marital_status), new aG(this, maritalStatusCode, brqVar));
        int i6 = e;
        int i7 = i6 ^ 33;
        int i8 = (i6 & 33) << 1;
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        d = i9 % 128;
        int i10 = i9 % 2;
        auVar.execute(new Void[0]);
        TextView textView = brqVar.v;
        int iJ = j.j(cnic, 4, cnic.length());
        j.B(new StringBuilder(), cnic.substring(0, iJ).replaceAll("[A-Za-z0-9]", "X"), cnic, iJ, textView);
        brqVar.w.setText(hhMemberNames);
        TextView textView2 = brqVar.x;
        int i11 = d;
        int i12 = ((i11 | 5) << 1) - (i11 ^ 5);
        e = i12 % 128;
        if (i12 % 2 != 0) {
            textView2.setText(gender);
            brqVar.u.setText(this.k);
            brqVar.z.setText(this.j);
            brqVar.y.setText(string);
            gender.equals("null");
            throw null;
        }
        textView2.setText(gender);
        brqVar.u.setText(this.k);
        brqVar.z.setText(this.j);
        brqVar.y.setText(string);
        if (!(!gender.equals("null")) || gender.length() <= 0) {
            brqVar.A.setVisibility(0);
            int i13 = d;
            int i14 = i13 & 99;
            int i15 = (((i13 | 99) & (~i14)) - (~(i14 << 1))) - 1;
            e = i15 % 128;
            int i16 = i15 % 2;
        } else {
            int i17 = d;
            int i18 = i17 & 47;
            int i19 = -(-((i17 ^ 47) | i18));
            int i20 = (i18 & i19) + (i19 | i18);
            e = i20 % 128;
            int i21 = i20 % 2;
            brqVar.A.setVisibility(8);
            int i22 = d;
            int i23 = (((i22 & (-42)) | ((~i22) & 41)) - (~((i22 & 41) << 1))) - 1;
            e = i23 % 128;
            int i24 = i23 % 2;
        }
        brqVar.C.setVisibility(0);
        brqVar.C.setOnClickListener(new aH(this, rosterItem2, i, cnic, form_no));
        ImageView imageView = brqVar.B;
        aC aCVar = new aC(this, rosterItem2, i);
        int i25 = d;
        int i26 = (i25 ^ 7) + ((i25 & 7) << 1);
        e = i26 % 128;
        if (i26 % 2 == 0) {
            imageView.setOnClickListener(aCVar);
            return;
        }
        imageView.setOnClickListener(aCVar);
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
