package ivas.gov.bisp.enumeration;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import ivas.gov.bisp.enumeration.V.u;

/* JADX INFO: loaded from: classes.dex */
public class ActivityAgriculture_ViewBinding implements Unbinder {

    public class OooO00o extends ivas.gov.bisp.enumeration.V.t {
        private static int a = 0;
        private static int b = 1;
        public final /* synthetic */ ActivityAgriculture c;

        public OooO00o(ActivityAgriculture_ViewBinding activityAgriculture_ViewBinding, ActivityAgriculture activityAgriculture) {
            this.c = activityAgriculture;
        }

        @Override // ivas.gov.bisp.enumeration.V.t
        public void doClick(View view) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & 29) + (i2 | 29);
            b = i3 % 128;
            int i4 = i3 % 2;
            this.c.onSave(view);
            if (i4 == 0) {
                throw null;
            }
        }
    }

    public ActivityAgriculture_ViewBinding(ActivityAgriculture activityAgriculture, View view) {
        activityAgriculture.nestedScrollView = (NestedScrollView) u.b(u.c(view, R.id.nestedScrollView, "field 'nestedScrollView'"), R.id.nestedScrollView, "field 'nestedScrollView'", NestedScrollView.class);
        activityAgriculture.spinnerType = (Spinner) u.b(u.c(view, R.id.sp_agri_type, "field 'spinnerType'"), R.id.sp_agri_type, "field 'spinnerType'", Spinner.class);
        activityAgriculture.linearLayoutOtherLand = (LinearLayout) u.b(u.c(view, R.id.ll_other_land, "field 'linearLayoutOtherLand'"), R.id.ll_other_land, "field 'linearLayoutOtherLand'", LinearLayout.class);
        activityAgriculture.editTextOwnerName = (EditText) u.b(u.c(view, R.id.tv_owner_name, "field 'editTextOwnerName'"), R.id.tv_owner_name, "field 'editTextOwnerName'", EditText.class);
        activityAgriculture.editTextOwnerMobile = (EditText) u.b(u.c(view, R.id.tv_owner_mobile, "field 'editTextOwnerMobile'"), R.id.tv_owner_mobile, "field 'editTextOwnerMobile'", EditText.class);
        activityAgriculture.linearLayoutLandDetail = (LinearLayout) u.b(u.c(view, R.id.ll_land_detail, "field 'linearLayoutLandDetail'"), R.id.ll_land_detail, "field 'linearLayoutLandDetail'", LinearLayout.class);
        activityAgriculture.spinnerUnit = (Spinner) u.b(u.c(view, R.id.sp_unit, "field 'spinnerUnit'"), R.id.sp_unit, "field 'spinnerUnit'", Spinner.class);
        activityAgriculture.editTextLandNumber = (EditText) u.b(u.c(view, R.id.et_number, "field 'editTextLandNumber'"), R.id.et_number, "field 'editTextLandNumber'", EditText.class);
        activityAgriculture.linearLayoutWeatherCrop = (LinearLayout) u.b(u.c(view, R.id.ll_weather_crop, "field 'linearLayoutWeatherCrop'"), R.id.ll_weather_crop, "field 'linearLayoutWeatherCrop'", LinearLayout.class);
        activityAgriculture.recyclerViewRabi = (RecyclerView) u.b(u.c(view, R.id.rv_rabi_crop, "field 'recyclerViewRabi'"), R.id.rv_rabi_crop, "field 'recyclerViewRabi'", RecyclerView.class);
        activityAgriculture.recyclerViewKhareef = (RecyclerView) u.b(u.c(view, R.id.rv_khareef_crop, "field 'recyclerViewKhareef'"), R.id.rv_khareef_crop, "field 'recyclerViewKhareef'", RecyclerView.class);
        activityAgriculture.cardViewWaterRes = (CardView) u.b(u.c(view, R.id.cv_water_res, "field 'cardViewWaterRes'"), R.id.cv_water_res, "field 'cardViewWaterRes'", CardView.class);
        activityAgriculture.cardViewCropAsset = (CardView) u.b(u.c(view, R.id.cv_crop_asset, "field 'cardViewCropAsset'"), R.id.cv_crop_asset, "field 'cardViewCropAsset'", CardView.class);
        activityAgriculture.textViewTimeRemaining = (TextView) u.b(u.c(view, R.id.tv_time_remaining, "field 'textViewTimeRemaining'"), R.id.tv_time_remaining, "field 'textViewTimeRemaining'", TextView.class);
        View viewC = u.c(view, R.id.btn_save, "field 'buttonSave' and method 'onSave'");
        activityAgriculture.buttonSave = (Button) u.b(viewC, R.id.btn_save, "field 'buttonSave'", Button.class);
        viewC.setOnClickListener(new OooO00o(this, activityAgriculture));
        activityAgriculture.radioGroupRabi = (RadioGroup) u.b(u.c(view, R.id.rg_rabi, "field 'radioGroupRabi'"), R.id.rg_rabi, "field 'radioGroupRabi'", RadioGroup.class);
        activityAgriculture.radioGroupKhareef = (RadioGroup) u.b(u.c(view, R.id.rg_khareef, "field 'radioGroupKhareef'"), R.id.rg_khareef, "field 'radioGroupKhareef'", RadioGroup.class);
    }
}
