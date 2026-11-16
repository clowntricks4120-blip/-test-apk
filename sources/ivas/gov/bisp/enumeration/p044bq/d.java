package ivas.gov.bisp.enumeration.p044bq;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import com.orm.SugarRecord;
import ivas.gov.bisp.enumeration.models.Batch;
import ivas.gov.bisp.enumeration.models.Survey;
import java.util.ArrayList;
import java.util.Collections;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class d extends AsyncTask<Void, Survey, Survey> {
    private static int a = 0;
    private static int b = 1;
    public ProgressDialog c;
    public bpy d;
    public Context e;
    public Survey f;

    public interface bpy {
    }

    public d(Context context, Survey survey, bpy bpyVar) {
        this.f = survey;
        this.e = context;
        this.d = bpyVar;
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        int i = 2 % 2;
        try {
            ProgressDialog progressDialog = new ProgressDialog(this.e);
            int i2 = a;
            int i3 = i2 ^ 59;
            int i4 = -(-((i2 & 59) << 1));
            int i5 = (i3 & i4) + (i4 | i3);
            b = i5 % 128;
            if (i5 % 2 == 0) {
                this.c = progressDialog;
                progressDialog.setCancelable(true);
            } else {
                this.c = progressDialog;
                progressDialog.setCancelable(false);
            }
            int i6 = b;
            int i7 = (-2) - (((i6 ^ 22) + ((i6 & 22) << 1)) ^ (-1));
            a = i7 % 128;
            int i8 = i7 % 2;
            this.c.setMessage("Getting next survey...");
            ProgressDialog progressDialog2 = this.c;
            int i9 = a;
            int i10 = i9 & 119;
            int i11 = (i9 ^ 119) | i10;
            int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
            b = i12 % 128;
            int i13 = i12 % 2;
            progressDialog2.setIndeterminate(true);
            this.c.show();
            int i14 = a;
            int i15 = i14 & 11;
            int i16 = (i14 | 11) & (~i15);
            int i17 = -(-(i15 << 1));
            int i18 = (i16 & i17) + (i16 | i17);
            b = i18 % 128;
            int i19 = i18 % 2;
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0076, code lost:
    
        if (r8 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007e, code lost:
    
        if (r8 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0080, code lost:
    
        android.widget.Toast.makeText(r1.getApplicationContext(), "No survey available for re-verification.Submitting current survey...", 1).show();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008d, code lost:
    
        r8 = ivas.gov.bisp.enumeration.p044bq.d.a;
        r4 = (r8 & 5) + (r8 | 5);
        ivas.gov.bisp.enumeration.p044bq.d.b = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0099, code lost:
    
        if ((r4 % 2) == 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009b, code lost:
    
        r1.H();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009e, code lost:
    
        r8 = ivas.gov.bisp.enumeration.p044bq.d.a;
        r1 = ((r8 | 113) << 1) - (r8 ^ 113);
        ivas.gov.bisp.enumeration.p044bq.d.b = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ab, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ac, code lost:
    
        r1.H();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00af, code lost:
    
        r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b2, code lost:
    
        throw null;
     */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPostExecute(ivas.gov.bisp.enumeration.models.Survey r8) {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.p044bq.d.b
            int r2 = r1 + 15
            int r3 = r2 % 128
            ivas.gov.bisp.enumeration.p044bq.d.a = r3
            int r2 = r2 % r0
            ivas.gov.bisp.enumeration.models.Survey r8 = (ivas.gov.bisp.enumeration.models.Survey) r8
            r2 = 0
            r3 = 1
            android.app.ProgressDialog r4 = r7.c     // Catch: java.lang.Exception -> Lb5
            if (r4 == 0) goto L51
            r5 = r1 & 99
            r1 = r1 ^ 99
            r1 = r1 | r5
            int r1 = -r1
            int r1 = -r1
            int r1 = ~r1
            int r5 = r5 - r1
            int r5 = r5 - r3
            int r1 = r5 % 128
            ivas.gov.bisp.enumeration.p044bq.d.a = r1
            int r5 = r5 % r0
            boolean r1 = r4.isShowing()     // Catch: java.lang.Exception -> Lb5
            r1 = r1 ^ r3
            if (r1 == 0) goto L2b
            goto L51
        L2b:
            int r1 = ivas.gov.bisp.enumeration.p044bq.d.b
            r4 = r1 | 59
            int r5 = r4 << 1
            r1 = r1 & 59
            int r1 = ~r1
            r1 = r1 & r4
            int r1 = -r1
            int r1 = ~r1
            int r5 = r5 - r1
            int r5 = r5 - r3
            int r1 = r5 % 128
            ivas.gov.bisp.enumeration.p044bq.d.a = r1
            int r5 = r5 % r0
            android.app.ProgressDialog r1 = r7.c     // Catch: java.lang.Exception -> Lb5
            r1.dismiss()     // Catch: java.lang.Exception -> Lb5
            int r1 = ivas.gov.bisp.enumeration.p044bq.d.a
            r4 = r1 | 98
            int r4 = r4 << r3
            r1 = r1 ^ 98
            int r4 = r4 - r1
            int r4 = r4 - r3
            int r1 = r4 % 128
            ivas.gov.bisp.enumeration.p044bq.d.b = r1
            int r4 = r4 % r0
        L51:
            ivas.gov.bisp.enumeration.bq.d$bpy r1 = r7.d     // Catch: java.lang.Exception -> Lb5
            ivas.gov.bisp.enumeration.bp.e r1 = (ivas.gov.bisp.enumeration.p043bp.C0203e) r1     // Catch: java.lang.Exception -> Lb5
            java.lang.Object r1 = r1.d     // Catch: java.lang.Exception -> Lb5
            ivas.gov.bisp.enumeration.ActivityBeginSurvey r1 = (ivas.gov.bisp.enumeration.ActivityBeginSurvey) r1     // Catch: java.lang.Exception -> Lb5
            int r4 = ivas.gov.bisp.enumeration.p044bq.d.b
            r5 = r4 & 113(0x71, float:1.58E-43)
            r4 = r4 | 113(0x71, float:1.58E-43)
            int r4 = -r4
            int r4 = -r4
            r6 = r5 ^ r4
            r4 = r4 & r5
            int r4 = r4 << r3
            int r6 = r6 + r4
            int r4 = r6 % 128
            ivas.gov.bisp.enumeration.p044bq.d.a = r4
            int r6 = r6 % r0
            if (r6 == 0) goto L79
            int r4 = ivas.gov.bisp.enumeration.ActivityBeginSurvey.af     // Catch: java.lang.Exception -> Lb5
            java.util.Objects.requireNonNull(r1)     // Catch: java.lang.Exception -> Lb5
            r4 = 10
            int r4 = r4 / 0
            if (r8 != 0) goto Lb5
            goto L80
        L79:
            int r4 = ivas.gov.bisp.enumeration.ActivityBeginSurvey.af     // Catch: java.lang.Exception -> Lb5
            java.util.Objects.requireNonNull(r1)     // Catch: java.lang.Exception -> Lb5
            if (r8 != 0) goto Lb5
        L80:
            android.content.Context r8 = r1.getApplicationContext()     // Catch: java.lang.Exception -> Lb5
            java.lang.String r4 = "No survey available for re-verification.Submitting current survey..."
            android.widget.Toast r8 = android.widget.Toast.makeText(r8, r4, r3)     // Catch: java.lang.Exception -> Lb5
            r8.show()     // Catch: java.lang.Exception -> Lb5
            int r8 = ivas.gov.bisp.enumeration.p044bq.d.a
            r4 = r8 & 5
            r8 = r8 | 5
            int r4 = r4 + r8
            int r8 = r4 % 128
            ivas.gov.bisp.enumeration.p044bq.d.b = r8
            int r4 = r4 % r0
            if (r4 == 0) goto Lac
            r1.H()     // Catch: java.lang.Exception -> Lb5
            int r8 = ivas.gov.bisp.enumeration.p044bq.d.a
            r1 = r8 | 113(0x71, float:1.58E-43)
            int r1 = r1 << r3
            r8 = r8 ^ 113(0x71, float:1.58E-43)
            int r1 = r1 - r8
            int r8 = r1 % 128
            ivas.gov.bisp.enumeration.p044bq.d.b = r8
            int r1 = r1 % r0
            return
        Lac:
            r1.H()     // Catch: java.lang.Exception -> Lb5
            r2.hashCode()     // Catch: java.lang.Throwable -> Lb3 java.lang.Exception -> Lb5
            throw r2     // Catch: java.lang.Throwable -> Lb3 java.lang.Exception -> Lb5
        Lb3:
            r8 = move-exception
            throw r8
        Lb5:
            int r8 = ivas.gov.bisp.enumeration.p044bq.d.a
            r1 = r8 ^ 76
            r8 = r8 & 76
            int r8 = r8 << r3
            int r1 = r1 + r8
            int r1 = r1 - r3
            int r8 = r1 % 128
            ivas.gov.bisp.enumeration.p044bq.d.b = r8
            int r1 = r1 % r0
            if (r1 == 0) goto Lc6
            return
        Lc6:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p044bq.d.onPostExecute(java.lang.Object):void");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:20:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:22:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:24:0x010d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0117  */
    /* JADX WARN: Code duplicated, block: B:32:0x0167  */
    /* JADX WARN: Code duplicated, block: B:34:0x017c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0184  */
    /* JADX WARN: Code duplicated, block: B:38:0x01af  */
    /* JADX WARN: Code duplicated, block: B:39:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:46:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x014a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x014a A[SYNTHETIC] */
    @Override // android.os.AsyncTask
    public Survey doInBackground(Void[] voidArr) {
        Survey survey;
        String[] strArr;
        int i;
        int i2;
        Object obj;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = b;
        int i7 = ((i6 & (-74)) | ((~i6) & 73)) + ((i6 & 73) << 1);
        a = i7 % 128;
        if (i7 % 2 != 0) {
            survey = this.f;
            strArr = new String[0];
        } else {
            survey = this.f;
            strArr = new String[1];
        }
        strArr[0] = survey.batchName;
        ArrayList arrayList = new ArrayList(SugarRecord.find(Batch.class, "name=?", strArr));
        int i8 = b + 51;
        a = i8 % 128;
        Survey survey2 = null;
        if (i8 % 2 != 0) {
            arrayList.size();
            survey2.hashCode();
            throw null;
        }
        if (arrayList.size() > 0) {
            int i9 = b;
            int i10 = i9 & 13;
            int i11 = (i9 ^ 13) | i10;
            int i12 = (i10 & i11) + (i11 | i10);
            a = i12 % 128;
            int i13 = i12 % 2;
            Batch batch = (Batch) arrayList.get(0);
            int i14 = b;
            int i15 = i14 ^ 113;
            int i16 = (i14 & 113) << 1;
            int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
            a = i17 % 128;
            int i18 = i17 % 2;
            ArrayList arrayList2 = new ArrayList(SugarRecord.find(Survey.class, "batch_name = ? and user_type = ?and visitstatusid = ? ", batch.getName(), "1", "3"));
            ArrayList arrayList3 = new ArrayList();
            int i19 = b;
            int i20 = (i19 ^ 19) + ((i19 & 19) << 1);
            a = i20 % 128;
            if (i20 % 2 != 0) {
                int i21 = 3 / 0;
                if (arrayList2.size() > 0) {
                    int i22 = a;
                    int i23 = ((i22 ^ 23) | (i22 & 23)) << 1;
                    int i24 = -((i22 & (-24)) | ((~i22) & 23));
                    int i25 = (i23 ^ i24) + ((i23 & i24) << 1);
                    b = i25 % 128;
                    int i26 = i25 % 2;
                    int i27 = i22 & 59;
                    int i28 = -(-((i22 ^ 59) | i27));
                    int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
                    b = i29 % 128;
                    int i30 = i29 % 2;
                    i = 0;
                    while (i < arrayList2.size()) {
                        int i31 = a;
                        int i32 = (i31 & 35) + (i31 | 35);
                        b = i32 % 128;
                        int i33 = i32 % 2;
                        if (((Survey) arrayList2.get(i)).isSelectedAtRandom == 0) {
                            int i34 = a;
                            int i35 = i34 & 75;
                            int i36 = -(-((i34 ^ 75) | i35));
                            i4 = ((i35 | i36) << 1) - (i36 ^ i35);
                            b = i4 % 128;
                            if (i4 % 2 != 0) {
                                int i37 = ((Survey) arrayList2.get(i)).isSelectedForReSurvey;
                                throw null;
                            }
                            if (((Survey) arrayList2.get(i)).isSelectedForReSurvey == 0) {
                                arrayList3.add((Survey) arrayList2.get(i));
                                int i38 = b;
                                int i39 = (i38 ^ 32) + ((i38 & 32) << 1);
                                int i40 = (i39 ^ (-1)) + (i39 << 1);
                                a = i40 % 128;
                                int i41 = i40 % 2;
                                int i42 = (i38 & 60) + (i38 | 60);
                                int i43 = (i42 ^ (-1)) + (i42 << 1);
                                a = i43 % 128;
                                int i44 = i43 % 2;
                            }
                        }
                        i++;
                        int i45 = a;
                        int i46 = i45 & 17;
                        int i47 = -(-((i45 ^ 17) | i46));
                        int i48 = ((i46 | i47) << 1) - (i47 ^ i46);
                        b = i48 % 128;
                        int i49 = i48 % 2;
                    }
                    if (arrayList3.size() > 0) {
                        int i50 = a;
                        int i51 = i50 ^ 113;
                        int i52 = ((i50 & 113) | i51) << 1;
                        int i53 = -i51;
                        i2 = (i52 ^ i53) + ((i52 & i53) << 1);
                        b = i2 % 128;
                        if (i2 % 2 == 0) {
                            Collections.shuffle(arrayList3);
                            obj = arrayList3.get(1);
                        } else {
                            Collections.shuffle(arrayList3);
                            obj = arrayList3.get(0);
                        }
                        survey2 = (Survey) obj;
                        survey.isSelectedAtRandom = 0;
                        survey.survey_verified = BuildConfig.FLAVOR;
                        survey.save();
                        int i54 = b;
                        int i55 = (i54 & (-96)) | ((~i54) & 95);
                        int i56 = -(-((i54 & 95) << 1));
                        i3 = (i55 & i56) + (i56 | i55);
                        a = i3 % 128;
                        if (i3 % 2 != 0) {
                            survey2.isSelectedForReSurvey = 1;
                            survey2.isSelectedAtRandom = 0;
                        } else {
                            survey2.isSelectedForReSurvey = 1;
                            survey2.isSelectedAtRandom = 1;
                        }
                        survey2.save();
                        int i57 = a;
                        int i58 = i57 & 93;
                        int i59 = (((i57 ^ 93) | i58) << 1) - ((i57 | 93) & (~i58));
                        b = i59 % 128;
                        int i60 = i59 % 2;
                    }
                }
            } else if (arrayList2.size() > 0) {
                int i210 = a;
                int i211 = ((i210 ^ 23) | (i210 & 23)) << 1;
                int i212 = -((i210 & (-24)) | ((~i210) & 23));
                int i213 = (i211 ^ i212) + ((i211 & i212) << 1);
                b = i213 % 128;
                int i214 = i213 % 2;
                int i215 = i210 & 59;
                int i216 = -(-((i210 ^ 59) | i215));
                int i217 = ((i215 | i216) << 1) - (i216 ^ i215);
                b = i217 % 128;
                int i310 = i217 % 2;
                i = 0;
                while (i < arrayList2.size()) {
                    int i311 = a;
                    int i312 = (i311 & 35) + (i311 | 35);
                    b = i312 % 128;
                    int i313 = i312 % 2;
                    if (((Survey) arrayList2.get(i)).isSelectedAtRandom == 0) {
                        int i314 = a;
                        int i315 = i314 & 75;
                        int i316 = -(-((i314 ^ 75) | i315));
                        i4 = ((i315 | i316) << 1) - (i316 ^ i315);
                        b = i4 % 128;
                        if (i4 % 2 != 0) {
                            int i317 = ((Survey) arrayList2.get(i)).isSelectedForReSurvey;
                            throw null;
                        }
                        if (((Survey) arrayList2.get(i)).isSelectedForReSurvey == 0) {
                            arrayList3.add((Survey) arrayList2.get(i));
                            int i318 = b;
                            int i319 = (i318 ^ 32) + ((i318 & 32) << 1);
                            int i410 = (i319 ^ (-1)) + (i319 << 1);
                            a = i410 % 128;
                            int i411 = i410 % 2;
                            int i412 = (i318 & 60) + (i318 | 60);
                            int i413 = (i412 ^ (-1)) + (i412 << 1);
                            a = i413 % 128;
                            int i414 = i413 % 2;
                        }
                    }
                    i++;
                    int i415 = a;
                    int i416 = i415 & 17;
                    int i417 = -(-((i415 ^ 17) | i416));
                    int i418 = ((i416 | i417) << 1) - (i417 ^ i416);
                    b = i418 % 128;
                    int i419 = i418 % 2;
                }
                if (arrayList3.size() > 0) {
                    int i510 = a;
                    int i511 = i510 ^ 113;
                    int i512 = ((i510 & 113) | i511) << 1;
                    int i513 = -i511;
                    i2 = (i512 ^ i513) + ((i512 & i513) << 1);
                    b = i2 % 128;
                    if (i2 % 2 == 0) {
                        Collections.shuffle(arrayList3);
                        obj = arrayList3.get(1);
                    } else {
                        Collections.shuffle(arrayList3);
                        obj = arrayList3.get(0);
                    }
                    survey2 = (Survey) obj;
                    survey.isSelectedAtRandom = 0;
                    survey.survey_verified = BuildConfig.FLAVOR;
                    survey.save();
                    int i514 = b;
                    int i515 = (i514 & (-96)) | ((~i514) & 95);
                    int i516 = -(-((i514 & 95) << 1));
                    i3 = (i515 & i516) + (i516 | i515);
                    a = i3 % 128;
                    if (i3 % 2 != 0) {
                        survey2.isSelectedForReSurvey = 1;
                        survey2.isSelectedAtRandom = 0;
                    } else {
                        survey2.isSelectedForReSurvey = 1;
                        survey2.isSelectedAtRandom = 1;
                    }
                    survey2.save();
                    int i517 = a;
                    int i518 = i517 & 93;
                    int i519 = (((i517 ^ 93) | i518) << 1) - ((i517 | 93) & (~i518));
                    b = i519 % 128;
                    int i61 = i519 % 2;
                }
            }
        }
        int i62 = a;
        int i63 = i62 & 3;
        int i64 = ((i62 ^ 3) | i63) << 1;
        int i65 = -((i62 | 3) & (~i63));
        int i66 = (i64 ^ i65) + ((i65 & i64) << 1);
        b = i66 % 128;
        int i67 = i66 % 2;
        return survey2;
    }
}
