package ivas.gov.bisp.enumeration.bK;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.W.x;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.district;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class as extends AsyncTask<Void, Void, Void> {
    private static int a = 1;
    private static int b;
    public Context c;
    public int d;
    public String e;
    public Spinner f;
    public x i;
    public ArrayList<district> h = new ArrayList<>();
    public ArrayList<String> g = new ArrayList<>();

    public as(Context context, int i, String str, Spinner spinner, x xVar) {
        this.c = context;
        this.d = i;
        this.e = str;
        this.f = spinner;
        this.i = xVar;
    }

    @Override // android.os.AsyncTask
    public Void doInBackground(Void[] voidArr) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 51) + ((i2 & 51) << 1);
        a = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            AppDatabase.l(this.c.getApplicationContext());
            throw null;
        }
        AppDatabase appDatabaseL = AppDatabase.l(this.c.getApplicationContext());
        int i4 = a;
        int i5 = (-2) - ((((i4 | 32) << 1) - (i4 ^ 32)) ^ (-1));
        b = i5 % 128;
        if (i5 % 2 != 0) {
            appDatabaseL.m().ag(this.d);
            appDatabaseL.m();
            throw null;
        }
        appDatabaseL.m().ag(this.d);
        List listAg = appDatabaseL.m().ag(this.d);
        if (listAg.size() > 0) {
            int i6 = b + 63;
            int i7 = i6 % 128;
            a = i7;
            int i8 = i6 % 2;
            String str = this.e;
            if (str != null) {
                int i9 = ((i7 ^ 71) | (i7 & 71)) << 1;
                int i10 = -(((~i7) & 71) | (i7 & (-72)));
                int i11 = (i9 & i10) + (i10 | i9);
                b = i11 % 128;
                if (i11 % 2 != 0) {
                    str.length();
                    obj.hashCode();
                    throw null;
                }
                if (str.length() > 0) {
                    ArrayList<district> arrayList = this.h;
                    district districtVar = new district("0", 0, 0, this.d, this.e);
                    int i12 = b;
                    int i13 = i12 & 53;
                    int i14 = i13 + ((i12 ^ 53) | i13);
                    a = i14 % 128;
                    if (i14 % 2 == 0) {
                        arrayList.add(districtVar);
                        this.g.add(this.e);
                        throw null;
                    }
                    arrayList.add(districtVar);
                    this.g.add(this.e);
                    int i15 = b;
                    int i16 = ((i15 | 35) << 1) - (i15 ^ 35);
                    a = i16 % 128;
                    if (i16 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                }
            }
            int i17 = a;
            int i18 = (i17 & 69) + (i17 | 69);
            b = i18 % 128;
            int i19 = i18 % 2;
            int i20 = 0;
            while (i20 < listAg.size()) {
                int i21 = a;
                int i22 = ((i21 | 71) << 1) - (i21 ^ 71);
                b = i22 % 128;
                if (i22 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                ArrayList<district> arrayList2 = this.h;
                String str2 = ((district) listAg.get(i20)).id;
                int i23 = ((district) listAg.get(i20)).distcode;
                int i24 = a;
                int i25 = i24 & 49;
                int i26 = (((i24 ^ 49) | i25) << 1) - ((i24 | 49) & (~i25));
                b = i26 % 128;
                if (i26 % 2 != 0) {
                    int i27 = ((district) listAg.get(i20)).divcode;
                    obj.hashCode();
                    throw null;
                }
                district districtVar2 = new district(str2, i23, ((district) listAg.get(i20)).divcode, ((district) listAg.get(i20)).provcode, ((district) listAg.get(i20)).district);
                int i28 = a + 37;
                b = i28 % 128;
                int i29 = i28 % 2;
                arrayList2.add(districtVar2);
                ArrayList<String> arrayList3 = this.g;
                int i30 = a;
                int i31 = i30 & 31;
                int i32 = (i30 ^ 31) | i31;
                int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
                b = i33 % 128;
                int i34 = i33 % 2;
                arrayList3.add(((district) listAg.get(i20)).district);
                int i35 = (i20 & (-2)) | ((~i20) & 1);
                int i36 = (i20 & 1) << 1;
                i20 = (i36 | i35) + (i35 & i36);
                int i37 = a + 99;
                b = i37 % 128;
                int i38 = i37 % 2;
            }
        }
        int i39 = a;
        int i40 = (i39 & 87) + (i39 | 87);
        b = i40 % 128;
        int i41 = i40 % 2;
        return null;
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(Void r6) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & 38) + (i2 | 38)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        super.onPostExecute(r6);
        if (this.f != null) {
            this.f.setAdapter((SpinnerAdapter) new ArrayAdapter(this.c, R.layout.spinner_item, this.g));
            Spinner spinner = this.f;
            ar arVar = new ar(this);
            int i5 = b;
            int i6 = ((i5 | 115) << 1) - (i5 ^ 115);
            a = i6 % 128;
            int i7 = i6 % 2;
            spinner.setOnItemSelectedListener(arVar);
            int i8 = b;
            int i9 = i8 & 113;
            int i10 = -(-((i8 ^ 113) | i9));
            int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
            a = i11 % 128;
            int i12 = i11 % 2;
        }
        x xVar = this.i;
        ArrayList<district> arrayList = this.h;
        ArrayList<String> arrayList2 = this.g;
        int i13 = a;
        int i14 = (i13 ^ 69) + ((i13 & 69) << 1);
        b = i14 % 128;
        int i15 = i14 % 2;
        xVar.fillDistList(arrayList, arrayList2);
        int i16 = b + 121;
        a = i16 % 128;
        int i17 = i16 % 2;
    }
}
