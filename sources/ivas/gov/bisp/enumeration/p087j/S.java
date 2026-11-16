package ivas.gov.bisp.enumeration.p087j;

import android.content.Context;
import android.content.res.Configuration;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.p;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.c;
import ivas.gov.bisp.enumeration.p081d.R;
import ivas.gov.bisp.enumeration.p081d.T;
import ivas.gov.bisp.enumeration.p088k.InterfaceC0323y;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class S extends z {
    private static int a = 0;
    private static int b = 1;
    public final InterfaceC0323y c;
    public final Window.Callback d;
    public final LayoutInflaterFactory2C0312o.aQn e;
    public boolean f;
    public boolean g;
    public boolean h;
    public ArrayList<z.aQf> i = new ArrayList<>();
    public final Runnable j = new aQK();

    public class aQL implements Toolbar.OooOO0 {
        public aQL() {
        }
    }

    public final class aQN implements n.aII {
        private static int a = 0;
        private static int b = 1;

        public aQN() {
        }

        @Override // androidx.appcompat.view.menu.n.aII
        public final boolean b(n nVar, MenuItem menuItem) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 ^ 27;
            int i4 = (((i2 & 27) | i3) << 1) - i3;
            b = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i2 + 81;
            b = i6 % 128;
            if (i6 % 2 != 0) {
                return false;
            }
            throw null;
        }

        @Override // androidx.appcompat.view.menu.n.aII
        public final void e(n nVar) {
            int i = 2 % 2;
            int i2 = a + 27;
            b = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            if (!(!S.this.c.c())) {
                int i4 = a;
                int i5 = i4 & 73;
                int i6 = (i4 ^ 73) | i5;
                int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
                b = i7 % 128;
                int i8 = i7 % 2;
                S.this.d.onPanelClosed(108, nVar);
                int i9 = b;
                int i10 = (i9 ^ 95) + ((i9 & 95) << 1);
                a = i10 % 128;
                if (i10 % 2 != 0) {
                    throw null;
                }
                return;
            }
            if (!(!S.this.d.onPreparePanel(0, null, nVar))) {
                int i11 = a;
                int i12 = (i11 ^ 19) + ((i11 & 19) << 1);
                b = i12 % 128;
                int i13 = i12 % 2;
                S.this.d.onMenuOpened(108, nVar);
                int i14 = a;
                int i15 = (i14 & 125) + (i14 | 125);
                int i16 = i15 % 128;
                b = i16;
                int i17 = i15 % 2;
                int i18 = (i16 & (-6)) | ((~i16) & 5);
                int i19 = (i16 & 5) << 1;
                int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
                a = i20 % 128;
                int i21 = i20 % 2;
            }
            int i22 = a;
            int i23 = (((i22 | 5) << 1) - (~(-(i22 ^ 5)))) - 1;
            b = i23 % 128;
            if (i23 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    public class aQO implements LayoutInflaterFactory2C0312o.aQn {
        public aQO() {
        }
    }

    public S(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        aQL aql = new aQL();
        c cVar = new c(toolbar, false);
        this.c = cVar;
        Objects.requireNonNull(callback);
        this.d = callback;
        cVar.l = callback;
        toolbar.setOnMenuItemClickListener(aql);
        if (!cVar.i) {
            cVar.C(charSequence);
            int i = b + 15;
            a = i % 128;
            if (i % 2 == 0) {
                int i2 = 2 % 2;
            }
        }
        this.e = new aQO();
        int i3 = a;
        int i4 = ((i3 | 80) << 1) - (i3 ^ 80);
        int i5 = (i4 ^ (-1)) + (i4 << 1);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p087j.z
    public boolean d() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 115) << 1) - (i2 ^ 115);
        b = i3 % 128;
        int i4 = i3 % 2;
        boolean zD = this.c.d();
        if (i4 == 0) {
            int i5 = 54 / 0;
        }
        return zD;
    }

    @Override // ivas.gov.bisp.enumeration.p087j.z
    public int g() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 45;
        int i4 = i3 + ((i2 ^ 45) | i3);
        b = i4 % 128;
        int i5 = i4 % 2;
        int iO = this.c.o();
        int i6 = a;
        int i7 = i6 & 89;
        int i8 = i7 + ((i6 ^ 89) | i7);
        b = i8 % 128;
        if (i8 % 2 != 0) {
            return iO;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p087j.z
    public Context i() {
        Context contextU;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (-2) - (((i2 ^ 82) + ((i2 & 82) << 1)) ^ (-1));
        a = i3 % 128;
        if (i3 % 2 != 0) {
            contextU = this.c.u();
            int i4 = 5 / 0;
        } else {
            contextU = this.c.u();
        }
        int i5 = b;
        int i6 = i5 & 73;
        int i7 = (i5 | 73) & (~i6);
        int i8 = -(-(i6 << 1));
        int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
        a = i9 % 128;
        int i10 = i9 % 2;
        return contextU;
    }

    @Override // ivas.gov.bisp.enumeration.p087j.z
    public void j(Configuration configuration) {
        int i = 2 % 2;
        int i2 = b + 125;
        a = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p087j.z
    public void k() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & (-124)) | ((~i2) & 123)) + ((i2 & 123) << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        ViewGroup viewGroupJ = this.c.j();
        Runnable runnable = this.j;
        int i5 = a;
        int i6 = i5 ^ 1;
        int i7 = ((((i5 & 1) | i6) << 1) - (~(-i6))) - 1;
        b = i7 % 128;
        int i8 = i7 % 2;
        viewGroupJ.removeCallbacks(runnable);
        int i9 = a;
        int i10 = i9 & 3;
        int i11 = ((i9 ^ 3) | i10) << 1;
        int i12 = -((i9 | 3) & (~i10));
        int i13 = (i11 & i12) + (i12 | i11);
        b = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p087j.z
    public boolean m() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 126) + ((i2 & 126) << 1)) - 1;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            return this.c.a();
        }
        int i4 = 14 / 0;
        return this.c.a();
    }

    @Override // ivas.gov.bisp.enumeration.p087j.z
    public void n(boolean z) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 45;
        int i4 = -(-(i2 | 45));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p087j.z
    public void o(boolean z) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 | 13) << 1) - (~(-(i2 ^ 13)))) - 1;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p087j.z
    public void q(CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & 102) + (i2 | 102)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        this.c.setTitle(charSequence);
        if (i4 == 0) {
            throw null;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p087j.z
    public void r(CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 23;
        int i4 = (i2 ^ 23) | i3;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        this.c.setWindowTitle(charSequence);
        int i7 = b;
        int i8 = ((i7 ^ 65) - (~((i7 & 65) << 1))) - 1;
        a = i8 % 128;
        if (i8 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public class aQK implements Runnable {
        private static int a = 1;
        private static int b;

        public aQK() {
        }

        /* JADX WARN: Code duplicated, block: B:19:0x00a4 A[Catch: all -> 0x00f1, TRY_LEAVE, TryCatch #0 {all -> 0x00f1, blocks: (B:12:0x007f, B:17:0x009c, B:19:0x00a4), top: B:29:0x007f }] */
        @Override // java.lang.Runnable
        public void run() {
            n nVar;
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 111;
            int i4 = (i2 ^ 111) | i3;
            int i5 = (i3 & i4) + (i4 | i3);
            b = i5 % 128;
            int i6 = i5 % 2;
            S s = S.this;
            Menu menuT = s.t();
            if (menuT instanceof n) {
                int i7 = b;
                int i8 = i7 & 119;
                int i9 = (((i7 ^ 119) | i8) << 1) - ((~i8) & (i7 | 119));
                a = i9 % 128;
                int i10 = i9 % 2;
                nVar = (n) menuT;
                int i11 = i7 & 123;
                int i12 = (i7 ^ 123) | i11;
                int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
                a = i13 % 128;
                int i14 = i13 % 2;
            } else {
                int i15 = b;
                int i16 = (i15 | 43) << 1;
                int i17 = -(((~i15) & 43) | (i15 & (-44)));
                int i18 = (i16 & i17) + (i17 | i16);
                a = i18 % 128;
                int i19 = i18 % 2;
                nVar = null;
            }
            if (nVar != null) {
                int i20 = b;
                int i21 = i20 & 5;
                int i22 = (i20 | 5) & (~i21);
                int i23 = -(-(i21 << 1));
                int i24 = (i22 ^ i23) + ((i22 & i23) << 1);
                a = i24 % 128;
                if (i24 % 2 == 0) {
                    nVar.A();
                    throw null;
                }
                nVar.A();
            }
            try {
                menuT.clear();
                if (!s.d.onCreatePanelMenu(0, menuT)) {
                    menuT.clear();
                    int i25 = a;
                    int i26 = (((i25 | 24) << 1) - (i25 ^ 24)) - 1;
                    b = i26 % 128;
                    int i27 = i26 % 2;
                } else {
                    int i28 = b;
                    int i29 = ((i28 & 62) + (i28 | 62)) - 1;
                    a = i29 % 128;
                    int i30 = i29 % 2;
                    if (!s.d.onPreparePanel(0, null, menuT)) {
                        menuT.clear();
                        int i210 = a;
                        int i211 = (((i210 | 24) << 1) - (i210 ^ 24)) - 1;
                        b = i211 % 128;
                        int i212 = i211 % 2;
                    }
                }
                if (nVar != null) {
                    int i31 = b;
                    int i32 = (((i31 ^ 7) | (i31 & 7)) << 1) - (((~i31) & 7) | (i31 & (-8)));
                    a = i32 % 128;
                    int i33 = i32 % 2;
                    nVar.v();
                    int i34 = a;
                    int i35 = (-2) - ((((i34 | 34) << 1) - (i34 ^ 34)) ^ (-1));
                    b = i35 % 128;
                    int i36 = i35 % 2;
                }
                int i37 = (-2) - ((b + 94) ^ (-1));
                a = i37 % 128;
                int i38 = i37 % 2;
            } catch (Throwable th) {
                if (nVar != null) {
                    nVar.v();
                    int i39 = a;
                    int i40 = i39 & 81;
                    int i41 = (i39 ^ 81) | i40;
                    int i42 = (i40 & i41) + (i41 | i40);
                    b = i42 % 128;
                    int i43 = i42 % 2;
                }
                throw th;
            }
        }
    }

    @Override // ivas.gov.bisp.enumeration.p087j.z
    public boolean e() {
        int i = 2 % 2;
        int i2 = b + 30;
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        boolean z = false;
        if (!this.c.x()) {
            int i5 = a;
            int i6 = ((i5 & 104) + (i5 | 104)) - 1;
            b = i6 % 128;
            if (i6 % 2 != 0) {
                return false;
            }
            throw null;
        }
        int i7 = b + 1;
        a = i7 % 128;
        if (i7 % 2 != 0) {
            this.c.collapseActionView();
        } else {
            this.c.collapseActionView();
            z = true;
        }
        int i8 = a;
        int i9 = i8 ^ 7;
        int i10 = (i8 & 7) << 1;
        int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
        b = i11 % 128;
        int i12 = i11 % 2;
        return z;
    }

    @Override // ivas.gov.bisp.enumeration.p087j.z
    public boolean l(KeyEvent keyEvent) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-12)) | ((~i2) & 11);
        int i4 = -(-((i2 & 11) << 1));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        if (keyEvent.getAction() == 1) {
            int i7 = b;
            int i8 = (i7 ^ 11) + ((i7 & 11) << 1);
            a = i8 % 128;
            int i9 = i8 % 2;
            this.c.a();
            if (i9 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i10 = a;
            int i11 = ((i10 ^ 85) | (i10 & 85)) << 1;
            int i12 = -(((~i10) & 85) | (i10 & (-86)));
            int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
            b = i13 % 128;
            int i14 = i13 % 2;
        }
        int i15 = b;
        int i16 = (i15 & 49) + (i15 | 49);
        a = i16 % 128;
        if (i16 % 2 != 0) {
            int i17 = 96 / 0;
        }
        return true;
    }

    @Override // ivas.gov.bisp.enumeration.p087j.z
    public void p(boolean z) {
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 ^ 73) | (i3 & 73)) << 1;
        int i5 = -(((~i3) & 73) | (i3 & (-74)));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        int i7 = i6 % 128;
        a = i7;
        int i8 = i6 % 2;
        if (!z) {
            int i9 = i7 + 59;
            b = i9 % 128;
            int i10 = i9 % 2;
            i = 0;
        } else {
            int i11 = (i7 & (-12)) | ((~i7) & 11);
            int i12 = -(-((i7 & 11) << 1));
            int i13 = (i11 ^ i12) + ((i11 & i12) << 1);
            b = i13 % 128;
            i = i13 % 2 == 0 ? 3 : 4;
        }
        int iO = this.c.o();
        InterfaceC0323y interfaceC0323y = this.c;
        int i14 = b;
        int i15 = (i14 & 55) + (i14 | 55);
        a = i15 % 128;
        if (i15 % 2 == 0) {
            interfaceC0323y.w((i & 4) ^ (iO & (-5)));
            return;
        }
        int i16 = i & 4;
        int i17 = ((i | 4) & (~i16)) | i16;
        int i18 = (~(iO & 99)) & (iO | 99);
        interfaceC0323y.w(((~i17) & i18) | ((~i18) & i17));
    }

    public final class aQM implements p.aIX {
        private static int a = 0;
        private static int b = 1;
        public boolean c;

        public aQM() {
        }

        @Override // androidx.appcompat.view.menu.p.aIX
        public final boolean e(n nVar) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 ^ 115;
            int i4 = (i2 & 115) << 1;
            int i5 = (i3 & i4) + (i4 | i3);
            b = i5 % 128;
            int i6 = i5 % 2;
            S.this.d.onMenuOpened(108, nVar);
            int i7 = a;
            int i8 = (((i7 & (-74)) | ((~i7) & 73)) - (~(-(-((i7 & 73) << 1))))) - 1;
            int i9 = i8 % 128;
            b = i9;
            boolean z = i8 % 2 != 0;
            int i10 = (i9 & (-68)) | ((~i9) & 67);
            int i11 = (i9 & 67) << 1;
            int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
            a = i12 % 128;
            int i13 = i12 % 2;
            return z;
        }

        @Override // androidx.appcompat.view.menu.p.aIX
        public final void b(n nVar, boolean z) {
            Window.Callback callback;
            int i;
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = (i3 ^ 59) + ((i3 & 59) << 1);
            b = i4 % 128;
            int i5 = i4 % 2;
            if (this.c) {
                int i6 = i3 & 43;
                int i7 = ((i3 ^ 43) | i6) << 1;
                int i8 = -((i3 | 43) & (~i6));
                int i9 = (i7 & i8) + (i7 | i8);
                b = i9 % 128;
                if (i9 % 2 == 0) {
                    int i10 = 67 / 0;
                    return;
                }
                return;
            }
            this.c = true;
            S.this.c.n();
            int i11 = a;
            int i12 = i11 & 115;
            int i13 = i12 + ((i11 ^ 115) | i12);
            b = i13 % 128;
            if (i13 % 2 == 0) {
                callback = S.this.d;
                i = 83;
            } else {
                callback = S.this.d;
                i = 108;
            }
            callback.onPanelClosed(i, nVar);
            int i14 = b;
            int i15 = (i14 & 86) + (i14 | 86);
            int i16 = (i15 ^ (-1)) + (i15 << 1);
            a = i16 % 128;
            if (i16 % 2 != 0) {
                this.c = true;
            } else {
                this.c = false;
            }
        }
    }

    @Override // ivas.gov.bisp.enumeration.p087j.z
    public void f(boolean z) {
        int i = 2 % 2;
        int i2 = a + 47;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        if (z == this.g) {
            int i5 = i3 | 73;
            int i6 = i5 << 1;
            int i7 = -(i5 & (~(i3 & 73)));
            int i8 = (i6 & i7) + (i7 | i6);
            a = i8 % 128;
            int i9 = i8 % 2;
            return;
        }
        this.g = z;
        int size = this.i.size();
        int i10 = b;
        int i11 = ((((i10 ^ 119) | (i10 & 119)) << 1) - (~(-(((~i10) & 119) | (i10 & (-120)))))) - 1;
        a = i11 % 128;
        int i12 = i11 % 2;
        int i13 = 0;
        while (i13 < size) {
            int i14 = b;
            int i15 = (i14 & 79) + (i14 | 79);
            a = i15 % 128;
            if (i15 % 2 != 0) {
                this.i.get(i13);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            this.i.get(i13).b(z);
            int i16 = i13 ^ (-104);
            int i17 = (((i13 & (-104)) | i16) << 1) - i16;
            int i18 = i17 & 105;
            i13 = (((i17 | 105) & (~i18)) - (~(i18 << 1))) - 1;
            int i19 = b;
            int i20 = (i19 & (-90)) | ((~i19) & 89);
            int i21 = (i19 & 89) << 1;
            int i22 = (i20 & i21) + (i21 | i20);
            a = i22 % 128;
            int i23 = i22 % 2;
        }
        int i24 = b;
        int i25 = i24 & 125;
        int i26 = i24 | 125;
        int i27 = (i25 & i26) + (i26 | i25);
        a = i27 % 128;
        int i28 = i27 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.p087j.z
    public boolean h() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 117) << 1) - (i2 ^ 117);
        b = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            this.c.j();
            obj.hashCode();
            throw null;
        }
        this.c.j().removeCallbacks(this.j);
        ViewGroup viewGroupJ = this.c.j();
        int i4 = a;
        int i5 = i4 ^ 115;
        int i6 = ((((i4 & 115) | i5) << 1) - (~(-i5))) - 1;
        b = i6 % 128;
        if (i6 % 2 == 0) {
            Runnable runnable = this.j;
            WeakHashMap<View, R> weakHashMap = T.c;
            T.aWX.o(viewGroupJ, runnable);
            throw null;
        }
        Runnable runnable2 = this.j;
        WeakHashMap<View, R> weakHashMap2 = T.c;
        T.aWX.o(viewGroupJ, runnable2);
        int i7 = a;
        int i8 = i7 ^ 1;
        int i9 = (((i7 & 1) | i8) << 1) - i8;
        b = i9 % 128;
        if (i9 % 2 != 0) {
            return true;
        }
        obj.hashCode();
        throw null;
    }

    public final Menu t() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (-2) - (((i2 ^ 2) + ((i2 & 2) << 1)) ^ (-1));
        b = i3 % 128;
        int i4 = i3 % 2;
        if (!this.h) {
            InterfaceC0323y interfaceC0323y = this.c;
            aQM aqm = new aQM();
            aQN aqn = new aQN();
            int i5 = a;
            int i6 = (i5 & 57) + (i5 | 57);
            b = i6 % 128;
            int i7 = i6 % 2;
            interfaceC0323y.h(aqm, aqn);
            this.h = true;
            int i8 = b + 67;
            a = i8 % 128;
            int i9 = i8 % 2;
        }
        Menu menuP = this.c.p();
        int i10 = b;
        int i11 = i10 ^ 41;
        int i12 = (i10 & 41) << 1;
        int i13 = (i11 & i12) + (i12 | i11);
        a = i13 % 128;
        if (i13 % 2 == 0) {
            return menuP;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p087j.z
    public boolean c(int i, KeyEvent keyEvent) {
        int deviceId;
        boolean z;
        int i2 = 2 % 2;
        int i3 = a + 105;
        b = i3 % 128;
        int i4 = i3 % 2;
        Menu menuT = t();
        Object obj = null;
        if (menuT == null) {
            int i5 = a + 3;
            b = i5 % 128;
            if (i5 % 2 != 0) {
                return false;
            }
            throw null;
        }
        int i6 = b;
        int i7 = (i6 & 7) + (i6 | 7);
        a = i7 % 128;
        if (i7 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (keyEvent != null) {
            int i8 = ((i6 ^ 36) + ((i6 & 36) << 1)) - 1;
            a = i8 % 128;
            if (i8 % 2 != 0) {
                keyEvent.getDeviceId();
                obj.hashCode();
                throw null;
            }
            deviceId = keyEvent.getDeviceId();
        } else {
            int i9 = ((i6 & 27) - (~(i6 | 27))) - 1;
            a = i9 % 128;
            int i10 = i9 % 2;
            deviceId = -1;
        }
        if (KeyCharacterMap.load(deviceId).getKeyboardType() == 1) {
            int i11 = b;
            int i12 = ((i11 ^ 25) - (~((i11 & 25) << 1))) - 1;
            a = i12 % 128;
            z = !(i12 % 2 == 0);
            int i13 = i11 & 119;
            int i14 = ((((i11 ^ 119) | i13) << 1) - (~(-((i11 | 119) & (~i13))))) - 1;
            a = i14 % 128;
            int i15 = i14 % 2;
        } else {
            z = true;
        }
        menuT.setQwertyMode(z);
        int i16 = a;
        int i17 = ((i16 | 70) << 1) - (i16 ^ 70);
        int i18 = (i17 ^ (-1)) + (i17 << 1);
        b = i18 % 128;
        int i19 = i18 % 2;
        boolean zPerformShortcut = menuT.performShortcut(i, keyEvent, 0);
        int i20 = a;
        int i21 = (i20 ^ 87) + ((i20 & 87) << 1);
        b = i21 % 128;
        if (i21 % 2 != 0) {
            return zPerformShortcut;
        }
        throw null;
    }
}
