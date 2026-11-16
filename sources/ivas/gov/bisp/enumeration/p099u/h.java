package ivas.gov.bisp.enumeration.p099u;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import ivas.gov.bisp.enumeration.R;

/* JADX INFO: loaded from: classes.dex */
public class h extends ContextWrapper {
    private static int a = 1;
    private static int b;
    public int c;
    public Resources.Theme d;
    public LayoutInflater e;
    public Configuration f;
    public Resources g;

    public h() {
        super(null);
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 7;
        int i4 = i3 + ((i2 ^ 7) | i3);
        b = i4 % 128;
        int i5 = i4 % 2;
        super.attachBaseContext(context);
        int i6 = a;
        int i7 = ((i6 ^ 88) + ((i6 & 88) << 1)) - 1;
        b = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        if (r5.f == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        r5.f = new android.content.res.Configuration(r6);
        r6 = ivas.gov.bisp.enumeration.p099u.h.a;
        r2 = r6 & 69;
        r1 = (((r6 ^ 69) | r2) << 1) - ((r6 | 69) & (~r2));
        ivas.gov.bisp.enumeration.p099u.h.b = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
    
        throw new java.lang.IllegalStateException("Override configuration has already been set");
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
    
        if (r5.f == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(android.content.res.Configuration r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.p099u.h.b
            r2 = r1 ^ 39
            r3 = r1 & 39
            r3 = r3 | r2
            int r3 = r3 << 1
            int r2 = -r2
            r4 = r3 & r2
            r2 = r2 | r3
            int r4 = r4 + r2
            int r2 = r4 % 128
            ivas.gov.bisp.enumeration.p099u.h.a = r2
            int r4 = r4 % r0
            if (r4 == 0) goto L66
            android.content.res.Resources r2 = r5.g
            if (r2 != 0) goto L5e
            r2 = r1 & 85
            r1 = r1 ^ 85
            r1 = r1 | r2
            int r1 = -r1
            int r1 = -r1
            int r1 = ~r1
            int r2 = r2 - r1
            int r2 = r2 + (-1)
            int r1 = r2 % 128
            ivas.gov.bisp.enumeration.p099u.h.a = r1
            int r2 = r2 % r0
            if (r2 != 0) goto L37
            android.content.res.Configuration r1 = r5.f
            r2 = 53
            int r2 = r2 / 0
            if (r1 != 0) goto L56
            goto L3b
        L37:
            android.content.res.Configuration r1 = r5.f
            if (r1 != 0) goto L56
        L3b:
            android.content.res.Configuration r1 = new android.content.res.Configuration
            r1.<init>(r6)
            r5.f = r1
            int r6 = ivas.gov.bisp.enumeration.p099u.h.a
            r1 = r6 ^ 69
            r2 = r6 & 69
            r1 = r1 | r2
            int r1 = r1 << 1
            int r2 = ~r2
            r6 = r6 | 69
            r6 = r6 & r2
            int r1 = r1 - r6
            int r6 = r1 % 128
            ivas.gov.bisp.enumeration.p099u.h.b = r6
            int r1 = r1 % r0
            return
        L56:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Override configuration has already been set"
            r6.<init>(r0)
            throw r6
        L5e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "getResources() or getAssets() has already been called"
            r6.<init>(r0)
            throw r6
        L66:
            r6 = 0
            r6.hashCode()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p099u.h.d(android.content.res.Configuration):void");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 5;
        int i4 = (((i2 & 5) | i3) << 1) - i3;
        b = i4 % 128;
        int i5 = i4 % 2;
        AssetManager assets = getResources().getAssets();
        int i6 = a;
        int i7 = i6 ^ 65;
        int i8 = ((i6 & 65) | i7) << 1;
        int i9 = -i7;
        int i10 = (i8 & i9) + (i8 | i9);
        b = i10 % 128;
        if (i10 % 2 == 0) {
            return assets;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003a  */
    /* JADX WARN: Code duplicated, block: B:12:0x0056 A[PHI: r1
  0x0056: PHI (r1v16 android.content.res.Configuration) = (r1v8 android.content.res.Configuration), (r1v26 android.content.res.Configuration) binds: [B:10:0x0038, B:7:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x0077  */
    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Configuration configuration;
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 | 15;
        int i5 = ((i4 << 1) - (~(-(i4 & (~(i3 & 15)))))) - 1;
        b = i5 % 128;
        int i6 = i5 % 2;
        if (this.g == null) {
            int i7 = (-2) - (((i3 ^ 118) + ((i3 & 118) << 1)) ^ (-1));
            b = i7 % 128;
            if (i7 % 2 != 0) {
                configuration = this.f;
                int i8 = 23 / 0;
                if (configuration == null) {
                    this.g = super.getResources();
                    int i9 = a;
                    int i10 = i9 & 109;
                    int i11 = (((i9 | 109) & (~i10)) - (~(-(-(i10 << 1))))) - 1;
                    b = i11 % 128;
                    int i12 = i11 % 2;
                } else {
                    this.g = createConfigurationContext(configuration).getResources();
                    int i13 = a;
                    int i14 = i13 & 85;
                    int i15 = (i13 | 85) & (~i14);
                    int i16 = -(-(i14 << 1));
                    i = (i15 & i16) + (i15 | i16);
                    b = i % 128;
                    if (i % 2 != 0) {
                        int i17 = 4 % 2;
                    }
                }
            } else {
                configuration = this.f;
                if (configuration == null) {
                    this.g = super.getResources();
                    int i18 = a;
                    int i19 = i18 & 109;
                    int i110 = (((i18 | 109) & (~i19)) - (~(-(-(i19 << 1))))) - 1;
                    b = i110 % 128;
                    int i111 = i110 % 2;
                } else {
                    this.g = createConfigurationContext(configuration).getResources();
                    int i112 = a;
                    int i113 = i112 & 85;
                    int i114 = (i112 | 85) & (~i113);
                    int i115 = -(-(i113 << 1));
                    i = (i114 & i115) + (i114 | i115);
                    b = i % 128;
                    if (i % 2 != 0) {
                        int i116 = 4 % 2;
                    }
                }
            }
        }
        Resources resources = this.g;
        int i20 = b + 85;
        a = i20 % 128;
        if (i20 % 2 != 0) {
            return resources;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0036  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        int i2;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = i4 & 3;
        int i6 = (i4 ^ 3) | i5;
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        b = i7 % 128;
        int i8 = i7 % 2;
        int i9 = this.c;
        if (i8 != 0) {
            int i10 = 57 / 0;
            if (i9 != i) {
                this.c = i;
                e();
                int i11 = b;
                int i12 = i11 & 5;
                i2 = i12 + ((i11 ^ 5) | i12);
                a = i2 % 128;
                if (i2 % 2 == 0) {
                    int i13 = 3 / 5;
                }
            }
        } else if (i9 != i) {
            this.c = i;
            e();
            int i14 = b;
            int i15 = i14 & 5;
            i2 = i15 + ((i14 ^ 5) | i15);
            a = i2 % 128;
            if (i2 % 2 == 0) {
                int i16 = 3 / 5;
            }
        }
        int i17 = b + 9;
        a = i17 % 128;
        int i18 = i17 % 2;
    }

    public h(Context context, int i) {
        super(context);
        this.c = i;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0050  */
    /* JADX WARN: Code duplicated, block: B:14:0x006c  */
    /* JADX WARN: Code duplicated, block: B:16:0x0077  */
    /* JADX WARN: Code duplicated, block: B:17:0x0081  */
    /* JADX WARN: Code duplicated, block: B:19:0x0094  */
    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    public final void e() {
        int i;
        Resources.Theme theme;
        int i2;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = (i4 & (-48)) | ((~i4) & 47);
        int i6 = -(-((i4 & 47) << 1));
        int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
        a = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 62 / 0;
            if (this.d == null) {
                int i9 = i4 & 91;
                int i10 = (i4 ^ 91) | i9;
                int i11 = (i9 & i10) + (i9 | i10);
                a = i11 % 128;
                int i12 = i11 % 2;
                int i13 = (i4 ^ 119) + ((i4 & 119) << 1);
                a = i13 % 128;
                i = i13 % 2;
                this.d = getResources().newTheme();
                if (i == 0) {
                    int i14 = 78 / 0;
                }
                int i15 = b;
                int i16 = (((i15 | 88) << 1) - (i15 ^ 88)) - 1;
                a = i16 % 128;
                int i17 = i16 % 2;
                theme = getBaseContext().getTheme();
                if (theme != null) {
                    i2 = b + 37;
                    a = i2 % 128;
                    if (i2 % 2 == 0) {
                        this.d.setTo(theme);
                        int i18 = 11 / 0;
                    } else {
                        this.d.setTo(theme);
                    }
                    int i19 = a;
                    int i20 = ((i19 | 101) << 1) - (i19 ^ 101);
                    b = i20 % 128;
                    int i21 = i20 % 2;
                }
            } else {
                int i22 = i4 ^ 19;
                int i23 = ((i4 & 19) | i22) << 1;
                int i24 = -i22;
                int i25 = (i23 & i24) + (i23 | i24);
                a = i25 % 128;
                int i26 = i25 % 2;
            }
        } else if (this.d == null) {
            int i27 = i4 & 91;
            int i110 = (i4 ^ 91) | i27;
            int i111 = (i27 & i110) + (i27 | i110);
            a = i111 % 128;
            int i112 = i111 % 2;
            int i113 = (i4 ^ 119) + ((i4 & 119) << 1);
            a = i113 % 128;
            i = i113 % 2;
            this.d = getResources().newTheme();
            if (i == 0) {
                int i114 = 78 / 0;
            }
            int i115 = b;
            int i116 = (((i115 | 88) << 1) - (i115 ^ 88)) - 1;
            a = i116 % 128;
            int i117 = i116 % 2;
            theme = getBaseContext().getTheme();
            if (theme != null) {
                i2 = b + 37;
                a = i2 % 128;
                if (i2 % 2 == 0) {
                    this.d.setTo(theme);
                    int i118 = 11 / 0;
                } else {
                    this.d.setTo(theme);
                }
                int i119 = a;
                int i28 = ((i119 | 101) << 1) - (i119 ^ 101);
                b = i28 % 128;
                int i29 = i28 % 2;
            }
        } else {
            int i210 = i4 ^ 19;
            int i211 = ((i4 & 19) | i210) << 1;
            int i212 = -i210;
            int i213 = (i211 & i212) + (i211 | i212);
            a = i213 % 128;
            int i214 = i213 % 2;
        }
        this.d.applyStyle(this.c, true);
        int i30 = b + 83;
        a = i30 % 128;
        int i31 = i30 % 2;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 30) + (i2 | 30);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        a = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            "layout_inflater".equals(str);
            throw null;
        }
        if (!"layout_inflater".equals(str)) {
            Object systemService = getBaseContext().getSystemService(str);
            int i5 = a;
            int i6 = ((i5 & (-124)) | ((~i5) & 123)) + ((i5 & 123) << 1);
            b = i6 % 128;
            if (i6 % 2 == 0) {
                return systemService;
            }
            obj.hashCode();
            throw null;
        }
        int i7 = a;
        int i8 = (i7 | 117) << 1;
        int i9 = -(((~i7) & 117) | (i7 & (-118)));
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        int i11 = i10 % 128;
        b = i11;
        int i12 = i10 % 2;
        if (this.e == null) {
            int i13 = i11 + 23;
            a = i13 % 128;
            if (i13 % 2 == 0) {
                this.e = LayoutInflater.from(getBaseContext()).cloneInContext(this);
                obj.hashCode();
                throw null;
            }
            this.e = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        LayoutInflater layoutInflater = this.e;
        int i14 = a;
        int i15 = ((i14 ^ 45) | (i14 & 45)) << 1;
        int i16 = -(((~i14) & 45) | (i14 & (-46)));
        int i17 = (i15 & i16) + (i16 | i15);
        b = i17 % 128;
        int i18 = i17 % 2;
        return layoutInflater;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 39) << 1) - (i2 ^ 39);
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        Resources.Theme theme = this.d;
        if (theme != null) {
            int i6 = (((i4 | 44) << 1) - (i4 ^ 44)) - 1;
            a = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 18 / 0;
            }
            int i8 = i4 + 97;
            a = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 51 / 0;
            }
            return theme;
        }
        if (this.c == 0) {
            int i10 = (-2) - (((i4 & 10) + (i4 | 10)) ^ (-1));
            a = i10 % 128;
            int i11 = i10 % 2;
            this.c = R.style.Theme_AppCompat_Light;
            int i12 = (((i4 & (-80)) | ((~i4) & 79)) - (~(-(-((i4 & 79) << 1))))) - 1;
            a = i12 % 128;
            int i13 = i12 % 2;
        }
        e();
        Resources.Theme theme2 = this.d;
        int i14 = b;
        int i15 = i14 & 45;
        int i16 = i15 + ((i14 ^ 45) | i15);
        a = i16 % 128;
        int i17 = i16 % 2;
        return theme2;
    }
}
