package ivas.gov.bisp.enumeration.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.V.u;
import ivas.gov.bisp.enumeration.models.Crop;
import java.util.ArrayList;
import java.util.List;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class AdapterAgriCrop extends RecyclerView.OooO<ViewHolder> {
    private static int d = 1;
    private static int e;
    public List<Crop> f;
    public Context g;
    public ivas.gov.bisp.enumeration.X.i h;
    public ArrayList<String> i;

    public class ViewHolder extends RecyclerView.o0O0O00 {

        @BindView
        public CheckBox checkBoxSelected;

        @BindView
        public EditText editTextNumber;

        @BindView
        public LinearLayout linearLayoutDetail;

        @BindView
        public Spinner spinnerUnit;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.c(this, view);
        }
    }

    public class ViewHolder_ViewBinding implements Unbinder {
        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            viewHolder.checkBoxSelected = (CheckBox) u.b(u.c(view, R.id.cb_selected, "field 'checkBoxSelected'"), R.id.cb_selected, "field 'checkBoxSelected'", CheckBox.class);
            viewHolder.spinnerUnit = (Spinner) u.b(u.c(view, R.id.sp_unit, "field 'spinnerUnit'"), R.id.sp_unit, "field 'spinnerUnit'", Spinner.class);
            viewHolder.editTextNumber = (EditText) u.b(u.c(view, R.id.et_number, "field 'editTextNumber'"), R.id.et_number, "field 'editTextNumber'", EditText.class);
            viewHolder.linearLayoutDetail = (LinearLayout) u.b(u.c(view, R.id.ll_land_detail, "field 'linearLayoutDetail'"), R.id.ll_land_detail, "field 'linearLayoutDetail'", LinearLayout.class);
        }
    }

    public AdapterAgriCrop(Context context, List<Crop> list, ArrayList<String> arrayList, ivas.gov.bisp.enumeration.X.i iVar) {
        this.f = list;
        this.g = context;
        this.h = iVar;
        this.i = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public int b() {
        int i = 2 % 2;
        int i2 = d + 21;
        e = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.f.size();
            obj.hashCode();
            throw null;
        }
        int size = this.f.size();
        int i3 = e;
        int i4 = ((i3 ^ 43) | (i3 & 43)) << 1;
        int i5 = -(((~i3) & 43) | (i3 & (-44)));
        int i6 = (i4 & i5) + (i5 | i4);
        d = i6 % 128;
        if (i6 % 2 != 0) {
            return size;
        }
        obj.hashCode();
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public int d(int i) {
        int i2 = 2 % 2;
        int i3 = e;
        int i4 = (i3 ^ 105) + ((i3 & 105) << 1);
        d = i4 % 128;
        int i5 = i4 % 2;
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public RecyclerView.o0O0O00 f(ViewGroup viewGroup, int i) {
        int i2 = 2 % 2;
        ViewHolder viewHolder = new ViewHolder(ivas.gov.bisp.enumeration.p091n.j.d(viewGroup, R.layout.row_agriculture_crop, viewGroup, false));
        int i3 = d;
        int i4 = (i3 ^ 93) + ((i3 & 93) << 1);
        e = i4 % 128;
        if (i4 % 2 == 0) {
            return viewHolder;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0189  */
    /* JADX WARN: Code duplicated, block: B:27:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:30:0x01b1  */
    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public void g(RecyclerView.o0O0O00 o0o0o00, int i) {
        boolean z;
        int i2;
        int i3 = 2 % 2;
        int i4 = e;
        int i5 = i4 & 113;
        int i6 = (i4 | 113) & (~i5);
        int i7 = -(-(i5 << 1));
        int i8 = ((i6 | i7) << 1) - (i6 ^ i7);
        d = i8 % 128;
        Object obj = null;
        if (i8 % 2 == 0) {
            this.f.get(i);
            throw null;
        }
        ViewHolder viewHolder = (ViewHolder) o0o0o00;
        Crop crop = this.f.get(i);
        int i9 = e;
        int i10 = i9 & 81;
        int i11 = -(-((i9 ^ 81) | i10));
        int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
        d = i12 % 128;
        int i13 = i12 % 2;
        viewHolder.c.setTag(crop);
        Object tag = viewHolder.c.getTag();
        int i14 = e;
        int i15 = i14 ^ 103;
        int i16 = (((i14 & 103) | i15) << 1) - i15;
        d = i16 % 128;
        int i17 = i16 % 2;
        Crop crop2 = (Crop) tag;
        AdapterAgriCrop adapterAgriCrop = AdapterAgriCrop.this;
        ArrayAdapter arrayAdapter = new ArrayAdapter(adapterAgriCrop.g, R.layout.spinner_item, adapterAgriCrop.i);
        int i18 = e;
        int i19 = (i18 & 27) + (i18 | 27);
        d = i19 % 128;
        if (i19 % 2 == 0) {
            viewHolder.spinnerUnit.setAdapter((SpinnerAdapter) arrayAdapter);
            viewHolder.checkBoxSelected.setText(BuildConfig.FLAVOR);
            obj.hashCode();
            throw null;
        }
        viewHolder.spinnerUnit.setAdapter((SpinnerAdapter) arrayAdapter);
        viewHolder.checkBoxSelected.setText(BuildConfig.FLAVOR);
        viewHolder.checkBoxSelected.setText(crop2.getName());
        CheckBox checkBox = viewHolder.checkBoxSelected;
        int i20 = (-2) - ((d + 58) ^ (-1));
        e = i20 % 128;
        int i21 = i20 % 2;
        if (crop2.getIsSelected() == 1) {
            int i22 = e;
            int i23 = i22 | 91;
            int i24 = ((i23 << 1) - (~(-(i23 & (~(i22 & 91)))))) - 1;
            d = i24 % 128;
            int i25 = i24 % 2;
            int i26 = ((i22 ^ 25) | (i22 & 25)) << 1;
            int i27 = -(((~i22) & 25) | (i22 & (-26)));
            int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
            d = i28 % 128;
            if (i28 % 2 == 0) {
                int i29 = 3 % 2;
            }
            z = true;
        } else {
            int i30 = d;
            int i31 = i30 & 125;
            int i32 = (i31 - (~((i30 ^ 125) | i31))) - 1;
            e = i32 % 128;
            int i33 = i32 % 2;
            z = false;
        }
        checkBox.setChecked(z);
        Spinner spinner = viewHolder.spinnerUnit;
        int i34 = e;
        int i35 = (i34 & (-40)) | ((~i34) & 39);
        int i36 = (i34 & 39) << 1;
        int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
        d = i37 % 128;
        int i38 = i37 % 2;
        spinner.setSelection(crop2.getLandUnitPosition());
        EditText editText = viewHolder.editTextNumber;
        int i39 = d;
        int i40 = i39 & 29;
        int i41 = i40 + ((i39 ^ 29) | i40);
        e = i41 % 128;
        if (i41 % 2 != 0) {
            editText.setText(BuildConfig.FLAVOR);
            EditText editText2 = viewHolder.editTextNumber;
            crop2.getLandMeasure();
            obj.hashCode();
            throw null;
        }
        editText.setText(BuildConfig.FLAVOR);
        viewHolder.editTextNumber.setText(crop2.getLandMeasure());
        EditText editText3 = viewHolder.editTextNumber;
        j jVar = new j(viewHolder, i);
        int i42 = d;
        int i43 = (((i42 ^ 33) | (i42 & 33)) << 1) - (((~i42) & 33) | (i42 & (-34)));
        e = i43 % 128;
        int i44 = i43 % 2;
        editText3.addTextChangedListener(jVar);
        String name = crop2.getName();
        AdapterAgriCrop adapterAgriCrop2 = AdapterAgriCrop.this;
        int i45 = e;
        int i46 = i45 & 15;
        int i47 = ((i45 ^ 15) | i46) << 1;
        int i48 = -((i45 | 15) & (~i46));
        int i49 = ((i47 | i48) << 1) - (i48 ^ i47);
        d = i49 % 128;
        if (i49 % 2 == 0) {
            adapterAgriCrop2.g.getResources();
            obj.hashCode();
            throw null;
        }
        Resources resources = adapterAgriCrop2.g.getResources();
        int i50 = d;
        int i51 = ((i50 ^ 114) + ((i50 & 114) << 1)) - 1;
        e = i51 % 128;
        int i52 = 8;
        if (i51 % 2 != 0) {
            if (name.equals(resources.getString(R.string.no_crop))) {
                viewHolder.linearLayoutDetail.setVisibility(8);
                int i53 = e;
                int i54 = i53 | 19;
                int i55 = i54 << 1;
                int i56 = -((~(i53 & 19)) & i54);
                i2 = ((i55 | i56) << 1) - (i56 ^ i55);
                d = i2 % 128;
                if (i2 % 2 == 0) {
                    int i57 = 4 % 5;
                }
            } else {
                i52 = 71;
                LinearLayout linearLayout = viewHolder.linearLayoutDetail;
                if (crop2.getIsSelected() == 1) {
                    int i58 = e;
                    int i59 = (i58 ^ 51) + ((i58 & 51) << 1);
                    d = i59 % 128;
                    int i60 = i59 % 2;
                    int i61 = i58 ^ 105;
                    int i62 = (((i58 & 105) | i61) << 1) - i61;
                    d = i62 % 128;
                    int i63 = i62 % 2;
                    i52 = 0;
                }
                linearLayout.setVisibility(i52);
                int i64 = d;
                int i65 = i64 & 73;
                int i66 = -(-((i64 ^ 73) | i65));
                int i67 = (i65 ^ i66) + ((i66 & i65) << 1);
                e = i67 % 128;
                int i68 = i67 % 2;
            }
        } else if (name.equals(resources.getString(R.string.no_crop))) {
            viewHolder.linearLayoutDetail.setVisibility(8);
            int i510 = e;
            int i511 = i510 | 19;
            int i512 = i511 << 1;
            int i513 = -((~(i510 & 19)) & i511);
            i2 = ((i512 | i513) << 1) - (i513 ^ i512);
            d = i2 % 128;
            if (i2 % 2 == 0) {
                int i514 = 4 % 5;
            }
        } else {
            LinearLayout linearLayout2 = viewHolder.linearLayoutDetail;
            if (crop2.getIsSelected() == 1) {
                int i515 = e;
                int i516 = (i515 ^ 51) + ((i515 & 51) << 1);
                d = i516 % 128;
                int i69 = i516 % 2;
                int i610 = i515 ^ 105;
                int i611 = (((i515 & 105) | i610) << 1) - i610;
                d = i611 % 128;
                int i612 = i611 % 2;
                i52 = 0;
            }
            linearLayout2.setVisibility(i52);
            int i613 = d;
            int i614 = i613 & 73;
            int i615 = -(-((i613 ^ 73) | i614));
            int i616 = (i614 ^ i615) + ((i615 & i614) << 1);
            e = i616 % 128;
            int i617 = i616 % 2;
        }
        viewHolder.checkBoxSelected.setOnClickListener(new ivas.gov.bisp.enumeration.p051bx.u(viewHolder, i, 0));
        viewHolder.spinnerUnit.setOnItemSelectedListener(new c(viewHolder, i));
        int i70 = e;
        int i71 = ((i70 ^ 3) - (~((i70 & 3) << 1))) - 1;
        d = i71 % 128;
        int i72 = i71 % 2;
    }
}
