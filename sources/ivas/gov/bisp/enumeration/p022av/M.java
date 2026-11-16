package ivas.gov.bisp.enumeration.p022av;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import ivas.gov.bisp.enumeration.bD.T;
import ivas.gov.bisp.enumeration.o0ooOO0.o00O0O;
import ivas.gov.bisp.enumeration.o0ooOO0.o00Ooo;
import ivas.gov.bisp.enumeration.p091n.j;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class M<T> implements Comparable<o00O0O<T>> {
    private static int a = 1;
    private static int b;
    public N c;
    public final S.bKl d;
    public final int e;
    public final String f;
    public final Object g;
    public final int h;
    public C0094m.bas i;
    public Integer j;
    public boolean k;
    public boolean l;
    public z m;
    public bKf n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public r.bJP f68o;

    public interface bKf {
    }

    /* JADX WARN: Code duplicated, block: B:16:0x009a  */
    /* JADX WARN: Code duplicated, block: B:32:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:35:0x0114  */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    public M(int i, String str, C0094m.bas basVar) {
        S.bKl bkl;
        int iHashCode;
        String host;
        int i2;
        if (S.bKl.c) {
            bkl = new S.bKl();
            int i3 = a;
            int i4 = (i3 & (-84)) | ((~i3) & 83);
            int i5 = -(-((i3 & 83) << 1));
            int i6 = (i4 & i5) + (i5 | i4);
            b = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
        } else {
            int i9 = a;
            int i10 = i9 ^ 99;
            int i11 = ((i9 & 99) | i10) << 1;
            int i12 = -i10;
            int i13 = (i11 & i12) + (i11 | i12);
            b = i13 % 128;
            int i14 = i13 % 2;
            int i15 = 2 % 2;
            bkl = null;
        }
        this.d = bkl;
        Object obj = new Object();
        int i16 = a;
        int i17 = i16 & 99;
        int i18 = i17 + ((i16 ^ 99) | i17);
        int i19 = i18 % 128;
        b = i19;
        if (i18 % 2 != 0) {
            this.g = obj;
            this.k = true;
            this.l = true;
        } else {
            this.g = obj;
            this.k = true;
            this.l = false;
        }
        int i20 = (-2) - ((i19 + 116) ^ (-1));
        a = i20 % 128;
        if (i20 % 2 == 0) {
            this.f68o = null;
            this.e = i;
            this.f = str;
            throw null;
        }
        this.f68o = null;
        this.e = i;
        this.f = str;
        this.i = basVar;
        z zVar = new z(2500, 1, 1.0f);
        int i21 = a;
        int i22 = i21 & 93;
        int i23 = (i21 ^ 93) | i22;
        int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
        b = i24 % 128;
        if (i24 % 2 != 0) {
            this.m = zVar;
            if (TextUtils.isEmpty(str)) {
                iHashCode = 1;
            }
            this.h = iHashCode;
            int i25 = b;
            int i26 = (i25 & (-26)) | ((~i25) & 25);
            int i27 = (i25 & 25) << 1;
            i2 = (i26 ^ i27) + ((i27 & i26) << 1);
            a = i2 % 128;
            if (i2 % 2 == 0) {
                int i28 = 11 / 0;
            }
        }
        this.m = zVar;
        if (TextUtils.isEmpty(str)) {
            iHashCode = 0;
        }
        this.h = iHashCode;
        int i29 = b;
        int i210 = (i29 & (-26)) | ((~i29) & 25);
        int i211 = (i29 & 25) << 1;
        i2 = (i210 ^ i211) + ((i211 & i210) << 1);
        a = i2 % 128;
        if (i2 % 2 == 0) {
            int i212 = 11 / 0;
        }
        Uri uri = Uri.parse(str);
        if (uri != null) {
            int i30 = a;
            int i31 = (i30 & 119) + (i30 | 119);
            b = i31 % 128;
            if (i31 % 2 != 0) {
                host = uri.getHost();
                if (host == null) {
                    iHashCode = 1;
                }
            } else {
                host = uri.getHost();
                if (host == null) {
                    iHashCode = 0;
                }
            }
            int i32 = b;
            int i33 = i32 & 61;
            int i34 = (((i32 | 61) & (~i33)) - (~(-(-(i33 << 1))))) - 1;
            a = i34 % 128;
            int i35 = i34 % 2;
            iHashCode = host.hashCode();
            int i36 = b;
            int i37 = ((((i36 ^ 111) | (i36 & 111)) << 1) - (~(-(((~i36) & 111) | (i36 & (-112)))))) - 1;
            a = i37 % 128;
            if (i37 % 2 != 0) {
                int i38 = 2 % 2;
            }
        } else {
            iHashCode = 0;
        }
        this.h = iHashCode;
        int i213 = b;
        int i214 = (i213 & (-26)) | ((~i213) & 25);
        int i215 = (i213 & 25) << 1;
        i2 = (i214 ^ i215) + ((i215 & i214) << 1);
        a = i2 % 128;
        if (i2 % 2 == 0) {
            int i216 = 11 / 0;
        }
    }

    public void c(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 | 7) << 1) - (~(-(((~i2) & 7) | (i2 & (-8)))))) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        if (S.bKl.c) {
            int i5 = b;
            int i6 = i5 & 11;
            int i7 = (i5 | 11) & (~i6);
            int i8 = -(-(i6 << 1));
            int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
            a = i9 % 128;
            if (i9 % 2 == 0) {
                this.d.c(str, Thread.currentThread().getId());
                throw null;
            }
            this.d.c(str, Thread.currentThread().getId());
        }
        int i10 = b;
        int i11 = ((i10 | 55) << 1) - (i10 ^ 55);
        a = i11 % 128;
        if (i11 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void d(String str) {
        N n = this.c;
        if (n != null) {
            synchronized (n.c) {
                n.c.remove(this);
            }
            synchronized (n.j) {
                Iterator<N.bKi> it = n.j.iterator();
                while (it.hasNext()) {
                    it.next().b(this);
                }
            }
            n.d(this, 5);
        }
        if (S.bKl.c) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new bKe(str, id));
            } else {
                this.d.c(str, id);
                this.d.d(toString());
            }
        }
    }

    public abstract void e(T t);

    public byte[] f() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 9) + ((i2 & 9) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 & 89;
        int i6 = -(-((i2 ^ 89) | i5));
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        b = i7 % 128;
        int i8 = i7 % 2;
        return null;
    }

    public String g() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 105) + (i2 | 105);
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        int i6 = i4 & 1;
        int i7 = (i4 ^ 1) | i6;
        int i8 = (i6 & i7) + (i7 | i6);
        a = i8 % 128;
        int i9 = i8 % 2;
        return "application/x-www-form-urlencoded; charset=UTF-8";
    }

    public Map<String, String> i() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 53;
        int i4 = (i2 ^ 53) | i3;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        if (i5 % 2 != 0) {
            return Collections.emptyMap();
        }
        int i6 = 48 / 0;
        return Collections.emptyMap();
    }

    public void j() {
        synchronized (this.g) {
            this.l = true;
        }
    }

    @Deprecated
    public byte[] k() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 ^ 47) | (i2 & 47)) << 1) - ((i2 & (-48)) | ((~i2) & 47));
        a = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = i2 ^ 95;
        int i5 = ((i2 & 95) | i4) << 1;
        int i6 = -i4;
        int i7 = (i5 & i6) + (i5 | i6);
        a = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 85 / 0;
        }
        return null;
    }

    public boolean l() {
        boolean z;
        synchronized (this.g) {
            z = this.l;
        }
        return z;
    }

    public boolean m() {
        synchronized (this.g) {
        }
        return false;
    }

    public void n(o00Ooo<?> o00ooo) {
        bKf bkf;
        List<o00O0O<?>> listRemove;
        synchronized (this.g) {
            bkf = this.n;
        }
        if (bkf != null) {
            L l = (L) bkf;
            r.bJP bjp = o00ooo.b;
            if (bjp == null || bjp.f < System.currentTimeMillis()) {
                l.d(this);
                return;
            }
            String strH = h();
            synchronized (l) {
                listRemove = l.a.remove(strH);
            }
            if (listRemove != null) {
                if (S.c) {
                    S.e("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(listRemove.size()), strH);
                }
                Iterator<o00O0O<?>> it = listRemove.iterator();
                while (it.hasNext()) {
                    ((P) l.b).c((M) it.next(), o00ooo, null);
                }
            }
        }
    }

    public void o() {
        bKf bkf;
        synchronized (this.g) {
            bkf = this.n;
        }
        if (bkf != null) {
            ((L) bkf).d(this);
        }
    }

    public abstract o00Ooo<T> p(C0095o c0095o);

    public class bKe implements Runnable {
        private static int a = 1;
        private static int b;
        public final /* synthetic */ String c;
        public final /* synthetic */ long d;

        public bKe(String str, long j) {
            this.c = str;
            this.d = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            S.bKl bkl;
            String str;
            long j;
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 & (-2)) | ((~i2) & 1)) + ((i2 & 1) << 1);
            b = i3 % 128;
            if (i3 % 2 != 0) {
                bkl = M.this.d;
                str = this.c;
                j = this.d;
                int i4 = 60 / 0;
            } else {
                bkl = M.this.d;
                str = this.c;
                j = this.d;
            }
            bkl.c(str, j);
            M m = M.this;
            S.bKl bkl2 = m.d;
            String string = m.toString();
            int i5 = a;
            int i6 = ((i5 & 73) - (~(i5 | 73))) - 1;
            b = i6 % 128;
            int i7 = i6 % 2;
            bkl2.d(string);
            int i8 = b;
            int i9 = i8 & 109;
            int i10 = i9 + ((i8 ^ 109) | i9);
            a = i10 % 128;
            int i11 = i10 % 2;
        }
    }

    public void q(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 27;
        int i5 = (i3 ^ 27) | i4;
        int i6 = (i4 & i5) + (i5 | i4);
        int i7 = i6 % 128;
        b = i7;
        int i8 = i6 % 2;
        N n = this.c;
        if (n != null) {
            int i9 = ((i7 ^ 17) | (i7 & 17)) << 1;
            int i10 = -(((~i7) & 17) | (i7 & (-18)));
            int i11 = (i9 & i10) + (i10 | i9);
            a = i11 % 128;
            if (i11 % 2 == 0) {
                n.d(this, i);
                throw null;
            }
            n.d(this, i);
        }
        int i12 = a;
        int i13 = (((i12 & (-12)) | ((~i12) & 11)) - (~((i12 & 11) << 1))) - 1;
        b = i13 % 128;
        int i14 = i13 % 2;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 113;
        int i4 = -(-((i2 & 113) << 1));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        if (i5 % 2 == 0) {
            Objects.requireNonNull((M) obj);
            throw null;
        }
        M m = (M) obj;
        Objects.requireNonNull(m);
        Integer num = this.j;
        int i6 = a + 49;
        b = i6 % 128;
        int i7 = i6 % 2;
        int iIntValue = num.intValue();
        int i8 = -m.j.intValue();
        int i9 = iIntValue & i8;
        int i10 = ((((iIntValue ^ i8) | i9) << 1) - (~(-((i8 | iIntValue) & (~i9))))) - 1;
        int i11 = b;
        int i12 = ((i11 ^ 43) | (i11 & 43)) << 1;
        int i13 = -(((~i11) & 43) | (i11 & (-44)));
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        a = i14 % 128;
        if (i14 % 2 == 0) {
            int i15 = 57 / 0;
        }
        return i10;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0048  */
    /* JADX WARN: Code duplicated, block: B:13:0x0060  */
    /* JADX WARN: Code duplicated, block: B:15:0x0062  */
    public String h() {
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 ^ 78) + ((i3 & 78) << 1)) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        String string = this.f;
        int i6 = this.e;
        int i7 = i3 ^ 3;
        int i8 = ((i3 & 3) | i7) << 1;
        int i9 = -i7;
        int i10 = (i8 ^ i9) + ((i8 & i9) << 1);
        int i11 = i10 % 128;
        a = i11;
        int i12 = i10 % 2;
        if (i6 != 0) {
            int i13 = ((i11 | 61) << 1) - ((i11 & (-62)) | ((~i11) & 61));
            b = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 26 / 0;
                if (i6 == -1) {
                    int i15 = (i11 & (-94)) | ((~i11) & 93);
                    int i16 = -(-((i11 & 93) << 1));
                    i = (i15 & i16) + (i16 | i15);
                    b = i % 128;
                    if (i % 2 != 0) {
                        throw null;
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(Integer.toString(i6));
                    int i17 = b;
                    int i18 = i17 ^ 117;
                    int i19 = ((i17 & 117) | i18) << 1;
                    int i20 = -i18;
                    int i21 = (i19 ^ i20) + ((i19 & i20) << 1);
                    a = i21 % 128;
                    int i22 = i21 % 2;
                    sb.append('-');
                    sb.append(string);
                    string = sb.toString();
                    int i23 = b;
                    int i24 = (-2) - ((-1) ^ (((i23 | 44) << 1) - (i23 ^ 44)));
                    a = i24 % 128;
                    int i25 = i24 % 2;
                    int i26 = ((i23 | 119) << 1) - (i23 ^ 119);
                    a = i26 % 128;
                    int i27 = i26 % 2;
                }
            } else if (i6 == -1) {
                int i110 = (i11 & (-94)) | ((~i11) & 93);
                int i111 = -(-((i11 & 93) << 1));
                i = (i110 & i111) + (i111 | i110);
                b = i % 128;
                if (i % 2 != 0) {
                    throw null;
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Integer.toString(i6));
                int i112 = b;
                int i113 = i112 ^ 117;
                int i114 = ((i112 & 117) | i113) << 1;
                int i28 = -i113;
                int i29 = (i114 ^ i28) + ((i114 & i28) << 1);
                a = i29 % 128;
                int i210 = i29 % 2;
                sb2.append('-');
                sb2.append(string);
                string = sb2.toString();
                int i211 = b;
                int i212 = (-2) - ((-1) ^ (((i211 | 44) << 1) - (i211 ^ 44)));
                a = i212 % 128;
                int i213 = i212 % 2;
                int i214 = ((i211 | 119) << 1) - (i211 ^ 119);
                a = i214 % 128;
                int i215 = i214 % 2;
            }
        }
        int i30 = a;
        int i31 = (i30 ^ 21) + ((i30 & 21) << 1);
        b = i31 % 128;
        int i32 = i31 % 2;
        return string;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 | 110) << 1) - (i2 ^ 110)) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        StringBuilder sbW = j.w("0x");
        sbW.append(Integer.toHexString(this.h));
        String string = sbW.toString();
        StringBuilder sb = new StringBuilder();
        int i5 = b;
        int i6 = i5 & 25;
        int i7 = (((i5 | 25) & (~i6)) - (~(i6 << 1))) - 1;
        a = i7 % 128;
        if (i7 % 2 == 0) {
            m();
            sb.append("[ ] ");
            throw null;
        }
        m();
        sb.append("[ ] ");
        sb.append(this.f);
        int i8 = a + 103;
        b = i8 % 128;
        int i9 = i8 % 2;
        sb.append(" ");
        sb.append(string);
        int i10 = b;
        int i11 = i10 & 47;
        int i12 = -(-((i10 ^ 47) | i11));
        int i13 = (i11 & i12) + (i12 | i11);
        a = i13 % 128;
        int i14 = i13 % 2;
        sb.append(" ");
        sb.append(T.h(2));
        int i15 = a;
        int i16 = ((i15 | 79) << 1) - (i15 ^ 79);
        b = i16 % 128;
        if (i16 % 2 != 0) {
            sb.append(" ");
            sb.append(this.j);
            throw null;
        }
        sb.append(" ");
        sb.append(this.j);
        String string2 = sb.toString();
        int i17 = b + 61;
        a = i17 % 128;
        if (i17 % 2 != 0) {
            return string2;
        }
        throw null;
    }
}
