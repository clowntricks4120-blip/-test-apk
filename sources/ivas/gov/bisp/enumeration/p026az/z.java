package ivas.gov.bisp.enumeration.p026az;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.Context;
import android.os.IBinder;
import android.view.inputmethod.InputMethodManager;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.X.r;
import ivas.gov.bisp.enumeration.p091n.j;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class z {
    private static int a = 1;
    private static int b;

    public class bvp implements DatePickerDialog.OnDateSetListener {
        private static int a = 1;
        private static int b;
        public final /* synthetic */ r c;

        public bvp(r rVar) {
            this.c = rVar;
        }

        public final String c(int i) {
            int i2 = 2 % 2;
            int i3 = a + 117;
            int i4 = i3 % 128;
            b = i4;
            int i5 = i3 % 2;
            if (i >= 10) {
                int i6 = i4 ^ 45;
                int i7 = (((i4 & 45) | i6) << 1) - i6;
                a = i7 % 128;
                int i8 = i7 % 2;
                String strValueOf = String.valueOf(i);
                if (i8 == 0) {
                    int i9 = 41 / 0;
                }
                return strValueOf;
            }
            StringBuilder sbW = j.w("0");
            sbW.append(String.valueOf(i));
            int i10 = a + 97;
            b = i10 % 128;
            int i11 = i10 % 2;
            String string = sbW.toString();
            int i12 = a + 37;
            b = i12 % 128;
            int i13 = i12 % 2;
            return string;
        }

        @Override // android.app.DatePickerDialog.OnDateSetListener
        public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
            int i4 = 2 % 2;
            StringBuilder sb = new StringBuilder();
            sb.append(c(i));
            int i5 = a + 9;
            b = i5 % 128;
            int i6 = i5 % 2;
            sb.append("-");
            sb.append(i6 != 0 ? c(i2) : c((-2) - ((i2 + 2) ^ (-1))));
            sb.append("-");
            int i7 = a;
            int i8 = (i7 & (-20)) | ((~i7) & 19);
            int i9 = (i7 & 19) << 1;
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            b = i10 % 128;
            int i11 = i10 % 2;
            sb.append(c(i3));
            String string = sb.toString();
            r rVar = this.c;
            int i12 = a;
            int i13 = (i12 & 105) + (i12 | 105);
            b = i13 % 128;
            if (i13 % 2 != 0) {
                rVar.e(string, z.c("yyyy-MM-dd", "MMM, dd yyyy", string));
                int i14 = 43 / 0;
            } else {
                rVar.e(string, z.c("yyyy-MM-dd", "MMM, dd yyyy", string));
            }
            int i15 = a;
            int i16 = (-2) - (((i15 ^ 70) + ((i15 & 70) << 1)) ^ (-1));
            b = i16 % 128;
            int i17 = i16 % 2;
        }
    }

    public class bvr implements Runnable {
        private static int a = 1;
        private static int b;
        public final /* synthetic */ Context c;
        public final /* synthetic */ String d;
        public final /* synthetic */ Spinner e;

        public bvr(Context context, String str, Spinner spinner) {
            this.c = context;
            this.d = str;
            this.e = spinner;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = 2 % 2;
            int i2 = a + 37;
            b = i2 % 128;
            int i3 = i2 % 2;
            Context context = this.c;
            StringBuilder sbW = j.w("Please Select ");
            String str = this.d;
            int i4 = a;
            int i5 = i4 | 63;
            int i6 = i5 << 1;
            int i7 = -((~(i4 & 63)) & i5);
            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
            b = i8 % 128;
            int i9 = i8 % 2;
            sbW.append(str);
            Toast.makeText(context, sbW.toString(), 1).show();
            int i10 = a;
            int i11 = i10 & 83;
            int i12 = -(-((i10 ^ 83) | i11));
            int i13 = (i11 & i12) + (i12 | i11);
            b = i13 % 128;
            int i14 = i13 % 2;
            this.e.requestFocus();
            Object systemService = this.c.getSystemService("input_method");
            int i15 = b;
            int i16 = (i15 ^ 7) + ((i15 & 7) << 1);
            a = i16 % 128;
            int i17 = i16 % 2;
            ((InputMethodManager) systemService).showSoftInput(this.e, 1);
            int i18 = b;
            int i19 = ((i18 & (-122)) | ((~i18) & 121)) + ((i18 & 121) << 1);
            a = i19 % 128;
            if (i19 % 2 == 0) {
                int i20 = 91 / 0;
            }
        }
    }

    public class bvs implements Runnable {
        private static int a = 1;
        private static int b;
        public final /* synthetic */ Context c;
        public final /* synthetic */ String d;
        public final /* synthetic */ EditText e;

        public bvs(Context context, String str, EditText editText) {
            this.c = context;
            this.d = str;
            this.e = editText;
        }

        @Override // java.lang.Runnable
        public void run() {
            InputMethodManager inputMethodManager;
            EditText editText;
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 57;
            int i4 = (i2 | 57) & (~i3);
            int i5 = -(-(i3 << 1));
            int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
            a = i6 % 128;
            if (i6 % 2 == 0) {
                j.w("Please Enter ");
                throw null;
            }
            Context context = this.c;
            StringBuilder sbW = j.w("Please Enter ");
            int i7 = b;
            int i8 = ((i7 ^ 15) - (~(-(-((i7 & 15) << 1))))) - 1;
            a = i8 % 128;
            int i9 = i8 % 2;
            sbW.append(this.d);
            int i10 = b;
            int i11 = i10 ^ 103;
            int i12 = ((((i10 & 103) | i11) << 1) - (~(-i11))) - 1;
            a = i12 % 128;
            if (i12 % 2 == 0) {
                Toast.makeText(context, sbW.toString(), 1).show();
            } else {
                Toast.makeText(context, sbW.toString(), 0).show();
            }
            this.e.requestFocus();
            Context context2 = this.c;
            int i13 = a;
            int i14 = i13 & 37;
            int i15 = (i14 - (~((i13 ^ 37) | i14))) - 1;
            b = i15 % 128;
            if (i15 % 2 != 0) {
                inputMethodManager = (InputMethodManager) context2.getSystemService("input_method");
                editText = this.e;
                int i16 = 91 / 0;
            } else {
                inputMethodManager = (InputMethodManager) context2.getSystemService("input_method");
                editText = this.e;
            }
            int i17 = a;
            int i18 = (i17 ^ 49) + ((i17 & 49) << 1);
            b = i18 % 128;
            if (i18 % 2 != 0) {
                inputMethodManager.showSoftInput(editText, 0);
            } else {
                inputMethodManager.showSoftInput(editText, 1);
            }
        }
    }

    public class bvu implements Runnable {
        private static int a = 1;
        private static int b;
        public final /* synthetic */ Context c;
        public final /* synthetic */ String d;

        public bvu(Context context, String str) {
            this.c = context;
            this.d = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 105;
            int i4 = (i3 - (~((i2 ^ 105) | i3))) - 1;
            b = i4 % 128;
            (i4 % 2 != 0 ? Toast.makeText(this.c, this.d, 1) : Toast.makeText(this.c, this.d, 0)).show();
            int i5 = b;
            int i6 = i5 & 93;
            int i7 = ((i5 ^ 93) | i6) << 1;
            int i8 = -((i5 | 93) & (~i6));
            int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
            a = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 82 / 0;
            }
        }
    }

    public static void d(Context context) {
        InputMethodManager inputMethodManager;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 79;
        int i4 = (i2 ^ 79) | i3;
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        try {
            if (i5 % 2 != 0) {
                inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
                int i6 = 78 / 0;
            } else {
                inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
            }
            int i7 = a;
            int i8 = ((i7 ^ 116) + ((i7 & 116) << 1)) - 1;
            b = i8 % 128;
            int i9 = i8 % 2;
            IBinder windowToken = ((Activity) context).getCurrentFocus().getWindowToken();
            int i10 = a;
            int i11 = i10 & 83;
            int i12 = ((i10 | 83) & (~i11)) + (i11 << 1);
            b = i12 % 128;
            int i13 = i12 % 2;
            inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
            int i14 = b;
            int i15 = i14 & 103;
            int i16 = -(-((i14 ^ 103) | i15));
            int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
            a = i17 % 128;
            if (i17 % 2 == 0) {
                throw null;
            }
        } catch (Exception unused) {
        }
    }

    public static String e() {
        int i = 2 % 2;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        int i2 = b;
        int i3 = i2 & 55;
        int i4 = ((((i2 ^ 55) | i3) << 1) - (~(-((i2 | 55) & (~i3))))) - 1;
        a = i4 % 128;
        if (i4 % 2 == 0) {
            simpleDateFormat.format(date);
            throw null;
        }
        String str = simpleDateFormat.format(date);
        int i5 = a + 5;
        b = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0037  */
    public static int g(RadioGroup radioGroup) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (-2) - ((((i2 | 28) << 1) - (i2 ^ 28)) ^ (-1));
        a = i3 % 128;
        int i4 = 0;
        if (i3 % 2 == 0) {
            if (radioGroup.getCheckedRadioButtonId() != radioGroup.getChildAt(0).getId()) {
                int i5 = b;
                int i6 = i5 & 103;
                int i7 = (i5 ^ 103) | i6;
                int i8 = (i6 & i7) + (i7 | i6);
                int i9 = i8 % 128;
                a = i9;
                int i10 = i8 % 2;
                int i11 = (i9 & (-94)) | ((~i9) & 93);
                int i12 = -(-((i9 & 93) << 1));
                int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
                b = i13 % 128;
                int i14 = i13 % 2;
                i4 = -1;
            } else {
                i4 = 1;
            }
        } else if (radioGroup.getCheckedRadioButtonId() != radioGroup.getChildAt(0).getId()) {
            int i15 = b;
            int i16 = i15 & 103;
            int i17 = (i15 ^ 103) | i16;
            int i18 = (i16 & i17) + (i17 | i16);
            int i19 = i18 % 128;
            a = i19;
            int i110 = i18 % 2;
            int i111 = (i19 & (-94)) | ((~i19) & 93);
            int i112 = -(-((i19 & 93) << 1));
            int i113 = (i111 ^ i112) + ((i112 & i111) << 1);
            b = i113 % 128;
            int i114 = i113 % 2;
            i4 = -1;
        }
        if (radioGroup.getCheckedRadioButtonId() == radioGroup.getChildAt(1).getId()) {
            int i20 = b;
            int i21 = i20 ^ 31;
            int i22 = ((((i20 & 31) | i21) << 1) - (~(-i21))) - 1;
            a = i22 % 128;
            int i23 = i22 % 2;
            int i24 = ((i20 ^ 56) + ((i20 & 56) << 1)) - 1;
            a = i24 % 128;
            int i25 = i24 % 2;
            i4 = 1;
        }
        if (radioGroup.getCheckedRadioButtonId() == radioGroup.getChildAt(2).getId()) {
            int i26 = b;
            int i27 = ((i26 & 117) - (~(i26 | 117))) - 1;
            int i28 = i27 % 128;
            a = i28;
            i4 = i27 % 2 == 0 ? 5 : 2;
            int i29 = i28 + 123;
            b = i29 % 128;
            int i30 = i29 % 2;
        }
        int i31 = (-2) - ((a + 86) ^ (-1));
        b = i31 % 128;
        if (i31 % 2 == 0) {
            return i4;
        }
        throw null;
    }

    public static Date h(String str, String str2) {
        int i = 2 % 2;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2, Locale.getDefault());
        int i2 = b;
        int i3 = (i2 & 99) + (i2 | 99);
        a = i3 % 128;
        int i4 = i3 % 2;
        try {
            Date date = simpleDateFormat.parse(str);
            int i5 = b;
            int i6 = (i5 & 89) + (i5 | 89);
            a = i6 % 128;
            int i7 = i6 % 2;
            return date;
        } catch (ParseException unused) {
            return null;
        }
    }

    public static void k(Context context, EditText editText, String str) {
        int i = 2 % 2;
        ((Activity) context).runOnUiThread(new bvs(context, str, editText));
        int i2 = a;
        int i3 = i2 ^ 35;
        int i4 = ((((i2 & 35) | i3) << 1) - (~(-i3))) - 1;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static void l(Context context, EditText editText, String str) {
        int i = 2 % 2;
        Activity activity = (Activity) context;
        bvt bvtVar = new bvt(context, str, editText);
        int i2 = b;
        int i3 = (i2 | 75) << 1;
        int i4 = -(((~i2) & 75) | (i2 & (-76)));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        if (i5 % 2 == 0) {
            activity.runOnUiThread(bvtVar);
            throw null;
        }
        activity.runOnUiThread(bvtVar);
        int i6 = b;
        int i7 = ((i6 | 1) << 1) - (i6 ^ 1);
        a = i7 % 128;
        int i8 = i7 % 2;
    }

    public static boolean m(Context context, RadioGroup radioGroup, String str) {
        boolean z;
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 124) + ((i2 & 124) << 1)) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        int checkedRadioButtonId = radioGroup.getCheckedRadioButtonId();
        if (i4 != 0 ? checkedRadioButtonId != radioGroup.getChildAt(1).getId() : checkedRadioButtonId != radioGroup.getChildAt(1).getId()) {
            int i5 = b;
            int i6 = i5 & 123;
            int i7 = i6 + ((i5 ^ 123) | i6);
            a = i7 % 128;
            int i8 = i7 % 2;
            if (radioGroup.getCheckedRadioButtonId() != radioGroup.getChildAt(0).getId()) {
                Activity activity = (Activity) context;
                bvq bvqVar = new bvq(context, str, radioGroup);
                int i9 = b;
                int i10 = i9 & 57;
                int i11 = (((i9 | 57) & (~i10)) - (~(i10 << 1))) - 1;
                a = i11 % 128;
                if (i11 % 2 == 0) {
                    activity.runOnUiThread(bvqVar);
                    z = true;
                } else {
                    activity.runOnUiThread(bvqVar);
                    z = false;
                }
                int i12 = a;
                int i13 = ((i12 | 29) << 1) - (i12 ^ 29);
                b = i13 % 128;
                if (i13 % 2 != 0) {
                    int i14 = 5 / 0;
                }
                return z;
            }
        }
        int i15 = b;
        int i16 = ((i15 ^ 99) | (i15 & 99)) << 1;
        int i17 = -(((~i15) & 99) | (i15 & (-100)));
        int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
        a = i18 % 128;
        int i19 = i18 % 2;
        return true;
    }

    public static void n(Context context, String str) {
        int i = 2 % 2;
        ((Activity) context).runOnUiThread(new bvu(context, str));
        int i2 = a;
        int i3 = i2 & 27;
        int i4 = (i3 - (~(-(-((i2 ^ 27) | i3))))) - 1;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 65 / 0;
        }
    }

    public static void o(Context context, Spinner spinner, String str) {
        int i = 2 % 2;
        ((Activity) context).runOnUiThread(new bvr(context, str, spinner));
        int i2 = a;
        int i3 = ((i2 | 31) << 1) - (i2 ^ 31);
        b = i3 % 128;
        int i4 = i3 % 2;
    }

    public static int i(RadioGroup radioGroup) {
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 ^ 55) | (i3 & 55)) << 1;
        int i5 = -(((~i3) & 55) | (i3 & (-56)));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        if (radioGroup.getCheckedRadioButtonId() == radioGroup.getChildAt(0).getId()) {
            int i8 = b;
            int i9 = (i8 & 39) + (i8 | 39);
            int i10 = i9 % 128;
            a = i10;
            int i11 = i9 % 2;
            int i12 = i10 + 19;
            b = i12 % 128;
            int i13 = i12 % 2;
            i = 1;
        } else {
            int i14 = a;
            int i15 = (i14 & 31) + (i14 | 31);
            b = i15 % 128;
            int i16 = i15 % 2;
            i = -1;
        }
        if (radioGroup.getCheckedRadioButtonId() == radioGroup.getChildAt(1).getId()) {
            int i17 = a;
            int i18 = i17 & 7;
            int i19 = i18 + ((i17 ^ 7) | i18);
            b = i19 % 128;
            i = i19 % 2 != 0 ? 1 : 0;
        }
        int i20 = b;
        int i21 = i20 & 115;
        int i22 = -(-(i20 | 115));
        int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
        a = i23 % 128;
        if (i23 % 2 != 0) {
            return i;
        }
        throw null;
    }

    public class bvq implements Runnable {
        private static int a = 1;
        private static int b;
        public final /* synthetic */ Context c;
        public final /* synthetic */ String d;
        public final /* synthetic */ RadioGroup e;

        public bvq(Context context, String str, RadioGroup radioGroup) {
            this.c = context;
            this.d = str;
            this.e = radioGroup;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 91;
            int i4 = (i2 | 91) & (~i3);
            int i5 = -(-(i3 << 1));
            int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
            b = i6 % 128;
            Object obj = null;
            if (i6 % 2 != 0) {
                j.w("Please Select one value ");
                obj.hashCode();
                throw null;
            }
            Context context = this.c;
            StringBuilder sbW = j.w("Please Select one value ");
            int i7 = b;
            int i8 = i7 & 31;
            int i9 = i8 + ((i7 ^ 31) | i8);
            a = i9 % 128;
            if (i9 % 2 == 0) {
                sbW.append(this.d);
                sbW.toString();
                throw null;
            }
            sbW.append(this.d);
            Toast.makeText(context, sbW.toString(), 0).show();
            this.e.requestFocus();
            int i10 = b;
            int i11 = i10 & 15;
            int i12 = (i10 ^ 15) | i11;
            int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
            a = i13 % 128;
            int i14 = i13 % 2;
            InputMethodManager inputMethodManager = (InputMethodManager) this.c.getSystemService("input_method");
            int i15 = a;
            int i16 = ((i15 ^ 53) | (i15 & 53)) << 1;
            int i17 = -(((~i15) & 53) | (i15 & (-54)));
            int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
            b = i18 % 128;
            int i19 = i18 % 2;
            inputMethodManager.showSoftInput(this.e, 1);
            int i20 = a + 49;
            b = i20 % 128;
            int i21 = i20 % 2;
        }
    }

    public class bvt implements Runnable {
        private static int a = 1;
        private static int b;
        public final /* synthetic */ Context c;
        public final /* synthetic */ String d;
        public final /* synthetic */ EditText e;

        public bvt(Context context, String str, EditText editText) {
            this.c = context;
            this.d = str;
            this.e = editText;
        }

        @Override // java.lang.Runnable
        public void run() {
            Context context;
            String str;
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & 71) + (i2 | 71);
            b = i3 % 128;
            if (i3 % 2 != 0) {
                context = this.c;
                str = this.d;
            } else {
                context = this.c;
                str = this.d;
            }
            Toast.makeText(context, str, 0).show();
            this.e.requestFocus();
            Object systemService = this.c.getSystemService("input_method");
            int i4 = a;
            int i5 = i4 & 23;
            int i6 = i5 + ((i4 ^ 23) | i5);
            b = i6 % 128;
            int i7 = i6 % 2;
            ((InputMethodManager) systemService).showSoftInput(this.e, 1);
            int i8 = a;
            int i9 = (i8 ^ 23) + ((i8 & 23) << 1);
            b = i9 % 128;
            if (i9 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static String b() {
        int i = 2 % 2;
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss", Locale.ENGLISH);
        int i2 = a + 15;
        b = i2 % 128;
        int i3 = i2 % 2;
        String str = simpleDateFormat.format(date);
        int i4 = a + 103;
        b = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public static String f() {
        int i = 2 % 2;
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        int i2 = b;
        int i3 = ((i2 | 15) << 1) - (i2 ^ 15);
        a = i3 % 128;
        int i4 = i3 % 2;
        String str = simpleDateFormat.format(date);
        int i5 = b;
        int i6 = (i5 | 115) << 1;
        int i7 = -(i5 ^ 115);
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        a = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 85 / 0;
        }
        return str;
    }

    public static void p(boolean z, Context context, r rVar) {
        Calendar gregorianCalendar;
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = (((i4 | 118) << 1) - (i4 ^ 118)) - 1;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            gregorianCalendar = GregorianCalendar.getInstance();
            i = gregorianCalendar.get(1);
            i2 = gregorianCalendar.get(3);
        } else {
            gregorianCalendar = GregorianCalendar.getInstance();
            i = gregorianCalendar.get(1);
            i2 = gregorianCalendar.get(2);
        }
        int i6 = i2;
        int i7 = gregorianCalendar.get(5);
        DatePickerDialog datePickerDialog = new DatePickerDialog(context, new bvp(rVar), i, i6, i7);
        int i8 = a;
        int i9 = i8 & 23;
        int i10 = (i8 | 23) & (~i9);
        int i11 = -(-(i9 << 1));
        int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
        b = i12 % 128;
        Object obj = null;
        if (i12 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (z) {
            DatePicker datePicker = datePickerDialog.getDatePicker();
            Date date = new Date((i & (-1900)) + (i | (-1900)), i6, i7);
            int i13 = b;
            int i14 = i13 ^ 71;
            int i15 = ((i13 & 71) | i14) << 1;
            int i16 = -i14;
            int i17 = (i15 & i16) + (i15 | i16);
            a = i17 % 128;
            int i18 = i17 % 2;
            datePicker.setMaxDate(date.getTime());
            if (i18 == 0) {
                int i19 = 19 / 0;
            }
        }
        datePickerDialog.show();
        int i20 = b + 1;
        a = i20 % 128;
        if (i20 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static String j(Context context, RadioGroup radioGroup) {
        String string;
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 100) + ((i2 & 100) << 1)) - 1;
        a = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0 ? radioGroup.getCheckedRadioButtonId() != radioGroup.getChildAt(0).getId() : radioGroup.getCheckedRadioButtonId() != radioGroup.getChildAt(0).getId()) {
            int i4 = a;
            int i5 = (i4 & 115) + (i4 | 115);
            b = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 5 % 2;
            }
            string = "-1";
        } else {
            int i7 = a;
            int i8 = (((i7 ^ 39) | (i7 & 39)) << 1) - (((~i7) & 39) | (i7 & (-40)));
            b = i8 % 128;
            if (i8 % 2 != 0) {
                context.getResources().getString(R.string.yes);
                throw null;
            }
            string = context.getResources().getString(R.string.yes);
        }
        if (radioGroup.getCheckedRadioButtonId() == radioGroup.getChildAt(1).getId()) {
            int i9 = b;
            int i10 = i9 ^ 117;
            int i11 = ((i9 & 117) | i10) << 1;
            int i12 = -i10;
            int i13 = (i11 & i12) + (i11 | i12);
            a = i13 % 128;
            int i14 = i13 % 2;
            string = context.getResources().getString(R.string.no);
            int i15 = b;
            int i16 = (i15 & (-50)) | ((~i15) & 49);
            int i17 = -(-((i15 & 49) << 1));
            int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
            a = i18 % 128;
            int i19 = i18 % 2;
        }
        int i20 = b;
        int i21 = (i20 & (-22)) | ((~i20) & 21);
        int i22 = (i20 & 21) << 1;
        int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
        a = i23 % 128;
        if (i23 % 2 != 0) {
            return string;
        }
        obj.hashCode();
        throw null;
    }

    public static String c(String str, String str2, String str3) {
        int i = 2 % 2;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
        try {
            Date date = simpleDateFormat.parse(str3);
            int i2 = a + 15;
            b = i2 % 128;
            int i3 = i2 % 2;
            simpleDateFormat.applyPattern(str2);
            String str4 = simpleDateFormat.format(date);
            int i4 = b;
            int i5 = ((i4 ^ 71) | (i4 & 71)) << 1;
            int i6 = -(((~i4) & 71) | (i4 & (-72)));
            int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
            a = i7 % 128;
            int i8 = i7 % 2;
            return str4;
        } catch (ParseException unused) {
            return BuildConfig.FLAVOR;
        }
    }
}
