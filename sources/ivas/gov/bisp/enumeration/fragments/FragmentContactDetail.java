package ivas.gov.bisp.enumeration.fragments;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Fragment;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Typeface;
import android.location.Location;
import android.location.LocationManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.orm.SugarRecord;
import ivas.gov.bisp.enumeration.ActivityBeginSurvey;
import ivas.gov.bisp.enumeration.BISPApplication;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.W.InterfaceC0028m;
import ivas.gov.bisp.enumeration.W.J;
import ivas.gov.bisp.enumeration.W.M;
import ivas.gov.bisp.enumeration.W.O;
import ivas.gov.bisp.enumeration.W.t;
import ivas.gov.bisp.enumeration.X.e;
import ivas.gov.bisp.enumeration.bK.aA;
import ivas.gov.bisp.enumeration.bK.aD;
import ivas.gov.bisp.enumeration.bK.ac;
import ivas.gov.bisp.enumeration.bK.af;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.bK.ah;
import ivas.gov.bisp.enumeration.bK.ak;
import ivas.gov.bisp.enumeration.bK.au;
import ivas.gov.bisp.enumeration.bK.av;
import ivas.gov.bisp.enumeration.bK.aw;
import ivas.gov.bisp.enumeration.bK.b;
import ivas.gov.bisp.enumeration.bK.w;
import ivas.gov.bisp.enumeration.databaseModels.EnumerationStructure;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import ivas.gov.bisp.enumeration.databaseModels.Villagemaps;
import ivas.gov.bisp.enumeration.dialogs.DialogMapListing;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.district;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.not_at_home;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.province;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.question_options;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.tehsil;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.uc;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.vilages;
import ivas.gov.bisp.enumeration.models.NewLocationForm;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.models.Roster;
import ivas.gov.bisp.enumeration.models.SupervisorParseObject;
import ivas.gov.bisp.enumeration.models.Survey;
import ivas.gov.bisp.enumeration.o000Oo00.Oooo0;
import ivas.gov.bisp.enumeration.p002ab.C0084m;
import ivas.gov.bisp.enumeration.p024ax.I;
import ivas.gov.bisp.enumeration.p024ax.ax;
import ivas.gov.bisp.enumeration.p026az.C0104p;
import ivas.gov.bisp.enumeration.p026az.z;
import ivas.gov.bisp.enumeration.p035bh.C0145s;
import ivas.gov.bisp.enumeration.p043bp.T;
import ivas.gov.bisp.enumeration.p051bx.o;
import ivas.gov.bisp.enumeration.p096p.h;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import net.sqlcipher.BuildConfig;
import o.g;
import o.m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class FragmentContactDetail extends Fragment implements e {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int REQUEST_IMAGE_CAPTURE_HOUSEHOLD = 3;
    private static int c = 0;
    private static int d = 1;
    private static long d$s40$4273 = 7754400348898324457L;
    private static long d$s51$4172 = -946786058831830510L;
    private ActivityBeginSurvey activityBeginSurvey;
    public BISPApplication bispApplication;

    @BindView
    public Button btnMap;
    private CountDownTimer countDownTimer;
    public ArrayList<question_options> data_collection_modality;
    public ArrayList<String> distArrayList;
    public ArrayList<district> districtList;

    @BindView
    public EditText editTextAddress;

    @BindView
    public EditText editTextAlternativeContact;

    @BindView
    public EditText editTextAreaCode;

    @BindView
    public EditText editTextBlockCode;

    @BindView
    public EditText editTextHouseholdNo;

    @BindView
    public EditText editTextMobile;

    @BindView
    public EditText editTextMobileRepeat;

    @BindView
    public EditText editTextNameOfHead;

    @BindView
    public EditText editTextNumberOfRoster;

    @BindView
    public EditText editTextReason;

    @BindView
    public EditText editTextStructureNo;

    @BindView
    public EditText et_uc;

    @BindView
    public EditText et_village;
    public JSONObject json_not_at_home;

    @BindView
    public LinearLayout linearLayoutIsBispBenificiary;

    @BindView
    public LinearLayout linearLayoutRosterCount;
    private ProgressDialog mProgressBar;
    public Oooo0<Item> motherLanguageArrayAdapter;
    public ArrayList<Item> motherLanguageList;
    public ArrayList<String> networkList;
    public not_at_home notAtHome;
    public ArrayList<String> provList;
    public ArrayList<province> provinceList;

    @BindView
    public RadioButton radioButtonRegionRural;

    @BindView
    public RadioButton radioButtonRegionUrban;

    @BindView
    public RadioButton radioButtonbispBenificiaryNo;

    @BindView
    public RadioButton radioButtonbispBenificiaryYes;

    @BindView
    public RadioGroup radioGroupBispBenificiary;

    @BindView
    public RadioGroup radioGroupRegion;
    public SessionManager sessionManager;

    @BindView
    public Spinner sp_district;

    @BindView
    public Spinner sp_motherLanguage;

    @BindView
    public Spinner sp_networks;

    @BindView
    public Spinner sp_province;

    @BindView
    public Spinner sp_structureNumber;

    @BindView
    public Spinner sp_tehsil;

    @BindView
    public Spinner sp_uc;

    @BindView
    public Spinner sp_village;

    @BindView
    public Spinner sp_visitStatus;

    @BindView
    public Spinner spinnerVenue;
    public Oooo0<Item> structureNumberArrayAdapter;
    public ArrayList<EnumerationStructure> structureNumberList;
    public ArrayList<String> tehList;
    public ArrayList<tehsil> tehsilList;

    @BindView
    public TextView textViewPerAddress;

    @BindView
    public TextView textViewRegionLabel;

    @BindView
    public TextView textViewTempAddress;

    @BindView
    public TextView textViewTimeRemaining;
    public ArrayList<String> ucArrList;
    public ArrayList<uc> ucArraList;
    public ArrayList<String> vilageArrList;
    public ArrayList<vilages> vilageArraList;
    public ArrayList<Villagemaps> villagemaps;
    public Oooo0<Item> visitStatusArrayAdapter;
    public ArrayList<Item> visitStatusList;
    private w mGPs = null;
    private View parentView = null;
    public NewLocationForm newLocationForm = null;
    private boolean isValidTrue = false;
    public boolean isTimerStart = false;
    public ExecutorService executor = Executors.newSingleThreadExecutor();
    public Handler handler = new Handler(Looper.getMainLooper());
    public int countInsertVillage = 0;

    public static /* synthetic */ ActivityBeginSurvey access$000(FragmentContactDetail fragmentContactDetail) {
        int i = 2 % 2;
        int i2 = c + 115;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            return fragmentContactDetail.activityBeginSurvey;
        }
        int i3 = 23 / 0;
        return fragmentContactDetail.activityBeginSurvey;
    }

    public static /* synthetic */ void access$100(FragmentContactDetail fragmentContactDetail) {
        int i = 2 % 2;
        int i2 = c + 103;
        d = i2 % 128;
        int i3 = i2 % 2;
        fragmentContactDetail.continueAfterLocality();
        if (i3 == 0) {
            throw null;
        }
        int i4 = d + 121;
        c = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ w access$200(FragmentContactDetail fragmentContactDetail) {
        int i = 2 % 2;
        int i2 = c + 63;
        d = i2 % 128;
        int i3 = i2 % 2;
        w wVar = fragmentContactDetail.mGPs;
        if (i3 != 0) {
            return wVar;
        }
        throw null;
    }

    public static /* synthetic */ w access$202(FragmentContactDetail fragmentContactDetail, w wVar) {
        int i = 2 % 2;
        int i2 = d + 89;
        int i3 = i2 % 128;
        c = i3;
        int i4 = i2 % 2;
        Object obj = null;
        fragmentContactDetail.mGPs = wVar;
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 63;
        d = i5 % 128;
        if (i5 % 2 != 0) {
            return wVar;
        }
        throw null;
    }

    public static /* synthetic */ void access$300(FragmentContactDetail fragmentContactDetail, List list) {
        int i = 2 % 2;
        int i2 = d + 91;
        c = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            fragmentContactDetail.addUVillages(list);
            obj.hashCode();
            throw null;
        }
        fragmentContactDetail.addUVillages(list);
        int i3 = d + 3;
        c = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ ProgressDialog access$400(FragmentContactDetail fragmentContactDetail) {
        int i = 2 % 2;
        int i2 = c + 49;
        d = i2 % 128;
        int i3 = i2 % 2;
        ProgressDialog progressDialog = fragmentContactDetail.mProgressBar;
        if (i3 != 0) {
            return progressDialog;
        }
        throw null;
    }

    private void addUVillages(final List<vilages> list) {
        int i = 2 % 2;
        this.executor.execute(new Runnable() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentContactDetail.21
            private static int a = 0;
            private static int b = 1;

            @Override // java.lang.Runnable
            public void run() {
                int i2 = 2 % 2;
                int i3 = b;
                int i4 = ((i3 | 15) << 1) - (i3 ^ 15);
                a = i4 % 128;
                int i5 = i4 % 2;
                h hVarM = AppDatabase.l(FragmentContactDetail.this.getActivity()).m();
                int i6 = b;
                int i7 = (i6 ^ 69) + ((i6 & 69) << 1);
                a = i7 % 128;
                int i8 = i7 % 2;
                hVarM.ay(list);
                int i9 = a;
                int i10 = ((i9 & 28) + (i9 | 28)) - 1;
                b = i10 % 128;
                if (i10 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        int i2 = c + 91;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void c(FragmentContactDetail fragmentContactDetail, View view) {
        int i = 2 % 2;
        int i2 = c + 79;
        d = i2 % 128;
        int i3 = i2 % 2;
        fragmentContactDetail.lambda$continueAfterLocality$0(view);
        int i4 = d + 117;
        c = i4 % 128;
        int i5 = i4 % 2;
    }

    private void createJSON(int i, Spinner spinner) {
        int i2 = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            Object[] objArr = new Object[1];
            b(((byte) KeyEvent.getModifierMetaStateMask()) + 1, new char[]{23257, 23180, 5956, 14101, 2304, 17913, 37600, 61918}, objArr);
            jSONObject.put(((String) objArr[0]).intern(), i);
            String strD = b.d(jSONObject.toString(), b.b(this.sessionManager.k()), b.b(this.sessionManager.m()));
            Object[] objArr2 = new Object[1];
            b(TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0), new char[]{27130, 27017, 28366, 47966, 30202, 15460, 8940, 41557, 7824, 61333, 36105}, objArr2);
            jSONObject2.put(((String) objArr2[0]).intern(), strD);
            byte[] bArrB = b.b(this.sessionManager.k());
            byte[] bArrB2 = b.b(this.sessionManager.m());
            Object[] objArr3 = new Object[1];
            a(((byte) KeyEvent.getModifierMetaStateMask()) + 47432, new char[]{60613, 21893, 40522, 50954, 2500, 29362, 47918}, objArr3);
            String strIntern = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            b(TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0) + 1, new char[]{52932, 52867, 14412, 'Q', 58112, 27383, 34261, 62669, 42393, 21697, 7116, 24511, 22611, 33628, 39289, 37935, 11487, 24517, 11775, 49335, 58225, 59914, 30284, 15858, 47050, 42739}, objArr4);
            jSONObject2.put(strIntern, b.d(((String) objArr4[0]).intern(), bArrB, bArrB2));
            ProgressDialog progressDialog = this.mProgressBar;
            Object[] objArr5 = new Object[1];
            b(TextUtils.getTrimmedLength(BuildConfig.FLAVOR), new char[]{7073, 7143, 4338, 47223, 6491, 16969, 20657, 56438, 7615, 60645, 57762, 42455, 36209, 43987, 8572, 28227, 63916, 30561, 38376, 14977}, objArr5);
            ax.h(progressDialog, ((String) objArr5[0]).intern());
            requestVillagesList(jSONObject2, spinner);
            int i3 = d + 101;
            c = i3 % 128;
            int i4 = i3 % 2;
        } catch (JSONException unused) {
        }
    }

    private void readLocality() {
        int i = 2 % 2;
        ak.f(new t() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentContactDetail.5
            private static int a = 1;
            private static int b;

            @Override // ivas.gov.bisp.enumeration.W.t
            public void notValidData() {
                int i2 = 2 % 2;
                FragmentContactDetail.this.newLocationForm = new NewLocationForm();
                int i3 = a;
                int i4 = i3 & 83;
                int i5 = (i4 - (~((i3 ^ 83) | i4))) - 1;
                b = i5 % 128;
                int i6 = i5 % 2;
                FragmentContactDetail.access$100(FragmentContactDetail.this);
                int i7 = a;
                int i8 = i7 & 67;
                int i9 = -(-((i7 ^ 67) | i8));
                int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
                b = i10 % 128;
                int i11 = i10 % 2;
            }

            @Override // ivas.gov.bisp.enumeration.W.t
            public void notValidSupervisor() {
                int i2 = 2 % 2;
                int i3 = b;
                int i4 = (i3 ^ 31) + ((i3 & 31) << 1);
                a = i4 % 128;
                int i5 = i4 % 2;
            }

            @Override // ivas.gov.bisp.enumeration.W.t
            public void notValidVersion() {
                int i2 = 2 % 2;
                int i3 = a + 49;
                b = i3 % 128;
                if (i3 % 2 != 0) {
                    throw null;
                }
            }

            @Override // ivas.gov.bisp.enumeration.W.t
            public void validData(NewLocationForm newLocationForm) {
                int i2 = 2 % 2;
                int i3 = b + 121;
                a = i3 % 128;
                int i4 = i3 % 2;
                FragmentContactDetail fragmentContactDetail = FragmentContactDetail.this;
                fragmentContactDetail.newLocationForm = newLocationForm;
                if (!(!BISPApplication.f)) {
                    int i5 = b;
                    int i6 = i5 & 95;
                    int i7 = (i5 ^ 95) | i6;
                    int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
                    a = i8 % 128;
                    try {
                        if (i8 % 2 == 0) {
                            fragmentContactDetail.json_not_at_home.getString("region");
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        FragmentContactDetail.this.newLocationForm.setRegion(fragmentContactDetail.json_not_at_home.getString("region"));
                        int i9 = a;
                        int i10 = ((i9 | 91) << 1) - (i9 ^ 91);
                        b = i10 % 128;
                        int i11 = i10 % 2;
                    } catch (Exception unused) {
                    }
                }
                FragmentContactDetail.access$100(FragmentContactDetail.this);
                int i12 = b;
                int i13 = i12 & 91;
                int i14 = i13 + ((i12 ^ 91) | i13);
                a = i14 % 128;
                int i15 = i14 % 2;
            }
        });
        int i2 = d + 29;
        c = i2 % 128;
        int i3 = i2 % 2;
    }

    private void requestVillagesList(JSONObject jSONObject, final Spinner spinner) {
        int i = 2 % 2;
        Activity activity = getActivity();
        Object[] objArr = new Object[1];
        b(1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), new char[]{59717, 59693, 24538, 20403, 23467, 3440, 41550, 37660, 60027, 7008, 41793, 59260, 32728, 58587, 54971, 11434, 2889, 14419, 25132, 30760, 50372, 36286, 14743, 34069, 36991, 49455, 62748, 53955, 11707, 6841, 32920, 7773, 63779, 28198, 23572, 43916, 45796, 41886, 60270, 63284, 20015, 63241, 42748, 15591, 7056, 18572, 29240, 18537, 55095, 39996, 2505, 38393, 24753, 53627, 50462, 8457, 15381, 10986, 37118, 28318, 51685, 32346}, objArr);
        ax.e(jSONObject, activity, ((String) objArr[0]).intern(), new I() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentContactDetail.16
            private static int a = 0;
            private static int b = 1;

            @Override // ivas.gov.bisp.enumeration.p024ax.I
            public void onError(ResponseMessage responseMessage) {
                int i2 = 2 % 2;
                int i3 = b;
                int i4 = (-2) - (((i3 & 20) + (i3 | 20)) ^ (-1));
                a = i4 % 128;
                if (i4 % 2 != 0) {
                    ax.b(FragmentContactDetail.access$400(FragmentContactDetail.this));
                    throw null;
                }
                ax.b(FragmentContactDetail.access$400(FragmentContactDetail.this));
                FragmentContactDetail fragmentContactDetail = FragmentContactDetail.this;
                int i5 = b;
                int i6 = (-2) - (((i5 & 70) + (i5 | 70)) ^ (-1));
                a = i6 % 128;
                int i7 = i6 % 2;
                af.b(FragmentContactDetail.access$000(fragmentContactDetail), responseMessage.getErrorMessage(), responseMessage.isLogout());
                int i8 = b + 90;
                int i9 = (i8 ^ (-1)) + (i8 << 1);
                a = i9 % 128;
                int i10 = i9 % 2;
            }

            @Override // ivas.gov.bisp.enumeration.p024ax.I
            public void onSuccess(JSONObject jSONObject2) {
                int i2 = 2 % 2;
                int i3 = a + 95;
                b = i3 % 128;
                Object obj = null;
                try {
                    if (i3 % 2 == 0) {
                        ax.b(FragmentContactDetail.access$400(FragmentContactDetail.this));
                        jSONObject2.getString("result");
                        throw null;
                    }
                    ax.b(FragmentContactDetail.access$400(FragmentContactDetail.this));
                    String string = jSONObject2.getString("result");
                    int i4 = b;
                    int i5 = i4 ^ 117;
                    int i6 = -(-((i4 & 117) << 1));
                    int i7 = (i5 & i6) + (i6 | i5);
                    a = i7 % 128;
                    int i8 = i7 % 2;
                    JSONArray jSONArray = new JSONObject(b.c(string, b.b(FragmentContactDetail.this.sessionManager.k()), b.b(FragmentContactDetail.this.sessionManager.m()))).getJSONArray("villages_list");
                    FragmentContactDetail.this.vilageArraList = new ArrayList<>();
                    FragmentContactDetail fragmentContactDetail = FragmentContactDetail.this;
                    ArrayList<String> arrayList = new ArrayList<>();
                    int i9 = b + 109;
                    a = i9 % 128;
                    int i10 = i9 % 2;
                    fragmentContactDetail.vilageArrList = arrayList;
                    Resources resources = FragmentContactDetail.this.getActivity().getResources();
                    int i11 = b;
                    int i12 = (((i11 & (-122)) | ((~i11) & 121)) - (~((i11 & 121) << 1))) - 1;
                    a = i12 % 128;
                    int i13 = i12 % 2;
                    String string2 = resources.getString(R.string.selectvilage);
                    if (string2 != null) {
                        int i14 = a;
                        int i15 = (i14 & (-56)) | ((~i14) & 55);
                        int i16 = -(-((i14 & 55) << 1));
                        int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
                        b = i17 % 128;
                        int i18 = i17 % 2;
                        if (string2.length() > 0) {
                            ArrayList<vilages> arrayList2 = FragmentContactDetail.this.vilageArraList;
                            vilages vilagesVar = new vilages(0, 0L, BuildConfig.FLAVOR, string2);
                            int i19 = a + 75;
                            b = i19 % 128;
                            int i20 = i19 % 2;
                            arrayList2.add(vilagesVar);
                            FragmentContactDetail fragmentContactDetail2 = FragmentContactDetail.this;
                            int i21 = b;
                            int i22 = (i21 ^ 29) + ((i21 & 29) << 1);
                            a = i22 % 128;
                            int i23 = i22 % 2;
                            fragmentContactDetail2.vilageArrList.add(string2);
                            int i24 = a;
                            int i25 = i24 & 89;
                            int i26 = (((i24 | 89) & (~i25)) - (~(-(-(i25 << 1))))) - 1;
                            b = i26 % 128;
                            int i27 = i26 % 2;
                        }
                    }
                    int length = jSONArray.length();
                    ArrayList arrayList3 = new ArrayList();
                    int i28 = b;
                    int i29 = ((i28 | 81) << 1) - (i28 ^ 81);
                    int i30 = i29 % 128;
                    a = i30;
                    if (i29 % 2 != 0) {
                        throw null;
                    }
                    if (length > 0) {
                        int i31 = i30 & 91;
                        int i32 = -(-((i30 ^ 91) | i31));
                        int i33 = (i31 ^ i32) + ((i31 & i32) << 1);
                        b = i33 % 128;
                        int i34 = i33 % 2;
                        int i35 = ((i30 & (-104)) | ((~i30) & 103)) + ((i30 & 103) << 1);
                        b = i35 % 128;
                        int i36 = i35 % 2;
                        int i37 = 0;
                        while (i37 < length) {
                            int i38 = b;
                            int i39 = i38 & 115;
                            int i40 = (i38 ^ 115) | i39;
                            int i41 = ((i39 | i40) << 1) - (i40 ^ i39);
                            a = i41 % 128;
                            if (i41 % 2 != 0) {
                                jSONArray.getJSONObject(i37).getInt("uccode");
                                throw null;
                            }
                            JSONObject jSONObject3 = jSONArray.getJSONObject(i37);
                            int i42 = jSONObject3.getInt("uccode");
                            long j = jSONObject3.getLong("localitycode");
                            String string3 = jSONObject3.getString("localitytype");
                            String string4 = jSONObject3.getString("locality");
                            vilages vilagesVar2 = new vilages(i42, j, string3, string4);
                            int i43 = a;
                            int i44 = ((i43 ^ 117) | (i43 & 117)) << 1;
                            int i45 = -(((~i43) & 117) | (i43 & (-118)));
                            int i46 = (i44 & i45) + (i45 | i44);
                            b = i46 % 128;
                            if (i46 % 2 == 0) {
                                FragmentContactDetail.this.vilageArraList.add(vilagesVar2);
                                obj.hashCode();
                                throw null;
                            }
                            FragmentContactDetail.this.vilageArraList.add(vilagesVar2);
                            FragmentContactDetail fragmentContactDetail3 = FragmentContactDetail.this;
                            int i47 = a;
                            int i48 = (((i47 | 126) << 1) - (i47 ^ 126)) - 1;
                            b = i48 % 128;
                            if (i48 % 2 == 0) {
                                fragmentContactDetail3.vilageArrList.add(string4);
                                arrayList3.add(vilagesVar2);
                                throw null;
                            }
                            fragmentContactDetail3.vilageArrList.add(string4);
                            arrayList3.add(vilagesVar2);
                            i37 = (i37 | 1) + (i37 & 1);
                            int i49 = b;
                            int i50 = i49 | 113;
                            int i51 = ((i50 << 1) - (~(-((~(i49 & 113)) & i50)))) - 1;
                            a = i51 % 128;
                            int i52 = i51 % 2;
                        }
                    } else {
                        vilages vilagesVar3 = new vilages(1, 0L, BuildConfig.FLAVOR, "Other");
                        int i53 = a;
                        int i54 = ((i53 | 113) << 1) - (i53 ^ 113);
                        b = i54 % 128;
                        if (i54 % 2 == 0) {
                            FragmentContactDetail.this.vilageArraList.add(vilagesVar3);
                            obj.hashCode();
                            throw null;
                        }
                        FragmentContactDetail.this.vilageArraList.add(vilagesVar3);
                        FragmentContactDetail.this.vilageArrList.add("Other");
                        int i55 = a;
                        int i56 = i55 & 69;
                        int i57 = (i56 - (~(-(-((i55 ^ 69) | i56))))) - 1;
                        b = i57 % 128;
                        if (i57 % 2 == 0) {
                            arrayList3.add(vilagesVar3);
                            int i58 = 36 / 0;
                        } else {
                            arrayList3.add(vilagesVar3);
                        }
                        int i59 = a;
                        int i60 = ((i59 ^ 102) + ((i59 & 102) << 1)) - 1;
                        b = i60 % 128;
                        if (i60 % 2 == 0) {
                            int i61 = 4 / 3;
                        }
                    }
                    FragmentContactDetail fragmentContactDetail4 = FragmentContactDetail.this;
                    fragmentContactDetail4.countInsertVillage = 0;
                    FragmentContactDetail.access$300(fragmentContactDetail4, arrayList3);
                    int i62 = b;
                    int i63 = ((i62 | 123) << 1) - (i62 ^ 123);
                    a = i63 % 128;
                    int i64 = i63 % 2;
                    if (spinner != null) {
                        spinner.setAdapter((SpinnerAdapter) new ArrayAdapter(FragmentContactDetail.this.getActivity(), R.layout.spinner_item, FragmentContactDetail.this.vilageArrList));
                        Spinner spinner2 = spinner;
                        AdapterView.OnItemSelectedListener onItemSelectedListener = new AdapterView.OnItemSelectedListener() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentContactDetail.16.1
                            private static int a = 0;
                            private static int b = 1;

                            @Override // android.widget.AdapterView.OnItemSelectedListener
                            public void onNothingSelected(AdapterView<?> adapterView) {
                                int i65 = 2 % 2;
                                int i66 = a;
                                int i67 = i66 & 107;
                                int i68 = ((((i66 ^ 107) | i67) << 1) - (~(-((i66 | 107) & (~i67))))) - 1;
                                b = i68 % 128;
                                if (i68 % 2 == 0) {
                                    int i69 = 18 / 0;
                                }
                            }

                            @Override // android.widget.AdapterView.OnItemSelectedListener
                            public void onItemSelected(AdapterView<?> adapterView, View view, int i65, long j2) {
                                int i66 = 2 % 2;
                                int i67 = a;
                                int i68 = i67 | 31;
                                int i69 = (i68 << 1) - (i68 & (~(i67 & 31)));
                                b = i69 % 128;
                                int i70 = i69 % 2;
                                if (i65 == 0) {
                                    int i71 = (i67 & 3) + (i67 | 3);
                                    b = i71 % 128;
                                    int i72 = i71 % 2;
                                    spinner.setBackgroundResource(R.drawable.spinner_bg);
                                    int i73 = a;
                                    int i74 = i73 ^ 19;
                                    int i75 = ((i73 & 19) | i74) << 1;
                                    int i76 = -i74;
                                    int i77 = (i75 & i76) + (i75 | i76);
                                    b = i77 % 128;
                                    if (i77 % 2 == 0) {
                                        int i78 = 2 % 4;
                                    }
                                } else {
                                    spinner.setBackgroundResource(R.drawable.spinner_bg_selected);
                                    int i79 = a + 43;
                                    b = i79 % 128;
                                    int i80 = i79 % 2;
                                }
                                Object selectedItem = spinner.getSelectedItem();
                                int i81 = b;
                                int i82 = ((i81 & 108) + (i81 | 108)) - 1;
                                a = i82 % 128;
                                if (i82 % 2 != 0) {
                                    selectedItem.equals("Other");
                                    throw null;
                                }
                                if (selectedItem.equals("Other")) {
                                    FragmentContactDetail.this.et_village.setVisibility(0);
                                    int i83 = a;
                                    int i84 = (-2) - (((i83 & 24) + (i83 | 24)) ^ (-1));
                                    b = i84 % 128;
                                    if (i84 % 2 == 0) {
                                        throw null;
                                    }
                                    return;
                                }
                                FragmentContactDetail.this.et_village.setVisibility(8);
                                int i85 = a;
                                int i86 = i85 ^ 119;
                                int i87 = ((i85 & 119) | i86) << 1;
                                int i88 = -i86;
                                int i89 = (i87 & i88) + (i87 | i88);
                                b = i89 % 128;
                                int i90 = i89 % 2;
                            }
                        };
                        int i65 = a + 97;
                        b = i65 % 128;
                        int i66 = i65 % 2;
                        spinner2.setOnItemSelectedListener(onItemSelectedListener);
                        int i67 = b;
                        int i68 = (i67 & 81) + (i67 | 81);
                        a = i68 % 128;
                        int i69 = i68 % 2;
                        return;
                    }
                    int i70 = b;
                    int i71 = i70 & 121;
                    int i72 = (((i70 ^ 121) | i71) << 1) - ((i70 | 121) & (~i71));
                    a = i72 % 128;
                    int i73 = i72 % 2;
                } catch (JSONException unused) {
                }
            }
        });
        int i2 = d + 33;
        c = i2 % 128;
        int i3 = i2 % 2;
    }

    private void showAlert() {
        int i = 2 % 2;
        C0104p c0104pC = C0104p.c();
        Activity activity = getActivity();
        Object[] objArr = new Object[1];
        a((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 40493, new char[]{60663, 29431, 53385, 13891, 38006, 64118}, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        b((-1) - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0), new char[]{20291, 20226, 57797, 54842, 33711, 45943, 1118, 11599, 29674, 33450, 31509, 16226, 55745, 23260, 20258, 62655, 44367, 34384, 64442, 41078, 25219, 13246, 40991, 23811, 13943, 32609, 27804, 2690, 35763, 42155, 6403, 50700, 24430, 53285, 50624, 29655, 5314, 7579, 29427, 12143, 59394, 18702, 16235, 58599, 48512, 63116, 60404, 36922, 29003, 8712, 36961, 19874, 50883, 28542, 23767, 63809, 39471, 38049, 2378, 46792, 28659, 49274, 46537, 25169, 9023, 3576, 25152, 8130, 63654, 47382}, objArr2);
        c0104pC.h(activity, strIntern, ((String) objArr2[0]).intern(), new DialogInterface.OnClickListener() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentContactDetail.7
            private static int a = 0;
            private static int b = 1;

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
                int i3 = 2 % 2;
                int i4 = a + 31;
                b = i4 % 128;
                int i5 = i4 % 2;
                ActivityBeginSurvey activityBeginSurvey = (ActivityBeginSurvey) FragmentContactDetail.this.getActivity();
                Objects.requireNonNull(activityBeginSurvey);
                int i6 = a;
                int i7 = i6 & 61;
                int i8 = (i7 - (~(-(-((i6 ^ 61) | i7))))) - 1;
                b = i8 % 128;
                int i9 = i8 % 2;
                ag.g = false;
                Intent intent = activityBeginSurvey.getIntent();
                int i10 = b + 87;
                a = i10 % 128;
                int i11 = i10 % 2;
                intent.addFlags(65536);
                activityBeginSurvey.finish();
                activityBeginSurvey.startActivity(intent);
                int i12 = b;
                int i13 = ((i12 ^ 88) + ((i12 & 88) << 1)) - 1;
                a = i13 % 128;
                if (i13 % 2 != 0) {
                    throw null;
                }
            }
        }, new DialogInterface.OnClickListener() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentContactDetail.8
            private static int a = 0;
            private static int b = 1;

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
                int i3 = 2 % 2;
                int i4 = b + 1;
                a = i4 % 128;
                if (i4 % 2 == 0) {
                    FragmentContactDetail fragmentContactDetail = FragmentContactDetail.this;
                    fragmentContactDetail.sp_visitStatus.setSelection(((ActivityBeginSurvey) fragmentContactDetail.getActivity()).al);
                    int i5 = b + 77;
                    a = i5 % 128;
                    int i6 = i5 % 2;
                    return;
                }
                FragmentContactDetail fragmentContactDetail2 = FragmentContactDetail.this;
                Spinner spinner = fragmentContactDetail2.sp_visitStatus;
                fragmentContactDetail2.getActivity();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, false);
        int i2 = d + 105;
        c = i2 % 128;
        int i3 = i2 % 2;
    }

    public String getLocation(String str) {
        int i = 2 % 2;
        int i2 = c + 77;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public void getVillageList(int i, Spinner spinner) {
        int i2 = 2 % 2;
        int i3 = d + 37;
        c = i3 % 128;
        int i4 = i3 % 2;
        ProgressDialog progressDialog = this.mProgressBar;
        Object[] objArr = new Object[1];
        a(TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0) + 63282, new char[]{60645, 7166, 698, 2374, 12315, 16173, 10231, 11969, 21882, 23662, 19240, 29644}, objArr);
        progressDialog.setTitle(((String) objArr[0]).intern());
        ProgressDialog progressDialog2 = this.mProgressBar;
        Object[] objArr2 = new Object[1];
        a(30727 - View.MeasureSpec.makeMeasureSpec(0, 0), new char[]{60646, 38109, 7389, 33986, 3289, 46320, 15548, 42192, 11503, 54496, 23684, 50389, 19660, 62659}, objArr2);
        progressDialog2.setMessage(((String) objArr2[0]).intern());
        this.mProgressBar.setCancelable(false);
        this.mProgressBar.setProgressStyle(0);
        createJSON(i, spinner);
        int i5 = d + 49;
        c = i5 % 128;
        int i6 = i5 % 2;
    }

    public boolean isInRange(String str, String str2, int i) {
        int i2 = 2 % 2;
        if (str != null) {
            int i3 = c + 79;
            d = i3 % 128;
            try {
                if (i3 % 2 == 0) {
                    str.equals(BuildConfig.FLAVOR);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (!str.equals(BuildConfig.FLAVOR)) {
                    if (str2 != null) {
                        int i4 = c + 105;
                        d = i4 % 128;
                        int i5 = i4 % 2;
                        if (!str.equals(BuildConfig.FLAVOR)) {
                            int i6 = c + 31;
                            d = i6 % 128;
                            int i7 = i6 % 2;
                            if (!str2.equals(BuildConfig.FLAVOR)) {
                                Location location = new Location(BuildConfig.FLAVOR);
                                Object[] objArr = new Object[1];
                                a(TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0) + 11257, new char[]{60570}, objArr);
                                location.setLatitude(Double.parseDouble(str.split(((String) objArr[0]).intern())[0].trim()));
                                Object[] objArr2 = new Object[1];
                                a((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 11257, new char[]{60570}, objArr2);
                                location.setLongitude(Double.parseDouble(str.split(((String) objArr2[0]).intern())[1].trim()));
                                Location location2 = new Location(BuildConfig.FLAVOR);
                                Object[] objArr3 = new Object[1];
                                a(TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0') + 11258, new char[]{60570}, objArr3);
                                location2.setLatitude(Double.parseDouble(str2.split(((String) objArr3[0]).intern())[0].trim()));
                                Object[] objArr4 = new Object[1];
                                a(TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0') + 11258, new char[]{60570}, objArr4);
                                location2.setLongitude(Double.parseDouble(str2.split(((String) objArr4[0]).intern())[1].trim()));
                                if (location.distanceTo(location2) <= i) {
                                    return true;
                                }
                            }
                        }
                    }
                    return false;
                }
            } catch (NullPointerException unused) {
            }
        }
        return true;
    }

    @Override // android.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = 2 % 2;
        int i4 = c + 17;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.app.Fragment
    public void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = c + 55;
        d = i2 % 128;
        int i3 = i2 % 2;
        super.onAttach(context);
        int i4 = d + 119;
        c = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = c + 121;
        d = i2 % 128;
        int i3 = i2 % 2;
        super.onDestroy();
        CountDownTimer countDownTimer = this.countDownTimer;
        if (countDownTimer != null) {
            int i4 = d + 49;
            c = i4 % 128;
            if (i4 % 2 != 0) {
                countDownTimer.cancel();
                int i5 = 59 / 0;
            } else {
                countDownTimer.cancel();
            }
        }
        int i6 = d + 29;
        c = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.X.e
    public SupervisorParseObject parseJsonForSupervisor() {
        int i = 2 % 2;
        int i2 = c + 75;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 35;
        c = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public void setDummyData() {
        int i = 2 % 2;
        int i2 = c + 99;
        d = i2 % 128;
        int i3 = i2 % 2;
        EditText editText = this.editTextMobile;
        Object[] objArr = new Object[1];
        b(Color.green(0), new char[]{10593, 10577, 50700, 22011, 54049, 38113, 25140, 2695, 61559, 371, 11147, 28585, 49057, 32031, 52459, 42033}, objArr);
        editText.setText(((String) objArr[0]).intern());
        EditText editText2 = this.editTextMobileRepeat;
        Object[] objArr2 = new Object[1];
        b((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1, new char[]{10593, 10577, 50700, 22011, 54049, 38113, 25140, 2695, 61559, 371, 11147, 28585, 49057, 32031, 52459, 42033}, objArr2);
        editText2.setText(((String) objArr2[0]).intern());
        EditText editText3 = this.editTextNameOfHead;
        Object[] objArr3 = new Object[1];
        a(42281 - (ViewConfiguration.getWindowTouchSlop() >> 8), new char[]{60642, 18942, 42636, 940}, objArr3);
        editText3.setText(((String) objArr3[0]).intern());
        EditText editText4 = this.editTextAddress;
        Object[] objArr4 = new Object[1];
        a(55001 - Gravity.getAbsoluteGravity(0, 0), new char[]{60663, 14859, 16736, 26703, 47031, 57080, 58835, 13177, 23071, 24945, 34989, 55190, 65276, 1490, 21275, 31335, 33095, 43263, 63381, 7902, 9251, 29448, 39542}, objArr4);
        editText4.setText(((String) objArr4[0]).intern());
        this.sp_motherLanguage.setSelection(2);
        this.sp_networks.setSelection(2);
        this.radioButtonbispBenificiaryNo.setChecked(true);
        this.sp_visitStatus.setSelection(3);
        EditText editText5 = this.editTextNumberOfRoster;
        Object[] objArr5 = new Object[1];
        a(((byte) KeyEvent.getModifierMetaStateMask()) + 37020, new char[]{60551}, objArr5);
        editText5.setText(((String) objArr5[0]).intern());
        EditText editText6 = this.editTextStructureNo;
        Object[] objArr6 = new Object[1];
        a(32503 - (KeyEvent.getMaxKeyCode() >> 16), new char[]{60544, 37493, 4448, 36961, 5928}, objArr6);
        editText6.setText(((String) objArr6[0]).intern());
        int i4 = c + 23;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public class InsertVillages extends AsyncTask<Void, Void, Void> {
        private static int a = 0;
        private static int b = 1;
        public vilages village;

        public InsertVillages(vilages vilagesVar) {
            this.village = vilagesVar;
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ Void doInBackground(Void[] voidArr) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (((i2 | 22) << 1) - (i2 ^ 22)) - 1;
            a = i3 % 128;
            int i4 = i3 % 2;
            Void voidDoInBackground2 = doInBackground2(voidArr);
            int i5 = b;
            int i6 = i5 & 53;
            int i7 = (i5 ^ 53) | i6;
            int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
            a = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 21 / 0;
            }
            return voidDoInBackground2;
        }

        /* JADX INFO: renamed from: doInBackground, reason: avoid collision after fix types in other method */
        public Void doInBackground2(Void... voidArr) {
            h hVarM;
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 49;
            int i4 = ((i2 ^ 49) | i3) << 1;
            int i5 = -((i2 | 49) & (~i3));
            int i6 = (i4 & i5) + (i5 | i4);
            a = i6 % 128;
            if (i6 % 2 != 0) {
                hVarM = AppDatabase.l(FragmentContactDetail.this.getActivity()).m();
                int i7 = 13 / 0;
            } else {
                hVarM = AppDatabase.l(FragmentContactDetail.this.getActivity()).m();
            }
            int i8 = b;
            int i9 = i8 & 1;
            int i10 = i9 + ((i8 ^ 1) | i9);
            a = i10 % 128;
            if (i10 % 2 == 0) {
                hVarM.ax(this.village);
                return null;
            }
            hVarM.ax(this.village);
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if (r1.size() > 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        showDialogMapListing();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
    
        if (r1.size() > 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private /* synthetic */ void lambda$continueAfterLocality$0(android.view.View r7) {
        /*
            r6 = this;
            r7 = 2
            int r0 = r7 % r7
            int r0 = ivas.gov.bisp.enumeration.fragments.FragmentContactDetail.d
            int r1 = r0 + 95
            int r2 = r1 % 128
            ivas.gov.bisp.enumeration.fragments.FragmentContactDetail.c = r2
            int r1 = r1 % r7
            java.util.ArrayList<ivas.gov.bisp.enumeration.databaseModels.Villagemaps> r1 = r6.villagemaps
            if (r1 == 0) goto L2e
            int r0 = r0 + 47
            int r2 = r0 % 128
            ivas.gov.bisp.enumeration.fragments.FragmentContactDetail.c = r2
            int r0 = r0 % r7
            if (r0 == 0) goto L24
            int r7 = r1.size()
            r0 = 91
            int r0 = r0 / 0
            if (r7 <= 0) goto L2e
            goto L2a
        L24:
            int r7 = r1.size()
            if (r7 <= 0) goto L2e
        L2a:
            r6.showDialogMapListing()
            return
        L2e:
            ivas.gov.bisp.enumeration.az.p r0 = ivas.gov.bisp.enumeration.p026az.C0104p.c()
            android.app.Activity r1 = r6.getActivity()
            r7 = 2131886399(0x7f12013f, float:1.9407376E38)
            java.lang.String r2 = r6.getString(r7)
            r7 = 2131886398(0x7f12013e, float:1.9407374E38)
            java.lang.String r3 = r6.getString(r7)
            r4 = 0
            r5 = 0
            r0.e(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.fragments.FragmentContactDetail.lambda$continueAfterLocality$0(android.view.View):void");
    }

    private void showDialogMapListing() {
        int i = 2 % 2;
        new DialogMapListing(getActivity(), this.villagemaps, new DialogMapListing.OooO00o() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentContactDetail.6
            private static int a = 1;
            private static int b;

            @Override // ivas.gov.bisp.enumeration.dialogs.DialogMapListing.OooO00o
            public void onCancel() {
                int i2 = 2 % 2;
                int i3 = b;
                int i4 = (((i3 | 20) << 1) - (i3 ^ 20)) - 1;
                a = i4 % 128;
                int i5 = i4 % 2;
            }

            @Override // ivas.gov.bisp.enumeration.dialogs.DialogMapListing.OooO00o
            public void onSubmit() {
                int i2 = 2 % 2;
                int i3 = b + 77;
                a = i3 % 128;
                int i4 = i3 % 2;
            }
        }).b.show();
        int i2 = d + 57;
        c = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 93 / 0;
        }
    }

    @OnClick
    public void onAddMember(View view) {
        EditText editText;
        int i;
        int i2 = 2 % 2;
        int i3 = d + 39;
        c = i3 % 128;
        if (i3 % 2 != 0) {
            i = Integer.parseInt(this.editTextNumberOfRoster.getText().toString());
            editText = this.editTextNumberOfRoster;
        } else {
            int i4 = Integer.parseInt(this.editTextNumberOfRoster.getText().toString());
            editText = this.editTextNumberOfRoster;
            i = i4 + 1;
        }
        editText.setText(String.valueOf(i));
        int i5 = d + 83;
        c = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 84 / 0;
        }
    }

    @OnClick
    public void onDeleteMember(View view) {
        int i = 2 % 2;
        int i2 = Integer.parseInt(this.editTextNumberOfRoster.getText().toString()) - 1;
        if (i2 <= 0) {
            int i3 = d + 51;
            c = i3 % 128;
            int i4 = i3 % 2;
            Activity activity = getActivity();
            Object[] objArr = new Object[1];
            b((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), new char[]{35505, 35580, 2498, 20275, 58753, 23413, 49572, 50518, 60129, 7096, 7538, 22848, 7218, 45779, 54818, 37517, 26805, 28247, 25317, 50706, 42804, 56299, 14610, 15206, 62348, 38755, 62872, 27877, 19980, 19641, 32776, 41066}, objArr);
            Toast.makeText(activity, ((String) objArr[0]).intern(), 0).show();
            return;
        }
        if (!this.isValidTrue) {
            this.editTextNumberOfRoster.setText(String.valueOf(i2));
            return;
        }
        int i5 = c + 95;
        d = i5 % 128;
        int i6 = i5 % 2;
        ArrayList<Roster> arrayList = this.activityBeginSurvey.aq;
        if (arrayList == null) {
            this.editTextNumberOfRoster.setText(String.valueOf(i2));
            return;
        }
        if (i2 >= arrayList.size()) {
            this.editTextNumberOfRoster.setText(String.valueOf(i2));
            return;
        }
        Activity activity2 = getActivity();
        Object[] objArr2 = new Object[1];
        a(Process.getGidForName(BuildConfig.FLAVOR) + 50834, new char[]{60661, 10822, 25082, 49003, 63133, 3095, 19440, 33061, 55387, 6092, 11630, 25832, 41499, 63896, 14141, 20201, 34251, 50034, 6889, 20503, 28551, 42273, 64691, 15249, 29007, 35052, 50732, 7580, 23302, 37545, 43053, 59224, 16114, 29822, 46036, 51469, 179, 24117, 38229, 44161, 60031, 8683, 32536, 46728, 52286, 3051, 17109, 38982, 55284, 60690}, objArr2);
        Toast.makeText(activity2, ((String) objArr2[0]).intern(), 0).show();
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.fragments.FragmentContactDetail$13, reason: invalid class name */
    public class AnonymousClass13 implements AdapterView.OnItemSelectedListener {
        private static int a = 0;
        private static int b = 1;

        public AnonymousClass13() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 103;
            int i4 = (i2 ^ 103) | i3;
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            b = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, final int i, long j) {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = ((i3 & (-50)) | ((~i3) & 49)) + ((i3 & 49) << 1);
            b = i4 % 128;
            Object obj = null;
            if (i4 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (i == 0) {
                int i5 = ((i3 | 65) << 1) - (i3 ^ 65);
                b = i5 % 128;
                int i6 = i5 % 2;
                FragmentContactDetail.this.sp_village.setVisibility(8);
                FragmentContactDetail fragmentContactDetail = FragmentContactDetail.this;
                int i7 = b;
                int i8 = i7 & 5;
                int i9 = i8 + ((i7 ^ 5) | i8);
                a = i9 % 128;
                int i10 = i9 % 2;
                fragmentContactDetail.sp_uc.setBackgroundResource(R.drawable.spinner_bg);
                int i11 = b;
                int i12 = i11 & 99;
                int i13 = -(-((i11 ^ 99) | i12));
                int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
                a = i14 % 128;
                if (i14 % 2 != 0) {
                    int i15 = 3 / 5;
                }
            } else {
                FragmentContactDetail.this.sp_uc.setBackgroundResource(R.drawable.spinner_bg_selected);
                int i16 = b;
                int i17 = (i16 | 119) << 1;
                int i18 = -(((~i16) & 119) | (i16 & (-120)));
                int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
                a = i19 % 128;
                if (i19 % 2 != 0) {
                    FragmentContactDetail.this.sp_uc.getSelectedItem();
                    throw null;
                }
                Object selectedItem = FragmentContactDetail.this.sp_uc.getSelectedItem();
                int i20 = b;
                int i21 = ((i20 & 72) + (i20 | 72)) - 1;
                a = i21 % 128;
                int i22 = i21 % 2;
                if (!selectedItem.equals("Other")) {
                    FragmentContactDetail.this.et_uc.setVisibility(8);
                    int i23 = b;
                    int i24 = i23 & 125;
                    int i25 = -(-((i23 ^ 125) | i24));
                    int i26 = (i24 & i25) + (i25 | i24);
                    a = i26 % 128;
                    int i27 = i26 % 2;
                } else {
                    int i28 = b;
                    int i29 = ((i28 ^ 86) + ((i28 & 86) << 1)) - 1;
                    a = i29 % 128;
                    int i30 = i29 % 2;
                    FragmentContactDetail.this.et_uc.setVisibility(0);
                    int i31 = a;
                    int i32 = ((i31 | 51) << 1) - (i31 ^ 51);
                    b = i32 % 128;
                    int i33 = i32 % 2;
                }
            }
            if (i > 0) {
                int i34 = a;
                int i35 = i34 & 43;
                int i36 = -(-((i34 ^ 43) | i35));
                int i37 = (i35 & i36) + (i36 | i35);
                b = i37 % 128;
                int i38 = i37 % 2;
                FragmentContactDetail.this.sp_village.setVisibility(0);
                int i39 = b;
                int i40 = i39 ^ 49;
                int i41 = ((i39 & 49) | i40) << 1;
                int i42 = -i40;
                int i43 = ((i41 | i42) << 1) - (i41 ^ i42);
                a = i43 % 128;
                int i44 = i43 % 2;
                if (FragmentContactDetail.this.ucArraList.size() > 0) {
                    int i45 = b;
                    int i46 = i45 & 49;
                    int i47 = i46 + ((i45 ^ 49) | i46);
                    a = i47 % 128;
                    int i48 = i47 % 2;
                    if (FragmentContactDetail.this.sessionManager.k().length() > 0) {
                        FragmentContactDetail.this.sp_uc.setBackgroundResource(R.drawable.spinner_bg_selected);
                        aD aDVar = new aD(FragmentContactDetail.this.getActivity(), FragmentContactDetail.this.ucArraList.get(i).uccode, FragmentContactDetail.this.getActivity().getResources().getString(R.string.selectvilage), FragmentContactDetail.this.sp_village, new O() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentContactDetail.13.1
                            private static int a = 1;
                            private static int b;

                            @Override // ivas.gov.bisp.enumeration.W.O
                            public void fillVilagesList(ArrayList<vilages> arrayList, ArrayList<String> arrayList2) {
                                int i49 = 2 % 2;
                                int i50 = a;
                                int i51 = i50 & 65;
                                int i52 = ((i50 | 65) & (~i51)) + (i51 << 1);
                                b = i52 % 128;
                                int i53 = i52 % 2;
                                FragmentContactDetail.this.vilageArraList = arrayList;
                                Object obj2 = null;
                                if (arrayList.size() > 0) {
                                    int i54 = a + 119;
                                    b = i54 % 128;
                                    if (i54 % 2 != 0) {
                                        FragmentContactDetail.this.spinnerSelectListener();
                                        int i55 = 76 / 0;
                                    } else {
                                        FragmentContactDetail.this.spinnerSelectListener();
                                    }
                                    int i56 = b;
                                    int i57 = ((i56 & 52) + (i56 | 52)) - 1;
                                    a = i57 % 128;
                                    if (i57 % 2 != 0) {
                                        return;
                                    }
                                    obj2.hashCode();
                                    throw null;
                                }
                                int iIntValue = FragmentContactDetail.this.sessionManager.l().intValue();
                                int i58 = a + 125;
                                b = i58 % 128;
                                if (i58 % 2 == 0 ? iIntValue != 2 : iIntValue != 2) {
                                    FragmentContactDetail fragmentContactDetail2 = FragmentContactDetail.this;
                                    ArrayList<uc> arrayList3 = fragmentContactDetail2.ucArraList;
                                    int i59 = a;
                                    int i60 = i59 & 113;
                                    int i61 = (i59 ^ 113) | i60;
                                    int i62 = ((i60 | i61) << 1) - (i61 ^ i60);
                                    b = i62 % 128;
                                    if (i62 % 2 != 0) {
                                        int i63 = arrayList3.get(i).uccode;
                                        throw null;
                                    }
                                    int i64 = arrayList3.get(i).uccode;
                                    int i65 = b;
                                    int i66 = i65 & 9;
                                    int i67 = ((i65 ^ 9) | i66) << 1;
                                    int i68 = -((i65 | 9) & (~i66));
                                    int i69 = (i67 ^ i68) + ((i68 & i67) << 1);
                                    a = i69 % 128;
                                    int i70 = i69 % 2;
                                    fragmentContactDetail2.getVillageList(i64, FragmentContactDetail.this.sp_village);
                                    int i71 = a;
                                    int i72 = (-2) - (((i71 ^ 80) + ((i71 & 80) << 1)) ^ (-1));
                                    b = i72 % 128;
                                    int i73 = i72 % 2;
                                } else {
                                    FragmentContactDetail.this.vilageArraList = new ArrayList<>();
                                    FragmentContactDetail.this.vilageArrList = new ArrayList<>();
                                    ArrayList arrayList4 = new ArrayList();
                                    AnonymousClass13 anonymousClass13 = AnonymousClass13.this;
                                    int i74 = a;
                                    int i75 = i74 | 75;
                                    int i76 = i75 << 1;
                                    int i77 = -((~(i74 & 75)) & i75);
                                    int i78 = (i76 ^ i77) + ((i77 & i76) << 1);
                                    b = i78 % 128;
                                    if (i78 % 2 != 0) {
                                        FragmentContactDetail.this.getActivity().getResources().getString(R.string.selectvilage);
                                        FragmentContactDetail fragmentContactDetail3 = FragmentContactDetail.this;
                                        obj2.hashCode();
                                        throw null;
                                    }
                                    String string = FragmentContactDetail.this.getActivity().getResources().getString(R.string.selectvilage);
                                    FragmentContactDetail.this.vilageArraList.add(new vilages(0, 0L, BuildConfig.FLAVOR, string));
                                    FragmentContactDetail.this.vilageArrList.add(string);
                                    vilages vilagesVar = new vilages(1, 0L, BuildConfig.FLAVOR, "Other");
                                    int i79 = a;
                                    int i80 = ((i79 & 6) + (i79 | 6)) - 1;
                                    b = i80 % 128;
                                    int i81 = i80 % 2;
                                    FragmentContactDetail.this.vilageArraList.add(vilagesVar);
                                    FragmentContactDetail fragmentContactDetail4 = FragmentContactDetail.this;
                                    int i82 = a;
                                    int i83 = (i82 | 115) << 1;
                                    int i84 = -(i82 ^ 115);
                                    int i85 = (i83 ^ i84) + ((i84 & i83) << 1);
                                    b = i85 % 128;
                                    if (i85 % 2 != 0) {
                                        fragmentContactDetail4.vilageArrList.add("Other");
                                        arrayList4.add(vilagesVar);
                                        FragmentContactDetail fragmentContactDetail5 = FragmentContactDetail.this;
                                        throw null;
                                    }
                                    fragmentContactDetail4.vilageArrList.add("Other");
                                    arrayList4.add(vilagesVar);
                                    FragmentContactDetail fragmentContactDetail6 = FragmentContactDetail.this;
                                    int i86 = b;
                                    int i87 = (((i86 | 4) << 1) - (i86 ^ 4)) - 1;
                                    a = i87 % 128;
                                    int i88 = i87 % 2;
                                    FragmentContactDetail.access$300(fragmentContactDetail6, arrayList4);
                                    if (FragmentContactDetail.this.sp_village != null) {
                                        ArrayAdapter arrayAdapter = new ArrayAdapter(FragmentContactDetail.this.getActivity(), R.layout.spinner_item, FragmentContactDetail.this.vilageArrList);
                                        int i89 = a;
                                        int i90 = i89 & 45;
                                        int i91 = (((i89 | 45) & (~i90)) - (~(i90 << 1))) - 1;
                                        b = i91 % 128;
                                        if (i91 % 2 != 0) {
                                            FragmentContactDetail.this.sp_village.setAdapter((SpinnerAdapter) arrayAdapter);
                                            throw null;
                                        }
                                        FragmentContactDetail.this.sp_village.setAdapter((SpinnerAdapter) arrayAdapter);
                                        Spinner spinner = FragmentContactDetail.this.sp_village;
                                        AdapterView.OnItemSelectedListener onItemSelectedListener = new AdapterView.OnItemSelectedListener() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentContactDetail.13.1.1
                                            private static int a = 1;
                                            private static int b;

                                            @Override // android.widget.AdapterView.OnItemSelectedListener
                                            public void onNothingSelected(AdapterView<?> adapterView2) {
                                                int i92 = 2 % 2;
                                                int i93 = b;
                                                int i94 = (-2) - (((i93 & 12) + (i93 | 12)) ^ (-1));
                                                a = i94 % 128;
                                                int i95 = i94 % 2;
                                            }

                                            /* JADX WARN: Code duplicated, block: B:8:0x001c  */
                                            /* JADX WARN: Code duplicated, block: B:9:0x004d  */
                                            @Override // android.widget.AdapterView.OnItemSelectedListener
                                            public void onItemSelected(AdapterView<?> adapterView2, View view2, int i92, long j2) {
                                                int i93 = 2 % 2;
                                                int i94 = b;
                                                int i95 = (i94 ^ 55) + ((i94 & 55) << 1);
                                                a = i95 % 128;
                                                if (i95 % 2 == 0) {
                                                    int i96 = 11 / 0;
                                                    if (i92 == 0) {
                                                        Spinner spinner2 = FragmentContactDetail.this.sp_village;
                                                        int i97 = b;
                                                        int i98 = i97 & 13;
                                                        int i99 = ((i97 ^ 13) | i98) << 1;
                                                        int i100 = -((i97 | 13) & (~i98));
                                                        int i101 = (i99 & i100) + (i100 | i99);
                                                        a = i101 % 128;
                                                        int i102 = i101 % 2;
                                                        spinner2.setBackgroundResource(R.drawable.spinner_bg);
                                                        int i103 = b;
                                                        int i104 = (i103 & 15) + (i103 | 15);
                                                        a = i104 % 128;
                                                        int i105 = i104 % 2;
                                                    } else {
                                                        Spinner spinner3 = FragmentContactDetail.this.sp_village;
                                                        int i106 = a;
                                                        int i107 = i106 & 19;
                                                        int i108 = (((i106 ^ 19) | i107) << 1) - ((i106 | 19) & (~i107));
                                                        b = i108 % 128;
                                                        int i109 = i108 % 2;
                                                        spinner3.setBackgroundResource(R.drawable.spinner_bg_selected);
                                                        int i110 = a;
                                                        int i111 = (((i110 | 100) << 1) - (i110 ^ 100)) - 1;
                                                        b = i111 % 128;
                                                        int i112 = i111 % 2;
                                                    }
                                                } else if (i92 == 0) {
                                                    Spinner spinner4 = FragmentContactDetail.this.sp_village;
                                                    int i910 = b;
                                                    int i911 = i910 & 13;
                                                    int i912 = ((i910 ^ 13) | i911) << 1;
                                                    int i1010 = -((i910 | 13) & (~i911));
                                                    int i1011 = (i912 & i1010) + (i1010 | i912);
                                                    a = i1011 % 128;
                                                    int i1012 = i1011 % 2;
                                                    spinner4.setBackgroundResource(R.drawable.spinner_bg);
                                                    int i1013 = b;
                                                    int i1014 = (i1013 & 15) + (i1013 | 15);
                                                    a = i1014 % 128;
                                                    int i1015 = i1014 % 2;
                                                } else {
                                                    Spinner spinner5 = FragmentContactDetail.this.sp_village;
                                                    int i1016 = a;
                                                    int i1017 = i1016 & 19;
                                                    int i1018 = (((i1016 ^ 19) | i1017) << 1) - ((i1016 | 19) & (~i1017));
                                                    b = i1018 % 128;
                                                    int i1019 = i1018 % 2;
                                                    spinner5.setBackgroundResource(R.drawable.spinner_bg_selected);
                                                    int i113 = a;
                                                    int i114 = (((i113 | 100) << 1) - (i113 ^ 100)) - 1;
                                                    b = i114 % 128;
                                                    int i115 = i114 % 2;
                                                }
                                                Object selectedItem2 = FragmentContactDetail.this.sp_village.getSelectedItem();
                                                int i116 = a;
                                                int i117 = (((i116 ^ 57) | (i116 & 57)) << 1) - (((~i116) & 57) | (i116 & (-58)));
                                                b = i117 % 128;
                                                int i118 = i117 % 2;
                                                if (!selectedItem2.equals("Other")) {
                                                    EditText editText = FragmentContactDetail.this.et_village;
                                                    int i119 = b;
                                                    int i120 = ((i119 & (-4)) | ((~i119) & 3)) + ((i119 & 3) << 1);
                                                    a = i120 % 128;
                                                    if (i120 % 2 != 0) {
                                                        editText.setVisibility(8);
                                                        return;
                                                    }
                                                    editText.setVisibility(8);
                                                    Object obj3 = null;
                                                    obj3.hashCode();
                                                    throw null;
                                                }
                                                int i121 = a;
                                                int i122 = i121 ^ 73;
                                                int i123 = ((i121 & 73) | i122) << 1;
                                                int i124 = -i122;
                                                int i125 = ((i123 | i124) << 1) - (i123 ^ i124);
                                                b = i125 % 128;
                                                int i126 = i125 % 2;
                                                EditText editText2 = FragmentContactDetail.this.et_village;
                                                int i127 = b;
                                                int i128 = ((i127 ^ 79) - (~(-(-((i127 & 79) << 1))))) - 1;
                                                a = i128 % 128;
                                                if (i128 % 2 == 0) {
                                                    editText2.setVisibility(1);
                                                } else {
                                                    editText2.setVisibility(0);
                                                }
                                                int i129 = b + 77;
                                                a = i129 % 128;
                                                int i130 = i129 % 2;
                                            }
                                        };
                                        int i92 = a;
                                        int i93 = i92 & 35;
                                        int i94 = -(-(i92 | 35));
                                        int i95 = ((i93 | i94) << 1) - (i94 ^ i93);
                                        b = i95 % 128;
                                        int i96 = i95 % 2;
                                        spinner.setOnItemSelectedListener(onItemSelectedListener);
                                        int i97 = a;
                                        int i98 = i97 ^ 37;
                                        int i99 = ((i97 & 37) | i98) << 1;
                                        int i100 = -i98;
                                        int i101 = ((i99 | i100) << 1) - (i99 ^ i100);
                                        b = i101 % 128;
                                        int i102 = i101 % 2;
                                        return;
                                    }
                                }
                                int i103 = b;
                                int i104 = (((i103 | 68) << 1) - (i103 ^ 68)) - 1;
                                a = i104 % 128;
                                int i105 = i104 % 2;
                            }
                        });
                        aDVar.i.execute(new aA(aDVar));
                        int i49 = b;
                        int i50 = (i49 ^ 107) + ((i49 & 107) << 1);
                        a = i50 % 128;
                        if (i50 % 2 != 0) {
                            int i51 = 30 / 0;
                            return;
                        }
                        return;
                    }
                    AlertDialog.Builder builder = new AlertDialog.Builder(FragmentContactDetail.this.getActivity());
                    int i52 = a;
                    int i53 = ((i52 & 18) + (i52 | 18)) - 1;
                    b = i53 % 128;
                    if (i53 % 2 == 0) {
                        builder.setTitle("Session Expire");
                        builder.setMessage("Session Expire Please Login Again.!");
                        throw null;
                    }
                    builder.setTitle("Session Expire");
                    builder.setMessage("Session Expire Please Login Again.!");
                    builder.setCancelable(true);
                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentContactDetail.13.2
                        private static int a = 1;
                        private static int b;

                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i54) {
                            int i55 = 2 % 2;
                            ivas.gov.bisp.enumeration.p044bq.w wVar = new ivas.gov.bisp.enumeration.p044bq.w(FragmentContactDetail.access$000(FragmentContactDetail.this), FragmentContactDetail.this.sessionManager);
                            int i56 = b;
                            int i57 = i56 & 5;
                            int i58 = i57 + ((i56 ^ 5) | i57);
                            a = i58 % 128;
                            if (i58 % 2 == 0) {
                                wVar.execute(new Void[0]);
                            } else {
                                wVar.execute(new Void[0]);
                            }
                            dialogInterface.cancel();
                        }
                    };
                    int i54 = a;
                    int i55 = i54 ^ 89;
                    int i56 = ((i54 & 89) | i55) << 1;
                    int i57 = -i55;
                    int i58 = (i56 & i57) + (i56 | i57);
                    b = i58 % 128;
                    int i59 = i58 % 2;
                    builder.setPositiveButton("Confirm", onClickListener);
                    builder.create().show();
                    int i60 = b;
                    int i61 = ((i60 | 119) << 1) - (i60 ^ 119);
                    a = i61 % 128;
                    int i62 = i61 % 2;
                }
            }
            int i63 = a;
            int i64 = i63 & 15;
            int i65 = ((i63 ^ 15) | i64) << 1;
            int i66 = -((i63 | 15) & (~i64));
            int i67 = (i65 ^ i66) + ((i66 & i65) << 1);
            b = i67 % 128;
            if (i67 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0031  */
    private boolean isDataResetRequired() {
        boolean z;
        int i = 2 % 2;
        int i2 = d + 55;
        c = i2 % 128;
        if (i2 % 2 != 0) {
            ivas.gov.bisp.enumeration.p091n.j.E(this.editTextBlockCode, BuildConfig.FLAVOR);
            if (ivas.gov.bisp.enumeration.p091n.j.E(this.editTextAreaCode, BuildConfig.FLAVOR)) {
                z = false;
            } else {
                int i3 = c + 105;
                d = i3 % 128;
                int i4 = i3 % 2;
                z = true;
            }
        } else {
            z = !ivas.gov.bisp.enumeration.p091n.j.E(this.editTextBlockCode, BuildConfig.FLAVOR);
            if (!ivas.gov.bisp.enumeration.p091n.j.E(this.editTextAreaCode, BuildConfig.FLAVOR)) {
                int i5 = c + 105;
                d = i5 % 128;
                int i6 = i5 % 2;
                z = true;
            }
        }
        if (!ivas.gov.bisp.enumeration.p091n.j.E(this.editTextStructureNo, BuildConfig.FLAVOR)) {
            z = true;
        }
        if (ivas.gov.bisp.enumeration.p091n.j.E(this.editTextHouseholdNo, BuildConfig.FLAVOR)) {
            return z;
        }
        int i7 = c + 49;
        d = i7 % 128;
        return i7 % 2 != 0;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x007d  */
    /* JADX WARN: Code duplicated, block: B:9:0x006e  */
    private void continueAfterLocality() {
        int i = 2 % 2;
        int i2 = c + 99;
        d = i2 % 128;
        int i3 = 5;
        if (i2 % 2 == 0) {
            initViews();
            spinnerSelectListener();
            String region = this.newLocationForm.getRegion();
            Object[] objArr = new Object[1];
            a(29762 >> (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), new char[]{60612, 46858, 23382, 65420, 33790}, objArr);
            if (region.equals(((String) objArr[0]).intern())) {
                int i4 = d + 25;
                c = i4 % 128;
                int i5 = i4 % 2;
                this.radioButtonRegionRural.setChecked(true);
            } else {
                this.radioButtonRegionUrban.setChecked(true);
            }
        } else {
            initViews();
            spinnerSelectListener();
            String region2 = this.newLocationForm.getRegion();
            Object[] objArr2 = new Object[1];
            a(23498 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), new char[]{60612, 46858, 23382, 65420, 33790}, objArr2);
            if (region2.equals(((String) objArr2[0]).intern())) {
                int i6 = d + 25;
                c = i6 % 128;
                int i7 = i6 % 2;
                this.radioButtonRegionRural.setChecked(true);
            } else {
                this.radioButtonRegionUrban.setChecked(true);
            }
        }
        ag.j = -1;
        this.btnMap.setOnClickListener(new T(this, i3));
        setSpotCheckUserVisibility();
    }

    private void setSpotCheckUserVisibility() {
        int i = 2 % 2;
        int i2 = c + 71;
        d = i2 % 128;
        int i3 = i2 % 2;
        if (this.activityBeginSurvey.ac == 2) {
            int i4 = d + 53;
            c = i4 % 128;
            int i5 = i4 % 2;
            this.sp_motherLanguage.setVisibility(8);
            this.linearLayoutIsBispBenificiary.setVisibility(8);
            this.btnMap.setVisibility(8);
        }
    }

    public void setSpinnerAdapter(ArrayList<String> arrayList, final Spinner spinner) {
        int i = 2 % 2;
        ArrayAdapter arrayAdapter = new ArrayAdapter(getActivity(), R.layout.spinner_item, arrayList);
        arrayAdapter.setDropDownViewResource(R.layout.spinner_item_dropdown);
        spinner.setAdapter((SpinnerAdapter) arrayAdapter);
        spinner.setSelection(0);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentContactDetail.4
            private static int a = 1;
            private static int b;

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j) {
                int i3 = 2 % 2;
                int i4 = b;
                int i5 = i4 & 43;
                int i6 = (i5 - (~((i4 ^ 43) | i5))) - 1;
                a = i6 % 128;
                int i7 = i6 % 2;
                if (i2 == 0) {
                    int i8 = i4 & 33;
                    int i9 = (i4 | 33) & (~i8);
                    int i10 = -(-(i8 << 1));
                    int i11 = (i9 ^ i10) + ((i9 & i10) << 1);
                    a = i11 % 128;
                    int i12 = i11 % 2;
                    spinner.setBackgroundResource(R.drawable.spinner_bg);
                    int i13 = a + 103;
                    b = i13 % 128;
                    int i14 = i13 % 2;
                    return;
                }
                spinner.setBackgroundResource(R.drawable.spinner_bg_selected);
                ActivityBeginSurvey activityBeginSurveyAccess$000 = FragmentContactDetail.access$000(FragmentContactDetail.this);
                int i15 = b;
                int i16 = (((i15 & (-4)) | ((~i15) & 3)) - (~((i15 & 3) << 1))) - 1;
                a = i16 % 128;
                int i17 = i16 % 2;
                Survey survey = activityBeginSurveyAccess$000.aG;
                FragmentContactDetail fragmentContactDetail = FragmentContactDetail.this;
                ArrayList<String> arrayList2 = fragmentContactDetail.networkList;
                Spinner spinner2 = fragmentContactDetail.sp_networks;
                int i18 = b;
                int i19 = i18 & 99;
                int i20 = i19 + ((i18 ^ 99) | i19);
                a = i20 % 128;
                int i21 = i20 % 2;
                survey.mobile_network = arrayList2.get(spinner2.getSelectedItemPosition());
                int i22 = b;
                int i23 = i22 & 99;
                int i24 = ((((i22 ^ 99) | i23) << 1) - (~(-((i22 | 99) & (~i23))))) - 1;
                a = i24 % 128;
                int i25 = i24 % 2;
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView<?> adapterView) {
                int i2 = 2 % 2;
                int i3 = a;
                int i4 = i3 & 65;
                int i5 = (i3 ^ 65) | i4;
                int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
                b = i6 % 128;
                int i7 = i6 % 2;
            }
        });
        int i2 = d + 17;
        c = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private ArrayList<String> getOptionTextList(ArrayList<question_options> arrayList) {
        int i = 2 % 2;
        ArrayList<String> arrayList2 = new ArrayList<>();
        if (arrayList == null) {
            int i2 = c + 87;
            d = i2 % 128;
            int i3 = i2 % 2;
            return arrayList2;
        }
        for (question_options question_optionsVar : arrayList) {
            int i4 = c + 19;
            d = i4 % 128;
            int i5 = i4 % 2;
            if (question_optionsVar != null) {
                int i6 = c + 51;
                d = i6 % 128;
                if (i6 % 2 == 0) {
                    String str = question_optionsVar.option;
                    throw null;
                }
                String str2 = question_optionsVar.option;
                if (str2 != null && !str2.trim().isEmpty()) {
                    arrayList2.add(question_optionsVar.option);
                    int i7 = c + 81;
                    d = i7 % 128;
                    int i8 = i7 % 2;
                }
            }
        }
        if (arrayList2.isEmpty()) {
            Object[] objArr = new Object[1];
            b(TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0), new char[]{24082, 24156, 26935, 20263, 10069, 15238, 5402, 42404, 60091, 7142, 57248, 39901, 51340, 53819, 54839, 20555, 48140, 3745, 25334, 1230, 29587, 47962, 14667, 63935}, objArr);
            arrayList2.add(((String) objArr[0]).intern());
        }
        return arrayList2;
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        int i = 2 % 2;
        int i2 = d + 7;
        c = i2 % 128;
        int i3 = i2 % 2;
        super.onActivityCreated(bundle);
        ac.e(this.editTextMobile);
        ac.e(this.editTextMobileRepeat);
        ac.n(this.editTextMobile);
        ac.n(this.editTextMobileRepeat);
        ac.n(this.editTextAlternativeContact);
        int i4 = d + 33;
        c = i4 % 128;
        int i5 = i4 % 2;
    }

    private void generateBody() {
        int i = 2 % 2;
        int i2 = d + 121;
        c = i2 % 128;
        int i3 = i2 % 2;
        this.sp_visitStatus.setEnabled(false);
        ActivityBeginSurvey activityBeginSurvey = this.activityBeginSurvey;
        Object obj = null;
        if (activityBeginSurvey.ac == 2) {
            this.newLocationForm = (NewLocationForm) SugarRecord.first(NewLocationForm.class);
            continueAfterLocality();
            int i4 = c + 1;
            d = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            return;
        }
        if (ag.d) {
            this.newLocationForm = new NewLocationForm(activityBeginSurvey.aG);
            continueAfterLocality();
            return;
        }
        int i5 = d + 89;
        c = i5 % 128;
        if (i5 % 2 != 0) {
            readLocality();
            obj.hashCode();
            throw null;
        }
        readLocality();
        int i6 = c + 15;
        d = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 2 % 2;
        this.bispApplication = (BISPApplication) getActivity().getApplicationContext();
        this.mProgressBar = new ProgressDialog(getActivity());
        if (BISPApplication.f) {
            Objects.requireNonNull(this.bispApplication);
            this.notAtHome = null;
            try {
                this.json_not_at_home = new JSONObject(this.notAtHome.data);
                int i2 = d + 47;
                c = i2 % 128;
                int i3 = i2 % 2;
            } catch (JSONException unused) {
            }
        }
        try {
            if (this.parentView == null) {
                View viewInflate = layoutInflater.inflate(R.layout.fragment_contact_details, viewGroup, false);
                this.parentView = viewInflate;
                ButterKnife.c(this, viewInflate);
                this.activityBeginSurvey = (ActivityBeginSurvey) getActivity();
                this.editTextBlockCode.setVisibility(8);
                this.editTextAreaCode.setVisibility(8);
                generateBody();
                this.editTextAddress.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentContactDetail.1
                    private static int a = 0;
                    private static int b = 1;

                    @Override // android.view.View.OnFocusChangeListener
                    public void onFocusChange(View view, boolean z) {
                        int i4 = 2 % 2;
                        int i5 = b;
                        int i6 = ((i5 | 39) << 1) - (i5 ^ 39);
                        a = i6 % 128;
                        int i7 = i6 % 2;
                        if (!z) {
                            int i8 = (i5 & 37) + (i5 | 37);
                            a = i8 % 128;
                            int i9 = i8 % 2;
                            String strTrim = FragmentContactDetail.this.editTextAddress.getText().toString().trim();
                            int i10 = b;
                            int i11 = i10 & 79;
                            int i12 = ((i10 ^ 79) | i11) << 1;
                            int i13 = -((i10 | 79) & (~i11));
                            int i14 = (i12 & i13) + (i13 | i12);
                            a = i14 % 128;
                            if (i14 % 2 == 0 ? strTrim.length() < 15 : strTrim.length() < 52) {
                                FragmentContactDetail.this.editTextAddress.setError("برائے مہربانی صیح پتہ درج کریں۔");
                                int i15 = a;
                                int i16 = (i15 & (-68)) | ((~i15) & 67);
                                int i17 = (i15 & 67) << 1;
                                int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
                                b = i18 % 128;
                                if (i18 % 2 == 0) {
                                    throw null;
                                }
                                return;
                            }
                        }
                        FragmentContactDetail.this.editTextAddress.setError(null);
                        int i19 = a + 87;
                        b = i19 % 128;
                        if (i19 % 2 == 0) {
                            int i20 = 31 / 0;
                        }
                    }
                });
                this.editTextAddress.addTextChangedListener(new TextWatcher() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentContactDetail.2
                    private static int a = 1;
                    private static int b;

                    @Override // android.text.TextWatcher
                    public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
                        int i7 = 2 % 2;
                        int i8 = b + 73;
                        a = i8 % 128;
                        if (i8 % 2 == 0) {
                            int i9 = 8 / 0;
                        }
                    }

                    @Override // android.text.TextWatcher
                    public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
                        int i7 = 2 % 2;
                        int i8 = b;
                        int i9 = ((i8 ^ 50) + ((i8 & 50) << 1)) - 1;
                        a = i9 % 128;
                        if (i9 % 2 == 0) {
                            throw null;
                        }
                    }

                    @Override // android.text.TextWatcher
                    public void afterTextChanged(Editable editable) {
                        int i4 = 2 % 2;
                        Handler handler = new Handler(Looper.getMainLooper());
                        Runnable runnable = new Runnable() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentContactDetail.2.1
                            private static int a = 0;
                            private static int b = 1;

                            @Override // java.lang.Runnable
                            public void run() {
                                String string;
                                int i5 = 2 % 2;
                                int i6 = a;
                                int i7 = (i6 & 51) + (i6 | 51);
                                b = i7 % 128;
                                Object obj = null;
                                if (i7 % 2 == 0) {
                                    FragmentContactDetail.this.editTextAddress.getText().toString();
                                    obj.hashCode();
                                    throw null;
                                }
                                if (!TextUtils.isEmpty(FragmentContactDetail.this.editTextAddress.getText().toString())) {
                                    int i8 = a;
                                    int i9 = (i8 & 23) + (i8 | 23);
                                    b = i9 % 128;
                                    if (i9 % 2 == 0) {
                                        string = FragmentContactDetail.this.editTextAddress.getText().toString();
                                        int i10 = 9 / 0;
                                    } else {
                                        string = FragmentContactDetail.this.editTextAddress.getText().toString();
                                    }
                                    if (string.trim().length() < 15) {
                                        int i11 = a + 39;
                                        b = i11 % 128;
                                        if (i11 % 2 == 0) {
                                            FragmentContactDetail.this.editTextAddress.setError("برائے مہربانی مکمل پتہ درج کریں۔");
                                            throw null;
                                        }
                                        FragmentContactDetail.this.editTextAddress.setError("برائے مہربانی مکمل پتہ درج کریں۔");
                                        int i12 = a;
                                        int i13 = ((i12 ^ 30) + ((i12 & 30) << 1)) - 1;
                                        b = i13 % 128;
                                        int i14 = i13 % 2;
                                        return;
                                    }
                                    FragmentContactDetail.this.editTextAddress.setError(null);
                                    int i15 = b;
                                    int i16 = i15 & 75;
                                    int i17 = (i15 | 75) & (~i16);
                                    int i18 = i16 << 1;
                                    int i19 = ((i17 | i18) << 1) - (i17 ^ i18);
                                    a = i19 % 128;
                                    int i20 = i19 % 2;
                                }
                                int i21 = a;
                                int i22 = i21 & 71;
                                int i23 = i22 + ((i21 ^ 71) | i22);
                                b = i23 % 128;
                                int i24 = i23 % 2;
                            }
                        };
                        int i5 = a + 43;
                        b = i5 % 128;
                        if (i5 % 2 != 0) {
                            handler.removeCallbacks(runnable);
                            handler.postDelayed(runnable, 5000L);
                            int i6 = 92 / 0;
                        } else {
                            handler.removeCallbacks(runnable);
                            handler.postDelayed(runnable, 5000L);
                        }
                        int i7 = b;
                        int i8 = ((i7 | 25) << 1) - (i7 ^ 25);
                        a = i8 % 128;
                        if (i8 % 2 == 0) {
                            int i9 = 62 / 0;
                        }
                    }
                });
                this.activityBeginSurvey.aG.contactDetailStart = z.e();
            }
        } catch (Exception unused2) {
        }
        this.sessionManager = new SessionManager(getActivity());
        View view = this.parentView;
        int i4 = d + 93;
        c = i4 % 128;
        int i5 = i4 % 2;
        return view;
    }

    private void customDialogNew(int i, String str, String str2) {
        int i2 = 2 % 2;
        Typeface typefaceB = C0084m.b(getActivity(), R.font.jameel_noori_nastaleeq);
        androidx.appcompat.app.b.aIz aiz = new androidx.appcompat.app.b.aIz(getActivity());
        View viewInflate = getActivity().getLayoutInflater().inflate(R.layout.new_custom_dialog, (ViewGroup) null);
        aiz.c(viewInflate);
        final androidx.appcompat.app.b bVarB = aiz.b();
        bVarB.show();
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_heading);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_message);
        textView.setText(str);
        textView2.setText(str2);
        textView2.setTypeface(typefaceB);
        ((TextView) viewInflate.findViewById(R.id.btn_ok)).setOnClickListener(new View.OnClickListener() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentContactDetail.17
            private static int a = 0;
            private static int b = 1;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                int i3 = 2 % 2;
                int i4 = b;
                int i5 = ((i4 | 71) << 1) - (((~i4) & 71) | (i4 & (-72)));
                a = i5 % 128;
                Object obj = null;
                if (i5 % 2 != 0) {
                    bVarB.dismiss();
                    obj.hashCode();
                    throw null;
                }
                bVarB.dismiss();
                int i6 = b;
                int i7 = ((i6 ^ 87) | (i6 & 87)) << 1;
                int i8 = -(((~i6) & 87) | (i6 & (-88)));
                int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
                a = i9 % 128;
                if (i9 % 2 != 0) {
                    throw null;
                }
            }
        });
        int i3 = c + 77;
        d = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.app.Fragment
    public void onResume() {
        int i = 2 % 2;
        super.onResume();
        if (!this.isTimerStart) {
            int i2 = c + 123;
            d = i2 % 128;
            int i3 = i2 % 2;
            SharedPreferences sharedPreferences = ah.c.d;
            Object[] objArr = new Object[1];
            a((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 50221, new char[]{60671, 10472, 25784, 41048, 64623, 14386, 30169, 45551, 52658, 2374, 17703, 33082, 57048, 6810, 22181, 37499}, objArr);
            if (sharedPreferences.getInt(((String) objArr[0]).intern(), 1) == 1) {
                SharedPreferences sharedPreferences2 = ah.c.d;
                Object[] objArr2 = new Object[1];
                b(ViewConfiguration.getEdgeSlop() >> 16, new char[]{21579, 21544, 24172, 10382, 34944, 3293, 8018, 37608, 36188, 31772, 28782, 13347, 49871, 58746, 45469, 65409}, objArr2);
                this.countDownTimer = new CountDownTimer(sharedPreferences2.getInt(((String) objArr2[0]).intern(), 0) * 1000, 1000L) { // from class: ivas.gov.bisp.enumeration.fragments.FragmentContactDetail.3
                    private static int a = 0;
                    private static int b = 1;

                    @Override // android.os.CountDownTimer
                    public void onTick(long j) {
                        int i4 = 2 % 2;
                        try {
                            TextView textView = FragmentContactDetail.this.textViewTimeRemaining;
                            StringBuilder sb = new StringBuilder();
                            int i5 = a;
                            int i6 = ((i5 | 77) << 1) - (i5 ^ 77);
                            b = i6 % 128;
                            int i7 = i6 % 2;
                            sb.append("Time Remaining : ");
                            int i8 = b + 105;
                            a = i8 % 128;
                            int i9 = i8 % 2;
                            sb.append((int) (j / 1000));
                            String string = sb.toString();
                            int i10 = a + 43;
                            b = i10 % 128;
                            int i11 = i10 % 2;
                            textView.setText(string);
                            ActivityBeginSurvey activityBeginSurveyAccess$000 = FragmentContactDetail.access$000(FragmentContactDetail.this);
                            int i12 = a;
                            int i13 = (i12 & (-28)) | ((~i12) & 27);
                            int i14 = -(-((i12 & 27) << 1));
                            int i15 = (i13 & i14) + (i14 | i13);
                            b = i15 % 128;
                            int i16 = i15 % 2;
                            activityBeginSurveyAccess$000.buttonNext.setEnabled(false);
                            FragmentContactDetail fragmentContactDetail = FragmentContactDetail.this;
                            int i17 = b;
                            int i18 = ((i17 & 95) - (~(i17 | 95))) - 1;
                            a = i18 % 128;
                            (i18 % 2 != 0 ? FragmentContactDetail.access$000(fragmentContactDetail) : FragmentContactDetail.access$000(fragmentContactDetail)).buttonPrevious.setEnabled(false);
                            int i19 = b + 45;
                            a = i19 % 128;
                            int i20 = i19 % 2;
                            FragmentContactDetail.this.isTimerStart = true;
                        } catch (Exception unused) {
                        }
                    }

                    @Override // android.os.CountDownTimer
                    public void onFinish() {
                        int i4 = 2 % 2;
                        int i5 = b;
                        int i6 = i5 & 45;
                        int i7 = ((i5 | 45) & (~i6)) + (i6 << 1);
                        a = i7 % 128;
                        try {
                            if (i7 % 2 != 0) {
                                FragmentContactDetail.this.textViewTimeRemaining.setVisibility(122);
                            } else {
                                FragmentContactDetail.this.textViewTimeRemaining.setVisibility(8);
                            }
                            Button button = FragmentContactDetail.access$000(FragmentContactDetail.this).buttonNext;
                            int i8 = b;
                            int i9 = i8 ^ 67;
                            int i10 = (i8 & 67) << 1;
                            int i11 = (i9 & i10) + (i10 | i9);
                            a = i11 % 128;
                            if (i11 % 2 != 0) {
                                button.setEnabled(true);
                            } else {
                                button.setEnabled(true);
                            }
                            FragmentContactDetail.access$000(FragmentContactDetail.this).buttonPrevious.setEnabled(true);
                            int i12 = b;
                            int i13 = (i12 & (-6)) | ((~i12) & 5);
                            int i14 = (i12 & 5) << 1;
                            int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
                            a = i15 % 128;
                            if (i15 % 2 == 0) {
                                return;
                            }
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        } catch (Exception unused) {
                        }
                    }
                }.start();
                int i4 = c + 65;
                d = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
                return;
            }
        }
        this.textViewTimeRemaining.setVisibility(8);
        this.activityBeginSurvey.buttonNext.setEnabled(true);
        this.activityBeginSurvey.buttonPrevious.setEnabled(true);
    }

    public void spinnerSelectListener() {
        int i = 2 % 2;
        this.sp_visitStatus.setSelection(3);
        this.sp_visitStatus.setBackgroundResource(R.drawable.spinner_bg_selected);
        this.sp_structureNumber.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentContactDetail.9
            private static int a = 1;
            private static int b;

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView<?> adapterView) {
                int i2 = 2 % 2;
                int i3 = b;
                int i4 = (i3 & 86) + (i3 | 86);
                int i5 = (i4 ^ (-1)) + (i4 << 1);
                a = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j) {
                int i3 = 2 % 2;
                int i4 = b;
                int i5 = (i4 ^ 35) + ((i4 & 35) << 1);
                int i6 = i5 % 128;
                a = i6;
                int i7 = i5 % 2;
                if (i2 > 0) {
                    int i8 = ((i6 | 39) << 1) - (i6 ^ 39);
                    b = i8 % 128;
                    int i9 = i8 % 2;
                    LocationManager locationManager = (LocationManager) FragmentContactDetail.this.getActivity().getSystemService("location");
                    int i10 = b;
                    int i11 = ((i10 ^ 20) + ((i10 & 20) << 1)) - 1;
                    a = i11 % 128;
                    int i12 = i11 % 2;
                    Object obj = null;
                    if (!(!locationManager.isProviderEnabled("gps"))) {
                        int i13 = a;
                        int i14 = (i13 & (-48)) | ((~i13) & 47);
                        int i15 = (i13 & 47) << 1;
                        int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
                        b = i16 % 128;
                        int i17 = i16 % 2;
                        if (FragmentContactDetail.access$200(FragmentContactDetail.this) == null) {
                            FragmentContactDetail fragmentContactDetail = FragmentContactDetail.this;
                            w wVar = new w((AppCompatActivity) fragmentContactDetail.getActivity());
                            int i18 = b + 109;
                            a = i18 % 128;
                            int i19 = i18 % 2;
                            FragmentContactDetail.access$202(fragmentContactDetail, wVar);
                            int i20 = a;
                            int i21 = (i20 & 83) + (i20 | 83);
                            b = i21 % 128;
                            int i22 = i21 % 2;
                        }
                        EnumerationStructure enumerationStructure = FragmentContactDetail.this.structureNumberList.get(i2);
                        int i23 = a;
                        int i24 = (i23 & (-48)) | ((~i23) & 47);
                        int i25 = -(-((i23 & 47) << 1));
                        int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
                        b = i26 % 128;
                        if (i26 % 2 != 0) {
                            enumerationStructure.getIsGpsBound().equalsIgnoreCase("1");
                            throw null;
                        }
                        if (enumerationStructure.getIsGpsBound().equalsIgnoreCase("1")) {
                            String location = FragmentContactDetail.this.getLocation(enumerationStructure.getLatitude());
                            int i27 = a;
                            int i28 = (i27 & (-46)) | ((~i27) & 45);
                            int i29 = (i27 & 45) << 1;
                            int i30 = (i28 & i29) + (i29 | i28);
                            b = i30 % 128;
                            int i31 = i30 % 2;
                            String location2 = FragmentContactDetail.this.getLocation(enumerationStructure.getLongitude());
                            int i32 = b;
                            int i33 = ((i32 & 43) - (~(-(-(i32 | 43))))) - 1;
                            a = i33 % 128;
                            int i34 = i33 % 2;
                            FragmentContactDetail fragmentContactDetail2 = FragmentContactDetail.this;
                            String strT = ivas.gov.bisp.enumeration.p091n.j.t(location, ",", location2);
                            int i35 = a;
                            int i36 = (i35 ^ 37) + ((i35 & 37) << 1);
                            b = i36 % 128;
                            int i37 = i36 % 2;
                            String strE = BISPApplication.e();
                            int i38 = Integer.parseInt(enumerationStructure.getDistance());
                            int i39 = b;
                            int i40 = ((i39 ^ 22) + ((i39 & 22) << 1)) - 1;
                            a = i40 % 128;
                            int i41 = i40 % 2;
                            if (!fragmentContactDetail2.isInRange(strT, strE, i38)) {
                                int i42 = a;
                                int i43 = i42 & 109;
                                int i44 = ((i42 ^ 109) | i43) << 1;
                                int i45 = -((i42 | 109) & (~i43));
                                int i46 = (i44 ^ i45) + ((i45 & i44) << 1);
                                b = i46 % 128;
                                if (i46 % 2 != 0) {
                                    FragmentContactDetail.this.sp_structureNumber.setSelection(1);
                                } else {
                                    FragmentContactDetail.this.sp_structureNumber.setSelection(0);
                                }
                                C0104p.c().e(FragmentContactDetail.this.getActivity(), "Alert!", "You are not at the right survey location.\n\nPlease, get near to structure or wait if you are already near to the structure.", null, false);
                                int i47 = b;
                                int i48 = ((i47 & 125) - (~(i47 | 125))) - 1;
                                a = i48 % 128;
                                if (i48 % 2 == 0) {
                                    throw null;
                                }
                                return;
                            }
                        }
                    } else {
                        FragmentContactDetail.this.sp_structureNumber.setSelection(0);
                        AlertDialog.Builder builder = new AlertDialog.Builder(FragmentContactDetail.this.getActivity());
                        int i49 = a;
                        int i50 = i49 ^ 61;
                        int i51 = (((i49 & 61) | i50) << 1) - i50;
                        b = i51 % 128;
                        if (i51 % 2 != 0) {
                            builder.setTitle("GPS is not Enabled!");
                            builder.setMessage("Do you want to turn on GPS?");
                            obj.hashCode();
                            throw null;
                        }
                        builder.setTitle("GPS is not Enabled!");
                        builder.setMessage("Do you want to turn on GPS?");
                        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentContactDetail.9.1
                            private static int a = 0;
                            private static int b = 1;

                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(DialogInterface dialogInterface, int i52) {
                                int i53 = 2 % 2;
                                Intent intent = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
                                FragmentContactDetail fragmentContactDetail3 = FragmentContactDetail.this;
                                int i54 = a;
                                int i55 = ((i54 ^ 101) | (i54 & 101)) << 1;
                                int i56 = -(((~i54) & 101) | (i54 & (-102)));
                                int i57 = (i55 ^ i56) + ((i56 & i55) << 1);
                                b = i57 % 128;
                                int i58 = i57 % 2;
                                fragmentContactDetail3.getActivity().startActivity(intent);
                                if (i58 == 0) {
                                    throw null;
                                }
                            }
                        });
                        builder.setNegativeButton("No", new DialogInterface.OnClickListener() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentContactDetail.9.2
                            private static int a = 0;
                            private static int b = 1;

                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(DialogInterface dialogInterface, int i52) {
                                int i53 = 2 % 2;
                                int i54 = b;
                                int i55 = (i54 & (-66)) | ((~i54) & 65);
                                int i56 = -(-((i54 & 65) << 1));
                                int i57 = ((i55 | i56) << 1) - (i56 ^ i55);
                                a = i57 % 128;
                                if (i57 % 2 != 0) {
                                    FragmentContactDetail.this.getActivity().finish();
                                    int i58 = 10 / 0;
                                } else {
                                    FragmentContactDetail.this.getActivity().finish();
                                }
                                int i59 = b;
                                int i60 = ((i59 & 39) - (~(-(-(i59 | 39))))) - 1;
                                a = i60 % 128;
                                if (i60 % 2 == 0) {
                                    dialogInterface.cancel();
                                    return;
                                }
                                dialogInterface.cancel();
                                Object obj2 = null;
                                obj2.hashCode();
                                throw null;
                            }
                        });
                        int i52 = a;
                        int i53 = i52 & 21;
                        int i54 = (((i52 ^ 21) | i53) << 1) - ((i52 | 21) & (~i53));
                        b = i54 % 128;
                        int i55 = i54 % 2;
                        builder.show();
                        int i56 = a;
                        int i57 = i56 ^ 59;
                        int i58 = ((i56 & 59) | i57) << 1;
                        int i59 = -i57;
                        int i60 = (i58 ^ i59) + ((i58 & i59) << 1);
                        b = i60 % 128;
                        int i61 = i60 % 2;
                    }
                }
                int i62 = a + 61;
                b = i62 % 128;
                int i63 = i62 % 2;
            }
        });
        this.sp_province.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentContactDetail.10
            private static int a = 0;
            private static int b = 1;

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView<?> adapterView) {
                int i2 = 2 % 2;
                int i3 = b;
                int i4 = i3 & 115;
                int i5 = ((i3 ^ 115) | i4) << 1;
                int i6 = -((i3 | 115) & (~i4));
                int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
                a = i7 % 128;
                int i8 = i7 % 2;
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x003f, code lost:
            
                r8.sp_tehsil.setVisibility(113);
                r8 = r6.this$0.sp_uc;
                r10 = 117;
             */
            /* JADX WARN: Code restructure failed: missing block: B:11:0x004d, code lost:
            
                r8.sp_tehsil.setVisibility(8);
                r8 = r6.this$0.sp_uc;
                r10 = 8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0057, code lost:
            
                r8.setVisibility(r10);
                r6.this$0.sp_village.setVisibility(8);
                r8 = ivas.gov.bisp.enumeration.fragments.FragmentContactDetail.AnonymousClass10.a;
                r9 = r8 & 63;
                r8 = -(-(r8 | 63));
                r10 = ((r9 | r8) << 1) - (r8 ^ r9);
                ivas.gov.bisp.enumeration.fragments.FragmentContactDetail.AnonymousClass10.b = r10 % 128;
                r10 = r10 % 2;
                r6.this$0.sp_province.setBackgroundResource(ivas.gov.bisp.enumeration.R.drawable.spinner_bg);
                r8 = ivas.gov.bisp.enumeration.fragments.FragmentContactDetail.AnonymousClass10.b;
                r9 = (r8 & 101) + (r8 | 101);
                ivas.gov.bisp.enumeration.fragments.FragmentContactDetail.AnonymousClass10.a = r9 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x008a, code lost:
            
                if ((r9 % 2) != 0) goto L15;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x008c, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x008e, code lost:
            
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x008f, code lost:
            
                r6.this$0.sp_province.setBackgroundResource(ivas.gov.bisp.enumeration.R.drawable.spinner_bg_selected);
                r6.this$0.sp_district.setVisibility(0);
                r10 = new ivas.gov.bisp.enumeration.bK.as(r6.this$0.getActivity(), r6.this$0.provinceList.get(r9).province_id, r6.this$0.getActivity().getResources().getString(ivas.gov.bisp.enumeration.R.string.selectdistrict), r6.this$0.sp_district, new ivas.gov.bisp.enumeration.fragments.FragmentContactDetail.AnonymousClass10.AnonymousClass1(r6));
                r9 = ivas.gov.bisp.enumeration.fragments.FragmentContactDetail.AnonymousClass10.b;
                r11 = r9 & 27;
                r9 = (r9 | 27) & (~r11);
                r11 = -(-(r11 << 1));
                r0 = ((r9 | r11) << 1) - (r9 ^ r11);
                ivas.gov.bisp.enumeration.fragments.FragmentContactDetail.AnonymousClass10.a = r0 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x00e9, code lost:
            
                if ((r0 % 2) == 0) goto L20;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x00eb, code lost:
            
                r10.execute(new java.lang.Void[0]);
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x00f1, code lost:
            
                r10.execute(new java.lang.Void[0]);
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x00f6, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
            
                if (r9 == 0) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
            
                if (r9 == 0) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
            
                r6.this$0.sp_district.setVisibility(8);
                r8 = r6.this$0;
                r10 = ivas.gov.bisp.enumeration.fragments.FragmentContactDetail.AnonymousClass10.a;
                r11 = (((r10 & (-110)) | ((~r10) & 109)) - (~(-(-((r10 & 109) << 1))))) - 1;
                ivas.gov.bisp.enumeration.fragments.FragmentContactDetail.AnonymousClass10.b = r11 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x003d, code lost:
            
                if ((r11 % 2) != 0) goto L11;
             */
            @Override // android.widget.AdapterView.OnItemSelectedListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void onItemSelected(android.widget.AdapterView<?> r7, android.view.View r8, int r9, long r10) {
                /*
                    Method dump skipped, instruction units count: 247
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.fragments.FragmentContactDetail.AnonymousClass10.onItemSelected(android.widget.AdapterView, android.view.View, int, long):void");
            }
        });
        this.sp_district.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentContactDetail.11
            private static int a = 1;
            private static int b;

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView<?> adapterView) {
                int i2 = 2 % 2;
                int i3 = b;
                int i4 = i3 ^ 47;
                int i5 = ((i3 & 47) | i4) << 1;
                int i6 = -i4;
                int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
                a = i7 % 128;
                int i8 = i7 % 2;
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
            
                r6.this$0.sp_uc.setVisibility(1);
             */
            /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
            
                r6.this$0.sp_uc.setVisibility(8);
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
            
                r8 = r6.this$0;
                r11 = ivas.gov.bisp.enumeration.fragments.FragmentContactDetail.AnonymousClass11.b;
                r0 = r11 & 59;
                r11 = r11 | 59;
                r1 = ((r0 | r11) << 1) - (r11 ^ r0);
                ivas.gov.bisp.enumeration.fragments.FragmentContactDetail.AnonymousClass11.a = r1 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x0054, code lost:
            
                if ((r1 % 2) != 0) goto L16;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0056, code lost:
            
                r8.sp_village.setVisibility(83);
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0062, code lost:
            
                r8.sp_village.setVisibility(8);
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0068, code lost:
            
                r6.this$0.sp_district.setBackgroundResource(ivas.gov.bisp.enumeration.R.drawable.spinner_bg);
                r8 = ivas.gov.bisp.enumeration.fragments.FragmentContactDetail.AnonymousClass11.b;
                r9 = r8 & 105;
                r8 = (r8 ^ 105) | r9;
                r10 = ((r9 | r8) << 1) - (r8 ^ r9);
                ivas.gov.bisp.enumeration.fragments.FragmentContactDetail.AnonymousClass11.a = r10 % 128;
                r10 = r10 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0080, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x0081, code lost:
            
                r6.this$0.sp_district.setBackgroundResource(ivas.gov.bisp.enumeration.R.drawable.spinner_bg_selected);
                r6.this$0.sp_tehsil.setVisibility(0);
                r8 = new ivas.gov.bisp.enumeration.bK.ay(r6.this$0.getActivity(), r6.this$0.districtList.get(r9).distcode, r6.this$0.getActivity().getResources().getString(ivas.gov.bisp.enumeration.R.string.selecttehsil), r6.this$0.sp_tehsil, new ivas.gov.bisp.enumeration.fragments.FragmentContactDetail.AnonymousClass11.AnonymousClass1(r6));
                r9 = ivas.gov.bisp.enumeration.fragments.FragmentContactDetail.AnonymousClass11.b;
                r10 = ((r9 | 81) << 1) - (r9 ^ 81);
                ivas.gov.bisp.enumeration.fragments.FragmentContactDetail.AnonymousClass11.a = r10 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x00d2, code lost:
            
                if ((r10 % 2) != 0) goto L22;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x00d4, code lost:
            
                r8.execute(new java.lang.Void[0]);
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x00da, code lost:
            
                r8.execute(new java.lang.Void[0]);
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x00df, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
            
                if (r9 == 0) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
            
                if (r9 == 0) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
            
                r6.this$0.sp_tehsil.setVisibility(8);
                r8 = ivas.gov.bisp.enumeration.fragments.FragmentContactDetail.AnonymousClass11.a;
                r11 = (r8 & 109) + (r8 | 109);
                ivas.gov.bisp.enumeration.fragments.FragmentContactDetail.AnonymousClass11.b = r11 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x0031, code lost:
            
                if ((r11 % 2) == 0) goto L11;
             */
            @Override // android.widget.AdapterView.OnItemSelectedListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void onItemSelected(android.widget.AdapterView<?> r7, android.view.View r8, int r9, long r10) {
                /*
                    Method dump skipped, instruction units count: 224
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.fragments.FragmentContactDetail.AnonymousClass11.onItemSelected(android.widget.AdapterView, android.view.View, int, long):void");
            }
        });
        this.sp_tehsil.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentContactDetail.12
            private static int a = 1;
            private static int b;

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j) {
                int i3 = 2 % 2;
                int i4 = b;
                int i5 = i4 & 5;
                int i6 = (i4 ^ 5) | i5;
                int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
                a = i7 % 128;
                if (i7 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (i2 != 0) {
                    FragmentContactDetail.this.sp_tehsil.setBackgroundResource(R.drawable.spinner_bg_selected);
                    ivas.gov.bisp.enumeration.bK.ax axVar = new ivas.gov.bisp.enumeration.bK.ax(FragmentContactDetail.this.getActivity(), FragmentContactDetail.this.tehsilList.get(i2).tehsilcode, FragmentContactDetail.this.getActivity().getResources().getString(R.string.selectuc), FragmentContactDetail.this.sp_uc, new InterfaceC0028m() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentContactDetail.12.1
                        private static int a = 0;
                        private static int b = 1;

                        @Override // ivas.gov.bisp.enumeration.W.InterfaceC0028m
                        public void fillucList(ArrayList<uc> arrayList, ArrayList<String> arrayList2) {
                            int i8 = 2 % 2;
                            int i9 = a;
                            int i10 = i9 & 87;
                            int i11 = ((i9 ^ 87) | i10) << 1;
                            int i12 = -((i9 | 87) & (~i10));
                            int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
                            b = i13 % 128;
                            int i14 = i13 % 2;
                            FragmentContactDetail.this.ucArraList = arrayList;
                            if (arrayList.size() <= 0) {
                                FragmentContactDetail.this.sp_village.setVisibility(8);
                                int i15 = a;
                                int i16 = ((i15 | 33) << 1) - (i15 ^ 33);
                                b = i16 % 128;
                                if (i16 % 2 != 0) {
                                    FragmentContactDetail.this.sp_uc.setBackgroundResource(R.drawable.spinner_bg);
                                    return;
                                }
                                FragmentContactDetail.this.sp_uc.setBackgroundResource(R.drawable.spinner_bg);
                                Object obj2 = null;
                                obj2.hashCode();
                                throw null;
                            }
                            int i17 = a;
                            int i18 = (((i17 | 62) << 1) - (i17 ^ 62)) - 1;
                            b = i18 % 128;
                            if (i18 % 2 == 0) {
                                FragmentContactDetail.this.sp_uc.setVisibility(1);
                            } else {
                                FragmentContactDetail.this.sp_uc.setVisibility(0);
                            }
                            FragmentContactDetail.this.spinnerSelectListener();
                            int i19 = a;
                            int i20 = i19 & 83;
                            int i21 = -(-(i19 | 83));
                            int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
                            b = i22 % 128;
                            int i23 = i22 % 2;
                        }
                    });
                    axVar.i.execute(new aw(axVar));
                    int i8 = b;
                    int i9 = (i8 & (-120)) | ((~i8) & 119);
                    int i10 = -(-((i8 & 119) << 1));
                    int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
                    a = i11 % 128;
                    int i12 = i11 % 2;
                    return;
                }
                int i13 = ((i4 ^ 16) + ((i4 & 16) << 1)) - 1;
                a = i13 % 128;
                int i14 = i13 % 2;
                FragmentContactDetail.this.sp_uc.setVisibility(8);
                int i15 = a;
                int i16 = i15 & 87;
                int i17 = (i15 ^ 87) | i16;
                int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
                b = i18 % 128;
                int i19 = i18 % 2;
                FragmentContactDetail.this.sp_village.setVisibility(8);
                int i20 = b;
                int i21 = (i20 & (-12)) | ((~i20) & 11);
                int i22 = -(-((i20 & 11) << 1));
                int i23 = (i21 & i22) + (i22 | i21);
                a = i23 % 128;
                int i24 = i23 % 2;
                FragmentContactDetail.this.sp_tehsil.setBackgroundResource(R.drawable.spinner_bg);
                if (i24 == 0) {
                    int i25 = 68 / 0;
                }
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView<?> adapterView) {
                int i2 = 2 % 2;
                int i3 = a;
                int i4 = ((i3 ^ 68) + ((i3 & 68) << 1)) - 1;
                b = i4 % 128;
                int i5 = i4 % 2;
            }
        });
        this.sp_uc.setOnItemSelectedListener(new AnonymousClass13());
        this.sp_village.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentContactDetail.14
            private static int a = 1;
            private static int b;

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView<?> adapterView) {
                int i2 = 2 % 2;
                int i3 = b;
                int i4 = ((i3 ^ 57) - (~(-(-((i3 & 57) << 1))))) - 1;
                a = i4 % 128;
                if (i4 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0024  */
            /* JADX WARN: Code duplicated, block: B:12:0x0044  */
            /* JADX WARN: Code duplicated, block: B:13:0x0047  */
            /* JADX WARN: Code duplicated, block: B:15:0x0052  */
            /* JADX WARN: Code duplicated, block: B:8:0x0018  */
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j) {
                int i3;
                int i4;
                int i5 = 2 % 2;
                int i6 = a + 63;
                int i7 = i6 % 128;
                b = i7;
                Object obj = null;
                if (i6 % 2 != 0) {
                    int i8 = 71 / 0;
                    if (i2 == 0) {
                        i3 = i7 + 123;
                        a = i3 % 128;
                        if (i3 % 2 != 0) {
                            FragmentContactDetail.this.sp_village.setBackgroundResource(R.drawable.spinner_bg);
                            obj.hashCode();
                            throw null;
                        }
                        FragmentContactDetail.this.sp_village.setBackgroundResource(R.drawable.spinner_bg);
                        int i9 = b;
                        int i10 = i9 & 93;
                        int i11 = (i9 | 93) & (~i10);
                        int i12 = -(-(i10 << 1));
                        i4 = (i11 ^ i12) + ((i11 & i12) << 1);
                        a = i4 % 128;
                        if (i4 % 2 == 0) {
                            int i13 = 3 % 3;
                        }
                    } else {
                        FragmentContactDetail.this.sp_village.setBackgroundResource(R.drawable.spinner_bg_selected);
                        int i14 = a;
                        int i15 = (i14 ^ 73) + ((i14 & 73) << 1);
                        b = i15 % 128;
                        int i16 = i15 % 2;
                    }
                } else if (i2 == 0) {
                    i3 = i7 + 123;
                    a = i3 % 128;
                    if (i3 % 2 != 0) {
                        FragmentContactDetail.this.sp_village.setBackgroundResource(R.drawable.spinner_bg);
                        obj.hashCode();
                        throw null;
                    }
                    FragmentContactDetail.this.sp_village.setBackgroundResource(R.drawable.spinner_bg);
                    int i17 = b;
                    int i18 = i17 & 93;
                    int i19 = (i17 | 93) & (~i18);
                    int i110 = -(-(i18 << 1));
                    i4 = (i19 ^ i110) + ((i19 & i110) << 1);
                    a = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i111 = 3 % 3;
                    }
                } else {
                    FragmentContactDetail.this.sp_village.setBackgroundResource(R.drawable.spinner_bg_selected);
                    int i112 = a;
                    int i113 = (i112 ^ 73) + ((i112 & 73) << 1);
                    b = i113 % 128;
                    int i114 = i113 % 2;
                }
                if (!FragmentContactDetail.this.sp_village.getSelectedItem().equals("Other")) {
                    FragmentContactDetail.this.et_village.setVisibility(8);
                    int i20 = a;
                    int i21 = i20 & 71;
                    int i22 = ((i20 ^ 71) | i21) << 1;
                    int i23 = -((i20 | 71) & (~i21));
                    int i24 = (i22 & i23) + (i23 | i22);
                    b = i24 % 128;
                    int i25 = i24 % 2;
                    return;
                }
                int i26 = b + 115;
                a = i26 % 128;
                int i27 = i26 % 2;
                FragmentContactDetail.this.et_village.setVisibility(0);
                int i28 = a;
                int i29 = (i28 & 19) + (i28 | 19);
                b = i29 % 128;
                if (i29 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        });
        h hVarM = AppDatabase.l(getContext()).m();
        Object[] objArr = new Object[1];
        a(51193 - View.MeasureSpec.getSize(0), new char[]{60626, 11054, 25392, 47932, 62221, 2824, 17167, 39701, 54034, 60178, 9071, 31601, 45939, 52092, 838, 23422, 37707, 43856, 58192, 15276, 29614, 35762, 50084, 7056}, objArr);
        ArrayList<question_options> arrayList = new ArrayList<>(hVarM.ah(((String) objArr[0]).intern()));
        this.data_collection_modality = arrayList;
        ArrayAdapter arrayAdapter = new ArrayAdapter(getContext(), android.R.layout.simple_spinner_item, getOptionTextList(arrayList));
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.spinnerVenue.setAdapter((SpinnerAdapter) arrayAdapter);
        this.spinnerVenue.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentContactDetail.15
            private static int a = 0;
            private static int b = 1;

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j) {
                int i3 = 2 % 2;
                int i4 = b + 23;
                int i5 = i4 % 128;
                a = i5;
                int i6 = i4 % 2;
                if (i2 != 0) {
                    FragmentContactDetail.this.spinnerVenue.setBackgroundResource(R.drawable.spinner_bg_selected);
                    int i7 = a;
                    int i8 = ((i7 | 5) << 1) - (i7 ^ 5);
                    b = i8 % 128;
                    if (i8 % 2 == 0) {
                        throw null;
                    }
                    return;
                }
                int i9 = ((i5 ^ 105) | (i5 & 105)) << 1;
                int i10 = -((i5 & (-106)) | ((~i5) & 105));
                int i11 = ((i9 | i10) << 1) - (i9 ^ i10);
                b = i11 % 128;
                int i12 = i11 % 2;
                FragmentContactDetail.this.spinnerVenue.setBackgroundResource(R.drawable.spinner_bg);
                int i13 = b;
                int i14 = (i13 & 67) + (i13 | 67);
                a = i14 % 128;
                int i15 = i14 % 2;
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView<?> adapterView) {
                int i2 = 2 % 2;
                int i3 = b;
                int i4 = i3 & 87;
                int i5 = (i3 | 87) & (~i4);
                int i6 = -(-(i4 << 1));
                int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
                a = i7 % 128;
                if (i7 % 2 != 0) {
                    throw null;
                }
            }
        });
        int i2 = d + 15;
        c = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public void initViews() {
        int i;
        int i2 = 2 % 2;
        NewLocationForm newLocationForm = this.newLocationForm;
        Object obj = null;
        if (newLocationForm == null || newLocationForm.getVillageMapList() == null || this.newLocationForm.getVillageMapList().equalsIgnoreCase(BuildConfig.FLAVOR)) {
            this.villagemaps = null;
        } else {
            this.villagemaps = new ArrayList<>(Arrays.asList((Villagemaps[]) new C0145s().c().f(this.newLocationForm.getVillageMapList(), Villagemaps[].class)));
        }
        int i3 = 0;
        new av(getActivity(), getResources().getString(R.string.selectprovince), this.sp_province, new M() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentContactDetail.18
            private static int a = 1;
            private static int b;

            @Override // ivas.gov.bisp.enumeration.W.M
            public void fillProvList(ArrayList<province> arrayList, ArrayList<String> arrayList2) {
                int i4 = 2 % 2;
                int i5 = b;
                int i6 = (i5 ^ 105) + ((i5 & 105) << 1);
                a = i6 % 128;
                int i7 = i6 % 2;
                if (arrayList.size() <= 0) {
                    int i8 = b;
                    int i9 = (i8 & (-32)) | ((~i8) & 31);
                    int i10 = (i8 & 31) << 1;
                    int i11 = (i9 & i10) + (i10 | i9);
                    a = i11 % 128;
                    int i12 = i11 % 2;
                    af.b(FragmentContactDetail.this.getActivity(), "Address Library not Loaded. Kindly logout and login again!", true);
                    int i13 = a;
                    int i14 = i13 & 41;
                    int i15 = (i13 ^ 41) | i14;
                    int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
                    b = i16 % 128;
                    int i17 = i16 % 2;
                }
                FragmentContactDetail fragmentContactDetail = FragmentContactDetail.this;
                fragmentContactDetail.provinceList = arrayList;
                fragmentContactDetail.spinnerSelectListener();
                int i18 = b;
                int i19 = (i18 ^ 79) + ((i18 & 79) << 1);
                a = i19 % 128;
                int i20 = i19 % 2;
            }
        }).execute(new Void[0]);
        Activity activity = getActivity();
        Object[] objArr = new Object[1];
        b(KeyEvent.getMaxKeyCode() >> 16, new char[]{6156, 6245, 39405, 39653, 45777, 52061, 21254, 21885, 16173, 52848, 18990, 3673, 36491, 8908, 1010, 50640, 64005, 65135, 46972, 37215}, objArr);
        new au(activity, ((String) objArr[0]).intern(), getResources().getString(R.string.statusofvisit), this.sp_visitStatus, new J() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentContactDetail.19
            private static int a = 1;
            private static int b;

            @Override // ivas.gov.bisp.enumeration.W.J
            public void fillList(ArrayList<Item> arrayList) {
                int i4 = 2 % 2;
                int i5 = a;
                int i6 = (i5 & 61) + (i5 | 61);
                b = i6 % 128;
                if (i6 % 2 == 0) {
                    FragmentContactDetail fragmentContactDetail = FragmentContactDetail.this;
                    fragmentContactDetail.visitStatusList = arrayList;
                    fragmentContactDetail.spinnerSelectListener();
                } else {
                    FragmentContactDetail fragmentContactDetail2 = FragmentContactDetail.this;
                    fragmentContactDetail2.visitStatusList = arrayList;
                    fragmentContactDetail2.spinnerSelectListener();
                    int i7 = 39 / 0;
                }
            }
        }).execute(new Void[0]);
        Activity activity2 = getActivity();
        Object[] objArr2 = new Object[1];
        a(((Process.getThreadPriority(0) + 20) >> 6) + 8191, new char[]{60635, 62246, 54076, 45859, 37679, 29503, 21267, 13091, 4911, 62255, 54055, 45878, 37667, 29474, 21281}, objArr2);
        new au(activity2, ((String) objArr2[0]).intern(), getResources().getString(R.string.motherlanguage), this.sp_motherLanguage, new J() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentContactDetail.20
            private static int a = 0;
            private static int b = 1;

            @Override // ivas.gov.bisp.enumeration.W.J
            public void fillList(ArrayList<Item> arrayList) {
                int i4 = 2 % 2;
                int i5 = b;
                int i6 = i5 & 45;
                int i7 = -(-(i5 | 45));
                int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
                a = i8 % 128;
                int i9 = i8 % 2;
                FragmentContactDetail.this.motherLanguageList = arrayList;
                int i10 = b;
                int i11 = ((i10 ^ 31) | (i10 & 31)) << 1;
                int i12 = -(((~i10) & 31) | (i10 & (-32)));
                int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
                a = i13 % 128;
                if (i13 % 2 != 0) {
                    throw null;
                }
            }
        }).execute(new Void[0]);
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.networks)));
        this.networkList = arrayList;
        setSpinnerAdapter(arrayList, this.sp_networks);
        NewLocationForm newLocationForm2 = this.newLocationForm;
        if (newLocationForm2 == null || newLocationForm2.getVillageStructureNumber() == null || this.newLocationForm.getVillageStructureNumber().equalsIgnoreCase(BuildConfig.FLAVOR)) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(Arrays.asList((EnumerationStructure[]) new C0145s().c().f(this.newLocationForm.getVillageStructureNumber(), EnumerationStructure[].class)));
        if (arrayList2.size() > 0) {
            int i4 = c + 15;
            d = i4 % 128;
            if (i4 % 2 == 0) {
                boolean z = BISPApplication.f;
                obj.hashCode();
                throw null;
            }
            if (BISPApplication.f) {
                try {
                    JSONObject jSONObject = this.json_not_at_home;
                    Object[] objArr3 = new Object[1];
                    b((-1) - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0), new char[]{3161, 3114, 28799, 49128, 37287, 8917, 18242, 48375, 6694, 60263, 26952, 11560, 39628, 52053, 9957}, objArr3);
                    int i5 = jSONObject.getInt(((String) objArr3[0]).intern());
                    this.structureNumberList = new ArrayList<>();
                    for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                        String structureNumber = ((EnumerationStructure) arrayList2.get(i6)).getStructureNumber();
                        StringBuilder sb = new StringBuilder();
                        sb.append(i5);
                        if (structureNumber.equals(sb.toString())) {
                            int i7 = c + 29;
                            d = i7 % 128;
                            int i8 = i7 % 2;
                            this.structureNumberList.add((EnumerationStructure) arrayList2.get(i6));
                        }
                    }
                } catch (JSONException unused) {
                }
            } else {
                this.structureNumberList = new ArrayList<>(arrayList2);
            }
            EnumerationStructure enumerationStructure = new EnumerationStructure();
            Object[] objArr4 = new Object[1];
            b(1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), new char[]{63436, 63391, 17572, 59434, 18480, 5646, 48343, 34860, 19940, 48293, 45279, 62655, 24921, 65504, 28934, 16186, 5514}, objArr4);
            enumerationStructure.setStructureNumber(((String) objArr4[0]).intern());
            this.structureNumberList.add(0, enumerationStructure);
            o oVar = new o(getActivity(), R.layout.spinner_item, this.structureNumberList);
            this.structureNumberArrayAdapter = oVar;
            this.sp_structureNumber.setAdapter((SpinnerAdapter) oVar);
        }
        if (BISPApplication.f) {
            int i9 = d + 115;
            c = i9 % 128;
            try {
                if (i9 % 2 != 0) {
                    JSONObject jSONObject2 = this.json_not_at_home;
                    Object[] objArr5 = new Object[1];
                    b(Gravity.getAbsoluteGravity(0, 0), new char[]{3161, 3114, 28799, 49128, 37287, 8917, 18242, 48375, 6694, 60263, 26952, 11560, 39628, 52053, 9957}, objArr5);
                    i = jSONObject2.getInt(((String) objArr5[0]).intern());
                    i3 = 1;
                } else {
                    JSONObject jSONObject3 = this.json_not_at_home;
                    Object[] objArr6 = new Object[1];
                    b(Gravity.getAbsoluteGravity(0, 0), new char[]{3161, 3114, 28799, 49128, 37287, 8917, 18242, 48375, 6694, 60263, 26952, 11560, 39628, 52053, 9957}, objArr6);
                    i = jSONObject3.getInt(((String) objArr6[0]).intern());
                }
                while (i3 < this.structureNumberList.size()) {
                    String structureNumber2 = this.structureNumberList.get(i3).getStructureNumber();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i);
                    if (!(!structureNumber2.equals(sb2.toString()))) {
                        this.sp_structureNumber.setSelection(i3);
                        return;
                    }
                    i3++;
                }
            } catch (JSONException unused2) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0195  */
    /* JADX WARN: Code duplicated, block: B:23:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:26:0x01de  */
    /* JADX WARN: Code duplicated, block: B:38:0x025a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0276  */
    @Override // ivas.gov.bisp.enumeration.X.e
    public void parseJson() {
        int i = 2 % 2;
        if (this.radioGroupRegion.getCheckedRadioButtonId() == this.radioButtonRegionUrban.getId()) {
            Survey survey = this.activityBeginSurvey.aG;
            Object[] objArr = new Object[1];
            b((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), new char[]{1374, 1323, 19318, 37480, 53769, 6618, 20040, 14262, 10994}, objArr);
            survey.region = ((String) objArr[0]).intern();
        } else if (this.radioGroupRegion.getCheckedRadioButtonId() == this.radioButtonRegionRural.getId()) {
            Survey survey2 = this.activityBeginSurvey.aG;
            Object[] objArr2 = new Object[1];
            a(23498 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), new char[]{60612, 46858, 23382, 65420, 33790}, objArr2);
            survey2.region = ((String) objArr2[0]).intern();
        } else {
            this.activityBeginSurvey.aG.region = BuildConfig.FLAVOR;
        }
        this.activityBeginSurvey.aG.is_gps_exempted = this.newLocationForm.getIsGpsExempted();
        this.activityBeginSurvey.aG.tabVsGpsTime = this.newLocationForm.getTabVsGpsTime();
        this.activityBeginSurvey.aG.deskBasedSurvey = this.newLocationForm.getDeskBasedSurvey();
        this.activityBeginSurvey.aG.province_id = this.provinceList.get(this.sp_province.getSelectedItemPosition()).province_id;
        this.activityBeginSurvey.aG.province_name = this.provinceList.get(this.sp_province.getSelectedItemPosition()).province_name;
        this.activityBeginSurvey.aG.district_id = this.districtList.get(this.sp_district.getSelectedItemPosition()).distcode;
        this.activityBeginSurvey.aG.district_name = this.districtList.get(this.sp_district.getSelectedItemPosition()).district;
        this.activityBeginSurvey.aG.tehsil_id = this.tehsilList.get(this.sp_tehsil.getSelectedItemPosition()).tehsilcode;
        this.activityBeginSurvey.aG.tehsil_name = this.tehsilList.get(this.sp_tehsil.getSelectedItemPosition()).tehsil;
        ArrayList<uc> arrayList = this.ucArraList;
        if (arrayList != null) {
            int i2 = d + 21;
            c = i2 % 128;
            if (i2 % 2 != 0) {
                arrayList.size();
                throw null;
            }
            if (arrayList.size() > 0) {
                int i3 = d + 17;
                c = i3 % 128;
                if (i3 % 2 != 0) {
                    String str = this.ucArraList.get(this.sp_uc.getSelectedItemPosition()).uc;
                    Object[] objArr3 = new Object[1];
                    a(23219 >>> Color.red(1), new char[]{60665, 49813, 45168, 26582, 21912}, objArr3);
                    if (str.equalsIgnoreCase(((String) objArr3[0]).intern())) {
                        Survey survey3 = this.activityBeginSurvey.aG;
                        survey3.uc_id = 0;
                        survey3.uc_name = this.et_uc.getText().toString();
                    } else {
                        this.activityBeginSurvey.aG.uc_id = this.ucArraList.get(this.sp_uc.getSelectedItemPosition()).uccode;
                        this.activityBeginSurvey.aG.uc_name = String.valueOf(this.ucArraList.get(this.sp_uc.getSelectedItemPosition()).uc);
                    }
                } else {
                    String str2 = this.ucArraList.get(this.sp_uc.getSelectedItemPosition()).uc;
                    Object[] objArr4 = new Object[1];
                    a(Color.red(0) + 11863, new char[]{60665, 49813, 45168, 26582, 21912}, objArr4);
                    if (str2.equalsIgnoreCase(((String) objArr4[0]).intern())) {
                        Survey survey4 = this.activityBeginSurvey.aG;
                        survey4.uc_id = 0;
                        survey4.uc_name = this.et_uc.getText().toString();
                    } else {
                        this.activityBeginSurvey.aG.uc_id = this.ucArraList.get(this.sp_uc.getSelectedItemPosition()).uccode;
                        this.activityBeginSurvey.aG.uc_name = String.valueOf(this.ucArraList.get(this.sp_uc.getSelectedItemPosition()).uc);
                    }
                }
            } else {
                Survey survey5 = this.activityBeginSurvey.aG;
                survey5.uc_id = 0;
                survey5.uc_name = BuildConfig.FLAVOR;
            }
        } else {
            Survey survey6 = this.activityBeginSurvey.aG;
            survey6.uc_id = 0;
            survey6.uc_name = BuildConfig.FLAVOR;
        }
        ArrayList<vilages> arrayList2 = this.vilageArraList;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            Survey survey7 = this.activityBeginSurvey.aG;
            survey7.village_id = 0.0d;
            survey7.village_name = BuildConfig.FLAVOR;
        } else {
            int i4 = c + 115;
            d = i4 % 128;
            if (i4 % 2 == 0) {
                String str3 = this.vilageArraList.get(this.sp_village.getSelectedItemPosition()).locality;
                Object[] objArr5 = new Object[1];
                a(11485 - View.getDefaultSize(0, 0), new char[]{60665, 49813, 45168, 26582, 21912}, objArr5);
                if (str3.equalsIgnoreCase(((String) objArr5[0]).intern())) {
                    Survey survey8 = this.activityBeginSurvey.aG;
                    survey8.village_id = 0.0d;
                    survey8.village_name = this.et_village.getText().toString();
                    int i5 = c + 73;
                    d = i5 % 128;
                    int i6 = i5 % 2;
                } else {
                    this.activityBeginSurvey.aG.village_id = this.vilageArraList.get(this.sp_village.getSelectedItemPosition()).localitycode;
                    this.activityBeginSurvey.aG.village_name = this.vilageArraList.get(this.sp_village.getSelectedItemPosition()).locality;
                }
            } else {
                String str4 = this.vilageArraList.get(this.sp_village.getSelectedItemPosition()).locality;
                Object[] objArr6 = new Object[1];
                a(View.getDefaultSize(0, 0) + 11863, new char[]{60665, 49813, 45168, 26582, 21912}, objArr6);
                if (str4.equalsIgnoreCase(((String) objArr6[0]).intern())) {
                    Survey survey9 = this.activityBeginSurvey.aG;
                    survey9.village_id = 0.0d;
                    survey9.village_name = this.et_village.getText().toString();
                    int i7 = c + 73;
                    d = i7 % 128;
                    int i8 = i7 % 2;
                } else {
                    this.activityBeginSurvey.aG.village_id = this.vilageArraList.get(this.sp_village.getSelectedItemPosition()).localitycode;
                    this.activityBeginSurvey.aG.village_name = this.vilageArraList.get(this.sp_village.getSelectedItemPosition()).locality;
                }
            }
        }
        this.activityBeginSurvey.aG.po_id = this.newLocationForm.getPoId();
        this.activityBeginSurvey.aG.po_name = this.newLocationForm.getPoName();
        this.activityBeginSurvey.aG.villageAccuracy = this.newLocationForm.getVillageAccuracy();
        this.activityBeginSurvey.aG.village_map_listing = this.newLocationForm.getVillageMapList();
        this.activityBeginSurvey.aG.per_address = this.newLocationForm.getPer_address();
        this.activityBeginSurvey.aG.temp_address = this.newLocationForm.getTemp_address();
        this.activityBeginSurvey.aG.visit_status_id = this.visitStatusList.get(this.sp_visitStatus.getSelectedItemPosition()).getOptionId();
        this.activityBeginSurvey.aG.mother_lang_id = this.motherLanguageList.get(this.sp_motherLanguage.getSelectedItemPosition()).getOptionId();
        this.activityBeginSurvey.aG.data_collection_modality = ivas.gov.bisp.enumeration.p091n.j.s(new StringBuilder(), this.data_collection_modality.get(this.spinnerVenue.getSelectedItemPosition()).option_id, BuildConfig.FLAVOR);
        this.activityBeginSurvey.aG.mobile_network = this.networkList.get(this.sp_networks.getSelectedItemPosition());
        this.activityBeginSurvey.aG.visit_status_reason = ivas.gov.bisp.enumeration.p091n.j.m(this.editTextReason);
        Survey survey10 = this.activityBeginSurvey.aG;
        survey10.name_of_head = BuildConfig.FLAVOR;
        survey10.totalRosters = ivas.gov.bisp.enumeration.p091n.j.g(this.editTextNumberOfRoster);
        this.activityBeginSurvey.aG.address_of_house = this.editTextAddress.getText().toString();
        this.activityBeginSurvey.aG.mobile_number = this.editTextMobile.getText().toString();
        this.activityBeginSurvey.aG.alternative_contact = this.editTextAlternativeContact.getText().toString();
        ActivityBeginSurvey activityBeginSurvey = this.activityBeginSurvey;
        Survey survey11 = activityBeginSurvey.aG;
        survey11.bisp_benificiary = 999;
        survey11.blockCode = activityBeginSurvey.aA.getUcName();
        ActivityBeginSurvey activityBeginSurvey2 = this.activityBeginSurvey;
        activityBeginSurvey2.aG.areaCode = activityBeginSurvey2.aA.getVillageName();
        this.activityBeginSurvey.aG.householdNo = ivas.gov.bisp.enumeration.p091n.j.m(this.editTextHouseholdNo);
        this.activityBeginSurvey.aG.structureNo = this.structureNumberList.get(this.sp_structureNumber.getSelectedItemPosition()).getStructureNumber();
        this.activityBeginSurvey.aG.structureID = this.structureNumberList.get(this.sp_structureNumber.getSelectedItemPosition()).getListingId();
        this.activityBeginSurvey.aG.village_structure_number = this.newLocationForm.getVillageStructureNumber();
        this.activityBeginSurvey.aG.village_map_listing = this.newLocationForm.getVillageMapList();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00aa  */
    private void setVisibility(int i) {
        int i2 = 2 % 2;
        if (i == 1) {
            int i3 = c + 77;
            d = i3 % 128;
            int i4 = i3 % 2;
            this.editTextNameOfHead.setVisibility(0);
            this.editTextAddress.setVisibility(0);
            this.sp_motherLanguage.setVisibility(8);
            this.editTextHouseholdNo.setVisibility(8);
            this.sp_structureNumber.setVisibility(8);
            this.editTextMobile.setVisibility(8);
            this.editTextMobileRepeat.setVisibility(8);
            this.editTextAlternativeContact.setVisibility(8);
            this.linearLayoutIsBispBenificiary.setVisibility(8);
            this.linearLayoutRosterCount.setVisibility(8);
        } else if (i != 2) {
            int i5 = d;
            int i6 = i5 + 5;
            c = i6 % 128;
            int i7 = i6 % 2;
            if (i != 292) {
                int i8 = i5 + 63;
                int i9 = i8 % 128;
                c = i9;
                if (i8 % 2 == 0 ? i == 293 : i == 30797) {
                    this.editTextHouseholdNo.setVisibility(8);
                    this.sp_structureNumber.setVisibility(8);
                    this.editTextNameOfHead.setVisibility(8);
                    this.editTextAddress.setVisibility(8);
                    this.editTextMobile.setVisibility(8);
                    this.editTextMobileRepeat.setVisibility(8);
                    this.editTextAlternativeContact.setVisibility(8);
                    this.sp_motherLanguage.setVisibility(8);
                    this.linearLayoutIsBispBenificiary.setVisibility(8);
                    this.linearLayoutRosterCount.setVisibility(8);
                } else {
                    int i10 = i9 + 63;
                    d = i10 % 128;
                    int i11 = i10 % 2;
                    if (i != 294) {
                        this.editTextHouseholdNo.setVisibility(8);
                        this.sp_structureNumber.setVisibility(8);
                        this.sp_motherLanguage.setVisibility(0);
                        this.editTextNameOfHead.setVisibility(0);
                        this.editTextAddress.setVisibility(0);
                        this.editTextMobile.setVisibility(0);
                        this.editTextMobileRepeat.setVisibility(0);
                        this.editTextNumberOfRoster.setVisibility(0);
                        this.editTextAlternativeContact.setVisibility(0);
                        this.linearLayoutIsBispBenificiary.setVisibility(0);
                        this.linearLayoutRosterCount.setVisibility(8);
                    } else {
                        this.editTextHouseholdNo.setVisibility(8);
                        this.sp_structureNumber.setVisibility(8);
                        this.editTextNameOfHead.setVisibility(8);
                        this.editTextAddress.setVisibility(8);
                        this.editTextMobile.setVisibility(8);
                        this.editTextMobileRepeat.setVisibility(8);
                        this.editTextAlternativeContact.setVisibility(8);
                        this.sp_motherLanguage.setVisibility(8);
                        this.linearLayoutIsBispBenificiary.setVisibility(8);
                        this.linearLayoutRosterCount.setVisibility(8);
                    }
                }
            } else {
                this.editTextHouseholdNo.setVisibility(8);
                this.sp_structureNumber.setVisibility(8);
                this.editTextNameOfHead.setVisibility(8);
                this.editTextAddress.setVisibility(8);
                this.editTextMobile.setVisibility(8);
                this.editTextMobileRepeat.setVisibility(8);
                this.editTextAlternativeContact.setVisibility(8);
                this.sp_motherLanguage.setVisibility(8);
                this.linearLayoutIsBispBenificiary.setVisibility(8);
                this.linearLayoutRosterCount.setVisibility(8);
            }
        } else {
            this.editTextHouseholdNo.setVisibility(8);
            this.sp_structureNumber.setVisibility(8);
            this.editTextNameOfHead.setVisibility(8);
            this.editTextAddress.setVisibility(8);
            this.editTextMobile.setVisibility(8);
            this.editTextMobileRepeat.setVisibility(8);
            this.editTextAlternativeContact.setVisibility(8);
            this.sp_motherLanguage.setVisibility(8);
            this.linearLayoutIsBispBenificiary.setVisibility(8);
            this.linearLayoutRosterCount.setVisibility(8);
        }
        setSpotCheckUserVisibility();
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0180, code lost:
    
        if (ivas.gov.bisp.enumeration.p091n.j.E(r16.et_uc, net.sqlcipher.BuildConfig.FLAVOR) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0189, code lost:
    
        if (ivas.gov.bisp.enumeration.p091n.j.E(r16.et_uc, net.sqlcipher.BuildConfig.FLAVOR) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x018b, code lost:
    
        r2 = getActivity();
        r3 = r16.et_uc;
        r5 = new java.lang.Object[1];
        a(7244 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1)), new char[]{60643, 61630}, r5);
        ivas.gov.bisp.enumeration.p026az.z.k(r2, r3, ((java.lang.String) r5[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01ae, code lost:
    
        return false;
     */
    @Override // ivas.gov.bisp.enumeration.X.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean isValid() {
        /*
            Method dump skipped, instruction units count: 3136
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.fragments.FragmentContactDetail.isValid():boolean");
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
            int i4 = $10 + 21;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                jArr[mVar.e] = (((long) cArr[mVar.e]) % (((long) mVar.e) * ((long) mVar.d))) % (d$s51$4172 % 6031393033645231780L);
                i2 = mVar.e % 0;
            } else {
                jArr[mVar.e] = (6031393033645231780L ^ d$s51$4172) ^ (((long) cArr[mVar.e]) ^ (((long) mVar.e) * ((long) mVar.d)));
                i2 = mVar.e + 1;
            }
            mVar.e = i2;
        }
        char[] cArr2 = new char[length];
        mVar.e = 0;
        int i5 = $10 + 47;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        while (mVar.e < cArr.length) {
            cArr2[mVar.e] = (char) jArr[mVar.e];
            mVar.e++;
        }
        objArr[0] = new String(cArr2);
    }

    private static void b(int i, char[] cArr, Object[] objArr) {
        int i2 = 2 % 2;
        g gVar = new g();
        char[] cArrB = g.b(d$s40$4273 ^ (-3439381718914712265L), cArr, i);
        gVar.a = 4;
        while (gVar.a < cArrB.length) {
            int i3 = $10 + 5;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            gVar.c = gVar.a - 4;
            cArrB[gVar.a] = (char) (((long) (cArrB[gVar.a] ^ cArrB[gVar.a % 4])) ^ (((long) gVar.c) * (d$s40$4273 ^ (-3439381718914712265L))));
            gVar.a++;
            int i5 = $11 + 57;
            $10 = i5 % 128;
            int i6 = i5 % 2;
        }
        objArr[0] = new String(cArrB, 4, cArrB.length - 4);
    }
}
