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
import ivas.gov.bisp.enumeration.p022av.N;
import ivas.gov.bisp.enumeration.p022av.z;
import ivas.gov.bisp.enumeration.p023aw.a;
import ivas.gov.bisp.enumeration.p091n.j;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class bs extends RecyclerView.OooO<boY> {
    private static int d = 0;
    private static int e = 1;
    public final List<RosterItem> f;
    public SessionManager g;
    public final Activity h;

    public class boY extends RecyclerView.o0O0O00 {
        public TextView u;
        public CardView v;
        public TextView w;
        public TextView x;
        public TextView y;

        public boY(bs bsVar, View view) {
            super(view);
            this.v = (CardView) view.findViewById(R.id.cv_parent);
            this.w = (TextView) view.findViewById(R.id.tv_cnic);
            this.x = (TextView) view.findViewById(R.id.tv_name);
            this.u = (TextView) view.findViewById(R.id.tv_gender);
            this.y = (TextView) view.findViewById(R.id.btn_update);
        }
    }

    public bs(Activity activity, List<RosterItem> list) {
        this.h = activity;
        this.f = list;
        new ArrayList().addAll(list);
        this.g = new SessionManager(activity.getApplicationContext());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public int b() {
        int size;
        int i = 2 % 2;
        int i2 = d;
        int i3 = ((i2 | 99) << 1) - (i2 ^ 99);
        e = i3 % 128;
        if (i3 % 2 == 0) {
            size = this.f.size();
            int i4 = 6 / 0;
        } else {
            size = this.f.size();
        }
        int i5 = e + 41;
        d = i5 % 128;
        if (i5 % 2 == 0) {
            return size;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public RecyclerView.o0O0O00 f(ViewGroup viewGroup, int i) {
        int i2 = 2 % 2;
        boY boy = new boY(this, j.d(viewGroup, R.layout.layout_duplicate_roster_list_item, viewGroup, false));
        int i3 = d;
        int i4 = i3 ^ 55;
        int i5 = ((i3 & 55) | i4) << 1;
        int i6 = -i4;
        int i7 = (i5 & i6) + (i5 | i6);
        e = i7 % 128;
        if (i7 % 2 != 0) {
            return boy;
        }
        throw null;
    }

    public static void h(bs bsVar, JSONObject jSONObject) {
        int i = 2 % 2;
        Objects.requireNonNull(bsVar);
        be beVar = new be(bsVar, 1, "https://meladeskapp.bisp.gov.pk/api/Roster/bZJVzTu9rHlQm0D", jSONObject, new bc(bsVar), new bd(bsVar));
        z zVar = new z(130000, 0, 0.0f);
        int i2 = e;
        int i3 = i2 & 87;
        int i4 = ((i2 ^ 87) | i3) << 1;
        int i5 = -((i2 | 87) & (~i3));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        d = i6 % 128;
        int i7 = i6 % 2;
        beVar.m = zVar;
        beVar.k = false;
        N nB = a.b(bsVar.h);
        int i8 = e;
        int i9 = i8 ^ 99;
        int i10 = (i8 & 99) << 1;
        int i11 = (i9 & i10) + (i10 | i9);
        d = i11 % 128;
        int i12 = i11 % 2;
        nB.c(beVar);
        int i13 = e + 39;
        d = i13 % 128;
        int i14 = i13 % 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public void g(RecyclerView.o0O0O00 o0o0o00, @SuppressLint({"RecyclerView"}) int i) {
        int i2 = 2 % 2;
        int i3 = e;
        int i4 = ((i3 | 118) << 1) - (i3 ^ 118);
        int i5 = (i4 ^ (-1)) + (i4 << 1);
        d = i5 % 128;
        int i6 = i5 % 2;
        boY boy = (boY) o0o0o00;
        RosterItem rosterItem = this.f.get(i);
        String cnic = rosterItem.getCnic();
        int i7 = e;
        int i8 = ((i7 ^ 7) | (i7 & 7)) << 1;
        int i9 = -(((~i7) & 7) | (i7 & (-8)));
        int i10 = (i8 & i9) + (i9 | i8);
        d = i10 % 128;
        Object obj = null;
        if (i10 % 2 != 0) {
            rosterItem.getHhMemberNames();
            rosterItem.getGender();
            rosterItem.getDiscrepancy_status();
            rosterItem.getMessage();
            obj.hashCode();
            throw null;
        }
        String hhMemberNames = rosterItem.getHhMemberNames();
        String gender = rosterItem.getGender();
        rosterItem.getDiscrepancy_status();
        rosterItem.getMessage();
        int i11 = d;
        int i12 = i11 ^ 1;
        int i13 = ((i11 & 1) | i12) << 1;
        int i14 = -i12;
        int i15 = (i13 & i14) + (i13 | i14);
        e = i15 % 128;
        int i16 = i15 % 2;
        rosterItem.getRoster_message();
        TextView textView = boy.w;
        int iJ = j.j(cnic, 4, cnic.length());
        String strSubstring = cnic.substring(0, iJ);
        StringBuilder sb = new StringBuilder();
        int i17 = e + 43;
        d = i17 % 128;
        if (i17 % 2 != 0) {
            j.B(sb, strSubstring.replaceAll("[A-Za-z0-9]", "X"), cnic, iJ, textView);
            boy.x.setText(hhMemberNames);
            obj.hashCode();
            throw null;
        }
        j.B(sb, strSubstring.replaceAll("[A-Za-z0-9]", "X"), cnic, iJ, textView);
        boy.x.setText(hhMemberNames);
        boy.u.setText(gender);
        boy.y.setVisibility(8);
        boy.y.setOnClickListener(new bb(this, rosterItem));
        CardView cardView = boy.v;
        bq bqVar = new bq(this);
        int i18 = d;
        int i19 = i18 & 61;
        int i20 = ((((i18 ^ 61) | i19) << 1) - (~(-((i18 | 61) & (~i19))))) - 1;
        e = i20 % 128;
        int i21 = i20 % 2;
        cardView.setOnClickListener(bqVar);
        int i22 = d;
        int i23 = i22 & 11;
        int i24 = ((i22 ^ 11) | i23) << 1;
        int i25 = -((i22 | 11) & (~i23));
        int i26 = (i24 & i25) + (i25 | i24);
        e = i26 % 128;
        if (i26 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
