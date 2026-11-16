package ivas.gov.bisp.enumeration.p043bp;

import android.os.Handler;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.recyclerview.widget.RecyclerView;
import ivas.gov.bisp.enumeration.ActivityAgriculture;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.activity.BikeRegistryActivity;
import ivas.gov.bisp.enumeration.fragments.FragmentDeskbasedSurvey;
import ivas.gov.bisp.enumeration.fragments.FragmentHouseholdInfo;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements RadioGroup.OnCheckedChangeListener {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h(Object obj, int i) {
        this.c = i;
        this.d = obj;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00ef  */
    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 & 1) + (i3 | 1);
        int i5 = i4 % 128;
        b = i5;
        int i6 = i4 % 2;
        int i7 = this.c;
        int i8 = 8;
        Object obj = null;
        if (i7 == 0) {
            ActivityAgriculture activityAgriculture = (ActivityAgriculture) this.d;
            int i9 = ActivityAgriculture.af;
            int i10 = b + 27;
            a = i10 % 128;
            if (i10 % 2 != 0) {
                Objects.requireNonNull(activityAgriculture);
                obj.hashCode();
                throw null;
            }
            Objects.requireNonNull(activityAgriculture);
            if (i == R.id.rb_khareef_yes) {
                Handler handler = new Handler();
                i iVar = new i(activityAgriculture);
                int i11 = a;
                int i12 = (i11 ^ 99) + ((i11 & 99) << 1);
                b = i12 % 128;
                int i13 = i12 % 2;
                handler.postDelayed(iVar, 1000L);
                int i14 = a;
                int i15 = ((i14 | 79) << 1) - (i14 ^ 79);
                b = i15 % 128;
                int i16 = i15 % 2;
            } else {
                activityAgriculture.recyclerViewKhareef.setNestedScrollingEnabled(false);
                if (activityAgriculture.recyclerViewRabi.getVisibility() == 0) {
                    int i17 = a;
                    int i18 = (i17 & (-52)) | ((~i17) & 51);
                    int i19 = (i17 & 51) << 1;
                    int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
                    b = i20 % 128;
                    int i21 = i20 % 2;
                    activityAgriculture.recyclerViewRabi.setNestedScrollingEnabled(true);
                } else {
                    activityAgriculture.recyclerViewRabi.setNestedScrollingEnabled(false);
                    int i22 = b;
                    int i23 = ((i22 ^ 43) | (i22 & 43)) << 1;
                    int i24 = -(((~i22) & 43) | (i22 & (-44)));
                    int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
                    a = i25 % 128;
                    int i26 = i25 % 2;
                }
            }
            RecyclerView recyclerView = activityAgriculture.recyclerViewKhareef;
            if (i == R.id.rb_khareef_yes) {
                int i27 = a + 73;
                int i28 = i27 % 128;
                b = i28;
                int i29 = i27 % 2;
                int i30 = i28 & 31;
                int i31 = ((((i28 ^ 31) | i30) << 1) - (~(-((i28 | 31) & (~i30))))) - 1;
                a = i31 % 128;
                int i32 = i31 % 2;
                i8 = 0;
            }
            recyclerView.setVisibility(i8);
            int i33 = b + 63;
            a = i33 % 128;
            if (i33 % 2 != 0) {
                int i34 = 52 / 0;
                return;
            }
            return;
        }
        if (i7 != 1) {
            if (i7 == 2) {
                FragmentDeskbasedSurvey.c((FragmentDeskbasedSurvey) this.d, radioGroup, i);
                int i35 = a + 99;
                b = i35 % 128;
                if (i35 % 2 == 0) {
                    throw null;
                }
                return;
            }
            int i36 = (((i5 ^ 117) | (i5 & 117)) << 1) - (((~i5) & 117) | (i5 & (-118)));
            a = i36 % 128;
            int i37 = i36 % 2;
            FragmentHouseholdInfo.e((FragmentHouseholdInfo) this.d, radioGroup, i);
            int i38 = b;
            int i39 = ((i38 | 123) << 1) - (((~i38) & 123) | (i38 & (-124)));
            a = i39 % 128;
            if (i39 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        BikeRegistryActivity bikeRegistryActivity = (BikeRegistryActivity) this.d;
        int i40 = BikeRegistryActivity.r;
        int i41 = b;
        int i42 = i41 & 59;
        int i43 = -(-((i41 ^ 59) | i42));
        int i44 = (i42 & i43) + (i43 | i42);
        a = i44 % 128;
        int i45 = i44 % 2;
        Objects.requireNonNull(bikeRegistryActivity);
        if (i != R.id.rbYes) {
            if (i == R.id.rbNo) {
                int i46 = a;
                int i47 = (((i46 | 38) << 1) - (i46 ^ 38)) - 1;
                b = i47 % 128;
                int i48 = i47 % 2;
                bikeRegistryActivity.E.setBackground(bikeRegistryActivity.getDrawable(R.drawable.radio_selected_bg));
                RadioButton radioButton = bikeRegistryActivity.C;
                int i49 = a + 52;
                int i50 = (i49 ^ (-1)) + (i49 << 1);
                b = i50 % 128;
                int i51 = i50 % 2;
                radioButton.setBackground(bikeRegistryActivity.getDrawable(R.drawable.radio_unselected_bg));
                bikeRegistryActivity.A.setVisibility(8);
                int i52 = a + 62;
                int i53 = (i52 ^ (-1)) + (i52 << 1);
                b = i53 % 128;
                if (i53 % 2 == 0) {
                    bikeRegistryActivity.z.setVisibility(40);
                    bikeRegistryActivity.L.setVisibility(44);
                } else {
                    bikeRegistryActivity.z.setVisibility(8);
                    bikeRegistryActivity.L.setVisibility(8);
                }
                bikeRegistryActivity.E.setTextColor(bikeRegistryActivity.getColor(R.color.green));
                RadioButton radioButton2 = bikeRegistryActivity.C;
                int i54 = a;
                int i55 = i54 & 49;
                int i56 = -(-((i54 ^ 49) | i55));
                int i57 = (i55 & i56) + (i56 | i55);
                b = i57 % 128;
                if (i57 % 2 == 0) {
                    radioButton2.setTextColor(bikeRegistryActivity.getColor(android.R.color.darker_gray));
                    throw null;
                }
                radioButton2.setTextColor(bikeRegistryActivity.getColor(android.R.color.darker_gray));
                int i58 = b;
                int i59 = i58 & 39;
                int i60 = (i58 | 39) & (~i59);
                int i61 = i59 << 1;
                int i62 = ((i60 | i61) << 1) - (i60 ^ i61);
                a = i62 % 128;
                int i63 = i62 % 2;
            }
            int i64 = b;
            int i65 = i64 ^ 113;
            int i66 = -(-((i64 & 113) << 1));
            int i67 = (i65 & i66) + (i66 | i65);
            a = i67 % 128;
            int i68 = i67 % 2;
            return;
        }
        int i69 = b;
        int i70 = (i69 ^ 25) + ((i69 & 25) << 1);
        a = i70 % 128;
        int i71 = i70 % 2;
        RadioButton radioButton3 = bikeRegistryActivity.C;
        if (i71 != 0) {
            radioButton3.setBackground(bikeRegistryActivity.getDrawable(R.drawable.radio_selected_bg));
            throw null;
        }
        radioButton3.setBackground(bikeRegistryActivity.getDrawable(R.drawable.radio_selected_bg));
        int i72 = a;
        int i73 = i72 & 115;
        int i74 = (i73 - (~((i72 ^ 115) | i73))) - 1;
        b = i74 % 128;
        int i75 = i74 % 2;
        bikeRegistryActivity.E.setBackground(bikeRegistryActivity.getDrawable(R.drawable.radio_unselected_bg));
        int i76 = b;
        int i77 = (((i76 | 25) << 1) - (~(-(((~i76) & 25) | (i76 & (-26)))))) - 1;
        a = i77 % 128;
        if (i77 % 2 != 0) {
            bikeRegistryActivity.A.setVisibility(1);
            if (!bikeRegistryActivity.F.isEmpty()) {
                bikeRegistryActivity.z.setVisibility(0);
                int i78 = b;
                int i79 = i78 & 93;
                int i80 = (i79 - (~(-(-((i78 ^ 93) | i79))))) - 1;
                a = i80 % 128;
                int i81 = i80 % 2;
            }
        } else {
            bikeRegistryActivity.A.setVisibility(0);
            if (!bikeRegistryActivity.F.isEmpty()) {
                bikeRegistryActivity.z.setVisibility(0);
                int i710 = b;
                int i711 = i710 & 93;
                int i82 = (i711 - (~(-(-((i710 ^ 93) | i711))))) - 1;
                a = i82 % 128;
                int i83 = i82 % 2;
            }
        }
        bikeRegistryActivity.L.setVisibility(0);
        RadioButton radioButton4 = bikeRegistryActivity.C;
        int i84 = b;
        int i85 = (i84 & (-82)) | ((~i84) & 81);
        int i86 = (i84 & 81) << 1;
        int i87 = (i85 & i86) + (i86 | i85);
        a = i87 % 128;
        if (i87 % 2 != 0) {
            radioButton4.setTextColor(bikeRegistryActivity.getColor(R.color.green));
            RadioButton radioButton5 = bikeRegistryActivity.E;
            obj.hashCode();
            throw null;
        }
        radioButton4.setTextColor(bikeRegistryActivity.getColor(R.color.green));
        bikeRegistryActivity.E.setTextColor(bikeRegistryActivity.getColor(android.R.color.darker_gray));
        int i88 = b + 117;
        a = i88 % 128;
        if (i88 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
