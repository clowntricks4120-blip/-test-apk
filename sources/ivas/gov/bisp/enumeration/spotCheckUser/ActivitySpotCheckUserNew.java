package ivas.gov.bisp.enumeration.spotCheckUser;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import com.orm.SugarRecord;
import ivas.gov.bisp.enumeration.ActivityBeginSurvey;
import ivas.gov.bisp.enumeration.BaseActivity;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.adapters.AdapterMainMenu;
import ivas.gov.bisp.enumeration.bJ.bv;
import ivas.gov.bisp.enumeration.bK.H;
import ivas.gov.bisp.enumeration.bK.ac;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.bK.ah;
import ivas.gov.bisp.enumeration.models.Batch;
import ivas.gov.bisp.enumeration.models.Roster;
import ivas.gov.bisp.enumeration.models.Survey;
import ivas.gov.bisp.enumeration.p026az.C0104p;
import ivas.gov.bisp.enumeration.p043bp.C0203e;
import ivas.gov.bisp.enumeration.p043bp.am;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class ActivitySpotCheckUserNew extends BaseActivity {
    public static final /* synthetic */ int af = 0;
    private static int p = 0;
    private static int q = 1;
    public long ag = 0;
    public long ah = 0;

    @BindView
    public RecyclerView mRecyclerView;

    @BindView
    public ProgressBar progressBarTotal;

    @BindView
    public ProgressBar progressBarTotalWaiting;

    @BindView
    public TextView textViewTotal;

    @BindView
    public TextView textViewTotalWaiting;

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        C0104p c0104pC = C0104p.c();
        AppCompatActivity appCompatActivity = this.ae;
        am amVar = new am(this, 10);
        int i2 = p;
        int i3 = i2 & 67;
        int i4 = (i3 - (~(-(-((i2 ^ 67) | i3))))) - 1;
        q = i4 % 128;
        if (i4 % 2 == 0) {
            c0104pC.h(appCompatActivity, "Are you sure?", "Are you sure you want to exit the application?", amVar, null, false);
        } else {
            c0104pC.h(appCompatActivity, "Are you sure?", "Are you sure you want to exit the application?", amVar, null, false);
        }
    }

    @Override // ivas.gov.bisp.enumeration.BaseActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        int i = 2 % 2;
        int i2 = p;
        int i3 = (i2 & 11) + (i2 | 11);
        q = i3 % 128;
        int i4 = i3 % 2;
        getMenuInflater().inflate(R.menu.menu_main, menu);
        int i5 = p;
        int i6 = (i5 ^ 97) + ((i5 & 97) << 1);
        q = i6 % 128;
        if (i6 % 2 != 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.BaseActivity, ivas.gov.bisp.enumeration.activitybase.BaseTouch, ivas.gov.bisp.enumeration.activitybase.BaseAuth, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        int i = 2 % 2;
        int i2 = p;
        int i3 = i2 & 55;
        int i4 = i2 | 55;
        int i5 = (i3 & i4) + (i4 | i3);
        q = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            super.onResume();
            ac.l();
            obj.hashCode();
            throw null;
        }
        super.onResume();
        if (ac.l()) {
            new OooO00o().execute(new Void[0]);
            int i6 = p;
            int i7 = ((i6 & 52) + (i6 | 52)) - 1;
            q = i7 % 128;
            int i8 = i7 % 2;
            int i9 = i6 + 119;
            q = i9 % 128;
            if (i9 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        C0104p c0104pC = C0104p.c();
        AppCompatActivity appCompatActivity = this.ae;
        bv bvVar = new bv(this, 0);
        int i10 = q;
        int i11 = ((i10 | 125) << 1) - (i10 ^ 125);
        p = i11 % 128;
        if (i11 % 2 != 0) {
            c0104pC.e(appCompatActivity, "Warning", "Insufficient storage available. Please clean your device storage and restart the application and sync again", bvVar, true);
        } else {
            c0104pC.e(appCompatActivity, "Warning", "Insufficient storage available. Please clean your device storage and restart the application and sync again", bvVar, false);
        }
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public int p() {
        int i = 2 % 2;
        int i2 = q;
        int i3 = i2 + 89;
        p = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 & 67;
        int i6 = (((i2 | 67) & (~i5)) - (~(-(-(i5 << 1))))) - 1;
        p = i6 % 128;
        if (i6 % 2 == 0) {
            return R.layout.activity_spot_check_user;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.BaseActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int i = 2 % 2;
        int i2 = p;
        int i3 = (((i2 | 122) << 1) - (i2 ^ 122)) - 1;
        q = i3 % 128;
        int i4 = i3 % 2;
        int itemId = menuItem.getItemId();
        if (itemId != R.id.action_info) {
            int i5 = q;
            int i6 = ((i5 | 53) << 1) - (i5 ^ 53);
            p = i6 % 128;
            int i7 = i6 % 2;
            if (itemId != R.id.action_sync) {
                int i8 = i5 & 43;
                int i9 = -(-((i5 ^ 43) | i8));
                int i10 = (i8 ^ i9) + ((i8 & i9) << 1);
                p = i10 % 128;
                int i11 = i10 % 2;
                super.onOptionsItemSelected(menuItem);
                int i12 = q + 107;
                p = i12 % 128;
                int i13 = i12 % 2;
            }
        } else {
            super.onOptionsItemSelected(menuItem);
            int i14 = p;
            int i15 = i14 & 5;
            int i16 = ((i14 ^ 5) | i15) << 1;
            int i17 = -((i14 | 5) & (~i15));
            int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
            q = i18 % 128;
            int i19 = i18 % 2;
        }
        int i20 = p;
        int i21 = i20 & 21;
        int i22 = ((i20 ^ 21) | i21) << 1;
        int i23 = -((i20 | 21) & (~i21));
        int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
        q = i24 % 128;
        int i25 = i24 % 2;
        return true;
    }

    public class OooO00o extends AsyncTask<Void, Void, Void> {
        private static int a = 0;
        private static int b = 1;

        public OooO00o() {
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (((i2 & (-90)) | ((~i2) & 89)) - (~((i2 & 89) << 1))) - 1;
            a = i3 % 128;
            int i4 = i3 % 2;
            super.onPreExecute();
            ActivitySpotCheckUserNew.u(ActivitySpotCheckUserNew.this, false);
            int i5 = b;
            int i6 = i5 & 43;
            int i7 = (i5 | 43) & (~i6);
            int i8 = -(-(i6 << 1));
            int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
            a = i9 % 128;
            if (i9 % 2 != 0) {
                throw null;
            }
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Void r9) {
            TextView textView;
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 85;
            int i4 = (i2 | 85) & (~i3);
            int i5 = i3 << 1;
            int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
            a = i6 % 128;
            int i7 = i6 % 2;
            super.onPostExecute(r9);
            ActivitySpotCheckUserNew.u(ActivitySpotCheckUserNew.this, true);
            TextView textView2 = ActivitySpotCheckUserNew.this.textViewTotalWaiting;
            StringBuilder sb = new StringBuilder();
            int i8 = a;
            int i9 = ((i8 & 122) + (i8 | 122)) - 1;
            b = i9 % 128;
            int i10 = i9 % 2;
            sb.append(ActivitySpotCheckUserNew.this.ag);
            int i11 = a + 43;
            b = i11 % 128;
            if (i11 % 2 == 0) {
                textView2.setText(sb.toString());
                textView = ActivitySpotCheckUserNew.this.textViewTotal;
                int i12 = 91 / 0;
            } else {
                textView2.setText(sb.toString());
                textView = ActivitySpotCheckUserNew.this.textViewTotal;
            }
            StringBuilder sb2 = new StringBuilder();
            long j = ActivitySpotCheckUserNew.this.ah;
            int i13 = b;
            int i14 = ((i13 | 99) << 1) - (((~i13) & 99) | (i13 & (-100)));
            a = i14 % 128;
            int i15 = i14 % 2;
            sb2.append(j);
            textView.setText(sb2.toString());
            int i16 = a;
            int i17 = ((i16 & (-18)) | ((~i16) & 17)) + ((i16 & 17) << 1);
            b = i17 % 128;
            int i18 = i17 % 2;
        }

        @Override // android.os.AsyncTask
        public Void doInBackground(Void[] voidArr) {
            int i;
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = i3 & 3;
            int i5 = i3 | 3;
            int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
            a = i6 % 128;
            Object obj = null;
            if (i6 % 2 != 0) {
                int i7 = ActivitySpotCheckUserNew.af;
                obj.hashCode();
                throw null;
            }
            ActivitySpotCheckUserNew activitySpotCheckUserNew = ActivitySpotCheckUserNew.this;
            int i8 = ActivitySpotCheckUserNew.af;
            Objects.requireNonNull(activitySpotCheckUserNew);
            String[] strArr = new String[1];
            int i9 = a;
            int i10 = (i9 ^ 99) + ((i9 & 99) << 1);
            b = i10 % 128;
            if (i10 % 2 == 0) {
                strArr[0] = "0";
                activitySpotCheckUserNew.ag = SugarRecord.count(Survey.class, "is_sent_to_server=?", strArr);
                i = 0;
            } else {
                strArr[0] = "0";
                activitySpotCheckUserNew.ag = SugarRecord.count(Survey.class, "is_sent_to_server=?", strArr);
                i = 1;
            }
            int i11 = a;
            int i12 = i11 & 77;
            int i13 = -(-(i11 | 77));
            int i14 = (i12 & i13) + (i12 | i13);
            b = i14 % 128;
            String[] strArr2 = new String[i];
            if (i14 % 2 == 0) {
                strArr2[1] = "1";
            } else {
                strArr2[0] = "1";
            }
            int i15 = ((i11 ^ 77) | (i11 & 77)) << 1;
            int i16 = -(((~i11) & 77) | (i11 & (-78)));
            int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
            b = i17 % 128;
            if (i17 % 2 == 0) {
                activitySpotCheckUserNew.ah = SugarRecord.count(Survey.class, "is_sent_to_server=?", strArr2);
                int i18 = 99 / 0;
            } else {
                activitySpotCheckUserNew.ah = SugarRecord.count(Survey.class, "is_sent_to_server=?", strArr2);
            }
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0038 A[PHI: r2
  0x0038: PHI (r2v40 android.widget.TextView) = (r2v4 android.widget.TextView), (r2v41 android.widget.TextView) binds: [B:8:0x0022, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0024 A[PHI: r2
  0x0024: PHI (r2v5 android.widget.TextView) = (r2v4 android.widget.TextView), (r2v41 android.widget.TextView) binds: [B:8:0x0022, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    public static void u(ActivitySpotCheckUserNew activitySpotCheckUserNew, boolean z) {
        TextView textView;
        int i;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = p;
        int i6 = ((i5 ^ 59) - (~((i5 & 59) << 1))) - 1;
        q = i6 % 128;
        int i7 = 8;
        if (i6 % 2 == 0) {
            textView = activitySpotCheckUserNew.textViewTotalWaiting;
            int i8 = 97 / 0;
            if (z) {
                int i9 = i5 | 5;
                int i10 = i9 << 1;
                int i11 = -((~(i5 & 5)) & i9);
                int i12 = (i10 & i11) + (i11 | i10);
                q = i12 % 128;
                int i13 = i12 % 2;
                i = 0;
            } else {
                int i14 = ((i5 ^ 27) | (i5 & 27)) << 1;
                int i15 = -(((~i5) & 27) | (i5 & (-28)));
                int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
                q = i16 % 128;
                int i17 = i16 % 2;
                i = 8;
            }
        } else {
            textView = activitySpotCheckUserNew.textViewTotalWaiting;
            if (z) {
                int i18 = i5 | 5;
                int i19 = i18 << 1;
                int i110 = -((~(i5 & 5)) & i18);
                int i111 = (i19 & i110) + (i110 | i19);
                q = i111 % 128;
                int i112 = i111 % 2;
                i = 0;
            } else {
                int i113 = ((i5 ^ 27) | (i5 & 27)) << 1;
                int i114 = -(((~i5) & 27) | (i5 & (-28)));
                int i115 = ((i113 | i114) << 1) - (i114 ^ i113);
                q = i115 % 128;
                int i116 = i115 % 2;
                i = 8;
            }
        }
        textView.setVisibility(i);
        ProgressBar progressBar = activitySpotCheckUserNew.progressBarTotalWaiting;
        if (z) {
            int i20 = q;
            int i21 = i20 ^ 89;
            int i22 = (((i20 & 89) | i21) << 1) - i21;
            p = i22 % 128;
            int i23 = i22 % 2;
            i2 = 8;
        } else {
            int i24 = p + 87;
            q = i24 % 128;
            int i25 = i24 % 2;
            i2 = 0;
        }
        progressBar.setVisibility(i2);
        TextView textView2 = activitySpotCheckUserNew.textViewTotal;
        if (z) {
            int i26 = p;
            int i27 = ((i26 ^ 56) + ((i26 & 56) << 1)) - 1;
            int i28 = i27 % 128;
            q = i28;
            i3 = (i27 % 2 == 0 ? 0 : 1) ^ 1;
            int i29 = (-2) - (((i28 & 22) + (i28 | 22)) ^ (-1));
            p = i29 % 128;
            int i30 = i29 % 2;
        } else {
            int i31 = q;
            int i32 = i31 & 103;
            int i33 = ((i31 | 103) & (~i32)) + (i32 << 1);
            p = i33 % 128;
            int i34 = i33 % 2;
            i3 = 8;
        }
        textView2.setVisibility(i3);
        ProgressBar progressBar2 = activitySpotCheckUserNew.progressBarTotal;
        if (z) {
            int i35 = q;
            int i36 = i35 & 9;
            int i37 = (i35 ^ 9) | i36;
            int i38 = ((i36 | i37) << 1) - (i37 ^ i36);
            p = i38 % 128;
            int i39 = i38 % 2;
        } else {
            int i40 = p + 107;
            int i41 = i40 % 128;
            q = i41;
            int i42 = i40 % 2;
            int i43 = i41 & 31;
            int i44 = (i41 | 31) & (~i43);
            int i45 = i43 << 1;
            int i46 = (i44 & i45) + (i45 | i44);
            p = i46 % 128;
            int i47 = i46 % 2;
            i7 = 0;
        }
        progressBar2.setVisibility(i7);
        int i48 = p;
        int i49 = (i48 ^ 29) + ((i48 & 29) << 1);
        q = i49 % 128;
        if (i49 % 2 == 0) {
            int i50 = 41 / 0;
        }
    }

    @OnClick
    public void beginSurvey(View view) {
        int i = 2 % 2;
        int i2 = p;
        int i3 = ((((i2 ^ 63) | (i2 & 63)) << 1) - (~(-(((~i2) & 63) | (i2 & (-64)))))) - 1;
        q = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            SharedPreferences sharedPreferences = ah.c.d;
            throw null;
        }
        long j = this.ag;
        SharedPreferences sharedPreferences2 = ah.c.d;
        int i4 = p;
        int i5 = (i4 | 99) << 1;
        int i6 = -(((~i4) & 99) | (i4 & (-100)));
        int i7 = (i5 & i6) + (i6 | i5);
        q = i7 % 128;
        if (i7 % 2 != 0 ? j >= sharedPreferences2.getInt("enum_survey_limit", 100) : j >= sharedPreferences2.getInt("enum_survey_limit", 59)) {
            Toast.makeText(getApplicationContext(), "Maximum survey limit reached. Send data to server to proceed", 1).show();
            int i8 = p;
            int i9 = i8 & 1;
            int i10 = (i9 - (~((i8 ^ 1) | i9))) - 1;
            q = i10 % 128;
            if (i10 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        startActivity(new Intent(this, (Class<?>) ActivityBeginSurvey.class));
        int i11 = p;
        int i12 = i11 & 57;
        int i13 = ((i11 ^ 57) | i12) << 1;
        int i14 = -((i11 | 57) & (~i12));
        int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
        q = i15 % 128;
        if (i15 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x007d  */
    /* JADX WARN: Code duplicated, block: B:14:0x008d  */
    /* JADX WARN: Code duplicated, block: B:16:0x009c  */
    /* JADX WARN: Code duplicated, block: B:18:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:21:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:23:0x014d  */
    /* JADX WARN: Code duplicated, block: B:24:0x015d  */
    /* JADX WARN: Code duplicated, block: B:41:0x01c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x01be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x018a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00f4 A[SYNTHETIC] */
    @Override // ivas.gov.bisp.enumeration.BaseActivity, ivas.gov.bisp.enumeration.activitybase.BaseTouch, ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public void t() {
        int i;
        int i2;
        int i3;
        ArrayList arrayList;
        int i4;
        String[] strArr;
        int i5;
        int i6;
        int i7 = 2 % 2;
        int i8 = q + 75;
        p = i8 % 128;
        int i9 = i8 % 2;
        super.t();
        Map<Class<?>, Constructor<? extends Unbinder>> map = ButterKnife.a;
        ButterKnife.c(this, getWindow().getDecorView());
        ProgressDialog progressDialog = new ProgressDialog(this);
        int i10 = q;
        int i11 = (((i10 & (-124)) | ((~i10) & 123)) - (~(-(-((i10 & 123) << 1))))) - 1;
        p = i11 % 128;
        int i12 = i11 % 2;
        progressDialog.setCancelable(false);
        Object obj = null;
        if (!ag.h(this)) {
            C0104p c0104pC = C0104p.c();
            String string = getResources().getString(R.string.time_mismatch);
            bv bvVar = new bv(this, 1);
            int i13 = q;
            int i14 = i13 ^ 71;
            int i15 = (i13 & 71) << 1;
            int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
            p = i16 % 128;
            int i17 = i16 % 2;
            c0104pC.e(this, "Time mismatch", string, bvVar, false);
            int i18 = q + 89;
            p = i18 % 128;
            if (i18 % 2 != 0) {
                throw null;
            }
            return;
        }
        ArrayList arrayList2 = new ArrayList(SugarRecord.find(Batch.class, "is_sent=?", "1"));
        int i19 = q;
        int i20 = (((i19 ^ 121) | (i19 & 121)) << 1) - (((~i19) & 121) | (i19 & (-122)));
        p = i20 % 128;
        if (i20 % 2 != 0) {
            int i21 = 76 / 0;
            if (arrayList2.size() > 0) {
                int i22 = p + 31;
                q = i22 % 128;
                int i23 = i22 % 2;
                i = 0;
                while (i < arrayList2.size()) {
                    int i24 = q;
                    i2 = ((i24 | 9) << 1) - (i24 ^ 9);
                    p = i2 % 128;
                    if (i2 % 2 == 0) {
                        ag.f(((Batch) arrayList2.get(i)).getSentToServerTimeStamp());
                        obj.hashCode();
                        throw null;
                    }
                    if (ag.f(((Batch) arrayList2.get(i)).getSentToServerTimeStamp()) > 144) {
                        int i25 = q + 35;
                        p = i25 % 128;
                        int i26 = i25 % 2;
                        Batch batch = (Batch) arrayList2.get(i);
                        int i27 = q;
                        int i28 = i27 & 49;
                        int i29 = (i28 - (~(-(-((i27 ^ 49) | i28))))) - 1;
                        p = i29 % 128;
                        int i30 = i29 % 2;
                        arrayList = new ArrayList(SugarRecord.find(Survey.class, "batch_name=? and user_type != ?", batch.getName(), "5"));
                        int i31 = q + 51;
                        p = i31 % 128;
                        int i32 = i31 % 2;
                        i4 = 0;
                        while (i4 < arrayList.size()) {
                            int i33 = p;
                            int i34 = (((i33 & (-46)) | ((~i33) & 45)) - (~(-(-((i33 & 45) << 1))))) - 1;
                            q = i34 % 128;
                            int i35 = i34 % 2;
                            Survey survey = (Survey) arrayList.get(i4);
                            int i36 = q;
                            int i37 = (((i36 ^ 93) | (i36 & 93)) << 1) - ((i36 & (-94)) | ((~i36) & 93));
                            p = i37 % 128;
                            int i38 = i37 % 2;
                            strArr = new String[]{survey.uniqueID, "5"};
                            int i39 = q;
                            int i40 = i39 & 107;
                            int i41 = -(-(i39 | 107));
                            i5 = ((i40 | i41) << 1) - (i41 ^ i40);
                            p = i5 % 128;
                            if (i5 % 2 != 0) {
                                SugarRecord.deleteAll(Roster.class, "survey_uuid=? and survey_type != ?", strArr);
                                ((Survey) arrayList.get(i4)).delete();
                                int i42 = 33 / 0;
                            } else {
                                SugarRecord.deleteAll(Roster.class, "survey_uuid=? and survey_type != ?", strArr);
                                ((Survey) arrayList.get(i4)).delete();
                            }
                            int i43 = q;
                            int i44 = i43 ^ 73;
                            int i45 = -(-((i43 & 73) << 1));
                            int i46 = (i44 & i45) + (i45 | i44);
                            int i47 = i46 % 128;
                            p = i47;
                            int i48 = i46 % 2;
                            i4++;
                            i6 = ((i47 & 76) + (i47 | 76)) - 1;
                            q = i6 % 128;
                            if (i6 % 2 == 0) {
                                int i49 = 4 / 4;
                            }
                        }
                        batch.delete();
                        int i50 = p;
                        int i51 = ((i50 | 25) << 1) - (i50 ^ 25);
                        q = i51 % 128;
                        int i52 = i51 % 2;
                    }
                    int i53 = i & 1;
                    i = ((((i ^ 1) | i53) << 1) - (~(-((i | 1) & (~i53))))) - 1;
                    int i54 = q;
                    i3 = (((i54 | 110) << 1) - (i54 ^ 110)) - 1;
                    p = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i55 = 3 / 4;
                    }
                }
            }
        } else if (arrayList2.size() > 0) {
            int i210 = p + 31;
            q = i210 % 128;
            int i211 = i210 % 2;
            i = 0;
            while (i < arrayList2.size()) {
                int i212 = q;
                i2 = ((i212 | 9) << 1) - (i212 ^ 9);
                p = i2 % 128;
                if (i2 % 2 == 0) {
                    ag.f(((Batch) arrayList2.get(i)).getSentToServerTimeStamp());
                    obj.hashCode();
                    throw null;
                }
                if (ag.f(((Batch) arrayList2.get(i)).getSentToServerTimeStamp()) > 144) {
                    int i213 = q + 35;
                    p = i213 % 128;
                    int i214 = i213 % 2;
                    Batch batch2 = (Batch) arrayList2.get(i);
                    int i215 = q;
                    int i216 = i215 & 49;
                    int i217 = (i216 - (~(-(-((i215 ^ 49) | i216))))) - 1;
                    p = i217 % 128;
                    int i310 = i217 % 2;
                    arrayList = new ArrayList(SugarRecord.find(Survey.class, "batch_name=? and user_type != ?", batch2.getName(), "5"));
                    int i311 = q + 51;
                    p = i311 % 128;
                    int i312 = i311 % 2;
                    i4 = 0;
                    while (i4 < arrayList.size()) {
                        int i313 = p;
                        int i314 = (((i313 & (-46)) | ((~i313) & 45)) - (~(-(-((i313 & 45) << 1))))) - 1;
                        q = i314 % 128;
                        int i315 = i314 % 2;
                        Survey survey2 = (Survey) arrayList.get(i4);
                        int i316 = q;
                        int i317 = (((i316 ^ 93) | (i316 & 93)) << 1) - ((i316 & (-94)) | ((~i316) & 93));
                        p = i317 % 128;
                        int i318 = i317 % 2;
                        strArr = new String[]{survey2.uniqueID, "5"};
                        int i319 = q;
                        int i410 = i319 & 107;
                        int i411 = -(-(i319 | 107));
                        i5 = ((i410 | i411) << 1) - (i411 ^ i410);
                        p = i5 % 128;
                        if (i5 % 2 != 0) {
                            SugarRecord.deleteAll(Roster.class, "survey_uuid=? and survey_type != ?", strArr);
                            ((Survey) arrayList.get(i4)).delete();
                            int i412 = 33 / 0;
                        } else {
                            SugarRecord.deleteAll(Roster.class, "survey_uuid=? and survey_type != ?", strArr);
                            ((Survey) arrayList.get(i4)).delete();
                        }
                        int i413 = q;
                        int i414 = i413 ^ 73;
                        int i415 = -(-((i413 & 73) << 1));
                        int i416 = (i414 & i415) + (i415 | i414);
                        int i417 = i416 % 128;
                        p = i417;
                        int i418 = i416 % 2;
                        i4++;
                        i6 = ((i417 & 76) + (i417 | 76)) - 1;
                        q = i6 % 128;
                        if (i6 % 2 == 0) {
                            int i419 = 4 / 4;
                        }
                    }
                    batch2.delete();
                    int i56 = p;
                    int i57 = ((i56 | 25) << 1) - (i56 ^ 25);
                    q = i57 % 128;
                    int i58 = i57 % 2;
                }
                int i59 = i & 1;
                i = ((((i ^ 1) | i59) << 1) - (~(-((i | 1) & (~i59))))) - 1;
                int i510 = q;
                i3 = (((i510 | 110) << 1) - (i510 ^ 110)) - 1;
                p = i3 % 128;
                if (i3 % 2 != 0) {
                    int i511 = 3 / 4;
                }
            }
        }
        this.mRecyclerView.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager((Context) this, 2, 1, false);
        RecyclerView recyclerView = this.mRecyclerView;
        H h = new H(2, 5, false);
        int i60 = p;
        int i61 = (i60 & (-120)) | ((~i60) & 119);
        int i62 = (i60 & 119) << 1;
        int i63 = ((i61 | i62) << 1) - (i62 ^ i61);
        q = i63 % 128;
        int i64 = i63 % 2;
        recyclerView.n(h);
        this.mRecyclerView.setNestedScrollingEnabled(false);
        this.mRecyclerView.setLayoutManager(gridLayoutManager);
        AdapterMainMenu adapterMainMenu = new AdapterMainMenu(new C0203e(this, 7), getResources().obtainTypedArray(R.array.spot_check_user_menu_items), getResources().obtainTypedArray(R.array.spot_check_user_menu_items_strings));
        int i65 = p;
        int i66 = i65 | 3;
        int i67 = i66 << 1;
        int i68 = -((~(i65 & 3)) & i66);
        int i69 = (i67 ^ i68) + ((i68 & i67) << 1);
        q = i69 % 128;
        int i70 = i69 % 2;
        this.mRecyclerView.setAdapter(adapterMainMenu);
        int i71 = q;
        int i72 = i71 ^ 109;
        int i73 = (((i71 & 109) | i72) << 1) - i72;
        p = i73 % 128;
        int i74 = i73 % 2;
    }
}
