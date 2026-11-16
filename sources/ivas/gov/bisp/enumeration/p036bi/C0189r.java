package ivas.gov.bisp.enumeration.p036bi;

import ivas.gov.bisp.enumeration.W.M;
import ivas.gov.bisp.enumeration.activity.AddressActivity;
import ivas.gov.bisp.enumeration.bK.af;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.province;
import java.util.ArrayList;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bi.r, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0189r implements M {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ AddressActivity c;

    public C0189r(AddressActivity addressActivity) {
        this.c = addressActivity;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0028  */
    @Override // ivas.gov.bisp.enumeration.W.M
    public void fillProvList(ArrayList<province> arrayList, ArrayList<String> arrayList2) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 98) << 1) - (i2 ^ 98);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        b = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 63 / 0;
            if (arrayList.size() <= 0) {
                af.b(this.c, "Address Library not Loaded. Kindly logout and login again!", true);
                int i6 = a;
                int i7 = (-2) - (((i6 & 86) + (i6 | 86)) ^ (-1));
                b = i7 % 128;
                int i8 = i7 % 2;
            }
        } else if (arrayList.size() <= 0) {
            af.b(this.c, "Address Library not Loaded. Kindly logout and login again!", true);
            int i9 = a;
            int i10 = (-2) - (((i9 & 86) + (i9 | 86)) ^ (-1));
            b = i10 % 128;
            int i11 = i10 % 2;
        }
        AddressActivity addressActivity = this.c;
        addressActivity.ag = arrayList;
        int i12 = a;
        int i13 = (i12 & 5) + (i12 | 5);
        b = i13 % 128;
        int i14 = i13 % 2;
        addressActivity.u();
        int i15 = b;
        int i16 = i15 & 115;
        int i17 = (i15 ^ 115) | i16;
        int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
        a = i18 % 128;
        if (i18 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
