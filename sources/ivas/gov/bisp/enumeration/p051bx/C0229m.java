package ivas.gov.bisp.enumeration.p051bx;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.activity.DashboardActivity;
import ivas.gov.bisp.enumeration.bK.au;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import ivas.gov.bisp.enumeration.models.RosterItem;
import ivas.gov.bisp.enumeration.p091n.j;
import java.util.ArrayList;
import java.util.List;
import net.sqlcipher.BuildConfig;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bx.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0229m extends RecyclerView.OooO<btm> {
    private static int d = 1;
    private static int e;
    public final Activity f;
    public final List<RosterItem> g;
    public ArrayList<Item> h;
    public ArrayList<Item> i;
    public String j;
    public String k;

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bx.m$btm */
    public class btm extends RecyclerView.o0O0O00 {
        public TextView A;
        public TextView B;
        public TextView u;
        public CardView v;
        public TextView w;
        public TextView x;
        public TextView y;
        public TextView z;

        public btm(C0229m c0229m, View view) {
            super(view);
            this.v = (CardView) view.findViewById(R.id.cv_parent);
            this.w = (TextView) view.findViewById(R.id.tv_cnic);
            this.x = (TextView) view.findViewById(R.id.tv_name);
            this.u = (TextView) view.findViewById(R.id.tv_gender);
            this.z = (TextView) view.findViewById(R.id.tv_marital_status);
            this.y = (TextView) view.findViewById(R.id.tv_relationship);
            this.A = (TextView) view.findViewById(R.id.tv_discrepancy);
            this.B = (TextView) view.findViewById(R.id.tv_case);
        }
    }

    public C0229m(Activity activity, List<RosterItem> list) {
        this.f = activity;
        this.g = list;
        new ArrayList().addAll(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public int b() {
        int i = 2 % 2;
        int i2 = e;
        int i3 = (i2 ^ 39) + ((i2 & 39) << 1);
        d = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            this.g.size();
            obj.hashCode();
            throw null;
        }
        int size = this.g.size();
        int i4 = d;
        int i5 = ((((i4 ^ 97) | (i4 & 97)) << 1) - (~(-(((~i4) & 97) | (i4 & (-98)))))) - 1;
        e = i5 % 128;
        if (i5 % 2 == 0) {
            return size;
        }
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public RecyclerView.o0O0O00 f(ViewGroup viewGroup, int i) {
        int i2 = 2 % 2;
        btm btmVar = new btm(this, j.d(viewGroup, R.layout.layout_roster_list_item, viewGroup, false));
        int i3 = d;
        int i4 = (i3 ^ 63) + ((i3 & 63) << 1);
        e = i4 % 128;
        int i5 = i4 % 2;
        return btmVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public void g(RecyclerView.o0O0O00 o0o0o00, @SuppressLint({"RecyclerView"}) int i) {
        Activity activity;
        int i2;
        int i3 = 2 % 2;
        int i4 = d;
        int i5 = i4 & 75;
        int i6 = (((i4 | 75) & (~i5)) - (~(-(-(i5 << 1))))) - 1;
        e = i6 % 128;
        int i7 = i6 % 2;
        btm btmVar = (btm) o0o0o00;
        RosterItem rosterItem = this.g.get(i);
        btmVar.v.setVisibility(8);
        String cnic = rosterItem.getCnic();
        String hhMemberNames = rosterItem.getHhMemberNames();
        String gender = rosterItem.getGender();
        String form_no = rosterItem.getForm_no();
        int maritalStatusCode = rosterItem.getMaritalStatusCode();
        int relationToHouseholdHead = rosterItem.getRelationToHouseholdHead();
        String discrepancy_status = rosterItem.getDiscrepancy_status();
        StringBuilder sb = new StringBuilder();
        sb.append(rosterItem.getMessage());
        String string = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(rosterItem.getRoster_message());
        String string2 = sb2.toString();
        TextView textView = btmVar.w;
        int iJ = j.j(cnic, 4, cnic.length());
        j.B(new StringBuilder(), cnic.substring(0, iJ).replaceAll("[A-Za-z0-9]", "X"), cnic, iJ, textView);
        btmVar.x.setText(hhMemberNames);
        btmVar.u.setText(gender);
        Activity activity2 = this.f;
        new au(activity2, "relation_to_household_head", activity2.getResources().getString(R.string.relation_to_head), new x(this, relationToHouseholdHead, btmVar)).execute(new Void[0]);
        Activity activity3 = this.f;
        au auVar = new au(activity3, "marital_status", activity3.getResources().getString(R.string.marital_status), new M(this, maritalStatusCode, btmVar));
        int i8 = d + 99;
        e = i8 % 128;
        if (i8 % 2 != 0) {
            auVar.execute(new Void[1]);
        } else {
            auVar.execute(new Void[0]);
        }
        btmVar.z.setText(this.k);
        btmVar.y.setText(this.j);
        String[] strArrSplit = discrepancy_status.split(",");
        int length = strArrSplit.length;
        int i9 = e;
        int i10 = i9 & 61;
        int i11 = (i9 | 61) & (~i10);
        int i12 = -(-(i10 << 1));
        int i13 = (i11 & i12) + (i11 | i12);
        d = i13 % 128;
        int i14 = i13 % 2;
        int i15 = 0;
        while (true) {
            Object obj = null;
            if (i15 >= length) {
                btmVar.B.setText("Discrepancy");
                int i16 = d;
                int i17 = (((i16 & (-56)) | ((~i16) & 55)) - (~(-(-((i16 & 55) << 1))))) - 1;
                e = i17 % 128;
                int i18 = i17 % 2;
                if (string.contains("Discrepancy")) {
                    int i19 = e + 9;
                    d = i19 % 128;
                    int i20 = i19 % 2;
                    if (string2.contains("Discrepancy")) {
                        int i21 = d;
                        int i22 = i21 & 113;
                        int i23 = ((i21 ^ 113) | i22) << 1;
                        int i24 = -((i21 | 113) & (~i22));
                        int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
                        e = i25 % 128;
                        if (i25 % 2 != 0) {
                            discrepancy_status.equals(BuildConfig.FLAVOR);
                            obj.hashCode();
                            throw null;
                        }
                        if (discrepancy_status.equals(BuildConfig.FLAVOR)) {
                            btmVar.v.setVisibility(8);
                            int i26 = d;
                            int i27 = ((i26 ^ 74) + ((i26 & 74) << 1)) - 1;
                            e = i27 % 128;
                            int i28 = i27 % 2;
                        } else {
                            btmVar.v.setVisibility(0);
                            int i29 = e + 103;
                            d = i29 % 128;
                            int i30 = i29 % 2;
                        }
                    } else {
                        btmVar.v.setVisibility(8);
                        int i31 = e;
                        int i32 = ((((i31 ^ 71) | (i31 & 71)) << 1) - (~(-(((~i31) & 71) | (i31 & (-72)))))) - 1;
                        d = i32 % 128;
                        int i33 = i32 % 2;
                    }
                } else {
                    Intent intent = new Intent(this.f, (Class<?>) DashboardActivity.class);
                    int i34 = d + 63;
                    e = i34 % 128;
                    if (i34 % 2 != 0) {
                        this.f.startActivity(intent);
                        activity = this.f;
                        int i35 = 82 / 0;
                    } else {
                        this.f.startActivity(intent);
                        activity = this.f;
                    }
                    activity.finish();
                    int i36 = e;
                    int i37 = i36 ^ 119;
                    int i38 = ((i36 & 119) | i37) << 1;
                    int i39 = -i37;
                    int i40 = (i38 ^ i39) + ((i38 & i39) << 1);
                    d = i40 % 128;
                    int i41 = i40 % 2;
                }
                CardView cardView = btmVar.v;
                N n = new N(this, cnic, rosterItem, i, form_no);
                int i42 = e;
                int i43 = i42 & 113;
                int i44 = (i42 ^ 113) | i43;
                int i45 = (i43 & i44) + (i44 | i43);
                d = i45 % 128;
                int i46 = i45 % 2;
                cardView.setOnClickListener(n);
                int i47 = d;
                int i48 = (i47 & (-68)) | ((~i47) & 67);
                int i49 = (i47 & 67) << 1;
                int i50 = (i48 & i49) + (i49 | i48);
                e = i50 % 128;
                if (i50 % 2 != 0) {
                    throw null;
                }
                return;
            }
            int i51 = d + 107;
            e = i51 % 128;
            int i52 = i51 % 2;
            String str = strArrSplit[i15];
            if (str.equals("4")) {
                int i53 = d;
                int i54 = i53 ^ 83;
                int i55 = -(-((i53 & 83) << 1));
                int i56 = (i54 & i55) + (i55 | i54);
                e = i56 % 128;
                int i57 = i56 % 2;
                btmVar.A.setText("Disability");
                int i58 = d;
                int i59 = i58 & 17;
                int i60 = ((i58 ^ 17) | i59) << 1;
                int i61 = -((i58 | 17) & (~i59));
                int i62 = (i60 ^ i61) + ((i61 & i60) << 1);
                e = i62 % 128;
                int i63 = i62 % 2;
            } else {
                if (!(!str.equals("1"))) {
                    int i64 = e;
                    int i65 = (i64 & (-6)) | ((~i64) & 5);
                    int i66 = (i64 & 5) << 1;
                    int i67 = (i65 ^ i66) + ((i66 & i65) << 1);
                    d = i67 % 128;
                    if (i67 % 2 == 0) {
                        btmVar.A.setText("Invalid CNIC");
                        obj.hashCode();
                        throw null;
                    }
                    btmVar.A.setText("Invalid CNIC");
                    i2 = d + 55;
                } else if (str.equals("2")) {
                    int i68 = d;
                    int i69 = i68 & 91;
                    int i70 = (i68 ^ 91) | i69;
                    int i71 = (i69 ^ i70) + ((i70 & i69) << 1);
                    e = i71 % 128;
                    int i72 = i71 % 2;
                    btmVar.A.setText("Duplicate CNIC");
                    int i73 = e + 45;
                    d = i73 % 128;
                    int i74 = i73 % 2;
                } else if (str.equals("3")) {
                    int i75 = d;
                    int i76 = i75 & 15;
                    int i77 = (((i75 | 15) & (~i76)) - (~(i76 << 1))) - 1;
                    e = i77 % 128;
                    int i78 = i77 % 2;
                    btmVar.A.setText("Missing CNIC");
                    int i79 = e + 99;
                    d = i79 % 128;
                    int i80 = i79 % 2;
                } else if (str.equals("6")) {
                    int i81 = d + 39;
                    e = i81 % 128;
                    int i82 = i81 % 2;
                    btmVar.A.setText("Splitting");
                    int i83 = e + 33;
                    d = i83 % 128;
                    if (i83 % 2 == 0) {
                        int i84 = 5 / 2;
                    }
                } else if (str.equals("7")) {
                    int i85 = d;
                    int i86 = (-2) - (((i85 & 122) + (i85 | 122)) ^ (-1));
                    e = i86 % 128;
                    if (i86 % 2 != 0) {
                        btmVar.A.setText("Duplicate QR");
                        int i87 = 23 / 0;
                    } else {
                        btmVar.A.setText("Duplicate QR");
                    }
                    int i88 = d;
                    int i89 = i88 & 53;
                    i2 = ((i88 | 53) & (~i89)) + (i89 << 1);
                } else if (str.equals("8")) {
                    int i90 = d;
                    int i91 = (((i90 | 42) << 1) - (i90 ^ 42)) - 1;
                    e = i91 % 128;
                    int i92 = i91 % 2;
                    btmVar.A.setText("Gender");
                    int i93 = e + 61;
                    d = i93 % 128;
                    if (i93 % 2 == 0) {
                        int i94 = 3 / 3;
                    }
                } else if (str.equals("9")) {
                    int i95 = e;
                    int i96 = i95 & 113;
                    int i97 = -(-((i95 ^ 113) | i96));
                    int i98 = (i96 ^ i97) + ((i97 & i96) << 1);
                    d = i98 % 128;
                    if (i98 % 2 == 0) {
                        btmVar.A.setText("Marital Status");
                        throw null;
                    }
                    btmVar.A.setText("Marital Status");
                } else if (str.equals("10")) {
                    int i99 = d;
                    int i100 = ((i99 ^ 37) | (i99 & 37)) << 1;
                    int i101 = -(((~i99) & 37) | (i99 & (-38)));
                    int i102 = (i100 & i101) + (i101 | i100);
                    e = i102 % 128;
                    int i103 = i102 % 2;
                    btmVar.A.setText("DOB");
                    int i104 = d;
                    int i105 = i104 & 73;
                    int i106 = ((((i104 ^ 73) | i105) << 1) - (~(-((i104 | 73) & (~i105))))) - 1;
                    e = i106 % 128;
                    int i107 = i106 % 2;
                }
                e = i2 % 128;
                int i108 = i2 % 2;
            }
            i15 = (i15 | 1) + (i15 & 1);
            int i109 = e;
            int i110 = (((i109 ^ 83) | (i109 & 83)) << 1) - (((~i109) & 83) | (i109 & (-84)));
            d = i110 % 128;
            int i111 = i110 % 2;
        }
    }
}
