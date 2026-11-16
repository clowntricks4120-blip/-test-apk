package ivas.gov.bisp.enumeration.activity;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.text.format.Formatter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ivas.gov.bisp.enumeration.ActivityBeginSurvey;
import ivas.gov.bisp.enumeration.BISPApplication;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.activity.NADRARosterListActivity;
import ivas.gov.bisp.enumeration.activity.singlediscrepancy.UpdateRosterListActivity;
import ivas.gov.bisp.enumeration.activitybase.BaseTouch;
import ivas.gov.bisp.enumeration.ax.av.buW;
import ivas.gov.bisp.enumeration.bK.ac;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.models.NADRARosterItem;
import ivas.gov.bisp.enumeration.models.RosterItem;
import ivas.gov.bisp.enumeration.p024ax.av;
import ivas.gov.bisp.enumeration.p024ax.ax;
import ivas.gov.bisp.enumeration.p036bi.C0161an;
import ivas.gov.bisp.enumeration.p036bi.G;
import ivas.gov.bisp.enumeration.p036bi.H;
import ivas.gov.bisp.enumeration.p038bk.bt;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;
import net.sqlcipher.BuildConfig;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class NADRARosterListActivity extends BaseTouch {
    public static final /* synthetic */ int ac = 0;
    private static int p = 0;
    private static int q = 1;
    public BISPApplication ad;
    public ImageView ae;
    public TextView af;
    public bt ag;
    public List<NADRARosterItem> ah;
    public ProgressDialog ai;
    public RecyclerView aj;
    public SessionManager ak;
    public String al;
    public String am;
    public boolean an;
    public String ao;
    public String ap;

    public class OooO0O0 implements DialogInterface.OnClickListener {
        private static int a = 1;
        private static int b;

        public OooO0O0(NADRARosterListActivity nADRARosterListActivity) {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            int i3 = a + 95;
            b = i3 % 128;
            int i4 = i3 % 2;
            dialogInterface.cancel();
            int i5 = a;
            int i6 = ((i5 ^ 109) | (i5 & 109)) << 1;
            int i7 = -(((~i5) & 109) | (i5 & (-110)));
            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
            b = i8 % 128;
            if (i8 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public class OooO0OO implements DialogInterface.OnClickListener {
        private static int a = 1;
        private static int b;

        public OooO0OO() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            Intent intent = new Intent(NADRARosterListActivity.this, (Class<?>) UpdateRosterListActivity.class);
            int i3 = b + 53;
            a = i3 % 128;
            if (i3 % 2 == 0) {
                NADRARosterListActivity.this.startActivity(intent);
                throw null;
            }
            NADRARosterListActivity.this.startActivity(intent);
            NADRARosterListActivity.this.finish();
            dialogInterface.cancel();
            dialogInterface.dismiss();
            int i4 = a + 39;
            b = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public class OooO0o implements DialogInterface.OnClickListener {
        private static int a = 0;
        private static int b = 1;
        public final /* synthetic */ boolean c;

        public OooO0o(boolean z) {
            this.c = z;
        }

        /* JADX WARN: Code duplicated, block: B:9:0x002c  */
        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = i3 & 103;
            int i5 = (((i3 | 103) & (~i4)) - (~(-(-(i4 << 1))))) - 1;
            b = i5 % 128;
            if (i5 % 2 == 0) {
                dialogInterface.cancel();
                int i6 = 6 / 0;
                if (this.c) {
                    Intent intent = new Intent(NADRARosterListActivity.this, (Class<?>) UpdateRosterListActivity.class);
                    int i7 = b;
                    int i8 = i7 & 15;
                    int i9 = (i8 - (~((i7 ^ 15) | i8))) - 1;
                    a = i9 % 128;
                    int i10 = i9 % 2;
                    NADRARosterListActivity.this.startActivity(intent);
                    NADRARosterListActivity.this.finish();
                    int i11 = a;
                    int i12 = ((i11 ^ 19) - (~(-(-((i11 & 19) << 1))))) - 1;
                    b = i12 % 128;
                    int i13 = i12 % 2;
                }
            } else {
                dialogInterface.cancel();
                if (this.c) {
                    Intent intent2 = new Intent(NADRARosterListActivity.this, (Class<?>) UpdateRosterListActivity.class);
                    int i14 = b;
                    int i15 = i14 & 15;
                    int i16 = (i15 - (~((i14 ^ 15) | i15))) - 1;
                    a = i16 % 128;
                    int i17 = i16 % 2;
                    NADRARosterListActivity.this.startActivity(intent2);
                    NADRARosterListActivity.this.finish();
                    int i18 = a;
                    int i19 = ((i18 ^ 19) - (~(-(-((i18 & 19) << 1))))) - 1;
                    b = i19 % 128;
                    int i110 = i19 % 2;
                }
            }
            int i20 = a;
            int i21 = i20 ^ 41;
            int i22 = -(-((i20 & 41) << 1));
            int i23 = (i21 & i22) + (i22 | i21);
            b = i23 % 128;
            if (i23 % 2 == 0) {
                throw null;
            }
        }
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public int p() {
        int i = 2 % 2;
        int i2 = q;
        int i3 = i2 ^ 57;
        int i4 = -(-((i2 & 57) << 1));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        int i6 = i5 % 128;
        p = i6;
        int i7 = i5 % 2;
        int i8 = i6 & 91;
        int i9 = (((i6 | 91) & (~i8)) - (~(-(-(i8 << 1))))) - 1;
        q = i9 % 128;
        int i10 = i9 % 2;
        return R.layout.activity_nadra_roster_list;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        setResult(0, new Intent());
        int i2 = p;
        int i3 = i2 & 95;
        int i4 = -(-((i2 ^ 95) | i3));
        int i5 = (i3 & i4) + (i4 | i3);
        q = i5 % 128;
        if (i5 % 2 == 0) {
            finish();
            int i6 = 69 / 0;
        } else {
            finish();
        }
        int i7 = p + 117;
        q = i7 % 128;
        int i8 = i7 % 2;
    }

    public class OooO00o implements DialogInterface.OnClickListener {
        private static int a = 1;
        private static int b;

        public OooO00o() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = ((i3 & 82) + (i3 | 82)) - 1;
            a = i4 % 128;
            if (i4 % 2 == 0) {
                NADRARosterListActivity.this.ai.isShowing();
                throw null;
            }
            if (!(!NADRARosterListActivity.this.ai.isShowing())) {
                int i5 = b;
                int i6 = (i5 & 53) + (i5 | 53);
                a = i6 % 128;
                if (i6 % 2 == 0) {
                    NADRARosterListActivity.this.ai.dismiss();
                    int i7 = 12 / 0;
                } else {
                    NADRARosterListActivity.this.ai.dismiss();
                }
            }
            dialogInterface.cancel();
            NADRARosterListActivity nADRARosterListActivity = NADRARosterListActivity.this;
            int i8 = b + 31;
            a = i8 % 128;
            int i9 = i8 % 2;
            String strR = nADRARosterListActivity.ak.r();
            NADRARosterListActivity nADRARosterListActivity2 = NADRARosterListActivity.this;
            int i10 = b;
            int i11 = (i10 ^ 87) + ((i10 & 87) << 1);
            a = i11 % 128;
            int i12 = i11 % 2;
            nADRARosterListActivity.u(strR, nADRARosterListActivity2.ak.c());
            int i13 = a;
            int i14 = i13 & 69;
            int i15 = ((i13 ^ 69) | i14) << 1;
            int i16 = -((i13 | 69) & (~i14));
            int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
            b = i17 % 128;
            int i18 = i17 % 2;
        }
    }

    public final void x(String str, String str2) {
        int i = 2 % 2;
        b.aIz aiz = new b.aIz(this);
        AlertController.OooO0O0 oooO0O0 = aiz.a;
        int i2 = p;
        int i3 = ((i2 & 120) + (i2 | 120)) - 1;
        q = i3 % 128;
        if (i3 % 2 == 0) {
            oooO0O0.e = str;
            oooO0O0.f = str2;
            oooO0O0.k = false;
        } else {
            oooO0O0.e = str;
            oooO0O0.f = str2;
            oooO0O0.k = true;
        }
        OooO00o oooO00o = new OooO00o();
        oooO0O0.h = "Retry";
        oooO0O0.i = oooO00o;
        OooO0O0 oooO0O1 = new OooO0O0(this);
        int i4 = q;
        int i5 = ((i4 & (-60)) | ((~i4) & 59)) + ((i4 & 59) << 1);
        p = i5 % 128;
        if (i5 % 2 != 0) {
            oooO0O0.a = "Cancel";
            oooO0O0.j = oooO0O1;
            throw null;
        }
        oooO0O0.a = "Cancel";
        oooO0O0.j = oooO0O1;
        aiz.b().show();
        int i6 = p;
        int i7 = ((i6 | 37) << 1) - (i6 ^ 37);
        q = i7 % 128;
        int i8 = i7 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0074, code lost:
    
        if (r9 == 200) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y(java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.activity.NADRARosterListActivity.y(java.lang.String):void");
    }

    public final void z(String str, String str2, boolean z) {
        int i = 2 % 2;
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(str);
        int i2 = q;
        int i3 = i2 & 55;
        int i4 = (i2 | 55) & (~i3);
        int i5 = i3 << 1;
        int i6 = (i4 & i5) + (i4 | i5);
        p = i6 % 128;
        int i7 = i6 % 2;
        builder.setMessage(str2);
        builder.setCancelable(true);
        builder.setPositiveButton("Ok", new OooO0o(z));
        int i8 = q;
        int i9 = (((i8 & (-40)) | ((~i8) & 39)) - (~((i8 & 39) << 1))) - 1;
        p = i9 % 128;
        if (i9 % 2 != 0) {
            builder.create().show();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        builder.create().show();
        int i10 = p;
        int i11 = i10 & 87;
        int i12 = -(-((i10 ^ 87) | i11));
        int i13 = (i11 & i12) + (i12 | i11);
        q = i13 % 128;
        int i14 = i13 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:102:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:104:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:106:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:111:0x02f5 A[Catch: JSONException -> 0x0804, TRY_ENTER, TryCatch #2 {JSONException -> 0x0804, blocks: (B:11:0x0050, B:14:0x006f, B:17:0x008b, B:18:0x0094, B:20:0x00a2, B:23:0x00bb, B:34:0x0103, B:37:0x0123, B:39:0x012b, B:45:0x0136, B:47:0x013d, B:49:0x0146, B:66:0x01f1, B:69:0x0215, B:73:0x0223, B:76:0x0245, B:78:0x0250, B:87:0x0262, B:90:0x0281, B:92:0x028e, B:98:0x0295, B:84:0x0257, B:108:0x02cf, B:111:0x02f5, B:113:0x02ff, B:116:0x0309, B:120:0x0322, B:123:0x0339, B:156:0x040a, B:158:0x041e, B:166:0x0449, B:168:0x0468, B:170:0x048b, B:174:0x04bb, B:176:0x04c4, B:183:0x04d2, B:187:0x04ed, B:191:0x04f9, B:197:0x051d, B:199:0x0570, B:201:0x05c6, B:203:0x0609, B:205:0x0649, B:209:0x073e, B:210:0x074e, B:190:0x04f5, B:182:0x04cb, B:129:0x0355, B:132:0x037d, B:137:0x0395, B:141:0x03b8, B:143:0x03be, B:148:0x03d6, B:150:0x03dc, B:151:0x03df, B:212:0x0768, B:214:0x0770, B:215:0x0773, B:218:0x0776, B:55:0x0169, B:44:0x0130, B:221:0x0782, B:223:0x078c, B:228:0x0791, B:230:0x07a9, B:236:0x07d1, B:240:0x07df, B:242:0x07ee, B:243:0x07f1, B:19:0x0098, B:246:0x07f4, B:248:0x0800), top: B:269:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:155:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:161:0x042e  */
    /* JADX WARN: Code duplicated, block: B:162:0x0430  */
    /* JADX WARN: Code duplicated, block: B:165:0x0448  */
    /* JADX WARN: Code duplicated, block: B:173:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:181:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:186:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:189:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:208:0x073c  */
    /* JADX WARN: Code duplicated, block: B:210:0x074e A[Catch: JSONException -> 0x0804, TryCatch #2 {JSONException -> 0x0804, blocks: (B:11:0x0050, B:14:0x006f, B:17:0x008b, B:18:0x0094, B:20:0x00a2, B:23:0x00bb, B:34:0x0103, B:37:0x0123, B:39:0x012b, B:45:0x0136, B:47:0x013d, B:49:0x0146, B:66:0x01f1, B:69:0x0215, B:73:0x0223, B:76:0x0245, B:78:0x0250, B:87:0x0262, B:90:0x0281, B:92:0x028e, B:98:0x0295, B:84:0x0257, B:108:0x02cf, B:111:0x02f5, B:113:0x02ff, B:116:0x0309, B:120:0x0322, B:123:0x0339, B:156:0x040a, B:158:0x041e, B:166:0x0449, B:168:0x0468, B:170:0x048b, B:174:0x04bb, B:176:0x04c4, B:183:0x04d2, B:187:0x04ed, B:191:0x04f9, B:197:0x051d, B:199:0x0570, B:201:0x05c6, B:203:0x0609, B:205:0x0649, B:209:0x073e, B:210:0x074e, B:190:0x04f5, B:182:0x04cb, B:129:0x0355, B:132:0x037d, B:137:0x0395, B:141:0x03b8, B:143:0x03be, B:148:0x03d6, B:150:0x03dc, B:151:0x03df, B:212:0x0768, B:214:0x0770, B:215:0x0773, B:218:0x0776, B:55:0x0169, B:44:0x0130, B:221:0x0782, B:223:0x078c, B:228:0x0791, B:230:0x07a9, B:236:0x07d1, B:240:0x07df, B:242:0x07ee, B:243:0x07f1, B:19:0x0098, B:246:0x07f4, B:248:0x0800), top: B:269:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:296:0x0776 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:297:0x0768 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0215 A[Catch: JSONException -> 0x0804, TRY_ENTER, TRY_LEAVE, TryCatch #2 {JSONException -> 0x0804, blocks: (B:11:0x0050, B:14:0x006f, B:17:0x008b, B:18:0x0094, B:20:0x00a2, B:23:0x00bb, B:34:0x0103, B:37:0x0123, B:39:0x012b, B:45:0x0136, B:47:0x013d, B:49:0x0146, B:66:0x01f1, B:69:0x0215, B:73:0x0223, B:76:0x0245, B:78:0x0250, B:87:0x0262, B:90:0x0281, B:92:0x028e, B:98:0x0295, B:84:0x0257, B:108:0x02cf, B:111:0x02f5, B:113:0x02ff, B:116:0x0309, B:120:0x0322, B:123:0x0339, B:156:0x040a, B:158:0x041e, B:166:0x0449, B:168:0x0468, B:170:0x048b, B:174:0x04bb, B:176:0x04c4, B:183:0x04d2, B:187:0x04ed, B:191:0x04f9, B:197:0x051d, B:199:0x0570, B:201:0x05c6, B:203:0x0609, B:205:0x0649, B:209:0x073e, B:210:0x074e, B:190:0x04f5, B:182:0x04cb, B:129:0x0355, B:132:0x037d, B:137:0x0395, B:141:0x03b8, B:143:0x03be, B:148:0x03d6, B:150:0x03dc, B:151:0x03df, B:212:0x0768, B:214:0x0770, B:215:0x0773, B:218:0x0776, B:55:0x0169, B:44:0x0130, B:221:0x0782, B:223:0x078c, B:228:0x0791, B:230:0x07a9, B:236:0x07d1, B:240:0x07df, B:242:0x07ee, B:243:0x07f1, B:19:0x0098, B:246:0x07f4, B:248:0x0800), top: B:269:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0223 A[Catch: JSONException -> 0x0804, TRY_ENTER, TRY_LEAVE, TryCatch #2 {JSONException -> 0x0804, blocks: (B:11:0x0050, B:14:0x006f, B:17:0x008b, B:18:0x0094, B:20:0x00a2, B:23:0x00bb, B:34:0x0103, B:37:0x0123, B:39:0x012b, B:45:0x0136, B:47:0x013d, B:49:0x0146, B:66:0x01f1, B:69:0x0215, B:73:0x0223, B:76:0x0245, B:78:0x0250, B:87:0x0262, B:90:0x0281, B:92:0x028e, B:98:0x0295, B:84:0x0257, B:108:0x02cf, B:111:0x02f5, B:113:0x02ff, B:116:0x0309, B:120:0x0322, B:123:0x0339, B:156:0x040a, B:158:0x041e, B:166:0x0449, B:168:0x0468, B:170:0x048b, B:174:0x04bb, B:176:0x04c4, B:183:0x04d2, B:187:0x04ed, B:191:0x04f9, B:197:0x051d, B:199:0x0570, B:201:0x05c6, B:203:0x0609, B:205:0x0649, B:209:0x073e, B:210:0x074e, B:190:0x04f5, B:182:0x04cb, B:129:0x0355, B:132:0x037d, B:137:0x0395, B:141:0x03b8, B:143:0x03be, B:148:0x03d6, B:150:0x03dc, B:151:0x03df, B:212:0x0768, B:214:0x0770, B:215:0x0773, B:218:0x0776, B:55:0x0169, B:44:0x0130, B:221:0x0782, B:223:0x078c, B:228:0x0791, B:230:0x07a9, B:236:0x07d1, B:240:0x07df, B:242:0x07ee, B:243:0x07f1, B:19:0x0098, B:246:0x07f4, B:248:0x0800), top: B:269:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0245 A[Catch: JSONException -> 0x0804, TRY_ENTER, TRY_LEAVE, TryCatch #2 {JSONException -> 0x0804, blocks: (B:11:0x0050, B:14:0x006f, B:17:0x008b, B:18:0x0094, B:20:0x00a2, B:23:0x00bb, B:34:0x0103, B:37:0x0123, B:39:0x012b, B:45:0x0136, B:47:0x013d, B:49:0x0146, B:66:0x01f1, B:69:0x0215, B:73:0x0223, B:76:0x0245, B:78:0x0250, B:87:0x0262, B:90:0x0281, B:92:0x028e, B:98:0x0295, B:84:0x0257, B:108:0x02cf, B:111:0x02f5, B:113:0x02ff, B:116:0x0309, B:120:0x0322, B:123:0x0339, B:156:0x040a, B:158:0x041e, B:166:0x0449, B:168:0x0468, B:170:0x048b, B:174:0x04bb, B:176:0x04c4, B:183:0x04d2, B:187:0x04ed, B:191:0x04f9, B:197:0x051d, B:199:0x0570, B:201:0x05c6, B:203:0x0609, B:205:0x0649, B:209:0x073e, B:210:0x074e, B:190:0x04f5, B:182:0x04cb, B:129:0x0355, B:132:0x037d, B:137:0x0395, B:141:0x03b8, B:143:0x03be, B:148:0x03d6, B:150:0x03dc, B:151:0x03df, B:212:0x0768, B:214:0x0770, B:215:0x0773, B:218:0x0776, B:55:0x0169, B:44:0x0130, B:221:0x0782, B:223:0x078c, B:228:0x0791, B:230:0x07a9, B:236:0x07d1, B:240:0x07df, B:242:0x07ee, B:243:0x07f1, B:19:0x0098, B:246:0x07f4, B:248:0x0800), top: B:269:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0257 A[Catch: JSONException -> 0x0804, TRY_ENTER, TryCatch #2 {JSONException -> 0x0804, blocks: (B:11:0x0050, B:14:0x006f, B:17:0x008b, B:18:0x0094, B:20:0x00a2, B:23:0x00bb, B:34:0x0103, B:37:0x0123, B:39:0x012b, B:45:0x0136, B:47:0x013d, B:49:0x0146, B:66:0x01f1, B:69:0x0215, B:73:0x0223, B:76:0x0245, B:78:0x0250, B:87:0x0262, B:90:0x0281, B:92:0x028e, B:98:0x0295, B:84:0x0257, B:108:0x02cf, B:111:0x02f5, B:113:0x02ff, B:116:0x0309, B:120:0x0322, B:123:0x0339, B:156:0x040a, B:158:0x041e, B:166:0x0449, B:168:0x0468, B:170:0x048b, B:174:0x04bb, B:176:0x04c4, B:183:0x04d2, B:187:0x04ed, B:191:0x04f9, B:197:0x051d, B:199:0x0570, B:201:0x05c6, B:203:0x0609, B:205:0x0649, B:209:0x073e, B:210:0x074e, B:190:0x04f5, B:182:0x04cb, B:129:0x0355, B:132:0x037d, B:137:0x0395, B:141:0x03b8, B:143:0x03be, B:148:0x03d6, B:150:0x03dc, B:151:0x03df, B:212:0x0768, B:214:0x0770, B:215:0x0773, B:218:0x0776, B:55:0x0169, B:44:0x0130, B:221:0x0782, B:223:0x078c, B:228:0x0791, B:230:0x07a9, B:236:0x07d1, B:240:0x07df, B:242:0x07ee, B:243:0x07f1, B:19:0x0098, B:246:0x07f4, B:248:0x0800), top: B:269:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0261  */
    /* JADX WARN: Code duplicated, block: B:87:0x0262 A[Catch: JSONException -> 0x0804, TRY_LEAVE, TryCatch #2 {JSONException -> 0x0804, blocks: (B:11:0x0050, B:14:0x006f, B:17:0x008b, B:18:0x0094, B:20:0x00a2, B:23:0x00bb, B:34:0x0103, B:37:0x0123, B:39:0x012b, B:45:0x0136, B:47:0x013d, B:49:0x0146, B:66:0x01f1, B:69:0x0215, B:73:0x0223, B:76:0x0245, B:78:0x0250, B:87:0x0262, B:90:0x0281, B:92:0x028e, B:98:0x0295, B:84:0x0257, B:108:0x02cf, B:111:0x02f5, B:113:0x02ff, B:116:0x0309, B:120:0x0322, B:123:0x0339, B:156:0x040a, B:158:0x041e, B:166:0x0449, B:168:0x0468, B:170:0x048b, B:174:0x04bb, B:176:0x04c4, B:183:0x04d2, B:187:0x04ed, B:191:0x04f9, B:197:0x051d, B:199:0x0570, B:201:0x05c6, B:203:0x0609, B:205:0x0649, B:209:0x073e, B:210:0x074e, B:190:0x04f5, B:182:0x04cb, B:129:0x0355, B:132:0x037d, B:137:0x0395, B:141:0x03b8, B:143:0x03be, B:148:0x03d6, B:150:0x03dc, B:151:0x03df, B:212:0x0768, B:214:0x0770, B:215:0x0773, B:218:0x0776, B:55:0x0169, B:44:0x0130, B:221:0x0782, B:223:0x078c, B:228:0x0791, B:230:0x07a9, B:236:0x07d1, B:240:0x07df, B:242:0x07ee, B:243:0x07f1, B:19:0x0098, B:246:0x07f4, B:248:0x0800), top: B:269:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0281 A[Catch: JSONException -> 0x0804, TRY_ENTER, TRY_LEAVE, TryCatch #2 {JSONException -> 0x0804, blocks: (B:11:0x0050, B:14:0x006f, B:17:0x008b, B:18:0x0094, B:20:0x00a2, B:23:0x00bb, B:34:0x0103, B:37:0x0123, B:39:0x012b, B:45:0x0136, B:47:0x013d, B:49:0x0146, B:66:0x01f1, B:69:0x0215, B:73:0x0223, B:76:0x0245, B:78:0x0250, B:87:0x0262, B:90:0x0281, B:92:0x028e, B:98:0x0295, B:84:0x0257, B:108:0x02cf, B:111:0x02f5, B:113:0x02ff, B:116:0x0309, B:120:0x0322, B:123:0x0339, B:156:0x040a, B:158:0x041e, B:166:0x0449, B:168:0x0468, B:170:0x048b, B:174:0x04bb, B:176:0x04c4, B:183:0x04d2, B:187:0x04ed, B:191:0x04f9, B:197:0x051d, B:199:0x0570, B:201:0x05c6, B:203:0x0609, B:205:0x0649, B:209:0x073e, B:210:0x074e, B:190:0x04f5, B:182:0x04cb, B:129:0x0355, B:132:0x037d, B:137:0x0395, B:141:0x03b8, B:143:0x03be, B:148:0x03d6, B:150:0x03dc, B:151:0x03df, B:212:0x0768, B:214:0x0770, B:215:0x0773, B:218:0x0776, B:55:0x0169, B:44:0x0130, B:221:0x0782, B:223:0x078c, B:228:0x0791, B:230:0x07a9, B:236:0x07d1, B:240:0x07df, B:242:0x07ee, B:243:0x07f1, B:19:0x0098, B:246:0x07f4, B:248:0x0800), top: B:269:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0295 A[Catch: JSONException -> 0x0804, TRY_ENTER, TRY_LEAVE, TryCatch #2 {JSONException -> 0x0804, blocks: (B:11:0x0050, B:14:0x006f, B:17:0x008b, B:18:0x0094, B:20:0x00a2, B:23:0x00bb, B:34:0x0103, B:37:0x0123, B:39:0x012b, B:45:0x0136, B:47:0x013d, B:49:0x0146, B:66:0x01f1, B:69:0x0215, B:73:0x0223, B:76:0x0245, B:78:0x0250, B:87:0x0262, B:90:0x0281, B:92:0x028e, B:98:0x0295, B:84:0x0257, B:108:0x02cf, B:111:0x02f5, B:113:0x02ff, B:116:0x0309, B:120:0x0322, B:123:0x0339, B:156:0x040a, B:158:0x041e, B:166:0x0449, B:168:0x0468, B:170:0x048b, B:174:0x04bb, B:176:0x04c4, B:183:0x04d2, B:187:0x04ed, B:191:0x04f9, B:197:0x051d, B:199:0x0570, B:201:0x05c6, B:203:0x0609, B:205:0x0649, B:209:0x073e, B:210:0x074e, B:190:0x04f5, B:182:0x04cb, B:129:0x0355, B:132:0x037d, B:137:0x0395, B:141:0x03b8, B:143:0x03be, B:148:0x03d6, B:150:0x03dc, B:151:0x03df, B:212:0x0768, B:214:0x0770, B:215:0x0773, B:218:0x0776, B:55:0x0169, B:44:0x0130, B:221:0x0782, B:223:0x078c, B:228:0x0791, B:230:0x07a9, B:236:0x07d1, B:240:0x07df, B:242:0x07ee, B:243:0x07f1, B:19:0x0098, B:246:0x07f4, B:248:0x0800), top: B:269:0x0050 }] */
    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth, android.view.View.OnClickListener
    public void onClick(View view) {
        String martial_Status;
        int i;
        NADRARosterItem nADRARosterItem;
        int i2;
        String str;
        NADRARosterItem nADRARosterItem2;
        int i3;
        String relation;
        int i4;
        NADRARosterItem nADRARosterItem3;
        int i5;
        int i6;
        ArrayList arrayList;
        JSONArray jSONArray;
        int i7;
        double dC;
        RosterItem rosterItem;
        int i8;
        ArrayList arrayList2;
        Date date;
        Calendar calendar;
        int i9;
        NADRARosterItem nADRARosterItem4;
        int i10;
        NADRARosterItem nADRARosterItem5;
        int i11;
        int i12;
        int i13;
        boolean zEqualsIgnoreCase;
        String str2 = "Widowed";
        int i14 = 2;
        int i15 = 2 % 2;
        int i16 = p;
        int i17 = 1;
        int i18 = ((i16 ^ 48) + ((i16 & 48) << 1)) - 1;
        q = i18 % 128;
        if (i18 % 2 == 0) {
            Object obj = null;
            view.getId();
            obj.hashCode();
            throw null;
        }
        int id = view.getId();
        if (id != R.id.iv_back) {
            int i19 = q;
            int i20 = i19 & 99;
            int i21 = i19 | 99;
            int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
            p = i22 % 128;
            if (i22 % 2 != 0) {
                throw null;
            }
            if (id == R.id.tv_add) {
                ArrayList arrayList3 = new ArrayList();
                this.ag.h();
                JSONObject jSONObject = new JSONObject();
                new JSONObject();
                try {
                    WifiManager wifiManager = (WifiManager) getApplicationContext().getSystemService("wifi");
                    int i23 = q;
                    int i24 = i23 & 73;
                    int i25 = (i24 - (~(-(-((i23 ^ 73) | i24))))) - 1;
                    p = i25 % 128;
                    if (i25 % 2 != 0) {
                        Formatter.formatIpAddress(wifiManager.getConnectionInfo().getIpAddress());
                        throw null;
                    }
                    String ipAddress = Formatter.formatIpAddress(wifiManager.getConnectionInfo().getIpAddress());
                    int i26 = p + 5;
                    q = i26 % 128;
                    int i27 = 0;
                    if (i26 % 2 == 0) {
                        jSONObject.put("house_hold_id", this.ak.c());
                    } else {
                        jSONObject.put("house_hold_id", this.ak.c());
                    }
                    jSONObject.put("is_pmt", 0);
                    jSONObject.put("type", "add_roster");
                    JSONArray jSONArray2 = new JSONArray();
                    int i28 = q;
                    int i29 = ((i28 | 95) << 1) - (i28 ^ 95);
                    p = i29 % 128;
                    if (i29 % 2 != 0) {
                        this.ag.h();
                        this.ag.h().size();
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    this.ag.h();
                    int size = this.ag.h().size();
                    int i30 = p + 125;
                    int i31 = i30 % 128;
                    q = i31;
                    if (i30 % 2 == 0) {
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                    if (size <= 0) {
                        z("Roster Selection", "Please select member.", false);
                        return;
                    }
                    int i32 = i31 & 43;
                    int i33 = (i31 ^ 43) | i32;
                    int i34 = (i32 & i33) + (i32 | i33);
                    p = i34 % 128;
                    int i35 = i34 % 2 != 0 ? 1 : 0;
                    while (i35 < size) {
                        int i36 = p;
                        int i37 = i36 & 19;
                        int i38 = (i36 ^ 19) | i37;
                        int i39 = ((i37 | i38) << 1) - (i37 ^ i38);
                        q = i39 % 128;
                        if (i39 % i14 == 0) {
                            this.ag.h().get(i35);
                            throw null;
                        }
                        NADRARosterItem nADRARosterItem6 = this.ag.h().get(i35);
                        int i40 = q;
                        int i41 = i40 & 117;
                        int i42 = (~i41) & (i40 | 117);
                        int i43 = -(-(i41 << i17));
                        int i44 = (i42 & i43) + (i43 | i42);
                        p = i44 % 128;
                        if (i44 % i14 != 0) {
                            martial_Status = nADRARosterItem6.getMartial_Status();
                            int i45 = 55 / i27;
                        } else {
                            martial_Status = nADRARosterItem6.getMartial_Status();
                        }
                        if (((martial_Status.equalsIgnoreCase(str2) ? 1 : 0) ^ i17) != 0) {
                            if (((martial_Status.equalsIgnoreCase("Married") ? 1 : 0) ^ i17) == 0) {
                                int i46 = p;
                                int i47 = i46 & 7;
                                int i48 = (~i47) & (i46 | 7);
                                int i49 = i47 << i17;
                                int i50 = (i48 & i49) + (i49 | i48);
                                q = i50 % 128;
                                int i51 = i50 % i14;
                                int i52 = i46 & 61;
                                int i53 = (i46 ^ 61) | i52;
                                int i54 = (i52 ^ i53) + ((i53 & i52) << i17);
                                q = i54 % 128;
                                int i55 = i54 % i14;
                                i = 201;
                            } else if (martial_Status.equalsIgnoreCase("Unmarried")) {
                                int i56 = q;
                                int i57 = ((i56 | 10) << i17) - (i56 ^ 10);
                                int i58 = (i57 ^ (-1)) + (i57 << i17);
                                p = i58 % 128;
                                i = i58 % i14 != 0 ? 4489 : 200;
                            } else if (martial_Status.equalsIgnoreCase("divorced")) {
                                int i59 = q;
                                int i60 = ((i59 ^ 52) + ((i59 & 52) << i17)) - i17;
                                int i61 = i60 % 128;
                                p = i61;
                                int i62 = i60 % i14 != 0 ? 10011 : 203;
                                int i63 = i61 & 47;
                                int i64 = (i61 | 47) & (~i63);
                                int i65 = -(-(i63 << i17));
                                int i66 = ((i64 | i65) << i17) - (i64 ^ i65);
                                q = i66 % 128;
                                int i67 = i66 % i14;
                                i = i62;
                            } else {
                                i = -1;
                            }
                            nADRARosterItem = this.ag.h().get(i35);
                            int i68 = q;
                            int i69 = i68 & 103;
                            i2 = (((i68 | 103) & (~i69)) - (~(-(-(i69 << 1))))) - i17;
                            p = i2 % 128;
                            str = "male";
                            if (i2 % i14 == 0) {
                                nADRARosterItem.getGender().equalsIgnoreCase("male");
                                Object obj4 = null;
                                obj4.hashCode();
                                throw null;
                            }
                            if (!nADRARosterItem.getGender().equalsIgnoreCase("male")) {
                                nADRARosterItem4 = this.ag.h().get(i35);
                                int i70 = q;
                                i10 = (((~i70) & 33) | (i70 & (-34))) + ((i70 & 33) << i17);
                                p = i10 % 128;
                                str = "female";
                                if (i10 % 2 != 0) {
                                    zEqualsIgnoreCase = nADRARosterItem4.getGender().equalsIgnoreCase("female");
                                    int i71 = 93 / 0;
                                    if (zEqualsIgnoreCase != i17) {
                                        nADRARosterItem5 = this.ag.h().get(i35);
                                        int i72 = p;
                                        int i73 = i72 & 31;
                                        int i74 = (i72 ^ 31) | i73;
                                        i11 = (i73 & i74) + (i74 | i73);
                                        q = i11 % 128;
                                        if (i11 % 2 == 0) {
                                            int i75 = 83 / 0;
                                            if (nADRARosterItem5.getGender().equalsIgnoreCase("transgender")) {
                                                int i76 = q;
                                                i12 = (i76 & 117) + (i76 | 117);
                                                p = i12 % 128;
                                                if (i12 % 2 != 0) {
                                                    int i77 = 88 / 0;
                                                }
                                                str = "transgender";
                                            } else {
                                                int i78 = p;
                                                int i79 = i78 & 105;
                                                int i80 = (i78 | 105) & (~i79);
                                                int i81 = i79 << i17;
                                                i13 = (i80 & i81) + (i80 | i81);
                                                q = i13 % 128;
                                                if (i13 % 2 == 0) {
                                                    int i82 = 4 % 5;
                                                }
                                                str = BuildConfig.FLAVOR;
                                            }
                                        } else if (nADRARosterItem5.getGender().equalsIgnoreCase("transgender")) {
                                            int i710 = q;
                                            i12 = (i710 & 117) + (i710 | 117);
                                            p = i12 % 128;
                                            if (i12 % 2 != 0) {
                                                int i711 = 88 / 0;
                                            }
                                            str = "transgender";
                                        } else {
                                            int i712 = p;
                                            int i713 = i712 & 105;
                                            int i83 = (i712 | 105) & (~i713);
                                            int i84 = i713 << i17;
                                            i13 = (i83 & i84) + (i83 | i84);
                                            q = i13 % 128;
                                            if (i13 % 2 == 0) {
                                                int i85 = 4 % 5;
                                            }
                                            str = BuildConfig.FLAVOR;
                                        }
                                    }
                                } else if (nADRARosterItem4.getGender().equalsIgnoreCase("female")) {
                                    nADRARosterItem5 = this.ag.h().get(i35);
                                    int i714 = p;
                                    int i715 = i714 & 31;
                                    int i716 = (i714 ^ 31) | i715;
                                    i11 = (i715 & i716) + (i716 | i715);
                                    q = i11 % 128;
                                    if (i11 % 2 == 0) {
                                        int i717 = 83 / 0;
                                        if (nADRARosterItem5.getGender().equalsIgnoreCase("transgender")) {
                                            int i718 = q;
                                            i12 = (i718 & 117) + (i718 | 117);
                                            p = i12 % 128;
                                            if (i12 % 2 != 0) {
                                                int i719 = 88 / 0;
                                            }
                                            str = "transgender";
                                        } else {
                                            int i7110 = p;
                                            int i7111 = i7110 & 105;
                                            int i86 = (i7110 | 105) & (~i7111);
                                            int i87 = i7111 << i17;
                                            i13 = (i86 & i87) + (i86 | i87);
                                            q = i13 % 128;
                                            if (i13 % 2 == 0) {
                                                int i88 = 4 % 5;
                                            }
                                            str = BuildConfig.FLAVOR;
                                        }
                                    } else if (nADRARosterItem5.getGender().equalsIgnoreCase("transgender")) {
                                        int i7112 = q;
                                        i12 = (i7112 & 117) + (i7112 | 117);
                                        p = i12 % 128;
                                        if (i12 % 2 != 0) {
                                            int i7113 = 88 / 0;
                                        }
                                        str = "transgender";
                                    } else {
                                        int i7114 = p;
                                        int i7115 = i7114 & 105;
                                        int i89 = (i7114 | 105) & (~i7115);
                                        int i810 = i7115 << i17;
                                        i13 = (i89 & i810) + (i89 | i810);
                                        q = i13 % 128;
                                        if (i13 % 2 == 0) {
                                            int i811 = 4 % 5;
                                        }
                                        str = BuildConfig.FLAVOR;
                                    }
                                }
                            }
                            nADRARosterItem2 = this.ag.h().get(i35);
                            int i90 = p;
                            int i91 = i90 | 73;
                            i3 = ((i91 << 1) - (~(-((~(i90 & 73)) & i91)))) - 1;
                            q = i3 % 128;
                            if (i3 % 2 != 0) {
                                nADRARosterItem2.getRelation().equalsIgnoreCase("MOTHER");
                                Object obj5 = null;
                                obj5.hashCode();
                                throw null;
                            }
                            relation = nADRARosterItem2.getRelation();
                            if (!relation.equalsIgnoreCase("MOTHER") || relation.equalsIgnoreCase("FATHER")) {
                                int i92 = p;
                                int i93 = i92 & 97;
                                int i94 = (i93 - (~((i92 ^ 97) | i93))) - i17;
                                q = i94 % 128;
                                int i95 = i94 % 2;
                                i4 = 190;
                            } else if (relation.equalsIgnoreCase("SISTER")) {
                                int i96 = q;
                                int i97 = i96 & 49;
                                int i98 = -(-((i96 ^ 49) | i97));
                                int i99 = (i97 & i98) + (i98 | i97);
                                p = i99 % 128;
                                int i100 = i99 % 2;
                                i4 = 191;
                            } else {
                                int i101 = q;
                                int i102 = ((i101 ^ 48) + ((i101 & 48) << i17)) - i17;
                                p = i102 % 128;
                                if (i102 % 2 != 0) {
                                    relation.equalsIgnoreCase("BROTHER");
                                    Object obj6 = null;
                                    obj6.hashCode();
                                    throw null;
                                }
                                if (relation.equalsIgnoreCase("BROTHER")) {
                                    int i103 = p;
                                    int i104 = (i103 & 31) + (i103 | 31);
                                    q = i104 % 128;
                                    int i105 = i104 % 2;
                                    int i910 = q;
                                    int i911 = i910 & 49;
                                    int i912 = -(-((i910 ^ 49) | i911));
                                    int i913 = (i911 & i912) + (i912 | i911);
                                    p = i913 % 128;
                                    int i106 = i913 % 2;
                                    i4 = 191;
                                } else if (relation.equalsIgnoreCase("WIFE")) {
                                    int i107 = p + 111;
                                    q = i107 % 128;
                                    i4 = i107 % 2 == 0 ? 19442 : 272;
                                } else if (relation.equalsIgnoreCase("HUSBAND")) {
                                    int i108 = q;
                                    int i109 = (i108 ^ 39) + ((i108 & 39) << i17);
                                    p = i109 % 128;
                                    int i110 = i109 % 2;
                                    int i111 = ((i108 ^ 107) - (~((i108 & 107) << i17))) - i17;
                                    p = i111 % 128;
                                    int i112 = i111 % 2;
                                    i4 = 271;
                                } else if (((relation.equalsIgnoreCase("SON") ? 1 : 0) ^ i17) != 0) {
                                    int i113 = p;
                                    int i114 = (i113 & 45) + (i113 | 45);
                                    q = i114 % 128;
                                    if (i114 % 2 == 0) {
                                        relation.equalsIgnoreCase("DAUGHTER");
                                        throw null;
                                    }
                                    if (relation.equalsIgnoreCase("DAUGHTER")) {
                                        int i115 = q + 41;
                                        p = i115 % 128;
                                        int i116 = i115 % 2;
                                        int i117 = q;
                                        int i118 = ((i117 & 117) - (~(-(-(i117 | 117))))) - i17;
                                        p = i118 % 128;
                                        int i119 = i118 % 2;
                                        i4 = 273;
                                    } else {
                                        int i120 = q + 42;
                                        int i121 = (i120 ^ (-1)) + (i120 << i17);
                                        p = i121 % 128;
                                        int i122 = i121 % 2;
                                        i4 = 0;
                                    }
                                } else {
                                    int i1110 = q;
                                    int i1111 = ((i1110 & 117) - (~(-(-(i1110 | 117))))) - i17;
                                    p = i1111 % 128;
                                    int i1112 = i1111 % 2;
                                    i4 = 273;
                                }
                            }
                            nADRARosterItem3 = this.ag.h().get(i35);
                            int i123 = p + 41;
                            q = i123 % 128;
                            int i124 = i123 % 2;
                            if (!nADRARosterItem3.getDisability().equalsIgnoreCase("t")) {
                                i6 = 1;
                            } else {
                                int i125 = p;
                                int i126 = i125 & 95;
                                int i127 = -(-((i125 ^ 95) | i126));
                                i5 = (i126 ^ i127) + ((i127 & i126) << 1);
                                q = i5 % 128;
                                if (i5 % 2 == 0) {
                                    i6 = 1;
                                } else {
                                    i6 = 0;
                                }
                            }
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
                            int i128 = q;
                            int i129 = i128 & 91;
                            int i130 = i128 | 91;
                            int i131 = (i129 ^ i130) + ((i129 & i130) << 1);
                            String str3 = str2;
                            p = i131 % 128;
                            int i132 = i131 % 2;
                            try {
                                NADRARosterItem nADRARosterItem7 = this.ag.h().get(i35);
                                int i133 = p;
                                int i134 = (-2) - (((i133 ^ 76) + ((i133 & 76) << 1)) ^ (-1));
                                i7 = size;
                                q = i134 % 128;
                                int i135 = i134 % 2;
                                try {
                                    date = simpleDateFormat.parse(nADRARosterItem7.getAge());
                                    calendar = Calendar.getInstance();
                                    int i136 = p;
                                    arrayList = arrayList3;
                                    int i137 = i136 & 101;
                                    int i138 = ((i136 ^ 101) | i137) << 1;
                                    int i139 = -((~i137) & (i136 | 101));
                                    i9 = (i138 ^ i139) + ((i139 & i138) << 1);
                                    q = i9 % 128;
                                    if (i9 % 2 == 0) {
                                        jSONArray = jSONArray2;
                                        try {
                                            calendar.setTimeInMillis(date.getTime());
                                            int i140 = 2 / 0;
                                        } catch (ParseException unused) {
                                            dC = 0.0d;
                                            this.ad = (BISPApplication) getApplicationContext();
                                            JSONObject jSONObject2 = new JSONObject();
                                            jSONObject2.put("rId", 0);
                                            jSONObject2.put("cnicEnc", this.ag.h().get(i35).getCitizen_number());
                                            jSONObject2.put("cnic", this.ag.h().get(i35).getCitizen_number());
                                            int i141 = q;
                                            int i142 = i141 & 73;
                                            int i143 = (((i141 ^ 73) | i142) << 1) - ((~i142) & (i141 | 73));
                                            p = i143 % 128;
                                            int i144 = i143 % 2;
                                            jSONObject2.put("hhMemberNames", this.ag.h().get(i35).getName());
                                            jSONObject2.put("hhMemberNamesEnc", this.ag.h().get(i35).getName());
                                            jSONObject2.put("dob", this.ag.h().get(i35).getAge());
                                            int i145 = q;
                                            int i146 = i145 & 49;
                                            int i147 = i145 | 49;
                                            int i148 = ((i146 | i147) << 1) - (i147 ^ i146);
                                            p = i148 % 128;
                                            int i149 = i148 % 2;
                                            jSONObject2.put("age", dC);
                                            jSONObject2.put("maritalStatus", BuildConfig.FLAVOR);
                                            jSONObject2.put("maritalStatusCode", i);
                                            jSONObject2.put("gender", str);
                                            jSONObject2.put("relationToHhHead", i4);
                                            jSONObject2.put("formNo", this.ak.j());
                                            jSONObject2.put("disabilityStatus", BuildConfig.FLAVOR);
                                            jSONObject2.put("disabilityCode", i6);
                                            int i150 = q;
                                            int i151 = (i150 & (-34)) | ((~i150) & 33);
                                            int i152 = (i150 & 33) << 1;
                                            int i153 = ((i151 | i152) << 1) - (i152 ^ i151);
                                            p = i153 % 128;
                                            int i154 = i153 % 2;
                                            jSONObject2.put("havingChronicDiseaseCode", 0);
                                            jSONObject2.put("isLiterate", "0");
                                            jSONObject2.put("goneToSchoolCode", 0);
                                            jSONObject2.put("educationLevelCode", 0);
                                            jSONObject2.put("workStatusCode", 0);
                                            jSONObject2.put("workStatus", BuildConfig.FLAVOR);
                                            jSONObject2.put("lastWeekWorkingHours", 0);
                                            jSONObject2.put("employmentCode", 0);
                                            int i155 = p;
                                            int i156 = i155 & 21;
                                            int i157 = ((((i155 ^ 21) | i156) << 1) - (~(-((i155 | 21) & (~i156))))) - 1;
                                            q = i157 % 128;
                                            int i158 = i157 % 2;
                                            jSONObject2.put("employmentStatus", BuildConfig.FLAVOR);
                                            jSONObject2.put("mobile_network_name", BuildConfig.FLAVOR);
                                            jSONObject2.put("mobile_no", BuildConfig.FLAVOR);
                                            jSONObject2.put("update_type", "add_roster");
                                            jSONObject2.put("banks_name", BuildConfig.FLAVOR);
                                            jSONObject2.put("branch_code", 0);
                                            jSONObject2.put("bank_address", BuildConfig.FLAVOR);
                                            jSONObject2.put("account_title", BuildConfig.FLAVOR);
                                            jSONObject2.put("account_number", BuildConfig.FLAVOR);
                                            jSONObject2.put("endBy", this.ak.z());
                                            jSONObject2.put("endByIp", ipAddress);
                                            jSONObject2.put("relation", this.ag.h().get(i35).getRelation());
                                            JSONArray jSONArray3 = jSONArray;
                                            jSONArray3.put(i35, jSONObject2);
                                            rosterItem = new RosterItem(this.al, this.an, this.ao, this.ap, this.ag.h().get(i35).getCitizen_number(), i6, BuildConfig.FLAVOR, BuildConfig.FLAVOR, this.ag.h().get(i35).getAge(), 0, 0, BuildConfig.FLAVOR, this.am, str, 0, 0, this.ag.h().get(i35).getName(), false, 0, BuildConfig.FLAVOR, i, BuildConfig.FLAVOR, i4, 0L, BuildConfig.FLAVOR, 0, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR);
                                            int i159 = p;
                                            int i160 = (i159 & (-124)) | ((~i159) & 123);
                                            int i161 = -(-((i159 & 123) << 1));
                                            i8 = (i160 & i161) + (i161 | i160);
                                            q = i8 % 128;
                                            if (i8 % 2 == 0) {
                                                arrayList2 = arrayList;
                                                arrayList2.add(rosterItem);
                                                int i162 = i35 ^ 117;
                                                i35 = ((((i35 & 117) | i162) << 1) - (~(-i162))) - 1;
                                            } else {
                                                arrayList2 = arrayList;
                                                arrayList2.add(rosterItem);
                                                i35 = ((i35 & 2) + (i35 | 2)) - 1;
                                            }
                                            arrayList3 = arrayList2;
                                            str2 = str3;
                                            size = i7;
                                            jSONArray2 = jSONArray3;
                                            i14 = 2;
                                            i17 = 1;
                                            i27 = 0;
                                        }
                                    } else {
                                        jSONArray = jSONArray2;
                                        calendar.setTimeInMillis(date.getTime());
                                    }
                                    int i163 = calendar.get(1);
                                    int i164 = calendar.get(2);
                                    int i165 = q;
                                    int i166 = (i165 ^ 15) + ((i165 & 15) << 1);
                                    p = i166 % 128;
                                    try {
                                        dC = ag.c(i166 % 2 != 0 ? calendar.get(4) : calendar.get(5), i164, i163);
                                        int i167 = p;
                                        int i168 = (i167 ^ 57) + ((i167 & 57) << 1);
                                        q = i168 % 128;
                                        int i169 = i168 % 2;
                                    } catch (ParseException unused2) {
                                        dC = 0.0d;
                                    }
                                } catch (ParseException unused3) {
                                    arrayList = arrayList3;
                                    jSONArray = jSONArray2;
                                }
                            } catch (ParseException unused4) {
                                arrayList = arrayList3;
                                jSONArray = jSONArray2;
                                i7 = size;
                            }
                            this.ad = (BISPApplication) getApplicationContext();
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("rId", 0);
                            jSONObject3.put("cnicEnc", this.ag.h().get(i35).getCitizen_number());
                            jSONObject3.put("cnic", this.ag.h().get(i35).getCitizen_number());
                            int i1410 = q;
                            int i1411 = i1410 & 73;
                            int i1412 = (((i1410 ^ 73) | i1411) << 1) - ((~i1411) & (i1410 | 73));
                            p = i1412 % 128;
                            int i1413 = i1412 % 2;
                            jSONObject3.put("hhMemberNames", this.ag.h().get(i35).getName());
                            jSONObject3.put("hhMemberNamesEnc", this.ag.h().get(i35).getName());
                            jSONObject3.put("dob", this.ag.h().get(i35).getAge());
                            int i1414 = q;
                            int i1415 = i1414 & 49;
                            int i1416 = i1414 | 49;
                            int i1417 = ((i1415 | i1416) << 1) - (i1416 ^ i1415);
                            p = i1417 % 128;
                            int i1418 = i1417 % 2;
                            jSONObject3.put("age", dC);
                            jSONObject3.put("maritalStatus", BuildConfig.FLAVOR);
                            jSONObject3.put("maritalStatusCode", i);
                            jSONObject3.put("gender", str);
                            jSONObject3.put("relationToHhHead", i4);
                            jSONObject3.put("formNo", this.ak.j());
                            jSONObject3.put("disabilityStatus", BuildConfig.FLAVOR);
                            jSONObject3.put("disabilityCode", i6);
                            int i1510 = q;
                            int i1511 = (i1510 & (-34)) | ((~i1510) & 33);
                            int i1512 = (i1510 & 33) << 1;
                            int i1513 = ((i1511 | i1512) << 1) - (i1512 ^ i1511);
                            p = i1513 % 128;
                            int i1514 = i1513 % 2;
                            jSONObject3.put("havingChronicDiseaseCode", 0);
                            jSONObject3.put("isLiterate", "0");
                            jSONObject3.put("goneToSchoolCode", 0);
                            jSONObject3.put("educationLevelCode", 0);
                            jSONObject3.put("workStatusCode", 0);
                            jSONObject3.put("workStatus", BuildConfig.FLAVOR);
                            jSONObject3.put("lastWeekWorkingHours", 0);
                            jSONObject3.put("employmentCode", 0);
                            int i1515 = p;
                            int i1516 = i1515 & 21;
                            int i1517 = ((((i1515 ^ 21) | i1516) << 1) - (~(-((i1515 | 21) & (~i1516))))) - 1;
                            q = i1517 % 128;
                            int i1518 = i1517 % 2;
                            jSONObject3.put("employmentStatus", BuildConfig.FLAVOR);
                            jSONObject3.put("mobile_network_name", BuildConfig.FLAVOR);
                            jSONObject3.put("mobile_no", BuildConfig.FLAVOR);
                            jSONObject3.put("update_type", "add_roster");
                            jSONObject3.put("banks_name", BuildConfig.FLAVOR);
                            jSONObject3.put("branch_code", 0);
                            jSONObject3.put("bank_address", BuildConfig.FLAVOR);
                            jSONObject3.put("account_title", BuildConfig.FLAVOR);
                            jSONObject3.put("account_number", BuildConfig.FLAVOR);
                            jSONObject3.put("endBy", this.ak.z());
                            jSONObject3.put("endByIp", ipAddress);
                            jSONObject3.put("relation", this.ag.h().get(i35).getRelation());
                            JSONArray jSONArray4 = jSONArray;
                            jSONArray4.put(i35, jSONObject3);
                            rosterItem = new RosterItem(this.al, this.an, this.ao, this.ap, this.ag.h().get(i35).getCitizen_number(), i6, BuildConfig.FLAVOR, BuildConfig.FLAVOR, this.ag.h().get(i35).getAge(), 0, 0, BuildConfig.FLAVOR, this.am, str, 0, 0, this.ag.h().get(i35).getName(), false, 0, BuildConfig.FLAVOR, i, BuildConfig.FLAVOR, i4, 0L, BuildConfig.FLAVOR, 0, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR);
                            int i1519 = p;
                            int i1610 = (i1519 & (-124)) | ((~i1519) & 123);
                            int i1611 = -(-((i1519 & 123) << 1));
                            i8 = (i1610 & i1611) + (i1611 | i1610);
                            q = i8 % 128;
                            if (i8 % 2 == 0) {
                                arrayList2 = arrayList;
                                arrayList2.add(rosterItem);
                                int i1612 = i35 ^ 117;
                                i35 = ((((i35 & 117) | i1612) << 1) - (~(-i1612))) - 1;
                            } else {
                                arrayList2 = arrayList;
                                arrayList2.add(rosterItem);
                                i35 = ((i35 & 2) + (i35 | 2)) - 1;
                            }
                            arrayList3 = arrayList2;
                            str2 = str3;
                            size = i7;
                            jSONArray2 = jSONArray4;
                            i14 = 2;
                            i17 = 1;
                            i27 = 0;
                        } else {
                            int i170 = p;
                            int i171 = i170 & 79;
                            int i172 = (i170 ^ 79) | i171;
                            int i173 = (i171 ^ i172) + ((i171 & i172) << i17);
                            q = i173 % 128;
                            int i174 = i173 % i14;
                            int i175 = (i170 ^ 50) + ((i170 & 50) << i17);
                            int i176 = (i175 ^ (-1)) + (i175 << i17);
                            q = i176 % 128;
                            int i177 = i176 % i14;
                            i = 202;
                        }
                        int i178 = q;
                        int i179 = i178 ^ 85;
                        int i180 = (((i178 & 85) | i179) << i17) - i179;
                        p = i180 % 128;
                        int i181 = i180 % i14;
                        nADRARosterItem = this.ag.h().get(i35);
                        int i610 = q;
                        int i611 = i610 & 103;
                        i2 = (((i610 | 103) & (~i611)) - (~(-(-(i611 << 1))))) - i17;
                        p = i2 % 128;
                        str = "male";
                        if (i2 % i14 == 0) {
                            nADRARosterItem.getGender().equalsIgnoreCase("male");
                            Object obj7 = null;
                            obj7.hashCode();
                            throw null;
                        }
                        if (!nADRARosterItem.getGender().equalsIgnoreCase("male")) {
                            nADRARosterItem4 = this.ag.h().get(i35);
                            int i720 = q;
                            i10 = (((~i720) & 33) | (i720 & (-34))) + ((i720 & 33) << i17);
                            p = i10 % 128;
                            str = "female";
                            if (i10 % 2 != 0) {
                                zEqualsIgnoreCase = nADRARosterItem4.getGender().equalsIgnoreCase("female");
                                int i721 = 93 / 0;
                                if (zEqualsIgnoreCase != i17) {
                                    nADRARosterItem5 = this.ag.h().get(i35);
                                    int i7116 = p;
                                    int i7117 = i7116 & 31;
                                    int i7118 = (i7116 ^ 31) | i7117;
                                    i11 = (i7117 & i7118) + (i7118 | i7117);
                                    q = i11 % 128;
                                    if (i11 % 2 == 0) {
                                        int i7119 = 83 / 0;
                                        if (nADRARosterItem5.getGender().equalsIgnoreCase("transgender")) {
                                            int i71110 = q;
                                            i12 = (i71110 & 117) + (i71110 | 117);
                                            p = i12 % 128;
                                            if (i12 % 2 != 0) {
                                                int i71111 = 88 / 0;
                                            }
                                            str = "transgender";
                                        } else {
                                            int i71112 = p;
                                            int i71113 = i71112 & 105;
                                            int i812 = (i71112 | 105) & (~i71113);
                                            int i813 = i71113 << i17;
                                            i13 = (i812 & i813) + (i812 | i813);
                                            q = i13 % 128;
                                            if (i13 % 2 == 0) {
                                                int i814 = 4 % 5;
                                            }
                                            str = BuildConfig.FLAVOR;
                                        }
                                    } else if (nADRARosterItem5.getGender().equalsIgnoreCase("transgender")) {
                                        int i71114 = q;
                                        i12 = (i71114 & 117) + (i71114 | 117);
                                        p = i12 % 128;
                                        if (i12 % 2 != 0) {
                                            int i71115 = 88 / 0;
                                        }
                                        str = "transgender";
                                    } else {
                                        int i71116 = p;
                                        int i71117 = i71116 & 105;
                                        int i815 = (i71116 | 105) & (~i71117);
                                        int i816 = i71117 << i17;
                                        i13 = (i815 & i816) + (i815 | i816);
                                        q = i13 % 128;
                                        if (i13 % 2 == 0) {
                                            int i817 = 4 % 5;
                                        }
                                        str = BuildConfig.FLAVOR;
                                    }
                                }
                            } else if (nADRARosterItem4.getGender().equalsIgnoreCase("female")) {
                                nADRARosterItem5 = this.ag.h().get(i35);
                                int i71118 = p;
                                int i71119 = i71118 & 31;
                                int i71120 = (i71118 ^ 31) | i71119;
                                i11 = (i71119 & i71120) + (i71120 | i71119);
                                q = i11 % 128;
                                if (i11 % 2 == 0) {
                                    int i71121 = 83 / 0;
                                    if (nADRARosterItem5.getGender().equalsIgnoreCase("transgender")) {
                                        int i711110 = q;
                                        i12 = (i711110 & 117) + (i711110 | 117);
                                        p = i12 % 128;
                                        if (i12 % 2 != 0) {
                                            int i711111 = 88 / 0;
                                        }
                                        str = "transgender";
                                    } else {
                                        int i711112 = p;
                                        int i711113 = i711112 & 105;
                                        int i818 = (i711112 | 105) & (~i711113);
                                        int i819 = i711113 << i17;
                                        i13 = (i818 & i819) + (i818 | i819);
                                        q = i13 % 128;
                                        if (i13 % 2 == 0) {
                                            int i8110 = 4 % 5;
                                        }
                                        str = BuildConfig.FLAVOR;
                                    }
                                } else if (nADRARosterItem5.getGender().equalsIgnoreCase("transgender")) {
                                    int i711114 = q;
                                    i12 = (i711114 & 117) + (i711114 | 117);
                                    p = i12 % 128;
                                    if (i12 % 2 != 0) {
                                        int i711115 = 88 / 0;
                                    }
                                    str = "transgender";
                                } else {
                                    int i711116 = p;
                                    int i711117 = i711116 & 105;
                                    int i8111 = (i711116 | 105) & (~i711117);
                                    int i8112 = i711117 << i17;
                                    i13 = (i8111 & i8112) + (i8111 | i8112);
                                    q = i13 % 128;
                                    if (i13 % 2 == 0) {
                                        int i8113 = 4 % 5;
                                    }
                                    str = BuildConfig.FLAVOR;
                                }
                            }
                        }
                        nADRARosterItem2 = this.ag.h().get(i35);
                        int i914 = p;
                        int i915 = i914 | 73;
                        i3 = ((i915 << 1) - (~(-((~(i914 & 73)) & i915)))) - 1;
                        q = i3 % 128;
                        if (i3 % 2 != 0) {
                            nADRARosterItem2.getRelation().equalsIgnoreCase("MOTHER");
                            Object obj8 = null;
                            obj8.hashCode();
                            throw null;
                        }
                        relation = nADRARosterItem2.getRelation();
                        if (relation.equalsIgnoreCase("MOTHER")) {
                            int i916 = p;
                            int i917 = i916 & 97;
                            int i918 = (i917 - (~((i916 ^ 97) | i917))) - i17;
                            q = i918 % 128;
                            int i919 = i918 % 2;
                            i4 = 190;
                        } else {
                            int i9110 = p;
                            int i9111 = i9110 & 97;
                            int i9112 = (i9111 - (~((i9110 ^ 97) | i9111))) - i17;
                            q = i9112 % 128;
                            int i9113 = i9112 % 2;
                            i4 = 190;
                        }
                        nADRARosterItem3 = this.ag.h().get(i35);
                        int i1210 = p + 41;
                        q = i1210 % 128;
                        int i1211 = i1210 % 2;
                        if (!nADRARosterItem3.getDisability().equalsIgnoreCase("t")) {
                            i6 = 1;
                        } else {
                            int i1212 = p;
                            int i1213 = i1212 & 95;
                            int i1214 = -(-((i1212 ^ 95) | i1213));
                            i5 = (i1213 ^ i1214) + ((i1214 & i1213) << 1);
                            q = i5 % 128;
                            if (i5 % 2 == 0) {
                                i6 = 1;
                            } else {
                                i6 = 0;
                            }
                        }
                        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MM-yyyy");
                        int i1215 = q;
                        int i1216 = i1215 & 91;
                        int i1310 = i1215 | 91;
                        int i1311 = (i1216 ^ i1310) + ((i1216 & i1310) << 1);
                        String str4 = str2;
                        p = i1311 % 128;
                        int i1312 = i1311 % 2;
                        NADRARosterItem nADRARosterItem8 = this.ag.h().get(i35);
                        int i1313 = p;
                        int i1314 = (-2) - (((i1313 ^ 76) + ((i1313 & 76) << 1)) ^ (-1));
                        i7 = size;
                        q = i1314 % 128;
                        int i1315 = i1314 % 2;
                        date = simpleDateFormat2.parse(nADRARosterItem8.getAge());
                        calendar = Calendar.getInstance();
                        int i1316 = p;
                        arrayList = arrayList3;
                        int i1317 = i1316 & 101;
                        int i1318 = ((i1316 ^ 101) | i1317) << 1;
                        int i1319 = -((~i1317) & (i1316 | 101));
                        i9 = (i1318 ^ i1319) + ((i1319 & i1318) << 1);
                        q = i9 % 128;
                        if (i9 % 2 == 0) {
                            jSONArray = jSONArray2;
                            calendar.setTimeInMillis(date.getTime());
                            int i1419 = 2 / 0;
                        } else {
                            jSONArray = jSONArray2;
                            calendar.setTimeInMillis(date.getTime());
                        }
                        int i1613 = calendar.get(1);
                        int i1614 = calendar.get(2);
                        int i1615 = q;
                        int i1616 = (i1615 ^ 15) + ((i1615 & 15) << 1);
                        p = i1616 % 128;
                        dC = ag.c(i1616 % 2 != 0 ? calendar.get(4) : calendar.get(5), i1614, i1613);
                        int i1617 = p;
                        int i1618 = (i1617 ^ 57) + ((i1617 & 57) << 1);
                        q = i1618 % 128;
                        int i1619 = i1618 % 2;
                        this.ad = (BISPApplication) getApplicationContext();
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("rId", 0);
                        jSONObject4.put("cnicEnc", this.ag.h().get(i35).getCitizen_number());
                        jSONObject4.put("cnic", this.ag.h().get(i35).getCitizen_number());
                        int i14110 = q;
                        int i14111 = i14110 & 73;
                        int i14112 = (((i14110 ^ 73) | i14111) << 1) - ((~i14111) & (i14110 | 73));
                        p = i14112 % 128;
                        int i14113 = i14112 % 2;
                        jSONObject4.put("hhMemberNames", this.ag.h().get(i35).getName());
                        jSONObject4.put("hhMemberNamesEnc", this.ag.h().get(i35).getName());
                        jSONObject4.put("dob", this.ag.h().get(i35).getAge());
                        int i14114 = q;
                        int i14115 = i14114 & 49;
                        int i14116 = i14114 | 49;
                        int i14117 = ((i14115 | i14116) << 1) - (i14116 ^ i14115);
                        p = i14117 % 128;
                        int i14118 = i14117 % 2;
                        jSONObject4.put("age", dC);
                        jSONObject4.put("maritalStatus", BuildConfig.FLAVOR);
                        jSONObject4.put("maritalStatusCode", i);
                        jSONObject4.put("gender", str);
                        jSONObject4.put("relationToHhHead", i4);
                        jSONObject4.put("formNo", this.ak.j());
                        jSONObject4.put("disabilityStatus", BuildConfig.FLAVOR);
                        jSONObject4.put("disabilityCode", i6);
                        int i15110 = q;
                        int i15111 = (i15110 & (-34)) | ((~i15110) & 33);
                        int i15112 = (i15110 & 33) << 1;
                        int i15113 = ((i15111 | i15112) << 1) - (i15112 ^ i15111);
                        p = i15113 % 128;
                        int i15114 = i15113 % 2;
                        jSONObject4.put("havingChronicDiseaseCode", 0);
                        jSONObject4.put("isLiterate", "0");
                        jSONObject4.put("goneToSchoolCode", 0);
                        jSONObject4.put("educationLevelCode", 0);
                        jSONObject4.put("workStatusCode", 0);
                        jSONObject4.put("workStatus", BuildConfig.FLAVOR);
                        jSONObject4.put("lastWeekWorkingHours", 0);
                        jSONObject4.put("employmentCode", 0);
                        int i15115 = p;
                        int i15116 = i15115 & 21;
                        int i15117 = ((((i15115 ^ 21) | i15116) << 1) - (~(-((i15115 | 21) & (~i15116))))) - 1;
                        q = i15117 % 128;
                        int i15118 = i15117 % 2;
                        jSONObject4.put("employmentStatus", BuildConfig.FLAVOR);
                        jSONObject4.put("mobile_network_name", BuildConfig.FLAVOR);
                        jSONObject4.put("mobile_no", BuildConfig.FLAVOR);
                        jSONObject4.put("update_type", "add_roster");
                        jSONObject4.put("banks_name", BuildConfig.FLAVOR);
                        jSONObject4.put("branch_code", 0);
                        jSONObject4.put("bank_address", BuildConfig.FLAVOR);
                        jSONObject4.put("account_title", BuildConfig.FLAVOR);
                        jSONObject4.put("account_number", BuildConfig.FLAVOR);
                        jSONObject4.put("endBy", this.ak.z());
                        jSONObject4.put("endByIp", ipAddress);
                        jSONObject4.put("relation", this.ag.h().get(i35).getRelation());
                        JSONArray jSONArray5 = jSONArray;
                        jSONArray5.put(i35, jSONObject4);
                        rosterItem = new RosterItem(this.al, this.an, this.ao, this.ap, this.ag.h().get(i35).getCitizen_number(), i6, BuildConfig.FLAVOR, BuildConfig.FLAVOR, this.ag.h().get(i35).getAge(), 0, 0, BuildConfig.FLAVOR, this.am, str, 0, 0, this.ag.h().get(i35).getName(), false, 0, BuildConfig.FLAVOR, i, BuildConfig.FLAVOR, i4, 0L, BuildConfig.FLAVOR, 0, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR);
                        int i15119 = p;
                        int i16110 = (i15119 & (-124)) | ((~i15119) & 123);
                        int i16111 = -(-((i15119 & 123) << 1));
                        i8 = (i16110 & i16111) + (i16111 | i16110);
                        q = i8 % 128;
                        if (i8 % 2 == 0) {
                            arrayList2 = arrayList;
                            arrayList2.add(rosterItem);
                            int i16112 = i35 ^ 117;
                            i35 = ((((i35 & 117) | i16112) << 1) - (~(-i16112))) - 1;
                        } else {
                            arrayList2 = arrayList;
                            arrayList2.add(rosterItem);
                            i35 = ((i35 & 2) + (i35 | 2)) - 1;
                        }
                        arrayList3 = arrayList2;
                        str2 = str4;
                        size = i7;
                        jSONArray2 = jSONArray5;
                        i14 = 2;
                        i17 = 1;
                        i27 = 0;
                    }
                    Serializable serializable = arrayList3;
                    Intent intent = new Intent();
                    int i182 = p;
                    int i183 = i182 & 55;
                    int i184 = ((i182 | 55) & (~i183)) + (i183 << 1);
                    q = i184 % 128;
                    int i185 = i184 % 2;
                    intent.putExtra("rosterList", serializable);
                    setResult(-1, intent);
                    finish();
                    int i186 = p;
                    int i187 = (i186 & (-70)) | ((~i186) & 69);
                    int i188 = -(-((i186 & 69) << 1));
                    int i189 = (i187 ^ i188) + ((i188 & i187) << 1);
                    q = i189 % 128;
                    if (i189 % 2 == 0) {
                        throw null;
                    }
                    return;
                } catch (JSONException unused5) {
                    return;
                }
            }
        } else {
            onBackPressed();
            int i190 = p + 82;
            int i191 = (i190 ^ (-1)) + (i190 << 1);
            q = i191 % 128;
            int i192 = i191 % 2;
        }
        int i193 = q;
        int i194 = i193 & 31;
        int i195 = (i193 ^ 31) | i194;
        int i196 = (i194 ^ i195) + ((i195 & i194) << 1);
        p = i196 % 128;
        if (i196 % 2 != 0) {
            throw null;
        }
    }

    public final void u(String str, String str2) {
        String str3;
        int i = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        int i2 = p;
        int i3 = ((i2 & 49) - (~(-(-(i2 | 49))))) - 1;
        q = i3 % 128;
        try {
            if (i3 % 2 == 0) {
                jSONObject.put("Cnic", str);
                jSONObject.put("HHId", str2);
                str3 = this.ad.s;
                int i4 = 66 / 0;
            } else {
                jSONObject.put("Cnic", str);
                jSONObject.put("HHId", str2);
                str3 = this.ad.s;
            }
            int i5 = q;
            int i6 = ((i5 & 100) + (i5 | 100)) - 1;
            p = i6 % 128;
            int i7 = i6 % 2;
            jSONObject.put("SessionId", str3);
            jSONObject.put("IpAddress", ac.h(true));
            int i8 = q;
            int i9 = (((i8 ^ 123) | (i8 & 123)) << 1) - (((~i8) & 123) | (i8 & (-124)));
            p = i9 % 128;
            int i10 = i9 % 2;
            jSONObject.put("sessionUserCnic", this.ak.r());
            jSONObject.put("Type", "update");
            int i11 = p + 89;
            q = i11 % 128;
            int i12 = i11 % 2;
            String string = jSONObject.toString();
            byte[] bArrB = ivas.gov.bisp.enumeration.bK.b.b(this.ak.k());
            SessionManager sessionManager = this.ak;
            int i13 = q;
            int i14 = (i13 ^ 9) + ((i13 & 9) << 1);
            p = i14 % 128;
            int i15 = i14 % 2;
            jSONObject2.put("string1", ivas.gov.bisp.enumeration.bK.b.d(string, bArrB, ivas.gov.bisp.enumeration.bK.b.b(sessionManager.m())));
            ax.h(this.ai, "Please wait!");
            C0161an c0161an = new C0161an(this);
            int i16 = p;
            int i17 = (i16 | 39) << 1;
            int i18 = -(((~i16) & 39) | (i16 & (-40)));
            int i19 = (i17 & i18) + (i18 | i17);
            q = i19 % 128;
            int i20 = i19 % 2;
            ax.e(jSONObject2, this, "https://meladeskapp.bisp.gov.pk/api/Roster/V8MVu3ODp1hu5Dw3DWwA", c0161an);
            int i21 = q;
            int i22 = ((i21 & 121) - (~(-(-(i21 | 121))))) - 1;
            p = i22 % 128;
            if (i22 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (JSONException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x03a8 A[Catch: Exception -> 0x0523, TRY_ENTER, TRY_LEAVE, TryCatch #5 {Exception -> 0x0523, blocks: (B:3:0x001f, B:5:0x0037, B:8:0x0052, B:11:0x006b, B:16:0x00a0, B:19:0x00b5, B:22:0x00ce, B:25:0x0105, B:33:0x0160, B:37:0x017d, B:38:0x0184, B:42:0x0199, B:50:0x01c5, B:53:0x01db, B:56:0x020a, B:59:0x021f, B:60:0x0228, B:63:0x0253, B:66:0x0284, B:70:0x029e, B:72:0x02bf, B:74:0x02c7, B:75:0x02ca, B:78:0x02cd, B:81:0x02ee, B:83:0x02fe, B:86:0x0326, B:91:0x0333, B:93:0x0354, B:97:0x036d, B:99:0x0375, B:102:0x039c, B:103:0x03a2, B:104:0x03a5, B:107:0x03a8, B:89:0x032d, B:43:0x01a2, B:45:0x01aa, B:46:0x01ad, B:31:0x013f, B:109:0x03da, B:111:0x03e2, B:112:0x03e5, B:115:0x03e8, B:117:0x03f0, B:121:0x03f4, B:124:0x0413, B:126:0x041d, B:131:0x0422, B:136:0x043a, B:139:0x0458, B:142:0x045e, B:146:0x0477, B:151:0x049a, B:154:0x04b8, B:156:0x04c0, B:162:0x04cb, B:164:0x04e6, B:166:0x0500, B:161:0x04c5), top: B:183:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:193:0x039b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x03ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x036c  */
    /* JADX WARN: Code duplicated, block: B:99:0x0375 A[Catch: Exception -> 0x0523, TRY_LEAVE, TryCatch #5 {Exception -> 0x0523, blocks: (B:3:0x001f, B:5:0x0037, B:8:0x0052, B:11:0x006b, B:16:0x00a0, B:19:0x00b5, B:22:0x00ce, B:25:0x0105, B:33:0x0160, B:37:0x017d, B:38:0x0184, B:42:0x0199, B:50:0x01c5, B:53:0x01db, B:56:0x020a, B:59:0x021f, B:60:0x0228, B:63:0x0253, B:66:0x0284, B:70:0x029e, B:72:0x02bf, B:74:0x02c7, B:75:0x02ca, B:78:0x02cd, B:81:0x02ee, B:83:0x02fe, B:86:0x0326, B:91:0x0333, B:93:0x0354, B:97:0x036d, B:99:0x0375, B:102:0x039c, B:103:0x03a2, B:104:0x03a5, B:107:0x03a8, B:89:0x032d, B:43:0x01a2, B:45:0x01aa, B:46:0x01ad, B:31:0x013f, B:109:0x03da, B:111:0x03e2, B:112:0x03e5, B:115:0x03e8, B:117:0x03f0, B:121:0x03f4, B:124:0x0413, B:126:0x041d, B:131:0x0422, B:136:0x043a, B:139:0x0458, B:142:0x045e, B:146:0x0477, B:151:0x049a, B:154:0x04b8, B:156:0x04c0, B:162:0x04cb, B:164:0x04e6, B:166:0x0500, B:161:0x04c5), top: B:183:0x001f }] */
    public final void w(JSONObject jSONObject) {
        String str;
        String str2;
        final String string;
        String str3;
        String str4;
        Optional<RosterItem> optionalFindAny;
        int i;
        int i2 = 2;
        int i3 = 2 % 2;
        int i4 = p;
        int i5 = (i4 & 117) + (i4 | 117);
        q = i5 % 128;
        int i6 = i5 % 2;
        try {
            String string2 = jSONObject.getString("message".toLowerCase());
            int i7 = q;
            int i8 = (i7 & 28) + (i7 | 28);
            int i9 = 1;
            int i10 = i8 - 1;
            p = i10 % 128;
            int i11 = i10 % 2;
            if (!string2.equalsIgnoreCase("Cnic Found In Nadra Family")) {
                if (!(!string2.equalsIgnoreCase("Cnic Not Found In Nadra Family"))) {
                    int i12 = (-2) - ((q + 96) ^ (-1));
                    p = i12 % 128;
                    int i13 = i12 % 2;
                    z("CNIC Not Found", "Cnic Not Found In Nadra Family", true);
                    int i14 = p;
                    int i15 = i14 & 7;
                    int i16 = ((i14 ^ 7) | i15) << 1;
                    int i17 = -((i14 | 7) & (~i15));
                    int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
                    q = i18 % 128;
                    if (i18 % 2 == 0) {
                        int i19 = 36 / 0;
                        return;
                    }
                    return;
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                int i20 = p;
                int i21 = ((i20 & (-126)) | ((~i20) & 125)) + ((i20 & 125) << 1);
                q = i21 % 128;
                if (i21 % 2 == 0) {
                    builder.setTitle("Alert.!");
                    builder.setMessage("All nadra Members are Updated");
                    int i22 = 5 / 0;
                } else {
                    builder.setTitle("Alert.!");
                    builder.setMessage("All nadra Members are Updated");
                }
                builder.setCancelable(true);
                OooO0OO oooO0OO = new OooO0OO();
                int i23 = q;
                int i24 = ((i23 | 58) << 1) - (i23 ^ 58);
                int i25 = (i24 ^ (-1)) + (i24 << 1);
                p = i25 % 128;
                int i26 = i25 % 2;
                builder.setPositiveButton("ok", oooO0OO);
                AlertDialog alertDialogCreate = builder.create();
                int i27 = q;
                int i28 = (-2) - (((i27 & 76) + (i27 | 76)) ^ (-1));
                p = i28 % 128;
                int i29 = i28 % 2;
                alertDialogCreate.show();
                int i30 = q;
                int i31 = i30 & 23;
                int i32 = ((i30 ^ 23) | i31) << 1;
                int i33 = -((i30 | 23) & (~i31));
                int i34 = (i32 ^ i33) + ((i33 & i32) << 1);
                p = i34 % 128;
                if (i34 % 2 != 0) {
                    int i35 = 39 / 0;
                    return;
                }
                return;
            }
            int i36 = p;
            int i37 = i36 & 45;
            int i38 = -(-((i36 ^ 45) | i37));
            int i39 = ((i37 | i38) << 1) - (i38 ^ i37);
            q = i39 % 128;
            int i40 = i39 % 2;
            JSONArray jSONArray = jSONObject.getJSONArray("familyMembers".toLowerCase());
            int length = jSONArray.length();
            int i41 = q + 71;
            p = i41 % 128;
            if (i41 % 2 != 0) {
                List<RosterItem> list = this.ad.N;
                throw null;
            }
            List<RosterItem> list2 = this.ad.N;
            if (length == 0) {
                z("Roster", "All Family members present in NADRA, already added in roster", true);
                int i42 = q;
                int i43 = i42 & 45;
                int i44 = -(-((i42 ^ 45) | i43));
                int i45 = ((i43 | i44) << 1) - (i44 ^ i43);
                p = i45 % 128;
                int i46 = i45 % 2;
                return;
            }
            int i47 = q;
            int i48 = (i47 & 77) + (i47 | 77);
            p = i48 % 128;
            int i49 = i48 % 2;
            int i50 = ((i47 | 43) << 1) - (i47 ^ 43);
            p = i50 % 128;
            int i51 = i50 % 2;
            int i52 = 0;
            while (i52 < length) {
                int i53 = q;
                int i54 = i53 ^ 7;
                int i55 = -(-((i53 & 7) << i9));
                int i56 = ((i54 | i55) << 1) - (i55 ^ i54);
                p = i56 % 128;
                int i57 = i56 % i2;
                JSONObject jSONObject2 = jSONArray.getJSONObject(i52);
                int i58 = (-2) - ((q + 36) ^ (-1));
                p = i58 % 128;
                if (i58 % i2 != 0) {
                    jSONObject2.has("name".toLowerCase());
                    try {
                        throw null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (jSONObject2.has("name".toLowerCase())) {
                    int i59 = q;
                    int i60 = ((i59 | 99) << 1) - (i59 ^ 99);
                    p = i60 % 128;
                    int i61 = i60 % i2;
                    String string3 = jSONObject2.getString("relation".toLowerCase());
                    int i62 = p;
                    int i63 = (i62 & 25) + (i62 | 25);
                    q = i63 % 128;
                    int i64 = i63 % i2;
                    str = string3;
                } else {
                    int i65 = p;
                    int i66 = ((i65 ^ 1) | (i65 & 1)) << 1;
                    int i67 = -((i65 & (-2)) | ((~i65) & 1));
                    int i68 = (i66 ^ i67) + ((i67 & i66) << 1);
                    q = i68 % 128;
                    int i69 = i68 % i2;
                    str = BuildConfig.FLAVOR;
                }
                if (!jSONObject2.has("name".toLowerCase())) {
                    int i70 = p;
                    int i71 = (i70 & (-96)) | ((~i70) & 95);
                    int i72 = (i70 & 95) << 1;
                    int i73 = (i71 ^ i72) + ((i72 & i71) << 1);
                    q = i73 % 128;
                    int i74 = i73 % i2;
                    str2 = BuildConfig.FLAVOR;
                } else {
                    int i75 = p;
                    int i76 = ((i75 & (-2)) | ((~i75) & 1)) + ((i75 & 1) << 1);
                    q = i76 % 128;
                    if (i76 % i2 == 0) {
                        jSONObject2.getString("name".toLowerCase());
                        Object obj = null;
                        try {
                            obj.hashCode();
                            throw null;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    String string4 = jSONObject2.getString("name".toLowerCase());
                    int i77 = p;
                    int i78 = i77 & 21;
                    int i79 = (i77 | 21) & (~i78);
                    int i80 = -(-(i78 << 1));
                    int i81 = (i79 ^ i80) + ((i79 & i80) << 1);
                    q = i81 % 128;
                    int i82 = i81 % i2;
                    str2 = string4;
                }
                if (!(!jSONObject2.has("englishname".toLowerCase()))) {
                    int i83 = p;
                    int i84 = i83 & 67;
                    int i85 = (i83 ^ 67) | i84;
                    int i86 = (i84 ^ i85) + ((i85 & i84) << 1);
                    q = i86 % 128;
                    int i87 = i86 % i2;
                    jSONObject2.getString("englishname".toLowerCase());
                }
                if (jSONObject2.has("citizenNumber".toLowerCase())) {
                    int i88 = p + 71;
                    q = i88 % 128;
                    if (i88 % i2 == 0) {
                        jSONObject2.getString("citizenNumber".toLowerCase());
                        Object obj2 = null;
                        try {
                            obj2.hashCode();
                            throw null;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    string = jSONObject2.getString("citizenNumber".toLowerCase());
                } else {
                    int i89 = q;
                    int i90 = i89 & 27;
                    int i91 = (i89 | 27) & (~i90);
                    int i92 = i90 << 1;
                    int i93 = ((i91 | i92) << 1) - (i91 ^ i92);
                    p = i93 % 128;
                    int i94 = i93 % i2;
                    string = BuildConfig.FLAVOR;
                }
                if (jSONObject2.has("cardStatus".toLowerCase())) {
                    int i95 = p + 17;
                    q = i95 % 128;
                    int i96 = i95 % 2;
                    String string5 = jSONObject2.getString("cardStatus".toLowerCase());
                    int i97 = p;
                    int i98 = i97 & 13;
                    int i99 = i97 | 13;
                    int i100 = (i98 ^ i99) + ((i99 & i98) << 1);
                    q = i100 % 128;
                    int i101 = i100 % i2;
                    str3 = string5;
                } else {
                    int i102 = q;
                    int i103 = ((i102 | 91) << 1) - (i102 ^ 91);
                    p = i103 % 128;
                    int i104 = i103 % i2;
                    str3 = BuildConfig.FLAVOR;
                }
                if (jSONObject2.has("gender".toLowerCase())) {
                    int i105 = p + 23;
                    q = i105 % 128;
                    int i106 = i105 % i2;
                    jSONObject2.getString("gender".toLowerCase());
                }
                if (jSONObject2.has("age".toLowerCase())) {
                    int i107 = p;
                    int i108 = ((i107 ^ 113) | (i107 & 113)) << 1;
                    int i109 = -((i107 & (-114)) | (113 & (~i107)));
                    int i110 = ((i108 | i109) << 1) - (i109 ^ i108);
                    q = i110 % 128;
                    int i111 = i110 % i2;
                    String string6 = jSONObject2.getString("age".toLowerCase());
                    int i112 = q;
                    int i113 = i112 | 85;
                    int i114 = i113 << 1;
                    int i115 = -((~(i112 & 85)) & i113);
                    int i116 = ((i114 | i115) << 1) - (i114 ^ i115);
                    p = i116 % 128;
                    int i117 = i116 % i2;
                    str4 = string6;
                } else {
                    int i118 = p + 33;
                    q = i118 % 128;
                    int i119 = i118 % i2;
                    str4 = BuildConfig.FLAVOR;
                }
                if (jSONObject2.has("martial_Status".toLowerCase())) {
                    int i120 = q;
                    int i121 = ((i120 & 90) + (i120 | 90)) - 1;
                    p = i121 % 128;
                    if (i121 % i2 != 0) {
                        jSONObject2.getString("martial_Status".toLowerCase());
                        Object obj3 = null;
                        try {
                            obj3.hashCode();
                            throw null;
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    jSONObject2.getString("martial_Status".toLowerCase());
                    int i122 = q;
                    int i123 = (i122 & (-76)) | (75 & (~i122));
                    int i124 = (i122 & 75) << 1;
                    int i125 = (i123 ^ i124) + ((i124 & i123) << 1);
                    p = i125 % 128;
                    int i126 = i125 % i2;
                }
                if (jSONObject2.has("disability".toLowerCase())) {
                    int i127 = q;
                    int i128 = (i127 & (-16)) | (15 & (~i127));
                    int i129 = (i127 & 15) << 1;
                    int i130 = (i128 & i129) + (i129 | i128);
                    p = i130 % 128;
                    int i131 = i130 % i2;
                    jSONObject2.getString("disability".toLowerCase());
                    int i132 = q + 33;
                    p = i132 % 128;
                    int i133 = i132 % i2;
                }
                NADRARosterItem nADRARosterItem = new NADRARosterItem(str, str3, string, str2, BuildConfig.FLAVOR, BuildConfig.FLAVOR, str4, BuildConfig.FLAVOR, BuildConfig.FLAVOR);
                int i134 = q;
                int i135 = i134 & 1;
                int i136 = -(-((i134 ^ 1) | i135));
                int i137 = ((i135 | i136) << 1) - (i136 ^ i135);
                p = i137 % 128;
                if (i137 % i2 != 0) {
                    if (Build.VERSION.SDK_INT >= 75) {
                        Stream<RosterItem> stream = list2.stream();
                        Predicate<? super RosterItem> predicate = new Predicate() { // from class: ivas.gov.bisp.enumeration.bi.w
                            private static int a = 1;
                            private static int b;

                            @Override // java.util.function.Predicate
                            public final boolean test(Object obj4) {
                                boolean zEquals;
                                int i138 = 2 % 2;
                                int i139 = b + 37;
                                a = i139 % 128;
                                int i140 = i139 % 2;
                                String str5 = string;
                                RosterItem rosterItem = (RosterItem) obj4;
                                int i141 = NADRARosterListActivity.ac;
                                int i142 = b;
                                int i143 = i142 ^ 93;
                                int i144 = (i142 & 93) << 1;
                                int i145 = (i143 & i144) + (i144 | i143);
                                a = i145 % 128;
                                if (i145 % 2 == 0) {
                                    zEquals = rosterItem.getCnic().equals(str5);
                                    int i146 = 59 / 0;
                                } else {
                                    zEquals = rosterItem.getCnic().equals(str5);
                                }
                                int i147 = b;
                                int i148 = i147 & 57;
                                int i149 = (i148 - (~(-(-((i147 ^ 57) | i148))))) - 1;
                                a = i149 % 128;
                                int i150 = i149 % 2;
                                return zEquals;
                            }
                        };
                        int i138 = p;
                        int i139 = ((~i138) & 69) | (i138 & (-70));
                        int i140 = (i138 & 69) << 1;
                        int i141 = (i139 ^ i140) + ((i139 & i140) << 1);
                        q = i141 % 128;
                        int i142 = i141 % 2;
                        optionalFindAny = stream.filter(predicate).findAny();
                        i = (-2) - ((p + 50) ^ (-1));
                        q = i % 128;
                        if (i % 2 != 0) {
                            Object obj4 = null;
                            optionalFindAny.orElse(null);
                            try {
                                obj4.hashCode();
                                throw null;
                            } catch (Throwable th5) {
                                throw th5;
                            }
                        }
                        if (optionalFindAny.orElse(null) == null) {
                            this.ah.add(nADRARosterItem);
                            int i143 = q;
                            int i144 = ((i143 & 14) + (i143 | 14)) - 1;
                            p = i144 % 128;
                            int i145 = i144 % 2;
                            int i146 = i143 & 39;
                            int i147 = (i143 ^ 39) | i146;
                            int i148 = ((i146 | i147) << 1) - (i147 ^ i146);
                            p = i148 % 128;
                            int i149 = i148 % 2;
                        }
                    } else {
                        this.ah.add(nADRARosterItem);
                    }
                } else if (Build.VERSION.SDK_INT >= 24) {
                    Stream<RosterItem> stream2 = list2.stream();
                    Predicate<? super RosterItem> predicate2 = new Predicate() { // from class: ivas.gov.bisp.enumeration.bi.w
                        private static int a = 1;
                        private static int b;

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj5) {
                            boolean zEquals;
                            int i1310 = 2 % 2;
                            int i1311 = b + 37;
                            a = i1311 % 128;
                            int i1410 = i1311 % 2;
                            String str5 = string;
                            RosterItem rosterItem = (RosterItem) obj5;
                            int i1411 = NADRARosterListActivity.ac;
                            int i1412 = b;
                            int i1413 = i1412 ^ 93;
                            int i1414 = (i1412 & 93) << 1;
                            int i1415 = (i1413 & i1414) + (i1414 | i1413);
                            a = i1415 % 128;
                            if (i1415 % 2 == 0) {
                                zEquals = rosterItem.getCnic().equals(str5);
                                int i1416 = 59 / 0;
                            } else {
                                zEquals = rosterItem.getCnic().equals(str5);
                            }
                            int i1417 = b;
                            int i1418 = i1417 & 57;
                            int i1419 = (i1418 - (~(-(-((i1417 ^ 57) | i1418))))) - 1;
                            a = i1419 % 128;
                            int i150 = i1419 % 2;
                            return zEquals;
                        }
                    };
                    int i1310 = p;
                    int i1311 = ((~i1310) & 69) | (i1310 & (-70));
                    int i1410 = (i1310 & 69) << 1;
                    int i1411 = (i1311 ^ i1410) + ((i1311 & i1410) << 1);
                    q = i1411 % 128;
                    int i1412 = i1411 % 2;
                    optionalFindAny = stream2.filter(predicate2).findAny();
                    i = (-2) - ((p + 50) ^ (-1));
                    q = i % 128;
                    if (i % 2 != 0) {
                        Object obj5 = null;
                        optionalFindAny.orElse(null);
                        obj5.hashCode();
                        throw null;
                    }
                    if (optionalFindAny.orElse(null) == null) {
                        this.ah.add(nADRARosterItem);
                        int i1413 = q;
                        int i1414 = ((i1413 & 14) + (i1413 | 14)) - 1;
                        p = i1414 % 128;
                        int i1415 = i1414 % 2;
                        int i1416 = i1413 & 39;
                        int i1417 = (i1413 ^ 39) | i1416;
                        int i1418 = ((i1416 | i1417) << 1) - (i1417 ^ i1416);
                        p = i1418 % 128;
                        int i1419 = i1418 % 2;
                    }
                } else {
                    this.ah.add(nADRARosterItem);
                }
                int i150 = i52 & (-22);
                int i151 = (~i150) & (i52 | (-22));
                int i152 = -(-(i150 << 1));
                int i153 = (((i151 | i152) << 1) - (i152 ^ i151)) + 24;
                i52 = (i153 ^ (-1)) + (i153 << 1);
                int i154 = q;
                int i155 = ((i154 & (-82)) | ((~i154) & 81)) + ((i154 & 81) << 1);
                p = i155 % 128;
                int i156 = i155 % 2;
                i2 = 2;
                i9 = 1;
            }
            List<NADRARosterItem> list3 = this.ah;
            this.aj.setLayoutManager(new LinearLayoutManager(1, false));
            bt btVar = new bt(this, list3);
            int i157 = q + 85;
            p = i157 % 128;
            if (i157 % 2 != 0) {
                this.ag = btVar;
                this.aj.setAdapter(btVar);
                int i158 = 21 / 0;
            } else {
                this.ag = btVar;
                this.aj.setAdapter(btVar);
            }
            int i159 = p + 23;
            q = i159 % 128;
            if (i159 % 2 == 0) {
                int i160 = 47 / 0;
            }
        } catch (Exception unused) {
            this.ai.dismiss();
            Toast.makeText(this, "Error : No Family Members Return", 0).show();
            Toast.makeText(this, "Please Enter Another CNIC", 0).show();
            ag.f = BuildConfig.FLAVOR;
        }
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseTouch, ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public void t() {
        Intent intent;
        byte[] bArrB;
        String strM;
        AlertDialog alertDialogK;
        int i = 2 % 2;
        super.t();
        new ActivityBeginSurvey();
        this.ad = (BISPApplication) getApplicationContext();
        ProgressDialog progressDialog = new ProgressDialog(this);
        int i2 = p;
        int i3 = (i2 & 77) + (i2 | 77);
        q = i3 % 128;
        int i4 = i3 % 2;
        this.ai = progressDialog;
        progressDialog.setCancelable(false);
        this.ai.setTitle("Fetching family data");
        this.ai.setMessage("Please Wait...");
        this.ai.setProgressStyle(0);
        this.ak = new SessionManager(this);
        this.al = getIntent().getStringExtra("hhid");
        int i5 = p;
        int i6 = i5 & 67;
        int i7 = (i5 | 67) & (~i6);
        int i8 = i6 << 1;
        int i9 = (i7 & i8) + (i7 | i8);
        q = i9 % 128;
        if (i9 % 2 == 0) {
            this.ao = getIntent().getStringExtra("message");
            this.ap = getIntent().getStringExtra("hH_Name");
            intent = getIntent();
            int i10 = 26 / 0;
        } else {
            this.ao = getIntent().getStringExtra("message");
            this.ap = getIntent().getStringExtra("hH_Name");
            intent = getIntent();
        }
        this.am = intent.getStringExtra("form_number");
        this.an = getIntent().getBooleanExtra("is_Benificiary", false);
        ImageView imageView = (ImageView) findViewById(R.id.iv_back);
        int i11 = p;
        int i12 = ((i11 ^ 31) | (i11 & 31)) << 1;
        int i13 = -(((~i11) & 31) | (i11 & (-32)));
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        q = i14 % 128;
        int i15 = i14 % 2;
        this.ae = imageView;
        this.af = (TextView) findViewById(R.id.tv_add);
        this.aj = (RecyclerView) findViewById(R.id.recycler_view);
        int i16 = q;
        int i17 = (i16 & (-64)) | ((~i16) & 63);
        int i18 = -(-((i16 & 63) << 1));
        int i19 = (i17 & i18) + (i18 | i17);
        p = i19 % 128;
        int i20 = i19 % 2;
        ((TextView) findViewById(R.id.application_version_textView)).setText("v7.6 (LIVE)");
        ((TextView) findViewById(R.id.tv_time_remaining)).setVisibility(8);
        ImageView imageView2 = this.ae;
        int i21 = p + 115;
        q = i21 % 128;
        int i22 = i21 % 2;
        imageView2.setOnClickListener(this);
        this.af.setOnClickListener(this);
        if (this.ak.r().equals(BuildConfig.FLAVOR)) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            View viewFindViewById = findViewById(android.R.id.content);
            int i23 = q;
            int i24 = (-2) - ((((i23 | 56) << 1) - (i23 ^ 56)) ^ (-1));
            p = i24 % 128;
            View viewInflate = LayoutInflater.from(this).inflate(R.layout.cnic_dialog, i24 % 2 != 0 ? (ViewGroup) viewFindViewById : (ViewGroup) viewFindViewById, false);
            int i25 = p;
            int i26 = i25 & 15;
            int i27 = i26 + ((i25 ^ 15) | i26);
            q = i27 % 128;
            if (i27 % 2 == 0) {
                builder.setView(viewInflate);
                alertDialogK = ivas.gov.bisp.enumeration.p091n.j.k(builder, true);
            } else {
                builder.setView(viewInflate);
                alertDialogK = ivas.gov.bisp.enumeration.p091n.j.k(builder, false);
            }
            EditText editText = (EditText) viewInflate.findViewById(R.id.et_cnic);
            TextView textView = (TextView) viewInflate.findViewById(R.id.btn_ok);
            editText.addTextChangedListener(new av(this).new buW(editText));
            textView.setOnClickListener(new G(this, editText, alertDialogK));
            int i28 = q;
            int i29 = i28 | 29;
            int i30 = i29 << 1;
            int i31 = -((~(i28 & 29)) & i29);
            int i32 = (i30 & i31) + (i31 | i30);
            p = i32 % 128;
            if (i32 % 2 != 0) {
                int i33 = 96 / 0;
                return;
            }
            return;
        }
        int i34 = p;
        int i35 = i34 & 91;
        int i36 = ((i34 | 91) & (~i35)) + (i35 << 1);
        q = i36 % 128;
        Object obj = null;
        if (i36 % 2 == 0) {
            this.ak.k().length();
            throw null;
        }
        if (this.ak.k().length() <= 0) {
            AlertDialog.Builder builder2 = new AlertDialog.Builder(this);
            builder2.setTitle("Session Expire");
            int i37 = q;
            int i38 = ((i37 & (-126)) | ((~i37) & 125)) + ((i37 & 125) << 1);
            p = i38 % 128;
            if (i38 % 2 != 0) {
                builder2.setMessage("Session Expire Please Login Again.!");
                builder2.setCancelable(false);
            } else {
                builder2.setMessage("Session Expire Please Login Again.!");
                builder2.setCancelable(true);
            }
            builder2.setPositiveButton("Confirm", new H(this));
            int i39 = p;
            int i40 = i39 ^ 45;
            int i41 = ((((i39 & 45) | i40) << 1) - (~(-i40))) - 1;
            q = i41 % 128;
            if (i41 % 2 != 0) {
                builder2.create().show();
                return;
            } else {
                builder2.create().show();
                throw null;
            }
        }
        if (!this.ak.n().equals(BuildConfig.FLAVOR)) {
            int i42 = q;
            int i43 = (i42 & (-8)) | ((~i42) & 7);
            int i44 = -(-((i42 & 7) << 1));
            int i45 = (i43 ^ i44) + ((i44 & i43) << 1);
            p = i45 % 128;
            int i46 = i45 % 2;
            if (!this.ad.u) {
                int i47 = q;
                int i48 = i47 ^ 55;
                int i49 = (i47 & 55) << 1;
                int i50 = ((i48 | i49) << 1) - (i49 ^ i48);
                p = i50 % 128;
                int i51 = i50 % 2;
                String strN = this.ak.n();
                SessionManager sessionManager = this.ak;
                int i52 = q;
                int i53 = (i52 | 9) << 1;
                int i54 = -(i52 ^ 9);
                int i55 = (i53 ^ i54) + ((i54 & i53) << 1);
                p = i55 % 128;
                if (i55 % 2 != 0) {
                    bArrB = ivas.gov.bisp.enumeration.bK.b.b(sessionManager.k());
                    strM = this.ak.m();
                    int i56 = 10 / 0;
                } else {
                    bArrB = ivas.gov.bisp.enumeration.bK.b.b(sessionManager.k());
                    strM = this.ak.m();
                }
                int i57 = q;
                int i58 = i57 & 49;
                int i59 = ((i57 | 49) & (~i58)) + (i58 << 1);
                p = i59 % 128;
                if (i59 % 2 == 0) {
                    y(ivas.gov.bisp.enumeration.bK.b.c(strN, bArrB, ivas.gov.bisp.enumeration.bK.b.b(strM)));
                    return;
                } else {
                    y(ivas.gov.bisp.enumeration.bK.b.c(strN, bArrB, ivas.gov.bisp.enumeration.bK.b.b(strM)));
                    obj.hashCode();
                    throw null;
                }
            }
        }
        String strR = this.ak.r();
        String strC = this.ak.c();
        int i60 = q;
        int i61 = (i60 ^ 25) + ((i60 & 25) << 1);
        p = i61 % 128;
        int i62 = i61 % 2;
        u(strR, strC);
        int i63 = p + 119;
        q = i63 % 128;
        if (i63 % 2 == 0) {
            throw null;
        }
    }
}
