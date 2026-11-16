package ivas.gov.bisp.enumeration.bK;

import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.W.O;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.vilages;
import ivas.gov.bisp.enumeration.p096p.h;
import java.util.ArrayList;
import java.util.List;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class aA implements Runnable {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ aD c;

    public aA(aD aDVar) {
        this.c = aDVar;
    }

    public class bxf implements Runnable {
        private static int a = 0;
        private static int b = 1;

        public class bxg implements AdapterView.OnItemSelectedListener {
            private static int a = 1;
            private static int b;

            public bxg() {
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                int i2 = 2 % 2;
                int i3 = a + 37;
                b = i3 % 128;
                if (i3 % 2 != 0) {
                    throw null;
                }
                if (i != 0) {
                    Spinner spinner = aA.this.c.e;
                    int i4 = b + 117;
                    a = i4 % 128;
                    int i5 = i4 % 2;
                    spinner.setBackgroundResource(R.drawable.spinner_bg_selected);
                    int i6 = b;
                    int i7 = i6 & 87;
                    int i8 = ((i6 ^ 87) | i7) << 1;
                    int i9 = -((i6 | 87) & (~i7));
                    int i10 = (i8 & i9) + (i9 | i8);
                    a = i10 % 128;
                    int i11 = i10 % 2;
                    return;
                }
                Spinner spinner2 = aA.this.c.e;
                int i12 = b;
                int i13 = (((i12 ^ 111) | (i12 & 111)) << 1) - (((~i12) & 111) | (i12 & (-112)));
                a = i13 % 128;
                int i14 = i13 % 2;
                spinner2.setBackgroundResource(R.drawable.spinner_bg);
                int i15 = a;
                int i16 = i15 & 111;
                int i17 = -(-(i15 | 111));
                int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
                b = i18 % 128;
                if (i18 % 2 != 0) {
                    int i19 = 39 / 0;
                }
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView<?> adapterView) {
                int i = 2 % 2;
                int i2 = b;
                int i3 = i2 | 119;
                int i4 = i3 << 1;
                int i5 = -((~(i2 & 119)) & i3);
                int i6 = (i4 & i5) + (i5 | i4);
                a = i6 % 128;
                int i7 = i6 % 2;
            }
        }

        public bxf() {
        }

        /* JADX WARN: Code duplicated, block: B:8:0x002b  */
        @Override // java.lang.Runnable
        public void run() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 51;
            int i4 = (i2 | 51) & (~i3);
            int i5 = -(-(i3 << 1));
            int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
            b = i6 % 128;
            int i7 = i6 % 2;
            Spinner spinner = aA.this.c.e;
            if (i7 == 0) {
                int i8 = 53 / 0;
                if (spinner != null) {
                    aD aDVar = aA.this.c;
                    ArrayAdapter arrayAdapter = new ArrayAdapter(aDVar.b, R.layout.spinner_item, aDVar.f);
                    int i9 = b;
                    int i10 = ((i9 ^ 26) + ((i9 & 26) << 1)) - 1;
                    a = i10 % 128;
                    int i11 = i10 % 2;
                    aA.this.c.e.setAdapter((SpinnerAdapter) arrayAdapter);
                    Spinner spinner2 = aA.this.c.e;
                    bxg bxgVar = new bxg();
                    int i12 = a;
                    int i13 = i12 & 61;
                    int i14 = i13 + ((i12 ^ 61) | i13);
                    b = i14 % 128;
                    int i15 = i14 % 2;
                    spinner2.setOnItemSelectedListener(bxgVar);
                    int i16 = b;
                    int i17 = ((i16 | 23) << 1) - (i16 ^ 23);
                    a = i17 % 128;
                    int i18 = i17 % 2;
                }
            } else if (spinner != null) {
                aD aDVar2 = aA.this.c;
                ArrayAdapter arrayAdapter2 = new ArrayAdapter(aDVar2.b, R.layout.spinner_item, aDVar2.f);
                int i19 = b;
                int i110 = ((i19 ^ 26) + ((i19 & 26) << 1)) - 1;
                a = i110 % 128;
                int i111 = i110 % 2;
                aA.this.c.e.setAdapter((SpinnerAdapter) arrayAdapter2);
                Spinner spinner3 = aA.this.c.e;
                bxg bxgVar2 = new bxg();
                int i112 = a;
                int i113 = i112 & 61;
                int i114 = i113 + ((i112 ^ 61) | i113);
                b = i114 % 128;
                int i115 = i114 % 2;
                spinner3.setOnItemSelectedListener(bxgVar2);
                int i116 = b;
                int i117 = ((i116 | 23) << 1) - (i116 ^ 23);
                a = i117 % 128;
                int i118 = i117 % 2;
            }
            aD aDVar3 = aA.this.c;
            O o2 = aDVar3.h;
            ArrayList<vilages> arrayList = aDVar3.g;
            int i20 = b;
            int i21 = i20 ^ 61;
            int i22 = (((i20 & 61) | i21) << 1) - i21;
            a = i22 % 128;
            if (i22 % 2 == 0) {
                o2.fillVilagesList(arrayList, aDVar3.f);
            } else {
                o2.fillVilagesList(arrayList, aDVar3.f);
                throw null;
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int i;
        vilages vilagesVar;
        String strValueOf;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 | 71) << 1) - (i3 ^ 71);
        a = i4 % 128;
        int i5 = i4 % 2;
        AppDatabase appDatabaseL = AppDatabase.l(this.c.b.getApplicationContext());
        int i6 = a;
        int i7 = i6 & 125;
        int i8 = (i7 - (~((i6 ^ 125) | i7))) - 1;
        b = i8 % 128;
        int i9 = i8 % 2;
        appDatabaseL.m().aq();
        h hVarM = appDatabaseL.m();
        int i10 = b;
        int i11 = i10 & 87;
        int i12 = ((i10 | 87) & (~i11)) + (i11 << 1);
        a = i12 % 128;
        Object obj = null;
        if (i12 % 2 == 0) {
            hVarM.ak(this.c.c).size();
            obj.hashCode();
            throw null;
        }
        List listAk = hVarM.ak(this.c.c);
        if (listAk.size() > 0) {
            String str = this.c.d;
            if (str != null) {
                int i13 = a;
                int i14 = i13 & 31;
                int i15 = i14 + ((i13 ^ 31) | i14);
                b = i15 % 128;
                int i16 = i15 % 2;
                if (str.length() > 0) {
                    aD aDVar = this.c;
                    ArrayList<vilages> arrayList = aDVar.g;
                    vilages vilagesVar2 = new vilages(0, 0L, BuildConfig.FLAVOR, aDVar.d);
                    int i17 = b;
                    int i18 = ((i17 | 7) << 1) - (i17 ^ 7);
                    a = i18 % 128;
                    if (i18 % 2 == 0) {
                        arrayList.add(vilagesVar2);
                        ArrayList<String> arrayList2 = this.c.f;
                        throw null;
                    }
                    arrayList.add(vilagesVar2);
                    aD aDVar2 = this.c;
                    ArrayList<String> arrayList3 = aDVar2.f;
                    int i19 = b + 59;
                    a = i19 % 128;
                    int i20 = i19 % 2;
                    arrayList3.add(aDVar2.d);
                    int i21 = a + 31;
                    b = i21 % 128;
                    int i22 = i21 % 2;
                }
            }
            int i23 = a;
            int i24 = i23 & 119;
            int i25 = -(-(i23 | 119));
            int i26 = (i24 & i25) + (i25 | i24);
            b = i26 % 128;
            int i27 = i26 % 2;
            int i28 = 0;
            while (i28 < listAk.size()) {
                int i29 = b;
                int i30 = (i29 ^ 42) + ((i29 & 42) << 1);
                int i31 = (i30 ^ (-1)) + (i30 << 1);
                a = i31 % 128;
                int i32 = i31 % 2;
                ArrayList<vilages> arrayList4 = this.c.g;
                Object obj2 = listAk.get(i28);
                int i33 = a;
                int i34 = i33 & 59;
                int i35 = -(-((i33 ^ 59) | i34));
                int i36 = (i34 & i35) + (i35 | i34);
                b = i36 % 128;
                if (i36 % 2 != 0) {
                    i = ((vilages) obj2).uccode;
                    vilagesVar = (vilages) listAk.get(i28);
                    int i37 = 81 / 0;
                } else {
                    i = ((vilages) obj2).uccode;
                    vilagesVar = (vilages) listAk.get(i28);
                }
                vilages vilagesVar3 = new vilages(i, vilagesVar.localitycode, ((vilages) listAk.get(i28)).locality, ((vilages) listAk.get(i28)).localitytype);
                int i38 = a;
                int i39 = (i38 ^ 4) + ((i38 & 4) << 1);
                int i40 = (i39 ^ (-1)) + (i39 << 1);
                b = i40 % 128;
                int i41 = i40 % 2;
                arrayList4.add(vilagesVar3);
                ArrayList<String> arrayList5 = this.c.f;
                int i42 = b;
                int i43 = (i42 ^ 18) + ((i42 & 18) << 1);
                int i44 = (i43 ^ (-1)) + (i43 << 1);
                a = i44 % 128;
                if (i44 % 2 == 0) {
                    strValueOf = String.valueOf(((vilages) listAk.get(i28)).locality);
                    int i45 = 79 / 0;
                } else {
                    strValueOf = String.valueOf(((vilages) listAk.get(i28)).locality);
                }
                int i46 = b;
                int i47 = i46 & 33;
                int i48 = (i46 | 33) & (~i47);
                int i49 = -(-(i47 << 1));
                int i50 = ((i48 | i49) << 1) - (i48 ^ i49);
                a = i50 % 128;
                int i51 = i50 % 2;
                arrayList5.add(strValueOf);
                int i52 = i28 + 51;
                i28 = (i52 | (-50)) + (i52 & (-50));
                int i53 = a;
                int i54 = i53 & 81;
                int i55 = i54 + ((i53 ^ 81) | i54);
                b = i55 % 128;
                int i56 = i55 % 2;
            }
        }
        Handler handler = this.c.a;
        bxf bxfVar = new bxf();
        int i57 = b;
        int i58 = i57 & 17;
        int i59 = (((i57 ^ 17) | i58) << 1) - ((i57 | 17) & (~i58));
        a = i59 % 128;
        if (i59 % 2 != 0) {
            handler.post(bxfVar);
        } else {
            handler.post(bxfVar);
            obj.hashCode();
            throw null;
        }
    }
}
