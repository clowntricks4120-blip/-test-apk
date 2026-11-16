package ivas.gov.bisp.enumeration.activity;

import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.p024ax.I;
import ivas.gov.bisp.enumeration.p024ax.ax;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class c implements I {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ CnicValidationActivity.OooOOO0 d;

    public c(CnicValidationActivity.OooOOO0 oooOOO0, String str) {
        this.d = oooOOO0;
        this.c = str;
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onError(ResponseMessage responseMessage) {
        CnicValidationActivity cnicValidationActivity;
        StringBuilder sbW;
        String string;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 85;
        int i4 = (i2 & 85) << 1;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        if (i5 % 2 == 0) {
            cnicValidationActivity = CnicValidationActivity.this;
            sbW = ivas.gov.bisp.enumeration.p091n.j.w(BuildConfig.FLAVOR);
            int i6 = 76 / 0;
        } else {
            cnicValidationActivity = CnicValidationActivity.this;
            sbW = ivas.gov.bisp.enumeration.p091n.j.w(BuildConfig.FLAVOR);
        }
        int i7 = a;
        int i8 = (i7 ^ 5) + ((i7 & 5) << 1);
        b = i8 % 128;
        if (i8 % 2 != 0) {
            sbW.append(responseMessage.getErrorMessage());
            string = sbW.toString();
            int i9 = 67 / 0;
        } else {
            sbW.append(responseMessage.getErrorMessage());
            string = sbW.toString();
        }
        ax.f(cnicValidationActivity, "Alert", string);
        ax.b(CnicValidationActivity.this.af);
        int i10 = a;
        int i11 = (i10 ^ 63) + ((i10 & 63) << 1);
        b = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 85 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:416:0x09a6 A[Catch: Exception -> 0x0261, JSONException -> 0x0265, TRY_ENTER, TRY_LEAVE, TryCatch #35 {JSONException -> 0x0265, Exception -> 0x0261, blocks: (B:58:0x015c, B:67:0x018c, B:69:0x0196, B:71:0x01a0, B:80:0x01e2, B:82:0x01fb, B:79:0x01db, B:103:0x027c, B:106:0x0294, B:108:0x02a8, B:112:0x02c1, B:116:0x02e2, B:119:0x02fc, B:120:0x030e, B:122:0x0316, B:140:0x0361, B:142:0x036d, B:145:0x0394, B:146:0x0398, B:148:0x039c, B:152:0x03a0, B:156:0x03c1, B:157:0x03d3, B:159:0x03db, B:163:0x03df, B:165:0x03ed, B:167:0x03ff, B:169:0x0407, B:171:0x0413, B:174:0x041a, B:177:0x0431, B:179:0x0437, B:208:0x04a1, B:210:0x04ab, B:212:0x04b2, B:214:0x04be, B:217:0x04d7, B:221:0x04e8, B:222:0x04ed, B:223:0x04f0, B:224:0x04f6, B:225:0x04fe, B:227:0x0502, B:228:0x0505, B:234:0x050c, B:236:0x0514, B:239:0x052e, B:248:0x0560, B:240:0x0532, B:242:0x0536, B:243:0x0539, B:247:0x053d, B:252:0x0581, B:255:0x059c, B:261:0x05c3, B:263:0x05ce, B:269:0x05d5, B:272:0x05e0, B:277:0x05f9, B:278:0x060b, B:284:0x0631, B:286:0x0639, B:290:0x0653, B:292:0x065f, B:297:0x06a9, B:299:0x06b5, B:301:0x06c5, B:302:0x06d2, B:305:0x06fa, B:307:0x0706, B:352:0x0841, B:364:0x0895, B:355:0x0870, B:359:0x0890, B:316:0x0719, B:318:0x0725, B:323:0x074b, B:326:0x076d, B:328:0x0796, B:331:0x07b5, B:333:0x07c5, B:334:0x07d2, B:336:0x07ea, B:337:0x07f7, B:339:0x0803, B:343:0x0807, B:345:0x0811, B:350:0x0823, B:313:0x070d, B:293:0x0670, B:295:0x0688, B:289:0x0642, B:366:0x08a9, B:368:0x08af, B:369:0x08b2, B:377:0x08cb, B:379:0x08d4, B:387:0x08e5, B:389:0x0901, B:385:0x08db, B:395:0x0925, B:397:0x092d, B:401:0x095f, B:402:0x0971, B:399:0x093b, B:404:0x097d, B:409:0x098b, B:420:0x09c2, B:422:0x09d6, B:424:0x09f0, B:425:0x0a02, B:416:0x09a6, B:418:0x09bb, B:429:0x0a11, B:433:0x0a2a, B:435:0x0a33, B:444:0x0a43, B:452:0x0aa1, B:441:0x0a3a, B:445:0x0a4b, B:448:0x0a6b, B:450:0x0a71, B:451:0x0a9a, B:454:0x0aad, B:456:0x0ad0, B:211:0x04ae, B:184:0x043c, B:185:0x0440, B:188:0x0457, B:189:0x045b, B:191:0x045f, B:195:0x0463, B:197:0x046b, B:200:0x0482, B:201:0x048a, B:203:0x0492, B:207:0x0496, B:126:0x031a, B:128:0x0322, B:129:0x0325, B:133:0x0329, B:136:0x0344, B:139:0x0350, B:458:0x0ae3, B:460:0x0aeb, B:461:0x0aee, B:83:0x0208, B:85:0x0222, B:90:0x024e, B:91:0x0254, B:93:0x025a, B:94:0x025d, B:102:0x0269, B:60:0x017a, B:62:0x0184, B:470:0x0afe, B:472:0x0b08, B:477:0x0b0e, B:480:0x0b27, B:488:0x0b95, B:492:0x0bbc, B:493:0x0bc1, B:495:0x0bce, B:497:0x0bdc, B:494:0x0bc5, B:482:0x0b3e, B:484:0x0b61, B:487:0x0b8e, B:499:0x0be8, B:501:0x0bf0, B:502:0x0bf3), top: B:591:0x010c }] */
    /* JADX WARN: Code duplicated, block: B:420:0x09c2 A[Catch: Exception -> 0x0261, JSONException -> 0x0265, TRY_LEAVE, TryCatch #35 {JSONException -> 0x0265, Exception -> 0x0261, blocks: (B:58:0x015c, B:67:0x018c, B:69:0x0196, B:71:0x01a0, B:80:0x01e2, B:82:0x01fb, B:79:0x01db, B:103:0x027c, B:106:0x0294, B:108:0x02a8, B:112:0x02c1, B:116:0x02e2, B:119:0x02fc, B:120:0x030e, B:122:0x0316, B:140:0x0361, B:142:0x036d, B:145:0x0394, B:146:0x0398, B:148:0x039c, B:152:0x03a0, B:156:0x03c1, B:157:0x03d3, B:159:0x03db, B:163:0x03df, B:165:0x03ed, B:167:0x03ff, B:169:0x0407, B:171:0x0413, B:174:0x041a, B:177:0x0431, B:179:0x0437, B:208:0x04a1, B:210:0x04ab, B:212:0x04b2, B:214:0x04be, B:217:0x04d7, B:221:0x04e8, B:222:0x04ed, B:223:0x04f0, B:224:0x04f6, B:225:0x04fe, B:227:0x0502, B:228:0x0505, B:234:0x050c, B:236:0x0514, B:239:0x052e, B:248:0x0560, B:240:0x0532, B:242:0x0536, B:243:0x0539, B:247:0x053d, B:252:0x0581, B:255:0x059c, B:261:0x05c3, B:263:0x05ce, B:269:0x05d5, B:272:0x05e0, B:277:0x05f9, B:278:0x060b, B:284:0x0631, B:286:0x0639, B:290:0x0653, B:292:0x065f, B:297:0x06a9, B:299:0x06b5, B:301:0x06c5, B:302:0x06d2, B:305:0x06fa, B:307:0x0706, B:352:0x0841, B:364:0x0895, B:355:0x0870, B:359:0x0890, B:316:0x0719, B:318:0x0725, B:323:0x074b, B:326:0x076d, B:328:0x0796, B:331:0x07b5, B:333:0x07c5, B:334:0x07d2, B:336:0x07ea, B:337:0x07f7, B:339:0x0803, B:343:0x0807, B:345:0x0811, B:350:0x0823, B:313:0x070d, B:293:0x0670, B:295:0x0688, B:289:0x0642, B:366:0x08a9, B:368:0x08af, B:369:0x08b2, B:377:0x08cb, B:379:0x08d4, B:387:0x08e5, B:389:0x0901, B:385:0x08db, B:395:0x0925, B:397:0x092d, B:401:0x095f, B:402:0x0971, B:399:0x093b, B:404:0x097d, B:409:0x098b, B:420:0x09c2, B:422:0x09d6, B:424:0x09f0, B:425:0x0a02, B:416:0x09a6, B:418:0x09bb, B:429:0x0a11, B:433:0x0a2a, B:435:0x0a33, B:444:0x0a43, B:452:0x0aa1, B:441:0x0a3a, B:445:0x0a4b, B:448:0x0a6b, B:450:0x0a71, B:451:0x0a9a, B:454:0x0aad, B:456:0x0ad0, B:211:0x04ae, B:184:0x043c, B:185:0x0440, B:188:0x0457, B:189:0x045b, B:191:0x045f, B:195:0x0463, B:197:0x046b, B:200:0x0482, B:201:0x048a, B:203:0x0492, B:207:0x0496, B:126:0x031a, B:128:0x0322, B:129:0x0325, B:133:0x0329, B:136:0x0344, B:139:0x0350, B:458:0x0ae3, B:460:0x0aeb, B:461:0x0aee, B:83:0x0208, B:85:0x0222, B:90:0x024e, B:91:0x0254, B:93:0x025a, B:94:0x025d, B:102:0x0269, B:60:0x017a, B:62:0x0184, B:470:0x0afe, B:472:0x0b08, B:477:0x0b0e, B:480:0x0b27, B:488:0x0b95, B:492:0x0bbc, B:493:0x0bc1, B:495:0x0bce, B:497:0x0bdc, B:494:0x0bc5, B:482:0x0b3e, B:484:0x0b61, B:487:0x0b8e, B:499:0x0be8, B:501:0x0bf0, B:502:0x0bf3), top: B:591:0x010c }] */
    /* JADX WARN: Code duplicated, block: B:444:0x0a43 A[Catch: Exception -> 0x0261, JSONException -> 0x0265, TryCatch #35 {JSONException -> 0x0265, Exception -> 0x0261, blocks: (B:58:0x015c, B:67:0x018c, B:69:0x0196, B:71:0x01a0, B:80:0x01e2, B:82:0x01fb, B:79:0x01db, B:103:0x027c, B:106:0x0294, B:108:0x02a8, B:112:0x02c1, B:116:0x02e2, B:119:0x02fc, B:120:0x030e, B:122:0x0316, B:140:0x0361, B:142:0x036d, B:145:0x0394, B:146:0x0398, B:148:0x039c, B:152:0x03a0, B:156:0x03c1, B:157:0x03d3, B:159:0x03db, B:163:0x03df, B:165:0x03ed, B:167:0x03ff, B:169:0x0407, B:171:0x0413, B:174:0x041a, B:177:0x0431, B:179:0x0437, B:208:0x04a1, B:210:0x04ab, B:212:0x04b2, B:214:0x04be, B:217:0x04d7, B:221:0x04e8, B:222:0x04ed, B:223:0x04f0, B:224:0x04f6, B:225:0x04fe, B:227:0x0502, B:228:0x0505, B:234:0x050c, B:236:0x0514, B:239:0x052e, B:248:0x0560, B:240:0x0532, B:242:0x0536, B:243:0x0539, B:247:0x053d, B:252:0x0581, B:255:0x059c, B:261:0x05c3, B:263:0x05ce, B:269:0x05d5, B:272:0x05e0, B:277:0x05f9, B:278:0x060b, B:284:0x0631, B:286:0x0639, B:290:0x0653, B:292:0x065f, B:297:0x06a9, B:299:0x06b5, B:301:0x06c5, B:302:0x06d2, B:305:0x06fa, B:307:0x0706, B:352:0x0841, B:364:0x0895, B:355:0x0870, B:359:0x0890, B:316:0x0719, B:318:0x0725, B:323:0x074b, B:326:0x076d, B:328:0x0796, B:331:0x07b5, B:333:0x07c5, B:334:0x07d2, B:336:0x07ea, B:337:0x07f7, B:339:0x0803, B:343:0x0807, B:345:0x0811, B:350:0x0823, B:313:0x070d, B:293:0x0670, B:295:0x0688, B:289:0x0642, B:366:0x08a9, B:368:0x08af, B:369:0x08b2, B:377:0x08cb, B:379:0x08d4, B:387:0x08e5, B:389:0x0901, B:385:0x08db, B:395:0x0925, B:397:0x092d, B:401:0x095f, B:402:0x0971, B:399:0x093b, B:404:0x097d, B:409:0x098b, B:420:0x09c2, B:422:0x09d6, B:424:0x09f0, B:425:0x0a02, B:416:0x09a6, B:418:0x09bb, B:429:0x0a11, B:433:0x0a2a, B:435:0x0a33, B:444:0x0a43, B:452:0x0aa1, B:441:0x0a3a, B:445:0x0a4b, B:448:0x0a6b, B:450:0x0a71, B:451:0x0a9a, B:454:0x0aad, B:456:0x0ad0, B:211:0x04ae, B:184:0x043c, B:185:0x0440, B:188:0x0457, B:189:0x045b, B:191:0x045f, B:195:0x0463, B:197:0x046b, B:200:0x0482, B:201:0x048a, B:203:0x0492, B:207:0x0496, B:126:0x031a, B:128:0x0322, B:129:0x0325, B:133:0x0329, B:136:0x0344, B:139:0x0350, B:458:0x0ae3, B:460:0x0aeb, B:461:0x0aee, B:83:0x0208, B:85:0x0222, B:90:0x024e, B:91:0x0254, B:93:0x025a, B:94:0x025d, B:102:0x0269, B:60:0x017a, B:62:0x0184, B:470:0x0afe, B:472:0x0b08, B:477:0x0b0e, B:480:0x0b27, B:488:0x0b95, B:492:0x0bbc, B:493:0x0bc1, B:495:0x0bce, B:497:0x0bdc, B:494:0x0bc5, B:482:0x0b3e, B:484:0x0b61, B:487:0x0b8e, B:499:0x0be8, B:501:0x0bf0, B:502:0x0bf3), top: B:591:0x010c }] */
    /* JADX WARN: Code duplicated, block: B:445:0x0a4b A[Catch: Exception -> 0x0261, JSONException -> 0x0265, TryCatch #35 {JSONException -> 0x0265, Exception -> 0x0261, blocks: (B:58:0x015c, B:67:0x018c, B:69:0x0196, B:71:0x01a0, B:80:0x01e2, B:82:0x01fb, B:79:0x01db, B:103:0x027c, B:106:0x0294, B:108:0x02a8, B:112:0x02c1, B:116:0x02e2, B:119:0x02fc, B:120:0x030e, B:122:0x0316, B:140:0x0361, B:142:0x036d, B:145:0x0394, B:146:0x0398, B:148:0x039c, B:152:0x03a0, B:156:0x03c1, B:157:0x03d3, B:159:0x03db, B:163:0x03df, B:165:0x03ed, B:167:0x03ff, B:169:0x0407, B:171:0x0413, B:174:0x041a, B:177:0x0431, B:179:0x0437, B:208:0x04a1, B:210:0x04ab, B:212:0x04b2, B:214:0x04be, B:217:0x04d7, B:221:0x04e8, B:222:0x04ed, B:223:0x04f0, B:224:0x04f6, B:225:0x04fe, B:227:0x0502, B:228:0x0505, B:234:0x050c, B:236:0x0514, B:239:0x052e, B:248:0x0560, B:240:0x0532, B:242:0x0536, B:243:0x0539, B:247:0x053d, B:252:0x0581, B:255:0x059c, B:261:0x05c3, B:263:0x05ce, B:269:0x05d5, B:272:0x05e0, B:277:0x05f9, B:278:0x060b, B:284:0x0631, B:286:0x0639, B:290:0x0653, B:292:0x065f, B:297:0x06a9, B:299:0x06b5, B:301:0x06c5, B:302:0x06d2, B:305:0x06fa, B:307:0x0706, B:352:0x0841, B:364:0x0895, B:355:0x0870, B:359:0x0890, B:316:0x0719, B:318:0x0725, B:323:0x074b, B:326:0x076d, B:328:0x0796, B:331:0x07b5, B:333:0x07c5, B:334:0x07d2, B:336:0x07ea, B:337:0x07f7, B:339:0x0803, B:343:0x0807, B:345:0x0811, B:350:0x0823, B:313:0x070d, B:293:0x0670, B:295:0x0688, B:289:0x0642, B:366:0x08a9, B:368:0x08af, B:369:0x08b2, B:377:0x08cb, B:379:0x08d4, B:387:0x08e5, B:389:0x0901, B:385:0x08db, B:395:0x0925, B:397:0x092d, B:401:0x095f, B:402:0x0971, B:399:0x093b, B:404:0x097d, B:409:0x098b, B:420:0x09c2, B:422:0x09d6, B:424:0x09f0, B:425:0x0a02, B:416:0x09a6, B:418:0x09bb, B:429:0x0a11, B:433:0x0a2a, B:435:0x0a33, B:444:0x0a43, B:452:0x0aa1, B:441:0x0a3a, B:445:0x0a4b, B:448:0x0a6b, B:450:0x0a71, B:451:0x0a9a, B:454:0x0aad, B:456:0x0ad0, B:211:0x04ae, B:184:0x043c, B:185:0x0440, B:188:0x0457, B:189:0x045b, B:191:0x045f, B:195:0x0463, B:197:0x046b, B:200:0x0482, B:201:0x048a, B:203:0x0492, B:207:0x0496, B:126:0x031a, B:128:0x0322, B:129:0x0325, B:133:0x0329, B:136:0x0344, B:139:0x0350, B:458:0x0ae3, B:460:0x0aeb, B:461:0x0aee, B:83:0x0208, B:85:0x0222, B:90:0x024e, B:91:0x0254, B:93:0x025a, B:94:0x025d, B:102:0x0269, B:60:0x017a, B:62:0x0184, B:470:0x0afe, B:472:0x0b08, B:477:0x0b0e, B:480:0x0b27, B:488:0x0b95, B:492:0x0bbc, B:493:0x0bc1, B:495:0x0bce, B:497:0x0bdc, B:494:0x0bc5, B:482:0x0b3e, B:484:0x0b61, B:487:0x0b8e, B:499:0x0be8, B:501:0x0bf0, B:502:0x0bf3), top: B:591:0x010c }] */
    /* JADX WARN: Code duplicated, block: B:447:0x0a6a  */
    /* JADX WARN: Code duplicated, block: B:450:0x0a71 A[Catch: Exception -> 0x0261, JSONException -> 0x0265, LOOP:1: B:448:0x0a6b->B:450:0x0a71, LOOP_END, TryCatch #35 {JSONException -> 0x0265, Exception -> 0x0261, blocks: (B:58:0x015c, B:67:0x018c, B:69:0x0196, B:71:0x01a0, B:80:0x01e2, B:82:0x01fb, B:79:0x01db, B:103:0x027c, B:106:0x0294, B:108:0x02a8, B:112:0x02c1, B:116:0x02e2, B:119:0x02fc, B:120:0x030e, B:122:0x0316, B:140:0x0361, B:142:0x036d, B:145:0x0394, B:146:0x0398, B:148:0x039c, B:152:0x03a0, B:156:0x03c1, B:157:0x03d3, B:159:0x03db, B:163:0x03df, B:165:0x03ed, B:167:0x03ff, B:169:0x0407, B:171:0x0413, B:174:0x041a, B:177:0x0431, B:179:0x0437, B:208:0x04a1, B:210:0x04ab, B:212:0x04b2, B:214:0x04be, B:217:0x04d7, B:221:0x04e8, B:222:0x04ed, B:223:0x04f0, B:224:0x04f6, B:225:0x04fe, B:227:0x0502, B:228:0x0505, B:234:0x050c, B:236:0x0514, B:239:0x052e, B:248:0x0560, B:240:0x0532, B:242:0x0536, B:243:0x0539, B:247:0x053d, B:252:0x0581, B:255:0x059c, B:261:0x05c3, B:263:0x05ce, B:269:0x05d5, B:272:0x05e0, B:277:0x05f9, B:278:0x060b, B:284:0x0631, B:286:0x0639, B:290:0x0653, B:292:0x065f, B:297:0x06a9, B:299:0x06b5, B:301:0x06c5, B:302:0x06d2, B:305:0x06fa, B:307:0x0706, B:352:0x0841, B:364:0x0895, B:355:0x0870, B:359:0x0890, B:316:0x0719, B:318:0x0725, B:323:0x074b, B:326:0x076d, B:328:0x0796, B:331:0x07b5, B:333:0x07c5, B:334:0x07d2, B:336:0x07ea, B:337:0x07f7, B:339:0x0803, B:343:0x0807, B:345:0x0811, B:350:0x0823, B:313:0x070d, B:293:0x0670, B:295:0x0688, B:289:0x0642, B:366:0x08a9, B:368:0x08af, B:369:0x08b2, B:377:0x08cb, B:379:0x08d4, B:387:0x08e5, B:389:0x0901, B:385:0x08db, B:395:0x0925, B:397:0x092d, B:401:0x095f, B:402:0x0971, B:399:0x093b, B:404:0x097d, B:409:0x098b, B:420:0x09c2, B:422:0x09d6, B:424:0x09f0, B:425:0x0a02, B:416:0x09a6, B:418:0x09bb, B:429:0x0a11, B:433:0x0a2a, B:435:0x0a33, B:444:0x0a43, B:452:0x0aa1, B:441:0x0a3a, B:445:0x0a4b, B:448:0x0a6b, B:450:0x0a71, B:451:0x0a9a, B:454:0x0aad, B:456:0x0ad0, B:211:0x04ae, B:184:0x043c, B:185:0x0440, B:188:0x0457, B:189:0x045b, B:191:0x045f, B:195:0x0463, B:197:0x046b, B:200:0x0482, B:201:0x048a, B:203:0x0492, B:207:0x0496, B:126:0x031a, B:128:0x0322, B:129:0x0325, B:133:0x0329, B:136:0x0344, B:139:0x0350, B:458:0x0ae3, B:460:0x0aeb, B:461:0x0aee, B:83:0x0208, B:85:0x0222, B:90:0x024e, B:91:0x0254, B:93:0x025a, B:94:0x025d, B:102:0x0269, B:60:0x017a, B:62:0x0184, B:470:0x0afe, B:472:0x0b08, B:477:0x0b0e, B:480:0x0b27, B:488:0x0b95, B:492:0x0bbc, B:493:0x0bc1, B:495:0x0bce, B:497:0x0bdc, B:494:0x0bc5, B:482:0x0b3e, B:484:0x0b61, B:487:0x0b8e, B:499:0x0be8, B:501:0x0bf0, B:502:0x0bf3), top: B:591:0x010c }] */
    /* JADX WARN: Code duplicated, block: B:519:0x0c35  */
    /* JADX WARN: Code duplicated, block: B:522:0x0c5d  */
    /* JADX WARN: Code duplicated, block: B:78:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:80:0x01e2 A[Catch: Exception -> 0x0261, JSONException -> 0x0265, TRY_LEAVE, TryCatch #35 {JSONException -> 0x0265, Exception -> 0x0261, blocks: (B:58:0x015c, B:67:0x018c, B:69:0x0196, B:71:0x01a0, B:80:0x01e2, B:82:0x01fb, B:79:0x01db, B:103:0x027c, B:106:0x0294, B:108:0x02a8, B:112:0x02c1, B:116:0x02e2, B:119:0x02fc, B:120:0x030e, B:122:0x0316, B:140:0x0361, B:142:0x036d, B:145:0x0394, B:146:0x0398, B:148:0x039c, B:152:0x03a0, B:156:0x03c1, B:157:0x03d3, B:159:0x03db, B:163:0x03df, B:165:0x03ed, B:167:0x03ff, B:169:0x0407, B:171:0x0413, B:174:0x041a, B:177:0x0431, B:179:0x0437, B:208:0x04a1, B:210:0x04ab, B:212:0x04b2, B:214:0x04be, B:217:0x04d7, B:221:0x04e8, B:222:0x04ed, B:223:0x04f0, B:224:0x04f6, B:225:0x04fe, B:227:0x0502, B:228:0x0505, B:234:0x050c, B:236:0x0514, B:239:0x052e, B:248:0x0560, B:240:0x0532, B:242:0x0536, B:243:0x0539, B:247:0x053d, B:252:0x0581, B:255:0x059c, B:261:0x05c3, B:263:0x05ce, B:269:0x05d5, B:272:0x05e0, B:277:0x05f9, B:278:0x060b, B:284:0x0631, B:286:0x0639, B:290:0x0653, B:292:0x065f, B:297:0x06a9, B:299:0x06b5, B:301:0x06c5, B:302:0x06d2, B:305:0x06fa, B:307:0x0706, B:352:0x0841, B:364:0x0895, B:355:0x0870, B:359:0x0890, B:316:0x0719, B:318:0x0725, B:323:0x074b, B:326:0x076d, B:328:0x0796, B:331:0x07b5, B:333:0x07c5, B:334:0x07d2, B:336:0x07ea, B:337:0x07f7, B:339:0x0803, B:343:0x0807, B:345:0x0811, B:350:0x0823, B:313:0x070d, B:293:0x0670, B:295:0x0688, B:289:0x0642, B:366:0x08a9, B:368:0x08af, B:369:0x08b2, B:377:0x08cb, B:379:0x08d4, B:387:0x08e5, B:389:0x0901, B:385:0x08db, B:395:0x0925, B:397:0x092d, B:401:0x095f, B:402:0x0971, B:399:0x093b, B:404:0x097d, B:409:0x098b, B:420:0x09c2, B:422:0x09d6, B:424:0x09f0, B:425:0x0a02, B:416:0x09a6, B:418:0x09bb, B:429:0x0a11, B:433:0x0a2a, B:435:0x0a33, B:444:0x0a43, B:452:0x0aa1, B:441:0x0a3a, B:445:0x0a4b, B:448:0x0a6b, B:450:0x0a71, B:451:0x0a9a, B:454:0x0aad, B:456:0x0ad0, B:211:0x04ae, B:184:0x043c, B:185:0x0440, B:188:0x0457, B:189:0x045b, B:191:0x045f, B:195:0x0463, B:197:0x046b, B:200:0x0482, B:201:0x048a, B:203:0x0492, B:207:0x0496, B:126:0x031a, B:128:0x0322, B:129:0x0325, B:133:0x0329, B:136:0x0344, B:139:0x0350, B:458:0x0ae3, B:460:0x0aeb, B:461:0x0aee, B:83:0x0208, B:85:0x0222, B:90:0x024e, B:91:0x0254, B:93:0x025a, B:94:0x025d, B:102:0x0269, B:60:0x017a, B:62:0x0184, B:470:0x0afe, B:472:0x0b08, B:477:0x0b0e, B:480:0x0b27, B:488:0x0b95, B:492:0x0bbc, B:493:0x0bc1, B:495:0x0bce, B:497:0x0bdc, B:494:0x0bc5, B:482:0x0b3e, B:484:0x0b61, B:487:0x0b8e, B:499:0x0be8, B:501:0x0bf0, B:502:0x0bf3), top: B:591:0x010c }] */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x0707, code lost:
    
        if (r2.ae != false) goto L315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x0716, code lost:
    
        if (r2.ae != false) goto L315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x0718, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x0723, code lost:
    
        if (r12 >= ivas.gov.bisp.enumeration.activity.CnicValidationActivity.this.ad.size()) goto L594;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x0737, code lost:
    
        if (ivas.gov.bisp.enumeration.activity.CnicValidationActivity.this.ad.get(r12).getRelationToHouseholdHead() != 186) goto L595;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x0739, code lost:
    
        r2 = ivas.gov.bisp.enumeration.activity.c.a;
        r3 = (((r2 | 74) << 1) - (r2 ^ 74)) - 1;
        ivas.gov.bisp.enumeration.activity.c.b = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x0749, code lost:
    
        if ((r3 % 2) != 0) goto L592;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x0761, code lost:
    
        if (ivas.gov.bisp.enumeration.activity.CnicValidationActivity.this.ad.get(r12).getDiscrepancy_status().equals("2") == false) goto L328;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x0763, code lost:
    
        r2 = ivas.gov.bisp.enumeration.activity.c.b - (-1);
        ivas.gov.bisp.enumeration.activity.c.a = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x076d, code lost:
    
        ivas.gov.bisp.enumeration.activity.CnicValidationActivity.r(ivas.gov.bisp.enumeration.activity.CnicValidationActivity.this, 2, "Duplicate", " آپ کی تفصیلات ایک سے زیادہ گھرانوں میں موجود یے۔ اس لیے آپ کا اندراج دوبارہ کیا جایٰے گا۔");
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x0778, code lost:
    
        r2 = ivas.gov.bisp.enumeration.activity.c.a;
        r3 = ((r2 ^ 109) | (r2 & 109)) << 1;
        r2 = -(((~r2) & 109) | (r2 & (-110)));
        r5 = ((r3 | r2) << 1) - (r2 ^ r3);
        ivas.gov.bisp.enumeration.activity.c.b = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x0796, code lost:
    
        r2 = ivas.gov.bisp.enumeration.activity.CnicValidationActivity.this.ad.get(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x07a0, code lost:
    
        r3 = ivas.gov.bisp.enumeration.activity.c.b;
        r4 = r3 & 5;
        r3 = (((r3 | 5) & (~r4)) - (~(r4 << 1))) - 1;
        ivas.gov.bisp.enumeration.activity.c.a = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x07b3, code lost:
    
        if ((r3 % 2) == 0) goto L593;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x07c3, code lost:
    
        if ((!r2.getDiscrepancy_status().equals("6")) == true) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x07c5, code lost:
    
        ivas.gov.bisp.enumeration.activity.CnicValidationActivity.r(ivas.gov.bisp.enumeration.activity.CnicValidationActivity.this, 6, "Splitting", "آپ کا گھرانا گزشتہ سروے میں دو گھرانوں میں تقسیم ہو چکا ہے۔ اس لیے آپ کا اندراج دوبارہ کیا جایٰے گا۔");
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x07e8, code lost:
    
        if (ivas.gov.bisp.enumeration.activity.CnicValidationActivity.this.ad.get(r12).getDiscrepancy_status().equals("7") == false) goto L598;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x07ea, code lost:
    
        ivas.gov.bisp.enumeration.activity.CnicValidationActivity.r(ivas.gov.bisp.enumeration.activity.CnicValidationActivity.this, 7, "Duplicate QR", " آپ کی تفصیلات ایک سے زیادہ گھرانوں میں موجود یے۔ اس لیے آپ کا اندراج دوبارہ کیا جایٰے گا۔");
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x07f7, code lost:
    
        r2.getDiscrepancy_status().equals("6");
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x0803, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x0807, code lost:
    
        ivas.gov.bisp.enumeration.activity.CnicValidationActivity.this.ad.get(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x0811, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x0815, code lost:
    
        r2 = (r12 ^ 2) + ((r12 & 2) << 1);
        r12 = (r2 ^ (-1)) + (r2 << 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x0823, code lost:
    
        ivas.gov.bisp.enumeration.activity.CnicValidationActivity.this.startActivity(new android.content.Intent(ivas.gov.bisp.enumeration.activity.CnicValidationActivity.this, (java.lang.Class<?>) ivas.gov.bisp.enumeration.activity.DiscrepancyRosterListActivity.class));
        ivas.gov.bisp.enumeration.activity.CnicValidationActivity.p(ivas.gov.bisp.enumeration.activity.CnicValidationActivity.this).dismiss();
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x0840, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x0841, code lost:
    
        r3 = new java.lang.StringBuilder();
        r3.append("No Roster Data Found against this ");
        r3.append(r21.c);
        android.widget.Toast.makeText(r2, r3.toString(), 0).show();
        ivas.gov.bisp.enumeration.activity.CnicValidationActivity.p(ivas.gov.bisp.enumeration.activity.CnicValidationActivity.this).dismiss();
        r2 = ivas.gov.bisp.enumeration.activity.CnicValidationActivity.this;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x086d, code lost:
    
        if (r2.am == null) goto L355;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x0870, code lost:
    
        r2.am = (ivas.gov.bisp.enumeration.BISPApplication) r2.getApplicationContext();
        java.util.Objects.requireNonNull(ivas.gov.bisp.enumeration.activity.CnicValidationActivity.this.am);
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x0881, code lost:
    
        r2 = ivas.gov.bisp.enumeration.activity.c.a + 25;
        ivas.gov.bisp.enumeration.activity.c.b = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x088b, code lost:
    
        if ((r2 % 2) == 0) goto L364;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x0890, code lost:
    
        r2 = 43 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x0895, code lost:
    
        r2 = ivas.gov.bisp.enumeration.activity.CnicValidationActivity.this;
        ivas.gov.bisp.enumeration.activity.CnicValidationActivity.r(r2, 1, "Not Register", r2.getResources().getString(ivas.gov.bisp.enumeration.R.string.expire_resurvey_urdu5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x08a8, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x08d5, code lost:
    
        if (r14.contains("Update") != false) goto L387;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x08e3, code lost:
    
        if ((!r14.contains("Update")) != true) goto L387;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x08e5, code lost:
    
        ivas.gov.bisp.enumeration.activity.CnicValidationActivity.u(ivas.gov.bisp.enumeration.activity.CnicValidationActivity.this);
        r2 = r21.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x08ee, code lost:
    
        r3 = ivas.gov.bisp.enumeration.activity.c.b;
        r4 = ((r3 ^ 121) - (~(-(-((r3 & 121) << 1))))) - 1;
        ivas.gov.bisp.enumeration.activity.c.a = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x0901, code lost:
    
        ivas.gov.bisp.enumeration.activity.CnicValidationActivity.p(ivas.gov.bisp.enumeration.activity.CnicValidationActivity.this).dismiss();
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x090a, code lost:
    
        return;
     */
    @Override // ivas.gov.bisp.enumeration.p024ax.I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onSuccess(org.json.JSONObject r22) {
        /*
            Method dump skipped, instruction units count: 3173
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.activity.c.onSuccess(org.json.JSONObject):void");
    }
}
