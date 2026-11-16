package ivas.gov.bisp.enumeration.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.V.u;
import ivas.gov.bisp.enumeration.models.AgriMember;
import ivas.gov.bisp.enumeration.p086i.l;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class AdapterAgriMember extends RecyclerView.OooO<ViewHolder> {
    private static int d = 0;
    private static int e = 1;
    public ArrayList<AgriMember> f;
    public Context g;
    public OooO00o h;

    public interface OooO00o {
        void onCheckBoxClick(int i);

        void onDetailButtonClick(int i);
    }

    public class ViewHolder extends RecyclerView.o0O0O00 {

        @BindView
        public Button buttonAddDetail;

        @BindView
        public CheckBox checkBoxSelected;

        public ViewHolder(AdapterAgriMember adapterAgriMember, View view) {
            super(view);
            ButterKnife.c(this, view);
        }
    }

    public class ViewHolder_ViewBinding implements Unbinder {
        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            viewHolder.checkBoxSelected = (CheckBox) u.b(u.c(view, R.id.cb_selected, "field 'checkBoxSelected'"), R.id.cb_selected, "field 'checkBoxSelected'", CheckBox.class);
            viewHolder.buttonAddDetail = (Button) u.b(u.c(view, R.id.btn_add_detail, "field 'buttonAddDetail'"), R.id.btn_add_detail, "field 'buttonAddDetail'", Button.class);
        }
    }

    public AdapterAgriMember(Context context, ArrayList<AgriMember> arrayList, OooO00o oooO00o) {
        this.f = arrayList;
        this.g = context;
        this.h = oooO00o;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public int b() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 & 87;
        int i4 = i3 + ((i2 ^ 87) | i3);
        e = i4 % 128;
        int i5 = i4 % 2;
        int size = this.f.size();
        int i6 = d;
        int i7 = i6 & 31;
        int i8 = i7 + ((i6 ^ 31) | i7);
        e = i8 % 128;
        if (i8 % 2 != 0) {
            return size;
        }
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public RecyclerView.o0O0O00 f(ViewGroup viewGroup, int i) {
        int i2 = 2 % 2;
        ViewHolder viewHolder = new ViewHolder(this, ivas.gov.bisp.enumeration.p091n.j.d(viewGroup, R.layout.row_agri_member, viewGroup, false));
        int i3 = d;
        int i4 = ((i3 ^ 91) | (i3 & 91)) << 1;
        int i5 = -(((~i3) & 91) | (i3 & (-92)));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        e = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 84 / 0;
        }
        return viewHolder;
    }

    public void h(ArrayList<AgriMember> arrayList) {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 & 123;
        int i4 = (i2 ^ 123) | i3;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        e = i5 % 128;
        if (i5 % 2 == 0) {
            this.f = arrayList;
            this.a.c();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.f = arrayList;
        this.a.c();
        int i6 = d;
        int i7 = i6 & 79;
        int i8 = i6 | 79;
        int i9 = (i7 & i8) + (i8 | i7);
        e = i9 % 128;
        int i10 = i9 % 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public void g(RecyclerView.o0O0O00 o0o0o00, int i) {
        ViewHolder viewHolder;
        AgriMember agriMember;
        boolean z;
        Context context;
        int i2;
        int i3 = 2 % 2;
        int i4 = d;
        int i5 = (i4 ^ 101) + ((i4 & 101) << 1);
        e = i5 % 128;
        int i6 = 0;
        if (i5 % 2 == 0) {
            viewHolder = (ViewHolder) o0o0o00;
            agriMember = this.f.get(i);
            int i7 = 28 / 0;
        } else {
            viewHolder = (ViewHolder) o0o0o00;
            agriMember = this.f.get(i);
        }
        int i8 = e;
        int i9 = i8 & 109;
        int i10 = (i8 | 109) & (~i9);
        int i11 = -(-(i9 << 1));
        int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
        d = i12 % 128;
        int i13 = i12 % 2;
        AgriMember agriMember2 = agriMember;
        CheckBox checkBox = viewHolder.checkBoxSelected;
        String name = agriMember2.getName();
        int i14 = e;
        int i15 = ((i14 | 15) << 1) - (i14 ^ 15);
        d = i15 % 128;
        Object obj = null;
        if (i15 % 2 != 0) {
            checkBox.setText(name);
            CheckBox checkBox2 = viewHolder.checkBoxSelected;
            agriMember2.getIsSelected();
            throw null;
        }
        checkBox.setText(name);
        CheckBox checkBox3 = viewHolder.checkBoxSelected;
        if (agriMember2.getIsSelected() == 1) {
            int i16 = e;
            int i17 = i16 & 31;
            int i18 = i17 + ((i16 ^ 31) | i17);
            int i19 = i18 % 128;
            d = i19;
            int i20 = i18 % 2;
            int i21 = i19 + 73;
            e = i21 % 128;
            if (i21 % 2 == 0) {
                int i22 = 3 % 2;
            }
            z = true;
        } else {
            int i23 = d;
            int i24 = i23 ^ 111;
            int i25 = ((i23 & 111) | i24) << 1;
            int i26 = -i24;
            int i27 = (i25 ^ i26) + ((i25 & i26) << 1);
            e = i27 % 128;
            int i28 = i27 % 2;
            z = false;
        }
        checkBox3.setChecked(z);
        Button button = viewHolder.buttonAddDetail;
        int i29 = e;
        int i30 = i29 & 93;
        int i31 = ((i29 | 93) & (~i30)) + (i30 << 1);
        d = i31 % 128;
        if (i31 % 2 == 0 ? agriMember2.getIsSelected() != 1 : agriMember2.getIsSelected() != 1) {
            int i32 = d;
            int i33 = (i32 ^ 48) + ((i32 & 48) << 1);
            int i34 = (i33 ^ (-1)) + (i33 << 1);
            e = i34 % 128;
            int i35 = i34 % 2;
            i6 = 8;
        }
        button.setVisibility(i6);
        Button button2 = viewHolder.buttonAddDetail;
        int i36 = e;
        int i37 = i36 & 83;
        int i38 = (((i36 ^ 83) | i37) << 1) - ((i36 | 83) & (~i37));
        d = i38 % 128;
        if (i38 % 2 == 0 ? agriMember2.getIsDetailAdded() != 1 : agriMember2.getIsDetailAdded() != 0) {
            context = this.g;
            int i39 = e;
            int i40 = ((i39 ^ 13) | (i39 & 13)) << 1;
            int i41 = -(((~i39) & 13) | (i39 & (-14)));
            int i42 = (i40 & i41) + (i41 | i40);
            d = i42 % 128;
            int i43 = i42 % 2;
            i2 = R.color.colorButtonRed;
        } else {
            int i44 = e;
            int i45 = i44 & 73;
            int i46 = -(-((i44 ^ 73) | i45));
            int i47 = (i45 ^ i46) + ((i45 & i46) << 1);
            d = i47 % 128;
            if (i47 % 2 != 0) {
                throw null;
            }
            context = this.g;
            int i48 = (i44 & (-10)) | ((~i44) & 9);
            int i49 = (i44 & 9) << 1;
            int i50 = (i48 ^ i49) + ((i49 & i48) << 1);
            d = i50 % 128;
            int i51 = i50 % 2;
            i2 = R.color.colorButtonGreen;
        }
        Object obj2 = l.c;
        button2.setBackgroundColor(l.aUI.b(context, i2));
        viewHolder.checkBoxSelected.setOnClickListener(new h(this, i));
        viewHolder.buttonAddDetail.setOnClickListener(new r(this, i));
        int i52 = d;
        int i53 = ((i52 & (-102)) | ((~i52) & 101)) + ((i52 & 101) << 1);
        e = i53 % 128;
        if (i53 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
