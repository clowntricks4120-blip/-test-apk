package ivas.gov.bisp.enumeration.p087j;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.a;
import ivas.gov.bisp.enumeration.p006af.h;
import ivas.gov.bisp.enumeration.p081d.A;
import ivas.gov.bisp.enumeration.p081d.T;
import ivas.gov.bisp.enumeration.p088k.InterfaceC0323y;
import ivas.gov.bisp.enumeration.p099u.i;
import ivas.gov.bisp.enumeration.p099u.j;
import ivas.gov.bisp.enumeration.p099u.p;
import ivas.gov.bisp.enumeration.p100w.r;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class v extends z implements ActionBarOverlayLayout.OooO0o {
    private static int a = 0;
    private static int b = 1;
    public static final Interpolator c = new AccelerateInterpolator();
    public static final Interpolator d;
    public boolean A;
    public final ivas.gov.bisp.enumeration.p081d.v B;
    public final A C;
    public aQY e;
    public Context f;
    public Context g;
    public ActionBarOverlayLayout h;
    public ActionBarContainer i;
    public ActionBarContextView j;
    public InterfaceC0323y k;
    public View l;
    public boolean m;
    public j n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public j.aQr f99o;
    public boolean p;
    public boolean q;
    public ArrayList<z.aQf> r;
    public int s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public final ivas.gov.bisp.enumeration.p081d.v x;
    public boolean y;
    public p z;

    public class aQV extends r {
        private static int a = 0;
        private static int b = 1;

        public aQV() {
        }

        @Override // ivas.gov.bisp.enumeration.p081d.v
        public void e(View view) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 & 88) + (i2 | 88)) - 1;
            a = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                v vVar = v.this;
                vVar.z = null;
                ActionBarContainer actionBarContainer = vVar.i;
                obj.hashCode();
                throw null;
            }
            v vVar2 = v.this;
            vVar2.z = null;
            ActionBarContainer actionBarContainer2 = vVar2.i;
            int i4 = b;
            int i5 = i4 & 101;
            int i6 = (i4 | 101) & (~i5);
            int i7 = i5 << 1;
            int i8 = ((i6 | i7) << 1) - (i6 ^ i7);
            a = i8 % 128;
            if (i8 % 2 != 0) {
                actionBarContainer2.requestLayout();
                throw null;
            }
            actionBarContainer2.requestLayout();
            int i9 = b;
            int i10 = ((i9 | 97) << 1) - (i9 ^ 97);
            a = i10 % 128;
            if (i10 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    public class aQX implements A {
        public aQX() {
        }
    }

    public class aQY extends j implements n.aII {
        private static int c = 1;
        private static int d;
        public final Context e;
        public j.aQr f;
        public final n g;
        public WeakReference<View> h;

        public aQY(Context context, j.aQr aqr) {
            this.e = context;
            this.f = aqr;
            n nVar = new n(context);
            nVar.m = 1;
            this.g = nVar;
            nVar.h = this;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x002c  */
        /* JADX WARN: Code duplicated, block: B:12:0x0034  */
        /* JADX WARN: Code duplicated, block: B:14:0x003b  */
        /* JADX WARN: Code duplicated, block: B:16:0x0047  */
        /* JADX WARN: Code duplicated, block: B:9:0x001c A[PHI: r1
  0x001c: PHI (r1v5 java.lang.ref.WeakReference<android.view.View>) = (r1v4 java.lang.ref.WeakReference<android.view.View>), (r1v15 java.lang.ref.WeakReference<android.view.View>) binds: [B:8:0x001a, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // ivas.gov.bisp.enumeration.p099u.j
        public View e() {
            WeakReference<View> weakReference;
            int i;
            int i2;
            int i3 = 2 % 2;
            int i4 = d + 65;
            int i5 = i4 % 128;
            c = i5;
            View view = null;
            if (i4 % 2 == 0) {
                weakReference = this.h;
                int i6 = 95 / 0;
                if (weakReference != null) {
                    int i7 = i5 & 125;
                    i = (i7 - (~((i5 ^ 125) | i7))) - 1;
                    d = i % 128;
                    if (i % 2 == 0) {
                        weakReference.get();
                        throw null;
                    }
                    view = weakReference.get();
                } else {
                    i2 = (i5 & 117) + (i5 | 117);
                    d = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i8 = 4 / 3;
                    }
                }
            } else {
                weakReference = this.h;
                if (weakReference != null) {
                    int i9 = i5 & 125;
                    i = (i9 - (~((i5 ^ 125) | i9))) - 1;
                    d = i % 128;
                    if (i % 2 == 0) {
                        weakReference.get();
                        throw null;
                    }
                    view = weakReference.get();
                } else {
                    i2 = (i5 & 117) + (i5 | 117);
                    d = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i10 = 4 / 3;
                    }
                }
            }
            int i11 = d + 33;
            c = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 45 / 0;
            }
            return view;
        }

        @Override // ivas.gov.bisp.enumeration.p099u.j
        public MenuInflater f() {
            int i = 2 % 2;
            i iVar = new i(this.e);
            int i2 = d;
            int i3 = ((i2 ^ 105) | (i2 & 105)) << 1;
            int i4 = -(((~i2) & 105) | (i2 & (-106)));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            c = i5 % 128;
            if (i5 % 2 != 0) {
                return iVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.p099u.j
        public Menu g() {
            int i = 2 % 2;
            int i2 = d;
            int i3 = i2 & 79;
            int i4 = (i2 | 79) & (~i3);
            int i5 = -(-(i3 << 1));
            int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
            c = i6 % 128;
            if (i6 % 2 != 0) {
                return this.g;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.p099u.j
        public CharSequence h() {
            int i = 2 % 2;
            int i2 = d;
            int i3 = i2 & 39;
            int i4 = (i2 | 39) & (~i3);
            int i5 = i3 << 1;
            int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
            c = i6 % 128;
            if (i6 % 2 == 0) {
                v.this.j.getSubtitle();
                throw null;
            }
            CharSequence subtitle = v.this.j.getSubtitle();
            int i7 = c;
            int i8 = i7 ^ 99;
            int i9 = -(-((i7 & 99) << 1));
            int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
            d = i10 % 128;
            int i11 = i10 % 2;
            return subtitle;
        }

        @Override // ivas.gov.bisp.enumeration.p099u.j
        public CharSequence i() {
            int i = 2 % 2;
            int i2 = c;
            int i3 = i2 ^ 101;
            int i4 = (((i2 & 101) | i3) << 1) - i3;
            d = i4 % 128;
            int i5 = i4 % 2;
            ActionBarContextView actionBarContextView = v.this.j;
            if (i5 == 0) {
                return actionBarContextView.getTitle();
            }
            actionBarContextView.getTitle();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.p099u.j
        public void m(int i) {
            int i2 = 2 % 2;
            int i3 = c;
            int i4 = ((i3 | 23) << 1) - (i3 ^ 23);
            d = i4 % 128;
            if (i4 % 2 != 0) {
                v.this.f.getResources().getString(i);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String string = v.this.f.getResources().getString(i);
            int i5 = c + 123;
            d = i5 % 128;
            if (i5 % 2 != 0) {
                v.this.j.setTitle(string);
                int i6 = 66 / 0;
            } else {
                v.this.j.setTitle(string);
            }
            int i7 = c;
            int i8 = i7 | 55;
            int i9 = i8 << 1;
            int i10 = -((~(i7 & 55)) & i8);
            int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
            d = i11 % 128;
            int i12 = i11 % 2;
        }

        @Override // ivas.gov.bisp.enumeration.p099u.j
        public void n(CharSequence charSequence) {
            int i = 2 % 2;
            int i2 = d;
            int i3 = i2 & 73;
            int i4 = -(-((i2 ^ 73) | i3));
            int i5 = (i3 & i4) + (i4 | i3);
            c = i5 % 128;
            int i6 = i5 % 2;
            v.this.j.setSubtitle(charSequence);
            int i7 = d;
            int i8 = (((i7 | 72) << 1) - (i7 ^ 72)) - 1;
            c = i8 % 128;
            int i9 = i8 % 2;
        }

        @Override // ivas.gov.bisp.enumeration.p099u.j
        public void o(CharSequence charSequence) {
            int i = 2 % 2;
            int i2 = d + 55;
            c = i2 % 128;
            if (i2 % 2 == 0) {
                v.this.j.setTitle(charSequence);
                int i3 = 98 / 0;
            } else {
                v.this.j.setTitle(charSequence);
            }
            int i4 = c;
            int i5 = i4 & 119;
            int i6 = ((i4 | 119) & (~i5)) + (i5 << 1);
            d = i6 % 128;
            int i7 = i6 % 2;
        }

        @Override // androidx.appcompat.view.menu.n.aII
        public boolean b(n nVar, MenuItem menuItem) {
            int i = 2 % 2;
            int i2 = d;
            int i3 = (i2 & (-48)) | ((~i2) & 47);
            int i4 = (i2 & 47) << 1;
            int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
            int i6 = i5 % 128;
            c = i6;
            int i7 = i5 % 2;
            j.aQr aqr = this.f;
            if (aqr == null) {
                int i8 = i6 + 37;
                d = i8 % 128;
                int i9 = i8 % 2;
                return false;
            }
            int i10 = ((i2 & 44) + (i2 | 44)) - 1;
            c = i10 % 128;
            if (i10 % 2 != 0) {
                return aqr.e(this, menuItem);
            }
            boolean zE = aqr.e(this, menuItem);
            int i11 = 21 / 0;
            return zE;
        }

        @Override // ivas.gov.bisp.enumeration.p099u.j
        public boolean j() {
            int i = 2 % 2;
            int i2 = d;
            int i3 = i2 & 111;
            int i4 = ((i2 | 111) & (~i3)) + (i3 << 1);
            c = i4 % 128;
            int i5 = i4 % 2;
            boolean z = v.this.j.t;
            int i6 = d;
            int i7 = ((((i6 ^ 121) | (i6 & 121)) << 1) - (~(-(((~i6) & 121) | (i6 & (-122)))))) - 1;
            c = i7 % 128;
            if (i7 % 2 != 0) {
                return z;
            }
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.p099u.j
        public void k(View view) {
            int i = 2 % 2;
            v.this.j.setCustomView(view);
            WeakReference<View> weakReference = new WeakReference<>(view);
            int i2 = d;
            int i3 = (i2 & (-6)) | ((~i2) & 5);
            int i4 = -(-((i2 & 5) << 1));
            int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
            c = i5 % 128;
            int i6 = i5 % 2;
            this.h = weakReference;
            int i7 = i2 & 125;
            int i8 = (i2 ^ 125) | i7;
            int i9 = (i7 & i8) + (i8 | i7);
            c = i9 % 128;
            if (i9 % 2 == 0) {
                throw null;
            }
        }

        @Override // ivas.gov.bisp.enumeration.p099u.j
        public void l(int i) {
            int i2 = 2 % 2;
            int i3 = c;
            int i4 = (i3 & 106) + (i3 | 106);
            int i5 = (i4 ^ (-1)) + (i4 << 1);
            d = i5 % 128;
            int i6 = i5 % 2;
            String string = v.this.f.getResources().getString(i);
            int i7 = d;
            int i8 = i7 & 123;
            int i9 = -(-(i7 | 123));
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            c = i10 % 128;
            if (i10 % 2 != 0) {
                v.this.j.setSubtitle(string);
                return;
            }
            v.this.j.setSubtitle(string);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.p099u.j
        public void p(boolean z) {
            int i = 2 % 2;
            int i2 = d;
            int i3 = i2 & 87;
            int i4 = (i2 ^ 87) | i3;
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            c = i5 % 128;
            Object obj = null;
            if (i5 % 2 == 0) {
                this.b = z;
                v.this.j.setTitleOptional(z);
                throw null;
            }
            this.b = z;
            v.this.j.setTitleOptional(z);
            int i6 = c;
            int i7 = i6 & 3;
            int i8 = (((i6 ^ 3) | i7) << 1) - ((i6 | 3) & (~i7));
            d = i8 % 128;
            if (i8 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.p099u.j
        public void c() {
            int i = 2 % 2;
            int i2 = d;
            int i3 = i2 & 103;
            int i4 = i3 + ((i2 ^ 103) | i3);
            c = i4 % 128;
            int i5 = i4 % 2;
            Object obj = null;
            if (v.this.e != this) {
                int i6 = c;
                int i7 = ((i6 ^ 69) | (i6 & 69)) << 1;
                int i8 = -(((~i6) & 69) | (i6 & (-70)));
                int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
                d = i9 % 128;
                if (i9 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            this.g.A();
            try {
                j.aQr aqr = this.f;
                int i10 = d + 87;
                c = i10 % 128;
                int i11 = i10 % 2;
                aqr.d(this, this.g);
                n nVar = this.g;
                int i12 = d;
                int i13 = i12 & 17;
                int i14 = (i12 | 17) & (~i13);
                int i15 = -(-(i13 << 1));
                int i16 = (i14 & i15) + (i14 | i15);
                c = i16 % 128;
                if (i16 % 2 != 0) {
                    nVar.v();
                } else {
                    nVar.v();
                    obj.hashCode();
                    throw null;
                }
            } catch (Throwable th) {
                this.g.v();
                throw th;
            }
        }

        @Override // androidx.appcompat.view.menu.n.aII
        public void e(n nVar) {
            int i = 2 % 2;
            int i2 = c;
            int i3 = i2 & 81;
            int i4 = i3 + ((i2 ^ 81) | i3);
            int i5 = i4 % 128;
            d = i5;
            Object obj = null;
            if (i4 % 2 != 0) {
                throw null;
            }
            if (this.f == null) {
                int i6 = i5 + 65;
                c = i6 % 128;
                int i7 = i6 % 2;
                return;
            }
            c();
            a aVar = v.this.j.h;
            int i8 = d;
            int i9 = (-2) - (((i8 & 102) + (i8 | 102)) ^ (-1));
            int i10 = i9 % 128;
            c = i10;
            if (i9 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (aVar != null) {
                int i11 = (i10 & (-82)) | ((~i10) & 81);
                int i12 = (i10 & 81) << 1;
                int i13 = (i11 ^ i12) + ((i11 & i12) << 1);
                d = i13 % 128;
                int i14 = i13 % 2;
                aVar.u();
                int i15 = d + 109;
                c = i15 % 128;
                int i16 = i15 % 2;
            }
            int i17 = c;
            int i18 = i17 & 105;
            int i19 = ((i17 | 105) & (~i18)) + (i18 << 1);
            d = i19 % 128;
            if (i19 % 2 != 0) {
                throw null;
            }
        }

        @Override // ivas.gov.bisp.enumeration.p099u.j
        public void d() {
            int i = 2 % 2;
            int i2 = d;
            int i3 = i2 & 115;
            int i4 = (i2 | 115) & (~i3);
            int i5 = -(-(i3 << 1));
            int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
            c = i6 % 128;
            int i7 = i6 % 2;
            v vVar = v.this;
            Object obj = null;
            if (vVar.e != this) {
                int i8 = c;
                int i9 = i8 & 93;
                int i10 = -(-(i8 | 93));
                int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
                d = i11 % 128;
                if (i11 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            boolean z = vVar.v;
            int i12 = (z ? 1 : 0) & 1;
            if ((((!z ? 1 : 0) | i12) & (~i12)) == 0) {
                int i13 = c + 17;
                d = i13 % 128;
                int i14 = i13 % 2;
                vVar.n = this;
                vVar.f99o = this.f;
                int i15 = d;
                int i16 = i15 & 89;
                int i17 = i15 | 89;
                int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
                c = i18 % 128;
                int i19 = i18 % 2;
            } else {
                this.f.c(this);
                int i20 = d;
                int i21 = ((i20 ^ 64) + ((i20 & 64) << 1)) - 1;
                c = i21 % 128;
                int i22 = i21 % 2;
            }
            this.f = null;
            v.this.t(false);
            v vVar2 = v.this;
            int i23 = c;
            int i24 = i23 & 1;
            int i25 = -(-((i23 ^ 1) | i24));
            int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
            d = i26 % 128;
            if (i26 % 2 != 0) {
                View view = vVar2.j.k;
                throw null;
            }
            ActionBarContextView actionBarContextView = vVar2.j;
            if (actionBarContextView.k == null) {
                actionBarContextView.i();
                int i27 = d;
                int i28 = (i27 ^ 21) + ((i27 & 21) << 1);
                c = i28 % 128;
                int i29 = i28 % 2;
            }
            v vVar3 = v.this;
            vVar3.h.setHideOnContentScrollEnabled(vVar3.A);
            int i30 = d;
            int i31 = (i30 & (-122)) | ((~i30) & 121);
            int i32 = -(-((i30 & 121) << 1));
            int i33 = (i31 & i32) + (i32 | i31);
            c = i33 % 128;
            int i34 = i33 % 2;
            v.this.e = null;
            int i35 = d;
            int i36 = (i35 & 95) + (i35 | 95);
            c = i36 % 128;
            int i37 = i36 % 2;
        }
    }

    static {
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
        int i = b;
        int i2 = (((i | 50) << 1) - (i ^ 50)) - 1;
        a = i2 % 128;
        int i3 = i2 % 2;
        d = decelerateInterpolator;
        int i4 = (((i | 96) << 1) - (i ^ 96)) - 1;
        a = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public v(Activity activity, boolean z) {
        new ArrayList();
        this.r = new ArrayList<>();
        this.s = 0;
        this.t = true;
        this.w = true;
        this.B = new aQU();
        this.x = new aQV();
        this.C = new aQX();
        View decorView = activity.getWindow().getDecorView();
        v(decorView);
        if (!z) {
            this.l = decorView.findViewById(R.id.content);
            int i = a;
            int i2 = ((i ^ 44) + ((i & 44) << 1)) - 1;
            b = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
        }
        int i4 = b;
        int i5 = (((i4 | 94) << 1) - (i4 ^ 94)) - 1;
        a = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p087j.z
    public int g() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 17;
        int i4 = (i2 | 17) & (~i3);
        int i5 = i3 << 1;
        int i6 = (i4 & i5) + (i4 | i5);
        b = i6 % 128;
        if (i6 % 2 == 0) {
            this.k.o();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iO = this.k.o();
        int i7 = b + 31;
        a = i7 % 128;
        int i8 = i7 % 2;
        return iO;
    }

    @Override // ivas.gov.bisp.enumeration.p087j.z
    public void n(boolean z) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 | 18) << 1) - (i2 ^ 18)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        if (!this.m) {
            int i5 = (i2 | 77) << 1;
            int i6 = -(((~i2) & 77) | (i2 & (-78)));
            int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
            b = i7 % 128;
            if (i7 % 2 == 0) {
                p(z);
                obj.hashCode();
                throw null;
            }
            p(z);
            int i8 = a;
            int i9 = (i8 ^ 117) + ((i8 & 117) << 1);
            b = i9 % 128;
            int i10 = i9 % 2;
        }
        int i11 = b + 21;
        a = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0032  */
    /* JADX WARN: Code duplicated, block: B:12:0x0036  */
    /* JADX WARN: Code duplicated, block: B:14:0x004a  */
    /* JADX WARN: Code duplicated, block: B:15:0x004e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0052  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    @Override // ivas.gov.bisp.enumeration.p087j.z
    public void o(boolean z) {
        int i;
        int i2;
        Object obj;
        p pVar;
        int i3;
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = ((i5 | 37) << 1) - (i5 ^ 37);
        int i7 = i6 % 128;
        b = i7;
        int i8 = i6 % 2;
        this.y = z;
        if (i8 == 0) {
            int i9 = 79 / 0;
            if (!z) {
                int i10 = i7 & 33;
                i = (((i7 ^ 33) | i10) << 1) - ((i7 | 33) & (~i10));
                i2 = i % 128;
                a = i2;
                obj = null;
                if (i % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                pVar = this.z;
                if (pVar != null) {
                    int i11 = i2 & 67;
                    int i12 = (i2 | 67) & (~i11);
                    int i13 = -(-(i11 << 1));
                    i3 = (i12 & i13) + (i12 | i13);
                    b = i3 % 128;
                    if (i3 % 2 != 0) {
                        pVar.c();
                        throw null;
                    }
                    pVar.c();
                }
            }
        } else if (!z) {
            int i14 = i7 & 33;
            i = (((i7 ^ 33) | i14) << 1) - ((i7 | 33) & (~i14));
            i2 = i % 128;
            a = i2;
            obj = null;
            if (i % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            pVar = this.z;
            if (pVar != null) {
                int i15 = i2 & 67;
                int i16 = (i2 | 67) & (~i15);
                int i17 = -(-(i15 << 1));
                i3 = (i16 & i17) + (i16 | i17);
                b = i3 % 128;
                if (i3 % 2 != 0) {
                    pVar.c();
                    throw null;
                }
                pVar.c();
            }
        }
        int i18 = a;
        int i19 = i18 & 59;
        int i20 = -(-((i18 ^ 59) | i19));
        int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
        b = i21 % 128;
        int i22 = i21 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.p087j.z
    public void q(CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 63) << 1) - (i2 ^ 63);
        b = i3 % 128;
        if (i3 % 2 == 0) {
            this.k.setTitle(charSequence);
            int i4 = 81 / 0;
        } else {
            this.k.setTitle(charSequence);
        }
        int i5 = b;
        int i6 = i5 & 111;
        int i7 = (i5 ^ 111) | i6;
        int i8 = (i6 & i7) + (i7 | i6);
        a = i8 % 128;
        int i9 = i8 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.p087j.z
    public void r(CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = b + 19;
        a = i2 % 128;
        int i3 = i2 % 2;
        this.k.setWindowTitle(charSequence);
        int i4 = b;
        int i5 = (((i4 | 120) << 1) - (i4 ^ 120)) - 1;
        a = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.p087j.z
    public boolean e() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 109) << 1) - (i2 ^ 109);
        b = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        InterfaceC0323y interfaceC0323y = this.k;
        if (interfaceC0323y != null && interfaceC0323y.x()) {
            int i4 = b;
            int i5 = ((i4 ^ 125) | (i4 & 125)) << 1;
            int i6 = -(((~i4) & 125) | (i4 & (-126)));
            int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
            a = i7 % 128;
            int i8 = i7 % 2;
            this.k.collapseActionView();
            return true;
        }
        int i9 = b;
        int i10 = i9 & 63;
        int i11 = ((i9 ^ 63) | i10) << 1;
        int i12 = -((i9 | 63) & (~i10));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        a = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 56 / 0;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
    
        if ((r1 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003e, code lost:
    
        r11 = 36 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        r1 = r2.g;
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if (r1 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        r5 = ivas.gov.bisp.enumeration.p087j.v.a;
        r6 = r5 + 51;
        ivas.gov.bisp.enumeration.p087j.v.b = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        if ((r6 % 2) == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        if (r12 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        r5 = r12.getDeviceId();
        r7 = ivas.gov.bisp.enumeration.p087j.v.a;
        r7 = (-2) - (((r7 & 48) + (r7 | 48)) ^ (-1));
        ivas.gov.bisp.enumeration.p087j.v.b = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
    
        r7 = r5 & 123;
        r5 = (r5 ^ 123) | r7;
        r8 = (r7 & r5) + (r5 | r7);
        ivas.gov.bisp.enumeration.p087j.v.b = r8 % 128;
        r8 = r8 % 2;
        r5 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0079, code lost:
    
        r5 = android.view.KeyCharacterMap.load(r5).getKeyboardType();
        r7 = ivas.gov.bisp.enumeration.p087j.v.b;
        r8 = r7 & 97;
        r8 = (r8 - (~((r7 ^ 97) | r8))) - 1;
        ivas.gov.bisp.enumeration.p087j.v.a = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0090, code lost:
    
        if ((r8 % 2) == 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0092, code lost:
    
        if (r5 != 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0095, code lost:
    
        if (r5 != 1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0097, code lost:
    
        r5 = ((r7 ^ 126) + ((r7 & 126) << 1)) - 1;
        ivas.gov.bisp.enumeration.p087j.v.a = r5 % 128;
        r5 = r5 % 2;
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a5, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a6, code lost:
    
        r1.setQwertyMode(r5);
        r5 = ivas.gov.bisp.enumeration.p087j.v.b;
        r5 = (-2) - (((r5 ^ 44) + ((r5 & 44) << 1)) ^ (-1));
        ivas.gov.bisp.enumeration.p087j.v.a = r5 % 128;
        r5 = r5 % 2;
        r11 = r1.performShortcut(r11, r12, 0);
        r12 = ivas.gov.bisp.enumeration.p087j.v.b;
        r1 = ((r12 & 15) - (~(r12 | 15))) - 1;
        ivas.gov.bisp.enumeration.p087j.v.a = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00cc, code lost:
    
        if ((r1 % 2) != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ce, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00cf, code lost:
    
        r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d2, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d3, code lost:
    
        r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d6, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d7, code lost:
    
        r11 = ivas.gov.bisp.enumeration.p087j.v.a;
        r12 = (r11 ^ 87) + ((r11 & 87) << 1);
        ivas.gov.bisp.enumeration.p087j.v.b = r12 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e4, code lost:
    
        if ((r12 % 2) == 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e6, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e7, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        if (r2 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r2 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        r11 = r1 & 9;
        r12 = -(-((r1 ^ 9) | r11));
        r1 = (r11 ^ r12) + ((r11 & r12) << 1);
        r11 = r1 % 128;
        ivas.gov.bisp.enumeration.p087j.v.a = r11;
        r1 = r1 % 2;
        r12 = r11 ^ 1;
        r11 = ((r11 & 1) | r12) << 1;
        r12 = -r12;
        r1 = (r11 & r12) + (r11 | r12);
        ivas.gov.bisp.enumeration.p087j.v.b = r1 % 128;
     */
    @Override // ivas.gov.bisp.enumeration.p087j.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean c(int r11, android.view.KeyEvent r12) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p087j.v.c(int, android.view.KeyEvent):boolean");
    }

    @Override // ivas.gov.bisp.enumeration.p087j.z
    public void f(boolean z) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 43) - (~(-(-((i2 & 43) << 1))))) - 1;
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        if (z == this.p) {
            int i6 = i4 ^ 59;
            int i7 = (i4 & 59) << 1;
            int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
            a = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 27 / 0;
                return;
            }
            return;
        }
        this.p = z;
        int size = this.r.size();
        int i10 = b;
        int i11 = i10 & 101;
        int i12 = (((i10 | 101) & (~i11)) - (~(-(-(i11 << 1))))) - 1;
        a = i12 % 128;
        int i13 = i12 % 2;
        int i14 = 0;
        while (i14 < size) {
            int i15 = b;
            int i16 = i15 & 97;
            int i17 = i16 + ((i15 ^ 97) | i16);
            a = i17 % 128;
            if (i17 % 2 != 0) {
                this.r.get(i14).b(z);
                int i18 = 64 / 0;
            } else {
                this.r.get(i14).b(z);
            }
            int i19 = b;
            int i20 = (i19 & (-92)) | ((~i19) & 91);
            int i21 = -(-((i19 & 91) << 1));
            int i22 = (i20 ^ i21) + ((i20 & i21) << 1);
            a = i22 % 128;
            int i23 = i22 % 2;
            int i24 = i14 & 1;
            int i25 = ((i14 ^ 1) | i24) << 1;
            int i26 = -((i14 | 1) & (~i24));
            i14 = (i26 | i25) + (i25 & i26);
            int i27 = i19 + 124;
            int i28 = (i27 ^ (-1)) + (i27 << 1);
            a = i28 % 128;
            int i29 = i28 % 2;
        }
        int i30 = a;
        int i31 = (((i30 & (-30)) | ((~i30) & 29)) - (~(-(-((i30 & 29) << 1))))) - 1;
        b = i31 % 128;
        if (i31 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p087j.z
    public void j(Configuration configuration) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 29) + ((i2 & 29) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.f.getResources().getBoolean(ivas.gov.bisp.enumeration.R.bool.abc_action_bar_embed_tabs);
        int i5 = b;
        int i6 = ((i5 & 40) + (i5 | 40)) - 1;
        a = i6 % 128;
        int i7 = i6 % 2;
        x(z);
        int i8 = a;
        int i9 = ((i8 & 29) - (~(i8 | 29))) - 1;
        b = i9 % 128;
        if (i9 % 2 == 0) {
            throw null;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p087j.z
    public void p(boolean z) {
        int i;
        InterfaceC0323y interfaceC0323y;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 | 121) << 1) - (i3 ^ 121);
        a = i4 % 128;
        int i5 = i4 % 2;
        int i6 = 0;
        if (z) {
            int i7 = i3 + 85;
            int i8 = i7 % 128;
            a = i8;
            int i9 = i7 % 2;
            int i10 = ((i8 & (-80)) | ((~i8) & 79)) + ((i8 & 79) << 1);
            b = i10 % 128;
            int i11 = i10 % 2;
            i = 4;
        } else {
            int i12 = i3 + 107;
            a = i12 % 128;
            int i13 = i12 % 2;
            i = 0;
        }
        int iO = this.k.o();
        int i14 = a;
        int i15 = (((i14 & (-26)) | ((~i14) & 25)) - (~((i14 & 25) << 1))) - 1;
        b = i15 % 128;
        if (i15 % 2 == 0) {
            this.m = false;
            interfaceC0323y = this.k;
        } else {
            this.m = true;
            i6 = i & 4;
            interfaceC0323y = this.k;
        }
        int i16 = i14 + 63;
        b = i16 % 128;
        int i17 = i16 % 2;
        int i18 = iO & (-5);
        interfaceC0323y.w((i18 & (~i6)) | ((~i18) & i6));
        int i19 = a;
        int i20 = (i19 & (-84)) | ((~i19) & 83);
        int i21 = (i19 & 83) << 1;
        int i22 = (i20 & i21) + (i21 | i20);
        b = i22 % 128;
        int i23 = i22 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.p087j.z
    public j s(j.aQr aqr) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 75) << 1) - ((i2 & (-76)) | ((~i2) & 75));
        b = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        aQY aqy = this.e;
        if (aqy != null) {
            int i4 = i2 & 41;
            int i5 = i4 + ((i2 ^ 41) | i4);
            b = i5 % 128;
            if (i5 % 2 == 0) {
                aqy.d();
                int i6 = 24 / 0;
            } else {
                aqy.d();
            }
        }
        this.h.setHideOnContentScrollEnabled(false);
        this.j.i();
        aQY aqy2 = new aQY(this.j.getContext(), aqr);
        int i7 = b;
        int i8 = (i7 ^ 119) + ((i7 & 119) << 1);
        a = i8 % 128;
        try {
            if (i8 % 2 != 0) {
                aqy2.g.A();
                j.aQr aqr2 = aqy2.f;
                obj.hashCode();
                throw null;
            }
            aqy2.g.A();
            boolean zB = aqy2.f.b(aqy2, aqy2.g);
            n nVar = aqy2.g;
            int i9 = b + 69;
            a = i9 % 128;
            int i10 = i9 % 2;
            nVar.v();
            if (!zB) {
                int i11 = a;
                int i12 = (i11 & (-62)) | ((~i11) & 61);
                int i13 = -(-((i11 & 61) << 1));
                int i14 = (i12 & i13) + (i13 | i12);
                b = i14 % 128;
                int i15 = i14 % 2;
                return null;
            }
            int i16 = b;
            int i17 = ((i16 ^ 119) | (i16 & 119)) << 1;
            int i18 = -(((~i16) & 119) | (i16 & (-120)));
            int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
            a = i19 % 128;
            int i20 = i19 % 2;
            this.e = aqy2;
            aqy2.c();
            ActionBarContextView actionBarContextView = this.j;
            int i21 = b;
            int i22 = i21 ^ 67;
            int i23 = ((((i21 & 67) | i22) << 1) - (~(-i22))) - 1;
            a = i23 % 128;
            if (i23 % 2 != 0) {
                actionBarContextView.b(aqy2);
                t(false);
            } else {
                actionBarContextView.b(aqy2);
                t(true);
            }
            return aqy2;
        } catch (Throwable th) {
            aqy2.g.v();
            throw th;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p087j.z
    public Context i() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 83;
        int i4 = ((i2 | 83) & (~i3)) + (i3 << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        if (this.g == null) {
            TypedValue typedValue = new TypedValue();
            Context context = this.f;
            int i6 = a;
            int i7 = ((i6 ^ 87) | (i6 & 87)) << 1;
            int i8 = -(((~i6) & 87) | (i6 & (-88)));
            int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
            b = i9 % 128;
            int i10 = i9 % 2;
            context.getTheme().resolveAttribute(ivas.gov.bisp.enumeration.R.attr.actionBarWidgetTheme, typedValue, true);
            int i11 = a + 61;
            b = i11 % 128;
            int i12 = i11 % 2;
            int i13 = typedValue.resourceId;
            if (i13 != 0) {
                ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this.f, i13);
                int i14 = a;
                int i15 = i14 & 109;
                int i16 = (i14 ^ 109) | i15;
                int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
                int i18 = i17 % 128;
                b = i18;
                int i19 = i17 % 2;
                this.g = contextThemeWrapper;
                int i20 = ((i18 | 19) << 1) - (i18 ^ 19);
                a = i20 % 128;
                int i21 = i20 % 2;
            } else {
                this.g = this.f;
                int i22 = (-2) - ((b + 52) ^ (-1));
                a = i22 % 128;
                if (i22 % 2 != 0) {
                    int i23 = 4 / 2;
                }
            }
        }
        Context context2 = this.g;
        int i24 = a + 31;
        b = i24 % 128;
        if (i24 % 2 == 0) {
            int i25 = 86 / 0;
        }
        return context2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:36:0x0109  */
    /* JADX WARN: Code duplicated, block: B:37:0x0115  */
    public final void x(boolean z) {
        boolean z2;
        boolean z3;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 9;
        boolean z4 = true;
        int i4 = ((((i2 ^ 9) | i3) << 1) - (~(-((i2 | 9) & (~i3))))) - 1;
        b = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            this.q = z;
            obj.hashCode();
            throw null;
        }
        this.q = z;
        if (!z) {
            this.k.q(null);
            ActionBarContainer actionBarContainer = this.i;
            int i5 = a;
            int i6 = i5 & 43;
            int i7 = i5 | 43;
            int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
            b = i8 % 128;
            if (i8 % 2 == 0) {
                actionBarContainer.setTabContainer(null);
                obj.hashCode();
                throw null;
            }
            actionBarContainer.setTabContainer(null);
        } else {
            this.i.setTabContainer(null);
            this.k.q(null);
            int i9 = a;
            int i10 = i9 & 69;
            int i11 = ((i9 ^ 69) | i10) << 1;
            int i12 = -((i9 | 69) & (~i10));
            int i13 = (i11 & i12) + (i12 | i11);
            b = i13 % 128;
            int i14 = i13 % 2;
        }
        if (this.k.t() == 2) {
            int i15 = b;
            int i16 = (i15 & 77) + (i15 | 77);
            a = i16 % 128;
            int i17 = i16 % 2;
            int i18 = (((i15 ^ 81) | (i15 & 81)) << 1) - (((~i15) & 81) | (i15 & (-82)));
            a = i18 % 128;
            int i19 = i18 % 2;
            z2 = true;
        } else {
            int i20 = b;
            int i21 = (i20 ^ 99) + ((i20 & 99) << 1);
            a = i21 % 128;
            int i22 = i21 % 2;
            z2 = false;
        }
        InterfaceC0323y interfaceC0323y = this.k;
        if (this.q) {
            int i23 = b;
            int i24 = (((i23 ^ 15) | (i23 & 15)) << 1) - (((~i23) & 15) | (i23 & (-16)));
            a = i24 % 128;
            int i25 = i24 % 2;
            z3 = false;
        } else {
            int i26 = b;
            int i27 = ((i26 | 115) << 1) - (i26 ^ 115);
            a = i27 % 128;
            int i28 = i27 % 2;
            if (!z2) {
                int i29 = b;
                int i210 = (((i29 ^ 15) | (i29 & 15)) << 1) - (((~i29) & 15) | (i29 & (-16)));
                a = i210 % 128;
                int i211 = i210 % 2;
                z3 = false;
            } else {
                int i30 = (i26 ^ 11) + ((i26 & 11) << 1);
                a = i30 % 128;
                z3 = i30 % 2 == 0;
                int i31 = i26 & 71;
                int i32 = -(-(i26 | 71));
                int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
                a = i33 % 128;
                int i34 = i33 % 2;
            }
        }
        interfaceC0323y.A(z3);
        ActionBarOverlayLayout actionBarOverlayLayout = this.h;
        if (this.q) {
            int i35 = b;
            int i36 = i35 ^ 89;
            int i37 = (i35 & 89) << 1;
            int i38 = ((i36 | i37) << 1) - (i37 ^ i36);
            a = i38 % 128;
            int i39 = i38 % 2;
            z4 = false;
        } else {
            int i40 = a;
            int i41 = (i40 ^ 83) + ((i40 & 83) << 1);
            b = i41 % 128;
            if (i41 % 2 == 0) {
                int i42 = 77 / 0;
                if (z2) {
                    int i43 = (i40 ^ 97) + ((i40 & 97) << 1);
                    b = i43 % 128;
                    int i44 = i43 % 2;
                } else {
                    int i310 = b;
                    int i311 = i310 ^ 89;
                    int i312 = (i310 & 89) << 1;
                    int i313 = ((i311 | i312) << 1) - (i312 ^ i311);
                    a = i313 % 128;
                    int i314 = i313 % 2;
                    z4 = false;
                }
            } else if (!(!z2)) {
                int i45 = (i40 ^ 97) + ((i40 & 97) << 1);
                b = i45 % 128;
                int i46 = i45 % 2;
            } else {
                int i315 = b;
                int i316 = i315 ^ 89;
                int i317 = (i315 & 89) << 1;
                int i318 = ((i316 | i317) << 1) - (i317 ^ i316);
                a = i318 % 128;
                int i319 = i318 % 2;
                z4 = false;
            }
        }
        actionBarOverlayLayout.setHasNonEmbeddedTabs(z4);
        int i47 = b + 83;
        a = i47 % 128;
        int i48 = i47 % 2;
    }

    public class aQU extends r {
        private static int a = 0;
        private static int b = 1;

        public aQU() {
        }

        @Override // ivas.gov.bisp.enumeration.p081d.v
        public void e(View view) {
            v vVar;
            int i = 2 % 2;
            int i2 = a + 1;
            b = i2 % 128;
            int i3 = i2 % 2;
            v vVar2 = v.this;
            Object obj = null;
            if (!(!vVar2.t)) {
                int i4 = a;
                int i5 = ((i4 ^ 80) + ((i4 & 80) << 1)) - 1;
                b = i5 % 128;
                if (i5 % 2 == 0) {
                    View view2 = vVar2.l;
                    throw null;
                }
                View view3 = vVar2.l;
                if (view3 != null) {
                    view3.setTranslationY(0.0f);
                    ActionBarContainer actionBarContainer = v.this.i;
                    int i6 = a;
                    int i7 = i6 & 43;
                    int i8 = i7 + ((i6 ^ 43) | i7);
                    b = i8 % 128;
                    int i9 = i8 % 2;
                    actionBarContainer.setTranslationY(0.0f);
                    int i10 = a;
                    int i11 = ((i10 ^ 40) + ((i10 & 40) << 1)) - 1;
                    b = i11 % 128;
                    int i12 = i11 % 2;
                }
            }
            v.this.i.setVisibility(8);
            int i13 = a;
            int i14 = (((i13 ^ 69) | (i13 & 69)) << 1) - (((~i13) & 69) | (i13 & (-70)));
            b = i14 % 128;
            int i15 = i14 % 2;
            v.this.i.setTransitioning(false);
            int i16 = a;
            int i17 = ((i16 | 35) << 1) - (i16 ^ 35);
            b = i17 % 128;
            if (i17 % 2 == 0) {
                vVar = v.this;
                vVar.z = null;
                int i18 = 0 / 0;
            } else {
                vVar = v.this;
                vVar.z = null;
            }
            int i19 = b;
            int i20 = (i19 | 17) << 1;
            int i21 = -(((~i19) & 17) | (i19 & (-18)));
            int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
            a = i22 % 128;
            if (i22 % 2 != 0) {
                j.aQr aqr = vVar.f99o;
                obj.hashCode();
                throw null;
            }
            j.aQr aqr2 = vVar.f99o;
            if (aqr2 != null) {
                aqr2.c(vVar.n);
                vVar.n = null;
                int i23 = a;
                int i24 = ((i23 & (-118)) | ((~i23) & 117)) + ((i23 & 117) << 1);
                b = i24 % 128;
                if (i24 % 2 == 0) {
                    vVar.f99o = null;
                    throw null;
                }
                vVar.f99o = null;
            }
            ActionBarOverlayLayout actionBarOverlayLayout = v.this.h;
            if (actionBarOverlayLayout != null) {
                int i25 = a + 5;
                b = i25 % 128;
                if (i25 % 2 == 0) {
                    WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
                    T.aXd.d(actionBarOverlayLayout);
                    int i26 = 28 / 0;
                } else {
                    WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap2 = T.c;
                    T.aXd.d(actionBarOverlayLayout);
                }
                int i27 = b;
                int i28 = i27 & 21;
                int i29 = ((i27 ^ 21) | i28) << 1;
                int i30 = -((i27 | 21) & (~i28));
                int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
                a = i31 % 128;
                int i32 = i31 % 2;
            }
            int i33 = a;
            int i34 = i33 & 89;
            int i35 = -(-((i33 ^ 89) | i34));
            int i36 = (i34 & i35) + (i35 | i34);
            b = i36 % 128;
            if (i36 % 2 == 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0216  */
    /* JADX WARN: Code duplicated, block: B:56:0x0229  */
    /* JADX WARN: Code duplicated, block: B:59:0x0256  */
    /* JADX WARN: Code duplicated, block: B:61:0x0269  */
    /* JADX WARN: Code duplicated, block: B:62:0x0271  */
    /* JADX WARN: Code duplicated, block: B:65:0x0287  */
    /* JADX WARN: Code duplicated, block: B:68:0x029c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:69:0x029d  */
    /* JADX WARN: Code duplicated, block: B:70:0x029e  */
    public final void v(View view) {
        String simpleName;
        InterfaceC0323y wrapper;
        boolean z;
        boolean z2;
        TypedArray typedArrayObtainStyledAttributes;
        int dimensionPixelSize;
        int i;
        int i2;
        ActionBarContainer actionBarContainer;
        int i3;
        ActionBarOverlayLayout actionBarOverlayLayout;
        int i4 = 2 % 2;
        int i5 = b + 45;
        a = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            this.h = (ActionBarOverlayLayout) view.findViewById(ivas.gov.bisp.enumeration.R.id.decor_content_parent);
            obj.hashCode();
            throw null;
        }
        ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) view.findViewById(ivas.gov.bisp.enumeration.R.id.decor_content_parent);
        this.h = actionBarOverlayLayout2;
        if (actionBarOverlayLayout2 != null) {
            int i6 = a;
            int i7 = i6 & 125;
            int i8 = ((i6 | 125) & (~i7)) + (i7 << 1);
            b = i8 % 128;
            if (i8 % 2 == 0) {
                actionBarOverlayLayout2.setActionBarVisibilityCallback(this);
                int i9 = 95 / 0;
            } else {
                actionBarOverlayLayout2.setActionBarVisibilityCallback(this);
            }
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(ivas.gov.bisp.enumeration.R.id.action_bar);
        if (callbackFindViewById instanceof InterfaceC0323y) {
            int i10 = a;
            int i11 = ((i10 | 51) << 1) - (i10 ^ 51);
            b = i11 % 128;
            int i12 = i11 % 2;
            wrapper = (InterfaceC0323y) callbackFindViewById;
            int i13 = i10 + 89;
            b = i13 % 128;
            int i14 = i13 % 2;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("Can't make a decor toolbar out of ");
                if (callbackFindViewById != null) {
                    int i15 = a;
                    int i16 = ((i15 & (-50)) | ((~i15) & 49)) + ((i15 & 49) << 1);
                    b = i16 % 128;
                    int i17 = i16 % 2;
                    simpleName = callbackFindViewById.getClass().getSimpleName();
                    int i18 = a;
                    int i19 = (-2) - ((((i18 | 24) << 1) - (i18 ^ 24)) ^ (-1));
                    b = i19 % 128;
                    int i20 = i19 % 2;
                } else {
                    int i21 = a;
                    int i22 = i21 | 81;
                    int i23 = i22 << 1;
                    int i24 = -((~(i21 & 81)) & i22);
                    int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
                    b = i25 % 128;
                    int i26 = i25 % 2;
                    simpleName = "null";
                }
                sbW.append(simpleName);
                throw new IllegalStateException(sbW.toString());
            }
            int i27 = a;
            int i28 = i27 & 85;
            int i29 = -(-((i27 ^ 85) | i28));
            int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
            b = i30 % 128;
            if (i30 % 2 == 0) {
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
                int i31 = 81 / 0;
            } else {
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            int i32 = b;
            int i33 = i32 & 73;
            int i34 = -(-((i32 ^ 73) | i33));
            int i35 = ((i33 | i34) << 1) - (i34 ^ i33);
            a = i35 % 128;
            int i36 = i35 % 2;
        }
        this.k = wrapper;
        View viewFindViewById = view.findViewById(ivas.gov.bisp.enumeration.R.id.action_context_bar);
        int i37 = a;
        int i38 = (i37 | 81) << 1;
        int i39 = -(((~i37) & 81) | (i37 & (-82)));
        int i40 = (i38 ^ i39) + ((i39 & i38) << 1);
        b = i40 % 128;
        if (i40 % 2 == 0) {
            this.j = (ActionBarContextView) viewFindViewById;
            view.findViewById(ivas.gov.bisp.enumeration.R.id.action_bar_container);
            throw null;
        }
        this.j = (ActionBarContextView) viewFindViewById;
        ActionBarContainer actionBarContainer2 = (ActionBarContainer) view.findViewById(ivas.gov.bisp.enumeration.R.id.action_bar_container);
        this.i = actionBarContainer2;
        InterfaceC0323y interfaceC0323y = this.k;
        int i41 = b;
        int i42 = i41 ^ 43;
        int i43 = ((i41 & 43) | i42) << 1;
        int i44 = -i42;
        int i45 = (i43 & i44) + (i43 | i44);
        int i46 = i45 % 128;
        a = i46;
        int i47 = i45 % 2;
        if (interfaceC0323y != null) {
            int i48 = i46 + 47;
            b = i48 % 128;
            if (i48 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (this.j != null) {
                int i49 = i46 & 83;
                int i50 = i49 + ((i46 ^ 83) | i49);
                int i51 = i50 % 128;
                b = i51;
                if (i50 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                if (actionBarContainer2 != null) {
                    int i52 = i51 & 19;
                    int i53 = i51 | 19;
                    int i54 = ((i52 | i53) << 1) - (i52 ^ i53);
                    a = i54 % 128;
                    int i55 = i54 % 2;
                    this.f = interfaceC0323y.u();
                    InterfaceC0323y interfaceC0323y2 = this.k;
                    int i56 = a;
                    int i57 = (i56 ^ 73) + ((i56 & 73) << 1);
                    b = i57 % 128;
                    int i58 = i57 % 2;
                    if ((interfaceC0323y2.o() & 4) != 0) {
                        int i59 = b;
                        int i60 = ((i59 | 75) << 1) - (i59 ^ 75);
                        a = i60 % 128;
                        int i61 = i60 % 2;
                        z = true;
                    } else {
                        int i62 = a;
                        int i63 = i62 & 99;
                        int i64 = i63 + ((i62 ^ 99) | i63);
                        b = i64 % 128;
                        int i65 = i64 % 2;
                        z = false;
                    }
                    if (z) {
                        int i66 = b;
                        int i67 = i66 & 17;
                        int i68 = (((i66 | 17) & (~i67)) - (~(i67 << 1))) - 1;
                        a = i68 % 128;
                        if (i68 % 2 != 0) {
                            this.m = false;
                        } else {
                            this.m = true;
                        }
                    }
                    Context context = this.f;
                    if (context.getApplicationInfo().targetSdkVersion >= 14) {
                        int i69 = a;
                        int i70 = (i69 & 31) + (i69 | 31);
                        b = i70 % 128;
                        int i71 = i70 % 2;
                        int i72 = i69 & 121;
                        int i73 = (((i69 ^ 121) | i72) << 1) - ((~i72) & (i69 | 121));
                        b = i73 % 128;
                        if (i73 % 2 == 0) {
                            throw null;
                        }
                        if (!z) {
                            int i74 = i69 & 75;
                            int i75 = (i69 ^ 75) | i74;
                            int i76 = (i74 ^ i75) + ((i74 & i75) << 1);
                            b = i76 % 128;
                            int i77 = i76 % 2;
                            z2 = false;
                        }
                        this.k.s(z2);
                        Resources resources = context.getResources();
                        int i78 = b + 33;
                        a = i78 % 128;
                        int i79 = i78 % 2;
                        x(resources.getBoolean(ivas.gov.bisp.enumeration.R.bool.abc_action_bar_embed_tabs));
                        Context context2 = this.f;
                        int i80 = b;
                        int i81 = (((i80 & (-74)) | ((~i80) & 73)) - (~(-(-((i80 & 73) << 1))))) - 1;
                        a = i81 % 128;
                        int i82 = i81 % 2;
                        typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(null, h.d, ivas.gov.bisp.enumeration.R.attr.actionBarStyle, 0);
                        int i83 = b;
                        int i84 = i83 & 11;
                        int i85 = (((i83 | 11) & (~i84)) - (~(i84 << 1))) - 1;
                        a = i85 % 128;
                        int i86 = i85 % 2;
                        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
                            int i87 = b;
                            int i88 = i87 & 93;
                            int i89 = i88 + ((i87 ^ 93) | i88);
                            a = i89 % 128;
                            int i90 = i89 % 2;
                            actionBarOverlayLayout = this.h;
                            if (actionBarOverlayLayout.b) {
                                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                            }
                            int i91 = a;
                            int i92 = ((i91 | 7) << 1) - (i91 ^ 7);
                            b = i92 % 128;
                            int i93 = i92 % 2;
                            this.A = true;
                            actionBarOverlayLayout.setHideOnContentScrollEnabled(true);
                            int i94 = a;
                            int i95 = i94 & 91;
                            int i96 = (((i94 | 91) & (~i95)) - (~(-(-(i95 << 1))))) - 1;
                            b = i96 % 128;
                            int i97 = i96 % 2;
                        }
                        dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
                        if (dimensionPixelSize != 0) {
                            int i98 = b;
                            i2 = ((i98 | 17) << 1) - ((17 & (~i98)) | (i98 & (-18)));
                            a = i2 % 128;
                            float f = dimensionPixelSize;
                            if (i2 % 2 != 0) {
                                actionBarContainer = this.i;
                                WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
                                int i99 = 26 / 0;
                            } else {
                                actionBarContainer = this.i;
                                WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap2 = T.c;
                            }
                            T.aXb.t(actionBarContainer, f);
                            int i100 = a;
                            i3 = ((i100 & 114) + (i100 | 114)) - 1;
                            b = i3 % 128;
                            if (i3 % 2 == 0) {
                                int i101 = 3 % 2;
                            }
                        }
                        typedArrayObtainStyledAttributes.recycle();
                        int i102 = b;
                        int i103 = i102 ^ 105;
                        i = (((i102 & 105) | i103) << 1) - i103;
                        a = i % 128;
                        if (i % 2 == 0) {
                            throw null;
                        }
                        return;
                    }
                    int i104 = b;
                    int i105 = i104 + 107;
                    a = i105 % 128;
                    int i106 = i105 % 2;
                    int i107 = i104 & 59;
                    int i108 = i107 + ((i104 ^ 59) | i107);
                    a = i108 % 128;
                    if (i108 % 2 != 0) {
                        int i109 = 5 / 5;
                    }
                    int i110 = a;
                    int i111 = i110 & 23;
                    int i112 = (i110 ^ 23) | i111;
                    int i113 = ((i111 | i112) << 1) - (i112 ^ i111);
                    b = i113 % 128;
                    int i114 = i113 % 2;
                    z2 = true;
                    this.k.s(z2);
                    Resources resources2 = context.getResources();
                    int i710 = b + 33;
                    a = i710 % 128;
                    int i711 = i710 % 2;
                    x(resources2.getBoolean(ivas.gov.bisp.enumeration.R.bool.abc_action_bar_embed_tabs));
                    Context context3 = this.f;
                    int i810 = b;
                    int i811 = (((i810 & (-74)) | ((~i810) & 73)) - (~(-(-((i810 & 73) << 1))))) - 1;
                    a = i811 % 128;
                    int i812 = i811 % 2;
                    typedArrayObtainStyledAttributes = context3.obtainStyledAttributes(null, h.d, ivas.gov.bisp.enumeration.R.attr.actionBarStyle, 0);
                    int i813 = b;
                    int i814 = i813 & 11;
                    int i815 = (((i813 | 11) & (~i814)) - (~(i814 << 1))) - 1;
                    a = i815 % 128;
                    int i816 = i815 % 2;
                    if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
                        int i817 = b;
                        int i818 = i817 & 93;
                        int i819 = i818 + ((i817 ^ 93) | i818);
                        a = i819 % 128;
                        int i910 = i819 % 2;
                        actionBarOverlayLayout = this.h;
                        if (actionBarOverlayLayout.b) {
                            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                        }
                        int i911 = a;
                        int i912 = ((i911 | 7) << 1) - (i911 ^ 7);
                        b = i912 % 128;
                        int i913 = i912 % 2;
                        this.A = true;
                        actionBarOverlayLayout.setHideOnContentScrollEnabled(true);
                        int i914 = a;
                        int i915 = i914 & 91;
                        int i916 = (((i914 | 91) & (~i915)) - (~(-(-(i915 << 1))))) - 1;
                        b = i916 % 128;
                        int i917 = i916 % 2;
                    }
                    dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
                    if (dimensionPixelSize != 0) {
                        int i918 = b;
                        i2 = ((i918 | 17) << 1) - ((17 & (~i918)) | (i918 & (-18)));
                        a = i2 % 128;
                        float f2 = dimensionPixelSize;
                        if (i2 % 2 != 0) {
                            actionBarContainer = this.i;
                            WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap3 = T.c;
                            int i919 = 26 / 0;
                        } else {
                            actionBarContainer = this.i;
                            WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap4 = T.c;
                        }
                        T.aXb.t(actionBarContainer, f2);
                        int i1010 = a;
                        i3 = ((i1010 & 114) + (i1010 | 114)) - 1;
                        b = i3 % 128;
                        if (i3 % 2 == 0) {
                            int i1011 = 3 % 2;
                        }
                    }
                    typedArrayObtainStyledAttributes.recycle();
                    int i1012 = b;
                    int i1013 = i1012 ^ 105;
                    i = (((i1012 & 105) | i1013) << 1) - i1013;
                    a = i % 128;
                    if (i % 2 == 0) {
                        throw null;
                    }
                    return;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(v.class.getSimpleName());
        sb.append(" can only be used with a compatible window decor layout");
        throw new IllegalStateException(sb.toString());
    }

    public v(Dialog dialog) {
        new ArrayList();
        this.r = new ArrayList<>();
        this.s = 0;
        this.t = true;
        this.w = true;
        this.B = new aQU();
        this.x = new aQV();
        this.C = new aQX();
        v(dialog.getWindow().getDecorView());
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:12:0x0037  */
    /* JADX WARN: Code duplicated, block: B:15:0x003e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0044 A[PHI: r1
  0x0044: PHI (r1v46 androidx.appcompat.widget.ActionBarOverlayLayout) = (r1v45 androidx.appcompat.widget.ActionBarOverlayLayout), (r1v61 androidx.appcompat.widget.ActionBarOverlayLayout) binds: [B:16:0x0042, B:13:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x0073  */
    /* JADX WARN: Code duplicated, block: B:21:0x0077  */
    /* JADX WARN: Code duplicated, block: B:23:0x0090  */
    /* JADX WARN: Code duplicated, block: B:8:0x0026  */
    public void t(boolean z) {
        ActionBarOverlayLayout actionBarOverlayLayout;
        ivas.gov.bisp.enumeration.p081d.R rV;
        ivas.gov.bisp.enumeration.p081d.R rH;
        long duration;
        int i;
        ActionBarOverlayLayout actionBarOverlayLayout2;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 & (-110)) | ((~i3) & 109);
        int i5 = -(-((i3 & 109) << 1));
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        int i7 = i6 % 128;
        a = i7;
        if (i6 % 2 != 0) {
            int i8 = 26 / 0;
            if (z) {
                if (!this.u) {
                    int i9 = i3 & 63;
                    int i10 = (~i9) & (i3 | 63);
                    int i11 = -(-(i9 << 1));
                    int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
                    a = i12 % 128;
                    int i13 = i12 % 2;
                    this.u = true;
                    actionBarOverlayLayout = this.h;
                    if (actionBarOverlayLayout != null) {
                        int i14 = i3 & 109;
                        int i15 = i14 + ((i3 ^ 109) | i14);
                        a = i15 % 128;
                        int i16 = i15 % 2;
                        actionBarOverlayLayout.setShowingForActionMode(true);
                        int i17 = b + 11;
                        a = i17 % 128;
                        int i18 = i17 % 2;
                    }
                    w(false);
                    int i19 = a;
                    int i20 = (i19 & 15) + (i19 | 15);
                    b = i20 % 128;
                    int i21 = i20 % 2;
                }
            } else if (this.u) {
                int i22 = i7 & 27;
                i = i22 + ((i7 ^ 27) | i22);
                b = i % 128;
                if (i % 2 == 0) {
                    this.u = true;
                    actionBarOverlayLayout2 = this.h;
                    if (actionBarOverlayLayout2 != null) {
                        actionBarOverlayLayout2.setShowingForActionMode(false);
                        int i23 = b;
                        int i24 = i23 & 43;
                        int i25 = ((((i23 ^ 43) | i24) << 1) - (~(-((i23 | 43) & (~i24))))) - 1;
                        a = i25 % 128;
                        int i26 = i25 % 2;
                    }
                } else {
                    this.u = false;
                    actionBarOverlayLayout2 = this.h;
                    if (actionBarOverlayLayout2 != null) {
                        actionBarOverlayLayout2.setShowingForActionMode(false);
                        int i27 = b;
                        int i28 = i27 & 43;
                        int i29 = ((((i27 ^ 43) | i28) << 1) - (~(-((i27 | 43) & (~i28))))) - 1;
                        a = i29 % 128;
                        int i210 = i29 % 2;
                    }
                }
                w(false);
                int i30 = b;
                int i31 = i30 & 25;
                int i32 = -(-((i30 ^ 25) | i31));
                int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
                a = i33 % 128;
                int i34 = i33 % 2;
            }
        } else if (!z) {
            if (this.u) {
                int i211 = i7 & 27;
                i = i211 + ((i7 ^ 27) | i211);
                b = i % 128;
                if (i % 2 == 0) {
                    this.u = true;
                    actionBarOverlayLayout2 = this.h;
                    if (actionBarOverlayLayout2 != null) {
                        actionBarOverlayLayout2.setShowingForActionMode(false);
                        int i212 = b;
                        int i213 = i212 & 43;
                        int i214 = ((((i212 ^ 43) | i213) << 1) - (~(-((i212 | 43) & (~i213))))) - 1;
                        a = i214 % 128;
                        int i215 = i214 % 2;
                    }
                } else {
                    this.u = false;
                    actionBarOverlayLayout2 = this.h;
                    if (actionBarOverlayLayout2 != null) {
                        actionBarOverlayLayout2.setShowingForActionMode(false);
                        int i216 = b;
                        int i217 = i216 & 43;
                        int i218 = ((((i216 ^ 43) | i217) << 1) - (~(-((i216 | 43) & (~i217))))) - 1;
                        a = i218 % 128;
                        int i219 = i218 % 2;
                    }
                }
                w(false);
                int i35 = b;
                int i36 = i35 & 25;
                int i37 = -(-((i35 ^ 25) | i36));
                int i38 = (i36 ^ i37) + ((i37 & i36) << 1);
                a = i38 % 128;
                int i39 = i38 % 2;
            }
        } else if (!this.u) {
            int i40 = i3 & 63;
            int i110 = (~i40) & (i3 | 63);
            int i111 = -(-(i40 << 1));
            int i112 = (i110 ^ i111) + ((i111 & i110) << 1);
            a = i112 % 128;
            int i113 = i112 % 2;
            this.u = true;
            actionBarOverlayLayout = this.h;
            if (actionBarOverlayLayout != null) {
                int i114 = i3 & 109;
                int i115 = i114 + ((i3 ^ 109) | i114);
                a = i115 % 128;
                int i116 = i115 % 2;
                actionBarOverlayLayout.setShowingForActionMode(true);
                int i117 = b + 11;
                a = i117 % 128;
                int i118 = i117 % 2;
            }
            w(false);
            int i119 = a;
            int i220 = (i119 & 15) + (i119 | 15);
            b = i220 % 128;
            int i221 = i220 % 2;
        }
        ActionBarContainer actionBarContainer = this.i;
        WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
        if (!T.aXa.d(actionBarContainer)) {
            if (!z) {
                this.k.i(0);
                ActionBarContextView actionBarContextView = this.j;
                int i41 = a;
                int i42 = (i41 & (-14)) | ((~i41) & 13);
                int i43 = -(-((i41 & 13) << 1));
                int i44 = (i42 ^ i43) + ((i43 & i42) << 1);
                b = i44 % 128;
                int i45 = i44 % 2;
                actionBarContextView.setVisibility(8);
                int i46 = a + 89;
                b = i46 % 128;
                int i47 = i46 % 2;
                return;
            }
            int i48 = b;
            int i49 = ((i48 & 10) + (i48 | 10)) - 1;
            a = i49 % 128;
            int i50 = i49 % 2;
            this.k.i(4);
            int i51 = a + 33;
            b = i51 % 128;
            int i52 = i51 % 2;
            this.j.setVisibility(0);
            int i53 = b;
            int i54 = i53 & 117;
            int i55 = (i53 | 117) & (~i54);
            int i56 = i54 << 1;
            int i57 = (i55 ^ i56) + ((i55 & i56) << 1);
            a = i57 % 128;
            int i58 = i57 % 2;
            return;
        }
        int i59 = b;
        int i60 = (i59 & (-72)) | ((~i59) & 71);
        int i61 = -(-((i59 & 71) << 1));
        int i62 = (i60 ^ i61) + ((i60 & i61) << 1);
        a = i62 % 128;
        int i63 = i62 % 2;
        if (z) {
            int i64 = ((i59 | 59) << 1) - (i59 ^ 59);
            a = i64 % 128;
            rH = i64 % 2 != 0 ? this.k.v(3, 100L) : this.k.v(4, 100L);
            rV = this.j.h(0, 200L);
            int i65 = b + 55;
            a = i65 % 128;
            int i66 = i65 % 2;
        } else {
            rV = this.k.v(0, 200L);
            int i67 = a;
            int i68 = ((i67 | 125) << 1) - (i67 ^ 125);
            b = i68 % 128;
            int i69 = i68 % 2;
            rH = this.j.h(8, 100L);
            int i70 = b;
            int i71 = ((i70 ^ 118) + ((i70 & 118) << 1)) - 1;
            int i72 = i71 % 128;
            a = i72;
            int i73 = i71 % 2;
            int i74 = ((((i72 ^ 117) | (i72 & 117)) << 1) - (~(-((117 & (~i72)) | (i72 & (-118)))))) - 1;
            b = i74 % 128;
            int i75 = i74 % 2;
        }
        p pVar = new p();
        ArrayList<ivas.gov.bisp.enumeration.p081d.R> arrayList = pVar.c;
        int i76 = a;
        int i77 = i76 & 33;
        int i78 = (((i76 ^ 33) | i77) << 1) - ((i76 | 33) & (~i77));
        b = i78 % 128;
        Object obj = null;
        if (i78 % 2 == 0) {
            arrayList.add(rH);
            rH.c.get();
            throw null;
        }
        arrayList.add(rH);
        View view = rH.c.get();
        if (view != null) {
            int i79 = a;
            int i80 = (-2) - (((i79 & 64) + (i79 | 64)) ^ (-1));
            b = i80 % 128;
            if (i80 % 2 == 0) {
                duration = view.animate().getDuration();
                int i81 = 48 / 0;
            } else {
                duration = view.animate().getDuration();
            }
            int i82 = a;
            int i83 = i82 ^ 103;
            int i84 = (i82 & 103) << 1;
            int i85 = (i83 ^ i84) + ((i84 & i83) << 1);
            b = i85 % 128;
            int i86 = i85 % 2;
        } else {
            int i87 = b;
            int i88 = i87 & 39;
            int i89 = (((i87 | 39) & (~i88)) - (~(i88 << 1))) - 1;
            a = i89 % 128;
            int i90 = i89 % 2;
            duration = 0;
        }
        View view2 = rV.c.get();
        if (view2 != null) {
            int i91 = a;
            int i92 = i91 & 111;
            int i93 = -(-(i91 | 111));
            int i94 = (i92 ^ i93) + ((i93 & i92) << 1);
            b = i94 % 128;
            if (i94 % 2 == 0) {
                view2.animate().setStartDelay(duration);
                obj.hashCode();
                throw null;
            }
            view2.animate().setStartDelay(duration);
        }
        pVar.c.add(rV);
        pVar.d();
        int i95 = a;
        int i96 = (i95 ^ 70) + ((i95 & 70) << 1);
        int i97 = (i96 ^ (-1)) + (i96 << 1);
        b = i97 % 128;
        if (i97 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:127:0x039e A[PHI: r7
  0x039e: PHI (r7v17 android.view.View) = (r7v16 android.view.View), (r7v18 android.view.View) binds: [B:126:0x039c, B:123:0x0397] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:129:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:131:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:133:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:134:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:151:0x046a  */
    /* JADX WARN: Code duplicated, block: B:153:0x048c  */
    /* JADX WARN: Code duplicated, block: B:155:0x049d  */
    /* JADX WARN: Code duplicated, block: B:157:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:159:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:160:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:22:0x0070 A[PHI: r3
  0x0070: PHI (r3v36 ivas.gov.bisp.enumeration.u.p) = (r3v35 ivas.gov.bisp.enumeration.u.p), (r3v54 ivas.gov.bisp.enumeration.u.p) binds: [B:21:0x006e, B:18:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x0085  */
    /* JADX WARN: Code duplicated, block: B:95:0x027c A[PHI: r1
  0x027c: PHI (r1v9 ivas.gov.bisp.enumeration.u.p) = (r1v8 ivas.gov.bisp.enumeration.u.p), (r1v77 ivas.gov.bisp.enumeration.u.p) binds: [B:94:0x027a, B:91:0x0273] A[DONT_GENERATE, DONT_INLINE]] */
    public final void w(boolean z) {
        boolean z2;
        p pVar;
        int i;
        int i2;
        View view;
        int i3;
        View view2;
        int i4;
        ivas.gov.bisp.enumeration.p081d.R rD;
        int i5;
        p pVar2;
        int i6;
        int[] iArr;
        int i7 = 2 % 2;
        int i8 = b;
        int i9 = i8 & 53;
        int i10 = (i8 ^ 53) | i9;
        int i11 = (i9 & i10) + (i9 | i10);
        a = i11 % 128;
        Object obj = null;
        if (i11 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        boolean z3 = this.v;
        if ((!this.u) && !(!z3)) {
            int i12 = ((i8 ^ 107) | (i8 & 107)) << 1;
            int i13 = -((i8 & (-108)) | ((~i8) & 107));
            int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
            a = i14 % 128;
            int i15 = i14 % 2;
            z2 = false;
        } else {
            int i16 = i8 + 37;
            a = i16 % 128;
            int i17 = i16 % 2;
            z2 = true;
        }
        if (!(!z2)) {
            int i18 = i8 + 11;
            a = i18 % 128;
            if (i18 % 2 != 0) {
                throw null;
            }
            if (!this.w) {
                int i19 = i8 & 39;
                int i20 = -(-(i8 | 39));
                int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
                a = i21 % 128;
                if (i21 % 2 != 0) {
                    this.w = true;
                    pVar = this.z;
                    if (pVar != null) {
                        pVar.c();
                        int i22 = b + 71;
                        a = i22 % 128;
                        int i23 = i22 % 2;
                    }
                } else {
                    this.w = true;
                    pVar = this.z;
                    if (pVar != null) {
                        pVar.c();
                        int i24 = b + 71;
                        a = i24 % 128;
                        int i25 = i24 % 2;
                    }
                }
                this.i.setVisibility(0);
                if (this.s == 0) {
                    int i26 = a;
                    int i27 = i26 ^ 125;
                    int i28 = ((i26 & 125) | i27) << 1;
                    int i29 = -i27;
                    int i30 = ((i28 | i29) << 1) - (i28 ^ i29);
                    int i31 = i30 % 128;
                    b = i31;
                    int i32 = i30 % 2;
                    if (!this.y) {
                        int i33 = ((i31 ^ 47) - (~((i31 & 47) << 1))) - 1;
                        a = i33 % 128;
                        if (i33 % 2 != 0) {
                            obj.hashCode();
                            throw null;
                        }
                        if (!z) {
                            this.i.setAlpha(1.0f);
                            this.i.setTranslationY(0.0f);
                            int i34 = b;
                            int i35 = i34 | 95;
                            int i36 = i35 << 1;
                            int i37 = -((~(i34 & 95)) & i35);
                            int i38 = (i36 & i37) + (i37 | i36);
                            i = i38 % 128;
                            a = i;
                            int i39 = i38 % 2;
                            if (this.t) {
                                int i40 = i & 81;
                                int i41 = (i ^ 81) | i40;
                                i2 = ((i40 | i41) << 1) - (i41 ^ i40);
                                b = i2 % 128;
                                if (i2 % 2 != 0) {
                                    obj.hashCode();
                                    throw null;
                                }
                                view = this.l;
                                if (view != null) {
                                    view.setTranslationY(0.0f);
                                    int i42 = b;
                                    i3 = (i42 & 85) + (i42 | 85);
                                    a = i3 % 128;
                                    if (i3 % 2 != 0) {
                                        int i43 = 4 / 2;
                                    }
                                }
                            }
                            this.x.e(null);
                            int i44 = a;
                            int i45 = i44 & 23;
                            int i46 = (i45 - (~((i44 ^ 23) | i45))) - 1;
                            b = i46 % 128;
                            int i47 = i46 % 2;
                        }
                    }
                    this.i.setTranslationY(0.0f);
                    ActionBarContainer actionBarContainer = this.i;
                    int i48 = b;
                    int i49 = i48 & 63;
                    int i50 = i49 + ((63 ^ i48) | i49);
                    a = i50 % 128;
                    if (i50 % 2 != 0) {
                        actionBarContainer.getHeight();
                        throw null;
                    }
                    float f = -actionBarContainer.getHeight();
                    if (z) {
                        int i51 = a;
                        int i52 = (i51 & 27) + (i51 | 27);
                        b = i52 % 128;
                        int i53 = i52 % 2;
                        int[] iArr2 = {0, 0};
                        this.i.getLocationInWindow(iArr2);
                        int i54 = b;
                        int i55 = i54 ^ 51;
                        int i56 = -(-((i54 & 51) << 1));
                        int i57 = ((i55 | i56) << 1) - (i56 ^ i55);
                        int i58 = i57 % 128;
                        a = i58;
                        int i59 = i57 % 2;
                        f -= iArr2[1];
                        int i60 = (i58 & (-66)) | ((~i58) & 65);
                        int i61 = (i58 & 65) << 1;
                        int i62 = ((i60 | i61) << 1) - (i60 ^ i61);
                        b = i62 % 128;
                        int i63 = i62 % 2;
                    }
                    this.i.setTranslationY(f);
                    p pVar3 = new p();
                    int i64 = a;
                    int i65 = i64 | 55;
                    int i66 = (i65 << 1) - ((~(i64 & 55)) & i65);
                    b = i66 % 128;
                    int i67 = i66 % 2;
                    ivas.gov.bisp.enumeration.p081d.R rD2 = T.d(this.i);
                    if (i67 == 0) {
                        rD2.i(2.0f);
                    } else {
                        rD2.i(0.0f);
                    }
                    int i68 = b + 77;
                    a = i68 % 128;
                    int i69 = i68 % 2;
                    rD2.g(this.C);
                    if (!pVar3.h) {
                        int i70 = b;
                        int i71 = (((i70 | 11) << 1) - (~(-(((~i70) & 11) | (i70 & (-12)))))) - 1;
                        a = i71 % 128;
                        int i72 = i71 % 2;
                        pVar3.c.add(rD2);
                        int i73 = b;
                        int i74 = (i73 ^ 9) + ((i73 & 9) << 1);
                        a = i74 % 128;
                        int i75 = i74 % 2;
                    }
                    if (this.t) {
                        int i76 = a;
                        int i77 = (((i76 | 92) << 1) - (i76 ^ 92)) - 1;
                        b = i77 % 128;
                        if (i77 % 2 == 0) {
                            view2 = this.l;
                            int i78 = 17 / 0;
                            if (view2 != null) {
                                i4 = ((i76 ^ 34) + ((i76 & 34) << 1)) - 1;
                                b = i4 % 128;
                                if (i4 % 2 != 0) {
                                    view2.setTranslationY(f);
                                    T.d(this.l);
                                    obj.hashCode();
                                    throw null;
                                }
                                view2.setTranslationY(f);
                                rD = T.d(this.l);
                                rD.i(0.0f);
                                if (!pVar3.h) {
                                    int i79 = b;
                                    int i80 = ((i79 & 123) - (~(i79 | 123))) - 1;
                                    a = i80 % 128;
                                    int i81 = i80 % 2;
                                    pVar3.c.add(rD);
                                    int i82 = a;
                                    i5 = ((((i82 ^ 49) | (i82 & 49)) << 1) - (~(-(((~i82) & 49) | (i82 & (-50)))))) - 1;
                                    b = i5 % 128;
                                    if (i5 % 2 == 0) {
                                        int i83 = 5 % 2;
                                    }
                                }
                            }
                        } else {
                            view2 = this.l;
                            if (view2 != null) {
                                i4 = ((i76 ^ 34) + ((i76 & 34) << 1)) - 1;
                                b = i4 % 128;
                                if (i4 % 2 != 0) {
                                    view2.setTranslationY(f);
                                    T.d(this.l);
                                    obj.hashCode();
                                    throw null;
                                }
                                view2.setTranslationY(f);
                                rD = T.d(this.l);
                                rD.i(0.0f);
                                if (!pVar3.h) {
                                    int i710 = b;
                                    int i84 = ((i710 & 123) - (~(i710 | 123))) - 1;
                                    a = i84 % 128;
                                    int i85 = i84 % 2;
                                    pVar3.c.add(rD);
                                    int i86 = a;
                                    i5 = ((((i86 ^ 49) | (i86 & 49)) << 1) - (~(-(((~i86) & 49) | (i86 & (-50)))))) - 1;
                                    b = i5 % 128;
                                    if (i5 % 2 == 0) {
                                        int i87 = 5 % 2;
                                    }
                                }
                            }
                        }
                    }
                    Interpolator interpolator = d;
                    boolean z4 = pVar3.h;
                    if (!z4) {
                        int i88 = b;
                        int i89 = i88 ^ 111;
                        int i90 = (i88 & 111) << 1;
                        int i91 = (i89 & i90) + (i90 | i89);
                        a = i91 % 128;
                        int i92 = i91 % 2;
                        pVar3.e = interpolator;
                    }
                    if (!z4) {
                        int i93 = a;
                        int i94 = i93 ^ 45;
                        int i95 = ((i93 & 45) | i94) << 1;
                        int i96 = -i94;
                        int i97 = ((i95 | i96) << 1) - (i95 ^ i96);
                        b = i97 % 128;
                        if (i97 % 2 == 0) {
                            pVar3.d = 250L;
                            int i98 = 89 / 0;
                        } else {
                            pVar3.d = 250L;
                        }
                        int i99 = b + 67;
                        a = i99 % 128;
                        int i100 = i99 % 2;
                    }
                    ivas.gov.bisp.enumeration.p081d.v vVar = this.x;
                    if (!z4) {
                        int i101 = b + 53;
                        a = i101 % 128;
                        int i102 = i101 % 2;
                        pVar3.f = vVar;
                        int i103 = a + 115;
                        b = i103 % 128;
                        int i104 = i103 % 2;
                    }
                    this.z = pVar3;
                    pVar3.d();
                    int i105 = a;
                    int i106 = i105 & 109;
                    int i107 = i105 | 109;
                    int i108 = ((i106 | i107) << 1) - (i107 ^ i106);
                    b = i108 % 128;
                    int i109 = i108 % 2;
                } else {
                    this.i.setAlpha(1.0f);
                    this.i.setTranslationY(0.0f);
                    int i310 = b;
                    int i311 = i310 | 95;
                    int i312 = i311 << 1;
                    int i313 = -((~(i310 & 95)) & i311);
                    int i314 = (i312 & i313) + (i313 | i312);
                    i = i314 % 128;
                    a = i;
                    int i315 = i314 % 2;
                    if (this.t) {
                        int i410 = i & 81;
                        int i411 = (i ^ 81) | i410;
                        i2 = ((i410 | i411) << 1) - (i411 ^ i410);
                        b = i2 % 128;
                        if (i2 % 2 != 0) {
                            obj.hashCode();
                            throw null;
                        }
                        view = this.l;
                        if (view != null) {
                            view.setTranslationY(0.0f);
                            int i412 = b;
                            i3 = (i412 & 85) + (i412 | 85);
                            a = i3 % 128;
                            if (i3 % 2 != 0) {
                                int i413 = 4 / 2;
                            }
                        }
                    }
                    this.x.e(null);
                    int i414 = a;
                    int i415 = i414 & 23;
                    int i416 = (i415 - (~((i414 ^ 23) | i415))) - 1;
                    b = i416 % 128;
                    int i417 = i416 % 2;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.h;
                if (actionBarOverlayLayout != null) {
                    int i110 = a;
                    int i111 = ((i110 ^ 38) + ((i110 & 38) << 1)) - 1;
                    b = i111 % 128;
                    if (i111 % 2 != 0) {
                        WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
                        T.aXd.d(actionBarOverlayLayout);
                        return;
                    } else {
                        WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap2 = T.c;
                        T.aXd.d(actionBarOverlayLayout);
                        int i112 = 5 / 0;
                        return;
                    }
                }
            }
        } else if (this.w) {
            int i113 = a;
            int i114 = (((i113 | 50) << 1) - (i113 ^ 50)) - 1;
            b = i114 % 128;
            if (i114 % 2 == 0) {
                this.w = true;
                pVar2 = this.z;
                if (pVar2 != null) {
                    pVar2.c();
                    int i115 = a;
                    int i116 = i115 & 39;
                    int i117 = (i115 ^ 39) | i116;
                    i6 = (i116 & i117) + (i117 | i116);
                    b = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i118 = 3 % 3;
                    }
                }
            } else {
                this.w = false;
                pVar2 = this.z;
                if (pVar2 != null) {
                    pVar2.c();
                    int i119 = a;
                    int i1110 = i119 & 39;
                    int i1111 = (i119 ^ 39) | i1110;
                    i6 = (i1110 & i1111) + (i1111 | i1110);
                    b = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i1112 = 3 % 3;
                    }
                }
            }
            if (this.s == 0) {
                int i120 = b;
                int i121 = i120 & 121;
                int i122 = ((i120 ^ 121) | i121) << 1;
                int i123 = -((i120 | 121) & (~i121));
                int i124 = ((i122 | i123) << 1) - (i123 ^ i122);
                a = i124 % 128;
                if (i124 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                if (this.y || z) {
                    this.i.setAlpha(1.0f);
                    this.i.setTransitioning(true);
                    p pVar4 = new p();
                    int height = this.i.getHeight();
                    int i125 = a;
                    int i126 = ((i125 | 98) << 1) - (i125 ^ 98);
                    int i127 = (i126 ^ (-1)) + (i126 << 1);
                    b = i127 % 128;
                    int i128 = i127 % 2;
                    float f2 = -height;
                    if (z) {
                        int i129 = i125 & 111;
                        int i130 = ((i125 ^ 111) | i129) << 1;
                        int i131 = -((i125 | 111) & (~i129));
                        int i132 = (i130 ^ i131) + ((i130 & i131) << 1);
                        b = i132 % 128;
                        if (i132 % 2 == 0) {
                            iArr = new int[]{0, 0};
                            this.i.getLocationInWindow(iArr);
                            int i133 = 79 / 0;
                        } else {
                            iArr = new int[]{0, 0};
                            this.i.getLocationInWindow(iArr);
                        }
                        int i134 = a;
                        int i135 = (((i134 | 11) << 1) - (~(-(i134 ^ 11)))) - 1;
                        b = i135 % 128;
                        f2 = i135 % 2 == 0 ? f2 * iArr[1] : f2 - iArr[1];
                    }
                    ivas.gov.bisp.enumeration.p081d.R rD3 = T.d(this.i);
                    rD3.i(f2);
                    int i136 = b;
                    int i137 = i136 & 125;
                    int i138 = (i137 - (~(-(-((i136 ^ 125) | i137))))) - 1;
                    a = i138 % 128;
                    if (i138 % 2 != 0) {
                        rD3.g(this.C);
                        boolean z5 = pVar4.h;
                        obj.hashCode();
                        throw null;
                    }
                    rD3.g(this.C);
                    if (!pVar4.h) {
                        pVar4.c.add(rD3);
                        int i139 = a;
                        int i140 = ((i139 | 45) << 1) - (i139 ^ 45);
                        b = i140 % 128;
                        int i141 = i140 % 2;
                    }
                    if (this.t) {
                        int i142 = a;
                        int i143 = (63 & (~i142)) | (i142 & (-64));
                        int i144 = (i142 & 63) << 1;
                        int i145 = ((i143 | i144) << 1) - (i143 ^ i144);
                        b = i145 % 128;
                        if (i145 % 2 == 0) {
                            obj.hashCode();
                            throw null;
                        }
                        View view3 = this.l;
                        if (view3 != null) {
                            int i146 = (i142 & 115) + (i142 | 115);
                            b = i146 % 128;
                            int i147 = i146 % 2;
                            ivas.gov.bisp.enumeration.p081d.R rD4 = T.d(view3);
                            rD4.i(f2);
                            if (!pVar4.h) {
                                int i148 = a;
                                int i149 = (i148 & 77) + (i148 | 77);
                                b = i149 % 128;
                                int i150 = i149 % 2;
                                pVar4.c.add(rD4);
                                int i151 = b + 119;
                                a = i151 % 128;
                                int i152 = i151 % 2;
                            }
                        }
                    }
                    Interpolator interpolator2 = c;
                    boolean z6 = pVar4.h;
                    if (!z6) {
                        int i153 = b;
                        int i154 = (i153 | 41) << 1;
                        int i155 = -(((~i153) & 41) | (i153 & (-42)));
                        int i156 = (i154 ^ i155) + ((i155 & i154) << 1);
                        a = i156 % 128;
                        if (i156 % 2 != 0) {
                            pVar4.e = interpolator2;
                            int i157 = 40 / 0;
                        } else {
                            pVar4.e = interpolator2;
                        }
                    }
                    if (!z6) {
                        int i158 = b;
                        int i159 = (i158 & (-58)) | ((~i158) & 57);
                        int i160 = (i158 & 57) << 1;
                        int i161 = (i159 ^ i160) + ((i160 & i159) << 1);
                        a = i161 % 128;
                        int i162 = i161 % 2;
                        pVar4.d = 250L;
                    }
                    ivas.gov.bisp.enumeration.p081d.v vVar2 = this.B;
                    if (!z6) {
                        int i163 = b;
                        int i164 = (i163 | 3) << 1;
                        int i165 = -((3 & (~i163)) | (i163 & (-4)));
                        int i166 = (i164 & i165) + (i165 | i164);
                        a = i166 % 128;
                        if (i166 % 2 != 0) {
                            pVar4.f = vVar2;
                            throw null;
                        }
                        pVar4.f = vVar2;
                        int i167 = a + 11;
                        b = i167 % 128;
                        int i168 = i167 % 2;
                    }
                    this.z = pVar4;
                    pVar4.d();
                    int i169 = a + 7;
                    b = i169 % 128;
                    if (i169 % 2 == 0) {
                        int i170 = 60 / 0;
                        return;
                    }
                    return;
                }
            }
            this.B.e(null);
            int i171 = a;
            int i172 = (((i171 ^ 123) | (i171 & 123)) << 1) - (((~i171) & 123) | (i171 & (-124)));
            b = i172 % 128;
            int i173 = i172 % 2;
        }
        int i174 = a;
        int i175 = (((i174 & (-68)) | ((~i174) & 67)) - (~(-(-((i174 & 67) << 1))))) - 1;
        b = i175 % 128;
        if (i175 % 2 == 0) {
            int i176 = 52 / 0;
        }
    }
}
