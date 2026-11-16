package ivas.gov.bisp.enumeration.p007ag;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import ivas.gov.bisp.enumeration.p001aa.t;
import ivas.gov.bisp.enumeration.p002ab.M;
import ivas.gov.bisp.enumeration.p009ai.N;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.ag.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0088p extends u {
    private static int a = 1;
    private static int b;
    public static final Class<?> d;
    public static final Constructor<?> e;
    public static final Method f;
    public static final Method g;

    static {
        Method method;
        Class<?> cls;
        Method method2;
        Constructor<?> constructor;
        Class<?>[] clsArr;
        Constructor<?> constructor2 = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Class<?>[] clsArr2 = new Class[0];
            int i = a;
            int i2 = i & 63;
            int i3 = (i ^ 63) | i2;
            int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
            b = i4 % 128;
            if (i4 % 2 != 0) {
                constructor = cls.getConstructor(clsArr2);
                clsArr = new Class[2];
                clsArr[1] = ByteBuffer.class;
            } else {
                constructor = cls.getConstructor(clsArr2);
                clsArr = new Class[5];
                clsArr[0] = ByteBuffer.class;
            }
            Class<?> cls2 = Integer.TYPE;
            clsArr[1] = cls2;
            clsArr[2] = List.class;
            int i5 = b;
            int i6 = i5 & 61;
            int i7 = (i5 ^ 61) | i6;
            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
            a = i8 % 128;
            int i9 = i8 % 2;
            clsArr[3] = cls2;
            clsArr[4] = Boolean.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", clsArr);
            int i10 = b;
            int i11 = i10 & 53;
            int i12 = (i10 | 53) & (~i11);
            int i13 = -(-(i11 << 1));
            int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
            a = i14 % 128;
            int i15 = i14 % 2;
            Object objNewInstance = Array.newInstance(cls, 1);
            Class[] clsArr3 = new Class[1];
            int i16 = a;
            int i17 = (((i16 | 10) << 1) - (i16 ^ 10)) - 1;
            b = i17 % 128;
            int i18 = i17 % 2;
            clsArr3[0] = objNewInstance.getClass();
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", clsArr3);
            int i19 = b;
            int i20 = i19 & 45;
            int i21 = i20 + ((i19 ^ 45) | i20);
            a = i21 % 128;
            if (i21 % 2 == 0) {
                constructor2.hashCode();
                throw null;
            }
            int i22 = ((i19 ^ 34) + ((i19 & 34) << 1)) - 1;
            a = i22 % 128;
            if (i22 % 2 != 0) {
                int i23 = 2 % 2;
            }
            constructor2 = constructor;
            e = constructor2;
            d = cls;
            f = method2;
            int i24 = b;
            int i25 = i24 & 59;
            int i26 = (~i25) & (i24 | 59);
            int i27 = i25 << 1;
            int i28 = (i26 & i27) + (i27 | i26);
            a = i28 % 128;
            int i29 = i28 % 2;
            g = method;
            int i30 = (i24 | 7) << 1;
            int i31 = -(((~i24) & 7) | (i24 & (-8)));
            int i32 = (i30 ^ i31) + ((i30 & i31) << 1);
            a = i32 % 128;
            int i33 = i32 % 2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi24Impl", e2.getClass().getName(), e2);
            int i34 = b;
            int i35 = (i34 & (-94)) | ((~i34) & 93);
            int i36 = (i34 & 93) << 1;
            int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
            int i38 = i37 % 128;
            a = i38;
            if (i37 % 2 == 0) {
                int i39 = 74 / 0;
            }
            int i40 = i38 & 33;
            int i41 = ((i38 ^ 33) | i40) << 1;
            int i42 = -((i38 | 33) & (~i40));
            int i43 = ((i41 | i42) << 1) - (i41 ^ i42);
            b = i43 % 128;
            int i44 = i43 % 2;
            int i45 = 2 % 2;
            method = null;
            cls = null;
            method2 = null;
        }
    }

    public static Typeface i(Object obj) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 35;
        int i4 = (i2 ^ 35) | i3;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        try {
            Object objNewInstance = i5 % 2 == 0 ? Array.newInstance(d, 0) : Array.newInstance(d, 1);
            Array.set(objNewInstance, 0, obj);
            Method method = g;
            Object[] objArr = new Object[1];
            int i6 = b;
            int i7 = (-2) - ((((i6 | 110) << 1) - (i6 ^ 110)) ^ (-1));
            a = i7 % 128;
            if (i7 % 2 != 0) {
                objArr[0] = objNewInstance;
                return (Typeface) method.invoke(null, objArr);
            }
            objArr[0] = objNewInstance;
            int i8 = 90 / 0;
            return (Typeface) method.invoke(null, objArr);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean h(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        Method method;
        Object[] objArr;
        boolean zBooleanValue;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = ((((i4 ^ 79) | (i4 & 79)) << 1) - (~(-((i4 & (-80)) | ((~i4) & 79))))) - 1;
        b = i5 % 128;
        try {
            if (i5 % 2 != 0) {
                method = f;
                objArr = new Object[2];
                objArr[0] = byteBuffer;
            } else {
                method = f;
                objArr = new Object[5];
                objArr[0] = byteBuffer;
            }
            int i6 = i4 & 63;
            int i7 = (((i4 ^ 63) | i6) << 1) - ((i4 | 63) & (~i6));
            b = i7 % 128;
            if (i7 % 2 != 0) {
                objArr[0] = Integer.valueOf(i);
                objArr[4] = null;
            } else {
                objArr[1] = Integer.valueOf(i);
                objArr[2] = null;
            }
            int i8 = a;
            int i9 = i8 & 77;
            int i10 = ((i8 | 77) & (~i9)) + (i9 << 1);
            b = i10 % 128;
            int i11 = i10 % 2;
            objArr[3] = Integer.valueOf(i2);
            objArr[4] = Boolean.valueOf(z);
            int i12 = a;
            int i13 = ((i12 & (-42)) | ((~i12) & 41)) + ((i12 & 41) << 1);
            b = i13 % 128;
            if (i13 % 2 != 0) {
                zBooleanValue = ((Boolean) method.invoke(obj, objArr)).booleanValue();
                int i14 = 66 / 0;
            } else {
                zBooleanValue = ((Boolean) method.invoke(obj, objArr)).booleanValue();
            }
            int i15 = a;
            int i16 = i15 & 125;
            int i17 = -(-((i15 ^ 125) | i16));
            int i18 = (i16 & i17) + (i17 | i16);
            b = i18 % 128;
            int i19 = i18 % 2;
            return zBooleanValue;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p007ag.u
    public Typeface d(Context context, CancellationSignal cancellationSignal, N[] nArr, int i) {
        Object objNewInstance;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 | 83;
        int i5 = (i4 << 1) - ((~(i3 & 83)) & i4);
        a = i5 % 128;
        int i6 = i5 % 2;
        int i7 = 0;
        Object obj = null;
        try {
            objNewInstance = e.newInstance(new Object[0]);
            int i8 = b + 85;
            a = i8 % 128;
            int i9 = i8 % 2;
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance == null) {
            int i10 = b;
            int i11 = (-2) - ((((i10 | 66) << 1) - (i10 ^ 66)) ^ (-1));
            a = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 90 / 0;
            }
            int i13 = (i10 & 7) + (i10 | 7);
            a = i13 % 128;
            int i14 = i13 % 2;
            return null;
        }
        t tVar = new t();
        int length = nArr.length;
        int i15 = a;
        int i16 = i15 & 69;
        int i17 = i15 | 69;
        int i18 = (i16 & i17) + (i17 | i16);
        b = i18 % 128;
        int i19 = i18 % 2;
        while (i7 < length) {
            int i20 = b;
            int i21 = i20 & 27;
            int i22 = i21 + ((i20 ^ 27) | i21);
            a = i22 % 128;
            int i23 = i22 % 2;
            N n = nArr[i7];
            Uri uri = n.a;
            int i24 = b;
            int i25 = ((i24 ^ 45) - (~((i24 & 45) << 1))) - 1;
            a = i25 % 128;
            int i26 = i25 % 2;
            ByteBuffer byteBufferE = (ByteBuffer) tVar.get(uri);
            int i27 = b;
            int i28 = i27 ^ 53;
            int i29 = (((i27 & 53) | i28) << 1) - i28;
            a = i29 % 128;
            if (i29 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (byteBufferE == null) {
                byteBufferE = l.e(context, cancellationSignal, uri);
                int i30 = b + 17;
                a = i30 % 128;
                int i31 = i30 % 2;
                tVar.put(uri, byteBufferE);
                int i32 = a + 55;
                b = i32 % 128;
                int i33 = i32 % 2;
            }
            if (byteBufferE == null) {
                int i34 = a;
                int i35 = i34 & 73;
                int i36 = -(-((i34 ^ 73) | i35));
                int i37 = ((i35 | i36) << 1) - (i35 ^ i36);
                b = i37 % 128;
                int i38 = i37 % 2;
                int i39 = (i34 & (-112)) | ((~i34) & 111);
                int i40 = -(-((i34 & 111) << 1));
                int i41 = ((i39 | i40) << 1) - (i40 ^ i39);
                b = i41 % 128;
                if (i41 % 2 == 0) {
                    return null;
                }
                throw null;
            }
            int i42 = n.b;
            int i43 = n.c;
            int i44 = b;
            int i45 = i44 ^ 103;
            int i46 = ((((i44 & 103) | i45) << 1) - (~(-i45))) - 1;
            a = i46 % 128;
            int i47 = i46 % 2;
            boolean z = n.d;
            int i48 = b;
            int i49 = i48 & 121;
            int i50 = (i48 | 121) & (~i49);
            int i51 = i49 << 1;
            int i52 = ((i50 | i51) << 1) - (i50 ^ i51);
            a = i52 % 128;
            int i53 = i52 % 2;
            if (!h(objNewInstance, byteBufferE, i42, i43, z)) {
                int i54 = b + 75;
                a = i54 % 128;
                if (i54 % 2 != 0) {
                    return null;
                }
                throw null;
            }
            int i55 = i7 & 3;
            int i56 = i7 | 3;
            int i57 = (i55 ^ i56) + ((i56 & i55) << 1);
            int i58 = i57 & (-2);
            i7 = (i58 - (~((i57 ^ (-2)) | i58))) - 1;
            int i59 = a + 67;
            b = i59 % 128;
            int i60 = i59 % 2;
        }
        Typeface typefaceI = i(objNewInstance);
        if (typefaceI != null) {
            Typeface typefaceCreate = Typeface.create(typefaceI, i);
            int i61 = b;
            int i62 = ((i61 | 110) << 1) - (i61 ^ 110);
            int i63 = (i62 ^ (-1)) + (i62 << 1);
            a = i63 % 128;
            int i64 = i63 % 2;
            return typefaceCreate;
        }
        int i65 = a;
        int i66 = i65 & 47;
        int i67 = i66 + ((i65 ^ 47) | i66);
        b = i67 % 128;
        if (i67 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i68 = (i65 & (-96)) | ((~i65) & 95);
        int i69 = -(-((i65 & 95) << 1));
        int i70 = (i68 ^ i69) + ((i69 & i68) << 1);
        b = i70 % 128;
        int i71 = i70 % 2;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x016a  */
    /* JADX WARN: Code duplicated, block: B:58:0x016e  */
    /* JADX WARN: Code duplicated, block: B:60:0x019a  */
    /* JADX WARN: Code duplicated, block: B:64:0x01b4 A[LOOP:0: B:12:0x0061->B:64:0x01b4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:85:0x0151 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x01c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x01a0 A[SYNTHETIC] */
    @Override // ivas.gov.bisp.enumeration.p007ag.u
    public Typeface c(Context context, M.aUO auo, Resources resources, int i) {
        Object obj;
        MappedByteBuffer map;
        int i2;
        int i3;
        int i4;
        boolean z;
        int i5;
        int i6 = 2 % 2;
        int i7 = b;
        int i8 = (((i7 | 48) << 1) - (i7 ^ 48)) - 1;
        a = i8 % 128;
        Object obj2 = null;
        try {
            Object objNewInstance = i8 % 2 == 0 ? e.newInstance(new Object[0]) : e.newInstance(new Object[0]);
            int i9 = b;
            int i10 = ((i9 & 88) + (i9 | 88)) - 1;
            a = i10 % 128;
            int i11 = i10 % 2;
            obj = objNewInstance;
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            int i12 = a;
            int i13 = (i12 & 19) + (i12 | 19);
            int i14 = i13 % 128;
            b = i14;
            int i15 = i13 % 2;
            int i16 = (-2) - ((i14 + 6) ^ (-1));
            a = i16 % 128;
            int i17 = i16 % 2;
            return null;
        }
        M.aUP[] aupArr = auo.a;
        int length = aupArr.length;
        int i18 = b + 55;
        a = i18 % 128;
        int i19 = i18 % 2;
        int i20 = 0;
        while (i20 < length) {
            int i21 = b;
            int i22 = i21 & 7;
            int i23 = ((i21 ^ 7) | i22) << 1;
            int i24 = -((i21 | 7) & (~i22));
            int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
            a = i25 % 128;
            if (i25 % 2 == 0) {
                int i26 = aupArr[i20].e;
                obj2.hashCode();
                throw null;
            }
            M.aUP aup = aupArr[i20];
            int i27 = aup.e;
            File fileD = l.d(context);
            if (fileD != null) {
                int i28 = b;
                int i29 = i28 ^ 15;
                int i30 = ((((i28 & 15) | i29) << 1) - (~(-i29))) - 1;
                a = i30 % 128;
                int i31 = i30 % 2;
                try {
                    if (!(!l.b(fileD, resources, i27))) {
                        try {
                            FileInputStream fileInputStream = new FileInputStream(fileD);
                            int i32 = a + 13;
                            b = i32 % 128;
                            int i33 = i32 % 2;
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                long size = channel.size();
                                FileChannel.MapMode mapMode = FileChannel.MapMode.READ_ONLY;
                                int i34 = a;
                                int i35 = i34 & 13;
                                int i36 = -(-((i34 ^ 13) | i35));
                                int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
                                b = i37 % 128;
                                map = i37 % 2 != 0 ? channel.map(mapMode, 0L, size) : channel.map(mapMode, 0L, size);
                                fileInputStream.close();
                                int i38 = b;
                                int i39 = ((i38 & (-54)) | ((~i38) & 53)) + ((i38 & 53) << 1);
                                a = i39 % 128;
                                int i40 = i39 % 2;
                                fileD.delete();
                                int i41 = b;
                                int i42 = i41 & 49;
                                int i43 = -(-((i41 ^ 49) | i42));
                                int i44 = (i42 & i43) + (i43 | i42);
                                a = i44 % 128;
                                int i45 = i44 % 2;
                            } catch (Throwable th) {
                                try {
                                    fileInputStream.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (IOException unused2) {
                            map = null;
                        }
                    } else {
                        int i46 = a;
                        int i47 = (((i46 | 61) << 1) - (~(-(i46 ^ 61)))) - 1;
                        b = i47 % 128;
                        int i48 = i47 % 2;
                        fileD.delete();
                        int i49 = b;
                        int i50 = (i49 ^ 51) + ((i49 & 51) << 1);
                        a = i50 % 128;
                        int i51 = i50 % 2;
                    }
                    if (map == null) {
                        int i52 = b;
                        int i53 = i52 & 103;
                        int i54 = ((i52 ^ 103) | i53) << 1;
                        int i55 = -((i52 | 103) & (~i53));
                        i2 = (i54 ^ i55) + ((i55 & i54) << 1);
                        a = i2 % 128;
                        if (i2 % 2 == 0) {
                            int i56 = 78 / 0;
                        }
                        return null;
                    }
                    i3 = aup.f;
                    i4 = aup.b;
                    int i57 = a;
                    int i58 = i57 & 57;
                    int i59 = i58 + ((i57 ^ 57) | i58);
                    b = i59 % 128;
                    int i60 = i59 % 2;
                    z = aup.c;
                    int i61 = b;
                    int i62 = i61 & 17;
                    int i63 = ((i61 ^ 17) | i62) << 1;
                    int i64 = -((i61 | 17) & (~i62));
                    i5 = ((i63 | i64) << 1) - (i64 ^ i63);
                    a = i5 % 128;
                    if (i5 % 2 != 0) {
                        h(obj, map, i3, i4, z);
                        throw null;
                    }
                    if (!h(obj, map, i3, i4, z)) {
                        int i65 = b;
                        int i66 = (i65 & 87) + (i65 | 87);
                        a = i66 % 128;
                        int i67 = i66 % 2;
                        int i68 = i65 + 79;
                        a = i68 % 128;
                        int i69 = i68 % 2;
                        return null;
                    }
                    i20++;
                    int i70 = a;
                    int i71 = (i70 & 125) + (i70 | 125);
                    b = i71 % 128;
                    int i72 = i71 % 2;
                } catch (Throwable th3) {
                    fileD.delete();
                    throw th3;
                }
            }
            int i73 = a;
            int i74 = (i73 & 71) + (i73 | 71);
            b = i74 % 128;
            if (i74 % 2 != 0) {
                int i75 = 5 % 2;
            }
            map = null;
            if (map == null) {
                int i510 = b;
                int i511 = i510 & 103;
                int i512 = ((i510 ^ 103) | i511) << 1;
                int i513 = -((i510 | 103) & (~i511));
                i2 = (i512 ^ i513) + ((i513 & i512) << 1);
                a = i2 % 128;
                if (i2 % 2 == 0) {
                    int i514 = 78 / 0;
                }
                return null;
            }
            i3 = aup.f;
            i4 = aup.b;
            int i515 = a;
            int i516 = i515 & 57;
            int i517 = i516 + ((i515 ^ 57) | i516);
            b = i517 % 128;
            int i610 = i517 % 2;
            z = aup.c;
            int i611 = b;
            int i612 = i611 & 17;
            int i613 = ((i611 ^ 17) | i612) << 1;
            int i614 = -((i611 | 17) & (~i612));
            i5 = ((i613 | i614) << 1) - (i614 ^ i613);
            a = i5 % 128;
            if (i5 % 2 != 0) {
                h(obj, map, i3, i4, z);
                throw null;
            }
            if (!h(obj, map, i3, i4, z)) {
                int i615 = b;
                int i616 = (i615 & 87) + (i615 | 87);
                a = i616 % 128;
                int i617 = i616 % 2;
                int i618 = i615 + 79;
                a = i618 % 128;
                int i619 = i618 % 2;
                return null;
            }
            i20++;
            int i76 = a;
            int i77 = (i76 & 125) + (i76 | 125);
            b = i77 % 128;
            int i78 = i77 % 2;
        }
        Typeface typefaceI = i(obj);
        int i79 = b;
        int i80 = i79 & 75;
        int i81 = (i79 ^ 75) | i80;
        int i82 = (i80 & i81) + (i81 | i80);
        a = i82 % 128;
        if (i82 % 2 != 0) {
            return typefaceI;
        }
        throw null;
    }
}
