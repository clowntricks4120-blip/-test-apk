package ivas.gov.bisp.enumeration.activity.nadra;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.CountDownTimer;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import androidx.recyclerview.widget.RecyclerView;
import ivas.gov.bisp.enumeration.ActivityBeginSurvey;
import ivas.gov.bisp.enumeration.BISPApplication;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.activity.DashboardActivity;
import ivas.gov.bisp.enumeration.activity.TokenActivity;
import ivas.gov.bisp.enumeration.activitybase.BaseTouch;
import ivas.gov.bisp.enumeration.bK.ac;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.bK.ah;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase;
import ivas.gov.bisp.enumeration.models.NADRARosterItem;
import ivas.gov.bisp.enumeration.models.Roster;
import ivas.gov.bisp.enumeration.p024ax.ax;
import ivas.gov.bisp.enumeration.p038bk.bt;
import ivas.gov.bisp.enumeration.p042bo.c;
import ivas.gov.bisp.enumeration.p042bo.h;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.util.ArrayList;
import java.util.List;
import net.sqlcipher.BuildConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class NewFormNadraRoster extends BaseTouch {
    public static final /* synthetic */ int ac = 0;
    private static int p = 0;
    private static int q = 1;
    public ImageView ae;
    public TextView af;
    public bt ag;
    public List<NADRARosterItem> ah;
    public TextView ai;
    public RecyclerView aj;
    public ArrayList<Roster> ak;
    public SessionManager am;
    public CountDownTimer an;
    public AppDatabase aq;
    public String ar;
    public ProgressDialog as;
    public String ad = NewFormNadraRoster.class.getName();
    public int al = 0;
    public boolean ao = false;
    public boolean ap = false;

    public class OooO0o implements DialogInterface.OnClickListener {
        private static int a = 0;
        private static int b = 1;

        public OooO0o() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            NewFormNadraRoster newFormNadraRoster = NewFormNadraRoster.this;
            Intent intent = new Intent(NewFormNadraRoster.this, (Class<?>) DashboardActivity.class);
            int i3 = b + 48;
            int i4 = (i3 ^ (-1)) + (i3 << 1);
            a = i4 % 128;
            int i5 = i4 % 2;
            newFormNadraRoster.startActivity(intent);
            NewFormNadraRoster.this.finish();
            dialogInterface.cancel();
            int i6 = b;
            int i7 = (i6 & 125) + (i6 | 125);
            a = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    public class OooOO0O implements DialogInterface.OnClickListener {
        private static int a = 1;
        private static int b;

        public OooOO0O(NewFormNadraRoster newFormNadraRoster) {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = ((i3 & 67) - (~(i3 | 67))) - 1;
            a = i4 % 128;
            if (i4 % 2 != 0) {
                dialogInterface.cancel();
            } else {
                dialogInterface.cancel();
                throw null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003b  */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        int i2 = p;
        int i3 = ((i2 ^ 122) + ((i2 & 122) << 1)) - 1;
        q = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!this.ap) {
            Toast.makeText(getApplicationContext(), "You can not go back until timer will complete.", 1).show();
            int i4 = q + 25;
            p = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        List<NADRARosterItem> list = this.ah;
        if (list != null) {
            int i6 = i2 + 110;
            int i7 = (i6 ^ (-1)) + (i6 << 1);
            q = i7 % 128;
            if (i7 % 2 == 0) {
                int size = list.size();
                int i8 = 37 / 0;
                if (size <= 0) {
                    int i9 = p;
                    int i10 = (i9 & (-66)) | ((~i9) & 65);
                    int i11 = (i9 & 65) << 1;
                    int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
                    q = i12 % 128;
                    int i13 = i12 % 2;
                    ag.f = BuildConfig.FLAVOR;
                    int i14 = q;
                    int i15 = i14 ^ 125;
                    int i16 = (i14 & 125) << 1;
                    int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
                    p = i17 % 128;
                    int i18 = i17 % 2;
                }
            } else if (list.size() <= 0) {
                int i19 = p;
                int i110 = (i19 & (-66)) | ((~i19) & 65);
                int i111 = (i19 & 65) << 1;
                int i112 = (i110 ^ i111) + ((i111 & i110) << 1);
                q = i112 % 128;
                int i113 = i112 % 2;
                ag.f = BuildConfig.FLAVOR;
                int i114 = q;
                int i115 = i114 ^ 125;
                int i116 = (i114 & 125) << 1;
                int i117 = ((i115 | i116) << 1) - (i116 ^ i115);
                p = i117 % 128;
                int i118 = i117 % 2;
            }
        }
        Intent intent = new Intent();
        ArrayList<Roster> arrayList = this.ak;
        int i20 = p;
        int i21 = ((i20 ^ 19) | (i20 & 19)) << 1;
        int i22 = -(((~i20) & 19) | (i20 & (-20)));
        int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
        q = i23 % 128;
        if (i23 % 2 == 0) {
            intent.putExtra("roster", arrayList);
            setResult(-1, intent);
            finish();
            int i24 = 39 / 0;
        } else {
            intent.putExtra("roster", arrayList);
            setResult(-1, intent);
            finish();
        }
        int i25 = q;
        int i26 = i25 & 121;
        int i27 = ((i25 ^ 121) | i26) << 1;
        int i28 = -((i25 | 121) & (~i26));
        int i29 = (i27 & i28) + (i28 | i27);
        p = i29 % 128;
        int i30 = i29 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public int p() {
        int i = 2 % 2;
        int i2 = q + 31;
        int i3 = i2 % 128;
        p = i3;
        int i4 = i2 % 2;
        int i5 = i3 ^ 119;
        int i6 = (i3 & 119) << 1;
        int i7 = (i5 & i6) + (i5 | i6);
        q = i7 % 128;
        if (i7 % 2 != 0) {
            return R.layout.activity_nadra_roster_list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public class OooO implements DialogInterface.OnClickListener {
        private static int a = 1;
        private static int b;

        public OooO() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            NewFormNadraRoster newFormNadraRoster = NewFormNadraRoster.this;
            Intent intent = new Intent(NewFormNadraRoster.this, (Class<?>) TokenActivity.class);
            int i3 = a;
            int i4 = i3 & 9;
            int i5 = (((i3 | 9) & (~i4)) - (~(i4 << 1))) - 1;
            b = i5 % 128;
            int i6 = i5 % 2;
            newFormNadraRoster.startActivity(intent);
            NewFormNadraRoster.this.finish();
            int i7 = a;
            int i8 = i7 & 7;
            int i9 = i7 | 7;
            int i10 = (i8 & i9) + (i9 | i8);
            b = i10 % 128;
            if (i10 % 2 == 0) {
                dialogInterface.cancel();
                return;
            }
            dialogInterface.cancel();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public class OooO0O0 implements DialogInterface.OnClickListener {
        private static int a = 1;
        private static int b;

        public OooO0O0() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            ag.f = BuildConfig.FLAVOR;
            Intent intent = new Intent();
            NewFormNadraRoster newFormNadraRoster = NewFormNadraRoster.this;
            int i3 = a + 41;
            b = i3 % 128;
            int i4 = i3 % 2;
            intent.putExtra("roster", newFormNadraRoster.ak);
            NewFormNadraRoster newFormNadraRoster2 = NewFormNadraRoster.this;
            int i5 = b;
            int i6 = ((i5 ^ 123) | (i5 & 123)) << 1;
            int i7 = -(((~i5) & 123) | (i5 & (-124)));
            int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
            a = i8 % 128;
            int i9 = i8 % 2;
            newFormNadraRoster2.setResult(-1, intent);
            NewFormNadraRoster.this.finish();
            dialogInterface.cancel();
            int i10 = b;
            int i11 = i10 ^ 89;
            int i12 = (((i10 & 89) | i11) << 1) - i11;
            a = i12 % 128;
            int i13 = i12 % 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0033 A[PHI: r1
  0x0033: PHI (r1v9 android.os.CountDownTimer) = (r1v8 android.os.CountDownTimer), (r1v17 android.os.CountDownTimer) binds: [B:8:0x0031, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // ivas.gov.bisp.enumeration.activitybase.BaseTouch, ivas.gov.bisp.enumeration.activitybase.BaseAuth, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        CountDownTimer countDownTimer;
        int i = 2 % 2;
        int i2 = q;
        int i3 = ((i2 ^ 33) | (i2 & 33)) << 1;
        int i4 = -(((~i2) & 33) | (i2 & (-34)));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        p = i5 % 128;
        if (i5 % 2 != 0) {
            super.onDestroy();
            countDownTimer = this.an;
            int i6 = 10 / 0;
            if (countDownTimer != null) {
                int i7 = q;
                int i8 = i7 & 11;
                int i9 = i8 + ((i7 ^ 11) | i8);
                p = i9 % 128;
                int i10 = i9 % 2;
                countDownTimer.cancel();
                int i11 = q;
                int i12 = (i11 ^ 125) + ((i11 & 125) << 1);
                p = i12 % 128;
                int i13 = i12 % 2;
            }
        } else {
            super.onDestroy();
            countDownTimer = this.an;
            if (countDownTimer != null) {
                int i14 = q;
                int i15 = i14 & 11;
                int i16 = i15 + ((i14 ^ 11) | i15);
                p = i16 % 128;
                int i17 = i16 % 2;
                countDownTimer.cancel();
                int i18 = q;
                int i19 = (i18 ^ 125) + ((i18 & 125) << 1);
                p = i19 % 128;
                int i110 = i19 % 2;
            }
        }
        int i20 = q;
        int i21 = ((i20 | 87) << 1) - (i20 ^ 87);
        p = i21 % 128;
        int i22 = i21 % 2;
    }

    public class OooO00o extends CountDownTimer {
        private static int a = 1;
        private static int b;

        public OooO00o(long j, long j2) {
            super(j, j2);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 99;
            int i4 = (i3 - (~((i2 ^ 99) | i3))) - 1;
            b = i4 % 128;
            int i5 = i4 % 2;
            try {
                TextView textView = NewFormNadraRoster.this.ai;
                int i6 = b;
                int i7 = i6 & 47;
                int i8 = -(-((i6 ^ 47) | i7));
                int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
                a = i9 % 128;
                int i10 = i9 % 2;
                textView.setVisibility(8);
                TextView textView2 = NewFormNadraRoster.this.af;
                int i11 = a;
                int i12 = i11 & 101;
                int i13 = (((i11 | 101) & (~i12)) - (~(i12 << 1))) - 1;
                b = i13 % 128;
                if (i13 % 2 != 0) {
                    textView2.setEnabled(false);
                    NewFormNadraRoster.this.ap = false;
                } else {
                    textView2.setEnabled(true);
                    NewFormNadraRoster.this.ap = true;
                }
            } catch (Exception unused) {
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            String string;
            int i = 2 % 2;
            try {
                TextView textView = NewFormNadraRoster.this.ai;
                StringBuilder sb = new StringBuilder();
                int i2 = a;
                int i3 = i2 & 15;
                int i4 = (i2 | 15) & (~i3);
                int i5 = -(-(i3 << 1));
                int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
                b = i6 % 128;
                if (i6 % 2 != 0) {
                    sb.append("Time Remaining : ");
                    int i7 = 41 / 0;
                } else {
                    sb.append("Time Remaining : ");
                }
                int i8 = b;
                int i9 = i8 ^ 37;
                int i10 = -(-((i8 & 37) << 1));
                int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
                a = i11 % 128;
                if (i11 % 2 == 0) {
                    sb.append((int) (j * 1000));
                    string = sb.toString();
                } else {
                    sb.append((int) (j / 1000));
                    string = sb.toString();
                }
                textView.setText(string);
                TextView textView2 = NewFormNadraRoster.this.ai;
                int i12 = b;
                int i13 = (i12 ^ 105) + ((i12 & 105) << 1);
                a = i13 % 128;
                int i14 = i13 % 2;
                textView2.setVisibility(0);
                NewFormNadraRoster newFormNadraRoster = NewFormNadraRoster.this;
                int i15 = a;
                int i16 = i15 ^ 55;
                int i17 = (((i15 & 55) | i16) << 1) - i16;
                b = i17 % 128;
                int i18 = i17 % 2;
                newFormNadraRoster.af.setEnabled(false);
                NewFormNadraRoster newFormNadraRoster2 = NewFormNadraRoster.this;
                int i19 = b + 7;
                a = i19 % 128;
                if (i19 % 2 == 0) {
                    newFormNadraRoster2.ao = true;
                } else {
                    newFormNadraRoster2.ao = true;
                }
            } catch (Exception unused) {
            }
        }
    }

    public class OooO0OO implements DialogInterface.OnClickListener {
        private static int a = 0;
        private static int b = 1;

        public OooO0OO() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            ag.f = BuildConfig.FLAVOR;
            Intent intent = new Intent();
            int i3 = a + 11;
            b = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                ArrayList<Roster> arrayList = NewFormNadraRoster.this.ak;
                obj.hashCode();
                throw null;
            }
            ArrayList<Roster> arrayList2 = NewFormNadraRoster.this.ak;
            int i4 = a;
            int i5 = ((i4 ^ 13) | (i4 & 13)) << 1;
            int i6 = -(((~i4) & 13) | (i4 & (-14)));
            int i7 = (i5 & i6) + (i6 | i5);
            b = i7 % 128;
            if (i7 % 2 == 0) {
                intent.putExtra("roster", arrayList2);
                NewFormNadraRoster.this.setResult(-1, intent);
                obj.hashCode();
                throw null;
            }
            intent.putExtra("roster", arrayList2);
            NewFormNadraRoster.this.setResult(-1, intent);
            NewFormNadraRoster.this.finish();
            dialogInterface.cancel();
            int i8 = b + 83;
            a = i8 % 128;
            int i9 = i8 % 2;
        }
    }

    public final void x(String str, String str2) {
        int i = 2 % 2;
        b.aIz aiz = new b.aIz(this);
        AlertController.OooO0O0 oooO0O0 = aiz.a;
        int i2 = p;
        int i3 = (i2 ^ 41) + ((i2 & 41) << 1);
        q = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            oooO0O0.e = str;
            oooO0O0.f = str2;
            obj.hashCode();
            throw null;
        }
        oooO0O0.e = str;
        oooO0O0.f = str2;
        oooO0O0.k = true;
        OooOO0 oooOO0 = new OooOO0();
        int i4 = p;
        int i5 = (i4 & 64) + (i4 | 64);
        int i6 = (i5 ^ (-1)) + (i5 << 1);
        q = i6 % 128;
        int i7 = i6 % 2;
        oooO0O0.h = "Retry";
        oooO0O0.i = oooOO0;
        OooOO0O oooOO0O = new OooOO0O(this);
        int i8 = p;
        int i9 = i8 & 63;
        int i10 = -(-(i8 | 63));
        int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
        q = i11 % 128;
        if (i11 % 2 == 0) {
            oooO0O0.a = "Cancel";
            obj.hashCode();
            throw null;
        }
        oooO0O0.a = "Cancel";
        oooO0O0.j = oooOO0O;
        aiz.b().show();
        int i12 = q;
        int i13 = (-2) - (((i12 & 28) + (i12 | 28)) ^ (-1));
        p = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 47 / 0;
        }
    }

    public class OooOO0 implements DialogInterface.OnClickListener {
        private static int a = 0;
        private static int b = 1;

        public OooOO0() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            int i3 = b + 23;
            a = i3 % 128;
            int i4 = i3 % 2;
            if (NewFormNadraRoster.this.as.isShowing()) {
                int i5 = a;
                int i6 = i5 ^ 49;
                int i7 = (i5 & 49) << 1;
                int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
                b = i8 % 128;
                if (i8 % 2 == 0) {
                    NewFormNadraRoster.this.as.dismiss();
                    int i9 = 85 / 0;
                } else {
                    NewFormNadraRoster.this.as.dismiss();
                }
            }
            dialogInterface.cancel();
            NewFormNadraRoster newFormNadraRoster = NewFormNadraRoster.this;
            String str = newFormNadraRoster.ar;
            int i10 = b;
            int i11 = ((i10 | 109) << 1) - (i10 ^ 109);
            a = i11 % 128;
            if (i11 % 2 != 0) {
                newFormNadraRoster.u(str);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            newFormNadraRoster.u(str);
            int i12 = b;
            int i13 = i12 & 73;
            int i14 = (((i12 ^ 73) | i13) << 1) - ((i12 | 73) & (~i13));
            a = i14 % 128;
            int i15 = i14 % 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:30:0x00e0 A[Catch: JSONException -> 0x01b4, TRY_ENTER, TRY_LEAVE, TryCatch #2 {JSONException -> 0x01b4, blocks: (B:4:0x0026, B:7:0x0041, B:10:0x0060, B:12:0x007e, B:16:0x009c, B:21:0x00b4, B:26:0x00c6, B:30:0x00e0, B:34:0x0109, B:36:0x011f, B:38:0x013b, B:40:0x0150, B:43:0x0173, B:48:0x018e, B:49:0x0191, B:50:0x0194, B:24:0x00bd, B:32:0x00ef, B:53:0x0197, B:54:0x019f, B:57:0x01a2, B:58:0x01ab, B:61:0x01ae, B:62:0x01b1), top: B:70:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00ef A[Catch: JSONException -> 0x01b4, TRY_ENTER, TRY_LEAVE, TryCatch #2 {JSONException -> 0x01b4, blocks: (B:4:0x0026, B:7:0x0041, B:10:0x0060, B:12:0x007e, B:16:0x009c, B:21:0x00b4, B:26:0x00c6, B:30:0x00e0, B:34:0x0109, B:36:0x011f, B:38:0x013b, B:40:0x0150, B:43:0x0173, B:48:0x018e, B:49:0x0191, B:50:0x0194, B:24:0x00bd, B:32:0x00ef, B:53:0x0197, B:54:0x019f, B:57:0x01a2, B:58:0x01ab, B:61:0x01ae, B:62:0x01b1), top: B:70:0x0024 }] */
    public final void u(String str) {
        int i = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        int i2 = q;
        int i3 = (((i2 & (-110)) | ((~i2) & 109)) - (~((i2 & 109) << 1))) - 1;
        p = i3 % 128;
        Object obj = null;
        try {
            if (i3 % 2 != 0) {
                jSONObject.put("Cnic", str);
                try {
                    throw null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            jSONObject.put("Cnic", str);
            int i4 = q;
            int i5 = i4 ^ 79;
            int i6 = ((i4 & 79) | i5) << 1;
            int i7 = -i5;
            int i8 = (i6 & i7) + (i6 | i7);
            p = i8 % 128;
            if (i8 % 2 != 0) {
                jSONObject.put("HHId", BuildConfig.FLAVOR);
                String str2 = BISPApplication.c().s;
                try {
                    throw null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            jSONObject.put("HHId", BuildConfig.FLAVOR);
            jSONObject.put("SessionId", BISPApplication.c().s);
            String strH = ac.h(true);
            int i9 = q + 23;
            p = i9 % 128;
            if (i9 % 2 != 0) {
                jSONObject.put("IpAddress", strH);
                this.am.r();
                try {
                    throw null;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            jSONObject.put("IpAddress", strH);
            String strR = this.am.r();
            int i10 = q;
            int i11 = i10 ^ 59;
            int i12 = -(-((i10 & 59) << 1));
            int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
            p = i13 % 128;
            int i14 = i13 % 2;
            jSONObject.put("sessionUserCnic", strR);
            if (this.am.s() != 2) {
                int i15 = p;
                int i16 = ((i15 | 51) << 1) - (((~i15) & 51) | (i15 & (-52)));
                q = i16 % 128;
                int i17 = i16 % 2;
                if (this.am.s() != 3) {
                    int i18 = q;
                    int i19 = (i18 ^ 21) + ((i18 & 21) << 1);
                    p = i19 % 128;
                    if (i19 % 2 != 0) {
                        if (this.am.s() != 3) {
                            if (this.am.s() == 6) {
                                int i20 = q;
                                int i21 = i20 ^ 45;
                                int i22 = (i20 & 45) << 1;
                                int i23 = (i21 & i22) + (i22 | i21);
                                p = i23 % 128;
                                int i24 = i23 % 2;
                            } else {
                                jSONObject.put("Type", "new");
                                int i25 = q + 33;
                                p = i25 % 128;
                                int i26 = i25 % 2;
                            }
                        }
                    } else if (this.am.s() != 5) {
                        if (this.am.s() == 6) {
                            int i27 = q;
                            int i28 = i27 ^ 45;
                            int i29 = (i27 & 45) << 1;
                            int i210 = (i28 & i29) + (i29 | i28);
                            p = i210 % 128;
                            int i211 = i210 % 2;
                        } else {
                            jSONObject.put("Type", "new");
                            int i212 = q + 33;
                            p = i212 % 128;
                            int i213 = i212 % 2;
                        }
                    }
                    jSONObject.put("Type", "resurvey");
                    int i30 = p;
                    int i31 = i30 & 87;
                    int i32 = ((((i30 ^ 87) | i31) << 1) - (~(-((i30 | 87) & (~i31))))) - 1;
                    q = i32 % 128;
                    int i33 = i32 % 2;
                } else {
                    jSONObject.put("Type", "resurvey");
                    int i34 = p;
                    int i35 = i34 & 87;
                    int i36 = ((((i34 ^ 87) | i35) << 1) - (~(-((i34 | 87) & (~i35))))) - 1;
                    q = i36 % 128;
                    int i37 = i36 % 2;
                }
            } else {
                jSONObject.put("Type", "resurvey");
                int i38 = p;
                int i39 = i38 & 87;
                int i310 = ((((i38 ^ 87) | i39) << 1) - (~(-((i38 | 87) & (~i39))))) - 1;
                q = i310 % 128;
                int i311 = i310 % 2;
            }
            String string = jSONObject.toString();
            String strK = this.am.k();
            int i40 = q;
            int i41 = (i40 & 99) + (i40 | 99);
            p = i41 % 128;
            int i42 = i41 % 2;
            byte[] bArrB = ivas.gov.bisp.enumeration.bK.b.b(strK);
            String strM = this.am.m();
            int i43 = q;
            int i44 = i43 & 29;
            int i45 = -(-((i43 ^ 29) | i44));
            int i46 = (i44 & i45) + (i45 | i44);
            p = i46 % 128;
            int i47 = i46 % 2;
            String strD = ivas.gov.bisp.enumeration.bK.b.d(string, bArrB, ivas.gov.bisp.enumeration.bK.b.b(strM));
            int i48 = p;
            int i49 = ((i48 | 57) << 1) - (i48 ^ 57);
            q = i49 % 128;
            int i50 = i49 % 2;
            jSONObject2.put("string1", strD);
            ax.h(this.as, "Please wait!");
            h hVar = new h(this);
            int i51 = p;
            int i52 = ((i51 ^ 60) + ((i51 & 60) << 1)) - 1;
            q = i52 % 128;
            if (i52 % 2 == 0) {
                ax.e(jSONObject2, this, "https://meladeskapp.bisp.gov.pk/api/Roster/V8MVu3ODp1hu5Dw3DWwA", hVar);
                try {
                    obj.hashCode();
                    throw null;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            ax.e(jSONObject2, this, "https://meladeskapp.bisp.gov.pk/api/Roster/V8MVu3ODp1hu5Dw3DWwA", hVar);
            int i53 = q;
            int i54 = ((i53 & (-10)) | ((~i53) & 9)) + ((i53 & 9) << 1);
            p = i54 % 128;
            if (i54 % 2 != 0) {
                int i55 = 37 / 0;
            }
        } catch (JSONException unused) {
        }
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseTouch, ivas.gov.bisp.enumeration.activitybase.BaseAuth, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        int i = 2 % 2;
        int i2 = q;
        int i3 = (i2 | 87) << 1;
        int i4 = -(i2 ^ 87);
        int i5 = (i3 & i4) + (i4 | i3);
        p = i5 % 128;
        int i6 = i5 % 2;
        super.onResume();
        if (!this.ao) {
            int i7 = p;
            int i8 = ((i7 & (-92)) | ((~i7) & 91)) + ((i7 & 91) << 1);
            q = i8 % 128;
            int i9 = i8 % 2;
            if (ah.c.d.getInt("IsTimeableScreen", 1) == 1) {
                int i10 = p;
                int i11 = i10 & 109;
                int i12 = (i10 | 109) & (~i11);
                int i13 = i11 << 1;
                int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
                q = i14 % 128;
                int i15 = i14 % 2;
                OooO00o oooO00o = new OooO00o(ah.c.d.getInt("hh_composition_time", 0) * 1000, 1000L);
                int i16 = q;
                int i17 = i16 & 59;
                int i18 = -(-((i16 ^ 59) | i17));
                int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
                p = i19 % 128;
                int i20 = i19 % 2;
                this.an = oooO00o.start();
                int i21 = q;
                int i22 = i21 & 83;
                int i23 = (i21 | 83) & (~i22);
                int i24 = i22 << 1;
                int i25 = (i23 ^ i24) + ((i23 & i24) << 1);
                p = i25 % 128;
                int i26 = i25 % 2;
                return;
            }
        }
        this.ai.setVisibility(8);
        TextView textView = this.af;
        int i27 = p;
        int i28 = (i27 & 15) + (i27 | 15);
        q = i28 % 128;
        int i29 = i28 % 2;
        textView.setEnabled(true);
        this.ap = true;
        int i30 = q;
        int i31 = (i30 ^ 9) + ((i30 & 9) << 1);
        p = i31 % 128;
        int i32 = i31 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseTouch, ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public void t() {
        SessionManager sessionManager;
        String strC;
        int i = 2 % 2;
        super.t();
        new ActivityBeginSurvey();
        this.as = new ProgressDialog(this);
        this.am = new SessionManager(this);
        int i2 = q;
        int i3 = (i2 ^ 17) + ((i2 & 17) << 1);
        p = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            this.aq = AppDatabase.l(this);
            getIntent();
            throw null;
        }
        this.aq = AppDatabase.l(this);
        Intent intent = getIntent();
        int i4 = q;
        int i5 = (i4 & 31) + (i4 | 31);
        p = i5 % 128;
        if (i5 % 2 != 0) {
            this.ar = intent.getStringExtra("cnic");
            obj.hashCode();
            throw null;
        }
        this.ar = intent.getStringExtra("cnic");
        int i6 = p;
        int i7 = (((i6 ^ 113) | (i6 & 113)) << 1) - (((~i6) & 113) | (i6 & (-114)));
        q = i7 % 128;
        if (i7 % 2 == 0) {
            this.ak = (ArrayList) getIntent().getSerializableExtra("roster_list");
            throw null;
        }
        this.ak = (ArrayList) getIntent().getSerializableExtra("roster_list");
        this.al = 0;
        int i8 = q;
        int i9 = i8 & 85;
        int i10 = -(-((i8 ^ 85) | i9));
        int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
        p = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 5 % 5;
        }
        int i13 = 0;
        while (i13 < this.ak.size()) {
            int i14 = p;
            int i15 = i14 & 75;
            int i16 = (i14 | 75) & (~i15);
            int i17 = i15 << 1;
            int i18 = (i16 & i17) + (i16 | i17);
            q = i18 % 128;
            int i19 = i18 % 2;
            Roster roster = this.ak.get(i13);
            int i20 = p + 91;
            q = i20 % 128;
            if (i20 % 2 == 0) {
                byte[] bArr = roster.bioImage;
                obj.hashCode();
                throw null;
            }
            if (roster.bioImage != null) {
                int i21 = this.al;
                int i22 = i21 & 1;
                int i23 = (i21 ^ 1) | i22;
                this.al = (i22 & i23) + (i23 | i22);
                int i24 = q;
                int i25 = i24 & 77;
                int i26 = (i24 ^ 77) | i25;
                int i27 = (i25 & i26) + (i26 | i25);
                p = i27 % 128;
                if (i27 % 2 != 0) {
                    int i28 = 3 % 2;
                }
            }
            int i29 = ((i13 | 115) << 1) - (i13 ^ 115);
            i13 = ((i29 | (-114)) << 1) - (i29 ^ (-114));
            int i30 = q;
            int i31 = ((i30 & 95) - (~(i30 | 95))) - 1;
            p = i31 % 128;
            int i32 = i31 % 2;
        }
        getIntent().getBooleanExtra("is_edit", false);
        int i33 = q + 9;
        p = i33 % 128;
        if (i33 % 2 != 0) {
            ((TextView) findViewById(R.id.application_version_textView)).setText("v7.6 (LIVE)");
            int i34 = 31 / 0;
        } else {
            ((TextView) findViewById(R.id.application_version_textView)).setText("v7.6 (LIVE)");
        }
        int i35 = q + 1;
        p = i35 % 128;
        int i36 = i35 % 2;
        this.ai = (TextView) findViewById(R.id.tv_time_remaining);
        int i37 = q;
        int i38 = (i37 & 7) + (i37 | 7);
        p = i38 % 128;
        int i39 = i38 % 2;
        this.ae = (ImageView) findViewById(R.id.iv_back);
        int i40 = q;
        int i41 = (i40 ^ 109) + ((i40 & 109) << 1);
        p = i41 % 128;
        int i42 = i41 % 2;
        this.af = (TextView) findViewById(R.id.tv_add);
        int i43 = p;
        int i44 = i43 ^ 61;
        int i45 = ((i43 & 61) | i44) << 1;
        int i46 = -i44;
        int i47 = ((i45 | i46) << 1) - (i45 ^ i46);
        q = i47 % 128;
        int i48 = i47 % 2;
        this.aj = (RecyclerView) findViewById(R.id.recycler_view);
        ImageView imageView = this.ae;
        int i49 = q;
        int i50 = i49 & 21;
        int i51 = (i49 | 21) & (~i50);
        int i52 = -(-(i50 << 1));
        int i53 = (i51 & i52) + (i51 | i52);
        p = i53 % 128;
        if (i53 % 2 != 0) {
            imageView.setOnClickListener(this);
            this.af.setOnClickListener(this);
            sessionManager = this.am;
            int i54 = 81 / 0;
        } else {
            imageView.setOnClickListener(this);
            this.af.setOnClickListener(this);
            sessionManager = this.am;
        }
        if (sessionManager.k().length() <= 0) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            int i55 = q;
            int i56 = i55 ^ 37;
            int i57 = ((i55 & 37) | i56) << 1;
            int i58 = -i56;
            int i59 = (i57 ^ i58) + ((i57 & i58) << 1);
            p = i59 % 128;
            if (i59 % 2 != 0) {
                builder.setTitle("Session Expire");
                builder.setMessage("Session Expire Please Login Again.!");
                throw null;
            }
            builder.setTitle("Session Expire");
            builder.setMessage("Session Expire Please Login Again.!");
            int i60 = p;
            int i61 = (((i60 | 96) << 1) - (i60 ^ 96)) - 1;
            q = i61 % 128;
            int i62 = i61 % 2;
            builder.setCancelable(true);
            builder.setPositiveButton("Confirm", new c(this));
            int i63 = q;
            int i64 = i63 & 5;
            int i65 = ((5 | i63) & (~i64)) + (i64 << 1);
            p = i65 % 128;
            if (i65 % 2 == 0) {
                builder.create().show();
                return;
            } else {
                builder.create().show();
                obj.hashCode();
                throw null;
            }
        }
        int i66 = q + 109;
        p = i66 % 128;
        if (i66 % 2 != 0) {
            this.am.n().equals(BuildConfig.FLAVOR);
            obj.hashCode();
            throw null;
        }
        if (!(!this.am.n().equals(BuildConfig.FLAVOR))) {
            u(this.ar);
            int i67 = q;
            int i68 = i67 & 55;
            int i69 = i67 | 55;
            int i70 = (i68 & i69) + (i69 | i68);
            p = i70 % 128;
            int i71 = i70 % 2;
            return;
        }
        int i72 = q;
        int i73 = ((i72 ^ 28) + ((i72 & 28) << 1)) - 1;
        p = i73 % 128;
        int i74 = i73 % 2;
        String strN = this.am.n();
        String strK = this.am.k();
        int i75 = p + 125;
        q = i75 % 128;
        if (i75 % 2 == 0) {
            strC = ivas.gov.bisp.enumeration.bK.b.c(strN, ivas.gov.bisp.enumeration.bK.b.b(strK), ivas.gov.bisp.enumeration.bK.b.b(this.am.m()));
            int i76 = 83 / 0;
        } else {
            strC = ivas.gov.bisp.enumeration.bK.b.c(strN, ivas.gov.bisp.enumeration.bK.b.b(strK), ivas.gov.bisp.enumeration.bK.b.b(this.am.m()));
        }
        int i77 = p;
        int i78 = i77 & 25;
        int i79 = (((i77 | 25) & (~i78)) - (~(i78 << 1))) - 1;
        q = i79 % 128;
        if (i79 % 2 != 0) {
            w(strC);
        } else {
            w(strC);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:11:0x0034  */
    /* JADX WARN: Code duplicated, block: B:13:0x0047  */
    /* JADX WARN: Code duplicated, block: B:16:0x004e  */
    /* JADX WARN: Code duplicated, block: B:9:0x002f A[PHI: r5
  0x002f: PHI (r5v5 int) = (r5v4 int), (r5v21 int) binds: [B:8:0x002d, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x03b1, code lost:
    
        setResult(-1, r2);
        finish();
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x03b7, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if (r17.ap == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        if (r17.ap == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        r2 = r2 + 95;
        ivas.gov.bisp.enumeration.activity.nadra.NewFormNadraRoster.q = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        if ((r2 % 2) != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        r2 = android.widget.Toast.makeText(getApplicationContext(), "You can not add member until timer will complete.", 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0065, code lost:
    
        r2.show();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
    
        r2 = android.widget.Toast.makeText(getApplicationContext(), "You can not add member until timer will complete.", 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        r2 = ivas.gov.bisp.enumeration.activity.nadra.NewFormNadraRoster.p;
        r4 = ((r2 | 125) << 1) - (r2 ^ 125);
        ivas.gov.bisp.enumeration.activity.nadra.NewFormNadraRoster.q = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
    
        if ((r4 % 2) == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0082, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0083, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0084, code lost:
    
        r2 = r17.ag.h().size();
        r5 = new java.util.ArrayList();
        r8 = ivas.gov.bisp.enumeration.activity.nadra.NewFormNadraRoster.q;
        r10 = r8 & 123;
        r9 = ((((r8 ^ 123) | r10) << 1) - (~(-((r8 | 123) & (~r10))))) - 1;
        ivas.gov.bisp.enumeration.activity.nadra.NewFormNadraRoster.p = r9 % 128;
        r9 = r9 % 2;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a9, code lost:
    
        if (r8 >= r2) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ab, code lost:
    
        r9 = new ivas.gov.bisp.enumeration.models.Roster();
        r10 = r17.ag;
        r11 = ivas.gov.bisp.enumeration.activity.nadra.NewFormNadraRoster.p;
        r12 = r11 & 13;
        r11 = (r11 | 13) & (~r12);
        r12 = r12 << 1;
        r13 = (r11 ^ r12) + ((r11 & r12) << 1);
        ivas.gov.bisp.enumeration.activity.nadra.NewFormNadraRoster.q = r13 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c6, code lost:
    
        if ((r13 % 2) != 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c8, code lost:
    
        r9.cnic_valid_name = r10.h().get(r8).getName();
        r10 = 11 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00dc, code lost:
    
        r9.cnic_valid_name = r10.h().get(r8).getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ec, code lost:
    
        r10 = ivas.gov.bisp.enumeration.activity.nadra.NewFormNadraRoster.p + 115;
        ivas.gov.bisp.enumeration.activity.nadra.NewFormNadraRoster.q = r10 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f5, code lost:
    
        if ((r10 % 2) != 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f7, code lost:
    
        r9.cnic_valid = java.lang.Boolean.TRUE;
        r10 = 87 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ff, code lost:
    
        r9.cnic_valid = java.lang.Boolean.TRUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0103, code lost:
    
        r10 = net.sqlcipher.BuildConfig.FLAVOR;
        r9.name_of_member = net.sqlcipher.BuildConfig.FLAVOR;
        r9.cnicOption = 2;
        r11 = r17.ag;
        r12 = ivas.gov.bisp.enumeration.activity.nadra.NewFormNadraRoster.p;
        r13 = r12 & 81;
        r12 = -(-((r12 ^ 81) | r13));
        r15 = (r13 ^ r12) + ((r12 & r13) << 1);
        ivas.gov.bisp.enumeration.activity.nadra.NewFormNadraRoster.q = r15 % 128;
        r15 = r15 % 2;
        r11 = r11.h().get(r8).getCitizen_number();
        r12 = ivas.gov.bisp.enumeration.activity.nadra.NewFormNadraRoster.q + 45;
        ivas.gov.bisp.enumeration.activity.nadra.NewFormNadraRoster.p = r12 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0138, code lost:
    
        if ((r12 % 2) == 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x013a, code lost:
    
        r17.ar = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0142, code lost:
    
        if (r11.length() != 113) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0145, code lost:
    
        r17.ar = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x014b, code lost:
    
        if (r11.length() != 13) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x014d, code lost:
    
        r11 = ivas.gov.bisp.enumeration.activity.nadra.NewFormNadraRoster.q;
        r12 = (r11 & 117) + (r11 | 117);
        ivas.gov.bisp.enumeration.activity.nadra.NewFormNadraRoster.p = r12 % 128;
        r12 = r12 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x015f, code lost:
    
        if (r17.ar.endsWith("-") != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0161, code lost:
    
        r11 = ivas.gov.bisp.enumeration.activity.nadra.NewFormNadraRoster.q;
        r12 = ((r11 & 43) - (~(-(-(r11 | 43))))) - 1;
        ivas.gov.bisp.enumeration.activity.nadra.NewFormNadraRoster.p = r12 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0171, code lost:
    
        if ((r12 % 2) != 0) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0179, code lost:
    
        if (r17.ar.contains("-") != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x017b, code lost:
    
        r10 = new java.lang.StringBuilder();
        r11 = r17.ar;
        r12 = ivas.gov.bisp.enumeration.activity.nadra.NewFormNadraRoster.p;
        r14 = r12 | 53;
        r12 = ((r14 << 1) - (~(-((~(r12 & 53)) & r14)))) - 1;
        ivas.gov.bisp.enumeration.activity.nadra.NewFormNadraRoster.q = r12 % 128;
        r12 = r12 % 2;
        r10.append(r11.substring(0, 5));
        r10.append("-");
        r11 = ivas.gov.bisp.enumeration.activity.nadra.NewFormNadraRoster.q;
        r12 = r11 & 45;
        r11 = (r11 ^ 45) | r12;
        r14 = (r12 ^ r11) + ((r11 & r12) << 1);
        ivas.gov.bisp.enumeration.activity.nadra.NewFormNadraRoster.p = r14 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01b4, code lost:
    
        if ((r14 % 2) == 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01b6, code lost:
    
        r10.append(r17.ar.substring(3, 51));
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01c3, code lost:
    
        r10.append(r17.ar.substring(5, 12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01cc, code lost:
    
        r10.append("-");
        r12 = r17.ar;
        r13 = ivas.gov.bisp.enumeration.activity.nadra.NewFormNadraRoster.p;
        r14 = (((r13 ^ 37) | (r13 & 37)) << 1) - (((~r13) & 37) | (r13 & (-38)));
        ivas.gov.bisp.enumeration.activity.nadra.NewFormNadraRoster.q = r14 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01e5, code lost:
    
        if ((r14 % 2) != 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01e7, code lost:
    
        r10.append(r12.substring(89));
        r10 = r10.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01f6, code lost:
    
        r10.append(r12.substring(12));
        r10 = r10.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0203, code lost:
    
        r17.ar.contains("-");
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0208, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0210, code lost:
    
        if (r17.ar.length() != 6) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0212, code lost:
    
        r11 = ivas.gov.bisp.enumeration.activity.nadra.NewFormNadraRoster.p;
        r12 = r11 ^ 9;
        r11 = ((r11 & 9) | r12) << 1;
        r12 = -r12;
        r14 = ((r11 | r12) << 1) - (r11 ^ r12);
        ivas.gov.bisp.enumeration.activity.nadra.NewFormNadraRoster.q = r14 % 128;
        r14 = r14 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x022b, code lost:
    
        if (r17.ar.endsWith("-") != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x022d, code lost:
    
        r10 = new java.lang.StringBuilder();
        r11 = r17.ar;
        r12 = ivas.gov.bisp.enumeration.activity.nadra.NewFormNadraRoster.q + 111;
        ivas.gov.bisp.enumeration.activity.nadra.NewFormNadraRoster.p = r12 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x023d, code lost:
    
        if ((r12 % 2) == 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x023f, code lost:
    
        r10.append(r11.substring(0, 5));
        r10.append("-");
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x024a, code lost:
    
        r10.append(r11.substring(0, 5));
        r10.append("-");
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0254, code lost:
    
        r11 = ivas.gov.bisp.enumeration.activity.nadra.NewFormNadraRoster.q;
        r12 = (((r11 & (-82)) | ((~r11) & 81)) - (~((r11 & 81) << 1))) - 1;
        ivas.gov.bisp.enumeration.activity.nadra.NewFormNadraRoster.p = r12 % 128;
        r12 = r12 % 2;
        r10.append(r17.ar.substring(5));
        r11 = ivas.gov.bisp.enumeration.activity.nadra.NewFormNadraRoster.p + 39;
        ivas.gov.bisp.enumeration.activity.nadra.NewFormNadraRoster.q = r11 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0279, code lost:
    
        if ((r11 % 2) != 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x027b, code lost:
    
        r10 = r10.toString();
        r11 = 27 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0283, code lost:
    
        r10 = r10.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0287, code lost:
    
        r11 = ivas.gov.bisp.enumeration.activity.nadra.NewFormNadraRoster.q;
        r12 = (r11 & (-42)) | ((~r11) & 41);
        r11 = (r11 & 41) << 1;
        r13 = (r12 ^ r11) + ((r11 & r12) << 1);
        ivas.gov.bisp.enumeration.activity.nadra.NewFormNadraRoster.p = r13 % 128;
        r13 = r13 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x029c, code lost:
    
        r9.cnic = r10;
        r9.cnicRepeat = r10;
        r10 = ivas.gov.bisp.enumeration.activity.nadra.NewFormNadraRoster.q;
        r11 = ((r10 ^ 71) - (~((r10 & 71) << 1))) - 1;
        ivas.gov.bisp.enumeration.activity.nadra.NewFormNadraRoster.p = r11 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x02af, code lost:
    
        if ((r11 % 2) != 0) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x02b7, code lost:
    
        if (r17.ak.size() != 0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x02b9, code lost:
    
        r10 = ivas.gov.bisp.enumeration.activity.nadra.NewFormNadraRoster.p;
        r11 = r10 ^ 41;
        r10 = ((((r10 & 41) | r11) << 1) - (~(-r11))) - 1;
        ivas.gov.bisp.enumeration.activity.nadra.NewFormNadraRoster.q = r10 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x02ca, code lost:
    
        if ((r10 % 2) != 0) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x02cc, code lost:
    
        r10 = 5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x02ce, code lost:
    
        r10 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x02d0, code lost:
    
        r10 = r17.ak;
        r10 = r10.get(r10.size() - 1);
        r11 = ivas.gov.bisp.enumeration.activity.nadra.NewFormNadraRoster.p;
        r12 = ((r11 | 73) << 1) - (((~r11) & 73) | (r11 & (-74)));
        ivas.gov.bisp.enumeration.activity.nadra.NewFormNadraRoster.q = r12 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x02ef, code lost:
    
        if ((r12 % 2) != 0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x02f1, code lost:
    
        r10 = r5.size() >> (r10.roster_relational_id / 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x02fb, code lost:
    
        r10 = (r5.size() - (~(r10.roster_relational_id - (-1)))) - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0306, code lost:
    
        r11 = ivas.gov.bisp.enumeration.activity.nadra.NewFormNadraRoster.p + 43;
        ivas.gov.bisp.enumeration.activity.nadra.NewFormNadraRoster.q = r11 % 128;
        r11 = r11 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x030f, code lost:
    
        r9.roster_relational_id = r10;
        r10 = java.util.UUID.randomUUID();
        r11 = ivas.gov.bisp.enumeration.activity.nadra.NewFormNadraRoster.q;
        r12 = (r11 & 91) + (r11 | 91);
        ivas.gov.bisp.enumeration.activity.nadra.NewFormNadraRoster.p = r12 % 128;
        r12 = r12 % 2;
        r9.rosterUniqueId = r10.toString();
        r10 = ivas.gov.bisp.enumeration.p026az.z.e();
        r11 = ivas.gov.bisp.enumeration.activity.nadra.NewFormNadraRoster.q + 77;
        ivas.gov.bisp.enumeration.activity.nadra.NewFormNadraRoster.p = r11 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0334, code lost:
    
        if ((r11 % 2) != 0) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0336, code lost:
    
        r9.start = r10;
        r10 = ivas.gov.bisp.enumeration.p026az.z.e();
        r9.end = r10;
        r10 = ivas.gov.bisp.enumeration.bK.ac.f(r9.start, r10);
        r12 = ivas.gov.bisp.enumeration.activity.nadra.NewFormNadraRoster.p + 59;
        ivas.gov.bisp.enumeration.activity.nadra.NewFormNadraRoster.q = r12 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x034d, code lost:
    
        if ((r12 % 2) == 0) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x034f, code lost:
    
        r9.diff = r10;
        r5.add(r9);
        r9 = ivas.gov.bisp.enumeration.activity.nadra.NewFormNadraRoster.p;
        r10 = r9 & 79;
        r9 = (r9 | 79) & (~r10);
        r10 = -(-(r10 << 1));
        r11 = (r9 & r10) + (r9 | r10);
        r9 = r11 % 128;
        ivas.gov.bisp.enumeration.activity.nadra.NewFormNadraRoster.q = r9;
        r11 = r11 % 2;
        r8 = r8 + 1;
        r10 = r9 & 97;
        r9 = (((r9 | 97) & (~r10)) - (~(-(-(r10 << 1))))) - 1;
        ivas.gov.bisp.enumeration.activity.nadra.NewFormNadraRoster.p = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x037d, code lost:
    
        r9.diff = r10;
        r5.add(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0382, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0383, code lost:
    
        r9.start = r10;
        ivas.gov.bisp.enumeration.p026az.z.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0388, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0389, code lost:
    
        r17.ak.size();
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0391, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0392, code lost:
    
        r2 = new android.content.Intent();
        r2.putExtra("roster", r5);
        r3 = ivas.gov.bisp.enumeration.activity.nadra.NewFormNadraRoster.p + 37;
        ivas.gov.bisp.enumeration.activity.nadra.NewFormNadraRoster.q = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x03a5, code lost:
    
        if ((r3 % 2) != 0) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x03a7, code lost:
    
        setResult(-1, r2);
        finish();
        r1 = 17 / 0;
     */
    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth, android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onClick(android.view.View r18) {
        /*
            Method dump skipped, instruction units count: 992
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.activity.nadra.NewFormNadraRoster.onClick(android.view.View):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e0, code lost:
    
        if (r0 == 200) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w(java.lang.String r27) {
        /*
            Method dump skipped, instruction units count: 1877
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.activity.nadra.NewFormNadraRoster.w(java.lang.String):void");
    }
}
