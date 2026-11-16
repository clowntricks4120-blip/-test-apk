package ivas.gov.bisp.enumeration.bK;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.W.N;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.tehsil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ay extends AsyncTask<Void, Void, Void> {
    private static int a = 1;
    private static int b;
    public Context c;
    public int d;
    public String e;
    public Spinner f;
    public N i;
    public ArrayList<tehsil> h = new ArrayList<>();
    public ArrayList<String> g = new ArrayList<>();

    public ay(Context context, int i, String str, Spinner spinner, N n) {
        this.c = context;
        this.d = i;
        this.e = str;
        this.f = spinner;
        this.i = n;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0030  */
    @Override // android.os.AsyncTask
    public void onPostExecute(Void r5) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 77;
        int i4 = -(-((i2 ^ 77) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        if (i5 % 2 == 0) {
            super.onPostExecute(r5);
            int i6 = 23 / 0;
            if (this.f != null) {
                ArrayAdapter arrayAdapter = new ArrayAdapter(this.c, R.layout.spinner_item, this.g);
                int i7 = b;
                int i8 = i7 ^ 71;
                int i9 = -(-((i7 & 71) << 1));
                int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
                a = i10 % 128;
                int i11 = i10 % 2;
                this.f.setAdapter((SpinnerAdapter) arrayAdapter);
                this.f.setOnItemSelectedListener(new at(this));
                int i12 = b;
                int i13 = ((i12 ^ 78) + ((i12 & 78) << 1)) - 1;
                a = i13 % 128;
                int i14 = i13 % 2;
            }
        } else {
            super.onPostExecute(r5);
            if (this.f != null) {
                ArrayAdapter arrayAdapter2 = new ArrayAdapter(this.c, R.layout.spinner_item, this.g);
                int i15 = b;
                int i16 = i15 ^ 71;
                int i17 = -(-((i15 & 71) << 1));
                int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
                a = i18 % 128;
                int i19 = i18 % 2;
                this.f.setAdapter((SpinnerAdapter) arrayAdapter2);
                this.f.setOnItemSelectedListener(new at(this));
                int i110 = b;
                int i111 = ((i110 ^ 78) + ((i110 & 78) << 1)) - 1;
                a = i111 % 128;
                int i112 = i111 % 2;
            }
        }
        this.i.fillTehsilList(this.h, this.g);
        int i20 = a;
        int i21 = i20 & 95;
        int i22 = -(-((i20 ^ 95) | i21));
        int i23 = (i21 & i22) + (i22 | i21);
        b = i23 % 128;
        if (i23 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.os.AsyncTask
    public Void doInBackground(Void[] voidArr) {
        AppDatabase appDatabaseL;
        ArrayList<tehsil> arrayList;
        tehsil tehsilVar;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 5;
        int i4 = ((i2 & 5) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 & i5) + (i4 | i5);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            appDatabaseL = AppDatabase.l(this.c.getApplicationContext());
            int i7 = 16 / 0;
        } else {
            appDatabaseL = AppDatabase.l(this.c.getApplicationContext());
        }
        int i8 = b;
        int i9 = (i8 & (-4)) | ((~i8) & 3);
        int i10 = -(-((i8 & 3) << 1));
        int i11 = (i9 & i10) + (i10 | i9);
        a = i11 % 128;
        Object obj = null;
        if (i11 % 2 == 0) {
            appDatabaseL.m().ai(this.d).size();
            obj.hashCode();
            throw null;
        }
        List listAi = appDatabaseL.m().ai(this.d);
        if (listAi.size() > 0) {
            String str = this.e;
            if (str != null) {
                int i12 = a;
                int i13 = i12 & 59;
                int i14 = (((i12 ^ 59) | i13) << 1) - ((i12 | 59) & (~i13));
                b = i14 % 128;
                if (i14 % 2 == 0 ? str.length() > 0 : str.length() > 0) {
                    ArrayList<tehsil> arrayList2 = this.h;
                    tehsil tehsilVar2 = new tehsil("0", 0, this.d, this.e);
                    int i15 = b;
                    int i16 = i15 & 49;
                    int i17 = (i16 - (~((i15 ^ 49) | i16))) - 1;
                    a = i17 % 128;
                    if (i17 % 2 == 0) {
                        arrayList2.add(tehsilVar2);
                        throw null;
                    }
                    arrayList2.add(tehsilVar2);
                    this.g.add(this.e);
                    int i18 = a + 61;
                    b = i18 % 128;
                    int i19 = i18 % 2;
                }
            }
            int i20 = 0;
            while (i20 < listAi.size()) {
                int i21 = a;
                int i22 = i21 & 3;
                int i23 = (i21 | 3) & (~i22);
                int i24 = -(-(i22 << 1));
                int i25 = ((i23 | i24) << 1) - (i23 ^ i24);
                b = i25 % 128;
                if (i25 % 2 != 0) {
                    arrayList = this.h;
                    tehsilVar = (tehsil) listAi.get(i20);
                    int i26 = 26 / 0;
                } else {
                    arrayList = this.h;
                    tehsilVar = (tehsil) listAi.get(i20);
                }
                int i27 = b;
                int i28 = ((i27 ^ 75) | (i27 & 75)) << 1;
                int i29 = -(((~i27) & 75) | (i27 & (-76)));
                int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
                a = i30 % 128;
                int i31 = i30 % 2;
                String str2 = tehsilVar.id;
                tehsil tehsilVar3 = (tehsil) listAi.get(i20);
                int i32 = (-2) - ((a + 116) ^ (-1));
                b = i32 % 128;
                int i33 = i32 % 2;
                tehsil tehsilVar4 = new tehsil(str2, tehsilVar3.tehsilcode, ((tehsil) listAi.get(i20)).distcode, ((tehsil) listAi.get(i20)).tehsil);
                int i34 = a;
                int i35 = i34 & 41;
                int i36 = (i34 | 41) & (~i35);
                int i37 = i35 << 1;
                int i38 = ((i36 | i37) << 1) - (i36 ^ i37);
                b = i38 % 128;
                int i39 = i38 % 2;
                arrayList.add(tehsilVar4);
                ArrayList<String> arrayList3 = this.g;
                int i40 = b;
                int i41 = i40 & 113;
                int i42 = (i40 | 113) & (~i41);
                int i43 = i41 << 1;
                int i44 = (i42 ^ i43) + ((i42 & i43) << 1);
                a = i44 % 128;
                int i45 = i44 % 2;
                arrayList3.add(((tehsil) listAi.get(i20)).tehsil);
                int i46 = b + 93;
                int i47 = i46 % 128;
                a = i47;
                int i48 = i46 % 2;
                int i49 = i20 & 1;
                i20 = ((i20 | 1) & (~i49)) + (i49 << 1);
                int i50 = (i47 | 9) << 1;
                int i51 = -(i47 ^ 9);
                int i52 = (i50 ^ i51) + ((i50 & i51) << 1);
                b = i52 % 128;
                int i53 = i52 % 2;
            }
        }
        int i54 = b;
        int i55 = (i54 & (-84)) | ((~i54) & 83);
        int i56 = (i54 & 83) << 1;
        int i57 = ((i55 | i56) << 1) - (i56 ^ i55);
        a = i57 % 128;
        if (i57 % 2 == 0) {
            int i58 = 95 / 0;
        }
        return null;
    }
}
