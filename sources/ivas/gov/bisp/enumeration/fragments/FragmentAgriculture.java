package ivas.gov.bisp.enumeration.fragments;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import ivas.gov.bisp.enumeration.ActivityAgriculture;
import ivas.gov.bisp.enumeration.ActivityBeginSurvey;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.X.e;
import ivas.gov.bisp.enumeration.adapters.AdapterAgriMember;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.models.AgriMember;
import ivas.gov.bisp.enumeration.models.AgricultureDetail;
import ivas.gov.bisp.enumeration.models.SupervisorParseObject;
import ivas.gov.bisp.enumeration.models.Survey;
import ivas.gov.bisp.enumeration.p026az.t;
import ivas.gov.bisp.enumeration.p026az.z;
import ivas.gov.bisp.enumeration.p051bx.o;
import ivas.gov.bisp.enumeration.p086i.l;
import java.util.ArrayList;
import net.sqlcipher.BuildConfig;
import o.m;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"DefaultLocale"})
public class FragmentAgriculture extends Fragment implements e {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final int CODE_FAMILY = 100;
    private static final int CODE_MEMBER = 200;
    private static long d$s51$1215 = 4162989199381902571L;
    private static int e = 0;
    private static int f = 1;
    private ActivityBeginSurvey activityBeginSurvey;
    private AdapterAgriMember adapterAgriMember;
    public o adapterAgricultureOption;
    public ArrayList<AgriMember> agriMemberArrayList;
    private AgricultureDetail agricultureDetailOfFamily;
    public ArrayList<t> arrayListAgriculture;

    @BindView
    public Button buttonProceed;

    @BindView
    public CardView cardViewMembers;
    private LinearLayoutManager mLayoutManagerMembers;
    private View parentView = null;

    @BindView
    public RecyclerView recyclerViewMembers;

    @BindView
    public Spinner spinnerAgri;

    public static /* synthetic */ AdapterAgriMember access$000(FragmentAgriculture fragmentAgriculture) {
        int i = 2 % 2;
        int i2 = f;
        int i3 = i2 + 103;
        e = i3 % 128;
        int i4 = i3 % 2;
        AdapterAgriMember adapterAgriMember = fragmentAgriculture.adapterAgriMember;
        int i5 = i2 + 59;
        e = i5 % 128;
        int i6 = i5 % 2;
        return adapterAgriMember;
    }

    private void setDummyData() {
        int i = 2 % 2;
        int i2 = f + 55;
        e = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 30 / 0;
        }
    }

    @Override // ivas.gov.bisp.enumeration.X.e
    public boolean isValid() {
        int i = 2 % 2;
        if (this.spinnerAgri.getSelectedItemPosition() == 0) {
            int i2 = f + 61;
            e = i2 % 128;
            int i3 = i2 % 2;
            Activity activity = getActivity();
            Spinner spinner = this.spinnerAgri;
            Object[] objArr = new Object[1];
            a(41078 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), new char[]{47630, 6749, 64215, 23417, 15352, 39027, 30877, 55560, 47506, 7712, 65208, 24424, 16218, 40912, 31823, 56571, 48493, 7655, 61972, 21140, 13058, 37817, 28719}, objArr);
            z.o(activity, spinner, ((String) objArr[0]).intern());
            return false;
        }
        if (this.spinnerAgri.getSelectedItemPosition() == 1) {
            int i4 = e + 57;
            f = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 0;
            while (true) {
                if (i6 >= this.agriMemberArrayList.size()) {
                    int i7 = e + 89;
                    f = i7 % 128;
                    if (i7 % 2 == 0) {
                        Activity activity2 = getActivity();
                        Spinner spinner2 = this.spinnerAgri;
                        Object[] objArr2 = new Object[1];
                        a(Process.getGidForName(BuildConfig.FLAVOR) * 48382, new char[]{47727, 1745, 50117, 35986, 18911, 2769, 55252, 37061, 24003, 7832, 56278, 42196, 25054, 8860, 61392, 43227, 30162, 14018, 62404, 48336}, objArr2);
                        z.o(activity2, spinner2, ((String) objArr2[0]).intern());
                        return false;
                    }
                    Activity activity3 = getActivity();
                    Spinner spinner3 = this.spinnerAgri;
                    Object[] objArr3 = new Object[1];
                    a(48382 - Process.getGidForName(BuildConfig.FLAVOR), new char[]{47727, 1745, 50117, 35986, 18911, 2769, 55252, 37061, 24003, 7832, 56278, 42196, 25054, 8860, 61392, 43227, 30162, 14018, 62404, 48336}, objArr3);
                    z.o(activity3, spinner3, ((String) objArr3[0]).intern());
                    return false;
                }
                if (this.agriMemberArrayList.get(i6).getIsSelected() == 1) {
                    for (int i8 = 0; i8 < this.agriMemberArrayList.size(); i8++) {
                        if (this.agriMemberArrayList.get(i8).getIsSelected() == 1) {
                            int i9 = f + 63;
                            e = i9 % 128;
                            int i10 = i9 % 2;
                            if (this.agriMemberArrayList.get(i8).getIsDetailAdded() == 0) {
                                Activity activity4 = getActivity();
                                Object[] objArr4 = new Object[1];
                                a(63667 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), new char[]{47626, 17042, 19293, 20531, 22769, 24848, 28188, 30413, 32677, 1133, 3282, 5515, 4679, 6956, 9200, 10304, 12570, 14732, 50877, 53091, 55239, 56449, 58692, 57910, 60071, 62299, 63495, 32910}, objArr4);
                                StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w(((String) objArr4[0]).intern());
                                sbW.append(this.agriMemberArrayList.get(i8).getName());
                                Toast.makeText(activity4, sbW.toString(), 1).show();
                                return false;
                            }
                        }
                    }
                    break;
                }
                i6++;
            }
        }
        if (this.spinnerAgri.getSelectedItemPosition() == 2 && this.agricultureDetailOfFamily == null) {
            Activity activity5 = getActivity();
            Object[] objArr5 = new Object[1];
            a(43789 - View.MeasureSpec.getSize(0), new char[]{47626, 4396, 60449, 47885, 5641, 60718, 47205, 6001, 57939, 47451, 5284, 58284, 48883, 5513, 57503, 49068, 2814, 57845, 48343, 3025, 59176, 45611, 2365, 58384, 45826, 3704, 58744, 45104}, objArr5);
            Toast.makeText(activity5, ((String) objArr5[0]).intern(), 1).show();
            return false;
        }
        int i11 = e + 115;
        f = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 19 / 0;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003c A[LOOP:0: B:10:0x0032->B:12:0x003c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:15:0x006f  */
    /* JADX WARN: Code duplicated, block: B:17:0x00af  */
    /* JADX WARN: Code duplicated, block: B:18:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    @Override // android.app.Fragment
    public void onResume() {
        int i;
        int i2 = 2 % 2;
        int i3 = e + 59;
        f = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 91 / 0;
            if (ag.e) {
                ag.e = false;
                this.agriMemberArrayList = new ArrayList<>();
                this.spinnerAgri.setSelection(0);
                int i5 = e + 53;
                f = i5 % 128;
                int i6 = i5 % 2;
                for (int i7 = 0; i7 < this.activityBeginSurvey.aq.size(); i7++) {
                    this.agriMemberArrayList.add(new AgriMember(this.activityBeginSurvey.aq.get(i7).name_of_member, this.activityBeginSurvey.aq.get(i7).roster_relational_id));
                }
                this.adapterAgriMember.h(this.agriMemberArrayList);
                if (ag.r) {
                    ArrayList<t> arrayList = new ArrayList<>();
                    this.arrayListAgriculture = arrayList;
                    arrayList.add(new t() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentAgriculture.1
                        private static int a = 0;
                        private static int b = 1;

                        @Override // ivas.gov.bisp.enumeration.p026az.t
                        public String getDropDownViewLabel() {
                            int i8 = 2 % 2;
                            int i9 = b;
                            int i10 = i9 & 77;
                            int i11 = i10 + ((i9 ^ 77) | i10);
                            a = i11 % 128;
                            if (i11 % 2 != 0) {
                                FragmentAgriculture.this.getResources().getString(R.string.agri_option);
                                throw null;
                            }
                            String string = FragmentAgriculture.this.getResources().getString(R.string.agri_option);
                            int i12 = b;
                            int i13 = i12 ^ 87;
                            int i14 = ((i12 & 87) | i13) << 1;
                            int i15 = -i13;
                            int i16 = ((i14 | i15) << 1) - (i14 ^ i15);
                            a = i16 % 128;
                            int i17 = i16 % 2;
                            return string;
                        }

                        public String getViewLabel() {
                            int i8 = 2 % 2;
                            int i9 = a;
                            int i10 = i9 & 29;
                            int i11 = -(-(i9 | 29));
                            int i12 = (i10 & i11) + (i11 | i10);
                            b = i12 % 128;
                            int i13 = i12 % 2;
                            Resources resources = FragmentAgriculture.this.getResources();
                            if (i13 != 0) {
                                return resources.getString(R.string.agri_option);
                            }
                            resources.getString(R.string.agri_option);
                            throw null;
                        }

                        public boolean isChecked() {
                            int i8 = 2 % 2;
                            int i9 = a;
                            int i10 = i9 & 23;
                            int i11 = (i10 - (~((i9 ^ 23) | i10))) - 1;
                            b = i11 % 128;
                            int i12 = i11 % 2;
                            int i13 = i9 & 79;
                            int i14 = i13 + ((i9 ^ 79) | i13);
                            b = i14 % 128;
                            if (i14 % 2 != 0) {
                                return false;
                            }
                            throw null;
                        }
                    });
                    this.arrayListAgriculture.add(new t() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentAgriculture.2
                        private static int a = 1;
                        private static int b;

                        @Override // ivas.gov.bisp.enumeration.p026az.t
                        public String getDropDownViewLabel() {
                            int i8 = 2 % 2;
                            int i9 = a;
                            int i10 = i9 ^ 59;
                            int i11 = ((i9 & 59) | i10) << 1;
                            int i12 = -i10;
                            int i13 = (i11 ^ i12) + ((i11 & i12) << 1);
                            b = i13 % 128;
                            int i14 = i13 % 2;
                            String string = FragmentAgriculture.this.getResources().getString(R.string.agri_option1);
                            if (i14 != 0) {
                                int i15 = 82 / 0;
                            }
                            return string;
                        }

                        public String getViewLabel() {
                            int i8 = 2 % 2;
                            int i9 = a + 89;
                            b = i9 % 128;
                            int i10 = i9 % 2;
                            String string = FragmentAgriculture.this.getResources().getString(R.string.agri_option1);
                            int i11 = b;
                            int i12 = (i11 & 37) + (i11 | 37);
                            a = i12 % 128;
                            if (i12 % 2 != 0) {
                                return string;
                            }
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }

                        public boolean isChecked() {
                            int i8 = 2 % 2;
                            int i9 = a;
                            int i10 = ((i9 | 53) << 1) - (i9 ^ 53);
                            b = i10 % 128;
                            int i11 = i10 % 2;
                            return false;
                        }
                    });
                    this.arrayListAgriculture.add(new t() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentAgriculture.3
                        private static int a = 0;
                        private static int b = 1;

                        @Override // ivas.gov.bisp.enumeration.p026az.t
                        public String getDropDownViewLabel() {
                            int i8 = 2 % 2;
                            int i9 = b;
                            int i10 = i9 & 53;
                            int i11 = -(-((i9 ^ 53) | i10));
                            int i12 = (i10 & i11) + (i11 | i10);
                            a = i12 % 128;
                            if (i12 % 2 != 0) {
                                FragmentAgriculture.this.getResources().getString(R.string.agri_option2);
                                throw null;
                            }
                            String string = FragmentAgriculture.this.getResources().getString(R.string.agri_option2);
                            int i13 = a;
                            int i14 = (((i13 | 54) << 1) - (i13 ^ 54)) - 1;
                            b = i14 % 128;
                            int i15 = i14 % 2;
                            return string;
                        }

                        public String getViewLabel() {
                            int i8 = 2 % 2;
                            int i9 = a;
                            int i10 = i9 | 91;
                            int i11 = ((i10 << 1) - (~(-((~(i9 & 91)) & i10)))) - 1;
                            b = i11 % 128;
                            int i12 = i11 % 2;
                            String string = FragmentAgriculture.this.getResources().getString(R.string.agri_option2);
                            int i13 = b;
                            int i14 = i13 ^ 65;
                            int i15 = (((i13 & 65) | i14) << 1) - i14;
                            a = i15 % 128;
                            int i16 = i15 % 2;
                            return string;
                        }

                        public boolean isChecked() {
                            int i8 = 2 % 2;
                            int i9 = a;
                            int i10 = i9 & 69;
                            int i11 = ((i9 ^ 69) | i10) << 1;
                            int i12 = -((~i10) & (i9 | 69));
                            int i13 = ((i11 | i12) << 1) - (i11 ^ i12);
                            b = i13 % 128;
                            int i14 = i13 % 2;
                            int i15 = ((i9 ^ 65) - (~((i9 & 65) << 1))) - 1;
                            b = i15 % 128;
                            if (i15 % 2 != 0) {
                                return false;
                            }
                            throw null;
                        }
                    });
                    o oVar = new o(getActivity(), R.layout.spinner_item, this.arrayListAgriculture);
                    this.adapterAgricultureOption = oVar;
                    this.spinnerAgri.setAdapter((SpinnerAdapter) oVar);
                    i = f + 45;
                    e = i % 128;
                    if (i % 2 != 0) {
                        int i8 = 4 % 2;
                    }
                } else {
                    ArrayList<t> arrayList2 = new ArrayList<>();
                    this.arrayListAgriculture = arrayList2;
                    arrayList2.add(new t() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentAgriculture.4
                        private static int a = 1;
                        private static int b;

                        @Override // ivas.gov.bisp.enumeration.p026az.t
                        public String getDropDownViewLabel() {
                            int i9 = 2 % 2;
                            int i10 = b;
                            int i11 = i10 & 69;
                            int i12 = -(-((i10 ^ 69) | i11));
                            int i13 = (i11 & i12) + (i12 | i11);
                            a = i13 % 128;
                            int i14 = i13 % 2;
                            String string = FragmentAgriculture.this.getResources().getString(R.string.agri_option);
                            int i15 = a + 125;
                            b = i15 % 128;
                            int i16 = i15 % 2;
                            return string;
                        }

                        public String getViewLabel() {
                            int i9 = 2 % 2;
                            int i10 = a + 59;
                            b = i10 % 128;
                            int i11 = i10 % 2;
                            String string = FragmentAgriculture.this.getResources().getString(R.string.agri_option);
                            int i12 = a;
                            int i13 = i12 & 73;
                            int i14 = -(-((i12 ^ 73) | i13));
                            int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
                            b = i15 % 128;
                            int i16 = i15 % 2;
                            return string;
                        }

                        public boolean isChecked() {
                            int i9 = 2 % 2;
                            int i10 = a;
                            int i11 = i10 & 41;
                            int i12 = i11 + ((i10 ^ 41) | i11);
                            b = i12 % 128;
                            int i13 = i12 % 2;
                            int i14 = ((i10 & 90) + (i10 | 90)) - 1;
                            b = i14 % 128;
                            int i15 = i14 % 2;
                            return false;
                        }
                    });
                    this.arrayListAgriculture.add(new t() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentAgriculture.5
                        private static int a = 0;
                        private static int b = 1;

                        @Override // ivas.gov.bisp.enumeration.p026az.t
                        public String getDropDownViewLabel() {
                            int i9 = 2 % 2;
                            int i10 = b + 101;
                            a = i10 % 128;
                            if (i10 % 2 != 0) {
                                FragmentAgriculture.this.getResources().getString(R.string.agri_option1);
                                throw null;
                            }
                            String string = FragmentAgriculture.this.getResources().getString(R.string.agri_option1);
                            int i11 = a + 41;
                            b = i11 % 128;
                            int i12 = i11 % 2;
                            return string;
                        }

                        public String getViewLabel() {
                            int i9 = 2 % 2;
                            int i10 = b;
                            int i11 = i10 & 25;
                            int i12 = (i10 | 25) & (~i11);
                            int i13 = -(-(i11 << 1));
                            int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
                            a = i14 % 128;
                            int i15 = i14 % 2;
                            Resources resources = FragmentAgriculture.this.getResources();
                            if (i15 == 0) {
                                return resources.getString(R.string.agri_option1);
                            }
                            resources.getString(R.string.agri_option1);
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }

                        public boolean isChecked() {
                            int i9 = 2 % 2;
                            int i10 = b;
                            int i11 = i10 & 11;
                            int i12 = i11 + ((i10 ^ 11) | i11);
                            a = i12 % 128;
                            int i13 = i12 % 2;
                            return false;
                        }
                    });
                    this.arrayListAgriculture.add(new t() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentAgriculture.6
                        private static int a = 1;
                        private static int b;

                        @Override // ivas.gov.bisp.enumeration.p026az.t
                        public String getDropDownViewLabel() {
                            int i9 = 2 % 2;
                            int i10 = b;
                            int i11 = i10 ^ 3;
                            int i12 = (((i10 & 3) | i11) << 1) - i11;
                            a = i12 % 128;
                            int i13 = i12 % 2;
                            String string = FragmentAgriculture.this.getResources().getString(R.string.agri_option2);
                            int i14 = a;
                            int i15 = (i14 ^ 21) + ((i14 & 21) << 1);
                            b = i15 % 128;
                            if (i15 % 2 == 0) {
                                return string;
                            }
                            throw null;
                        }

                        public String getViewLabel() {
                            int i9 = 2 % 2;
                            int i10 = b;
                            int i11 = i10 & 99;
                            int i12 = ((((i10 ^ 99) | i11) << 1) - (~(-((i10 | 99) & (~i11))))) - 1;
                            a = i12 % 128;
                            if (i12 % 2 != 0) {
                                return FragmentAgriculture.this.getResources().getString(R.string.agri_option2);
                            }
                            FragmentAgriculture.this.getResources().getString(R.string.agri_option2);
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }

                        public boolean isChecked() {
                            int i9 = 2 % 2;
                            int i10 = a + 83;
                            b = i10 % 128;
                            int i11 = i10 % 2;
                            return false;
                        }
                    });
                    this.arrayListAgriculture.add(new t() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentAgriculture.7
                        private static int a = 1;
                        private static int b;

                        @Override // ivas.gov.bisp.enumeration.p026az.t
                        public String getDropDownViewLabel() {
                            int i9 = 2 % 2;
                            int i10 = a;
                            int i11 = (i10 ^ 115) + ((i10 & 115) << 1);
                            b = i11 % 128;
                            int i12 = i11 % 2;
                            String string = FragmentAgriculture.this.getResources().getString(R.string.agri_option3);
                            int i13 = a;
                            int i14 = (i13 & 53) + (i13 | 53);
                            b = i14 % 128;
                            if (i14 % 2 == 0) {
                                return string;
                            }
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }

                        public String getViewLabel() {
                            int i9 = 2 % 2;
                            int i10 = a;
                            int i11 = ((i10 & 102) + (i10 | 102)) - 1;
                            b = i11 % 128;
                            if (i11 % 2 == 0) {
                                return FragmentAgriculture.this.getResources().getString(R.string.agri_option3);
                            }
                            FragmentAgriculture.this.getResources().getString(R.string.agri_option3);
                            throw null;
                        }

                        public boolean isChecked() {
                            int i9 = 2 % 2;
                            int i10 = b;
                            int i11 = i10 & 85;
                            int i12 = (((i10 | 85) & (~i11)) - (~(i11 << 1))) - 1;
                            a = i12 % 128;
                            int i13 = i12 % 2;
                            return false;
                        }
                    });
                    o oVar2 = new o(getActivity(), R.layout.spinner_item, this.arrayListAgriculture);
                    this.adapterAgricultureOption = oVar2;
                    this.spinnerAgri.setAdapter((SpinnerAdapter) oVar2);
                }
            }
        } else if (ag.e) {
            ag.e = false;
            this.agriMemberArrayList = new ArrayList<>();
            this.spinnerAgri.setSelection(0);
            int i9 = e + 53;
            f = i9 % 128;
            int i10 = i9 % 2;
            while (i7 < this.activityBeginSurvey.aq.size()) {
                this.agriMemberArrayList.add(new AgriMember(this.activityBeginSurvey.aq.get(i7).name_of_member, this.activityBeginSurvey.aq.get(i7).roster_relational_id));
            }
            this.adapterAgriMember.h(this.agriMemberArrayList);
            if (ag.r) {
                ArrayList<t> arrayList3 = new ArrayList<>();
                this.arrayListAgriculture = arrayList3;
                arrayList3.add(new t() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentAgriculture.1
                    private static int a = 0;
                    private static int b = 1;

                    @Override // ivas.gov.bisp.enumeration.p026az.t
                    public String getDropDownViewLabel() {
                        int i11 = 2 % 2;
                        int i12 = b;
                        int i13 = i12 & 77;
                        int i14 = i13 + ((i12 ^ 77) | i13);
                        a = i14 % 128;
                        if (i14 % 2 != 0) {
                            FragmentAgriculture.this.getResources().getString(R.string.agri_option);
                            throw null;
                        }
                        String string = FragmentAgriculture.this.getResources().getString(R.string.agri_option);
                        int i15 = b;
                        int i16 = i15 ^ 87;
                        int i17 = ((i15 & 87) | i16) << 1;
                        int i18 = -i16;
                        int i19 = ((i17 | i18) << 1) - (i17 ^ i18);
                        a = i19 % 128;
                        int i110 = i19 % 2;
                        return string;
                    }

                    public String getViewLabel() {
                        int i11 = 2 % 2;
                        int i12 = a;
                        int i13 = i12 & 29;
                        int i14 = -(-(i12 | 29));
                        int i15 = (i13 & i14) + (i14 | i13);
                        b = i15 % 128;
                        int i16 = i15 % 2;
                        Resources resources = FragmentAgriculture.this.getResources();
                        if (i16 != 0) {
                            return resources.getString(R.string.agri_option);
                        }
                        resources.getString(R.string.agri_option);
                        throw null;
                    }

                    public boolean isChecked() {
                        int i11 = 2 % 2;
                        int i12 = a;
                        int i13 = i12 & 23;
                        int i14 = (i13 - (~((i12 ^ 23) | i13))) - 1;
                        b = i14 % 128;
                        int i15 = i14 % 2;
                        int i16 = i12 & 79;
                        int i17 = i16 + ((i12 ^ 79) | i16);
                        b = i17 % 128;
                        if (i17 % 2 != 0) {
                            return false;
                        }
                        throw null;
                    }
                });
                this.arrayListAgriculture.add(new t() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentAgriculture.2
                    private static int a = 1;
                    private static int b;

                    @Override // ivas.gov.bisp.enumeration.p026az.t
                    public String getDropDownViewLabel() {
                        int i11 = 2 % 2;
                        int i12 = a;
                        int i13 = i12 ^ 59;
                        int i14 = ((i12 & 59) | i13) << 1;
                        int i15 = -i13;
                        int i16 = (i14 ^ i15) + ((i14 & i15) << 1);
                        b = i16 % 128;
                        int i17 = i16 % 2;
                        String string = FragmentAgriculture.this.getResources().getString(R.string.agri_option1);
                        if (i17 != 0) {
                            int i18 = 82 / 0;
                        }
                        return string;
                    }

                    public String getViewLabel() {
                        int i11 = 2 % 2;
                        int i12 = a + 89;
                        b = i12 % 128;
                        int i13 = i12 % 2;
                        String string = FragmentAgriculture.this.getResources().getString(R.string.agri_option1);
                        int i14 = b;
                        int i15 = (i14 & 37) + (i14 | 37);
                        a = i15 % 128;
                        if (i15 % 2 != 0) {
                            return string;
                        }
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }

                    public boolean isChecked() {
                        int i11 = 2 % 2;
                        int i12 = a;
                        int i13 = ((i12 | 53) << 1) - (i12 ^ 53);
                        b = i13 % 128;
                        int i14 = i13 % 2;
                        return false;
                    }
                });
                this.arrayListAgriculture.add(new t() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentAgriculture.3
                    private static int a = 0;
                    private static int b = 1;

                    @Override // ivas.gov.bisp.enumeration.p026az.t
                    public String getDropDownViewLabel() {
                        int i11 = 2 % 2;
                        int i12 = b;
                        int i13 = i12 & 53;
                        int i14 = -(-((i12 ^ 53) | i13));
                        int i15 = (i13 & i14) + (i14 | i13);
                        a = i15 % 128;
                        if (i15 % 2 != 0) {
                            FragmentAgriculture.this.getResources().getString(R.string.agri_option2);
                            throw null;
                        }
                        String string = FragmentAgriculture.this.getResources().getString(R.string.agri_option2);
                        int i16 = a;
                        int i17 = (((i16 | 54) << 1) - (i16 ^ 54)) - 1;
                        b = i17 % 128;
                        int i18 = i17 % 2;
                        return string;
                    }

                    public String getViewLabel() {
                        int i11 = 2 % 2;
                        int i12 = a;
                        int i13 = i12 | 91;
                        int i14 = ((i13 << 1) - (~(-((~(i12 & 91)) & i13)))) - 1;
                        b = i14 % 128;
                        int i15 = i14 % 2;
                        String string = FragmentAgriculture.this.getResources().getString(R.string.agri_option2);
                        int i16 = b;
                        int i17 = i16 ^ 65;
                        int i18 = (((i16 & 65) | i17) << 1) - i17;
                        a = i18 % 128;
                        int i19 = i18 % 2;
                        return string;
                    }

                    public boolean isChecked() {
                        int i11 = 2 % 2;
                        int i12 = a;
                        int i13 = i12 & 69;
                        int i14 = ((i12 ^ 69) | i13) << 1;
                        int i15 = -((~i13) & (i12 | 69));
                        int i16 = ((i14 | i15) << 1) - (i14 ^ i15);
                        b = i16 % 128;
                        int i17 = i16 % 2;
                        int i18 = ((i12 ^ 65) - (~((i12 & 65) << 1))) - 1;
                        b = i18 % 128;
                        if (i18 % 2 != 0) {
                            return false;
                        }
                        throw null;
                    }
                });
                o oVar3 = new o(getActivity(), R.layout.spinner_item, this.arrayListAgriculture);
                this.adapterAgricultureOption = oVar3;
                this.spinnerAgri.setAdapter((SpinnerAdapter) oVar3);
                i = f + 45;
                e = i % 128;
                if (i % 2 != 0) {
                    int i11 = 4 % 2;
                }
            } else {
                ArrayList<t> arrayList4 = new ArrayList<>();
                this.arrayListAgriculture = arrayList4;
                arrayList4.add(new t() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentAgriculture.4
                    private static int a = 1;
                    private static int b;

                    @Override // ivas.gov.bisp.enumeration.p026az.t
                    public String getDropDownViewLabel() {
                        int i12 = 2 % 2;
                        int i13 = b;
                        int i14 = i13 & 69;
                        int i15 = -(-((i13 ^ 69) | i14));
                        int i16 = (i14 & i15) + (i15 | i14);
                        a = i16 % 128;
                        int i17 = i16 % 2;
                        String string = FragmentAgriculture.this.getResources().getString(R.string.agri_option);
                        int i18 = a + 125;
                        b = i18 % 128;
                        int i19 = i18 % 2;
                        return string;
                    }

                    public String getViewLabel() {
                        int i12 = 2 % 2;
                        int i13 = a + 59;
                        b = i13 % 128;
                        int i14 = i13 % 2;
                        String string = FragmentAgriculture.this.getResources().getString(R.string.agri_option);
                        int i15 = a;
                        int i16 = i15 & 73;
                        int i17 = -(-((i15 ^ 73) | i16));
                        int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
                        b = i18 % 128;
                        int i19 = i18 % 2;
                        return string;
                    }

                    public boolean isChecked() {
                        int i12 = 2 % 2;
                        int i13 = a;
                        int i14 = i13 & 41;
                        int i15 = i14 + ((i13 ^ 41) | i14);
                        b = i15 % 128;
                        int i16 = i15 % 2;
                        int i17 = ((i13 & 90) + (i13 | 90)) - 1;
                        b = i17 % 128;
                        int i18 = i17 % 2;
                        return false;
                    }
                });
                this.arrayListAgriculture.add(new t() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentAgriculture.5
                    private static int a = 0;
                    private static int b = 1;

                    @Override // ivas.gov.bisp.enumeration.p026az.t
                    public String getDropDownViewLabel() {
                        int i12 = 2 % 2;
                        int i13 = b + 101;
                        a = i13 % 128;
                        if (i13 % 2 != 0) {
                            FragmentAgriculture.this.getResources().getString(R.string.agri_option1);
                            throw null;
                        }
                        String string = FragmentAgriculture.this.getResources().getString(R.string.agri_option1);
                        int i14 = a + 41;
                        b = i14 % 128;
                        int i15 = i14 % 2;
                        return string;
                    }

                    public String getViewLabel() {
                        int i12 = 2 % 2;
                        int i13 = b;
                        int i14 = i13 & 25;
                        int i15 = (i13 | 25) & (~i14);
                        int i16 = -(-(i14 << 1));
                        int i17 = ((i15 | i16) << 1) - (i15 ^ i16);
                        a = i17 % 128;
                        int i18 = i17 % 2;
                        Resources resources = FragmentAgriculture.this.getResources();
                        if (i18 == 0) {
                            return resources.getString(R.string.agri_option1);
                        }
                        resources.getString(R.string.agri_option1);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }

                    public boolean isChecked() {
                        int i12 = 2 % 2;
                        int i13 = b;
                        int i14 = i13 & 11;
                        int i15 = i14 + ((i13 ^ 11) | i14);
                        a = i15 % 128;
                        int i16 = i15 % 2;
                        return false;
                    }
                });
                this.arrayListAgriculture.add(new t() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentAgriculture.6
                    private static int a = 1;
                    private static int b;

                    @Override // ivas.gov.bisp.enumeration.p026az.t
                    public String getDropDownViewLabel() {
                        int i12 = 2 % 2;
                        int i13 = b;
                        int i14 = i13 ^ 3;
                        int i15 = (((i13 & 3) | i14) << 1) - i14;
                        a = i15 % 128;
                        int i16 = i15 % 2;
                        String string = FragmentAgriculture.this.getResources().getString(R.string.agri_option2);
                        int i17 = a;
                        int i18 = (i17 ^ 21) + ((i17 & 21) << 1);
                        b = i18 % 128;
                        if (i18 % 2 == 0) {
                            return string;
                        }
                        throw null;
                    }

                    public String getViewLabel() {
                        int i12 = 2 % 2;
                        int i13 = b;
                        int i14 = i13 & 99;
                        int i15 = ((((i13 ^ 99) | i14) << 1) - (~(-((i13 | 99) & (~i14))))) - 1;
                        a = i15 % 128;
                        if (i15 % 2 != 0) {
                            return FragmentAgriculture.this.getResources().getString(R.string.agri_option2);
                        }
                        FragmentAgriculture.this.getResources().getString(R.string.agri_option2);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }

                    public boolean isChecked() {
                        int i12 = 2 % 2;
                        int i13 = a + 83;
                        b = i13 % 128;
                        int i14 = i13 % 2;
                        return false;
                    }
                });
                this.arrayListAgriculture.add(new t() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentAgriculture.7
                    private static int a = 1;
                    private static int b;

                    @Override // ivas.gov.bisp.enumeration.p026az.t
                    public String getDropDownViewLabel() {
                        int i12 = 2 % 2;
                        int i13 = a;
                        int i14 = (i13 ^ 115) + ((i13 & 115) << 1);
                        b = i14 % 128;
                        int i15 = i14 % 2;
                        String string = FragmentAgriculture.this.getResources().getString(R.string.agri_option3);
                        int i16 = a;
                        int i17 = (i16 & 53) + (i16 | 53);
                        b = i17 % 128;
                        if (i17 % 2 == 0) {
                            return string;
                        }
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }

                    public String getViewLabel() {
                        int i12 = 2 % 2;
                        int i13 = a;
                        int i14 = ((i13 & 102) + (i13 | 102)) - 1;
                        b = i14 % 128;
                        if (i14 % 2 == 0) {
                            return FragmentAgriculture.this.getResources().getString(R.string.agri_option3);
                        }
                        FragmentAgriculture.this.getResources().getString(R.string.agri_option3);
                        throw null;
                    }

                    public boolean isChecked() {
                        int i12 = 2 % 2;
                        int i13 = b;
                        int i14 = i13 & 85;
                        int i15 = (((i13 | 85) & (~i14)) - (~(i14 << 1))) - 1;
                        a = i15 % 128;
                        int i16 = i15 % 2;
                        return false;
                    }
                });
                o oVar4 = new o(getActivity(), R.layout.spinner_item, this.arrayListAgriculture);
                this.adapterAgricultureOption = oVar4;
                this.spinnerAgri.setAdapter((SpinnerAdapter) oVar4);
            }
        }
        super.onResume();
    }

    @Override // ivas.gov.bisp.enumeration.X.e
    public SupervisorParseObject parseJsonForSupervisor() {
        int i = 2 % 2;
        int i2 = e + 63;
        int i3 = i2 % 128;
        f = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 121;
        e = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Override // android.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = 2 % 2;
        super.onActivityResult(i, i2, intent);
        if (i == CODE_FAMILY) {
            getActivity();
            if (i2 == -1) {
                int i4 = f + 113;
                e = i4 % 128;
                int i5 = i4 % 2;
                Object[] objArr = new Object[1];
                a(11240 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), new char[]{47648, 37322, 60907, 14751, 5552, 25016}, objArr);
                this.agricultureDetailOfFamily = (AgricultureDetail) intent.getSerializableExtra(((String) objArr[0]).intern());
                Button button = this.buttonProceed;
                Activity activity = getActivity();
                Object obj = l.c;
                button.setBackgroundColor(l.aUI.b(activity, R.color.colorButtonGreen));
                return;
            }
            return;
        }
        int i6 = e + 21;
        int i7 = i6 % 128;
        f = i7;
        int i8 = i6 % 2;
        if (i == CODE_MEMBER) {
            int i9 = i7 + 33;
            e = i9 % 128;
            int i10 = i9 % 2;
            getActivity();
            if (i2 == -1) {
                Object[] objArr2 = new Object[1];
                a(11239 - TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0), new char[]{47648, 37322, 60907, 14751, 5552, 25016}, objArr2);
                AgricultureDetail agricultureDetail = (AgricultureDetail) intent.getSerializableExtra(((String) objArr2[0]).intern());
                Object[] objArr3 = new Object[1];
                a((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 45161, new char[]{47679, 2633, 56046, 43805, 31647, 51243, 38998, 26878}, objArr3);
                int intExtra = intent.getIntExtra(((String) objArr3[0]).intern(), 0);
                this.agriMemberArrayList.get(intExtra).setAgricultureDetail(agricultureDetail);
                this.agriMemberArrayList.get(intExtra).setIsDetailAdded(1);
                this.adapterAgriMember.h(this.agriMemberArrayList);
            }
        }
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ActivityBeginSurvey activityBeginSurvey;
        int i = 2 % 2;
        int i2 = f + 73;
        int i3 = i2 % 128;
        e = i3;
        int i4 = i2 % 2;
        try {
            if (this.parentView == null) {
                int i5 = i3 + 121;
                f = i5 % 128;
                if (i5 % 2 == 0) {
                    View viewInflate = layoutInflater.inflate(R.layout.fragment_agriculture, viewGroup, true);
                    this.parentView = viewInflate;
                    ButterKnife.c(this, viewInflate);
                    activityBeginSurvey = (ActivityBeginSurvey) getActivity();
                } else {
                    View viewInflate2 = layoutInflater.inflate(R.layout.fragment_agriculture, viewGroup, false);
                    this.parentView = viewInflate2;
                    ButterKnife.c(this, viewInflate2);
                    activityBeginSurvey = (ActivityBeginSurvey) getActivity();
                }
                this.activityBeginSurvey = activityBeginSurvey;
                generateBody();
            }
        } catch (Exception unused) {
        }
        return this.parentView;
    }

    @OnClick
    public void onProceedClick(View view) {
        boolean z;
        int i = 2 % 2;
        Intent intent = new Intent(getActivity(), (Class<?>) ActivityAgriculture.class);
        Object[] objArr = new Object[1];
        a(25523 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), new char[]{47676, 55701, 32071, 37169, 13551, 18517, 60450, 967, 42930, 15209, 24275, 62107, 5721}, objArr);
        intent.putExtra(((String) objArr[0]).intern(), false);
        Object[] objArr2 = new Object[1];
        a(ExpandableListView.getPackedPositionGroup(0L) + 11239, new char[]{47648, 37322, 60907, 14751, 5552, 25016}, objArr2);
        intent.putExtra(((String) objArr2[0]).intern(), this.agricultureDetailOfFamily);
        if (this.agricultureDetailOfFamily != null) {
            int i2 = e + 15;
            f = i2 % 128;
            int i3 = i2 % 2;
            z = true;
        } else {
            z = false;
        }
        Object[] objArr3 = new Object[1];
        a(13217 - View.MeasureSpec.getSize(0), new char[]{47654, 35229, 56658, 8393, 29871, 47107, 36861}, objArr3);
        intent.putExtra(((String) objArr3[0]).intern(), z);
        startActivityForResult(intent, CODE_FAMILY);
        int i4 = e + 75;
        f = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void generateBody() {
        int i = 2 % 2;
        ArrayList<t> arrayList = new ArrayList<>();
        this.arrayListAgriculture = arrayList;
        arrayList.add(new t() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentAgriculture.8
            private static int a = 1;
            private static int b;

            @Override // ivas.gov.bisp.enumeration.p026az.t
            public String getDropDownViewLabel() {
                int i2 = 2 % 2;
                int i3 = a;
                int i4 = i3 & 89;
                int i5 = (((i3 | 89) & (~i4)) - (~(-(-(i4 << 1))))) - 1;
                b = i5 % 128;
                int i6 = i5 % 2;
                String string = FragmentAgriculture.this.getResources().getString(R.string.agri_option);
                int i7 = b;
                int i8 = (i7 ^ 107) + ((i7 & 107) << 1);
                a = i8 % 128;
                if (i8 % 2 != 0) {
                    return string;
                }
                throw null;
            }

            public String getViewLabel() {
                int i2 = 2 % 2;
                int i3 = b;
                int i4 = ((i3 ^ 43) | (i3 & 43)) << 1;
                int i5 = -(((~i3) & 43) | (i3 & (-44)));
                int i6 = (i4 & i5) + (i5 | i4);
                a = i6 % 128;
                int i7 = i6 % 2;
                Resources resources = FragmentAgriculture.this.getResources();
                if (i7 != 0) {
                    return resources.getString(R.string.agri_option);
                }
                resources.getString(R.string.agri_option);
                throw null;
            }

            public boolean isChecked() {
                int i2 = 2 % 2;
                int i3 = b;
                int i4 = (((i3 | 116) << 1) - (i3 ^ 116)) - 1;
                int i5 = i4 % 128;
                a = i5;
                int i6 = i4 % 2;
                int i7 = i5 & 19;
                int i8 = ((i5 | 19) & (~i7)) + (i7 << 1);
                b = i8 % 128;
                if (i8 % 2 == 0) {
                    return false;
                }
                throw null;
            }
        });
        this.arrayListAgriculture.add(new t() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentAgriculture.9
            private static int a = 0;
            private static int b = 1;

            @Override // ivas.gov.bisp.enumeration.p026az.t
            public String getDropDownViewLabel() {
                int i2 = 2 % 2;
                int i3 = a;
                int i4 = ((i3 ^ 95) - (~((i3 & 95) << 1))) - 1;
                b = i4 % 128;
                if (i4 % 2 == 0) {
                    FragmentAgriculture.this.getResources().getString(R.string.agri_option1);
                    throw null;
                }
                String string = FragmentAgriculture.this.getResources().getString(R.string.agri_option1);
                int i5 = a;
                int i6 = ((i5 ^ 121) | (i5 & 121)) << 1;
                int i7 = -(((~i5) & 121) | (i5 & (-122)));
                int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
                b = i8 % 128;
                int i9 = i8 % 2;
                return string;
            }

            public String getViewLabel() {
                int i2 = 2 % 2;
                int i3 = b + 87;
                a = i3 % 128;
                int i4 = i3 % 2;
                String string = FragmentAgriculture.this.getResources().getString(R.string.agri_option1);
                int i5 = a;
                int i6 = (-2) - ((((i5 | 110) << 1) - (i5 ^ 110)) ^ (-1));
                b = i6 % 128;
                int i7 = i6 % 2;
                return string;
            }

            public boolean isChecked() {
                int i2 = 2 % 2;
                int i3 = b;
                int i4 = i3 & 51;
                int i5 = -(-((i3 ^ 51) | i4));
                int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
                a = i6 % 128;
                int i7 = i6 % 2;
                int i8 = i3 + 42;
                int i9 = (i8 ^ (-1)) + (i8 << 1);
                a = i9 % 128;
                if (i9 % 2 == 0) {
                    return false;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        this.arrayListAgriculture.add(new t() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentAgriculture.10
            private static int a = 1;
            private static int b;

            @Override // ivas.gov.bisp.enumeration.p026az.t
            public String getDropDownViewLabel() {
                int i2 = 2 % 2;
                int i3 = b;
                int i4 = (i3 & (-126)) | ((~i3) & 125);
                int i5 = -(-((i3 & 125) << 1));
                int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
                a = i6 % 128;
                int i7 = i6 % 2;
                String string = FragmentAgriculture.this.getResources().getString(R.string.agri_option2);
                int i8 = b;
                int i9 = ((i8 ^ 45) | (i8 & 45)) << 1;
                int i10 = -(((~i8) & 45) | (i8 & (-46)));
                int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
                a = i11 % 128;
                if (i11 % 2 != 0) {
                    return string;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public String getViewLabel() {
                int i2 = 2 % 2;
                int i3 = b;
                int i4 = i3 & 111;
                int i5 = (i3 | 111) & (~i4);
                int i6 = i4 << 1;
                int i7 = (i5 & i6) + (i5 | i6);
                a = i7 % 128;
                int i8 = i7 % 2;
                String string = FragmentAgriculture.this.getResources().getString(R.string.agri_option2);
                int i9 = a;
                int i10 = (i9 & 36) + (i9 | 36);
                int i11 = (i10 ^ (-1)) + (i10 << 1);
                b = i11 % 128;
                if (i11 % 2 == 0) {
                    return string;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public boolean isChecked() {
                int i2 = 2 % 2;
                int i3 = a + 60;
                int i4 = (i3 ^ (-1)) + (i3 << 1);
                b = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
        });
        this.arrayListAgriculture.add(new t() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentAgriculture.11
            private static int a = 1;
            private static int b;

            @Override // ivas.gov.bisp.enumeration.p026az.t
            public String getDropDownViewLabel() {
                int i2 = 2 % 2;
                int i3 = b;
                int i4 = ((i3 ^ 71) | (i3 & 71)) << 1;
                int i5 = -(((~i3) & 71) | (i3 & (-72)));
                int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
                a = i6 % 128;
                int i7 = i6 % 2;
                String string = FragmentAgriculture.this.getResources().getString(R.string.agri_option3);
                int i8 = a;
                int i9 = i8 & 77;
                int i10 = ((i8 ^ 77) | i9) << 1;
                int i11 = -((i8 | 77) & (~i9));
                int i12 = (i10 & i11) + (i11 | i10);
                b = i12 % 128;
                if (i12 % 2 == 0) {
                    return string;
                }
                throw null;
            }

            public String getViewLabel() {
                int i2 = 2 % 2;
                int i3 = a;
                int i4 = ((i3 & 60) + (i3 | 60)) - 1;
                b = i4 % 128;
                Object obj = null;
                if (i4 % 2 != 0) {
                    FragmentAgriculture.this.getResources().getString(R.string.agri_option3);
                    throw null;
                }
                String string = FragmentAgriculture.this.getResources().getString(R.string.agri_option3);
                int i5 = b;
                int i6 = (-2) - ((((i5 | 124) << 1) - (i5 ^ 124)) ^ (-1));
                a = i6 % 128;
                if (i6 % 2 != 0) {
                    return string;
                }
                obj.hashCode();
                throw null;
            }

            public boolean isChecked() {
                int i2 = 2 % 2;
                int i3 = b;
                int i4 = (((i3 | 96) << 1) - (i3 ^ 96)) - 1;
                int i5 = i4 % 128;
                a = i5;
                int i6 = i4 % 2;
                int i7 = i5 & 89;
                int i8 = i7 + ((i5 ^ 89) | i7);
                b = i8 % 128;
                if (i8 % 2 == 0) {
                    return false;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        o oVar = new o(getActivity(), R.layout.spinner_item, this.arrayListAgriculture);
        this.adapterAgricultureOption = oVar;
        this.spinnerAgri.setAdapter((SpinnerAdapter) oVar);
        this.spinnerAgri.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentAgriculture.12
            private static int a = 0;
            private static int b = 1;

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView<?> adapterView) {
                int i2 = 2 % 2;
                int i3 = b;
                int i4 = ((i3 | 21) << 1) - (i3 ^ 21);
                a = i4 % 128;
                if (i4 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Code duplicated, block: B:17:0x00a0  */
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j) {
                int i3 = 2 % 2;
                int i4 = a;
                int i5 = ((i4 | 13) << 1) - (i4 ^ 13);
                b = i5 % 128;
                int i6 = i5 % 2;
                if (i2 != 0) {
                    int i7 = i4 + 63;
                    b = i7 % 128;
                    int i8 = i7 % 2;
                    if (i2 != 3) {
                        int i9 = i4 ^ 99;
                        int i10 = ((((i4 & 99) | i9) << 1) - (~(-i9))) - 1;
                        int i11 = i10 % 128;
                        b = i11;
                        int i12 = i10 % 2;
                        if (i2 == 1) {
                            int i13 = i11 | 37;
                            int i14 = (i13 << 1) - (i13 & (~(i11 & 37)));
                            a = i14 % 128;
                            int i15 = i14 % 2;
                            FragmentAgriculture.this.cardViewMembers.setVisibility(0);
                            FragmentAgriculture fragmentAgriculture = FragmentAgriculture.this;
                            int i16 = a;
                            int i17 = (i16 ^ 17) + ((i16 & 17) << 1);
                            b = i17 % 128;
                            int i18 = i17 % 2;
                            fragmentAgriculture.buttonProceed.setVisibility(8);
                            int i19 = b + 23;
                            a = i19 % 128;
                            int i20 = i19 % 2;
                            return;
                        }
                        if (i2 == 2) {
                            int i21 = ((i11 | 99) << 1) - ((i11 & (-100)) | ((~i11) & 99));
                            a = i21 % 128;
                            if (i21 % 2 != 0) {
                                FragmentAgriculture.this.cardViewMembers.setVisibility(4);
                            } else {
                                FragmentAgriculture.this.cardViewMembers.setVisibility(8);
                            }
                            FragmentAgriculture fragmentAgriculture2 = FragmentAgriculture.this;
                            int i22 = b;
                            int i23 = i22 & 73;
                            int i24 = (i22 ^ 73) | i23;
                            int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
                            a = i25 % 128;
                            int i26 = i25 % 2;
                            fragmentAgriculture2.buttonProceed.setVisibility(0);
                            return;
                        }
                    } else {
                        FragmentAgriculture.this.buttonProceed.setVisibility(8);
                        int i27 = a;
                        int i28 = ((i27 ^ 70) + ((i27 & 70) << 1)) - 1;
                        b = i28 % 128;
                        int i29 = i28 % 2;
                        FragmentAgriculture.this.cardViewMembers.setVisibility(8);
                        int i30 = a;
                        int i31 = i30 | 63;
                        int i32 = i31 << 1;
                        int i33 = -((~(i30 & 63)) & i31);
                        int i34 = (i32 & i33) + (i33 | i32);
                        b = i34 % 128;
                        int i35 = i34 % 2;
                    }
                } else {
                    FragmentAgriculture.this.buttonProceed.setVisibility(8);
                    int i210 = a;
                    int i211 = ((i210 ^ 70) + ((i210 & 70) << 1)) - 1;
                    b = i211 % 128;
                    int i212 = i211 % 2;
                    FragmentAgriculture.this.cardViewMembers.setVisibility(8);
                    int i36 = a;
                    int i37 = i36 | 63;
                    int i38 = i37 << 1;
                    int i39 = -((~(i36 & 63)) & i37);
                    int i310 = (i38 & i39) + (i39 | i38);
                    b = i310 % 128;
                    int i311 = i310 % 2;
                }
                int i40 = b;
                int i41 = (((i40 ^ 43) | (i40 & 43)) << 1) - (((~i40) & 43) | (i40 & (-44)));
                a = i41 % 128;
                if (i41 % 2 != 0) {
                    int i42 = 56 / 0;
                }
            }
        });
        this.agriMemberArrayList = new ArrayList<>();
        int i2 = f + 53;
        e = i2 % 128;
        int i3 = i2 % 2;
        for (int i4 = 0; i4 < this.activityBeginSurvey.aq.size(); i4++) {
            this.agriMemberArrayList.add(new AgriMember(this.activityBeginSurvey.aq.get(i4).name_of_member, this.activityBeginSurvey.aq.get(i4).roster_relational_id));
        }
        this.recyclerViewMembers.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        this.mLayoutManagerMembers = linearLayoutManager;
        this.recyclerViewMembers.setLayoutManager(linearLayoutManager);
        AdapterAgriMember adapterAgriMember = new AdapterAgriMember(getActivity(), this.agriMemberArrayList, new AdapterAgriMember.OooO00o() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentAgriculture.13
            private static int a = 0;
            private static int b = 1;

            @Override // ivas.gov.bisp.enumeration.adapters.AdapterAgriMember.OooO00o
            public void onDetailButtonClick(int i5) {
                boolean z;
                FragmentAgriculture fragmentAgriculture;
                int i6;
                int i7 = 2 % 2;
                Intent intent = new Intent(FragmentAgriculture.this.getActivity(), (Class<?>) ActivityAgriculture.class);
                int i8 = a;
                int i9 = i8 & 63;
                int i10 = i8 | 63;
                int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
                b = i11 % 128;
                if (i11 % 2 == 0) {
                    FragmentAgriculture.this.agriMemberArrayList.get(i5);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                intent.putExtra("object", FragmentAgriculture.this.agriMemberArrayList.get(i5));
                intent.putExtra("position", i5);
                int i12 = b;
                int i13 = (i12 & 71) + (i12 | 71);
                a = i13 % 128;
                int i14 = i13 % 2;
                AgriMember agriMember = FragmentAgriculture.this.agriMemberArrayList.get(i5);
                int i15 = b;
                int i16 = i15 & 9;
                int i17 = i16 + ((i15 ^ 9) | i16);
                a = i17 % 128;
                if (i17 % 2 == 0 ? agriMember.getIsDetailAdded() != 1 : agriMember.getIsDetailAdded() != 0) {
                    int i18 = b;
                    int i19 = (i18 & (-50)) | ((~i18) & 49);
                    int i20 = (i18 & 49) << 1;
                    int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
                    a = i21 % 128;
                    int i22 = i21 % 2;
                    z = false;
                } else {
                    int i23 = a + 113;
                    b = i23 % 128;
                    int i24 = i23 % 2;
                    z = true;
                }
                intent.putExtra("is_edit", z);
                int i25 = a;
                int i26 = ((i25 & (-102)) | ((~i25) & 101)) + ((i25 & 101) << 1);
                b = i26 % 128;
                if (i26 % 2 == 0) {
                    intent.putExtra("single_member", false);
                    fragmentAgriculture = FragmentAgriculture.this;
                    i6 = 31203;
                } else {
                    intent.putExtra("single_member", true);
                    fragmentAgriculture = FragmentAgriculture.this;
                    i6 = FragmentAgriculture.CODE_MEMBER;
                }
                fragmentAgriculture.startActivityForResult(intent, i6);
                int i27 = a;
                int i28 = i27 & 67;
                int i29 = i28 + ((i27 ^ 67) | i28);
                b = i29 % 128;
                if (i29 % 2 == 0) {
                    int i30 = 90 / 0;
                }
            }

            @Override // ivas.gov.bisp.enumeration.adapters.AdapterAgriMember.OooO00o
            public void onCheckBoxClick(int i5) {
                int i6 = 2 % 2;
                int i7 = a + 105;
                b = i7 % 128;
                if (i7 % 2 == 0) {
                    FragmentAgriculture.this.agriMemberArrayList.get(i5).getIsSelected();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (FragmentAgriculture.this.agriMemberArrayList.get(i5).getIsSelected() == 0) {
                    int i8 = b;
                    int i9 = i8 & 51;
                    int i10 = (i8 | 51) & (~i9);
                    int i11 = i9 << 1;
                    int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
                    a = i12 % 128;
                    int i13 = i12 % 2;
                    FragmentAgriculture.this.agriMemberArrayList.get(i5).setIsSelected(1);
                } else {
                    FragmentAgriculture.this.agriMemberArrayList.get(i5).setIsSelected(0);
                    int i14 = b;
                    int i15 = i14 & 89;
                    int i16 = (i14 ^ 89) | i15;
                    int i17 = (i15 & i16) + (i16 | i15);
                    a = i17 % 128;
                    int i18 = i17 % 2;
                }
                FragmentAgriculture.access$000(FragmentAgriculture.this).h(FragmentAgriculture.this.agriMemberArrayList);
                int i19 = a;
                int i20 = (((i19 & (-14)) | ((~i19) & 13)) - (~(-(-((i19 & 13) << 1))))) - 1;
                b = i20 % 128;
                int i21 = i20 % 2;
            }
        });
        this.adapterAgriMember = adapterAgriMember;
        this.recyclerViewMembers.setAdapter(adapterAgriMember);
    }

    @Override // ivas.gov.bisp.enumeration.X.e
    public void parseJson() {
        int i = 2 % 2;
        if (this.spinnerAgri.getSelectedItemPosition() == 3) {
            int i2 = f + 113;
            e = i2 % 128;
            int i3 = i2 % 2;
            this.activityBeginSurvey.aG.agriTypeOption = this.arrayListAgriculture.get(3).getDropDownViewLabel();
            Survey survey = this.activityBeginSurvey.aG;
            survey.agriTypeOptionId = 3;
            survey.agriJson = BuildConfig.FLAVOR;
            int i4 = e + 27;
            f = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 53 / 0;
                return;
            }
            return;
        }
        if (this.spinnerAgri.getSelectedItemPosition() == 2) {
            this.activityBeginSurvey.aG.agriTypeOption = this.arrayListAgriculture.get(2).getDropDownViewLabel();
            this.activityBeginSurvey.aG.agriTypeOptionId = 2;
            Object[] objArr = new Object[1];
            a(60913 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0), new char[]{47640, 22486, 25026, 29680, 3566, 8154, 10639, 15289, 54698, 59231, 61769, 33645}, objArr);
            AgriMember agriMember = new AgriMember(((String) objArr[0]).intern(), 0, 1, 1, this.agricultureDetailOfFamily);
            try {
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(agriMember.getJson());
                this.activityBeginSurvey.aG.agriJson = jSONArray.toString();
                return;
            } catch (JSONException unused) {
                return;
            }
        }
        if (this.spinnerAgri.getSelectedItemPosition() == 1) {
            JSONArray jSONArray2 = new JSONArray();
            for (int i6 = 0; i6 < this.agriMemberArrayList.size(); i6++) {
                if (this.agriMemberArrayList.get(i6).getIsSelected() == 1) {
                    int i7 = e + 83;
                    f = i7 % 128;
                    if (i7 % 2 == 0) {
                        try {
                            jSONArray2.put(this.agriMemberArrayList.get(i6).getJson());
                            int i8 = 75 / 0;
                        } catch (JSONException unused2) {
                            continue;
                        }
                    } else {
                        jSONArray2.put(this.agriMemberArrayList.get(i6).getJson());
                    }
                }
            }
            this.activityBeginSurvey.aG.agriTypeOption = this.arrayListAgriculture.get(1).getDropDownViewLabel();
            Survey survey2 = this.activityBeginSurvey.aG;
            survey2.agriTypeOptionId = 1;
            survey2.agriJson = jSONArray2.toString();
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
        int i4 = $10 + 21;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (mVar.e < cArr.length) {
            int i6 = $10 + 65;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                jArr[mVar.e] = (((long) cArr[mVar.e]) ^ (((long) mVar.e) + ((long) mVar.d))) & (d$s51$1215 * 6031393033645231780L);
                i2 = mVar.e;
            } else {
                jArr[mVar.e] = (6031393033645231780L ^ d$s51$1215) ^ (((long) cArr[mVar.e]) ^ (((long) mVar.e) * ((long) mVar.d)));
                i2 = mVar.e + 1;
            }
            mVar.e = i2;
        }
        char[] cArr2 = new char[length];
        mVar.e = 0;
        while (mVar.e < cArr.length) {
            int i7 = $10 + 19;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                cArr2[mVar.e] = (char) jArr[mVar.e];
            } else {
                cArr2[mVar.e] = (char) jArr[mVar.e];
            }
            mVar.e++;
        }
        objArr[0] = new String(cArr2);
    }
}
