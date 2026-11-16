package ivas.gov.bisp.enumeration.p044bq;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import ivas.gov.bisp.enumeration.BISPApplication;
import ivas.gov.bisp.enumeration.W.P;
import ivas.gov.bisp.enumeration.bK.b;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.offlinesurvey;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.survey;
import ivas.gov.bisp.enumeration.p024ax.ax;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.util.ArrayList;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class f extends AsyncTask<Void, Void, Void> {
    private static int a = 0;
    private static int b = 1;
    public P c;
    public ArrayList<survey> d = new ArrayList<>();
    public ArrayList<offlinesurvey> e = new ArrayList<>();
    public String f;
    public BISPApplication g;
    public boolean h;
    public ProgressDialog i;
    public AppCompatActivity j;
    public SessionManager k;
    public AppDatabase l;
    public String m;
    public String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f75o;

    public f(AppCompatActivity appCompatActivity, View view, boolean z, String str, String str2, P p) {
        this.j = appCompatActivity;
        this.h = z;
        this.m = str;
        this.n = str2;
        this.f75o = view;
        this.c = p;
        this.k = new SessionManager(appCompatActivity);
        ProgressDialog progressDialog = new ProgressDialog(appCompatActivity);
        this.i = progressDialog;
        progressDialog.setCancelable(false);
        this.g = BISPApplication.c();
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        String str;
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((((i2 ^ 25) | (i2 & 25)) << 1) - (~(-(((~i2) & 25) | (i2 & (-26)))))) - 1;
        b = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            super.onPreExecute();
            obj.hashCode();
            throw null;
        }
        super.onPreExecute();
        if (!this.h) {
            int i4 = a;
            int i5 = ((i4 ^ 2) + ((i4 & 2) << 1)) - 1;
            int i6 = i5 % 128;
            b = i6;
            if (i5 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i7 = ((i6 | 79) << 1) - (i6 ^ 79);
            a = i7 % 128;
            int i8 = i7 % 2;
            str = "Please wait data conversion....";
        } else {
            str = "Uploading";
            int i9 = a;
            int i10 = i9 ^ 67;
            int i11 = -(-((i9 & 67) << 1));
            int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
            b = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 3 % 2;
            }
        }
        ax.h(this.i, str);
        this.g = BISPApplication.c();
        int i14 = a;
        int i15 = i14 & 73;
        int i16 = (i15 - (~((i14 ^ 73) | i15))) - 1;
        b = i16 % 128;
        if (i16 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(Void r14) {
        String strD;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 | 9) << 1;
        int i4 = -(i2 ^ 9);
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            super.onPostExecute(r14);
            obj.hashCode();
            throw null;
        }
        super.onPostExecute(r14);
        BISPApplication bISPApplication = this.g;
        bISPApplication.i = false;
        int i6 = a + 75;
        b = i6 % 128;
        if (i6 % 2 == 0) {
            bISPApplication.i = true;
            this.d.size();
            throw null;
        }
        bISPApplication.i = true;
        if (this.d.size() > 0) {
            int i7 = a;
            int i8 = i7 & 63;
            int i9 = ((i7 | 63) & (~i8)) + (i8 << 1);
            b = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 0;
            while (i11 < this.d.size()) {
                try {
                    JSONObject jSONObject = new JSONObject(this.d.get(i11).data);
                    int i12 = a;
                    int i13 = ((i12 ^ 109) | (i12 & 109)) << 1;
                    int i14 = -((i12 & (-110)) | ((~i12) & 109));
                    int i15 = (i13 ^ i14) + ((i13 & i14) << 1);
                    b = i15 % 128;
                    int i16 = i15 % 2;
                    if (!this.h) {
                        int i17 = i12 & 59;
                        int i18 = (i12 ^ 59) | i17;
                        int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
                        b = i19 % 128;
                        int i20 = i19 % 2;
                        String string = jSONObject.getString("string1");
                        String string2 = jSONObject.getString("string2");
                        byte[] bArrB = b.b(this.m);
                        int i21 = a;
                        int i22 = i21 & 107;
                        int i23 = (i21 | 107) & (~i22);
                        int i24 = i22 << 1;
                        int i25 = (i23 & i24) + (i23 | i24);
                        b = i25 % 128;
                        int i26 = i25 % 2;
                        String strC = b.c(string, bArrB, b.b(this.n));
                        String str = this.m;
                        int i27 = a;
                        int i28 = (i27 & (-106)) | ((~i27) & 105);
                        int i29 = (i27 & 105) << 1;
                        int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
                        b = i30 % 128;
                        int i31 = i30 % 2;
                        b.c(string2, b.b(str), b.b(this.n));
                        jSONObject = new JSONObject();
                        byte[] bArrB2 = b.b(this.k.k());
                        int i32 = a;
                        int i33 = ((i32 ^ 122) + ((i32 & 122) << 1)) - 1;
                        b = i33 % 128;
                        if (i33 % 2 == 0) {
                            strD = b.d(strC, bArrB2, b.b(this.k.m()));
                            int i34 = 59 / 0;
                        } else {
                            strD = b.d(strC, bArrB2, b.b(this.k.m()));
                        }
                        jSONObject.put("string1", strD);
                        byte[] bArrB3 = b.b(this.k.k());
                        SessionManager sessionManager = this.k;
                        int i35 = a + 61;
                        b = i35 % 128;
                        int i36 = i35 % 2;
                        jSONObject.put("string2", b.d("StoreHouseholdSurveyData29102026", bArrB3, b.b(sessionManager.m())));
                        AppDatabase appDatabase = this.l;
                        int i37 = a;
                        int i38 = ((i37 | 11) << 1) - (i37 ^ 11);
                        b = i38 % 128;
                        int i39 = i38 % 2;
                        appDatabase.m().aN(i11, jSONObject.toString());
                        int i40 = b;
                        int i41 = i40 & 53;
                        int i42 = (((i40 | 53) & (~i41)) - (~(-(-(i41 << 1))))) - 1;
                        a = i42 % 128;
                        int i43 = i42 % 2;
                    }
                    if (this.h) {
                        AppCompatActivity appCompatActivity = this.j;
                        an anVar = new an(this, i11);
                        int i44 = a;
                        int i45 = i44 & 71;
                        int i46 = (i44 | 71) & (~i45);
                        int i47 = i45 << 1;
                        int i48 = (i46 ^ i47) + ((i46 & i47) << 1);
                        b = i48 % 128;
                        int i49 = i48 % 2;
                        ax.d(false, jSONObject, appCompatActivity, "/api/Roster/bZJVzTu9rHlQm0D", anVar);
                        int i50 = b;
                        int i51 = i50 & 119;
                        int i52 = ((i50 | 119) & (~i51)) + (i51 << 1);
                        a = i52 % 128;
                        int i53 = i52 % 2;
                    }
                } catch (Exception e) {
                    ax.b(this.i);
                    StringBuilder sb = new StringBuilder();
                    sb.append("Exception Occurred: ");
                    sb.append(e.getMessage());
                    this.f = sb.toString();
                    View view = this.f75o;
                    if (view != null) {
                        view.setEnabled(true);
                        AppCompatActivity appCompatActivity2 = this.j;
                        int i54 = b;
                        int i55 = ((i54 & (-116)) | ((~i54) & 115)) + ((i54 & 115) << 1);
                        a = i55 % 128;
                        if (i55 % 2 != 0) {
                            ax.g(appCompatActivity2, "Failure", this.f);
                            throw null;
                        }
                        ax.g(appCompatActivity2, "Failure", this.f);
                    } else {
                        continue;
                    }
                }
                int i56 = i11 - 87;
                i11 = (i56 | 88) + (i56 & 88);
                int i57 = b;
                int i58 = (i57 ^ 57) + ((i57 & 57) << 1);
                a = i58 % 128;
                int i59 = i58 % 2;
            }
        } else {
            ax.b(this.i);
            View view2 = this.f75o;
            if (view2 != null) {
                int i60 = b;
                int i61 = i60 & 23;
                int i62 = i60 | 23;
                int i63 = (i61 & i62) + (i62 | i61);
                a = i63 % 128;
                int i64 = i63 % 2;
                view2.setEnabled(true);
                if (this.h) {
                    int i65 = b;
                    int i66 = (i65 & 41) + (i65 | 41);
                    a = i66 % 128;
                    if (i66 % 2 != 0) {
                        ax.g(this.j, "Alert", "All Online Form to uploaded");
                        int i67 = 85 / 0;
                    } else {
                        ax.g(this.j, "Alert", "All Online Form to uploaded");
                    }
                    int i68 = a;
                    int i69 = i68 & 105;
                    int i70 = (i68 | 105) & (~i69);
                    int i71 = i69 << 1;
                    int i72 = (i70 ^ i71) + ((i70 & i71) << 1);
                    b = i72 % 128;
                    int i73 = i72 % 2;
                }
            }
        }
        int i74 = b + 63;
        a = i74 % 128;
        int i75 = i74 % 2;
    }

    @Override // android.os.AsyncTask
    public Void doInBackground(Void[] voidArr) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 77) << 1) - (i2 ^ 77);
        b = i3 % 128;
        int i4 = i3 % 2;
        AppDatabase appDatabaseL = AppDatabase.l(this.j);
        int i5 = a + 15;
        b = i5 % 128;
        int i6 = i5 % 2;
        this.l = appDatabaseL;
        appDatabaseL.m().an();
        this.e = new ArrayList<>(this.l.m().Y());
        ArrayList<survey> arrayList = new ArrayList<>(this.l.m().ac());
        int i7 = a;
        int i8 = i7 & 55;
        int i9 = -(-((i7 ^ 55) | i8));
        int i10 = (i8 & i9) + (i9 | i8);
        b = i10 % 128;
        int i11 = i10 % 2;
        Object obj = null;
        this.d = arrayList;
        if (i11 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }
}
