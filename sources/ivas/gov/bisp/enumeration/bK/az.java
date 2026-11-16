package ivas.gov.bisp.enumeration.bK;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.Spinner;
import ivas.gov.bisp.enumeration.W.Q;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.question_options;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class az extends AsyncTask<Void, Void, Void> {
    private static int a = 1;
    private static int b;
    public Context c;
    public String d;
    public String e;
    public ArrayList<String> f = new ArrayList<>();
    public Q g;

    public az(Context context, String str, String str2, Spinner spinner, Q q) {
        this.c = context;
        this.d = str;
        this.e = str2;
        this.g = q;
    }

    @Override // android.os.AsyncTask
    public Void doInBackground(Void[] voidArr) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList(AppDatabase.l(this.c).m().ah(this.d));
        int i2 = a;
        int i3 = i2 & 29;
        int i4 = i2 | 29;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        if (arrayList.size() > 0) {
            int i7 = b;
            int i8 = i7 + 119;
            a = i8 % 128;
            int i9 = i8 % 2;
            String str = this.e;
            if (str != null) {
                int i10 = i7 | 35;
                int i11 = i10 << 1;
                int i12 = -((~(i7 & 35)) & i10);
                int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
                a = i13 % 128;
                int i14 = i13 % 2;
                if (str.length() > 0) {
                    int i15 = a + 11;
                    b = i15 % 128;
                    int i16 = i15 % 2;
                    this.f.add(this.e);
                    int i17 = b;
                    int i18 = ((i17 & (-98)) | ((~i17) & 97)) + ((i17 & 97) << 1);
                    a = i18 % 128;
                    int i19 = i18 % 2;
                }
            }
            int i20 = a + 97;
            b = i20 % 128;
            int i21 = i20 % 2;
            int i22 = 0;
            while (i22 < arrayList.size()) {
                int i23 = b;
                int i24 = (i23 ^ 15) + ((i23 & 15) << 1);
                a = i24 % 128;
                int i25 = i24 % 2;
                this.f.add(((question_options) arrayList.get(i22)).option);
                int i26 = b;
                int i27 = i26 & 103;
                int i28 = i27 + ((i26 ^ 103) | i27);
                int i29 = i28 % 128;
                a = i29;
                int i30 = i28 % 2;
                i22 = (((i22 | 2) << 1) - (i22 ^ 2)) - 1;
                int i31 = i29 + 53;
                b = i31 % 128;
                int i32 = i31 % 2;
            }
        }
        int i33 = a + 99;
        b = i33 % 128;
        Object obj = null;
        if (i33 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(Void r5) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 25;
        int i4 = i2 | 25;
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        super.onPostExecute(r5);
        Q q = this.g;
        int i7 = (-2) - ((b + 58) ^ (-1));
        a = i7 % 128;
        Object obj = null;
        if (i7 % 2 == 0) {
            q.fillList(this.f);
            obj.hashCode();
            throw null;
        }
        q.fillList(this.f);
        int i8 = b + 10;
        int i9 = (i8 ^ (-1)) + (i8 << 1);
        a = i9 % 128;
        if (i9 % 2 == 0) {
            throw null;
        }
    }
}
