package ivas.gov.bisp.enumeration.activity.singlediscrepancy;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.wifi.WifiManager;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.text.format.Formatter;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import ivas.gov.bisp.enumeration.BISPApplication;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.activity.updatecnic.activity.UpdateCNICActivity;
import ivas.gov.bisp.enumeration.activitybase.BaseTouch;
import ivas.gov.bisp.enumeration.ax.av.buW;
import ivas.gov.bisp.enumeration.bK.ac;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.bK.b;
import ivas.gov.bisp.enumeration.dd.C0290a;
import ivas.gov.bisp.enumeration.dd.C0291l;
import ivas.gov.bisp.enumeration.dd.C0294o;
import ivas.gov.bisp.enumeration.dd.C0297t;
import ivas.gov.bisp.enumeration.dd.C0298u;
import ivas.gov.bisp.enumeration.dd.J;
import ivas.gov.bisp.enumeration.dd.M;
import ivas.gov.bisp.enumeration.dd.ViewOnClickListenerC0300x;
import ivas.gov.bisp.enumeration.models.RosterItem;
import ivas.gov.bisp.enumeration.p002ab.C0084m;
import ivas.gov.bisp.enumeration.p022av.z;
import ivas.gov.bisp.enumeration.p023aw.a;
import ivas.gov.bisp.enumeration.p024ax.av;
import ivas.gov.bisp.enumeration.p091n.j;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Pattern;
import net.sqlcipher.BuildConfig;
import o.h;
import o.i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class CnicActivity extends BaseTouch {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char a$s76$847 = 63414;
    private static char b$s75$847 = 36317;
    private static char c$s74$847 = 3995;
    private static char d$s73$847 = 53882;
    private static int p = 0;
    private static int q = 1;
    public int aA;
    public String aB;
    public int aC;
    public String aD;
    public String aE;
    public String aF;
    public int aG;
    public String aH;
    public String aI;
    public boolean aJ;
    public int aK;
    public String aL;
    public boolean aM;
    public String aN;
    public String aO;
    public int aP;
    public int aQ;
    public int aR;
    public String aS;
    public final String ac = CnicActivity.class.getName();
    public BISPApplication ad;
    public EditText ae;
    public TextView af;
    public TextView ag;
    public RosterItem ah;
    public ProgressDialog ai;
    public String aj;
    public String ak;
    public String al;
    public String am;
    public String an;
    public int ao;
    public long ap;
    public String aq;
    public String ar;
    public String as;
    public int at;
    public String au;
    public String av;
    public int aw;
    public SessionManager ax;
    public String ay;
    public CharSequence az;

    public class OooO0OO implements DialogInterface.OnClickListener {
        private static int a = 1;
        private static int b;

        public OooO0OO() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            Intent intent = new Intent(CnicActivity.this, (Class<?>) UpdatePhoneNoActivity.class);
            int i3 = a;
            int i4 = i3 & 123;
            int i5 = i4 + ((i3 ^ 123) | i4);
            b = i5 % 128;
            if (i5 % 2 != 0) {
                RosterItem rosterItem = CnicActivity.this.ah;
                throw null;
            }
            intent.putExtra("roster_data", CnicActivity.this.ah);
            CnicActivity.this.startActivity(intent);
            int i6 = a;
            int i7 = i6 ^ 57;
            int i8 = -(-((i6 & 57) << 1));
            int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
            b = i9 % 128;
            if (i9 % 2 == 0) {
                dialogInterface.cancel();
            } else {
                dialogInterface.cancel();
                throw null;
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        startActivity(new Intent(this, (Class<?>) UpdateCNICActivity.class));
        finish();
        int i2 = q + 59;
        p = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth, android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2 % 2;
        int id = view.getId();
        if (id != R.id.btn_ok) {
            int i2 = p + 51;
            q = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (id != R.id.btn_validate) {
                if (id == R.id.iv_back) {
                    onBackPressed();
                    return;
                }
                return;
            }
            String strReplace = this.ae.getText().toString().replace("-", BuildConfig.FLAVOR);
            if (!strReplace.toLowerCase().contains("xx")) {
                this.aB = strReplace;
            }
            if (this.aB.length() == 13) {
                y(this.aB);
                return;
            } else {
                Toast.makeText(this, "Please enter valid CNIC.", 0).show();
                return;
            }
        }
        if (this.ae.getText().toString().length() <= 0) {
            Toast.makeText(this, "Please Enter Cnic", 0).show();
            return;
        }
        this.aj = this.ax.p();
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Phone Number.!");
        StringBuilder sbW = j.w("Please Comfirm your Phone # ");
        sbW.append(this.aj);
        builder.setMessage(sbW.toString());
        builder.setCancelable(true);
        builder.setPositiveButton("Confirm", new OooO0O0());
        builder.setNegativeButton("No", new OooO0OO());
        builder.create().show();
        int i3 = q + 27;
        p = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public int p() {
        int i = 2 % 2;
        int i2 = p + 9;
        q = i2 % 128;
        if (i2 % 2 != 0) {
            return R.layout.activity_cnic;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void y(String str) {
        int i = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("hH_ID", this.ak);
            jSONObject.put("cnic", str);
            jSONObject.put("CnicEnc", str);
            jSONObject.put("r_id", this.ap);
            jSONObject.put("SessionId", BISPApplication.c().s);
            jSONObject.put("IpAddress", ac.h(true));
            jSONObject.put("sessionUserCnic", this.ax.r());
            jSONObject.put("update_type", "cnic");
            this.ai.setCancelable(false);
            this.ai.setMessage("Please Wait...");
            this.ai.setProgressStyle(0);
            this.ai.show();
            jSONObject2.put("string1", b.d(jSONObject.toString(), b.b(this.ax.k()), b.b(this.ax.m())));
            byte[] bArrB = b.b(this.ax.k());
            byte[] bArrB2 = b.b(this.ax.m());
            Object[] objArr = new Object[1];
            a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) - 15, new char[]{22782, 26859, 341, 13515, 18725, 12539, 11923, 9782, 36353, 29519, 6741, 55507, 35488, 42003, 34752, 13433, 49619, 48676, 31644, 2018, 19836, 1677}, objArr);
            jSONObject2.put("string2", b.d(((String) objArr[0]).intern(), bArrB, bArrB2));
            C0294o c0294o = new C0294o(this, 1, "https://meladeskapp.bisp.gov.pk/api/Roster/bZJVzTu9rHlQm0D", jSONObject2, new C0291l(this, str), new C0290a(this));
            c0294o.m = new z(130000, 0, 0.0f);
            c0294o.k = false;
            a.b(this).c(c0294o);
            int i2 = q + 117;
            p = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        } catch (JSONException unused) {
        }
    }

    public class OooO00o implements TextWatcher {
        private static int a = 1;
        private static int b;

        public OooO00o() {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4 = 2 % 2;
            int i5 = b + 43;
            a = i5 % 128;
            int i6 = i5 % 2;
            CnicActivity.this.az = charSequence;
            int i7 = b;
            int i8 = i7 & 47;
            int i9 = i7 | 47;
            int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
            a = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 82 / 0;
            }
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 31;
            int i4 = -(-((i2 ^ 31) | i3));
            int i5 = (i3 & i4) + (i4 | i3);
            a = i5 % 128;
            if (i5 % 2 == 0) {
                editable.toString().contains("-.");
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (editable.toString().contains("-.")) {
                int i6 = a;
                int i7 = i6 ^ 71;
                int i8 = ((((i6 & 71) | i7) << 1) - (~(-i7))) - 1;
                b = i8 % 128;
                int i9 = i8 % 2;
                editable.clear();
                String string = CnicActivity.this.az.toString();
                int i10 = b;
                int i11 = ((i10 | 59) << 1) - (i10 ^ 59);
                a = i11 % 128;
                int i12 = i11 % 2;
                editable.append((CharSequence) string);
                int i13 = a + 55;
                b = i13 % 128;
                int i14 = i13 % 2;
            }
            CnicActivity.this.af.setVisibility(8);
            CnicActivity cnicActivity = CnicActivity.this;
            int i15 = a;
            int i16 = (((i15 | 67) << 1) - (~(-(((~i15) & 67) | (i15 & (-68)))))) - 1;
            b = i16 % 128;
            if (i16 % 2 != 0) {
                cnicActivity.ag.setVisibility(1);
            } else {
                cnicActivity.ag.setVisibility(0);
            }
            int i17 = a;
            int i18 = (i17 & (-102)) | ((~i17) & 101);
            int i19 = (i17 & 101) << 1;
            int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
            b = i20 % 128;
            if (i20 % 2 != 0) {
                int i21 = 73 / 0;
            }
        }

        /* JADX WARN: Code duplicated, block: B:34:0x00e9 A[Catch: Exception -> 0x055a, TryCatch #11 {Exception -> 0x055a, blocks: (B:3:0x0019, B:6:0x0037, B:10:0x005e, B:14:0x007d, B:18:0x009c, B:15:0x0087, B:20:0x00b0, B:25:0x00d7, B:27:0x00dd, B:34:0x00e9, B:36:0x00ef, B:40:0x010b, B:42:0x0120, B:46:0x013c, B:50:0x0168, B:53:0x01a0, B:55:0x01b1, B:62:0x01dd, B:63:0x01e4, B:59:0x01b5, B:64:0x01eb, B:65:0x01fe, B:66:0x0201, B:47:0x014b, B:41:0x0116, B:32:0x00e3, B:69:0x0204, B:74:0x021b, B:76:0x0221, B:83:0x022d, B:85:0x0246, B:89:0x025f, B:94:0x0285, B:98:0x02b1, B:99:0x02c4, B:104:0x02db, B:107:0x0302, B:112:0x0322, B:113:0x032c, B:103:0x02c8, B:95:0x0294, B:90:0x026a, B:81:0x0227, B:116:0x032f, B:121:0x034a, B:123:0x0350, B:126:0x0364, B:128:0x0379, B:131:0x0396, B:133:0x03bc, B:136:0x03d7, B:137:0x03d9, B:142:0x03ef, B:144:0x03f4, B:148:0x03f8, B:138:0x03de, B:150:0x03fc, B:151:0x040a, B:152:0x040d, B:127:0x036f, B:155:0x0410, B:156:0x0413, B:157:0x0416, B:160:0x0419, B:165:0x0438, B:170:0x0447, B:173:0x0462, B:176:0x0478, B:177:0x047a, B:178:0x0480, B:180:0x0484, B:181:0x048f, B:168:0x0441, B:184:0x0492, B:187:0x04aa, B:191:0x04bf, B:194:0x04d2, B:196:0x04f4, B:200:0x0503, B:201:0x0506, B:203:0x0509, B:206:0x051a, B:207:0x0521, B:210:0x0524, B:211:0x052b, B:212:0x052e, B:215:0x0531, B:221:0x054b, B:222:0x0554, B:223:0x0557), top: B:249:0x0019 }] */
        /* JADX WARN: Code duplicated, block: B:36:0x00ef A[Catch: Exception -> 0x055a, TRY_LEAVE, TryCatch #11 {Exception -> 0x055a, blocks: (B:3:0x0019, B:6:0x0037, B:10:0x005e, B:14:0x007d, B:18:0x009c, B:15:0x0087, B:20:0x00b0, B:25:0x00d7, B:27:0x00dd, B:34:0x00e9, B:36:0x00ef, B:40:0x010b, B:42:0x0120, B:46:0x013c, B:50:0x0168, B:53:0x01a0, B:55:0x01b1, B:62:0x01dd, B:63:0x01e4, B:59:0x01b5, B:64:0x01eb, B:65:0x01fe, B:66:0x0201, B:47:0x014b, B:41:0x0116, B:32:0x00e3, B:69:0x0204, B:74:0x021b, B:76:0x0221, B:83:0x022d, B:85:0x0246, B:89:0x025f, B:94:0x0285, B:98:0x02b1, B:99:0x02c4, B:104:0x02db, B:107:0x0302, B:112:0x0322, B:113:0x032c, B:103:0x02c8, B:95:0x0294, B:90:0x026a, B:81:0x0227, B:116:0x032f, B:121:0x034a, B:123:0x0350, B:126:0x0364, B:128:0x0379, B:131:0x0396, B:133:0x03bc, B:136:0x03d7, B:137:0x03d9, B:142:0x03ef, B:144:0x03f4, B:148:0x03f8, B:138:0x03de, B:150:0x03fc, B:151:0x040a, B:152:0x040d, B:127:0x036f, B:155:0x0410, B:156:0x0413, B:157:0x0416, B:160:0x0419, B:165:0x0438, B:170:0x0447, B:173:0x0462, B:176:0x0478, B:177:0x047a, B:178:0x0480, B:180:0x0484, B:181:0x048f, B:168:0x0441, B:184:0x0492, B:187:0x04aa, B:191:0x04bf, B:194:0x04d2, B:196:0x04f4, B:200:0x0503, B:201:0x0506, B:203:0x0509, B:206:0x051a, B:207:0x0521, B:210:0x0524, B:211:0x052b, B:212:0x052e, B:215:0x0531, B:221:0x054b, B:222:0x0554, B:223:0x0557), top: B:249:0x0019 }] */
        /* JADX WARN: Code duplicated, block: B:39:0x010a  */
        /* JADX WARN: Code duplicated, block: B:41:0x0116 A[Catch: Exception -> 0x055a, TryCatch #11 {Exception -> 0x055a, blocks: (B:3:0x0019, B:6:0x0037, B:10:0x005e, B:14:0x007d, B:18:0x009c, B:15:0x0087, B:20:0x00b0, B:25:0x00d7, B:27:0x00dd, B:34:0x00e9, B:36:0x00ef, B:40:0x010b, B:42:0x0120, B:46:0x013c, B:50:0x0168, B:53:0x01a0, B:55:0x01b1, B:62:0x01dd, B:63:0x01e4, B:59:0x01b5, B:64:0x01eb, B:65:0x01fe, B:66:0x0201, B:47:0x014b, B:41:0x0116, B:32:0x00e3, B:69:0x0204, B:74:0x021b, B:76:0x0221, B:83:0x022d, B:85:0x0246, B:89:0x025f, B:94:0x0285, B:98:0x02b1, B:99:0x02c4, B:104:0x02db, B:107:0x0302, B:112:0x0322, B:113:0x032c, B:103:0x02c8, B:95:0x0294, B:90:0x026a, B:81:0x0227, B:116:0x032f, B:121:0x034a, B:123:0x0350, B:126:0x0364, B:128:0x0379, B:131:0x0396, B:133:0x03bc, B:136:0x03d7, B:137:0x03d9, B:142:0x03ef, B:144:0x03f4, B:148:0x03f8, B:138:0x03de, B:150:0x03fc, B:151:0x040a, B:152:0x040d, B:127:0x036f, B:155:0x0410, B:156:0x0413, B:157:0x0416, B:160:0x0419, B:165:0x0438, B:170:0x0447, B:173:0x0462, B:176:0x0478, B:177:0x047a, B:178:0x0480, B:180:0x0484, B:181:0x048f, B:168:0x0441, B:184:0x0492, B:187:0x04aa, B:191:0x04bf, B:194:0x04d2, B:196:0x04f4, B:200:0x0503, B:201:0x0506, B:203:0x0509, B:206:0x051a, B:207:0x0521, B:210:0x0524, B:211:0x052b, B:212:0x052e, B:215:0x0531, B:221:0x054b, B:222:0x0554, B:223:0x0557), top: B:249:0x0019 }] */
        /* JADX WARN: Code duplicated, block: B:45:0x013a  */
        /* JADX WARN: Code duplicated, block: B:47:0x014b A[Catch: Exception -> 0x055a, TRY_LEAVE, TryCatch #11 {Exception -> 0x055a, blocks: (B:3:0x0019, B:6:0x0037, B:10:0x005e, B:14:0x007d, B:18:0x009c, B:15:0x0087, B:20:0x00b0, B:25:0x00d7, B:27:0x00dd, B:34:0x00e9, B:36:0x00ef, B:40:0x010b, B:42:0x0120, B:46:0x013c, B:50:0x0168, B:53:0x01a0, B:55:0x01b1, B:62:0x01dd, B:63:0x01e4, B:59:0x01b5, B:64:0x01eb, B:65:0x01fe, B:66:0x0201, B:47:0x014b, B:41:0x0116, B:32:0x00e3, B:69:0x0204, B:74:0x021b, B:76:0x0221, B:83:0x022d, B:85:0x0246, B:89:0x025f, B:94:0x0285, B:98:0x02b1, B:99:0x02c4, B:104:0x02db, B:107:0x0302, B:112:0x0322, B:113:0x032c, B:103:0x02c8, B:95:0x0294, B:90:0x026a, B:81:0x0227, B:116:0x032f, B:121:0x034a, B:123:0x0350, B:126:0x0364, B:128:0x0379, B:131:0x0396, B:133:0x03bc, B:136:0x03d7, B:137:0x03d9, B:142:0x03ef, B:144:0x03f4, B:148:0x03f8, B:138:0x03de, B:150:0x03fc, B:151:0x040a, B:152:0x040d, B:127:0x036f, B:155:0x0410, B:156:0x0413, B:157:0x0416, B:160:0x0419, B:165:0x0438, B:170:0x0447, B:173:0x0462, B:176:0x0478, B:177:0x047a, B:178:0x0480, B:180:0x0484, B:181:0x048f, B:168:0x0441, B:184:0x0492, B:187:0x04aa, B:191:0x04bf, B:194:0x04d2, B:196:0x04f4, B:200:0x0503, B:201:0x0506, B:203:0x0509, B:206:0x051a, B:207:0x0521, B:210:0x0524, B:211:0x052b, B:212:0x052e, B:215:0x0531, B:221:0x054b, B:222:0x0554, B:223:0x0557), top: B:249:0x0019 }] */
        /* JADX WARN: Code duplicated, block: B:50:0x0168 A[Catch: Exception -> 0x055a, TRY_ENTER, TRY_LEAVE, TryCatch #11 {Exception -> 0x055a, blocks: (B:3:0x0019, B:6:0x0037, B:10:0x005e, B:14:0x007d, B:18:0x009c, B:15:0x0087, B:20:0x00b0, B:25:0x00d7, B:27:0x00dd, B:34:0x00e9, B:36:0x00ef, B:40:0x010b, B:42:0x0120, B:46:0x013c, B:50:0x0168, B:53:0x01a0, B:55:0x01b1, B:62:0x01dd, B:63:0x01e4, B:59:0x01b5, B:64:0x01eb, B:65:0x01fe, B:66:0x0201, B:47:0x014b, B:41:0x0116, B:32:0x00e3, B:69:0x0204, B:74:0x021b, B:76:0x0221, B:83:0x022d, B:85:0x0246, B:89:0x025f, B:94:0x0285, B:98:0x02b1, B:99:0x02c4, B:104:0x02db, B:107:0x0302, B:112:0x0322, B:113:0x032c, B:103:0x02c8, B:95:0x0294, B:90:0x026a, B:81:0x0227, B:116:0x032f, B:121:0x034a, B:123:0x0350, B:126:0x0364, B:128:0x0379, B:131:0x0396, B:133:0x03bc, B:136:0x03d7, B:137:0x03d9, B:142:0x03ef, B:144:0x03f4, B:148:0x03f8, B:138:0x03de, B:150:0x03fc, B:151:0x040a, B:152:0x040d, B:127:0x036f, B:155:0x0410, B:156:0x0413, B:157:0x0416, B:160:0x0419, B:165:0x0438, B:170:0x0447, B:173:0x0462, B:176:0x0478, B:177:0x047a, B:178:0x0480, B:180:0x0484, B:181:0x048f, B:168:0x0441, B:184:0x0492, B:187:0x04aa, B:191:0x04bf, B:194:0x04d2, B:196:0x04f4, B:200:0x0503, B:201:0x0506, B:203:0x0509, B:206:0x051a, B:207:0x0521, B:210:0x0524, B:211:0x052b, B:212:0x052e, B:215:0x0531, B:221:0x054b, B:222:0x0554, B:223:0x0557), top: B:249:0x0019 }] */
        /* JADX WARN: Code duplicated, block: B:53:0x01a0 A[Catch: Exception -> 0x055a, TRY_ENTER, TRY_LEAVE, TryCatch #11 {Exception -> 0x055a, blocks: (B:3:0x0019, B:6:0x0037, B:10:0x005e, B:14:0x007d, B:18:0x009c, B:15:0x0087, B:20:0x00b0, B:25:0x00d7, B:27:0x00dd, B:34:0x00e9, B:36:0x00ef, B:40:0x010b, B:42:0x0120, B:46:0x013c, B:50:0x0168, B:53:0x01a0, B:55:0x01b1, B:62:0x01dd, B:63:0x01e4, B:59:0x01b5, B:64:0x01eb, B:65:0x01fe, B:66:0x0201, B:47:0x014b, B:41:0x0116, B:32:0x00e3, B:69:0x0204, B:74:0x021b, B:76:0x0221, B:83:0x022d, B:85:0x0246, B:89:0x025f, B:94:0x0285, B:98:0x02b1, B:99:0x02c4, B:104:0x02db, B:107:0x0302, B:112:0x0322, B:113:0x032c, B:103:0x02c8, B:95:0x0294, B:90:0x026a, B:81:0x0227, B:116:0x032f, B:121:0x034a, B:123:0x0350, B:126:0x0364, B:128:0x0379, B:131:0x0396, B:133:0x03bc, B:136:0x03d7, B:137:0x03d9, B:142:0x03ef, B:144:0x03f4, B:148:0x03f8, B:138:0x03de, B:150:0x03fc, B:151:0x040a, B:152:0x040d, B:127:0x036f, B:155:0x0410, B:156:0x0413, B:157:0x0416, B:160:0x0419, B:165:0x0438, B:170:0x0447, B:173:0x0462, B:176:0x0478, B:177:0x047a, B:178:0x0480, B:180:0x0484, B:181:0x048f, B:168:0x0441, B:184:0x0492, B:187:0x04aa, B:191:0x04bf, B:194:0x04d2, B:196:0x04f4, B:200:0x0503, B:201:0x0506, B:203:0x0509, B:206:0x051a, B:207:0x0521, B:210:0x0524, B:211:0x052b, B:212:0x052e, B:215:0x0531, B:221:0x054b, B:222:0x0554, B:223:0x0557), top: B:249:0x0019 }] */
        /* JADX WARN: Code duplicated, block: B:59:0x01b5 A[Catch: Exception -> 0x055a, TRY_ENTER, TRY_LEAVE, TryCatch #11 {Exception -> 0x055a, blocks: (B:3:0x0019, B:6:0x0037, B:10:0x005e, B:14:0x007d, B:18:0x009c, B:15:0x0087, B:20:0x00b0, B:25:0x00d7, B:27:0x00dd, B:34:0x00e9, B:36:0x00ef, B:40:0x010b, B:42:0x0120, B:46:0x013c, B:50:0x0168, B:53:0x01a0, B:55:0x01b1, B:62:0x01dd, B:63:0x01e4, B:59:0x01b5, B:64:0x01eb, B:65:0x01fe, B:66:0x0201, B:47:0x014b, B:41:0x0116, B:32:0x00e3, B:69:0x0204, B:74:0x021b, B:76:0x0221, B:83:0x022d, B:85:0x0246, B:89:0x025f, B:94:0x0285, B:98:0x02b1, B:99:0x02c4, B:104:0x02db, B:107:0x0302, B:112:0x0322, B:113:0x032c, B:103:0x02c8, B:95:0x0294, B:90:0x026a, B:81:0x0227, B:116:0x032f, B:121:0x034a, B:123:0x0350, B:126:0x0364, B:128:0x0379, B:131:0x0396, B:133:0x03bc, B:136:0x03d7, B:137:0x03d9, B:142:0x03ef, B:144:0x03f4, B:148:0x03f8, B:138:0x03de, B:150:0x03fc, B:151:0x040a, B:152:0x040d, B:127:0x036f, B:155:0x0410, B:156:0x0413, B:157:0x0416, B:160:0x0419, B:165:0x0438, B:170:0x0447, B:173:0x0462, B:176:0x0478, B:177:0x047a, B:178:0x0480, B:180:0x0484, B:181:0x048f, B:168:0x0441, B:184:0x0492, B:187:0x04aa, B:191:0x04bf, B:194:0x04d2, B:196:0x04f4, B:200:0x0503, B:201:0x0506, B:203:0x0509, B:206:0x051a, B:207:0x0521, B:210:0x0524, B:211:0x052b, B:212:0x052e, B:215:0x0531, B:221:0x054b, B:222:0x0554, B:223:0x0557), top: B:249:0x0019 }] */
        /* JADX WARN: Code duplicated, block: B:62:0x01dd A[Catch: Exception -> 0x055a, TRY_ENTER, TryCatch #11 {Exception -> 0x055a, blocks: (B:3:0x0019, B:6:0x0037, B:10:0x005e, B:14:0x007d, B:18:0x009c, B:15:0x0087, B:20:0x00b0, B:25:0x00d7, B:27:0x00dd, B:34:0x00e9, B:36:0x00ef, B:40:0x010b, B:42:0x0120, B:46:0x013c, B:50:0x0168, B:53:0x01a0, B:55:0x01b1, B:62:0x01dd, B:63:0x01e4, B:59:0x01b5, B:64:0x01eb, B:65:0x01fe, B:66:0x0201, B:47:0x014b, B:41:0x0116, B:32:0x00e3, B:69:0x0204, B:74:0x021b, B:76:0x0221, B:83:0x022d, B:85:0x0246, B:89:0x025f, B:94:0x0285, B:98:0x02b1, B:99:0x02c4, B:104:0x02db, B:107:0x0302, B:112:0x0322, B:113:0x032c, B:103:0x02c8, B:95:0x0294, B:90:0x026a, B:81:0x0227, B:116:0x032f, B:121:0x034a, B:123:0x0350, B:126:0x0364, B:128:0x0379, B:131:0x0396, B:133:0x03bc, B:136:0x03d7, B:137:0x03d9, B:142:0x03ef, B:144:0x03f4, B:148:0x03f8, B:138:0x03de, B:150:0x03fc, B:151:0x040a, B:152:0x040d, B:127:0x036f, B:155:0x0410, B:156:0x0413, B:157:0x0416, B:160:0x0419, B:165:0x0438, B:170:0x0447, B:173:0x0462, B:176:0x0478, B:177:0x047a, B:178:0x0480, B:180:0x0484, B:181:0x048f, B:168:0x0441, B:184:0x0492, B:187:0x04aa, B:191:0x04bf, B:194:0x04d2, B:196:0x04f4, B:200:0x0503, B:201:0x0506, B:203:0x0509, B:206:0x051a, B:207:0x0521, B:210:0x0524, B:211:0x052b, B:212:0x052e, B:215:0x0531, B:221:0x054b, B:222:0x0554, B:223:0x0557), top: B:249:0x0019 }] */
        /* JADX WARN: Code duplicated, block: B:63:0x01e4 A[Catch: Exception -> 0x055a, TryCatch #11 {Exception -> 0x055a, blocks: (B:3:0x0019, B:6:0x0037, B:10:0x005e, B:14:0x007d, B:18:0x009c, B:15:0x0087, B:20:0x00b0, B:25:0x00d7, B:27:0x00dd, B:34:0x00e9, B:36:0x00ef, B:40:0x010b, B:42:0x0120, B:46:0x013c, B:50:0x0168, B:53:0x01a0, B:55:0x01b1, B:62:0x01dd, B:63:0x01e4, B:59:0x01b5, B:64:0x01eb, B:65:0x01fe, B:66:0x0201, B:47:0x014b, B:41:0x0116, B:32:0x00e3, B:69:0x0204, B:74:0x021b, B:76:0x0221, B:83:0x022d, B:85:0x0246, B:89:0x025f, B:94:0x0285, B:98:0x02b1, B:99:0x02c4, B:104:0x02db, B:107:0x0302, B:112:0x0322, B:113:0x032c, B:103:0x02c8, B:95:0x0294, B:90:0x026a, B:81:0x0227, B:116:0x032f, B:121:0x034a, B:123:0x0350, B:126:0x0364, B:128:0x0379, B:131:0x0396, B:133:0x03bc, B:136:0x03d7, B:137:0x03d9, B:142:0x03ef, B:144:0x03f4, B:148:0x03f8, B:138:0x03de, B:150:0x03fc, B:151:0x040a, B:152:0x040d, B:127:0x036f, B:155:0x0410, B:156:0x0413, B:157:0x0416, B:160:0x0419, B:165:0x0438, B:170:0x0447, B:173:0x0462, B:176:0x0478, B:177:0x047a, B:178:0x0480, B:180:0x0484, B:181:0x048f, B:168:0x0441, B:184:0x0492, B:187:0x04aa, B:191:0x04bf, B:194:0x04d2, B:196:0x04f4, B:200:0x0503, B:201:0x0506, B:203:0x0509, B:206:0x051a, B:207:0x0521, B:210:0x0524, B:211:0x052b, B:212:0x052e, B:215:0x0531, B:221:0x054b, B:222:0x0554, B:223:0x0557), top: B:249:0x0019 }] */
        /* JADX WARN: Code duplicated, block: B:64:0x01eb A[Catch: Exception -> 0x055a, TRY_LEAVE, TryCatch #11 {Exception -> 0x055a, blocks: (B:3:0x0019, B:6:0x0037, B:10:0x005e, B:14:0x007d, B:18:0x009c, B:15:0x0087, B:20:0x00b0, B:25:0x00d7, B:27:0x00dd, B:34:0x00e9, B:36:0x00ef, B:40:0x010b, B:42:0x0120, B:46:0x013c, B:50:0x0168, B:53:0x01a0, B:55:0x01b1, B:62:0x01dd, B:63:0x01e4, B:59:0x01b5, B:64:0x01eb, B:65:0x01fe, B:66:0x0201, B:47:0x014b, B:41:0x0116, B:32:0x00e3, B:69:0x0204, B:74:0x021b, B:76:0x0221, B:83:0x022d, B:85:0x0246, B:89:0x025f, B:94:0x0285, B:98:0x02b1, B:99:0x02c4, B:104:0x02db, B:107:0x0302, B:112:0x0322, B:113:0x032c, B:103:0x02c8, B:95:0x0294, B:90:0x026a, B:81:0x0227, B:116:0x032f, B:121:0x034a, B:123:0x0350, B:126:0x0364, B:128:0x0379, B:131:0x0396, B:133:0x03bc, B:136:0x03d7, B:137:0x03d9, B:142:0x03ef, B:144:0x03f4, B:148:0x03f8, B:138:0x03de, B:150:0x03fc, B:151:0x040a, B:152:0x040d, B:127:0x036f, B:155:0x0410, B:156:0x0413, B:157:0x0416, B:160:0x0419, B:165:0x0438, B:170:0x0447, B:173:0x0462, B:176:0x0478, B:177:0x047a, B:178:0x0480, B:180:0x0484, B:181:0x048f, B:168:0x0441, B:184:0x0492, B:187:0x04aa, B:191:0x04bf, B:194:0x04d2, B:196:0x04f4, B:200:0x0503, B:201:0x0506, B:203:0x0509, B:206:0x051a, B:207:0x0521, B:210:0x0524, B:211:0x052b, B:212:0x052e, B:215:0x0531, B:221:0x054b, B:222:0x0554, B:223:0x0557), top: B:249:0x0019 }] */
        /* JADX WARN: Code restructure failed: missing block: B:103:0x02c8, code lost:
        
            r12 = r11.c.ae;
            r12.setSelection(r12.getText().toString().length());
         */
        /* JADX WARN: Code restructure failed: missing block: B:104:0x02db, code lost:
        
            r12 = r11.c;
            r14 = r12.ae;
            r12 = r12.getResources().getColor(ivas.gov.bisp.enumeration.R.color.green);
         */
        /* JADX WARN: Code restructure failed: missing block: B:105:0x02e7, code lost:
        
            r1 = ivas.gov.bisp.enumeration.activity.singlediscrepancy.CnicActivity.OooO00o.a;
            r2 = ((r1 ^ 33) | (r1 & 33)) << 1;
            r1 = -(((~r1) & 33) | (r1 & (-34)));
            r3 = ((r2 | r1) << 1) - (r1 ^ r2);
            ivas.gov.bisp.enumeration.activity.singlediscrepancy.CnicActivity.OooO00o.b = r3 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:106:0x0300, code lost:
        
            if ((r3 % 2) != 0) goto L112;
         */
        /* JADX WARN: Code restructure failed: missing block: B:107:0x0302, code lost:
        
            r14.setTextColor(r12);
            r11.c.ae.getText();
            r11.c.ad.x = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:108:0x0312, code lost:
        
            r12 = ivas.gov.bisp.enumeration.activity.singlediscrepancy.CnicActivity.OooO00o.b;
            r14 = (r12 & 95) + (r12 | 95);
            ivas.gov.bisp.enumeration.activity.singlediscrepancy.CnicActivity.OooO00o.a = r14 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:109:0x031e, code lost:
        
            if ((r14 % 2) == 0) goto L111;
         */
        /* JADX WARN: Code restructure failed: missing block: B:110:0x0320, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:111:0x0321, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:112:0x0322, code lost:
        
            r14.setTextColor(r12);
            r11.c.ae.getText();
         */
        /* JADX WARN: Code restructure failed: missing block: B:113:0x032c, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:114:0x032d, code lost:
        
            r12 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:115:0x032e, code lost:
        
            throw r12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:169:0x0445, code lost:
        
            if (r12.length() < 15) goto L170;
         */
        /* JADX WARN: Code restructure failed: missing block: B:77:0x0222, code lost:
        
            if (r12.endsWith("-") == false) goto L83;
         */
        /* JADX WARN: Code restructure failed: missing block: B:82:0x022b, code lost:
        
            if (r12.endsWith("-") == false) goto L83;
         */
        /* JADX WARN: Code restructure failed: missing block: B:83:0x022d, code lost:
        
            r14 = r11.c.ae;
            r4 = new java.lang.StringBuilder();
         */
        /* JADX WARN: Code restructure failed: missing block: B:84:0x0236, code lost:
        
            r7 = ivas.gov.bisp.enumeration.activity.singlediscrepancy.CnicActivity.OooO00o.b;
            r9 = r7 ^ 39;
            r7 = (r7 & 39) << 1;
            r10 = (r9 & r7) + (r7 | r9);
            ivas.gov.bisp.enumeration.activity.singlediscrepancy.CnicActivity.OooO00o.a = r10 % 128;
            r10 = r10 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:85:0x0246, code lost:
        
            r4.append(r12.substring(0, 5));
            r4.append("-");
         */
        /* JADX WARN: Code restructure failed: missing block: B:86:0x0250, code lost:
        
            r3 = ivas.gov.bisp.enumeration.activity.singlediscrepancy.CnicActivity.OooO00o.a + 47;
            ivas.gov.bisp.enumeration.activity.singlediscrepancy.CnicActivity.OooO00o.b = r3 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:87:0x025b, code lost:
        
            if ((r3 % 2) == 0) goto L90;
         */
        /* JADX WARN: Code restructure failed: missing block: B:89:0x025f, code lost:
        
            r4.append(r12.substring(68, 49));
            r4.append("-");
         */
        /* JADX WARN: Code restructure failed: missing block: B:90:0x026a, code lost:
        
            r4.append(r12.substring(6, 13));
            r4.append("-");
         */
        /* JADX WARN: Code restructure failed: missing block: B:91:0x0274, code lost:
        
            r3 = ivas.gov.bisp.enumeration.activity.singlediscrepancy.CnicActivity.OooO00o.a;
            r6 = (r3 ^ 119) + ((r3 & 119) << 1);
            ivas.gov.bisp.enumeration.activity.singlediscrepancy.CnicActivity.OooO00o.b = r6 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:92:0x0281, code lost:
        
            if ((r6 % 2) == 0) goto L95;
         */
        /* JADX WARN: Code restructure failed: missing block: B:94:0x0285, code lost:
        
            r4.append(r12.substring(122));
            r14.setText(r4.toString());
         */
        /* JADX WARN: Code restructure failed: missing block: B:95:0x0294, code lost:
        
            r4.append(r12.substring(13));
            r14.setText(r4.toString());
         */
        /* JADX WARN: Code restructure failed: missing block: B:96:0x02a2, code lost:
        
            r12 = ivas.gov.bisp.enumeration.activity.singlediscrepancy.CnicActivity.OooO00o.b;
            r14 = (r12 ^ 23) + ((r12 & 23) << 1);
            ivas.gov.bisp.enumeration.activity.singlediscrepancy.CnicActivity.OooO00o.a = r14 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:97:0x02af, code lost:
        
            if ((r14 % 2) != 0) goto L103;
         */
        /* JADX WARN: Code restructure failed: missing block: B:98:0x02b1, code lost:
        
            r12 = r11.c.ae;
            r12.setSelection(r12.getText().toString().length());
         */
        /* JADX WARN: Code restructure failed: missing block: B:99:0x02c4, code lost:
        
            r7 = 68 / 0;
         */
        @Override // android.text.TextWatcher
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onTextChanged(java.lang.CharSequence r12, int r13, int r14, int r15) {
            /*
                Method dump skipped, instruction units count: 1371
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.activity.singlediscrepancy.CnicActivity.OooO00o.onTextChanged(java.lang.CharSequence, int, int, int):void");
        }
    }

    public static void u(CnicActivity cnicActivity, int i, String str, String str2) {
        int i2 = 2 % 2;
        Typeface typefaceB = C0084m.b(cnicActivity, R.font.jameel_noori_nastaleeq);
        androidx.appcompat.app.b.aIz aiz = new androidx.appcompat.app.b.aIz(cnicActivity);
        View viewInflate = LayoutInflater.from(cnicActivity).inflate(R.layout.new_custom_dialog, (ViewGroup) cnicActivity.findViewById(android.R.id.content), false);
        aiz.a.f1o = viewInflate;
        androidx.appcompat.app.b bVarB = aiz.b();
        bVarB.show();
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_heading);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_message);
        if (!Pattern.compile("^[a-zA-Z\\.\\?\\ ]*$").matcher(str2).matches()) {
            int i3 = q + 11;
            p = i3 % 128;
            int i4 = i3 % 2;
            textView2.setTypeface(typefaceB);
            int i5 = p + 65;
            q = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 4 % 2;
            }
        }
        textView.setText(str);
        textView2.setText(str2);
        ((TextView) viewInflate.findViewById(R.id.btn_ok)).setOnClickListener(new J(cnicActivity, bVarB));
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseTouch, ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public void t() {
        int i = 2 % 2;
        super.t();
        this.ai = new ProgressDialog(this);
        this.ad = (BISPApplication) getApplicationContext();
        Intent intent = getIntent();
        this.ah = (RosterItem) intent.getSerializableExtra("roster_data");
        intent.getIntExtra("roster_index", 0);
        this.ax = new SessionManager(this);
        this.ae = (EditText) findViewById(R.id.et_cnic);
        this.af = (TextView) findViewById(R.id.btn_ok);
        this.ag = (TextView) findViewById(R.id.btn_validate);
        this.af.setOnClickListener(this);
        this.ag.setOnClickListener(this);
        this.ag.setVisibility(8);
        this.af.setVisibility(0);
        ((TextView) findViewById(R.id.application_version_textView)).setText("v7.6 (LIVE)");
        this.ae.setFilters(new InputFilter[]{new InputFilter.LengthFilter(15)});
        this.ae.addTextChangedListener(new av(this).new buW(this.ae));
        this.ae.addTextChangedListener(new OooO00o());
        this.ak = this.ah.getHhid();
        this.ah.gethH_Name();
        this.aM = this.ah.isIs_Benificiary();
        this.aS = this.ah.getMessage();
        this.aB = this.ah.getCnic();
        this.aC = this.ah.getDisabilityCode();
        this.aD = this.ah.getDisabilityStatus();
        this.aE = this.ah.getDiscrepancy_status();
        this.aH = this.ah.getDob();
        this.aQ = this.ah.get_educationLevelCode();
        this.aG = this.ah.get_employmentCode();
        this.aF = this.ah.getEmployment_status();
        this.aN = this.ah.getForm_no();
        this.aO = this.ah.getGender();
        this.aP = this.ah.get_goneToSchoolCode();
        this.aK = this.ah.getHavingChronicDiseaseCode();
        this.aL = this.ah.getHhMemberNames();
        this.aJ = this.ah.isLiterate();
        this.aR = this.ah.get_lastWeekWorkingHours();
        this.aI = this.ah.getMaritalStatus();
        this.aA = this.ah.getMaritalStatusCode();
        this.an = this.ah.getMessage();
        this.ao = this.ah.getRelationToHouseholdHead();
        this.ap = this.ah.getrId();
        this.am = this.ah.getWorkStatus();
        this.aw = this.ah.get_workStatusCode();
        this.ar = this.ah.getMobilenumber();
        this.aq = this.ah.getMobile_network();
        this.as = this.ah.getBank_name();
        this.at = this.ah.getBranch_code();
        this.au = this.ah.getBank_address();
        this.ay = this.ah.getAcc_title();
        this.av = this.ah.getAcc_number();
        this.al = this.ah.getDupRosterList();
        this.ae.setText(ag.b(this.aB));
        if (!this.aB.equals(BuildConfig.FLAVOR)) {
            int i2 = p + 5;
            q = i2 % 128;
            int i3 = i2 % 2;
            if (!this.aB.equalsIgnoreCase("NA")) {
                y(this.aB);
                int i4 = p + 59;
                q = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
                return;
            }
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View viewInflate = LayoutInflater.from(this).inflate(R.layout.cnic_dialog, (ViewGroup) findViewById(android.R.id.content), false);
        builder.setView(viewInflate);
        AlertDialog alertDialogK = j.k(builder, false);
        EditText editText = (EditText) viewInflate.findViewById(R.id.et_cnic);
        TextView textView = (TextView) viewInflate.findViewById(R.id.btn_ok);
        editText.addTextChangedListener(new av(this).new buW(editText));
        textView.setOnClickListener(new ViewOnClickListenerC0300x(this, editText, alertDialogK));
    }

    public class OooO0O0 implements DialogInterface.OnClickListener {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char[] a$s17$32 = {48839, 48718, 48725, 48718, 48716, 48740, 48735, 48719, 48716, 48711, 48713, 48728, 48735, 48716, 48718, 48726, 48718, 48726};
        private static int c = 0;
        private static int d = 1;

        public OooO0O0() {
        }

        /* JADX WARN: Code duplicated, block: B:18:0x015d  */
        /* JADX WARN: Code duplicated, block: B:24:0x0355  */
        /* JADX WARN: Code duplicated, block: B:37:? A[RETURN, SYNTHETIC] */
        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2;
            String str;
            int i3;
            double d2;
            String str2;
            int i4;
            int i5 = 2 % 2;
            CnicActivity cnicActivity = CnicActivity.this;
            cnicActivity.ah = new RosterItem(cnicActivity.ak, cnicActivity.aM, cnicActivity.aS, BuildConfig.FLAVOR, cnicActivity.aB, cnicActivity.aC, cnicActivity.aD, cnicActivity.aE, cnicActivity.aH, cnicActivity.aQ, cnicActivity.aG, cnicActivity.aF, cnicActivity.aN, cnicActivity.aO, cnicActivity.aP, cnicActivity.aK, cnicActivity.aL, cnicActivity.aJ, cnicActivity.aR, cnicActivity.aI, cnicActivity.aA, cnicActivity.an, cnicActivity.ao, cnicActivity.ap, cnicActivity.am, cnicActivity.aw, cnicActivity.al, cnicActivity.ar, cnicActivity.aq, cnicActivity.as, cnicActivity.at, cnicActivity.au, cnicActivity.ay, cnicActivity.av);
            CnicActivity cnicActivity2 = CnicActivity.this;
            RosterItem rosterItem = cnicActivity2.ah;
            Object hhid = rosterItem.getHhid();
            rosterItem.gethH_Name();
            rosterItem.isIs_Benificiary();
            rosterItem.getMessage();
            rosterItem.getDiscrepancy_status();
            rosterItem.getCnic();
            int i6 = rosterItem.get_educationLevelCode();
            int disabilityCode = rosterItem.getDisabilityCode();
            String disabilityStatus = rosterItem.getDisabilityStatus();
            int i7 = rosterItem.get_employmentCode();
            String employment_status = rosterItem.getEmployment_status();
            String form_no = rosterItem.getForm_no();
            String gender = rosterItem.getGender();
            int i8 = rosterItem.get_goneToSchoolCode();
            int havingChronicDiseaseCode = rosterItem.getHavingChronicDiseaseCode();
            String hhMemberNames = rosterItem.getHhMemberNames();
            String dob = rosterItem.getDob();
            boolean zIsLiterate = rosterItem.isLiterate();
            int i9 = rosterItem.get_lastWeekWorkingHours();
            int maritalStatusCode = rosterItem.getMaritalStatusCode();
            String maritalStatus = rosterItem.getMaritalStatus();
            rosterItem.getMessage();
            int relationToHouseholdHead = rosterItem.getRelationToHouseholdHead();
            long j = rosterItem.getrId();
            String workStatus = rosterItem.getWorkStatus();
            int i10 = rosterItem.get_workStatusCode();
            String str3 = zIsLiterate ? "1" : "0";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yy HH.mm.ss.SSS aa");
            String str4 = str3;
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MM-yyyy");
            double dC = 0.0d;
            try {
                Date date = simpleDateFormat.parse(dob);
                Calendar calendar = Calendar.getInstance();
                i2 = disabilityCode;
                str = disabilityStatus;
                try {
                    calendar.setTimeInMillis(date.getTime());
                    try {
                        dC = ag.c(calendar.get(5), calendar.get(2), calendar.get(1));
                        str2 = simpleDateFormat2.format(date);
                        d2 = dC;
                    } catch (ParseException unused) {
                        i3 = d + 17;
                        c = i3 % 128;
                        if (i3 % 2 != 0) {
                            int i11 = 5 / 3;
                        }
                        d2 = dC;
                        str2 = dob;
                    }
                } catch (ParseException unused2) {
                    i3 = d + 17;
                    c = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i12 = 5 / 3;
                    }
                    d2 = dC;
                    str2 = dob;
                    JSONObject jSONObject = new JSONObject();
                    JSONObject jSONObject2 = new JSONObject();
                    cnicActivity2.ad = (BISPApplication) cnicActivity2.getApplicationContext();
                    String ipAddress = Formatter.formatIpAddress(((WifiManager) cnicActivity2.getApplicationContext().getSystemService("wifi")).getConnectionInfo().getIpAddress());
                    jSONObject.put("house_hold_id", hhid);
                    jSONObject.put("is_pmt", 0);
                    jSONObject.put("type", "cnic");
                    JSONArray jSONArray = new JSONArray();
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("rId", j);
                    jSONObject3.put("cnicEnc", cnicActivity2.aB);
                    jSONObject3.put("cnic", cnicActivity2.aB);
                    jSONObject3.put("hhMemberNames", hhMemberNames);
                    jSONObject3.put("hhMemberNamesEnc", hhMemberNames);
                    jSONObject3.put("dob", str2);
                    jSONObject3.put("age", d2);
                    jSONObject3.put("maritalStatus", maritalStatus);
                    jSONObject3.put("maritalStatusCode", maritalStatusCode);
                    jSONObject3.put("gender", gender);
                    jSONObject3.put("relationToHhHead", relationToHouseholdHead);
                    jSONObject3.put("formNo", form_no);
                    jSONObject3.put("disabilityStatus", str);
                    jSONObject3.put("disabilityCode", i2);
                    jSONObject3.put("havingChronicDiseaseCode", havingChronicDiseaseCode);
                    jSONObject3.put("isLiterate", str4);
                    jSONObject3.put("goneToSchoolCode", i8);
                    jSONObject3.put("educationLevelCode", i6);
                    jSONObject3.put("workStatusCode", i10);
                    jSONObject3.put("workStatus", workStatus);
                    jSONObject3.put("lastWeekWorkingHours", i9);
                    jSONObject3.put("employmentCode", i7);
                    jSONObject3.put("mobile_no", cnicActivity2.ar);
                    jSONObject3.put("mobile_network_name", cnicActivity2.aq);
                    jSONObject3.put("update_type", "cnic");
                    jSONObject3.put("banks_name", cnicActivity2.as);
                    jSONObject3.put("branch_code", cnicActivity2.at);
                    jSONObject3.put("bank_address", cnicActivity2.au);
                    jSONObject3.put("account_title", cnicActivity2.ay);
                    jSONObject3.put("account_number", cnicActivity2.av);
                    jSONObject3.put("employmentStatus", employment_status);
                    jSONObject3.put("endBy", cnicActivity2.ax.z());
                    jSONObject3.put("endByIp", ipAddress);
                    jSONArray.put(0, jSONObject3);
                    jSONObject.put("rosterList", jSONArray);
                    String str5 = cnicActivity2.ac;
                    StringBuilder sb = new StringBuilder();
                    sb.append("updateRosterData: ");
                    sb.append(jSONObject.toString());
                    Log.e(str5, sb.toString());
                    cnicActivity2.ai.setCancelable(false);
                    cnicActivity2.ai.setMessage("Please Wait...");
                    cnicActivity2.ai.setProgressStyle(0);
                    cnicActivity2.ai.show();
                    jSONObject2.put("string1", b.d(jSONObject.toString(), b.b(cnicActivity2.ax.k()), b.b(cnicActivity2.ax.m())));
                    byte[] bArrB = b.b(cnicActivity2.ax.k());
                    byte[] bArrB2 = b.b(cnicActivity2.ax.m());
                    Object[] objArr = new Object[1];
                    a(true, new byte[]{0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1}, new int[]{0, 18, 134, 0}, objArr);
                    jSONObject2.put("string2", b.d(((String) objArr[0]).intern(), bArrB, bArrB2));
                    C0298u c0298u = new C0298u(cnicActivity2, 1, "https://meladeskapp.bisp.gov.pk/api/Roster/bZJVzTu9rHlQm0D", jSONObject2, new M(cnicActivity2), new C0297t(cnicActivity2));
                    c0298u.m = new z(130000, 0, 0.0f);
                    c0298u.k = false;
                    a.b(cnicActivity2).c(c0298u);
                    dialogInterface.cancel();
                    i4 = d + 101;
                    c = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i13 = 57 / 0;
                    }
                }
            } catch (ParseException unused3) {
                i2 = disabilityCode;
                str = disabilityStatus;
            }
            JSONObject jSONObject4 = new JSONObject();
            JSONObject jSONObject5 = new JSONObject();
            try {
                cnicActivity2.ad = (BISPApplication) cnicActivity2.getApplicationContext();
                String ipAddress2 = Formatter.formatIpAddress(((WifiManager) cnicActivity2.getApplicationContext().getSystemService("wifi")).getConnectionInfo().getIpAddress());
                jSONObject4.put("house_hold_id", hhid);
                jSONObject4.put("is_pmt", 0);
                jSONObject4.put("type", "cnic");
                JSONArray jSONArray2 = new JSONArray();
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put("rId", j);
                jSONObject6.put("cnicEnc", cnicActivity2.aB);
                jSONObject6.put("cnic", cnicActivity2.aB);
                jSONObject6.put("hhMemberNames", hhMemberNames);
                jSONObject6.put("hhMemberNamesEnc", hhMemberNames);
                jSONObject6.put("dob", str2);
                jSONObject6.put("age", d2);
                jSONObject6.put("maritalStatus", maritalStatus);
                jSONObject6.put("maritalStatusCode", maritalStatusCode);
                jSONObject6.put("gender", gender);
                jSONObject6.put("relationToHhHead", relationToHouseholdHead);
                jSONObject6.put("formNo", form_no);
                jSONObject6.put("disabilityStatus", str);
                jSONObject6.put("disabilityCode", i2);
                jSONObject6.put("havingChronicDiseaseCode", havingChronicDiseaseCode);
                jSONObject6.put("isLiterate", str4);
                jSONObject6.put("goneToSchoolCode", i8);
                jSONObject6.put("educationLevelCode", i6);
                jSONObject6.put("workStatusCode", i10);
                jSONObject6.put("workStatus", workStatus);
                jSONObject6.put("lastWeekWorkingHours", i9);
                jSONObject6.put("employmentCode", i7);
                jSONObject6.put("mobile_no", cnicActivity2.ar);
                jSONObject6.put("mobile_network_name", cnicActivity2.aq);
                jSONObject6.put("update_type", "cnic");
                jSONObject6.put("banks_name", cnicActivity2.as);
                jSONObject6.put("branch_code", cnicActivity2.at);
                jSONObject6.put("bank_address", cnicActivity2.au);
                jSONObject6.put("account_title", cnicActivity2.ay);
                jSONObject6.put("account_number", cnicActivity2.av);
                jSONObject6.put("employmentStatus", employment_status);
                jSONObject6.put("endBy", cnicActivity2.ax.z());
                jSONObject6.put("endByIp", ipAddress2);
                jSONArray2.put(0, jSONObject6);
                jSONObject4.put("rosterList", jSONArray2);
                String str6 = cnicActivity2.ac;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("updateRosterData: ");
                sb2.append(jSONObject4.toString());
                Log.e(str6, sb2.toString());
                cnicActivity2.ai.setCancelable(false);
                cnicActivity2.ai.setMessage("Please Wait...");
                cnicActivity2.ai.setProgressStyle(0);
                cnicActivity2.ai.show();
                jSONObject5.put("string1", b.d(jSONObject4.toString(), b.b(cnicActivity2.ax.k()), b.b(cnicActivity2.ax.m())));
                byte[] bArrB3 = b.b(cnicActivity2.ax.k());
                byte[] bArrB4 = b.b(cnicActivity2.ax.m());
                Object[] objArr2 = new Object[1];
                a(true, new byte[]{0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1}, new int[]{0, 18, 134, 0}, objArr2);
                jSONObject5.put("string2", b.d(((String) objArr2[0]).intern(), bArrB3, bArrB4));
                C0298u c0298u2 = new C0298u(cnicActivity2, 1, "https://meladeskapp.bisp.gov.pk/api/Roster/bZJVzTu9rHlQm0D", jSONObject5, new M(cnicActivity2), new C0297t(cnicActivity2));
                c0298u2.m = new z(130000, 0, 0.0f);
                c0298u2.k = false;
                a.b(cnicActivity2).c(c0298u2);
            } catch (JSONException unused4) {
            }
            dialogInterface.cancel();
            i4 = d + 101;
            c = i4 % 128;
            if (i4 % 2 != 0) {
                int i14 = 57 / 0;
            }
        }

        private static void a(boolean z, byte[] bArr, int[] iArr, Object[] objArr) {
            int i = 2 % 2;
            i iVar = new i();
            int i2 = iArr[0];
            int i3 = iArr[1];
            int i4 = iArr[2];
            int i5 = iArr[3];
            char[] cArr = a$s17$32;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                for (int i6 = 0; i6 < length; i6++) {
                    cArr2[i6] = (char) (((long) cArr[i6]) ^ 2843778254771240638L);
                }
                cArr = cArr2;
            }
            char[] cArr3 = new char[i3];
            System.arraycopy(cArr, i2, cArr3, 0, i3);
            if (bArr != null) {
                char[] cArr4 = new char[i3];
                iVar.b = 0;
                char c2 = 0;
                while (iVar.b < i3) {
                    if (bArr[iVar.b] == 1) {
                        cArr4[iVar.b] = (char) (((cArr3[iVar.b] * 2) + 1) - c2);
                        int i7 = $10 + 65;
                        $11 = i7 % 128;
                        int i8 = i7 % 2;
                    } else {
                        cArr4[iVar.b] = (char) ((cArr3[iVar.b] * 2) - c2);
                    }
                    c2 = cArr4[iVar.b];
                    iVar.b++;
                    int i9 = $11 + 85;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                }
                cArr3 = cArr4;
            }
            if (i5 > 0) {
                char[] cArr5 = new char[i3];
                System.arraycopy(cArr3, 0, cArr5, 0, i3);
                int i11 = i3 - i5;
                System.arraycopy(cArr5, 0, cArr3, i11, i5);
                System.arraycopy(cArr5, i5, cArr3, 0, i11);
            }
            if (z) {
                char[] cArr6 = new char[i3];
                iVar.b = 0;
                int i12 = $10 + 119;
                $11 = i12 % 128;
                int i13 = i12 % 2;
                while (iVar.b < i3) {
                    int i14 = $10 + 1;
                    $11 = i14 % 128;
                    if (i14 % 2 == 0) {
                        cArr6[iVar.b] = cArr3[(i3 >>> iVar.b) >> 1];
                    } else {
                        cArr6[iVar.b] = cArr3[(i3 - iVar.b) - 1];
                    }
                    iVar.b++;
                }
                cArr3 = cArr6;
            }
            if (i4 > 0) {
                iVar.b = 0;
                while (iVar.b < i3) {
                    cArr3[iVar.b] = (char) (cArr3[iVar.b] - iArr[2]);
                    iVar.b++;
                }
            }
            objArr[0] = new String(cArr3);
        }
    }

    private static void a(int i, char[] cArr, Object[] objArr) {
        int i2 = 2 % 2;
        h hVar = new h();
        char[] cArr2 = new char[cArr.length];
        hVar.d = 0;
        char[] cArr3 = new char[2];
        while (hVar.d < cArr.length) {
            int i3 = $11 + 111;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                cArr3[0] = cArr[hVar.d];
                cArr3[0] = cArr[hVar.d >> 1];
            } else {
                cArr3[0] = cArr[hVar.d];
                cArr3[1] = cArr[hVar.d + 1];
            }
            int i4 = 58224;
            for (int i5 = 0; i5 < 16; i5++) {
                char c = cArr3[1];
                char c2 = cArr3[0];
                char c3 = (char) (c - (((c2 + i4) ^ ((c2 << 4) + ((char) (((long) b$s75$847) ^ 6963871449151285300L)))) ^ ((c2 >>> 5) + ((char) (((long) a$s76$847) ^ 6963871449151285300L)))));
                cArr3[1] = c3;
                cArr3[0] = (char) (c2 - (((c3 >>> 5) + ((char) (((long) c$s74$847) ^ 6963871449151285300L))) ^ ((c3 + i4) ^ ((c3 << 4) + ((char) (((long) d$s73$847) ^ 6963871449151285300L))))));
                i4 -= 40503;
            }
            cArr2[hVar.d] = cArr3[0];
            cArr2[hVar.d + 1] = cArr3[1];
            hVar.d += 2;
            int i6 = $11 + 113;
            $10 = i6 % 128;
            int i7 = i6 % 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }
}
