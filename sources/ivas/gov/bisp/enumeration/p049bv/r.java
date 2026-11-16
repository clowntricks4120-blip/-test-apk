package ivas.gov.bisp.enumeration.p049bv;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import ivas.gov.bisp.enumeration.enumerator.ActivityEnumeratorMain;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.TabletLogEntity;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.p024ax.I;
import ivas.gov.bisp.enumeration.p036bi.RunnableC0148a;
import ivas.gov.bisp.enumeration.p042bo.j;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class r implements I {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ List e;
    public final /* synthetic */ View f;
    public final /* synthetic */ ActivityEnumeratorMain g;

    public r(ActivityEnumeratorMain activityEnumeratorMain, int i, int i2, List list, View view) {
        this.g = activityEnumeratorMain;
        this.c = i;
        this.d = i2;
        int i3 = a;
        int i4 = ((i3 | 83) << 1) - (i3 ^ 83);
        b = i4 % 128;
        int i5 = i4 % 2;
        this.e = list;
        this.f = view;
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onError(ResponseMessage responseMessage) {
        int i = 2 % 2;
        Handler handler = new Handler(Looper.getMainLooper());
        RunnableC0148a runnableC0148a = new RunnableC0148a(this, responseMessage, 3);
        int i2 = a;
        int i3 = i2 & 91;
        int i4 = (((i2 | 91) & (~i3)) - (~(i3 << 1))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        handler.post(runnableC0148a);
        ActivityEnumeratorMain activityEnumeratorMain = this.g;
        int i6 = this.d;
        int i7 = a;
        int i8 = (((i7 | 77) << 1) - (~(-(((~i7) & 77) | (i7 & (-78)))))) - 1;
        b = i8 % 128;
        if (i8 % 2 != 0) {
            ActivityEnumeratorMain activityEnumeratorMain2 = ActivityEnumeratorMain.ac;
            throw null;
        }
        List<TabletLogEntity> list = this.e;
        View view = this.f;
        ActivityEnumeratorMain activityEnumeratorMain3 = ActivityEnumeratorMain.ac;
        int i9 = a;
        int i10 = (i9 & (-76)) | ((~i9) & 75);
        int i11 = (i9 & 75) << 1;
        int i12 = (i10 & i11) + (i11 | i10);
        b = i12 % 128;
        if (i12 % 2 != 0) {
            activityEnumeratorMain.C(i6, list, view);
        } else {
            activityEnumeratorMain.C((-2) - (((i6 & 2) + (i6 | 2)) ^ (-1)), list, view);
        }
        int i13 = a;
        int i14 = i13 & 65;
        int i15 = -(-((i13 ^ 65) | i14));
        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
        b = i16 % 128;
        int i17 = i16 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onSuccess(JSONObject jSONObject) {
        ActivityEnumeratorMain activityEnumeratorMain;
        int i;
        List<TabletLogEntity> list;
        int i2 = 2 % 2;
        Handler handler = new Handler(Looper.getMainLooper());
        j jVar = new j(this, jSONObject, 3);
        int i3 = b;
        int i4 = i3 & 25;
        int i5 = (i3 ^ 25) | i4;
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        handler.post(jVar);
        AppDatabase appDatabaseL = AppDatabase.l(this.g.getApplicationContext());
        int i8 = b;
        int i9 = i8 & 1;
        int i10 = (i8 | 1) & (~i9);
        int i11 = -(-(i9 << 1));
        int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
        a = i12 % 128;
        int i13 = i12 % 2;
        appDatabaseL.m().N(this.c);
        int i14 = b + 43;
        a = i14 % 128;
        if (i14 % 2 == 0) {
            activityEnumeratorMain = this.g;
            i = this.d;
            list = this.e;
            int i15 = 50 / 0;
        } else {
            activityEnumeratorMain = this.g;
            i = this.d;
            list = this.e;
        }
        View view = this.f;
        ActivityEnumeratorMain activityEnumeratorMain2 = ActivityEnumeratorMain.ac;
        int i16 = a;
        int i17 = (i16 & (-12)) | ((~i16) & 11);
        int i18 = (i16 & 11) << 1;
        int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
        b = i19 % 128;
        int i20 = i19 % 2;
        activityEnumeratorMain.C((i & 1) + (i | 1), list, view);
        int i21 = a;
        int i22 = (i21 | 91) << 1;
        int i23 = -(i21 ^ 91);
        int i24 = (i22 & i23) + (i23 | i22);
        b = i24 % 128;
        if (i24 % 2 != 0) {
            int i25 = 41 / 0;
        }
    }
}
