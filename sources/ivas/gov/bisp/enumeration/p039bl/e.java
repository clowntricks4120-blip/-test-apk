package ivas.gov.bisp.enumeration.p039bl;

import ivas.gov.bisp.enumeration.activity.authentication.Authentication;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class e implements Runnable {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ List c;
    public final /* synthetic */ Authentication d;

    public e(Authentication authentication, List list) {
        this.d = authentication;
        this.c = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 95) + (i2 | 95);
        a = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            AppDatabase.l(this.d.getApplicationContext()).m();
            throw null;
        }
        AppDatabase.l(this.d.getApplicationContext()).m().aw(this.c);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        int i4 = a;
        int i5 = i4 & 63;
        int i6 = (i4 | 63) & (~i5);
        int i7 = i5 << 1;
        int i8 = ((i6 | i7) << 1) - (i6 ^ i7);
        b = i8 % 128;
        int i9 = i8 % 2;
        calendar.add(5, 15);
        String str = simpleDateFormat.format(calendar.getTime());
        int i10 = b;
        int i11 = (i10 | 125) << 1;
        int i12 = -(i10 ^ 125);
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        a = i13 % 128;
        int i14 = i13 % 2;
        Authentication authentication = this.d;
        int i15 = Authentication.ac;
        SessionManager sessionManager = authentication.T;
        int i16 = b;
        int i17 = ((i16 & 25) - (~(i16 | 25))) - 1;
        a = i17 % 128;
        if (i17 % 2 == 0) {
            sessionManager.B(str);
        } else {
            sessionManager.B(str);
            obj.hashCode();
            throw null;
        }
    }
}
