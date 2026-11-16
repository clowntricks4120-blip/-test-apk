package ivas.gov.bisp.enumeration.fragments;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.ButterKnife;
import ivas.gov.bisp.enumeration.ActivityBeginSurvey;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.X.e;
import ivas.gov.bisp.enumeration.bA.c;
import ivas.gov.bisp.enumeration.models.SupervisorParseObject;
import ivas.gov.bisp.enumeration.models.Survey;
import ivas.gov.bisp.enumeration.p043bp.C0201c;
import ivas.gov.bisp.enumeration.p043bp.h;
import net.sqlcipher.BuildConfig;
import o.m;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"DefaultLocale"})
public class FragmentDeskbasedSurvey extends Fragment implements e {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int c = 1;
    private static int d = 0;
    private static long d$s51$1512 = -566235760627671041L;

    @BindView
    public Button btn_qr_code;

    @BindView
    public EditText editTextPreviousFormNo;

    @BindView
    public LinearLayout linearLayoutLost;

    @BindView
    public LinearLayout linearLayoutQR;
    private View parentView = null;

    @BindView
    public RadioButton radioButtonDeskBasedNo;

    @BindView
    public RadioButton radioButtonDeskBasedYes;

    @BindView
    public RadioButton radioButtonReceiptNo;

    @BindView
    public RadioButton radioButtonReceiptYes;

    @BindView
    public RadioGroup radioGroupDeskBased;

    @BindView
    public RadioGroup radioGroupReceipt;

    public static /* synthetic */ void c(FragmentDeskbasedSurvey fragmentDeskbasedSurvey, RadioGroup radioGroup, int i) {
        int i2 = 2 % 2;
        int i3 = d + 65;
        c = i3 % 128;
        int i4 = i3 % 2;
        fragmentDeskbasedSurvey.lambda$generateBody$2(radioGroup, i);
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = c + 125;
        d = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ void d(FragmentDeskbasedSurvey fragmentDeskbasedSurvey, RadioGroup radioGroup, int i) {
        int i2 = 2 % 2;
        int i3 = c + 91;
        d = i3 % 128;
        int i4 = i3 % 2;
        fragmentDeskbasedSurvey.lambda$generateBody$1(radioGroup, i);
        int i5 = c + 115;
        d = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void e(View view) {
        int i = 2 % 2;
        int i2 = d + 123;
        c = i2 % 128;
        int i3 = i2 % 2;
        lambda$generateBody$0(view);
        if (i3 == 0) {
            int i4 = 21 / 0;
        }
        int i5 = c + 113;
        d = i5 % 128;
        int i6 = i5 % 2;
    }

    private void generateBody() {
        int i = 2 % 2;
        this.btn_qr_code.setOnClickListener(c.c);
        this.radioGroupDeskBased.setOnCheckedChangeListener(new C0201c(this, 1));
        this.radioGroupReceipt.setOnCheckedChangeListener(new h(this, 2));
        int i2 = d + 15;
        c = i2 % 128;
        int i3 = i2 % 2;
    }

    private static /* synthetic */ void lambda$generateBody$0(View view) {
        int i = 2 % 2;
        int i2 = c + 17;
        d = i2 % 128;
        int i3 = i2 % 2;
    }

    private /* synthetic */ void lambda$generateBody$2(RadioGroup radioGroup, int i) {
        int i2 = 2 % 2;
        if (i != this.radioButtonReceiptYes.getId()) {
            this.linearLayoutQR.setVisibility(8);
            int i3 = d + 101;
            c = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 11 / 0;
                return;
            }
            return;
        }
        int i5 = d + 33;
        c = i5 % 128;
        int i6 = i5 % 2;
        LinearLayout linearLayout = this.linearLayoutQR;
        if (i6 == 0) {
            linearLayout.setVisibility(1);
        } else {
            linearLayout.setVisibility(0);
        }
    }

    private void setDummyData() {
        int i = 2 % 2;
        int i2 = c + 101;
        d = i2 % 128;
        int i3 = i2 % 2;
        this.radioButtonDeskBasedYes.setChecked(true);
        this.radioButtonReceiptYes.setChecked(true);
        EditText editText = this.editTextPreviousFormNo;
        Object[] objArr = new Object[1];
        a(3989 - Color.red(0), new char[]{37226, 40700, 36418, 49109, 44861, 56449, 52244, 64634, 60864}, objArr);
        editText.setText(((String) objArr[0]).intern());
        int i4 = d + 121;
        c = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = 2 % 2;
        int i4 = c;
        int i5 = i4 + 29;
        d = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 56 / 0;
            if (i2 == -1) {
                return;
            }
        } else if (i2 == -1) {
            return;
        }
        int i7 = i4 + 95;
        d = i7 % 128;
        int i8 = i7 % 2;
        super.onActivityResult(i, i2, intent);
        int i9 = d + 45;
        c = i9 % 128;
        int i10 = i9 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.X.e
    public SupervisorParseObject parseJsonForSupervisor() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 25;
        c = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 63;
        c = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private /* synthetic */ void lambda$generateBody$1(RadioGroup radioGroup, int i) {
        int i2 = 2 % 2;
        int i3 = d + 23;
        c = i3 % 128;
        int i4 = i3 % 2;
        if (i == this.radioButtonDeskBasedYes.getId()) {
            this.linearLayoutLost.setVisibility(0);
            return;
        }
        this.radioGroupReceipt.clearCheck();
        this.linearLayoutLost.setVisibility(8);
        int i5 = c + 61;
        d = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.X.e
    public boolean isValid() {
        int i = 2 % 2;
        int i2 = c + 99;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            this.radioGroupDeskBased.getCheckedRadioButtonId();
            throw null;
        }
        if (this.radioGroupDeskBased.getCheckedRadioButtonId() == -1) {
            Activity activity = getActivity();
            Object[] objArr = new Object[1];
            a(42943 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), new char[]{37131, 13960, 56896, 26119, 4052, 55173, 32513, 1809, 44230, 29824, 7240, 41997, 19931, 5576, 48461, 17679, 60120, 45727, 23061, 57876, 35798, 21379, 64340, 33558, 10387, 61583, 38984, 8204, 51657, 37277, 14656, 49498, 26312, 3760, 54884, 32306, 2034, 44979}, objArr);
            Toast.makeText(activity, ((String) objArr[0]).intern(), 0).show();
            return false;
        }
        if (this.radioGroupDeskBased.getCheckedRadioButtonId() == this.radioButtonDeskBasedYes.getId()) {
            if (this.radioGroupReceipt.getCheckedRadioButtonId() == -1) {
                int i3 = d + 95;
                c = i3 % 128;
                int i4 = i3 % 2;
                Activity activity2 = getActivity();
                Object[] objArr2 = new Object[1];
                a((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 982, new char[]{37131, 37600, 38544, 39615, 40564, 33293, 34417, 35785, 36742, 46008, 46936, 47877, 48955, 41104, 42219, 43175, 44104, 53369, 54316, 55774, 56803, 49624, 50514, 51582, 52498, 52944, 62200, 63109}, objArr2);
                Toast.makeText(activity2, ((String) objArr2[0]).intern(), 0).show();
                return false;
            }
            if (this.radioGroupReceipt.getCheckedRadioButtonId() == this.radioButtonReceiptYes.getId()) {
                int i5 = c + 1;
                d = i5 % 128;
                int i6 = i5 % 2;
                if (ivas.gov.bisp.enumeration.p091n.j.E(this.editTextPreviousFormNo, BuildConfig.FLAVOR)) {
                    Activity activity3 = getActivity();
                    Object[] objArr3 = new Object[1];
                    a(((Process.getThreadPriority(0) + 20) >> 6) + 41681, new char[]{37131, 13286, 54428, 31049, 6764, 48939, 16797, 58015, 34736, 10339, 52511, 28544, 12529, 54697, 30279, 6921, 48235, 24276, 58268, 33973, 10605, 51739, 27871}, objArr3);
                    Toast.makeText(activity3, ((String) objArr3[0]).intern(), 0).show();
                    return false;
                }
            }
        }
        int i7 = c + 19;
        d = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 2 % 2;
        int i2 = c;
        int i3 = i2 + 101;
        d = i3 % 128;
        int i4 = i3 % 2;
        try {
            if (this.parentView == null) {
                int i5 = i2 + 91;
                d = i5 % 128;
                int i6 = i5 % 2;
                View viewInflate = layoutInflater.inflate(R.layout.fragment_deskbased_survey, viewGroup, false);
                this.parentView = viewInflate;
                ButterKnife.c(this, viewInflate);
                generateBody();
                int i7 = d + 45;
                c = i7 % 128;
                int i8 = i7 % 2;
            }
        } catch (Exception unused) {
        }
        View view = this.parentView;
        int i9 = c + 47;
        d = i9 % 128;
        int i10 = i9 % 2;
        return view;
    }

    @Override // ivas.gov.bisp.enumeration.X.e
    public void parseJson() {
        Survey survey;
        Object obj;
        int i = 2 % 2;
        int i2 = d + 111;
        c = i2 % 128;
        int i3 = i2 % 2;
        if (this.radioButtonDeskBasedNo.isChecked()) {
            Survey survey2 = ((ActivityBeginSurvey) getActivity()).aG;
            Object[] objArr = new Object[1];
            a(TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0) + 21163, new char[]{37141, 50079, 13433, 27002, 56222, 3170, 24877, 54163, 1137, 31022, 43932, 7271, 28968, 41873, 5221}, objArr);
            survey2.previousQR = ((String) objArr[0]).intern();
            int i4 = c + 47;
            d = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            return;
        }
        if (!this.radioButtonReceiptNo.isChecked()) {
            ((ActivityBeginSurvey) getActivity()).aG.previousQR = ivas.gov.bisp.enumeration.p091n.j.m(this.editTextPreviousFormNo);
            return;
        }
        int i5 = c + 93;
        d = i5 % 128;
        if (i5 % 2 != 0) {
            survey = ((ActivityBeginSurvey) getActivity()).aG;
            Object[] objArr2 = new Object[1];
            a((SystemClock.elapsedRealtime() > 1L ? 1 : (SystemClock.elapsedRealtime() == 1L ? 0 : -1)) * 19188, new char[]{37138, 59800, 24693, 64313, 29597, 51788, 17724, 56709, 21572, 44843, 10237, 48660, 14629, 45543, 2137, 33624, 7143, 37449, 60674, 26104, 64767, 30488, 53216, 18099, 49414, 22999, 53433, 11024}, objArr2);
            obj = objArr2[0];
        } else {
            survey = ((ActivityBeginSurvey) getActivity()).aG;
            Object[] objArr3 = new Object[1];
            a(30894 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), new char[]{37138, 59800, 24693, 64313, 29597, 51788, 17724, 56709, 21572, 44843, 10237, 48660, 14629, 45543, 2137, 33624, 7143, 37449, 60674, 26104, 64767, 30488, 53216, 18099, 49414, 22999, 53433, 11024}, objArr3);
            obj = objArr3[0];
        }
        survey.previousQR = ((String) obj).intern();
    }

    private static void a(int i, char[] cArr, Object[] objArr) {
        int i2;
        int i3 = 2 % 2;
        m mVar = new m();
        mVar.d = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        mVar.e = 0;
        while (mVar.e < cArr.length) {
            int i4 = $10 + 85;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            jArr[mVar.e] = (((long) cArr[mVar.e]) ^ (((long) mVar.e) * ((long) mVar.d))) ^ (d$s51$1512 ^ 6031393033645231780L);
            mVar.e++;
        }
        char[] cArr2 = new char[length];
        mVar.e = 0;
        int i6 = $10 + 9;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        while (mVar.e < cArr.length) {
            int i8 = $10 + 37;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                cArr2[mVar.e] = (char) jArr[mVar.e];
                i2 = mVar.e << 1;
            } else {
                cArr2[mVar.e] = (char) jArr[mVar.e];
                i2 = mVar.e + 1;
            }
            mVar.e = i2;
        }
        objArr[0] = new String(cArr2);
    }
}
