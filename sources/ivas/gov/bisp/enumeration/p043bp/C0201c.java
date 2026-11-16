package ivas.gov.bisp.enumeration.p043bp;

import android.os.Handler;
import android.widget.RadioGroup;
import androidx.recyclerview.widget.RecyclerView;
import ivas.gov.bisp.enumeration.ActivityAgriculture;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.fragments.FragmentDeskbasedSurvey;
import ivas.gov.bisp.enumeration.fragments.FragmentHouseholdInfo;
import java.util.Objects;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bp.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0201c implements RadioGroup.OnCheckedChangeListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ C0201c(Object obj, int i) {
        this.c = i;
        this.d = obj;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        int i2;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = i4 & 91;
        int i6 = i4 | 91;
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        int i8 = i7 % 128;
        a = i8;
        int i9 = i7 % 2;
        int i10 = this.c;
        if (i10 != 0) {
            if (i10 == 1) {
                FragmentDeskbasedSurvey.d((FragmentDeskbasedSurvey) this.d, radioGroup, i);
                int i11 = a;
                int i12 = ((i11 | 5) << 1) - (i11 ^ 5);
                b = i12 % 128;
                if (i12 % 2 != 0) {
                    throw null;
                }
                return;
            }
            int i13 = i8 + 29;
            b = i13 % 128;
            int i14 = i13 % 2;
            int i15 = i8 ^ 89;
            int i16 = (i8 & 89) << 1;
            int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
            b = i17 % 128;
            if (i17 % 2 == 0) {
                FragmentHouseholdInfo.d((FragmentHouseholdInfo) this.d, radioGroup, i);
                return;
            } else {
                FragmentHouseholdInfo.d((FragmentHouseholdInfo) this.d, radioGroup, i);
                throw null;
            }
        }
        ActivityAgriculture activityAgriculture = (ActivityAgriculture) this.d;
        int i18 = ActivityAgriculture.af;
        int i19 = a;
        int i20 = ((i19 & 54) + (i19 | 54)) - 1;
        b = i20 % 128;
        int i21 = i20 % 2;
        Objects.requireNonNull(activityAgriculture);
        if (i == R.id.rb_rabi_yes) {
            Handler handler = new Handler();
            RunnableC0216x runnableC0216x = new RunnableC0216x(activityAgriculture);
            int i22 = (-2) - ((a + 72) ^ (-1));
            b = i22 % 128;
            int i23 = i22 % 2;
            handler.postDelayed(runnableC0216x, 1000L);
            int i24 = b;
            int i25 = ((i24 | 71) << 1) - (i24 ^ 71);
            a = i25 % 128;
            int i26 = i25 % 2;
        } else {
            activityAgriculture.recyclerViewRabi.setNestedScrollingEnabled(false);
            RecyclerView recyclerView = activityAgriculture.recyclerViewKhareef;
            int i27 = b;
            int i28 = i27 & 119;
            int i29 = ((i27 | 119) & (~i28)) + (i28 << 1);
            a = i29 % 128;
            int i30 = i29 % 2;
            if (recyclerView.getVisibility() == 0) {
                int i31 = b;
                int i32 = (i31 & 121) + (i31 | 121);
                a = i32 % 128;
                int i33 = i32 % 2;
                activityAgriculture.recyclerViewKhareef.setNestedScrollingEnabled(true);
                int i34 = b;
                int i35 = i34 & 1;
                int i36 = (i34 | 1) & (~i35);
                int i37 = i35 << 1;
                int i38 = (i36 & i37) + (i36 | i37);
                a = i38 % 128;
                if (i38 % 2 == 0) {
                    int i39 = 4 % 3;
                }
            } else {
                activityAgriculture.recyclerViewKhareef.setNestedScrollingEnabled(false);
                int i40 = b;
                int i41 = i40 & 103;
                int i42 = (i40 | 103) & (~i41);
                int i43 = i41 << 1;
                int i44 = (i42 ^ i43) + ((i42 & i43) << 1);
                a = i44 % 128;
                if (i44 % 2 == 0) {
                    int i45 = 5 / 5;
                }
            }
        }
        RecyclerView recyclerView2 = activityAgriculture.recyclerViewRabi;
        if (i == R.id.rb_rabi_yes) {
            int i46 = a;
            int i47 = (i46 & 21) + (i46 | 21);
            b = i47 % 128;
            i2 = i47 % 2 != 0 ? 1 : 0;
        } else {
            int i48 = b;
            int i49 = i48 & 3;
            int i50 = (i48 | 3) & (~i49);
            int i51 = i49 << 1;
            int i52 = (i50 & i51) + (i50 | i51);
            a = i52 % 128;
            int i53 = i52 % 2;
            i2 = 8;
        }
        recyclerView2.setVisibility(i2);
        int i54 = a;
        int i55 = i54 & 115;
        int i56 = -(-((i54 ^ 115) | i55));
        int i57 = (i55 ^ i56) + ((i56 & i55) << 1);
        b = i57 % 128;
        if (i57 % 2 != 0) {
            int i58 = 63 / 0;
        }
    }
}
