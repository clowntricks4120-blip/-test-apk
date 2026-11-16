package ivas.gov.bisp.enumeration.activity.nadra;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import androidx.recyclerview.widget.RecyclerView;
import ivas.gov.bisp.enumeration.BISPApplication;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.activity.DashboardActivity;
import ivas.gov.bisp.enumeration.activity.TokenActivity;
import ivas.gov.bisp.enumeration.activitybase.BaseTouch;
import ivas.gov.bisp.enumeration.bK.ac;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase;
import ivas.gov.bisp.enumeration.models.NADRARosterItem;
import ivas.gov.bisp.enumeration.models.Roster;
import ivas.gov.bisp.enumeration.p024ax.ax;
import ivas.gov.bisp.enumeration.p042bo.e;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.util.ArrayList;
import java.util.List;
import net.sqlcipher.BuildConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class SelectHouseHoldActivity extends BaseTouch {
    public static final /* synthetic */ int ac = 0;
    private static int p = 1;
    private static int q;
    public ImageView ae;
    public TextView af;
    public TextView ag;
    public TextView ah;
    public RecyclerView ai;
    public List<NADRARosterItem> aj;
    public ArrayList<Roster> ak;
    public ProgressDialog am;
    public AppDatabase an;
    public SessionManager ao;
    public String ap;
    public String ad = SelectHouseHoldActivity.class.getName();
    public int al = 0;

    public class OooO0OO implements DialogInterface.OnClickListener {
        private static int a = 1;
        private static int b;

        public OooO0OO() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            SelectHouseHoldActivity selectHouseHoldActivity = SelectHouseHoldActivity.this;
            Intent intent = new Intent(SelectHouseHoldActivity.this, (Class<?>) DashboardActivity.class);
            int i3 = a;
            int i4 = i3 & 37;
            int i5 = -(-(i3 | 37));
            int i6 = (i4 & i5) + (i5 | i4);
            b = i6 % 128;
            if (i6 % 2 != 0) {
                selectHouseHoldActivity.startActivity(intent);
                SelectHouseHoldActivity.this.finish();
                dialogInterface.cancel();
                int i7 = 15 / 0;
            } else {
                selectHouseHoldActivity.startActivity(intent);
                SelectHouseHoldActivity.this.finish();
                dialogInterface.cancel();
            }
            int i8 = a;
            int i9 = i8 & 69;
            int i10 = -(-(i8 | 69));
            int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
            b = i11 % 128;
            if (i11 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public class OooOO0 implements DialogInterface.OnClickListener {
        private static int a = 0;
        private static int b = 1;

        public OooOO0(SelectHouseHoldActivity selectHouseHoldActivity) {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = i3 & 61;
            int i5 = -(-(i3 | 61));
            int i6 = (i4 & i5) + (i5 | i4);
            a = i6 % 128;
            if (i6 % 2 == 0) {
                dialogInterface.cancel();
                return;
            }
            dialogInterface.cancel();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        int i2 = q;
        int i3 = (i2 & (-98)) | ((~i2) & 97);
        int i4 = -(-((i2 & 97) << 1));
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        p = i5 % 128;
        int i6 = i5 % 2;
        List<NADRARosterItem> list = this.aj;
        Object obj = null;
        if (list != null) {
            int i7 = ((i2 | 119) << 1) - (i2 ^ 119);
            p = i7 % 128;
            if (i7 % 2 == 0) {
                list.size();
                obj.hashCode();
                throw null;
            }
            if (list.size() <= 0) {
                ag.f = BuildConfig.FLAVOR;
                int i8 = p;
                int i9 = (((i8 ^ 37) | (i8 & 37)) << 1) - (((~i8) & 37) | (i8 & (-38)));
                q = i9 % 128;
                int i10 = i9 % 2;
            }
        }
        Intent intent = new Intent();
        ArrayList<Roster> arrayList = this.ak;
        int i11 = q;
        int i12 = i11 | 61;
        int i13 = (i12 << 1) - ((~(i11 & 61)) & i12);
        p = i13 % 128;
        if (i13 % 2 == 0) {
            intent.putExtra("roster", arrayList);
            setResult(-1, intent);
            finish();
            obj.hashCode();
            throw null;
        }
        intent.putExtra("roster", arrayList);
        setResult(-1, intent);
        finish();
        int i14 = q + 82;
        int i15 = (i14 ^ (-1)) + (i14 << 1);
        p = i15 % 128;
        int i16 = i15 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth, android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2 % 2;
        int i2 = q + 55;
        p = i2 % 128;
        int i3 = i2 % 2;
        if (view.getId() == R.id.iv_back) {
            int i4 = p;
            int i5 = i4 ^ 77;
            int i6 = ((((i4 & 77) | i5) << 1) - (~(-i5))) - 1;
            q = i6 % 128;
            if (i6 % 2 != 0) {
                onBackPressed();
                throw null;
            }
            onBackPressed();
            int i7 = q;
            int i8 = ((i7 | 121) << 1) - (((~i7) & 121) | (i7 & (-122)));
            p = i8 % 128;
            int i9 = i8 % 2;
        }
        int i10 = (-2) - ((p + 88) ^ (-1));
        q = i10 % 128;
        int i11 = i10 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public int p() {
        int i = 2 % 2;
        int i2 = p;
        int i3 = i2 + 13;
        q = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 35;
        q = i5 % 128;
        if (i5 % 2 == 0) {
            return R.layout.activity_nadra_roster_list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public class OooO0o implements DialogInterface.OnClickListener {
        private static int a = 1;
        private static int b;

        public OooO0o() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            SelectHouseHoldActivity selectHouseHoldActivity = SelectHouseHoldActivity.this;
            Intent intent = new Intent(SelectHouseHoldActivity.this, (Class<?>) TokenActivity.class);
            int i3 = b;
            int i4 = (((i3 ^ 123) | (i3 & 123)) << 1) - (((~i3) & 123) | (i3 & (-124)));
            a = i4 % 128;
            if (i4 % 2 == 0) {
                selectHouseHoldActivity.startActivity(intent);
                SelectHouseHoldActivity.this.finish();
                dialogInterface.cancel();
                int i5 = 16 / 0;
            } else {
                selectHouseHoldActivity.startActivity(intent);
                SelectHouseHoldActivity.this.finish();
                dialogInterface.cancel();
            }
            int i6 = a;
            int i7 = (i6 & 43) + (i6 | 43);
            b = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    public class OooO00o implements DialogInterface.OnClickListener {
        private static int a = 0;
        private static int b = 1;

        public OooO00o() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            ag.f = BuildConfig.FLAVOR;
            Intent intent = new Intent();
            int i3 = b;
            int i4 = ((i3 | 49) << 1) - (i3 ^ 49);
            a = i4 % 128;
            int i5 = i4 % 2;
            ArrayList<Roster> arrayList = SelectHouseHoldActivity.this.ak;
            int i6 = b;
            int i7 = i6 & 23;
            int i8 = ((i6 ^ 23) | i7) << 1;
            int i9 = -((i6 | 23) & (~i7));
            int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
            a = i10 % 128;
            if (i10 % 2 != 0) {
                intent.putExtra("roster", arrayList);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            intent.putExtra("roster", arrayList);
            SelectHouseHoldActivity selectHouseHoldActivity = SelectHouseHoldActivity.this;
            int i11 = a;
            int i12 = i11 & 125;
            int i13 = (i11 ^ 125) | i12;
            int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
            b = i14 % 128;
            if (i14 % 2 == 0) {
                selectHouseHoldActivity.setResult(-1, intent);
                SelectHouseHoldActivity.this.finish();
                int i15 = 58 / 0;
            } else {
                selectHouseHoldActivity.setResult(-1, intent);
                SelectHouseHoldActivity.this.finish();
            }
            dialogInterface.cancel();
            int i16 = b;
            int i17 = i16 & 49;
            int i18 = ((i16 | 49) & (~i17)) + (i17 << 1);
            a = i18 % 128;
            int i19 = i18 % 2;
        }
    }

    public class OooO0O0 implements DialogInterface.OnClickListener {
        private static int a = 0;
        private static int b = 1;

        public OooO0O0() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            ag.f = BuildConfig.FLAVOR;
            Intent intent = new Intent();
            int i3 = a;
            int i4 = i3 & 9;
            int i5 = (i3 | 9) & (~i4);
            int i6 = -(-(i4 << 1));
            int i7 = (i5 & i6) + (i5 | i6);
            b = i7 % 128;
            Object obj = null;
            if (i7 % 2 == 0) {
                ArrayList<Roster> arrayList = SelectHouseHoldActivity.this.ak;
                obj.hashCode();
                throw null;
            }
            ArrayList<Roster> arrayList2 = SelectHouseHoldActivity.this.ak;
            int i8 = b;
            int i9 = i8 ^ 67;
            int i10 = ((((i8 & 67) | i9) << 1) - (~(-i9))) - 1;
            a = i10 % 128;
            if (i10 % 2 != 0) {
                intent.putExtra("roster", arrayList2);
                SelectHouseHoldActivity.this.setResult(-1, intent);
                obj.hashCode();
                throw null;
            }
            intent.putExtra("roster", arrayList2);
            SelectHouseHoldActivity.this.setResult(-1, intent);
            SelectHouseHoldActivity.this.finish();
            dialogInterface.cancel();
            int i11 = a;
            int i12 = (i11 & 61) + (i11 | 61);
            b = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 86 / 0;
            }
        }
    }

    public class OooO implements DialogInterface.OnClickListener {
        private static int a = 1;
        private static int b;

        public OooO() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = i3 & 97;
            int i5 = (((i3 ^ 97) | i4) << 1) - ((i3 | 97) & (~i4));
            b = i5 % 128;
            int i6 = i5 % 2;
            if (SelectHouseHoldActivity.this.am.isShowing()) {
                int i7 = b;
                int i8 = i7 & 61;
                int i9 = (i7 ^ 61) | i8;
                int i10 = (i8 & i9) + (i9 | i8);
                a = i10 % 128;
                if (i10 % 2 == 0) {
                    SelectHouseHoldActivity.this.am.dismiss();
                    int i11 = 15 / 0;
                } else {
                    SelectHouseHoldActivity.this.am.dismiss();
                }
                int i12 = b;
                int i13 = (i12 & 94) + (i12 | 94);
                int i14 = (i13 ^ (-1)) + (i13 << 1);
                a = i14 % 128;
                int i15 = i14 % 2;
            }
            dialogInterface.cancel();
            SelectHouseHoldActivity selectHouseHoldActivity = SelectHouseHoldActivity.this;
            String str = selectHouseHoldActivity.ap;
            int i16 = a;
            int i17 = (-2) - ((((i16 | 54) << 1) - (i16 ^ 54)) ^ (-1));
            b = i17 % 128;
            Object obj = null;
            if (i17 % 2 != 0) {
                selectHouseHoldActivity.u(str);
                throw null;
            }
            selectHouseHoldActivity.u(str);
            int i18 = a;
            int i19 = ((i18 | 115) << 1) - (i18 ^ 115);
            b = i19 % 128;
            if (i19 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:144:0x0432 A[Catch: JSONException -> 0x064d, TRY_LEAVE, TryCatch #7 {JSONException -> 0x064d, blocks: (B:3:0x0057, B:5:0x0064, B:6:0x0069, B:10:0x0082, B:12:0x008d, B:19:0x00bc, B:24:0x00cd, B:26:0x00d5, B:31:0x00f0, B:33:0x00fa, B:35:0x0119, B:38:0x0138, B:40:0x014c, B:43:0x0175, B:45:0x0179, B:47:0x017d, B:48:0x0180, B:51:0x0183, B:53:0x018a, B:58:0x01a0, B:63:0x01e1, B:68:0x0205, B:71:0x0222, B:74:0x0255, B:78:0x026b, B:80:0x027a, B:83:0x028d, B:85:0x029a, B:89:0x02bb, B:97:0x02e7, B:101:0x02ff, B:103:0x030a, B:111:0x0329, B:114:0x0349, B:117:0x0372, B:120:0x0390, B:123:0x03b2, B:126:0x03d1, B:129:0x03f1, B:133:0x0414, B:135:0x041f, B:144:0x0432, B:146:0x045b, B:148:0x0477, B:141:0x0426, B:149:0x047a, B:152:0x0492, B:154:0x04be, B:156:0x04e1, B:158:0x04e7, B:159:0x04ea, B:108:0x030f, B:90:0x02c6, B:92:0x02ce, B:93:0x02d1, B:66:0x01f2, B:162:0x04ed, B:164:0x04f9, B:165:0x04fc, B:168:0x04ff, B:171:0x0527, B:173:0x0540, B:176:0x0552, B:178:0x0560, B:180:0x0574, B:182:0x058b, B:177:0x0559, B:184:0x058f, B:186:0x0598, B:192:0x05a1, B:194:0x05bb, B:196:0x05df, B:198:0x05f7, B:203:0x061a, B:206:0x062f, B:22:0x00c5, B:208:0x0633), top: B:238:0x0057 }] */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00cb, code lost:
    
        if (r0 == 200) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w(java.lang.String r29) {
        /*
            Method dump skipped, instruction units count: 1720
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.activity.nadra.SelectHouseHoldActivity.w(java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x020e, code lost:
    
        if (r10.ao.k().length() > 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x021b, code lost:
    
        if (r10.ao.k().length() > 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0228, code lost:
    
        if ((!r10.ao.n().equals(net.sqlcipher.BuildConfig.FLAVOR)) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x022a, code lost:
    
        r1 = ivas.gov.bisp.enumeration.activity.nadra.SelectHouseHoldActivity.q;
        r3 = ((r1 ^ 49) - (~(-(-((r1 & 49) << 1))))) - 1;
        ivas.gov.bisp.enumeration.activity.nadra.SelectHouseHoldActivity.p = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x023b, code lost:
    
        if ((r3 % 2) == 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x023d, code lost:
    
        r1 = r10.ao.n();
        r3 = ivas.gov.bisp.enumeration.bK.b.b(r10.ao.k());
        r4 = r10.ao.m();
        r5 = ivas.gov.bisp.enumeration.activity.nadra.SelectHouseHoldActivity.q;
        r6 = r5 & 99;
        r6 = r6 + ((r5 ^ 99) | r6);
        ivas.gov.bisp.enumeration.activity.nadra.SelectHouseHoldActivity.p = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0260, code lost:
    
        if ((r6 % 2) != 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0262, code lost:
    
        w(ivas.gov.bisp.enumeration.bK.b.c(r1, r3, ivas.gov.bisp.enumeration.bK.b.b(r4)));
        r0 = 57 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0271, code lost:
    
        w(ivas.gov.bisp.enumeration.bK.b.c(r1, r3, ivas.gov.bisp.enumeration.bK.b.b(r4)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x027c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x027d, code lost:
    
        r10.ao.n();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0282, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0283, code lost:
    
        u(r10.ap);
        r1 = ivas.gov.bisp.enumeration.activity.nadra.SelectHouseHoldActivity.p;
        r2 = (r1 & 45) + (r1 | 45);
        ivas.gov.bisp.enumeration.activity.nadra.SelectHouseHoldActivity.q = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0294, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0295, code lost:
    
        r1 = new android.app.AlertDialog.Builder(r10);
        r1.setTitle("Session Expire");
        r3 = ivas.gov.bisp.enumeration.activity.nadra.SelectHouseHoldActivity.p;
        r4 = r3 & 21;
        r4 = (r4 - (~(-(-((r3 ^ 21) | r4))))) - 1;
        ivas.gov.bisp.enumeration.activity.nadra.SelectHouseHoldActivity.q = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x02b2, code lost:
    
        if ((r4 % 2) == 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x02b4, code lost:
    
        r1.setMessage("Session Expire Please Login Again.!");
        r1.setCancelable(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x02bb, code lost:
    
        r1.setMessage("Session Expire Please Login Again.!");
        r1.setCancelable(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x02c1, code lost:
    
        r1.setPositiveButton("Confirm", new ivas.gov.bisp.enumeration.p042bo.r(r10));
        r3 = ivas.gov.bisp.enumeration.activity.nadra.SelectHouseHoldActivity.q;
        r4 = (r3 & 89) + (r3 | 89);
        ivas.gov.bisp.enumeration.activity.nadra.SelectHouseHoldActivity.p = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x02d7, code lost:
    
        if ((r4 % 2) != 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x02d9, code lost:
    
        r1.create().show();
        r6 = 63 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x02e2, code lost:
    
        r1.create().show();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x02e9, code lost:
    
        r1 = ivas.gov.bisp.enumeration.activity.nadra.SelectHouseHoldActivity.p;
        r2 = r1 | 103;
        r3 = r2 << 1;
        r1 = -((~(r1 & 103)) & r2);
        r2 = (r3 ^ r1) + ((r1 & r3) << 1);
        ivas.gov.bisp.enumeration.activity.nadra.SelectHouseHoldActivity.q = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x02fe, code lost:
    
        if ((r2 % 2) != 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0300, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0301, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    @Override // ivas.gov.bisp.enumeration.activitybase.BaseTouch, ivas.gov.bisp.enumeration.activitybase.BaseAuth
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void t() {
        /*
            Method dump skipped, instruction units count: 804
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.activity.nadra.SelectHouseHoldActivity.t():void");
    }

    public final void x(String str, String str2) {
        int i = 2 % 2;
        b.aIz aiz = new b.aIz(this);
        AlertController.OooO0O0 oooO0O0 = aiz.a;
        int i2 = p;
        int i3 = (i2 & 53) + (i2 | 53);
        q = i3 % 128;
        if (i3 % 2 != 0) {
            oooO0O0.e = str;
            oooO0O0.f = str2;
            int i4 = 6 / 0;
        } else {
            oooO0O0.e = str;
            oooO0O0.f = str2;
        }
        oooO0O0.k = true;
        OooO oooO = new OooO();
        int i5 = p + 103;
        q = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            oooO0O0.h = "Retry";
            obj.hashCode();
            throw null;
        }
        oooO0O0.h = "Retry";
        oooO0O0.i = oooO;
        OooOO0 oooOO0 = new OooOO0(this);
        int i6 = p;
        int i7 = (i6 & (-82)) | ((~i6) & 81);
        int i8 = -(-((i6 & 81) << 1));
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        q = i9 % 128;
        int i10 = i9 % 2;
        oooO0O0.a = "Cancel";
        oooO0O0.j = oooOO0;
        int i11 = p + 113;
        q = i11 % 128;
        int i12 = i11 % 2;
        aiz.b().show();
        int i13 = p;
        int i14 = (i13 ^ 41) + ((i13 & 41) << 1);
        q = i14 % 128;
        if (i14 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00ed A[Catch: JSONException -> 0x01a1, TRY_ENTER, TRY_LEAVE, TryCatch #0 {JSONException -> 0x01a1, blocks: (B:3:0x0018, B:5:0x002f, B:7:0x004f, B:10:0x007b, B:14:0x0091, B:18:0x00a7, B:23:0x00ca, B:30:0x00ed, B:34:0x0113, B:37:0x0139, B:39:0x0169, B:45:0x0186, B:46:0x018f, B:47:0x0192, B:26:0x00d5, B:32:0x00fc, B:50:0x0195), top: B:54:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00fc A[Catch: JSONException -> 0x01a1, TRY_ENTER, TRY_LEAVE, TryCatch #0 {JSONException -> 0x01a1, blocks: (B:3:0x0018, B:5:0x002f, B:7:0x004f, B:10:0x007b, B:14:0x0091, B:18:0x00a7, B:23:0x00ca, B:30:0x00ed, B:34:0x0113, B:37:0x0139, B:39:0x0169, B:45:0x0186, B:46:0x018f, B:47:0x0192, B:26:0x00d5, B:32:0x00fc, B:50:0x0195), top: B:54:0x0018 }] */
    public final void u(String str) {
        int i = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        int i2 = p + 53;
        q = i2 % 128;
        int i3 = i2 % 2;
        try {
            jSONObject.put("Cnic", str);
            int i4 = p;
            int i5 = (i4 ^ 63) + ((i4 & 63) << 1);
            q = i5 % 128;
            int i6 = i5 % 2;
            jSONObject.put("HHId", BuildConfig.FLAVOR);
            String str2 = BISPApplication.c().s;
            int i7 = q;
            int i8 = (i7 & (-16)) | ((~i7) & 15);
            int i9 = (i7 & 15) << 1;
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            p = i10 % 128;
            int i11 = i10 % 2;
            jSONObject.put("SessionId", str2);
            jSONObject.put("IpAddress", ac.h(true));
            String strR = this.ao.r();
            int i12 = p;
            int i13 = i12 & 47;
            int i14 = ((i12 ^ 47) | i13) << 1;
            int i15 = -((i12 | 47) & (~i13));
            int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
            q = i16 % 128;
            Object obj = null;
            if (i16 % 2 != 0) {
                jSONObject.put("sessionUserCnic", strR);
                this.ao.s();
                obj.hashCode();
                throw null;
            }
            jSONObject.put("sessionUserCnic", strR);
            if (this.ao.s() != 2) {
                int i17 = q + 53;
                p = i17 % 128;
                int i18 = i17 % 2;
                if (this.ao.s() != 3) {
                    int i19 = p;
                    int i20 = i19 & 51;
                    int i21 = i20 + ((i19 ^ 51) | i20);
                    q = i21 % 128;
                    int i22 = i21 % 2;
                    if (this.ao.s() != 5) {
                        int i23 = q;
                        int i24 = ((i23 ^ 5) | (i23 & 5)) << 1;
                        int i25 = -(((~i23) & 5) | (i23 & (-6)));
                        int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
                        p = i26 % 128;
                        if (i26 % 2 == 0) {
                            if (this.ao.s() == 20) {
                                int i27 = p;
                                int i28 = i27 & 5;
                                int i29 = (i28 - (~((i27 ^ 5) | i28))) - 1;
                                q = i29 % 128;
                                int i30 = i29 % 2;
                                jSONObject.put("Type", "resurvey");
                                int i31 = q;
                                int i32 = i31 ^ 93;
                                int i33 = -(-((i31 & 93) << 1));
                                int i34 = (i32 & i33) + (i33 | i32);
                                p = i34 % 128;
                                int i35 = i34 % 2;
                            } else {
                                jSONObject.put("Type", "new");
                                int i36 = q + 29;
                                p = i36 % 128;
                                int i37 = i36 % 2;
                            }
                        } else if (this.ao.s() == 6) {
                            int i210 = p;
                            int i211 = i210 & 5;
                            int i212 = (i211 - (~((i210 ^ 5) | i211))) - 1;
                            q = i212 % 128;
                            int i38 = i212 % 2;
                            jSONObject.put("Type", "resurvey");
                            int i39 = q;
                            int i310 = i39 ^ 93;
                            int i311 = -(-((i39 & 93) << 1));
                            int i312 = (i310 & i311) + (i311 | i310);
                            p = i312 % 128;
                            int i313 = i312 % 2;
                        } else {
                            jSONObject.put("Type", "new");
                            int i314 = q + 29;
                            p = i314 % 128;
                            int i315 = i314 % 2;
                        }
                    } else {
                        jSONObject.put("Type", "resurvey");
                        int i316 = q;
                        int i317 = i316 ^ 93;
                        int i318 = -(-((i316 & 93) << 1));
                        int i319 = (i317 & i318) + (i318 | i317);
                        p = i319 % 128;
                        int i3110 = i319 % 2;
                    }
                } else {
                    jSONObject.put("Type", "resurvey");
                    int i3111 = q;
                    int i3112 = i3111 ^ 93;
                    int i3113 = -(-((i3111 & 93) << 1));
                    int i3114 = (i3112 & i3113) + (i3113 | i3112);
                    p = i3114 % 128;
                    int i3115 = i3114 % 2;
                }
            } else {
                jSONObject.put("Type", "resurvey");
                int i3116 = q;
                int i3117 = i3116 ^ 93;
                int i3118 = -(-((i3116 & 93) << 1));
                int i3119 = (i3117 & i3118) + (i3118 | i3117);
                p = i3119 % 128;
                int i31110 = i3119 % 2;
            }
            String string = jSONObject.toString();
            byte[] bArrB = ivas.gov.bisp.enumeration.bK.b.b(this.ao.k());
            int i40 = p;
            int i41 = (i40 & (-28)) | ((~i40) & 27);
            int i42 = -(-((i40 & 27) << 1));
            int i43 = (i41 & i42) + (i42 | i41);
            q = i43 % 128;
            if (i43 % 2 != 0) {
                ivas.gov.bisp.enumeration.bK.b.b(this.ao.m());
                obj.hashCode();
                throw null;
            }
            jSONObject2.put("string1", ivas.gov.bisp.enumeration.bK.b.d(string, bArrB, ivas.gov.bisp.enumeration.bK.b.b(this.ao.m())));
            ax.h(this.am, "Please wait!");
            e eVar = new e(this);
            int i44 = p;
            int i45 = ((i44 & (-70)) | ((~i44) & 69)) + ((i44 & 69) << 1);
            q = i45 % 128;
            int i46 = i45 % 2;
            ax.e(jSONObject2, this, "https://meladeskapp.bisp.gov.pk/api/Roster/V8MVu3ODp1hu5Dw3DWwA", eVar);
            int i47 = p;
            int i48 = i47 ^ 89;
            int i49 = ((((i47 & 89) | i48) << 1) - (~(-i48))) - 1;
            q = i49 % 128;
            if (i49 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        } catch (JSONException unused) {
        }
    }
}
