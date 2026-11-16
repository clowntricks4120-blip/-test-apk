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

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.ay.at, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0100at extends RecyclerView.OooO<bqZ> {
    private static int d = 1;
    private static int e;
    public final Activity f;
    public final List<RosterItem> g;
    public ArrayList<Item> h;
    public ArrayList<Item> i;
    public String j;
    public String k;

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.ay.at$bqZ */
    public class bqZ extends RecyclerView.o0O0O00 {
        public ImageView A;
        public ImageView B;
        public TextView u;
        public CardView v;
        public TextView w;
        public TextView x;
        public TextView y;
        public TextView z;

        public bqZ(C0100at c0100at, View view) {
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

    public C0100at(Activity activity, List<RosterItem> list) {
        this.f = activity;
        this.g = list;
        new ArrayList().addAll(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public int b() {
        int i = 2 % 2;
        int i2 = d + 27;
        e = i2 % 128;
        int i3 = i2 % 2;
        int size = this.g.size();
        int i4 = d;
        int i5 = (i4 & 107) + (i4 | 107);
        e = i5 % 128;
        if (i5 % 2 == 0) {
            return size;
        }
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public RecyclerView.o0O0O00 f(ViewGroup viewGroup, int i) {
        int i2 = 2 % 2;
        bqZ bqz = new bqZ(this, j.d(viewGroup, R.layout.layout_roster_list_item, viewGroup, false));
        int i3 = d;
        int i4 = (i3 ^ 117) + ((i3 & 117) << 1);
        e = i4 % 128;
        if (i4 % 2 == 0) {
            return bqz;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0140  */
    /* JADX WARN: Code duplicated, block: B:20:0x0148  */
    /* JADX WARN: Code duplicated, block: B:22:0x015d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0165  */
    /* JADX WARN: Code duplicated, block: B:25:0x0168  */
    /* JADX WARN: Code duplicated, block: B:26:0x0186  */
    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public void g(RecyclerView.o0O0O00 o0o0o00, @SuppressLint({"RecyclerView"}) int i) {
        TextView textView;
        int i2;
        int i3;
        CardView cardView;
        int i4 = 2 % 2;
        int i5 = d;
        int i6 = i5 ^ 125;
        int i7 = ((i5 & 125) | i6) << 1;
        int i8 = -i6;
        int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
        e = i9 % 128;
        if (i9 % 2 != 0) {
            Object obj = null;
            RosterItem rosterItem = this.g.get(i);
            rosterItem.getCnic();
            rosterItem.getHhMemberNames();
            rosterItem.getGender();
            obj.hashCode();
            throw null;
        }
        bqZ bqz = (bqZ) o0o0o00;
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
        new au(activity, "relation_to_household_head", activity.getResources().getString(R.string.relation_to_head), new au(this, relationToHouseholdHead, bqz)).execute(new Void[0]);
        Activity activity2 = this.f;
        au auVar = new au(activity2, "marital_status", activity2.getResources().getString(R.string.marital_status), new C0103g(this, maritalStatusCode, bqz));
        int i10 = e;
        int i11 = i10 & 31;
        int i12 = i10 | 31;
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        d = i13 % 128;
        if (i13 % 2 == 0) {
            auVar.execute(new Void[1]);
            textView = bqz.w;
            i2 = 3;
        } else {
            auVar.execute(new Void[0]);
            textView = bqz.w;
            i2 = 4;
        }
        int iJ = j.j(cnic, i2, cnic.length());
        j.B(new StringBuilder(), cnic.substring(0, iJ).replaceAll("[A-Za-z0-9]", "X"), cnic, iJ, textView);
        bqz.x.setText(hhMemberNames);
        bqz.u.setText(gender);
        int i14 = e;
        int i15 = i14 & 23;
        int i16 = (i14 ^ 23) | i15;
        int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
        d = i17 % 128;
        int i18 = i17 % 2;
        bqz.z.setText(this.k);
        bqz.y.setText(this.j);
        int i19 = 8;
        bqz.B.setVisibility(8);
        if (string.contains("Discrepancy")) {
            int i20 = e;
            int i21 = i20 & 29;
            int i22 = (i20 ^ 29) | i21;
            int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
            d = i23 % 128;
            if (i23 % 2 == 0) {
                int i24 = 70 / 0;
                if (!string2.contains("Discrepancy")) {
                    bqz.v.setVisibility(8);
                    int i25 = d;
                    int i26 = i25 & 105;
                    int i27 = ((i25 ^ 105) | i26) << 1;
                    int i28 = -((i25 | 105) & (~i26));
                    int i29 = (i27 & i28) + (i28 | i27);
                    e = i29 % 128;
                    int i30 = i29 % 2;
                } else if (discrepancy_status.equals(BuildConfig.FLAVOR)) {
                    int i31 = d;
                    int i32 = i31 & 19;
                    i3 = (i32 - (~(-(-((i31 ^ 19) | i32))))) - 1;
                    e = i3 % 128;
                    if (i3 % 2 != 0) {
                        cardView = bqz.v;
                        i19 = 114;
                    } else {
                        cardView = bqz.v;
                    }
                    cardView.setVisibility(i19);
                } else {
                    bqz.v.setVisibility(0);
                    int i33 = e;
                    int i34 = (((i33 | 27) << 1) - (~(-(((~i33) & 27) | (i33 & (-28)))))) - 1;
                    d = i34 % 128;
                    int i35 = i34 % 2;
                }
            } else if (!string2.contains("Discrepancy")) {
                bqz.v.setVisibility(8);
                int i210 = d;
                int i211 = i210 & 105;
                int i212 = ((i210 ^ 105) | i211) << 1;
                int i213 = -((i210 | 105) & (~i211));
                int i214 = (i212 & i213) + (i213 | i212);
                e = i214 % 128;
                int i36 = i214 % 2;
            } else if (discrepancy_status.equals(BuildConfig.FLAVOR)) {
                int i37 = d;
                int i38 = i37 & 19;
                i3 = (i38 - (~(-(-((i37 ^ 19) | i38))))) - 1;
                e = i3 % 128;
                if (i3 % 2 != 0) {
                    cardView = bqz.v;
                    i19 = 114;
                } else {
                    cardView = bqz.v;
                }
                cardView.setVisibility(i19);
            } else {
                bqz.v.setVisibility(0);
                int i39 = e;
                int i310 = (((i39 | 27) << 1) - (~(-(((~i39) & 27) | (i39 & (-28)))))) - 1;
                d = i310 % 128;
                int i311 = i310 % 2;
            }
        } else {
            bqz.v.setVisibility(0);
            int i40 = e + 61;
            d = i40 % 128;
            int i41 = i40 % 2;
        }
        bqz.A.setVisibility(0);
        ImageView imageView = bqz.A;
        ViewOnClickListenerC0101av viewOnClickListenerC0101av = new ViewOnClickListenerC0101av(this, rosterItem2, i);
        int i42 = d;
        int i43 = (i42 & 89) + (i42 | 89);
        e = i43 % 128;
        int i44 = i43 % 2;
        imageView.setOnClickListener(viewOnClickListenerC0101av);
        int i45 = e;
        int i46 = (i45 | 77) << 1;
        int i47 = -(i45 ^ 77);
        int i48 = (i46 & i47) + (i47 | i46);
        d = i48 % 128;
        if (i48 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
