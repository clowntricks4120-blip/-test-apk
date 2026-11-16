package ivas.gov.bisp.enumeration;

import android.database.Cursor;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.OnClick;
import com.orm.SugarRecord;
import ivas.gov.bisp.enumeration.adapters.AdapterSummary;
import ivas.gov.bisp.enumeration.models.SurveyInfo;
import ivas.gov.bisp.enumeration.p026az.z;
import ivas.gov.bisp.enumeration.p043bp.C0203e;
import ivas.gov.bisp.enumeration.p043bp.C0213t;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import o.h;
import o.l;

/* JADX INFO: loaded from: classes.dex */
public class ActivitySummary extends BaseActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int c$s65$718 = 937766645;
    private static boolean e$s68$718 = true;
    private static int p = 1;
    private static int q;
    public AdapterSummary af;
    public ArrayList<OooO00o> ag;

    @BindView
    public Button buttonSearch;

    @BindView
    public LinearLayout linearLayoutSummary;

    @BindView
    public RecyclerView recyclerViewSummary;

    @BindView
    public TextView textViewDate;

    @BindView
    public TextView textViewDeclinedCount;

    @BindView
    public TextView textViewFromDate;

    @BindView
    public TextView textViewLocality;

    @BindView
    public TextView textViewNoSummary;

    @BindView
    public TextView textViewNotAtHomeCount;

    @BindView
    public TextView textViewSupervisorTimeStamp;

    @BindView
    public TextView textViewToDate;

    @BindView
    public TextView textViewTotalCount;
    private static char[] b$s64$718 = {12081, 12054, 12129, 12050, 12089, 12132, 12048, 12057, 12062, 12142, 12039, 12131, 12049, 11989, 12033, 12031, 12032, 12130, 12135, 12128, 12091, 12093, 12058, 12059, 11994, 12090, 12035, 12094, 12086, 12092, 12082, 12052, 11997, 11999, 11998, 12080, 12036, 12034, 12044, 12074, 12070, 12069, 12071, 12037, 12075, 12084, 12073, 12133};
    private static boolean a$s67$718 = true;
    private static char a$s76$822 = 51411;
    private static char b$s75$822 = 41377;
    private static char c$s74$822 = 3055;
    private static char d$s73$822 = 52686;

    public static class OooO00o {
        public String a;
        public String b;
        public int c;
        public int d;
        public String e;
        public int f;

        public OooO00o(String str, int i, String str2, int i2, int i3, int i4, int i5, String str3, String str4) {
            this.a = str;
            this.b = str2;
            this.c = i2;
            this.d = i3;
            this.f = i4;
            this.e = str4;
        }
    }

    @OnClick
    public void fromDate(View view) {
        int i = 2 % 2;
        z.p(true, this.ae, new C0203e(this, 4));
        int i2 = q + 67;
        p = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public int p() {
        int i = 2 % 2;
        int i2 = p + 35;
        q = i2 % 128;
        if (i2 % 2 == 0) {
            return R.layout.activity_summary;
        }
        throw null;
    }

    @OnClick
    public void toDate(View view) {
        int i = 2 % 2;
        z.p(true, this.ae, new C0213t(this, 2));
        int i2 = q + 47;
        p = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x037d A[LOOP:0: B:34:0x0343->B:37:0x037d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x037f A[EDGE_INSN: B:54:0x037f->B:38:0x037f BREAK  A[LOOP:0: B:34:0x0343->B:37:0x037d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:? A[SYNTHETIC] */
    @OnClick
    public void onSearchClick(View view) {
        int i = 2;
        int i2 = 2 % 2;
        ArrayList<OooO00o> arrayList = new ArrayList<>();
        this.ag = arrayList;
        AdapterSummary adapterSummary = this.af;
        adapterSummary.f = arrayList;
        adapterSummary.a.c();
        this.textViewNoSummary.setVisibility(8);
        this.linearLayoutSummary.setVisibility(8);
        if (this.textViewFromDate.getTag() == null) {
            AppCompatActivity appCompatActivity = this.ae;
            Object[] objArr = new Object[1];
            b(getPackageName().length() + 4, new char[]{24998, 21484, 7739, 38812, 21232, 4903, 60391, 44390, 35306, 15136, 27430, 8437, 51924, 8946, 28175, 44576, 24980, 34513, 50214, 42789, 32798, 38521, 21135, 10363, 19528, 15026, 10195, 56638, 8621, 47011}, objArr);
            Toast.makeText(appCompatActivity, ((String) objArr[0]).intern(), 0).show();
            return;
        }
        if (this.textViewToDate.getTag() == null) {
            AppCompatActivity appCompatActivity2 = this.ae;
            Object[] objArr2 = new Object[1];
            b(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(0) - 10, new char[]{24998, 21484, 7739, 38812, 21232, 4903, 60391, 44390, 45172, 28994, 24188, 56031, 28175, 44576, 24980, 34513, 50214, 42789, 32798, 38521, 21135, 10363, 19528, 15026, 10195, 56638, 8621, 47011}, objArr2);
            Toast.makeText(appCompatActivity2, ((String) objArr2[0]).intern(), 0).show();
            return;
        }
        Object obj = null;
        try {
            Object[] objArr3 = new Object[1];
            a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(3) + 12, null, new byte[]{-115, -115, -103, -102, -102, -103, -118, -118, -118, -118}, null, objArr3);
            Date date = new SimpleDateFormat(((String) objArr3[0]).intern()).parse((String) this.textViewFromDate.getTag());
            Object[] objArr4 = new Object[1];
            a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) + 91, null, new byte[]{-115, -115, -103, -102, -102, -103, -118, -118, -118, -118}, null, objArr4);
            if (new SimpleDateFormat(((String) objArr4[0]).intern()).parse((String) this.textViewToDate.getTag()).before(date)) {
                AppCompatActivity appCompatActivity3 = this.ae;
                Object[] objArr5 = new Object[1];
                b(View.getDefaultSize(0, 0) + 37, new char[]{17974, 36734, 370, 59985, 63495, 36012, 36424, 38611, 13519, 19368, 25381, 51829, 14268, 5335, 25942, 3345, 32427, 27723, 45926, 58964, 7739, 38812, 34845, 28485, 50214, 42789, 58264, 50347, 25951, 23905, 17974, 36734, 370, 59985, 17283, 60936, 7478, 63373}, objArr5);
                Toast.makeText(appCompatActivity3, ((String) objArr5[0]).intern(), 0).show();
                return;
            }
        } catch (ParseException unused) {
        }
        String str = (String) this.textViewFromDate.getTag();
        String str2 = (String) this.textViewToDate.getTag();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(str);
        arrayList2.add(str2);
        int i3 = this.ac;
        if (i3 == 1) {
            int i4 = q + 75;
            p = i4 % 128;
            if (i4 % 2 == 0) {
                arrayList2.add("0");
                obj.hashCode();
                throw null;
            }
            arrayList2.add("0");
        } else if (i3 == 0) {
            arrayList2.add("1");
        } else {
            arrayList2.add("5");
        }
        String[] strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
        ArrayList arrayList3 = new ArrayList();
        Object[] objArr6 = new Object[1];
        b(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length(), new char[]{14696, 49628, 56218, 53029}, objArr6);
        arrayList3.add(((String) objArr6[0]).intern());
        Object[] objArr7 = new Object[1];
        a(getApplicationInfo().targetSdkVersion + 96, null, new byte[]{-127, -100, -96, -97, -98, -99, -123, -123, -100, -101}, null, objArr7);
        arrayList3.add(((String) objArr7[0]).intern());
        Object[] objArr8 = new Object[1];
        a(getApplicationInfo().targetSdkVersion + 96, null, new byte[]{-97, -102, -99, -107, -96, -97, -98, -99, -123, -123, -100, -101}, null, objArr8);
        arrayList3.add(((String) objArr8[0]).intern());
        Object[] objArr9 = new Object[1];
        a(ExpandableListView.getPackedPositionGroup(0L) + 127, null, new byte[]{-113, -107, -90, -91, -92, -114, -108, -126, -114, -93, -94, -95, -125, -104, -110, -122, -121}, null, objArr9);
        arrayList3.add(((String) objArr9[0]).intern());
        Object[] objArr10 = new Object[1];
        a(getPackageName().codePointAt(22) + 22, null, new byte[]{-127, -97, -107, -100, -123, -92, -97, -127, -114, -108, -126, -114, -93, -127, -107, -97, -114, -86, -114, -97, -111, -123, -97, -114, -87, -114, -107, -97, -106, -113, -114, -93, -87, -114, -88, -114, -111, -90, -113, -99, -113, -111, -96, -89, -97, -100, -101, -117, -97, -113, -107, -100, -95, -114, -107, -97, -106, -89, -114, -97, -111, -99, -92, -95, -102, -90, -111}, null, objArr10);
        arrayList3.add(((String) objArr10[0]).intern());
        Object[] objArr11 = new Object[1];
        a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) + 78, null, new byte[]{-97, -102, -91, -106, -96, -113, -99, -96, -113, -91, -107, -114, -108, -126, -114, -93, -127, -107, -97, -114, -86, -114, -97, -111, -123, -97, -114, -87, -114, -107, -97, -106, -113, -114, -93, -85, -114, -88, -114, -111, -90, -113, -99, -113, -111, -96, -89, -97, -100, -101, -117, -97, -113, -107, -100, -95, -114, -107, -97, -106, -89, -114, -97, -111, -99, -92, -95, -102, -90, -111}, null, objArr11);
        arrayList3.add(((String) objArr11[0]).intern());
        Object[] objArr12 = new Object[1];
        b(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 64, new char[]{12989, 56519, 39831, 56658, 58113, 41312, 46665, 46336, 53686, 16610, 15355, 49979, 55229, 43916, 57941, 10276, 21221, 21036, 59329, 25038, 52183, 2950, 26924, 21719, 39866, 15893, 64216, 11564, 31799, 39223, 38402, 39835, 60686, 34610, 21386, 54624, 17283, 60936, 15355, 49979, 55229, 43916, 58070, 53145, 64656, 59699, 46665, 46336, 19699, 45378, 61637, 62998, 59386, 62571, 49069, 47456, 37503, 46678, 19264, 16887, 38041, 1871, 19970, 26988, 54564, 9575, 44817, 12667}, objArr12);
        arrayList3.add(((String) objArr12[0]).intern());
        Object[] objArr13 = new Object[1];
        a(getApplicationInfo().targetSdkVersion + 96, null, new byte[]{-92, -99, -102, -96, -100, -97, -102, -100}, null, objArr13);
        arrayList3.add(((String) objArr13[0]).intern());
        Object[] objArr14 = new Object[1];
        a((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 127, null, new byte[]{-84, -102, -99, -113, -111, -96, -97, -102, -100, -113, -96, -117, -91, -111, -100, -101, -117, -97, -84, -90, -111}, null, objArr14);
        arrayList3.add(((String) objArr14[0]).intern());
        String[] strArr2 = (String[]) arrayList3.toArray(new String[arrayList3.size()]);
        this.ag = new ArrayList<>();
        Object[] objArr15 = new Object[1];
        a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(0) + 90, null, new byte[]{-82, -88, -124, -80, -118, -125, -114, -115, -104, -126, -114, -82, -88, -81, -124, -125, -126, -115, -114, -115, -104, -126, -114, -82, -88, -83, -124, -125, -126, -115}, null, objArr15);
        String strIntern = ((String) objArr15[0]).intern();
        Object[] objArr16 = new Object[1];
        b(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 33, new char[]{14696, 49628, 56218, 53029, 22399, 40649, 9452, 17894, 6953, 57964, 64933, 11927, 47614, 53404, 12314, 2263, 12989, 56519, 37794, 62486, 35678, 56950, 61103, 37544, 61661, 28189, 48285, 1738, 63914, 1111, 37794, 23185, 37450, 21966, 9267, 53930, 30481, 586}, objArr16);
        Cursor cursor = SugarRecord.getCursor(SurveyInfo.class, strArr2, strIntern, strArr, ((String) objArr16[0]).intern(), null, null);
        if (cursor != null && cursor.getCount() > 0) {
            int i5 = p + 109;
            q = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 42 / 0;
                if (cursor.moveToFirst()) {
                    while (true) {
                        this.ag.add(new OooO00o(cursor.getString(0), cursor.getInt(1), cursor.getString(i), cursor.getInt(3), cursor.getInt(4), cursor.getInt(5), cursor.getInt(6), cursor.getString(7), cursor.getString(8)));
                        if (!cursor.moveToNext()) {
                            break;
                        } else {
                            i = 2;
                        }
                    }
                }
            } else if (cursor.moveToFirst()) {
                while (true) {
                    this.ag.add(new OooO00o(cursor.getString(0), cursor.getInt(1), cursor.getString(i), cursor.getInt(3), cursor.getInt(4), cursor.getInt(5), cursor.getInt(6), cursor.getString(7), cursor.getString(8)));
                    if (!cursor.moveToNext()) {
                        break;
                        break;
                    }
                    i = 2;
                }
            }
        }
        cursor.close();
        AdapterSummary adapterSummary2 = this.af;
        adapterSummary2.f = this.ag;
        adapterSummary2.a.c();
        boolean z = this.ag.size() > 0;
        this.textViewNoSummary.setVisibility(z ? 8 : 0);
        this.linearLayoutSummary.setVisibility(z ? 0 : 8);
    }

    @Override // ivas.gov.bisp.enumeration.BaseActivity, ivas.gov.bisp.enumeration.activitybase.BaseTouch, ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public void t() {
        TextView textView;
        Object obj;
        int i = 2 % 2;
        super.t();
        this.recyclerViewSummary.setHasFixedSize(true);
        this.recyclerViewSummary.setLayoutManager(new LinearLayoutManager(1, false));
        ArrayList<OooO00o> arrayList = new ArrayList<>();
        this.ag = arrayList;
        AdapterSummary adapterSummary = new AdapterSummary(this, arrayList, null);
        this.af = adapterSummary;
        this.recyclerViewSummary.setAdapter(adapterSummary);
        TextView textView2 = this.textViewDate;
        Object[] objArr = new Object[1];
        a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) + 91, null, new byte[]{-124, -125, -126, -127}, null, objArr);
        textView2.setText(((String) objArr[0]).intern());
        TextView textView3 = this.textViewLocality;
        Object[] objArr2 = new Object[1];
        a((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 127, null, new byte[]{-118, -125, -119, -120, -126, -121, -122, -123}, null, objArr2);
        textView3.setText(((String) objArr2[0]).intern());
        int i2 = this.ac;
        if (i2 == 1) {
            int i3 = q + 31;
            p = i3 % 128;
            if (i3 % 2 == 0) {
                textView = this.textViewSupervisorTimeStamp;
                Object[] objArr3 = new Object[1];
                b(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 3).codePointAt(2) * 40, new char[]{24998, 21484, 20800, 52660, 24188, 56031, 28175, 44576, 58260, 6295}, objArr3);
                obj = objArr3[0];
            } else {
                textView = this.textViewSupervisorTimeStamp;
                Object[] objArr4 = new Object[1];
                b(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) - 27, new char[]{24998, 21484, 20800, 52660, 24188, 56031, 28175, 44576, 58260, 6295}, objArr4);
                obj = objArr4[0];
            }
            textView.setText(((String) obj).intern());
        } else if (i2 == 0) {
            TextView textView4 = this.textViewSupervisorTimeStamp;
            Object[] objArr5 = new Object[1];
            a(getPackageName().codePointAt(5) + 24, null, new byte[]{-124, -125, -126, -127, -114, -115, -124, -116, -119, -124, -121, -124, -117}, null, objArr5);
            textView4.setText(((String) objArr5[0]).intern());
            int i4 = p + 19;
            q = i4 % 128;
            int i5 = i4 % 2;
        }
        TextView textView5 = this.textViewTotalCount;
        Object[] objArr6 = new Object[1];
        a((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 126, null, new byte[]{-108, -118, -124, -116, -109, -110, -111, -112, -120, -126, -125, -122, -113}, null, objArr6);
        textView5.setText(((String) objArr6[0]).intern());
        TextView textView6 = this.textViewNotAtHomeCount;
        Object[] objArr7 = new Object[1];
        a(127 - (ViewConfiguration.getScrollBarSize() >> 8), null, new byte[]{-108, -118, -124, -116, -109, -110, -111, -112, -124, -105, -122, -106, -114, -125, -126, -114, -125, -122, -107}, null, objArr7);
        textView6.setText(((String) objArr7[0]).intern());
        TextView textView7 = this.textViewDeclinedCount;
        Object[] objArr8 = new Object[1];
        a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(0) + 90, null, new byte[]{-108, -118, -124, -116, -109, -110, -111, -112, -115, -124, -104, -119, -120, -121, -124, -127}, null, objArr8);
        textView7.setText(((String) objArr8[0]).intern());
    }

    private static void a(int i, char[] cArr, byte[] bArr, int[] iArr, Object[] objArr) {
        int i2 = 2 % 2;
        l lVar = new l();
        char[] cArr2 = b$s64$718;
        if (cArr2 != null) {
            int i3 = $10 + 23;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                cArr3[i5] = (char) (((long) cArr2[i5]) ^ 1962356595541487140L);
            }
            cArr2 = cArr3;
        }
        int i6 = (int) (1962356595541487140L ^ ((long) c$s65$718));
        if (e$s68$718) {
            lVar.d = bArr.length;
            char[] cArr4 = new char[lVar.d];
            lVar.a = 0;
            while (lVar.a < lVar.d) {
                cArr4[lVar.a] = (char) (cArr2[bArr[(lVar.d - 1) - lVar.a] + i] - i6);
                lVar.a++;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!(!a$s67$718)) {
            int i7 = $11 + 41;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            lVar.d = cArr.length;
            char[] cArr5 = new char[lVar.d];
            lVar.a = 0;
            while (lVar.a < lVar.d) {
                cArr5[lVar.a] = (char) (cArr2[cArr[(lVar.d - 1) - lVar.a] - i] - i6);
                lVar.a++;
            }
            String str = new String(cArr5);
            int i9 = $10 + 111;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            objArr[0] = str;
            return;
        }
        lVar.d = iArr.length;
        char[] cArr6 = new char[lVar.d];
        lVar.a = 0;
        while (lVar.a < lVar.d) {
            int i11 = $11 + 53;
            $10 = i11 % 128;
            if (i11 % 2 != 0) {
                cArr6[lVar.a] = (char) (cArr2[iArr[(lVar.d / 0) + lVar.a] - i] << i6);
                int i12 = lVar.a;
                lVar.a = 0;
            } else {
                cArr6[lVar.a] = (char) (cArr2[iArr[(lVar.d - 1) - lVar.a] - i] - i6);
                lVar.a++;
            }
            int i13 = $11 + 87;
            $10 = i13 % 128;
            int i14 = i13 % 2;
        }
        objArr[0] = new String(cArr6);
    }

    private static void b(int i, char[] cArr, Object[] objArr) {
        int i2 = 2 % 2;
        h hVar = new h();
        char[] cArr2 = new char[cArr.length];
        hVar.d = 0;
        char[] cArr3 = new char[2];
        while (hVar.d < cArr.length) {
            int i3 = $11 + 1;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            cArr3[0] = cArr[hVar.d];
            cArr3[1] = cArr[hVar.d + 1];
            int i5 = 58224;
            int i6 = 0;
            while (i6 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[0];
                char c3 = (char) (c - (((c2 + i5) ^ ((c2 << 4) + ((char) (((long) b$s75$822) ^ 6963871449151285300L)))) ^ ((c2 >>> 5) + ((char) (((long) a$s76$822) ^ 6963871449151285300L)))));
                cArr3[1] = c3;
                cArr3[0] = (char) (c2 - (((c3 >>> 5) + ((char) (((long) c$s74$822) ^ 6963871449151285300L))) ^ ((c3 + i5) ^ ((c3 << 4) + ((char) (((long) d$s73$822) ^ 6963871449151285300L))))));
                i5 -= 40503;
                i6++;
                int i7 = $11 + 3;
                $10 = i7 % 128;
                int i8 = i7 % 2;
            }
            cArr2[hVar.d] = cArr3[0];
            cArr2[hVar.d + 1] = cArr3[1];
            hVar.d += 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }
}
