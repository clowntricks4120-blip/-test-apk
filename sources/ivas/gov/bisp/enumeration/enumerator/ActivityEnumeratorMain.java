package ivas.gov.bisp.enumeration.enumerator;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import ivas.gov.bisp.enumeration.ActivityBeginSurvey;
import ivas.gov.bisp.enumeration.BISPApplication;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.W.P;
import ivas.gov.bisp.enumeration.aA.aK;
import ivas.gov.bisp.enumeration.activity.TokenActivity;
import ivas.gov.bisp.enumeration.activitybase.BaseTouch;
import ivas.gov.bisp.enumeration.bK.ac;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.bK.ah;
import ivas.gov.bisp.enumeration.bK.ak;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.TabletLogEntity;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.lib_mobile;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.not_at_home;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.offline_survey_count;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.survey_count;
import ivas.gov.bisp.enumeration.p024ax.ax;
import ivas.gov.bisp.enumeration.p026az.C0104p;
import ivas.gov.bisp.enumeration.p042bo.j;
import ivas.gov.bisp.enumeration.p043bp.DialogInterfaceOnClickListenerC0204j;
import ivas.gov.bisp.enumeration.p043bp.am;
import ivas.gov.bisp.enumeration.p044bq.G;
import ivas.gov.bisp.enumeration.p044bq.w;
import ivas.gov.bisp.enumeration.p049bv.ViewOnClickListenerC0219p;
import ivas.gov.bisp.enumeration.p049bv.e;
import ivas.gov.bisp.enumeration.p049bv.i;
import ivas.gov.bisp.enumeration.p049bv.r;
import ivas.gov.bisp.enumeration.p049bv.t;
import ivas.gov.bisp.enumeration.p049bv.z;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import net.sqlcipher.BuildConfig;
import o.m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class ActivityEnumeratorMain extends BaseTouch implements P, aK.baV {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char a$s47$2127 = 0;
    public static ActivityEnumeratorMain ac = null;
    private static int b$s46$2127 = 0;
    private static long d$s45$2127 = 0;
    private static long d$s51$2024 = 0;
    private static int p = 0;
    private static int q = 1;

    @BindView
    public ImageView actionInfo;

    @BindView
    public ImageView actionLogout;

    @BindView
    public ImageView actionSync;
    public TextView ah;
    public ProgressDialog ai;
    public SessionManager aj;
    public AppDatabase ak;
    public ProgressBar al;
    public String am;

    @BindView
    public ProgressBar progressBarOfflineTotal;

    @BindView
    public ProgressBar progressBarTotal;

    @BindView
    public ProgressBar progressBarTotalOfflineSent;

    @BindView
    public ProgressBar progressBarTotalOfflineWaiting;

    @BindView
    public ProgressBar progressBarTotalSent;

    @BindView
    public ProgressBar progressBarTotalWaiting;

    @BindView
    public TextView textViewOfflineSent;

    @BindView
    public TextView textViewOfflineTotal;

    @BindView
    public TextView textViewOfflineWaiting;

    @BindView
    public TextView textViewSent;

    @BindView
    public TextView textViewTotal;

    @BindView
    public TextView textViewWaiting;

    @BindView
    public TextView tv_total_not_at_home;

    public class OooO00o implements DialogInterface.OnClickListener {
        private static int a = 0;
        private static int b = 1;

        public OooO00o() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            ActivityEnumeratorMain activityEnumeratorMain = ActivityEnumeratorMain.this;
            w wVar = new w(activityEnumeratorMain, activityEnumeratorMain.aj);
            int i3 = b;
            int i4 = (((i3 & (-86)) | ((~i3) & 85)) - (~((i3 & 85) << 1))) - 1;
            a = i4 % 128;
            if (i4 % 2 != 0) {
                wVar.execute(new Void[0]);
            } else {
                wVar.execute(new Void[0]);
            }
            dialogInterface.cancel();
        }
    }

    public class OooO0O0 extends AsyncTask<Void, Void, Void> {
        private static int a = 0;
        private static int b = 1;

        public OooO0O0() {
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ Void doInBackground(Void[] voidArr) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (-2) - ((i2 + 18) ^ (-1));
            b = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            int i4 = i2 + 91;
            b = i4 % 128;
            int i5 = i4 % 2;
            return null;
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 | 105) << 1;
            int i4 = -(i2 ^ 105);
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            b = i5 % 128;
            if (i5 % 2 == 0) {
                super.onPreExecute();
            } else {
                super.onPreExecute();
            }
            ActivityEnumeratorMain.w(ActivityEnumeratorMain.this, false);
            int i6 = a + 34;
            int i7 = (i6 ^ (-1)) + (i6 << 1);
            b = i7 % 128;
            int i8 = i7 % 2;
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Void r5) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 ^ 39) - (~((i2 & 39) << 1))) - 1;
            b = i3 % 128;
            int i4 = i3 % 2;
            super.onPostExecute(r5);
            ActivityEnumeratorMain.w(ActivityEnumeratorMain.this, true);
            ActivityEnumeratorMain activityEnumeratorMain = ActivityEnumeratorMain.this;
            Objects.requireNonNull(activityEnumeratorMain);
            G g = new G(activityEnumeratorMain, activityEnumeratorMain);
            int i5 = a;
            int i6 = (((i5 | 96) << 1) - (i5 ^ 96)) - 1;
            b = i6 % 128;
            int i7 = i6 % 2;
            g.execute(new Void[0]);
            int i8 = (-2) - ((a + 72) ^ (-1));
            b = i8 % 128;
            int i9 = i8 % 2;
        }
    }

    static {
        u();
        int i = p + 83;
        q = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    static void u() {
        d$s51$2024 = 1568154810293615322L;
        b$s46$2127 = 1174568310;
        d$s45$2127 = 408488695473298562L;
        a$s47$2127 = (char) 32118;
    }

    public static void w(ActivityEnumeratorMain activityEnumeratorMain, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        TextView textView = activityEnumeratorMain.textViewSent;
        if (z) {
            i = 0;
        } else {
            int i7 = p + 35;
            q = i7 % 128;
            int i8 = i7 % 2;
            i = 8;
        }
        textView.setVisibility(i);
        TextView textView2 = activityEnumeratorMain.textViewOfflineSent;
        if (z) {
            int i9 = p + 21;
            q = i9 % 128;
            int i10 = i9 % 2;
            i2 = 0;
        } else {
            i2 = 8;
        }
        textView2.setVisibility(i2);
        activityEnumeratorMain.textViewTotal.setVisibility(z ^ true ? 8 : 0);
        activityEnumeratorMain.textViewOfflineTotal.setVisibility(z ? 0 : 8);
        activityEnumeratorMain.textViewWaiting.setVisibility(z ? 0 : 8);
        TextView textView3 = activityEnumeratorMain.textViewOfflineWaiting;
        if (z) {
            int i11 = p + 57;
            q = i11 % 128;
            int i12 = i11 % 2;
            i3 = 0;
        } else {
            i3 = 8;
        }
        textView3.setVisibility(i3);
        activityEnumeratorMain.progressBarTotal.setVisibility(!z ? 0 : 8);
        activityEnumeratorMain.progressBarOfflineTotal.setVisibility(!z ? 0 : 8);
        activityEnumeratorMain.progressBarTotalWaiting.setVisibility(!z ? 0 : 8);
        ProgressBar progressBar = activityEnumeratorMain.progressBarTotalOfflineWaiting;
        if (z) {
            i4 = 8;
        } else {
            int i13 = p + 105;
            q = i13 % 128;
            int i14 = i13 % 2;
            i4 = 0;
        }
        progressBar.setVisibility(i4);
        ProgressBar progressBar2 = activityEnumeratorMain.progressBarTotalSent;
        if (z) {
            i5 = 8;
        } else {
            int i15 = q + 25;
            p = i15 % 128;
            int i16 = i15 % 2;
            i5 = 0;
        }
        progressBar2.setVisibility(i5);
        activityEnumeratorMain.progressBarTotalOfflineSent.setVisibility(z ? 8 : 0);
    }

    public void E() {
        int i = 2 % 2;
        b.aIz aiz = new b.aIz(this);
        AlertController.OooO0O0 oooO0O0 = aiz.a;
        Object[] objArr = new Object[1];
        b(ImageFormat.getBitsPerPixel(0) + 15494, new char[]{29741, 18590, 3335, 49538, 34307, 23176, 7950, 54269, 36883, 21675, 10556, 60832, 41520, 26330}, objArr);
        oooO0O0.e = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(Drawable.resolveOpacity(0, 0) - 26462666, new char[]{41460, 41584, 37444, 62762}, (char) ((-1) - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0')), new char[]{13983, 27702, 42238, 31915}, new char[]{6422, 61481, 38287, 24111, 9382, 60676, 6148, 30499, 36708, 65503, 46288, 28655, 4021, 22031, 57904, 31235, 9292, 38852, 9023, 57546, 52670, 24323, 23319, 30612, 63557, 40294, 15024, 49121, 33279, 36238, 26302, 44735, 42730, 44285, 35109}, objArr2);
        oooO0O0.f = ((String) objArr2[0]).intern();
        oooO0O0.k = true;
        OooO00o oooO00o = new OooO00o();
        Object[] objArr3 = new Object[1];
        a(1305871136 - Gravity.getAbsoluteGravity(0, 0), new char[]{41460, 41584, 37444, 62762}, (char) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 4), new char[]{8247, 54787, 45645, 61463}, new char[]{31500, 14212, 46997, 15895, 28789, 2254, 21250}, objArr3);
        oooO0O0.h = ((String) objArr3[0]).intern();
        oooO0O0.i = oooO00o;
        aiz.b().show();
        int i2 = q + 73;
        p = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        C0104p c0104pC = C0104p.c();
        Object[] objArr = new Object[1];
        a(639691336 - Color.argb(0, 0, 0, 0), new char[]{41460, 41584, 37444, 62762}, (char) (TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0) + 9205), new char[]{18548, 8426, 62758, 10531}, new char[]{37555, 5826, 28467, 37743, 43799, 34149, 44493, 64436, 21416, 1303, 14675, 4172, 63542}, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        b(35129 - View.MeasureSpec.getMode(0), new char[]{29759, 64821, 26217, 61429, 20707, 55820, 17245, 46289, 15813, 42762, 10294, 37224, 6898, 33762, 62735, 32348, 59342, 26816, 53789, 23339, 52350, 13811, 48876, 8206, 43270, 4746, 39884, 3348, 30262, 65323, 24740, 59889, 21307, 50183, 19853, 46789, 14346, 41263, 10849, 37810, 1271, 36395, 63309, 30850, 57820, 27460}, objArr2);
        c0104pC.h(this, strIntern, ((String) objArr2[0]).intern(), new DialogInterfaceOnClickListenerC0204j(this, 3), null, false);
        int i2 = p + 33;
        q = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseTouch, ivas.gov.bisp.enumeration.activitybase.BaseAuth, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = q + 119;
        p = i2 % 128;
        if (i2 % 2 != 0) {
            super.onDestroy();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        super.onDestroy();
        int i3 = q + 81;
        p = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int i = 2 % 2;
        int i2 = p + 85;
        q = i2 % 128;
        if (i2 % 2 == 0) {
            menuItem.getItemId();
            super.onOptionsItemSelected(menuItem);
            throw null;
        }
        menuItem.getItemId();
        boolean zOnOptionsItemSelected = super.onOptionsItemSelected(menuItem);
        int i3 = q + 41;
        p = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 35 / 0;
        }
        return zOnOptionsItemSelected;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = p + 65;
        q = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = p + 45;
        q = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public int p() {
        int i = 2 % 2;
        int i2 = q + 73;
        p = i2 % 128;
        if (i2 % 2 == 0) {
            return R.layout.activity_main_enum;
        }
        int i3 = 73 / 0;
        return R.layout.activity_main_enum;
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        int i = 2 % 2;
        int i2 = p + 107;
        q = i2 % 128;
        if (i2 % 2 != 0) {
            getMenuInflater().inflate(R.menu.menu_main, menu);
            return super.onCreateOptionsMenu(menu);
        }
        getMenuInflater().inflate(R.menu.menu_main, menu);
        super.onCreateOptionsMenu(menu);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        if ((r1 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        r1 = ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase.l(getApplicationContext()).m().ab();
        r3 = 54 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
    
        if (r1 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        r1 = ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase.l(getApplicationContext()).m().ab();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (r1 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        if (r1.isEmpty() != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        r3 = ivas.gov.bisp.enumeration.enumerator.ActivityEnumeratorMain.p + 67;
        ivas.gov.bisp.enumeration.enumerator.ActivityEnumeratorMain.q = r3 % 128;
        r3 = r3 % 2;
        C(0, r1, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0067, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
    
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new ivas.gov.bisp.enumeration.p042bo.j(r10, r11, r0));
        r11 = ivas.gov.bisp.enumeration.enumerator.ActivityEnumeratorMain.q + 79;
        ivas.gov.bisp.enumeration.enumerator.ActivityEnumeratorMain.p = r11 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0082, code lost:
    
        if ((r11 % 2) == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0084, code lost:
    
        r11 = 90 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0087, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0088, code lost:
    
        r11.setEnabled(true);
        r1 = new java.lang.Object[1];
        a(getPackageName().codePointAt(7) + 1332563880, new char[]{41460, 41584, 37444, 62762}, (char) (getApplicationInfo().targetSdkVersion + 38334), new char[]{7755, 27984, 56655, 40085}, new char[]{17779, 35512, 23343, 23451, 46660}, r1);
        r1 = ((java.lang.String) r1[0]).intern();
        r11 = new java.lang.Object[1];
        a(android.view.MotionEvent.axisFromString(net.sqlcipher.BuildConfig.FLAVOR) + 1, new char[]{41460, 41584, 37444, 62762}, (char) (android.graphics.Color.green(0) + 6650), new char[]{18286, 42591, 64166, 29465}, new char[]{59696, 11375, 5756, 60406, 10307, 45652, 50553, 6597, 29468, 60634, 50245, 23918, 52609, 38889, 6853, 60677, 55661, 11228, 28409, 22570, 54285, 789, 55947, 36137, 44306, 52949}, r11);
        ivas.gov.bisp.enumeration.p024ax.ax.g(r10, r1, ((java.lang.String) r11[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00f5, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (ivas.gov.bisp.enumeration.p024ax.ax.c(r10) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        if (ivas.gov.bisp.enumeration.p024ax.ax.c(r10) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        r1 = ivas.gov.bisp.enumeration.enumerator.ActivityEnumeratorMain.p + 63;
        ivas.gov.bisp.enumeration.enumerator.ActivityEnumeratorMain.q = r1 % 128;
     */
    @butterknife.OnClick
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void syncAllData(android.view.View r11) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.enumerator.ActivityEnumeratorMain.syncAllData(android.view.View):void");
    }

    public final void C(int i, List<TabletLogEntity> list, View view) {
        int i2 = 2;
        int i3 = 2 % 2;
        int i4 = i;
        while (i4 < list.size()) {
            TabletLogEntity tabletLogEntity = list.get(i4);
            String str = tabletLogEntity.tabletLogJson;
            if (str != null) {
                int i5 = p + 11;
                q = i5 % 128;
                if (i5 % i2 != 0) {
                    if (str.trim().isEmpty()) {
                    }
                    JSONObject jSONObject = new JSONObject(tabletLogEntity.tabletLogJson);
                    Object[] objArr = new Object[1];
                    b(getPackageName().codePointAt(15) + 20829, new char[]{29708, 9680, 55195, 33135, 13117, 60647, 40664, 18578, 64072, 37929, 17886, 63406, 41369}, objArr);
                    String strOptString = jSONObject.optString(((String) objArr[0]).intern(), BuildConfig.FLAVOR);
                    String strY = this.aj.y();
                    JSONObject jSONObject2 = new JSONObject();
                    Object[] objArr2 = new Object[1];
                    a((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 2073697179, new char[]{41460, 41584, 37444, 62762}, (char) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 4), new char[]{40128, 39451, 42619, 57129}, new char[]{65308, 33427, 15554, 41233, 11008, 58352, 55089, 55919, 2322, 62807, 3300}, objArr2);
                    jSONObject2.put(((String) objArr2[0]).intern(), tabletLogEntity.tabletLogJson);
                    Object[] objArr3 = new Object[1];
                    b(getPackageName().length() + 20914, new char[]{29708, 9680, 55195, 33135, 13117, 60647, 40664, 18578, 64072, 37929, 17886, 63406, 41369}, objArr3);
                    jSONObject2.put(((String) objArr3[0]).intern(), strOptString);
                    Object[] objArr4 = new Object[1];
                    a(getApplicationInfo().targetSdkVersion - 31, new char[]{41460, 41584, 37444, 62762}, (char) (getPackageName().length() + 41407), new char[]{46197, 62454, 55452, 23713}, new char[]{16589, 41080, 35311, 18667, 10472, 15749}, objArr4);
                    jSONObject2.put(((String) objArr4[0]).intern(), strY);
                    JSONObject jSONObject3 = new JSONObject();
                    String strD = ivas.gov.bisp.enumeration.bK.b.d(jSONObject2.toString(), ivas.gov.bisp.enumeration.bK.b.b(this.aj.k()), ivas.gov.bisp.enumeration.bK.b.b(this.aj.m()));
                    Object[] objArr5 = new Object[1];
                    b(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 24843, new char[]{29709, 5381, 46610, 22330, 61484, 37202, 12821}, objArr5);
                    jSONObject3.put(((String) objArr5[0]).intern(), strD);
                    byte[] bArrB = ivas.gov.bisp.enumeration.bK.b.b(this.aj.k());
                    byte[] bArrB2 = ivas.gov.bisp.enumeration.bK.b.b(this.aj.m());
                    Object[] objArr6 = new Object[1];
                    b(getApplicationInfo().targetSdkVersion + 7962, new char[]{29738, 27430, 19054, 10681, 2303, 59415, 53094, 44688, 36306, 27917, 19493, 9025, 701, 57852}, objArr6);
                    String strD2 = ivas.gov.bisp.enumeration.bK.b.d(((String) objArr6[0]).intern(), bArrB, bArrB2);
                    Object[] objArr7 = new Object[1];
                    b(getPackageName().codePointAt(7) + 34795, new char[]{29709, 64619, 25806, 60724, 21908, 56828, 17930}, objArr7);
                    jSONObject3.put(((String) objArr7[0]).intern(), strD2);
                    r rVar = new r(this, tabletLogEntity.id, i4, list, view);
                    Object[] objArr8 = new Object[1];
                    b(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) + 16103, new char[]{29718, 19201, 2588, 51503, 34849, 20339, 3603, 52508, 35915, 17272, 636, 49510, 32926, 18324, 1687, 50608, 33967, 23477, 6856, 55681, 39104, 24560, 7935, 56819, 40280, 23562, 4879, 53793, 37220, 20529, 5983, 54788, 38271, 21605, 11105, 60112, 43424, 26758, 12207, 61095, 44451, 27855, 9119, 58053, 41408, 24795, 10194, 59137, 42554, 25872, 9313, 64317, 47626, 31061, 14461, 65358, 48678, 32073}, objArr8);
                    ax.e(jSONObject3, this, ((String) objArr8[0]).intern(), rVar);
                    return;
                }
                int i6 = 18 / 0;
                if (str.trim().isEmpty()) {
                }
                try {
                    JSONObject jSONObject4 = new JSONObject(tabletLogEntity.tabletLogJson);
                    Object[] objArr9 = new Object[1];
                    b(getPackageName().codePointAt(15) + 20829, new char[]{29708, 9680, 55195, 33135, 13117, 60647, 40664, 18578, 64072, 37929, 17886, 63406, 41369}, objArr9);
                    String strOptString2 = jSONObject4.optString(((String) objArr9[0]).intern(), BuildConfig.FLAVOR);
                    String strY2 = this.aj.y();
                    JSONObject jSONObject5 = new JSONObject();
                    Object[] objArr10 = new Object[1];
                    a((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 2073697179, new char[]{41460, 41584, 37444, 62762}, (char) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 4), new char[]{40128, 39451, 42619, 57129}, new char[]{65308, 33427, 15554, 41233, 11008, 58352, 55089, 55919, 2322, 62807, 3300}, objArr10);
                    jSONObject5.put(((String) objArr10[0]).intern(), tabletLogEntity.tabletLogJson);
                    Object[] objArr11 = new Object[1];
                    b(getPackageName().length() + 20914, new char[]{29708, 9680, 55195, 33135, 13117, 60647, 40664, 18578, 64072, 37929, 17886, 63406, 41369}, objArr11);
                    jSONObject5.put(((String) objArr11[0]).intern(), strOptString2);
                    Object[] objArr12 = new Object[1];
                    a(getApplicationInfo().targetSdkVersion - 31, new char[]{41460, 41584, 37444, 62762}, (char) (getPackageName().length() + 41407), new char[]{46197, 62454, 55452, 23713}, new char[]{16589, 41080, 35311, 18667, 10472, 15749}, objArr12);
                    jSONObject5.put(((String) objArr12[0]).intern(), strY2);
                    JSONObject jSONObject6 = new JSONObject();
                    String strD3 = ivas.gov.bisp.enumeration.bK.b.d(jSONObject5.toString(), ivas.gov.bisp.enumeration.bK.b.b(this.aj.k()), ivas.gov.bisp.enumeration.bK.b.b(this.aj.m()));
                    Object[] objArr13 = new Object[1];
                    b(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 24843, new char[]{29709, 5381, 46610, 22330, 61484, 37202, 12821}, objArr13);
                    jSONObject6.put(((String) objArr13[0]).intern(), strD3);
                    byte[] bArrB3 = ivas.gov.bisp.enumeration.bK.b.b(this.aj.k());
                    byte[] bArrB4 = ivas.gov.bisp.enumeration.bK.b.b(this.aj.m());
                    Object[] objArr14 = new Object[1];
                    b(getApplicationInfo().targetSdkVersion + 7962, new char[]{29738, 27430, 19054, 10681, 2303, 59415, 53094, 44688, 36306, 27917, 19493, 9025, 701, 57852}, objArr14);
                    String strD4 = ivas.gov.bisp.enumeration.bK.b.d(((String) objArr14[0]).intern(), bArrB3, bArrB4);
                    Object[] objArr15 = new Object[1];
                    b(getPackageName().codePointAt(7) + 34795, new char[]{29709, 64619, 25806, 60724, 21908, 56828, 17930}, objArr15);
                    jSONObject6.put(((String) objArr15[0]).intern(), strD4);
                    r rVar2 = new r(this, tabletLogEntity.id, i4, list, view);
                    Object[] objArr16 = new Object[1];
                    b(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) + 16103, new char[]{29718, 19201, 2588, 51503, 34849, 20339, 3603, 52508, 35915, 17272, 636, 49510, 32926, 18324, 1687, 50608, 33967, 23477, 6856, 55681, 39104, 24560, 7935, 56819, 40280, 23562, 4879, 53793, 37220, 20529, 5983, 54788, 38271, 21605, 11105, 60112, 43424, 26758, 12207, 61095, 44451, 27855, 9119, 58053, 41408, 24795, 10194, 59137, 42554, 25872, 9313, 64317, 47626, 31061, 14461, 65358, 48678, 32073}, objArr16);
                    ax.e(jSONObject6, this, ((String) objArr16[0]).intern(), rVar2);
                    return;
                } catch (JSONException unused) {
                    i4++;
                    i2 = 2;
                }
            }
            i4++;
            int i7 = q + 87;
            p = i7 % 128;
            int i8 = i7 % 2;
            i2 = 2;
        }
        new Handler(Looper.getMainLooper()).post(new j(this, view, i2));
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseTouch, ivas.gov.bisp.enumeration.activitybase.BaseAuth, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        int i = 2 % 2;
        super.onResume();
        BISPApplication.d = null;
        new ivas.gov.bisp.enumeration.bK.w(this);
        new G(this, this).execute(new Void[0]);
        new G(this, this).execute(new Void[0]);
        if (ac.l()) {
            ak.f(new ivas.gov.bisp.enumeration.p049bv.P(this));
            new OooO0O0().execute(new Void[0]);
            int i2 = q + 47;
            p = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            return;
        }
        C0104p c0104pC = C0104p.c();
        Object[] objArr = new Object[1];
        b(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 44805, new char[]{29737, 56086, 10782, 30987, 51251, 7997, 28207}, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        b(getApplicationInfo().targetSdkVersion + 16792, new char[]{29751, 13735, 63331, 45358, 29380, 15499, 65117, 47132, 31151, 15220, 58678, 42711, 24778, 8774, 60424, 44456, 28540, 10552, 60103, 38030, 22034, 4124, 53682, 37742, 23871, 7885, 55433, 39505, 17430, 1440, 50978, 33143, 17102, 3205, 52821, 34842, 18865, 2920, 46452, 30460, 12426, 62036, 48153, 32173, 16170, 63788, 47859, 25746, 9820, 57433, 41380, 25454, 11556, 61172, 43143, 27210, 5206, 54706, 38780, 20796, 4840, 56452, 40523, 22546, 6558, 56168, 34110, 18175, 194, 49759, 35857, 19916, 3954, 51504, 35562, 13463, 62986, 45057, 29140, 13154, 64878, 48888, 30864, 14939, 58398, 42452, 26471, 8494, 58082, 44168, 28231, 10269, 59802, 43876, 21794, 5875, 53502, 37466, 23561, 7637, 57185, 39277, 23285, 1208, 50759, 32792, 16854}, objArr2);
        c0104pC.e(this, strIntern, ((String) objArr2[0]).intern(), new am(this, 4), false);
        int i3 = q + 31;
        p = i3 % 128;
        int i4 = i3 % 2;
    }

    @OnClick
    public void beginSurvey(View view) {
        int i = 2 % 2;
        int i2 = q + 61;
        p = i2 % 128;
        if (i2 % 2 == 0 ? this.aj.l().intValue() == 2 : this.aj.l().intValue() == 3) {
            D();
            BISPApplication.c().H(false);
            ag.g = false;
            F();
            return;
        }
        if (this.aj.l().intValue() == 3) {
            D();
            return;
        }
        if (this.aj.l().intValue() == 1) {
            BISPApplication.c().H(true);
            startActivity(new Intent(this, (Class<?>) TokenActivity.class));
            int i3 = q + 103;
            p = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        ActivityEnumeratorMain activityEnumeratorMain = ac;
        StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w(BuildConfig.FLAVOR);
        sbW.append(this.aj.l());
        Object[] objArr = new Object[1];
        a((-1520242474) - (ViewConfiguration.getKeyRepeatTimeout() >> 16), new char[]{41460, 41584, 37444, 62762}, (char) (TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0) + 1), new char[]{54975, 25328, 34213, 40612}, new char[]{56483, 35903, 45604, 42220, 51791, 20316, 43848, 6872, 61612}, objArr);
        ax.g(activityEnumeratorMain, ((String) objArr[0]).intern(), sbW.toString());
    }

    public static void v(ActivityEnumeratorMain activityEnumeratorMain, JSONArray jSONArray) {
        int i = 2 % 2;
        Objects.requireNonNull(activityEnumeratorMain);
        try {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                Object[] objArr = new Object[1];
                b(Color.argb(0, 0, 0, 0) + 42061, new char[]{29710, 53313, 15489, 39167, 58659, 16775}, objArr);
                String strOptString = jSONObject.optString(((String) objArr[0]).intern(), BuildConfig.FLAVOR);
                Object[] objArr2 = new Object[1];
                a(TextUtils.getTrimmedLength(BuildConfig.FLAVOR), new char[]{41460, 41584, 37444, 62762}, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), new char[]{13135, 60579, 7958, 48829}, new char[]{34800, 48142, 46925, 42796, 63534, 2396, 25990, 37566}, objArr2);
                String strOptString2 = jSONObject.optString(((String) objArr2[0]).intern(), BuildConfig.FLAVOR);
                Object[] objArr3 = new Object[1];
                b(8623 - Color.argb(0, 0, 0, 0), new char[]{29713, 21921, 14149, 4353, 62115, 56417, 48651, 40901, 31045, 23350, 9420, 1694}, objArr3);
                int iOptDouble = (int) jSONObject.optDouble(((String) objArr3[0]).intern(), 0.0d);
                Object[] objArr4 = new Object[1];
                b((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 17417, new char[]{29719, 12307, 64525, 47121, 25663}, objArr4);
                arrayList.add(new lib_mobile(strOptString, strOptString2, iOptDouble, jSONObject.optString(((String) objArr4[0]).intern(), BuildConfig.FLAVOR)));
            }
            long[] jArrAv = activityEnumeratorMain.ak.m().av(arrayList);
            if (jArrAv.length <= 0) {
                Object[] objArr5 = new Object[1];
                a((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), new char[]{41460, 41584, 37444, 62762}, (char) (AndroidCharacter.getMirror('0') + 16953), new char[]{7905, 61080, 26951, 20034}, new char[]{3164, 42267, 62263, 30341, 62559, 28235, 20123, 12413, 39862, 21920, 3188, 39273, 12978, 11252, 54853, 49943}, objArr5);
                Toast.makeText(activityEnumeratorMain, ((String) objArr5[0]).intern(), 0).show();
                return;
            }
            StringBuilder sb = new StringBuilder();
            Object[] objArr6 = new Object[1];
            a((-1256459696) - (ViewConfiguration.getScrollBarSize() >> 8), new char[]{41460, 41584, 37444, 62762}, (char) (13131 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0')), new char[]{20700, 7154, 19637, 42803}, new char[]{58770, 19884, 32055, 65150, 56820, 54851, 18116, 16584, 9754, 41177, 2696, 6920, 7655, 4288, 20431, 50605, 12928, 26732, 22286}, objArr6);
            sb.append(((String) objArr6[0]).intern());
            sb.append(jArrAv.length);
            Toast.makeText(activityEnumeratorMain, sb.toString(), 0).show();
            int i3 = q + 25;
            p = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 79 / 0;
            }
        } catch (Exception unused) {
            Object[] objArr7 = new Object[1];
            a((-16777216) - Color.rgb(0, 0, 0), new char[]{41460, 41584, 37444, 62762}, (char) ((-1) - ImageFormat.getBitsPerPixel(0)), new char[]{25973, 46866, 54455, 64606}, new char[]{54688, 46694, 12445, 52126, 28123, 2761, 43608, 58843, 16179, 15355, 33233, 30471, 59030, 12585, 28361, 59743, 53535, 12178, 38362, 32840, 35941, 47426}, objArr7);
            Toast.makeText(activityEnumeratorMain, ((String) objArr7[0]).intern(), 0).show();
        }
    }

    public final void F() {
        int i = 2 % 2;
        if (!ak.g(this)) {
            Context applicationContext = getApplicationContext();
            Object[] objArr = new Object[1];
            a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 4, new char[]{41460, 41584, 37444, 62762}, (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 52627), new char[]{2421, 22958, 37811, 50637}, new char[]{56840, 43537, 62101, 24465, 44822, 36573, 64171, 63732, 63586, 49914, 28463, 29980, 20978, 38238, 44366, 51699, 4784, 23686, 19311, 63471, 26573, 19175, 26219, 15394, 37144, 5795, 22569, 23603, 49469, 28229, 61838, 28032, 28795, 38225, 53703, 45898, 8176, 3792, 55162, 53868, 1488, 64666, 19430, 22837, 39280, 43260, 14024, 21225, 6007, 31373, 54269, 19795, 47687, 39553}, objArr);
            Toast.makeText(applicationContext, ((String) objArr[0]).intern(), 1).show();
            return;
        }
        int i2 = q + 59;
        p = i2 % 128;
        int i3 = i2 % 2;
        SharedPreferences sharedPreferences = ah.c.d;
        Object[] objArr2 = new Object[1];
        b((Process.myPid() >> 22) + 44129, new char[]{29723, 55409, 11465, 28976, 50597, 10728, 32333, 49835, 5888, 31602, 53197, 7178, 24734, 46330, 6493, 28088, 45594}, objArr2);
        if (sharedPreferences.getInt(((String) objArr2[0]).intern(), 100) <= 0) {
            Context applicationContext2 = getApplicationContext();
            Object[] objArr3 = new Object[1];
            b(48479 - (ViewConfiguration.getEdgeSlop() >> 16), new char[]{29747, 51520, 3768, 19466, 33135, 50896, 1065, 22983, 40693, 56412, 4538, 22301, 37999, 59860, 12140, 27779, 41447, 59228, 9401, 31239, 48946, 64711, 12849, 30614, 46325, 2641, 20413, 36127, 49716, 1949, 17679, 39558, 57328, 7458, 21184, 38900, 54603, 10929, 26636, 44327, 58069, 8252, 26008, 47854, 63576, 15803, 29445, 45180, 62913, 19235, 35024, 52711, 861, 16629, 34308, 56165, 6361, 24122, 37789, 53502, 5726}, objArr3);
            Toast.makeText(applicationContext2, ((String) objArr3[0]).intern(), 1).show();
            return;
        }
        Objects.requireNonNull((BISPApplication) getApplicationContext());
        BISPApplication.f = false;
        BISPApplication.c().H(false);
        startActivity(new Intent(this, (Class<?>) ActivityBeginSurvey.class));
        finish();
        int i4 = q + 101;
        p = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final void D() {
        int i = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            Object[] objArr = new Object[1];
            b(26227 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR), new char[]{29754, 4716, 47340, 18246}, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1, new char[]{41460, 41584, 37444, 62762}, (char) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) + 52186), new char[]{41908, 55238, 65209, 49099}, new char[]{50775, 1904, 53949, 29703, 8115, 21380, 9663, 18902, 13018, 30085, 43369, 7382, 18345, 45631, 60763, 41215, 12466, 14991, 25851, 13343, 55274, 16201, 50170, 23435, 13579, 3691}, objArr2);
            jSONObject.put(strIntern, ((String) objArr2[0]).intern());
            String strD = ivas.gov.bisp.enumeration.bK.b.d(jSONObject.toString(), ivas.gov.bisp.enumeration.bK.b.b(this.aj.k()), ivas.gov.bisp.enumeration.bK.b.b(this.aj.m()));
            Object[] objArr3 = new Object[1];
            b(getPackageName().codePointAt(17) + 24738, new char[]{29709, 5381, 46610, 22330, 61484, 37202, 12821}, objArr3);
            jSONObject2.put(((String) objArr3[0]).intern(), strD);
            byte[] bArrB = ivas.gov.bisp.enumeration.bK.b.b(this.aj.k());
            byte[] bArrB2 = ivas.gov.bisp.enumeration.bK.b.b(this.aj.m());
            Object[] objArr4 = new Object[1];
            b((ViewConfiguration.getScrollDefaultDelay() >> 16) + 34913, new char[]{29709, 64619, 25806, 60724, 21908, 56828, 17930}, objArr4);
            String strIntern2 = ((String) objArr4[0]).intern();
            Object[] objArr5 = new Object[1];
            a(Drawable.resolveOpacity(0, 0) - 1501808121, new char[]{41460, 41584, 37444, 62762}, (char) (getPackageName().codePointAt(19) + 14861), new char[]{1803, 31802, 32678, 63034}, new char[]{19426, 54286, 52860, 52891, 41153, 27668, 6812, 54129, 21326, 28055, 37338, 51771, 25984, 723, 14234}, objArr5);
            jSONObject2.put(strIntern2, ivas.gov.bisp.enumeration.bK.b.d(((String) objArr5[0]).intern(), bArrB, bArrB2));
            ProgressDialog progressDialog = this.ai;
            Object[] objArr6 = new Object[1];
            a(getPackageName().length() - 25, new char[]{41460, 41584, 37444, 62762}, (char) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(0) + 56299), new char[]{30169, 29927, 4308, 63964}, new char[]{40057, 49248, 45657, 59672, 13439, 27923, 35653, 11286, 12820, 11865, 9276, 44648, 56311, 52330}, objArr6);
            ax.h(progressDialog, ((String) objArr6[0]).intern());
            z zVar = new z(this);
            Object[] objArr7 = new Object[1];
            a(getPackageName().length() - 25, new char[]{41460, 41584, 37444, 62762}, (char) (12697 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), new char[]{37363, 29842, 39280, 62769}, new char[]{11322, 20887, 1360, 30713, 65150, 51601, 57171, 57931, 7483, 6420, 33326, 25638, 21071, 55269, '[', 52121, 55995, 35859, 7009, 56971, 17828, 15246, 23032, 40179, 21791, 17597, 19398, 1610, 28612, 2190, 41088, 15319, 1441, 3820, 11113, 57786, 50059, 53814, 50517, 60331, 57555, 5331, 50081, 12565, 33399, 35892, 18770, 25598, 55373, 42705, 56355, 49510, 22180, 17113, 59878, 54803, 7899, 41962}, objArr7);
            ax.e(jSONObject2, this, ((String) objArr7[0]).intern(), zVar);
            int i2 = p + 105;
            q = i2 % 128;
            int i3 = i2 % 2;
        } catch (JSONException unused) {
        }
    }

    @Override // ivas.gov.bisp.enumeration.W.P
    public void n(ArrayList<not_at_home> arrayList, ArrayList<survey_count> arrayList2, ArrayList<offline_survey_count> arrayList3) {
        int i = 2 % 2;
        Object[] objArr = new Object[1];
        b(getApplicationInfo().targetSdkVersion + 24192, new char[]{29774}, objArr);
        String strIntern = ((String) objArr[0]).intern();
        if (arrayList.size() > 0) {
            int i2 = q + 65;
            p = i2 % 128;
            int i3 = i2 % 2;
            TextView textView = this.tv_total_not_at_home;
            StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w(BuildConfig.FLAVOR);
            sbW.append(arrayList.size());
            textView.setText(sbW.toString());
            int i4 = q + 119;
            p = i4 % 128;
            int i5 = i4 % 2;
        } else {
            this.tv_total_not_at_home.setText(strIntern);
        }
        if (arrayList2.size() > 0) {
            int i6 = p + 125;
            q = i6 % 128;
            int i7 = i6 % 2;
            if (arrayList2.get(0).not_sync_count < 0) {
                this.textViewWaiting.setText(strIntern);
                TextView textView2 = this.textViewTotal;
                StringBuilder sb = new StringBuilder();
                sb.append(arrayList2.get(0).sync_count);
                textView2.setText(sb.toString());
                TextView textView3 = this.textViewSent;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(arrayList2.get(0).sync_count);
                textView3.setText(sb2.toString());
            } else {
                TextView textView4 = this.textViewTotal;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(arrayList2.get(0).sync_count + arrayList2.get(0).not_sync_count);
                textView4.setText(sb3.toString());
                TextView textView5 = this.textViewSent;
                StringBuilder sb4 = new StringBuilder();
                sb4.append(arrayList2.get(0).sync_count);
                textView5.setText(sb4.toString());
                TextView textView6 = this.textViewWaiting;
                StringBuilder sb5 = new StringBuilder();
                sb5.append(arrayList2.get(0).not_sync_count);
                textView6.setText(sb5.toString());
            }
        } else {
            this.textViewTotal.setText(strIntern);
            this.textViewSent.setText(strIntern);
            this.textViewWaiting.setText(strIntern);
        }
        if (arrayList3.size() <= 0) {
            this.textViewOfflineTotal.setText(strIntern);
            this.textViewOfflineSent.setText(strIntern);
            this.textViewOfflineWaiting.setText(strIntern);
            return;
        }
        if (arrayList3.get(0).not_sync_count < 0) {
            this.textViewOfflineWaiting.setText(strIntern);
            TextView textView7 = this.textViewOfflineTotal;
            StringBuilder sb6 = new StringBuilder();
            sb6.append(arrayList3.get(0).sync_count);
            textView7.setText(sb6.toString());
            TextView textView8 = this.textViewOfflineSent;
            StringBuilder sb7 = new StringBuilder();
            sb7.append(arrayList3.get(0).sync_count);
            textView8.setText(sb7.toString());
            return;
        }
        TextView textView9 = this.textViewOfflineTotal;
        StringBuilder sb8 = new StringBuilder();
        sb8.append(arrayList3.get(0).sync_count + arrayList3.get(0).not_sync_count);
        textView9.setText(sb8.toString());
        TextView textView10 = this.textViewOfflineSent;
        StringBuilder sb9 = new StringBuilder();
        sb9.append(arrayList3.get(0).sync_count);
        textView10.setText(sb9.toString());
        TextView textView11 = this.textViewOfflineWaiting;
        StringBuilder sb10 = new StringBuilder();
        sb10.append(arrayList3.get(0).not_sync_count);
        textView11.setText(sb10.toString());
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseTouch, ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public void t() {
        String string;
        int i = 2 % 2;
        super.t();
        Object[] objArr = new Object[1];
        a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 4, new char[]{41460, 41584, 37444, 62762}, (char) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) + 56416), new char[]{48033, 17755, 37182, 54492}, new char[]{16369, 8330, 48246, 8447, 28965, 42961}, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        b((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 33161, new char[]{29709, 62866, 30488, 61601, 29243, 62375, 32041}, objArr2);
        Log.e(strIntern, ((String) objArr2[0]).intern());
        BISPApplication.d = null;
        new ivas.gov.bisp.enumeration.bK.w(this);
        this.ak = AppDatabase.l(this);
        this.ah = (TextView) findViewById(R.id.tv_heading);
        this.al = (ProgressBar) findViewById(R.id.progress_loading);
        ac = this;
        TextView textView = this.ah;
        StringBuilder sb = new StringBuilder();
        sb.append(getResources().getString(R.string.app_name));
        Object[] objArr3 = new Object[1];
        b(4703 - (ViewConfiguration.getScrollDefaultDelay() >> 16), new char[]{29790, 26205, 20704, 17190, 15724, 12240, 6697, 62594, 59124, 53576, 50108, 48644, 43128}, objArr3);
        sb.append(((String) objArr3[0]).intern());
        textView.setText(sb.toString());
        TextView textView2 = (TextView) findViewById(R.id.application_version_textView);
        Object[] objArr4 = new Object[1];
        b(getApplicationInfo().targetSdkVersion + 24982, new char[]{29704, 5628, 46906, 20823, 62090, 40159, 15884, 57284, 31104, 7014, 42309, 18099, 57395, 33406, 9144, 52651, 28481, 2317, 43748, 13347, 54890, 30613, 4550}, objArr4);
        textView2.setText(((String) objArr4[0]).intern());
        ((LinearLayout) findViewById(R.id.open_support_app)).setOnClickListener(new t(this));
        Map<Class<?>, Constructor<? extends Unbinder>> map = ButterKnife.a;
        ButterKnife.c(this, getWindow().getDecorView());
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.ai = progressDialog;
        progressDialog.setCancelable(false);
        TextView textView3 = (TextView) findViewById(R.id.tv_sync_time);
        SessionManager sessionManager = this.aj;
        if (sessionManager != null) {
            int i2 = q + 79;
            p = i2 % 128;
            if (i2 % 2 != 0) {
                SharedPreferences sharedPreferences = sessionManager.c;
                Object[] objArr5 = new Object[1];
                b(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(1, 3).codePointAt(3) * 30396, new char[]{29717, 27048, 20248, 11411, 517, 59296, 50481, 47791, 38997, 32240, 21328, 12532, 5759, 3054}, objArr5);
                string = sharedPreferences.getString(((String) objArr5[0]).intern(), BuildConfig.FLAVOR);
            } else {
                SharedPreferences sharedPreferences2 = sessionManager.c;
                Object[] objArr6 = new Object[1];
                b(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(3) + 7446, new char[]{29717, 27048, 20248, 11411, 517, 59296, 50481, 47791, 38997, 32240, 21328, 12532, 5759, 3054}, objArr6);
                string = sharedPreferences2.getString(((String) objArr6[0]).intern(), BuildConfig.FLAVOR);
            }
        } else {
            SessionManager sessionManager2 = new SessionManager(this);
            this.aj = sessionManager2;
            SharedPreferences sharedPreferences3 = sessionManager2.c;
            Object[] objArr7 = new Object[1];
            b(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) + 7512, new char[]{29717, 27048, 20248, 11411, 517, 59296, 50481, 47791, 38997, 32240, 21328, 12532, 5759, 3054}, objArr7);
            String string2 = sharedPreferences3.getString(((String) objArr7[0]).intern(), BuildConfig.FLAVOR);
            int i3 = q + 13;
            p = i3 % 128;
            int i4 = i3 % 2;
            string = string2;
        }
        textView3.setText(string);
        SessionManager sessionManager3 = new SessionManager(this);
        this.aj = sessionManager3;
        ah ahVar = ah.c;
        int i5 = Integer.parseInt(sessionManager3.y());
        SharedPreferences.Editor editor = ahVar.e;
        Object[] objArr8 = new Object[1];
        b(getPackageName().codePointAt(20) + 16176, new char[]{29707, 19356, 2873, 51903, 35429, 18882, 2428}, objArr8);
        editor.putInt(((String) objArr8[0]).intern(), i5);
        ahVar.e.commit();
        this.actionLogout.setOnClickListener(new e(this));
        this.actionInfo.setOnClickListener(new i(this));
        this.actionSync.setOnClickListener(new ViewOnClickListenerC0219p(this));
    }

    private static void b(int i, char[] cArr, Object[] objArr) {
        int i2;
        int i3 = 2 % 2;
        m mVar = new m();
        mVar.d = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        mVar.e = 0;
        while (mVar.e < cArr.length) {
            int i4 = $11 + 125;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                jArr[mVar.e] = (((long) cArr[mVar.e]) % (((long) mVar.e) / ((long) mVar.d))) % (6031393033645231780L & d$s51$2024);
                i2 = mVar.e >> 1;
            } else {
                jArr[mVar.e] = (6031393033645231780L ^ d$s51$2024) ^ (((long) cArr[mVar.e]) ^ (((long) mVar.e) * ((long) mVar.d)));
                i2 = mVar.e + 1;
            }
            mVar.e = i2;
        }
        char[] cArr2 = new char[length];
        mVar.e = 0;
        while (mVar.e < cArr.length) {
            int i5 = $10 + 121;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            cArr2[mVar.e] = (char) jArr[mVar.e];
            mVar.e++;
            int i7 = $11 + 93;
            $10 = i7 % 128;
            int i8 = i7 % 2;
        }
        objArr[0] = new String(cArr2);
    }

    private static void a(int i, char[] cArr, char c, char[] cArr2, char[] cArr3, Object[] objArr) {
        int i2 = 2 % 2;
        o.j jVar = new o.j();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        jVar.a = 0;
        while (jVar.a < length3) {
            int i3 = $10 + 41;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = (jVar.a + 2) % 4;
            int i6 = (jVar.a + 3) % 4;
            jVar.e = (char) (((cArr4[jVar.a % 4] * 32718) + cArr5[i5]) % 65535);
            cArr5[i6] = (char) (((cArr4[i6] * 32718) + cArr5[i5]) / 65535);
            cArr4[i6] = jVar.e;
            cArr6[jVar.a] = (char) (((((long) (cArr4[i6] ^ cArr3[jVar.a])) ^ (d$s45$2127 ^ (-1116422076781920906L))) ^ ((long) ((int) (((long) b$s46$2127) ^ (-1116422076781920906L))))) ^ ((long) ((char) (((long) a$s47$2127) ^ (-1116422076781920906L)))));
            jVar.a++;
            int i7 = $11 + 41;
            $10 = i7 % 128;
            int i8 = i7 % 2;
        }
        objArr[0] = new String(cArr6);
    }
}
