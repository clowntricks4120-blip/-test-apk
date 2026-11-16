package ivas.gov.bisp.enumeration.aD;

/* JADX INFO: loaded from: classes.dex */
public abstract class G<T, B> {
    private static int a = 0;
    private static int b = 1;

    public abstract int c(T t);

    public abstract void d(B b2, int i, int i2);

    public abstract void e(B b2, int i, long j);

    public abstract void f(B b2, int i, T t);

    public abstract void g(B b2, int i, AbstractC0069z abstractC0069z);

    public abstract B h(Object obj);

    public abstract void i(B b2, int i, long j);

    public abstract T j(Object obj);

    public abstract int k(T t);

    public abstract void l(Object obj);

    public abstract T m(T t, T t2);

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
    
        if (r2 != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if (r2 == 1) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        r7 = r4 & 31;
        r4 = (r4 ^ 31) | r7;
        r8 = ((r7 | r4) << 1) - (r4 ^ r7);
        r4 = r8 % 128;
        ivas.gov.bisp.enumeration.aD.G.a = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
    
        if ((r8 % 2) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        if (r2 == 4) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
    
        if (r2 == 2) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        r8 = r4 & 67;
        r4 = -(-((r4 ^ 67) | r8));
        r9 = ((r8 | r4) << 1) - (r4 ^ r8);
        r4 = r9 % 128;
        ivas.gov.bisp.enumeration.aD.G.b = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        if ((r9 % 2) != 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0072, code lost:
    
        if (r2 == 3) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
    
        if (r2 == 3) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0077, code lost:
    
        if (r2 == 4) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0079, code lost:
    
        r5 = r4 & 9;
        r4 = (r4 ^ 9) | r5;
        r7 = (r5 & r4) + (r4 | r5);
        r4 = r7 % 128;
        ivas.gov.bisp.enumeration.aD.G.a = r4;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
    
        if (r2 != 5) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008a, code lost:
    
        r2 = r4 | 19;
        r5 = r2 << 1;
        r2 = -(r2 & (~(r4 & 19)));
        r4 = (r5 & r2) + (r2 | r5);
        ivas.gov.bisp.enumeration.aD.G.b = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009c, code lost:
    
        if ((r4 % 2) == 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009e, code lost:
    
        d(r11, r3, r12.H());
        r11 = ivas.gov.bisp.enumeration.aD.G.b;
        r12 = (r11 & 58) + (r11 | 58);
        r2 = (r12 ^ (-1)) + (r12 << 1);
        ivas.gov.bisp.enumeration.aD.G.a = r2 % 128;
        r2 = r2 % 2;
        r12 = r11 & 67;
        r11 = (r11 ^ 67) | r12;
        r2 = ((r12 | r11) << 1) - (r11 ^ r12);
        ivas.gov.bisp.enumeration.aD.G.a = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c4, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c5, code lost:
    
        d(r11, r3, r12.H());
        r6.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cf, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d4, code lost:
    
        throw ivas.gov.bisp.enumeration.aD.C0065v.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d5, code lost:
    
        r11 = (r4 ^ 101) + ((r4 & 101) << 1);
        ivas.gov.bisp.enumeration.aD.G.a = r11 % 128;
        r11 = r11 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e0, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e1, code lost:
    
        r2 = p();
        r4 = ivas.gov.bisp.enumeration.aD.G.a + 33;
        ivas.gov.bisp.enumeration.aD.G.b = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f5, code lost:
    
        if (r12.M() == Integer.MAX_VALUE) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f7, code lost:
    
        r4 = ivas.gov.bisp.enumeration.aD.G.a + 67;
        ivas.gov.bisp.enumeration.aD.G.b = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0104, code lost:
    
        if (n(r2, r12) != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0106, code lost:
    
        r4 = r3 << 3;
        r6 = ((~r4) & 4) | (r4 & (-5));
        r4 = r4 & 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0116, code lost:
    
        if (((r4 & r6) | (r6 ^ r4)) != r12.getTag()) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0118, code lost:
    
        r12 = ivas.gov.bisp.enumeration.aD.G.a;
        r4 = r12 & 51;
        r12 = (r12 ^ 51) | r4;
        r6 = ((r4 | r12) << 1) - (r12 ^ r4);
        ivas.gov.bisp.enumeration.aD.G.b = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0129, code lost:
    
        if ((r6 % 2) != 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x012b, code lost:
    
        f(r11, r3, t(r2));
        r11 = 37 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0136, code lost:
    
        f(r11, r3, t(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x013d, code lost:
    
        r11 = ivas.gov.bisp.enumeration.aD.G.b + 65;
        ivas.gov.bisp.enumeration.aD.G.a = r11 % 128;
        r11 = r11 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0146, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x014b, code lost:
    
        throw ivas.gov.bisp.enumeration.aD.C0065v.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x014c, code lost:
    
        g(r11, r3, r12.d());
        r11 = ivas.gov.bisp.enumeration.aD.G.b;
        r12 = r11 & 71;
        r12 = r12 + ((r11 ^ 71) | r12);
        ivas.gov.bisp.enumeration.aD.G.a = r12 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0160, code lost:
    
        if ((r12 % 2) != 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0162, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0163, code lost:
    
        r6.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0166, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0167, code lost:
    
        e(r11, r3, r12.p());
        r11 = ivas.gov.bisp.enumeration.aD.G.a + 93;
        ivas.gov.bisp.enumeration.aD.G.b = r11 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0177, code lost:
    
        if ((r11 % 2) == 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0179, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x017a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x017b, code lost:
    
        i(r11, r3, r12.E());
        r11 = ivas.gov.bisp.enumeration.aD.G.a + 77;
        ivas.gov.bisp.enumeration.aD.G.b = r11 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x018b, code lost:
    
        if ((r11 % 2) != 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x018e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003d, code lost:
    
        if (r2 != 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean n(B r11, ivas.gov.bisp.enumeration.aD.ag r12) throws ivas.gov.bisp.enumeration.aD.C0065v {
        /*
            Method dump skipped, instruction units count: 399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.aD.G.n(java.lang.Object, ivas.gov.bisp.enumeration.aD.ag):boolean");
    }

    public abstract void o(Object obj, B b2);

    public abstract B p();

    public abstract void q(Object obj, T t);

    public abstract boolean r(ag agVar);

    public abstract void s(T t, InterfaceC0051g interfaceC0051g);

    public abstract T t(B b2);

    public abstract void u(T t, InterfaceC0051g interfaceC0051g);
}
