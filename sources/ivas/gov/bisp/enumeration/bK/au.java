package ivas.gov.bisp.enumeration.bK;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.W.J;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.question_options;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class au extends AsyncTask<Void, Void, Void> {
    private static int a = 1;
    private static int b;
    public Context c;
    public String d;
    public String e;
    public Spinner f;
    public J g;
    public ArrayList<Item> h = new ArrayList<>();

    public au(Context context, String str, String str2, Spinner spinner, J j) {
        this.c = context;
        this.d = str;
        this.e = str2;
        this.f = spinner;
        this.g = j;
    }

    @Override // android.os.AsyncTask
    public Void doInBackground(Void[] voidArr) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 119) + ((i2 & 119) << 1);
        b = i3 % 128;
        if (i3 % 2 != 0) {
            AppDatabase.l(this.c);
            throw null;
        }
        ArrayList arrayList = new ArrayList(AppDatabase.l(this.c).m().ah(this.d));
        int i4 = b;
        int i5 = i4 & 109;
        int i6 = (i5 - (~((i4 ^ 109) | i5))) - 1;
        a = i6 % 128;
        if (i6 % 2 == 0) {
            arrayList.size();
            throw null;
        }
        if (arrayList.size() > 0) {
            String str = this.e;
            int i7 = 0;
            if (str != null) {
                int i8 = a;
                int i9 = ((((i8 ^ 27) | (i8 & 27)) << 1) - (~(-(((~i8) & 27) | (i8 & (-28)))))) - 1;
                b = i9 % 128;
                int i10 = i9 % 2;
                if (str.length() > 0) {
                    ArrayList<Item> arrayList2 = this.h;
                    Item item = new Item(0, this.e, this.d);
                    int i11 = b + 15;
                    a = i11 % 128;
                    if (i11 % 2 == 0) {
                        arrayList2.add(item);
                        i7 = 1;
                    } else {
                        arrayList2.add(item);
                    }
                }
            }
            while (i7 < arrayList.size()) {
                int i12 = b;
                int i13 = (((i12 | 44) << 1) - (i12 ^ 44)) - 1;
                a = i13 % 128;
                int i14 = i13 % 2;
                ArrayList<Item> arrayList3 = this.h;
                question_options question_optionsVar = (question_options) arrayList.get(i7);
                int i15 = a;
                int i16 = i15 & 53;
                int i17 = -(-((i15 ^ 53) | i16));
                int i18 = (i16 & i17) + (i17 | i16);
                b = i18 % 128;
                int i19 = i18 % 2;
                Item item2 = new Item(question_optionsVar.option_id, ((question_options) arrayList.get(i7)).option, ((question_options) arrayList.get(i7)).question);
                int i20 = a;
                int i21 = (i20 & (-90)) | ((~i20) & 89);
                int i22 = -(-((i20 & 89) << 1));
                int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
                b = i23 % 128;
                if (i23 % 2 != 0) {
                    arrayList3.add(item2);
                    int i24 = i7 & 95;
                    int i25 = i24 + ((i7 ^ 95) | i24);
                    i7 = ((i25 | (-84)) << 1) - (((~i25) & (-84)) | (i25 & 83));
                } else {
                    arrayList3.add(item2);
                    int i26 = (i7 & (-17)) | ((~i7) & 16);
                    int i27 = -(-((i7 & 16) << 1));
                    int i28 = (i26 & i27) + (i26 | i27);
                    int i29 = i28 & (-15);
                    i7 = i29 + ((i28 ^ (-15)) | i29);
                }
            }
        }
        int i30 = a;
        int i31 = i30 & 59;
        int i32 = ((((i30 ^ 59) | i31) << 1) - (~(-((i30 | 59) & (~i31))))) - 1;
        b = i32 % 128;
        int i33 = i32 % 2;
        return null;
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(Void r6) {
        Spinner spinner;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 & (-32)) | ((~i2) & 31)) - (~(-(-((i2 & 31) << 1))))) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        super.onPostExecute(r6);
        if (this.f != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(this.c, R.layout.spinner_item, this.h);
            int i5 = b;
            int i6 = ((i5 & (-90)) | ((~i5) & 89)) + ((i5 & 89) << 1);
            a = i6 % 128;
            if (i6 % 2 == 0) {
                this.f.setAdapter((SpinnerAdapter) arrayAdapter);
                spinner = this.f;
                int i7 = 45 / 0;
            } else {
                this.f.setAdapter((SpinnerAdapter) arrayAdapter);
                spinner = this.f;
            }
            spinner.setOnItemSelectedListener(new aq(this));
            int i8 = b;
            int i9 = (i8 & (-100)) | ((~i8) & 99);
            int i10 = (i8 & 99) << 1;
            int i11 = (i9 & i10) + (i10 | i9);
            a = i11 % 128;
            int i12 = i11 % 2;
        }
        this.g.fillList(this.h);
        int i13 = b;
        int i14 = i13 | 117;
        int i15 = (i14 << 1) - ((~(i13 & 117)) & i14);
        a = i15 % 128;
        int i16 = i15 % 2;
    }

    public au(Context context, String str, String str2, J j) {
        this.c = context;
        this.d = str;
        this.e = str2;
        this.g = j;
    }

    public au(Context context, String str, String str2, Spinner spinner, String str3, J j) {
        this.c = context;
        this.d = str;
        this.e = str2;
        this.f = spinner;
        this.g = j;
    }
}
