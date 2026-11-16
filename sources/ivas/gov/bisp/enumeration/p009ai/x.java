package ivas.gov.bisp.enumeration.p009ai;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import ivas.gov.bisp.enumeration.OooOOoo.OooOOO0;
import ivas.gov.bisp.enumeration.OooOOoo.OooOOOO;
import ivas.gov.bisp.enumeration.Oooo0o0.o00oO0o;
import ivas.gov.bisp.enumeration.p001aa.t;
import ivas.gov.bisp.enumeration.p001aa.z;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class x {
    private static int a = 0;
    private static int b = 1;
    public static final OooOOO0<String, Typeface> c = new z(16);
    public static final ExecutorService d;
    public static final Object e;
    public static final OooOOOO<String, ArrayList<o00oO0o<aVW>>> f;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0089m("fonts-androidx", 10));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        d = threadPoolExecutor;
        e = new Object();
        f = new t();
        int i = a;
        int i2 = i & 21;
        int i3 = (i2 - (~((i ^ 21) | i2))) - 1;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class aVW {
        public final Typeface a;
        public final int b;

        public aVW(int i) {
            this.a = null;
            this.b = i;
        }

        @SuppressLint({"WrongConstant"})
        public aVW(Typeface typeface) {
            this.a = typeface;
            this.b = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00c6 A[EDGE_INSN: B:32:0x00c6->B:41:0x011e BREAK  A[LOOP:0: B:25:0x009e->B:34:0x00e1]] */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x015b, code lost:
    
        if (r12 != null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0162, code lost:
    
        if (r12 != null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0164, code lost:
    
        ivas.gov.bisp.enumeration.p009ai.x.c.d(r11, r12);
        r11 = new ivas.gov.bisp.enumeration.ai.x.aVW(r12);
        r12 = ivas.gov.bisp.enumeration.p009ai.x.a;
        r13 = (r12 ^ 97) + ((r12 & 97) << 1);
        ivas.gov.bisp.enumeration.p009ai.x.b = r13 % 128;
        r13 = r13 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x017b, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x017c, code lost:
    
        r11 = new ivas.gov.bisp.enumeration.ai.x.aVW(-3);
        r12 = ivas.gov.bisp.enumeration.p009ai.x.a;
        r13 = r12 & 57;
        r12 = (r12 | 57) & (~r13);
        r13 = -(-(r13 << 1));
        r14 = (r12 ^ r13) + ((r12 & r13) << 1);
        ivas.gov.bisp.enumeration.p009ai.x.b = r14 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0196, code lost:
    
        if ((r14 % 2) != 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0198, code lost:
    
        r12 = 7 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x019a, code lost:
    
        return r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static ivas.gov.bisp.enumeration.ai.x.aVW b(java.lang.String r11, android.content.Context r12, ivas.gov.bisp.enumeration.p009ai.u r13, int r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 419
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p009ai.x.b(java.lang.String, android.content.Context, ivas.gov.bisp.enumeration.ai.u, int):ivas.gov.bisp.enumeration.ai.x$aVW");
    }
}
