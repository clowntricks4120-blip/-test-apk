package ivas.gov.bisp.enumeration.fragments;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.ButterKnife;
import ivas.gov.bisp.enumeration.ActivityBeginSurvey;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.X.e;
import ivas.gov.bisp.enumeration.models.SupervisorParseObject;
import ivas.gov.bisp.enumeration.models.Survey;
import net.sqlcipher.BuildConfig;
import o.i;

/* JADX INFO: loaded from: classes.dex */
public class FragmentFormType extends Fragment implements e {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] a$s17$812 = {48870, 48651, 48641, 48767, 48683, 48687, 48644, 48645, 48651, 48688, 48683, 48648, 48657, 48653, 48653, 48665, 48698, 48691, 48649, 48651, 48656, 48653, 48663, 48773, 48850, 48863, 48856, 48850, 48888, 48772, 48856, 48842, 48852, 48868, 48864, 48854, 48861, 48852, 48850, 48892, 48775, 48866, 48854, 48854, 48858, 48853, 48884, 48775, 48862, 48848, 48868, 48661, 48662, 48657, 48657, 48661, 48658, 48661, 48775, 48846, 48848, 48845, 48850, 48863, 48856, 48850};
    private static int c = 0;
    private static int d = 1;
    private ActivityBeginSurvey activityBeginSurvey;

    @BindView
    public LinearLayout linearLayoutSnowballType;
    private View parentView = null;

    @BindView
    public RadioButton radioButtonFresh;

    @BindView
    public RadioButton radioButtonLeft;

    @BindView
    public RadioButton radioButtonMonitoring;

    @BindView
    public RadioButton radioButtonNearest;

    @BindView
    public RadioButton radioButtonRight;

    @BindView
    public RadioButton radioButtonSampling;

    @BindView
    public RadioGroup radioGroupOptions;

    @BindView
    public RadioGroup radioGroupType;

    private void setCheckListener() {
        int i = 2 % 2;
        this.radioGroupType.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentFormType.1
            private static int a = 1;
            private static int b;

            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public void onCheckedChanged(RadioGroup radioGroup, int i2) {
                int checkedRadioButtonId;
                RadioButton radioButton;
                LinearLayout linearLayout;
                int i3;
                int i4 = 2 % 2;
                int i5 = b;
                int i6 = i5 & 83;
                int i7 = (i5 ^ 83) | i6;
                int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
                a = i8 % 128;
                if (i8 % 2 == 0) {
                    checkedRadioButtonId = radioGroup.getCheckedRadioButtonId();
                    radioButton = FragmentFormType.this.radioButtonSampling;
                    int i9 = 19 / 0;
                } else {
                    checkedRadioButtonId = radioGroup.getCheckedRadioButtonId();
                    radioButton = FragmentFormType.this.radioButtonSampling;
                }
                if (checkedRadioButtonId == radioButton.getId()) {
                    int i10 = b + 17;
                    a = i10 % 128;
                    if (i10 % 2 == 0) {
                        linearLayout = FragmentFormType.this.linearLayoutSnowballType;
                        i3 = 56;
                    } else {
                        linearLayout = FragmentFormType.this.linearLayoutSnowballType;
                        i3 = 8;
                    }
                    linearLayout.setVisibility(i3);
                    int i11 = b;
                    int i12 = (((i11 & (-14)) | ((~i11) & 13)) - (~((i11 & 13) << 1))) - 1;
                    a = i12 % 128;
                    int i13 = i12 % 2;
                    return;
                }
                if (radioGroup.getCheckedRadioButtonId() == FragmentFormType.this.radioButtonMonitoring.getId()) {
                    int i14 = b;
                    int i15 = i14 & 95;
                    int i16 = (i14 ^ 95) | i15;
                    int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
                    a = i17 % 128;
                    int i18 = i17 % 2;
                    LinearLayout linearLayout2 = FragmentFormType.this.linearLayoutSnowballType;
                    if (i18 == 0) {
                        linearLayout2.setVisibility(1);
                    } else {
                        linearLayout2.setVisibility(0);
                    }
                    int i19 = a;
                    int i20 = ((i19 ^ 5) | (i19 & 5)) << 1;
                    int i21 = -(((~i19) & 5) | (i19 & (-6)));
                    int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
                    b = i22 % 128;
                    int i23 = i22 % 2;
                }
                int i24 = b + 33;
                a = i24 % 128;
                if (i24 % 2 == 0) {
                    throw null;
                }
            }
        });
        int i2 = c + 1;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 58 / 0;
        }
    }

    @Override // android.app.Fragment
    public void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = d + 71;
        c = i2 % 128;
        int i3 = i2 % 2;
        super.onAttach(context);
        int i4 = d + 107;
        c = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001d  */
    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 2 % 2;
        int i2 = c + 9;
        int i3 = i2 % 128;
        d = i3;
        try {
            if (i2 % 2 == 0) {
                int i4 = 50 / 0;
                if (this.parentView == null) {
                    int i5 = i3 + 5;
                    c = i5 % 128;
                    int i6 = i5 % 2;
                    View viewInflate = layoutInflater.inflate(R.layout.fragment_form_type, viewGroup, false);
                    this.parentView = viewInflate;
                    ButterKnife.c(this, viewInflate);
                    this.activityBeginSurvey = (ActivityBeginSurvey) getActivity();
                    setCheckListener();
                }
            } else if (this.parentView == null) {
                int i7 = i3 + 5;
                c = i7 % 128;
                int i8 = i7 % 2;
                View viewInflate2 = layoutInflater.inflate(R.layout.fragment_form_type, viewGroup, false);
                this.parentView = viewInflate2;
                ButterKnife.c(this, viewInflate2);
                this.activityBeginSurvey = (ActivityBeginSurvey) getActivity();
                setCheckListener();
            }
        } catch (Exception unused) {
        }
        return this.parentView;
    }

    @Override // ivas.gov.bisp.enumeration.X.e
    public SupervisorParseObject parseJsonForSupervisor() {
        int i = 2 % 2;
        int i2 = c + 33;
        int i3 = i2 % 128;
        d = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = i3 + 95;
        c = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 6 / 0;
        }
        return null;
    }

    @Override // ivas.gov.bisp.enumeration.X.e
    public boolean isValid() {
        int i = 2 % 2;
        if (this.radioGroupType.getCheckedRadioButtonId() == -1) {
            int i2 = c + 79;
            d = i2 % 128;
            if (i2 % 2 == 0) {
                Activity activity = getActivity();
                Object[] objArr = new Object[1];
                a(true, new byte[]{0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 0, 1, 0}, new int[]{0, 23, 75, 0}, objArr);
                Toast.makeText(activity, ((String) objArr[0]).intern(), 1).show();
                return true;
            }
            Activity activity2 = getActivity();
            Object[] objArr2 = new Object[1];
            a(true, new byte[]{0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 0, 1, 0}, new int[]{0, 23, 75, 0}, objArr2);
            Toast.makeText(activity2, ((String) objArr2[0]).intern(), 1).show();
            return false;
        }
        if (this.linearLayoutSnowballType.getVisibility() == 0 && this.radioGroupOptions.getCheckedRadioButtonId() == -1) {
            Activity activity3 = getActivity();
            Object[] objArr3 = new Object[1];
            a(false, new byte[]{1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 1}, new int[]{23, 27, 0, 10}, objArr3);
            Toast.makeText(activity3, ((String) objArr3[0]).intern(), 1).show();
            return false;
        }
        if (this.linearLayoutSnowballType.getVisibility() == 0) {
            int i3 = c + 29;
            d = i3 % 128;
            if (i3 % 2 == 0) {
                this.radioGroupOptions.getCheckedRadioButtonId();
                this.radioButtonLeft.getId();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (this.radioGroupOptions.getCheckedRadioButtonId() == this.radioButtonLeft.getId()) {
                this.activityBeginSurvey.aG.snowball_type = 1;
            } else if (this.radioGroupOptions.getCheckedRadioButtonId() == this.radioButtonRight.getId()) {
                int i4 = d + 37;
                c = i4 % 128;
                int i5 = i4 % 2;
                this.activityBeginSurvey.aG.snowball_type = 2;
            } else if (this.radioGroupOptions.getCheckedRadioButtonId() == this.radioButtonNearest.getId()) {
                this.activityBeginSurvey.aG.snowball_type = 3;
            } else if (this.radioGroupOptions.getCheckedRadioButtonId() == this.radioButtonFresh.getId()) {
                this.activityBeginSurvey.aG.snowball_type = 4;
            } else {
                this.activityBeginSurvey.aG.snowball_type = -1;
            }
        } else {
            this.activityBeginSurvey.aG.snowball_type = -1;
        }
        return true;
    }

    @Override // ivas.gov.bisp.enumeration.X.e
    public void parseJson() {
        int i = 2 % 2;
        if (this.radioGroupType.getCheckedRadioButtonId() == this.radioButtonSampling.getId()) {
            int i2 = c + 1;
            d = i2 % 128;
            int i3 = i2 % 2;
            Survey survey = this.activityBeginSurvey.aG;
            Object[] objArr = new Object[1];
            a(false, new byte[]{0, 0, 0, 1, 0, 1, 1, 1}, new int[]{50, 8, 65, 0}, objArr);
            survey.survey_type = ((String) objArr[0]).intern();
        } else if (this.radioGroupType.getCheckedRadioButtonId() == this.radioButtonMonitoring.getId()) {
            Survey survey2 = this.activityBeginSurvey.aG;
            Object[] objArr2 = new Object[1];
            a(false, new byte[]{1, 1, 1, 0, 1, 1, 1, 0}, new int[]{58, 8, 0, 0}, objArr2);
            survey2.survey_type = ((String) objArr2[0]).intern();
        } else {
            this.activityBeginSurvey.aG.survey_type = BuildConfig.FLAVOR;
        }
        if (this.linearLayoutSnowballType.getVisibility() != 0) {
            this.activityBeginSurvey.aG.snowball_type = -1;
            return;
        }
        if (this.radioGroupOptions.getCheckedRadioButtonId() == this.radioButtonLeft.getId()) {
            this.activityBeginSurvey.aG.snowball_type = 1;
            return;
        }
        if (this.radioGroupOptions.getCheckedRadioButtonId() == this.radioButtonRight.getId()) {
            this.activityBeginSurvey.aG.snowball_type = 2;
            return;
        }
        if (this.radioGroupOptions.getCheckedRadioButtonId() == this.radioButtonNearest.getId()) {
            int i4 = c + 111;
            d = i4 % 128;
            int i5 = i4 % 2;
            this.activityBeginSurvey.aG.snowball_type = 3;
            return;
        }
        if (this.radioGroupOptions.getCheckedRadioButtonId() == this.radioButtonFresh.getId()) {
            int i6 = c + 75;
            d = i6 % 128;
            if (i6 % 2 == 0) {
                this.activityBeginSurvey.aG.snowball_type = 3;
                return;
            } else {
                this.activityBeginSurvey.aG.snowball_type = 4;
                return;
            }
        }
        this.activityBeginSurvey.aG.snowball_type = -1;
        int i7 = d + 9;
        c = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(boolean z, byte[] bArr, int[] iArr, Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        char c2;
        int i = 2 % 2;
        i iVar = new i();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr3 = a$s17$812;
        if (cArr3 != null) {
            int i6 = $11 + 101;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            for (int i8 = 0; i8 < length; i8++) {
                cArr4[i8] = (char) (((long) cArr3[i8]) ^ 2843778254771240638L);
            }
            int i9 = $10 + 55;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            cArr3 = cArr4;
        }
        char[] cArr5 = new char[i3];
        System.arraycopy(cArr3, i2, cArr5, 0, i3);
        if (bArr != null) {
            int i11 = $11 + 81;
            $10 = i11 % 128;
            if (i11 % 2 != 0) {
                cArr2 = new char[i3];
                iVar.b = 0;
                c2 = 1;
            } else {
                cArr2 = new char[i3];
                iVar.b = 0;
                c2 = 0;
            }
            while (iVar.b < i3) {
                if (bArr[iVar.b] == 1) {
                    int i12 = $10 + 93;
                    $11 = i12 % 128;
                    int i13 = i12 % 2;
                    cArr2[iVar.b] = (char) (((cArr5[iVar.b] * 2) + 1) - c2);
                } else {
                    cArr2[iVar.b] = (char) ((cArr5[iVar.b] * 2) - c2);
                }
                c2 = cArr2[iVar.b];
                iVar.b++;
            }
            cArr5 = cArr2;
        }
        if (i5 > 0) {
            char[] cArr6 = new char[i3];
            System.arraycopy(cArr5, 0, cArr6, 0, i3);
            int i14 = i3 - i5;
            System.arraycopy(cArr6, 0, cArr5, i14, i5);
            System.arraycopy(cArr6, i5, cArr5, 0, i14);
        }
        if (z) {
            int i15 = $11 + 119;
            $10 = i15 % 128;
            if (i15 % 2 != 0) {
                cArr = new char[i3];
                iVar.b = 1;
            } else {
                cArr = new char[i3];
                iVar.b = 0;
            }
            while (iVar.b < i3) {
                cArr[iVar.b] = cArr5[(i3 - iVar.b) - 1];
                iVar.b++;
            }
            int i16 = $11 + 109;
            $10 = i16 % 128;
            int i17 = i16 % 2;
            cArr5 = cArr;
        }
        if (i4 > 0) {
            iVar.b = 0;
            while (iVar.b < i3) {
                int i18 = $11 + 67;
                $10 = i18 % 128;
                int i19 = i18 % 2;
                cArr5[iVar.b] = (char) (cArr5[iVar.b] - iArr[2]);
                iVar.b++;
            }
        }
        objArr[0] = new String(cArr5);
    }
}
