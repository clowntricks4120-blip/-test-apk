package ivas.gov.bisp.enumeration.p061cg;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import ivas.gov.bisp.enumeration.O.i;
import ivas.gov.bisp.enumeration.aB.e;
import ivas.gov.bisp.enumeration.aB.r;
import ivas.gov.bisp.enumeration.aB.z;
import ivas.gov.bisp.enumeration.bN.D;
import ivas.gov.bisp.enumeration.bO.l;
import ivas.gov.bisp.enumeration.bX.P;
import ivas.gov.bisp.enumeration.o000oo0o.o0OoOoOo;
import ivas.gov.bisp.enumeration.o00O00OO.OooO;
import ivas.gov.bisp.enumeration.p059ce.j;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    private static int a = 0;
    private static int b = 1;
    public final Context c;
    public final r d;
    public final List<r> e;
    public final Bundle f;

    public static final class bzl extends l implements o0OoOoOo<z.bbj, CharSequence> {
        private static int a = 1;
        private static int b;
        public static final bzl c = new bzl();

        static {
            int i = b + 87;
            a = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public bzl() {
            super(1);
        }

        public final Object e(Object obj) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 ^ 53;
            int i4 = ((i2 & 53) | i3) << 1;
            int i5 = -i3;
            int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
            a = i6 % 128;
            Object obj2 = null;
            if (i6 % 2 == 0) {
                z.bbj bbjVar = (z.bbj) obj;
                ivas.gov.bisp.enumeration.O.r.n(bbjVar, "it");
                bbjVar.a.getClass();
                obj2.hashCode();
                throw null;
            }
            z.bbj bbjVar2 = (z.bbj) obj;
            ivas.gov.bisp.enumeration.O.r.n(bbjVar2, "it");
            Class<?> cls = bbjVar2.a.getClass();
            int i7 = a + 75;
            b = i7 % 128;
            if (i7 % 2 == 0) {
                return cls.getName();
            }
            cls.getName();
            throw null;
        }
    }

    public static final class bzm extends l implements o0OoOoOo<z.bbj, CharSequence> {
        private static int a = 1;
        private static int b;
        public static final bzm c = new bzm();

        static {
            int i = b + 105;
            a = i % 128;
            int i2 = i % 2;
        }

        public bzm() {
            super(1);
        }

        public final Object e(Object obj) throws IOException {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 & 39) + (i2 | 39);
            a = i3 % 128;
            int i4 = i3 % 2;
            z.bbj bbjVar = (z.bbj) obj;
            ivas.gov.bisp.enumeration.O.r.n(bbjVar, "it");
            int i5 = b;
            int i6 = i5 ^ 89;
            int i7 = (i5 & 89) << 1;
            int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
            a = i8 % 128;
            int i9 = i8 % 2;
            e eVar = bbjVar.b;
            ivas.gov.bisp.enumeration.O.r.n(eVar, "<this>");
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            int i10 = a + 111;
            b = i10 % 128;
            Object obj2 = null;
            if (i10 % 2 != 0) {
                eVar.printStackTrace(printWriter);
                printWriter.flush();
                obj2.hashCode();
                throw null;
            }
            eVar.printStackTrace(printWriter);
            printWriter.flush();
            int i11 = b + 79;
            a = i11 % 128;
            if (i11 % 2 == 0) {
                ivas.gov.bisp.enumeration.O.r.m(stringWriter.toString(), "sw.toString()");
                obj2.hashCode();
                throw null;
            }
            String string = stringWriter.toString();
            ivas.gov.bisp.enumeration.O.r.m(string, "sw.toString()");
            int i12 = b;
            int i13 = (i12 & 71) + (i12 | 71);
            a = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = 11 / 0;
            }
            return string;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(Context context, r rVar, List<? extends r> list, Bundle bundle) {
        ivas.gov.bisp.enumeration.O.r.n(context, "context");
        ivas.gov.bisp.enumeration.O.r.n(rVar, "config");
        this.c = context;
        this.d = rVar;
        this.e = list;
        this.f = bundle;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0142 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x006a  */
    /* JADX WARN: Code duplicated, block: B:18:0x006c  */
    /* JADX WARN: Code duplicated, block: B:29:0x009d  */
    /* JADX WARN: Code duplicated, block: B:31:0x00af  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:63:0x014d  */
    /* JADX WARN: Code duplicated, block: B:72:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:74:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:77:0x01de  */
    /* JADX WARN: Code duplicated, block: B:79:0x020c  */
    /* JADX WARN: Code duplicated, block: B:81:0x0219  */
    /* JADX WARN: Code duplicated, block: B:84:0x0234  */
    /* JADX WARN: Code duplicated, block: B:85:0x0247  */
    /* JADX WARN: Code duplicated, block: B:88:0x02af  */
    /* JADX WARN: Code duplicated, block: B:91:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:93:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:95:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:97:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:98:0x0300  */
    public final void d(j jVar) throws e {
        boolean z;
        LinkedList linkedList;
        List<r> list;
        int i;
        Iterator<r> it;
        Iterator<r> it2;
        int i2;
        Class<? extends z> cls;
        z eVar;
        ivas.gov.bisp.enumeration.aO.j jVar2;
        int i3;
        String strAr;
        int i4;
        String strAr2;
        String string;
        int i5;
        int i6;
        int i7;
        r next;
        OooO e;
        int i8;
        int i9;
        int i10 = 2 % 2;
        int i11 = a + 43;
        b = i11 % 128;
        try {
            ApplicationInfo applicationInfo = i11 % 2 == 0 ? this.c.getPackageManager().getApplicationInfo(this.c.getPackageName(), 1) : this.c.getPackageManager().getApplicationInfo(this.c.getPackageName(), 0);
            int i12 = a;
            int i13 = i12 & 7;
            int i14 = i13 + ((i12 ^ 7) | i13);
            b = i14 % 128;
            if (i14 % 2 == 0) {
                if ((applicationInfo.flags & 5) > 0) {
                    int i15 = a;
                    int i16 = i15 & 95;
                    int i17 = -(-((i15 ^ 95) | i16));
                    i9 = (i16 ^ i17) + ((i17 & i16) << 1);
                    b = i9 % 128;
                    if (i9 % 2 == 0) {
                        z = true;
                    }
                } else {
                    int i18 = a;
                    int i19 = i18 & 41;
                    int i20 = (i19 - (~(-(-((i18 ^ 41) | i19))))) - 1;
                    b = i20 % 128;
                    int i21 = i20 % 2;
                }
                z = false;
            } else {
                if ((applicationInfo.flags & 2) > 0) {
                    int i110 = a;
                    int i111 = i110 & 95;
                    int i112 = -(-((i110 ^ 95) | i111));
                    i9 = (i111 ^ i112) + ((i112 & i111) << 1);
                    b = i9 % 128;
                    if (i9 % 2 == 0) {
                        z = true;
                    }
                } else {
                    int i113 = a;
                    int i114 = i113 & 41;
                    int i22 = (i114 - (~(-(-((i113 ^ 41) | i114))))) - 1;
                    b = i22 % 128;
                    int i23 = i22 % 2;
                }
                z = false;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        Object obj = null;
        if (!(!z)) {
            int i24 = b;
            int i25 = ((i24 & 82) + (i24 | 82)) - 1;
            a = i25 % 128;
            if (i25 % 2 != 0) {
                boolean z2 = this.d.m;
                throw null;
            }
            if (this.d.m) {
                linkedList = new LinkedList();
                list = this.e;
                i = b + 59;
                a = i % 128;
                if (i % 2 != 0) {
                    it = list.iterator();
                    int i26 = 81 / 0;
                } else {
                    it = list.iterator();
                }
                it2 = it;
                int i27 = b;
                int i28 = i27 ^ 3;
                int i29 = (i27 & 3) << 1;
                int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
                a = i30 % 128;
                int i31 = i30 % 2;
                while (it2.hasNext()) {
                    int i32 = a;
                    int i33 = i32 & 43;
                    int i34 = -(-(i32 | 43));
                    i7 = (i33 ^ i34) + ((i34 & i33) << 1);
                    b = i7 % 128;
                    if (i7 % 2 == 0) {
                        next = it2.next();
                        try {
                            ivas.gov.bisp.enumeration.aO.j jVar3 = P.c;
                            int i35 = 94 / 0;
                        } catch (OooO e2) {
                            e = e2;
                            linkedList.add(new z.bbj(next, e));
                            int i36 = a;
                            i8 = (i36 & 43) + (i36 | 43);
                            b = i8 % 128;
                            if (i8 % 2 != 0) {
                                obj.hashCode();
                                throw null;
                            }
                        }
                    } else {
                        next = it2.next();
                        ivas.gov.bisp.enumeration.aO.j jVar4 = P.c;
                    }
                    Context context = this.c;
                    Bundle bundle = this.f;
                    int i37 = b;
                    int i38 = ((i37 | 45) << 1) - (i37 ^ 45);
                    a = i38 % 128;
                    int i39 = i38 % 2;
                    try {
                        next.b(context, jVar, bundle);
                        int i40 = a + 38;
                        int i41 = (i40 ^ (-1)) + (i40 << 1);
                        b = i41 % 128;
                        int i42 = i41 % 2;
                    } catch (OooO e3) {
                        e = e3;
                        linkedList.add(new z.bbj(next, e));
                        int i310 = a;
                        i8 = (i310 & 43) + (i310 | 43);
                        b = i8 % 128;
                        if (i8 % 2 != 0) {
                            obj.hashCode();
                            throw null;
                        }
                    }
                }
                if (!linkedList.isEmpty()) {
                    int i43 = b;
                    int i44 = i43 & 43;
                    i2 = ((i43 | 43) & (~i44)) + (i44 << 1);
                    a = i2 % 128;
                    if (i2 % 2 != 0) {
                        ivas.gov.bisp.enumeration.aO.j jVar5 = P.c;
                        int i45 = 37 / 0;
                    } else {
                        ivas.gov.bisp.enumeration.aO.j jVar6 = P.c;
                    }
                    int i46 = b;
                    int i47 = ((i46 ^ 35) | (i46 & 35)) << 1;
                    int i48 = -(((~i46) & 35) | (i46 & (-36)));
                    int i49 = (i47 & i48) + (i48 | i47);
                    a = i49 % 128;
                    int i50 = i49 % 2;
                    return;
                }
                cls = this.d.t;
                ivas.gov.bisp.enumeration.O.r.n(cls, "clazz");
                int i51 = b + 75;
                a = i51 % 128;
                int i52 = i51 % 2;
                try {
                    eVar = cls.newInstance();
                    int i53 = a + 105;
                    b = i53 % 128;
                    int i54 = i53 % 2;
                } catch (IllegalAccessException e4) {
                    ivas.gov.bisp.enumeration.aO.j jVar7 = P.c;
                    ivas.gov.bisp.enumeration.aO.j jVar8 = P.c;
                    String name = cls.getName();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to create instance of class ");
                    sb.append(name);
                    ((i) jVar7).w("OooOOO", sb.toString(), e4);
                    int i55 = a + 125;
                    b = i55 % 128;
                    int i56 = i55 % 2;
                    eVar = null;
                } catch (InstantiationException e5) {
                    ivas.gov.bisp.enumeration.aO.j jVar9 = P.c;
                    ivas.gov.bisp.enumeration.aO.j jVar10 = P.c;
                    String name2 = cls.getName();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Failed to create instance of class ");
                    sb2.append(name2);
                    ((i) jVar9).w("OooOOO", sb2.toString(), e5);
                    int i57 = a + 125;
                    b = i57 % 128;
                    int i58 = i57 % 2;
                    eVar = null;
                }
                if (eVar == null) {
                    eVar = new e();
                    int i59 = a;
                    int i60 = i59 ^ 117;
                    int i61 = ((i59 & 117) | i60) << 1;
                    int i62 = -i60;
                    i6 = (i61 ^ i62) + ((i61 & i62) << 1);
                    b = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i63 = 4 % 5;
                    }
                }
                if (!eVar.b(this.e, linkedList)) {
                    throw new e("Policy marked this task as incomplete. ACRA will try to send this report again.", ((z.bbj) linkedList.get(0)).b);
                }
                int i64 = a;
                int i65 = i64 & 21;
                int i66 = (((i64 ^ 21) | i65) << 1) - ((i64 | 21) & (~i65));
                b = i66 % 128;
                int i67 = i66 % 2;
                jVar2 = P.c;
                ivas.gov.bisp.enumeration.aO.j jVar11 = P.c;
                int i68 = b;
                int i69 = i68 & 57;
                i3 = (i69 - (~((i68 ^ 57) | i69))) - 1;
                a = i3 % 128;
                if (i3 % 2 != 0) {
                    strAr = D.ar(linkedList, null, null, null, 0, null, bzl.c, 16);
                } else {
                    strAr = D.ar(linkedList, null, null, null, 0, null, bzl.c, 31);
                }
                String str = strAr;
                int i70 = a;
                i4 = (i70 ^ 75) + ((i70 & 75) << 1);
                b = i4 % 128;
                if (i4 % 2 == 0) {
                    strAr2 = D.ar(linkedList, "\n", null, null, 0, null, bzm.c, 99);
                } else {
                    strAr2 = D.ar(linkedList, "\n", null, null, 0, null, bzm.c, 30);
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("ReportSenders of classes [");
                int i71 = a;
                int i72 = i71 & 111;
                int i73 = (i71 | 111) & (~i72);
                int i74 = -(-(i72 << 1));
                int i75 = (i73 ^ i74) + ((i73 & i74) << 1);
                b = i75 % 128;
                int i76 = i75 % 2;
                sb3.append(str);
                sb3.append("] failed, but Policy marked this task as complete. ACRA will not send this report again.\nSuppressed:\n");
                int i77 = b;
                int i78 = i77 ^ 11;
                int i79 = (((i77 & 11) | i78) << 1) - i78;
                a = i79 % 128;
                int i80 = i79 % 2;
                sb3.append(strAr2);
                string = sb3.toString();
                int i81 = b;
                int i82 = ((i81 ^ 21) | (i81 & 21)) << 1;
                int i83 = -(((~i81) & 21) | (i81 & (-22)));
                i5 = (i82 & i83) + (i83 | i82);
                a = i5 % 128;
                if (i5 % 2 == 0) {
                    ((i) jVar2).x("OooOOO", string);
                    throw null;
                }
                ((i) jVar2).x("OooOOO", string);
                int i84 = a;
                int i85 = i84 ^ 103;
                int i86 = ((((i84 & 103) | i85) << 1) - (~(-i85))) - 1;
                b = i86 % 128;
                int i87 = i86 % 2;
            }
        } else {
            linkedList = new LinkedList();
            list = this.e;
            i = b + 59;
            a = i % 128;
            if (i % 2 != 0) {
                it = list.iterator();
                int i210 = 81 / 0;
            } else {
                it = list.iterator();
            }
            it2 = it;
            int i211 = b;
            int i212 = i211 ^ 3;
            int i213 = (i211 & 3) << 1;
            int i311 = ((i212 | i213) << 1) - (i213 ^ i212);
            a = i311 % 128;
            int i312 = i311 % 2;
            while (it2.hasNext()) {
                int i313 = a;
                int i314 = i313 & 43;
                int i315 = -(-(i313 | 43));
                i7 = (i314 ^ i315) + ((i315 & i314) << 1);
                b = i7 % 128;
                if (i7 % 2 == 0) {
                    next = it2.next();
                    ivas.gov.bisp.enumeration.aO.j jVar12 = P.c;
                    int i316 = 94 / 0;
                } else {
                    next = it2.next();
                    ivas.gov.bisp.enumeration.aO.j jVar13 = P.c;
                }
                Context context2 = this.c;
                Bundle bundle2 = this.f;
                int i317 = b;
                int i318 = ((i317 | 45) << 1) - (i317 ^ 45);
                a = i318 % 128;
                int i319 = i318 % 2;
                next.b(context2, jVar, bundle2);
                int i410 = a + 38;
                int i411 = (i410 ^ (-1)) + (i410 << 1);
                b = i411 % 128;
                int i412 = i411 % 2;
            }
            if (!linkedList.isEmpty()) {
                int i413 = b;
                int i414 = i413 & 43;
                i2 = ((i413 | 43) & (~i414)) + (i414 << 1);
                a = i2 % 128;
                if (i2 % 2 != 0) {
                    ivas.gov.bisp.enumeration.aO.j jVar14 = P.c;
                    int i415 = 37 / 0;
                } else {
                    ivas.gov.bisp.enumeration.aO.j jVar15 = P.c;
                }
                int i416 = b;
                int i417 = ((i416 ^ 35) | (i416 & 35)) << 1;
                int i418 = -(((~i416) & 35) | (i416 & (-36)));
                int i419 = (i417 & i418) + (i418 | i417);
                a = i419 % 128;
                int i510 = i419 % 2;
                return;
            }
            cls = this.d.t;
            ivas.gov.bisp.enumeration.O.r.n(cls, "clazz");
            int i511 = b + 75;
            a = i511 % 128;
            int i512 = i511 % 2;
            eVar = cls.newInstance();
            int i513 = a + 105;
            b = i513 % 128;
            int i514 = i513 % 2;
            if (eVar == null) {
                eVar = new e();
                int i515 = a;
                int i610 = i515 ^ 117;
                int i611 = ((i515 & 117) | i610) << 1;
                int i612 = -i610;
                i6 = (i611 ^ i612) + ((i611 & i612) << 1);
                b = i6 % 128;
                if (i6 % 2 == 0) {
                    int i613 = 4 % 5;
                }
            }
            if (!eVar.b(this.e, linkedList)) {
                throw new e("Policy marked this task as incomplete. ACRA will try to send this report again.", ((z.bbj) linkedList.get(0)).b);
            }
            int i614 = a;
            int i615 = i614 & 21;
            int i616 = (((i614 ^ 21) | i615) << 1) - ((i614 | 21) & (~i615));
            b = i616 % 128;
            int i617 = i616 % 2;
            jVar2 = P.c;
            ivas.gov.bisp.enumeration.aO.j jVar16 = P.c;
            int i618 = b;
            int i619 = i618 & 57;
            i3 = (i619 - (~((i618 ^ 57) | i619))) - 1;
            a = i3 % 128;
            if (i3 % 2 != 0) {
                strAr = D.ar(linkedList, null, null, null, 0, null, bzl.c, 16);
            } else {
                strAr = D.ar(linkedList, null, null, null, 0, null, bzl.c, 31);
            }
            String str2 = strAr;
            int i710 = a;
            i4 = (i710 ^ 75) + ((i710 & 75) << 1);
            b = i4 % 128;
            if (i4 % 2 == 0) {
                strAr2 = D.ar(linkedList, "\n", null, null, 0, null, bzm.c, 99);
            } else {
                strAr2 = D.ar(linkedList, "\n", null, null, 0, null, bzm.c, 30);
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("ReportSenders of classes [");
            int i711 = a;
            int i712 = i711 & 111;
            int i713 = (i711 | 111) & (~i712);
            int i714 = -(-(i712 << 1));
            int i715 = (i713 ^ i714) + ((i713 & i714) << 1);
            b = i715 % 128;
            int i716 = i715 % 2;
            sb4.append(str2);
            sb4.append("] failed, but Policy marked this task as complete. ACRA will not send this report again.\nSuppressed:\n");
            int i717 = b;
            int i718 = i717 ^ 11;
            int i719 = (((i717 & 11) | i718) << 1) - i718;
            a = i719 % 128;
            int i88 = i719 % 2;
            sb4.append(strAr2);
            string = sb4.toString();
            int i89 = b;
            int i810 = ((i89 ^ 21) | (i89 & 21)) << 1;
            int i811 = -(((~i89) & 21) | (i89 & (-22)));
            i5 = (i810 & i811) + (i811 | i810);
            a = i5 % 128;
            if (i5 % 2 == 0) {
                ((i) jVar2).x("OooOOO", string);
                throw null;
            }
            ((i) jVar2).x("OooOOO", string);
            int i812 = a;
            int i813 = i812 ^ 103;
            int i814 = ((((i812 & 103) | i813) << 1) - (~(-i813))) - 1;
            b = i814 % 128;
            int i815 = i814 % 2;
        }
        int i90 = b;
        int i91 = ((i90 | 109) << 1) - (i90 ^ 109);
        a = i91 % 128;
        int i92 = i91 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00df A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x00e1  */
    public final boolean c(File file) throws e {
        int i;
        int i2 = 2 % 2;
        ivas.gov.bisp.enumeration.aO.j jVar = P.c;
        ivas.gov.bisp.enumeration.aO.j jVar2 = P.c;
        StringBuilder sb = new StringBuilder();
        int i3 = a;
        int i4 = (i3 & (-26)) | ((~i3) & 25);
        int i5 = -(-((i3 & 25) << 1));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        b = i6 % 128;
        Object obj = null;
        if (i6 % 2 == 0) {
            sb.append("Sending report ");
            sb.append(file);
            obj.hashCode();
            throw null;
        }
        sb.append("Sending report ");
        sb.append(file);
        ivas.gov.bisp.enumeration.O.r.n(sb.toString(), "msg");
        try {
            j jVar3 = new j(i.r(file, null, 1));
            int i7 = b + 89;
            a = i7 % 128;
            int i8 = i7 % 2;
            d(jVar3);
            ivas.gov.bisp.enumeration.p006af.h.g(file);
            int i9 = a;
            int i10 = (i9 & 27) + (i9 | 27);
            b = i10 % 128;
            int i11 = i10 % 2;
            return true;
        } catch (IOException e) {
            ivas.gov.bisp.enumeration.aO.j jVar4 = P.c;
            ivas.gov.bisp.enumeration.aO.j jVar5 = P.c;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to send crash reports for ");
            sb2.append(file);
            ((i) jVar4).w("OooOOO", sb2.toString(), e);
            ivas.gov.bisp.enumeration.p006af.h.g(file);
            int i12 = a;
            i = (i12 & 67) + (i12 | 67);
            b = i % 128;
            if (i % 2 != 0) {
                return false;
            }
            obj.hashCode();
            throw null;
        } catch (RuntimeException e2) {
            ivas.gov.bisp.enumeration.aO.j jVar6 = P.c;
            ivas.gov.bisp.enumeration.aO.j jVar7 = P.c;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Failed to send crash reports for ");
            sb3.append(file);
            ((i) jVar6).w("OooOOO", sb3.toString(), e2);
            ivas.gov.bisp.enumeration.p006af.h.g(file);
            int i13 = a;
            i = (i13 & 67) + (i13 | 67);
            b = i % 128;
            if (i % 2 != 0) {
                return false;
            }
            obj.hashCode();
            throw null;
        } catch (OooO e3) {
            ivas.gov.bisp.enumeration.aO.j jVar8 = P.c;
            ivas.gov.bisp.enumeration.aO.j jVar9 = P.c;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Failed to send crash reports for ");
            sb4.append(file);
            ((i) jVar8).w("OooOOO", sb4.toString(), e3);
            int i14 = a;
            i = (i14 & 67) + (i14 | 67);
            b = i % 128;
            if (i % 2 != 0) {
                return false;
            }
            obj.hashCode();
            throw null;
        } catch (JSONException e4) {
            ivas.gov.bisp.enumeration.aO.j jVar10 = P.c;
            ivas.gov.bisp.enumeration.aO.j jVar11 = P.c;
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Failed to send crash reports for ");
            sb5.append(file);
            ((i) jVar10).w("OooOOO", sb5.toString(), e4);
            ivas.gov.bisp.enumeration.p006af.h.g(file);
            int i15 = a;
            i = (i15 & 67) + (i15 | 67);
            b = i % 128;
            if (i % 2 != 0) {
                return false;
            }
            obj.hashCode();
            throw null;
        }
    }
}
