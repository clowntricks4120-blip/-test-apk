package ivas.gov.bisp.enumeration.bK;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.W.M;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.province;
import ivas.gov.bisp.enumeration.p096p.h;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class av extends AsyncTask<Void, Void, Void> {
    private static int a = 0;
    private static int b = 1;
    public Context c;
    public String d;
    public Spinner e;
    public M g;
    public ArrayList<province> f = new ArrayList<>();
    public ArrayList<String> h = new ArrayList<>();

    public av(Context context, String str, Spinner spinner, M m) {
        this.c = context;
        this.d = str;
        this.e = spinner;
        this.g = m;
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(Void r5) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 83) | (i2 & 83)) << 1;
        int i4 = -(((~i2) & 83) | (i2 & (-84)));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        super.onPostExecute(r5);
        if (this.e != null) {
            this.e.setAdapter((SpinnerAdapter) new ArrayAdapter(this.c, R.layout.spinner_item, this.h));
            Spinner spinner = this.e;
            C0128g c0128g = new C0128g(this);
            int i7 = a + 89;
            b = i7 % 128;
            int i8 = i7 % 2;
            spinner.setOnItemSelectedListener(c0128g);
            int i9 = b + 89;
            a = i9 % 128;
            int i10 = i9 % 2;
        }
        this.g.fillProvList(this.f, this.h);
        int i11 = b;
        int i12 = i11 ^ 95;
        int i13 = ((i11 & 95) | i12) << 1;
        int i14 = -i12;
        int i15 = (i13 & i14) + (i13 | i14);
        a = i15 % 128;
        int i16 = i15 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0070  */
    /* JADX WARN: Code duplicated, block: B:18:0x00a9  */
    @Override // android.os.AsyncTask
    public Void doInBackground(Void[] voidArr) {
        int i = 2 % 2;
        int i2 = a + 119;
        b = i2 % 128;
        int i3 = i2 % 2;
        h hVarM = AppDatabase.l(this.c.getApplicationContext()).m();
        int i4 = b;
        int i5 = ((i4 & (-38)) | ((~i4) & 37)) + ((i4 & 37) << 1);
        a = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            hVarM.Z().size();
            obj.hashCode();
            throw null;
        }
        List listZ = hVarM.Z();
        if (listZ.size() > 0) {
            int i6 = b;
            int i7 = i6 & 47;
            int i8 = (((i6 ^ 47) | i7) << 1) - ((~i7) & (i6 | 47));
            a = i8 % 128;
            int i9 = i8 % 2;
            String str = this.d;
            int i10 = 0;
            if (str != null) {
                int i11 = i6 & 91;
                int i12 = i11 + ((i6 ^ 91) | i11);
                a = i12 % 128;
                if (i12 % 2 != 0) {
                    if (str.length() > 0) {
                        ArrayList<province> arrayList = this.f;
                        province provinceVar = new province("0", 0, this.d);
                        int i13 = a;
                        int i14 = ((i13 ^ 31) - (~(-(-((i13 & 31) << 1))))) - 1;
                        b = i14 % 128;
                        int i15 = i14 % 2;
                        arrayList.add(provinceVar);
                        this.h.add(this.d);
                        int i16 = a;
                        int i17 = i16 ^ 123;
                        int i18 = (i16 & 123) << 1;
                        int i19 = ((i17 | i18) << 1) - (i17 ^ i18);
                        b = i19 % 128;
                        i10 = i19 % 2 == 0 ? 1 : 0;
                        int i20 = (i16 ^ 17) + ((i16 & 17) << 1);
                        b = i20 % 128;
                        int i21 = i20 % 2;
                    } else {
                        i10 = 1;
                    }
                } else if (str.length() > 0) {
                    ArrayList<province> arrayList2 = this.f;
                    province provinceVar2 = new province("0", 0, this.d);
                    int i110 = a;
                    int i111 = ((i110 ^ 31) - (~(-(-((i110 & 31) << 1))))) - 1;
                    b = i111 % 128;
                    int i112 = i111 % 2;
                    arrayList2.add(provinceVar2);
                    this.h.add(this.d);
                    int i113 = a;
                    int i114 = i113 ^ 123;
                    int i115 = (i113 & 123) << 1;
                    int i116 = ((i114 | i115) << 1) - (i114 ^ i115);
                    b = i116 % 128;
                    if (i116 % 2 == 0) {
                    }
                    int i22 = (i113 ^ 17) + ((i113 & 17) << 1);
                    b = i22 % 128;
                    int i23 = i22 % 2;
                }
            }
            while (i10 < listZ.size()) {
                int i24 = b;
                int i25 = (i24 & (-18)) | ((~i24) & 17);
                int i26 = (i24 & 17) << 1;
                int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
                a = i27 % 128;
                int i28 = i27 % 2;
                ArrayList<province> arrayList3 = this.f;
                Object obj2 = listZ.get(i10);
                int i29 = b;
                int i30 = i29 ^ 7;
                int i31 = (i29 & 7) << 1;
                int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
                a = i32 % 128;
                int i33 = i32 % 2;
                province provinceVar3 = new province(((province) obj2).id, ((province) listZ.get(i10)).province_id, ((province) listZ.get(i10)).province_name);
                int i34 = a + 11;
                b = i34 % 128;
                int i35 = i34 % 2;
                arrayList3.add(provinceVar3);
                ArrayList<String> arrayList4 = this.h;
                int i36 = a;
                int i37 = (i36 & 23) + (i36 | 23);
                b = i37 % 128;
                int i38 = i37 % 2;
                String str2 = ((province) listZ.get(i10)).province_name;
                int i39 = a;
                int i40 = i39 & 43;
                int i41 = (i39 | 43) & (~i40);
                int i42 = -(-(i40 << 1));
                int i43 = (i41 & i42) + (i41 | i42);
                b = i43 % 128;
                int i44 = i43 % 2;
                arrayList4.add(str2);
                int i45 = i10 & 1;
                i10 = ((~i45) & (i10 | 1)) + (i45 << 1);
                int i46 = b;
                int i47 = ((i46 & 118) + (i46 | 118)) - 1;
                a = i47 % 128;
                int i48 = i47 % 2;
            }
        }
        int i49 = b;
        int i50 = (((i49 | 88) << 1) - (i49 ^ 88)) - 1;
        a = i50 % 128;
        int i51 = i50 % 2;
        return null;
    }
}
