package ivas.gov.bisp.enumeration.aB;

import ivas.gov.bisp.enumeration.bN.D;
import ivas.gov.bisp.enumeration.bN.X;
import ivas.gov.bisp.enumeration.bO.u;
import ivas.gov.bisp.enumeration.bW.W;
import ivas.gov.bisp.enumeration.bW.y;
import ivas.gov.bisp.enumeration.bX.t;
import java.io.Serializable;
import java.util.List;
import net.sqlcipher.BuildConfig;
import org.acra.ReportField;
import org.acra.data.StringFormat;
import org.acra.file.Directory;

/* JADX INFO: loaded from: classes.dex */
public final class r implements Serializable, j {
    private static int a = 0;
    private static int b = 1;
    public final ivas.gov.bisp.enumeration.p057cc.c A;
    public final List<String> c;
    public final String d;
    public final boolean e;
    public final List<String> f;
    public final List<String> g;
    public final int h;
    public final List<ReportField> i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final List<String> n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List<String> f54o;
    public final Class<?> p;
    public final String q;
    public final Directory r;
    public final int s;
    public final Class<? extends z> t;
    public final StringFormat u;
    public final Class<? extends y> v;
    public final List<String> w;
    public final String x;
    public final String y;
    public final List<j> z;

    /* JADX WARN: Illegal instructions before constructor call */
    public r() {
        Class cls = null;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        byte b5 = 0;
        byte b6 = 0;
        byte b7 = 0;
        byte b8 = 0;
        byte b9 = 0;
        byte b10 = 0;
        byte b11 = 0;
        String str = null;
        boolean z = false;
        List list = null;
        int i = 0;
        List list2 = null;
        List list3 = null;
        boolean z2 = false;
        boolean z3 = false;
        List list4 = null;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        List list5 = null;
        List list6 = null;
        int i2 = a;
        int i3 = i2 ^ 77;
        int i4 = ((((i2 & 77) | i3) << 1) - (~(-i3))) - 1;
        b = i4 % 128;
        boolean z7 = i4 % 2 == 0;
        this(str, z, list, i, list2, list3, z2, z3, list4, z4, z5, z6, list5, list6, cls, b11 == true ? 1 : 0, 0, b10 == true ? 1 : 0, b9 == true ? 1 : 0, z7, b8 == true ? 1 : 0, b7 == true ? 1 : 0, b6 == true ? 1 : 0, b5 == true ? 1 : 0, b4 == true ? 1 : 0, false, b3 == true ? 1 : 0, b2 == true ? 1 : 0, 268435455, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r(String str, boolean z, List<String> list, int i, List<String> list2, List<? extends ReportField> list3, boolean z2, boolean z3, List<String> list4, boolean z4, boolean z5, boolean z6, List<String> list5, List<String> list6, Class<?> cls, String str2, int i2, Directory directory, Class<? extends z> cls2, boolean z7, List<String> list7, Class<? extends y> cls3, String str3, String str4, StringFormat stringFormat, boolean z8, ivas.gov.bisp.enumeration.p057cc.c cVar, List<? extends j> list8) {
        ivas.gov.bisp.enumeration.O.r.n(list, "additionalDropBoxTags");
        ivas.gov.bisp.enumeration.O.r.n(list2, "logcatArguments");
        ivas.gov.bisp.enumeration.O.r.n(list3, "reportContent");
        ivas.gov.bisp.enumeration.O.r.n(list4, "additionalSharedPreferences");
        ivas.gov.bisp.enumeration.O.r.n(list5, "excludeMatchingSharedPreferencesKeys");
        int i3 = a;
        int i4 = (i3 & 121) + (i3 | 121);
        b = i4 % 128;
        if (i4 % 2 == 0) {
            ivas.gov.bisp.enumeration.O.r.n(list6, "excludeMatchingSettingsKeys");
            ivas.gov.bisp.enumeration.O.r.n(str2, "applicationLogFile");
            ivas.gov.bisp.enumeration.O.r.n(directory, "applicationLogFileDir");
            ivas.gov.bisp.enumeration.O.r.n(cls2, "retryPolicyClass");
            throw null;
        }
        ivas.gov.bisp.enumeration.O.r.n(list6, "excludeMatchingSettingsKeys");
        ivas.gov.bisp.enumeration.O.r.n(str2, "applicationLogFile");
        ivas.gov.bisp.enumeration.O.r.n(directory, "applicationLogFileDir");
        ivas.gov.bisp.enumeration.O.r.n(cls2, "retryPolicyClass");
        ivas.gov.bisp.enumeration.O.r.n(list7, "attachmentUris");
        ivas.gov.bisp.enumeration.O.r.n(cls3, "attachmentUriProvider");
        ivas.gov.bisp.enumeration.O.r.n(stringFormat, "reportFormat");
        ivas.gov.bisp.enumeration.O.r.n(cVar, "pluginLoader");
        ivas.gov.bisp.enumeration.O.r.n(list8, "pluginConfigurations");
        this.d = str;
        this.e = z;
        this.f = list;
        this.h = i;
        this.g = list2;
        this.i = list3;
        this.j = z2;
        this.c = list4;
        this.k = z4;
        this.l = z5;
        this.m = z6;
        this.f54o = list5;
        this.n = list6;
        this.p = cls;
        this.q = str2;
        this.s = i2;
        this.r = directory;
        this.t = cls2;
        this.w = list7;
        this.v = cls3;
        this.x = str3;
        this.y = str4;
        this.u = stringFormat;
        this.A = cVar;
        this.z = list8;
    }

    @Override // ivas.gov.bisp.enumeration.aB.j
    public final boolean a() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 77) | (i2 & 77)) << 1;
        int i4 = -((i2 & (-78)) | ((~i2) & 77));
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        int i7 = ((i2 | 76) << 1) - (i2 ^ 76);
        int i8 = (i7 ^ (-1)) + (i7 << 1);
        a = i8 % 128;
        if (i8 % 2 == 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ r(String str, boolean z, List list, int i, List list2, List list3, boolean z2, boolean z3, List list4, boolean z4, boolean z5, boolean z6, List list5, List list6, Class cls, String str2, int i2, Directory directory, Class cls2, boolean z7, List list7, Class cls3, String str3, String str4, StringFormat stringFormat, boolean z8, ivas.gov.bisp.enumeration.p057cc.c cVar, List list8, int i3, u uVar) {
        String str5;
        boolean z9;
        List list9;
        int i4;
        List listQ;
        List listAq;
        boolean z10;
        boolean z11;
        List list10;
        boolean z12;
        boolean z13;
        boolean z14;
        List list11;
        List list12;
        Class cls4;
        String str6;
        int i5;
        int i6;
        Directory directory2;
        Class cls5;
        boolean z15;
        List list13;
        Class cls6;
        String str7;
        String str8;
        StringFormat stringFormat2;
        boolean z16;
        ivas.gov.bisp.enumeration.p057cc.c cVar2;
        List list14;
        X x;
        String[] strArr;
        if ((i3 & 1) != 0) {
            int i7 = a;
            int i8 = i7 & 75;
            int i9 = (i7 | 75) & (~i8);
            int i10 = -(-(i8 << 1));
            int i11 = (i9 ^ i10) + ((i9 & i10) << 1);
            int i12 = i11 % 128;
            b = i12;
            if (i11 % 2 == 0) {
                throw null;
            }
            int i13 = i12 & 21;
            int i14 = (i13 - (~(-(-((i12 ^ 21) | i13))))) - 1;
            a = i14 % 128;
            if (i14 % 2 == 0) {
                int i15 = 2 % 2;
            }
            str5 = null;
        } else {
            str5 = str;
        }
        if ((i3 & 2) != 0) {
            int i16 = a + 21;
            b = i16 % 128;
            int i17 = i16 % 2;
            z9 = false;
        } else {
            z9 = z;
        }
        if ((i3 & 4) != 0) {
            int i18 = b + 63;
            a = i18 % 128;
            int i19 = i18 % 2;
            list9 = X.c;
            int i20 = b;
            int i21 = i20 ^ 17;
            int i22 = (i20 & 17) << 1;
            int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
            a = i23 % 128;
            int i24 = i23 % 2;
            int i25 = 2 % 2;
        } else {
            list9 = list;
        }
        if ((i3 & 8) != 0) {
            int i26 = b + 105;
            a = i26 % 128;
            int i27 = i26 % 2;
            i4 = 5;
        } else {
            i4 = i;
        }
        if ((i3 & 16) != 0) {
            int i28 = b;
            int i29 = ((i28 | 37) << 1) - (((~i28) & 37) | (i28 & (-38)));
            int i30 = i29 % 128;
            a = i30;
            if (i29 % 2 != 0) {
                strArr = new String[4];
                strArr[0] = "-t";
            } else {
                strArr = new String[4];
                strArr[0] = "-t";
            }
            int i31 = (i30 | 23) << 1;
            int i32 = -(i30 ^ 23);
            int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
            b = i33 % 128;
            if (i33 % 2 == 0) {
                strArr[1] = "100";
                strArr[2] = "-v";
                strArr[2] = "time";
                listQ = ivas.gov.bisp.enumeration.p100w.r.Q(strArr);
            } else {
                strArr[1] = "100";
                strArr[2] = "-v";
                strArr[3] = "time";
                listQ = ivas.gov.bisp.enumeration.p100w.r.Q(strArr);
            }
        } else {
            listQ = list2;
        }
        if ((i3 & 32) != 0) {
            int i34 = b + 19;
            a = i34 % 128;
            if (i34 % 2 != 0) {
                D.aq(t.d);
                throw null;
            }
            listAq = D.aq(t.d);
            int i35 = 2 % 2;
        } else {
            listAq = list3;
        }
        if ((i3 & 64) != 0) {
            int i36 = a + 97;
            b = i36 % 128;
            z10 = i36 % 2 != 0;
            int i37 = 2 % 2;
        } else {
            z10 = z2;
        }
        if ((i3 & 128) != 0) {
            int i38 = a;
            int i39 = ((i38 | 85) << 1) - (i38 ^ 85);
            b = i39 % 128;
            int i40 = i39 % 2;
            int i41 = i38 & 21;
            int i42 = -(-((i38 ^ 21) | i41));
            int i43 = ((i41 | i42) << 1) - (i41 ^ i42);
            b = i43 % 128;
            int i44 = i43 % 2;
            int i45 = 2 % 2;
            z11 = false;
        } else {
            z11 = z3;
        }
        if ((i3 & 256) != 0) {
            int i46 = a;
            int i47 = ((i46 | 17) << 1) - (i46 ^ 17);
            b = i47 % 128;
            if (i47 % 2 == 0) {
                list10 = X.c;
                int i48 = 30 / 0;
            } else {
                list10 = X.c;
            }
            int i49 = b;
            int i50 = i49 & 113;
            int i51 = -(-((i49 ^ 113) | i50));
            int i52 = (i50 ^ i51) + ((i50 & i51) << 1);
            a = i52 % 128;
            if (i52 % 2 == 0) {
                int i53 = 2 % 2;
            }
        } else {
            list10 = list4;
        }
        if ((i3 & 512) != 0) {
            int i54 = b;
            int i55 = i54 + 41;
            a = i55 % 128;
            int i56 = i55 % 2;
            int i57 = i54 & 115;
            int i58 = (i54 ^ 115) | i57;
            int i59 = (i57 & i58) + (i57 | i58);
            a = i59 % 128;
            int i60 = i59 % 2;
            int i61 = 2 % 2;
            z12 = true;
        } else {
            z12 = z4;
        }
        if ((i3 & 1024) != 0) {
            int i62 = a;
            int i63 = (i62 ^ 113) + ((i62 & 113) << 1);
            b = i63 % 128;
            int i64 = i63 % 2;
            z13 = false;
        } else {
            z13 = z5;
        }
        if ((i3 & 2048) != 0) {
            int i65 = a;
            int i66 = (i65 ^ 57) + ((i65 & 57) << 1);
            b = i66 % 128;
            int i67 = i66 % 2;
            z14 = true;
        } else {
            z14 = z6;
        }
        if ((i3 & 4096) != 0) {
            int i68 = b;
            int i69 = i68 & 65;
            int i70 = i69 + ((i68 ^ 65) | i69);
            a = i70 % 128;
            int i71 = i70 % 2;
            X x2 = X.c;
            int i72 = a + 89;
            b = i72 % 128;
            if (i72 % 2 == 0) {
                int i73 = 4 / 4;
            } else {
                int i74 = 2 % 2;
            }
            list11 = x2;
        } else {
            list11 = list5;
        }
        if ((i3 & 8192) != 0) {
            int i75 = a;
            int i76 = (((i75 | 70) << 1) - (i75 ^ 70)) - 1;
            b = i76 % 128;
            int i77 = i76 % 2;
            X x3 = X.c;
            int i78 = b + 25;
            a = i78 % 128;
            int i79 = i78 % 2;
            int i80 = 2 % 2;
            list12 = x3;
        } else {
            list12 = list6;
        }
        if ((i3 & 16384) != 0) {
            int i81 = a;
            int i82 = i81 & 89;
            int i83 = (~i82) & (i81 | 89);
            int i84 = i82 << 1;
            int i85 = (i83 ^ i84) + ((i84 & i83) << 1);
            int i86 = i85 % 128;
            b = i86;
            if (i85 % 2 == 0) {
                int i87 = 65 / 0;
            }
            int i88 = ((i86 ^ 73) | (i86 & 73)) << 1;
            int i89 = -((i86 & (-74)) | ((~i86) & 73));
            int i90 = ((i88 | i89) << 1) - (i88 ^ i89);
            a = i90 % 128;
            if (i90 % 2 != 0) {
                int i91 = 4 / 4;
            } else {
                int i92 = 2 % 2;
            }
            cls4 = null;
        } else {
            cls4 = cls;
        }
        if ((32768 & i3) != 0) {
            int i93 = b + 99;
            int i94 = i93 % 128;
            a = i94;
            int i95 = i93 % 2;
            int i96 = i94 | 3;
            int i97 = i96 << 1;
            int i98 = -(i96 & (~(i94 & 3)));
            int i99 = (i97 ^ i98) + ((i97 & i98) << 1);
            b = i99 % 128;
            int i100 = i99 % 2;
            int i101 = 2 % 2;
            str6 = BuildConfig.FLAVOR;
        } else {
            str6 = str2;
        }
        if ((65536 & i3) != 0) {
            int i102 = b;
            int i103 = i102 | 57;
            int i104 = i103 << 1;
            int i105 = -((~(i102 & 57)) & i103);
            int i106 = (i104 & i105) + (i104 | i105);
            a = i106 % 128;
            i5 = i106 % 2 != 0 ? 33 : 100;
            int i107 = 2 % 2;
        } else {
            i5 = i2;
        }
        if ((131072 & i3) != 0) {
            int i108 = a;
            int i109 = (i108 ^ 59) + ((i108 & 59) << 1);
            i6 = i5;
            b = i109 % 128;
            if (i109 % 2 == 0) {
                directory2 = Directory.FILES_LEGACY;
                int i110 = 21 / 0;
            } else {
                directory2 = Directory.FILES_LEGACY;
            }
        } else {
            i6 = i5;
            directory2 = directory;
        }
        if ((262144 & i3) != 0) {
            int i111 = b;
            int i112 = (i111 & 39) + (i111 | 39);
            a = i112 % 128;
            int i113 = i112 % 2;
            int i114 = i111 & 51;
            int i115 = (((~i114) & (i111 | 51)) - (~(-(-(i114 << 1))))) - 1;
            a = i115 % 128;
            int i116 = i115 % 2;
            int i117 = 2 % 2;
            cls5 = e.class;
        } else {
            cls5 = cls2;
        }
        if ((524288 & i3) != 0) {
            int i118 = b;
            int i119 = i118 + 87;
            a = i119 % 128;
            int i120 = i119 % 2;
            int i121 = i118 + 87;
            a = i121 % 128;
            int i122 = i121 % 2;
            int i123 = 2 % 2;
            z15 = false;
        } else {
            z15 = z7;
        }
        if ((1048576 & i3) != 0) {
            int i124 = a;
            int i125 = (i124 & 75) + (i124 | 75);
            b = i125 % 128;
            if (i125 % 2 == 0) {
                x = X.c;
                int i126 = 85 / 0;
            } else {
                x = X.c;
            }
            int i127 = b;
            X x4 = x;
            int i128 = i127 & 1;
            int i129 = ((i127 ^ 1) | i128) << 1;
            int i130 = -((~i128) & (i127 | 1));
            int i131 = (i129 & i130) + (i129 | i130);
            a = i131 % 128;
            if (i131 % 2 == 0) {
                int i132 = 2 % 2;
            }
            list13 = x4;
        } else {
            list13 = list7;
        }
        if ((2097152 & i3) != 0) {
            int i133 = b;
            int i134 = (i133 ^ 103) + ((i133 & 103) << 1);
            int i135 = i134 % 128;
            a = i135;
            int i136 = i134 % 2;
            int i137 = i135 + 93;
            b = i137 % 128;
            if (i137 % 2 != 0) {
                int i138 = 2 % 2;
            }
            cls6 = W.class;
        } else {
            cls6 = cls3;
        }
        if ((4194304 & i3) != 0) {
            int i139 = a;
            int i140 = i139 & 15;
            int i141 = ((~i140) & (i139 | 15)) + (i140 << 1);
            b = i141 % 128;
            if (i141 % 2 == 0) {
                int i142 = 30 / 0;
            }
            str7 = null;
        } else {
            str7 = str3;
        }
        if ((8388608 & i3) != 0) {
            int i143 = b;
            int i144 = (i143 & (-126)) | (125 & (~i143));
            int i145 = -(-((i143 & 125) << 1));
            int i146 = (i144 ^ i145) + ((i144 & i145) << 1);
            a = i146 % 128;
            int i147 = i146 % 2;
            str8 = null;
        } else {
            str8 = str4;
        }
        if ((16777216 & i3) != 0) {
            int i148 = a + 20;
            int i149 = (i148 ^ (-1)) + (i148 << 1);
            b = i149 % 128;
            if (i149 % 2 == 0) {
                StringFormat stringFormat3 = StringFormat.JSON;
                throw null;
            }
            stringFormat2 = StringFormat.JSON;
        } else {
            stringFormat2 = stringFormat;
        }
        if ((33554432 & i3) != 0) {
            int i150 = b;
            int i151 = ((i150 & (-116)) | ((~i150) & 115)) + ((i150 & 115) << 1);
            a = i151 % 128;
            boolean z17 = i151 % 2 == 0;
            int i152 = i150 & 59;
            boolean z18 = z17;
            int i153 = (~i152) & (i150 | 59);
            int i154 = i152 << 1;
            int i155 = (i153 ^ i154) + ((i153 & i154) << 1);
            a = i155 % 128;
            int i156 = i155 % 2;
            int i157 = 2 % 2;
            z16 = z18;
        } else {
            z16 = z8;
        }
        if ((67108864 & i3) != 0) {
            ivas.gov.bisp.enumeration.p057cc.h hVar = new ivas.gov.bisp.enumeration.p057cc.h();
            int i158 = a;
            int i159 = i158 & 37;
            int i160 = i159 + ((i158 ^ 37) | i159);
            b = i160 % 128;
            int i161 = i160 % 2;
            int i162 = 2 % 2;
            cVar2 = hVar;
        } else {
            cVar2 = cVar;
        }
        if ((i3 & 134217728) != 0) {
            int i163 = b;
            int i164 = ((i163 | 5) << 1) - (i163 ^ 5);
            a = i164 % 128;
            int i165 = i164 % 2;
            X x5 = X.c;
            int i166 = a;
            int i167 = i166 & 31;
            int i168 = (i166 ^ 31) | i167;
            int i169 = (i167 ^ i168) + ((i167 & i168) << 1);
            b = i169 % 128;
            if (i169 % 2 == 0) {
                int i170 = 3 / 4;
            } else {
                int i171 = 2 % 2;
            }
            list14 = x5;
        } else {
            list14 = list8;
        }
        int i172 = a;
        int i173 = (i172 ^ 35) + ((i172 & 35) << 1);
        List list15 = list14;
        int i174 = i173 % 128;
        b = i174;
        int i175 = i173 % 2;
        ivas.gov.bisp.enumeration.p057cc.c cVar3 = cVar2;
        int i176 = i174 & 7;
        int i177 = ((i174 ^ 7) | i176) << 1;
        int i178 = -((~i176) & (i174 | 7));
        int i179 = ((i177 | i178) << 1) - (i178 ^ i177);
        a = i179 % 128;
        int i180 = i179 % 2;
        int i181 = i174 | 45;
        int i182 = ((i181 << 1) - (~(-((~(i174 & 45)) & i181)))) - 1;
        a = i182 % 128;
        int i183 = i182 % 2;
        this(str5, z9, list9, i4, listQ, listAq, z10, z11, list10, z12, z13, z14, list11, list12, cls4, str6, i6, directory2, cls5, z15, list13, cls6, str7, str8, stringFormat2, z16, cVar3, list15);
    }
}
