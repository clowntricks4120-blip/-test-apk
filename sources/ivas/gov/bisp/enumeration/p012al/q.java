package ivas.gov.bisp.enumeration.p012al;

import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import ivas.gov.bisp.enumeration.p081d.T;
import ivas.gov.bisp.enumeration.p081d.h;

/* JADX INFO: loaded from: classes.dex */
public class q extends InputConnectionWrapper {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ K c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(InputConnection inputConnection, boolean z, K k) {
        super(inputConnection, z);
        this.c = k;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x029b A[Catch: all -> 0x02cb, PHI: r4
  0x029b: PHI (r4v63 android.view.inputmethod.InputContentInfo) = (r4v57 android.view.inputmethod.InputContentInfo), (r4v64 android.view.inputmethod.InputContentInfo) binds: [B:97:0x0286, B:94:0x0281] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x02cb, blocks: (B:30:0x00d1, B:41:0x0116, B:50:0x0152, B:57:0x018f, B:65:0x01ce, B:72:0x020e, B:77:0x0219, B:82:0x0235, B:88:0x0265, B:89:0x0268, B:92:0x027b, B:100:0x029b, B:103:0x02b2, B:98:0x0288, B:96:0x0284, B:105:0x02c1, B:106:0x02c4, B:107:0x02ca, B:110:0x02ce, B:119:0x0311, B:121:0x0328, B:124:0x033b, B:126:0x0356, B:134:0x038f, B:135:0x0395, B:117:0x02f4, B:81:0x0230, B:75:0x0215), top: B:161:0x00d1 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x02c1 A[Catch: all -> 0x02cb, Exception -> 0x0396, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0396, blocks: (B:88:0x0265, B:105:0x02c1), top: B:160:0x0263 }] */
    /* JADX WARN: Code duplicated, block: B:10:0x0025 A[PHI: r5
  0x0025: PHI (r5v4 ivas.gov.bisp.enumeration.al.K) = (r5v3 ivas.gov.bisp.enumeration.al.K), (r5v27 ivas.gov.bisp.enumeration.al.K) binds: [B:9:0x0023, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:110:0x02ce A[Catch: all -> 0x02cb, PHI: r9
  0x02ce: PHI (r9v14 android.os.Bundle) = (r9v13 android.os.Bundle), (r9v13 android.os.Bundle), (r9v20 android.os.Bundle) binds: [B:83:0x0237, B:85:0x0255, B:104:0x02b7] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #2 {all -> 0x02cb, blocks: (B:30:0x00d1, B:41:0x0116, B:50:0x0152, B:57:0x018f, B:65:0x01ce, B:72:0x020e, B:77:0x0219, B:82:0x0235, B:88:0x0265, B:89:0x0268, B:92:0x027b, B:100:0x029b, B:103:0x02b2, B:98:0x0288, B:96:0x0284, B:105:0x02c1, B:106:0x02c4, B:107:0x02ca, B:110:0x02ce, B:119:0x0311, B:121:0x0328, B:124:0x033b, B:126:0x0356, B:134:0x038f, B:135:0x0395, B:117:0x02f4, B:81:0x0230, B:75:0x0215), top: B:161:0x00d1 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:116:0x02f2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:124:0x033b A[Catch: all -> 0x02cb, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x02cb, blocks: (B:30:0x00d1, B:41:0x0116, B:50:0x0152, B:57:0x018f, B:65:0x01ce, B:72:0x020e, B:77:0x0219, B:82:0x0235, B:88:0x0265, B:89:0x0268, B:92:0x027b, B:100:0x029b, B:103:0x02b2, B:98:0x0288, B:96:0x0284, B:105:0x02c1, B:106:0x02c4, B:107:0x02ca, B:110:0x02ce, B:119:0x0311, B:121:0x0328, B:124:0x033b, B:126:0x0356, B:134:0x038f, B:135:0x0395, B:117:0x02f4, B:81:0x0230, B:75:0x0215), top: B:161:0x00d1 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x036e  */
    /* JADX WARN: Code duplicated, block: B:12:0x003b  */
    /* JADX WARN: Code duplicated, block: B:131:0x037f  */
    /* JADX WARN: Code duplicated, block: B:132:0x0381  */
    /* JADX WARN: Code duplicated, block: B:134:0x038f A[Catch: all -> 0x02cb, TRY_ENTER, TryCatch #2 {all -> 0x02cb, blocks: (B:30:0x00d1, B:41:0x0116, B:50:0x0152, B:57:0x018f, B:65:0x01ce, B:72:0x020e, B:77:0x0219, B:82:0x0235, B:88:0x0265, B:89:0x0268, B:92:0x027b, B:100:0x029b, B:103:0x02b2, B:98:0x0288, B:96:0x0284, B:105:0x02c1, B:106:0x02c4, B:107:0x02ca, B:110:0x02ce, B:119:0x0311, B:121:0x0328, B:124:0x033b, B:126:0x0356, B:134:0x038f, B:135:0x0395, B:117:0x02f4, B:81:0x0230, B:75:0x0215), top: B:161:0x00d1 }] */
    /* JADX WARN: Code duplicated, block: B:136:0x0396  */
    /* JADX WARN: Code duplicated, block: B:138:0x0399  */
    /* JADX WARN: Code duplicated, block: B:140:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:141:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:14:0x004e  */
    /* JADX WARN: Code duplicated, block: B:151:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:153:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:155:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:15:0x0050  */
    /* JADX WARN: Code duplicated, block: B:17:0x0058  */
    /* JADX WARN: Code duplicated, block: B:20:0x0061  */
    /* JADX WARN: Code duplicated, block: B:23:0x0080  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:28:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:29:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:33:0x00da  */
    /* JADX WARN: Code duplicated, block: B:35:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:37:0x0102  */
    /* JADX WARN: Code duplicated, block: B:39:0x0112  */
    /* JADX WARN: Code duplicated, block: B:44:0x0129  */
    /* JADX WARN: Code duplicated, block: B:46:0x013e  */
    /* JADX WARN: Code duplicated, block: B:47:0x014c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0150  */
    /* JADX WARN: Code duplicated, block: B:52:0x015a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0172  */
    /* JADX WARN: Code duplicated, block: B:55:0x0175  */
    /* JADX WARN: Code duplicated, block: B:56:0x0176  */
    /* JADX WARN: Code duplicated, block: B:59:0x0195  */
    /* JADX WARN: Code duplicated, block: B:61:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:62:0x01be  */
    /* JADX WARN: Code duplicated, block: B:64:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:68:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:70:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:72:0x020e A[Catch: all -> 0x02cb, TRY_ENTER, TryCatch #2 {all -> 0x02cb, blocks: (B:30:0x00d1, B:41:0x0116, B:50:0x0152, B:57:0x018f, B:65:0x01ce, B:72:0x020e, B:77:0x0219, B:82:0x0235, B:88:0x0265, B:89:0x0268, B:92:0x027b, B:100:0x029b, B:103:0x02b2, B:98:0x0288, B:96:0x0284, B:105:0x02c1, B:106:0x02c4, B:107:0x02ca, B:110:0x02ce, B:119:0x0311, B:121:0x0328, B:124:0x033b, B:126:0x0356, B:134:0x038f, B:135:0x0395, B:117:0x02f4, B:81:0x0230, B:75:0x0215), top: B:161:0x00d1 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0214  */
    /* JADX WARN: Code duplicated, block: B:75:0x0215 A[Catch: all -> 0x02cb, TryCatch #2 {all -> 0x02cb, blocks: (B:30:0x00d1, B:41:0x0116, B:50:0x0152, B:57:0x018f, B:65:0x01ce, B:72:0x020e, B:77:0x0219, B:82:0x0235, B:88:0x0265, B:89:0x0268, B:92:0x027b, B:100:0x029b, B:103:0x02b2, B:98:0x0288, B:96:0x0284, B:105:0x02c1, B:106:0x02c4, B:107:0x02ca, B:110:0x02ce, B:119:0x0311, B:121:0x0328, B:124:0x033b, B:126:0x0356, B:134:0x038f, B:135:0x0395, B:117:0x02f4, B:81:0x0230, B:75:0x0215), top: B:161:0x00d1 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0219 A[Catch: all -> 0x02cb, PHI: r14
  0x0219: PHI (r14v18 int) = (r14v15 int), (r14v19 int) binds: [B:76:0x0217, B:74:0x0214] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #2 {all -> 0x02cb, blocks: (B:30:0x00d1, B:41:0x0116, B:50:0x0152, B:57:0x018f, B:65:0x01ce, B:72:0x020e, B:77:0x0219, B:82:0x0235, B:88:0x0265, B:89:0x0268, B:92:0x027b, B:100:0x029b, B:103:0x02b2, B:98:0x0288, B:96:0x0284, B:105:0x02c1, B:106:0x02c4, B:107:0x02ca, B:110:0x02ce, B:119:0x0311, B:121:0x0328, B:124:0x033b, B:126:0x0356, B:134:0x038f, B:135:0x0395, B:117:0x02f4, B:81:0x0230, B:75:0x0215), top: B:161:0x00d1 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x022d  */
    /* JADX WARN: Code duplicated, block: B:81:0x0230 A[Catch: all -> 0x02cb, PHI: r14
  0x0230: PHI (r14v16 int) = (r14v15 int), (r14v19 int) binds: [B:76:0x0217, B:73:0x0212] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #2 {all -> 0x02cb, blocks: (B:30:0x00d1, B:41:0x0116, B:50:0x0152, B:57:0x018f, B:65:0x01ce, B:72:0x020e, B:77:0x0219, B:82:0x0235, B:88:0x0265, B:89:0x0268, B:92:0x027b, B:100:0x029b, B:103:0x02b2, B:98:0x0288, B:96:0x0284, B:105:0x02c1, B:106:0x02c4, B:107:0x02ca, B:110:0x02ce, B:119:0x0311, B:121:0x0328, B:124:0x033b, B:126:0x0356, B:134:0x038f, B:135:0x0395, B:117:0x02f4, B:81:0x0230, B:75:0x0215), top: B:161:0x00d1 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0239  */
    /* JADX WARN: Code duplicated, block: B:86:0x0257  */
    /* JADX WARN: Code duplicated, block: B:88:0x0265 A[Catch: all -> 0x02cb, Exception -> 0x0396, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0396, blocks: (B:88:0x0265, B:105:0x02c1), top: B:160:0x0263 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x027b A[Catch: all -> 0x02cb, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x02cb, blocks: (B:30:0x00d1, B:41:0x0116, B:50:0x0152, B:57:0x018f, B:65:0x01ce, B:72:0x020e, B:77:0x0219, B:82:0x0235, B:88:0x0265, B:89:0x0268, B:92:0x027b, B:100:0x029b, B:103:0x02b2, B:98:0x0288, B:96:0x0284, B:105:0x02c1, B:106:0x02c4, B:107:0x02ca, B:110:0x02ce, B:119:0x0311, B:121:0x0328, B:124:0x033b, B:126:0x0356, B:134:0x038f, B:135:0x0395, B:117:0x02f4, B:81:0x0230, B:75:0x0215), top: B:161:0x00d1 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0284 A[Catch: all -> 0x02cb, TRY_ENTER, TryCatch #2 {all -> 0x02cb, blocks: (B:30:0x00d1, B:41:0x0116, B:50:0x0152, B:57:0x018f, B:65:0x01ce, B:72:0x020e, B:77:0x0219, B:82:0x0235, B:88:0x0265, B:89:0x0268, B:92:0x027b, B:100:0x029b, B:103:0x02b2, B:98:0x0288, B:96:0x0284, B:105:0x02c1, B:106:0x02c4, B:107:0x02ca, B:110:0x02ce, B:119:0x0311, B:121:0x0328, B:124:0x033b, B:126:0x0356, B:134:0x038f, B:135:0x0395, B:117:0x02f4, B:81:0x0230, B:75:0x0215), top: B:161:0x00d1 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0288 A[Catch: all -> 0x02cb, PHI: r4
  0x0288: PHI (r4v58 android.view.inputmethod.InputContentInfo) = (r4v57 android.view.inputmethod.InputContentInfo), (r4v64 android.view.inputmethod.InputContentInfo) binds: [B:97:0x0286, B:94:0x0281] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #2 {all -> 0x02cb, blocks: (B:30:0x00d1, B:41:0x0116, B:50:0x0152, B:57:0x018f, B:65:0x01ce, B:72:0x020e, B:77:0x0219, B:82:0x0235, B:88:0x0265, B:89:0x0268, B:92:0x027b, B:100:0x029b, B:103:0x02b2, B:98:0x0288, B:96:0x0284, B:105:0x02c1, B:106:0x02c4, B:107:0x02ca, B:110:0x02ce, B:119:0x0311, B:121:0x0328, B:124:0x033b, B:126:0x0356, B:134:0x038f, B:135:0x0395, B:117:0x02f4, B:81:0x0230, B:75:0x0215), top: B:161:0x00d1 }] */
    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String str, Bundle bundle) throws Throwable {
        K k;
        boolean z;
        String str2;
        Object obj;
        ResultReceiver resultReceiver;
        String str3;
        Uri uri;
        int i;
        String str4;
        ClipDescription clipDescription;
        int i2;
        String str5;
        Uri uri2;
        String str6;
        int i3;
        String str7;
        Bundle bundle2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        aa.aXK axm;
        Z z2;
        ClipData clipData;
        int i11;
        h.aWm awn;
        Uri uriE;
        int i12;
        h hVarM;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Object objD;
        int i18;
        InputContentInfo inputContentInfo;
        Bundle bundle3;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28 = 2 % 2;
        int i29 = a;
        int i30 = i29 & 91;
        int i31 = i30 + ((i29 ^ 91) | i30);
        b = i31 % 128;
        if (i31 % 2 == 0) {
            k = this.c;
            if (bundle != null) {
                int i32 = ((i29 & 89) - (~(i29 | 89))) - 1;
                b = i32 % 128;
                int i33 = i32 % 2;
                if (TextUtils.equals("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                    int i34 = b;
                    i26 = (((i34 & (-56)) | ((~i34) & 55)) - (~((i34 & 55) << 1))) - 1;
                    int i35 = i26 % 128;
                    a = i35;
                    if (i26 % 2 == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    int i36 = i35 + 1;
                    b = i36 % 128;
                    int i37 = i36 % 2;
                } else if (!TextUtils.equals("android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                    int i38 = b;
                    int i39 = i38 & 27;
                    int i40 = ((i38 | 27) & (~i39)) + (i39 << 1);
                    int i41 = i40 % 128;
                    a = i41;
                    int i42 = i40 % 2;
                    int i43 = ((i41 | 89) << 1) - (i41 ^ 89);
                    b = i43 % 128;
                    int i44 = i43 % 2;
                    z = true;
                }
                if (z) {
                    int i45 = b;
                    int i46 = ((i45 | 41) << 1) - (((~i45) & 41) | (i45 & (-42)));
                    int i47 = i46 % 128;
                    a = i47;
                    int i48 = i46 % 2;
                    int i49 = ((i47 | 38) << 1) - (i47 ^ 38);
                    int i50 = (i49 ^ (-1)) + (i49 << 1);
                    b = i50 % 128;
                    int i51 = i50 % 2;
                    str2 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
                } else {
                    int i52 = a;
                    int i53 = (((i52 | 86) << 1) - (i52 ^ 86)) - 1;
                    b = i53 % 128;
                    int i54 = i53 % 2;
                    str2 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
                }
                obj = null;
                resultReceiver = (ResultReceiver) bundle.getParcelable(str2);
                if (z) {
                    int i55 = a;
                    int i56 = (i55 ^ 114) + ((i55 & 114) << 1);
                    int i57 = (i56 ^ (-1)) + (i56 << 1);
                    b = i57 % 128;
                    int i58 = i57 % 2;
                    str3 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI";
                } else {
                    str3 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI";
                }
                uri = (Uri) bundle.getParcelable(str3);
                if (z) {
                    int i59 = a;
                    int i60 = i59 & 7;
                    int i61 = -(-((i59 ^ 7) | i60));
                    int i62 = ((i60 | i61) << 1) - (i61 ^ i60);
                    b = i62 % 128;
                    int i63 = i62 % 2;
                    int i64 = i59 & 73;
                    i25 = i64 + ((i59 ^ 73) | i64);
                    b = i25 % 128;
                    if (i25 % 2 != 0) {
                        int i65 = 2 / 4;
                    }
                    str4 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
                } else {
                    int i66 = a;
                    i = ((i66 ^ 68) + ((i66 & 68) << 1)) - 1;
                    b = i % 128;
                    if (i % 2 != 0) {
                        int i67 = 4 / 5;
                    }
                    str4 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
                }
                clipDescription = (ClipDescription) bundle.getParcelable(str4);
                i2 = a;
                int i68 = i2 + 49;
                b = i68 % 128;
                int i69 = i68 % 2;
                if (z) {
                    int i70 = ((~i2) & 77) | (i2 & (-78));
                    int i71 = -(-((i2 & 77) << 1));
                    i23 = (i70 ^ i71) + ((i70 & i71) << 1);
                    i24 = i23 % 128;
                    b = i24;
                    if (i23 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    int i72 = (i24 ^ 93) + ((i24 & 93) << 1);
                    a = i72 % 128;
                    int i73 = i72 % 2;
                    str5 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
                } else {
                    str5 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
                }
                uri2 = (Uri) bundle.getParcelable(str5);
                if (z) {
                    int i74 = a;
                    int i75 = i74 & 43;
                    int i76 = (~i75) & (i74 | 43);
                    int i77 = -(-(i75 << 1));
                    i22 = ((i76 | i77) << 1) - (i76 ^ i77);
                    b = i22 % 128;
                    if (i22 % 2 == 0) {
                        throw null;
                    }
                    str6 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
                } else {
                    str6 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
                    int i78 = a;
                    int i79 = (59 & (~i78)) | (i78 & (-60));
                    int i80 = (i78 & 59) << 1;
                    int i81 = (i79 ^ i80) + ((i79 & i80) << 1);
                    b = i81 % 128;
                    int i82 = i81 % 2;
                }
                i3 = bundle.getInt(str6);
                if (z) {
                    i20 = a;
                    i21 = (((i20 | 76) << 1) - (i20 ^ 76)) - 1;
                    b = i21 % 128;
                    if (i21 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    int i83 = i20 & 99;
                    int i84 = ((i20 ^ 99) | i83) << 1;
                    int i85 = -((i20 | 99) & (~i83));
                    int i86 = (i84 ^ i85) + ((i85 & i84) << 1);
                    b = i86 % 128;
                    int i87 = i86 % 2;
                    str7 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
                } else {
                    int i88 = b + 55;
                    a = i88 % 128;
                    int i89 = i88 % 2;
                    str7 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
                }
                bundle2 = (Bundle) bundle.getParcelable(str7);
                int i90 = b;
                int i91 = i90 & 41;
                int i92 = i90 | 41;
                int i93 = ((i91 | i92) << 1) - (i92 ^ i91);
                i4 = i93 % 128;
                a = i4;
                int i94 = i93 % 2;
                if (uri != null) {
                    int i95 = ((i4 & (-38)) | (37 & (~i4))) + ((i4 & 37) << 1);
                    i8 = i95 % 128;
                    b = i8;
                    int i96 = i95 % 2;
                    if (clipDescription != null) {
                        int i97 = (i8 | 33) << 1;
                        int i98 = -(i8 ^ 33);
                        i9 = ((i97 | i98) << 1) - (i98 ^ i97);
                        a = i9 % 128;
                        if (i9 % 2 == 0) {
                            i10 = Build.VERSION.SDK_INT;
                            if (i10 >= 18) {
                                axm = new aa.aXL(uri, clipDescription, uri2);
                                int i99 = b + 112;
                                i19 = (i99 ^ (-1)) + (i99 << 1);
                                a = i19 % 128;
                                if (i19 % 2 == 0) {
                                    int i100 = 4 / 4;
                                }
                            } else {
                                axm = new aa.aXM(uri, clipDescription, uri2);
                            }
                        } else {
                            i10 = Build.VERSION.SDK_INT;
                            if (i10 >= 25) {
                                axm = new aa.aXL(uri, clipDescription, uri2);
                                int i910 = b + 112;
                                i19 = (i910 ^ (-1)) + (i910 << 1);
                                a = i19 % 128;
                                if (i19 % 2 == 0) {
                                    int i101 = 4 / 4;
                                }
                            } else {
                                axm = new aa.aXM(uri, clipDescription, uri2);
                            }
                        }
                        z2 = (Z) k;
                        if (i10 >= 25) {
                            i16 = a;
                            int i102 = ((i16 ^ 29) | (i16 & 29)) << 1;
                            int i103 = -((i16 & (-30)) | (29 & (~i16)));
                            int i104 = (i102 & i103) + (i102 | i103);
                            b = i104 % 128;
                            int i105 = i104 % 2;
                            if ((i3 & 1) != 0) {
                                i17 = (((i16 | 56) << 1) - (i16 ^ 56)) - 1;
                                b = i17 % 128;
                                if (i17 % 2 == 0) {
                                    axm.b();
                                    axm.d();
                                    obj.hashCode();
                                    throw null;
                                }
                                axm.b();
                                objD = axm.d();
                                int i106 = b;
                                i18 = (i106 ^ 83) + ((i106 & 83) << 1);
                                a = i18 % 128;
                                if (i18 % 2 == 0) {
                                    inputContentInfo = (InputContentInfo) objD;
                                    int i107 = 71 / 0;
                                    if (bundle2 == null) {
                                        bundle3 = new Bundle();
                                        int i108 = a;
                                        int i109 = ((i108 & 118) + (i108 | 118)) - 1;
                                        b = i109 % 128;
                                        int i110 = i109 % 2;
                                    } else {
                                        bundle3 = new Bundle(bundle2);
                                        int i111 = a;
                                        int i112 = i111 & 113;
                                        int i113 = (i111 ^ 113) | i112;
                                        int i114 = ((i112 | i113) << 1) - (i113 ^ i112);
                                        b = i114 % 128;
                                        int i115 = i114 % 2;
                                    }
                                } else {
                                    inputContentInfo = (InputContentInfo) objD;
                                    if (bundle2 == null) {
                                        bundle3 = new Bundle();
                                        int i1010 = a;
                                        int i1011 = ((i1010 & 118) + (i1010 | 118)) - 1;
                                        b = i1011 % 128;
                                        int i116 = i1011 % 2;
                                    } else {
                                        bundle3 = new Bundle(bundle2);
                                        int i117 = a;
                                        int i118 = i117 & 113;
                                        int i119 = (i117 ^ 113) | i118;
                                        int i1110 = ((i118 | i119) << 1) - (i119 ^ i118);
                                        b = i1110 % 128;
                                        int i1111 = i1110 % 2;
                                    }
                                }
                                bundle2 = bundle3;
                                bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
                                int i120 = b + 65;
                                a = i120 % 128;
                                int i121 = i120 % 2;
                                clipData = new ClipData(axm.c(), new ClipData.Item(axm.a()));
                                i11 = b + 109;
                                a = i11 % 128;
                                if (i11 % 2 == 0) {
                                    awn = new h.aWo(clipData, 2);
                                    int i122 = a;
                                    int i123 = i122 & 53;
                                    int i124 = -(-((i122 ^ 53) | i123));
                                    int i125 = (i123 & i124) + (i124 | i123);
                                    b = i125 % 128;
                                    int i126 = i125 % 2;
                                } else {
                                    awn = new h.aWo(clipData, 2);
                                    int i127 = a;
                                    int i128 = i127 & 53;
                                    int i129 = -(-((i127 ^ 53) | i128));
                                    int i1210 = (i128 & i129) + (i129 | i128);
                                    b = i1210 % 128;
                                    int i1211 = i1210 % 2;
                                }
                                uriE = axm.e();
                                int i130 = b;
                                int i131 = i130 & 7;
                                i12 = i131 + ((i130 ^ 7) | i131);
                                a = i12 % 128;
                                if (i12 % 2 != 0) {
                                    awn.e(uriE);
                                    obj.hashCode();
                                    throw null;
                                }
                                awn.e(uriE);
                                awn.setExtras(bundle2);
                                h hVarB = awn.b();
                                int i132 = a;
                                int i133 = i132 & 31;
                                int i134 = -(-((i132 ^ 31) | i133));
                                int i135 = (i133 & i134) + (i134 | i133);
                                b = i135 % 128;
                                int i136 = i135 % 2;
                                hVarM = T.m(z2.c, hVarB);
                                int i137 = b;
                                int i138 = i137 ^ 21;
                                int i139 = (i137 & 21) << 1;
                                int i140 = (i138 & i139) + (i139 | i138);
                                i13 = i140 % 128;
                                a = i13;
                                int i141 = i140 % 2;
                                if (hVarM == null) {
                                    int i142 = i13 & 75;
                                    int i143 = (i13 ^ 75) | i142;
                                    i14 = (i142 ^ i143) + ((i142 & i143) << 1);
                                    b = i14 % 128;
                                    if (i14 % 2 != 0) {
                                        i15 = 1;
                                    } else {
                                        i15 = 0;
                                    }
                                    i5 = i15 ^ 1;
                                    int i144 = ((i13 | 47) << 1) - (i13 ^ 47);
                                    b = i144 % 128;
                                    int i145 = i144 % 2;
                                } else {
                                    i5 = 0;
                                }
                            } else {
                                clipData = new ClipData(axm.c(), new ClipData.Item(axm.a()));
                                i11 = b + 109;
                                a = i11 % 128;
                                if (i11 % 2 == 0) {
                                    awn = new h.aWo(clipData, 2);
                                    int i1212 = a;
                                    int i1213 = i1212 & 53;
                                    int i1214 = -(-((i1212 ^ 53) | i1213));
                                    int i1215 = (i1213 & i1214) + (i1214 | i1213);
                                    b = i1215 % 128;
                                    int i1216 = i1215 % 2;
                                } else {
                                    awn = new h.aWo(clipData, 2);
                                    int i1217 = a;
                                    int i1218 = i1217 & 53;
                                    int i1219 = -(-((i1217 ^ 53) | i1218));
                                    int i12110 = (i1218 & i1219) + (i1219 | i1218);
                                    b = i12110 % 128;
                                    int i12111 = i12110 % 2;
                                }
                                uriE = axm.e();
                                int i1310 = b;
                                int i1311 = i1310 & 7;
                                i12 = i1311 + ((i1310 ^ 7) | i1311);
                                a = i12 % 128;
                                if (i12 % 2 != 0) {
                                    awn.e(uriE);
                                    obj.hashCode();
                                    throw null;
                                }
                                awn.e(uriE);
                                awn.setExtras(bundle2);
                                h hVarB2 = awn.b();
                                int i1312 = a;
                                int i1313 = i1312 & 31;
                                int i1314 = -(-((i1312 ^ 31) | i1313));
                                int i1315 = (i1313 & i1314) + (i1314 | i1313);
                                b = i1315 % 128;
                                int i1316 = i1315 % 2;
                                hVarM = T.m(z2.c, hVarB2);
                                int i1317 = b;
                                int i1318 = i1317 ^ 21;
                                int i1319 = (i1317 & 21) << 1;
                                int i146 = (i1318 & i1319) + (i1319 | i1318);
                                i13 = i146 % 128;
                                a = i13;
                                int i147 = i146 % 2;
                                if (hVarM == null) {
                                    int i148 = i13 & 75;
                                    int i149 = (i13 ^ 75) | i148;
                                    i14 = (i148 ^ i149) + ((i148 & i149) << 1);
                                    b = i14 % 128;
                                    if (i14 % 2 != 0) {
                                        i15 = 1;
                                    } else {
                                        i15 = 0;
                                    }
                                    i5 = i15 ^ 1;
                                    int i1410 = ((i13 | 47) << 1) - (i13 ^ 47);
                                    b = i1410 % 128;
                                    int i1411 = i1410 % 2;
                                } else {
                                    i5 = 0;
                                }
                            }
                        } else {
                            clipData = new ClipData(axm.c(), new ClipData.Item(axm.a()));
                            i11 = b + 109;
                            a = i11 % 128;
                            if (i11 % 2 == 0) {
                                awn = new h.aWo(clipData, 2);
                                int i12112 = a;
                                int i12113 = i12112 & 53;
                                int i12114 = -(-((i12112 ^ 53) | i12113));
                                int i12115 = (i12113 & i12114) + (i12114 | i12113);
                                b = i12115 % 128;
                                int i12116 = i12115 % 2;
                            } else {
                                awn = new h.aWo(clipData, 2);
                                int i12117 = a;
                                int i12118 = i12117 & 53;
                                int i12119 = -(-((i12117 ^ 53) | i12118));
                                int i121110 = (i12118 & i12119) + (i12119 | i12118);
                                b = i121110 % 128;
                                int i121111 = i121110 % 2;
                            }
                            uriE = axm.e();
                            int i13110 = b;
                            int i13111 = i13110 & 7;
                            i12 = i13111 + ((i13110 ^ 7) | i13111);
                            a = i12 % 128;
                            if (i12 % 2 != 0) {
                                awn.e(uriE);
                                obj.hashCode();
                                throw null;
                            }
                            awn.e(uriE);
                            awn.setExtras(bundle2);
                            h hVarB3 = awn.b();
                            int i13112 = a;
                            int i13113 = i13112 & 31;
                            int i13114 = -(-((i13112 ^ 31) | i13113));
                            int i13115 = (i13113 & i13114) + (i13114 | i13113);
                            b = i13115 % 128;
                            int i13116 = i13115 % 2;
                            hVarM = T.m(z2.c, hVarB3);
                            int i13117 = b;
                            int i13118 = i13117 ^ 21;
                            int i13119 = (i13117 & 21) << 1;
                            int i1412 = (i13118 & i13119) + (i13119 | i13118);
                            i13 = i1412 % 128;
                            a = i13;
                            int i1413 = i1412 % 2;
                            if (hVarM == null) {
                                int i1414 = i13 & 75;
                                int i1415 = (i13 ^ 75) | i1414;
                                i14 = (i1414 ^ i1415) + ((i1414 & i1415) << 1);
                                b = i14 % 128;
                                if (i14 % 2 != 0) {
                                    i15 = 1;
                                } else {
                                    i15 = 0;
                                }
                                i5 = i15 ^ 1;
                                int i1416 = ((i13 | 47) << 1) - (i13 ^ 47);
                                b = i1416 % 128;
                                int i1417 = i1416 % 2;
                            } else {
                                i5 = 0;
                            }
                        }
                    } else {
                        i5 = 0;
                    }
                } else {
                    i5 = 0;
                }
                if (resultReceiver != null) {
                    int i150 = b;
                    i7 = (i150 ^ 77) + ((i150 & 77) << 1);
                    a = i7 % 128;
                    if (i7 % 2 != 0) {
                        resultReceiver.send(i5, null);
                        obj.hashCode();
                        throw null;
                    }
                    resultReceiver.send(i5, null);
                }
                i6 = i5;
            }
            if ((i6 ^ 1) == 0) {
                int i151 = b;
                int i152 = (i151 & 30) + (i151 | 30);
                int i153 = (i152 ^ (-1)) + (i152 << 1);
                a = i153 % 128;
                int i154 = i153 % 2;
                return true;
            }
            boolean zPerformPrivateCommand = super.performPrivateCommand(str, bundle);
            int i155 = a;
            int i156 = (i155 & (-12)) | ((~i155) & 11);
            int i157 = (i155 & 11) << 1;
            i27 = (i156 & i157) + (i157 | i156);
            b = i27 % 128;
            if (i27 % 2 != 0) {
                int i158 = 26 / 0;
            }
            return zPerformPrivateCommand;
        }
        k = this.c;
        if (bundle != null) {
            int i310 = ((i29 & 89) - (~(i29 | 89))) - 1;
            b = i310 % 128;
            int i311 = i310 % 2;
            if (TextUtils.equals("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                int i312 = b;
                i26 = (((i312 & (-56)) | ((~i312) & 55)) - (~((i312 & 55) << 1))) - 1;
                int i313 = i26 % 128;
                a = i313;
                if (i26 % 2 == 0) {
                    z = true;
                } else {
                    z = false;
                }
                int i314 = i313 + 1;
                b = i314 % 128;
                int i315 = i314 % 2;
            } else if (!TextUtils.equals("android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                int i316 = b;
                int i317 = i316 & 27;
                int i410 = ((i316 | 27) & (~i317)) + (i317 << 1);
                int i411 = i410 % 128;
                a = i411;
                int i412 = i410 % 2;
                int i413 = ((i411 | 89) << 1) - (i411 ^ 89);
                b = i413 % 128;
                int i414 = i413 % 2;
                z = true;
            }
            if (z) {
                int i415 = b;
                int i416 = ((i415 | 41) << 1) - (((~i415) & 41) | (i415 & (-42)));
                int i417 = i416 % 128;
                a = i417;
                int i418 = i416 % 2;
                int i419 = ((i417 | 38) << 1) - (i417 ^ 38);
                int i510 = (i419 ^ (-1)) + (i419 << 1);
                b = i510 % 128;
                int i511 = i510 % 2;
                str2 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
            } else {
                int i512 = a;
                int i513 = (((i512 | 86) << 1) - (i512 ^ 86)) - 1;
                b = i513 % 128;
                int i514 = i513 % 2;
                str2 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
            }
            obj = null;
            try {
                resultReceiver = (ResultReceiver) bundle.getParcelable(str2);
                if (z) {
                    int i515 = a;
                    int i516 = (i515 ^ 114) + ((i515 & 114) << 1);
                    int i517 = (i516 ^ (-1)) + (i516 << 1);
                    b = i517 % 128;
                    int i518 = i517 % 2;
                    str3 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI";
                } else {
                    str3 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI";
                }
                try {
                    uri = (Uri) bundle.getParcelable(str3);
                    if (z) {
                        int i519 = a;
                        int i610 = i519 & 7;
                        int i611 = -(-((i519 ^ 7) | i610));
                        int i612 = ((i610 | i611) << 1) - (i611 ^ i610);
                        b = i612 % 128;
                        int i613 = i612 % 2;
                        int i614 = i519 & 73;
                        i25 = i614 + ((i519 ^ 73) | i614);
                        b = i25 % 128;
                        if (i25 % 2 != 0) {
                            int i615 = 2 / 4;
                        }
                        str4 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
                    } else {
                        int i616 = a;
                        i = ((i616 ^ 68) + ((i616 & 68) << 1)) - 1;
                        b = i % 128;
                        if (i % 2 != 0) {
                            int i617 = 4 / 5;
                        }
                        str4 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
                    }
                    clipDescription = (ClipDescription) bundle.getParcelable(str4);
                    i2 = a;
                    int i618 = i2 + 49;
                    b = i618 % 128;
                    int i619 = i618 % 2;
                    if (z) {
                        int i710 = ((~i2) & 77) | (i2 & (-78));
                        int i711 = -(-((i2 & 77) << 1));
                        i23 = (i710 ^ i711) + ((i710 & i711) << 1);
                        i24 = i23 % 128;
                        b = i24;
                        if (i23 % 2 == 0) {
                            obj.hashCode();
                            throw null;
                        }
                        int i712 = (i24 ^ 93) + ((i24 & 93) << 1);
                        a = i712 % 128;
                        int i713 = i712 % 2;
                        str5 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
                    } else {
                        str5 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
                    }
                    uri2 = (Uri) bundle.getParcelable(str5);
                    if (z) {
                        int i714 = a;
                        int i715 = i714 & 43;
                        int i716 = (~i715) & (i714 | 43);
                        int i717 = -(-(i715 << 1));
                        i22 = ((i716 | i717) << 1) - (i716 ^ i717);
                        b = i22 % 128;
                        if (i22 % 2 == 0) {
                            throw null;
                        }
                        str6 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
                    } else {
                        str6 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
                        int i718 = a;
                        int i719 = (59 & (~i718)) | (i718 & (-60));
                        int i810 = (i718 & 59) << 1;
                        int i811 = (i719 ^ i810) + ((i719 & i810) << 1);
                        b = i811 % 128;
                        int i812 = i811 % 2;
                    }
                    i3 = bundle.getInt(str6);
                    if (z) {
                        i20 = a;
                        i21 = (((i20 | 76) << 1) - (i20 ^ 76)) - 1;
                        b = i21 % 128;
                        if (i21 % 2 == 0) {
                            obj.hashCode();
                            throw null;
                        }
                        int i813 = i20 & 99;
                        int i814 = ((i20 ^ 99) | i813) << 1;
                        int i815 = -((i20 | 99) & (~i813));
                        int i816 = (i814 ^ i815) + ((i815 & i814) << 1);
                        b = i816 % 128;
                        int i817 = i816 % 2;
                        str7 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
                    } else {
                        int i818 = b + 55;
                        a = i818 % 128;
                        int i819 = i818 % 2;
                        str7 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
                    }
                    bundle2 = (Bundle) bundle.getParcelable(str7);
                    int i911 = b;
                    int i912 = i911 & 41;
                    int i913 = i911 | 41;
                    int i914 = ((i912 | i913) << 1) - (i913 ^ i912);
                    i4 = i914 % 128;
                    a = i4;
                    int i915 = i914 % 2;
                    if (uri != null) {
                        int i916 = ((i4 & (-38)) | (37 & (~i4))) + ((i4 & 37) << 1);
                        i8 = i916 % 128;
                        b = i8;
                        int i917 = i916 % 2;
                        if (clipDescription != null) {
                            int i918 = (i8 | 33) << 1;
                            int i919 = -(i8 ^ 33);
                            i9 = ((i918 | i919) << 1) - (i919 ^ i918);
                            a = i9 % 128;
                            if (i9 % 2 == 0) {
                                i10 = Build.VERSION.SDK_INT;
                                if (i10 >= 18) {
                                    axm = new aa.aXL(uri, clipDescription, uri2);
                                    int i9110 = b + 112;
                                    i19 = (i9110 ^ (-1)) + (i9110 << 1);
                                    a = i19 % 128;
                                    if (i19 % 2 == 0) {
                                        int i1012 = 4 / 4;
                                    }
                                } else {
                                    axm = new aa.aXM(uri, clipDescription, uri2);
                                }
                            } else {
                                i10 = Build.VERSION.SDK_INT;
                                if (i10 >= 25) {
                                    axm = new aa.aXL(uri, clipDescription, uri2);
                                    int i9111 = b + 112;
                                    i19 = (i9111 ^ (-1)) + (i9111 << 1);
                                    a = i19 % 128;
                                    if (i19 % 2 == 0) {
                                        int i1013 = 4 / 4;
                                    }
                                } else {
                                    axm = new aa.aXM(uri, clipDescription, uri2);
                                }
                            }
                            z2 = (Z) k;
                            if (i10 >= 25) {
                                i16 = a;
                                int i1014 = ((i16 ^ 29) | (i16 & 29)) << 1;
                                int i1015 = -((i16 & (-30)) | (29 & (~i16)));
                                int i1016 = (i1014 & i1015) + (i1014 | i1015);
                                b = i1016 % 128;
                                int i1017 = i1016 % 2;
                                if ((i3 & 1) != 0) {
                                    i17 = (((i16 | 56) << 1) - (i16 ^ 56)) - 1;
                                    b = i17 % 128;
                                    try {
                                        if (i17 % 2 == 0) {
                                            axm.b();
                                            axm.d();
                                            obj.hashCode();
                                            throw null;
                                        }
                                        axm.b();
                                        objD = axm.d();
                                        int i1018 = b;
                                        i18 = (i1018 ^ 83) + ((i1018 & 83) << 1);
                                        a = i18 % 128;
                                        if (i18 % 2 == 0) {
                                            inputContentInfo = (InputContentInfo) objD;
                                            int i1019 = 71 / 0;
                                            if (bundle2 == null) {
                                                bundle3 = new Bundle();
                                                int i10110 = a;
                                                int i10111 = ((i10110 & 118) + (i10110 | 118)) - 1;
                                                b = i10111 % 128;
                                                int i1112 = i10111 % 2;
                                            } else {
                                                bundle3 = new Bundle(bundle2);
                                                int i1113 = a;
                                                int i1114 = i1113 & 113;
                                                int i1115 = (i1113 ^ 113) | i1114;
                                                int i1116 = ((i1114 | i1115) << 1) - (i1115 ^ i1114);
                                                b = i1116 % 128;
                                                int i1117 = i1116 % 2;
                                            }
                                        } else {
                                            inputContentInfo = (InputContentInfo) objD;
                                            if (bundle2 == null) {
                                                bundle3 = new Bundle();
                                                int i10112 = a;
                                                int i10113 = ((i10112 & 118) + (i10112 | 118)) - 1;
                                                b = i10113 % 128;
                                                int i1118 = i10113 % 2;
                                            } else {
                                                bundle3 = new Bundle(bundle2);
                                                int i1119 = a;
                                                int i11110 = i1119 & 113;
                                                int i11111 = (i1119 ^ 113) | i11110;
                                                int i11112 = ((i11110 | i11111) << 1) - (i11111 ^ i11110);
                                                b = i11112 % 128;
                                                int i11113 = i11112 % 2;
                                            }
                                        }
                                        bundle2 = bundle3;
                                        bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
                                        int i1220 = b + 65;
                                        a = i1220 % 128;
                                        int i1221 = i1220 % 2;
                                        clipData = new ClipData(axm.c(), new ClipData.Item(axm.a()));
                                        i11 = b + 109;
                                        a = i11 % 128;
                                        if (i11 % 2 == 0 ? i10 < 31 : i10 < 24) {
                                            awn = new h.aWo(clipData, 2);
                                            int i121112 = a;
                                            int i121113 = i121112 & 53;
                                            int i121114 = -(-((i121112 ^ 53) | i121113));
                                            int i121115 = (i121113 & i121114) + (i121114 | i121113);
                                            b = i121115 % 128;
                                            int i121116 = i121115 % 2;
                                        } else {
                                            awn = new h.aWn(clipData, 2);
                                            int i159 = a;
                                            int i160 = i159 & 57;
                                            int i161 = ((i159 ^ 57) | i160) << 1;
                                            int i162 = -((i159 | 57) & (~i160));
                                            int i163 = (i161 ^ i162) + ((i162 & i161) << 1);
                                            b = i163 % 128;
                                            int i164 = i163 % 2;
                                        }
                                        uriE = axm.e();
                                        int i131110 = b;
                                        int i131111 = i131110 & 7;
                                        i12 = i131111 + ((i131110 ^ 7) | i131111);
                                        a = i12 % 128;
                                        if (i12 % 2 != 0) {
                                            awn.e(uriE);
                                            obj.hashCode();
                                            throw null;
                                        }
                                        awn.e(uriE);
                                        awn.setExtras(bundle2);
                                        h hVarB4 = awn.b();
                                        int i131112 = a;
                                        int i131113 = i131112 & 31;
                                        int i131114 = -(-((i131112 ^ 31) | i131113));
                                        int i131115 = (i131113 & i131114) + (i131114 | i131113);
                                        b = i131115 % 128;
                                        int i131116 = i131115 % 2;
                                        hVarM = T.m(z2.c, hVarB4);
                                        int i131117 = b;
                                        int i131118 = i131117 ^ 21;
                                        int i131119 = (i131117 & 21) << 1;
                                        int i1418 = (i131118 & i131119) + (i131119 | i131118);
                                        i13 = i1418 % 128;
                                        a = i13;
                                        int i1419 = i1418 % 2;
                                        if (hVarM == null) {
                                            int i14110 = i13 & 75;
                                            int i14111 = (i13 ^ 75) | i14110;
                                            i14 = (i14110 ^ i14111) + ((i14110 & i14111) << 1);
                                            b = i14 % 128;
                                            if (i14 % 2 != 0) {
                                                i15 = 1;
                                            } else {
                                                i15 = 0;
                                            }
                                            i5 = i15 ^ 1;
                                            int i14112 = ((i13 | 47) << 1) - (i13 ^ 47);
                                            b = i14112 % 128;
                                            int i14113 = i14112 % 2;
                                        } else {
                                            i5 = 0;
                                        }
                                    } catch (Exception unused) {
                                    }
                                } else {
                                    clipData = new ClipData(axm.c(), new ClipData.Item(axm.a()));
                                    i11 = b + 109;
                                    a = i11 % 128;
                                    if (i11 % 2 == 0) {
                                        awn = new h.aWo(clipData, 2);
                                        int i121117 = a;
                                        int i121118 = i121117 & 53;
                                        int i121119 = -(-((i121117 ^ 53) | i121118));
                                        int i1211110 = (i121118 & i121119) + (i121119 | i121118);
                                        b = i1211110 % 128;
                                        int i1211111 = i1211110 % 2;
                                    } else {
                                        awn = new h.aWo(clipData, 2);
                                        int i1211112 = a;
                                        int i1211113 = i1211112 & 53;
                                        int i1211114 = -(-((i1211112 ^ 53) | i1211113));
                                        int i1211115 = (i1211113 & i1211114) + (i1211114 | i1211113);
                                        b = i1211115 % 128;
                                        int i1211116 = i1211115 % 2;
                                    }
                                    uriE = axm.e();
                                    int i1311110 = b;
                                    int i1311111 = i1311110 & 7;
                                    i12 = i1311111 + ((i1311110 ^ 7) | i1311111);
                                    a = i12 % 128;
                                    if (i12 % 2 != 0) {
                                        awn.e(uriE);
                                        obj.hashCode();
                                        throw null;
                                    }
                                    awn.e(uriE);
                                    awn.setExtras(bundle2);
                                    h hVarB5 = awn.b();
                                    int i1311112 = a;
                                    int i1311113 = i1311112 & 31;
                                    int i1311114 = -(-((i1311112 ^ 31) | i1311113));
                                    int i1311115 = (i1311113 & i1311114) + (i1311114 | i1311113);
                                    b = i1311115 % 128;
                                    int i1311116 = i1311115 % 2;
                                    hVarM = T.m(z2.c, hVarB5);
                                    int i1311117 = b;
                                    int i1311118 = i1311117 ^ 21;
                                    int i1311119 = (i1311117 & 21) << 1;
                                    int i14114 = (i1311118 & i1311119) + (i1311119 | i1311118);
                                    i13 = i14114 % 128;
                                    a = i13;
                                    int i14115 = i14114 % 2;
                                    if (hVarM == null) {
                                        int i14116 = i13 & 75;
                                        int i14117 = (i13 ^ 75) | i14116;
                                        i14 = (i14116 ^ i14117) + ((i14116 & i14117) << 1);
                                        b = i14 % 128;
                                        if (i14 % 2 != 0) {
                                            i15 = 1;
                                        } else {
                                            i15 = 0;
                                        }
                                        i5 = i15 ^ 1;
                                        int i14118 = ((i13 | 47) << 1) - (i13 ^ 47);
                                        b = i14118 % 128;
                                        int i14119 = i14118 % 2;
                                    } else {
                                        i5 = 0;
                                    }
                                }
                            } else {
                                clipData = new ClipData(axm.c(), new ClipData.Item(axm.a()));
                                i11 = b + 109;
                                a = i11 % 128;
                                if (i11 % 2 == 0) {
                                    awn = new h.aWo(clipData, 2);
                                    int i1211117 = a;
                                    int i1211118 = i1211117 & 53;
                                    int i1211119 = -(-((i1211117 ^ 53) | i1211118));
                                    int i12111110 = (i1211118 & i1211119) + (i1211119 | i1211118);
                                    b = i12111110 % 128;
                                    int i12111111 = i12111110 % 2;
                                } else {
                                    awn = new h.aWo(clipData, 2);
                                    int i12111112 = a;
                                    int i12111113 = i12111112 & 53;
                                    int i12111114 = -(-((i12111112 ^ 53) | i12111113));
                                    int i12111115 = (i12111113 & i12111114) + (i12111114 | i12111113);
                                    b = i12111115 % 128;
                                    int i12111116 = i12111115 % 2;
                                }
                                uriE = axm.e();
                                int i13111110 = b;
                                int i13111111 = i13111110 & 7;
                                i12 = i13111111 + ((i13111110 ^ 7) | i13111111);
                                a = i12 % 128;
                                if (i12 % 2 != 0) {
                                    awn.e(uriE);
                                    obj.hashCode();
                                    throw null;
                                }
                                awn.e(uriE);
                                awn.setExtras(bundle2);
                                h hVarB6 = awn.b();
                                int i13111112 = a;
                                int i13111113 = i13111112 & 31;
                                int i13111114 = -(-((i13111112 ^ 31) | i13111113));
                                int i13111115 = (i13111113 & i13111114) + (i13111114 | i13111113);
                                b = i13111115 % 128;
                                int i13111116 = i13111115 % 2;
                                hVarM = T.m(z2.c, hVarB6);
                                int i13111117 = b;
                                int i13111118 = i13111117 ^ 21;
                                int i13111119 = (i13111117 & 21) << 1;
                                int i141110 = (i13111118 & i13111119) + (i13111119 | i13111118);
                                i13 = i141110 % 128;
                                a = i13;
                                int i141111 = i141110 % 2;
                                if (hVarM == null) {
                                    int i141112 = i13 & 75;
                                    int i141113 = (i13 ^ 75) | i141112;
                                    i14 = (i141112 ^ i141113) + ((i141112 & i141113) << 1);
                                    b = i14 % 128;
                                    if (i14 % 2 != 0) {
                                        i15 = 1;
                                    } else {
                                        i15 = 0;
                                    }
                                    i5 = i15 ^ 1;
                                    int i141114 = ((i13 | 47) << 1) - (i13 ^ 47);
                                    b = i141114 % 128;
                                    int i141115 = i141114 % 2;
                                } else {
                                    i5 = 0;
                                }
                            }
                        } else {
                            i5 = 0;
                        }
                    } else {
                        i5 = 0;
                    }
                    if (resultReceiver != null) {
                        int i1510 = b;
                        i7 = (i1510 ^ 77) + ((i1510 & 77) << 1);
                        a = i7 % 128;
                        if (i7 % 2 != 0) {
                            resultReceiver.send(i5, null);
                            obj.hashCode();
                            throw null;
                        }
                        resultReceiver.send(i5, null);
                    }
                    i6 = i5;
                } catch (Throwable th) {
                    th = th;
                    if (resultReceiver != null) {
                        int i165 = a + 37;
                        b = i165 % 128;
                        int i166 = i165 % 2;
                        resultReceiver.send(0, null);
                        int i167 = a;
                        int i168 = i167 ^ 45;
                        int i169 = (i167 & 45) << 1;
                        int i170 = ((i168 | i169) << 1) - (i169 ^ i168);
                        b = i170 % 128;
                        int i171 = i170 % 2;
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                resultReceiver = null;
            }
        }
        if ((i6 ^ 1) == 0) {
            int i1511 = b;
            int i1512 = (i1511 & 30) + (i1511 | 30);
            int i1513 = (i1512 ^ (-1)) + (i1512 << 1);
            a = i1513 % 128;
            int i1514 = i1513 % 2;
            return true;
        }
        boolean zPerformPrivateCommand2 = super.performPrivateCommand(str, bundle);
        int i1515 = a;
        int i1516 = (i1515 & (-12)) | ((~i1515) & 11);
        int i1517 = (i1515 & 11) << 1;
        i27 = (i1516 & i1517) + (i1517 | i1516);
        b = i27 % 128;
        if (i27 % 2 != 0) {
            int i1518 = 26 / 0;
        }
        return zPerformPrivateCommand2;
        i6 = 0;
        if ((i6 ^ 1) == 0) {
            int i1519 = b;
            int i15110 = (i1519 & 30) + (i1519 | 30);
            int i15111 = (i15110 ^ (-1)) + (i15110 << 1);
            a = i15111 % 128;
            int i15112 = i15111 % 2;
            return true;
        }
        boolean zPerformPrivateCommand3 = super.performPrivateCommand(str, bundle);
        int i15113 = a;
        int i15114 = (i15113 & (-12)) | ((~i15113) & 11);
        int i15115 = (i15113 & 11) << 1;
        i27 = (i15114 & i15115) + (i15115 | i15114);
        b = i27 % 128;
        if (i27 % 2 != 0) {
            int i15116 = 26 / 0;
        }
        return zPerformPrivateCommand3;
    }
}
