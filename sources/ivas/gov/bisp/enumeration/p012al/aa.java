package ivas.gov.bisp.enumeration.p012al;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes.dex */
public final class aa {
    public final aXK a;

    public interface aXK {
        Uri a();

        void b();

        ClipDescription c();

        Object d();

        Uri e();
    }

    public static final class aXM implements aXK {
        private static int a = 0;
        private static int b = 1;
        public final Uri c;
        public final ClipDescription d;
        public final Uri e;

        public aXM(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.c = uri;
            this.d = clipDescription;
            this.e = uri2;
        }

        @Override // ivas.gov.bisp.enumeration.al.aa.aXK
        public final Uri a() {
            int i = 2 % 2;
            int i2 = a + 61;
            int i3 = i2 % 128;
            b = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Uri uri = this.c;
            int i4 = i3 & 27;
            int i5 = (i3 ^ 27) | i4;
            int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
            a = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 18 / 0;
            }
            return uri;
        }

        @Override // ivas.gov.bisp.enumeration.al.aa.aXK
        public final void b() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 ^ 30) + ((i2 & 30) << 1)) - 1;
            a = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.al.aa.aXK
        public final ClipDescription c() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 ^ 65) + ((i2 & 65) << 1);
            int i4 = i3 % 128;
            a = i4;
            int i5 = i3 % 2;
            ClipDescription clipDescription = this.d;
            int i6 = (i4 ^ 109) + ((i4 & 109) << 1);
            b = i6 % 128;
            int i7 = i6 % 2;
            return clipDescription;
        }

        @Override // ivas.gov.bisp.enumeration.al.aa.aXK
        public final Object d() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 | 9) << 1) - (i2 ^ 9);
            b = i3 % 128;
            if (i3 % 2 != 0) {
                return null;
            }
            int i4 = 94 / 0;
            return null;
        }

        @Override // ivas.gov.bisp.enumeration.al.aa.aXK
        public final Uri e() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 93;
            int i4 = (((i2 | 93) & (~i3)) - (~(i3 << 1))) - 1;
            int i5 = i4 % 128;
            a = i5;
            Object obj = null;
            if (i4 % 2 != 0) {
                throw null;
            }
            Uri uri = this.e;
            int i6 = ((i5 | 1) << 1) - (i5 ^ 1);
            b = i6 % 128;
            if (i6 % 2 != 0) {
                return uri;
            }
            obj.hashCode();
            throw null;
        }
    }

    public aa(aXK axk) {
        this.a = axk;
    }

    public static final class aXL implements aXK {
        private static int a = 1;
        private static int b;
        public final InputContentInfo c;

        public aXL(Object obj) {
            this.c = (InputContentInfo) obj;
        }

        @Override // ivas.gov.bisp.enumeration.al.aa.aXK
        public final Uri a() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 103;
            int i4 = -(-(i2 | 103));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            a = i5 % 128;
            int i6 = i5 % 2;
            Uri contentUri = this.c.getContentUri();
            int i7 = a;
            int i8 = (((i7 | 120) << 1) - (i7 ^ 120)) - 1;
            b = i8 % 128;
            int i9 = i8 % 2;
            return contentUri;
        }

        @Override // ivas.gov.bisp.enumeration.al.aa.aXK
        public final void b() {
            int i = 2 % 2;
            int i2 = a + 15;
            b = i2 % 128;
            int i3 = i2 % 2;
            this.c.requestPermission();
            if (i3 != 0) {
                int i4 = 54 / 0;
            }
        }

        @Override // ivas.gov.bisp.enumeration.al.aa.aXK
        public final ClipDescription c() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 21;
            int i4 = (i2 | 21) & (~i3);
            int i5 = -(-(i3 << 1));
            int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
            a = i6 % 128;
            int i7 = i6 % 2;
            InputContentInfo inputContentInfo = this.c;
            if (i7 != 0) {
                return inputContentInfo.getDescription();
            }
            inputContentInfo.getDescription();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.al.aa.aXK
        public final Object d() {
            int i = 2 % 2;
            int i2 = b + 84;
            int i3 = (i2 ^ (-1)) + (i2 << 1);
            int i4 = i3 % 128;
            a = i4;
            int i5 = i3 % 2;
            InputContentInfo inputContentInfo = this.c;
            int i6 = i4 & 95;
            int i7 = ((((i4 ^ 95) | i6) << 1) - (~(-((i4 | 95) & (~i6))))) - 1;
            b = i7 % 128;
            int i8 = i7 % 2;
            return inputContentInfo;
        }

        @Override // ivas.gov.bisp.enumeration.al.aa.aXK
        public final Uri e() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 15;
            int i4 = (i2 | 15) & (~i3);
            int i5 = i3 << 1;
            int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
            b = i6 % 128;
            if (i6 % 2 != 0) {
                this.c.getLinkUri();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Uri linkUri = this.c.getLinkUri();
            int i7 = b;
            int i8 = ((i7 ^ 104) + ((i7 & 104) << 1)) - 1;
            a = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 64 / 0;
            }
            return linkUri;
        }

        public aXL(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.c = new InputContentInfo(uri, clipDescription, uri2);
        }
    }
}
