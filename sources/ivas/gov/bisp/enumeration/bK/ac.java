package ivas.gov.bisp.enumeration.bK;

import android.location.Location;
import android.os.Environment;
import android.os.StatFs;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.p026az.a;
import ivas.gov.bisp.enumeration.p026az.z;
import ivas.gov.bisp.enumeration.p051bx.o;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class ac {
    private static int a = 0;
    private static int b = 1;

    public class bwV implements ActionMode.Callback {
        private static int a = 0;
        private static int b = 1;

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 | 23) << 1) - (i2 ^ 23);
            a = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 & 89;
            int i6 = i5 + ((i2 ^ 89) | i5);
            a = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 103;
            int i4 = i2 | 103;
            int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
            a = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i2 & 105;
            int i8 = (i2 ^ 105) | i7;
            int i9 = (i7 & i8) + (i8 | i7);
            a = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 | 85) << 1) - (i2 ^ 85);
            a = i3 % 128;
            int i4 = i3 % 2;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & (-66)) | ((~i2) & 65);
            int i4 = (i2 & 65) << 1;
            int i5 = (i3 & i4) + (i4 | i3);
            b = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
    }

    public static boolean c(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-68)) | ((~i2) & 67);
        int i4 = -(-((i2 & 67) << 1));
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        boolean zMatches = str.matches("(.)\\1+");
        int i7 = a;
        int i8 = ((i7 & (-96)) | ((~i7) & 95)) + ((i7 & 95) << 1);
        b = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 42 / 0;
        }
        return zMatches;
    }

    public static void e(EditText editText) {
        int i = 2 % 2;
        editText.setCustomSelectionActionModeCallback(new bwV());
        int i2 = a;
        int i3 = i2 & 7;
        int i4 = (i2 | 7) & (~i3);
        int i5 = i3 << 1;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        b = i6 % 128;
        int i7 = i6 % 2;
    }

    public static String g(String str) {
        int i = 2 % 2;
        int i2 = a + 104;
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        String lowerCase = str.replaceAll(" -", "_").toLowerCase();
        if (i4 == 0) {
            int i5 = 36 / 0;
        }
        return lowerCase;
    }

    public static boolean i(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 59) + (i2 | 59);
        b = i3 % 128;
        int i4 = i3 % 2;
        boolean z = false;
        if (str.charAt(0) == '0') {
            int i5 = a;
            int i6 = (i5 & 3) + (i5 | 3);
            b = i6 % 128;
            int i7 = i6 % 2;
            int i8 = (((i5 & (-52)) | ((~i5) & 51)) - (~((i5 & 51) << 1))) - 1;
            b = i8 % 128;
            int i9 = i8 % 2;
            z = true;
        }
        int i10 = b + 125;
        a = i10 % 128;
        if (i10 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public static boolean j(String str, String str2, int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 & 73) - (~(-(-(i3 | 73))))) - 1;
        int i5 = i4 % 128;
        b = i5;
        int i6 = i4 % 2;
        if (str != null) {
            int i7 = i5 & 33;
            int i8 = -(-((i5 ^ 33) | i7));
            int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
            a = i9 % 128;
            int i10 = i9 % 2;
            try {
                if (!str.equals(BuildConfig.FLAVOR)) {
                    if (str2 != null) {
                        int i11 = a;
                        int i12 = i11 & 43;
                        int i13 = -(-((i11 ^ 43) | i12));
                        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
                        b = i14 % 128;
                        Object obj = null;
                        if (i14 % 2 == 0) {
                            str.equals(BuildConfig.FLAVOR);
                            obj.hashCode();
                            throw null;
                        }
                        if (!str.equals(BuildConfig.FLAVOR)) {
                            int i15 = b;
                            int i16 = i15 & 39;
                            int i17 = (i16 - (~(-(-((i15 ^ 39) | i16))))) - 1;
                            a = i17 % 128;
                            if (i17 % 2 != 0) {
                                str2.equals(BuildConfig.FLAVOR);
                                obj.hashCode();
                                throw null;
                            }
                            if (!str2.equals(BuildConfig.FLAVOR)) {
                                Location location = new Location(BuildConfig.FLAVOR);
                                int i18 = b;
                                int i19 = i18 ^ 95;
                                int i20 = ((i18 & 95) | i19) << 1;
                                int i21 = -i19;
                                int i22 = (i20 ^ i21) + ((i20 & i21) << 1);
                                a = i22 % 128;
                                location.setLatitude(Double.parseDouble(i22 % 2 != 0 ? str.split(",")[1].trim() : str.split(",")[0].trim()));
                                int i23 = b;
                                int i24 = i23 & 49;
                                int i25 = (i23 | 49) & (~i24);
                                int i26 = -(-(i24 << 1));
                                int i27 = (i25 ^ i26) + ((i25 & i26) << 1);
                                a = i27 % 128;
                                location.setLongitude(Double.parseDouble((i27 % 2 != 0 ? str.split(",")[0] : str.split(",")[1]).trim()));
                                Location location2 = new Location(BuildConfig.FLAVOR);
                                int i28 = b + 49;
                                a = i28 % 128;
                                int i29 = i28 % 2;
                                double d = Double.parseDouble(str2.split(",")[0].trim());
                                int i30 = a;
                                int i31 = (i30 & 37) + (i30 | 37);
                                b = i31 % 128;
                                int i32 = i31 % 2;
                                location2.setLatitude(d);
                                String strTrim = str2.split(",")[1].trim();
                                int i33 = b;
                                int i34 = i33 & 91;
                                int i35 = ((i33 ^ 91) | i34) << 1;
                                int i36 = -((i33 | 91) & (~i34));
                                int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
                                a = i37 % 128;
                                if (i37 % 2 != 0) {
                                    location2.setLongitude(Double.parseDouble(strTrim));
                                    location.distanceTo(location2);
                                    throw null;
                                }
                                location2.setLongitude(Double.parseDouble(strTrim));
                                float fDistanceTo = location.distanceTo(location2);
                                int i38 = a + 29;
                                int i39 = i38 % 128;
                                b = i39;
                                if (i38 % 2 == 0) {
                                    throw null;
                                }
                                if (fDistanceTo <= i) {
                                    int i40 = i39 & 33;
                                    int i41 = (~i40) & (i39 | 33);
                                    int i42 = -(-(i40 << 1));
                                    int i43 = (i41 ^ i42) + ((i42 & i41) << 1);
                                    a = i43 % 128;
                                    if (i43 % 2 == 0) {
                                        return true;
                                    }
                                    throw null;
                                }
                            }
                        }
                    }
                    int i44 = b;
                    int i45 = i44 & 121;
                    int i46 = -(-(i44 | 121));
                    int i47 = (i45 & i46) + (i46 | i45);
                    a = i47 % 128;
                    int i48 = i47 % 2;
                    return false;
                }
                int i49 = b;
                int i50 = i49 ^ 61;
                int i51 = (((i49 & 61) | i50) << 1) - i50;
                a = i51 % 128;
                int i52 = i51 % 2;
            } catch (NullPointerException unused) {
            }
        }
        int i53 = b;
        int i54 = (((i53 ^ 7) | (i53 & 7)) << 1) - (((~i53) & 7) | (i53 & (-8)));
        a = i54 % 128;
        int i55 = i54 % 2;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004b  */
    /* JADX WARN: Code duplicated, block: B:15:0x006f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:16:0x0070  */
    public static boolean k(String str) {
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 63;
        int i5 = (i3 | 63) & (~i4);
        int i6 = i4 << 1;
        int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
        b = i7 % 128;
        try {
            if (i7 % 2 == 0) {
                if (str.length() == 89) {
                    int i8 = b;
                    int i9 = ((i8 ^ 63) | (i8 & 63)) << 1;
                    int i10 = -(((~i8) & 63) | (i8 & (-64)));
                    int i11 = (i9 & i10) + (i10 | i9);
                    a = i11 % 128;
                    int i12 = i11 % 2;
                    if (str.startsWith("03")) {
                        int i13 = b;
                        int i14 = (i13 & (-56)) | ((~i13) & 55);
                        int i15 = (i13 & 55) << 1;
                        int i16 = (i14 & i15) + (i14 | i15);
                        a = i16 % 128;
                        int i17 = i16 % 2;
                        int i18 = i13 ^ 9;
                        int i19 = (i13 & 9) << 1;
                        i = (i18 & i19) + (i19 | i18);
                        a = i % 128;
                        if (i % 2 == 0) {
                            return true;
                        }
                        throw null;
                    }
                }
            } else if (str.length() == 11) {
                int i20 = b;
                int i21 = ((i20 ^ 63) | (i20 & 63)) << 1;
                int i110 = -(((~i20) & 63) | (i20 & (-64)));
                int i111 = (i21 & i110) + (i110 | i21);
                a = i111 % 128;
                int i112 = i111 % 2;
                if (str.startsWith("03")) {
                    int i113 = b;
                    int i114 = (i113 & (-56)) | ((~i113) & 55);
                    int i115 = (i113 & 55) << 1;
                    int i116 = (i114 & i115) + (i114 | i115);
                    a = i116 % 128;
                    int i117 = i116 % 2;
                    int i118 = i113 ^ 9;
                    int i119 = (i113 & 9) << 1;
                    i = (i118 & i119) + (i119 | i118);
                    a = i % 128;
                    if (i % 2 == 0) {
                        return true;
                    }
                    throw null;
                }
            }
            int i22 = a;
            int i23 = i22 & 61;
            int i24 = -(-((i22 ^ 61) | i23));
            int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
            b = i25 % 128;
            int i26 = i25 % 2;
        } catch (Exception unused) {
        }
        return false;
    }

    public static void n(EditText editText) {
        int i = 2 % 2;
        editText.addTextChangedListener(new a(editText));
        int i2 = a;
        int i3 = (((i2 ^ 55) | (i2 & 55)) << 1) - (((~i2) & 55) | (i2 & (-56)));
        b = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 83 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003e, code lost:
    
        if (r8 != 1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
    
        r8 = ivas.gov.bisp.enumeration.bK.ac.a;
        r1 = r8 & 77;
        r8 = -(-(r8 | 77));
        r2 = (r1 & r8) + (r8 | r1);
        ivas.gov.bisp.enumeration.bK.ac.b = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0051, code lost:
    
        if ((r2 % 2) != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0062, code lost:
    
        if ((java.lang.Integer.parseInt(r7.substring(r7.length() << 1)) << 3) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0065, code lost:
    
        r8 = r7.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0078, code lost:
    
        if ((java.lang.Integer.parseInt(r7.substring((((r8 ^ (-1)) | r8) << 1) - (~r8))) % 2) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007a, code lost:
    
        r7 = ivas.gov.bisp.enumeration.bK.ac.b;
        r8 = (r7 ^ 29) + ((r7 & 29) << 1);
        ivas.gov.bisp.enumeration.bK.ac.a = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0087, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0088, code lost:
    
        r7 = ivas.gov.bisp.enumeration.bK.ac.a;
        r8 = ((r7 ^ 28) + ((r7 & 28) << 1)) - 1;
        ivas.gov.bisp.enumeration.bK.ac.b = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0097, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0098, code lost:
    
        if (r8 != 2) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009a, code lost:
    
        r8 = ivas.gov.bisp.enumeration.bK.ac.b;
        r1 = (r8 & 45) + (r8 | 45);
        ivas.gov.bisp.enumeration.bK.ac.a = r1 % 128;
        r1 = r1 % 2;
        r7 = java.lang.Integer.parseInt(r7.substring(r7.length() - 1));
        r8 = ivas.gov.bisp.enumeration.bK.ac.b;
        r1 = r8 & 29;
        r2 = (~r1) & (r8 | 29);
        r1 = -(-(r1 << 1));
        r6 = ((r2 | r1) << 1) - (r1 ^ r2);
        r1 = r6 % 128;
        ivas.gov.bisp.enumeration.bK.ac.a = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c8, code lost:
    
        if ((r6 % 2) == 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00cb, code lost:
    
        if ((r7 >>> 2) != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00cf, code lost:
    
        if ((r7 % 2) != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d1, code lost:
    
        r7 = (r8 & (-36)) | ((~r8) & 35);
        r8 = -(-((r8 & 35) << 1));
        r1 = (r7 & r8) + (r7 | r8);
        ivas.gov.bisp.enumeration.bK.ac.a = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e5, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e6, code lost:
    
        r7 = r1 & 85;
        r8 = (r1 ^ 85) | r7;
        r1 = ((r7 | r8) << 1) - (r7 ^ r8);
        ivas.gov.bisp.enumeration.bK.ac.b = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f5, code lost:
    
        if ((r1 % 2) != 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f7, code lost:
    
        r7 = 88 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00fa, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00fb, code lost:
    
        r7 = ivas.gov.bisp.enumeration.bK.ac.b;
        r8 = ((r7 | 123) << 1) - (r7 ^ 123);
        ivas.gov.bisp.enumeration.bK.ac.a = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0108, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0026, code lost:
    
        if ((!r7.startsWith("0")) != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002e, code lost:
    
        if ((!r7.startsWith("0")) != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0030, code lost:
    
        r7 = ivas.gov.bisp.enumeration.bK.ac.a;
        r8 = ((r7 & 84) + (r7 | 84)) - 1;
        ivas.gov.bisp.enumeration.bK.ac.b = r8 % 128;
        r8 = r8 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean b(java.lang.String r7, int r8) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.bK.ac.b(java.lang.String, int):boolean");
    }

    public static boolean d(String str) {
        boolean z;
        int i = 2 % 2;
        int i2 = b + 28;
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        a = i3 % 128;
        if (i3 % 2 == 0 ? str.replaceAll("(?i)(.)(?=.*?\\1)", BuildConfig.FLAVOR).length() >= 3 : str.replaceAll("(?i)(.)(?=.*?\\1)", BuildConfig.FLAVOR).length() >= 3) {
            int i4 = a + 41;
            b = i4 % 128;
            int i5 = i4 % 2;
            z = false;
        } else {
            int i6 = a + 21;
            b = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        }
        int i8 = b;
        int i9 = i8 ^ 63;
        int i10 = ((i8 & 63) | i9) << 1;
        int i11 = -i9;
        int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
        a = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 20 / 0;
        }
        return z;
    }

    public static boolean l() {
        float availableBlocksLong;
        int i = 2 % 2;
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        int i2 = b;
        boolean z = true;
        int i3 = ((i2 & (-84)) | ((~i2) & 83)) + ((i2 & 83) << 1);
        a = i3 % 128;
        if (i3 % 2 != 0) {
            availableBlocksLong = statFs.getAvailableBlocksLong() & statFs.getBlockSizeLong();
        } else {
            availableBlocksLong = statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
        }
        int i4 = a + 85;
        int i5 = i4 % 128;
        b = i5;
        if (i4 % 2 != 0 ? availableBlocksLong / 1048576.0f < 500.0f : availableBlocksLong + 1048576.0f < 500.0f) {
            int i6 = (((i5 ^ 41) | (i5 & 41)) << 1) - ((i5 & (-42)) | ((~i5) & 41));
            a = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        } else {
            int i8 = i5 + 9;
            a = i8 % 128;
            int i9 = i8 % 2;
        }
        int i10 = i5 + 67;
        a = i10 % 128;
        if (i10 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public static void m(Spinner[] spinnerArr, o[] oVarArr) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 57;
        int i4 = -(-((i2 & 57) << 1));
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i2 + 87;
        a = i7 % 128;
        int i8 = i7 % 2;
        int i9 = 0;
        while (i9 < spinnerArr.length) {
            spinnerArr[i9].setOnItemSelectedListener(new bwU(oVarArr, i9, spinnerArr));
            int i10 = a;
            int i11 = i10 & 23;
            int i12 = (i10 ^ 23) | i11;
            int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
            b = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = ((i9 ^ (-5)) | (i9 & (-5))) << 1;
                int i15 = -(((~i9) & (-5)) | (i9 & 4));
                int i16 = (i14 & i15) + (i15 | i14);
                int i17 = i16 ^ 65;
                int i18 = ((i16 & 65) | i17) << 1;
                int i19 = -i17;
                i9 = ((i18 | i19) << 1) - (i19 ^ i18);
            } else {
                i9 = ((i9 | 1) << 1) - (((~i9) & 1) | (i9 & (-2)));
            }
        }
        int i20 = a;
        int i21 = ((i20 ^ 104) + ((i20 & 104) << 1)) - 1;
        b = i21 % 128;
        int i22 = i21 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:31:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:42:0x015d  */
    /* JADX WARN: Code duplicated, block: B:44:0x016d A[Catch: Exception -> 0x01b3, TRY_ENTER, TryCatch #2 {Exception -> 0x01b3, blocks: (B:4:0x0018, B:6:0x0030, B:9:0x0046, B:11:0x0062, B:15:0x0083, B:19:0x009f, B:21:0x00ab, B:28:0x00bd, B:40:0x0157, B:44:0x016d, B:45:0x0172, B:46:0x0175, B:49:0x0178, B:26:0x00b1, B:55:0x01a5, B:56:0x01b0), top: B:70:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0172 A[Catch: Exception -> 0x01b3, TRY_LEAVE, TryCatch #2 {Exception -> 0x01b3, blocks: (B:4:0x0018, B:6:0x0030, B:9:0x0046, B:11:0x0062, B:15:0x0083, B:19:0x009f, B:21:0x00ab, B:28:0x00bd, B:40:0x0157, B:44:0x016d, B:45:0x0172, B:46:0x0175, B:49:0x0178, B:26:0x00b1, B:55:0x01a5, B:56:0x01b0), top: B:70:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0178 A[Catch: Exception -> 0x01b3, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x01b3, blocks: (B:4:0x0018, B:6:0x0030, B:9:0x0046, B:11:0x0062, B:15:0x0083, B:19:0x009f, B:21:0x00ab, B:28:0x00bd, B:40:0x0157, B:44:0x016d, B:45:0x0172, B:46:0x0175, B:49:0x0178, B:26:0x00b1, B:55:0x01a5, B:56:0x01b0), top: B:70:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x01a3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:54:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:74:0x011d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x0142 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x013e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0106 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0083 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x0083 A[SYNTHETIC] */
    public static String h(boolean z) {
        InetAddress inetAddress;
        String hostAddress;
        boolean z2;
        int i;
        int iIndexOf;
        String upperCase;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = i5 & 51;
        int i7 = -(-((i5 ^ 51) | i6));
        int i8 = (i6 & i7) + (i7 | i6);
        b = i8 % 128;
        Object obj = null;
        try {
            if (i8 % 2 == 0) {
                Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
                throw null;
            }
            Iterator it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
            int i9 = b;
            int i10 = (i9 & 43) + (i9 | 43);
            a = i10 % 128;
            int i11 = i10 % 2;
            while (it.hasNext()) {
                int i12 = b;
                int i13 = i12 & 87;
                int i14 = ((i12 | 87) & (~i13)) + (i13 << 1);
                a = i14 % 128;
                int i15 = i14 % 2;
                Enumeration<InetAddress> inetAddresses = ((NetworkInterface) it.next()).getInetAddresses();
                int i16 = a;
                int i17 = i16 & 103;
                int i18 = (((i16 ^ 103) | i17) << 1) - ((i16 | 103) & (~i17));
                b = i18 % 128;
                int i19 = i18 % 2;
                Iterator it2 = Collections.list(inetAddresses).iterator();
                int i20 = b;
                int i21 = i20 | 45;
                int i22 = i21 << 1;
                int i23 = -((~(i20 & 45)) & i21);
                int i24 = (i22 & i23) + (i23 | i22);
                a = i24 % 128;
                if (i24 % 2 != 0) {
                    int i25 = 5 / 5;
                }
                while (it2.hasNext()) {
                    int i26 = a;
                    int i27 = i26 & 103;
                    int i28 = -(-((i26 ^ 103) | i27));
                    int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
                    b = i29 % 128;
                    if (i29 % 2 == 0) {
                        inetAddress = (InetAddress) it2.next();
                        int i30 = 64 / 0;
                        if (inetAddress.isLoopbackAddress()) {
                            continue;
                        } else {
                            hostAddress = inetAddress.getHostAddress();
                            if (hostAddress.indexOf(58) < 0) {
                                int i31 = b;
                                int i32 = ((i31 ^ 105) | (i31 & 105)) << 1;
                                int i33 = -(((~i31) & 105) | (i31 & (-106)));
                                int i34 = (i32 & i33) + (i33 | i32);
                                int i35 = i34 % 128;
                                a = i35;
                                int i36 = i34 % 2;
                                int i37 = i35 & 5;
                                int i38 = (((i35 | 5) & (~i37)) - (~(i37 << 1))) - 1;
                                b = i38 % 128;
                                int i39 = i38 % 2;
                                z2 = true;
                            } else {
                                int i40 = b;
                                int i41 = i40 & 31;
                                int i42 = ((i40 | 31) & (~i41)) + (i41 << 1);
                                a = i42 % 128;
                                int i43 = i42 % 2;
                                z2 = false;
                            }
                            if (z) {
                                int i44 = a;
                                int i45 = (((i44 ^ 57) | (i44 & 57)) << 1) - (((~i44) & 57) | (i44 & (-58)));
                                i = i45 % 128;
                                b = i;
                                int i46 = i45 % 2;
                                if (z2) {
                                    int i47 = (i & (-116)) | ((~i) & 115);
                                    int i48 = (i & 115) << 1;
                                    int i49 = ((i47 | i48) << 1) - (i47 ^ i48);
                                    a = i49 % 128;
                                    int i50 = i49 % 2;
                                    int i51 = (((i | 78) << 1) - (i ^ 78)) - 1;
                                    a = i51 % 128;
                                    int i52 = i51 % 2;
                                    return hostAddress;
                                }
                            } else if (z2) {
                                int i53 = a;
                                int i54 = i53 & 75;
                                int i55 = -(-((i53 ^ 75) | i54));
                                int i56 = ((i54 | i55) << 1) - (i55 ^ i54);
                                b = i56 % 128;
                                int i57 = i56 % 2;
                                iIndexOf = hostAddress.indexOf(37);
                                if (iIndexOf < 0) {
                                    int i58 = b;
                                    i3 = (((i58 | 12) << 1) - (i58 ^ 12)) - 1;
                                    a = i3 % 128;
                                    if (i3 % 2 == 0) {
                                        hostAddress.toUpperCase();
                                        throw null;
                                    }
                                    upperCase = hostAddress.toUpperCase();
                                } else {
                                    upperCase = hostAddress.substring(0, iIndexOf).toUpperCase();
                                    int i59 = a;
                                    int i60 = i59 ^ 65;
                                    int i61 = -(-((i59 & 65) << 1));
                                    int i62 = ((i60 | i61) << 1) - (i61 ^ i60);
                                    b = i62 % 128;
                                    int i63 = i62 % 2;
                                }
                                int i64 = b;
                                i2 = (((i64 | 126) << 1) - (i64 ^ 126)) - 1;
                                a = i2 % 128;
                                if (i2 % 2 == 0) {
                                    return upperCase;
                                }
                                throw null;
                            }
                        }
                    } else {
                        inetAddress = (InetAddress) it2.next();
                        if (inetAddress.isLoopbackAddress()) {
                            continue;
                        } else {
                            hostAddress = inetAddress.getHostAddress();
                            if (hostAddress.indexOf(58) < 0) {
                                int i310 = b;
                                int i311 = ((i310 ^ 105) | (i310 & 105)) << 1;
                                int i312 = -(((~i310) & 105) | (i310 & (-106)));
                                int i313 = (i311 & i312) + (i312 | i311);
                                int i314 = i313 % 128;
                                a = i314;
                                int i315 = i313 % 2;
                                int i316 = i314 & 5;
                                int i317 = (((i314 | 5) & (~i316)) - (~(i316 << 1))) - 1;
                                b = i317 % 128;
                                int i318 = i317 % 2;
                                z2 = true;
                            } else {
                                int i410 = b;
                                int i411 = i410 & 31;
                                int i412 = ((i410 | 31) & (~i411)) + (i411 << 1);
                                a = i412 % 128;
                                int i413 = i412 % 2;
                                z2 = false;
                            }
                            if (z) {
                                int i414 = a;
                                int i415 = (((i414 ^ 57) | (i414 & 57)) << 1) - (((~i414) & 57) | (i414 & (-58)));
                                i = i415 % 128;
                                b = i;
                                int i416 = i415 % 2;
                                if (z2) {
                                    int i417 = (i & (-116)) | ((~i) & 115);
                                    int i418 = (i & 115) << 1;
                                    int i419 = ((i417 | i418) << 1) - (i417 ^ i418);
                                    a = i419 % 128;
                                    int i510 = i419 % 2;
                                    int i511 = (((i | 78) << 1) - (i ^ 78)) - 1;
                                    a = i511 % 128;
                                    int i512 = i511 % 2;
                                    return hostAddress;
                                }
                            } else if (z2) {
                                int i513 = a;
                                int i514 = i513 & 75;
                                int i515 = -(-((i513 ^ 75) | i514));
                                int i516 = ((i514 | i515) << 1) - (i515 ^ i514);
                                b = i516 % 128;
                                int i517 = i516 % 2;
                                iIndexOf = hostAddress.indexOf(37);
                                if (iIndexOf < 0) {
                                    int i518 = b;
                                    i3 = (((i518 | 12) << 1) - (i518 ^ 12)) - 1;
                                    a = i3 % 128;
                                    if (i3 % 2 == 0) {
                                        hostAddress.toUpperCase();
                                        throw null;
                                    }
                                    upperCase = hostAddress.toUpperCase();
                                } else {
                                    upperCase = hostAddress.substring(0, iIndexOf).toUpperCase();
                                    int i519 = a;
                                    int i65 = i519 ^ 65;
                                    int i66 = -(-((i519 & 65) << 1));
                                    int i67 = ((i65 | i66) << 1) - (i66 ^ i65);
                                    b = i67 % 128;
                                    int i68 = i67 % 2;
                                }
                                int i69 = b;
                                i2 = (((i69 | 126) << 1) - (i69 ^ 126)) - 1;
                                a = i2 % 128;
                                if (i2 % 2 == 0) {
                                    return upperCase;
                                }
                                throw null;
                            }
                        }
                    }
                }
            }
            int i70 = a + 13;
            b = i70 % 128;
            if (i70 % 2 != 0) {
                return BuildConfig.FLAVOR;
            }
            obj.hashCode();
            throw null;
        } catch (Exception unused) {
        }
    }

    public static double f(String str, String str2) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 85) | (i2 & 85)) << 1;
        int i4 = -(((~i2) & 85) | (i2 & (-86)));
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            z.h(str, "yyyy-MM-dd HH:mm:ss");
            z.h(str2, "yyyy-MM-dd HH:mm:ss").getTime();
            obj.hashCode();
            throw null;
        }
        double dM = ag.m(Math.abs(z.h(str2, "yyyy-MM-dd HH:mm:ss").getTime() - z.h(str, "yyyy-MM-dd HH:mm:ss").getTime()) / 1000.0d, 2);
        int i6 = b;
        int i7 = (i6 ^ 17) + ((i6 & 17) << 1);
        a = i7 % 128;
        if (i7 % 2 == 0) {
            return dM;
        }
        throw null;
    }

    public class bwU implements AdapterView.OnItemSelectedListener {
        private static int a = 1;
        private static int b;
        public final /* synthetic */ o[] c;
        public final /* synthetic */ int d;
        public final /* synthetic */ Spinner[] e;

        public bwU(o[] oVarArr, int i, Spinner[] spinnerArr) {
            this.c = oVarArr;
            this.d = i;
            this.e = spinnerArr;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            int i = 2 % 2;
            int i2 = b + 13;
            a = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 41 / 0;
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = (i3 & 7) + (i3 | 7);
            int i5 = i4 % 128;
            b = i5;
            int i6 = i4 % 2;
            o oVar = this.c[this.d];
            if (oVar != null) {
                int i7 = i5 & 63;
                int i8 = i7 + ((i5 ^ 63) | i7);
                a = i8 % 128;
                if (i8 % 2 == 0) {
                    oVar.c = i;
                    oVar.notifyDataSetChanged();
                    int i9 = 46 / 0;
                } else {
                    oVar.c = i;
                    oVar.notifyDataSetChanged();
                }
            }
            if (i != 0) {
                this.e[this.d].setBackgroundResource(R.drawable.spinner_bg_selected);
                int i10 = b;
                int i11 = i10 ^ 107;
                int i12 = (((i10 & 107) | i11) << 1) - i11;
                a = i12 % 128;
                if (i12 % 2 == 0) {
                    throw null;
                }
                return;
            }
            int i13 = b;
            int i14 = (((i13 & (-88)) | ((~i13) & 87)) - (~((i13 & 87) << 1))) - 1;
            a = i14 % 128;
            int i15 = i14 % 2;
            this.e[this.d].setBackgroundResource(R.drawable.spinner_bg);
            int i16 = a;
            int i17 = (((i16 | 12) << 1) - (i16 ^ 12)) - 1;
            b = i17 % 128;
            int i18 = i17 % 2;
        }
    }
}
