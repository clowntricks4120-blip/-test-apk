package ivas.gov.bisp.enumeration.p007ag;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import ivas.gov.bisp.enumeration.OooOOoo.OooOOO0;
import ivas.gov.bisp.enumeration.OooOOoo.OooOOOO;
import ivas.gov.bisp.enumeration.Oooo0o0.o00oO0o;
import ivas.gov.bisp.enumeration.p001aa.z;
import ivas.gov.bisp.enumeration.p002ab.C0084m;
import ivas.gov.bisp.enumeration.p002ab.M;
import ivas.gov.bisp.enumeration.p006af.h;
import ivas.gov.bisp.enumeration.p009ai.CallableC0090o;
import ivas.gov.bisp.enumeration.p009ai.J;
import ivas.gov.bisp.enumeration.p009ai.O;
import ivas.gov.bisp.enumeration.p009ai.P;
import ivas.gov.bisp.enumeration.p009ai.RunnableC0091p;
import ivas.gov.bisp.enumeration.p009ai.a;
import ivas.gov.bisp.enumeration.p009ai.l;
import ivas.gov.bisp.enumeration.p009ai.u;
import ivas.gov.bisp.enumeration.p009ai.x;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public class e {
    private static int a = 0;
    private static int b = 1;
    public static final u c;
    public static final OooOOO0<String, Typeface> d;

    public static class aVq extends h {
        public C0084m.aTa a;

        public aVq(C0084m.aTa ata) {
            this.a = ata;
        }
    }

    static {
        int i;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            c = new t();
            int i3 = b;
            int i4 = ((i3 ^ 51) | (i3 & 51)) << 1;
            int i5 = -(((~i3) & 51) | (i3 & (-52)));
            int i6 = (i4 & i5) + (i5 | i4);
            a = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
        } else if (i2 >= 28) {
            c = new P();
            int i9 = a;
            int i10 = i9 & 65;
            int i11 = -(-(i9 | 65));
            int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
            b = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 2 % 2;
            }
        } else {
            if (i2 >= 26) {
                c = new z();
                int i14 = b;
                int i15 = (i14 ^ 43) + ((i14 & 43) << 1);
                a = i15 % 128;
                int i16 = i15 % 2;
            } else if (i2 >= 24) {
                int i17 = b;
                int i18 = (i17 ^ 109) + ((i17 & 109) << 1);
                a = i18 % 128;
                int i19 = i18 % 2;
                if (C0088p.f != null) {
                    int i20 = b;
                    int i21 = i20 & 125;
                    int i22 = (i20 | 125) & (~i21);
                    int i23 = i21 << 1;
                    int i24 = (i22 & i23) + (i22 | i23);
                    int i25 = i24 % 128;
                    a = i25;
                    int i26 = i24 % 2;
                    int i27 = (i25 & (-124)) | ((~i25) & 123);
                    int i28 = (i25 & 123) << 1;
                    int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
                    b = i29 % 128;
                    if (i29 % 2 != 0) {
                        int i30 = 2 % 2;
                    }
                    c = new C0088p();
                    int i31 = b;
                    int i32 = (i31 & (-54)) | ((~i31) & 53);
                    int i33 = (i31 & 53) << 1;
                    int i34 = (i32 & i33) + (i33 | i32);
                    a = i34 % 128;
                    if (i34 % 2 != 0) {
                        int i35 = 2 / 5;
                    }
                } else {
                    int i36 = a;
                    int i37 = (i36 | 123) << 1;
                    int i38 = -(((~i36) & 123) | (i36 & (-124)));
                    int i39 = ((i37 | i38) << 1) - (i38 ^ i37);
                    b = i39 % 128;
                    if (i39 % 2 == 0) {
                        int i40 = 2 / 5;
                    } else {
                        int i41 = 2 % 2;
                    }
                    c = new i();
                    i = a + 105;
                    b = i % 128;
                    if (i % 2 != 0) {
                    }
                }
            } else {
                c = new i();
                i = a + 105;
                b = i % 128;
                if (i % 2 != 0) {
                }
            }
            int i42 = 2 % 2;
        }
        d = new z(16);
        int i43 = b;
        int i44 = i43 & 47;
        int i45 = -(-((i43 ^ 47) | i44));
        int i46 = ((i44 | i45) << 1) - (i45 ^ i44);
        a = i46 % 128;
        int i47 = i46 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0025  */
    public static Typeface b(Context context, M.aUN aun, Resources resources, int i, int i2, C0084m.aTa ata, Handler handler, boolean z) {
        Typeface typefaceC;
        Typeface typefaceCreate;
        if (aun instanceof M.aUQ) {
            M.aUQ auq = (M.aUQ) aun;
            String str = auq.d;
            boolean z2 = false;
            typefaceC = null;
            if (str == null || str.isEmpty()) {
                typefaceCreate = null;
            } else {
                typefaceCreate = Typeface.create(str, 0);
                Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
                if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
                    typefaceCreate = null;
                }
            }
            if (typefaceCreate != null) {
                if (ata != null) {
                    ata.e(typefaceCreate, handler);
                }
                return typefaceCreate;
            }
            if (!z ? ata == null : auq.c == 0) {
                z2 = true;
            }
            int i3 = z ? auq.b : -1;
            Handler handlerC = C0084m.aTa.c(handler);
            aVq avq = new aVq(ata);
            u uVar = auq.a;
            P p = new P(avq, handlerC);
            if (z2) {
                OooOOO0<String, Typeface> oooOOO0 = x.c;
                StringBuilder sb = new StringBuilder();
                sb.append(uVar.g);
                sb.append("-");
                sb.append(i2);
                String string = sb.toString();
                Typeface typeface = (Typeface) x.c.c(string);
                if (typeface != null) {
                    handlerC.post(new RunnableC0091p(p, avq, typeface));
                    typefaceC = typeface;
                } else if (i3 == -1) {
                    x.aVW avwB = x.b(string, context, uVar, i2);
                    p.c(avwB);
                    typefaceC = avwB.a;
                } else {
                    try {
                        try {
                            x.aVW avw = (x.aVW) x.d.submit(new l(string, context, uVar, i2)).get(i3, TimeUnit.MILLISECONDS);
                            p.c(avw);
                            typefaceC = avw.a;
                        } catch (InterruptedException e) {
                            throw e;
                        } catch (ExecutionException e2) {
                            throw new RuntimeException(e2);
                        } catch (TimeoutException unused) {
                            throw new InterruptedException("timeout");
                        }
                    } catch (InterruptedException unused2) {
                        p.d.post(new ivas.gov.bisp.enumeration.p009ai.z(p, p.c, -3));
                    }
                }
            } else {
                OooOOO0<String, Typeface> oooOOO1 = x.c;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(uVar.g);
                sb2.append("-");
                sb2.append(i2);
                String string2 = sb2.toString();
                Typeface typeface2 = (Typeface) x.c.c(string2);
                if (typeface2 != null) {
                    handlerC.post(new RunnableC0091p(p, avq, typeface2));
                    typefaceC = typeface2;
                } else {
                    a aVar = new a(p);
                    synchronized (x.e) {
                        OooOOOO<String, ArrayList<o00oO0o<x.aVW>>> oooOOOO = x.f;
                        ArrayList arrayList = (ArrayList) oooOOOO.getOrDefault(string2, null);
                        if (arrayList != null) {
                            arrayList.add(aVar);
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(aVar);
                            oooOOOO.put(string2, arrayList2);
                            ((ThreadPoolExecutor) x.d).execute(new O(Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler(), new CallableC0090o(string2, context, uVar, i2), new J(string2)));
                        }
                    }
                }
            }
        } else {
            typefaceC = c.c(context, (M.aUO) aun, resources, i2);
            if (ata != null) {
                if (typefaceC != null) {
                    ata.e(typefaceC, handler);
                } else {
                    ata.d(-3, handler);
                }
            }
        }
        if (typefaceC != null) {
            d.d(d(resources, i, i2), typefaceC);
        }
        return typefaceC;
    }

    public static Typeface c(Context context, Resources resources, int i, String str, int i2) {
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = i4 & 23;
        int i6 = i5 + ((i4 ^ 23) | i5);
        b = i6 % 128;
        int i7 = i6 % 2;
        Typeface typefaceF = c.f(context, resources, i, str, i2);
        if (typefaceF != null) {
            int i8 = (-2) - ((b + 80) ^ (-1));
            a = i8 % 128;
            if (i8 % 2 != 0) {
                d(resources, i, i2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            d.d(d(resources, i, i2), typefaceF);
            int i9 = a + 9;
            b = i9 % 128;
            int i10 = i9 % 2;
        }
        int i11 = a;
        int i12 = ((((i11 ^ 15) | (i11 & 15)) << 1) - (~(-(((~i11) & 15) | (i11 & (-16)))))) - 1;
        b = i12 % 128;
        int i13 = i12 % 2;
        return typefaceF;
    }

    public static String d(Resources resources, int i, int i2) {
        int i3 = 2 % 2;
        StringBuilder sb = new StringBuilder();
        int i4 = b;
        int i5 = i4 & 89;
        int i6 = (i5 - (~(-(-((i4 ^ 89) | i5))))) - 1;
        a = i6 % 128;
        if (i6 % 2 != 0) {
            sb.append(resources.getResourcePackageName(i));
            sb.append("-");
            int i7 = 21 / 0;
        } else {
            sb.append(resources.getResourcePackageName(i));
            sb.append("-");
        }
        int i8 = a;
        int i9 = i8 | 83;
        int i10 = (i9 << 1) - ((~(i8 & 83)) & i9);
        b = i10 % 128;
        int i11 = i10 % 2;
        sb.append(i);
        sb.append("-");
        if (i11 == 0) {
            throw null;
        }
        sb.append(i2);
        String string = sb.toString();
        int i12 = a;
        int i13 = (i12 | 79) << 1;
        int i14 = -(i12 ^ 79);
        int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
        b = i15 % 128;
        if (i15 % 2 != 0) {
            return string;
        }
        throw null;
    }
}
