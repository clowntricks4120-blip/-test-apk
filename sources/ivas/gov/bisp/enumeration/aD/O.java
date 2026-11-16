package ivas.gov.bisp.enumeration.aD;

import java.util.Objects;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF7' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class O {
    private static int a = 0;
    private static int b = 1;
    public static final O c;
    public static final O[] d;
    public static final O e;
    public static final /* synthetic */ O[] f;
    public final int g;
    public final int h;

    /* JADX INFO: Fake field, exist only in values array */
    O EF7;

    static {
        A a2 = A.h;
        O o2 = new O("DOUBLE", 0, 0, 1, a2);
        A a3 = A.g;
        O o3 = new O("FLOAT", 1, 1, 1, a3);
        A a4 = A.e;
        O o4 = new O("INT64", 2, 2, 1, a4);
        O o5 = new O("UINT64", 3, 3, 1, a4);
        A a5 = A.f;
        O o6 = new O("INT32", 4, 4, 1, a5);
        O o7 = new O("FIXED64", 5, 5, 1, a4);
        O o8 = new O("FIXED32", 6, 6, 1, a5);
        A a6 = A.c;
        O o9 = new O("BOOL", 7, 7, 1, a6);
        A a7 = A.i;
        O o10 = new O("STRING", 8, 8, 1, a7);
        A a8 = A.m;
        O o11 = new O("MESSAGE", 9, 9, 1, a8);
        A a9 = A.j;
        O o12 = new O("BYTES", 10, 10, 1, a9);
        O o13 = new O("UINT32", 11, 11, 1, a5);
        A a10 = A.k;
        O o14 = new O("ENUM", 12, 12, 1, a10);
        O o15 = new O("SFIXED32", 13, 13, 1, a5);
        O o16 = new O("SFIXED64", 14, 14, 1, a4);
        O o17 = new O("SINT32", 15, 15, 1, a5);
        O o18 = new O("SINT64", 16, 16, 1, a4);
        O o19 = new O("GROUP", 17, 17, 1, a8);
        O o20 = new O("DOUBLE_LIST", 18, 18, 2, a2);
        O o21 = new O("FLOAT_LIST", 19, 19, 2, a3);
        O o22 = new O("INT64_LIST", 20, 20, 2, a4);
        O o23 = new O("UINT64_LIST", 21, 21, 2, a4);
        O o24 = new O("INT32_LIST", 22, 22, 2, a5);
        O o25 = new O("FIXED64_LIST", 23, 23, 2, a4);
        O o26 = new O("FIXED32_LIST", 24, 24, 2, a5);
        O o27 = new O("BOOL_LIST", 25, 25, 2, a6);
        O o28 = new O("STRING_LIST", 26, 26, 2, a7);
        O o29 = new O("MESSAGE_LIST", 27, 27, 2, a8);
        O o30 = new O("BYTES_LIST", 28, 28, 2, a9);
        O o31 = new O("UINT32_LIST", 29, 29, 2, a5);
        O o32 = new O("ENUM_LIST", 30, 30, 2, a10);
        O o33 = new O("SFIXED32_LIST", 31, 31, 2, a5);
        O o34 = new O("SFIXED64_LIST", 32, 32, 2, a4);
        O o35 = new O("SINT32_LIST", 33, 33, 2, a5);
        O o36 = new O("SINT64_LIST", 34, 34, 2, a4);
        O o37 = new O("DOUBLE_LIST_PACKED", 35, 35, 3, a2);
        c = o37;
        O o38 = new O("FLOAT_LIST_PACKED", 36, 36, 3, a3);
        O o39 = new O("INT64_LIST_PACKED", 37, 37, 3, a4);
        O o40 = new O("UINT64_LIST_PACKED", 38, 38, 3, a4);
        O o41 = new O("INT32_LIST_PACKED", 39, 39, 3, a5);
        O o42 = new O("FIXED64_LIST_PACKED", 40, 40, 3, a4);
        O o43 = new O("FIXED32_LIST_PACKED", 41, 41, 3, a5);
        O o44 = new O("BOOL_LIST_PACKED", 42, 42, 3, a6);
        O o45 = new O("UINT32_LIST_PACKED", 43, 43, 3, a5);
        O o46 = new O("ENUM_LIST_PACKED", 44, 44, 3, a10);
        O o47 = new O("SFIXED32_LIST_PACKED", 45, 45, 3, a5);
        O o48 = new O("SFIXED64_LIST_PACKED", 46, 46, 3, a4);
        O o49 = new O("SINT32_LIST_PACKED", 47, 47, 3, a5);
        O o50 = new O("SINT64_LIST_PACKED", 48, 48, 3, a4);
        e = o50;
        O o51 = new O("GROUP_LIST", 49, 49, 2, a8);
        O o52 = new O("MAP", 50, 50, 4, A.d);
        int i = 0;
        int i2 = b;
        int i3 = (i2 & (-26)) | ((~i2) & 25);
        int i4 = (i2 & 25) << 1;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        int i6 = i5 % 128;
        a = i6;
        int i7 = i5 % 2;
        int i8 = (i6 & 21) + (i6 | 21);
        b = i8 % 128;
        int i9 = i8 % 2;
        f = new O[]{o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o31, o32, o33, o34, o35, o36, o37, o38, o39, o40, o41, o42, o43, o44, o45, o46, o47, o48, o49, o50, o51, o52};
        O[] oArrValues = values();
        d = new O[oArrValues.length];
        int length = oArrValues.length;
        int i10 = b;
        int i11 = i10 & 53;
        int i12 = (i10 | 53) & (~i11);
        int i13 = -(-(i11 << 1));
        int i14 = (i12 & i13) + (i12 | i13);
        a = i14 % 128;
        if (i14 % 2 == 0) {
            int i15 = 2 % 2;
        }
        while (i < length) {
            int i16 = b;
            int i17 = (i16 & (-118)) | ((~i16) & 117);
            int i18 = (i16 & 117) << 1;
            int i19 = (i17 & i18) + (i17 | i18);
            a = i19 % 128;
            if (i19 % 2 != 0) {
                O o53 = oArrValues[i];
                d[o53.g] = o53;
                i = (i ^ 43) + ((i & 43) << 1);
            } else {
                O o54 = oArrValues[i];
                d[o54.g] = o54;
                int i20 = i ^ 108;
                int i21 = ((i & 108) | i20) << 1;
                int i22 = -i20;
                int i23 = ((i21 | i22) << 1) - (i21 ^ i22);
                i = ((i23 & 106) | ((~i23) & (-107))) + ((i23 & (-107)) << 1);
            }
            int i24 = i16 & 95;
            int i25 = -(-(i16 | 95));
            int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
            a = i26 % 128;
            int i27 = i26 % 2;
            int i28 = 2 % 2;
        }
        int i29 = b;
        int i30 = i29 & 21;
        int i31 = (i29 | 21) & (~i30);
        int i32 = i30 << 1;
        int i33 = (i31 ^ i32) + ((i31 & i32) << 1);
        a = i33 % 128;
        int i34 = i33 % 2;
    }

    public O(String str, int i, int i2, int i3, A a2) {
        super(str, i);
        this.g = i2;
        this.h = i3;
        if (i3 == 0) {
            throw null;
        }
        int i4 = i3 - 1;
        if (i4 != 1) {
            int i5 = b;
            int i6 = (i5 ^ 111) + ((i5 & 111) << 1);
            a = i6 % 128;
            int i7 = i6 % 2;
            if (i4 == 3) {
                int i8 = (((i5 | 40) << 1) - (i5 ^ 40)) - 1;
                a = i8 % 128;
                int i9 = i8 % 2;
                Objects.requireNonNull(a2);
                int i10 = a;
                int i11 = i10 ^ 101;
                int i12 = ((i10 & 101) | i11) << 1;
                int i13 = -i11;
                int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
                b = i14 % 128;
                int i15 = i14 % 2;
                return;
            }
        } else {
            Objects.requireNonNull(a2);
            int i16 = b;
            int i17 = i16 ^ 1;
            int i18 = (((i16 & 1) | i17) << 1) - i17;
            a = i18 % 128;
            if (i18 % 2 != 0) {
                int i19 = 2 / 4;
            } else {
                int i20 = 2 % 2;
            }
        }
        int i21 = a;
        int i22 = (((i21 ^ 59) | (i21 & 59)) << 1) - (((~i21) & 59) | (i21 & (-60)));
        b = i22 % 128;
        int i23 = i22 % 2;
    }

    public static O valueOf(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 93;
        int i4 = (((i2 | 93) & (~i3)) - (~(-(-(i3 << 1))))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        O o2 = (O) Enum.valueOf(O.class, str);
        int i6 = b;
        int i7 = i6 & 61;
        int i8 = (i7 - (~((i6 ^ 61) | i7))) - 1;
        a = i8 % 128;
        if (i8 % 2 == 0) {
            return o2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static O[] values() {
        int i = 2 % 2;
        int i2 = (-2) - ((a + 60) ^ (-1));
        b = i2 % 128;
        int i3 = i2 % 2;
        O[] oArr = (O[]) f.clone();
        int i4 = a;
        int i5 = i4 & 73;
        int i6 = (i4 | 73) & (~i5);
        int i7 = -(-(i5 << 1));
        int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
        b = i8 % 128;
        int i9 = i8 % 2;
        return oArr;
    }
}
