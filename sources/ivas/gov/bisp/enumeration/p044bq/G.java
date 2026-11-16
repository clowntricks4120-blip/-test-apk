package ivas.gov.bisp.enumeration.p044bq;

import android.os.AsyncTask;
import androidx.appcompat.app.AppCompatActivity;
import ivas.gov.bisp.enumeration.W.P;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.not_at_home;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.offline_survey_count;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.survey_count;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class G extends AsyncTask<Void, Void, Void> {
    private static int a = 1;
    private static int b;
    public ArrayList<survey_count> c = new ArrayList<>();
    public ArrayList<offline_survey_count> d = new ArrayList<>();
    public ArrayList<not_at_home> e;
    public AppCompatActivity f;
    public P g;

    public G(AppCompatActivity appCompatActivity, P p) {
        this.f = appCompatActivity;
        this.g = p;
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(Void r5) {
        int i = 2 % 2;
        int i2 = a + 85;
        b = i2 % 128;
        int i3 = i2 % 2;
        super.onPostExecute(r5);
        P p = this.g;
        int i4 = b + 47;
        a = i4 % 128;
        int i5 = i4 % 2;
        p.n(this.e, this.c, this.d);
        int i6 = b;
        int i7 = i6 & 81;
        int i8 = -(-((i6 ^ 81) | i7));
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        a = i9 % 128;
        if (i9 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.os.AsyncTask
    public Void doInBackground(Void[] voidArr) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 | 79) << 1;
        int i4 = -(((~i2) & 79) | (i2 & (-80)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            AppDatabase.l(this.f);
            throw null;
        }
        AppDatabase appDatabaseL = AppDatabase.l(this.f);
        this.c = new ArrayList<>(appDatabaseL.m().P());
        this.d = new ArrayList<>(appDatabaseL.m().W());
        ArrayList<not_at_home> arrayList = new ArrayList<>(appDatabaseL.m().X());
        int i6 = a;
        int i7 = (i6 & 97) + (i6 | 97);
        int i8 = i7 % 128;
        b = i8;
        if (i7 % 2 != 0) {
            this.e = arrayList;
            obj.hashCode();
            throw null;
        }
        this.e = arrayList;
        int i9 = i8 & 31;
        int i10 = i9 + ((i8 ^ 31) | i9);
        a = i10 % 128;
        int i11 = i10 % 2;
        return null;
    }
}
