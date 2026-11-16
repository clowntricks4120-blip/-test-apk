package ivas.gov.bisp.enumeration.aD;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'e' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public class aq {
    private static int a = 1;
    private static int b;
    public static final aq c;
    public static final aq d;
    public static final aq e;
    public static final aq f;
    public static final aq g;
    public static final aq h;
    public static final aq i;
    public static final aq j;
    public static final aq k;
    public static final aq l;
    public static final aq m;
    public static final aq n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final aq f57o;
    public static final aq p;
    public static final aq q;
    public static final aq r;
    public static final aq s;
    public static final aq t;
    public static final /* synthetic */ aq[] u;
    public final au v;
    public final int w;

    static {
        aq aqVar = new aq("DOUBLE", 0, au.f, 1);
        d = aqVar;
        aq aqVar2 = new aq("FLOAT", 1, au.g, 5);
        f = aqVar2;
        au auVar = au.e;
        aq aqVar3 = new aq("INT64", 2, auVar, 0);
        e = aqVar3;
        aq aqVar4 = new aq("UINT64", 3, auVar, 0);
        g = aqVar4;
        au auVar2 = au.d;
        aq aqVar5 = new aq("INT32", 4, auVar2, 0);
        h = aqVar5;
        aq aqVar6 = new aq("FIXED64", 5, auVar, 1);
        c = aqVar6;
        aq aqVar7 = new aq("FIXED32", 6, auVar2, 5);
        i = aqVar7;
        aq aqVar8 = new aq("BOOL", 7, au.h, 0);
        j = aqVar8;
        aq aqVar9 = new aq("STRING", 8, au.i, 2) { // from class: ivas.gov.bisp.enumeration.aD.aq.bjZ
        };
        k = aqVar9;
        au auVar3 = au.k;
        aq aqVar10 = new aq("GROUP", 9, auVar3, 3) { // from class: ivas.gov.bisp.enumeration.aD.aq.bka
        };
        m = aqVar10;
        int i2 = 2;
        aq aqVar11 = new aq("MESSAGE", 10, auVar3, i2) { // from class: ivas.gov.bisp.enumeration.aD.aq.bkb
        };
        l = aqVar11;
        aq aqVar12 = new aq("BYTES", 11, au.c, i2) { // from class: ivas.gov.bisp.enumeration.aD.aq.bkc
        };
        n = aqVar12;
        aq aqVar13 = new aq("UINT32", 12, auVar2, 0);
        f57o = aqVar13;
        aq aqVar14 = new aq("ENUM", 13, au.j, 0);
        q = aqVar14;
        aq aqVar15 = new aq("SFIXED32", 14, auVar2, 5);
        p = aqVar15;
        aq aqVar16 = new aq("SFIXED64", 15, auVar, 1);
        r = aqVar16;
        aq aqVar17 = new aq("SINT32", 16, auVar2, 0);
        t = aqVar17;
        aq aqVar18 = new aq("SINT64", 17, auVar, 0);
        s = aqVar18;
        int i3 = b;
        int i4 = ((i3 & (-48)) | ((~i3) & 47)) + ((i3 & 47) << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 & 99;
        int i7 = -(-((i3 ^ 99) | i6));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        int i9 = i8 % 128;
        a = i9;
        int i10 = i8 % 2;
        u = new aq[]{aqVar, aqVar2, aqVar3, aqVar4, aqVar5, aqVar6, aqVar7, aqVar8, aqVar9, aqVar10, aqVar11, aqVar12, aqVar13, aqVar14, aqVar15, aqVar16, aqVar17, aqVar18};
        int i11 = ((i9 ^ 39) | (i9 & 39)) << 1;
        int i12 = -(((~i9) & 39) | (i9 & (-40)));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        b = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    public aq(String str, int i2, au auVar, int i3) {
        super(str, i2);
        this.v = auVar;
        this.w = i3;
    }

    public static aq valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = b + 41;
        a = i3 % 128;
        int i4 = i3 % 2;
        aq aqVar = (aq) Enum.valueOf(aq.class, str);
        if (i4 == 0) {
            int i5 = 1 / 0;
        }
        int i6 = a + 115;
        b = i6 % 128;
        int i7 = i6 % 2;
        return aqVar;
    }

    public static aq[] values() {
        aq[] aqVarArr;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 19;
        int i5 = -(-(i3 | 19));
        int i6 = (i4 & i5) + (i5 | i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        aq[] aqVarArr2 = u;
        if (i7 == 0) {
            aqVarArr = (aq[]) aqVarArr2.clone();
            int i8 = 69 / 0;
        } else {
            aqVarArr = (aq[]) aqVarArr2.clone();
        }
        int i9 = a;
        int i10 = (i9 & (-62)) | ((~i9) & 61);
        int i11 = -(-((i9 & 61) << 1));
        int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
        b = i12 % 128;
        int i13 = i12 % 2;
        return aqVarArr;
    }

    public aq(String str, int i2, au auVar, int i3, ivas.gov.bisp.enumeration.O.i iVar) {
        super(str, i2);
        this.v = auVar;
        this.w = i3;
    }
}
