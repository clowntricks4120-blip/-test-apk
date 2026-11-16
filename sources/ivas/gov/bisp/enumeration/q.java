package ivas.gov.bisp.enumeration;

import androidx.appcompat.app.AppCompatActivity;
import ivas.gov.bisp.enumeration.bK.ak;
import ivas.gov.bisp.enumeration.models.NewLocationForm;
import ivas.gov.bisp.enumeration.models.Survey;
import ivas.gov.bisp.enumeration.p026az.C0104p;
import ivas.gov.bisp.enumeration.p026az.z;
import ivas.gov.bisp.enumeration.p043bp.A;
import ivas.gov.bisp.enumeration.p043bp.am;

/* JADX INFO: loaded from: classes.dex */
public class q implements ivas.gov.bisp.enumeration.W.t {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ ActivityBeginSurvey.OooO0o c;

    public q(ActivityBeginSurvey.OooO0o oooO0o) {
        this.c = oooO0o;
    }

    @Override // ivas.gov.bisp.enumeration.W.t
    public void notValidData() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 21;
        int i4 = i2 | 21;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        C0104p c0104pC = C0104p.c();
        AppCompatActivity appCompatActivity = ActivityBeginSurvey.this.ae;
        am amVar = new am(this, 0);
        int i7 = a;
        int i8 = (((i7 ^ 67) | (i7 & 67)) << 1) - (((~i7) & 67) | (i7 & (-68)));
        b = i8 % 128;
        if (i8 % 2 != 0) {
            c0104pC.e(appCompatActivity, "No Locality Data!", "Please get Locality data from supervisor", amVar, true);
        } else {
            c0104pC.e(appCompatActivity, "No Locality Data!", "Please get Locality data from supervisor", amVar, false);
        }
        int i9 = a;
        int i10 = i9 ^ 87;
        int i11 = (i9 & 87) << 1;
        int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
        b = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 56 / 0;
        }
    }

    @Override // ivas.gov.bisp.enumeration.W.t
    public void notValidSupervisor() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 87;
        int i4 = (((i2 ^ 87) | i3) << 1) - ((i2 | 87) & (~i3));
        a = i4 % 128;
        if (i4 % 2 == 0) {
            C0104p.c();
            AppCompatActivity appCompatActivity = ActivityBeginSurvey.this.ae;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        C0104p c0104pC = C0104p.c();
        AppCompatActivity appCompatActivity2 = ActivityBeginSurvey.this.ae;
        A a2 = new A(this, 0);
        int i5 = b;
        int i6 = (((i5 | 47) << 1) - (~(-(i5 ^ 47)))) - 1;
        a = i6 % 128;
        int i7 = i6 % 2;
        c0104pC.e(appCompatActivity2, "No valid locality data!", "Please get Locality data from your respective supervisor", a2, false);
        int i8 = b;
        int i9 = i8 & 9;
        int i10 = -(-(i8 | 9));
        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
        a = i11 % 128;
        int i12 = i11 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.W.t
    public void notValidVersion() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 115;
        int i4 = -(-((i2 ^ 115) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        C0104p c0104pC = C0104p.c();
        AppCompatActivity appCompatActivity = ActivityBeginSurvey.this.ae;
        A a2 = new A(this, 1);
        int i7 = a;
        int i8 = i7 & 71;
        int i9 = i8 + ((i7 ^ 71) | i8);
        b = i9 % 128;
        int i10 = i9 % 2;
        c0104pC.e(appCompatActivity, "Oops!", "Your application version is old.Kindly update the new version to proceed", a2, false);
        int i11 = a + 87;
        b = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 2 / 0;
        }
    }

    @Override // ivas.gov.bisp.enumeration.W.t
    public void validData(NewLocationForm newLocationForm) {
        int i = 2 % 2;
        ActivityBeginSurvey activityBeginSurvey = ActivityBeginSurvey.this;
        activityBeginSurvey.aA = newLocationForm;
        Survey survey = new Survey(z.e(), ak.c());
        int i2 = a;
        int i3 = i2 & 105;
        int i4 = -(-((i2 ^ 105) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            activityBeginSurvey.aG = survey;
            ActivityBeginSurvey.this.D();
            int i6 = 6 / 0;
        } else {
            activityBeginSurvey.aG = survey;
            ActivityBeginSurvey.this.D();
        }
        int i7 = a;
        int i8 = ((i7 & (-114)) | ((~i7) & 113)) + ((i7 & 113) << 1);
        b = i8 % 128;
        int i9 = i8 % 2;
    }
}
