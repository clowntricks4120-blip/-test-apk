package ivas.gov.bisp.enumeration.activity.authentication;

import ivas.gov.bisp.enumeration.activity.authentication.Authentication.OooOOO;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class b implements Runnable {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ List c;
    public final /* synthetic */ Authentication d;

    public b(Authentication authentication, List list) {
        this.d = authentication;
        this.c = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 71;
        int i4 = (i2 ^ 71) | i3;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        AppDatabase.l(this.d.getApplicationContext()).m().ay(this.c);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        int i7 = a;
        int i8 = (i7 & 63) + (i7 | 63);
        b = i8 % 128;
        int i9 = i8 % 2;
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, 15);
        int i10 = a + 53;
        b = i10 % 128;
        int i11 = i10 % 2;
        String str = simpleDateFormat.format(calendar.getTime());
        Authentication authentication = this.d;
        int i12 = b + 77;
        a = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = Authentication.ac;
            authentication.T.B(str);
            throw null;
        }
        int i14 = Authentication.ac;
        authentication.T.B(str);
        Authentication.OooOOO oooOOO = this.d.new OooOOO();
        int i15 = a;
        int i16 = i15 & 121;
        int i17 = -(-((i15 ^ 121) | i16));
        int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
        b = i18 % 128;
        int i19 = i18 % 2;
        oooOOO.execute(new Void[0]);
        int i20 = b;
        int i21 = ((i20 | 85) << 1) - (i20 ^ 85);
        a = i21 % 128;
        int i22 = i21 % 2;
    }
}
