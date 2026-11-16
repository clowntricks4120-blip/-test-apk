package ivas.gov.bisp.enumeration;

import android.app.ProgressDialog;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.orm.SugarContext;
import ivas.gov.bisp.enumeration.bK.ah;
import java.lang.reflect.Constructor;
import java.util.Map;
import net.sqlcipher.BuildConfig;
import o.k;

/* JADX INFO: loaded from: classes.dex */
public class MainActivity extends AppCompatActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char a$s60$44 = 31406;
    private static char[] c$s59$44 = {20336, 20346, 20294, 20300, 20321, 20340, 20225, 20349, 20320, 20338, 20296, 20254, 20342, 20289, 20226, 20299, 20306, 20341, 20316, 20298, 20326, 20327, 20227, 20251, 20314, 20319, 20310, 20315, 20291, 20281, 20317, 20318, 20253, 20229, 20228, 20304, 20339, 20293, 20325, 20295, 20351, 20297, 20350, 20343, 20301, 20312, 20288, 20250, 20243};
    private static int p = 1;
    private static int q;

    @BindView
    public TextView textViewType;

    @BindView
    public TextView textViewVersion;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i = 2 % 2;
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);
        Map<Class<?>, Constructor<? extends Unbinder>> map = ButterKnife.a;
        ButterKnife.c(this, getWindow().getDecorView());
        SugarContext.init(this);
        new ProgressDialog(this).setCancelable(false);
        SharedPreferences sharedPreferences = ah.c.d;
        Object[] objArr = new Object[1];
        a((byte) (getPackageName().codePointAt(19) - 59), getApplicationInfo().targetSdkVersion - 23, new char[]{4, ',', 27, '\f', 26, 14, '!', 21}, objArr);
        if (sharedPreferences.getInt(((String) objArr[0]).intern(), 1) == 1) {
            TextView textView = this.textViewType;
            Object[] objArr2 = new Object[1];
            a((byte) (getApplicationInfo().targetSdkVersion + 20), (KeyEvent.getMaxKeyCode() >> 16) + 34, new char[]{'/', 7, '%', '\f', '*', '\r', '\t', '\r', 6, '.', '\r', '.', '\t', '!', 3, 30, 27, '\f', 18, '%', 20, 11, ',', '\r', 13853, 13853, 26, 25, '%', 14, '&', 25, 16, ' '}, objArr2);
            textView.setText(((String) objArr2[0]).intern());
            int i2 = p + 1;
            q = i2 % 128;
            int i3 = i2 % 2;
        } else {
            SharedPreferences sharedPreferences2 = ah.c.d;
            Object[] objArr3 = new Object[1];
            a((byte) (55 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), getPackageName().codePointAt(17) - 101, new char[]{4, ',', 27, '\f', 26, 14, '!', 21}, objArr3);
            if (sharedPreferences2.getInt(((String) objArr3[0]).intern(), 2) == 1) {
                int i4 = q + 97;
                p = i4 % 128;
                int i5 = i4 % 2;
                TextView textView2 = this.textViewType;
                Object[] objArr4 = new Object[1];
                a((byte) (34 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 35, new char[]{'/', 7, '%', '\f', '*', '\r', '\t', '\r', 6, '.', '\r', '.', 7, 29, 25, '.', 7, 4, 21, 27, '&', '*', 6, 27, '/', 25, 20, 6, 7, 30, ' ', 21, 21, '&', 18, '%', 25, 17, 13846}, objArr4);
                textView2.setText(((String) objArr4[0]).intern());
            } else {
                TextView textView3 = this.textViewType;
                Object[] objArr5 = new Object[1];
                a((byte) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) - 17), getPackageName().length() + 9, new char[]{'/', 7, '%', '\f', '*', '\r', '\t', '\r', 6, '.', '\r', '.', '\t', 1, '!', 21, '\t', ')', 25, '-', 20, 11, ',', '\r', 13834, 13834, 26, 25, '%', 14, '&', 25, 16, ' '}, objArr5);
                textView3.setText(((String) objArr5[0]).intern());
            }
        }
        TextView textView4 = this.textViewVersion;
        Object[] objArr6 = new Object[1];
        a((byte) (getPackageName().codePointAt(4) + 20), 23 - KeyEvent.keyCodeFromString(BuildConfig.FLAVOR), new char[]{')', 30, '!', '\"', ',', 27, '$', 5, '(', '\n', '+', '!', 13805, 13805, '*', '\r', 16, '\'', 6, '\r', 27, 1, 13806}, objArr6);
        textView4.setText(((String) objArr6[0]).intern());
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        int i = 2 % 2;
        int i2 = q + 79;
        p = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = q + 47;
        p = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void a(byte b, int i, char[] cArr, Object[] objArr) {
        int i2;
        int i3 = 2 % 2;
        k kVar = new k();
        char[] cArr2 = c$s59$44;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                cArr3[i4] = (char) (((long) cArr2[i4]) ^ 3459633260503792297L);
            }
            cArr2 = cArr3;
        }
        char c = (char) (3459633260503792297L ^ ((long) a$s60$44));
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            kVar.c = 0;
            while (kVar.c < i2) {
                int i5 = $11 + 89;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                kVar.e = cArr[kVar.c];
                kVar.b = cArr[kVar.c + 1];
                if (kVar.e == kVar.b) {
                    int i7 = $11 + 113;
                    $10 = i7 % 128;
                    if (i7 % 2 != 0) {
                        cArr4[kVar.c] = (char) (kVar.e % b);
                        cArr4[kVar.c] = (char) (kVar.b << b);
                    } else {
                        cArr4[kVar.c] = (char) (kVar.e - b);
                        cArr4[kVar.c + 1] = (char) (kVar.b - b);
                    }
                } else {
                    kVar.a = kVar.e / c;
                    kVar.h = kVar.e % c;
                    kVar.d = kVar.b / c;
                    kVar.f = kVar.b % c;
                    if (kVar.h == kVar.f) {
                        kVar.a = ((kVar.a + c) - 1) % c;
                        kVar.d = ((kVar.d + c) - 1) % c;
                        int i8 = (kVar.a * c) + kVar.h;
                        int i9 = (kVar.d * c) + kVar.f;
                        cArr4[kVar.c] = cArr2[i8];
                        cArr4[kVar.c + 1] = cArr2[i9];
                    } else if (kVar.a == kVar.d) {
                        int i10 = $11 + 15;
                        $10 = i10 % 128;
                        int i11 = i10 % 2;
                        kVar.h = ((kVar.h + c) - 1) % c;
                        kVar.f = ((kVar.f + c) - 1) % c;
                        int i12 = (kVar.a * c) + kVar.h;
                        int i13 = (kVar.d * c) + kVar.f;
                        cArr4[kVar.c] = cArr2[i12];
                        cArr4[kVar.c + 1] = cArr2[i13];
                        int i14 = $11 + 53;
                        $10 = i14 % 128;
                        int i15 = i14 % 2;
                    } else {
                        int i16 = (kVar.a * c) + kVar.f;
                        int i17 = (kVar.d * c) + kVar.h;
                        cArr4[kVar.c] = cArr2[i16];
                        cArr4[kVar.c + 1] = cArr2[i17];
                    }
                }
                kVar.c += 2;
            }
        }
        for (int i18 = 0; i18 < i; i18++) {
            cArr4[i18] = (char) (cArr4[i18] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }
}
