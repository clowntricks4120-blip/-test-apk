package ivas.gov.bisp.enumeration.p038bk;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.models.RosterItem;
import ivas.gov.bisp.enumeration.p022av.z;
import ivas.gov.bisp.enumeration.p023aw.a;
import ivas.gov.bisp.enumeration.p091n.j;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class bk extends RecyclerView.OooO<boO> {
    private static int d = 0;
    private static int e = 1;
    public final List<RosterItem> f;
    public SessionManager g;
    public final Activity h;

    public class boO extends RecyclerView.o0O0O00 {
        public TextView u;
        public CardView v;
        public TextView w;
        public TextView x;
        public TextView y;

        public boO(bk bkVar, View view) {
            super(view);
            this.v = (CardView) view.findViewById(R.id.cv_parent);
            this.w = (TextView) view.findViewById(R.id.tv_cnic);
            this.x = (TextView) view.findViewById(R.id.tv_name);
            this.u = (TextView) view.findViewById(R.id.tv_gender);
            this.y = (TextView) view.findViewById(R.id.btn_update);
        }
    }

    public bk(Activity activity, List<RosterItem> list) {
        this.h = activity;
        this.f = list;
        new ArrayList().addAll(list);
        this.g = new SessionManager(activity.getApplicationContext());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public int b() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 & 109;
        int i4 = (i2 | 109) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        e = i6 % 128;
        if (i6 % 2 != 0) {
            return this.f.size();
        }
        this.f.size();
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public RecyclerView.o0O0O00 f(ViewGroup viewGroup, int i) {
        int i2 = 2 % 2;
        boO boo = new boO(this, j.d(viewGroup, R.layout.layout_duplicate_roster_list_item2, viewGroup, false));
        int i3 = e;
        int i4 = ((i3 & 94) + (i3 | 94)) - 1;
        d = i4 % 128;
        int i5 = i4 % 2;
        return boo;
    }

    public static void h(bk bkVar, JSONObject jSONObject) {
        int i = 2 % 2;
        Objects.requireNonNull(bkVar);
        bp bpVar = new bp(bkVar, 1, "https://meladeskapp.bisp.gov.pk/api/Roster/bZJVzTu9rHlQm0D", jSONObject, new bi(bkVar), new br(bkVar));
        z zVar = new z(130000, 0, 0.0f);
        int i2 = d;
        int i3 = i2 ^ 13;
        int i4 = ((i2 & 13) | i3) << 1;
        int i5 = -i3;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        e = i6 % 128;
        int i7 = i6 % 2;
        bpVar.m = zVar;
        bpVar.k = false;
        int i8 = d;
        int i9 = ((i8 | 43) << 1) - (i8 ^ 43);
        e = i9 % 128;
        int i10 = i9 % 2;
        a.b(bkVar.h).c(bpVar);
        int i11 = e;
        int i12 = ((i11 & 123) - (~(i11 | 123))) - 1;
        int i13 = i12 % 128;
        d = i13;
        int i14 = i12 % 2;
        int i15 = (i13 ^ 45) + ((i13 & 45) << 1);
        e = i15 % 128;
        int i16 = i15 % 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public void g(RecyclerView.o0O0O00 o0o0o00, @SuppressLint({"RecyclerView"}) int i) {
        String hhMemberNames;
        String gender;
        int i2 = 2 % 2;
        int i3 = e;
        int i4 = i3 | 105;
        int i5 = i4 << 1;
        int i6 = -((~(i3 & 105)) & i4);
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        d = i7 % 128;
        int i8 = i7 % 2;
        boO boo = (boO) o0o0o00;
        RosterItem rosterItem = this.f.get(i);
        String cnic = rosterItem.getCnic();
        int i9 = e;
        int i10 = ((i9 | 79) << 1) - (i9 ^ 79);
        d = i10 % 128;
        if (i10 % 2 != 0) {
            hhMemberNames = rosterItem.getHhMemberNames();
            gender = rosterItem.getGender();
            rosterItem.getDiscrepancy_status();
            rosterItem.getMessage();
            int i11 = 84 / 0;
        } else {
            hhMemberNames = rosterItem.getHhMemberNames();
            gender = rosterItem.getGender();
            rosterItem.getDiscrepancy_status();
            rosterItem.getMessage();
        }
        int i12 = d;
        int i13 = i12 & 75;
        int i14 = i13 + ((i12 ^ 75) | i13);
        e = i14 % 128;
        int i15 = i14 % 2;
        rosterItem.getRoster_message();
        TextView textView = boo.w;
        int iJ = j.j(cnic, 4, cnic.length());
        String strSubstring = cnic.substring(0, iJ);
        StringBuilder sb = new StringBuilder();
        int i16 = d;
        int i17 = i16 & 39;
        int i18 = (i16 ^ 39) | i17;
        int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
        e = i19 % 128;
        int i20 = i19 % 2;
        j.B(sb, strSubstring.replaceAll("[A-Za-z0-9]", "X"), cnic, iJ, textView);
        boo.x.setText(hhMemberNames);
        TextView textView2 = boo.u;
        int i21 = d;
        int i22 = (((i21 | 24) << 1) - (i21 ^ 24)) - 1;
        e = i22 % 128;
        int i23 = i22 % 2;
        textView2.setText(gender);
        boo.y.setVisibility(8);
        boo.y.setText("Select Family 2");
        boo.y.setOnClickListener(new bg(this, rosterItem));
        CardView cardView = boo.v;
        bh bhVar = new bh(this);
        int i24 = d;
        int i25 = ((i24 | 42) << 1) - (i24 ^ 42);
        int i26 = (i25 ^ (-1)) + (i25 << 1);
        e = i26 % 128;
        int i27 = i26 % 2;
        cardView.setOnClickListener(bhVar);
        int i28 = e;
        int i29 = i28 & 47;
        int i30 = ((i28 | 47) & (~i29)) + (i29 << 1);
        d = i30 % 128;
        if (i30 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
