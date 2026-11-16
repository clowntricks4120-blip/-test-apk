package ivas.gov.bisp.enumeration.spotCheckUser;

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
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.OnClick;
import com.orm.SugarRecord;
import ivas.gov.bisp.enumeration.ActivityBeginSurvey;
import ivas.gov.bisp.enumeration.BaseActivity;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.bJ.bu;
import ivas.gov.bisp.enumeration.bK.ac;
import ivas.gov.bisp.enumeration.bK.ah;
import ivas.gov.bisp.enumeration.models.Survey;
import ivas.gov.bisp.enumeration.p026az.C0104p;
import ivas.gov.bisp.enumeration.p043bp.am;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class ActivitySpotCheckUser extends BaseActivity {
    public static final /* synthetic */ int af = 0;
    private static int p = 0;
    private static int q = 1;

    @BindView
    public RecyclerView mRecyclerView;

    @BindView
    public ProgressBar progressBarSampling;

    @BindView
    public ProgressBar progressBarSnowball;

    @BindView
    public ProgressBar progressBarTotal;

    @BindView
    public ProgressBar progressBarTotalWaiting;

    @BindView
    public TextView textViewSampling;

    @BindView
    public TextView textViewSnowball;

    @BindView
    public TextView textViewTotal;

    @BindView
    public TextView textViewTotalWaiting;
    public long ag = 0;
    public long ah = 0;
    public long aj = 0;
    public long ai = 0;

    public class OooO00o extends AsyncTask<Void, Void, Void> {
        private static int a = 1;
        private static int b;

        public OooO00o() {
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 23;
            int i4 = -(-((i2 ^ 23) | i3));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            a = i5 % 128;
            int i6 = i5 % 2;
            super.onPreExecute();
            ActivitySpotCheckUser.u(ActivitySpotCheckUser.this, false);
            int i7 = a;
            int i8 = (i7 ^ 91) + ((i7 & 91) << 1);
            b = i8 % 128;
            int i9 = i8 % 2;
        }

        @Override // android.os.AsyncTask
        public Void doInBackground(Void[] voidArr) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 & (-4)) | ((~i2) & 3)) + ((i2 & 3) << 1);
            b = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                int i4 = ActivitySpotCheckUser.af;
                obj.hashCode();
                throw null;
            }
            ActivitySpotCheckUser activitySpotCheckUser = ActivitySpotCheckUser.this;
            int i5 = ActivitySpotCheckUser.af;
            int i6 = a;
            int i7 = (i6 & (-82)) | ((~i6) & 81);
            int i8 = -(-((i6 & 81) << 1));
            int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
            b = i9 % 128;
            int i10 = i9 % 2;
            Objects.requireNonNull(activitySpotCheckUser);
            int i11 = a;
            int i12 = (((i11 & (-98)) | ((~i11) & 97)) - (~((i11 & 97) << 1))) - 1;
            b = i12 % 128;
            int i13 = i12 % 2;
            activitySpotCheckUser.ag = SugarRecord.count(Survey.class, "is_sent_to_server=?", "0");
            int i14 = a;
            int i15 = ((i14 & 28) + (i14 | 28)) - 1;
            b = i15 % 128;
            int i16 = i15 % 2;
            String[] strArr = {"1"};
            int i17 = (-2) - ((i14 + 64) ^ (-1));
            b = i17 % 128;
            if (i17 % 2 != 0) {
                activitySpotCheckUser.ah = SugarRecord.count(Survey.class, "is_sent_to_server=?", strArr);
                SharedPreferences sharedPreferences = ah.c.d;
                obj.hashCode();
                throw null;
            }
            activitySpotCheckUser.ah = SugarRecord.count(Survey.class, "is_sent_to_server=?", strArr);
            activitySpotCheckUser.ai = ah.c.d.getLong("sampling_count", 0L);
            ah ahVar = ah.c;
            int i18 = a;
            int i19 = i18 ^ 19;
            int i20 = (((i18 & 19) | i19) << 1) - i19;
            b = i20 % 128;
            int i21 = i20 % 2;
            long j = ahVar.d.getLong("snowball_count", 0L);
            int i22 = a;
            int i23 = i22 & 67;
            int i24 = (i23 - (~(-(-((i22 ^ 67) | i23))))) - 1;
            b = i24 % 128;
            if (i24 % 2 == 0) {
                activitySpotCheckUser.aj = j;
                return null;
            }
            activitySpotCheckUser.aj = j;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Void r10) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 89;
            int i4 = (((i2 ^ 89) | i3) << 1) - ((i2 | 89) & (~i3));
            b = i4 % 128;
            if (i4 % 2 != 0) {
                super.onPostExecute(r10);
                ActivitySpotCheckUser.u(ActivitySpotCheckUser.this, false);
            } else {
                super.onPostExecute(r10);
                ActivitySpotCheckUser.u(ActivitySpotCheckUser.this, true);
            }
            TextView textView = ActivitySpotCheckUser.this.textViewTotalWaiting;
            StringBuilder sb = new StringBuilder();
            sb.append(ActivitySpotCheckUser.this.ag);
            textView.setText(sb.toString());
            TextView textView2 = ActivitySpotCheckUser.this.textViewTotal;
            StringBuilder sb2 = new StringBuilder();
            int i5 = a;
            int i6 = i5 & 97;
            int i7 = (i5 ^ 97) | i6;
            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
            b = i8 % 128;
            if (i8 % 2 != 0) {
                sb2.append(ActivitySpotCheckUser.this.ah);
                sb2.toString();
                throw null;
            }
            sb2.append(ActivitySpotCheckUser.this.ah);
            textView2.setText(sb2.toString());
            TextView textView3 = ActivitySpotCheckUser.this.textViewSampling;
            StringBuilder sb3 = new StringBuilder();
            ActivitySpotCheckUser activitySpotCheckUser = ActivitySpotCheckUser.this;
            int i9 = b;
            int i10 = i9 & 1;
            int i11 = ((i9 ^ 1) | i10) << 1;
            int i12 = -((i9 | 1) & (~i10));
            int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
            a = i13 % 128;
            if (i13 % 2 == 0) {
                sb3.append(activitySpotCheckUser.ai);
                textView3.setText(sb3.toString());
                throw null;
            }
            sb3.append(activitySpotCheckUser.ai);
            textView3.setText(sb3.toString());
            TextView textView4 = ActivitySpotCheckUser.this.textViewSnowball;
            StringBuilder sb4 = new StringBuilder();
            long j = ActivitySpotCheckUser.this.aj;
            int i14 = b;
            int i15 = (i14 ^ 5) + ((i14 & 5) << 1);
            a = i15 % 128;
            if (i15 % 2 != 0) {
                sb4.append(j);
                textView4.setText(sb4.toString());
            } else {
                sb4.append(j);
                textView4.setText(sb4.toString());
                int i16 = 41 / 0;
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        C0104p c0104pC = C0104p.c();
        AppCompatActivity appCompatActivity = this.ae;
        bu buVar = new bu(this, 1);
        int i2 = p;
        int i3 = (((i2 | 74) << 1) - (i2 ^ 74)) - 1;
        q = i3 % 128;
        if (i3 % 2 == 0) {
            c0104pC.h(appCompatActivity, "Are you sure?", "Are you sure you want to exit the application?", buVar, null, true);
        } else {
            c0104pC.h(appCompatActivity, "Are you sure?", "Are you sure you want to exit the application?", buVar, null, false);
        }
    }

    @Override // ivas.gov.bisp.enumeration.BaseActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        int i = 2 % 2;
        int i2 = q;
        int i3 = i2 & 29;
        int i4 = ((i2 ^ 29) | i3) << 1;
        int i5 = -((i2 | 29) & (~i3));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        p = i6 % 128;
        int i7 = i6 % 2;
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public int p() {
        int i = 2 % 2;
        int i2 = q;
        int i3 = (((i2 ^ 105) | (i2 & 105)) << 1) - (((~i2) & 105) | (i2 & (-106)));
        p = i3 % 128;
        if (i3 % 2 == 0) {
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
        int i3 = i2 & 63;
        int i4 = i3 + ((i2 ^ 63) | i3);
        q = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            menuItem.getItemId();
            throw null;
        }
        int itemId = menuItem.getItemId();
        if (itemId != R.id.action_info) {
            int i5 = p + 5;
            int i6 = i5 % 128;
            q = i6;
            int i7 = i5 % 2;
            if (itemId != R.id.action_sync) {
                int i8 = i6 & 63;
                int i9 = i8 + ((i6 ^ 63) | i8);
                p = i9 % 128;
                if (i9 % 2 != 0) {
                    super.onOptionsItemSelected(menuItem);
                    obj.hashCode();
                    throw null;
                }
                super.onOptionsItemSelected(menuItem);
            }
        } else {
            super.onOptionsItemSelected(menuItem);
            int i10 = p;
            int i11 = ((i10 ^ 29) | (i10 & 29)) << 1;
            int i12 = -(((~i10) & 29) | (i10 & (-30)));
            int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
            q = i13 % 128;
            int i14 = i13 % 2;
        }
        int i15 = p;
        int i16 = i15 & 121;
        int i17 = i15 | 121;
        int i18 = (i16 & i17) + (i17 | i16);
        q = i18 % 128;
        if (i18 % 2 == 0) {
            int i19 = 16 / 0;
        }
        return true;
    }

    @Override // ivas.gov.bisp.enumeration.BaseActivity, ivas.gov.bisp.enumeration.activitybase.BaseTouch, ivas.gov.bisp.enumeration.activitybase.BaseAuth, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        int i = 2 % 2;
        int i2 = q;
        int i3 = (-2) - (((i2 & 6) + (i2 | 6)) ^ (-1));
        p = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            super.onResume();
            ac.l();
            obj.hashCode();
            throw null;
        }
        super.onResume();
        if (!ac.l()) {
            C0104p.c().e(this.ae, "Warning", "Insufficient storage available. Please clean your device storage and restart the application and sync again", new am(this, 9), false);
            int i4 = q;
            int i5 = (i4 ^ 89) + ((i4 & 89) << 1);
            p = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        int i7 = q;
        int i8 = i7 & 55;
        int i9 = (i7 ^ 55) | i8;
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        p = i10 % 128;
        int i11 = i10 % 2;
        new OooO00o().execute(new Void[0]);
        if (i11 != 0) {
            obj.hashCode();
            throw null;
        }
        int i12 = q;
        int i13 = ((i12 & 108) + (i12 | 108)) - 1;
        p = i13 % 128;
        int i14 = i13 % 2;
    }

    @OnClick
    public void beginSurvey(View view) {
        int i = 2 % 2;
        int i2 = q + 91;
        p = i2 % 128;
        int i3 = i2 % 2;
        long j = this.ag;
        SharedPreferences sharedPreferences = ah.c.d;
        int i4 = q + 51;
        p = i4 % 128;
        if (i4 % 2 == 0 ? j >= sharedPreferences.getInt("enum_survey_limit", 100) : j >= sharedPreferences.getInt("enum_survey_limit", 37)) {
            Toast toastMakeText = Toast.makeText(getApplicationContext(), "Maximum survey limit reached. Send data to server to proceed", 1);
            int i5 = q;
            int i6 = ((i5 | 25) << 1) - (i5 ^ 25);
            p = i6 % 128;
            int i7 = i6 % 2;
            toastMakeText.show();
            int i8 = q + 103;
            p = i8 % 128;
            int i9 = i8 % 2;
            return;
        }
        Intent intent = new Intent(this, (Class<?>) ActivityBeginSurvey.class);
        int i10 = p;
        int i11 = (((i10 | 51) << 1) - (~(-(i10 ^ 51)))) - 1;
        q = i11 % 128;
        int i12 = i11 % 2;
        startActivity(intent);
        int i13 = p;
        int i14 = ((((i13 ^ 27) | (i13 & 27)) << 1) - (~(-(((~i13) & 27) | (i13 & (-28)))))) - 1;
        q = i14 % 128;
        if (i14 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0037 A[PHI: r5
  0x0037: PHI (r5v63 android.widget.TextView) = (r5v4 android.widget.TextView), (r5v64 android.widget.TextView) binds: [B:8:0x0028, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x0044  */
    /* JADX WARN: Code duplicated, block: B:9:0x002a A[PHI: r5
  0x002a: PHI (r5v5 android.widget.TextView) = (r5v4 android.widget.TextView), (r5v64 android.widget.TextView) binds: [B:8:0x0028, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    public static void u(ActivitySpotCheckUser activitySpotCheckUser, boolean z) {
        TextView textView;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = 2 % 2;
        int i10 = q;
        int i11 = i10 & 111;
        int i12 = (~i11) & (i10 | 111);
        int i13 = -(-(i11 << 1));
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        int i15 = i14 % 128;
        p = i15;
        int i16 = 8;
        if (i14 % 2 != 0) {
            textView = activitySpotCheckUser.textViewTotalWaiting;
            int i17 = 43 / 0;
            if (z) {
                int i18 = ((i15 | 21) << 1) - (i15 ^ 21);
                q = i18 % 128;
                int i19 = i18 % 2;
                i = 0;
            } else {
                int i20 = i10 + 52;
                i8 = (i20 ^ (-1)) + (i20 << 1);
                p = i8 % 128;
                if (i8 % 2 != 0) {
                    int i21 = 3 % 3;
                }
                i = 8;
            }
        } else {
            textView = activitySpotCheckUser.textViewTotalWaiting;
            if (z) {
                int i110 = ((i15 | 21) << 1) - (i15 ^ 21);
                q = i110 % 128;
                int i111 = i110 % 2;
                i = 0;
            } else {
                int i22 = i10 + 52;
                i8 = (i22 ^ (-1)) + (i22 << 1);
                p = i8 % 128;
                if (i8 % 2 != 0) {
                    int i23 = 3 % 3;
                }
                i = 8;
            }
        }
        textView.setVisibility(i);
        ProgressBar progressBar = activitySpotCheckUser.progressBarTotalWaiting;
        if (!z) {
            int i24 = p;
            int i25 = ((i24 ^ 13) | (i24 & 13)) << 1;
            int i26 = -(((~i24) & 13) | (i24 & (-14)));
            int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
            int i28 = i27 % 128;
            q = i28;
            int i29 = i27 % 2;
            int i30 = ((i28 & 1) - (~(-(-(i28 | 1))))) - 1;
            p = i30 % 128;
            if (i30 % 2 != 0) {
                int i31 = 3 / 2;
            }
            i2 = 0;
        } else {
            int i32 = p;
            int i33 = i32 & 73;
            int i34 = ((((i32 ^ 73) | i33) << 1) - (~(-((i32 | 73) & (~i33))))) - 1;
            q = i34 % 128;
            int i35 = i34 % 2;
            i2 = 8;
        }
        progressBar.setVisibility(i2);
        TextView textView2 = activitySpotCheckUser.textViewTotal;
        if (z) {
            int i36 = p;
            int i37 = ((i36 & 69) - (~(i36 | 69))) - 1;
            int i38 = i37 % 128;
            q = i38;
            int i39 = i37 % 2;
            int i40 = (i38 & (-76)) | ((~i38) & 75);
            int i41 = -(-((i38 & 75) << 1));
            int i42 = ((i40 | i41) << 1) - (i41 ^ i40);
            p = i42 % 128;
            int i43 = i42 % 2;
            i3 = 0;
        } else {
            int i44 = p;
            int i45 = (-2) - (((i44 & 118) + (i44 | 118)) ^ (-1));
            q = i45 % 128;
            int i46 = i45 % 2;
            i3 = 8;
        }
        textView2.setVisibility(i3);
        ProgressBar progressBar2 = activitySpotCheckUser.progressBarTotal;
        if (!z) {
            int i47 = q;
            int i48 = ((i47 | 45) << 1) - (i47 ^ 45);
            int i49 = i48 % 128;
            p = i49;
            i4 = i48 % 2 != 0 ? 1 : 0;
            int i50 = i49 & 25;
            int i51 = i49 | 25;
            int i52 = ((i50 | i51) << 1) - (i51 ^ i50);
            q = i52 % 128;
            int i53 = i52 % 2;
        } else {
            int i54 = (-2) - ((p + 88) ^ (-1));
            q = i54 % 128;
            int i55 = i54 % 2;
            i4 = 8;
        }
        progressBar2.setVisibility(i4);
        TextView textView3 = activitySpotCheckUser.textViewSampling;
        if (z) {
            int i56 = q;
            int i57 = (i56 | 61) << 1;
            int i58 = -(((~i56) & 61) | (i56 & (-62)));
            int i59 = (i57 ^ i58) + ((i58 & i57) << 1);
            int i60 = i59 % 128;
            p = i60;
            int i61 = i59 % 2;
            int i62 = ((i60 ^ 28) + ((i60 & 28) << 1)) - 1;
            q = i62 % 128;
            int i63 = i62 % 2;
            i5 = 0;
        } else {
            int i64 = q;
            int i65 = (i64 ^ 29) + ((i64 & 29) << 1);
            p = i65 % 128;
            if (i65 % 2 != 0) {
                int i66 = 4 % 4;
            }
            i5 = 8;
        }
        textView3.setVisibility(i5);
        ProgressBar progressBar3 = activitySpotCheckUser.progressBarSampling;
        if (!z) {
            int i67 = p;
            int i68 = (i67 & (-122)) | ((~i67) & 121);
            int i69 = (i67 & 121) << 1;
            int i70 = (i68 ^ i69) + ((i69 & i68) << 1);
            int i71 = i70 % 128;
            q = i71;
            int i72 = i70 % 2;
            int i73 = (i71 & 43) + (i71 | 43);
            p = i73 % 128;
            int i74 = i73 % 2;
            i6 = 0;
        } else {
            int i75 = p;
            int i76 = ((i75 & 9) - (~(i75 | 9))) - 1;
            q = i76 % 128;
            int i77 = i76 % 2;
            i6 = 8;
        }
        progressBar3.setVisibility(i6);
        TextView textView4 = activitySpotCheckUser.textViewSnowball;
        if (!z) {
            int i78 = p + 125;
            q = i78 % 128;
            int i79 = i78 % 2;
            i7 = 8;
        } else {
            int i80 = q;
            int i81 = i80 + 55;
            p = i81 % 128;
            int i82 = i81 % 2;
            int i83 = i80 & 113;
            int i84 = ((i80 ^ 113) | i83) << 1;
            int i85 = -((i80 | 113) & (~i83));
            int i86 = (i84 ^ i85) + ((i85 & i84) << 1);
            p = i86 % 128;
            int i87 = i86 % 2;
            i7 = 0;
        }
        textView4.setVisibility(i7);
        ProgressBar progressBar4 = activitySpotCheckUser.progressBarSnowball;
        if (!(!z)) {
            int i88 = p;
            int i89 = i88 & 55;
            int i90 = i89 + ((i88 ^ 55) | i89);
            q = i90 % 128;
            int i91 = i90 % 2;
        } else {
            int i92 = p + 13;
            int i93 = i92 % 128;
            q = i93;
            int i94 = i92 % 2;
            int i95 = i93 & 77;
            int i96 = (i95 - (~(-(-((i93 ^ 77) | i95))))) - 1;
            p = i96 % 128;
            int i97 = i96 % 2;
            i16 = 0;
        }
        progressBar4.setVisibility(i16);
        int i98 = q;
        int i99 = i98 & 69;
        int i100 = (i98 | 69) & (~i99);
        int i101 = i99 << 1;
        int i102 = (i100 & i101) + (i100 | i101);
        p = i102 % 128;
        if (i102 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0070, code lost:
    
        if ((r6 % 2) == 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0076, code lost:
    
        if (r5.size() <= 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0078, code lost:
    
        r1 = ivas.gov.bisp.enumeration.spotCheckUser.ActivitySpotCheckUser.q;
        r6 = r1 ^ 71;
        r1 = -(-((r1 & 71) << 1));
        r7 = (r6 & r1) + (r1 | r6);
        ivas.gov.bisp.enumeration.spotCheckUser.ActivitySpotCheckUser.p = r7 % 128;
        r7 = r7 % 2;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x008f, code lost:
    
        if (r1 >= r5.size()) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0091, code lost:
    
        r6 = ivas.gov.bisp.enumeration.spotCheckUser.ActivitySpotCheckUser.q;
        r7 = (r6 ^ 17) + ((r6 & 17) << 1);
        ivas.gov.bisp.enumeration.spotCheckUser.ActivitySpotCheckUser.p = r7 % 128;
        r7 = r7 % 2;
        r6 = ivas.gov.bisp.enumeration.bK.ag.f(((ivas.gov.bisp.enumeration.models.Batch) r5.get(r1)).getSentToServerTimeStamp());
        r8 = ivas.gov.bisp.enumeration.spotCheckUser.ActivitySpotCheckUser.p;
        r9 = r8 & 39;
        r8 = (r8 | 39) & (~r9);
        r9 = -(-(r9 << 1));
        r10 = (r8 ^ r9) + ((r8 & r9) << 1);
        r8 = r10 % 128;
        ivas.gov.bisp.enumeration.spotCheckUser.ActivitySpotCheckUser.q = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00c1, code lost:
    
        if ((r10 % 2) == 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c7, code lost:
    
        if (r6 <= 144) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c9, code lost:
    
        r6 = r8 & 105;
        r6 = r6 + ((r8 ^ 105) | r6);
        ivas.gov.bisp.enumeration.spotCheckUser.ActivitySpotCheckUser.p = r6 % 128;
        r6 = r6 % 2;
        r6 = (ivas.gov.bisp.enumeration.models.Batch) r5.get(r1);
        r8 = ivas.gov.bisp.enumeration.spotCheckUser.ActivitySpotCheckUser.p;
        r10 = r8 & 25;
        r9 = ((r8 ^ 25) | r10) << 1;
        r8 = -((r8 | 25) & (~r10));
        r10 = (r9 & r8) + (r8 | r9);
        ivas.gov.bisp.enumeration.spotCheckUser.ActivitySpotCheckUser.q = r10 % 128;
        r10 = r10 % 2;
        r9 = new java.util.ArrayList(com.orm.SugarRecord.find(ivas.gov.bisp.enumeration.models.Survey.class, "batch_name=? and user_type != ?", r6.getName(), "5"));
        r7 = ivas.gov.bisp.enumeration.spotCheckUser.ActivitySpotCheckUser.q;
        r10 = ((((r7 ^ 105) | (r7 & 105)) << 1) - (~(-(((~r7) & 105) | (r7 & (-106)))))) - 1;
        r7 = r10 % 128;
        ivas.gov.bisp.enumeration.spotCheckUser.ActivitySpotCheckUser.p = r7;
        r10 = r10 % 2;
        r10 = (r7 ^ 9) + ((r7 & 9) << 1);
        ivas.gov.bisp.enumeration.spotCheckUser.ActivitySpotCheckUser.q = r10 % 128;
        r10 = r10 % 2;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0131, code lost:
    
        if (r7 >= r9.size()) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0133, code lost:
    
        r10 = ivas.gov.bisp.enumeration.spotCheckUser.ActivitySpotCheckUser.q;
        r11 = ((r10 | 113) << 1) - (r10 ^ 113);
        ivas.gov.bisp.enumeration.spotCheckUser.ActivitySpotCheckUser.p = r11 % 128;
        r11 = r11 % 2;
        r10 = new java.lang.String[2];
        r11 = (ivas.gov.bisp.enumeration.models.Survey) r9.get(r7);
        r12 = (-2) - ((ivas.gov.bisp.enumeration.spotCheckUser.ActivitySpotCheckUser.q + 52) ^ (-1));
        ivas.gov.bisp.enumeration.spotCheckUser.ActivitySpotCheckUser.p = r12 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0155, code lost:
    
        if ((r12 % 2) == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0157, code lost:
    
        r10[0] = r11.uniqueID;
        r10[1] = "5";
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0160, code lost:
    
        r10[0] = r11.uniqueID;
        r10[1] = "5";
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0167, code lost:
    
        com.orm.SugarRecord.deleteAll(ivas.gov.bisp.enumeration.models.Roster.class, "survey_uuid=? and survey_type != ?", r10);
        ((ivas.gov.bisp.enumeration.models.Survey) r9.get(r7)).delete();
        r10 = ivas.gov.bisp.enumeration.spotCheckUser.ActivitySpotCheckUser.q;
        r11 = r10 | 75;
        r12 = r11 << 1;
        r10 = -((~(r10 & 75)) & r11);
        r11 = (r12 & r10) + (r10 | r12);
        r10 = r11 % 128;
        ivas.gov.bisp.enumeration.spotCheckUser.ActivitySpotCheckUser.p = r10;
        r11 = r11 % 2;
        r11 = r7 ^ 1;
        r7 = ((r7 & 1) | r11) << 1;
        r11 = -r11;
        r7 = ((r7 & r11) << 1) + (r7 ^ r11);
        r10 = r10 + 7;
        ivas.gov.bisp.enumeration.spotCheckUser.ActivitySpotCheckUser.q = r10 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x019c, code lost:
    
        if ((r10 % 2) != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x019e, code lost:
    
        r10 = 2 / 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01a1, code lost:
    
        r6.delete();
        r6 = ivas.gov.bisp.enumeration.spotCheckUser.ActivitySpotCheckUser.p;
        r7 = ((r6 | 103) << 1) - (r6 ^ 103);
        ivas.gov.bisp.enumeration.spotCheckUser.ActivitySpotCheckUser.q = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x01b1, code lost:
    
        if ((r7 % 2) != 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x01b3, code lost:
    
        r6 = 2 / 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x01b5, code lost:
    
        r7 = r1 & 1;
        r1 = ((((r1 ^ 1) | r7) << 1) - (~(-((r1 | 1) & (~r7))))) - 1;
        r6 = ivas.gov.bisp.enumeration.spotCheckUser.ActivitySpotCheckUser.q;
        r7 = ((r6 ^ 104) + ((r6 & 104) << 1)) - 1;
        ivas.gov.bisp.enumeration.spotCheckUser.ActivitySpotCheckUser.p = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x01d4, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x01d5, code lost:
    
        r14.mRecyclerView.setHasFixedSize(true);
        r1 = new androidx.recyclerview.widget.GridLayoutManager((android.content.Context) r14, 2, 1, false);
        r14.mRecyclerView.n(new ivas.gov.bisp.enumeration.bK.H(2, 5, false));
        r5 = ivas.gov.bisp.enumeration.spotCheckUser.ActivitySpotCheckUser.q;
        r6 = r5 & 85;
        r5 = ((r5 | 85) & (~r6)) + (r6 << 1);
        ivas.gov.bisp.enumeration.spotCheckUser.ActivitySpotCheckUser.p = r5 % 128;
        r5 = r5 % 2;
        r14.mRecyclerView.setNestedScrollingEnabled(false);
        r14.mRecyclerView.setLayoutManager(r1);
        r4 = new ivas.gov.bisp.enumeration.adapters.AdapterMainMenu(new ivas.gov.bisp.enumeration.p043bp.C0203e(r14, 6), getResources().obtainTypedArray(ivas.gov.bisp.enumeration.R.array.spot_check_user_menu_items), getResources().obtainTypedArray(ivas.gov.bisp.enumeration.R.array.spot_check_user_menu_items_strings));
        r1 = ivas.gov.bisp.enumeration.spotCheckUser.ActivitySpotCheckUser.p;
        r3 = r1 | 11;
        r5 = r3 << 1;
        r1 = -((~(r1 & 11)) & r3);
        r3 = (r5 & r1) + (r1 | r5);
        ivas.gov.bisp.enumeration.spotCheckUser.ActivitySpotCheckUser.q = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0239, code lost:
    
        if ((r3 % 2) == 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x023b, code lost:
    
        r14.mRecyclerView.setAdapter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0240, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0241, code lost:
    
        r14.mRecyclerView.setAdapter(r4);
        r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0249, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x024a, code lost:
    
        r5.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x024d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x024e, code lost:
    
        r5 = ivas.gov.bisp.enumeration.p026az.C0104p.c();
        r8 = getResources().getString(ivas.gov.bisp.enumeration.R.string.time_mismatch);
        r9 = new ivas.gov.bisp.enumeration.bJ.bu(r14, 0);
        r1 = ivas.gov.bisp.enumeration.spotCheckUser.ActivitySpotCheckUser.q;
        r3 = r1 + 11;
        ivas.gov.bisp.enumeration.spotCheckUser.ActivitySpotCheckUser.p = r3 % 128;
        r3 = r3 % 2;
        r3 = (r1 & 47) + (r1 | 47);
        ivas.gov.bisp.enumeration.spotCheckUser.ActivitySpotCheckUser.p = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0278, code lost:
    
        if ((r3 % 2) != 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x027a, code lost:
    
        r5.e(r14, "Time mismatch", r8, r9, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x027e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x027f, code lost:
    
        r5.e(r14, "Time mismatch", r8, r9, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0283, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0044, code lost:
    
        if (ivas.gov.bisp.enumeration.bK.ag.h(r14) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004e, code lost:
    
        if (ivas.gov.bisp.enumeration.bK.ag.h(r14) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0050, code lost:
    
        r5 = new java.util.ArrayList(com.orm.SugarRecord.find(ivas.gov.bisp.enumeration.models.Batch.class, "is_sent=?", "1"));
        r1 = ivas.gov.bisp.enumeration.spotCheckUser.ActivitySpotCheckUser.p;
        r6 = ((r1 & 30) + (r1 | 30)) - 1;
        ivas.gov.bisp.enumeration.spotCheckUser.ActivitySpotCheckUser.q = r6 % 128;
     */
    @Override // ivas.gov.bisp.enumeration.BaseActivity, ivas.gov.bisp.enumeration.activitybase.BaseTouch, ivas.gov.bisp.enumeration.activitybase.BaseAuth
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void t() {
        /*
            Method dump skipped, instruction units count: 644
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.spotCheckUser.ActivitySpotCheckUser.t():void");
    }
}
