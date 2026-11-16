package ivas.gov.bisp.enumeration.bX;

import ivas.gov.bisp.enumeration.p100w.r;
import java.util.List;
import org.acra.ReportField;

/* JADX INFO: loaded from: classes.dex */
public final class t {
    private static int a = 0;
    private static int b = 1;
    public static final String c;
    public static final List<ReportField> d;

    static {
        ReportField[] reportFieldArr;
        ReportField reportField = ReportField.IS_SILENT;
        StringBuilder sb = new StringBuilder();
        sb.append("-");
        sb.append(reportField);
        c = sb.toString();
        int i = a;
        int i2 = i ^ 73;
        int i3 = ((((i & 73) | i2) << 1) - (~(-i2))) - 1;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            reportFieldArr = new ReportField[45];
            reportFieldArr[1] = ReportField.REPORT_ID;
            reportFieldArr[0] = ReportField.APP_VERSION_CODE;
            reportFieldArr[2] = ReportField.APP_VERSION_NAME;
            reportFieldArr[3] = ReportField.PACKAGE_NAME;
        } else {
            reportFieldArr = new ReportField[29];
            reportFieldArr[0] = ReportField.REPORT_ID;
            reportFieldArr[1] = ReportField.APP_VERSION_CODE;
            reportFieldArr[2] = ReportField.APP_VERSION_NAME;
            reportFieldArr[3] = ReportField.PACKAGE_NAME;
        }
        reportFieldArr[4] = ReportField.FILE_PATH;
        reportFieldArr[5] = ReportField.PHONE_MODEL;
        reportFieldArr[6] = ReportField.BRAND;
        reportFieldArr[7] = ReportField.PRODUCT;
        ReportField reportField2 = ReportField.ANDROID_VERSION;
        int i4 = b;
        int i5 = ((i4 | 40) << 1) - (i4 ^ 40);
        int i6 = (i5 ^ (-1)) + (i5 << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        reportFieldArr[8] = reportField2;
        reportFieldArr[9] = ReportField.BUILD;
        reportFieldArr[10] = ReportField.TOTAL_MEM_SIZE;
        reportFieldArr[11] = ReportField.AVAILABLE_MEM_SIZE;
        reportFieldArr[12] = ReportField.BUILD_CONFIG;
        int i8 = b;
        int i9 = i8 & 19;
        int i10 = (i8 ^ 19) | i9;
        int i11 = (i9 & i10) + (i10 | i9);
        a = i11 % 128;
        if (i11 % 2 != 0) {
            reportFieldArr[13] = ReportField.CUSTOM_DATA;
            reportFieldArr[22] = reportField;
            reportFieldArr[98] = ReportField.STACK_TRACE;
            reportFieldArr[9] = ReportField.INITIAL_CONFIGURATION;
            reportFieldArr[32] = ReportField.CRASH_CONFIGURATION;
        } else {
            reportFieldArr[13] = ReportField.CUSTOM_DATA;
            reportFieldArr[14] = reportField;
            reportFieldArr[15] = ReportField.STACK_TRACE;
            reportFieldArr[16] = ReportField.INITIAL_CONFIGURATION;
            reportFieldArr[17] = ReportField.CRASH_CONFIGURATION;
        }
        reportFieldArr[18] = ReportField.DISPLAY;
        reportFieldArr[19] = ReportField.USER_COMMENT;
        reportFieldArr[20] = ReportField.USER_EMAIL;
        reportFieldArr[21] = ReportField.USER_APP_START_DATE;
        ReportField reportField3 = ReportField.USER_CRASH_DATE;
        int i12 = a;
        int i13 = (((i12 ^ 35) | (i12 & 35)) << 1) - (((~i12) & 35) | (i12 & (-36)));
        b = i13 % 128;
        int i14 = i13 % 2;
        reportFieldArr[22] = reportField3;
        reportFieldArr[23] = ReportField.DUMPSYS_MEMINFO;
        reportFieldArr[24] = ReportField.LOGCAT;
        reportFieldArr[25] = ReportField.INSTALLATION_ID;
        reportFieldArr[26] = ReportField.DEVICE_FEATURES;
        int i15 = b;
        int i16 = (i15 & 95) + (i15 | 95);
        a = i16 % 128;
        int i17 = i16 % 2;
        reportFieldArr[27] = ReportField.ENVIRONMENT;
        reportFieldArr[28] = ReportField.SHARED_PREFERENCES;
        d = r.Q(reportFieldArr);
        int i18 = a + 123;
        b = i18 % 128;
        int i19 = i18 % 2;
    }
}
