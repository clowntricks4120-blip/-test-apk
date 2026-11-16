package ivas.gov.bisp.enumeration.activity.authentication;

import android.app.Activity;
import android.app.ProgressDialog;
import ivas.gov.bisp.enumeration.bK.af;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.p024ax.I;
import ivas.gov.bisp.enumeration.p091n.j;

/* JADX INFO: loaded from: classes.dex */
public class d implements I {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ Activity c;
    public final /* synthetic */ Authentication.OooOo00 d;

    public d(Authentication.OooOo00 oooOo00, Activity activity) {
        this.d = oooOo00;
        this.c = activity;
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onError(ResponseMessage responseMessage) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & (-84)) | ((~i2) & 83)) + ((i2 & 83) << 1);
        b = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            Authentication authentication = Authentication.this;
            int i4 = Authentication.ac;
            ProgressDialog progressDialog = authentication.U;
            obj.hashCode();
            throw null;
        }
        Authentication authentication2 = Authentication.this;
        int i5 = Authentication.ac;
        ProgressDialog progressDialog2 = authentication2.U;
        if (progressDialog2 != null) {
            int i6 = b;
            int i7 = i6 & 51;
            int i8 = (i6 | 51) & (~i7);
            int i9 = -(-(i7 << 1));
            int i10 = (i8 & i9) + (i8 | i9);
            a = i10 % 128;
            int i11 = i10 % 2;
            if (progressDialog2.isShowing()) {
                int i12 = b + 39;
                a = i12 % 128;
                int i13 = i12 % 2;
                Authentication.this.U.dismiss();
                int i14 = b;
                int i15 = (i14 ^ 111) + ((i14 & 111) << 1);
                a = i15 % 128;
                int i16 = i15 % 2;
            }
        }
        Authentication authentication3 = Authentication.this;
        StringBuilder sbW = j.w("From Auth 2  ");
        int i17 = b;
        int i18 = (i17 & (-90)) | ((~i17) & 89);
        int i19 = -(-((i17 & 89) << 1));
        int i20 = (i18 & i19) + (i19 | i18);
        a = i20 % 128;
        if (i20 % 2 != 0) {
            sbW.append(responseMessage.getErrorMessage());
            sbW.toString();
            responseMessage.isLogout();
            throw null;
        }
        sbW.append(responseMessage.getErrorMessage());
        af.b(authentication3, sbW.toString(), responseMessage.isLogout());
        int i21 = b + 89;
        a = i21 % 128;
        int i22 = i21 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:181:0x0416 A[Catch: Exception -> 0x05d9, TryCatch #4 {Exception -> 0x05d9, blocks: (B:3:0x001c, B:5:0x0038, B:7:0x0040, B:10:0x005b, B:12:0x0075, B:14:0x00a9, B:16:0x00bd, B:18:0x00c2, B:21:0x00da, B:24:0x00f1, B:29:0x011a, B:35:0x0130, B:38:0x013c, B:42:0x016c, B:48:0x0193, B:57:0x01c9, B:59:0x01d1, B:63:0x01e6, B:65:0x01f0, B:70:0x01f5, B:71:0x01fe, B:74:0x0217, B:51:0x019a, B:32:0x0121, B:79:0x0239, B:83:0x0258, B:86:0x0260, B:89:0x027d, B:93:0x0291, B:95:0x0295, B:99:0x0299, B:105:0x02b4, B:107:0x02b7, B:110:0x02c8, B:112:0x02ce, B:114:0x02e6, B:116:0x02f7, B:120:0x030f, B:121:0x0313, B:123:0x0320, B:126:0x0339, B:128:0x035c, B:130:0x036e, B:132:0x0372, B:134:0x0379, B:135:0x037c, B:122:0x031b, B:145:0x0397, B:148:0x03b2, B:150:0x03bb, B:156:0x03c6, B:155:0x03c0, B:158:0x03ca, B:160:0x03d0, B:162:0x03d7, B:166:0x03db, B:171:0x0401, B:173:0x0408, B:184:0x0420, B:186:0x0434, B:188:0x044a, B:190:0x0450, B:192:0x0480, B:194:0x0498, B:199:0x04be, B:203:0x04d6, B:204:0x04e0, B:206:0x04e4, B:181:0x0416, B:179:0x040f, B:211:0x04e9, B:215:0x04fc, B:217:0x051c, B:224:0x053e, B:228:0x0559, B:229:0x0563, B:231:0x056d, B:237:0x0582, B:241:0x059b, B:246:0x05b1, B:247:0x05bb, B:249:0x05c2, B:253:0x05c6, B:255:0x05ca, B:256:0x05cd, B:259:0x05d0), top: B:279:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:183:0x041e  */
    /* JADX WARN: Code duplicated, block: B:224:0x053e A[Catch: Exception -> 0x05d9, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x05d9, blocks: (B:3:0x001c, B:5:0x0038, B:7:0x0040, B:10:0x005b, B:12:0x0075, B:14:0x00a9, B:16:0x00bd, B:18:0x00c2, B:21:0x00da, B:24:0x00f1, B:29:0x011a, B:35:0x0130, B:38:0x013c, B:42:0x016c, B:48:0x0193, B:57:0x01c9, B:59:0x01d1, B:63:0x01e6, B:65:0x01f0, B:70:0x01f5, B:71:0x01fe, B:74:0x0217, B:51:0x019a, B:32:0x0121, B:79:0x0239, B:83:0x0258, B:86:0x0260, B:89:0x027d, B:93:0x0291, B:95:0x0295, B:99:0x0299, B:105:0x02b4, B:107:0x02b7, B:110:0x02c8, B:112:0x02ce, B:114:0x02e6, B:116:0x02f7, B:120:0x030f, B:121:0x0313, B:123:0x0320, B:126:0x0339, B:128:0x035c, B:130:0x036e, B:132:0x0372, B:134:0x0379, B:135:0x037c, B:122:0x031b, B:145:0x0397, B:148:0x03b2, B:150:0x03bb, B:156:0x03c6, B:155:0x03c0, B:158:0x03ca, B:160:0x03d0, B:162:0x03d7, B:166:0x03db, B:171:0x0401, B:173:0x0408, B:184:0x0420, B:186:0x0434, B:188:0x044a, B:190:0x0450, B:192:0x0480, B:194:0x0498, B:199:0x04be, B:203:0x04d6, B:204:0x04e0, B:206:0x04e4, B:181:0x0416, B:179:0x040f, B:211:0x04e9, B:215:0x04fc, B:217:0x051c, B:224:0x053e, B:228:0x0559, B:229:0x0563, B:231:0x056d, B:237:0x0582, B:241:0x059b, B:246:0x05b1, B:247:0x05bb, B:249:0x05c2, B:253:0x05c6, B:255:0x05ca, B:256:0x05cd, B:259:0x05d0), top: B:279:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:226:0x0544  */
    /* JADX WARN: Code duplicated, block: B:228:0x0559 A[Catch: Exception -> 0x05d9, TRY_ENTER, TryCatch #4 {Exception -> 0x05d9, blocks: (B:3:0x001c, B:5:0x0038, B:7:0x0040, B:10:0x005b, B:12:0x0075, B:14:0x00a9, B:16:0x00bd, B:18:0x00c2, B:21:0x00da, B:24:0x00f1, B:29:0x011a, B:35:0x0130, B:38:0x013c, B:42:0x016c, B:48:0x0193, B:57:0x01c9, B:59:0x01d1, B:63:0x01e6, B:65:0x01f0, B:70:0x01f5, B:71:0x01fe, B:74:0x0217, B:51:0x019a, B:32:0x0121, B:79:0x0239, B:83:0x0258, B:86:0x0260, B:89:0x027d, B:93:0x0291, B:95:0x0295, B:99:0x0299, B:105:0x02b4, B:107:0x02b7, B:110:0x02c8, B:112:0x02ce, B:114:0x02e6, B:116:0x02f7, B:120:0x030f, B:121:0x0313, B:123:0x0320, B:126:0x0339, B:128:0x035c, B:130:0x036e, B:132:0x0372, B:134:0x0379, B:135:0x037c, B:122:0x031b, B:145:0x0397, B:148:0x03b2, B:150:0x03bb, B:156:0x03c6, B:155:0x03c0, B:158:0x03ca, B:160:0x03d0, B:162:0x03d7, B:166:0x03db, B:171:0x0401, B:173:0x0408, B:184:0x0420, B:186:0x0434, B:188:0x044a, B:190:0x0450, B:192:0x0480, B:194:0x0498, B:199:0x04be, B:203:0x04d6, B:204:0x04e0, B:206:0x04e4, B:181:0x0416, B:179:0x040f, B:211:0x04e9, B:215:0x04fc, B:217:0x051c, B:224:0x053e, B:228:0x0559, B:229:0x0563, B:231:0x056d, B:237:0x0582, B:241:0x059b, B:246:0x05b1, B:247:0x05bb, B:249:0x05c2, B:253:0x05c6, B:255:0x05ca, B:256:0x05cd, B:259:0x05d0), top: B:279:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:229:0x0563 A[Catch: Exception -> 0x05d9, TRY_LEAVE, TryCatch #4 {Exception -> 0x05d9, blocks: (B:3:0x001c, B:5:0x0038, B:7:0x0040, B:10:0x005b, B:12:0x0075, B:14:0x00a9, B:16:0x00bd, B:18:0x00c2, B:21:0x00da, B:24:0x00f1, B:29:0x011a, B:35:0x0130, B:38:0x013c, B:42:0x016c, B:48:0x0193, B:57:0x01c9, B:59:0x01d1, B:63:0x01e6, B:65:0x01f0, B:70:0x01f5, B:71:0x01fe, B:74:0x0217, B:51:0x019a, B:32:0x0121, B:79:0x0239, B:83:0x0258, B:86:0x0260, B:89:0x027d, B:93:0x0291, B:95:0x0295, B:99:0x0299, B:105:0x02b4, B:107:0x02b7, B:110:0x02c8, B:112:0x02ce, B:114:0x02e6, B:116:0x02f7, B:120:0x030f, B:121:0x0313, B:123:0x0320, B:126:0x0339, B:128:0x035c, B:130:0x036e, B:132:0x0372, B:134:0x0379, B:135:0x037c, B:122:0x031b, B:145:0x0397, B:148:0x03b2, B:150:0x03bb, B:156:0x03c6, B:155:0x03c0, B:158:0x03ca, B:160:0x03d0, B:162:0x03d7, B:166:0x03db, B:171:0x0401, B:173:0x0408, B:184:0x0420, B:186:0x0434, B:188:0x044a, B:190:0x0450, B:192:0x0480, B:194:0x0498, B:199:0x04be, B:203:0x04d6, B:204:0x04e0, B:206:0x04e4, B:181:0x0416, B:179:0x040f, B:211:0x04e9, B:215:0x04fc, B:217:0x051c, B:224:0x053e, B:228:0x0559, B:229:0x0563, B:231:0x056d, B:237:0x0582, B:241:0x059b, B:246:0x05b1, B:247:0x05bb, B:249:0x05c2, B:253:0x05c6, B:255:0x05ca, B:256:0x05cd, B:259:0x05d0), top: B:279:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:57:0x01c9 A[Catch: Exception -> 0x05d9, TRY_ENTER, TryCatch #4 {Exception -> 0x05d9, blocks: (B:3:0x001c, B:5:0x0038, B:7:0x0040, B:10:0x005b, B:12:0x0075, B:14:0x00a9, B:16:0x00bd, B:18:0x00c2, B:21:0x00da, B:24:0x00f1, B:29:0x011a, B:35:0x0130, B:38:0x013c, B:42:0x016c, B:48:0x0193, B:57:0x01c9, B:59:0x01d1, B:63:0x01e6, B:65:0x01f0, B:70:0x01f5, B:71:0x01fe, B:74:0x0217, B:51:0x019a, B:32:0x0121, B:79:0x0239, B:83:0x0258, B:86:0x0260, B:89:0x027d, B:93:0x0291, B:95:0x0295, B:99:0x0299, B:105:0x02b4, B:107:0x02b7, B:110:0x02c8, B:112:0x02ce, B:114:0x02e6, B:116:0x02f7, B:120:0x030f, B:121:0x0313, B:123:0x0320, B:126:0x0339, B:128:0x035c, B:130:0x036e, B:132:0x0372, B:134:0x0379, B:135:0x037c, B:122:0x031b, B:145:0x0397, B:148:0x03b2, B:150:0x03bb, B:156:0x03c6, B:155:0x03c0, B:158:0x03ca, B:160:0x03d0, B:162:0x03d7, B:166:0x03db, B:171:0x0401, B:173:0x0408, B:184:0x0420, B:186:0x0434, B:188:0x044a, B:190:0x0450, B:192:0x0480, B:194:0x0498, B:199:0x04be, B:203:0x04d6, B:204:0x04e0, B:206:0x04e4, B:181:0x0416, B:179:0x040f, B:211:0x04e9, B:215:0x04fc, B:217:0x051c, B:224:0x053e, B:228:0x0559, B:229:0x0563, B:231:0x056d, B:237:0x0582, B:241:0x059b, B:246:0x05b1, B:247:0x05bb, B:249:0x05c2, B:253:0x05c6, B:255:0x05ca, B:256:0x05cd, B:259:0x05d0), top: B:279:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:63:0x01e6 A[Catch: Exception -> 0x05d9, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x05d9, blocks: (B:3:0x001c, B:5:0x0038, B:7:0x0040, B:10:0x005b, B:12:0x0075, B:14:0x00a9, B:16:0x00bd, B:18:0x00c2, B:21:0x00da, B:24:0x00f1, B:29:0x011a, B:35:0x0130, B:38:0x013c, B:42:0x016c, B:48:0x0193, B:57:0x01c9, B:59:0x01d1, B:63:0x01e6, B:65:0x01f0, B:70:0x01f5, B:71:0x01fe, B:74:0x0217, B:51:0x019a, B:32:0x0121, B:79:0x0239, B:83:0x0258, B:86:0x0260, B:89:0x027d, B:93:0x0291, B:95:0x0295, B:99:0x0299, B:105:0x02b4, B:107:0x02b7, B:110:0x02c8, B:112:0x02ce, B:114:0x02e6, B:116:0x02f7, B:120:0x030f, B:121:0x0313, B:123:0x0320, B:126:0x0339, B:128:0x035c, B:130:0x036e, B:132:0x0372, B:134:0x0379, B:135:0x037c, B:122:0x031b, B:145:0x0397, B:148:0x03b2, B:150:0x03bb, B:156:0x03c6, B:155:0x03c0, B:158:0x03ca, B:160:0x03d0, B:162:0x03d7, B:166:0x03db, B:171:0x0401, B:173:0x0408, B:184:0x0420, B:186:0x0434, B:188:0x044a, B:190:0x0450, B:192:0x0480, B:194:0x0498, B:199:0x04be, B:203:0x04d6, B:204:0x04e0, B:206:0x04e4, B:181:0x0416, B:179:0x040f, B:211:0x04e9, B:215:0x04fc, B:217:0x051c, B:224:0x053e, B:228:0x0559, B:229:0x0563, B:231:0x056d, B:237:0x0582, B:241:0x059b, B:246:0x05b1, B:247:0x05bb, B:249:0x05c2, B:253:0x05c6, B:255:0x05ca, B:256:0x05cd, B:259:0x05d0), top: B:279:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:70:0x01f5 A[Catch: Exception -> 0x05d9, TRY_ENTER, TryCatch #4 {Exception -> 0x05d9, blocks: (B:3:0x001c, B:5:0x0038, B:7:0x0040, B:10:0x005b, B:12:0x0075, B:14:0x00a9, B:16:0x00bd, B:18:0x00c2, B:21:0x00da, B:24:0x00f1, B:29:0x011a, B:35:0x0130, B:38:0x013c, B:42:0x016c, B:48:0x0193, B:57:0x01c9, B:59:0x01d1, B:63:0x01e6, B:65:0x01f0, B:70:0x01f5, B:71:0x01fe, B:74:0x0217, B:51:0x019a, B:32:0x0121, B:79:0x0239, B:83:0x0258, B:86:0x0260, B:89:0x027d, B:93:0x0291, B:95:0x0295, B:99:0x0299, B:105:0x02b4, B:107:0x02b7, B:110:0x02c8, B:112:0x02ce, B:114:0x02e6, B:116:0x02f7, B:120:0x030f, B:121:0x0313, B:123:0x0320, B:126:0x0339, B:128:0x035c, B:130:0x036e, B:132:0x0372, B:134:0x0379, B:135:0x037c, B:122:0x031b, B:145:0x0397, B:148:0x03b2, B:150:0x03bb, B:156:0x03c6, B:155:0x03c0, B:158:0x03ca, B:160:0x03d0, B:162:0x03d7, B:166:0x03db, B:171:0x0401, B:173:0x0408, B:184:0x0420, B:186:0x0434, B:188:0x044a, B:190:0x0450, B:192:0x0480, B:194:0x0498, B:199:0x04be, B:203:0x04d6, B:204:0x04e0, B:206:0x04e4, B:181:0x0416, B:179:0x040f, B:211:0x04e9, B:215:0x04fc, B:217:0x051c, B:224:0x053e, B:228:0x0559, B:229:0x0563, B:231:0x056d, B:237:0x0582, B:241:0x059b, B:246:0x05b1, B:247:0x05bb, B:249:0x05c2, B:253:0x05c6, B:255:0x05ca, B:256:0x05cd, B:259:0x05d0), top: B:279:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0217 A[Catch: Exception -> 0x05d9, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x05d9, blocks: (B:3:0x001c, B:5:0x0038, B:7:0x0040, B:10:0x005b, B:12:0x0075, B:14:0x00a9, B:16:0x00bd, B:18:0x00c2, B:21:0x00da, B:24:0x00f1, B:29:0x011a, B:35:0x0130, B:38:0x013c, B:42:0x016c, B:48:0x0193, B:57:0x01c9, B:59:0x01d1, B:63:0x01e6, B:65:0x01f0, B:70:0x01f5, B:71:0x01fe, B:74:0x0217, B:51:0x019a, B:32:0x0121, B:79:0x0239, B:83:0x0258, B:86:0x0260, B:89:0x027d, B:93:0x0291, B:95:0x0295, B:99:0x0299, B:105:0x02b4, B:107:0x02b7, B:110:0x02c8, B:112:0x02ce, B:114:0x02e6, B:116:0x02f7, B:120:0x030f, B:121:0x0313, B:123:0x0320, B:126:0x0339, B:128:0x035c, B:130:0x036e, B:132:0x0372, B:134:0x0379, B:135:0x037c, B:122:0x031b, B:145:0x0397, B:148:0x03b2, B:150:0x03bb, B:156:0x03c6, B:155:0x03c0, B:158:0x03ca, B:160:0x03d0, B:162:0x03d7, B:166:0x03db, B:171:0x0401, B:173:0x0408, B:184:0x0420, B:186:0x0434, B:188:0x044a, B:190:0x0450, B:192:0x0480, B:194:0x0498, B:199:0x04be, B:203:0x04d6, B:204:0x04e0, B:206:0x04e4, B:181:0x0416, B:179:0x040f, B:211:0x04e9, B:215:0x04fc, B:217:0x051c, B:224:0x053e, B:228:0x0559, B:229:0x0563, B:231:0x056d, B:237:0x0582, B:241:0x059b, B:246:0x05b1, B:247:0x05bb, B:249:0x05c2, B:253:0x05c6, B:255:0x05ca, B:256:0x05cd, B:259:0x05d0), top: B:279:0x001c }] */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0392, code lost:
    
        if ((!r9) != false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0395, code lost:
    
        if (r9 == false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0397, code lost:
    
        r4 = r19.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0399, code lost:
    
        r6 = ((r2 ^ 35) | (r2 & 35)) << 1;
        r2 = -(((~r2) & 35) | (r2 & (-36)));
        r7 = (r6 & r2) + (r2 | r6);
        ivas.gov.bisp.enumeration.activity.authentication.d.a = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x03b0, code lost:
    
        if ((r7 % 2) == 0) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x03b2, code lost:
    
        r2 = ivas.gov.bisp.enumeration.activity.authentication.Authentication.this.al;
        r6 = r19.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x03bb, code lost:
    
        r7 = 25 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x03c0, code lost:
    
        r2 = ivas.gov.bisp.enumeration.activity.authentication.Authentication.this.al;
        r6 = r19.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x03c6, code lost:
    
        ivas.gov.bisp.enumeration.activity.authentication.Authentication.OooOo00.c(r4, r3, r2, r20, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x03c9, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0125, code lost:
    
        if (r6.hasTransport(0) != false) goto L34;
     */
    @Override // ivas.gov.bisp.enumeration.p024ax.I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onSuccess(org.json.JSONObject r20) {
        /*
            Method dump skipped, instruction units count: 1579
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.activity.authentication.d.onSuccess(org.json.JSONObject):void");
    }
}
