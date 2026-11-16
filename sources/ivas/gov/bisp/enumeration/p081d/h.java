package ivas.gov.bisp.enumeration.p081d;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import ivas.gov.bisp.enumeration.p091n.j;
import java.util.Objects;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    private static int a = 0;
    private static int b = 1;
    public final aWp c;

    public interface aWm {
        h b();

        void e(Uri uri);

        void setExtras(Bundle bundle);

        void setFlags(int i);
    }

    public static final class aWn implements aWm {
        private static int a = 0;
        private static int b = 1;
        public final ContentInfo.Builder c;

        public aWn(ClipData clipData, int i) {
            this.c = new ContentInfo.Builder(clipData, i);
        }

        @Override // ivas.gov.bisp.enumeration.d.h.aWm
        public final h b() {
            int i = 2 % 2;
            h hVar = new h(new aWq(this.c.build()));
            int i2 = a;
            int i3 = (i2 & (-118)) | ((~i2) & 117);
            int i4 = (i2 & 117) << 1;
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            b = i5 % 128;
            int i6 = i5 % 2;
            return hVar;
        }

        @Override // ivas.gov.bisp.enumeration.d.h.aWm
        public final void e(Uri uri) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & (-16)) | ((~i2) & 15);
            int i4 = -(-((i2 & 15) << 1));
            int i5 = (i3 & i4) + (i4 | i3);
            b = i5 % 128;
            int i6 = i5 % 2;
            this.c.setLinkUri(uri);
            int i7 = b + 61;
            a = i7 % 128;
            if (i7 % 2 != 0) {
                throw null;
            }
        }

        @Override // ivas.gov.bisp.enumeration.d.h.aWm
        public final void setExtras(Bundle bundle) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 & 125) + (i2 | 125);
            a = i3 % 128;
            int i4 = i3 % 2;
            this.c.setExtras(bundle);
            int i5 = b;
            int i6 = ((i5 & (-56)) | ((~i5) & 55)) + ((i5 & 55) << 1);
            a = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 1 / 0;
            }
        }

        @Override // ivas.gov.bisp.enumeration.d.h.aWm
        public final void setFlags(int i) {
            int i2 = 2 % 2;
            int i3 = b + 40;
            int i4 = (i3 ^ (-1)) + (i3 << 1);
            a = i4 % 128;
            int i5 = i4 % 2;
            this.c.setFlags(i);
            int i6 = b;
            int i7 = ((i6 ^ 121) | (i6 & 121)) << 1;
            int i8 = -(((~i6) & 121) | (i6 & (-122)));
            int i9 = (i7 & i8) + (i8 | i7);
            a = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 25 / 0;
            }
        }
    }

    public static final class aWo implements aWm {
        private static int a = 0;
        private static int b = 1;
        public ClipData c;
        public int d;
        public int e;
        public Uri f;
        public Bundle g;

        public aWo(ClipData clipData, int i) {
            this.c = clipData;
            this.d = i;
        }

        @Override // ivas.gov.bisp.enumeration.d.h.aWm
        public final h b() {
            int i = 2 % 2;
            h hVar = new h(new aWr(this));
            int i2 = b;
            int i3 = i2 & 17;
            int i4 = ((i2 ^ 17) | i3) << 1;
            int i5 = -((i2 | 17) & (~i3));
            int i6 = (i4 & i5) + (i5 | i4);
            a = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 32 / 0;
            }
            return hVar;
        }

        @Override // ivas.gov.bisp.enumeration.d.h.aWm
        public final void e(Uri uri) {
            int i = 2 % 2;
            int i2 = a + 71;
            b = i2 % 128;
            if (i2 % 2 != 0) {
                this.f = uri;
            } else {
                this.f = uri;
                int i3 = 35 / 0;
            }
        }

        @Override // ivas.gov.bisp.enumeration.d.h.aWm
        public final void setExtras(Bundle bundle) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 91;
            int i4 = (i2 ^ 91) | i3;
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            int i6 = i5 % 128;
            a = i6;
            int i7 = i5 % 2;
            this.g = bundle;
            int i8 = (i6 & 102) + (i6 | 102);
            int i9 = (i8 ^ (-1)) + (i8 << 1);
            b = i9 % 128;
            int i10 = i9 % 2;
        }

        @Override // ivas.gov.bisp.enumeration.d.h.aWm
        public final void setFlags(int i) {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = ((i3 | 85) << 1) - (i3 ^ 85);
            int i5 = i4 % 128;
            a = i5;
            int i6 = i4 % 2;
            this.e = i;
            int i7 = ((i5 & 42) + (i5 | 42)) - 1;
            b = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    public interface aWp {
        ClipData b();

        int c();

        ContentInfo e();

        int getFlags();
    }

    public static final class aWq implements aWp {
        private static int a = 0;
        private static int b = 1;
        public final ContentInfo c;

        public aWq(ContentInfo contentInfo) {
            Objects.requireNonNull(contentInfo);
            this.c = contentInfo;
        }

        @Override // ivas.gov.bisp.enumeration.d.h.aWp
        public final ClipData b() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 ^ 100) + ((i2 & 100) << 1)) - 1;
            a = i3 % 128;
            int i4 = i3 % 2;
            ContentInfo contentInfo = this.c;
            if (i4 == 0) {
                return contentInfo.getClip();
            }
            contentInfo.getClip();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.d.h.aWp
        public final int c() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 | 68) << 1) - (i2 ^ 68);
            int i4 = (i3 ^ (-1)) + (i3 << 1);
            a = i4 % 128;
            int i5 = i4 % 2;
            int source = this.c.getSource();
            int i6 = b;
            int i7 = ((i6 | 81) << 1) - (i6 ^ 81);
            a = i7 % 128;
            int i8 = i7 % 2;
            return source;
        }

        @Override // ivas.gov.bisp.enumeration.d.h.aWp
        public final ContentInfo e() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 ^ 103) + ((i2 & 103) << 1);
            int i4 = i3 % 128;
            b = i4;
            int i5 = i3 % 2;
            ContentInfo contentInfo = this.c;
            int i6 = i4 & 115;
            int i7 = (i6 - (~((i4 ^ 115) | i6))) - 1;
            a = i7 % 128;
            int i8 = i7 % 2;
            return contentInfo;
        }

        @Override // ivas.gov.bisp.enumeration.d.h.aWp
        public final int getFlags() {
            int i = 2 % 2;
            int i2 = b + 55;
            a = i2 % 128;
            int i3 = i2 % 2;
            int flags = this.c.getFlags();
            int i4 = a;
            int i5 = i4 & 33;
            int i6 = (i4 ^ 33) | i5;
            int i7 = (i5 & i6) + (i6 | i5);
            b = i7 % 128;
            if (i7 % 2 != 0) {
                return flags;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String toString() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 65;
            int i4 = ((i2 ^ 65) | i3) << 1;
            int i5 = -((i2 | 65) & (~i3));
            int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
            a = i6 % 128;
            int i7 = i6 % 2;
            StringBuilder sbW = j.w("ContentInfoCompat{");
            sbW.append(this.c);
            int i8 = b;
            int i9 = ((i8 | 35) << 1) - (i8 ^ 35);
            a = i9 % 128;
            int i10 = i9 % 2;
            sbW.append("}");
            if (i10 == 0) {
                return sbW.toString();
            }
            sbW.toString();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public h(aWp awp) {
        this.c = awp;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 24) + ((i2 & 24) << 1)) - 1;
        a = i3 % 128;
        if (i3 % 2 != 0) {
            this.c.toString();
            throw null;
        }
        String string = this.c.toString();
        int i4 = b;
        int i5 = (((i4 & (-118)) | ((~i4) & 117)) - (~(-(-((i4 & 117) << 1))))) - 1;
        a = i5 % 128;
        int i6 = i5 % 2;
        return string;
    }

    public static final class aWr implements aWp {
        private static int a = 0;
        private static int b = 1;
        public final ClipData c;
        public final int d;
        public final int e;
        public final Uri f;
        public final Bundle g;

        /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
        
            if ((r0 & 1) == r0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
        
            r9.e = r0;
            r9.f = r10.f;
            r0 = ivas.gov.bisp.enumeration.d.h.aWr.b;
            r1 = r0 & 39;
            r0 = (r0 | 39) & (~r1);
            r1 = -(-(r1 << 1));
            r2 = (r0 & r1) + (r0 | r1);
            ivas.gov.bisp.enumeration.d.h.aWr.a = r2 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x005b, code lost:
        
            if ((r2 % 2) != 0) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x005d, code lost:
        
            r9.g = r10.g;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0061, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0062, code lost:
        
            r9.g = r10.g;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0067, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0068, code lost:
        
            r10 = ivas.gov.bisp.enumeration.p091n.j.w("Requested flags 0x");
            r0 = java.lang.Integer.toHexString(r0);
            r1 = ivas.gov.bisp.enumeration.d.h.aWr.b;
            r2 = (r1 & (-10)) | ((~r1) & 9);
            r1 = -(-((r1 & 9) << 1));
            r3 = ((r2 | r1) << 1) - (r1 ^ r2);
            ivas.gov.bisp.enumeration.d.h.aWr.a = r3 % 128;
            r3 = r3 % 2;
            r10.append(r0);
            r10.append(", but only 0x");
            r0 = ivas.gov.bisp.enumeration.d.h.aWr.b;
            r1 = (r0 & 47) + (r0 | 47);
            ivas.gov.bisp.enumeration.d.h.aWr.a = r1 % 128;
            r1 = r1 % 2;
            r10.append(java.lang.Integer.toHexString(1));
            r10.append(" are allowed");
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x00b2, code lost:
        
            throw new java.lang.IllegalArgumentException(r10.toString());
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0036, code lost:
        
            if ((r0 & 1) == r0) goto L12;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public aWr(ivas.gov.bisp.enumeration.d.h.aWo r10) {
            /*
                Method dump skipped, instruction units count: 223
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.d.h.aWr.<init>(ivas.gov.bisp.enumeration.d.h$aWo):void");
        }

        @Override // ivas.gov.bisp.enumeration.d.h.aWp
        public final ClipData b() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 & 37) + (i2 | 37);
            a = i3 % 128;
            int i4 = i3 % 2;
            ClipData clipData = this.c;
            if (i4 != 0) {
                int i5 = 47 / 0;
            }
            return clipData;
        }

        @Override // ivas.gov.bisp.enumeration.d.h.aWp
        public final int c() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 ^ 7) | (i2 & 7)) << 1;
            int i4 = -((i2 & (-8)) | ((~i2) & 7));
            int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
            b = i5 % 128;
            int i6 = i5 % 2;
            int i7 = this.d;
            int i8 = i2 & 125;
            int i9 = -(-((i2 ^ 125) | i8));
            int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
            b = i10 % 128;
            int i11 = i10 % 2;
            return i7;
        }

        @Override // ivas.gov.bisp.enumeration.d.h.aWp
        public final ContentInfo e() {
            int i = 2 % 2;
            int i2 = a + 94;
            int i3 = (i2 ^ (-1)) + (i2 << 1);
            int i4 = i3 % 128;
            b = i4;
            if (i3 % 2 == 0) {
                throw null;
            }
            int i5 = ((i4 ^ 48) + ((i4 & 48) << 1)) - 1;
            a = i5 % 128;
            int i6 = i5 % 2;
            return null;
        }

        @Override // ivas.gov.bisp.enumeration.d.h.aWp
        public final int getFlags() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (((i2 | 74) << 1) - (i2 ^ 74)) - 1;
            b = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                throw null;
            }
            int i4 = this.e;
            int i5 = i2 ^ 69;
            int i6 = (((i2 & 69) | i5) << 1) - i5;
            b = i6 % 128;
            if (i6 % 2 != 0) {
                return i4;
            }
            obj.hashCode();
            throw null;
        }

        public final String toString() {
            String strValueOf;
            String strValueOf2;
            String string;
            int i = 2 % 2;
            int i2 = b + 21;
            a = i2 % 128;
            int i3 = i2 % 2;
            StringBuilder sbW = j.w("ContentInfoCompat{clip=");
            ClipData clipData = this.c;
            int i4 = a + 75;
            b = i4 % 128;
            int i5 = i4 % 2;
            sbW.append(clipData.getDescription());
            int i6 = b;
            int i7 = ((i6 & 27) - (~(i6 | 27))) - 1;
            a = i7 % 128;
            if (i7 % 2 != 0) {
                sbW.append(", source=");
                throw null;
            }
            sbW.append(", source=");
            int i8 = this.d;
            if (i8 != 0) {
                int i9 = a;
                int i10 = ((i9 ^ 17) | (i9 & 17)) << 1;
                int i11 = -((i9 & (-18)) | ((~i9) & 17));
                int i12 = (i10 & i11) + (i10 | i11);
                int i13 = i12 % 128;
                b = i13;
                if (i12 % 2 != 0 ? i8 == 1 : i8 == 1) {
                    int i14 = i13 & 75;
                    int i15 = (i14 - (~((i13 ^ 75) | i14))) - 1;
                    a = i15 % 128;
                    int i16 = i15 % 2;
                    strValueOf = "SOURCE_CLIPBOARD";
                } else if (i8 != 2) {
                    int i17 = (i13 ^ 1) + ((i13 & 1) << 1);
                    a = i17 % 128;
                    if (i17 % 2 == 0 ? i8 == 3 : i8 == 3) {
                        strValueOf = "SOURCE_DRAG_AND_DROP";
                        int i18 = i13 & 99;
                        int i19 = ((i13 ^ 99) | i18) << 1;
                        int i20 = -((i13 | 99) & (~i18));
                        int i21 = ((i19 | i20) << 1) - (i19 ^ i20);
                        a = i21 % 128;
                        int i22 = i21 % 2;
                    } else if (i8 != 4) {
                        int i23 = i13 & 47;
                        int i24 = (i13 ^ 47) | i23;
                        int i25 = ((i23 | i24) << 1) - (i23 ^ i24);
                        a = i25 % 128;
                        int i26 = i25 % 2;
                        if (i8 != 5) {
                            int i27 = (((i13 & (-16)) | ((~i13) & 15)) - (~((i13 & 15) << 1))) - 1;
                            a = i27 % 128;
                            if (i27 % 2 != 0) {
                                String.valueOf(i8);
                                throw null;
                            }
                            strValueOf = String.valueOf(i8);
                            int i28 = a;
                            int i29 = i28 ^ 51;
                            int i30 = -(-((i28 & 51) << 1));
                            int i31 = (i29 ^ i30) + ((i30 & i29) << 1);
                            b = i31 % 128;
                            int i32 = i31 % 2;
                        } else {
                            int i33 = i13 | 59;
                            int i34 = ((i33 << 1) - (~(-(i33 & (~(i13 & 59)))))) - 1;
                            a = i34 % 128;
                            if (i34 % 2 != 0) {
                                int i35 = 2 % 5;
                            }
                            strValueOf = "SOURCE_PROCESS_TEXT";
                        }
                    } else {
                        int i36 = i13 & 33;
                        int i37 = (i13 ^ 33) | i36;
                        int i38 = (i36 ^ i37) + ((i36 & i37) << 1);
                        a = i38 % 128;
                        int i39 = i38 % 2;
                        strValueOf = "SOURCE_AUTOFILL";
                    }
                } else {
                    int i40 = (i9 & 93) + (i9 | 93);
                    b = i40 % 128;
                    int i41 = i40 % 2;
                    strValueOf = "SOURCE_INPUT_METHOD";
                }
            } else {
                int i42 = b;
                int i43 = (i42 ^ 59) + ((i42 & 59) << 1);
                a = i43 % 128;
                int i44 = i43 % 2;
                strValueOf = "SOURCE_APP";
            }
            sbW.append(strValueOf);
            sbW.append(", flags=");
            int i45 = a;
            int i46 = (-2) - ((i45 + 28) ^ (-1));
            b = i46 % 128;
            int i47 = i46 % 2;
            int i48 = this.e;
            if ((i48 & 1) != 0) {
                int i49 = ((i45 ^ 54) + ((i45 & 54) << 1)) - 1;
                int i50 = i49 % 128;
                b = i50;
                int i51 = i49 % 2;
                int i52 = i50 & 69;
                int i53 = i52 + ((i50 ^ 69) | i52);
                a = i53 % 128;
                int i54 = i53 % 2;
                strValueOf2 = "FLAG_CONVERT_TO_PLAIN_TEXT";
            } else {
                strValueOf2 = String.valueOf(i48);
                int i55 = b;
                int i56 = ((i55 & (-2)) | ((~i55) & 1)) + ((i55 & 1) << 1);
                a = i56 % 128;
                if (i56 % 2 != 0) {
                    int i57 = 5 / 5;
                }
            }
            sbW.append(strValueOf2);
            Uri uri = this.f;
            String str = BuildConfig.FLAVOR;
            if (uri == null) {
                int i58 = a;
                int i59 = (i58 ^ 10) + ((i58 & 10) << 1);
                int i60 = (i59 ^ (-1)) + (i59 << 1);
                b = i60 % 128;
                if (i60 % 2 == 0) {
                    throw null;
                }
                int i61 = (i58 & 41) + (i58 | 41);
                b = i61 % 128;
                int i62 = i61 % 2;
                string = BuildConfig.FLAVOR;
            } else {
                StringBuilder sbW2 = j.w(", hasLinkUri(");
                int length = this.f.toString().length();
                int i63 = a;
                int i64 = ((i63 | 71) << 1) - (i63 ^ 71);
                b = i64 % 128;
                if (i64 % 2 == 0) {
                    sbW2.append(length);
                    sbW2.append(")");
                    string = sbW2.toString();
                    int i65 = 23 / 0;
                } else {
                    sbW2.append(length);
                    sbW2.append(")");
                    string = sbW2.toString();
                }
                int i66 = b;
                int i67 = i66 & 11;
                int i68 = -(-(i66 | 11));
                int i69 = (i67 ^ i68) + ((i68 & i67) << 1);
                a = i69 % 128;
                int i70 = i69 % 2;
            }
            sbW.append(string);
            if (this.g == null) {
                int i71 = a;
                int i72 = i71 & 113;
                int i73 = -(-((i71 ^ 113) | i72));
                int i74 = (i72 ^ i73) + ((i73 & i72) << 1);
                b = i74 % 128;
                if (i74 % 2 == 0) {
                    int i75 = 81 / 0;
                }
            } else {
                int i76 = a;
                int i77 = ((i76 ^ 29) | (i76 & 29)) << 1;
                int i78 = -(((~i76) & 29) | (i76 & (-30)));
                int i79 = (i77 & i78) + (i77 | i78);
                b = i79 % 128;
                int i80 = i79 % 2;
                str = ", hasExtras";
            }
            String strU = j.u(sbW, str, "}");
            int i81 = a;
            int i82 = i81 & 95;
            int i83 = i82 + ((i81 ^ 95) | i82);
            b = i83 % 128;
            int i84 = i83 % 2;
            return strU;
        }
    }
}
