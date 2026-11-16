package ivas.gov.bisp.enumeration.fragments;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.ButterKnife;
import ivas.gov.bisp.enumeration.ActivityBeginSurvey;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.X.e;
import ivas.gov.bisp.enumeration.bK.ac;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.models.Roster;
import ivas.gov.bisp.enumeration.models.SupervisorParseObject;
import ivas.gov.bisp.enumeration.o000Oo00.Oooo0;
import ivas.gov.bisp.enumeration.p026az.t;
import ivas.gov.bisp.enumeration.p051bx.o;
import java.util.ArrayList;
import net.sqlcipher.BuildConfig;
import o.l;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"DefaultLocale"})
public class FragmentRespondant extends Fragment implements e {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int c = 0;
    private static int c$s65$99 = 937766560;
    private static int d = 1;
    private static boolean e$s68$99 = true;
    private ActivityBeginSurvey activityBeginSurvey;
    private Oooo0<t> adapterRespondant;
    private ArrayList<t> arrayListRespondant;
    private View parentView = null;

    @BindView
    public Spinner spinnerRespondant;
    private static char[] b$s64$99 = {11912, 11904, 11993, 11986, 11969, 11990, 11980, 11989, 11991, 11996, 11976, 11987, 11913, 12019, 11981, 11988, 11971, 11984, 12018, 11970, 11919, 12021, 11977};
    private static boolean a$s67$99 = true;

    public static /* synthetic */ ActivityBeginSurvey access$000(FragmentRespondant fragmentRespondant) {
        int i = 2 % 2;
        int i2 = d + 67;
        c = i2 % 128;
        if (i2 % 2 == 0) {
            return fragmentRespondant.activityBeginSurvey;
        }
        ActivityBeginSurvey activityBeginSurvey = fragmentRespondant.activityBeginSurvey;
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.X.e
    public boolean isValid() {
        Activity activity;
        Object obj;
        int i = 2 % 2;
        int i2 = d + 123;
        c = i2 % 128;
        int i3 = i2 % 2;
        if (this.spinnerRespondant.getSelectedItemPosition() == 0) {
            Activity activity2 = getActivity();
            Object[] objArr = new Object[1];
            a(126 - ((byte) KeyEvent.getModifierMetaStateMask()), null, new byte[]{-121, -113, -113, -111, -119, -124, -110, -126, -119, -118, -126, -118, -122, -113, -121, -122, -119, -110, -116, -113, -124, -126, -118, -111, -113, -112, -113, -114}, null, objArr);
            Toast.makeText(activity2, ((String) objArr[0]).intern(), 0).show();
            return false;
        }
        if (this.activityBeginSurvey.aq.get(this.spinnerRespondant.getSelectedItemPosition() - 1).disability != 9) {
            int i4 = c + 113;
            d = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 86 / 0;
            }
            return true;
        }
        int i6 = d + 73;
        c = i6 % 128;
        if (i6 % 2 != 0) {
            activity = getActivity();
            Object[] objArr2 = new Object[1];
            a(11409 - Process.getGidForName(BuildConfig.FLAVOR), null, new byte[]{-107, -121, -113, -124, -105, -123, -110, -120, -105, -126, -125, -112, -112, -123, -118, -122, -113, -106, -107, -126, -113, -108, -126, -118, -119, -122, -122, -123, -111, -126, -118, -122, -113, -121, -122, -119, -110, -116, -113, -109}, null, objArr2);
            obj = objArr2[0];
        } else {
            activity = getActivity();
            Object[] objArr3 = new Object[1];
            a(Process.getGidForName(BuildConfig.FLAVOR) + 128, null, new byte[]{-107, -121, -113, -124, -105, -123, -110, -120, -105, -126, -125, -112, -112, -123, -118, -122, -113, -106, -107, -126, -113, -108, -126, -118, -119, -122, -122, -123, -111, -126, -118, -122, -113, -121, -122, -119, -110, -116, -113, -109}, null, objArr3);
            obj = objArr3[0];
        }
        Toast.makeText(activity, ((String) obj).intern(), 0).show();
        return false;
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 2 % 2;
        int i2 = c + 59;
        d = i2 % 128;
        int i3 = i2 % 2;
        try {
            if (this.parentView == null) {
                View viewInflate = layoutInflater.inflate(R.layout.fragment_respondant, viewGroup, false);
                this.parentView = viewInflate;
                ButterKnife.c(this, viewInflate);
                this.activityBeginSurvey = (ActivityBeginSurvey) getActivity();
            }
        } catch (Exception unused) {
        }
        initFragment();
        View view = this.parentView;
        int i4 = d + 101;
        c = i4 % 128;
        int i5 = i4 % 2;
        return view;
    }

    @Override // ivas.gov.bisp.enumeration.X.e
    public SupervisorParseObject parseJsonForSupervisor() {
        int i = 2 % 2;
        int i2 = d + 19;
        int i3 = i2 % 128;
        c = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 43;
        d = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    @Override // android.app.Fragment
    public void onResume() {
        int i = 2 % 2;
        int i2 = c + 59;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            super.onResume();
            boolean z = ag.m;
            throw null;
        }
        super.onResume();
        if (ag.m) {
            this.spinnerRespondant.setSelection(0);
            Oooo0<t> oooo0 = this.adapterRespondant;
            oooo0.c = 0;
            oooo0.notifyDataSetChanged();
            ag.m = false;
            int i3 = d + 123;
            c = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    private void initFragment() {
        int i = 2 % 2;
        ArrayList<t> arrayList = new ArrayList<>();
        this.arrayListRespondant = arrayList;
        arrayList.add(0, new t() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentRespondant.1
            private static int a = 1;
            private static int b;

            @Override // ivas.gov.bisp.enumeration.p026az.t
            public String getDropDownViewLabel() {
                int i2 = 2 % 2;
                int i3 = b;
                int i4 = ((((i3 ^ 5) | (i3 & 5)) << 1) - (~(-((i3 & (-6)) | ((~i3) & 5))))) - 1;
                a = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 ^ 99;
                int i7 = ((((i3 & 99) | i6) << 1) - (~(-i6))) - 1;
                a = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 21 / 0;
                }
                return "Please Select Respondent";
            }

            public String getViewLabel() {
                int i2 = 2 % 2;
                int i3 = a;
                int i4 = (i3 & (-100)) | ((~i3) & 99);
                int i5 = -(-((i3 & 99) << 1));
                int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
                int i7 = i6 % 128;
                b = i7;
                int i8 = i6 % 2;
                int i9 = i7 + 11;
                a = i9 % 128;
                int i10 = i9 % 2;
                return "Please Select Respondent";
            }

            public boolean isChecked() {
                int i2 = 2 % 2;
                int i3 = a;
                int i4 = (-2) - (((i3 & 78) + (i3 | 78)) ^ (-1));
                b = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
        });
        ArrayList<Roster> arrayList2 = this.activityBeginSurvey.aq;
        if (arrayList2 != null) {
            int i2 = c + 51;
            d = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                arrayList2.size();
                obj.hashCode();
                throw null;
            }
            if (arrayList2.size() > 0) {
                int i3 = c + 41;
                d = i3 % 128;
                int i4 = i3 % 2;
                for (final int i5 = 0; i5 < this.activityBeginSurvey.aq.size(); i5++) {
                    Object[] objArr = new Object[1];
                    a(127 - (ViewConfiguration.getScrollBarSize() >> 8), null, new byte[]{-127}, null, objArr);
                    StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w(((String) objArr[0]).intern());
                    sbW.append(this.activityBeginSurvey.aq.get(i5).age_year);
                    Object[] objArr2 = new Object[1];
                    a(127 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), null, new byte[]{-126, -121, -122, -123, -126, -124, -125, -126}, null, objArr2);
                    sbW.append(((String) objArr2[0]).intern());
                    int i6 = this.activityBeginSurvey.aq.get(i5).age_month;
                    Object[] objArr3 = new Object[1];
                    a((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 128, null, new byte[]{-115, -116, -117, -118, -122, -119, -120, -126}, null, objArr3);
                    final String strS = ivas.gov.bisp.enumeration.p091n.j.s(sbW, i6, ((String) objArr3[0]).intern());
                    this.arrayListRespondant.add(new t() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentRespondant.2
                        private static int a = 0;
                        private static int b = 1;

                        public boolean isChecked() {
                            int i7 = 2 % 2;
                            int i8 = a + 64;
                            int i9 = (i8 ^ (-1)) + (i8 << 1);
                            int i10 = i9 % 128;
                            b = i10;
                            int i11 = i9 % 2;
                            int i12 = i10 & 95;
                            int i13 = -(-((i10 ^ 95) | i12));
                            int i14 = (i12 & i13) + (i13 | i12);
                            a = i14 % 128;
                            int i15 = i14 % 2;
                            return false;
                        }

                        @Override // ivas.gov.bisp.enumeration.p026az.t
                        public String getDropDownViewLabel() {
                            int i7 = 2 % 2;
                            StringBuilder sb = new StringBuilder();
                            ActivityBeginSurvey activityBeginSurveyAccess$000 = FragmentRespondant.access$000(FragmentRespondant.this);
                            int i8 = a;
                            int i9 = i8 ^ 107;
                            int i10 = ((i8 & 107) | i9) << 1;
                            int i11 = -i9;
                            int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
                            b = i12 % 128;
                            if (i12 % 2 == 0) {
                                activityBeginSurveyAccess$000.aq.get(i5);
                                throw null;
                            }
                            sb.append(activityBeginSurveyAccess$000.aq.get(i5).name_of_member);
                            sb.append(" - Age ");
                            int i13 = b;
                            int i14 = i13 ^ 105;
                            int i15 = ((i13 & 105) | i14) << 1;
                            int i16 = -i14;
                            int i17 = (i15 & i16) + (i15 | i16);
                            a = i17 % 128;
                            int i18 = i17 % 2;
                            sb.append(strS);
                            String string = sb.toString();
                            int i19 = b;
                            int i20 = (((i19 | 74) << 1) - (i19 ^ 74)) - 1;
                            a = i20 % 128;
                            int i21 = i20 % 2;
                            return string;
                        }

                        public String getViewLabel() {
                            String str;
                            int i7 = 2 % 2;
                            StringBuilder sb = new StringBuilder();
                            FragmentRespondant fragmentRespondant = FragmentRespondant.this;
                            int i8 = b;
                            int i9 = i8 & 103;
                            int i10 = -(-(i8 | 103));
                            int i11 = (i9 & i10) + (i10 | i9);
                            a = i11 % 128;
                            Object obj2 = null;
                            if (i11 % 2 != 0) {
                                ArrayList<Roster> arrayList3 = FragmentRespondant.access$000(fragmentRespondant).aq;
                                obj2.hashCode();
                                throw null;
                            }
                            sb.append(FragmentRespondant.access$000(fragmentRespondant).aq.get(i5).name_of_member);
                            int i12 = a + 81;
                            b = i12 % 128;
                            if (i12 % 2 == 0) {
                                sb.append(" - Age ");
                                str = strS;
                                int i13 = 46 / 0;
                            } else {
                                sb.append(" - Age ");
                                str = strS;
                            }
                            int i14 = a + 31;
                            b = i14 % 128;
                            if (i14 % 2 != 0) {
                                sb.append(str);
                                return sb.toString();
                            }
                            sb.append(str);
                            sb.toString();
                            throw null;
                        }
                    });
                }
            }
        }
        o oVar = new o(getActivity(), R.layout.spinner_item, this.arrayListRespondant);
        this.adapterRespondant = oVar;
        this.spinnerRespondant.setAdapter((SpinnerAdapter) oVar);
        ac.m(new Spinner[]{this.spinnerRespondant}, new o[]{this.adapterRespondant});
    }

    @Override // ivas.gov.bisp.enumeration.X.e
    public void parseJson() {
        int i = 2 % 2;
        ArrayList<Roster> arrayList = this.activityBeginSurvey.aq;
        if (arrayList != null) {
            int i2 = d + 125;
            c = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 0 / 0;
                if (arrayList.size() <= 0) {
                    return;
                }
            } else if (arrayList.size() <= 0) {
                return;
            }
            int i4 = c + 59;
            d = i4 % 128;
            int i5 = i4 % 2;
            if (this.spinnerRespondant.getSelectedItemPosition() != 0) {
                int selectedItemPosition = this.spinnerRespondant.getSelectedItemPosition();
                int i6 = 0;
                while (i6 < this.activityBeginSurvey.aq.size()) {
                    int i7 = c + 109;
                    d = i7 % 128;
                    if (i7 % 2 == 0) {
                        this.activityBeginSurvey.aq.get(i6).isRespondent = 1;
                        i6 += 45;
                    } else {
                        this.activityBeginSurvey.aq.get(i6).isRespondent = 0;
                        i6++;
                    }
                    int i8 = d + 53;
                    c = i8 % 128;
                    int i9 = i8 % 2;
                }
                for (int i10 = 0; i10 < this.activityBeginSurvey.aq.size(); i10++) {
                    if (i10 == selectedItemPosition - 1) {
                        this.activityBeginSurvey.aq.get(i10).isRespondent = 1;
                        return;
                    }
                }
            }
        }
    }

    private static void a(int i, char[] cArr, byte[] bArr, int[] iArr, Object[] objArr) {
        int i2;
        int i3 = 2 % 2;
        l lVar = new l();
        char[] cArr2 = b$s64$99;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                cArr3[i4] = (char) (((long) cArr2[i4]) ^ 1962356595541487140L);
                i4++;
                int i5 = $11 + 99;
                $10 = i5 % 128;
                int i6 = i5 % 2;
            }
            cArr2 = cArr3;
        }
        int i7 = (int) (1962356595541487140L ^ ((long) c$s65$99));
        if (e$s68$99) {
            lVar.d = bArr.length;
            char[] cArr4 = new char[lVar.d];
            lVar.a = 0;
            while (lVar.a < lVar.d) {
                cArr4[lVar.a] = (char) (cArr2[bArr[(lVar.d - 1) - lVar.a] + i] - i7);
                lVar.a++;
            }
            String str = new String(cArr4);
            int i8 = $10 + 39;
            $11 = i8 % 128;
            if (i8 % 2 != 0) {
                objArr[0] = str;
                return;
            } else {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        if (a$s67$99) {
            int i9 = $11 + 103;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            lVar.d = cArr.length;
            char[] cArr5 = new char[lVar.d];
            lVar.a = 0;
            while (lVar.a < lVar.d) {
                cArr5[lVar.a] = (char) (cArr2[cArr[(lVar.d - 1) - lVar.a] - i] - i7);
                lVar.a++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        lVar.d = iArr.length;
        char[] cArr6 = new char[lVar.d];
        lVar.a = 0;
        while (lVar.a < lVar.d) {
            int i11 = $11 + 39;
            $10 = i11 % 128;
            if (i11 % 2 != 0) {
                cArr6[lVar.a] = (char) (cArr2[iArr[lVar.d % lVar.a] + i] / i7);
                i2 = lVar.a;
            } else {
                cArr6[lVar.a] = (char) (cArr2[iArr[(lVar.d - 1) - lVar.a] - i] - i7);
                i2 = lVar.a + 1;
            }
            lVar.a = i2;
        }
        objArr[0] = new String(cArr6);
    }
}
