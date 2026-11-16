package ivas.gov.bisp.enumeration.fragments;

import android.app.Activity;
import android.app.Fragment;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.Editable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.b;
import butterknife.BindView;
import butterknife.ButterKnife;
import ivas.gov.bisp.enumeration.ActivityBeginSurvey;
import ivas.gov.bisp.enumeration.BISPApplication;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.W.J;
import ivas.gov.bisp.enumeration.X.e;
import ivas.gov.bisp.enumeration.bK.ac;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.bK.ah;
import ivas.gov.bisp.enumeration.bK.au;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import ivas.gov.bisp.enumeration.models.KeyValue;
import ivas.gov.bisp.enumeration.models.SupervisorParseObject;
import ivas.gov.bisp.enumeration.models.Survey;
import ivas.gov.bisp.enumeration.models.VerificationQuestionsCount;
import ivas.gov.bisp.enumeration.o000Oo00.Oooo0;
import ivas.gov.bisp.enumeration.p002ab.C0084m;
import ivas.gov.bisp.enumeration.p026az.z;
import ivas.gov.bisp.enumeration.p043bp.C0201c;
import ivas.gov.bisp.enumeration.p043bp.h;
import ivas.gov.bisp.enumeration.p051bx.o;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.io.File;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class FragmentHouseholdInfo extends Fragment implements e {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final int ELECTRICITY_SCANNER = 200;
    private static final int GAS_SCANNER = 100;
    private static long d$s3$37132 = 0;
    private static int e = 0;
    private static char[] e$s2$37132 = null;
    public static final byte[] f;
    public static final int g;
    private static int h = 1;
    private ActivityBeginSurvey activityBeginSurvey;

    @BindView
    public Spinner agricultureLanSpinner;
    private HashMap<Integer, KeyValue> assetsInfoList;
    public BISPApplication bispApplication;
    public Button btn_scan_gas;

    @BindView
    public Button buttonTakePic;
    public CheckBox cb_hyderral_individual;
    public CheckBox cb_hyderral_social;
    public CheckBox cb_hyderral_solar;
    public CheckBox cb_hyderral_wind;
    public Oooo0<Item> cookingFuelArrayAdapter;
    public ArrayList<Item> cookingFuelList;
    private CountDownTimer countDownTimer;
    public Oooo0<Item> drinkingWaterArrayAdapter;
    public ArrayList<Item> drinkingWaterList;

    @BindView
    public EditText editTextNumber;

    @BindView
    public EditText editTextbuffalo;

    @BindView
    public EditText editTextcamel;

    @BindView
    public EditText editTextcow;

    @BindView
    public EditText editTextgoat;

    @BindView
    public EditText editTexthorse;
    public EditText elec_et;
    public Oooo0<Item> electricityArrayAdapter;
    public ArrayList<Item> electricityList;

    @BindView
    public EditText et_number_agri;
    public Oooo0<Item> gasArrayAdapter;
    public ArrayList<Item> gasList;
    public EditText gas_et;

    @BindView
    public ImageView imageButtonhousehold;
    public Oooo0<Item> landlineArrayAdapter;
    public ArrayList<Item> landlineList;
    public List<Integer> listPositionsSelected;

    @BindView
    public LinearLayout llElecMeterBill;

    @BindView
    public LinearLayout llGasMeterBill;

    @BindView
    public LinearLayout ll_airConditioner;

    @BindView
    public LinearLayout ll_airCooler;

    @BindView
    public LinearLayout ll_animal_count;

    @BindView
    public LinearLayout ll_car;

    @BindView
    public LinearLayout ll_computer;

    @BindView
    public LinearLayout ll_cookingRange;

    @BindView
    public LinearLayout ll_cookingStove;

    @BindView
    public LinearLayout ll_fan;

    @BindView
    public LinearLayout ll_freezer;

    @BindView
    public LinearLayout ll_generator;

    @BindView
    public LinearLayout ll_geyser;

    @BindView
    public LinearLayout ll_heater;

    @BindView
    public LinearLayout ll_holdagriculturalLand;

    @BindView
    public LinearLayout ll_house_storey;

    @BindView
    public LinearLayout ll_internet;

    @BindView
    public LinearLayout ll_main;

    @BindView
    public LinearLayout ll_minternet;

    @BindView
    public LinearLayout ll_mobile;

    @BindView
    public LinearLayout ll_motorcycle;

    @BindView
    public LinearLayout ll_number_of_rooms;

    @BindView
    public LinearLayout ll_refrigerator;

    @BindView
    public LinearLayout ll_sewing;

    @BindView
    public LinearLayout ll_tractor;

    @BindView
    public LinearLayout ll_tv;

    @BindView
    public LinearLayout ll_vcr;

    @BindView
    public LinearLayout ll_washingMachine;
    public LinearLayout llhyderralCheckbox;
    public Oooo0<Item> occupancyStatusArrayAdapter;
    public ArrayList<Item> occupancyStatusList;
    private File photoFile;
    private String photoPath;
    public RadioButton rb_hs_compound;
    public RadioButton rb_hs_multi;
    public RadioButton rb_hs_single;

    @BindView
    public RadioGroup rg_airConditioner;

    @BindView
    public RadioGroup rg_airCooler;

    @BindView
    public RadioGroup rg_animal;

    @BindView
    public RadioGroup rg_car;

    @BindView
    public RadioGroup rg_computer;

    @BindView
    public RadioGroup rg_cookingRange;

    @BindView
    public RadioGroup rg_cookingStove;

    @BindView
    public RadioGroup rg_fan;

    @BindView
    public RadioGroup rg_freezer;

    @BindView
    public RadioGroup rg_generator;

    @BindView
    public RadioGroup rg_geyser;

    @BindView
    public RadioGroup rg_heater;

    @BindView
    public RadioGroup rg_holdAgriculturalLand;

    @BindView
    public RadioGroup rg_house_structure;

    @BindView
    public RadioGroup rg_internet;

    @BindView
    public RadioGroup rg_minternet;

    @BindView
    public RadioGroup rg_mobile;

    @BindView
    public RadioGroup rg_motorcycle;

    @BindView
    public RadioGroup rg_refrigerator;

    @BindView
    public RadioGroup rg_sewing;

    @BindView
    public RadioGroup rg_tractor;

    @BindView
    public RadioGroup rg_tv;

    @BindView
    public RadioGroup rg_vcr;

    @BindView
    public RadioGroup rg_washingMachine;
    public Oooo0<Item> roofMaterialArrayAdapter;
    public ArrayList<Item> roofMaterialList;

    @BindView
    public Spinner sp_cooking_fuel;

    @BindView
    public Spinner sp_drinking_water;

    @BindView
    public Spinner sp_electricity;

    @BindView
    public Spinner sp_gas;

    @BindView
    public Spinner sp_landline;

    @BindView
    public Spinner sp_occupancy_status;

    @BindView
    public Spinner sp_roof_material;

    @BindView
    public Spinner sp_toilet;

    @BindView
    public Spinner sp_unit;

    @BindView
    public Spinner sp_unit_agri;

    @BindView
    public Spinner sp_wall_material;

    @BindView
    public Spinner spinnerNumberOfRooms;

    @BindView
    public TextView textViewTimeRemaining;
    public Oooo0<Item> toiletArrayAdapter;
    public ArrayList<Item> toiletList;

    @BindView
    public Spinner totalLandSpinner;
    public Oooo0<Item> unitArrayAdapter;
    public ArrayList<Item> unitList;
    public Oooo0<Item> wallMaterialArrayAdapter;
    public ArrayList<Item> wallMaterialList;
    private View parentView = null;
    public double totalCount = 8.0d;
    private boolean isValidTrue = false;
    private double houseHoldPercentage = 0.0d;
    private double dividerForPercentage = 0.0d;
    public boolean isTimerStart = false;
    private int selectionCode = 0;
    private boolean isTotalLandValidation = false;
    private boolean isAgricultureLandValidation = false;
    public boolean isValidElectricityMeter = false;
    public String oldMeterNo = BuildConfig.FLAVOR;
    public String newMeterNo = BuildConfig.FLAVOR;

    public class LayoutAndValueBoolean {
        public boolean isLayoutVisible;
        public boolean isValueSame;

        public LayoutAndValueBoolean() {
        }
    }

    static {
        c();
        f = new byte[]{92, -50, 92, -41, 6, -24, 18, 48, -72, 11, -1, -21, 0, 6, -14, -8, 72, -40, -21, -1, -21, 0, 10, 16, -18, -16, 7, -14, -1};
        g = 234;
        int i = e + 87;
        h = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ ActivityBeginSurvey access$000(FragmentHouseholdInfo fragmentHouseholdInfo) {
        int i = 2 % 2;
        int i2 = e + 77;
        int i3 = i2 % 128;
        h = i3;
        int i4 = i2 % 2;
        ActivityBeginSurvey activityBeginSurvey = fragmentHouseholdInfo.activityBeginSurvey;
        int i5 = i3 + 101;
        e = i5 % 128;
        if (i5 % 2 == 0) {
            return activityBeginSurvey;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void access$100(FragmentHouseholdInfo fragmentHouseholdInfo, String str, String str2, Spinner spinner, boolean z, EditText editText) {
        int i = 2 % 2;
        int i2 = e + 25;
        h = i2 % 128;
        int i3 = i2 % 2;
        fragmentHouseholdInfo.showAlertDialog(str, str2, spinner, z, editText);
        int i4 = h + 87;
        e = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ boolean access$202(FragmentHouseholdInfo fragmentHouseholdInfo, boolean z) {
        int i = 2 % 2;
        int i2 = h;
        int i3 = i2 + 63;
        e = i3 % 128;
        int i4 = i3 % 2;
        fragmentHouseholdInfo.isTotalLandValidation = z;
        int i5 = i2 + 27;
        e = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public static /* synthetic */ boolean access$302(FragmentHouseholdInfo fragmentHouseholdInfo, boolean z) {
        int i = 2 % 2;
        int i2 = e + 89;
        int i3 = i2 % 128;
        h = i3;
        int i4 = i2 % 2;
        fragmentHouseholdInfo.isAgricultureLandValidation = z;
        int i5 = i3 + 47;
        e = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0038 A[PHI: r2 r4 r7 r8 r9
  0x0038: PHI (r2v4 byte[]) = (r2v2 byte[]), (r2v6 byte[]) binds: [B:8:0x0036, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x0038: PHI (r4v12 int) = (r4v3 int), (r4v19 int) binds: [B:8:0x0036, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x0038: PHI (r7v9 int) = (r7v2 int), (r7v13 int) binds: [B:8:0x0036, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x0038: PHI (r8v7 int) = (r8v2 int), (r8v9 int) binds: [B:8:0x0036, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x0038: PHI (r9v5 byte[]) = (r9v3 byte[]), (r9v7 byte[]) binds: [B:8:0x0036, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    private static void b(byte b, int i, int i2, Object[] objArr) {
        int i3;
        int i4;
        byte[] bArr;
        int i5;
        byte[] bArr2;
        int i6 = 2 % 2;
        int i7 = h;
        int i8 = i7 + 19;
        e = i8 % 128;
        int i9 = -1;
        if (i8 % 2 != 0) {
            i3 = i + 4;
            i4 = (5 >>> b) + 28;
            bArr = f;
            int i10 = 4 % i2;
            bArr2 = new byte[i10 + 93];
            i5 = i10 + 213;
            if (bArr == null) {
                int i11 = i7 + 77;
                e = i11 % 128;
                int i12 = i11 % 2;
                int i13 = i5;
                i4 = (i5 + (-i4)) - 3;
                i3++;
                int i14 = h + 89;
                e = i14 % 128;
                int i15 = i14 % 2;
                i5 = i13;
            }
        } else {
            i3 = 4 - (i * 4);
            i4 = (b * 3) + 106;
            bArr = f;
            int i16 = i2 * 3;
            i5 = i16 + 25;
            bArr2 = new byte[i16 + 26];
            if (bArr == null) {
                int i17 = i7 + 77;
                e = i17 % 128;
                int i18 = i17 % 2;
                int i19 = i5;
                i4 = (i5 + (-i4)) - 3;
                i3++;
                int i110 = h + 89;
                e = i110 % 128;
                int i111 = i110 % 2;
                i5 = i19;
            }
        }
        while (true) {
            i9++;
            bArr2[i9] = (byte) i4;
            if (i9 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i20 = i5;
            i4 = (i4 + (-bArr[i3])) - 3;
            i3++;
            int i21 = h + 89;
            e = i21 % 128;
            int i22 = i21 % 2;
            i5 = i20;
        }
    }

    static void c() {
        char[] cArr = new char[2309];
        ByteBuffer.wrap("y\u0012¦.Ç}ä¿\u0005ã%\u0003Btc\u0083\u0080× \u0000ÁZî\u0096\u001f$À$¡u\u0082¿cõyK\u007f\u0002 þÁÁâc\u0005·#\u009dDËÌ\u0094\u0013Ir\u0099\u007f= \u0081ÁÁâpý3\"$Ci`¸\u0081à¡:Æpç\u0082\u0004Ý$OEaj\u0081\u008bÙ¨÷È3ézy,¦!Çaä¦\u0005·%\u0011Bxc\u0092\u0080Æ \u001aÁ\\î\u0093\u000fÓy)¦/Çbä¬\u0005·%\u0011Bxc\u0092\u0080Æ \u001aÁ\\î\u0093\u000fÓ¿I`\u001c\u0001j\"µÃçã+\u0084y¥ÔFÞf\u001c\u0007\u0007(²ÉÂêù\u008a>«oLùmñ\r'.gÏ\u0080ðÒ\u0090\u001f±\u0004R\u008fsÅ\u0014ã4pÕ\u007fö£\u0097£·)Xdy\u0082\u001aË:\u0001y8¦/Çbä¡\u0005þ%2B~cÆ\u0080å \u001dÁPî\u009e\u0001xÞx¿3\u009cñ}¥]\u007fG\u008d\u0098\u0080ùÖÚ\u0016;N\u001b\u0087|Å]3¾1\u009e\u008dÿæÐ41h\u0012Dy>¦,Çhä©\u0005ã%.Bpc\u0085\u0080Ê \u001cÁLàá?ó^·}v\u009c<¼ñÛ¯úZ\u0019\u00159ÃX\u0093w\r\u0096\u0002µ2Õòô½\u001342=Rçq£\u0090]¯\u0001ÏÓî\u0087\rO,\u0002Kzkó\u008a¥©fÈ,èä\u0007¶&\u001fE\u0001eÝ\u0084\u0087£VÂ\ná=\u0001¼ µ\u007fo\u009em¾µÝÛüZ\u001b\u0018;ÓZ\u0086yV\u0098\u0016·x×üö¤\u0015)4}T³sÚ\u0092Y±\u0019ÑÌð\u0087\u000fU.\u0017M\u007fmý\u008c§«(Êrê¾\tÙ(XG\u001egÍ\u0086\u0084¥TÄh\bï×ò¶\u00ady/¦(Çhäê\u0005ð%=BjcÆ\u0080Á \u0001ÁYî\u009e\u000f\u009f,çL.m`\u008a¸«åË0è\u007f\t\u00956\u008cV\u0007wC\u0094\u009eµÚÒàò0\u0013/0§Qùq1\u009en¿\u008cÜÉüJ\u001dU:\u0099[\u0099x·\u0098s¹(æ±\u0007û'8DMe\u0095\u0082Ý¢KÃVà\u0092\u0001È.§N\u001foZ\u008c\u0091\u00adÐÍxêJ\u000b\u0090(\u008fHEi\u0000\u0096Þ·ßÔéô*\u0015c2£Sïsy\u0090@±\u008cÞÚþU\u001fa<±]\u0083zÑ\u009a\u0002»%óÿ,éM«nf\u008f3¯ýÈ¿éK\u000b\rÔ\u0019µS\u0096\u0090wÁW\u0007y9¦5Çkä¬\u0005ö%0BvÔf\u000bqj$I»¨\u008a\u0088cï3ÎÌ-\u0091\rSy3¦/Ç\u007fä¹\u0005ò%sBTc\u0093\u0080Ï \rÁ\u001aî¶\u000fÐ,êL*mk\u008a²\u0099SFJ'\u000b\u0004Äå\u0090y<¦/Çlä¾\u0005¸%\u000fBqc\u0083\u0080Æ \u0018ÔF\u000b[j\u0003Iß¨\u0088\u0088Uï\tÎî-ª\rfl(Câ¢ã\u0081´á\\À\u001c'Óy\u0013¦/Çzäê\u0005ú%)Bzc\u008e\u0080\u0083 \u0007ÁSîÒ\u000fÓ,åL/mj\u008aë«åË3ès\t\u00936ß\u0017wÈK©\u001e\u008a\u008ek\u009eKM,\u001e\rêîçÎc¯7\u0080¶a¯B\u008f\"Q\u0003\u000bäÃÅÔ¥U\u0086\u001fgíX¬y/¦/Çyä«\u0005û%|Buc\u0087\u0080Í \fÁ\u0015î\u0084\u000fÞ,èL4mk\u008aë«óË<èt\tÇ6ÂV\u0006wB\u0094ÓµÚÒàòb\u0013?ú7%\u000bD^gÎ\u0086Þ¦\rÁ^àª\u0003§##Bwmö\u008cú¯ÇÏ\u0017îC\t\u008c(ÁH\u0015kJ\u008a¶µúÕ(ô2\u0017»6ýQÏq\u0002\u0090\u000b³\u0085ÒÛò\u0013\u001dK<·A\u0088\u009e´ÿáÜq=a\u001d²zá[\u0015¸\u0018\u0098\u009cùÈÖI7E\u0014xt¨Uü²3\u0093~óªÐõ1\t\u000eEn\u0097O\u008d¬\u0004\u008dBêpÊ½y:¦'Ç\u007fä£\u0005ô%)Buc\u0092\u0080Ö \u001aÁPîÒ\u000fÓ,åL/mj\u008aë«æË<èv\t\u00926ÉVIwU\u0094\u0092µÖÒ¥ò,\u0013`0 Q±q<\u009e~¿ÀÜ\u009d`ö¿ºÞ~ý3\u001a\b<J[\u0081|y\u0099-¹\u0095Ø¢÷\u008c\u007f\\ \u0013Ásäê\u0003>#\u0014B9e*\u0086á¦¤ÇsîÒ\t~*VLak§\u008c\u0019«°ÍzîI\u000f\u00996\u008cP/qä\u0094Ó³\u008aÔÀô\u008e\u0015I0ôW8w\u008c\u009e;¹IÚéüJ\u001b\u0006<¾]\u0091~T\u0098c¿¡àò\u0007²!xBbcÎ\u0084\u009f¤LÅ\u001càÝ\u0007\u008f(KHao)\u008a\u007f«_Ë\u007fê\u0005\r#.}N ¼\u0094c¶\u0002í!+À\u0082æ»\u0087\u009b¦àEUe\u0087\u0004Õ+sÊ´ïc\u0089©¨øO hw\u000e3-ûÌòõK\u0093\u0001²×Qæv_\u0017ë7ÁÐèõ\"\u0094\u0014´±[\u000e|\u0007\u0019Ã9\u007fÞÐÿ\u007f\u009eX½\u0093[¤|\u008a#TÂ\u007fâ¶\u0081Ë¦\u0006GÀg\u008a\u0006%#\u001aÄÒëf\u008bY¬îIÝh\u001c\bÙ/\u009bÈ\u0005í[\u008daªÖS\u0011rí\u0011\u00957ªÐ\u0001÷X\u0096\u001d¶çSÁt\u008d\u001bH;\u0095Ú³ù\u0012\u0098-¿a_¡xì\u001d¾<kÜQ\u0083Z\u0094\u0089KÆ*¦\u000f?èëÈÁ©ì\u008eÿm4Mq,¦\u0005\u0007â«Á\u0083§´\u0080rgÌ@e&¯\u0005\u009cäLÝY»ú\u009a1\u007f\u0006X_?a\u001f®þ\u0016Û!¼v\u009cÎs\u0002Rs7X\u0011\u0016ð0Ñ\t¶]\u0095\u0011u¾T\u000f\r êîÊ\u00ad¯Ñ\u0088\u0013o=O\u0091.Ô\r\u000fìCÅr£¬\u0082\u0010a.Ff $\u0007<æ\u0010ÃZ¥`\u00846{ÿè!7\u0003VXu\u009e\u00947²\u000eÓ.òU\u0011à12P`\u007fÆ\u009e\u0001»ÖÝ\u001cüM\u001b\u0095<ÂZ\u0086yN\u0098G¡þÇ´æb\u0005S\"êCÅc\u0001\u0082D¡jÆÃà\u001d\u000f+.ºM\rk8\u008cì«\\Ìëé°\t\u0017(¨q\u0087\u0096¥¶kÕ|ô½\u0013ô59Rëq©\u0090\u001a¹Õß\u0091þ]\u001dv:Á\\æ{\u001f\u009aÖ¹¤ß&øp\u0007^ éEÚe®\u0084ª¥\u0085Â\"âc\u0001\u0012 èIúo®\u008eg\u00adªÌðëÙ\u000b\u0012*^I\u008anÏ\u0088\u0081×döR\u0015a\u007f\\ \u0013Ásäê\u0003>#\u0014B9e*\u0086á¦¤ÇsîÒ\t~*VLak§\u008c\u0019«°ÍzîI\u000f\u00996\u008cP/qä\u0094Ó³\u008aÔÀô\u008e\u0015I0ôW8w\u008c\u009e;¹ÒÚ\u009cúS\u001bû:Ü]\u0088~Ä\u009ek¿Úæõ\u0001;!xD\u0004cÆ\u0084è¤DÅ\u0001æÚ\u0007\u0096.§HyiÅ\u008aû\u00ad³Ëñìé\rÅ(\u008fNµoã\u0090*y:¦'Ç\u007fä£\u0005ô%)Buc\u0092\u0080Ö \u001aÁTî\u009e\u000f\u009f,ÈL m`\u008a¯«°Ë>è{\t\u00896ÂV\u0006wB\u0094ÓµÚÒàòb\u0013h0¦Qôq?\u009eo¿\u0085ÜßüJ\u001dC:\u0094[Øxè\u0098c¹\\æº\u0007æ'>DHeÁ\u0082â¢\nÃ^à\u0099y3¦%Çlä¾\u0005ò%.y,¦!Ç~ä¢\u0005þ%2B~cÆ\u0080î \tÁVî\u009a\u000fÖ,êL$m!\u008a\u008f«âË$è\u007f\t\u0095v'©>Èoë¢\né*5M*l\u009a\u008fÙ¯\u0000Î\u0002á\u008c\u0000È#úC9ba\u0085¢¤âÄ%ç(y:¦)Ç\u007fäê\u0005Ô%3Bvc\u008a\u0080Æ \u001ay:¦)Ç\u007fäê\u0005Ô%3Bwc\u0082\u0080Ê \u001cÁ\\î\u009d\u000fÑ,áL3y=¦!Çcäâ\u0005Ô%9Bpc\u008a\u0080Ê \u0006ÁRîÞ\u000f\u009f,ÐL ml\u008a§«õËqè:\t·6ÉV\rwS\u0094\u0080µÌÒäò.\u0013#0±Qéq6\u009ez¿\u0095ÜÞü\u001e\u001d\u001ey8¦/Çbä¡\u0005þ%2B~cÆ\u0080ñ \tÁ[î\u0095\u000fÚy8¦/Çbä¡\u0005þ%2B~cÆ\u0080ð \u001cÁZî\u0084\u000fÚy/¦nÇ[ääy-¦\u0003Ç_äæ\u0005Á%\u001fBIcÊ\u0080ñ \rÁVî\u0097\u000fÖ,òL$m|\u008aç«ÔË8èy\t\u00886ÈV\fwD\u0094ßµüÒóò\u0006\u0013/0\u0084Qýq?\u009eb¿\u0085Üßx:§6Æxå«\u0004í$(Cob\u0087\u0081Ñ¡\u000fÀIï\u0093y=¦2Çhä¯\u0005í%9Bky<¦%Çcä¯\u0005å%=Bmc\u0089\u0080Ñ GÁ`î¢\u000fì,«L\u0012ma\u008a§«ñË/è:\t·6ÍV\u0007wS\u0094\u009fC0\u009c=ýbÞ»?á\u001f#x.YµºÕ\u009a\u0019ûYÔ\u009e5Î\u0016òv>W6°\u009e\u0091éñ&Òj3\u0096\fÚl\u0014y+¦%Ç\u007fä¹\u0005ø%2Bxc\u008a\u0080\u0083 +ÁZî\u009f\u000fÏ,ñL5mk\u008a¹«¿Ë}èV\t\u00866ÜV\u001dwY\u0094\u0083>\u0012á\u000b\u0080]£\u0081BÁbX\u0005~$»Çäç \u0086t©ùH»kó\u000b\u0006*EÍ\u0080ìÀ\u008c\u001c¯L~·¡ªÀôã1\u0002{\"«Eógó¸êÙ´ú.\u001b\n;ò\\º}D\u009e\u000b¾Ïß\u009by6¦/Çoä£\u0005û%9@2\u009f.þyÝ¯<å\u001c2{|Z\u0092¹\u0083\u0099+øZ×\u009c6Ñ\u0015áu\"Tz³¢\u0092ÿò3\u0002µÝ¬¼ì\u009f ~x^º9º\u0018,ûNÛ\u009fºÓ\u0095\u0003tRWb7¶\u0016\u00adñ\u000bÐ|°°\u0093÷r\u0001ML-\u009e\fÜï\u001fÎU1¼î\u008b\u008fÊª\nM\\m}\fÙ+*Èdè¢n4±\u0095Ð9óð\u0012Á2ìRu\u008d2ì\u001dÏÌ.\u008a\bKi\u0087H\u001d\u00ad´\u008bpêÎÅ\u008d$¯\u0007\u0082gºF\u0083\u007fB \u0005Á*âû\u0003½%|D°e*\u0080\u0083¦îÇ\u008bèØ\u0093\u0084LS-j\u000eN\u007f\\ \u008cÁKâå\u0003)#\u001a\u007f\u0002 gÁ+â\u008e\u0003îy;¦YÇuä8Ö\u0013\t,h\tKF¬÷\u008aµí~Ê\u0086/J\u000fnnÜA\u0086 ¹å»:ã[Q~\u0085\u0099Q¹\u0014ØVÿ \u001c\u008a<®]nrÛ\u001bDÄ÷¥0\u00869aÌGc E\u0001»â\u009e\u007f> gÁIäê\u0003Ò#\u0014DÕeÒ\u0086o\u007fS þÁÁâ\u008c\u0003¤\u007fÔ gÁ+â\u0018\u0005¸#tDÕe¢\u007fS þÁÁâ[\u0005¸#tD°e×\u0086o\u007f\\ \bÁKâ³\u007fÔ þÁEâ[\u0003°%sD¶eÉ\u0086\u001d¦OÁ\u001aèÜ\t9*µ¤T{l\u001a)9\u001bÞªøs\u009fA¾7]øy[\u007fJ \u0002Á%â\u000bÚx\u0005Nd¶G9\u007f> tÁÁâ\u008cWv\u0088.é\u009dÊY\u007f\\ fÁÁâû\u0005·#õDQe¢\u0086\u0092êO5uTÒwè\u0096-¶\tÑ\u0082ð9\u0013ö3OR`}Ó}7¢4Ã\u0096àF\u0001\u0082\u007fÒ \bÁ¤â\u008c\u00038%|D(e*\u0086å¦D\u0086ãY\u00168W\u001b\u0015ú®-¥ò+\u0095\u008a°%Qü®\u0019q7\u0010k\u007f: qÁÁâæuÂª\u0089Ë9è\u0000\t^\u007fW \u0006Á<â\u0006\u0003î#m\u007fH \u0004Á*âì\u0003[%|D\\eÒ\u0086o¦.\u007fÒ \u0005Ásâ\u0006\u0003ß#%D(\u007f> \bÁtâû\u0005·#oD>eÀ\u0086o¦ÁÇq,Yó*\u0092\u009a±8Pµp6\u007fÏ zÁ!®<q\n\u0010'3ïÒ³ò\u001aoÜ°\u0086Ñôò{\u0013Q3\u0010TàÀw\u001fA~l]¤¼ø\u009cQýpÚ\u00889¬\u0019XxMWý¶:\u0095´ÞÂ\u0001è`*Eü¢(\u0082\u0086ã/ÄÃ'\u0092\u0007Pf\tbô½ÞÜ\u001cÿÍ\u001eñ>®_\u0019xo\u009bO½hÚPõ\u0096\u001467hWKp\u000e\u0091B°|Ö]ó\u0010\u0012\u0082-«M\fj6\u008fU®TÉ\u0097é*\b\u0095-ÔJ\u0018j²\u0083\u001b¤\u0085ÇÅçf\u0006_!ó@6cj\u0085C¢ný4\u001c~<ÅY$~\u0084\u0099B¹ñÞ0û\u0098\u001aÜ5\u008dUBt\u0001\u0091Ö¶õÖ¹ñÉ\u0010x5¯Sýr \u008bþ¬¨Ï\tïG\u000eø)#N\u009chQ\u008b7ªäÅ®å\u0087\u00022'\u009aF%a\u0090\u0081F \fÃ¶âq\u0004Z]2|\u0000\u009f¤¹vÞ\u0095ù\u0014\u0018×;ê[Õ|\u0014\u0095X´\u0099Ò[÷'\u0016\u008b1 Qyp;\u0093ñ´ÆÍ\níY\fù/HH\u009fy:¦3Ç~ä¯\u0005ã%/B9c\u0094\u0080Æ \u0004ÁTî\u0086\u000fÚ,àLamg\u008a¥«öË2èh\t\u008a6ÍV\u001dw_\u0094\u009cµÖÒ¥ò+\u0013|0ôQøq0\u009em¿\u0081ÜÁü\u0003\u001dS:Ò[\u0099xÖ\u0098/¹mæ´\u0007á':D\u0004e\u0082\u0082Æ¢\u000eÃSà\u0096\u0001\u0094y4¦#Çnä¿\u0005ç%=Bwc\u0085\u0080Ú HÁFî\u0086\u000fÞ,ðL4m}y\u0013¦/Çzäê\u0005ú%)Bzc\u008e\u0080\u0083 \u0007ÁSîÒ\u000fÓ,åL/mjè+77Vuuô\u0094Â´/Ófò\u009c\u0011Ü1\u0019P\u000f\u007fÄ\u009eý½óÝ5üt\u001b¸:ªZky\\\u0098\u0094§ÞÇ\u001aæS\u0005\u0091$ÏCÿcx\u0082|¡ºÀïà)\u000fx.\u0085MÏ\u0012âÍ£¬\u0096ë\u00994\u0080UÆv\n\u0097@·\u0098ÐÈñ,\u0012t2âSÅ|\u0007\u009dI¾\u001eÞ·ÿÄ\u0018\u00029TY\u008az\u009f\u009b\u0012¤hÄ¢åö\u0006:y2¦.Çyä¯\u0005å%2B|c\u0092u6ª/Ëoè£\tû)9N9o¯\u008cÍ¬\u001cÍPâ\u0080\u0003Ñ á@5\tSÖy·»\u0094juVU\t4¾\u0013ÈðèÖÏ±÷\u009e1\u007f\u0091\\Ï<ì\u001b©úåÛÛ½ú\u0098·y%F\f&«\u0001\u0091äòÅó¢0\u0082\u008dc2Fs!¿\u0001\u0015è¼Ï\"¬b\u008cÁmøJT+\u0091\bÍîäÉÉ\u0096\u0093wÙWb2\u0083\u0015#òåÒVµ\u0097\u0090?q{^*>å\u001f¦úqÝR½\u001e\u009an{ß^\b8Z\u0019\u0087àYÇ\u000f¤®\u0084àe_B\u0084%;\u0003öà\u0090ÁC®\t\u008e i\u0095L=-\u0082\n7êáË«¨\u0011\u0089Öoý6\u008f\u0017Zô\u001dÔÛ³\u0094\u0092Xs\u0004P/0æ\u0011´þ~Ù9¿u\u009c\u0096}¦Z\u0097y+¦,Çhä«\u0005ä%9B9c²\u0080Â \u0003ÁPîÒ\u000f÷,ëL4m}\u008a®«øË2èv\t\u00836\u008cV9w_\u0094\u0090µÌÒðò0\u0013jMÃ\u0092vóµÐs1Äÿ\u0095 BA{bÅ\u0083j¥;Ä÷åm\u0000Ä&\u0005GKh\u009a\u0089ßªìÌ&ë\f\fÊ-ýM4nu\u0089\u0080°BÐ\u001fñ½\u0012\u000e3+y\u000b¦2Çhä¹\u0005ò%2Bmc¹\u0080Ì \u000bÁVî\u0087\u000fÏ,åL/mm\u008a²«ÏË.èn\t\u00866ØV\u001cwEy\f¦!Çaä¦\u0005È%1Bxc\u0092\u0080Æ \u001aÁ\\î\u0093\u000fÓ,ÛL4m}\u008a®«ôÚf\u0005@d\rGÃ¦§\u0086^á\u0017Àý#©\u0003ub3Mü¬¼\u008f´ï[Î\u0012)Á\b\u009bÝ.\u0002\u0019cT@\u0097¡È\u0081\u0004æHÇ\u008f$ó\u0004+efJ¨«Ö\u0088Çè\u0004É].\u0099C%\u009c\u0005ýNÞ\u008c?Ø\u001f\u0002xlY¹ºú\u009a'û{y\b¦/Çxä¸\u0005ô%9BFc\u0089\u0080Å 7ÁQî\u0080\u000fÖ,êL*mg\u008a¥«÷Ë\u0002èm\t\u00866ØV\fwD-¸ò\u008a\u0093Õ°>QYq\u009b\u0016×7.Ô|ô±\u0095÷º:[}x[\u0018\u00939úÞ\u0003ÿT\u009f\u0098¼ß])bd\u0002¶#ôÀ7á}&úùÈ\u0098\u0097»|Z\u0019zÔ\u001d\u0083<Pß)ÿî\u009e²±uP3s\u000e\u0013Ü2\u008eÕMô\u0017oh°ZÑ\u0005òî\u0013\u009c3OT\ruó\u0096½¶L×-øæ\u0019ª:\u0091Z_{\u0016\u009cÄ½\u0082ÝIþ\u000f8\u0010ç0\u0086z¥ DÖd-\u0003a\"§ÁÑá\u0017\u0080E¯\u0088}\u009e¢\u009fÃõà\u000f\u0001V!\u0095FÔg(\u0084c¤¡ÅÊê=\u000ba(MH\u0088iÌy\u001a¦3Ç~ä¯\u0005ã%\u0003Bmc\u008f\u0080Î \r".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2309);
        e$s2$37132 = cArr;
        d$s3$37132 = 5508185621029955136L;
    }

    private int convertToMarla(int i, Spinner spinner) {
        int i2 = 2 % 2;
        if (spinner.getSelectedItem().toString().contains(getResources().getString(R.string.marla))) {
            return i;
        }
        int i3 = h + 65;
        e = i3 % 128;
        if (i3 % 2 != 0) {
            spinner.getSelectedItem().toString().contains(getResources().getString(R.string.canal));
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (spinner.getSelectedItem().toString().contains(getResources().getString(R.string.canal))) {
            return i * 20;
        }
        if (spinner.getSelectedItem().toString().contains(getResources().getString(R.string.jareeb))) {
            int i4 = e + 41;
            h = i4 % 128;
            int i5 = i4 % 2;
            return i * 80;
        }
        if (spinner.getSelectedItem().toString().contains(getResources().getString(R.string.acre))) {
            return i * 160;
        }
        if (spinner.getSelectedItem().toString().contains(getResources().getString(R.string.muraba))) {
            return i * 4000;
        }
        return 0;
    }

    public static /* synthetic */ void d(FragmentHouseholdInfo fragmentHouseholdInfo, RadioGroup radioGroup, int i) {
        int i2 = 2 % 2;
        int i3 = h + 43;
        e = i3 % 128;
        int i4 = i3 % 2;
        fragmentHouseholdInfo.lambda$generateBody$0(radioGroup, i);
        if (i4 != 0) {
            int i5 = 52 / 0;
        }
    }

    public static /* synthetic */ void e(FragmentHouseholdInfo fragmentHouseholdInfo, RadioGroup radioGroup, int i) {
        int i2 = 2 % 2;
        int i3 = h + 51;
        e = i3 % 128;
        int i4 = i3 % 2;
        fragmentHouseholdInfo.lambda$generateBody$1(radioGroup, i);
        if (i4 != 0) {
            throw null;
        }
        int i5 = h + 43;
        e = i5 % 128;
        int i6 = i5 % 2;
    }

    private /* synthetic */ void lambda$generateBody$0(RadioGroup radioGroup, int i) {
        int i2 = 2 % 2;
        int i3 = e + 93;
        h = i3 % 128;
        if (i3 % 2 != 0 ? radioGroup.getCheckedRadioButtonId() == radioGroup.getChildAt(0).getId() : radioGroup.getCheckedRadioButtonId() == radioGroup.getChildAt(0).getId()) {
            this.totalLandSpinner.setEnabled(true);
            this.agricultureLanSpinner.setEnabled(true);
            this.editTextNumber.setEnabled(true);
            this.sp_unit.setEnabled(true);
            this.et_number_agri.setEnabled(true);
            this.sp_unit_agri.setEnabled(true);
            return;
        }
        if (radioGroup.getCheckedRadioButtonId() == radioGroup.getChildAt(1).getId()) {
            this.editTextNumber.setText(BuildConfig.FLAVOR);
            this.sp_unit.setSelection(0);
            this.editTextNumber.setEnabled(false);
            this.sp_unit.setEnabled(false);
            this.totalLandSpinner.setSelection(0);
            this.totalLandSpinner.setEnabled(false);
            this.et_number_agri.setText(BuildConfig.FLAVOR);
            this.sp_unit_agri.setSelection(0);
            this.et_number_agri.setEnabled(false);
            this.sp_unit_agri.setEnabled(false);
            this.agricultureLanSpinner.setSelection(0);
            this.agricultureLanSpinner.setEnabled(false);
            int i4 = h + 9;
            e = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 4 / 4;
            }
        }
    }

    private /* synthetic */ void lambda$generateBody$1(RadioGroup radioGroup, int i) {
        int i2 = 2 % 2;
        int i3 = h + 55;
        e = i3 % 128;
        if (i3 % 2 == 0 ? radioGroup.getCheckedRadioButtonId() == radioGroup.getChildAt(0).getId() : radioGroup.getCheckedRadioButtonId() == radioGroup.getChildAt(1).getId()) {
            this.editTextbuffalo.requestFocus();
            Activity activity = getActivity();
            Object[] objArr = new Object[1];
            a((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 11, (char) TextUtils.getTrimmedLength(BuildConfig.FLAVOR), ViewConfiguration.getScrollBarFadeDuration() >> 16, objArr);
            ((InputMethodManager) activity.getSystemService(((String) objArr[0]).intern())).showSoftInput(this.editTextbuffalo, 1);
            this.editTextbuffalo.setEnabled(true);
            this.editTextcow.setEnabled(true);
            this.editTextcamel.setEnabled(true);
            this.editTexthorse.setEnabled(true);
            this.editTextgoat.setEnabled(true);
            return;
        }
        if (radioGroup.getCheckedRadioButtonId() == radioGroup.getChildAt(1).getId()) {
            this.editTextbuffalo.setText(BuildConfig.FLAVOR);
            this.editTextcow.setText(BuildConfig.FLAVOR);
            this.editTextcamel.setText(BuildConfig.FLAVOR);
            this.editTexthorse.setText(BuildConfig.FLAVOR);
            this.editTextgoat.setText(BuildConfig.FLAVOR);
            this.editTextbuffalo.setEnabled(false);
            this.editTextcow.setEnabled(false);
            this.editTextcamel.setEnabled(false);
            this.editTexthorse.setEnabled(false);
            this.editTextgoat.setEnabled(false);
        }
        int i4 = e + 47;
        h = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 39 / 0;
        }
    }

    private void updateHouseHoldPercentage(int i) {
        int i2 = 2 % 2;
        int i3 = e;
        int i4 = i3 + 21;
        h = i4 % 128;
        int i5 = i4 % 2;
        this.houseHoldPercentage += (double) i;
        int i6 = i3 + 15;
        h = i6 % 128;
        int i7 = i6 % 2;
    }

    public LayoutAndValueBoolean checkVisible(LinearLayout linearLayout, String str, String str2) {
        int i = 2 % 2;
        LayoutAndValueBoolean layoutAndValueBoolean = new LayoutAndValueBoolean();
        if (linearLayout.getVisibility() == 0) {
            layoutAndValueBoolean.isLayoutVisible = true;
            if (!str.equals(str2)) {
                layoutAndValueBoolean.isValueSame = false;
            } else {
                layoutAndValueBoolean.isValueSame = true;
                updateHouseHoldPercentage(1);
                int i2 = e + 81;
                h = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 5 / 5;
                }
            }
        } else {
            layoutAndValueBoolean.isLayoutVisible = false;
        }
        int i4 = e + 67;
        h = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 29 / 0;
        }
        return layoutAndValueBoolean;
    }

    public int getEditTextValuesIfEmpty(EditText editText) {
        int i = 2 % 2;
        int i2 = h + 77;
        e = i2 % 128;
        if (i2 % 2 != 0) {
            ivas.gov.bisp.enumeration.p091n.j.E(editText, BuildConfig.FLAVOR);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (ivas.gov.bisp.enumeration.p091n.j.E(editText, BuildConfig.FLAVOR)) {
            return 0;
        }
        int i3 = Integer.parseInt(editText.getText().toString().trim());
        int i4 = h + 109;
        e = i4 % 128;
        int i5 = i4 % 2;
        return i3;
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws Throwable {
        int i = 2 % 2;
        int i2 = h + 93;
        e = i2 % 128;
        Object obj = null;
        try {
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (this.parentView == null) {
                this.bispApplication = (BISPApplication) getActivity().getApplication();
                View viewInflate = layoutInflater.inflate(R.layout.fragment_household_asset_info, viewGroup, false);
                this.parentView = viewInflate;
                ButterKnife.c(this, viewInflate);
                this.rb_hs_single = (RadioButton) this.parentView.findViewById(R.id.rb_hs_single);
                this.rb_hs_multi = (RadioButton) this.parentView.findViewById(R.id.rb_hs_multi);
                this.rb_hs_compound = (RadioButton) this.parentView.findViewById(R.id.rb_hs_compound);
                ActivityBeginSurvey activityBeginSurvey = (ActivityBeginSurvey) getActivity();
                this.activityBeginSurvey = activityBeginSurvey;
                activityBeginSurvey.aG.householdStart = z.e();
                generateBody();
                int i3 = e + 67;
                h = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 4 / 3;
                }
            }
            this.cb_hyderral_individual = (CheckBox) this.parentView.findViewById(R.id.cb_hyderral_individual);
            this.cb_hyderral_social = (CheckBox) this.parentView.findViewById(R.id.cb_hyderral_social);
            this.cb_hyderral_solar = (CheckBox) this.parentView.findViewById(R.id.cb_hyderral_solar);
            this.cb_hyderral_wind = (CheckBox) this.parentView.findViewById(R.id.cb_hyderral_wind);
            this.llhyderralCheckbox = (LinearLayout) this.parentView.findViewById(R.id.llhyderralCheckbox);
            this.elec_et = (EditText) this.parentView.findViewById(R.id.elec_et);
            this.btn_scan_gas = (Button) this.parentView.findViewById(R.id.btn_scan_gas);
            this.gas_et = (EditText) this.parentView.findViewById(R.id.gas_et);
            this.elec_et.setText(BuildConfig.FLAVOR);
            this.gas_et.setText(BuildConfig.FLAVOR);
            View view = this.parentView;
            int i5 = h + 85;
            e = i5 % 128;
            if (i5 % 2 == 0) {
                return view;
            }
            throw null;
        } catch (Exception unused) {
        }
    }

    @Override // ivas.gov.bisp.enumeration.X.e
    public void parseJson() {
        int i = 2 % 2;
        int i2 = this.activityBeginSurvey.ac;
        if (i2 != 1) {
            int i3 = e + 11;
            int i4 = i3 % 128;
            h = i4;
            if (i3 % 2 != 0 ? i2 != 2 : i2 != 2) {
                int i5 = i4 + 113;
                e = i5 % 128;
                int i6 = i5 % 2;
                boolean z = ag.d;
                if (i6 != 0) {
                    int i7 = 53 / 0;
                    if (!z) {
                        return;
                    }
                } else if (!z) {
                    return;
                }
            }
        }
        parseEnumObj();
        int i8 = e + 123;
        h = i8 % 128;
        int i9 = i8 % 2;
    }

    public void setSpinnerAdapter(ArrayList<String> arrayList, final Spinner spinner) {
        int i = 2 % 2;
        ArrayAdapter arrayAdapter = new ArrayAdapter(getActivity(), R.layout.spinner_item, arrayList);
        arrayAdapter.setDropDownViewResource(R.layout.spinner_item_dropdown);
        spinner.setAdapter((SpinnerAdapter) arrayAdapter);
        spinner.setSelection(0);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentHouseholdInfo.14
            private static int a = 1;
            private static int b;

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView<?> adapterView) {
                int i2 = 2 % 2;
                int i3 = a;
                int i4 = i3 & 45;
                int i5 = (((i3 ^ 45) | i4) << 1) - ((i3 | 45) & (~i4));
                b = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 38 / 0;
                }
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j) {
                int i3 = 2 % 2;
                int i4 = a + 119;
                b = i4 % 128;
                Object obj = null;
                if (i4 % 2 != 0) {
                    throw null;
                }
                if (i2 == 0) {
                    spinner.setBackgroundResource(R.drawable.spinner_bg);
                    int i5 = b;
                    int i6 = i5 & 107;
                    int i7 = (i5 ^ 107) | i6;
                    int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
                    a = i8 % 128;
                    if (i8 % 2 == 0) {
                        throw null;
                    }
                    return;
                }
                spinner.setBackgroundResource(R.drawable.spinner_bg_selected);
                Spinner spinner2 = spinner;
                int i9 = a + 85;
                b = i9 % 128;
                if (i9 % 2 != 0) {
                    Spinner spinner3 = FragmentHouseholdInfo.this.spinnerNumberOfRooms;
                    obj.hashCode();
                    throw null;
                }
                FragmentHouseholdInfo fragmentHouseholdInfo = FragmentHouseholdInfo.this;
                if (spinner2 != fragmentHouseholdInfo.spinnerNumberOfRooms) {
                    Spinner spinner4 = fragmentHouseholdInfo.sp_unit;
                    if (spinner2 == spinner4) {
                        int i10 = b;
                        int i11 = i10 & 113;
                        int i12 = -(-((i10 ^ 113) | i11));
                        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
                        a = i13 % 128;
                        int i14 = i13 % 2;
                        fragmentHouseholdInfo.loadLandSpinners(spinner4, fragmentHouseholdInfo.totalLandSpinner);
                        int i15 = b;
                        int i16 = (i15 ^ 87) + ((i15 & 87) << 1);
                        a = i16 % 128;
                        if (i16 % 2 == 0) {
                            int i17 = 18 / 0;
                            return;
                        }
                        return;
                    }
                    Spinner spinner5 = fragmentHouseholdInfo.sp_unit_agri;
                    if (spinner2 == spinner5) {
                        int i18 = b;
                        int i19 = (i18 ^ 105) + ((i18 & 105) << 1);
                        a = i19 % 128;
                        if (i19 % 2 == 0) {
                            fragmentHouseholdInfo.loadLandSpinners(spinner5, fragmentHouseholdInfo.agricultureLanSpinner);
                            obj.hashCode();
                            throw null;
                        }
                        fragmentHouseholdInfo.loadLandSpinners(spinner5, fragmentHouseholdInfo.agricultureLanSpinner);
                        int i20 = b + 117;
                        a = i20 % 128;
                        int i21 = i20 % 2;
                        return;
                    }
                    if (spinner2 == fragmentHouseholdInfo.agricultureLanSpinner) {
                        int i22 = b;
                        int i23 = i22 & 43;
                        int i24 = i22 | 43;
                        int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
                        a = i25 % 128;
                        if (i25 % 2 == 0) {
                            spinner2.getSelectedItem().toString().equals("Other");
                            obj.hashCode();
                            throw null;
                        }
                        if (!(!spinner2.getSelectedItem().toString().equals("Other"))) {
                            spinner.setVisibility(8);
                            FragmentHouseholdInfo fragmentHouseholdInfo2 = FragmentHouseholdInfo.this;
                            int i26 = b;
                            int i27 = (((i26 & (-4)) | ((~i26) & 3)) - (~(-(-((i26 & 3) << 1))))) - 1;
                            a = i27 % 128;
                            int i28 = i27 % 2;
                            fragmentHouseholdInfo2.et_number_agri.getText().clear();
                            FragmentHouseholdInfo fragmentHouseholdInfo3 = FragmentHouseholdInfo.this;
                            int i29 = a;
                            int i30 = i29 & 47;
                            int i31 = (i30 - (~(-(-((i29 ^ 47) | i30))))) - 1;
                            b = i31 % 128;
                            if (i31 % 2 != 0) {
                                fragmentHouseholdInfo3.et_number_agri.setVisibility(1);
                            } else {
                                fragmentHouseholdInfo3.et_number_agri.setVisibility(0);
                            }
                            int i32 = b + 81;
                            a = i32 % 128;
                            int i33 = i32 % 2;
                            return;
                        }
                        spinner.setVisibility(0);
                        Spinner spinner6 = spinner;
                        int i34 = b;
                        int i35 = i34 & 67;
                        int i36 = ((i34 | 67) & (~i35)) + (i35 << 1);
                        a = i36 % 128;
                        if (i36 % 2 == 0) {
                            spinner6.setEnabled(true);
                        } else {
                            spinner6.setEnabled(true);
                        }
                        Editable text = FragmentHouseholdInfo.this.et_number_agri.getText();
                        int i37 = a;
                        int i38 = i37 & 81;
                        int i39 = -(-((i37 ^ 81) | i38));
                        int i40 = (i38 & i39) + (i39 | i38);
                        b = i40 % 128;
                        int i41 = i40 % 2;
                        text.clear();
                        EditText editText = FragmentHouseholdInfo.this.et_number_agri;
                        int i42 = a + 73;
                        b = i42 % 128;
                        int i43 = i42 % 2;
                        editText.setVisibility(8);
                        int i44 = a + 27;
                        b = i44 % 128;
                        if (i44 % 2 != 0) {
                            int i45 = 88 / 0;
                            return;
                        }
                        return;
                    }
                    if (spinner2 == fragmentHouseholdInfo.totalLandSpinner) {
                        int i46 = b;
                        int i47 = (-2) - (((i46 ^ 102) + ((i46 & 102) << 1)) ^ (-1));
                        a = i47 % 128;
                        int i48 = i47 % 2;
                        if (!(!spinner2.getSelectedItem().toString().equals("Other"))) {
                            int i49 = b;
                            int i50 = i49 & 19;
                            int i51 = ((i49 ^ 19) | i50) << 1;
                            int i52 = -((i49 | 19) & (~i50));
                            int i53 = (i51 ^ i52) + ((i52 & i51) << 1);
                            a = i53 % 128;
                            int i54 = i53 % 2;
                            spinner.setVisibility(8);
                            EditText editText2 = FragmentHouseholdInfo.this.editTextNumber;
                            int i55 = b;
                            int i56 = ((i55 | 32) << 1) - (i55 ^ 32);
                            int i57 = (i56 ^ (-1)) + (i56 << 1);
                            a = i57 % 128;
                            int i58 = i57 % 2;
                            editText2.getText().clear();
                            EditText editText3 = FragmentHouseholdInfo.this.editTextNumber;
                            int i59 = b + 31;
                            a = i59 % 128;
                            int i60 = i59 % 2;
                            editText3.setVisibility(0);
                            int i61 = a + 1;
                            b = i61 % 128;
                            int i62 = i61 % 2;
                            return;
                        }
                        spinner.setVisibility(0);
                        Spinner spinner7 = spinner;
                        int i63 = a;
                        int i64 = i63 & 3;
                        int i65 = (i64 - (~(-(-((i63 ^ 3) | i64))))) - 1;
                        b = i65 % 128;
                        if (i65 % 2 != 0) {
                            spinner7.setEnabled(false);
                        } else {
                            spinner7.setEnabled(true);
                        }
                        FragmentHouseholdInfo.this.editTextNumber.getText().clear();
                        FragmentHouseholdInfo fragmentHouseholdInfo4 = FragmentHouseholdInfo.this;
                        int i66 = b;
                        int i67 = (-2) - (((i66 ^ FragmentHouseholdInfo.GAS_SCANNER) + ((i66 & FragmentHouseholdInfo.GAS_SCANNER) << 1)) ^ (-1));
                        a = i67 % 128;
                        if (i67 % 2 == 0) {
                            fragmentHouseholdInfo4.editTextNumber.setVisibility(66);
                        } else {
                            fragmentHouseholdInfo4.editTextNumber.setVisibility(8);
                        }
                    }
                } else if (ivas.gov.bisp.enumeration.p091n.j.h(spinner2) > 3) {
                    int i68 = a;
                    int i69 = i68 ^ 81;
                    int i70 = (i68 & 81) << 1;
                    int i71 = (i69 & i70) + (i70 | i69);
                    b = i71 % 128;
                    int i72 = i71 % 2;
                    FragmentHouseholdInfo fragmentHouseholdInfo5 = FragmentHouseholdInfo.this;
                    Spinner spinner8 = fragmentHouseholdInfo5.spinnerNumberOfRooms;
                    int i73 = a;
                    int i74 = ((i73 ^ 103) | (i73 & 103)) << 1;
                    int i75 = -(((~i73) & 103) | (i73 & (-104)));
                    int i76 = ((i74 | i75) << 1) - (i75 ^ i74);
                    b = i76 % 128;
                    if (i76 % 2 == 0) {
                        FragmentHouseholdInfo.access$100(fragmentHouseholdInfo5, "کمروں کی تعداد", "آپ کو یقین ہے کے آپ نے کمروں کی تعداد صیحح منتخب کی ہے۔", spinner8, false, null);
                        return;
                    } else {
                        FragmentHouseholdInfo.access$100(fragmentHouseholdInfo5, "کمروں کی تعداد", "آپ کو یقین ہے کے آپ نے کمروں کی تعداد صیحح منتخب کی ہے۔", spinner8, false, null);
                        int i77 = 9 / 0;
                        return;
                    }
                }
                int i78 = b;
                int i79 = ((i78 | 39) << 1) - (i78 ^ 39);
                a = i79 % 128;
                if (i79 % 2 == 0) {
                    throw null;
                }
            }
        });
        int i2 = e + 1;
        h = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = e + 63;
        h = i2 % 128;
        int i3 = i2 % 2;
        super.onDestroy();
        CountDownTimer countDownTimer = this.countDownTimer;
        Object obj = null;
        if (countDownTimer != null) {
            int i4 = e + 15;
            h = i4 % 128;
            int i5 = i4 % 2;
            countDownTimer.cancel();
            if (i5 == 0) {
                throw null;
            }
        }
        int i6 = h + 19;
        e = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.app.Fragment
    public void onResume() {
        int i = 2 % 2;
        int i2 = h + 49;
        e = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        if (!this.isTimerStart) {
            int i4 = h + 77;
            e = i4 % 128;
            int i5 = i4 % 2;
            SharedPreferences sharedPreferences = ah.c.d;
            Object[] objArr = new Object[1];
            a(16 - TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0), (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1196), 2283 - (ViewConfiguration.getTouchSlop() >> 8), objArr);
            if (sharedPreferences.getInt(((String) objArr[0]).intern(), 1) == 1) {
                SharedPreferences sharedPreferences2 = ah.c.d;
                Object[] objArr2 = new Object[1];
                a(AndroidCharacter.getMirror('0') - '&', (char) KeyEvent.keyCodeFromString(BuildConfig.FLAVOR), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2299, objArr2);
                this.countDownTimer = new CountDownTimer(sharedPreferences2.getInt(((String) objArr2[0]).intern(), 0) * 1000, 1000L) { // from class: ivas.gov.bisp.enumeration.fragments.FragmentHouseholdInfo.1
                    private static int a = 0;
                    private static int b = 1;

                    @Override // android.os.CountDownTimer
                    public void onFinish() {
                        int i6 = 2 % 2;
                        int i7 = a;
                        int i8 = i7 & 89;
                        int i9 = (i7 | 89) & (~i8);
                        int i10 = i8 << 1;
                        int i11 = (i9 ^ i10) + ((i9 & i10) << 1);
                        b = i11 % 128;
                        int i12 = i11 % 2;
                        try {
                            FragmentHouseholdInfo.this.textViewTimeRemaining.setVisibility(8);
                            int i13 = a + 47;
                            b = i13 % 128;
                            if (i13 % 2 == 0) {
                                Button button = FragmentHouseholdInfo.access$000(FragmentHouseholdInfo.this).buttonNext;
                                throw null;
                            }
                            Button button2 = FragmentHouseholdInfo.access$000(FragmentHouseholdInfo.this).buttonNext;
                            int i14 = a;
                            int i15 = ((i14 ^ 19) | (i14 & 19)) << 1;
                            int i16 = -(((~i14) & 19) | (i14 & (-20)));
                            int i17 = (i15 & i16) + (i16 | i15);
                            b = i17 % 128;
                            if (i17 % 2 == 0) {
                                button2.setEnabled(true);
                            } else {
                                button2.setEnabled(true);
                            }
                            FragmentHouseholdInfo.access$000(FragmentHouseholdInfo.this).buttonPrevious.setEnabled(true);
                            int i18 = b;
                            int i19 = ((i18 & 34) + (i18 | 34)) - 1;
                            a = i19 % 128;
                            int i20 = i19 % 2;
                        } catch (Exception unused) {
                        }
                    }

                    @Override // android.os.CountDownTimer
                    public void onTick(long j) {
                        String string;
                        int i6 = 2 % 2;
                        try {
                            TextView textView = FragmentHouseholdInfo.this.textViewTimeRemaining;
                            StringBuilder sb = new StringBuilder();
                            int i7 = b;
                            int i8 = (i7 ^ 91) + ((i7 & 91) << 1);
                            a = i8 % 128;
                            int i9 = i8 % 2;
                            sb.append("Time Remaining : ");
                            int i10 = a;
                            int i11 = ((i10 & 12) + (i10 | 12)) - 1;
                            b = i11 % 128;
                            if (i11 % 2 == 0) {
                                sb.append((int) (j ^ 1000));
                                string = sb.toString();
                            } else {
                                sb.append((int) (j / 1000));
                                string = sb.toString();
                            }
                            int i12 = b;
                            int i13 = (i12 & 113) + (i12 | 113);
                            a = i13 % 128;
                            if (i13 % 2 != 0) {
                                textView.setText(string);
                                FragmentHouseholdInfo.access$000(FragmentHouseholdInfo.this);
                                throw null;
                            }
                            textView.setText(string);
                            FragmentHouseholdInfo.access$000(FragmentHouseholdInfo.this).buttonNext.setEnabled(false);
                            FragmentHouseholdInfo fragmentHouseholdInfo = FragmentHouseholdInfo.this;
                            int i14 = b;
                            int i15 = i14 & 99;
                            int i16 = ((i14 ^ 99) | i15) << 1;
                            int i17 = -((i14 | 99) & (~i15));
                            int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
                            a = i18 % 128;
                            if (i18 % 2 != 0) {
                                FragmentHouseholdInfo.access$000(fragmentHouseholdInfo).buttonPrevious.setEnabled(true);
                            } else {
                                FragmentHouseholdInfo.access$000(fragmentHouseholdInfo).buttonPrevious.setEnabled(false);
                            }
                            int i19 = b;
                            int i20 = i19 & 93;
                            int i21 = i19 | 93;
                            int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
                            a = i22 % 128;
                            if (i22 % 2 != 0) {
                                FragmentHouseholdInfo.this.isTimerStart = false;
                            } else {
                                FragmentHouseholdInfo.this.isTimerStart = true;
                            }
                            int i23 = b;
                            int i24 = i23 & 21;
                            int i25 = ((i23 ^ 21) | i24) << 1;
                            int i26 = -((i23 | 21) & (~i24));
                            int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
                            a = i27 % 128;
                            if (i27 % 2 != 0) {
                                throw null;
                            }
                        } catch (Exception unused) {
                        }
                    }
                }.start();
                int i6 = e + 11;
                h = i6 % 128;
                int i7 = i6 % 2;
                return;
            }
        }
        this.textViewTimeRemaining.setVisibility(8);
        this.activityBeginSurvey.buttonNext.setEnabled(true);
        this.activityBeginSurvey.buttonPrevious.setEnabled(true);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0073  */
    public void setVisibility() throws Throwable {
        int i = 2 % 2;
        int childCount = this.ll_main.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            int i3 = h + 75;
            e = i3 % 128;
            int i4 = i3 % 2;
            this.ll_main.getChildAt(i2).setVisibility(8);
        }
        try {
            byte b = f[12];
            byte b2 = b;
            Object[] objArr = new Object[1];
            b(b, b2, b2, objArr);
            SecureRandom secureRandom = (SecureRandom) Class.forName((String) objArr[0]).getDeclaredConstructor(null).newInstance(null);
            this.listPositionsSelected = new ArrayList();
            int i5 = 0;
            while (i5 < 8) {
                int iNextInt = secureRandom.nextInt(childCount);
                if (this.listPositionsSelected.size() == 0 || !this.listPositionsSelected.contains(Integer.valueOf(iNextInt))) {
                    this.listPositionsSelected.add(Integer.valueOf(iNextInt));
                    if (iNextInt == 12) {
                        i5--;
                    }
                } else {
                    i5--;
                }
                i5++;
            }
            for (int i6 = 0; i6 < this.listPositionsSelected.size(); i6++) {
                if (this.listPositionsSelected.get(i6).intValue() > 12) {
                    if (!this.listPositionsSelected.contains(12)) {
                        this.listPositionsSelected.add(12);
                        this.ll_main.getChildAt(12).setVisibility(0);
                        break;
                    }
                    break;
                }
            }
            int i7 = 0;
            while (i7 < this.listPositionsSelected.size()) {
                int i8 = h + 103;
                e = i8 % 128;
                if (i8 % 2 != 0) {
                    this.ll_main.getChildAt(this.listPositionsSelected.get(i7).intValue()).setVisibility(1);
                    i7 += 99;
                } else {
                    this.ll_main.getChildAt(this.listPositionsSelected.get(i7).intValue()).setVisibility(0);
                    i7++;
                }
                int i9 = e + 57;
                h = i9 % 128;
                if (i9 % 2 == 0) {
                    int i10 = 5 / 3;
                }
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // ivas.gov.bisp.enumeration.X.e
    public boolean isValid() {
        int i = 2 % 2;
        int i2 = this.activityBeginSurvey.ac;
        Object obj = null;
        if (i2 != 1 && i2 != 2 && !ag.d) {
            int i3 = h + 19;
            e = i3 % 128;
            if (i3 % 2 == 0) {
                return isSuperFormValid();
            }
            isSuperFormValid();
            throw null;
        }
        boolean zIsEnumFormValid = isEnumFormValid();
        int i4 = e + 9;
        h = i4 % 128;
        if (i4 % 2 != 0) {
            return zIsEnumFormValid;
        }
        obj.hashCode();
        throw null;
    }

    public void loadSpinners() {
        int i = 2 % 2;
        ArrayList<String> arrayList = new ArrayList<>();
        Object[] objArr = new Object[1];
        a(26 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0) + 32840), 2069 - Color.argb(0, 0, 0, 0), objArr);
        arrayList.add(((String) objArr[0]).intern());
        int i2 = h + 25;
        e = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 0;
        while (i4 <= 10) {
            int i5 = e + 15;
            h = i5 % 128;
            if (i5 % 2 == 0) {
                arrayList.add(String.valueOf(i4));
                i4 += 62;
            } else {
                arrayList.add(String.valueOf(i4));
                i4++;
            }
        }
        setSpinnerAdapter(arrayList, this.spinnerNumberOfRooms);
        Activity activity = getActivity();
        Object[] objArr2 = new Object[1];
        a((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 23, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 2095 - (ViewConfiguration.getScrollBarSize() >> 8), objArr2);
        new au(activity, ((String) objArr2[0]).intern(), getResources().getString(R.string.occupacy_status), this.sp_occupancy_status, new J() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentHouseholdInfo.2
            private static int a = 0;
            private static int b = 1;

            @Override // ivas.gov.bisp.enumeration.W.J
            public void fillList(ArrayList<Item> arrayList2) {
                int i6 = 2 % 2;
                int i7 = b;
                int i8 = (i7 & 77) + (i7 | 77);
                a = i8 % 128;
                int i9 = i8 % 2;
                FragmentHouseholdInfo.this.occupancyStatusList = arrayList2;
                int i10 = b;
                int i11 = ((i10 ^ 25) | (i10 & 25)) << 1;
                int i12 = -(((~i10) & 25) | (i10 & (-26)));
                int i13 = (i11 & i12) + (i12 | i11);
                a = i13 % 128;
                if (i13 % 2 != 0) {
                    throw null;
                }
            }
        }).execute(new Void[0]);
        Activity activity2 = getActivity();
        Object[] objArr3 = new Object[1];
        a(View.MeasureSpec.getSize(0) + 18, (char) TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0), 2119 - Color.green(0), objArr3);
        new au(activity2, ((String) objArr3[0]).intern(), getResources().getString(R.string.wall_material), this.sp_wall_material, new J() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentHouseholdInfo.3
            private static int a = 0;
            private static int b = 1;

            @Override // ivas.gov.bisp.enumeration.W.J
            public void fillList(ArrayList<Item> arrayList2) {
                int i6 = 2 % 2;
                int i7 = b;
                int i8 = (i7 ^ 43) + ((i7 & 43) << 1);
                a = i8 % 128;
                int i9 = i8 % 2;
                FragmentHouseholdInfo.this.wallMaterialList = arrayList2;
                int i10 = a;
                int i11 = i10 & 85;
                int i12 = (i10 ^ 85) | i11;
                int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
                b = i13 % 128;
                if (i13 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }).execute(new Void[0]);
        Activity activity3 = getActivity();
        Object[] objArr4 = new Object[1];
        a(View.combineMeasuredStates(0, 0) + 18, (char) (41840 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2136, objArr4);
        new au(activity3, ((String) objArr4[0]).intern(), getResources().getString(R.string.roof_material), this.sp_roof_material, new J() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentHouseholdInfo.4
            private static int a = 0;
            private static int b = 1;

            @Override // ivas.gov.bisp.enumeration.W.J
            public void fillList(ArrayList<Item> arrayList2) {
                int i6 = 2 % 2;
                int i7 = b;
                int i8 = i7 ^ 103;
                int i9 = ((i7 & 103) | i8) << 1;
                int i10 = -i8;
                int i11 = (i9 & i10) + (i9 | i10);
                a = i11 % 128;
                if (i11 % 2 != 0) {
                    FragmentHouseholdInfo.this.roofMaterialList = arrayList2;
                    int i12 = 57 / 0;
                } else {
                    FragmentHouseholdInfo.this.roofMaterialList = arrayList2;
                }
                int i13 = a;
                int i14 = ((i13 & 114) + (i13 | 114)) - 1;
                b = i14 % 128;
                int i15 = i14 % 2;
            }
        }).execute(new Void[0]);
        Activity activity4 = getActivity();
        Object[] objArr5 = new Object[1];
        a(18 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (Color.alpha(0) + 42038), 2154 - MotionEvent.axisFromString(BuildConfig.FLAVOR), objArr5);
        new au(activity4, ((String) objArr5[0]).intern(), getResources().getString(R.string.cooking_fuel), this.sp_cooking_fuel, new J() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentHouseholdInfo.5
            private static int a = 0;
            private static int b = 1;

            @Override // ivas.gov.bisp.enumeration.W.J
            public void fillList(ArrayList<Item> arrayList2) {
                int i6 = 2 % 2;
                int i7 = b;
                int i8 = i7 & 23;
                int i9 = ((((i7 ^ 23) | i8) << 1) - (~(-((i7 | 23) & (~i8))))) - 1;
                a = i9 % 128;
                int i10 = i9 % 2;
                FragmentHouseholdInfo.this.cookingFuelList = arrayList2;
                if (i10 != 0) {
                    int i11 = 58 / 0;
                }
                int i12 = a + 35;
                b = i12 % 128;
                int i13 = i12 % 2;
            }
        }).execute(new Void[0]);
        Activity activity5 = getActivity();
        Object[] objArr6 = new Object[1];
        a(11 - View.combineMeasuredStates(0, 0), (char) (14889 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0)), 2172 - (ViewConfiguration.getTouchSlop() >> 8), objArr6);
        new au(activity5, ((String) objArr6[0]).intern(), getResources().getString(R.string.toilet_type), this.sp_toilet, new J() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentHouseholdInfo.6
            private static int a = 1;
            private static int b;

            @Override // ivas.gov.bisp.enumeration.W.J
            public void fillList(ArrayList<Item> arrayList2) {
                int i6 = 2 % 2;
                int i7 = a;
                int i8 = i7 & 17;
                int i9 = i8 + ((i7 ^ 17) | i8);
                b = i9 % 128;
                int i10 = i9 % 2;
                FragmentHouseholdInfo.this.toiletList = arrayList2;
                int i11 = b;
                int i12 = i11 & 85;
                int i13 = (((i11 ^ 85) | i12) << 1) - ((i11 | 85) & (~i12));
                a = i13 % 128;
                if (i13 % 2 == 0) {
                    throw null;
                }
            }
        }).execute(new Void[0]);
        Activity activity6 = getActivity();
        Object[] objArr7 = new Object[1];
        a((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 23, (char) View.MeasureSpec.makeMeasureSpec(0, 0), KeyEvent.normalizeMetaState(0) + 2183, objArr7);
        new au(activity6, ((String) objArr7[0]).intern(), getResources().getString(R.string.drinking_water_source), this.sp_drinking_water, new J() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentHouseholdInfo.7
            private static int a = 0;
            private static int b = 1;

            @Override // ivas.gov.bisp.enumeration.W.J
            public void fillList(ArrayList<Item> arrayList2) {
                int i6 = 2 % 2;
                int i7 = b;
                int i8 = i7 & 103;
                int i9 = ((((i7 ^ 103) | i8) << 1) - (~(-((i7 | 103) & (~i8))))) - 1;
                a = i9 % 128;
                int i10 = i9 % 2;
                FragmentHouseholdInfo.this.drinkingWaterList = arrayList2;
                int i11 = b + 72;
                int i12 = (i11 ^ (-1)) + (i11 << 1);
                a = i12 % 128;
                int i13 = i12 % 2;
            }
        }).execute(new Void[0]);
        Activity activity7 = getActivity();
        Object[] objArr8 = new Object[1];
        a(Color.red(0) + 26, (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 21675), ExpandableListView.getPackedPositionGroup(0L) + 2207, objArr8);
        new au(activity7, ((String) objArr8[0]).intern(), getResources().getString(R.string.electricity_connection), this.sp_electricity, new J() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentHouseholdInfo.8
            private static int a = 1;
            private static int b;

            @Override // ivas.gov.bisp.enumeration.W.J
            public void fillList(ArrayList<Item> arrayList2) {
                FragmentHouseholdInfo fragmentHouseholdInfo;
                int i6 = 2 % 2;
                int i7 = a;
                int i8 = (i7 ^ 72) + ((i7 & 72) << 1);
                int i9 = (i8 ^ (-1)) + (i8 << 1);
                b = i9 % 128;
                if (i9 % 2 != 0) {
                    fragmentHouseholdInfo = FragmentHouseholdInfo.this;
                    fragmentHouseholdInfo.electricityList = arrayList2;
                    int i10 = 22 / 0;
                } else {
                    fragmentHouseholdInfo = FragmentHouseholdInfo.this;
                    fragmentHouseholdInfo.electricityList = arrayList2;
                }
                Spinner spinner = fragmentHouseholdInfo.sp_electricity;
                AdapterView.OnItemSelectedListener onItemSelectedListener = new AdapterView.OnItemSelectedListener() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentHouseholdInfo.8.1
                    private static int a = 0;
                    private static int b = 1;

                    @Override // android.widget.AdapterView.OnItemSelectedListener
                    public void onNothingSelected(AdapterView<?> adapterView) {
                        int i11 = 2 % 2;
                        int i12 = b;
                        int i13 = ((i12 | 97) << 1) - (i12 ^ 97);
                        a = i13 % 128;
                        int i14 = i13 % 2;
                    }

                    /* JADX WARN: Code duplicated, block: B:18:0x00c8  */
                    /* JADX WARN: Code duplicated, block: B:20:0x00d9  */
                    /* JADX WARN: Code duplicated, block: B:21:0x00e6  */
                    @Override // android.widget.AdapterView.OnItemSelectedListener
                    public void onItemSelected(AdapterView<?> adapterView, View view, int i11, long j) {
                        LinearLayout linearLayout;
                        LinearLayout linearLayout2;
                        int i12;
                        LinearLayout linearLayout3;
                        int i13 = 2 % 2;
                        int i14 = a;
                        int i15 = i14 ^ 21;
                        int i16 = ((i14 & 21) | i15) << 1;
                        int i17 = -i15;
                        int i18 = (i16 & i17) + (i17 | i16);
                        b = i18 % 128;
                        if (i18 % 2 != 0 ? i11 == 1 : i11 == 1) {
                            linearLayout2 = FragmentHouseholdInfo.this.llElecMeterBill;
                            i12 = a + 35;
                            b = i12 % 128;
                            if (i12 % 2 == 0) {
                                linearLayout2.setVisibility(0);
                                linearLayout3 = FragmentHouseholdInfo.this.llhyderralCheckbox;
                                int i19 = 58 / 0;
                            } else {
                                linearLayout2.setVisibility(0);
                                linearLayout3 = FragmentHouseholdInfo.this.llhyderralCheckbox;
                            }
                            linearLayout3.setVisibility(0);
                            FragmentHouseholdInfo fragmentHouseholdInfo2 = FragmentHouseholdInfo.this;
                            int i20 = a;
                            int i21 = i20 ^ 81;
                            int i22 = (i20 & 81) << 1;
                            int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
                            b = i23 % 128;
                            int i24 = i23 % 2;
                            fragmentHouseholdInfo2.elec_et.setText(BuildConfig.FLAVOR);
                            int i25 = b;
                            int i26 = (i25 & 51) + (i25 | 51);
                            a = i26 % 128;
                            int i27 = i26 % 2;
                        } else if (i11 != 2) {
                            int i28 = i14 + 41;
                            b = i28 % 128;
                            int i29 = i28 % 2;
                            int i30 = 8;
                            FragmentHouseholdInfo.this.llElecMeterBill.setVisibility(8);
                            int i31 = b + 117;
                            a = i31 % 128;
                            if (i31 % 2 != 0) {
                                linearLayout = FragmentHouseholdInfo.this.llhyderralCheckbox;
                                i30 = 66;
                            } else {
                                linearLayout = FragmentHouseholdInfo.this.llhyderralCheckbox;
                            }
                            linearLayout.setVisibility(i30);
                            int i32 = a;
                            int i33 = (i32 ^ 47) + ((i32 & 47) << 1);
                            b = i33 % 128;
                            int i34 = i33 % 2;
                            FragmentHouseholdInfo.this.cb_hyderral_individual.setChecked(false);
                            int i35 = a;
                            int i36 = i35 & 103;
                            int i37 = (((i35 | 103) & (~i36)) - (~(i36 << 1))) - 1;
                            b = i37 % 128;
                            if (i37 % 2 == 0) {
                                FragmentHouseholdInfo.this.cb_hyderral_social.setChecked(true);
                            } else {
                                FragmentHouseholdInfo.this.cb_hyderral_social.setChecked(false);
                            }
                            FragmentHouseholdInfo.this.cb_hyderral_solar.setChecked(false);
                            int i38 = a;
                            int i39 = i38 & 25;
                            int i40 = (((i38 | 25) & (~i39)) - (~(i39 << 1))) - 1;
                            b = i40 % 128;
                            int i41 = i40 % 2;
                            FragmentHouseholdInfo.this.cb_hyderral_wind.setChecked(false);
                            int i42 = b;
                            int i43 = ((i42 ^ 7) | (i42 & 7)) << 1;
                            int i44 = -(((~i42) & 7) | (i42 & (-8)));
                            int i45 = (i43 & i44) + (i44 | i43);
                            a = i45 % 128;
                            int i46 = i45 % 2;
                        } else {
                            linearLayout2 = FragmentHouseholdInfo.this.llElecMeterBill;
                            i12 = a + 35;
                            b = i12 % 128;
                            if (i12 % 2 == 0) {
                                linearLayout2.setVisibility(0);
                                linearLayout3 = FragmentHouseholdInfo.this.llhyderralCheckbox;
                                int i110 = 58 / 0;
                            } else {
                                linearLayout2.setVisibility(0);
                                linearLayout3 = FragmentHouseholdInfo.this.llhyderralCheckbox;
                            }
                            linearLayout3.setVisibility(0);
                            FragmentHouseholdInfo fragmentHouseholdInfo3 = FragmentHouseholdInfo.this;
                            int i210 = a;
                            int i211 = i210 ^ 81;
                            int i212 = (i210 & 81) << 1;
                            int i213 = (i211 ^ i212) + ((i212 & i211) << 1);
                            b = i213 % 128;
                            int i214 = i213 % 2;
                            fragmentHouseholdInfo3.elec_et.setText(BuildConfig.FLAVOR);
                            int i215 = b;
                            int i216 = (i215 & 51) + (i215 | 51);
                            a = i216 % 128;
                            int i217 = i216 % 2;
                        }
                        if (i11 != 0) {
                            FragmentHouseholdInfo.this.sp_electricity.setBackgroundResource(R.drawable.spinner_bg_selected);
                            int i47 = b;
                            int i48 = ((i47 | 67) << 1) - (i47 ^ 67);
                            a = i48 % 128;
                            if (i48 % 2 != 0) {
                                throw null;
                            }
                            return;
                        }
                        int i49 = b;
                        int i50 = ((i49 | 113) << 1) - (i49 ^ 113);
                        a = i50 % 128;
                        int i51 = i50 % 2;
                        Spinner spinner2 = FragmentHouseholdInfo.this.sp_electricity;
                        int i52 = a + 99;
                        b = i52 % 128;
                        int i53 = i52 % 2;
                        spinner2.setBackgroundResource(R.drawable.spinner_bg);
                        int i54 = b;
                        int i55 = (i54 & (-46)) | ((~i54) & 45);
                        int i56 = (i54 & 45) << 1;
                        int i57 = (i55 ^ i56) + ((i56 & i55) << 1);
                        a = i57 % 128;
                        if (i57 % 2 != 0) {
                            int i58 = 80 / 0;
                        }
                    }
                };
                int i11 = a;
                int i12 = (((i11 & (-48)) | ((~i11) & 47)) - (~((i11 & 47) << 1))) - 1;
                b = i12 % 128;
                int i13 = i12 % 2;
                Object obj = null;
                spinner.setOnItemSelectedListener(onItemSelectedListener);
                if (i13 != 0) {
                    obj.hashCode();
                    throw null;
                }
                int i14 = a;
                int i15 = i14 & 121;
                int i16 = -(-((i14 ^ 121) | i15));
                int i17 = (i15 & i16) + (i16 | i15);
                b = i17 % 128;
                if (i17 % 2 != 0) {
                    throw null;
                }
            }
        }).execute(new Void[0]);
        Activity activity8 = getActivity();
        Object[] objArr9 = new Object[1];
        a(TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0) + 18, (char) (24601 - AndroidCharacter.getMirror('0')), Gravity.getAbsoluteGravity(0, 0) + 2233, objArr9);
        new au(activity8, ((String) objArr9[0]).intern(), getResources().getString(R.string.gas_connection), this.sp_gas, new J() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentHouseholdInfo.9
            private static int a = 0;
            private static int b = 1;

            @Override // ivas.gov.bisp.enumeration.W.J
            public void fillList(ArrayList<Item> arrayList2) {
                int i6 = 2 % 2;
                int i7 = a;
                int i8 = i7 & 19;
                int i9 = ((i7 ^ 19) | i8) << 1;
                int i10 = -((i7 | 19) & (~i8));
                int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
                b = i11 % 128;
                int i12 = i11 % 2;
                FragmentHouseholdInfo fragmentHouseholdInfo = FragmentHouseholdInfo.this;
                fragmentHouseholdInfo.gasList = arrayList2;
                fragmentHouseholdInfo.sp_gas.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentHouseholdInfo.9.1
                    private static int a = 0;
                    private static int b = 1;

                    @Override // android.widget.AdapterView.OnItemSelectedListener
                    public void onNothingSelected(AdapterView<?> adapterView) {
                        int i13 = 2 % 2;
                        int i14 = a;
                        int i15 = (i14 & 32) + (i14 | 32);
                        int i16 = (i15 ^ (-1)) + (i15 << 1);
                        b = i16 % 128;
                        if (i16 % 2 != 0) {
                            return;
                        }
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }

                    /* JADX WARN: Code duplicated, block: B:11:0x004f  */
                    @Override // android.widget.AdapterView.OnItemSelectedListener
                    public void onItemSelected(AdapterView<?> adapterView, View view, int i13, long j) {
                        int i14 = 2 % 2;
                        int i15 = a;
                        int i16 = ((i15 ^ 119) | (i15 & 119)) << 1;
                        int i17 = -((i15 & (-120)) | ((~i15) & 119));
                        int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
                        b = i18 % 128;
                        int i19 = i18 % 2;
                        if (i13 != 1) {
                            int i20 = i15 & 41;
                            int i21 = (i15 ^ 41) | i20;
                            int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
                            b = i22 % 128;
                            if (i22 % 2 != 0 ? i13 == 2 : i13 == 3) {
                                FragmentHouseholdInfo.this.llGasMeterBill.setVisibility(0);
                                int i23 = a;
                                int i24 = ((i23 | 89) << 1) - (i23 ^ 89);
                                b = i24 % 128;
                                int i25 = i24 % 2;
                                FragmentHouseholdInfo.this.gas_et.setText(BuildConfig.FLAVOR);
                                int i26 = a + 13;
                                b = i26 % 128;
                                int i27 = i26 % 2;
                            } else {
                                FragmentHouseholdInfo.this.llGasMeterBill.setVisibility(8);
                                int i28 = a;
                                int i29 = (i28 ^ 97) + ((i28 & 97) << 1);
                                b = i29 % 128;
                                int i30 = i29 % 2;
                            }
                        } else {
                            FragmentHouseholdInfo.this.llGasMeterBill.setVisibility(0);
                            int i210 = a;
                            int i211 = ((i210 | 89) << 1) - (i210 ^ 89);
                            b = i211 % 128;
                            int i212 = i211 % 2;
                            FragmentHouseholdInfo.this.gas_et.setText(BuildConfig.FLAVOR);
                            int i213 = a + 13;
                            b = i213 % 128;
                            int i214 = i213 % 2;
                        }
                        if (i13 != 0) {
                            Spinner spinner = FragmentHouseholdInfo.this.sp_gas;
                            int i31 = b;
                            int i32 = i31 ^ 89;
                            int i33 = (i31 & 89) << 1;
                            int i34 = (i32 ^ i33) + ((i33 & i32) << 1);
                            a = i34 % 128;
                            int i35 = i34 % 2;
                            spinner.setBackgroundResource(R.drawable.spinner_bg_selected);
                            int i36 = a;
                            int i37 = (-2) - (((i36 ^ 40) + ((i36 & 40) << 1)) ^ (-1));
                            b = i37 % 128;
                            int i38 = i37 % 2;
                            return;
                        }
                        int i39 = a;
                        int i40 = i39 & 95;
                        int i41 = i40 + ((i39 ^ 95) | i40);
                        b = i41 % 128;
                        int i42 = i41 % 2;
                        FragmentHouseholdInfo.this.sp_gas.setBackgroundResource(R.drawable.spinner_bg);
                        int i43 = b;
                        int i44 = (i43 & (-34)) | ((~i43) & 33);
                        int i45 = (i43 & 33) << 1;
                        int i46 = (i44 & i45) + (i45 | i44);
                        a = i46 % 128;
                        if (i46 % 2 == 0) {
                            return;
                        }
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                });
                int i13 = a + 61;
                b = i13 % 128;
                int i14 = i13 % 2;
            }
        }).execute(new Void[0]);
        Activity activity9 = getActivity();
        Object[] objArr10 = new Object[1];
        a(20 - View.resolveSizeAndState(0, 0, 0), (char) (5755 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0)), 2252 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr10);
        new au(activity9, ((String) objArr10[0]).intern(), getResources().getString(R.string.landline_connection), this.sp_landline, new J() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentHouseholdInfo.10
            private static int a = 1;
            private static int b;

            @Override // ivas.gov.bisp.enumeration.W.J
            public void fillList(ArrayList<Item> arrayList2) {
                int i6 = 2 % 2;
                int i7 = a + 91;
                b = i7 % 128;
                int i8 = i7 % 2;
                FragmentHouseholdInfo.this.landlineList = arrayList2;
                if (i8 != 0) {
                    int i9 = 7 / 0;
                }
            }
        }).execute(new Void[0]);
        Activity activity10 = getActivity();
        Object[] objArr11 = new Object[1];
        a(TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0) + 12, (char) (16670 - (ViewConfiguration.getScrollBarSize() >> 8)), 2271 - (ViewConfiguration.getTouchSlop() >> 8), objArr11);
        new au(activity10, ((String) objArr11[0]).intern(), getResources().getString(R.string.unit), this.sp_unit, new J() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentHouseholdInfo.11
            private static int a = 1;
            private static int b;

            @Override // ivas.gov.bisp.enumeration.W.J
            public void fillList(ArrayList<Item> arrayList2) {
                int i6 = 2 % 2;
                int i7 = b;
                int i8 = i7 ^ 69;
                int i9 = (i7 & 69) << 1;
                int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
                a = i10 % 128;
                int i11 = i10 % 2;
                FragmentHouseholdInfo fragmentHouseholdInfo = FragmentHouseholdInfo.this;
                fragmentHouseholdInfo.unitList = arrayList2;
                fragmentHouseholdInfo.sp_unit.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentHouseholdInfo.11.1
                    private static int a = 0;
                    private static int b = 1;

                    @Override // android.widget.AdapterView.OnItemSelectedListener
                    public void onNothingSelected(AdapterView<?> adapterView) {
                        int i12 = 2 % 2;
                        int i13 = a;
                        int i14 = i13 & 93;
                        int i15 = ((i13 ^ 93) | i14) << 1;
                        int i16 = -((i13 | 93) & (~i14));
                        int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
                        b = i17 % 128;
                        int i18 = i17 % 2;
                    }

                    @Override // android.widget.AdapterView.OnItemSelectedListener
                    public void onItemSelected(AdapterView<?> adapterView, View view, int i12, long j) {
                        int i13 = 2 % 2;
                        int i14 = b;
                        int i15 = ((i14 ^ 81) | (i14 & 81)) << 1;
                        int i16 = -(((~i14) & 81) | (i14 & (-82)));
                        int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
                        a = i17 % 128;
                        if (i17 % 2 != 0) {
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        if (i12 == 0) {
                            Spinner spinner = FragmentHouseholdInfo.this.sp_unit;
                            int i18 = a;
                            int i19 = ((i18 | 67) << 1) - (i18 ^ 67);
                            b = i19 % 128;
                            int i20 = i19 % 2;
                            spinner.setBackgroundResource(R.drawable.spinner_bg);
                            int i21 = a;
                            int i22 = i21 & 93;
                            int i23 = -(-((i21 ^ 93) | i22));
                            int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
                            b = i24 % 128;
                            int i25 = i24 % 2;
                        } else {
                            FragmentHouseholdInfo.this.sp_unit.setBackgroundResource(R.drawable.spinner_bg_selected);
                            int i26 = a;
                            int i27 = i26 ^ 101;
                            int i28 = (i26 & 101) << 1;
                            int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
                            b = i29 % 128;
                            if (i29 % 2 == 0) {
                                int i30 = 2 / 5;
                            }
                        }
                        FragmentHouseholdInfo.this.totalLandSpinner.setVisibility(0);
                        int i31 = (-2) - ((a + 12) ^ (-1));
                        b = i31 % 128;
                        int i32 = i31 % 2;
                        FragmentHouseholdInfo.this.editTextNumber.setVisibility(8);
                        int i33 = a;
                        int i34 = ((i33 ^ 98) + ((i33 & 98) << 1)) - 1;
                        b = i34 % 128;
                        int i35 = i34 % 2;
                        FragmentHouseholdInfo fragmentHouseholdInfo2 = FragmentHouseholdInfo.this;
                        Spinner spinner2 = fragmentHouseholdInfo2.sp_unit;
                        int i36 = a;
                        int i37 = i36 ^ 35;
                        int i38 = -(-((i36 & 35) << 1));
                        int i39 = ((i37 | i38) << 1) - (i38 ^ i37);
                        b = i39 % 128;
                        if (i39 % 2 != 0) {
                            fragmentHouseholdInfo2.loadLandSpinners(spinner2, fragmentHouseholdInfo2.totalLandSpinner);
                        } else {
                            fragmentHouseholdInfo2.loadLandSpinners(spinner2, fragmentHouseholdInfo2.totalLandSpinner);
                            int i40 = 86 / 0;
                        }
                    }
                });
                int i12 = b;
                int i13 = (i12 & (-96)) | ((~i12) & 95);
                int i14 = (i12 & 95) << 1;
                int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
                a = i15 % 128;
                int i16 = i15 % 2;
            }
        }).execute(new Void[0]);
        Activity activity11 = getActivity();
        Object[] objArr12 = new Object[1];
        a(View.getDefaultSize(0, 0) + 12, (char) (View.getDefaultSize(0, 0) + 16670), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2270, objArr12);
        new au(activity11, ((String) objArr12[0]).intern(), getResources().getString(R.string.unit), this.sp_unit_agri, new J() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentHouseholdInfo.12
            private static int a = 0;
            private static int b = 1;

            @Override // ivas.gov.bisp.enumeration.W.J
            public void fillList(ArrayList<Item> arrayList2) {
                int i6 = 2 % 2;
                FragmentHouseholdInfo fragmentHouseholdInfo = FragmentHouseholdInfo.this;
                fragmentHouseholdInfo.unitList = arrayList2;
                Spinner spinner = fragmentHouseholdInfo.sp_unit_agri;
                AdapterView.OnItemSelectedListener onItemSelectedListener = new AdapterView.OnItemSelectedListener() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentHouseholdInfo.12.1
                    private static int a = 1;
                    private static int b;

                    @Override // android.widget.AdapterView.OnItemSelectedListener
                    public void onNothingSelected(AdapterView<?> adapterView) {
                        int i7 = 2 % 2;
                        int i8 = a;
                        int i9 = i8 & 5;
                        int i10 = (i8 ^ 5) | i9;
                        int i11 = (i9 & i10) + (i10 | i9);
                        b = i11 % 128;
                        int i12 = i11 % 2;
                    }

                    @Override // android.widget.AdapterView.OnItemSelectedListener
                    public void onItemSelected(AdapterView<?> adapterView, View view, int i7, long j) {
                        FragmentHouseholdInfo fragmentHouseholdInfo2;
                        Spinner spinner2;
                        int i8 = 2 % 2;
                        int i9 = b;
                        int i10 = (i9 & 37) + (i9 | 37);
                        a = i10 % 128;
                        if (i10 % 2 == 0) {
                            throw null;
                        }
                        if (i7 == 0) {
                            int i11 = ((((i9 ^ 61) | (i9 & 61)) << 1) - (~(-(((~i9) & 61) | (i9 & (-62)))))) - 1;
                            a = i11 % 128;
                            if (i11 % 2 == 0) {
                                FragmentHouseholdInfo.this.sp_unit_agri.setBackgroundResource(R.drawable.spinner_bg);
                                throw null;
                            }
                            FragmentHouseholdInfo.this.sp_unit_agri.setBackgroundResource(R.drawable.spinner_bg);
                        } else {
                            FragmentHouseholdInfo.this.sp_unit_agri.setBackgroundResource(R.drawable.spinner_bg_selected);
                            int i12 = b + 99;
                            a = i12 % 128;
                            int i13 = i12 % 2;
                        }
                        FragmentHouseholdInfo.this.agricultureLanSpinner.setVisibility(0);
                        int i14 = a;
                        int i15 = i14 & 39;
                        int i16 = ((i14 | 39) & (~i15)) + (i15 << 1);
                        b = i16 % 128;
                        int i17 = i16 % 2;
                        FragmentHouseholdInfo.this.et_number_agri.setVisibility(8);
                        int i18 = b;
                        int i19 = i18 & 31;
                        int i20 = ((i18 ^ 31) | i19) << 1;
                        int i21 = -((i18 | 31) & (~i19));
                        int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
                        a = i22 % 128;
                        if (i22 % 2 == 0) {
                            fragmentHouseholdInfo2 = FragmentHouseholdInfo.this;
                            spinner2 = fragmentHouseholdInfo2.sp_unit_agri;
                            int i23 = 57 / 0;
                        } else {
                            fragmentHouseholdInfo2 = FragmentHouseholdInfo.this;
                            spinner2 = fragmentHouseholdInfo2.sp_unit_agri;
                        }
                        int i24 = a;
                        int i25 = (i24 ^ 43) + ((i24 & 43) << 1);
                        b = i25 % 128;
                        int i26 = i25 % 2;
                        fragmentHouseholdInfo2.loadLandSpinners(spinner2, fragmentHouseholdInfo2.agricultureLanSpinner);
                        int i27 = a + 106;
                        int i28 = (i27 ^ (-1)) + (i27 << 1);
                        b = i28 % 128;
                        int i29 = i28 % 2;
                    }
                };
                int i7 = a;
                int i8 = (i7 ^ 9) + ((i7 & 9) << 1);
                b = i8 % 128;
                int i9 = i8 % 2;
                spinner.setOnItemSelectedListener(onItemSelectedListener);
                int i10 = a;
                int i11 = i10 | 47;
                int i12 = i11 << 1;
                int i13 = -((~(i10 & 47)) & i11);
                int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
                b = i14 % 128;
                if (i14 % 2 == 0) {
                    throw null;
                }
            }
        }).execute(new Void[0]);
    }

    private void updateDividerPercentage(int i, double d) {
        int i2 = 2 % 2;
        int i3 = h + 117;
        e = i3 % 128;
        double d2 = i3 % 2 != 0 ? this.dividerForPercentage / ((double) i) : this.dividerForPercentage + ((double) i);
        this.dividerForPercentage = d2;
        ActivityBeginSurvey activityBeginSurvey = this.activityBeginSurvey;
        activityBeginSurvey.as += d2;
        activityBeginSurvey.ap.validation_percentage += d;
        int i4 = e + 5;
        h = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00dd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x00df  */
    /* JADX WARN: Code duplicated, block: B:96:0x00e6 A[SYNTHETIC] */
    public void loadLandSpinners(Spinner spinner, Spinner spinner2) {
        int i = 2 % 2;
        if (spinner.getSelectedItemPosition() > 0) {
            int optionId = this.unitList.get(spinner.getSelectedItemPosition()).getOptionId();
            ArrayList<String> arrayList = new ArrayList<>();
            Object[] objArr = new Object[1];
            a(6 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (12959 - Color.blue(0)), 2064 - (ViewConfiguration.getTapTimeout() >> 16), objArr);
            arrayList.add(((String) objArr[0]).intern());
            if (optionId == 115) {
                for (int i2 = 1; i2 < GAS_SCANNER; i2++) {
                    int i3 = e;
                    int i4 = i3 + 39;
                    h = i4 % 128;
                    int i5 = i4 % 2;
                    if (i2 != 20 && i2 != 40) {
                        int i6 = i3 + 111;
                        h = i6 % 128;
                        int i7 = i6 % 2;
                        if (i2 != 60 && i2 != 80 && i2 != GAS_SCANNER) {
                            arrayList.add(String.valueOf(i2));
                        }
                    }
                }
            } else if (optionId == 116) {
                int i8 = e + 123;
                h = i8 % 128;
                int i9 = i8 % 2;
                for (int i10 = 1; i10 < 40; i10++) {
                    if (i10 != 4) {
                        int i11 = e + 23;
                        int i12 = i11 % 128;
                        h = i12;
                        int i13 = i11 % 2;
                        if (i10 != 8 && i10 != 12 && i10 != 16) {
                            int i14 = i12 + 13;
                            int i15 = i14 % 128;
                            e = i15;
                            if (i14 % 2 != 0) {
                                if (i10 != 18) {
                                    if (i10 == 24 && i10 != 28) {
                                        int i16 = i15 + 7;
                                        int i17 = i16 % 128;
                                        h = i17;
                                        int i18 = i16 % 2;
                                        if (i10 != 32) {
                                            int i19 = i17 + 29;
                                            e = i19 % 128;
                                            if (i19 % 2 != 0) {
                                                if (i10 != 97) {
                                                    if (i10 != 40) {
                                                        arrayList.add(String.valueOf(i10));
                                                    }
                                                }
                                            } else if (i10 != 36) {
                                                if (i10 != 40) {
                                                    arrayList.add(String.valueOf(i10));
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (i10 != 20) {
                                if (i10 == 24) {
                                }
                            }
                        }
                    }
                }
            } else if (optionId == 117) {
                int i20 = h + 11;
                e = i20 % 128;
                int i21 = i20 % 2;
                int i22 = 1;
                while (i22 <= 5) {
                    int i23 = h + 99;
                    e = i23 % 128;
                    if (i23 % 2 != 0) {
                        arrayList.add(String.valueOf(i22));
                        i22 += 98;
                    } else {
                        arrayList.add(String.valueOf(i22));
                        i22++;
                    }
                }
            } else if (optionId == 118) {
                arrayList.add("1");
            } else if (optionId == 210) {
                for (int i24 = 1; i24 < 10; i24++) {
                    if (i24 != 2 && i24 != 4 && i24 != 6 && i24 != 8 && i24 != 10) {
                        arrayList.add(String.valueOf(i24));
                        int i25 = h + 33;
                        e = i25 % 128;
                        int i26 = i25 % 2;
                    }
                }
            }
            Object[] objArr2 = new Object[1];
            a(5 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (26128 - ExpandableListView.getPackedPositionGroup(0L)), 13 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr2);
            arrayList.add(((String) objArr2[0]).intern());
            setSpinnerAdapter(arrayList, spinner2);
        }
    }

    private void generateBody() throws Throwable {
        int i = 2;
        int i2 = 2 % 2;
        loadSpinners();
        ac.m(new Spinner[]{this.sp_occupancy_status, this.sp_wall_material, this.sp_roof_material, this.sp_cooking_fuel, this.sp_toilet, this.sp_drinking_water, this.sp_electricity, this.sp_gas, this.sp_landline, this.sp_unit}, new o[]{this.occupancyStatusArrayAdapter, this.wallMaterialArrayAdapter, this.roofMaterialArrayAdapter, this.cookingFuelArrayAdapter, this.toiletArrayAdapter, this.drinkingWaterArrayAdapter, this.electricityArrayAdapter, this.gasArrayAdapter, this.landlineArrayAdapter, this.unitArrayAdapter});
        this.sp_unit.setEnabled(false);
        this.sp_unit_agri.setEnabled(false);
        if (this.activityBeginSurvey.ac == 0) {
            int i3 = e + 41;
            h = i3 % 128;
            int i4 = i3 % 2;
            if (!ag.d) {
                setVisibility();
                int i5 = e + 37;
                h = i5 % 128;
                int i6 = i5 % 2;
            }
        }
        this.rg_holdAgriculturalLand.setOnCheckedChangeListener(new C0201c(this, i));
        this.rg_animal.setOnCheckedChangeListener(new h(this, 3));
    }

    private void setSpotCheckUserVisibility() {
        int i = 2 % 2;
        if (this.activityBeginSurvey.ac == 2) {
            int i2 = e + 19;
            h = i2 % 128;
            int i3 = i2 % 2;
            this.sp_occupancy_status.setVisibility(8);
            this.sp_cooking_fuel.setVisibility(8);
            this.ll_generator.setVisibility(8);
            this.ll_sewing.setVisibility(8);
            this.ll_computer.setVisibility(8);
            this.ll_tractor.setVisibility(8);
            this.ll_mobile.setVisibility(8);
            this.ll_internet.setVisibility(8);
            this.ll_minternet.setVisibility(8);
        }
        int i4 = h + 83;
        e = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.X.e
    public SupervisorParseObject parseJsonForSupervisor() {
        int i = 2 % 2;
        SupervisorParseObject supervisorParseObject = new SupervisorParseObject();
        parseSuperObj();
        supervisorParseObject.setSurveySupervisor(this.activityBeginSurvey.ap);
        supervisorParseObject.setDividerForPercentage(this.activityBeginSurvey.as);
        supervisorParseObject.setVerificationQuestionsCount(this.activityBeginSurvey.au);
        int i2 = h + 31;
        e = i2 % 128;
        if (i2 % 2 == 0) {
            return supervisorParseObject;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public LayoutAndValueBoolean checkVisible(LinearLayout linearLayout, int i, int i2) {
        int i3 = 2 % 2;
        LayoutAndValueBoolean layoutAndValueBoolean = new LayoutAndValueBoolean();
        if (linearLayout.getVisibility() == 0) {
            layoutAndValueBoolean.isLayoutVisible = true;
            if (i == i2) {
                int i4 = h + 59;
                e = i4 % 128;
                if (i4 % 2 != 0) {
                    layoutAndValueBoolean.isValueSame = false;
                } else {
                    layoutAndValueBoolean.isValueSame = true;
                }
                updateHouseHoldPercentage(1);
                int i5 = e + 47;
                h = i5 % 128;
                int i6 = i5 % 2;
            } else {
                layoutAndValueBoolean.isValueSame = false;
            }
        } else {
            layoutAndValueBoolean.isLayoutVisible = false;
        }
        return layoutAndValueBoolean;
    }

    private void showAlertDialog(String str, String str2, final Spinner spinner, final boolean z, final EditText editText) {
        int i = 2 % 2;
        Typeface typefaceB = C0084m.b(getActivity(), R.font.jameel_noori_nastaleeq);
        b.aIz aiz = new b.aIz(getActivity());
        View viewInflate = LayoutInflater.from(getActivity()).inflate(R.layout.custom_dialog_new, (ViewGroup) getActivity().findViewById(android.R.id.content), false);
        aiz.c(viewInflate);
        final b bVarB = aiz.b();
        bVarB.show();
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_heading);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_message);
        textView.setText(str);
        textView2.setText(str2);
        textView2.setTypeface(typefaceB);
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.btn_ok);
        TextView textView4 = (TextView) viewInflate.findViewById(R.id.btn_no);
        if (z) {
            int i2 = h + 9;
            e = i2 % 128;
            int i3 = i2 % 2;
            textView3.setVisibility(8);
            Object[] objArr = new Object[1];
            a(7 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 18 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr);
            textView4.setText(((String) objArr[0]).intern());
            int i4 = e + 23;
            h = i4 % 128;
            int i5 = i4 % 2;
        } else {
            textView3.setVisibility(0);
            Object[] objArr2 = new Object[1];
            a(3 - TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0), (char) (45870 - View.MeasureSpec.makeMeasureSpec(0, 0)), 25 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr2);
            textView3.setText(((String) objArr2[0]).intern());
            Object[] objArr3 = new Object[1];
            a((ViewConfiguration.getTouchSlop() >> 8) + 4, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), 27 - ExpandableListView.getPackedPositionChild(0L), objArr3);
            textView4.setText(((String) objArr3[0]).intern());
        }
        textView3.setOnClickListener(new View.OnClickListener() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentHouseholdInfo.15
            private static int a = 0;
            private static int b = 1;

            {
                int i6 = a + 95;
                b = i6 % 128;
                int i7 = i6 % 2;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                int i6 = 2 % 2;
                int i7 = a;
                int i8 = ((i7 ^ 51) | (i7 & 51)) << 1;
                int i9 = -(((~i7) & 51) | (i7 & (-52)));
                int i10 = (i8 & i9) + (i9 | i8);
                int i11 = i10 % 128;
                b = i11;
                Object obj = null;
                if (i10 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                if (z || editText != null) {
                    Spinner spinner2 = spinner;
                    if (spinner2 != null) {
                        int i12 = i11 & 37;
                        int i13 = -(-(i11 | 37));
                        int i14 = (i12 & i13) + (i13 | i12);
                        a = i14 % 128;
                        if (i14 % 2 != 0) {
                            spinner2.setVisibility(37);
                        } else {
                            spinner2.setVisibility(8);
                        }
                    }
                    editText.setVisibility(0);
                    EditText editText2 = editText;
                    int i15 = a;
                    int i16 = (i15 & 3) + (i15 | 3);
                    b = i16 % 128;
                    int i17 = i16 % 2;
                    if (editText2.getId() == FragmentHouseholdInfo.this.editTextNumber.getId()) {
                        int i18 = b;
                        int i19 = i18 & 77;
                        int i20 = i18 | 77;
                        int i21 = (i19 & i20) + (i20 | i19);
                        a = i21 % 128;
                        int i22 = i21 % 2;
                        FragmentHouseholdInfo.access$202(FragmentHouseholdInfo.this, true);
                        int i23 = a + 17;
                        b = i23 % 128;
                        int i24 = i23 % 2;
                    } else {
                        int id = editText.getId();
                        FragmentHouseholdInfo fragmentHouseholdInfo = FragmentHouseholdInfo.this;
                        int i25 = b;
                        int i26 = i25 ^ 73;
                        int i27 = (i25 & 73) << 1;
                        int i28 = (i26 & i27) + (i27 | i26);
                        a = i28 % 128;
                        int i29 = i28 % 2;
                        if (id == fragmentHouseholdInfo.et_number_agri.getId()) {
                            int i30 = a;
                            int i31 = i30 & 63;
                            int i32 = (i30 | 63) & (~i31);
                            int i33 = i31 << 1;
                            int i34 = ((i32 | i33) << 1) - (i32 ^ i33);
                            b = i34 % 128;
                            int i35 = i34 % 2;
                            FragmentHouseholdInfo.access$302(FragmentHouseholdInfo.this, true);
                            int i36 = a;
                            int i37 = ((i36 | 49) << 1) - (i36 ^ 49);
                            b = i37 % 128;
                            int i38 = i37 % 2;
                        }
                    }
                } else {
                    int i39 = ((i11 | 103) << 1) - (i11 ^ 103);
                    a = i39 % 128;
                    int i40 = i39 % 2;
                    spinner.setVisibility(0);
                    Spinner spinner3 = spinner;
                    int i41 = b;
                    int i42 = (i41 & (-96)) | ((~i41) & 95);
                    int i43 = (i41 & 95) << 1;
                    int i44 = (i42 & i43) + (i43 | i42);
                    a = i44 % 128;
                    int i45 = i44 % 2;
                    spinner3.setSelection(spinner3.getSelectedItemPosition());
                    EditText editText3 = editText;
                    if (editText3 != null) {
                        int i46 = b;
                        int i47 = i46 & 69;
                        int i48 = -(-((i46 ^ 69) | i47));
                        int i49 = (i47 ^ i48) + ((i48 & i47) << 1);
                        a = i49 % 128;
                        if (i49 % 2 != 0) {
                            editText3.setVisibility(33);
                        } else {
                            editText3.setVisibility(8);
                        }
                    }
                }
                bVarB.dismiss();
                int i50 = b;
                int i51 = (i50 & (-72)) | ((~i50) & 71);
                int i52 = (i50 & 71) << 1;
                int i53 = (i51 ^ i52) + ((i52 & i51) << 1);
                a = i53 % 128;
                if (i53 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        });
        textView4.setOnClickListener(new View.OnClickListener() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentHouseholdInfo.16
            private static int a = 0;
            private static int b = 1;

            {
                int i6 = a + 5;
                b = i6 % 128;
                int i7 = i6 % 2;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                EditText editText2;
                int i6 = 2 % 2;
                int i7 = a;
                int i8 = (i7 & (-54)) | ((~i7) & 53);
                int i9 = -(-((i7 & 53) << 1));
                int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
                int i11 = i10 % 128;
                b = i11;
                int i12 = i10 % 2;
                if (z) {
                    Spinner spinner2 = spinner;
                    if (spinner2 != null) {
                        int i13 = (i11 & (-100)) | ((~i11) & 99);
                        int i14 = -(-((i11 & 99) << 1));
                        int i15 = (i13 & i14) + (i14 | i13);
                        a = i15 % 128;
                        if (i15 % 2 != 0) {
                            spinner2.setVisibility(48);
                        } else {
                            spinner2.setVisibility(8);
                        }
                    }
                    editText.setVisibility(0);
                    Editable text = editText.getText();
                    int i16 = (-2) - ((a + 92) ^ (-1));
                    b = i16 % 128;
                    int i17 = i16 % 2;
                    text.clear();
                    int i18 = a;
                    int i19 = i18 & 65;
                    int i20 = (i18 ^ 65) | i19;
                    int i21 = (i19 & i20) + (i20 | i19);
                    b = i21 % 128;
                    int i22 = i21 % 2;
                } else {
                    int i23 = i11 & 1;
                    int i24 = -(-((i11 ^ 1) | i23));
                    int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
                    a = i25 % 128;
                    if (i25 % 2 != 0) {
                        spinner.setVisibility(1);
                    } else {
                        spinner.setVisibility(0);
                    }
                    Spinner spinner3 = spinner;
                    int i26 = a;
                    int i27 = (i26 ^ 69) + ((i26 & 69) << 1);
                    b = i27 % 128;
                    int i28 = i27 % 2;
                    spinner3.setSelection(0);
                    EditText editText3 = editText;
                    if (editText3 != null) {
                        int i29 = b;
                        int i30 = (i29 & 35) + (i29 | 35);
                        a = i30 % 128;
                        if (i30 % 2 != 0) {
                            editText3.setVisibility(103);
                            editText2 = editText;
                        } else {
                            editText3.setVisibility(8);
                            editText2 = editText;
                        }
                        editText2.getText().clear();
                        int i31 = a;
                        int i32 = (i31 & 81) + (i31 | 81);
                        b = i32 % 128;
                        int i33 = i32 % 2;
                    }
                }
                bVarB.dismiss();
                int i34 = a;
                int i35 = i34 | 115;
                int i36 = i35 << 1;
                int i37 = -((~(i34 & 115)) & i35);
                int i38 = ((i36 | i37) << 1) - (i37 ^ i36);
                b = i38 % 128;
                if (i38 % 2 == 0) {
                    throw null;
                }
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:255:0x0b50, code lost:
    
        if (ivas.gov.bisp.enumeration.p026az.z.m(r4, r11, ((java.lang.String) r14[0]).intern()) == false) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0b81, code lost:
    
        if (ivas.gov.bisp.enumeration.p026az.z.m(r4, r11, ((java.lang.String) r15[0]).intern()) == false) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0b83, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x0f1c, code lost:
    
        if (r19.sp_electricity.getSelectedItemPosition() != 2) goto L372;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean isSuperFormValid() {
        /*
            Method dump skipped, instruction units count: 4222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.fragments.FragmentHouseholdInfo.isSuperFormValid():boolean");
    }

    /* JADX WARN: Code duplicated, block: B:182:0x0414  */
    /* JADX WARN: Code duplicated, block: B:183:0x0426  */
    /* JADX WARN: Code duplicated, block: B:184:0x0428  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:76:0x01ce A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:79:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:93:0x0231  */
    private void parseSuperFlags() {
        Survey survey;
        Survey survey2;
        int i = 2 % 2;
        LinearLayout linearLayout = this.ll_number_of_rooms;
        ActivityBeginSurvey activityBeginSurvey = this.activityBeginSurvey;
        LayoutAndValueBoolean layoutAndValueBooleanCheckVisible = checkVisible(linearLayout, activityBeginSurvey.aG.number_of_rooms, activityBeginSurvey.ap.number_of_rooms);
        boolean z = layoutAndValueBooleanCheckVisible.isLayoutVisible;
        if (z) {
            this.activityBeginSurvey.au.number_of_rooms_flag++;
        }
        if (z && layoutAndValueBooleanCheckVisible.isValueSame) {
            this.activityBeginSurvey.ap.number_of_rooms_flag = 1;
        } else if (z && !layoutAndValueBooleanCheckVisible.isValueSame) {
            int i2 = e + 3;
            h = i2 % 128;
            int i3 = i2 % 2;
            this.activityBeginSurvey.ap.number_of_rooms_flag = 0;
        }
        LinearLayout linearLayout2 = this.ll_holdagriculturalLand;
        ActivityBeginSurvey activityBeginSurvey2 = this.activityBeginSurvey;
        LayoutAndValueBoolean layoutAndValueBooleanCheckVisible2 = checkVisible(linearLayout2, activityBeginSurvey2.aG.household_agriculture_land, activityBeginSurvey2.ap.household_agriculture_land);
        boolean z2 = layoutAndValueBooleanCheckVisible2.isLayoutVisible;
        if (z2) {
            VerificationQuestionsCount verificationQuestionsCount = this.activityBeginSurvey.au;
            verificationQuestionsCount.household_agriculture_land_flag++;
            verificationQuestionsCount.land_unit_flag++;
            verificationQuestionsCount.land_number_flag++;
        }
        if (z2 && layoutAndValueBooleanCheckVisible2.isValueSame) {
            this.activityBeginSurvey.ap.household_agriculture_land_flag = 1;
        } else if (z2 && !layoutAndValueBooleanCheckVisible2.isValueSame) {
            this.activityBeginSurvey.ap.household_agriculture_land_flag = 0;
        }
        if (this.ll_holdagriculturalLand.getVisibility() == 0) {
            ActivityBeginSurvey activityBeginSurvey3 = this.activityBeginSurvey;
            int i4 = activityBeginSurvey3.aG.household_agriculture_land;
            if (i4 == 0) {
                Survey survey3 = activityBeginSurvey3.ap;
                if (survey3.household_agriculture_land == 0) {
                    survey3.land_unit_flag = 1;
                    updateHouseHoldPercentage(1);
                    this.activityBeginSurvey.ap.land_number_flag = 1;
                } else if (i4 == 0) {
                    survey2 = activityBeginSurvey3.ap;
                    if (survey2.household_agriculture_land == 1) {
                        survey2.land_unit_flag = 0;
                        survey2.land_number_flag = 0;
                    }
                }
            } else if (i4 == 0) {
                survey2 = activityBeginSurvey3.ap;
                if (survey2.household_agriculture_land == 1) {
                    survey2.land_unit_flag = 0;
                    survey2.land_number_flag = 0;
                }
            }
            this.totalCount += 2.0d;
            if (this.activityBeginSurvey.aG.household_agriculture_land == 1) {
                if (z.i(this.rg_holdAgriculturalLand) == 1) {
                    if (this.sp_unit.getSelectedItemPosition() != 0) {
                        int i5 = e + 125;
                        h = i5 % 128;
                        int i6 = i5 % 2;
                        this.activityBeginSurvey.ap.land_unit_code = this.unitList.get(this.sp_unit.getSelectedItemPosition()).getOptionId();
                        this.activityBeginSurvey.ap.land_unit_status = this.unitList.get(this.sp_unit.getSelectedItemPosition()).getOption();
                        ActivityBeginSurvey activityBeginSurvey4 = this.activityBeginSurvey;
                        int i7 = activityBeginSurvey4.aG.land_unit_code;
                        Survey survey4 = activityBeginSurvey4.ap;
                        if (i7 == survey4.land_unit_code) {
                            survey4.land_unit_flag = 1;
                            updateHouseHoldPercentage(1);
                        } else {
                            survey4.land_unit_flag = 0;
                        }
                    }
                    LinearLayout linearLayout3 = this.ll_holdagriculturalLand;
                    ActivityBeginSurvey activityBeginSurvey5 = this.activityBeginSurvey;
                    LayoutAndValueBoolean layoutAndValueBooleanCheckVisible3 = checkVisible(linearLayout3, activityBeginSurvey5.aG.land_number, activityBeginSurvey5.ap.land_number);
                    boolean z3 = layoutAndValueBooleanCheckVisible3.isLayoutVisible;
                    if (z3 && layoutAndValueBooleanCheckVisible3.isValueSame) {
                        this.activityBeginSurvey.ap.land_number_flag = 1;
                    } else if (z3 && !layoutAndValueBooleanCheckVisible3.isValueSame) {
                        this.activityBeginSurvey.ap.land_number_flag = 0;
                    }
                } else if (z.i(this.rg_holdAgriculturalLand) == 0) {
                    Survey survey5 = this.activityBeginSurvey.ap;
                    survey5.land_unit_flag = 0;
                    survey5.land_number_flag = 0;
                }
            }
        }
        LinearLayout linearLayout4 = this.ll_animal_count;
        ActivityBeginSurvey activityBeginSurvey6 = this.activityBeginSurvey;
        LayoutAndValueBoolean layoutAndValueBooleanCheckVisible4 = checkVisible(linearLayout4, activityBeginSurvey6.aG.animal, activityBeginSurvey6.ap.animal);
        boolean z4 = layoutAndValueBooleanCheckVisible4.isLayoutVisible;
        if (z4) {
            VerificationQuestionsCount verificationQuestionsCount2 = this.activityBeginSurvey.au;
            verificationQuestionsCount2.animal_flag++;
            verificationQuestionsCount2.buffalo_flag++;
            verificationQuestionsCount2.horse_flag++;
            verificationQuestionsCount2.cow_flag++;
            verificationQuestionsCount2.camel_flag++;
            verificationQuestionsCount2.goat_flag++;
        }
        if (z4 && layoutAndValueBooleanCheckVisible4.isValueSame) {
            this.activityBeginSurvey.ap.animal_flag = 1;
        } else if (z4 && !layoutAndValueBooleanCheckVisible4.isValueSame) {
            this.activityBeginSurvey.ap.animal_flag = 0;
        }
        if (this.ll_animal_count.getVisibility() == 0) {
            ActivityBeginSurvey activityBeginSurvey7 = this.activityBeginSurvey;
            int i8 = activityBeginSurvey7.aG.animal;
            if (i8 == 0) {
                Survey survey6 = activityBeginSurvey7.ap;
                if (survey6.animal == 0) {
                    survey6.buffalo_flag = 1;
                    survey6.camel_flag = 1;
                    survey6.goat_flag = 1;
                    survey6.cow_flag = 1;
                    survey6.horse_flag = 1;
                    updateHouseHoldPercentage(5);
                } else if (i8 == 0) {
                    survey = activityBeginSurvey7.ap;
                    if (survey.animal == 1) {
                        int i9 = e + 83;
                        h = i9 % 128;
                        int i10 = i9 % 2;
                        survey.buffalo_flag = 0;
                        survey.camel_flag = 0;
                        survey.goat_flag = 0;
                        survey.cow_flag = 0;
                        survey.horse_flag = 0;
                    }
                }
            } else if (i8 == 0) {
                survey = activityBeginSurvey7.ap;
                if (survey.animal == 1) {
                    int i11 = e + 83;
                    h = i11 % 128;
                    int i12 = i11 % 2;
                    survey.buffalo_flag = 0;
                    survey.camel_flag = 0;
                    survey.goat_flag = 0;
                    survey.cow_flag = 0;
                    survey.horse_flag = 0;
                }
            }
            this.totalCount += 5.0d;
            if (this.activityBeginSurvey.aG.animal == 1) {
                if (z.i(this.rg_animal) == 1) {
                    LinearLayout linearLayout5 = this.ll_animal_count;
                    ActivityBeginSurvey activityBeginSurvey8 = this.activityBeginSurvey;
                    LayoutAndValueBoolean layoutAndValueBooleanCheckVisible5 = checkVisible(linearLayout5, activityBeginSurvey8.aG.buffalo, activityBeginSurvey8.ap.buffalo);
                    boolean z5 = layoutAndValueBooleanCheckVisible5.isLayoutVisible;
                    if (z5) {
                        int i13 = e + 91;
                        h = i13 % 128;
                        if (i13 % 2 == 0) {
                            boolean z6 = layoutAndValueBooleanCheckVisible5.isValueSame;
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        if (layoutAndValueBooleanCheckVisible5.isValueSame) {
                            this.activityBeginSurvey.ap.buffalo_flag = 1;
                        } else if (z5 && !layoutAndValueBooleanCheckVisible5.isValueSame) {
                            this.activityBeginSurvey.ap.buffalo_flag = 0;
                        }
                    } else if (z5) {
                        this.activityBeginSurvey.ap.buffalo_flag = 0;
                    }
                    LinearLayout linearLayout6 = this.ll_animal_count;
                    ActivityBeginSurvey activityBeginSurvey9 = this.activityBeginSurvey;
                    LayoutAndValueBoolean layoutAndValueBooleanCheckVisible6 = checkVisible(linearLayout6, activityBeginSurvey9.aG.cow, activityBeginSurvey9.ap.cow);
                    boolean z7 = layoutAndValueBooleanCheckVisible6.isLayoutVisible;
                    if (z7 && layoutAndValueBooleanCheckVisible6.isValueSame) {
                        int i14 = h + 47;
                        e = i14 % 128;
                        int i15 = i14 % 2;
                        this.activityBeginSurvey.ap.cow_flag = 1;
                    } else if (z7 && !layoutAndValueBooleanCheckVisible6.isValueSame) {
                        this.activityBeginSurvey.A().cow_flag = 0;
                    }
                    LinearLayout linearLayout7 = this.ll_animal_count;
                    ActivityBeginSurvey activityBeginSurvey10 = this.activityBeginSurvey;
                    LayoutAndValueBoolean layoutAndValueBooleanCheckVisible7 = checkVisible(linearLayout7, activityBeginSurvey10.aG.camel, activityBeginSurvey10.ap.camel);
                    boolean z8 = layoutAndValueBooleanCheckVisible7.isLayoutVisible;
                    if (z8 && layoutAndValueBooleanCheckVisible7.isValueSame) {
                        this.activityBeginSurvey.A().camel_flag = 1;
                    } else if (z8 && !layoutAndValueBooleanCheckVisible7.isValueSame) {
                        this.activityBeginSurvey.A().camel_flag = 0;
                    }
                    LayoutAndValueBoolean layoutAndValueBooleanCheckVisible8 = checkVisible(this.ll_animal_count, this.activityBeginSurvey.z().goat, this.activityBeginSurvey.A().goat);
                    boolean z9 = layoutAndValueBooleanCheckVisible8.isLayoutVisible;
                    if (z9 && layoutAndValueBooleanCheckVisible8.isValueSame) {
                        this.activityBeginSurvey.A().goat_flag = 1;
                    } else if (z9 && !layoutAndValueBooleanCheckVisible8.isValueSame) {
                        int i16 = e + 117;
                        h = i16 % 128;
                        int i17 = i16 % 2;
                        this.activityBeginSurvey.A().goat_flag = 0;
                    }
                    LayoutAndValueBoolean layoutAndValueBooleanCheckVisible9 = checkVisible(this.ll_animal_count, this.activityBeginSurvey.z().horse, this.activityBeginSurvey.A().horse);
                    boolean z10 = layoutAndValueBooleanCheckVisible9.isLayoutVisible;
                    if (z10 && layoutAndValueBooleanCheckVisible9.isValueSame) {
                        this.activityBeginSurvey.A().horse_flag = 1;
                    } else if (z10 && !layoutAndValueBooleanCheckVisible9.isValueSame) {
                        this.activityBeginSurvey.A().horse_flag = 0;
                    }
                } else if (z.i(this.rg_animal) == 0) {
                    Survey survey7 = this.activityBeginSurvey.ap;
                    survey7.buffalo_flag = 0;
                    survey7.camel_flag = 0;
                    survey7.goat_flag = 0;
                    survey7.cow_flag = 0;
                    survey7.horse_flag = 0;
                }
            }
        }
        LinearLayout linearLayout8 = this.ll_heater;
        ActivityBeginSurvey activityBeginSurvey11 = this.activityBeginSurvey;
        LayoutAndValueBoolean layoutAndValueBooleanCheckVisible10 = checkVisible(linearLayout8, activityBeginSurvey11.aG.heater, activityBeginSurvey11.ap.heater);
        boolean z11 = layoutAndValueBooleanCheckVisible10.isLayoutVisible;
        if (z11) {
            this.activityBeginSurvey.au.heater_flag++;
        }
        if (z11 && layoutAndValueBooleanCheckVisible10.isValueSame) {
            this.activityBeginSurvey.ap.heater_flag = 1;
        } else if (z11 && !layoutAndValueBooleanCheckVisible10.isValueSame) {
            this.activityBeginSurvey.ap.heater_flag = 0;
        }
        LinearLayout linearLayout9 = this.ll_washingMachine;
        ActivityBeginSurvey activityBeginSurvey12 = this.activityBeginSurvey;
        LayoutAndValueBoolean layoutAndValueBooleanCheckVisible11 = checkVisible(linearLayout9, activityBeginSurvey12.aG.washing_machine, activityBeginSurvey12.ap.washing_machine);
        boolean z12 = layoutAndValueBooleanCheckVisible11.isLayoutVisible;
        if (z12) {
            this.activityBeginSurvey.au.washing_machine_flag++;
        }
        if (z12 && layoutAndValueBooleanCheckVisible11.isValueSame) {
            this.activityBeginSurvey.ap.washing_machine_flag = 1;
        } else if (z12 && !layoutAndValueBooleanCheckVisible11.isValueSame) {
            this.activityBeginSurvey.ap.washing_machine_flag = 0;
        }
        LinearLayout linearLayout10 = this.ll_geyser;
        ActivityBeginSurvey activityBeginSurvey13 = this.activityBeginSurvey;
        LayoutAndValueBoolean layoutAndValueBooleanCheckVisible12 = checkVisible(linearLayout10, activityBeginSurvey13.aG.geyser, activityBeginSurvey13.ap.geyser);
        boolean z13 = layoutAndValueBooleanCheckVisible12.isLayoutVisible;
        if (z13) {
            this.activityBeginSurvey.au.geyser_flag++;
        }
        if (z13 && layoutAndValueBooleanCheckVisible12.isValueSame) {
            this.activityBeginSurvey.ap.geyser_flag = 1;
        } else if (z13 && !layoutAndValueBooleanCheckVisible12.isValueSame) {
            this.activityBeginSurvey.A().geyser_flag = 0;
        }
        LinearLayout linearLayout11 = this.ll_airCooler;
        ActivityBeginSurvey activityBeginSurvey14 = this.activityBeginSurvey;
        LayoutAndValueBoolean layoutAndValueBooleanCheckVisible13 = checkVisible(linearLayout11, activityBeginSurvey14.aG.air_cooler, activityBeginSurvey14.ap.air_cooler);
        if (layoutAndValueBooleanCheckVisible13.isLayoutVisible) {
            int i18 = h + 121;
            e = i18 % 128;
            int i19 = i18 % 2;
            this.activityBeginSurvey.C().air_cooler_flag++;
        }
        boolean z14 = layoutAndValueBooleanCheckVisible13.isLayoutVisible;
        if (z14) {
            int i20 = h + 19;
            e = i20 % 128;
            if (i20 % 2 != 0) {
                int i21 = 11 / 0;
                if (layoutAndValueBooleanCheckVisible13.isValueSame) {
                    int i22 = e + 59;
                    h = i22 % 128;
                    int i23 = i22 % 2;
                    this.activityBeginSurvey.A().air_cooler_flag = 1;
                } else if (z14 && !layoutAndValueBooleanCheckVisible13.isValueSame) {
                    this.activityBeginSurvey.A().air_cooler_flag = 0;
                }
            } else if (layoutAndValueBooleanCheckVisible13.isValueSame) {
                int i24 = e + 59;
                h = i24 % 128;
                int i25 = i24 % 2;
                this.activityBeginSurvey.A().air_cooler_flag = 1;
            } else if (z14) {
                this.activityBeginSurvey.A().air_cooler_flag = 0;
            }
        } else if (z14) {
            this.activityBeginSurvey.A().air_cooler_flag = 0;
        }
        LayoutAndValueBoolean layoutAndValueBooleanCheckVisible14 = checkVisible(this.ll_airConditioner, this.activityBeginSurvey.z().air_conditioner, this.activityBeginSurvey.A().air_conditioner);
        if (layoutAndValueBooleanCheckVisible14.isLayoutVisible) {
            this.activityBeginSurvey.C().air_conditioner_flag++;
        }
        boolean z15 = layoutAndValueBooleanCheckVisible14.isLayoutVisible;
        if (z15 && layoutAndValueBooleanCheckVisible14.isValueSame) {
            this.activityBeginSurvey.A().air_conditioner_flag = 1;
        } else if (z15 && !layoutAndValueBooleanCheckVisible14.isValueSame) {
            this.activityBeginSurvey.A().air_conditioner_flag = 0;
        }
        LayoutAndValueBoolean layoutAndValueBooleanCheckVisible15 = checkVisible(this.ll_fan, this.activityBeginSurvey.z().fan, this.activityBeginSurvey.A().fan);
        if (!(!layoutAndValueBooleanCheckVisible15.isLayoutVisible)) {
            this.activityBeginSurvey.C().fan_flag++;
        }
        boolean z16 = layoutAndValueBooleanCheckVisible15.isLayoutVisible;
        if (z16 && layoutAndValueBooleanCheckVisible15.isValueSame) {
            this.activityBeginSurvey.A().fan_flag = 1;
        } else if (z16 && !layoutAndValueBooleanCheckVisible15.isValueSame) {
            this.activityBeginSurvey.A().fan_flag = 0;
        }
        LayoutAndValueBoolean layoutAndValueBooleanCheckVisible16 = checkVisible(this.ll_cookingRange, this.activityBeginSurvey.z().cooking_range, this.activityBeginSurvey.A().cooking_range);
        if (layoutAndValueBooleanCheckVisible16.isLayoutVisible) {
            this.activityBeginSurvey.C().cooking_range_flag++;
        }
        boolean z17 = layoutAndValueBooleanCheckVisible16.isLayoutVisible;
        if (z17 && layoutAndValueBooleanCheckVisible16.isValueSame) {
            this.activityBeginSurvey.A().cooking_range_flag = 1;
        } else if (z17 && (!layoutAndValueBooleanCheckVisible16.isValueSame)) {
            this.activityBeginSurvey.A().cooking_range_flag = 0;
        }
        LayoutAndValueBoolean layoutAndValueBooleanCheckVisible17 = checkVisible(this.ll_cookingStove, this.activityBeginSurvey.z().cooking_stove, this.activityBeginSurvey.A().cooking_stove);
        if (layoutAndValueBooleanCheckVisible17.isLayoutVisible) {
            this.activityBeginSurvey.C().cooking_stove_flag++;
        }
        boolean z18 = layoutAndValueBooleanCheckVisible17.isLayoutVisible;
        if (z18 && layoutAndValueBooleanCheckVisible17.isValueSame) {
            this.activityBeginSurvey.A().cooking_stove_flag = 1;
        } else if (z18 && !layoutAndValueBooleanCheckVisible17.isValueSame) {
            this.activityBeginSurvey.A().cooking_stove_flag = 0;
        }
        LayoutAndValueBoolean layoutAndValueBooleanCheckVisible18 = checkVisible(this.ll_tv, this.activityBeginSurvey.z().tv, this.activityBeginSurvey.A().tv);
        if (layoutAndValueBooleanCheckVisible18.isLayoutVisible) {
            this.activityBeginSurvey.C().tv_flag++;
        }
        boolean z19 = layoutAndValueBooleanCheckVisible18.isLayoutVisible;
        if (z19 && layoutAndValueBooleanCheckVisible18.isValueSame) {
            this.activityBeginSurvey.A().tv_flag = 1;
        } else if (z19 && !layoutAndValueBooleanCheckVisible18.isValueSame) {
            this.activityBeginSurvey.A().tv_flag = 0;
        }
        LayoutAndValueBoolean layoutAndValueBooleanCheckVisible19 = checkVisible(this.ll_vcr, this.activityBeginSurvey.z().vcr, this.activityBeginSurvey.A().vcr);
        if (layoutAndValueBooleanCheckVisible19.isLayoutVisible) {
            this.activityBeginSurvey.C().vcr_flag++;
        }
        boolean z20 = layoutAndValueBooleanCheckVisible19.isLayoutVisible;
        if (z20 && layoutAndValueBooleanCheckVisible19.isValueSame) {
            this.activityBeginSurvey.A().vcr_flag = 1;
        } else if (z20 && !layoutAndValueBooleanCheckVisible19.isValueSame) {
            this.activityBeginSurvey.A().vcr_flag = 0;
        }
        LayoutAndValueBoolean layoutAndValueBooleanCheckVisible20 = checkVisible(this.ll_refrigerator, this.activityBeginSurvey.z().refrigerator, this.activityBeginSurvey.A().refrigerator);
        if (layoutAndValueBooleanCheckVisible20.isLayoutVisible) {
            this.activityBeginSurvey.C().refrigerator_flag++;
        }
        boolean z21 = layoutAndValueBooleanCheckVisible20.isLayoutVisible;
        if (z21 && layoutAndValueBooleanCheckVisible20.isValueSame) {
            this.activityBeginSurvey.A().refrigerator_flag = 1;
        } else if (z21 && !layoutAndValueBooleanCheckVisible20.isValueSame) {
            this.activityBeginSurvey.A().refrigerator_flag = 0;
        }
        LayoutAndValueBoolean layoutAndValueBooleanCheckVisible21 = checkVisible(this.ll_freezer, this.activityBeginSurvey.z().freezer, this.activityBeginSurvey.A().freezer);
        if (layoutAndValueBooleanCheckVisible21.isLayoutVisible) {
            this.activityBeginSurvey.C().freezer_flag++;
        }
        boolean z22 = layoutAndValueBooleanCheckVisible21.isLayoutVisible;
        if (z22 && layoutAndValueBooleanCheckVisible21.isValueSame) {
            this.activityBeginSurvey.A().freezer_flag = 1;
        } else if (z22 && !layoutAndValueBooleanCheckVisible21.isValueSame) {
            this.activityBeginSurvey.A().freezer_flag = 0;
        }
        LayoutAndValueBoolean layoutAndValueBooleanCheckVisible22 = checkVisible(this.ll_generator, this.activityBeginSurvey.z().generator, this.activityBeginSurvey.A().generator);
        if (layoutAndValueBooleanCheckVisible22.isLayoutVisible) {
            this.activityBeginSurvey.C().generator_flag++;
        }
        boolean z23 = layoutAndValueBooleanCheckVisible22.isLayoutVisible;
        if (z23 && layoutAndValueBooleanCheckVisible22.isValueSame) {
            this.activityBeginSurvey.A().generator_flag = 1;
        } else if (z23 && !layoutAndValueBooleanCheckVisible22.isValueSame) {
            this.activityBeginSurvey.A().generator_flag = 0;
        }
        LayoutAndValueBoolean layoutAndValueBooleanCheckVisible23 = checkVisible(this.ll_sewing, this.activityBeginSurvey.z().sewing, this.activityBeginSurvey.A().sewing);
        if (layoutAndValueBooleanCheckVisible23.isLayoutVisible) {
            this.activityBeginSurvey.C().sewing_flag++;
        }
        boolean z24 = layoutAndValueBooleanCheckVisible23.isLayoutVisible;
        if (z24 && layoutAndValueBooleanCheckVisible23.isValueSame) {
            this.activityBeginSurvey.A().sewing_flag = 1;
        } else if (z24 && !layoutAndValueBooleanCheckVisible23.isValueSame) {
            this.activityBeginSurvey.A().sewing_flag = 0;
        }
        LayoutAndValueBoolean layoutAndValueBooleanCheckVisible24 = checkVisible(this.ll_computer, this.activityBeginSurvey.z().computer, this.activityBeginSurvey.A().computer);
        if (layoutAndValueBooleanCheckVisible24.isLayoutVisible) {
            this.activityBeginSurvey.C().computer_flag++;
        }
        boolean z25 = layoutAndValueBooleanCheckVisible24.isLayoutVisible;
        if (z25 && layoutAndValueBooleanCheckVisible24.isValueSame) {
            this.activityBeginSurvey.A().computer_flag = 1;
        } else if (z25 && !layoutAndValueBooleanCheckVisible24.isValueSame) {
            this.activityBeginSurvey.A().computer_flag = 0;
        }
        LayoutAndValueBoolean layoutAndValueBooleanCheckVisible25 = checkVisible(this.ll_motorcycle, this.activityBeginSurvey.z().motorcycle, this.activityBeginSurvey.A().motorcycle);
        if (layoutAndValueBooleanCheckVisible25.isLayoutVisible) {
            this.activityBeginSurvey.C().motorcycle_flag++;
        }
        boolean z26 = layoutAndValueBooleanCheckVisible25.isLayoutVisible;
        if (z26 && layoutAndValueBooleanCheckVisible25.isValueSame) {
            this.activityBeginSurvey.A().motorcycle_flag = 1;
        } else if (z26 && !layoutAndValueBooleanCheckVisible25.isValueSame) {
            this.activityBeginSurvey.A().motorcycle_flag = 0;
        }
        LayoutAndValueBoolean layoutAndValueBooleanCheckVisible26 = checkVisible(this.ll_tractor, this.activityBeginSurvey.z().tractor, this.activityBeginSurvey.A().tractor);
        if (layoutAndValueBooleanCheckVisible26.isLayoutVisible) {
            this.activityBeginSurvey.C().tractor_flag++;
        }
        boolean z27 = layoutAndValueBooleanCheckVisible26.isLayoutVisible;
        if (z27 && layoutAndValueBooleanCheckVisible26.isValueSame) {
            this.activityBeginSurvey.A().tractor_flag = 1;
        } else if (z27 && !layoutAndValueBooleanCheckVisible26.isValueSame) {
            this.activityBeginSurvey.A().tractor_flag = 0;
        }
        LayoutAndValueBoolean layoutAndValueBooleanCheckVisible27 = checkVisible(this.ll_car, this.activityBeginSurvey.z().car, this.activityBeginSurvey.A().car);
        if (layoutAndValueBooleanCheckVisible27.isLayoutVisible) {
            this.activityBeginSurvey.C().car_flag++;
        }
        boolean z28 = layoutAndValueBooleanCheckVisible27.isLayoutVisible;
        if (z28 && layoutAndValueBooleanCheckVisible27.isValueSame) {
            this.activityBeginSurvey.A().car_flag = 1;
        } else if (z28 && !layoutAndValueBooleanCheckVisible27.isValueSame) {
            this.activityBeginSurvey.A().car_flag = 0;
        }
        LayoutAndValueBoolean layoutAndValueBooleanCheckVisible28 = checkVisible(this.ll_mobile, this.activityBeginSurvey.z().mobile, this.activityBeginSurvey.A().mobile);
        if (layoutAndValueBooleanCheckVisible28.isLayoutVisible) {
            this.activityBeginSurvey.C().mobile_flag++;
        }
        boolean z29 = layoutAndValueBooleanCheckVisible28.isLayoutVisible;
        if (z29 && layoutAndValueBooleanCheckVisible28.isValueSame) {
            this.activityBeginSurvey.A().mobile_flag = 1;
        } else if (z29 && !layoutAndValueBooleanCheckVisible28.isValueSame) {
            this.activityBeginSurvey.A().mobile_flag = 0;
        }
        LayoutAndValueBoolean layoutAndValueBooleanCheckVisible29 = checkVisible(this.ll_internet, this.activityBeginSurvey.z().internet, this.activityBeginSurvey.A().internet);
        if (layoutAndValueBooleanCheckVisible29.isLayoutVisible) {
            this.activityBeginSurvey.C().internet_flag++;
        }
        boolean z30 = layoutAndValueBooleanCheckVisible29.isLayoutVisible;
        if (z30 && layoutAndValueBooleanCheckVisible29.isValueSame) {
            int i26 = e + 97;
            h = i26 % 128;
            int i27 = i26 % 2;
            this.activityBeginSurvey.A().internet_flag = 1;
        } else if (z30 && !layoutAndValueBooleanCheckVisible29.isValueSame) {
            this.activityBeginSurvey.A().internet_flag = 0;
        }
        LayoutAndValueBoolean layoutAndValueBooleanCheckVisible30 = checkVisible(this.ll_minternet, this.activityBeginSurvey.z().m_internet, this.activityBeginSurvey.A().m_internet);
        if (layoutAndValueBooleanCheckVisible30.isLayoutVisible) {
            this.activityBeginSurvey.C().m_internet_flag++;
        }
        boolean z31 = layoutAndValueBooleanCheckVisible30.isLayoutVisible;
        if (z31 && layoutAndValueBooleanCheckVisible30.isValueSame) {
            this.activityBeginSurvey.A().m_internet_flag = 1;
        } else if (z31 && !layoutAndValueBooleanCheckVisible30.isValueSame) {
            this.activityBeginSurvey.A().m_internet_flag = 0;
        }
        double d = (this.houseHoldPercentage / this.totalCount) * 80.0d;
        this.houseHoldPercentage = d;
        updateDividerPercentage(1, d);
    }

    private void setDummyData() {
        int i = 2 % 2;
        int i2 = e + 55;
        h = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(-TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0), (char) TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0), TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0) + 18, objArr);
        String strIntern = ((String) objArr[0]).intern();
        this.sp_occupancy_status.setSelection(1);
        this.sp_wall_material.setSelection(1);
        this.sp_cooking_fuel.setSelection(1);
        this.sp_roof_material.setSelection(1);
        this.sp_toilet.setSelection(1);
        this.sp_drinking_water.setSelection(1);
        this.sp_electricity.setSelection(1);
        this.sp_gas.setSelection(1);
        this.sp_landline.setSelection(1);
        this.sp_unit.setSelection(1);
        this.spinnerNumberOfRooms.setSelection(0);
        this.editTextbuffalo.setText(strIntern);
        this.editTextcow.setText(strIntern);
        this.editTexthorse.setText(strIntern);
        this.editTextcamel.setText(strIntern);
        this.editTextgoat.setText(strIntern);
        this.editTextNumber.setText(strIntern);
        this.totalLandSpinner.setSelection(0);
        this.agricultureLanSpinner.setSelection(0);
        ((RadioButton) this.rg_animal.getChildAt(1)).setChecked(true);
        ((RadioButton) this.rg_holdAgriculturalLand.getChildAt(1)).setChecked(true);
        ((RadioButton) this.rg_heater.getChildAt(1)).setChecked(true);
        ((RadioButton) this.rg_washingMachine.getChildAt(1)).setChecked(true);
        ((RadioButton) this.rg_geyser.getChildAt(1)).setChecked(true);
        ((RadioButton) this.rg_airCooler.getChildAt(1)).setChecked(true);
        ((RadioButton) this.rg_airConditioner.getChildAt(1)).setChecked(true);
        ((RadioButton) this.rg_fan.getChildAt(1)).setChecked(true);
        ((RadioButton) this.rg_cookingRange.getChildAt(1)).setChecked(true);
        ((RadioButton) this.rg_cookingStove.getChildAt(1)).setChecked(true);
        ((RadioButton) this.rg_tv.getChildAt(1)).setChecked(true);
        ((RadioButton) this.rg_vcr.getChildAt(1)).setChecked(true);
        ((RadioButton) this.rg_refrigerator.getChildAt(1)).setChecked(true);
        ((RadioButton) this.rg_freezer.getChildAt(1)).setChecked(true);
        ((RadioButton) this.rg_generator.getChildAt(1)).setChecked(true);
        ((RadioButton) this.rg_car.getChildAt(1)).setChecked(true);
        ((RadioButton) this.rg_mobile.getChildAt(1)).setChecked(true);
        ((RadioButton) this.rg_tractor.getChildAt(1)).setChecked(true);
        ((RadioButton) this.rg_motorcycle.getChildAt(1)).setChecked(true);
        ((RadioButton) this.rg_internet.getChildAt(1)).setChecked(true);
        ((RadioButton) this.rg_minternet.getChildAt(1)).setChecked(true);
        ((RadioButton) this.rg_computer.getChildAt(1)).setChecked(true);
        ((RadioButton) this.rg_sewing.getChildAt(1)).setChecked(true);
        ((RadioButton) this.rg_house_structure.getChildAt(1)).setChecked(true);
        int i4 = e + 49;
        h = i4 % 128;
        int i5 = i4 % 2;
    }

    private void parseEnumObj() {
        int i = 2 % 2;
        int i2 = e + 73;
        h = i2 % 128;
        if (i2 % 2 == 0) {
            this.sp_occupancy_status.getSelectedItemPosition();
            throw null;
        }
        if (this.sp_occupancy_status.getSelectedItemPosition() != 0) {
            this.activityBeginSurvey.aG.occupacy_status_code = this.occupancyStatusList.get(this.sp_occupancy_status.getSelectedItemPosition()).getOptionId();
        }
        this.activityBeginSurvey.aG.occupacy_status = this.occupancyStatusList.get(this.sp_occupancy_status.getSelectedItemPosition()).getOption();
        if (this.sp_wall_material.getSelectedItemPosition() != 0) {
            this.activityBeginSurvey.aG.wall_material_code = this.wallMaterialList.get(this.sp_wall_material.getSelectedItemPosition()).getOptionId();
        }
        this.activityBeginSurvey.aG.wall_material_status = this.wallMaterialList.get(this.sp_wall_material.getSelectedItemPosition()).getOption();
        if (this.sp_roof_material.getSelectedItemPosition() != 0) {
            this.activityBeginSurvey.aG.roof_material_code = this.roofMaterialList.get(this.sp_roof_material.getSelectedItemPosition()).getOptionId();
        }
        this.activityBeginSurvey.aG.roof_material_status = this.roofMaterialList.get(this.sp_roof_material.getSelectedItemPosition()).getOption();
        if (this.sp_cooking_fuel.getSelectedItemPosition() != 0) {
            this.activityBeginSurvey.aG.cooking_fuel_code = this.cookingFuelList.get(this.sp_cooking_fuel.getSelectedItemPosition()).getOptionId();
        }
        this.activityBeginSurvey.aG.cooking_fuel_status = this.cookingFuelList.get(this.sp_cooking_fuel.getSelectedItemPosition()).getOption();
        if (this.sp_toilet.getSelectedItemPosition() != 0) {
            int i3 = h + 111;
            e = i3 % 128;
            int i4 = i3 % 2;
            this.activityBeginSurvey.aG.toilet_code = this.toiletList.get(this.sp_toilet.getSelectedItemPosition()).getOptionId();
        }
        this.activityBeginSurvey.aG.toilet_status = this.toiletList.get(this.sp_toilet.getSelectedItemPosition()).getOption();
        if (this.sp_drinking_water.getSelectedItemPosition() != 0) {
            this.activityBeginSurvey.aG.drinking_water_code = this.drinkingWaterList.get(this.sp_drinking_water.getSelectedItemPosition()).getOptionId();
        }
        this.activityBeginSurvey.aG.drinking_water_status = this.drinkingWaterList.get(this.sp_drinking_water.getSelectedItemPosition()).getOption();
        if (this.sp_electricity.getSelectedItemPosition() != 0) {
            int i5 = e + 13;
            h = i5 % 128;
            if (i5 % 2 == 0) {
                this.activityBeginSurvey.aG.electricity_code = this.electricityList.get(this.sp_electricity.getSelectedItemPosition()).getOptionId();
                throw null;
            }
            this.activityBeginSurvey.aG.electricity_code = this.electricityList.get(this.sp_electricity.getSelectedItemPosition()).getOptionId();
        }
        this.activityBeginSurvey.aG.electricity_status = this.electricityList.get(this.sp_electricity.getSelectedItemPosition()).getOption();
        if (this.sp_gas.getSelectedItemPosition() != 0) {
            this.activityBeginSurvey.aG.gas_code = this.gasList.get(this.sp_gas.getSelectedItemPosition()).getOptionId();
        }
        this.activityBeginSurvey.aG.gas_status = this.gasList.get(this.sp_gas.getSelectedItemPosition()).getOption();
        if (this.sp_landline.getSelectedItemPosition() != 0) {
            this.activityBeginSurvey.aG.landline_code = this.landlineList.get(this.sp_landline.getSelectedItemPosition()).getOptionId();
        }
        this.activityBeginSurvey.aG.landline_status = this.landlineList.get(this.sp_landline.getSelectedItemPosition()).getOption();
        if (this.sp_unit.getSelectedItemPosition() != 0) {
            this.activityBeginSurvey.aG.land_unit_code = this.unitList.get(this.sp_unit.getSelectedItemPosition()).getOptionId();
            this.activityBeginSurvey.aG.land_unit_status = this.unitList.get(this.sp_unit.getSelectedItemPosition()).getOption();
            String string = this.totalLandSpinner.getSelectedItem().toString();
            Object[] objArr = new Object[1];
            a(4 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0'), (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 26128), 12 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr);
            if (string.equals(((String) objArr[0]).intern())) {
                this.activityBeginSurvey.aG.land_number = getEditTextValuesIfEmpty(this.editTextNumber);
            } else {
                int i6 = e + 85;
                h = i6 % 128;
                if (i6 % 2 == 0) {
                    this.activityBeginSurvey.aG.land_number = ivas.gov.bisp.enumeration.p091n.j.h(this.totalLandSpinner);
                    int i7 = 79 / 0;
                } else {
                    this.activityBeginSurvey.aG.land_number = ivas.gov.bisp.enumeration.p091n.j.h(this.totalLandSpinner);
                }
            }
        }
        this.activityBeginSurvey.aG.animal = z.i(this.rg_animal);
        this.activityBeginSurvey.aG.number_of_rooms = ivas.gov.bisp.enumeration.p091n.j.h(this.spinnerNumberOfRooms);
        this.activityBeginSurvey.aG.buffalo = getEditTextValuesIfEmpty(this.editTextbuffalo);
        this.activityBeginSurvey.aG.cow = getEditTextValuesIfEmpty(this.editTextcow);
        this.activityBeginSurvey.aG.horse = getEditTextValuesIfEmpty(this.editTexthorse);
        this.activityBeginSurvey.aG.camel = getEditTextValuesIfEmpty(this.editTextcamel);
        this.activityBeginSurvey.aG.goat = getEditTextValuesIfEmpty(this.editTextgoat);
        this.activityBeginSurvey.aG.household_agriculture_land = z.i(this.rg_holdAgriculturalLand);
        this.activityBeginSurvey.aG.heater = z.i(this.rg_heater);
        this.activityBeginSurvey.aG.washing_machine = z.i(this.rg_washingMachine);
        this.activityBeginSurvey.aG.geyser = z.i(this.rg_geyser);
        this.activityBeginSurvey.aG.air_cooler = z.i(this.rg_airCooler);
        this.activityBeginSurvey.aG.air_conditioner = z.i(this.rg_airConditioner);
        this.activityBeginSurvey.aG.fan = z.i(this.rg_fan);
        this.activityBeginSurvey.aG.cooking_range = z.i(this.rg_cookingRange);
        this.activityBeginSurvey.aG.cooking_stove = z.i(this.rg_cookingStove);
        this.activityBeginSurvey.aG.tv = z.i(this.rg_tv);
        this.activityBeginSurvey.aG.vcr = z.i(this.rg_vcr);
        this.activityBeginSurvey.aG.refrigerator = z.i(this.rg_refrigerator);
        this.activityBeginSurvey.aG.freezer = z.i(this.rg_freezer);
        this.activityBeginSurvey.aG.generator = z.i(this.rg_generator);
        this.activityBeginSurvey.aG.sewing = z.i(this.rg_sewing);
        this.activityBeginSurvey.aG.computer = z.i(this.rg_computer);
        this.activityBeginSurvey.aG.car = z.i(this.rg_car);
        this.activityBeginSurvey.aG.motorcycle = z.i(this.rg_motorcycle);
        this.activityBeginSurvey.aG.tractor = z.i(this.rg_tractor);
        this.activityBeginSurvey.aG.mobile = z.i(this.rg_mobile);
        this.activityBeginSurvey.aG.internet = z.i(this.rg_internet);
        this.activityBeginSurvey.aG.m_internet = z.i(this.rg_minternet);
    }

    /* JADX WARN: Code duplicated, block: B:64:0x032c  */
    /* JADX WARN: Code duplicated, block: B:66:0x0338  */
    /* JADX WARN: Code duplicated, block: B:75:0x0358  */
    public boolean isEnumFormValid() {
        String strM;
        int i;
        int i2 = 2 % 2;
        Object[] objArr = new Object[1];
        a(12 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (8127 - (KeyEvent.getMaxKeyCode() >> 16)), (-16776651) - Color.rgb(0, 0, 0), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a((ViewConfiguration.getWindowTouchSlop() >> 8) + 62, (char) View.MeasureSpec.getSize(0), 578 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr2);
        String strIntern2 = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a(6 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 26128), 11 - ExpandableListView.getPackedPositionChild(0L), objArr3);
        String strIntern3 = ((String) objArr3[0]).intern();
        if (this.sp_occupancy_status.getSelectedItemPosition() == 0) {
            Activity activity = getActivity();
            Spinner spinner = this.sp_occupancy_status;
            Object[] objArr4 = new Object[1];
            a(TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0) + 16, (char) (TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0) + 33799), 32 - View.getDefaultSize(0, 0), objArr4);
            z.o(activity, spinner, ((String) objArr4[0]).intern());
            return false;
        }
        if (this.sp_wall_material.getSelectedItemPosition() == 0) {
            Activity activity2 = getActivity();
            Spinner spinner2 = this.sp_wall_material;
            Object[] objArr5 = new Object[1];
            a(13 - Drawable.resolveOpacity(0, 0), (char) View.resolveSizeAndState(0, 0, 0), 48 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr5);
            z.o(activity2, spinner2, ((String) objArr5[0]).intern());
            return false;
        }
        if (this.sp_roof_material.getSelectedItemPosition() == 0) {
            int i3 = h + 119;
            e = i3 % 128;
            int i4 = i3 % 2;
            Activity activity3 = getActivity();
            Spinner spinner3 = this.sp_roof_material;
            Object[] objArr6 = new Object[1];
            a(13 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) View.getDefaultSize(0, 0), Color.red(0) + 61, objArr6);
            z.o(activity3, spinner3, ((String) objArr6[0]).intern());
            return false;
        }
        if (this.spinnerNumberOfRooms.getSelectedItemPosition() == 0) {
            Activity activity4 = getActivity();
            Spinner spinner4 = this.spinnerNumberOfRooms;
            Object[] objArr7 = new Object[1];
            a(Gravity.getAbsoluteGravity(0, 0) + 36, (char) (TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0) + 50707), 74 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr7);
            z.o(activity4, spinner4, ((String) objArr7[0]).intern());
            return false;
        }
        if (this.sp_cooking_fuel.getSelectedItemPosition() == 0) {
            Activity activity5 = getActivity();
            Spinner spinner5 = this.sp_cooking_fuel;
            Object[] objArr8 = new Object[1];
            a(12 - (ViewConfiguration.getEdgeSlop() >> 16), (char) View.MeasureSpec.makeMeasureSpec(0, 0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 109, objArr8);
            z.o(activity5, spinner5, ((String) objArr8[0]).intern());
            return false;
        }
        if (this.sp_toilet.getSelectedItemPosition() == 0) {
            Activity activity6 = getActivity();
            Spinner spinner6 = this.sp_toilet;
            Object[] objArr9 = new Object[1];
            a(Color.argb(0, 0, 0, 0) + 6, (char) (30807 - KeyEvent.keyCodeFromString(BuildConfig.FLAVOR)), 122 - ExpandableListView.getPackedPositionType(0L), objArr9);
            z.o(activity6, spinner6, ((String) objArr9[0]).intern());
            return false;
        }
        if (this.sp_drinking_water.getSelectedItemPosition() == 0) {
            Activity activity7 = getActivity();
            Spinner spinner7 = this.sp_drinking_water;
            Object[] objArr10 = new Object[1];
            a((Process.myTid() >> 22) + 14, (char) (16049 - Process.getGidForName(BuildConfig.FLAVOR)), 128 - Color.red(0), objArr10);
            z.o(activity7, spinner7, ((String) objArr10[0]).intern());
            return false;
        }
        if (this.sp_electricity.getSelectedItemPosition() == 0) {
            Activity activity8 = getActivity();
            Spinner spinner8 = this.sp_electricity;
            Object[] objArr11 = new Object[1];
            a(11 - Gravity.getAbsoluteGravity(0, 0), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 141 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0), objArr11);
            z.o(activity8, spinner8, ((String) objArr11[0]).intern());
            return false;
        }
        final String strM2 = ivas.gov.bisp.enumeration.p091n.j.m(this.elec_et);
        this.newMeterNo = strM2;
        if (this.sp_electricity.getSelectedItemPosition() == 1 || this.sp_electricity.getSelectedItemPosition() == 2) {
            if (!strM2.isEmpty() && strM2.length() != 5 && strM2.length() != 14 && strM2.length() != 18) {
                Activity activity9 = getActivity();
                Object[] objArr12 = new Object[1];
                a((Process.myTid() >> 22) + 78, (char) (39391 - Color.red(0)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 154, objArr12);
                Toast.makeText(activity9, ((String) objArr12[0]).intern(), 0).show();
                return false;
            }
            this.isValidElectricityMeter = this.newMeterNo.equals(this.oldMeterNo);
            if ((strM2.length() == 14 || strM2.length() == 18) && !this.isValidElectricityMeter) {
                SessionManager sessionManager = new SessionManager(getActivity());
                String strR = sessionManager.r();
                BISPApplication bISPApplication = this.bispApplication;
                Activity activity10 = getActivity();
                sessionManager.o();
                sessionManager.q();
                sessionManager.g();
                sessionManager.i();
                sessionManager.x();
                sessionManager.w();
                sessionManager.x();
                sessionManager.e();
                bISPApplication.S(activity10, strR, strM2, new ivas.gov.bisp.enumeration.W.z() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentHouseholdInfo.13
                    private static int a = 0;
                    private static int b = 1;

                    @Override // ivas.gov.bisp.enumeration.W.z
                    public void failureCall() {
                        int i5 = 2 % 2;
                        int i6 = b;
                        int i7 = i6 & 17;
                        int i8 = -(-((i6 ^ 17) | i7));
                        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
                        a = i9 % 128;
                        int i10 = i9 % 2;
                        FragmentHouseholdInfo.this.isValidElectricityMeter = false;
                    }

                    @Override // ivas.gov.bisp.enumeration.W.z
                    public void successCall() {
                        FragmentHouseholdInfo fragmentHouseholdInfo;
                        int i5 = 2 % 2;
                        int i6 = b;
                        int i7 = i6 ^ 87;
                        int i8 = ((i6 & 87) | i7) << 1;
                        int i9 = -i7;
                        int i10 = (i8 & i9) + (i8 | i9);
                        a = i10 % 128;
                        if (i10 % 2 != 0) {
                            fragmentHouseholdInfo = FragmentHouseholdInfo.this;
                            fragmentHouseholdInfo.isValidElectricityMeter = false;
                        } else {
                            fragmentHouseholdInfo = FragmentHouseholdInfo.this;
                            fragmentHouseholdInfo.isValidElectricityMeter = true;
                        }
                        fragmentHouseholdInfo.oldMeterNo = strM2;
                        fragmentHouseholdInfo.isEnumFormValid();
                        int i11 = a;
                        int i12 = i11 & 43;
                        int i13 = (i11 ^ 43) | i12;
                        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
                        int i15 = i14 % 128;
                        b = i15;
                        if (i14 % 2 == 0) {
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        int i16 = i15 & 111;
                        int i17 = -(-((i15 ^ 111) | i16));
                        int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
                        a = i18 % 128;
                        int i19 = i18 % 2;
                    }
                });
                return false;
            }
        }
        if (this.sp_gas.getSelectedItemPosition() == 0) {
            Activity activity11 = getActivity();
            Spinner spinner9 = this.sp_gas;
            Object[] objArr13 = new Object[1];
            a(MotionEvent.axisFromString(BuildConfig.FLAVOR) + 4, (char) (29139 - ((Process.getThreadPriority(0) + 20) >> 6)), AndroidCharacter.getMirror('0') + 183, objArr13);
            z.o(activity11, spinner9, ((String) objArr13[0]).intern());
            return false;
        }
        if (this.sp_gas.getSelectedItemPosition() != 1) {
            int i5 = e + 69;
            h = i5 % 128;
            int i6 = i5 % 2;
            if (this.sp_gas.getSelectedItemPosition() == 2) {
                strM = ivas.gov.bisp.enumeration.p091n.j.m(this.gas_et);
                if (!strM.isEmpty()) {
                    i = e + 85;
                    h = i % 128;
                    if (i % 2 == 0 ? strM.length() != 10 : strM.length() != 22) {
                        if (strM.length() != 11) {
                            Activity activity12 = getActivity();
                            Object[] objArr14 = new Object[1];
                            a(Color.red(0) + 81, (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (Process.myPid() >> 22) + 234, objArr14);
                            Toast.makeText(activity12, ((String) objArr14[0]).intern(), 0).show();
                            return false;
                        }
                    }
                }
            }
        } else {
            strM = ivas.gov.bisp.enumeration.p091n.j.m(this.gas_et);
            if (!strM.isEmpty()) {
                i = e + 85;
                h = i % 128;
                if (i % 2 == 0) {
                    if (strM.length() != 11) {
                        Activity activity13 = getActivity();
                        Object[] objArr15 = new Object[1];
                        a(Color.red(0) + 81, (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (Process.myPid() >> 22) + 234, objArr15);
                        Toast.makeText(activity13, ((String) objArr15[0]).intern(), 0).show();
                        return false;
                    }
                } else if (strM.length() != 11) {
                    Activity activity14 = getActivity();
                    Object[] objArr16 = new Object[1];
                    a(Color.red(0) + 81, (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (Process.myPid() >> 22) + 234, objArr16);
                    Toast.makeText(activity14, ((String) objArr16[0]).intern(), 0).show();
                    return false;
                }
            }
        }
        if (this.sp_landline.getSelectedItemPosition() == 0) {
            Activity activity15 = getActivity();
            Spinner spinner10 = this.sp_landline;
            Object[] objArr17 = new Object[1];
            a((ViewConfiguration.getPressedStateDuration() >> 16) + 8, (char) (35529 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 315 - (ViewConfiguration.getTapTimeout() >> 16), objArr17);
            z.o(activity15, spinner10, ((String) objArr17[0]).intern());
            return false;
        }
        Activity activity16 = getActivity();
        RadioGroup radioGroup = this.rg_animal;
        Object[] objArr18 = new Object[1];
        a((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 5, (char) (29239 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), ((Process.getThreadPriority(0) + 20) >> 6) + 323, objArr18);
        if (!z.m(activity16, radioGroup, ((String) objArr18[0]).intern())) {
            return false;
        }
        if (this.rg_animal.getCheckedRadioButtonId() == this.rg_animal.getChildAt(0).getId()) {
            if (ivas.gov.bisp.enumeration.p091n.j.E(this.editTextbuffalo, BuildConfig.FLAVOR)) {
                Activity activity17 = getActivity();
                EditText editText = this.editTextbuffalo;
                Object[] objArr19 = new Object[1];
                a(7 - Color.green(0), (char) TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR), TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR) + 329, objArr19);
                z.k(activity17, editText, ((String) objArr19[0]).intern());
                return false;
            }
            if (ivas.gov.bisp.enumeration.p091n.j.E(this.editTextcow, BuildConfig.FLAVOR)) {
                Activity activity18 = getActivity();
                EditText editText2 = this.editTextcow;
                Object[] objArr20 = new Object[1];
                a((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 9, (char) (((Process.getThreadPriority(0) + 20) >> 6) + 44382), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 335, objArr20);
                z.k(activity18, editText2, ((String) objArr20[0]).intern());
                return false;
            }
            if (ivas.gov.bisp.enumeration.p091n.j.E(this.editTexthorse, BuildConfig.FLAVOR)) {
                Activity activity19 = getActivity();
                EditText editText3 = this.editTexthorse;
                Object[] objArr21 = new Object[1];
                a(17 - (Process.myTid() >> 22), (char) TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0), 345 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0), objArr21);
                z.k(activity19, editText3, ((String) objArr21[0]).intern());
                return false;
            }
            if (ivas.gov.bisp.enumeration.p091n.j.E(this.editTextcamel, BuildConfig.FLAVOR)) {
                Activity activity20 = getActivity();
                EditText editText4 = this.editTextcamel;
                Object[] objArr22 = new Object[1];
                a('5' - AndroidCharacter.getMirror('0'), (char) (57451 - Gravity.getAbsoluteGravity(0, 0)), TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0) + 363, objArr22);
                z.k(activity20, editText4, ((String) objArr22[0]).intern());
                return false;
            }
            if (ivas.gov.bisp.enumeration.p091n.j.E(this.editTextgoat, BuildConfig.FLAVOR)) {
                Activity activity21 = getActivity();
                EditText editText5 = this.editTextgoat;
                Object[] objArr23 = new Object[1];
                a(TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0) + 10, (char) (ViewConfiguration.getTouchSlop() >> 8), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 368, objArr23);
                z.k(activity21, editText5, ((String) objArr23[0]).intern());
                return false;
            }
        }
        Activity activity22 = getActivity();
        RadioGroup radioGroup2 = this.rg_holdAgriculturalLand;
        Object[] objArr24 = new Object[1];
        a(KeyEvent.keyCodeFromString(BuildConfig.FLAVOR) + 17, (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 44412), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 379, objArr24);
        if (!z.m(activity22, radioGroup2, ((String) objArr24[0]).intern())) {
            return false;
        }
        if (this.rg_holdAgriculturalLand.getCheckedRadioButtonId() == this.rg_holdAgriculturalLand.getChildAt(0).getId()) {
            if (this.sp_unit.getSelectedItemPosition() == 0) {
                Activity activity23 = getActivity();
                Spinner spinner11 = this.sp_unit;
                Object[] objArr25 = new Object[1];
                a(View.resolveSize(0, 0) + 22, (char) TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0), 395 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr25);
                z.o(activity23, spinner11, ((String) objArr25[0]).intern());
                return false;
            }
            if (this.totalLandSpinner.getSelectedItemPosition() == 0) {
                Activity activity24 = getActivity();
                Spinner spinner12 = this.totalLandSpinner;
                Object[] objArr26 = new Object[1];
                a((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22, (char) (28259 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0)), TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR) + 417, objArr26);
                z.o(activity24, spinner12, ((String) objArr26[0]).intern());
                return false;
            }
            if (this.totalLandSpinner.getSelectedItem().toString().equals(strIntern3)) {
                if (TextUtils.isEmpty(this.editTextNumber.getText().toString().trim())) {
                    Activity activity25 = getActivity();
                    EditText editText6 = this.editTextNumber;
                    Object[] objArr27 = new Object[1];
                    a(View.resolveSizeAndState(0, 0, 0) + 22, (char) (28260 - Color.blue(0)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 417, objArr27);
                    z.k(activity25, editText6, ((String) objArr27[0]).intern());
                    return false;
                }
                if (ivas.gov.bisp.enumeration.p091n.j.E(this.editTextNumber, BuildConfig.FLAVOR)) {
                    Activity activity26 = getActivity();
                    EditText editText7 = this.editTextNumber;
                    Object[] objArr28 = new Object[1];
                    a(21 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0), (char) (28260 - (ViewConfiguration.getTouchSlop() >> 8)), 417 - KeyEvent.getDeadChar(0, 0), objArr28);
                    z.k(activity26, editText7, ((String) objArr28[0]).intern());
                    return false;
                }
                if (Integer.parseInt(this.editTextNumber.getText().toString().trim()) <= 0) {
                    Activity activity27 = getActivity();
                    EditText editText8 = this.editTextNumber;
                    Object[] objArr29 = new Object[1];
                    a(29 - View.resolveSize(0, 0), (char) (Process.myPid() >> 22), 439 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr29);
                    z.k(activity27, editText8, ((String) objArr29[0]).intern());
                    return false;
                }
            }
            if (this.sp_unit_agri.getSelectedItemPosition() == 0) {
                Activity activity28 = getActivity();
                Spinner spinner13 = this.sp_unit_agri;
                Object[] objArr30 = new Object[1];
                a(((Process.getThreadPriority(0) + 20) >> 6) + 34, (char) (TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0) + 33572), 468 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr30);
                z.o(activity28, spinner13, ((String) objArr30[0]).intern());
                return false;
            }
            if (this.agricultureLanSpinner.getSelectedItemPosition() == 0) {
                Activity activity29 = getActivity();
                Spinner spinner14 = this.agricultureLanSpinner;
                Object[] objArr31 = new Object[1];
                a(TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0) + 29, (char) (14491 - (ViewConfiguration.getLongPressTimeout() >> 16)), 503 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr31);
                z.o(activity29, spinner14, ((String) objArr31[0]).intern());
                return false;
            }
            if (this.agricultureLanSpinner.getSelectedItem().toString().equals(strIntern3)) {
                int i7 = e + 3;
                h = i7 % 128;
                if (i7 % 2 == 0) {
                    TextUtils.isEmpty(this.et_number_agri.getText().toString().trim());
                    throw null;
                }
                if (TextUtils.isEmpty(this.et_number_agri.getText().toString().trim())) {
                    Activity activity30 = getActivity();
                    EditText editText9 = this.et_number_agri;
                    Object[] objArr32 = new Object[1];
                    a(29 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (14491 - TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 502, objArr32);
                    z.k(activity30, editText9, ((String) objArr32[0]).intern());
                    return false;
                }
                if (ivas.gov.bisp.enumeration.p091n.j.E(this.et_number_agri, BuildConfig.FLAVOR)) {
                    Activity activity31 = getActivity();
                    EditText editText10 = this.et_number_agri;
                    Object[] objArr33 = new Object[1];
                    a(ExpandableListView.getPackedPositionChild(0L) + 29, (char) (14491 - Color.green(0)), View.MeasureSpec.getSize(0) + 502, objArr33);
                    z.k(activity31, editText10, ((String) objArr33[0]).intern());
                    return false;
                }
                if (Integer.parseInt(this.et_number_agri.getText().toString().trim()) <= 0) {
                    Activity activity32 = getActivity();
                    EditText editText11 = this.et_number_agri;
                    Object[] objArr34 = new Object[1];
                    a(View.MeasureSpec.getSize(0) + 35, (char) (TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0') + 1), Color.alpha(0) + 530, objArr34);
                    z.k(activity32, editText11, ((String) objArr34[0]).intern());
                    return false;
                }
            }
            if (this.sp_unit.getSelectedItemPosition() != 0 && this.totalLandSpinner.getSelectedItemPosition() != 0 && this.totalLandSpinner.getSelectedItem().toString().equals(strIntern3) && !this.isTotalLandValidation && !TextUtils.isEmpty(this.editTextNumber.getText().toString()) && this.sp_unit.getSelectedItemPosition() > 0) {
                int optionId = this.unitList.get(this.sp_unit.getSelectedItemPosition()).getOptionId();
                int iG = ivas.gov.bisp.enumeration.p091n.j.g(this.editTextNumber);
                EditText editText12 = this.editTextNumber;
                if (optionId == 115) {
                    if (iG == 20 || iG == 40 || iG == 80 || iG == GAS_SCANNER) {
                        Object[] objArr35 = new Object[1];
                        a(AndroidCharacter.getMirror('0') + '%', (char) (50120 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 639 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr35);
                        showAlertDialog(strIntern, ((String) objArr35[0]).intern(), this.totalLandSpinner, true, editText12);
                        return false;
                    }
                    if (iG > GAS_SCANNER) {
                        showAlertDialog(strIntern, strIntern2, this.totalLandSpinner, false, editText12);
                        return false;
                    }
                } else if (optionId == 116) {
                    if (iG == 4 || iG == 8 || iG == 12 || iG == 16 || iG == 20 || iG == 24 || iG == 28 || iG == 32 || iG == 36 || iG == 40) {
                        Object[] objArr36 = new Object[1];
                        a(84 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0'), (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 50119), 640 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr36);
                        showAlertDialog(strIntern, ((String) objArr36[0]).intern(), this.totalLandSpinner, true, editText12);
                        return false;
                    }
                    if (iG > 40) {
                        showAlertDialog(strIntern, strIntern2, this.totalLandSpinner, false, editText12);
                        return false;
                    }
                } else if (optionId == 117) {
                    if (iG == 25 || iG == 50 || iG == 75 || iG == GAS_SCANNER) {
                        Object[] objArr37 = new Object[1];
                        a(((Process.getThreadPriority(0) + 20) >> 6) + 85, (char) (KeyEvent.getDeadChar(0, 0) + 50119), 639 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr37);
                        showAlertDialog(strIntern, ((String) objArr37[0]).intern(), this.totalLandSpinner, true, editText12);
                        return false;
                    }
                    if (iG > 5) {
                        showAlertDialog(strIntern, strIntern2, this.totalLandSpinner, false, editText12);
                        return false;
                    }
                } else if (optionId == 210) {
                    if (iG == 2 || iG == 4 || iG == 6 || iG == 10) {
                        Object[] objArr38 = new Object[1];
                        a((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 85, (char) (50119 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 639, objArr38);
                        showAlertDialog(strIntern, ((String) objArr38[0]).intern(), this.totalLandSpinner, true, editText12);
                        return false;
                    }
                    if (iG > 10) {
                        showAlertDialog(strIntern, strIntern2, this.totalLandSpinner, false, editText12);
                        return false;
                    }
                } else if (optionId == 210 && iG > 1) {
                    showAlertDialog(strIntern, strIntern2, this.totalLandSpinner, false, editText12);
                    return false;
                }
            }
            if (this.sp_unit_agri.getSelectedItemPosition() != 0 && this.agricultureLanSpinner.getSelectedItemPosition() != 0 && this.agricultureLanSpinner.getSelectedItem().toString().equals(strIntern3) && !this.isAgricultureLandValidation && !TextUtils.isEmpty(this.et_number_agri.getText().toString()) && this.sp_unit_agri.getSelectedItemPosition() > 0) {
                int optionId2 = this.unitList.get(this.sp_unit_agri.getSelectedItemPosition()).getOptionId();
                int iG2 = ivas.gov.bisp.enumeration.p091n.j.g(this.et_number_agri);
                EditText editText13 = this.et_number_agri;
                if (optionId2 == 115) {
                    if (iG2 == 20 || iG2 == 40 || iG2 == 80 || iG2 == GAS_SCANNER) {
                        Object[] objArr39 = new Object[1];
                        a(88 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 38771), Color.rgb(0, 0, 0) + 16778004, objArr39);
                        showAlertDialog(strIntern, ((String) objArr39[0]).intern(), this.agricultureLanSpinner, true, editText13);
                        return false;
                    }
                    if (iG2 > GAS_SCANNER) {
                        int i8 = h + 123;
                        e = i8 % 128;
                        if (i8 % 2 != 0) {
                            Object[] objArr40 = new Object[1];
                            a(TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, (char) 5, 1) * 94, (char) (60373 - KeyEvent.normalizeMetaState(1)), 28727 >> View.MeasureSpec.getSize(1), objArr40);
                            showAlertDialog(strIntern, ((String) objArr40[0]).intern(), this.agricultureLanSpinner, false, editText13);
                            return false;
                        }
                        Object[] objArr41 = new Object[1];
                        a(TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0) + 65, (char) (KeyEvent.normalizeMetaState(0) + 60373), View.MeasureSpec.getSize(0) + 724, objArr41);
                        showAlertDialog(strIntern, ((String) objArr41[0]).intern(), this.agricultureLanSpinner, false, editText13);
                        return false;
                    }
                } else if (optionId2 == 116) {
                    int i9 = h + 111;
                    e = i9 % 128;
                    int i10 = i9 % 2;
                    if (iG2 == 4 || iG2 == 8 || iG2 == 12 || iG2 == 16 || iG2 == 20 || iG2 == 24 || iG2 == 28 || iG2 == 32 || iG2 == 36 || iG2 == 40) {
                        Object[] objArr42 = new Object[1];
                        a(87 - (ViewConfiguration.getTouchSlop() >> 8), (char) (38770 - (Process.myPid() >> 22)), Drawable.resolveOpacity(0, 0) + 788, objArr42);
                        showAlertDialog(strIntern, ((String) objArr42[0]).intern(), this.agricultureLanSpinner, true, editText13);
                        return false;
                    }
                    if (iG2 > 40) {
                        Object[] objArr43 = new Object[1];
                        a(64 - Color.red(0), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 875, objArr43);
                        showAlertDialog(strIntern, ((String) objArr43[0]).intern(), this.agricultureLanSpinner, false, editText13);
                        return false;
                    }
                } else if (optionId2 == 117) {
                    if (iG2 == 25 || iG2 == 50 || iG2 == 75 || iG2 == GAS_SCANNER) {
                        Object[] objArr44 = new Object[1];
                        a(TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR) + 87, (char) (38770 - TextUtils.getTrimmedLength(BuildConfig.FLAVOR)), KeyEvent.getDeadChar(0, 0) + 788, objArr44);
                        showAlertDialog(strIntern, ((String) objArr44[0]).intern(), this.agricultureLanSpinner, true, editText13);
                        return false;
                    }
                    if (iG2 > 5) {
                        Object[] objArr45 = new Object[1];
                        a(64 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 875 - (ViewConfiguration.getEdgeSlop() >> 16), objArr45);
                        showAlertDialog(strIntern, ((String) objArr45[0]).intern(), this.agricultureLanSpinner, false, editText13);
                        return false;
                    }
                } else if (optionId2 == 210) {
                    if (iG2 == 2 || iG2 == 4 || iG2 == 6 || iG2 == 10) {
                        Object[] objArr46 = new Object[1];
                        a((ViewConfiguration.getKeyRepeatDelay() >> 16) + 87, (char) (38770 - KeyEvent.getDeadChar(0, 0)), 788 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr46);
                        showAlertDialog(strIntern, ((String) objArr46[0]).intern(), this.agricultureLanSpinner, true, editText13);
                        return false;
                    }
                    if (iG2 > 10) {
                        Object[] objArr47 = new Object[1];
                        a((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 64, (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 875 - TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0), objArr47);
                        showAlertDialog(strIntern, ((String) objArr47[0]).intern(), this.agricultureLanSpinner, false, editText13);
                        return false;
                    }
                } else if (optionId2 == 210) {
                    int i11 = e + 79;
                    h = i11 % 128;
                    int i12 = i11 % 2;
                    if (iG2 > 1) {
                        Object[] objArr48 = new Object[1];
                        a(64 - KeyEvent.keyCodeFromString(BuildConfig.FLAVOR), (char) TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0), 876 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr48);
                        showAlertDialog(strIntern, ((String) objArr48[0]).intern(), this.agricultureLanSpinner, false, editText13);
                        return false;
                    }
                }
            }
            if (this.sp_unit_agri.getSelectedItemPosition() != 0 && this.agricultureLanSpinner.getSelectedItemPosition() != 0) {
                if (convertToMarla(this.agricultureLanSpinner.getSelectedItem().toString().equals(strIntern3) ? ivas.gov.bisp.enumeration.p091n.j.g(this.et_number_agri) : ivas.gov.bisp.enumeration.p091n.j.h(this.agricultureLanSpinner), this.sp_unit_agri) > convertToMarla(this.totalLandSpinner.getSelectedItem().toString().equals(strIntern3) ? ivas.gov.bisp.enumeration.p091n.j.g(this.editTextNumber) : ivas.gov.bisp.enumeration.p091n.j.h(this.totalLandSpinner), this.sp_unit)) {
                    Activity activity33 = getActivity();
                    Object[] objArr49 = new Object[1];
                    a(51 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) View.MeasureSpec.makeMeasureSpec(0, 0), 939 - View.combineMeasuredStates(0, 0), objArr49);
                    Toast.makeText(activity33, ((String) objArr49[0]).intern(), 1).show();
                    this.sp_unit_agri.requestFocus();
                    Activity activity34 = getActivity();
                    Object[] objArr50 = new Object[1];
                    a(TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0) + 12, (char) ((-1) - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0)), View.MeasureSpec.getMode(0), objArr50);
                    ((InputMethodManager) activity34.getSystemService(((String) objArr50[0]).intern())).showSoftInput(this.sp_unit_agri, 1);
                    return false;
                }
            }
        }
        Activity activity35 = getActivity();
        RadioGroup radioGroup3 = this.rg_heater;
        Object[] objArr51 = new Object[1];
        a((ViewConfiguration.getPressedStateDuration() >> 16) + 6, (char) (ViewConfiguration.getEdgeSlop() >> 16), 991 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr51);
        if (!z.m(activity35, radioGroup3, ((String) objArr51[0]).intern())) {
            return false;
        }
        Activity activity36 = getActivity();
        RadioGroup radioGroup4 = this.rg_washingMachine;
        Object[] objArr52 = new Object[1];
        a(20 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0), (char) (ViewConfiguration.getTouchSlop() >> 8), 996 - View.resolveSize(0, 0), objArr52);
        if (!z.m(activity36, radioGroup4, ((String) objArr52[0]).intern())) {
            return false;
        }
        Activity activity37 = getActivity();
        RadioGroup radioGroup5 = this.rg_geyser;
        Object[] objArr53 = new Object[1];
        a(20 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0) + 3867), (ViewConfiguration.getWindowTouchSlop() >> 8) + 1017, objArr53);
        if (!z.m(activity37, radioGroup5, ((String) objArr53[0]).intern())) {
            return false;
        }
        Activity activity38 = getActivity();
        RadioGroup radioGroup6 = this.rg_airCooler;
        Object[] objArr54 = new Object[1];
        a(10 - KeyEvent.keyCodeFromString(BuildConfig.FLAVOR), (char) KeyEvent.keyCodeFromString(BuildConfig.FLAVOR), 1037 - TextUtils.getTrimmedLength(BuildConfig.FLAVOR), objArr54);
        if (!z.m(activity38, radioGroup6, ((String) objArr54[0]).intern())) {
            return false;
        }
        Activity activity39 = getActivity();
        RadioGroup radioGroup7 = this.rg_airConditioner;
        Object[] objArr55 = new Object[1];
        a(TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0) + 16, (char) ExpandableListView.getPackedPositionType(0L), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1046, objArr55);
        if (!z.m(activity39, radioGroup7, ((String) objArr55[0]).intern())) {
            return false;
        }
        Activity activity40 = getActivity();
        RadioGroup radioGroup8 = this.rg_fan;
        Object[] objArr56 = new Object[1];
        a(ExpandableListView.getPackedPositionType(0L) + 37, (char) TextUtils.getTrimmedLength(BuildConfig.FLAVOR), (ViewConfiguration.getScrollBarSize() >> 8) + 1062, objArr56);
        if (!z.m(activity40, radioGroup8, ((String) objArr56[0]).intern())) {
            return false;
        }
        Activity activity41 = getActivity();
        RadioGroup radioGroup9 = this.rg_cookingRange;
        Object[] objArr57 = new Object[1];
        a(View.combineMeasuredStates(0, 0) + 13, (char) ((-1) - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0)), 1099 - KeyEvent.keyCodeFromString(BuildConfig.FLAVOR), objArr57);
        if (!z.m(activity41, radioGroup9, ((String) objArr57[0]).intern())) {
            return false;
        }
        Activity activity42 = getActivity();
        RadioGroup radioGroup10 = this.rg_cookingStove;
        Object[] objArr58 = new Object[1];
        a((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 12, (char) (ViewConfiguration.getFadingEdgeLength() >> 16), Gravity.getAbsoluteGravity(0, 0) + 1112, objArr58);
        if (!z.m(activity42, radioGroup10, ((String) objArr58[0]).intern())) {
            return false;
        }
        Activity activity43 = getActivity();
        RadioGroup radioGroup11 = this.rg_tv;
        Object[] objArr59 = new Object[1];
        a(4 - Color.green(0), (char) (TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0) + 1), 1125 - (Process.myTid() >> 22), objArr59);
        if (!z.m(activity43, radioGroup11, ((String) objArr59[0]).intern())) {
            return false;
        }
        Activity activity44 = getActivity();
        RadioGroup radioGroup12 = this.rg_vcr;
        Object[] objArr60 = new Object[1];
        a(35 - View.getDefaultSize(0, 0), (char) (Process.myPid() >> 22), 1129 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr60);
        if (!z.m(activity44, radioGroup12, ((String) objArr60[0]).intern())) {
            return false;
        }
        Activity activity45 = getActivity();
        RadioGroup radioGroup13 = this.rg_refrigerator;
        Object[] objArr61 = new Object[1];
        a((-16777204) - Color.rgb(0, 0, 0), (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 275), KeyEvent.getDeadChar(0, 0) + 1164, objArr61);
        if (!z.m(activity45, radioGroup13, ((String) objArr61[0]).intern())) {
            return false;
        }
        Activity activity46 = getActivity();
        RadioGroup radioGroup14 = this.rg_freezer;
        Object[] objArr62 = new Object[1];
        a((ViewConfiguration.getScrollDefaultDelay() >> 16) + 7, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), TextUtils.getTrimmedLength(BuildConfig.FLAVOR) + 1176, objArr62);
        if (!z.m(activity46, radioGroup14, ((String) objArr62[0]).intern())) {
            return false;
        }
        Activity activity47 = getActivity();
        RadioGroup radioGroup15 = this.rg_generator;
        Object[] objArr63 = new Object[1];
        a((ViewConfiguration.getFadingEdgeLength() >> 16) + 25, (char) ExpandableListView.getPackedPositionGroup(0L), 1183 - Color.blue(0), objArr63);
        if (!z.m(activity47, radioGroup15, ((String) objArr63[0]).intern())) {
            return false;
        }
        Activity activity48 = getActivity();
        RadioGroup radioGroup16 = this.rg_sewing;
        Object[] objArr64 = new Object[1];
        a(22 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) ((-16762344) - Color.rgb(0, 0, 0)), 1208 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0), objArr64);
        if (!z.m(activity48, radioGroup16, ((String) objArr64[0]).intern())) {
            return false;
        }
        Activity activity49 = getActivity();
        RadioGroup radioGroup17 = this.rg_computer;
        Object[] objArr65 = new Object[1];
        a(Color.green(0) + 25, (char) Drawable.resolveOpacity(0, 0), 1231 - (ViewConfiguration.getTapTimeout() >> 16), objArr65);
        if (!z.m(activity49, radioGroup17, ((String) objArr65[0]).intern())) {
            return false;
        }
        Activity activity50 = getActivity();
        RadioGroup radioGroup18 = this.rg_motorcycle;
        Object[] objArr66 = new Object[1];
        a(TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0) + 21, (char) (TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0') + 18213), 1255 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0), objArr66);
        if (!z.m(activity50, radioGroup18, ((String) objArr66[0]).intern())) {
            return false;
        }
        Activity activity51 = getActivity();
        RadioGroup radioGroup19 = this.rg_tractor;
        Object[] objArr67 = new Object[1];
        a(7 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (1944 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 1276 - View.resolveSizeAndState(0, 0, 0), objArr67);
        if (!z.m(activity51, radioGroup19, ((String) objArr67[0]).intern())) {
            return false;
        }
        Activity activity52 = getActivity();
        RadioGroup radioGroup20 = this.rg_car;
        Object[] objArr68 = new Object[1];
        a(11 - ExpandableListView.getPackedPositionGroup(0L), (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 7883), 1283 - ((Process.getThreadPriority(0) + 20) >> 6), objArr68);
        if (!z.m(activity52, radioGroup20, ((String) objArr68[0]).intern())) {
            return false;
        }
        Activity activity53 = getActivity();
        RadioGroup radioGroup21 = this.rg_mobile;
        Object[] objArr69 = new Object[1];
        a(6 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) ((-1) - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0)), Color.green(0) + 1294, objArr69);
        if (!z.m(activity53, radioGroup21, ((String) objArr69[0]).intern())) {
            return false;
        }
        Activity activity54 = getActivity();
        RadioGroup radioGroup22 = this.rg_internet;
        Object[] objArr70 = new Object[1];
        a(TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0) + 20, (char) (14593 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR) + 1300, objArr70);
        if (!z.m(activity54, radioGroup22, ((String) objArr70[0]).intern())) {
            return false;
        }
        Activity activity55 = getActivity();
        RadioGroup radioGroup23 = this.rg_minternet;
        Object[] objArr71 = new Object[1];
        a(26 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (31619 - Color.argb(0, 0, 0, 0)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 1319, objArr71);
        if (!z.m(activity55, radioGroup23, ((String) objArr71[0]).intern())) {
            return false;
        }
        HashMap<Integer, KeyValue> map = new HashMap<>();
        this.assetsInfoList = map;
        Object[] objArr72 = new Object[1];
        a(10 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (20192 - Gravity.getAbsoluteGravity(0, 0)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1345, objArr72);
        map.put(1, new KeyValue(((String) objArr72[0]).intern(), BuildConfig.FLAVOR));
        HashMap<Integer, KeyValue> map2 = this.assetsInfoList;
        Object[] objArr73 = new Object[1];
        a(7 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0) + 4476), 1355 - Color.alpha(0), objArr73);
        map2.put(2, new KeyValue(((String) objArr73[0]).intern(), this.occupancyStatusList.get(this.sp_occupancy_status.getSelectedItemPosition()).getOption()));
        HashMap<Integer, KeyValue> map3 = this.assetsInfoList;
        Object[] objArr74 = new Object[1];
        a((ViewConfiguration.getFadingEdgeLength() >> 16) + 16, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 11574), TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0) + 1361, objArr74);
        map3.put(3, new KeyValue(((String) objArr74[0]).intern(), this.wallMaterialList.get(this.sp_wall_material.getSelectedItemPosition()).getOption()));
        HashMap<Integer, KeyValue> map4 = this.assetsInfoList;
        Object[] objArr75 = new Object[1];
        a(12 - KeyEvent.keyCodeFromString(BuildConfig.FLAVOR), (char) Color.green(0), 1377 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr75);
        map4.put(4, new KeyValue(((String) objArr75[0]).intern(), this.roofMaterialList.get(this.sp_roof_material.getSelectedItemPosition()).getOption()));
        HashMap<Integer, KeyValue> map5 = this.assetsInfoList;
        Object[] objArr76 = new Object[1];
        a(4 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (ExpandableListView.getPackedPositionGroup(0L) + 60502), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1388, objArr76);
        map5.put(5, new KeyValue(((String) objArr76[0]).intern(), this.spinnerNumberOfRooms.getSelectedItem().toString()));
        HashMap<Integer, KeyValue> map6 = this.assetsInfoList;
        Object[] objArr77 = new Object[1];
        a((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 5, (char) Color.red(0), TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0) + 1394, objArr77);
        map6.put(6, new KeyValue(((String) objArr77[0]).intern(), this.cookingFuelList.get(this.sp_cooking_fuel.getSelectedItemPosition()).getOption()));
        HashMap<Integer, KeyValue> map7 = this.assetsInfoList;
        Object[] objArr78 = new Object[1];
        a(TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0) + 6, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), KeyEvent.getDeadChar(0, 0) + 1399, objArr78);
        map7.put(7, new KeyValue(((String) objArr78[0]).intern(), this.toiletList.get(this.sp_toilet.getSelectedItemPosition()).getOption()));
        HashMap<Integer, KeyValue> map8 = this.assetsInfoList;
        Object[] objArr79 = new Object[1];
        a(4 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (1598 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 1404, objArr79);
        map8.put(8, new KeyValue(((String) objArr79[0]).intern(), this.drinkingWaterList.get(this.sp_drinking_water.getSelectedItemPosition()).getOption()));
        HashMap<Integer, KeyValue> map9 = this.assetsInfoList;
        Object[] objArr80 = new Object[1];
        a(13 - TextUtils.getTrimmedLength(BuildConfig.FLAVOR), (char) (View.getDefaultSize(0, 0) + 43328), 1408 - KeyEvent.getDeadChar(0, 0), objArr80);
        map9.put(9, new KeyValue(((String) objArr80[0]).intern(), this.electricityList.get(this.sp_electricity.getSelectedItemPosition()).getOption()));
        HashMap<Integer, KeyValue> map10 = this.assetsInfoList;
        Object[] objArr81 = new Object[1];
        a(12 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (39535 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 1421 - ((Process.getThreadPriority(0) + 20) >> 6), objArr81);
        map10.put(10, new KeyValue(((String) objArr81[0]).intern(), this.gasList.get(this.sp_gas.getSelectedItemPosition()).getOption()));
        HashMap<Integer, KeyValue> map11 = this.assetsInfoList;
        Object[] objArr82 = new Object[1];
        a(Process.getGidForName(BuildConfig.FLAVOR) + 10, (char) (Color.red(0) + 25723), 1434 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr82);
        map11.put(11, new KeyValue(((String) objArr82[0]).intern(), this.landlineList.get(this.sp_landline.getSelectedItemPosition()).getOption()));
        HashMap<Integer, KeyValue> map12 = this.assetsInfoList;
        Object[] objArr83 = new Object[1];
        a(9 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) View.MeasureSpec.makeMeasureSpec(0, 0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1442, objArr83);
        map12.put(12, new KeyValue(((String) objArr83[0]).intern(), z.j(getActivity(), this.rg_animal)));
        if (z.i(this.rg_animal) == 1) {
            HashMap<Integer, KeyValue> map13 = this.assetsInfoList;
            Object[] objArr84 = new Object[1];
            a(5 - Color.argb(0, 0, 0, 0), (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), 1451 - TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0), objArr84);
            map13.put(13, new KeyValue(((String) objArr84[0]).intern(), this.editTextbuffalo.getText().toString()));
            HashMap<Integer, KeyValue> map14 = this.assetsInfoList;
            Object[] objArr85 = new Object[1];
            a(8 - (Process.myPid() >> 22), (char) View.resolveSize(0, 0), 1456 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr85);
            map14.put(14, new KeyValue(((String) objArr85[0]).intern(), this.editTextcow.getText().toString()));
            HashMap<Integer, KeyValue> map15 = this.assetsInfoList;
            Object[] objArr86 = new Object[1];
            a(9 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) ((-1) - ImageFormat.getBitsPerPixel(0)), Drawable.resolveOpacity(0, 0) + 1464, objArr86);
            map15.put(15, new KeyValue(((String) objArr86[0]).intern(), this.editTextgoat.getText().toString()));
            HashMap<Integer, KeyValue> map16 = this.assetsInfoList;
            Object[] objArr87 = new Object[1];
            a(3 - MotionEvent.axisFromString(BuildConfig.FLAVOR), (char) View.MeasureSpec.getMode(0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1473, objArr87);
            map16.put(16, new KeyValue(((String) objArr87[0]).intern(), this.editTextcamel.getText().toString()));
            HashMap<Integer, KeyValue> map17 = this.assetsInfoList;
            Object[] objArr88 = new Object[1];
            a(15 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1476, objArr88);
            map17.put(17, new KeyValue(((String) objArr88[0]).intern(), this.editTexthorse.getText().toString()));
        }
        HashMap<Integer, KeyValue> map18 = this.assetsInfoList;
        Object[] objArr89 = new Object[1];
        a(8 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (56093 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), ExpandableListView.getPackedPositionGroup(0L) + 1491, objArr89);
        map18.put(18, new KeyValue(((String) objArr89[0]).intern(), z.j(getActivity(), this.rg_holdAgriculturalLand)));
        if (z.i(this.rg_holdAgriculturalLand) == 1) {
            if (this.totalLandSpinner.getSelectedItem().toString().equals(strIntern3)) {
                HashMap<Integer, KeyValue> map19 = this.assetsInfoList;
                StringBuilder sb = new StringBuilder();
                sb.append(this.unitList.get(this.sp_unit.getSelectedItemPosition()).getOption());
                Object[] objArr90 = new Object[1];
                a(View.MeasureSpec.getSize(0) + 1, (char) View.MeasureSpec.getSize(0), (-16775716) - Color.rgb(0, 0, 0), objArr90);
                sb.append(((String) objArr90[0]).intern());
                sb.append(this.editTextNumber.getText().toString());
                Object[] objArr91 = new Object[1];
                a(KeyEvent.getDeadChar(0, 0) + 4, (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 1501 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr91);
                map19.put(19, new KeyValue(((String) objArr91[0]).intern(), sb.toString()));
            } else {
                HashMap<Integer, KeyValue> map20 = this.assetsInfoList;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.unitList.get(this.sp_unit.getSelectedItemPosition()).getOption());
                Object[] objArr92 = new Object[1];
                a((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), (KeyEvent.getMaxKeyCode() >> 16) + 1500, objArr92);
                sb2.append(((String) objArr92[0]).intern());
                sb2.append(this.totalLandSpinner.getSelectedItem().toString());
                Object[] objArr93 = new Object[1];
                a(4 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) KeyEvent.normalizeMetaState(0), 1501 - Color.alpha(0), objArr93);
                map20.put(19, new KeyValue(((String) objArr93[0]).intern(), sb2.toString()));
            }
        }
        HashMap<Integer, KeyValue> map21 = this.assetsInfoList;
        Object[] objArr94 = new Object[1];
        a((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 4, (char) (42435 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), KeyEvent.getDeadChar(0, 0) + 1505, objArr94);
        map21.put(20, new KeyValue(((String) objArr94[0]).intern(), z.j(getActivity(), this.rg_heater)));
        HashMap<Integer, KeyValue> map22 = this.assetsInfoList;
        Object[] objArr95 = new Object[1];
        a(4 - View.MeasureSpec.getSize(0), (char) KeyEvent.getDeadChar(0, 0), (-16775707) - Color.rgb(0, 0, 0), objArr95);
        map22.put(21, new KeyValue(((String) objArr95[0]).intern(), z.j(getActivity(), this.rg_washingMachine)));
        HashMap<Integer, KeyValue> map23 = this.assetsInfoList;
        Object[] objArr96 = new Object[1];
        a((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 4, (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 10402), View.MeasureSpec.makeMeasureSpec(0, 0) + 1513, objArr96);
        map23.put(22, new KeyValue(((String) objArr96[0]).intern(), z.j(getActivity(), this.rg_geyser)));
        HashMap<Integer, KeyValue> map24 = this.assetsInfoList;
        Object[] objArr97 = new Object[1];
        a((ViewConfiguration.getLongPressTimeout() >> 16) + 9, (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 1517 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0), objArr97);
        map24.put(23, new KeyValue(((String) objArr97[0]).intern(), z.j(getActivity(), this.rg_airCooler)));
        HashMap<Integer, KeyValue> map25 = this.assetsInfoList;
        Object[] objArr98 = new Object[1];
        a((-16777204) - Color.rgb(0, 0, 0), (char) (38163 - (ViewConfiguration.getTapTimeout() >> 16)), Color.red(0) + 1526, objArr98);
        map25.put(24, new KeyValue(((String) objArr98[0]).intern(), z.j(getActivity(), this.rg_airConditioner)));
        HashMap<Integer, KeyValue> map26 = this.assetsInfoList;
        Object[] objArr99 = new Object[1];
        a((ViewConfiguration.getDoubleTapTimeout() >> 16) + 5, (char) (562 - (ViewConfiguration.getLongPressTimeout() >> 16)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1538, objArr99);
        map26.put(25, new KeyValue(((String) objArr99[0]).intern(), z.j(getActivity(), this.rg_fan)));
        HashMap<Integer, KeyValue> map27 = this.assetsInfoList;
        Object[] objArr100 = new Object[1];
        a(11 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), 1543 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr100);
        map27.put(26, new KeyValue(((String) objArr100[0]).intern(), z.j(getActivity(), this.rg_cookingRange)));
        HashMap<Integer, KeyValue> map28 = this.assetsInfoList;
        Object[] objArr101 = new Object[1];
        a(5 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (KeyEvent.normalizeMetaState(0) + 63774), 1553 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr101);
        map28.put(27, new KeyValue(((String) objArr101[0]).intern(), z.j(getActivity(), this.rg_cookingStove)));
        HashMap<Integer, KeyValue> map29 = this.assetsInfoList;
        Object[] objArr102 = new Object[1];
        a(5 - View.getDefaultSize(0, 0), (char) (TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0) + 21160), 1558 - (ViewConfiguration.getEdgeSlop() >> 16), objArr102);
        map29.put(28, new KeyValue(((String) objArr102[0]).intern(), z.j(getActivity(), this.rg_tv)));
        HashMap<Integer, KeyValue> map30 = this.assetsInfoList;
        Object[] objArr103 = new Object[1];
        a((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 3, (char) (TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0) + 55092), 1563 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr103);
        map30.put(29, new KeyValue(((String) objArr103[0]).intern(), z.j(getActivity(), this.rg_vcr)));
        HashMap<Integer, KeyValue> map31 = this.assetsInfoList;
        Object[] objArr104 = new Object[1];
        a(3 - ImageFormat.getBitsPerPixel(0), (char) (KeyEvent.getMaxKeyCode() >> 16), 1566 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr104);
        map31.put(30, new KeyValue(((String) objArr104[0]).intern(), z.j(getActivity(), this.rg_refrigerator)));
        HashMap<Integer, KeyValue> map32 = this.assetsInfoList;
        Object[] objArr105 = new Object[1];
        a((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 4, (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2807), 1570 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr105);
        map32.put(31, new KeyValue(((String) objArr105[0]).intern(), z.j(getActivity(), this.rg_freezer)));
        HashMap<Integer, KeyValue> map33 = this.assetsInfoList;
        Object[] objArr106 = new Object[1];
        a(6 - ExpandableListView.getPackedPositionType(0L), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 1575 - View.resolveSize(0, 0), objArr106);
        map33.put(32, new KeyValue(((String) objArr106[0]).intern(), z.j(getActivity(), this.rg_generator)));
        HashMap<Integer, KeyValue> map34 = this.assetsInfoList;
        Object[] objArr107 = new Object[1];
        a(9 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0), (char) KeyEvent.keyCodeFromString(BuildConfig.FLAVOR), 1580 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr107);
        map34.put(33, new KeyValue(((String) objArr107[0]).intern(), z.j(getActivity(), this.rg_sewing)));
        HashMap<Integer, KeyValue> map35 = this.assetsInfoList;
        Object[] objArr108 = new Object[1];
        a(6 - ExpandableListView.getPackedPositionChild(0L), (char) Color.alpha(0), (Process.myPid() >> 22) + 1591, objArr108);
        map35.put(34, new KeyValue(((String) objArr108[0]).intern(), z.j(getActivity(), this.rg_computer)));
        HashMap<Integer, KeyValue> map36 = this.assetsInfoList;
        Object[] objArr109 = new Object[1];
        a((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 11, (char) View.resolveSizeAndState(0, 0, 0), TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0) + 1598, objArr109);
        map36.put(35, new KeyValue(((String) objArr109[0]).intern(), z.j(getActivity(), this.rg_motorcycle)));
        HashMap<Integer, KeyValue> map37 = this.assetsInfoList;
        Object[] objArr110 = new Object[1];
        a((Process.myPid() >> 22) + 6, (char) (Color.alpha(0) + 21339), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1609, objArr110);
        map37.put(36, new KeyValue(((String) objArr110[0]).intern(), z.j(getActivity(), this.rg_tractor)));
        HashMap<Integer, KeyValue> map38 = this.assetsInfoList;
        Object[] objArr111 = new Object[1];
        a(((byte) KeyEvent.getModifierMetaStateMask()) + 4, (char) (29 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0)), Color.alpha(0) + 1615, objArr111);
        map38.put(37, new KeyValue(((String) objArr111[0]).intern(), z.j(getActivity(), this.rg_car)));
        HashMap<Integer, KeyValue> map39 = this.assetsInfoList;
        Object[] objArr112 = new Object[1];
        a(KeyEvent.normalizeMetaState(0) + 6, (char) (53506 - Gravity.getAbsoluteGravity(0, 0)), 1618 - ExpandableListView.getPackedPositionGroup(0L), objArr112);
        map39.put(38, new KeyValue(((String) objArr112[0]).intern(), z.j(getActivity(), this.rg_mobile)));
        HashMap<Integer, KeyValue> map40 = this.assetsInfoList;
        Object[] objArr113 = new Object[1];
        a((Process.myPid() >> 22) + 7, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 4223), 1624 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr113);
        map40.put(39, new KeyValue(((String) objArr113[0]).intern(), z.j(getActivity(), this.rg_internet)));
        HashMap<Integer, KeyValue> map41 = this.assetsInfoList;
        Object[] objArr114 = new Object[1];
        a(13 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0), (char) (48969 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 1631 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr114);
        map41.put(40, new KeyValue(((String) objArr114[0]).intern(), z.j(getActivity(), this.rg_minternet)));
        HashMap<Integer, KeyValue> map42 = this.assetsInfoList;
        Object[] objArr115 = new Object[1];
        a(12 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (41238 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 1645 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr115);
        map42.put(41, new KeyValue(((String) objArr115[0]).intern(), z.j(getActivity(), this.rg_house_structure)));
        if (this.rg_heater.getCheckedRadioButtonId() == this.rg_heater.getChildAt(1).getId() && this.rg_washingMachine.getCheckedRadioButtonId() == this.rg_washingMachine.getChildAt(1).getId() && this.rg_geyser.getCheckedRadioButtonId() == this.rg_geyser.getChildAt(1).getId() && this.rg_airCooler.getCheckedRadioButtonId() == this.rg_airCooler.getChildAt(1).getId()) {
            int i13 = e + 83;
            h = i13 % 128;
            int i14 = i13 % 2;
            if (this.rg_airConditioner.getCheckedRadioButtonId() == this.rg_airConditioner.getChildAt(1).getId() && this.rg_fan.getCheckedRadioButtonId() == this.rg_fan.getChildAt(1).getId() && this.rg_cookingRange.getCheckedRadioButtonId() == this.rg_cookingRange.getChildAt(1).getId() && this.rg_cookingStove.getCheckedRadioButtonId() == this.rg_cookingStove.getChildAt(1).getId() && this.rg_tv.getCheckedRadioButtonId() == this.rg_tv.getChildAt(1).getId() && this.rg_vcr.getCheckedRadioButtonId() == this.rg_vcr.getChildAt(1).getId() && this.rg_refrigerator.getCheckedRadioButtonId() == this.rg_refrigerator.getChildAt(1).getId() && this.rg_freezer.getCheckedRadioButtonId() == this.rg_freezer.getChildAt(1).getId() && this.rg_generator.getCheckedRadioButtonId() == this.rg_generator.getChildAt(1).getId() && this.rg_sewing.getCheckedRadioButtonId() == this.rg_sewing.getChildAt(1).getId() && this.rg_computer.getCheckedRadioButtonId() == this.rg_computer.getChildAt(1).getId() && this.rg_motorcycle.getCheckedRadioButtonId() == this.rg_motorcycle.getChildAt(1).getId() && this.rg_tractor.getCheckedRadioButtonId() == this.rg_tractor.getChildAt(1).getId() && this.rg_car.getCheckedRadioButtonId() == this.rg_car.getChildAt(1).getId() && this.rg_mobile.getCheckedRadioButtonId() == this.rg_mobile.getChildAt(1).getId() && this.rg_internet.getCheckedRadioButtonId() == this.rg_internet.getChildAt(1).getId() && this.rg_minternet.getCheckedRadioButtonId() == this.rg_minternet.getChildAt(1).getId()) {
                Activity activity56 = getActivity();
                Object[] objArr116 = new Object[1];
                a((ViewConfiguration.getScrollDefaultDelay() >> 16) + 109, (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 7455), KeyEvent.getDeadChar(0, 0) + 1656, objArr116);
                Toast.makeText(activity56, ((String) objArr116[0]).intern(), 0).show();
                return false;
            }
        }
        if (this.rg_heater.getCheckedRadioButtonId() == this.rg_heater.getChildAt(1).getId() && this.rg_washingMachine.getCheckedRadioButtonId() == this.rg_washingMachine.getChildAt(1).getId() && this.rg_geyser.getCheckedRadioButtonId() == this.rg_geyser.getChildAt(1).getId() && this.rg_airCooler.getCheckedRadioButtonId() == this.rg_airCooler.getChildAt(1).getId() && this.rg_airConditioner.getCheckedRadioButtonId() == this.rg_airConditioner.getChildAt(1).getId() && this.rg_fan.getCheckedRadioButtonId() == this.rg_fan.getChildAt(1).getId() && this.rg_cookingRange.getCheckedRadioButtonId() == this.rg_cookingRange.getChildAt(1).getId() && this.rg_cookingStove.getCheckedRadioButtonId() == this.rg_cookingStove.getChildAt(1).getId() && this.rg_tv.getCheckedRadioButtonId() == this.rg_tv.getChildAt(1).getId() && this.rg_vcr.getCheckedRadioButtonId() == this.rg_vcr.getChildAt(1).getId() && this.rg_refrigerator.getCheckedRadioButtonId() == this.rg_refrigerator.getChildAt(1).getId() && this.rg_freezer.getCheckedRadioButtonId() == this.rg_freezer.getChildAt(1).getId()) {
            int i15 = e + 85;
            h = i15 % 128;
            if (i15 % 2 != 0 ? this.rg_generator.getCheckedRadioButtonId() == this.rg_generator.getChildAt(1).getId() : this.rg_generator.getCheckedRadioButtonId() == this.rg_generator.getChildAt(1).getId()) {
                if (this.rg_sewing.getCheckedRadioButtonId() == this.rg_sewing.getChildAt(1).getId() && this.rg_computer.getCheckedRadioButtonId() == this.rg_computer.getChildAt(1).getId() && this.rg_motorcycle.getCheckedRadioButtonId() == this.rg_motorcycle.getChildAt(1).getId() && this.rg_tractor.getCheckedRadioButtonId() == this.rg_tractor.getChildAt(1).getId() && this.rg_car.getCheckedRadioButtonId() == this.rg_car.getChildAt(1).getId() && this.rg_mobile.getCheckedRadioButtonId() == this.rg_mobile.getChildAt(1).getId()) {
                    int i16 = h + 27;
                    e = i16 % 128;
                    if (i16 % 2 == 0 ? this.rg_internet.getCheckedRadioButtonId() == this.rg_internet.getChildAt(1).getId() : this.rg_internet.getCheckedRadioButtonId() == this.rg_internet.getChildAt(1).getId()) {
                        if (this.rg_minternet.getCheckedRadioButtonId() == this.rg_minternet.getChildAt(1).getId() && this.rg_house_structure.getCheckedRadioButtonId() == this.rg_house_structure.getChildAt(1).getId() && (this.sp_landline.getSelectedItemPosition() == 1 || this.sp_landline.getSelectedItemPosition() == 2 || this.sp_gas.getSelectedItemPosition() == 1 || this.sp_gas.getSelectedItemPosition() == 2 || this.sp_electricity.getSelectedItemPosition() == 1 || this.sp_electricity.getSelectedItemPosition() == 2)) {
                            Activity activity57 = getActivity();
                            Object[] objArr117 = new Object[1];
                            a((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 51, (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), Color.red(0) + 1765, objArr117);
                            Toast.makeText(activity57, ((String) objArr117[0]).intern(), 0).show();
                            return false;
                        }
                    }
                }
            }
        }
        this.activityBeginSurvey.F(new HashMap<>());
        this.activityBeginSurvey.x().putAll(this.assetsInfoList);
        if (!this.isValidTrue) {
            this.activityBeginSurvey.z().householdEnd = z.e();
            this.activityBeginSurvey.z().diffHousehold = ac.f(this.activityBeginSurvey.z().householdStart, this.activityBeginSurvey.z().householdEnd);
            this.isValidTrue = true;
        }
        this.bispApplication.N(this.gas_et.getText().toString());
        this.bispApplication.K(this.elec_et.getText().toString());
        if (z.g(this.rg_house_structure) == 0) {
            this.bispApplication.R(1);
            this.bispApplication.Q(0);
            this.bispApplication.O(0);
        } else if (z.g(this.rg_house_structure) == 1) {
            this.bispApplication.R(0);
            this.bispApplication.Q(1);
            this.bispApplication.O(0);
        } else {
            this.bispApplication.R(0);
            this.bispApplication.Q(0);
            this.bispApplication.O(1);
        }
        if (this.cb_hyderral_individual.isChecked()) {
            this.bispApplication.C(1);
        } else {
            this.bispApplication.C(0);
        }
        if (this.cb_hyderral_social.isChecked()) {
            this.bispApplication.E(1);
        } else {
            this.bispApplication.E(0);
        }
        if (this.cb_hyderral_solar.isChecked()) {
            this.bispApplication.D(1);
        } else {
            this.bispApplication.D(0);
        }
        if (this.cb_hyderral_wind.isChecked()) {
            this.bispApplication.F(1);
        } else {
            this.bispApplication.F(0);
        }
        if (this.sp_unit_agri.getSelectedItemPosition() == 0) {
            Objects.requireNonNull(this.bispApplication);
            Objects.requireNonNull(this.bispApplication);
        } else {
            BISPApplication bISPApplication2 = this.bispApplication;
            this.unitList.get(this.sp_unit_agri.getSelectedItemPosition()).getOptionId();
            Objects.requireNonNull(bISPApplication2);
            if (this.agricultureLanSpinner.getSelectedItem().toString().equals(strIntern3)) {
                BISPApplication bISPApplication3 = this.bispApplication;
                Integer.parseInt(this.et_number_agri.getText().toString().trim());
                Objects.requireNonNull(bISPApplication3);
            } else {
                BISPApplication bISPApplication4 = this.bispApplication;
                Integer.parseInt(this.agricultureLanSpinner.getSelectedItem().toString().trim());
                Objects.requireNonNull(bISPApplication4);
            }
        }
        this.isTotalLandValidation = false;
        this.isAgricultureLandValidation = false;
        return true;
    }

    private void parseSuperObj() {
        int i = 2 % 2;
        int i2 = e + 55;
        h = i2 % 128;
        if (i2 % 2 == 0) {
            this.sp_occupancy_status.getSelectedItemPosition();
            throw null;
        }
        if (this.sp_occupancy_status.getSelectedItemPosition() != 0) {
            ActivityBeginSurvey activityBeginSurvey = this.activityBeginSurvey;
            activityBeginSurvey.au.occupancy_status_flag++;
            activityBeginSurvey.ap.occupacy_status_code = this.occupancyStatusList.get(this.sp_occupancy_status.getSelectedItemPosition()).getOptionId();
            this.activityBeginSurvey.ap.occupacy_status = this.occupancyStatusList.get(this.sp_occupancy_status.getSelectedItemPosition()).getOption();
            ActivityBeginSurvey activityBeginSurvey2 = this.activityBeginSurvey;
            int i3 = activityBeginSurvey2.aG.occupacy_status_code;
            Survey survey = activityBeginSurvey2.ap;
            if (i3 == survey.occupacy_status_code) {
                survey.occupacy_status_flag = 1;
                updateHouseHoldPercentage(1);
            } else {
                survey.occupacy_status_flag = 0;
            }
        }
        if (this.sp_wall_material.getSelectedItemPosition() != 0) {
            ActivityBeginSurvey activityBeginSurvey3 = this.activityBeginSurvey;
            activityBeginSurvey3.au.wall_material_flag++;
            activityBeginSurvey3.ap.wall_material_code = this.wallMaterialList.get(this.sp_wall_material.getSelectedItemPosition()).getOptionId();
            this.activityBeginSurvey.ap.wall_material_status = this.wallMaterialList.get(this.sp_wall_material.getSelectedItemPosition()).getOption();
            ActivityBeginSurvey activityBeginSurvey4 = this.activityBeginSurvey;
            int i4 = activityBeginSurvey4.aG.wall_material_code;
            Survey survey2 = activityBeginSurvey4.ap;
            if (i4 == survey2.wall_material_code) {
                int i5 = e + 71;
                h = i5 % 128;
                if (i5 % 2 == 0) {
                    survey2.wall_material_flag = 0;
                } else {
                    survey2.wall_material_flag = 1;
                }
                updateHouseHoldPercentage(1);
            } else {
                survey2.wall_material_flag = 0;
                int i6 = e + 121;
                h = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 5 % 2;
                }
            }
        }
        if (this.sp_roof_material.getSelectedItemPosition() != 0) {
            int i8 = e + 47;
            h = i8 % 128;
            int i9 = i8 % 2;
            ActivityBeginSurvey activityBeginSurvey5 = this.activityBeginSurvey;
            activityBeginSurvey5.au.roof_material_flag++;
            activityBeginSurvey5.ap.roof_material_code = this.roofMaterialList.get(this.sp_roof_material.getSelectedItemPosition()).getOptionId();
            this.activityBeginSurvey.ap.roof_material_status = this.roofMaterialList.get(this.sp_roof_material.getSelectedItemPosition()).getOption();
            ActivityBeginSurvey activityBeginSurvey6 = this.activityBeginSurvey;
            int i10 = activityBeginSurvey6.aG.roof_material_code;
            Survey survey3 = activityBeginSurvey6.ap;
            if (i10 == survey3.roof_material_code) {
                int i11 = h + 1;
                e = i11 % 128;
                int i12 = i11 % 2;
                survey3.roof_material_flag = 1;
                updateHouseHoldPercentage(1);
            } else {
                survey3.roof_material_flag = 0;
            }
        }
        if (this.sp_cooking_fuel.getSelectedItemPosition() != 0) {
            ActivityBeginSurvey activityBeginSurvey7 = this.activityBeginSurvey;
            activityBeginSurvey7.au.cooking_fuel_flag++;
            activityBeginSurvey7.ap.cooking_fuel_code = this.cookingFuelList.get(this.sp_cooking_fuel.getSelectedItemPosition()).getOptionId();
            this.activityBeginSurvey.ap.cooking_fuel_status = this.cookingFuelList.get(this.sp_cooking_fuel.getSelectedItemPosition()).getOption();
            ActivityBeginSurvey activityBeginSurvey8 = this.activityBeginSurvey;
            int i13 = activityBeginSurvey8.aG.cooking_fuel_code;
            Survey survey4 = activityBeginSurvey8.ap;
            if (i13 == survey4.cooking_fuel_code) {
                survey4.cooking_fuel_flag = 1;
                updateHouseHoldPercentage(1);
            } else {
                survey4.cooking_fuel_flag = 0;
            }
        }
        if (this.sp_toilet.getSelectedItemPosition() != 0) {
            ActivityBeginSurvey activityBeginSurvey9 = this.activityBeginSurvey;
            activityBeginSurvey9.au.toilet_flag++;
            activityBeginSurvey9.ap.toilet_code = this.toiletList.get(this.sp_toilet.getSelectedItemPosition()).getOptionId();
            this.activityBeginSurvey.ap.toilet_status = this.toiletList.get(this.sp_toilet.getSelectedItemPosition()).getOption();
            ActivityBeginSurvey activityBeginSurvey10 = this.activityBeginSurvey;
            int i14 = activityBeginSurvey10.aG.toilet_code;
            Survey survey5 = activityBeginSurvey10.ap;
            if (i14 == survey5.toilet_code) {
                survey5.toilet_flag = 1;
                updateHouseHoldPercentage(1);
            } else {
                survey5.toilet_flag = 0;
            }
        }
        if (this.sp_drinking_water.getSelectedItemPosition() != 0) {
            ActivityBeginSurvey activityBeginSurvey11 = this.activityBeginSurvey;
            activityBeginSurvey11.au.drinking_water_flag++;
            activityBeginSurvey11.ap.drinking_water_code = this.drinkingWaterList.get(this.sp_drinking_water.getSelectedItemPosition()).getOptionId();
            this.activityBeginSurvey.ap.drinking_water_status = this.drinkingWaterList.get(this.sp_drinking_water.getSelectedItemPosition()).getOption();
            ActivityBeginSurvey activityBeginSurvey12 = this.activityBeginSurvey;
            int i15 = activityBeginSurvey12.aG.drinking_water_code;
            Survey survey6 = activityBeginSurvey12.ap;
            if (i15 == survey6.drinking_water_code) {
                int i16 = h + 95;
                e = i16 % 128;
                int i17 = i16 % 2;
                survey6.drinking_water_flag = 1;
                updateHouseHoldPercentage(1);
            } else {
                survey6.drinking_water_flag = 0;
            }
        }
        if (this.sp_electricity.getSelectedItemPosition() != 0) {
            ActivityBeginSurvey activityBeginSurvey13 = this.activityBeginSurvey;
            activityBeginSurvey13.au.electricity_flag++;
            activityBeginSurvey13.ap.electricity_code = this.electricityList.get(this.sp_electricity.getSelectedItemPosition()).getOptionId();
            this.activityBeginSurvey.ap.electricity_status = this.electricityList.get(this.sp_electricity.getSelectedItemPosition()).getOption();
            ActivityBeginSurvey activityBeginSurvey14 = this.activityBeginSurvey;
            int i18 = activityBeginSurvey14.aG.electricity_code;
            Survey survey7 = activityBeginSurvey14.ap;
            if (i18 == survey7.electricity_code) {
                survey7.electricity_flag = 1;
                updateHouseHoldPercentage(1);
            } else {
                survey7.electricity_flag = 0;
            }
        }
        if (this.sp_gas.getSelectedItemPosition() != 0) {
            int i19 = e + 57;
            h = i19 % 128;
            int i20 = i19 % 2;
            ActivityBeginSurvey activityBeginSurvey15 = this.activityBeginSurvey;
            activityBeginSurvey15.au.gas_flag++;
            activityBeginSurvey15.ap.gas_code = this.gasList.get(this.sp_gas.getSelectedItemPosition()).getOptionId();
            this.activityBeginSurvey.ap.gas_status = this.gasList.get(this.sp_gas.getSelectedItemPosition()).getOption();
            ActivityBeginSurvey activityBeginSurvey16 = this.activityBeginSurvey;
            int i21 = activityBeginSurvey16.aG.gas_code;
            Survey survey8 = activityBeginSurvey16.ap;
            if (i21 == survey8.gas_code) {
                int i22 = e + 107;
                h = i22 % 128;
                if (i22 % 2 == 0) {
                    survey8.gas_flag = 1;
                    updateHouseHoldPercentage(0);
                } else {
                    survey8.gas_flag = 1;
                    updateHouseHoldPercentage(1);
                }
            } else {
                survey8.gas_flag = 0;
            }
        }
        if (this.sp_landline.getSelectedItemPosition() != 0) {
            ActivityBeginSurvey activityBeginSurvey17 = this.activityBeginSurvey;
            activityBeginSurvey17.au.landline_flag++;
            activityBeginSurvey17.ap.landline_code = this.landlineList.get(this.sp_landline.getSelectedItemPosition()).getOptionId();
            this.activityBeginSurvey.ap.landline_status = this.landlineList.get(this.sp_landline.getSelectedItemPosition()).getOption();
            ActivityBeginSurvey activityBeginSurvey18 = this.activityBeginSurvey;
            int i23 = activityBeginSurvey18.aG.landline_code;
            Survey survey9 = activityBeginSurvey18.ap;
            if (i23 == survey9.landline_code) {
                survey9.landline_flag = 1;
                updateHouseHoldPercentage(1);
            } else {
                survey9.landline_flag = 0;
            }
        }
        this.activityBeginSurvey.ap.animal = z.i(this.rg_animal);
        this.activityBeginSurvey.ap.number_of_rooms = ivas.gov.bisp.enumeration.p091n.j.h(this.spinnerNumberOfRooms);
        this.activityBeginSurvey.ap.buffalo = getEditTextValuesIfEmpty(this.editTextbuffalo);
        this.activityBeginSurvey.ap.cow = getEditTextValuesIfEmpty(this.editTextcow);
        this.activityBeginSurvey.ap.horse = getEditTextValuesIfEmpty(this.editTexthorse);
        this.activityBeginSurvey.ap.camel = getEditTextValuesIfEmpty(this.editTextcamel);
        this.activityBeginSurvey.ap.goat = getEditTextValuesIfEmpty(this.editTextgoat);
        String string = this.totalLandSpinner.getSelectedItem().toString();
        Object[] objArr = new Object[1];
        a((ViewConfiguration.getKeyRepeatDelay() >> 16) + 5, (char) (26128 - (ViewConfiguration.getLongPressTimeout() >> 16)), 12 - (ViewConfiguration.getTapTimeout() >> 16), objArr);
        if (string.equals(((String) objArr[0]).intern())) {
            this.activityBeginSurvey.ap.land_number = getEditTextValuesIfEmpty(this.editTextNumber);
        } else {
            this.activityBeginSurvey.ap.land_number = ivas.gov.bisp.enumeration.p091n.j.h(this.totalLandSpinner);
        }
        this.activityBeginSurvey.ap.household_agriculture_land = z.i(this.rg_holdAgriculturalLand);
        this.activityBeginSurvey.ap.heater = z.i(this.rg_heater);
        this.activityBeginSurvey.ap.washing_machine = z.i(this.rg_washingMachine);
        this.activityBeginSurvey.ap.geyser = z.i(this.rg_geyser);
        this.activityBeginSurvey.ap.air_cooler = z.i(this.rg_airCooler);
        this.activityBeginSurvey.ap.air_conditioner = z.i(this.rg_airConditioner);
        this.activityBeginSurvey.ap.fan = z.i(this.rg_fan);
        this.activityBeginSurvey.ap.cooking_range = z.i(this.rg_cookingRange);
        this.activityBeginSurvey.ap.cooking_stove = z.i(this.rg_cookingStove);
        this.activityBeginSurvey.ap.tv = z.i(this.rg_tv);
        this.activityBeginSurvey.ap.vcr = z.i(this.rg_vcr);
        this.activityBeginSurvey.ap.refrigerator = z.i(this.rg_refrigerator);
        this.activityBeginSurvey.ap.freezer = z.i(this.rg_freezer);
        this.activityBeginSurvey.ap.generator = z.i(this.rg_generator);
        this.activityBeginSurvey.ap.sewing = z.i(this.rg_sewing);
        this.activityBeginSurvey.ap.computer = z.i(this.rg_computer);
        this.activityBeginSurvey.ap.car = z.i(this.rg_car);
        this.activityBeginSurvey.ap.motorcycle = z.i(this.rg_motorcycle);
        this.activityBeginSurvey.ap.tractor = z.i(this.rg_tractor);
        this.activityBeginSurvey.ap.mobile = z.i(this.rg_mobile);
        this.activityBeginSurvey.ap.internet = z.i(this.rg_internet);
        this.activityBeginSurvey.ap.m_internet = z.i(this.rg_minternet);
        parseSuperFlags();
    }

    private static void a(int i, char c, int i2, Object[] objArr) {
        int i3 = 2 % 2;
        o.e eVar = new o.e();
        long[] jArr = new long[i];
        eVar.d = 0;
        int i4 = $11 + 121;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (eVar.d < i) {
            jArr[eVar.d] = (((long) ((char) (((long) e$s2$37132[i2 + eVar.d]) ^ (-9150281428767639173L)))) ^ (((long) eVar.d) * ((-9150281428767639173L) ^ d$s3$37132))) ^ ((long) c);
            eVar.d++;
        }
        char[] cArr = new char[i];
        eVar.d = 0;
        int i6 = $10 + 77;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        while (eVar.d < i) {
            cArr[eVar.d] = (char) jArr[eVar.d];
            eVar.d++;
        }
        objArr[0] = new String(cArr);
    }
}
