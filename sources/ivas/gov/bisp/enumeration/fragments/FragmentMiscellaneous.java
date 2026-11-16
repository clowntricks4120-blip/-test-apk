package ivas.gov.bisp.enumeration.fragments;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Fragment;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import ivas.gov.bisp.enumeration.ActivityBeginSurvey;
import ivas.gov.bisp.enumeration.BISPApplication;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.W.J;
import ivas.gov.bisp.enumeration.X.e;
import ivas.gov.bisp.enumeration.bK.ac;
import ivas.gov.bisp.enumeration.bK.ah;
import ivas.gov.bisp.enumeration.bK.au;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import ivas.gov.bisp.enumeration.models.KeyValue;
import ivas.gov.bisp.enumeration.models.SupervisorParseObject;
import ivas.gov.bisp.enumeration.models.Survey;
import ivas.gov.bisp.enumeration.o000Oo00.Oooo0;
import ivas.gov.bisp.enumeration.p026az.z;
import ivas.gov.bisp.enumeration.p051bx.o;
import java.util.ArrayList;
import java.util.HashMap;
import net.sqlcipher.BuildConfig;
import o.d;
import o.k;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"DefaultLocale"})
public class FragmentMiscellaneous extends Fragment implements e {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char a$s60$1351 = 31406;
    private static int c = 1;
    private static int d;
    private ActivityBeginSurvey activityBeginSurvey;
    private HashMap<Integer, KeyValue> assetsInfoList;
    public BISPApplication bispApplication;

    @BindView
    public CheckBox cb_child_health;

    @BindView
    public CheckBox cb_child_labor;

    @BindView
    public CheckBox cb_child_not_willing_to_study;

    @BindView
    public CheckBox cb_financial_difficulties;

    @BindView
    public CheckBox cb_poor_education_quality;
    public Oooo0<Item> complaintsResolvedArrayAdapter;
    public Oooo0<Item> complaintsResolvedGovtArrayAdapter;
    public ArrayList<Item> complaintsResolvedGovtList;
    public ArrayList<Item> complaintsResolvedList;
    private CountDownTimer countDownTimer;
    public ArrayList<Item> incomeList;

    @BindView
    public LinearLayout linearLayout1;

    @BindView
    public LinearLayout linearLayout2;

    @BindView
    public LinearLayout linearLayout3;

    @BindView
    public LinearLayout linearLayout4;

    @BindView
    public LinearLayout linearLayout5;

    @BindView
    public LinearLayout linearLayout6;

    @BindView
    public LinearLayout linearLayout7;

    @BindView
    public LinearLayout linearLayout8;
    public Oooo0<Item> monthlyIncomeArrayAdapter;

    @BindView
    public RadioButton radioButtonDefenceNo;

    @BindView
    public RadioButton radioButtonDefenceYes;

    @BindView
    public RadioButton radioButtonfinancialAssistance_no;

    @BindView
    public RadioButton radioButtonfinancialAssistance_yes;

    @BindView
    public RadioButton radioButtoninfantDeath_no;

    @BindView
    public RadioButton radioButtoninfantDeath_yes;

    @BindView
    public RadioButton radioButtonmigration_no;

    @BindView
    public RadioButton radioButtonmigration_yes;

    @BindView
    public RadioGroup radioGroupDefenseJob;

    @BindView
    public RadioGroup radioGroupfinancialAssistance;

    @BindView
    public RadioGroup radioGroupinfantBirth;

    @BindView
    public RadioGroup radioGroupinfantDeath;

    @BindView
    public RadioGroup radioGroupmigration;
    public Oooo0<Item> satisfactionLevelArrayAdapter;
    public ArrayList<Item> satisfactionLevelList;

    @BindView
    public Spinner sp_levelSatisfaction;

    @BindView
    public Spinner sp_loan;

    @BindView
    public Spinner sp_monthly_income;

    @BindView
    public Spinner sp_resolveComplaint;

    @BindView
    public Spinner sp_resolveComplaintGovt;
    public Oooo0<Item> takenLoanArrayAdapter;
    public ArrayList<Item> takenLoanList;

    @BindView
    public TextView textViewTimeRemaining;
    private static char[] c$s59$1351 = {31405, 20319, 18811, 20309, 20298, 18715, 20289, 18690, 31404, 20338, 20320, 31400, 20293, 31403, 18801, 20343, 20327, 20291, 20288, 18869, 20304, 20311, 18802, 20306, 20312, 20346, 20345, 20295, 31402, 20292, 18708, 20243, 18842, 18806, 20305, 20332, 18913, 20350, 18713, 20253, 18943, 20315, 20308, 20310, 20294, 20314, 20318, 20317, 20316};
    private static int[] c$s11$1452 = {-554808710, -2026620654, 1347736316, 1999387520, 598967480, -2024487254, 681887602, -1892560776, -225634953, -93795681, -1687330271, 424497260, 351373432, -2071598511, 1298925030, 1278699325, 742471388, 10622276};
    private View parentView = null;
    private boolean isValidTrue = false;
    public boolean isTimerStart = false;

    public static /* synthetic */ ActivityBeginSurvey access$000(FragmentMiscellaneous fragmentMiscellaneous) {
        int i = 2 % 2;
        int i2 = d + 17;
        int i3 = i2 % 128;
        c = i3;
        if (i2 % 2 == 0) {
            ActivityBeginSurvey activityBeginSurvey = fragmentMiscellaneous.activityBeginSurvey;
            throw null;
        }
        ActivityBeginSurvey activityBeginSurvey2 = fragmentMiscellaneous.activityBeginSurvey;
        int i4 = i3 + 83;
        d = i4 % 128;
        int i5 = i4 % 2;
        return activityBeginSurvey2;
    }

    private void setDummyData() {
        int i = 2 % 2;
        int i2 = d + 83;
        c = i2 % 128;
        int i3 = i2 % 2;
        this.sp_levelSatisfaction.setSelection(1);
        this.sp_resolveComplaint.setSelection(1);
        this.sp_loan.setSelection(1);
        this.sp_resolveComplaintGovt.setSelection(1);
        this.radioButtoninfantDeath_yes.setChecked(true);
        this.radioButtonDefenceYes.setChecked(true);
        this.radioButtonmigration_yes.setChecked(true);
        this.radioButtonfinancialAssistance_yes.setChecked(true);
        int i4 = d + 85;
        c = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void setSpotCheckUserVisibility() {
        int i = 2 % 2;
        if (this.activityBeginSurvey.ac == 2) {
            int i2 = d + 91;
            c = i2 % 128;
            int i3 = i2 % 2;
            this.linearLayout1.setVisibility(8);
            this.linearLayout2.setVisibility(8);
            this.linearLayout3.setVisibility(8);
            this.linearLayout4.setVisibility(8);
            this.linearLayout6.setVisibility(8);
            this.linearLayout7.setVisibility(8);
            this.linearLayout8.setVisibility(8);
        }
        int i4 = d + 105;
        c = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.X.e
    public boolean isValid() {
        int i = 2 % 2;
        Activity activity = getActivity();
        RadioGroup radioGroup = this.radioGroupinfantDeath;
        Object[] objArr = new Object[1];
        b((byte) (115 - (ViewConfiguration.getFadingEdgeLength() >> 16)), Color.argb(0, 0, 0, 0) + 12, new char[]{26, '.', 2, 24, '0', 26, 29, 17, ',', 22, '\"', '0'}, objArr);
        if (!z.m(activity, radioGroup, ((String) objArr[0]).intern())) {
            int i2 = d + 59;
            c = i2 % 128;
            return i2 % 2 == 0;
        }
        Activity activity2 = getActivity();
        RadioGroup radioGroup2 = this.radioGroupinfantBirth;
        Object[] objArr2 = new Object[1];
        a(TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0) + 13, new int[]{-747757001, 414523321, -1844595035, 399585209, 801188616, -127672765}, objArr2);
        if (!z.m(activity2, radioGroup2, ((String) objArr2[0]).intern())) {
            return false;
        }
        if (this.activityBeginSurvey.ac != 2 && this.sp_monthly_income.getSelectedItemPosition() == 0) {
            Activity activity3 = getActivity();
            Spinner spinner = this.sp_monthly_income;
            Object[] objArr3 = new Object[1];
            b((byte) ((ViewConfiguration.getScrollBarSize() >> 8) + 82), 23 - (Process.myPid() >> 22), new char[]{'\n', '\r', '0', 1, 21, ',', '-', 29, ')', ',', '0', 26, '$', 6, 3, ' ', 26, '.', 27, 6, '/', ',', 13830}, objArr3);
            z.o(activity3, spinner, ((String) objArr3[0]).intern());
            return false;
        }
        HashMap<Integer, KeyValue> map = new HashMap<>();
        this.assetsInfoList = map;
        Object[] objArr4 = new Object[1];
        b((byte) (72 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 6, new char[]{' ', '\"', '$', 24, 14, 21}, objArr4);
        map.put(40, new KeyValue(((String) objArr4[0]).intern(), BuildConfig.FLAVOR));
        HashMap<Integer, KeyValue> map2 = this.assetsInfoList;
        Object[] objArr5 = new Object[1];
        a(KeyEvent.keyCodeFromString(BuildConfig.FLAVOR) + 19, new int[]{-851000709, 1517160169, 771907963, -1117550837, 253958925, -471628726, -1018477645, 618502059, -225423156, 1425442897}, objArr5);
        map2.put(41, new KeyValue(((String) objArr5[0]).intern(), this.incomeList.get(this.sp_monthly_income.getSelectedItemPosition()).getOption()));
        HashMap<Integer, KeyValue> map3 = this.assetsInfoList;
        Object[] objArr6 = new Object[1];
        a(TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0) + 19, new int[]{1183404890, 159797986, 624708146, -154430423, -1755477261, 1440012685, 411394093, -2010751331, -319043649, -1702471749}, objArr6);
        map3.put(45, new KeyValue(((String) objArr6[0]).intern(), z.j(getActivity(), this.radioGroupinfantDeath)));
        HashMap<Integer, KeyValue> map4 = this.assetsInfoList;
        Object[] objArr7 = new Object[1];
        b((byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 28), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 10, new char[]{'\f', 26, '&', 29, '!', '\'', 30, 3, 23, 29, 13261}, objArr7);
        map4.put(46, new KeyValue(((String) objArr7[0]).intern(), z.j(getActivity(), this.radioGroupinfantBirth)));
        this.activityBeginSurvey.aE.putAll(this.assetsInfoList);
        if (!this.isValidTrue) {
            int i3 = d + 65;
            c = i3 % 128;
            int i4 = i3 % 2;
            this.activityBeginSurvey.aG.miscellaneousEnd = z.e();
            Survey survey = this.activityBeginSurvey.aG;
            survey.diffMiscellaneous = ac.f(survey.miscellaneousStart, survey.miscellaneousEnd);
            this.isValidTrue = true;
        }
        if (this.cb_financial_difficulties.isChecked()) {
            int i5 = d + 109;
            c = i5 % 128;
            int i6 = i5 % 2;
            this.bispApplication.j = 1;
        } else {
            this.bispApplication.j = 0;
        }
        if (this.cb_poor_education_quality.isChecked()) {
            int i7 = c + 9;
            d = i7 % 128;
            if (i7 % 2 != 0) {
                this.bispApplication.l = 0;
            } else {
                this.bispApplication.l = 1;
            }
        } else {
            this.bispApplication.l = 0;
        }
        if (this.cb_child_labor.isChecked()) {
            int i8 = c + 113;
            d = i8 % 128;
            if (i8 % 2 != 0) {
                this.bispApplication.k = 0;
            } else {
                this.bispApplication.k = 1;
            }
        } else {
            this.bispApplication.k = 0;
        }
        if (this.cb_child_health.isChecked()) {
            this.bispApplication.m = 1;
        } else {
            this.bispApplication.m = 0;
        }
        if (this.cb_child_not_willing_to_study.isChecked()) {
            this.bispApplication.n = 1;
        } else {
            this.bispApplication.n = 0;
        }
        return true;
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 2 % 2;
        int i2 = c;
        int i3 = i2 + 85;
        d = i3 % 128;
        int i4 = i3 % 2;
        try {
            if (this.parentView == null) {
                int i5 = i2 + 93;
                d = i5 % 128;
                int i6 = i5 % 2;
                this.bispApplication = (BISPApplication) getActivity().getApplication();
                View viewInflate = layoutInflater.inflate(R.layout.fragment_miscellaneous, viewGroup, false);
                this.parentView = viewInflate;
                ButterKnife.c(this, viewInflate);
                this.activityBeginSurvey = (ActivityBeginSurvey) getActivity();
                generateBody();
                this.activityBeginSurvey.aG.miscellaneousStart = z.e();
                int i7 = c + 99;
                d = i7 % 128;
                int i8 = i7 % 2;
            }
        } catch (Exception unused) {
        }
        return this.parentView;
    }

    @Override // ivas.gov.bisp.enumeration.X.e
    public SupervisorParseObject parseJsonForSupervisor() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 113;
        c = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = i2 + 9;
        c = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        int i = 2 % 2;
        super.onDestroy();
        CountDownTimer countDownTimer = this.countDownTimer;
        if (countDownTimer != null) {
            int i2 = d + 87;
            c = i2 % 128;
            int i3 = i2 % 2;
            countDownTimer.cancel();
            int i4 = c + 109;
            d = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private void generateBody() {
        int i = 2 % 2;
        int i2 = c + 63;
        d = i2 % 128;
        int i3 = i2 % 2;
        loadSpinners();
        ac.m(new Spinner[]{this.sp_levelSatisfaction, this.sp_resolveComplaint, this.sp_resolveComplaintGovt, this.sp_loan, this.sp_monthly_income}, new o[]{this.satisfactionLevelArrayAdapter, this.complaintsResolvedArrayAdapter, this.complaintsResolvedGovtArrayAdapter, this.takenLoanArrayAdapter, this.monthlyIncomeArrayAdapter});
        setSpotCheckUserVisibility();
        int i4 = c + 67;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 95 / 0;
        }
    }

    @Override // android.app.Fragment
    public void onResume() {
        int i = 2 % 2;
        int i2 = c + 57;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            super.onResume();
            throw null;
        }
        super.onResume();
        if (!this.isTimerStart) {
            int i3 = c + 75;
            d = i3 % 128;
            int i4 = i3 % 2;
            SharedPreferences sharedPreferences = ah.c.d;
            Object[] objArr = new Object[1];
            b((byte) (((Process.getThreadPriority(0) + 20) >> 6) + 104), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 16, new char[]{' ', 25, 17, ',', '/', ',', 27, 30, '\b', 1, '\r', 17, 1, '0', ',', '0'}, objArr);
            if (sharedPreferences.getInt(((String) objArr[0]).intern(), 1) == 1) {
                SharedPreferences sharedPreferences2 = ah.c.d;
                Object[] objArr2 = new Object[1];
                b((byte) (-((byte) KeyEvent.getModifierMetaStateMask())), TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0) + 8, new char[]{'/', '.', 14, '\'', 24, '0', '/', ','}, objArr2);
                this.countDownTimer = new CountDownTimer(sharedPreferences2.getLong(((String) objArr2[0]).intern(), 0L) * 1000, 1000L) { // from class: ivas.gov.bisp.enumeration.fragments.FragmentMiscellaneous.1
                    private static int a = 0;
                    private static int b = 1;

                    @Override // android.os.CountDownTimer
                    public void onFinish() {
                        int i5 = 2 % 2;
                        int i6 = a;
                        int i7 = (i6 & 95) + (i6 | 95);
                        b = i7 % 128;
                        try {
                            if (i7 % 2 == 0) {
                                FragmentMiscellaneous.this.textViewTimeRemaining.setVisibility(101);
                            } else {
                                FragmentMiscellaneous.this.textViewTimeRemaining.setVisibility(8);
                            }
                            Button button = FragmentMiscellaneous.access$000(FragmentMiscellaneous.this).buttonNext;
                            int i8 = a;
                            int i9 = i8 & 5;
                            int i10 = i8 | 5;
                            int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
                            b = i11 % 128;
                            int i12 = i11 % 2;
                            button.setEnabled(true);
                            ActivityBeginSurvey activityBeginSurveyAccess$000 = FragmentMiscellaneous.access$000(FragmentMiscellaneous.this);
                            int i13 = a;
                            int i14 = i13 & 109;
                            int i15 = (i13 ^ 109) | i14;
                            int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
                            b = i16 % 128;
                            if (i16 % 2 == 0) {
                                activityBeginSurveyAccess$000.buttonPrevious.setEnabled(false);
                            } else {
                                activityBeginSurveyAccess$000.buttonPrevious.setEnabled(true);
                            }
                        } catch (Exception unused) {
                        }
                    }

                    @Override // android.os.CountDownTimer
                    public void onTick(long j) {
                        int i5 = 2 % 2;
                        try {
                            TextView textView = FragmentMiscellaneous.this.textViewTimeRemaining;
                            StringBuilder sb = new StringBuilder();
                            int i6 = a;
                            int i7 = (i6 ^ 111) + ((i6 & 111) << 1);
                            b = i7 % 128;
                            int i8 = i7 % 2;
                            sb.append("Time Remaining : ");
                            int i9 = (int) (j / 1000);
                            int i10 = a;
                            int i11 = i10 & 123;
                            int i12 = ((((i10 ^ 123) | i11) << 1) - (~(-((i10 | 123) & (~i11))))) - 1;
                            b = i12 % 128;
                            if (i12 % 2 == 0) {
                                sb.append(i9);
                                textView.setText(sb.toString());
                                throw null;
                            }
                            sb.append(i9);
                            textView.setText(sb.toString());
                            FragmentMiscellaneous fragmentMiscellaneous = FragmentMiscellaneous.this;
                            int i13 = b;
                            int i14 = (-2) - (((i13 ^ 116) + ((i13 & 116) << 1)) ^ (-1));
                            a = i14 % 128;
                            (i14 % 2 != 0 ? FragmentMiscellaneous.access$000(fragmentMiscellaneous).buttonNext : FragmentMiscellaneous.access$000(fragmentMiscellaneous).buttonNext).setEnabled(false);
                            FragmentMiscellaneous fragmentMiscellaneous2 = FragmentMiscellaneous.this;
                            int i15 = b + 61;
                            a = i15 % 128;
                            (i15 % 2 != 0 ? FragmentMiscellaneous.access$000(fragmentMiscellaneous2).buttonPrevious : FragmentMiscellaneous.access$000(fragmentMiscellaneous2).buttonPrevious).setEnabled(false);
                            FragmentMiscellaneous fragmentMiscellaneous3 = FragmentMiscellaneous.this;
                            int i16 = b;
                            int i17 = ((i16 & 14) + (i16 | 14)) - 1;
                            a = i17 % 128;
                            int i18 = i17 % 2;
                            fragmentMiscellaneous3.isTimerStart = true;
                            int i19 = a + 31;
                            b = i19 % 128;
                            int i20 = i19 % 2;
                        } catch (Exception unused) {
                        }
                    }
                }.start();
                return;
            }
        }
        this.textViewTimeRemaining.setVisibility(8);
        this.activityBeginSurvey.buttonNext.setEnabled(true);
        this.activityBeginSurvey.buttonPrevious.setEnabled(true);
    }

    public void loadSpinners() {
        int i = 2 % 2;
        Activity activity = getActivity();
        Object[] objArr = new Object[1];
        b((byte) ((ViewConfiguration.getScrollBarSize() >> 8) + 83), TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0') + 30, new char[]{'0', 6, 28, '$', 1, '0', 20, '.', 5, '\b', '*', '$', 15, '-', 4, 20, '*', '0', 22, 2, '*', 28, '.', 17, 16, '-', 22, '0', 13884}, objArr);
        new au(activity, ((String) objArr[0]).intern(), getResources().getString(R.string.select_any), this.sp_resolveComplaint, new J() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentMiscellaneous.2
            private static int a = 1;
            private static int b;

            @Override // ivas.gov.bisp.enumeration.W.J
            public void fillList(ArrayList<Item> arrayList) {
                int i2 = 2 % 2;
                int i3 = b;
                int i4 = i3 & 57;
                int i5 = -(-(i3 | 57));
                int i6 = (i4 & i5) + (i5 | i4);
                a = i6 % 128;
                int i7 = i6 % 2;
                FragmentMiscellaneous.this.complaintsResolvedList = arrayList;
                int i8 = b + 55;
                a = i8 % 128;
                if (i8 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }).execute(new Void[0]);
        Activity activity2 = getActivity();
        Object[] objArr2 = new Object[1];
        b((byte) (Drawable.resolveOpacity(0, 0) + 66), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 41, new char[]{'0', 6, 28, '$', 1, '0', 20, '.', 5, '\b', '*', '$', 27, 6, '-', 18, 2, 22, '.', '0', 25, 20, '%', 21, ',', 21, '.', '0', 20, 25, '\'', 14, 21, 24, 22, '0', '*', 28, '-', 15, 13872}, objArr2);
        new au(activity2, ((String) objArr2[0]).intern(), getResources().getString(R.string.select_any), this.sp_resolveComplaintGovt, new J() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentMiscellaneous.3
            private static int a = 0;
            private static int b = 1;

            @Override // ivas.gov.bisp.enumeration.W.J
            public void fillList(ArrayList<Item> arrayList) {
                int i2 = 2 % 2;
                int i3 = a;
                int i4 = ((i3 ^ 96) + ((i3 & 96) << 1)) - 1;
                b = i4 % 128;
                if (i4 % 2 != 0) {
                    FragmentMiscellaneous.this.complaintsResolvedGovtList = arrayList;
                } else {
                    FragmentMiscellaneous.this.complaintsResolvedGovtList = arrayList;
                    int i5 = 36 / 0;
                }
            }
        }).execute(new Void[0]);
        Activity activity3 = getActivity();
        Object[] objArr3 = new Object[1];
        b((byte) (90 - View.MeasureSpec.makeMeasureSpec(0, 0)), (ViewConfiguration.getTouchSlop() >> 8) + 41, new char[]{'\b', 1, '\b', '/', 0, '$', '-', 6, '\'', 14, 24, 21, '.', 17, '\n', 3, 27, 16, 24, '0', '*', '0', '$', 28, '0', 24, '#', '$', 20, 25, 24, 21, '*', '$', 23, '/', 20, 25, '0', 17, 13913}, objArr3);
        new au(activity3, ((String) objArr3[0]).intern(), getResources().getString(R.string.select_any), this.sp_levelSatisfaction, new J() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentMiscellaneous.4
            private static int a = 0;
            private static int b = 1;

            @Override // ivas.gov.bisp.enumeration.W.J
            public void fillList(ArrayList<Item> arrayList) {
                int i2 = 2 % 2;
                int i3 = b;
                int i4 = i3 & 59;
                int i5 = i3 | 59;
                int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
                a = i6 % 128;
                int i7 = i6 % 2;
                FragmentMiscellaneous.this.satisfactionLevelList = arrayList;
                int i8 = b;
                int i9 = i8 & 51;
                int i10 = (i9 - (~(-(-((i8 ^ 51) | i9))))) - 1;
                a = i10 % 128;
                int i11 = i10 % 2;
            }
        }).execute(new Void[0]);
        Activity activity4 = getActivity();
        Object[] objArr4 = new Object[1];
        b((byte) (44 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0')), (ViewConfiguration.getEdgeSlop() >> 16) + 14, new char[]{'%', 27, 14, '\'', 21, 24, 22, '-', '*', '(', 6, '+', 26, ','}, objArr4);
        new au(activity4, ((String) objArr4[0]).intern(), getResources().getString(R.string.select_any), this.sp_loan, new J() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentMiscellaneous.5
            private static int a = 0;
            private static int b = 1;

            @Override // ivas.gov.bisp.enumeration.W.J
            public void fillList(ArrayList<Item> arrayList) {
                int i2 = 2 % 2;
                int i3 = b;
                int i4 = (i3 & (-58)) | ((~i3) & 57);
                int i5 = (i3 & 57) << 1;
                int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
                a = i6 % 128;
                int i7 = i6 % 2;
                FragmentMiscellaneous.this.takenLoanList = arrayList;
                int i8 = a;
                int i9 = i8 & 99;
                int i10 = (i8 ^ 99) | i9;
                int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
                b = i11 % 128;
                if (i11 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }).execute(new Void[0]);
        Activity activity5 = getActivity();
        Object[] objArr5 = new Object[1];
        b((byte) (45 - View.MeasureSpec.getSize(0)), 14 - View.MeasureSpec.getSize(0), new char[]{'%', 27, 14, '\'', 21, 24, 22, '-', '*', '(', 6, '+', 26, ','}, objArr5);
        new au(activity5, ((String) objArr5[0]).intern(), getResources().getString(R.string.select_any), this.sp_loan, new J() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentMiscellaneous.6
            private static int a = 1;
            private static int b;

            @Override // ivas.gov.bisp.enumeration.W.J
            public void fillList(ArrayList<Item> arrayList) {
                int i2 = 2 % 2;
                int i3 = a;
                int i4 = (i3 & (-6)) | ((~i3) & 5);
                int i5 = (i3 & 5) << 1;
                int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
                b = i6 % 128;
                int i7 = i6 % 2;
                FragmentMiscellaneous.this.takenLoanList = arrayList;
                int i8 = a;
                int i9 = i8 & 41;
                int i10 = ((i8 | 41) & (~i9)) + (i9 << 1);
                b = i10 % 128;
                if (i10 % 2 != 0) {
                    throw null;
                }
            }
        }).execute(new Void[0]);
        Activity activity6 = getActivity();
        Object[] objArr6 = new Object[1];
        b((byte) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 91), 22 - KeyEvent.normalizeMetaState(0), new char[]{26, '\t', '0', 1, 21, ',', '*', '$', '/', '*', '0', 26, '$', 6, 0, '\'', '.', '0', 27, 6, '/', ','}, objArr6);
        new au(activity6, ((String) objArr6[0]).intern(), getResources().getString(R.string.select_any), this.sp_monthly_income, new J() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentMiscellaneous.7
            private static int a = 0;
            private static int b = 1;

            @Override // ivas.gov.bisp.enumeration.W.J
            public void fillList(ArrayList<Item> arrayList) {
                int i2 = 2 % 2;
                int i3 = a;
                int i4 = i3 & 95;
                int i5 = -(-(i3 | 95));
                int i6 = (i4 & i5) + (i5 | i4);
                b = i6 % 128;
                int i7 = i6 % 2;
                FragmentMiscellaneous.this.incomeList = arrayList;
                int i8 = a;
                int i9 = i8 & 43;
                int i10 = (i8 | 43) & (~i9);
                int i11 = i9 << 1;
                int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
                b = i12 % 128;
                if (i12 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }).execute(new Void[0]);
        int i2 = c + 65;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // ivas.gov.bisp.enumeration.X.e
    public void parseJson() {
        int i = 2 % 2;
        this.activityBeginSurvey.aG.infant_death = z.i(this.radioGroupinfantDeath);
        this.activityBeginSurvey.aG.infant_birth = z.i(this.radioGroupinfantBirth);
        Survey survey = this.activityBeginSurvey.aG;
        survey.financial_assistance = 999;
        survey.defence_job = 999;
        survey.migration = 999;
        if (this.sp_monthly_income.getSelectedItemPosition() != 0) {
            int i2 = c + 35;
            d = i2 % 128;
            int i3 = i2 % 2;
            this.activityBeginSurvey.aG.monthly_income = this.incomeList.get(this.sp_monthly_income.getSelectedItemPosition()).getOptionId();
        }
        Survey survey2 = this.activityBeginSurvey.aG;
        survey2.taken_loan = 999;
        survey2.resolve_complaint = 999;
        survey2.resolve_complaint_govt = 999;
        survey2.satisfaction_level = 999;
        int i4 = c + 97;
        d = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void b(byte b, int i, char[] cArr, Object[] objArr) {
        int i2;
        int i3 = 2 % 2;
        k kVar = new k();
        char[] cArr2 = c$s59$1351;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                int i5 = $11 + 7;
                $10 = i5 % 128;
                if (i5 % 2 != 0) {
                    cArr3[i4] = (char) (((long) cArr2[i4]) / 3459633260503792297L);
                } else {
                    cArr3[i4] = (char) (((long) cArr2[i4]) ^ 3459633260503792297L);
                    i4++;
                }
            }
            cArr2 = cArr3;
        }
        char c2 = (char) (3459633260503792297L ^ ((long) a$s60$1351));
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            kVar.c = 0;
            while (kVar.c < i2) {
                kVar.e = cArr[kVar.c];
                kVar.b = cArr[kVar.c + 1];
                if (kVar.e == kVar.b) {
                    cArr4[kVar.c] = (char) (kVar.e - b);
                    cArr4[kVar.c + 1] = (char) (kVar.b - b);
                } else {
                    kVar.a = kVar.e / c2;
                    kVar.h = kVar.e % c2;
                    kVar.d = kVar.b / c2;
                    kVar.f = kVar.b % c2;
                    if (kVar.h == kVar.f) {
                        int i6 = $10 + 57;
                        $11 = i6 % 128;
                        int i7 = i6 % 2;
                        kVar.a = ((kVar.a + c2) - 1) % c2;
                        kVar.d = ((kVar.d + c2) - 1) % c2;
                        int i8 = (kVar.a * c2) + kVar.h;
                        int i9 = (kVar.d * c2) + kVar.f;
                        cArr4[kVar.c] = cArr2[i8];
                        cArr4[kVar.c + 1] = cArr2[i9];
                    } else if (kVar.a == kVar.d) {
                        int i10 = $11 + 15;
                        $10 = i10 % 128;
                        int i11 = i10 % 2;
                        kVar.h = ((kVar.h + c2) - 1) % c2;
                        kVar.f = ((kVar.f + c2) - 1) % c2;
                        int i12 = (kVar.a * c2) + kVar.h;
                        int i13 = (kVar.d * c2) + kVar.f;
                        cArr4[kVar.c] = cArr2[i12];
                        cArr4[kVar.c + 1] = cArr2[i13];
                    } else {
                        int i14 = (kVar.a * c2) + kVar.f;
                        int i15 = (kVar.d * c2) + kVar.h;
                        cArr4[kVar.c] = cArr2[i14];
                        cArr4[kVar.c + 1] = cArr2[i15];
                    }
                }
                kVar.c += 2;
            }
        }
        int i16 = 0;
        while (i16 < i) {
            int i17 = $10 + 73;
            $11 = i17 % 128;
            if (i17 % 2 == 0) {
                cArr4[i16] = (char) (cArr4[i16] & 29905);
                i16 += 35;
            } else {
                cArr4[i16] = (char) (cArr4[i16] ^ 13722);
                i16++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    private static void a(int i, int[] iArr, Object[] objArr) {
        int length;
        int[] iArr2;
        int i2;
        int i3 = 2 % 2;
        d dVar = new d();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = c$s11$1452;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i4 = $10 + 95;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            for (int i6 = 0; i6 < length2; i6++) {
                iArr4[i6] = (int) (((long) iArr3[i6]) ^ (-2705551458099060901L));
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = c$s11$1452;
        if (iArr6 != null) {
            int i7 = $11 + 75;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                length = iArr6.length;
                iArr2 = new int[length];
                i2 = 1;
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
                i2 = 0;
            }
            while (i2 < length) {
                iArr2[i2] = (int) (((long) iArr6[i2]) ^ (-2705551458099060901L));
                i2++;
                length = length;
            }
            iArr6 = iArr2;
        }
        System.arraycopy(iArr6, 0, iArr5, 0, length3);
        dVar.a = 0;
        while (dVar.a < iArr.length) {
            cArr[0] = (char) (iArr[dVar.a] >> 16);
            cArr[1] = (char) iArr[dVar.a];
            cArr[2] = (char) (iArr[dVar.a + 1] >> 16);
            cArr[3] = (char) iArr[dVar.a + 1];
            dVar.e = (cArr[0] << 16) + cArr[1];
            dVar.d = (cArr[2] << 16) + cArr[3];
            d.b(iArr5);
            for (int i8 = 0; i8 < 16; i8++) {
                int i9 = $11 + 69;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                dVar.e ^= iArr5[i8];
                dVar.d = d.c(dVar.e) ^ dVar.d;
                int i11 = dVar.e;
                dVar.e = dVar.d;
                dVar.d = i11;
            }
            int i12 = dVar.e;
            dVar.e = dVar.d;
            dVar.d = i12;
            dVar.d ^= iArr5[16];
            dVar.e ^= iArr5[17];
            int i13 = dVar.e;
            int i14 = dVar.d;
            cArr[0] = (char) (dVar.e >>> 16);
            cArr[1] = (char) dVar.e;
            cArr[2] = (char) (dVar.d >>> 16);
            cArr[3] = (char) dVar.d;
            d.b(iArr5);
            cArr2[dVar.a * 2] = cArr[0];
            cArr2[(dVar.a * 2) + 1] = cArr[1];
            cArr2[(dVar.a * 2) + 2] = cArr[2];
            cArr2[(dVar.a * 2) + 3] = cArr[3];
            dVar.a += 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }
}
