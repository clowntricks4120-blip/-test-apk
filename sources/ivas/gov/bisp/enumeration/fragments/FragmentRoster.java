package ivas.gov.bisp.enumeration.fragments;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Fragment;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import ivas.gov.bisp.enumeration.ActivityBeginSurvey;
import ivas.gov.bisp.enumeration.BISPApplication;
import ivas.gov.bisp.enumeration.X.e;
import ivas.gov.bisp.enumeration.activity.nadra.NewFormNadraRoster;
import ivas.gov.bisp.enumeration.activity.nadra.SelectHouseHoldActivity;
import ivas.gov.bisp.enumeration.adapters.AdapterRosterList;
import ivas.gov.bisp.enumeration.ax.av.buW;
import ivas.gov.bisp.enumeration.bK.ac;
import ivas.gov.bisp.enumeration.bK.af;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.fragments.FragmentRoster;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.BeneficiaryEntity;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.CitizenData;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.models.Roster;
import ivas.gov.bisp.enumeration.models.SupervisorParseObject;
import ivas.gov.bisp.enumeration.models.Survey;
import ivas.gov.bisp.enumeration.models.VerificationQuestionsCount;
import ivas.gov.bisp.enumeration.p024ax.I;
import ivas.gov.bisp.enumeration.p024ax.av;
import ivas.gov.bisp.enumeration.p024ax.ax;
import ivas.gov.bisp.enumeration.p026az.C0104p;
import ivas.gov.bisp.enumeration.p026az.z;
import ivas.gov.bisp.enumeration.rosterActivity.ActivityRoster;
import ivas.gov.bisp.enumeration.rosterActivity.OfflineRosterActivity;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import net.sqlcipher.BuildConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"DefaultLocale"})
public class FragmentRoster extends Fragment implements e {
    private static final int REQUEST_CODE_ROSTER_ADD = 101;
    private static final int REQUEST_CODE_ROSTER_EDIT = 100;
    private static final int REQUEST_NADRA_CODE_ROSTER_ADD = 102;
    private static int a = 1;
    private static int b;
    private ActivityBeginSurvey activityBeginSurvey;
    public AppDatabase appDatabase;

    @BindView
    public Button btn_add_nadra;

    @BindView
    public Button buttonAddMore;
    private AdapterRosterList mAdapter;
    private RecyclerView.Oooo000 mLayoutManager;
    private ProgressDialog mProgressBar;

    @BindView
    public RecyclerView mRecyclerView;
    public ProgressBar progressBar;
    private SessionManager sessionManager;
    public int surveyCountWithoutCNIC;
    public static final byte[] d = {30, -75, -47, -49, 6, -24, 18, 48, -72, 11, -1, -21, 0, 6, -14, -8, 72, -40, -21, -1, -21, 0, 10, 16, -18, -16, 7, -14, -1};
    public static final int c = 183;
    private View parentView = null;
    public int roster1 = 0;
    public int roster2 = 0;
    private int validatingRosterPosition = -1;
    private String validatingRosterCnic = null;
    private double dividerForPercentage = 0.0d;

    public static /* synthetic */ ActivityBeginSurvey access$000(FragmentRoster fragmentRoster) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 99) + ((i2 & 99) << 1);
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        ActivityBeginSurvey activityBeginSurvey = fragmentRoster.activityBeginSurvey;
        int i6 = (((i4 | 31) << 1) - (~(-(((~i4) & 31) | (i4 & (-32)))))) - 1;
        a = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 89 / 0;
        }
        return activityBeginSurvey;
    }

    public static /* synthetic */ SessionManager access$100(FragmentRoster fragmentRoster) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 75;
        int i4 = (i2 | 75) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        int i7 = i6 % 128;
        b = i7;
        int i8 = i6 % 2;
        SessionManager sessionManager = fragmentRoster.sessionManager;
        int i9 = ((i7 | REQUEST_CODE_ROSTER_ADD) << 1) - (i7 ^ REQUEST_CODE_ROSTER_ADD);
        a = i9 % 128;
        int i10 = i9 % 2;
        return sessionManager;
    }

    public static /* synthetic */ void access$1000(FragmentRoster fragmentRoster) {
        int i = 2 % 2;
        int i2 = a + 63;
        b = i2 % 128;
        int i3 = i2 % 2;
        fragmentRoster.addNadraHouseHold();
        int i4 = a + 117;
        b = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void access$200(FragmentRoster fragmentRoster, int i, String str) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 ^ 107;
        int i5 = ((i3 & 107) | i4) << 1;
        int i6 = -i4;
        int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
        b = i7 % 128;
        int i8 = i7 % 2;
        fragmentRoster.onlineNadraRostercall(i, str);
        if (i8 != 0) {
            int i9 = 53 / 0;
        }
    }

    public static /* synthetic */ int access$302(FragmentRoster fragmentRoster, int i) {
        int i2 = 2 % 2;
        int i3 = a + 43;
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        fragmentRoster.validatingRosterPosition = i;
        int i6 = i4 & 117;
        int i7 = -(-(i4 | 117));
        int i8 = ((i6 | i7) << 1) - (i6 ^ i7);
        a = i8 % 128;
        int i9 = i8 % 2;
        return i;
    }

    public static /* synthetic */ String access$402(FragmentRoster fragmentRoster, String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 73;
        int i4 = ((i2 ^ 73) | i3) << 1;
        int i5 = -((i2 | 73) & (~i3));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        int i7 = i6 % 128;
        a = i7;
        int i8 = i6 % 2;
        fragmentRoster.validatingRosterCnic = str;
        int i9 = ((i7 ^ 7) | (i7 & 7)) << 1;
        int i10 = -(((~i7) & 7) | (i7 & (-8)));
        int i11 = ((i9 | i10) << 1) - (i9 ^ i10);
        b = i11 % 128;
        int i12 = i11 % 2;
        return str;
    }

    public static /* synthetic */ void access$500(FragmentRoster fragmentRoster, String str, boolean z) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 17) + (i2 | 17);
        b = i3 % 128;
        int i4 = i3 % 2;
        fragmentRoster.setValidationDataToMainModel(str, z);
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = (-2) - ((a + 26) ^ (-1));
        b = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 34 / 0;
        }
    }

    public static /* synthetic */ void access$600(FragmentRoster fragmentRoster, String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-102)) | ((~i2) & REQUEST_CODE_ROSTER_ADD);
        int i4 = (i2 & REQUEST_CODE_ROSTER_ADD) << 1;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        fragmentRoster.createValidateCNICJson(str);
        if (i6 == 0) {
            int i7 = 34 / 0;
        }
        int i8 = b;
        int i9 = ((i8 | 57) << 1) - (i8 ^ 57);
        a = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 87 / 0;
        }
    }

    public static /* synthetic */ AdapterRosterList access$700(FragmentRoster fragmentRoster) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 79) + (i2 | 79);
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        AdapterRosterList adapterRosterList = fragmentRoster.mAdapter;
        if (i5 != 0) {
            throw null;
        }
        int i6 = i4 & 105;
        int i7 = (i4 ^ 105) | i6;
        int i8 = (i6 & i7) + (i7 | i6);
        a = i8 % 128;
        if (i8 % 2 != 0) {
            return adapterRosterList;
        }
        throw null;
    }

    public static /* synthetic */ ProgressDialog access$800(FragmentRoster fragmentRoster) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 90) + ((i2 & 90) << 1)) - 1;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            return fragmentRoster.mProgressBar;
        }
        int i4 = 13 / 0;
        return fragmentRoster.mProgressBar;
    }

    public static /* synthetic */ void access$900(FragmentRoster fragmentRoster) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 83;
        int i4 = (i2 | 83) & (~i3);
        int i5 = i3 << 1;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        b = i6 % 128;
        int i7 = i6 % 2;
        fragmentRoster.addNadraRoster();
        if (i7 != 0) {
            throw null;
        }
        int i8 = a + 29;
        b = i8 % 128;
        int i9 = i8 % 2;
    }

    private void addRoster(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 97;
        int i4 = ((((i2 ^ 97) | i3) << 1) - (~(-((i2 | 97) & (~i3))))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void c(FragmentRoster fragmentRoster, View view) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (-2) - (((i2 ^ 44) + ((i2 & 44) << 1)) ^ (-1));
        b = i3 % 128;
        int i4 = i3 % 2;
        fragmentRoster.lambda$onCreateView$2(view);
        if (i4 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void cnicDialog() {
        int i = 2 % 2;
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        Activity activity = getActivity();
        int i2 = a;
        int i3 = i2 & 41;
        int i4 = (((i2 ^ 41) | i3) << 1) - ((i2 | 41) & (~i3));
        b = i4 % 128;
        int i5 = i4 % 2;
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.content);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getActivity());
        int i6 = a;
        int i7 = (i6 & 99) + (i6 | 99);
        b = i7 % 128;
        int i8 = i7 % 2;
        View viewInflate = layoutInflaterFrom.inflate(ivas.gov.bisp.enumeration.R.layout.cnic_dialog, viewGroup, false);
        builder.setView(viewInflate);
        int i9 = b;
        int i10 = i9 & 69;
        int i11 = (((i9 ^ 69) | i10) << 1) - ((i9 | 69) & (~i10));
        a = i11 % 128;
        int i12 = i11 % 2;
        final AlertDialog alertDialogK = ivas.gov.bisp.enumeration.p091n.j.k(builder, false);
        final EditText editText = (EditText) viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.et_cnic);
        TextView textView = (TextView) viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.btn_ok);
        editText.addTextChangedListener(new av(getActivity()).new buW(editText));
        textView.setOnClickListener(new View.OnClickListener() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentRoster.1
            private static int a = 0;
            private static int b = 1;

            /* JADX WARN: Code duplicated, block: B:29:0x0117  */
            /* JADX WARN: Code duplicated, block: B:31:0x0144  */
            /* JADX WARN: Code duplicated, block: B:32:0x0150  */
            /* JADX WARN: Code duplicated, block: B:36:0x01a6  */
            /* JADX WARN: Code duplicated, block: B:38:0x01da  */
            /* JADX WARN: Code duplicated, block: B:40:0x01f6  */
            /* JADX WARN: Code duplicated, block: B:41:0x01fa  */
            /* JADX WARN: Code duplicated, block: B:44:0x0230  */
            /* JADX WARN: Code duplicated, block: B:45:0x0236  */
            /* JADX WARN: Code duplicated, block: B:51:0x0268  */
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent intent;
                Survey survey;
                int i13;
                int i14;
                FragmentRoster fragmentRoster;
                int i15;
                Intent intent2;
                Survey survey2;
                int i16;
                int i17 = 2 % 2;
                int i18 = b;
                int i19 = i18 ^ 77;
                int i20 = ((((i18 & 77) | i19) << 1) - (~(-i19))) - 1;
                a = i20 % 128;
                Object obj = null;
                if (i20 % 2 != 0) {
                    editText.getText().toString();
                    throw null;
                }
                ag.f = editText.getText().toString().replace("-", BuildConfig.FLAVOR);
                int i21 = b;
                int i22 = i21 & 21;
                int i23 = -(-(i21 | 21));
                int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
                int i25 = i24 % 128;
                a = i25;
                if (i24 % 2 != 0) {
                    int i26 = 4 / 0;
                }
                int i27 = (i25 & 29) + (i25 | 29);
                b = i27 % 128;
                int i28 = i27 % 2;
                int i29 = 0;
                boolean z = false;
                while (true) {
                    ArrayList<Roster> arrayList = FragmentRoster.access$000(FragmentRoster.this).aq;
                    int i30 = b;
                    int i31 = ((i30 | 73) << 1) - (i30 ^ 73);
                    a = i31 % 128;
                    int i32 = i31 % 2;
                    if (i29 >= arrayList.size()) {
                        break;
                    }
                    int i33 = a + 1;
                    b = i33 % 128;
                    int i34 = i33 % 2;
                    Roster roster = FragmentRoster.access$000(FragmentRoster.this).aq.get(i29);
                    int i35 = a;
                    int i36 = ((i35 ^ 87) - (~((i35 & 87) << 1))) - 1;
                    b = i36 % 128;
                    int i37 = i36 % 2;
                    if (roster.relation_to_household_id == 186) {
                        int i38 = a + 49;
                        b = i38 % 128;
                        z = i38 % 2 != 0;
                    }
                    int i39 = (i29 & 81) | ((~i29) & (-82));
                    int i40 = -(-((i29 & (-82)) << 1));
                    int i41 = ((i39 | i40) << 1) - (i40 ^ i39);
                    int i42 = i41 ^ 83;
                    int i43 = (i41 & 83) << 1;
                    i29 = (i42 | i43) + (i42 & i43);
                    int i44 = a;
                    int i45 = i44 & 27;
                    int i46 = i45 + ((i44 ^ 27) | i45);
                    b = i46 % 128;
                    int i47 = i46 % 2;
                }
                if (FragmentRoster.access$000(FragmentRoster.this).aq != null) {
                    int i48 = a + 45;
                    b = i48 % 128;
                    if (i48 % 2 == 0) {
                        FragmentRoster.access$000(FragmentRoster.this).aq.size();
                        obj.hashCode();
                        throw null;
                    }
                    if (FragmentRoster.access$000(FragmentRoster.this).aq.size() > 0) {
                        int i49 = b;
                        int i50 = i49 ^ 11;
                        int i51 = ((i49 & 11) | i50) << 1;
                        int i52 = -i50;
                        int i53 = (i51 ^ i52) + ((i51 & i52) << 1);
                        a = i53 % 128;
                        if (i53 % 2 != 0) {
                            int i54 = 36 / 0;
                            if (z) {
                                intent2 = new Intent(FragmentRoster.this.getActivity(), (Class<?>) NewFormNadraRoster.class);
                                int i55 = b + 107;
                                a = i55 % 128;
                                int i56 = i55 % 2;
                                survey2 = FragmentRoster.access$000(FragmentRoster.this).aG;
                                int i57 = b;
                                i16 = (i57 ^ 85) + ((i57 & 85) << 1);
                                a = i16 % 128;
                                if (i16 % 2 != 0) {
                                    intent2.putExtra("survey", survey2);
                                    intent2.putExtra("cnic", ag.f);
                                    int i58 = 32 / 0;
                                } else {
                                    intent2.putExtra("survey", survey2);
                                    intent2.putExtra("cnic", ag.f);
                                }
                                int i59 = a;
                                int i60 = i59 & 35;
                                int i61 = i60 + ((i59 ^ 35) | i60);
                                b = i61 % 128;
                                int i62 = i61 % 2;
                                intent2.putExtra("is_edit", false);
                                ArrayList<Roster> arrayList2 = FragmentRoster.access$000(FragmentRoster.this).aq;
                                int i63 = a;
                                int i64 = ((i63 ^ 78) + ((i63 & 78) << 1)) - 1;
                                b = i64 % 128;
                                int i65 = i64 % 2;
                                intent2.putExtra("roster_list", arrayList2);
                                FragmentRoster.this.startActivityForResult(intent2, FragmentRoster.REQUEST_NADRA_CODE_ROSTER_ADD);
                                int i66 = b;
                                int i67 = ((i66 ^ 74) + ((i66 & 74) << 1)) - 1;
                                a = i67 % 128;
                                int i68 = i67 % 2;
                            } else {
                                intent = new Intent(FragmentRoster.this.getActivity(), (Class<?>) SelectHouseHoldActivity.class);
                                int i69 = b;
                                int i70 = ((i69 & (-10)) | ((~i69) & 9)) + ((i69 & 9) << 1);
                                a = i70 % 128;
                                int i71 = i70 % 2;
                                survey = FragmentRoster.access$000(FragmentRoster.this).aG;
                                int i72 = b;
                                i13 = (i72 & 117) + (i72 | 117);
                                a = i13 % 128;
                                if (i13 % 2 == 0) {
                                    intent.putExtra("survey", survey);
                                    intent.putExtra("cnic", ag.f);
                                    obj.hashCode();
                                    throw null;
                                }
                                intent.putExtra("survey", survey);
                                intent.putExtra("cnic", ag.f);
                                int i73 = b;
                                int i74 = i73 & 119;
                                int i75 = -(-((i73 ^ 119) | i74));
                                i14 = (i74 & i75) + (i75 | i74);
                                a = i14 % 128;
                                if (i14 % 2 != 0) {
                                    intent.putExtra("is_edit", true);
                                } else {
                                    intent.putExtra("is_edit", false);
                                }
                                ActivityBeginSurvey activityBeginSurveyAccess$000 = FragmentRoster.access$000(FragmentRoster.this);
                                int i76 = b;
                                int i77 = ((i76 | 90) << 1) - (i76 ^ 90);
                                int i78 = (i77 ^ (-1)) + (i77 << 1);
                                a = i78 % 128;
                                int i79 = i78 % 2;
                                intent.putExtra("roster_list", activityBeginSurveyAccess$000.aq);
                                fragmentRoster = FragmentRoster.this;
                                int i80 = b;
                                i15 = (((i80 & (-104)) | ((~i80) & 103)) - (~((i80 & 103) << 1))) - 1;
                                a = i15 % 128;
                                if (i15 % 2 != 0) {
                                    fragmentRoster.startActivityForResult(intent, 86);
                                } else {
                                    fragmentRoster.startActivityForResult(intent, FragmentRoster.REQUEST_NADRA_CODE_ROSTER_ADD);
                                }
                                int i81 = a;
                                int i82 = i81 & 119;
                                int i83 = (i81 ^ 119) | i82;
                                int i84 = (i82 & i83) + (i83 | i82);
                                b = i84 % 128;
                                int i85 = i84 % 2;
                            }
                        } else if (z) {
                            intent2 = new Intent(FragmentRoster.this.getActivity(), (Class<?>) NewFormNadraRoster.class);
                            int i510 = b + 107;
                            a = i510 % 128;
                            int i511 = i510 % 2;
                            survey2 = FragmentRoster.access$000(FragmentRoster.this).aG;
                            int i512 = b;
                            i16 = (i512 ^ 85) + ((i512 & 85) << 1);
                            a = i16 % 128;
                            if (i16 % 2 != 0) {
                                intent2.putExtra("survey", survey2);
                                intent2.putExtra("cnic", ag.f);
                                int i513 = 32 / 0;
                            } else {
                                intent2.putExtra("survey", survey2);
                                intent2.putExtra("cnic", ag.f);
                            }
                            int i514 = a;
                            int i610 = i514 & 35;
                            int i611 = i610 + ((i514 ^ 35) | i610);
                            b = i611 % 128;
                            int i612 = i611 % 2;
                            intent2.putExtra("is_edit", false);
                            ArrayList<Roster> arrayList3 = FragmentRoster.access$000(FragmentRoster.this).aq;
                            int i613 = a;
                            int i614 = ((i613 ^ 78) + ((i613 & 78) << 1)) - 1;
                            b = i614 % 128;
                            int i615 = i614 % 2;
                            intent2.putExtra("roster_list", arrayList3);
                            FragmentRoster.this.startActivityForResult(intent2, FragmentRoster.REQUEST_NADRA_CODE_ROSTER_ADD);
                            int i616 = b;
                            int i617 = ((i616 ^ 74) + ((i616 & 74) << 1)) - 1;
                            a = i617 % 128;
                            int i618 = i617 % 2;
                        } else {
                            intent = new Intent(FragmentRoster.this.getActivity(), (Class<?>) SelectHouseHoldActivity.class);
                            int i619 = b;
                            int i710 = ((i619 & (-10)) | ((~i619) & 9)) + ((i619 & 9) << 1);
                            a = i710 % 128;
                            int i711 = i710 % 2;
                            survey = FragmentRoster.access$000(FragmentRoster.this).aG;
                            int i712 = b;
                            i13 = (i712 & 117) + (i712 | 117);
                            a = i13 % 128;
                            if (i13 % 2 == 0) {
                                intent.putExtra("survey", survey);
                                intent.putExtra("cnic", ag.f);
                                obj.hashCode();
                                throw null;
                            }
                            intent.putExtra("survey", survey);
                            intent.putExtra("cnic", ag.f);
                            int i713 = b;
                            int i714 = i713 & 119;
                            int i715 = -(-((i713 ^ 119) | i714));
                            i14 = (i714 & i715) + (i715 | i714);
                            a = i14 % 128;
                            if (i14 % 2 != 0) {
                                intent.putExtra("is_edit", true);
                            } else {
                                intent.putExtra("is_edit", false);
                            }
                            ActivityBeginSurvey activityBeginSurveyAccess$001 = FragmentRoster.access$000(FragmentRoster.this);
                            int i716 = b;
                            int i717 = ((i716 | 90) << 1) - (i716 ^ 90);
                            int i718 = (i717 ^ (-1)) + (i717 << 1);
                            a = i718 % 128;
                            int i719 = i718 % 2;
                            intent.putExtra("roster_list", activityBeginSurveyAccess$001.aq);
                            fragmentRoster = FragmentRoster.this;
                            int i86 = b;
                            i15 = (((i86 & (-104)) | ((~i86) & 103)) - (~((i86 & 103) << 1))) - 1;
                            a = i15 % 128;
                            if (i15 % 2 != 0) {
                                fragmentRoster.startActivityForResult(intent, 86);
                            } else {
                                fragmentRoster.startActivityForResult(intent, FragmentRoster.REQUEST_NADRA_CODE_ROSTER_ADD);
                            }
                            int i87 = a;
                            int i88 = i87 & 119;
                            int i89 = (i87 ^ 119) | i88;
                            int i810 = (i88 & i89) + (i89 | i88);
                            b = i810 % 128;
                            int i811 = i810 % 2;
                        }
                    } else {
                        intent = new Intent(FragmentRoster.this.getActivity(), (Class<?>) SelectHouseHoldActivity.class);
                        int i6110 = b;
                        int i7110 = ((i6110 & (-10)) | ((~i6110) & 9)) + ((i6110 & 9) << 1);
                        a = i7110 % 128;
                        int i7111 = i7110 % 2;
                        survey = FragmentRoster.access$000(FragmentRoster.this).aG;
                        int i7112 = b;
                        i13 = (i7112 & 117) + (i7112 | 117);
                        a = i13 % 128;
                        if (i13 % 2 == 0) {
                            intent.putExtra("survey", survey);
                            intent.putExtra("cnic", ag.f);
                            obj.hashCode();
                            throw null;
                        }
                        intent.putExtra("survey", survey);
                        intent.putExtra("cnic", ag.f);
                        int i7113 = b;
                        int i7114 = i7113 & 119;
                        int i7115 = -(-((i7113 ^ 119) | i7114));
                        i14 = (i7114 & i7115) + (i7115 | i7114);
                        a = i14 % 128;
                        if (i14 % 2 != 0) {
                            intent.putExtra("is_edit", true);
                        } else {
                            intent.putExtra("is_edit", false);
                        }
                        ActivityBeginSurvey activityBeginSurveyAccess$002 = FragmentRoster.access$000(FragmentRoster.this);
                        int i7116 = b;
                        int i7117 = ((i7116 | 90) << 1) - (i7116 ^ 90);
                        int i7118 = (i7117 ^ (-1)) + (i7117 << 1);
                        a = i7118 % 128;
                        int i7119 = i7118 % 2;
                        intent.putExtra("roster_list", activityBeginSurveyAccess$002.aq);
                        fragmentRoster = FragmentRoster.this;
                        int i812 = b;
                        i15 = (((i812 & (-104)) | ((~i812) & 103)) - (~((i812 & 103) << 1))) - 1;
                        a = i15 % 128;
                        if (i15 % 2 != 0) {
                            fragmentRoster.startActivityForResult(intent, 86);
                        } else {
                            fragmentRoster.startActivityForResult(intent, FragmentRoster.REQUEST_NADRA_CODE_ROSTER_ADD);
                        }
                        int i813 = a;
                        int i814 = i813 & 119;
                        int i815 = (i813 ^ 119) | i814;
                        int i816 = (i814 & i815) + (i815 | i814);
                        b = i816 % 128;
                        int i817 = i816 % 2;
                    }
                } else {
                    intent = new Intent(FragmentRoster.this.getActivity(), (Class<?>) SelectHouseHoldActivity.class);
                    int i6111 = b;
                    int i71110 = ((i6111 & (-10)) | ((~i6111) & 9)) + ((i6111 & 9) << 1);
                    a = i71110 % 128;
                    int i71111 = i71110 % 2;
                    survey = FragmentRoster.access$000(FragmentRoster.this).aG;
                    int i71112 = b;
                    i13 = (i71112 & 117) + (i71112 | 117);
                    a = i13 % 128;
                    if (i13 % 2 == 0) {
                        intent.putExtra("survey", survey);
                        intent.putExtra("cnic", ag.f);
                        obj.hashCode();
                        throw null;
                    }
                    intent.putExtra("survey", survey);
                    intent.putExtra("cnic", ag.f);
                    int i71113 = b;
                    int i71114 = i71113 & 119;
                    int i71115 = -(-((i71113 ^ 119) | i71114));
                    i14 = (i71114 & i71115) + (i71115 | i71114);
                    a = i14 % 128;
                    if (i14 % 2 != 0) {
                        intent.putExtra("is_edit", true);
                    } else {
                        intent.putExtra("is_edit", false);
                    }
                    ActivityBeginSurvey activityBeginSurveyAccess$003 = FragmentRoster.access$000(FragmentRoster.this);
                    int i71116 = b;
                    int i71117 = ((i71116 | 90) << 1) - (i71116 ^ 90);
                    int i71118 = (i71117 ^ (-1)) + (i71117 << 1);
                    a = i71118 % 128;
                    int i71119 = i71118 % 2;
                    intent.putExtra("roster_list", activityBeginSurveyAccess$003.aq);
                    fragmentRoster = FragmentRoster.this;
                    int i818 = b;
                    i15 = (((i818 & (-104)) | ((~i818) & 103)) - (~((i818 & 103) << 1))) - 1;
                    a = i15 % 128;
                    if (i15 % 2 != 0) {
                        fragmentRoster.startActivityForResult(intent, 86);
                    } else {
                        fragmentRoster.startActivityForResult(intent, FragmentRoster.REQUEST_NADRA_CODE_ROSTER_ADD);
                    }
                    int i819 = a;
                    int i8110 = i819 & 119;
                    int i8111 = (i819 ^ 119) | i8110;
                    int i8112 = (i8110 & i8111) + (i8111 | i8110);
                    b = i8112 % 128;
                    int i8113 = i8112 % 2;
                }
                alertDialogK.dismiss();
                int i90 = a;
                int i91 = (i90 & (-126)) | ((~i90) & 125);
                int i92 = -(-((i90 & 125) << 1));
                int i93 = (i91 & i92) + (i92 | i91);
                b = i93 % 128;
                if (i93 % 2 == 0) {
                    throw null;
                }
            }
        });
        int i13 = a;
        int i14 = ((i13 ^ 65) | (i13 & 65)) << 1;
        int i15 = -(((~i13) & 65) | (i13 & (-66)));
        int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
        b = i16 % 128;
        int i17 = i16 % 2;
    }

    public static /* synthetic */ void d(FragmentRoster fragmentRoster, EditText editText, String str, String str2, int i, String str3, String str4, double d2, int i2, AlertDialog alertDialog, View view) {
        int i3 = 2 % 2;
        int i4 = a + 73;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        fragmentRoster.lambda$setValidationDataToMainModel$3(editText, str, str2, i, str3, str4, d2, i2, alertDialog, view);
        int i5 = b + 45;
        a = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ void e(FragmentRoster fragmentRoster, BeneficiaryEntity beneficiaryEntity) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 123) << 1) - (i2 ^ 123);
        a = i3 % 128;
        int i4 = i3 % 2;
        fragmentRoster.lambda$saveBeneficiary$5(beneficiaryEntity);
        if (i4 == 0) {
            int i5 = 11 / 0;
        }
    }

    public static /* synthetic */ void f(FragmentRoster fragmentRoster, View view) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 27) | (i2 & 27)) << 1;
        int i4 = -(((~i2) & 27) | (i2 & (-28)));
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        fragmentRoster.lambda$onCreateView$0(view);
        int i7 = b;
        int i8 = (i7 ^ 1) + ((i7 & 1) << 1);
        a = i8 % 128;
        int i9 = i8 % 2;
    }

    public static /* synthetic */ void g(FragmentRoster fragmentRoster, View view) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & (-74)) | ((~i2) & 73)) + ((i2 & 73) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        fragmentRoster.lambda$onCreateView$1(view);
        if (i4 != 0) {
            int i5 = 35 / 0;
        }
        int i6 = b;
        int i7 = (i6 ^ 73) + ((i6 & 73) << 1);
        a = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void h(FragmentRoster fragmentRoster, AlertDialog alertDialog, EditText editText, String str, String str2, int i, String str3, String str4, double d2, int i2, DialogInterface dialogInterface) {
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = ((i4 | 71) << 1) - (i4 ^ 71);
        int i6 = i5 % 128;
        a = i6;
        int i7 = i5 % 2;
        int i8 = i6 & 77;
        int i9 = ((((i6 ^ 77) | i8) << 1) - (~(-((i6 | 77) & (~i8))))) - 1;
        b = i9 % 128;
        int i10 = i9 % 2;
        fragmentRoster.lambda$setValidationDataToMainModel$4(alertDialog, editText, str, str2, i, str3, str4, d2, i2, dialogInterface);
        if (i10 != 0) {
            int i11 = 47 / 0;
        }
    }

    private /* synthetic */ void lambda$onCreateView$0(View view) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 91) << 1) - (i2 ^ 91);
        a = i3 % 128;
        int i4 = i3 % 2;
        addRoster(null);
        int i5 = b;
        int i6 = i5 & 3;
        int i7 = i6 + ((i5 ^ 3) | i6);
        a = i7 % 128;
        int i8 = i7 % 2;
    }

    private /* synthetic */ void lambda$saveBeneficiary$5(BeneficiaryEntity beneficiaryEntity) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 & (-6)) | ((~i2) & 5)) - (~(-(-((i2 & 5) << 1))))) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        this.appDatabase.m().bi(beneficiaryEntity);
        int i5 = b + 87;
        a = i5 % 128;
        int i6 = i5 % 2;
    }

    public void requestCNICVerify(JSONObject jSONObject) {
        int i = 2 % 2;
        Activity activity = getActivity();
        I i2 = new I() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentRoster.5
            private static int a = 0;
            private static int b = 1;

            @Override // ivas.gov.bisp.enumeration.p024ax.I
            public void onError(ResponseMessage responseMessage) {
                int i3 = 2 % 2;
                int i4 = b;
                int i5 = (i4 ^ 43) + ((i4 & 43) << 1);
                a = i5 % 128;
                int i6 = i5 % 2;
                ax.b(FragmentRoster.access$800(FragmentRoster.this));
                FragmentRoster fragmentRoster = FragmentRoster.this;
                int i7 = a;
                int i8 = i7 & 19;
                int i9 = i8 + ((i7 ^ 19) | i8);
                b = i9 % 128;
                int i10 = i9 % 2;
                fragmentRoster.progressBar.setVisibility(8);
                Activity activity2 = FragmentRoster.this.getActivity();
                int i11 = b;
                int i12 = i11 | 13;
                int i13 = i12 << 1;
                int i14 = -((~(i11 & 13)) & i12);
                int i15 = (i13 & i14) + (i14 | i13);
                a = i15 % 128;
                int i16 = i15 % 2;
                af.b(activity2, responseMessage.getErrorMessage(), responseMessage.isLogout());
                int i17 = b;
                int i18 = (i17 & 9) + (i17 | 9);
                a = i18 % 128;
                int i19 = i18 % 2;
            }

            @Override // ivas.gov.bisp.enumeration.p024ax.I
            public void onSuccess(JSONObject jSONObject2) {
                ProgressBar progressBar;
                int i3;
                int i4 = 2 % 2;
                int i5 = b;
                int i6 = (i5 & 83) + (i5 | 83);
                a = i6 % 128;
                if (i6 % 2 != 0) {
                    progressBar = FragmentRoster.this.progressBar;
                    i3 = 91;
                } else {
                    progressBar = FragmentRoster.this.progressBar;
                    i3 = 8;
                }
                progressBar.setVisibility(i3);
                ax.b(FragmentRoster.access$800(FragmentRoster.this));
                try {
                    String string = jSONObject2.getString("result");
                    int i7 = a;
                    int i8 = i7 & 19;
                    int i9 = (i7 | 19) & (~i8);
                    int i10 = i8 << 1;
                    int i11 = ((i9 | i10) << 1) - (i9 ^ i10);
                    b = i11 % 128;
                    if (i11 % 2 == 0) {
                        FragmentRoster.access$500(FragmentRoster.this, string, false);
                    } else {
                        FragmentRoster.access$500(FragmentRoster.this, string, true);
                    }
                    int i12 = b + 62;
                    int i13 = (i12 ^ (-1)) + (i12 << 1);
                    a = i13 % 128;
                    if (i13 % 2 == 0) {
                        return;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                } catch (JSONException unused) {
                }
            }
        };
        int i3 = a;
        int i4 = (i3 ^ 97) + ((i3 & 97) << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        ax.e(jSONObject, activity, "https://meladeskapp.bisp.gov.pk/api/Roster/V9MVu3ODp1hu5Dw3DWwB", i2);
        if (i5 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void lambda$onCreateView$2(View view) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 47;
        int i4 = ((i2 | 47) & (~i3)) + (i3 << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        ActivityBeginSurvey activityBeginSurvey = this.activityBeginSurvey;
        if (activityBeginSurvey.aq == null) {
            activityBeginSurvey.aq = new ArrayList<>();
            int i6 = a;
            int i7 = i6 ^ 13;
            int i8 = ((i6 & 13) | i7) << 1;
            int i9 = -i7;
            int i10 = (i8 & i9) + (i8 | i9);
            b = i10 % 128;
            int i11 = i10 % 2;
        }
        Object obj = null;
        addRoster(null);
        int i12 = a;
        int i13 = ((i12 | 99) << 1) - (i12 ^ 99);
        b = i13 % 128;
        if (i13 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private /* synthetic */ void lambda$setValidationDataToMainModel$4(final AlertDialog alertDialog, final EditText editText, final String str, final String str2, final int i, final String str3, final String str4, final double d2, final int i2, DialogInterface dialogInterface) {
        int i3 = 2 % 2;
        Button button = alertDialog.getButton(-1);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: ivas.gov.bisp.enumeration.bA.p
            private static int a = 1;
            private static int b;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = 2 % 2;
                int i5 = b;
                int i6 = (((i5 ^ 119) | (i5 & 119)) << 1) - ((i5 & (-120)) | ((~i5) & 119));
                a = i6 % 128;
                if (i6 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                FragmentRoster fragmentRoster = this.d;
                EditText editText2 = editText;
                String str5 = str;
                int i7 = (-2) - (((i5 ^ 76) + ((i5 & 76) << 1)) ^ (-1));
                a = i7 % 128;
                int i8 = i7 % 2;
                String str6 = str2;
                int i9 = i;
                String str7 = str3;
                int i10 = (i5 & 44) + (i5 | 44);
                int i11 = (i10 ^ (-1)) + (i10 << 1);
                a = i11 % 128;
                int i12 = i11 % 2;
                String str8 = str4;
                double d3 = d2;
                int i13 = i2;
                int i14 = i5 + 1;
                a = i14 % 128;
                int i15 = i14 % 2;
                FragmentRoster.d(fragmentRoster, editText2, str5, str6, i9, str7, str8, d3, i13, alertDialog, view);
                int i16 = a;
                int i17 = i16 & 115;
                int i18 = i17 + ((i16 ^ 115) | i17);
                b = i18 % 128;
                if (i18 % 2 != 0) {
                    int i19 = 78 / 0;
                }
            }
        };
        int i4 = a;
        int i5 = i4 & 67;
        int i6 = ((i4 | 67) & (~i5)) + (i5 << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        button.setOnClickListener(onClickListener);
        int i8 = a;
        int i9 = ((i8 & 34) + (i8 | 34)) - 1;
        b = i9 % 128;
        if (i9 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.fragments.FragmentRoster$2, reason: invalid class name */
    public class AnonymousClass2 implements AdapterRosterList.OooO00o {
        private static int a = 0;
        private static int b = 1;

        public AnonymousClass2() {
        }

        public static /* synthetic */ void c(AnonymousClass2 anonymousClass2, int i, DialogInterface dialogInterface, int i2) {
            int i3 = 2 % 2;
            int i4 = a;
            int i5 = i4 & 55;
            int i6 = ((i4 | 55) & (~i5)) + (i5 << 1);
            b = i6 % 128;
            int i7 = i6 % 2;
            anonymousClass2.lambda$onDeleteClick$0(i, dialogInterface, i2);
            int i8 = b;
            int i9 = ((i8 | 1) << 1) - (i8 ^ 1);
            a = i9 % 128;
            if (i9 % 2 != 0) {
                throw null;
            }
        }

        @Override // ivas.gov.bisp.enumeration.adapters.AdapterRosterList.OooO00o
        public void onDeleteClick(final int i) {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = i3 ^ 39;
            int i5 = -(-((i3 & 39) << 1));
            int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
            int i7 = i6 % 128;
            a = i7;
            int i8 = i6 % 2;
            if (i >= 0) {
                int i9 = i7 & 117;
                int i10 = (i7 | 117) & (~i9);
                int i11 = i9 << 1;
                int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
                b = i12 % 128;
                int i13 = i12 % 2;
                C0104p.c().h(FragmentRoster.this.getActivity(), "Are you sure?", "Are you sure you want to delete the Roster?", new DialogInterface.OnClickListener() { // from class: ivas.gov.bisp.enumeration.fragments.j
                    private static int a = 1;
                    private static int b;

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i14) {
                        int i15 = 2 % 2;
                        int i16 = a;
                        int i17 = ((i16 & 80) + (i16 | 80)) - 1;
                        b = i17 % 128;
                        if (i17 % 2 != 0) {
                            FragmentRoster.AnonymousClass2.c(this.c, i, dialogInterface, i14);
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        FragmentRoster.AnonymousClass2.c(this.c, i, dialogInterface, i14);
                        int i18 = b;
                        int i19 = i18 & 63;
                        int i20 = (i18 | 63) & (~i19);
                        int i21 = i19 << 1;
                        int i22 = (i20 & i21) + (i20 | i21);
                        a = i22 % 128;
                        int i23 = i22 % 2;
                    }
                }, null, false);
                int i14 = b;
                int i15 = i14 & 3;
                int i16 = i15 + ((i14 ^ 3) | i15);
                a = i16 % 128;
                int i17 = i16 % 2;
            }
            int i18 = a;
            int i19 = i18 & 113;
            int i20 = ((i18 ^ 113) | i19) << 1;
            int i21 = -((i18 | 113) & (~i19));
            int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
            b = i22 % 128;
            int i23 = i22 % 2;
        }

        @Override // ivas.gov.bisp.enumeration.adapters.AdapterRosterList.OooO00o
        public void onEditClick(int i, String str) {
            FragmentRoster fragmentRoster;
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = ((i3 | 125) << 1) - (i3 ^ 125);
            b = i4 % 128;
            Object obj = null;
            if (i4 % 2 == 0) {
                boolean z = ag.f71o;
                throw null;
            }
            if (!ag.f71o) {
                int i5 = a;
                int i6 = i5 & 95;
                int i7 = i5 | 95;
                int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
                b = i8 % 128;
                int i9 = i8 % 2;
                ag.p = true;
                int i10 = a;
                int i11 = i10 & 71;
                int i12 = ((i10 ^ 71) | i11) << 1;
                int i13 = -((i10 | 71) & (~i11));
                int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
                b = i14 % 128;
                int i15 = i14 % 2;
            }
            if (FragmentRoster.access$100(FragmentRoster.this).l().intValue() != 2) {
                int i16 = (-2) - ((b + 92) ^ (-1));
                a = i16 % 128;
                if (i16 % 2 != 0) {
                    FragmentRoster.access$100(FragmentRoster.this).l().intValue();
                    obj.hashCode();
                    throw null;
                }
                int iIntValue = FragmentRoster.access$100(FragmentRoster.this).l().intValue();
                int i17 = a;
                int i18 = i17 & 81;
                int i19 = (i18 - (~(-(-((i17 ^ 81) | i18))))) - 1;
                b = i19 % 128;
                if (i19 % 2 != 0 ? iIntValue != 3 : iIntValue != 4) {
                    int i20 = ((i17 ^ 39) - (~(-(-((i17 & 39) << 1))))) - 1;
                    b = i20 % 128;
                    if (i20 % 2 != 0) {
                        FragmentRoster.access$200(FragmentRoster.this, i, str);
                        return;
                    } else {
                        FragmentRoster.access$200(FragmentRoster.this, i, str);
                        obj.hashCode();
                        throw null;
                    }
                }
            }
            if (BISPApplication.c().g) {
                FragmentRoster.access$200(FragmentRoster.this, i, str);
                int i21 = b + 25;
                a = i21 % 128;
                if (i21 % 2 != 0) {
                    int i22 = 58 / 0;
                    return;
                }
                return;
            }
            Intent intent = new Intent(FragmentRoster.this.getActivity(), (Class<?>) OfflineRosterActivity.class);
            int i23 = a;
            int i24 = ((i23 & (-42)) | ((~i23) & 41)) + ((i23 & 41) << 1);
            b = i24 % 128;
            if (i24 % 2 == 0) {
                intent.putExtra("rosterPosition", i);
                fragmentRoster = FragmentRoster.this;
                int i25 = 43 / 0;
            } else {
                intent.putExtra("rosterPosition", i);
                fragmentRoster = FragmentRoster.this;
            }
            intent.putExtra("roster_list", FragmentRoster.access$000(fragmentRoster).aq);
            int i26 = a + 97;
            b = i26 % 128;
            int i27 = i26 % 2;
            intent.putExtra("is_edit", true);
            intent.putExtra("rosterPositionCnic", str);
            FragmentRoster fragmentRoster2 = FragmentRoster.this;
            int i28 = a;
            int i29 = i28 & 81;
            int i30 = ((i28 ^ 81) | i29) << 1;
            int i31 = -((i28 | 81) & (~i29));
            int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
            b = i32 % 128;
            int i33 = i32 % 2;
            fragmentRoster2.startActivityForResult(intent, FragmentRoster.REQUEST_CODE_ROSTER_EDIT);
            int i34 = b + 13;
            a = i34 % 128;
            if (i34 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        private void lambda$onDeleteClick$0(int i, DialogInterface dialogInterface, int i2) {
            int i3 = 2 % 2;
            int i4 = b + FragmentRoster.REQUEST_CODE_ROSTER_ADD;
            a = i4 % 128;
            int i5 = i4 % 2;
            if (!ag.f71o) {
                int i6 = a;
                int i7 = ((i6 & 48) + (i6 | 48)) - 1;
                b = i7 % 128;
                int i8 = i7 % 2;
                ag.p = true;
                int i9 = b;
                int i10 = i9 | 23;
                int i11 = ((i10 << 1) - (~(-((~(i9 & 23)) & i10)))) - 1;
                a = i11 % 128;
                int i12 = i11 % 2;
            }
            Roster roster = FragmentRoster.access$000(FragmentRoster.this).aq.get(i);
            int i13 = b;
            int i14 = i13 & 113;
            int i15 = -(-(i13 | 113));
            int i16 = (i14 & i15) + (i15 | i14);
            a = i16 % 128;
            if (i16 % 2 == 0 ? roster.relation_to_household_id == 186 : roster.relation_to_household_id == 24634) {
                ag.g = false;
                int i17 = a;
                int i18 = i17 & 115;
                int i19 = (i17 | 115) & (~i18);
                int i20 = i18 << 1;
                int i21 = ((i19 | i20) << 1) - (i19 ^ i20);
                b = i21 % 128;
                int i22 = i21 % 2;
            }
            FragmentRoster.access$000(FragmentRoster.this).aq.remove(i);
            int i23 = a;
            int i24 = i23 & 45;
            int i25 = -(-((i23 ^ 45) | i24));
            int i26 = (i24 & i25) + (i25 | i24);
            b = i26 % 128;
            if (i26 % 2 == 0) {
                FragmentRoster.access$700(FragmentRoster.this);
                FragmentRoster.access$000(FragmentRoster.this);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            FragmentRoster.access$700(FragmentRoster.this).h(FragmentRoster.access$000(FragmentRoster.this).aq);
            int i27 = a;
            int i28 = ((i27 ^ 89) | (i27 & 89)) << 1;
            int i29 = -(((~i27) & 89) | (i27 & (-90)));
            int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
            b = i30 % 128;
            if (i30 % 2 == 0) {
                int i31 = 21 / 0;
            }
        }

        @Override // ivas.gov.bisp.enumeration.adapters.AdapterRosterList.OooO00o
        public void onVerifyClick(int i, String str) {
            ActivityBeginSurvey activityBeginSurveyAccess$000;
            CitizenData next;
            String str2;
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = i3 & 103;
            int i5 = (i3 ^ 103) | i4;
            int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
            b = i6 % 128;
            int i7 = i6 % 2;
            Roster roster = FragmentRoster.access$000(FragmentRoster.this).aq.get(i);
            int i8 = a;
            int i9 = i8 & 81;
            int i10 = (i8 | 81) & (~i9);
            int i11 = i9 << 1;
            int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
            b = i12 % 128;
            int i13 = i12 % 2;
            if (!(!roster.isValidatedFromNadra())) {
                Toast toastMakeText = Toast.makeText(FragmentRoster.this.getActivity(), "Roster already verified", 1);
                int i14 = a;
                int i15 = (i14 & 29) + (i14 | 29);
                b = i15 % 128;
                if (i15 % 2 == 0) {
                    toastMakeText.show();
                    int i16 = 46 / 0;
                } else {
                    toastMakeText.show();
                }
                int i17 = a + 47;
                b = i17 % 128;
                int i18 = i17 % 2;
                return;
            }
            int i19 = b + 27;
            a = i19 % 128;
            if (i19 % 2 != 0) {
                FragmentRoster.access$302(FragmentRoster.this, i);
                activityBeginSurveyAccess$000 = FragmentRoster.access$000(FragmentRoster.this);
                int i20 = 9 / 0;
            } else {
                FragmentRoster.access$302(FragmentRoster.this, i);
                activityBeginSurveyAccess$000 = FragmentRoster.access$000(FragmentRoster.this);
            }
            int i21 = a + 123;
            b = i21 % 128;
            Object obj = null;
            if (i21 % 2 == 0) {
                String str3 = activityBeginSurveyAccess$000.aq.get(i).cnic;
                obj.hashCode();
                throw null;
            }
            FragmentRoster.access$402(FragmentRoster.this, activityBeginSurveyAccess$000.aq.get(i).cnic);
            Iterator<CitizenData> it = FragmentRoster.access$100(FragmentRoster.this).f().iterator();
            int i22 = b;
            int i23 = (-2) - (((i22 & 80) + (i22 | 80)) ^ (-1));
            int i24 = i23 % 128;
            a = i24;
            boolean z = i23 % 2 != 0;
            int i25 = (i24 & 68) + (i24 | 68);
            int i26 = (i25 ^ (-1)) + (i25 << 1);
            b = i26 % 128;
            int i27 = i26 % 2;
            String str4 = BuildConfig.FLAVOR;
            while (it.hasNext()) {
                int i28 = b;
                int i29 = i28 & 103;
                int i30 = ((i28 ^ 103) | i29) << 1;
                int i31 = -((i28 | 103) & (~i29));
                int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
                a = i32 % 128;
                if (i32 % 2 != 0) {
                    next = it.next();
                    str2 = next.cnic;
                    int i33 = 51 / 0;
                } else {
                    next = it.next();
                    str2 = next.cnic;
                }
                int i34 = b;
                int i35 = i34 & 25;
                int i36 = -(-(i34 | 25));
                int i37 = ((i35 | i36) << 1) - (i36 ^ i35);
                a = i37 % 128;
                int i38 = i37 % 2;
                ArrayList<Roster> arrayList = FragmentRoster.access$000(FragmentRoster.this).aq;
                int i39 = b;
                int i40 = (i39 & 65) + (i39 | 65);
                a = i40 % 128;
                int i41 = i40 % 2;
                String str5 = arrayList.get(i).cnic;
                int i42 = a;
                int i43 = ((i42 | 68) << 1) - (i42 ^ 68);
                int i44 = (i43 ^ (-1)) + (i43 << 1);
                b = i44 % 128;
                int i45 = i44 % 2;
                if (str2.equals(str5)) {
                    int i46 = a;
                    int i47 = ((i46 ^ FragmentRoster.REQUEST_NADRA_CODE_ROSTER_ADD) + ((i46 & FragmentRoster.REQUEST_NADRA_CODE_ROSTER_ADD) << 1)) - 1;
                    b = i47 % 128;
                    int i48 = i47 % 2;
                    str4 = next.data;
                    z = true;
                }
            }
            if (z) {
                int i49 = b + 89;
                a = i49 % 128;
                int i50 = i49 % 2;
                FragmentRoster.access$500(FragmentRoster.this, str4, false);
                int i51 = b;
                int i52 = (i51 ^ 71) + ((i51 & 71) << 1);
                a = i52 % 128;
                if (i52 % 2 != 0) {
                    throw null;
                }
                return;
            }
            FragmentRoster fragmentRoster = FragmentRoster.this;
            ArrayList<Roster> arrayList2 = FragmentRoster.access$000(fragmentRoster).aq;
            int i53 = b;
            int i54 = (i53 & (-68)) | ((~i53) & 67);
            int i55 = -(-((i53 & 67) << 1));
            int i56 = ((i54 | i55) << 1) - (i55 ^ i54);
            a = i56 % 128;
            if (i56 % 2 == 0) {
                FragmentRoster.access$600(fragmentRoster, arrayList2.get(i).cnic);
            } else {
                FragmentRoster.access$600(fragmentRoster, arrayList2.get(i).cnic);
                obj.hashCode();
                throw null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x006d  */
    public static boolean isNetworkAvailable(Activity activity) {
        NetworkInfo activeNetworkInfo;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 23) + ((i2 & 23) << 1);
        a = i3 % 128;
        boolean z = false;
        if (i3 % 2 == 0) {
            activeNetworkInfo = ((ConnectivityManager) activity.getSystemService("connectivity")).getActiveNetworkInfo();
            int i4 = 56 / 0;
        } else {
            activeNetworkInfo = ((ConnectivityManager) activity.getSystemService("connectivity")).getActiveNetworkInfo();
        }
        if (activeNetworkInfo != null) {
            int i5 = a;
            int i6 = ((i5 ^ 99) | (i5 & 99)) << 1;
            int i7 = -(((~i5) & 99) | (i5 & (-100)));
            int i8 = (i6 & i7) + (i7 | i6);
            b = i8 % 128;
            if (i8 % 2 != 0) {
                activeNetworkInfo.isConnected();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (activeNetworkInfo.isConnected()) {
                int i9 = b;
                int i10 = ((i9 ^ 18) + ((i9 & 18) << 1)) - 1;
                a = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 5 / 5;
                }
                z = true;
            } else {
                int i12 = a;
                int i13 = i12 & 89;
                int i14 = ((((i12 ^ 89) | i13) << 1) - (~(-((i12 | 89) & (~i13))))) - 1;
                b = i14 % 128;
                int i15 = i14 % 2;
            }
        } else {
            int i16 = a;
            int i17 = i16 & 89;
            int i18 = ((((i16 ^ 89) | i17) << 1) - (~(-((i16 | 89) & (~i17))))) - 1;
            b = i18 % 128;
            int i19 = i18 % 2;
        }
        int i20 = b;
        int i21 = ((i20 ^ 23) | (i20 & 23)) << 1;
        int i22 = -(((~i20) & 23) | (i20 & (-24)));
        int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
        a = i23 % 128;
        int i24 = i23 % 2;
        return z;
    }

    private void updateDividerPercentage(int i, double d2) {
        Survey survey;
        double d3;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 61;
        int i5 = (i3 ^ 61) | i4;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        a = i6 % 128;
        int i7 = i6 % 2;
        double d4 = this.dividerForPercentage + ((double) i);
        this.dividerForPercentage = d4;
        int i8 = i3 ^ 67;
        int i9 = ((((i3 & 67) | i8) << 1) - (~(-i8))) - 1;
        a = i9 % 128;
        int i10 = i9 % 2;
        ActivityBeginSurvey activityBeginSurvey = this.activityBeginSurvey;
        activityBeginSurvey.as += d4;
        int i11 = a + 17;
        b = i11 % 128;
        if (i11 % 2 != 0) {
            survey = activityBeginSurvey.ap;
            d3 = survey.validation_percentage % d2;
        } else {
            survey = activityBeginSurvey.ap;
            d3 = survey.validation_percentage + d2;
        }
        survey.validation_percentage = d3;
    }

    private void addNadraHouseHold() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((((i2 ^ 89) | (i2 & 89)) << 1) - (~(-(((~i2) & 89) | (i2 & (-90)))))) - 1;
        b = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            boolean z = ag.f71o;
            obj.hashCode();
            throw null;
        }
        if (!ag.f71o) {
            int i4 = a;
            int i5 = (i4 ^ 123) + ((i4 & 123) << 1);
            b = i5 % 128;
            int i6 = i5 % 2;
            ag.p = true;
            int i7 = b + 91;
            a = i7 % 128;
            int i8 = i7 % 2;
        }
        if (ag.f.equals(BuildConfig.FLAVOR)) {
            cnicDialog();
            int i9 = b;
            int i10 = (((i9 & (-18)) | ((~i9) & 17)) - (~((i9 & 17) << 1))) - 1;
            a = i10 % 128;
            int i11 = i10 % 2;
            return;
        }
        Intent intent = new Intent(getActivity(), (Class<?>) SelectHouseHoldActivity.class);
        int i12 = a;
        int i13 = (i12 ^ 71) + ((i12 & 71) << 1);
        b = i13 % 128;
        int i14 = i13 % 2;
        Survey survey = this.activityBeginSurvey.aG;
        int i15 = b;
        int i16 = (i15 | 123) << 1;
        int i17 = -(i15 ^ 123);
        int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
        a = i18 % 128;
        if (i18 % 2 == 0) {
            intent.putExtra("survey", survey);
            intent.putExtra("cnic", ag.f);
            throw null;
        }
        intent.putExtra("survey", survey);
        intent.putExtra("cnic", ag.f);
        intent.putExtra("is_edit", false);
        ActivityBeginSurvey activityBeginSurvey = this.activityBeginSurvey;
        int i19 = b;
        int i20 = ((i19 & 44) + (i19 | 44)) - 1;
        a = i20 % 128;
        int i21 = i20 % 2;
        intent.putExtra("roster_list", activityBeginSurvey.aq);
        int i22 = b;
        int i23 = i22 & 5;
        int i24 = (i23 - (~(-(-((i22 ^ 5) | i23))))) - 1;
        a = i24 % 128;
        int i25 = i24 % 2;
        startActivityForResult(intent, REQUEST_NADRA_CODE_ROSTER_ADD);
        int i26 = b;
        int i27 = i26 & 53;
        int i28 = (i26 | 53) & (~i27);
        int i29 = i27 << 1;
        int i30 = (i28 & i29) + (i28 | i29);
        a = i30 % 128;
        if (i30 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private Roster findRosterByCnic(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 53;
        int i4 = -(-(i2 | 53));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        Iterator<Roster> it = this.activityBeginSurvey.aq.iterator();
        int i7 = b;
        int i8 = (i7 ^ 37) + ((i7 & 37) << 1);
        a = i8 % 128;
        int i9 = i8 % 2;
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                int i10 = b;
                int i11 = i10 & 79;
                int i12 = i10 | 79;
                int i13 = (i11 & i12) + (i12 | i11);
                a = i13 % 128;
                if (i13 % 2 != 0) {
                    return null;
                }
                obj.hashCode();
                throw null;
            }
            int i14 = b;
            int i15 = (i14 & (-124)) | ((~i14) & 123);
            int i16 = -(-((i14 & 123) << 1));
            int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
            a = i17 % 128;
            int i18 = i17 % 2;
            Roster next = it.next();
            String str2 = next.cnic;
            int i19 = b;
            int i20 = (((i19 | 78) << 1) - (i19 ^ 78)) - 1;
            a = i20 % 128;
            int i21 = i20 % 2;
            if (str2 != null) {
                int i22 = i19 ^ 19;
                int i23 = -(-((i19 & 19) << 1));
                int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
                a = i24 % 128;
                if (i24 % 2 == 0) {
                    str2.equals(str);
                    obj.hashCode();
                    throw null;
                }
                if (!(!str2.equals(str))) {
                    int i25 = a;
                    int i26 = i25 & 111;
                    int i27 = (i26 - (~((i25 ^ 111) | i26))) - 1;
                    b = i27 % 128;
                    int i28 = i27 % 2;
                    return next;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x037d A[Catch: all -> 0x058f, TRY_LEAVE, TryCatch #6 {all -> 0x058f, blocks: (B:97:0x0305, B:99:0x0312, B:101:0x0355, B:108:0x036e, B:110:0x037d, B:112:0x03a2, B:191:0x0578, B:106:0x036c, B:98:0x030c), top: B:265:0x0303, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x03c5 A[Catch: Exception -> 0x0689, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0689, blocks: (B:3:0x0003, B:8:0x0021, B:12:0x003c, B:15:0x0067, B:17:0x0093, B:19:0x00b1, B:24:0x00cc, B:30:0x00f3, B:33:0x0114, B:34:0x011b, B:36:0x0124, B:39:0x0143, B:66:0x0227, B:74:0x024d, B:77:0x0260, B:79:0x0280, B:83:0x02a8, B:87:0x02c0, B:94:0x02ea, B:115:0x03c5, B:119:0x03db, B:121:0x03e1, B:123:0x03f9, B:127:0x0418, B:128:0x041d, B:130:0x0426, B:132:0x0444, B:129:0x0420, B:136:0x0468, B:139:0x0475, B:141:0x047d, B:144:0x048c, B:146:0x0494, B:149:0x04a9, B:153:0x04ca, B:154:0x04cd, B:155:0x04cf, B:156:0x04d2, B:160:0x04e2, B:161:0x04ea, B:162:0x04ed, B:165:0x04f0, B:167:0x04ff, B:170:0x050e, B:172:0x0523, B:173:0x0528, B:174:0x052b, B:177:0x052e, B:178:0x0531, B:179:0x0534, B:182:0x0537, B:184:0x0553, B:186:0x056c, B:187:0x0572, B:188:0x0575, B:195:0x0590, B:197:0x0596, B:198:0x0597, B:88:0x02c6, B:89:0x02cb, B:92:0x02ce, B:199:0x0598, B:202:0x05af, B:204:0x05bb, B:209:0x05c9, B:213:0x05d8, B:215:0x05de, B:223:0x05fd, B:226:0x0615, B:229:0x0630, B:230:0x0634, B:231:0x0637, B:232:0x063a, B:220:0x05e4, B:224:0x0603, B:208:0x05bf, B:40:0x0148, B:35:0x011e, B:27:0x00d9, B:41:0x014d, B:44:0x016a, B:46:0x0181, B:49:0x019e, B:51:0x01af, B:50:0x01a7, B:53:0x01c4, B:55:0x01e5, B:58:0x01fd, B:59:0x0202, B:64:0x0220, B:65:0x0224, B:60:0x0208, B:235:0x063d, B:236:0x0648, B:239:0x064b, B:240:0x0653, B:9:0x0026, B:243:0x0656, B:248:0x0682, B:250:0x0686, B:97:0x0305, B:99:0x0312, B:101:0x0355, B:108:0x036e, B:110:0x037d, B:112:0x03a2, B:191:0x0578, B:106:0x036c, B:98:0x030c), top: B:256:0x0003, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:119:0x03db A[Catch: Exception -> 0x0689, TRY_ENTER, TryCatch #1 {Exception -> 0x0689, blocks: (B:3:0x0003, B:8:0x0021, B:12:0x003c, B:15:0x0067, B:17:0x0093, B:19:0x00b1, B:24:0x00cc, B:30:0x00f3, B:33:0x0114, B:34:0x011b, B:36:0x0124, B:39:0x0143, B:66:0x0227, B:74:0x024d, B:77:0x0260, B:79:0x0280, B:83:0x02a8, B:87:0x02c0, B:94:0x02ea, B:115:0x03c5, B:119:0x03db, B:121:0x03e1, B:123:0x03f9, B:127:0x0418, B:128:0x041d, B:130:0x0426, B:132:0x0444, B:129:0x0420, B:136:0x0468, B:139:0x0475, B:141:0x047d, B:144:0x048c, B:146:0x0494, B:149:0x04a9, B:153:0x04ca, B:154:0x04cd, B:155:0x04cf, B:156:0x04d2, B:160:0x04e2, B:161:0x04ea, B:162:0x04ed, B:165:0x04f0, B:167:0x04ff, B:170:0x050e, B:172:0x0523, B:173:0x0528, B:174:0x052b, B:177:0x052e, B:178:0x0531, B:179:0x0534, B:182:0x0537, B:184:0x0553, B:186:0x056c, B:187:0x0572, B:188:0x0575, B:195:0x0590, B:197:0x0596, B:198:0x0597, B:88:0x02c6, B:89:0x02cb, B:92:0x02ce, B:199:0x0598, B:202:0x05af, B:204:0x05bb, B:209:0x05c9, B:213:0x05d8, B:215:0x05de, B:223:0x05fd, B:226:0x0615, B:229:0x0630, B:230:0x0634, B:231:0x0637, B:232:0x063a, B:220:0x05e4, B:224:0x0603, B:208:0x05bf, B:40:0x0148, B:35:0x011e, B:27:0x00d9, B:41:0x014d, B:44:0x016a, B:46:0x0181, B:49:0x019e, B:51:0x01af, B:50:0x01a7, B:53:0x01c4, B:55:0x01e5, B:58:0x01fd, B:59:0x0202, B:64:0x0220, B:65:0x0224, B:60:0x0208, B:235:0x063d, B:236:0x0648, B:239:0x064b, B:240:0x0653, B:9:0x0026, B:243:0x0656, B:248:0x0682, B:250:0x0686, B:97:0x0305, B:99:0x0312, B:101:0x0355, B:108:0x036e, B:110:0x037d, B:112:0x03a2, B:191:0x0578, B:106:0x036c, B:98:0x030c), top: B:256:0x0003, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:121:0x03e1 A[Catch: Exception -> 0x0689, TRY_LEAVE, TryCatch #1 {Exception -> 0x0689, blocks: (B:3:0x0003, B:8:0x0021, B:12:0x003c, B:15:0x0067, B:17:0x0093, B:19:0x00b1, B:24:0x00cc, B:30:0x00f3, B:33:0x0114, B:34:0x011b, B:36:0x0124, B:39:0x0143, B:66:0x0227, B:74:0x024d, B:77:0x0260, B:79:0x0280, B:83:0x02a8, B:87:0x02c0, B:94:0x02ea, B:115:0x03c5, B:119:0x03db, B:121:0x03e1, B:123:0x03f9, B:127:0x0418, B:128:0x041d, B:130:0x0426, B:132:0x0444, B:129:0x0420, B:136:0x0468, B:139:0x0475, B:141:0x047d, B:144:0x048c, B:146:0x0494, B:149:0x04a9, B:153:0x04ca, B:154:0x04cd, B:155:0x04cf, B:156:0x04d2, B:160:0x04e2, B:161:0x04ea, B:162:0x04ed, B:165:0x04f0, B:167:0x04ff, B:170:0x050e, B:172:0x0523, B:173:0x0528, B:174:0x052b, B:177:0x052e, B:178:0x0531, B:179:0x0534, B:182:0x0537, B:184:0x0553, B:186:0x056c, B:187:0x0572, B:188:0x0575, B:195:0x0590, B:197:0x0596, B:198:0x0597, B:88:0x02c6, B:89:0x02cb, B:92:0x02ce, B:199:0x0598, B:202:0x05af, B:204:0x05bb, B:209:0x05c9, B:213:0x05d8, B:215:0x05de, B:223:0x05fd, B:226:0x0615, B:229:0x0630, B:230:0x0634, B:231:0x0637, B:232:0x063a, B:220:0x05e4, B:224:0x0603, B:208:0x05bf, B:40:0x0148, B:35:0x011e, B:27:0x00d9, B:41:0x014d, B:44:0x016a, B:46:0x0181, B:49:0x019e, B:51:0x01af, B:50:0x01a7, B:53:0x01c4, B:55:0x01e5, B:58:0x01fd, B:59:0x0202, B:64:0x0220, B:65:0x0224, B:60:0x0208, B:235:0x063d, B:236:0x0648, B:239:0x064b, B:240:0x0653, B:9:0x0026, B:243:0x0656, B:248:0x0682, B:250:0x0686, B:97:0x0305, B:99:0x0312, B:101:0x0355, B:108:0x036e, B:110:0x037d, B:112:0x03a2, B:191:0x0578, B:106:0x036c, B:98:0x030c), top: B:256:0x0003, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:127:0x0418 A[Catch: Exception -> 0x0689, TRY_ENTER, TryCatch #1 {Exception -> 0x0689, blocks: (B:3:0x0003, B:8:0x0021, B:12:0x003c, B:15:0x0067, B:17:0x0093, B:19:0x00b1, B:24:0x00cc, B:30:0x00f3, B:33:0x0114, B:34:0x011b, B:36:0x0124, B:39:0x0143, B:66:0x0227, B:74:0x024d, B:77:0x0260, B:79:0x0280, B:83:0x02a8, B:87:0x02c0, B:94:0x02ea, B:115:0x03c5, B:119:0x03db, B:121:0x03e1, B:123:0x03f9, B:127:0x0418, B:128:0x041d, B:130:0x0426, B:132:0x0444, B:129:0x0420, B:136:0x0468, B:139:0x0475, B:141:0x047d, B:144:0x048c, B:146:0x0494, B:149:0x04a9, B:153:0x04ca, B:154:0x04cd, B:155:0x04cf, B:156:0x04d2, B:160:0x04e2, B:161:0x04ea, B:162:0x04ed, B:165:0x04f0, B:167:0x04ff, B:170:0x050e, B:172:0x0523, B:173:0x0528, B:174:0x052b, B:177:0x052e, B:178:0x0531, B:179:0x0534, B:182:0x0537, B:184:0x0553, B:186:0x056c, B:187:0x0572, B:188:0x0575, B:195:0x0590, B:197:0x0596, B:198:0x0597, B:88:0x02c6, B:89:0x02cb, B:92:0x02ce, B:199:0x0598, B:202:0x05af, B:204:0x05bb, B:209:0x05c9, B:213:0x05d8, B:215:0x05de, B:223:0x05fd, B:226:0x0615, B:229:0x0630, B:230:0x0634, B:231:0x0637, B:232:0x063a, B:220:0x05e4, B:224:0x0603, B:208:0x05bf, B:40:0x0148, B:35:0x011e, B:27:0x00d9, B:41:0x014d, B:44:0x016a, B:46:0x0181, B:49:0x019e, B:51:0x01af, B:50:0x01a7, B:53:0x01c4, B:55:0x01e5, B:58:0x01fd, B:59:0x0202, B:64:0x0220, B:65:0x0224, B:60:0x0208, B:235:0x063d, B:236:0x0648, B:239:0x064b, B:240:0x0653, B:9:0x0026, B:243:0x0656, B:248:0x0682, B:250:0x0686, B:97:0x0305, B:99:0x0312, B:101:0x0355, B:108:0x036e, B:110:0x037d, B:112:0x03a2, B:191:0x0578, B:106:0x036c, B:98:0x030c), top: B:256:0x0003, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x0420 A[Catch: Exception -> 0x0689, TryCatch #1 {Exception -> 0x0689, blocks: (B:3:0x0003, B:8:0x0021, B:12:0x003c, B:15:0x0067, B:17:0x0093, B:19:0x00b1, B:24:0x00cc, B:30:0x00f3, B:33:0x0114, B:34:0x011b, B:36:0x0124, B:39:0x0143, B:66:0x0227, B:74:0x024d, B:77:0x0260, B:79:0x0280, B:83:0x02a8, B:87:0x02c0, B:94:0x02ea, B:115:0x03c5, B:119:0x03db, B:121:0x03e1, B:123:0x03f9, B:127:0x0418, B:128:0x041d, B:130:0x0426, B:132:0x0444, B:129:0x0420, B:136:0x0468, B:139:0x0475, B:141:0x047d, B:144:0x048c, B:146:0x0494, B:149:0x04a9, B:153:0x04ca, B:154:0x04cd, B:155:0x04cf, B:156:0x04d2, B:160:0x04e2, B:161:0x04ea, B:162:0x04ed, B:165:0x04f0, B:167:0x04ff, B:170:0x050e, B:172:0x0523, B:173:0x0528, B:174:0x052b, B:177:0x052e, B:178:0x0531, B:179:0x0534, B:182:0x0537, B:184:0x0553, B:186:0x056c, B:187:0x0572, B:188:0x0575, B:195:0x0590, B:197:0x0596, B:198:0x0597, B:88:0x02c6, B:89:0x02cb, B:92:0x02ce, B:199:0x0598, B:202:0x05af, B:204:0x05bb, B:209:0x05c9, B:213:0x05d8, B:215:0x05de, B:223:0x05fd, B:226:0x0615, B:229:0x0630, B:230:0x0634, B:231:0x0637, B:232:0x063a, B:220:0x05e4, B:224:0x0603, B:208:0x05bf, B:40:0x0148, B:35:0x011e, B:27:0x00d9, B:41:0x014d, B:44:0x016a, B:46:0x0181, B:49:0x019e, B:51:0x01af, B:50:0x01a7, B:53:0x01c4, B:55:0x01e5, B:58:0x01fd, B:59:0x0202, B:64:0x0220, B:65:0x0224, B:60:0x0208, B:235:0x063d, B:236:0x0648, B:239:0x064b, B:240:0x0653, B:9:0x0026, B:243:0x0656, B:248:0x0682, B:250:0x0686, B:97:0x0305, B:99:0x0312, B:101:0x0355, B:108:0x036e, B:110:0x037d, B:112:0x03a2, B:191:0x0578, B:106:0x036c, B:98:0x030c), top: B:256:0x0003, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:134:0x045d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:135:0x045f  */
    /* JADX WARN: Code duplicated, block: B:138:0x0473 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:139:0x0475 A[Catch: Exception -> 0x0689, TRY_ENTER, TryCatch #1 {Exception -> 0x0689, blocks: (B:3:0x0003, B:8:0x0021, B:12:0x003c, B:15:0x0067, B:17:0x0093, B:19:0x00b1, B:24:0x00cc, B:30:0x00f3, B:33:0x0114, B:34:0x011b, B:36:0x0124, B:39:0x0143, B:66:0x0227, B:74:0x024d, B:77:0x0260, B:79:0x0280, B:83:0x02a8, B:87:0x02c0, B:94:0x02ea, B:115:0x03c5, B:119:0x03db, B:121:0x03e1, B:123:0x03f9, B:127:0x0418, B:128:0x041d, B:130:0x0426, B:132:0x0444, B:129:0x0420, B:136:0x0468, B:139:0x0475, B:141:0x047d, B:144:0x048c, B:146:0x0494, B:149:0x04a9, B:153:0x04ca, B:154:0x04cd, B:155:0x04cf, B:156:0x04d2, B:160:0x04e2, B:161:0x04ea, B:162:0x04ed, B:165:0x04f0, B:167:0x04ff, B:170:0x050e, B:172:0x0523, B:173:0x0528, B:174:0x052b, B:177:0x052e, B:178:0x0531, B:179:0x0534, B:182:0x0537, B:184:0x0553, B:186:0x056c, B:187:0x0572, B:188:0x0575, B:195:0x0590, B:197:0x0596, B:198:0x0597, B:88:0x02c6, B:89:0x02cb, B:92:0x02ce, B:199:0x0598, B:202:0x05af, B:204:0x05bb, B:209:0x05c9, B:213:0x05d8, B:215:0x05de, B:223:0x05fd, B:226:0x0615, B:229:0x0630, B:230:0x0634, B:231:0x0637, B:232:0x063a, B:220:0x05e4, B:224:0x0603, B:208:0x05bf, B:40:0x0148, B:35:0x011e, B:27:0x00d9, B:41:0x014d, B:44:0x016a, B:46:0x0181, B:49:0x019e, B:51:0x01af, B:50:0x01a7, B:53:0x01c4, B:55:0x01e5, B:58:0x01fd, B:59:0x0202, B:64:0x0220, B:65:0x0224, B:60:0x0208, B:235:0x063d, B:236:0x0648, B:239:0x064b, B:240:0x0653, B:9:0x0026, B:243:0x0656, B:248:0x0682, B:250:0x0686, B:97:0x0305, B:99:0x0312, B:101:0x0355, B:108:0x036e, B:110:0x037d, B:112:0x03a2, B:191:0x0578, B:106:0x036c, B:98:0x030c), top: B:256:0x0003, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:140:0x047b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:141:0x047d A[Catch: Exception -> 0x0689, LOOP:0: B:141:0x047d->B:159:0x04d5, LOOP_START, PHI: r2
  0x047d: PHI (r2v20 int) = (r2v5 int), (r2v30 int) binds: [B:140:0x047b, B:159:0x04d5] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {Exception -> 0x0689, blocks: (B:3:0x0003, B:8:0x0021, B:12:0x003c, B:15:0x0067, B:17:0x0093, B:19:0x00b1, B:24:0x00cc, B:30:0x00f3, B:33:0x0114, B:34:0x011b, B:36:0x0124, B:39:0x0143, B:66:0x0227, B:74:0x024d, B:77:0x0260, B:79:0x0280, B:83:0x02a8, B:87:0x02c0, B:94:0x02ea, B:115:0x03c5, B:119:0x03db, B:121:0x03e1, B:123:0x03f9, B:127:0x0418, B:128:0x041d, B:130:0x0426, B:132:0x0444, B:129:0x0420, B:136:0x0468, B:139:0x0475, B:141:0x047d, B:144:0x048c, B:146:0x0494, B:149:0x04a9, B:153:0x04ca, B:154:0x04cd, B:155:0x04cf, B:156:0x04d2, B:160:0x04e2, B:161:0x04ea, B:162:0x04ed, B:165:0x04f0, B:167:0x04ff, B:170:0x050e, B:172:0x0523, B:173:0x0528, B:174:0x052b, B:177:0x052e, B:178:0x0531, B:179:0x0534, B:182:0x0537, B:184:0x0553, B:186:0x056c, B:187:0x0572, B:188:0x0575, B:195:0x0590, B:197:0x0596, B:198:0x0597, B:88:0x02c6, B:89:0x02cb, B:92:0x02ce, B:199:0x0598, B:202:0x05af, B:204:0x05bb, B:209:0x05c9, B:213:0x05d8, B:215:0x05de, B:223:0x05fd, B:226:0x0615, B:229:0x0630, B:230:0x0634, B:231:0x0637, B:232:0x063a, B:220:0x05e4, B:224:0x0603, B:208:0x05bf, B:40:0x0148, B:35:0x011e, B:27:0x00d9, B:41:0x014d, B:44:0x016a, B:46:0x0181, B:49:0x019e, B:51:0x01af, B:50:0x01a7, B:53:0x01c4, B:55:0x01e5, B:58:0x01fd, B:59:0x0202, B:64:0x0220, B:65:0x0224, B:60:0x0208, B:235:0x063d, B:236:0x0648, B:239:0x064b, B:240:0x0653, B:9:0x0026, B:243:0x0656, B:248:0x0682, B:250:0x0686, B:97:0x0305, B:99:0x0312, B:101:0x0355, B:108:0x036e, B:110:0x037d, B:112:0x03a2, B:191:0x0578, B:106:0x036c, B:98:0x030c), top: B:256:0x0003, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:144:0x048c A[Catch: Exception -> 0x0689, TRY_ENTER, TryCatch #1 {Exception -> 0x0689, blocks: (B:3:0x0003, B:8:0x0021, B:12:0x003c, B:15:0x0067, B:17:0x0093, B:19:0x00b1, B:24:0x00cc, B:30:0x00f3, B:33:0x0114, B:34:0x011b, B:36:0x0124, B:39:0x0143, B:66:0x0227, B:74:0x024d, B:77:0x0260, B:79:0x0280, B:83:0x02a8, B:87:0x02c0, B:94:0x02ea, B:115:0x03c5, B:119:0x03db, B:121:0x03e1, B:123:0x03f9, B:127:0x0418, B:128:0x041d, B:130:0x0426, B:132:0x0444, B:129:0x0420, B:136:0x0468, B:139:0x0475, B:141:0x047d, B:144:0x048c, B:146:0x0494, B:149:0x04a9, B:153:0x04ca, B:154:0x04cd, B:155:0x04cf, B:156:0x04d2, B:160:0x04e2, B:161:0x04ea, B:162:0x04ed, B:165:0x04f0, B:167:0x04ff, B:170:0x050e, B:172:0x0523, B:173:0x0528, B:174:0x052b, B:177:0x052e, B:178:0x0531, B:179:0x0534, B:182:0x0537, B:184:0x0553, B:186:0x056c, B:187:0x0572, B:188:0x0575, B:195:0x0590, B:197:0x0596, B:198:0x0597, B:88:0x02c6, B:89:0x02cb, B:92:0x02ce, B:199:0x0598, B:202:0x05af, B:204:0x05bb, B:209:0x05c9, B:213:0x05d8, B:215:0x05de, B:223:0x05fd, B:226:0x0615, B:229:0x0630, B:230:0x0634, B:231:0x0637, B:232:0x063a, B:220:0x05e4, B:224:0x0603, B:208:0x05bf, B:40:0x0148, B:35:0x011e, B:27:0x00d9, B:41:0x014d, B:44:0x016a, B:46:0x0181, B:49:0x019e, B:51:0x01af, B:50:0x01a7, B:53:0x01c4, B:55:0x01e5, B:58:0x01fd, B:59:0x0202, B:64:0x0220, B:65:0x0224, B:60:0x0208, B:235:0x063d, B:236:0x0648, B:239:0x064b, B:240:0x0653, B:9:0x0026, B:243:0x0656, B:248:0x0682, B:250:0x0686, B:97:0x0305, B:99:0x0312, B:101:0x0355, B:108:0x036e, B:110:0x037d, B:112:0x03a2, B:191:0x0578, B:106:0x036c, B:98:0x030c), top: B:256:0x0003, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:146:0x0494 A[Catch: Exception -> 0x0689, TRY_LEAVE, TryCatch #1 {Exception -> 0x0689, blocks: (B:3:0x0003, B:8:0x0021, B:12:0x003c, B:15:0x0067, B:17:0x0093, B:19:0x00b1, B:24:0x00cc, B:30:0x00f3, B:33:0x0114, B:34:0x011b, B:36:0x0124, B:39:0x0143, B:66:0x0227, B:74:0x024d, B:77:0x0260, B:79:0x0280, B:83:0x02a8, B:87:0x02c0, B:94:0x02ea, B:115:0x03c5, B:119:0x03db, B:121:0x03e1, B:123:0x03f9, B:127:0x0418, B:128:0x041d, B:130:0x0426, B:132:0x0444, B:129:0x0420, B:136:0x0468, B:139:0x0475, B:141:0x047d, B:144:0x048c, B:146:0x0494, B:149:0x04a9, B:153:0x04ca, B:154:0x04cd, B:155:0x04cf, B:156:0x04d2, B:160:0x04e2, B:161:0x04ea, B:162:0x04ed, B:165:0x04f0, B:167:0x04ff, B:170:0x050e, B:172:0x0523, B:173:0x0528, B:174:0x052b, B:177:0x052e, B:178:0x0531, B:179:0x0534, B:182:0x0537, B:184:0x0553, B:186:0x056c, B:187:0x0572, B:188:0x0575, B:195:0x0590, B:197:0x0596, B:198:0x0597, B:88:0x02c6, B:89:0x02cb, B:92:0x02ce, B:199:0x0598, B:202:0x05af, B:204:0x05bb, B:209:0x05c9, B:213:0x05d8, B:215:0x05de, B:223:0x05fd, B:226:0x0615, B:229:0x0630, B:230:0x0634, B:231:0x0637, B:232:0x063a, B:220:0x05e4, B:224:0x0603, B:208:0x05bf, B:40:0x0148, B:35:0x011e, B:27:0x00d9, B:41:0x014d, B:44:0x016a, B:46:0x0181, B:49:0x019e, B:51:0x01af, B:50:0x01a7, B:53:0x01c4, B:55:0x01e5, B:58:0x01fd, B:59:0x0202, B:64:0x0220, B:65:0x0224, B:60:0x0208, B:235:0x063d, B:236:0x0648, B:239:0x064b, B:240:0x0653, B:9:0x0026, B:243:0x0656, B:248:0x0682, B:250:0x0686, B:97:0x0305, B:99:0x0312, B:101:0x0355, B:108:0x036e, B:110:0x037d, B:112:0x03a2, B:191:0x0578, B:106:0x036c, B:98:0x030c), top: B:256:0x0003, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:149:0x04a9 A[Catch: Exception -> 0x0689, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0689, blocks: (B:3:0x0003, B:8:0x0021, B:12:0x003c, B:15:0x0067, B:17:0x0093, B:19:0x00b1, B:24:0x00cc, B:30:0x00f3, B:33:0x0114, B:34:0x011b, B:36:0x0124, B:39:0x0143, B:66:0x0227, B:74:0x024d, B:77:0x0260, B:79:0x0280, B:83:0x02a8, B:87:0x02c0, B:94:0x02ea, B:115:0x03c5, B:119:0x03db, B:121:0x03e1, B:123:0x03f9, B:127:0x0418, B:128:0x041d, B:130:0x0426, B:132:0x0444, B:129:0x0420, B:136:0x0468, B:139:0x0475, B:141:0x047d, B:144:0x048c, B:146:0x0494, B:149:0x04a9, B:153:0x04ca, B:154:0x04cd, B:155:0x04cf, B:156:0x04d2, B:160:0x04e2, B:161:0x04ea, B:162:0x04ed, B:165:0x04f0, B:167:0x04ff, B:170:0x050e, B:172:0x0523, B:173:0x0528, B:174:0x052b, B:177:0x052e, B:178:0x0531, B:179:0x0534, B:182:0x0537, B:184:0x0553, B:186:0x056c, B:187:0x0572, B:188:0x0575, B:195:0x0590, B:197:0x0596, B:198:0x0597, B:88:0x02c6, B:89:0x02cb, B:92:0x02ce, B:199:0x0598, B:202:0x05af, B:204:0x05bb, B:209:0x05c9, B:213:0x05d8, B:215:0x05de, B:223:0x05fd, B:226:0x0615, B:229:0x0630, B:230:0x0634, B:231:0x0637, B:232:0x063a, B:220:0x05e4, B:224:0x0603, B:208:0x05bf, B:40:0x0148, B:35:0x011e, B:27:0x00d9, B:41:0x014d, B:44:0x016a, B:46:0x0181, B:49:0x019e, B:51:0x01af, B:50:0x01a7, B:53:0x01c4, B:55:0x01e5, B:58:0x01fd, B:59:0x0202, B:64:0x0220, B:65:0x0224, B:60:0x0208, B:235:0x063d, B:236:0x0648, B:239:0x064b, B:240:0x0653, B:9:0x0026, B:243:0x0656, B:248:0x0682, B:250:0x0686, B:97:0x0305, B:99:0x0312, B:101:0x0355, B:108:0x036e, B:110:0x037d, B:112:0x03a2, B:191:0x0578, B:106:0x036c, B:98:0x030c), top: B:256:0x0003, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:153:0x04ca A[Catch: Exception -> 0x0689, EDGE_INSN: B:153:0x04ca->B:165:0x04f0 BREAK  A[LOOP:0: B:141:0x047d->B:159:0x04d5], TRY_ENTER, TryCatch #1 {Exception -> 0x0689, blocks: (B:3:0x0003, B:8:0x0021, B:12:0x003c, B:15:0x0067, B:17:0x0093, B:19:0x00b1, B:24:0x00cc, B:30:0x00f3, B:33:0x0114, B:34:0x011b, B:36:0x0124, B:39:0x0143, B:66:0x0227, B:74:0x024d, B:77:0x0260, B:79:0x0280, B:83:0x02a8, B:87:0x02c0, B:94:0x02ea, B:115:0x03c5, B:119:0x03db, B:121:0x03e1, B:123:0x03f9, B:127:0x0418, B:128:0x041d, B:130:0x0426, B:132:0x0444, B:129:0x0420, B:136:0x0468, B:139:0x0475, B:141:0x047d, B:144:0x048c, B:146:0x0494, B:149:0x04a9, B:153:0x04ca, B:154:0x04cd, B:155:0x04cf, B:156:0x04d2, B:160:0x04e2, B:161:0x04ea, B:162:0x04ed, B:165:0x04f0, B:167:0x04ff, B:170:0x050e, B:172:0x0523, B:173:0x0528, B:174:0x052b, B:177:0x052e, B:178:0x0531, B:179:0x0534, B:182:0x0537, B:184:0x0553, B:186:0x056c, B:187:0x0572, B:188:0x0575, B:195:0x0590, B:197:0x0596, B:198:0x0597, B:88:0x02c6, B:89:0x02cb, B:92:0x02ce, B:199:0x0598, B:202:0x05af, B:204:0x05bb, B:209:0x05c9, B:213:0x05d8, B:215:0x05de, B:223:0x05fd, B:226:0x0615, B:229:0x0630, B:230:0x0634, B:231:0x0637, B:232:0x063a, B:220:0x05e4, B:224:0x0603, B:208:0x05bf, B:40:0x0148, B:35:0x011e, B:27:0x00d9, B:41:0x014d, B:44:0x016a, B:46:0x0181, B:49:0x019e, B:51:0x01af, B:50:0x01a7, B:53:0x01c4, B:55:0x01e5, B:58:0x01fd, B:59:0x0202, B:64:0x0220, B:65:0x0224, B:60:0x0208, B:235:0x063d, B:236:0x0648, B:239:0x064b, B:240:0x0653, B:9:0x0026, B:243:0x0656, B:248:0x0682, B:250:0x0686, B:97:0x0305, B:99:0x0312, B:101:0x0355, B:108:0x036e, B:110:0x037d, B:112:0x03a2, B:191:0x0578, B:106:0x036c, B:98:0x030c), top: B:256:0x0003, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:154:0x04cd A[Catch: Exception -> 0x0689, TRY_LEAVE, TryCatch #1 {Exception -> 0x0689, blocks: (B:3:0x0003, B:8:0x0021, B:12:0x003c, B:15:0x0067, B:17:0x0093, B:19:0x00b1, B:24:0x00cc, B:30:0x00f3, B:33:0x0114, B:34:0x011b, B:36:0x0124, B:39:0x0143, B:66:0x0227, B:74:0x024d, B:77:0x0260, B:79:0x0280, B:83:0x02a8, B:87:0x02c0, B:94:0x02ea, B:115:0x03c5, B:119:0x03db, B:121:0x03e1, B:123:0x03f9, B:127:0x0418, B:128:0x041d, B:130:0x0426, B:132:0x0444, B:129:0x0420, B:136:0x0468, B:139:0x0475, B:141:0x047d, B:144:0x048c, B:146:0x0494, B:149:0x04a9, B:153:0x04ca, B:154:0x04cd, B:155:0x04cf, B:156:0x04d2, B:160:0x04e2, B:161:0x04ea, B:162:0x04ed, B:165:0x04f0, B:167:0x04ff, B:170:0x050e, B:172:0x0523, B:173:0x0528, B:174:0x052b, B:177:0x052e, B:178:0x0531, B:179:0x0534, B:182:0x0537, B:184:0x0553, B:186:0x056c, B:187:0x0572, B:188:0x0575, B:195:0x0590, B:197:0x0596, B:198:0x0597, B:88:0x02c6, B:89:0x02cb, B:92:0x02ce, B:199:0x0598, B:202:0x05af, B:204:0x05bb, B:209:0x05c9, B:213:0x05d8, B:215:0x05de, B:223:0x05fd, B:226:0x0615, B:229:0x0630, B:230:0x0634, B:231:0x0637, B:232:0x063a, B:220:0x05e4, B:224:0x0603, B:208:0x05bf, B:40:0x0148, B:35:0x011e, B:27:0x00d9, B:41:0x014d, B:44:0x016a, B:46:0x0181, B:49:0x019e, B:51:0x01af, B:50:0x01a7, B:53:0x01c4, B:55:0x01e5, B:58:0x01fd, B:59:0x0202, B:64:0x0220, B:65:0x0224, B:60:0x0208, B:235:0x063d, B:236:0x0648, B:239:0x064b, B:240:0x0653, B:9:0x0026, B:243:0x0656, B:248:0x0682, B:250:0x0686, B:97:0x0305, B:99:0x0312, B:101:0x0355, B:108:0x036e, B:110:0x037d, B:112:0x03a2, B:191:0x0578, B:106:0x036c, B:98:0x030c), top: B:256:0x0003, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:159:0x04d5 A[LOOP:0: B:141:0x047d->B:159:0x04d5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:169:0x0505  */
    /* JADX WARN: Code duplicated, block: B:177:0x052e A[Catch: Exception -> 0x0689, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0689, blocks: (B:3:0x0003, B:8:0x0021, B:12:0x003c, B:15:0x0067, B:17:0x0093, B:19:0x00b1, B:24:0x00cc, B:30:0x00f3, B:33:0x0114, B:34:0x011b, B:36:0x0124, B:39:0x0143, B:66:0x0227, B:74:0x024d, B:77:0x0260, B:79:0x0280, B:83:0x02a8, B:87:0x02c0, B:94:0x02ea, B:115:0x03c5, B:119:0x03db, B:121:0x03e1, B:123:0x03f9, B:127:0x0418, B:128:0x041d, B:130:0x0426, B:132:0x0444, B:129:0x0420, B:136:0x0468, B:139:0x0475, B:141:0x047d, B:144:0x048c, B:146:0x0494, B:149:0x04a9, B:153:0x04ca, B:154:0x04cd, B:155:0x04cf, B:156:0x04d2, B:160:0x04e2, B:161:0x04ea, B:162:0x04ed, B:165:0x04f0, B:167:0x04ff, B:170:0x050e, B:172:0x0523, B:173:0x0528, B:174:0x052b, B:177:0x052e, B:178:0x0531, B:179:0x0534, B:182:0x0537, B:184:0x0553, B:186:0x056c, B:187:0x0572, B:188:0x0575, B:195:0x0590, B:197:0x0596, B:198:0x0597, B:88:0x02c6, B:89:0x02cb, B:92:0x02ce, B:199:0x0598, B:202:0x05af, B:204:0x05bb, B:209:0x05c9, B:213:0x05d8, B:215:0x05de, B:223:0x05fd, B:226:0x0615, B:229:0x0630, B:230:0x0634, B:231:0x0637, B:232:0x063a, B:220:0x05e4, B:224:0x0603, B:208:0x05bf, B:40:0x0148, B:35:0x011e, B:27:0x00d9, B:41:0x014d, B:44:0x016a, B:46:0x0181, B:49:0x019e, B:51:0x01af, B:50:0x01a7, B:53:0x01c4, B:55:0x01e5, B:58:0x01fd, B:59:0x0202, B:64:0x0220, B:65:0x0224, B:60:0x0208, B:235:0x063d, B:236:0x0648, B:239:0x064b, B:240:0x0653, B:9:0x0026, B:243:0x0656, B:248:0x0682, B:250:0x0686, B:97:0x0305, B:99:0x0312, B:101:0x0355, B:108:0x036e, B:110:0x037d, B:112:0x03a2, B:191:0x0578, B:106:0x036c, B:98:0x030c), top: B:256:0x0003, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:186:0x056c A[Catch: Exception -> 0x0689, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0689, blocks: (B:3:0x0003, B:8:0x0021, B:12:0x003c, B:15:0x0067, B:17:0x0093, B:19:0x00b1, B:24:0x00cc, B:30:0x00f3, B:33:0x0114, B:34:0x011b, B:36:0x0124, B:39:0x0143, B:66:0x0227, B:74:0x024d, B:77:0x0260, B:79:0x0280, B:83:0x02a8, B:87:0x02c0, B:94:0x02ea, B:115:0x03c5, B:119:0x03db, B:121:0x03e1, B:123:0x03f9, B:127:0x0418, B:128:0x041d, B:130:0x0426, B:132:0x0444, B:129:0x0420, B:136:0x0468, B:139:0x0475, B:141:0x047d, B:144:0x048c, B:146:0x0494, B:149:0x04a9, B:153:0x04ca, B:154:0x04cd, B:155:0x04cf, B:156:0x04d2, B:160:0x04e2, B:161:0x04ea, B:162:0x04ed, B:165:0x04f0, B:167:0x04ff, B:170:0x050e, B:172:0x0523, B:173:0x0528, B:174:0x052b, B:177:0x052e, B:178:0x0531, B:179:0x0534, B:182:0x0537, B:184:0x0553, B:186:0x056c, B:187:0x0572, B:188:0x0575, B:195:0x0590, B:197:0x0596, B:198:0x0597, B:88:0x02c6, B:89:0x02cb, B:92:0x02ce, B:199:0x0598, B:202:0x05af, B:204:0x05bb, B:209:0x05c9, B:213:0x05d8, B:215:0x05de, B:223:0x05fd, B:226:0x0615, B:229:0x0630, B:230:0x0634, B:231:0x0637, B:232:0x063a, B:220:0x05e4, B:224:0x0603, B:208:0x05bf, B:40:0x0148, B:35:0x011e, B:27:0x00d9, B:41:0x014d, B:44:0x016a, B:46:0x0181, B:49:0x019e, B:51:0x01af, B:50:0x01a7, B:53:0x01c4, B:55:0x01e5, B:58:0x01fd, B:59:0x0202, B:64:0x0220, B:65:0x0224, B:60:0x0208, B:235:0x063d, B:236:0x0648, B:239:0x064b, B:240:0x0653, B:9:0x0026, B:243:0x0656, B:248:0x0682, B:250:0x0686, B:97:0x0305, B:99:0x0312, B:101:0x0355, B:108:0x036e, B:110:0x037d, B:112:0x03a2, B:191:0x0578, B:106:0x036c, B:98:0x030c), top: B:256:0x0003, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:191:0x0578 A[Catch: all -> 0x058f, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x058f, blocks: (B:97:0x0305, B:99:0x0312, B:101:0x0355, B:108:0x036e, B:110:0x037d, B:112:0x03a2, B:191:0x0578, B:106:0x036c, B:98:0x030c), top: B:265:0x0303, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:202:0x05af A[Catch: Exception -> 0x0689, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0689, blocks: (B:3:0x0003, B:8:0x0021, B:12:0x003c, B:15:0x0067, B:17:0x0093, B:19:0x00b1, B:24:0x00cc, B:30:0x00f3, B:33:0x0114, B:34:0x011b, B:36:0x0124, B:39:0x0143, B:66:0x0227, B:74:0x024d, B:77:0x0260, B:79:0x0280, B:83:0x02a8, B:87:0x02c0, B:94:0x02ea, B:115:0x03c5, B:119:0x03db, B:121:0x03e1, B:123:0x03f9, B:127:0x0418, B:128:0x041d, B:130:0x0426, B:132:0x0444, B:129:0x0420, B:136:0x0468, B:139:0x0475, B:141:0x047d, B:144:0x048c, B:146:0x0494, B:149:0x04a9, B:153:0x04ca, B:154:0x04cd, B:155:0x04cf, B:156:0x04d2, B:160:0x04e2, B:161:0x04ea, B:162:0x04ed, B:165:0x04f0, B:167:0x04ff, B:170:0x050e, B:172:0x0523, B:173:0x0528, B:174:0x052b, B:177:0x052e, B:178:0x0531, B:179:0x0534, B:182:0x0537, B:184:0x0553, B:186:0x056c, B:187:0x0572, B:188:0x0575, B:195:0x0590, B:197:0x0596, B:198:0x0597, B:88:0x02c6, B:89:0x02cb, B:92:0x02ce, B:199:0x0598, B:202:0x05af, B:204:0x05bb, B:209:0x05c9, B:213:0x05d8, B:215:0x05de, B:223:0x05fd, B:226:0x0615, B:229:0x0630, B:230:0x0634, B:231:0x0637, B:232:0x063a, B:220:0x05e4, B:224:0x0603, B:208:0x05bf, B:40:0x0148, B:35:0x011e, B:27:0x00d9, B:41:0x014d, B:44:0x016a, B:46:0x0181, B:49:0x019e, B:51:0x01af, B:50:0x01a7, B:53:0x01c4, B:55:0x01e5, B:58:0x01fd, B:59:0x0202, B:64:0x0220, B:65:0x0224, B:60:0x0208, B:235:0x063d, B:236:0x0648, B:239:0x064b, B:240:0x0653, B:9:0x0026, B:243:0x0656, B:248:0x0682, B:250:0x0686, B:97:0x0305, B:99:0x0312, B:101:0x0355, B:108:0x036e, B:110:0x037d, B:112:0x03a2, B:191:0x0578, B:106:0x036c, B:98:0x030c), top: B:256:0x0003, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:208:0x05bf A[Catch: Exception -> 0x0689, TRY_ENTER, TryCatch #1 {Exception -> 0x0689, blocks: (B:3:0x0003, B:8:0x0021, B:12:0x003c, B:15:0x0067, B:17:0x0093, B:19:0x00b1, B:24:0x00cc, B:30:0x00f3, B:33:0x0114, B:34:0x011b, B:36:0x0124, B:39:0x0143, B:66:0x0227, B:74:0x024d, B:77:0x0260, B:79:0x0280, B:83:0x02a8, B:87:0x02c0, B:94:0x02ea, B:115:0x03c5, B:119:0x03db, B:121:0x03e1, B:123:0x03f9, B:127:0x0418, B:128:0x041d, B:130:0x0426, B:132:0x0444, B:129:0x0420, B:136:0x0468, B:139:0x0475, B:141:0x047d, B:144:0x048c, B:146:0x0494, B:149:0x04a9, B:153:0x04ca, B:154:0x04cd, B:155:0x04cf, B:156:0x04d2, B:160:0x04e2, B:161:0x04ea, B:162:0x04ed, B:165:0x04f0, B:167:0x04ff, B:170:0x050e, B:172:0x0523, B:173:0x0528, B:174:0x052b, B:177:0x052e, B:178:0x0531, B:179:0x0534, B:182:0x0537, B:184:0x0553, B:186:0x056c, B:187:0x0572, B:188:0x0575, B:195:0x0590, B:197:0x0596, B:198:0x0597, B:88:0x02c6, B:89:0x02cb, B:92:0x02ce, B:199:0x0598, B:202:0x05af, B:204:0x05bb, B:209:0x05c9, B:213:0x05d8, B:215:0x05de, B:223:0x05fd, B:226:0x0615, B:229:0x0630, B:230:0x0634, B:231:0x0637, B:232:0x063a, B:220:0x05e4, B:224:0x0603, B:208:0x05bf, B:40:0x0148, B:35:0x011e, B:27:0x00d9, B:41:0x014d, B:44:0x016a, B:46:0x0181, B:49:0x019e, B:51:0x01af, B:50:0x01a7, B:53:0x01c4, B:55:0x01e5, B:58:0x01fd, B:59:0x0202, B:64:0x0220, B:65:0x0224, B:60:0x0208, B:235:0x063d, B:236:0x0648, B:239:0x064b, B:240:0x0653, B:9:0x0026, B:243:0x0656, B:248:0x0682, B:250:0x0686, B:97:0x0305, B:99:0x0312, B:101:0x0355, B:108:0x036e, B:110:0x037d, B:112:0x03a2, B:191:0x0578, B:106:0x036c, B:98:0x030c), top: B:256:0x0003, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:211:0x05cd  */
    /* JADX WARN: Code duplicated, block: B:213:0x05d8 A[Catch: Exception -> 0x0689, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0689, blocks: (B:3:0x0003, B:8:0x0021, B:12:0x003c, B:15:0x0067, B:17:0x0093, B:19:0x00b1, B:24:0x00cc, B:30:0x00f3, B:33:0x0114, B:34:0x011b, B:36:0x0124, B:39:0x0143, B:66:0x0227, B:74:0x024d, B:77:0x0260, B:79:0x0280, B:83:0x02a8, B:87:0x02c0, B:94:0x02ea, B:115:0x03c5, B:119:0x03db, B:121:0x03e1, B:123:0x03f9, B:127:0x0418, B:128:0x041d, B:130:0x0426, B:132:0x0444, B:129:0x0420, B:136:0x0468, B:139:0x0475, B:141:0x047d, B:144:0x048c, B:146:0x0494, B:149:0x04a9, B:153:0x04ca, B:154:0x04cd, B:155:0x04cf, B:156:0x04d2, B:160:0x04e2, B:161:0x04ea, B:162:0x04ed, B:165:0x04f0, B:167:0x04ff, B:170:0x050e, B:172:0x0523, B:173:0x0528, B:174:0x052b, B:177:0x052e, B:178:0x0531, B:179:0x0534, B:182:0x0537, B:184:0x0553, B:186:0x056c, B:187:0x0572, B:188:0x0575, B:195:0x0590, B:197:0x0596, B:198:0x0597, B:88:0x02c6, B:89:0x02cb, B:92:0x02ce, B:199:0x0598, B:202:0x05af, B:204:0x05bb, B:209:0x05c9, B:213:0x05d8, B:215:0x05de, B:223:0x05fd, B:226:0x0615, B:229:0x0630, B:230:0x0634, B:231:0x0637, B:232:0x063a, B:220:0x05e4, B:224:0x0603, B:208:0x05bf, B:40:0x0148, B:35:0x011e, B:27:0x00d9, B:41:0x014d, B:44:0x016a, B:46:0x0181, B:49:0x019e, B:51:0x01af, B:50:0x01a7, B:53:0x01c4, B:55:0x01e5, B:58:0x01fd, B:59:0x0202, B:64:0x0220, B:65:0x0224, B:60:0x0208, B:235:0x063d, B:236:0x0648, B:239:0x064b, B:240:0x0653, B:9:0x0026, B:243:0x0656, B:248:0x0682, B:250:0x0686, B:97:0x0305, B:99:0x0312, B:101:0x0355, B:108:0x036e, B:110:0x037d, B:112:0x03a2, B:191:0x0578, B:106:0x036c, B:98:0x030c), top: B:256:0x0003, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:220:0x05e4 A[Catch: Exception -> 0x0689, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0689, blocks: (B:3:0x0003, B:8:0x0021, B:12:0x003c, B:15:0x0067, B:17:0x0093, B:19:0x00b1, B:24:0x00cc, B:30:0x00f3, B:33:0x0114, B:34:0x011b, B:36:0x0124, B:39:0x0143, B:66:0x0227, B:74:0x024d, B:77:0x0260, B:79:0x0280, B:83:0x02a8, B:87:0x02c0, B:94:0x02ea, B:115:0x03c5, B:119:0x03db, B:121:0x03e1, B:123:0x03f9, B:127:0x0418, B:128:0x041d, B:130:0x0426, B:132:0x0444, B:129:0x0420, B:136:0x0468, B:139:0x0475, B:141:0x047d, B:144:0x048c, B:146:0x0494, B:149:0x04a9, B:153:0x04ca, B:154:0x04cd, B:155:0x04cf, B:156:0x04d2, B:160:0x04e2, B:161:0x04ea, B:162:0x04ed, B:165:0x04f0, B:167:0x04ff, B:170:0x050e, B:172:0x0523, B:173:0x0528, B:174:0x052b, B:177:0x052e, B:178:0x0531, B:179:0x0534, B:182:0x0537, B:184:0x0553, B:186:0x056c, B:187:0x0572, B:188:0x0575, B:195:0x0590, B:197:0x0596, B:198:0x0597, B:88:0x02c6, B:89:0x02cb, B:92:0x02ce, B:199:0x0598, B:202:0x05af, B:204:0x05bb, B:209:0x05c9, B:213:0x05d8, B:215:0x05de, B:223:0x05fd, B:226:0x0615, B:229:0x0630, B:230:0x0634, B:231:0x0637, B:232:0x063a, B:220:0x05e4, B:224:0x0603, B:208:0x05bf, B:40:0x0148, B:35:0x011e, B:27:0x00d9, B:41:0x014d, B:44:0x016a, B:46:0x0181, B:49:0x019e, B:51:0x01af, B:50:0x01a7, B:53:0x01c4, B:55:0x01e5, B:58:0x01fd, B:59:0x0202, B:64:0x0220, B:65:0x0224, B:60:0x0208, B:235:0x063d, B:236:0x0648, B:239:0x064b, B:240:0x0653, B:9:0x0026, B:243:0x0656, B:248:0x0682, B:250:0x0686, B:97:0x0305, B:99:0x0312, B:101:0x0355, B:108:0x036e, B:110:0x037d, B:112:0x03a2, B:191:0x0578, B:106:0x036c, B:98:0x030c), top: B:256:0x0003, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:222:0x05ea  */
    /* JADX WARN: Code duplicated, block: B:224:0x0603 A[Catch: Exception -> 0x0689, TRY_LEAVE, TryCatch #1 {Exception -> 0x0689, blocks: (B:3:0x0003, B:8:0x0021, B:12:0x003c, B:15:0x0067, B:17:0x0093, B:19:0x00b1, B:24:0x00cc, B:30:0x00f3, B:33:0x0114, B:34:0x011b, B:36:0x0124, B:39:0x0143, B:66:0x0227, B:74:0x024d, B:77:0x0260, B:79:0x0280, B:83:0x02a8, B:87:0x02c0, B:94:0x02ea, B:115:0x03c5, B:119:0x03db, B:121:0x03e1, B:123:0x03f9, B:127:0x0418, B:128:0x041d, B:130:0x0426, B:132:0x0444, B:129:0x0420, B:136:0x0468, B:139:0x0475, B:141:0x047d, B:144:0x048c, B:146:0x0494, B:149:0x04a9, B:153:0x04ca, B:154:0x04cd, B:155:0x04cf, B:156:0x04d2, B:160:0x04e2, B:161:0x04ea, B:162:0x04ed, B:165:0x04f0, B:167:0x04ff, B:170:0x050e, B:172:0x0523, B:173:0x0528, B:174:0x052b, B:177:0x052e, B:178:0x0531, B:179:0x0534, B:182:0x0537, B:184:0x0553, B:186:0x056c, B:187:0x0572, B:188:0x0575, B:195:0x0590, B:197:0x0596, B:198:0x0597, B:88:0x02c6, B:89:0x02cb, B:92:0x02ce, B:199:0x0598, B:202:0x05af, B:204:0x05bb, B:209:0x05c9, B:213:0x05d8, B:215:0x05de, B:223:0x05fd, B:226:0x0615, B:229:0x0630, B:230:0x0634, B:231:0x0637, B:232:0x063a, B:220:0x05e4, B:224:0x0603, B:208:0x05bf, B:40:0x0148, B:35:0x011e, B:27:0x00d9, B:41:0x014d, B:44:0x016a, B:46:0x0181, B:49:0x019e, B:51:0x01af, B:50:0x01a7, B:53:0x01c4, B:55:0x01e5, B:58:0x01fd, B:59:0x0202, B:64:0x0220, B:65:0x0224, B:60:0x0208, B:235:0x063d, B:236:0x0648, B:239:0x064b, B:240:0x0653, B:9:0x0026, B:243:0x0656, B:248:0x0682, B:250:0x0686, B:97:0x0305, B:99:0x0312, B:101:0x0355, B:108:0x036e, B:110:0x037d, B:112:0x03a2, B:191:0x0578, B:106:0x036c, B:98:0x030c), top: B:256:0x0003, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:229:0x0630 A[Catch: Exception -> 0x0689, TRY_ENTER, TryCatch #1 {Exception -> 0x0689, blocks: (B:3:0x0003, B:8:0x0021, B:12:0x003c, B:15:0x0067, B:17:0x0093, B:19:0x00b1, B:24:0x00cc, B:30:0x00f3, B:33:0x0114, B:34:0x011b, B:36:0x0124, B:39:0x0143, B:66:0x0227, B:74:0x024d, B:77:0x0260, B:79:0x0280, B:83:0x02a8, B:87:0x02c0, B:94:0x02ea, B:115:0x03c5, B:119:0x03db, B:121:0x03e1, B:123:0x03f9, B:127:0x0418, B:128:0x041d, B:130:0x0426, B:132:0x0444, B:129:0x0420, B:136:0x0468, B:139:0x0475, B:141:0x047d, B:144:0x048c, B:146:0x0494, B:149:0x04a9, B:153:0x04ca, B:154:0x04cd, B:155:0x04cf, B:156:0x04d2, B:160:0x04e2, B:161:0x04ea, B:162:0x04ed, B:165:0x04f0, B:167:0x04ff, B:170:0x050e, B:172:0x0523, B:173:0x0528, B:174:0x052b, B:177:0x052e, B:178:0x0531, B:179:0x0534, B:182:0x0537, B:184:0x0553, B:186:0x056c, B:187:0x0572, B:188:0x0575, B:195:0x0590, B:197:0x0596, B:198:0x0597, B:88:0x02c6, B:89:0x02cb, B:92:0x02ce, B:199:0x0598, B:202:0x05af, B:204:0x05bb, B:209:0x05c9, B:213:0x05d8, B:215:0x05de, B:223:0x05fd, B:226:0x0615, B:229:0x0630, B:230:0x0634, B:231:0x0637, B:232:0x063a, B:220:0x05e4, B:224:0x0603, B:208:0x05bf, B:40:0x0148, B:35:0x011e, B:27:0x00d9, B:41:0x014d, B:44:0x016a, B:46:0x0181, B:49:0x019e, B:51:0x01af, B:50:0x01a7, B:53:0x01c4, B:55:0x01e5, B:58:0x01fd, B:59:0x0202, B:64:0x0220, B:65:0x0224, B:60:0x0208, B:235:0x063d, B:236:0x0648, B:239:0x064b, B:240:0x0653, B:9:0x0026, B:243:0x0656, B:248:0x0682, B:250:0x0686, B:97:0x0305, B:99:0x0312, B:101:0x0355, B:108:0x036e, B:110:0x037d, B:112:0x03a2, B:191:0x0578, B:106:0x036c, B:98:0x030c), top: B:256:0x0003, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:230:0x0634 A[Catch: Exception -> 0x0689, TRY_LEAVE, TryCatch #1 {Exception -> 0x0689, blocks: (B:3:0x0003, B:8:0x0021, B:12:0x003c, B:15:0x0067, B:17:0x0093, B:19:0x00b1, B:24:0x00cc, B:30:0x00f3, B:33:0x0114, B:34:0x011b, B:36:0x0124, B:39:0x0143, B:66:0x0227, B:74:0x024d, B:77:0x0260, B:79:0x0280, B:83:0x02a8, B:87:0x02c0, B:94:0x02ea, B:115:0x03c5, B:119:0x03db, B:121:0x03e1, B:123:0x03f9, B:127:0x0418, B:128:0x041d, B:130:0x0426, B:132:0x0444, B:129:0x0420, B:136:0x0468, B:139:0x0475, B:141:0x047d, B:144:0x048c, B:146:0x0494, B:149:0x04a9, B:153:0x04ca, B:154:0x04cd, B:155:0x04cf, B:156:0x04d2, B:160:0x04e2, B:161:0x04ea, B:162:0x04ed, B:165:0x04f0, B:167:0x04ff, B:170:0x050e, B:172:0x0523, B:173:0x0528, B:174:0x052b, B:177:0x052e, B:178:0x0531, B:179:0x0534, B:182:0x0537, B:184:0x0553, B:186:0x056c, B:187:0x0572, B:188:0x0575, B:195:0x0590, B:197:0x0596, B:198:0x0597, B:88:0x02c6, B:89:0x02cb, B:92:0x02ce, B:199:0x0598, B:202:0x05af, B:204:0x05bb, B:209:0x05c9, B:213:0x05d8, B:215:0x05de, B:223:0x05fd, B:226:0x0615, B:229:0x0630, B:230:0x0634, B:231:0x0637, B:232:0x063a, B:220:0x05e4, B:224:0x0603, B:208:0x05bf, B:40:0x0148, B:35:0x011e, B:27:0x00d9, B:41:0x014d, B:44:0x016a, B:46:0x0181, B:49:0x019e, B:51:0x01af, B:50:0x01a7, B:53:0x01c4, B:55:0x01e5, B:58:0x01fd, B:59:0x0202, B:64:0x0220, B:65:0x0224, B:60:0x0208, B:235:0x063d, B:236:0x0648, B:239:0x064b, B:240:0x0653, B:9:0x0026, B:243:0x0656, B:248:0x0682, B:250:0x0686, B:97:0x0305, B:99:0x0312, B:101:0x0355, B:108:0x036e, B:110:0x037d, B:112:0x03a2, B:191:0x0578, B:106:0x036c, B:98:0x030c), top: B:256:0x0003, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:278:0x04f0 A[EDGE_INSN: B:278:0x04f0->B:165:0x04f0 BREAK  A[LOOP:0: B:141:0x047d->B:159:0x04d5], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:279:0x04e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:280:0x04b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:281:0x0523 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x00f3 A[Catch: Exception -> 0x0689, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0689, blocks: (B:3:0x0003, B:8:0x0021, B:12:0x003c, B:15:0x0067, B:17:0x0093, B:19:0x00b1, B:24:0x00cc, B:30:0x00f3, B:33:0x0114, B:34:0x011b, B:36:0x0124, B:39:0x0143, B:66:0x0227, B:74:0x024d, B:77:0x0260, B:79:0x0280, B:83:0x02a8, B:87:0x02c0, B:94:0x02ea, B:115:0x03c5, B:119:0x03db, B:121:0x03e1, B:123:0x03f9, B:127:0x0418, B:128:0x041d, B:130:0x0426, B:132:0x0444, B:129:0x0420, B:136:0x0468, B:139:0x0475, B:141:0x047d, B:144:0x048c, B:146:0x0494, B:149:0x04a9, B:153:0x04ca, B:154:0x04cd, B:155:0x04cf, B:156:0x04d2, B:160:0x04e2, B:161:0x04ea, B:162:0x04ed, B:165:0x04f0, B:167:0x04ff, B:170:0x050e, B:172:0x0523, B:173:0x0528, B:174:0x052b, B:177:0x052e, B:178:0x0531, B:179:0x0534, B:182:0x0537, B:184:0x0553, B:186:0x056c, B:187:0x0572, B:188:0x0575, B:195:0x0590, B:197:0x0596, B:198:0x0597, B:88:0x02c6, B:89:0x02cb, B:92:0x02ce, B:199:0x0598, B:202:0x05af, B:204:0x05bb, B:209:0x05c9, B:213:0x05d8, B:215:0x05de, B:223:0x05fd, B:226:0x0615, B:229:0x0630, B:230:0x0634, B:231:0x0637, B:232:0x063a, B:220:0x05e4, B:224:0x0603, B:208:0x05bf, B:40:0x0148, B:35:0x011e, B:27:0x00d9, B:41:0x014d, B:44:0x016a, B:46:0x0181, B:49:0x019e, B:51:0x01af, B:50:0x01a7, B:53:0x01c4, B:55:0x01e5, B:58:0x01fd, B:59:0x0202, B:64:0x0220, B:65:0x0224, B:60:0x0208, B:235:0x063d, B:236:0x0648, B:239:0x064b, B:240:0x0653, B:9:0x0026, B:243:0x0656, B:248:0x0682, B:250:0x0686, B:97:0x0305, B:99:0x0312, B:101:0x0355, B:108:0x036e, B:110:0x037d, B:112:0x03a2, B:191:0x0578, B:106:0x036c, B:98:0x030c), top: B:256:0x0003, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0114 A[Catch: Exception -> 0x0689, TRY_ENTER, TryCatch #1 {Exception -> 0x0689, blocks: (B:3:0x0003, B:8:0x0021, B:12:0x003c, B:15:0x0067, B:17:0x0093, B:19:0x00b1, B:24:0x00cc, B:30:0x00f3, B:33:0x0114, B:34:0x011b, B:36:0x0124, B:39:0x0143, B:66:0x0227, B:74:0x024d, B:77:0x0260, B:79:0x0280, B:83:0x02a8, B:87:0x02c0, B:94:0x02ea, B:115:0x03c5, B:119:0x03db, B:121:0x03e1, B:123:0x03f9, B:127:0x0418, B:128:0x041d, B:130:0x0426, B:132:0x0444, B:129:0x0420, B:136:0x0468, B:139:0x0475, B:141:0x047d, B:144:0x048c, B:146:0x0494, B:149:0x04a9, B:153:0x04ca, B:154:0x04cd, B:155:0x04cf, B:156:0x04d2, B:160:0x04e2, B:161:0x04ea, B:162:0x04ed, B:165:0x04f0, B:167:0x04ff, B:170:0x050e, B:172:0x0523, B:173:0x0528, B:174:0x052b, B:177:0x052e, B:178:0x0531, B:179:0x0534, B:182:0x0537, B:184:0x0553, B:186:0x056c, B:187:0x0572, B:188:0x0575, B:195:0x0590, B:197:0x0596, B:198:0x0597, B:88:0x02c6, B:89:0x02cb, B:92:0x02ce, B:199:0x0598, B:202:0x05af, B:204:0x05bb, B:209:0x05c9, B:213:0x05d8, B:215:0x05de, B:223:0x05fd, B:226:0x0615, B:229:0x0630, B:230:0x0634, B:231:0x0637, B:232:0x063a, B:220:0x05e4, B:224:0x0603, B:208:0x05bf, B:40:0x0148, B:35:0x011e, B:27:0x00d9, B:41:0x014d, B:44:0x016a, B:46:0x0181, B:49:0x019e, B:51:0x01af, B:50:0x01a7, B:53:0x01c4, B:55:0x01e5, B:58:0x01fd, B:59:0x0202, B:64:0x0220, B:65:0x0224, B:60:0x0208, B:235:0x063d, B:236:0x0648, B:239:0x064b, B:240:0x0653, B:9:0x0026, B:243:0x0656, B:248:0x0682, B:250:0x0686, B:97:0x0305, B:99:0x0312, B:101:0x0355, B:108:0x036e, B:110:0x037d, B:112:0x03a2, B:191:0x0578, B:106:0x036c, B:98:0x030c), top: B:256:0x0003, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x011e A[Catch: Exception -> 0x0689, TryCatch #1 {Exception -> 0x0689, blocks: (B:3:0x0003, B:8:0x0021, B:12:0x003c, B:15:0x0067, B:17:0x0093, B:19:0x00b1, B:24:0x00cc, B:30:0x00f3, B:33:0x0114, B:34:0x011b, B:36:0x0124, B:39:0x0143, B:66:0x0227, B:74:0x024d, B:77:0x0260, B:79:0x0280, B:83:0x02a8, B:87:0x02c0, B:94:0x02ea, B:115:0x03c5, B:119:0x03db, B:121:0x03e1, B:123:0x03f9, B:127:0x0418, B:128:0x041d, B:130:0x0426, B:132:0x0444, B:129:0x0420, B:136:0x0468, B:139:0x0475, B:141:0x047d, B:144:0x048c, B:146:0x0494, B:149:0x04a9, B:153:0x04ca, B:154:0x04cd, B:155:0x04cf, B:156:0x04d2, B:160:0x04e2, B:161:0x04ea, B:162:0x04ed, B:165:0x04f0, B:167:0x04ff, B:170:0x050e, B:172:0x0523, B:173:0x0528, B:174:0x052b, B:177:0x052e, B:178:0x0531, B:179:0x0534, B:182:0x0537, B:184:0x0553, B:186:0x056c, B:187:0x0572, B:188:0x0575, B:195:0x0590, B:197:0x0596, B:198:0x0597, B:88:0x02c6, B:89:0x02cb, B:92:0x02ce, B:199:0x0598, B:202:0x05af, B:204:0x05bb, B:209:0x05c9, B:213:0x05d8, B:215:0x05de, B:223:0x05fd, B:226:0x0615, B:229:0x0630, B:230:0x0634, B:231:0x0637, B:232:0x063a, B:220:0x05e4, B:224:0x0603, B:208:0x05bf, B:40:0x0148, B:35:0x011e, B:27:0x00d9, B:41:0x014d, B:44:0x016a, B:46:0x0181, B:49:0x019e, B:51:0x01af, B:50:0x01a7, B:53:0x01c4, B:55:0x01e5, B:58:0x01fd, B:59:0x0202, B:64:0x0220, B:65:0x0224, B:60:0x0208, B:235:0x063d, B:236:0x0648, B:239:0x064b, B:240:0x0653, B:9:0x0026, B:243:0x0656, B:248:0x0682, B:250:0x0686, B:97:0x0305, B:99:0x0312, B:101:0x0355, B:108:0x036e, B:110:0x037d, B:112:0x03a2, B:191:0x0578, B:106:0x036c, B:98:0x030c), top: B:256:0x0003, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0143 A[Catch: Exception -> 0x0689, TRY_ENTER, TryCatch #1 {Exception -> 0x0689, blocks: (B:3:0x0003, B:8:0x0021, B:12:0x003c, B:15:0x0067, B:17:0x0093, B:19:0x00b1, B:24:0x00cc, B:30:0x00f3, B:33:0x0114, B:34:0x011b, B:36:0x0124, B:39:0x0143, B:66:0x0227, B:74:0x024d, B:77:0x0260, B:79:0x0280, B:83:0x02a8, B:87:0x02c0, B:94:0x02ea, B:115:0x03c5, B:119:0x03db, B:121:0x03e1, B:123:0x03f9, B:127:0x0418, B:128:0x041d, B:130:0x0426, B:132:0x0444, B:129:0x0420, B:136:0x0468, B:139:0x0475, B:141:0x047d, B:144:0x048c, B:146:0x0494, B:149:0x04a9, B:153:0x04ca, B:154:0x04cd, B:155:0x04cf, B:156:0x04d2, B:160:0x04e2, B:161:0x04ea, B:162:0x04ed, B:165:0x04f0, B:167:0x04ff, B:170:0x050e, B:172:0x0523, B:173:0x0528, B:174:0x052b, B:177:0x052e, B:178:0x0531, B:179:0x0534, B:182:0x0537, B:184:0x0553, B:186:0x056c, B:187:0x0572, B:188:0x0575, B:195:0x0590, B:197:0x0596, B:198:0x0597, B:88:0x02c6, B:89:0x02cb, B:92:0x02ce, B:199:0x0598, B:202:0x05af, B:204:0x05bb, B:209:0x05c9, B:213:0x05d8, B:215:0x05de, B:223:0x05fd, B:226:0x0615, B:229:0x0630, B:230:0x0634, B:231:0x0637, B:232:0x063a, B:220:0x05e4, B:224:0x0603, B:208:0x05bf, B:40:0x0148, B:35:0x011e, B:27:0x00d9, B:41:0x014d, B:44:0x016a, B:46:0x0181, B:49:0x019e, B:51:0x01af, B:50:0x01a7, B:53:0x01c4, B:55:0x01e5, B:58:0x01fd, B:59:0x0202, B:64:0x0220, B:65:0x0224, B:60:0x0208, B:235:0x063d, B:236:0x0648, B:239:0x064b, B:240:0x0653, B:9:0x0026, B:243:0x0656, B:248:0x0682, B:250:0x0686, B:97:0x0305, B:99:0x0312, B:101:0x0355, B:108:0x036e, B:110:0x037d, B:112:0x03a2, B:191:0x0578, B:106:0x036c, B:98:0x030c), top: B:256:0x0003, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0148 A[Catch: Exception -> 0x0689, TryCatch #1 {Exception -> 0x0689, blocks: (B:3:0x0003, B:8:0x0021, B:12:0x003c, B:15:0x0067, B:17:0x0093, B:19:0x00b1, B:24:0x00cc, B:30:0x00f3, B:33:0x0114, B:34:0x011b, B:36:0x0124, B:39:0x0143, B:66:0x0227, B:74:0x024d, B:77:0x0260, B:79:0x0280, B:83:0x02a8, B:87:0x02c0, B:94:0x02ea, B:115:0x03c5, B:119:0x03db, B:121:0x03e1, B:123:0x03f9, B:127:0x0418, B:128:0x041d, B:130:0x0426, B:132:0x0444, B:129:0x0420, B:136:0x0468, B:139:0x0475, B:141:0x047d, B:144:0x048c, B:146:0x0494, B:149:0x04a9, B:153:0x04ca, B:154:0x04cd, B:155:0x04cf, B:156:0x04d2, B:160:0x04e2, B:161:0x04ea, B:162:0x04ed, B:165:0x04f0, B:167:0x04ff, B:170:0x050e, B:172:0x0523, B:173:0x0528, B:174:0x052b, B:177:0x052e, B:178:0x0531, B:179:0x0534, B:182:0x0537, B:184:0x0553, B:186:0x056c, B:187:0x0572, B:188:0x0575, B:195:0x0590, B:197:0x0596, B:198:0x0597, B:88:0x02c6, B:89:0x02cb, B:92:0x02ce, B:199:0x0598, B:202:0x05af, B:204:0x05bb, B:209:0x05c9, B:213:0x05d8, B:215:0x05de, B:223:0x05fd, B:226:0x0615, B:229:0x0630, B:230:0x0634, B:231:0x0637, B:232:0x063a, B:220:0x05e4, B:224:0x0603, B:208:0x05bf, B:40:0x0148, B:35:0x011e, B:27:0x00d9, B:41:0x014d, B:44:0x016a, B:46:0x0181, B:49:0x019e, B:51:0x01af, B:50:0x01a7, B:53:0x01c4, B:55:0x01e5, B:58:0x01fd, B:59:0x0202, B:64:0x0220, B:65:0x0224, B:60:0x0208, B:235:0x063d, B:236:0x0648, B:239:0x064b, B:240:0x0653, B:9:0x0026, B:243:0x0656, B:248:0x0682, B:250:0x0686, B:97:0x0305, B:99:0x0312, B:101:0x0355, B:108:0x036e, B:110:0x037d, B:112:0x03a2, B:191:0x0578, B:106:0x036c, B:98:0x030c), top: B:256:0x0003, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0155  */
    /* JADX WARN: Code duplicated, block: B:49:0x019e A[Catch: Exception -> 0x0689, TRY_ENTER, TryCatch #1 {Exception -> 0x0689, blocks: (B:3:0x0003, B:8:0x0021, B:12:0x003c, B:15:0x0067, B:17:0x0093, B:19:0x00b1, B:24:0x00cc, B:30:0x00f3, B:33:0x0114, B:34:0x011b, B:36:0x0124, B:39:0x0143, B:66:0x0227, B:74:0x024d, B:77:0x0260, B:79:0x0280, B:83:0x02a8, B:87:0x02c0, B:94:0x02ea, B:115:0x03c5, B:119:0x03db, B:121:0x03e1, B:123:0x03f9, B:127:0x0418, B:128:0x041d, B:130:0x0426, B:132:0x0444, B:129:0x0420, B:136:0x0468, B:139:0x0475, B:141:0x047d, B:144:0x048c, B:146:0x0494, B:149:0x04a9, B:153:0x04ca, B:154:0x04cd, B:155:0x04cf, B:156:0x04d2, B:160:0x04e2, B:161:0x04ea, B:162:0x04ed, B:165:0x04f0, B:167:0x04ff, B:170:0x050e, B:172:0x0523, B:173:0x0528, B:174:0x052b, B:177:0x052e, B:178:0x0531, B:179:0x0534, B:182:0x0537, B:184:0x0553, B:186:0x056c, B:187:0x0572, B:188:0x0575, B:195:0x0590, B:197:0x0596, B:198:0x0597, B:88:0x02c6, B:89:0x02cb, B:92:0x02ce, B:199:0x0598, B:202:0x05af, B:204:0x05bb, B:209:0x05c9, B:213:0x05d8, B:215:0x05de, B:223:0x05fd, B:226:0x0615, B:229:0x0630, B:230:0x0634, B:231:0x0637, B:232:0x063a, B:220:0x05e4, B:224:0x0603, B:208:0x05bf, B:40:0x0148, B:35:0x011e, B:27:0x00d9, B:41:0x014d, B:44:0x016a, B:46:0x0181, B:49:0x019e, B:51:0x01af, B:50:0x01a7, B:53:0x01c4, B:55:0x01e5, B:58:0x01fd, B:59:0x0202, B:64:0x0220, B:65:0x0224, B:60:0x0208, B:235:0x063d, B:236:0x0648, B:239:0x064b, B:240:0x0653, B:9:0x0026, B:243:0x0656, B:248:0x0682, B:250:0x0686, B:97:0x0305, B:99:0x0312, B:101:0x0355, B:108:0x036e, B:110:0x037d, B:112:0x03a2, B:191:0x0578, B:106:0x036c, B:98:0x030c), top: B:256:0x0003, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x01a7 A[Catch: Exception -> 0x0689, TryCatch #1 {Exception -> 0x0689, blocks: (B:3:0x0003, B:8:0x0021, B:12:0x003c, B:15:0x0067, B:17:0x0093, B:19:0x00b1, B:24:0x00cc, B:30:0x00f3, B:33:0x0114, B:34:0x011b, B:36:0x0124, B:39:0x0143, B:66:0x0227, B:74:0x024d, B:77:0x0260, B:79:0x0280, B:83:0x02a8, B:87:0x02c0, B:94:0x02ea, B:115:0x03c5, B:119:0x03db, B:121:0x03e1, B:123:0x03f9, B:127:0x0418, B:128:0x041d, B:130:0x0426, B:132:0x0444, B:129:0x0420, B:136:0x0468, B:139:0x0475, B:141:0x047d, B:144:0x048c, B:146:0x0494, B:149:0x04a9, B:153:0x04ca, B:154:0x04cd, B:155:0x04cf, B:156:0x04d2, B:160:0x04e2, B:161:0x04ea, B:162:0x04ed, B:165:0x04f0, B:167:0x04ff, B:170:0x050e, B:172:0x0523, B:173:0x0528, B:174:0x052b, B:177:0x052e, B:178:0x0531, B:179:0x0534, B:182:0x0537, B:184:0x0553, B:186:0x056c, B:187:0x0572, B:188:0x0575, B:195:0x0590, B:197:0x0596, B:198:0x0597, B:88:0x02c6, B:89:0x02cb, B:92:0x02ce, B:199:0x0598, B:202:0x05af, B:204:0x05bb, B:209:0x05c9, B:213:0x05d8, B:215:0x05de, B:223:0x05fd, B:226:0x0615, B:229:0x0630, B:230:0x0634, B:231:0x0637, B:232:0x063a, B:220:0x05e4, B:224:0x0603, B:208:0x05bf, B:40:0x0148, B:35:0x011e, B:27:0x00d9, B:41:0x014d, B:44:0x016a, B:46:0x0181, B:49:0x019e, B:51:0x01af, B:50:0x01a7, B:53:0x01c4, B:55:0x01e5, B:58:0x01fd, B:59:0x0202, B:64:0x0220, B:65:0x0224, B:60:0x0208, B:235:0x063d, B:236:0x0648, B:239:0x064b, B:240:0x0653, B:9:0x0026, B:243:0x0656, B:248:0x0682, B:250:0x0686, B:97:0x0305, B:99:0x0312, B:101:0x0355, B:108:0x036e, B:110:0x037d, B:112:0x03a2, B:191:0x0578, B:106:0x036c, B:98:0x030c), top: B:256:0x0003, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x01c4 A[Catch: Exception -> 0x0689, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0689, blocks: (B:3:0x0003, B:8:0x0021, B:12:0x003c, B:15:0x0067, B:17:0x0093, B:19:0x00b1, B:24:0x00cc, B:30:0x00f3, B:33:0x0114, B:34:0x011b, B:36:0x0124, B:39:0x0143, B:66:0x0227, B:74:0x024d, B:77:0x0260, B:79:0x0280, B:83:0x02a8, B:87:0x02c0, B:94:0x02ea, B:115:0x03c5, B:119:0x03db, B:121:0x03e1, B:123:0x03f9, B:127:0x0418, B:128:0x041d, B:130:0x0426, B:132:0x0444, B:129:0x0420, B:136:0x0468, B:139:0x0475, B:141:0x047d, B:144:0x048c, B:146:0x0494, B:149:0x04a9, B:153:0x04ca, B:154:0x04cd, B:155:0x04cf, B:156:0x04d2, B:160:0x04e2, B:161:0x04ea, B:162:0x04ed, B:165:0x04f0, B:167:0x04ff, B:170:0x050e, B:172:0x0523, B:173:0x0528, B:174:0x052b, B:177:0x052e, B:178:0x0531, B:179:0x0534, B:182:0x0537, B:184:0x0553, B:186:0x056c, B:187:0x0572, B:188:0x0575, B:195:0x0590, B:197:0x0596, B:198:0x0597, B:88:0x02c6, B:89:0x02cb, B:92:0x02ce, B:199:0x0598, B:202:0x05af, B:204:0x05bb, B:209:0x05c9, B:213:0x05d8, B:215:0x05de, B:223:0x05fd, B:226:0x0615, B:229:0x0630, B:230:0x0634, B:231:0x0637, B:232:0x063a, B:220:0x05e4, B:224:0x0603, B:208:0x05bf, B:40:0x0148, B:35:0x011e, B:27:0x00d9, B:41:0x014d, B:44:0x016a, B:46:0x0181, B:49:0x019e, B:51:0x01af, B:50:0x01a7, B:53:0x01c4, B:55:0x01e5, B:58:0x01fd, B:59:0x0202, B:64:0x0220, B:65:0x0224, B:60:0x0208, B:235:0x063d, B:236:0x0648, B:239:0x064b, B:240:0x0653, B:9:0x0026, B:243:0x0656, B:248:0x0682, B:250:0x0686, B:97:0x0305, B:99:0x0312, B:101:0x0355, B:108:0x036e, B:110:0x037d, B:112:0x03a2, B:191:0x0578, B:106:0x036c, B:98:0x030c), top: B:256:0x0003, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x01fd A[Catch: Exception -> 0x0689, TRY_ENTER, TryCatch #1 {Exception -> 0x0689, blocks: (B:3:0x0003, B:8:0x0021, B:12:0x003c, B:15:0x0067, B:17:0x0093, B:19:0x00b1, B:24:0x00cc, B:30:0x00f3, B:33:0x0114, B:34:0x011b, B:36:0x0124, B:39:0x0143, B:66:0x0227, B:74:0x024d, B:77:0x0260, B:79:0x0280, B:83:0x02a8, B:87:0x02c0, B:94:0x02ea, B:115:0x03c5, B:119:0x03db, B:121:0x03e1, B:123:0x03f9, B:127:0x0418, B:128:0x041d, B:130:0x0426, B:132:0x0444, B:129:0x0420, B:136:0x0468, B:139:0x0475, B:141:0x047d, B:144:0x048c, B:146:0x0494, B:149:0x04a9, B:153:0x04ca, B:154:0x04cd, B:155:0x04cf, B:156:0x04d2, B:160:0x04e2, B:161:0x04ea, B:162:0x04ed, B:165:0x04f0, B:167:0x04ff, B:170:0x050e, B:172:0x0523, B:173:0x0528, B:174:0x052b, B:177:0x052e, B:178:0x0531, B:179:0x0534, B:182:0x0537, B:184:0x0553, B:186:0x056c, B:187:0x0572, B:188:0x0575, B:195:0x0590, B:197:0x0596, B:198:0x0597, B:88:0x02c6, B:89:0x02cb, B:92:0x02ce, B:199:0x0598, B:202:0x05af, B:204:0x05bb, B:209:0x05c9, B:213:0x05d8, B:215:0x05de, B:223:0x05fd, B:226:0x0615, B:229:0x0630, B:230:0x0634, B:231:0x0637, B:232:0x063a, B:220:0x05e4, B:224:0x0603, B:208:0x05bf, B:40:0x0148, B:35:0x011e, B:27:0x00d9, B:41:0x014d, B:44:0x016a, B:46:0x0181, B:49:0x019e, B:51:0x01af, B:50:0x01a7, B:53:0x01c4, B:55:0x01e5, B:58:0x01fd, B:59:0x0202, B:64:0x0220, B:65:0x0224, B:60:0x0208, B:235:0x063d, B:236:0x0648, B:239:0x064b, B:240:0x0653, B:9:0x0026, B:243:0x0656, B:248:0x0682, B:250:0x0686, B:97:0x0305, B:99:0x0312, B:101:0x0355, B:108:0x036e, B:110:0x037d, B:112:0x03a2, B:191:0x0578, B:106:0x036c, B:98:0x030c), top: B:256:0x0003, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0208 A[Catch: Exception -> 0x0689, TRY_LEAVE, TryCatch #1 {Exception -> 0x0689, blocks: (B:3:0x0003, B:8:0x0021, B:12:0x003c, B:15:0x0067, B:17:0x0093, B:19:0x00b1, B:24:0x00cc, B:30:0x00f3, B:33:0x0114, B:34:0x011b, B:36:0x0124, B:39:0x0143, B:66:0x0227, B:74:0x024d, B:77:0x0260, B:79:0x0280, B:83:0x02a8, B:87:0x02c0, B:94:0x02ea, B:115:0x03c5, B:119:0x03db, B:121:0x03e1, B:123:0x03f9, B:127:0x0418, B:128:0x041d, B:130:0x0426, B:132:0x0444, B:129:0x0420, B:136:0x0468, B:139:0x0475, B:141:0x047d, B:144:0x048c, B:146:0x0494, B:149:0x04a9, B:153:0x04ca, B:154:0x04cd, B:155:0x04cf, B:156:0x04d2, B:160:0x04e2, B:161:0x04ea, B:162:0x04ed, B:165:0x04f0, B:167:0x04ff, B:170:0x050e, B:172:0x0523, B:173:0x0528, B:174:0x052b, B:177:0x052e, B:178:0x0531, B:179:0x0534, B:182:0x0537, B:184:0x0553, B:186:0x056c, B:187:0x0572, B:188:0x0575, B:195:0x0590, B:197:0x0596, B:198:0x0597, B:88:0x02c6, B:89:0x02cb, B:92:0x02ce, B:199:0x0598, B:202:0x05af, B:204:0x05bb, B:209:0x05c9, B:213:0x05d8, B:215:0x05de, B:223:0x05fd, B:226:0x0615, B:229:0x0630, B:230:0x0634, B:231:0x0637, B:232:0x063a, B:220:0x05e4, B:224:0x0603, B:208:0x05bf, B:40:0x0148, B:35:0x011e, B:27:0x00d9, B:41:0x014d, B:44:0x016a, B:46:0x0181, B:49:0x019e, B:51:0x01af, B:50:0x01a7, B:53:0x01c4, B:55:0x01e5, B:58:0x01fd, B:59:0x0202, B:64:0x0220, B:65:0x0224, B:60:0x0208, B:235:0x063d, B:236:0x0648, B:239:0x064b, B:240:0x0653, B:9:0x0026, B:243:0x0656, B:248:0x0682, B:250:0x0686, B:97:0x0305, B:99:0x0312, B:101:0x0355, B:108:0x036e, B:110:0x037d, B:112:0x03a2, B:191:0x0578, B:106:0x036c, B:98:0x030c), top: B:256:0x0003, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0220 A[Catch: Exception -> 0x0689, TRY_ENTER, TryCatch #1 {Exception -> 0x0689, blocks: (B:3:0x0003, B:8:0x0021, B:12:0x003c, B:15:0x0067, B:17:0x0093, B:19:0x00b1, B:24:0x00cc, B:30:0x00f3, B:33:0x0114, B:34:0x011b, B:36:0x0124, B:39:0x0143, B:66:0x0227, B:74:0x024d, B:77:0x0260, B:79:0x0280, B:83:0x02a8, B:87:0x02c0, B:94:0x02ea, B:115:0x03c5, B:119:0x03db, B:121:0x03e1, B:123:0x03f9, B:127:0x0418, B:128:0x041d, B:130:0x0426, B:132:0x0444, B:129:0x0420, B:136:0x0468, B:139:0x0475, B:141:0x047d, B:144:0x048c, B:146:0x0494, B:149:0x04a9, B:153:0x04ca, B:154:0x04cd, B:155:0x04cf, B:156:0x04d2, B:160:0x04e2, B:161:0x04ea, B:162:0x04ed, B:165:0x04f0, B:167:0x04ff, B:170:0x050e, B:172:0x0523, B:173:0x0528, B:174:0x052b, B:177:0x052e, B:178:0x0531, B:179:0x0534, B:182:0x0537, B:184:0x0553, B:186:0x056c, B:187:0x0572, B:188:0x0575, B:195:0x0590, B:197:0x0596, B:198:0x0597, B:88:0x02c6, B:89:0x02cb, B:92:0x02ce, B:199:0x0598, B:202:0x05af, B:204:0x05bb, B:209:0x05c9, B:213:0x05d8, B:215:0x05de, B:223:0x05fd, B:226:0x0615, B:229:0x0630, B:230:0x0634, B:231:0x0637, B:232:0x063a, B:220:0x05e4, B:224:0x0603, B:208:0x05bf, B:40:0x0148, B:35:0x011e, B:27:0x00d9, B:41:0x014d, B:44:0x016a, B:46:0x0181, B:49:0x019e, B:51:0x01af, B:50:0x01a7, B:53:0x01c4, B:55:0x01e5, B:58:0x01fd, B:59:0x0202, B:64:0x0220, B:65:0x0224, B:60:0x0208, B:235:0x063d, B:236:0x0648, B:239:0x064b, B:240:0x0653, B:9:0x0026, B:243:0x0656, B:248:0x0682, B:250:0x0686, B:97:0x0305, B:99:0x0312, B:101:0x0355, B:108:0x036e, B:110:0x037d, B:112:0x03a2, B:191:0x0578, B:106:0x036c, B:98:0x030c), top: B:256:0x0003, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0224 A[Catch: Exception -> 0x0689, TryCatch #1 {Exception -> 0x0689, blocks: (B:3:0x0003, B:8:0x0021, B:12:0x003c, B:15:0x0067, B:17:0x0093, B:19:0x00b1, B:24:0x00cc, B:30:0x00f3, B:33:0x0114, B:34:0x011b, B:36:0x0124, B:39:0x0143, B:66:0x0227, B:74:0x024d, B:77:0x0260, B:79:0x0280, B:83:0x02a8, B:87:0x02c0, B:94:0x02ea, B:115:0x03c5, B:119:0x03db, B:121:0x03e1, B:123:0x03f9, B:127:0x0418, B:128:0x041d, B:130:0x0426, B:132:0x0444, B:129:0x0420, B:136:0x0468, B:139:0x0475, B:141:0x047d, B:144:0x048c, B:146:0x0494, B:149:0x04a9, B:153:0x04ca, B:154:0x04cd, B:155:0x04cf, B:156:0x04d2, B:160:0x04e2, B:161:0x04ea, B:162:0x04ed, B:165:0x04f0, B:167:0x04ff, B:170:0x050e, B:172:0x0523, B:173:0x0528, B:174:0x052b, B:177:0x052e, B:178:0x0531, B:179:0x0534, B:182:0x0537, B:184:0x0553, B:186:0x056c, B:187:0x0572, B:188:0x0575, B:195:0x0590, B:197:0x0596, B:198:0x0597, B:88:0x02c6, B:89:0x02cb, B:92:0x02ce, B:199:0x0598, B:202:0x05af, B:204:0x05bb, B:209:0x05c9, B:213:0x05d8, B:215:0x05de, B:223:0x05fd, B:226:0x0615, B:229:0x0630, B:230:0x0634, B:231:0x0637, B:232:0x063a, B:220:0x05e4, B:224:0x0603, B:208:0x05bf, B:40:0x0148, B:35:0x011e, B:27:0x00d9, B:41:0x014d, B:44:0x016a, B:46:0x0181, B:49:0x019e, B:51:0x01af, B:50:0x01a7, B:53:0x01c4, B:55:0x01e5, B:58:0x01fd, B:59:0x0202, B:64:0x0220, B:65:0x0224, B:60:0x0208, B:235:0x063d, B:236:0x0648, B:239:0x064b, B:240:0x0653, B:9:0x0026, B:243:0x0656, B:248:0x0682, B:250:0x0686, B:97:0x0305, B:99:0x0312, B:101:0x0355, B:108:0x036e, B:110:0x037d, B:112:0x03a2, B:191:0x0578, B:106:0x036c, B:98:0x030c), top: B:256:0x0003, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x02ce A[Catch: Exception -> 0x0689, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0689, blocks: (B:3:0x0003, B:8:0x0021, B:12:0x003c, B:15:0x0067, B:17:0x0093, B:19:0x00b1, B:24:0x00cc, B:30:0x00f3, B:33:0x0114, B:34:0x011b, B:36:0x0124, B:39:0x0143, B:66:0x0227, B:74:0x024d, B:77:0x0260, B:79:0x0280, B:83:0x02a8, B:87:0x02c0, B:94:0x02ea, B:115:0x03c5, B:119:0x03db, B:121:0x03e1, B:123:0x03f9, B:127:0x0418, B:128:0x041d, B:130:0x0426, B:132:0x0444, B:129:0x0420, B:136:0x0468, B:139:0x0475, B:141:0x047d, B:144:0x048c, B:146:0x0494, B:149:0x04a9, B:153:0x04ca, B:154:0x04cd, B:155:0x04cf, B:156:0x04d2, B:160:0x04e2, B:161:0x04ea, B:162:0x04ed, B:165:0x04f0, B:167:0x04ff, B:170:0x050e, B:172:0x0523, B:173:0x0528, B:174:0x052b, B:177:0x052e, B:178:0x0531, B:179:0x0534, B:182:0x0537, B:184:0x0553, B:186:0x056c, B:187:0x0572, B:188:0x0575, B:195:0x0590, B:197:0x0596, B:198:0x0597, B:88:0x02c6, B:89:0x02cb, B:92:0x02ce, B:199:0x0598, B:202:0x05af, B:204:0x05bb, B:209:0x05c9, B:213:0x05d8, B:215:0x05de, B:223:0x05fd, B:226:0x0615, B:229:0x0630, B:230:0x0634, B:231:0x0637, B:232:0x063a, B:220:0x05e4, B:224:0x0603, B:208:0x05bf, B:40:0x0148, B:35:0x011e, B:27:0x00d9, B:41:0x014d, B:44:0x016a, B:46:0x0181, B:49:0x019e, B:51:0x01af, B:50:0x01a7, B:53:0x01c4, B:55:0x01e5, B:58:0x01fd, B:59:0x0202, B:64:0x0220, B:65:0x0224, B:60:0x0208, B:235:0x063d, B:236:0x0648, B:239:0x064b, B:240:0x0653, B:9:0x0026, B:243:0x0656, B:248:0x0682, B:250:0x0686, B:97:0x0305, B:99:0x0312, B:101:0x0355, B:108:0x036e, B:110:0x037d, B:112:0x03a2, B:191:0x0578, B:106:0x036c, B:98:0x030c), top: B:256:0x0003, inners: #6 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:192:0x057a -> B:193:0x057d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    @Override // android.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater r12, android.view.ViewGroup r13, android.os.Bundle r14) {
        /*
            Method dump skipped, instruction units count: 1676
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.fragments.FragmentRoster.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    private double calculateAge(int i, int i2, int i3, boolean z) {
        GregorianCalendar gregorianCalendarY;
        GregorianCalendar gregorianCalendarY2;
        int i4;
        int i5 = 2 % 2;
        int i6 = b;
        int i7 = (-2) - (((i6 ^ 76) + ((i6 & 76) << 1)) ^ (-1));
        a = i7 % 128;
        int i8 = i7 % 2;
        Date dateH = z.h(ivas.gov.bisp.enumeration.p091n.j.l(i, "-", i2, "-", i3), "dd-MM-yyyy");
        Date date = new Date();
        int i9 = a + 39;
        b = i9 % 128;
        if (i9 % 2 != 0) {
            gregorianCalendarY = ivas.gov.bisp.enumeration.p091n.j.y(dateH);
            gregorianCalendarY2 = ivas.gov.bisp.enumeration.p091n.j.y(date);
            i4 = 0;
        } else {
            gregorianCalendarY = ivas.gov.bisp.enumeration.p091n.j.y(dateH);
            gregorianCalendarY2 = ivas.gov.bisp.enumeration.p091n.j.y(date);
            i4 = 1;
        }
        int i10 = gregorianCalendarY2.get(i4) - gregorianCalendarY.get(1);
        if (i10 > 115) {
            int i11 = b;
            int i12 = (i11 & 103) + (i11 | 103);
            int i13 = i12 % 128;
            a = i13;
            int i14 = i12 % 2;
            double d2 = i10;
            int i15 = (-2) - (((i13 ^ 16) + ((i13 & 16) << 1)) ^ (-1));
            b = i15 % 128;
            int i16 = i15 % 2;
            return d2;
        }
        int i17 = gregorianCalendarY2.get(2);
        int i18 = ((i17 | 1) << 1) - (i17 ^ 1);
        int i19 = gregorianCalendarY.get(2);
        int i20 = a;
        int i21 = i20 & 11;
        int i22 = -(-((i20 ^ 11) | i21));
        int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
        int i24 = i23 % 128;
        b = i24;
        if (i23 % 2 == 0 ? i18 >= ((i19 ^ 2) + ((i19 & 2) << 1)) - 1 : i18 >= i19) {
            gregorianCalendarY2.get(2);
            gregorianCalendarY.get(2);
            int i25 = b + 65;
            a = i25 % 128;
            int i26 = i25 % 2;
        } else {
            int i27 = ((i24 | 41) << 1) - (i24 ^ 41);
            a = i27 % 128;
            if (i27 % 2 == 0) {
                gregorianCalendarY.get(3);
                gregorianCalendarY2.get(5);
            } else {
                gregorianCalendarY.get(2);
                gregorianCalendarY2.get(2);
            }
            int i28 = i10 & 12;
            int i29 = ((i10 ^ 12) | i28) << 1;
            int i30 = -((~i28) & (i10 | 12));
            int i31 = (i29 ^ i30) + ((i29 & i30) << 1);
            i10 = (i31 ^ (-13)) + ((i31 & (-13)) << 1);
            int i32 = a;
            int i33 = (((i32 & (-36)) | ((~i32) & 35)) - (~((i32 & 35) << 1))) - 1;
            b = i33 % 128;
            int i34 = i33 % 2;
        }
        double d3 = i10;
        int i35 = a;
        int i36 = ((i35 & 16) + (i35 | 16)) - 1;
        b = i36 % 128;
        if (i36 % 2 == 0) {
            return d3;
        }
        throw null;
    }

    private void saveBeneficiary(String str, String str2, String str3, int i, String str4, String str5, double d2, int i2) {
        int i3 = 2 % 2;
        BeneficiaryEntity beneficiaryEntity = new BeneficiaryEntity();
        int i4 = b;
        int i5 = ((i4 & (-94)) | ((~i4) & 93)) + ((i4 & 93) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        beneficiaryEntity.nic = str;
        beneficiaryEntity.englishName = str2;
        int i7 = (-2) - ((a + 70) ^ (-1));
        b = i7 % 128;
        Object obj = null;
        if (i7 % 2 != 0) {
            beneficiaryEntity.urduName = str3;
            beneficiaryEntity.maritalStatus = i;
            throw null;
        }
        beneficiaryEntity.urduName = str3;
        beneficiaryEntity.maritalStatus = i;
        beneficiaryEntity.gender = str4;
        int i8 = a;
        int i9 = i8 & 85;
        int i10 = (i8 ^ 85) | i9;
        int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
        b = i11 % 128;
        if (i11 % 2 != 0) {
            beneficiaryEntity.age = d2;
            beneficiaryEntity.dob = str5;
            Executors.newSingleThreadExecutor();
            obj.hashCode();
            throw null;
        }
        beneficiaryEntity.age = d2;
        beneficiaryEntity.dob = str5;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        ivas.gov.bisp.enumeration.p042bo.j jVar = new ivas.gov.bisp.enumeration.p042bo.j(this, beneficiaryEntity, 4);
        int i12 = b;
        int i13 = (i12 | 29) << 1;
        int i14 = -(((~i12) & 29) | (i12 & (-30)));
        int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
        a = i15 % 128;
        int i16 = i15 % 2;
        executorServiceNewSingleThreadExecutor.execute(jVar);
        int i17 = a;
        int i18 = i17 & 105;
        int i19 = i18 + ((i17 ^ 105) | i18);
        b = i19 % 128;
        if (i19 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private void showDialog(String str, String str2, final int i) {
        AlertController.OooO0O0 oooO0O0;
        int i2 = 2 % 2;
        b.aIz aiz = new b.aIz(getActivity());
        int i3 = a;
        int i4 = (i3 & (-8)) | ((~i3) & 7);
        int i5 = (i3 & 7) << 1;
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        AlertController.OooO0O0 oooO0O1 = aiz.a;
        oooO0O1.e = str;
        oooO0O1.f = str2;
        oooO0O1.k = true;
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentRoster.3
            private static int a = 1;
            private static int b;

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i8) {
                int i9 = 2 % 2;
                int i10 = b;
                int i11 = i10 & 103;
                int i12 = ((i10 ^ 103) | i11) << 1;
                int i13 = -((i10 | 103) & (~i11));
                int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
                a = i14 % 128;
                int i15 = i14 % 2;
                Object obj = null;
                if (!(!FragmentRoster.access$800(FragmentRoster.this).isShowing())) {
                    int i16 = b;
                    int i17 = i16 & 95;
                    int i18 = -(-(i16 | 95));
                    int i19 = (i17 & i18) + (i18 | i17);
                    a = i19 % 128;
                    if (i19 % 2 == 0) {
                        FragmentRoster.access$800(FragmentRoster.this).dismiss();
                        throw null;
                    }
                    FragmentRoster.access$800(FragmentRoster.this).dismiss();
                    int i20 = a;
                    int i21 = (i20 & (-24)) | ((~i20) & 23);
                    int i22 = -(-((i20 & 23) << 1));
                    int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
                    b = i23 % 128;
                    int i24 = i23 % 2;
                }
                dialogInterface.cancel();
                ActivityBeginSurvey activityBeginSurveyAccess$000 = FragmentRoster.access$000(FragmentRoster.this);
                int i25 = a;
                int i26 = i25 & 111;
                int i27 = i25 | 111;
                int i28 = (i26 & i27) + (i27 | i26);
                b = i28 % 128;
                int i29 = i28 % 2;
                activityBeginSurveyAccess$000.aq.remove(i);
                int i30 = b + 109;
                a = i30 % 128;
                if (i30 % 2 == 0) {
                    FragmentRoster.access$700(FragmentRoster.this);
                    obj.hashCode();
                    throw null;
                }
                AdapterRosterList adapterRosterListAccess$700 = FragmentRoster.access$700(FragmentRoster.this);
                FragmentRoster fragmentRoster = FragmentRoster.this;
                int i31 = b;
                int i32 = i31 & 3;
                int i33 = i32 + ((i31 ^ 3) | i32);
                a = i33 % 128;
                int i34 = i33 % 2;
                adapterRosterListAccess$700.h(FragmentRoster.access$000(fragmentRoster).aq);
                int i35 = a;
                int i36 = i35 & 5;
                int i37 = -(-(i35 | 5));
                int i38 = (i36 ^ i37) + ((i37 & i36) << 1);
                b = i38 % 128;
                int i39 = i38 % 2;
                int i40 = 0;
                boolean z = false;
                while (true) {
                    ArrayList<Roster> arrayList = FragmentRoster.access$000(FragmentRoster.this).aq;
                    int i41 = b + 3;
                    a = i41 % 128;
                    int i42 = i41 % 2;
                    if (i40 >= arrayList.size()) {
                        if (FragmentRoster.access$000(FragmentRoster.this).aq != null) {
                            int i43 = b;
                            int i44 = ((i43 | 19) << 1) - (i43 ^ 19);
                            a = i44 % 128;
                            int i45 = i44 % 2;
                            if (FragmentRoster.access$000(FragmentRoster.this).aq.size() > 0) {
                                int i46 = a;
                                int i47 = i46 & 121;
                                int i48 = -(-((i46 ^ 121) | i47));
                                int i49 = ((i47 | i48) << 1) - (i48 ^ i47);
                                int i50 = i49 % 128;
                                b = i50;
                                int i51 = i49 % 2;
                                if (z) {
                                    int i52 = ((i50 ^ 45) | (i50 & 45)) << 1;
                                    int i53 = -(((~i50) & 45) | (i50 & (-46)));
                                    int i54 = ((i52 | i53) << 1) - (i52 ^ i53);
                                    a = i54 % 128;
                                    int i55 = i54 % 2;
                                    FragmentRoster.access$900(FragmentRoster.this);
                                    if (i55 != 0) {
                                        return;
                                    }
                                    obj.hashCode();
                                    throw null;
                                }
                            }
                        }
                        FragmentRoster.access$1000(FragmentRoster.this);
                        int i56 = a;
                        int i57 = (i56 & 71) + (i56 | 71);
                        b = i57 % 128;
                        if (i57 % 2 != 0) {
                            int i58 = 31 / 0;
                            return;
                        }
                        return;
                    }
                    int i59 = b;
                    int i60 = i59 ^ 89;
                    int i61 = (((i59 & 89) | i60) << 1) - i60;
                    a = i61 % 128;
                    if (i61 % 2 == 0) {
                        FragmentRoster.access$000(FragmentRoster.this).aq.get(i40);
                        throw null;
                    }
                    if (FragmentRoster.access$000(FragmentRoster.this).aq.get(i40).relation_to_household_id == 186) {
                        int i62 = b;
                        int i63 = i62 & 33;
                        int i64 = -(-((i62 ^ 33) | i63));
                        int i65 = (i63 & i64) + (i64 | i63);
                        int i66 = i65 % 128;
                        a = i66;
                        int i67 = i65 % 2;
                        int i68 = ((i66 | 115) << 1) - (i66 ^ 115);
                        b = i68 % 128;
                        int i69 = i68 % 2;
                        z = true;
                    }
                    i40 = ((i40 ^ 2) + ((i40 & 2) << 1)) - 1;
                    int i70 = a;
                    int i71 = ((i70 | 71) << 1) - (i70 ^ 71);
                    b = i71 % 128;
                    int i72 = i71 % 2;
                }
            }
        };
        int i8 = b;
        int i9 = (((i8 & (-102)) | ((~i8) & REQUEST_CODE_ROSTER_ADD)) - (~(-(-((i8 & REQUEST_CODE_ROSTER_ADD) << 1))))) - 1;
        a = i9 % 128;
        int i10 = i9 % 2;
        AlertController.OooO0O0 oooO0O2 = aiz.a;
        oooO0O2.h = "Yes";
        oooO0O2.i = onClickListener;
        DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentRoster.4
            private static int a = 1;
            private static int b;

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i11) {
                int i12 = 2 % 2;
                int i13 = b;
                int i14 = i13 & 103;
                int i15 = i13 | 103;
                int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
                a = i16 % 128;
                int i17 = i16 % 2;
                dialogInterface.cancel();
                int i18 = b;
                int i19 = ((i18 | 4) << 1) - (i18 ^ 4);
                int i20 = (i19 ^ (-1)) + (i19 << 1);
                a = i20 % 128;
                if (i20 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
        int i11 = a;
        int i12 = i11 & 49;
        int i13 = (((i11 | 49) & (~i12)) - (~(-(-(i12 << 1))))) - 1;
        b = i13 % 128;
        if (i13 % 2 != 0) {
            oooO0O0 = aiz.a;
            oooO0O0.a = "No";
            int i14 = 27 / 0;
        } else {
            oooO0O0 = aiz.a;
            oooO0O0.a = "No";
        }
        int i15 = a;
        int i16 = i15 ^ 67;
        int i17 = (i15 & 67) << 1;
        int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
        b = i18 % 128;
        int i19 = i18 % 2;
        oooO0O0.j = onClickListener2;
        aiz.b().show();
        int i20 = b;
        int i21 = i20 & 115;
        int i22 = -(-((i20 ^ 115) | i21));
        int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
        a = i23 % 128;
        int i24 = i23 % 2;
    }

    @Override // android.app.Fragment
    public void onResume() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 89) + ((i2 & 89) << 1);
        int i4 = i3 % 128;
        a = i4;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        AdapterRosterList adapterRosterList = this.mAdapter;
        if (adapterRosterList != null) {
            int i5 = (i4 & (-30)) | ((~i4) & 29);
            int i6 = (i4 & 29) << 1;
            int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
            b = i7 % 128;
            int i8 = i7 % 2;
            adapterRosterList.h(this.activityBeginSurvey.aq);
            int i9 = a;
            int i10 = i9 & 35;
            int i11 = i10 + ((i9 ^ 35) | i10);
            b = i11 % 128;
            int i12 = i11 % 2;
        }
        super.onResume();
        int i13 = b + 83;
        a = i13 % 128;
        int i14 = i13 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0046 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0048  */
    /* JADX WARN: Code duplicated, block: B:18:0x0057  */
    /* JADX WARN: Code duplicated, block: B:21:0x006b  */
    /* JADX WARN: Code duplicated, block: B:23:0x007c  */
    /* JADX WARN: Code duplicated, block: B:26:0x008c  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0098 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0098 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b6 A[SYNTHETIC] */
    @Override // ivas.gov.bisp.enumeration.X.e
    public void parseJson() {
        int i;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = b + 73;
        a = i5 % 128;
        int i6 = i5 % 2;
        ActivityBeginSurvey activityBeginSurvey = this.activityBeginSurvey;
        ArrayList<Roster> arrayList = activityBeginSurvey.aq;
        int i7 = activityBeginSurvey.ac;
        int i8 = a;
        int i9 = i8 & 41;
        int i10 = -(-((i8 ^ 41) | i9));
        int i11 = (i9 ^ i10) + ((i9 & i10) << 1);
        b = i11 % 128;
        Object obj = null;
        if (i11 % 2 == 0 ? i7 == 1 : i7 == 1) {
            if (arrayList != null) {
                int i12 = a + 103;
                b = i12 % 128;
                int i13 = i12 % 2;
                if (arrayList.size() > 0) {
                    int i14 = b;
                    int i15 = ((i14 | 67) << 1) - (i14 ^ 67);
                    a = i15 % 128;
                    int i16 = i15 % 2;
                    i = 0;
                    while (true) {
                        if (i < arrayList.size()) {
                            int i17 = b;
                            i2 = ((i17 | 111) << 1) - (i17 ^ 111);
                            a = i2 % 128;
                            if (i2 % 2 == 0) {
                                int i18 = 72 / 0;
                                if (arrayList.get(i).age < 18.0d) {
                                    i3 = a + 17;
                                    b = i3 % 128;
                                    if (i3 % 2 == 0) {
                                        this.activityBeginSurvey.aG.complete_form = "no";
                                        return;
                                    } else {
                                        this.activityBeginSurvey.aG.complete_form = "no";
                                        obj.hashCode();
                                        throw null;
                                    }
                                }
                                this.activityBeginSurvey.aG.complete_form = "yes";
                                i++;
                                int i19 = a;
                                int i20 = i19 & 61;
                                int i21 = (i19 ^ 61) | i20;
                                int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
                                b = i22 % 128;
                                int i23 = i22 % 2;
                            } else {
                                if (arrayList.get(i).age < 18.0d) {
                                    i3 = a + 17;
                                    b = i3 % 128;
                                    if (i3 % 2 == 0) {
                                        this.activityBeginSurvey.aG.complete_form = "no";
                                        return;
                                    } else {
                                        this.activityBeginSurvey.aG.complete_form = "no";
                                        obj.hashCode();
                                        throw null;
                                    }
                                }
                                this.activityBeginSurvey.aG.complete_form = "yes";
                                i++;
                                int i110 = a;
                                int i24 = i110 & 61;
                                int i25 = (i110 ^ 61) | i24;
                                int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
                                b = i26 % 128;
                                int i27 = i26 % 2;
                            }
                        }
                    }
                }
            }
        } else if (i7 != 2) {
            int i28 = i8 + 111;
            b = i28 % 128;
            if (i28 % 2 != 0) {
                int i29 = 69 / 0;
                if (ag.d) {
                    if (arrayList != null) {
                        int i111 = a + 103;
                        b = i111 % 128;
                        int i112 = i111 % 2;
                        if (arrayList.size() > 0) {
                            int i113 = b;
                            int i114 = ((i113 | 67) << 1) - (i113 ^ 67);
                            a = i114 % 128;
                            int i115 = i114 % 2;
                            i = 0;
                            while (true) {
                                if (i < arrayList.size()) {
                                    int i116 = b;
                                    i2 = ((i116 | 111) << 1) - (i116 ^ 111);
                                    a = i2 % 128;
                                    if (i2 % 2 == 0) {
                                        int i117 = 72 / 0;
                                        if (arrayList.get(i).age < 18.0d) {
                                            i3 = a + 17;
                                            b = i3 % 128;
                                            if (i3 % 2 == 0) {
                                                this.activityBeginSurvey.aG.complete_form = "no";
                                                return;
                                            } else {
                                                this.activityBeginSurvey.aG.complete_form = "no";
                                                obj.hashCode();
                                                throw null;
                                            }
                                        }
                                        this.activityBeginSurvey.aG.complete_form = "yes";
                                        i++;
                                        int i118 = a;
                                        int i210 = i118 & 61;
                                        int i211 = (i118 ^ 61) | i210;
                                        int i212 = (i210 ^ i211) + ((i211 & i210) << 1);
                                        b = i212 % 128;
                                        int i213 = i212 % 2;
                                    } else {
                                        if (arrayList.get(i).age < 18.0d) {
                                            i3 = a + 17;
                                            b = i3 % 128;
                                            if (i3 % 2 == 0) {
                                                this.activityBeginSurvey.aG.complete_form = "no";
                                                return;
                                            } else {
                                                this.activityBeginSurvey.aG.complete_form = "no";
                                                obj.hashCode();
                                                throw null;
                                            }
                                        }
                                        this.activityBeginSurvey.aG.complete_form = "yes";
                                        i++;
                                        int i119 = a;
                                        int i214 = i119 & 61;
                                        int i215 = (i119 ^ 61) | i214;
                                        int i216 = (i214 ^ i215) + ((i215 & i214) << 1);
                                        b = i216 % 128;
                                        int i217 = i216 % 2;
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (ag.d) {
                if (arrayList != null) {
                    int i1110 = a + 103;
                    b = i1110 % 128;
                    int i1111 = i1110 % 2;
                    if (arrayList.size() > 0) {
                        int i1112 = b;
                        int i1113 = ((i1112 | 67) << 1) - (i1112 ^ 67);
                        a = i1113 % 128;
                        int i1114 = i1113 % 2;
                        i = 0;
                        while (true) {
                            if (i < arrayList.size()) {
                                int i1115 = b;
                                i2 = ((i1115 | 111) << 1) - (i1115 ^ 111);
                                a = i2 % 128;
                                if (i2 % 2 == 0) {
                                    int i1116 = 72 / 0;
                                    if (arrayList.get(i).age < 18.0d) {
                                        i3 = a + 17;
                                        b = i3 % 128;
                                        if (i3 % 2 == 0) {
                                            this.activityBeginSurvey.aG.complete_form = "no";
                                            return;
                                        } else {
                                            this.activityBeginSurvey.aG.complete_form = "no";
                                            obj.hashCode();
                                            throw null;
                                        }
                                    }
                                    this.activityBeginSurvey.aG.complete_form = "yes";
                                    i++;
                                    int i1117 = a;
                                    int i218 = i1117 & 61;
                                    int i219 = (i1117 ^ 61) | i218;
                                    int i2110 = (i218 ^ i219) + ((i219 & i218) << 1);
                                    b = i2110 % 128;
                                    int i2111 = i2110 % 2;
                                } else {
                                    if (arrayList.get(i).age < 18.0d) {
                                        i3 = a + 17;
                                        b = i3 % 128;
                                        if (i3 % 2 == 0) {
                                            this.activityBeginSurvey.aG.complete_form = "no";
                                            return;
                                        } else {
                                            this.activityBeginSurvey.aG.complete_form = "no";
                                            obj.hashCode();
                                            throw null;
                                        }
                                    }
                                    this.activityBeginSurvey.aG.complete_form = "yes";
                                    i++;
                                    int i1118 = a;
                                    int i2112 = i1118 & 61;
                                    int i2113 = (i1118 ^ 61) | i2112;
                                    int i2114 = (i2112 ^ i2113) + ((i2113 & i2112) << 1);
                                    b = i2114 % 128;
                                    int i2115 = i2114 % 2;
                                }
                            }
                        }
                    }
                }
            }
        } else if (arrayList != null) {
            int i1119 = a + 103;
            b = i1119 % 128;
            int i11110 = i1119 % 2;
            if (arrayList.size() > 0) {
                int i11111 = b;
                int i11112 = ((i11111 | 67) << 1) - (i11111 ^ 67);
                a = i11112 % 128;
                int i11113 = i11112 % 2;
                i = 0;
                while (true) {
                    if (i < arrayList.size()) {
                        int i11114 = b;
                        i2 = ((i11114 | 111) << 1) - (i11114 ^ 111);
                        a = i2 % 128;
                        if (i2 % 2 == 0) {
                            int i11115 = 72 / 0;
                            if (arrayList.get(i).age < 18.0d) {
                                i3 = a + 17;
                                b = i3 % 128;
                                if (i3 % 2 == 0) {
                                    this.activityBeginSurvey.aG.complete_form = "no";
                                    return;
                                } else {
                                    this.activityBeginSurvey.aG.complete_form = "no";
                                    obj.hashCode();
                                    throw null;
                                }
                            }
                            this.activityBeginSurvey.aG.complete_form = "yes";
                            i++;
                            int i11116 = a;
                            int i2116 = i11116 & 61;
                            int i2117 = (i11116 ^ 61) | i2116;
                            int i2118 = (i2116 ^ i2117) + ((i2117 & i2116) << 1);
                            b = i2118 % 128;
                            int i2119 = i2118 % 2;
                        } else {
                            if (arrayList.get(i).age < 18.0d) {
                                i3 = a + 17;
                                b = i3 % 128;
                                if (i3 % 2 == 0) {
                                    this.activityBeginSurvey.aG.complete_form = "no";
                                    return;
                                } else {
                                    this.activityBeginSurvey.aG.complete_form = "no";
                                    obj.hashCode();
                                    throw null;
                                }
                            }
                            this.activityBeginSurvey.aG.complete_form = "yes";
                            i++;
                            int i11117 = a;
                            int i21110 = i11117 & 61;
                            int i21111 = (i11117 ^ 61) | i21110;
                            int i21112 = (i21110 ^ i21111) + ((i21111 & i21110) << 1);
                            b = i21112 % 128;
                            int i21113 = i21112 % 2;
                        }
                    }
                }
            }
        }
        int i30 = a;
        int i31 = (-2) - (((i30 ^ 112) + ((i30 & 112) << 1)) ^ (-1));
        b = i31 % 128;
        if (i31 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004b, code lost:
    
        if ((r3 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004d, code lost:
    
        r15.setError("English name is required");
        r15.requestFocus();
        r0 = 61 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0058, code lost:
    
        r15.setError("English name is required");
        r15.requestFocus();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005e, code lost:
    
        r0 = ivas.gov.bisp.enumeration.fragments.FragmentRoster.b;
        r2 = r0 & 25;
        r0 = -(-((r0 ^ 25) | r2));
        r3 = (r2 ^ r0) + ((r0 & r2) << 1);
        ivas.gov.bisp.enumeration.fragments.FragmentRoster.a = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0071, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0072, code lost:
    
        r6 = r2;
        r0 = ivas.gov.bisp.enumeration.fragments.FragmentRoster.a;
        r2 = ((r0 | 126) << 1) - (r0 ^ 126);
        r0 = (r2 ^ (-1)) + (r2 << 1);
        ivas.gov.bisp.enumeration.fragments.FragmentRoster.b = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0084, code lost:
    
        if ((r0 % 2) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0086, code lost:
    
        saveBeneficiary(r16, r6, r17, r18, r19, r20, r21, r23);
        r24.dismiss();
        r0 = 95 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a0, code lost:
    
        saveBeneficiary(r16, r6, r17, r18, r19, r20, r21, r23);
        r24.dismiss();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b5, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0029, code lost:
    
        if (r2.isEmpty() != true) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0034, code lost:
    
        if (r2.isEmpty() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
    
        r2 = ivas.gov.bisp.enumeration.fragments.FragmentRoster.a;
        r3 = (((r2 ^ 1) | (r2 & 1)) << 1) - (((~r2) & 1) | (r2 & (-2)));
        ivas.gov.bisp.enumeration.fragments.FragmentRoster.b = r3 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private /* synthetic */ void lambda$setValidationDataToMainModel$3(android.widget.EditText r15, java.lang.String r16, java.lang.String r17, int r18, java.lang.String r19, java.lang.String r20, double r21, int r23, android.app.AlertDialog r24, android.view.View r25) {
        /*
            r14 = this;
            r0 = r15
            r1 = 2
            int r2 = r1 % r1
            int r2 = ivas.gov.bisp.enumeration.fragments.FragmentRoster.b
            r3 = r2 ^ 31
            r4 = r2 & 31
            r3 = r3 | r4
            r5 = 1
            int r3 = r3 << r5
            int r4 = ~r4
            r2 = r2 | 31
            r2 = r2 & r4
            int r2 = -r2
            r4 = r3 | r2
            int r4 = r4 << r5
            r2 = r2 ^ r3
            int r4 = r4 - r2
            int r2 = r4 % 128
            ivas.gov.bisp.enumeration.fragments.FragmentRoster.a = r2
            int r4 = r4 % r1
            if (r4 != 0) goto L2c
            java.lang.String r2 = ivas.gov.bisp.enumeration.p091n.j.m(r15)
            boolean r3 = r2.isEmpty()
            r4 = 4
            int r4 = r4 / 0
            if (r3 == r5) goto L36
            goto L72
        L2c:
            java.lang.String r2 = ivas.gov.bisp.enumeration.p091n.j.m(r15)
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L72
        L36:
            int r2 = ivas.gov.bisp.enumeration.fragments.FragmentRoster.a
            r3 = r2 ^ 1
            r4 = r2 & 1
            r3 = r3 | r4
            int r3 = r3 << r5
            r4 = r2 & (-2)
            int r2 = ~r2
            r2 = r2 & r5
            r2 = r2 | r4
            int r3 = r3 - r2
            int r2 = r3 % 128
            ivas.gov.bisp.enumeration.fragments.FragmentRoster.b = r2
            int r3 = r3 % r1
            java.lang.String r2 = "English name is required"
            if (r3 == 0) goto L58
            r15.setError(r2)
            r15.requestFocus()
            r0 = 61
            int r0 = r0 / 0
            goto L5e
        L58:
            r15.setError(r2)
            r15.requestFocus()
        L5e:
            int r0 = ivas.gov.bisp.enumeration.fragments.FragmentRoster.b
            r2 = r0 & 25
            r0 = r0 ^ 25
            r0 = r0 | r2
            int r0 = -r0
            int r0 = -r0
            r3 = r2 ^ r0
            r0 = r0 & r2
            int r0 = r0 << r5
            int r3 = r3 + r0
            int r0 = r3 % 128
            ivas.gov.bisp.enumeration.fragments.FragmentRoster.a = r0
            int r3 = r3 % r1
            return
        L72:
            r6 = r2
            int r0 = ivas.gov.bisp.enumeration.fragments.FragmentRoster.a
            r2 = r0 | 126(0x7e, float:1.77E-43)
            int r2 = r2 << r5
            r0 = r0 ^ 126(0x7e, float:1.77E-43)
            int r2 = r2 - r0
            r0 = r2 ^ (-1)
            int r2 = r2 << r5
            int r0 = r0 + r2
            int r2 = r0 % 128
            ivas.gov.bisp.enumeration.fragments.FragmentRoster.b = r2
            int r0 = r0 % r1
            if (r0 == 0) goto La0
            r4 = r14
            r5 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            r11 = r21
            r13 = r23
            r4.saveBeneficiary(r5, r6, r7, r8, r9, r10, r11, r13)
            r24.dismiss()
            r0 = 95
            int r0 = r0 / 0
            goto Lb5
        La0:
            r4 = r14
            r5 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            r11 = r21
            r13 = r23
            r4.saveBeneficiary(r5, r6, r7, r8, r9, r10, r11, r13)
            r24.dismiss()
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.fragments.FragmentRoster.lambda$setValidationDataToMainModel$3(android.widget.EditText, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, double, int, android.app.AlertDialog, android.view.View):void");
    }

    private void createValidateCNICJson(String str) {
        int i = 2 % 2;
        String strReplace = str.replace("-", BuildConfig.FLAVOR);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        int i2 = a;
        int i3 = ((i2 & 73) - (~(i2 | 73))) - 1;
        b = i3 % 128;
        Object obj = null;
        try {
            if (i3 % 2 != 0) {
                jSONObject.put("Cnic", strReplace);
                String str2 = BISPApplication.c().s;
                throw null;
            }
            jSONObject.put("Cnic", strReplace);
            String str3 = BISPApplication.c().s;
            int i4 = b;
            int i5 = ((i4 & 90) + (i4 | 90)) - 1;
            a = i5 % 128;
            if (i5 % 2 == 0) {
                jSONObject.put("SessionId", str3);
            } else {
                jSONObject.put("SessionId", str3);
            }
            jSONObject.put("IpAddress", ac.h(true));
            jSONObject.put("sessionUserCnic", this.sessionManager.r());
            jSONObject.put("call_origin", REQUEST_CODE_ROSTER_EDIT);
            int i6 = a + 45;
            b = i6 % 128;
            int i7 = i6 % 2;
            String string = jSONObject.toString();
            byte[] bArrB = ivas.gov.bisp.enumeration.bK.b.b(this.sessionManager.k());
            SessionManager sessionManager = this.sessionManager;
            int i8 = a;
            int i9 = (i8 ^ 47) + ((i8 & 47) << 1);
            b = i9 % 128;
            int i10 = i9 % 2;
            String strD = ivas.gov.bisp.enumeration.bK.b.d(string, bArrB, ivas.gov.bisp.enumeration.bK.b.b(sessionManager.m()));
            int i11 = b;
            int i12 = i11 & 73;
            int i13 = -(-((i11 ^ 73) | i12));
            int i14 = (i12 & i13) + (i13 | i12);
            a = i14 % 128;
            if (i14 % 2 == 0) {
                jSONObject2.put("string1", strD);
                ax.h(this.mProgressBar, "Please wait!");
                throw null;
            }
            jSONObject2.put("string1", strD);
            ax.h(this.mProgressBar, "Please wait!");
            this.progressBar.setVisibility(0);
            requestCNICVerify(jSONObject2);
            int i15 = a + 7;
            b = i15 % 128;
            if (i15 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        } catch (JSONException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0087  */
    /* JADX WARN: Code duplicated, block: B:19:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:21:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:23:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:25:0x010d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0116  */
    /* JADX WARN: Code duplicated, block: B:29:0x011d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0125  */
    private void onlineNadraRostercall(int i, String str) {
        Roster roster;
        Intent intent;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        int i7 = a;
        int i8 = ((i7 | 71) << 1) - (i7 ^ 71);
        b = i8 % 128;
        Object obj = null;
        if (i8 % 2 != 0) {
            this.activityBeginSurvey.aq.get(i).isValidatedFromNadra();
            obj.hashCode();
            throw null;
        }
        if (this.activityBeginSurvey.aq.get(i).isValidatedFromNadra()) {
            int i9 = b;
            int i10 = i9 & 17;
            int i11 = (i9 ^ 17) | i10;
            int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
            a = i12 % 128;
            int i13 = i12 % 2;
            if (this.activityBeginSurvey.aq.get(i).date_of_birth != null) {
                int i14 = b;
                int i15 = i14 & 55;
                int i16 = ((i14 ^ 55) | i15) << 1;
                int i17 = -((i14 | 55) & (~i15));
                int i18 = (i16 & i17) + (i17 | i16);
                a = i18 % 128;
                if (i18 % 2 == 0) {
                    this.activityBeginSurvey.aq.get(i);
                    throw null;
                }
                Roster roster2 = this.activityBeginSurvey.aq.get(i);
                int i19 = a + 11;
                b = i19 % 128;
                if (i19 % 2 != 0) {
                    int i20 = 88 / 0;
                    if (!TextUtils.isEmpty(roster2.date_of_birth)) {
                        roster = this.activityBeginSurvey.aq.get(i);
                        int i21 = b;
                        int i22 = (((i21 & (-52)) | ((~i21) & 51)) - (~(-(-((i21 & 51) << 1))))) - 1;
                        a = i22 % 128;
                        int i23 = i22 % 2;
                        if (!roster.date_of_birth.equals("null")) {
                            intent = new Intent(getActivity(), (Class<?>) ActivityRoster.class);
                            int i24 = b;
                            int i25 = i24 & 109;
                            int i26 = (i24 | 109) & (~i25);
                            int i27 = -(-(i25 << 1));
                            i2 = ((i26 | i27) << 1) - (i26 ^ i27);
                            a = i2 % 128;
                            if (i2 % 2 != 0) {
                                intent.putExtra("rosterPosition", i);
                                intent.putExtra("rosterPositionCnic", str);
                                throw null;
                            }
                            intent.putExtra("rosterPosition", i);
                            intent.putExtra("rosterPositionCnic", str);
                            int i28 = a;
                            i3 = (i28 ^ 55) + ((i28 & 55) << 1);
                            b = i3 % 128;
                            if (i3 % 2 == 0) {
                                intent.putExtra("roster_list", this.activityBeginSurvey.aq);
                                throw null;
                            }
                            intent.putExtra("roster_list", this.activityBeginSurvey.aq);
                            int i29 = a;
                            int i30 = (i29 & (-104)) | ((~i29) & 103);
                            int i31 = (i29 & 103) << 1;
                            i4 = ((i30 | i31) << 1) - (i31 ^ i30);
                            b = i4 % 128;
                            if (i4 % 2 != 0) {
                                intent.putExtra("is_edit", false);
                                i5 = 48;
                            } else {
                                intent.putExtra("is_edit", true);
                                i5 = REQUEST_CODE_ROSTER_EDIT;
                            }
                            startActivityForResult(intent, i5);
                            return;
                        }
                    }
                } else if (!TextUtils.isEmpty(roster2.date_of_birth)) {
                    roster = this.activityBeginSurvey.aq.get(i);
                    int i210 = b;
                    int i211 = (((i210 & (-52)) | ((~i210) & 51)) - (~(-(-((i210 & 51) << 1))))) - 1;
                    a = i211 % 128;
                    int i212 = i211 % 2;
                    if (!roster.date_of_birth.equals("null")) {
                        intent = new Intent(getActivity(), (Class<?>) ActivityRoster.class);
                        int i213 = b;
                        int i214 = i213 & 109;
                        int i215 = (i213 | 109) & (~i214);
                        int i216 = -(-(i214 << 1));
                        i2 = ((i215 | i216) << 1) - (i215 ^ i216);
                        a = i2 % 128;
                        if (i2 % 2 != 0) {
                            intent.putExtra("rosterPosition", i);
                            intent.putExtra("rosterPositionCnic", str);
                            throw null;
                        }
                        intent.putExtra("rosterPosition", i);
                        intent.putExtra("rosterPositionCnic", str);
                        int i217 = a;
                        i3 = (i217 ^ 55) + ((i217 & 55) << 1);
                        b = i3 % 128;
                        if (i3 % 2 == 0) {
                            intent.putExtra("roster_list", this.activityBeginSurvey.aq);
                            throw null;
                        }
                        intent.putExtra("roster_list", this.activityBeginSurvey.aq);
                        int i218 = a;
                        int i32 = (i218 & (-104)) | ((~i218) & 103);
                        int i33 = (i218 & 103) << 1;
                        i4 = ((i32 | i33) << 1) - (i33 ^ i32);
                        b = i4 % 128;
                        if (i4 % 2 != 0) {
                            intent.putExtra("is_edit", false);
                            i5 = 48;
                        } else {
                            intent.putExtra("is_edit", true);
                            i5 = REQUEST_CODE_ROSTER_EDIT;
                        }
                        startActivityForResult(intent, i5);
                        return;
                    }
                }
                showDialog("Data Missing", "Citizen Data not fetched against this CNIC. Do you want try again?", i);
                int i34 = b + 47;
                a = i34 % 128;
                int i35 = i34 % 2;
                return;
            }
        } else {
            showDialog("Data Validation", "Citizen Data not verified against this CNIC.");
            int i36 = a;
            int i37 = (i36 ^ 88) + ((i36 & 88) << 1);
            int i38 = (i37 ^ (-1)) + (i37 << 1);
            b = i38 % 128;
            int i39 = i38 % 2;
        }
        int i40 = b;
        int i41 = ((i40 | 83) << 1) - (((~i40) & 83) | (i40 & (-84)));
        a = i41 % 128;
        int i42 = i41 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0060  */
    private void lambda$onCreateView$1(View view) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 39;
        int i4 = i3 + ((i2 ^ 39) | i3);
        a = i4 % 128;
        int i5 = i4 % 2;
        int i6 = ((i2 & 4) + (i2 | 4)) - 1;
        a = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 4 / 3;
        }
        int i8 = 0;
        boolean z = false;
        while (i8 < this.activityBeginSurvey.aq.size()) {
            int i9 = a + 7;
            b = i9 % 128;
            int i10 = i9 % 2;
            Roster roster = this.activityBeginSurvey.aq.get(i8);
            int i11 = b;
            int i12 = i11 & 103;
            int i13 = -(-((i11 ^ 103) | i12));
            int i14 = (i12 & i13) + (i13 | i12);
            a = i14 % 128;
            if (i14 % 2 == 0) {
                if (roster.relation_to_household_id == 829) {
                    int i15 = a;
                    int i16 = ((i15 | 95) << 1) - (((~i15) & 95) | (i15 & (-96)));
                    int i17 = i16 % 128;
                    b = i17;
                    int i18 = i16 % 2;
                    int i19 = i17 + 95;
                    a = i19 % 128;
                    int i20 = i19 % 2;
                    z = true;
                }
            } else if (roster.relation_to_household_id == 186) {
                int i110 = a;
                int i111 = ((i110 | 95) << 1) - (((~i110) & 95) | (i110 & (-96)));
                int i112 = i111 % 128;
                b = i112;
                int i113 = i111 % 2;
                int i114 = i112 + 95;
                a = i114 % 128;
                int i21 = i114 % 2;
                z = true;
            }
            int i22 = (i8 & (-2)) | ((~i8) & 1);
            int i23 = (i8 & 1) << 1;
            i8 = (i23 | i22) + (i22 & i23);
            int i24 = b;
            int i25 = (i24 ^ 19) + ((i24 & 19) << 1);
            a = i25 % 128;
            int i26 = i25 % 2;
        }
        ArrayList<Roster> arrayList = this.activityBeginSurvey.aq;
        if (arrayList != null) {
            int i27 = b + 119;
            a = i27 % 128;
            Object obj = null;
            if (i27 % 2 == 0) {
                arrayList.size();
                throw null;
            }
            if (arrayList.size() > 0) {
                int i28 = b;
                int i29 = i28 & 29;
                int i30 = i28 | 29;
                int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
                a = i31 % 128;
                if (i31 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                if (z) {
                    addNadraRoster();
                    int i32 = a;
                    int i33 = i32 & 47;
                    int i34 = (i32 ^ 47) | i33;
                    int i35 = ((i33 | i34) << 1) - (i34 ^ i33);
                    b = i35 % 128;
                    if (i35 % 2 != 0) {
                        throw null;
                    }
                    return;
                }
            }
        }
        addNadraHouseHold();
        int i36 = a;
        int i37 = i36 & 71;
        int i38 = (i36 ^ 71) | i37;
        int i39 = (i37 & i38) + (i38 | i37);
        b = i39 % 128;
        int i40 = i39 % 2;
    }

    private void addNadraRoster() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 73;
        int i4 = -(-(i2 | 73));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        if (!ag.f71o) {
            int i7 = a;
            int i8 = ((i7 & (-64)) | ((~i7) & 63)) + ((i7 & 63) << 1);
            b = i8 % 128;
            int i9 = i8 % 2;
            ag.p = true;
            int i10 = b;
            int i11 = i10 & 29;
            int i12 = ((i10 ^ 29) | i11) << 1;
            int i13 = -((i10 | 29) & (~i11));
            int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
            a = i14 % 128;
            int i15 = i14 % 2;
        }
        if (ag.f.equals(BuildConfig.FLAVOR)) {
            cnicDialog();
            int i16 = a;
            int i17 = (i16 | 93) << 1;
            int i18 = -(((~i16) & 93) | (i16 & (-94)));
            int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
            b = i19 % 128;
            int i20 = i19 % 2;
            return;
        }
        Intent intent = new Intent(getActivity(), (Class<?>) NewFormNadraRoster.class);
        int i21 = b + 109;
        a = i21 % 128;
        if (i21 % 2 == 0) {
            intent.putExtra("survey", this.activityBeginSurvey.aG);
            int i22 = 73 / 0;
        } else {
            intent.putExtra("survey", this.activityBeginSurvey.aG);
        }
        intent.putExtra("cnic", ag.f);
        intent.putExtra("is_edit", false);
        int i23 = a;
        int i24 = (i23 & 5) + (i23 | 5);
        b = i24 % 128;
        int i25 = i24 % 2;
        intent.putExtra("roster_list", this.activityBeginSurvey.aq);
        int i26 = a;
        int i27 = i26 & 59;
        int i28 = (i26 ^ 59) | i27;
        int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
        b = i29 % 128;
        startActivityForResult(intent, i29 % 2 != 0 ? 13 : REQUEST_NADRA_CODE_ROSTER_ADD);
        int i30 = b + 94;
        int i31 = (i30 ^ (-1)) + (i30 << 1);
        a = i31 % 128;
        if (i31 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0126  */
    /* JADX WARN: Code duplicated, block: B:31:0x0142  */
    @Override // android.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = 2 % 2;
        int i4 = b + 13;
        a = i4 % 128;
        int i5 = i4 % 2;
        super.onActivityResult(i, i2, intent);
        Object obj = null;
        switch (i) {
            case REQUEST_CODE_ROSTER_EDIT /* 100 */:
                getActivity();
                if (i2 == -1) {
                    int i6 = b;
                    int i7 = (i6 & 23) + (i6 | 23);
                    a = i7 % 128;
                    if (i7 % 2 == 0) {
                        throw null;
                    }
                    Roster roster = (Roster) intent.getSerializableExtra("roster");
                    int i8 = b;
                    int i9 = i8 & 99;
                    int i10 = (i9 - (~((i8 ^ 99) | i9))) - 1;
                    a = i10 % 128;
                    if (i10 % 2 == 0) {
                        intent.getIntExtra("position", -1);
                        intent.getStringExtra("positionNic");
                        obj.hashCode();
                        throw null;
                    }
                    int intExtra = intent.getIntExtra("position", -1);
                    String stringExtra = intent.getStringExtra("positionNic");
                    if (intent.getBooleanExtra("household_age", false)) {
                        ArrayList<Roster> arrayList = new ArrayList<>();
                        arrayList.add(roster);
                        int i11 = b;
                        int i12 = ((i11 | 29) << 1) - (i11 ^ 29);
                        a = i12 % 128;
                        if (i12 % 2 != 0) {
                            this.activityBeginSurvey.aq = arrayList;
                            return;
                        } else {
                            this.activityBeginSurvey.aq = arrayList;
                            obj.hashCode();
                            throw null;
                        }
                    }
                    if (intExtra != -1) {
                        int i13 = a;
                        int i14 = i13 & 47;
                        int i15 = (i13 | 47) & (~i14);
                        int i16 = -(-(i14 << 1));
                        int i17 = ((i15 | i16) << 1) - (i15 ^ i16);
                        b = i17 % 128;
                        if (i17 % 2 != 0) {
                            String str = roster.cnic;
                            throw null;
                        }
                        if (stringExtra.equals(roster.cnic.replaceAll("-", BuildConfig.FLAVOR))) {
                            int i18 = b + 67;
                            a = i18 % 128;
                            if (i18 % 2 == 0) {
                                this.activityBeginSurvey.aq.set(intExtra, roster);
                                int i19 = 95 / 0;
                            } else {
                                this.activityBeginSurvey.aq.set(intExtra, roster);
                            }
                            int i20 = b;
                            int i21 = (i20 & 119) + (i20 | 119);
                            a = i21 % 128;
                            int i22 = i21 % 2;
                        }
                    }
                }
                break;
            case REQUEST_CODE_ROSTER_ADD /* 101 */:
                getActivity();
                if (i2 == -1) {
                    int i23 = a + 99;
                    b = i23 % 128;
                    if (i23 % 2 != 0) {
                        throw null;
                    }
                    Roster roster2 = (Roster) intent.getSerializableExtra("roster");
                    int i24 = a;
                    int i25 = i24 & 103;
                    int i26 = -(-((i24 ^ 103) | i25));
                    int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
                    b = i27 % 128;
                    if (i27 % 2 == 0) {
                        this.activityBeginSurvey.aq.add(roster2);
                        return;
                    } else {
                        this.activityBeginSurvey.aq.add(roster2);
                        throw null;
                    }
                }
                break;
            case REQUEST_NADRA_CODE_ROSTER_ADD /* 102 */:
                getActivity();
                if (i2 == -1) {
                    int i28 = b;
                    int i29 = (i28 & 41) + (i28 | 41);
                    a = i29 % 128;
                    int i30 = i29 % 2;
                    ArrayList<Roster> arrayList2 = (ArrayList) intent.getSerializableExtra("roster");
                    if (arrayList2.size() > 0) {
                        int i31 = b;
                        int i32 = i31 | 99;
                        int i33 = ((i32 << 1) - (~(-(i32 & (~(i31 & 99)))))) - 1;
                        a = i33 % 128;
                        int i34 = i33 % 2;
                        int i35 = i31 ^ 37;
                        int i36 = ((i31 & 37) | i35) << 1;
                        int i37 = -i35;
                        int i38 = ((i36 | i37) << 1) - (i36 ^ i37);
                        a = i38 % 128;
                        int i39 = i38 % 2;
                        int i40 = 0;
                        boolean z = false;
                        while (i40 < this.activityBeginSurvey.aq.size()) {
                            int i41 = a;
                            int i42 = i41 & 5;
                            int i43 = -(-((i41 ^ 5) | i42));
                            int i44 = ((i42 | i43) << 1) - (i43 ^ i42);
                            b = i44 % 128;
                            if (i44 % 2 != 0) {
                                this.activityBeginSurvey.aq.get(i40);
                                obj.hashCode();
                                throw null;
                            }
                            Roster roster3 = this.activityBeginSurvey.aq.get(i40);
                            int i45 = b;
                            int i46 = ((i45 | 81) << 1) - (((~i45) & 81) | (i45 & (-82)));
                            a = i46 % 128;
                            int i47 = i46 % 2;
                            if (roster3.relation_to_household_id == 186) {
                                int i48 = b;
                                int i49 = ((i48 ^ 60) + ((i48 & 60) << 1)) - 1;
                                a = i49 % 128;
                                int i50 = i49 % 2;
                                int i51 = ((i48 ^ 41) | (i48 & 41)) << 1;
                                int i52 = -(((~i48) & 41) | (i48 & (-42)));
                                int i53 = (i51 & i52) + (i52 | i51);
                                a = i53 % 128;
                                int i54 = i53 % 2;
                                z = true;
                            }
                            int i55 = i40 & 1;
                            int i56 = (i40 ^ 1) | i55;
                            i40 = ((i55 | i56) << 1) - (i56 ^ i55);
                            int i57 = a;
                            int i58 = (i57 & REQUEST_NADRA_CODE_ROSTER_ADD) + (i57 | REQUEST_NADRA_CODE_ROSTER_ADD);
                            int i59 = (i58 ^ (-1)) + (i58 << 1);
                            b = i59 % 128;
                            int i60 = i59 % 2;
                        }
                        ArrayList<Roster> arrayList3 = this.activityBeginSurvey.aq;
                        if (arrayList3 != null) {
                            int i61 = a;
                            int i62 = i61 & REQUEST_CODE_ROSTER_ADD;
                            int i63 = (i61 | REQUEST_CODE_ROSTER_ADD) & (~i62);
                            int i64 = i62 << 1;
                            int i65 = (i63 & i64) + (i63 | i64);
                            b = i65 % 128;
                            int i66 = i65 % 2;
                            if (arrayList3.size() > 0) {
                                int i67 = a;
                                int i68 = ((i67 ^ 124) + ((i67 & 124) << 1)) - 1;
                                int i69 = i68 % 128;
                                b = i69;
                                if (i68 % 2 != 0) {
                                    int i70 = 53 / 0;
                                    if (!z) {
                                        this.btn_add_nadra.setText("Select Head of Household");
                                        int i71 = b;
                                        int i72 = ((((i71 ^ 87) | (i71 & 87)) << 1) - (~(-(((~i71) & 87) | (i71 & (-88)))))) - 1;
                                        a = i72 % 128;
                                        int i73 = i72 % 2;
                                    } else {
                                        int i74 = ((i69 | 87) << 1) - (i69 ^ 87);
                                        a = i74 % 128;
                                        int i75 = i74 % 2;
                                        this.btn_add_nadra.setText("Nadra Members Selection");
                                        int i76 = b + 35;
                                        a = i76 % 128;
                                        int i77 = i76 % 2;
                                    }
                                } else if (z) {
                                    int i78 = ((i69 | 87) << 1) - (i69 ^ 87);
                                    a = i78 % 128;
                                    int i79 = i78 % 2;
                                    this.btn_add_nadra.setText("Nadra Members Selection");
                                    int i710 = b + 35;
                                    a = i710 % 128;
                                    int i711 = i710 % 2;
                                } else {
                                    this.btn_add_nadra.setText("Select Head of Household");
                                    int i712 = b;
                                    int i713 = ((((i712 ^ 87) | (i712 & 87)) << 1) - (~(-(((~i712) & 87) | (i712 & (-88)))))) - 1;
                                    a = i713 % 128;
                                    int i714 = i713 % 2;
                                }
                            } else {
                                this.btn_add_nadra.setText("Select Head of Household");
                                int i715 = b;
                                int i716 = ((((i715 ^ 87) | (i715 & 87)) << 1) - (~(-(((~i715) & 87) | (i715 & (-88)))))) - 1;
                                a = i716 % 128;
                                int i717 = i716 % 2;
                            }
                        } else {
                            this.btn_add_nadra.setText("Select Head of Household");
                            int i718 = b;
                            int i719 = ((((i718 ^ 87) | (i718 & 87)) << 1) - (~(-(((~i718) & 87) | (i718 & (-88)))))) - 1;
                            a = i719 % 128;
                            int i7110 = i719 % 2;
                        }
                    }
                    if (this.activityBeginSurvey.aq.size() <= 0) {
                        this.activityBeginSurvey.aq = arrayList2;
                        int i80 = a;
                        int i81 = ((i80 | 18) << 1) - (i80 ^ 18);
                        int i82 = (i81 ^ (-1)) + (i81 << 1);
                        b = i82 % 128;
                        if (i82 % 2 == 0) {
                            return;
                        }
                        obj.hashCode();
                        throw null;
                    }
                    int i83 = a;
                    int i84 = i83 & 75;
                    int i85 = ((i83 ^ 75) | i84) << 1;
                    int i86 = -((~i84) & (i83 | 75));
                    int i87 = ((i85 | i86) << 1) - (i85 ^ i86);
                    b = i87 % 128;
                    int i88 = i87 % 2;
                    int i89 = i83 + 20;
                    int i90 = (i89 ^ (-1)) + (i89 << 1);
                    b = i90 % 128;
                    int i91 = i90 % 2;
                    int i92 = 0;
                    while (i92 < arrayList2.size()) {
                        int i93 = a + 123;
                        b = i93 % 128;
                        int i94 = i93 % 2;
                        Roster roster4 = arrayList2.get(i92);
                        if (this.activityBeginSurvey.aq != null) {
                            int i95 = a;
                            int i96 = i95 ^ 95;
                            int i97 = (((i95 & 95) | i96) << 1) - i96;
                            int i98 = i97 % 128;
                            b = i98;
                            int i99 = i97 % 2;
                            int i100 = ((i98 & (-102)) | ((~i98) & REQUEST_CODE_ROSTER_ADD)) + ((i98 & REQUEST_CODE_ROSTER_ADD) << 1);
                            a = i100 % 128;
                            int i101 = i100 % 2;
                            int i102 = 0;
                            while (true) {
                                if (i102 < this.activityBeginSurvey.aq.size()) {
                                    int i103 = b;
                                    int i104 = (i103 ^ 23) + ((i103 & 23) << 1);
                                    a = i104 % 128;
                                    int i105 = i104 % 2;
                                    Roster roster5 = this.activityBeginSurvey.aq.get(i102);
                                    int i106 = b + 123;
                                    a = i106 % 128;
                                    int i107 = i106 % 2;
                                    if (roster5.cnic.equals(roster4.cnic)) {
                                        int i108 = b;
                                        int i109 = ((i108 ^ 77) | (i108 & 77)) << 1;
                                        int i110 = -(((~i108) & 77) | (i108 & (-78)));
                                        int i111 = (i109 & i110) + (i110 | i109);
                                        int i112 = i111 % 128;
                                        a = i112;
                                        boolean z2 = i111 % 2 != 0;
                                        int i113 = (((i112 | 10) << 1) - (i112 ^ 10)) - 1;
                                        b = i113 % 128;
                                        int i114 = i113 % 2;
                                        if (z2) {
                                            continue;
                                        }
                                    } else {
                                        int i115 = i102 & 1;
                                        i102 = (((i102 | 1) & (~i115)) - (~(-(-(i115 << 1))))) - 1;
                                        int i116 = b;
                                        int i117 = i116 & 19;
                                        int i118 = (((i116 | 19) & (~i117)) - (~(i117 << 1))) - 1;
                                        a = i118 % 128;
                                        int i119 = i118 % 2;
                                    }
                                } else {
                                    int i120 = b;
                                    int i121 = i120 & 19;
                                    int i122 = (i120 ^ 19) | i121;
                                    int i123 = (i121 ^ i122) + ((i122 & i121) << 1);
                                    a = i123 % 128;
                                    int i124 = i123 % 2;
                                }
                                int i125 = b;
                                int i126 = i125 & 57;
                                int i127 = i126 + ((i125 ^ 57) | i126);
                                a = i127 % 128;
                                if (i127 % 2 == 0) {
                                    this.activityBeginSurvey.aq.add(roster4);
                                    throw null;
                                }
                                this.activityBeginSurvey.aq.add(roster4);
                                int i128 = b;
                                int i129 = i128 ^ 115;
                                int i130 = (i128 & 115) << 1;
                                int i131 = (i129 ^ i130) + ((i129 & i130) << 1);
                                a = i131 % 128;
                                int i132 = i131 % 2;
                                int i133 = i128 ^ REQUEST_CODE_ROSTER_ADD;
                                int i134 = (i128 & REQUEST_CODE_ROSTER_ADD) << 1;
                                int i135 = (i133 & i134) + (i134 | i133);
                                a = i135 % 128;
                                int i136 = i135 % 2;
                            }
                        }
                        int i137 = i92 & 1;
                        int i138 = i92 | 1;
                        i92 = (i138 | i137) + (i137 & i138);
                        int i139 = b;
                        int i140 = ((i139 ^ 73) | (i139 & 73)) << 1;
                        int i141 = -(((~i139) & 73) | (i139 & (-74)));
                        int i142 = ((i140 | i141) << 1) - (i141 ^ i140);
                        a = i142 % 128;
                        int i143 = i142 % 2;
                    }
                }
                break;
            default:
                int i144 = b;
                int i145 = (i144 ^ 91) + ((i144 & 91) << 1);
                a = i145 % 128;
                int i146 = i145 % 2;
                return;
        }
        int i147 = a;
        int i148 = i147 & 105;
        int i149 = -(-(i147 | 105));
        int i150 = (i148 & i149) + (i149 | i148);
        b = i150 % 128;
        if (i150 % 2 != 0) {
            int i151 = 22 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x006c A[PHI: r1
  0x006c: PHI (r1v22 ivas.gov.bisp.enumeration.ActivityBeginSurvey) = 
  (r1v8 ivas.gov.bisp.enumeration.ActivityBeginSurvey)
  (r1v9 ivas.gov.bisp.enumeration.ActivityBeginSurvey)
  (r1v9 ivas.gov.bisp.enumeration.ActivityBeginSurvey)
  (r1v9 ivas.gov.bisp.enumeration.ActivityBeginSurvey)
  (r1v31 ivas.gov.bisp.enumeration.ActivityBeginSurvey)
 binds: [B:8:0x0041, B:14:0x005c, B:16:0x0068, B:12:0x0059, B:5:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0070  */
    /* JADX WARN: Code duplicated, block: B:22:0x0083  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:27:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:29:0x00cc A[LOOP:0: B:23:0x009f->B:29:0x00cc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x00f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0102 A[EDGE_INSN: B:36:0x0102->B:32:0x0102 BREAK  A[LOOP:0: B:23:0x009f->B:29:0x00cc], SYNTHETIC] */
    private void setList() {
        ActivityBeginSurvey activityBeginSurvey;
        int i;
        ArrayList<Roster> arrayList;
        int i2;
        int i3;
        int i4 = 2 % 2;
        this.mRecyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        int i5 = b;
        int i6 = (i5 & 5) + (i5 | 5);
        a = i6 % 128;
        int i7 = i6 % 2;
        this.mLayoutManager = linearLayoutManager;
        this.mRecyclerView.setLayoutManager(linearLayoutManager);
        int i8 = b;
        int i9 = i8 & 85;
        int i10 = ((i8 | 85) & (~i9)) + (i9 << 1);
        a = i10 % 128;
        if (i10 % 2 != 0 ? (i = (activityBeginSurvey = this.activityBeginSurvey).ac) == 1 : (i = (activityBeginSurvey = this.activityBeginSurvey).ac) == 1) {
            arrayList = activityBeginSurvey.aq;
            if (arrayList != null) {
                int i11 = a;
                int i12 = ((i11 & 16) + (i11 | 16)) - 1;
                b = i12 % 128;
                int i13 = i12 % 2;
                if (arrayList.size() > 0) {
                    int i14 = b;
                    int i15 = (((i14 | 111) << 1) - (~(-(i14 ^ 111)))) - 1;
                    a = i15 % 128;
                    int i16 = i15 % 2;
                    int i17 = ((i14 | 5) << 1) - (i14 ^ 5);
                    a = i17 % 128;
                    int i18 = i17 % 2;
                    i2 = 0;
                    while (i2 < this.activityBeginSurvey.aq.size()) {
                        int i19 = b;
                        i3 = (-2) - (((i19 ^ 46) + ((i19 & 46) << 1)) ^ (-1));
                        a = i3 % 128;
                        if (i3 % 2 == 0) {
                            int i20 = this.activityBeginSurvey.aq.get(i2).relation_to_household_id;
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        if (this.activityBeginSurvey.aq.get(i2).relation_to_household_id == 186) {
                            break;
                        }
                        int i21 = b;
                        int i22 = (i21 & (-54)) | ((~i21) & 53);
                        int i23 = (i21 & 53) << 1;
                        int i24 = (i22 & i23) + (i22 | i23);
                        a = i24 % 128;
                        int i25 = i24 % 2;
                        i2++;
                        int i26 = (((i21 | 10) << 1) - (i21 ^ 10)) - 1;
                        a = i26 % 128;
                        int i27 = i26 % 2;
                    }
                }
            }
        } else {
            int i28 = b;
            int i29 = i28 ^ 123;
            int i30 = -(-((i28 & 123) << 1));
            int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
            int i32 = i31 % 128;
            a = i32;
            if (i31 % 2 != 0 ? i == 2 : i == 4) {
                arrayList = activityBeginSurvey.aq;
                if (arrayList != null) {
                    int i110 = a;
                    int i111 = ((i110 & 16) + (i110 | 16)) - 1;
                    b = i111 % 128;
                    int i112 = i111 % 2;
                    if (arrayList.size() > 0) {
                        int i113 = b;
                        int i114 = (((i113 | 111) << 1) - (~(-(i113 ^ 111)))) - 1;
                        a = i114 % 128;
                        int i115 = i114 % 2;
                        int i116 = ((i113 | 5) << 1) - (i113 ^ 5);
                        a = i116 % 128;
                        int i117 = i116 % 2;
                        i2 = 0;
                        while (i2 < this.activityBeginSurvey.aq.size()) {
                            int i118 = b;
                            i3 = (-2) - (((i118 ^ 46) + ((i118 & 46) << 1)) ^ (-1));
                            a = i3 % 128;
                            if (i3 % 2 == 0) {
                                int i210 = this.activityBeginSurvey.aq.get(i2).relation_to_household_id;
                                Object obj2 = null;
                                obj2.hashCode();
                                throw null;
                            }
                            if (this.activityBeginSurvey.aq.get(i2).relation_to_household_id == 186) {
                                break;
                                break;
                            }
                            int i211 = b;
                            int i212 = (i211 & (-54)) | ((~i211) & 53);
                            int i213 = (i211 & 53) << 1;
                            int i214 = (i212 & i213) + (i212 | i213);
                            a = i214 % 128;
                            int i215 = i214 % 2;
                            i2++;
                            int i216 = (((i211 | 10) << 1) - (i211 ^ 10)) - 1;
                            a = i216 % 128;
                            int i217 = i216 % 2;
                        }
                    }
                }
            } else {
                int i33 = i32 + 89;
                b = i33 % 128;
                int i34 = i33 % 2;
                if (!(!ag.d)) {
                    arrayList = activityBeginSurvey.aq;
                    if (arrayList != null) {
                        int i119 = a;
                        int i1110 = ((i119 & 16) + (i119 | 16)) - 1;
                        b = i1110 % 128;
                        int i1111 = i1110 % 2;
                        if (arrayList.size() > 0) {
                            int i1112 = b;
                            int i1113 = (((i1112 | 111) << 1) - (~(-(i1112 ^ 111)))) - 1;
                            a = i1113 % 128;
                            int i1114 = i1113 % 2;
                            int i1115 = ((i1112 | 5) << 1) - (i1112 ^ 5);
                            a = i1115 % 128;
                            int i1116 = i1115 % 2;
                            i2 = 0;
                            while (i2 < this.activityBeginSurvey.aq.size()) {
                                int i1117 = b;
                                i3 = (-2) - (((i1117 ^ 46) + ((i1117 & 46) << 1)) ^ (-1));
                                a = i3 % 128;
                                if (i3 % 2 == 0) {
                                    int i218 = this.activityBeginSurvey.aq.get(i2).relation_to_household_id;
                                    Object obj3 = null;
                                    obj3.hashCode();
                                    throw null;
                                }
                                if (this.activityBeginSurvey.aq.get(i2).relation_to_household_id == 186) {
                                    break;
                                    break;
                                }
                                int i219 = b;
                                int i2110 = (i219 & (-54)) | ((~i219) & 53);
                                int i2111 = (i219 & 53) << 1;
                                int i2112 = (i2110 & i2111) + (i2110 | i2111);
                                a = i2112 % 128;
                                int i2113 = i2112 % 2;
                                i2++;
                                int i2114 = (((i219 | 10) << 1) - (i219 ^ 10)) - 1;
                                a = i2114 % 128;
                                int i2115 = i2114 % 2;
                            }
                        }
                    }
                }
            }
        }
        AdapterRosterList adapterRosterList = new AdapterRosterList(this.activityBeginSurvey.aq, this.sessionManager, new AnonymousClass2());
        int i35 = a;
        int i36 = i35 ^ 65;
        int i37 = (((i35 & 65) | i36) << 1) - i36;
        b = i37 % 128;
        int i38 = i37 % 2;
        this.mAdapter = adapterRosterList;
        this.mRecyclerView.setAdapter(adapterRosterList);
        int i39 = a + 39;
        b = i39 % 128;
        int i40 = i39 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0098  */
    /* JADX WARN: Code duplicated, block: B:20:0x009b  */
    /* JADX WARN: Code duplicated, block: B:34:0x010f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0124  */
    /* JADX WARN: Code duplicated, block: B:38:0x0128  */
    /* JADX WARN: Code duplicated, block: B:59:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:60:0x0206  */
    public int getMatchingCount(Roster roster, Roster roster2) {
        VerificationQuestionsCount verificationQuestionsCount;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        int i7 = b;
        int i8 = i7 & 1;
        int i9 = (i8 - (~((i7 ^ 1) | i8))) - 1;
        a = i9 % 128;
        if (i9 % 2 == 0) {
            verificationQuestionsCount = this.activityBeginSurvey.au;
            i = verificationQuestionsCount.is_bisp_flag;
            int i10 = 2 / 0;
        } else {
            verificationQuestionsCount = this.activityBeginSurvey.au;
            i = verificationQuestionsCount.is_bisp_flag;
        }
        int i11 = b;
        int i12 = (i11 & 89) + (i11 | 89);
        a = i12 % 128;
        int i13 = i12 % 2;
        verificationQuestionsCount.is_bisp_flag = (i ^ 1) + ((i & 1) << 1);
        String str = roster.isBispBenif;
        String str2 = roster2.isBispBenif;
        int i14 = b + 5;
        a = i14 % 128;
        Object obj = null;
        if (i14 % 2 == 0) {
            str.equals(str2);
            obj.hashCode();
            throw null;
        }
        if (!str.equals(str2)) {
            roster2.is_bisp_flag = 0;
            int i15 = a;
            int i16 = (i15 ^ 21) + ((i15 & 21) << 1);
            b = i16 % 128;
            int i17 = i16 % 2;
        } else {
            int i18 = a;
            int i19 = i18 & 105;
            int i20 = i19 + ((i18 ^ 105) | i19);
            b = i20 % 128;
            int i21 = i20 % 2;
            roster2.is_bisp_flag = 1;
        }
        VerificationQuestionsCount verificationQuestionsCount2 = this.activityBeginSurvey.au;
        int i22 = verificationQuestionsCount2.cnic_option_flag;
        int i23 = b + 97;
        a = i23 % 128;
        if (i23 % 2 == 0) {
            int i24 = i22 << 1;
            int i25 = -i22;
            verificationQuestionsCount2.cnic_option_flag = (i24 ^ i25) + ((i25 & i24) << 1);
            if (roster.cnicOption == roster2.cnicOption) {
                roster2.cnic_option_flag = 1;
            } else {
                roster2.cnic_option_flag = 0;
            }
        } else {
            verificationQuestionsCount2.cnic_option_flag = i22 + 1;
            if (roster.cnicOption == roster2.cnicOption) {
                roster2.cnic_option_flag = 1;
            } else {
                roster2.cnic_option_flag = 0;
            }
        }
        verificationQuestionsCount2.bform_flag++;
        int i26 = b;
        int i27 = i26 ^ 107;
        int i28 = ((i26 & 107) | i27) << 1;
        int i29 = -i27;
        int i30 = (i28 ^ i29) + ((i28 & i29) << 1);
        a = i30 % 128;
        if (i30 % 2 == 0) {
            roster.bform.equals(roster2.bform);
            throw null;
        }
        if (roster.bform.equals(roster2.bform)) {
            int i31 = b + 109;
            a = i31 % 128;
            int i32 = i31 % 2;
            roster2.bform_flag = 1;
        } else {
            roster2.bform_flag = 0;
            int i33 = a + 13;
            b = i33 % 128;
            int i34 = i33 % 2;
        }
        VerificationQuestionsCount verificationQuestionsCount3 = this.activityBeginSurvey.au;
        int i35 = verificationQuestionsCount3.relation_to_household_flag;
        int i36 = a;
        int i37 = i36 & 17;
        int i38 = -(-((i36 ^ 17) | i37));
        int i39 = (i37 & i38) + (i38 | i37);
        b = i39 % 128;
        if (i39 % 2 != 0) {
            verificationQuestionsCount3.relation_to_household_flag = i35;
            if (roster.relation_to_household_id == roster2.relation_to_household_id) {
                roster2.relation_to_household_flag = 1;
                int i40 = b;
                int i41 = i40 & 107;
                i2 = (((i40 | 107) & (~i41)) - (~(i41 << 1))) - 1;
                a = i2 % 128;
                if (i2 % 2 == 0) {
                    int i42 = 3 / 3;
                }
                i3 = 1;
            } else {
                roster2.relation_to_household_flag = 0;
                i3 = 0;
            }
        } else {
            int i43 = i35 & 1;
            int i44 = (i35 | 1) & (~i43);
            int i45 = i43 << 1;
            verificationQuestionsCount3.relation_to_household_flag = (i44 ^ i45) + ((i44 & i45) << 1);
            if (roster.relation_to_household_id == roster2.relation_to_household_id) {
                roster2.relation_to_household_flag = 1;
                int i46 = b;
                int i47 = i46 & 107;
                i2 = (((i46 | 107) & (~i47)) - (~(i47 << 1))) - 1;
                a = i2 % 128;
                if (i2 % 2 == 0) {
                    int i48 = 3 / 3;
                }
                i3 = 1;
            } else {
                roster2.relation_to_household_flag = 0;
                i3 = 0;
            }
        }
        int i49 = verificationQuestionsCount3.gender_flag;
        int i50 = i49 & 1;
        int i51 = (i49 ^ 1) | i50;
        verificationQuestionsCount3.gender_flag = (i50 ^ i51) + ((i51 & i50) << 1);
        String str3 = roster.gender;
        int i52 = a;
        int i53 = ((i52 | 107) << 1) - (i52 ^ 107);
        b = i53 % 128;
        if (i53 % 2 != 0) {
            str3.equals(roster2.gender);
            obj.hashCode();
            throw null;
        }
        if (!str3.equals(roster2.gender)) {
            roster2.gender_flag = 0;
            int i54 = a;
            int i55 = ((i54 & REQUEST_CODE_ROSTER_EDIT) + (i54 | REQUEST_CODE_ROSTER_EDIT)) - 1;
            b = i55 % 128;
            int i56 = i55 % 2;
        } else {
            int i57 = a + 61;
            b = i57 % 128;
            if (i57 % 2 != 0) {
                roster2.gender_flag = 1;
                i3 += 83;
            } else {
                roster2.gender_flag = 1;
                int i58 = i3 & (-21);
                int i59 = i58 + ((i3 ^ (-21)) | i58) + 23;
                i3 = (i59 ^ (-1)) + (i59 << 1);
            }
        }
        VerificationQuestionsCount verificationQuestionsCount4 = this.activityBeginSurvey.au;
        int i60 = verificationQuestionsCount4.date_of_birth_flag;
        int i61 = a + 87;
        b = i61 % 128;
        int i62 = i61 % 2;
        verificationQuestionsCount4.date_of_birth_flag = (i60 & 1) + (i60 | 1);
        String str4 = roster.date_of_birth_var;
        String str5 = roster2.date_of_birth_var;
        int i63 = a + 25;
        b = i63 % 128;
        int i64 = i63 % 2;
        if (str4.equals(str5)) {
            int i65 = b + 107;
            a = i65 % 128;
            int i66 = i65 % 2;
            roster2.date_of_birth_flag = 1;
            i3 = ((i3 | 1) << 1) - (i3 ^ 1);
        } else {
            roster2.date_of_birth_flag = 0;
            int i67 = b + 107;
            a = i67 % 128;
            int i68 = i67 % 2;
        }
        VerificationQuestionsCount verificationQuestionsCount5 = this.activityBeginSurvey.au;
        int i69 = verificationQuestionsCount5.marital_status_flag;
        int i70 = b + 31;
        a = i70 % 128;
        if (i70 % 2 == 0) {
            verificationQuestionsCount5.marital_status_flag = i69 >>> 1;
            if (roster.marital_status == roster2.marital_status) {
                roster2.merital_status_flag = 1;
                int i71 = i3 + 55;
                int i72 = i71 ^ (-54);
                int i73 = (i71 & (-54)) << 1;
                i3 = ((i72 | i73) << 1) - (i73 ^ i72);
                int i74 = b + 115;
                a = i74 % 128;
                int i75 = i74 % 2;
            } else {
                roster2.merital_status_flag = 0;
                int i76 = a;
                int i77 = ((i76 | 57) << 1) - (i76 ^ 57);
                b = i77 % 128;
                int i78 = i77 % 2;
            }
        } else {
            verificationQuestionsCount5.marital_status_flag = ((i69 | 1) << 1) - (i69 ^ 1);
            if (roster.marital_status == roster2.marital_status) {
                roster2.merital_status_flag = 1;
                int i79 = i3 + 55;
                int i710 = i79 ^ (-54);
                int i711 = (i79 & (-54)) << 1;
                i3 = ((i710 | i711) << 1) - (i711 ^ i710);
                int i712 = b + 115;
                a = i712 % 128;
                int i713 = i712 % 2;
            } else {
                roster2.merital_status_flag = 0;
                int i714 = a;
                int i715 = ((i714 | 57) << 1) - (i714 ^ 57);
                b = i715 % 128;
                int i716 = i715 % 2;
            }
        }
        int i80 = verificationQuestionsCount5.cnic_flag;
        int i81 = i80 & 1;
        verificationQuestionsCount5.cnic_flag = (i81 - (~((i80 ^ 1) | i81))) - 1;
        int i82 = b;
        int i83 = (i82 & 5) + (i82 | 5);
        a = i83 % 128;
        int i84 = i83 % 2;
        if (roster.getCnic().equals(roster2.cnic)) {
            int i85 = b;
            int i86 = i85 & 83;
            int i87 = (i85 ^ 83) | i86;
            int i88 = (i86 ^ i87) + ((i87 & i86) << 1);
            a = i88 % 128;
            if (i88 % 2 == 0) {
                roster2.cnic_flag = 1;
                int i89 = i3 & 48;
                int i90 = (i3 | 48) & (~i89);
                int i91 = -(-(i89 << 1));
                i3 = (i90 ^ i91) + ((i91 & i90) << 1);
            } else {
                roster2.cnic_flag = 1;
                i3 = (i3 | 1) + (i3 & 1);
            }
        } else {
            roster2.cnic_flag = 0;
            int i92 = b;
            int i93 = ((((i92 ^ 115) | (i92 & 115)) << 1) - (~(-(((~i92) & 115) | (i92 & (-116)))))) - 1;
            a = i93 % 128;
            int i94 = i93 % 2;
        }
        VerificationQuestionsCount verificationQuestionsCount6 = this.activityBeginSurvey.au;
        int i95 = b;
        int i96 = i95 ^ 77;
        int i97 = (i95 & 77) << 1;
        int i98 = (i96 & i97) + (i97 | i96);
        a = i98 % 128;
        if (i98 % 2 == 0) {
            verificationQuestionsCount6.disability_flag = verificationQuestionsCount6.disability_flag;
        } else {
            int i99 = verificationQuestionsCount6.disability_flag;
            int i100 = i99 & 1;
            verificationQuestionsCount6.disability_flag = (((i99 ^ 1) | i100) << 1) - ((i99 | 1) & (~i100));
        }
        if (roster.disability == roster2.disability) {
            int i101 = b;
            int i102 = (i101 ^ 97) + ((i101 & 97) << 1);
            a = i102 % 128;
            if (i102 % 2 == 0) {
                roster2.disability_flag = 1;
                i3 = ((i3 & 32) << 1) + (i3 ^ 32);
            } else {
                roster2.disability_flag = 1;
                int i103 = ((i3 | 2) << 1) - (i3 ^ 2);
                i3 = (i103 ^ (-1)) + (i103 << 1);
            }
        } else {
            roster2.disability_flag = 0;
            int i104 = a;
            int i105 = (i104 & (-74)) | ((~i104) & 73);
            int i106 = (i104 & 73) << 1;
            int i107 = (i105 & i106) + (i106 | i105);
            b = i107 % 128;
            int i108 = i107 % 2;
        }
        int i109 = verificationQuestionsCount6.chronic_disease_flag;
        int i110 = (i109 & (-2)) | ((~i109) & 1);
        int i111 = (i109 & 1) << 1;
        verificationQuestionsCount6.chronic_disease_flag = ((i110 | i111) << 1) - (i111 ^ i110);
        int i112 = roster.chronic_disease;
        int i113 = a + 19;
        b = i113 % 128;
        int i114 = i113 % 2;
        if (i112 == roster2.chronic_disease) {
            int i115 = a;
            int i116 = i115 & 53;
            int i117 = (i115 ^ 53) | i116;
            int i118 = ((i116 | i117) << 1) - (i117 ^ i116);
            b = i118 % 128;
            if (i118 % 2 != 0) {
                roster2.chronic_disease_flag = 1;
                int i119 = (i3 | 32) << 1;
                int i120 = -(i3 ^ 32);
                int i121 = (i119 & i120) + (i120 | i119);
                int i122 = i121 & 54;
                int i123 = (i121 ^ 54) | i122;
                i4 = (i122 | i123) << 1;
                i5 = i122 ^ i123;
            } else {
                roster2.chronic_disease_flag = 1;
                int i124 = (i3 & (-2)) | ((~i3) & 1);
                int i125 = -(-((i3 & 1) << 1));
                i4 = (i124 | i125) << 1;
                i5 = i125 ^ i124;
            }
            i3 = i4 - i5;
        } else {
            roster2.chronic_disease_flag = 0;
        }
        int i126 = verificationQuestionsCount6.language_flag;
        verificationQuestionsCount6.language_flag = ((i126 | 1) << 1) - (i126 ^ 1);
        int i127 = roster.language;
        int i128 = a;
        int i129 = (i128 & (-100)) | ((~i128) & 99);
        int i130 = (i128 & 99) << 1;
        int i131 = (i129 & i130) + (i130 | i129);
        b = i131 % 128;
        int i132 = i131 % 2;
        if (i127 == roster2.language) {
            int i133 = a;
            int i134 = (((i133 | 20) << 1) - (i133 ^ 20)) - 1;
            b = i134 % 128;
            int i135 = i134 % 2;
            roster2.language_flag = 1;
            int i136 = i3 + 62;
            int i137 = i136 & (-61);
            int i138 = -(-((i136 ^ (-61)) | i137));
            i3 = (i138 | i137) + (i137 & i138);
            int i139 = b + 36;
            int i140 = (i139 ^ (-1)) + (i139 << 1);
            a = i140 % 128;
            int i141 = i140 % 2;
        } else {
            roster2.language_flag = 0;
            int i142 = b;
            int i143 = (((i142 | 82) << 1) - (i142 ^ 82)) - 1;
            a = i143 % 128;
            int i144 = i143 % 2;
        }
        int i145 = verificationQuestionsCount6.attended_school_flag;
        int i146 = i145 & 1;
        int i147 = (i145 ^ 1) | i146;
        verificationQuestionsCount6.attended_school_flag = (i146 ^ i147) + ((i147 & i146) << 1);
        int i148 = roster.attended_school;
        int i149 = a;
        int i150 = i149 & 65;
        int i151 = (i149 | 65) & (~i150);
        int i152 = i150 << 1;
        int i153 = (i151 & i152) + (i151 | i152);
        b = i153 % 128;
        if (i153 % 2 != 0) {
            int i154 = roster2.attended_school;
            throw null;
        }
        if (i148 == roster2.attended_school) {
            roster2.attended_school_flag = 1;
            int i155 = i3 ^ (-32);
            int i156 = ((i3 & (-32)) | i155) << 1;
            int i157 = -i155;
            int i158 = (i156 & i157) + (i156 | i157);
            int i159 = i158 & 33;
            i3 = (i159 << 1) + ((~i159) & (i158 | 33));
            int i160 = a + 85;
            b = i160 % 128;
            int i161 = i160 % 2;
        } else {
            roster2.attended_school_flag = 0;
            int i162 = b;
            int i163 = i162 ^ 43;
            int i164 = ((i162 & 43) | i163) << 1;
            int i165 = -i163;
            int i166 = ((i164 | i165) << 1) - (i164 ^ i165);
            a = i166 % 128;
            int i167 = i166 % 2;
        }
        int i168 = verificationQuestionsCount6.higher_education_flag;
        int i169 = i168 & 1;
        int i170 = ((i168 ^ 1) | i169) << 1;
        int i171 = -((i168 | 1) & (~i169));
        verificationQuestionsCount6.higher_education_flag = (i170 & i171) + (i171 | i170);
        int i172 = roster.higher_education;
        int i173 = a;
        int i174 = i173 & 93;
        int i175 = (i173 | 93) & (~i174);
        int i176 = -(-(i174 << 1));
        int i177 = ((i175 | i176) << 1) - (i175 ^ i176);
        b = i177 % 128;
        int i178 = i177 % 2;
        if (i172 == roster2.higher_education) {
            int i179 = a + 7;
            b = i179 % 128;
            int i180 = i179 % 2;
            roster2.higher_education_flag = 1;
            int i181 = i3 ^ 1;
            int i182 = (i3 & 1) << 1;
            i3 = (i182 | i181) + (i181 & i182);
        } else {
            roster2.higher_education_flag = 0;
        }
        int i183 = verificationQuestionsCount6.work_activity_flag;
        verificationQuestionsCount6.work_activity_flag = ((i183 & 2) + (i183 | 2)) - 1;
        int i184 = roster.work_activity;
        int i185 = b;
        int i186 = (i185 & 27) + (i185 | 27);
        a = i186 % 128;
        int i187 = i186 % 2;
        if (i184 == roster2.work_activity) {
            int i188 = a;
            int i189 = (i188 ^ 91) + ((i188 & 91) << 1);
            b = i189 % 128;
            if (i189 % 2 != 0) {
                roster2.work_activity_flag = 1;
                int i190 = (i3 & (-145)) | ((~i3) & 144);
                int i191 = (i3 & 144) << 1;
                i3 = ((i190 ^ i191) + ((i191 & i190) << 1)) - 79;
            } else {
                roster2.work_activity_flag = 1;
                i3 = ((i3 | 1) << 1) - (i3 ^ 1);
            }
        } else {
            roster2.work_activity_flag = 0;
            int i192 = a + 119;
            b = i192 % 128;
            int i193 = i192 % 2;
        }
        int i194 = verificationQuestionsCount6.hours_worked_flag;
        int i195 = i194 & 1;
        int i196 = (i194 | 1) & (~i195);
        int i197 = i195 << 1;
        verificationQuestionsCount6.hours_worked_flag = (i196 & i197) + (i196 | i197);
        double d2 = roster.hours_worked;
        int i198 = a;
        int i199 = ((i198 ^ 91) | (i198 & 91)) << 1;
        int i200 = -(((~i198) & 91) | (i198 & (-92)));
        int i201 = ((i199 | i200) << 1) - (i200 ^ i199);
        b = i201 % 128;
        int i202 = i201 % 2;
        if (d2 == roster2.hours_worked) {
            int i203 = a;
            int i204 = i203 & 61;
            int i205 = ((i203 ^ 61) | i204) << 1;
            int i206 = -((i203 | 61) & (~i204));
            int i207 = ((i205 | i206) << 1) - (i206 ^ i205);
            b = i207 % 128;
            int i208 = i207 % 2;
            roster2.hours_worked_flag = 1;
            int i209 = (((i3 | 50) << 1) - (i3 ^ 50)) - 1;
            int i210 = i209 & (-48);
            int i211 = i209 | (-48);
            i3 = ((i210 & i211) << 1) + (i210 ^ i211);
            int i212 = b;
            int i213 = i212 & 81;
            int i214 = (((i212 | 81) & (~i213)) - (~(-(-(i213 << 1))))) - 1;
            a = i214 % 128;
            if (i214 % 2 == 0) {
                int i215 = 5 % 2;
            }
        } else {
            roster2.hours_worked_flag = 0;
            int i216 = a;
            int i217 = ((i216 ^ 116) + ((i216 & 116) << 1)) - 1;
            b = i217 % 128;
            int i218 = i217 % 2;
        }
        verificationQuestionsCount6.employment_status_flag++;
        int i219 = roster.employment_status;
        int i220 = b;
        int i221 = ((((i220 ^ 23) | (i220 & 23)) << 1) - (~(-(((~i220) & 23) | (i220 & (-24)))))) - 1;
        a = i221 % 128;
        if (i221 % 2 == 0) {
            int i222 = roster2.employment_status;
            obj.hashCode();
            throw null;
        }
        if (i219 == roster2.employment_status) {
            roster2.employment_status_flag = 1;
            int i223 = i3 & 84;
            int i224 = i223 + ((i3 ^ 84) | i223);
            int i225 = i224 & (-83);
            i3 = ((i224 | (-83)) & (~i225)) + (i225 << 1);
            int i226 = a;
            int i227 = i226 & 73;
            int i228 = i227 + ((i226 ^ 73) | i227);
            b = i228 % 128;
            int i229 = i228 % 2;
        } else {
            roster2.employment_status_flag = 0;
        }
        int i230 = a;
        int i231 = i230 & 61;
        int i232 = (((i230 | 61) & (~i231)) - (~(-(-(i231 << 1))))) - 1;
        b = i232 % 128;
        if (i232 % 2 == 0) {
            return i3;
        }
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.X.e
    public SupervisorParseObject parseJsonForSupervisor() {
        List<Roster> list;
        int i = 2 % 2;
        SupervisorParseObject supervisorParseObject = new SupervisorParseObject();
        ArrayList<Roster> arrayList = this.activityBeginSurvey.aq;
        int i2 = a;
        int i3 = i2 & 91;
        int i4 = (i2 | 91) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        b = i6 % 128;
        Object obj = null;
        if (i6 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (arrayList != null && arrayList.size() > 0) {
            int i7 = b;
            int i8 = i7 & 115;
            int i9 = i8 + ((i7 ^ 115) | i8);
            a = i9 % 128;
            if (i9 % 2 == 0) {
                list = this.activityBeginSurvey.aG.rosterList;
                int i10 = 16 / 0;
            } else {
                list = this.activityBeginSurvey.aG.rosterList;
            }
            int i11 = b;
            int i12 = (i11 ^ 107) + ((i11 & 107) << 1);
            a = i12 % 128;
            if (i12 % 2 == 0) {
                list.get(this.roster1);
                throw null;
            }
            Roster roster = list.get(this.roster1);
            int i13 = a;
            int i14 = (i13 & 93) + (i13 | 93);
            b = i14 % 128;
            int i15 = i14 % 2;
            double matchingCount = ((double) getMatchingCount(roster, arrayList.get(0))) / 13.0d;
            int i16 = a;
            int i17 = ((i16 ^ 69) | (i16 & 69)) << 1;
            int i18 = -(((~i16) & 69) | (i16 & (-70)));
            int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
            b = i19 % 128;
            int i20 = i19 % 2;
            if (arrayList.size() > 1) {
                int i21 = a;
                int i22 = ((i21 | 49) << 1) - (i21 ^ 49);
                b = i22 % 128;
                if (i22 % 2 != 0) {
                    List<Roster> list2 = this.activityBeginSurvey.aG.rosterList;
                    obj.hashCode();
                    throw null;
                }
                Roster roster2 = this.activityBeginSurvey.aG.rosterList.get(this.roster2);
                Roster roster3 = arrayList.get(1);
                int i23 = a;
                int i24 = i23 & 67;
                int i25 = (i23 | 67) & (~i24);
                int i26 = -(-(i24 << 1));
                int i27 = (i25 ^ i26) + ((i25 & i26) << 1);
                b = i27 % 128;
                int i28 = i27 % 2;
                double matchingCount2 = getMatchingCount(roster2, roster3);
                int i29 = a;
                int i30 = (i29 ^ 83) + ((i29 & 83) << 1);
                b = i30 % 128;
                int i31 = i30 % 2;
                updateDividerPercentage(1, (matchingCount2 / 13.0d) * 80.0d);
                int i32 = a;
                int i33 = i32 & 33;
                int i34 = (i32 | 33) & (~i33);
                int i35 = -(-(i33 << 1));
                int i36 = (i34 ^ i35) + ((i34 & i35) << 1);
                b = i36 % 128;
                int i37 = i36 % 2;
            }
            updateDividerPercentage(1, matchingCount * 80.0d);
            int i38 = b;
            int i39 = ((i38 | 125) << 1) - (i38 ^ 125);
            a = i39 % 128;
            int i40 = i39 % 2;
        }
        supervisorParseObject.setDividerForPercentage(this.activityBeginSurvey.as);
        ActivityBeginSurvey activityBeginSurvey = this.activityBeginSurvey;
        int i41 = a;
        int i42 = i41 ^ 39;
        int i43 = -(-((i41 & 39) << 1));
        int i44 = ((i42 | i43) << 1) - (i43 ^ i42);
        b = i44 % 128;
        int i45 = i44 % 2;
        supervisorParseObject.setSurveySupervisor(activityBeginSurvey.ap);
        int i46 = b;
        int i47 = ((i46 ^ 39) | (i46 & 39)) << 1;
        int i48 = -(((~i46) & 39) | (i46 & (-40)));
        int i49 = ((i47 | i48) << 1) - (i48 ^ i47);
        a = i49 % 128;
        int i50 = i49 % 2;
        return supervisorParseObject;
    }

    private void showDialog(String str, String str2) {
        int i = 2 % 2;
        b.aIz aiz = new b.aIz(getContext());
        AlertController.OooO0O0 oooO0O0 = aiz.a;
        int i2 = a;
        int i3 = i2 & 99;
        int i4 = i3 + ((i2 ^ 99) | i3);
        b = i4 % 128;
        int i5 = i4 % 2;
        oooO0O0.e = str;
        oooO0O0.f = str2;
        oooO0O0.k = false;
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentRoster.6
            private static int a = 0;
            private static int b = 1;

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i6) {
                int i7 = 2 % 2;
                int i8 = a;
                int i9 = (((i8 & (-40)) | ((~i8) & 39)) - (~(-(-((i8 & 39) << 1))))) - 1;
                b = i9 % 128;
                Object obj = null;
                if (i9 % 2 == 0) {
                    FragmentRoster.access$800(FragmentRoster.this).isShowing();
                    obj.hashCode();
                    throw null;
                }
                if (FragmentRoster.access$800(FragmentRoster.this).isShowing()) {
                    int i10 = a;
                    int i11 = i10 | 73;
                    int i12 = ((i11 << 1) - (~(-((~(i10 & 73)) & i11)))) - 1;
                    b = i12 % 128;
                    int i13 = i12 % 2;
                    FragmentRoster.access$800(FragmentRoster.this).dismiss();
                    int i14 = b;
                    int i15 = i14 ^ 47;
                    int i16 = (i14 & 47) << 1;
                    int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
                    a = i17 % 128;
                    int i18 = i17 % 2;
                }
                dialogInterface.dismiss();
                int i19 = a;
                int i20 = i19 & 95;
                int i21 = (i20 - (~(-(-((i19 ^ 95) | i20))))) - 1;
                b = i21 % 128;
                if (i21 % 2 == 0) {
                    throw null;
                }
            }
        };
        AlertController.OooO0O0 oooO0O1 = aiz.a;
        int i6 = b;
        int i7 = i6 | 5;
        int i8 = (i7 << 1) - ((~(i6 & 5)) & i7);
        a = i8 % 128;
        Object obj = null;
        if (i8 % 2 == 0) {
            oooO0O1.h = "Ok";
            oooO0O1.i = onClickListener;
            aiz.b();
            obj.hashCode();
            throw null;
        }
        oooO0O1.h = "Ok";
        oooO0O1.i = onClickListener;
        b bVarB = aiz.b();
        int i9 = b + 57;
        a = i9 % 128;
        if (i9 % 2 != 0) {
            bVarB.show();
        } else {
            bVarB.show();
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:129:0x03d6 A[Catch: Exception -> 0x0672, TryCatch #7 {Exception -> 0x0672, blocks: (B:3:0x0021, B:5:0x004b, B:8:0x006b, B:254:0x0660, B:14:0x007b, B:17:0x00a7, B:19:0x00c0, B:21:0x00df, B:24:0x00fd, B:26:0x0118, B:29:0x0139, B:31:0x0159, B:34:0x0173, B:37:0x0194, B:41:0x01a5, B:221:0x05f9, B:223:0x0612, B:226:0x0627, B:228:0x062c, B:233:0x0632, B:44:0x01c6, B:47:0x01d3, B:53:0x01f2, B:55:0x0209, B:58:0x0210, B:61:0x0221, B:64:0x023d, B:66:0x0250, B:68:0x0254, B:72:0x0258, B:76:0x0283, B:108:0x0339, B:112:0x0357, B:113:0x035b, B:118:0x036c, B:120:0x0389, B:122:0x03a3, B:125:0x03bd, B:127:0x03cf, B:129:0x03d6, B:131:0x03df, B:135:0x03fa, B:137:0x0403, B:154:0x0464, B:158:0x0477, B:164:0x048f, B:170:0x04a2, B:172:0x04ad, B:189:0x0505, B:192:0x052e, B:194:0x0532, B:195:0x0535, B:178:0x04b4, B:199:0x053a, B:201:0x0568, B:204:0x0583, B:206:0x05d0, B:208:0x05dc, B:209:0x05df, B:162:0x0489, B:144:0x040b, B:146:0x0413, B:149:0x0437, B:152:0x044d, B:116:0x0365, B:82:0x02a5, B:87:0x02c5, B:88:0x02c8, B:90:0x02cf, B:92:0x02d9, B:99:0x030d, B:100:0x0312, B:103:0x0328, B:213:0x05e5, B:215:0x05e9, B:235:0x0636, B:237:0x063e, B:238:0x0641, B:241:0x0644, B:243:0x064c, B:247:0x0650, B:249:0x0658, B:250:0x065b, B:12:0x0075), top: B:274:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:131:0x03df A[Catch: Exception -> 0x0672, TRY_LEAVE, TryCatch #7 {Exception -> 0x0672, blocks: (B:3:0x0021, B:5:0x004b, B:8:0x006b, B:254:0x0660, B:14:0x007b, B:17:0x00a7, B:19:0x00c0, B:21:0x00df, B:24:0x00fd, B:26:0x0118, B:29:0x0139, B:31:0x0159, B:34:0x0173, B:37:0x0194, B:41:0x01a5, B:221:0x05f9, B:223:0x0612, B:226:0x0627, B:228:0x062c, B:233:0x0632, B:44:0x01c6, B:47:0x01d3, B:53:0x01f2, B:55:0x0209, B:58:0x0210, B:61:0x0221, B:64:0x023d, B:66:0x0250, B:68:0x0254, B:72:0x0258, B:76:0x0283, B:108:0x0339, B:112:0x0357, B:113:0x035b, B:118:0x036c, B:120:0x0389, B:122:0x03a3, B:125:0x03bd, B:127:0x03cf, B:129:0x03d6, B:131:0x03df, B:135:0x03fa, B:137:0x0403, B:154:0x0464, B:158:0x0477, B:164:0x048f, B:170:0x04a2, B:172:0x04ad, B:189:0x0505, B:192:0x052e, B:194:0x0532, B:195:0x0535, B:178:0x04b4, B:199:0x053a, B:201:0x0568, B:204:0x0583, B:206:0x05d0, B:208:0x05dc, B:209:0x05df, B:162:0x0489, B:144:0x040b, B:146:0x0413, B:149:0x0437, B:152:0x044d, B:116:0x0365, B:82:0x02a5, B:87:0x02c5, B:88:0x02c8, B:90:0x02cf, B:92:0x02d9, B:99:0x030d, B:100:0x0312, B:103:0x0328, B:213:0x05e5, B:215:0x05e9, B:235:0x0636, B:237:0x063e, B:238:0x0641, B:241:0x0644, B:243:0x064c, B:247:0x0650, B:249:0x0658, B:250:0x065b, B:12:0x0075), top: B:274:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:133:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:135:0x03fa A[Catch: Exception -> 0x0672, TRY_ENTER, TRY_LEAVE, TryCatch #7 {Exception -> 0x0672, blocks: (B:3:0x0021, B:5:0x004b, B:8:0x006b, B:254:0x0660, B:14:0x007b, B:17:0x00a7, B:19:0x00c0, B:21:0x00df, B:24:0x00fd, B:26:0x0118, B:29:0x0139, B:31:0x0159, B:34:0x0173, B:37:0x0194, B:41:0x01a5, B:221:0x05f9, B:223:0x0612, B:226:0x0627, B:228:0x062c, B:233:0x0632, B:44:0x01c6, B:47:0x01d3, B:53:0x01f2, B:55:0x0209, B:58:0x0210, B:61:0x0221, B:64:0x023d, B:66:0x0250, B:68:0x0254, B:72:0x0258, B:76:0x0283, B:108:0x0339, B:112:0x0357, B:113:0x035b, B:118:0x036c, B:120:0x0389, B:122:0x03a3, B:125:0x03bd, B:127:0x03cf, B:129:0x03d6, B:131:0x03df, B:135:0x03fa, B:137:0x0403, B:154:0x0464, B:158:0x0477, B:164:0x048f, B:170:0x04a2, B:172:0x04ad, B:189:0x0505, B:192:0x052e, B:194:0x0532, B:195:0x0535, B:178:0x04b4, B:199:0x053a, B:201:0x0568, B:204:0x0583, B:206:0x05d0, B:208:0x05dc, B:209:0x05df, B:162:0x0489, B:144:0x040b, B:146:0x0413, B:149:0x0437, B:152:0x044d, B:116:0x0365, B:82:0x02a5, B:87:0x02c5, B:88:0x02c8, B:90:0x02cf, B:92:0x02d9, B:99:0x030d, B:100:0x0312, B:103:0x0328, B:213:0x05e5, B:215:0x05e9, B:235:0x0636, B:237:0x063e, B:238:0x0641, B:241:0x0644, B:243:0x064c, B:247:0x0650, B:249:0x0658, B:250:0x065b, B:12:0x0075), top: B:274:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:144:0x040b A[Catch: Exception -> 0x0672, TRY_ENTER, TryCatch #7 {Exception -> 0x0672, blocks: (B:3:0x0021, B:5:0x004b, B:8:0x006b, B:254:0x0660, B:14:0x007b, B:17:0x00a7, B:19:0x00c0, B:21:0x00df, B:24:0x00fd, B:26:0x0118, B:29:0x0139, B:31:0x0159, B:34:0x0173, B:37:0x0194, B:41:0x01a5, B:221:0x05f9, B:223:0x0612, B:226:0x0627, B:228:0x062c, B:233:0x0632, B:44:0x01c6, B:47:0x01d3, B:53:0x01f2, B:55:0x0209, B:58:0x0210, B:61:0x0221, B:64:0x023d, B:66:0x0250, B:68:0x0254, B:72:0x0258, B:76:0x0283, B:108:0x0339, B:112:0x0357, B:113:0x035b, B:118:0x036c, B:120:0x0389, B:122:0x03a3, B:125:0x03bd, B:127:0x03cf, B:129:0x03d6, B:131:0x03df, B:135:0x03fa, B:137:0x0403, B:154:0x0464, B:158:0x0477, B:164:0x048f, B:170:0x04a2, B:172:0x04ad, B:189:0x0505, B:192:0x052e, B:194:0x0532, B:195:0x0535, B:178:0x04b4, B:199:0x053a, B:201:0x0568, B:204:0x0583, B:206:0x05d0, B:208:0x05dc, B:209:0x05df, B:162:0x0489, B:144:0x040b, B:146:0x0413, B:149:0x0437, B:152:0x044d, B:116:0x0365, B:82:0x02a5, B:87:0x02c5, B:88:0x02c8, B:90:0x02cf, B:92:0x02d9, B:99:0x030d, B:100:0x0312, B:103:0x0328, B:213:0x05e5, B:215:0x05e9, B:235:0x0636, B:237:0x063e, B:238:0x0641, B:241:0x0644, B:243:0x064c, B:247:0x0650, B:249:0x0658, B:250:0x065b, B:12:0x0075), top: B:274:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:146:0x0413 A[Catch: Exception -> 0x0672, TRY_LEAVE, TryCatch #7 {Exception -> 0x0672, blocks: (B:3:0x0021, B:5:0x004b, B:8:0x006b, B:254:0x0660, B:14:0x007b, B:17:0x00a7, B:19:0x00c0, B:21:0x00df, B:24:0x00fd, B:26:0x0118, B:29:0x0139, B:31:0x0159, B:34:0x0173, B:37:0x0194, B:41:0x01a5, B:221:0x05f9, B:223:0x0612, B:226:0x0627, B:228:0x062c, B:233:0x0632, B:44:0x01c6, B:47:0x01d3, B:53:0x01f2, B:55:0x0209, B:58:0x0210, B:61:0x0221, B:64:0x023d, B:66:0x0250, B:68:0x0254, B:72:0x0258, B:76:0x0283, B:108:0x0339, B:112:0x0357, B:113:0x035b, B:118:0x036c, B:120:0x0389, B:122:0x03a3, B:125:0x03bd, B:127:0x03cf, B:129:0x03d6, B:131:0x03df, B:135:0x03fa, B:137:0x0403, B:154:0x0464, B:158:0x0477, B:164:0x048f, B:170:0x04a2, B:172:0x04ad, B:189:0x0505, B:192:0x052e, B:194:0x0532, B:195:0x0535, B:178:0x04b4, B:199:0x053a, B:201:0x0568, B:204:0x0583, B:206:0x05d0, B:208:0x05dc, B:209:0x05df, B:162:0x0489, B:144:0x040b, B:146:0x0413, B:149:0x0437, B:152:0x044d, B:116:0x0365, B:82:0x02a5, B:87:0x02c5, B:88:0x02c8, B:90:0x02cf, B:92:0x02d9, B:99:0x030d, B:100:0x0312, B:103:0x0328, B:213:0x05e5, B:215:0x05e9, B:235:0x0636, B:237:0x063e, B:238:0x0641, B:241:0x0644, B:243:0x064c, B:247:0x0650, B:249:0x0658, B:250:0x065b, B:12:0x0075), top: B:274:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:148:0x0422  */
    /* JADX WARN: Code duplicated, block: B:151:0x043c  */
    /* JADX WARN: Code duplicated, block: B:157:0x046d  */
    /* JADX WARN: Code duplicated, block: B:160:0x047d  */
    /* JADX WARN: Code duplicated, block: B:161:0x0488  */
    /* JADX WARN: Code duplicated, block: B:163:0x048e  */
    /* JADX WARN: Code duplicated, block: B:167:0x0494 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:168:0x0496  */
    /* JADX WARN: Code duplicated, block: B:170:0x04a2 A[Catch: Exception -> 0x0672, TRY_ENTER, TRY_LEAVE, TryCatch #7 {Exception -> 0x0672, blocks: (B:3:0x0021, B:5:0x004b, B:8:0x006b, B:254:0x0660, B:14:0x007b, B:17:0x00a7, B:19:0x00c0, B:21:0x00df, B:24:0x00fd, B:26:0x0118, B:29:0x0139, B:31:0x0159, B:34:0x0173, B:37:0x0194, B:41:0x01a5, B:221:0x05f9, B:223:0x0612, B:226:0x0627, B:228:0x062c, B:233:0x0632, B:44:0x01c6, B:47:0x01d3, B:53:0x01f2, B:55:0x0209, B:58:0x0210, B:61:0x0221, B:64:0x023d, B:66:0x0250, B:68:0x0254, B:72:0x0258, B:76:0x0283, B:108:0x0339, B:112:0x0357, B:113:0x035b, B:118:0x036c, B:120:0x0389, B:122:0x03a3, B:125:0x03bd, B:127:0x03cf, B:129:0x03d6, B:131:0x03df, B:135:0x03fa, B:137:0x0403, B:154:0x0464, B:158:0x0477, B:164:0x048f, B:170:0x04a2, B:172:0x04ad, B:189:0x0505, B:192:0x052e, B:194:0x0532, B:195:0x0535, B:178:0x04b4, B:199:0x053a, B:201:0x0568, B:204:0x0583, B:206:0x05d0, B:208:0x05dc, B:209:0x05df, B:162:0x0489, B:144:0x040b, B:146:0x0413, B:149:0x0437, B:152:0x044d, B:116:0x0365, B:82:0x02a5, B:87:0x02c5, B:88:0x02c8, B:90:0x02cf, B:92:0x02d9, B:99:0x030d, B:100:0x0312, B:103:0x0328, B:213:0x05e5, B:215:0x05e9, B:235:0x0636, B:237:0x063e, B:238:0x0641, B:241:0x0644, B:243:0x064c, B:247:0x0650, B:249:0x0658, B:250:0x065b, B:12:0x0075), top: B:274:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:178:0x04b4 A[Catch: Exception -> 0x0672, TRY_ENTER, TRY_LEAVE, TryCatch #7 {Exception -> 0x0672, blocks: (B:3:0x0021, B:5:0x004b, B:8:0x006b, B:254:0x0660, B:14:0x007b, B:17:0x00a7, B:19:0x00c0, B:21:0x00df, B:24:0x00fd, B:26:0x0118, B:29:0x0139, B:31:0x0159, B:34:0x0173, B:37:0x0194, B:41:0x01a5, B:221:0x05f9, B:223:0x0612, B:226:0x0627, B:228:0x062c, B:233:0x0632, B:44:0x01c6, B:47:0x01d3, B:53:0x01f2, B:55:0x0209, B:58:0x0210, B:61:0x0221, B:64:0x023d, B:66:0x0250, B:68:0x0254, B:72:0x0258, B:76:0x0283, B:108:0x0339, B:112:0x0357, B:113:0x035b, B:118:0x036c, B:120:0x0389, B:122:0x03a3, B:125:0x03bd, B:127:0x03cf, B:129:0x03d6, B:131:0x03df, B:135:0x03fa, B:137:0x0403, B:154:0x0464, B:158:0x0477, B:164:0x048f, B:170:0x04a2, B:172:0x04ad, B:189:0x0505, B:192:0x052e, B:194:0x0532, B:195:0x0535, B:178:0x04b4, B:199:0x053a, B:201:0x0568, B:204:0x0583, B:206:0x05d0, B:208:0x05dc, B:209:0x05df, B:162:0x0489, B:144:0x040b, B:146:0x0413, B:149:0x0437, B:152:0x044d, B:116:0x0365, B:82:0x02a5, B:87:0x02c5, B:88:0x02c8, B:90:0x02cf, B:92:0x02d9, B:99:0x030d, B:100:0x0312, B:103:0x0328, B:213:0x05e5, B:215:0x05e9, B:235:0x0636, B:237:0x063e, B:238:0x0641, B:241:0x0644, B:243:0x064c, B:247:0x0650, B:249:0x0658, B:250:0x065b, B:12:0x0075), top: B:274:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:180:0x04be  */
    /* JADX WARN: Code duplicated, block: B:182:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:185:0x04dc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:186:0x04de  */
    /* JADX WARN: Code duplicated, block: B:188:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:191:0x0520  */
    /* JADX WARN: Code duplicated, block: B:204:0x0583 A[Catch: Exception -> 0x0672, TRY_ENTER, TRY_LEAVE, TryCatch #7 {Exception -> 0x0672, blocks: (B:3:0x0021, B:5:0x004b, B:8:0x006b, B:254:0x0660, B:14:0x007b, B:17:0x00a7, B:19:0x00c0, B:21:0x00df, B:24:0x00fd, B:26:0x0118, B:29:0x0139, B:31:0x0159, B:34:0x0173, B:37:0x0194, B:41:0x01a5, B:221:0x05f9, B:223:0x0612, B:226:0x0627, B:228:0x062c, B:233:0x0632, B:44:0x01c6, B:47:0x01d3, B:53:0x01f2, B:55:0x0209, B:58:0x0210, B:61:0x0221, B:64:0x023d, B:66:0x0250, B:68:0x0254, B:72:0x0258, B:76:0x0283, B:108:0x0339, B:112:0x0357, B:113:0x035b, B:118:0x036c, B:120:0x0389, B:122:0x03a3, B:125:0x03bd, B:127:0x03cf, B:129:0x03d6, B:131:0x03df, B:135:0x03fa, B:137:0x0403, B:154:0x0464, B:158:0x0477, B:164:0x048f, B:170:0x04a2, B:172:0x04ad, B:189:0x0505, B:192:0x052e, B:194:0x0532, B:195:0x0535, B:178:0x04b4, B:199:0x053a, B:201:0x0568, B:204:0x0583, B:206:0x05d0, B:208:0x05dc, B:209:0x05df, B:162:0x0489, B:144:0x040b, B:146:0x0413, B:149:0x0437, B:152:0x044d, B:116:0x0365, B:82:0x02a5, B:87:0x02c5, B:88:0x02c8, B:90:0x02cf, B:92:0x02d9, B:99:0x030d, B:100:0x0312, B:103:0x0328, B:213:0x05e5, B:215:0x05e9, B:235:0x0636, B:237:0x063e, B:238:0x0641, B:241:0x0644, B:243:0x064c, B:247:0x0650, B:249:0x0658, B:250:0x065b, B:12:0x0075), top: B:274:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:206:0x05d0 A[Catch: Exception -> 0x0672, TRY_ENTER, TRY_LEAVE, TryCatch #7 {Exception -> 0x0672, blocks: (B:3:0x0021, B:5:0x004b, B:8:0x006b, B:254:0x0660, B:14:0x007b, B:17:0x00a7, B:19:0x00c0, B:21:0x00df, B:24:0x00fd, B:26:0x0118, B:29:0x0139, B:31:0x0159, B:34:0x0173, B:37:0x0194, B:41:0x01a5, B:221:0x05f9, B:223:0x0612, B:226:0x0627, B:228:0x062c, B:233:0x0632, B:44:0x01c6, B:47:0x01d3, B:53:0x01f2, B:55:0x0209, B:58:0x0210, B:61:0x0221, B:64:0x023d, B:66:0x0250, B:68:0x0254, B:72:0x0258, B:76:0x0283, B:108:0x0339, B:112:0x0357, B:113:0x035b, B:118:0x036c, B:120:0x0389, B:122:0x03a3, B:125:0x03bd, B:127:0x03cf, B:129:0x03d6, B:131:0x03df, B:135:0x03fa, B:137:0x0403, B:154:0x0464, B:158:0x0477, B:164:0x048f, B:170:0x04a2, B:172:0x04ad, B:189:0x0505, B:192:0x052e, B:194:0x0532, B:195:0x0535, B:178:0x04b4, B:199:0x053a, B:201:0x0568, B:204:0x0583, B:206:0x05d0, B:208:0x05dc, B:209:0x05df, B:162:0x0489, B:144:0x040b, B:146:0x0413, B:149:0x0437, B:152:0x044d, B:116:0x0365, B:82:0x02a5, B:87:0x02c5, B:88:0x02c8, B:90:0x02cf, B:92:0x02d9, B:99:0x030d, B:100:0x0312, B:103:0x0328, B:213:0x05e5, B:215:0x05e9, B:235:0x0636, B:237:0x063e, B:238:0x0641, B:241:0x0644, B:243:0x064c, B:247:0x0650, B:249:0x0658, B:250:0x065b, B:12:0x0075), top: B:274:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:212:0x05e2  */
    /* JADX WARN: Code duplicated, block: B:226:0x0627 A[Catch: Exception -> 0x0672, TRY_ENTER, TRY_LEAVE, TryCatch #7 {Exception -> 0x0672, blocks: (B:3:0x0021, B:5:0x004b, B:8:0x006b, B:254:0x0660, B:14:0x007b, B:17:0x00a7, B:19:0x00c0, B:21:0x00df, B:24:0x00fd, B:26:0x0118, B:29:0x0139, B:31:0x0159, B:34:0x0173, B:37:0x0194, B:41:0x01a5, B:221:0x05f9, B:223:0x0612, B:226:0x0627, B:228:0x062c, B:233:0x0632, B:44:0x01c6, B:47:0x01d3, B:53:0x01f2, B:55:0x0209, B:58:0x0210, B:61:0x0221, B:64:0x023d, B:66:0x0250, B:68:0x0254, B:72:0x0258, B:76:0x0283, B:108:0x0339, B:112:0x0357, B:113:0x035b, B:118:0x036c, B:120:0x0389, B:122:0x03a3, B:125:0x03bd, B:127:0x03cf, B:129:0x03d6, B:131:0x03df, B:135:0x03fa, B:137:0x0403, B:154:0x0464, B:158:0x0477, B:164:0x048f, B:170:0x04a2, B:172:0x04ad, B:189:0x0505, B:192:0x052e, B:194:0x0532, B:195:0x0535, B:178:0x04b4, B:199:0x053a, B:201:0x0568, B:204:0x0583, B:206:0x05d0, B:208:0x05dc, B:209:0x05df, B:162:0x0489, B:144:0x040b, B:146:0x0413, B:149:0x0437, B:152:0x044d, B:116:0x0365, B:82:0x02a5, B:87:0x02c5, B:88:0x02c8, B:90:0x02cf, B:92:0x02d9, B:99:0x030d, B:100:0x0312, B:103:0x0328, B:213:0x05e5, B:215:0x05e9, B:235:0x0636, B:237:0x063e, B:238:0x0641, B:241:0x0644, B:243:0x064c, B:247:0x0650, B:249:0x0658, B:250:0x065b, B:12:0x0075), top: B:274:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:233:0x0632 A[Catch: Exception -> 0x0672, TRY_ENTER, TryCatch #7 {Exception -> 0x0672, blocks: (B:3:0x0021, B:5:0x004b, B:8:0x006b, B:254:0x0660, B:14:0x007b, B:17:0x00a7, B:19:0x00c0, B:21:0x00df, B:24:0x00fd, B:26:0x0118, B:29:0x0139, B:31:0x0159, B:34:0x0173, B:37:0x0194, B:41:0x01a5, B:221:0x05f9, B:223:0x0612, B:226:0x0627, B:228:0x062c, B:233:0x0632, B:44:0x01c6, B:47:0x01d3, B:53:0x01f2, B:55:0x0209, B:58:0x0210, B:61:0x0221, B:64:0x023d, B:66:0x0250, B:68:0x0254, B:72:0x0258, B:76:0x0283, B:108:0x0339, B:112:0x0357, B:113:0x035b, B:118:0x036c, B:120:0x0389, B:122:0x03a3, B:125:0x03bd, B:127:0x03cf, B:129:0x03d6, B:131:0x03df, B:135:0x03fa, B:137:0x0403, B:154:0x0464, B:158:0x0477, B:164:0x048f, B:170:0x04a2, B:172:0x04ad, B:189:0x0505, B:192:0x052e, B:194:0x0532, B:195:0x0535, B:178:0x04b4, B:199:0x053a, B:201:0x0568, B:204:0x0583, B:206:0x05d0, B:208:0x05dc, B:209:0x05df, B:162:0x0489, B:144:0x040b, B:146:0x0413, B:149:0x0437, B:152:0x044d, B:116:0x0365, B:82:0x02a5, B:87:0x02c5, B:88:0x02c8, B:90:0x02cf, B:92:0x02d9, B:99:0x030d, B:100:0x0312, B:103:0x0328, B:213:0x05e5, B:215:0x05e9, B:235:0x0636, B:237:0x063e, B:238:0x0641, B:241:0x0644, B:243:0x064c, B:247:0x0650, B:249:0x0658, B:250:0x065b, B:12:0x0075), top: B:274:0x0021 }] */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0312, code lost:
    
        r3.marital_status = 203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0316, code lost:
    
        r0 = 203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0319, code lost:
    
        r0 = ivas.gov.bisp.enumeration.fragments.FragmentRoster.a;
        r2 = (r0 & 97) + (r0 | 97);
        ivas.gov.bisp.enumeration.fragments.FragmentRoster.b = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0328, code lost:
    
        r3.marital_status = 200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x032a, code lost:
    
        r2 = ivas.gov.bisp.enumeration.fragments.FragmentRoster.b + 41;
        ivas.gov.bisp.enumeration.fragments.FragmentRoster.a = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0333, code lost:
    
        if ((r2 % 2) != 0) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0335, code lost:
    
        r2 = 2 / 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0337, code lost:
    
        r0 = 200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0339, code lost:
    
        r3.date_of_birth = r10;
        r2 = new java.text.SimpleDateFormat("dd-MM-yyyy");
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0342, code lost:
    
        r4 = ivas.gov.bisp.enumeration.fragments.FragmentRoster.a;
        r6 = ((r4 ^ 8) + ((r4 & 8) << 1)) - 1;
        ivas.gov.bisp.enumeration.fragments.FragmentRoster.b = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0072, code lost:
    
        if (r2.equalsIgnoreCase("Cnic Data Found In Nadra") != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0353, code lost:
    
        if ((r6 % 2) == 0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0355, code lost:
    
        r19 = 4607182418800017408(0x3ff0000000000000, double:1.0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0357, code lost:
    
        r2 = r2.parse(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x035b, code lost:
    
        r4 = java.util.Calendar.getInstance();
        r12 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0361, code lost:
    
        r12 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0362, code lost:
    
        r21 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0365, code lost:
    
        r19 = 0;
        r2 = r2.parse(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x036c, code lost:
    
        r4.setTimeInMillis(r2.getTime());
        r6 = r4.get(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0378, code lost:
    
        r7 = ivas.gov.bisp.enumeration.fragments.FragmentRoster.b;
        r15 = ((r7 & 121) - (~(-(-(r7 | 121))))) - 1;
        ivas.gov.bisp.enumeration.fragments.FragmentRoster.a = r15 % 128;
        r15 = r15 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0389, code lost:
    
        r7 = r4.get(2);
        r2 = r4.get(5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0392, code lost:
    
        r4 = ivas.gov.bisp.enumeration.fragments.FragmentRoster.b + 38;
        r21 = r10;
        r15 = (r4 ^ (-1)) + (r4 << 1);
        ivas.gov.bisp.enumeration.fragments.FragmentRoster.a = r15 % 128;
        r15 = r15 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x03a3, code lost:
    
        r6 = calculateAge(r2, r7, r6, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x03a7, code lost:
    
        r2 = ivas.gov.bisp.enumeration.fragments.FragmentRoster.a;
        r4 = r2 & 59;
        r2 = -(-(r2 | 59));
        r15 = ((r4 | r2) << 1) - (r2 ^ r4);
        ivas.gov.bisp.enumeration.fragments.FragmentRoster.b = r15 % 128;
        r15 = r15 % 2;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x03bb, code lost:
    
        r6 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x03bd, code lost:
    
        r3.age = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x03c1, code lost:
    
        r4 = (-2) - ((ivas.gov.bisp.enumeration.fragments.FragmentRoster.b + 14) ^ (-1));
        ivas.gov.bisp.enumeration.fragments.FragmentRoster.a = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x03d4, code lost:
    
        if (r9.equalsIgnoreCase("male") != true) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x03dd, code lost:
    
        if ((!r9.equalsIgnoreCase("female")) != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x03e5, code lost:
    
        if (r9.equalsIgnoreCase("transgender") != true) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x03e7, code lost:
    
        r2 = ivas.gov.bisp.enumeration.fragments.FragmentRoster.b;
        r10 = r2 & 81;
        r2 = r2 | 81;
        r15 = ((r10 | r2) << 1) - (r2 ^ r10);
        ivas.gov.bisp.enumeration.fragments.FragmentRoster.a = r15 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x03f8, code lost:
    
        if ((r15 % 2) == 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0403, code lost:
    
        r4 = 9 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0405, code lost:
    
        if (r9.equalsIgnoreCase("eunuch male") == true) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0079, code lost:
    
        if (r2.equalsIgnoreCase("Cnic Data Found In Nadra") != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0411, code lost:
    
        if (r9.equalsIgnoreCase("eunuch male") != false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0413, code lost:
    
        r3.gender = "transgender";
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0417, code lost:
    
        r2 = ivas.gov.bisp.enumeration.fragments.FragmentRoster.a + 111;
        ivas.gov.bisp.enumeration.fragments.FragmentRoster.b = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0422, code lost:
    
        r2 = ivas.gov.bisp.enumeration.fragments.FragmentRoster.a;
        r4 = r2 & 63;
        r2 = (((r2 | 63) & (~r4)) - (~(-(-(r4 << 1))))) - 1;
        ivas.gov.bisp.enumeration.fragments.FragmentRoster.b = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0437, code lost:
    
        r3.gender = "female";
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007b, code lost:
    
        r3 = new org.json.JSONObject(r3.getString("data".toLowerCase()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x043c, code lost:
    
        r2 = ivas.gov.bisp.enumeration.fragments.FragmentRoster.b;
        r4 = (r2 & 2) + (r2 | 2);
        r2 = (r4 ^ (-1)) + (r4 << 1);
        ivas.gov.bisp.enumeration.fragments.FragmentRoster.a = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x044d, code lost:
    
        r3.gender = "male";
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0451, code lost:
    
        r2 = ivas.gov.bisp.enumeration.fragments.FragmentRoster.b;
        r4 = ((r2 | 76) << 1) - (r2 ^ 76);
        r2 = (r4 ^ (-1)) + (r4 << 1);
        ivas.gov.bisp.enumeration.fragments.FragmentRoster.a = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x046b, code lost:
    
        if (r8.equalsIgnoreCase("t") != true) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x046d, code lost:
    
        r2 = ivas.gov.bisp.enumeration.fragments.FragmentRoster.a + 79;
        ivas.gov.bisp.enumeration.fragments.FragmentRoster.b = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x047b, code lost:
    
        if (r8.equalsIgnoreCase(net.sqlcipher.BuildConfig.FLAVOR) != false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x008a, code lost:
    
        r2 = ivas.gov.bisp.enumeration.fragments.FragmentRoster.a;
        r5 = ((r2 ^ 25) | (r2 & 25)) << 1;
        r2 = -(((~r2) & 25) | (r2 & (-26)));
        r7 = (r5 & r2) + (r2 | r5);
        ivas.gov.bisp.enumeration.fragments.FragmentRoster.b = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x047d, code lost:
    
        r2 = ivas.gov.bisp.enumeration.fragments.FragmentRoster.a + 55;
        ivas.gov.bisp.enumeration.fragments.FragmentRoster.b = r2 % 128;
        r2 = r2 % 2;
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0489, code lost:
    
        r3.disability = 6;
        r14 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x048e, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x048f, code lost:
    
        r3.disability = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0491, code lost:
    
        r14 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0492, code lost:
    
        if (r24 == false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0494, code lost:
    
        if (r5 != null) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0496, code lost:
    
        r2 = ivas.gov.bisp.enumeration.fragments.FragmentRoster.b + 3;
        ivas.gov.bisp.enumeration.fragments.FragmentRoster.a = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x04a0, code lost:
    
        if ((r2 % 2) == 0) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a5, code lost:
    
        if ((r7 % 2) != 0) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x04ad, code lost:
    
        r3 = 54 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x04ae, code lost:
    
        if (r5.trim().isEmpty() == false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x04bc, code lost:
    
        if (r5.trim().isEmpty() == false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a7, code lost:
    
        r7 = r3.getString("name".toLowerCase());
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x04be, code lost:
    
        r2 = ivas.gov.bisp.enumeration.fragments.FragmentRoster.a;
        r3 = r2 & 43;
        r2 = (r2 | 43) & (~r3);
        r3 = r3 << 1;
        r8 = ((r2 | r3) << 1) - (r2 ^ r3);
        r2 = r8 % 128;
        ivas.gov.bisp.enumeration.fragments.FragmentRoster.b = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x04d3, code lost:
    
        if ((r8 % 2) != 0) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x04d5, code lost:
    
        r3 = 27 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x04d9, code lost:
    
        if (r5 != "null") goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x04dc, code lost:
    
        if (r5 != "null") goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x04de, code lost:
    
        r3 = r2 & 117;
        r1 = ((r2 ^ 117) | r3) << 1;
        r2 = -((r2 | 117) & (~r3));
        r3 = ((r1 | r2) << 1) - (r1 ^ r2);
        ivas.gov.bisp.enumeration.fragments.FragmentRoster.a = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x04f5, code lost:
    
        if ((r3 % 2) != 0) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0505, code lost:
    
        saveBeneficiary(r11, r5, r12, r0, r9, r21, r6, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b1, code lost:
    
        r5 = ivas.gov.bisp.enumeration.fragments.FragmentRoster.b;
        r9 = r5 & 49;
        r9 = (r9 - (~((r5 ^ 49) | r9))) - 1;
        ivas.gov.bisp.enumeration.fragments.FragmentRoster.a = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0508, code lost:
    
        r0 = ivas.gov.bisp.enumeration.fragments.FragmentRoster.a;
        r1 = (r0 & (-98)) | ((~r0) & 97);
        r0 = (r0 & 97) << 1;
        r2 = (r1 & r0) + (r0 | r1);
        ivas.gov.bisp.enumeration.fragments.FragmentRoster.b = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x052e, code lost:
    
        saveBeneficiary(r11, r5, r12, r0, r9, r21, r6, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0531, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0532, code lost:
    
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0535, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0536, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0537, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0538, code lost:
    
        r19 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x053a, code lost:
    
        r4 = new android.widget.EditText(getActivity());
        r4.setHint("Enter English Name");
        r1 = new android.app.AlertDialog.Builder(getActivity()).setTitle("English Name Required");
        r2 = new java.lang.StringBuilder();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c0, code lost:
    
        r5 = r3.getString("nameEnglish".toLowerCase());
        r2 = "gender".toLowerCase();
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x055e, code lost:
    
        r5 = ivas.gov.bisp.enumeration.fragments.FragmentRoster.b + 53;
        ivas.gov.bisp.enumeration.fragments.FragmentRoster.a = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0568, code lost:
    
        r2.append("Urdu Name: ");
        r2.append(r12);
        r2.append("\n\nPlease enter the English name.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0573, code lost:
    
        r3 = ivas.gov.bisp.enumeration.fragments.FragmentRoster.a;
        r5 = r3 & 111;
        r5 = r5 + ((r3 ^ 111) | r5);
        ivas.gov.bisp.enumeration.fragments.FragmentRoster.b = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0581, code lost:
    
        if ((r5 % 2) == 0) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0583, code lost:
    
        r10 = r1.setMessage(r2.toString()).setView(r4).setCancelable(false).setPositiveButton("Save", (android.content.DialogInterface.OnClickListener) null).create();
        r10.setCanceledOnTouchOutside(false);
        r6 = r12;
        r7 = r0;
        r9 = r21;
        r12 = r14;
        r10.setOnShowListener(new ivas.gov.bisp.enumeration.bA.e(r22, r10, r4, r11, r6, r7, r9, r9, r19, r12));
        r10.show();
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x05bf, code lost:
    
        r0 = ivas.gov.bisp.enumeration.fragments.FragmentRoster.a;
        r1 = ((r0 ^ 12) + ((r0 & 12) << 1)) - 1;
        ivas.gov.bisp.enumeration.fragments.FragmentRoster.b = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x05d0, code lost:
    
        r1.setMessage(r2.toString()).setView(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x05db, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x05dc, code lost:
    
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x05df, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ce, code lost:
    
        r9 = ivas.gov.bisp.enumeration.fragments.FragmentRoster.a;
        r10 = r9 & 39;
        r9 = (((r9 | 39) & (~r10)) - (~(r10 << 1))) - 1;
        ivas.gov.bisp.enumeration.fragments.FragmentRoster.b = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x05e0, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x05e1, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x05e5, code lost:
    
        r2.equalsIgnoreCase("null");
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x05e9, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x05ea, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x05ec, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x05ed, code lost:
    
        r1 = "Citizen Validation";
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00df, code lost:
    
        r9 = r3.getString(r2);
        r10 = r3.getString("age".toLowerCase());
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x05f4, code lost:
    
        r1 = "Citizen Validation";
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x05f9, code lost:
    
        showDialog(r1, r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x05fc, code lost:
    
        r0 = ivas.gov.bisp.enumeration.fragments.FragmentRoster.a;
        r1 = r0 & 33;
        r0 = (r0 | 33) & (~r1);
        r1 = -(-(r1 << 1));
        r2 = (r0 & r1) + (r0 | r1);
        ivas.gov.bisp.enumeration.fragments.FragmentRoster.b = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0612, code lost:
    
        r0 = r22.mAdapter;
        r1 = r22.activityBeginSurvey.aq;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0618, code lost:
    
        r2 = ivas.gov.bisp.enumeration.fragments.FragmentRoster.b;
        r3 = (r2 & 107) + (r2 | 107);
        ivas.gov.bisp.enumeration.fragments.FragmentRoster.a = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0625, code lost:
    
        if ((r3 % 2) == 0) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0627, code lost:
    
        r0.h(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x062c, code lost:
    
        r0 = 29 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x062e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ed, code lost:
    
        r2 = ivas.gov.bisp.enumeration.fragments.FragmentRoster.b;
        r11 = r2 & 25;
        r11 = r11 + ((r2 ^ 25) | r11);
        ivas.gov.bisp.enumeration.fragments.FragmentRoster.a = r11 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0632, code lost:
    
        r0.h(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0635, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0636, code lost:
    
        r3.getString("citizennumber").replace("-", net.sqlcipher.BuildConfig.FLAVOR);
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x063d, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x063e, code lost:
    
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0641, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0642, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00fb, code lost:
    
        if ((r11 % 2) == 0) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0643, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0644, code lost:
    
        r3.getString("martial_Status".toLowerCase());
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x064c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x064d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x064f, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0650, code lost:
    
        r3.getString("name".toLowerCase());
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0657, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0658, code lost:
    
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00fd, code lost:
    
        r2 = r3.getString("martial_Status".toLowerCase());
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x065b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x065c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x065d, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0660, code lost:
    
        showDialog("Citizen Validation", "Citizen data against this member not fetched from NADRA.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0663, code lost:
    
        r0 = ivas.gov.bisp.enumeration.fragments.FragmentRoster.b;
        r1 = ((r0 | 9) << 1) - (r0 ^ 9);
        ivas.gov.bisp.enumeration.fragments.FragmentRoster.a = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0672, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0105, code lost:
    
        r8 = ivas.gov.bisp.enumeration.fragments.FragmentRoster.a;
        r11 = r8 ^ 67;
        r8 = ((r8 & 67) | r11) << 1;
        r11 = -r11;
        r8 = (r8 & r11) + (r8 | r11);
        ivas.gov.bisp.enumeration.fragments.FragmentRoster.b = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0118, code lost:
    
        r8 = r3.getString("disability".toLowerCase());
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0124, code lost:
    
        r17 = ivas.gov.bisp.enumeration.fragments.FragmentRoster.b + 84;
        r12 = (r17 ^ (-1)) + (r17 << 1);
        ivas.gov.bisp.enumeration.fragments.FragmentRoster.a = r12 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0137, code lost:
    
        if ((r12 % 2) == 0) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0139, code lost:
    
        r11 = r3.getString("citizennumber").replace("-", net.sqlcipher.BuildConfig.FLAVOR);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0141, code lost:
    
        r3 = ivas.gov.bisp.enumeration.fragments.FragmentRoster.b;
        r19 = "Citizen data against this member not fetched from NADRA.";
        r4 = ((~r3) & 41) | (r3 & (-42));
        r3 = (r3 & 41) << 1;
        r12 = (r4 & r3) + (r3 | r4);
        ivas.gov.bisp.enumeration.fragments.FragmentRoster.a = r12 % 128;
        r12 = r12 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x015d, code lost:
    
        if (r7.equalsIgnoreCase("null") != false) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x015f, code lost:
    
        r3 = ivas.gov.bisp.enumeration.fragments.FragmentRoster.a;
        r4 = r3 & 115;
        r3 = -(-(r3 | 115));
        r12 = (r4 ^ r3) + ((r3 & r4) << 1);
        ivas.gov.bisp.enumeration.fragments.FragmentRoster.b = r12 % 128;
        r12 = r12 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0177, code lost:
    
        if (r9.equalsIgnoreCase("null") != false) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0179, code lost:
    
        r3 = ivas.gov.bisp.enumeration.fragments.FragmentRoster.b;
        r12 = r3 & 121;
        r4 = ((r3 ^ 121) | r12) << 1;
        r3 = -((r3 | 121) & (~r12));
        r12 = (r4 ^ r3) + ((r3 & r4) << 1);
        ivas.gov.bisp.enumeration.fragments.FragmentRoster.a = r12 % 128;
        r12 = r12 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0198, code lost:
    
        if (r10.equalsIgnoreCase("null") == true) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x019a, code lost:
    
        r4 = ivas.gov.bisp.enumeration.fragments.FragmentRoster.a + 33;
        ivas.gov.bisp.enumeration.fragments.FragmentRoster.b = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01a3, code lost:
    
        if ((r4 % 2) != 0) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01a9, code lost:
    
        if (r2.equalsIgnoreCase("null") == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01ab, code lost:
    
        r0 = ivas.gov.bisp.enumeration.fragments.FragmentRoster.b;
        r1 = r0 & 121;
        r1 = (r1 - (~(-(-((r0 ^ 121) | r1))))) - 1;
        ivas.gov.bisp.enumeration.fragments.FragmentRoster.a = r1 % 128;
        r1 = r1 % 2;
        r1 = "Citizen Validation";
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01d0, code lost:
    
        if (r11.equals(r22.validatingRosterCnic.replace("-", net.sqlcipher.BuildConfig.FLAVOR)) != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01d2, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01d3, code lost:
    
        r3 = findRosterByCnic(r22.validatingRosterCnic);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01d9, code lost:
    
        if (r3 != null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01db, code lost:
    
        r0 = ivas.gov.bisp.enumeration.fragments.FragmentRoster.b;
        r0 = (-2) - (((r0 & 34) + (r0 | 34)) ^ (-1));
        ivas.gov.bisp.enumeration.fragments.FragmentRoster.a = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01ec, code lost:
    
        if ((r0 % 2) != 0) goto L287;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01ee, code lost:
    
        r0 = 7 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01f1, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01f2, code lost:
    
        r4 = r3.cnic.replace("-", net.sqlcipher.BuildConfig.FLAVOR);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01f8, code lost:
    
        r6 = ivas.gov.bisp.enumeration.fragments.FragmentRoster.a;
        r12 = r6 & 27;
        r6 = ((r6 | 27) & (~r12)) + (r12 << 1);
        ivas.gov.bisp.enumeration.fragments.FragmentRoster.b = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x020d, code lost:
    
        if (r11.equals(r4) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x020f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0210, code lost:
    
        r3.setValidatedFromNadra(true);
        r3.cnic_valid_english_name = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0215, code lost:
    
        r4 = ivas.gov.bisp.enumeration.fragments.FragmentRoster.b + 53;
        ivas.gov.bisp.enumeration.fragments.FragmentRoster.a = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x021f, code lost:
    
        if (r24 == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0221, code lost:
    
        r4 = r22.sessionManager.f();
        r6 = new ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.CitizenData(r3.cnic, r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x022e, code lost:
    
        r0 = ivas.gov.bisp.enumeration.fragments.FragmentRoster.a;
        r12 = (r0 & 41) + (r0 | 41);
        ivas.gov.bisp.enumeration.fragments.FragmentRoster.b = r12 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x023b, code lost:
    
        if ((r12 % 2) != 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x023d, code lost:
    
        r4.add(r6);
        r22.sessionManager.C(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0245, code lost:
    
        r0 = ivas.gov.bisp.enumeration.fragments.FragmentRoster.a + 1;
        ivas.gov.bisp.enumeration.fragments.FragmentRoster.b = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0250, code lost:
    
        r4.add(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0254, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0255, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0257, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0258, code lost:
    
        r0 = r2.equalsIgnoreCase("Widowed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x025e, code lost:
    
        r4 = ivas.gov.bisp.enumeration.fragments.FragmentRoster.a;
        r6 = (r4 & 87) + (r4 | 87);
        ivas.gov.bisp.enumeration.fragments.FragmentRoster.b = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x026b, code lost:
    
        if (r0 == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x026d, code lost:
    
        r0 = (((r4 | 43) << 1) - (~(-(((~r4) & 43) | (r4 & (-44)))))) - 1;
        ivas.gov.bisp.enumeration.fragments.FragmentRoster.b = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0283, code lost:
    
        r3.marital_status = 202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0285, code lost:
    
        r0 = ivas.gov.bisp.enumeration.fragments.FragmentRoster.a;
        r4 = r0 + 79;
        ivas.gov.bisp.enumeration.fragments.FragmentRoster.b = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x028e, code lost:
    
        if ((r4 % 2) != 0) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0290, code lost:
    
        r4 = ((r0 | 97) << 1) - (r0 ^ 97);
        ivas.gov.bisp.enumeration.fragments.FragmentRoster.b = r4 % 128;
        r4 = r4 % 2;
        r0 = 202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x02a0, code lost:
    
        r0 = null;
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x02a4, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x02ab, code lost:
    
        if (r2.equalsIgnoreCase("Married") == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x02ad, code lost:
    
        r0 = ivas.gov.bisp.enumeration.fragments.FragmentRoster.a;
        r4 = r0 & 115;
        r2 = (((r0 ^ 115) | r4) << 1) - ((r0 | 115) & (~r4));
        ivas.gov.bisp.enumeration.fragments.FragmentRoster.b = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x02c1, code lost:
    
        if ((r2 % 2) == 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x02c5, code lost:
    
        r3.marital_status = 29658;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02c8, code lost:
    
        r3.marital_status = 201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02cc, code lost:
    
        r0 = 201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02d7, code lost:
    
        if ((!r2.equalsIgnoreCase("Unmarried")) == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02e0, code lost:
    
        if ((!r2.equalsIgnoreCase("divorced")) == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x02e2, code lost:
    
        r0 = ivas.gov.bisp.enumeration.fragments.FragmentRoster.a;
        r2 = (r0 ^ 63) + ((r0 & 63) << 1);
        ivas.gov.bisp.enumeration.fragments.FragmentRoster.b = r2 % 128;
        r2 = r2 % 2;
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x02f2, code lost:
    
        r0 = ivas.gov.bisp.enumeration.fragments.FragmentRoster.b;
        r2 = (((r0 & (-50)) | ((~r0) & 49)) - (~(-(-((r0 & 49) << 1))))) - 1;
        ivas.gov.bisp.enumeration.fragments.FragmentRoster.a = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0309, code lost:
    
        if ((r2 % 2) != 0) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x030d, code lost:
    
        r3.marital_status = 22390;
        r0 = 8044;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4, types: [double] */
    /* JADX WARN: Type inference failed for: r19v5, types: [double] */
    /* JADX WARN: Type inference failed for: r19v6, types: [double] */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r19v8 */
    /* JADX WARN: Type inference failed for: r19v9 */
    /* JADX WARN: Type inference failed for: r22v0, types: [android.app.Fragment, ivas.gov.bisp.enumeration.fragments.FragmentRoster] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19, types: [double] */
    /* JADX WARN: Type inference failed for: r6v32 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void setValidationDataToMainModel(java.lang.String r23, boolean r24) {
        /*
            Method dump skipped, instruction units count: 1651
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.fragments.FragmentRoster.setValidationDataToMainModel(java.lang.String, boolean):void");
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02d7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:101:0x02d8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:102:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:104:0x02df  */
    /* JADX WARN: Code duplicated, block: B:107:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:109:0x0308  */
    /* JADX WARN: Code duplicated, block: B:111:0x0323  */
    /* JADX WARN: Code duplicated, block: B:113:0x0332  */
    /* JADX WARN: Code duplicated, block: B:114:0x033e  */
    /* JADX WARN: Code duplicated, block: B:117:0x035b  */
    /* JADX WARN: Code duplicated, block: B:120:0x0372  */
    /* JADX WARN: Code duplicated, block: B:121:0x0374  */
    /* JADX WARN: Code duplicated, block: B:123:0x038a  */
    /* JADX WARN: Code duplicated, block: B:125:0x03bf A[LOOP:3: B:105:0x02ee->B:125:0x03bf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:126:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:129:0x040e  */
    /* JADX WARN: Code duplicated, block: B:131:0x0412  */
    /* JADX WARN: Code duplicated, block: B:133:0x0428  */
    /* JADX WARN: Code duplicated, block: B:136:0x0444  */
    /* JADX WARN: Code duplicated, block: B:144:0x0475  */
    /* JADX WARN: Code duplicated, block: B:146:0x0484 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:148:0x0487 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:149:0x0489  */
    /* JADX WARN: Code duplicated, block: B:152:0x0490  */
    /* JADX WARN: Code duplicated, block: B:154:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:157:0x04af  */
    /* JADX WARN: Code duplicated, block: B:180:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:187:0x017b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x0167 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x0167 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x0167 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x0167 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x0154 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x0154 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x01f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x01d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x03f3 A[EDGE_INSN: B:201:0x03f3->B:127:0x03f3 BREAK  A[LOOP:3: B:105:0x02ee->B:125:0x03bf], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x04bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x04bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x04c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:0x04c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:36:0x0101  */
    /* JADX WARN: Code duplicated, block: B:38:0x0110  */
    /* JADX WARN: Code duplicated, block: B:41:0x011e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0128  */
    /* JADX WARN: Code duplicated, block: B:45:0x013c  */
    /* JADX WARN: Code duplicated, block: B:48:0x014a  */
    /* JADX WARN: Code duplicated, block: B:55:0x0183  */
    /* JADX WARN: Code duplicated, block: B:57:0x0191  */
    /* JADX WARN: Code duplicated, block: B:58:0x0195  */
    /* JADX WARN: Code duplicated, block: B:61:0x019e  */
    /* JADX WARN: Code duplicated, block: B:63:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:65:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:66:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:72:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:74:0x0212  */
    /* JADX WARN: Code duplicated, block: B:76:0x021f  */
    /* JADX WARN: Code duplicated, block: B:78:0x022b  */
    /* JADX WARN: Code duplicated, block: B:80:0x0237  */
    /* JADX WARN: Code duplicated, block: B:82:0x023d  */
    /* JADX WARN: Code duplicated, block: B:84:0x0261  */
    /* JADX WARN: Code duplicated, block: B:86:0x0269  */
    /* JADX WARN: Code duplicated, block: B:88:0x0277 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x0279  */
    /* JADX WARN: Code duplicated, block: B:91:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:93:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:95:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:97:0x02bd  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v85 */
    /* JADX WARN: Type inference failed for: r3v86 */
    /* JADX WARN: Type inference failed for: r3v87 */
    /* JADX WARN: Type inference failed for: r3v88 */
    /* JADX WARN: Type inference failed for: r3v89 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r3v90 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v79 */
    /* JADX WARN: Type inference failed for: r7v80 */
    /* JADX WARN: Type inference failed for: r7v81 */
    /* JADX WARN: Type inference failed for: r7v85 */
    /* JADX WARN: Type inference failed for: r7v86 */
    /* JADX WARN: Type inference failed for: r7v87 */
    @Override // ivas.gov.bisp.enumeration.X.e
    public boolean isValid() {
        int i;
        ?? r1;
        Object obj;
        ?? r3;
        ?? r7;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Boolean bool;
        int i13;
        int i14;
        Toast toastMakeText;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22 = 2 % 2;
        ActivityBeginSurvey activityBeginSurvey = this.activityBeginSurvey;
        ArrayList<Roster> arrayList = activityBeginSurvey.aq;
        int i23 = activityBeginSurvey.ac;
        int i24 = 0;
        if (i23 != 1) {
            int i25 = b;
            int i26 = (((i25 | 14) << 1) - (i25 ^ 14)) - 1;
            a = i26 % 128;
            if (i26 % 2 != 0 ? i23 == 2 : i23 == 2) {
                i = 0;
                while (true) {
                    if (i >= arrayList.size()) {
                        r1 = true;
                        break;
                    }
                    int i27 = b + 124;
                    i20 = (i27 ^ (-1)) + (i27 << 1);
                    a = i20 % 128;
                    if (i20 % 2 == 0) {
                        int i28 = 26 / 0;
                        if (arrayList.get(i).relation_to_household_id != 0) {
                            int i29 = b;
                            int i30 = i29 & 117;
                            int i31 = -(-(i29 | 117));
                            i21 = ((i30 | i31) << 1) - (i31 ^ i30);
                            a = i21 % 128;
                            if (i21 % 2 == 0) {
                                int i32 = 68 / 0;
                                if (arrayList.get(i).chronic_disease != 0) {
                                    int i33 = i & (-62);
                                    int i34 = (((i ^ (-62)) | i33) << 1) - ((i | (-62)) & (~i33));
                                    i = (((i34 | 64) << 1) - (i34 ^ 64)) - 1;
                                }
                            } else if (arrayList.get(i).chronic_disease != 0) {
                                int i35 = i & (-62);
                                int i36 = (((i ^ (-62)) | i35) << 1) - ((i | (-62)) & (~i35));
                                i = (((i36 | 64) << 1) - (i36 ^ 64)) - 1;
                            }
                        }
                    } else if (arrayList.get(i).relation_to_household_id != 0) {
                        int i210 = b;
                        int i37 = i210 & 117;
                        int i38 = -(-(i210 | 117));
                        i21 = ((i37 | i38) << 1) - (i38 ^ i37);
                        a = i21 % 128;
                        if (i21 % 2 == 0) {
                            int i39 = 68 / 0;
                            if (arrayList.get(i).chronic_disease != 0) {
                                int i310 = i & (-62);
                                int i311 = (((i ^ (-62)) | i310) << 1) - ((i | (-62)) & (~i310));
                                i = (((i311 | 64) << 1) - (i311 ^ 64)) - 1;
                            }
                        } else if (arrayList.get(i).chronic_disease != 0) {
                            int i312 = i & (-62);
                            int i313 = (((i ^ (-62)) | i312) << 1) - ((i | (-62)) & (~i312));
                            i = (((i313 | 64) << 1) - (i313 ^ 64)) - 1;
                        }
                    }
                    int i40 = b;
                    int i41 = i40 & 57;
                    int i42 = (((i40 ^ 57) | i41) << 1) - ((i40 | 57) & (~i41));
                    a = i42 % 128;
                    int i43 = i42 % 2;
                    r1 = false;
                    break;
                }
                obj = null;
                if (arrayList.size() > 0) {
                    int i44 = b;
                    i17 = (i44 & 9) + (i44 | 9);
                    a = i17 % 128;
                    if (i17 % 2 == 0) {
                        r3 = false;
                        r7 = false;
                        i18 = 1;
                    } else {
                        r3 = false;
                        i18 = 0;
                        r7 = true;
                    }
                    while (i18 < arrayList.size()) {
                        int i45 = a;
                        i19 = (i45 ^ 7) + ((i45 & 7) << 1);
                        b = i19 % 128;
                        if (i19 % 2 != 0) {
                            int i46 = arrayList.get(i18).relation_to_household_id;
                            obj.hashCode();
                            throw null;
                        }
                        if (arrayList.get(i18).relation_to_household_id == 186) {
                            r3 = true;
                        } else if (arrayList.get(i18).mobile_no == null) {
                            int i47 = b;
                            int i48 = (i47 & 13) + (i47 | 13);
                            a = i48 % 128;
                            int i49 = i48 % 2;
                            r7 = false;
                        }
                        i18 = (((i18 ^ 1) | (i18 & 1)) << 1) - (((~i18) & 1) | (i18 & (-2)));
                        int i50 = a;
                        int i51 = i50 & 45;
                        int i52 = (i51 - (~(-(-((i50 ^ 45) | i51))))) - 1;
                        b = i52 % 128;
                        int i53 = i52 % 2;
                    }
                } else {
                    int i54 = b;
                    int i55 = i54 & 11;
                    int i56 = -(-(i54 | 11));
                    int i57 = (i55 & i56) + (i56 | i55);
                    a = i57 % 128;
                    int i58 = i57 % 2;
                    r3 = false;
                    r7 = true;
                }
                if (r3 != true) {
                    i16 = a + 41;
                    b = i16 % 128;
                    if (i16 % 2 != 0) {
                        Toast.makeText(getActivity(), "Please Select Atleast one Head of HouseHold", 1).show();
                        return true;
                    }
                    Toast.makeText(getActivity(), "Please Select Atleast one Head of HouseHold", 0).show();
                    return false;
                }
                if (arrayList.size() == 0) {
                    int i59 = b;
                    int i60 = ((i59 | 49) << 1) - (i59 ^ 49);
                    a = i60 % 128;
                    int i61 = i60 % 2;
                    Toast.makeText(getActivity(), "Please Add at least One Roster", 0).show();
                    int i62 = b + 23;
                    a = i62 % 128;
                    int i63 = i62 % 2;
                    return false;
                }
                if (arrayList.size() < ag.k) {
                    Toast.makeText(getActivity(), "Please Add all members as mentioned in previous tab", 0).show();
                    return false;
                }
                if (r1 != true) {
                    int i64 = b;
                    int i65 = i64 & 35;
                    int i66 = -(-(i64 | 35));
                    int i67 = ((i65 | i66) << 1) - (i66 ^ i65);
                    a = i67 % 128;
                    int i68 = i67 % 2;
                    Toast.makeText(getActivity(), "Please complete your roster data", 0).show();
                    int i69 = a + 1;
                    b = i69 % 128;
                    int i70 = i69 % 2;
                    return false;
                }
                if (r7 != true) {
                    i14 = b + 57;
                    a = i14 % 128;
                    if (i14 % 2 == 0) {
                        toastMakeText = Toast.makeText(getActivity(), "Please complete your roster data Mobile Number", 1);
                    } else {
                        toastMakeText = Toast.makeText(getActivity(), "Please complete your roster data Mobile Number", 0);
                    }
                    toastMakeText.show();
                    int i71 = b;
                    int i72 = i71 | 5;
                    i15 = (i72 << 1) - ((~(5 & i71)) & i72);
                    a = i15 % 128;
                    if (i15 % 2 == 0) {
                        return true;
                    }
                    return false;
                }
                if (arrayList.size() > 0) {
                    int i73 = b;
                    int i74 = ((i73 | 11) << 1) - (i73 ^ 11);
                    a = i74 % 128;
                    int i75 = i74 % 2;
                    i11 = 0;
                    i2 = 0;
                    while (i11 < arrayList.size()) {
                        int i76 = arrayList.get(i11).relation_to_household_id;
                        if (isNetworkAvailable(getActivity())) {
                            int i77 = b;
                            int i78 = ((i77 | 93) << 1) - (i77 ^ 93);
                            a = i78 % 128;
                            int i79 = i78 % 2;
                            if (arrayList.get(i11).cnic.equalsIgnoreCase(BuildConfig.FLAVOR)) {
                                int i80 = b;
                                int i81 = i80 & 29;
                                int i82 = (i80 | 29) & (~i81);
                                int i83 = i81 << 1;
                                int i84 = (i82 ^ i83) + ((i82 & i83) << 1);
                                a = i84 % 128;
                                int i85 = i84 % 2;
                                i2 = 0;
                            } else {
                                int i86 = a;
                                i12 = ((i86 | 53) << 1) - (i86 ^ 53);
                                b = i12 % 128;
                                if (i12 % 2 != 0) {
                                    bool = arrayList.get(i11).cnic_valid;
                                    int i87 = 18 / 0;
                                } else {
                                    bool = arrayList.get(i11).cnic_valid;
                                }
                                int i88 = a;
                                int i89 = ((i88 ^ 20) + ((i88 & 20) << 1)) - 1;
                                b = i89 % 128;
                                int i90 = i89 % 2;
                                if (bool.booleanValue()) {
                                    int i91 = a;
                                    int i92 = i91 & 11;
                                    int i93 = (i91 | 11) & (~i92);
                                    int i94 = -(-(i92 << 1));
                                    i13 = (i93 & i94) + (i93 | i94);
                                    b = i13 % 128;
                                    if (i13 % 2 == 0) {
                                        i2 = 1;
                                    }
                                } else {
                                    int i810 = b;
                                    int i811 = i810 & 29;
                                    int i812 = (i810 | 29) & (~i811);
                                    int i813 = i811 << 1;
                                    int i814 = (i812 ^ i813) + ((i812 & i813) << 1);
                                    a = i814 % 128;
                                    int i815 = i814 % 2;
                                }
                                i2 = 0;
                            }
                        } else {
                            String str = arrayList.get(i11).cnic;
                            int i95 = a;
                            int i96 = i95 & 41;
                            int i97 = i96 + ((i95 ^ 41) | i96);
                            b = i97 % 128;
                            int i98 = i97 % 2;
                            boolean zEqualsIgnoreCase = str.equalsIgnoreCase(BuildConfig.FLAVOR);
                            int i99 = (zEqualsIgnoreCase ? 1 : 0) & 1;
                            i2 = ((!zEqualsIgnoreCase ? 1 : 0) | i99) & (~i99);
                            int i100 = a;
                            int i101 = (((i100 | 21) << 1) - (~(-(((~i100) & 21) | (i100 & (-22)))))) - 1;
                            b = i101 % 128;
                            int i102 = i101 % 2;
                        }
                        if (i2 != 0) {
                            break;
                        }
                        int i103 = i11 & 1;
                        i11 = ((((i11 ^ 1) | i103) << 1) - (~(-((i11 | 1) & (~i103))))) - 1;
                        int i104 = a;
                        int i105 = i104 & 23;
                        int i106 = i104 | 23;
                        int i107 = ((i105 | i106) << 1) - (i106 ^ i105);
                        b = i107 % 128;
                        int i108 = i107 % 2;
                    }
                } else {
                    int i109 = b;
                    int i110 = i109 & 119;
                    int i111 = (((i109 | 119) & (~i110)) - (~(i110 << 1))) - 1;
                    a = i111 % 128;
                    int i112 = i111 % 2;
                    i2 = 0;
                }
                i3 = this.sessionManager.c.getInt("k_count", 0);
                int i113 = a;
                i4 = ((i113 ^ 6) + ((i113 & 6) << 1)) - 1;
                i5 = i4 % 128;
                b = i5;
                if (i4 % 2 != 0) {
                    this.surveyCountWithoutCNIC = i3;
                    obj.hashCode();
                    throw null;
                }
                this.surveyCountWithoutCNIC = i3;
                if (i2 == 0) {
                    int i114 = (i5 | 39) << 1;
                    int i115 = -((i5 & (-40)) | ((~i5) & 39));
                    i10 = ((i114 | i115) << 1) - (i114 ^ i115);
                    a = i10 % 128;
                    try {
                        if (i10 % 2 == 0) {
                            Objects.requireNonNull((BISPApplication) getActivity().getApplicationContext());
                            throw null;
                        }
                        Objects.requireNonNull((BISPApplication) getActivity().getApplicationContext());
                        int i116 = a;
                        int i117 = ((i116 ^ 1) - (~((i116 & 1) << 1))) - 1;
                        b = i117 % 128;
                        int i118 = i117 % 2;
                        int i119 = this.surveyCountWithoutCNIC;
                        this.surveyCountWithoutCNIC = (((i119 | 2) << 1) - (i119 ^ 2)) - 1;
                        int i120 = b;
                        int i121 = i120 & 29;
                        int i122 = i120 | 29;
                        int i123 = (i121 & i122) + (i122 | i121);
                        a = i123 % 128;
                        int i124 = i123 % 2;
                    } catch (Exception unused) {
                    }
                }
                ag.r = false;
                i6 = this.activityBeginSurvey.ac;
                if (i6 != 1) {
                    int i125 = a;
                    i9 = (i125 ^ 81) + ((i125 & 81) << 1);
                    b = i9 % 128;
                    if (i9 % 2 != 0 ? i6 == 2 : i6 == 5) {
                        i7 = 0;
                        while (i7 < arrayList.size()) {
                            int i126 = b;
                            int i127 = i126 & 47;
                            int i128 = (i126 ^ 47) | i127;
                            i8 = (i127 & i128) + (i128 | i127);
                            a = i8 % 128;
                            if (i8 % 2 == 0) {
                                if (arrayList.get(i7).employment_status == 32) {
                                    int i129 = b + 61;
                                    a = i129 % 128;
                                    int i130 = i129 % 2;
                                    ag.r = true;
                                    break;
                                }
                                int i131 = i7 + 24;
                                i7 = (i131 | (-23)) + (i131 & (-23));
                                int i132 = b;
                                int i133 = i132 & 15;
                                int i134 = (i132 | 15) & (~i133);
                                int i135 = -(-(i133 << 1));
                                int i136 = ((i134 | i135) << 1) - (i134 ^ i135);
                                a = i136 % 128;
                                int i137 = i136 % 2;
                            } else {
                                if (arrayList.get(i7).employment_status == 58) {
                                    int i1210 = b + 61;
                                    a = i1210 % 128;
                                    int i138 = i1210 % 2;
                                    ag.r = true;
                                    break;
                                }
                                int i139 = i7 + 24;
                                i7 = (i139 | (-23)) + (i139 & (-23));
                                int i1310 = b;
                                int i1311 = i1310 & 15;
                                int i1312 = (i1310 | 15) & (~i1311);
                                int i1313 = -(-(i1311 << 1));
                                int i1314 = ((i1312 | i1313) << 1) - (i1312 ^ i1313);
                                a = i1314 % 128;
                                int i1315 = i1314 % 2;
                            }
                        }
                    }
                } else {
                    i7 = 0;
                    while (i7 < arrayList.size()) {
                        int i1211 = b;
                        int i1212 = i1211 & 47;
                        int i1213 = (i1211 ^ 47) | i1212;
                        i8 = (i1212 & i1213) + (i1213 | i1212);
                        a = i8 % 128;
                        if (i8 % 2 == 0) {
                            if (arrayList.get(i7).employment_status == 32) {
                                int i1214 = b + 61;
                                a = i1214 % 128;
                                int i1316 = i1214 % 2;
                                ag.r = true;
                                break;
                            }
                            int i1317 = i7 + 24;
                            i7 = (i1317 | (-23)) + (i1317 & (-23));
                            int i1318 = b;
                            int i1319 = i1318 & 15;
                            int i13110 = (i1318 | 15) & (~i1319);
                            int i13111 = -(-(i1319 << 1));
                            int i13112 = ((i13110 | i13111) << 1) - (i13110 ^ i13111);
                            a = i13112 % 128;
                            int i13113 = i13112 % 2;
                        } else {
                            if (arrayList.get(i7).employment_status == 58) {
                                int i1215 = b + 61;
                                a = i1215 % 128;
                                int i13114 = i1215 % 2;
                                ag.r = true;
                                break;
                            }
                            int i13115 = i7 + 24;
                            i7 = (i13115 | (-23)) + (i13115 & (-23));
                            int i13116 = b;
                            int i13117 = i13116 & 15;
                            int i13118 = (i13116 | 15) & (~i13117);
                            int i13119 = -(-(i13117 << 1));
                            int i131110 = ((i13118 | i13119) << 1) - (i13118 ^ i13119);
                            a = i131110 % 128;
                            int i131111 = i131110 % 2;
                        }
                    }
                }
            } else if (ag.d) {
                i = 0;
                while (true) {
                    if (i >= arrayList.size()) {
                        r1 = true;
                        break;
                    }
                    int i211 = b + 124;
                    i20 = (i211 ^ (-1)) + (i211 << 1);
                    a = i20 % 128;
                    if (i20 % 2 == 0) {
                        int i212 = 26 / 0;
                        if (arrayList.get(i).relation_to_household_id != 0) {
                            int i213 = b;
                            int i314 = i213 & 117;
                            int i315 = -(-(i213 | 117));
                            i21 = ((i314 | i315) << 1) - (i315 ^ i314);
                            a = i21 % 128;
                            if (i21 % 2 == 0) {
                                int i316 = 68 / 0;
                                if (arrayList.get(i).chronic_disease != 0) {
                                    int i317 = i & (-62);
                                    int i318 = (((i ^ (-62)) | i317) << 1) - ((i | (-62)) & (~i317));
                                    i = (((i318 | 64) << 1) - (i318 ^ 64)) - 1;
                                }
                            } else if (arrayList.get(i).chronic_disease != 0) {
                                int i319 = i & (-62);
                                int i3110 = (((i ^ (-62)) | i319) << 1) - ((i | (-62)) & (~i319));
                                i = (((i3110 | 64) << 1) - (i3110 ^ 64)) - 1;
                            }
                        }
                    } else if (arrayList.get(i).relation_to_household_id != 0) {
                        int i214 = b;
                        int i3111 = i214 & 117;
                        int i3112 = -(-(i214 | 117));
                        i21 = ((i3111 | i3112) << 1) - (i3112 ^ i3111);
                        a = i21 % 128;
                        if (i21 % 2 == 0) {
                            int i3113 = 68 / 0;
                            if (arrayList.get(i).chronic_disease != 0) {
                                int i3114 = i & (-62);
                                int i3115 = (((i ^ (-62)) | i3114) << 1) - ((i | (-62)) & (~i3114));
                                i = (((i3115 | 64) << 1) - (i3115 ^ 64)) - 1;
                            }
                        } else if (arrayList.get(i).chronic_disease != 0) {
                            int i3116 = i & (-62);
                            int i3117 = (((i ^ (-62)) | i3116) << 1) - ((i | (-62)) & (~i3116));
                            i = (((i3117 | 64) << 1) - (i3117 ^ 64)) - 1;
                        }
                    }
                    int i410 = b;
                    int i411 = i410 & 57;
                    int i412 = (((i410 ^ 57) | i411) << 1) - ((i410 | 57) & (~i411));
                    a = i412 % 128;
                    int i413 = i412 % 2;
                    r1 = false;
                    break;
                }
                obj = null;
                if (arrayList.size() > 0) {
                    int i414 = b;
                    i17 = (i414 & 9) + (i414 | 9);
                    a = i17 % 128;
                    if (i17 % 2 == 0) {
                        r3 = false;
                        r7 = false;
                        i18 = 1;
                    } else {
                        r3 = false;
                        i18 = 0;
                        r7 = true;
                    }
                    while (i18 < arrayList.size()) {
                        int i415 = a;
                        i19 = (i415 ^ 7) + ((i415 & 7) << 1);
                        b = i19 % 128;
                        if (i19 % 2 != 0) {
                            int i416 = arrayList.get(i18).relation_to_household_id;
                            obj.hashCode();
                            throw null;
                        }
                        if (arrayList.get(i18).relation_to_household_id == 186) {
                            r3 = true;
                        } else if (arrayList.get(i18).mobile_no == null) {
                            int i417 = b;
                            int i418 = (i417 & 13) + (i417 | 13);
                            a = i418 % 128;
                            int i419 = i418 % 2;
                            r7 = false;
                        }
                        i18 = (((i18 ^ 1) | (i18 & 1)) << 1) - (((~i18) & 1) | (i18 & (-2)));
                        int i510 = a;
                        int i511 = i510 & 45;
                        int i512 = (i511 - (~(-(-((i510 ^ 45) | i511))))) - 1;
                        b = i512 % 128;
                        int i513 = i512 % 2;
                    }
                } else {
                    int i514 = b;
                    int i515 = i514 & 11;
                    int i516 = -(-(i514 | 11));
                    int i517 = (i515 & i516) + (i516 | i515);
                    a = i517 % 128;
                    int i518 = i517 % 2;
                    r3 = false;
                    r7 = true;
                }
                if (r3 != true) {
                    i16 = a + 41;
                    b = i16 % 128;
                    if (i16 % 2 != 0) {
                        Toast.makeText(getActivity(), "Please Select Atleast one Head of HouseHold", 1).show();
                        return true;
                    }
                    Toast.makeText(getActivity(), "Please Select Atleast one Head of HouseHold", 0).show();
                    return false;
                }
                if (arrayList.size() == 0) {
                    int i519 = b;
                    int i610 = ((i519 | 49) << 1) - (i519 ^ 49);
                    a = i610 % 128;
                    int i611 = i610 % 2;
                    Toast.makeText(getActivity(), "Please Add at least One Roster", 0).show();
                    int i612 = b + 23;
                    a = i612 % 128;
                    int i613 = i612 % 2;
                    return false;
                }
                if (arrayList.size() < ag.k) {
                    Toast.makeText(getActivity(), "Please Add all members as mentioned in previous tab", 0).show();
                    return false;
                }
                if (r1 != true) {
                    int i614 = b;
                    int i615 = i614 & 35;
                    int i616 = -(-(i614 | 35));
                    int i617 = ((i615 | i616) << 1) - (i616 ^ i615);
                    a = i617 % 128;
                    int i618 = i617 % 2;
                    Toast.makeText(getActivity(), "Please complete your roster data", 0).show();
                    int i619 = a + 1;
                    b = i619 % 128;
                    int i710 = i619 % 2;
                    return false;
                }
                if (r7 != true) {
                    i14 = b + 57;
                    a = i14 % 128;
                    if (i14 % 2 == 0) {
                        toastMakeText = Toast.makeText(getActivity(), "Please complete your roster data Mobile Number", 1);
                    } else {
                        toastMakeText = Toast.makeText(getActivity(), "Please complete your roster data Mobile Number", 0);
                    }
                    toastMakeText.show();
                    int i711 = b;
                    int i712 = i711 | 5;
                    i15 = (i712 << 1) - ((~(5 & i711)) & i712);
                    a = i15 % 128;
                    if (i15 % 2 == 0) {
                        return true;
                    }
                    return false;
                }
                if (arrayList.size() > 0) {
                    int i713 = b;
                    int i714 = ((i713 | 11) << 1) - (i713 ^ 11);
                    a = i714 % 128;
                    int i715 = i714 % 2;
                    i11 = 0;
                    i2 = 0;
                    while (i11 < arrayList.size()) {
                        int i716 = arrayList.get(i11).relation_to_household_id;
                        if (isNetworkAvailable(getActivity())) {
                            int i717 = b;
                            int i718 = ((i717 | 93) << 1) - (i717 ^ 93);
                            a = i718 % 128;
                            int i719 = i718 % 2;
                            if (arrayList.get(i11).cnic.equalsIgnoreCase(BuildConfig.FLAVOR)) {
                                int i816 = a;
                                i12 = ((i816 | 53) << 1) - (i816 ^ 53);
                                b = i12 % 128;
                                if (i12 % 2 != 0) {
                                    bool = arrayList.get(i11).cnic_valid;
                                    int i817 = 18 / 0;
                                } else {
                                    bool = arrayList.get(i11).cnic_valid;
                                }
                                int i818 = a;
                                int i819 = ((i818 ^ 20) + ((i818 & 20) << 1)) - 1;
                                b = i819 % 128;
                                int i910 = i819 % 2;
                                if (bool.booleanValue()) {
                                    int i911 = a;
                                    int i912 = i911 & 11;
                                    int i913 = (i911 | 11) & (~i912);
                                    int i914 = -(-(i912 << 1));
                                    i13 = (i913 & i914) + (i913 | i914);
                                    b = i13 % 128;
                                    if (i13 % 2 == 0) {
                                        i2 = 1;
                                    }
                                } else {
                                    int i8110 = b;
                                    int i8111 = i8110 & 29;
                                    int i8112 = (i8110 | 29) & (~i8111);
                                    int i8113 = i8111 << 1;
                                    int i8114 = (i8112 ^ i8113) + ((i8112 & i8113) << 1);
                                    a = i8114 % 128;
                                    int i8115 = i8114 % 2;
                                }
                                i2 = 0;
                            } else {
                                int i8116 = b;
                                int i8117 = i8116 & 29;
                                int i8118 = (i8116 | 29) & (~i8117);
                                int i8119 = i8117 << 1;
                                int i81110 = (i8118 ^ i8119) + ((i8118 & i8119) << 1);
                                a = i81110 % 128;
                                int i81111 = i81110 % 2;
                                i2 = 0;
                            }
                        } else {
                            String str2 = arrayList.get(i11).cnic;
                            int i915 = a;
                            int i916 = i915 & 41;
                            int i917 = i916 + ((i915 ^ 41) | i916);
                            b = i917 % 128;
                            int i918 = i917 % 2;
                            boolean zEqualsIgnoreCase2 = str2.equalsIgnoreCase(BuildConfig.FLAVOR);
                            int i919 = (zEqualsIgnoreCase2 ? 1 : 0) & 1;
                            i2 = ((!zEqualsIgnoreCase2 ? 1 : 0) | i919) & (~i919);
                            int i1010 = a;
                            int i1011 = (((i1010 | 21) << 1) - (~(-(((~i1010) & 21) | (i1010 & (-22)))))) - 1;
                            b = i1011 % 128;
                            int i1012 = i1011 % 2;
                        }
                        if (i2 != 0) {
                            break;
                            break;
                        }
                        int i1013 = i11 & 1;
                        i11 = ((((i11 ^ 1) | i1013) << 1) - (~(-((i11 | 1) & (~i1013))))) - 1;
                        int i1014 = a;
                        int i1015 = i1014 & 23;
                        int i1016 = i1014 | 23;
                        int i1017 = ((i1015 | i1016) << 1) - (i1016 ^ i1015);
                        b = i1017 % 128;
                        int i1018 = i1017 % 2;
                    }
                } else {
                    int i1019 = b;
                    int i1110 = i1019 & 119;
                    int i1111 = (((i1019 | 119) & (~i1110)) - (~(i1110 << 1))) - 1;
                    a = i1111 % 128;
                    int i1112 = i1111 % 2;
                    i2 = 0;
                }
                i3 = this.sessionManager.c.getInt("k_count", 0);
                int i1113 = a;
                i4 = ((i1113 ^ 6) + ((i1113 & 6) << 1)) - 1;
                i5 = i4 % 128;
                b = i5;
                if (i4 % 2 != 0) {
                    this.surveyCountWithoutCNIC = i3;
                    obj.hashCode();
                    throw null;
                }
                this.surveyCountWithoutCNIC = i3;
                if (i2 == 0) {
                    int i1114 = (i5 | 39) << 1;
                    int i1115 = -((i5 & (-40)) | ((~i5) & 39));
                    i10 = ((i1114 | i1115) << 1) - (i1114 ^ i1115);
                    a = i10 % 128;
                    if (i10 % 2 == 0) {
                        Objects.requireNonNull((BISPApplication) getActivity().getApplicationContext());
                        throw null;
                    }
                    Objects.requireNonNull((BISPApplication) getActivity().getApplicationContext());
                    int i1116 = a;
                    int i1117 = ((i1116 ^ 1) - (~((i1116 & 1) << 1))) - 1;
                    b = i1117 % 128;
                    int i1118 = i1117 % 2;
                    int i1119 = this.surveyCountWithoutCNIC;
                    this.surveyCountWithoutCNIC = (((i1119 | 2) << 1) - (i1119 ^ 2)) - 1;
                    int i1216 = b;
                    int i1217 = i1216 & 29;
                    int i1218 = i1216 | 29;
                    int i1219 = (i1217 & i1218) + (i1218 | i1217);
                    a = i1219 % 128;
                    int i1220 = i1219 % 2;
                }
                ag.r = false;
                i6 = this.activityBeginSurvey.ac;
                if (i6 != 1) {
                    int i1221 = a;
                    i9 = (i1221 ^ 81) + ((i1221 & 81) << 1);
                    b = i9 % 128;
                    if (i9 % 2 != 0) {
                        i7 = 0;
                        while (i7 < arrayList.size()) {
                            int i12110 = b;
                            int i12111 = i12110 & 47;
                            int i12112 = (i12110 ^ 47) | i12111;
                            i8 = (i12111 & i12112) + (i12112 | i12111);
                            a = i8 % 128;
                            if (i8 % 2 == 0) {
                                if (arrayList.get(i7).employment_status == 32) {
                                    int i12113 = b + 61;
                                    a = i12113 % 128;
                                    int i131112 = i12113 % 2;
                                    ag.r = true;
                                    break;
                                }
                                int i131113 = i7 + 24;
                                i7 = (i131113 | (-23)) + (i131113 & (-23));
                                int i131114 = b;
                                int i131115 = i131114 & 15;
                                int i131116 = (i131114 | 15) & (~i131115);
                                int i131117 = -(-(i131115 << 1));
                                int i131118 = ((i131116 | i131117) << 1) - (i131116 ^ i131117);
                                a = i131118 % 128;
                                int i131119 = i131118 % 2;
                            } else {
                                if (arrayList.get(i7).employment_status == 58) {
                                    int i12114 = b + 61;
                                    a = i12114 % 128;
                                    int i1311110 = i12114 % 2;
                                    ag.r = true;
                                    break;
                                }
                                int i1311111 = i7 + 24;
                                i7 = (i1311111 | (-23)) + (i1311111 & (-23));
                                int i1311112 = b;
                                int i1311113 = i1311112 & 15;
                                int i1311114 = (i1311112 | 15) & (~i1311113);
                                int i1311115 = -(-(i1311113 << 1));
                                int i1311116 = ((i1311114 | i1311115) << 1) - (i1311114 ^ i1311115);
                                a = i1311116 % 128;
                                int i1311117 = i1311116 % 2;
                            }
                        }
                    } else {
                        i7 = 0;
                        while (i7 < arrayList.size()) {
                            int i12115 = b;
                            int i12116 = i12115 & 47;
                            int i12117 = (i12115 ^ 47) | i12116;
                            i8 = (i12116 & i12117) + (i12117 | i12116);
                            a = i8 % 128;
                            if (i8 % 2 == 0) {
                                if (arrayList.get(i7).employment_status == 32) {
                                    int i12118 = b + 61;
                                    a = i12118 % 128;
                                    int i1311118 = i12118 % 2;
                                    ag.r = true;
                                    break;
                                }
                                int i1311119 = i7 + 24;
                                i7 = (i1311119 | (-23)) + (i1311119 & (-23));
                                int i13111110 = b;
                                int i13111111 = i13111110 & 15;
                                int i13111112 = (i13111110 | 15) & (~i13111111);
                                int i13111113 = -(-(i13111111 << 1));
                                int i13111114 = ((i13111112 | i13111113) << 1) - (i13111112 ^ i13111113);
                                a = i13111114 % 128;
                                int i13111115 = i13111114 % 2;
                            } else {
                                if (arrayList.get(i7).employment_status == 58) {
                                    int i12119 = b + 61;
                                    a = i12119 % 128;
                                    int i13111116 = i12119 % 2;
                                    ag.r = true;
                                    break;
                                }
                                int i13111117 = i7 + 24;
                                i7 = (i13111117 | (-23)) + (i13111117 & (-23));
                                int i13111118 = b;
                                int i13111119 = i13111118 & 15;
                                int i131111110 = (i13111118 | 15) & (~i13111119);
                                int i131111111 = -(-(i13111119 << 1));
                                int i131111112 = ((i131111110 | i131111111) << 1) - (i131111110 ^ i131111111);
                                a = i131111112 % 128;
                                int i131111113 = i131111112 % 2;
                            }
                        }
                    }
                } else {
                    i7 = 0;
                    while (i7 < arrayList.size()) {
                        int i121110 = b;
                        int i121111 = i121110 & 47;
                        int i121112 = (i121110 ^ 47) | i121111;
                        i8 = (i121111 & i121112) + (i121112 | i121111);
                        a = i8 % 128;
                        if (i8 % 2 == 0) {
                            if (arrayList.get(i7).employment_status == 32) {
                                int i121113 = b + 61;
                                a = i121113 % 128;
                                int i131111114 = i121113 % 2;
                                ag.r = true;
                                break;
                            }
                            int i131111115 = i7 + 24;
                            i7 = (i131111115 | (-23)) + (i131111115 & (-23));
                            int i131111116 = b;
                            int i131111117 = i131111116 & 15;
                            int i131111118 = (i131111116 | 15) & (~i131111117);
                            int i131111119 = -(-(i131111117 << 1));
                            int i1311111110 = ((i131111118 | i131111119) << 1) - (i131111118 ^ i131111119);
                            a = i1311111110 % 128;
                            int i1311111111 = i1311111110 % 2;
                        } else {
                            if (arrayList.get(i7).employment_status == 58) {
                                int i121114 = b + 61;
                                a = i121114 % 128;
                                int i1311111112 = i121114 % 2;
                                ag.r = true;
                                break;
                            }
                            int i1311111113 = i7 + 24;
                            i7 = (i1311111113 | (-23)) + (i1311111113 & (-23));
                            int i1311111114 = b;
                            int i1311111115 = i1311111114 & 15;
                            int i1311111116 = (i1311111114 | 15) & (~i1311111115);
                            int i1311111117 = -(-(i1311111115 << 1));
                            int i1311111118 = ((i1311111116 | i1311111117) << 1) - (i1311111116 ^ i1311111117);
                            a = i1311111118 % 128;
                            int i1311111119 = i1311111118 % 2;
                        }
                    }
                }
            } else {
                List<Roster> list = activityBeginSurvey.aG.rosterList;
                if (list != null) {
                    int i140 = a + 87;
                    b = i140 % 128;
                    int i141 = i140 % 2;
                    if (list.size() > 0) {
                        int i142 = a;
                        int i143 = i142 & 49;
                        int i144 = -(-(i142 | 49));
                        int i145 = ((i143 | i144) << 1) - (i144 ^ i143);
                        b = i145 % 128;
                        int i146 = i145 % 2;
                        if (arrayList.size() <= 0) {
                            Toast.makeText(getActivity(), "Please Validate Member", 0).show();
                            return false;
                        }
                        int i147 = a;
                        int i148 = (-2) - (((i147 ^ 30) + ((i147 & 30) << 1)) ^ (-1));
                        b = i148 % 128;
                        int i149 = i148 % 2;
                        int size = this.activityBeginSurvey.aG.rosterList.size();
                        int i150 = a;
                        int i151 = ((i150 | 91) << 1) - (i150 ^ 91);
                        b = i151 % 128;
                        if (i151 % 2 == 0 ? size <= 2 : size <= 4) {
                            int size2 = this.activityBeginSurvey.aG.rosterList.size();
                            int i152 = b + 7;
                            a = i152 % 128;
                            int i153 = i152 % 2;
                            if (size2 > arrayList.size()) {
                                Toast.makeText(getActivity(), "Please Validate Next Member", 0).show();
                                int i154 = b;
                                int i155 = ((i154 & 76) + (i154 | 76)) - 1;
                                a = i155 % 128;
                                int i156 = i155 % 2;
                                return false;
                            }
                        } else if (arrayList.size() != 2) {
                            int i157 = b;
                            int i158 = ((i157 & 52) + (i157 | 52)) - 1;
                            a = i158 % 128;
                            int i159 = i158 % 2;
                            Toast toastMakeText2 = Toast.makeText(getActivity(), "Please Validate Next Member", 0);
                            int i160 = a;
                            int i161 = i160 & 121;
                            int i162 = (i160 | 121) & (~i161);
                            int i163 = i161 << 1;
                            int i164 = ((i162 | i163) << 1) - (i162 ^ i163);
                            b = i164 % 128;
                            int i165 = i164 % 2;
                            toastMakeText2.show();
                            return false;
                        }
                    }
                }
            }
        } else {
            i = 0;
            while (true) {
                if (i >= arrayList.size()) {
                    r1 = true;
                    break;
                }
                int i215 = b + 124;
                i20 = (i215 ^ (-1)) + (i215 << 1);
                a = i20 % 128;
                if (i20 % 2 == 0) {
                    int i216 = 26 / 0;
                    if (arrayList.get(i).relation_to_household_id != 0) {
                        int i217 = b;
                        int i3118 = i217 & 117;
                        int i3119 = -(-(i217 | 117));
                        i21 = ((i3118 | i3119) << 1) - (i3119 ^ i3118);
                        a = i21 % 128;
                        if (i21 % 2 == 0) {
                            int i31110 = 68 / 0;
                            if (arrayList.get(i).chronic_disease != 0) {
                                int i31111 = i & (-62);
                                int i31112 = (((i ^ (-62)) | i31111) << 1) - ((i | (-62)) & (~i31111));
                                i = (((i31112 | 64) << 1) - (i31112 ^ 64)) - 1;
                            }
                        } else if (arrayList.get(i).chronic_disease != 0) {
                            int i31113 = i & (-62);
                            int i31114 = (((i ^ (-62)) | i31113) << 1) - ((i | (-62)) & (~i31113));
                            i = (((i31114 | 64) << 1) - (i31114 ^ 64)) - 1;
                        }
                    }
                } else if (arrayList.get(i).relation_to_household_id != 0) {
                    int i218 = b;
                    int i31115 = i218 & 117;
                    int i31116 = -(-(i218 | 117));
                    i21 = ((i31115 | i31116) << 1) - (i31116 ^ i31115);
                    a = i21 % 128;
                    if (i21 % 2 == 0) {
                        int i31117 = 68 / 0;
                        if (arrayList.get(i).chronic_disease != 0) {
                            int i31118 = i & (-62);
                            int i31119 = (((i ^ (-62)) | i31118) << 1) - ((i | (-62)) & (~i31118));
                            i = (((i31119 | 64) << 1) - (i31119 ^ 64)) - 1;
                        }
                    } else if (arrayList.get(i).chronic_disease != 0) {
                        int i311110 = i & (-62);
                        int i311111 = (((i ^ (-62)) | i311110) << 1) - ((i | (-62)) & (~i311110));
                        i = (((i311111 | 64) << 1) - (i311111 ^ 64)) - 1;
                    }
                }
                int i4110 = b;
                int i4111 = i4110 & 57;
                int i4112 = (((i4110 ^ 57) | i4111) << 1) - ((i4110 | 57) & (~i4111));
                a = i4112 % 128;
                int i4113 = i4112 % 2;
                r1 = false;
                break;
            }
            obj = null;
            if (arrayList.size() > 0) {
                int i4114 = b;
                i17 = (i4114 & 9) + (i4114 | 9);
                a = i17 % 128;
                if (i17 % 2 == 0) {
                    r3 = false;
                    r7 = false;
                    i18 = 1;
                } else {
                    r3 = false;
                    i18 = 0;
                    r7 = true;
                }
                while (i18 < arrayList.size()) {
                    int i4115 = a;
                    i19 = (i4115 ^ 7) + ((i4115 & 7) << 1);
                    b = i19 % 128;
                    if (i19 % 2 != 0) {
                        int i4116 = arrayList.get(i18).relation_to_household_id;
                        obj.hashCode();
                        throw null;
                    }
                    if (arrayList.get(i18).relation_to_household_id == 186) {
                        r3 = true;
                    } else if (arrayList.get(i18).mobile_no == null) {
                        int i4117 = b;
                        int i4118 = (i4117 & 13) + (i4117 | 13);
                        a = i4118 % 128;
                        int i4119 = i4118 % 2;
                        r7 = false;
                    }
                    i18 = (((i18 ^ 1) | (i18 & 1)) << 1) - (((~i18) & 1) | (i18 & (-2)));
                    int i5110 = a;
                    int i5111 = i5110 & 45;
                    int i5112 = (i5111 - (~(-(-((i5110 ^ 45) | i5111))))) - 1;
                    b = i5112 % 128;
                    int i5113 = i5112 % 2;
                }
            } else {
                int i5114 = b;
                int i5115 = i5114 & 11;
                int i5116 = -(-(i5114 | 11));
                int i5117 = (i5115 & i5116) + (i5116 | i5115);
                a = i5117 % 128;
                int i5118 = i5117 % 2;
                r3 = false;
                r7 = true;
            }
            if (r3 != true) {
                i16 = a + 41;
                b = i16 % 128;
                if (i16 % 2 != 0) {
                    Toast.makeText(getActivity(), "Please Select Atleast one Head of HouseHold", 1).show();
                    return true;
                }
                Toast.makeText(getActivity(), "Please Select Atleast one Head of HouseHold", 0).show();
                return false;
            }
            if (arrayList.size() == 0) {
                int i5119 = b;
                int i6110 = ((i5119 | 49) << 1) - (i5119 ^ 49);
                a = i6110 % 128;
                int i6111 = i6110 % 2;
                Toast.makeText(getActivity(), "Please Add at least One Roster", 0).show();
                int i6112 = b + 23;
                a = i6112 % 128;
                int i6113 = i6112 % 2;
                return false;
            }
            if (arrayList.size() < ag.k) {
                Toast.makeText(getActivity(), "Please Add all members as mentioned in previous tab", 0).show();
                return false;
            }
            if (r1 != true) {
                int i6114 = b;
                int i6115 = i6114 & 35;
                int i6116 = -(-(i6114 | 35));
                int i6117 = ((i6115 | i6116) << 1) - (i6116 ^ i6115);
                a = i6117 % 128;
                int i6118 = i6117 % 2;
                Toast.makeText(getActivity(), "Please complete your roster data", 0).show();
                int i6119 = a + 1;
                b = i6119 % 128;
                int i7110 = i6119 % 2;
                return false;
            }
            if (r7 != true) {
                i14 = b + 57;
                a = i14 % 128;
                if (i14 % 2 == 0) {
                    toastMakeText = Toast.makeText(getActivity(), "Please complete your roster data Mobile Number", 1);
                } else {
                    toastMakeText = Toast.makeText(getActivity(), "Please complete your roster data Mobile Number", 0);
                }
                toastMakeText.show();
                int i7111 = b;
                int i7112 = i7111 | 5;
                i15 = (i7112 << 1) - ((~(5 & i7111)) & i7112);
                a = i15 % 128;
                if (i15 % 2 == 0) {
                    return true;
                }
                return false;
            }
            if (arrayList.size() > 0) {
                int i7113 = b;
                int i7114 = ((i7113 | 11) << 1) - (i7113 ^ 11);
                a = i7114 % 128;
                int i7115 = i7114 % 2;
                i11 = 0;
                i2 = 0;
                while (i11 < arrayList.size()) {
                    int i7116 = arrayList.get(i11).relation_to_household_id;
                    if (isNetworkAvailable(getActivity())) {
                        int i7117 = b;
                        int i7118 = ((i7117 | 93) << 1) - (i7117 ^ 93);
                        a = i7118 % 128;
                        int i7119 = i7118 % 2;
                        if (arrayList.get(i11).cnic.equalsIgnoreCase(BuildConfig.FLAVOR)) {
                            int i8120 = a;
                            i12 = ((i8120 | 53) << 1) - (i8120 ^ 53);
                            b = i12 % 128;
                            if (i12 % 2 != 0) {
                                bool = arrayList.get(i11).cnic_valid;
                                int i8121 = 18 / 0;
                            } else {
                                bool = arrayList.get(i11).cnic_valid;
                            }
                            int i8122 = a;
                            int i8123 = ((i8122 ^ 20) + ((i8122 & 20) << 1)) - 1;
                            b = i8123 % 128;
                            int i9110 = i8123 % 2;
                            if (bool.booleanValue()) {
                                int i9111 = a;
                                int i9112 = i9111 & 11;
                                int i9113 = (i9111 | 11) & (~i9112);
                                int i9114 = -(-(i9112 << 1));
                                i13 = (i9113 & i9114) + (i9113 | i9114);
                                b = i13 % 128;
                                if (i13 % 2 == 0) {
                                    i2 = 1;
                                }
                            } else {
                                int i81112 = b;
                                int i81113 = i81112 & 29;
                                int i81114 = (i81112 | 29) & (~i81113);
                                int i81115 = i81113 << 1;
                                int i81116 = (i81114 ^ i81115) + ((i81114 & i81115) << 1);
                                a = i81116 % 128;
                                int i81117 = i81116 % 2;
                            }
                            i2 = 0;
                        } else {
                            int i81118 = b;
                            int i81119 = i81118 & 29;
                            int i811110 = (i81118 | 29) & (~i81119);
                            int i811111 = i81119 << 1;
                            int i811112 = (i811110 ^ i811111) + ((i811110 & i811111) << 1);
                            a = i811112 % 128;
                            int i811113 = i811112 % 2;
                            i2 = 0;
                        }
                    } else {
                        String str3 = arrayList.get(i11).cnic;
                        int i9115 = a;
                        int i9116 = i9115 & 41;
                        int i9117 = i9116 + ((i9115 ^ 41) | i9116);
                        b = i9117 % 128;
                        int i9118 = i9117 % 2;
                        boolean zEqualsIgnoreCase3 = str3.equalsIgnoreCase(BuildConfig.FLAVOR);
                        int i9119 = (zEqualsIgnoreCase3 ? 1 : 0) & 1;
                        i2 = ((!zEqualsIgnoreCase3 ? 1 : 0) | i9119) & (~i9119);
                        int i10110 = a;
                        int i10111 = (((i10110 | 21) << 1) - (~(-(((~i10110) & 21) | (i10110 & (-22)))))) - 1;
                        b = i10111 % 128;
                        int i10112 = i10111 % 2;
                    }
                    if (i2 != 0) {
                        break;
                        break;
                    }
                    int i10113 = i11 & 1;
                    i11 = ((((i11 ^ 1) | i10113) << 1) - (~(-((i11 | 1) & (~i10113))))) - 1;
                    int i10114 = a;
                    int i10115 = i10114 & 23;
                    int i10116 = i10114 | 23;
                    int i10117 = ((i10115 | i10116) << 1) - (i10116 ^ i10115);
                    b = i10117 % 128;
                    int i10118 = i10117 % 2;
                }
            } else {
                int i10119 = b;
                int i11110 = i10119 & 119;
                int i11111 = (((i10119 | 119) & (~i11110)) - (~(i11110 << 1))) - 1;
                a = i11111 % 128;
                int i11112 = i11111 % 2;
                i2 = 0;
            }
            i3 = this.sessionManager.c.getInt("k_count", 0);
            int i11113 = a;
            i4 = ((i11113 ^ 6) + ((i11113 & 6) << 1)) - 1;
            i5 = i4 % 128;
            b = i5;
            if (i4 % 2 != 0) {
                this.surveyCountWithoutCNIC = i3;
                obj.hashCode();
                throw null;
            }
            this.surveyCountWithoutCNIC = i3;
            if (i2 == 0) {
                int i11114 = (i5 | 39) << 1;
                int i11115 = -((i5 & (-40)) | ((~i5) & 39));
                i10 = ((i11114 | i11115) << 1) - (i11114 ^ i11115);
                a = i10 % 128;
                if (i10 % 2 == 0) {
                    Objects.requireNonNull((BISPApplication) getActivity().getApplicationContext());
                    throw null;
                }
                Objects.requireNonNull((BISPApplication) getActivity().getApplicationContext());
                int i11116 = a;
                int i11117 = ((i11116 ^ 1) - (~((i11116 & 1) << 1))) - 1;
                b = i11117 % 128;
                int i11118 = i11117 % 2;
                int i11119 = this.surveyCountWithoutCNIC;
                this.surveyCountWithoutCNIC = (((i11119 | 2) << 1) - (i11119 ^ 2)) - 1;
                int i12120 = b;
                int i12121 = i12120 & 29;
                int i12122 = i12120 | 29;
                int i12123 = (i12121 & i12122) + (i12122 | i12121);
                a = i12123 % 128;
                int i1222 = i12123 % 2;
            }
            ag.r = false;
            i6 = this.activityBeginSurvey.ac;
            if (i6 != 1) {
                int i1223 = a;
                i9 = (i1223 ^ 81) + ((i1223 & 81) << 1);
                b = i9 % 128;
                if (i9 % 2 != 0) {
                    i7 = 0;
                    while (i7 < arrayList.size()) {
                        int i121115 = b;
                        int i121116 = i121115 & 47;
                        int i121117 = (i121115 ^ 47) | i121116;
                        i8 = (i121116 & i121117) + (i121117 | i121116);
                        a = i8 % 128;
                        if (i8 % 2 == 0) {
                            if (arrayList.get(i7).employment_status == 32) {
                                int i121118 = b + 61;
                                a = i121118 % 128;
                                int i13111111110 = i121118 % 2;
                                ag.r = true;
                                break;
                            }
                            int i13111111111 = i7 + 24;
                            i7 = (i13111111111 | (-23)) + (i13111111111 & (-23));
                            int i13111111112 = b;
                            int i13111111113 = i13111111112 & 15;
                            int i13111111114 = (i13111111112 | 15) & (~i13111111113);
                            int i13111111115 = -(-(i13111111113 << 1));
                            int i13111111116 = ((i13111111114 | i13111111115) << 1) - (i13111111114 ^ i13111111115);
                            a = i13111111116 % 128;
                            int i13111111117 = i13111111116 % 2;
                        } else {
                            if (arrayList.get(i7).employment_status == 58) {
                                int i121119 = b + 61;
                                a = i121119 % 128;
                                int i13111111118 = i121119 % 2;
                                ag.r = true;
                                break;
                            }
                            int i13111111119 = i7 + 24;
                            i7 = (i13111111119 | (-23)) + (i13111111119 & (-23));
                            int i131111111110 = b;
                            int i131111111111 = i131111111110 & 15;
                            int i131111111112 = (i131111111110 | 15) & (~i131111111111);
                            int i131111111113 = -(-(i131111111111 << 1));
                            int i131111111114 = ((i131111111112 | i131111111113) << 1) - (i131111111112 ^ i131111111113);
                            a = i131111111114 % 128;
                            int i131111111115 = i131111111114 % 2;
                        }
                    }
                } else {
                    i7 = 0;
                    while (i7 < arrayList.size()) {
                        int i1211110 = b;
                        int i1211111 = i1211110 & 47;
                        int i1211112 = (i1211110 ^ 47) | i1211111;
                        i8 = (i1211111 & i1211112) + (i1211112 | i1211111);
                        a = i8 % 128;
                        if (i8 % 2 == 0) {
                            if (arrayList.get(i7).employment_status == 32) {
                                int i1211113 = b + 61;
                                a = i1211113 % 128;
                                int i131111111116 = i1211113 % 2;
                                ag.r = true;
                                break;
                            }
                            int i131111111117 = i7 + 24;
                            i7 = (i131111111117 | (-23)) + (i131111111117 & (-23));
                            int i131111111118 = b;
                            int i131111111119 = i131111111118 & 15;
                            int i1311111111110 = (i131111111118 | 15) & (~i131111111119);
                            int i1311111111111 = -(-(i131111111119 << 1));
                            int i1311111111112 = ((i1311111111110 | i1311111111111) << 1) - (i1311111111110 ^ i1311111111111);
                            a = i1311111111112 % 128;
                            int i1311111111113 = i1311111111112 % 2;
                        } else {
                            if (arrayList.get(i7).employment_status == 58) {
                                int i1211114 = b + 61;
                                a = i1211114 % 128;
                                int i1311111111114 = i1211114 % 2;
                                ag.r = true;
                                break;
                            }
                            int i1311111111115 = i7 + 24;
                            i7 = (i1311111111115 | (-23)) + (i1311111111115 & (-23));
                            int i1311111111116 = b;
                            int i1311111111117 = i1311111111116 & 15;
                            int i1311111111118 = (i1311111111116 | 15) & (~i1311111111117);
                            int i1311111111119 = -(-(i1311111111117 << 1));
                            int i13111111111110 = ((i1311111111118 | i1311111111119) << 1) - (i1311111111118 ^ i1311111111119);
                            a = i13111111111110 % 128;
                            int i13111111111111 = i13111111111110 % 2;
                        }
                    }
                }
            } else {
                i7 = 0;
                while (i7 < arrayList.size()) {
                    int i1211115 = b;
                    int i1211116 = i1211115 & 47;
                    int i1211117 = (i1211115 ^ 47) | i1211116;
                    i8 = (i1211116 & i1211117) + (i1211117 | i1211116);
                    a = i8 % 128;
                    if (i8 % 2 == 0) {
                        if (arrayList.get(i7).employment_status == 32) {
                            int i1211118 = b + 61;
                            a = i1211118 % 128;
                            int i13111111111112 = i1211118 % 2;
                            ag.r = true;
                            break;
                        }
                        int i13111111111113 = i7 + 24;
                        i7 = (i13111111111113 | (-23)) + (i13111111111113 & (-23));
                        int i13111111111114 = b;
                        int i13111111111115 = i13111111111114 & 15;
                        int i13111111111116 = (i13111111111114 | 15) & (~i13111111111115);
                        int i13111111111117 = -(-(i13111111111115 << 1));
                        int i13111111111118 = ((i13111111111116 | i13111111111117) << 1) - (i13111111111116 ^ i13111111111117);
                        a = i13111111111118 % 128;
                        int i13111111111119 = i13111111111118 % 2;
                    } else {
                        if (arrayList.get(i7).employment_status == 58) {
                            int i1211119 = b + 61;
                            a = i1211119 % 128;
                            int i131111111111110 = i1211119 % 2;
                            ag.r = true;
                            break;
                        }
                        int i131111111111111 = i7 + 24;
                        i7 = (i131111111111111 | (-23)) + (i131111111111111 & (-23));
                        int i131111111111112 = b;
                        int i131111111111113 = i131111111111112 & 15;
                        int i131111111111114 = (i131111111111112 | 15) & (~i131111111111113);
                        int i131111111111115 = -(-(i131111111111113 << 1));
                        int i131111111111116 = ((i131111111111114 | i131111111111115) << 1) - (i131111111111114 ^ i131111111111115);
                        a = i131111111111116 % 128;
                        int i131111111111117 = i131111111111116 % 2;
                    }
                }
            }
        }
        if (!(!ag.f71o)) {
            int i166 = a;
            int i167 = ((i166 ^ 95) | (i166 & 95)) << 1;
            int i168 = -(((~i166) & 95) | (i166 & (-96)));
            int i169 = ((i167 | i168) << 1) - (i168 ^ i167);
            b = i169 % 128;
            int i170 = i169 % 2;
            ag.f71o = false;
            ag.e = true;
            int i171 = b;
            int i172 = ((i171 ^ 8) + ((i171 & 8) << 1)) - 1;
            a = i172 % 128;
            int i173 = i172 % 2;
        } else if (ag.p) {
            int i174 = a + 73;
            b = i174 % 128;
            if (i174 % 2 != 0) {
                ag.l = true;
                ag.e = false;
                ag.m = true;
                ag.p = true;
            } else {
                ag.l = true;
                ag.e = true;
                ag.m = true;
                ag.p = false;
            }
        }
        if (arrayList != null) {
            int i175 = a;
            int i176 = ((i175 | 62) << 1) - (i175 ^ 62);
            int i177 = (i176 ^ (-1)) + (i176 << 1);
            b = i177 % 128;
            int i178 = i177 % 2;
            if (arrayList.size() > 0) {
                int i179 = a;
                int i180 = ((i179 & 76) + (i179 | 76)) - 1;
                b = i180 % 128;
                int i181 = i180 % 2;
                double d2 = 0.0d;
                while (i24 < arrayList.size()) {
                    d2 += arrayList.get(i24).diff;
                    int i182 = (-2) - ((i24 + 107) ^ (-1));
                    int i183 = i182 & (-105);
                    i24 = i183 + ((i182 ^ (-105)) | i183);
                    int i184 = b;
                    int i185 = ((i184 | 29) << 1) - (i184 ^ 29);
                    a = i185 % 128;
                    int i186 = i185 % 2;
                }
                Survey survey = this.activityBeginSurvey.aG;
                double size3 = arrayList.size();
                int i187 = b;
                int i188 = (i187 & 89) + (i187 | 89);
                a = i188 % 128;
                int i189 = i188 % 2;
                survey.averageRosterTime = d2 / size3;
            }
        }
        int i190 = b;
        int i191 = i190 & 105;
        int i192 = (i190 ^ 105) | i191;
        int i193 = (i191 ^ i192) + ((i192 & i191) << 1);
        a = i193 % 128;
        int i194 = i193 % 2;
        return true;
    }
}
