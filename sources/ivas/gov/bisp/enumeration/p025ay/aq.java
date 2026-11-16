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
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.util.ArrayList;
import java.util.List;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class aq extends RecyclerView.OooO<bqM> {
    private static int d = 1;
    private static int e;
    public final Activity f;
    public final List<RosterItem> g;
    public ArrayList<Item> h;
    public ArrayList<Item> i;
    public String j;
    public String k;

    public class bqM extends RecyclerView.o0O0O00 {
        public ImageView A;
        public ImageView B;
        public TextView u;
        public CardView v;
        public TextView w;
        public TextView x;
        public TextView y;
        public TextView z;

        public bqM(aq aqVar, View view) {
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

    public aq(Activity activity, List<RosterItem> list) {
        this.f = activity;
        this.g = list;
        new ArrayList().addAll(list);
        new SessionManager(activity);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public int b() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 & 57;
        int i4 = (i2 | 57) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        e = i6 % 128;
        if (i6 % 2 != 0) {
            this.g.size();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int size = this.g.size();
        int i7 = d;
        int i8 = ((i7 & 18) + (i7 | 18)) - 1;
        e = i8 % 128;
        int i9 = i8 % 2;
        return size;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public RecyclerView.o0O0O00 f(ViewGroup viewGroup, int i) {
        int i2 = 2 % 2;
        bqM bqm = new bqM(this, j.d(viewGroup, R.layout.layout_roster_list_item, viewGroup, false));
        int i3 = d + 71;
        e = i3 % 128;
        int i4 = i3 % 2;
        return bqm;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0131  */
    /* JADX WARN: Code duplicated, block: B:13:0x0147  */
    /* JADX WARN: Code duplicated, block: B:15:0x0152  */
    /* JADX WARN: Code duplicated, block: B:16:0x0158  */
    /* JADX WARN: Code duplicated, block: B:17:0x015e  */
    /* JADX WARN: Code duplicated, block: B:18:0x0175  */
    /* JADX WARN: Code duplicated, block: B:19:0x0192  */
    /* JADX WARN: Code duplicated, block: B:9:0x012b A[PHI: r7
  0x012b: PHI (r7v4 int) = (r7v3 int), (r7v14 int) binds: [B:8:0x0129, B:5:0x010d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public void g(RecyclerView.o0O0O00 o0o0o00, @SuppressLint({"RecyclerView"}) int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = d;
        int i6 = (i5 & (-112)) | ((~i5) & 111);
        int i7 = -(-((i5 & 111) << 1));
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        e = i8 % 128;
        int i9 = i8 % 2;
        bqM bqm = (bqM) o0o0o00;
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
        new au(activity, "relation_to_household_head", activity.getResources().getString(R.string.relation_to_head), new ao(this, relationToHouseholdHead, bqm)).execute(new Void[0]);
        Activity activity2 = this.f;
        au auVar = new au(activity2, "marital_status", activity2.getResources().getString(R.string.marital_status), new ar(this, maritalStatusCode, bqm));
        int i10 = e;
        int i11 = i10 & 53;
        int i12 = (i11 - (~(-(-((i10 ^ 53) | i11))))) - 1;
        d = i12 % 128;
        int i13 = i12 % 2;
        auVar.execute(new Void[0]);
        TextView textView = bqm.w;
        int iJ = j.j(cnic, 4, cnic.length());
        j.B(new StringBuilder(), cnic.substring(0, iJ).replaceAll("[A-Za-z0-9]", "X"), cnic, iJ, textView);
        bqm.x.setText(hhMemberNames);
        bqm.u.setText(gender);
        int i14 = e;
        int i15 = (i14 & 85) + (i14 | 85);
        d = i15 % 128;
        if (i15 % 2 == 0) {
            bqm.z.setText(this.k);
            bqm.y.setText(this.j);
            bqm.B.setVisibility(86);
            i2 = 1;
            if (!string.contains("Discrepancy")) {
                bqm.v.setVisibility(0);
                int i16 = d;
                int i17 = i16 & 123;
                int i18 = -(-(i16 | 123));
                int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
                e = i19 % 128;
                int i20 = i19 % 2;
            } else if (string2.contains("Discrepancy")) {
                int i21 = e;
                int i22 = (i21 ^ 57) + ((i21 & 57) << i2);
                d = i22 % 128;
                int i23 = i22 % 2;
                if (discrepancy_status.equals(BuildConfig.FLAVOR)) {
                    i3 = e + 31;
                    d = i3 % 128;
                    if (i3 % 2 == 0) {
                        bqm.v.setVisibility(2);
                    } else {
                        bqm.v.setVisibility(8);
                    }
                } else {
                    bqm.v.setVisibility(0);
                    int i24 = d;
                    int i25 = ((i24 ^ 16) + ((i24 & 16) << 1)) - 1;
                    e = i25 % 128;
                    int i26 = i25 % 2;
                }
            } else {
                bqm.v.setVisibility(8);
                int i27 = d;
                int i28 = i27 & 47;
                int i29 = (i27 | 47) & (~i28);
                int i30 = -(-(i28 << 1));
                int i31 = ((i29 | i30) << 1) - (i29 ^ i30);
                e = i31 % 128;
                int i32 = i31 % 2;
            }
        } else {
            bqm.z.setText(this.k);
            bqm.y.setText(this.j);
            bqm.B.setVisibility(8);
            i2 = 1;
            if (!string.contains("Discrepancy")) {
                bqm.v.setVisibility(0);
                int i110 = d;
                int i111 = i110 & 123;
                int i112 = -(-(i110 | 123));
                int i113 = ((i111 | i112) << 1) - (i112 ^ i111);
                e = i113 % 128;
                int i210 = i113 % 2;
            } else if (string2.contains("Discrepancy")) {
                int i211 = e;
                int i212 = (i211 ^ 57) + ((i211 & 57) << i2);
                d = i212 % 128;
                int i213 = i212 % 2;
                if (discrepancy_status.equals(BuildConfig.FLAVOR)) {
                    i3 = e + 31;
                    d = i3 % 128;
                    if (i3 % 2 == 0) {
                        bqm.v.setVisibility(2);
                    } else {
                        bqm.v.setVisibility(8);
                    }
                } else {
                    bqm.v.setVisibility(0);
                    int i214 = d;
                    int i215 = ((i214 ^ 16) + ((i214 & 16) << 1)) - 1;
                    e = i215 % 128;
                    int i216 = i215 % 2;
                }
            } else {
                bqm.v.setVisibility(8);
                int i217 = d;
                int i218 = i217 & 47;
                int i219 = (i217 | 47) & (~i218);
                int i33 = -(-(i218 << 1));
                int i34 = ((i219 | i33) << 1) - (i219 ^ i33);
                e = i34 % 128;
                int i35 = i34 % 2;
            }
        }
        bqm.A.setVisibility(0);
        ImageView imageView = bqm.A;
        as asVar = new as(this, rosterItem, i);
        int i36 = d + 62;
        int i37 = (i36 ^ (-1)) + (i36 << 1);
        e = i37 % 128;
        int i38 = i37 % 2;
        imageView.setOnClickListener(asVar);
        int i39 = e;
        int i40 = i39 ^ 21;
        int i41 = ((i39 & 21) | i40) << 1;
        int i42 = -i40;
        int i43 = (i41 & i42) + (i41 | i42);
        d = i43 % 128;
        if (i43 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
