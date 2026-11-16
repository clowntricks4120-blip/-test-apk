package ivas.gov.bisp.enumeration.p002ab;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import ivas.gov.bisp.enumeration.p007ag.e;
import ivas.gov.bisp.enumeration.p091n.j;
import java.io.IOException;
import java.util.Objects;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.ab.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0084m {
    private static int a = 0;
    private static int b = 1;
    public static final ThreadLocal<TypedValue> c = new ThreadLocal<>();
    public static final WeakHashMap<aUT, SparseArray<aUS>> d = new WeakHashMap<>(0);
    public static final Object e = new Object();

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.ab.m$aTa */
    public static abstract class aTa {
        private static int a = 0;
        private static int b = 1;

        /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.ab.m$aTa$aUU */
        public class aUU implements Runnable {
            private static int a = 0;
            private static int b = 1;
            public final /* synthetic */ Typeface c;

            public aUU(Typeface typeface) {
                this.c = typeface;
            }

            @Override // java.lang.Runnable
            public void run() {
                int i = 2 % 2;
                int i2 = a;
                int i3 = (i2 & (-124)) | ((~i2) & 123);
                int i4 = -(-((i2 & 123) << 1));
                int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
                b = i5 % 128;
                int i6 = i5 % 2;
                aTa ata = aTa.this;
                Typeface typeface = this.c;
                if (i6 != 0) {
                    ata.g(typeface);
                    return;
                }
                ata.g(typeface);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.ab.m$aTa$aUV */
        public class aUV implements Runnable {
            private static int a = 0;
            private static int b = 1;
            public final /* synthetic */ int c;

            public aUV(int i) {
                this.c = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                int i = 2 % 2;
                int i2 = (-2) - ((a + 44) ^ (-1));
                b = i2 % 128;
                int i3 = i2 % 2;
                aTa ata = aTa.this;
                if (i3 != 0) {
                    ata.f(this.c);
                } else {
                    ata.f(this.c);
                    throw null;
                }
            }
        }

        public static Handler c(Handler handler) {
            int i = 2 % 2;
            int i2 = (-2) - ((a + 126) ^ (-1));
            b = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
                int i3 = a;
                int i4 = (i3 & 63) + (i3 | 63);
                b = i4 % 128;
                int i5 = i4 % 2;
            }
            int i6 = b;
            int i7 = i6 & 77;
            int i8 = (i6 ^ 77) | i7;
            int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
            a = i9 % 128;
            int i10 = i9 % 2;
            return handler;
        }

        public final void d(int i, Handler handler) {
            int i2 = 2 % 2;
            Handler handlerC = c(handler);
            aUV auv = new aUV(i);
            int i3 = b;
            int i4 = (i3 ^ 73) + ((i3 & 73) << 1);
            a = i4 % 128;
            int i5 = i4 % 2;
            handlerC.post(auv);
            int i6 = b;
            int i7 = i6 ^ 85;
            int i8 = -(-((i6 & 85) << 1));
            int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
            a = i9 % 128;
            int i10 = i9 % 2;
        }

        public final void e(Typeface typeface, Handler handler) {
            int i = 2 % 2;
            c(handler).post(new aUU(typeface));
            int i2 = a;
            int i3 = ((i2 & (-32)) | ((~i2) & 31)) + ((i2 & 31) << 1);
            b = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 82 / 0;
            }
        }

        public abstract void f(int i);

        public abstract void g(Typeface typeface);
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.ab.m$aUS */
    public static class aUS {
        public final ColorStateList a;
        public final Configuration b;

        public aUS(ColorStateList colorStateList, Configuration configuration) {
            this.a = colorStateList;
            this.b = configuration;
        }
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.ab.m$aUT */
    public static final class aUT {
        private static int a = 1;
        private static int b;
        public final Resources c;
        public final Resources.Theme d;

        public aUT(Resources resources, Resources.Theme theme) {
            this.c = resources;
            this.d = theme;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (-2) - (((i2 & 2) + (i2 | 2)) ^ (-1));
            a = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[2];
            objArr[0] = this.c;
            Resources.Theme theme = this.d;
            int i5 = (((i2 & (-84)) | ((~i2) & 83)) - (~((i2 & 83) << 1))) - 1;
            a = i5 % 128;
            if (i5 % 2 != 0) {
                objArr[1] = theme;
                return Objects.hash(objArr);
            }
            objArr[1] = theme;
            int i6 = 22 / 0;
            return Objects.hash(objArr);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x00a0  */
        /* JADX WARN: Code duplicated, block: B:26:0x00a2  */
        /* JADX WARN: Code duplicated, block: B:28:0x00b3  */
        public final boolean equals(Object obj) {
            int i;
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = (i3 | 43) << 1;
            int i5 = -(i3 ^ 43);
            int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
            int i7 = i6 % 128;
            b = i7;
            if (i6 % 2 == 0 ? this == obj : this == obj) {
                int i8 = i7 & 23;
                int i9 = (i8 - (~((i7 ^ 23) | i8))) - 1;
                a = i9 % 128;
                int i10 = i9 % 2;
                return true;
            }
            Object obj2 = null;
            boolean z = false;
            if (obj != null) {
                int i11 = i3 & 97;
                int i12 = i11 + ((i3 ^ 97) | i11);
                b = i12 % 128;
                if (i12 % 2 != 0) {
                    obj.getClass();
                    obj2.hashCode();
                    throw null;
                }
                if (aUT.class == obj.getClass()) {
                    int i13 = b;
                    int i14 = i13 & 85;
                    int i15 = ((((i13 ^ 85) | i14) << 1) - (~(-((~i14) & (i13 | 85))))) - 1;
                    a = i15 % 128;
                    int i16 = i15 % 2;
                    aUT aut = (aUT) obj;
                    Resources resources = this.c;
                    Resources resources2 = aut.c;
                    int i17 = i13 & 53;
                    int i18 = (i13 | 53) & (~i17);
                    int i19 = i17 << 1;
                    int i20 = (i18 & i19) + (i18 | i19);
                    a = i20 % 128;
                    int i21 = i20 % 2;
                    if (resources.equals(resources2)) {
                        int i22 = a;
                        int i23 = (-2) - (((i22 & 78) + (i22 | 78)) ^ (-1));
                        b = i23 % 128;
                        if (i23 % 2 != 0) {
                            int i24 = 66 / 0;
                            if (!Objects.equals(this.d, aut.d)) {
                                int i25 = a;
                                i = (((i25 | 52) << 1) - (i25 ^ 52)) - 1;
                                b = i % 128;
                                if (i % 2 != 0) {
                                    int i26 = 3 % 2;
                                }
                            } else {
                                z = true;
                            }
                        } else if (Objects.equals(this.d, aut.d)) {
                            z = true;
                        } else {
                            int i27 = a;
                            i = (((i27 | 52) << 1) - (i27 ^ 52)) - 1;
                            b = i % 128;
                            if (i % 2 != 0) {
                                int i28 = 3 % 2;
                            }
                        }
                    } else {
                        int i29 = a;
                        i = (((i29 | 52) << 1) - (i29 ^ 52)) - 1;
                        b = i % 128;
                        if (i % 2 != 0) {
                            int i210 = 3 % 2;
                        }
                    }
                    int i30 = b;
                    int i31 = i30 & 29;
                    int i32 = (((i30 | 29) & (~i31)) - (~(i31 << 1))) - 1;
                    a = i32 % 128;
                    int i33 = i32 % 2;
                    return z;
                }
            }
            int i34 = b;
            int i35 = i34 & 113;
            int i36 = i35 + ((i34 ^ 113) | i35);
            a = i36 % 128;
            if (i36 % 2 != 0) {
                return false;
            }
            throw null;
        }
    }

    static {
        int i = a;
        int i2 = i & 61;
        int i3 = ((i | 61) & (~i2)) + (i2 << 1);
        b = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 26 / 0;
        }
    }

    public static Typeface b(Context context, int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 ^ 113) | (i3 & 113)) << 1;
        int i5 = -(((~i3) & 113) | (i3 & (-114)));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        if (!context.isRestricted()) {
            TypedValue typedValue = new TypedValue();
            int i8 = a;
            int i9 = i8 | 49;
            int i10 = i9 << 1;
            int i11 = -((~(i8 & 49)) & i9);
            int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
            b = i12 % 128;
            int i13 = i12 % 2;
            Typeface typefaceC = c(context, i, typedValue, 0, null, null, false, false);
            int i14 = b;
            int i15 = (i14 & 29) + (i14 | 29);
            a = i15 % 128;
            int i16 = i15 % 2;
            return typefaceC;
        }
        int i17 = b;
        int i18 = ((i17 ^ 30) + ((i17 & 30) << 1)) - 1;
        int i19 = i18 % 128;
        a = i19;
        int i20 = i18 % 2;
        int i21 = i19 & 75;
        int i22 = (i19 | 75) & (~i21);
        int i23 = i21 << 1;
        int i24 = (i22 & i23) + (i22 | i23);
        b = i24 % 128;
        if (i24 % 2 == 0) {
            int i25 = 33 / 0;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0103 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:11:0x006e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:12:0x0070  */
    /* JADX WARN: Code duplicated, block: B:14:0x0099 A[PHI: r1
  0x0099: PHI (r1v37 java.lang.String) = (r1v15 java.lang.String), (r1v122 java.lang.String) binds: [B:10:0x006c, B:7:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:18:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:21:0x00cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:23:0x00e7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:27:0x0110 A[Catch: IOException -> 0x0233, XmlPullParserException -> 0x024a, TRY_LEAVE, TryCatch #5 {IOException -> 0x0233, XmlPullParserException -> 0x024a, blocks: (B:25:0x0103, B:27:0x0110, B:32:0x0131, B:34:0x014b, B:43:0x0195, B:45:0x01a5, B:48:0x01bd, B:51:0x01d7), top: B:100:0x0103 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0118  */
    /* JADX WARN: Code duplicated, block: B:31:0x012f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0131 A[Catch: IOException -> 0x0233, XmlPullParserException -> 0x024a, TRY_ENTER, TRY_LEAVE, TryCatch #5 {IOException -> 0x0233, XmlPullParserException -> 0x024a, blocks: (B:25:0x0103, B:27:0x0110, B:32:0x0131, B:34:0x014b, B:43:0x0195, B:45:0x01a5, B:48:0x01bd, B:51:0x01d7), top: B:100:0x0103 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x014b A[Catch: IOException -> 0x0233, XmlPullParserException -> 0x024a, TRY_ENTER, TRY_LEAVE, TryCatch #5 {IOException -> 0x0233, XmlPullParserException -> 0x024a, blocks: (B:25:0x0103, B:27:0x0110, B:32:0x0131, B:34:0x014b, B:43:0x0195, B:45:0x01a5, B:48:0x01bd, B:51:0x01d7), top: B:100:0x0103 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x015f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0176  */
    /* JADX WARN: Code duplicated, block: B:39:0x0177  */
    /* JADX WARN: Code duplicated, block: B:42:0x0186  */
    /* JADX WARN: Code duplicated, block: B:47:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:50:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:53:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:55:0x0203  */
    /* JADX WARN: Code duplicated, block: B:67:0x0221  */
    /* JADX WARN: Code duplicated, block: B:77:0x0262  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.String] */
    public static Typeface c(Context context, int i, TypedValue typedValue, int i2, aTa ata, Handler handler, boolean z, boolean z2) {
        String string;
        Typeface typefaceB;
        int i3;
        M.aUN aunB;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = 2 % 2;
        int i10 = b;
        int i11 = (i10 & 108) + (i10 | 108);
        int i12 = (i11 ^ (-1)) + (i11 << 1);
        a = i12 % 128;
        int i13 = i12 % 2;
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        int i14 = a;
        int i15 = ((i14 & 119) - (~(i14 | 119))) - 1;
        b = i15 % 128;
        int i16 = i15 % 2;
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            StringBuilder sbW = j.w("Resource \"");
            String resourceName = resources.getResourceName(i);
            int i17 = a;
            int i18 = (i17 ^ 5) + ((i17 & 5) << 1);
            b = i18 % 128;
            if (i18 % 2 == 0) {
                sbW.append(resourceName);
                sbW.append("\" (");
                int i19 = 98 / 0;
            } else {
                sbW.append(resourceName);
                sbW.append("\" (");
            }
            int i20 = a;
            int i21 = i20 & 103;
            int i22 = (i20 | 103) & (~i21);
            int i23 = -(-(i21 << 1));
            int i24 = ((i22 | i23) << 1) - (i22 ^ i23);
            b = i24 % 128;
            int i25 = i24 % 2;
            sbW.append(Integer.toHexString(i));
            sbW.append(") is not a Font: ");
            sbW.append(typedValue);
            throw new Resources.NotFoundException(sbW.toString());
        }
        int i26 = a;
        int i27 = ((i26 | 69) << 1) - (((~i26) & 69) | (i26 & (-70)));
        b = i27 % 128;
        String str = -3;
        str = -3;
        Object obj = null;
        if (i27 % 2 == 0) {
            string = charSequence.toString();
            int i28 = 57 / 0;
            if (string.startsWith("res/")) {
                str = string;
                Object objC = e.d.c(e.d(resources, i, i2));
                i3 = a;
                int i29 = i3 ^ 27;
                int i30 = -(-((i3 & 27) << 1));
                int i31 = ((i29 | i30) << 1) - (i29 ^ i30);
                b = i31 % 128;
                int i32 = i31 % 2;
                typefaceB = (Typeface) objC;
                if (typefaceB != null) {
                    int i33 = i3 & 79;
                    i8 = i33 + ((i3 ^ 79) | i33);
                    b = i8 % 128;
                    if (i8 % 2 == 0) {
                        int i34 = 18 / 0;
                        if (ata != null) {
                            ata.e(typefaceB, handler);
                            int i35 = b;
                            int i36 = ((i35 & (-126)) | ((~i35) & 125)) + ((i35 & 125) << 1);
                            a = i36 % 128;
                            int i37 = i36 % 2;
                        }
                    } else if (ata != null) {
                        ata.e(typefaceB, handler);
                        int i38 = b;
                        int i39 = ((i38 & (-126)) | ((~i38) & 125)) + ((i38 & 125) << 1);
                        a = i39 % 128;
                        int i310 = i39 % 2;
                    }
                } else if (z2) {
                    int i40 = ((i3 & 98) + (i3 | 98)) - 1;
                    int i41 = i40 % 128;
                    b = i41;
                    int i42 = i40 % 2;
                    int i43 = i41 & 57;
                    int i44 = (i43 - (~(-(-((i41 ^ 57) | i43))))) - 1;
                    a = i44 % 128;
                    int i45 = i44 % 2;
                } else {
                    try {
                        if (!str.toLowerCase().endsWith(".xml")) {
                            typefaceB = e.c(context, resources, i, str, i2);
                            if (ata != null) {
                                int i46 = a;
                                int i47 = i46 | 113;
                                int i48 = i47 << 1;
                                int i49 = -((~(i46 & 113)) & i47);
                                i5 = (i48 ^ i49) + ((i49 & i48) << 1);
                                b = i5 % 128;
                                if (i5 % 2 != 0) {
                                    obj.hashCode();
                                    throw null;
                                }
                                if (typefaceB != null) {
                                    ata.e(typefaceB, handler);
                                    int i50 = b;
                                    int i51 = (i50 & (-12)) | ((~i50) & 11);
                                    int i52 = (i50 & 11) << 1;
                                    int i53 = (i51 ^ i52) + ((i52 & i51) << 1);
                                    a = i53 % 128;
                                    int i54 = i53 % 2;
                                } else {
                                    ata.d(-3, handler);
                                    int i55 = b;
                                    i6 = (((i55 | 104) << 1) - (i55 ^ 104)) - 1;
                                    i7 = i6 % 128;
                                    a = i7;
                                    if (i6 % 2 == 0) {
                                        throw null;
                                    }
                                    int i56 = i7 & 31;
                                    int i57 = ((i7 ^ 31) | i56) << 1;
                                    int i58 = -((i7 | 31) & (~i56));
                                    int i59 = (i57 ^ i58) + ((i58 & i57) << 1);
                                    b = i59 % 128;
                                    int i60 = i59 % 2;
                                }
                            }
                        } else {
                            int i61 = (-2) - ((b + 58) ^ (-1));
                            a = i61 % 128;
                            int i62 = i61 % 2;
                            XmlResourceParser xml = resources.getXml(i);
                            int i63 = a;
                            int i64 = (i63 & 105) + (i63 | 105);
                            b = i64 % 128;
                            int i65 = i64 % 2;
                            aunB = M.b(xml, resources);
                            if (aunB == null) {
                                int i66 = a;
                                int i67 = i66 & 71;
                                int i68 = -(-(i66 | 71));
                                int i69 = ((i67 | i68) << 1) - (i68 ^ i67);
                                b = i69 % 128;
                                int i70 = i69 % 2;
                                Log.e("ResourcesCompat", "Failed to find font-family tag");
                                if (ata != null) {
                                    int i71 = b;
                                    int i72 = i71 ^ 93;
                                    int i73 = -(-((i71 & 93) << 1));
                                    int i74 = (i72 ^ i73) + ((i73 & i72) << 1);
                                    a = i74 % 128;
                                    int i75 = i74 % 2;
                                    ata.d(-3, handler);
                                    int i76 = b;
                                    int i77 = i76 & 31;
                                    int i78 = (((i76 ^ 31) | i77) << 1) - ((i76 | 31) & (~i77));
                                    a = i78 % 128;
                                    int i79 = i78 % 2;
                                }
                            } else {
                                int i80 = b;
                                int i81 = i80 ^ 57;
                                int i82 = -(-((i80 & 57) << 1));
                                i4 = (i81 ^ i82) + ((i82 & i81) << 1);
                                a = i4 % 128;
                                try {
                                    if (i4 % 2 != 0) {
                                        typefaceB = e.b(context, aunB, resources, i, i2, ata, handler, z);
                                        int i83 = 50 / 0;
                                    } else {
                                        typefaceB = e.b(context, aunB, resources, i, i2, ata, handler, z);
                                    }
                                } catch (IOException e2) {
                                    e = e2;
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("Failed to read xml resource ");
                                    sb.append(str);
                                    Log.e("ResourcesCompat", sb.toString(), e);
                                    if (ata != null) {
                                        int i84 = b;
                                        int i85 = ((i84 & (-42)) | ((~i84) & 41)) + ((i84 & 41) << 1);
                                        a = i85 % 128;
                                        int i86 = i85 % 2;
                                        ata.d(-3, handler);
                                        int i87 = b;
                                        int i88 = (i87 ^ 97) + ((i87 & 97) << 1);
                                        a = i88 % 128;
                                        int i89 = i88 % 2;
                                    }
                                    typefaceB = null;
                                } catch (XmlPullParserException e3) {
                                    e = e3;
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("Failed to parse xml resource ");
                                    sb2.append(str);
                                    Log.e("ResourcesCompat", sb2.toString(), e);
                                    if (ata != null) {
                                        int i810 = b;
                                        int i811 = ((i810 & (-42)) | ((~i810) & 41)) + ((i810 & 41) << 1);
                                        a = i811 % 128;
                                        int i812 = i811 % 2;
                                        ata.d(-3, handler);
                                        int i813 = b;
                                        int i814 = (i813 ^ 97) + ((i813 & 97) << 1);
                                        a = i814 % 128;
                                        int i815 = i814 % 2;
                                    }
                                    typefaceB = null;
                                }
                            }
                        }
                    } catch (IOException e4) {
                        e = e4;
                        str = str;
                    } catch (XmlPullParserException e5) {
                        e = e5;
                        str = str;
                    }
                }
                int i90 = a + 65;
                b = i90 % 128;
                int i91 = i90 % 2;
            } else if (ata != null) {
                int i92 = b;
                int i93 = ((i92 ^ 108) + ((i92 & 108) << 1)) - 1;
                a = i93 % 128;
                int i94 = i93 % 2;
                ata.d(-3, handler);
                int i95 = a;
                int i96 = (i95 & (-124)) | ((~i95) & 123);
                int i97 = (i95 & 123) << 1;
                int i98 = (i96 & i97) + (i97 | i96);
                b = i98 % 128;
                int i99 = i98 % 2;
            }
            typefaceB = null;
        } else {
            string = charSequence.toString();
            if (string.startsWith("res/")) {
                str = string;
                Object objC2 = e.d.c(e.d(resources, i, i2));
                i3 = a;
                int i210 = i3 ^ 27;
                int i311 = -(-((i3 & 27) << 1));
                int i312 = ((i210 | i311) << 1) - (i210 ^ i311);
                b = i312 % 128;
                int i313 = i312 % 2;
                typefaceB = (Typeface) objC2;
                if (typefaceB != null) {
                    int i314 = i3 & 79;
                    i8 = i314 + ((i3 ^ 79) | i314);
                    b = i8 % 128;
                    if (i8 % 2 == 0) {
                        int i315 = 18 / 0;
                        if (ata != null) {
                            ata.e(typefaceB, handler);
                            int i316 = b;
                            int i317 = ((i316 & (-126)) | ((~i316) & 125)) + ((i316 & 125) << 1);
                            a = i317 % 128;
                            int i318 = i317 % 2;
                        }
                    } else if (ata != null) {
                        ata.e(typefaceB, handler);
                        int i319 = b;
                        int i3110 = ((i319 & (-126)) | ((~i319) & 125)) + ((i319 & 125) << 1);
                        a = i3110 % 128;
                        int i3111 = i3110 % 2;
                    }
                } else if (z2) {
                    int i410 = ((i3 & 98) + (i3 | 98)) - 1;
                    int i411 = i410 % 128;
                    b = i411;
                    int i412 = i410 % 2;
                    int i413 = i411 & 57;
                    int i414 = (i413 - (~(-(-((i411 ^ 57) | i413))))) - 1;
                    a = i414 % 128;
                    int i415 = i414 % 2;
                } else if (!str.toLowerCase().endsWith(".xml")) {
                    typefaceB = e.c(context, resources, i, str, i2);
                    if (ata != null) {
                        int i416 = a;
                        int i417 = i416 | 113;
                        int i418 = i417 << 1;
                        int i419 = -((~(i416 & 113)) & i417);
                        i5 = (i418 ^ i419) + ((i419 & i418) << 1);
                        b = i5 % 128;
                        if (i5 % 2 != 0) {
                            obj.hashCode();
                            throw null;
                        }
                        if (typefaceB != null) {
                            ata.e(typefaceB, handler);
                            int i510 = b;
                            int i511 = (i510 & (-12)) | ((~i510) & 11);
                            int i512 = (i510 & 11) << 1;
                            int i513 = (i511 ^ i512) + ((i512 & i511) << 1);
                            a = i513 % 128;
                            int i514 = i513 % 2;
                        } else {
                            ata.d(-3, handler);
                            int i515 = b;
                            i6 = (((i515 | 104) << 1) - (i515 ^ 104)) - 1;
                            i7 = i6 % 128;
                            a = i7;
                            if (i6 % 2 == 0) {
                                throw null;
                            }
                            int i516 = i7 & 31;
                            int i517 = ((i7 ^ 31) | i516) << 1;
                            int i518 = -((i7 | 31) & (~i516));
                            int i519 = (i517 ^ i518) + ((i518 & i517) << 1);
                            b = i519 % 128;
                            int i610 = i519 % 2;
                        }
                    }
                } else {
                    int i611 = (-2) - ((b + 58) ^ (-1));
                    a = i611 % 128;
                    int i612 = i611 % 2;
                    XmlResourceParser xml2 = resources.getXml(i);
                    int i613 = a;
                    int i614 = (i613 & 105) + (i613 | 105);
                    b = i614 % 128;
                    int i615 = i614 % 2;
                    aunB = M.b(xml2, resources);
                    if (aunB == null) {
                        int i616 = a;
                        int i617 = i616 & 71;
                        int i618 = -(-(i616 | 71));
                        int i619 = ((i617 | i618) << 1) - (i618 ^ i617);
                        b = i619 % 128;
                        int i710 = i619 % 2;
                        Log.e("ResourcesCompat", "Failed to find font-family tag");
                        if (ata != null) {
                            int i711 = b;
                            int i712 = i711 ^ 93;
                            int i713 = -(-((i711 & 93) << 1));
                            int i714 = (i712 ^ i713) + ((i713 & i712) << 1);
                            a = i714 % 128;
                            int i715 = i714 % 2;
                            ata.d(-3, handler);
                            int i716 = b;
                            int i717 = i716 & 31;
                            int i718 = (((i716 ^ 31) | i717) << 1) - ((i716 | 31) & (~i717));
                            a = i718 % 128;
                            int i719 = i718 % 2;
                        }
                    } else {
                        int i816 = b;
                        int i817 = i816 ^ 57;
                        int i818 = -(-((i816 & 57) << 1));
                        i4 = (i817 ^ i818) + ((i818 & i817) << 1);
                        a = i4 % 128;
                        if (i4 % 2 != 0) {
                            typefaceB = e.b(context, aunB, resources, i, i2, ata, handler, z);
                            int i819 = 50 / 0;
                        } else {
                            typefaceB = e.b(context, aunB, resources, i, i2, ata, handler, z);
                        }
                    }
                }
                int i910 = a + 65;
                b = i910 % 128;
                int i911 = i910 % 2;
            } else if (ata != null) {
                int i912 = b;
                int i913 = ((i912 ^ 108) + ((i912 & 108) << 1)) - 1;
                a = i913 % 128;
                int i914 = i913 % 2;
                ata.d(-3, handler);
                int i915 = a;
                int i916 = (i915 & (-124)) | ((~i915) & 123);
                int i917 = (i915 & 123) << 1;
                int i918 = (i916 & i917) + (i917 | i916);
                b = i918 % 128;
                int i919 = i918 % 2;
            }
            typefaceB = null;
        }
        if (typefaceB == null) {
            int i100 = (-2) - ((a + 98) ^ (-1));
            int i101 = i100 % 128;
            b = i101;
            if (i100 % 2 == 0) {
                throw null;
            }
            if (ata == null) {
                int i102 = i101 ^ 123;
                int i103 = ((i101 & 123) | i102) << 1;
                int i104 = -i102;
                int i105 = ((i103 | i104) << 1) - (i104 ^ i103);
                a = i105 % 128;
                if (i105 % 2 != 0) {
                    throw null;
                }
                if (!z2) {
                    StringBuilder sbW2 = j.w("Font resource ID #0x");
                    sbW2.append(Integer.toHexString(i));
                    sbW2.append(" could not be retrieved.");
                    throw new Resources.NotFoundException(sbW2.toString());
                }
            }
        }
        int i106 = a + 13;
        b = i106 % 128;
        int i107 = i106 % 2;
        return typefaceB;
    }
}
