package ivas.gov.bisp.enumeration.fragments;

import android.app.Activity;
import android.app.Dialog;
import android.app.Fragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.Paint;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.orm.SugarRecord;
import ivas.gov.bisp.enumeration.ActivityBeginSurvey;
import ivas.gov.bisp.enumeration.BISPApplication;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.X.e;
import ivas.gov.bisp.enumeration.bA.h;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.bK.ah;
import ivas.gov.bisp.enumeration.fragments.FragmentPictures;
import ivas.gov.bisp.enumeration.models.SupervisorParseObject;
import ivas.gov.bisp.enumeration.models.Survey;
import ivas.gov.bisp.enumeration.p026az.C0104p;
import ivas.gov.bisp.enumeration.p026az.P;
import ivas.gov.bisp.enumeration.p026az.z;
import ivas.gov.bisp.enumeration.p036bi.ViewOnClickListenerC0191t;
import ivas.gov.bisp.enumeration.p037bj.c;
import ivas.gov.bisp.enumeration.p051bx.a;
import ivas.gov.bisp.enumeration.p085h.k;
import ivas.gov.bisp.enumeration.p086i.l;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import net.sqlcipher.BuildConfig;
import o.g;

/* JADX INFO: loaded from: classes.dex */
public class FragmentPictures extends Fragment implements e {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final int REQUEST_IMAGE_CAPTURE_BENIFICIARY = 2;
    private static final int REQUEST_IMAGE_CAPTURE_SELFIE = 3;
    private static int a$s14$3454 = 1962648911;
    private static int c = 1;
    private static int d = 0;
    private static long d$s40$3353 = -6460475095795864094L;
    private ActivityBeginSurvey activityBeginSurvey;
    public BISPApplication bispApplication;
    public Bitmap bitmap;
    public byte[] bmpData;

    @BindView
    public Button btn_generate_code;

    @BindView
    public Button btn_old_qr_code;

    @BindView
    public Button btn_qr_code;

    @BindView
    public Button buttonSelfie;

    @BindView
    public Button buttonThumb;

    @BindView
    public CheckBox checkBoxMultistory;

    @BindView
    public CheckBox checkBoxOldRec;

    @BindView
    public CheckBox checkBoxRecollection;

    @BindView
    public EditText editTextComments;

    @BindView
    public TextView editTextFormNo;

    @BindView
    public TextView editTextFormNoOld;

    @BindView
    public TextView editTextFormOldNoReenter;
    public ExecutorService exec;
    public RelativeLayout finger_print_layout;
    public String[] fingers;

    @BindView
    public ImageView imageButtonBeneficiary;

    @BindView
    public ImageView imageButtonSelfie;
    public ImageView imageFinger;
    public ImageView imageview_fp;
    private boolean isOldScan;
    public RadioButton left_hand;

    @BindView
    public LinearLayout linearLayoutOld;

    @BindView
    public LinearLayout linearLayoutSelfie;

    @BindView
    public LinearLayout linearLayoutThumb;
    public ArrayList mFingerList;
    public Handler msgHandler;
    public c myScanner;
    private File photoFile;
    private String photoPath;
    public RadioGroup rg_hands;
    public RadioButton right_hand;
    public Button select_finger;
    public Dialog select_finger_dialog;
    public SessionManager sessionManager;
    private Survey surveyEnumerator;

    @BindView
    public TextView textViewTitle;
    public Button thumb_impression_btn;
    private View parentView = null;
    public boolean isCapture = false;
    public boolean isBioClicked = false;
    public int PERMISSION_ALL = 0;
    public int IMAGE_WIDTH = 256;
    public int IMAGE_HEIGHT = 360;
    public final byte[] rawData = new byte[92160];
    public String[] PERMISSIONS = new String[0];
    public int finger_index = 0;

    public FragmentPictures() {
        Object[] objArr = new Object[1];
        a(Color.blue(0) + 1, new char[]{55892, 56444, 19775, 39899, 43630, 3555, 30752, 3193, 40914, 22838, 18645, 52018, 23245, 7274, 33819, 34625, 5476, 55246, 49640, 17015, 53580, 38205, 700, 1999, 36063, 27271, 24166, 48428, 20333, 10706, 39269, 30875, 3384, 58169, 54494, 14148, 50864, 41094, 5636, 62358, 33159, 25558, 21463, 44565, 32054, 14604, 61115, 28111, 16104, 65255, 10777, 10743, 64286}, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(1 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), new char[]{49085, 47514, 23026, 36705, 65176, 22941, 54547, 41252, 64144, 19301, 7233}, objArr2);
        String strIntern2 = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        b(7 - Gravity.getAbsoluteGravity(0, 0), false, 15 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 1604 - Color.red(0), new char[]{326, 64154, 161, 192, 297, 190, 326, 174, 315, 161, 169, 164, 64154, 291}, objArr3);
        String strIntern3 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        b(12 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), true, Gravity.getAbsoluteGravity(0, 0) + 13, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1704, new char[]{'Y', 196, '[', '<', 64053, 225, '[', '<', 225, 'Z', 'F', 'D', 225}, objArr4);
        String strIntern4 = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        a((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1, new char[]{16472, 18047, 40745, 18874, 558, 42283, 33266, 62917, 1397, 36286, 57372, 13313, 49336, 52851, 11320, 32281, 35204, 991, 28622, 47910, 19276, 18368}, objArr5);
        String strIntern5 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        a((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), new char[]{56750, 56104, 4411, 51024, 7423, 47901, 2578, 32276, 38966, 1330, 65062, 47495, 23977, 16386, 12897}, objArr6);
        this.fingers = new String[]{strIntern, strIntern2, strIntern3, strIntern4, strIntern5, ((String) objArr6[0]).intern()};
        this.msgHandler = new Handler() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentPictures.5
            private static int a = 0;
            private static int b = 1;

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i = 2 % 2;
                int i2 = b;
                int i3 = (((i2 & (-20)) | ((~i2) & 19)) - (~(-(-((i2 & 19) << 1))))) - 1;
                a = i3 % 128;
                int i4 = i3 % 2;
                if (message.what == 0) {
                    int i5 = b + 113;
                    a = i5 % 128;
                    int i6 = i5 % 2;
                    FragmentPictures fragmentPictures = FragmentPictures.this;
                    if (fragmentPictures.isCapture) {
                        int i7 = b;
                        int i8 = i7 & 75;
                        int i9 = (i7 ^ 75) | i8;
                        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
                        a = i10 % 128;
                        int i11 = i10 % 2;
                        fragmentPictures.bitmap = ivas.gov.bisp.enumeration.bC.e.c(fragmentPictures.bmpData);
                        int i12 = b + 125;
                        a = i12 % 128;
                        Object obj = null;
                        if (i12 % 2 != 0) {
                            FragmentPictures fragmentPictures2 = FragmentPictures.this;
                            ImageView imageView = fragmentPictures2.imageview_fp;
                            Bitmap bitmap = fragmentPictures2.bitmap;
                            obj.hashCode();
                            throw null;
                        }
                        FragmentPictures fragmentPictures3 = FragmentPictures.this;
                        fragmentPictures3.imageview_fp.setImageBitmap(fragmentPictures3.bitmap);
                        FragmentPictures fragmentPictures4 = FragmentPictures.this;
                        ImageView imageView2 = fragmentPictures4.imageFinger;
                        int i13 = b;
                        int i14 = ((i13 & 102) + (i13 | 102)) - 1;
                        a = i14 % 128;
                        int i15 = i14 % 2;
                        imageView2.setImageBitmap(fragmentPictures4.bitmap);
                        if (i15 != 0) {
                            obj.hashCode();
                            throw null;
                        }
                        int i16 = a;
                        int i17 = (i16 & 97) + (i16 | 97);
                        b = i17 % 128;
                        if (i17 % 2 == 0) {
                            int i18 = 2 % 3;
                        }
                    }
                }
                int i19 = a;
                int i20 = i19 & 7;
                int i21 = ((i19 ^ 7) | i20) << 1;
                int i22 = -((i19 | 7) & (~i20));
                int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
                b = i23 % 128;
                int i24 = i23 % 2;
            }
        };
    }

    public static /* synthetic */ ActivityBeginSurvey access$000(FragmentPictures fragmentPictures) {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 97;
        c = i3 % 128;
        int i4 = i3 % 2;
        ActivityBeginSurvey activityBeginSurvey = fragmentPictures.activityBeginSurvey;
        int i5 = i2 + 3;
        c = i5 % 128;
        if (i5 % 2 != 0) {
            return activityBeginSurvey;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void c(FragmentPictures fragmentPictures, View view) {
        int i = 2 % 2;
        int i2 = c + 9;
        d = i2 % 128;
        int i3 = i2 % 2;
        fragmentPictures.lambda$imageButtonOnClickListeners$8(view);
        int i4 = d + 57;
        c = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private boolean checkIfSurveyIsUnique(String str) {
        int i = 2 % 2;
        int i2 = d + 47;
        c = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        b(ImageFormat.getBitsPerPixel(0) + 31, false, 44 - TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0), KeyEvent.normalizeMetaState(0) + 282, new char[]{22, 17, 18, 19, 18, 19, 24, 5, 24, '\f', 19, 17, '\t', 65505, 65507, 65476, 65523, 65526, 65476, '\n', 19, 22, 17, 18, 19, 19, 16, '\b', 65505, 65507, '\n', 19, 22, 17, 18, 19, 65505, 65507, 65476, 65523, 65526, 65476, '\n', 19}, objArr);
        if (SugarRecord.count(Survey.class, ((String) objArr[0]).intern(), str, str, str) != 0) {
            return false;
        }
        int i4 = d;
        int i5 = i4 + 19;
        c = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 29;
        c = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    public static /* synthetic */ void d(FragmentPictures fragmentPictures, CompoundButton compoundButton, boolean z) {
        int i = 2 % 2;
        int i2 = c + 11;
        d = i2 % 128;
        int i3 = i2 % 2;
        fragmentPictures.lambda$generateBody$3(compoundButton, z);
        int i4 = c + 73;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 80 / 0;
        }
    }

    public static /* synthetic */ void e(FragmentPictures fragmentPictures, View view) {
        int i = 2 % 2;
        int i2 = c + 93;
        d = i2 % 128;
        int i3 = i2 % 2;
        fragmentPictures.lambda$generateBody$6(view);
        int i4 = c + 29;
        d = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void f(FragmentPictures fragmentPictures, View view) {
        int i = 2 % 2;
        int i2 = c + 93;
        d = i2 % 128;
        int i3 = i2 % 2;
        fragmentPictures.lambda$onCreateView$0(view);
        int i4 = c + 3;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 86 / 0;
        }
    }

    public static /* synthetic */ void g(FragmentPictures fragmentPictures, CompoundButton compoundButton, boolean z) {
        int i = 2 % 2;
        int i2 = c + 107;
        d = i2 % 128;
        int i3 = i2 % 2;
        fragmentPictures.lambda$generateBody$4(compoundButton, z);
        if (i3 != 0) {
            int i4 = 63 / 0;
        }
    }

    public static /* synthetic */ void h(FragmentPictures fragmentPictures, View view) {
        int i = 2 % 2;
        int i2 = d + 13;
        c = i2 % 128;
        int i3 = i2 % 2;
        fragmentPictures.lambda$onCreateView$1(view);
        int i4 = d + 83;
        c = i4 % 128;
        int i5 = i4 % 2;
    }

    public static boolean hasPermissions(Context context, String... strArr) {
        int i = 2 % 2;
        if (context != null && strArr != null) {
            int length = strArr.length;
            int i2 = 0;
            while (i2 < length) {
                int i3 = d + 95;
                c = i3 % 128;
                int i4 = i3 % 2;
                if (l.b(context, strArr[i2]) != 0) {
                    int i5 = d + 75;
                    c = i5 % 128;
                    return i5 % 2 == 0;
                }
                i2++;
                int i6 = d + 73;
                c = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        return true;
    }

    public static /* synthetic */ void i(View view) {
        int i = 2 % 2;
        int i2 = c + 3;
        d = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        lambda$generateBody$5(view);
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = c + 35;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void j(View view) {
        int i = 2 % 2;
        int i2 = c + 103;
        d = i2 % 128;
        int i3 = i2 % 2;
        lambda$imageButtonOnClickListeners$7(view);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void k(FragmentPictures fragmentPictures, View view) {
        int i = 2 % 2;
        int i2 = c + 77;
        d = i2 % 128;
        int i3 = i2 % 2;
        fragmentPictures.lambda$onCreateView$2(view);
        if (i3 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024  */
    /* JADX WARN: Code duplicated, block: B:12:0x0026 A[PHI: r1
  0x0026: PHI (r1v5 android.widget.LinearLayout) = (r1v2 android.widget.LinearLayout), (r1v6 android.widget.LinearLayout) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x001b A[PHI: r1
  0x001b: PHI (r1v3 android.widget.LinearLayout) = (r1v2 android.widget.LinearLayout), (r1v6 android.widget.LinearLayout) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    private /* synthetic */ void lambda$generateBody$3(CompoundButton compoundButton, boolean z) {
        LinearLayout linearLayout;
        int i;
        int i2 = 2 % 2;
        int i3 = d;
        int i4 = i3 + 53;
        c = i4 % 128;
        int i5 = 0;
        if (i4 % 2 == 0) {
            linearLayout = this.linearLayoutOld;
            int i6 = 24 / 0;
            if (z) {
                i = i3 + 11;
                c = i % 128;
                if (i % 2 == 0) {
                    i5 = 1;
                }
            } else {
                i5 = 8;
            }
        } else {
            linearLayout = this.linearLayoutOld;
            if (z) {
                i = i3 + 11;
                c = i % 128;
                if (i % 2 == 0) {
                    i5 = 1;
                }
            } else {
                i5 = 8;
            }
        }
        linearLayout.setVisibility(i5);
    }

    private /* synthetic */ void lambda$generateBody$4(CompoundButton compoundButton, boolean z) {
        int i;
        int i2 = 2 % 2;
        TextView textView = this.editTextFormOldNoReenter;
        if (!z) {
            i = 8;
        } else {
            int i3 = d + 53;
            int i4 = i3 % 128;
            c = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 43;
            d = i6 % 128;
            int i7 = i6 % 2;
            i = 0;
        }
        textView.setVisibility(i);
        this.editTextFormNoOld.setEnabled(z);
        if (z) {
            return;
        }
        int i8 = d + 93;
        c = i8 % 128;
        if (i8 % 2 != 0) {
            this.editTextFormNoOld.setText(BuildConfig.FLAVOR);
            this.editTextFormOldNoReenter.setText(BuildConfig.FLAVOR);
        } else {
            this.editTextFormNoOld.setText(BuildConfig.FLAVOR);
            this.editTextFormOldNoReenter.setText(BuildConfig.FLAVOR);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static /* synthetic */ void lambda$generateBody$5(View view) {
        int i = 2 % 2;
        int i2 = c + 95;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ void lambda$imageButtonOnClickListeners$7(View view) {
        int i = 2 % 2;
        int i2 = d + 119;
        c = i2 % 128;
        int i3 = i2 % 2;
    }

    private /* synthetic */ void lambda$onCreateView$0(View view) {
        int i = 2 % 2;
        int i2 = c;
        int i3 = i2 + 47;
        d = i3 % 128;
        int i4 = i3 % 2;
        this.isOldScan = false;
        int i5 = i2 + 47;
        d = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private /* synthetic */ void lambda$onCreateView$1(View view) {
        int i = 2 % 2;
        int i2 = c;
        int i3 = i2 + 113;
        d = i3 % 128;
        int i4 = i3 % 2;
        this.isOldScan = true;
        int i5 = i2 + 85;
        d = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public void imageButtonOnClickListeners() {
        int i = 2 % 2;
        this.buttonThumb.setOnClickListener(ivas.gov.bisp.enumeration.bA.c.d);
        this.imageButtonBeneficiary.setOnClickListener(new h(this, 2));
        int i2 = c + 121;
        d = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 2 % 2;
        try {
            int i2 = 1;
            int i3 = 0;
            if (this.parentView == null) {
                this.myScanner = c.c(getActivity().getApplicationContext());
                View viewInflate = layoutInflater.inflate(R.layout.fragment_pictures, viewGroup, false);
                this.parentView = viewInflate;
                ButterKnife.c(this, viewInflate);
                this.activityBeginSurvey = (ActivityBeginSurvey) getActivity();
                this.sessionManager = new SessionManager(getActivity());
                this.bispApplication = (BISPApplication) getActivity().getApplicationContext();
                this.PERMISSION_ALL = 1;
                Object[] objArr = new Object[1];
                a((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1, new char[]{62176, 62081, 62459, 9024, 4688, 45982, 48906, 52487, 45531, 59323, 63178, 2807, 29752, 42211, 14960, 17984, 15221, 26969, 31109, 33560, 65503, 11696, 48260, 49298, 41494, 53963, 57418, 31852, 24903, 38771, 10154, 47401, 9705, 23432, 27368, 63104, 59404, 6353, 44617, 12865, 44891, 56672, 60815, 28478, 21485}, objArr);
                Object[] objArr2 = new Object[1];
                b(8 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), true, 40 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (-16776938) - Color.rgb(0, 0, 0), new char[]{'\f', 17, 23, 26, '\f', 22, '\t', 65517, 65519, 65513, 65530, 65527, 65532, 65531, 7, 65524, 65513, 65526, 65530, 65517, 65532, 0, 65517, 7, 65516, 65513, 65517, 65530, 65494, 22, 23, 17, 27, 27, 17, 21, 26, '\r', 24, 65494}, objArr2);
                final String[] strArr = {((String) objArr[0]).intern(), ((String) objArr2[0]).intern()};
                if (!hasPermissions(getActivity(), strArr)) {
                    int i4 = d + 13;
                    c = i4 % 128;
                    int i5 = i4 % 2;
                    k.c(getActivity(), strArr, this.PERMISSION_ALL);
                }
                Dialog dialog = new Dialog(getActivity());
                this.select_finger_dialog = dialog;
                dialog.setContentView(R.layout.dialog_capturefinger);
                Dialog dialog2 = this.select_finger_dialog;
                Object[] objArr3 = new Object[1];
                a((ViewConfiguration.getTapTimeout() >> 16) + 1, new char[]{38440, 38523, 38832, 18176, 55463, 31073, 27773, 7783, 54559, 33773}, objArr3);
                dialog2.setTitle(((String) objArr3[0]).intern());
                this.select_finger_dialog.setCancelable(false);
                this.rg_hands = (RadioGroup) this.select_finger_dialog.findViewById(R.id.rg_hands);
                this.left_hand = (RadioButton) this.select_finger_dialog.findViewById(R.id.left_hand);
                this.right_hand = (RadioButton) this.select_finger_dialog.findViewById(R.id.right_hand);
                this.select_finger = (Button) this.select_finger_dialog.findViewById(R.id.select_finger);
                this.imageview_fp = (ImageView) this.select_finger_dialog.findViewById(R.id.imageview_fp);
                this.imageFinger = (ImageView) this.parentView.findViewById(R.id.thumb_img);
                this.select_finger_dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentPictures.1
                    private static int a = 1;
                    private static int b;

                    @Override // android.content.DialogInterface.OnDismissListener
                    public void onDismiss(DialogInterface dialogInterface) {
                        int i6 = 2 % 2;
                        int i7 = a;
                        int i8 = i7 & 7;
                        int i9 = -(-(i7 | 7));
                        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
                        b = i10 % 128;
                        int i11 = i10 % 2;
                        FragmentPictures fragmentPictures = FragmentPictures.this;
                        fragmentPictures.isBioClicked = false;
                        fragmentPictures.isCapture = false;
                        fragmentPictures.exec.shutdownNow();
                        int i12 = (-2) - ((a + 80) ^ (-1));
                        b = i12 % 128;
                        int i13 = i12 % 2;
                        FragmentPictures fragmentPictures2 = FragmentPictures.this;
                        Object obj = null;
                        fragmentPictures2.exec = null;
                        int i14 = a;
                        int i15 = (i14 & 78) + (i14 | 78);
                        int i16 = (i15 ^ (-1)) + (i15 << 1);
                        b = i16 % 128;
                        if (i16 % 2 != 0) {
                            fragmentPictures2.myScanner.e();
                            throw null;
                        }
                        fragmentPictures2.myScanner.e();
                        int i17 = b;
                        int i18 = i17 & 5;
                        int i19 = (i18 - (~((i17 ^ 5) | i18))) - 1;
                        a = i19 % 128;
                        if (i19 % 2 != 0) {
                            return;
                        }
                        obj.hashCode();
                        throw null;
                    }
                });
                Spinner spinner = (Spinner) this.select_finger_dialog.findViewById(R.id.finger_index_spinner);
                ArrayAdapter arrayAdapter = new ArrayAdapter(getActivity(), R.layout.spinner_item, this.fingers);
                arrayAdapter.setDropDownViewResource(R.layout.spinner_item_dropdown);
                spinner.setAdapter((SpinnerAdapter) arrayAdapter);
                spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentPictures.2
                    private static int a = 0;
                    private static int b = 1;

                    @Override // android.widget.AdapterView.OnItemSelectedListener
                    public void onNothingSelected(AdapterView<?> adapterView) {
                        int i6 = 2 % 2;
                        int i7 = b;
                        int i8 = ((i7 & 119) - (~(-(-(i7 | 119))))) - 1;
                        a = i8 % 128;
                        if (i8 % 2 != 0) {
                            throw null;
                        }
                    }

                    @Override // android.widget.AdapterView.OnItemSelectedListener
                    public void onItemSelected(AdapterView<?> adapterView, View view, int i6, long j) {
                        int i7 = 2 % 2;
                        int i8 = a + 89;
                        b = i8 % 128;
                        int i9 = i8 % 2;
                        int checkedRadioButtonId = FragmentPictures.this.rg_hands.getCheckedRadioButtonId();
                        FragmentPictures fragmentPictures = FragmentPictures.this;
                        int i10 = b;
                        int i11 = i10 & 99;
                        int i12 = (((i10 | 99) & (~i11)) - (~(-(-(i11 << 1))))) - 1;
                        a = i12 % 128;
                        Object obj = null;
                        if (i12 % 2 != 0) {
                            fragmentPictures.right_hand.getId();
                            obj.hashCode();
                            throw null;
                        }
                        if (checkedRadioButtonId == fragmentPictures.right_hand.getId()) {
                            int i13 = b;
                            int i14 = (i13 & 29) + (i13 | 29);
                            a = i14 % 128;
                            int i15 = i14 % 2;
                            FragmentPictures.this.finger_index = i6;
                            int i16 = b;
                            int i17 = (i16 & (-92)) | ((~i16) & 91);
                            int i18 = (i16 & 91) << 1;
                            int i19 = (i17 & i18) + (i18 | i17);
                            a = i19 % 128;
                            if (i19 % 2 != 0) {
                                int i20 = 41 / 0;
                                return;
                            }
                            return;
                        }
                        if (checkedRadioButtonId == FragmentPictures.this.left_hand.getId()) {
                            int i21 = b;
                            int i22 = (i21 & 11) + (i21 | 11);
                            int i23 = i22 % 128;
                            a = i23;
                            if (i22 % 2 == 0 ? i6 != 1 : i6 != 0) {
                                int i24 = (i23 ^ 55) + ((i23 & 55) << 1);
                                b = i24 % 128;
                                if (i24 % 2 != 0 ? i6 == 2 : i6 == 3) {
                                    FragmentPictures.this.finger_index = 7;
                                    int i25 = a;
                                    int i26 = i25 & 41;
                                    int i27 = (i25 | 41) & (~i26);
                                    int i28 = -(-(i26 << 1));
                                    int i29 = (i27 & i28) + (i27 | i28);
                                    b = i29 % 128;
                                    if (i29 % 2 == 0) {
                                        throw null;
                                    }
                                    return;
                                }
                                int i30 = i23 & 35;
                                int i31 = ((~i30) & (i23 | 35)) + (i30 << 1);
                                b = i31 % 128;
                                int i32 = i31 % 2;
                                if (i6 == 3) {
                                    FragmentPictures.this.finger_index = 8;
                                    int i33 = a;
                                    int i34 = i33 & 117;
                                    int i35 = i34 + ((i33 ^ 117) | i34);
                                    b = i35 % 128;
                                    if (i35 % 2 == 0) {
                                        throw null;
                                    }
                                    return;
                                }
                                int i36 = (i23 ^ 61) + ((i23 & 61) << 1);
                                b = i36 % 128;
                                if (i36 % 2 != 0 ? i6 == 4 : i6 == 5) {
                                    FragmentPictures.this.finger_index = 9;
                                    int i37 = a;
                                    int i38 = ((i37 ^ 23) | (i37 & 23)) << 1;
                                    int i39 = -(((~i37) & 23) | (i37 & (-24)));
                                    int i40 = (i38 ^ i39) + ((i39 & i38) << 1);
                                    b = i40 % 128;
                                    int i41 = i40 % 2;
                                    return;
                                }
                                if (i6 == 5) {
                                    FragmentPictures.this.finger_index = 10;
                                    int i42 = b;
                                    int i43 = (i42 ^ 101) + ((i42 & 101) << 1);
                                    a = i43 % 128;
                                    if (i43 % 2 != 0) {
                                        int i44 = 90 / 0;
                                        return;
                                    }
                                    return;
                                }
                                int i45 = i23 & 89;
                                int i46 = (i23 | 89) & (~i45);
                                int i47 = i45 << 1;
                                int i48 = (i46 & i47) + (i46 | i47);
                                b = i48 % 128;
                                int i49 = i48 % 2;
                                FragmentPictures.this.finger_index = 0;
                                int i50 = a;
                                int i51 = (i50 & (-80)) | ((~i50) & 79);
                                int i52 = (i50 & 79) << 1;
                                int i53 = ((i51 | i52) << 1) - (i52 ^ i51);
                                b = i53 % 128;
                                int i54 = i53 % 2;
                                return;
                            }
                            FragmentPictures.this.finger_index = 6;
                            int i55 = b + 113;
                            a = i55 % 128;
                            int i56 = i55 % 2;
                        }
                        int i57 = b;
                        int i58 = ((i57 & 99) - (~(i57 | 99))) - 1;
                        a = i58 % 128;
                        int i59 = i58 % 2;
                    }
                });
                byte[] bArrDecode = Base64.decode(this.bispApplication.q, 0);
                this.imageFinger.setImageBitmap(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
                this.select_finger.setOnClickListener(new View.OnClickListener() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentPictures.3
                    private static int a = 0;
                    private static int b = 1;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        Bitmap bitmapCreateBitmap;
                        Bitmap.CompressFormat compressFormat;
                        int i6;
                        int i7 = 2 % 2;
                        int i8 = a;
                        int i9 = i8 ^ 21;
                        int i10 = (i8 & 21) << 1;
                        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
                        b = i11 % 128;
                        Object obj = null;
                        if (i11 % 2 == 0) {
                            FragmentPictures.this.select_finger_dialog.cancel();
                            throw null;
                        }
                        FragmentPictures.this.select_finger_dialog.cancel();
                        FragmentPictures fragmentPictures = FragmentPictures.this;
                        int i12 = a;
                        int i13 = i12 & 97;
                        int i14 = i13 + ((i12 ^ 97) | i13);
                        b = i14 % 128;
                        int i15 = i14 % 2;
                        if (fragmentPictures.bitmap == null) {
                            fragmentPictures.isBioClicked = false;
                            Context applicationContext = fragmentPictures.getActivity().getApplicationContext();
                            int i16 = b;
                            int i17 = i16 & 1;
                            int i18 = (i16 ^ 1) | i17;
                            int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
                            a = i19 % 128;
                            if (i19 % 2 != 0) {
                                Toast.makeText(applicationContext, "Fingerprint not Captured", 1).show();
                            } else {
                                Toast.makeText(applicationContext, "Fingerprint not Captured", 1).show();
                            }
                            int i20 = b + 89;
                            a = i20 % 128;
                            if (i20 % 2 != 0) {
                                throw null;
                            }
                            return;
                        }
                        int i21 = b;
                        int i22 = ((i21 ^ 40) + ((i21 & 40) << 1)) - 1;
                        a = i22 % 128;
                        (i22 % 2 != 0 ? Toast.makeText(fragmentPictures.getActivity().getApplicationContext(), "Fingerprint Captured", 0) : Toast.makeText(fragmentPictures.getActivity().getApplicationContext(), "Fingerprint Captured", 1)).show();
                        P pE = P.e();
                        int i23 = b;
                        int i24 = i23 & 35;
                        int i25 = -(-((i23 ^ 35) | i24));
                        int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
                        a = i26 % 128;
                        if (i26 % 2 != 0) {
                            Bitmap bitmap = FragmentPictures.this.bitmap;
                            Objects.requireNonNull(pE);
                            bitmapCreateBitmap = Bitmap.createBitmap(bitmap);
                            int i27 = 79 / 0;
                        } else {
                            Bitmap bitmap2 = FragmentPictures.this.bitmap;
                            Objects.requireNonNull(pE);
                            bitmapCreateBitmap = Bitmap.createBitmap(bitmap2);
                        }
                        Bitmap bitmapCopy = bitmapCreateBitmap.copy(Bitmap.Config.ARGB_8888, true);
                        Canvas canvas = new Canvas(bitmapCopy);
                        Paint paint = new Paint();
                        paint.setTextSize(30.0f);
                        int i28 = a;
                        int i29 = i28 & 117;
                        int i30 = ((i28 ^ 117) | i29) << 1;
                        int i31 = -((i28 | 117) & (~i29));
                        int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
                        b = i32 % 128;
                        int i33 = i32 % 2;
                        paint.setColor(-65536);
                        paint.setStyle(Paint.Style.FILL);
                        String strE = z.e();
                        int width = bitmapCopy.getWidth();
                        int height = bitmapCopy.getHeight();
                        int i34 = height ^ (-20);
                        int i35 = (height & (-20)) << 1;
                        canvas.drawText(strE, ((width | (-300)) << 1) - (width ^ (-300)), ((i34 | i35) << 1) - (i35 ^ i34), paint);
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        int i36 = b;
                        int i37 = (i36 | 31) << 1;
                        int i38 = -(((~i36) & 31) | (i36 & (-32)));
                        int i39 = ((i37 | i38) << 1) - (i38 ^ i37);
                        a = i39 % 128;
                        if (i39 % 2 != 0) {
                            compressFormat = Bitmap.CompressFormat.JPEG;
                            i6 = 9;
                        } else {
                            compressFormat = Bitmap.CompressFormat.JPEG;
                            i6 = 20;
                        }
                        bitmapCopy.compress(compressFormat, i6, byteArrayOutputStream);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        if (byteArray == null) {
                            Survey survey = FragmentPictures.access$000(FragmentPictures.this).aG;
                            int i40 = b;
                            int i41 = i40 & 51;
                            int i42 = -(-((i40 ^ 51) | i41));
                            int i43 = ((i41 | i42) << 1) - (i42 ^ i41);
                            a = i43 % 128;
                            int i44 = i43 % 2;
                            survey.image_thumb_imp = new byte[]{1, 2, 3, 4, 5};
                            FragmentPictures fragmentPictures2 = FragmentPictures.this;
                            int i45 = b + 51;
                            a = i45 % 128;
                            int i46 = i45 % 2;
                            SessionManager sessionManager = fragmentPictures2.sessionManager;
                            String strEncodeToString = Base64.encodeToString(new byte[]{1, 2, 3, 4, 5}, 0);
                            int i47 = b;
                            int i48 = i47 & 75;
                            int i49 = i48 + ((i47 ^ 75) | i48);
                            a = i49 % 128;
                            if (i49 % 2 != 0) {
                                sessionManager.d.putString("k_img_thumb", strEncodeToString);
                                obj.hashCode();
                                throw null;
                            }
                            sessionManager.d.putString("k_img_thumb", strEncodeToString);
                            sessionManager.d.apply();
                            int i50 = a + 120;
                            int i51 = (i50 ^ (-1)) + (i50 << 1);
                            b = i51 % 128;
                            int i52 = i51 % 2;
                            return;
                        }
                        int i53 = b + 89;
                        a = i53 % 128;
                        int i54 = i53 % 2;
                        SessionManager sessionManager2 = FragmentPictures.this.sessionManager;
                        String strEncodeToString2 = Base64.encodeToString(byteArray, 0);
                        int i55 = a;
                        int i56 = ((i55 & 70) + (i55 | 70)) - 1;
                        b = i56 % 128;
                        int i57 = i56 % 2;
                        sessionManager2.d.putString("k_img_thumb", strEncodeToString2);
                        int i58 = b;
                        int i59 = ((i58 ^ 120) + ((i58 & 120) << 1)) - 1;
                        a = i59 % 128;
                        int i60 = i59 % 2;
                        sessionManager2.d.apply();
                        int i61 = (-2) - ((b + 18) ^ (-1));
                        a = i61 % 128;
                        if (i61 % 2 != 0) {
                            FragmentPictures.access$000(FragmentPictures.this).aG.image_thumb_imp = byteArray;
                            throw null;
                        }
                        FragmentPictures.access$000(FragmentPictures.this).aG.image_thumb_imp = byteArray;
                        int i62 = b;
                        int i63 = ((i62 ^ 1) | (i62 & 1)) << 1;
                        int i64 = -(((~i62) & 1) | (i62 & (-2)));
                        int i65 = ((i63 | i64) << 1) - (i64 ^ i63);
                        a = i65 % 128;
                        if (i65 % 2 != 0) {
                            FragmentPictures fragmentPictures3 = FragmentPictures.this;
                            ImageView imageView = fragmentPictures3.imageFinger;
                            Bitmap bitmap3 = fragmentPictures3.bitmap;
                            throw null;
                        }
                        FragmentPictures fragmentPictures4 = FragmentPictures.this;
                        fragmentPictures4.imageFinger.setImageBitmap(fragmentPictures4.bitmap);
                        int i66 = a;
                        int i67 = i66 & 73;
                        int i68 = (((i66 ^ 73) | i67) << 1) - ((i66 | 73) & (~i67));
                        b = i68 % 128;
                        int i69 = i68 % 2;
                    }
                });
                this.thumb_impression_btn = (Button) this.parentView.findViewById(R.id.btn_take_thumb_imp);
                if (this.sessionManager.l().intValue() != 2 && this.sessionManager.l().intValue() != 3) {
                    Object[] objArr4 = new Object[1];
                    b((ViewConfiguration.getJumpTapTimeout() >> 16) + 9, false, 16 - View.resolveSize(0, 0), 293 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0), new char[]{'\f', 65512, 1, 65531, '\f', '\r', '\n', 65533, 11, 65502, '\n', 65529, 65535, 5, 65533, 6}, objArr4);
                    String strIntern = ((String) objArr4[0]).intern();
                    Object[] objArr5 = new Object[1];
                    b(7 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), true, 32 - MotionEvent.axisFromString(BuildConfig.FLAVOR), 284 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), new char[]{4, '\b', 21, 65510, 17, 18, '\b', 24, 21, 23, 65475, 22, '\f', 65475, '\b', 7, 18, 65520, 65475, '\b', 17, '\f', 15, 17, 65522, 65475, 65501, 26, '\b', '\f', 65529, '\b', 23}, objArr5);
                    Log.e(strIntern, ((String) objArr5[0]).intern());
                    this.thumb_impression_btn.setVisibility(4);
                } else if (BISPApplication.c().g) {
                    Object[] objArr6 = new Object[1];
                    b(9 - TextUtils.getTrimmedLength(BuildConfig.FLAVOR), false, 16 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0) + 295, new char[]{'\f', 65512, 1, 65531, '\f', '\r', '\n', 65533, 11, 65502, '\n', 65529, 65535, 5, 65533, 6}, objArr6);
                    String strIntern2 = ((String) objArr6[0]).intern();
                    Object[] objArr7 = new Object[1];
                    a(-ExpandableListView.getPackedPositionChild(0L), new char[]{61336, 61431, 45346, 24985, 38227, 13498, 39456, 59437, 44201, 42346, 29145, 12182, 26982, 58934, 48484, 25456, 9822, 11219, 65180, 42536, 57991, 28521, 15301, 58758, 48978, 36926, 26429, 22890, 31763, 54735, 41093, 39973, 14497, 6502}, objArr7);
                    Log.e(strIntern2, ((String) objArr7[0]).intern());
                    this.thumb_impression_btn.setVisibility(4);
                } else {
                    Object[] objArr8 = new Object[1];
                    b(Color.rgb(0, 0, 0) + 16777225, false, 16 - Color.alpha(0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 293, new char[]{'\f', 65512, 1, 65531, '\f', '\r', '\n', 65533, 11, 65502, '\n', 65529, 65535, 5, 65533, 6}, objArr8);
                    String strIntern3 = ((String) objArr8[0]).intern();
                    Object[] objArr9 = new Object[1];
                    b(20 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), true, KeyEvent.getDeadChar(0, 0) + 31, 285 - KeyEvent.getDeadChar(0, 0), new char[]{'\n', '\r', 15, 65520, 20, '\n', 65473, 65499, 24, 6, '\n', 65527, 6, 21, 2, 6, 19, 65508, 15, 16, 6, 20, '\r', 2, 7, 65473, 20, '\n', 65473, 6, 15}, objArr9);
                    Log.e(strIntern3, ((String) objArr9[0]).intern());
                    this.thumb_impression_btn.setVisibility(0);
                }
                this.thumb_impression_btn.setOnClickListener(new View.OnClickListener() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentPictures.4
                    private static int a = 1;
                    private static int b;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        String string;
                        Activity activity;
                        int iF;
                        c cVar;
                        int i6 = 2 % 2;
                        int i7 = b;
                        int i8 = ((i7 & 103) - (~(i7 | 103))) - 1;
                        a = i8 % 128;
                        Object obj = null;
                        if (i8 % 2 == 0) {
                            ivas.gov.bisp.enumeration.p091n.j.w("thumb_impression_btn On Click: isBioClicked : ");
                            obj.hashCode();
                            throw null;
                        }
                        StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("thumb_impression_btn On Click: isBioClicked : ");
                        FragmentPictures fragmentPictures = FragmentPictures.this;
                        int i9 = a;
                        int i10 = (i9 & (-70)) | ((~i9) & 69);
                        int i11 = (i9 & 69) << 1;
                        int i12 = (i10 & i11) + (i11 | i10);
                        b = i12 % 128;
                        if (i12 % 2 != 0) {
                            sbW.append(fragmentPictures.isBioClicked);
                            string = sbW.toString();
                            int i13 = 9 / 0;
                        } else {
                            sbW.append(fragmentPictures.isBioClicked);
                            string = sbW.toString();
                        }
                        Log.e("FragmentPictures", string);
                        FragmentPictures fragmentPictures2 = FragmentPictures.this;
                        if (!fragmentPictures2.isBioClicked) {
                            int i14 = b + 119;
                            a = i14 % 128;
                            int i15 = i14 % 2;
                            fragmentPictures2.isBioClicked = true;
                            StringBuilder sbW2 = ivas.gov.bisp.enumeration.p091n.j.w("thumb_impression_btn On Click: hasPermissions : ");
                            int i16 = b;
                            int i17 = i16 & 77;
                            int i18 = ((i16 | 77) & (~i17)) + (i17 << 1);
                            a = i18 % 128;
                            if (i18 % 2 == 0) {
                                FragmentPictures.this.getActivity();
                                throw null;
                            }
                            sbW2.append(FragmentPictures.hasPermissions(FragmentPictures.this.getActivity(), strArr));
                            String string2 = sbW2.toString();
                            int i19 = a + 23;
                            b = i19 % 128;
                            if (i19 % 2 != 0) {
                                Log.e("FragmentPictures", string2);
                                activity = FragmentPictures.this.getActivity();
                                int i20 = 34 / 0;
                            } else {
                                Log.e("FragmentPictures", string2);
                                activity = FragmentPictures.this.getActivity();
                            }
                            if (FragmentPictures.hasPermissions(activity, strArr)) {
                                int i21 = a;
                                int i22 = (i21 & (-32)) | ((~i21) & 31);
                                int i23 = (i21 & 31) << 1;
                                int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
                                b = i24 % 128;
                                if (i24 % 2 != 0) {
                                    iF = FragmentPictures.this.myScanner.f();
                                    cVar = FragmentPictures.this.myScanner;
                                    int i25 = 57 / 0;
                                } else {
                                    iF = FragmentPictures.this.myScanner.f();
                                    cVar = FragmentPictures.this.myScanner;
                                }
                                int iH = cVar.h();
                                int iJ = FragmentPictures.this.myScanner.j();
                                int i26 = b;
                                int i27 = i26 & 81;
                                int i28 = (i26 | 81) & (~i27);
                                int i29 = -(-(i27 << 1));
                                int i30 = ((i28 | i29) << 1) - (i28 ^ i29);
                                int i31 = i30 % 128;
                                a = i31;
                                int i32 = i30 % 2;
                                if (iH == 1) {
                                    int i33 = i31 & 75;
                                    int i34 = ((i31 ^ 75) | i33) << 1;
                                    int i35 = -((~i33) & (i31 | 75));
                                    int i36 = ((i34 | i35) << 1) - (i34 ^ i35);
                                    b = i36 % 128;
                                    if (i36 % 2 == 0 ? iJ == 1 : iJ == 0) {
                                        int i37 = i31 + 83;
                                        int i38 = i37 % 128;
                                        b = i38;
                                        int i39 = i37 % 2;
                                        if (iF == 1) {
                                            int i40 = ((i38 | 81) << 1) - (i38 ^ 81);
                                            a = i40 % 128;
                                            int i41 = i40 % 2;
                                            FragmentPictures.this.left_hand.setChecked(true);
                                            FragmentPictures fragmentPictures3 = FragmentPictures.this;
                                            int i42 = a;
                                            int i43 = (-2) - ((((i42 | 22) << 1) - (i42 ^ 22)) ^ (-1));
                                            b = i43 % 128;
                                            if (i43 % 2 != 0) {
                                                fragmentPictures3.right_hand.setChecked(true);
                                            } else {
                                                fragmentPictures3.right_hand.setChecked(false);
                                            }
                                            FragmentPictures.this.imageview_fp.setImageResource(R.drawable.image_boarder);
                                            FragmentPictures.this.select_finger_dialog.show();
                                            int i44 = b;
                                            int i45 = (i44 & 83) + (i44 | 83);
                                            a = i45 % 128;
                                            int i46 = i45 % 2;
                                            FragmentPictures.this.exec = Executors.newSingleThreadExecutor();
                                            FragmentPictures fragmentPictures4 = FragmentPictures.this;
                                            ExecutorService executorService = fragmentPictures4.exec;
                                            CaptureThread captureThread = fragmentPictures4.new CaptureThread();
                                            int i47 = a + 81;
                                            b = i47 % 128;
                                            if (i47 % 2 != 0) {
                                                executorService.execute(captureThread);
                                                FragmentPictures.this.isCapture = false;
                                                return;
                                            } else {
                                                executorService.execute(captureThread);
                                                FragmentPictures.this.isCapture = true;
                                                return;
                                            }
                                        }
                                    }
                                }
                                FragmentPictures fragmentPictures5 = FragmentPictures.this;
                                fragmentPictures5.isBioClicked = false;
                                Context applicationContext = fragmentPictures5.getActivity().getApplicationContext();
                                int i48 = a;
                                int i49 = (i48 & 43) + (i48 | 43);
                                b = i49 % 128;
                                int i50 = i49 % 2;
                                Toast.makeText(applicationContext, "Drivers not initialized,Please try again", 0).show();
                                Dialog dialog3 = FragmentPictures.this.select_finger_dialog;
                                int i51 = b;
                                int i52 = i51 & 87;
                                int i53 = (i52 - (~((i51 ^ 87) | i52))) - 1;
                                a = i53 % 128;
                                int i54 = i53 % 2;
                                dialog3.cancel();
                                int i55 = b;
                                int i56 = i55 ^ 97;
                                int i57 = (i55 & 97) << 1;
                                int i58 = (i56 & i57) + (i57 | i56);
                                a = i58 % 128;
                                int i59 = i58 % 2;
                                return;
                            }
                            FragmentPictures fragmentPictures6 = FragmentPictures.this;
                            fragmentPictures6.isBioClicked = false;
                            Activity activity2 = fragmentPictures6.getActivity();
                            int i60 = a;
                            int i61 = i60 & 105;
                            int i62 = (i60 | 105) & (~i61);
                            int i63 = i61 << 1;
                            int i64 = (i62 & i63) + (i63 | i62);
                            b = i64 % 128;
                            if (i64 % 2 != 0) {
                                k.c(activity2, strArr, FragmentPictures.this.PERMISSION_ALL);
                                throw null;
                            }
                            k.c(activity2, strArr, FragmentPictures.this.PERMISSION_ALL);
                        }
                        int i65 = b + 99;
                        a = i65 % 128;
                        int i66 = i65 % 2;
                    }
                });
                this.btn_qr_code.setOnClickListener(new h(this, i3));
                this.btn_old_qr_code.setOnClickListener(new ViewOnClickListenerC0191t(this, 3));
                this.btn_generate_code.setOnClickListener(new h(this, i2));
                imageButtonOnClickListeners();
                generateBody();
                this.btn_generate_code.performClick();
            } else {
                Activity activity = getActivity();
                Object[] objArr10 = new Object[1];
                b(View.MeasureSpec.getMode(0) + 14, true, Color.red(0) + 18, (Process.myTid() >> 22) + 287, new char[]{65471, 18, '\b', 65471, 22, 4, '\b', 65525, 19, '\r', 4, 17, 0, 65519, 11, 11, 20, '\r'}, objArr10);
                Toast.makeText(activity, ((String) objArr10[0]).intern(), 0).show();
                int i6 = c + 53;
                d = i6 % 128;
                int i7 = i6 % 2;
            }
        } catch (Exception unused) {
        }
        return this.parentView;
    }

    @Override // ivas.gov.bisp.enumeration.X.e
    public SupervisorParseObject parseJsonForSupervisor() {
        int i = 2 % 2;
        int i2 = d + 15;
        int i3 = i2 % 128;
        c = i3;
        if (i2 % 2 == 0) {
            int i4 = 92 / 0;
        }
        int i5 = i3 + 89;
        d = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private void lambda$generateBody$6(View view) {
        int i = 2 % 2;
        int i2 = c + 43;
        d = i2 % 128;
        int i3 = i2 % 2;
        if (this.activityBeginSurvey.aG.image_selfie != null) {
            int i4 = c + 87;
            d = i4 % 128;
            int i5 = i4 % 2;
            try {
                P pE = P.e();
                Activity activity = getActivity();
                Bitmap bitmapG = P.e().g(this.activityBeginSurvey.aG.image_selfie);
                Object[] objArr = new Object[1];
                a(-TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0), new char[]{39144, 39096, 12031, 65091, 49873, 25368, 5674, 25633, 56265, 15012, 9802}, objArr);
                pE.h(activity, bitmapG, ((String) objArr[0]).intern());
                int i6 = d + 59;
                c = i6 % 128;
                int i7 = i6 % 2;
            } catch (Exception unused) {
            }
        }
    }

    private void lambda$onCreateView$2(View view) {
        String string;
        int i = 2 % 2;
        int i2 = c + 107;
        d = i2 % 128;
        int i3 = i2 % 2;
        SharedPreferences sharedPreferences = ah.c.d;
        Object[] objArr = new Object[1];
        a(1 - (ViewConfiguration.getScrollDefaultDelay() >> 16), new char[]{57275, 57298, 16659, 37291, 21528, 62935, 58192, 37190, 40112, 21847, 45191, 22240}, objArr);
        String string2 = sharedPreferences.getString(((String) objArr[0]).intern(), BuildConfig.FLAVOR);
        if (string2 == null || string2.equals(BuildConfig.FLAVOR) || string2.length() <= 5) {
            StringBuilder sb = new StringBuilder();
            sb.append(new Date().getTime());
            string = sb.toString();
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string2.substring(0, 5));
            Object[] objArr2 = new Object[1];
            b(-TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0), false, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1, 235 - (ViewConfiguration.getTapTimeout() >> 16), new char[]{0}, objArr2);
            sb2.append(((String) objArr2[0]).intern());
            sb2.append(new Date().getTime());
            string = sb2.toString();
        }
        if (!checkIfSurveyIsUnique(string)) {
            C0104p c0104pC = C0104p.c();
            Activity activity = getActivity();
            Object[] objArr3 = new Object[1];
            a((ViewConfiguration.getScrollDefaultDelay() >> 16) + 1, new char[]{52785, 52862, 48139, 27825, 54138, 29344, 34881, 64077, 36164}, objArr3);
            String strIntern = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            b((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 27, true, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 48, 283 - View.MeasureSpec.getMode(0), new char[]{65453, 65489, 17, '\b', 14, 4, 23, 65475, 28, 7, 4, '\b', 21, 15, 4, 65475, 21, '\b', 5, 16, 24, 17, 65475, 16, 21, 18, 65513, 17, '\f', 4, '\n', 4, 65475, '\b', 23, 4, 21, '\b', 17, '\b', '\n', 65475, '\b', 22, 4, '\b', 15, 65523}, objArr4);
            c0104pC.e(activity, strIntern, ((String) objArr4[0]).intern(), null, false);
            return;
        }
        Activity activity2 = getActivity();
        StringBuilder sb3 = new StringBuilder();
        Object[] objArr5 = new Object[1];
        b(11 - (ViewConfiguration.getLongPressTimeout() >> 16), false, (KeyEvent.getMaxKeyCode() >> 16) + 18, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 282, new char[]{'\n', '\t', 65477, 65523, 26, 18, 7, '\n', 23, 65503, 65477, 65516, '\n', 19, '\n', 23, 6, 25}, objArr5);
        sb3.append(((String) objArr5[0]).intern());
        sb3.append(string);
        Toast.makeText(activity2, sb3.toString(), 1).show();
        this.editTextFormNo.setText(string);
        int i4 = d + 67;
        c = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // android.app.Fragment
    public void onResume() {
        int i = 2 % 2;
        int i2 = d + 81;
        c = i2 % 128;
        if (i2 % 2 == 0) {
            super.onResume();
            generateBody();
            this.btn_generate_code.performClick();
            showMultiStroy();
            int i3 = 85 / 0;
        } else {
            super.onResume();
            generateBody();
            this.btn_generate_code.performClick();
            showMultiStroy();
        }
        int i4 = d + 41;
        c = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private void showMultiStroy() {
        int i = 2 % 2;
        ag.h.equals(BuildConfig.FLAVOR);
        this.checkBoxMultistory.setVisibility(8);
        int i2 = this.activityBeginSurvey.ac;
        if (i2 != 0) {
            int i3 = d + 87;
            c = i3 % 128;
            int i4 = i3 % 2;
            if (i2 != 2) {
                return;
            }
        }
        this.checkBoxMultistory.setVisibility(8);
        int i5 = d + 51;
        c = i5 % 128;
        int i6 = i5 % 2;
    }

    private void lambda$imageButtonOnClickListeners$8(View view) {
        int i = 2 % 2;
        int i2 = c + 119;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 89 / 0;
            if (this.activityBeginSurvey.aG.image_benificiary == null) {
                return;
            }
        } else if (this.activityBeginSurvey.aG.image_benificiary == null) {
            return;
        }
        int i4 = c + 45;
        d = i4 % 128;
        int i5 = i4 % 2;
        try {
            P pE = P.e();
            Activity activity = getActivity();
            Bitmap bitmapG = P.e().g(this.activityBeginSurvey.aG.image_benificiary);
            Object[] objArr = new Object[1];
            a(1 - Color.green(0), new char[]{39144, 39096, 12031, 65091, 49873, 25368, 5674, 25633, 56265, 15012, 9802}, objArr);
            pE.h(activity, bitmapG, ((String) objArr[0]).intern());
            int i6 = c + 49;
            d = i6 % 128;
            int i7 = i6 % 2;
        } catch (Exception unused) {
        }
    }

    private void setDummyData() {
        int i = 2 % 2;
        int i2 = c + 37;
        d = i2 % 128;
        int i3 = i2 % 2;
        Survey survey = this.activityBeginSurvey.aG;
        survey.image_benificiary = new byte[]{1, 2, 3, 4, 5};
        Object[] objArr = new Object[1];
        a(1 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0), new char[]{21900, 21998, 62177, 8785, 6908, 47928, 49974, 45344, 5800, 59041, 65121, 30347, 54085, 42481, 13003}, objArr);
        survey.image_benificiary_name = ((String) objArr[0]).intern();
        survey.image_selfie = new byte[]{1, 2, 3, 4, 5};
        Object[] objArr2 = new Object[1];
        b(KeyEvent.keyCodeFromString(BuildConfig.FLAVOR) + 6, true, 12 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 294 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), new char[]{65533, 1, 65534, 4, 65533, 11, 65533, 5, 65529, 6, 65531}, objArr2);
        survey.image_selfie_name = ((String) objArr2[0]).intern();
        int i4 = c + 115;
        d = i4 % 128;
        int i5 = i4 % 2;
    }

    public class CaptureThread implements Runnable {
        private static int a = 1;
        private static int b;

        public CaptureThread() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = 2 % 2;
            while (true) {
                FragmentPictures fragmentPictures = FragmentPictures.this;
                if (!fragmentPictures.isCapture) {
                    int i2 = b;
                    int i3 = (((i2 & (-54)) | ((~i2) & 53)) - (~(-(-((i2 & 53) << 1))))) - 1;
                    a = i3 % 128;
                    int i4 = i3 % 2;
                    return;
                }
                int i5 = b;
                int i6 = i5 & 105;
                int i7 = ((i5 | 105) & (~i6)) + (i6 << 1);
                a = i7 % 128;
                int i8 = i7 % 2;
                Objects.requireNonNull(fragmentPictures.myScanner);
                long jCurrentTimeMillis = System.currentTimeMillis();
                FragmentPictures fragmentPictures2 = FragmentPictures.this;
                int i9 = b;
                int i10 = ((((i9 ^ 111) | (i9 & 111)) << 1) - (~(-(((~i9) & 111) | (i9 & (-112)))))) - 1;
                a = i10 % 128;
                int i11 = i10 % 2;
                int i12 = fragmentPictures2.myScanner.i(fragmentPictures2.rawData);
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                int i13 = a + 25;
                int i14 = i13 % 128;
                b = i14;
                int i15 = i13 % 2;
                if (i12 == 1) {
                    int i16 = (i14 & (-12)) | ((~i14) & 11);
                    int i17 = -(-((i14 & 11) << 1));
                    int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
                    a = i18 % 128;
                    if (i18 % 2 == 0) {
                        FragmentPictures fragmentPictures3 = FragmentPictures.this;
                        byte[] bArr = fragmentPictures3.rawData;
                        int i19 = fragmentPictures3.IMAGE_WIDTH;
                        int i20 = fragmentPictures3.IMAGE_HEIGHT;
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    FragmentPictures fragmentPictures4 = FragmentPictures.this;
                    ivas.gov.bisp.enumeration.bC.e.d(fragmentPictures4.rawData, fragmentPictures4.IMAGE_WIDTH, fragmentPictures4.IMAGE_HEIGHT);
                    FragmentPictures fragmentPictures5 = FragmentPictures.this;
                    fragmentPictures5.bmpData = ivas.gov.bisp.enumeration.bC.e.b(fragmentPictures5.rawData, fragmentPictures5.IMAGE_WIDTH, fragmentPictures5.IMAGE_HEIGHT);
                    Message message = new Message();
                    message.what = 0;
                    Bundle bundle = new Bundle();
                    int i21 = a;
                    int i22 = i21 ^ 57;
                    int i23 = ((i21 & 57) | i22) << 1;
                    int i24 = -i22;
                    int i25 = (i23 ^ i24) + ((i23 & i24) << 1);
                    b = i25 % 128;
                    int i26 = i25 % 2;
                    StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w(BuildConfig.FLAVOR);
                    sbW.append(jCurrentTimeMillis2 - jCurrentTimeMillis);
                    int i27 = a;
                    int i28 = ((i27 & (-98)) | ((~i27) & 97)) + ((i27 & 97) << 1);
                    b = i28 % 128;
                    int i29 = i28 % 2;
                    bundle.putString("time", sbW.toString());
                    int i30 = a;
                    int i31 = (i30 ^ 25) + ((i30 & 25) << 1);
                    b = i31 % 128;
                    int i32 = i31 % 2;
                    message.setData(bundle);
                    FragmentPictures.this.msgHandler.sendMessage(message);
                    int i33 = b;
                    int i34 = i33 ^ 117;
                    int i35 = ((i33 & 117) | i34) << 1;
                    int i36 = -i34;
                    int i37 = (i35 & i36) + (i35 | i36);
                    a = i37 % 128;
                    if (i37 % 2 == 0) {
                        int i38 = 4 % 4;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x007d, code lost:
    
        if (r2.equals(net.sqlcipher.BuildConfig.FLAVOR) != false) goto L21;
     */
    @Override // ivas.gov.bisp.enumeration.X.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean isValid() {
        /*
            Method dump skipped, instruction units count: 1761
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.fragments.FragmentPictures.isValid():boolean");
    }

    @Override // android.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = 2 % 2;
        int i4 = c + 107;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (i2 == -1) {
            if (i == 2) {
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inSampleSize = 8;
                    Bitmap bitmapF = P.f(this.photoPath, BitmapFactory.decodeFile(this.photoPath, options));
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmapF.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    this.imageButtonBeneficiary.setImageBitmap(Bitmap.createScaledBitmap(bitmapF, 80, 80, true));
                    this.imageButtonBeneficiary.setVisibility(0);
                    Survey survey = this.activityBeginSurvey.aG;
                    survey.image_benificiary = byteArray;
                    StringBuilder sb = new StringBuilder();
                    Object[] objArr = new Object[1];
                    b((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1, false, 12 - ExpandableListView.getPackedPositionType(0L), 294 - Color.blue(0), new char[]{65527, 65530, 65533, 6, 1, 65534, 1, 65531, 1, 65529, '\n', 17}, objArr);
                    sb.append(((String) objArr[0]).intern());
                    sb.append(z.e());
                    survey.image_benificiary_name = sb.toString();
                    File file = new File(this.photoPath);
                    if (file.exists()) {
                        file.delete();
                    }
                    Activity activity = getActivity();
                    Object[] objArr2 = new Object[1];
                    a(1 - View.getDefaultSize(0, 0), new char[]{24065, 24136, 25012, 45324, 64700, 23927, 22010, 10210, 7472, 30141, 6166, 57416, 55490, 13996, 54400, 44284}, objArr2);
                    Toast.makeText(activity, ((String) objArr2[0]).intern(), 1).show();
                    return;
                } catch (Exception e) {
                    Activity activity2 = getActivity();
                    Object[] objArr3 = new Object[1];
                    b(9 - KeyEvent.keyCodeFromString(BuildConfig.FLAVOR), true, 19 - (ViewConfiguration.getTapTimeout() >> 16), KeyEvent.normalizeMetaState(0) + 283, new char[]{17, 18, '\f', 23, 19, '\b', 6, 27, 65512, 65453, 65501, '\b', 21, 24, 23, 6, '\f', 65523, 65475}, objArr3);
                    StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w(((String) objArr3[0]).intern());
                    sbW.append(e.getMessage());
                    Toast.makeText(activity2, sbW.toString(), 0).show();
                    return;
                }
            }
            if (i == 3) {
                try {
                    BitmapFactory.Options options2 = new BitmapFactory.Options();
                    options2.inSampleSize = 8;
                    Bitmap bitmapF2 = P.f(this.photoPath, BitmapFactory.decodeFile(this.photoPath, options2));
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    bitmapF2.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream2);
                    byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                    this.imageButtonSelfie.setImageBitmap(Bitmap.createScaledBitmap(bitmapF2, 80, 80, true));
                    this.imageButtonSelfie.setVisibility(0);
                    Survey survey2 = this.activityBeginSurvey.aG;
                    survey2.image_selfie = byteArray2;
                    StringBuilder sb2 = new StringBuilder();
                    Object[] objArr4 = new Object[1];
                    a((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), new char[]{22066, 22081, 8475, 61867, 61999, 21481, 25952, 6009, 5391, 13655, 5774}, objArr4);
                    sb2.append(((String) objArr4[0]).intern());
                    sb2.append(z.e());
                    survey2.image_selfie_name = sb2.toString();
                    File file2 = new File(this.photoPath);
                    if (file2.exists()) {
                        file2.delete();
                    }
                    Activity activity3 = getActivity();
                    Object[] objArr5 = new Object[1];
                    a((ViewConfiguration.getTapTimeout() >> 16) + 1, new char[]{24065, 24136, 25012, 45324, 64700, 23927, 22010, 10210, 7472, 30141, 6166, 57416, 55490, 13996, 54400, 44284}, objArr5);
                    Toast.makeText(activity3, ((String) objArr5[0]).intern(), 1).show();
                    int i5 = d + 95;
                    c = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 53 / 0;
                        return;
                    }
                    return;
                } catch (Exception e2) {
                    Activity activity4 = getActivity();
                    Object[] objArr6 = new Object[1];
                    b(9 - (ViewConfiguration.getEdgeSlop() >> 16), true, TextUtils.getTrimmedLength(BuildConfig.FLAVOR) + 19, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 282, new char[]{17, 18, '\f', 23, 19, '\b', 6, 27, 65512, 65453, 65501, '\b', 21, 24, 23, 6, '\f', 65523, 65475}, objArr6);
                    StringBuilder sbW2 = ivas.gov.bisp.enumeration.p091n.j.w(((String) objArr6[0]).intern());
                    sbW2.append(e2.getMessage());
                    Toast.makeText(activity4, sbW2.toString(), 0).show();
                }
            }
        }
        int i7 = d + 47;
        c = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 73 / 0;
        }
    }

    @Override // ivas.gov.bisp.enumeration.X.e
    public void parseJson() {
        int i = 2 % 2;
        boolean z = ag.d;
        Object obj = null;
        String string = BuildConfig.FLAVOR;
        if (z) {
            BISPApplication bISPApplication = this.bispApplication;
            if (bISPApplication != null) {
                int i2 = d + 17;
                c = i2 % 128;
                if (i2 % 2 == 0) {
                    bISPApplication.J.equals(BuildConfig.FLAVOR);
                    obj.hashCode();
                    throw null;
                }
                if (bISPApplication.J.equals(BuildConfig.FLAVOR)) {
                    this.activityBeginSurvey.aG.form_no_not_at_home = this.editTextFormNo.getText().toString();
                } else {
                    this.activityBeginSurvey.aG.form_no_not_at_home = String.valueOf(this.bispApplication.J);
                }
            } else {
                BISPApplication bISPApplication2 = (BISPApplication) getActivity().getApplicationContext();
                this.bispApplication = bISPApplication2;
                if (!bISPApplication2.J.equals(BuildConfig.FLAVOR)) {
                    int i3 = d + 29;
                    c = i3 % 128;
                    int i4 = i3 % 2;
                    this.activityBeginSurvey.aG.form_no_not_at_home = String.valueOf(this.bispApplication.J);
                } else {
                    this.activityBeginSurvey.aG.form_no_not_at_home = this.editTextFormNo.getText().toString();
                    int i5 = c + 7;
                    d = i5 % 128;
                    int i6 = i5 % 2;
                }
            }
        } else {
            new Survey().form_no = this.editTextFormNo.getText().toString();
            this.activityBeginSurvey.aG.form_no = this.editTextFormNo.getText().toString();
            this.bispApplication.J = this.editTextFormNo.getText().toString();
        }
        this.activityBeginSurvey.aG.reCollectionFlag = this.checkBoxRecollection.isChecked() ? 1 : 0;
        this.activityBeginSurvey.aG.comments = this.editTextComments.getText().toString();
        Survey survey = this.activityBeginSurvey.aG;
        if (!(!this.checkBoxRecollection.isChecked())) {
            int i7 = d + 71;
            c = i7 % 128;
            if (i7 % 2 == 0) {
                this.editTextFormNoOld.getText().toString();
                obj.hashCode();
                throw null;
            }
            string = this.editTextFormNoOld.getText().toString();
        }
        survey.form_no_old = string;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x00e6  */
    private void generateBody() {
        int i = 2 % 2;
        setDummyData();
        this.editTextComments.setVisibility(8);
        SharedPreferences sharedPreferences = ah.c.d;
        int i2 = 1;
        Object[] objArr = new Object[1];
        a(1 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), new char[]{57275, 57298, 16659, 37291, 21528, 62935, 58192, 37190, 40112, 21847, 45191, 22240}, objArr);
        String string = sharedPreferences.getString(((String) objArr[0]).intern(), BuildConfig.FLAVOR);
        this.editTextFormNo.setEnabled(false);
        this.editTextFormNo.setVisibility(8);
        this.editTextFormNoOld.setVisibility(8);
        this.editTextFormNoOld.setEnabled(false);
        if (ag.c) {
            int i3 = d + 115;
            c = i3 % 128;
            int i4 = i3 % 2;
            this.linearLayoutThumb.setVisibility(0);
            this.btn_qr_code.setVisibility(8);
            this.btn_generate_code.setVisibility(0);
        } else {
            this.linearLayoutThumb.setVisibility(8);
            this.btn_qr_code.setVisibility(8);
            this.btn_generate_code.setVisibility(8);
            if (string == null || string.equals(BuildConfig.FLAVOR)) {
                TextView textView = this.editTextFormNo;
                StringBuilder sb = new StringBuilder();
                sb.append(new Date().getTime());
                textView.setText(sb.toString());
            } else {
                int i5 = d + 99;
                c = i5 % 128;
                if (i5 % 2 != 0 ? string.length() <= 5 : string.length() <= 2) {
                    TextView textView2 = this.editTextFormNo;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(new Date().getTime());
                    textView2.setText(sb2.toString());
                } else {
                    TextView textView3 = this.editTextFormNo;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(string.substring(0, 5));
                    Object[] objArr2 = new Object[1];
                    b(TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0) + 1, false, 1 - (ViewConfiguration.getWindowTouchSlop() >> 8), Color.red(0) + 235, new char[]{0}, objArr2);
                    sb3.append(((String) objArr2[0]).intern());
                    sb3.append(new Date().getTime());
                    textView3.setText(sb3.toString());
                }
            }
        }
        if (ag.d) {
            if (ag.c) {
                this.linearLayoutThumb.setVisibility(0);
                this.btn_qr_code.setVisibility(8);
                this.btn_qr_code.setEnabled(true);
                this.btn_generate_code.setVisibility(0);
                this.btn_generate_code.setEnabled(true);
            } else {
                this.editTextFormNo.setText(this.activityBeginSurvey.aG.form_no);
                this.linearLayoutThumb.setVisibility(8);
                this.btn_qr_code.setVisibility(8);
                this.btn_qr_code.setEnabled(false);
                this.btn_generate_code.setVisibility(8);
                this.btn_generate_code.setEnabled(false);
            }
        }
        this.checkBoxRecollection.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ivas.gov.bisp.enumeration.bA.r
            private static int a = 1;
            private static int b;

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i6 = 2 % 2;
                int i7 = b;
                int i8 = i7 & 109;
                int i9 = -(-((i7 ^ 109) | i8));
                int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
                a = i10 % 128;
                if (i10 % 2 == 0) {
                    FragmentPictures.d(this.c, compoundButton, z);
                    throw null;
                }
                FragmentPictures.d(this.c, compoundButton, z);
                int i11 = b;
                int i12 = i11 & 9;
                int i13 = (i12 - (~((i11 ^ 9) | i12))) - 1;
                a = i13 % 128;
                int i14 = i13 % 2;
            }
        });
        this.checkBoxOldRec.setOnCheckedChangeListener(new a(this, i2));
        int i6 = this.activityBeginSurvey.ac;
        int i7 = 3;
        if (i6 == 1 || i6 == 2) {
            SharedPreferences sharedPreferences2 = ah.c.d;
            Object[] objArr3 = new Object[1];
            a(View.getDefaultSize(0, 0) + 1, new char[]{44127, 44076, 59054, 13854, 21771, 62669, 54808, 41985, 61282, 62178, 45482, 25529, 10902, 45501, 32061, 12112, 26062, 31776, 16067, 59916}, objArr3);
            int i8 = sharedPreferences2.getInt(((String) objArr3[0]).intern(), 0);
            SharedPreferences sharedPreferences3 = ah.c.d;
            Object[] objArr4 = new Object[1];
            a((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), new char[]{21933, 21982, 42762, 30650, 64960, 23558, 38102, 59087, 5776, 45894, 6497, 8550, 54122, 61442, 54780, 28037, 39988, 15785}, objArr4);
            if (i8 == sharedPreferences3.getInt(((String) objArr4[0]).intern(), 0)) {
                int i9 = this.activityBeginSurvey.ac;
                if (i9 == 1) {
                    Button button = this.buttonSelfie;
                    Object[] objArr5 = new Object[1];
                    b(View.resolveSizeAndState(0, 0, 0) + 17, false, View.MeasureSpec.getSize(0) + 17, 289 - (ViewConfiguration.getLongPressTimeout() >> 16), new char[]{65506, 11, 18, '\n', 2, 15, 65534, 17, '\f', 15, 65469, 65520, 2, '\t', 3, 6, 2}, objArr5);
                    button.setText(((String) objArr5[0]).intern());
                } else if (i9 == 2) {
                    Button button2 = this.buttonSelfie;
                    Object[] objArr6 = new Object[1];
                    b((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 5, true, 20 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), Color.argb(0, 0, 0, 0) + 284, new char[]{65487, 22, 17, 18, 65525, 7, 11, '\b', 14, 7, 65525, 65474, 20, 7, '\r', 5, 7, '\n', 65509}, objArr6);
                    button2.setText(((String) objArr6[0]).intern());
                    int i10 = d + 33;
                    c = i10 % 128;
                    if (i10 % 2 == 0) {
                        int i11 = 3 / 2;
                    }
                }
                this.buttonSelfie.setOnClickListener(ivas.gov.bisp.enumeration.bA.c.e);
                this.imageButtonSelfie.setOnClickListener(new h(this, i7));
            }
        }
        showMultiStroy();
        if (ag.n != 3) {
            this.checkBoxRecollection.setVisibility(8);
        } else if (((ActivityBeginSurvey) getActivity()).aA.getIsReCollection() == 1) {
            this.checkBoxRecollection.setVisibility(0);
            TextView textView4 = this.textViewTitle;
            Object[] objArr7 = new Object[1];
            b((KeyEvent.getMaxKeyCode() >> 16) + 13, false, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 24, 284 - ((byte) KeyEvent.getModifierMetaStateMask()), new char[]{21, 65473, 65506, 17, 17, '\r', '\n', 4, 2, 21, '\n', 16, 15, 65519, 65524, 65510, 65523, 65473, 65524, 22, 17, 17, 16, 19}, objArr7);
            textView4.setText(((String) objArr7[0]).intern());
        } else {
            this.checkBoxRecollection.setVisibility(8);
            this.linearLayoutOld.setVisibility(8);
            TextView textView5 = this.textViewTitle;
            Object[] objArr8 = new Object[1];
            b(MotionEvent.axisFromString(BuildConfig.FLAVOR) + 5, false, Color.green(0) + 16, TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0) + 284, new char[]{65526, 6, 4, 17, 65527, 11, 24, 16, 5, 65475, 65523, 21, '\f', 17, 23, 65475}, objArr8);
            textView5.setText(((String) objArr8[0]).intern());
        }
        if (this.activityBeginSurvey.ac != 2) {
            this.btn_generate_code.setVisibility(8);
            return;
        }
        this.linearLayoutThumb.setVisibility(8);
        this.checkBoxRecollection.setVisibility(8);
        int i12 = this.activityBeginSurvey.aG.bisp_survey_taken_before;
        if (i12 == 0) {
            this.btn_qr_code.setVisibility(8);
        } else if (i12 == 1) {
            this.btn_qr_code.setVisibility(0);
        }
    }

    private static void a(int i, char[] cArr, Object[] objArr) {
        int i2 = 2 % 2;
        g gVar = new g();
        char[] cArrB = g.b(d$s40$3353 ^ (-3439381718914712265L), cArr, i);
        gVar.a = 4;
        int i3 = $11 + 121;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (gVar.a < cArrB.length) {
            int i5 = $11 + 103;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            gVar.c = gVar.a - 4;
            cArrB[gVar.a] = (char) (((long) (cArrB[gVar.a] ^ cArrB[gVar.a % 4])) ^ (((long) gVar.c) * (d$s40$3353 ^ (-3439381718914712265L))));
            gVar.a++;
        }
        objArr[0] = new String(cArrB, 4, cArrB.length - 4);
    }

    private static void b(int i, boolean z, int i2, int i3, char[] cArr, Object[] objArr) {
        int i4 = 2 % 2;
        o.a aVar = new o.a();
        char[] cArr2 = new char[i2];
        aVar.b = 0;
        while (aVar.b < i2) {
            int i5 = $11 + 83;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            aVar.a = cArr[aVar.b];
            cArr2[aVar.b] = (char) (aVar.a + i3);
            int i7 = aVar.b;
            cArr2[i7] = (char) (cArr2[i7] - ((int) (((long) a$s14$3454) ^ (-3199524018197912079L))));
            aVar.b++;
        }
        if (i > 0) {
            aVar.c = i;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - aVar.c, aVar.c);
            System.arraycopy(cArr3, aVar.c, cArr2, 0, i2 - aVar.c);
        }
        if (!(!z)) {
            int i8 = $10 + 103;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            char[] cArr4 = new char[i2];
            aVar.b = 0;
            while (aVar.b < i2) {
                cArr4[aVar.b] = cArr2[(i2 - aVar.b) - 1];
                aVar.b++;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }
}
