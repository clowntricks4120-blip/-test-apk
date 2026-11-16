package ivas.gov.bisp.enumeration.p043bp;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
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

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bp.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0214u implements J {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ ActivityAgriculture c;

    public C0214u(ActivityAgriculture activityAgriculture) {
        this.c = activityAgriculture;
    }

    @Override // ivas.gov.bisp.enumeration.W.J
    public void fillList(ArrayList<Item> arrayList) {
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 | 9) << 1;
        int i5 = -(i3 ^ 9);
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            this.c.aS = arrayList;
            i = 1;
        } else {
            this.c.aS = arrayList;
            i = 0;
        }
        while (i < arrayList.size()) {
            ActivityAgriculture activityAgriculture = this.c;
            List<Crop> list = activityAgriculture.aE;
            Crop crop = new Crop(activityAgriculture.aS.get(i).getOption(), this.c.aS.get(i).getOptionId());
            int i7 = b;
            int i8 = i7 & 111;
            int i9 = (i7 | 111) & (~i8);
            int i10 = i8 << 1;
            int i11 = ((i9 | i10) << 1) - (i9 ^ i10);
            a = i11 % 128;
            if (i11 % 2 == 0) {
                list.add(crop);
                int i12 = i ^ 114;
                int i13 = ((i & 114) | i12) << 1;
                int i14 = -i12;
                int i15 = (i13 ^ i14) + ((i13 & i14) << 1);
                int i16 = i15 & (-12);
                int i17 = -(-((i15 ^ (-12)) | i16));
                i = (i16 & i17) + (i16 | i17);
            } else {
                list.add(crop);
                i = (-2) - (((((i & (-112)) | ((~i) & 111)) - (~((i & 111) << 1))) - 110) ^ (-1));
            }
            int i18 = b;
            int i19 = (((i18 & (-96)) | ((~i18) & 95)) - (~((i18 & 95) << 1))) - 1;
            a = i19 % 128;
            int i20 = i19 % 2;
        }
        ActivityAgriculture activityAgriculture2 = this.c;
        BISPApplication bISPApplication = activityAgriculture2.az;
        if (bISPApplication.G == null) {
            int i21 = b + 73;
            a = i21 % 128;
            int i22 = i21 % 2;
            bISPApplication.G = activityAgriculture2.aE;
            int i23 = b;
            int i24 = i23 | 75;
            int i25 = i24 << 1;
            int i26 = -((~(i23 & 75)) & i24);
            int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
            a = i27 % 128;
            int i28 = i27 % 2;
        }
        AppCompatActivity appCompatActivity = this.c.ae;
        az azVar = new az(appCompatActivity, "unit_of_land", appCompatActivity.getResources().getString(R.string.unit), null, new bpJ());
        int i29 = a + 45;
        b = i29 % 128;
        int i30 = i29 % 2;
        azVar.execute(new Void[0]);
        int i31 = b + 31;
        a = i31 % 128;
        int i32 = i31 % 2;
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bp.u$bpJ */
    public class bpJ implements Q {
        private static int a = 0;
        private static int b = 1;

        public bpJ() {
        }

        @Override // ivas.gov.bisp.enumeration.W.Q
        public void fillList(ArrayList<String> arrayList) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (((i2 | 74) << 1) - (i2 ^ 74)) - 1;
            b = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                C0214u.this.c.ax = arrayList;
                obj.hashCode();
                throw null;
            }
            ActivityAgriculture activityAgriculture = C0214u.this.c;
            activityAgriculture.ax = arrayList;
            Context applicationContext = activityAgriculture.getApplicationContext();
            ActivityAgriculture activityAgriculture2 = C0214u.this.c;
            AdapterAgriCrop adapterAgriCrop = new AdapterAgriCrop(applicationContext, activityAgriculture2.aE, activityAgriculture2.ax, new C0213t(this, 0));
            int i4 = b;
            int i5 = (-2) - (((i4 & 20) + (i4 | 20)) ^ (-1));
            a = i5 % 128;
            if (i5 % 2 != 0) {
                activityAgriculture.aQ = adapterAgriCrop;
                ActivityAgriculture activityAgriculture3 = C0214u.this.c;
                obj.hashCode();
                throw null;
            }
            activityAgriculture.aQ = adapterAgriCrop;
            ActivityAgriculture activityAgriculture4 = C0214u.this.c;
            activityAgriculture4.recyclerViewKhareef.setAdapter(activityAgriculture4.aQ);
            int i6 = a;
            int i7 = ((i6 & (-20)) | ((~i6) & 19)) + ((i6 & 19) << 1);
            b = i7 % 128;
            (i7 % 2 == 0 ? C0214u.this.c : C0214u.this.c).recyclerViewKhareef.getRecycledViewPool().e(0, 0);
            int i8 = a;
            int i9 = i8 ^ 23;
            int i10 = (((i8 & 23) | i9) << 1) - i9;
            b = i10 % 128;
            int i11 = i10 % 2;
        }
    }
}
