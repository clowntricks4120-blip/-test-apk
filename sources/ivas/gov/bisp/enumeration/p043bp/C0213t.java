package ivas.gov.bisp.enumeration.p043bp;

import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ivas.gov.bisp.enumeration.ActivityQRCodeInfo;
import ivas.gov.bisp.enumeration.ActivitySummary;
import ivas.gov.bisp.enumeration.X.i;
import ivas.gov.bisp.enumeration.X.r;
import ivas.gov.bisp.enumeration.models.Crop;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bp.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0213t implements i, r {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ C0213t(Object obj, int i) {
        this.c = i;
        this.d = obj;
    }

    @Override // ivas.gov.bisp.enumeration.X.r
    public final void e(String str, String str2) {
        ActivitySummary activitySummary;
        TextView textView;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 17;
        int i4 = -(-((i2 ^ 17) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        if (this.c == 1) {
            ActivityQRCodeInfo activityQRCodeInfo = (ActivityQRCodeInfo) this.d;
            activityQRCodeInfo.textViewToDate.setText(str2);
            int i8 = a;
            int i9 = ((i8 & 66) + (i8 | 66)) - 1;
            b = i9 % 128;
            if (i9 % 2 == 0) {
                activityQRCodeInfo.textViewToDate.setTag(str);
                throw null;
            }
            activityQRCodeInfo.textViewToDate.setTag(str);
            int i10 = b;
            int i11 = (i10 ^ 1) + ((i10 & 1) << 1);
            a = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 57 / 0;
                return;
            }
            return;
        }
        int i13 = i6 & 99;
        int i14 = (i6 | 99) & (~i13);
        int i15 = i13 << 1;
        int i16 = (i14 & i15) + (i14 | i15);
        int i17 = i16 % 128;
        a = i17;
        if (i16 % 2 != 0) {
            int i18 = 4 / 5;
        }
        int i19 = i17 & 107;
        int i20 = ((i17 ^ 107) | i19) << 1;
        int i21 = -((i17 | 107) & (~i19));
        int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
        b = i22 % 128;
        if (i22 % 2 == 0) {
            activitySummary = (ActivitySummary) this.d;
            textView = activitySummary.textViewToDate;
            int i23 = 26 / 0;
        } else {
            activitySummary = (ActivitySummary) this.d;
            textView = activitySummary.textViewToDate;
        }
        textView.setText(str2);
        activitySummary.textViewToDate.setTag(str);
        int i24 = a + 53;
        b = i24 % 128;
        int i25 = i24 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.X.i
    public final void c(int i) {
        int i2 = 2 % 2;
        int i3 = a + 115;
        b = i3 % 128;
        int i4 = i3 % 2;
        C0214u.bpJ bpj = (C0214u.bpJ) this.d;
        C0214u c0214u = C0214u.this;
        int i5 = b;
        int i6 = ((i5 & (-44)) | ((~i5) & 43)) + ((i5 & 43) << 1);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            c0214u.c.aE.get(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (c0214u.c.aE.get(i).getIsSelected() == 0) {
            int i7 = b;
            int i8 = ((i7 & (-112)) | ((~i7) & 111)) + ((i7 & 111) << 1);
            a = i8 % 128;
            int i9 = i8 % 2;
            Crop crop = C0214u.this.c.aE.get(i);
            int i10 = a + 25;
            b = i10 % 128;
            int i11 = i10 % 2;
            crop.setIsSelected(1);
            int i12 = a;
            int i13 = i12 & 13;
            int i14 = ((i12 ^ 13) | i13) << 1;
            int i15 = -((i12 | 13) & (~i13));
            int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
            b = i16 % 128;
            int i17 = i16 % 2;
        } else {
            Crop crop2 = C0214u.this.c.aE.get(i);
            int i18 = b;
            int i19 = (i18 ^ 5) + ((i18 & 5) << 1);
            a = i19 % 128;
            int i20 = i19 % 2;
            crop2.setIsSelected(0);
            int i21 = a;
            int i22 = (i21 & (-124)) | ((~i21) & 123);
            int i23 = -(-((i21 & 123) << 1));
            int i24 = (i22 & i23) + (i23 | i22);
            b = i24 % 128;
            int i25 = i24 % 2;
        }
        RecyclerView.OooOO0 oooOO0 = C0214u.this.c.aQ.a;
        int i26 = b;
        int i27 = (i26 & (-112)) | ((~i26) & 111);
        int i28 = (i26 & 111) << 1;
        int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
        a = i29 % 128;
        if (i29 % 2 != 0) {
            oooOO0.d(i, 0);
        } else {
            oooOO0.d(i, 1);
        }
        int i30 = a;
        int i31 = i30 & 39;
        int i32 = ((i30 ^ 39) | i31) << 1;
        int i33 = -((i30 | 39) & (~i31));
        int i34 = ((i32 | i33) << 1) - (i33 ^ i32);
        b = i34 % 128;
        int i35 = i34 % 2;
    }
}
