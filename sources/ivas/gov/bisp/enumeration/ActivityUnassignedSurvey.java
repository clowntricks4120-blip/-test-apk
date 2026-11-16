package ivas.gov.bisp.enumeration;

import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.orm.SugarRecord;
import ivas.gov.bisp.enumeration.models.Batch;
import ivas.gov.bisp.enumeration.models.Survey;
import ivas.gov.bisp.enumeration.p043bp.B;
import ivas.gov.bisp.enumeration.p044bq.ac;
import ivas.gov.bisp.enumeration.p044bq.k;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import o.d;

/* JADX INFO: loaded from: classes.dex */
public class ActivityUnassignedSurvey extends BaseActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int[] c$s11$56 = {608815778, -1559298162, 472249932, 113547137, 984701361, 1230223345, -1582615308, 87383150, -1213343626, -1104868487, -2035391634, 33137443, 904180179, -2053370522, -729354719, -291137846, 1791372046, -755263651};
    private static int p = 1;
    private static int q;
    public List<Survey> af;
    public int ag = 0;

    @BindView
    public Button btnRecover;

    @BindView
    public ProgressBar progressBarTotal;

    @BindView
    public TextView textViewTotal;

    public interface OooO0O0 {
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public int p() {
        int i = 2 % 2;
        int i2 = p;
        int i3 = i2 + 19;
        q = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 0 / 0;
        }
        int i5 = i2 + 87;
        q = i5 % 128;
        if (i5 % 2 == 0) {
            return R.layout.activity_unassigned_survey;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024 A[PHI: r5
  0x0024: PHI (r5v6 java.util.List<ivas.gov.bisp.enumeration.models.Survey>) = 
  (r5v5 java.util.List<ivas.gov.bisp.enumeration.models.Survey>)
  (r5v21 java.util.List<ivas.gov.bisp.enumeration.models.Survey>)
 binds: [B:10:0x0022, B:7:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:13:0x002a  */
    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth, android.view.View.OnClickListener
    public void onClick(View view) {
        List<Survey> list;
        int i = 2 % 2;
        if (view.getId() == R.id.btn_recover) {
            int i2 = p + 97;
            q = i2 % 128;
            if (i2 % 2 != 0) {
                list = this.af;
                int i3 = 9 / 0;
                if (list != null) {
                    if (list.size() > 0) {
                        new ac(this, this.af, new OooO00o()).execute(new Void[0]);
                        int i4 = q + 3;
                        p = i4 % 128;
                        int i5 = i4 % 2;
                        return;
                    }
                }
            } else {
                list = this.af;
                if (list != null) {
                    if (list.size() > 0) {
                        new ac(this, this.af, new OooO00o()).execute(new Void[0]);
                        int i6 = q + 3;
                        p = i6 % 128;
                        int i7 = i6 % 2;
                        return;
                    }
                }
            }
            Object[] objArr = new Object[1];
            a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 17, new int[]{-934262906, 807213338, -431262731, -1256118529, 1809789646, -219998617, 225308133, -7945891, -355461211, 2031697921, 1563187179, 2076984587}, objArr);
            Toast.makeText(this, ((String) objArr[0]).intern(), 0).show();
        }
    }

    public class OooO00o implements OooO0O0 {
        private static int a = 0;
        private static int b = 1;

        public OooO00o() {
        }

        public void c() {
            int i = 2 % 2;
            ActivityUnassignedSurvey activityUnassignedSurvey = ActivityUnassignedSurvey.this;
            ArrayList arrayList = new ArrayList();
            int i2 = a;
            int i3 = ((i2 & (-12)) | ((~i2) & 11)) + ((i2 & 11) << 1);
            b = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                activityUnassignedSurvey.af = arrayList;
                TextView textView = ActivityUnassignedSurvey.this.textViewTotal;
                throw null;
            }
            activityUnassignedSurvey.af = arrayList;
            TextView textView2 = ActivityUnassignedSurvey.this.textViewTotal;
            StringBuilder sb = new StringBuilder();
            List<Survey> list = ActivityUnassignedSurvey.this.af;
            int i4 = b + 10;
            int i5 = (i4 ^ (-1)) + (i4 << 1);
            a = i5 % 128;
            int i6 = i5 % 2;
            sb.append(list.size());
            int i7 = b;
            int i8 = (i7 & 123) + (i7 | 123);
            a = i8 % 128;
            if (i8 % 2 != 0) {
                textView2.setText(sb.toString());
                obj.hashCode();
                throw null;
            }
            textView2.setText(sb.toString());
            ActivityUnassignedSurvey activityUnassignedSurvey2 = ActivityUnassignedSurvey.this;
            int i9 = a;
            int i10 = i9 & 39;
            int i11 = i10 + ((i9 ^ 39) | i10);
            b = i11 % 128;
            if (i11 % 2 == 0) {
                Toast.makeText(activityUnassignedSurvey2, "Recovered successfully!", 0).show();
            } else {
                Toast.makeText(activityUnassignedSurvey2, "Recovered successfully!", 0).show();
            }
        }
    }

    @Override // ivas.gov.bisp.enumeration.BaseActivity, ivas.gov.bisp.enumeration.activitybase.BaseTouch, ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public void t() {
        int i = 2 % 2;
        super.t();
        Map<Class<?>, Constructor<? extends Unbinder>> map = ButterKnife.a;
        ButterKnife.c(this, getWindow().getDecorView());
        this.btnRecover.setOnClickListener(this);
        new k(this, new B(this)).execute(new Void[0]);
        Object[] objArr = new Object[1];
        a((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 8, new int[]{-452912728, -806597044, -955966557, 1035141305, 841113809, 1732997502}, objArr);
        String[] strArr = {((String) objArr[0]).intern()};
        Object[] objArr2 = new Object[1];
        a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) - 35, new int[]{603827634, 828438108, 767706857, 1130411422, 359441389, 1486756259, -1968469704, -331931332}, objArr2);
        SugarRecord.deleteAll(Batch.class, ((String) objArr2[0]).intern(), strArr);
        int i2 = p + 113;
        q = i2 % 128;
        int i3 = i2 % 2;
    }

    private static void a(int i, int[] iArr, Object[] objArr) {
        int i2 = 2 % 2;
        d dVar = new d();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = c$s11$56;
        if (iArr2 != null) {
            int i3 = $11 + 109;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i5 = 0;
            while (i5 < length) {
                int i6 = $10 + 57;
                $11 = i6 % 128;
                if (i6 % 2 == 0) {
                    iArr3[i5] = (int) (((long) iArr2[i5]) - 2705551458099060901L);
                    i5 >>= 1;
                } else {
                    iArr3[i5] = (int) (((long) iArr2[i5]) ^ (-2705551458099060901L));
                    i5++;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = c$s11$56;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i7 = 0;
            while (i7 < length3) {
                int i8 = $10 + 31;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    iArr6[i7] = (int) (((long) iArr5[i7]) * (-2705551458099060901L));
                } else {
                    iArr6[i7] = (int) (((long) iArr5[i7]) ^ (-2705551458099060901L));
                    i7++;
                }
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        dVar.a = 0;
        int i9 = $10 + 41;
        $11 = i9 % 128;
        while (true) {
            int i10 = i9 % 2;
            if (dVar.a >= iArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            cArr[0] = (char) (iArr[dVar.a] >> 16);
            cArr[1] = (char) iArr[dVar.a];
            cArr[2] = (char) (iArr[dVar.a + 1] >> 16);
            cArr[3] = (char) iArr[dVar.a + 1];
            dVar.e = (cArr[0] << 16) + cArr[1];
            dVar.d = (cArr[2] << 16) + cArr[3];
            d.b(iArr4);
            for (int i11 = 0; i11 < 16; i11++) {
                dVar.e ^= iArr4[i11];
                dVar.d = d.c(dVar.e) ^ dVar.d;
                int i12 = dVar.e;
                dVar.e = dVar.d;
                dVar.d = i12;
            }
            int i13 = dVar.e;
            dVar.e = dVar.d;
            dVar.d = i13;
            dVar.d ^= iArr4[16];
            dVar.e ^= iArr4[17];
            int i14 = dVar.e;
            int i15 = dVar.d;
            cArr[0] = (char) (dVar.e >>> 16);
            cArr[1] = (char) dVar.e;
            cArr[2] = (char) (dVar.d >>> 16);
            cArr[3] = (char) dVar.d;
            d.b(iArr4);
            cArr2[dVar.a * 2] = cArr[0];
            cArr2[(dVar.a * 2) + 1] = cArr[1];
            cArr2[(dVar.a * 2) + 2] = cArr[2];
            cArr2[(dVar.a * 2) + 3] = cArr[3];
            dVar.a += 2;
            i9 = $11 + 51;
            $10 = i9 % 128;
        }
    }
}
