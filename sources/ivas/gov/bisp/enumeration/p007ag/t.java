package ivas.gov.bisp.enumeration.p007ag;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import ivas.gov.bisp.enumeration.p002ab.M;
import ivas.gov.bisp.enumeration.p009ai.N;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class t extends u {
    private static int a = 0;
    private static int b = 1;

    @Override // ivas.gov.bisp.enumeration.p007ag.u
    public Typeface e(Context context, InputStream inputStream) {
        int i = 2 % 2;
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // ivas.gov.bisp.enumeration.p007ag.u
    public N g(N[] nArr, int i) {
        int i2 = 2 % 2;
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // ivas.gov.bisp.enumeration.p007ag.u
    public Typeface f(Context context, Resources resources, int i, String str, int i2) {
        int i3 = 2 % 2;
        try {
            Font fontBuild = new Font.Builder(resources, i).build();
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build());
            int i4 = a;
            int i5 = i4 & 7;
            int i6 = (i4 ^ 7) | i5;
            int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
            b = i7 % 128;
            int i8 = i7 % 2;
            Typeface typefaceBuild = customFallbackBuilder.setStyle(fontBuild.getStyle()).build();
            int i9 = b;
            int i10 = i9 & 93;
            int i11 = ((i9 | 93) & (~i10)) + (i10 << 1);
            a = i11 % 128;
            int i12 = i11 % 2;
            return typefaceBuild;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p007ag.u
    public Typeface d(Context context, CancellationSignal cancellationSignal, N[] nArr, int i) {
        int i2;
        N n;
        Uri uri;
        int i3;
        int i4 = 2 % 2;
        int i5 = a + 109;
        b = i5 % 128;
        int i6 = i5 % 2;
        ContentResolver contentResolver = context.getContentResolver();
        Object obj = null;
        try {
            int length = nArr.length;
            int i7 = b;
            int i8 = i7 & 65;
            int i9 = 1;
            int i10 = ((i7 ^ 65) | i8) << 1;
            int i11 = -((i7 | 65) & (~i8));
            int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
            a = i12 % 128;
            int i13 = i12 % 2;
            FontFamily.Builder builder = null;
            int i14 = 0;
            while (i14 < length) {
                int i15 = b;
                int i16 = (i15 & (-50)) | ((~i15) & 49);
                int i17 = (i15 & 49) << 1;
                int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
                a = i18 % 128;
                if (i18 % 2 != 0) {
                    n = nArr[i14];
                    try {
                        uri = n.a;
                        int i19 = 86 / 0;
                    } catch (IOException unused) {
                    }
                } else {
                    n = nArr[i14];
                    uri = n.a;
                }
                try {
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r", cancellationSignal);
                    int i20 = b;
                    int i21 = i20 & 51;
                    int i22 = (i20 | 51) & (~i21);
                    int i23 = i21 << 1;
                    int i24 = (i22 & i23) + (i22 | i23);
                    int i25 = i24 % 128;
                    a = i25;
                    int i26 = i24 % 2;
                    if (parcelFileDescriptorOpenFileDescriptor == null) {
                        int i27 = ((i25 ^ 47) | (i25 & 47)) << 1;
                        int i28 = -(((~i25) & 47) | (i25 & (-48)));
                        int i29 = ((i27 | i28) << 1) - (i27 ^ i28);
                        b = i29 % 128;
                        int i30 = i29 % 2;
                        if (parcelFileDescriptorOpenFileDescriptor != null) {
                        }
                        int i31 = (i14 ^ (-21)) + ((i14 & (-21)) << 1);
                        int i32 = (i31 ^ (-1)) + (i31 << 1);
                        int i33 = ((i32 ^ 23) | (i32 & 23)) << 1;
                        int i34 = -(((~i32) & 23) | (i32 & (-24)));
                        i14 = (i33 & i34) + (i33 | i34);
                        int i35 = b + 22;
                        int i36 = (i35 ^ (-1)) + (i35 << 1);
                        a = i36 % 128;
                        int i37 = i36 % 2;
                    } else {
                        try {
                            Font.Builder builder2 = new Font.Builder(parcelFileDescriptorOpenFileDescriptor);
                            int i38 = n.c;
                            int i39 = a;
                            int i40 = (((i39 | 73) << 1) - (~(-(i39 ^ 73)))) - 1;
                            b = i40 % 128;
                            if (i40 % 2 == 0) {
                                builder2.setWeight(i38);
                                boolean z = n.d;
                                throw null;
                            }
                            Font.Builder weight = builder2.setWeight(i38);
                            if (n.d) {
                                int i41 = a;
                                int i42 = i41 & 81;
                                int i43 = ((i41 | 81) & (~i42)) + (i42 << 1);
                                b = i43 % 128;
                                if (i43 % 2 == 0) {
                                    int i44 = 4 % 4;
                                }
                                i3 = 1;
                            } else {
                                int i45 = b + 70;
                                int i46 = (i45 ^ (-1)) + (i45 << 1);
                                a = i46 % 128;
                                int i47 = i46 % 2;
                                i3 = 0;
                            }
                            Font.Builder slant = weight.setSlant(i3);
                            int i48 = n.b;
                            int i49 = b;
                            int i50 = ((i49 ^ 7) | (i49 & 7)) << 1;
                            int i51 = -((7 & (~i49)) | (i49 & (-8)));
                            int i52 = ((i50 | i51) << 1) - (i51 ^ i50);
                            a = i52 % 128;
                            int i53 = i52 % 2;
                            Font fontBuild = slant.setTtcIndex(i48).build();
                            int i54 = a + 24;
                            int i55 = (i54 ^ (-1)) + (i54 << 1);
                            b = i55 % 128;
                            if (i55 % 2 == 0) {
                                obj.hashCode();
                                throw null;
                            }
                            if (builder == null) {
                                FontFamily.Builder builder3 = new FontFamily.Builder(fontBuild);
                                int i56 = b + 56;
                                int i57 = (i56 ^ (-1)) + (i56 << 1);
                                a = i57 % 128;
                                if (i57 % 2 != 0) {
                                    int i58 = 2 / 3;
                                }
                                builder = builder3;
                            } else {
                                builder.addFont(fontBuild);
                                int i59 = a + 103;
                                b = i59 % 128;
                                int i60 = i59 % 2;
                            }
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    parcelFileDescriptorOpenFileDescriptor.close();
                    int i61 = b;
                    int i62 = i61 & 77;
                    int i63 = (i61 | 77) & (~i62);
                    int i64 = i62 << 1;
                    int i65 = (i63 & i64) + (i63 | i64);
                    a = i65 % 128;
                    int i66 = i65 % 2;
                } catch (IOException unused2) {
                    continue;
                }
                int i310 = (i14 ^ (-21)) + ((i14 & (-21)) << 1);
                int i311 = (i310 ^ (-1)) + (i310 << 1);
                int i312 = ((i311 ^ 23) | (i311 & 23)) << 1;
                int i313 = -(((~i311) & 23) | (i311 & (-24)));
                i14 = (i312 & i313) + (i312 | i313);
                int i314 = b + 22;
                int i315 = (i314 ^ (-1)) + (i314 << 1);
                a = i315 % 128;
                int i316 = i315 % 2;
            }
            if (builder == null) {
                int i67 = a;
                int i68 = i67 + 113;
                b = i68 % 128;
                if (i68 % 2 == 0) {
                    throw null;
                }
                int i69 = (i67 ^ 77) + ((i67 & 77) << 1);
                b = i69 % 128;
                int i70 = i69 % 2;
                return null;
            }
            if ((i & 1) != 0) {
                int i71 = a + 69;
                b = i71 % 128;
                int i72 = i71 % 2;
                i2 = 700;
            } else {
                int i73 = a;
                int i74 = i73 & 47;
                int i75 = (i73 ^ 47) | i74;
                int i76 = ((i74 | i75) << 1) - (i75 ^ i74);
                b = i76 % 128;
                int i77 = i76 % 2;
                i2 = 400;
            }
            if ((i & 2) != 0) {
                int i78 = a;
                int i79 = (((i78 | 74) << 1) - (i78 ^ 74)) - 1;
                int i80 = i79 % 128;
                b = i80;
                int i81 = i79 % 2;
                int i82 = ((i80 | 113) << 1) - (i80 ^ 113);
                a = i82 % 128;
                int i83 = i82 % 2;
            } else {
                i9 = 0;
            }
            return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle(i2, i9)).build();
        } catch (Exception unused3) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0060  */
    /* JADX WARN: Code duplicated, block: B:26:0x0073  */
    @Override // ivas.gov.bisp.enumeration.p007ag.u
    public Typeface c(Context context, M.aUO auo, Resources resources, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = b;
        int i6 = 1;
        int i7 = ((i5 ^ 26) + ((i5 & 26) << 1)) - 1;
        a = i7 % 128;
        Typeface typefaceBuild = null;
        try {
            if (i7 % 2 != 0) {
                int length = auo.a.length;
                throw null;
            }
            M.aUP[] aupArr = auo.a;
            int length2 = aupArr.length;
            int i8 = a;
            int i9 = (i8 & 71) + (i8 | 71);
            b = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 0;
            FontFamily.Builder builder = null;
            while (i11 < length2) {
                M.aUP aup = aupArr[i11];
                try {
                    try {
                        Font.Builder builder2 = new Font.Builder(resources, aup.e);
                        int i12 = a + 17;
                        b = i12 % 128;
                        int i13 = i12 % 2;
                        Font.Builder weight = builder2.setWeight(aup.b);
                        int i14 = a + 19;
                        b = i14 % 128;
                        if (i14 % 2 == 0) {
                            int i15 = 35 / 0;
                            if (aup.c) {
                                int i16 = b;
                                int i17 = i16 & 49;
                                int i18 = (i17 - (~(-(-((i16 ^ 49) | i17))))) - 1;
                                a = i18 % 128;
                                int i19 = i18 % 2;
                                i3 = 1;
                            } else {
                                int i20 = b;
                                int i21 = (i20 | 79) << 1;
                                int i22 = -(((~i20) & 79) | (i20 & (-80)));
                                int i23 = (i21 & i22) + (i22 | i21);
                                a = i23 % 128;
                                int i24 = i23 % 2;
                                i3 = 0;
                            }
                        } else if (aup.c) {
                            int i110 = b;
                            int i111 = i110 & 49;
                            int i112 = (i111 - (~(-(-((i110 ^ 49) | i111))))) - 1;
                            a = i112 % 128;
                            int i113 = i112 % 2;
                            i3 = 1;
                        } else {
                            int i25 = b;
                            int i26 = (i25 | 79) << 1;
                            int i27 = -(((~i25) & 79) | (i25 & (-80)));
                            int i28 = (i26 & i27) + (i27 | i26);
                            a = i28 % 128;
                            int i29 = i28 % 2;
                            i3 = 0;
                        }
                        Font.Builder slant = weight.setSlant(i3);
                        int i30 = aup.f;
                        int i31 = b;
                        int i32 = ((i31 & 34) + (i31 | 34)) - 1;
                        a = i32 % 128;
                        if (i32 % 2 != 0) {
                            slant.setTtcIndex(i30);
                            String str = aup.d;
                            throw null;
                        }
                        Font fontBuild = slant.setTtcIndex(i30).setFontVariationSettings(aup.d).build();
                        int i33 = a + 83;
                        b = i33 % 128;
                        if (i33 % 2 == 0) {
                            typefaceBuild.hashCode();
                            throw null;
                        }
                        if (builder == null) {
                            FontFamily.Builder builder3 = new FontFamily.Builder(fontBuild);
                            int i34 = b;
                            int i35 = i34 & 121;
                            int i36 = (i34 | 121) & (~i35);
                            int i37 = i35 << 1;
                            int i38 = (i36 & i37) + (i36 | i37);
                            a = i38 % 128;
                            int i39 = i38 % 2;
                            builder = builder3;
                        } else {
                            builder.addFont(fontBuild);
                            int i40 = a + 37;
                            b = i40 % 128;
                            int i41 = i40 % 2;
                        }
                    } catch (IOException unused) {
                        continue;
                    }
                } catch (IOException unused2) {
                }
                i11 = ((i11 | 1) << 1) - (((~i11) & 1) | (i11 & (-2)));
                int i42 = b;
                int i43 = (i42 & 38) + (i42 | 38);
                int i44 = (i43 ^ (-1)) + (i43 << 1);
                a = i44 % 128;
                int i45 = i44 % 2;
            }
            if (builder == null) {
                int i46 = a;
                int i47 = i46 + 33;
                b = i47 % 128;
                int i48 = i47 % 2;
                int i49 = i46 + 19;
                b = i49 % 128;
                int i50 = i49 % 2;
                return null;
            }
            if ((i & 1) != 0) {
                int i51 = a;
                int i52 = i51 & 27;
                int i53 = (i52 - (~((i51 ^ 27) | i52))) - 1;
                b = i53 % 128;
                int i54 = i53 % 2;
                i2 = 700;
            } else {
                int i55 = b;
                int i56 = i55 & 19;
                int i57 = (i56 - (~((i55 ^ 19) | i56))) - 1;
                a = i57 % 128;
                int i58 = i57 % 2;
                i2 = 400;
            }
            if ((i & 2) != 0) {
                int i59 = b;
                int i60 = (i59 & 109) + (i59 | 109);
                a = i60 % 128;
                int i61 = i60 % 2;
                int i62 = (i59 & (-116)) | ((~i59) & 115);
                int i63 = (i59 & 115) << 1;
                int i64 = ((i62 | i63) << 1) - (i63 ^ i62);
                a = i64 % 128;
                int i65 = i64 % 2;
            } else {
                i6 = 0;
            }
            typefaceBuild = new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle(i2, i6)).build();
            int i66 = b + 7;
            a = i66 % 128;
            if (i66 % 2 != 0) {
                int i67 = 54 / 0;
            }
            return typefaceBuild;
        } catch (Exception unused3) {
        }
    }
}
