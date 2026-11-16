package ivas.gov.bisp.enumeration.aD;

import ivas.gov.bisp.enumeration.o000O000.o0OO00O;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aD.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0068y {
    private static int a = 0;
    private static int b = 1;
    public static final AbstractC0068y c = new bjt(null);
    public static final AbstractC0068y d;

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aD.y$bjt */
    public static final class bjt extends AbstractC0068y {
        private static int a = 0;
        private static int b = 1;
        public static final Class<?> e = Collections.unmodifiableList(Collections.emptyList()).getClass();

        static {
            int i = b;
            int i2 = (i & (-8)) | ((~i) & 7);
            int i3 = -(-((i & 7) << 1));
            int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
            a = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }

        public bjt(bjs bjsVar) {
            super(null);
        }

        @Override // ivas.gov.bisp.enumeration.aD.AbstractC0068y
        public final <L> List<L> e(Object obj, long j) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & (-92)) | ((~i2) & 91);
            int i4 = -(-((i2 & 91) << 1));
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            b = i5 % 128;
            return f(obj, j, i5 % 2 == 0 ? 103 : 10);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x007a, code lost:
        
            if ((r1 instanceof ivas.gov.bisp.enumeration.aD.R.biN) != false) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x007f, code lost:
        
            if ((r1 instanceof ivas.gov.bisp.enumeration.aD.R.biN) != true) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0082, code lost:
        
            r1 = (ivas.gov.bisp.enumeration.aD.R.biN) r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0088, code lost:
        
            if (r1.o() == false) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x008a, code lost:
        
            r8 = ivas.gov.bisp.enumeration.aD.AbstractC0068y.bjt.a;
            r9 = ((r8 | 17) << 1) - (r8 ^ 17);
            ivas.gov.bisp.enumeration.aD.AbstractC0068y.bjt.b = r9 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0097, code lost:
        
            if ((r9 % 2) == 0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0099, code lost:
        
            r1.c();
            r8 = ivas.gov.bisp.enumeration.aD.AbstractC0068y.bjt.b;
            r9 = ((r8 | 3) << 1) - (r8 ^ 3);
            ivas.gov.bisp.enumeration.aD.AbstractC0068y.bjt.a = r9 % 128;
            r9 = r9 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00aa, code lost:
        
            r1.c();
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00ad, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00ae, code lost:
        
            r8 = ivas.gov.bisp.enumeration.aD.AbstractC0068y.bjt.a;
            r9 = ((r8 ^ 1) | (r8 & 1)) << 1;
            r8 = -(((~r8) & 1) | (r8 & (-2)));
            r10 = ((r9 | r8) << 1) - (r8 ^ r9);
            ivas.gov.bisp.enumeration.aD.AbstractC0068y.bjt.b = r10 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00c6, code lost:
        
            if ((r10 % 2) == 0) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00c8, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00c9, code lost:
        
            throw null;
         */
        @Override // ivas.gov.bisp.enumeration.aD.AbstractC0068y
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void c(java.lang.Object r8, long r9) {
            /*
                Method dump skipped, instruction units count: 245
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.aD.AbstractC0068y.bjt.c(java.lang.Object, long):void");
        }

        @Override // ivas.gov.bisp.enumeration.aD.AbstractC0068y
        public final <E> void d(Object obj, Object obj2, long j) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 & 101) + (i2 | 101);
            a = i3 % 128;
            Object obj3 = null;
            if (i3 % 2 != 0) {
                ((List) ar.o(obj2, j)).size();
                obj3.hashCode();
                throw null;
            }
            List list = (List) ar.o(obj2, j);
            int size = list.size();
            int i4 = b;
            int i5 = i4 & 83;
            int i6 = (i4 | 83) & (~i5);
            int i7 = -(-(i5 << 1));
            int i8 = (i6 & i7) + (i6 | i7);
            a = i8 % 128;
            int i9 = i8 % 2;
            List listF = f(obj, j, size);
            int size2 = listF.size();
            int i10 = a;
            int i11 = i10 & 83;
            int i12 = i11 + ((i10 ^ 83) | i11);
            b = i12 % 128;
            int i13 = i12 % 2;
            int size3 = list.size();
            if (size2 > 0) {
                int i14 = b;
                int i15 = (i14 & 107) + (i14 | 107);
                a = i15 % 128;
                if (i15 % 2 != 0) {
                    throw null;
                }
                if (size3 > 0) {
                    listF.addAll(list);
                    int i16 = b;
                    int i17 = ((i16 & 19) - (~(-(-(i16 | 19))))) - 1;
                    a = i17 % 128;
                    int i18 = i17 % 2;
                }
            }
            if (size2 > 0) {
                int i19 = b;
                int i20 = i19 & 43;
                int i21 = -(-(i19 | 43));
                int i22 = (i20 & i21) + (i20 | i21);
                a = i22 % 128;
                if (i22 % 2 != 0) {
                    throw null;
                }
                int i23 = (((i19 & (-60)) | ((~i19) & 59)) - (~(-(-((i19 & 59) << 1))))) - 1;
                a = i23 % 128;
                int i24 = i23 % 2;
                list = listF;
            }
            ar.h.s(obj, j, list);
            int i25 = a + 37;
            b = i25 % 128;
            int i26 = i25 % 2;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0038  */
        /* JADX WARN: Code duplicated, block: B:12:0x004f  */
        /* JADX WARN: Code duplicated, block: B:15:0x0054  */
        /* JADX WARN: Code duplicated, block: B:17:0x005f  */
        /* JADX WARN: Code duplicated, block: B:19:0x0063  */
        /* JADX WARN: Code duplicated, block: B:20:0x008d  */
        /* JADX WARN: Code duplicated, block: B:23:0x00bb  */
        /* JADX WARN: Code duplicated, block: B:25:0x00be A[PHI: r2
  0x00be: PHI (r2v6 java.util.List<L>) = (r2v5 java.util.List<L>), (r2v41 java.util.List<L>) binds: [B:8:0x0032, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:27:0x00ca  */
        /* JADX WARN: Code duplicated, block: B:29:0x0108  */
        /* JADX WARN: Code duplicated, block: B:31:0x0119  */
        /* JADX WARN: Code duplicated, block: B:33:0x011d  */
        /* JADX WARN: Code duplicated, block: B:35:0x0124  */
        /* JADX WARN: Code duplicated, block: B:37:0x0128  */
        /* JADX WARN: Code duplicated, block: B:39:0x014f  */
        /* JADX WARN: Code duplicated, block: B:40:0x015a  */
        /* JADX WARN: Code duplicated, block: B:43:0x0187  */
        /* JADX WARN: Code duplicated, block: B:45:0x0198  */
        /* JADX WARN: Code duplicated, block: B:47:0x019c  */
        /* JADX WARN: Code duplicated, block: B:49:0x01b2  */
        /* JADX WARN: Code duplicated, block: B:51:0x01c1  */
        /* JADX WARN: Code duplicated, block: B:53:0x01ca  */
        /* JADX WARN: Code duplicated, block: B:55:0x01f5  */
        /* JADX WARN: Code duplicated, block: B:56:0x01ff  */
        /* JADX WARN: Code duplicated, block: B:58:0x0212  */
        /* JADX WARN: Code duplicated, block: B:60:0x0218  */
        /* JADX WARN: Code duplicated, block: B:9:0x0034 A[PHI: r2
  0x0034: PHI (r2v27 java.util.List<L>) = (r2v5 java.util.List<L>), (r2v41 java.util.List<L>) binds: [B:8:0x0032, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public static <L> List<L> f(Object obj, long j, int i) {
            List<L> list;
            int i2;
            int i3;
            R.biN bin2;
            R.biN binG;
            int i4;
            C c;
            int i5;
            ao aoVar;
            int size;
            int i6;
            List<L> list2;
            int i7;
            ArrayList arrayList;
            ar.bkn bknVar;
            int i8;
            int i9;
            List<L> list3;
            List<L> list4;
            int i10;
            int i11;
            List<L> list5;
            int i12 = 2 % 2;
            int i13 = b;
            int i14 = ((i13 ^ 102) + ((i13 & 102) << 1)) - 1;
            a = i14 % 128;
            Object obj2 = null;
            if (i14 % 2 != 0) {
                list = (List) ar.o(obj, j);
                int i15 = 89 / 0;
                if (!list.isEmpty()) {
                    if (e.isAssignableFrom(list.getClass())) {
                        int size2 = list.size();
                        int i16 = -(-i);
                        int i17 = size2 & i16;
                        arrayList = new ArrayList(i17 + ((i16 ^ size2) | i17));
                        int i18 = b;
                        int i19 = ((((i18 ^ 75) | (i18 & 75)) << 1) - (~(-(((~i18) & 75) | (i18 & (-76)))))) - 1;
                        a = i19 % 128;
                        int i20 = i19 % 2;
                        arrayList.addAll(list);
                        bknVar = ar.h;
                        int i21 = a;
                        int i22 = i21 & 19;
                        i8 = ((i21 | 19) & (~i22)) + (i22 << 1);
                        b = i8 % 128;
                        if (i8 % 2 != 0) {
                            bknVar.s(obj, j, arrayList);
                            obj2.hashCode();
                            throw null;
                        }
                        bknVar.s(obj, j, arrayList);
                        int i23 = a;
                        i9 = (i23 & 3) + (i23 | 3);
                        b = i9 % 128;
                        if (i9 % 2 == 0) {
                            int i24 = 3 % 4;
                        }
                        list2 = arrayList;
                    } else if (list instanceof ao) {
                        int size3 = list.size();
                        int i25 = size3 & i;
                        c = new C(i25 + ((i ^ size3) | i25));
                        int i26 = a;
                        i5 = ((((i26 ^ 55) | (i26 & 55)) << 1) - (~(-(((~i26) & 55) | (i26 & (-56)))))) - 1;
                        b = i5 % 128;
                        if (i5 % 2 == 0) {
                            aoVar = (ao) list;
                            size = c.size();
                            int i27 = 80 / 0;
                        } else {
                            aoVar = (ao) list;
                            size = c.size();
                        }
                        c.addAll(size, aoVar);
                        ar.bkn bknVar2 = ar.h;
                        int i28 = b;
                        int i29 = i28 & 91;
                        int i30 = (i28 ^ 91) | i29;
                        int i31 = (i29 ^ i30) + ((i30 & i29) << 1);
                        a = i31 % 128;
                        int i32 = i31 % 2;
                        bknVar2.s(obj, j, c);
                        int i33 = b;
                        i6 = (i33 & 87) + (i33 | 87);
                        a = i6 % 128;
                        list2 = c;
                        if (i6 % 2 != 0) {
                            int i34 = 5 / 2;
                            list2 = c;
                        }
                    } else if (list instanceof af) {
                        i2 = a;
                        int i35 = i2 & 107;
                        int i36 = (~i35) & (i2 | 107);
                        int i37 = i35 << 1;
                        int i38 = (i36 & i37) + (i37 | i36);
                        b = i38 % 128;
                        int i39 = i38 % 2;
                        if (list instanceof R.biN) {
                            int i40 = i2 & 73;
                            i3 = (i40 - (~((i2 ^ 73) | i40))) - 1;
                            b = i3 % 128;
                            if (i3 % 2 != 0) {
                                ((R.biN) list).o();
                                throw null;
                            }
                            bin2 = (R.biN) list;
                            if (bin2.o()) {
                                list3 = list;
                            } else {
                                int size4 = list.size();
                                int i41 = size4 & i;
                                int i42 = -(-(i | size4));
                                binG = bin2.g((i41 & i42) + (i42 | i41));
                                int i43 = b;
                                int i44 = (i43 & (-22)) | ((~i43) & 21);
                                int i45 = -(-((i43 & 21) << 1));
                                i4 = ((i44 | i45) << 1) - (i45 ^ i44);
                                a = i4 % 128;
                                if (i4 % 2 != 0) {
                                    ar.h.s(obj, j, binG);
                                    int i46 = 27 / 0;
                                } else {
                                    ar.h.s(obj, j, binG);
                                }
                                int i47 = a;
                                int i48 = i47 & 83;
                                int i49 = i48 + ((i47 ^ 83) | i48);
                                b = i49 % 128;
                                int i50 = i49 % 2;
                                list3 = binG;
                            }
                        } else {
                            list3 = list;
                        }
                    } else {
                        list3 = list;
                    }
                    int i51 = b;
                    int i52 = i51 ^ 45;
                    int i53 = -(-((i51 & 45) << 1));
                    i7 = (i52 & i53) + (i53 | i52);
                    list4 = list2;
                } else {
                    if (list instanceof InterfaceC0062s) {
                        C c2 = new C(i);
                        int i54 = b;
                        int i55 = i54 ^ 29;
                        int i56 = ((((i54 & 29) | i55) << 1) - (~(-i55))) - 1;
                        a = i56 % 128;
                        int i57 = i56 % 2;
                        list5 = c2;
                    } else if (!(list instanceof af)) {
                        ArrayList arrayList2 = new ArrayList(i);
                        int i58 = b;
                        int i59 = (i58 | 67) << 1;
                        int i60 = -(i58 ^ 67);
                        int i61 = (i59 ^ i60) + ((i60 & i59) << 1);
                        a = i61 % 128;
                        int i62 = i61 % 2;
                        list5 = arrayList2;
                    } else {
                        i10 = a + 67;
                        i11 = i10 % 128;
                        b = i11;
                        if (i10 % 2 != 0) {
                            boolean z = list instanceof R.biN;
                            throw null;
                        }
                        if (list instanceof R.biN) {
                            int i63 = ((i11 & (-92)) | ((~i11) & 91)) + ((i11 & 91) << 1);
                            a = i63 % 128;
                            int i64 = i63 % 2;
                            R.biN binG2 = ((R.biN) list).g(i);
                            int i65 = b;
                            int i66 = i65 + 45;
                            a = i66 % 128;
                            int i67 = i66 % 2;
                            int i68 = i65 & 123;
                            int i69 = i68 + ((i65 ^ 123) | i68);
                            a = i69 % 128;
                            int i70 = i69 % 2;
                            list5 = binG2;
                        } else {
                            ArrayList arrayList3 = new ArrayList(i);
                            int i510 = b;
                            int i511 = (i510 | 67) << 1;
                            int i610 = -(i510 ^ 67);
                            int i611 = (i511 ^ i610) + ((i610 & i511) << 1);
                            a = i611 % 128;
                            int i612 = i611 % 2;
                            list5 = arrayList3;
                        }
                    }
                    ar.h.s(obj, j, list5);
                    int i71 = b;
                    int i72 = i71 & 17;
                    int i73 = i71 | 17;
                    i7 = ((i72 | i73) << 1) - (i73 ^ i72);
                    list4 = list5;
                }
                a = i7 % 128;
                int i74 = i7 % 2;
                list3 = list4;
            } else {
                list = (List) ar.o(obj, j);
                if (list.isEmpty()) {
                    if (list instanceof InterfaceC0062s) {
                        C c3 = new C(i);
                        int i512 = b;
                        int i513 = i512 ^ 29;
                        int i514 = ((((i512 & 29) | i513) << 1) - (~(-i513))) - 1;
                        a = i514 % 128;
                        int i515 = i514 % 2;
                        list5 = c3;
                    } else if (!(list instanceof af)) {
                        ArrayList arrayList4 = new ArrayList(i);
                        int i516 = b;
                        int i517 = (i516 | 67) << 1;
                        int i613 = -(i516 ^ 67);
                        int i614 = (i517 ^ i613) + ((i613 & i517) << 1);
                        a = i614 % 128;
                        int i615 = i614 % 2;
                        list5 = arrayList4;
                    } else {
                        i10 = a + 67;
                        i11 = i10 % 128;
                        b = i11;
                        if (i10 % 2 != 0) {
                            boolean z2 = list instanceof R.biN;
                            throw null;
                        }
                        if (list instanceof R.biN) {
                            int i616 = ((i11 & (-92)) | ((~i11) & 91)) + ((i11 & 91) << 1);
                            a = i616 % 128;
                            int i617 = i616 % 2;
                            R.biN binG3 = ((R.biN) list).g(i);
                            int i618 = b;
                            int i619 = i618 + 45;
                            a = i619 % 128;
                            int i620 = i619 % 2;
                            int i621 = i618 & 123;
                            int i622 = i621 + ((i618 ^ 123) | i621);
                            a = i622 % 128;
                            int i75 = i622 % 2;
                            list5 = binG3;
                        } else {
                            ArrayList arrayList5 = new ArrayList(i);
                            int i518 = b;
                            int i519 = (i518 | 67) << 1;
                            int i6110 = -(i518 ^ 67);
                            int i6111 = (i519 ^ i6110) + ((i6110 & i519) << 1);
                            a = i6111 % 128;
                            int i6112 = i6111 % 2;
                            list5 = arrayList5;
                        }
                    }
                    ar.h.s(obj, j, list5);
                    int i76 = b;
                    int i77 = i76 & 17;
                    int i78 = i76 | 17;
                    i7 = ((i77 | i78) << 1) - (i78 ^ i77);
                    list4 = list5;
                } else {
                    if (e.isAssignableFrom(list.getClass())) {
                        int size5 = list.size();
                        int i110 = -(-i);
                        int i111 = size5 & i110;
                        arrayList = new ArrayList(i111 + ((i110 ^ size5) | i111));
                        int i112 = b;
                        int i113 = ((((i112 ^ 75) | (i112 & 75)) << 1) - (~(-(((~i112) & 75) | (i112 & (-76)))))) - 1;
                        a = i113 % 128;
                        int i210 = i113 % 2;
                        arrayList.addAll(list);
                        bknVar = ar.h;
                        int i211 = a;
                        int i212 = i211 & 19;
                        i8 = ((i211 | 19) & (~i212)) + (i212 << 1);
                        b = i8 % 128;
                        if (i8 % 2 != 0) {
                            bknVar.s(obj, j, arrayList);
                            obj2.hashCode();
                            throw null;
                        }
                        bknVar.s(obj, j, arrayList);
                        int i213 = a;
                        i9 = (i213 & 3) + (i213 | 3);
                        b = i9 % 128;
                        if (i9 % 2 == 0) {
                            int i214 = 3 % 4;
                        }
                        list2 = arrayList;
                    } else if (list instanceof ao) {
                        int size6 = list.size();
                        int i215 = size6 & i;
                        c = new C(i215 + ((i ^ size6) | i215));
                        int i216 = a;
                        i5 = ((((i216 ^ 55) | (i216 & 55)) << 1) - (~(-(((~i216) & 55) | (i216 & (-56)))))) - 1;
                        b = i5 % 128;
                        if (i5 % 2 == 0) {
                            aoVar = (ao) list;
                            size = c.size();
                            int i217 = 80 / 0;
                        } else {
                            aoVar = (ao) list;
                            size = c.size();
                        }
                        c.addAll(size, aoVar);
                        ar.bkn bknVar3 = ar.h;
                        int i218 = b;
                        int i219 = i218 & 91;
                        int i310 = (i218 ^ 91) | i219;
                        int i311 = (i219 ^ i310) + ((i310 & i219) << 1);
                        a = i311 % 128;
                        int i312 = i311 % 2;
                        bknVar3.s(obj, j, c);
                        int i313 = b;
                        i6 = (i313 & 87) + (i313 | 87);
                        a = i6 % 128;
                        list2 = c;
                        if (i6 % 2 != 0) {
                            int i314 = 5 / 2;
                            list2 = c;
                        }
                    } else if (list instanceof af) {
                        i2 = a;
                        int i315 = i2 & 107;
                        int i316 = (~i315) & (i2 | 107);
                        int i317 = i315 << 1;
                        int i318 = (i316 & i317) + (i317 | i316);
                        b = i318 % 128;
                        int i319 = i318 % 2;
                        if (list instanceof R.biN) {
                            int i410 = i2 & 73;
                            i3 = (i410 - (~((i2 ^ 73) | i410))) - 1;
                            b = i3 % 128;
                            if (i3 % 2 != 0) {
                                ((R.biN) list).o();
                                throw null;
                            }
                            bin2 = (R.biN) list;
                            if (bin2.o()) {
                                int size7 = list.size();
                                int i411 = size7 & i;
                                int i412 = -(-(i | size7));
                                binG = bin2.g((i411 & i412) + (i412 | i411));
                                int i413 = b;
                                int i414 = (i413 & (-22)) | ((~i413) & 21);
                                int i415 = -(-((i413 & 21) << 1));
                                i4 = ((i414 | i415) << 1) - (i415 ^ i414);
                                a = i4 % 128;
                                if (i4 % 2 != 0) {
                                    ar.h.s(obj, j, binG);
                                    int i416 = 27 / 0;
                                } else {
                                    ar.h.s(obj, j, binG);
                                }
                                int i417 = a;
                                int i418 = i417 & 83;
                                int i419 = i418 + ((i417 ^ 83) | i418);
                                b = i419 % 128;
                                int i520 = i419 % 2;
                                list3 = binG;
                            } else {
                                list3 = list;
                            }
                        } else {
                            list3 = list;
                        }
                    } else {
                        list3 = list;
                    }
                    int i521 = b;
                    int i522 = i521 ^ 45;
                    int i523 = -(-((i521 & 45) << 1));
                    i7 = (i522 & i523) + (i523 | i522);
                    list4 = list2;
                }
                a = i7 % 128;
                int i79 = i7 % 2;
                list3 = list4;
            }
            int i80 = a + 5;
            b = i80 % 128;
            int i81 = i80 % 2;
            return list3;
        }
    }

    static {
        bju bjuVar = new bju(null);
        int i = b;
        int i2 = (-2) - (((i & 18) + (i | 18)) ^ (-1));
        int i3 = i2 % 128;
        a = i3;
        int i4 = i2 % 2;
        d = bjuVar;
        int i5 = (i3 & (-106)) | ((~i3) & 105);
        int i6 = (i3 & 105) << 1;
        int i7 = (i5 & i6) + (i5 | i6);
        b = i7 % 128;
        int i8 = i7 % 2;
    }

    public AbstractC0068y(bjs bjsVar) {
    }

    public abstract void c(Object obj, long j);

    public abstract <L> void d(Object obj, Object obj2, long j);

    public abstract <L> List<L> e(Object obj, long j);

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aD.y$bju */
    public static final class bju extends AbstractC0068y {
        private static int a = 1;
        private static int b;

        public bju(bjs bjsVar) {
            super(null);
        }

        public static <E> o0OO00O.OooO0OO<E> f(Object obj, long j) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (-2) - (((i2 ^ 4) + ((i2 & 4) << 1)) ^ (-1));
            a = i3 % 128;
            int i4 = i3 % 2;
            R.biN bin2 = (R.biN) ar.o(obj, j);
            if (i4 == 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            int i5 = b;
            int i6 = i5 & 25;
            int i7 = ((i5 | 25) & (~i6)) + (i6 << 1);
            a = i7 % 128;
            int i8 = i7 % 2;
            return bin2;
        }

        @Override // ivas.gov.bisp.enumeration.aD.AbstractC0068y
        public final void c(Object obj, long j) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 | 81) << 1;
            int i4 = -(i2 ^ 81);
            int i5 = (i3 & i4) + (i4 | i3);
            a = i5 % 128;
            int i6 = i5 % 2;
            f(obj, j).c();
            int i7 = a + 41;
            b = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 20 / 0;
            }
        }

        @Override // ivas.gov.bisp.enumeration.aD.AbstractC0068y
        public final <L> List<L> e(Object obj, long j) {
            int i;
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = ((i3 | 25) << 1) - (i3 ^ 25);
            b = i4 % 128;
            int i5 = i4 % 2;
            R.biN binF = f(obj, j);
            if (!binF.o()) {
                int i6 = b;
                int i7 = i6 ^ 97;
                int i8 = ((i6 & 97) | i7) << 1;
                int i9 = -i7;
                int i10 = ((i8 | i9) << 1) - (i8 ^ i9);
                a = i10 % 128;
                if (i10 % 2 == 0) {
                    binF.size();
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                int size = binF.size();
                if (size == 0) {
                    int i11 = b;
                    int i12 = (i11 | 3) << 1;
                    int i13 = -((i11 & (-4)) | ((~i11) & 3));
                    int i14 = (i12 & i13) + (i12 | i13);
                    a = i14 % 128;
                    i = i14 % 2 == 0 ? 71 : 10;
                    int i15 = i11 + 97;
                    a = i15 % 128;
                    int i16 = i15 % 2;
                } else {
                    i = size * 2;
                    int i17 = b;
                    int i18 = ((i17 & 70) + (i17 | 70)) - 1;
                    a = i18 % 128;
                    int i19 = i18 % 2;
                }
                binF = binF.g(i);
                ar.bkn bknVar = ar.h;
                int i20 = b;
                int i21 = i20 & 13;
                int i22 = i20 | 13;
                int i23 = (i21 & i22) + (i22 | i21);
                a = i23 % 128;
                int i24 = i23 % 2;
                bknVar.s(obj, j, binF);
                if (i24 == 0) {
                    int i25 = 87 / 0;
                }
            }
            int i26 = b;
            int i27 = i26 & 55;
            int i28 = ((((i26 ^ 55) | i27) << 1) - (~(-((i26 | 55) & (~i27))))) - 1;
            a = i28 % 128;
            if (i28 % 2 == 0) {
                int i29 = 75 / 0;
            }
            return binF;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // ivas.gov.bisp.enumeration.aD.AbstractC0068y
        public final <E> void d(Object obj, Object obj2, long j) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((((i2 ^ 123) | (i2 & 123)) << 1) - (~(-(((~i2) & 123) | (i2 & (-124)))))) - 1;
            b = i3 % 128;
            int i4 = i3 % 2;
            R.biN binF = f(obj, j);
            R.biN binF2 = f(obj2, j);
            int i5 = b;
            int i6 = (i5 & 31) + (i5 | 31);
            a = i6 % 128;
            int i7 = i6 % 2;
            int size = binF.size();
            int size2 = binF2.size();
            int i8 = a;
            int i9 = (i8 ^ 57) + ((i8 & 57) << 1);
            b = i9 % 128;
            int i10 = i9 % 2;
            if (size > 0) {
                int i11 = i8 + 119;
                int i12 = i11 % 128;
                b = i12;
                int i13 = i11 % 2;
                if (size2 > 0) {
                    int i14 = i12 + 19;
                    a = i14 % 128;
                    int i15 = i14 % 2;
                    if (!binF.o()) {
                        int i16 = b;
                        int i17 = (i16 ^ 35) + ((i16 & 35) << 1);
                        a = i17 % 128;
                        if (i17 % 2 == 0) {
                            binF = binF.g(size2 % size);
                        } else {
                            int i18 = size2 - (~(-(-size)));
                            binF = binF.g((i18 ^ (-1)) + (i18 << 1));
                        }
                        int i19 = b;
                        int i20 = i19 & 51;
                        int i21 = ((i19 ^ 51) | i20) << 1;
                        int i22 = -((i19 | 51) & (~i20));
                        int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
                        a = i23 % 128;
                        int i24 = i23 % 2;
                    }
                    binF.addAll(binF2);
                    int i25 = a;
                    int i26 = i25 & 33;
                    int i27 = -(-((i25 ^ 33) | i26));
                    int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
                    b = i28 % 128;
                    int i29 = i28 % 2;
                }
            }
            if (size > 0) {
                int i30 = b;
                int i31 = i30 & 15;
                int i32 = -(-((i30 ^ 15) | i31));
                int i33 = (i31 & i32) + (i31 | i32);
                a = i33 % 128;
                if (i33 % 2 == 0) {
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
                int i34 = (-2) - ((i30 + 112) ^ (-1));
                a = i34 % 128;
                int i35 = i34 % 2;
                binF2 = binF;
            }
            ar.h.s(obj, j, binF2);
            int i36 = b + 105;
            a = i36 % 128;
            int i37 = i36 % 2;
        }
    }
}
