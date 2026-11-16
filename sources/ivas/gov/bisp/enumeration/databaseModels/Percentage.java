package ivas.gov.bisp.enumeration.databaseModels;

import androidx.annotation.Keep;
import ivas.gov.bisp.enumeration.o000Ooo.o0OO00O;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class Percentage {
    private static int a = 0;
    private static int b = 1;

    @o0OO00O("sampling_percentage")
    private double samplingPercentage;

    @o0OO00O("validation_percentage")
    private double validationPercentage;

    public double getSamplingPercentage() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-124)) | ((~i2) & 123);
        int i4 = -(-((i2 & 123) << 1));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        if (i5 % 2 == 0) {
            return this.samplingPercentage;
        }
        throw null;
    }

    public double getValidationPercentage() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 33;
        int i4 = ((i2 ^ 33) | i3) << 1;
        int i5 = -((~i3) & (i2 | 33));
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        a = i6 % 128;
        int i7 = i6 % 2;
        double d = this.validationPercentage;
        int i8 = (i2 ^ 61) + ((i2 & 61) << 1);
        a = i8 % 128;
        int i9 = i8 % 2;
        return d;
    }

    public void setSamplingPercentage(double d) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 67;
        int i4 = ((i2 ^ 67) | i3) << 1;
        int i5 = -((i2 | 67) & (~i3));
        int i6 = (i4 & i5) + (i5 | i4);
        int i7 = i6 % 128;
        b = i7;
        int i8 = i6 % 2;
        this.samplingPercentage = d;
        int i9 = (i7 ^ 89) + ((i7 & 89) << 1);
        a = i9 % 128;
        if (i9 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setValidationPercentage(double d) {
        int i = 2 % 2;
        int i2 = a + 95;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        this.validationPercentage = d;
        int i5 = i3 & 117;
        int i6 = (((i3 ^ 117) | i5) << 1) - ((~i5) & (i3 | 117));
        a = i6 % 128;
        int i7 = i6 % 2;
    }
}
