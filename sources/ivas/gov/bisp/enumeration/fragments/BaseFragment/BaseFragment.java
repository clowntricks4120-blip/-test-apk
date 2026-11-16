package ivas.gov.bisp.enumeration.fragments.BaseFragment;

import android.app.Dialog;
import android.app.Fragment;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.AudioTrack;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Base64;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import ivas.gov.bisp.enumeration.BISPApplication;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.activitybase.BaseAuth;
import ivas.gov.bisp.enumeration.activitybase.c;
import ivas.gov.bisp.enumeration.bK.G;
import ivas.gov.bisp.enumeration.bK.ac;
import ivas.gov.bisp.enumeration.bK.b;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.p002ab.C0084m;
import ivas.gov.bisp.enumeration.p024ax.I;
import ivas.gov.bisp.enumeration.p024ax.ax;
import ivas.gov.bisp.enumeration.p091n.j;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import net.sqlcipher.BuildConfig;
import o.m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseFragment extends Fragment implements View.OnClickListener, c.aPw {
    private static int a = 1;
    private static int b;
    public BISPApplication _bispApplication;
    public Bitmap _bitmap;
    public byte[] _bmpData;
    public int _count;
    public ExecutorService _exec;
    public Spinner _fingerIndexSpinner;
    public TextView _fingerPrintSelectionHeadingTextView;
    public ImageView _imageview_fp;
    public boolean _isCapture;
    public RadioButton _left_hand;
    public ProgressDialog _mProgressBar;
    public ivas.gov.bisp.enumeration.p037bj.c _myScanner;
    public ProgressDialog _progressDialog;
    public RadioGroup _radioGroupFingers;
    public RadioGroup _rg_hands;
    public RelativeLayout _rlMain;
    public RelativeLayout _rlfingerMain;
    public Button _select_finger;
    public Dialog _select_finger_dialog;
    public SessionManager _sessionManager;
    public Context context;
    public RadioButton right_hand;
    public final int _PERMISSION_ALL = 1;
    public final String[] _PERMISSIONS = {"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};
    public int _finger_index = 0;
    public int _IMAGE_WIDTH = 256;
    public int _IMAGE_HEIGHT = 360;
    public byte[] _rawData = new byte[92160];
    public String _imageTemplate = BuildConfig.FLAVOR;
    public c timerForTouch = new c(getActivity(), this);
    public String[] _fingers = {"برائے مہربانی  جواب دہندہ کی انگلی کا انتخاب کریں", "انگوٹھا", "شہادت کی انگلی", "درمیانی انگلی", "انگوٹھی والی انگلی", "چھوٹی انگلی"};
    public Handler _msgHandler = new Handler() { // from class: ivas.gov.bisp.enumeration.fragments.BaseFragment.BaseFragment.1
        private static int a = 1;
        private static int b;

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 & (-62)) | ((~i2) & 61)) + ((i2 & 61) << 1);
            a = i3 % 128;
            int i4 = i3 % 2;
            if (message.what == 0) {
                int i5 = b;
                int i6 = ((i5 | 83) << 1) - (i5 ^ 83);
                a = i6 % 128;
                int i7 = i6 % 2;
                BaseFragment baseFragment = BaseFragment.this;
                if (baseFragment._isCapture) {
                    int i8 = b;
                    int i9 = i8 & 85;
                    int i10 = ((((i8 ^ 85) | i9) << 1) - (~(-((i8 | 85) & (~i9))))) - 1;
                    a = i10 % 128;
                    int i11 = i10 % 2;
                    byte[] bArr = baseFragment._bmpData;
                    if (bArr != null) {
                        int i12 = a;
                        int i13 = (i12 ^ 119) + ((i12 & 119) << 1);
                        b = i13 % 128;
                        int i14 = i13 % 2;
                        baseFragment._bitmap = G.c(bArr);
                        BaseFragment baseFragment2 = BaseFragment.this;
                        ImageView imageView = baseFragment2._imageview_fp;
                        int i15 = a;
                        int i16 = i15 & 85;
                        int i17 = ((((i15 ^ 85) | i16) << 1) - (~(-((i15 | 85) & (~i16))))) - 1;
                        b = i17 % 128;
                        int i18 = i17 % 2;
                        imageView.setImageBitmap(baseFragment2._bitmap);
                        int i19 = a;
                        int i20 = ((i19 & (-42)) | ((~i19) & 41)) + ((i19 & 41) << 1);
                        b = i20 % 128;
                        int i21 = i20 % 2;
                    }
                }
            }
            int i22 = a;
            int i23 = i22 & 55;
            int i24 = (i23 - (~((i22 ^ 55) | i23))) - 1;
            b = i24 % 128;
            int i25 = i24 % 2;
        }
    };
    public View parentView = null;
    public Boolean _isFromLogin = Boolean.FALSE;

    public interface FingerPrintSucessFullRedirection {
        void actionPerform();
    }

    public class _Cnic_form_Validation_api_call extends AsyncTask<Void, Void, Void> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int c = 1;
        private static int d = 0;
        private static long d$s51$86 = -1702699252828767672L;
        public String TAG = "CnicValidation_Tag";
        public String _cnic;
        public BaseAuth.OooOO0 fingerPrintSucessFullRedirection;
        public Boolean isFromLogin;

        public _Cnic_form_Validation_api_call(String str, Boolean bool, BaseAuth.OooOO0 oooOO0) {
            BaseFragment.this._mProgressBar.setCancelable(false);
            BaseFragment.this._mProgressBar.setMessage("Please Wait...");
            BaseFragment.this._mProgressBar.setProgressStyle(0);
            BaseFragment.this._mProgressBar.setCancelable(false);
            BaseFragment.this._mProgressBar.show();
            this._cnic = str;
            this.isFromLogin = bool;
            this.fingerPrintSucessFullRedirection = oooOO0;
        }

        private void _requestCNICData(JSONObject jSONObject, String str, Boolean bool) {
            int i = 2 % 2;
            String str2 = this.TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("requestCNICData: ");
            sb.append(str);
            Log.e(str2, sb.toString());
            ax.e(jSONObject, BaseFragment.this.getActivity(), "https://meladeskapp.bisp.gov.pk/api/Roster/bZJVzTu9rHlQm0D", new I() { // from class: ivas.gov.bisp.enumeration.fragments.BaseFragment.BaseFragment._Cnic_form_Validation_api_call.1
                private static int a = 0;
                private static int b = 1;

                @Override // ivas.gov.bisp.enumeration.p024ax.I
                public void onError(ResponseMessage responseMessage) {
                    int i2 = 2 % 2;
                    int i3 = a + 29;
                    b = i3 % 128;
                    int i4 = i3 % 2;
                    AppCompatActivity appCompatActivity = (AppCompatActivity) BaseFragment.this.getActivity();
                    int i5 = a + 67;
                    b = i5 % 128;
                    int i6 = i5 % 2;
                    StringBuilder sbW = j.w(BuildConfig.FLAVOR);
                    sbW.append(responseMessage.getErrorMessage());
                    int i7 = a;
                    int i8 = (i7 ^ 79) + ((i7 & 79) << 1);
                    b = i8 % 128;
                    Object obj = null;
                    if (i8 % 2 == 0) {
                        ax.f(appCompatActivity, "Alert", sbW.toString());
                        obj.hashCode();
                        throw null;
                    }
                    ax.f(appCompatActivity, "Alert", sbW.toString());
                    ax.b(BaseFragment.this._progressDialog);
                    int i9 = a;
                    int i10 = i9 & 95;
                    int i11 = ((i9 | 95) & (~i10)) + (i10 << 1);
                    b = i11 % 128;
                    if (i11 % 2 != 0) {
                        return;
                    }
                    obj.hashCode();
                    throw null;
                }

                /* JADX WARN: Code duplicated, block: B:37:0x0161 A[Catch: JSONException -> 0x027a, Exception -> 0x02ba, TRY_ENTER, TryCatch #3 {JSONException -> 0x027a, blocks: (B:11:0x008b, B:14:0x00a1, B:17:0x00c4, B:20:0x00df, B:26:0x0107, B:29:0x0118, B:32:0x0132, B:62:0x0218, B:34:0x0148, B:37:0x0161, B:38:0x0168, B:40:0x0175, B:56:0x01f7, B:59:0x020b, B:60:0x020d, B:61:0x0211, B:48:0x01a7, B:52:0x01c1, B:53:0x01d3, B:39:0x016d, B:65:0x0237, B:68:0x024d, B:70:0x0258, B:74:0x025c, B:76:0x0266, B:77:0x026d, B:80:0x0270, B:81:0x0277), top: B:103:0x008b, outer: #0 }] */
                /* JADX WARN: Code duplicated, block: B:39:0x016d A[Catch: JSONException -> 0x027a, Exception -> 0x02ba, TryCatch #3 {JSONException -> 0x027a, blocks: (B:11:0x008b, B:14:0x00a1, B:17:0x00c4, B:20:0x00df, B:26:0x0107, B:29:0x0118, B:32:0x0132, B:62:0x0218, B:34:0x0148, B:37:0x0161, B:38:0x0168, B:40:0x0175, B:56:0x01f7, B:59:0x020b, B:60:0x020d, B:61:0x0211, B:48:0x01a7, B:52:0x01c1, B:53:0x01d3, B:39:0x016d, B:65:0x0237, B:68:0x024d, B:70:0x0258, B:74:0x025c, B:76:0x0266, B:77:0x026d, B:80:0x0270, B:81:0x0277), top: B:103:0x008b, outer: #0 }] */
                /* JADX WARN: Code duplicated, block: B:43:0x0192  */
                /* JADX WARN: Code duplicated, block: B:46:0x0198 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:47:0x019a  */
                /* JADX WARN: Code duplicated, block: B:50:0x01ad  */
                /* JADX WARN: Code duplicated, block: B:52:0x01c1 A[Catch: JSONException -> 0x027a, Exception -> 0x02ba, TRY_ENTER, TryCatch #3 {JSONException -> 0x027a, blocks: (B:11:0x008b, B:14:0x00a1, B:17:0x00c4, B:20:0x00df, B:26:0x0107, B:29:0x0118, B:32:0x0132, B:62:0x0218, B:34:0x0148, B:37:0x0161, B:38:0x0168, B:40:0x0175, B:56:0x01f7, B:59:0x020b, B:60:0x020d, B:61:0x0211, B:48:0x01a7, B:52:0x01c1, B:53:0x01d3, B:39:0x016d, B:65:0x0237, B:68:0x024d, B:70:0x0258, B:74:0x025c, B:76:0x0266, B:77:0x026d, B:80:0x0270, B:81:0x0277), top: B:103:0x008b, outer: #0 }] */
                /* JADX WARN: Code duplicated, block: B:53:0x01d3 A[Catch: JSONException -> 0x027a, Exception -> 0x02ba, TRY_LEAVE, TryCatch #3 {JSONException -> 0x027a, blocks: (B:11:0x008b, B:14:0x00a1, B:17:0x00c4, B:20:0x00df, B:26:0x0107, B:29:0x0118, B:32:0x0132, B:62:0x0218, B:34:0x0148, B:37:0x0161, B:38:0x0168, B:40:0x0175, B:56:0x01f7, B:59:0x020b, B:60:0x020d, B:61:0x0211, B:48:0x01a7, B:52:0x01c1, B:53:0x01d3, B:39:0x016d, B:65:0x0237, B:68:0x024d, B:70:0x0258, B:74:0x025c, B:76:0x0266, B:77:0x026d, B:80:0x0270, B:81:0x0277), top: B:103:0x008b, outer: #0 }] */
                /* JADX WARN: Code duplicated, block: B:59:0x020b A[Catch: JSONException -> 0x027a, Exception -> 0x02ba, TRY_ENTER, TryCatch #3 {JSONException -> 0x027a, blocks: (B:11:0x008b, B:14:0x00a1, B:17:0x00c4, B:20:0x00df, B:26:0x0107, B:29:0x0118, B:32:0x0132, B:62:0x0218, B:34:0x0148, B:37:0x0161, B:38:0x0168, B:40:0x0175, B:56:0x01f7, B:59:0x020b, B:60:0x020d, B:61:0x0211, B:48:0x01a7, B:52:0x01c1, B:53:0x01d3, B:39:0x016d, B:65:0x0237, B:68:0x024d, B:70:0x0258, B:74:0x025c, B:76:0x0266, B:77:0x026d, B:80:0x0270, B:81:0x0277), top: B:103:0x008b, outer: #0 }] */
                /* JADX WARN: Code duplicated, block: B:61:0x0211 A[Catch: JSONException -> 0x027a, Exception -> 0x02ba, TryCatch #3 {JSONException -> 0x027a, blocks: (B:11:0x008b, B:14:0x00a1, B:17:0x00c4, B:20:0x00df, B:26:0x0107, B:29:0x0118, B:32:0x0132, B:62:0x0218, B:34:0x0148, B:37:0x0161, B:38:0x0168, B:40:0x0175, B:56:0x01f7, B:59:0x020b, B:60:0x020d, B:61:0x0211, B:48:0x01a7, B:52:0x01c1, B:53:0x01d3, B:39:0x016d, B:65:0x0237, B:68:0x024d, B:70:0x0258, B:74:0x025c, B:76:0x0266, B:77:0x026d, B:80:0x0270, B:81:0x0277), top: B:103:0x008b, outer: #0 }] */
                @Override // ivas.gov.bisp.enumeration.p024ax.I
                public void onSuccess(JSONObject jSONObject2) {
                    String string;
                    Context context;
                    int i2;
                    JSONArray jSONArray;
                    ArrayList<String> arrayList;
                    int i3;
                    int i4;
                    int i5;
                    BaseFragment baseFragment;
                    int i6;
                    int i7;
                    int i8 = 2 % 2;
                    int i9 = a;
                    int i10 = (-2) - (((i9 ^ 118) + ((i9 & 118) << 1)) ^ (-1));
                    b = i10 % 128;
                    try {
                        if (i10 % 2 == 0) {
                            ax.b(BaseFragment.this._progressDialog);
                            try {
                                throw null;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        ax.b(BaseFragment.this._progressDialog);
                        int i11 = b;
                        int i12 = (i11 | 47) << 1;
                        int i13 = -(((~i11) & 47) | (i11 & (-48)));
                        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
                        a = i14 % 128;
                        int i15 = i14 % 2;
                        String string2 = jSONObject2.getString("result");
                        BaseFragment baseFragment2 = BaseFragment.this;
                        int i16 = b;
                        int i17 = (i16 ^ 47) + ((i16 & 47) << 1);
                        a = i17 % 128;
                        int i18 = i17 % 2;
                        byte[] bArrB = b.b(baseFragment2._sessionManager.k());
                        BaseFragment baseFragment3 = BaseFragment.this;
                        int i19 = b;
                        int i20 = i19 & 43;
                        int i21 = ((i19 ^ 43) | i20) << 1;
                        int i22 = -((i19 | 43) & (~i20));
                        int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
                        a = i23 % 128;
                        if (i23 % 2 != 0) {
                            b.c(string2, bArrB, b.b(baseFragment3._sessionManager.m()));
                            try {
                                throw null;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        String strC = b.c(string2, bArrB, b.b(baseFragment3._sessionManager.m()));
                        String str3 = _Cnic_form_Validation_api_call.this.TAG;
                        try {
                            JSONObject jSONObject3 = new JSONObject(strC);
                            int i24 = b;
                            int i25 = ((i24 | 89) << 1) - (i24 ^ 89);
                            a = i25 % 128;
                            if (i25 % 2 != 0) {
                                jSONObject3.getInt("status".toLowerCase());
                                try {
                                    throw null;
                                } catch (Throwable th3) {
                                    throw th3;
                                }
                            }
                            int i26 = jSONObject3.getInt("status".toLowerCase());
                            int i27 = b;
                            int i28 = (i27 & (-120)) | ((~i27) & 119);
                            int i29 = -(-((i27 & 119) << 1));
                            int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
                            a = i30 % 128;
                            if (i30 % 2 != 0) {
                                jSONObject3.getString("message".toLowerCase());
                                try {
                                    throw null;
                                } catch (Throwable th4) {
                                    throw th4;
                                }
                            }
                            String string3 = jSONObject3.getString("message".toLowerCase());
                            if (jSONObject3.has("resurvey_status".toLowerCase())) {
                                int i31 = b + 87;
                                a = i31 % 128;
                                int i32 = i31 % 2;
                                string = jSONObject3.getString("resurvey_status".toLowerCase());
                                int i33 = b + 112;
                                int i34 = (i33 ^ (-1)) + (i33 << 1);
                                a = i34 % 128;
                                int i35 = i34 % 2;
                            } else {
                                string = BuildConfig.FLAVOR;
                            }
                            int i36 = 0;
                            if (i26 != -1) {
                                _Cnic_form_Validation_api_call.this.fingerPrintSucessFullRedirection.actionPerform();
                                int i37 = a;
                                int i38 = i37 & 73;
                                int i39 = i38 + ((i37 ^ 73) | i38);
                                b = i39 % 128;
                                if (i39 % 2 != 0) {
                                    BaseFragment.this._mProgressBar.dismiss();
                                    return;
                                } else {
                                    BaseFragment.this._mProgressBar.dismiss();
                                    int i40 = 32 / 0;
                                    return;
                                }
                            }
                            int i41 = a;
                            int i42 = (i41 ^ 11) + ((i41 & 11) << 1);
                            b = i42 % 128;
                            int i43 = i42 % 2;
                            if (string3.equals("701")) {
                                context = BaseFragment.this.context;
                                int i44 = a + 2;
                                i2 = (i44 ^ (-1)) + (i44 << 1);
                                b = i2 % 128;
                                if (i2 % 2 == 0) {
                                    Toast.makeText(context, "Fingerprint not matched. Kindly select another finger from given options.", 1).show();
                                } else {
                                    Toast.makeText(context, "Fingerprint not matched. Kindly select another finger from given options.", 1).show();
                                }
                                jSONArray = jSONObject3.getJSONArray("fingerindex".toLowerCase());
                                arrayList = new ArrayList<>();
                                i3 = b;
                                int i45 = i3 & 109;
                                i4 = (((i3 ^ 109) | i45) << 1) - ((~i45) & (i3 | 109));
                                a = i4 % 128;
                                if (i4 % 2 != 0) {
                                    int i46 = 51 / 0;
                                    if (jSONArray != null) {
                                        int i47 = i3 & 85;
                                        int i48 = ((i3 | 85) & (~i47)) + (i47 << 1);
                                        a = i48 % 128;
                                        int i49 = i48 % 2;
                                        while (i36 < jSONArray.length()) {
                                            int i50 = a;
                                            int i51 = i50 ^ 71;
                                            i5 = ((((i50 & 71) | i51) << 1) - (~(-i51))) - 1;
                                            b = i5 % 128;
                                            if (i5 % 2 == 0) {
                                                arrayList.add(jSONArray.getString(i36));
                                                int i52 = (i36 & 58) + (i36 | 58);
                                                i36 = (i52 ^ (-1)) + (i52 << 1);
                                            } else {
                                                arrayList.add(jSONArray.getString(i36));
                                                int i53 = i36 & 1;
                                                int i54 = (~i53) & (i36 | 1);
                                                int i55 = i53 << 1;
                                                i36 = (i54 & i55) + (i55 | i54);
                                            }
                                            int i56 = b;
                                            int i57 = i56 & 49;
                                            int i58 = (i56 ^ 49) | i57;
                                            int i59 = (i57 & i58) + (i58 | i57);
                                            a = i59 % 128;
                                            int i60 = i59 % 2;
                                        }
                                    }
                                } else if (jSONArray != null) {
                                    int i410 = i3 & 85;
                                    int i411 = ((i3 | 85) & (~i410)) + (i410 << 1);
                                    a = i411 % 128;
                                    int i412 = i411 % 2;
                                    while (i36 < jSONArray.length()) {
                                        int i510 = a;
                                        int i511 = i510 ^ 71;
                                        i5 = ((((i510 & 71) | i511) << 1) - (~(-i511))) - 1;
                                        b = i5 % 128;
                                        if (i5 % 2 == 0) {
                                            arrayList.add(jSONArray.getString(i36));
                                            int i512 = (i36 & 58) + (i36 | 58);
                                            i36 = (i512 ^ (-1)) + (i512 << 1);
                                        } else {
                                            arrayList.add(jSONArray.getString(i36));
                                            int i513 = i36 & 1;
                                            int i514 = (~i513) & (i36 | 1);
                                            int i515 = i513 << 1;
                                            i36 = (i514 & i515) + (i515 | i514);
                                        }
                                        int i516 = b;
                                        int i517 = i516 & 49;
                                        int i518 = (i516 ^ 49) | i517;
                                        int i519 = (i517 & i518) + (i518 | i517);
                                        a = i519 % 128;
                                        int i61 = i519 % 2;
                                    }
                                }
                                baseFragment = BaseFragment.this;
                                i6 = baseFragment._count;
                                int i62 = b;
                                i7 = (i62 & 93) + (i62 | 93);
                                a = i7 % 128;
                                if (i7 % 2 != 0) {
                                    baseFragment._count = i6;
                                } else {
                                    baseFragment._count = (i6 & 1) + (i6 | 1);
                                }
                                baseFragment._scanFingerPrint(string3, arrayList);
                            } else {
                                int i63 = a + 13;
                                b = i63 % 128;
                                int i64 = i63 % 2;
                                if (string3.equals("702")) {
                                    int i65 = b;
                                    int i66 = ((i65 & (-62)) | ((~i65) & 61)) + ((i65 & 61) << 1);
                                    a = i66 % 128;
                                    int i67 = i66 % 2;
                                    context = BaseFragment.this.context;
                                    int i413 = a + 2;
                                    i2 = (i413 ^ (-1)) + (i413 << 1);
                                    b = i2 % 128;
                                    if (i2 % 2 == 0) {
                                        Toast.makeText(context, "Fingerprint not matched. Kindly select another finger from given options.", 1).show();
                                    } else {
                                        Toast.makeText(context, "Fingerprint not matched. Kindly select another finger from given options.", 1).show();
                                    }
                                    jSONArray = jSONObject3.getJSONArray("fingerindex".toLowerCase());
                                    arrayList = new ArrayList<>();
                                    i3 = b;
                                    int i414 = i3 & 109;
                                    i4 = (((i3 ^ 109) | i414) << 1) - ((~i414) & (i3 | 109));
                                    a = i4 % 128;
                                    if (i4 % 2 != 0) {
                                        int i415 = 51 / 0;
                                        if (jSONArray != null) {
                                            int i416 = i3 & 85;
                                            int i417 = ((i3 | 85) & (~i416)) + (i416 << 1);
                                            a = i417 % 128;
                                            int i418 = i417 % 2;
                                            while (i36 < jSONArray.length()) {
                                                int i5110 = a;
                                                int i5111 = i5110 ^ 71;
                                                i5 = ((((i5110 & 71) | i5111) << 1) - (~(-i5111))) - 1;
                                                b = i5 % 128;
                                                if (i5 % 2 == 0) {
                                                    arrayList.add(jSONArray.getString(i36));
                                                    int i5112 = (i36 & 58) + (i36 | 58);
                                                    i36 = (i5112 ^ (-1)) + (i5112 << 1);
                                                } else {
                                                    arrayList.add(jSONArray.getString(i36));
                                                    int i5113 = i36 & 1;
                                                    int i5114 = (~i5113) & (i36 | 1);
                                                    int i5115 = i5113 << 1;
                                                    i36 = (i5114 & i5115) + (i5115 | i5114);
                                                }
                                                int i5116 = b;
                                                int i5117 = i5116 & 49;
                                                int i5118 = (i5116 ^ 49) | i5117;
                                                int i5119 = (i5117 & i5118) + (i5118 | i5117);
                                                a = i5119 % 128;
                                                int i68 = i5119 % 2;
                                            }
                                        }
                                    } else if (jSONArray != null) {
                                        int i419 = i3 & 85;
                                        int i4110 = ((i3 | 85) & (~i419)) + (i419 << 1);
                                        a = i4110 % 128;
                                        int i4111 = i4110 % 2;
                                        while (i36 < jSONArray.length()) {
                                            int i51110 = a;
                                            int i51111 = i51110 ^ 71;
                                            i5 = ((((i51110 & 71) | i51111) << 1) - (~(-i51111))) - 1;
                                            b = i5 % 128;
                                            if (i5 % 2 == 0) {
                                                arrayList.add(jSONArray.getString(i36));
                                                int i51112 = (i36 & 58) + (i36 | 58);
                                                i36 = (i51112 ^ (-1)) + (i51112 << 1);
                                            } else {
                                                arrayList.add(jSONArray.getString(i36));
                                                int i51113 = i36 & 1;
                                                int i51114 = (~i51113) & (i36 | 1);
                                                int i51115 = i51113 << 1;
                                                i36 = (i51114 & i51115) + (i51115 | i51114);
                                            }
                                            int i51116 = b;
                                            int i51117 = i51116 & 49;
                                            int i51118 = (i51116 ^ 49) | i51117;
                                            int i51119 = (i51117 & i51118) + (i51118 | i51117);
                                            a = i51119 % 128;
                                            int i69 = i51119 % 2;
                                        }
                                    }
                                    baseFragment = BaseFragment.this;
                                    i6 = baseFragment._count;
                                    int i610 = b;
                                    i7 = (i610 & 93) + (i610 | 93);
                                    a = i7 % 128;
                                    if (i7 % 2 != 0) {
                                        baseFragment._count = i6;
                                    } else {
                                        baseFragment._count = (i6 & 1) + (i6 | 1);
                                    }
                                    baseFragment._scanFingerPrint(string3, arrayList);
                                } else {
                                    BaseFragment.access$000(BaseFragment.this, string3, string);
                                    int i70 = b;
                                    int i71 = i70 & 113;
                                    int i72 = i71 + ((i70 ^ 113) | i71);
                                    a = i72 % 128;
                                    int i73 = i72 % 2;
                                }
                            }
                            BaseFragment.this._mProgressBar.dismiss();
                            int i74 = a;
                            int i75 = (((i74 ^ 83) | (i74 & 83)) << 1) - (((~i74) & 83) | (i74 & (-84)));
                            b = i75 % 128;
                            int i76 = i75 % 2;
                        } catch (JSONException e) {
                            AppCompatActivity appCompatActivity = (AppCompatActivity) BaseFragment.this.getActivity();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Deserialization Exception ");
                            sb2.append(e.getMessage());
                            ax.f(appCompatActivity, "Alert", sb2.toString());
                        }
                    } catch (Exception e2) {
                        AppCompatActivity appCompatActivity2 = (AppCompatActivity) BaseFragment.this.getActivity();
                        StringBuilder sbW = j.w("Exception ");
                        sbW.append(e2.getMessage());
                        ax.f(appCompatActivity2, "Alert", sbW.toString());
                    }
                }
            });
            int i2 = c + 73;
            d = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ Void doInBackground(Void[] voidArr) {
            int i = 2 % 2;
            int i2 = d + 99;
            c = i2 % 128;
            int i3 = i2 % 2;
            Void voidDoInBackground2 = doInBackground2(voidArr);
            int i4 = d + 41;
            c = i4 % 128;
            if (i4 % 2 != 0) {
                return voidDoInBackground2;
            }
            throw null;
        }

        @Override // android.os.AsyncTask
        public /* synthetic */ void onPostExecute(Void r4) {
            int i = 2 % 2;
            int i2 = c + 23;
            d = i2 % 128;
            int i3 = i2 % 2;
            onPostExecute2(r4);
            if (i3 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX INFO: renamed from: onPostExecute, reason: avoid collision after fix types in other method */
        public void onPostExecute2(Void r4) {
            int i = 2 % 2;
            int i2 = c + 119;
            d = i2 % 128;
            int i3 = i2 % 2;
            super.onPostExecute(r4);
            int i4 = c + 59;
            d = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX INFO: renamed from: doInBackground, reason: avoid collision after fix types in other method */
        public Void doInBackground2(Void... voidArr) {
            int i = 2 % 2;
            int i2 = c + 107;
            d = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                Log.e(this.TAG, "doInBackground: createjson");
                _createJSON(this._cnic, this.isFromLogin);
                obj.hashCode();
                throw null;
            }
            Log.e(this.TAG, "doInBackground: createjson");
            _createJSON(this._cnic, this.isFromLogin);
            int i3 = c + 107;
            d = i3 % 128;
            int i4 = i3 % 2;
            return null;
        }

        private void _createJSON(String str, Boolean bool) {
            int i = 2 % 2;
            String strReplace = this._cnic.replace("-", BuildConfig.FLAVOR);
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject.put("CNICNumber", strReplace);
                jSONObject.put("call_origin", 100);
                jSONObject.put("fingerIndex", BaseFragment.this._finger_index);
                jSONObject.put("fingerTemplate", BaseFragment.this._imageTemplate);
                jSONObject.put("ipAddress", ac.h(true));
                jSONObject.put("isFingerPrint", true);
                Log.e("params", jSONObject.toString());
                jSONObject2.put("string1", b.d(jSONObject.toString(), b.b(BaseFragment.this._sessionManager.k()), b.b(BaseFragment.this._sessionManager.m())));
                byte[] bArrB = b.b(BaseFragment.this._sessionManager.k());
                byte[] bArrB2 = b.b(BaseFragment.this._sessionManager.m());
                Object[] objArr = new Object[1];
                a((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 61487, new char[]{62635, 1190, 5318, 9267, 13375, 17524, 21890, 26048, 30182, 34072, 38222, 42632, 46764, 50938, 54797, 58991, 63077, 1968, 6124, 10200, 14083, 18296, 20628, 24723, 28907, 32777, 36935, 41047, 45501, 49618, 53516, 57656, 61822, 693, 4832}, objArr);
                jSONObject2.put("string2", b.d(((String) objArr[0]).intern(), bArrB, bArrB2));
                ax.h(BaseFragment.this._progressDialog, "Please wait!");
                SessionManager sessionManager = BaseFragment.this._sessionManager;
                sessionManager.d.putString("k_nadra_data", BuildConfig.FLAVOR);
                sessionManager.d.apply();
                _requestCNICData(jSONObject2, strReplace, bool);
                int i2 = d + 121;
                c = i2 % 128;
                int i3 = i2 % 2;
            } catch (JSONException unused) {
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
            int i4 = $11 + 109;
            $10 = i4 % 128;
            while (true) {
                int i5 = i4 % 2;
                if (mVar.e >= cArr.length) {
                    break;
                }
                jArr[mVar.e] = (((long) cArr[mVar.e]) ^ (((long) mVar.e) * ((long) mVar.d))) ^ (d$s51$86 ^ 6031393033645231780L);
                mVar.e++;
                i4 = $11 + 71;
                $10 = i4 % 128;
            }
            char[] cArr2 = new char[length];
            mVar.e = 0;
            while (mVar.e < cArr.length) {
                int i6 = $11 + 31;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    cArr2[mVar.e] = (char) jArr[mVar.e];
                    i2 = mVar.e;
                } else {
                    cArr2[mVar.e] = (char) jArr[mVar.e];
                    i2 = mVar.e + 1;
                }
                mVar.e = i2;
            }
            objArr[0] = new String(cArr2);
        }
    }

    public static /* synthetic */ void access$000(BaseFragment baseFragment, String str, String str2) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 39;
        int i4 = i2 | 39;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        baseFragment._customDialogFingerPrintError(str, str2);
        int i7 = a;
        int i8 = (-2) - (((i7 & 64) + (i7 | 64)) ^ (-1));
        b = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
    }

    public abstract View getCreateView();

    public abstract int getViewId();

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 25;
        int i4 = ((i2 & 25) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 & i5) + (i4 | i5);
        a = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 82 / 0;
        }
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 2 % 2;
        this.parentView = getCreateView();
        this.context = getActivity();
        this._mProgressBar = new ProgressDialog(this.context);
        this._bispApplication = (BISPApplication) this.context.getApplicationContext();
        ProgressDialog progressDialog = new ProgressDialog(this.context);
        this._progressDialog = progressDialog;
        progressDialog.setCancelable(false);
        this._count = 0;
        Dialog dialog = new Dialog(this.context);
        int i2 = a;
        int i3 = i2 & 11;
        int i4 = -(-(i2 | 11));
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        this._select_finger_dialog = dialog;
        dialog.setContentView(R.layout.dialog_capturefinger);
        this._select_finger_dialog.setCancelable(false);
        this._imageview_fp = (ImageView) this._select_finger_dialog.findViewById(R.id.imageview_fp);
        Dialog dialog2 = this._select_finger_dialog;
        int i7 = a;
        int i8 = i7 & 105;
        int i9 = ((((i7 ^ 105) | i8) << 1) - (~(-((i7 | 105) & (~i8))))) - 1;
        b = i9 % 128;
        Object obj = null;
        if (i9 % 2 != 0) {
            this._radioGroupFingers = (RadioGroup) dialog2.findViewById(R.id.radio_group_fingers);
            this._rg_hands = (RadioGroup) this._select_finger_dialog.findViewById(R.id.rg_hands);
            throw null;
        }
        this._radioGroupFingers = (RadioGroup) dialog2.findViewById(R.id.radio_group_fingers);
        this._rg_hands = (RadioGroup) this._select_finger_dialog.findViewById(R.id.rg_hands);
        this._left_hand = (RadioButton) this._select_finger_dialog.findViewById(R.id.left_hand);
        this.right_hand = (RadioButton) this._select_finger_dialog.findViewById(R.id.right_hand);
        this._select_finger = (Button) this._select_finger_dialog.findViewById(R.id.select_finger);
        Dialog dialog3 = this._select_finger_dialog;
        int i10 = a;
        int i11 = (i10 ^ 53) + ((i10 & 53) << 1);
        b = i11 % 128;
        int i12 = i11 % 2;
        this._rlfingerMain = (RelativeLayout) dialog3.findViewById(R.id.rlfingerMain);
        this._rlMain = (RelativeLayout) this._select_finger_dialog.findViewById(R.id.rlMain);
        this._fingerPrintSelectionHeadingTextView = (TextView) this._select_finger_dialog.findViewById(R.id.hand_selection_heading_textView);
        this._fingerIndexSpinner = (Spinner) this._select_finger_dialog.findViewById(R.id.finger_index_spinner);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this.context, R.layout.spinner_item, this._fingers);
        arrayAdapter.setDropDownViewResource(R.layout.spinner_item_dropdown);
        this._fingerIndexSpinner.setAdapter((SpinnerAdapter) arrayAdapter);
        this._fingerIndexSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: ivas.gov.bisp.enumeration.fragments.BaseFragment.BaseFragment.2
            private static int a = 0;
            private static int b = 1;

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView<?> adapterView) {
                int i13 = 2 % 2;
                int i14 = b;
                int i15 = i14 & 107;
                int i16 = i15 + ((i14 ^ 107) | i15);
                a = i16 % 128;
                int i17 = i16 % 2;
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(AdapterView<?> adapterView, View view, int i13, long j) {
                int i14 = 2 % 2;
                int i15 = a;
                int i16 = ((i15 ^ 5) | (i15 & 5)) << 1;
                int i17 = -(((~i15) & 5) | (i15 & (-6)));
                int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
                b = i18 % 128;
                int i19 = i18 % 2;
                int checkedRadioButtonId = BaseFragment.this._rg_hands.getCheckedRadioButtonId();
                int i20 = b + 45;
                a = i20 % 128;
                int i21 = i20 % 2;
                Object obj2 = null;
                if (checkedRadioButtonId == BaseFragment.this.right_hand.getId()) {
                    int i22 = a;
                    int i23 = i22 & 73;
                    int i24 = (i22 ^ 73) | i23;
                    int i25 = (i23 & i24) + (i24 | i23);
                    b = i25 % 128;
                    if (i25 % 2 == 0) {
                        BaseFragment.this._finger_index = i13;
                        obj2.hashCode();
                        throw null;
                    }
                    BaseFragment.this._finger_index = i13;
                    int i26 = a;
                    int i27 = (i26 & 71) + (i26 | 71);
                    b = i27 % 128;
                    if (i27 % 2 == 0) {
                        int i28 = 60 / 0;
                        return;
                    }
                    return;
                }
                if (checkedRadioButtonId == BaseFragment.this._left_hand.getId()) {
                    int i29 = a;
                    int i30 = i29 & 85;
                    int i31 = ((i29 ^ 85) | i30) << 1;
                    int i32 = -((~i30) & (i29 | 85));
                    int i33 = ((i31 | i32) << 1) - (i31 ^ i32);
                    b = i33 % 128;
                    if (i33 % 2 != 0 ? i13 != 1 : i13 != 0) {
                        if (i13 == 2) {
                            BaseFragment.this._finger_index = 7;
                            int i34 = a;
                            int i35 = ((i34 | 31) << 1) - (i34 ^ 31);
                            b = i35 % 128;
                            int i36 = i35 % 2;
                            return;
                        }
                        int i37 = ((i29 ^ 110) + ((i29 & 110) << 1)) - 1;
                        b = i37 % 128;
                        int i38 = i37 % 2;
                        if (i13 == 3) {
                            BaseFragment.this._finger_index = 8;
                            int i39 = b;
                            int i40 = i39 | 125;
                            int i41 = (i40 << 1) - ((~(i39 & 125)) & i40);
                            a = i41 % 128;
                            if (i41 % 2 == 0) {
                                return;
                            }
                            obj2.hashCode();
                            throw null;
                        }
                        int i42 = (i29 & (-66)) | ((~i29) & 65);
                        int i43 = (i29 & 65) << 1;
                        int i44 = ((i42 | i43) << 1) - (i43 ^ i42);
                        int i45 = i44 % 128;
                        b = i45;
                        if (i44 % 2 != 0 ? i13 == 4 : i13 == 4) {
                            BaseFragment.this._finger_index = 9;
                            int i46 = b;
                            int i47 = ((i46 ^ 3) | (i46 & 3)) << 1;
                            int i48 = -(((~i46) & 3) | (i46 & (-4)));
                            int i49 = (i47 & i48) + (i48 | i47);
                            a = i49 % 128;
                            if (i49 % 2 != 0) {
                                int i50 = 85 / 0;
                                return;
                            }
                            return;
                        }
                        if (i13 == 5) {
                            BaseFragment.this._finger_index = 10;
                            int i51 = b;
                            int i52 = ((i51 | 123) << 1) - (i51 ^ 123);
                            a = i52 % 128;
                            int i53 = i52 % 2;
                            return;
                        }
                        int i54 = i45 & 69;
                        int i55 = ((i45 ^ 69) | i54) << 1;
                        int i56 = -((i45 | 69) & (~i54));
                        int i57 = ((i55 | i56) << 1) - (i56 ^ i55);
                        a = i57 % 128;
                        int i58 = i57 % 2;
                        BaseFragment.this._finger_index = 0;
                        int i59 = b;
                        int i60 = ((i59 | 99) << 1) - (i59 ^ 99);
                        a = i60 % 128;
                        int i61 = i60 % 2;
                        return;
                    }
                    BaseFragment.this._finger_index = 6;
                    int i62 = b;
                    int i63 = ((i62 ^ 79) | (i62 & 79)) << 1;
                    int i64 = -(((~i62) & 79) | (i62 & (-80)));
                    int i65 = ((i63 | i64) << 1) - (i64 ^ i63);
                    a = i65 % 128;
                    if (i65 % 2 != 0) {
                        int i66 = 3 % 4;
                    }
                }
                int i67 = a;
                int i68 = ((i67 | 63) << 1) - (i67 ^ 63);
                b = i68 % 128;
                if (i68 % 2 == 0) {
                    throw null;
                }
            }
        });
        Button button = this._select_finger;
        if (button != null) {
            int i13 = a;
            int i14 = i13 & 69;
            int i15 = ((i13 ^ 69) | i14) << 1;
            int i16 = -((i13 | 69) & (~i14));
            int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
            b = i17 % 128;
            int i18 = i17 % 2;
            button.setOnClickListener(this);
            int i19 = a;
            int i20 = i19 & 15;
            int i21 = ((((i19 ^ 15) | i20) << 1) - (~(-((i19 | 15) & (~i20))))) - 1;
            b = i21 % 128;
            int i22 = i21 % 2;
        }
        View view = this.parentView;
        int i23 = a;
        int i24 = i23 & 99;
        int i25 = (i23 ^ 99) | i24;
        int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
        b = i26 % 128;
        if (i26 % 2 == 0) {
            return view;
        }
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.c.aPw
    public void timerFinish() {
        int i = 2 % 2;
        _scanFingerPrint("0", new ArrayList<>());
        int i2 = a;
        int i3 = (i2 | 41) << 1;
        int i4 = -(((~i2) & 41) | (i2 & (-42)));
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public class _CaptureThread implements Runnable {
        private static int a = 0;
        private static int b = 1;

        public _CaptureThread() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseFragment baseFragment;
            byte[] bArr;
            int i;
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = i3 & 107;
            int i5 = -(-((i3 ^ 107) | i4));
            int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
            a = i6 % 128;
            int i7 = i6 % 2;
            Object obj = null;
            if (BaseFragment.this._isCapture) {
                while (true) {
                    BaseFragment baseFragment2 = BaseFragment.this;
                    if (!baseFragment2._isCapture) {
                        break;
                    }
                    int i8 = a;
                    int i9 = i8 & 65;
                    int i10 = (((i8 ^ 65) | i9) << 1) - ((i8 | 65) & (~i9));
                    b = i10 % 128;
                    if (i10 % 2 == 0) {
                        Objects.requireNonNull(baseFragment2._myScanner);
                        obj.hashCode();
                        throw null;
                    }
                    Objects.requireNonNull(baseFragment2._myScanner);
                    BaseFragment baseFragment3 = BaseFragment.this;
                    int i11 = b;
                    int i12 = i11 & 23;
                    int i13 = -(-((i11 ^ 23) | i12));
                    int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
                    a = i14 % 128;
                    if (i14 % 2 != 0) {
                        baseFragment3._myScanner.i(baseFragment3._rawData);
                        throw null;
                    }
                    int i15 = baseFragment3._myScanner.i(baseFragment3._rawData);
                    BaseFragment baseFragment4 = BaseFragment.this;
                    ivas.gov.bisp.enumeration.p037bj.c cVar = baseFragment4._myScanner;
                    byte[] bArr2 = baseFragment4._rawData;
                    int i16 = b;
                    int i17 = (i16 & 91) + (i16 | 91);
                    a = i17 % 128;
                    if (i17 % 2 != 0) {
                        cVar.g(bArr2);
                        Log.e("fenglei", "capture get data end");
                        throw null;
                    }
                    cVar.g(bArr2);
                    Log.e("fenglei", "capture get data end");
                    int i18 = b;
                    int i19 = i18 & 31;
                    int i20 = i19 + ((i18 ^ 31) | i19);
                    int i21 = i20 % 128;
                    a = i21;
                    int i22 = i20 % 2;
                    if (i15 == 1) {
                        int i23 = (i21 & (-52)) | ((~i21) & 51);
                        int i24 = -(-((i21 & 51) << 1));
                        int i25 = (i23 ^ i24) + ((i23 & i24) << 1);
                        b = i25 % 128;
                        int i26 = i25 % 2;
                        Base64.encodeToString(BaseFragment.this._rawData, 2);
                        int i27 = a;
                        int i28 = i27 & 15;
                        int i29 = ((i27 | 15) & (~i28)) + (i28 << 1);
                        b = i29 % 128;
                        if (i29 % 2 == 0) {
                            baseFragment = BaseFragment.this;
                            bArr = baseFragment._rawData;
                            i = baseFragment._IMAGE_WIDTH;
                            int i30 = 38 / 0;
                        } else {
                            baseFragment = BaseFragment.this;
                            bArr = baseFragment._rawData;
                            i = baseFragment._IMAGE_WIDTH;
                        }
                        int i31 = a;
                        int i32 = i31 & 73;
                        int i33 = (i31 | 73) & (~i32);
                        int i34 = -(-(i32 << 1));
                        int i35 = (i33 ^ i34) + ((i33 & i34) << 1);
                        b = i35 % 128;
                        int i36 = i35 % 2;
                        G.d(bArr, i, baseFragment._IMAGE_HEIGHT);
                        BaseFragment baseFragment5 = BaseFragment.this;
                        int i37 = b;
                        int i38 = ((i37 | 7) << 1) - (((~i37) & 7) | (i37 & (-8)));
                        a = i38 % 128;
                        int i39 = i38 % 2;
                        baseFragment5._bmpData = G.b(baseFragment5._rawData, baseFragment5._IMAGE_WIDTH, baseFragment5._IMAGE_HEIGHT);
                        Message message = new Message();
                        int i40 = b;
                        int i41 = i40 ^ 63;
                        int i42 = ((i40 & 63) | i41) << 1;
                        int i43 = -i41;
                        int i44 = (i42 ^ i43) + ((i42 & i43) << 1);
                        a = i44 % 128;
                        int i45 = i44 % 2;
                        message.what = 0;
                        Handler handler = BaseFragment.this._msgHandler;
                        int i46 = a;
                        int i47 = ((i46 | 36) << 1) - (i46 ^ 36);
                        int i48 = (i47 ^ (-1)) + (i47 << 1);
                        b = i48 % 128;
                        if (i48 % 2 == 0) {
                            handler.sendMessage(message);
                            int i49 = 35 / 0;
                        } else {
                            handler.sendMessage(message);
                        }
                    }
                }
            }
            int i50 = b;
            int i51 = ((i50 | 91) << 1) - (i50 ^ 91);
            a = i51 % 128;
            if (i51 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    private void _customDialogFingerPrintError(String str, String str2) {
        int i = 2 % 2;
        C0084m.b(this.context, R.font.jameel_noori_nastaleeq);
        androidx.appcompat.app.b.aIz aiz = new androidx.appcompat.app.b.aIz(this.context);
        int i2 = b;
        int i3 = i2 & 85;
        int i4 = ((i2 ^ 85) | i3) << 1;
        int i5 = -((i2 | 85) & (~i3));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        ViewGroup viewGroup = (ViewGroup) getActivity().findViewById(android.R.id.content);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.context);
        int i8 = b + 65;
        a = i8 % 128;
        int i9 = i8 % 2;
        View viewInflate = layoutInflaterFrom.inflate(R.layout.custom_dialog_new, viewGroup, false);
        aiz.c(viewInflate);
        final androidx.appcompat.app.b bVarB = aiz.b();
        bVarB.show();
        int i10 = a + 55;
        b = i10 % 128;
        int i11 = i10 % 2;
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_heading);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_message);
        textView.setText("Fingerprint Error");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        int i12 = a;
        int i13 = i12 & 99;
        int i14 = ((i12 ^ 99) | i13) << 1;
        int i15 = -((i12 | 99) & (~i13));
        int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
        b = i16 % 128;
        int i17 = i16 % 2;
        sb.append(" ");
        sb.append(str2);
        textView2.setText(sb.toString());
        int i18 = a;
        int i19 = i18 & 41;
        int i20 = ((((i18 ^ 41) | i19) << 1) - (~(-((i18 | 41) & (~i19))))) - 1;
        b = i20 % 128;
        int i21 = i20 % 2;
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.btn_ok);
        ((TextView) viewInflate.findViewById(R.id.btn_no)).setVisibility(8);
        textView3.setText("OK");
        textView3.setOnClickListener(new View.OnClickListener() { // from class: ivas.gov.bisp.enumeration.fragments.BaseFragment.BaseFragment.6
            private static int a = 1;
            private static int b;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                int i22 = 2 % 2;
                int i23 = a;
                int i24 = (((i23 | 70) << 1) - (i23 ^ 70)) - 1;
                b = i24 % 128;
                if (i24 % 2 != 0) {
                    bVarB.dismiss();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                bVarB.dismiss();
                int i25 = b + 51;
                a = i25 % 128;
                int i26 = i25 % 2;
            }
        });
        int i22 = a;
        int i23 = (i22 ^ 43) + ((i22 & 43) << 1);
        b = i23 % 128;
        if (i23 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ed, code lost:
    
        if (r8._isFromLogin.booleanValue() == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00fb, code lost:
    
        if (r8._isFromLogin.booleanValue() == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00fd, code lost:
    
        r1 = new ivas.gov.bisp.enumeration.fragments.BaseFragment.BaseFragment._Cnic_form_Validation_api_call(r8, r8._sessionManager.z(), r8._isFromLogin, new ivas.gov.bisp.enumeration.fragments.BaseFragment.BaseFragment.AnonymousClass3(r8));
        r2 = ivas.gov.bisp.enumeration.fragments.BaseFragment.BaseFragment.b;
        r5 = (r2 ^ 11) + ((r2 & 11) << 1);
        ivas.gov.bisp.enumeration.fragments.BaseFragment.BaseFragment.a = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x011c, code lost:
    
        if ((r5 % 2) != 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x011e, code lost:
    
        r1.execute(new java.lang.Void[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0124, code lost:
    
        r1.execute(new java.lang.Void[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0129, code lost:
    
        r1 = ivas.gov.bisp.enumeration.fragments.BaseFragment.BaseFragment.a;
        r2 = ((r1 | 21) << 1) - (r1 ^ 21);
        ivas.gov.bisp.enumeration.fragments.BaseFragment.BaseFragment.b = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0136, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0137, code lost:
    
        r8._select_finger_dialog.dismiss();
        r1 = ivas.gov.bisp.enumeration.fragments.BaseFragment.BaseFragment.b;
        r2 = r1 & 95;
        r1 = (((r1 | 95) & (~r2)) - (~(-(-(r2 << 1))))) - 1;
        ivas.gov.bisp.enumeration.fragments.BaseFragment.BaseFragment.a = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x014f, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void _caputreFingerPrintCall() {
        /*
            Method dump skipped, instruction units count: 479
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.fragments.BaseFragment.BaseFragment._caputreFingerPrintCall():void");
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0447  */
    /* JADX WARN: Code duplicated, block: B:11:0x003f  */
    /* JADX WARN: Code duplicated, block: B:120:0x0467  */
    /* JADX WARN: Code duplicated, block: B:132:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:143:0x04fb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:144:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x04be, code lost:
    
        r4.show();
        r19.equals("701");
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x04c4, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x04c5, code lost:
    
        android.widget.Toast.makeText(r18.context, "You are temporary block due to invalid attempts.", 0).show();
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x04d0, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0083, code lost:
    
        if (ivas.gov.bisp.enumeration.fragments.FragmentPictures.hasPermissions(r18.context, r18._PERMISSIONS) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008f, code lost:
    
        if ((!ivas.gov.bisp.enumeration.fragments.FragmentPictures.hasPermissions(r18.context, r18._PERMISSIONS)) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0091, code lost:
    
        ivas.gov.bisp.enumeration.p085h.k.c(getActivity(), r18._PERMISSIONS, 1);
        r0 = ivas.gov.bisp.enumeration.fragments.BaseFragment.BaseFragment.b + 113;
        ivas.gov.bisp.enumeration.fragments.BaseFragment.BaseFragment.a = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a3, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a4, code lost:
    
        r18._rawData = new byte[r18._IMAGE_WIDTH * r18._IMAGE_HEIGHT];
        r4 = ivas.gov.bisp.enumeration.fragments.BaseFragment.BaseFragment.b + 115;
        ivas.gov.bisp.enumeration.fragments.BaseFragment.BaseFragment.a = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b7, code lost:
    
        if ((r4 % 2) != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b9, code lost:
    
        r18._myScanner = ivas.gov.bisp.enumeration.p037bj.c.c(r18.context);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c3, code lost:
    
        if (r18._count >= 5) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c6, code lost:
    
        r18._myScanner = ivas.gov.bisp.enumeration.p037bj.c.c(r18.context);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d0, code lost:
    
        if (r18._count >= 3) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d8, code lost:
    
        if (r18._mProgressBar.isShowing() == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00da, code lost:
    
        r4 = ivas.gov.bisp.enumeration.fragments.BaseFragment.BaseFragment.b;
        r11 = r4 ^ 59;
        r4 = (((r4 & 59) | r11) << 1) - r11;
        ivas.gov.bisp.enumeration.fragments.BaseFragment.BaseFragment.a = r4 % 128;
        r4 = r4 % 2;
        r18._mProgressBar.dismiss();
        r18._mProgressBar.cancel();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f2, code lost:
    
        r18._mProgressBar.setCancelable(false);
        r4 = r18._mProgressBar;
        r11 = ivas.gov.bisp.enumeration.fragments.BaseFragment.BaseFragment.a;
        r12 = r11 | 93;
        r13 = r12 << 1;
        r11 = -((~(r11 & 93)) & r12);
        r12 = (r13 & r11) + (r11 | r13);
        ivas.gov.bisp.enumeration.fragments.BaseFragment.BaseFragment.b = r12 % 128;
        r12 = r12 % 2;
        r4.setMessage("Please Wait...");
        r18._mProgressBar.setProgressStyle(0);
        r4 = r18._mProgressBar;
        r11 = ivas.gov.bisp.enumeration.fragments.BaseFragment.BaseFragment.b + 107;
        ivas.gov.bisp.enumeration.fragments.BaseFragment.BaseFragment.a = r11 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0124, code lost:
    
        if ((r11 % 2) == 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0126, code lost:
    
        r4.show();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x012f, code lost:
    
        if (r19.equals("701") != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0137, code lost:
    
        if (r19.equals("702") == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0139, code lost:
    
        r18._rlfingerMain.setVisibility(0);
        r18._rlMain.setVisibility(8);
        r0 = ivas.gov.bisp.enumeration.fragments.BaseFragment.BaseFragment.b + 107;
        ivas.gov.bisp.enumeration.fragments.BaseFragment.BaseFragment.a = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x014e, code lost:
    
        if ((r0 % 2) != 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0150, code lost:
    
        r18._finger_index = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0153, code lost:
    
        r18._finger_index = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0155, code lost:
    
        r18._radioGroupFingers.clearCheck();
        r18._radioGroupFingers.removeAllViews();
        r18._fingerPrintSelectionHeadingTextView.setText("دی گئی انگلیوں کی فہرست میں سے ایک کا انتخاب کریں۔");
        r0 = ivas.gov.bisp.enumeration.fragments.BaseFragment.BaseFragment.a;
        r4 = ((r0 | 3) << 1) - (r0 ^ 3);
        ivas.gov.bisp.enumeration.fragments.BaseFragment.BaseFragment.b = r4 % 128;
        r4 = r4 % 2;
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0177, code lost:
    
        if (r0 >= r20.size()) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0179, code lost:
    
        r4 = ivas.gov.bisp.enumeration.fragments.BaseFragment.BaseFragment.a;
        r12 = ((r4 & (-36)) | ((~r4) & 35)) + ((r4 & 35) << 1);
        ivas.gov.bisp.enumeration.fragments.BaseFragment.BaseFragment.b = r12 % 128;
        r12 = r12 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x018c, code lost:
    
        r12 = java.lang.Integer.parseInt(r20.get(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0196, code lost:
    
        r13 = ivas.gov.bisp.enumeration.fragments.BaseFragment.BaseFragment.a;
        r14 = r13 & 107;
        r15 = (r13 ^ 107) | r14;
        r14 = ((r14 | r15) << 1) - (r14 ^ r15);
        r15 = r14 % 128;
        ivas.gov.bisp.enumeration.fragments.BaseFragment.BaseFragment.b = r15;
        r14 = r14 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01a9, code lost:
    
        switch(r12) {
            case 1: goto L60;
            case 2: goto L59;
            case 3: goto L58;
            case 4: goto L57;
            case 5: goto L56;
            case 6: goto L55;
            case 7: goto L54;
            case 8: goto L53;
            case 9: goto L52;
            case 10: goto L51;
            default: goto L50;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01ac, code lost:
    
        r14 = r13 & 107;
        r13 = -(-((r13 ^ 107) | r14));
        r15 = (r14 ^ r13) + ((r13 & r14) << 1);
        ivas.gov.bisp.enumeration.fragments.BaseFragment.BaseFragment.b = r15 % 128;
        r15 = r15 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01bf, code lost:
    
        r15 = r15 + 3;
        ivas.gov.bisp.enumeration.fragments.BaseFragment.BaseFragment.a = r15 % 128;
        r15 = r15 % 2;
        r13 = "بائیں ہاتھ کی چھوٹی انگلی";
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01c9, code lost:
    
        r13 = (((r15 & (-24)) | ((~r15) & 23)) - (~((r15 & 23) << 1))) - 1;
        ivas.gov.bisp.enumeration.fragments.BaseFragment.BaseFragment.a = r13 % 128;
        r13 = r13 % 2;
        r13 = "بائیں ہاتھ کی انگوٹھی والی انگلی";
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01dc, code lost:
    
        r13 = ((r15 | 35) << 1) - (r15 ^ 35);
        ivas.gov.bisp.enumeration.fragments.BaseFragment.BaseFragment.a = r13 % 128;
        r13 = r13 % 2;
        r13 = "بائیں ہاتھ کی درمیانی انگلی";
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01ea, code lost:
    
        r14 = ((r13 | 67) << 1) - (r13 ^ 67);
        ivas.gov.bisp.enumeration.fragments.BaseFragment.BaseFragment.b = r14 % 128;
        r14 = r14 % 2;
        r13 = "بائیں ہاتھ کی شہادت کی انگلی";
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01f8, code lost:
    
        r13 = r15 ^ 125;
        r14 = (r15 & 125) << 1;
        r15 = (r13 ^ r14) + ((r13 & r14) << 1);
        ivas.gov.bisp.enumeration.fragments.BaseFragment.BaseFragment.a = r15 % 128;
        r15 = r15 % 2;
        r13 = "بائیں ہاتھ کاانگوٹھا";
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x020a, code lost:
    
        r13 = (-2) - ((r13 + 78) ^ (-1));
        ivas.gov.bisp.enumeration.fragments.BaseFragment.BaseFragment.b = r13 % 128;
        r13 = r13 % 2;
        r13 = "دائیں ہاتھ کی چھوٹی انگلی";
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0217, code lost:
    
        r13 = "دائیں ہاتھ کی انگوٹھی والی انگلی";
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x021a, code lost:
    
        r13 = "دائیں ہاتھ کی درمیانی انگلی";
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x021d, code lost:
    
        r14 = ((r13 | 25) << 1) - (r13 ^ 25);
        ivas.gov.bisp.enumeration.fragments.BaseFragment.BaseFragment.b = r14 % 128;
        r14 = r14 % 2;
        r13 = "دائیں ہاتھ کی شہادت کی انگلی";
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x022b, code lost:
    
        r13 = "دائیں ہاتھ کاانگوٹھا";
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x022e, code lost:
    
        r13 = net.sqlcipher.BuildConfig.FLAVOR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0230, code lost:
    
        r14 = new android.widget.RadioButton(r18.context);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0237, code lost:
    
        r15 = ivas.gov.bisp.enumeration.fragments.BaseFragment.BaseFragment.b;
        r10 = r15 ^ 93;
        r15 = ((((r15 & 93) | r10) << 1) - (~(-r10))) - 1;
        ivas.gov.bisp.enumeration.fragments.BaseFragment.BaseFragment.a = r15 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0248, code lost:
    
        if ((r15 % 2) == 0) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x024a, code lost:
    
        r14.setText(r13);
        r14.setId(r12);
        r10 = new android.widget.RadioGroup.LayoutParams(-1, -2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0255, code lost:
    
        r13 = ivas.gov.bisp.enumeration.fragments.BaseFragment.BaseFragment.a;
        r15 = r13 & 89;
        r15 = r15 + ((r13 ^ 89) | r15);
        ivas.gov.bisp.enumeration.fragments.BaseFragment.BaseFragment.b = r15 % 128;
        r15 = r15 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0264, code lost:
    
        r10.setMargins(16, 16, 16, 0);
        r14.setLayoutParams(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x026a, code lost:
    
        r10 = ivas.gov.bisp.enumeration.fragments.BaseFragment.BaseFragment.a;
        r13 = r10 & 109;
        r10 = -(-(r10 | 109));
        r15 = (r13 ^ r10) + ((r10 & r13) << 1);
        ivas.gov.bisp.enumeration.fragments.BaseFragment.BaseFragment.b = r15 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x027e, code lost:
    
        if ((r15 % 2) == 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0281, code lost:
    
        r14.setTextSize(4, 24.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0285, code lost:
    
        r14.setTextSize(2, 24.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0288, code lost:
    
        r14.setTextColor(-16777216);
        r14.setLayoutDirection(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0290, code lost:
    
        r10 = ivas.gov.bisp.enumeration.fragments.BaseFragment.BaseFragment.b;
        r13 = (r10 & (-100)) | (99 & (~r10));
        r10 = -(-((r10 & 99) << 1));
        r15 = (r13 ^ r10) + ((r10 & r13) << 1);
        ivas.gov.bisp.enumeration.fragments.BaseFragment.BaseFragment.a = r15 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x02ab, code lost:
    
        if ((r15 % 2) != 0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x02ad, code lost:
    
        r14.setGravity(8388608);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x02b4, code lost:
    
        if (r20.size() != 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x02b7, code lost:
    
        r14.setGravity(8388608);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x02be, code lost:
    
        if (r20.size() != 1) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x02c0, code lost:
    
        r14.setChecked(true);
        r18._finger_index = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x02c5, code lost:
    
        r18._radioGroupFingers.addView(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x02ca, code lost:
    
        r0 = r0 + 1;
        r10 = ivas.gov.bisp.enumeration.fragments.BaseFragment.BaseFragment.a;
        r12 = (r10 | 19) << 1;
        r10 = -(((~r10) & 19) | (r10 & (-20)));
        r13 = (r12 ^ r10) + ((r10 & r12) << 1);
        ivas.gov.bisp.enumeration.fragments.BaseFragment.BaseFragment.b = r13 % 128;
        r13 = r13 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x02e6, code lost:
    
        r14.setText(r13);
        r14.setId(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x02ec, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void _scanFingerPrint(java.lang.String r19, java.util.ArrayList<java.lang.String> r20) {
        /*
            Method dump skipped, instruction units count: 1302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.fragments.BaseFragment.BaseFragment._scanFingerPrint(java.lang.String, java.util.ArrayList):void");
    }
}
