package ivas.gov.bisp.enumeration.p026az;

import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.widget.EditText;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class l implements TextWatcher {
    private static int a = 1;
    private static int b;
    public EditText c;

    public l(EditText editText) {
        this.c = editText;
        editText.setFilters(new InputFilter[]{new InputFilter() { // from class: ivas.gov.bisp.enumeration.az.u
            private static int a = 1;
            private static int b;

            static {
                int i = a;
                int i2 = ((i & 14) + (i | 14)) - 1;
                b = i2 % 128;
                int i3 = i2 % 2;
            }

            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                String str;
                int i5 = 2 % 2;
                while (true) {
                    if (i >= i2) {
                        int i6 = a;
                        int i7 = (i6 & 35) + (i6 | 35);
                        b = i7 % 128;
                        if (i7 % 2 != 0) {
                            int i8 = 4 / 2;
                        }
                        str = null;
                        break;
                    }
                    int i9 = b;
                    int i10 = ((i9 ^ 14) + ((i9 & 14) << 1)) - 1;
                    a = i10 % 128;
                    int i11 = i10 % 2;
                    if (!Character.isDigit(charSequence.charAt(i))) {
                        int i12 = b;
                        int i13 = ((i12 ^ 6) + ((i12 & 6) << 1)) - 1;
                        a = i13 % 128;
                        if (i13 % 2 != 0) {
                            if (charSequence.charAt(i) != '-') {
                                str = BuildConfig.FLAVOR;
                                int i14 = a;
                                int i15 = (i14 & 73) + (i14 | 73);
                                b = i15 % 128;
                                int i16 = i15 % 2;
                                break;
                            }
                        } else if (charSequence.charAt(i) != 'S') {
                            str = BuildConfig.FLAVOR;
                            int i17 = a;
                            int i18 = (i17 & 73) + (i17 | 73);
                            b = i18 % 128;
                            int i19 = i18 % 2;
                            break;
                        }
                    }
                    int i20 = i & 1;
                    i = ((((i ^ 1) | i20) << 1) - (~(-((i | 1) & (~i20))))) - 1;
                    int i21 = b;
                    int i22 = (((i21 | 61) << 1) - (~(-(((~i21) & 61) | (i21 & (-62)))))) - 1;
                    a = i22 % 128;
                    if (i22 % 2 == 0) {
                        int i23 = 2 % 4;
                    }
                }
                int i24 = a;
                int i25 = i24 & 107;
                int i26 = (((i24 | 107) & (~i25)) - (~(-(-(i25 << 1))))) - 1;
                b = i26 % 128;
                int i27 = i26 % 2;
                return str;
            }
        }, new InputFilter.LengthFilter(15)});
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (-2) - (((i2 ^ 10) + ((i2 & 10) << 1)) ^ (-1));
        b = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = a + 5;
        b = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x007b  */
    /* JADX WARN: Code duplicated, block: B:23:0x00cb A[Catch: Exception -> 0x023c, TRY_ENTER, TryCatch #2 {Exception -> 0x023c, blocks: (B:4:0x001e, B:7:0x0049, B:13:0x0071, B:16:0x0087, B:18:0x008d, B:20:0x00a7, B:23:0x00cb, B:25:0x00e2, B:28:0x00f9, B:31:0x0112, B:33:0x0122, B:38:0x0134, B:37:0x0126, B:41:0x014b, B:42:0x0155, B:43:0x0158, B:24:0x00d8, B:46:0x015b, B:51:0x0171, B:56:0x0180, B:59:0x019c, B:62:0x01ba, B:64:0x01d3, B:67:0x01f3, B:69:0x01ff, B:74:0x020d, B:73:0x0203, B:60:0x01a4, B:54:0x017a, B:10:0x005a, B:79:0x0229, B:80:0x0236, B:81:0x0239), top: B:91:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:24:0x00d8 A[Catch: Exception -> 0x023c, TryCatch #2 {Exception -> 0x023c, blocks: (B:4:0x001e, B:7:0x0049, B:13:0x0071, B:16:0x0087, B:18:0x008d, B:20:0x00a7, B:23:0x00cb, B:25:0x00e2, B:28:0x00f9, B:31:0x0112, B:33:0x0122, B:38:0x0134, B:37:0x0126, B:41:0x014b, B:42:0x0155, B:43:0x0158, B:24:0x00d8, B:46:0x015b, B:51:0x0171, B:56:0x0180, B:59:0x019c, B:62:0x01ba, B:64:0x01d3, B:67:0x01f3, B:69:0x01ff, B:74:0x020d, B:73:0x0203, B:60:0x01a4, B:54:0x017a, B:10:0x005a, B:79:0x0229, B:80:0x0236, B:81:0x0239), top: B:91:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:28:0x00f9 A[Catch: Exception -> 0x023c, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x023c, blocks: (B:4:0x001e, B:7:0x0049, B:13:0x0071, B:16:0x0087, B:18:0x008d, B:20:0x00a7, B:23:0x00cb, B:25:0x00e2, B:28:0x00f9, B:31:0x0112, B:33:0x0122, B:38:0x0134, B:37:0x0126, B:41:0x014b, B:42:0x0155, B:43:0x0158, B:24:0x00d8, B:46:0x015b, B:51:0x0171, B:56:0x0180, B:59:0x019c, B:62:0x01ba, B:64:0x01d3, B:67:0x01f3, B:69:0x01ff, B:74:0x020d, B:73:0x0203, B:60:0x01a4, B:54:0x017a, B:10:0x005a, B:79:0x0229, B:80:0x0236, B:81:0x0239), top: B:91:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0112 A[Catch: Exception -> 0x023c, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x023c, blocks: (B:4:0x001e, B:7:0x0049, B:13:0x0071, B:16:0x0087, B:18:0x008d, B:20:0x00a7, B:23:0x00cb, B:25:0x00e2, B:28:0x00f9, B:31:0x0112, B:33:0x0122, B:38:0x0134, B:37:0x0126, B:41:0x014b, B:42:0x0155, B:43:0x0158, B:24:0x00d8, B:46:0x015b, B:51:0x0171, B:56:0x0180, B:59:0x019c, B:62:0x01ba, B:64:0x01d3, B:67:0x01f3, B:69:0x01ff, B:74:0x020d, B:73:0x0203, B:60:0x01a4, B:54:0x017a, B:10:0x005a, B:79:0x0229, B:80:0x0236, B:81:0x0239), top: B:91:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0126 A[Catch: Exception -> 0x023c, TRY_ENTER, TryCatch #2 {Exception -> 0x023c, blocks: (B:4:0x001e, B:7:0x0049, B:13:0x0071, B:16:0x0087, B:18:0x008d, B:20:0x00a7, B:23:0x00cb, B:25:0x00e2, B:28:0x00f9, B:31:0x0112, B:33:0x0122, B:38:0x0134, B:37:0x0126, B:41:0x014b, B:42:0x0155, B:43:0x0158, B:24:0x00d8, B:46:0x015b, B:51:0x0171, B:56:0x0180, B:59:0x019c, B:62:0x01ba, B:64:0x01d3, B:67:0x01f3, B:69:0x01ff, B:74:0x020d, B:73:0x0203, B:60:0x01a4, B:54:0x017a, B:10:0x005a, B:79:0x0229, B:80:0x0236, B:81:0x0239), top: B:91:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:41:0x014b A[Catch: Exception -> 0x023c, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x023c, blocks: (B:4:0x001e, B:7:0x0049, B:13:0x0071, B:16:0x0087, B:18:0x008d, B:20:0x00a7, B:23:0x00cb, B:25:0x00e2, B:28:0x00f9, B:31:0x0112, B:33:0x0122, B:38:0x0134, B:37:0x0126, B:41:0x014b, B:42:0x0155, B:43:0x0158, B:24:0x00d8, B:46:0x015b, B:51:0x0171, B:56:0x0180, B:59:0x019c, B:62:0x01ba, B:64:0x01d3, B:67:0x01f3, B:69:0x01ff, B:74:0x020d, B:73:0x0203, B:60:0x01a4, B:54:0x017a, B:10:0x005a, B:79:0x0229, B:80:0x0236, B:81:0x0239), top: B:91:0x001c }] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008b, code lost:
    
        if (r11.charAt(13) != '-') goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x017e, code lost:
    
        if (r11.charAt(5) != '-') goto L56;
     */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onTextChanged(java.lang.CharSequence r9, int r10, int r11, int r12) {
        /*
            Method dump skipped, instruction units count: 588
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p026az.l.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }
}
