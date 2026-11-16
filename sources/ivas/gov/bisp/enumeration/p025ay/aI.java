package ivas.gov.bisp.enumeration.p025ay;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ProgressDialog;
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
public class aI extends RecyclerView.OooO<brx> {
    private static int d = 1;
    private static int e;
    public final Activity f;
    public List<RosterItem> g;
    public ArrayList<Item> h;
    public ArrayList<Item> i;
    public String j;
    public String k;
    public ProgressDialog l;
    public SessionManager m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public baK f69o;

    public interface baK {
    }

    public class brx extends RecyclerView.o0O0O00 {
        public TextView A;
        public ImageView B;
        public TextView C;
        public ImageView D;
        public TextView u;
        public CardView v;
        public TextView w;
        public TextView x;
        public TextView y;
        public TextView z;

        public brx(aI aIVar, View view) {
            super(view);
            this.v = (CardView) view.findViewById(R.id.cv_parent);
            this.w = (TextView) view.findViewById(R.id.tv_cnic);
            this.x = (TextView) view.findViewById(R.id.tv_name);
            this.u = (TextView) view.findViewById(R.id.tv_gender);
            this.z = (TextView) view.findViewById(R.id.tv_marital_status);
            this.y = (TextView) view.findViewById(R.id.tv_relationship);
            this.A = (TextView) view.findViewById(R.id.tv_discrepancy);
            this.C = (TextView) view.findViewById(R.id.tv_roster_status);
            this.D = (ImageView) view.findViewById(R.id.iv_delete);
            this.B = (ImageView) view.findViewById(R.id.iv_edit);
        }
    }

    public aI(Activity activity, List<RosterItem> list, boolean z, baK bak) {
        this.f = activity;
        this.g = list;
        this.n = z;
        this.f69o = bak;
        this.m = new SessionManager(activity.getApplicationContext());
        this.l = new ProgressDialog(activity);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public int b() {
        int i = 2 % 2;
        int i2 = e;
        int i3 = i2 & 95;
        int i4 = ((((i2 ^ 95) | i3) << 1) - (~(-((i2 | 95) & (~i3))))) - 1;
        d = i4 % 128;
        int i5 = i4 % 2;
        int size = this.g.size();
        int i6 = d;
        int i7 = (((i6 | 32) << 1) - (i6 ^ 32)) - 1;
        e = i7 % 128;
        int i8 = i7 % 2;
        return size;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public RecyclerView.o0O0O00 f(ViewGroup viewGroup, int i) {
        int i2 = 2 % 2;
        brx brxVar = new brx(this, j.d(viewGroup, R.layout.layout_roster_list_item, viewGroup, false));
        int i3 = d;
        int i4 = (i3 ^ 63) + ((i3 & 63) << 1);
        e = i4 % 128;
        if (i4 % 2 == 0) {
            return brxVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public void g(RecyclerView.o0O0O00 o0o0o00, @SuppressLint({"RecyclerView"}) int i) {
        int i2 = 2 % 2;
        int i3 = d + 49;
        e = i3 % 128;
        if (i3 % 2 != 0) {
            RosterItem rosterItem = this.g.get(i);
            rosterItem.getCnic();
            rosterItem.getHhMemberNames();
            rosterItem.getGender();
            rosterItem.getForm_no();
            throw null;
        }
        brx brxVar = (brx) o0o0o00;
        RosterItem rosterItem2 = this.g.get(i);
        String cnic = rosterItem2.getCnic();
        String hhMemberNames = rosterItem2.getHhMemberNames();
        String gender = rosterItem2.getGender();
        String form_no = rosterItem2.getForm_no();
        int maritalStatusCode = rosterItem2.getMaritalStatusCode();
        int relationToHouseholdHead = rosterItem2.getRelationToHouseholdHead();
        String discrepancy_status = rosterItem2.getDiscrepancy_status();
        StringBuilder sb = new StringBuilder();
        sb.append(rosterItem2.getMessage());
        String string = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(rosterItem2.getRoster_message());
        String string2 = sb2.toString();
        int havingChronicDiseaseCode = rosterItem2.getHavingChronicDiseaseCode();
        rosterItem2.get_employmentCode();
        Activity activity = this.f;
        new au(activity, "relation_to_household_head", activity.getResources().getString(R.string.relation_to_head), new ay(this, relationToHouseholdHead, brxVar, cnic)).execute(new Void[0]);
        Activity activity2 = this.f;
        au auVar = new au(activity2, "marital_status", activity2.getResources().getString(R.string.marital_status), new C0102aw(this, maritalStatusCode, brxVar));
        int i4 = d + 33;
        e = i4 % 128;
        int i5 = i4 % 2;
        auVar.execute(new Void[0]);
        rosterItem2.getMobilenumber();
        TextView textView = brxVar.w;
        int iJ = j.j(cnic, 4, cnic.length());
        j.B(new StringBuilder(), cnic.substring(0, iJ).replaceAll("[A-Za-z0-9]", "X"), cnic, iJ, textView);
        brxVar.x.setText(hhMemberNames);
        brxVar.u.setText(gender);
        int i6 = d;
        int i7 = i6 & 95;
        int i8 = i7 + ((i6 ^ 95) | i7);
        e = i8 % 128;
        if (i8 % 2 != 0) {
            brxVar.z.setText(this.k);
            brxVar.y.setText(this.j);
            brxVar.A.setText(string);
            throw null;
        }
        brxVar.z.setText(this.k);
        brxVar.y.setText(this.j);
        brxVar.A.setText(string);
        if (havingChronicDiseaseCode == 0 || relationToHouseholdHead == 0) {
            brxVar.C.setVisibility(0);
            brxVar.D.setVisibility(0);
            int i9 = d;
            int i10 = ((i9 ^ 35) - (~((i9 & 35) << 1))) - 1;
            e = i10 % 128;
            int i11 = i10 % 2;
        } else {
            int i12 = e;
            int i13 = i12 & 89;
            int i14 = ((i12 ^ 89) | i13) << 1;
            int i15 = -((i12 | 89) & (~i13));
            int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
            d = i16 % 128;
            if (i16 % 2 == 0) {
                brxVar.C.setVisibility(105);
            } else {
                brxVar.C.setVisibility(8);
            }
            int i17 = e;
            int i18 = i17 & 119;
            int i19 = (i18 - (~((i17 ^ 119) | i18))) - 1;
            d = i19 % 128;
            int i20 = i19 % 2;
        }
        if (!string.contains("Discrepancy")) {
            brxVar.v.setVisibility(0);
            int i21 = d;
            int i22 = ((i21 ^ 65) | (i21 & 65)) << 1;
            int i23 = -(((~i21) & 65) | (i21 & (-66)));
            int i24 = (i22 & i23) + (i23 | i22);
            e = i24 % 128;
            if (i24 % 2 != 0) {
                int i25 = 4 / 3;
            }
        } else {
            int i26 = e;
            int i27 = i26 & 117;
            int i28 = (i26 ^ 117) | i27;
            int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
            d = i29 % 128;
            int i30 = i29 % 2;
            if (string2.contains("Discrepancy")) {
                int i31 = d + 79;
                e = i31 % 128;
                int i32 = i31 % 2;
                if (!discrepancy_status.equals(BuildConfig.FLAVOR)) {
                    brxVar.v.setVisibility(0);
                    int i33 = d;
                    int i34 = ((((i33 ^ 11) | (i33 & 11)) << 1) - (~(-(((~i33) & 11) | (i33 & (-12)))))) - 1;
                    e = i34 % 128;
                    int i35 = i34 % 2;
                } else {
                    int i36 = d;
                    int i37 = i36 ^ 43;
                    int i38 = (i36 & 43) << 1;
                    int i39 = (i37 & i38) + (i38 | i37);
                    e = i39 % 128;
                    int i40 = i39 % 2;
                    brxVar.v.setVisibility(8);
                    int i41 = e;
                    int i42 = i41 & 69;
                    int i43 = (i41 | 69) & (~i42);
                    int i44 = i42 << 1;
                    int i45 = ((i43 | i44) << 1) - (i43 ^ i44);
                    d = i45 % 128;
                    int i46 = i45 % 2;
                }
            } else {
                brxVar.v.setVisibility(8);
                int i47 = d;
                int i48 = i47 & 23;
                int i49 = -(-((i47 ^ 23) | i48));
                int i50 = ((i48 | i49) << 1) - (i49 ^ i48);
                e = i50 % 128;
                int i51 = i50 % 2;
            }
        }
        brxVar.B.setVisibility(0);
        brxVar.B.setOnClickListener(new ax(this, rosterItem2, i, cnic, form_no));
        ImageView imageView = brxVar.D;
        az azVar = new az(this, brxVar, rosterItem2, i);
        int i52 = e;
        int i53 = (i52 & 117) + (i52 | 117);
        d = i53 % 128;
        int i54 = i53 % 2;
        imageView.setOnClickListener(azVar);
        int i55 = e + 61;
        d = i55 % 128;
        if (i55 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
