package ivas.gov.bisp.enumeration.p044bq;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import ivas.gov.bisp.enumeration.bq.ag.bwE;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.TabletLogEntity;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.p024ax.I;
import ivas.gov.bisp.enumeration.p036bi.RunnableC0148a;
import ivas.gov.bisp.enumeration.p042bo.j;
import ivas.gov.bisp.enumeration.p096p.h;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class ah implements I {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ List e;
    public final /* synthetic */ JSONObject f;
    public final /* synthetic */ ag g;

    public ah(ag agVar, int i, int i2, List list, JSONObject jSONObject) {
        this.g = agVar;
        this.c = i;
        this.d = i2;
        int i3 = a;
        int i4 = i3 ^ 17;
        int i5 = ((((i3 & 17) | i4) << 1) - (~(-i4))) - 1;
        b = i5 % 128;
        int i6 = i5 % 2;
        this.e = list;
        this.f = jSONObject;
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onSuccess(JSONObject jSONObject) {
        Context applicationContext;
        List<TabletLogEntity> list;
        JSONObject jSONObject2;
        int i = 2 % 2;
        Handler handler = new Handler(Looper.getMainLooper());
        RunnableC0148a runnableC0148a = new RunnableC0148a(this, jSONObject, 4);
        int i2 = b;
        int i3 = (-2) - (((i2 ^ 58) + ((i2 & 58) << 1)) ^ (-1));
        a = i3 % 128;
        if (i3 % 2 != 0) {
            handler.post(runnableC0148a);
            applicationContext = this.g.m.getApplicationContext();
            int i4 = 64 / 0;
        } else {
            handler.post(runnableC0148a);
            applicationContext = this.g.m.getApplicationContext();
        }
        h hVarM = AppDatabase.l(applicationContext).m();
        int i5 = this.c;
        int i6 = a;
        int i7 = ((i6 ^ 39) | (i6 & 39)) << 1;
        int i8 = -(((~i6) & 39) | (i6 & (-40)));
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        b = i9 % 128;
        int i10 = i9 % 2;
        hVarM.N(i5);
        ag agVar = this.g;
        int i11 = this.d;
        int i12 = b;
        int i13 = i12 & 13;
        int i14 = -(-((i12 ^ 13) | i13));
        int i15 = (i13 & i14) + (i13 | i14);
        a = i15 % 128;
        if (i15 % 2 != 0) {
            list = this.e;
            jSONObject2 = this.f;
            int i16 = 6 / 0;
        } else {
            list = this.e;
            jSONObject2 = this.f;
        }
        int i17 = i12 & 85;
        int i18 = (i17 - (~(-(-((i12 ^ 85) | i17))))) - 1;
        a = i18 % 128;
        int i19 = i18 % 2;
        int i20 = i11 & 1;
        int i21 = (i11 ^ 1) | i20;
        agVar.i(((i20 | i21) << 1) - (i21 ^ i20), list, jSONObject2);
        int i22 = a + 116;
        int i23 = (i22 ^ (-1)) + (i22 << 1);
        b = i23 % 128;
        int i24 = i23 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onError(ResponseMessage responseMessage) {
        int i = 2 % 2;
        Handler handler = new Handler(Looper.getMainLooper());
        j jVar = new j(this, responseMessage, 5);
        int i2 = a;
        int i3 = i2 & 125;
        int i4 = (i3 - (~((i2 ^ 125) | i3))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        handler.post(jVar);
        ProgressDialog progressDialog = this.g.h;
        if (progressDialog != null) {
            int i6 = a;
            int i7 = i6 ^ 1;
            int i8 = (i6 & 1) << 1;
            int i9 = (i7 & i8) + (i8 | i7);
            b = i9 % 128;
            int i10 = i9 % 2;
            if (progressDialog.isShowing()) {
                int i11 = a;
                int i12 = (i11 ^ 89) + ((i11 & 89) << 1);
                b = i12 % 128;
                int i13 = i12 % 2;
                this.g.h.dismiss();
                int i14 = a;
                int i15 = ((i14 & 52) + (i14 | 52)) - 1;
                b = i15 % 128;
                int i16 = i15 % 2;
            }
        }
        ag.bwE bwe = this.g.new bwE(this.f.toString());
        int i17 = b;
        int i18 = (((i17 & (-24)) | ((~i17) & 23)) - (~(-(-((i17 & 23) << 1))))) - 1;
        a = i18 % 128;
        int i19 = i18 % 2;
        bwe.execute(new Void[0]);
        h hVar = this.g.k;
        int i20 = a;
        int i21 = ((i20 | 97) << 1) - (i20 ^ 97);
        b = i21 % 128;
        int i22 = i21 % 2;
        hVar.aJ(true, "Tablet Log failed to sync. Survey saved locally.");
        if (responseMessage.isLogout()) {
            ag agVar = this.g;
            w wVar = new w(agVar.m, agVar.A);
            int i23 = b;
            int i24 = i23 & 89;
            int i25 = (i23 | 89) & (~i24);
            int i26 = -(-(i24 << 1));
            int i27 = (i25 & i26) + (i25 | i26);
            a = i27 % 128;
            if (i27 % 2 != 0) {
                wVar.execute(new Void[1]);
            } else {
                wVar.execute(new Void[0]);
            }
            int i28 = b + 16;
            int i29 = (i28 ^ (-1)) + (i28 << 1);
            a = i29 % 128;
            int i30 = i29 % 2;
        }
        int i31 = b;
        int i32 = ((i31 ^ 113) | (i31 & 113)) << 1;
        int i33 = -(((~i31) & 113) | (i31 & (-114)));
        int i34 = ((i32 | i33) << 1) - (i33 ^ i32);
        a = i34 % 128;
        int i35 = i34 % 2;
    }
}
