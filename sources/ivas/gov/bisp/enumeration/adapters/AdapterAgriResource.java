package ivas.gov.bisp.enumeration.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.V.u;
import ivas.gov.bisp.enumeration.models.AgriResource;
import ivas.gov.bisp.enumeration.p051bx.a;
import ivas.gov.bisp.enumeration.p051bx.l;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class AdapterAgriResource extends RecyclerView.OooO<ViewHolder> {
    private static int d = 1;
    private static int e;
    public List<AgriResource> f;
    public boolean g;
    public ivas.gov.bisp.enumeration.X.i h;
    public Context i;

    public class ViewHolder extends RecyclerView.o0O0O00 {

        @BindView
        public CheckBox checkBoxSelected;

        @BindView
        public Spinner spinnerOwner;

        public ViewHolder(AdapterAgriResource adapterAgriResource, View view) {
            super(view);
            ButterKnife.c(this, view);
        }
    }

    public class ViewHolder_ViewBinding implements Unbinder {
        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            viewHolder.checkBoxSelected = (CheckBox) u.b(u.c(view, R.id.cb_selected, "field 'checkBoxSelected'"), R.id.cb_selected, "field 'checkBoxSelected'", CheckBox.class);
            viewHolder.spinnerOwner = (Spinner) u.b(u.c(view, R.id.sp_owner, "field 'spinnerOwner'"), R.id.sp_owner, "field 'spinnerOwner'", Spinner.class);
        }
    }

    public AdapterAgriResource(Context context, List<AgriResource> list, ivas.gov.bisp.enumeration.X.i iVar, boolean z) {
        this.f = list;
        this.i = context;
        this.g = z;
        this.h = iVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public int b() {
        int i = 2 % 2;
        int i2 = e;
        int i3 = i2 ^ 119;
        int i4 = (((i2 & 119) | i3) << 1) - i3;
        d = i4 % 128;
        int i5 = i4 % 2;
        List<AgriResource> list = this.f;
        if (i5 != 0) {
            return list.size();
        }
        list.size();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public RecyclerView.o0O0O00 f(ViewGroup viewGroup, int i) {
        int i2 = 2 % 2;
        ViewHolder viewHolder = new ViewHolder(this, ivas.gov.bisp.enumeration.p091n.j.d(viewGroup, R.layout.row_agri_resource, viewGroup, false));
        int i3 = d + 89;
        e = i3 % 128;
        if (i3 % 2 == 0) {
            return viewHolder;
        }
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public void g(RecyclerView.o0O0O00 o0o0o00, int i) {
        AgriResource agriResource;
        CheckBox checkBox;
        boolean z;
        Resources resources;
        Spinner spinner;
        int i2;
        int i3 = 2 % 2;
        int i4 = d + 89;
        e = i4 % 128;
        int i5 = i4 % 2;
        ViewHolder viewHolder = (ViewHolder) o0o0o00;
        AgriResource agriResource2 = this.f.get(i);
        int i6 = e;
        int i7 = (i6 & 101) + (i6 | 101);
        d = i7 % 128;
        int i8 = 0;
        if (i7 % 2 == 0) {
            agriResource = agriResource2;
            checkBox = viewHolder.checkBoxSelected;
            int i9 = 98 / 0;
        } else {
            agriResource = agriResource2;
            checkBox = viewHolder.checkBoxSelected;
        }
        int i10 = d + 115;
        e = i10 % 128;
        int i11 = i10 % 2;
        checkBox.setText(agriResource.getName());
        CheckBox checkBox2 = viewHolder.checkBoxSelected;
        int i12 = d;
        int i13 = i12 & 103;
        int i14 = (((i12 | 103) & (~i13)) - (~(i13 << 1))) - 1;
        e = i14 % 128;
        int i15 = i14 % 2;
        if (agriResource.getIsSelected() == 1) {
            int i16 = e;
            int i17 = ((i16 | 87) << 1) - ((i16 & (-88)) | ((~i16) & 87));
            d = i17 % 128;
            int i18 = i17 % 2;
            int i19 = (i16 ^ 77) + ((i16 & 77) << 1);
            d = i19 % 128;
            int i20 = i19 % 2;
            z = true;
        } else {
            int i21 = e + 37;
            d = i21 % 128;
            int i22 = i21 % 2;
            z = false;
        }
        checkBox2.setChecked(z);
        if (!this.g) {
            viewHolder.checkBoxSelected.setOnCheckedChangeListener(new a(agriResource, 0));
            int i23 = e;
            int i24 = (((i23 | 80) << 1) - (i23 ^ 80)) - 1;
            d = i24 % 128;
            int i25 = i24 % 2;
            return;
        }
        ArrayList arrayList = new ArrayList();
        Resources resources2 = this.i.getResources();
        int i26 = e;
        int i27 = i26 & 103;
        int i28 = -(-((i26 ^ 103) | i27));
        int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
        d = i29 % 128;
        if (i29 % 2 == 0) {
            arrayList.add(resources2.getString(R.string.ownership_type));
            resources = this.i.getResources();
            int i30 = 55 / 0;
        } else {
            arrayList.add(resources2.getString(R.string.ownership_type));
            resources = this.i.getResources();
        }
        arrayList.add(resources.getString(R.string.ownership_type1));
        Resources resources3 = this.i.getResources();
        int i31 = e + 13;
        d = i31 % 128;
        if (i31 % 2 == 0) {
            arrayList.add(resources3.getString(R.string.ownership_type2));
            this.i.getResources();
            throw null;
        }
        arrayList.add(resources3.getString(R.string.ownership_type2));
        arrayList.add(this.i.getResources().getString(R.string.ownership_type3));
        ArrayAdapter arrayAdapter = new ArrayAdapter(this.i, R.layout.spinner_item, arrayList);
        int i32 = d;
        int i33 = i32 ^ 125;
        int i34 = -(-((i32 & 125) << 1));
        int i35 = (i33 & i34) + (i34 | i33);
        e = i35 % 128;
        if (i35 % 2 != 0) {
            viewHolder.spinnerOwner.setAdapter((SpinnerAdapter) arrayAdapter);
            spinner = viewHolder.spinnerOwner;
            int i36 = 79 / 0;
        } else {
            viewHolder.spinnerOwner.setAdapter((SpinnerAdapter) arrayAdapter);
            spinner = viewHolder.spinnerOwner;
        }
        spinner.setSelection(agriResource.getResourceOwnerPosition());
        Spinner spinner2 = viewHolder.spinnerOwner;
        int isSelected = agriResource.getIsSelected();
        int i37 = e + 19;
        int i38 = i37 % 128;
        d = i38;
        int i39 = i37 % 2;
        if (isSelected == 1) {
            int i40 = i38 & 101;
            int i41 = (i38 ^ 101) | i40;
            int i42 = (i40 ^ i41) + ((i40 & i41) << 1);
            e = i42 % 128;
            int i43 = i42 % 2;
            i2 = 0;
        } else {
            int i44 = i38 & 97;
            int i45 = i44 + ((i38 ^ 97) | i44);
            e = i45 % 128;
            int i46 = i45 % 2;
            i2 = 8;
        }
        spinner2.setVisibility(i2);
        viewHolder.checkBoxSelected.setOnClickListener(new l(this, i, i8));
        Spinner spinner3 = viewHolder.spinnerOwner;
        e eVar = new e(this, i);
        int i47 = e;
        int i48 = (i47 ^ 83) + ((i47 & 83) << 1);
        d = i48 % 128;
        if (i48 % 2 != 0) {
            spinner3.setOnItemSelectedListener(eVar);
        } else {
            spinner3.setOnItemSelectedListener(eVar);
            throw null;
        }
    }
}
