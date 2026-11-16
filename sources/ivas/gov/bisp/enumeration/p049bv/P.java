package ivas.gov.bisp.enumeration.p049bv;

import ivas.gov.bisp.enumeration.W.t;
import ivas.gov.bisp.enumeration.enumerator.ActivityEnumeratorMain;
import ivas.gov.bisp.enumeration.models.NewLocationForm;
import ivas.gov.bisp.enumeration.p026az.C0104p;
import ivas.gov.bisp.enumeration.p043bp.am;

/* JADX INFO: loaded from: classes.dex */
public class P implements t {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ ActivityEnumeratorMain c;

    public P(ActivityEnumeratorMain activityEnumeratorMain) {
        this.c = activityEnumeratorMain;
    }

    @Override // ivas.gov.bisp.enumeration.W.t
    public void notValidData() {
        int i = 2 % 2;
        int i2 = a + 37;
        b = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.W.t
    public void notValidSupervisor() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 | 81) << 1;
        int i4 = -(i2 ^ 81);
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.W.t
    public void notValidVersion() {
        int i = 2 % 2;
        C0104p c0104pC = C0104p.c();
        ActivityEnumeratorMain activityEnumeratorMain = this.c;
        am amVar = new am(this, 5);
        int i2 = a;
        int i3 = (i2 ^ 13) + ((i2 & 13) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        c0104pC.e(activityEnumeratorMain, "Oops!", "Your application version is old.Kindly update the new version to proceed", amVar, false);
        int i5 = b;
        int i6 = (((i5 | 14) << 1) - (i5 ^ 14)) - 1;
        a = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    @Override // ivas.gov.bisp.enumeration.W.t
    public void validData(NewLocationForm newLocationForm) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 7;
        int i4 = -(-(i2 | 7));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        int i6 = i5 % 2;
    }
}
