package ivas.gov.bisp.enumeration.adapters;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import ivas.gov.bisp.enumeration.BISPApplication;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.V.u;
import ivas.gov.bisp.enumeration.adapters.AdapterRosterList;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.models.Roster;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.util.List;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class AdapterRosterList extends RecyclerView.OooO<ViewHolder> {
    private static int d = 0;
    private static int e = 1;
    public List<Roster> f;
    public SessionManager g;
    public OooO00o h;

    public interface OooO00o {
        void onDeleteClick(int i);

        void onEditClick(int i, String str);

        void onVerifyClick(int i, String str);
    }

    public class ViewHolder extends RecyclerView.o0O0O00 {

        @BindView
        public ImageView imageViewDelete;

        @BindView
        public ImageView imageViewEdit;

        @BindView
        public TextView personCNIC;

        @BindView
        public TextView personName;

        @BindView
        public TextView personRelationWithHouseHold;

        @BindView
        public CardView rosterItemCardView;

        @BindView
        public TextView roster_relational_id;

        @BindView
        public TextView roster_status;

        @BindView
        public Button verifyButton;

        public ViewHolder(AdapterRosterList adapterRosterList, View view) {
            super(view);
            ButterKnife.c(this, view);
        }
    }

    public class ViewHolder_ViewBinding implements Unbinder {
        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            viewHolder.roster_relational_id = (TextView) u.b(u.c(view, R.id.tv_roster_relational_id, "field 'roster_relational_id'"), R.id.tv_roster_relational_id, "field 'roster_relational_id'", TextView.class);
            viewHolder.personName = (TextView) u.b(u.c(view, R.id.person_name, "field 'personName'"), R.id.person_name, "field 'personName'", TextView.class);
            viewHolder.personRelationWithHouseHold = (TextView) u.b(u.c(view, R.id.person_relation_to_household, "field 'personRelationWithHouseHold'"), R.id.person_relation_to_household, "field 'personRelationWithHouseHold'", TextView.class);
            viewHolder.personCNIC = (TextView) u.b(u.c(view, R.id.person_cnic, "field 'personCNIC'"), R.id.person_cnic, "field 'personCNIC'", TextView.class);
            viewHolder.imageViewEdit = (ImageView) u.b(u.c(view, R.id.iv_edit, "field 'imageViewEdit'"), R.id.iv_edit, "field 'imageViewEdit'", ImageView.class);
            viewHolder.imageViewDelete = (ImageView) u.b(u.c(view, R.id.iv_delete, "field 'imageViewDelete'"), R.id.iv_delete, "field 'imageViewDelete'", ImageView.class);
            viewHolder.roster_status = (TextView) u.b(u.c(view, R.id.roster_status, "field 'roster_status'"), R.id.roster_status, "field 'roster_status'", TextView.class);
            viewHolder.verifyButton = (Button) u.b(u.c(view, R.id.verify_button, "field 'verifyButton'"), R.id.verify_button, "field 'verifyButton'", Button.class);
            viewHolder.rosterItemCardView = (CardView) u.b(u.c(view, R.id.roster_item_cardView, "field 'rosterItemCardView'"), R.id.roster_item_cardView, "field 'rosterItemCardView'", CardView.class);
        }
    }

    public AdapterRosterList(List<Roster> list, SessionManager sessionManager, OooO00o oooO00o) {
        this.f = list;
        this.h = oooO00o;
        this.g = sessionManager;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public RecyclerView.o0O0O00 f(ViewGroup viewGroup, int i) {
        int i2 = 2 % 2;
        ViewHolder viewHolder = new ViewHolder(this, ivas.gov.bisp.enumeration.p091n.j.d(viewGroup, R.layout.activity_item, viewGroup, false));
        int i3 = e;
        int i4 = (((i3 ^ 3) | (i3 & 3)) << 1) - (((~i3) & 3) | (i3 & (-4)));
        d = i4 % 128;
        int i5 = i4 % 2;
        return viewHolder;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public int b() {
        int i = 2 % 2;
        int i2 = e;
        int i3 = i2 & 63;
        int i4 = (i2 | 63) & (~i3);
        int i5 = i3 << 1;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        int i7 = i6 % 128;
        d = i7;
        int i8 = i6 % 2;
        List<Roster> list = this.f;
        Object obj = null;
        if (list == null) {
            int i9 = (-2) - (((i7 ^ 34) + ((i7 & 34) << 1)) ^ (-1));
            e = i9 % 128;
            if (i9 % 2 != 0) {
                return 0;
            }
            obj.hashCode();
            throw null;
        }
        int i10 = ((i7 & 86) + (i7 | 86)) - 1;
        e = i10 % 128;
        if (i10 % 2 == 0) {
            list.size();
            obj.hashCode();
            throw null;
        }
        int size = list.size();
        int i11 = e + 75;
        d = i11 % 128;
        int i12 = i11 % 2;
        return size;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public void g(RecyclerView.o0O0O00 o0o0o00, final int i) {
        int i2;
        String string;
        int i3 = 2 % 2;
        int i4 = d;
        final int i5 = 1;
        int i6 = ((i4 ^ 80) + ((i4 & 80) << 1)) - 1;
        e = i6 % 128;
        Object obj = null;
        if (i6 % 2 == 0) {
            TextView textView = ((ViewHolder) o0o0o00).personName;
            this.f.get(i);
            throw null;
        }
        ViewHolder viewHolder = (ViewHolder) o0o0o00;
        TextView textView2 = viewHolder.personName;
        Roster roster = this.f.get(i);
        int i7 = d;
        int i8 = ((i7 & (-22)) | ((~i7) & 21)) + ((i7 & 21) << 1);
        e = i8 % 128;
        if (i8 % 2 == 0) {
            textView2.setText(roster.cnic_valid_name);
            this.f.get(i);
            obj.hashCode();
            throw null;
        }
        textView2.setText(roster.cnic_valid_name);
        final int i9 = 0;
        if (this.f.get(i).chronic_disease == 0) {
            int i10 = d;
            int i11 = (i10 ^ 55) + ((i10 & 55) << 1);
            e = i11 % 128;
            if (i11 % 2 == 0) {
                viewHolder.roster_status.setVisibility(1);
            } else {
                viewHolder.roster_status.setVisibility(0);
            }
            int i12 = d;
            int i13 = ((i12 | 124) << 1) - (i12 ^ 124);
            int i14 = (i13 ^ (-1)) + (i13 << 1);
            e = i14 % 128;
            int i15 = i14 % 2;
        } else {
            viewHolder.roster_status.setVisibility(8);
            int i16 = e;
            int i17 = i16 & 3;
            int i18 = -(-((i16 ^ 3) | i17));
            int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
            d = i19 % 128;
            int i20 = i19 % 2;
        }
        ImageView imageView = viewHolder.imageViewDelete;
        Roster roster2 = this.f.get(i);
        int i21 = e;
        int i22 = i21 ^ 85;
        int i23 = ((((i21 & 85) | i22) << 1) - (~(-i22))) - 1;
        d = i23 % 128;
        int i24 = i23 % 2;
        if (roster2.relation_to_household_id != 186) {
            int i25 = e;
            int i26 = ((i25 ^ 41) | (i25 & 41)) << 1;
            int i27 = -(((~i25) & 41) | (i25 & (-42)));
            int i28 = (i26 & i27) + (i27 | i26);
            int i29 = i28 % 128;
            d = i29;
            i2 = i28 % 2 != 0 ? 1 : 0;
            int i30 = i29 & 59;
            int i31 = (i29 | 59) & (~i30);
            int i32 = i30 << 1;
            int i33 = (i31 & i32) + (i31 | i32);
            e = i33 % 128;
            int i34 = i33 % 2;
        } else {
            int i35 = d;
            int i36 = ((i35 | 11) << 1) - (i35 ^ 11);
            e = i36 % 128;
            int i37 = i36 % 2;
            i2 = 4;
        }
        imageView.setVisibility(i2);
        TextView textView3 = viewHolder.personRelationWithHouseHold;
        Roster roster3 = this.f.get(i);
        int i38 = d;
        int i39 = (i38 | 19) << 1;
        int i40 = -(i38 ^ 19);
        int i41 = (i39 & i40) + (i40 | i39);
        e = i41 % 128;
        if (i41 % 2 == 0) {
            textView3.setText(roster3.relation_to_household_name);
            this.f.get(i);
            throw null;
        }
        textView3.setText(roster3.relation_to_household_name);
        Roster roster4 = this.f.get(i);
        int i42 = e;
        int i43 = i42 ^ 107;
        int i44 = (i42 & 107) << 1;
        int i45 = (i43 & i44) + (i44 | i43);
        d = i45 % 128;
        int i46 = i45 % 2;
        if (roster4.cnic.equals(BuildConfig.FLAVOR)) {
            int i47 = d;
            int i48 = i47 & 59;
            int i49 = -(-((i47 ^ 59) | i48));
            int i50 = (i48 & i49) + (i49 | i48);
            e = i50 % 128;
            int i51 = i50 % 2;
            if (this.f.get(i).cnicOption == 0) {
                int i52 = d;
                int i53 = i52 & 109;
                int i54 = (i52 ^ 109) | i53;
                int i55 = (i53 & i54) + (i54 | i53);
                e = i55 % 128;
                int i56 = i55 % 2;
                viewHolder.personCNIC.setText("CNIC not obtained");
                int i57 = e + 109;
                d = i57 % 128;
                int i58 = i57 % 2;
            } else {
                int i59 = this.f.get(i).cnicOption;
                int i60 = e;
                int i61 = i60 & 111;
                int i62 = (i61 - (~((i60 ^ 111) | i61))) - 1;
                int i63 = i62 % 128;
                d = i63;
                if (i62 % 2 == 0 ? i59 != 1 : i59 != 0) {
                    viewHolder.personCNIC.setText("No CNIC (Age < 18)");
                    int i64 = d;
                    int i65 = ((i64 | 94) << 1) - (i64 ^ 94);
                    int i66 = (i65 ^ (-1)) + (i65 << 1);
                    e = i66 % 128;
                    int i67 = i66 % 2;
                } else {
                    int i68 = i63 & 95;
                    int i69 = i63 | 95;
                    int i70 = ((i68 | i69) << 1) - (i68 ^ i69);
                    e = i70 % 128;
                    int i71 = i70 % 2;
                    viewHolder.personCNIC.setText("CNIC Lost/Stolen");
                    int i72 = e;
                    int i73 = ((i72 ^ 119) | (i72 & 119)) << 1;
                    int i74 = -(((~i72) & 119) | (i72 & (-120)));
                    int i75 = (i73 ^ i74) + ((i74 & i73) << 1);
                    d = i75 % 128;
                    int i76 = i75 % 2;
                }
            }
        } else {
            TextView textView4 = viewHolder.personCNIC;
            Roster roster5 = this.f.get(i);
            int i77 = d;
            int i78 = ((i77 | 3) << 1) - (i77 ^ 3);
            e = i78 % 128;
            int i79 = i78 % 2;
            textView4.setText(ag.b(roster5.cnic));
            int i80 = d;
            int i81 = i80 & 25;
            int i82 = (i80 ^ 25) | i81;
            int i83 = (i81 & i82) + (i82 | i81);
            e = i83 % 128;
            if (i83 % 2 == 0) {
                int i84 = 2 % 3;
            }
        }
        if (!this.f.get(i).isValidatedFromNadra()) {
            viewHolder.verifyButton.setBackgroundResource(R.drawable.btn_selector_roster);
            Button button = viewHolder.verifyButton;
            int i85 = d;
            int i86 = i85 ^ 67;
            int i87 = -(-((i85 & 67) << 1));
            int i88 = (i86 ^ i87) + ((i87 & i86) << 1);
            e = i88 % 128;
            int i89 = i88 % 2;
            button.setText("Verify");
            int i90 = e;
            int i91 = ((i90 & (-76)) | ((~i90) & 75)) + ((i90 & 75) << 1);
            d = i91 % 128;
            int i92 = i91 % 2;
        } else {
            int i93 = d + 65;
            e = i93 % 128;
            if (i93 % 2 == 0) {
                viewHolder.verifyButton.setBackgroundResource(R.drawable.btn_selector);
                Button button2 = viewHolder.verifyButton;
                obj.hashCode();
                throw null;
            }
            viewHolder.verifyButton.setBackgroundResource(R.drawable.btn_selector);
            Button button3 = viewHolder.verifyButton;
            int i94 = d;
            int i95 = i94 & 123;
            int i96 = (((i94 ^ 123) | i95) << 1) - ((i94 | 123) & (~i95));
            e = i96 % 128;
            int i97 = i96 % 2;
            button3.setText("Verified");
            int i98 = d;
            int i99 = i98 & 1;
            int i100 = -(-(i98 | 1));
            int i101 = (i99 ^ i100) + ((i100 & i99) << 1);
            e = i101 % 128;
            int i102 = i101 % 2;
        }
        TextView textView5 = viewHolder.roster_relational_id;
        StringBuilder sb = new StringBuilder();
        int i103 = d;
        int i104 = (((i103 | 124) << 1) - (i103 ^ 124)) - 1;
        e = i104 % 128;
        if (i104 % 2 == 0) {
            sb.append(i - 1);
            string = sb.toString();
        } else {
            int i105 = i & 1;
            int i106 = i | 1;
            sb.append((i105 & i106) + (i105 | i106));
            string = sb.toString();
        }
        textView5.setText(string);
        viewHolder.verifyButton.setOnClickListener(new View.OnClickListener(this) { // from class: ivas.gov.bisp.enumeration.bx.J
            private static int a = 1;
            private static int b;
            public final /* synthetic */ AdapterRosterList d;

            {
                this.d = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i107 = 2 % 2;
                int i108 = a;
                int i109 = (((i108 | 69) << 1) - (~(-(i108 ^ 69)))) - 1;
                b = i109 % 128;
                int i110 = i109 % 2;
                if (i9 != 0) {
                    int i111 = (((i108 | 12) << 1) - (i108 ^ 12)) - 1;
                    b = i111 % 128;
                    int i112 = i111 % 2;
                    int i113 = i108 + 67;
                    b = i113 % 128;
                    int i114 = i113 % 2;
                    AdapterRosterList adapterRosterList = this.d;
                    int i115 = i;
                    AdapterRosterList.OooO00o oooO00o = adapterRosterList.h;
                    int i116 = b;
                    int i117 = (-2) - (((i116 & 50) + (i116 | 50)) ^ (-1));
                    a = i117 % 128;
                    int i118 = i117 % 2;
                    oooO00o.onDeleteClick(i115);
                    int i119 = a;
                    int i120 = (i119 ^ 87) + ((i119 & 87) << 1);
                    b = i120 % 128;
                    int i121 = i120 % 2;
                    return;
                }
                AdapterRosterList adapterRosterList2 = this.d;
                int i122 = i;
                int i123 = i108 + 49;
                b = i123 % 128;
                int i124 = i123 % 2;
                AdapterRosterList.OooO00o oooO00o2 = adapterRosterList2.h;
                Roster roster6 = adapterRosterList2.f.get(i122);
                int i125 = a;
                int i126 = (i125 ^ 29) + ((i125 & 29) << 1);
                b = i126 % 128;
                int i127 = i126 % 2;
                String strReplace = roster6.getCnic().replace("-", BuildConfig.FLAVOR);
                int i128 = b;
                int i129 = (i128 & 25) + (i128 | 25);
                a = i129 % 128;
                int i130 = i129 % 2;
                oooO00o2.onVerifyClick(i122, strReplace);
                if (i130 != 0) {
                    return;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        });
        viewHolder.imageViewEdit.setOnClickListener(new ivas.gov.bisp.enumeration.p051bx.u(this, i, 2));
        ImageView imageView2 = viewHolder.imageViewDelete;
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: ivas.gov.bisp.enumeration.bx.J
            private static int a = 1;
            private static int b;
            public final /* synthetic */ AdapterRosterList d;

            {
                this.d = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i107 = 2 % 2;
                int i108 = a;
                int i109 = (((i108 | 69) << 1) - (~(-(i108 ^ 69)))) - 1;
                b = i109 % 128;
                int i110 = i109 % 2;
                if (i5 != 0) {
                    int i111 = (((i108 | 12) << 1) - (i108 ^ 12)) - 1;
                    b = i111 % 128;
                    int i112 = i111 % 2;
                    int i113 = i108 + 67;
                    b = i113 % 128;
                    int i114 = i113 % 2;
                    AdapterRosterList adapterRosterList = this.d;
                    int i115 = i;
                    AdapterRosterList.OooO00o oooO00o = adapterRosterList.h;
                    int i116 = b;
                    int i117 = (-2) - (((i116 & 50) + (i116 | 50)) ^ (-1));
                    a = i117 % 128;
                    int i118 = i117 % 2;
                    oooO00o.onDeleteClick(i115);
                    int i119 = a;
                    int i120 = (i119 ^ 87) + ((i119 & 87) << 1);
                    b = i120 % 128;
                    int i121 = i120 % 2;
                    return;
                }
                AdapterRosterList adapterRosterList2 = this.d;
                int i122 = i;
                int i123 = i108 + 49;
                b = i123 % 128;
                int i124 = i123 % 2;
                AdapterRosterList.OooO00o oooO00o2 = adapterRosterList2.h;
                Roster roster6 = adapterRosterList2.f.get(i122);
                int i125 = a;
                int i126 = (i125 ^ 29) + ((i125 & 29) << 1);
                b = i126 % 128;
                int i127 = i126 % 2;
                String strReplace = roster6.getCnic().replace("-", BuildConfig.FLAVOR);
                int i128 = b;
                int i129 = (i128 & 25) + (i128 | 25);
                a = i129 % 128;
                int i130 = i129 % 2;
                oooO00o2.onVerifyClick(i122, strReplace);
                if (i130 != 0) {
                    return;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        };
        int i107 = e;
        int i108 = (i107 & 30) + (i107 | 30);
        int i109 = (i108 ^ (-1)) + (i108 << 1);
        d = i109 % 128;
        if (i109 % 2 != 0) {
            imageView2.setOnClickListener(onClickListener);
            this.g.l().intValue();
            obj.hashCode();
            throw null;
        }
        imageView2.setOnClickListener(onClickListener);
        int iIntValue = this.g.l().intValue();
        int i110 = d;
        int i111 = (((i110 ^ 119) | (i110 & 119)) << 1) - (((~i110) & 119) | (i110 & (-120)));
        e = i111 % 128;
        if (i111 % 2 != 0 ? iIntValue != 2 : iIntValue != 4) {
            if (this.g.l().intValue() != 3) {
                int i112 = e;
                int i113 = ((i112 ^ 115) | (i112 & 115)) << 1;
                int i114 = -(((~i112) & 115) | (i112 & (-116)));
                int i115 = ((i113 | i114) << 1) - (i114 ^ i113);
                d = i115 % 128;
                int i116 = i115 % 2;
                viewHolder.verifyButton.setVisibility(0);
                int i117 = d;
                int i118 = i117 & 99;
                int i119 = -(-(i117 | 99));
                int i120 = ((i118 | i119) << 1) - (i119 ^ i118);
                e = i120 % 128;
                int i121 = i120 % 2;
                return;
            }
        }
        if (BISPApplication.c().g) {
            viewHolder.verifyButton.setVisibility(0);
            int i122 = e + 95;
            d = i122 % 128;
            int i123 = i122 % 2;
            return;
        }
        viewHolder.verifyButton.setVisibility(8);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1, 5.0f);
        int i124 = e;
        int i125 = ((i124 | 73) << 1) - (i124 ^ 73);
        d = i125 % 128;
        if (i125 % 2 == 0) {
            viewHolder.rosterItemCardView.setLayoutParams(layoutParams);
        } else {
            viewHolder.rosterItemCardView.setLayoutParams(layoutParams);
            throw null;
        }
    }

    public void h(List<Roster> list) {
        int i = 2 % 2;
        int i2 = d;
        int i3 = ((i2 & 117) - (~(i2 | 117))) - 1;
        e = i3 % 128;
        int i4 = i3 % 2;
        this.f = list;
        this.a.c();
        int i5 = d + 96;
        int i6 = (i5 ^ (-1)) + (i5 << 1);
        e = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
