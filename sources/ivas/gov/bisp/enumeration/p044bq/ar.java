package ivas.gov.bisp.enumeration.p044bq;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import ivas.gov.bisp.enumeration.W.P;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.survey;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.survey_count;
import ivas.gov.bisp.enumeration.p024ax.ax;
import ivas.gov.bisp.enumeration.p096p.h;
import java.util.ArrayList;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public class ar extends AsyncTask<Void, Void, Void> {
    private static int a = 1;
    private static int b;
    public ArrayList<survey> c;
    public int d;
    public AppCompatActivity e;
    public ProgressDialog f;
    public AlertDialog g;
    public P h;
    public View i;

    public ar(AppCompatActivity appCompatActivity, View view, ArrayList<survey> arrayList, int i, P p, AlertDialog alertDialog) {
        this.e = appCompatActivity;
        this.h = p;
        this.c = arrayList;
        this.d = i;
        this.g = alertDialog;
        this.i = view;
        this.f = new ProgressDialog(appCompatActivity);
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(Void r7) {
        int i = 2 % 2;
        super.onPostExecute(r7);
        G g = new G(this.e, this.h);
        int i2 = a;
        int i3 = i2 & 101;
        int i4 = ((i2 | 101) & (~i3)) + (i3 << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        g.execute(new Void[0]);
        ax.b(this.f);
        int i6 = a;
        int i7 = (((i6 | 77) << 1) - (~(-(((~i6) & 77) | (i6 & (-78)))))) - 1;
        b = i7 % 128;
        int i8 = i7 % 2;
        if (this.c.size() > 0) {
            Handler handler = new Handler(Looper.getMainLooper());
            ao aoVar = new ao(this);
            int i9 = a;
            int i10 = ((i9 ^ 26) + ((i9 & 26) << 1)) - 1;
            b = i10 % 128;
            if (i10 % 2 != 0) {
                handler.postDelayed(aoVar, 5000L);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            handler.postDelayed(aoVar, 5000L);
            int i11 = a + 109;
            b = i11 % 128;
            int i12 = i11 % 2;
        }
        int i13 = b;
        int i14 = (i13 & (-84)) | ((~i13) & 83);
        int i15 = (i13 & 83) << 1;
        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
        a = i16 % 128;
        int i17 = i16 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0079  */
    /* JADX WARN: Code duplicated, block: B:17:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:18:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:20:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:22:0x010c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0113  */
    @Override // android.os.AsyncTask
    public Void doInBackground(Void[] voidArr) {
        AppDatabase appDatabaseL;
        survey_count survey_countVar;
        int i;
        int i2;
        int i3;
        int i4;
        h hVarM;
        survey_count survey_countVar2;
        int i5;
        int i6 = 2 % 2;
        int i7 = b + 91;
        a = i7 % 128;
        if (i7 % 2 == 0) {
            appDatabaseL = AppDatabase.l(this.e);
            int i8 = 89 / 0;
        } else {
            appDatabaseL = AppDatabase.l(this.e);
        }
        int i9 = a;
        int i10 = (((i9 ^ 63) | (i9 & 63)) << 1) - (((~i9) & 63) | (i9 & (-64)));
        b = i10 % 128;
        if (i10 % 2 != 0) {
            appDatabaseL.m();
            this.c.get(this.d);
            throw null;
        }
        appDatabaseL.m().L(this.c.get(this.d).id);
        ArrayList arrayList = new ArrayList(appDatabaseL.m().P());
        int i11 = b;
        int i12 = (i11 & 23) + (i11 | 23);
        a = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 90 / 0;
            if (arrayList.size() > 0) {
                survey_countVar = (survey_count) arrayList.get(this.d);
                int i14 = a;
                int i15 = i14 & 125;
                int i16 = i14 | 125;
                int i17 = (i15 & i16) + (i16 | i15);
                b = i17 % 128;
                int i18 = i17 % 2;
                h hVarM2 = appDatabaseL.m();
                long j = survey_countVar.id;
                i = survey_countVar.sync_count;
                int i19 = a;
                i2 = (((i19 | 118) << 1) - (i19 ^ 118)) - 1;
                b = i2 % 128;
                if (i2 % 2 != 0) {
                    i3 = survey_countVar.not_sync_count;
                    i4 = (i ^ 1) + ((i & 1) << 1);
                } else {
                    i3 = survey_countVar.not_sync_count;
                    int i20 = i | 1;
                    i4 = (i20 << 1) - ((~(i & 1)) & i20);
                }
                int i21 = a;
                int i22 = i21 & 51;
                int i23 = (((i21 | 51) & (~i22)) - (~(-(-(i22 << 1))))) - 1;
                b = i23 % 128;
                int i24 = i23 % 2;
                int i25 = ((i3 ^ (-1)) | i3) << 1;
                int i26 = -(~i3);
                hVarM2.aS(j, i4, (i25 ^ i26) + ((i26 & i25) << 1));
                int i27 = a;
                int i28 = i27 & 29;
                int i29 = -(-((i27 ^ 29) | i28));
                int i30 = (i28 & i29) + (i29 | i28);
                b = i30 % 128;
                int i31 = i30 % 2;
            } else {
                hVarM = appDatabaseL.m();
                survey_countVar2 = new survey_count(new Date().getTime(), 1, 0);
                i5 = b + 23;
                a = i5 % 128;
                if (i5 % 2 == 0) {
                    hVarM.bn(survey_countVar2);
                    int i32 = 19 / 0;
                } else {
                    hVarM.bn(survey_countVar2);
                }
                int i33 = a;
                int i34 = i33 & 97;
                int i35 = (i33 | 97) & (~i34);
                int i36 = i34 << 1;
                int i37 = ((i35 | i36) << 1) - (i35 ^ i36);
                b = i37 % 128;
                int i38 = i37 % 2;
            }
        } else if (arrayList.size() > 0) {
            survey_countVar = (survey_count) arrayList.get(this.d);
            int i110 = a;
            int i111 = i110 & 125;
            int i112 = i110 | 125;
            int i113 = (i111 & i112) + (i112 | i111);
            b = i113 % 128;
            int i114 = i113 % 2;
            h hVarM3 = appDatabaseL.m();
            long j2 = survey_countVar.id;
            i = survey_countVar.sync_count;
            int i115 = a;
            i2 = (((i115 | 118) << 1) - (i115 ^ 118)) - 1;
            b = i2 % 128;
            if (i2 % 2 != 0) {
                i3 = survey_countVar.not_sync_count;
                i4 = (i ^ 1) + ((i & 1) << 1);
            } else {
                i3 = survey_countVar.not_sync_count;
                int i210 = i | 1;
                i4 = (i210 << 1) - ((~(i & 1)) & i210);
            }
            int i211 = a;
            int i212 = i211 & 51;
            int i213 = (((i211 | 51) & (~i212)) - (~(-(-(i212 << 1))))) - 1;
            b = i213 % 128;
            int i214 = i213 % 2;
            int i215 = ((i3 ^ (-1)) | i3) << 1;
            int i216 = -(~i3);
            hVarM3.aS(j2, i4, (i215 ^ i216) + ((i216 & i215) << 1));
            int i217 = a;
            int i218 = i217 & 29;
            int i219 = -(-((i217 ^ 29) | i218));
            int i39 = (i218 & i219) + (i219 | i218);
            b = i39 % 128;
            int i310 = i39 % 2;
        } else {
            hVarM = appDatabaseL.m();
            survey_countVar2 = new survey_count(new Date().getTime(), 1, 0);
            i5 = b + 23;
            a = i5 % 128;
            if (i5 % 2 == 0) {
                hVarM.bn(survey_countVar2);
                int i311 = 19 / 0;
            } else {
                hVarM.bn(survey_countVar2);
            }
            int i312 = a;
            int i313 = i312 & 97;
            int i314 = (i312 | 97) & (~i313);
            int i315 = i313 << 1;
            int i316 = ((i314 | i315) << 1) - (i314 ^ i315);
            b = i316 % 128;
            int i317 = i316 % 2;
        }
        int i40 = a;
        int i41 = i40 & 105;
        int i42 = (i40 | 105) & (~i41);
        int i43 = -(-(i41 << 1));
        int i44 = (i42 ^ i43) + ((i42 & i43) << 1);
        b = i44 % 128;
        int i45 = i44 % 2;
        return null;
    }
}
