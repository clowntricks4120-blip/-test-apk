package ivas.gov.bisp.enumeration.fragments;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
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

/* JADX INFO: loaded from: classes.dex */
public class FragmentOfflineRelationship extends Fragment implements e {
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
    private static int c = 1;
    private static int d;
    private LinearLayout linearLayout;
    private ArrayList<B> mPersonList = new ArrayList<>();
    private View parentView;

    public static /* synthetic */ View access$000(FragmentOfflineRelationship fragmentOfflineRelationship) {
        int i = 2 % 2;
        int i2 = c;
        int i3 = (((i2 & (-40)) | ((~i2) & 39)) - (~(-(-((i2 & 39) << 1))))) - 1;
        int i4 = i3 % 128;
        d = i4;
        int i5 = i3 % 2;
        View view = fragmentOfflineRelationship.parentView;
        if (i5 != 0) {
            int i6 = 1 / 0;
        }
        int i7 = ((i4 | 111) << 1) - (i4 ^ 111);
        c = i7 % 128;
        int i8 = i7 % 2;
        return view;
    }

    public static /* synthetic */ boolean access$100(FragmentOfflineRelationship fragmentOfflineRelationship, View view, B b, B b2) {
        int i = 2 % 2;
        int i2 = d;
        int i3 = (i2 ^ 77) + ((i2 & 77) << 1);
        c = i3 % 128;
        int i4 = i3 % 2;
        boolean zCheckIfToEnableFemaleFromAllOtherMaleList = fragmentOfflineRelationship.checkIfToEnableFemaleFromAllOtherMaleList(view, b, b2);
        int i5 = d + 35;
        c = i5 % 128;
        int i6 = i5 % 2;
        return zCheckIfToEnableFemaleFromAllOtherMaleList;
    }

    public static /* synthetic */ void access$1000(FragmentOfflineRelationship fragmentOfflineRelationship, B b, B b2, B b3, B b4) {
        int i = 2 % 2;
        int i2 = c;
        int i3 = (i2 ^ 103) + ((i2 & 103) << 1);
        d = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        fragmentOfflineRelationship.disableFemaleFromHusbandMotherList(b, b2, b3, b4);
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = c + 67;
        d = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void access$1100(FragmentOfflineRelationship fragmentOfflineRelationship, LinearLayout linearLayout, B b, B b2) {
        int i = 2 % 2;
        int i2 = d;
        int i3 = ((i2 | 31) << 1) - (i2 ^ 31);
        c = i3 % 128;
        if (i3 % 2 == 0) {
            fragmentOfflineRelationship.disableFatherFromSpouseList(linearLayout, b, b2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        fragmentOfflineRelationship.disableFatherFromSpouseList(linearLayout, b, b2);
        int i4 = c;
        int i5 = (i4 ^ 105) + ((i4 & 105) << 1);
        d = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ void access$1200(FragmentOfflineRelationship fragmentOfflineRelationship, View view, B b, B b2, B b3) {
        int i = 2 % 2;
        int i2 = c;
        int i3 = ((((i2 ^ 25) | (i2 & 25)) << 1) - (~(-(((~i2) & 25) | (i2 & (-26)))))) - 1;
        d = i3 % 128;
        int i4 = i3 % 2;
        fragmentOfflineRelationship.disableFatherFromSon(view, b, b2, b3);
        int i5 = d;
        int i6 = (((i5 | 2) << 1) - (i5 ^ 2)) - 1;
        c = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void access$1300(FragmentOfflineRelationship fragmentOfflineRelationship, B b, B b2, B b3, B b4) {
        int i = 2 % 2;
        int i2 = d;
        int i3 = (i2 ^ 89) + ((i2 & 89) << 1);
        c = i3 % 128;
        int i4 = i3 % 2;
        fragmentOfflineRelationship.disableSpouseMotherListFemale(b, b2, b3, b4);
        if (i4 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void access$1400(FragmentOfflineRelationship fragmentOfflineRelationship, LinearLayout linearLayout, B b, B b2) {
        int i = 2 % 2;
        int i2 = c;
        int i3 = ((i2 & (-48)) | ((~i2) & 47)) + ((i2 & 47) << 1);
        d = i3 % 128;
        int i4 = i3 % 2;
        fragmentOfflineRelationship.disableMotherFromSpouseList(linearLayout, b, b2);
        int i5 = d;
        int i6 = i5 & 123;
        int i7 = -(-(i5 | 123));
        int i8 = (i6 & i7) + (i7 | i6);
        c = i8 % 128;
        if (i8 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void access$1500(FragmentOfflineRelationship fragmentOfflineRelationship, View view, B b, B b2, B b3) {
        int i = 2 % 2;
        int i2 = c;
        int i3 = i2 & 33;
        int i4 = (i3 - (~((i2 ^ 33) | i3))) - 1;
        d = i4 % 128;
        int i5 = i4 % 2;
        fragmentOfflineRelationship.disableMotherFromDaughter(view, b, b2, b3);
        if (i5 != 0) {
            throw null;
        }
        int i6 = c;
        int i7 = i6 & 51;
        int i8 = (i7 - (~(-(-((i6 ^ 51) | i7))))) - 1;
        d = i8 % 128;
        int i9 = i8 % 2;
    }

    public static /* synthetic */ void access$200(FragmentOfflineRelationship fragmentOfflineRelationship, View view, Spinner spinner, B b, B b2, B b3, List list, int i, boolean z) {
        int i2 = 2 % 2;
        int i3 = c;
        int i4 = ((i3 & 32) + (i3 | 32)) - 1;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        fragmentOfflineRelationship.updateFemaleSpouseOfOtherMalesListWhenWifeSelected(view, spinner, b, b2, b3, list, i, z);
        int i5 = d;
        int i6 = (i5 & (-94)) | ((~i5) & 93);
        int i7 = (i5 & 93) << 1;
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        c = i8 % 128;
        int i9 = i8 % 2;
    }

    public static /* synthetic */ void access$300(FragmentOfflineRelationship fragmentOfflineRelationship, B b, B b2, Spinner spinner) {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 ^ 49;
        int i4 = (((i2 & 49) | i3) << 1) - i3;
        c = i4 % 128;
        int i5 = i4 % 2;
        fragmentOfflineRelationship.disableSpouseFromMotherList(b, b2, spinner);
        if (i5 == 0) {
            int i6 = 37 / 0;
        }
        int i7 = d + 11;
        c = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void access$400(FragmentOfflineRelationship fragmentOfflineRelationship, View view, Spinner spinner, B b, B b2, B b3, List list, int i) {
        int i2 = 2 % 2;
        int i3 = c;
        int i4 = i3 & 29;
        int i5 = i3 | 29;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        d = i6 % 128;
        int i7 = i6 % 2;
        int i8 = i3 + 49;
        d = i8 % 128;
        int i9 = i8 % 2;
        fragmentOfflineRelationship.disableSpouseFromFathersWifeList(view, spinner, b, b2, b3, list, i);
        int i10 = c;
        int i11 = i10 & 1;
        int i12 = -(-((i10 ^ 1) | i11));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        d = i13 % 128;
        int i14 = i13 % 2;
    }

    public static /* synthetic */ void access$500(FragmentOfflineRelationship fragmentOfflineRelationship, View view, Spinner spinner, B b, B b2, B b3, List list, int i, B b4) {
        int i2 = 2 % 2;
        int i3 = d;
        int i4 = (i3 & 63) + (i3 | 63);
        c = i4 % 128;
        if (i4 % 2 == 0) {
            fragmentOfflineRelationship.enableMaleFromFatherListOnSpouseChanged(view, spinner, b, b2, b3, list, i, b4);
            throw null;
        }
        fragmentOfflineRelationship.enableMaleFromFatherListOnSpouseChanged(view, spinner, b, b2, b3, list, i, b4);
        int i5 = c + 119;
        d = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ void access$600(FragmentOfflineRelationship fragmentOfflineRelationship, View view, B b, B b2, Spinner spinner, B b3) {
        int i = 2 % 2;
        int i2 = c;
        int i3 = ((((i2 ^ 55) | (i2 & 55)) << 1) - (~(-(((~i2) & 55) | (i2 & (-56)))))) - 1;
        d = i3 % 128;
        int i4 = i3 % 2;
        fragmentOfflineRelationship.updateMaleListOnWifeSelected(view, b, b2, spinner, b3);
        int i5 = c;
        int i6 = i5 & 105;
        int i7 = i5 | 105;
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        d = i8 % 128;
        int i9 = i8 % 2;
    }

    public static /* synthetic */ void access$700(FragmentOfflineRelationship fragmentOfflineRelationship, B b, B b2, Spinner spinner) {
        int i = 2 % 2;
        int i2 = c;
        int i3 = i2 & 25;
        int i4 = ((i2 ^ 25) | i3) << 1;
        int i5 = -((i2 | 25) & (~i3));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        d = i6 % 128;
        int i7 = i6 % 2;
        fragmentOfflineRelationship.updateSelectedSpouseFatherList(b, b2, spinner);
        int i8 = c;
        int i9 = ((i8 & (-124)) | ((~i8) & 123)) + ((i8 & 123) << 1);
        d = i9 % 128;
        int i10 = i9 % 2;
    }

    public static /* synthetic */ void access$800(FragmentOfflineRelationship fragmentOfflineRelationship, View view, Spinner spinner, B b, B b2, B b3, List list, int i, B b4) {
        int i2 = 2 % 2;
        int i3 = c;
        int i4 = i3 & 41;
        int i5 = i4 + ((i3 ^ 41) | i4);
        d = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
        fragmentOfflineRelationship.disableSpouseFromHusbandsMotherList(view, spinner, b, b2, b3, list, i, b4);
        int i6 = d + 11;
        c = i6 % 128;
        int i7 = i6 % 2;
    }

    public static /* synthetic */ void access$900(FragmentOfflineRelationship fragmentOfflineRelationship, B b, B b2, B b3, B b4) {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 & 51;
        int i4 = (i2 ^ 51) | i3;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        c = i5 % 128;
        int i6 = i5 % 2;
        fragmentOfflineRelationship.disableMaleFromWifeFatherList(b, b2, b3, b4);
        int i7 = d;
        int i8 = (i7 ^ 87) + ((i7 & 87) << 1);
        c = i8 % 128;
        int i9 = i8 % 2;
    }

    private void disableFatherFromSon(View view, B b, B b2, B b3) {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 & 83;
        int i4 = (i2 ^ 83) | i3;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        c = i5 % 128;
        LinearLayout linearLayout = (LinearLayout) (i5 % 2 == 0 ? ((ScrollView) view).getChildAt(1) : ((ScrollView) view).getChildAt(0));
        int i6 = d;
        int i7 = i6 & 57;
        int i8 = (i6 ^ 57) | i7;
        int i9 = (i7 & i8) + (i8 | i7);
        c = i9 % 128;
        int i10 = i9 % 2;
        int i11 = 0;
        while (i11 < linearLayout.getChildCount()) {
            int i12 = c;
            int i13 = i12 & 15;
            int i14 = -(-(i12 | 15));
            int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
            d = i15 % 128;
            int i16 = i15 % 2;
            LinearLayout linearLayout2 = (LinearLayout) linearLayout.getChildAt(i11);
            Object tag = linearLayout2.getTag();
            int i17 = d;
            int i18 = ((i17 | 123) << 1) - (i17 ^ 123);
            c = i18 % 128;
            int i19 = i18 % 2;
            B b4 = (B) tag;
            Spinner spinner = (Spinner) linearLayout2.getChildAt(2);
            int i20 = d;
            int i21 = i20 ^ 33;
            int i22 = ((((i20 & 33) | i21) << 1) - (~(-i21))) - 1;
            c = i22 % 128;
            Object obj = null;
            if (i22 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            ArrayList<B> arrayList = ((af) spinner.getAdapter()).d;
            int i23 = d;
            int i24 = ((i23 ^ 105) | (i23 & 105)) << 1;
            int i25 = -(((~i23) & 105) | (i23 & (-106)));
            int i26 = (i24 & i25) + (i25 | i24);
            c = i26 % 128;
            int i27 = i26 % 2;
            int i28 = b4.d;
            int i29 = b.d;
            if (i28 == i29) {
                int i30 = d;
                int i31 = ((i30 & 115) - (~(i30 | 115))) - 1;
                int i32 = i31 % 128;
                c = i32;
                int i33 = i31 % 2;
                if (i29 != -1) {
                    int i34 = i32 ^ 93;
                    int i35 = ((i32 & 93) | i34) << 1;
                    int i36 = -i34;
                    int i37 = (i35 ^ i36) + ((i35 & i36) << 1);
                    d = i37 % 128;
                    if (i37 % 2 != 0) {
                        throw null;
                    }
                    af afVar = (af) spinner.getAdapter();
                    int i38 = c;
                    int i39 = i38 ^ 117;
                    int i40 = ((i38 & 117) | i39) << 1;
                    int i41 = -i39;
                    int i42 = (i40 & i41) + (i40 | i41);
                    d = i42 % 128;
                    int i43 = i42 % 2;
                    afVar.d(arrayList.indexOf(b3), false);
                    int i44 = c;
                    int i45 = i44 & 123;
                    int i46 = -(-(i44 | 123));
                    int i47 = (i45 & i46) + (i46 | i45);
                    d = i47 % 128;
                    int i48 = i47 % 2;
                }
            }
            if (b2 != null) {
                int i49 = c;
                int i50 = ((i49 | 81) << 1) - (((~i49) & 81) | (i49 & (-82)));
                d = i50 % 128;
                if (i50 % 2 != 0) {
                    int i51 = b4.d;
                    int i52 = b2.d;
                    obj.hashCode();
                    throw null;
                }
                if (b4.d == b2.d) {
                    int i53 = d + 51;
                    c = i53 % 128;
                    int i54 = i53 % 2;
                    af afVar2 = (af) spinner.getAdapter();
                    int i55 = d;
                    int i56 = i55 & 47;
                    int i57 = ((i55 ^ 47) | i56) << 1;
                    int i58 = -((i55 | 47) & (~i56));
                    int i59 = ((i57 | i58) << 1) - (i58 ^ i57);
                    c = i59 % 128;
                    int i60 = i59 % 2;
                    afVar2.d(arrayList.indexOf(b3), true);
                    int i61 = c;
                    int i62 = i61 & 7;
                    int i63 = ((i61 | 7) & (~i62)) + (i62 << 1);
                    d = i63 % 128;
                    if (i63 % 2 != 0) {
                        int i64 = 5 / 5;
                    }
                }
            }
            i11 = ((i11 | 1) << 1) - (i11 ^ 1);
            int i65 = d + 109;
            c = i65 % 128;
            int i66 = i65 % 2;
        }
        int i67 = d;
        int i68 = i67 | 123;
        int i69 = (i68 << 1) - ((~(i67 & 123)) & i68);
        c = i69 % 128;
        int i70 = i69 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:118:0x02a2 A[PHI: r0
  0x02a2: PHI (r0v105 int) = (r0v104 int), (r0v132 int) binds: [B:117:0x02a0, B:114:0x029b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:121:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:123:0x02cd A[Catch: Exception -> 0x05c2, TRY_ENTER, TryCatch #12 {Exception -> 0x05c2, blocks: (B:3:0x0010, B:6:0x002f, B:9:0x0045, B:11:0x006c, B:15:0x0081, B:17:0x008b, B:25:0x00a3, B:27:0x00a7, B:29:0x00b9, B:31:0x00d4, B:32:0x00d6, B:22:0x0090, B:36:0x00da, B:41:0x00f1, B:43:0x00fb, B:47:0x0116, B:49:0x011a, B:51:0x013c, B:53:0x014c, B:55:0x015d, B:56:0x015f, B:60:0x0163, B:61:0x016b, B:62:0x016e, B:65:0x0171, B:68:0x0186, B:71:0x019f, B:75:0x01b9, B:76:0x01be, B:78:0x01cc, B:77:0x01c6, B:79:0x01cf, B:82:0x01ec, B:84:0x01f0, B:86:0x0205, B:90:0x021c, B:92:0x0222, B:96:0x023f, B:97:0x0247, B:98:0x024b, B:99:0x0255, B:101:0x0265, B:102:0x0269, B:112:0x0295, B:119:0x02b5, B:123:0x02cd, B:125:0x02d4, B:128:0x02ee, B:131:0x02fd, B:133:0x0305, B:139:0x030f, B:142:0x0329, B:145:0x033d, B:147:0x0352, B:150:0x0368, B:152:0x0381, B:151:0x0375, B:154:0x039d, B:156:0x03a3, B:157:0x03a6, B:138:0x030a, B:199:0x046e, B:203:0x0484, B:207:0x0497, B:209:0x04a2, B:215:0x04af, B:219:0x04c5, B:221:0x04d4, B:214:0x04a7, B:225:0x04f7, B:227:0x04fa, B:231:0x04fe, B:235:0x0518, B:239:0x0533, B:242:0x0542, B:244:0x0559, B:256:0x059b, B:249:0x0570, B:253:0x0586, B:254:0x058a, B:160:0x03a9, B:116:0x029e, B:163:0x03b3, B:166:0x03c4, B:170:0x03d9, B:173:0x03ed, B:175:0x03f7, B:193:0x042f, B:195:0x044d, B:186:0x041b, B:187:0x0422, B:189:0x0429, B:190:0x042c, B:182:0x03ff, B:262:0x05b6, B:264:0x05bc, B:265:0x05bf), top: B:294:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:131:0x02fd A[Catch: Exception -> 0x05c2, TRY_ENTER, TRY_LEAVE, TryCatch #12 {Exception -> 0x05c2, blocks: (B:3:0x0010, B:6:0x002f, B:9:0x0045, B:11:0x006c, B:15:0x0081, B:17:0x008b, B:25:0x00a3, B:27:0x00a7, B:29:0x00b9, B:31:0x00d4, B:32:0x00d6, B:22:0x0090, B:36:0x00da, B:41:0x00f1, B:43:0x00fb, B:47:0x0116, B:49:0x011a, B:51:0x013c, B:53:0x014c, B:55:0x015d, B:56:0x015f, B:60:0x0163, B:61:0x016b, B:62:0x016e, B:65:0x0171, B:68:0x0186, B:71:0x019f, B:75:0x01b9, B:76:0x01be, B:78:0x01cc, B:77:0x01c6, B:79:0x01cf, B:82:0x01ec, B:84:0x01f0, B:86:0x0205, B:90:0x021c, B:92:0x0222, B:96:0x023f, B:97:0x0247, B:98:0x024b, B:99:0x0255, B:101:0x0265, B:102:0x0269, B:112:0x0295, B:119:0x02b5, B:123:0x02cd, B:125:0x02d4, B:128:0x02ee, B:131:0x02fd, B:133:0x0305, B:139:0x030f, B:142:0x0329, B:145:0x033d, B:147:0x0352, B:150:0x0368, B:152:0x0381, B:151:0x0375, B:154:0x039d, B:156:0x03a3, B:157:0x03a6, B:138:0x030a, B:199:0x046e, B:203:0x0484, B:207:0x0497, B:209:0x04a2, B:215:0x04af, B:219:0x04c5, B:221:0x04d4, B:214:0x04a7, B:225:0x04f7, B:227:0x04fa, B:231:0x04fe, B:235:0x0518, B:239:0x0533, B:242:0x0542, B:244:0x0559, B:256:0x059b, B:249:0x0570, B:253:0x0586, B:254:0x058a, B:160:0x03a9, B:116:0x029e, B:163:0x03b3, B:166:0x03c4, B:170:0x03d9, B:173:0x03ed, B:175:0x03f7, B:193:0x042f, B:195:0x044d, B:186:0x041b, B:187:0x0422, B:189:0x0429, B:190:0x042c, B:182:0x03ff, B:262:0x05b6, B:264:0x05bc, B:265:0x05bf), top: B:294:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:138:0x030a A[Catch: Exception -> 0x05c2, TRY_ENTER, TryCatch #12 {Exception -> 0x05c2, blocks: (B:3:0x0010, B:6:0x002f, B:9:0x0045, B:11:0x006c, B:15:0x0081, B:17:0x008b, B:25:0x00a3, B:27:0x00a7, B:29:0x00b9, B:31:0x00d4, B:32:0x00d6, B:22:0x0090, B:36:0x00da, B:41:0x00f1, B:43:0x00fb, B:47:0x0116, B:49:0x011a, B:51:0x013c, B:53:0x014c, B:55:0x015d, B:56:0x015f, B:60:0x0163, B:61:0x016b, B:62:0x016e, B:65:0x0171, B:68:0x0186, B:71:0x019f, B:75:0x01b9, B:76:0x01be, B:78:0x01cc, B:77:0x01c6, B:79:0x01cf, B:82:0x01ec, B:84:0x01f0, B:86:0x0205, B:90:0x021c, B:92:0x0222, B:96:0x023f, B:97:0x0247, B:98:0x024b, B:99:0x0255, B:101:0x0265, B:102:0x0269, B:112:0x0295, B:119:0x02b5, B:123:0x02cd, B:125:0x02d4, B:128:0x02ee, B:131:0x02fd, B:133:0x0305, B:139:0x030f, B:142:0x0329, B:145:0x033d, B:147:0x0352, B:150:0x0368, B:152:0x0381, B:151:0x0375, B:154:0x039d, B:156:0x03a3, B:157:0x03a6, B:138:0x030a, B:199:0x046e, B:203:0x0484, B:207:0x0497, B:209:0x04a2, B:215:0x04af, B:219:0x04c5, B:221:0x04d4, B:214:0x04a7, B:225:0x04f7, B:227:0x04fa, B:231:0x04fe, B:235:0x0518, B:239:0x0533, B:242:0x0542, B:244:0x0559, B:256:0x059b, B:249:0x0570, B:253:0x0586, B:254:0x058a, B:160:0x03a9, B:116:0x029e, B:163:0x03b3, B:166:0x03c4, B:170:0x03d9, B:173:0x03ed, B:175:0x03f7, B:193:0x042f, B:195:0x044d, B:186:0x041b, B:187:0x0422, B:189:0x0429, B:190:0x042c, B:182:0x03ff, B:262:0x05b6, B:264:0x05bc, B:265:0x05bf), top: B:294:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:142:0x0329 A[Catch: Exception -> 0x05c2, TRY_ENTER, TRY_LEAVE, TryCatch #12 {Exception -> 0x05c2, blocks: (B:3:0x0010, B:6:0x002f, B:9:0x0045, B:11:0x006c, B:15:0x0081, B:17:0x008b, B:25:0x00a3, B:27:0x00a7, B:29:0x00b9, B:31:0x00d4, B:32:0x00d6, B:22:0x0090, B:36:0x00da, B:41:0x00f1, B:43:0x00fb, B:47:0x0116, B:49:0x011a, B:51:0x013c, B:53:0x014c, B:55:0x015d, B:56:0x015f, B:60:0x0163, B:61:0x016b, B:62:0x016e, B:65:0x0171, B:68:0x0186, B:71:0x019f, B:75:0x01b9, B:76:0x01be, B:78:0x01cc, B:77:0x01c6, B:79:0x01cf, B:82:0x01ec, B:84:0x01f0, B:86:0x0205, B:90:0x021c, B:92:0x0222, B:96:0x023f, B:97:0x0247, B:98:0x024b, B:99:0x0255, B:101:0x0265, B:102:0x0269, B:112:0x0295, B:119:0x02b5, B:123:0x02cd, B:125:0x02d4, B:128:0x02ee, B:131:0x02fd, B:133:0x0305, B:139:0x030f, B:142:0x0329, B:145:0x033d, B:147:0x0352, B:150:0x0368, B:152:0x0381, B:151:0x0375, B:154:0x039d, B:156:0x03a3, B:157:0x03a6, B:138:0x030a, B:199:0x046e, B:203:0x0484, B:207:0x0497, B:209:0x04a2, B:215:0x04af, B:219:0x04c5, B:221:0x04d4, B:214:0x04a7, B:225:0x04f7, B:227:0x04fa, B:231:0x04fe, B:235:0x0518, B:239:0x0533, B:242:0x0542, B:244:0x0559, B:256:0x059b, B:249:0x0570, B:253:0x0586, B:254:0x058a, B:160:0x03a9, B:116:0x029e, B:163:0x03b3, B:166:0x03c4, B:170:0x03d9, B:173:0x03ed, B:175:0x03f7, B:193:0x042f, B:195:0x044d, B:186:0x041b, B:187:0x0422, B:189:0x0429, B:190:0x042c, B:182:0x03ff, B:262:0x05b6, B:264:0x05bc, B:265:0x05bf), top: B:294:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:145:0x033d A[Catch: Exception -> 0x05c2, TRY_ENTER, TRY_LEAVE, TryCatch #12 {Exception -> 0x05c2, blocks: (B:3:0x0010, B:6:0x002f, B:9:0x0045, B:11:0x006c, B:15:0x0081, B:17:0x008b, B:25:0x00a3, B:27:0x00a7, B:29:0x00b9, B:31:0x00d4, B:32:0x00d6, B:22:0x0090, B:36:0x00da, B:41:0x00f1, B:43:0x00fb, B:47:0x0116, B:49:0x011a, B:51:0x013c, B:53:0x014c, B:55:0x015d, B:56:0x015f, B:60:0x0163, B:61:0x016b, B:62:0x016e, B:65:0x0171, B:68:0x0186, B:71:0x019f, B:75:0x01b9, B:76:0x01be, B:78:0x01cc, B:77:0x01c6, B:79:0x01cf, B:82:0x01ec, B:84:0x01f0, B:86:0x0205, B:90:0x021c, B:92:0x0222, B:96:0x023f, B:97:0x0247, B:98:0x024b, B:99:0x0255, B:101:0x0265, B:102:0x0269, B:112:0x0295, B:119:0x02b5, B:123:0x02cd, B:125:0x02d4, B:128:0x02ee, B:131:0x02fd, B:133:0x0305, B:139:0x030f, B:142:0x0329, B:145:0x033d, B:147:0x0352, B:150:0x0368, B:152:0x0381, B:151:0x0375, B:154:0x039d, B:156:0x03a3, B:157:0x03a6, B:138:0x030a, B:199:0x046e, B:203:0x0484, B:207:0x0497, B:209:0x04a2, B:215:0x04af, B:219:0x04c5, B:221:0x04d4, B:214:0x04a7, B:225:0x04f7, B:227:0x04fa, B:231:0x04fe, B:235:0x0518, B:239:0x0533, B:242:0x0542, B:244:0x0559, B:256:0x059b, B:249:0x0570, B:253:0x0586, B:254:0x058a, B:160:0x03a9, B:116:0x029e, B:163:0x03b3, B:166:0x03c4, B:170:0x03d9, B:173:0x03ed, B:175:0x03f7, B:193:0x042f, B:195:0x044d, B:186:0x041b, B:187:0x0422, B:189:0x0429, B:190:0x042c, B:182:0x03ff, B:262:0x05b6, B:264:0x05bc, B:265:0x05bf), top: B:294:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:150:0x0368 A[Catch: Exception -> 0x05c2, TRY_ENTER, TryCatch #12 {Exception -> 0x05c2, blocks: (B:3:0x0010, B:6:0x002f, B:9:0x0045, B:11:0x006c, B:15:0x0081, B:17:0x008b, B:25:0x00a3, B:27:0x00a7, B:29:0x00b9, B:31:0x00d4, B:32:0x00d6, B:22:0x0090, B:36:0x00da, B:41:0x00f1, B:43:0x00fb, B:47:0x0116, B:49:0x011a, B:51:0x013c, B:53:0x014c, B:55:0x015d, B:56:0x015f, B:60:0x0163, B:61:0x016b, B:62:0x016e, B:65:0x0171, B:68:0x0186, B:71:0x019f, B:75:0x01b9, B:76:0x01be, B:78:0x01cc, B:77:0x01c6, B:79:0x01cf, B:82:0x01ec, B:84:0x01f0, B:86:0x0205, B:90:0x021c, B:92:0x0222, B:96:0x023f, B:97:0x0247, B:98:0x024b, B:99:0x0255, B:101:0x0265, B:102:0x0269, B:112:0x0295, B:119:0x02b5, B:123:0x02cd, B:125:0x02d4, B:128:0x02ee, B:131:0x02fd, B:133:0x0305, B:139:0x030f, B:142:0x0329, B:145:0x033d, B:147:0x0352, B:150:0x0368, B:152:0x0381, B:151:0x0375, B:154:0x039d, B:156:0x03a3, B:157:0x03a6, B:138:0x030a, B:199:0x046e, B:203:0x0484, B:207:0x0497, B:209:0x04a2, B:215:0x04af, B:219:0x04c5, B:221:0x04d4, B:214:0x04a7, B:225:0x04f7, B:227:0x04fa, B:231:0x04fe, B:235:0x0518, B:239:0x0533, B:242:0x0542, B:244:0x0559, B:256:0x059b, B:249:0x0570, B:253:0x0586, B:254:0x058a, B:160:0x03a9, B:116:0x029e, B:163:0x03b3, B:166:0x03c4, B:170:0x03d9, B:173:0x03ed, B:175:0x03f7, B:193:0x042f, B:195:0x044d, B:186:0x041b, B:187:0x0422, B:189:0x0429, B:190:0x042c, B:182:0x03ff, B:262:0x05b6, B:264:0x05bc, B:265:0x05bf), top: B:294:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:151:0x0375 A[Catch: Exception -> 0x05c2, TryCatch #12 {Exception -> 0x05c2, blocks: (B:3:0x0010, B:6:0x002f, B:9:0x0045, B:11:0x006c, B:15:0x0081, B:17:0x008b, B:25:0x00a3, B:27:0x00a7, B:29:0x00b9, B:31:0x00d4, B:32:0x00d6, B:22:0x0090, B:36:0x00da, B:41:0x00f1, B:43:0x00fb, B:47:0x0116, B:49:0x011a, B:51:0x013c, B:53:0x014c, B:55:0x015d, B:56:0x015f, B:60:0x0163, B:61:0x016b, B:62:0x016e, B:65:0x0171, B:68:0x0186, B:71:0x019f, B:75:0x01b9, B:76:0x01be, B:78:0x01cc, B:77:0x01c6, B:79:0x01cf, B:82:0x01ec, B:84:0x01f0, B:86:0x0205, B:90:0x021c, B:92:0x0222, B:96:0x023f, B:97:0x0247, B:98:0x024b, B:99:0x0255, B:101:0x0265, B:102:0x0269, B:112:0x0295, B:119:0x02b5, B:123:0x02cd, B:125:0x02d4, B:128:0x02ee, B:131:0x02fd, B:133:0x0305, B:139:0x030f, B:142:0x0329, B:145:0x033d, B:147:0x0352, B:150:0x0368, B:152:0x0381, B:151:0x0375, B:154:0x039d, B:156:0x03a3, B:157:0x03a6, B:138:0x030a, B:199:0x046e, B:203:0x0484, B:207:0x0497, B:209:0x04a2, B:215:0x04af, B:219:0x04c5, B:221:0x04d4, B:214:0x04a7, B:225:0x04f7, B:227:0x04fa, B:231:0x04fe, B:235:0x0518, B:239:0x0533, B:242:0x0542, B:244:0x0559, B:256:0x059b, B:249:0x0570, B:253:0x0586, B:254:0x058a, B:160:0x03a9, B:116:0x029e, B:163:0x03b3, B:166:0x03c4, B:170:0x03d9, B:173:0x03ed, B:175:0x03f7, B:193:0x042f, B:195:0x044d, B:186:0x041b, B:187:0x0422, B:189:0x0429, B:190:0x042c, B:182:0x03ff, B:262:0x05b6, B:264:0x05bc, B:265:0x05bf), top: B:294:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:154:0x039d A[Catch: Exception -> 0x05c2, TRY_ENTER, TRY_LEAVE, TryCatch #12 {Exception -> 0x05c2, blocks: (B:3:0x0010, B:6:0x002f, B:9:0x0045, B:11:0x006c, B:15:0x0081, B:17:0x008b, B:25:0x00a3, B:27:0x00a7, B:29:0x00b9, B:31:0x00d4, B:32:0x00d6, B:22:0x0090, B:36:0x00da, B:41:0x00f1, B:43:0x00fb, B:47:0x0116, B:49:0x011a, B:51:0x013c, B:53:0x014c, B:55:0x015d, B:56:0x015f, B:60:0x0163, B:61:0x016b, B:62:0x016e, B:65:0x0171, B:68:0x0186, B:71:0x019f, B:75:0x01b9, B:76:0x01be, B:78:0x01cc, B:77:0x01c6, B:79:0x01cf, B:82:0x01ec, B:84:0x01f0, B:86:0x0205, B:90:0x021c, B:92:0x0222, B:96:0x023f, B:97:0x0247, B:98:0x024b, B:99:0x0255, B:101:0x0265, B:102:0x0269, B:112:0x0295, B:119:0x02b5, B:123:0x02cd, B:125:0x02d4, B:128:0x02ee, B:131:0x02fd, B:133:0x0305, B:139:0x030f, B:142:0x0329, B:145:0x033d, B:147:0x0352, B:150:0x0368, B:152:0x0381, B:151:0x0375, B:154:0x039d, B:156:0x03a3, B:157:0x03a6, B:138:0x030a, B:199:0x046e, B:203:0x0484, B:207:0x0497, B:209:0x04a2, B:215:0x04af, B:219:0x04c5, B:221:0x04d4, B:214:0x04a7, B:225:0x04f7, B:227:0x04fa, B:231:0x04fe, B:235:0x0518, B:239:0x0533, B:242:0x0542, B:244:0x0559, B:256:0x059b, B:249:0x0570, B:253:0x0586, B:254:0x058a, B:160:0x03a9, B:116:0x029e, B:163:0x03b3, B:166:0x03c4, B:170:0x03d9, B:173:0x03ed, B:175:0x03f7, B:193:0x042f, B:195:0x044d, B:186:0x041b, B:187:0x0422, B:189:0x0429, B:190:0x042c, B:182:0x03ff, B:262:0x05b6, B:264:0x05bc, B:265:0x05bf), top: B:294:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:160:0x03a9 A[Catch: Exception -> 0x05c2, TRY_ENTER, TRY_LEAVE, TryCatch #12 {Exception -> 0x05c2, blocks: (B:3:0x0010, B:6:0x002f, B:9:0x0045, B:11:0x006c, B:15:0x0081, B:17:0x008b, B:25:0x00a3, B:27:0x00a7, B:29:0x00b9, B:31:0x00d4, B:32:0x00d6, B:22:0x0090, B:36:0x00da, B:41:0x00f1, B:43:0x00fb, B:47:0x0116, B:49:0x011a, B:51:0x013c, B:53:0x014c, B:55:0x015d, B:56:0x015f, B:60:0x0163, B:61:0x016b, B:62:0x016e, B:65:0x0171, B:68:0x0186, B:71:0x019f, B:75:0x01b9, B:76:0x01be, B:78:0x01cc, B:77:0x01c6, B:79:0x01cf, B:82:0x01ec, B:84:0x01f0, B:86:0x0205, B:90:0x021c, B:92:0x0222, B:96:0x023f, B:97:0x0247, B:98:0x024b, B:99:0x0255, B:101:0x0265, B:102:0x0269, B:112:0x0295, B:119:0x02b5, B:123:0x02cd, B:125:0x02d4, B:128:0x02ee, B:131:0x02fd, B:133:0x0305, B:139:0x030f, B:142:0x0329, B:145:0x033d, B:147:0x0352, B:150:0x0368, B:152:0x0381, B:151:0x0375, B:154:0x039d, B:156:0x03a3, B:157:0x03a6, B:138:0x030a, B:199:0x046e, B:203:0x0484, B:207:0x0497, B:209:0x04a2, B:215:0x04af, B:219:0x04c5, B:221:0x04d4, B:214:0x04a7, B:225:0x04f7, B:227:0x04fa, B:231:0x04fe, B:235:0x0518, B:239:0x0533, B:242:0x0542, B:244:0x0559, B:256:0x059b, B:249:0x0570, B:253:0x0586, B:254:0x058a, B:160:0x03a9, B:116:0x029e, B:163:0x03b3, B:166:0x03c4, B:170:0x03d9, B:173:0x03ed, B:175:0x03f7, B:193:0x042f, B:195:0x044d, B:186:0x041b, B:187:0x0422, B:189:0x0429, B:190:0x042c, B:182:0x03ff, B:262:0x05b6, B:264:0x05bc, B:265:0x05bf), top: B:294:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:163:0x03b3 A[Catch: Exception -> 0x05c2, TRY_ENTER, TRY_LEAVE, TryCatch #12 {Exception -> 0x05c2, blocks: (B:3:0x0010, B:6:0x002f, B:9:0x0045, B:11:0x006c, B:15:0x0081, B:17:0x008b, B:25:0x00a3, B:27:0x00a7, B:29:0x00b9, B:31:0x00d4, B:32:0x00d6, B:22:0x0090, B:36:0x00da, B:41:0x00f1, B:43:0x00fb, B:47:0x0116, B:49:0x011a, B:51:0x013c, B:53:0x014c, B:55:0x015d, B:56:0x015f, B:60:0x0163, B:61:0x016b, B:62:0x016e, B:65:0x0171, B:68:0x0186, B:71:0x019f, B:75:0x01b9, B:76:0x01be, B:78:0x01cc, B:77:0x01c6, B:79:0x01cf, B:82:0x01ec, B:84:0x01f0, B:86:0x0205, B:90:0x021c, B:92:0x0222, B:96:0x023f, B:97:0x0247, B:98:0x024b, B:99:0x0255, B:101:0x0265, B:102:0x0269, B:112:0x0295, B:119:0x02b5, B:123:0x02cd, B:125:0x02d4, B:128:0x02ee, B:131:0x02fd, B:133:0x0305, B:139:0x030f, B:142:0x0329, B:145:0x033d, B:147:0x0352, B:150:0x0368, B:152:0x0381, B:151:0x0375, B:154:0x039d, B:156:0x03a3, B:157:0x03a6, B:138:0x030a, B:199:0x046e, B:203:0x0484, B:207:0x0497, B:209:0x04a2, B:215:0x04af, B:219:0x04c5, B:221:0x04d4, B:214:0x04a7, B:225:0x04f7, B:227:0x04fa, B:231:0x04fe, B:235:0x0518, B:239:0x0533, B:242:0x0542, B:244:0x0559, B:256:0x059b, B:249:0x0570, B:253:0x0586, B:254:0x058a, B:160:0x03a9, B:116:0x029e, B:163:0x03b3, B:166:0x03c4, B:170:0x03d9, B:173:0x03ed, B:175:0x03f7, B:193:0x042f, B:195:0x044d, B:186:0x041b, B:187:0x0422, B:189:0x0429, B:190:0x042c, B:182:0x03ff, B:262:0x05b6, B:264:0x05bc, B:265:0x05bf), top: B:294:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:165:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:168:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:170:0x03d9 A[Catch: Exception -> 0x05c2, TRY_ENTER, TRY_LEAVE, TryCatch #12 {Exception -> 0x05c2, blocks: (B:3:0x0010, B:6:0x002f, B:9:0x0045, B:11:0x006c, B:15:0x0081, B:17:0x008b, B:25:0x00a3, B:27:0x00a7, B:29:0x00b9, B:31:0x00d4, B:32:0x00d6, B:22:0x0090, B:36:0x00da, B:41:0x00f1, B:43:0x00fb, B:47:0x0116, B:49:0x011a, B:51:0x013c, B:53:0x014c, B:55:0x015d, B:56:0x015f, B:60:0x0163, B:61:0x016b, B:62:0x016e, B:65:0x0171, B:68:0x0186, B:71:0x019f, B:75:0x01b9, B:76:0x01be, B:78:0x01cc, B:77:0x01c6, B:79:0x01cf, B:82:0x01ec, B:84:0x01f0, B:86:0x0205, B:90:0x021c, B:92:0x0222, B:96:0x023f, B:97:0x0247, B:98:0x024b, B:99:0x0255, B:101:0x0265, B:102:0x0269, B:112:0x0295, B:119:0x02b5, B:123:0x02cd, B:125:0x02d4, B:128:0x02ee, B:131:0x02fd, B:133:0x0305, B:139:0x030f, B:142:0x0329, B:145:0x033d, B:147:0x0352, B:150:0x0368, B:152:0x0381, B:151:0x0375, B:154:0x039d, B:156:0x03a3, B:157:0x03a6, B:138:0x030a, B:199:0x046e, B:203:0x0484, B:207:0x0497, B:209:0x04a2, B:215:0x04af, B:219:0x04c5, B:221:0x04d4, B:214:0x04a7, B:225:0x04f7, B:227:0x04fa, B:231:0x04fe, B:235:0x0518, B:239:0x0533, B:242:0x0542, B:244:0x0559, B:256:0x059b, B:249:0x0570, B:253:0x0586, B:254:0x058a, B:160:0x03a9, B:116:0x029e, B:163:0x03b3, B:166:0x03c4, B:170:0x03d9, B:173:0x03ed, B:175:0x03f7, B:193:0x042f, B:195:0x044d, B:186:0x041b, B:187:0x0422, B:189:0x0429, B:190:0x042c, B:182:0x03ff, B:262:0x05b6, B:264:0x05bc, B:265:0x05bf), top: B:294:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:173:0x03ed A[Catch: Exception -> 0x05c2, TRY_ENTER, TRY_LEAVE, TryCatch #12 {Exception -> 0x05c2, blocks: (B:3:0x0010, B:6:0x002f, B:9:0x0045, B:11:0x006c, B:15:0x0081, B:17:0x008b, B:25:0x00a3, B:27:0x00a7, B:29:0x00b9, B:31:0x00d4, B:32:0x00d6, B:22:0x0090, B:36:0x00da, B:41:0x00f1, B:43:0x00fb, B:47:0x0116, B:49:0x011a, B:51:0x013c, B:53:0x014c, B:55:0x015d, B:56:0x015f, B:60:0x0163, B:61:0x016b, B:62:0x016e, B:65:0x0171, B:68:0x0186, B:71:0x019f, B:75:0x01b9, B:76:0x01be, B:78:0x01cc, B:77:0x01c6, B:79:0x01cf, B:82:0x01ec, B:84:0x01f0, B:86:0x0205, B:90:0x021c, B:92:0x0222, B:96:0x023f, B:97:0x0247, B:98:0x024b, B:99:0x0255, B:101:0x0265, B:102:0x0269, B:112:0x0295, B:119:0x02b5, B:123:0x02cd, B:125:0x02d4, B:128:0x02ee, B:131:0x02fd, B:133:0x0305, B:139:0x030f, B:142:0x0329, B:145:0x033d, B:147:0x0352, B:150:0x0368, B:152:0x0381, B:151:0x0375, B:154:0x039d, B:156:0x03a3, B:157:0x03a6, B:138:0x030a, B:199:0x046e, B:203:0x0484, B:207:0x0497, B:209:0x04a2, B:215:0x04af, B:219:0x04c5, B:221:0x04d4, B:214:0x04a7, B:225:0x04f7, B:227:0x04fa, B:231:0x04fe, B:235:0x0518, B:239:0x0533, B:242:0x0542, B:244:0x0559, B:256:0x059b, B:249:0x0570, B:253:0x0586, B:254:0x058a, B:160:0x03a9, B:116:0x029e, B:163:0x03b3, B:166:0x03c4, B:170:0x03d9, B:173:0x03ed, B:175:0x03f7, B:193:0x042f, B:195:0x044d, B:186:0x041b, B:187:0x0422, B:189:0x0429, B:190:0x042c, B:182:0x03ff, B:262:0x05b6, B:264:0x05bc, B:265:0x05bf), top: B:294:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:182:0x03ff A[Catch: Exception -> 0x05c2, TRY_ENTER, TRY_LEAVE, TryCatch #12 {Exception -> 0x05c2, blocks: (B:3:0x0010, B:6:0x002f, B:9:0x0045, B:11:0x006c, B:15:0x0081, B:17:0x008b, B:25:0x00a3, B:27:0x00a7, B:29:0x00b9, B:31:0x00d4, B:32:0x00d6, B:22:0x0090, B:36:0x00da, B:41:0x00f1, B:43:0x00fb, B:47:0x0116, B:49:0x011a, B:51:0x013c, B:53:0x014c, B:55:0x015d, B:56:0x015f, B:60:0x0163, B:61:0x016b, B:62:0x016e, B:65:0x0171, B:68:0x0186, B:71:0x019f, B:75:0x01b9, B:76:0x01be, B:78:0x01cc, B:77:0x01c6, B:79:0x01cf, B:82:0x01ec, B:84:0x01f0, B:86:0x0205, B:90:0x021c, B:92:0x0222, B:96:0x023f, B:97:0x0247, B:98:0x024b, B:99:0x0255, B:101:0x0265, B:102:0x0269, B:112:0x0295, B:119:0x02b5, B:123:0x02cd, B:125:0x02d4, B:128:0x02ee, B:131:0x02fd, B:133:0x0305, B:139:0x030f, B:142:0x0329, B:145:0x033d, B:147:0x0352, B:150:0x0368, B:152:0x0381, B:151:0x0375, B:154:0x039d, B:156:0x03a3, B:157:0x03a6, B:138:0x030a, B:199:0x046e, B:203:0x0484, B:207:0x0497, B:209:0x04a2, B:215:0x04af, B:219:0x04c5, B:221:0x04d4, B:214:0x04a7, B:225:0x04f7, B:227:0x04fa, B:231:0x04fe, B:235:0x0518, B:239:0x0533, B:242:0x0542, B:244:0x0559, B:256:0x059b, B:249:0x0570, B:253:0x0586, B:254:0x058a, B:160:0x03a9, B:116:0x029e, B:163:0x03b3, B:166:0x03c4, B:170:0x03d9, B:173:0x03ed, B:175:0x03f7, B:193:0x042f, B:195:0x044d, B:186:0x041b, B:187:0x0422, B:189:0x0429, B:190:0x042c, B:182:0x03ff, B:262:0x05b6, B:264:0x05bc, B:265:0x05bf), top: B:294:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:184:0x0408  */
    /* JADX WARN: Code duplicated, block: B:186:0x041b A[Catch: Exception -> 0x05c2, TRY_ENTER, TryCatch #12 {Exception -> 0x05c2, blocks: (B:3:0x0010, B:6:0x002f, B:9:0x0045, B:11:0x006c, B:15:0x0081, B:17:0x008b, B:25:0x00a3, B:27:0x00a7, B:29:0x00b9, B:31:0x00d4, B:32:0x00d6, B:22:0x0090, B:36:0x00da, B:41:0x00f1, B:43:0x00fb, B:47:0x0116, B:49:0x011a, B:51:0x013c, B:53:0x014c, B:55:0x015d, B:56:0x015f, B:60:0x0163, B:61:0x016b, B:62:0x016e, B:65:0x0171, B:68:0x0186, B:71:0x019f, B:75:0x01b9, B:76:0x01be, B:78:0x01cc, B:77:0x01c6, B:79:0x01cf, B:82:0x01ec, B:84:0x01f0, B:86:0x0205, B:90:0x021c, B:92:0x0222, B:96:0x023f, B:97:0x0247, B:98:0x024b, B:99:0x0255, B:101:0x0265, B:102:0x0269, B:112:0x0295, B:119:0x02b5, B:123:0x02cd, B:125:0x02d4, B:128:0x02ee, B:131:0x02fd, B:133:0x0305, B:139:0x030f, B:142:0x0329, B:145:0x033d, B:147:0x0352, B:150:0x0368, B:152:0x0381, B:151:0x0375, B:154:0x039d, B:156:0x03a3, B:157:0x03a6, B:138:0x030a, B:199:0x046e, B:203:0x0484, B:207:0x0497, B:209:0x04a2, B:215:0x04af, B:219:0x04c5, B:221:0x04d4, B:214:0x04a7, B:225:0x04f7, B:227:0x04fa, B:231:0x04fe, B:235:0x0518, B:239:0x0533, B:242:0x0542, B:244:0x0559, B:256:0x059b, B:249:0x0570, B:253:0x0586, B:254:0x058a, B:160:0x03a9, B:116:0x029e, B:163:0x03b3, B:166:0x03c4, B:170:0x03d9, B:173:0x03ed, B:175:0x03f7, B:193:0x042f, B:195:0x044d, B:186:0x041b, B:187:0x0422, B:189:0x0429, B:190:0x042c, B:182:0x03ff, B:262:0x05b6, B:264:0x05bc, B:265:0x05bf), top: B:294:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:187:0x0422 A[Catch: Exception -> 0x05c2, TRY_LEAVE, TryCatch #12 {Exception -> 0x05c2, blocks: (B:3:0x0010, B:6:0x002f, B:9:0x0045, B:11:0x006c, B:15:0x0081, B:17:0x008b, B:25:0x00a3, B:27:0x00a7, B:29:0x00b9, B:31:0x00d4, B:32:0x00d6, B:22:0x0090, B:36:0x00da, B:41:0x00f1, B:43:0x00fb, B:47:0x0116, B:49:0x011a, B:51:0x013c, B:53:0x014c, B:55:0x015d, B:56:0x015f, B:60:0x0163, B:61:0x016b, B:62:0x016e, B:65:0x0171, B:68:0x0186, B:71:0x019f, B:75:0x01b9, B:76:0x01be, B:78:0x01cc, B:77:0x01c6, B:79:0x01cf, B:82:0x01ec, B:84:0x01f0, B:86:0x0205, B:90:0x021c, B:92:0x0222, B:96:0x023f, B:97:0x0247, B:98:0x024b, B:99:0x0255, B:101:0x0265, B:102:0x0269, B:112:0x0295, B:119:0x02b5, B:123:0x02cd, B:125:0x02d4, B:128:0x02ee, B:131:0x02fd, B:133:0x0305, B:139:0x030f, B:142:0x0329, B:145:0x033d, B:147:0x0352, B:150:0x0368, B:152:0x0381, B:151:0x0375, B:154:0x039d, B:156:0x03a3, B:157:0x03a6, B:138:0x030a, B:199:0x046e, B:203:0x0484, B:207:0x0497, B:209:0x04a2, B:215:0x04af, B:219:0x04c5, B:221:0x04d4, B:214:0x04a7, B:225:0x04f7, B:227:0x04fa, B:231:0x04fe, B:235:0x0518, B:239:0x0533, B:242:0x0542, B:244:0x0559, B:256:0x059b, B:249:0x0570, B:253:0x0586, B:254:0x058a, B:160:0x03a9, B:116:0x029e, B:163:0x03b3, B:166:0x03c4, B:170:0x03d9, B:173:0x03ed, B:175:0x03f7, B:193:0x042f, B:195:0x044d, B:186:0x041b, B:187:0x0422, B:189:0x0429, B:190:0x042c, B:182:0x03ff, B:262:0x05b6, B:264:0x05bc, B:265:0x05bf), top: B:294:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:198:0x046c  */
    private void disableSelectedSpouseFromMaleList(View view, B b, B b2, B b3, Spinner spinner, Spinner spinner2, B b4) {
        int i;
        List<ae> list;
        int i2;
        int i3;
        int i4;
        List<ae> list2;
        ae aeVar;
        int i5;
        int i6;
        List<ae> list3;
        ae aeVar2;
        F f;
        int i7;
        ae aeVar3;
        F f2;
        int i8;
        int size;
        Activity activity;
        StringBuilder sb;
        int i9;
        Toast toastMakeText;
        int i10;
        Activity activity2;
        int i11;
        int i12 = 2 % 2;
        try {
            F f3 = (F) b4;
            af afVar = (af) spinner.getAdapter();
            int i13 = d;
            int i14 = (-2) - (((i13 ^ 36) + ((i13 & 36) << 1)) ^ (-1));
            c = i14 % 128;
            Object obj = null;
            if (i14 % 2 == 0) {
                ArrayList<B> arrayList = afVar.d;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            ArrayList<B> arrayList2 = afVar.d;
            F f4 = ((ae) b2).a;
            int i15 = d;
            int i16 = ((i15 | 41) << 1) - (i15 ^ 41);
            c = i16 % 128;
            int i17 = i16 % 2;
            if (f3 == null) {
                f3 = new F(-1, BuildConfig.FLAVOR, BuildConfig.FLAVOR, -1, -1, BuildConfig.FLAVOR, -1, null, null, null);
                int i18 = d;
                int i19 = i18 & 43;
                int i20 = i19 + ((i18 ^ 43) | i19);
                c = i20 % 128;
                int i21 = i20 % 2;
            }
            if (f3.d == b3.d) {
                int i22 = d;
                int i23 = (i22 ^ 9) + ((i22 & 9) << 1);
                c = i23 % 128;
                if (i23 % 2 == 0) {
                    i11 = ((B) spinner.getSelectedItem()).d;
                    int i24 = 48 / 0;
                } else {
                    i11 = ((B) spinner.getSelectedItem()).d;
                }
                int i25 = c + 77;
                d = i25 % 128;
                if (i25 % 2 != 0) {
                    int i26 = b2.d;
                    throw null;
                }
                if (i11 == b2.d) {
                    C0118b c0118b = (C0118b) spinner.getOnItemSelectedListener();
                    int i27 = c;
                    int i28 = (i27 & 55) + (i27 | 55);
                    d = i28 % 128;
                    int i29 = i28 % 2;
                    c0118b.c = false;
                    spinner.setSelection(0);
                    int i30 = d;
                    int i31 = (i30 & (-52)) | ((~i30) & 51);
                    int i32 = (i30 & 51) << 1;
                    int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
                    c = i33 % 128;
                    int i34 = i33 % 2;
                }
            }
            if (b.d == b3.d) {
                int i35 = c;
                int i36 = i35 & 39;
                int i37 = i36 + ((i35 ^ 39) | i36);
                d = i37 % 128;
                if (i37 % 2 != 0) {
                    int i38 = ((B) spinner.getSelectedItem()).d;
                    obj.hashCode();
                    throw null;
                }
                if (((B) spinner.getSelectedItem()).d > 0 && ((B) spinner.getSelectedItem()).d != b.d) {
                    int i39 = d;
                    int i40 = (i39 ^ 33) + ((i39 & 33) << 1);
                    c = i40 % 128;
                    if (i40 % 2 == 0) {
                        int i41 = f3.d;
                        throw null;
                    }
                    if (f3.d >= 0) {
                        Toast toastMakeText2 = Toast.makeText(getActivity(), "You are selecting different husband", 0);
                        int i42 = d;
                        int i43 = (i42 & (-10)) | ((~i42) & 9);
                        int i44 = -(-((i42 & 9) << 1));
                        int i45 = ((i43 | i44) << 1) - (i43 ^ i44);
                        c = i45 % 128;
                        int i46 = i45 % 2;
                        toastMakeText2.show();
                        int i47 = (-2) - ((d + 56) ^ (-1));
                        c = i47 % 128;
                        int i48 = i47 % 2;
                    }
                    changeSpouseToDefault(view, f4, b, b2);
                    int i49 = d;
                    int i50 = ((i49 & 38) + (i49 | 38)) - 1;
                    c = i50 % 128;
                    int i51 = i50 % 2;
                }
            }
            if (b.d >= 0) {
                int i52 = d;
                int i53 = i52 & 23;
                int i54 = (i53 - (~(-(-((i52 ^ 23) | i53))))) - 1;
                c = i54 % 128;
                int i55 = i54 % 2;
                if (b2.d == ((B) spinner.getSelectedItem()).d) {
                    int i56 = d;
                    int i57 = i56 & 19;
                    int i58 = i57 + ((i56 ^ 19) | i57);
                    c = i58 % 128;
                    int i59 = i58 % 2;
                    if (b3.d != b.d) {
                        int i60 = c;
                        int i61 = i60 & 27;
                        int i62 = -(-((i60 ^ 27) | i61));
                        int i63 = (i61 & i62) + (i62 | i61);
                        d = i63 % 128;
                        if (i63 % 2 != 0) {
                            activity2 = getActivity();
                            i10 = 0;
                        } else {
                            i10 = 0;
                            activity2 = getActivity();
                        }
                        Toast.makeText(activity2, "You are selecting different husband", i10).show();
                        spinner.setSelection(i10);
                    }
                }
            }
            if (((B) spinner.getSelectedItem()).d > 0) {
                int i64 = c;
                int i65 = i64 & 29;
                int i66 = -(-((i64 ^ 29) | i65));
                int i67 = (i65 ^ i66) + ((i66 & i65) << 1);
                d = i67 % 128;
                int i68 = i67 % 2;
                if (b2 instanceof ae) {
                    int i69 = ((B) spinner.getSelectedItem()).d;
                    int i70 = (-2) - ((d + 54) ^ (-1));
                    c = i70 % 128;
                    int i71 = i70 % 2;
                    if (i69 == b2.d) {
                        int i72 = d;
                        int i73 = ((i72 | 113) << 1) - (((~i72) & 113) | (i72 & (-114)));
                        c = i73 % 128;
                        if (i73 % 2 == 0) {
                            int i74 = b.d;
                            int i75 = b3.d;
                            throw null;
                        }
                        if (b.d != b3.d) {
                            if (f3.d >= 0) {
                                int i76 = c;
                                int i77 = ((((i76 ^ 101) | (i76 & 101)) << 1) - (~(-(((~i76) & 101) | (i76 & (-102)))))) - 1;
                                d = i77 % 128;
                                (i77 % 2 != 0 ? Toast.makeText(getActivity(), "You are selecting different husband", 1) : Toast.makeText(getActivity(), "You are selecting different husband", 0)).show();
                            }
                            changeSpouseToDefault(view, f4, b, b2);
                            int i78 = c;
                            int i79 = (i78 & 53) + (i78 | 53);
                            d = i79 % 128;
                            int i80 = i79 % 2;
                        }
                    }
                }
            }
            if (b2 instanceof ae) {
                int i81 = d;
                int i82 = ((i81 | 81) << 1) - (i81 ^ 81);
                c = i82 % 128;
                int i83 = i82 % 2;
                if (b instanceof F) {
                    int i84 = i81 & 25;
                    int i85 = (i81 ^ 25) | i84;
                    int i86 = (i84 & i85) + (i85 | i84);
                    c = i86 % 128;
                    if (i86 % 2 == 0) {
                        i5 = b.d;
                        int i87 = 99 / 0;
                        if (i5 >= 0) {
                            int i88 = c;
                            int i89 = i88 & 31;
                            int i90 = (((i88 | 31) & (~i89)) - (~(-(-(i89 << 1))))) - 1;
                            d = i90 % 128;
                            int i91 = i90 % 2;
                            if (i5 == b3.d) {
                                int i92 = c;
                                int i93 = i92 & 23;
                                i6 = (((i92 ^ 23) | i93) << 1) - ((i92 | 23) & (~i93));
                                d = i6 % 128;
                                if (i6 % 2 == 0) {
                                    List<ae> list4 = ((F) b3).a;
                                    Object obj3 = null;
                                    obj3.hashCode();
                                    throw null;
                                }
                                list3 = ((F) b3).a;
                                if (list3 != null && !list3.contains((ae) b2)) {
                                    int i94 = d;
                                    int i95 = i94 ^ 77;
                                    int i96 = (i94 & 77) << 1;
                                    int i97 = (i95 ^ i96) + ((i96 & i95) << 1);
                                    int i98 = i97 % 128;
                                    c = i98;
                                    int i99 = i97 % 2;
                                    aeVar2 = (ae) b2;
                                    f = (F) b;
                                    i7 = i98 + 109;
                                    d = i7 % 128;
                                    if (i7 % 2 != 0) {
                                        aeVar2.a = f;
                                        aeVar3 = (ae) b2;
                                        int i100 = 45 / 0;
                                    } else {
                                        aeVar2.a = f;
                                        aeVar3 = (ae) b2;
                                    }
                                    list3.add(aeVar3);
                                    f2 = (F) b3;
                                    int i101 = d;
                                    int i102 = i101 ^ 19;
                                    int i103 = -(-((i101 & 19) << 1));
                                    i8 = (i102 & i103) + (i103 | i102);
                                    c = i8 % 128;
                                    if (i8 % 2 != 0) {
                                        f2.a = list3;
                                        list3.size();
                                        Object obj4 = null;
                                        obj4.hashCode();
                                        throw null;
                                    }
                                    f2.a = list3;
                                    size = list3.size();
                                    int i104 = d;
                                    int i105 = (i104 & 85) + (i104 | 85);
                                    c = i105 % 128;
                                    int i106 = i105 % 2;
                                    if (size > 4) {
                                        activity = getActivity();
                                        sb = new StringBuilder();
                                        int i107 = c;
                                        int i108 = (i107 & 23) + (i107 | 23);
                                        d = i108 % 128;
                                        int i109 = i108 % 2;
                                        sb.append(b.e);
                                        int i110 = d;
                                        i9 = (i110 ^ 93) + ((i110 & 93) << 1);
                                        c = i9 % 128;
                                        if (i9 % 2 == 0) {
                                            sb.append(" already have 4 wives");
                                            toastMakeText = Toast.makeText(activity, sb.toString(), 0);
                                        } else {
                                            sb.append(" already have 4 wives");
                                            toastMakeText = Toast.makeText(activity, sb.toString(), 0);
                                        }
                                        toastMakeText.show();
                                        int i111 = d;
                                        int i112 = ((i111 ^ 117) | (i111 & 117)) << 1;
                                        int i113 = -(((~i111) & 117) | (i111 & (-118)));
                                        int i114 = (i112 & i113) + (i113 | i112);
                                        c = i114 % 128;
                                        int i115 = i114 % 2;
                                    }
                                }
                            }
                        }
                    } else {
                        i5 = b.d;
                        if (i5 >= 0) {
                            int i810 = c;
                            int i811 = i810 & 31;
                            int i910 = (((i810 | 31) & (~i811)) - (~(-(-(i811 << 1))))) - 1;
                            d = i910 % 128;
                            int i911 = i910 % 2;
                            if (i5 == b3.d) {
                                int i912 = c;
                                int i913 = i912 & 23;
                                i6 = (((i912 ^ 23) | i913) << 1) - ((i912 | 23) & (~i913));
                                d = i6 % 128;
                                if (i6 % 2 == 0) {
                                    List<ae> list5 = ((F) b3).a;
                                    Object obj5 = null;
                                    obj5.hashCode();
                                    throw null;
                                }
                                list3 = ((F) b3).a;
                                if (list3 != null) {
                                    int i914 = d;
                                    int i915 = i914 ^ 77;
                                    int i916 = (i914 & 77) << 1;
                                    int i917 = (i915 ^ i916) + ((i916 & i915) << 1);
                                    int i918 = i917 % 128;
                                    c = i918;
                                    int i919 = i917 % 2;
                                    aeVar2 = (ae) b2;
                                    f = (F) b;
                                    i7 = i918 + 109;
                                    d = i7 % 128;
                                    if (i7 % 2 != 0) {
                                        aeVar2.a = f;
                                        aeVar3 = (ae) b2;
                                        int i1010 = 45 / 0;
                                    } else {
                                        aeVar2.a = f;
                                        aeVar3 = (ae) b2;
                                    }
                                    list3.add(aeVar3);
                                    f2 = (F) b3;
                                    int i1011 = d;
                                    int i1012 = i1011 ^ 19;
                                    int i1013 = -(-((i1011 & 19) << 1));
                                    i8 = (i1012 & i1013) + (i1013 | i1012);
                                    c = i8 % 128;
                                    if (i8 % 2 != 0) {
                                        f2.a = list3;
                                        list3.size();
                                        Object obj6 = null;
                                        obj6.hashCode();
                                        throw null;
                                    }
                                    f2.a = list3;
                                    size = list3.size();
                                    int i1014 = d;
                                    int i1015 = (i1014 & 85) + (i1014 | 85);
                                    c = i1015 % 128;
                                    int i1016 = i1015 % 2;
                                    if (size > 4) {
                                        activity = getActivity();
                                        sb = new StringBuilder();
                                        int i1017 = c;
                                        int i1018 = (i1017 & 23) + (i1017 | 23);
                                        d = i1018 % 128;
                                        int i1019 = i1018 % 2;
                                        sb.append(b.e);
                                        int i116 = d;
                                        i9 = (i116 ^ 93) + ((i116 & 93) << 1);
                                        c = i9 % 128;
                                        if (i9 % 2 == 0) {
                                            sb.append(" already have 4 wives");
                                            toastMakeText = Toast.makeText(activity, sb.toString(), 0);
                                        } else {
                                            sb.append(" already have 4 wives");
                                            toastMakeText = Toast.makeText(activity, sb.toString(), 0);
                                        }
                                        toastMakeText.show();
                                        int i117 = d;
                                        int i118 = ((i117 ^ 117) | (i117 & 117)) << 1;
                                        int i119 = -(((~i117) & 117) | (i117 & (-118)));
                                        int i1110 = (i118 & i119) + (i119 | i118);
                                        c = i1110 % 128;
                                        int i1111 = i1110 % 2;
                                    }
                                }
                            }
                        }
                    }
                    i = b.d;
                    if (i < 0) {
                        int i120 = d;
                        int i121 = i120 & 31;
                        int i122 = i121 + ((i120 ^ 31) | i121);
                        c = i122 % 128;
                        int i123 = i122 % 2;
                        if (f3.d == b3.d) {
                            int i124 = d;
                            int i125 = ((i124 | 41) << 1) - (i124 ^ 41);
                            c = i125 % 128;
                            int i126 = i125 % 2;
                            if (i < 0) {
                                list = ((F) b3).a;
                                int i127 = d;
                                int i128 = i127 & 3;
                                i2 = i128 + ((i127 ^ 3) | i128);
                                c = i2 % 128;
                                if (i2 % 2 == 0) {
                                    int i129 = 47 / 0;
                                    if (!(!list.contains((ae) b2))) {
                                        int i130 = c;
                                        int i131 = i130 ^ 107;
                                        i3 = ((((i130 & 107) | i131) << 1) - (~(-i131))) - 1;
                                        d = i3 % 128;
                                        if (i3 % 2 == 0) {
                                            list.remove((ae) b2);
                                            Object obj7 = null;
                                            obj7.hashCode();
                                            throw null;
                                        }
                                        list.remove((ae) b2);
                                    }
                                } else if (list.contains((ae) b2)) {
                                    int i132 = c;
                                    int i133 = i132 ^ 107;
                                    i3 = ((((i132 & 107) | i133) << 1) - (~(-i133))) - 1;
                                    d = i3 % 128;
                                    if (i3 % 2 == 0) {
                                        list.remove((ae) b2);
                                        Object obj8 = null;
                                        obj8.hashCode();
                                        throw null;
                                    }
                                    list.remove((ae) b2);
                                }
                                ((F) b3).a = list;
                                int i134 = c;
                                int i135 = ((i134 ^ 5) | (i134 & 5)) << 1;
                                int i136 = -(((~i134) & 5) | (i134 & (-6)));
                                int i137 = ((i135 | i136) << 1) - (i136 ^ i135);
                                d = i137 % 128;
                                int i138 = i137 % 2;
                                ((ae) b2).a = (F) b;
                                int i139 = c;
                                int i140 = i139 & 47;
                                i4 = ((((i139 ^ 47) | i140) << 1) - (~(-((i139 | 47) & (~i140))))) - 1;
                                d = i4 % 128;
                                if (i4 % 2 != 0) {
                                    int i141 = 2 / 4;
                                }
                            }
                        }
                    }
                } else {
                    i = b.d;
                    if (i < 0) {
                        int i1210 = d;
                        int i1211 = i1210 & 31;
                        int i1212 = i1211 + ((i1210 ^ 31) | i1211);
                        c = i1212 % 128;
                        int i1213 = i1212 % 2;
                        if (f3.d == b3.d) {
                            int i1214 = d;
                            int i1215 = ((i1214 | 41) << 1) - (i1214 ^ 41);
                            c = i1215 % 128;
                            int i1216 = i1215 % 2;
                            if (i < 0) {
                                list = ((F) b3).a;
                                int i1217 = d;
                                int i1218 = i1217 & 3;
                                i2 = i1218 + ((i1217 ^ 3) | i1218);
                                c = i2 % 128;
                                if (i2 % 2 == 0) {
                                    int i1219 = 47 / 0;
                                    if (!(!list.contains((ae) b2))) {
                                        int i1310 = c;
                                        int i1311 = i1310 ^ 107;
                                        i3 = ((((i1310 & 107) | i1311) << 1) - (~(-i1311))) - 1;
                                        d = i3 % 128;
                                        if (i3 % 2 == 0) {
                                            list.remove((ae) b2);
                                            Object obj9 = null;
                                            obj9.hashCode();
                                            throw null;
                                        }
                                        list.remove((ae) b2);
                                    }
                                } else if (list.contains((ae) b2)) {
                                    int i1312 = c;
                                    int i1313 = i1312 ^ 107;
                                    i3 = ((((i1312 & 107) | i1313) << 1) - (~(-i1313))) - 1;
                                    d = i3 % 128;
                                    if (i3 % 2 == 0) {
                                        list.remove((ae) b2);
                                        Object obj10 = null;
                                        obj10.hashCode();
                                        throw null;
                                    }
                                    list.remove((ae) b2);
                                }
                                ((F) b3).a = list;
                                int i1314 = c;
                                int i1315 = ((i1314 ^ 5) | (i1314 & 5)) << 1;
                                int i1316 = -(((~i1314) & 5) | (i1314 & (-6)));
                                int i1317 = ((i1315 | i1316) << 1) - (i1316 ^ i1315);
                                d = i1317 % 128;
                                int i1318 = i1317 % 2;
                                ((ae) b2).a = (F) b;
                                int i1319 = c;
                                int i142 = i1319 & 47;
                                i4 = ((((i1319 ^ 47) | i142) << 1) - (~(-((i1319 | 47) & (~i142))))) - 1;
                                d = i4 % 128;
                                if (i4 % 2 != 0) {
                                    int i143 = 2 / 4;
                                }
                            }
                        }
                    }
                }
            } else {
                i = b.d;
                if (i < 0) {
                    int i12110 = d;
                    int i12111 = i12110 & 31;
                    int i12112 = i12111 + ((i12110 ^ 31) | i12111);
                    c = i12112 % 128;
                    int i12113 = i12112 % 2;
                    if (f3.d == b3.d) {
                        int i12114 = d;
                        int i12115 = ((i12114 | 41) << 1) - (i12114 ^ 41);
                        c = i12115 % 128;
                        int i12116 = i12115 % 2;
                        if (i < 0) {
                            list = ((F) b3).a;
                            int i12117 = d;
                            int i12118 = i12117 & 3;
                            i2 = i12118 + ((i12117 ^ 3) | i12118);
                            c = i2 % 128;
                            if (i2 % 2 == 0) {
                                int i12119 = 47 / 0;
                                if (!(!list.contains((ae) b2))) {
                                    int i13110 = c;
                                    int i13111 = i13110 ^ 107;
                                    i3 = ((((i13110 & 107) | i13111) << 1) - (~(-i13111))) - 1;
                                    d = i3 % 128;
                                    if (i3 % 2 == 0) {
                                        list.remove((ae) b2);
                                        Object obj11 = null;
                                        obj11.hashCode();
                                        throw null;
                                    }
                                    list.remove((ae) b2);
                                }
                            } else if (list.contains((ae) b2)) {
                                int i13112 = c;
                                int i13113 = i13112 ^ 107;
                                i3 = ((((i13112 & 107) | i13113) << 1) - (~(-i13113))) - 1;
                                d = i3 % 128;
                                if (i3 % 2 == 0) {
                                    list.remove((ae) b2);
                                    Object obj12 = null;
                                    obj12.hashCode();
                                    throw null;
                                }
                                list.remove((ae) b2);
                            }
                            ((F) b3).a = list;
                            int i13114 = c;
                            int i13115 = ((i13114 ^ 5) | (i13114 & 5)) << 1;
                            int i13116 = -(((~i13114) & 5) | (i13114 & (-6)));
                            int i13117 = ((i13115 | i13116) << 1) - (i13116 ^ i13115);
                            d = i13117 % 128;
                            int i13118 = i13117 % 2;
                            ((ae) b2).a = (F) b;
                            int i13119 = c;
                            int i144 = i13119 & 47;
                            i4 = ((((i13119 ^ 47) | i144) << 1) - (~(-((i13119 | 47) & (~i144))))) - 1;
                            d = i4 % 128;
                            if (i4 % 2 != 0) {
                                int i145 = 2 / 4;
                            }
                        }
                    }
                }
            }
            int i146 = f3.d;
            if (i146 >= 0) {
                int i147 = d;
                int i148 = ((i147 | 2) << 1) - (i147 ^ 2);
                int i149 = (i148 ^ (-1)) + (i148 << 1);
                c = i149 % 128;
                if (i149 % 2 == 0) {
                    int i150 = b3.d;
                    throw null;
                }
                if (i146 == b3.d) {
                    int i151 = (-2) - ((c + 50) ^ (-1));
                    d = i151 % 128;
                    if (i151 % 2 != 0) {
                        list2 = ((F) b3).a;
                        aeVar = (ae) b2;
                        int i152 = 90 / 0;
                    } else {
                        list2 = ((F) b3).a;
                        aeVar = (ae) b2;
                    }
                    if (list2.contains(aeVar)) {
                        int i153 = c;
                        int i154 = ((i153 & (-118)) | ((~i153) & 117)) + ((i153 & 117) << 1);
                        d = i154 % 128;
                        int i155 = i154 % 2;
                        list2.remove((ae) b2);
                        int i156 = d + 91;
                        c = i156 % 128;
                        int i157 = i156 % 2;
                    }
                    ((F) b3).a = list2;
                    ((ae) b2).a = (F) b;
                    int i158 = c;
                    int i159 = i158 & 119;
                    int i160 = (i159 - (~(-(-((i158 ^ 119) | i159))))) - 1;
                    d = i160 % 128;
                    if (i160 % 2 != 0) {
                        int i161 = 3 % 2;
                    }
                }
            }
            int i162 = b3.d;
            int i163 = b.d;
            if (i162 != i163) {
                int i164 = c;
                int i165 = (i164 | 111) << 1;
                int i166 = -(i164 ^ 111);
                int i167 = (i165 ^ i166) + ((i166 & i165) << 1);
                d = i167 % 128;
                int i168 = i167 % 2;
                if (i163 >= 0) {
                    ((af) spinner.getAdapter()).d(arrayList2.indexOf(b2), false);
                    int i169 = c + 7;
                    d = i169 % 128;
                    if (i169 % 2 != 0) {
                        int i170 = 2 / 5;
                    }
                }
            }
            int i171 = b.d;
            if (i171 == b3.d) {
                int i172 = d + 101;
                c = i172 % 128;
                int i173 = i172 % 2;
                af afVar2 = (af) spinner.getAdapter();
                int iIndexOf = arrayList2.indexOf(b2);
                int i174 = (-2) - ((c + 70) ^ (-1));
                d = i174 % 128;
                int i175 = i174 % 2;
                afVar2.d(iIndexOf, true);
                int i176 = d;
                int i177 = (i176 ^ 45) + ((i176 & 45) << 1);
                c = i177 % 128;
                if (i177 % 2 == 0) {
                    int i178 = 2 % 3;
                }
            } else if (i171 < 0) {
                af afVar3 = (af) spinner.getAdapter();
                int iIndexOf2 = arrayList2.indexOf(b2);
                int i179 = d + 49;
                c = i179 % 128;
                if (i179 % 2 == 0) {
                    afVar3.d(iIndexOf2, false);
                } else {
                    afVar3.d(iIndexOf2, true);
                }
                int i180 = c;
                int i181 = i180 ^ 9;
                int i182 = (((i180 & 9) | i181) << 1) - i181;
                d = i182 % 128;
                int i183 = i182 % 2;
            }
            ((af) spinner.getAdapter()).notifyDataSetChanged();
            int i184 = d;
            int i185 = (i184 ^ 13) + ((i184 & 13) << 1);
            c = i185 % 128;
            if (i185 % 2 == 0) {
                throw null;
            }
        } catch (Exception unused) {
            Toast.makeText(getActivity(), "Something seriously went wrong please check", 0).show();
        }
    }

    private void generateBody() {
        int i = 2 % 2;
        int i2 = c;
        int i3 = (i2 & 9) + (i2 | 9);
        d = i3 % 128;
        int i4 = i3 % 2;
        int i5 = 0;
        while (i5 < this.mPersonList.size()) {
            try {
                int i6 = d;
                int i7 = (i6 ^ 3) + ((i6 & 3) << 1);
                c = i7 % 128;
                int i8 = i7 % 2;
                generateList(this.mPersonList.get(i5));
                int i9 = i5 & 89;
                int i10 = (i5 | 89) & (~i9);
                int i11 = i9 << 1;
                int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
                int i13 = (i12 | (-88)) << 1;
                int i14 = -((i12 & 87) | ((~i12) & (-88)));
                i5 = ((i13 & i14) << 1) + (i13 ^ i14);
                int i15 = c + 103;
                d = i15 % 128;
                int i16 = i15 % 2;
            } catch (Exception unused) {
            }
        }
        int i17 = c;
        int i18 = i17 & 57;
        int i19 = (i17 | 57) & (~i18);
        int i20 = i18 << 1;
        int i21 = (i19 & i20) + (i19 | i20);
        d = i21 % 128;
        if (i21 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 ^ 47;
        int i4 = (i2 & 47) << 1;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        int i6 = i5 % 128;
        c = i6;
        int i7 = i5 % 2;
        if (this.parentView == null) {
            int i8 = i6 & 89;
            int i9 = i8 + ((i6 ^ 89) | i8);
            d = i9 % 128;
            View viewInflate = i9 % 2 != 0 ? layoutInflater.inflate(R.layout.fragment_relationship, viewGroup, true) : layoutInflater.inflate(R.layout.fragment_relationship, viewGroup, false);
            this.parentView = viewInflate;
            int i10 = c;
            int i11 = ((i10 ^ 55) | (i10 & 55)) << 1;
            int i12 = -(((~i10) & 55) | (i10 & (-56)));
            int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
            d = i13 % 128;
            if (i13 % 2 != 0) {
                this.linearLayout = (LinearLayout) viewInflate.findViewById(R.id.relationship_layout);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            this.linearLayout = (LinearLayout) viewInflate.findViewById(R.id.relationship_layout);
            int i14 = c;
            int i15 = ((((i14 ^ 33) | (i14 & 33)) << 1) - (~(-(((~i14) & 33) | (i14 & (-34)))))) - 1;
            d = i15 % 128;
            int i16 = i15 % 2;
            generateDummyData();
            generateBody();
            int i17 = d;
            int i18 = i17 & 19;
            int i19 = ((i17 ^ 19) | i18) << 1;
            int i20 = -((i17 | 19) & (~i18));
            int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
            c = i21 % 128;
            int i22 = i21 % 2;
        }
        View view = this.parentView;
        int i23 = c;
        int i24 = (i23 & 57) + (i23 | 57);
        d = i24 % 128;
        int i25 = i24 % 2;
        return view;
    }

    @Override // ivas.gov.bisp.enumeration.X.e
    public SupervisorParseObject parseJsonForSupervisor() {
        int i = 2 % 2;
        int i2 = c;
        int i3 = (((i2 | 94) << 1) - (i2 ^ 94)) - 1;
        int i4 = i3 % 128;
        d = i4;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i5 = i4 & 19;
        int i6 = ((i4 | 19) & (~i5)) + (i5 << 1);
        c = i6 % 128;
        if (i6 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0052, code lost:
    
        if (r8.c <= 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0057, code lost:
    
        if (r8.c <= 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0059, code lost:
    
        r8 = ivas.gov.bisp.enumeration.fragments.FragmentOfflineRelationship.c;
        r1 = (r8 & 67) + (r8 | 67);
        r8 = r1 % 128;
        ivas.gov.bisp.enumeration.fragments.FragmentOfflineRelationship.d = r8;
        r1 = r1 % 2;
        r8 = r8 + 57;
        ivas.gov.bisp.enumeration.fragments.FragmentOfflineRelationship.c = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006c, code lost:
    
        if ((r8 % 2) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0070, code lost:
    
        r8 = ivas.gov.bisp.enumeration.fragments.FragmentOfflineRelationship.c + 115;
        ivas.gov.bisp.enumeration.fragments.FragmentOfflineRelationship.d = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0079, code lost:
    
        if ((r8 % 2) != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007c, code lost:
    
        r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007f, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean checkAge(ivas.gov.bisp.enumeration.bK.d r8) {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.fragments.FragmentOfflineRelationship.d
            r2 = r1 | 28
            r3 = 1
            int r2 = r2 << r3
            r1 = r1 ^ 28
            int r2 = r2 - r1
            r1 = r2 ^ (-1)
            int r1 = (-2) - r1
            int r2 = r1 % 128
            ivas.gov.bisp.enumeration.fragments.FragmentOfflineRelationship.c = r2
            int r1 = r1 % r0
            int r1 = r8.e
            if (r1 <= 0) goto L2c
            int r8 = ivas.gov.bisp.enumeration.fragments.FragmentOfflineRelationship.d
            r1 = r8 ^ 65
            r2 = r8 & 65
            r1 = r1 | r2
            int r1 = r1 << r3
            int r2 = ~r2
            r8 = r8 | 65
            r8 = r8 & r2
            int r1 = r1 - r8
            int r8 = r1 % 128
            ivas.gov.bisp.enumeration.fragments.FragmentOfflineRelationship.c = r8
            int r1 = r1 % r0
            return r3
        L2c:
            int r1 = r8.d
            r2 = 0
            r4 = 0
            if (r1 != 0) goto L80
            int r1 = ivas.gov.bisp.enumeration.fragments.FragmentOfflineRelationship.d
            r5 = r1 ^ 11
            r6 = r1 & 11
            r5 = r5 | r6
            int r5 = r5 << r3
            r6 = r1 & (-12)
            int r1 = ~r1
            r1 = r1 & 11
            r1 = r1 | r6
            int r1 = -r1
            r6 = r5 ^ r1
            r1 = r1 & r5
            int r1 = r1 << r3
            int r6 = r6 + r1
            int r1 = r6 % 128
            ivas.gov.bisp.enumeration.fragments.FragmentOfflineRelationship.c = r1
            int r6 = r6 % r0
            if (r6 != 0) goto L55
            int r8 = r8.c
            r1 = 95
            int r1 = r1 / r4
            if (r8 > 0) goto L70
            goto L59
        L55:
            int r8 = r8.c
            if (r8 > 0) goto L70
        L59:
            int r8 = ivas.gov.bisp.enumeration.fragments.FragmentOfflineRelationship.c
            r1 = r8 & 67
            r8 = r8 | 67
            int r1 = r1 + r8
            int r8 = r1 % 128
            ivas.gov.bisp.enumeration.fragments.FragmentOfflineRelationship.d = r8
            int r1 = r1 % r0
            int r8 = r8 + 57
            int r1 = r8 % 128
            ivas.gov.bisp.enumeration.fragments.FragmentOfflineRelationship.c = r1
            int r8 = r8 % r0
            if (r8 == 0) goto L6f
            return r3
        L6f:
            throw r2
        L70:
            int r8 = ivas.gov.bisp.enumeration.fragments.FragmentOfflineRelationship.c
            int r8 = r8 + 115
            int r1 = r8 % 128
            ivas.gov.bisp.enumeration.fragments.FragmentOfflineRelationship.d = r1
            int r8 = r8 % r0
            if (r8 != 0) goto L7c
            return r4
        L7c:
            r2.hashCode()
            throw r2
        L80:
            r8 = 6
            if (r1 < r8) goto La5
            int r8 = ivas.gov.bisp.enumeration.fragments.FragmentOfflineRelationship.c
            r1 = r8 & 83
            r5 = r8 ^ 83
            r5 = r5 | r1
            int r5 = -r5
            int r5 = -r5
            int r5 = ~r5
            int r1 = r1 - r5
            int r1 = r1 - r3
            int r5 = r1 % 128
            ivas.gov.bisp.enumeration.fragments.FragmentOfflineRelationship.d = r5
            int r1 = r1 % r0
            if (r1 == 0) goto L97
            r3 = r4
        L97:
            r1 = r8 & 87
            r8 = r8 | 87
            int r1 = r1 + r8
            int r8 = r1 % 128
            ivas.gov.bisp.enumeration.fragments.FragmentOfflineRelationship.d = r8
            int r1 = r1 % r0
            if (r1 != 0) goto La4
            return r3
        La4:
            throw r2
        La5:
            int r8 = ivas.gov.bisp.enumeration.fragments.FragmentOfflineRelationship.c
            r1 = r8 & 35
            r8 = r8 ^ 35
            r8 = r8 | r1
            int r1 = r1 + r8
            int r8 = r1 % 128
            ivas.gov.bisp.enumeration.fragments.FragmentOfflineRelationship.d = r8
            int r1 = r1 % r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.fragments.FragmentOfflineRelationship.checkAge(ivas.gov.bisp.enumeration.bK.d):boolean");
    }

    private void disableMaleFromWifeFatherList(B b, B b2, B b3, B b4) {
        Spinner spinner;
        LinearLayout linearLayout;
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 & 47;
        int i4 = ((i2 ^ 47) | i3) << 1;
        int i5 = -((i2 | 47) & (~i3));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        c = i6 % 128;
        int i7 = i6 % 2;
        LinearLayout linearLayout2 = (LinearLayout) ((ScrollView) this.parentView).getChildAt(0);
        int i8 = c;
        int i9 = i8 & 57;
        int i10 = (((i8 ^ 57) | i9) << 1) - ((i8 | 57) & (~i9));
        int i11 = i10 % 128;
        d = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 3;
        c = i13 % 128;
        int i14 = i13 % 2;
        int i15 = 0;
        while (i15 < linearLayout2.getChildCount()) {
            int i16 = d;
            int i17 = ((i16 ^ 71) | (i16 & 71)) << 1;
            int i18 = -(((~i16) & 71) | (i16 & (-72)));
            int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
            c = i19 % 128;
            Object obj = null;
            if (i19 % 2 == 0) {
                throw null;
            }
            LinearLayout linearLayout3 = (LinearLayout) linearLayout2.getChildAt(i15);
            View childAt = linearLayout3.getChildAt(2);
            int i20 = d;
            int i21 = (-2) - ((((i20 | 44) << 1) - (i20 ^ 44)) ^ (-1));
            c = i21 % 128;
            if (i21 % 2 == 0) {
                spinner = (Spinner) childAt;
                linearLayout = (LinearLayout) spinner.getParent();
                int i22 = 87 / 0;
            } else {
                spinner = (Spinner) childAt;
                linearLayout = (LinearLayout) spinner.getParent();
            }
            int i23 = c;
            int i24 = i23 & 107;
            int i25 = (i23 | 107) & (~i24);
            int i26 = i24 << 1;
            int i27 = (i25 & i26) + (i25 | i26);
            d = i27 % 128;
            int i28 = i27 % 2;
            B b5 = (B) linearLayout.getTag();
            SpinnerAdapter adapter = spinner.getAdapter();
            int i29 = d + 30;
            int i30 = (i29 ^ (-1)) + (i29 << 1);
            c = i30 % 128;
            if (i30 % 2 == 0) {
                ArrayList<B> arrayList = ((af) adapter).d;
                int i31 = b2.d;
                throw null;
            }
            ArrayList<B> arrayList2 = ((af) adapter).d;
            if (b2.d >= 0 && b5.d == b4.d) {
                int i32 = c;
                int i33 = (i32 & 31) + (i32 | 31);
                d = i33 % 128;
                int i34 = i33 % 2;
                af afVar = (af) spinner.getAdapter();
                int i35 = d;
                int i36 = i35 & 43;
                int i37 = i35 | 43;
                int i38 = ((i36 | i37) << 1) - (i37 ^ i36);
                c = i38 % 128;
                int i39 = i38 % 2;
                afVar.d(arrayList2.indexOf(b2), false);
                int i40 = d;
                int i41 = i40 & 93;
                int i42 = i40 | 93;
                int i43 = ((i41 | i42) << 1) - (i42 ^ i41);
                c = i43 % 128;
                int i44 = i43 % 2;
            }
            if (b3 != null) {
                int i45 = d;
                int i46 = i45 & 115;
                int i47 = i46 + ((i45 ^ 115) | i46);
                c = i47 % 128;
                if (i47 % 2 == 0) {
                    int i48 = b3.d;
                    obj.hashCode();
                    throw null;
                }
                if (b3.d >= 0) {
                    int i49 = d + 113;
                    c = i49 % 128;
                    if (i49 % 2 == 0) {
                        int i50 = b5.d;
                        int i51 = b4.d;
                        obj.hashCode();
                        throw null;
                    }
                    if (b5.d == b4.d) {
                        af afVar2 = (af) spinner.getAdapter();
                        int iIndexOf = arrayList2.indexOf(b3);
                        int i52 = c;
                        int i53 = (i52 ^ 83) + ((i52 & 83) << 1);
                        d = i53 % 128;
                        if (i53 % 2 != 0) {
                            afVar2.d(iIndexOf, false);
                        } else {
                            afVar2.d(iIndexOf, true);
                        }
                    }
                } else {
                    continue;
                }
            }
            int i54 = i15 ^ 1;
            int i55 = (i15 & 1) << 1;
            i15 = ((i54 | i55) << 1) - (i55 ^ i54);
            int i56 = d;
            int i57 = ((i56 | 33) << 1) - (i56 ^ 33);
            c = i57 % 128;
            int i58 = i57 % 2;
        }
        int i59 = d;
        int i60 = i59 | 15;
        int i61 = i60 << 1;
        int i62 = -((~(i59 & 15)) & i60);
        int i63 = (i61 ^ i62) + ((i62 & i61) << 1);
        c = i63 % 128;
        int i64 = i63 % 2;
    }

    private void generateDummyData() {
        int i = 2 % 2;
        int i2 = c;
        int i3 = ((i2 & 16) + (i2 | 16)) - 1;
        d = i3 % 128;
        ArrayList<Roster> arrayList = ((ActivityBeginSurvey) (i3 % 2 != 0 ? getActivity() : getActivity())).aq;
        int i4 = 0;
        while (true) {
            Object obj = null;
            if (i4 >= arrayList.size()) {
                int i5 = d;
                int i6 = (i5 & 9) + (i5 | 9);
                c = i6 % 128;
                if (i6 % 2 == 0) {
                    throw null;
                }
                return;
            }
            int i7 = c + 117;
            d = i7 % 128;
            int i8 = i7 % 2;
            Roster roster = arrayList.get(i4);
            String str = roster.gender;
            int i9 = d;
            int i10 = (i9 & 93) + (i9 | 93);
            c = i10 % 128;
            int i11 = i10 % 2;
            if (str.equals("male")) {
                F f = new F(roster.roster_relational_id, roster.name_of_member, roster.date_of_birth_var, roster.age_year, roster.age_month, "male", roster.marital_status, null, null, new ArrayList());
                int i12 = c;
                int i13 = (i12 ^ 7) + ((i12 & 7) << 1);
                d = i13 % 128;
                int i14 = i13 % 2;
                this.mPersonList.add(f);
                int i15 = d + 47;
                c = i15 % 128;
                int i16 = i15 % 2;
            } else {
                String str2 = arrayList.get(i4).gender;
                int i17 = c;
                int i18 = i17 ^ 125;
                int i19 = ((i17 & 125) | i18) << 1;
                int i20 = -i18;
                int i21 = (i19 ^ i20) + ((i19 & i20) << 1);
                d = i21 % 128;
                int i22 = i21 % 2;
                if (str2.equals("female")) {
                    ae aeVar = new ae(roster.roster_relational_id, roster.name_of_member, roster.date_of_birth_var, roster.age_year, roster.age_month, "female", roster.marital_status, null, null, null);
                    int i23 = c;
                    int i24 = (i23 & 61) + (i23 | 61);
                    d = i24 % 128;
                    int i25 = i24 % 2;
                    this.mPersonList.add(aeVar);
                    int i26 = d;
                    int i27 = ((i26 ^ 115) | (i26 & 115)) << 1;
                    int i28 = -(((~i26) & 115) | (i26 & (-116)));
                    int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
                    c = i29 % 128;
                    int i30 = i29 % 2;
                } else {
                    ai aiVar = new ai(roster.roster_relational_id, roster.name_of_member, roster.date_of_birth_var, roster.age_year, roster.age_month, "transgender", roster.marital_status, null, null, null);
                    int i31 = c + 61;
                    d = i31 % 128;
                    if (i31 % 2 != 0) {
                        this.mPersonList.add(aiVar);
                        obj.hashCode();
                        throw null;
                    }
                    this.mPersonList.add(aiVar);
                    int i32 = c;
                    int i33 = (i32 ^ 101) + ((i32 & 101) << 1);
                    d = i33 % 128;
                    int i34 = i33 % 2;
                }
            }
            int i35 = i4 & 1;
            i4 = ((i4 ^ 1) | i35) + i35;
            int i36 = d;
            int i37 = i36 & 39;
            int i38 = ((i36 ^ 39) | i37) << 1;
            int i39 = -((i36 | 39) & (~i37));
            int i40 = (i38 ^ i39) + ((i39 & i38) << 1);
            c = i40 % 128;
            int i41 = i40 % 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:43:0x01b6  */
    private void updateFemaleSpouseOfOtherMalesListWhenWifeSelected(View view, Spinner spinner, B b, B b2, B b3, List<B> list, int i, boolean z) {
        int i2 = 2 % 2;
        int i3 = c;
        int i4 = i3 & 25;
        int i5 = -(-((i3 ^ 25) | i4));
        int i6 = (i4 & i5) + (i5 | i4);
        d = i6 % 128;
        int i7 = i6 % 2;
        LinearLayout linearLayout = (LinearLayout) ((ScrollView) view).getChildAt(0);
        int i8 = d + 55;
        c = i8 % 128;
        int i9 = i8 % 2;
        int i10 = 0;
        while (i10 < linearLayout.getChildCount()) {
            int i11 = c;
            int i12 = (i11 ^ 73) + ((i11 & 73) << 1);
            d = i12 % 128;
            if (i12 % 2 != 0) {
                ((LinearLayout) linearLayout.getChildAt(i10)).getTag();
                throw null;
            }
            LinearLayout linearLayout2 = (LinearLayout) linearLayout.getChildAt(i10);
            Object tag = linearLayout2.getTag();
            int i13 = d;
            int i14 = (i13 & 72) + (i13 | 72);
            int i15 = (i14 ^ (-1)) + (i14 << 1);
            c = i15 % 128;
            int i16 = i15 % 2;
            B b4 = (B) tag;
            ViewParent parent = ((Spinner) linearLayout2.getChildAt(1)).getParent();
            int i17 = c;
            int i18 = i17 & 43;
            int i19 = ((((i17 ^ 43) | i18) << 1) - (~(-((i17 | 43) & (~i18))))) - 1;
            d = i19 % 128;
            if (i19 % 2 != 0) {
                Object obj = null;
                boolean z2 = b instanceof ae;
                obj.hashCode();
                throw null;
            }
            B b5 = (B) ((LinearLayout) parent).getTag();
            boolean z3 = b instanceof ae;
            int i20 = d;
            int i21 = i20 & 73;
            int i22 = -(-(i20 | 73));
            int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
            int i24 = i23 % 128;
            c = i24;
            int i25 = i23 % 2;
            if (!(!z3)) {
                int i26 = i24 & 51;
                int i27 = (i26 - (~((i24 ^ 51) | i26))) - 1;
                d = i27 % 128;
                if (i27 % 2 != 0) {
                    boolean z4 = b3 instanceof F;
                    throw null;
                }
                if ((b3 instanceof F) && ((Spinner) linearLayout2.getChildAt(1)) != spinner) {
                    int i28 = d;
                    int i29 = i28 ^ 73;
                    int i30 = ((i28 & 73) | i29) << 1;
                    int i31 = -i29;
                    int i32 = ((i30 | i31) << 1) - (i30 ^ i31);
                    int i33 = i32 % 128;
                    c = i33;
                    int i34 = i32 % 2;
                    if (b5 instanceof F) {
                        int i35 = (i33 & (-90)) | ((~i33) & 89);
                        int i36 = (i33 & 89) << 1;
                        int i37 = ((i35 | i36) << 1) - (i35 ^ i36);
                        d = i37 % 128;
                        int i38 = i37 % 2;
                        Spinner spinner2 = (Spinner) linearLayout2.getChildAt(1);
                        int i39 = d;
                        int i40 = i39 & 3;
                        int i41 = -(-(i39 | 3));
                        int i42 = ((i40 | i41) << 1) - (i41 ^ i40);
                        c = i42 % 128;
                        if (i42 % 2 == 0) {
                            disableSelectedSpouse(b, b2, b3, spinner2, list, z);
                            int i43 = 63 / 0;
                        } else {
                            disableSelectedSpouse(b, b2, b3, spinner2, list, z);
                        }
                    }
                }
            }
            if (z3) {
                int i44 = d + 17;
                int i45 = i44 % 128;
                c = i45;
                if (i44 % 2 == 0) {
                    boolean z5 = b3 instanceof F;
                    throw null;
                }
                if (!(!(b3 instanceof F))) {
                    int i46 = i45 | 107;
                    int i47 = (i46 << 1) - (i46 & (~(i45 & 107)));
                    d = i47 % 128;
                    int i48 = i47 % 2;
                    if (((Spinner) linearLayout2.getChildAt(1)) != spinner) {
                        int i49 = c;
                        int i50 = i49 & 37;
                        int i51 = (i50 - (~((i49 ^ 37) | i50))) - 1;
                        d = i51 % 128;
                        if (i51 % 2 != 0) {
                            boolean z6 = b4 instanceof ae;
                            throw null;
                        }
                        if (!(!(b4 instanceof ae)) && b4.d == b.d) {
                            int i52 = c;
                            int i53 = i52 & 83;
                            int i54 = (i52 ^ 83) | i53;
                            int i55 = (i53 & i54) + (i54 | i53);
                            d = i55 % 128;
                            int i56 = i55 % 2;
                            setDataPersonInLayoutTag(b, b3);
                            int i57 = c + 66;
                            int i58 = (i57 ^ (-1)) + (i57 << 1);
                            d = i58 % 128;
                            int i59 = i58 % 2;
                        }
                    }
                }
            }
            i10++;
            int i60 = c;
            int i61 = (i60 & 26) + (i60 | 26);
            int i62 = (i61 ^ (-1)) + (i61 << 1);
            d = i62 % 128;
            int i63 = i62 % 2;
        }
        int i64 = d;
        int i65 = (i64 ^ 1) + ((i64 & 1) << 1);
        c = i65 % 128;
        int i66 = i65 % 2;
    }

    private void enableMaleFromFatherListOnSpouseChanged(View view, Spinner spinner, B b, B b2, B b3, List<B> list, int i, B b4) {
        View childAt;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = d;
        int i6 = ((i5 | 3) << 1) - (i5 ^ 3);
        c = i6 % 128;
        if (i6 % 2 == 0) {
            childAt = ((ScrollView) view).getChildAt(0);
            i2 = 1;
        } else {
            childAt = ((ScrollView) view).getChildAt(0);
            i2 = 0;
        }
        LinearLayout linearLayout = (LinearLayout) childAt;
        int i7 = c;
        int i8 = i7 & 105;
        int i9 = (i7 ^ 105) | i8;
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        d = i10 % 128;
        int i11 = i10 % 2;
        while (true) {
            Object obj = null;
            if (i2 >= linearLayout.getChildCount()) {
                int i12 = d + 15;
                c = i12 % 128;
                if (i12 % 2 == 0) {
                    throw null;
                }
                return;
            }
            int i13 = d;
            int i14 = ((i13 | 70) << 1) - (i13 ^ 70);
            int i15 = (i14 ^ (-1)) + (i14 << 1);
            c = i15 % 128;
            int i16 = i15 % 2;
            LinearLayout linearLayout2 = (LinearLayout) linearLayout.getChildAt(i2);
            Object tag = linearLayout2.getTag();
            int i17 = d + 99;
            c = i17 % 128;
            int i18 = i17 % 2;
            Spinner spinner2 = (Spinner) linearLayout2.getChildAt(2);
            int i19 = c;
            int i20 = i19 & 35;
            int i21 = (i20 - (~((i19 ^ 35) | i20))) - 1;
            d = i21 % 128;
            int i22 = i21 % 2;
            B b5 = (B) ((LinearLayout) spinner2.getParent()).getTag();
            int i23 = d;
            int i24 = i23 & 125;
            int i25 = ((i23 ^ 125) | i24) << 1;
            int i26 = -((i23 | 125) & (~i24));
            int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
            c = i27 % 128;
            if (i27 % 2 == 0) {
                ArrayList<B> arrayList = ((af) spinner2.getAdapter()).d;
                obj.hashCode();
                throw null;
            }
            ArrayList<B> arrayList2 = ((af) spinner2.getAdapter()).d;
            if (b2 != null && (i3 = b2.d) >= 0) {
                int i28 = c;
                int i29 = ((i28 ^ 38) + ((i28 & 38) << 1)) - 1;
                d = i29 % 128;
                int i30 = i29 % 2;
                if (b5.d == i3) {
                    int i31 = d + 47;
                    c = i31 % 128;
                    int i32 = i31 % 2;
                    af afVar = (af) spinner2.getAdapter();
                    int iIndexOf = arrayList2.indexOf(b4);
                    int i33 = c;
                    int i34 = i33 & 23;
                    int i35 = (i34 - (~((i33 ^ 23) | i34))) - 1;
                    d = i35 % 128;
                    if (i35 % 2 != 0) {
                        afVar.d(iIndexOf, false);
                    } else {
                        afVar.d(iIndexOf, true);
                    }
                    int i36 = d;
                    int i37 = ((i36 | 5) << 1) - (i36 ^ 5);
                    c = i37 % 128;
                    int i38 = i37 % 2;
                }
            }
            int i39 = i2 & 126;
            int i40 = i39 + ((i2 ^ 126) | i39);
            int i41 = i40 & (-125);
            int i42 = ((i40 ^ (-125)) | i41) << 1;
            int i43 = -((i40 | (-125)) & (~i41));
            i2 = (i42 | i43) + (i42 & i43);
            int i44 = d;
            int i45 = i44 & 87;
            int i46 = i45 + ((i44 ^ 87) | i45);
            c = i46 % 128;
            int i47 = i46 % 2;
        }
    }

    private void setDataPersonInLayoutTag(B b, B b2) {
        int i = 2 % 2;
        int i2 = c;
        int i3 = ((i2 & 92) + (i2 | 92)) - 1;
        d = i3 % 128;
        int i4 = i3 % 2;
        try {
            ae aeVar = (ae) b;
            F f = (F) b2;
            int i5 = i2 & 101;
            int i6 = i5 + ((i2 ^ 101) | i5);
            d = i6 % 128;
            int i7 = i6 % 2;
            aeVar.a = f;
            int i8 = d;
            int i9 = i8 & 1;
            int i10 = ((((i8 ^ 1) | i9) << 1) - (~(-((i8 | 1) & (~i9))))) - 1;
            c = i10 % 128;
            if (i10 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Exception unused) {
            Toast.makeText(getActivity(), "Something seriously went wrong please check", 0).show();
        }
    }

    private void setToDefaultIfFemaleSet(View view, Spinner spinner, B b, B b2, B b3, List<B> list, int i) {
        LinearLayout linearLayout;
        int i2;
        int i3 = 2 % 2;
        int i4 = d;
        int i5 = ((i4 ^ 45) | (i4 & 45)) << 1;
        int i6 = -(((~i4) & 45) | (i4 & (-46)));
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        c = i7 % 128;
        if (i7 % 2 == 0) {
            linearLayout = (LinearLayout) ((ScrollView) view).getChildAt(1);
            i2 = 1;
        } else {
            linearLayout = (LinearLayout) ((ScrollView) view).getChildAt(0);
            i2 = 0;
        }
        int i8 = d;
        int i9 = i8 & 119;
        int i10 = (i8 | 119) & (~i9);
        int i11 = i9 << 1;
        int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
        c = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 5 / 5;
        }
        while (i2 < linearLayout.getChildCount()) {
            int i14 = c;
            int i15 = (((i14 | 82) << 1) - (i14 ^ 82)) - 1;
            d = i15 % 128;
            Object obj = null;
            if (i15 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            LinearLayout linearLayout2 = (LinearLayout) linearLayout.getChildAt(i2);
            int i16 = c + 65;
            d = i16 % 128;
            int i17 = i16 % 2;
            View childAt = linearLayout2.getChildAt(1);
            int i18 = d;
            int i19 = ((i18 & 6) + (i18 | 6)) - 1;
            c = i19 % 128;
            int i20 = i19 % 2;
            Spinner spinner2 = (Spinner) childAt;
            LinearLayout linearLayout3 = (LinearLayout) spinner2.getParent();
            int i21 = d;
            int i22 = (-2) - (((i21 & 60) + (i21 | 60)) ^ (-1));
            c = i22 % 128;
            if (i22 % 2 == 0) {
                spinner2.getSelectedItem();
                throw null;
            }
            B b4 = (B) linearLayout3.getTag();
            Object selectedItem = spinner2.getSelectedItem();
            int i23 = c;
            int i24 = i23 & 1;
            int i25 = -(-((i23 ^ 1) | i24));
            int i26 = (i24 & i25) + (i25 | i24);
            d = i26 % 128;
            B b5 = (B) selectedItem;
            if (i26 % 2 != 0) {
                throw null;
            }
            if (b2 != null && b2.d == b4.d) {
                int i27 = c;
                int i28 = i27 & 25;
                int i29 = ((i27 | 25) & (~i28)) + (i28 << 1);
                d = i29 % 128;
                if (i29 % 2 != 0) {
                    int i30 = b5.d;
                    int i31 = b3.d;
                    obj.hashCode();
                    throw null;
                }
                if (b5.d == b3.d) {
                    int i32 = d + 33;
                    c = i32 % 128;
                    int i33 = i32 % 2;
                    spinner2.setSelection(0);
                }
            }
            i2 = (((i2 | 1) << 1) - (~(-(i2 ^ 1)))) - 1;
            int i34 = d;
            int i35 = ((i34 | 109) << 1) - (i34 ^ 109);
            c = i35 % 128;
            int i36 = i35 % 2;
        }
        int i37 = c;
        int i38 = i37 & 61;
        int i39 = (i38 - (~(-(-((i37 ^ 61) | i38))))) - 1;
        d = i39 % 128;
        int i40 = i39 % 2;
    }

    private void updateMaleListOnWifeSelected(View view, B b, B b2, Spinner spinner, B b3) {
        Object tag;
        int i = 2 % 2;
        int i2 = d;
        int i3 = (((i2 | 30) << 1) - (i2 ^ 30)) - 1;
        c = i3 % 128;
        int i4 = i3 % 2;
        LinearLayout linearLayout = (LinearLayout) ((ScrollView) view).getChildAt(0);
        int i5 = d;
        int i6 = ((i5 ^ 109) - (~((i5 & 109) << 1))) - 1;
        c = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 4 / 2;
        }
        int i8 = 0;
        while (i8 < linearLayout.getChildCount()) {
            int i9 = d;
            int i10 = (((i9 | 22) << 1) - (i9 ^ 22)) - 1;
            c = i10 % 128;
            int i11 = i10 % 2;
            LinearLayout linearLayout2 = (LinearLayout) linearLayout.getChildAt(i8);
            int i12 = d;
            int i13 = i12 & 7;
            int i14 = ((i12 ^ 7) | i13) << 1;
            int i15 = -((i12 | 7) & (~i13));
            int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
            c = i16 % 128;
            if (i16 % 2 == 0) {
                tag = ((LinearLayout) ((Spinner) linearLayout2.getChildAt(1)).getParent()).getTag();
                int i17 = 48 / 0;
            } else {
                tag = ((LinearLayout) ((Spinner) linearLayout2.getChildAt(1)).getParent()).getTag();
            }
            int i18 = c;
            int i19 = i18 & 3;
            int i20 = (i18 ^ 3) | i19;
            int i21 = (i19 & i20) + (i19 | i20);
            d = i21 % 128;
            Object obj = null;
            if (i21 % 2 != 0) {
                boolean z = b instanceof F;
                obj.hashCode();
                throw null;
            }
            B b4 = (B) tag;
            if (b instanceof F) {
                int i22 = i18 + 43;
                d = i22 % 128;
                int i23 = i22 % 2;
                if (!(b2 instanceof ae)) {
                    continue;
                } else {
                    int i24 = ((i18 | 61) << 1) - (i18 ^ 61);
                    d = i24 % 128;
                    int i25 = i24 % 2;
                    if (b4 instanceof F) {
                        int i26 = (i18 | 105) << 1;
                        int i27 = -(((~i18) & 105) | (i18 & (-106)));
                        int i28 = ((i26 | i27) << 1) - (i26 ^ i27);
                        d = i28 % 128;
                        Spinner spinner2 = (Spinner) (i28 % 2 != 0 ? linearLayout2.getChildAt(0) : linearLayout2.getChildAt(1));
                        int i29 = c;
                        int i30 = (i29 & 93) + (i29 | 93);
                        d = i30 % 128;
                        if (i30 % 2 != 0) {
                            disableSelectedSpouseFromMaleList(view, b, b2, b4, spinner2, spinner, b3);
                            throw null;
                        }
                        disableSelectedSpouseFromMaleList(view, b, b2, b4, spinner2, spinner, b3);
                    } else {
                        continue;
                    }
                }
            }
            i8 = (((i8 | 2) << 1) - (i8 ^ 2)) - 1;
            int i31 = d;
            int i32 = i31 & 71;
            int i33 = (((i31 ^ 71) | i32) << 1) - ((i31 | 71) & (~i32));
            c = i33 % 128;
            int i34 = i33 % 2;
        }
        int i35 = d;
        int i36 = ((i35 & 92) + (i35 | 92)) - 1;
        c = i36 % 128;
        if (i36 % 2 == 0) {
            int i37 = 40 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0056  */
    /* JADX WARN: Code duplicated, block: B:13:0x0066  */
    /* JADX WARN: Code duplicated, block: B:14:0x0083  */
    private void disableFatherFromSpouseList(LinearLayout linearLayout, B b, B b2) {
        int i;
        int i2 = 2 % 2;
        int i3 = d;
        int i4 = (i3 & 125) + (i3 | 125);
        c = i4 % 128;
        int i5 = i4 % 2;
        Spinner spinner = (Spinner) linearLayout.getChildAt(1);
        af afVar = (af) spinner.getAdapter();
        int i6 = c;
        int i7 = i6 & 111;
        int i8 = ((i6 ^ 111) | i7) << 1;
        int i9 = -((i6 | 111) & (~i7));
        int i10 = (i8 & i9) + (i9 | i8);
        d = i10 % 128;
        int i11 = i10 % 2;
        ArrayList<B> arrayList = afVar.d;
        if (b2 != null) {
            int i12 = c;
            int i13 = (-2) - (((i12 ^ 24) + ((i12 & 24) << 1)) ^ (-1));
            d = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 57 / 0;
                if (b2.d >= 0) {
                    int i15 = c;
                    i = ((i15 & 14) + (i15 | 14)) - 1;
                    d = i % 128;
                    if (i % 2 == 0) {
                        arrayList.indexOf(b2);
                        throw null;
                    }
                    ((af) spinner.getAdapter()).d(arrayList.indexOf(b2), true);
                    int i16 = d;
                    int i17 = i16 & 43;
                    int i18 = (i17 - (~((i16 ^ 43) | i17))) - 1;
                    c = i18 % 128;
                    int i19 = i18 % 2;
                }
            } else if (b2.d >= 0) {
                int i110 = c;
                i = ((i110 & 14) + (i110 | 14)) - 1;
                d = i % 128;
                if (i % 2 == 0) {
                    arrayList.indexOf(b2);
                    throw null;
                }
                ((af) spinner.getAdapter()).d(arrayList.indexOf(b2), true);
                int i111 = d;
                int i112 = i111 & 43;
                int i113 = (i112 - (~((i111 ^ 43) | i112))) - 1;
                c = i113 % 128;
                int i114 = i113 % 2;
            }
        }
        if (b.d >= 0) {
            int i20 = c;
            int i21 = i20 ^ 91;
            int i22 = ((i20 & 91) | i21) << 1;
            int i23 = -i21;
            int i24 = (i22 ^ i23) + ((i22 & i23) << 1);
            d = i24 % 128;
            int i25 = i24 % 2;
            af afVar2 = (af) spinner.getAdapter();
            int iIndexOf = arrayList.indexOf(b);
            int i26 = d;
            int i27 = (i26 & (-40)) | ((~i26) & 39);
            int i28 = (i26 & 39) << 1;
            int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
            c = i29 % 128;
            if (i29 % 2 == 0) {
                afVar2.d(iIndexOf, false);
            } else {
                afVar2.d(iIndexOf, false);
            }
        }
        int i30 = d + 79;
        c = i30 % 128;
        if (i30 % 2 == 0) {
            int i31 = 66 / 0;
        }
    }

    private void disableSpouseFromMotherList(B b, B b2, Spinner spinner) {
        af afVar;
        int i = 2 % 2;
        int i2 = c;
        int i3 = ((i2 | 113) << 1) - (i2 ^ 113);
        d = i3 % 128;
        int i4 = 3;
        try {
            Spinner spinner2 = (Spinner) (i3 % 2 != 0 ? ((LinearLayout) spinner.getParent()).getChildAt(4) : ((LinearLayout) spinner.getParent()).getChildAt(3));
            int i5 = d;
            int i6 = i5 & 63;
            int i7 = -(-((i5 ^ 63) | i6));
            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
            c = i8 % 128;
            int i9 = i8 % 2;
            B b3 = (B) spinner2.getSelectedItem();
            SpinnerAdapter adapter = spinner2.getAdapter();
            int i10 = d;
            int i11 = i10 & 55;
            int i12 = ((((i10 ^ 55) | i11) << 1) - (~(-((i10 | 55) & (~i11))))) - 1;
            c = i12 % 128;
            Object obj = null;
            try {
                if (i12 % 2 == 0) {
                    ArrayList<B> arrayList = ((af) adapter).d;
                    spinner2.getAdapter();
                    obj.hashCode();
                    throw null;
                }
                ArrayList<B> arrayList2 = ((af) adapter).d;
                ((af) spinner2.getAdapter()).d(arrayList2.indexOf(b), false);
                int i13 = d + 3;
                c = i13 % 128;
                if (i13 % 2 == 0) {
                    ((af) spinner2.getAdapter()).d(arrayList2.indexOf(b2), false);
                } else {
                    ((af) spinner2.getAdapter()).d(arrayList2.indexOf(b2), true);
                }
                int i14 = c;
                int i15 = i14 ^ 25;
                int i16 = (i14 & 25) << 1;
                int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
                d = i17 % 128;
                int i18 = i17 % 2;
                LinearLayout linearLayout = (LinearLayout) ((ScrollView) this.parentView).getChildAt(0);
                int i19 = d;
                int i20 = ((i19 | 68) << 1) - (i19 ^ 68);
                int i21 = (i20 ^ (-1)) + (i20 << 1);
                c = i21 % 128;
                int i22 = i21 % 2;
                int i23 = 0;
                while (i23 < linearLayout.getChildCount()) {
                    int i24 = d;
                    int i25 = i24 & 49;
                    int i26 = (i24 ^ 49) | i25;
                    int i27 = (i25 & i26) + (i26 | i25);
                    c = i27 % 128;
                    int i28 = i27 % 2;
                    LinearLayout linearLayout2 = (LinearLayout) linearLayout.getChildAt(i23);
                    Object tag = linearLayout2.getTag();
                    int i29 = d;
                    int i30 = ((i29 ^ 26) + ((i29 & 26) << 1)) - 1;
                    c = i30 % 128;
                    int i31 = i30 % 2;
                    Spinner spinner3 = (Spinner) linearLayout2.getChildAt(i4);
                    int i32 = d;
                    int i33 = (i32 & 25) + (i32 | 25);
                    c = i33 % 128;
                    if (i33 % 2 == 0) {
                        throw null;
                    }
                    B b4 = (B) ((LinearLayout) spinner3.getParent()).getTag();
                    ArrayList<B> arrayList3 = ((af) spinner3.getAdapter()).d;
                    int i34 = d;
                    int i35 = ((i34 | 113) << 1) - (i34 ^ 113);
                    c = i35 % 128;
                    int i36 = i35 % 2;
                    int i37 = b.d;
                    if (i37 >= 0) {
                        int i38 = d + 112;
                        int i39 = (i38 ^ (-1)) + (i38 << 1);
                        c = i39 % 128;
                        int i40 = i39 % 2;
                        if (b4.d == i37) {
                            int i41 = c;
                            int i42 = i41 & 53;
                            int i43 = ((i41 ^ 53) | i42) << 1;
                            int i44 = -((i41 | 53) & (~i42));
                            int i45 = ((i43 | i44) << 1) - (i44 ^ i43);
                            d = i45 % 128;
                            if (i45 % 2 != 0) {
                                afVar = (af) spinner3.getAdapter();
                                int i46 = 59 / 0;
                            } else {
                                afVar = (af) spinner3.getAdapter();
                            }
                            int i47 = d;
                            int i48 = i47 & 25;
                            int i49 = -(-((i47 ^ 25) | i48));
                            int i50 = (i48 & i49) + (i49 | i48);
                            c = i50 % 128;
                            int i51 = i50 % 2;
                            afVar.d(arrayList3.indexOf(b3), false);
                            int i52 = d;
                            int i53 = (i52 ^ 75) + ((i52 & 75) << 1);
                            c = i53 % 128;
                            int i54 = i53 % 2;
                        }
                    }
                    if (b2 != null) {
                        int i55 = c;
                        int i56 = (i55 ^ 81) + ((i55 & 81) << 1);
                        d = i56 % 128;
                        if (i56 % 2 != 0) {
                            int i57 = b2.d;
                            obj.hashCode();
                            throw null;
                        }
                        int i58 = b2.d;
                        if (i58 >= 0 && b4.d == i58) {
                            int i59 = c;
                            int i60 = ((i59 ^ 9) | (i59 & 9)) << 1;
                            int i61 = -(((~i59) & 9) | (i59 & (-10)));
                            int i62 = (i60 & i61) + (i61 | i60);
                            d = i62 % 128;
                            if (i62 % 2 != 0) {
                                arrayList3.indexOf(b3);
                                obj.hashCode();
                                throw null;
                            }
                            af afVar2 = (af) spinner3.getAdapter();
                            int iIndexOf = arrayList3.indexOf(b3);
                            int i63 = c;
                            int i64 = ((i63 ^ 122) + ((i63 & 122) << 1)) - 1;
                            d = i64 % 128;
                            int i65 = i64 % 2;
                            afVar2.d(iIndexOf, true);
                            int i66 = c;
                            int i67 = i66 & 53;
                            int i68 = (i67 - (~(-(-((i66 ^ 53) | i67))))) - 1;
                            d = i68 % 128;
                            int i69 = i68 % 2;
                        }
                    }
                    i23++;
                    int i70 = d + 30;
                    int i71 = (i70 ^ (-1)) + (i70 << 1);
                    c = i71 % 128;
                    if (i71 % 2 == 0) {
                        int i72 = 2 / 5;
                    }
                    i4 = 3;
                }
                int i73 = d;
                int i74 = ((i73 ^ 19) | (i73 & 19)) << 1;
                int i75 = -(((~i73) & 19) | (i73 & (-20)));
                int i76 = (i74 & i75) + (i75 | i74);
                c = i76 % 128;
                int i77 = i76 % 2;
            } catch (Exception unused) {
                Toast.makeText(getActivity(), "Something seriously went wrong please check", 0).show();
            }
        } catch (Exception unused2) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00db  */
    private boolean checkIfToEnableFemaleFromAllOtherMaleList(View view, B b, B b2) {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 ^ 101;
        int i4 = (((i2 & 101) | i3) << 1) - i3;
        c = i4 % 128;
        int i5 = i4 % 2;
        LinearLayout linearLayout = (LinearLayout) ((ScrollView) view).getChildAt(0);
        int i6 = c;
        int i7 = i6 ^ 109;
        int i8 = ((((i6 & 109) | i7) << 1) - (~(-i7))) - 1;
        int i9 = i8 % 128;
        d = i9;
        int i10 = i8 % 2;
        int i11 = (-2) - ((i9 + 126) ^ (-1));
        c = i11 % 128;
        int i12 = i11 % 2;
        int i13 = 0;
        boolean z = true;
        while (i13 < linearLayout.getChildCount()) {
            int i14 = c;
            int i15 = (i14 & 29) + (i14 | 29);
            d = i15 % 128;
            if (i15 % 2 != 0) {
                throw null;
            }
            LinearLayout linearLayout2 = (LinearLayout) linearLayout.getChildAt(i13);
            int i16 = c + 59;
            d = i16 % 128;
            int i17 = i16 % 2;
            B b3 = (B) ((Spinner) linearLayout2.getChildAt(1)).getSelectedItem();
            int i18 = d;
            int i19 = i18 & 3;
            int i20 = ((i18 | 3) & (~i19)) + (i19 << 1);
            c = i20 % 128;
            int i21 = i20 % 2;
            B b4 = (B) linearLayout2.getTag();
            int i22 = d;
            int i23 = (i22 & 71) + (i22 | 71);
            c = i23 % 128;
            int i24 = i23 % 2;
            if (b != null) {
                int i25 = i22 + 59;
                c = i25 % 128;
                int i26 = i25 % 2;
                int i27 = b.d;
                if (i27 > 0) {
                    int i28 = c;
                    int i29 = i28 & 115;
                    int i30 = ((i28 ^ 115) | i29) << 1;
                    int i31 = -((i28 | 115) & (~i29));
                    int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
                    d = i32 % 128;
                    int i33 = i32 % 2;
                    if (b4.d == i27) {
                        int i34 = c;
                        int i35 = ((((i34 ^ 49) | (i34 & 49)) << 1) - (~(-(((~i34) & 49) | (i34 & (-50)))))) - 1;
                        d = i35 % 128;
                        if (i35 % 2 != 0) {
                            int i36 = 90 / 0;
                            if (b3.d == b2.d) {
                                int i37 = d;
                                int i38 = i37 & 7;
                                int i39 = i38 + ((i37 ^ 7) | i38);
                                c = i39 % 128;
                                int i40 = i39 % 2;
                                z = false;
                            }
                        } else if (b3.d == b2.d) {
                            int i310 = d;
                            int i311 = i310 & 7;
                            int i312 = i311 + ((i310 ^ 7) | i311);
                            c = i312 % 128;
                            int i41 = i312 % 2;
                            z = false;
                        }
                    }
                }
            }
            int i42 = i13 & (-39);
            int i43 = i42 + ((i13 ^ (-39)) | i42);
            int i44 = i43 & 40;
            i13 = ((((i43 ^ 40) | i44) << 1) - (~(-((i43 | 40) & (~i44))))) - 1;
            int i45 = c;
            int i46 = (i45 & (-42)) | ((~i45) & 41);
            int i47 = (i45 & 41) << 1;
            int i48 = (i46 ^ i47) + ((i47 & i46) << 1);
            d = i48 % 128;
            int i49 = i48 % 2;
        }
        int i50 = c;
        int i51 = i50 & 73;
        int i52 = i51 + ((i50 ^ 73) | i51);
        d = i52 % 128;
        if (i52 % 2 != 0) {
            int i53 = 24 / 0;
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00b4 A[PHI: r12
  0x00b4: PHI (r12v9 int) = (r12v8 int), (r12v35 int) binds: [B:17:0x00b2, B:14:0x00ad] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:22:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:23:0x00df  */
    /* JADX WARN: Code duplicated, block: B:40:0x0193  */
    private void disableSpouseFromHusbandsMotherList(View view, Spinner spinner, B b, B b2, B b3, List<B> list, int i, B b4) {
        B b5;
        ArrayList<B> arrayList;
        int i2;
        int i3;
        af afVar;
        int iIndexOf;
        SpinnerAdapter adapter;
        int i4 = 2 % 2;
        int i5 = (-2) - ((c + 80) ^ (-1));
        d = i5 % 128;
        int i6 = i5 % 2;
        LinearLayout linearLayout = (LinearLayout) ((ScrollView) view).getChildAt(0);
        int i7 = c;
        int i8 = i7 & 13;
        int i9 = ((i7 ^ 13) | i8) << 1;
        int i10 = -((i7 | 13) & (~i8));
        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
        d = i11 % 128;
        int i12 = i11 % 2;
        int i13 = 0;
        while (true) {
            Object obj = null;
            if (i13 >= linearLayout.getChildCount()) {
                int i14 = c;
                int i15 = ((i14 ^ 35) - (~(-(-((i14 & 35) << 1))))) - 1;
                d = i15 % 128;
                if (i15 % 2 != 0) {
                    throw null;
                }
                return;
            }
            int i16 = (-2) - ((d + 54) ^ (-1));
            c = i16 % 128;
            if (i16 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            LinearLayout linearLayout2 = (LinearLayout) linearLayout.getChildAt(i13);
            Spinner spinner2 = (Spinner) linearLayout2.getChildAt(3);
            LinearLayout linearLayout3 = (LinearLayout) spinner2.getParent();
            int i17 = c + 111;
            d = i17 % 128;
            if (i17 % 2 != 0) {
                b5 = (B) linearLayout3.getTag();
                arrayList = ((af) spinner2.getAdapter()).d;
                int i18 = 95 / 0;
            } else {
                b5 = (B) linearLayout3.getTag();
                arrayList = ((af) spinner2.getAdapter()).d;
            }
            int i19 = d;
            int i20 = i19 ^ 11;
            int i21 = ((((i19 & 11) | i20) << 1) - (~(-i20))) - 1;
            c = i21 % 128;
            if (i21 % 2 == 0) {
                i2 = b.d;
                int i22 = 25 / 0;
                if (i2 >= 0) {
                    int i23 = d + 39;
                    c = i23 % 128;
                    int i24 = i23 % 2;
                    if (b5.d == i2) {
                        i3 = (-2) - ((d + 96) ^ (-1));
                        c = i3 % 128;
                        if (i3 % 2 == 0) {
                            afVar = (af) spinner2.getAdapter();
                            iIndexOf = arrayList.indexOf(b3);
                            int i25 = 91 / 0;
                        } else {
                            afVar = (af) spinner2.getAdapter();
                            iIndexOf = arrayList.indexOf(b3);
                        }
                        int i26 = c;
                        int i27 = i26 & 59;
                        int i28 = -(-((i26 ^ 59) | i27));
                        int i29 = (i27 & i28) + (i28 | i27);
                        d = i29 % 128;
                        int i30 = i29 % 2;
                        afVar.d(iIndexOf, false);
                        int i31 = c;
                        int i32 = (i31 & 73) + (i31 | 73);
                        d = i32 % 128;
                        int i33 = i32 % 2;
                    }
                }
            } else {
                i2 = b.d;
                if (i2 >= 0) {
                    int i210 = d + 39;
                    c = i210 % 128;
                    int i211 = i210 % 2;
                    if (b5.d == i2) {
                        i3 = (-2) - ((d + 96) ^ (-1));
                        c = i3 % 128;
                        if (i3 % 2 == 0) {
                            afVar = (af) spinner2.getAdapter();
                            iIndexOf = arrayList.indexOf(b3);
                            int i212 = 91 / 0;
                        } else {
                            afVar = (af) spinner2.getAdapter();
                            iIndexOf = arrayList.indexOf(b3);
                        }
                        int i213 = c;
                        int i214 = i213 & 59;
                        int i215 = -(-((i213 ^ 59) | i214));
                        int i216 = (i214 & i215) + (i215 | i214);
                        d = i216 % 128;
                        int i34 = i216 % 2;
                        afVar.d(iIndexOf, false);
                        int i35 = c;
                        int i36 = (i35 & 73) + (i35 | 73);
                        d = i36 % 128;
                        int i37 = i36 % 2;
                    }
                }
            }
            if (b2 != null) {
                int i38 = c;
                int i39 = (-2) - (((i38 ^ 96) + ((i38 & 96) << 1)) ^ (-1));
                d = i39 % 128;
                int i40 = i39 % 2;
                int i41 = b2.d;
                if (i41 >= 0) {
                    int i42 = c;
                    int i43 = ((i42 | 75) << 1) - (i42 ^ 75);
                    d = i43 % 128;
                    if (i43 % 2 != 0) {
                        int i44 = b5.d;
                        obj.hashCode();
                        throw null;
                    }
                    if (b5.d == i41) {
                        int i45 = c;
                        int i46 = i45 & 47;
                        int i47 = i46 + ((i45 ^ 47) | i46);
                        d = i47 % 128;
                        int i48 = i47 % 2;
                        af afVar2 = (af) spinner2.getAdapter();
                        int iIndexOf2 = arrayList.indexOf(b3);
                        int i49 = c;
                        int i50 = (((i49 | 66) << 1) - (i49 ^ 66)) - 1;
                        d = i50 % 128;
                        if (i50 % 2 != 0) {
                            afVar2.d(iIndexOf2, true);
                            adapter = spinner2.getAdapter();
                        } else {
                            afVar2.d(iIndexOf2, true);
                            adapter = spinner2.getAdapter();
                        }
                        ((af) adapter).d(arrayList.indexOf(b4), true);
                        int i51 = c;
                        int i52 = i51 & 85;
                        int i53 = (i51 | 85) & (~i52);
                        int i54 = i52 << 1;
                        int i55 = (i53 ^ i54) + ((i53 & i54) << 1);
                        d = i55 % 128;
                        int i56 = i55 % 2;
                    }
                }
            }
            int i57 = ((i13 ^ 1) | (i13 & 1)) << 1;
            int i58 = -(((~i13) & 1) | (i13 & OPTION_NOT_ALIVE_ID));
            i13 = ((i58 & i57) << 1) + (i57 ^ i58);
            int i59 = d;
            int i60 = i59 & 65;
            int i61 = (i59 | 65) & (~i60);
            int i62 = i60 << 1;
            int i63 = (i61 ^ i62) + ((i61 & i62) << 1);
            c = i63 % 128;
            int i64 = i63 % 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00df A[SYNTHETIC] */
    private void changeSpouseToDefault(View view, B b, B b2, B b3) {
        int i = 2 % 2;
        int i2 = d;
        int i3 = (i2 & 29) + (i2 | 29);
        c = i3 % 128;
        int i4 = i3 % 2;
        LinearLayout linearLayout = (LinearLayout) ((ScrollView) view).getChildAt(0);
        int i5 = c;
        int i6 = i5 & 89;
        int i7 = ((~i6) & (i5 | 89)) + (i6 << 1);
        d = i7 % 128;
        int i8 = i7 % 2;
        int i9 = i5 + 87;
        d = i9 % 128;
        int i10 = i9 % 2;
        int i11 = 0;
        while (true) {
            Object obj = null;
            if (i11 >= linearLayout.getChildCount()) {
                int i12 = c + 55;
                d = i12 % 128;
                if (i12 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            int i13 = d + 85;
            c = i13 % 128;
            int i14 = i13 % 2;
            LinearLayout linearLayout2 = (LinearLayout) linearLayout.getChildAt(i11);
            int i15 = d;
            int i16 = ((i15 | 9) << 1) - (i15 ^ 9);
            c = i16 % 128;
            int i17 = i16 % 2;
            Spinner spinner = (Spinner) linearLayout2.getChildAt(1);
            ViewParent parent = spinner.getParent();
            int i18 = d;
            int i19 = i18 & 17;
            int i20 = (i18 | 17) & (~i19);
            int i21 = -(-(i19 << 1));
            int i22 = ((i20 | i21) << 1) - (i20 ^ i21);
            c = i22 % 128;
            if (i22 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            LinearLayout linearLayout3 = (LinearLayout) parent;
            B b4 = (B) linearLayout3.getTag();
            int i23 = d;
            int i24 = (i23 & (-32)) | ((~i23) & 31);
            int i25 = (i23 & 31) << 1;
            int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
            c = i26 % 128;
            if (i26 % 2 == 0) {
                throw null;
            }
            B b5 = (B) linearLayout3.getTag();
            if (b != null) {
                int i27 = d;
                int i28 = i27 & 47;
                int i29 = (i27 | 47) & (~i28);
                int i30 = i28 << 1;
                int i31 = (i29 ^ i30) + ((i29 & i30) << 1);
                c = i31 % 128;
                if (i31 % 2 == 0) {
                    int i32 = 99 / 0;
                    if (b4.d != b.d) {
                        continue;
                    } else if (b5.d >= 0) {
                        int i33 = c;
                        int i34 = (-2) - ((((i33 | 116) << 1) - (i33 ^ 116)) ^ (-1));
                        d = i34 % 128;
                        int i35 = i34 % 2;
                        spinner.setSelection(0);
                        setSpouseWife(view, b, b2, b3);
                        return;
                    }
                } else if (b4.d != b.d) {
                    continue;
                } else if (b5.d >= 0) {
                    int i36 = c;
                    int i37 = (-2) - ((((i36 | 116) << 1) - (i36 ^ 116)) ^ (-1));
                    d = i37 % 128;
                    int i38 = i37 % 2;
                    spinner.setSelection(0);
                    setSpouseWife(view, b, b2, b3);
                    return;
                }
            }
            int i39 = ((i11 ^ 1) | (i11 & 1)) << 1;
            int i40 = -(((~i11) & 1) | (i11 & OPTION_NOT_ALIVE_ID));
            i11 = ((i39 | i40) << 1) - (i40 ^ i39);
            int i41 = c;
            int i42 = (i41 & 71) + (i41 | 71);
            d = i42 % 128;
            int i43 = i42 % 2;
        }
    }

    private void disableMotherFromDaughter(View view, B b, B b2, B b3) {
        LinearLayout linearLayout;
        Object tag;
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 & 33;
        int i4 = i3 + ((i2 ^ 33) | i3);
        c = i4 % 128;
        LinearLayout linearLayout2 = (LinearLayout) (i4 % 2 == 0 ? ((ScrollView) view).getChildAt(1) : ((ScrollView) view).getChildAt(0));
        int i5 = d;
        int i6 = i5 ^ 113;
        int i7 = ((i5 & 113) | i6) << 1;
        int i8 = -i6;
        int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
        c = i9 % 128;
        int i10 = i9 % 2;
        int i11 = 0;
        while (i11 < linearLayout2.getChildCount()) {
            int i12 = d;
            int i13 = ((i12 | 57) << 1) - (i12 ^ 57);
            c = i13 % 128;
            if (i13 % 2 == 0) {
                linearLayout = (LinearLayout) linearLayout2.getChildAt(i11);
                tag = linearLayout.getTag();
                int i14 = 18 / 0;
            } else {
                linearLayout = (LinearLayout) linearLayout2.getChildAt(i11);
                tag = linearLayout.getTag();
            }
            int i15 = c;
            int i16 = (i15 & (-96)) | ((~i15) & 95);
            int i17 = -(-((i15 & 95) << 1));
            int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
            d = i18 % 128;
            int i19 = i18 % 2;
            B b4 = (B) tag;
            Spinner spinner = (Spinner) linearLayout.getChildAt(3);
            int i20 = d;
            int i21 = i20 ^ 115;
            int i22 = (((i20 & 115) | i21) << 1) - i21;
            c = i22 % 128;
            if (i22 % 2 == 0) {
                throw null;
            }
            int i23 = c + 31;
            d = i23 % 128;
            int i24 = i23 % 2;
            ArrayList<B> arrayList = ((af) spinner.getAdapter()).d;
            int i25 = d + 117;
            c = i25 % 128;
            if (i25 % 2 == 0) {
                int i26 = b4.d;
                int i27 = b.d;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i28 = b4.d;
            int i29 = b.d;
            int i30 = c;
            int i31 = i30 & 41;
            int i32 = (i31 - (~((i30 ^ 41) | i31))) - 1;
            int i33 = i32 % 128;
            d = i33;
            int i34 = i32 % 2;
            if (i28 == i29) {
                int i35 = (i33 ^ 57) + ((i33 & 57) << 1);
                c = i35 % 128;
                if (i35 % 2 == 0) {
                    throw null;
                }
                if (i29 != -1) {
                    af afVar = (af) spinner.getAdapter();
                    int iIndexOf = arrayList.indexOf(b3);
                    int i36 = d;
                    int i37 = i36 & 85;
                    int i38 = ((((i36 ^ 85) | i37) << 1) - (~(-((i36 | 85) & (~i37))))) - 1;
                    c = i38 % 128;
                    int i39 = i38 % 2;
                    afVar.d(iIndexOf, false);
                    int i40 = d;
                    int i41 = i40 & 41;
                    int i42 = i41 + ((i40 ^ 41) | i41);
                    c = i42 % 128;
                    int i43 = i42 % 2;
                }
            }
            if (b2 != null) {
                int i44 = c;
                int i45 = i44 & 29;
                int i46 = i45 + ((i44 ^ 29) | i45);
                d = i46 % 128;
                if (i46 % 2 != 0) {
                    int i47 = b4.d;
                    int i48 = b2.d;
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                if (b4.d == b2.d) {
                    af afVar2 = (af) spinner.getAdapter();
                    int iIndexOf2 = arrayList.indexOf(b3);
                    int i49 = d;
                    int i50 = i49 ^ 59;
                    int i51 = (i49 & 59) << 1;
                    int i52 = (i50 ^ i51) + ((i51 & i50) << 1);
                    c = i52 % 128;
                    int i53 = i52 % 2;
                    afVar2.d(iIndexOf2, true);
                    int i54 = c;
                    int i55 = i54 & 61;
                    int i56 = -(-((i54 ^ 61) | i55));
                    int i57 = (i55 ^ i56) + ((i56 & i55) << 1);
                    d = i57 % 128;
                    int i58 = i57 % 2;
                }
            }
            int i59 = (((i11 | 129) << 1) - (i11 ^ 129)) - 127;
            i11 = (i59 ^ (-1)) + (i59 << 1);
            int i60 = c;
            int i61 = ((i60 & (-10)) | ((~i60) & 9)) + ((i60 & 9) << 1);
            d = i61 % 128;
            int i62 = i61 % 2;
        }
        int i63 = c;
        int i64 = (((i63 | 68) << 1) - (i63 ^ 68)) - 1;
        d = i64 % 128;
        if (i64 % 2 != 0) {
            int i65 = 24 / 0;
        }
    }

    private void updateSelectedSpouseFatherList(B b, B b2, Spinner spinner) {
        Spinner spinner2;
        af afVar;
        af afVar2;
        int iIndexOf;
        int i = 2 % 2;
        int i2 = c;
        int i3 = (((i2 ^ 93) | (i2 & 93)) << 1) - (((~i2) & 93) | (i2 & (-94)));
        d = i3 % 128;
        int i4 = i3 % 2;
        try {
            View childAt = ((LinearLayout) spinner.getParent()).getChildAt(2);
            int i5 = c + 119;
            d = i5 % 128;
            if (i5 % 2 != 0) {
                spinner2 = (Spinner) childAt;
                afVar = (af) spinner2.getAdapter();
                int i6 = 72 / 0;
            } else {
                spinner2 = (Spinner) childAt;
                afVar = (af) spinner2.getAdapter();
            }
            ArrayList<B> arrayList = afVar.d;
            SpinnerAdapter adapter = spinner2.getAdapter();
            int i7 = c;
            int i8 = i7 ^ 77;
            int i9 = (i7 & 77) << 1;
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            d = i10 % 128;
            if (i10 % 2 != 0) {
                afVar2 = (af) adapter;
                iIndexOf = arrayList.indexOf(b);
                int i11 = 5 / 0;
            } else {
                afVar2 = (af) adapter;
                iIndexOf = arrayList.indexOf(b);
            }
            int i12 = d;
            int i13 = (i12 ^ 117) + ((i12 & 117) << 1);
            c = i13 % 128;
            if (i13 % 2 == 0) {
                afVar2.d(iIndexOf, false);
            } else {
                afVar2.d(iIndexOf, false);
            }
            af afVar3 = (af) spinner2.getAdapter();
            int i14 = c;
            int i15 = i14 & 35;
            int i16 = (i14 ^ 35) | i15;
            int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
            d = i17 % 128;
            int i18 = i17 % 2;
            afVar3.d(arrayList.indexOf(b2), true);
            int i19 = d;
            int i20 = (i19 & 103) + (i19 | 103);
            c = i20 % 128;
            int i21 = i20 % 2;
        } catch (Exception unused) {
            Toast.makeText(getActivity(), "Something seriously went wrong please check", 0).show();
        }
    }

    public boolean isValidDifference(String str, String str2) {
        int i = 2 % 2;
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
            Date date = simpleDateFormat.parse(str);
            int i2 = c;
            int i3 = i2 & 1;
            int i4 = (((i2 | 1) & (~i3)) - (~(-(-(i3 << 1))))) - 1;
            d = i4 % 128;
            if (i4 % 2 != 0) {
                Date date2 = simpleDateFormat.parse(str2);
                date.getTime();
                date2.getTime();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Date date3 = simpleDateFormat.parse(str2);
            if (date.getTime() > date3.getTime()) {
                int i5 = d + 63;
                c = i5 % 128;
                int i6 = i5 % 2;
                boolean zCheckAge = checkAge(calculateAge(date3, date));
                int i7 = d;
                int i8 = (i7 & (-62)) | ((~i7) & 61);
                int i9 = (i7 & 61) << 1;
                int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
                c = i10 % 128;
                int i11 = i10 % 2;
                return zCheckAge;
            }
            boolean zCheckAge2 = checkAge(calculateAge(date, date3));
            int i12 = d;
            int i13 = i12 & 111;
            int i14 = ((i12 ^ 111) | i13) << 1;
            int i15 = -((~i13) & (i12 | 111));
            int i16 = (i14 ^ i15) + ((i14 & i15) << 1);
            c = i16 % 128;
            int i17 = i16 % 2;
            int i18 = ((i12 & (-48)) | ((~i12) & 47)) + ((i12 & 47) << 1);
            c = i18 % 128;
            if (i18 % 2 == 0) {
                int i19 = 78 / 0;
            }
            return zCheckAge2;
        } catch (ParseException unused) {
            return true;
        }
    }

    @Override // android.app.Fragment
    public void onResume() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 & 21;
        int i4 = (i3 - (~(-(-((i2 ^ 21) | i3))))) - 1;
        c = i4 % 128;
        int i5 = i4 % 2;
        if (ag.l) {
            ag.l = false;
            ArrayList<B> arrayList = new ArrayList<>();
            int i6 = d;
            int i7 = (((i6 ^ 125) | (i6 & 125)) << 1) - (((~i6) & 125) | (i6 & (-126)));
            c = i7 % 128;
            int i8 = i7 % 2;
            this.mPersonList = arrayList;
            this.linearLayout.removeAllViews();
            generateDummyData();
            int i9 = c;
            int i10 = i9 & 85;
            int i11 = -(-((i9 ^ 85) | i10));
            int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
            d = i12 % 128;
            int i13 = i12 % 2;
            generateBody();
            if (i13 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i14 = c;
            int i15 = (i14 & 39) + (i14 | 39);
            d = i15 % 128;
            int i16 = i15 % 2;
        }
        super.onResume();
        int i17 = d;
        int i18 = (i17 | 45) << 1;
        int i19 = -(i17 ^ 45);
        int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
        c = i20 % 128;
        if (i20 % 2 == 0) {
            int i21 = 26 / 0;
        }
    }

    private d calculateAge(Date date, Date date2) {
        Q qG;
        C cG;
        int i = 2 % 2;
        z zVar = new z(date);
        z zVar2 = new z(date2);
        int i2 = c;
        int i3 = (i2 ^ 23) + ((i2 & 23) << 1);
        d = i3 % 128;
        if (i3 % 2 != 0) {
            qG = Q.g(zVar, zVar2);
            cG = C.g(zVar, zVar2);
            int i4 = 13 / 0;
        } else {
            qG = Q.g(zVar, zVar2);
            cG = C.g(zVar, zVar2);
        }
        int i5 = c;
        int i6 = i5 ^ 87;
        int i7 = ((i5 & 87) | i6) << 1;
        int i8 = -i6;
        int i9 = (i7 & i8) + (i7 | i8);
        d = i9 % 128;
        if (i9 % 2 != 0) {
            C0245o.g(zVar, zVar2);
            int i10 = cG.c;
            int i11 = qG.c;
            throw null;
        }
        C0245o c0245oG = C0245o.g(zVar, zVar2);
        int i12 = cG.c;
        d dVar = new d(c0245oG.c, qG.c, i12);
        int i13 = c + 7;
        d = i13 % 128;
        if (i13 % 2 == 0) {
            return dVar;
        }
        throw null;
    }

    private void disableMotherFromSpouseList(LinearLayout linearLayout, B b, B b2) {
        int iIndexOf;
        int i = 2 % 2;
        int i2 = d;
        int i3 = ((i2 ^ 39) | (i2 & 39)) << 1;
        int i4 = -(((~i2) & 39) | (i2 & (-40)));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        c = i5 % 128;
        int i6 = i5 % 2;
        Spinner spinner = (Spinner) linearLayout.getChildAt(1);
        af afVar = (af) spinner.getAdapter();
        int i7 = d;
        int i8 = ((i7 ^ 48) + ((i7 & 48) << 1)) - 1;
        c = i8 % 128;
        Object obj = null;
        if (i8 % 2 == 0) {
            ArrayList<B> arrayList = afVar.d;
            obj.hashCode();
            throw null;
        }
        ArrayList<B> arrayList2 = afVar.d;
        if (b2 != null && b2.d >= 0) {
            int i9 = c;
            int i10 = ((i9 | 13) << 1) - (i9 ^ 13);
            d = i10 % 128;
            int i11 = i10 % 2;
            af afVar2 = (af) spinner.getAdapter();
            int iIndexOf2 = arrayList2.indexOf(b2);
            int i12 = c;
            int i13 = ((i12 ^ 68) + ((i12 & 68) << 1)) - 1;
            d = i13 % 128;
            int i14 = i13 % 2;
            afVar2.d(iIndexOf2, true);
            int i15 = d;
            int i16 = (i15 ^ 25) + ((i15 & 25) << 1);
            c = i16 % 128;
            int i17 = i16 % 2;
        }
        if (b.d >= 0) {
            int i18 = d;
            int i19 = i18 & 19;
            int i20 = ((i18 ^ 19) | i19) << 1;
            int i21 = -((i18 | 19) & (~i19));
            int i22 = (i20 & i21) + (i21 | i20);
            c = i22 % 128;
            int i23 = i22 % 2;
            af afVar3 = (af) spinner.getAdapter();
            if (i23 == 0) {
                iIndexOf = arrayList2.indexOf(b);
                int i24 = 17 / 0;
            } else {
                iIndexOf = arrayList2.indexOf(b);
            }
            int i25 = d;
            int i26 = (((i25 | 96) << 1) - (i25 ^ 96)) - 1;
            c = i26 % 128;
            if (i26 % 2 == 0) {
                afVar3.d(iIndexOf, true);
            } else {
                afVar3.d(iIndexOf, false);
            }
        }
        int i27 = d;
        int i28 = i27 & 29;
        int i29 = ((i27 ^ 29) | i28) << 1;
        int i30 = -((i27 | 29) & (~i28));
        int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
        c = i31 % 128;
        if (i31 % 2 == 0) {
            throw null;
        }
    }

    private void disableSpouseFromFathersWifeList(View view, Spinner spinner, B b, B b2, B b3, List<B> list, int i) {
        int i2 = 2 % 2;
        int i3 = c;
        int i4 = i3 ^ 71;
        int i5 = -(-((i3 & 71) << 1));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        d = i6 % 128;
        int i7 = i6 % 2;
        LinearLayout linearLayout = (LinearLayout) ((ScrollView) view).getChildAt(0);
        int i8 = c;
        int i9 = i8 ^ 19;
        int i10 = (((i8 & 19) | i9) << 1) - i9;
        d = i10 % 128;
        int i11 = (i10 % 2 != 0 ? 0 : 1) ^ 1;
        while (i11 < linearLayout.getChildCount()) {
            int i12 = d;
            int i13 = i12 & 9;
            int i14 = -(-((i12 ^ 9) | i13));
            int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
            c = i15 % 128;
            int i16 = i15 % 2;
            LinearLayout linearLayout2 = (LinearLayout) linearLayout.getChildAt(i11);
            int i17 = d;
            int i18 = ((i17 & (-24)) | ((~i17) & 23)) + ((i17 & 23) << 1);
            c = i18 % 128;
            Spinner spinner2 = i18 % 2 == 0 ? (Spinner) linearLayout2.getChildAt(4) : (Spinner) linearLayout2.getChildAt(2);
            LinearLayout linearLayout3 = (LinearLayout) spinner2.getParent();
            int i19 = c;
            int i20 = (i19 & 59) + (i19 | 59);
            d = i20 % 128;
            Object obj = null;
            if (i20 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            B b4 = (B) linearLayout3.getTag();
            ArrayList<B> arrayList = ((af) spinner2.getAdapter()).d;
            int i21 = b.d;
            if (i21 >= 0) {
                int i22 = d;
                int i23 = (((i22 | 58) << 1) - (i22 ^ 58)) - 1;
                c = i23 % 128;
                if (i23 % 2 == 0) {
                    int i24 = b4.d;
                    obj.hashCode();
                    throw null;
                }
                if (b4.d == i21) {
                    af afVar = (af) spinner2.getAdapter();
                    int iIndexOf = arrayList.indexOf(b3);
                    int i25 = d + 29;
                    c = i25 % 128;
                    int i26 = i25 % 2;
                    afVar.d(iIndexOf, false);
                    int i27 = c;
                    int i28 = i27 & 65;
                    int i29 = i28 + ((i27 ^ 65) | i28);
                    d = i29 % 128;
                    int i30 = i29 % 2;
                }
            }
            if (b2 != null) {
                int i31 = c;
                int i32 = ((i31 | 33) << 1) - (i31 ^ 33);
                d = i32 % 128;
                int i33 = i32 % 2;
                int i34 = b2.d;
                if (i34 >= 0) {
                    int i35 = d;
                    int i36 = i35 ^ 65;
                    int i37 = ((i35 & 65) | i36) << 1;
                    int i38 = -i36;
                    int i39 = (i37 & i38) + (i37 | i38);
                    c = i39 % 128;
                    int i40 = i39 % 2;
                    if (b4.d == i34) {
                        int i41 = c + 47;
                        d = i41 % 128;
                        int i42 = i41 % 2;
                        af afVar2 = (af) spinner2.getAdapter();
                        int iIndexOf2 = arrayList.indexOf(b3);
                        int i43 = c;
                        int i44 = i43 & 47;
                        int i45 = (((i43 | 47) & (~i44)) - (~(-(-(i44 << 1))))) - 1;
                        d = i45 % 128;
                        int i46 = i45 % 2;
                        afVar2.d(iIndexOf2, true);
                        int i47 = d;
                        int i48 = i47 & 95;
                        int i49 = (i48 - (~((i47 ^ 95) | i48))) - 1;
                        c = i49 % 128;
                        int i50 = i49 % 2;
                    }
                }
            }
            i11++;
            int i51 = c;
            int i52 = (i51 & 88) + (i51 | 88);
            int i53 = (i52 ^ (-1)) + (i52 << 1);
            d = i53 % 128;
            int i54 = i53 % 2;
        }
        int i55 = c + 7;
        d = i55 % 128;
        int i56 = i55 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:22:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:24:0x00db  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:29:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:31:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:32:0x0106  */
    /* JADX WARN: Code duplicated, block: B:42:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0108 A[SYNTHETIC] */
    private ArrayList<B> getAllMaleAndFemales(int i, ArrayList<B> arrayList, String str, B b) {
        B b2;
        int i2;
        int i3;
        int i4 = 2 % 2;
        ArrayList<B> arrayList2 = new ArrayList<>();
        ArrayList arrayList3 = new ArrayList();
        int i5 = d;
        int i6 = (((i5 | 80) << 1) - (i5 ^ 80)) - 1;
        c = i6 % 128;
        int i7 = i6 % 2;
        if (b == null) {
            ai aiVar = new ai();
            int i8 = c;
            int i9 = ((i8 & (-12)) | ((~i8) & 11)) + ((i8 & 11) << 1);
            d = i9 % 128;
            int i10 = i9 % 2;
            b2 = aiVar;
        } else {
            b2 = b;
        }
        F f = new F(-1, str, BuildConfig.FLAVOR, -1, -1, BuildConfig.FLAVOR, -1, null, null, arrayList3);
        int i11 = d;
        int i12 = (-2) - ((((i11 | 10) << 1) - (i11 ^ 10)) ^ (-1));
        c = i12 % 128;
        if (i12 % 2 == 0) {
            arrayList2.add(f);
        } else {
            arrayList2.add(f);
        }
        int i13 = 0;
        while (i13 < arrayList.size()) {
            int i14 = d;
            int i15 = i14 & 55;
            int i16 = ((i14 ^ 55) | i15) << 1;
            int i17 = -((i14 | 55) & (~i15));
            int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
            c = i18 % 128;
            int i19 = i18 % 2;
            B b3 = arrayList.get(i13);
            int i20 = d + 45;
            c = i20 % 128;
            if (i20 % 2 == 0) {
                int i21 = 27 / 0;
                if (b3.d != b2.d) {
                    int i22 = d;
                    int i23 = ((i22 ^ 23) - (~(-(-((i22 & 23) << 1))))) - 1;
                    c = i23 % 128;
                    int i24 = i23 % 2;
                    arrayList2.add(b3);
                    if (i == 1) {
                        int i25 = d;
                        int i26 = i25 & 59;
                        int i27 = i25 | 59;
                        int i28 = (i26 & i27) + (i27 | i26);
                        c = i28 % 128;
                        int i29 = i28 % 2;
                        i2 = b3.j;
                        if (i2 != 201) {
                            int i30 = c;
                            int i31 = i30 & 119;
                            int i32 = i30 | 119;
                            i3 = (i31 & i32) + (i32 | i31);
                            d = i3 % 128;
                            if (i3 % 2 != 0) {
                                if (i2 != 23163) {
                                    arrayList2.remove(b3);
                                    int i33 = d;
                                    int i34 = i33 & 7;
                                    int i35 = i34 + ((i33 ^ 7) | i34);
                                    c = i35 % 128;
                                    int i36 = i35 % 2;
                                }
                            } else if (i2 != 204) {
                                arrayList2.remove(b3);
                                int i37 = d;
                                int i38 = i37 & 7;
                                int i39 = i38 + ((i37 ^ 7) | i38);
                                c = i39 % 128;
                                int i310 = i39 % 2;
                            }
                        }
                    }
                }
            } else if (b3.d != b2.d) {
                int i210 = d;
                int i211 = ((i210 ^ 23) - (~(-(-((i210 & 23) << 1))))) - 1;
                c = i211 % 128;
                int i212 = i211 % 2;
                arrayList2.add(b3);
                if (i == 1) {
                    int i213 = d;
                    int i214 = i213 & 59;
                    int i215 = i213 | 59;
                    int i216 = (i214 & i215) + (i215 | i214);
                    c = i216 % 128;
                    int i217 = i216 % 2;
                    i2 = b3.j;
                    if (i2 != 201) {
                        int i311 = c;
                        int i312 = i311 & 119;
                        int i313 = i311 | 119;
                        i3 = (i312 & i313) + (i313 | i312);
                        d = i3 % 128;
                        if (i3 % 2 != 0) {
                            if (i2 != 23163) {
                                arrayList2.remove(b3);
                                int i314 = d;
                                int i315 = i314 & 7;
                                int i316 = i315 + ((i314 ^ 7) | i315);
                                c = i316 % 128;
                                int i317 = i316 % 2;
                            }
                        } else if (i2 != 204) {
                            arrayList2.remove(b3);
                            int i318 = d;
                            int i319 = i318 & 7;
                            int i3110 = i319 + ((i318 ^ 7) | i319);
                            c = i3110 % 128;
                            int i3111 = i3110 % 2;
                        }
                    }
                }
            }
            i13++;
            int i40 = c;
            int i41 = i40 & 73;
            int i42 = ((i40 | 73) & (~i41)) + (i41 << 1);
            d = i42 % 128;
            int i43 = i42 % 2;
        }
        arrayList2.add(new F(OPTION_NOT_ALIVE_ID, "Not Alive", BuildConfig.FLAVOR, -1, -1, BuildConfig.FLAVOR, -1, null, null, arrayList3));
        F f2 = new F(OPTION_NOT_INLIST_ID, "Not In the Roster", BuildConfig.FLAVOR, -1, -1, BuildConfig.FLAVOR, -1, null, null, arrayList3);
        int i44 = c;
        int i45 = (i44 & 123) + (i44 | 123);
        d = i45 % 128;
        if (i45 % 2 == 0) {
            arrayList2.add(f2);
            return arrayList2;
        }
        arrayList2.add(f2);
        throw null;
    }

    private void setSpouseWife(View view, B b, B b2, B b3) {
        int i = 2 % 2;
        int i2 = (-2) - ((c + 120) ^ (-1));
        d = i2 % 128;
        int i3 = i2 % 2;
        View childAt = ((ScrollView) view).getChildAt(0);
        int i4 = d;
        int i5 = i4 & 27;
        int i6 = -(-((i4 ^ 27) | i5));
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        c = i7 % 128;
        Object obj = null;
        if (i7 % 2 == 0) {
            throw null;
        }
        LinearLayout linearLayout = (LinearLayout) childAt;
        int i8 = 0;
        while (i8 < linearLayout.getChildCount()) {
            int i9 = c + 77;
            d = i9 % 128;
            Spinner spinner = (Spinner) (i9 % 2 != 0 ? ((LinearLayout) linearLayout.getChildAt(i8)).getChildAt(0) : ((LinearLayout) linearLayout.getChildAt(i8)).getChildAt(1));
            int i10 = d + 99;
            c = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = ((B) ((LinearLayout) spinner.getParent()).getTag()).d;
                throw null;
            }
            if (((B) ((LinearLayout) spinner.getParent()).getTag()).d == b2.d) {
                int i12 = c;
                int i13 = i12 & 113;
                int i14 = -(-((i12 ^ 113) | i13));
                int i15 = (i13 & i14) + (i14 | i13);
                d = i15 % 128;
                int i16 = i15 % 2;
                ArrayList<B> arrayList = ((af) spinner.getAdapter()).d;
                if (arrayList.contains(b3)) {
                    int i17 = d + 30;
                    int i18 = (i17 ^ (-1)) + (i17 << 1);
                    c = i18 % 128;
                    int i19 = i18 % 2;
                    spinner.setSelection(arrayList.indexOf(b3));
                    int i20 = c;
                    int i21 = i20 & 71;
                    int i22 = -(-((i20 ^ 71) | i21));
                    int i23 = (i21 & i22) + (i22 | i21);
                    d = i23 % 128;
                    int i24 = i23 % 2;
                }
            }
            int i25 = i8 & (-97);
            int i26 = -(-((i8 ^ (-97)) | i25));
            int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
            int i28 = i27 & 98;
            int i29 = (i27 ^ 98) | i28;
            i8 = (i28 | i29) + (i28 & i29);
            int i30 = d;
            int i31 = i30 & 91;
            int i32 = (i31 - (~((i30 ^ 91) | i31))) - 1;
            c = i32 % 128;
            int i33 = i32 % 2;
        }
        int i34 = d + 93;
        c = i34 % 128;
        if (i34 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00df A[PHI: r12
  0x00df: PHI (r12v16 java.util.ArrayList<ivas.gov.bisp.enumeration.bG.B>) = 
  (r12v15 java.util.ArrayList<ivas.gov.bisp.enumeration.bG.B>)
  (r12v21 java.util.ArrayList<ivas.gov.bisp.enumeration.bG.B>)
 binds: [B:18:0x00dd, B:15:0x00d0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:24:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:26:0x0104  */
    private void disableFemaleFromHusbandMotherList(B b, B b2, B b3, B b4) {
        LinearLayout linearLayout;
        Object tag;
        ArrayList<B> arrayList;
        int i;
        af afVar;
        int iIndexOf;
        int i2 = 2 % 2;
        int i3 = c;
        int i4 = (((i3 & (-86)) | ((~i3) & 85)) - (~(-(-((i3 & 85) << 1))))) - 1;
        d = i4 % 128;
        int i5 = i4 % 2;
        LinearLayout linearLayout2 = (LinearLayout) ((ScrollView) this.parentView).getChildAt(0);
        int i6 = c;
        int i7 = ((i6 | 63) << 1) - (((~i6) & 63) | (i6 & (-64)));
        d = i7 % 128;
        int i8 = i7 % 2 != 0 ? 1 : 0;
        while (i8 < linearLayout2.getChildCount()) {
            int i9 = c;
            int i10 = i9 & 67;
            int i11 = (((i9 ^ 67) | i10) << 1) - ((i9 | 67) & (~i10));
            d = i11 % 128;
            if (i11 % 2 != 0) {
                linearLayout = (LinearLayout) linearLayout2.getChildAt(i8);
                tag = linearLayout.getTag();
                int i12 = 41 / 0;
            } else {
                linearLayout = (LinearLayout) linearLayout2.getChildAt(i8);
                tag = linearLayout.getTag();
            }
            int i13 = c;
            int i14 = i13 & 3;
            int i15 = ((i13 ^ 3) | i14) << 1;
            int i16 = -((i13 | 3) & (~i14));
            int i17 = (i15 & i16) + (i16 | i15);
            d = i17 % 128;
            int i18 = i17 % 2;
            Spinner spinner = (Spinner) linearLayout.getChildAt(2);
            int i19 = c;
            int i20 = (i19 & (-44)) | ((~i19) & 43);
            int i21 = -(-((i19 & 43) << 1));
            int i22 = (i20 & i21) + (i21 | i20);
            d = i22 % 128;
            int i23 = i22 % 2;
            B b5 = (B) ((LinearLayout) spinner.getParent()).getTag();
            int i24 = d;
            int i25 = ((i24 | 41) << 1) - (i24 ^ 41);
            c = i25 % 128;
            if (i25 % 2 == 0) {
                arrayList = ((af) spinner.getAdapter()).d;
                int i26 = 94 / 0;
                if (b2.d >= 0) {
                    int i27 = d;
                    int i28 = i27 ^ 121;
                    int i29 = ((i27 & 121) | i28) << 1;
                    int i30 = -i28;
                    i = (i29 ^ i30) + ((i29 & i30) << 1);
                    c = i % 128;
                    if (i % 2 == 0) {
                        int i31 = 68 / 0;
                        if (b5.d == b4.d) {
                            af afVar2 = (af) spinner.getAdapter();
                            int iIndexOf2 = arrayList.indexOf(b2);
                            int i32 = c;
                            int i33 = i32 & 47;
                            int i34 = i33 + ((i32 ^ 47) | i33);
                            d = i34 % 128;
                            int i35 = i34 % 2;
                            afVar2.d(iIndexOf2, false);
                            int i36 = d;
                            int i37 = i36 & 81;
                            int i38 = (((i36 | 81) & (~i37)) - (~(i37 << 1))) - 1;
                            c = i38 % 128;
                            int i39 = i38 % 2;
                        }
                    } else if (b5.d == b4.d) {
                        af afVar3 = (af) spinner.getAdapter();
                        int iIndexOf3 = arrayList.indexOf(b2);
                        int i310 = c;
                        int i311 = i310 & 47;
                        int i312 = i311 + ((i310 ^ 47) | i311);
                        d = i312 % 128;
                        int i313 = i312 % 2;
                        afVar3.d(iIndexOf3, false);
                        int i314 = d;
                        int i315 = i314 & 81;
                        int i316 = (((i314 | 81) & (~i315)) - (~(i315 << 1))) - 1;
                        c = i316 % 128;
                        int i317 = i316 % 2;
                    }
                }
            } else {
                arrayList = ((af) spinner.getAdapter()).d;
                if (b2.d >= 0) {
                    int i210 = d;
                    int i211 = i210 ^ 121;
                    int i212 = ((i210 & 121) | i211) << 1;
                    int i318 = -i211;
                    i = (i212 ^ i318) + ((i212 & i318) << 1);
                    c = i % 128;
                    if (i % 2 == 0) {
                        int i319 = 68 / 0;
                        if (b5.d == b4.d) {
                            af afVar4 = (af) spinner.getAdapter();
                            int iIndexOf4 = arrayList.indexOf(b2);
                            int i3110 = c;
                            int i3111 = i3110 & 47;
                            int i3112 = i3111 + ((i3110 ^ 47) | i3111);
                            d = i3112 % 128;
                            int i3113 = i3112 % 2;
                            afVar4.d(iIndexOf4, false);
                            int i3114 = d;
                            int i3115 = i3114 & 81;
                            int i3116 = (((i3114 | 81) & (~i3115)) - (~(i3115 << 1))) - 1;
                            c = i3116 % 128;
                            int i3117 = i3116 % 2;
                        }
                    } else if (b5.d == b4.d) {
                        af afVar5 = (af) spinner.getAdapter();
                        int iIndexOf5 = arrayList.indexOf(b2);
                        int i3118 = c;
                        int i3119 = i3118 & 47;
                        int i31110 = i3119 + ((i3118 ^ 47) | i3119);
                        d = i31110 % 128;
                        int i31111 = i31110 % 2;
                        afVar5.d(iIndexOf5, false);
                        int i31112 = d;
                        int i31113 = i31112 & 81;
                        int i31114 = (((i31112 | 81) & (~i31113)) - (~(i31113 << 1))) - 1;
                        c = i31114 % 128;
                        int i31115 = i31114 % 2;
                    }
                }
            }
            if (b3 != null) {
                int i40 = d;
                int i41 = (i40 | 7) << 1;
                int i42 = -(((~i40) & 7) | (i40 & (-8)));
                int i43 = (i41 & i42) + (i42 | i41);
                c = i43 % 128;
                int i44 = i43 % 2;
                if (b3.d >= 0) {
                    int i45 = d + 15;
                    c = i45 % 128;
                    if (i45 % 2 == 0) {
                        int i46 = b5.d;
                        int i47 = b4.d;
                        throw null;
                    }
                    if (b5.d == b4.d) {
                        int i48 = d + 19;
                        c = i48 % 128;
                        if (i48 % 2 == 0) {
                            afVar = (af) spinner.getAdapter();
                            iIndexOf = arrayList.indexOf(b3);
                            int i49 = 48 / 0;
                        } else {
                            afVar = (af) spinner.getAdapter();
                            iIndexOf = arrayList.indexOf(b3);
                        }
                        afVar.d(iIndexOf, true);
                        int i50 = c;
                        int i51 = (-2) - ((((i50 | 2) << 1) - (i50 ^ 2)) ^ (-1));
                        d = i51 % 128;
                        int i52 = i51 % 2;
                    }
                } else {
                    continue;
                }
            }
            int i53 = i8 & 1;
            i8 = ((i8 ^ 1) | i53) + i53;
            int i54 = d;
            int i55 = ((i54 & (-102)) | ((~i54) & 101)) + ((i54 & 101) << 1);
            c = i55 % 128;
            int i56 = i55 % 2;
        }
        int i57 = d + 39;
        c = i57 % 128;
        if (i57 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:31:0x0120  */
    /* JADX WARN: Code duplicated, block: B:33:0x0134  */
    /* JADX WARN: Code duplicated, block: B:34:0x013b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0177  */
    private ArrayList<B> getAllMale(int i, ArrayList<B> arrayList, String str, F f) {
        F f2;
        F f3;
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        ArrayList<B> arrayList2 = new ArrayList<>();
        ArrayList arrayList3 = new ArrayList();
        int i6 = c;
        int i7 = ((i6 & 28) + (i6 | 28)) - 1;
        d = i7 % 128;
        int i8 = i7 % 2;
        if (f == null) {
            F f4 = new F();
            int i9 = c;
            int i10 = ((i9 | 15) << 1) - (i9 ^ 15);
            d = i10 % 128;
            int i11 = i10 % 2;
            f2 = f4;
        } else {
            f2 = f;
        }
        F f5 = f2;
        F f6 = new F(-1, str, BuildConfig.FLAVOR, -1, -1, BuildConfig.FLAVOR, -1, null, null, arrayList3);
        int i12 = c;
        int i13 = (((i12 ^ 73) | (i12 & 73)) << 1) - (((~i12) & 73) | (i12 & (-74)));
        d = i13 % 128;
        int i14 = i13 % 2;
        arrayList2.add(f6);
        int i15 = c + 125;
        d = i15 % 128;
        int i16 = i15 % 2;
        int i17 = 0;
        while (i17 < arrayList.size()) {
            int i18 = d;
            int i19 = i18 & 45;
            int i20 = (i18 | 45) & (~i19);
            int i21 = i19 << 1;
            int i22 = (i20 & i21) + (i20 | i21);
            c = i22 % 128;
            int i23 = i22 % 2;
            B b = arrayList.get(i17);
            String str2 = b.h;
            int i24 = c;
            int i25 = i24 & 105;
            int i26 = ((i24 | 105) & (~i25)) + (i25 << 1);
            d = i26 % 128;
            int i27 = i26 % 2;
            if (!str2.equalsIgnoreCase("male")) {
                f3 = f5;
            } else {
                int i28 = c;
                int i29 = i28 & 55;
                int i30 = (((i28 | 55) & (~i29)) - (~(-(-(i29 << 1))))) - 1;
                d = i30 % 128;
                int i31 = i30 % 2;
                f3 = f5;
                if (b.d != f3.d) {
                    int i32 = d;
                    int i33 = (i32 & (-20)) | ((~i32) & 19);
                    int i34 = -(-((i32 & 19) << 1));
                    int i35 = (i33 & i34) + (i34 | i33);
                    c = i35 % 128;
                    if (i35 % 2 == 0) {
                        arrayList2.add(b);
                        if (i == 1) {
                            int i36 = c;
                            int i37 = i36 ^ 35;
                            int i38 = -(-((i36 & 35) << 1));
                            i2 = (i37 ^ i38) + ((i38 & i37) << 1);
                            d = i2 % 128;
                            if (i2 % 2 != 0 ? (i3 = b.j) != 201 : (i3 = b.j) != 19092) {
                                if (i3 != 204) {
                                    int i39 = c;
                                    int i40 = i39 & 33;
                                    i4 = (((i39 | 33) & (~i40)) - (~(i40 << 1))) - 1;
                                    d = i4 % 128;
                                    if (i4 % 2 != 0) {
                                        arrayList2.remove(b);
                                        int i41 = 29 / 0;
                                    } else {
                                        arrayList2.remove(b);
                                    }
                                }
                            }
                        }
                    } else {
                        arrayList2.add(b);
                        if (i == 1) {
                            int i310 = c;
                            int i311 = i310 ^ 35;
                            int i312 = -(-((i310 & 35) << 1));
                            i2 = (i311 ^ i312) + ((i312 & i311) << 1);
                            d = i2 % 128;
                            if (i2 % 2 != 0) {
                                if (i3 != 204) {
                                    int i313 = c;
                                    int i42 = i313 & 33;
                                    i4 = (((i313 | 33) & (~i42)) - (~(i42 << 1))) - 1;
                                    d = i4 % 128;
                                    if (i4 % 2 != 0) {
                                        arrayList2.remove(b);
                                        int i43 = 29 / 0;
                                    } else {
                                        arrayList2.remove(b);
                                    }
                                }
                            } else if (i3 != 204) {
                                int i314 = c;
                                int i44 = i314 & 33;
                                i4 = (((i314 | 33) & (~i44)) - (~(i44 << 1))) - 1;
                                d = i4 % 128;
                                if (i4 % 2 != 0) {
                                    arrayList2.remove(b);
                                    int i45 = 29 / 0;
                                } else {
                                    arrayList2.remove(b);
                                }
                            }
                        }
                    }
                    if (i == 2) {
                        int i46 = d;
                        int i47 = (((i46 ^ 15) | (i46 & 15)) << 1) - (((~i46) & 15) | (i46 & (-16)));
                        c = i47 % 128;
                        int i48 = i47 % 2;
                        if (b.f >= 10) {
                            int i49 = c;
                            int i50 = i49 & 93;
                            int i51 = -(-((i49 ^ 93) | i50));
                            int i52 = (i50 ^ i51) + ((i51 & i50) << 1);
                            d = i52 % 128;
                            int i53 = i52 % 2;
                            if (b.j == 200) {
                                arrayList2.remove(b);
                                int i54 = c;
                                int i55 = i54 & 7;
                                int i56 = -(-(i54 | 7));
                                int i57 = ((i55 | i56) << 1) - (i56 ^ i55);
                                d = i57 % 128;
                                int i58 = i57 % 2;
                            }
                        } else {
                            arrayList2.remove(b);
                            int i59 = c;
                            int i510 = i59 & 7;
                            int i511 = -(-(i59 | 7));
                            int i512 = ((i510 | i511) << 1) - (i511 ^ i510);
                            d = i512 % 128;
                            int i513 = i512 % 2;
                        }
                    }
                }
                int i60 = (i17 | 1) << 1;
                int i61 = -(i17 ^ 1);
                i17 = (i61 | i60) + (i60 & i61);
                int i62 = c;
                int i63 = (i62 ^ 21) + ((i62 & 21) << 1);
                d = i63 % 128;
                int i64 = i63 % 2;
                f5 = f3;
            }
            int i65 = (i17 | 1) << 1;
            int i66 = -(i17 ^ 1);
            i17 = (i66 | i65) + (i65 & i66);
            int i67 = c;
            int i68 = (i67 ^ 21) + ((i67 & 21) << 1);
            d = i68 % 128;
            int i69 = i68 % 2;
            f5 = f3;
        }
        arrayList2.add(new F(OPTION_NOT_ALIVE_ID, "Not Alive", BuildConfig.FLAVOR, -1, -1, BuildConfig.FLAVOR, -1, null, null, arrayList3));
        F f7 = new F(OPTION_NOT_INLIST_ID, "Not In the Roster", BuildConfig.FLAVOR, -1, -1, BuildConfig.FLAVOR, -1, null, null, arrayList3);
        int i70 = d;
        int i71 = (-2) - ((((i70 | 30) << 1) - (i70 ^ 30)) ^ (-1));
        c = i71 % 128;
        int i72 = i71 % 2;
        arrayList2.add(f7);
        int i73 = d;
        int i74 = ((i73 & 58) + (i73 | 58)) - 1;
        c = i74 % 128;
        if (i74 % 2 == 0) {
            int i75 = 79 / 0;
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0051  */
    /* JADX WARN: Code duplicated, block: B:45:0x015b  */
    /* JADX WARN: Code duplicated, block: B:9:0x003e  */
    private ArrayList<B> getAllFemales(int i, ArrayList<B> arrayList, String str, ae aeVar) {
        ae aeVar2;
        int i2 = 2 % 2;
        ArrayList<B> arrayList2 = new ArrayList<>();
        ae aeVar3 = new ae(-1, str, BuildConfig.FLAVOR, -1, -1, BuildConfig.FLAVOR, -1, null, null, null);
        int i3 = c;
        int i4 = i3 & 31;
        int i5 = i4 + ((i3 ^ 31) | i4);
        d = i5 % 128;
        int i6 = 0;
        if (i5 % 2 != 0) {
            arrayList2.add(aeVar3);
            int i7 = 32 / 0;
            if (aeVar == null) {
                aeVar2 = new ae();
                int i8 = d;
                int i9 = (i8 ^ 125) + ((i8 & 125) << 1);
                c = i9 % 128;
                int i10 = i9 % 2;
            } else {
                int i11 = c;
                int i12 = (((i11 & (-46)) | ((~i11) & 45)) - (~(-(-((i11 & 45) << 1))))) - 1;
                d = i12 % 128;
                int i13 = i12 % 2;
                aeVar2 = aeVar;
            }
        } else {
            arrayList2.add(aeVar3);
            if (aeVar == null) {
                aeVar2 = new ae();
                int i14 = d;
                int i15 = (i14 ^ 125) + ((i14 & 125) << 1);
                c = i15 % 128;
                int i16 = i15 % 2;
            } else {
                int i17 = c;
                int i18 = (((i17 & (-46)) | ((~i17) & 45)) - (~(-(-((i17 & 45) << 1))))) - 1;
                d = i18 % 128;
                int i19 = i18 % 2;
                aeVar2 = aeVar;
            }
        }
        int i20 = d;
        int i21 = i20 & 11;
        int i22 = (i20 ^ 11) | i21;
        int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
        c = i23 % 128;
        int i24 = i23 % 2;
        while (true) {
            Object obj = null;
            if (i6 >= arrayList.size()) {
                arrayList2.add(new ae(OPTION_NOT_ALIVE_ID, "Not Alive", BuildConfig.FLAVOR, -1, -1, BuildConfig.FLAVOR, -1, null, null, null));
                ae aeVar4 = new ae(OPTION_NOT_INLIST_ID, "Not In the Roster", BuildConfig.FLAVOR, -1, -1, BuildConfig.FLAVOR, -1, null, null, null);
                int i25 = d + 29;
                c = i25 % 128;
                if (i25 % 2 == 0) {
                    arrayList2.add(aeVar4);
                    obj.hashCode();
                    throw null;
                }
                arrayList2.add(aeVar4);
                int i26 = d;
                int i27 = ((i26 | 29) << 1) - (i26 ^ 29);
                c = i27 % 128;
                int i28 = i27 % 2;
                return arrayList2;
            }
            int i29 = c;
            int i30 = i29 & 1;
            int i31 = -(-((i29 ^ 1) | i30));
            int i32 = (i30 & i31) + (i31 | i30);
            d = i32 % 128;
            if (i32 % 2 != 0) {
                String str2 = arrayList.get(i6).h;
                obj.hashCode();
                throw null;
            }
            B b = arrayList.get(i6);
            String str3 = b.h;
            int i33 = d;
            int i34 = i33 & 75;
            int i35 = -(-((i33 ^ 75) | i34));
            int i36 = ((i34 | i35) << 1) - (i35 ^ i34);
            c = i36 % 128;
            int i37 = i36 % 2;
            if (str3.equalsIgnoreCase("female")) {
                int i38 = c;
                int i39 = i38 & 51;
                int i40 = (i38 ^ 51) | i39;
                int i41 = ((i39 | i40) << 1) - (i40 ^ i39);
                d = i41 % 128;
                if (i41 % 2 != 0) {
                    int i42 = b.d;
                    int i43 = aeVar2.d;
                    throw null;
                }
                if (b.d != aeVar2.d) {
                    arrayList2.add(b);
                    if (i == 1) {
                        int i44 = c;
                        int i45 = ((i44 & 111) - (~(i44 | 111))) - 1;
                        d = i45 % 128;
                        int i46 = i45 % 2;
                        int i47 = b.j;
                        if (i46 == 0 ? i47 != 201 : i47 != 11338) {
                            int i48 = d;
                            int i49 = (((i48 | 38) << 1) - (i48 ^ 38)) - 1;
                            c = i49 % 128;
                            int i50 = i49 % 2;
                            if (i47 != 204) {
                                int i51 = i48 & 55;
                                int i52 = -(-(i48 | 55));
                                int i53 = ((i51 | i52) << 1) - (i51 ^ i52);
                                c = i53 % 128;
                                int i54 = i53 % 2;
                                arrayList2.remove(b);
                                int i55 = d;
                                int i56 = (i55 ^ 91) + ((i55 & 91) << 1);
                                c = i56 % 128;
                                int i57 = i56 % 2;
                            }
                        }
                    }
                    if (i == 3) {
                        int i58 = d;
                        int i59 = i58 & 81;
                        int i60 = -(-((i58 ^ 81) | i59));
                        int i61 = ((i59 | i60) << 1) - (i60 ^ i59);
                        c = i61 % 128;
                        int i62 = i61 % 2;
                        if (b.f >= 10) {
                            int i63 = c;
                            int i64 = i63 & 53;
                            int i65 = i64 + ((i63 ^ 53) | i64);
                            d = i65 % 128;
                            if (i65 % 2 != 0) {
                                if (b.j == 15454) {
                                    arrayList2.remove(b);
                                    int i66 = c;
                                    int i67 = ((i66 & (-120)) | ((~i66) & 119)) + ((i66 & 119) << 1);
                                    d = i67 % 128;
                                    int i68 = i67 % 2;
                                }
                            } else if (b.j == 200) {
                                arrayList2.remove(b);
                                int i69 = c;
                                int i610 = ((i69 & (-120)) | ((~i69) & 119)) + ((i69 & 119) << 1);
                                d = i610 % 128;
                                int i611 = i610 % 2;
                            }
                        } else {
                            arrayList2.remove(b);
                            int i612 = c;
                            int i613 = ((i612 & (-120)) | ((~i612) & 119)) + ((i612 & 119) << 1);
                            d = i613 % 128;
                            int i614 = i613 % 2;
                        }
                    }
                }
            }
            int i70 = (((i6 ^ 127) | (i6 & 127)) << 1) - (((~i6) & 127) | (i6 & (-128)));
            int i71 = (i70 | (-126)) << 1;
            int i72 = -(i70 ^ (-126));
            i6 = ((i71 | i72) << 1) - (i71 ^ i72);
            int i73 = c;
            int i74 = (i73 & 11) + (i73 | 11);
            d = i74 % 128;
            int i75 = i74 % 2;
        }
    }

    private void disableSpouseMotherListFemale(B b, B b2, B b3, B b4) {
        B b5;
        af afVar;
        int i = 2 % 2;
        int i2 = c;
        int i3 = (i2 | 95) << 1;
        int i4 = -(((~i2) & 95) | (i2 & (-96)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        d = i5 % 128;
        LinearLayout linearLayout = (LinearLayout) (i5 % 2 != 0 ? (ScrollView) this.parentView : (ScrollView) this.parentView).getChildAt(0);
        int i6 = d;
        int i7 = (i6 & 79) + (i6 | 79);
        c = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 69 / 0;
        }
        int i9 = 0;
        while (i9 < linearLayout.getChildCount()) {
            int i10 = d;
            int i11 = (i10 & 12) + (i10 | 12);
            int i12 = (i11 ^ (-1)) + (i11 << 1);
            c = i12 % 128;
            int i13 = i12 % 2;
            LinearLayout linearLayout2 = (LinearLayout) linearLayout.getChildAt(i9);
            Object tag = linearLayout2.getTag();
            int i14 = d + 109;
            c = i14 % 128;
            int i15 = i14 % 2;
            Spinner spinner = (Spinner) linearLayout2.getChildAt(3);
            int i16 = d;
            int i17 = ((i16 | 13) << 1) - (i16 ^ 13);
            c = i17 % 128;
            if (i17 % 2 == 0) {
                b5 = (B) ((LinearLayout) spinner.getParent()).getTag();
                int i18 = 80 / 0;
            } else {
                b5 = (B) ((LinearLayout) spinner.getParent()).getTag();
            }
            ArrayList<B> arrayList = ((af) spinner.getAdapter()).d;
            int i19 = d;
            int i20 = ((i19 ^ 105) | (i19 & 105)) << 1;
            int i21 = -(((~i19) & 105) | (i19 & (-106)));
            int i22 = (i20 & i21) + (i21 | i20);
            c = i22 % 128;
            Object obj = null;
            if (i22 % 2 == 0) {
                int i23 = b2.d;
                throw null;
            }
            if (b2.d >= 0) {
                int i24 = c;
                int i25 = i24 ^ 83;
                int i26 = ((i24 & 83) | i25) << 1;
                int i27 = -i25;
                int i28 = (i26 ^ i27) + ((i26 & i27) << 1);
                d = i28 % 128;
                int i29 = i28 % 2;
                if (b5.d == b4.d) {
                    int i30 = d;
                    int i31 = ((i30 | 29) << 1) - (((~i30) & 29) | (i30 & (-30)));
                    c = i31 % 128;
                    if (i31 % 2 == 0) {
                        afVar = (af) spinner.getAdapter();
                        int i32 = 72 / 0;
                    } else {
                        afVar = (af) spinner.getAdapter();
                    }
                    afVar.d(arrayList.indexOf(b2), false);
                    int i33 = d;
                    int i34 = i33 & 15;
                    int i35 = (i33 ^ 15) | i34;
                    int i36 = ((i34 | i35) << 1) - (i35 ^ i34);
                    c = i36 % 128;
                    if (i36 % 2 == 0) {
                        int i37 = 5 % 2;
                    }
                }
            }
            if (b3 != null) {
                int i38 = c + 123;
                d = i38 % 128;
                if (i38 % 2 != 0) {
                    int i39 = b3.d;
                    obj.hashCode();
                    throw null;
                }
                if (b3.d >= 0 && b5.d == b4.d) {
                    int i40 = d;
                    int i41 = ((i40 | 21) << 1) - (((~i40) & 21) | (i40 & (-22)));
                    c = i41 % 128;
                    if (i41 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    af afVar2 = (af) spinner.getAdapter();
                    int i42 = d;
                    int i43 = i42 & 125;
                    int i44 = (i42 ^ 125) | i43;
                    int i45 = (i43 ^ i44) + ((i44 & i43) << 1);
                    c = i45 % 128;
                    if (i45 % 2 == 0) {
                        afVar2.d(arrayList.indexOf(b3), true);
                    } else {
                        afVar2.d(arrayList.indexOf(b3), true);
                    }
                }
            }
            int i46 = i9 & 113;
            int i47 = (i9 | 113) & (~i46);
            int i48 = -(-(i46 << 1));
            int i49 = (i47 & i48) + (i47 | i48);
            int i50 = i49 & (-112);
            i9 = (((~i50) & (i49 | (-112))) - (~(i50 << 1))) - 1;
            int i51 = c;
            int i52 = i51 & 67;
            int i53 = (((i51 ^ 67) | i52) << 1) - ((i51 | 67) & (~i52));
            d = i53 % 128;
            int i54 = i53 % 2;
        }
        int i55 = d;
        int i56 = ((((i55 ^ 93) | (i55 & 93)) << 1) - (~(-(((~i55) & 93) | (i55 & (-94)))))) - 1;
        c = i56 % 128;
        if (i56 % 2 == 0) {
            int i57 = 5 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x018d  */
    private ArrayList<B> getAllFemalesMother(int i, ArrayList<B> arrayList, String str, B b) {
        B aeVar;
        B b2;
        int i2;
        int i3 = 2 % 2;
        ArrayList<B> arrayList2 = new ArrayList<>();
        if (b == null) {
            aeVar = new ae();
            int i4 = c + 21;
            d = i4 % 128;
            int i5 = i4 % 2;
        } else {
            aeVar = b;
        }
        int i6 = c;
        int i7 = ((i6 | 53) << 1) - (i6 ^ 53);
        d = i7 % 128;
        int i8 = i7 % 2;
        int i9 = 0;
        while (true) {
            Object obj = null;
            if (i9 >= arrayList.size()) {
                Collections.sort(arrayList2, new aY());
                arrayList2.add(0, new ae(-1, str, BuildConfig.FLAVOR, -1, -1, BuildConfig.FLAVOR, -1, null, null, null));
                arrayList2.add(new ae(OPTION_NOT_ALIVE_ID, "Not Alive", BuildConfig.FLAVOR, -1, -1, BuildConfig.FLAVOR, -1, null, null, null));
                ae aeVar2 = new ae(OPTION_NOT_INLIST_ID, "Not In the Roster", BuildConfig.FLAVOR, -1, -1, BuildConfig.FLAVOR, -1, null, null, null);
                int i10 = c + 37;
                d = i10 % 128;
                if (i10 % 2 != 0) {
                    arrayList2.add(aeVar2);
                    throw null;
                }
                arrayList2.add(aeVar2);
                int i11 = d;
                int i12 = ((i11 | 105) << 1) - (i11 ^ 105);
                c = i12 % 128;
                int i13 = i12 % 2;
                return arrayList2;
            }
            int i14 = c;
            int i15 = ((i14 ^ 47) | (i14 & 47)) << 1;
            int i16 = -(((~i14) & 47) | (i14 & (-48)));
            int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
            d = i17 % 128;
            if (i17 % 2 != 0) {
                b2 = arrayList.get(i9);
                int i18 = 40 / 0;
            } else {
                b2 = arrayList.get(i9);
            }
            int i19 = d + 75;
            c = i19 % 128;
            int i20 = i19 % 2;
            if (b2.h.equalsIgnoreCase("female")) {
                int i21 = d + 29;
                c = i21 % 128;
                if (i21 % 2 == 0) {
                    int i22 = b2.d;
                    int i23 = aeVar.d;
                    obj.hashCode();
                    throw null;
                }
                if (b2.d != aeVar.d) {
                    int i24 = c;
                    int i25 = (i24 & (-24)) | ((~i24) & 23);
                    int i26 = (i24 & 23) << 1;
                    int i27 = (i25 & i26) + (i26 | i25);
                    d = i27 % 128;
                    int i28 = i27 % 2;
                    if (b2.f > aeVar.f) {
                        int i29 = d;
                        int i30 = (((i29 | 108) << 1) - (i29 ^ 108)) - 1;
                        c = i30 % 128;
                        int i31 = i30 % 2;
                        arrayList2.add(b2);
                        if (i == 3) {
                            int i32 = c;
                            int i33 = (((i32 | 105) << 1) - (~(-((105 & (~i32)) | (i32 & (-106)))))) - 1;
                            d = i33 % 128;
                            int i34 = i33 % 2;
                            int i35 = b2.f;
                            int i36 = -aeVar.f;
                            int i37 = i35 & i36;
                            if ((i37 - (~((i35 ^ i36) | i37))) - 1 < 10.0d) {
                                int i38 = c;
                                int i39 = ((((i38 ^ 5) | (i38 & 5)) << 1) - (~(-(((~i38) & 5) | (i38 & (-6)))))) - 1;
                                d = i39 % 128;
                                int i40 = i39 % 2;
                                arrayList2.remove(b2);
                                int i41 = d + 33;
                                c = i41 % 128;
                                int i42 = i41 % 2;
                            }
                        }
                        if (i == 1) {
                            int i43 = c;
                            int i44 = i43 & 21;
                            int i45 = (i44 - (~(-(-((i43 ^ 21) | i44))))) - 1;
                            d = i45 % 128;
                            if (i45 % 2 == 0 ? (i2 = b2.j) != 201 : (i2 = b2.j) != 16856) {
                                int i46 = c;
                                int i47 = i46 & 113;
                                int i48 = -(-(i46 | 113));
                                int i49 = ((i47 | i48) << 1) - (i48 ^ i47);
                                int i50 = i49 % 128;
                                d = i50;
                                int i51 = i49 % 2;
                                if (i2 != 204) {
                                    int i52 = i50 & 91;
                                    int i53 = (i52 - (~(-(-((i50 ^ 91) | i52))))) - 1;
                                    c = i53 % 128;
                                    if (i53 % 2 == 0) {
                                        arrayList2.remove(b2);
                                        throw null;
                                    }
                                    arrayList2.remove(b2);
                                    int i54 = d;
                                    int i55 = i54 & 125;
                                    int i56 = (i54 | 125) & (~i55);
                                    int i57 = i55 << 1;
                                    int i58 = ((i56 | i57) << 1) - (i56 ^ i57);
                                    c = i58 % 128;
                                    int i59 = i58 % 2;
                                }
                            }
                        }
                        if (i == 3) {
                            int i60 = d;
                            int i61 = i60 & 7;
                            int i62 = -(-((i60 ^ 7) | i61));
                            int i63 = (i61 & i62) + (i62 | i61);
                            c = i63 % 128;
                            int i64 = i63 % 2;
                            int i65 = b2.f;
                            if (i64 != 0 ? i65 < 10 : i65 < 53) {
                                arrayList2.remove(b2);
                                int i66 = c;
                                int i67 = i66 & 99;
                                int i68 = (((i66 | 99) & (~i67)) - (~(i67 << 1))) - 1;
                                d = i68 % 128;
                                int i69 = i68 % 2;
                            } else if (b2.j == 200) {
                                arrayList2.remove(b2);
                                int i610 = c;
                                int i611 = i610 & 99;
                                int i612 = (((i610 | 99) & (~i611)) - (~(i611 << 1))) - 1;
                                d = i612 % 128;
                                int i613 = i612 % 2;
                            }
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            int i70 = i9 | 1;
            int i71 = i70 << 1;
            int i72 = -((~(i9 & 1)) & i70);
            i9 = (i72 | i71) + (i71 & i72);
            int i73 = c;
            int i74 = (i73 & 91) + (i73 | 91);
            d = i74 % 128;
            int i75 = i74 % 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0041  */
    /* JADX WARN: Code duplicated, block: B:11:0x0045  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d3 A[PHI: r7
  0x00d3: PHI (r7v27 int) = (r7v26 int), (r7v37 int) binds: [B:37:0x00d1, B:34:0x00ca] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:55:0x0105 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x010c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x010c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x010c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x010c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x010c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0026  */
    private ArrayList<B> getAllMaleAndFemalesSpouse(int i, ArrayList<B> arrayList, String str, B b) {
        B aiVar;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 2 % 2;
        ArrayList<B> arrayList2 = new ArrayList<>();
        ArrayList arrayList3 = new ArrayList();
        int i8 = d + 29;
        c = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 40 / 0;
            if (b == null) {
                aiVar = new ai();
                int i10 = c;
                int i11 = (i10 & (-82)) | ((~i10) & 81);
                int i12 = -(-((i10 & 81) << 1));
                i2 = (i11 & i12) + (i12 | i11);
                d = i2 % 128;
                if (i2 % 2 != 0) {
                    int i13 = 3 / 5;
                }
            } else {
                aiVar = b;
            }
        } else if (b == null) {
            aiVar = new ai();
            int i14 = c;
            int i15 = (i14 & (-82)) | ((~i14) & 81);
            int i16 = -(-((i14 & 81) << 1));
            i2 = (i15 & i16) + (i16 | i15);
            d = i2 % 128;
            if (i2 % 2 != 0) {
                int i17 = 3 / 5;
            }
        } else {
            aiVar = b;
        }
        int i18 = d;
        int i19 = i18 ^ 21;
        int i20 = ((i18 & 21) | i19) << 1;
        int i21 = -i19;
        int i22 = (i20 ^ i21) + ((i20 & i21) << 1);
        c = i22 % 128;
        int i23 = i22 % 2;
        int i24 = 0;
        while (true) {
            Object obj = null;
            if (i24 >= arrayList.size()) {
                Collections.sort(arrayList2, new aY());
                arrayList2.add(0, new F(-1, str, BuildConfig.FLAVOR, -1, -1, BuildConfig.FLAVOR, -1, null, null, arrayList3));
                arrayList2.add(new F(OPTION_NOT_ALIVE_ID, "Not Alive", BuildConfig.FLAVOR, -1, -1, BuildConfig.FLAVOR, -1, null, null, arrayList3));
                F f = new F(OPTION_NOT_INLIST_ID, "Not In the Roster", BuildConfig.FLAVOR, -1, -1, BuildConfig.FLAVOR, -1, null, null, arrayList3);
                int i25 = d;
                int i26 = ((i25 | 81) << 1) - (((~i25) & 81) | (i25 & (-82)));
                c = i26 % 128;
                if (i26 % 2 == 0) {
                    arrayList2.add(f);
                    throw null;
                }
                arrayList2.add(f);
                int i27 = d;
                int i28 = i27 ^ 41;
                int i29 = ((i27 & 41) | i28) << 1;
                int i30 = -i28;
                int i31 = (i29 & i30) + (i29 | i30);
                c = i31 % 128;
                if (i31 % 2 == 0) {
                    int i32 = 43 / 0;
                }
                return arrayList2;
            }
            int i33 = c;
            int i34 = (i33 & 29) + (i33 | 29);
            d = i34 % 128;
            int i35 = i34 % 2;
            B b2 = arrayList.get(i24);
            int i36 = d + 59;
            c = i36 % 128;
            int i37 = i36 % 2;
            if (b2.d != aiVar.d) {
                int i38 = d;
                int i39 = ((i38 ^ 117) - (~((i38 & 117) << 1))) - 1;
                c = i39 % 128;
                int i40 = i39 % 2;
                int i41 = b2.f;
                if (i40 == 0) {
                    if (i41 > 79) {
                        i3 = c + 19;
                        d = i3 % 128;
                        if (i3 % 2 != 0) {
                            arrayList2.add(b2);
                            if (i == 0) {
                                int i42 = c;
                                i4 = (i42 & 89) + (i42 | 89);
                                d = i4 % 128;
                                if (i4 % 2 != 0) {
                                    i5 = b2.j;
                                    if (i5 != 20914) {
                                        continue;
                                    } else if (i5 != 204) {
                                        int i43 = c;
                                        int i44 = i43 & 67;
                                        int i45 = (i43 ^ 67) | i44;
                                        i6 = (i44 ^ i45) + ((i45 & i44) << 1);
                                        d = i6 % 128;
                                        if (i6 % 2 == 0) {
                                            arrayList2.remove(b2);
                                            obj.hashCode();
                                            throw null;
                                        }
                                        arrayList2.remove(b2);
                                        int i46 = d;
                                        int i47 = i46 & 73;
                                        int i48 = ((i46 ^ 73) | i47) << 1;
                                        int i49 = -((i46 | 73) & (~i47));
                                        int i50 = (i48 ^ i49) + ((i49 & i48) << 1);
                                        c = i50 % 128;
                                        int i51 = i50 % 2;
                                    } else {
                                        continue;
                                    }
                                } else {
                                    i5 = b2.j;
                                    if (i5 != 201) {
                                        continue;
                                    } else if (i5 != 204) {
                                        int i410 = c;
                                        int i411 = i410 & 67;
                                        int i412 = (i410 ^ 67) | i411;
                                        i6 = (i411 ^ i412) + ((i412 & i411) << 1);
                                        d = i6 % 128;
                                        if (i6 % 2 == 0) {
                                            arrayList2.remove(b2);
                                            obj.hashCode();
                                            throw null;
                                        }
                                        arrayList2.remove(b2);
                                        int i413 = d;
                                        int i414 = i413 & 73;
                                        int i415 = ((i413 ^ 73) | i414) << 1;
                                        int i416 = -((i413 | 73) & (~i414));
                                        int i52 = (i415 ^ i416) + ((i416 & i415) << 1);
                                        c = i52 % 128;
                                        int i53 = i52 % 2;
                                    } else {
                                        continue;
                                    }
                                }
                            } else {
                                continue;
                            }
                        } else {
                            arrayList2.add(b2);
                            if (i == 1) {
                                int i417 = c;
                                i4 = (i417 & 89) + (i417 | 89);
                                d = i4 % 128;
                                if (i4 % 2 != 0) {
                                    i5 = b2.j;
                                    if (i5 != 20914) {
                                        continue;
                                    } else if (i5 != 204) {
                                        int i418 = c;
                                        int i419 = i418 & 67;
                                        int i4110 = (i418 ^ 67) | i419;
                                        i6 = (i419 ^ i4110) + ((i4110 & i419) << 1);
                                        d = i6 % 128;
                                        if (i6 % 2 == 0) {
                                            arrayList2.remove(b2);
                                            obj.hashCode();
                                            throw null;
                                        }
                                        arrayList2.remove(b2);
                                        int i4111 = d;
                                        int i4112 = i4111 & 73;
                                        int i4113 = ((i4111 ^ 73) | i4112) << 1;
                                        int i4114 = -((i4111 | 73) & (~i4112));
                                        int i54 = (i4113 ^ i4114) + ((i4114 & i4113) << 1);
                                        c = i54 % 128;
                                        int i55 = i54 % 2;
                                    } else {
                                        continue;
                                    }
                                } else {
                                    i5 = b2.j;
                                    if (i5 != 201) {
                                        continue;
                                    } else if (i5 != 204) {
                                        int i4115 = c;
                                        int i4116 = i4115 & 67;
                                        int i4117 = (i4115 ^ 67) | i4116;
                                        i6 = (i4116 ^ i4117) + ((i4117 & i4116) << 1);
                                        d = i6 % 128;
                                        if (i6 % 2 == 0) {
                                            arrayList2.remove(b2);
                                            obj.hashCode();
                                            throw null;
                                        }
                                        arrayList2.remove(b2);
                                        int i4118 = d;
                                        int i4119 = i4118 & 73;
                                        int i41110 = ((i4118 ^ 73) | i4119) << 1;
                                        int i41111 = -((i4118 | 73) & (~i4119));
                                        int i56 = (i41110 ^ i41111) + ((i41111 & i41110) << 1);
                                        c = i56 % 128;
                                        int i57 = i56 % 2;
                                    } else {
                                        continue;
                                    }
                                }
                            } else {
                                continue;
                            }
                        }
                    } else {
                        continue;
                    }
                } else if (i41 > 10) {
                    i3 = c + 19;
                    d = i3 % 128;
                    if (i3 % 2 != 0) {
                        arrayList2.add(b2);
                        if (i == 0) {
                            int i4120 = c;
                            i4 = (i4120 & 89) + (i4120 | 89);
                            d = i4 % 128;
                            if (i4 % 2 != 0) {
                                i5 = b2.j;
                                if (i5 != 20914) {
                                    continue;
                                } else if (i5 != 204) {
                                    int i41112 = c;
                                    int i41113 = i41112 & 67;
                                    int i41114 = (i41112 ^ 67) | i41113;
                                    i6 = (i41113 ^ i41114) + ((i41114 & i41113) << 1);
                                    d = i6 % 128;
                                    if (i6 % 2 == 0) {
                                        arrayList2.remove(b2);
                                        obj.hashCode();
                                        throw null;
                                    }
                                    arrayList2.remove(b2);
                                    int i41115 = d;
                                    int i41116 = i41115 & 73;
                                    int i41117 = ((i41115 ^ 73) | i41116) << 1;
                                    int i41118 = -((i41115 | 73) & (~i41116));
                                    int i58 = (i41117 ^ i41118) + ((i41118 & i41117) << 1);
                                    c = i58 % 128;
                                    int i59 = i58 % 2;
                                } else {
                                    continue;
                                }
                            } else {
                                i5 = b2.j;
                                if (i5 != 201) {
                                    continue;
                                } else if (i5 != 204) {
                                    int i41119 = c;
                                    int i411110 = i41119 & 67;
                                    int i411111 = (i41119 ^ 67) | i411110;
                                    i6 = (i411110 ^ i411111) + ((i411111 & i411110) << 1);
                                    d = i6 % 128;
                                    if (i6 % 2 == 0) {
                                        arrayList2.remove(b2);
                                        obj.hashCode();
                                        throw null;
                                    }
                                    arrayList2.remove(b2);
                                    int i411112 = d;
                                    int i411113 = i411112 & 73;
                                    int i411114 = ((i411112 ^ 73) | i411113) << 1;
                                    int i411115 = -((i411112 | 73) & (~i411113));
                                    int i510 = (i411114 ^ i411115) + ((i411115 & i411114) << 1);
                                    c = i510 % 128;
                                    int i511 = i510 % 2;
                                } else {
                                    continue;
                                }
                            }
                        } else {
                            continue;
                        }
                    } else {
                        arrayList2.add(b2);
                        if (i == 1) {
                            int i4121 = c;
                            i4 = (i4121 & 89) + (i4121 | 89);
                            d = i4 % 128;
                            if (i4 % 2 != 0) {
                                i5 = b2.j;
                                if (i5 != 20914) {
                                    continue;
                                } else if (i5 != 204) {
                                    int i411116 = c;
                                    int i411117 = i411116 & 67;
                                    int i411118 = (i411116 ^ 67) | i411117;
                                    i6 = (i411117 ^ i411118) + ((i411118 & i411117) << 1);
                                    d = i6 % 128;
                                    if (i6 % 2 == 0) {
                                        arrayList2.remove(b2);
                                        obj.hashCode();
                                        throw null;
                                    }
                                    arrayList2.remove(b2);
                                    int i411119 = d;
                                    int i4111110 = i411119 & 73;
                                    int i4111111 = ((i411119 ^ 73) | i4111110) << 1;
                                    int i4111112 = -((i411119 | 73) & (~i4111110));
                                    int i512 = (i4111111 ^ i4111112) + ((i4111112 & i4111111) << 1);
                                    c = i512 % 128;
                                    int i513 = i512 % 2;
                                } else {
                                    continue;
                                }
                            } else {
                                i5 = b2.j;
                                if (i5 != 201) {
                                    continue;
                                } else if (i5 != 204) {
                                    int i4111113 = c;
                                    int i4111114 = i4111113 & 67;
                                    int i4111115 = (i4111113 ^ 67) | i4111114;
                                    i6 = (i4111114 ^ i4111115) + ((i4111115 & i4111114) << 1);
                                    d = i6 % 128;
                                    if (i6 % 2 == 0) {
                                        arrayList2.remove(b2);
                                        obj.hashCode();
                                        throw null;
                                    }
                                    arrayList2.remove(b2);
                                    int i4111116 = d;
                                    int i4111117 = i4111116 & 73;
                                    int i4111118 = ((i4111116 ^ 73) | i4111117) << 1;
                                    int i4111119 = -((i4111116 | 73) & (~i4111117));
                                    int i514 = (i4111118 ^ i4111119) + ((i4111119 & i4111118) << 1);
                                    c = i514 % 128;
                                    int i515 = i514 % 2;
                                } else {
                                    continue;
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                } else {
                    continue;
                }
            }
            int i60 = (((i24 & 111) | ((~i24) & (-112))) - (~((i24 & (-112)) << 1))) - 1;
            int i61 = (i60 & (-114)) | ((~i60) & 113);
            int i62 = (i60 & 113) << 1;
            i24 = ((i61 & i62) << 1) + (i61 ^ i62);
            int i63 = d;
            int i64 = i63 ^ 15;
            int i65 = ((i63 & 15) | i64) << 1;
            int i66 = -i64;
            int i67 = (i65 ^ i66) + ((i65 & i66) << 1);
            c = i67 % 128;
            int i68 = i67 % 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0119  */
    private ArrayList<B> getAllFemalesSpouse(int i, ArrayList<B> arrayList, String str, ae aeVar) {
        ae aeVar2;
        int i2 = 2 % 2;
        ArrayList<B> arrayList2 = new ArrayList<>();
        if (aeVar == null) {
            aeVar2 = new ae();
            int i3 = c;
            int i4 = i3 ^ 107;
            int i5 = -(-((i3 & 107) << 1));
            int i6 = (i4 & i5) + (i5 | i4);
            d = i6 % 128;
            int i7 = i6 % 2;
        } else {
            aeVar2 = aeVar;
        }
        int i8 = d + 95;
        c = i8 % 128;
        int i9 = i8 % 2;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            int i11 = d;
            int i12 = i11 & 99;
            int i13 = ((((i11 ^ 99) | i12) << 1) - (~(-((i11 | 99) & (~i12))))) - 1;
            c = i13 % 128;
            if (i13 % 2 == 0) {
                arrayList.get(i10);
                throw null;
            }
            B b = arrayList.get(i10);
            if (b.h.equalsIgnoreCase("female")) {
                int i14 = c;
                int i15 = i14 & 71;
                int i16 = -(-((i14 ^ 71) | i15));
                int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
                d = i17 % 128;
                int i18 = i17 % 2;
                if (b.d != aeVar2.d) {
                    int i19 = c + 59;
                    d = i19 % 128;
                    int i20 = i19 % 2;
                    if (b.f > 10) {
                        int i21 = c;
                        int i22 = i21 & 11;
                        int i23 = (i21 ^ 11) | i22;
                        int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
                        d = i24 % 128;
                        int i25 = i24 % 2;
                        arrayList2.add(b);
                        if (i == 1) {
                            int i26 = d;
                            int i27 = i26 & 23;
                            int i28 = i26 | 23;
                            int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
                            c = i29 % 128;
                            int i30 = i29 % 2;
                            int i31 = b.j;
                            if (i30 != 0 ? i31 != 201 : i31 != 30981) {
                                int i32 = d;
                                int i33 = ((i32 | 39) << 1) - (i32 ^ 39);
                                c = i33 % 128;
                                if (i33 % 2 != 0 ? i31 != 204 : i31 != 2879) {
                                    arrayList2.remove(b);
                                    int i34 = d;
                                    int i35 = i34 & 109;
                                    int i36 = ((i34 | 109) & (~i35)) + (i35 << 1);
                                    c = i36 % 128;
                                    int i37 = i36 % 2;
                                }
                            }
                        }
                        if (i == 3) {
                            int i38 = d;
                            int i39 = (i38 ^ 109) + ((i38 & 109) << 1);
                            c = i39 % 128;
                            int i40 = i39 % 2;
                            if (b.f >= 10) {
                                int i41 = d;
                                int i42 = (i41 | 29) << 1;
                                int i43 = -(((~i41) & 29) | (i41 & (-30)));
                                int i44 = (i42 ^ i43) + ((i43 & i42) << 1);
                                c = i44 % 128;
                                int i45 = i44 % 2;
                                if (b.j == 200) {
                                    arrayList2.remove(b);
                                    int i46 = d;
                                    int i47 = ((i46 | 55) << 1) - (i46 ^ 55);
                                    c = i47 % 128;
                                    int i48 = i47 % 2;
                                }
                            } else {
                                arrayList2.remove(b);
                                int i49 = d;
                                int i410 = ((i49 | 55) << 1) - (i49 ^ 55);
                                c = i410 % 128;
                                int i411 = i410 % 2;
                            }
                        }
                    }
                }
            }
            int i50 = i10 & 122;
            int i51 = (i10 ^ 122) | i50;
            int i52 = (i50 ^ i51) + ((i51 & i50) << 1);
            int i53 = i52 & (-121);
            i10 = (i53 - (~(-(-((i52 ^ (-121)) | i53))))) - 1;
            int i54 = d;
            int i55 = (i54 & 103) + (i54 | 103);
            c = i55 % 128;
            if (i55 % 2 == 0) {
                int i56 = 2 / 3;
            }
        }
        Collections.sort(arrayList2, new aY());
        arrayList2.add(0, new ae(-1, str, BuildConfig.FLAVOR, -1, -1, BuildConfig.FLAVOR, -1, null, null, null));
        arrayList2.add(new ae(OPTION_NOT_ALIVE_ID, "Not Alive", BuildConfig.FLAVOR, -1, -1, BuildConfig.FLAVOR, -1, null, null, null));
        ae aeVar3 = new ae(OPTION_NOT_INLIST_ID, "Not In the Roster", BuildConfig.FLAVOR, -1, -1, BuildConfig.FLAVOR, -1, null, null, null);
        int i57 = c;
        int i58 = i57 ^ 115;
        int i59 = (i57 & 115) << 1;
        int i60 = (i58 ^ i59) + ((i59 & i58) << 1);
        d = i60 % 128;
        int i61 = i60 % 2;
        arrayList2.add(aeVar3);
        int i62 = c;
        int i63 = i62 ^ 101;
        int i64 = ((i62 & 101) | i63) << 1;
        int i65 = -i63;
        int i66 = (i64 ^ i65) + ((i64 & i65) << 1);
        d = i66 % 128;
        int i67 = i66 % 2;
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:37:0x0101  */
    /* JADX WARN: Code duplicated, block: B:40:0x0113  */
    /* JADX WARN: Code duplicated, block: B:49:0x0149  */
    /* JADX WARN: Code duplicated, block: B:68:0x0155 A[SYNTHETIC] */
    private ArrayList<B> getAllMaleSpouse(int i, ArrayList<B> arrayList, String str, F f) {
        F f2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        ArrayList<B> arrayList2 = new ArrayList<>();
        ArrayList arrayList3 = new ArrayList();
        int i7 = d;
        int i8 = i7 & 41;
        int i9 = (i8 - (~(-(-((i7 ^ 41) | i8))))) - 1;
        c = i9 % 128;
        int i10 = i9 % 2;
        if (f == null) {
            f2 = new F();
            int i11 = d;
            int i12 = (i11 ^ 91) + ((i11 & 91) << 1);
            c = i12 % 128;
            int i13 = i12 % 2;
        } else {
            f2 = f;
        }
        int i14 = d;
        int i15 = i14 & 43;
        int i16 = ((i14 ^ 43) | i15) << 1;
        int i17 = -((i14 | 43) & (~i15));
        int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
        c = i18 % 128;
        if (i18 % 2 == 0) {
            int i19 = 5 / 3;
        }
        int i20 = 0;
        while (i20 < arrayList.size()) {
            int i21 = d;
            int i22 = i21 ^ 53;
            int i23 = -(-((i21 & 53) << 1));
            int i24 = (i22 & i23) + (i23 | i22);
            c = i24 % 128;
            Object obj = null;
            if (i24 % 2 == 0) {
                arrayList.get(i20);
                obj.hashCode();
                throw null;
            }
            B b = arrayList.get(i20);
            int i25 = d;
            int i26 = i25 & 1;
            int i27 = -(-(i25 | 1));
            int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
            c = i28 % 128;
            if (i28 % 2 == 0) {
                b.h.equalsIgnoreCase("male");
                obj.hashCode();
                throw null;
            }
            if (!(!b.h.equalsIgnoreCase("male")) && b.d != f2.d) {
                int i29 = d;
                int i30 = i29 & 61;
                int i31 = i30 + ((i29 ^ 61) | i30);
                c = i31 % 128;
                if (i31 % 2 == 0) {
                    if (b.f > 66) {
                        arrayList2.add(b);
                        if (i == 1) {
                            int i32 = c;
                            int i33 = i32 & 113;
                            int i34 = i32 | 113;
                            int i35 = ((i33 | i34) << 1) - (i34 ^ i33);
                            d = i35 % 128;
                            int i36 = i35 % 2;
                            i3 = b.j;
                            if (i3 != 201) {
                                int i37 = c;
                                int i38 = i37 & 51;
                                int i39 = i38 + ((i37 ^ 51) | i38);
                                i4 = i39 % 128;
                                d = i4;
                                int i40 = i39 % 2;
                                if (i3 != 204) {
                                    int i41 = i4 & 115;
                                    int i42 = -(-((i4 ^ 115) | i41));
                                    i5 = (i41 ^ i42) + ((i41 & i42) << 1);
                                    c = i5 % 128;
                                    if (i5 % 2 == 0) {
                                        arrayList2.remove(b);
                                        int i43 = 5 / 0;
                                    } else {
                                        arrayList2.remove(b);
                                    }
                                    int i44 = (-2) - ((d + 62) ^ (-1));
                                    c = i44 % 128;
                                    int i45 = i44 % 2;
                                }
                            }
                        }
                        if (i == 2) {
                            int i46 = d;
                            i2 = ((i46 & 94) + (i46 | 94)) - 1;
                            c = i2 % 128;
                            if (i2 % 2 == 0 ? b.f < 10 : b.f < 28) {
                                arrayList2.remove(b);
                                int i47 = c + 5;
                                d = i47 % 128;
                                int i48 = i47 % 2;
                            } else {
                                int i49 = c;
                                int i50 = i49 & 11;
                                int i51 = ((((i49 ^ 11) | i50) << 1) - (~(-((i49 | 11) & (~i50))))) - 1;
                                d = i51 % 128;
                                int i52 = i51 % 2;
                                if (b.j == 200) {
                                    arrayList2.remove(b);
                                    int i410 = c + 5;
                                    d = i410 % 128;
                                    int i411 = i410 % 2;
                                }
                            }
                        }
                    }
                } else if (b.f > 10) {
                    arrayList2.add(b);
                    if (i == 1) {
                        int i310 = c;
                        int i311 = i310 & 113;
                        int i312 = i310 | 113;
                        int i313 = ((i311 | i312) << 1) - (i312 ^ i311);
                        d = i313 % 128;
                        int i314 = i313 % 2;
                        i3 = b.j;
                        if (i3 != 201) {
                            int i315 = c;
                            int i316 = i315 & 51;
                            int i317 = i316 + ((i315 ^ 51) | i316);
                            i4 = i317 % 128;
                            d = i4;
                            int i412 = i317 % 2;
                            if (i3 != 204) {
                                int i413 = i4 & 115;
                                int i414 = -(-((i4 ^ 115) | i413));
                                i5 = (i413 ^ i414) + ((i413 & i414) << 1);
                                c = i5 % 128;
                                if (i5 % 2 == 0) {
                                    arrayList2.remove(b);
                                    int i415 = 5 / 0;
                                } else {
                                    arrayList2.remove(b);
                                }
                                int i416 = (-2) - ((d + 62) ^ (-1));
                                c = i416 % 128;
                                int i417 = i416 % 2;
                            }
                        }
                    }
                    if (i == 2) {
                        int i418 = d;
                        i2 = ((i418 & 94) + (i418 | 94)) - 1;
                        c = i2 % 128;
                        if (i2 % 2 == 0) {
                        }
                        arrayList2.remove(b);
                        int i419 = c + 5;
                        d = i419 % 128;
                        int i4110 = i419 % 2;
                    }
                }
            }
            int i53 = i20 & (-110);
            int i54 = (((i20 ^ (-110)) | i53) << 1) - ((i20 | (-110)) & (~i53));
            i20 = (-2) - (((i54 ^ 112) + ((i54 & 112) << 1)) ^ (-1));
            int i55 = d + 15;
            c = i55 % 128;
            int i56 = i55 % 2;
        }
        Collections.sort(arrayList2, new aY());
        arrayList2.add(0, new F(-1, str, BuildConfig.FLAVOR, -1, -1, BuildConfig.FLAVOR, -1, null, null, arrayList3));
        arrayList2.add(new F(OPTION_NOT_ALIVE_ID, "Not Alive", BuildConfig.FLAVOR, -1, -1, BuildConfig.FLAVOR, -1, null, null, arrayList3));
        F f3 = new F(OPTION_NOT_INLIST_ID, "Not In the Roster", BuildConfig.FLAVOR, -1, -1, BuildConfig.FLAVOR, -1, null, null, arrayList3);
        int i57 = d + 5;
        c = i57 % 128;
        if (i57 % 2 == 0) {
            arrayList2.add(f3);
            int i58 = 84 / 0;
        } else {
            arrayList2.add(f3);
        }
        int i59 = c + 38;
        int i60 = (i59 ^ (-1)) + (i59 << 1);
        d = i60 % 128;
        int i61 = i60 % 2;
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:31:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:58:0x0190  */
    private ArrayList<B> getAllMaleFather(int i, ArrayList<B> arrayList, String str, B b) {
        B f;
        int i2;
        int i3;
        int i4 = 2 % 2;
        ArrayList<B> arrayList2 = new ArrayList<>();
        ArrayList arrayList3 = new ArrayList();
        int i5 = d;
        int i6 = i5 & 41;
        int i7 = (i5 | 41) & (~i6);
        int i8 = -(-(i6 << 1));
        int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
        c = i9 % 128;
        int i10 = i9 % 2;
        if (b == null) {
            f = new F();
            int i11 = c + 31;
            d = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 4 % 4;
            }
        } else {
            f = b;
        }
        int i13 = d + 37;
        c = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 5 % 4;
        }
        int i15 = 0;
        while (true) {
            Object obj = null;
            if (i15 >= arrayList.size()) {
                Collections.sort(arrayList2, new aY());
                arrayList2.add(0, new F(-1, str, BuildConfig.FLAVOR, -1, -1, BuildConfig.FLAVOR, -1, null, null, arrayList3));
                arrayList2.add(new F(OPTION_NOT_ALIVE_ID, "Not Alive", BuildConfig.FLAVOR, -1, -1, BuildConfig.FLAVOR, -1, null, null, arrayList3));
                F f2 = new F(OPTION_NOT_INLIST_ID, "Not In the Roster", BuildConfig.FLAVOR, -1, -1, BuildConfig.FLAVOR, -1, null, null, arrayList3);
                int i16 = d;
                int i17 = (i16 | 7) << 1;
                int i18 = -(((~i16) & 7) | (i16 & (-8)));
                int i19 = (i17 & i18) + (i18 | i17);
                c = i19 % 128;
                if (i19 % 2 == 0) {
                    arrayList2.add(f2);
                    throw null;
                }
                arrayList2.add(f2);
                int i20 = c;
                int i21 = ((i20 & (-52)) | ((~i20) & 51)) + ((i20 & 51) << 1);
                d = i21 % 128;
                if (i21 % 2 == 0) {
                    return arrayList2;
                }
                throw null;
            }
            int i22 = c;
            int i23 = i22 & 3;
            int i24 = ((i22 ^ 3) | i23) << 1;
            int i25 = -((i22 | 3) & (~i23));
            int i26 = (i24 & i25) + (i25 | i24);
            d = i26 % 128;
            if (i26 % 2 != 0) {
                String str2 = arrayList.get(i15).h;
                obj.hashCode();
                throw null;
            }
            B b2 = arrayList.get(i15);
            if (!(!b2.h.equalsIgnoreCase("male"))) {
                int i27 = d;
                int i28 = i27 & 39;
                int i29 = ((((i27 ^ 39) | i28) << 1) - (~(-((i27 | 39) & (~i28))))) - 1;
                c = i29 % 128;
                int i30 = i29 % 2;
                if (b2.d != f.d) {
                    int i31 = d;
                    int i32 = (i31 ^ 13) + ((i31 & 13) << 1);
                    c = i32 % 128;
                    int i33 = i32 % 2;
                    if (b2.f > f.f) {
                        int i34 = c;
                        int i35 = i34 & 15;
                        int i36 = (i34 | 15) & (~i35);
                        int i37 = -(-(i35 << 1));
                        int i38 = ((i36 | i37) << 1) - (i36 ^ i37);
                        d = i38 % 128;
                        if (i38 % 2 != 0) {
                            arrayList2.add(b2);
                            if (i == 5) {
                                int i39 = c;
                                int i40 = i39 & 17;
                                int i41 = i40 + ((i39 ^ 17) | i40);
                                d = i41 % 128;
                                int i42 = i41 % 2;
                                int i43 = b2.f;
                                int i44 = -f.f;
                                int i45 = i43 & i44;
                                i2 = (i43 | i44) & (~i45);
                                i3 = -(-(i45 << 1));
                                if ((i2 ^ i3) + ((i2 & i3) << 1) < 13.0d) {
                                    int i46 = d;
                                    int i47 = ((i46 | 107) << 1) - (i46 ^ 107);
                                    c = i47 % 128;
                                    int i48 = i47 % 2;
                                    arrayList2.remove(b2);
                                    int i49 = c + 51;
                                    d = i49 % 128;
                                    int i50 = i49 % 2;
                                }
                            }
                        } else {
                            arrayList2.add(b2);
                            if (i == 2) {
                                int i310 = c;
                                int i410 = i310 & 17;
                                int i411 = i410 + ((i310 ^ 17) | i410);
                                d = i411 % 128;
                                int i412 = i411 % 2;
                                int i413 = b2.f;
                                int i414 = -f.f;
                                int i415 = i413 & i414;
                                i2 = (i413 | i414) & (~i415);
                                i3 = -(-(i415 << 1));
                                if ((i2 ^ i3) + ((i2 & i3) << 1) < 13.0d) {
                                    int i416 = d;
                                    int i417 = ((i416 | 107) << 1) - (i416 ^ 107);
                                    c = i417 % 128;
                                    int i418 = i417 % 2;
                                    arrayList2.remove(b2);
                                    int i419 = c + 51;
                                    d = i419 % 128;
                                    int i51 = i419 % 2;
                                }
                            }
                        }
                        if (i == 1) {
                            int i52 = d;
                            int i53 = i52 & 25;
                            int i54 = -(-((i52 ^ 25) | i53));
                            int i55 = (i53 ^ i54) + ((i54 & i53) << 1);
                            c = i55 % 128;
                            int i56 = i55 % 2;
                            int i57 = b2.j;
                            if (i57 != 201) {
                                int i58 = c + 83;
                                int i59 = i58 % 128;
                                d = i59;
                                if (i58 % 2 == 0 ? i57 != 204 : i57 != 7950) {
                                    int i60 = i59 + 99;
                                    c = i60 % 128;
                                    int i61 = i60 % 2;
                                    arrayList2.remove(b2);
                                    int i62 = d + 13;
                                    c = i62 % 128;
                                    int i63 = i62 % 2;
                                }
                            }
                        }
                        if (i == 2) {
                            int i64 = d;
                            int i65 = i64 ^ 123;
                            int i66 = ((i64 & 123) | i65) << 1;
                            int i67 = -i65;
                            int i68 = ((i66 | i67) << 1) - (i66 ^ i67);
                            c = i68 % 128;
                            if (i68 % 2 != 0 ? b2.f < 10 : b2.f < 42) {
                                arrayList2.remove(b2);
                                int i69 = d;
                                int i70 = (i69 & 59) + (i69 | 59);
                                c = i70 % 128;
                                int i71 = i70 % 2;
                            } else {
                                int i72 = d + 49;
                                c = i72 % 128;
                                if (i72 % 2 == 0) {
                                    if (b2.j == 23097) {
                                        arrayList2.remove(b2);
                                        int i610 = d;
                                        int i73 = (i610 & 59) + (i610 | 59);
                                        c = i73 % 128;
                                        int i74 = i73 % 2;
                                    }
                                } else if (b2.j == 200) {
                                    arrayList2.remove(b2);
                                    int i611 = d;
                                    int i75 = (i611 & 59) + (i611 | 59);
                                    c = i75 % 128;
                                    int i76 = i75 % 2;
                                }
                            }
                        }
                    }
                }
            }
            int i77 = i15 ^ 103;
            int i78 = (((i15 & 103) | i77) << 1) - i77;
            int i79 = i78 & (-102);
            i15 = (((i78 | (-102)) & (~i79)) - (~(i79 << 1))) - 1;
            int i80 = d;
            int i81 = (((i80 & (-30)) | ((~i80) & 29)) - (~((i80 & 29) << 1))) - 1;
            c = i81 % 128;
            int i82 = i81 % 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01f7 A[Catch: Exception -> 0x0330, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0330, blocks: (B:9:0x0049, B:11:0x004d, B:14:0x0061, B:16:0x0067, B:19:0x0082, B:27:0x009a, B:29:0x00ac, B:32:0x00bc, B:36:0x00d3, B:39:0x00ea, B:82:0x01b0, B:83:0x01b3, B:40:0x00ed, B:45:0x0106, B:47:0x010c, B:56:0x011a, B:59:0x012d, B:155:0x02c2, B:158:0x02d7, B:163:0x02ea, B:165:0x02fd, B:167:0x030d, B:161:0x02e1, B:61:0x013a, B:62:0x013c, B:63:0x013f, B:54:0x0114, B:66:0x0142, B:69:0x015a, B:71:0x0172, B:73:0x0189, B:77:0x01a7, B:78:0x01ac, B:87:0x01b7, B:88:0x01bc, B:92:0x01c0, B:93:0x01c3, B:97:0x01c7, B:100:0x01db, B:103:0x01f7, B:109:0x021c, B:112:0x022f, B:114:0x0234, B:123:0x024a, B:120:0x023b, B:125:0x0259, B:126:0x025e, B:127:0x0261, B:130:0x0264, B:132:0x0280, B:133:0x0283, B:134:0x0286, B:137:0x0289, B:138:0x028b, B:139:0x028e, B:142:0x0291, B:145:0x02a5, B:147:0x02ab, B:151:0x02be, B:170:0x0327, B:171:0x032a, B:172:0x032d), top: B:178:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:107:0x0201  */
    /* JADX WARN: Code duplicated, block: B:109:0x021c A[Catch: Exception -> 0x0330, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0330, blocks: (B:9:0x0049, B:11:0x004d, B:14:0x0061, B:16:0x0067, B:19:0x0082, B:27:0x009a, B:29:0x00ac, B:32:0x00bc, B:36:0x00d3, B:39:0x00ea, B:82:0x01b0, B:83:0x01b3, B:40:0x00ed, B:45:0x0106, B:47:0x010c, B:56:0x011a, B:59:0x012d, B:155:0x02c2, B:158:0x02d7, B:163:0x02ea, B:165:0x02fd, B:167:0x030d, B:161:0x02e1, B:61:0x013a, B:62:0x013c, B:63:0x013f, B:54:0x0114, B:66:0x0142, B:69:0x015a, B:71:0x0172, B:73:0x0189, B:77:0x01a7, B:78:0x01ac, B:87:0x01b7, B:88:0x01bc, B:92:0x01c0, B:93:0x01c3, B:97:0x01c7, B:100:0x01db, B:103:0x01f7, B:109:0x021c, B:112:0x022f, B:114:0x0234, B:123:0x024a, B:120:0x023b, B:125:0x0259, B:126:0x025e, B:127:0x0261, B:130:0x0264, B:132:0x0280, B:133:0x0283, B:134:0x0286, B:137:0x0289, B:138:0x028b, B:139:0x028e, B:142:0x0291, B:145:0x02a5, B:147:0x02ab, B:151:0x02be, B:170:0x0327, B:171:0x032a, B:172:0x032d), top: B:178:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x022f A[Catch: Exception -> 0x0330, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0330, blocks: (B:9:0x0049, B:11:0x004d, B:14:0x0061, B:16:0x0067, B:19:0x0082, B:27:0x009a, B:29:0x00ac, B:32:0x00bc, B:36:0x00d3, B:39:0x00ea, B:82:0x01b0, B:83:0x01b3, B:40:0x00ed, B:45:0x0106, B:47:0x010c, B:56:0x011a, B:59:0x012d, B:155:0x02c2, B:158:0x02d7, B:163:0x02ea, B:165:0x02fd, B:167:0x030d, B:161:0x02e1, B:61:0x013a, B:62:0x013c, B:63:0x013f, B:54:0x0114, B:66:0x0142, B:69:0x015a, B:71:0x0172, B:73:0x0189, B:77:0x01a7, B:78:0x01ac, B:87:0x01b7, B:88:0x01bc, B:92:0x01c0, B:93:0x01c3, B:97:0x01c7, B:100:0x01db, B:103:0x01f7, B:109:0x021c, B:112:0x022f, B:114:0x0234, B:123:0x024a, B:120:0x023b, B:125:0x0259, B:126:0x025e, B:127:0x0261, B:130:0x0264, B:132:0x0280, B:133:0x0283, B:134:0x0286, B:137:0x0289, B:138:0x028b, B:139:0x028e, B:142:0x0291, B:145:0x02a5, B:147:0x02ab, B:151:0x02be, B:170:0x0327, B:171:0x032a, B:172:0x032d), top: B:178:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:120:0x023b A[Catch: Exception -> 0x0330, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0330, blocks: (B:9:0x0049, B:11:0x004d, B:14:0x0061, B:16:0x0067, B:19:0x0082, B:27:0x009a, B:29:0x00ac, B:32:0x00bc, B:36:0x00d3, B:39:0x00ea, B:82:0x01b0, B:83:0x01b3, B:40:0x00ed, B:45:0x0106, B:47:0x010c, B:56:0x011a, B:59:0x012d, B:155:0x02c2, B:158:0x02d7, B:163:0x02ea, B:165:0x02fd, B:167:0x030d, B:161:0x02e1, B:61:0x013a, B:62:0x013c, B:63:0x013f, B:54:0x0114, B:66:0x0142, B:69:0x015a, B:71:0x0172, B:73:0x0189, B:77:0x01a7, B:78:0x01ac, B:87:0x01b7, B:88:0x01bc, B:92:0x01c0, B:93:0x01c3, B:97:0x01c7, B:100:0x01db, B:103:0x01f7, B:109:0x021c, B:112:0x022f, B:114:0x0234, B:123:0x024a, B:120:0x023b, B:125:0x0259, B:126:0x025e, B:127:0x0261, B:130:0x0264, B:132:0x0280, B:133:0x0283, B:134:0x0286, B:137:0x0289, B:138:0x028b, B:139:0x028e, B:142:0x0291, B:145:0x02a5, B:147:0x02ab, B:151:0x02be, B:170:0x0327, B:171:0x032a, B:172:0x032d), top: B:178:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x0240  */
    /* JADX WARN: Code duplicated, block: B:125:0x0259 A[Catch: Exception -> 0x0330, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0330, blocks: (B:9:0x0049, B:11:0x004d, B:14:0x0061, B:16:0x0067, B:19:0x0082, B:27:0x009a, B:29:0x00ac, B:32:0x00bc, B:36:0x00d3, B:39:0x00ea, B:82:0x01b0, B:83:0x01b3, B:40:0x00ed, B:45:0x0106, B:47:0x010c, B:56:0x011a, B:59:0x012d, B:155:0x02c2, B:158:0x02d7, B:163:0x02ea, B:165:0x02fd, B:167:0x030d, B:161:0x02e1, B:61:0x013a, B:62:0x013c, B:63:0x013f, B:54:0x0114, B:66:0x0142, B:69:0x015a, B:71:0x0172, B:73:0x0189, B:77:0x01a7, B:78:0x01ac, B:87:0x01b7, B:88:0x01bc, B:92:0x01c0, B:93:0x01c3, B:97:0x01c7, B:100:0x01db, B:103:0x01f7, B:109:0x021c, B:112:0x022f, B:114:0x0234, B:123:0x024a, B:120:0x023b, B:125:0x0259, B:126:0x025e, B:127:0x0261, B:130:0x0264, B:132:0x0280, B:133:0x0283, B:134:0x0286, B:137:0x0289, B:138:0x028b, B:139:0x028e, B:142:0x0291, B:145:0x02a5, B:147:0x02ab, B:151:0x02be, B:170:0x0327, B:171:0x032a, B:172:0x032d), top: B:178:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:132:0x0280 A[Catch: Exception -> 0x0330, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0330, blocks: (B:9:0x0049, B:11:0x004d, B:14:0x0061, B:16:0x0067, B:19:0x0082, B:27:0x009a, B:29:0x00ac, B:32:0x00bc, B:36:0x00d3, B:39:0x00ea, B:82:0x01b0, B:83:0x01b3, B:40:0x00ed, B:45:0x0106, B:47:0x010c, B:56:0x011a, B:59:0x012d, B:155:0x02c2, B:158:0x02d7, B:163:0x02ea, B:165:0x02fd, B:167:0x030d, B:161:0x02e1, B:61:0x013a, B:62:0x013c, B:63:0x013f, B:54:0x0114, B:66:0x0142, B:69:0x015a, B:71:0x0172, B:73:0x0189, B:77:0x01a7, B:78:0x01ac, B:87:0x01b7, B:88:0x01bc, B:92:0x01c0, B:93:0x01c3, B:97:0x01c7, B:100:0x01db, B:103:0x01f7, B:109:0x021c, B:112:0x022f, B:114:0x0234, B:123:0x024a, B:120:0x023b, B:125:0x0259, B:126:0x025e, B:127:0x0261, B:130:0x0264, B:132:0x0280, B:133:0x0283, B:134:0x0286, B:137:0x0289, B:138:0x028b, B:139:0x028e, B:142:0x0291, B:145:0x02a5, B:147:0x02ab, B:151:0x02be, B:170:0x0327, B:171:0x032a, B:172:0x032d), top: B:178:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:142:0x0291 A[Catch: Exception -> 0x0330, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0330, blocks: (B:9:0x0049, B:11:0x004d, B:14:0x0061, B:16:0x0067, B:19:0x0082, B:27:0x009a, B:29:0x00ac, B:32:0x00bc, B:36:0x00d3, B:39:0x00ea, B:82:0x01b0, B:83:0x01b3, B:40:0x00ed, B:45:0x0106, B:47:0x010c, B:56:0x011a, B:59:0x012d, B:155:0x02c2, B:158:0x02d7, B:163:0x02ea, B:165:0x02fd, B:167:0x030d, B:161:0x02e1, B:61:0x013a, B:62:0x013c, B:63:0x013f, B:54:0x0114, B:66:0x0142, B:69:0x015a, B:71:0x0172, B:73:0x0189, B:77:0x01a7, B:78:0x01ac, B:87:0x01b7, B:88:0x01bc, B:92:0x01c0, B:93:0x01c3, B:97:0x01c7, B:100:0x01db, B:103:0x01f7, B:109:0x021c, B:112:0x022f, B:114:0x0234, B:123:0x024a, B:120:0x023b, B:125:0x0259, B:126:0x025e, B:127:0x0261, B:130:0x0264, B:132:0x0280, B:133:0x0283, B:134:0x0286, B:137:0x0289, B:138:0x028b, B:139:0x028e, B:142:0x0291, B:145:0x02a5, B:147:0x02ab, B:151:0x02be, B:170:0x0327, B:171:0x032a, B:172:0x032d), top: B:178:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:145:0x02a5 A[Catch: Exception -> 0x0330, TRY_ENTER, TryCatch #1 {Exception -> 0x0330, blocks: (B:9:0x0049, B:11:0x004d, B:14:0x0061, B:16:0x0067, B:19:0x0082, B:27:0x009a, B:29:0x00ac, B:32:0x00bc, B:36:0x00d3, B:39:0x00ea, B:82:0x01b0, B:83:0x01b3, B:40:0x00ed, B:45:0x0106, B:47:0x010c, B:56:0x011a, B:59:0x012d, B:155:0x02c2, B:158:0x02d7, B:163:0x02ea, B:165:0x02fd, B:167:0x030d, B:161:0x02e1, B:61:0x013a, B:62:0x013c, B:63:0x013f, B:54:0x0114, B:66:0x0142, B:69:0x015a, B:71:0x0172, B:73:0x0189, B:77:0x01a7, B:78:0x01ac, B:87:0x01b7, B:88:0x01bc, B:92:0x01c0, B:93:0x01c3, B:97:0x01c7, B:100:0x01db, B:103:0x01f7, B:109:0x021c, B:112:0x022f, B:114:0x0234, B:123:0x024a, B:120:0x023b, B:125:0x0259, B:126:0x025e, B:127:0x0261, B:130:0x0264, B:132:0x0280, B:133:0x0283, B:134:0x0286, B:137:0x0289, B:138:0x028b, B:139:0x028e, B:142:0x0291, B:145:0x02a5, B:147:0x02ab, B:151:0x02be, B:170:0x0327, B:171:0x032a, B:172:0x032d), top: B:178:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:147:0x02ab A[Catch: Exception -> 0x0330, TRY_LEAVE, TryCatch #1 {Exception -> 0x0330, blocks: (B:9:0x0049, B:11:0x004d, B:14:0x0061, B:16:0x0067, B:19:0x0082, B:27:0x009a, B:29:0x00ac, B:32:0x00bc, B:36:0x00d3, B:39:0x00ea, B:82:0x01b0, B:83:0x01b3, B:40:0x00ed, B:45:0x0106, B:47:0x010c, B:56:0x011a, B:59:0x012d, B:155:0x02c2, B:158:0x02d7, B:163:0x02ea, B:165:0x02fd, B:167:0x030d, B:161:0x02e1, B:61:0x013a, B:62:0x013c, B:63:0x013f, B:54:0x0114, B:66:0x0142, B:69:0x015a, B:71:0x0172, B:73:0x0189, B:77:0x01a7, B:78:0x01ac, B:87:0x01b7, B:88:0x01bc, B:92:0x01c0, B:93:0x01c3, B:97:0x01c7, B:100:0x01db, B:103:0x01f7, B:109:0x021c, B:112:0x022f, B:114:0x0234, B:123:0x024a, B:120:0x023b, B:125:0x0259, B:126:0x025e, B:127:0x0261, B:130:0x0264, B:132:0x0280, B:133:0x0283, B:134:0x0286, B:137:0x0289, B:138:0x028b, B:139:0x028e, B:142:0x0291, B:145:0x02a5, B:147:0x02ab, B:151:0x02be, B:170:0x0327, B:171:0x032a, B:172:0x032d), top: B:178:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:170:0x0327 A[Catch: Exception -> 0x0330, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0330, blocks: (B:9:0x0049, B:11:0x004d, B:14:0x0061, B:16:0x0067, B:19:0x0082, B:27:0x009a, B:29:0x00ac, B:32:0x00bc, B:36:0x00d3, B:39:0x00ea, B:82:0x01b0, B:83:0x01b3, B:40:0x00ed, B:45:0x0106, B:47:0x010c, B:56:0x011a, B:59:0x012d, B:155:0x02c2, B:158:0x02d7, B:163:0x02ea, B:165:0x02fd, B:167:0x030d, B:161:0x02e1, B:61:0x013a, B:62:0x013c, B:63:0x013f, B:54:0x0114, B:66:0x0142, B:69:0x015a, B:71:0x0172, B:73:0x0189, B:77:0x01a7, B:78:0x01ac, B:87:0x01b7, B:88:0x01bc, B:92:0x01c0, B:93:0x01c3, B:97:0x01c7, B:100:0x01db, B:103:0x01f7, B:109:0x021c, B:112:0x022f, B:114:0x0234, B:123:0x024a, B:120:0x023b, B:125:0x0259, B:126:0x025e, B:127:0x0261, B:130:0x0264, B:132:0x0280, B:133:0x0283, B:134:0x0286, B:137:0x0289, B:138:0x028b, B:139:0x028e, B:142:0x0291, B:145:0x02a5, B:147:0x02ab, B:151:0x02be, B:170:0x0327, B:171:0x032a, B:172:0x032d), top: B:178:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:199:0x02be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x011a A[Catch: Exception -> 0x0330, TRY_LEAVE, TryCatch #1 {Exception -> 0x0330, blocks: (B:9:0x0049, B:11:0x004d, B:14:0x0061, B:16:0x0067, B:19:0x0082, B:27:0x009a, B:29:0x00ac, B:32:0x00bc, B:36:0x00d3, B:39:0x00ea, B:82:0x01b0, B:83:0x01b3, B:40:0x00ed, B:45:0x0106, B:47:0x010c, B:56:0x011a, B:59:0x012d, B:155:0x02c2, B:158:0x02d7, B:163:0x02ea, B:165:0x02fd, B:167:0x030d, B:161:0x02e1, B:61:0x013a, B:62:0x013c, B:63:0x013f, B:54:0x0114, B:66:0x0142, B:69:0x015a, B:71:0x0172, B:73:0x0189, B:77:0x01a7, B:78:0x01ac, B:87:0x01b7, B:88:0x01bc, B:92:0x01c0, B:93:0x01c3, B:97:0x01c7, B:100:0x01db, B:103:0x01f7, B:109:0x021c, B:112:0x022f, B:114:0x0234, B:123:0x024a, B:120:0x023b, B:125:0x0259, B:126:0x025e, B:127:0x0261, B:130:0x0264, B:132:0x0280, B:133:0x0283, B:134:0x0286, B:137:0x0289, B:138:0x028b, B:139:0x028e, B:142:0x0291, B:145:0x02a5, B:147:0x02ab, B:151:0x02be, B:170:0x0327, B:171:0x032a, B:172:0x032d), top: B:178:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x012d A[Catch: Exception -> 0x0330, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0330, blocks: (B:9:0x0049, B:11:0x004d, B:14:0x0061, B:16:0x0067, B:19:0x0082, B:27:0x009a, B:29:0x00ac, B:32:0x00bc, B:36:0x00d3, B:39:0x00ea, B:82:0x01b0, B:83:0x01b3, B:40:0x00ed, B:45:0x0106, B:47:0x010c, B:56:0x011a, B:59:0x012d, B:155:0x02c2, B:158:0x02d7, B:163:0x02ea, B:165:0x02fd, B:167:0x030d, B:161:0x02e1, B:61:0x013a, B:62:0x013c, B:63:0x013f, B:54:0x0114, B:66:0x0142, B:69:0x015a, B:71:0x0172, B:73:0x0189, B:77:0x01a7, B:78:0x01ac, B:87:0x01b7, B:88:0x01bc, B:92:0x01c0, B:93:0x01c3, B:97:0x01c7, B:100:0x01db, B:103:0x01f7, B:109:0x021c, B:112:0x022f, B:114:0x0234, B:123:0x024a, B:120:0x023b, B:125:0x0259, B:126:0x025e, B:127:0x0261, B:130:0x0264, B:132:0x0280, B:133:0x0283, B:134:0x0286, B:137:0x0289, B:138:0x028b, B:139:0x028e, B:142:0x0291, B:145:0x02a5, B:147:0x02ab, B:151:0x02be, B:170:0x0327, B:171:0x032a, B:172:0x032d), top: B:178:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x013a A[Catch: Exception -> 0x0330, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0330, blocks: (B:9:0x0049, B:11:0x004d, B:14:0x0061, B:16:0x0067, B:19:0x0082, B:27:0x009a, B:29:0x00ac, B:32:0x00bc, B:36:0x00d3, B:39:0x00ea, B:82:0x01b0, B:83:0x01b3, B:40:0x00ed, B:45:0x0106, B:47:0x010c, B:56:0x011a, B:59:0x012d, B:155:0x02c2, B:158:0x02d7, B:163:0x02ea, B:165:0x02fd, B:167:0x030d, B:161:0x02e1, B:61:0x013a, B:62:0x013c, B:63:0x013f, B:54:0x0114, B:66:0x0142, B:69:0x015a, B:71:0x0172, B:73:0x0189, B:77:0x01a7, B:78:0x01ac, B:87:0x01b7, B:88:0x01bc, B:92:0x01c0, B:93:0x01c3, B:97:0x01c7, B:100:0x01db, B:103:0x01f7, B:109:0x021c, B:112:0x022f, B:114:0x0234, B:123:0x024a, B:120:0x023b, B:125:0x0259, B:126:0x025e, B:127:0x0261, B:130:0x0264, B:132:0x0280, B:133:0x0283, B:134:0x0286, B:137:0x0289, B:138:0x028b, B:139:0x028e, B:142:0x0291, B:145:0x02a5, B:147:0x02ab, B:151:0x02be, B:170:0x0327, B:171:0x032a, B:172:0x032d), top: B:178:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0142 A[Catch: Exception -> 0x0330, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0330, blocks: (B:9:0x0049, B:11:0x004d, B:14:0x0061, B:16:0x0067, B:19:0x0082, B:27:0x009a, B:29:0x00ac, B:32:0x00bc, B:36:0x00d3, B:39:0x00ea, B:82:0x01b0, B:83:0x01b3, B:40:0x00ed, B:45:0x0106, B:47:0x010c, B:56:0x011a, B:59:0x012d, B:155:0x02c2, B:158:0x02d7, B:163:0x02ea, B:165:0x02fd, B:167:0x030d, B:161:0x02e1, B:61:0x013a, B:62:0x013c, B:63:0x013f, B:54:0x0114, B:66:0x0142, B:69:0x015a, B:71:0x0172, B:73:0x0189, B:77:0x01a7, B:78:0x01ac, B:87:0x01b7, B:88:0x01bc, B:92:0x01c0, B:93:0x01c3, B:97:0x01c7, B:100:0x01db, B:103:0x01f7, B:109:0x021c, B:112:0x022f, B:114:0x0234, B:123:0x024a, B:120:0x023b, B:125:0x0259, B:126:0x025e, B:127:0x0261, B:130:0x0264, B:132:0x0280, B:133:0x0283, B:134:0x0286, B:137:0x0289, B:138:0x028b, B:139:0x028e, B:142:0x0291, B:145:0x02a5, B:147:0x02ab, B:151:0x02be, B:170:0x0327, B:171:0x032a, B:172:0x032d), top: B:178:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x015a A[Catch: Exception -> 0x0330, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0330, blocks: (B:9:0x0049, B:11:0x004d, B:14:0x0061, B:16:0x0067, B:19:0x0082, B:27:0x009a, B:29:0x00ac, B:32:0x00bc, B:36:0x00d3, B:39:0x00ea, B:82:0x01b0, B:83:0x01b3, B:40:0x00ed, B:45:0x0106, B:47:0x010c, B:56:0x011a, B:59:0x012d, B:155:0x02c2, B:158:0x02d7, B:163:0x02ea, B:165:0x02fd, B:167:0x030d, B:161:0x02e1, B:61:0x013a, B:62:0x013c, B:63:0x013f, B:54:0x0114, B:66:0x0142, B:69:0x015a, B:71:0x0172, B:73:0x0189, B:77:0x01a7, B:78:0x01ac, B:87:0x01b7, B:88:0x01bc, B:92:0x01c0, B:93:0x01c3, B:97:0x01c7, B:100:0x01db, B:103:0x01f7, B:109:0x021c, B:112:0x022f, B:114:0x0234, B:123:0x024a, B:120:0x023b, B:125:0x0259, B:126:0x025e, B:127:0x0261, B:130:0x0264, B:132:0x0280, B:133:0x0283, B:134:0x0286, B:137:0x0289, B:138:0x028b, B:139:0x028e, B:142:0x0291, B:145:0x02a5, B:147:0x02ab, B:151:0x02be, B:170:0x0327, B:171:0x032a, B:172:0x032d), top: B:178:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a7 A[Catch: Exception -> 0x0330, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0330, blocks: (B:9:0x0049, B:11:0x004d, B:14:0x0061, B:16:0x0067, B:19:0x0082, B:27:0x009a, B:29:0x00ac, B:32:0x00bc, B:36:0x00d3, B:39:0x00ea, B:82:0x01b0, B:83:0x01b3, B:40:0x00ed, B:45:0x0106, B:47:0x010c, B:56:0x011a, B:59:0x012d, B:155:0x02c2, B:158:0x02d7, B:163:0x02ea, B:165:0x02fd, B:167:0x030d, B:161:0x02e1, B:61:0x013a, B:62:0x013c, B:63:0x013f, B:54:0x0114, B:66:0x0142, B:69:0x015a, B:71:0x0172, B:73:0x0189, B:77:0x01a7, B:78:0x01ac, B:87:0x01b7, B:88:0x01bc, B:92:0x01c0, B:93:0x01c3, B:97:0x01c7, B:100:0x01db, B:103:0x01f7, B:109:0x021c, B:112:0x022f, B:114:0x0234, B:123:0x024a, B:120:0x023b, B:125:0x0259, B:126:0x025e, B:127:0x0261, B:130:0x0264, B:132:0x0280, B:133:0x0283, B:134:0x0286, B:137:0x0289, B:138:0x028b, B:139:0x028e, B:142:0x0291, B:145:0x02a5, B:147:0x02ab, B:151:0x02be, B:170:0x0327, B:171:0x032a, B:172:0x032d), top: B:178:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x01c7 A[Catch: Exception -> 0x0330, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0330, blocks: (B:9:0x0049, B:11:0x004d, B:14:0x0061, B:16:0x0067, B:19:0x0082, B:27:0x009a, B:29:0x00ac, B:32:0x00bc, B:36:0x00d3, B:39:0x00ea, B:82:0x01b0, B:83:0x01b3, B:40:0x00ed, B:45:0x0106, B:47:0x010c, B:56:0x011a, B:59:0x012d, B:155:0x02c2, B:158:0x02d7, B:163:0x02ea, B:165:0x02fd, B:167:0x030d, B:161:0x02e1, B:61:0x013a, B:62:0x013c, B:63:0x013f, B:54:0x0114, B:66:0x0142, B:69:0x015a, B:71:0x0172, B:73:0x0189, B:77:0x01a7, B:78:0x01ac, B:87:0x01b7, B:88:0x01bc, B:92:0x01c0, B:93:0x01c3, B:97:0x01c7, B:100:0x01db, B:103:0x01f7, B:109:0x021c, B:112:0x022f, B:114:0x0234, B:123:0x024a, B:120:0x023b, B:125:0x0259, B:126:0x025e, B:127:0x0261, B:130:0x0264, B:132:0x0280, B:133:0x0283, B:134:0x0286, B:137:0x0289, B:138:0x028b, B:139:0x028e, B:142:0x0291, B:145:0x02a5, B:147:0x02ab, B:151:0x02be, B:170:0x0327, B:171:0x032a, B:172:0x032d), top: B:178:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x01cb  */
    private void disableSelectedSpouse(B b, B b2, B b3, Spinner spinner, List<B> list, boolean z) {
        List<ae> list2;
        int i;
        int i2;
        List<ae> list3;
        int i3;
        int i4;
        F f;
        int i5;
        int i6;
        Activity activity;
        StringBuilder sb;
        int i7;
        int i8;
        F f2;
        int i9;
        int i10 = 2 % 2;
        int i11 = c;
        int i12 = i11 & 57;
        int i13 = (i11 ^ 57) | i12;
        int i14 = (i12 & i13) + (i12 | i13);
        d = i14 % 128;
        int i15 = i14 % 2;
        Object obj = null;
        try {
            if (!(b3 instanceof F)) {
                list2 = ((F) b3).a;
                int i16 = d;
                i = ((i16 | 61) << 1) - (i16 ^ 61);
                c = i % 128;
                if (i % 2 != 0) {
                    list2.contains(b2);
                    obj.hashCode();
                    throw null;
                }
                if (list2.contains(b2)) {
                    ((F) b3).a.remove(b2);
                    i2 = d + 45;
                    c = i2 % 128;
                    if (i2 % 2 == 0) {
                        throw null;
                    }
                }
            } else {
                int i17 = (i11 | 125) << 1;
                int i18 = -(i11 ^ 125);
                int i19 = (i17 ^ i18) + ((i17 & i18) << 1);
                d = i19 % 128;
                int i20 = i19 % 2;
                if (b instanceof ae) {
                    int i21 = i11 & 107;
                    int i22 = ((i11 | 107) & (~i21)) + (i21 << 1);
                    d = i22 % 128;
                    if (i22 % 2 != 0) {
                        int i23 = b.d;
                        obj.hashCode();
                        throw null;
                    }
                    if (b.d > 0) {
                        List<ae> list4 = ((F) b3).a;
                        int i24 = d;
                        int i25 = i24 & 91;
                        int i26 = i25 + ((i24 ^ 91) | i25);
                        c = i26 % 128;
                        if (i26 % 2 == 0) {
                            list4.contains(b);
                            throw null;
                        }
                        if (!list4.contains(b)) {
                            List<ae> list5 = ((F) b3).a;
                            F f3 = (F) b3;
                            int i27 = d;
                            int i28 = i27 & 41;
                            int i29 = (i27 ^ 41) | i28;
                            int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
                            c = i30 % 128;
                            if (i30 % 2 == 0) {
                                f3.a.contains(b2);
                                throw null;
                            }
                            if (!(!f3.a.contains(b2))) {
                                if (b2 instanceof ae) {
                                    int i31 = d + 11;
                                    c = i31 % 128;
                                    int i32 = i31 % 2;
                                    F f4 = ((ae) b2).a;
                                    int i33 = c;
                                    int i34 = (i33 ^ 13) + ((i33 & 13) << 1);
                                    int i35 = i34 % 128;
                                    d = i35;
                                    int i36 = i34 % 2;
                                    if (f4 == ((F) b3)) {
                                        int i37 = ((i35 & 14) + (i35 | 14)) - 1;
                                        c = i37 % 128;
                                        int i38 = i37 % 2;
                                        ((ae) b2).a = null;
                                        int i39 = c;
                                        int i40 = ((i39 ^ 104) + ((i39 & 104) << 1)) - 1;
                                        d = i40 % 128;
                                        if (i40 % 2 != 0) {
                                            int i41 = 3 / 2;
                                        }
                                    }
                                }
                                List<ae> list6 = ((F) b3).a;
                                int i42 = c;
                                int i43 = i42 & 87;
                                int i44 = (i42 ^ 87) | i43;
                                int i45 = ((i43 | i44) << 1) - (i44 ^ i43);
                                d = i45 % 128;
                                if (i45 % 2 != 0) {
                                    list6.remove(b2);
                                    throw null;
                                }
                                list6.remove(b2);
                            }
                            if (list5.size() < 5) {
                                int i46 = c;
                                int i47 = i46 & 67;
                                int i48 = i46 | 67;
                                int i49 = (i47 ^ i48) + ((i48 & i47) << 1);
                                d = i49 % 128;
                                if (i49 % 2 != 0) {
                                    int i50 = 37 / 0;
                                    if (!list5.contains(b)) {
                                        list5.add((ae) b);
                                        f2 = (F) b3;
                                        i9 = d + 55;
                                        c = i9 % 128;
                                        if (i9 % 2 != 0) {
                                            f2.a = list5;
                                            obj.hashCode();
                                            throw null;
                                        }
                                        f2.a = list5;
                                        int i51 = d + 111;
                                        c = i51 % 128;
                                        int i52 = i51 % 2;
                                    } else {
                                        activity = getActivity();
                                        sb = new StringBuilder();
                                        int i53 = d + 56;
                                        i7 = (i53 ^ (-1)) + (i53 << 1);
                                        c = i7 % 128;
                                        if (i7 % 2 == 0) {
                                            sb.append(b3.e);
                                            throw null;
                                        }
                                        sb.append(b3.e);
                                        int i54 = d;
                                        int i55 = i54 ^ 81;
                                        int i56 = -(-((i54 & 81) << 1));
                                        int i57 = (i55 ^ i56) + ((i56 & i55) << 1);
                                        c = i57 % 128;
                                        int i58 = i57 % 2;
                                        sb.append(" already have 4 wives");
                                        int i59 = c;
                                        int i60 = i59 & 71;
                                        int i61 = -(-(i59 | 71));
                                        int i62 = (i60 ^ i61) + ((i61 & i60) << 1);
                                        d = i62 % 128;
                                        int i63 = i62 % 2;
                                        Toast.makeText(activity, sb.toString(), 0).show();
                                        int i64 = c;
                                        int i65 = i64 & 115;
                                        i8 = i65 + ((i64 ^ 115) | i65);
                                        d = i8 % 128;
                                        if (i8 % 2 != 0) {
                                            int i66 = 3 % 2;
                                        }
                                    }
                                } else if (list5.contains(b)) {
                                    activity = getActivity();
                                    sb = new StringBuilder();
                                    int i510 = d + 56;
                                    i7 = (i510 ^ (-1)) + (i510 << 1);
                                    c = i7 % 128;
                                    if (i7 % 2 == 0) {
                                        sb.append(b3.e);
                                        throw null;
                                    }
                                    sb.append(b3.e);
                                    int i511 = d;
                                    int i512 = i511 ^ 81;
                                    int i513 = -(-((i511 & 81) << 1));
                                    int i514 = (i512 ^ i513) + ((i513 & i512) << 1);
                                    c = i514 % 128;
                                    int i515 = i514 % 2;
                                    sb.append(" already have 4 wives");
                                    int i516 = c;
                                    int i67 = i516 & 71;
                                    int i68 = -(-(i516 | 71));
                                    int i69 = (i67 ^ i68) + ((i68 & i67) << 1);
                                    d = i69 % 128;
                                    int i610 = i69 % 2;
                                    Toast.makeText(activity, sb.toString(), 0).show();
                                    int i611 = c;
                                    int i612 = i611 & 115;
                                    i8 = i612 + ((i611 ^ 115) | i612);
                                    d = i8 % 128;
                                    if (i8 % 2 != 0) {
                                        int i613 = 3 % 2;
                                    }
                                } else {
                                    list5.add((ae) b);
                                    f2 = (F) b3;
                                    i9 = d + 55;
                                    c = i9 % 128;
                                    if (i9 % 2 != 0) {
                                        f2.a = list5;
                                        obj.hashCode();
                                        throw null;
                                    }
                                    f2.a = list5;
                                    int i517 = d + 111;
                                    c = i517 % 128;
                                    int i518 = i517 % 2;
                                }
                            } else {
                                activity = getActivity();
                                sb = new StringBuilder();
                                int i519 = d + 56;
                                i7 = (i519 ^ (-1)) + (i519 << 1);
                                c = i7 % 128;
                                if (i7 % 2 == 0) {
                                    sb.append(b3.e);
                                    throw null;
                                }
                                sb.append(b3.e);
                                int i5110 = d;
                                int i5111 = i5110 ^ 81;
                                int i5112 = -(-((i5110 & 81) << 1));
                                int i5113 = (i5111 ^ i5112) + ((i5112 & i5111) << 1);
                                c = i5113 % 128;
                                int i5114 = i5113 % 2;
                                sb.append(" already have 4 wives");
                                int i5115 = c;
                                int i614 = i5115 & 71;
                                int i615 = -(-(i5115 | 71));
                                int i616 = (i614 ^ i615) + ((i615 & i614) << 1);
                                d = i616 % 128;
                                int i617 = i616 % 2;
                                Toast.makeText(activity, sb.toString(), 0).show();
                                int i618 = c;
                                int i619 = i618 & 115;
                                i8 = i619 + ((i618 ^ 115) | i619);
                                d = i8 % 128;
                                if (i8 % 2 != 0) {
                                    int i6110 = 3 % 2;
                                }
                            }
                        } else if (b.d < 0) {
                            int i70 = c;
                            int i71 = (-2) - (((i70 & 68) + (i70 | 68)) ^ (-1));
                            d = i71 % 128;
                            int i72 = i71 % 2;
                            list3 = ((F) b3).a;
                            int i73 = c;
                            int i74 = i73 & 119;
                            int i75 = (i73 | 119) & (~i74);
                            int i76 = -(-(i74 << 1));
                            i3 = (i75 ^ i76) + ((i75 & i76) << 1);
                            d = i3 % 128;
                            if (i3 % 2 == 0) {
                                list3.contains(b2);
                                obj.hashCode();
                                throw null;
                            }
                            if (list3.contains(b2)) {
                                if (b2 instanceof ae) {
                                    int i77 = d;
                                    int i78 = ((i77 ^ 51) | (i77 & 51)) << 1;
                                    int i79 = -(((~i77) & 51) | (i77 & (-52)));
                                    i4 = (i78 ^ i79) + ((i79 & i78) << 1);
                                    c = i4 % 128;
                                    if (i4 % 2 != 0) {
                                        F f5 = ((ae) b2).a;
                                        obj.hashCode();
                                        throw null;
                                    }
                                    f = ((ae) b2).a;
                                    int i80 = c;
                                    i5 = (i80 & 13) + (i80 | 13);
                                    i6 = i5 % 128;
                                    d = i6;
                                    if (i5 % 2 != 0) {
                                        int i81 = 9 / 0;
                                        if (f == ((F) b3)) {
                                            int i82 = (i6 & 53) + (i6 | 53);
                                            c = i82 % 128;
                                            int i83 = i82 % 2;
                                            ((ae) b2).a = null;
                                            int i84 = c + 47;
                                            d = i84 % 128;
                                            int i85 = i84 % 2;
                                        }
                                    } else if (f == ((F) b3)) {
                                        int i86 = (i6 & 53) + (i6 | 53);
                                        c = i86 % 128;
                                        int i87 = i86 % 2;
                                        ((ae) b2).a = null;
                                        int i88 = c + 47;
                                        d = i88 % 128;
                                        int i89 = i88 % 2;
                                    }
                                }
                                ((F) b3).a.remove(b2);
                                int i90 = c + 97;
                                int i91 = i90 % 128;
                                d = i91;
                                int i92 = i90 % 2;
                                int i93 = ((i91 | 61) << 1) - (i91 ^ 61);
                                c = i93 % 128;
                                int i94 = i93 % 2;
                            }
                        }
                    } else if (b.d < 0) {
                        int i710 = c;
                        int i711 = (-2) - (((i710 & 68) + (i710 | 68)) ^ (-1));
                        d = i711 % 128;
                        int i712 = i711 % 2;
                        list3 = ((F) b3).a;
                        int i713 = c;
                        int i714 = i713 & 119;
                        int i715 = (i713 | 119) & (~i714);
                        int i716 = -(-(i714 << 1));
                        i3 = (i715 ^ i716) + ((i715 & i716) << 1);
                        d = i3 % 128;
                        if (i3 % 2 == 0) {
                            list3.contains(b2);
                            obj.hashCode();
                            throw null;
                        }
                        if (list3.contains(b2)) {
                            if (b2 instanceof ae) {
                                int i717 = d;
                                int i718 = ((i717 ^ 51) | (i717 & 51)) << 1;
                                int i719 = -(((~i717) & 51) | (i717 & (-52)));
                                i4 = (i718 ^ i719) + ((i719 & i718) << 1);
                                c = i4 % 128;
                                if (i4 % 2 != 0) {
                                    F f6 = ((ae) b2).a;
                                    obj.hashCode();
                                    throw null;
                                }
                                f = ((ae) b2).a;
                                int i810 = c;
                                i5 = (i810 & 13) + (i810 | 13);
                                i6 = i5 % 128;
                                d = i6;
                                if (i5 % 2 != 0) {
                                    int i811 = 9 / 0;
                                    if (f == ((F) b3)) {
                                        int i812 = (i6 & 53) + (i6 | 53);
                                        c = i812 % 128;
                                        int i813 = i812 % 2;
                                        ((ae) b2).a = null;
                                        int i814 = c + 47;
                                        d = i814 % 128;
                                        int i815 = i814 % 2;
                                    }
                                } else if (f == ((F) b3)) {
                                    int i816 = (i6 & 53) + (i6 | 53);
                                    c = i816 % 128;
                                    int i817 = i816 % 2;
                                    ((ae) b2).a = null;
                                    int i818 = c + 47;
                                    d = i818 % 128;
                                    int i819 = i818 % 2;
                                }
                            }
                            ((F) b3).a.remove(b2);
                            int i95 = c + 97;
                            int i96 = i95 % 128;
                            d = i96;
                            int i97 = i95 % 2;
                            int i98 = ((i96 | 61) << 1) - (i96 ^ 61);
                            c = i98 % 128;
                            int i99 = i98 % 2;
                        }
                    }
                } else {
                    list2 = ((F) b3).a;
                    int i110 = d;
                    i = ((i110 | 61) << 1) - (i110 ^ 61);
                    c = i % 128;
                    if (i % 2 != 0) {
                        list2.contains(b2);
                        obj.hashCode();
                        throw null;
                    }
                    if (list2.contains(b2)) {
                        ((F) b3).a.remove(b2);
                        i2 = d + 45;
                        c = i2 % 128;
                        if (i2 % 2 == 0) {
                            throw null;
                        }
                    }
                }
            }
            af afVar = (af) spinner.getAdapter();
            int i100 = (-2) - ((d + 72) ^ (-1));
            c = i100 % 128;
            if (i100 % 2 == 0) {
                afVar.d(list.indexOf(b), true);
                if (z) {
                    af afVar2 = (af) spinner.getAdapter();
                    int iIndexOf = list.indexOf(b2);
                    int i101 = d + 105;
                    c = i101 % 128;
                    int i102 = i101 % 2;
                    afVar2.d(iIndexOf, true);
                    int i103 = d;
                    int i104 = i103 & 67;
                    int i105 = i104 + ((i103 ^ 67) | i104);
                    c = i105 % 128;
                    int i106 = i105 % 2;
                }
            } else {
                afVar.d(list.indexOf(b), false);
                if (z) {
                    af afVar3 = (af) spinner.getAdapter();
                    int iIndexOf2 = list.indexOf(b2);
                    int i107 = d + 105;
                    c = i107 % 128;
                    int i108 = i107 % 2;
                    afVar3.d(iIndexOf2, true);
                    int i109 = d;
                    int i1010 = i109 & 67;
                    int i1011 = i1010 + ((i109 ^ 67) | i1010);
                    c = i1011 % 128;
                    int i1012 = i1011 % 2;
                }
            }
            ((af) spinner.getAdapter()).notifyDataSetChanged();
            int i111 = c;
            int i112 = ((i111 | 87) << 1) - (((~i111) & 87) | (i111 & (-88)));
            d = i112 % 128;
            int i113 = i112 % 2;
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0108 A[Catch: Exception -> 0x0272, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x0272, blocks: (B:4:0x0020, B:6:0x002b, B:8:0x003b, B:11:0x0056, B:14:0x0070, B:17:0x0091, B:20:0x00c3, B:25:0x00dd, B:27:0x00e3, B:35:0x00f0, B:38:0x0108, B:40:0x010d, B:46:0x0115, B:49:0x012b, B:50:0x0137, B:45:0x0112, B:33:0x00ea, B:53:0x0150, B:55:0x0156, B:58:0x0172, B:60:0x017a, B:66:0x0185, B:68:0x019b, B:65:0x017f, B:73:0x01b6, B:75:0x01bc, B:77:0x01d2, B:80:0x01e8, B:83:0x01fc, B:87:0x021c, B:88:0x0220, B:84:0x0205, B:92:0x022e, B:93:0x0234, B:94:0x0237, B:18:0x009c, B:98:0x0266, B:99:0x026e, B:5:0x0026), top: B:162:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0112 A[Catch: Exception -> 0x0272, TRY_ENTER, TryCatch #3 {Exception -> 0x0272, blocks: (B:4:0x0020, B:6:0x002b, B:8:0x003b, B:11:0x0056, B:14:0x0070, B:17:0x0091, B:20:0x00c3, B:25:0x00dd, B:27:0x00e3, B:35:0x00f0, B:38:0x0108, B:40:0x010d, B:46:0x0115, B:49:0x012b, B:50:0x0137, B:45:0x0112, B:33:0x00ea, B:53:0x0150, B:55:0x0156, B:58:0x0172, B:60:0x017a, B:66:0x0185, B:68:0x019b, B:65:0x017f, B:73:0x01b6, B:75:0x01bc, B:77:0x01d2, B:80:0x01e8, B:83:0x01fc, B:87:0x021c, B:88:0x0220, B:84:0x0205, B:92:0x022e, B:93:0x0234, B:94:0x0237, B:18:0x009c, B:98:0x0266, B:99:0x026e, B:5:0x0026), top: B:162:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:49:0x012b A[Catch: Exception -> 0x0272, TRY_ENTER, TryCatch #3 {Exception -> 0x0272, blocks: (B:4:0x0020, B:6:0x002b, B:8:0x003b, B:11:0x0056, B:14:0x0070, B:17:0x0091, B:20:0x00c3, B:25:0x00dd, B:27:0x00e3, B:35:0x00f0, B:38:0x0108, B:40:0x010d, B:46:0x0115, B:49:0x012b, B:50:0x0137, B:45:0x0112, B:33:0x00ea, B:53:0x0150, B:55:0x0156, B:58:0x0172, B:60:0x017a, B:66:0x0185, B:68:0x019b, B:65:0x017f, B:73:0x01b6, B:75:0x01bc, B:77:0x01d2, B:80:0x01e8, B:83:0x01fc, B:87:0x021c, B:88:0x0220, B:84:0x0205, B:92:0x022e, B:93:0x0234, B:94:0x0237, B:18:0x009c, B:98:0x0266, B:99:0x026e, B:5:0x0026), top: B:162:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0137 A[Catch: Exception -> 0x0272, TRY_LEAVE, TryCatch #3 {Exception -> 0x0272, blocks: (B:4:0x0020, B:6:0x002b, B:8:0x003b, B:11:0x0056, B:14:0x0070, B:17:0x0091, B:20:0x00c3, B:25:0x00dd, B:27:0x00e3, B:35:0x00f0, B:38:0x0108, B:40:0x010d, B:46:0x0115, B:49:0x012b, B:50:0x0137, B:45:0x0112, B:33:0x00ea, B:53:0x0150, B:55:0x0156, B:58:0x0172, B:60:0x017a, B:66:0x0185, B:68:0x019b, B:65:0x017f, B:73:0x01b6, B:75:0x01bc, B:77:0x01d2, B:80:0x01e8, B:83:0x01fc, B:87:0x021c, B:88:0x0220, B:84:0x0205, B:92:0x022e, B:93:0x0234, B:94:0x0237, B:18:0x009c, B:98:0x0266, B:99:0x026e, B:5:0x0026), top: B:162:0x001e }] */
    @Override // ivas.gov.bisp.enumeration.X.e
    public boolean isValid() throws Throwable {
        ScrollView scrollView;
        int i;
        Spinner spinner;
        View childAt;
        Activity activity;
        StringBuilder sb;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = d;
        int i6 = i5 & 95;
        int i7 = -(-((i5 ^ 95) | i6));
        int i8 = i6 ^ i7;
        int i9 = i7 & i6;
        boolean z = true;
        int i10 = i8 + (i9 << 1);
        c = i10 % 128;
        int i11 = 5;
        Throwable th = null;
        try {
            if (i10 % 2 == 0) {
                scrollView = (ScrollView) this.parentView;
                i = 1;
            } else {
                scrollView = (ScrollView) this.parentView;
                i = 0;
            }
            LinearLayout linearLayout = (LinearLayout) scrollView.getChildAt(i);
            int i12 = d + 25;
            c = i12 % 128;
            int i13 = i12 % 2;
            int i14 = 0;
            while (true) {
                if (i14 >= linearLayout.getChildCount()) {
                    int i15 = d;
                    int i16 = i15 & 43;
                    int i17 = (i15 ^ 43) | i16;
                    int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
                    c = i18 % 128;
                    int i19 = i18 % 2;
                    boolean zIsValidDifference = true;
                    int i20 = 0;
                    while (i20 < this.mPersonList.size()) {
                        int i21 = d + 73;
                        c = i21 % 128;
                        int i22 = i21 % 2;
                        int i23 = 0;
                        while (i23 < this.mPersonList.size()) {
                            int i24 = c;
                            int i25 = i24 & 31;
                            int i26 = (i24 ^ 31) | i25;
                            int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
                            d = i27 % 128;
                            if (i27 % 2 != 0) {
                                this.mPersonList.get(i20);
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                            B b = this.mPersonList.get(i20);
                            B b2 = this.mPersonList.get(i23);
                            int i28 = d;
                            int i29 = (i28 & 123) + (i28 | 123);
                            c = i29 % 128;
                            int i30 = i29 % 2;
                            if (b.d != b2.d) {
                                int i31 = d;
                                int i32 = ((i31 | 105) << 1) - (i31 ^ 105);
                                c = i32 % 128;
                                if (i32 % 2 == 0) {
                                    Throwable th2 = th;
                                    int i33 = b.c.d;
                                    B b3 = b2.c;
                                    throw th2;
                                }
                                int i34 = b.c.d;
                                B b4 = b2.c;
                                int i35 = d;
                                int i36 = ((((~i35) & 41) | (i35 & (-42))) - (~((i35 & 41) << 1))) - 1;
                                c = i36 % 128;
                                int i37 = i36 % 2;
                                if (i34 == b4.d) {
                                    int i38 = d;
                                    int i39 = i38 & 57;
                                    int i40 = (i38 ^ 57) | i39;
                                    int i41 = (i39 ^ i40) + ((i39 & i40) << 1);
                                    c = i41 % 128;
                                    int i42 = i41 % 2;
                                    if (i34 != -1) {
                                        int i43 = (i38 | 5) << 1;
                                        int i44 = -((i38 & (-6)) | ((~i38) & 5));
                                        int i45 = (i43 ^ i44) + ((i43 & i44) << 1);
                                        c = i45 % 128;
                                        int i46 = i45 % 2;
                                        if (i34 != OPTION_NOT_ALIVE_ID) {
                                            int i47 = i38 + 107;
                                            c = i47 % 128;
                                            if (i47 % 2 != 0 ? i34 != OPTION_NOT_INLIST_ID : i34 != 32) {
                                                String str = b.i;
                                                String str2 = b2.i;
                                                int i48 = c;
                                                int i49 = (i48 & (-6)) | ((~i48) & 5);
                                                int i50 = -(-((i48 & 5) << 1));
                                                int i51 = (i49 & i50) + (i50 | i49);
                                                d = i51 % 128;
                                                int i52 = i51 % 2;
                                                zIsValidDifference = isValidDifference(str, str2);
                                                if (!zIsValidDifference) {
                                                    Activity activity2 = getActivity();
                                                    StringBuilder sb2 = new StringBuilder();
                                                    int i53 = d;
                                                    int i54 = i53 & 5;
                                                    int i55 = (i53 ^ 5) | i54;
                                                    int i56 = ((i54 | i55) << 1) - (i55 ^ i54);
                                                    c = i56 % 128;
                                                    if (i56 % 2 == 0) {
                                                        sb2.append(b.e);
                                                        throw null;
                                                    }
                                                    sb2.append(b.e);
                                                    sb2.append(" and ");
                                                    String str3 = b2.e;
                                                    int i57 = c;
                                                    int i58 = (i57 ^ 95) + ((i57 & 95) << 1);
                                                    d = i58 % 128;
                                                    if (i58 % 2 != 0) {
                                                        sb2.append(str3);
                                                        Object obj2 = null;
                                                        obj2.hashCode();
                                                        throw null;
                                                    }
                                                    sb2.append(str3);
                                                    sb2.append(" should have age difference of 6 months or above");
                                                    Toast toastMakeText = Toast.makeText(activity2, sb2.toString(), 0);
                                                    int i59 = c;
                                                    int i60 = i59 & 69;
                                                    int i61 = -(-((i59 ^ 69) | i60));
                                                    int i62 = (i60 & i61) + (i61 | i60);
                                                    d = i62 % 128;
                                                    int i63 = i62 % 2;
                                                    toastMakeText.show();
                                                    int i64 = c;
                                                    int i65 = (i64 | 117) << 1;
                                                    int i66 = -(((~i64) & 117) | (i64 & (-118)));
                                                    int i67 = ((i65 | i66) << 1) - (i66 ^ i65);
                                                    d = i67 % 128;
                                                    int i68 = i67 % 2;
                                                    return false;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            i23++;
                            int i69 = c + 77;
                            d = i69 % 128;
                            int i70 = i69 % 2;
                            th = null;
                        }
                        int i71 = i20 & 1;
                        i20 = ((i20 ^ 1) | i71) + i71;
                        int i72 = d;
                        int i73 = (i72 & 107) + (i72 | 107);
                        c = i73 % 128;
                        int i74 = i73 % 2;
                        th = null;
                    }
                    if (zIsValidDifference) {
                        ActivityBeginSurvey activityBeginSurvey = (ActivityBeginSurvey) getActivity();
                        ArrayList<B> arrayList = this.mPersonList;
                        int i75 = d;
                        int i76 = ((i75 ^ 33) | (i75 & 33)) << 1;
                        int i77 = -(((~i75) & 33) | (i75 & (-34)));
                        int i78 = ((i76 | i77) << 1) - (i77 ^ i76);
                        c = i78 % 128;
                        int i79 = i78 % 2;
                        activityBeginSurvey.ar = arrayList;
                        return true;
                    }
                    int i80 = d;
                    int i81 = (i80 & 59) + (i80 | 59);
                    int i82 = i81 % 128;
                    c = i82;
                    int i83 = i81 % 2;
                    int i84 = i82 & 113;
                    int i85 = (i82 | 113) & (~i84);
                    int i86 = i84 << 1;
                    int i87 = (i85 ^ i86) + ((i85 & i86) << 1);
                    d = i87 % 128;
                    if (i87 % 2 == 0) {
                        return false;
                    }
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
                int i88 = c;
                int i89 = (((i88 ^ 15) | (i88 & 15)) << 1) - (((~i88) & 15) | (i88 & (-16)));
                d = i89 % 128;
                int i90 = i89 % 2;
                LinearLayout linearLayout2 = (LinearLayout) linearLayout.getChildAt(i14);
                ArrayList<B> arrayList2 = this.mPersonList;
                int i91 = c;
                int i92 = (-2) - (((i91 & 52) + (i91 | 52)) ^ (-1));
                d = i92 % 128;
                if (i92 % 2 != 0) {
                    String str4 = arrayList2.get(i14).e;
                    throw null;
                }
                String str5 = arrayList2.get(i14).e;
                Spinner spinner2 = (Spinner) linearLayout2.getChildAt(1);
                int i93 = d;
                int i94 = i93 & 13;
                int i95 = (i93 ^ 13) | i94;
                int i96 = (i94 ^ i95) + ((i95 & i94) << 1);
                c = i96 % 128;
                if (i96 % 2 == 0) {
                    spinner = (Spinner) linearLayout2.getChildAt(i11);
                    childAt = linearLayout2.getChildAt(2);
                } else {
                    spinner = (Spinner) linearLayout2.getChildAt(2);
                    childAt = linearLayout2.getChildAt(3);
                }
                int i97 = c;
                int i98 = ((i97 ^ 123) | (i97 & 123)) << 1;
                int i99 = -((i97 & (-124)) | ((~i97) & 123));
                int i100 = (i98 ^ i99) + ((i99 & i98) << 1);
                d = i100 % 128;
                int i101 = i100 % 2;
                Spinner spinner3 = (Spinner) childAt;
                if (spinner2.getVisibility() == 0) {
                    int i102 = c;
                    int i103 = (i102 ^ 123) + ((i102 & 123) << 1);
                    d = i103 % 128;
                    if (i103 % 2 != 0) {
                        int selectedItemPosition = spinner2.getSelectedItemPosition();
                        int i104 = 87 / 0;
                        if (selectedItemPosition == 0) {
                            activity = getActivity();
                            sb = new StringBuilder();
                            int i105 = d;
                            i2 = (i105 ^ 41) + ((i105 & 41) << 1);
                            c = i2 % 128;
                            if (i2 % 2 == 0) {
                                sb.append("Select ");
                                int i106 = 87 / 0;
                            } else {
                                sb.append("Select ");
                            }
                            sb.append(str5);
                            sb.append("'s spouse");
                            i3 = (-2) - ((d + 28) ^ (-1));
                            c = i3 % 128;
                            if (i3 % 2 == 0) {
                                Toast.makeText(activity, sb.toString(), 0).show();
                            } else {
                                Toast.makeText(activity, sb.toString(), 0).show();
                            }
                            int i107 = d;
                            int i108 = (i107 ^ 89) + ((i107 & 89) << 1);
                            c = i108 % 128;
                            int i109 = i108 % 2;
                            return false;
                        }
                    } else if (spinner2.getSelectedItemPosition() == 0) {
                        activity = getActivity();
                        sb = new StringBuilder();
                        int i1010 = d;
                        i2 = (i1010 ^ 41) + ((i1010 & 41) << 1);
                        c = i2 % 128;
                        if (i2 % 2 == 0) {
                            sb.append("Select ");
                            int i1011 = 87 / 0;
                        } else {
                            sb.append("Select ");
                        }
                        sb.append(str5);
                        sb.append("'s spouse");
                        i3 = (-2) - ((d + 28) ^ (-1));
                        c = i3 % 128;
                        if (i3 % 2 == 0) {
                            Toast.makeText(activity, sb.toString(), 0).show();
                        } else {
                            Toast.makeText(activity, sb.toString(), 0).show();
                        }
                        int i1012 = d;
                        int i1013 = (i1012 ^ 89) + ((i1012 & 89) << 1);
                        c = i1013 % 128;
                        int i1014 = i1013 % 2;
                        return false;
                    }
                }
                if (spinner.getSelectedItemPosition() == 0) {
                    Activity activity3 = getActivity();
                    StringBuilder sb3 = new StringBuilder();
                    int i110 = d;
                    int i111 = i110 & 83;
                    int i112 = (i111 - (~(-(-((i110 ^ 83) | i111))))) - 1;
                    c = i112 % 128;
                    if (i112 % 2 == 0) {
                        sb3.append("Select ");
                        sb3.append(str5);
                        int i113 = 48 / 0;
                    } else {
                        sb3.append("Select ");
                        sb3.append(str5);
                    }
                    sb3.append("'s father");
                    int i114 = d;
                    int i115 = (i114 ^ 42) + ((i114 & 42) << 1);
                    int i116 = (i115 ^ (-1)) + (i115 << 1);
                    c = i116 % 128;
                    int i117 = i116 % 2;
                    Toast.makeText(activity3, sb3.toString(), 0).show();
                    int i118 = c;
                    int i119 = (i118 & 123) + (i118 | 123);
                    d = i119 % 128;
                    if (i119 % 2 == 0) {
                        return false;
                    }
                    throw null;
                }
                if (spinner3.getSelectedItemPosition() == 0) {
                    Activity activity4 = getActivity();
                    StringBuilder sb4 = new StringBuilder();
                    int i120 = c;
                    int i121 = (i120 ^ 59) + ((i120 & 59) << 1);
                    d = i121 % 128;
                    int i122 = i121 % 2;
                    sb4.append("Select ");
                    int i123 = c;
                    int i124 = i123 & 29;
                    int i125 = ((i123 | 29) & (~i124)) + (i124 << 1);
                    d = i125 % 128;
                    if (i125 % 2 != 0) {
                        sb4.append(str5);
                        sb4.append("'s mother");
                        th.hashCode();
                        throw null;
                    }
                    sb4.append(str5);
                    sb4.append("'s mother");
                    int i126 = (-2) - ((d + 4) ^ (-1));
                    c = i126 % 128;
                    Toast toastMakeText2 = i126 % 2 == 0 ? Toast.makeText(activity4, sb4.toString(), 1) : Toast.makeText(activity4, sb4.toString(), 0);
                    int i127 = c;
                    int i128 = (i127 ^ 49) + ((i127 & 49) << 1);
                    d = i128 % 128;
                    if (i128 % 2 != 0) {
                        toastMakeText2.show();
                    } else {
                        toastMakeText2.show();
                        z = false;
                    }
                    int i129 = c + 47;
                    d = i129 % 128;
                    int i130 = i129 % 2;
                    return z;
                }
                int i131 = i14 ^ 29;
                int i132 = ((i14 & 29) | i131) << 1;
                int i133 = -i131;
                int i134 = (i132 & i133) + (i133 | i132);
                i14 = ((i134 & (-28)) - (~(-(-(i134 | (-28)))))) - 1;
                int i135 = d;
                int i136 = i135 | 79;
                int i137 = ((i136 << 1) - (~(-((~(i135 & 79)) & i136)))) - 1;
                c = i137 % 128;
                int i138 = i137 % 2;
                i11 = 5;
            }
        } catch (Exception unused) {
            Toast.makeText(getActivity(), "Something went wrong.", 0).show();
        }
    }

    /* JADX WARN: Code duplicated, block: B:125:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:127:0x051b  */
    /* JADX WARN: Code duplicated, block: B:173:0x0528 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0233 A[PHI: r5
  0x0233: PHI (r5v105 ivas.gov.bisp.enumeration.bG.ae) = (r5v104 ivas.gov.bisp.enumeration.bG.ae), (r5v114 ivas.gov.bisp.enumeration.bG.ae) binds: [B:56:0x0231, B:53:0x0224] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x0260  */
    /* JADX WARN: Code duplicated, block: B:60:0x026b  */
    @Override // ivas.gov.bisp.enumeration.X.e
    public void parseJson() {
        Spinner spinner;
        B b;
        Roster roster;
        int i;
        Roster roster2;
        int i2;
        Roster roster3;
        int i3;
        ArrayList<Roster> arrayList;
        ai aiVar;
        ae aeVar;
        Roster roster4;
        int i4;
        int i5;
        int i6 = 2 % 2;
        LinearLayout linearLayout = (LinearLayout) ((ScrollView) this.parentView).getChildAt(0);
        int i7 = d + 17;
        c = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 4 % 4;
        }
        int i9 = 0;
        while (i9 < this.mPersonList.size()) {
            int i10 = d;
            int i11 = i10 & 53;
            int i12 = (i10 ^ 53) | i11;
            int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
            c = i13 % 128;
            View childAt = i13 % 2 == 0 ? ((LinearLayout) linearLayout.getChildAt(i9)).getChildAt(0) : ((LinearLayout) linearLayout.getChildAt(i9)).getChildAt(1);
            int i14 = c;
            int i15 = ((i14 | 61) << 1) - (i14 ^ 61);
            d = i15 % 128;
            if (i15 % 2 != 0) {
                spinner = (Spinner) childAt;
                b = this.mPersonList.get(i9);
                int i16 = 85 / 0;
            } else {
                spinner = (Spinner) childAt;
                b = this.mPersonList.get(i9);
            }
            Object obj = null;
            if (b instanceof F) {
                int i17 = c;
                int i18 = i17 & 25;
                int i19 = (i18 - (~((i17 ^ 25) | i18))) - 1;
                d = i19 % 128;
                int i20 = i19 % 2;
                ae aeVar2 = (ae) spinner.getSelectedItem();
                if (aeVar2.d >= 0) {
                    int i21 = c;
                    int i22 = i21 & 77;
                    int i23 = (i21 ^ 77) | i22;
                    int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
                    d = i24 % 128;
                    if (i24 % 2 != 0) {
                        List<ae> list = ((F) this.mPersonList.get(i9)).a;
                        throw null;
                    }
                    F f = (F) this.mPersonList.get(i9);
                    List<ae> list2 = f.a;
                    int i25 = d;
                    int i26 = ((i25 | 97) << 1) - (i25 ^ 97);
                    c = i26 % 128;
                    if (i26 % 2 == 0) {
                        throw null;
                    }
                    if (list2 != null && list2.size() > 0) {
                        int i27 = d;
                        int i28 = i27 & 37;
                        int i29 = (i27 | 37) & (~i28);
                        int i30 = -(-(i28 << 1));
                        int i31 = ((i29 | i30) << 1) - (i29 ^ i30);
                        c = i31 % 128;
                        int i32 = i31 % 2 == 0 ? 1 : 0;
                        String string = BuildConfig.FLAVOR;
                        while (i32 < f.a.size()) {
                            StringBuilder sb = new StringBuilder();
                            List<ae> list3 = f.a;
                            int i33 = d;
                            int i34 = i33 & 21;
                            int i35 = i34 + ((i33 ^ 21) | i34);
                            c = i35 % 128;
                            if (i35 % 2 == 0) {
                                int i36 = list3.get(i32).d;
                                obj.hashCode();
                                throw null;
                            }
                            sb.append(list3.get(i32).d);
                            sb.append(",");
                            sb.append(string);
                            string = sb.toString();
                            int i37 = i32 ^ (-85);
                            int i38 = (((i32 & (-85)) | i37) << 1) - i37;
                            int i39 = i38 ^ 86;
                            int i40 = -(-((i38 & 86) << 1));
                            i32 = ((i40 & i39) << 1) + (i39 ^ i40);
                            int i41 = d;
                            int i42 = i41 & 85;
                            int i43 = -(-((i41 ^ 85) | i42));
                            int i44 = ((i42 | i43) << 1) - (i43 ^ i42);
                            c = i44 % 128;
                            int i45 = i44 % 2;
                        }
                        Roster roster5 = ((ActivityBeginSurvey) getActivity()).aq.get(i9);
                        int i46 = c;
                        int i47 = (((i46 & (-28)) | ((~i46) & 27)) - (~((i46 & 27) << 1))) - 1;
                        d = i47 % 128;
                        int i48 = i47 % 2;
                        int length = string.length();
                        int i49 = ~length;
                        int i50 = length << 1;
                        roster5.id_spouse = string.substring(0, ((i49 | i50) << 1) - (i50 ^ i49));
                        int i51 = c;
                        int i52 = (i51 & (-114)) | ((~i51) & 113);
                        int i53 = (i51 & 113) << 1;
                        int i54 = (i52 ^ i53) + ((i53 & i52) << 1);
                        d = i54 % 128;
                        int i55 = i54 % 2;
                    }
                } else {
                    Roster roster6 = ((ActivityBeginSurvey) getActivity()).aq.get(i9);
                    int i56 = d + 81;
                    c = i56 % 128;
                    int i57 = i56 % 2;
                    int i58 = aeVar2.d;
                    int i59 = c;
                    int i60 = i59 & 59;
                    int i61 = (i59 | 59) & (~i60);
                    int i62 = i60 << 1;
                    int i63 = ((i61 | i62) << 1) - (i61 ^ i62);
                    d = i63 % 128;
                    int i64 = i63 % 2;
                    roster6.id_spouse = String.valueOf(i58);
                    int i65 = d;
                    int i66 = (i65 ^ 72) + ((i65 & 72) << 1);
                    int i67 = (i66 ^ (-1)) + (i66 << 1);
                    c = i67 % 128;
                    int i68 = i67 % 2;
                }
            } else if (this.mPersonList.get(i9) instanceof ae) {
                int i69 = d;
                int i70 = (i69 ^ 39) + ((i69 & 39) << 1);
                c = i70 % 128;
                if (i70 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                F f2 = (F) spinner.getSelectedItem();
                if (f2.d >= 0) {
                    int i71 = c;
                    int i72 = ((i71 | 70) << 1) - (i71 ^ 70);
                    int i73 = (i72 ^ (-1)) + (i72 << 1);
                    d = i73 % 128;
                    if (i73 % 2 != 0) {
                        aeVar = (ae) this.mPersonList.get(i9);
                        int i74 = 98 / 0;
                        if (aeVar.a != null) {
                            int i75 = d + 100;
                            int i76 = (i75 ^ (-1)) + (i75 << 1);
                            c = i76 % 128;
                            int i77 = i76 % 2;
                            roster4 = ((ActivityBeginSurvey) getActivity()).aq.get(i9);
                            i4 = aeVar.a.d;
                            int i78 = c;
                            i5 = (i78 & 17) + (i78 | 17);
                            d = i5 % 128;
                            if (i5 % 2 != 0) {
                                roster4.id_spouse = String.valueOf(i4);
                                int i79 = 48 / 0;
                            } else {
                                roster4.id_spouse = String.valueOf(i4);
                            }
                        }
                    } else {
                        aeVar = (ae) this.mPersonList.get(i9);
                        if (aeVar.a != null) {
                            int i710 = d + 100;
                            int i711 = (i710 ^ (-1)) + (i710 << 1);
                            c = i711 % 128;
                            int i712 = i711 % 2;
                            roster4 = ((ActivityBeginSurvey) getActivity()).aq.get(i9);
                            i4 = aeVar.a.d;
                            int i713 = c;
                            i5 = (i713 & 17) + (i713 | 17);
                            d = i5 % 128;
                            if (i5 % 2 != 0) {
                                roster4.id_spouse = String.valueOf(i4);
                                int i714 = 48 / 0;
                            } else {
                                roster4.id_spouse = String.valueOf(i4);
                            }
                        }
                    }
                } else {
                    Roster roster7 = ((ActivityBeginSurvey) getActivity()).aq.get(i9);
                    int i80 = d + 25;
                    c = i80 % 128;
                    if (i80 % 2 == 0) {
                        int i81 = f2.d;
                        obj.hashCode();
                        throw null;
                    }
                    int i82 = f2.d;
                    int i83 = d;
                    int i84 = i83 & 121;
                    int i85 = (((i83 | 121) & (~i84)) - (~(i84 << 1))) - 1;
                    c = i85 % 128;
                    int i86 = i85 % 2;
                    roster7.id_spouse = String.valueOf(i82);
                    int i87 = c;
                    int i88 = (i87 & 33) + (i87 | 33);
                    d = i88 % 128;
                    int i89 = i88 % 2;
                }
            } else if (this.mPersonList.get(i9) instanceof ai) {
                int i90 = c;
                int i91 = i90 & 21;
                int i92 = (i91 - (~(-(-((i90 ^ 21) | i91))))) - 1;
                d = i92 % 128;
                int i93 = i92 % 2;
                if (spinner.getSelectedItem() instanceof F) {
                    int i94 = c;
                    int i95 = (i94 ^ 123) + ((i94 & 123) << 1);
                    d = i95 % 128;
                    int i96 = i95 % 2;
                    F f3 = (F) spinner.getSelectedItem();
                    if (f3.d >= 0) {
                        int i97 = c;
                        int i98 = ((i97 & 61) - (~(-(-(i97 | 61))))) - 1;
                        d = i98 % 128;
                        if (i98 % 2 != 0) {
                            aiVar = (ai) this.mPersonList.get(i9);
                            int i99 = 85 / 0;
                        } else {
                            aiVar = (ai) this.mPersonList.get(i9);
                        }
                        int i100 = (-2) - ((c + 52) ^ (-1));
                        d = i100 % 128;
                        int i101 = i100 % 2;
                        if (aiVar.a != null) {
                            Roster roster8 = ((ActivityBeginSurvey) getActivity()).aq.get(i9);
                            int i102 = d + 111;
                            c = i102 % 128;
                            int i103 = i102 % 2;
                            Roster roster9 = roster8;
                            int i104 = aiVar.a.d;
                            int i105 = d;
                            int i106 = i105 & 99;
                            int i107 = ((i105 | 99) & (~i106)) + (i106 << 1);
                            c = i107 % 128;
                            if (i107 % 2 == 0) {
                                roster9.id_spouse = String.valueOf(i104);
                                throw null;
                            }
                            roster9.id_spouse = String.valueOf(i104);
                            int i108 = c;
                            int i109 = i108 & 63;
                            int i110 = ((i108 ^ 63) | i109) << 1;
                            int i111 = -((i108 | 63) & (~i109));
                            int i112 = (i110 ^ i111) + ((i111 & i110) << 1);
                            d = i112 % 128;
                            int i113 = i112 % 2;
                        }
                    } else {
                        Roster roster10 = ((ActivityBeginSurvey) getActivity()).aq.get(i9);
                        int i114 = d;
                        int i115 = i114 ^ 81;
                        int i116 = (i114 & 81) << 1;
                        int i117 = (i115 & i116) + (i116 | i115);
                        c = i117 % 128;
                        if (i117 % 2 == 0) {
                            roster10.id_spouse = String.valueOf(f3.d);
                            throw null;
                        }
                        roster10.id_spouse = String.valueOf(f3.d);
                        int i118 = c;
                        int i119 = i118 & 9;
                        int i120 = (i118 ^ 9) | i119;
                        int i121 = (i119 & i120) + (i120 | i119);
                        d = i121 % 128;
                        int i122 = i121 % 2;
                    }
                } else if (spinner.getSelectedItem() instanceof ae) {
                    ae aeVar3 = (ae) spinner.getSelectedItem();
                    if (aeVar3.d >= 0) {
                        int i123 = c;
                        int i124 = (-2) - (((i123 & 62) + (i123 | 62)) ^ (-1));
                        d = i124 % 128;
                        if (i124 % 2 != 0) {
                            B b2 = ((ai) this.mPersonList.get(i9)).a;
                            throw null;
                        }
                        ai aiVar2 = (ai) this.mPersonList.get(i9);
                        if (aiVar2.a != null) {
                            int i125 = d;
                            int i126 = i125 ^ 39;
                            int i127 = ((((i125 & 39) | i126) << 1) - (~(-i126))) - 1;
                            c = i127 % 128;
                            if (i127 % 2 == 0) {
                                arrayList = ((ActivityBeginSurvey) getActivity()).aq;
                                int i128 = 40 / 0;
                            } else {
                                arrayList = ((ActivityBeginSurvey) getActivity()).aq;
                            }
                            Roster roster11 = arrayList.get(i9);
                            B b3 = aiVar2.a;
                            int i129 = d + 17;
                            c = i129 % 128;
                            if (i129 % 2 == 0) {
                                roster11.id_spouse = String.valueOf(b3.d);
                                obj.hashCode();
                                throw null;
                            }
                            roster11.id_spouse = String.valueOf(b3.d);
                        }
                    } else {
                        Roster roster12 = ((ActivityBeginSurvey) getActivity()).aq.get(i9);
                        int i130 = d;
                        int i131 = i130 & 35;
                        int i132 = -(-((i130 ^ 35) | i131));
                        int i133 = (i131 ^ i132) + ((i132 & i131) << 1);
                        c = i133 % 128;
                        if (i133 % 2 == 0) {
                            roster3 = roster12;
                            i3 = aeVar3.d;
                            int i134 = 51 / 0;
                        } else {
                            roster3 = roster12;
                            i3 = aeVar3.d;
                        }
                        roster3.id_spouse = String.valueOf(i3);
                        int i135 = c;
                        int i136 = i135 ^ 69;
                        int i137 = (i135 & 69) << 1;
                        int i138 = ((i136 | i137) << 1) - (i137 ^ i136);
                        d = i138 % 128;
                        int i139 = i138 % 2;
                    }
                } else {
                    ai aiVar3 = (ai) spinner.getSelectedItem();
                    int i140 = d;
                    int i141 = i140 & 125;
                    int i142 = (i140 ^ 125) | i141;
                    int i143 = (i141 ^ i142) + ((i142 & i141) << 1);
                    c = i143 % 128;
                    int i144 = i143 % 2;
                    if (aiVar3.d >= 0) {
                        int i145 = c;
                        int i146 = i145 & 15;
                        int i147 = ((i145 ^ 15) | i146) << 1;
                        int i148 = -((i145 | 15) & (~i146));
                        int i149 = (i147 & i148) + (i148 | i147);
                        d = i149 % 128;
                        if (i149 % 2 != 0) {
                            obj.hashCode();
                            throw null;
                        }
                        ai aiVar4 = (ai) this.mPersonList.get(i9);
                        int i150 = d + 79;
                        c = i150 % 128;
                        if (i150 % 2 == 0) {
                            int i151 = 90 / 0;
                            if (aiVar4.a != null) {
                                int i152 = d;
                                int i153 = i152 & 79;
                                int i154 = i152 | 79;
                                int i155 = (i153 & i154) + (i154 | i153);
                                c = i155 % 128;
                                int i156 = i155 % 2;
                                roster2 = ((ActivityBeginSurvey) getActivity()).aq.get(i9);
                                int i157 = c;
                                i2 = (((i157 | 104) << 1) - (i157 ^ 104)) - 1;
                                d = i2 % 128;
                                if (i2 % 2 == 0) {
                                    int i158 = aiVar4.a.d;
                                    obj.hashCode();
                                    throw null;
                                }
                                roster2.id_spouse = String.valueOf(aiVar4.a.d);
                            }
                        } else if (aiVar4.a != null) {
                            int i159 = d;
                            int i1510 = i159 & 79;
                            int i1511 = i159 | 79;
                            int i1512 = (i1510 & i1511) + (i1511 | i1510);
                            c = i1512 % 128;
                            int i1513 = i1512 % 2;
                            roster2 = ((ActivityBeginSurvey) getActivity()).aq.get(i9);
                            int i1514 = c;
                            i2 = (((i1514 | 104) << 1) - (i1514 ^ 104)) - 1;
                            d = i2 % 128;
                            if (i2 % 2 == 0) {
                                int i1515 = aiVar4.a.d;
                                obj.hashCode();
                                throw null;
                            }
                            roster2.id_spouse = String.valueOf(aiVar4.a.d);
                        }
                    } else {
                        ArrayList<Roster> arrayList2 = ((ActivityBeginSurvey) getActivity()).aq;
                        int i160 = c;
                        int i161 = ((i160 ^ 106) + ((i160 & 106) << 1)) - 1;
                        d = i161 % 128;
                        if (i161 % 2 != 0) {
                            roster = arrayList2.get(i9);
                            i = aiVar3.d;
                            int i162 = 73 / 0;
                        } else {
                            roster = arrayList2.get(i9);
                            i = aiVar3.d;
                        }
                        roster.id_spouse = String.valueOf(i);
                        int i163 = d;
                        int i164 = (i163 & 37) + (i163 | 37);
                        c = i164 % 128;
                        int i165 = i164 % 2;
                    }
                }
            }
            if (this.mPersonList.get(i9).k != null) {
                int i166 = d;
                int i167 = i166 & 21;
                int i168 = (i166 | 21) & (~i167);
                int i169 = i167 << 1;
                int i170 = ((i168 | i169) << 1) - (i168 ^ i169);
                c = i170 % 128;
                int i171 = i170 % 2;
                Roster roster13 = ((ActivityBeginSurvey) getActivity()).aq.get(i9);
                int i172 = d;
                int i173 = i172 ^ 55;
                int i174 = (((i172 & 55) | i173) << 1) - i173;
                c = i174 % 128;
                if (i174 % 2 == 0) {
                    B b4 = this.mPersonList.get(i9).k;
                    obj.hashCode();
                    throw null;
                }
                B b5 = this.mPersonList.get(i9).k;
                int i175 = d + 117;
                c = i175 % 128;
                int i176 = i175 % 2;
                roster13.id_father = b5.d;
            }
            if (this.mPersonList.get(i9).c != null) {
                int i177 = c;
                int i178 = ((i177 | 57) << 1) - (i177 ^ 57);
                d = i178 % 128;
                int i179 = i178 % 2;
                Roster roster14 = ((ActivityBeginSurvey) getActivity()).aq.get(i9);
                int i180 = (-2) - ((d + 90) ^ (-1));
                c = i180 % 128;
                if (i180 % 2 == 0) {
                    this.mPersonList.get(i9);
                    obj.hashCode();
                    throw null;
                }
                Roster roster15 = roster14;
                int i181 = this.mPersonList.get(i9).c.d;
                int i182 = c;
                int i183 = i182 & 63;
                int i184 = (i182 ^ 63) | i183;
                int i185 = (i183 ^ i184) + ((i184 & i183) << 1);
                d = i185 % 128;
                if (i185 % 2 != 0) {
                    roster15.id_mother = i181;
                    throw null;
                }
                roster15.id_mother = i181;
            }
            i9++;
            int i186 = d;
            int i187 = ((i186 | 121) << 1) - (i186 ^ 121);
            c = i187 % 128;
            if (i187 % 2 == 0) {
                int i188 = 3 / 4;
            }
        }
        int i189 = c;
        int i190 = (i189 & (-30)) | ((~i189) & 29);
        int i191 = (i189 & 29) << 1;
        int i192 = (i190 & i191) + (i191 | i190);
        d = i192 % 128;
        if (i192 % 2 != 0) {
            int i193 = 23 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x026f  */
    /* JADX WARN: Code duplicated, block: B:50:0x02b8 A[Catch: Exception -> 0x037c, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x037c, blocks: (B:3:0x0008, B:6:0x00e9, B:9:0x0104, B:12:0x012a, B:14:0x012f, B:30:0x0195, B:33:0x0241, B:43:0x0281, B:47:0x02a7, B:50:0x02b8, B:52:0x02c2, B:62:0x02ed, B:64:0x0301, B:68:0x0319, B:69:0x031d, B:75:0x034a, B:70:0x0321, B:73:0x0337, B:60:0x02d2, B:58:0x02c9, B:45:0x0292, B:37:0x0250, B:19:0x0134, B:20:0x0138, B:22:0x0142, B:24:0x015f, B:26:0x016c, B:28:0x0184, B:80:0x0365), top: B:86:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x02c9 A[Catch: Exception -> 0x037c, TRY_ENTER, TryCatch #1 {Exception -> 0x037c, blocks: (B:3:0x0008, B:6:0x00e9, B:9:0x0104, B:12:0x012a, B:14:0x012f, B:30:0x0195, B:33:0x0241, B:43:0x0281, B:47:0x02a7, B:50:0x02b8, B:52:0x02c2, B:62:0x02ed, B:64:0x0301, B:68:0x0319, B:69:0x031d, B:75:0x034a, B:70:0x0321, B:73:0x0337, B:60:0x02d2, B:58:0x02c9, B:45:0x0292, B:37:0x0250, B:19:0x0134, B:20:0x0138, B:22:0x0142, B:24:0x015f, B:26:0x016c, B:28:0x0184, B:80:0x0365), top: B:86:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x02d2 A[Catch: Exception -> 0x037c, TRY_LEAVE, TryCatch #1 {Exception -> 0x037c, blocks: (B:3:0x0008, B:6:0x00e9, B:9:0x0104, B:12:0x012a, B:14:0x012f, B:30:0x0195, B:33:0x0241, B:43:0x0281, B:47:0x02a7, B:50:0x02b8, B:52:0x02c2, B:62:0x02ed, B:64:0x0301, B:68:0x0319, B:69:0x031d, B:75:0x034a, B:70:0x0321, B:73:0x0337, B:60:0x02d2, B:58:0x02c9, B:45:0x0292, B:37:0x0250, B:19:0x0134, B:20:0x0138, B:22:0x0142, B:24:0x015f, B:26:0x016c, B:28:0x0184, B:80:0x0365), top: B:86:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x02ed A[Catch: Exception -> 0x037c, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x037c, blocks: (B:3:0x0008, B:6:0x00e9, B:9:0x0104, B:12:0x012a, B:14:0x012f, B:30:0x0195, B:33:0x0241, B:43:0x0281, B:47:0x02a7, B:50:0x02b8, B:52:0x02c2, B:62:0x02ed, B:64:0x0301, B:68:0x0319, B:69:0x031d, B:75:0x034a, B:70:0x0321, B:73:0x0337, B:60:0x02d2, B:58:0x02c9, B:45:0x0292, B:37:0x0250, B:19:0x0134, B:20:0x0138, B:22:0x0142, B:24:0x015f, B:26:0x016c, B:28:0x0184, B:80:0x0365), top: B:86:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x030a  */
    /* JADX WARN: Code duplicated, block: B:68:0x0319 A[Catch: Exception -> 0x037c, TRY_ENTER, TryCatch #1 {Exception -> 0x037c, blocks: (B:3:0x0008, B:6:0x00e9, B:9:0x0104, B:12:0x012a, B:14:0x012f, B:30:0x0195, B:33:0x0241, B:43:0x0281, B:47:0x02a7, B:50:0x02b8, B:52:0x02c2, B:62:0x02ed, B:64:0x0301, B:68:0x0319, B:69:0x031d, B:75:0x034a, B:70:0x0321, B:73:0x0337, B:60:0x02d2, B:58:0x02c9, B:45:0x0292, B:37:0x0250, B:19:0x0134, B:20:0x0138, B:22:0x0142, B:24:0x015f, B:26:0x016c, B:28:0x0184, B:80:0x0365), top: B:86:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0321 A[Catch: Exception -> 0x037c, TRY_LEAVE, TryCatch #1 {Exception -> 0x037c, blocks: (B:3:0x0008, B:6:0x00e9, B:9:0x0104, B:12:0x012a, B:14:0x012f, B:30:0x0195, B:33:0x0241, B:43:0x0281, B:47:0x02a7, B:50:0x02b8, B:52:0x02c2, B:62:0x02ed, B:64:0x0301, B:68:0x0319, B:69:0x031d, B:75:0x034a, B:70:0x0321, B:73:0x0337, B:60:0x02d2, B:58:0x02c9, B:45:0x0292, B:37:0x0250, B:19:0x0134, B:20:0x0138, B:22:0x0142, B:24:0x015f, B:26:0x016c, B:28:0x0184, B:80:0x0365), top: B:86:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0337 A[Catch: Exception -> 0x037c, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x037c, blocks: (B:3:0x0008, B:6:0x00e9, B:9:0x0104, B:12:0x012a, B:14:0x012f, B:30:0x0195, B:33:0x0241, B:43:0x0281, B:47:0x02a7, B:50:0x02b8, B:52:0x02c2, B:62:0x02ed, B:64:0x0301, B:68:0x0319, B:69:0x031d, B:75:0x034a, B:70:0x0321, B:73:0x0337, B:60:0x02d2, B:58:0x02c9, B:45:0x0292, B:37:0x0250, B:19:0x0134, B:20:0x0138, B:22:0x0142, B:24:0x015f, B:26:0x016c, B:28:0x0184, B:80:0x0365), top: B:86:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0360  */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    private void generateList(B b) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        int i5;
        int i6 = 2 % 2;
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
            sb.append("(");
            sb.append(b.f);
            sb.append(" yr and ");
            sb.append(b.g);
            sb.append(" months)");
            textView2.setText(sb.toString());
            linearLayout2.addView(textView);
            linearLayout2.addView(textView2);
            final Spinner spinner = new Spinner(getActivity());
            int i7 = d;
            int i8 = i7 & 61;
            int i9 = ((i7 ^ 61) | i8) << 1;
            int i10 = -((i7 | 61) & (~i8));
            int i11 = (i9 & i10) + (i10 | i9);
            c = i11 % 128;
            if (i11 % 2 == 0) {
                spinner.setBackgroundDrawable(getResources().getDrawable(R.drawable.spinner_bg_right));
                spinner.setLayoutParams(layoutParams);
                b.h.equalsIgnoreCase("male");
                throw null;
            }
            spinner.setBackgroundDrawable(getResources().getDrawable(R.drawable.spinner_bg_right));
            spinner.setLayoutParams(layoutParams);
            if (b.h.equalsIgnoreCase("male")) {
                af afVar = new af(getActivity(), android.R.layout.simple_dropdown_item_1line, getAllFemalesSpouse(1, this.mPersonList, "Select Spouse", null));
                int i12 = c;
                int i13 = i12 & 119;
                int i14 = (i12 | 119) & (~i13);
                int i15 = -(-(i13 << 1));
                int i16 = (i14 ^ i15) + ((i14 & i15) << 1);
                d = i16 % 128;
                if (i16 % 2 != 0) {
                    spinner.setAdapter((SpinnerAdapter) afVar);
                    int i17 = 16 / 0;
                } else {
                    spinner.setAdapter((SpinnerAdapter) afVar);
                }
            } else if (b.h.equalsIgnoreCase("female")) {
                af afVar2 = new af(getActivity(), android.R.layout.simple_dropdown_item_1line, getAllMaleSpouse(1, this.mPersonList, "Select Spouse", null));
                int i18 = d;
                int i19 = (((i18 | 30) << 1) - (i18 ^ 30)) - 1;
                c = i19 % 128;
                int i20 = i19 % 2;
                spinner.setAdapter((SpinnerAdapter) afVar2);
                int i21 = d + 17;
                c = i21 % 128;
                int i22 = i21 % 2;
            } else {
                af afVar3 = new af(getActivity(), android.R.layout.simple_dropdown_item_1line, getAllMaleAndFemalesSpouse(1, this.mPersonList, "Select Spouse", b));
                int i23 = d + 95;
                c = i23 % 128;
                int i24 = i23 % 2;
                spinner.setAdapter((SpinnerAdapter) afVar3);
                int i25 = c;
                int i26 = (((i25 | 26) << 1) - (i25 ^ 26)) - 1;
                d = i26 % 128;
                int i27 = i26 % 2;
            }
            final Spinner spinner2 = new Spinner(getActivity());
            spinner2.setBackgroundDrawable(getResources().getDrawable(R.drawable.spinner_bg_right));
            spinner2.setLayoutParams(layoutParams);
            spinner2.setAdapter((SpinnerAdapter) new af(getActivity(), android.R.layout.simple_dropdown_item_1line, getAllMaleFather(2, this.mPersonList, "Select Father", b)));
            final Spinner spinner3 = new Spinner(getActivity());
            spinner3.setBackgroundDrawable(getResources().getDrawable(R.drawable.spinner_bg_right));
            spinner3.setLayoutParams(layoutParams);
            spinner3.setAdapter((SpinnerAdapter) new af(getActivity(), android.R.layout.simple_dropdown_item_1line, getAllFemalesMother(3, this.mPersonList, "Select Mother", b)));
            C0118b c0118b = new C0118b(new InterfaceC0029o() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentOfflineRelationship.1
                private static int a = 0;
                private static int b = 1;

                /* JADX WARN: Code duplicated, block: B:30:0x00dd A[PHI: r7
  0x00dd: PHI (r7v16 android.widget.Spinner) = (r7v15 android.widget.Spinner), (r7v54 android.widget.Spinner) binds: [B:29:0x00db, B:23:0x00cd] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:33:0x010e A[Catch: Exception -> 0x038d, PHI: r7
  0x010e: PHI (r7v51 android.widget.Spinner) = (r7v15 android.widget.Spinner), (r7v54 android.widget.Spinner) binds: [B:29:0x00db, B:23:0x00cd] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x038d, blocks: (B:3:0x001b, B:6:0x002c, B:9:0x0059, B:12:0x006f, B:15:0x008f, B:17:0x00aa, B:20:0x00c2, B:22:0x00cc, B:33:0x010e, B:36:0x0127, B:37:0x012a, B:47:0x0162, B:49:0x016c, B:55:0x0179, B:57:0x019b, B:59:0x01b4, B:63:0x01da, B:67:0x020c, B:70:0x022c, B:77:0x0252, B:78:0x0257, B:64:0x01df, B:54:0x0171, B:83:0x025c, B:89:0x028c, B:91:0x02a5, B:95:0x02c8, B:97:0x02ed, B:101:0x0310, B:103:0x032a, B:105:0x0342, B:102:0x031d, B:111:0x0369, B:113:0x036d, B:38:0x012e, B:31:0x00f5, B:28:0x00d3, B:117:0x0371, B:119:0x0379, B:123:0x037d, B:125:0x0389), top: B:132:0x001b }] */
                /* JADX WARN: Code duplicated, block: B:36:0x0127 A[Catch: Exception -> 0x038d, TRY_ENTER, TryCatch #1 {Exception -> 0x038d, blocks: (B:3:0x001b, B:6:0x002c, B:9:0x0059, B:12:0x006f, B:15:0x008f, B:17:0x00aa, B:20:0x00c2, B:22:0x00cc, B:33:0x010e, B:36:0x0127, B:37:0x012a, B:47:0x0162, B:49:0x016c, B:55:0x0179, B:57:0x019b, B:59:0x01b4, B:63:0x01da, B:67:0x020c, B:70:0x022c, B:77:0x0252, B:78:0x0257, B:64:0x01df, B:54:0x0171, B:83:0x025c, B:89:0x028c, B:91:0x02a5, B:95:0x02c8, B:97:0x02ed, B:101:0x0310, B:103:0x032a, B:105:0x0342, B:102:0x031d, B:111:0x0369, B:113:0x036d, B:38:0x012e, B:31:0x00f5, B:28:0x00d3, B:117:0x0371, B:119:0x0379, B:123:0x037d, B:125:0x0389), top: B:132:0x001b }] */
                /* JADX WARN: Code duplicated, block: B:38:0x012e A[Catch: Exception -> 0x038d, TRY_LEAVE, TryCatch #1 {Exception -> 0x038d, blocks: (B:3:0x001b, B:6:0x002c, B:9:0x0059, B:12:0x006f, B:15:0x008f, B:17:0x00aa, B:20:0x00c2, B:22:0x00cc, B:33:0x010e, B:36:0x0127, B:37:0x012a, B:47:0x0162, B:49:0x016c, B:55:0x0179, B:57:0x019b, B:59:0x01b4, B:63:0x01da, B:67:0x020c, B:70:0x022c, B:77:0x0252, B:78:0x0257, B:64:0x01df, B:54:0x0171, B:83:0x025c, B:89:0x028c, B:91:0x02a5, B:95:0x02c8, B:97:0x02ed, B:101:0x0310, B:103:0x032a, B:105:0x0342, B:102:0x031d, B:111:0x0369, B:113:0x036d, B:38:0x012e, B:31:0x00f5, B:28:0x00d3, B:117:0x0371, B:119:0x0379, B:123:0x037d, B:125:0x0389), top: B:132:0x001b }] */
                @Override // ivas.gov.bisp.enumeration.W.InterfaceC0029o
                public void onItemSelected(AdapterView<?> adapterView, View view, int i28, long j) {
                    B b2;
                    Spinner spinner4;
                    int i29;
                    B b3;
                    FragmentOfflineRelationship fragmentOfflineRelationship;
                    View viewAccess$000;
                    Spinner spinner5;
                    B b4;
                    int i30;
                    int i31;
                    int i32 = 2 % 2;
                    int i33 = a;
                    int i34 = i33 & 55;
                    int i35 = ((((i33 ^ 55) | i34) << 1) - (~(-((i33 | 55) & (~i34))))) - 1;
                    b = i35 % 128;
                    int i36 = i35 % 2;
                    try {
                        if (spinner.getTag() != null) {
                            int i37 = a + 3;
                            b = i37 % 128;
                            int i38 = i37 % 2;
                            b2 = (B) spinner.getTag();
                            int i39 = a;
                            int i40 = i39 & 119;
                            int i41 = ((i39 | 119) & (~i40)) + (i40 << 1);
                            b = i41 % 128;
                            int i42 = i41 % 2;
                        } else {
                            int i43 = a;
                            int i44 = (((i43 ^ 37) | (i43 & 37)) << 1) - (((~i43) & 37) | (i43 & (-38)));
                            b = i44 % 128;
                            int i45 = i44 % 2;
                            b2 = null;
                        }
                        B b5 = (B) spinner.getSelectedItem();
                        Spinner spinner6 = spinner;
                        int i46 = a + 15;
                        b = i46 % 128;
                        if (i46 % 2 == 0) {
                            spinner6.setTag(b5);
                            try {
                                throw null;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        spinner6.setTag(b5);
                        af afVar4 = (af) spinner.getAdapter();
                        int i47 = b;
                        int i48 = (i47 & (-16)) | ((~i47) & 15);
                        int i49 = (i47 & 15) << 1;
                        int i50 = (i48 ^ i49) + ((i49 & i48) << 1);
                        a = i50 % 128;
                        if (i50 % 2 != 0) {
                            ArrayList<B> arrayList = afVar4.d;
                            spinner.getParent();
                            try {
                                throw null;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        ArrayList<B> arrayList2 = afVar4.d;
                        LinearLayout linearLayout3 = (LinearLayout) spinner.getParent();
                        B b6 = (B) linearLayout3.getTag();
                        int i51 = a + 75;
                        b = i51 % 128;
                        int i52 = i51 % 2;
                        Spinner spinner7 = (Spinner) linearLayout3.getChildAt(2);
                        int i53 = a;
                        int i54 = ((i53 | 125) << 1) - (i53 ^ 125);
                        b = i54 % 128;
                        if (i54 % 2 == 0) {
                            spinner4 = (Spinner) linearLayout3.getChildAt(3);
                            int i55 = 18 / 0;
                            if (b5.d != -1) {
                                int i56 = b;
                                int i57 = (i56 | 99) << 1;
                                int i58 = -((99 & (~i56)) | (i56 & (-100)));
                                int i59 = ((i57 | i58) << 1) - (i58 ^ i57);
                                a = i59 % 128;
                                int i60 = i59 % 2;
                                spinner7.setEnabled(true);
                                spinner7.setClickable(true);
                                spinner4.setEnabled(true);
                                spinner4.setClickable(true);
                                int i61 = b;
                                int i62 = (i61 & 125) + (i61 | 125);
                                a = i62 % 128;
                                int i63 = i62 % 2;
                            } else {
                                spinner7.setEnabled(false);
                                spinner7.setClickable(false);
                                int i64 = a;
                                int i65 = i64 & 61;
                                int i66 = (i64 ^ 61) | i65;
                                i31 = (i65 ^ i66) + ((i66 & i65) << 1);
                                b = i31 % 128;
                                if (i31 % 2 == 0) {
                                    spinner4.setEnabled(false);
                                } else {
                                    spinner4.setEnabled(false);
                                }
                                spinner4.setClickable(false);
                                int i67 = b;
                                int i68 = i67 & 71;
                                int i69 = -(-((i67 ^ 71) | i68));
                                int i70 = (i68 & i69) + (i69 | i68);
                                a = i70 % 128;
                                int i71 = i70 % 2;
                            }
                        } else {
                            spinner4 = (Spinner) linearLayout3.getChildAt(3);
                            if (b5.d != -1) {
                                int i510 = b;
                                int i511 = (i510 | 99) << 1;
                                int i512 = -((99 & (~i510)) | (i510 & (-100)));
                                int i513 = ((i511 | i512) << 1) - (i512 ^ i511);
                                a = i513 % 128;
                                int i610 = i513 % 2;
                                spinner7.setEnabled(true);
                                spinner7.setClickable(true);
                                spinner4.setEnabled(true);
                                spinner4.setClickable(true);
                                int i611 = b;
                                int i612 = (i611 & 125) + (i611 | 125);
                                a = i612 % 128;
                                int i613 = i612 % 2;
                            } else {
                                spinner7.setEnabled(false);
                                spinner7.setClickable(false);
                                int i614 = a;
                                int i615 = i614 & 61;
                                int i616 = (i614 ^ 61) | i615;
                                i31 = (i615 ^ i616) + ((i616 & i615) << 1);
                                b = i31 % 128;
                                if (i31 % 2 == 0) {
                                    spinner4.setEnabled(false);
                                } else {
                                    spinner4.setEnabled(false);
                                }
                                spinner4.setClickable(false);
                                int i617 = b;
                                int i618 = i617 & 71;
                                int i619 = -(-((i617 ^ 71) | i618));
                                int i72 = (i618 & i619) + (i619 | i618);
                                a = i72 % 128;
                                int i73 = i72 % 2;
                            }
                        }
                        if (b6 instanceof F) {
                            int i74 = b;
                            int i75 = i74 & 21;
                            int i76 = (((i74 | 21) & (~i75)) - (~(-(-(i75 << 1))))) - 1;
                            a = i76 % 128;
                            int i77 = i76 % 2;
                            FragmentOfflineRelationship fragmentOfflineRelationship2 = FragmentOfflineRelationship.this;
                            boolean zAccess$100 = FragmentOfflineRelationship.access$100(fragmentOfflineRelationship2, FragmentOfflineRelationship.access$000(fragmentOfflineRelationship2), b2, b6);
                            int i78 = b;
                            int i79 = i78 & 51;
                            int i80 = ((i78 | 51) & (~i79)) + (i79 << 1);
                            a = i80 % 128;
                            int i81 = i80 % 2;
                            FragmentOfflineRelationship fragmentOfflineRelationship3 = FragmentOfflineRelationship.this;
                            View viewAccess$001 = FragmentOfflineRelationship.access$000(fragmentOfflineRelationship3);
                            Spinner spinner8 = spinner;
                            int i82 = a;
                            int i83 = ((i82 | 121) << 1) - (i82 ^ 121);
                            b = i83 % 128;
                            if (i83 % 2 == 0) {
                                FragmentOfflineRelationship.access$200(fragmentOfflineRelationship3, viewAccess$001, spinner8, b5, b2, b6, arrayList2, i28, zAccess$100);
                                try {
                                    throw null;
                                } catch (Throwable th3) {
                                    throw th3;
                                }
                            }
                            FragmentOfflineRelationship.access$200(fragmentOfflineRelationship3, viewAccess$001, spinner8, b5, b2, b6, arrayList2, i28, zAccess$100);
                            FragmentOfflineRelationship.access$300(FragmentOfflineRelationship.this, b5, b2, spinner);
                            FragmentOfflineRelationship fragmentOfflineRelationship4 = FragmentOfflineRelationship.this;
                            View viewAccess$002 = FragmentOfflineRelationship.access$000(fragmentOfflineRelationship4);
                            int i84 = b;
                            int i85 = i84 & 41;
                            int i86 = ((((i84 ^ 41) | i85) << 1) - (~(-((i84 | 41) & (~i85))))) - 1;
                            a = i86 % 128;
                            int i87 = i86 % 2;
                            FragmentOfflineRelationship.access$400(fragmentOfflineRelationship4, viewAccess$002, spinner, b5, b2, b6, arrayList2, i28);
                            int i88 = a;
                            int i89 = i88 & 75;
                            int i90 = (i88 | 75) & (~i89);
                            int i91 = i89 << 1;
                            int i92 = (i90 ^ i91) + ((i90 & i91) << 1);
                            b = i92 % 128;
                            if (i92 % 2 == 0) {
                                i29 = 5;
                                b3 = (B) ((Spinner) linearLayout3.getChildAt(5)).getSelectedItem();
                            } else {
                                i29 = 5;
                                b3 = (B) ((Spinner) linearLayout3.getChildAt(2)).getSelectedItem();
                            }
                            B b7 = b3;
                            FragmentOfflineRelationship fragmentOfflineRelationship5 = FragmentOfflineRelationship.this;
                            View viewAccess$003 = FragmentOfflineRelationship.access$000(fragmentOfflineRelationship5);
                            Spinner spinner9 = spinner;
                            int i93 = a + i29;
                            b = i93 % 128;
                            int i94 = i93 % 2;
                            FragmentOfflineRelationship.access$500(fragmentOfflineRelationship5, viewAccess$003, spinner9, b5, b2, b6, arrayList2, i28, b7);
                            int i95 = b;
                            int i96 = i95 & 39;
                            int i97 = -(-((i95 ^ 39) | i96));
                            int i98 = (i96 & i97) + (i97 | i96);
                            a = i98 % 128;
                            if (i98 % 2 != 0) {
                                int i99 = 81 / 0;
                                return;
                            }
                            return;
                        }
                        if (!(b6 instanceof ae)) {
                            ((ai) b6).a = b5;
                            int i100 = a;
                            int i101 = i100 & 95;
                            int i102 = i100 | 95;
                            int i103 = (i101 ^ i102) + ((i102 & i101) << 1);
                            b = i103 % 128;
                            if (i103 % 2 == 0) {
                                int i104 = 9 / 0;
                                return;
                            }
                            return;
                        }
                        int i105 = a;
                        int i106 = i105 & 51;
                        int i107 = -(-((i105 ^ 51) | i106));
                        int i108 = ((i106 | i107) << 1) - (i107 ^ i106);
                        b = i108 % 128;
                        if (i108 % 2 == 0) {
                            fragmentOfflineRelationship = FragmentOfflineRelationship.this;
                            viewAccess$000 = FragmentOfflineRelationship.access$000(fragmentOfflineRelationship);
                            spinner5 = spinner;
                            int i109 = 84 / 0;
                        } else {
                            fragmentOfflineRelationship = FragmentOfflineRelationship.this;
                            viewAccess$000 = FragmentOfflineRelationship.access$000(fragmentOfflineRelationship);
                            spinner5 = spinner;
                        }
                        FragmentOfflineRelationship.access$600(fragmentOfflineRelationship, viewAccess$000, b5, b6, spinner5, b2);
                        FragmentOfflineRelationship.access$700(FragmentOfflineRelationship.this, b5, b2, spinner);
                        int i110 = b;
                        int i111 = (((i110 & (-36)) | ((~i110) & 35)) - (~((i110 & 35) << 1))) - 1;
                        a = i111 % 128;
                        int i112 = i111 % 2;
                        FragmentOfflineRelationship fragmentOfflineRelationship6 = FragmentOfflineRelationship.this;
                        View viewAccess$004 = FragmentOfflineRelationship.access$000(fragmentOfflineRelationship6);
                        Spinner spinner10 = spinner;
                        int i113 = a;
                        int i114 = i113 & 101;
                        int i115 = (i113 ^ 101) | i114;
                        int i116 = ((i114 | i115) << 1) - (i115 ^ i114);
                        b = i116 % 128;
                        int i117 = i116 % 2;
                        B b8 = b6.c;
                        int i118 = a;
                        int i119 = i118 & 59;
                        int i120 = -(-((i118 ^ 59) | i119));
                        int i121 = (i119 & i120) + (i120 | i119);
                        b = i121 % 128;
                        if (i121 % 2 == 0) {
                            b4 = b6;
                            FragmentOfflineRelationship.access$800(fragmentOfflineRelationship6, viewAccess$004, spinner10, b5, b2, b6, arrayList2, i28, b8);
                            i30 = 5;
                        } else {
                            b4 = b6;
                            FragmentOfflineRelationship.access$800(fragmentOfflineRelationship6, viewAccess$004, spinner10, b5, b2, b4, arrayList2, i28, b8);
                            i30 = 2;
                        }
                        int i122 = b;
                        int i123 = ((i122 ^ 77) | (i122 & 77)) << 1;
                        int i124 = -(((~i122) & 77) | (i122 & (-78)));
                        int i125 = ((i123 | i124) << 1) - (i124 ^ i123);
                        a = i125 % 128;
                        int i126 = i125 % 2;
                        B b9 = (B) ((Spinner) linearLayout3.getChildAt(i30)).getSelectedItem();
                        int i127 = b;
                        int i128 = (-2) - ((((i127 | 104) << 1) - (i127 ^ 104)) ^ (-1));
                        a = i128 % 128;
                        if (i128 % 2 != 0) {
                            FragmentOfflineRelationship.access$000(FragmentOfflineRelationship.this);
                            try {
                                throw null;
                            } catch (Throwable th4) {
                                throw th4;
                            }
                        }
                        FragmentOfflineRelationship fragmentOfflineRelationship7 = FragmentOfflineRelationship.this;
                        FragmentOfflineRelationship.access$500(fragmentOfflineRelationship7, FragmentOfflineRelationship.access$000(fragmentOfflineRelationship7), spinner, b5, b2, b4, arrayList2, i28, b9);
                        int i129 = b;
                        int i130 = ((i129 & 105) - (~(i129 | 105))) - 1;
                        a = i130 % 128;
                        if (i130 % 2 != 0) {
                            throw null;
                        }
                    } catch (Exception unused) {
                    }
                }
            });
            c0118b.c = true;
            spinner.setOnItemSelectedListener(c0118b);
            C0118b c0118b2 = new C0118b(new InterfaceC0029o() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentOfflineRelationship.2
                private static int a = 1;
                private static int b;

                /* JADX WARN: Code duplicated, block: B:37:0x00ed A[Catch: Exception -> 0x01c7, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x01c7, blocks: (B:3:0x0015, B:8:0x0034, B:10:0x003e, B:17:0x0056, B:19:0x0070, B:22:0x0086, B:24:0x00a3, B:27:0x00c4, B:37:0x00ed, B:60:0x015f, B:67:0x0193, B:41:0x0100, B:52:0x0144, B:53:0x014a, B:54:0x014f, B:72:0x01ae, B:73:0x01b6, B:74:0x01b9, B:77:0x01bc, B:78:0x01c4, B:14:0x0043), top: B:90:0x0015 }] */
                /* JADX WARN: Code duplicated, block: B:50:0x0137  */
                /* JADX WARN: Code duplicated, block: B:52:0x0144 A[Catch: Exception -> 0x01c7, TRY_ENTER, TryCatch #3 {Exception -> 0x01c7, blocks: (B:3:0x0015, B:8:0x0034, B:10:0x003e, B:17:0x0056, B:19:0x0070, B:22:0x0086, B:24:0x00a3, B:27:0x00c4, B:37:0x00ed, B:60:0x015f, B:67:0x0193, B:41:0x0100, B:52:0x0144, B:53:0x014a, B:54:0x014f, B:72:0x01ae, B:73:0x01b6, B:74:0x01b9, B:77:0x01bc, B:78:0x01c4, B:14:0x0043), top: B:90:0x0015 }] */
                /* JADX WARN: Code duplicated, block: B:53:0x014a A[Catch: Exception -> 0x01c7, TRY_LEAVE, TryCatch #3 {Exception -> 0x01c7, blocks: (B:3:0x0015, B:8:0x0034, B:10:0x003e, B:17:0x0056, B:19:0x0070, B:22:0x0086, B:24:0x00a3, B:27:0x00c4, B:37:0x00ed, B:60:0x015f, B:67:0x0193, B:41:0x0100, B:52:0x0144, B:53:0x014a, B:54:0x014f, B:72:0x01ae, B:73:0x01b6, B:74:0x01b9, B:77:0x01bc, B:78:0x01c4, B:14:0x0043), top: B:90:0x0015 }] */
                @Override // ivas.gov.bisp.enumeration.W.InterfaceC0029o
                public void onItemSelected(AdapterView<?> adapterView, View view, int i28, long j) {
                    B b2;
                    int i29;
                    int i30 = 2 % 2;
                    int i31 = b;
                    int i32 = i31 & 107;
                    int i33 = (i32 - (~(-(-((i31 ^ 107) | i32))))) - 1;
                    a = i33 % 128;
                    int i34 = i33 % 2;
                    try {
                        Object obj2 = null;
                        if (spinner2.getTag() != null) {
                            int i35 = a;
                            int i36 = i35 | 83;
                            int i37 = i36 << 1;
                            int i38 = -((~(i35 & 83)) & i36);
                            int i39 = (i37 & i38) + (i38 | i37);
                            b = i39 % 128;
                            if (i39 % 2 != 0) {
                                b2 = (B) spinner2.getTag();
                                int i40 = 66 / 0;
                            } else {
                                b2 = (B) spinner2.getTag();
                            }
                            int i41 = b + 89;
                            a = i41 % 128;
                            int i42 = i41 % 2;
                        } else {
                            b2 = null;
                        }
                        B b3 = (B) spinner2.getSelectedItem();
                        int i43 = a;
                        int i44 = i43 ^ 47;
                        int i45 = -(-((i43 & 47) << 1));
                        int i46 = (i44 & i45) + (i45 | i44);
                        b = i46 % 128;
                        int i47 = i46 % 2;
                        spinner2.setTag(b3);
                        ViewParent parent = spinner2.getParent();
                        int i48 = a + 59;
                        b = i48 % 128;
                        if (i48 % 2 != 0) {
                            throw null;
                        }
                        LinearLayout linearLayout3 = (LinearLayout) parent;
                        B b4 = (B) linearLayout3.getTag();
                        int i49 = b;
                        int i50 = (i49 & (-108)) | ((~i49) & 107);
                        int i51 = (i49 & 107) << 1;
                        int i52 = (i50 ^ i51) + ((i51 & i50) << 1);
                        a = i52 % 128;
                        int i53 = i52 % 2;
                        b4.k = b3;
                        View childAt = linearLayout3.getChildAt(1);
                        int i54 = b;
                        int i55 = ((i54 ^ 73) | (i54 & 73)) << 1;
                        int i56 = -(((~i54) & 73) | (i54 & (-74)));
                        int i57 = ((i55 | i56) << 1) - (i56 ^ i55);
                        a = i57 % 128;
                        if (i57 % 2 == 0) {
                            obj2.hashCode();
                            throw null;
                        }
                        B b5 = (B) ((Spinner) childAt).getSelectedItem();
                        if (!(!(b4 instanceof F))) {
                            int i58 = b;
                            int i59 = (i58 & 125) + (i58 | 125);
                            a = i59 % 128;
                            if (i59 % 2 == 0) {
                                int i60 = 81 / 0;
                                if (!(!(b5 instanceof ae))) {
                                    FragmentOfflineRelationship.access$900(FragmentOfflineRelationship.this, b4, b3, b2, b5);
                                    int i61 = b + 29;
                                    a = i61 % 128;
                                    int i62 = i61 % 2;
                                }
                            } else if (b5 instanceof ae) {
                                FragmentOfflineRelationship.access$900(FragmentOfflineRelationship.this, b4, b3, b2, b5);
                                int i63 = b + 29;
                                a = i63 % 128;
                                int i64 = i63 % 2;
                            }
                        } else if (!(b4 instanceof ae)) {
                            ((ai) b4).k = b3;
                            int i65 = b;
                            int i66 = i65 ^ 105;
                            int i67 = ((i65 & 105) | i66) << 1;
                            int i68 = -i66;
                            int i69 = ((i67 | i68) << 1) - (i67 ^ i68);
                            a = i69 % 128;
                            int i70 = i69 % 2;
                        } else {
                            int i71 = b;
                            int i72 = i71 & 99;
                            int i73 = (i72 - (~((i71 ^ 99) | i72))) - 1;
                            a = i73 % 128;
                            if (i73 % 2 == 0) {
                                int i74 = 48 / 0;
                                if (b5 instanceof F) {
                                    i29 = (i71 ^ 87) + ((i71 & 87) << 1);
                                    a = i29 % 128;
                                    if (i29 % 2 != 0) {
                                        FragmentOfflineRelationship.access$1000(FragmentOfflineRelationship.this, b4, b3, b2, b5);
                                        throw null;
                                    }
                                    FragmentOfflineRelationship.access$1000(FragmentOfflineRelationship.this, b4, b3, b2, b5);
                                }
                            } else if (b5 instanceof F) {
                                i29 = (i71 ^ 87) + ((i71 & 87) << 1);
                                a = i29 % 128;
                                if (i29 % 2 != 0) {
                                    FragmentOfflineRelationship.access$1000(FragmentOfflineRelationship.this, b4, b3, b2, b5);
                                    throw null;
                                }
                                FragmentOfflineRelationship.access$1000(FragmentOfflineRelationship.this, b4, b3, b2, b5);
                            }
                        }
                        if (b4 instanceof ae) {
                            int i75 = b + 81;
                            a = i75 % 128;
                            int i76 = i75 % 2;
                            FragmentOfflineRelationship.access$1100(FragmentOfflineRelationship.this, linearLayout3, b3, b2);
                            int i77 = a;
                            int i78 = ((i77 & 123) - (~(-(-(i77 | 123))))) - 1;
                            b = i78 % 128;
                            int i79 = i78 % 2;
                        }
                        if (b3 instanceof F) {
                            int i80 = b;
                            int i81 = (i80 ^ 23) + ((i80 & 23) << 1);
                            int i82 = i81 % 128;
                            a = i82;
                            int i83 = i81 % 2;
                            if (b4 instanceof F) {
                                int i84 = (i82 & 121) + (i82 | 121);
                                b = i84 % 128;
                                int i85 = i84 % 2;
                                FragmentOfflineRelationship fragmentOfflineRelationship = FragmentOfflineRelationship.this;
                                FragmentOfflineRelationship.access$1200(fragmentOfflineRelationship, FragmentOfflineRelationship.access$000(fragmentOfflineRelationship), b3, b2, b4);
                                int i86 = b;
                                int i87 = (i86 ^ 97) + ((i86 & 97) << 1);
                                a = i87 % 128;
                                if (i87 % 2 == 0) {
                                    throw null;
                                }
                                return;
                            }
                        }
                        int i88 = b;
                        int i89 = (i88 ^ 111) + ((i88 & 111) << 1);
                        a = i89 % 128;
                        int i90 = i89 % 2;
                    } catch (Exception unused) {
                    }
                }
            });
            c0118b2.c = true;
            spinner2.setOnItemSelectedListener(c0118b2);
            C0118b c0118b3 = new C0118b(new InterfaceC0029o() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentOfflineRelationship.3
                private static int a = 1;
                private static int b;

                /* JADX WARN: Code duplicated, block: B:41:0x012d A[Catch: Exception -> 0x01f2, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x01f2, blocks: (B:4:0x001e, B:6:0x0026, B:9:0x0039, B:11:0x0054, B:13:0x0070, B:15:0x0085, B:18:0x00a4, B:25:0x00e4, B:27:0x00fb, B:28:0x0100, B:29:0x0103, B:53:0x0182, B:55:0x0189, B:59:0x018e, B:67:0x01c8, B:41:0x012d, B:44:0x013e, B:46:0x0151, B:70:0x01df, B:71:0x01e7, B:74:0x01ea, B:75:0x01ef), top: B:89:0x001c }] */
                /* JADX WARN: Code duplicated, block: B:43:0x0131  */
                @Override // ivas.gov.bisp.enumeration.W.InterfaceC0029o
                public void onItemSelected(AdapterView<?> adapterView, View view, int i28, long j) {
                    B b2;
                    int i29 = 2 % 2;
                    int i30 = a;
                    int i31 = ((((i30 ^ 43) | (i30 & 43)) << 1) - (~(-(((~i30) & 43) | (i30 & (-44)))))) - 1;
                    b = i31 % 128;
                    Object obj2 = null;
                    try {
                        if (i31 % 2 != 0) {
                            spinner3.getTag();
                            throw null;
                        }
                        if (spinner3.getTag() != null) {
                            b2 = (B) spinner3.getTag();
                            int i32 = b + 47;
                            a = i32 % 128;
                            int i33 = i32 % 2;
                        } else {
                            b2 = null;
                        }
                        B b3 = (B) spinner3.getSelectedItem();
                        int i34 = b;
                        int i35 = i34 ^ 65;
                        int i36 = ((i34 & 65) | i35) << 1;
                        int i37 = -i35;
                        int i38 = ((i36 | i37) << 1) - (i36 ^ i37);
                        a = i38 % 128;
                        int i39 = i38 % 2;
                        spinner3.setTag(b3);
                        ViewParent parent = spinner3.getParent();
                        int i40 = b;
                        int i41 = i40 & 61;
                        int i42 = (((i40 | 61) & (~i41)) - (~(i41 << 1))) - 1;
                        a = i42 % 128;
                        int i43 = i42 % 2;
                        LinearLayout linearLayout3 = (LinearLayout) parent;
                        B b4 = (B) linearLayout3.getTag();
                        int i44 = b;
                        int i45 = i44 & 9;
                        int i46 = i45 + ((i44 ^ 9) | i45);
                        a = i46 % 128;
                        int i47 = i46 % 2;
                        b4.c = b3;
                        View childAt = linearLayout3.getChildAt(1);
                        int i48 = b;
                        int i49 = i48 & 51;
                        int i50 = ((i48 ^ 51) | i49) << 1;
                        int i51 = -((i48 | 51) & (~i49));
                        int i52 = (i50 ^ i51) + ((i51 & i50) << 1);
                        a = i52 % 128;
                        if (i52 % 2 == 0) {
                            throw null;
                        }
                        B b5 = (B) ((Spinner) childAt).getSelectedItem();
                        int i53 = b;
                        int i54 = i53 & 115;
                        int i55 = -(-((i53 ^ 115) | i54));
                        int i56 = (i54 & i55) + (i55 | i54);
                        int i57 = i56 % 128;
                        a = i57;
                        int i58 = i56 % 2;
                        boolean z2 = b4 instanceof F;
                        if (!(!z2)) {
                            int i59 = (-2) - ((((i57 | 108) << 1) - (i57 ^ 108)) ^ (-1));
                            b = i59 % 128;
                            int i60 = i59 % 2;
                            if (b5 instanceof ae) {
                                int i61 = i57 & 77;
                                int i62 = i61 + ((i57 ^ 77) | i61);
                                b = i62 % 128;
                                if (i62 % 2 != 0) {
                                    FragmentOfflineRelationship.access$1300(FragmentOfflineRelationship.this, b4, b3, b2, b5);
                                    obj2.hashCode();
                                    throw null;
                                }
                                FragmentOfflineRelationship.access$1300(FragmentOfflineRelationship.this, b4, b3, b2, b5);
                                int i63 = b;
                                int i64 = i63 ^ 41;
                                int i65 = ((((i63 & 41) | i64) << 1) - (~(-i64))) - 1;
                                a = i65 % 128;
                                int i66 = i65 % 2;
                            }
                        } else if (b4 instanceof ae) {
                            int i67 = (i57 & (-88)) | ((~i57) & 87);
                            int i68 = (i57 & 87) << 1;
                            int i69 = ((i67 | i68) << 1) - (i67 ^ i68);
                            b = i69 % 128;
                            if (i69 % 2 != 0) {
                                int i70 = 58 / 0;
                                if (!(!(b5 instanceof F))) {
                                    if (b5.d >= 0) {
                                        int i71 = b;
                                        int i72 = (i71 ^ 65) + ((i71 & 65) << 1);
                                        a = i72 % 128;
                                        int i73 = i72 % 2;
                                        FragmentOfflineRelationship.access$1300(FragmentOfflineRelationship.this, b4, b3, b2, b5);
                                        int i74 = a;
                                        int i75 = (i74 ^ 67) + ((i74 & 67) << 1);
                                        b = i75 % 128;
                                        int i76 = i75 % 2;
                                    }
                                }
                            } else if (b5 instanceof F) {
                                if (b5.d >= 0) {
                                    int i77 = b;
                                    int i78 = (i77 ^ 65) + ((i77 & 65) << 1);
                                    a = i78 % 128;
                                    int i79 = i78 % 2;
                                    FragmentOfflineRelationship.access$1300(FragmentOfflineRelationship.this, b4, b3, b2, b5);
                                    int i710 = a;
                                    int i711 = (i710 ^ 67) + ((i710 & 67) << 1);
                                    b = i711 % 128;
                                    int i712 = i711 % 2;
                                }
                            }
                        } else {
                            ((ai) b4).c = b3;
                            int i80 = a;
                            int i81 = ((i80 | 65) << 1) - (i80 ^ 65);
                            b = i81 % 128;
                            if (i81 % 2 != 0) {
                                int i82 = 2 / 3;
                            }
                        }
                        if (z2) {
                            int i83 = a;
                            int i84 = i83 & 119;
                            int i85 = ((i83 ^ 119) | i84) << 1;
                            int i86 = -((i83 | 119) & (~i84));
                            int i87 = ((i85 | i86) << 1) - (i86 ^ i85);
                            b = i87 % 128;
                            if (i87 % 2 != 0) {
                                FragmentOfflineRelationship.access$1400(FragmentOfflineRelationship.this, linearLayout3, b3, b2);
                                int i88 = 99 / 0;
                            } else {
                                FragmentOfflineRelationship.access$1400(FragmentOfflineRelationship.this, linearLayout3, b3, b2);
                            }
                            int i89 = b;
                            int i90 = i89 & 79;
                            int i91 = -(-((i89 ^ 79) | i90));
                            int i92 = (i90 & i91) + (i91 | i90);
                            a = i92 % 128;
                            int i93 = i92 % 2;
                        }
                        if (b3 instanceof ae) {
                            int i94 = a;
                            int i95 = ((i94 & 115) - (~(i94 | 115))) - 1;
                            int i96 = i95 % 128;
                            b = i96;
                            int i97 = i95 % 2;
                            if (!(!(b4 instanceof ae))) {
                                int i98 = (-2) - ((i96 + 26) ^ (-1));
                                a = i98 % 128;
                                int i99 = i98 % 2;
                                FragmentOfflineRelationship fragmentOfflineRelationship = FragmentOfflineRelationship.this;
                                FragmentOfflineRelationship.access$1500(fragmentOfflineRelationship, FragmentOfflineRelationship.access$000(fragmentOfflineRelationship), b3, b2, b4);
                                int i100 = b;
                                int i101 = (i100 ^ 107) + ((i100 & 107) << 1);
                                a = i101 % 128;
                                int i102 = i101 % 2;
                                return;
                            }
                        }
                        int i103 = a + 87;
                        b = i103 % 128;
                        int i104 = i103 % 2;
                    } catch (Exception unused) {
                    }
                }
            });
            c0118b3.c = true;
            spinner3.setOnItemSelectedListener(c0118b3);
            View view = new View(getActivity());
            ViewGroup.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, 2);
            int i28 = c;
            int i29 = i28 & 113;
            int i30 = i28 | 113;
            int i31 = (i29 ^ i30) + ((i30 & i29) << 1);
            d = i31 % 128;
            if (i31 % 2 != 0) {
                view.setLayoutParams(layoutParams4);
                view.setBackgroundColor(-16777216);
                i = b.j;
                if (i != 3748) {
                    int i32 = d;
                    int i33 = i32 & 27;
                    int i34 = ((i32 | 27) & (~i33)) + (i33 << 1);
                    i5 = i34 % 128;
                    c = i5;
                    int i35 = i34 % 2;
                    if (i != 204) {
                        int i36 = i5 & 107;
                        int i37 = -(-(i5 | 107));
                        int i38 = ((i36 | i37) << 1) - (i36 ^ i37);
                        d = i38 % 128;
                        int i39 = i38 % 2;
                        spinner.setVisibility(8);
                        int i40 = c + 58;
                        int i41 = (i40 ^ (-1)) + (i40 << 1);
                        d = i41 % 128;
                        int i42 = i41 % 2;
                    }
                }
                linearLayout.addView(linearLayout2);
                linearLayout.addView(spinner);
                i2 = d + 81;
                c = i2 % 128;
                if (i2 % 2 == 0) {
                    linearLayout.addView(spinner2);
                    int i43 = 51 / 0;
                    if (spinner.getVisibility() == 0) {
                        spinner2.setEnabled(false);
                        spinner2.setClickable(false);
                        int i44 = d;
                        int i45 = i44 & 61;
                        int i46 = (i44 | 61) & (~i45);
                        int i47 = i45 << 1;
                        int i48 = ((i46 | i47) << 1) - (i46 ^ i47);
                        c = i48 % 128;
                        int i49 = i48 % 2;
                    } else {
                        spinner2.setEnabled(true);
                        spinner2.setClickable(true);
                        int i50 = c;
                        int i51 = (((i50 | 82) << 1) - (i50 ^ 82)) - 1;
                        d = i51 % 128;
                        int i52 = i51 % 2;
                    }
                } else {
                    linearLayout.addView(spinner2);
                    if (spinner.getVisibility() == 0) {
                        spinner2.setEnabled(false);
                        spinner2.setClickable(false);
                        int i410 = d;
                        int i411 = i410 & 61;
                        int i412 = (i410 | 61) & (~i411);
                        int i413 = i411 << 1;
                        int i414 = ((i412 | i413) << 1) - (i412 ^ i413);
                        c = i414 % 128;
                        int i415 = i414 % 2;
                    } else {
                        spinner2.setEnabled(true);
                        spinner2.setClickable(true);
                        int i53 = c;
                        int i54 = (((i53 | 82) << 1) - (i53 ^ 82)) - 1;
                        d = i54 % 128;
                        int i55 = i54 % 2;
                    }
                }
                linearLayout.addView(spinner3);
                if (spinner.getVisibility() == 0) {
                    int i56 = d;
                    i4 = (i56 ^ 37) + ((i56 & 37) << 1);
                    c = i4 % 128;
                    if (i4 % 2 == 0) {
                        spinner3.setEnabled(true);
                        z = false;
                    } else {
                        z = false;
                        spinner3.setEnabled(false);
                    }
                    spinner3.setClickable(z);
                    int i57 = d;
                    int i58 = ((i57 & 93) - (~(-(-(i57 | 93))))) - 1;
                    c = i58 % 128;
                    int i59 = i58 % 2;
                } else {
                    spinner2.setEnabled(true);
                    spinner2.setClickable(true);
                    int i60 = c;
                    int i61 = i60 & 53;
                    int i62 = i61 + ((i60 ^ 53) | i61);
                    d = i62 % 128;
                    int i63 = i62 % 2;
                }
                linearLayout.addView(view);
                this.linearLayout.addView(linearLayout);
                int i64 = d;
                i3 = (i64 & 79) + (i64 | 79);
                c = i3 % 128;
                if (i3 % 2 == 0) {
                    int i65 = 18 / 0;
                }
            }
            view.setLayoutParams(layoutParams4);
            view.setBackgroundColor(-16777216);
            i = b.j;
            if (i != 201) {
                int i310 = d;
                int i311 = i310 & 27;
                int i312 = ((i310 | 27) & (~i311)) + (i311 << 1);
                i5 = i312 % 128;
                c = i5;
                int i313 = i312 % 2;
                if (i != 204) {
                    int i314 = i5 & 107;
                    int i315 = -(-(i5 | 107));
                    int i316 = ((i314 | i315) << 1) - (i314 ^ i315);
                    d = i316 % 128;
                    int i317 = i316 % 2;
                    spinner.setVisibility(8);
                    int i416 = c + 58;
                    int i417 = (i416 ^ (-1)) + (i416 << 1);
                    d = i417 % 128;
                    int i418 = i417 % 2;
                }
            }
            linearLayout.addView(linearLayout2);
            linearLayout.addView(spinner);
            i2 = d + 81;
            c = i2 % 128;
            if (i2 % 2 == 0) {
                linearLayout.addView(spinner2);
                int i419 = 51 / 0;
                if (spinner.getVisibility() == 0) {
                    spinner2.setEnabled(false);
                    spinner2.setClickable(false);
                    int i4110 = d;
                    int i4111 = i4110 & 61;
                    int i4112 = (i4110 | 61) & (~i4111);
                    int i4113 = i4111 << 1;
                    int i4114 = ((i4112 | i4113) << 1) - (i4112 ^ i4113);
                    c = i4114 % 128;
                    int i4115 = i4114 % 2;
                } else {
                    spinner2.setEnabled(true);
                    spinner2.setClickable(true);
                    int i510 = c;
                    int i511 = (((i510 | 82) << 1) - (i510 ^ 82)) - 1;
                    d = i511 % 128;
                    int i512 = i511 % 2;
                }
            } else {
                linearLayout.addView(spinner2);
                if (spinner.getVisibility() == 0) {
                    spinner2.setEnabled(false);
                    spinner2.setClickable(false);
                    int i4116 = d;
                    int i4117 = i4116 & 61;
                    int i4118 = (i4116 | 61) & (~i4117);
                    int i4119 = i4117 << 1;
                    int i41110 = ((i4118 | i4119) << 1) - (i4118 ^ i4119);
                    c = i41110 % 128;
                    int i41111 = i41110 % 2;
                } else {
                    spinner2.setEnabled(true);
                    spinner2.setClickable(true);
                    int i513 = c;
                    int i514 = (((i513 | 82) << 1) - (i513 ^ 82)) - 1;
                    d = i514 % 128;
                    int i515 = i514 % 2;
                }
            }
            linearLayout.addView(spinner3);
            if (spinner.getVisibility() == 0) {
                int i516 = d;
                i4 = (i516 ^ 37) + ((i516 & 37) << 1);
                c = i4 % 128;
                if (i4 % 2 == 0) {
                    spinner3.setEnabled(true);
                    z = false;
                } else {
                    z = false;
                    spinner3.setEnabled(false);
                }
                spinner3.setClickable(z);
                int i517 = d;
                int i518 = ((i517 & 93) - (~(-(-(i517 | 93))))) - 1;
                c = i518 % 128;
                int i519 = i518 % 2;
            } else {
                spinner2.setEnabled(true);
                spinner2.setClickable(true);
                int i66 = c;
                int i67 = i66 & 53;
                int i68 = i67 + ((i66 ^ 53) | i67);
                d = i68 % 128;
                int i69 = i68 % 2;
            }
            linearLayout.addView(view);
            this.linearLayout.addView(linearLayout);
            int i610 = d;
            i3 = (i610 & 79) + (i610 | 79);
            c = i3 % 128;
            if (i3 % 2 == 0) {
                int i611 = 18 / 0;
            }
            spinner.setVisibility(0);
            int i70 = d;
            int i71 = ((i70 | 73) << 1) - (((~i70) & 73) | (i70 & (-74)));
            c = i71 % 128;
            int i72 = i71 % 2;
            linearLayout.addView(linearLayout2);
            linearLayout.addView(spinner);
            i2 = d + 81;
            c = i2 % 128;
            if (i2 % 2 == 0) {
                linearLayout.addView(spinner2);
                int i4120 = 51 / 0;
                if (spinner.getVisibility() == 0) {
                    spinner2.setEnabled(false);
                    spinner2.setClickable(false);
                    int i41112 = d;
                    int i41113 = i41112 & 61;
                    int i41114 = (i41112 | 61) & (~i41113);
                    int i41115 = i41113 << 1;
                    int i41116 = ((i41114 | i41115) << 1) - (i41114 ^ i41115);
                    c = i41116 % 128;
                    int i41117 = i41116 % 2;
                } else {
                    spinner2.setEnabled(true);
                    spinner2.setClickable(true);
                    int i5110 = c;
                    int i5111 = (((i5110 | 82) << 1) - (i5110 ^ 82)) - 1;
                    d = i5111 % 128;
                    int i5112 = i5111 % 2;
                }
            } else {
                linearLayout.addView(spinner2);
                if (spinner.getVisibility() == 0) {
                    spinner2.setEnabled(false);
                    spinner2.setClickable(false);
                    int i41118 = d;
                    int i41119 = i41118 & 61;
                    int i411110 = (i41118 | 61) & (~i41119);
                    int i411111 = i41119 << 1;
                    int i411112 = ((i411110 | i411111) << 1) - (i411110 ^ i411111);
                    c = i411112 % 128;
                    int i411113 = i411112 % 2;
                } else {
                    spinner2.setEnabled(true);
                    spinner2.setClickable(true);
                    int i5113 = c;
                    int i5114 = (((i5113 | 82) << 1) - (i5113 ^ 82)) - 1;
                    d = i5114 % 128;
                    int i5115 = i5114 % 2;
                }
            }
            linearLayout.addView(spinner3);
            if (spinner.getVisibility() == 0) {
                int i5116 = d;
                i4 = (i5116 ^ 37) + ((i5116 & 37) << 1);
                c = i4 % 128;
                if (i4 % 2 == 0) {
                    spinner3.setEnabled(true);
                    z = false;
                } else {
                    z = false;
                    spinner3.setEnabled(false);
                }
                spinner3.setClickable(z);
                int i5117 = d;
                int i5118 = ((i5117 & 93) - (~(-(-(i5117 | 93))))) - 1;
                c = i5118 % 128;
                int i5119 = i5118 % 2;
            } else {
                spinner2.setEnabled(true);
                spinner2.setClickable(true);
                int i612 = c;
                int i613 = i612 & 53;
                int i614 = i613 + ((i612 ^ 53) | i613);
                d = i614 % 128;
                int i615 = i614 % 2;
            }
            linearLayout.addView(view);
            this.linearLayout.addView(linearLayout);
            int i616 = d;
            i3 = (i616 & 79) + (i616 | 79);
            c = i3 % 128;
            if (i3 % 2 == 0) {
                int i617 = 18 / 0;
            }
        } catch (Exception unused) {
            Toast.makeText(getActivity(), "Something seriously went wrong please check", 0).show();
        }
    }
}
