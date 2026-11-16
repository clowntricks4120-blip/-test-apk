package ivas.gov.bisp.enumeration.cP;

/* JADX INFO: loaded from: classes.dex */
public class M extends IllegalArgumentException {
    private static int a = 0;
    private static int b = 1;
    public String c;

    public M(AbstractC0246t abstractC0246t, Number number, Number number2, Number number3) {
        super(f(abstractC0246t.z, number, number2, number3, null));
        this.c = super.getMessage();
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 121) + ((i2 & 121) << 1);
        a = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.c;
        int i4 = i2 & 31;
        int i5 = -(-(i2 | 31));
        int i6 = (i4 & i5) + (i5 | i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public static String f(String str, Number number, Number number2, Number number3, String str2) {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append("Value ");
        int i2 = a;
        int i3 = i2 & 113;
        int i4 = (i2 | 113) & (~i3);
        int i5 = i3 << 1;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        sb.append(number);
        sb.append(" for ");
        int i8 = a;
        int i9 = (i8 & 33) + (i8 | 33);
        b = i9 % 128;
        int i10 = i9 % 2;
        sb.append(str);
        sb.append(' ');
        int i11 = b;
        int i12 = i11 & 69;
        int i13 = ((~i12) & (i11 | 69)) + (i12 << 1);
        int i14 = i13 % 128;
        a = i14;
        Object obj = null;
        if (i13 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (number2 == null) {
            if (number3 == null) {
                int i15 = ((i11 ^ 55) | (i11 & 55)) << 1;
                int i16 = -(((~i11) & 55) | (i11 & (-56)));
                int i17 = (i15 & i16) + (i16 | i15);
                a = i17 % 128;
                int i18 = i17 % 2;
                sb.append("is not supported");
                int i19 = b;
                int i20 = i19 & 75;
                int i21 = (i20 - (~((i19 ^ 75) | i20))) - 1;
                a = i21 % 128;
                int i22 = i21 % 2;
            } else {
                sb.append("must not be larger than ");
                int i23 = b;
                int i24 = ((i23 | 45) << 1) - (i23 ^ 45);
                a = i24 % 128;
                int i25 = i24 % 2;
                sb.append(number3);
                int i26 = b + 37;
                a = i26 % 128;
                int i27 = i26 % 2;
            }
        } else if (number3 == null) {
            int i28 = i14 & 125;
            int i29 = (i28 - (~(-(-((i14 ^ 125) | i28))))) - 1;
            b = i29 % 128;
            int i30 = i29 % 2;
            sb.append("must not be smaller than ");
            sb.append(number2);
            int i31 = a;
            int i32 = ((i31 | 55) << 1) - (i31 ^ 55);
            int i33 = i32 % 128;
            b = i33;
            int i34 = i32 % 2;
            int i35 = i33 & 7;
            int i36 = i35 + ((i33 ^ 7) | i35);
            a = i36 % 128;
            int i37 = i36 % 2;
        } else {
            sb.append("must be in the range [");
            sb.append(number2);
            int i38 = a;
            int i39 = ((i38 & 47) - (~(i38 | 47))) - 1;
            b = i39 % 128;
            int i40 = i39 % 2;
            sb.append(',');
            int i41 = b;
            int i42 = i41 ^ 21;
            int i43 = ((i41 & 21) | i42) << 1;
            int i44 = -i42;
            int i45 = (i43 & i44) + (i43 | i44);
            a = i45 % 128;
            int i46 = i45 % 2;
            sb.append(number3);
            sb.append(']');
            int i47 = b;
            int i48 = i47 & 71;
            int i49 = ((i47 ^ 71) | i48) << 1;
            int i50 = -((i47 | 71) & (~i48));
            int i51 = (i49 & i50) + (i50 | i49);
            a = i51 % 128;
            int i52 = i51 % 2;
        }
        if (str2 != null) {
            int i53 = a;
            int i54 = ((i53 | 77) << 1) - (i53 ^ 77);
            b = i54 % 128;
            int i55 = i54 % 2;
            sb.append(": ");
            sb.append(str2);
            int i56 = a + 9;
            int i57 = i56 % 128;
            b = i57;
            if (i56 % 2 == 0) {
                throw null;
            }
            int i58 = i57 & 53;
            int i59 = (i57 | 53) & (~i58);
            int i60 = -(-(i58 << 1));
            int i61 = ((i59 | i60) << 1) - (i60 ^ i59);
            a = i61 % 128;
            int i62 = i61 % 2;
        }
        String string = sb.toString();
        int i63 = b;
        int i64 = i63 & 33;
        int i65 = ((i63 ^ 33) | i64) << 1;
        int i66 = -((i63 | 33) & (~i64));
        int i67 = (i65 & i66) + (i66 | i65);
        a = i67 % 128;
        int i68 = i67 % 2;
        return string;
    }

    public M(AbstractC0246t abstractC0246t, Number number, Number number2, Number number3, String str) {
        super(f(abstractC0246t.z, number, number2, number3, str));
        this.c = super.getMessage();
    }

    public M(AbstractC0246t abstractC0246t, Number number, String str) {
        super(f(abstractC0246t.z, number, null, null, str));
        this.c = super.getMessage();
    }

    public M(AbstractC0246t abstractC0246t, String str) {
        String str2 = abstractC0246t.z;
        StringBuffer stringBuffer = new StringBuffer();
        int i = a;
        int i2 = i & 105;
        int i3 = (i2 - (~((i ^ 105) | i2))) - 1;
        b = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            stringBuffer.append("Value ");
            obj.hashCode();
            throw null;
        }
        stringBuffer.append("Value ");
        if (str == null) {
            stringBuffer.append("null");
            int i4 = b;
            int i5 = i4 & 27;
            int i6 = (i5 - (~(-(-((i4 ^ 27) | i5))))) - 1;
            a = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
        } else {
            stringBuffer.append('\"');
            stringBuffer.append(str);
            int i9 = b;
            int i10 = i9 & 71;
            int i11 = (((i9 | 71) & (~i10)) - (~(i10 << 1))) - 1;
            a = i11 % 128;
            if (i11 % 2 != 0) {
                stringBuffer.append('\"');
                int i12 = 70 / 0;
            } else {
                stringBuffer.append('\"');
            }
            int i13 = 2 % 2;
        }
        stringBuffer.append(" for ");
        stringBuffer.append(str2);
        int i14 = b;
        int i15 = i14 & 123;
        int i16 = (i15 - (~((i14 ^ 123) | i15))) - 1;
        a = i16 % 128;
        if (i16 % 2 != 0) {
            stringBuffer.append(' ');
            stringBuffer.append("is not supported");
            stringBuffer.toString();
            throw null;
        }
        stringBuffer.append(' ');
        stringBuffer.append("is not supported");
        super(stringBuffer.toString());
        this.c = super.getMessage();
    }
}
