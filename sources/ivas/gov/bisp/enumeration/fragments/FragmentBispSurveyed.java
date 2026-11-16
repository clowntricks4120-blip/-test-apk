package ivas.gov.bisp.enumeration.fragments;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.orm.SugarRecord;
import ivas.gov.bisp.enumeration.ActivityBeginSurvey;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.X.e;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import ivas.gov.bisp.enumeration.models.SupervisorParseObject;
import ivas.gov.bisp.enumeration.o000Oo00.Oooo0;
import ivas.gov.bisp.enumeration.p051bx.o;
import java.util.ArrayList;
import net.sqlcipher.BuildConfig;
import o.m;

/* JADX INFO: loaded from: classes.dex */
public class FragmentBispSurveyed extends Fragment implements e {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int c = 1;
    private static int d = 0;
    private static long d$s51$1015 = 1040210866952615900L;
    private ActivityBeginSurvey activityBeginSurvey;

    @BindView
    public LinearLayout linearLayoutBispSurveyed;

    @BindView
    public LinearLayout linearLayoutQ2;

    @BindView
    public LinearLayout linearLayoutQ3;
    private View parentView = null;

    @BindView
    public RadioButton radioButtonQuestion1Op1;

    @BindView
    public RadioButton radioButtonQuestion1Op2;

    @BindView
    public RadioButton radioButtonQuestion3Op1;

    @BindView
    public RadioButton radioButtonQuestion3Op2;

    @BindView
    public RadioGroup radioGroupQuestion1;

    @BindView
    public RadioGroup radioGroupQuestion3;
    private Oooo0<Item> reasonLetOutArrayAdapter;
    private ArrayList<Item> reasonLetOutList;

    @BindView
    public Spinner spReasonLeftOut;

    private void setCheckListener() {
        int i = 2 % 2;
        this.radioGroupQuestion1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentBispSurveyed.1
            private static int a = 0;
            private static int b = 1;

            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public void onCheckedChanged(RadioGroup radioGroup, int i2) {
                int i3 = 2 % 2;
                int i4 = a;
                int i5 = i4 | 39;
                int i6 = (i5 << 1) - ((~(i4 & 39)) & i5);
                b = i6 % 128;
                Object obj = null;
                if (i6 % 2 == 0) {
                    radioGroup.getCheckedRadioButtonId();
                    FragmentBispSurveyed.this.radioButtonQuestion1Op1.getId();
                    obj.hashCode();
                    throw null;
                }
                if (radioGroup.getCheckedRadioButtonId() == FragmentBispSurveyed.this.radioButtonQuestion1Op1.getId()) {
                    int i7 = b;
                    int i8 = (i7 ^ 43) + ((i7 & 43) << 1);
                    a = i8 % 128;
                    int i9 = i8 % 2;
                    FragmentBispSurveyed.this.linearLayoutQ3.setVisibility(0);
                    FragmentBispSurveyed fragmentBispSurveyed = FragmentBispSurveyed.this;
                    int i10 = a;
                    int i11 = (i10 & 21) + (i10 | 21);
                    b = i11 % 128;
                    int i12 = i11 % 2;
                    fragmentBispSurveyed.linearLayoutQ2.setVisibility(8);
                    int i13 = b + 1;
                    a = i13 % 128;
                    int i14 = i13 % 2;
                    return;
                }
                int checkedRadioButtonId = radioGroup.getCheckedRadioButtonId();
                RadioButton radioButton = FragmentBispSurveyed.this.radioButtonQuestion1Op2;
                int i15 = a;
                int i16 = (i15 ^ 111) + ((i15 & 111) << 1);
                b = i16 % 128;
                if (i16 % 2 == 0) {
                    radioButton.getId();
                    obj.hashCode();
                    throw null;
                }
                if (checkedRadioButtonId == radioButton.getId()) {
                    int i17 = a;
                    int i18 = (i17 ^ 13) + ((i17 & 13) << 1);
                    b = i18 % 128;
                    int i19 = i18 % 2;
                    FragmentBispSurveyed.this.linearLayoutQ2.setVisibility(0);
                    FragmentBispSurveyed.this.linearLayoutQ3.setVisibility(8);
                    int i20 = b + 113;
                    a = i20 % 128;
                    int i21 = i20 % 2;
                }
                int i22 = b;
                int i23 = ((i22 | 11) << 1) - (i22 ^ 11);
                a = i23 % 128;
                if (i23 % 2 != 0) {
                    throw null;
                }
            }
        });
        int i2 = d + 27;
        c = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // android.app.Fragment
    public void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = c + 83;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            super.onAttach(context);
        } else {
            super.onAttach(context);
            throw null;
        }
    }

    @Override // ivas.gov.bisp.enumeration.X.e
    public SupervisorParseObject parseJsonForSupervisor() {
        int i = 2 % 2;
        int i2 = d + 103;
        int i3 = i2 % 128;
        c = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = i3 + 29;
        d = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public void showBispSurveyed() {
        int i = 2 % 2;
        int i2 = d + 87;
        c = i2 % 128;
        int i3 = i2 % 2;
        if (this.activityBeginSurvey.aG.snowball_type != -1) {
            this.linearLayoutBispSurveyed.setVisibility(8);
            this.linearLayoutQ2.setVisibility(0);
            this.linearLayoutQ3.setVisibility(8);
        } else {
            this.linearLayoutBispSurveyed.setVisibility(0);
            int i4 = d + 29;
            c = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private void loadSpinners() {
        int i = 2 % 2;
        Object[] objArr = new Object[1];
        a(62969 - ((Process.getThreadPriority(0) + 20) >> 6), new char[]{47370, 19684, 21227, 22752, 28403, 29899, 31473, 217, 5855, 7373, 8861, 10431, 16059, 50306, 51861, 53402, 59034, 60551, 62111, 63610}, objArr);
        String[] strArr = {((String) objArr[0]).intern()};
        Object[] objArr2 = new Object[1];
        a(27102 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0), new char[]{47372, 53446, 27297, 33989, 7737, 43011, 49789}, objArr2);
        this.reasonLetOutList = new ArrayList<>(SugarRecord.find(Item.class, ((String) objArr2[0]).intern(), strArr));
        this.reasonLetOutArrayAdapter = new o(getActivity(), R.layout.spinner_item, this.reasonLetOutList);
        this.reasonLetOutList.add(0, new Item(getResources().getString(R.string.sp_question_2)));
        this.spReasonLeftOut.setAdapter((SpinnerAdapter) this.reasonLetOutArrayAdapter);
        int i2 = c + 27;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 37 / 0;
        }
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 2 % 2;
        int i2 = c;
        int i3 = i2 + 95;
        d = i3 % 128;
        try {
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (this.parentView == null) {
                int i4 = i2 + 69;
                d = i4 % 128;
                if (i4 % 2 != 0) {
                    View viewInflate = layoutInflater.inflate(R.layout.fragment_new_surveyed, viewGroup, true);
                    this.parentView = viewInflate;
                    ButterKnife.c(this, viewInflate);
                    this.activityBeginSurvey = (ActivityBeginSurvey) getActivity();
                } else {
                    View viewInflate2 = layoutInflater.inflate(R.layout.fragment_new_surveyed, viewGroup, false);
                    this.parentView = viewInflate2;
                    ButterKnife.c(this, viewInflate2);
                    this.activityBeginSurvey = (ActivityBeginSurvey) getActivity();
                }
                setCheckListener();
                loadSpinners();
            }
            return this.parentView;
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x011e  */
    @Override // ivas.gov.bisp.enumeration.X.e
    public boolean isValid() {
        int i = 2 % 2;
        if (this.linearLayoutBispSurveyed.getVisibility() == 0 && this.radioGroupQuestion1.getCheckedRadioButtonId() == -1) {
            Activity activity = getActivity();
            Object[] objArr = new Object[1];
            a((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 27396, new char[]{47400, 53777, 28439, 63510, 5407, 44548, 15174, 21544, 57653, 31289, 38703, 8236, 48432, 54809, 25421, 64582, 2394, 41563, 16199, 18526, 58745, 32373, 35638, 9316, 45426, 51749, 26516, 61584, 3456}, objArr);
            Toast.makeText(activity, ((String) objArr[0]).intern(), 1).show();
            return false;
        }
        if (this.radioGroupQuestion1.getCheckedRadioButtonId() == this.radioButtonQuestion1Op1.getId()) {
            if (this.radioGroupQuestion3.getCheckedRadioButtonId() == -1) {
                Activity activity2 = getActivity();
                Object[] objArr2 = new Object[1];
                a(55763 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0), new char[]{47400, 24775, 2747, 13408, 56903, 63490, 41898, 19918, 30597, 4479, 15139, 58634, 36072, 46831, 20627, 31297, 9278, 52766, 59868, 37797, 48493, 26436, 319, 10464, 53973, 64653, 42594, 16409, 27166, 5626, 16289, 55696, 33649, 44349, 22299, 32453}, objArr2);
                Toast.makeText(activity2, ((String) objArr2[0]).intern(), 1).show();
                return false;
            }
        } else if (this.radioGroupQuestion1.getCheckedRadioButtonId() == this.radioButtonQuestion1Op2.getId() && this.spReasonLeftOut.getSelectedItemPosition() == 0) {
            Activity activity3 = getActivity();
            Object[] objArr3 = new Object[1];
            a(35542 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0), new char[]{47400, 13251, 44211, 6556, 37463, 3886, 63570, 29418, 61349, 22683, 54651, 20006, 15128, 46515, 11976, 39812, 5225, 33100, 31241, 62691, 24980, 55988, 22372, 49161, 48419, 14322, 41180, 7587, 38553, 858, 64618, 26911, 58359, 23739, 51670, 17001, 16165, 43008, 8951, 40919}, objArr3);
            Toast.makeText(activity3, ((String) objArr3[0]).intern(), 1).show();
            return false;
        }
        if (this.linearLayoutBispSurveyed.getVisibility() == 0) {
            int i2 = d + 117;
            c = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                this.radioGroupQuestion1.getCheckedRadioButtonId();
                this.radioButtonQuestion1Op1.getId();
                throw null;
            }
            if (this.radioGroupQuestion1.getCheckedRadioButtonId() == this.radioButtonQuestion1Op1.getId()) {
                this.activityBeginSurvey.aG.bisp_survey_taken_before = 1;
            } else if (this.radioGroupQuestion1.getCheckedRadioButtonId() != this.radioButtonQuestion1Op2.getId()) {
                int i3 = c + 23;
                d = i3 % 128;
                if (i3 % 2 != 0) {
                    this.activityBeginSurvey.aG.bisp_survey_taken_before = -1;
                    obj.hashCode();
                    throw null;
                }
                this.activityBeginSurvey.aG.bisp_survey_taken_before = -1;
            } else {
                this.activityBeginSurvey.aG.bisp_survey_taken_before = 0;
            }
        } else {
            this.activityBeginSurvey.aG.bisp_survey_taken_before = 0;
        }
        int i4 = d + 65;
        c = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x005d  */
    @Override // ivas.gov.bisp.enumeration.X.e
    public void parseJson() {
        int i = 2 % 2;
        int i2 = d + 15;
        c = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            this.linearLayoutBispSurveyed.getVisibility();
            throw null;
        }
        if (this.linearLayoutBispSurveyed.getVisibility() == 0) {
            int i3 = d + 33;
            c = i3 % 128;
            if (i3 % 2 == 0) {
                this.radioGroupQuestion1.getCheckedRadioButtonId();
                this.radioButtonQuestion1Op1.getId();
                obj.hashCode();
                throw null;
            }
            if (this.radioGroupQuestion1.getCheckedRadioButtonId() == this.radioButtonQuestion1Op1.getId()) {
                this.activityBeginSurvey.aG.bisp_survey_taken_before = 1;
            } else if (this.radioGroupQuestion1.getCheckedRadioButtonId() != this.radioButtonQuestion1Op2.getId()) {
                this.activityBeginSurvey.aG.bisp_survey_taken_before = -1;
            } else {
                this.activityBeginSurvey.aG.bisp_survey_taken_before = 0;
            }
        } else {
            this.activityBeginSurvey.aG.bisp_survey_taken_before = 0;
        }
        if (this.linearLayoutQ2.getVisibility() == 0) {
            this.activityBeginSurvey.aG.reason_not_to_survey = this.reasonLetOutList.get(this.spReasonLeftOut.getSelectedItemPosition()).getOptionId();
        } else {
            this.activityBeginSurvey.aG.reason_not_to_survey = -1;
        }
        if (this.linearLayoutQ3.getVisibility() != 0) {
            this.activityBeginSurvey.aG.survey_advertisement_received = -1;
            int i4 = c + 17;
            d = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            return;
        }
        if (this.radioGroupQuestion3.getCheckedRadioButtonId() != this.radioButtonQuestion3Op1.getId()) {
            if (this.radioGroupQuestion3.getCheckedRadioButtonId() == this.radioButtonQuestion3Op2.getId()) {
                this.activityBeginSurvey.aG.survey_advertisement_received = 0;
                return;
            } else {
                this.activityBeginSurvey.aG.survey_advertisement_received = -1;
                return;
            }
        }
        int i5 = c + 59;
        d = i5 % 128;
        if (i5 % 2 != 0) {
            this.activityBeginSurvey.aG.survey_advertisement_received = 0;
        } else {
            this.activityBeginSurvey.aG.survey_advertisement_received = 1;
        }
    }

    private static void a(int i, char[] cArr, Object[] objArr) {
        int i2;
        int i3 = 2 % 2;
        m mVar = new m();
        mVar.d = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        mVar.e = 0;
        int i4 = $10 + 51;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (mVar.e < cArr.length) {
            int i6 = $11 + 91;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                jArr[mVar.e] = (((long) cArr[mVar.e]) - (((long) mVar.e) + ((long) mVar.d))) - (6031393033645231780L & d$s51$1015);
                i2 = mVar.e % 1;
            } else {
                jArr[mVar.e] = (6031393033645231780L ^ d$s51$1015) ^ (((long) cArr[mVar.e]) ^ (((long) mVar.e) * ((long) mVar.d)));
                i2 = mVar.e + 1;
            }
            mVar.e = i2;
        }
        char[] cArr2 = new char[length];
        mVar.e = 0;
        while (mVar.e < cArr.length) {
            int i7 = $10 + 51;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            cArr2[mVar.e] = (char) jArr[mVar.e];
            mVar.e++;
        }
        objArr[0] = new String(cArr2);
    }
}
