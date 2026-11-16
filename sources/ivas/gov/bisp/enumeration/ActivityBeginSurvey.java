package ivas.gov.bisp.enumeration;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.app.ProgressDialog;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.AsyncTask;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.AppCompatActivity;
import androidx.emoji2.text.d;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.orm.SugarContext;
import com.orm.SugarRecord;
import ivas.gov.bisp.enumeration.ActivityBeginSurvey;
import ivas.gov.bisp.enumeration.W.l;
import ivas.gov.bisp.enumeration.X.e;
import ivas.gov.bisp.enumeration.aA.aR;
import ivas.gov.bisp.enumeration.activity.TokenActivity;
import ivas.gov.bisp.enumeration.bG.B;
import ivas.gov.bisp.enumeration.bK.ac;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.bK.ah;
import ivas.gov.bisp.enumeration.bK.ak;
import ivas.gov.bisp.enumeration.bK.b;
import ivas.gov.bisp.enumeration.bX.P;
import ivas.gov.bisp.enumeration.enumerator.ActivityEnumeratorMain;
import ivas.gov.bisp.enumeration.fragments.FragmentMiscellaneous;
import ivas.gov.bisp.enumeration.fragments.FragmentOfflineRelationship;
import ivas.gov.bisp.enumeration.fragments.FragmentRelationship;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.locality;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.not_at_home;
import ivas.gov.bisp.enumeration.models.EnumeratorModel;
import ivas.gov.bisp.enumeration.models.KeyValue;
import ivas.gov.bisp.enumeration.models.NewLocationForm;
import ivas.gov.bisp.enumeration.models.Roster;
import ivas.gov.bisp.enumeration.models.Survey;
import ivas.gov.bisp.enumeration.models.VerificationQuestionsCount;
import ivas.gov.bisp.enumeration.p024ax.ax;
import ivas.gov.bisp.enumeration.p026az.C0104p;
import ivas.gov.bisp.enumeration.p026az.z;
import ivas.gov.bisp.enumeration.p043bp.C0215v;
import ivas.gov.bisp.enumeration.p043bp.M;
import ivas.gov.bisp.enumeration.p043bp.N;
import ivas.gov.bisp.enumeration.p043bp.S;
import ivas.gov.bisp.enumeration.p043bp.T;
import ivas.gov.bisp.enumeration.p044bq.ap;
import ivas.gov.bisp.enumeration.p091n.j;
import ivas.gov.bisp.enumeration.p096p.h;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.lang.reflect.Constructor;
import java.security.SecureRandom;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import net.sqlcipher.BuildConfig;
import o.a;
import o.i;
import org.acra.ErrorReporter;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class ActivityBeginSurvey extends BaseActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int a$s14$1929 = 1962648921;
    public static final /* synthetic */ int af = 0;
    private static byte[] b$s29$2034 = null;
    private static int p = 1;
    private static int q;
    public NewLocationForm aA;
    public String aB;
    public DialogInterface.OnClickListener aF;
    public Survey aG;
    public ProgressDialog ag;
    public ArrayList<String> ai;
    public Fragment aj;
    public ArrayList<String> ak;
    public Survey ap;
    public ArrayList<Roster> aq;
    public ArrayList<B> ar;
    public SessionManager at;
    public VerificationQuestionsCount au;
    public EnumeratorModel av;
    public aR aw;

    @BindView
    public Button buttonNext;

    @BindView
    public Button buttonPrevious;

    @BindView
    public Button buttonSubmit;
    private static short[] c$s30$2034 = {-12457, 10871, -10868, 10855, -10850, 10849, -12452, 10848, -10849, 10857, -10864, 10855, 10862, -10858, -10856, 10849, 10871, -10875, 10871, -10868, 10855, -10850, 10849, -12510, 10851, 10842, -10834, 10851, 10832, -10863, 10851, 10827, -10785, 10851, 10836, -10877, 10851, 10819, -10793, 10851, 10851, 10851, -12458, -10854, 10854, -10856, -10849, 10866, 10857, -12481, -10862, 10864, -10868, -10850, 10865, 10851, 10849, 10786, -10801, 10854, 10850, 10797, -10802, 10857, 10794, -10792, -10853, 10855, -10858, 10807, -10792, 10849, -10855, -10864, 10866, 10850, 10791, -10802, 10865, 10786, -10857, -10837, -10852, 10851, 10849, -10857, -10850, 10849, 10803, -10801, 10854, 10850, 10851, 10862, 10877, -12455, -10800, -10852, 10853, -10858, 10864, -10851, -10857, 10848, 10799, -10798, 10818, -12503, 10848, -10879, -10850, 10855, 10856, -10857, 11334, -11331, 10866, -10861, 10868, -10874, 11334, -11380, -10870, 10818, 11364, -11371, 10848, -10856, 11375, -11460, 10997, 11368, -11366, -10849, 10855, -12461, -10849, -12542, -10845, -10852, 10853, -10858, 10864, -10857, -10856, 10848, 10858, -10853, 10854, 10794, -10790, -10854, 10854, -10859, 10851, 10857, -10849, 10798, -10790, -10854, 10854, -10850, 10851, 10848, 10848, 10789, -10801, -10852, 10853, 10852, -10857, 10856, -10863, 10804, -10785, -10852, 10851, 10849, -10857, -10850, 10849, 10803, -10801, 10854, 10850, 10851, 10862, 10877, -12453, 10853, 10862, -10850, -10859, -10852, -10852, -10850, 10861, 10864, -12455, 10852, 10850, -10858, 10854, -10852, 10853, -10858, 10864, -10858, 10852, 10864, -12510, 10852, 10850, -10858, 10854, -10852, 10853, -10858, 10864, -10858, 10852, 10864, -10866, -10860, 10854, -10850, 10853, 10851, 10868, -12463, 10851, -10864, 10877, -12460, -10857, 10863, 10864, -10817, 10866, -10868, 10850, 10827, -12451, -10800, -10852, 10853, -10858, 10864, -10851, -10857, 10816, 10831, -10812, 10871, -10868, 10855, -10850, 10817, -12492, -10845, -10852, 10853, -10858, 10864, -10851, -10857, 10848, 10799, -10812, 10871, -10868, 10855, -10850, 10849, 10800, -10801, 10863, 10850, -10851, -10860, 10801, -10792, -10850, -10857, 10807, -10801, 10864, 10786, -10801, 10854, 10850, 10797, -10792, -10864, 10866, 10786, -10808, 10853, 10869, -12457, 10871, -10868, 10855, -10850, 10817, -12485, -10843, 10871, -10868, 10855, -10850, 10849, 10800, -10802, 10857, 10850, -10857, 10807, -10792, -10868, 10870, -10867, 10800, -10798, 10872, 10839, -10801, 10853, 10862, 10857, 10836, -10808, 10853, 10869, 10842, -10792, -10864, -10850, 10817, 10832, -10808, 10853, 10869, 10842, -10792, -10864, 10834, -12460, 10871, -10868, 10855, -10850, 10849, 10789, -10837, 10864, -12504, -10843, 10871, -10868, 10855, -10850, 10849, 10800, -10802, 10857, 10850, -10857, 10807, -10792, -10868, 10870, -10867, 10800, -10798, -10856, 10807, -10801, 10853, 10862, -10871, 10804, -10808, 10853, 10869, -12489, -10843, 10862, 10851, 10856, -10851, -10857, 10848, 10799, -10812, 10871, -10868, 10855, -10850, 10849, 10800, -10802, 10857, 10850, -10857, 10807, -10785, -10852, -10868, 10870, -10867, 10800, -10798, -10856, 10807, -10801, 10853, 10862, -10871, 10804, -10808, 10853, 10869, -12449, -10858, -10860, 10854, 10870, -10862, -10852, 10853, -10858, 10855, 10856, 10849, -10872, 10864, -12507, 10871, -10868, 10855, -10850, 10849, 10800, -10803, 10848, -10856, 10864, -10868, 10862, -10853, -10853, 10852, 10858, 10790, -10790, -10854, 10854, -10864, 10870, 10861, -12452, 10848, -10850, 10851, 10830, 10822, -10799, -10852, 10853, -10858, 10864, -10851, -10855, -10850, -10849, 10851, 10828};
    private static int d$s27$2034 = -179883855;
    private static int e$s28$2034 = 335912690;
    private static int a$s26$2034 = -1530219822;
    public boolean ah = true;
    public int al = -1;
    public double as = 0.0d;
    public HashMap<Integer, KeyValue> aE = null;
    public long aC = 0;
    public int aD = 0;
    public boolean ay = true;
    public long az = 0;
    public h ax = new OooO0O0();

    public Survey A() {
        int i = 2 % 2;
        int i2 = q + 121;
        int i3 = i2 % 128;
        p = i3;
        int i4 = i2 % 2;
        Survey survey = this.ap;
        int i5 = i3 + 99;
        q = i5 % 128;
        int i6 = i5 % 2;
        return survey;
    }

    public VerificationQuestionsCount C() {
        int i = 2 % 2;
        int i2 = q + 91;
        int i3 = i2 % 128;
        p = i3;
        int i4 = i2 % 2;
        VerificationQuestionsCount verificationQuestionsCount = this.au;
        int i5 = i3 + 121;
        q = i5 % 128;
        if (i5 % 2 == 0) {
            return verificationQuestionsCount;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void F(HashMap<Integer, KeyValue> map) {
        int i = 2 % 2;
        int i2 = q + 23;
        p = i2 % 128;
        int i3 = i2 % 2;
        this.aE = map;
        if (i3 == 0) {
            int i4 = 8 / 0;
        }
    }

    @Override // ivas.gov.bisp.enumeration.BaseActivity, ivas.gov.bisp.enumeration.activitybase.BaseTouch, ivas.gov.bisp.enumeration.activitybase.BaseAuth, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        int i = 2 % 2;
        int i2 = q + 39;
        p = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = p + 75;
        q = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public int p() {
        int i = 2 % 2;
        int i2 = q;
        int i3 = i2 + 81;
        p = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 65;
        p = i5 % 128;
        int i6 = i5 % 2;
        return R.layout.activity_begin_survey;
    }

    public HashMap<Integer, KeyValue> x() {
        HashMap<Integer, KeyValue> map;
        int i = 2 % 2;
        int i2 = p + 123;
        int i3 = i2 % 128;
        q = i3;
        if (i2 % 2 != 0) {
            map = this.aE;
            int i4 = 6 / 0;
        } else {
            map = this.aE;
        }
        int i5 = i3 + 89;
        p = i5 % 128;
        if (i5 % 2 != 0) {
            return map;
        }
        throw null;
    }

    public Survey z() {
        int i = 2 % 2;
        int i2 = q + 93;
        int i3 = i2 % 128;
        p = i3;
        int i4 = i2 % 2;
        Survey survey = this.aG;
        int i5 = i3 + 73;
        q = i5 % 128;
        if (i5 % 2 == 0) {
            return survey;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public class OooO0OO extends AsyncTask<Void, Void, Void> {
        private static int a = 1;
        private static int b;
        public not_at_home c = null;
        public String d;
        public String e;
        public String f;
        public l h;

        public OooO0OO(String str, String str2, String str3, l lVar) {
            this.d = str;
            this.e = str2;
            this.f = str3;
            this.h = lVar;
        }

        @Override // android.os.AsyncTask
        public Void doInBackground(Void[] voidArr) {
            h hVarM;
            String str;
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & 121) + (i2 | 121);
            b = i3 % 128;
            int i4 = i3 % 2;
            Context applicationContext = ActivityBeginSurvey.this.getApplicationContext();
            int i5 = a;
            int i6 = (-2) - (((i5 ^ 104) + ((i5 & 104) << 1)) ^ (-1));
            b = i6 % 128;
            if (i6 % 2 != 0) {
                hVarM = AppDatabase.l(applicationContext).m();
                str = this.d;
                int i7 = 2 / 0;
            } else {
                hVarM = AppDatabase.l(applicationContext).m();
                str = this.d;
            }
            not_at_home not_at_homeVarR = hVarM.r(str, this.e, this.f);
            int i8 = a + 123;
            b = i8 % 128;
            int i9 = i8 % 2;
            this.c = not_at_homeVarR;
            if (i9 == 0) {
                return null;
            }
            throw null;
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Void r5) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 111;
            int i4 = -(-(i2 | 111));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            a = i5 % 128;
            int i6 = i5 % 2;
            super.onPostExecute(r5);
            if (this.c == null) {
                ((OooO00o) this.h).c(true);
                int i7 = b;
                int i8 = (i7 | 71) << 1;
                int i9 = -(i7 ^ 71);
                int i10 = (i8 & i9) + (i9 | i8);
                a = i10 % 128;
                int i11 = i10 % 2;
                return;
            }
            int i12 = a;
            int i13 = (-2) - (((i12 & 26) + (i12 | 26)) ^ (-1));
            b = i13 % 128;
            int i14 = i13 % 2;
            ((OooO00o) this.h).c(false);
            int i15 = a;
            int i16 = (i15 & 1) + (i15 | 1);
            b = i16 % 128;
            int i17 = i16 % 2;
        }
    }

    public class OooO0o extends AsyncTask<Void, Void, Void> {
        private static int a = 1;
        private static int b;
        public ArrayList<locality> c;

        public OooO0o() {
        }

        @Override // android.os.AsyncTask
        public Void doInBackground(Void[] voidArr) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 15;
            int i4 = (i2 | 15) & (~i3);
            int i5 = i3 << 1;
            int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
            a = i6 % 128;
            int i7 = i6 % 2;
            ArrayList<locality> arrayList = new ArrayList<>(AppDatabase.l(ActivityBeginSurvey.this.getApplicationContext()).m().U());
            int i8 = b;
            int i9 = ((i8 ^ 81) - (~(-(-((i8 & 81) << 1))))) - 1;
            a = i9 % 128;
            int i10 = i9 % 2;
            this.c = arrayList;
            int i11 = ((i8 & 76) + (i8 | 76)) - 1;
            a = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 22 / 0;
            }
            return null;
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Void r5) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & 27) + (i2 | 27);
            b = i3 % 128;
            int i4 = i3 % 2;
            super.onPostExecute(r5);
            int i5 = a;
            int i6 = i5 & 85;
            int i7 = (i5 ^ 85) | i6;
            int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
            b = i8 % 128;
            int i9 = i8 % 2;
            String str = this.c.get(0).data;
            int i10 = b + 27;
            a = i10 % 128;
            if (i10 % 2 == 0) {
                SharedPreferences.Editor editor = ah.c.e;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            ah ahVar = ah.c;
            ahVar.e.putString("localityString", str);
            ahVar.e.commit();
            q qVar = new q(this);
            int i11 = a + 53;
            b = i11 % 128;
            int i12 = i11 % 2;
            ak.f(qVar);
            int i13 = a;
            int i14 = i13 & 17;
            int i15 = (i13 ^ 17) | i14;
            int i16 = (i14 & i15) + (i15 | i14);
            b = i16 % 128;
            int i17 = i16 % 2;
        }
    }

    public final void u() {
        int i = 2 % 2;
        try {
            new ap(this.ae, false, this.ax, this.ai, this.ak, this.ap, this.aG, this.as, this.av, this.aq, this.au).execute(new Void[0]);
            int i2 = q + 5;
            p = i2 % 128;
            int i3 = i2 % 2;
        } catch (Exception unused) {
        }
    }

    public class OooO00o implements l {
        private static int a = 0;
        private static int b = 1;
        public final /* synthetic */ boolean c;

        public OooO00o(boolean z) {
            this.c = z;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
        
            if ((r1 % 2) != 0) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
        
            r6 = r5.d.buttonNext;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
        
            r6.setEnabled(true);
            r6 = r5.d;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
        
            r6 = r5.d.buttonNext;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
        
            r1 = ivas.gov.bisp.enumeration.ActivityBeginSurvey.OooO00o.b;
            r2 = (r1 & (-114)) | ((~r1) & 113);
            r1 = (r1 & 113) << 1;
            r3 = (r2 & r1) + (r1 | r2);
            ivas.gov.bisp.enumeration.ActivityBeginSurvey.OooO00o.a = r3 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0059, code lost:
        
            if ((r3 % 2) == 0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
        
            ivas.gov.bisp.enumeration.p024ax.ax.g(r6.ae, "Alert", "Please go not at home for this survey");
            r6 = 95 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0065, code lost:
        
            ivas.gov.bisp.enumeration.p024ax.ax.g(r6.ae, "Alert", "Please go not at home for this survey");
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
        
            r6 = r5.d;
            r1 = r5.c;
            r2 = ivas.gov.bisp.enumeration.ActivityBeginSurvey.af;
            r2 = ivas.gov.bisp.enumeration.ActivityBeginSurvey.OooO00o.a + 20;
            r4 = (r2 ^ (-1)) + (r2 << 1);
            ivas.gov.bisp.enumeration.ActivityBeginSurvey.OooO00o.b = r4 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:
        
            if ((r4 % 2) != 0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0080, code lost:
        
            r6.w(r1);
            r6 = 37 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0088, code lost:
        
            r6.w(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x008b, code lost:
        
            r6 = ivas.gov.bisp.enumeration.ActivityBeginSurvey.OooO00o.a + 62;
            r1 = (r6 ^ (-1)) + (r6 << 1);
            ivas.gov.bisp.enumeration.ActivityBeginSurvey.OooO00o.b = r1 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0098, code lost:
        
            if ((r1 % 2) == 0) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x009a, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x009c, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
        
            if (r6 == false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
        
            if ((!r6) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
        
            r6 = r2 ^ 3;
            r1 = ((((r2 & 3) | r6) << 1) - (~(-r6))) - 1;
            ivas.gov.bisp.enumeration.ActivityBeginSurvey.OooO00o.b = r1 % 128;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void c(boolean r6) {
            /*
                r5 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = ivas.gov.bisp.enumeration.ActivityBeginSurvey.OooO00o.b
                r2 = r1 ^ 21
                r1 = r1 & 21
                r1 = r1 | r2
                r3 = 1
                int r1 = r1 << r3
                int r2 = -r2
                int r2 = ~r2
                int r1 = r1 - r2
                int r1 = r1 - r3
                int r2 = r1 % 128
                ivas.gov.bisp.enumeration.ActivityBeginSurvey.OooO00o.a = r2
                int r1 = r1 % r0
                if (r1 == 0) goto L1e
                r1 = 89
                int r1 = r1 / 0
                if (r6 != 0) goto L6b
                goto L21
            L1e:
                r6 = r6 ^ r3
                if (r6 == 0) goto L6b
            L21:
                r6 = r2 ^ 3
                r1 = r2 & 3
                r1 = r1 | r6
                int r1 = r1 << r3
                int r6 = -r6
                int r6 = ~r6
                int r1 = r1 - r6
                int r1 = r1 - r3
                int r6 = r1 % 128
                ivas.gov.bisp.enumeration.ActivityBeginSurvey.OooO00o.b = r6
                int r1 = r1 % r0
                if (r1 != 0) goto L3c
                ivas.gov.bisp.enumeration.ActivityBeginSurvey r6 = ivas.gov.bisp.enumeration.ActivityBeginSurvey.this
                android.widget.Button r6 = r6.buttonNext
            L36:
                r6.setEnabled(r3)
                ivas.gov.bisp.enumeration.ActivityBeginSurvey r6 = ivas.gov.bisp.enumeration.ActivityBeginSurvey.this
                goto L41
            L3c:
                ivas.gov.bisp.enumeration.ActivityBeginSurvey r6 = ivas.gov.bisp.enumeration.ActivityBeginSurvey.this
                android.widget.Button r6 = r6.buttonNext
                goto L36
            L41:
                int r1 = ivas.gov.bisp.enumeration.ActivityBeginSurvey.OooO00o.b
                r2 = r1 & (-114(0xffffffffffffff8e, float:NaN))
                int r4 = ~r1
                r4 = r4 & 113(0x71, float:1.58E-43)
                r2 = r2 | r4
                r1 = r1 & 113(0x71, float:1.58E-43)
                int r1 = r1 << r3
                r3 = r2 & r1
                r1 = r1 | r2
                int r3 = r3 + r1
                int r1 = r3 % 128
                ivas.gov.bisp.enumeration.ActivityBeginSurvey.OooO00o.a = r1
                int r3 = r3 % r0
                java.lang.String r0 = "Please go not at home for this survey"
                java.lang.String r1 = "Alert"
                if (r3 == 0) goto L65
                androidx.appcompat.app.AppCompatActivity r6 = r6.ae
                ivas.gov.bisp.enumeration.p024ax.ax.g(r6, r1, r0)
                r6 = 95
                int r6 = r6 / 0
                goto L6a
            L65:
                androidx.appcompat.app.AppCompatActivity r6 = r6.ae
                ivas.gov.bisp.enumeration.p024ax.ax.g(r6, r1, r0)
            L6a:
                return
            L6b:
                ivas.gov.bisp.enumeration.ActivityBeginSurvey r6 = ivas.gov.bisp.enumeration.ActivityBeginSurvey.this
                boolean r1 = r5.c
                int r2 = ivas.gov.bisp.enumeration.ActivityBeginSurvey.af
                int r2 = ivas.gov.bisp.enumeration.ActivityBeginSurvey.OooO00o.a
                int r2 = r2 + 20
                r4 = r2 ^ (-1)
                int r2 = r2 << r3
                int r4 = r4 + r2
                int r2 = r4 % 128
                ivas.gov.bisp.enumeration.ActivityBeginSurvey.OooO00o.b = r2
                int r4 = r4 % r0
                if (r4 != 0) goto L88
                r6.w(r1)
                r6 = 37
                int r6 = r6 / 0
                goto L8b
            L88:
                r6.w(r1)
            L8b:
                int r6 = ivas.gov.bisp.enumeration.ActivityBeginSurvey.OooO00o.a
                int r6 = r6 + 62
                r1 = r6 ^ (-1)
                int r6 = r6 << r3
                int r1 = r1 + r6
                int r6 = r1 % 128
                ivas.gov.bisp.enumeration.ActivityBeginSurvey.OooO00o.b = r6
                int r1 = r1 % r0
                if (r1 == 0) goto L9b
                return
            L9b:
                r6 = 0
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.ActivityBeginSurvey.OooO00o.c(boolean):void");
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        C0104p.c().h(this.ae, getResources().getString(R.string.enter_data_lost), getResources().getString(R.string.survey_stop), new N(this, 0), null, false);
        int i2 = q + 115;
        p = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void G() {
        int i = 2 % 2;
        try {
            Objects.requireNonNull((BISPApplication) getApplicationContext());
            boolean zC = ax.c(this);
            int i2 = 3;
            Object[] objArr = new Object[1];
            b((byte) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(3) - 115), View.resolveSize(0, 0) + 515722184, (short) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) - 36), (-6867) - KeyEvent.keyCodeFromString(BuildConfig.FLAVOR), getPackageName().length() - 1368233830, objArr);
            String strIntern = ((String) objArr[0]).intern();
            if (zC) {
                if (ag.n == 2 && !BISPApplication.f) {
                    Object[] objArr2 = new Object[1];
                    b((byte) KeyEvent.normalizeMetaState(0), 515722184 - TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0), (short) (ViewConfiguration.getScrollDefaultDelay() >> 16), super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) - 6903, super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 1368233780, objArr2);
                    strIntern = ((String) objArr2[0]).intern();
                } else {
                    if (ag.n == 2) {
                        throw null;
                    }
                    int i3 = q + 9;
                    int i4 = i3 % 128;
                    p = i4;
                    if (i3 % 2 == 0) {
                        throw null;
                    }
                    int i5 = i4 + 23;
                    q = i5 % 128;
                    int i6 = i5 % 2;
                }
            }
            C0104p.c().h(this.ae, getResources().getString(R.string.are_you_sure), strIntern, new N(this, i2), null, false);
        } catch (Exception unused) {
            ErrorReporter errorReporter = P.d;
            Object[] objArr3 = new Object[1];
            b((byte) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) - 36), 515722165 + getApplicationInfo().targetSdkVersion, (short) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) - 36), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 6868, getPackageName().codePointAt(23) - 1368233849, objArr3);
            String strIntern2 = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            b((byte) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 4), 515722147 + getApplicationInfo().targetSdkVersion, (short) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 4), getApplicationInfo().targetSdkVersion - 6898, getApplicationInfo().targetSdkVersion - 1368233755, objArr4);
            errorReporter.b(strIntern2, ((String) objArr4[0]).intern());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        if (r19.aA.getIsGpsExempted() == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        r2 = r19.aG;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
    
        if (ivas.gov.bisp.enumeration.bK.ag.j(r2.batchName, r2.village_id) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        r2 = ivas.gov.bisp.enumeration.ActivityBeginSurvey.p + 41;
        ivas.gov.bisp.enumeration.ActivityBeginSurvey.q = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        if ((r2 % 2) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        if (ivas.gov.bisp.enumeration.bK.ac.j(r19.aG.getLocation(), r19.ap.location, 9160) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
    
        if (ivas.gov.bisp.enumeration.bK.ac.j(r19.aG.getLocation(), r19.ap.location, 500) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
    
        r2 = ivas.gov.bisp.enumeration.ActivityBeginSurvey.q + 15;
        ivas.gov.bisp.enumeration.ActivityBeginSurvey.p = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
    
        u();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0075, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0076, code lost:
    
        r7 = ivas.gov.bisp.enumeration.p026az.C0104p.c();
        r8 = r19.ae;
        r2 = new java.lang.Object[1];
        b((byte) (1 - (android.os.Process.getElapsedCpuTime() > 0 ? 1 : (android.os.Process.getElapsedCpuTime() == 0 ? 0 : -1))), 515722178 - android.view.View.MeasureSpec.getMode(0), (short) (android.graphics.ImageFormat.getBitsPerPixel(0) + 1), super.getResources().getString(ivas.gov.bisp.enumeration.R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 6871, (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)) - 1368233918, r2);
        r9 = ((java.lang.String) r2[0]).intern();
        r0 = new java.lang.Object[1];
        b((byte) (getApplicationInfo().targetSdkVersion - 31), super.getResources().getString(ivas.gov.bisp.enumeration.R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 515722180, (short) (super.getResources().getString(ivas.gov.bisp.enumeration.R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 4), super.getResources().getString(ivas.gov.bisp.enumeration.R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) - 6916, getApplicationInfo().targetSdkVersion - 1368233934, r0);
        r7.e(r8, r9, ((java.lang.String) r0[0]).intern(), null, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0125, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0126, code lost:
    
        u();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0129, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x012a, code lost:
    
        u();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x012d, code lost:
    
        r2 = ivas.gov.bisp.enumeration.ActivityBeginSurvey.p + 23;
        ivas.gov.bisp.enumeration.ActivityBeginSurvey.q = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0136, code lost:
    
        if ((r2 % 2) != 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0138, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0139, code lost:
    
        r0 = null;
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x013d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
    
        if (r19.aA.getIsGpsExempted() == 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void H() {
        /*
            Method dump skipped, instruction units count: 582
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.ActivityBeginSurvey.H():void");
    }

    public final void E() {
        int i;
        int i2 = 2;
        int i3 = 2 % 2;
        int i4 = p + 15;
        q = i4 % 128;
        if (i4 % 2 == 0 ? (i = this.ac) != 1 : (i = this.ac) != 0) {
            int i5 = p;
            int i6 = i5 + 63;
            q = i6 % 128;
            if (i6 % 2 == 0 ? i != 2 : i != 2) {
                int i7 = i5 + 29;
                int i8 = i7 % 128;
                q = i8;
                int i9 = i7 % 2;
                if (i == 0) {
                    int i10 = i8 + 85;
                    p = i10 % 128;
                    int i11 = i10 % 2;
                    if (!ag.d) {
                        try {
                            C0104p c0104pC = C0104p.c();
                            AppCompatActivity appCompatActivity = this.ae;
                            M m = new M(this, 2);
                            N n = new N(this, i2);
                            Object[] objArr = new Object[1];
                            b((byte) (Process.getGidForName(BuildConfig.FLAVOR) + 1), getPackageName().codePointAt(3) + 515722063, (short) Color.alpha(0), getPackageName().length() - 6892, getApplicationInfo().targetSdkVersion - 1368233893, objArr);
                            String strIntern = ((String) objArr[0]).intern();
                            Object[] objArr2 = new Object[1];
                            b((byte) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) - 49), super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) + 515722111, (short) TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0), super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(3) - 6982, (ViewConfiguration.getScrollBarSize() >> 8) - 1368233856, objArr2);
                            String strIntern2 = ((String) objArr2[0]).intern();
                            Object[] objArr3 = new Object[1];
                            b((byte) (getApplicationInfo().targetSdkVersion - 31), getPackageName().length() + 515722152, (short) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 6871, super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 1368233818, objArr3);
                            c0104pC.g(appCompatActivity, strIntern, strIntern2, ((String) objArr3[0]).intern(), m, null, n, false);
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    if (this.aB != null) {
                        int i12 = p + 35;
                        q = i12 % 128;
                        if (i12 % 2 != 0) {
                            BISPApplication.f();
                            throw null;
                        }
                        if (!BISPApplication.f()) {
                            int i13 = q + 125;
                            p = i13 % 128;
                            if (i13 % 2 != 0 ? ac.j(this.aB, BISPApplication.e(), 500) : !(!ac.j(this.aB, BISPApplication.e(), 25278))) {
                                int i14 = p + 27;
                                q = i14 % 128;
                                if (i14 % 2 == 0) {
                                    G();
                                    return;
                                } else {
                                    G();
                                    throw null;
                                }
                            }
                            C0104p c0104pC2 = C0104p.c();
                            AppCompatActivity appCompatActivity2 = this.ae;
                            Object[] objArr4 = new Object[1];
                            b((byte) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), getApplicationInfo().targetSdkVersion + 515722147, (short) (Process.myPid() >> 22), super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 6871, (ViewConfiguration.getMaximumFlingVelocity() >> 16) - 1368233919, objArr4);
                            String strIntern3 = ((String) objArr4[0]).intern();
                            Object[] objArr5 = new Object[1];
                            b((byte) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(3) - 115), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 515722183, (short) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 4), getApplicationInfo().targetSdkVersion - 6898, (-1368233903) - View.getDefaultSize(0, 0), objArr5);
                            c0104pC2.e(appCompatActivity2, strIntern3, ((String) objArr5[0]).intern(), null, false);
                            return;
                        }
                    }
                    C0104p c0104pC3 = C0104p.c();
                    AppCompatActivity appCompatActivity3 = this.ae;
                    String string = getResources().getString(R.string.enable_location);
                    Object[] objArr6 = new Object[1];
                    b((byte) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) - 49), 515722174 + super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length(), (short) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) - 49), getPackageName().length() - 6892, TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0) - 1368233918, objArr6);
                    c0104pC3.e(appCompatActivity3, ((String) objArr6[0]).intern(), string, null, false);
                    return;
                }
                return;
            }
        }
        G();
    }

    public final void w(boolean z) {
        int i = 2 % 2;
        try {
            this.buttonNext.setEnabled(true);
            int i2 = this.aD;
            if (i2 == 0) {
                this.buttonPrevious.setVisibility(8);
                this.buttonNext.setVisibility(0);
                this.buttonSubmit.setVisibility(8);
            } else if (i2 == this.ai.size() - 1) {
                int i3 = p + 113;
                q = i3 % 128;
                int i4 = i3 % 2;
                this.buttonPrevious.setVisibility(0);
                this.buttonNext.setVisibility(8);
                this.buttonSubmit.setVisibility(0);
            } else {
                this.buttonPrevious.setVisibility(0);
                this.buttonNext.setVisibility(0);
                this.buttonSubmit.setVisibility(8);
            }
            String strG = ac.g(this.ai.get(this.aD));
            if (z) {
                int i5 = p;
                int i6 = i5 + 93;
                q = i6 % 128;
                int i7 = i6 % 2;
                this.aj = null;
                int i8 = i5 + 17;
                q = i8 % 128;
                int i9 = i8 % 2;
            } else {
                this.aj = getFragmentManager().findFragmentByTag(strG);
            }
            if (this.aj == null || !this.ak.contains(strG)) {
                StringBuilder sb = new StringBuilder();
                sb.append(getPackageName());
                Object[] objArr = new Object[1];
                a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 3, true, TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0') + 20, super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(3) + 151, new char[]{65484, 18, '\f', 3, 11, 5, 65535, 16, 65508, 65484, 17, 18, '\f', 3, 11, 5, 65535, 16, 4}, objArr);
                sb.append(((String) objArr[0]).intern());
                String str = this.ai.get(this.aD);
                Object[] objArr2 = new Object[1];
                a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) - 33, true, View.MeasureSpec.getSize(0) + 5, 239 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), new char[]{24, 65497, 20, 22, 65510}, objArr2);
                sb.append(str.replaceAll(((String) objArr2[0]).intern(), BuildConfig.FLAVOR));
                this.aj = (Fragment) Class.forName(sb.toString()).getConstructor(new Class[0]).newInstance(new Object[0]);
                this.ak.add(strG);
            }
            this.aj.setRetainInstance(true);
            FragmentTransaction fragmentTransactionBeginTransaction = getFragmentManager().beginTransaction();
            fragmentTransactionBeginTransaction.replace(R.id.framelayout_maincontent, this.aj, strG);
            fragmentTransactionBeginTransaction.addToBackStack(strG);
            fragmentTransactionBeginTransaction.commit();
        } catch (Exception unused) {
        }
    }

    public final void y() {
        int i = 2 % 2;
        ag.d = false;
        ag.e = false;
        ag.g = false;
        ag.i = BuildConfig.FLAVOR;
        ag.j = 0;
        ag.k = 0;
        ag.c = false;
        ag.l = false;
        ag.m = false;
        ag.n = 0;
        ag.p = false;
        ag.f71o = true;
        ag.q = 1;
        ag.r = false;
        ag.h = BuildConfig.FLAVOR;
        ag.t = BuildConfig.FLAVOR;
        ag.s = BuildConfig.FLAVOR;
        ag.u = BuildConfig.FLAVOR;
        ag.v = 0;
        if (this.at.l().intValue() != 2 && this.at.l().intValue() != 3) {
            startActivity(new Intent(this, (Class<?>) TokenActivity.class));
            int i2 = p + 125;
            q = i2 % 128;
            int i3 = i2 % 2;
        } else if (BISPApplication.c().g) {
            startActivity(new Intent(this, (Class<?>) TokenActivity.class));
            int i4 = p + 43;
            q = i4 % 128;
            int i5 = i4 % 2;
        } else {
            startActivity(new Intent(this, (Class<?>) ActivityEnumeratorMain.class));
        }
        finish();
    }

    public class OooO0O0 extends h {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char[] a$s17$64 = null;
        public static final byte[] d;
        private static int e = 1;
        public static final int f;
        private static int g;

        static {
            bx();
            d = new byte[]{2, 22, 77, -26, -6, 24, -18, -48, 72, -11, 1, 21, 0, -6, 14, 8, -72, 40, 21, 1, 21, 0, -10, -16, 18, 16, -7, 14, 1};
            f = 30;
            int i = e + 71;
            g = i % 128;
            int i2 = i % 2;
        }

        public OooO0O0() {
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0033 A[PHI: r0 r1 r4 r9 r10 r11
  0x0033: PHI (r0v6 byte[]) = (r0v1 byte[]), (r0v9 byte[]) binds: [B:8:0x0031, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x0033: PHI (r1v9 byte[]) = (r1v4 byte[]), (r1v13 byte[]) binds: [B:8:0x0031, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x0033: PHI (r4v6 int) = (r4v0 int), (r4v9 int) binds: [B:8:0x0031, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x0033: PHI (r9v9 int) = (r9v2 int), (r9v13 int) binds: [B:8:0x0031, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x0033: PHI (r10v7 int) = (r10v2 int), (r10v11 int) binds: [B:8:0x0031, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x0033: PHI (r11v8 int) = (r11v1 int), (r11v12 int) binds: [B:8:0x0031, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
        private static void b(short s, int i, short s2, Object[] objArr) {
            int i2;
            int i3;
            byte[] bArr;
            int i4;
            byte[] bArr2;
            int i5;
            int i6 = 2 % 2;
            int i7 = e + 95;
            g = i7 % 128;
            if (i7 % 2 != 0) {
                i2 = (5 << i) + 38;
                i3 = 5 << (2 << s);
                bArr = d;
                i4 = s2 + 20;
                bArr2 = new byte[i3];
                i5 = 1;
                if (bArr == null) {
                    int i8 = i5;
                    byte[] bArr3 = bArr2;
                    byte[] bArr4 = bArr;
                    int i9 = i4;
                    int i10 = i2;
                    int i11 = i3;
                    int i12 = (i10 + i3) - 3;
                    i4 = i9;
                    bArr = bArr4;
                    bArr2 = bArr3;
                    i5 = i8;
                    i2 = i12;
                    i3 = i11;
                }
            } else {
                i2 = (i * 2) + 106;
                i3 = 26 - (s * 4);
                bArr = d;
                i4 = s2 + 4;
                bArr2 = new byte[i3];
                i5 = 0;
                if (bArr == null) {
                    int i13 = i5;
                    byte[] bArr5 = bArr2;
                    byte[] bArr6 = bArr;
                    int i14 = i4;
                    int i15 = i2;
                    int i16 = i3;
                    int i17 = (i15 + i3) - 3;
                    i4 = i14;
                    bArr = bArr6;
                    bArr2 = bArr5;
                    i5 = i13;
                    i2 = i17;
                    i3 = i16;
                }
            }
            while (true) {
                int i18 = i5 + 1;
                bArr2[i5] = (byte) i2;
                if (i18 == i3) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                int i19 = i4 + 1;
                int i20 = bArr[i19];
                int i21 = g + 19;
                e = i21 % 128;
                int i22 = i21 % 2;
                int i23 = i2;
                int i24 = i3;
                int i25 = (i23 + i20) - 3;
                i4 = i19;
                bArr = bArr;
                bArr2 = bArr2;
                i5 = i18;
                i2 = i25;
                i3 = i24;
            }
        }

        static void bx() {
            a$s17$64 = new char[]{48843, 48707, 49074, 49073, 49068, 49072, 49082, 49079, 49067, 49070, 49071, 49078, 49077, 49068, 49068, 49058, 49058, 49074, 48722};
        }

        @Override // ivas.gov.bisp.enumeration.p096p.h
        public void aI(ivas.gov.bisp.enumeration.bF.c cVar) {
            int i = 2 % 2;
            int i2 = e + 79;
            g = i2 % 128;
            int i3 = i2 % 2;
        }

        @Override // ivas.gov.bisp.enumeration.p096p.h
        public void aJ(boolean z, String str) throws Throwable {
            int i = 2 % 2;
            if (!z) {
                C0104p.c().e(ActivityBeginSurvey.this.ae, "Oops!", "An error has been occurred.", null, false);
                return;
            }
            ActivityBeginSurvey activityBeginSurvey = ActivityBeginSurvey.this;
            int i2 = activityBeginSurvey.ac;
            if (i2 == 1 || i2 == 2) {
                int i3 = ActivityBeginSurvey.af;
                Objects.requireNonNull(activityBeginSurvey);
                int i4 = ah.c.d.getInt("selfie_counter", 0) + 1;
                if (i4 == 20) {
                    ah ahVar = ah.c;
                    ahVar.e.putInt("selfie_counter", 0);
                    ahVar.e.commit();
                    ah ahVar2 = ah.c;
                    int i5 = g + 15;
                    e = i5 % 128;
                    int i6 = i5 % 2;
                    try {
                        byte[] bArr = d;
                        byte b = bArr[12];
                        Object[] objArr = new Object[1];
                        b(b, b, (byte) (-bArr[10]), objArr);
                        ahVar2.e.putInt("selfie_random_no", ((SecureRandom) Class.forName((String) objArr[0]).getDeclaredConstructor(null).newInstance(null)).nextInt(20));
                        ahVar2.e.commit();
                        int i7 = e + 39;
                        g = i7 % 128;
                        if (i7 % 2 != 0) {
                            int i8 = 3 / 4;
                        }
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    ah ahVar3 = ah.c;
                    ahVar3.e.putInt("selfie_counter", i4);
                    ahVar3.e.commit();
                    int i9 = g + 93;
                    e = i9 % 128;
                    int i10 = i9 % 2;
                }
            }
            if (ActivityBeginSurvey.this.at.l().intValue() == 2 || ActivityBeginSurvey.this.at.l().intValue() == 3) {
                if (BISPApplication.c().g) {
                    ActivityBeginSurvey.this.startActivity(new Intent(ActivityBeginSurvey.this, (Class<?>) ActivityEnumeratorMain.class));
                    return;
                } else {
                    ActivityBeginSurvey.this.startActivity(new Intent(ActivityBeginSurvey.this, (Class<?>) ActivityEnumeratorMain.class));
                    return;
                }
            }
            ActivityBeginSurvey activityBeginSurvey2 = ActivityBeginSurvey.this;
            Objects.requireNonNull(activityBeginSurvey2);
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject.put("CenterCode", activityBeginSurvey2.at.e());
                jSONObject.put("Cnic", activityBeginSurvey2.at.c.getString("token_cnic", BuildConfig.FLAVOR));
                jSONObject2.put("string1", b.d(jSONObject.toString(), b.b(activityBeginSurvey2.at.k()), b.b(activityBeginSurvey2.at.m())));
                byte[] bArrB = b.b(activityBeginSurvey2.at.k());
                byte[] bArrB2 = b.b(activityBeginSurvey2.at.m());
                Object[] objArr2 = new Object[1];
                a(false, new byte[]{1, 1, 1, 1, 1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 0, 1, 0}, new int[]{0, 19, 168, 0}, objArr2);
                jSONObject2.put("string2", b.d(((String) objArr2[0]).intern(), bArrB, bArrB2));
                ax.h(activityBeginSurvey2.ag, "Fetching Tokens!");
                ax.e(jSONObject2, activityBeginSurvey2, "https://meladeskapp.bisp.gov.pk/api/Users/UbZJVzTu9rHlQm0D", new C0215v(activityBeginSurvey2, str));
            } catch (JSONException unused) {
            }
        }

        private static void a(boolean z, byte[] bArr, int[] iArr, Object[] objArr) {
            int i;
            int i2 = 2 % 2;
            i iVar = new i();
            int i3 = iArr[0];
            int i4 = iArr[1];
            int i5 = iArr[2];
            int i6 = iArr[3];
            char[] cArr = a$s17$64;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                for (int i7 = 0; i7 < length; i7++) {
                    cArr2[i7] = (char) (((long) cArr[i7]) ^ 2843778254771240638L);
                }
                cArr = cArr2;
            }
            char[] cArr3 = new char[i4];
            System.arraycopy(cArr, i3, cArr3, 0, i4);
            if (bArr != null) {
                char[] cArr4 = new char[i4];
                iVar.b = 0;
                char c = 0;
                while (iVar.b < i4) {
                    if (bArr[iVar.b] == 1) {
                        int i8 = $10 + 71;
                        $11 = i8 % 128;
                        int i9 = i8 % 2;
                        cArr4[iVar.b] = (char) (((cArr3[iVar.b] * 2) + 1) - c);
                    } else {
                        cArr4[iVar.b] = (char) ((cArr3[iVar.b] * 2) - c);
                    }
                    c = cArr4[iVar.b];
                    iVar.b++;
                }
                cArr3 = cArr4;
            }
            if (i6 > 0) {
                int i10 = $10 + 113;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                char[] cArr5 = new char[i4];
                System.arraycopy(cArr3, 0, cArr5, 0, i4);
                int i12 = i4 - i6;
                System.arraycopy(cArr5, 0, cArr3, i12, i6);
                System.arraycopy(cArr5, i6, cArr3, 0, i12);
            }
            if (z) {
                char[] cArr6 = new char[i4];
                iVar.b = 0;
                while (iVar.b < i4) {
                    int i13 = $10 + 111;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
                    cArr6[iVar.b] = cArr3[(i4 - iVar.b) - 1];
                    iVar.b++;
                }
                cArr3 = cArr6;
            }
            if (i5 > 0) {
                int i15 = $10 + 93;
                $11 = i15 % 128;
                if (i15 % 2 == 0) {
                    iVar.b = 1;
                } else {
                    iVar.b = 0;
                }
                while (iVar.b < i4) {
                    int i16 = $11 + 91;
                    $10 = i16 % 128;
                    if (i16 % 2 != 0) {
                        cArr3[iVar.b] = (char) (cArr3[iVar.b] + iArr[4]);
                        i = iVar.b << 1;
                    } else {
                        cArr3[iVar.b] = (char) (cArr3[iVar.b] - iArr[2]);
                        i = iVar.b + 1;
                    }
                    iVar.b = i;
                }
            }
            String str = new String(cArr3);
            int i17 = $11 + 85;
            $10 = i17 % 128;
            if (i17 % 2 != 0) {
                throw null;
            }
            objArr[0] = str;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:15:0x0207  */
    /* JADX WARN: Code duplicated, block: B:16:0x0283  */
    public final void D() {
        int i = 2 % 2;
        ArrayList<String> arrayList = new ArrayList<>();
        this.ai = arrayList;
        final int i2 = 1;
        final int i3 = 0;
        if (this.ac == 2) {
            int i4 = q + 15;
            p = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            a(getApplicationInfo().targetSdkVersion - 22, true, super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) - 40, getApplicationInfo().targetSdkVersion + 231, new char[]{7, 18, 27, 65526, 65474, 15, 20, 17, 65512}, objArr);
            arrayList.add(((String) objArr[0]).intern());
        }
        ArrayList<String> arrayList2 = this.ai;
        Object[] objArr2 = new Object[1];
        a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 9, true, 14 - TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0), getApplicationInfo().targetSdkVersion + 232, new char[]{'\n', 2, 21, 6, 65509, 65473, 21, 4, 2, 21, 15, 16, 65508, '\r'}, objArr2);
        arrayList2.add(((String) objArr2[0]).intern());
        if (this.ac == 2) {
            ArrayList<String> arrayList3 = this.ai;
            Object[] objArr3 = new Object[1];
            a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) - 31, true, getPackageName().codePointAt(10) - 92, getApplicationInfo().targetSdkVersion + 235, new char[]{65470, 14, 17, 7, 65504, 2, 3, 23, 3, 20, 16, 19, 65521}, objArr3);
            arrayList3.add(((String) objArr3[0]).intern());
        }
        ArrayList<String> arrayList4 = this.ai;
        Object[] objArr4 = new Object[1];
        a(Color.argb(0, 0, 0, 0) + 6, true, getPackageName().length() - 19, getApplicationInfo().targetSdkVersion + 243, new char[]{'\b', 65531, '\n', '\t', 5, 65512}, objArr4);
        arrayList4.add(((String) objArr4[0]).intern());
        ArrayList<String> arrayList5 = this.ai;
        Object[] objArr5 = new Object[1];
        b((byte) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 4), getApplicationInfo().targetSdkVersion + 515722146, (short) Gravity.getAbsoluteGravity(0, 0), (-6867) - View.combineMeasuredStates(0, 0), super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) - 1368234022, objArr5);
        arrayList5.add(((String) objArr5[0]).intern());
        if (this.at.l().intValue() != 2) {
            int i6 = q + 93;
            p = i6 % 128;
            int i7 = i6 % 2;
            if (this.at.l().intValue() != 3) {
                int i8 = q + 51;
                p = i8 % 128;
                int i9 = i8 % 2;
                ArrayList<String> arrayList6 = this.ai;
                Object[] objArr6 = new Object[1];
                b((byte) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 4), getApplicationInfo().targetSdkVersion + 515722146, (short) (TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0) + 1), getPackageName().length() - 6892, getApplicationInfo().targetSdkVersion - 1368233994, objArr6);
                arrayList6.add(((String) objArr6[0]).intern());
                int i10 = p + 39;
                q = i10 % 128;
                int i11 = i10 % 2;
            } else if (BISPApplication.c().g) {
                ArrayList<String> arrayList7 = this.ai;
                Object[] objArr7 = new Object[1];
                b((byte) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 4), super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) + 515722128, (short) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) - 49), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 6868, getApplicationInfo().targetSdkVersion - 1368233994, objArr7);
                arrayList7.add(((String) objArr7[0]).intern());
            } else {
                int i12 = p + 21;
                q = i12 % 128;
                int i13 = i12 % 2;
                ArrayList<String> arrayList8 = this.ai;
                Object[] objArr8 = new Object[1];
                b((byte) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) - 49), super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(0) + 515722137, (short) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 4), getApplicationInfo().targetSdkVersion - 6898, super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(3) - 1368234066, objArr8);
                arrayList8.add(((String) objArr8[0]).intern());
            }
        } else if (BISPApplication.c().g) {
            int i14 = p + 21;
            q = i14 % 128;
            int i15 = i14 % 2;
            ArrayList<String> arrayList9 = this.ai;
            Object[] objArr9 = new Object[1];
            b((byte) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) - 49), super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(0) + 515722137, (short) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 4), getApplicationInfo().targetSdkVersion - 6898, super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(3) - 1368234066, objArr9);
            arrayList9.add(((String) objArr9[0]).intern());
        } else {
            ArrayList<String> arrayList10 = this.ai;
            Object[] objArr10 = new Object[1];
            b((byte) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 4), super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) + 515722128, (short) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) - 49), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 6868, getApplicationInfo().targetSdkVersion - 1368233994, objArr10);
            arrayList10.add(((String) objArr10[0]).intern());
        }
        ArrayList<String> arrayList11 = this.ai;
        Object[] objArr11 = new Object[1];
        b((byte) (getPackageName().codePointAt(11) - 115), getApplicationInfo().targetSdkVersion + 515722148, (short) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) - 49), getPackageName().codePointAt(4) - 6913, super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) - 1368233981, objArr11);
        arrayList11.add(((String) objArr11[0]).intern());
        ArrayList<String> arrayList12 = this.ai;
        Object[] objArr12 = new Object[1];
        a(getPackageName().length() - 11, true, super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 10, super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 261, new char[]{14, 5, '\r', 65512, 65471, 3, 11, 14, 7, 4, 18, 20, 14, 65511}, objArr12);
        arrayList12.add(((String) objArr12[0]).intern());
        ArrayList<String> arrayList13 = this.ai;
        Object[] objArr13 = new Object[1];
        a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) - 25, true, super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 9, 272 - (Process.myTid() >> 22), new char[]{7, 65533, 6, 65529, 4, 4, 65533, 65531, 11, 1, 65509, 11, '\r'}, objArr13);
        arrayList13.add(((String) objArr13[0]).intern());
        if (this.ac != 2) {
            ArrayList<String> arrayList14 = this.ai;
            Object[] objArr14 = new Object[1];
            a(getApplicationInfo().targetSdkVersion - 29, true, getPackageName().codePointAt(13) - 35, 272 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), new char[]{65534, 65496, 65532, '\t', '\f', 11, 3, '\f', 65530, 0, '\t'}, objArr14);
            arrayList14.add(((String) objArr14[0]).intern());
        }
        ArrayList<String> arrayList15 = this.ai;
        Object[] objArr15 = new Object[1];
        b((byte) (getApplicationInfo().targetSdkVersion - 31), getApplicationInfo().targetSdkVersion + 515722137, (short) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(3) - 115), (-6867) - (ViewConfiguration.getTouchSlop() >> 8), super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 1368233932, objArr15);
        arrayList15.add(((String) objArr15[0]).intern());
        ArrayList<String> arrayList16 = this.ai;
        Object[] objArr16 = new Object[1];
        a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length(), true, getApplicationInfo().targetSdkVersion - 23, 273 - Drawable.resolveOpacity(0, 0), new char[]{11, 65530, 0, 65511, '\n', 65532, '\t', '\f'}, objArr16);
        arrayList16.add(((String) objArr16[0]).intern());
        int i16 = this.ac;
        if (i16 == 1 || i16 == 2 || ag.d) {
            NewLocationForm newLocationForm = this.aA;
            if (newLocationForm != null) {
                int i17 = p + 93;
                q = i17 % 128;
                int i18 = i17 % 2;
                if (newLocationForm.getDeskBasedSurvey() == 0 && this.ac != 2) {
                    int i19 = p + 39;
                    q = i19 % 128;
                    int i20 = i19 % 2;
                    ArrayList<String> arrayList17 = this.ai;
                    Object[] objArr17 = new Object[1];
                    a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) - 34, true, 11 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), getPackageName().codePointAt(1) + 155, new char[]{65534, 65496, 65532, '\t', '\f', 11, 3, '\f', 65530, 0, '\t'}, objArr17);
                    arrayList17.remove(((String) objArr17[0]).intern());
                }
            }
        } else {
            ArrayList<String> arrayList18 = this.ai;
            Object[] objArr18 = new Object[1];
            a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) - 23, true, 14 - (ViewConfiguration.getFadingEdgeLength() >> 16), getApplicationInfo().targetSdkVersion + 232, new char[]{'\n', 2, 21, 6, 65509, 65473, 21, 4, 2, 21, 15, 16, 65508, '\r'}, objArr18);
            arrayList18.remove(((String) objArr18[0]).intern());
            ArrayList<String> arrayList19 = this.ai;
            Object[] objArr19 = new Object[1];
            b((byte) (getPackageName().codePointAt(19) - 114), 498944961 - Color.rgb(0, 0, 0), (short) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) - 49), super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 6871, getApplicationInfo().targetSdkVersion - 1368234004, objArr19);
            arrayList19.remove(((String) objArr19[0]).intern());
            if (this.at.l().intValue() != 2 && this.at.l().intValue() != 3) {
                ArrayList<String> arrayList20 = this.ai;
                Object[] objArr20 = new Object[1];
                b((byte) (getPackageName().codePointAt(16) - 117), getPackageName().length() + 515722152, (short) (getApplicationInfo().targetSdkVersion - 31), getPackageName().codePointAt(16) - 6984, getApplicationInfo().targetSdkVersion - 1368233994, objArr20);
                arrayList20.remove(((String) objArr20[0]).intern());
            } else if (BISPApplication.c().g) {
                ArrayList<String> arrayList21 = this.ai;
                Object[] objArr21 = new Object[1];
                b((byte) (getApplicationInfo().targetSdkVersion - 31), 515722176 - ((byte) KeyEvent.getModifierMetaStateMask()), (short) View.MeasureSpec.makeMeasureSpec(0, 0), super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) - 6916, getPackageName().codePointAt(15) - 1368234073, objArr21);
                arrayList21.remove(((String) objArr21[0]).intern());
            } else {
                ArrayList<String> arrayList22 = this.ai;
                Object[] objArr22 = new Object[1];
                b((byte) ExpandableListView.getPackedPositionGroup(0L), super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(0) + 515722137, (short) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) - 36), getPackageName().length() - 6892, (ViewConfiguration.getTouchSlop() >> 8) - 1368233951, objArr22);
                arrayList22.remove(((String) objArr22[0]).intern());
            }
            ArrayList<String> arrayList23 = this.ai;
            Object[] objArr23 = new Object[1];
            b((byte) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) - 36), super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 515722175, (short) (getPackageName().length() - 25), (-6866) - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), getApplicationInfo().targetSdkVersion - 1368233963, objArr23);
            arrayList23.remove(((String) objArr23[0]).intern());
            ArrayList<String> arrayList24 = this.ai;
            Object[] objArr24 = new Object[1];
            a(View.resolveSizeAndState(0, 0, 0) + 11, true, 13 - KeyEvent.keyCodeFromString(BuildConfig.FLAVOR), super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(0) + 235, new char[]{7, 65533, 6, 65529, 4, 4, 65533, 65531, 11, 1, 65509, 11, '\r'}, objArr24);
            arrayList24.remove(((String) objArr24[0]).intern());
            if (this.ac != 2) {
                int i21 = p + 33;
                q = i21 % 128;
                int i22 = i21 % 2;
                ArrayList<String> arrayList25 = this.ai;
                Object[] objArr25 = new Object[1];
                a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) - 34, true, getApplicationInfo().targetSdkVersion - 20, 273 - (KeyEvent.getMaxKeyCode() >> 16), new char[]{65534, 65496, 65532, '\t', '\f', 11, 3, '\f', 65530, 0, '\t'}, objArr25);
                arrayList25.remove(((String) objArr25[0]).intern());
            }
            ArrayList<String> arrayList26 = this.ai;
            Object[] objArr26 = new Object[1];
            b((byte) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 515722167 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0), (short) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 4), super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 6871, TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0) - 1368233927, objArr26);
            arrayList26.remove(((String) objArr26[0]).intern());
            ArrayList<String> arrayList27 = this.ai;
            Object[] objArr27 = new Object[1];
            a(getPackageName().codePointAt(2) - 93, true, TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0) + 9, getApplicationInfo().targetSdkVersion + 242, new char[]{11, 65530, 0, 65511, '\n', 65532, '\t', '\f'}, objArr27);
            arrayList27.remove(((String) objArr27[0]).intern());
        }
        this.ak = new ArrayList<>();
        Iterator<String> it = this.ai.iterator();
        while (it.hasNext()) {
            int i23 = q + 103;
            p = i23 % 128;
            if (i23 % 2 == 0) {
                Fragment fragmentFindFragmentByTag = getFragmentManager().findFragmentByTag(ac.g(it.next()));
                this.aj = fragmentFindFragmentByTag;
                int i24 = 74 / 0;
                if (fragmentFindFragmentByTag != null) {
                    getFragmentManager().beginTransaction().remove(this.aj).commit();
                }
            } else {
                Fragment fragmentFindFragmentByTag2 = getFragmentManager().findFragmentByTag(ac.g(it.next()));
                this.aj = fragmentFindFragmentByTag2;
                if (fragmentFindFragmentByTag2 != null) {
                    getFragmentManager().beginTransaction().remove(this.aj).commit();
                }
            }
        }
        this.aD = 0;
        B(true, -1, this.ah);
        this.buttonPrevious.setOnClickListener(new View.OnClickListener(this) { // from class: ivas.gov.bisp.enumeration.bp.Q
            private static int a = 1;
            private static int b;
            public final /* synthetic */ ActivityBeginSurvey d;

            {
                this.d = this;
            }

            /* JADX WARN: Code duplicated, block: B:36:0x00fc  */
            /* JADX WARN: Code duplicated, block: B:38:0x011b  */
            /* JADX WARN: Code duplicated, block: B:39:0x011f  */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Survey survey;
                String strJ;
                int i25;
                int i26 = 2 % 2;
                int i27 = b;
                int i28 = i27 & 65;
                final int i29 = 1;
                int i30 = ((((i27 ^ 65) | i28) << 1) - (~(-((~i28) & (i27 | 65))))) - 1;
                a = i30 % 128;
                Object obj = null;
                if (i30 % 2 == 0) {
                    throw null;
                }
                if (i3 == 0) {
                    ActivityBeginSurvey activityBeginSurvey = this.d;
                    activityBeginSurvey.buttonPrevious.setEnabled(false);
                    int i31 = a;
                    int i32 = (i31 & 29) + (i31 | 29);
                    b = i32 % 128;
                    int i33 = i32 % 2;
                    int i34 = activityBeginSurvey.aD;
                    int i35 = i34 - 1;
                    activityBeginSurvey.aD = i35;
                    int i36 = a;
                    int i37 = (i36 ^ 32) + ((i36 & 32) << 1);
                    int i38 = (i37 ^ (-1)) + (i37 << 1);
                    b = i38 % 128;
                    if (i38 % 2 != 0) {
                        throw null;
                    }
                    if (i35 < 0) {
                        int i39 = (i36 ^ 97) + ((i36 & 97) << 1);
                        b = i39 % 128;
                        int i40 = i39 % 2;
                        activityBeginSurvey.aD = 0;
                        int i41 = a;
                        int i42 = i41 & 41;
                        int i43 = (i41 ^ 41) | i42;
                        int i44 = (i42 ^ i43) + ((i43 & i42) << 1);
                        b = i44 % 128;
                        int i45 = i44 % 2;
                    }
                    activityBeginSurvey.B(false, i34, false);
                    z.d(activityBeginSurvey.ae);
                    int i46 = a;
                    int i47 = i46 & 27;
                    int i48 = (i46 ^ 27) | i47;
                    int i49 = (i47 ^ i48) + ((i48 & i47) << 1);
                    b = i49 % 128;
                    int i50 = i49 % 2;
                    activityBeginSurvey.buttonPrevious.setEnabled(true);
                    int i51 = b;
                    int i52 = i51 & 115;
                    int i53 = (i51 | 115) & (~i52);
                    int i54 = i52 << 1;
                    int i55 = (i53 ^ i54) + ((i53 & i54) << 1);
                    a = i55 % 128;
                    if (i55 % 2 == 0) {
                        throw null;
                    }
                    return;
                }
                int i56 = i27 & 105;
                int i57 = ((i27 ^ 105) | i56) << 1;
                int i58 = -((i27 | 105) & (~i56));
                int i59 = (i57 & i58) + (i58 | i57);
                int i60 = i59 % 128;
                a = i60;
                int i61 = i59 % 2;
                int i62 = i60 & 103;
                int i63 = (i60 | 103) & (~i62);
                int i64 = -(-(i62 << 1));
                int i65 = (i63 & i64) + (i63 | i64);
                b = i65 % 128;
                int i66 = i65 % 2;
                final ActivityBeginSurvey activityBeginSurvey2 = this.d;
                int i67 = ActivityBeginSurvey.af;
                Objects.requireNonNull(activityBeginSurvey2);
                if (i66 != 0) {
                    int i68 = 49 / 0;
                }
                long jElapsedRealtime = SystemClock.elapsedRealtime() - activityBeginSurvey2.aC;
                int i69 = a;
                int i70 = (i69 ^ 89) + ((i69 & 89) << 1);
                b = i70 % 128;
                if (i70 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                if (jElapsedRealtime >= 1500) {
                    activityBeginSurvey2.aC = SystemClock.elapsedRealtime();
                    activityBeginSurvey2.buttonSubmit.setEnabled(false);
                    int i71 = a;
                    int i72 = i71 | 111;
                    int i73 = ((i72 << 1) - (~(-((~(i71 & 111)) & i72)))) - 1;
                    b = i73 % 128;
                    int i74 = i73 % 2;
                    int i75 = ag.n;
                    if (i75 != 2) {
                        int i76 = b;
                        int i77 = i76 & 99;
                        int i78 = ((i76 ^ 99) | i77) << 1;
                        int i79 = -((i76 | 99) & (~i77));
                        int i80 = (i78 & i79) + (i79 | i78);
                        int i81 = i80 % 128;
                        a = i81;
                        if (i80 % 2 != 0 ? i75 != 1 : i75 != 0) {
                            if (i75 != 4) {
                                int i82 = i81 & 9;
                                int i83 = (((i81 ^ 9) | i82) << 1) - ((~i82) & (i81 | 9));
                                b = i83 % 128;
                                if (i83 % 2 == 0 ? i75 != 5 : i75 != 5) {
                                    int i84 = (i81 & 10) + (i81 | 10);
                                    int i85 = (i84 ^ (-1)) + (i84 << 1);
                                    b = i85 % 128;
                                    int i86 = i85 % 2;
                                    if (i75 != 6) {
                                        int i87 = i81 + 45;
                                        b = i87 % 128;
                                        if (i87 % 2 != 0) {
                                            int i88 = 92 / 0;
                                            if (!activityBeginSurvey2.aG.form_no.isEmpty()) {
                                                survey = activityBeginSurvey2.aG;
                                                strJ = activityBeginSurvey2.at.j();
                                                int i89 = a;
                                                int i90 = i89 & 11;
                                                int i91 = (i89 | 11) & (~i90);
                                                int i92 = -(-(i90 << 1));
                                                i25 = ((i91 | i92) << 1) - (i91 ^ i92);
                                                b = i25 % 128;
                                                if (i25 % 2 != 0) {
                                                    survey.form_no = strJ;
                                                    int i93 = 99 / 0;
                                                } else {
                                                    survey.form_no = strJ;
                                                }
                                            }
                                        } else if (!activityBeginSurvey2.aG.form_no.isEmpty()) {
                                            survey = activityBeginSurvey2.aG;
                                            strJ = activityBeginSurvey2.at.j();
                                            int i810 = a;
                                            int i94 = i810 & 11;
                                            int i95 = (i810 | 11) & (~i94);
                                            int i96 = -(-(i94 << 1));
                                            i25 = ((i95 | i96) << 1) - (i95 ^ i96);
                                            b = i25 % 128;
                                            if (i25 % 2 != 0) {
                                                survey.form_no = strJ;
                                                int i97 = 99 / 0;
                                            } else {
                                                survey.form_no = strJ;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    activityBeginSurvey2.E();
                    z.d(activityBeginSurvey2.ae);
                    activityBeginSurvey2.buttonSubmit.postDelayed(new Runnable() { // from class: ivas.gov.bisp.enumeration.am.u
                        private static int a = 0;
                        private static int b = 1;

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i98 = 2 % 2;
                            int i99 = a;
                            int i100 = (i99 | 35) << 1;
                            int i101 = -(((~i99) & 35) | (i99 & (-36)));
                            int i102 = ((i100 | i101) << 1) - (i101 ^ i100);
                            int i103 = i102 % 128;
                            b = i103;
                            int i104 = i102 % 2;
                            if (i29 == 0) {
                                ((d.aKf) activityBeginSurvey2).d();
                                int i105 = b;
                                int i106 = (i105 ^ 91) + ((i105 & 91) << 1);
                                a = i106 % 128;
                                if (i106 % 2 != 0) {
                                    throw null;
                                }
                                return;
                            }
                            int i107 = i103 + 59;
                            a = i107 % 128;
                            int i108 = i107 % 2;
                            int i109 = ((i103 & 100) + (i103 | 100)) - 1;
                            a = i109 % 128;
                            int i110 = i109 % 2;
                            Button button = ((ActivityBeginSurvey) activityBeginSurvey2).buttonSubmit;
                            if (button != null) {
                                int i111 = a;
                                int i112 = i111 & 3;
                                int i113 = (((i111 | 3) & (~i112)) - (~(i112 << 1))) - 1;
                                b = i113 % 128;
                                int i114 = i113 % 2;
                                button.setEnabled(true);
                                int i115 = a;
                                int i116 = ((i115 | 59) << 1) - (i115 ^ 59);
                                b = i116 % 128;
                                int i117 = i116 % 2;
                            }
                            int i118 = a + 101;
                            b = i118 % 128;
                            int i119 = i118 % 2;
                        }
                    }, 2000L);
                    int i98 = b;
                    int i99 = (i98 & (-48)) | ((~i98) & 47);
                    int i100 = (i98 & 47) << 1;
                    int i101 = ((i99 | i100) << 1) - (i99 ^ i100);
                    a = i101 % 128;
                    int i102 = i101 % 2;
                    int i103 = i98 + 47;
                    a = i103 % 128;
                    int i104 = i103 % 2;
                }
                int i105 = a;
                int i106 = i105 ^ 49;
                int i107 = ((((i105 & 49) | i106) << 1) - (~(-i106))) - 1;
                b = i107 % 128;
                int i108 = i107 % 2;
            }
        });
        this.buttonNext.setOnClickListener(new T(this, i3));
        this.buttonSubmit.setOnClickListener(new View.OnClickListener(this) { // from class: ivas.gov.bisp.enumeration.bp.Q
            private static int a = 1;
            private static int b;
            public final /* synthetic */ ActivityBeginSurvey d;

            {
                this.d = this;
            }

            /* JADX WARN: Code duplicated, block: B:36:0x00fc  */
            /* JADX WARN: Code duplicated, block: B:38:0x011b  */
            /* JADX WARN: Code duplicated, block: B:39:0x011f  */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Survey survey;
                String strJ;
                int i25;
                int i26 = 2 % 2;
                int i27 = b;
                int i28 = i27 & 65;
                final int i29 = 1;
                int i30 = ((((i27 ^ 65) | i28) << 1) - (~(-((~i28) & (i27 | 65))))) - 1;
                a = i30 % 128;
                Object obj = null;
                if (i30 % 2 == 0) {
                    throw null;
                }
                if (i2 == 0) {
                    ActivityBeginSurvey activityBeginSurvey = this.d;
                    activityBeginSurvey.buttonPrevious.setEnabled(false);
                    int i31 = a;
                    int i32 = (i31 & 29) + (i31 | 29);
                    b = i32 % 128;
                    int i33 = i32 % 2;
                    int i34 = activityBeginSurvey.aD;
                    int i35 = i34 - 1;
                    activityBeginSurvey.aD = i35;
                    int i36 = a;
                    int i37 = (i36 ^ 32) + ((i36 & 32) << 1);
                    int i38 = (i37 ^ (-1)) + (i37 << 1);
                    b = i38 % 128;
                    if (i38 % 2 != 0) {
                        throw null;
                    }
                    if (i35 < 0) {
                        int i39 = (i36 ^ 97) + ((i36 & 97) << 1);
                        b = i39 % 128;
                        int i40 = i39 % 2;
                        activityBeginSurvey.aD = 0;
                        int i41 = a;
                        int i42 = i41 & 41;
                        int i43 = (i41 ^ 41) | i42;
                        int i44 = (i42 ^ i43) + ((i43 & i42) << 1);
                        b = i44 % 128;
                        int i45 = i44 % 2;
                    }
                    activityBeginSurvey.B(false, i34, false);
                    z.d(activityBeginSurvey.ae);
                    int i46 = a;
                    int i47 = i46 & 27;
                    int i48 = (i46 ^ 27) | i47;
                    int i49 = (i47 ^ i48) + ((i48 & i47) << 1);
                    b = i49 % 128;
                    int i50 = i49 % 2;
                    activityBeginSurvey.buttonPrevious.setEnabled(true);
                    int i51 = b;
                    int i52 = i51 & 115;
                    int i53 = (i51 | 115) & (~i52);
                    int i54 = i52 << 1;
                    int i55 = (i53 ^ i54) + ((i53 & i54) << 1);
                    a = i55 % 128;
                    if (i55 % 2 == 0) {
                        throw null;
                    }
                    return;
                }
                int i56 = i27 & 105;
                int i57 = ((i27 ^ 105) | i56) << 1;
                int i58 = -((i27 | 105) & (~i56));
                int i59 = (i57 & i58) + (i58 | i57);
                int i60 = i59 % 128;
                a = i60;
                int i61 = i59 % 2;
                int i62 = i60 & 103;
                int i63 = (i60 | 103) & (~i62);
                int i64 = -(-(i62 << 1));
                int i65 = (i63 & i64) + (i63 | i64);
                b = i65 % 128;
                int i66 = i65 % 2;
                final Object activityBeginSurvey2 = this.d;
                int i67 = ActivityBeginSurvey.af;
                Objects.requireNonNull(activityBeginSurvey2);
                if (i66 != 0) {
                    int i68 = 49 / 0;
                }
                long jElapsedRealtime = SystemClock.elapsedRealtime() - activityBeginSurvey2.aC;
                int i69 = a;
                int i70 = (i69 ^ 89) + ((i69 & 89) << 1);
                b = i70 % 128;
                if (i70 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                if (jElapsedRealtime >= 1500) {
                    activityBeginSurvey2.aC = SystemClock.elapsedRealtime();
                    activityBeginSurvey2.buttonSubmit.setEnabled(false);
                    int i71 = a;
                    int i72 = i71 | 111;
                    int i73 = ((i72 << 1) - (~(-((~(i71 & 111)) & i72)))) - 1;
                    b = i73 % 128;
                    int i74 = i73 % 2;
                    int i75 = ag.n;
                    if (i75 != 2) {
                        int i76 = b;
                        int i77 = i76 & 99;
                        int i78 = ((i76 ^ 99) | i77) << 1;
                        int i79 = -((i76 | 99) & (~i77));
                        int i80 = (i78 & i79) + (i79 | i78);
                        int i81 = i80 % 128;
                        a = i81;
                        if (i80 % 2 != 0 ? i75 != 1 : i75 != 0) {
                            if (i75 != 4) {
                                int i82 = i81 & 9;
                                int i83 = (((i81 ^ 9) | i82) << 1) - ((~i82) & (i81 | 9));
                                b = i83 % 128;
                                if (i83 % 2 == 0 ? i75 != 5 : i75 != 5) {
                                    int i84 = (i81 & 10) + (i81 | 10);
                                    int i85 = (i84 ^ (-1)) + (i84 << 1);
                                    b = i85 % 128;
                                    int i86 = i85 % 2;
                                    if (i75 != 6) {
                                        int i87 = i81 + 45;
                                        b = i87 % 128;
                                        if (i87 % 2 != 0) {
                                            int i88 = 92 / 0;
                                            if (!activityBeginSurvey2.aG.form_no.isEmpty()) {
                                                survey = activityBeginSurvey2.aG;
                                                strJ = activityBeginSurvey2.at.j();
                                                int i810 = a;
                                                int i94 = i810 & 11;
                                                int i95 = (i810 | 11) & (~i94);
                                                int i96 = -(-(i94 << 1));
                                                i25 = ((i95 | i96) << 1) - (i95 ^ i96);
                                                b = i25 % 128;
                                                if (i25 % 2 != 0) {
                                                    survey.form_no = strJ;
                                                    int i97 = 99 / 0;
                                                } else {
                                                    survey.form_no = strJ;
                                                }
                                            }
                                        } else if (!activityBeginSurvey2.aG.form_no.isEmpty()) {
                                            survey = activityBeginSurvey2.aG;
                                            strJ = activityBeginSurvey2.at.j();
                                            int i811 = a;
                                            int i98 = i811 & 11;
                                            int i99 = (i811 | 11) & (~i98);
                                            int i910 = -(-(i98 << 1));
                                            i25 = ((i99 | i910) << 1) - (i99 ^ i910);
                                            b = i25 % 128;
                                            if (i25 % 2 != 0) {
                                                survey.form_no = strJ;
                                                int i911 = 99 / 0;
                                            } else {
                                                survey.form_no = strJ;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    activityBeginSurvey2.E();
                    z.d(activityBeginSurvey2.ae);
                    activityBeginSurvey2.buttonSubmit.postDelayed(new Runnable() { // from class: ivas.gov.bisp.enumeration.am.u
                        private static int a = 0;
                        private static int b = 1;

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i912 = 2 % 2;
                            int i913 = a;
                            int i100 = (i913 | 35) << 1;
                            int i101 = -(((~i913) & 35) | (i913 & (-36)));
                            int i102 = ((i100 | i101) << 1) - (i101 ^ i100);
                            int i103 = i102 % 128;
                            b = i103;
                            int i104 = i102 % 2;
                            if (i29 == 0) {
                                ((d.aKf) activityBeginSurvey2).d();
                                int i105 = b;
                                int i106 = (i105 ^ 91) + ((i105 & 91) << 1);
                                a = i106 % 128;
                                if (i106 % 2 != 0) {
                                    throw null;
                                }
                                return;
                            }
                            int i107 = i103 + 59;
                            a = i107 % 128;
                            int i108 = i107 % 2;
                            int i109 = ((i103 & 100) + (i103 | 100)) - 1;
                            a = i109 % 128;
                            int i110 = i109 % 2;
                            Button button = ((ActivityBeginSurvey) activityBeginSurvey2).buttonSubmit;
                            if (button != null) {
                                int i111 = a;
                                int i112 = i111 & 3;
                                int i113 = (((i111 | 3) & (~i112)) - (~(i112 << 1))) - 1;
                                b = i113 % 128;
                                int i114 = i113 % 2;
                                button.setEnabled(true);
                                int i115 = a;
                                int i116 = ((i115 | 59) << 1) - (i115 ^ 59);
                                b = i116 % 128;
                                int i117 = i116 % 2;
                            }
                            int i118 = a + 101;
                            b = i118 % 128;
                            int i119 = i118 % 2;
                        }
                    }, 2000L);
                    int i912 = b;
                    int i913 = (i912 & (-48)) | ((~i912) & 47);
                    int i100 = (i912 & 47) << 1;
                    int i101 = ((i913 | i100) << 1) - (i913 ^ i100);
                    a = i101 % 128;
                    int i102 = i101 % 2;
                    int i103 = i912 + 47;
                    a = i103 % 128;
                    int i104 = i103 % 2;
                }
                int i105 = a;
                int i106 = i105 ^ 49;
                int i107 = ((((i105 & 49) | i106) << 1) - (~(-i106))) - 1;
                b = i107 % 128;
                int i108 = i107 % 2;
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:21:0x024d  */
    /* JADX WARN: Code duplicated, block: B:22:0x02df  */
    /* JADX WARN: Code duplicated, block: B:24:0x0396  */
    /* JADX WARN: Code duplicated, block: B:26:0x039c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0460  */
    /* JADX WARN: Code duplicated, block: B:35:0x0512  */
    /* JADX WARN: Code duplicated, block: B:44:0x053d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0551  */
    /* JADX WARN: Code duplicated, block: B:46:0x05bd  */
    /* JADX WARN: Code duplicated, block: B:49:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:60:0x03a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // ivas.gov.bisp.enumeration.BaseActivity, ivas.gov.bisp.enumeration.activitybase.BaseTouch, ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public void t() {
        NewLocationForm newLocationForm;
        Date date;
        Object[] objArr;
        int i;
        int i2;
        int i3 = 2 % 2;
        super.t();
        this.ag = new ProgressDialog(this);
        TextView textView = (TextView) findViewById(R.id.application_version_textView);
        boolean z = false;
        int i4 = 1;
        Object[] objArr2 = new Object[1];
        a(ImageFormat.getBitsPerPixel(0) + 5, true, super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 7, super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 226, new char[]{65528, 65520, 65529, '8', 65515, 7, 24, 11, 14, 65514, 65506}, objArr2);
        textView.setText(((String) objArr2[0]).intern());
        Map<Class<?>, Constructor<? extends Unbinder>> map = ButterKnife.a;
        ButterKnife.c(this, getWindow().getDecorView());
        SugarContext.init(this);
        this.au = new VerificationQuestionsCount();
        this.aE = new HashMap<>();
        Intent intent = getIntent();
        Object[] objArr3 = new Object[1];
        b((byte) (getApplicationInfo().targetSdkVersion - 31), getApplicationInfo().targetSdkVersion + 515722179, (short) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) - 36), getApplicationInfo().targetSdkVersion - 6898, getPackageName().length() - 1368234186, objArr3);
        this.aG = (Survey) intent.getSerializableExtra(((String) objArr3[0]).intern());
        Intent intent2 = getIntent();
        Object[] objArr4 = new Object[1];
        b((byte) (getPackageName().codePointAt(19) - 114), getApplicationInfo().targetSdkVersion + 515722179, (short) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) - 36), super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 6871, super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 1368234159, objArr4);
        this.ap = (Survey) intent2.getSerializableExtra(((String) objArr4[0]).intern());
        Intent intent3 = getIntent();
        Object[] objArr5 = new Object[1];
        a(9 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), true, getApplicationInfo().targetSdkVersion - 21, getPackageName().codePointAt(6) + 166, new char[]{7, 65524, 5, 65528, 0, '\b', 1, 65528, 5, 2}, objArr5);
        EnumeratorModel enumeratorModel = (EnumeratorModel) intent3.getSerializableExtra(((String) objArr5[0]).intern());
        this.av = enumeratorModel;
        if (enumeratorModel == null) {
            this.av = new EnumeratorModel();
        }
        Survey survey = this.aG;
        if (survey != null) {
            int i5 = p + 41;
            q = i5 % 128;
            int i6 = i5 % 2;
            if (ag.d) {
                this.aB = survey.getLocation();
                Survey survey2 = new Survey();
                this.aG = survey2;
                survey2.form_no = survey.form_no;
                survey2.uuid = survey.uuid;
                survey2.is_gps_exempted = survey.is_gps_exempted;
                survey2.region = survey.region;
                survey2.province_id = survey.province_id;
                survey2.province_name = survey.province_name;
                survey2.district_id = survey.district_id;
                survey2.district_name = survey.district_name;
                survey2.deskBasedSurvey = survey.deskBasedSurvey;
                survey2.tehsil_id = survey.tehsil_id;
                survey2.tabVsGpsTime = survey.tabVsGpsTime;
                survey2.tehsil_name = survey.tehsil_name;
                survey2.uc_id = survey.uc_id;
                survey2.uc_name = survey.uc_name;
                survey2.village_id = survey.village_id;
                survey2.village_name = survey.village_name;
                survey2.po_id = survey.po_id;
                survey2.po_name = survey.po_name;
                survey2.batchName = survey.batchName;
                survey2.villageAccuracy = survey.villageAccuracy;
                survey2.village_map_listing = survey.village_map_listing;
                survey2.village_structure_number = survey.village_structure_number;
                int i7 = p + 103;
                q = i7 % 128;
                int i8 = i7 % 2;
            }
        }
        if (ag.d) {
            this.aG.startTime = z.e();
            this.aG.startTimeGPS = ak.c();
            this.aA = new NewLocationForm(this.aG);
            D();
        } else {
            int i9 = this.ac;
            if (i9 == 0) {
                int i10 = q + 67;
                p = i10 % 128;
                if (i10 % 2 == 0) {
                    NewLocationForm newLocationForm2 = (NewLocationForm) SugarRecord.first(NewLocationForm.class);
                    this.aA = newLocationForm2;
                    int i11 = 67 / 0;
                    if (newLocationForm2 == null) {
                        C0104p c0104pC = C0104p.c();
                        AppCompatActivity appCompatActivity = this.ae;
                        Object[] objArr6 = new Object[1];
                        a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(3) - 106, false, super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(0) - 20, getPackageName().length() + 231, new char[]{17, 28, '!', 65480, 65516, '\t', 28, '\t', 65481, 65526, 23, 65480, 65524, 23, 11, '\t', 20}, objArr6);
                        String strIntern = ((String) objArr6[0]).intern();
                        Object[] objArr7 = new Object[1];
                        a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 21, false, 35 - MotionEvent.axisFromString(BuildConfig.FLAVOR), getApplicationInfo().targetSdkVersion + 231, new char[]{65474, 65518, 17, 5, 3, 14, 11, 22, 27, 65474, '\b', 17, 20, 15, 65474, 22, 17, 65474, 18, 20, 17, 5, 7, 7, 6, 65522, 14, 7, 3, 21, 7, 65474, '\b', 11, 14, 14}, objArr7);
                        c0104pC.e(appCompatActivity, strIntern, ((String) objArr7[0]).intern(), new N(this, i4), false);
                    } else {
                        String strE = z.e();
                        String strC = ak.c();
                        Survey survey3 = this.aG;
                        String str = survey3.form_no;
                        String str2 = survey3.form_no_old;
                        String str3 = survey3.uuid;
                        Object[] objArr8 = new Object[1];
                        a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) - 33, false, super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) - 46, super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(0) + 243, new char[]{'\t', 65525, 3}, objArr8);
                        String strIntern2 = ((String) objArr8[0]).intern();
                        Object[] objArr9 = new Object[1];
                        a(getApplicationInfo().targetSdkVersion - 29, true, getApplicationInfo().targetSdkVersion - 28, TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0) + 219, new char[]{65531, 4, 3}, objArr9);
                        this.ap = new Survey(strE, strC, str, str2, str3, 3, strIntern2, 33, ((String) objArr9[0]).intern(), survey3.village_id, survey3.village_name, survey3.village_map_listing, survey3.village_structure_number);
                        if (this.aA.getIsGpsExempted() != 0) {
                            z = true;
                        } else if (BISPApplication.f()) {
                            C0104p c0104pC2 = C0104p.c();
                            AppCompatActivity appCompatActivity2 = this.ae;
                            String string = getResources().getString(R.string.enable_location);
                            M m = new M(this, 3);
                            Object[] objArr10 = new Object[1];
                            b((byte) (getApplicationInfo().targetSdkVersion - 31), super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 515722169, (short) TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0), Process.getGidForName(BuildConfig.FLAVOR) - 6866, super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(3) - 1368234181, objArr10);
                            c0104pC2.e(appCompatActivity2, ((String) objArr10[0]).intern(), string, m, false);
                        } else {
                            newLocationForm = this.aA;
                            BISPApplication bISPApplication = BISPApplication.c;
                            if (newLocationForm.getTabVsGpsTime() == 1) {
                                try {
                                    Object[] objArr11 = new Object[1];
                                    b((byte) (getApplicationInfo().targetSdkVersion - 31), 515722216 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (short) (getPackageName().codePointAt(8) - 46), (-6867) - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(0) - 1368234175, objArr11);
                                    date = new SimpleDateFormat(((String) objArr11[0]).intern()).parse(null);
                                    objArr = new Object[1];
                                    b((byte) (TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0) + 1), Color.alpha(0) + 515722216, (short) (getApplicationInfo().targetSdkVersion - 31), getApplicationInfo().targetSdkVersion - 6898, getApplicationInfo().targetSdkVersion - 1368234169, objArr);
                                    if (((new SimpleDateFormat(((String) objArr[0]).intern()).parse(z.e()).getTime() - date.getTime()) / 3600000) % 24 <= 1) {
                                        C0104p c0104pC3 = C0104p.c();
                                        AppCompatActivity appCompatActivity3 = this.ae;
                                        Object[] objArr12 = new Object[1];
                                        b((byte) (getPackageName().length() - 25), (KeyEvent.getMaxKeyCode() >> 16) + 515722182, (short) Color.blue(0), getApplicationInfo().targetSdkVersion - 6898, getPackageName().codePointAt(2) - 1368234216, objArr12);
                                        String strIntern3 = ((String) objArr12[0]).intern();
                                        Object[] objArr13 = new Object[1];
                                        b((byte) (ViewConfiguration.getKeyRepeatTimeout() >> 16), super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 515722158, (short) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(0) - 37), super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) - 6903, getApplicationInfo().targetSdkVersion - 1368234143, objArr13);
                                        c0104pC3.e(appCompatActivity3, strIntern3, ((String) objArr13[0]).intern(), new M(this, 1), false);
                                    }
                                } catch (ParseException unused) {
                                }
                            }
                            i = this.ac;
                            if (i != 1) {
                                i2 = p + 111;
                                q = i2 % 128;
                                if (i2 % 2 != 0 ? i == 2 : i == 3) {
                                    this.aG.location = BISPApplication.e();
                                    this.aG.locationAccuracy = BISPApplication.d.getAccuracy();
                                } else if (ag.d) {
                                    this.aG.location = BISPApplication.e();
                                    this.aG.locationAccuracy = BISPApplication.d.getAccuracy();
                                } else {
                                    this.ap.location = BISPApplication.e();
                                    this.ap.locationAccuracy = BISPApplication.d.getAccuracy();
                                }
                            } else {
                                this.aG.location = BISPApplication.e();
                                this.aG.locationAccuracy = BISPApplication.d.getAccuracy();
                            }
                            z = true;
                        }
                        if (!(!z)) {
                            D();
                        }
                    }
                } else {
                    NewLocationForm newLocationForm3 = (NewLocationForm) SugarRecord.first(NewLocationForm.class);
                    this.aA = newLocationForm3;
                    if (newLocationForm3 == null) {
                        C0104p c0104pC4 = C0104p.c();
                        AppCompatActivity appCompatActivity4 = this.ae;
                        Object[] objArr14 = new Object[1];
                        a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(3) - 106, false, super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(0) - 20, getPackageName().length() + 231, new char[]{17, 28, '!', 65480, 65516, '\t', 28, '\t', 65481, 65526, 23, 65480, 65524, 23, 11, '\t', 20}, objArr14);
                        String strIntern4 = ((String) objArr14[0]).intern();
                        Object[] objArr15 = new Object[1];
                        a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 21, false, 35 - MotionEvent.axisFromString(BuildConfig.FLAVOR), getApplicationInfo().targetSdkVersion + 231, new char[]{65474, 65518, 17, 5, 3, 14, 11, 22, 27, 65474, '\b', 17, 20, 15, 65474, 22, 17, 65474, 18, 20, 17, 5, 7, 7, 6, 65522, 14, 7, 3, 21, 7, 65474, '\b', 11, 14, 14}, objArr15);
                        c0104pC4.e(appCompatActivity4, strIntern4, ((String) objArr15[0]).intern(), new N(this, i4), false);
                    } else {
                        String strE2 = z.e();
                        String strC2 = ak.c();
                        Survey survey4 = this.aG;
                        String str4 = survey4.form_no;
                        String str5 = survey4.form_no_old;
                        String str6 = survey4.uuid;
                        Object[] objArr16 = new Object[1];
                        a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) - 33, false, super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) - 46, super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(0) + 243, new char[]{'\t', 65525, 3}, objArr16);
                        String strIntern5 = ((String) objArr16[0]).intern();
                        Object[] objArr17 = new Object[1];
                        a(getApplicationInfo().targetSdkVersion - 29, true, getApplicationInfo().targetSdkVersion - 28, TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0) + 219, new char[]{65531, 4, 3}, objArr17);
                        this.ap = new Survey(strE2, strC2, str4, str5, str6, 3, strIntern5, 33, ((String) objArr17[0]).intern(), survey4.village_id, survey4.village_name, survey4.village_map_listing, survey4.village_structure_number);
                        if (this.aA.getIsGpsExempted() != 0) {
                            z = true;
                        } else if (BISPApplication.f()) {
                            newLocationForm = this.aA;
                            BISPApplication bISPApplication2 = BISPApplication.c;
                            if (newLocationForm.getTabVsGpsTime() == 1) {
                                Object[] objArr18 = new Object[1];
                                b((byte) (getApplicationInfo().targetSdkVersion - 31), 515722216 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (short) (getPackageName().codePointAt(8) - 46), (-6867) - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(0) - 1368234175, objArr18);
                                date = new SimpleDateFormat(((String) objArr18[0]).intern()).parse(null);
                                objArr = new Object[1];
                                b((byte) (TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0) + 1), Color.alpha(0) + 515722216, (short) (getApplicationInfo().targetSdkVersion - 31), getApplicationInfo().targetSdkVersion - 6898, getApplicationInfo().targetSdkVersion - 1368234169, objArr);
                                if (((new SimpleDateFormat(((String) objArr[0]).intern()).parse(z.e()).getTime() - date.getTime()) / 3600000) % 24 <= 1) {
                                    C0104p c0104pC5 = C0104p.c();
                                    AppCompatActivity appCompatActivity5 = this.ae;
                                    Object[] objArr19 = new Object[1];
                                    b((byte) (getPackageName().length() - 25), (KeyEvent.getMaxKeyCode() >> 16) + 515722182, (short) Color.blue(0), getApplicationInfo().targetSdkVersion - 6898, getPackageName().codePointAt(2) - 1368234216, objArr19);
                                    String strIntern6 = ((String) objArr19[0]).intern();
                                    Object[] objArr110 = new Object[1];
                                    b((byte) (ViewConfiguration.getKeyRepeatTimeout() >> 16), super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 515722158, (short) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(0) - 37), super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) - 6903, getApplicationInfo().targetSdkVersion - 1368234143, objArr110);
                                    c0104pC5.e(appCompatActivity5, strIntern6, ((String) objArr110[0]).intern(), new M(this, 1), false);
                                }
                            }
                            i = this.ac;
                            if (i != 1) {
                                i2 = p + 111;
                                q = i2 % 128;
                                if (i2 % 2 != 0) {
                                }
                                this.aG.location = BISPApplication.e();
                                this.aG.locationAccuracy = BISPApplication.d.getAccuracy();
                            } else {
                                this.aG.location = BISPApplication.e();
                                this.aG.locationAccuracy = BISPApplication.d.getAccuracy();
                            }
                            z = true;
                        } else {
                            C0104p c0104pC6 = C0104p.c();
                            AppCompatActivity appCompatActivity6 = this.ae;
                            String string2 = getResources().getString(R.string.enable_location);
                            M m2 = new M(this, 3);
                            Object[] objArr111 = new Object[1];
                            b((byte) (getApplicationInfo().targetSdkVersion - 31), super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 515722169, (short) TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0), Process.getGidForName(BuildConfig.FLAVOR) - 6866, super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(3) - 1368234181, objArr111);
                            c0104pC6.e(appCompatActivity6, ((String) objArr111[0]).intern(), string2, m2, false);
                        }
                        if (!(!z)) {
                            D();
                        }
                    }
                }
            } else if (i9 == 1) {
                new OooO0o().execute(new Void[0]);
            } else {
                NewLocationForm newLocationForm4 = (NewLocationForm) SugarRecord.first(NewLocationForm.class);
                this.aA = newLocationForm4;
                if (newLocationForm4 == null) {
                    C0104p c0104pC7 = C0104p.c();
                    AppCompatActivity appCompatActivity7 = this.ae;
                    Object[] objArr20 = new Object[1];
                    a(getApplicationInfo().targetSdkVersion - 22, false, super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) - 32, getApplicationInfo().targetSdkVersion + 225, new char[]{17, 28, '!', 65480, 65516, '\t', 28, '\t', 65481, 65526, 23, 65480, 65524, 23, 11, '\t', 20}, objArr20);
                    String strIntern7 = ((String) objArr20[0]).intern();
                    Object[] objArr21 = new Object[1];
                    a(getApplicationInfo().targetSdkVersion - 6, false, TextUtils.getTrimmedLength(BuildConfig.FLAVOR) + 36, 262 - View.MeasureSpec.getMode(0), new char[]{65474, 65518, 17, 5, 3, 14, 11, 22, 27, 65474, '\b', 17, 20, 15, 65474, 22, 17, 65474, 18, 20, 17, 5, 7, 7, 6, 65522, 14, 7, 3, 21, 7, 65474, '\b', 11, 14, 14}, objArr21);
                    c0104pC7.e(appCompatActivity7, strIntern7, ((String) objArr21[0]).intern(), new M(this, 0), false);
                } else {
                    this.aG = new Survey(z.e(), ak.c());
                    D();
                }
            }
        }
        this.at = new SessionManager(this);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x010c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0121  */
    /* JADX WARN: Code duplicated, block: B:38:0x0137  */
    /* JADX WARN: Code duplicated, block: B:40:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:42:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:44:0x0209  */
    /* JADX WARN: Code duplicated, block: B:48:0x023e  */
    /* JADX WARN: Code duplicated, block: B:51:0x025b  */
    /* JADX WARN: Code duplicated, block: B:54:0x0278  */
    /* JADX WARN: Code duplicated, block: B:57:0x0295  */
    /* JADX WARN: Code duplicated, block: B:60:0x02bc  */
    public final void B(final boolean z, final int i, boolean z2) {
        int i2;
        ArrayList arrayList;
        int i3;
        BISPApplication bISPApplication;
        aR aRVar;
        TableLayout.LayoutParams layoutParams;
        int i4;
        int i5 = 2 % 2;
        Object[] objArr = new Object[1];
        a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 3, true, 1 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), getPackageName().codePointAt(11) + 63, new char[]{0}, objArr);
        String strIntern = ((String) objArr[0]).intern();
        ComponentCallbacks2 componentCallbacks2 = this.aj;
        Object obj = null;
        e eVar = componentCallbacks2 != null ? (e) componentCallbacks2 : null;
        if (eVar != null && z2 == this.ah) {
            int i6 = 7;
            if (!(eVar instanceof FragmentRelationship)) {
                int i7 = p + 55;
                int i8 = i7 % 128;
                q = i8;
                int i9 = i7 % 2;
                if (!(eVar instanceof FragmentOfflineRelationship)) {
                    int i10 = i8 + 7;
                    p = i10 % 128;
                    if (i10 % 2 == 0) {
                        boolean z3 = eVar instanceof FragmentMiscellaneous;
                        obj.hashCode();
                        throw null;
                    }
                    if ((eVar instanceof FragmentMiscellaneous) && ((i2 = this.ac) == 1 || i2 == 2 || ag.d)) {
                        if (!eVar.isValid()) {
                            if (i != -1) {
                                this.aD = i;
                                this.buttonNext.setEnabled(true);
                                return;
                            }
                            return;
                        }
                        byte bCodePointAt = (byte) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) - 36);
                        int i11 = getApplicationInfo().targetSdkVersion + 515723639;
                        String string = BuildConfig.FLAVOR;
                        Object[] objArr2 = new Object[1];
                        b(bCodePointAt, i11, (short) KeyEvent.keyCodeFromString(BuildConfig.FLAVOR), getPackageName().length() - 6892, super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 1368234058, objArr2);
                        this.aw = new aR(this, ((String) objArr2[0]).intern());
                        this.aF = new DialogInterface.OnClickListener() { // from class: ivas.gov.bisp.enumeration.bp.O
                            private static int a = 1;
                            private static int b;

                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i12) {
                                int i13 = 2 % 2;
                                int i14 = a;
                                int i15 = i14 ^ 59;
                                int i16 = ((i14 & 59) | i15) << 1;
                                int i17 = -i15;
                                int i18 = (i16 & i17) + (i16 | i17);
                                b = i18 % 128;
                                if (i18 % 2 != 0) {
                                    int i19 = ActivityBeginSurvey.af;
                                    Object obj2 = null;
                                    obj2.hashCode();
                                    throw null;
                                }
                                ActivityBeginSurvey activityBeginSurvey = this.c;
                                boolean z4 = z;
                                int i20 = ActivityBeginSurvey.af;
                                activityBeginSurvey.w(z4);
                                int i21 = b;
                                int i22 = i21 & 109;
                                int i23 = (i21 | 109) & (~i22);
                                int i24 = i22 << 1;
                                int i25 = (i23 & i24) + (i23 | i24);
                                a = i25 % 128;
                                int i26 = i25 % 2;
                            }
                        };
                        HashMap<Integer, KeyValue> map = this.aE;
                        if (map != null) {
                            int i12 = q + 43;
                            p = i12 % 128;
                            if (i12 % 2 == 0) {
                                int i13 = 92 / 0;
                                if (map.size() > 0) {
                                    arrayList = new ArrayList(this.aE.keySet());
                                    Collections.sort(arrayList);
                                    i3 = 0;
                                    while (i3 < arrayList.size()) {
                                        if (this.aE.get(arrayList.get(i3)).getValue().equals(BuildConfig.FLAVOR)) {
                                            aRVar = this.aw;
                                            String key = this.aE.get(arrayList.get(i3)).getKey();
                                            Objects.requireNonNull(aRVar);
                                            TextView textView = new TextView(aRVar.a.b);
                                            textView.setGravity(21);
                                            Context context = aRVar.a.b;
                                            Object obj2 = ivas.gov.bisp.enumeration.p086i.l.c;
                                            textView.setBackgroundColor(ivas.gov.bisp.enumeration.i.l.aUI.b(context, R.color.loginButtonColor));
                                            char[] cArr = new char[i6];
                                            // fill-array-data instruction
                                            cArr[0] = 5;
                                            cArr[1] = 5;
                                            cArr[2] = 5;
                                            cArr[3] = 5;
                                            cArr[4] = 5;
                                            cArr[5] = 5;
                                            cArr[6] = 65506;
                                            Object[] objArr3 = new Object[1];
                                            a(7 - (Process.myTid() >> 22), true, super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 3, super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(0) + 196, cArr, objArr3);
                                            textView.setTextColor(Color.parseColor(((String) objArr3[0]).intern()));
                                            textView.setTypeface(aRVar.i);
                                            textView.setTextSize(20.0f);
                                            int i14 = aRVar.h;
                                            textView.setPadding(i14, 0, i14, 0);
                                            textView.setText(key);
                                            TableRow.LayoutParams layoutParams2 = new TableRow.LayoutParams(-1, -2);
                                            layoutParams2.span = 2;
                                            textView.setLayoutParams(layoutParams2);
                                            layoutParams = new TableLayout.LayoutParams(-1, -2);
                                            layoutParams.setMargins(0, 0, 0, 0);
                                            if (aRVar.e.getChildCount() > 0) {
                                                i4 = aRVar.h;
                                                layoutParams.topMargin = i4;
                                                if (i4 > 2) {
                                                    layoutParams.topMargin = 2;
                                                }
                                            }
                                            TableRow tableRow = new TableRow(aRVar.a.b);
                                            tableRow.setBackgroundColor(-1);
                                            tableRow.addView(textView);
                                            int i15 = aRVar.h;
                                            tableRow.setPadding(i15, i15, i15, i15);
                                            aRVar.e.addView(tableRow, layoutParams);
                                        } else {
                                            this.aw.e(this.aE.get(arrayList.get(i3)).getValue(), this.aE.get(arrayList.get(i3)).getKey());
                                        }
                                        i3++;
                                        i6 = 7;
                                    }
                                    bISPApplication = (BISPApplication) getApplication();
                                    if (bISPApplication.j == 1) {
                                        StringBuilder sbW = j.w(BuildConfig.FLAVOR);
                                        sbW.append(getResources().getString(R.string.financial_difficulties));
                                        sbW.append(strIntern);
                                        string = sbW.toString();
                                    }
                                    if (bISPApplication.l == 1) {
                                        StringBuilder sbW2 = j.w(string);
                                        sbW2.append(getResources().getString(R.string.poor_education_quality));
                                        sbW2.append(strIntern);
                                        string = sbW2.toString();
                                    }
                                    if (bISPApplication.k == 1) {
                                        StringBuilder sbW3 = j.w(string);
                                        sbW3.append(getResources().getString(R.string.child_labor));
                                        sbW3.append(strIntern);
                                        string = sbW3.toString();
                                    }
                                    if (bISPApplication.m == 1) {
                                        int i16 = p + 57;
                                        q = i16 % 128;
                                        int i17 = i16 % 2;
                                        StringBuilder sbW4 = j.w(string);
                                        sbW4.append(getResources().getString(R.string.child_health));
                                        sbW4.append(strIntern);
                                        string = sbW4.toString();
                                    }
                                    if (bISPApplication.n == 1) {
                                        StringBuilder sbW5 = j.w(string);
                                        sbW5.append(getResources().getString(R.string.child_not_willing_to_study));
                                        sbW5.append(strIntern);
                                        string = sbW5.toString();
                                    }
                                    this.aw.e(string, getResources().getString(R.string.question_out_of_school_reason_dialog));
                                }
                            } else if (map.size() > 0) {
                                arrayList = new ArrayList(this.aE.keySet());
                                Collections.sort(arrayList);
                                i3 = 0;
                                while (i3 < arrayList.size()) {
                                    if (this.aE.get(arrayList.get(i3)).getValue().equals(BuildConfig.FLAVOR)) {
                                        aRVar = this.aw;
                                        String key2 = this.aE.get(arrayList.get(i3)).getKey();
                                        Objects.requireNonNull(aRVar);
                                        TextView textView2 = new TextView(aRVar.a.b);
                                        textView2.setGravity(21);
                                        Context context2 = aRVar.a.b;
                                        Object obj3 = ivas.gov.bisp.enumeration.p086i.l.c;
                                        textView2.setBackgroundColor(ivas.gov.bisp.enumeration.i.l.aUI.b(context2, R.color.loginButtonColor));
                                        char[] cArr2 = new char[i6];
                                        // fill-array-data instruction
                                        cArr2[0] = 5;
                                        cArr2[1] = 5;
                                        cArr2[2] = 5;
                                        cArr2[3] = 5;
                                        cArr2[4] = 5;
                                        cArr2[5] = 5;
                                        cArr2[6] = 65506;
                                        Object[] objArr4 = new Object[1];
                                        a(7 - (Process.myTid() >> 22), true, super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 3, super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(0) + 196, cArr2, objArr4);
                                        textView2.setTextColor(Color.parseColor(((String) objArr4[0]).intern()));
                                        textView2.setTypeface(aRVar.i);
                                        textView2.setTextSize(20.0f);
                                        int i18 = aRVar.h;
                                        textView2.setPadding(i18, 0, i18, 0);
                                        textView2.setText(key2);
                                        TableRow.LayoutParams layoutParams3 = new TableRow.LayoutParams(-1, -2);
                                        layoutParams3.span = 2;
                                        textView2.setLayoutParams(layoutParams3);
                                        layoutParams = new TableLayout.LayoutParams(-1, -2);
                                        layoutParams.setMargins(0, 0, 0, 0);
                                        if (aRVar.e.getChildCount() > 0) {
                                            i4 = aRVar.h;
                                            layoutParams.topMargin = i4;
                                            if (i4 > 2) {
                                                layoutParams.topMargin = 2;
                                            }
                                        }
                                        TableRow tableRow2 = new TableRow(aRVar.a.b);
                                        tableRow2.setBackgroundColor(-1);
                                        tableRow2.addView(textView2);
                                        int i19 = aRVar.h;
                                        tableRow2.setPadding(i19, i19, i19, i19);
                                        aRVar.e.addView(tableRow2, layoutParams);
                                    } else {
                                        this.aw.e(this.aE.get(arrayList.get(i3)).getValue(), this.aE.get(arrayList.get(i3)).getKey());
                                    }
                                    i3++;
                                    i6 = 7;
                                }
                                bISPApplication = (BISPApplication) getApplication();
                                if (bISPApplication.j == 1) {
                                    StringBuilder sbW6 = j.w(BuildConfig.FLAVOR);
                                    sbW6.append(getResources().getString(R.string.financial_difficulties));
                                    sbW6.append(strIntern);
                                    string = sbW6.toString();
                                }
                                if (bISPApplication.l == 1) {
                                    StringBuilder sbW7 = j.w(string);
                                    sbW7.append(getResources().getString(R.string.poor_education_quality));
                                    sbW7.append(strIntern);
                                    string = sbW7.toString();
                                }
                                if (bISPApplication.k == 1) {
                                    StringBuilder sbW8 = j.w(string);
                                    sbW8.append(getResources().getString(R.string.child_labor));
                                    sbW8.append(strIntern);
                                    string = sbW8.toString();
                                }
                                if (bISPApplication.m == 1) {
                                    int i110 = p + 57;
                                    q = i110 % 128;
                                    int i111 = i110 % 2;
                                    StringBuilder sbW9 = j.w(string);
                                    sbW9.append(getResources().getString(R.string.child_health));
                                    sbW9.append(strIntern);
                                    string = sbW9.toString();
                                }
                                if (bISPApplication.n == 1) {
                                    StringBuilder sbW10 = j.w(string);
                                    sbW10.append(getResources().getString(R.string.child_not_willing_to_study));
                                    sbW10.append(strIntern);
                                    string = sbW10.toString();
                                }
                                this.aw.e(string, getResources().getString(R.string.question_out_of_school_reason_dialog));
                            }
                        }
                        final aR aRVar2 = this.aw;
                        AlertController.OooO0O0 oooO0O0 = aRVar2.a;
                        oooO0O0.k = false;
                        DialogInterface.OnClickListener onClickListener = this.aF;
                        Object[] objArr5 = new Object[1];
                        b((byte) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) - 49), super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 515722170, (short) (getApplicationInfo().targetSdkVersion - 31), getApplicationInfo().targetSdkVersion - 6898, getPackageName().length() - 1368234051, objArr5);
                        oooO0O0.h = ((String) objArr5[0]).intern();
                        oooO0O0.i = onClickListener;
                        DialogInterface.OnShowListener onShowListener = new DialogInterface.OnShowListener() { // from class: ivas.gov.bisp.enumeration.aA.aQ
                            private static int a = 0;
                            private static int b = 1;

                            @Override // android.content.DialogInterface.OnShowListener
                            public final void onShow(DialogInterface dialogInterface) {
                                int measuredWidth;
                                TableLayout tableLayout;
                                int i20 = 2 % 2;
                                int i21 = (-2) - ((a + 110) ^ (-1));
                                b = i21 % 128;
                                int i22 = i21 % 2;
                                aR aRVar3 = aRVar2;
                                aRVar3.e.measure(0, 0);
                                int i23 = b;
                                int i24 = i23 & 5;
                                int i25 = (((i23 | 5) & (~i24)) - (~(-(-(i24 << 1))))) - 1;
                                a = i25 % 128;
                                if (i25 % 2 != 0) {
                                    measuredWidth = aRVar3.e.getMeasuredWidth();
                                    tableLayout = aRVar3.e;
                                    int i26 = 91 / 0;
                                } else {
                                    measuredWidth = aRVar3.e.getMeasuredWidth();
                                    tableLayout = aRVar3.e;
                                }
                                int measuredHeight = tableLayout.getMeasuredHeight();
                                WindowManager.LayoutParams layoutParams4 = new WindowManager.LayoutParams();
                                int i27 = a;
                                int i28 = i27 ^ 81;
                                int i29 = (i27 & 81) << 1;
                                int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
                                b = i30 % 128;
                                int i31 = i30 % 2;
                                layoutParams4.copyFrom(aRVar3.l.getWindow().getAttributes());
                                int i32 = a;
                                int i33 = i32 ^ 53;
                                int i34 = -(-((i32 & 53) << 1));
                                int i35 = (i33 ^ i34) + ((i34 & i33) << 1);
                                b = i35 % 128;
                                int i36 = i35 % 2;
                                double d = aRVar3.f;
                                int i37 = b;
                                int i38 = i37 & 121;
                                int i39 = (((i37 | 121) & (~i38)) - (~(-(-(i38 << 1))))) - 1;
                                a = i39 % 128;
                                if (i39 % 2 == 0 ? measuredWidth < ((int) (0.9d * d)) : measuredWidth < ((int) (0.9d - d))) {
                                    int i40 = -(-((int) (d * 0.1d)));
                                    int i41 = ((~i40) & measuredWidth) | ((~measuredWidth) & i40);
                                    int i42 = -(-((measuredWidth & i40) << 1));
                                    layoutParams4.width = (i41 ^ i42) + ((i42 & i41) << 1);
                                    int i43 = b;
                                    int i44 = (i43 & 57) + (i43 | 57);
                                    a = i44 % 128;
                                    if (i44 % 2 != 0) {
                                        int i45 = 4 / 4;
                                    }
                                }
                                int i46 = (int) (((double) aRVar3.g) * 0.6d);
                                if (measuredHeight > i46) {
                                    int i47 = a;
                                    int i48 = (i47 ^ 111) + ((i47 & 111) << 1);
                                    b = i48 % 128;
                                    if (i48 % 2 == 0) {
                                        layoutParams4.height = i46;
                                        throw null;
                                    }
                                    layoutParams4.height = i46;
                                }
                                aRVar3.l.getWindow().setAttributes(layoutParams4);
                                int i49 = b;
                                int i50 = (i49 ^ 33) + ((i49 & 33) << 1);
                                a = i50 % 128;
                                if (i50 % 2 != 0) {
                                    throw null;
                                }
                            }
                        };
                        aRVar2.c(aRVar2.j);
                        androidx.appcompat.app.b bVarB = aRVar2.b();
                        aRVar2.l = bVarB;
                        bVarB.setOnShowListener(onShowListener);
                        aRVar2.l.show();
                        this.aw.l.h(-1).setEnabled(false);
                        new S(this, 12000L, 1000L).start();
                        return;
                    }
                    if (!eVar.isValid()) {
                        if (i != -1) {
                            this.aD = i;
                            this.buttonNext.setEnabled(true);
                            return;
                        }
                        return;
                    }
                    if (i != 0 || ag.v != 2) {
                        w(z);
                        return;
                    }
                    int i20 = p + 23;
                    q = i20 % 128;
                    int i21 = i20 % 2;
                    if (!BISPApplication.f) {
                        new OooO0OO(ag.t, ag.u, ag.s, new OooO00o(z)).execute(new Void[0]);
                        return;
                    }
                }
            }
            if (eVar.isValid()) {
                w(z);
                return;
            }
            C0104p c0104pC = C0104p.c();
            AppCompatActivity appCompatActivity = this.ae;
            Object[] objArr6 = new Object[1];
            b((byte) (getPackageName().length() - 25), super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) + 515722146, (short) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(3) - 115), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 6867, super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 1368234123, objArr6);
            String strIntern2 = ((String) objArr6[0]).intern();
            Object[] objArr7 = new Object[1];
            b((byte) (getPackageName().codePointAt(7) - 118), 515722162 - (Process.myPid() >> 22), (short) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) - 49), super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(0) - 6904, getApplicationInfo().targetSdkVersion - 1368234055, objArr7);
            c0104pC.e(appCompatActivity, strIntern2, ((String) objArr7[0]).intern(), new DialogInterface.OnClickListener() { // from class: ivas.gov.bisp.enumeration.bp.m
                private static int a = 0;
                private static int b = 1;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i22) {
                    int i23 = 2 % 2;
                    int i24 = b;
                    int i25 = i24 & 47;
                    int i26 = ((i24 ^ 47) | i25) << 1;
                    int i27 = -((i24 | 47) & (~i25));
                    int i28 = (i26 & i27) + (i27 | i26);
                    a = i28 % 128;
                    if (i28 % 2 != 0) {
                        int i29 = ActivityBeginSurvey.af;
                        Object obj4 = null;
                        obj4.hashCode();
                        throw null;
                    }
                    ActivityBeginSurvey activityBeginSurvey = this.c;
                    int i30 = i;
                    int i31 = ActivityBeginSurvey.af;
                    Objects.requireNonNull(activityBeginSurvey);
                    dialogInterface.dismiss();
                    int i32 = b;
                    int i33 = i32 & 101;
                    int i34 = (i32 ^ 101) | i33;
                    int i35 = (i33 & i34) + (i34 | i33);
                    a = i35 % 128;
                    int i36 = i35 % 2;
                    activityBeginSurvey.ay = false;
                    if (i30 != -1) {
                        int i37 = a;
                        int i38 = (i37 | 71) << 1;
                        int i39 = -(((~i37) & 71) | (i37 & (-72)));
                        int i40 = ((i38 | i39) << 1) - (i39 ^ i38);
                        b = i40 % 128;
                        if (i40 % 2 == 0) {
                            activityBeginSurvey.aD = i30;
                        } else {
                            activityBeginSurvey.aD = i30;
                        }
                        activityBeginSurvey.buttonNext.setEnabled(true);
                        int i41 = a;
                        int i42 = i41 & 51;
                        int i43 = (i41 ^ 51) | i42;
                        int i44 = (i42 ^ i43) + ((i43 & i42) << 1);
                        b = i44 % 128;
                        int i45 = i44 % 2;
                    }
                    int i46 = b;
                    int i47 = (((i46 | 106) << 1) - (i46 ^ 106)) - 1;
                    a = i47 % 128;
                    if (i47 % 2 != 0) {
                        int i48 = 93 / 0;
                    }
                }
            }, false);
            return;
        }
        w(z);
    }

    private static void a(int i, boolean z, int i2, int i3, char[] cArr, Object[] objArr) {
        int i4 = 2 % 2;
        a aVar = new a();
        char[] cArr2 = new char[i2];
        aVar.b = 0;
        while (aVar.b < i2) {
            int i5 = $10 + 117;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            aVar.a = cArr[aVar.b];
            cArr2[aVar.b] = (char) (aVar.a + i3);
            int i7 = aVar.b;
            cArr2[i7] = (char) (cArr2[i7] - ((int) (((long) a$s14$1929) ^ (-3199524018197912079L))));
            aVar.b++;
        }
        if (i > 0) {
            int i8 = $11 + 1;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            aVar.c = i;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - aVar.c, aVar.c);
            System.arraycopy(cArr3, aVar.c, cArr2, 0, i2 - aVar.c);
        }
        if (z) {
            char[] cArr4 = new char[i2];
            aVar.b = 0;
            while (aVar.b < i2) {
                int i10 = $11 + 35;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                cArr4[aVar.b] = cArr2[(i2 - aVar.b) - 1];
                aVar.b++;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private static void b(byte b, int i, short s, int i2, int i3, Object[] objArr) {
        boolean z;
        int i4;
        int i5 = 2 % 2;
        o.f fVar = new o.f();
        StringBuilder sb = new StringBuilder();
        int i6 = i2 + ((int) (((long) d$s27$2034) ^ (-1399694120703284637L)));
        boolean z2 = i6 == -1;
        if (z2) {
            byte[] bArr = b$s29$2034;
            if (bArr != null) {
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                int i7 = 0;
                while (i7 < length) {
                    int i8 = $10 + 117;
                    $11 = i8 % 128;
                    if (i8 % 2 == 0) {
                        bArr2[i7] = (byte) (((long) bArr[i7]) - 1399694120703284637L);
                    } else {
                        bArr2[i7] = (byte) (((long) bArr[i7]) ^ (-1399694120703284637L));
                        i7++;
                    }
                }
                bArr = bArr2;
            }
            if (bArr != null) {
                i6 = (byte) (((byte) (((long) b$s29$2034[i3 + ((int) (((long) a$s26$2034) ^ (-1399694120703284637L)))]) ^ (-1399694120703284637L))) + ((int) (((long) d$s27$2034) ^ (-1399694120703284637L))));
                int i9 = $10 + 93;
                $11 = i9 % 128;
                int i10 = i9 % 2;
            } else {
                i6 = (short) (((short) (((long) c$s30$2034[i3 + ((int) (((long) a$s26$2034) ^ (-1399694120703284637L)))]) ^ (-1399694120703284637L))) + ((int) (((long) d$s27$2034) ^ (-1399694120703284637L))));
            }
        }
        if (i6 > 0) {
            fVar.d = ((i3 + i6) - 2) + ((int) (((long) a$s26$2034) ^ (-1399694120703284637L))) + (!z2 ? 0 : 1);
            fVar.e = (char) (((int) (((long) e$s28$2034) ^ (-1399694120703284637L))) + i);
            sb.append(fVar.e);
            fVar.a = fVar.e;
            byte[] bArr3 = b$s29$2034;
            if (bArr3 != null) {
                int length2 = bArr3.length;
                byte[] bArr4 = new byte[length2];
                for (int i11 = 0; i11 < length2; i11++) {
                    bArr4[i11] = (byte) (((long) bArr3[i11]) ^ (-1399694120703284637L));
                }
                bArr3 = bArr4;
            }
            if (bArr3 != null) {
                int i12 = $11 + 109;
                $10 = i12 % 128;
                int i13 = i12 % 2;
                z = true;
            } else {
                z = false;
            }
            fVar.c = 1;
            while (fVar.c < i6) {
                if (!z) {
                    short[] sArr = c$s30$2034;
                    int i14 = fVar.d;
                    fVar.d = i14 - 1;
                    fVar.e = (char) (fVar.a + (((short) (((short) (((long) sArr[i14]) ^ (-1399694120703284637L))) + s)) ^ b));
                } else {
                    int i15 = $10 + 107;
                    $11 = i15 % 128;
                    if (i15 % 2 == 0) {
                        byte[] bArr5 = b$s29$2034;
                        int i16 = fVar.d;
                        fVar.d = i16 >>> 1;
                        i4 = fVar.a * (((byte) (((byte) (((long) bArr5[i16]) * (-1399694120703284637L))) - s)) ^ b);
                    } else {
                        byte[] bArr6 = b$s29$2034;
                        int i17 = fVar.d;
                        fVar.d = i17 - 1;
                        i4 = fVar.a + (((byte) (((byte) (((long) bArr6[i17]) ^ (-1399694120703284637L))) + s)) ^ b);
                    }
                    fVar.e = (char) i4;
                }
                sb.append(fVar.e);
                fVar.a = fVar.e;
                fVar.c++;
            }
        }
        objArr[0] = sb.toString();
    }
}
