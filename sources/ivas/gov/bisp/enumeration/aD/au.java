package ivas.gov.bisp.enumeration.aD;

import net.sqlcipher.BuildConfig;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class au {
    private static int a = 0;
    private static int b = 1;
    public static final au c;
    public static final au d;
    public static final au e;
    public static final au f;
    public static final au g;
    public static final au h;
    public static final au i;
    public static final au j;
    public static final au k;
    public static final /* synthetic */ au[] l;
    public final Object m;

    static {
        char c2;
        au auVar = new au("INT", 0, 0);
        d = auVar;
        au auVar2 = new au("LONG", 1, 0L);
        e = auVar2;
        au auVar3 = new au("FLOAT", 2, Float.valueOf(0.0f));
        g = auVar3;
        au auVar4 = new au("DOUBLE", 3, Double.valueOf(0.0d));
        f = auVar4;
        au auVar5 = new au("BOOLEAN", 4, Boolean.FALSE);
        h = auVar5;
        au auVar6 = new au("STRING", 5, BuildConfig.FLAVOR);
        i = auVar6;
        au auVar7 = new au("BYTE_STRING", 6, AbstractC0069z.c);
        c = auVar7;
        au auVar8 = new au("ENUM", 7, null);
        j = auVar8;
        au auVar9 = new au("MESSAGE", 8, null);
        k = auVar9;
        au[] auVarArr = new au[9];
        int i2 = a;
        int i3 = ((i2 | 123) << 1) - (i2 ^ 123);
        int i4 = i3 % 128;
        b = i4;
        if (i3 % 2 == 0) {
            auVarArr[1] = auVar;
            auVarArr[0] = auVar2;
            auVarArr[3] = auVar3;
            auVarArr[3] = auVar4;
            auVarArr[4] = auVar5;
            c2 = 4;
        } else {
            auVarArr[0] = auVar;
            auVarArr[1] = auVar2;
            auVarArr[2] = auVar3;
            auVarArr[3] = auVar4;
            auVarArr[4] = auVar5;
            c2 = 5;
        }
        int i5 = (((i4 ^ 1) | (i4 & 1)) << 1) - ((i4 & (-2)) | ((~i4) & 1));
        int i6 = i5 % 128;
        a = i6;
        int i7 = i5 % 2;
        auVarArr[c2] = auVar6;
        auVarArr[6] = auVar7;
        auVarArr[7] = auVar8;
        auVarArr[8] = auVar9;
        l = auVarArr;
        int i8 = (-2) - ((i6 + 38) ^ (-1));
        b = i8 % 128;
        if (i8 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public au(String str, int i2, Object obj) {
        super(str, i2);
        this.m = obj;
    }

    public static au valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = (-2) - ((a + 114) ^ (-1));
        b = i3 % 128;
        int i4 = i3 % 2;
        au auVar = (au) Enum.valueOf(au.class, str);
        if (i4 == 0) {
            int i5 = 91 / 0;
        }
        int i6 = b;
        int i7 = i6 ^ 23;
        int i8 = -(-((i6 & 23) << 1));
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        a = i9 % 128;
        int i10 = i9 % 2;
        return auVar;
    }

    public static au[] values() {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 9;
        int i5 = i3 | 9;
        int i6 = (i4 & i5) + (i5 | i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        au[] auVarArr = (au[]) l.clone();
        int i8 = b;
        int i9 = i8 & 33;
        int i10 = (i8 | 33) & (~i9);
        int i11 = -(-(i9 << 1));
        int i12 = (i10 & i11) + (i10 | i11);
        a = i12 % 128;
        int i13 = i12 % 2;
        return auVarArr;
    }
}
