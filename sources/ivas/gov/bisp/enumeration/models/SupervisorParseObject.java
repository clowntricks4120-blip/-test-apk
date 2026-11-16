package ivas.gov.bisp.enumeration.models;

/* JADX INFO: loaded from: classes.dex */
public class SupervisorParseObject {
    private static int a = 1;
    private static int b;
    private double dividerForPercentage;
    private Survey surveySupervisor;
    private VerificationQuestionsCount verificationQuestionsCount;

    public double getDividerForPercentage() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & (-32)) | ((~i2) & 31)) + ((i2 & 31) << 1);
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        double d = this.dividerForPercentage;
        int i6 = i4 + 113;
        a = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 24 / 0;
        }
        return d;
    }

    public Survey getSurveySupervisor() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 65) | (i2 & 65)) << 1;
        int i4 = -((i2 & (-66)) | ((~i2) & 65));
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        Survey survey = this.surveySupervisor;
        int i7 = (i2 & 19) + (i2 | 19);
        a = i7 % 128;
        if (i7 % 2 != 0) {
            return survey;
        }
        throw null;
    }

    public VerificationQuestionsCount getVerificationQuestionsCount() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 + 95;
        b = i3 % 128;
        int i4 = i3 % 2;
        VerificationQuestionsCount verificationQuestionsCount = this.verificationQuestionsCount;
        int i5 = i2 & 125;
        int i6 = i5 + ((i2 ^ 125) | i5);
        b = i6 % 128;
        if (i6 % 2 == 0) {
            return verificationQuestionsCount;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setDividerForPercentage(double d) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & 115) - (~(-(-(i2 | 115))))) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        this.dividerForPercentage = d;
        if (i4 != 0) {
            int i5 = 95 / 0;
        }
    }

    public void setSurveySupervisor(Survey survey) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-76)) | ((~i2) & 75);
        int i4 = -(-((i2 & 75) << 1));
        int i5 = (i3 & i4) + (i4 | i3);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        this.surveySupervisor = survey;
        int i8 = i6 & 85;
        int i9 = (i6 | 85) & (~i8);
        int i10 = -(-(i8 << 1));
        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
        a = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    public void setVerificationQuestionsCount(VerificationQuestionsCount verificationQuestionsCount) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 3;
        int i4 = ((i2 ^ 3) | i3) << 1;
        int i5 = -((~i3) & (i2 | 3));
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        this.verificationQuestionsCount = verificationQuestionsCount;
        if (i7 == 0) {
            throw null;
        }
        int i8 = ((i2 ^ 79) | (i2 & 79)) << 1;
        int i9 = -(((~i2) & 79) | (i2 & (-80)));
        int i10 = ((i8 | i9) << 1) - (i8 ^ i9);
        a = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }
}
