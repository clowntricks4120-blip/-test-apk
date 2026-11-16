package ivas.gov.bisp.enumeration.p044bq;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.widget.TextView;
import com.orm.SugarRecord;
import ivas.gov.bisp.enumeration.ActivityUnassignedSurvey;
import ivas.gov.bisp.enumeration.models.Survey;
import ivas.gov.bisp.enumeration.p043bp.B;
import java.util.ArrayList;
import java.util.List;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class k extends AsyncTask<Void, Void, Void> {
    private static int a = 0;
    private static int b = 1;
    public ProgressDialog c;
    public bqk e;
    public Context f;
    public List<Survey> d = null;
    public int g = 0;

    public interface bqk {
    }

    public k(Context context, bqk bqkVar) {
        this.f = context;
        this.e = bqkVar;
    }

    @Override // android.os.AsyncTask
    public Void doInBackground(Void[] voidArr) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 81;
        int i4 = ((i2 & 81) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 & i5) + (i4 | i5);
        int i7 = i6 % 128;
        b = i7;
        int i8 = i6 % 2;
        int i9 = (((i7 | 5) << 1) - (~(-(((~i7) & 5) | (i7 & (-6)))))) - 1;
        a = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 5 % 4;
        }
        while (true) {
            int i11 = this.g;
            StringBuilder sb = new StringBuilder();
            int i12 = a;
            int i13 = i12 & 43;
            int i14 = (i12 ^ 43) | i13;
            int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
            b = i15 % 128;
            Object obj = null;
            if (i15 % 2 == 0) {
                sb.append("SELECT * FROM SURVEY LEFT JOIN BATCH ON SURVEY.BATCH_NAME = BATCH.NAME WHERE SURVEY.IS_SENT_TO_SERVER = 0 AND BATCH.NAME IS NULL LIMIT ");
                sb.append(i11);
                sb.append(",");
                throw null;
            }
            sb.append("SELECT * FROM SURVEY LEFT JOIN BATCH ON SURVEY.BATCH_NAME = BATCH.NAME WHERE SURVEY.IS_SENT_TO_SERVER = 0 AND BATCH.NAME IS NULL LIMIT ");
            sb.append(i11);
            sb.append(",");
            sb.append(100);
            String string = sb.toString();
            int i16 = b;
            int i17 = i16 & 37;
            int i18 = (((i16 ^ 37) | i17) << 1) - ((i16 | 37) & (~i17));
            a = i18 % 128;
            int i19 = i18 % 2;
            List listFindWithQuery = SugarRecord.findWithQuery(Survey.class, string, BuildConfig.FLAVOR);
            if (listFindWithQuery == null) {
                listFindWithQuery = new ArrayList();
                int i20 = a;
                int i21 = i20 & 25;
                int i22 = -(-(i20 | 25));
                int i23 = (i21 & i22) + (i22 | i21);
                b = i23 % 128;
                int i24 = i23 % 2;
            }
            if (listFindWithQuery.size() <= 0) {
                int i25 = b;
                int i26 = i25 & 47;
                int i27 = -(-((i25 ^ 47) | i26));
                int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
                a = i28 % 128;
                if (i28 % 2 == 0) {
                    return null;
                }
                obj.hashCode();
                throw null;
            }
            int i29 = b;
            int i30 = i29 & 13;
            int i31 = (((i29 ^ 13) | i30) << 1) - ((i29 | 13) & (~i30));
            a = i31 % 128;
            if (i31 % 2 != 0) {
                this.d.addAll(listFindWithQuery);
                obj.hashCode();
                throw null;
            }
            this.d.addAll(listFindWithQuery);
            int i32 = this.g;
            int i33 = a;
            int i34 = i33 & 55;
            int i35 = (i33 | 55) & (~i34);
            int i36 = i34 << 1;
            int i37 = (i35 & i36) + (i35 | i36);
            b = i37 % 128;
            if (i37 % 2 == 0) {
                this.g = i32 >>> 49;
            } else {
                this.g = i32 + 100;
            }
        }
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        int i = 2 % 2;
        try {
            this.d = new ArrayList();
            ProgressDialog progressDialog = new ProgressDialog(this.f);
            int i2 = b + 111;
            a = i2 % 128;
            if (i2 % 2 != 0) {
                this.c = progressDialog;
            } else {
                this.c = progressDialog;
            }
            progressDialog.setCancelable(false);
            ProgressDialog progressDialog2 = this.c;
            int i3 = a;
            int i4 = (i3 | 55) << 1;
            int i5 = -(i3 ^ 55);
            int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
            b = i6 % 128;
            int i7 = i6 % 2;
            progressDialog2.setMessage("Getting unassigned surveys...");
            this.c.setIndeterminate(true);
            int i8 = a + 113;
            b = i8 % 128;
            int i9 = i8 % 2;
            this.c.show();
            int i10 = a;
            int i11 = i10 ^ 101;
            int i12 = -(-((i10 & 101) << 1));
            int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
            b = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = 41 / 0;
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(Void r8) {
        ProgressDialog progressDialog;
        int i = 2 % 2;
        int i2 = a + 113;
        b = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                super.onPostExecute(r8);
                progressDialog = this.c;
                int i3 = 52 / 0;
            } else {
                super.onPostExecute(r8);
                try {
                    progressDialog = this.c;
                } catch (NumberFormatException e) {
                    throw e;
                }
            }
            Object obj = null;
            if (progressDialog != null) {
                int i4 = a;
                int i5 = (i4 & 93) + (i4 | 93);
                b = i5 % 128;
                if (i5 % 2 == 0) {
                    progressDialog.isShowing();
                    throw null;
                }
                if (progressDialog.isShowing()) {
                    int i6 = b;
                    int i7 = i6 & 85;
                    int i8 = (i6 ^ 85) | i7;
                    int i9 = (i7 & i8) + (i8 | i7);
                    a = i9 % 128;
                    int i10 = i9 % 2;
                    this.c.dismiss();
                    int i11 = b;
                    int i12 = i11 & 7;
                    int i13 = (((i11 | 7) & (~i12)) - (~(-(-(i12 << 1))))) - 1;
                    a = i13 % 128;
                    int i14 = i13 % 2;
                }
            }
            bqk bqkVar = this.e;
            if (bqkVar != null) {
                int i15 = b + 117;
                a = i15 % 128;
                if (i15 % 2 != 0) {
                    this.d.size();
                    obj.hashCode();
                    throw null;
                }
                List<Survey> list = this.d;
                int size = list.size();
                B b2 = (B) bqkVar;
                int i16 = b;
                int i17 = (i16 | 85) << 1;
                int i18 = -(((~i16) & 85) | (i16 & (-86)));
                int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
                a = i19 % 128;
                int i20 = i19 % 2;
                ActivityUnassignedSurvey activityUnassignedSurvey = b2.a;
                activityUnassignedSurvey.ag = size;
                activityUnassignedSurvey.af = list;
                TextView textView = activityUnassignedSurvey.textViewTotal;
                StringBuilder sb = new StringBuilder();
                int i21 = a;
                int i22 = ((i21 & 56) + (i21 | 56)) - 1;
                b = i22 % 128;
                int i23 = i22 % 2;
                sb.append(b2.a.ag);
                int i24 = b + 39;
                a = i24 % 128;
                if (i24 % 2 != 0) {
                    textView.setText(sb.toString());
                    throw null;
                }
                textView.setText(sb.toString());
                int i25 = b;
                int i26 = i25 & 25;
                int i27 = (i25 ^ 25) | i26;
                int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
                a = i28 % 128;
                if (i28 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        } catch (Exception unused) {
        }
        int i29 = a;
        int i30 = i29 & 27;
        int i31 = (i29 ^ 27) | i30;
        int i32 = (i30 ^ i31) + ((i31 & i30) << 1);
        b = i32 % 128;
        int i33 = i32 % 2;
    }
}
