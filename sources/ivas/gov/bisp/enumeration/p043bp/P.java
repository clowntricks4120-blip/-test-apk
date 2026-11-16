package ivas.gov.bisp.enumeration.p043bp;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import ivas.gov.bisp.enumeration.ActivityAgriculture;
import ivas.gov.bisp.enumeration.BISPApplication;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.W.J;
import ivas.gov.bisp.enumeration.W.Q;
import ivas.gov.bisp.enumeration.adapters.AdapterAgriCrop;
import ivas.gov.bisp.enumeration.bK.az;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import ivas.gov.bisp.enumeration.models.Crop;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class P implements J {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ ActivityAgriculture c;

    public P(ActivityAgriculture activityAgriculture) {
        this.c = activityAgriculture;
    }

    public class bpF implements Q {
        private static int a = 1;
        private static int b;

        public bpF() {
        }

        @Override // ivas.gov.bisp.enumeration.W.Q
        public void fillList(ArrayList<String> arrayList) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = 1;
            int i4 = (i2 ^ 31) + ((i2 & 31) << 1);
            a = i4 % 128;
            int i5 = i4 % 2;
            ActivityAgriculture activityAgriculture = P.this.c;
            activityAgriculture.ax = arrayList;
            int i6 = (-2) - ((b + 86) ^ (-1));
            a = i6 % 128;
            if (i6 % 2 == 0) {
                activityAgriculture.getApplicationContext();
                ActivityAgriculture activityAgriculture2 = P.this.c;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Context applicationContext = activityAgriculture.getApplicationContext();
            ActivityAgriculture activityAgriculture3 = P.this.c;
            AdapterAgriCrop adapterAgriCrop = new AdapterAgriCrop(applicationContext, activityAgriculture3.aD, activityAgriculture3.ax, new C0203e(this, i3));
            int i7 = b;
            int i8 = i7 ^ 103;
            int i9 = (i7 & 103) << 1;
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            a = i10 % 128;
            int i11 = i10 % 2;
            activityAgriculture.aH = adapterAgriCrop;
            ActivityAgriculture activityAgriculture4 = P.this.c;
            int i12 = b;
            int i13 = i12 & 1;
            int i14 = (i13 - (~((i12 ^ 1) | i13))) - 1;
            a = i14 % 128;
            int i15 = i14 % 2;
            activityAgriculture4.recyclerViewRabi.setAdapter(activityAgriculture4.aH);
            int i16 = a;
            int i17 = (i16 & 94) + (i16 | 94);
            int i18 = (i17 ^ (-1)) + (i17 << 1);
            b = i18 % 128;
            int i19 = i18 % 2;
            RecyclerView.o00Oo0 recycledViewPool = P.this.c.recyclerViewRabi.getRecycledViewPool();
            int i20 = a;
            int i21 = i20 & 83;
            int i22 = i21 + ((i20 ^ 83) | i21);
            b = i22 % 128;
            if (i22 % 2 != 0) {
                recycledViewPool.e(0, 0);
            } else {
                recycledViewPool.e(0, 0);
            }
        }
    }

    @Override // ivas.gov.bisp.enumeration.W.J
    public void fillList(ArrayList<Item> arrayList) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 35) + ((i2 & 35) << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        this.c.aM = arrayList;
        int i5 = a + 113;
        b = i5 % 128;
        int i6 = i5 % 2;
        int i7 = 0;
        while (i7 < this.c.aM.size()) {
            ActivityAgriculture activityAgriculture = this.c;
            List<Crop> list = activityAgriculture.aD;
            Crop crop = new Crop(activityAgriculture.aM.get(i7).getOption(), this.c.aM.get(i7).getOptionId());
            int i8 = a + 105;
            b = i8 % 128;
            int i9 = i8 % 2;
            list.add(crop);
            int i10 = i7 + 23;
            int i11 = i10 | (-22);
            int i12 = i11 << 1;
            int i13 = -((~(i10 & (-22))) & i11);
            i7 = ((i13 & i12) << 1) + (i12 ^ i13);
            int i14 = a;
            int i15 = (i14 ^ 78) + ((i14 & 78) << 1);
            int i16 = (i15 ^ (-1)) + (i15 << 1);
            b = i16 % 128;
            int i17 = i16 % 2;
        }
        ActivityAgriculture activityAgriculture2 = this.c;
        BISPApplication bISPApplication = activityAgriculture2.az;
        int i18 = b;
        int i19 = (i18 & 9) + (i18 | 9);
        a = i19 % 128;
        if (i19 % 2 == 0) {
            List<Crop> list2 = bISPApplication.H;
            throw null;
        }
        if (bISPApplication.H == null) {
            int i20 = a;
            int i21 = i20 & 105;
            int i22 = ((((i20 ^ 105) | i21) << 1) - (~(-((i20 | 105) & (~i21))))) - 1;
            b = i22 % 128;
            int i23 = i22 % 2;
            bISPApplication.H = activityAgriculture2.aD;
            int i24 = a;
            int i25 = i24 ^ 121;
            int i26 = -(-((i24 & 121) << 1));
            int i27 = (i25 & i26) + (i26 | i25);
            b = i27 % 128;
            if (i27 % 2 != 0) {
                int i28 = 5 % 3;
            }
        }
        AppCompatActivity appCompatActivity = this.c.ae;
        az azVar = new az(appCompatActivity, "unit_of_land", appCompatActivity.getResources().getString(R.string.unit), null, new bpF());
        int i29 = b + 39;
        a = i29 % 128;
        int i30 = i29 % 2;
        azVar.execute(new Void[0]);
        int i31 = a;
        int i32 = i31 & 49;
        int i33 = ((i31 ^ 49) | i32) << 1;
        int i34 = -((i31 | 49) & (~i32));
        int i35 = (i33 & i34) + (i34 | i33);
        b = i35 % 128;
        if (i35 % 2 != 0) {
            throw null;
        }
    }
}
