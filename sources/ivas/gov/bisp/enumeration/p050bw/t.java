package ivas.gov.bisp.enumeration.p050bw;

import ivas.gov.bisp.enumeration.o000O0O.o0OoOo0;
import ivas.gov.bisp.enumeration.o000O0o.o000O000;
import ivas.gov.bisp.enumeration.p032be.j;
import ivas.gov.bisp.enumeration.p034bg.c;
import ivas.gov.bisp.enumeration.p035bh.E;
import ivas.gov.bisp.enumeration.p035bh.L;
import ivas.gov.bisp.enumeration.p035bh.T;
import ivas.gov.bisp.enumeration.p035bh.X;
import ivas.gov.bisp.enumeration.p086i.a;
import ivas.gov.bisp.enumeration.p102y.l;
import ivas.gov.bisp.enumeration.p102y.r;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class t implements E {
    private static int a = 1;
    private static int b;
    public final r c;
    public final L d;
    public final l e;
    public final c f = c.c;
    public final r g;

    public static abstract class bsh {
        public final String a;
        public final boolean b;
        public final boolean c;

        public bsh(String str, boolean z, boolean z2) {
            this.a = str;
            this.b = z;
            this.c = z2;
        }

        public abstract void c(j jVar, Object obj);

        public abstract void d(ivas.gov.bisp.enumeration.p032be.c cVar, Object obj);

        public abstract boolean e(Object obj);
    }

    public t(r rVar, L l, l lVar, r rVar2) {
        this.c = rVar;
        this.d = l;
        this.e = lVar;
        this.g = rVar2;
    }

    public static final class bsj<T> extends o000O000<T> {
        private static int a = 1;
        private static int b;
        public final o0OoOo0<T> c;
        public final Map<String, bsh> d;

        public bsj(o0OoOo0<T> o0oooo0, Map<String, bsh> map) {
            this.c = o0oooo0;
            this.d = map;
        }

        public final T c(j jVar) throws IOException {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (((i2 ^ 61) | (i2 & 61)) << 1) - (((~i2) & 61) | (i2 & (-62)));
            b = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0 ? jVar.y() == 9 : jVar.y() == 105) {
                jVar.s();
                int i4 = b + 19;
                a = i4 % 128;
                int i5 = i4 % 2;
                return null;
            }
            T t = (T) this.c.d();
            try {
                jVar.e();
                int i6 = b;
                int i7 = i6 & 69;
                int i8 = (i6 ^ 69) | i7;
                int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
                a = i9 % 128;
                int i10 = i9 % 2;
                while (jVar.c()) {
                    int i11 = a;
                    int i12 = (i11 & (-64)) | ((~i11) & 63);
                    int i13 = (i11 & 63) << 1;
                    int i14 = (i12 & i13) + (i13 | i12);
                    b = i14 % 128;
                    if (i14 % 2 != 0) {
                        this.d.get(jVar.r());
                        throw null;
                    }
                    bsh bshVar = this.d.get(jVar.r());
                    int i15 = a + 103;
                    b = i15 % 128;
                    if (i15 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                    bsh bshVar2 = bshVar;
                    if (bshVar2 != null) {
                        if (bshVar2.c) {
                            bshVar2.c(jVar, t);
                            int i16 = b;
                            int i17 = i16 & 23;
                            int i18 = (i16 ^ 23) | i17;
                            int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
                            a = i19 % 128;
                            int i20 = i19 % 2;
                        } else {
                            int i21 = a;
                            int i22 = (i21 & 17) + (i21 | 17);
                            b = i22 % 128;
                            int i23 = i22 % 2;
                        }
                    }
                    jVar.C();
                    int i24 = b;
                    int i25 = i24 & 25;
                    int i26 = (i24 ^ 25) | i25;
                    int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
                    a = i27 % 128;
                    int i28 = i27 % 2;
                }
                jVar.h();
                int i29 = b + 71;
                a = i29 % 128;
                if (i29 % 2 == 0) {
                    int i30 = 69 / 0;
                }
                return t;
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (IllegalStateException e2) {
                throw new X(e2);
            }
        }

        public final void d(ivas.gov.bisp.enumeration.p032be.c cVar, T t) throws IOException {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 + 113;
            a = i3 % 128;
            int i4 = i3 % 2;
            Object obj = null;
            if (t == null) {
                int i5 = (i2 & 119) + (i2 | 119);
                a = i5 % 128;
                if (i5 % 2 != 0) {
                    cVar.c();
                    return;
                } else {
                    cVar.c();
                    throw null;
                }
            }
            cVar.f();
            try {
                Collection<bsh> collectionValues = this.d.values();
                int i6 = b;
                int i7 = i6 & 87;
                int i8 = (i7 - (~(-(-((i6 ^ 87) | i7))))) - 1;
                a = i8 % 128;
                if (i8 % 2 == 0) {
                    collectionValues.iterator();
                    throw null;
                }
                int i9 = a;
                int i10 = i9 ^ 125;
                int i11 = ((i9 & 125) | i10) << 1;
                int i12 = -i10;
                int i13 = (i11 & i12) + (i11 | i12);
                b = i13 % 128;
                int i14 = i13 % 2;
                for (bsh bshVar : collectionValues) {
                    int i15 = b;
                    int i16 = (i15 ^ 69) + ((i15 & 69) << 1);
                    a = i16 % 128;
                    int i17 = i16 % 2;
                    int i18 = b;
                    int i19 = i18 & 115;
                    int i20 = (i19 - (~((i18 ^ 115) | i19))) - 1;
                    a = i20 % 128;
                    if (i20 % 2 == 0) {
                        bshVar.e(t);
                        obj.hashCode();
                        throw null;
                    }
                    if (bshVar.e(t)) {
                        cVar.j(bshVar.a);
                        int i21 = b + 15;
                        a = i21 % 128;
                        if (i21 % 2 == 0) {
                            bshVar.d(cVar, t);
                            obj.hashCode();
                            throw null;
                        }
                        bshVar.d(cVar, t);
                        int i22 = b;
                        int i23 = (i22 ^ 31) + ((i22 & 31) << 1);
                        a = i23 % 128;
                        int i24 = i23 % 2;
                    }
                }
                cVar.h();
                int i25 = b;
                int i26 = i25 & 49;
                int i27 = (i25 ^ 49) | i26;
                int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
                a = i28 % 128;
                int i29 = i28 % 2;
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0177  */
    /* JADX WARN: Code duplicated, block: B:9:0x004a  */
    public final boolean d(Field field, boolean z) {
        boolean z2;
        List<T> list;
        boolean z3;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 59) + ((i2 & 59) << 1);
        b = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            field.getType();
            obj.hashCode();
            throw null;
        }
        l lVar = this.e;
        Class<?> type = field.getType();
        int i4 = b;
        int i5 = i4 & 43;
        int i6 = (i5 - (~((i4 ^ 43) | i5))) - 1;
        a = i6 % 128;
        int i7 = i6 % 2;
        boolean z4 = false;
        if (!(!lVar.e(type))) {
            int i8 = a;
            int i9 = i8 & 111;
            int i10 = -(-((i8 ^ 111) | i9));
            int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
            b = i11 % 128;
            int i12 = i11 % 2;
            z2 = true;
        } else {
            int i13 = b;
            int i14 = (i13 ^ 44) + ((i13 & 44) << 1);
            int i15 = (i14 ^ (-1)) + (i14 << 1);
            a = i15 % 128;
            int i16 = i15 % 2;
            if (!(!lVar.d(type, z))) {
                int i17 = a;
                int i18 = i17 & 111;
                int i19 = -(-((i17 ^ 111) | i18));
                int i110 = ((i18 | i19) << 1) - (i19 ^ i18);
                b = i110 % 128;
                int i111 = i110 % 2;
                z2 = true;
            } else {
                int i20 = b;
                int i21 = i20 & 41;
                int i22 = ((((i20 ^ 41) | i21) << 1) - (~(-((i20 | 41) & (~i21))))) - 1;
                int i23 = i22 % 128;
                a = i23;
                z2 = i22 % 2 == 0;
                int i24 = i23 & 61;
                int i25 = -(-((i23 ^ 61) | i24));
                int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
                b = i26 % 128;
                if (i26 % 2 != 0) {
                    int i27 = 4 % 2;
                }
            }
        }
        if (!z2) {
            int i28 = b;
            int i29 = i28 ^ 27;
            int i30 = (((i28 & 27) | i29) << 1) - i29;
            a = i30 % 128;
            if (i30 % 2 != 0 ? (field.getModifiers() & 136) != 0 : (field.getModifiers() ^ 13300) != 0) {
                int i31 = b;
                int i32 = i31 & 103;
                int i33 = (i31 | 103) & (~i32);
                int i34 = -(-(i32 << 1));
                int i35 = (i33 ^ i34) + ((i33 & i34) << 1);
                a = i35 % 128;
                int i36 = i35 % 2;
                z3 = true;
            } else if (!field.isSynthetic()) {
                int i37 = a;
                int i38 = (i37 & 25) + (i37 | 25);
                b = i38 % 128;
                if (i38 % 2 != 0) {
                    lVar.e(field.getType());
                    obj.hashCode();
                    throw null;
                }
                if (lVar.e(field.getType())) {
                    int i39 = b;
                    int i310 = i39 & 103;
                    int i311 = (i39 | 103) & (~i310);
                    int i312 = -(-(i310 << 1));
                    int i313 = (i311 ^ i312) + ((i311 & i312) << 1);
                    a = i313 % 128;
                    int i314 = i313 % 2;
                    z3 = true;
                } else {
                    if (z) {
                        int i40 = a;
                        int i41 = ((i40 | 97) << 1) - (i40 ^ 97);
                        b = i41 % 128;
                        int i42 = i41 % 2;
                        list = lVar.d;
                        int i43 = b;
                        int i44 = (-2) - (((i43 & 104) + (i43 | 104)) ^ (-1));
                        a = i44 % 128;
                        int i45 = i44 % 2;
                    } else {
                        list = lVar.e;
                        int i46 = a;
                        int i47 = (((i46 ^ 81) | (i46 & 81)) << 1) - (((~i46) & 81) | (i46 & (-82)));
                        b = i47 % 128;
                        int i48 = i47 % 2;
                    }
                    if (!list.isEmpty()) {
                        a aVar = new a(field);
                        Iterator<T> it = list.iterator();
                        int i49 = b;
                        int i50 = (i49 & 97) + (i49 | 97);
                        a = i50 % 128;
                        if (i50 % 2 == 0) {
                            throw null;
                        }
                        while (true) {
                            if (it.hasNext()) {
                                int i51 = a;
                                int i52 = ((i51 | 19) << 1) - (i51 ^ 19);
                                b = i52 % 128;
                                int i53 = i52 % 2;
                                T next = it.next();
                                int i54 = b;
                                int i55 = ((i54 ^ 124) + ((i54 & 124) << 1)) - 1;
                                a = i55 % 128;
                                if (i55 % 2 == 0) {
                                    int i56 = 21 / 0;
                                    if (next.e(aVar)) {
                                        int i315 = b;
                                        int i316 = i315 & 103;
                                        int i317 = (i315 | 103) & (~i316);
                                        int i318 = -(-(i316 << 1));
                                        int i319 = (i317 ^ i318) + ((i317 & i318) << 1);
                                        a = i319 % 128;
                                        int i3110 = i319 % 2;
                                        z3 = true;
                                    }
                                } else if (next.e(aVar)) {
                                    int i3111 = b;
                                    int i3112 = i3111 & 103;
                                    int i3113 = (i3111 | 103) & (~i3112);
                                    int i3114 = -(-(i3112 << 1));
                                    int i3115 = (i3113 ^ i3114) + ((i3113 & i3114) << 1);
                                    a = i3115 % 128;
                                    int i3116 = i3115 % 2;
                                    z3 = true;
                                }
                            }
                        }
                    }
                    int i57 = b + 15;
                    a = i57 % 128;
                    int i58 = i57 % 2;
                    z3 = false;
                }
            } else {
                int i3117 = b;
                int i3118 = i3117 & 103;
                int i3119 = (i3117 | 103) & (~i3118);
                int i31110 = -(-(i3118 << 1));
                int i31111 = (i3119 ^ i31110) + ((i3119 & i31110) << 1);
                a = i31111 % 128;
                int i31112 = i31111 % 2;
                z3 = true;
            }
            if (!z3) {
                int i59 = a;
                int i60 = (i59 & 39) + (i59 | 39);
                b = i60 % 128;
                int i61 = i60 % 2;
                z4 = true;
            }
        }
        int i62 = b;
        int i63 = ((i62 ^ 63) | (i62 & 63)) << 1;
        int i64 = -(((~i62) & 63) | (i62 & (-64)));
        int i65 = (i63 & i64) + (i64 | i63);
        a = i65 % 128;
        if (i65 % 2 != 0) {
            return z4;
        }
        throw null;
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    @Override // ivas.gov.bisp.enumeration.p035bh.E
    public final <T> ivas.gov.bisp.enumeration.o000O0o.o000O000<T> b(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r38v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:89)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */
}
