package ivas.gov.bisp.enumeration.p035bh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public abstract class ab {
    private static int a = 0;
    private static int b = 1;
    public static final ab c;
    public static final /* synthetic */ ab[] d;

    public final enum boh extends ab {
        public boh(String str, int i) {
            super(str, i, null);
        }
    }

    static {
        ab[] abVarArr;
        boh bohVar = new boh("DEFAULT", 0);
        c = bohVar;
        ab abVar = new ab("STRING", 1) { // from class: ivas.gov.bisp.enumeration.bh.ab.boi
        };
        int i = a;
        int i2 = i ^ 63;
        int i3 = (i & 63) << 1;
        int i4 = (i2 & i3) + (i3 | i2);
        int i5 = i4 % 128;
        b = i5;
        if (i4 % 2 == 0) {
            abVarArr = new ab[2];
            abVarArr[1] = bohVar;
        } else {
            abVarArr = new ab[2];
            abVarArr[0] = bohVar;
        }
        abVarArr[1] = abVar;
        d = abVarArr;
        int i6 = i5 & 25;
        int i7 = (((~i6) & (i5 | 25)) - (~(i6 << 1))) - 1;
        a = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 67 / 0;
        }
    }

    public ab(String str, int i, boh bohVar) {
        super(str, i);
    }

    public static ab valueOf(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 121;
        int i4 = -(-((i2 ^ 121) | i3));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        ab abVar = (ab) Enum.valueOf(ab.class, str);
        if (i6 != 0) {
            int i7 = 11 / 0;
        }
        int i8 = b;
        int i9 = i8 & 43;
        int i10 = i9 + ((i8 ^ 43) | i9);
        a = i10 % 128;
        int i11 = i10 % 2;
        return abVar;
    }

    public static ab[] values() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 120) + ((i2 & 120) << 1)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        ab[] abVarArr = (ab[]) d.clone();
        int i5 = b;
        int i6 = (i5 | 99) << 1;
        int i7 = -(((~i5) & 99) | (i5 & (-100)));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        a = i8 % 128;
        int i9 = i8 % 2;
        return abVarArr;
    }
}
