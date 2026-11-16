package ivas.gov.bisp.enumeration.p042bo;

import android.content.Context;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import ivas.gov.bisp.enumeration.O.i;
import ivas.gov.bisp.enumeration.activity.nadra.NewFormNadraRoster;
import ivas.gov.bisp.enumeration.activity.nadra.SelectHouseHoldActivity;
import ivas.gov.bisp.enumeration.bX.P;
import ivas.gov.bisp.enumeration.enumerator.ActivityEnumeratorMain;
import ivas.gov.bisp.enumeration.fragments.FragmentRoster;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.BeneficiaryEntity;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.NadraFamilyData;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.p044bq.ah;
import ivas.gov.bisp.enumeration.p044bq.f;
import ivas.gov.bisp.enumeration.p049bv.r;
import ivas.gov.bisp.enumeration.p053bz.N;
import java.util.Objects;
import net.sqlcipher.BuildConfig;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ j(Object obj, Object obj2, int i) {
        this.c = i;
        this.e = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 9;
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        int i6 = this.c;
        Object obj = null;
        if (i6 == 0) {
            NewFormNadraRoster newFormNadraRoster = (NewFormNadraRoster) this.e;
            Object obj2 = this.d;
            int i7 = i4 & 85;
            int i8 = ((((i4 ^ 85) | i7) << 1) - (~(-((i4 | 85) & (~i7))))) - 1;
            b = i8 % 128;
            if (i8 % 2 != 0) {
                newFormNadraRoster.aq.m();
                obj.hashCode();
                throw null;
            }
            newFormNadraRoster.aq.m().bj((NadraFamilyData) obj2);
            int i9 = a;
            int i10 = ((i9 ^ 1) | (i9 & 1)) << 1;
            int i11 = -(((~i9) & 1) | (i9 & (-2)));
            int i12 = (i10 & i11) + (i11 | i10);
            b = i12 % 128;
            if (i12 % 2 != 0) {
                throw null;
            }
            return;
        }
        if (i6 == 1) {
            SelectHouseHoldActivity selectHouseHoldActivity = (SelectHouseHoldActivity) this.e;
            NadraFamilyData nadraFamilyData = (NadraFamilyData) this.d;
            int i13 = i4 + 111;
            b = i13 % 128;
            int i14 = i13 % 2;
            selectHouseHoldActivity.an.m().bj(nadraFamilyData);
            int i15 = a;
            int i16 = (i15 & 115) + (i15 | 115);
            b = i16 % 128;
            int i17 = i16 % 2;
            return;
        }
        if (i6 == 2) {
            ActivityEnumeratorMain activityEnumeratorMain = (ActivityEnumeratorMain) this.e;
            View view = (View) this.d;
            ActivityEnumeratorMain activityEnumeratorMain2 = ActivityEnumeratorMain.ac;
            Objects.requireNonNull(activityEnumeratorMain);
            f fVar = new f(activityEnumeratorMain, view, true, BuildConfig.FLAVOR, BuildConfig.FLAVOR, activityEnumeratorMain);
            int i18 = a;
            int i19 = ((i18 & (-28)) | ((~i18) & 27)) + ((i18 & 27) << 1);
            b = i19 % 128;
            if (i19 % 2 != 0) {
                fVar.execute(new Void[0]);
            } else {
                fVar.execute(new Void[0]);
            }
            int i20 = a;
            int i21 = ((i20 ^ 108) + ((i20 & 108) << 1)) - 1;
            b = i21 % 128;
            if (i21 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        if (i6 == 3) {
            r rVar = (r) this.e;
            JSONObject jSONObject = (JSONObject) this.d;
            int i22 = i2 & 89;
            int i23 = ((i2 | 89) & (~i22)) + (i22 << 1);
            a = i23 % 128;
            (i23 % 2 == 0 ? Toast.makeText(rVar.g, jSONObject.toString(), 1) : Toast.makeText(rVar.g, jSONObject.toString(), 0)).show();
            int i24 = b;
            int i25 = i24 & 83;
            int i26 = (((i24 ^ 83) | i25) << 1) - ((i24 | 83) & (~i25));
            a = i26 % 128;
            int i27 = i26 % 2;
            return;
        }
        if (i6 == 4) {
            FragmentRoster.e((FragmentRoster) this.e, (BeneficiaryEntity) this.d);
            int i28 = b;
            int i29 = i28 & 21;
            int i30 = (((i28 | 21) & (~i29)) - (~(i29 << 1))) - 1;
            a = i30 % 128;
            if (i30 % 2 == 0) {
                int i31 = 97 / 0;
                return;
            }
            return;
        }
        if (i6 == 5) {
            ah ahVar = (ah) this.e;
            Object obj3 = this.d;
            int i32 = i2 + 63;
            a = i32 % 128;
            if (i32 % 2 == 0) {
                AppCompatActivity appCompatActivity = ahVar.g.m;
                obj.hashCode();
                throw null;
            }
            AppCompatActivity appCompatActivity2 = ahVar.g.m;
            StringBuilder sb = new StringBuilder();
            sb.append("Tablet Log Sync Error: ");
            int i33 = a;
            int i34 = i33 & 21;
            int i35 = (i33 ^ 21) | i34;
            int i36 = (i34 & i35) + (i35 | i34);
            b = i36 % 128;
            int i37 = i36 % 2;
            sb.append(((ResponseMessage) obj3).getErrorMessage());
            int i38 = b;
            int i39 = (i38 ^ 61) + ((i38 & 61) << 1);
            a = i39 % 128;
            int i40 = i39 % 2;
            Toast.makeText(appCompatActivity2, sb.toString(), 0).show();
            int i41 = b + 109;
            a = i41 % 128;
            int i42 = i41 % 2;
            return;
        }
        int i43 = i2 & 29;
        int i44 = ((~i43) & (i2 | 29)) + (i43 << 1);
        a = i44 % 128;
        int i45 = i44 % 2;
        int i46 = i2 & 123;
        int i47 = (i46 - (~(-(-((i2 ^ 123) | i46))))) - 1;
        a = i47 % 128;
        int i48 = i47 % 2;
        N n = (N) this.e;
        Object obj4 = this.d;
        int i49 = i2 & 45;
        int i50 = (((i2 | 45) & (~i49)) - (~(i49 << 1))) - 1;
        a = i50 % 128;
        if (i50 % 2 == 0) {
            ivas.gov.bisp.enumeration.O.r.n(n, "this$0");
            Object obj5 = n.c;
            throw null;
        }
        String str = (String) obj4;
        ivas.gov.bisp.enumeration.O.r.n(n, "this$0");
        Context context = (Context) n.c;
        ivas.gov.bisp.enumeration.O.r.n(context, "context");
        int i51 = a;
        int i52 = i51 & 43;
        int i53 = i51 | 43;
        int i54 = ((i52 | i53) << 1) - (i53 ^ i52);
        b = i54 % 128;
        int i55 = i54 % 2;
        try {
            Toast.makeText(context, str, 1).show();
            int i56 = b + 119;
            a = i56 % 128;
            if (i56 % 2 == 0) {
                throw null;
            }
        } catch (RuntimeException e) {
            ivas.gov.bisp.enumeration.aO.j jVar = P.c;
            ivas.gov.bisp.enumeration.aO.j jVar2 = P.c;
            ((i) jVar).y("OooOOO", "Could not send crash Toast", e);
        }
    }
}
