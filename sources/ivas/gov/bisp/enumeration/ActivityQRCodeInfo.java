package ivas.gov.bisp.enumeration;

import android.database.Cursor;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.OnClick;
import com.orm.SugarRecord;
import ivas.gov.bisp.enumeration.adapters.AdapterQrCodeDetail;
import ivas.gov.bisp.enumeration.models.SurveyInfo;
import ivas.gov.bisp.enumeration.p026az.z;
import ivas.gov.bisp.enumeration.p043bp.C0203e;
import ivas.gov.bisp.enumeration.p043bp.C0213t;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import o.i;
import o.l;

/* JADX INFO: loaded from: classes.dex */
public class ActivityQRCodeInfo extends BaseActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int c$s65$714 = 937766631;
    private static boolean e$s68$714 = true;
    private static int p = 0;
    private static int q = 1;
    public AdapterQrCodeDetail af;
    public ArrayList<OooO00o> ag;

    @BindView
    public LinearLayout linearLayoutQR;

    @BindView
    public RecyclerView recyclerViewQR;

    @BindView
    public TextView textViewDate;

    @BindView
    public TextView textViewFromDate;

    @BindView
    public TextView textViewLocality;

    @BindView
    public TextView textViewNoQR;

    @BindView
    public TextView textViewQRCode;

    @BindView
    public TextView textViewToDate;
    private static char[] b$s64$714 = {12083, 12040, 12052, 12044, 12050, 12051, 12032, 12055, 12077, 12054, 12049, 11975, 12085, 11989, 12082, 12043, 12034, 11982, 12067, 12035, 12056, 11988, 12084, 12047, 12060, 12033, 12053, 12064, 12076, 12093, 12072, 12075, 12078, 12038, 11979};
    private static boolean a$s67$714 = true;
    private static char[] a$s17$815 = {48782, 48860, 48855, 48867, 48860, 48840, 48848, 48852, 48840, 48715, 49087, 49087, 48707, 49082, 48733, 48642, 48753, 48715, 49079, 49081, 48737, 48741, 48709, 49085, 49083, 48737, 48642, 48733, 49076, 48734, 48735, 49076, 49079, 49084, 48707, 48704, 48707, 48798, 48890, 48888, 48876, 48872, 48889, 48889, 48887, 48883, 48881, 48884, 48882, 48793, 48880, 48872, 48872, 48881, 48878, 48884, 48753, 48736, 48757, 48752, 48663, 48665, 48753, 48740, 48733, 48736, 48692, 48752, 48742, 48757, 48692, 48663, 48665, 48664, 48753, 48736, 48757, 48752, 48692, 48752, 48742, 48757, 48692, 48663, 48665, 48662};

    public static class OooO00o {
        public String a;
        public String b;
        public String c;
        public String d;

        public OooO00o(String str, int i, String str2, String str3, String str4) {
            this.a = str;
            this.d = str4;
            this.b = str2;
            this.c = str3;
        }
    }

    @OnClick
    public void fromDate(View view) {
        int i = 2 % 2;
        z.p(true, this.ae, new C0203e(this, 3));
        int i2 = p + 63;
        q = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public int p() {
        int i = 2 % 2;
        int i2 = p;
        int i3 = i2 + 79;
        q = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 111;
        q = i5 % 128;
        int i6 = i5 % 2;
        return R.layout.activity_qr_code_detail;
    }

    @OnClick
    public void toDate(View view) {
        int i = 2 % 2;
        z.p(true, this.ae, new C0213t(this, 1));
        int i2 = p + 43;
        q = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.BaseActivity, ivas.gov.bisp.enumeration.activitybase.BaseTouch, ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public void t() {
        int i = 2 % 2;
        super.t();
        this.recyclerViewQR.setHasFixedSize(true);
        this.recyclerViewQR.setLayoutManager(new LinearLayoutManager(1, false));
        ArrayList<OooO00o> arrayList = new ArrayList<>();
        this.ag = arrayList;
        AdapterQrCodeDetail adapterQrCodeDetail = new AdapterQrCodeDetail(this, arrayList, null);
        this.af = adapterQrCodeDetail;
        this.recyclerViewQR.setAdapter(adapterQrCodeDetail);
        TextView textView = this.textViewDate;
        Object[] objArr = new Object[1];
        a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(3) + 12, null, new byte[]{-120, -125, -121, -122, -123, -124, -125, -126, -127}, null, objArr);
        textView.setText(((String) objArr[0]).intern());
        TextView textView2 = this.textViewLocality;
        Object[] objArr2 = new Object[1];
        b(true, new byte[]{1, 0, 0, 1, 1, 1, 1, 1}, new int[]{0, 8, 0, 4}, objArr2);
        textView2.setText(((String) objArr2[0]).intern());
        TextView textView3 = this.textViewQRCode;
        Object[] objArr3 = new Object[1];
        a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 123, null, new byte[]{-114, -118, -115, -116, -125, -117, -118, -119}, null, objArr3);
        textView3.setText(((String) objArr3[0]).intern());
        int i2 = q + 9;
        p = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @OnClick
    public void onSearchClick(View view) {
        int i;
        AppCompatActivity appCompatActivity;
        String strIntern;
        Object obj;
        int i2 = 2 % 2;
        ArrayList<OooO00o> arrayList = new ArrayList<>();
        this.ag = arrayList;
        AdapterQrCodeDetail adapterQrCodeDetail = this.af;
        adapterQrCodeDetail.f = arrayList;
        adapterQrCodeDetail.a.c();
        this.textViewNoQR.setVisibility(8);
        this.linearLayoutQR.setVisibility(8);
        boolean z = true;
        if (this.textViewFromDate.getTag() == null) {
            AppCompatActivity appCompatActivity2 = this.ae;
            Object[] objArr = new Object[1];
            b(false, new byte[]{0, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1}, new int[]{8, 29, 153, 0}, objArr);
            Toast.makeText(appCompatActivity2, ((String) objArr[0]).intern(), 0).show();
            return;
        }
        if (this.textViewToDate.getTag() == null) {
            int i3 = p + 13;
            q = i3 % 128;
            int i4 = i3 % 2;
            AppCompatActivity appCompatActivity3 = this.ae;
            if (i4 == 0) {
                Object[] objArr2 = new Object[1];
                a(93 >>> (ViewConfiguration.getTouchSlop() % 98), null, new byte[]{-108, -124, -124, -111, -118, -117, -120, -116, -118, -122, -116, -110, -124, -122, -121, -109, -116, -118, -127, -110, -116, -122, -111, -124, -112, -124, -113}, null, objArr2);
                obj = objArr2[0];
            } else {
                Object[] objArr3 = new Object[1];
                a(127 - (ViewConfiguration.getTouchSlop() >> 8), null, new byte[]{-108, -124, -124, -111, -118, -117, -120, -116, -118, -122, -116, -110, -124, -122, -121, -109, -116, -118, -127, -110, -116, -122, -111, -124, -112, -124, -113}, null, objArr3);
                obj = objArr3[0];
            }
            Toast.makeText(appCompatActivity3, ((String) obj).intern(), 0).show();
            return;
        }
        try {
            Object[] objArr4 = new Object[1];
            a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(3) + 12, null, new byte[]{-108, -108, -106, -105, -105, -106, -107, -107, -107, -107}, null, objArr4);
            Date date = new SimpleDateFormat(((String) objArr4[0]).intern()).parse((String) this.textViewFromDate.getTag());
            Object[] objArr5 = new Object[1];
            a(getPackageName().codePointAt(1) + 9, null, new byte[]{-108, -108, -106, -105, -105, -106, -107, -107, -107, -107}, null, objArr5);
            if (new SimpleDateFormat(((String) objArr5[0]).intern()).parse((String) this.textViewToDate.getTag()).before(date)) {
                int i5 = p + 41;
                q = i5 % 128;
                if (i5 % 2 == 0) {
                    appCompatActivity = this.ae;
                    Object[] objArr6 = new Object[1];
                    a(getPackageName().length() - 36, null, new byte[]{-118, -127, -116, -124, -122, -121, -109, -116, -101, -121, -104, -122, -116, -123, -123, -124, -112, -116, -124, -102, -116, -108, -112, -103, -118, -104, -123, -116, -125, -118, -117, -119, -116, -124, -122, -121, -109}, null, objArr6);
                    strIntern = ((String) objArr6[0]).intern();
                } else {
                    appCompatActivity = this.ae;
                    Object[] objArr7 = new Object[1];
                    a(getPackageName().length() + 102, null, new byte[]{-118, -127, -116, -124, -122, -121, -109, -116, -101, -121, -104, -122, -116, -123, -123, -124, -112, -116, -124, -102, -116, -108, -112, -103, -118, -104, -123, -116, -125, -118, -117, -119, -116, -124, -122, -121, -109}, null, objArr7);
                    strIntern = ((String) objArr7[0]).intern();
                }
                Toast.makeText(appCompatActivity, strIntern, 0).show();
                return;
            }
        } catch (ParseException unused) {
        }
        String str = (String) this.textViewFromDate.getTag();
        String str2 = (String) this.textViewToDate.getTag();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(str);
        arrayList2.add(str2);
        int i6 = this.ac;
        if (i6 == 1) {
            arrayList2.add("0");
            int i7 = q + 33;
            p = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 5 / 3;
            }
        } else if (i6 == 0) {
            arrayList2.add("1");
        } else {
            arrayList2.add("5");
            int i9 = q + 55;
            p = i9 % 128;
            int i10 = i9 % 2;
        }
        String[] strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
        ArrayList arrayList3 = new ArrayList();
        Object[] objArr8 = new Object[1];
        a(getApplicationInfo().targetSdkVersion + 96, null, new byte[]{-99, -127, -100, -109}, null, objArr8);
        arrayList3.add(((String) objArr8[0]).intern());
        Object[] objArr9 = new Object[1];
        a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 123, null, new byte[]{-109, -97, -94, -99, -95, -100, -96, -96, -97, -98}, null, objArr9);
        arrayList3.add(((String) objArr9[0]).intern());
        Object[] objArr10 = new Object[1];
        b(false, new byte[]{1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0}, new int[]{37, 12, 0, 8}, objArr10);
        arrayList3.add(((String) objArr10[0]).intern());
        Object[] objArr11 = new Object[1];
        b(true, new byte[]{1, 1, 1, 0, 1, 1, 1}, new int[]{49, 7, 0, 7}, objArr11);
        arrayList3.add(((String) objArr11[0]).intern());
        Object[] objArr12 = new Object[1];
        a(128 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), null, new byte[]{-99, -105, -97, -127}, null, objArr12);
        arrayList3.add(((String) objArr12[0]).intern());
        String[] strArr2 = (String[]) arrayList3.toArray(new String[arrayList3.size()]);
        this.ag = new ArrayList<>();
        Object[] objArr13 = new Object[1];
        b(true, null, new int[]{56, 30, 106, 4}, objArr13);
        String strIntern2 = ((String) objArr13[0]).intern();
        Object[] objArr14 = new Object[1];
        a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 123, null, new byte[]{-109, -97, -94, -99, -95, -100, -96, -96, -97, -98, -93, -99, -127, -100, -109}, null, objArr14);
        Cursor cursor = SugarRecord.getCursor(SurveyInfo.class, strArr2, strIntern2, strArr, null, ((String) objArr14[0]).intern(), null);
        if (cursor != null && cursor.getCount() > 0 && cursor.moveToFirst()) {
            do {
                this.ag.add(new OooO00o(cursor.getString(0), cursor.getInt(1), cursor.getString(2), cursor.getString(3), cursor.getString(4)));
            } while (cursor.moveToNext());
        }
        cursor.close();
        AdapterQrCodeDetail adapterQrCodeDetail2 = this.af;
        adapterQrCodeDetail2.f = this.ag;
        adapterQrCodeDetail2.a.c();
        if (this.ag.size() > 0) {
            int i11 = p + 61;
            q = i11 % 128;
            int i12 = i11 % 2;
        } else {
            int i13 = p + 101;
            q = i13 % 128;
            int i14 = i13 % 2;
            z = false;
        }
        TextView textView = this.textViewNoQR;
        if (z) {
            int i15 = p + 35;
            q = i15 % 128;
            i = i15 % 2 == 0 ? 7 : 8;
        } else {
            i = 0;
        }
        textView.setVisibility(i);
        this.linearLayoutQR.setVisibility(z ? 0 : 8);
    }

    private static void a(int i, char[] cArr, byte[] bArr, int[] iArr, Object[] objArr) {
        int length;
        char[] cArr2;
        int i2;
        int i3 = 2 % 2;
        l lVar = new l();
        char[] cArr3 = b$s64$714;
        if (cArr3 != null) {
            int i4 = $11 + 57;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
                i2 = 1;
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
                i2 = 0;
            }
            while (i2 < length) {
                cArr2[i2] = (char) (((long) cArr3[i2]) ^ 1962356595541487140L);
                i2++;
            }
            cArr3 = cArr2;
        }
        int i5 = (int) (1962356595541487140L ^ ((long) c$s65$714));
        if (e$s68$714) {
            lVar.d = bArr.length;
            char[] cArr4 = new char[lVar.d];
            lVar.a = 0;
            while (lVar.a < lVar.d) {
                cArr4[lVar.a] = (char) (cArr3[bArr[(lVar.d - 1) - lVar.a] + i] - i5);
                lVar.a++;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (a$s67$714) {
            lVar.d = cArr.length;
            char[] cArr5 = new char[lVar.d];
            lVar.a = 0;
            while (lVar.a < lVar.d) {
                cArr5[lVar.a] = (char) (cArr3[cArr[(lVar.d - 1) - lVar.a] - i] - i5);
                lVar.a++;
                int i6 = $10 + 45;
                $11 = i6 % 128;
                int i7 = i6 % 2;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        lVar.d = iArr.length;
        char[] cArr6 = new char[lVar.d];
        lVar.a = 0;
        while (lVar.a < lVar.d) {
            int i8 = $10 + 45;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            cArr6[lVar.a] = (char) (cArr3[iArr[(lVar.d - 1) - lVar.a] - i] - i5);
            lVar.a++;
        }
        objArr[0] = new String(cArr6);
    }

    private static void b(boolean z, byte[] bArr, int[] iArr, Object[] objArr) {
        int length;
        char[] cArr;
        int i = 2 % 2;
        i iVar = new i();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr2 = a$s17$815;
        if (cArr2 != null) {
            int i6 = $10 + 87;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
            } else {
                length = cArr2.length;
                cArr = new char[length];
            }
            for (int i7 = 0; i7 < length; i7++) {
                cArr[i7] = (char) (((long) cArr2[i7]) ^ 2843778254771240638L);
            }
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr2, i2, cArr3, 0, i3);
        if (bArr != null) {
            int i8 = $11 + 33;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            char[] cArr4 = new char[i3];
            iVar.b = 0;
            char c = 0;
            while (iVar.b < i3) {
                int i10 = $10 + 65;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                if (bArr[iVar.b] == 1) {
                    int i12 = $11 + 27;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    cArr4[iVar.b] = (char) (((cArr3[iVar.b] * 2) + 1) - c);
                } else {
                    cArr4[iVar.b] = (char) ((cArr3[iVar.b] * 2) - c);
                }
                c = cArr4[iVar.b];
                iVar.b++;
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            int i14 = $10 + 93;
            $11 = i14 % 128;
            int i15 = i14 % 2;
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i16 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i16, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i16);
        }
        if (z) {
            int i17 = $11 + 117;
            $10 = i17 % 128;
            int i18 = i17 % 2;
            char[] cArr6 = new char[i3];
            iVar.b = 0;
            while (iVar.b < i3) {
                cArr6[iVar.b] = cArr3[(i3 - iVar.b) - 1];
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
