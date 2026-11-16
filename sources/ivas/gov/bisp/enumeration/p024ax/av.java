package ivas.gov.bisp.enumeration.p024ax;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.widget.EditText;
import ivas.gov.bisp.enumeration.BISPApplication;

/* JADX INFO: loaded from: classes.dex */
public class av {
    public Context a;
    public BISPApplication b;

    public av(Context context) {
        this.a = context;
        this.b = (BISPApplication) context.getApplicationContext();
    }

    public class buW implements TextWatcher {
        private static int a = 1;
        private static int b;
        public CharSequence c;
        public EditText d;

        public buW(EditText editText) {
            this.d = editText;
            editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(15)});
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4 = 2 % 2;
            int i5 = a;
            int i6 = i5 & 105;
            int i7 = ((i5 ^ 105) | i6) << 1;
            int i8 = -((i5 | 105) & (~i6));
            int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
            int i10 = i9 % 128;
            b = i10;
            int i11 = i9 % 2;
            this.c = charSequence;
            int i12 = i10 + 109;
            a = i12 % 128;
            if (i12 % 2 == 0) {
                throw null;
            }
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            String string;
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 ^ 8) + ((i2 & 8) << 1)) - 1;
            b = i3 % 128;
            if (i3 % 2 != 0) {
                editable.toString().contains("-.");
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (!(!editable.toString().contains("-."))) {
                int i4 = a;
                int i5 = ((i4 | 79) << 1) - (i4 ^ 79);
                b = i5 % 128;
                if (i5 % 2 != 0) {
                    editable.clear();
                    string = this.c.toString();
                    int i6 = 52 / 0;
                } else {
                    editable.clear();
                    string = this.c.toString();
                }
                int i7 = a;
                int i8 = i7 ^ 49;
                int i9 = -(-((i7 & 49) << 1));
                int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
                b = i10 % 128;
                int i11 = i10 % 2;
                editable.append((CharSequence) string);
                if (i11 != 0) {
                    int i12 = 57 / 0;
                }
                int i13 = a;
                int i14 = i13 & 23;
                int i15 = (((i13 | 23) & (~i14)) - (~(-(-(i14 << 1))))) - 1;
                b = i15 % 128;
                int i16 = i15 % 2;
            }
            int i17 = b;
            int i18 = i17 | 121;
            int i19 = i18 << 1;
            int i20 = -((~(i17 & 121)) & i18);
            int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
            a = i21 % 128;
            int i22 = i21 % 2;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0058 A[Catch: Exception -> 0x0503, TRY_ENTER, TRY_LEAVE, TryCatch #8 {Exception -> 0x0503, blocks: (B:4:0x0019, B:6:0x0029, B:24:0x0090, B:29:0x00b4, B:33:0x00cd, B:35:0x00d3, B:42:0x00df, B:45:0x00ff, B:51:0x0128, B:53:0x013d, B:55:0x015c, B:58:0x0182, B:61:0x01b0, B:62:0x01b2, B:63:0x01b5, B:64:0x01b8, B:65:0x01c3, B:52:0x0133, B:46:0x010b, B:40:0x00d9, B:68:0x01c6, B:69:0x01c9, B:72:0x01cc, B:76:0x01de, B:78:0x01e4, B:81:0x01f6, B:86:0x021e, B:88:0x0233, B:90:0x024e, B:93:0x026d, B:95:0x0284, B:97:0x02a9, B:103:0x02bb, B:104:0x02c6, B:87:0x0229, B:82:0x0203, B:107:0x02c9, B:112:0x02e5, B:114:0x02eb, B:116:0x02fe, B:118:0x031e, B:120:0x033a, B:123:0x0356, B:126:0x0383, B:127:0x0385, B:131:0x03a3, B:128:0x038a, B:137:0x03b8, B:138:0x03bf, B:139:0x03c2, B:142:0x03c5, B:143:0x03c8, B:146:0x03cb, B:151:0x03e9, B:157:0x0405, B:160:0x0419, B:161:0x0420, B:163:0x042d, B:162:0x0425, B:154:0x03f2, B:166:0x0442, B:170:0x045d, B:172:0x0463, B:175:0x0478, B:178:0x0495, B:180:0x049b, B:186:0x04bc, B:191:0x04d5, B:194:0x04db, B:195:0x04e7, B:198:0x04ea, B:199:0x04ed, B:202:0x04f0, B:17:0x0058, B:20:0x006f, B:22:0x0084, B:10:0x002d), top: B:222:0x0017 }] */
        /* JADX WARN: Code duplicated, block: B:19:0x0060  */
        /* JADX WARN: Code duplicated, block: B:42:0x00df A[Catch: Exception -> 0x0503, TRY_LEAVE, TryCatch #8 {Exception -> 0x0503, blocks: (B:4:0x0019, B:6:0x0029, B:24:0x0090, B:29:0x00b4, B:33:0x00cd, B:35:0x00d3, B:42:0x00df, B:45:0x00ff, B:51:0x0128, B:53:0x013d, B:55:0x015c, B:58:0x0182, B:61:0x01b0, B:62:0x01b2, B:63:0x01b5, B:64:0x01b8, B:65:0x01c3, B:52:0x0133, B:46:0x010b, B:40:0x00d9, B:68:0x01c6, B:69:0x01c9, B:72:0x01cc, B:76:0x01de, B:78:0x01e4, B:81:0x01f6, B:86:0x021e, B:88:0x0233, B:90:0x024e, B:93:0x026d, B:95:0x0284, B:97:0x02a9, B:103:0x02bb, B:104:0x02c6, B:87:0x0229, B:82:0x0203, B:107:0x02c9, B:112:0x02e5, B:114:0x02eb, B:116:0x02fe, B:118:0x031e, B:120:0x033a, B:123:0x0356, B:126:0x0383, B:127:0x0385, B:131:0x03a3, B:128:0x038a, B:137:0x03b8, B:138:0x03bf, B:139:0x03c2, B:142:0x03c5, B:143:0x03c8, B:146:0x03cb, B:151:0x03e9, B:157:0x0405, B:160:0x0419, B:161:0x0420, B:163:0x042d, B:162:0x0425, B:154:0x03f2, B:166:0x0442, B:170:0x045d, B:172:0x0463, B:175:0x0478, B:178:0x0495, B:180:0x049b, B:186:0x04bc, B:191:0x04d5, B:194:0x04db, B:195:0x04e7, B:198:0x04ea, B:199:0x04ed, B:202:0x04f0, B:17:0x0058, B:20:0x006f, B:22:0x0084, B:10:0x002d), top: B:222:0x0017 }] */
        /* JADX WARN: Code duplicated, block: B:45:0x00ff A[Catch: Exception -> 0x0503, TRY_ENTER, TryCatch #8 {Exception -> 0x0503, blocks: (B:4:0x0019, B:6:0x0029, B:24:0x0090, B:29:0x00b4, B:33:0x00cd, B:35:0x00d3, B:42:0x00df, B:45:0x00ff, B:51:0x0128, B:53:0x013d, B:55:0x015c, B:58:0x0182, B:61:0x01b0, B:62:0x01b2, B:63:0x01b5, B:64:0x01b8, B:65:0x01c3, B:52:0x0133, B:46:0x010b, B:40:0x00d9, B:68:0x01c6, B:69:0x01c9, B:72:0x01cc, B:76:0x01de, B:78:0x01e4, B:81:0x01f6, B:86:0x021e, B:88:0x0233, B:90:0x024e, B:93:0x026d, B:95:0x0284, B:97:0x02a9, B:103:0x02bb, B:104:0x02c6, B:87:0x0229, B:82:0x0203, B:107:0x02c9, B:112:0x02e5, B:114:0x02eb, B:116:0x02fe, B:118:0x031e, B:120:0x033a, B:123:0x0356, B:126:0x0383, B:127:0x0385, B:131:0x03a3, B:128:0x038a, B:137:0x03b8, B:138:0x03bf, B:139:0x03c2, B:142:0x03c5, B:143:0x03c8, B:146:0x03cb, B:151:0x03e9, B:157:0x0405, B:160:0x0419, B:161:0x0420, B:163:0x042d, B:162:0x0425, B:154:0x03f2, B:166:0x0442, B:170:0x045d, B:172:0x0463, B:175:0x0478, B:178:0x0495, B:180:0x049b, B:186:0x04bc, B:191:0x04d5, B:194:0x04db, B:195:0x04e7, B:198:0x04ea, B:199:0x04ed, B:202:0x04f0, B:17:0x0058, B:20:0x006f, B:22:0x0084, B:10:0x002d), top: B:222:0x0017 }] */
        /* JADX WARN: Code duplicated, block: B:46:0x010b A[Catch: Exception -> 0x0503, TRY_LEAVE, TryCatch #8 {Exception -> 0x0503, blocks: (B:4:0x0019, B:6:0x0029, B:24:0x0090, B:29:0x00b4, B:33:0x00cd, B:35:0x00d3, B:42:0x00df, B:45:0x00ff, B:51:0x0128, B:53:0x013d, B:55:0x015c, B:58:0x0182, B:61:0x01b0, B:62:0x01b2, B:63:0x01b5, B:64:0x01b8, B:65:0x01c3, B:52:0x0133, B:46:0x010b, B:40:0x00d9, B:68:0x01c6, B:69:0x01c9, B:72:0x01cc, B:76:0x01de, B:78:0x01e4, B:81:0x01f6, B:86:0x021e, B:88:0x0233, B:90:0x024e, B:93:0x026d, B:95:0x0284, B:97:0x02a9, B:103:0x02bb, B:104:0x02c6, B:87:0x0229, B:82:0x0203, B:107:0x02c9, B:112:0x02e5, B:114:0x02eb, B:116:0x02fe, B:118:0x031e, B:120:0x033a, B:123:0x0356, B:126:0x0383, B:127:0x0385, B:131:0x03a3, B:128:0x038a, B:137:0x03b8, B:138:0x03bf, B:139:0x03c2, B:142:0x03c5, B:143:0x03c8, B:146:0x03cb, B:151:0x03e9, B:157:0x0405, B:160:0x0419, B:161:0x0420, B:163:0x042d, B:162:0x0425, B:154:0x03f2, B:166:0x0442, B:170:0x045d, B:172:0x0463, B:175:0x0478, B:178:0x0495, B:180:0x049b, B:186:0x04bc, B:191:0x04d5, B:194:0x04db, B:195:0x04e7, B:198:0x04ea, B:199:0x04ed, B:202:0x04f0, B:17:0x0058, B:20:0x006f, B:22:0x0084, B:10:0x002d), top: B:222:0x0017 }] */
        /* JADX WARN: Code duplicated, block: B:50:0x0126  */
        /* JADX WARN: Code duplicated, block: B:52:0x0133 A[Catch: Exception -> 0x0503, TryCatch #8 {Exception -> 0x0503, blocks: (B:4:0x0019, B:6:0x0029, B:24:0x0090, B:29:0x00b4, B:33:0x00cd, B:35:0x00d3, B:42:0x00df, B:45:0x00ff, B:51:0x0128, B:53:0x013d, B:55:0x015c, B:58:0x0182, B:61:0x01b0, B:62:0x01b2, B:63:0x01b5, B:64:0x01b8, B:65:0x01c3, B:52:0x0133, B:46:0x010b, B:40:0x00d9, B:68:0x01c6, B:69:0x01c9, B:72:0x01cc, B:76:0x01de, B:78:0x01e4, B:81:0x01f6, B:86:0x021e, B:88:0x0233, B:90:0x024e, B:93:0x026d, B:95:0x0284, B:97:0x02a9, B:103:0x02bb, B:104:0x02c6, B:87:0x0229, B:82:0x0203, B:107:0x02c9, B:112:0x02e5, B:114:0x02eb, B:116:0x02fe, B:118:0x031e, B:120:0x033a, B:123:0x0356, B:126:0x0383, B:127:0x0385, B:131:0x03a3, B:128:0x038a, B:137:0x03b8, B:138:0x03bf, B:139:0x03c2, B:142:0x03c5, B:143:0x03c8, B:146:0x03cb, B:151:0x03e9, B:157:0x0405, B:160:0x0419, B:161:0x0420, B:163:0x042d, B:162:0x0425, B:154:0x03f2, B:166:0x0442, B:170:0x045d, B:172:0x0463, B:175:0x0478, B:178:0x0495, B:180:0x049b, B:186:0x04bc, B:191:0x04d5, B:194:0x04db, B:195:0x04e7, B:198:0x04ea, B:199:0x04ed, B:202:0x04f0, B:17:0x0058, B:20:0x006f, B:22:0x0084, B:10:0x002d), top: B:222:0x0017 }] */
        /* JADX WARN: Code duplicated, block: B:58:0x0182 A[Catch: Exception -> 0x0503, TRY_ENTER, TRY_LEAVE, TryCatch #8 {Exception -> 0x0503, blocks: (B:4:0x0019, B:6:0x0029, B:24:0x0090, B:29:0x00b4, B:33:0x00cd, B:35:0x00d3, B:42:0x00df, B:45:0x00ff, B:51:0x0128, B:53:0x013d, B:55:0x015c, B:58:0x0182, B:61:0x01b0, B:62:0x01b2, B:63:0x01b5, B:64:0x01b8, B:65:0x01c3, B:52:0x0133, B:46:0x010b, B:40:0x00d9, B:68:0x01c6, B:69:0x01c9, B:72:0x01cc, B:76:0x01de, B:78:0x01e4, B:81:0x01f6, B:86:0x021e, B:88:0x0233, B:90:0x024e, B:93:0x026d, B:95:0x0284, B:97:0x02a9, B:103:0x02bb, B:104:0x02c6, B:87:0x0229, B:82:0x0203, B:107:0x02c9, B:112:0x02e5, B:114:0x02eb, B:116:0x02fe, B:118:0x031e, B:120:0x033a, B:123:0x0356, B:126:0x0383, B:127:0x0385, B:131:0x03a3, B:128:0x038a, B:137:0x03b8, B:138:0x03bf, B:139:0x03c2, B:142:0x03c5, B:143:0x03c8, B:146:0x03cb, B:151:0x03e9, B:157:0x0405, B:160:0x0419, B:161:0x0420, B:163:0x042d, B:162:0x0425, B:154:0x03f2, B:166:0x0442, B:170:0x045d, B:172:0x0463, B:175:0x0478, B:178:0x0495, B:180:0x049b, B:186:0x04bc, B:191:0x04d5, B:194:0x04db, B:195:0x04e7, B:198:0x04ea, B:199:0x04ed, B:202:0x04f0, B:17:0x0058, B:20:0x006f, B:22:0x0084, B:10:0x002d), top: B:222:0x0017 }] */
        /* JADX WARN: Code duplicated, block: B:61:0x01b0 A[Catch: Exception -> 0x0503, TRY_ENTER, TryCatch #8 {Exception -> 0x0503, blocks: (B:4:0x0019, B:6:0x0029, B:24:0x0090, B:29:0x00b4, B:33:0x00cd, B:35:0x00d3, B:42:0x00df, B:45:0x00ff, B:51:0x0128, B:53:0x013d, B:55:0x015c, B:58:0x0182, B:61:0x01b0, B:62:0x01b2, B:63:0x01b5, B:64:0x01b8, B:65:0x01c3, B:52:0x0133, B:46:0x010b, B:40:0x00d9, B:68:0x01c6, B:69:0x01c9, B:72:0x01cc, B:76:0x01de, B:78:0x01e4, B:81:0x01f6, B:86:0x021e, B:88:0x0233, B:90:0x024e, B:93:0x026d, B:95:0x0284, B:97:0x02a9, B:103:0x02bb, B:104:0x02c6, B:87:0x0229, B:82:0x0203, B:107:0x02c9, B:112:0x02e5, B:114:0x02eb, B:116:0x02fe, B:118:0x031e, B:120:0x033a, B:123:0x0356, B:126:0x0383, B:127:0x0385, B:131:0x03a3, B:128:0x038a, B:137:0x03b8, B:138:0x03bf, B:139:0x03c2, B:142:0x03c5, B:143:0x03c8, B:146:0x03cb, B:151:0x03e9, B:157:0x0405, B:160:0x0419, B:161:0x0420, B:163:0x042d, B:162:0x0425, B:154:0x03f2, B:166:0x0442, B:170:0x045d, B:172:0x0463, B:175:0x0478, B:178:0x0495, B:180:0x049b, B:186:0x04bc, B:191:0x04d5, B:194:0x04db, B:195:0x04e7, B:198:0x04ea, B:199:0x04ed, B:202:0x04f0, B:17:0x0058, B:20:0x006f, B:22:0x0084, B:10:0x002d), top: B:222:0x0017 }] */
        /* JADX WARN: Code duplicated, block: B:63:0x01b5 A[Catch: Exception -> 0x0503, TryCatch #8 {Exception -> 0x0503, blocks: (B:4:0x0019, B:6:0x0029, B:24:0x0090, B:29:0x00b4, B:33:0x00cd, B:35:0x00d3, B:42:0x00df, B:45:0x00ff, B:51:0x0128, B:53:0x013d, B:55:0x015c, B:58:0x0182, B:61:0x01b0, B:62:0x01b2, B:63:0x01b5, B:64:0x01b8, B:65:0x01c3, B:52:0x0133, B:46:0x010b, B:40:0x00d9, B:68:0x01c6, B:69:0x01c9, B:72:0x01cc, B:76:0x01de, B:78:0x01e4, B:81:0x01f6, B:86:0x021e, B:88:0x0233, B:90:0x024e, B:93:0x026d, B:95:0x0284, B:97:0x02a9, B:103:0x02bb, B:104:0x02c6, B:87:0x0229, B:82:0x0203, B:107:0x02c9, B:112:0x02e5, B:114:0x02eb, B:116:0x02fe, B:118:0x031e, B:120:0x033a, B:123:0x0356, B:126:0x0383, B:127:0x0385, B:131:0x03a3, B:128:0x038a, B:137:0x03b8, B:138:0x03bf, B:139:0x03c2, B:142:0x03c5, B:143:0x03c8, B:146:0x03cb, B:151:0x03e9, B:157:0x0405, B:160:0x0419, B:161:0x0420, B:163:0x042d, B:162:0x0425, B:154:0x03f2, B:166:0x0442, B:170:0x045d, B:172:0x0463, B:175:0x0478, B:178:0x0495, B:180:0x049b, B:186:0x04bc, B:191:0x04d5, B:194:0x04db, B:195:0x04e7, B:198:0x04ea, B:199:0x04ed, B:202:0x04f0, B:17:0x0058, B:20:0x006f, B:22:0x0084, B:10:0x002d), top: B:222:0x0017 }] */
        /* JADX WARN: Code duplicated, block: B:64:0x01b8 A[Catch: Exception -> 0x0503, TRY_LEAVE, TryCatch #8 {Exception -> 0x0503, blocks: (B:4:0x0019, B:6:0x0029, B:24:0x0090, B:29:0x00b4, B:33:0x00cd, B:35:0x00d3, B:42:0x00df, B:45:0x00ff, B:51:0x0128, B:53:0x013d, B:55:0x015c, B:58:0x0182, B:61:0x01b0, B:62:0x01b2, B:63:0x01b5, B:64:0x01b8, B:65:0x01c3, B:52:0x0133, B:46:0x010b, B:40:0x00d9, B:68:0x01c6, B:69:0x01c9, B:72:0x01cc, B:76:0x01de, B:78:0x01e4, B:81:0x01f6, B:86:0x021e, B:88:0x0233, B:90:0x024e, B:93:0x026d, B:95:0x0284, B:97:0x02a9, B:103:0x02bb, B:104:0x02c6, B:87:0x0229, B:82:0x0203, B:107:0x02c9, B:112:0x02e5, B:114:0x02eb, B:116:0x02fe, B:118:0x031e, B:120:0x033a, B:123:0x0356, B:126:0x0383, B:127:0x0385, B:131:0x03a3, B:128:0x038a, B:137:0x03b8, B:138:0x03bf, B:139:0x03c2, B:142:0x03c5, B:143:0x03c8, B:146:0x03cb, B:151:0x03e9, B:157:0x0405, B:160:0x0419, B:161:0x0420, B:163:0x042d, B:162:0x0425, B:154:0x03f2, B:166:0x0442, B:170:0x045d, B:172:0x0463, B:175:0x0478, B:178:0x0495, B:180:0x049b, B:186:0x04bc, B:191:0x04d5, B:194:0x04db, B:195:0x04e7, B:198:0x04ea, B:199:0x04ed, B:202:0x04f0, B:17:0x0058, B:20:0x006f, B:22:0x0084, B:10:0x002d), top: B:222:0x0017 }] */
        /* JADX WARN: Code restructure failed: missing block: B:155:0x03f6, code lost:
        
            if (r12.length() < 15) goto L156;
         */
        @Override // android.text.TextWatcher
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onTextChanged(java.lang.CharSequence r12, int r13, int r14, int r15) {
            /*
                Method dump skipped, instruction units count: 1284
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.ax.av.buW.onTextChanged(java.lang.CharSequence, int, int, int):void");
        }
    }

    public class buX implements TextWatcher {
        private static int a = 1;
        private static int b;
        public EditText c;

        public buX(EditText editText) {
            this.c = editText;
            editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(12)});
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            int i = 2 % 2;
            int i2 = b + 7;
            a = i2 % 128;
            int i3 = i2 % 2;
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4 = 2 % 2;
            int i5 = a;
            int i6 = (i5 & (-106)) | ((~i5) & 105);
            int i7 = (i5 & 105) << 1;
            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
            b = i8 % 128;
            if (i8 % 2 != 0) {
                throw null;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x0034, code lost:
        
            if (r4.length() == 11) goto L9;
         */
        @Override // android.text.TextWatcher
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onTextChanged(java.lang.CharSequence r4, int r5, int r6, int r7) {
            /*
                Method dump skipped, instruction units count: 343
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.ax.av.buX.onTextChanged(java.lang.CharSequence, int, int, int):void");
        }
    }
}
