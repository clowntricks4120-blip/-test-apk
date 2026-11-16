package ivas.gov.bisp.enumeration.fragments;

import android.app.Activity;
import android.app.Fragment;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import ivas.gov.bisp.enumeration.ActivityBeginSurvey;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.W.InterfaceC0029o;
import ivas.gov.bisp.enumeration.X.e;
import ivas.gov.bisp.enumeration.bG.B;
import ivas.gov.bisp.enumeration.bG.C0118b;
import ivas.gov.bisp.enumeration.bG.F;
import ivas.gov.bisp.enumeration.bG.ae;
import ivas.gov.bisp.enumeration.bG.af;
import ivas.gov.bisp.enumeration.bG.ai;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.bK.d;
import ivas.gov.bisp.enumeration.cP.C;
import ivas.gov.bisp.enumeration.cP.C0245o;
import ivas.gov.bisp.enumeration.cP.Q;
import ivas.gov.bisp.enumeration.cP.z;
import ivas.gov.bisp.enumeration.models.Roster;
import ivas.gov.bisp.enumeration.models.SupervisorParseObject;
import ivas.gov.bisp.enumeration.p052by.aY;
import ivas.gov.bisp.enumeration.p086i.l;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import net.sqlcipher.BuildConfig;
import o.g;

/* JADX INFO: loaded from: classes.dex */
public class FragmentRelationship extends Fragment implements e {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final int CHECK_LESS_THAN_ZERO = 0;
    private static final int FOUR_WIFE_CHECK = 4;
    private static final int OPTION_NOT_ALIVE_ID = -2;
    private static final int OPTION_NOT_INLIST_ID = -3;
    private static final int OPTION_PLEASE_CHOOSE_ID = -1;
    private static final int POSITION_FATHER_SPINNER = 2;
    private static final int POSITION_MOTHER_SPINNER = 3;
    private static final int POSITION_NAME_LAYOUT = 0;
    private static final int POSITION_SPOUSE_SPINNER = 1;
    private static final int SETTING_FATHER_SPINNER = 2;
    private static final int SETTING_MOTHER_SPINNER = 3;
    private static final int SETTING_SPOUSE_SPINNER = 1;
    private static char a$s47$5919 = 45183;
    private static int b$s46$5919 = 1174568310;
    private static long d$s40$5816 = 5206051437023162672L;
    private static long d$s45$5919 = -1116422076781920906L;
    private static int e = 0;
    private static int f = 1;
    private LinearLayout linearLayout;
    private ArrayList<B> mPersonList = new ArrayList<>();
    private View parentView;

    public static /* synthetic */ View access$000(FragmentRelationship fragmentRelationship) {
        int i = 2 % 2;
        int i2 = e + 27;
        int i3 = i2 % 128;
        f = i3;
        int i4 = i2 % 2;
        View view = fragmentRelationship.parentView;
        int i5 = i3 + 39;
        e = i5 % 128;
        int i6 = i5 % 2;
        return view;
    }

    public static /* synthetic */ boolean access$100(FragmentRelationship fragmentRelationship, View view, B b, B b2) {
        int i = 2 % 2;
        int i2 = e + 101;
        f = i2 % 128;
        int i3 = i2 % 2;
        boolean zCheckIfToEnableFemaleFromAllOtherMaleList = fragmentRelationship.checkIfToEnableFemaleFromAllOtherMaleList(view, b, b2);
        int i4 = e + 73;
        f = i4 % 128;
        int i5 = i4 % 2;
        return zCheckIfToEnableFemaleFromAllOtherMaleList;
    }

    public static /* synthetic */ void access$1000(FragmentRelationship fragmentRelationship, B b, B b2, B b3, B b4) {
        int i = 2 % 2;
        int i2 = f + 77;
        e = i2 % 128;
        int i3 = i2 % 2;
        fragmentRelationship.disableFemaleFromHusbandMotherList(b, b2, b3, b4);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void access$1100(FragmentRelationship fragmentRelationship, LinearLayout linearLayout, B b, B b2) {
        int i = 2 % 2;
        int i2 = e + 91;
        f = i2 % 128;
        int i3 = i2 % 2;
        fragmentRelationship.disableFatherFromSpouseList(linearLayout, b, b2);
        int i4 = f + 79;
        e = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 58 / 0;
        }
    }

    public static /* synthetic */ void access$1200(FragmentRelationship fragmentRelationship, View view, B b, B b2, B b3) {
        int i = 2 % 2;
        int i2 = e + 41;
        f = i2 % 128;
        int i3 = i2 % 2;
        fragmentRelationship.disableFatherFromSon(view, b, b2, b3);
        if (i3 == 0) {
            int i4 = 99 / 0;
        }
    }

    public static /* synthetic */ void access$1300(FragmentRelationship fragmentRelationship, B b, B b2, B b3, B b4) {
        int i = 2 % 2;
        int i2 = e + 3;
        f = i2 % 128;
        int i3 = i2 % 2;
        fragmentRelationship.disableSpouseMotherListFemale(b, b2, b3, b4);
        if (i3 == 0) {
            int i4 = 49 / 0;
        }
        int i5 = f + 111;
        e = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void access$1400(FragmentRelationship fragmentRelationship, LinearLayout linearLayout, B b, B b2) {
        int i = 2 % 2;
        int i2 = f + 83;
        e = i2 % 128;
        int i3 = i2 % 2;
        fragmentRelationship.disableMotherFromSpouseList(linearLayout, b, b2);
        int i4 = e + 7;
        f = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void access$1500(FragmentRelationship fragmentRelationship, View view, B b, B b2, B b3) {
        int i = 2 % 2;
        int i2 = e + 95;
        f = i2 % 128;
        int i3 = i2 % 2;
        fragmentRelationship.disableMotherFromDaughter(view, b, b2, b3);
        int i4 = e + 87;
        f = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 16 / 0;
        }
    }

    public static /* synthetic */ void access$200(FragmentRelationship fragmentRelationship, View view, Spinner spinner, B b, B b2, B b3, List list, int i, boolean z) {
        int i2 = 2 % 2;
        int i3 = e + 11;
        f = i3 % 128;
        if (i3 % 2 == 0) {
            fragmentRelationship.updateFemaleSpouseOfOtherMalesListWhenWifeSelected(view, spinner, b, b2, b3, list, i, z);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        fragmentRelationship.updateFemaleSpouseOfOtherMalesListWhenWifeSelected(view, spinner, b, b2, b3, list, i, z);
        int i4 = e + 51;
        f = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void access$300(FragmentRelationship fragmentRelationship, B b, B b2, Spinner spinner) {
        int i = 2 % 2;
        int i2 = f + 53;
        e = i2 % 128;
        int i3 = i2 % 2;
        fragmentRelationship.disableSpouseFromMotherList(b, b2, spinner);
        int i4 = e + 83;
        f = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void access$400(FragmentRelationship fragmentRelationship, View view, Spinner spinner, B b, B b2, B b3, List list, int i) {
        int i2 = 2 % 2;
        int i3 = e + 81;
        f = i3 % 128;
        int i4 = i3 % 2;
        fragmentRelationship.disableSpouseFromFathersWifeList(view, spinner, b, b2, b3, list, i);
        if (i4 == 0) {
            int i5 = 30 / 0;
        }
        int i6 = f + 95;
        e = i6 % 128;
        int i7 = i6 % 2;
    }

    public static /* synthetic */ void access$500(FragmentRelationship fragmentRelationship, View view, Spinner spinner, B b, B b2, B b3, List list, int i, B b4) {
        int i2 = 2 % 2;
        int i3 = e + 53;
        f = i3 % 128;
        int i4 = i3 % 2;
        fragmentRelationship.enableMaleFromFatherListOnSpouseChanged(view, spinner, b, b2, b3, list, i, b4);
        if (i4 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void access$600(FragmentRelationship fragmentRelationship, View view, B b, B b2, Spinner spinner, B b3) {
        int i = 2 % 2;
        int i2 = f + 53;
        e = i2 % 128;
        int i3 = i2 % 2;
        fragmentRelationship.updateMaleListOnWifeSelected(view, b, b2, spinner, b3);
        int i4 = e + 71;
        f = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void access$700(FragmentRelationship fragmentRelationship, B b, B b2, Spinner spinner) {
        int i = 2 % 2;
        int i2 = f + 11;
        e = i2 % 128;
        int i3 = i2 % 2;
        fragmentRelationship.updateSelectedSpouseFatherList(b, b2, spinner);
        int i4 = f + 21;
        e = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void access$800(FragmentRelationship fragmentRelationship, View view, Spinner spinner, B b, B b2, B b3, List list, int i, B b4) {
        int i2 = 2 % 2;
        int i3 = f + 31;
        e = i3 % 128;
        int i4 = i3 % 2;
        fragmentRelationship.disableSpouseFromHusbandsMotherList(view, spinner, b, b2, b3, list, i, b4);
        int i5 = f + 43;
        e = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ void access$900(FragmentRelationship fragmentRelationship, B b, B b2, B b3, B b4) {
        int i = 2 % 2;
        int i2 = f + 31;
        e = i2 % 128;
        int i3 = i2 % 2;
        fragmentRelationship.disableMaleFromWifeFatherList(b, b2, b3, b4);
        int i4 = f + 65;
        e = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 42 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x009e  */
    private void disableFemaleFromHusbandMotherList(B b, B b2, B b3, B b4) {
        LinearLayout linearLayout;
        int i;
        int i2 = 2 % 2;
        int i3 = f + 97;
        e = i3 % 128;
        if (i3 % 2 != 0) {
            linearLayout = (LinearLayout) ((ScrollView) this.parentView).getChildAt(1);
            i = 1;
        } else {
            linearLayout = (LinearLayout) ((ScrollView) this.parentView).getChildAt(0);
            i = 0;
        }
        while (i < linearLayout.getChildCount()) {
            int i4 = f + 79;
            e = i4 % 128;
            int i5 = i4 % 2;
            LinearLayout linearLayout2 = (LinearLayout) linearLayout.getChildAt(i);
            Spinner spinner = (Spinner) linearLayout2.getChildAt(2);
            B b5 = (B) ((LinearLayout) spinner.getParent()).getTag();
            ArrayList<B> arrayList = ((af) spinner.getAdapter()).d;
            if (b2.d >= 0 && b5.d == b4.d) {
                ((af) spinner.getAdapter()).d(arrayList.indexOf(b2), false);
                int i6 = e + 95;
                f = i6 % 128;
                int i7 = i6 % 2;
            }
            if (b3 != null && b3.d >= 0) {
                int i8 = e + 57;
                f = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 16 / 0;
                    if (b5.d == b4.d) {
                        ((af) spinner.getAdapter()).d(arrayList.indexOf(b3), true);
                    }
                } else if (b5.d == b4.d) {
                    ((af) spinner.getAdapter()).d(arrayList.indexOf(b3), true);
                }
            }
            i++;
        }
    }

    private void disableSpouseMotherListFemale(B b, B b2, B b3, B b4) {
        int i = 2 % 2;
        LinearLayout linearLayout = (LinearLayout) ((ScrollView) this.parentView).getChildAt(0);
        for (int i2 = 0; i2 < linearLayout.getChildCount(); i2++) {
            int i3 = f + 97;
            e = i3 % 128;
            int i4 = i3 % 2;
            LinearLayout linearLayout2 = (LinearLayout) linearLayout.getChildAt(i2);
            Spinner spinner = (Spinner) linearLayout2.getChildAt(3);
            B b5 = (B) ((LinearLayout) spinner.getParent()).getTag();
            ArrayList<B> arrayList = ((af) spinner.getAdapter()).d;
            if (b2.d >= 0 && b5.d == b4.d) {
                int i5 = f + 117;
                e = i5 % 128;
                int i6 = i5 % 2;
                ((af) spinner.getAdapter()).d(arrayList.indexOf(b2), false);
            }
            if (b3 != null && b3.d >= 0 && b5.d == b4.d) {
                ((af) spinner.getAdapter()).d(arrayList.indexOf(b3), true);
            }
        }
    }

    private void generateBody() {
        int i = 2 % 2;
        int i2 = e + 107;
        f = i2 % 128;
        int i3 = i2 % 2 == 0 ? 1 : 0;
        while (i3 < this.mPersonList.size()) {
            try {
                int i4 = f + 87;
                e = i4 % 128;
                int i5 = i4 % 2;
                generateList(this.mPersonList.get(i3));
                i3++;
                int i6 = f + 3;
                e = i6 % 128;
                int i7 = i6 % 2;
            } catch (Exception unused) {
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00b0  */
    private ArrayList<B> getAllFemalesSpouse(int i, ArrayList<B> arrayList, String str, ae aeVar) {
        int i2;
        int i3 = 2 % 2;
        ArrayList<B> arrayList2 = new ArrayList<>();
        ae aeVar2 = aeVar == null ? new ae() : aeVar;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            int i5 = f + 23;
            e = i5 % 128;
            int i6 = i5 % 2;
            B b = arrayList.get(i4);
            String str2 = b.h;
            Object[] objArr = new Object[1];
            b((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), new char[]{0, 0, 0, 0}, (char) (29435 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), new char[]{63179, 24604, 64324, 22898}, new char[]{48625, 23110, 24899, 42032, 36816, 41953}, objArr);
            if (str2.equalsIgnoreCase(((String) objArr[0]).intern())) {
                int i7 = f + 17;
                e = i7 % 128;
                int i8 = i7 % 2;
                if (b.d != aeVar2.d && b.f > 10) {
                    arrayList2.add(b);
                    if (i == 1 && (i2 = b.j) != 201 && i2 != 204) {
                        arrayList2.remove(b);
                    }
                    if (i == 3) {
                        int i9 = f + 23;
                        e = i9 % 128;
                        if (i9 % 2 == 0 ? b.f < 10 : b.f < 40) {
                            arrayList2.remove(b);
                        } else if (b.j == 200) {
                            arrayList2.remove(b);
                        }
                    }
                }
            }
        }
        Collections.sort(arrayList2, new aY());
        arrayList2.add(0, new ae(-1, str, BuildConfig.FLAVOR, -1, -1, BuildConfig.FLAVOR, -1, null, null, null));
        Object[] objArr2 = new Object[1];
        b((-417595814) - View.MeasureSpec.makeMeasureSpec(0, 0), new char[]{0, 0, 0, 0}, (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), new char[]{23157, 7166, 31207, 23814}, new char[]{52717, 2473, 55194, 8240, 25574, 33216, 50398, 35800, 59652}, objArr2);
        arrayList2.add(new ae(OPTION_NOT_ALIVE_ID, ((String) objArr2[0]).intern(), BuildConfig.FLAVOR, -1, -1, BuildConfig.FLAVOR, -1, null, null, null));
        Object[] objArr3 = new Object[1];
        a(TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0) + 1, new char[]{44699, 63695, 29441, 44757, 13479, 60283, 63752, 40654, 1154, 47883, 40253, 2424, 52939, 54421, 35687, 22818, 16032, 42215, 23319, 26929, 28313}, objArr3);
        arrayList2.add(new ae(OPTION_NOT_INLIST_ID, ((String) objArr3[0]).intern(), BuildConfig.FLAVOR, -1, -1, BuildConfig.FLAVOR, -1, null, null, null));
        return arrayList2;
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 2 % 2;
        int i2 = f;
        int i3 = i2 + 77;
        e = i3 % 128;
        int i4 = i3 % 2;
        if (this.parentView == null) {
            int i5 = i2 + 21;
            e = i5 % 128;
            int i6 = i5 % 2;
            View viewInflate = layoutInflater.inflate(R.layout.fragment_relationship, viewGroup, false);
            this.parentView = viewInflate;
            this.linearLayout = (LinearLayout) viewInflate.findViewById(R.id.relationship_layout);
            generateDummyData();
            generateBody();
        }
        return this.parentView;
    }

    @Override // ivas.gov.bisp.enumeration.X.e
    public SupervisorParseObject parseJsonForSupervisor() {
        int i = 2 % 2;
        int i2 = f + 31;
        e = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005e  */
    private void disableSpouseFromFathersWifeList(View view, Spinner spinner, B b, B b2, B b3, List<B> list, int i) {
        int i2 = 2 % 2;
        LinearLayout linearLayout = (LinearLayout) ((ScrollView) view).getChildAt(0);
        for (int i3 = 0; i3 < linearLayout.getChildCount(); i3++) {
            int i4 = f + 9;
            e = i4 % 128;
            int i5 = i4 % 2;
            LinearLayout linearLayout2 = (LinearLayout) linearLayout.getChildAt(i3);
            Spinner spinner2 = (Spinner) linearLayout2.getChildAt(2);
            B b4 = (B) ((LinearLayout) spinner2.getParent()).getTag();
            ArrayList<B> arrayList = ((af) spinner2.getAdapter()).d;
            int i6 = b.d;
            if (i6 >= 0) {
                int i7 = f + 23;
                e = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 36 / 0;
                    if (b4.d == i6) {
                        ((af) spinner2.getAdapter()).d(arrayList.indexOf(b3), false);
                    }
                } else if (b4.d == i6) {
                    ((af) spinner2.getAdapter()).d(arrayList.indexOf(b3), false);
                }
            }
            if (b2 != null) {
                int i9 = e + 89;
                f = i9 % 128;
                int i10 = i9 % 2;
                int i11 = b2.d;
                if (i11 >= 0) {
                    int i12 = e + 121;
                    f = i12 % 128;
                    int i13 = i12 % 2;
                    if (b4.d == i11) {
                        int i14 = f + 1;
                        e = i14 % 128;
                        int i15 = i14 % 2;
                        ((af) spinner2.getAdapter()).d(arrayList.indexOf(b3), true);
                    }
                }
            }
        }
    }

    private void setSpouseWife(View view, B b, B b2, B b3) {
        int i = 2 % 2;
        int i2 = f + 93;
        e = i2 % 128;
        int i3 = i2 % 2;
        LinearLayout linearLayout = (LinearLayout) ((ScrollView) view).getChildAt(0);
        for (int i4 = 0; i4 < linearLayout.getChildCount(); i4++) {
            int i5 = e + 119;
            f = i5 % 128;
            int i6 = i5 % 2;
            Spinner spinner = (Spinner) ((LinearLayout) linearLayout.getChildAt(i4)).getChildAt(1);
            if (((B) ((LinearLayout) spinner.getParent()).getTag()).d == b2.d) {
                int i7 = f + 27;
                e = i7 % 128;
                if (i7 % 2 != 0) {
                    ((af) spinner.getAdapter()).d.contains(b3);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                ArrayList<B> arrayList = ((af) spinner.getAdapter()).d;
                if (arrayList.contains(b3)) {
                    spinner.setSelection(arrayList.indexOf(b3));
                    int i8 = e + 103;
                    f = i8 % 128;
                    if (i8 % 2 == 0) {
                        int i9 = 3 % 5;
                    }
                }
            }
        }
        int i10 = f + 1;
        e = i10 % 128;
        int i11 = i10 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.X.e
    public boolean isValid() {
        int i = 2 % 2;
        int i2 = e + 35;
        f = i2 % 128;
        int i3 = i2 % 2;
        try {
            LinearLayout linearLayout = (LinearLayout) ((ScrollView) this.parentView).getChildAt(0);
            int i4 = 0;
            while (i4 < linearLayout.getChildCount()) {
                LinearLayout linearLayout2 = (LinearLayout) linearLayout.getChildAt(i4);
                String str = this.mPersonList.get(i4).e;
                Spinner spinner = (Spinner) linearLayout2.getChildAt(1);
                Spinner spinner2 = (Spinner) linearLayout2.getChildAt(2);
                Spinner spinner3 = (Spinner) linearLayout2.getChildAt(3);
                if (spinner.getVisibility() == 0) {
                    int i5 = f + 45;
                    e = i5 % 128;
                    if (i5 % 2 != 0) {
                        spinner.getSelectedItemPosition();
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (spinner.getSelectedItemPosition() == 0) {
                        Activity activity = getActivity();
                        StringBuilder sb = new StringBuilder();
                        Object[] objArr = new Object[1];
                        b((Process.myPid() >> 22) + 1305314673, new char[]{0, 0, 0, 0}, (char) (KeyEvent.getMaxKeyCode() >> 16), new char[]{29164, 52613, 44621, 20412}, new char[]{45923, 9987, 51646, 45840, 20235, 983, 13022}, objArr);
                        sb.append(((String) objArr[0]).intern());
                        sb.append(str);
                        Object[] objArr2 = new Object[1];
                        a((ViewConfiguration.getWindowTouchSlop() >> 8) + 1, new char[]{64745, 53805, 33118, 64718, 7769, 6512, 29083, 52357, 11873, 18689, 5629, 33215, 40116}, objArr2);
                        sb.append(((String) objArr2[0]).intern());
                        Toast.makeText(activity, sb.toString(), 0).show();
                        return false;
                    }
                }
                if (spinner2.getSelectedItemPosition() == 0) {
                    Activity activity2 = getActivity();
                    StringBuilder sb2 = new StringBuilder();
                    Object[] objArr3 = new Object[1];
                    b(1305314674 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), new char[]{0, 0, 0, 0}, (char) View.MeasureSpec.getMode(0), new char[]{29164, 52613, 44621, 20412}, new char[]{45923, 9987, 51646, 45840, 20235, 983, 13022}, objArr3);
                    sb2.append(((String) objArr3[0]).intern());
                    sb2.append(str);
                    Object[] objArr4 = new Object[1];
                    b((-1613288697) - View.getDefaultSize(0, 0), new char[]{0, 0, 0, 0}, (char) ((-1) - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0)), new char[]{1963, 55083, 671, 59610}, new char[]{57947, 37948, 53052, 29485, 29532, 64988, 45000, 62651, 47786}, objArr4);
                    sb2.append(((String) objArr4[0]).intern());
                    Toast.makeText(activity2, sb2.toString(), 0).show();
                    return false;
                }
                if (spinner3.getSelectedItemPosition() == 0) {
                    Activity activity3 = getActivity();
                    StringBuilder sb3 = new StringBuilder();
                    Object[] objArr5 = new Object[1];
                    b(1305314672 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0'), new char[]{0, 0, 0, 0}, (char) (ViewConfiguration.getFadingEdgeLength() >> 16), new char[]{29164, 52613, 44621, 20412}, new char[]{45923, 9987, 51646, 45840, 20235, 983, 13022}, objArr5);
                    sb3.append(((String) objArr5[0]).intern());
                    sb3.append(str);
                    Object[] objArr6 = new Object[1];
                    a(1 - (ViewConfiguration.getLongPressTimeout() >> 16), new char[]{58437, 9303, 33286, 58466, 59427, 6696, 12821, 54326, 55296, 19012, 22125, 49721, 33807}, objArr6);
                    sb3.append(((String) objArr6[0]).intern());
                    Toast.makeText(activity3, sb3.toString(), 0).show();
                    return false;
                }
                i4++;
                int i6 = f + 61;
                e = i6 % 128;
                int i7 = i6 % 2;
            }
        } catch (Exception unused) {
            Activity activity4 = getActivity();
            Object[] objArr7 = new Object[1];
            b((ViewConfiguration.getPressedStateDuration() >> 16) + 1603206536, new char[]{0, 0, 0, 0}, (char) Gravity.getAbsoluteGravity(0, 0), new char[]{34997, 36605, 2655, 48604}, new char[]{49973, 62885, 4027, 12677, 17936, 5518, 30839, 9981, 50829, 3247, 4262, 17261, 51062, 60925, 42617, 12555, 13157, 35231, 29199, 57339, 27377}, objArr7);
            Toast.makeText(activity4, ((String) objArr7[0]).intern(), 0).show();
        }
        int i8 = f + 73;
        e = i8 % 128;
        int i9 = i8 % 2;
        for (int i10 = 0; i10 < this.mPersonList.size(); i10++) {
            int i11 = f + 71;
            e = i11 % 128;
            int i12 = i11 % 2;
            for (int i13 = 0; i13 < this.mPersonList.size(); i13++) {
                B b = this.mPersonList.get(i10);
                B b2 = this.mPersonList.get(i13);
                if (b.d != b2.d) {
                    int i14 = b.c.d;
                    int i15 = b2.c.d;
                }
            }
        }
        ((ActivityBeginSurvey) getActivity()).ar = this.mPersonList;
        return true;
    }

    private void changeSpouseToDefault(View view, B b, B b2, B b3) {
        LinearLayout linearLayout;
        int i;
        int i2 = 2 % 2;
        int i3 = f + 13;
        e = i3 % 128;
        if (i3 % 2 != 0) {
            linearLayout = (LinearLayout) ((ScrollView) view).getChildAt(1);
            i = 1;
        } else {
            linearLayout = (LinearLayout) ((ScrollView) view).getChildAt(0);
            i = 0;
        }
        while (i < linearLayout.getChildCount()) {
            int i4 = f + 17;
            e = i4 % 128;
            int i5 = i4 % 2;
            Spinner spinner = (Spinner) ((LinearLayout) linearLayout.getChildAt(i)).getChildAt(1);
            LinearLayout linearLayout2 = (LinearLayout) spinner.getParent();
            B b4 = (B) linearLayout2.getTag();
            B b5 = (B) linearLayout2.getTag();
            if (b != null) {
                int i6 = f + 75;
                e = i6 % 128;
                int i7 = i6 % 2;
                if (b4.d == b.d && b5.d >= 0) {
                    int i8 = f + 103;
                    e = i8 % 128;
                    int i9 = i8 % 2;
                    spinner.setSelection(0);
                    setSpouseWife(view, b, b2, b3);
                    return;
                }
            }
            i++;
        }
    }

    private boolean checkAge(d dVar) {
        int i = 2 % 2;
        int i2 = e + 27;
        f = i2 % 128;
        int i3 = i2 % 2;
        if (dVar.e > 0) {
            int i4 = e + 1;
            f = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        int i6 = dVar.d;
        if (i6 != 0) {
            if (i6 < 6) {
                return false;
            }
            int i7 = f + 19;
            e = i7 % 128;
            return i7 % 2 == 0;
        }
        if (dVar.c > 0) {
            return false;
        }
        int i8 = f + 87;
        e = i8 % 128;
        int i9 = i8 % 2;
        return true;
    }

    private boolean checkIfToEnableFemaleFromAllOtherMaleList(View view, B b, B b2) {
        int i = 2 % 2;
        int i2 = f + 61;
        e = i2 % 128;
        int i3 = i2 % 2;
        LinearLayout linearLayout = (LinearLayout) ((ScrollView) view).getChildAt(0);
        boolean z = true;
        for (int i4 = 0; i4 < linearLayout.getChildCount(); i4++) {
            LinearLayout linearLayout2 = (LinearLayout) linearLayout.getChildAt(i4);
            B b3 = (B) ((Spinner) linearLayout2.getChildAt(1)).getSelectedItem();
            B b4 = (B) linearLayout2.getTag();
            if (b != null) {
                int i5 = f + 59;
                e = i5 % 128;
                int i6 = i5 % 2;
                int i7 = b.d;
                if (i7 > 0 && b4.d == i7 && b3.d == b2.d) {
                    z = false;
                }
            }
        }
        return z;
    }

    private void disableMotherFromDaughter(View view, B b, B b2, B b3) {
        int i = 2 % 2;
        LinearLayout linearLayout = (LinearLayout) ((ScrollView) view).getChildAt(0);
        int i2 = 0;
        while (true) {
            Object obj = null;
            if (i2 >= linearLayout.getChildCount()) {
                int i3 = e + 61;
                f = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
                return;
            }
            int i4 = f + 61;
            e = i4 % 128;
            int i5 = i4 % 2;
            LinearLayout linearLayout2 = (LinearLayout) linearLayout.getChildAt(i2);
            B b4 = (B) linearLayout2.getTag();
            Spinner spinner = (Spinner) linearLayout2.getChildAt(3);
            ArrayList<B> arrayList = ((af) spinner.getAdapter()).d;
            int i6 = b4.d;
            int i7 = b.d;
            if (i6 == i7) {
                int i8 = e + 21;
                f = i8 % 128;
                if (i8 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                if (i7 != -1) {
                    ((af) spinner.getAdapter()).d(arrayList.indexOf(b3), false);
                    int i9 = f + 23;
                    e = i9 % 128;
                    int i10 = i9 % 2;
                }
            }
            if (b2 != null) {
                int i11 = f + 103;
                e = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = b4.d;
                    int i13 = b2.d;
                    throw null;
                }
                if (b4.d == b2.d) {
                    ((af) spinner.getAdapter()).d(arrayList.indexOf(b3), true);
                }
            }
            i2++;
        }
    }

    private void disableMotherFromSpouseList(LinearLayout linearLayout, B b, B b2) {
        int i = 2 % 2;
        Spinner spinner = (Spinner) linearLayout.getChildAt(1);
        ArrayList<B> arrayList = ((af) spinner.getAdapter()).d;
        if (b2 != null) {
            int i2 = f + 83;
            e = i2 % 128;
            int i3 = i2 % 2;
            if (b2.d >= 0) {
                int i4 = f + 117;
                e = i4 % 128;
                int i5 = i4 % 2;
                af afVar = (af) spinner.getAdapter();
                int iIndexOf = arrayList.indexOf(b2);
                if (i5 != 0) {
                    afVar.d(iIndexOf, false);
                } else {
                    afVar.d(iIndexOf, true);
                }
            }
        }
        if (b.d >= 0) {
            ((af) spinner.getAdapter()).d(arrayList.indexOf(b), false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00ab  */
    private ArrayList<B> getAllFemales(int i, ArrayList<B> arrayList, String str, ae aeVar) {
        int i2;
        int i3 = 2 % 2;
        ArrayList<B> arrayList2 = new ArrayList<>();
        arrayList2.add(new ae(-1, str, BuildConfig.FLAVOR, -1, -1, BuildConfig.FLAVOR, -1, null, null, null));
        ae aeVar2 = aeVar == null ? new ae() : aeVar;
        int i4 = 0;
        while (i4 < arrayList.size()) {
            B b = arrayList.get(i4);
            String str2 = b.h;
            Object[] objArr = new Object[1];
            b(TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0), new char[]{0, 0, 0, 0}, (char) (Gravity.getAbsoluteGravity(0, 0) + 29435), new char[]{63179, 24604, 64324, 22898}, new char[]{48625, 23110, 24899, 42032, 36816, 41953}, objArr);
            if (str2.equalsIgnoreCase(((String) objArr[0]).intern()) && b.d != aeVar2.d) {
                arrayList2.add(b);
                if (i == 1 && (i2 = b.j) != 201 && i2 != 204) {
                    arrayList2.remove(b);
                }
                if (i == 3) {
                    int i5 = e + 33;
                    f = i5 % 128;
                    if (i5 % 2 != 0 ? b.f < 10 : b.f < 116) {
                        arrayList2.remove(b);
                    } else if (b.j == 200) {
                        arrayList2.remove(b);
                    }
                }
            }
            i4++;
            int i6 = e + 33;
            f = i6 % 128;
            int i7 = i6 % 2;
        }
        Object[] objArr2 = new Object[1];
        b((-417595815) - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0'), new char[]{0, 0, 0, 0}, (char) (TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0) + 1), new char[]{23157, 7166, 31207, 23814}, new char[]{52717, 2473, 55194, 8240, 25574, 33216, 50398, 35800, 59652}, objArr2);
        arrayList2.add(new ae(OPTION_NOT_ALIVE_ID, ((String) objArr2[0]).intern(), BuildConfig.FLAVOR, -1, -1, BuildConfig.FLAVOR, -1, null, null, null));
        Object[] objArr3 = new Object[1];
        a((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), new char[]{44699, 63695, 29441, 44757, 13479, 60283, 63752, 40654, 1154, 47883, 40253, 2424, 52939, 54421, 35687, 22818, 16032, 42215, 23319, 26929, 28313}, objArr3);
        arrayList2.add(new ae(OPTION_NOT_INLIST_ID, ((String) objArr3[0]).intern(), BuildConfig.FLAVOR, -1, -1, BuildConfig.FLAVOR, -1, null, null, null));
        return arrayList2;
    }

    private ArrayList<B> getAllMale(int i, ArrayList<B> arrayList, String str, F f2) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        ArrayList<B> arrayList2 = new ArrayList<>();
        ArrayList arrayList3 = new ArrayList();
        F f3 = f2 == null ? new F() : f2;
        arrayList2.add(new F(-1, str, BuildConfig.FLAVOR, -1, -1, BuildConfig.FLAVOR, -1, null, null, arrayList3));
        int i5 = 0;
        while (i5 < arrayList.size()) {
            int i6 = f + 39;
            e = i6 % 128;
            int i7 = i6 % 2;
            B b = arrayList.get(i5);
            String str2 = b.h;
            Object[] objArr = new Object[1];
            b(Drawable.resolveOpacity(0, 0), new char[]{0, 0, 0, 0}, (char) (TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0) + 24128), new char[]{37447, 28413, 16218, 56670}, new char[]{48064, 46571, 60228, 35824}, objArr);
            if (str2.equalsIgnoreCase(((String) objArr[0]).intern()) && b.d != f3.d) {
                arrayList2.add(b);
                if (i != 1 || (i3 = b.j) == 201) {
                    i2 = 2;
                } else {
                    int i8 = e;
                    int i9 = i8 + 107;
                    f = i9 % 128;
                    i2 = 2;
                    int i10 = i9 % 2;
                    if (i3 != 204) {
                        int i11 = i8 + 59;
                        f = i11 % 128;
                        int i12 = i11 % 2;
                        arrayList2.remove(b);
                    }
                }
                if (i == i2) {
                    int i13 = f + 21;
                    e = i13 % 128;
                    int i14 = i13 % i2;
                    if (b.f < 10 || b.j == 200) {
                        arrayList2.remove(b);
                    }
                }
            }
            i5++;
            int i15 = e + 79;
            f = i15 % 128;
            int i16 = i15 % 2;
        }
        Object[] objArr2 = new Object[1];
        b(Color.argb(0, 0, 0, 0) - 417595814, new char[]{0, 0, 0, 0}, (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), new char[]{23157, 7166, 31207, 23814}, new char[]{52717, 2473, 55194, 8240, 25574, 33216, 50398, 35800, 59652}, objArr2);
        arrayList2.add(new F(OPTION_NOT_ALIVE_ID, ((String) objArr2[0]).intern(), BuildConfig.FLAVOR, -1, -1, BuildConfig.FLAVOR, -1, null, null, arrayList3));
        Object[] objArr3 = new Object[1];
        a(1 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), new char[]{44699, 63695, 29441, 44757, 13479, 60283, 63752, 40654, 1154, 47883, 40253, 2424, 52939, 54421, 35687, 22818, 16032, 42215, 23319, 26929, 28313}, objArr3);
        arrayList2.add(new F(OPTION_NOT_INLIST_ID, ((String) objArr3[0]).intern(), BuildConfig.FLAVOR, -1, -1, BuildConfig.FLAVOR, -1, null, null, arrayList3));
        return arrayList2;
    }

    private void setDataPersonInLayoutTag(B b, B b2) {
        int i = 2 % 2;
        int i2 = f + 49;
        e = i2 % 128;
        int i3 = i2 % 2;
        try {
            ((ae) b).a = (F) b2;
            int i4 = f + 11;
            e = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        } catch (Exception unused) {
            Activity activity = getActivity();
            Object[] objArr = new Object[1];
            a(1 - (ViewConfiguration.getScrollBarSize() >> 8), new char[]{55490, 17243, 57838, 55441, 36659, 31117, 5029, 59562, 48912, 10669, 30677, 58250, 47261, 28484, 6619, 46077, 18660, 8041, 51683, 33737, 6337, 53056, 47593, 21360, 10297, 65453, 26906, 8960, 63562, 44931, 22826, 62215, 34920, 24567, 2332, 50044, 22606, 4057, 63841, 37715, 26715, 15992, 43143, 25260, 14783, 60967, 39075}, objArr);
            Toast.makeText(activity, ((String) objArr[0]).intern(), 0).show();
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x006f A[PHI: r0 r1
  0x006f: PHI (r0v15 android.widget.LinearLayout) = (r0v14 android.widget.LinearLayout), (r0v22 android.widget.LinearLayout) binds: [B:15:0x006d, B:12:0x0050] A[DONT_GENERATE, DONT_INLINE]
  0x006f: PHI (r1v9 ivas.gov.bisp.enumeration.bG.B) = (r1v8 ivas.gov.bisp.enumeration.bG.B), (r1v19 ivas.gov.bisp.enumeration.bG.B) binds: [B:15:0x006d, B:12:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x009a  */
    private void updateMaleListOnWifeSelected(View view, B b, B b2, Spinner spinner, B b3) {
        LinearLayout linearLayout;
        B b4;
        B b5;
        int i = 2 % 2;
        int i2 = e + 115;
        f = i2 % 128;
        LinearLayout linearLayout2 = (LinearLayout) (i2 % 2 == 0 ? ((ScrollView) view).getChildAt(1) : ((ScrollView) view).getChildAt(0));
        for (int i3 = 0; i3 < linearLayout2.getChildCount(); i3++) {
            int i4 = f + 21;
            e = i4 % 128;
            if (i4 % 2 != 0) {
                linearLayout = (LinearLayout) linearLayout2.getChildAt(i3);
                b4 = (B) ((LinearLayout) ((Spinner) linearLayout.getChildAt(1)).getParent()).getTag();
                if (b instanceof F) {
                    b5 = b4;
                    if ((b2 instanceof ae) && (b5 instanceof F)) {
                        disableSelectedSpouseFromMaleList(view, b, b2, b5, (Spinner) linearLayout.getChildAt(1), spinner, b3);
                        int i5 = e + 89;
                        f = i5 % 128;
                        int i6 = i5 % 2;
                    }
                }
            } else {
                linearLayout = (LinearLayout) linearLayout2.getChildAt(i3);
                b4 = (B) ((LinearLayout) ((Spinner) linearLayout.getChildAt(1)).getParent()).getTag();
                if (b instanceof F) {
                    b5 = b4;
                    if (b2 instanceof ae) {
                        disableSelectedSpouseFromMaleList(view, b, b2, b5, (Spinner) linearLayout.getChildAt(1), spinner, b3);
                        int i7 = e + 89;
                        f = i7 % 128;
                        int i8 = i7 % 2;
                    }
                }
            }
        }
    }

    private void disableFatherFromSpouseList(LinearLayout linearLayout, B b, B b2) {
        int i = 2 % 2;
        Spinner spinner = (Spinner) linearLayout.getChildAt(1);
        ArrayList<B> arrayList = ((af) spinner.getAdapter()).d;
        if (b2 != null) {
            int i2 = e + 31;
            f = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = b2.d;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (b2.d >= 0) {
                int i4 = e + 27;
                f = i4 % 128;
                if (i4 % 2 == 0) {
                    ((af) spinner.getAdapter()).d(arrayList.indexOf(b2), false);
                } else {
                    ((af) spinner.getAdapter()).d(arrayList.indexOf(b2), true);
                }
            }
        }
        if (b.d >= 0) {
            int i5 = f + 73;
            e = i5 % 128;
            int i6 = i5 % 2;
            ((af) spinner.getAdapter()).d(arrayList.indexOf(b), false);
        }
    }

    public boolean isValidDifference(String str, String str2) {
        int i = 2 % 2;
        boolean zCheckAge = true;
        try {
            Object[] objArr = new Object[1];
            b((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), new char[]{0, 0, 0, 0}, (char) TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0), new char[]{25162, 54931, 9120, 41100}, new char[]{13296, 40957, 32959, 25303, 55205, 12465, 31577, 47431, 598, 39210}, objArr);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(((String) objArr[0]).intern());
            Date date = simpleDateFormat.parse(str);
            Date date2 = simpleDateFormat.parse(str2);
            if (date.getTime() > date2.getTime()) {
                int i2 = e + 117;
                f = i2 % 128;
                int i3 = i2 % 2;
                return checkAge(calculateAge(date2, date));
            }
            zCheckAge = checkAge(calculateAge(date, date2));
            int i4 = f + 31;
            e = i4 % 128;
            int i5 = i4 % 2;
            return zCheckAge;
        } catch (ParseException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005c A[PHI: r7
  0x005c: PHI (r7v12 int) = (r7v11 int), (r7v14 int) binds: [B:21:0x005a, B:18:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x0067  */
    /* JADX WARN: Code duplicated, block: B:27:0x006c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0070  */
    /* JADX WARN: Code duplicated, block: B:31:0x0079  */
    /* JADX WARN: Code duplicated, block: B:32:0x0080  */
    /* JADX WARN: Code duplicated, block: B:42:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0086 A[SYNTHETIC] */
    private ArrayList<B> getAllMaleAndFemalesSpouse(int i, ArrayList<B> arrayList, String str, B b) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        ArrayList<B> arrayList2 = new ArrayList<>();
        ArrayList arrayList3 = new ArrayList();
        B aiVar = b == null ? new ai() : b;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            B b2 = arrayList.get(i7);
            if (b2.d != aiVar.d && b2.f > 10) {
                int i8 = e + 55;
                f = i8 % 128;
                int i9 = i8 % 2;
                arrayList2.add(b2);
                if (i == 1) {
                    int i10 = e + 109;
                    f = i10 % 128;
                    if (i10 % 2 == 0) {
                        i2 = b2.j;
                        if (i2 != 8202) {
                            i3 = e + 121;
                            i4 = i3 % 128;
                            f = i4;
                            if (i3 % 2 == 0) {
                                if (i2 != 19091) {
                                    i5 = i4 + 75;
                                    e = i5 % 128;
                                    if (i5 % 2 != 0) {
                                        arrayList2.remove(b2);
                                        int i11 = 73 / 0;
                                    } else {
                                        arrayList2.remove(b2);
                                    }
                                }
                            } else if (i2 != 204) {
                                i5 = i4 + 75;
                                e = i5 % 128;
                                if (i5 % 2 != 0) {
                                    arrayList2.remove(b2);
                                    int i12 = 73 / 0;
                                } else {
                                    arrayList2.remove(b2);
                                }
                            }
                        }
                    } else {
                        i2 = b2.j;
                        if (i2 != 201) {
                            i3 = e + 121;
                            i4 = i3 % 128;
                            f = i4;
                            if (i3 % 2 == 0) {
                                if (i2 != 19091) {
                                    i5 = i4 + 75;
                                    e = i5 % 128;
                                    if (i5 % 2 != 0) {
                                        arrayList2.remove(b2);
                                        int i13 = 73 / 0;
                                    } else {
                                        arrayList2.remove(b2);
                                    }
                                }
                            } else if (i2 != 204) {
                                i5 = i4 + 75;
                                e = i5 % 128;
                                if (i5 % 2 != 0) {
                                    arrayList2.remove(b2);
                                    int i14 = 73 / 0;
                                } else {
                                    arrayList2.remove(b2);
                                }
                            }
                        }
                    }
                }
            }
        }
        Collections.sort(arrayList2, new aY());
        arrayList2.add(0, new F(-1, str, BuildConfig.FLAVOR, -1, -1, BuildConfig.FLAVOR, -1, null, null, arrayList3));
        Object[] objArr = new Object[1];
        b((ViewConfiguration.getFadingEdgeLength() >> 16) - 417595814, new char[]{0, 0, 0, 0}, (char) (TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0) + 1), new char[]{23157, 7166, 31207, 23814}, new char[]{52717, 2473, 55194, 8240, 25574, 33216, 50398, 35800, 59652}, objArr);
        arrayList2.add(new F(OPTION_NOT_ALIVE_ID, ((String) objArr[0]).intern(), BuildConfig.FLAVOR, -1, -1, BuildConfig.FLAVOR, -1, null, null, arrayList3));
        Object[] objArr2 = new Object[1];
        a((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), new char[]{44699, 63695, 29441, 44757, 13479, 60283, 63752, 40654, 1154, 47883, 40253, 2424, 52939, 54421, 35687, 22818, 16032, 42215, 23319, 26929, 28313}, objArr2);
        arrayList2.add(new F(OPTION_NOT_INLIST_ID, ((String) objArr2[0]).intern(), BuildConfig.FLAVOR, -1, -1, BuildConfig.FLAVOR, -1, null, null, arrayList3));
        return arrayList2;
    }

    private void updateSelectedSpouseFatherList(B b, B b2, Spinner spinner) {
        int i = 2 % 2;
        int i2 = e + 125;
        f = i2 % 128;
        int i3 = i2 % 2;
        try {
            Spinner spinner2 = (Spinner) ((LinearLayout) spinner.getParent()).getChildAt(2);
            ArrayList<B> arrayList = ((af) spinner2.getAdapter()).d;
            ((af) spinner2.getAdapter()).d(arrayList.indexOf(b), false);
            ((af) spinner2.getAdapter()).d(arrayList.indexOf(b2), true);
            int i4 = f + 7;
            e = i4 % 128;
            int i5 = i4 % 2;
        } catch (Exception unused) {
            Activity activity = getActivity();
            Object[] objArr = new Object[1];
            a(View.MeasureSpec.makeMeasureSpec(0, 0) + 1, new char[]{55490, 17243, 57838, 55441, 36659, 31117, 5029, 59562, 48912, 10669, 30677, 58250, 47261, 28484, 6619, 46077, 18660, 8041, 51683, 33737, 6337, 53056, 47593, 21360, 10297, 65453, 26906, 8960, 63562, 44931, 22826, 62215, 34920, 24567, 2332, 50044, 22606, 4057, 63841, 37715, 26715, 15992, 43143, 25260, 14783, 60967, 39075}, objArr);
            Toast.makeText(activity, ((String) objArr[0]).intern(), 0).show();
        }
    }

    @Override // android.app.Fragment
    public void onResume() {
        int i = 2 % 2;
        if (ag.l) {
            ag.l = false;
            this.mPersonList = new ArrayList<>();
            this.linearLayout.removeAllViews();
            generateDummyData();
            generateBody();
            int i2 = f + 91;
            e = i2 % 128;
            int i3 = i2 % 2;
        }
        super.onResume();
        int i4 = e + 47;
        f = i4 % 128;
        int i5 = i4 % 2;
    }

    private d calculateAge(Date date, Date date2) {
        int i = 2 % 2;
        z zVar = new z(date);
        z zVar2 = new z(date2);
        Q qG = Q.g(zVar, zVar2);
        C cG = C.g(zVar, zVar2);
        C0245o c0245oG = C0245o.g(zVar, zVar2);
        int i2 = cG.c;
        d dVar = new d(c0245oG.c, qG.c, i2);
        int i3 = e + 3;
        f = i3 % 128;
        if (i3 % 2 != 0) {
            return dVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void enableMaleFromFatherListOnSpouseChanged(View view, Spinner spinner, B b, B b2, B b3, List<B> list, int i, B b4) {
        int i2 = 2 % 2;
        int i3 = 0;
        LinearLayout linearLayout = (LinearLayout) ((ScrollView) view).getChildAt(0);
        while (i3 < linearLayout.getChildCount()) {
            LinearLayout linearLayout2 = (LinearLayout) linearLayout.getChildAt(i3);
            Spinner spinner2 = (Spinner) linearLayout2.getChildAt(2);
            B b5 = (B) ((LinearLayout) spinner2.getParent()).getTag();
            ArrayList<B> arrayList = ((af) spinner2.getAdapter()).d;
            if (b2 != null) {
                int i4 = f + 91;
                e = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = b2.d;
                    throw null;
                }
                int i6 = b2.d;
                if (i6 >= 0 && b5.d == i6) {
                    int i7 = e + 93;
                    f = i7 % 128;
                    int i8 = i7 % 2;
                    ((af) spinner2.getAdapter()).d(arrayList.indexOf(b4), true);
                }
            }
            i3++;
            int i9 = e + 39;
            f = i9 % 128;
            int i10 = i9 % 2;
        }
    }

    private void generateDummyData() {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = e + 15;
        f = i3 % 128;
        int i4 = i3 % 2;
        ArrayList<Roster> arrayList = ((ActivityBeginSurvey) getActivity()).aq;
        int i5 = 0;
        while (i5 < arrayList.size()) {
            int i6 = e + 67;
            f = i6 % 128;
            int i7 = i6 % i;
            Roster roster = arrayList.get(i5);
            String str = roster.gender;
            Object[] objArr = new Object[1];
            b(ViewConfiguration.getKeyRepeatTimeout() >> 16, new char[]{0, 0, 0, 0}, (char) (24126 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0')), new char[]{37447, 28413, 16218, 56670}, new char[]{48064, 46571, 60228, 35824}, objArr);
            if (str.equals(((String) objArr[0]).intern())) {
                int i8 = roster.roster_relational_id;
                String str2 = roster.name_of_member;
                String str3 = roster.date_of_birth_var;
                int i9 = roster.age_year;
                int i10 = roster.age_month;
                Object[] objArr2 = new Object[1];
                b((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), new char[]{0, 0, 0, 0}, (char) (TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0) + 24128), new char[]{37447, 28413, 16218, 56670}, new char[]{48064, 46571, 60228, 35824}, objArr2);
                this.mPersonList.add(new F(i8, str2, str3, i9, i10, ((String) objArr2[0]).intern(), roster.marital_status, null, null, new ArrayList()));
            } else {
                String str4 = arrayList.get(i5).gender;
                Object[] objArr3 = new Object[1];
                b(TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0), new char[]{0, 0, 0, 0}, (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 29435), new char[]{63179, 24604, 64324, 22898}, new char[]{48625, 23110, 24899, 42032, 36816, 41953}, objArr3);
                if (str4.equals(((String) objArr3[0]).intern())) {
                    int i11 = roster.roster_relational_id;
                    String str5 = roster.name_of_member;
                    String str6 = roster.date_of_birth_var;
                    int i12 = roster.age_year;
                    int i13 = roster.age_month;
                    Object[] objArr4 = new Object[1];
                    b(Gravity.getAbsoluteGravity(0, 0), new char[]{0, 0, 0, 0}, (char) (View.MeasureSpec.getMode(0) + 29435), new char[]{63179, 24604, 64324, 22898}, new char[]{48625, 23110, 24899, 42032, 36816, 41953}, objArr4);
                    this.mPersonList.add(new ae(i11, str5, str6, i12, i13, ((String) objArr4[0]).intern(), roster.marital_status, null, null, null));
                    int i14 = f + 83;
                    e = i14 % 128;
                    int i15 = i14 % 2;
                } else {
                    int i16 = roster.roster_relational_id;
                    String str7 = roster.name_of_member;
                    String str8 = roster.date_of_birth_var;
                    int i17 = roster.age_year;
                    int i18 = roster.age_month;
                    Object[] objArr5 = new Object[1];
                    b(ExpandableListView.getPackedPositionType(0L) - 1026610040, new char[]{0, 0, 0, 0}, (char) Color.blue(0), new char[]{34966, 53036, 26562, 4640}, new char[]{3601, 13466, 63857, 20609, 45025, 990, 14788, 17809, 39625, 12258, 9983}, objArr5);
                    this.mPersonList.add(new ai(i16, str7, str8, i17, i18, ((String) objArr5[0]).intern(), roster.marital_status, null, null, null));
                }
            }
            i5++;
            i = 2;
        }
    }

    private ArrayList<B> getAllMaleSpouse(int i, ArrayList<B> arrayList, String str, F f2) {
        int i2 = 2 % 2;
        ArrayList<B> arrayList2 = new ArrayList<>();
        ArrayList arrayList3 = new ArrayList();
        F f3 = f2 == null ? new F() : f2;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            B b = arrayList.get(i3);
            String str2 = b.h;
            Object[] objArr = new Object[1];
            b(Process.myPid() >> 22, new char[]{0, 0, 0, 0}, (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 24127), new char[]{37447, 28413, 16218, 56670}, new char[]{48064, 46571, 60228, 35824}, objArr);
            if (str2.equalsIgnoreCase(((String) objArr[0]).intern())) {
                int i4 = e + 97;
                f = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = b.d;
                    int i6 = f3.d;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (b.d != f3.d && b.f > 10) {
                    arrayList2.add(b);
                    if (i == 1) {
                        int i7 = e + 67;
                        f = i7 % 128;
                        int i8 = i7 % 2;
                        int i9 = b.j;
                        if (i9 != 201 && i9 != 204) {
                            arrayList2.remove(b);
                        }
                    }
                    if (i == 2 && (b.f < 10 || b.j == 200)) {
                        arrayList2.remove(b);
                        int i10 = e + 13;
                        f = i10 % 128;
                        int i11 = i10 % 2;
                    }
                }
            }
        }
        Collections.sort(arrayList2, new aY());
        arrayList2.add(0, new F(-1, str, BuildConfig.FLAVOR, -1, -1, BuildConfig.FLAVOR, -1, null, null, arrayList3));
        Object[] objArr2 = new Object[1];
        b(ImageFormat.getBitsPerPixel(0) - 417595813, new char[]{0, 0, 0, 0}, (char) ((-1) - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0')), new char[]{23157, 7166, 31207, 23814}, new char[]{52717, 2473, 55194, 8240, 25574, 33216, 50398, 35800, 59652}, objArr2);
        arrayList2.add(new F(OPTION_NOT_ALIVE_ID, ((String) objArr2[0]).intern(), BuildConfig.FLAVOR, -1, -1, BuildConfig.FLAVOR, -1, null, null, arrayList3));
        Object[] objArr3 = new Object[1];
        a(1 - View.MeasureSpec.makeMeasureSpec(0, 0), new char[]{44699, 63695, 29441, 44757, 13479, 60283, 63752, 40654, 1154, 47883, 40253, 2424, 52939, 54421, 35687, 22818, 16032, 42215, 23319, 26929, 28313}, objArr3);
        arrayList2.add(new F(OPTION_NOT_INLIST_ID, ((String) objArr3[0]).intern(), BuildConfig.FLAVOR, -1, -1, BuildConfig.FLAVOR, -1, null, null, arrayList3));
        return arrayList2;
    }

    private void setToDefaultIfFemaleSet(View view, Spinner spinner, B b, B b2, B b3, List<B> list, int i) {
        int i2 = 2 % 2;
        int i3 = e + 111;
        f = i3 % 128;
        LinearLayout linearLayout = (LinearLayout) (i3 % 2 == 0 ? ((ScrollView) view).getChildAt(1) : ((ScrollView) view).getChildAt(0));
        for (int i4 = 0; i4 < linearLayout.getChildCount(); i4++) {
            LinearLayout linearLayout2 = (LinearLayout) linearLayout.getChildAt(i4);
            Spinner spinner2 = (Spinner) linearLayout2.getChildAt(1);
            B b4 = (B) ((LinearLayout) spinner2.getParent()).getTag();
            B b5 = (B) spinner2.getSelectedItem();
            if (b2 != null) {
                int i5 = f + 97;
                e = i5 % 128;
                int i6 = i5 % 2;
                if (b2.d == b4.d && b5.d == b3.d) {
                    int i7 = e + 41;
                    f = i7 % 128;
                    int i8 = i7 % 2;
                    spinner2.setSelection(0);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d6 A[PHI: r1
  0x00d6: PHI (r1v25 boolean) = (r1v24 boolean), (r1v26 boolean) binds: [B:32:0x00d4, B:29:0x00ca] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:49:0x00fa A[SYNTHETIC] */
    private void updateFemaleSpouseOfOtherMalesListWhenWifeSelected(View view, Spinner spinner, B b, B b2, B b3, List<B> list, int i, boolean z) {
        int i2;
        boolean z2;
        int i3;
        Spinner spinner2;
        int i4 = 2 % 2;
        int i5 = e + 57;
        f = i5 % 128;
        int i6 = i5 % 2;
        LinearLayout linearLayout = (LinearLayout) ((ScrollView) view).getChildAt(0);
        for (int i7 = 0; i7 < linearLayout.getChildCount(); i7++) {
            LinearLayout linearLayout2 = (LinearLayout) linearLayout.getChildAt(i7);
            B b4 = (B) linearLayout2.getTag();
            B b5 = (B) ((LinearLayout) ((Spinner) linearLayout2.getChildAt(1)).getParent()).getTag();
            boolean z3 = b instanceof ae;
            Object obj = null;
            if (z3) {
                int i8 = f + 29;
                e = i8 % 128;
                if (i8 % 2 != 0) {
                    boolean z4 = b3 instanceof F;
                    obj.hashCode();
                    throw null;
                }
                if ((!(b3 instanceof F)) || ((Spinner) linearLayout2.getChildAt(1)) == spinner || !(b5 instanceof F)) {
                    z3 = z3;
                    i2 = 1;
                } else {
                    int i9 = e + 79;
                    f = i9 % 128;
                    if (i9 % 2 == 0) {
                        spinner2 = (Spinner) linearLayout2.getChildAt(1);
                        i2 = 1;
                    } else {
                        i2 = 1;
                        spinner2 = (Spinner) linearLayout2.getChildAt(1);
                    }
                    disableSelectedSpouse(b, b2, b3, spinner2, list, z);
                }
            } else {
                z3 = z3;
                i2 = 1;
            }
            if (z3) {
                int i10 = e + 123;
                int i11 = i10 % 128;
                f = i11;
                int i12 = i10 % 2;
                if (b3 instanceof F) {
                    int i13 = i11 + 77;
                    e = i13 % 128;
                    if (i13 % 2 != 0) {
                        z2 = false;
                        if (((Spinner) linearLayout2.getChildAt(0)) != spinner) {
                            i3 = f + 77;
                            e = i3 % 128;
                            if (i3 % 2 == 0) {
                                boolean z5 = b4 instanceof ae;
                                throw null;
                            }
                            if (!(b4 instanceof ae) && b4.d == b.d) {
                                int i14 = f + 57;
                                e = i14 % 128;
                                int i15 = i14 % 2;
                                setDataPersonInLayoutTag(b, b3);
                            }
                        }
                    } else {
                        z2 = false;
                        if (((Spinner) linearLayout2.getChildAt(i2)) != spinner) {
                            i3 = f + 77;
                            e = i3 % 128;
                            if (i3 % 2 == 0) {
                                boolean z6 = b4 instanceof ae;
                                throw null;
                            }
                            if (!(b4 instanceof ae)) {
                            }
                        }
                    }
                } else {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
        }
    }

    private ArrayList<B> getAllFemalesMother(int i, ArrayList<B> arrayList, String str, B b) {
        int i2 = 2 % 2;
        ArrayList<B> arrayList2 = new ArrayList<>();
        B aeVar = b == null ? new ae() : b;
        int i3 = f + 5;
        e = i3 % 128;
        int i4 = i3 % 2;
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            int i6 = f + 73;
            e = i6 % 128;
            int i7 = i6 % 2;
            B b2 = arrayList.get(i5);
            String str2 = b2.h;
            Object[] objArr = new Object[1];
            b(View.getDefaultSize(0, 0), new char[]{0, 0, 0, 0}, (char) (29434 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0)), new char[]{63179, 24604, 64324, 22898}, new char[]{48625, 23110, 24899, 42032, 36816, 41953}, objArr);
            if (str2.equalsIgnoreCase(((String) objArr[0]).intern()) && b2.d != aeVar.d) {
                int i8 = f + 103;
                e = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = b2.f;
                    int i10 = aeVar.f;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (b2.f > aeVar.f) {
                    arrayList2.add(b2);
                    if (i == 3 && b2.f - aeVar.f < 10.0d) {
                        int i11 = e + 101;
                        f = i11 % 128;
                        if (i11 % 2 == 0) {
                            arrayList2.remove(b2);
                            int i12 = 15 / 0;
                        } else {
                            arrayList2.remove(b2);
                        }
                    }
                    if (i == 1) {
                        int i13 = f + 93;
                        e = i13 % 128;
                        int i14 = i13 % 2;
                        int i15 = b2.j;
                        if (i15 != 201) {
                            int i16 = e + 121;
                            int i17 = i16 % 128;
                            f = i17;
                            int i18 = i16 % 2;
                            if (i15 != 204) {
                                int i19 = i17 + 55;
                                e = i19 % 128;
                                int i20 = i19 % 2;
                                arrayList2.remove(b2);
                            }
                        }
                    }
                    if (i == 3 && (b2.f < 10 || b2.j == 200)) {
                        arrayList2.remove(b2);
                        int i21 = e + 29;
                        f = i21 % 128;
                        int i22 = i21 % 2;
                    }
                }
            }
        }
        Collections.sort(arrayList2, new aY());
        arrayList2.add(0, new ae(-1, str, BuildConfig.FLAVOR, -1, -1, BuildConfig.FLAVOR, -1, null, null, null));
        Object[] objArr2 = new Object[1];
        b(View.MeasureSpec.makeMeasureSpec(0, 0) - 417595814, new char[]{0, 0, 0, 0}, (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), new char[]{23157, 7166, 31207, 23814}, new char[]{52717, 2473, 55194, 8240, 25574, 33216, 50398, 35800, 59652}, objArr2);
        arrayList2.add(new ae(OPTION_NOT_ALIVE_ID, ((String) objArr2[0]).intern(), BuildConfig.FLAVOR, -1, -1, BuildConfig.FLAVOR, -1, null, null, null));
        Object[] objArr3 = new Object[1];
        a((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), new char[]{44699, 63695, 29441, 44757, 13479, 60283, 63752, 40654, 1154, 47883, 40253, 2424, 52939, 54421, 35687, 22818, 16032, 42215, 23319, 26929, 28313}, objArr3);
        arrayList2.add(new ae(OPTION_NOT_INLIST_ID, ((String) objArr3[0]).intern(), BuildConfig.FLAVOR, -1, -1, BuildConfig.FLAVOR, -1, null, null, null));
        return arrayList2;
    }

    private void disableFatherFromSon(View view, B b, B b2, B b3) {
        int i = 2 % 2;
        LinearLayout linearLayout = (LinearLayout) ((ScrollView) view).getChildAt(0);
        for (int i2 = 0; i2 < linearLayout.getChildCount(); i2++) {
            LinearLayout linearLayout2 = (LinearLayout) linearLayout.getChildAt(i2);
            B b4 = (B) linearLayout2.getTag();
            Spinner spinner = (Spinner) linearLayout2.getChildAt(2);
            ArrayList<B> arrayList = ((af) spinner.getAdapter()).d;
            int i3 = b4.d;
            int i4 = b.d;
            if (i3 == i4) {
                int i5 = f + 99;
                e = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
                if (i4 != -1) {
                    ((af) spinner.getAdapter()).d(arrayList.indexOf(b3), false);
                }
            }
            if (b2 != null) {
                int i6 = e + 115;
                f = i6 % 128;
                int i7 = i6 % 2;
                if (b4.d == b2.d) {
                    ((af) spinner.getAdapter()).d(arrayList.indexOf(b3), true);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0069  */
    /* JADX WARN: Code duplicated, block: B:20:0x0079  */
    /* JADX WARN: Code duplicated, block: B:22:0x0084  */
    /* JADX WARN: Code duplicated, block: B:25:0x0089  */
    /* JADX WARN: Code duplicated, block: B:27:0x008d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0090 A[SYNTHETIC] */
    private ArrayList<B> getAllMaleAndFemales(int i, ArrayList<B> arrayList, String str, B b) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        ArrayList<B> arrayList2 = new ArrayList<>();
        ArrayList arrayList3 = new ArrayList();
        B aiVar = b == null ? new ai() : b;
        arrayList2.add(new F(-1, str, BuildConfig.FLAVOR, -1, -1, BuildConfig.FLAVOR, -1, null, null, arrayList3));
        int i5 = e + 27;
        f = i5 % 128;
        int i6 = i5 % 2;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            B b2 = arrayList.get(i7);
            if (b2.d != aiVar.d) {
                int i8 = e + 15;
                f = i8 % 128;
                if (i8 % 2 == 0) {
                    arrayList2.add(b2);
                    if (i == 0) {
                        int i9 = f + 45;
                        e = i9 % 128;
                        int i10 = i9 % 2;
                        i2 = b2.j;
                        if (i2 != 201) {
                            i3 = e + 49;
                            f = i3 % 128;
                            if (i3 % 2 == 0) {
                                if (i2 != 15112) {
                                    arrayList2.remove(b2);
                                }
                            } else if (i2 != 204) {
                                arrayList2.remove(b2);
                            }
                        }
                    }
                } else {
                    arrayList2.add(b2);
                    if (i == 1) {
                        int i11 = f + 45;
                        e = i11 % 128;
                        int i12 = i11 % 2;
                        i2 = b2.j;
                        if (i2 != 201) {
                            i3 = e + 49;
                            f = i3 % 128;
                            if (i3 % 2 == 0) {
                                if (i2 != 15112) {
                                    arrayList2.remove(b2);
                                }
                            } else if (i2 != 204) {
                                arrayList2.remove(b2);
                            }
                        }
                    }
                }
            }
        }
        Object[] objArr = new Object[1];
        b((ViewConfiguration.getTouchSlop() >> 8) - 417595814, new char[]{0, 0, 0, 0}, (char) KeyEvent.keyCodeFromString(BuildConfig.FLAVOR), new char[]{23157, 7166, 31207, 23814}, new char[]{52717, 2473, 55194, 8240, 25574, 33216, 50398, 35800, 59652}, objArr);
        arrayList2.add(new F(OPTION_NOT_ALIVE_ID, ((String) objArr[0]).intern(), BuildConfig.FLAVOR, -1, -1, BuildConfig.FLAVOR, -1, null, null, arrayList3));
        Object[] objArr2 = new Object[1];
        a(-ExpandableListView.getPackedPositionChild(0L), new char[]{44699, 63695, 29441, 44757, 13479, 60283, 63752, 40654, 1154, 47883, 40253, 2424, 52939, 54421, 35687, 22818, 16032, 42215, 23319, 26929, 28313}, objArr2);
        arrayList2.add(new F(OPTION_NOT_INLIST_ID, ((String) objArr2[0]).intern(), BuildConfig.FLAVOR, -1, -1, BuildConfig.FLAVOR, -1, null, null, arrayList3));
        int i13 = e + 75;
        f = i13 % 128;
        int i14 = i13 % 2;
        return arrayList2;
    }

    private void disableMaleFromWifeFatherList(B b, B b2, B b3, B b4) {
        int i = 2 % 2;
        LinearLayout linearLayout = (LinearLayout) ((ScrollView) this.parentView).getChildAt(0);
        for (int i2 = 0; i2 < linearLayout.getChildCount(); i2++) {
            int i3 = f + 11;
            e = i3 % 128;
            int i4 = i3 % 2;
            LinearLayout linearLayout2 = (LinearLayout) linearLayout.getChildAt(i2);
            Spinner spinner = (Spinner) linearLayout2.getChildAt(2);
            B b5 = (B) ((LinearLayout) spinner.getParent()).getTag();
            ArrayList<B> arrayList = ((af) spinner.getAdapter()).d;
            if (b2.d >= 0) {
                int i5 = f + 75;
                e = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = b5.d;
                    int i7 = b4.d;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (b5.d == b4.d) {
                    ((af) spinner.getAdapter()).d(arrayList.indexOf(b2), false);
                }
            }
            if (b3 != null && b3.d >= 0 && b5.d == b4.d) {
                int i8 = f + 7;
                e = i8 % 128;
                if (i8 % 2 != 0) {
                    ((af) spinner.getAdapter()).d(arrayList.indexOf(b3), false);
                } else {
                    ((af) spinner.getAdapter()).d(arrayList.indexOf(b3), true);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0071  */
    private void disableSpouseFromHusbandsMotherList(View view, Spinner spinner, B b, B b2, B b3, List<B> list, int i, B b4) {
        int i2;
        af afVar;
        int i3 = 2 % 2;
        int i4 = e + 107;
        f = i4 % 128;
        LinearLayout linearLayout = (LinearLayout) (i4 % 2 == 0 ? ((ScrollView) view).getChildAt(1) : ((ScrollView) view).getChildAt(0));
        for (int i5 = 0; i5 < linearLayout.getChildCount(); i5++) {
            int i6 = f + 59;
            e = i6 % 128;
            int i7 = i6 % 2;
            LinearLayout linearLayout2 = (LinearLayout) linearLayout.getChildAt(i5);
            Spinner spinner2 = (Spinner) linearLayout2.getChildAt(3);
            B b5 = (B) ((LinearLayout) spinner2.getParent()).getTag();
            ArrayList<B> arrayList = ((af) spinner2.getAdapter()).d;
            int i8 = b.d;
            if (i8 >= 0) {
                int i9 = f + 101;
                e = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = 81 / 0;
                    if (b5.d == i8) {
                        ((af) spinner2.getAdapter()).d(arrayList.indexOf(b3), false);
                    }
                } else if (b5.d == i8) {
                    ((af) spinner2.getAdapter()).d(arrayList.indexOf(b3), false);
                }
            }
            if (b2 != null && (i2 = b2.d) >= 0 && b5.d == i2) {
                int i11 = e + 83;
                f = i11 % 128;
                if (i11 % 2 == 0) {
                    ((af) spinner2.getAdapter()).d(arrayList.indexOf(b3), false);
                    afVar = (af) spinner2.getAdapter();
                } else {
                    ((af) spinner2.getAdapter()).d(arrayList.indexOf(b3), true);
                    afVar = (af) spinner2.getAdapter();
                }
                afVar.d(arrayList.indexOf(b4), true);
            }
        }
    }

    private ArrayList<B> getAllMaleFather(int i, ArrayList<B> arrayList, String str, B b) {
        int i2 = 2 % 2;
        ArrayList<B> arrayList2 = new ArrayList<>();
        ArrayList arrayList3 = new ArrayList();
        B f2 = b == null ? new F() : b;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            B b2 = arrayList.get(i3);
            String str2 = b2.h;
            Object[] objArr = new Object[1];
            b(Gravity.getAbsoluteGravity(0, 0), new char[]{0, 0, 0, 0}, (char) (TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0) + 24127), new char[]{37447, 28413, 16218, 56670}, new char[]{48064, 46571, 60228, 35824}, objArr);
            if (str2.equalsIgnoreCase(((String) objArr[0]).intern()) && b2.d != f2.d) {
                int i4 = e + 55;
                f = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = b2.f;
                    int i6 = f2.f;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (b2.f > f2.f) {
                    int i7 = f + 65;
                    e = i7 % 128;
                    int i8 = i7 % 2;
                    arrayList2.add(b2);
                    if (i == 2 && b2.f - f2.f < 13.0d) {
                        arrayList2.remove(b2);
                    }
                    if (i == 1) {
                        int i9 = f + 65;
                        e = i9 % 128;
                        int i10 = i9 % 2;
                        int i11 = b2.j;
                        if (i11 != 201 && i11 != 204) {
                            arrayList2.remove(b2);
                        }
                    }
                    if (i == 2 && (b2.f < 10 || b2.j == 200)) {
                        arrayList2.remove(b2);
                    }
                }
            }
        }
        Collections.sort(arrayList2, new aY());
        arrayList2.add(0, new F(-1, str, BuildConfig.FLAVOR, -1, -1, BuildConfig.FLAVOR, -1, null, null, arrayList3));
        Object[] objArr2 = new Object[1];
        b((-417595815) - MotionEvent.axisFromString(BuildConfig.FLAVOR), new char[]{0, 0, 0, 0}, (char) View.getDefaultSize(0, 0), new char[]{23157, 7166, 31207, 23814}, new char[]{52717, 2473, 55194, 8240, 25574, 33216, 50398, 35800, 59652}, objArr2);
        arrayList2.add(new F(OPTION_NOT_ALIVE_ID, ((String) objArr2[0]).intern(), BuildConfig.FLAVOR, -1, -1, BuildConfig.FLAVOR, -1, null, null, arrayList3));
        Object[] objArr3 = new Object[1];
        a((ViewConfiguration.getWindowTouchSlop() >> 8) + 1, new char[]{44699, 63695, 29441, 44757, 13479, 60283, 63752, 40654, 1154, 47883, 40253, 2424, 52939, 54421, 35687, 22818, 16032, 42215, 23319, 26929, 28313}, objArr3);
        arrayList2.add(new F(OPTION_NOT_INLIST_ID, ((String) objArr3[0]).intern(), BuildConfig.FLAVOR, -1, -1, BuildConfig.FLAVOR, -1, null, null, arrayList3));
        return arrayList2;
    }

    private void disableSpouseFromMotherList(B b, B b2, Spinner spinner) {
        int i = 2 % 2;
        try {
            Spinner spinner2 = (Spinner) ((LinearLayout) spinner.getParent()).getChildAt(3);
            B b3 = (B) spinner2.getSelectedItem();
            ArrayList<B> arrayList = ((af) spinner2.getAdapter()).d;
            ((af) spinner2.getAdapter()).d(arrayList.indexOf(b), false);
            ((af) spinner2.getAdapter()).d(arrayList.indexOf(b2), true);
            LinearLayout linearLayout = (LinearLayout) ((ScrollView) this.parentView).getChildAt(0);
            int i2 = f + 93;
            e = i2 % 128;
            int i3 = i2 % 2;
            for (int i4 = 0; i4 < linearLayout.getChildCount(); i4++) {
                LinearLayout linearLayout2 = (LinearLayout) linearLayout.getChildAt(i4);
                Spinner spinner3 = (Spinner) linearLayout2.getChildAt(3);
                B b4 = (B) ((LinearLayout) spinner3.getParent()).getTag();
                ArrayList<B> arrayList2 = ((af) spinner3.getAdapter()).d;
                int i5 = b.d;
                if (i5 >= 0 && b4.d == i5) {
                    ((af) spinner3.getAdapter()).d(arrayList2.indexOf(b3), false);
                }
                if (b2 != null) {
                    int i6 = e + 95;
                    f = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i7 = b2.d;
                        throw null;
                    }
                    int i8 = b2.d;
                    if (i8 >= 0 && b4.d == i8) {
                        ((af) spinner3.getAdapter()).d(arrayList2.indexOf(b3), true);
                    }
                }
            }
        } catch (Exception unused) {
            Activity activity = getActivity();
            Object[] objArr = new Object[1];
            a(-TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0), new char[]{55490, 17243, 57838, 55441, 36659, 31117, 5029, 59562, 48912, 10669, 30677, 58250, 47261, 28484, 6619, 46077, 18660, 8041, 51683, 33737, 6337, 53056, 47593, 21360, 10297, 65453, 26906, 8960, 63562, 44931, 22826, 62215, 34920, 24567, 2332, 50044, 22606, 4057, 63841, 37715, 26715, 15992, 43143, 25260, 14783, 60967, 39075}, objArr);
            Toast.makeText(activity, ((String) objArr[0]).intern(), 0).show();
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x01e8 A[Catch: Exception -> 0x032c, PHI: r0
  0x01e8: PHI (r0v47 java.util.List<ivas.gov.bisp.enumeration.bG.ae>) = (r0v46 java.util.List<ivas.gov.bisp.enumeration.bG.ae>), (r0v53 java.util.List<ivas.gov.bisp.enumeration.bG.ae>) binds: [B:64:0x01e6, B:61:0x01de] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x032c, blocks: (B:3:0x0011, B:5:0x0024, B:6:0x003d, B:8:0x0043, B:10:0x004f, B:11:0x005a, B:13:0x0063, B:15:0x006d, B:17:0x0079, B:19:0x007d, B:20:0x00c1, B:21:0x00c4, B:25:0x00d4, B:27:0x00e0, B:29:0x00e6, B:30:0x012e, B:32:0x0139, B:33:0x013d, B:36:0x0140, B:39:0x0155, B:41:0x0159, B:43:0x0165, B:45:0x016b, B:47:0x016f, B:48:0x01b7, B:53:0x01c2, B:55:0x01c6, B:59:0x01d6, B:98:0x02ac, B:100:0x02b0, B:102:0x02b4, B:105:0x02cc, B:106:0x02d2, B:107:0x02df, B:110:0x02e7, B:111:0x02f5, B:113:0x02fb, B:118:0x0322, B:117:0x0315, B:65:0x01e8, B:67:0x01f1, B:69:0x020b, B:63:0x01e1, B:70:0x0243, B:72:0x0247, B:77:0x025b, B:79:0x026a, B:97:0x029f, B:89:0x028b, B:91:0x0294, B:96:0x0299, B:85:0x0271), top: B:122:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x01f1 A[Catch: Exception -> 0x032c, TryCatch #0 {Exception -> 0x032c, blocks: (B:3:0x0011, B:5:0x0024, B:6:0x003d, B:8:0x0043, B:10:0x004f, B:11:0x005a, B:13:0x0063, B:15:0x006d, B:17:0x0079, B:19:0x007d, B:20:0x00c1, B:21:0x00c4, B:25:0x00d4, B:27:0x00e0, B:29:0x00e6, B:30:0x012e, B:32:0x0139, B:33:0x013d, B:36:0x0140, B:39:0x0155, B:41:0x0159, B:43:0x0165, B:45:0x016b, B:47:0x016f, B:48:0x01b7, B:53:0x01c2, B:55:0x01c6, B:59:0x01d6, B:98:0x02ac, B:100:0x02b0, B:102:0x02b4, B:105:0x02cc, B:106:0x02d2, B:107:0x02df, B:110:0x02e7, B:111:0x02f5, B:113:0x02fb, B:118:0x0322, B:117:0x0315, B:65:0x01e8, B:67:0x01f1, B:69:0x020b, B:63:0x01e1, B:70:0x0243, B:72:0x0247, B:77:0x025b, B:79:0x026a, B:97:0x029f, B:89:0x028b, B:91:0x0294, B:96:0x0299, B:85:0x0271), top: B:122:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x020b A[Catch: Exception -> 0x032c, TryCatch #0 {Exception -> 0x032c, blocks: (B:3:0x0011, B:5:0x0024, B:6:0x003d, B:8:0x0043, B:10:0x004f, B:11:0x005a, B:13:0x0063, B:15:0x006d, B:17:0x0079, B:19:0x007d, B:20:0x00c1, B:21:0x00c4, B:25:0x00d4, B:27:0x00e0, B:29:0x00e6, B:30:0x012e, B:32:0x0139, B:33:0x013d, B:36:0x0140, B:39:0x0155, B:41:0x0159, B:43:0x0165, B:45:0x016b, B:47:0x016f, B:48:0x01b7, B:53:0x01c2, B:55:0x01c6, B:59:0x01d6, B:98:0x02ac, B:100:0x02b0, B:102:0x02b4, B:105:0x02cc, B:106:0x02d2, B:107:0x02df, B:110:0x02e7, B:111:0x02f5, B:113:0x02fb, B:118:0x0322, B:117:0x0315, B:65:0x01e8, B:67:0x01f1, B:69:0x020b, B:63:0x01e1, B:70:0x0243, B:72:0x0247, B:77:0x025b, B:79:0x026a, B:97:0x029f, B:89:0x028b, B:91:0x0294, B:96:0x0299, B:85:0x0271), top: B:122:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x027f A[PHI: r0
  0x027f: PHI (r0v11 java.util.List<ivas.gov.bisp.enumeration.bG.ae>) = (r0v10 java.util.List<ivas.gov.bisp.enumeration.bG.ae>), (r0v18 java.util.List<ivas.gov.bisp.enumeration.bG.ae>) binds: [B:86:0x027d, B:80:0x026b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:89:0x028b A[Catch: Exception -> 0x032c, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x032c, blocks: (B:3:0x0011, B:5:0x0024, B:6:0x003d, B:8:0x0043, B:10:0x004f, B:11:0x005a, B:13:0x0063, B:15:0x006d, B:17:0x0079, B:19:0x007d, B:20:0x00c1, B:21:0x00c4, B:25:0x00d4, B:27:0x00e0, B:29:0x00e6, B:30:0x012e, B:32:0x0139, B:33:0x013d, B:36:0x0140, B:39:0x0155, B:41:0x0159, B:43:0x0165, B:45:0x016b, B:47:0x016f, B:48:0x01b7, B:53:0x01c2, B:55:0x01c6, B:59:0x01d6, B:98:0x02ac, B:100:0x02b0, B:102:0x02b4, B:105:0x02cc, B:106:0x02d2, B:107:0x02df, B:110:0x02e7, B:111:0x02f5, B:113:0x02fb, B:118:0x0322, B:117:0x0315, B:65:0x01e8, B:67:0x01f1, B:69:0x020b, B:63:0x01e1, B:70:0x0243, B:72:0x0247, B:77:0x025b, B:79:0x026a, B:97:0x029f, B:89:0x028b, B:91:0x0294, B:96:0x0299, B:85:0x0271), top: B:122:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0299 A[Catch: Exception -> 0x032c, TRY_ENTER, TryCatch #0 {Exception -> 0x032c, blocks: (B:3:0x0011, B:5:0x0024, B:6:0x003d, B:8:0x0043, B:10:0x004f, B:11:0x005a, B:13:0x0063, B:15:0x006d, B:17:0x0079, B:19:0x007d, B:20:0x00c1, B:21:0x00c4, B:25:0x00d4, B:27:0x00e0, B:29:0x00e6, B:30:0x012e, B:32:0x0139, B:33:0x013d, B:36:0x0140, B:39:0x0155, B:41:0x0159, B:43:0x0165, B:45:0x016b, B:47:0x016f, B:48:0x01b7, B:53:0x01c2, B:55:0x01c6, B:59:0x01d6, B:98:0x02ac, B:100:0x02b0, B:102:0x02b4, B:105:0x02cc, B:106:0x02d2, B:107:0x02df, B:110:0x02e7, B:111:0x02f5, B:113:0x02fb, B:118:0x0322, B:117:0x0315, B:65:0x01e8, B:67:0x01f1, B:69:0x020b, B:63:0x01e1, B:70:0x0243, B:72:0x0247, B:77:0x025b, B:79:0x026a, B:97:0x029f, B:89:0x028b, B:91:0x0294, B:96:0x0299, B:85:0x0271), top: B:122:0x0011 }] */
    private void disableSelectedSpouseFromMaleList(View view, B b, B b2, B b3, Spinner spinner, Spinner spinner2, B b4) {
        List<ae> list;
        int i;
        int i2;
        List<ae> list2;
        int i3 = 2 % 2;
        try {
            F f2 = (F) b4;
            ArrayList<B> arrayList = ((af) spinner.getAdapter()).d;
            F f3 = ((ae) b2).a;
            if (f2 == null) {
                f2 = new F(-1, BuildConfig.FLAVOR, BuildConfig.FLAVOR, -1, -1, BuildConfig.FLAVOR, -1, null, null, null);
            }
            if (f2.d == b3.d && ((B) spinner.getSelectedItem()).d == b2.d) {
                ((C0118b) spinner.getOnItemSelectedListener()).c = false;
                spinner.setSelection(0);
            }
            if (b.d == b3.d && ((B) spinner.getSelectedItem()).d > 0 && ((B) spinner.getSelectedItem()).d != b.d) {
                if (f2.d >= 0) {
                    Activity activity = getActivity();
                    Object[] objArr = new Object[1];
                    b(1985360193 - Color.red(0), new char[]{0, 0, 0, 0}, (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), new char[]{16692, 22065, 13686, 53375}, new char[]{22774, 61675, 1869, 63096, 32392, 32622, 60393, 20951, 58129, 43618, 12489, 21741, 44157, 51012, 51588, 62919, 8181, 62283, 57202, 1071, 49449, 42317, 32603, 25851, 36021, 56635, 41190, 53342, 59315, 41518, 6363, 8831, 17709, 35826, 12395}, objArr);
                    Toast.makeText(activity, ((String) objArr[0]).intern(), 0).show();
                }
                changeSpouseToDefault(view, f3, b, b2);
            }
            if (b.d >= 0) {
                int i4 = f + 97;
                e = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = b2.d;
                    int i6 = ((B) spinner.getSelectedItem()).d;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (b2.d == ((B) spinner.getSelectedItem()).d && b3.d != b.d) {
                    Activity activity2 = getActivity();
                    Object[] objArr2 = new Object[1];
                    b(Color.argb(0, 0, 0, 0) + 1985360193, new char[]{0, 0, 0, 0}, (char) Color.red(0), new char[]{16692, 22065, 13686, 53375}, new char[]{22774, 61675, 1869, 63096, 32392, 32622, 60393, 20951, 58129, 43618, 12489, 21741, 44157, 51012, 51588, 62919, 8181, 62283, 57202, 1071, 49449, 42317, 32603, 25851, 36021, 56635, 41190, 53342, 59315, 41518, 6363, 8831, 17709, 35826, 12395}, objArr2);
                    Toast.makeText(activity2, ((String) objArr2[0]).intern(), 0).show();
                    spinner.setSelection(0);
                }
            }
            if (((B) spinner.getSelectedItem()).d > 0) {
                int i7 = e + 35;
                f = i7 % 128;
                int i8 = i7 % 2;
                if ((b2 instanceof ae) && ((B) spinner.getSelectedItem()).d == b2.d && b.d != b3.d) {
                    if (f2.d >= 0) {
                        Activity activity3 = getActivity();
                        Object[] objArr3 = new Object[1];
                        b(12657 - AndroidCharacter.getMirror('0'), new char[]{0, 0, 0, 0}, (char) TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0), new char[]{16692, 22065, 13686, 53375}, new char[]{22774, 61675, 1869, 63096, 32392, 32622, 60393, 20951, 58129, 43618, 12489, 21741, 44157, 51012, 51588, 62919, 8181, 62283, 57202, 1071, 49449, 42317, 32603, 25851, 36021, 56635, 41190, 53342, 59315, 41518, 6363, 8831, 17709, 35826, 12395}, objArr3);
                        Toast.makeText(activity3, ((String) objArr3[0]).intern(), 0).show();
                    }
                    changeSpouseToDefault(view, f3, b, b2);
                }
            }
            if ((b2 instanceof ae) && (b instanceof F) && (i2 = b.d) >= 0 && i2 == b3.d) {
                int i9 = f + 91;
                e = i9 % 128;
                if (i9 % 2 != 0) {
                    list2 = ((F) b3).a;
                    int i10 = 1 / 0;
                    if (list2 != null) {
                        if (!list2.contains((ae) b2)) {
                            ((ae) b2).a = (F) b;
                            list2.add((ae) b2);
                            ((F) b3).a = list2;
                            if (list2.size() > 4) {
                                Activity activity4 = getActivity();
                                StringBuilder sb = new StringBuilder();
                                sb.append(b.e);
                                Object[] objArr4 = new Object[1];
                                a(Color.red(0) + 1, new char[]{6479, 65493, 1426, 6511, 13235, 40432, 25191, 10550, 919, 52700, 1536, 37448, 31063, 54146, 64949, 49723, 35198, 41902, 11716, 62025, 55624, 29643, 23962, 8928, 59824}, objArr4);
                                sb.append(((String) objArr4[0]).intern());
                                Toast.makeText(activity4, sb.toString(), 0).show();
                            }
                        }
                    }
                } else {
                    list2 = ((F) b3).a;
                    if (list2 != null) {
                        if (!list2.contains((ae) b2)) {
                            ((ae) b2).a = (F) b;
                            list2.add((ae) b2);
                            ((F) b3).a = list2;
                            if (list2.size() > 4) {
                                Activity activity5 = getActivity();
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(b.e);
                                Object[] objArr5 = new Object[1];
                                a(Color.red(0) + 1, new char[]{6479, 65493, 1426, 6511, 13235, 40432, 25191, 10550, 919, 52700, 1536, 37448, 31063, 54146, 64949, 49723, 35198, 41902, 11716, 62025, 55624, 29643, 23962, 8928, 59824}, objArr5);
                                sb2.append(((String) objArr5[0]).intern());
                                Toast.makeText(activity5, sb2.toString(), 0).show();
                            }
                        }
                    }
                }
            } else {
                int i11 = b.d;
                if (i11 < 0 && f2.d == b3.d && i11 < 0) {
                    int i12 = e + 105;
                    f = i12 % 128;
                    if (i12 % 2 == 0) {
                        list = ((F) b3).a;
                        int i13 = 12 / 0;
                        if (list.contains((ae) b2)) {
                            i = e + 29;
                            f = i % 128;
                            if (i % 2 == 0) {
                                list.remove((ae) b2);
                                int i14 = 91 / 0;
                            } else {
                                list.remove((ae) b2);
                            }
                        }
                    } else {
                        list = ((F) b3).a;
                        if (list.contains((ae) b2)) {
                            i = e + 29;
                            f = i % 128;
                            if (i % 2 == 0) {
                                list.remove((ae) b2);
                                int i15 = 91 / 0;
                            } else {
                                list.remove((ae) b2);
                            }
                        }
                    }
                    ((F) b3).a = list;
                    ((ae) b2).a = (F) b;
                }
            }
            int i16 = f2.d;
            if (i16 >= 0 && i16 == b3.d) {
                List<ae> list3 = ((F) b3).a;
                if (list3.contains((ae) b2)) {
                    int i17 = f + 89;
                    e = i17 % 128;
                    int i18 = i17 % 2;
                    list3.remove((ae) b2);
                }
                ((F) b3).a = list3;
                ((ae) b2).a = (F) b;
            }
            int i19 = b3.d;
            int i20 = b.d;
            if (i19 != i20 && i20 >= 0) {
                ((af) spinner.getAdapter()).d(arrayList.indexOf(b2), false);
            }
            int i21 = b.d;
            if (i21 == b3.d) {
                ((af) spinner.getAdapter()).d(arrayList.indexOf(b2), true);
            } else if (i21 < 0) {
                int i22 = f + 103;
                e = i22 % 128;
                int i23 = i22 % 2;
                ((af) spinner.getAdapter()).d(arrayList.indexOf(b2), true);
            }
            ((af) spinner.getAdapter()).notifyDataSetChanged();
        } catch (Exception unused) {
            Activity activity6 = getActivity();
            Object[] objArr6 = new Object[1];
            a(1 - View.getDefaultSize(0, 0), new char[]{55490, 17243, 57838, 55441, 36659, 31117, 5029, 59562, 48912, 10669, 30677, 58250, 47261, 28484, 6619, 46077, 18660, 8041, 51683, 33737, 6337, 53056, 47593, 21360, 10297, 65453, 26906, 8960, 63562, 44931, 22826, 62215, 34920, 24567, 2332, 50044, 22606, 4057, 63841, 37715, 26715, 15992, 43143, 25260, 14783, 60967, 39075}, objArr6);
            Toast.makeText(activity6, ((String) objArr6[0]).intern(), 0).show();
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002f A[Catch: Exception -> 0x018e, TryCatch #2 {Exception -> 0x018e, blocks: (B:10:0x0022, B:12:0x0025, B:58:0x0103, B:60:0x0107, B:68:0x012a, B:70:0x0134, B:71:0x013a, B:72:0x0140, B:75:0x0143, B:82:0x0160, B:84:0x016f, B:86:0x0185, B:19:0x002f, B:21:0x003a, B:27:0x0060, B:29:0x006a, B:30:0x0070, B:31:0x0076, B:32:0x0079, B:35:0x007c, B:36:0x0084, B:41:0x0096, B:43:0x009c, B:52:0x00b3, B:53:0x00bf, B:54:0x00c8, B:48:0x00a2, B:57:0x00cb, B:17:0x002b, B:79:0x014e, B:81:0x0159), top: B:95:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x003a A[Catch: Exception -> 0x018e, TRY_LEAVE, TryCatch #2 {Exception -> 0x018e, blocks: (B:10:0x0022, B:12:0x0025, B:58:0x0103, B:60:0x0107, B:68:0x012a, B:70:0x0134, B:71:0x013a, B:72:0x0140, B:75:0x0143, B:82:0x0160, B:84:0x016f, B:86:0x0185, B:19:0x002f, B:21:0x003a, B:27:0x0060, B:29:0x006a, B:30:0x0070, B:31:0x0076, B:32:0x0079, B:35:0x007c, B:36:0x0084, B:41:0x0096, B:43:0x009c, B:52:0x00b3, B:53:0x00bf, B:54:0x00c8, B:48:0x00a2, B:57:0x00cb, B:17:0x002b, B:79:0x014e, B:81:0x0159), top: B:95:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    /* JADX WARN: Code duplicated, block: B:25:0x0057  */
    /* JADX WARN: Code duplicated, block: B:27:0x0060 A[Catch: Exception -> 0x018e, TRY_ENTER, TryCatch #2 {Exception -> 0x018e, blocks: (B:10:0x0022, B:12:0x0025, B:58:0x0103, B:60:0x0107, B:68:0x012a, B:70:0x0134, B:71:0x013a, B:72:0x0140, B:75:0x0143, B:82:0x0160, B:84:0x016f, B:86:0x0185, B:19:0x002f, B:21:0x003a, B:27:0x0060, B:29:0x006a, B:30:0x0070, B:31:0x0076, B:32:0x0079, B:35:0x007c, B:36:0x0084, B:41:0x0096, B:43:0x009c, B:52:0x00b3, B:53:0x00bf, B:54:0x00c8, B:48:0x00a2, B:57:0x00cb, B:17:0x002b, B:79:0x014e, B:81:0x0159), top: B:95:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x006a A[Catch: Exception -> 0x018e, TryCatch #2 {Exception -> 0x018e, blocks: (B:10:0x0022, B:12:0x0025, B:58:0x0103, B:60:0x0107, B:68:0x012a, B:70:0x0134, B:71:0x013a, B:72:0x0140, B:75:0x0143, B:82:0x0160, B:84:0x016f, B:86:0x0185, B:19:0x002f, B:21:0x003a, B:27:0x0060, B:29:0x006a, B:30:0x0070, B:31:0x0076, B:32:0x0079, B:35:0x007c, B:36:0x0084, B:41:0x0096, B:43:0x009c, B:52:0x00b3, B:53:0x00bf, B:54:0x00c8, B:48:0x00a2, B:57:0x00cb, B:17:0x002b, B:79:0x014e, B:81:0x0159), top: B:95:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0070 A[Catch: Exception -> 0x018e, TRY_LEAVE, TryCatch #2 {Exception -> 0x018e, blocks: (B:10:0x0022, B:12:0x0025, B:58:0x0103, B:60:0x0107, B:68:0x012a, B:70:0x0134, B:71:0x013a, B:72:0x0140, B:75:0x0143, B:82:0x0160, B:84:0x016f, B:86:0x0185, B:19:0x002f, B:21:0x003a, B:27:0x0060, B:29:0x006a, B:30:0x0070, B:31:0x0076, B:32:0x0079, B:35:0x007c, B:36:0x0084, B:41:0x0096, B:43:0x009c, B:52:0x00b3, B:53:0x00bf, B:54:0x00c8, B:48:0x00a2, B:57:0x00cb, B:17:0x002b, B:79:0x014e, B:81:0x0159), top: B:95:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x008b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0096 A[Catch: Exception -> 0x018e, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x018e, blocks: (B:10:0x0022, B:12:0x0025, B:58:0x0103, B:60:0x0107, B:68:0x012a, B:70:0x0134, B:71:0x013a, B:72:0x0140, B:75:0x0143, B:82:0x0160, B:84:0x016f, B:86:0x0185, B:19:0x002f, B:21:0x003a, B:27:0x0060, B:29:0x006a, B:30:0x0070, B:31:0x0076, B:32:0x0079, B:35:0x007c, B:36:0x0084, B:41:0x0096, B:43:0x009c, B:52:0x00b3, B:53:0x00bf, B:54:0x00c8, B:48:0x00a2, B:57:0x00cb, B:17:0x002b, B:79:0x014e, B:81:0x0159), top: B:95:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00a2 A[Catch: Exception -> 0x018e, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x018e, blocks: (B:10:0x0022, B:12:0x0025, B:58:0x0103, B:60:0x0107, B:68:0x012a, B:70:0x0134, B:71:0x013a, B:72:0x0140, B:75:0x0143, B:82:0x0160, B:84:0x016f, B:86:0x0185, B:19:0x002f, B:21:0x003a, B:27:0x0060, B:29:0x006a, B:30:0x0070, B:31:0x0076, B:32:0x0079, B:35:0x007c, B:36:0x0084, B:41:0x0096, B:43:0x009c, B:52:0x00b3, B:53:0x00bf, B:54:0x00c8, B:48:0x00a2, B:57:0x00cb, B:17:0x002b, B:79:0x014e, B:81:0x0159), top: B:95:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b3 A[Catch: Exception -> 0x018e, TRY_ENTER, TryCatch #2 {Exception -> 0x018e, blocks: (B:10:0x0022, B:12:0x0025, B:58:0x0103, B:60:0x0107, B:68:0x012a, B:70:0x0134, B:71:0x013a, B:72:0x0140, B:75:0x0143, B:82:0x0160, B:84:0x016f, B:86:0x0185, B:19:0x002f, B:21:0x003a, B:27:0x0060, B:29:0x006a, B:30:0x0070, B:31:0x0076, B:32:0x0079, B:35:0x007c, B:36:0x0084, B:41:0x0096, B:43:0x009c, B:52:0x00b3, B:53:0x00bf, B:54:0x00c8, B:48:0x00a2, B:57:0x00cb, B:17:0x002b, B:79:0x014e, B:81:0x0159), top: B:95:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00bf A[Catch: Exception -> 0x018e, TRY_LEAVE, TryCatch #2 {Exception -> 0x018e, blocks: (B:10:0x0022, B:12:0x0025, B:58:0x0103, B:60:0x0107, B:68:0x012a, B:70:0x0134, B:71:0x013a, B:72:0x0140, B:75:0x0143, B:82:0x0160, B:84:0x016f, B:86:0x0185, B:19:0x002f, B:21:0x003a, B:27:0x0060, B:29:0x006a, B:30:0x0070, B:31:0x0076, B:32:0x0079, B:35:0x007c, B:36:0x0084, B:41:0x0096, B:43:0x009c, B:52:0x00b3, B:53:0x00bf, B:54:0x00c8, B:48:0x00a2, B:57:0x00cb, B:17:0x002b, B:79:0x014e, B:81:0x0159), top: B:95:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00cb A[Catch: Exception -> 0x018e, TRY_ENTER, TryCatch #2 {Exception -> 0x018e, blocks: (B:10:0x0022, B:12:0x0025, B:58:0x0103, B:60:0x0107, B:68:0x012a, B:70:0x0134, B:71:0x013a, B:72:0x0140, B:75:0x0143, B:82:0x0160, B:84:0x016f, B:86:0x0185, B:19:0x002f, B:21:0x003a, B:27:0x0060, B:29:0x006a, B:30:0x0070, B:31:0x0076, B:32:0x0079, B:35:0x007c, B:36:0x0084, B:41:0x0096, B:43:0x009c, B:52:0x00b3, B:53:0x00bf, B:54:0x00c8, B:48:0x00a2, B:57:0x00cb, B:17:0x002b, B:79:0x014e, B:81:0x0159), top: B:95:0x0013 }] */
    private void disableSelectedSpouse(B b, B b2, B b3, Spinner spinner, List<B> list, boolean z) {
        List<ae> list2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = e;
        int i7 = i6 + 89;
        f = i7 % 128;
        Object obj = null;
        if (i7 % 2 == 0) {
            boolean z2 = b3 instanceof F;
            throw null;
        }
        try {
            if ((b3 instanceof F) && (b instanceof ae)) {
                int i8 = i6 + 53;
                f = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 7 / 0;
                    if (b.d > 0) {
                        if (!((F) b3).a.contains(b)) {
                            list2 = ((F) b3).a;
                            if (((F) b3).a.contains(b2)) {
                                i3 = e;
                                int i10 = i3 + 107;
                                f = i10 % 128;
                                int i11 = i10 % 2;
                                if (b2 instanceof ae) {
                                    i4 = i3 + 55;
                                    f = i4 % 128;
                                    if (i4 % 2 != 0) {
                                        F f2 = ((ae) b2).a;
                                        try {
                                            obj.hashCode();
                                            throw null;
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                    if (((ae) b2).a == ((F) b3)) {
                                        ((ae) b2).a = null;
                                    }
                                }
                                ((F) b3).a.remove(b2);
                            }
                            if (list2.size() < 5) {
                                i = f + 117;
                                e = i % 128;
                                if (i % 2 != 0) {
                                    int i12 = 9 / 0;
                                    if (list2.contains(b)) {
                                        Activity activity = getActivity();
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(b3.e);
                                        Object[] objArr = new Object[1];
                                        a((ViewConfiguration.getEdgeSlop() >> 16) + 1, new char[]{6479, 65493, 1426, 6511, 13235, 40432, 25191, 10550, 919, 52700, 1536, 37448, 31063, 54146, 64949, 49723, 35198, 41902, 11716, 62025, 55624, 29643, 23962, 8928, 59824}, objArr);
                                        sb.append(((String) objArr[0]).intern());
                                        Toast.makeText(activity, sb.toString(), 0).show();
                                    } else {
                                        i2 = e + 99;
                                        f = i2 % 128;
                                        if (i2 % 2 != 0) {
                                            list2.add((ae) b);
                                            ((F) b3).a = list2;
                                            try {
                                                throw null;
                                            } catch (Throwable th2) {
                                                throw th2;
                                            }
                                        }
                                        list2.add((ae) b);
                                        ((F) b3).a = list2;
                                    }
                                } else if (list2.contains(b)) {
                                    Activity activity2 = getActivity();
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(b3.e);
                                    Object[] objArr2 = new Object[1];
                                    a((ViewConfiguration.getEdgeSlop() >> 16) + 1, new char[]{6479, 65493, 1426, 6511, 13235, 40432, 25191, 10550, 919, 52700, 1536, 37448, 31063, 54146, 64949, 49723, 35198, 41902, 11716, 62025, 55624, 29643, 23962, 8928, 59824}, objArr2);
                                    sb2.append(((String) objArr2[0]).intern());
                                    Toast.makeText(activity2, sb2.toString(), 0).show();
                                } else {
                                    i2 = e + 99;
                                    f = i2 % 128;
                                    if (i2 % 2 != 0) {
                                        list2.add((ae) b);
                                        ((F) b3).a = list2;
                                        throw null;
                                    }
                                    list2.add((ae) b);
                                    ((F) b3).a = list2;
                                }
                            } else {
                                Activity activity3 = getActivity();
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(b3.e);
                                Object[] objArr3 = new Object[1];
                                a((ViewConfiguration.getEdgeSlop() >> 16) + 1, new char[]{6479, 65493, 1426, 6511, 13235, 40432, 25191, 10550, 919, 52700, 1536, 37448, 31063, 54146, 64949, 49723, 35198, 41902, 11716, 62025, 55624, 29643, 23962, 8928, 59824}, objArr3);
                                sb3.append(((String) objArr3[0]).intern());
                                Toast.makeText(activity3, sb3.toString(), 0).show();
                            }
                        }
                    }
                } else if (b.d > 0) {
                    if (!((F) b3).a.contains(b)) {
                        list2 = ((F) b3).a;
                        if (((F) b3).a.contains(b2)) {
                            i3 = e;
                            int i13 = i3 + 107;
                            f = i13 % 128;
                            int i14 = i13 % 2;
                            if (b2 instanceof ae) {
                                i4 = i3 + 55;
                                f = i4 % 128;
                                if (i4 % 2 != 0) {
                                    F f3 = ((ae) b2).a;
                                    obj.hashCode();
                                    throw null;
                                }
                                if (((ae) b2).a == ((F) b3)) {
                                    ((ae) b2).a = null;
                                }
                            }
                            ((F) b3).a.remove(b2);
                        }
                        if (list2.size() < 5) {
                            i = f + 117;
                            e = i % 128;
                            if (i % 2 != 0) {
                                int i15 = 9 / 0;
                                if (list2.contains(b)) {
                                    Activity activity4 = getActivity();
                                    StringBuilder sb4 = new StringBuilder();
                                    sb4.append(b3.e);
                                    Object[] objArr4 = new Object[1];
                                    a((ViewConfiguration.getEdgeSlop() >> 16) + 1, new char[]{6479, 65493, 1426, 6511, 13235, 40432, 25191, 10550, 919, 52700, 1536, 37448, 31063, 54146, 64949, 49723, 35198, 41902, 11716, 62025, 55624, 29643, 23962, 8928, 59824}, objArr4);
                                    sb4.append(((String) objArr4[0]).intern());
                                    Toast.makeText(activity4, sb4.toString(), 0).show();
                                } else {
                                    i2 = e + 99;
                                    f = i2 % 128;
                                    if (i2 % 2 != 0) {
                                        list2.add((ae) b);
                                        ((F) b3).a = list2;
                                        throw null;
                                    }
                                    list2.add((ae) b);
                                    ((F) b3).a = list2;
                                }
                            } else if (list2.contains(b)) {
                                i2 = e + 99;
                                f = i2 % 128;
                                if (i2 % 2 != 0) {
                                    list2.add((ae) b);
                                    ((F) b3).a = list2;
                                    throw null;
                                }
                                list2.add((ae) b);
                                ((F) b3).a = list2;
                            } else {
                                Activity activity5 = getActivity();
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append(b3.e);
                                Object[] objArr5 = new Object[1];
                                a((ViewConfiguration.getEdgeSlop() >> 16) + 1, new char[]{6479, 65493, 1426, 6511, 13235, 40432, 25191, 10550, 919, 52700, 1536, 37448, 31063, 54146, 64949, 49723, 35198, 41902, 11716, 62025, 55624, 29643, 23962, 8928, 59824}, objArr5);
                                sb5.append(((String) objArr5[0]).intern());
                                Toast.makeText(activity5, sb5.toString(), 0).show();
                            }
                        } else {
                            Activity activity6 = getActivity();
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append(b3.e);
                            Object[] objArr6 = new Object[1];
                            a((ViewConfiguration.getEdgeSlop() >> 16) + 1, new char[]{6479, 65493, 1426, 6511, 13235, 40432, 25191, 10550, 919, 52700, 1536, 37448, 31063, 54146, 64949, 49723, 35198, 41902, 11716, 62025, 55624, 29643, 23962, 8928, 59824}, objArr6);
                            sb6.append(((String) objArr6[0]).intern());
                            Toast.makeText(activity6, sb6.toString(), 0).show();
                        }
                    }
                }
                if (b.d < 0 && ((F) b3).a.contains(b2)) {
                    int i16 = e;
                    int i17 = i16 + 9;
                    f = i17 % 128;
                    if (i17 % 2 == 0) {
                        boolean z3 = b2 instanceof ae;
                        throw null;
                    }
                    if (b2 instanceof ae) {
                        int i18 = i16 + 31;
                        f = i18 % 128;
                        if (i18 % 2 == 0) {
                            F f4 = ((ae) b2).a;
                            try {
                                throw null;
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                        if (((ae) b2).a == ((F) b3)) {
                            ((ae) b2).a = null;
                        }
                    }
                    ((F) b3).a.remove(b2);
                }
            } else if (((F) b3).a.contains(b2)) {
                ((F) b3).a.remove(b2);
            }
            ((af) spinner.getAdapter()).d(list.indexOf(b), false);
            if (z) {
                ((af) spinner.getAdapter()).d(list.indexOf(b2), true);
                int i19 = f + 97;
                e = i19 % 128;
                int i20 = i19 % 2;
            }
            ((af) spinner.getAdapter()).notifyDataSetChanged();
        } catch (Exception unused) {
        }
    }

    private void generateList(B b) {
        boolean z;
        int i = 2 % 2;
        try {
            LinearLayout linearLayout = new LinearLayout(getActivity());
            linearLayout.setOrientation(1);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, OPTION_NOT_ALIVE_ID);
            layoutParams.setMargins(0, 0, 0, 10);
            linearLayout.setLayoutParams(layoutParams);
            linearLayout.setTag(b);
            LinearLayout linearLayout2 = new LinearLayout(getActivity());
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, OPTION_NOT_ALIVE_ID);
            layoutParams2.setMargins(0, 0, 0, 10);
            linearLayout2.setPadding(0, 10, 0, 10);
            linearLayout2.setLayoutParams(layoutParams2);
            linearLayout2.setOrientation(1);
            linearLayout2.setGravity(17);
            Activity activity = getActivity();
            Object obj = l.c;
            linearLayout2.setBackgroundColor(l.aUI.b(activity, R.color.colorAccent));
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(OPTION_NOT_ALIVE_ID, OPTION_NOT_ALIVE_ID);
            TextView textView = new TextView(getActivity());
            textView.setLayoutParams(layoutParams3);
            textView.setGravity(17);
            textView.setTextColor(l.aUI.b(getActivity(), R.color.white));
            textView.setText(b.e);
            TextView textView2 = new TextView(getActivity());
            textView2.setLayoutParams(layoutParams3);
            textView2.setGravity(17);
            textView2.setTextColor(l.aUI.b(getActivity(), R.color.white));
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            a(1 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), new char[]{33193, 59194, 12684, 33153, 10917}, objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(b.f);
            Object[] objArr2 = new Object[1];
            a(1 - Gravity.getAbsoluteGravity(0, 0), new char[]{9984, 22920, 34291, 10016, 38390, 7567, 38943, 6013, 42437, 19901, 64554, 26683}, objArr2);
            sb.append(((String) objArr2[0]).intern());
            sb.append(b.g);
            Object[] objArr3 = new Object[1];
            b((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), new char[]{0, 0, 0, 0}, (char) Drawable.resolveOpacity(0, 0), new char[]{57811, 10499, 10892, 34838}, new char[]{6318, 6327, 64450, 34769, 61882, 5304, 13818, 6112}, objArr3);
            sb.append(((String) objArr3[0]).intern());
            textView2.setText(sb.toString());
            linearLayout2.addView(textView);
            linearLayout2.addView(textView2);
            final Spinner spinner = new Spinner(getActivity());
            spinner.setBackgroundDrawable(getResources().getDrawable(R.drawable.spinner_bg_right));
            spinner.setLayoutParams(layoutParams);
            String str = b.h;
            Object[] objArr4 = new Object[1];
            b(ViewConfiguration.getJumpTapTimeout() >> 16, new char[]{0, 0, 0, 0}, (char) ((ViewConfiguration.getTapTimeout() >> 16) + 24127), new char[]{37447, 28413, 16218, 56670}, new char[]{48064, 46571, 60228, 35824}, objArr4);
            if (str.equalsIgnoreCase(((String) objArr4[0]).intern())) {
                Activity activity2 = getActivity();
                ArrayList<B> arrayList = this.mPersonList;
                Object[] objArr5 = new Object[1];
                a((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), new char[]{16793, 5201, 18784, 16842, 55347, 53506, 63710, 29158, 59398, 33130, 40110, 2252, 8657, 14337, 45395, 22672, 53672}, objArr5);
                spinner.setAdapter((SpinnerAdapter) new af(activity2, android.R.layout.simple_dropdown_item_1line, getAllFemalesSpouse(1, arrayList, ((String) objArr5[0]).intern(), null)));
            } else {
                String str2 = b.h;
                Object[] objArr6 = new Object[1];
                b(Color.green(0), new char[]{0, 0, 0, 0}, (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 29435), new char[]{63179, 24604, 64324, 22898}, new char[]{48625, 23110, 24899, 42032, 36816, 41953}, objArr6);
                if (str2.equalsIgnoreCase(((String) objArr6[0]).intern())) {
                    Activity activity3 = getActivity();
                    ArrayList<B> arrayList2 = this.mPersonList;
                    Object[] objArr7 = new Object[1];
                    a(View.MeasureSpec.getSize(0) + 1, new char[]{16793, 5201, 18784, 16842, 55347, 53506, 63710, 29158, 59398, 33130, 40110, 2252, 8657, 14337, 45395, 22672, 53672}, objArr7);
                    spinner.setAdapter((SpinnerAdapter) new af(activity3, android.R.layout.simple_dropdown_item_1line, getAllMaleSpouse(1, arrayList2, ((String) objArr7[0]).intern(), null)));
                } else {
                    Activity activity4 = getActivity();
                    ArrayList<B> arrayList3 = this.mPersonList;
                    Object[] objArr8 = new Object[1];
                    a((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1, new char[]{16793, 5201, 18784, 16842, 55347, 53506, 63710, 29158, 59398, 33130, 40110, 2252, 8657, 14337, 45395, 22672, 53672}, objArr8);
                    spinner.setAdapter((SpinnerAdapter) new af(activity4, android.R.layout.simple_dropdown_item_1line, getAllMaleAndFemalesSpouse(1, arrayList3, ((String) objArr8[0]).intern(), b)));
                }
            }
            final Spinner spinner2 = new Spinner(getActivity());
            spinner2.setBackgroundDrawable(getResources().getDrawable(R.drawable.spinner_bg_right));
            spinner2.setLayoutParams(layoutParams);
            Activity activity5 = getActivity();
            ArrayList<B> arrayList4 = this.mPersonList;
            Object[] objArr9 = new Object[1];
            b(KeyEvent.getDeadChar(0, 0) - 1876091603, new char[]{0, 0, 0, 0}, (char) (Color.green(0) + 42859), new char[]{11724, 11549, 27536, 34727}, new char[]{157, 51193, 46510, 271, 25739, 17950, 13010, 11876, 16162, 39147, 5624, 27426, 10659}, objArr9);
            spinner2.setAdapter((SpinnerAdapter) new af(activity5, android.R.layout.simple_dropdown_item_1line, getAllMaleFather(2, arrayList4, ((String) objArr9[0]).intern(), b)));
            final Spinner spinner3 = new Spinner(getActivity());
            spinner3.setBackgroundDrawable(getResources().getDrawable(R.drawable.spinner_bg_right));
            spinner3.setLayoutParams(layoutParams);
            Activity activity6 = getActivity();
            ArrayList<B> arrayList5 = this.mPersonList;
            Object[] objArr10 = new Object[1];
            a((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), new char[]{21549, 52854, 13392, 21630, 532, 44082, 4804, 25682, 12833, 64602, 30388, 58056, 13434, 57917, 52350, 45724, 50187}, objArr10);
            spinner3.setAdapter((SpinnerAdapter) new af(activity6, android.R.layout.simple_dropdown_item_1line, getAllFemalesMother(3, arrayList5, ((String) objArr10[0]).intern(), b)));
            C0118b c0118b = new C0118b(new InterfaceC0029o() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentRelationship.1
                private static int a = 0;
                private static int b = 1;

                @Override // ivas.gov.bisp.enumeration.W.InterfaceC0029o
                public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j) {
                    B b2;
                    af afVar;
                    FragmentRelationship fragmentRelationship;
                    View viewAccess$000;
                    Spinner spinner4;
                    B b3;
                    B b4;
                    int i3;
                    int i4 = 2 % 2;
                    int i5 = a + 61;
                    b = i5 % 128;
                    Object obj2 = null;
                    try {
                        if (i5 % 2 == 0) {
                            spinner.getTag();
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                        if (spinner.getTag() != null) {
                            int i6 = b;
                            int i7 = ((i6 ^ 115) | (i6 & 115)) << 1;
                            int i8 = -(((~i6) & 115) | (i6 & (-116)));
                            int i9 = (i7 & i8) + (i8 | i7);
                            a = i9 % 128;
                            if (i9 % 2 != 0) {
                                obj2.hashCode();
                                throw null;
                            }
                            b2 = (B) spinner.getTag();
                        } else {
                            int i10 = a;
                            int i11 = (i10 ^ 63) + ((i10 & 63) << 1);
                            b = i11 % 128;
                            int i12 = i11 % 2;
                            b2 = null;
                        }
                        B b5 = (B) spinner.getSelectedItem();
                        Spinner spinner5 = spinner;
                        int i13 = b;
                        int i14 = i13 & 93;
                        int i15 = i14 + ((i13 ^ 93) | i14);
                        a = i15 % 128;
                        if (i15 % 2 != 0) {
                            spinner5.setTag(b5);
                            afVar = (af) spinner.getAdapter();
                            int i16 = 75 / 0;
                        } else {
                            spinner5.setTag(b5);
                            afVar = (af) spinner.getAdapter();
                        }
                        ArrayList<B> arrayList6 = afVar.d;
                        LinearLayout linearLayout3 = (LinearLayout) spinner.getParent();
                        int i17 = b + 51;
                        a = i17 % 128;
                        int i18 = i17 % 2;
                        B b6 = (B) linearLayout3.getTag();
                        int i19 = b;
                        int i20 = i19 & 109;
                        int i21 = (((i19 | 109) & (~i20)) - (~(-(-(i20 << 1))))) - 1;
                        a = i21 % 128;
                        int i22 = i21 % 2;
                        Spinner spinner6 = (Spinner) linearLayout3.getChildAt(2);
                        Spinner spinner7 = (Spinner) linearLayout3.getChildAt(3);
                        int i23 = b + 69;
                        a = i23 % 128;
                        int i24 = i23 % 2;
                        if (b5.d != -1) {
                            int i25 = b;
                            int i26 = ((i25 | 11) << 1) - (i25 ^ 11);
                            a = i26 % 128;
                            int i27 = i26 % 2;
                            spinner6.setEnabled(true);
                            spinner6.setClickable(true);
                            int i28 = b;
                            int i29 = ((i28 | 107) << 1) - (i28 ^ 107);
                            a = i29 % 128;
                            if (i29 % 2 != 0) {
                                spinner7.setEnabled(false);
                                spinner7.setClickable(false);
                            } else {
                                spinner7.setEnabled(true);
                                spinner7.setClickable(true);
                            }
                            int i30 = a;
                            int i31 = i30 & 117;
                            int i32 = ((i30 ^ 117) | i31) << 1;
                            int i33 = -((i30 | 117) & (~i31));
                            int i34 = ((i32 | i33) << 1) - (i33 ^ i32);
                            b = i34 % 128;
                            int i35 = i34 % 2;
                        } else {
                            spinner6.setEnabled(false);
                            spinner6.setClickable(false);
                            int i36 = a;
                            int i37 = i36 & 17;
                            int i38 = ((i36 ^ 17) | i37) << 1;
                            int i39 = -((i36 | 17) & (~i37));
                            int i40 = (i38 & i39) + (i39 | i38);
                            b = i40 % 128;
                            if (i40 % 2 == 0) {
                                spinner7.setEnabled(false);
                                spinner7.setClickable(true);
                            } else {
                                spinner7.setEnabled(false);
                                spinner7.setClickable(false);
                            }
                        }
                        if (b6 instanceof F) {
                            int i41 = b + 63;
                            a = i41 % 128;
                            if (i41 % 2 != 0) {
                                FragmentRelationship fragmentRelationship2 = FragmentRelationship.this;
                                FragmentRelationship.access$100(fragmentRelationship2, FragmentRelationship.access$000(fragmentRelationship2), b2, b6);
                                Object obj4 = null;
                                obj4.hashCode();
                                throw null;
                            }
                            FragmentRelationship fragmentRelationship3 = FragmentRelationship.this;
                            boolean zAccess$100 = FragmentRelationship.access$100(fragmentRelationship3, FragmentRelationship.access$000(fragmentRelationship3), b2, b6);
                            FragmentRelationship fragmentRelationship4 = FragmentRelationship.this;
                            View viewAccess$001 = FragmentRelationship.access$000(fragmentRelationship4);
                            Spinner spinner8 = spinner;
                            int i42 = a;
                            int i43 = (i42 ^ 83) + ((i42 & 83) << 1);
                            b = i43 % 128;
                            int i44 = i43 % 2;
                            FragmentRelationship.access$200(fragmentRelationship4, viewAccess$001, spinner8, b5, b2, b6, arrayList6, i2, zAccess$100);
                            FragmentRelationship fragmentRelationship5 = FragmentRelationship.this;
                            int i45 = a;
                            int i46 = i45 & 121;
                            int i47 = (i45 | 121) & (~i46);
                            int i48 = -(-(i46 << 1));
                            int i49 = ((i47 | i48) << 1) - (i47 ^ i48);
                            b = i49 % 128;
                            int i50 = i49 % 2;
                            FragmentRelationship.access$300(fragmentRelationship5, b5, b2, spinner);
                            FragmentRelationship fragmentRelationship6 = FragmentRelationship.this;
                            View viewAccess$002 = FragmentRelationship.access$000(fragmentRelationship6);
                            int i51 = b;
                            int i52 = (i51 & 64) + (i51 | 64);
                            int i53 = (i52 ^ (-1)) + (i52 << 1);
                            a = i53 % 128;
                            int i54 = i53 % 2;
                            FragmentRelationship.access$400(fragmentRelationship6, viewAccess$002, spinner, b5, b2, b6, arrayList6, i2);
                            int i55 = b + 25;
                            a = i55 % 128;
                            int i56 = i55 % 2;
                            B b7 = (B) ((Spinner) linearLayout3.getChildAt(2)).getSelectedItem();
                            int i57 = b;
                            int i58 = ((i57 ^ 92) + ((i57 & 92) << 1)) - 1;
                            a = i58 % 128;
                            if (i58 % 2 != 0) {
                                FragmentRelationship.access$000(FragmentRelationship.this);
                                Object obj5 = null;
                                obj5.hashCode();
                                throw null;
                            }
                            FragmentRelationship fragmentRelationship7 = FragmentRelationship.this;
                            View viewAccess$003 = FragmentRelationship.access$000(fragmentRelationship7);
                            Spinner spinner9 = spinner;
                            int i59 = a + 1;
                            b = i59 % 128;
                            if (i59 % 2 != 0) {
                                FragmentRelationship.access$500(fragmentRelationship7, viewAccess$003, spinner9, b5, b2, b6, arrayList6, i2, b7);
                                return;
                            } else {
                                FragmentRelationship.access$500(fragmentRelationship7, viewAccess$003, spinner9, b5, b2, b6, arrayList6, i2, b7);
                                throw null;
                            }
                        }
                        if (!(b6 instanceof ae)) {
                            ((ai) b6).a = b5;
                            int i60 = b;
                            int i61 = ((i60 | 77) << 1) - (i60 ^ 77);
                            a = i61 % 128;
                            int i62 = i61 % 2;
                            return;
                        }
                        int i63 = a;
                        int i64 = i63 & 119;
                        int i65 = (((i63 ^ 119) | i64) << 1) - ((i63 | 119) & (~i64));
                        b = i65 % 128;
                        if (i65 % 2 == 0) {
                            fragmentRelationship = FragmentRelationship.this;
                            viewAccess$000 = FragmentRelationship.access$000(fragmentRelationship);
                            spinner4 = spinner;
                            int i66 = 41 / 0;
                        } else {
                            fragmentRelationship = FragmentRelationship.this;
                            viewAccess$000 = FragmentRelationship.access$000(fragmentRelationship);
                            spinner4 = spinner;
                        }
                        FragmentRelationship.access$600(fragmentRelationship, viewAccess$000, b5, b6, spinner4, b2);
                        FragmentRelationship.access$700(FragmentRelationship.this, b5, b2, spinner);
                        int i67 = a;
                        int i68 = i67 & 1;
                        int i69 = (i68 - (~(-(-((i67 ^ 1) | i68))))) - 1;
                        b = i69 % 128;
                        int i70 = i69 % 2;
                        FragmentRelationship fragmentRelationship8 = FragmentRelationship.this;
                        View viewAccess$004 = FragmentRelationship.access$000(fragmentRelationship8);
                        Spinner spinner10 = spinner;
                        int i71 = b;
                        int i72 = i71 & 121;
                        int i73 = ((i71 ^ 121) | i72) << 1;
                        int i74 = -((i71 | 121) & (~i72));
                        int i75 = ((i73 | i74) << 1) - (i74 ^ i73);
                        a = i75 % 128;
                        if (i75 % 2 != 0) {
                            b3 = b6.c;
                            int i76 = 89 / 0;
                        } else {
                            b3 = b6.c;
                        }
                        B b8 = b3;
                        int i77 = b;
                        int i78 = i77 & 11;
                        int i79 = ((i77 ^ 11) | i78) << 1;
                        int i80 = -((i77 | 11) & (~i78));
                        int i81 = (i79 & i80) + (i80 | i79);
                        a = i81 % 128;
                        if (i81 % 2 != 0) {
                            b4 = b6;
                            FragmentRelationship.access$800(fragmentRelationship8, viewAccess$004, spinner10, b5, b2, b6, arrayList6, i2, b8);
                            i3 = 3;
                        } else {
                            b4 = b6;
                            FragmentRelationship.access$800(fragmentRelationship8, viewAccess$004, spinner10, b5, b2, b4, arrayList6, i2, b8);
                            i3 = 2;
                        }
                        B b9 = (B) ((Spinner) linearLayout3.getChildAt(i3)).getSelectedItem();
                        int i82 = b + 24;
                        int i83 = (i82 ^ (-1)) + (i82 << 1);
                        a = i83 % 128;
                        int i84 = i83 % 2;
                        FragmentRelationship fragmentRelationship9 = FragmentRelationship.this;
                        View viewAccess$005 = FragmentRelationship.access$000(fragmentRelationship9);
                        Spinner spinner11 = spinner;
                        int i85 = b + 117;
                        a = i85 % 128;
                        int i86 = i85 % 2;
                        FragmentRelationship.access$500(fragmentRelationship9, viewAccess$005, spinner11, b5, b2, b4, arrayList6, i2, b9);
                        int i87 = a;
                        int i88 = i87 | 23;
                        int i89 = i88 << 1;
                        int i90 = -((~(i87 & 23)) & i88);
                        int i91 = ((i89 | i90) << 1) - (i90 ^ i89);
                        b = i91 % 128;
                        if (i91 % 2 == 0) {
                            throw null;
                        }
                    } catch (Exception unused) {
                    }
                }
            });
            c0118b.c = true;
            spinner.setOnItemSelectedListener(c0118b);
            C0118b c0118b2 = new C0118b(new InterfaceC0029o() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentRelationship.2
                private static int a = 1;
                private static int b;

                @Override // ivas.gov.bisp.enumeration.W.InterfaceC0029o
                public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j) {
                    B b2;
                    LinearLayout linearLayout3;
                    B b3;
                    int i3 = 2 % 2;
                    int i4 = a;
                    int i5 = ((i4 ^ 119) | (i4 & 119)) << 1;
                    int i6 = -(((~i4) & 119) | (i4 & (-120)));
                    int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
                    b = i7 % 128;
                    Object obj2 = null;
                    try {
                        if (i7 % 2 != 0) {
                            spinner2.getTag();
                            try {
                                obj2.hashCode();
                                throw null;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (spinner2.getTag() != null) {
                            b2 = (B) spinner2.getTag();
                            int i8 = a;
                            int i9 = (i8 & 91) + (i8 | 91);
                            b = i9 % 128;
                            int i10 = i9 % 2;
                        } else {
                            b2 = null;
                        }
                        B b4 = (B) spinner2.getSelectedItem();
                        Spinner spinner4 = spinner2;
                        int i11 = b + 53;
                        a = i11 % 128;
                        if (i11 % 2 == 0) {
                            spinner4.setTag(b4);
                            linearLayout3 = (LinearLayout) spinner2.getParent();
                            int i12 = 3 / 0;
                        } else {
                            spinner4.setTag(b4);
                            linearLayout3 = (LinearLayout) spinner2.getParent();
                        }
                        int i13 = a + 51;
                        b = i13 % 128;
                        int i14 = i13 % 2;
                        B b5 = (B) linearLayout3.getTag();
                        b5.k = b4;
                        View childAt = linearLayout3.getChildAt(1);
                        int i15 = b;
                        int i16 = ((i15 & (-100)) | ((~i15) & 99)) + ((i15 & 99) << 1);
                        a = i16 % 128;
                        if (i16 % 2 == 0) {
                            b3 = (B) ((Spinner) childAt).getSelectedItem();
                            int i17 = 45 / 0;
                        } else {
                            b3 = (B) ((Spinner) childAt).getSelectedItem();
                        }
                        int i18 = b;
                        int i19 = (i18 & 117) + (i18 | 117);
                        int i20 = i19 % 128;
                        a = i20;
                        int i21 = i19 % 2;
                        boolean z2 = b5 instanceof F;
                        if (z2) {
                            int i22 = i20 & 105;
                            int i23 = (i22 - (~(-(-((i20 ^ 105) | i22))))) - 1;
                            b = i23 % 128;
                            int i24 = i23 % 2;
                            if (b3 instanceof ae) {
                                int i25 = i20 & 27;
                                int i26 = -(-((i20 ^ 27) | i25));
                                int i27 = ((i25 | i26) << 1) - (i25 ^ i26);
                                b = i27 % 128;
                                if (i27 % 2 != 0) {
                                    FragmentRelationship.access$900(FragmentRelationship.this, b5, b4, b2, b3);
                                    int i28 = 29 / 0;
                                } else {
                                    FragmentRelationship.access$900(FragmentRelationship.this, b5, b4, b2, b3);
                                }
                            }
                        } else if (b5 instanceof ae) {
                            int i29 = i20 & 71;
                            int i30 = (i29 - (~((i20 ^ 71) | i29))) - 1;
                            b = i30 % 128;
                            if (i30 % 2 != 0) {
                                boolean z3 = b3 instanceof F;
                                throw null;
                            }
                            if (b3 instanceof F) {
                                FragmentRelationship.access$1000(FragmentRelationship.this, b5, b4, b2, b3);
                                int i31 = b;
                                int i32 = ((i31 & 40) + (i31 | 40)) - 1;
                                a = i32 % 128;
                                int i33 = i32 % 2;
                            }
                        } else {
                            ((ai) b5).k = b4;
                            int i34 = a;
                            int i35 = (i34 & 73) + (i34 | 73);
                            b = i35 % 128;
                            int i36 = i35 % 2;
                        }
                        if (!(!(b5 instanceof ae))) {
                            int i37 = a;
                            int i38 = (i37 ^ 59) + ((i37 & 59) << 1);
                            b = i38 % 128;
                            int i39 = i38 % 2;
                            FragmentRelationship.access$1100(FragmentRelationship.this, linearLayout3, b4, b2);
                            int i40 = a + 41;
                            b = i40 % 128;
                            if (i40 % 2 != 0) {
                                int i41 = 2 / 2;
                            }
                        }
                        if (b4 instanceof F) {
                            int i42 = b;
                            int i43 = (i42 & 65) + (i42 | 65);
                            a = i43 % 128;
                            int i44 = i43 % 2;
                            if (z2) {
                                int i45 = ((i42 | 29) << 1) - (i42 ^ 29);
                                a = i45 % 128;
                                int i46 = i45 % 2;
                                FragmentRelationship fragmentRelationship = FragmentRelationship.this;
                                FragmentRelationship.access$1200(fragmentRelationship, FragmentRelationship.access$000(fragmentRelationship), b4, b2, b5);
                                int i47 = a + 63;
                                b = i47 % 128;
                                if (i47 % 2 != 0) {
                                    int i48 = 3 % 4;
                                }
                            }
                        }
                        int i49 = a;
                        int i50 = (((i49 | 60) << 1) - (i49 ^ 60)) - 1;
                        b = i50 % 128;
                        if (i50 % 2 != 0) {
                            int i51 = 36 / 0;
                        }
                    } catch (Exception unused) {
                    }
                }
            });
            c0118b2.c = true;
            spinner2.setOnItemSelectedListener(c0118b2);
            C0118b c0118b3 = new C0118b(new InterfaceC0029o() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentRelationship.3
                private static int a = 1;
                private static int b;

                @Override // ivas.gov.bisp.enumeration.W.InterfaceC0029o
                public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j) {
                    B b2;
                    View childAt;
                    int i3 = 2 % 2;
                    int i4 = b + 13;
                    a = i4 % 128;
                    Object obj2 = null;
                    try {
                        if (i4 % 2 == 0) {
                            spinner3.getTag();
                            try {
                                throw null;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (spinner3.getTag() != null) {
                            b2 = (B) spinner3.getTag();
                            int i5 = a;
                            int i6 = i5 & 121;
                            int i7 = i6 + ((i5 ^ 121) | i6);
                            b = i7 % 128;
                            int i8 = i7 % 2;
                        } else {
                            b2 = null;
                        }
                        B b3 = (B) spinner3.getSelectedItem();
                        Spinner spinner4 = spinner3;
                        int i9 = b;
                        int i10 = i9 & 65;
                        int i11 = i9 | 65;
                        int i12 = (i10 & i11) + (i11 | i10);
                        a = i12 % 128;
                        int i13 = i12 % 2;
                        spinner4.setTag(b3);
                        LinearLayout linearLayout3 = (LinearLayout) spinner3.getParent();
                        int i14 = a;
                        int i15 = (i14 & (-38)) | ((~i14) & 37);
                        int i16 = (i14 & 37) << 1;
                        int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
                        b = i17 % 128;
                        if (i17 % 2 != 0) {
                            try {
                                throw null;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        B b4 = (B) linearLayout3.getTag();
                        int i18 = b;
                        int i19 = (((i18 & (-40)) | ((~i18) & 39)) - (~(-(-((i18 & 39) << 1))))) - 1;
                        a = i19 % 128;
                        if (i19 % 2 == 0) {
                            b4.c = b3;
                            childAt = linearLayout3.getChildAt(0);
                        } else {
                            b4.c = b3;
                            childAt = linearLayout3.getChildAt(1);
                        }
                        Spinner spinner5 = (Spinner) childAt;
                        int i20 = b + 79;
                        a = i20 % 128;
                        if (i20 % 2 == 0) {
                            boolean z2 = b4 instanceof F;
                            throw null;
                        }
                        B b5 = (B) spinner5.getSelectedItem();
                        if (b4 instanceof F) {
                            if (b5 instanceof ae) {
                                int i21 = a;
                                int i22 = i21 & 69;
                                int i23 = (i21 ^ 69) | i22;
                                int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
                                b = i24 % 128;
                                if (i24 % 2 != 0) {
                                    FragmentRelationship.access$1300(FragmentRelationship.this, b4, b3, b2, b5);
                                    try {
                                        throw null;
                                    } catch (Throwable th3) {
                                        throw th3;
                                    }
                                }
                                FragmentRelationship.access$1300(FragmentRelationship.this, b4, b3, b2, b5);
                            }
                        } else if (b4 instanceof ae) {
                            int i25 = b;
                            int i26 = i25 + 74;
                            int i27 = (i26 ^ (-1)) + (i26 << 1);
                            a = i27 % 128;
                            int i28 = i27 % 2;
                            if (b5 instanceof F) {
                                int i29 = i25 + 71;
                                a = i29 % 128;
                                if (i29 % 2 == 0) {
                                    int i30 = b5.d;
                                    try {
                                        obj2.hashCode();
                                        throw null;
                                    } catch (Throwable th4) {
                                        throw th4;
                                    }
                                }
                                if (b5.d >= 0) {
                                    FragmentRelationship.access$1300(FragmentRelationship.this, b4, b3, b2, b5);
                                    int i31 = a;
                                    int i32 = i31 | 13;
                                    int i33 = i32 << 1;
                                    int i34 = -((~(i31 & 13)) & i32);
                                    int i35 = (i33 ^ i34) + ((i34 & i33) << 1);
                                    b = i35 % 128;
                                    if (i35 % 2 != 0) {
                                        int i36 = 3 / 4;
                                    }
                                }
                            }
                        } else {
                            ((ai) b4).c = b3;
                            int i37 = b + 32;
                            int i38 = (i37 ^ (-1)) + (i37 << 1);
                            a = i38 % 128;
                            int i39 = i38 % 2;
                        }
                        if (b4 instanceof F) {
                            int i40 = b;
                            int i41 = (i40 | 1) << 1;
                            int i42 = -(i40 ^ 1);
                            int i43 = (i41 & i42) + (i42 | i41);
                            a = i43 % 128;
                            if (i43 % 2 == 0) {
                                FragmentRelationship.access$1400(FragmentRelationship.this, linearLayout3, b3, b2);
                                try {
                                    obj2.hashCode();
                                    throw null;
                                } catch (Throwable th5) {
                                    throw th5;
                                }
                            }
                            FragmentRelationship.access$1400(FragmentRelationship.this, linearLayout3, b3, b2);
                            int i44 = b + 81;
                            a = i44 % 128;
                            int i45 = i44 % 2;
                        }
                        if (b3 instanceof ae) {
                            int i46 = b;
                            int i47 = (((i46 | 10) << 1) - (i46 ^ 10)) - 1;
                            int i48 = i47 % 128;
                            a = i48;
                            int i49 = i47 % 2;
                            if (b4 instanceof ae) {
                                int i50 = i48 & 115;
                                int i51 = -(-(i48 | 115));
                                int i52 = (i50 ^ i51) + ((i51 & i50) << 1);
                                b = i52 % 128;
                                if (i52 % 2 != 0) {
                                    FragmentRelationship fragmentRelationship = FragmentRelationship.this;
                                    FragmentRelationship.access$1500(fragmentRelationship, FragmentRelationship.access$000(fragmentRelationship), b3, b2, b4);
                                    try {
                                        obj2.hashCode();
                                        throw null;
                                    } catch (Throwable th6) {
                                        throw th6;
                                    }
                                }
                                FragmentRelationship fragmentRelationship2 = FragmentRelationship.this;
                                FragmentRelationship.access$1500(fragmentRelationship2, FragmentRelationship.access$000(fragmentRelationship2), b3, b2, b4);
                                int i53 = a;
                                int i54 = ((i53 ^ 111) | (i53 & 111)) << 1;
                                int i55 = -(((~i53) & 111) | (i53 & (-112)));
                                int i56 = (i54 ^ i55) + ((i55 & i54) << 1);
                                b = i56 % 128;
                                int i57 = i56 % 2;
                            }
                        }
                        int i58 = a;
                        int i59 = i58 & 43;
                        int i60 = i59 + ((i58 ^ 43) | i59);
                        b = i60 % 128;
                        if (i60 % 2 != 0) {
                            int i61 = 88 / 0;
                        }
                    } catch (Exception unused) {
                    }
                }
            });
            c0118b3.c = true;
            spinner3.setOnItemSelectedListener(c0118b3);
            View view = new View(getActivity());
            view.setLayoutParams(new LinearLayout.LayoutParams(-1, 2));
            view.setBackgroundColor(-16777216);
            int i2 = b.j;
            if (i2 == 201 || i2 == 204) {
                spinner.setVisibility(0);
            } else {
                int i3 = e + 95;
                f = i3 % 128;
                if (i3 % 2 == 0) {
                    spinner.setVisibility(124);
                } else {
                    spinner.setVisibility(8);
                }
                int i4 = f + 9;
                e = i4 % 128;
                int i5 = i4 % 2;
            }
            linearLayout.addView(linearLayout2);
            linearLayout.addView(spinner);
            linearLayout.addView(spinner2);
            if (spinner.getVisibility() == 0) {
                int i6 = e + 83;
                f = i6 % 128;
                if (i6 % 2 == 0) {
                    spinner2.setEnabled(true);
                    z = false;
                } else {
                    z = false;
                    spinner2.setEnabled(false);
                }
                spinner2.setClickable(z);
            } else {
                spinner2.setEnabled(true);
                spinner2.setClickable(true);
            }
            linearLayout.addView(spinner3);
            if (spinner.getVisibility() == 0) {
                spinner3.setEnabled(false);
                spinner3.setClickable(false);
            } else {
                spinner2.setEnabled(true);
                spinner2.setClickable(true);
            }
            linearLayout.addView(view);
            this.linearLayout.addView(linearLayout);
        } catch (Exception unused) {
            Activity activity7 = getActivity();
            Object[] objArr11 = new Object[1];
            a((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), new char[]{55490, 17243, 57838, 55441, 36659, 31117, 5029, 59562, 48912, 10669, 30677, 58250, 47261, 28484, 6619, 46077, 18660, 8041, 51683, 33737, 6337, 53056, 47593, 21360, 10297, 65453, 26906, 8960, 63562, 44931, 22826, 62215, 34920, 24567, 2332, 50044, 22606, 4057, 63841, 37715, 26715, 15992, 43143, 25260, 14783, 60967, 39075}, objArr11);
            Toast.makeText(activity7, ((String) objArr11[0]).intern(), 0).show();
        }
    }

    @Override // ivas.gov.bisp.enumeration.X.e
    public void parseJson() {
        int i = 2 % 2;
        LinearLayout linearLayout = (LinearLayout) ((ScrollView) this.parentView).getChildAt(0);
        int i2 = 0;
        while (i2 < this.mPersonList.size()) {
            Spinner spinner = (Spinner) ((LinearLayout) linearLayout.getChildAt(i2)).getChildAt(1);
            if (this.mPersonList.get(i2) instanceof F) {
                ae aeVar = (ae) spinner.getSelectedItem();
                if (aeVar.d >= 0) {
                    int i3 = f + 63;
                    e = i3 % 128;
                    int i4 = i3 % 2;
                    F f2 = (F) this.mPersonList.get(i2);
                    List<ae> list = f2.a;
                    if (list != null && list.size() > 0) {
                        String string = BuildConfig.FLAVOR;
                        for (int i5 = 0; i5 < f2.a.size(); i5++) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(f2.a.get(i5).d);
                            Object[] objArr = new Object[1];
                            a(View.resolveSize(0, 0) + 1, new char[]{54469, 28971, 47966, 54505, 43781}, objArr);
                            sb.append(((String) objArr[0]).intern());
                            sb.append(string);
                            string = sb.toString();
                        }
                        ((ActivityBeginSurvey) getActivity()).aq.get(i2).id_spouse = string.substring(0, string.length() - 1);
                    }
                } else {
                    ((ActivityBeginSurvey) getActivity()).aq.get(i2).id_spouse = String.valueOf(aeVar.d);
                }
            } else if (this.mPersonList.get(i2) instanceof ae) {
                F f3 = (F) spinner.getSelectedItem();
                if (f3.d >= 0) {
                    int i6 = e + 113;
                    f = i6 % 128;
                    int i7 = i6 % 2;
                    ae aeVar2 = (ae) this.mPersonList.get(i2);
                    if (aeVar2.a != null) {
                        ((ActivityBeginSurvey) getActivity()).aq.get(i2).id_spouse = String.valueOf(aeVar2.a.d);
                    }
                } else {
                    ((ActivityBeginSurvey) getActivity()).aq.get(i2).id_spouse = String.valueOf(f3.d);
                }
            } else if (!(!(this.mPersonList.get(i2) instanceof ai))) {
                if (!(!(spinner.getSelectedItem() instanceof F))) {
                    int i8 = f + 83;
                    e = i8 % 128;
                    int i9 = i8 % 2;
                    F f4 = (F) spinner.getSelectedItem();
                    if (f4.d >= 0) {
                        int i10 = f + 61;
                        e = i10 % 128;
                        int i11 = i10 % 2;
                        ai aiVar = (ai) this.mPersonList.get(i2);
                        if (aiVar.a != null) {
                            ((ActivityBeginSurvey) getActivity()).aq.get(i2).id_spouse = String.valueOf(aiVar.a.d);
                        }
                    } else {
                        ((ActivityBeginSurvey) getActivity()).aq.get(i2).id_spouse = String.valueOf(f4.d);
                        int i12 = e + 95;
                        f = i12 % 128;
                        if (i12 % 2 == 0) {
                            int i13 = 5 / 4;
                        }
                    }
                } else if (spinner.getSelectedItem() instanceof ae) {
                    int i14 = f + 17;
                    e = i14 % 128;
                    if (i14 % 2 != 0) {
                        int i15 = ((ae) spinner.getSelectedItem()).d;
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    ae aeVar3 = (ae) spinner.getSelectedItem();
                    if (aeVar3.d >= 0) {
                        ai aiVar2 = (ai) this.mPersonList.get(i2);
                        if (aiVar2.a != null) {
                            ((ActivityBeginSurvey) getActivity()).aq.get(i2).id_spouse = String.valueOf(aiVar2.a.d);
                        }
                    } else {
                        ((ActivityBeginSurvey) getActivity()).aq.get(i2).id_spouse = String.valueOf(aeVar3.d);
                    }
                } else {
                    ai aiVar3 = (ai) spinner.getSelectedItem();
                    if (aiVar3.d >= 0) {
                        ai aiVar4 = (ai) this.mPersonList.get(i2);
                        if (aiVar4.a != null) {
                            int i16 = e + 15;
                            f = i16 % 128;
                            int i17 = i16 % 2;
                            ((ActivityBeginSurvey) getActivity()).aq.get(i2).id_spouse = String.valueOf(aiVar4.a.d);
                        }
                    } else {
                        ((ActivityBeginSurvey) getActivity()).aq.get(i2).id_spouse = String.valueOf(aiVar3.d);
                    }
                }
            }
            if (this.mPersonList.get(i2).k != null) {
                ((ActivityBeginSurvey) getActivity()).aq.get(i2).id_father = this.mPersonList.get(i2).k.d;
            }
            if (this.mPersonList.get(i2).c != null) {
                ((ActivityBeginSurvey) getActivity()).aq.get(i2).id_mother = this.mPersonList.get(i2).c.d;
            }
            i2++;
            int i18 = f + 83;
            e = i18 % 128;
            int i19 = i18 % 2;
        }
    }

    private static void a(int i, char[] cArr, Object[] objArr) {
        int i2 = 2 % 2;
        g gVar = new g();
        char[] cArrB = g.b(d$s40$5816 ^ (-3439381718914712265L), cArr, i);
        gVar.a = 4;
        while (gVar.a < cArrB.length) {
            int i3 = $10 + 125;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            gVar.c = gVar.a - 4;
            cArrB[gVar.a] = (char) (((long) (cArrB[gVar.a] ^ cArrB[gVar.a % 4])) ^ (((long) gVar.c) * (d$s40$5816 ^ (-3439381718914712265L))));
            gVar.a++;
        }
        String str = new String(cArrB, 4, cArrB.length - 4);
        int i5 = $11 + 91;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        objArr[0] = str;
    }

    private static void b(int i, char[] cArr, char c, char[] cArr2, char[] cArr3, Object[] objArr) {
        int i2 = 2 % 2;
        o.j jVar = new o.j();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        jVar.a = 0;
        while (jVar.a < length3) {
            int i3 = $11 + 45;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = (jVar.a + 2) % 4;
            int i6 = (jVar.a + 3) % 4;
            jVar.e = (char) (((cArr4[jVar.a % 4] * 32718) + cArr5[i5]) % 65535);
            cArr5[i6] = (char) (((cArr4[i6] * 32718) + cArr5[i5]) / 65535);
            cArr4[i6] = jVar.e;
            cArr6[jVar.a] = (char) (((((long) (cArr4[i6] ^ cArr3[jVar.a])) ^ (d$s45$5919 ^ (-1116422076781920906L))) ^ ((long) ((int) (((long) b$s46$5919) ^ (-1116422076781920906L))))) ^ ((long) ((char) (((long) a$s47$5919) ^ (-1116422076781920906L)))));
            jVar.a++;
        }
        String str = new String(cArr6);
        int i7 = $11 + 25;
        $10 = i7 % 128;
        int i8 = i7 % 2;
        objArr[0] = str;
    }
}
