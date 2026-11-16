package ivas.gov.bisp.enumeration.p091n;

import android.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import ivas.gov.bisp.enumeration.ActivityAgriculture;
import ivas.gov.bisp.enumeration.X.i;
import ivas.gov.bisp.enumeration.utils.NoPasteEditText;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements i {
    private static int a = 1;
    private static int b;
    public static final /* synthetic */ j c = new j();

    static {
        int i = b;
        int i2 = i & 55;
        int i3 = (i ^ 55) | i2;
        int i4 = (i2 & i3) + (i3 | i2);
        a = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static boolean A(EditText editText, String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 41;
        int i4 = ((((i2 & 41) | i3) << 1) - (~(-i3))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        String string = editText.getText().toString();
        if (i5 == 0) {
            string.equals(str);
            throw null;
        }
        boolean zEquals = string.equals(str);
        int i6 = a;
        int i7 = ((i6 | 63) << 1) - (i6 ^ 63);
        b = i7 % 128;
        if (i7 % 2 == 0) {
            return zEquals;
        }
        throw null;
    }

    public static void B(StringBuilder sb, String str, String str2, int i, TextView textView) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 ^ 27) | (i3 & 27)) << 1;
        int i5 = -(((~i3) & 27) | (i3 & (-28)));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        sb.append(str);
        if (i7 != 0) {
            str2.substring(i);
            throw null;
        }
        String strSubstring = str2.substring(i);
        int i8 = b;
        int i9 = i8 & 1;
        int i10 = ((i8 | 1) & (~i9)) + (i9 << 1);
        a = i10 % 128;
        int i11 = i10 % 2;
        sb.append(strSubstring);
        textView.setText(sb.toString());
        int i12 = a;
        int i13 = (((i12 | 98) << 1) - (i12 ^ 98)) - 1;
        b = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    public static int C(int i, int i2, int i3, int i4) {
        int i5;
        int i6 = 2 % 2;
        int i7 = b;
        int i8 = i7 & 65;
        int i9 = (~i8) & (i7 | 65);
        int i10 = i8 << 1;
        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
        a = i11 % 128;
        if (i11 % 2 == 0) {
            i5 = ((i << i2) * i3) >>> i4;
        } else {
            int i12 = (i * i2) / i3;
            int i13 = -(-i4);
            int i14 = i12 & i13;
            int i15 = ((i12 ^ i13) | i14) << 1;
            int i16 = -((i12 | i13) & (~i14));
            i5 = ((i15 | i16) << 1) - (i16 ^ i15);
        }
        int i17 = (((i7 ^ 11) | (i7 & 11)) << 1) - ((i7 & (-12)) | ((~i7) & 11));
        a = i17 % 128;
        int i18 = i17 % 2;
        return i5;
    }

    public static /* synthetic */ String D(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 83;
        int i5 = (i4 - (~(-(-((i3 ^ 83) | i4))))) - 1;
        int i6 = i5 % 128;
        a = i6;
        Object obj = null;
        if (i5 % 2 != 0 ? i == 1 : i == 0) {
            int i7 = i3 + 42;
            int i8 = (i7 ^ (-1)) + (i7 << 1);
            a = i8 % 128;
            if (i8 % 2 != 0) {
                return "UNKNOWN";
            }
            throw null;
        }
        if (i == 2) {
            int i9 = ((i6 & (-104)) | ((~i6) & 103)) + ((i6 & 103) << 1);
            int i10 = i9 % 128;
            b = i10;
            if (i9 % 2 != 0) {
                int i11 = 6 / 0;
            }
            int i12 = i10 ^ 95;
            int i13 = (((i10 & 95) | i12) << 1) - i12;
            a = i13 % 128;
            if (i13 % 2 != 0) {
                return "HORIZONTAL_DIMENSION";
            }
            throw null;
        }
        if (i == 3) {
            int i14 = i6 ^ 47;
            int i15 = (i6 & 47) << 1;
            int i16 = ((i14 | i15) << 1) - (i14 ^ i15);
            b = i16 % 128;
            if (i16 % 2 == 0) {
                return "VERTICAL_DIMENSION";
            }
            obj.hashCode();
            throw null;
        }
        if (i == 4) {
            int i17 = i6 ^ 41;
            int i18 = -(-((i6 & 41) << 1));
            int i19 = (i17 & i18) + (i17 | i18);
            b = i19 % 128;
            if (i19 % 2 == 0) {
                return "LEFT";
            }
            int i20 = 30 / 0;
            return "LEFT";
        }
        if (i == 5) {
            int i21 = i3 & 105;
            int i22 = i21 + ((i3 ^ 105) | i21);
            a = i22 % 128;
            if (i22 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i23 = i3 & 103;
            int i24 = -(-(i3 | 103));
            int i25 = (i23 & i24) + (i23 | i24);
            a = i25 % 128;
            int i26 = i25 % 2;
            return "RIGHT";
        }
        if (i == 6) {
            int i27 = i6 + 65;
            b = i27 % 128;
            int i28 = i27 % 2;
            int i29 = i6 & 61;
            int i30 = (i29 - (~(-(-((i6 ^ 61) | i29))))) - 1;
            b = i30 % 128;
            if (i30 % 2 == 0) {
                return "TOP";
            }
            obj.hashCode();
            throw null;
        }
        if (i == 7) {
            int i31 = ((i6 | 109) << 1) - (i6 ^ 109);
            b = i31 % 128;
            if (i31 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i32 = (i6 ^ 70) + ((i6 & 70) << 1);
            int i33 = (i32 ^ (-1)) + (i32 << 1);
            b = i33 % 128;
            int i34 = i33 % 2;
            return "BOTTOM";
        }
        if (i != 8) {
            int i35 = (i6 | 73) << 1;
            int i36 = -((i6 & (-74)) | ((~i6) & 73));
            int i37 = (i35 & i36) + (i35 | i36);
            b = i37 % 128;
            if (i37 % 2 != 0) {
                int i38 = 33 / 0;
            }
            return "null";
        }
        int i39 = (i3 & (-4)) | ((~i3) & 3);
        int i40 = -(-((i3 & 3) << 1));
        int i41 = ((i39 | i40) << 1) - (i39 ^ i40);
        a = i41 % 128;
        if (i41 % 2 == 0) {
            int i42 = 90 / 0;
        }
        int i43 = ((i3 | 21) << 1) - (i3 ^ 21);
        a = i43 % 128;
        int i44 = i43 % 2;
        return "BASELINE";
    }

    public static boolean E(EditText editText, String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 101;
        int i4 = i3 + ((i2 ^ 101) | i3);
        b = i4 % 128;
        int i5 = i4 % 2;
        String strTrim = editText.getText().toString().trim();
        int i6 = b;
        int i7 = (((i6 ^ 7) | (i6 & 7)) << 1) - (((~i6) & 7) | (i6 & (-8)));
        a = i7 % 128;
        int i8 = i7 % 2;
        boolean zEquals = strTrim.equals(str);
        int i9 = a;
        int i10 = i9 ^ 15;
        int i11 = (((i9 & 15) | i10) << 1) - i10;
        b = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 94 / 0;
        }
        return zEquals;
    }

    public static /* synthetic */ String F(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 | 77) << 1) - ((i3 & (-78)) | ((~i3) & 77));
        int i5 = i4 % 128;
        b = i5;
        int i6 = i4 % 2;
        if (i == 1) {
            int i7 = (i5 ^ 13) + ((i5 & 13) << 1);
            int i8 = i7 % 128;
            a = i8;
            int i9 = i7 % 2;
            int i10 = (-2) - (((i8 ^ 22) + ((i8 & 22) << 1)) ^ (-1));
            b = i10 % 128;
            int i11 = i10 % 2;
            return "BEGIN_ARRAY";
        }
        if (i == 2) {
            int i12 = (((i5 ^ 89) | (i5 & 89)) << 1) - ((i5 & (-90)) | ((~i5) & 89));
            a = i12 % 128;
            int i13 = i12 % 2;
            int i14 = i5 + 99;
            a = i14 % 128;
            int i15 = i14 % 2;
            return "END_ARRAY";
        }
        Object obj = null;
        if (i == 3) {
            int i16 = i5 + 77;
            a = i16 % 128;
            if (i16 % 2 != 0) {
                return "BEGIN_OBJECT";
            }
            obj.hashCode();
            throw null;
        }
        if (i == 4) {
            int i17 = ((i5 ^ 114) + ((i5 & 114) << 1)) - 1;
            a = i17 % 128;
            if (i17 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i18 = i5 & 45;
            int i19 = (~i18) & (i5 | 45);
            int i20 = i18 << 1;
            int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
            a = i21 % 128;
            if (i21 % 2 != 0) {
                return "END_OBJECT";
            }
            throw null;
        }
        if (i == 5) {
            int i22 = i3 & 91;
            int i23 = ((~i22) & (i3 | 91)) + (i22 << 1);
            b = i23 % 128;
            int i24 = i23 % 2;
            int i25 = i3 & 49;
            int i26 = i25 + ((i3 ^ 49) | i25);
            b = i26 % 128;
            if (i26 % 2 != 0) {
                int i27 = 55 / 0;
            }
            return "NAME";
        }
        if (i == 6) {
            int i28 = i5 ^ 117;
            int i29 = (i5 & 117) << 1;
            int i30 = ((i28 | i29) << 1) - (i28 ^ i29);
            int i31 = i30 % 128;
            a = i31;
            if (i30 % 2 == 0) {
                throw null;
            }
            int i32 = i31 & 101;
            int i33 = -(-((i31 ^ 101) | i32));
            int i34 = ((i32 | i33) << 1) - (i33 ^ i32);
            b = i34 % 128;
            if (i34 % 2 != 0) {
                int i35 = 7 / 0;
            }
            return "STRING";
        }
        if (i == 7) {
            int i36 = i3 & 87;
            int i37 = -(-((i3 ^ 87) | i36));
            int i38 = (i36 & i37) + (i36 | i37);
            b = i38 % 128;
            if (i38 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i39 = i3 & 7;
            int i40 = (i39 - (~(-(-((i3 ^ 7) | i39))))) - 1;
            b = i40 % 128;
            if (i40 % 2 != 0) {
                int i41 = 34 / 0;
            }
            return "NUMBER";
        }
        if (i == 8) {
            int i42 = i3 & 49;
            int i43 = ((i3 ^ 49) | i42) << 1;
            int i44 = -((i3 | 49) & (~i42));
            int i45 = ((i43 | i44) << 1) - (i43 ^ i44);
            int i46 = i45 % 128;
            b = i46;
            int i47 = i45 % 2;
            int i48 = i46 & 13;
            int i49 = ((i46 ^ 13) | i48) << 1;
            int i50 = -((i46 | 13) & (~i48));
            int i51 = ((i49 | i50) << 1) - (i50 ^ i49);
            a = i51 % 128;
            if (i51 % 2 != 0) {
                return "BOOLEAN";
            }
            obj.hashCode();
            throw null;
        }
        if (i == 9) {
            int i52 = i5 & 83;
            int i53 = (i5 ^ 83) | i52;
            int i54 = (i52 & i53) + (i52 | i53);
            a = i54 % 128;
            if (i54 % 2 == 0) {
                int i55 = 97 / 0;
            }
            int i56 = (((i5 | 116) << 1) - (i5 ^ 116)) - 1;
            a = i56 % 128;
            int i57 = i56 % 2;
            return "NULL";
        }
        if (i != 10) {
            int i58 = i3 & 71;
            int i59 = -(-(i3 | 71));
            int i60 = ((i58 | i59) << 1) - (i58 ^ i59);
            b = i60 % 128;
            int i61 = i60 % 2;
            return "null";
        }
        int i62 = i5 + 103;
        a = i62 % 128;
        int i63 = i62 % 2;
        int i64 = i5 + 49;
        a = i64 % 128;
        if (i64 % 2 != 0) {
            return "END_DOCUMENT";
        }
        throw null;
    }

    public static View d(ViewGroup viewGroup, int i, ViewGroup viewGroup2, boolean z) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 63;
        int i5 = ((((i3 ^ 63) | i4) << 1) - (~(-((i3 | 63) & (~i4))))) - 1;
        a = i5 % 128;
        int i6 = i5 % 2;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (i6 != 0) {
            return layoutInflaterFrom.inflate(i, viewGroup2, z);
        }
        View viewInflate = layoutInflaterFrom.inflate(i, viewGroup2, z);
        int i7 = 88 / 0;
        return viewInflate;
    }

    public static float e(float f, float f2, float f3, float f4) {
        int i = 2 % 2;
        int i2 = b + 79;
        a = i2 % 128;
        return i2 % 2 == 0 ? (f % f2) * f3 * f4 : ((f - f2) * f3) + f4;
    }

    public static int f(int i, int i2, int i3, int i4) {
        int i5;
        int i6 = 2 % 2;
        int i7 = b;
        int i8 = i7 & 27;
        int i9 = -(-(i7 | 27));
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        int i11 = i10 % 128;
        a = i11;
        if (i10 % 2 == 0) {
            i5 = ((i % i2) / i3) >> i4;
        } else {
            int i12 = (i - (~i2)) - 1;
            int i13 = -(-i3);
            int i14 = (((~i13) & i12) | ((~i12) & i13)) + ((i12 & i13) << 1);
            int i15 = i14 & i4;
            i5 = i15 + ((i14 ^ i4) | i15);
        }
        int i16 = (((i11 | 84) << 1) - (i11 ^ 84)) - 1;
        b = i16 % 128;
        if (i16 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static int g(EditText editText) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 13;
        int i4 = (((i2 ^ 13) | i3) << 1) - ((i2 | 13) & (~i3));
        a = i4 % 128;
        int i5 = i4 % 2;
        int i6 = Integer.parseInt(editText.getText().toString());
        int i7 = a;
        int i8 = (((i7 | 117) << 1) - (~(-(i7 ^ 117)))) - 1;
        b = i8 % 128;
        if (i8 % 2 == 0) {
            return i6;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static int h(Spinner spinner) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 67;
        int i4 = (((i2 & 67) | i3) << 1) - i3;
        b = i4 % 128;
        int i5 = i4 % 2;
        int i6 = Integer.parseInt(spinner.getSelectedItem().toString());
        int i7 = b + 33;
        a = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 36 / 0;
        }
        return i6;
    }

    public static int i(RadioGroup radioGroup, int i, boolean z, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = i5 & 3;
        int i7 = (i6 - (~((i5 ^ 3) | i6))) - 1;
        b = i7 % 128;
        int i8 = i7 % 2;
        radioGroup.getChildAt(i).setEnabled(z);
        int i9 = -(-i3);
        int i10 = i2 | i9;
        int i11 = i10 << 1;
        int i12 = -((~(i9 & i2)) & i10);
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        int i14 = a;
        int i15 = ((i14 ^ 39) | (i14 & 39)) << 1;
        int i16 = -(((~i14) & 39) | (i14 & (-40)));
        int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
        b = i17 % 128;
        int i18 = i17 % 2;
        return i13;
    }

    public static int j(String str, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = a + 107;
        b = i4 % 128;
        int i5 = i4 % 2;
        int i6 = -(~(-(str.length() / i)));
        int i7 = ((i2 & i6) + (i6 | i2)) - 1;
        int i8 = a + 31;
        b = i8 % 128;
        int i9 = i8 % 2;
        return i7;
    }

    public static AlertDialog k(AlertDialog.Builder builder, boolean z) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 103;
        int i4 = i3 + ((i2 ^ 103) | i3);
        a = i4 % 128;
        int i5 = i4 % 2;
        Object obj = null;
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.show();
        if (i5 == 0) {
            alertDialogCreate.setCancelable(z);
            obj.hashCode();
            throw null;
        }
        alertDialogCreate.setCancelable(z);
        int i6 = a;
        int i7 = i6 & 105;
        int i8 = -(-((i6 ^ 105) | i7));
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        b = i9 % 128;
        if (i9 % 2 == 0) {
            return alertDialogCreate;
        }
        obj.hashCode();
        throw null;
    }

    public static String l(int i, String str, int i2, String str2, int i3) {
        int i4 = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        int i5 = a;
        int i6 = (i5 & 91) + (i5 | 91);
        b = i6 % 128;
        int i7 = i6 % 2;
        sb.append(str);
        sb.append(i2);
        int i8 = b;
        int i9 = ((i8 ^ 124) + ((i8 & 124) << 1)) - 1;
        a = i9 % 128;
        int i10 = i9 % 2;
        sb.append(str2);
        int i11 = b;
        int i12 = i11 & 55;
        int i13 = (i11 | 55) & (~i12);
        int i14 = i12 << 1;
        int i15 = (i13 & i14) + (i13 | i14);
        a = i15 % 128;
        int i16 = i15 % 2;
        sb.append(i3);
        String string = sb.toString();
        int i17 = (-2) - ((b + 98) ^ (-1));
        a = i17 % 128;
        int i18 = i17 % 2;
        return string;
    }

    public static String m(EditText editText) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 77;
        int i4 = (i2 | 77) & (~i3);
        int i5 = i3 << 1;
        int i6 = (i4 & i5) + (i4 | i5);
        a = i6 % 128;
        int i7 = i6 % 2;
        String strTrim = editText.getText().toString().trim();
        int i8 = a;
        int i9 = (i8 ^ 51) + ((i8 & 51) << 1);
        b = i9 % 128;
        if (i9 % 2 == 0) {
            return strTrim;
        }
        throw null;
    }

    public static String n(RecyclerView recyclerView, StringBuilder sb) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 77;
        int i4 = ((i2 | 77) & (~i3)) + (i3 << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        sb.append(recyclerView.F());
        String string = sb.toString();
        int i6 = a;
        int i7 = ((i6 ^ 34) + ((i6 & 34) << 1)) - 1;
        b = i7 % 128;
        if (i7 % 2 == 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static String o(String str, int i) {
        int i2 = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        int i3 = a;
        int i4 = i3 & 69;
        int i5 = (i4 - (~(-(-((i3 ^ 69) | i4))))) - 1;
        b = i5 % 128;
        int i6 = i5 % 2;
        sb.append(i);
        String string = sb.toString();
        int i7 = a;
        int i8 = i7 ^ 125;
        int i9 = (((i7 & 125) | i8) << 1) - i8;
        b = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 54 / 0;
        }
        return string;
    }

    public static String p(NoPasteEditText noPasteEditText, String str, String str2) {
        String strReplaceAll;
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 106) + ((i2 & 106) << 1)) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        String string = noPasteEditText.getText().toString();
        if (i4 == 0) {
            strReplaceAll = string.replaceAll(str, str2);
            int i5 = 93 / 0;
        } else {
            strReplaceAll = string.replaceAll(str, str2);
        }
        int i6 = a;
        int i7 = (((i6 | 2) << 1) - (i6 ^ 2)) - 1;
        b = i7 % 128;
        if (i7 % 2 == 0) {
            return strReplaceAll;
        }
        throw null;
    }

    public static String q(String str, Fragment fragment, String str2) {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        int i2 = a + 45;
        b = i2 % 128;
        int i3 = i2 % 2;
        sb.append(fragment);
        sb.append(str2);
        int i4 = a;
        int i5 = ((i4 ^ 2) + ((i4 & 2) << 1)) - 1;
        b = i5 % 128;
        int i6 = i5 % 2;
        String string = sb.toString();
        int i7 = a;
        int i8 = (i7 | 37) << 1;
        int i9 = -(((~i7) & 37) | (i7 & (-38)));
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        b = i10 % 128;
        int i11 = i10 % 2;
        return string;
    }

    public static String r(String str, String str2) {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        int i2 = b;
        int i3 = (i2 ^ 43) + ((i2 & 43) << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        sb.append(str2);
        String string = sb.toString();
        int i5 = b;
        int i6 = (((i5 | 64) << 1) - (i5 ^ 64)) - 1;
        a = i6 % 128;
        if (i6 % 2 != 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static String s(StringBuilder sb, int i, String str) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (((i3 | 44) << 1) - (i3 ^ 44)) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        sb.append(i);
        sb.append(str);
        int i6 = a;
        int i7 = i6 ^ 85;
        int i8 = (i6 & 85) << 1;
        int i9 = (i7 & i8) + (i8 | i7);
        b = i9 % 128;
        int i10 = i9 % 2;
        String string = sb.toString();
        int i11 = a;
        int i12 = (i11 ^ 25) + ((i11 & 25) << 1);
        b = i12 % 128;
        int i13 = i12 % 2;
        return string;
    }

    public static String t(String str, String str2, String str3) {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        int i2 = a + 55;
        b = i2 % 128;
        int i3 = i2 % 2;
        sb.append(str2);
        sb.append(str3);
        int i4 = b;
        int i5 = i4 & 27;
        int i6 = (i4 | 27) & (~i5);
        int i7 = i5 << 1;
        int i8 = (i6 & i7) + (i6 | i7);
        a = i8 % 128;
        if (i8 % 2 != 0) {
            return sb.toString();
        }
        sb.toString();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static String u(StringBuilder sb, String str, String str2) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 27;
        int i4 = (i3 - (~(-(-((i2 ^ 27) | i3))))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        sb.append(str);
        sb.append(str2);
        String string = sb.toString();
        int i6 = a;
        int i7 = (i6 & (-22)) | ((~i6) & 21);
        int i8 = -(-((i6 & 21) << 1));
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        b = i9 % 128;
        if (i9 % 2 == 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void v(StringBuilder sb, String str, char c2, String str2) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 117;
        int i4 = (i2 | 117) & (~i3);
        int i5 = i3 << 1;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        sb.append(str);
        sb.append(c2);
        int i8 = b;
        int i9 = ((((i8 ^ 97) | (i8 & 97)) << 1) - (~(-(((~i8) & 97) | (i8 & (-98)))))) - 1;
        a = i9 % 128;
        int i10 = i9 % 2;
        sb.append(str2);
        int i11 = a;
        int i12 = ((i11 ^ 13) | (i11 & 13)) << 1;
        int i13 = -(((~i11) & 13) | (i11 & (-14)));
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        b = i14 % 128;
        if (i14 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static StringBuilder w(String str) {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        int i2 = b;
        int i3 = i2 + 21;
        a = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = ((i2 | 121) << 1) - (i2 ^ 121);
        a = i4 % 128;
        int i5 = i4 % 2;
        return sb;
    }

    public static String x(XmlPullParser xmlPullParser, StringBuilder sb, String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 125) + (i2 | 125);
        b = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        sb.append(xmlPullParser.getPositionDescription());
        if (i4 != 0) {
            sb.append(str);
            obj.hashCode();
            throw null;
        }
        sb.append(str);
        int i5 = b + 75;
        a = i5 % 128;
        if (i5 % 2 == 0) {
            sb.toString();
            obj.hashCode();
            throw null;
        }
        String string = sb.toString();
        int i6 = a;
        int i7 = (((i6 ^ 49) | (i6 & 49)) << 1) - (((~i6) & 49) | (i6 & (-50)));
        b = i7 % 128;
        if (i7 % 2 == 0) {
            return string;
        }
        obj.hashCode();
        throw null;
    }

    public static GregorianCalendar y(Date date) {
        int i = 2 % 2;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(date);
        int i2 = b;
        int i3 = (((i2 & (-66)) | ((~i2) & 65)) - (~(-(-((i2 & 65) << 1))))) - 1;
        a = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i2 & 87;
        int i5 = -(-(i2 | 87));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        return gregorianCalendar;
    }

    public static void z(SessionManager sessionManager, StringBuilder sb, HashMap map, String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 39;
        int i4 = (((i2 | 39) & (~i3)) - (~(i3 << 1))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        sb.append(sessionManager.u());
        if (i5 == 0) {
            sb.toString();
            throw null;
        }
        map.put(str, sb.toString());
        int i6 = a;
        int i7 = i6 | 67;
        int i8 = i7 << 1;
        int i9 = -((~(i6 & 67)) & i7);
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        b = i10 % 128;
        int i11 = i10 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.X.i
    public final void c(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 87;
        int i5 = -(-((i3 ^ 87) | i4));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        int i8 = ActivityAgriculture.af;
        int i9 = a;
        int i10 = (i9 & 113) + (i9 | 113);
        b = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 81 / 0;
        }
    }
}
