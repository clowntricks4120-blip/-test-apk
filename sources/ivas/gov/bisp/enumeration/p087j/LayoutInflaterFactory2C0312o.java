package ivas.gov.bisp.enumeration.p087j;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.c;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.p;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import ivas.gov.bisp.enumeration.OooOOO0.OooOO0;
import ivas.gov.bisp.enumeration.OooOOO0.Oooo000;
import ivas.gov.bisp.enumeration.OooOOO0.o000000O;
import ivas.gov.bisp.enumeration.OooOOO0.o000oOoO;
import ivas.gov.bisp.enumeration.OooOOO0.o0OO00O;
import ivas.gov.bisp.enumeration.OooOOO0.o0OoOo0;
import ivas.gov.bisp.enumeration.OooOOO0.o0ooOOo;
import ivas.gov.bisp.enumeration.OooOOO0.oo000o;
import ivas.gov.bisp.enumeration.OooOOoo.OooOOOO;
import ivas.gov.bisp.enumeration.p001aa.C0083p;
import ivas.gov.bisp.enumeration.p001aa.t;
import ivas.gov.bisp.enumeration.p002ab.O;
import ivas.gov.bisp.enumeration.p027b.d;
import ivas.gov.bisp.enumeration.p081d.C0285m;
import ivas.gov.bisp.enumeration.p081d.Q;
import ivas.gov.bisp.enumeration.p081d.R;
import ivas.gov.bisp.enumeration.p081d.T;
import ivas.gov.bisp.enumeration.p081d.am;
import ivas.gov.bisp.enumeration.p085h.H;
import ivas.gov.bisp.enumeration.p085h.ap;
import ivas.gov.bisp.enumeration.p085h.f;
import ivas.gov.bisp.enumeration.p085h.k;
import ivas.gov.bisp.enumeration.p086i.l;
import ivas.gov.bisp.enumeration.p088k.B;
import ivas.gov.bisp.enumeration.p088k.InterfaceC0320s;
import ivas.gov.bisp.enumeration.p088k.K;
import ivas.gov.bisp.enumeration.p088k.P;
import ivas.gov.bisp.enumeration.p088k.ah;
import ivas.gov.bisp.enumeration.p088k.aj;
import ivas.gov.bisp.enumeration.p089l.u;
import ivas.gov.bisp.enumeration.p099u.e;
import ivas.gov.bisp.enumeration.p099u.h;
import ivas.gov.bisp.enumeration.p099u.i;
import ivas.gov.bisp.enumeration.p099u.j;
import ivas.gov.bisp.enumeration.p099u.r;
import ivas.gov.bisp.enumeration.p099u.z;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.j.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class LayoutInflaterFactory2C0312o extends a implements n.aII, LayoutInflater.Factory2 {
    private static int a = 1;
    private static int b;
    public static final OooOOOO<String, Integer> e = new t();
    public static final int[] f;
    public static final boolean g;
    public static final boolean h;
    public ViewGroup B;
    public TextView C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public aQz[] N;
    public aQz O;
    public boolean P;
    public boolean Q;
    public Configuration R;
    public boolean S;
    public int T;
    public int U;
    public boolean V;
    public aQv W;
    public boolean X;
    public aQv Y;
    public int Z;
    public boolean aa;
    public Rect ab;
    public Rect ac;
    public O ad;
    public z i;
    public final Object j;
    public Window k;
    public final Context l;
    public aQu m;
    public final InterfaceC0310l n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public MenuInflater f97o;
    public CharSequence p;
    public InterfaceC0320s q;
    public aQA r;
    public aQo s;
    public j t;
    public ActionBarContextView u;
    public Runnable v;
    public PopupWindow w;
    public View y;
    public boolean z;
    public R x = null;
    public boolean A = true;
    public final Runnable ae = new aQm();

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.j.o$aQA */
    public final class aQA implements p.aIX {
        private static int a = 1;
        private static int b;

        public aQA() {
        }

        /* JADX WARN: Code duplicated, block: B:14:0x003e  */
        /* JADX WARN: Code duplicated, block: B:16:0x0056  */
        /* JADX WARN: Code duplicated, block: B:20:0x0060  */
        /* JADX WARN: Code duplicated, block: B:22:0x0074  */
        /* JADX WARN: Code duplicated, block: B:24:0x00ae A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:25:0x00af  */
        /* JADX WARN: Code duplicated, block: B:27:0x00b3  */
        @Override // androidx.appcompat.view.menu.p.aIX
        public final void b(n nVar, boolean z) {
            boolean z2;
            aQz aqzN;
            int i;
            int i2;
            int i3;
            int i4 = 2 % 2;
            int i5 = a;
            int i6 = i5 & 45;
            int i7 = i6 + ((i5 ^ 45) | i6);
            b = i7 % 128;
            Object obj = null;
            if (i7 % 2 != 0) {
                nVar.m();
                obj.hashCode();
                throw null;
            }
            n nVarM = nVar.m();
            if (nVarM != nVar) {
                int i8 = a;
                int i9 = (i8 & 13) + (i8 | 13);
                b = i9 % 128;
                if (i9 % 2 == 0) {
                    z2 = true;
                }
                LayoutInflaterFactory2C0312o layoutInflaterFactory2C0312o = LayoutInflaterFactory2C0312o.this;
                if (z2) {
                    int i10 = a;
                    int i11 = i10 & 69;
                    int i12 = ((i10 ^ 69) | i11) << 1;
                    int i13 = -((i10 | 69) & (~i11));
                    i3 = (i12 & i13) + (i13 | i12);
                    b = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i14 = 38 / 0;
                    }
                    nVar = nVarM;
                }
                aqzN = layoutInflaterFactory2C0312o.N(nVar);
                if (aqzN != null) {
                    i = b;
                    int i15 = i & 103;
                    int i16 = (i ^ 103) | i15;
                    int i17 = ((i15 | i16) << 1) - (i15 ^ i16);
                    a = i17 % 128;
                    int i18 = i17 % 2;
                    if (!(!z2)) {
                        int i19 = (((i | 93) << 1) - (~(-(((~i) & 93) | (i & (-94)))))) - 1;
                        a = i19 % 128;
                        int i20 = i19 % 2;
                        LayoutInflaterFactory2C0312o.this.E(aqzN.d, aqzN, nVarM);
                        LayoutInflaterFactory2C0312o layoutInflaterFactory2C0312o2 = LayoutInflaterFactory2C0312o.this;
                        int i21 = a + 25;
                        b = i21 % 128;
                        int i22 = i21 % 2;
                        layoutInflaterFactory2C0312o2.I(aqzN, true);
                        int i23 = b;
                        int i24 = i23 & 93;
                        i2 = (i24 - (~(-(-((i23 ^ 93) | i24))))) - 1;
                        a = i2 % 128;
                        if (i2 % 2 != 0) {
                            return;
                        }
                        obj.hashCode();
                        throw null;
                    }
                    LayoutInflaterFactory2C0312o.this.I(aqzN, z);
                    int i25 = b;
                    int i26 = i25 & 89;
                    int i27 = -(-(i25 | 89));
                    int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
                    a = i28 % 128;
                    int i29 = i28 % 2;
                }
                int i30 = a + 15;
                b = i30 % 128;
                int i31 = i30 % 2;
            }
            int i32 = (-2) - ((b + 120) ^ (-1));
            a = i32 % 128;
            int i33 = i32 % 2;
            z2 = false;
            LayoutInflaterFactory2C0312o layoutInflaterFactory2C0312o3 = LayoutInflaterFactory2C0312o.this;
            if (z2) {
                int i110 = a;
                int i111 = i110 & 69;
                int i112 = ((i110 ^ 69) | i111) << 1;
                int i113 = -((i110 | 69) & (~i111));
                i3 = (i112 & i113) + (i113 | i112);
                b = i3 % 128;
                if (i3 % 2 != 0) {
                    int i114 = 38 / 0;
                }
                nVar = nVarM;
            }
            aqzN = layoutInflaterFactory2C0312o3.N(nVar);
            if (aqzN != null) {
                i = b;
                int i115 = i & 103;
                int i116 = (i ^ 103) | i115;
                int i117 = ((i115 | i116) << 1) - (i115 ^ i116);
                a = i117 % 128;
                int i118 = i117 % 2;
                if (!(!z2)) {
                    int i119 = (((i | 93) << 1) - (~(-(((~i) & 93) | (i & (-94)))))) - 1;
                    a = i119 % 128;
                    int i210 = i119 % 2;
                    LayoutInflaterFactory2C0312o.this.E(aqzN.d, aqzN, nVarM);
                    LayoutInflaterFactory2C0312o layoutInflaterFactory2C0312o4 = LayoutInflaterFactory2C0312o.this;
                    int i211 = a + 25;
                    b = i211 % 128;
                    int i212 = i211 % 2;
                    layoutInflaterFactory2C0312o4.I(aqzN, true);
                    int i213 = b;
                    int i214 = i213 & 93;
                    i2 = (i214 - (~(-(-((i213 ^ 93) | i214))))) - 1;
                    a = i2 % 128;
                    if (i2 % 2 != 0) {
                        return;
                    }
                    obj.hashCode();
                    throw null;
                }
                LayoutInflaterFactory2C0312o.this.I(aqzN, z);
                int i215 = b;
                int i216 = i215 & 89;
                int i217 = -(-(i215 | 89));
                int i218 = ((i216 | i217) << 1) - (i217 ^ i216);
                a = i218 % 128;
                int i219 = i218 % 2;
            }
            int i34 = a + 15;
            b = i34 % 128;
            int i35 = i34 % 2;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x003d  */
        /* JADX WARN: Code duplicated, block: B:17:0x005d  */
        /* JADX WARN: Code duplicated, block: B:20:0x0064 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:21:0x0066  */
        /* JADX WARN: Code duplicated, block: B:22:0x008a  */
        /* JADX WARN: Code duplicated, block: B:9:0x0027  */
        @Override // androidx.appcompat.view.menu.p.aIX
        public final boolean e(n nVar) {
            int i;
            LayoutInflaterFactory2C0312o layoutInflaterFactory2C0312o;
            Window.Callback callbackG;
            int i2;
            boolean z;
            int i3 = 2 % 2;
            int i4 = b;
            int i5 = i4 & 123;
            int i6 = (i4 ^ 123) | i5;
            int i7 = (i5 & i6) + (i6 | i5);
            a = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 23 / 0;
                if (nVar == nVar.m()) {
                    int i9 = a;
                    int i10 = i9 & 117;
                    int i11 = (i9 | 117) & (~i10);
                    int i12 = -(-(i10 << 1));
                    i = (i11 & i12) + (i11 | i12);
                    b = i % 128;
                    if (i % 2 == 0) {
                        boolean z2 = LayoutInflaterFactory2C0312o.this.F;
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    layoutInflaterFactory2C0312o = LayoutInflaterFactory2C0312o.this;
                    if (layoutInflaterFactory2C0312o.F && (callbackG = layoutInflaterFactory2C0312o.G()) != null) {
                        int i13 = b;
                        int i14 = ((i13 ^ 46) + ((i13 & 46) << 1)) - 1;
                        a = i14 % 128;
                        i2 = i14 % 2;
                        z = LayoutInflaterFactory2C0312o.this.S;
                        if (i2 == 0) {
                            int i15 = 15 / 0;
                            if (!z) {
                                int i16 = b;
                                int i17 = (i16 & 87) + (i16 | 87);
                                a = i17 % 128;
                                int i18 = i17 % 2;
                                callbackG.onMenuOpened(108, nVar);
                                int i19 = a;
                                int i20 = i19 & 43;
                                int i21 = -(-((i19 ^ 43) | i20));
                                int i22 = (i20 & i21) + (i21 | i20);
                                b = i22 % 128;
                                int i23 = i22 % 2;
                            }
                        } else if (!z) {
                            int i110 = b;
                            int i111 = (i110 & 87) + (i110 | 87);
                            a = i111 % 128;
                            int i112 = i111 % 2;
                            callbackG.onMenuOpened(108, nVar);
                            int i113 = a;
                            int i24 = i113 & 43;
                            int i25 = -(-((i113 ^ 43) | i24));
                            int i26 = (i24 & i25) + (i25 | i24);
                            b = i26 % 128;
                            int i27 = i26 % 2;
                        }
                    }
                }
            } else if (nVar == nVar.m()) {
                int i28 = a;
                int i114 = i28 & 117;
                int i115 = (i28 | 117) & (~i114);
                int i116 = -(-(i114 << 1));
                i = (i115 & i116) + (i115 | i116);
                b = i % 128;
                if (i % 2 == 0) {
                    boolean z3 = LayoutInflaterFactory2C0312o.this.F;
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                layoutInflaterFactory2C0312o = LayoutInflaterFactory2C0312o.this;
                if (layoutInflaterFactory2C0312o.F) {
                    int i117 = b;
                    int i118 = ((i117 ^ 46) + ((i117 & 46) << 1)) - 1;
                    a = i118 % 128;
                    i2 = i118 % 2;
                    z = LayoutInflaterFactory2C0312o.this.S;
                    if (i2 == 0) {
                        int i119 = 15 / 0;
                        if (!z) {
                            int i1110 = b;
                            int i1111 = (i1110 & 87) + (i1110 | 87);
                            a = i1111 % 128;
                            int i1112 = i1111 % 2;
                            callbackG.onMenuOpened(108, nVar);
                            int i1113 = a;
                            int i29 = i1113 & 43;
                            int i210 = -(-((i1113 ^ 43) | i29));
                            int i211 = (i29 & i210) + (i210 | i29);
                            b = i211 % 128;
                            int i212 = i211 % 2;
                        }
                    } else if (!z) {
                        int i1114 = b;
                        int i1115 = (i1114 & 87) + (i1114 | 87);
                        a = i1115 % 128;
                        int i1116 = i1115 % 2;
                        callbackG.onMenuOpened(108, nVar);
                        int i1117 = a;
                        int i213 = i1117 & 43;
                        int i214 = -(-((i1117 ^ 43) | i213));
                        int i215 = (i213 & i214) + (i214 | i213);
                        b = i215 % 128;
                        int i216 = i215 % 2;
                    }
                }
            }
            int i30 = b + 60;
            int i31 = (i30 ^ (-1)) + (i30 << 1);
            a = i31 % 128;
            int i32 = i31 % 2;
            return true;
        }
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.j.o$aQm */
    public class aQm implements Runnable {
        private static int a = 1;
        private static int b;

        public aQm() {
        }

        /* JADX WARN: Code duplicated, block: B:11:0x003d  */
        /* JADX WARN: Code duplicated, block: B:12:0x0041  */
        /* JADX WARN: Code duplicated, block: B:9:0x0027 A[PHI: r1
  0x0027: PHI (r1v7 ivas.gov.bisp.enumeration.j.o) = (r1v6 ivas.gov.bisp.enumeration.j.o), (r1v21 ivas.gov.bisp.enumeration.j.o) binds: [B:8:0x0025, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // java.lang.Runnable
        public void run() {
            LayoutInflaterFactory2C0312o layoutInflaterFactory2C0312o;
            int i;
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = (-2) - ((((i3 | 60) << 1) - (i3 ^ 60)) ^ (-1));
            a = i4 % 128;
            if (i4 % 2 == 0) {
                layoutInflaterFactory2C0312o = LayoutInflaterFactory2C0312o.this;
                if ((layoutInflaterFactory2C0312o.Z & 1) != 0) {
                    int i5 = a;
                    i = (((i5 ^ 45) | (i5 & 45)) << 1) - (((~i5) & 45) | (i5 & (-46)));
                    b = i % 128;
                    if (i % 2 != 0) {
                        layoutInflaterFactory2C0312o.H(1);
                    } else {
                        layoutInflaterFactory2C0312o.H(0);
                    }
                }
            } else {
                layoutInflaterFactory2C0312o = LayoutInflaterFactory2C0312o.this;
                if ((layoutInflaterFactory2C0312o.Z & 1) != 0) {
                    int i6 = a;
                    i = (((i6 ^ 45) | (i6 & 45)) << 1) - (((~i6) & 45) | (i6 & (-46)));
                    b = i % 128;
                    if (i % 2 != 0) {
                        layoutInflaterFactory2C0312o.H(1);
                    } else {
                        layoutInflaterFactory2C0312o.H(0);
                    }
                }
            }
            LayoutInflaterFactory2C0312o layoutInflaterFactory2C0312o2 = LayoutInflaterFactory2C0312o.this;
            if ((layoutInflaterFactory2C0312o2.Z & 4096) != 0) {
                int i7 = b;
                int i8 = i7 & 29;
                int i9 = (i7 | 29) & (~i8);
                int i10 = i8 << 1;
                int i11 = (i9 ^ i10) + ((i9 & i10) << 1);
                a = i11 % 128;
                int i12 = i11 % 2;
                layoutInflaterFactory2C0312o2.H(108);
                int i13 = b;
                int i14 = i13 & 109;
                int i15 = (i13 ^ 109) | i14;
                int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
                a = i16 % 128;
                int i17 = i16 % 2;
            }
            LayoutInflaterFactory2C0312o layoutInflaterFactory2C0312o3 = LayoutInflaterFactory2C0312o.this;
            layoutInflaterFactory2C0312o3.V = false;
            layoutInflaterFactory2C0312o3.Z = 0;
            int i18 = b;
            int i19 = i18 & 87;
            int i20 = ((i18 | 87) & (~i19)) + (i19 << 1);
            a = i20 % 128;
            if (i20 % 2 == 0) {
                int i21 = 84 / 0;
            }
        }
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.j.o$aQn */
    public interface aQn {
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.j.o$aQo */
    public final class aQo implements p.aIX {
        private static int a = 0;
        private static int b = 1;

        public aQo() {
        }

        @Override // androidx.appcompat.view.menu.p.aIX
        public final void b(n nVar, boolean z) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 63;
            int i4 = (i2 ^ 63) | i3;
            int i5 = (i3 & i4) + (i4 | i3);
            a = i5 % 128;
            int i6 = i5 % 2;
            LayoutInflaterFactory2C0312o.this.F(nVar);
            if (i6 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // androidx.appcompat.view.menu.p.aIX
        public final boolean e(n nVar) {
            int i = 2 % 2;
            int i2 = b + 5;
            a = i2 % 128;
            int i3 = i2 % 2;
            Window.Callback callbackG = LayoutInflaterFactory2C0312o.this.G();
            if (callbackG != null) {
                int i4 = a;
                int i5 = (i4 & (-74)) | ((~i4) & 73);
                int i6 = (i4 & 73) << 1;
                int i7 = (i5 & i6) + (i6 | i5);
                b = i7 % 128;
                callbackG.onMenuOpened(i7 % 2 == 0 ? 45 : 108, nVar);
            }
            int i8 = b;
            int i9 = (((i8 | 86) << 1) - (i8 ^ 86)) - 1;
            a = i9 % 128;
            int i10 = i9 % 2;
            return true;
        }
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.j.o$aQu */
    public class aQu extends z {
        private static int a = 0;
        private static int b = 1;
        public aQn d;

        public aQu(Window.Callback callback) {
            super(callback);
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 | 1) << 1) - (i2 ^ 1);
            a = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 27 / 0;
            }
        }

        @Override // android.view.Window.Callback
        public boolean onMenuOpened(int i, Menu menu) {
            int i2 = 2 % 2;
            int i3 = a + 103;
            b = i3 % 128;
            if (i3 % 2 == 0) {
                this.c.onMenuOpened(i, menu);
                int i4 = 78 / 0;
            } else {
                this.c.onMenuOpened(i, menu);
            }
            LayoutInflaterFactory2C0312o layoutInflaterFactory2C0312o = LayoutInflaterFactory2C0312o.this;
            Objects.requireNonNull(layoutInflaterFactory2C0312o);
            int i5 = b;
            int i6 = i5 & 123;
            int i7 = -(-(i5 | 123));
            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
            a = i8 % 128;
            if (i8 % 2 == 0 ? i == 108 : i == 109) {
                layoutInflaterFactory2C0312o.T();
                z zVar = layoutInflaterFactory2C0312o.i;
                if (zVar != null) {
                    int i9 = b;
                    int i10 = i9 & 109;
                    int i11 = ((i9 ^ 109) | i10) << 1;
                    int i12 = -((i9 | 109) & (~i10));
                    int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
                    a = i13 % 128;
                    if (i13 % 2 != 0) {
                        zVar.f(false);
                    } else {
                        zVar.f(true);
                    }
                    int i14 = a;
                    int i15 = i14 & 5;
                    int i16 = ((((i14 ^ 5) | i15) << 1) - (~(-((i14 | 5) & (~i15))))) - 1;
                    b = i16 % 128;
                    int i17 = i16 % 2;
                }
            }
            int i18 = b + 9;
            a = i18 % 128;
            if (i18 % 2 == 0) {
                return true;
            }
            throw null;
        }

        @Override // android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 ^ 39;
            int i4 = ((i2 & 39) | i3) << 1;
            int i5 = -i3;
            int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
            a = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i2 & 9;
            int i9 = (((i2 | 9) & (~i8)) - (~(-(-(i8 << 1))))) - 1;
            a = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 11 / 0;
            }
            return null;
        }

        @Override // android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            boolean z;
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 & 21) + (i2 | 21);
            a = i3 % 128;
            if (i3 % 2 != 0) {
                LayoutInflaterFactory2C0312o.this.K(keyEvent);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (LayoutInflaterFactory2C0312o.this.K(keyEvent) || this.c.dispatchKeyEvent(keyEvent)) {
                int i4 = b + 115;
                a = i4 % 128;
                int i5 = i4 % 2;
                z = true;
            } else {
                int i6 = a;
                int i7 = i6 & 87;
                int i8 = (((i6 ^ 87) | i7) << 1) - ((~i7) & (i6 | 87));
                b = i8 % 128;
                int i9 = i8 % 2;
                int i10 = i6 ^ 13;
                int i11 = ((i6 & 13) | i10) << 1;
                int i12 = -i10;
                int i13 = (i11 & i12) + (i11 | i12);
                b = i13 % 128;
                int i14 = i13 % 2;
                z = false;
            }
            int i15 = b;
            int i16 = i15 & 15;
            int i17 = -(-((i15 ^ 15) | i16));
            int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
            a = i18 % 128;
            int i19 = i18 % 2;
            return z;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0020  */
        /* JADX WARN: Code duplicated, block: B:13:0x002d  */
        /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:8:0x001c  */
        @Override // android.view.Window.Callback
        public boolean onCreatePanelMenu(int i, Menu menu) {
            int i2;
            int i3 = 2 % 2;
            int i4 = a;
            int i5 = ((i4 | 55) << 1) - (i4 ^ 55);
            int i6 = i5 % 128;
            b = i6;
            if (i5 % 2 == 0) {
                int i7 = 96 / 0;
                if (i == 0) {
                    if (!(menu instanceof n)) {
                        i2 = (i6 & 15) + (i6 | 15);
                        a = i2 % 128;
                        if (i2 % 2 != 0) {
                            return true;
                        }
                        return false;
                    }
                }
            } else if (i == 0) {
                if (!(menu instanceof n)) {
                    i2 = (i6 & 15) + (i6 | 15);
                    a = i2 % 128;
                    if (i2 % 2 != 0) {
                        return true;
                    }
                    return false;
                }
            }
            boolean zOnCreatePanelMenu = this.c.onCreatePanelMenu(i, menu);
            int i8 = b;
            int i9 = (((i8 | 122) << 1) - (i8 ^ 122)) - 1;
            a = i9 % 128;
            int i10 = i9 % 2;
            return zOnCreatePanelMenu;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x004f, code lost:
        
            r6.c.onProvideKeyboardShortcuts(r7, r8, r9);
            r7 = ivas.gov.bisp.enumeration.p087j.LayoutInflaterFactory2C0312o.aQu.b + 11;
            ivas.gov.bisp.enumeration.p087j.LayoutInflaterFactory2C0312o.aQu.a = r7 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x005d, code lost:
        
            if ((r7 % 2) != 0) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x005f, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0061, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x003b, code lost:
        
            if (r1 != null) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x003e, code lost:
        
            if (r1 != null) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0040, code lost:
        
            r6.c.onProvideKeyboardShortcuts(r7, r1, r9);
            r7 = ivas.gov.bisp.enumeration.p087j.LayoutInflaterFactory2C0312o.aQu.a + 69;
            ivas.gov.bisp.enumeration.p087j.LayoutInflaterFactory2C0312o.aQu.b = r7 % 128;
            r7 = r7 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x004e, code lost:
        
            return;
         */
        @Override // android.view.Window.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onProvideKeyboardShortcuts(java.util.List<android.view.KeyboardShortcutGroup> r7, android.view.Menu r8, int r9) {
            /*
                r6 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = ivas.gov.bisp.enumeration.p087j.LayoutInflaterFactory2C0312o.aQu.a
                r2 = r1 ^ 85
                r3 = r1 & 85
                r2 = r2 | r3
                int r2 = r2 << 1
                int r3 = ~r3
                r1 = r1 | 85
                r1 = r1 & r3
                int r1 = -r1
                r3 = r2 & r1
                r1 = r1 | r2
                int r3 = r3 + r1
                int r1 = r3 % 128
                ivas.gov.bisp.enumeration.p087j.LayoutInflaterFactory2C0312o.aQu.b = r1
                int r3 = r3 % r0
                ivas.gov.bisp.enumeration.j.o r1 = ivas.gov.bisp.enumeration.p087j.LayoutInflaterFactory2C0312o.this
                r2 = 0
                ivas.gov.bisp.enumeration.j.o$aQz r1 = r1.Q(r2)
                androidx.appcompat.view.menu.n r1 = r1.k
                int r3 = ivas.gov.bisp.enumeration.p087j.LayoutInflaterFactory2C0312o.aQu.a
                r4 = r3 ^ 101(0x65, float:1.42E-43)
                r3 = r3 & 101(0x65, float:1.42E-43)
                r3 = r3 | r4
                int r3 = r3 << 1
                int r4 = -r4
                r5 = r3 & r4
                r3 = r3 | r4
                int r5 = r5 + r3
                int r3 = r5 % 128
                ivas.gov.bisp.enumeration.p087j.LayoutInflaterFactory2C0312o.aQu.b = r3
                int r5 = r5 % r0
                if (r5 != 0) goto L3e
                r3 = 99
                int r3 = r3 / r2
                if (r1 == 0) goto L4f
                goto L40
            L3e:
                if (r1 == 0) goto L4f
            L40:
                android.view.Window$Callback r8 = r6.c
                r8.onProvideKeyboardShortcuts(r7, r1, r9)
                int r7 = ivas.gov.bisp.enumeration.p087j.LayoutInflaterFactory2C0312o.aQu.a
                int r7 = r7 + 69
                int r8 = r7 % 128
                ivas.gov.bisp.enumeration.p087j.LayoutInflaterFactory2C0312o.aQu.b = r8
                int r7 = r7 % r0
                return
            L4f:
                android.view.Window$Callback r1 = r6.c
                r1.onProvideKeyboardShortcuts(r7, r8, r9)
                int r7 = ivas.gov.bisp.enumeration.p087j.LayoutInflaterFactory2C0312o.aQu.b
                int r7 = r7 + 11
                int r8 = r7 % 128
                ivas.gov.bisp.enumeration.p087j.LayoutInflaterFactory2C0312o.aQu.a = r8
                int r7 = r7 % r0
                if (r7 != 0) goto L60
                return
            L60:
                r7 = 0
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p087j.LayoutInflaterFactory2C0312o.aQu.onProvideKeyboardShortcuts(java.util.List, android.view.Menu, int):void");
        }

        @Override // android.view.Window.Callback
        public View onCreatePanelView(int i) {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = i3 & 23;
            int i5 = -(-((i3 ^ 23) | i4));
            int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
            int i7 = i6 % 128;
            a = i7;
            int i8 = i6 % 2;
            aQn aqn = this.d;
            if (aqn != null) {
                int i9 = (-2) - (((i7 ^ 64) + ((i7 & 64) << 1)) ^ (-1));
                b = i9 % 128;
                int i10 = i9 % 2;
                S.aQO aqo = (S.aQO) aqn;
                Objects.requireNonNull(aqo);
                View view = null;
                if (i == 0) {
                    View view2 = new View(S.this.c.u());
                    int i11 = a;
                    int i12 = i11 | 49;
                    int i13 = (i12 << 1) - ((~(i11 & 49)) & i12);
                    int i14 = i13 % 128;
                    b = i14;
                    if (i13 % 2 == 0) {
                        view.hashCode();
                        throw null;
                    }
                    int i15 = i14 + 109;
                    a = i15 % 128;
                    int i16 = i15 % 2;
                    view = view2;
                } else {
                    int i17 = a;
                    int i18 = (i17 ^ 73) + ((i17 & 73) << 1);
                    b = i18 % 128;
                    int i19 = i18 % 2;
                }
                if (view != null) {
                    int i20 = a;
                    int i21 = i20 & 97;
                    int i22 = (i20 ^ 97) | i21;
                    int i23 = ((i21 | i22) << 1) - (i21 ^ i22);
                    b = i23 % 128;
                    int i24 = i23 % 2;
                    int i25 = (i20 & 45) + (i20 | 45);
                    b = i25 % 128;
                    if (i25 % 2 == 0) {
                        int i26 = 31 / 0;
                    }
                    return view;
                }
            }
            View viewOnCreatePanelView = this.c.onCreatePanelView(i);
            int i27 = b;
            int i28 = i27 & 43;
            int i29 = i28 + ((i27 ^ 43) | i28);
            a = i29 % 128;
            if (i29 % 2 != 0) {
                int i30 = 2 / 0;
            }
            return viewOnCreatePanelView;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x002f  */
        /* JADX WARN: Code duplicated, block: B:12:0x003e  */
        /* JADX WARN: Code duplicated, block: B:14:0x0052  */
        @Override // android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            int i2;
            int i3;
            int i4 = 2 % 2;
            int i5 = b;
            int i6 = i5 & 79;
            int i7 = ((((i5 ^ 79) | i6) << 1) - (~(-((i5 | 79) & (~i6))))) - 1;
            a = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 80 / 0;
                if (!(!LayoutInflaterFactory2C0312o.this.A)) {
                    int i9 = b;
                    int i10 = (i9 ^ 123) + ((i9 & 123) << 1);
                    i2 = i10 % 128;
                    a = i2;
                    int i11 = i10 % 2;
                    if (i == 0) {
                        int i12 = i2 & 5;
                        int i13 = (i2 ^ 5) | i12;
                        int i14 = (i12 & i13) + (i12 | i13);
                        b = i14 % 128;
                        i3 = i14 % 2;
                        ActionMode actionModeC = c(callback);
                        if (i3 == 0) {
                            int i15 = 3 / 0;
                        }
                        return actionModeC;
                    }
                }
            } else if (!(!LayoutInflaterFactory2C0312o.this.A)) {
                int i16 = b;
                int i17 = (i16 ^ 123) + ((i16 & 123) << 1);
                i2 = i17 % 128;
                a = i2;
                int i18 = i17 % 2;
                if (i == 0) {
                    int i19 = i2 & 5;
                    int i110 = (i2 ^ 5) | i19;
                    int i111 = (i19 & i110) + (i19 | i110);
                    b = i111 % 128;
                    i3 = i111 % 2;
                    ActionMode actionModeC2 = c(callback);
                    if (i3 == 0) {
                        int i112 = 3 / 0;
                    }
                    return actionModeC2;
                }
            }
            ActionMode actionModeOnWindowStartingActionMode = this.c.onWindowStartingActionMode(callback, i);
            int i20 = a;
            int i21 = i20 ^ 61;
            int i22 = -(-((i20 & 61) << 1));
            int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
            b = i23 % 128;
            int i24 = i23 % 2;
            return actionModeOnWindowStartingActionMode;
        }

        @Override // android.view.Window.Callback
        public void onPanelClosed(int i, Menu menu) {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = ((i3 & 52) + (i3 | 52)) - 1;
            b = i4 % 128;
            Object obj = null;
            if (i4 % 2 == 0) {
                this.c.onPanelClosed(i, menu);
                obj.hashCode();
                throw null;
            }
            this.c.onPanelClosed(i, menu);
            int i5 = b;
            int i6 = i5 & 63;
            int i7 = i6 + ((i5 ^ 63) | i6);
            a = i7 % 128;
            int i8 = i7 % 2;
            LayoutInflaterFactory2C0312o layoutInflaterFactory2C0312o = LayoutInflaterFactory2C0312o.this;
            Objects.requireNonNull(layoutInflaterFactory2C0312o);
            int i9 = a;
            int i10 = (i9 ^ 117) + ((i9 & 117) << 1);
            b = i10 % 128;
            if (i10 % 2 != 0 ? i == 108 : i == 103) {
                layoutInflaterFactory2C0312o.T();
                z zVar = layoutInflaterFactory2C0312o.i;
                if (zVar != null) {
                    int i11 = a;
                    int i12 = i11 & 29;
                    int i13 = (((i11 | 29) & (~i12)) - (~(-(-(i12 << 1))))) - 1;
                    b = i13 % 128;
                    int i14 = i13 % 2;
                    zVar.f(false);
                    int i15 = a;
                    int i16 = (i15 & 20) + (i15 | 20);
                    int i17 = (i16 ^ (-1)) + (i16 << 1);
                    b = i17 % 128;
                    if (i17 % 2 == 0) {
                        throw null;
                    }
                    return;
                }
            } else if (i == 0) {
                int i18 = i9 + 97;
                b = i18 % 128;
                int i19 = i18 % 2;
                aQz aqzQ = layoutInflaterFactory2C0312o.Q(i);
                if (aqzQ.p) {
                    int i20 = b;
                    int i21 = (i20 ^ 81) + ((i20 & 81) << 1);
                    a = i21 % 128;
                    int i22 = i21 % 2;
                    layoutInflaterFactory2C0312o.I(aqzQ, false);
                    int i23 = b;
                    int i24 = ((i23 | 37) << 1) - (i23 ^ 37);
                    a = i24 % 128;
                    int i25 = i24 % 2;
                }
            }
            int i26 = a;
            int i27 = (((i26 | 63) << 1) - (~(-(((~i26) & 63) | (i26 & (-64)))))) - 1;
            b = i27 % 128;
            int i28 = i27 % 2;
        }

        @Override // android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            n nVar;
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = i3 + 53;
            int i5 = i4 % 128;
            a = i5;
            int i6 = i4 % 2;
            Object obj = null;
            if (menu instanceof n) {
                int i7 = (i3 ^ 103) + ((i3 & 103) << 1);
                a = i7 % 128;
                int i8 = i7 % 2;
                nVar = (n) menu;
                int i9 = i3 & 125;
                int i10 = i9 + ((i3 ^ 125) | i9);
                a = i10 % 128;
                int i11 = i10 % 2;
            } else {
                int i12 = (-2) - ((i5 + 20) ^ (-1));
                b = i12 % 128;
                int i13 = i12 % 2;
                nVar = null;
            }
            if (i == 0) {
                int i14 = a;
                int i15 = (i14 ^ 75) + ((i14 & 75) << 1);
                b = i15 % 128;
                int i16 = i15 % 2;
                if (nVar == null) {
                    int i17 = i14 & 63;
                    int i18 = (i14 ^ 63) | i17;
                    int i19 = (i17 & i18) + (i17 | i18);
                    int i20 = i19 % 128;
                    b = i20;
                    int i21 = i19 % 2;
                    int i22 = ((i20 ^ 99) | (i20 & 99)) << 1;
                    int i23 = -(((~i20) & 99) | (i20 & (-100)));
                    int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
                    a = i24 % 128;
                    int i25 = i24 % 2;
                    return false;
                }
            }
            if (nVar != null) {
                int i26 = a + 125;
                b = i26 % 128;
                if (i26 % 2 == 0) {
                    nVar.u = false;
                } else {
                    nVar.u = true;
                }
                int i27 = (-2) - ((a + 78) ^ (-1));
                b = i27 % 128;
                int i28 = i27 % 2;
            }
            aQn aqn = this.d;
            if (aqn != null) {
                int i29 = a;
                int i30 = i29 + 76;
                int i31 = (i30 ^ (-1)) + (i30 << 1);
                b = i31 % 128;
                int i32 = i31 % 2;
                S.aQO aqo = (S.aQO) aqn;
                if (i == 0) {
                    int i33 = (i29 ^ 95) + ((i29 & 95) << 1);
                    b = i33 % 128;
                    int i34 = i33 % 2;
                    S s = S.this;
                    if (!s.f) {
                        int i35 = b;
                        int i36 = (((i35 | 36) << 1) - (i35 ^ 36)) - 1;
                        a = i36 % 128;
                        if (i36 % 2 != 0) {
                            s.c.f();
                            S s2 = S.this;
                            obj.hashCode();
                            throw null;
                        }
                        s.c.f();
                        S.this.f = true;
                        int i37 = a;
                        int i38 = i37 & 39;
                        int i39 = ((i37 ^ 39) | i38) << 1;
                        int i40 = -((i37 | 39) & (~i38));
                        int i41 = ((i39 | i40) << 1) - (i40 ^ i39);
                        b = i41 % 128;
                        int i42 = i41 % 2;
                    }
                }
            }
            boolean zOnPreparePanel = this.c.onPreparePanel(i, view, menu);
            if (nVar != null) {
                int i43 = b;
                int i44 = i43 & 3;
                int i45 = (i44 - (~(-(-((i43 ^ 3) | i44))))) - 1;
                a = i45 % 128;
                int i46 = i45 % 2;
                nVar.u = false;
                int i47 = b;
                int i48 = (i47 ^ 79) + ((i47 & 79) << 1);
                a = i48 % 128;
                int i49 = i48 % 2;
            }
            int i50 = a;
            int i51 = ((i50 | 117) << 1) - (i50 ^ 117);
            b = i51 % 128;
            if (i51 % 2 != 0) {
                return zOnPreparePanel;
            }
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0052  */
        /* JADX WARN: Code duplicated, block: B:14:0x0067  */
        /* JADX WARN: Code duplicated, block: B:17:0x006e  */
        /* JADX WARN: Code duplicated, block: B:19:0x0075  */
        /* JADX WARN: Code duplicated, block: B:21:0x0079  */
        /* JADX WARN: Code duplicated, block: B:23:0x008c  */
        /* JADX WARN: Code duplicated, block: B:25:0x0097  */
        /* JADX WARN: Code duplicated, block: B:27:0x009b  */
        /* JADX WARN: Code duplicated, block: B:29:0x00b1  */
        /* JADX WARN: Code duplicated, block: B:30:0x00b4  */
        /* JADX WARN: Code duplicated, block: B:32:0x00c0  */
        /* JADX WARN: Code duplicated, block: B:34:0x00c3  */
        /* JADX WARN: Code duplicated, block: B:36:0x00c7  */
        /* JADX WARN: Code duplicated, block: B:38:0x00db  */
        /* JADX WARN: Code duplicated, block: B:39:0x00e0  */
        /* JADX WARN: Code duplicated, block: B:43:0x0124  */
        /* JADX WARN: Code duplicated, block: B:51:0x0183 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:52:0x0184  */
        @Override // android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            boolean z;
            int i;
            LayoutInflaterFactory2C0312o layoutInflaterFactory2C0312o;
            int keyCode;
            z zVar;
            aQz aqz;
            int i2;
            aQz aqzQ;
            boolean zV;
            int i3;
            aQz aqz2;
            int i4;
            int i5;
            int i6 = 2 % 2;
            int i7 = b;
            int i8 = (i7 & (-126)) | ((~i7) & 125);
            int i9 = -(-((i7 & 125) << 1));
            int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
            a = i10 % 128;
            Object obj = null;
            boolean z2 = false;
            if (i10 % 2 != 0) {
                if (!this.c.dispatchKeyShortcutEvent(keyEvent)) {
                    z = true;
                    layoutInflaterFactory2C0312o = LayoutInflaterFactory2C0312o.this;
                    keyCode = keyEvent.getKeyCode();
                    int i11 = b;
                    int i12 = (i11 & (-6)) | ((~i11) & 5);
                    int i13 = (i11 & 5) << 1;
                    int i14 = (i12 & i13) + (i13 | i12);
                    a = i14 % 128;
                    int i15 = i14 % 2;
                    layoutInflaterFactory2C0312o.T();
                    zVar = layoutInflaterFactory2C0312o.i;
                    if (zVar != null) {
                        int i16 = b;
                        int i17 = i16 ^ 123;
                        int i18 = -(-((i16 & 123) << 1));
                        i5 = (i17 ^ i18) + ((i18 & i17) << 1);
                        a = i5 % 128;
                        if (i5 % 2 == 0) {
                            zVar.c(keyCode, keyEvent);
                            obj.hashCode();
                            throw null;
                        }
                        if (!zVar.c(keyCode, keyEvent)) {
                            aqz = layoutInflaterFactory2C0312o.O;
                            if (aqz != null) {
                                int i19 = b + 21;
                                a = i19 % 128;
                                int i20 = i19 % 2;
                                if (layoutInflaterFactory2C0312o.V(aqz, keyEvent.getKeyCode(), keyEvent, 1)) {
                                    i3 = b + 55;
                                    a = i3 % 128;
                                    if (i3 % 2 == 0) {
                                        aQz aqz3 = layoutInflaterFactory2C0312o.O;
                                        throw null;
                                    }
                                    aqz2 = layoutInflaterFactory2C0312o.O;
                                    if (aqz2 != null) {
                                        int i21 = b;
                                        int i22 = i21 & 77;
                                        int i23 = (i21 | 77) & (~i22);
                                        int i24 = -(-(i22 << 1));
                                        i4 = (i23 & i24) + (i23 | i24);
                                        a = i4 % 128;
                                        if (i4 % 2 != 0) {
                                            aqz2.n = false;
                                        } else {
                                            aqz2.n = true;
                                        }
                                        int i25 = a + 111;
                                        b = i25 % 128;
                                        int i26 = i25 % 2;
                                    }
                                } else {
                                    if (layoutInflaterFactory2C0312o.O == null) {
                                        int i27 = b;
                                        int i28 = i27 & 121;
                                        i2 = (((i27 ^ 121) | i28) << 1) - ((i27 | 121) & (~i28));
                                        a = i2 % 128;
                                        if (i2 % 2 != 0) {
                                            aqzQ = layoutInflaterFactory2C0312o.Q(1);
                                        } else {
                                            aqzQ = layoutInflaterFactory2C0312o.Q(0);
                                        }
                                        int i29 = a;
                                        int i30 = ((i29 | 85) << 1) - (i29 ^ 85);
                                        b = i30 % 128;
                                        int i31 = i30 % 2;
                                        layoutInflaterFactory2C0312o.Z(aqzQ, keyEvent);
                                        int keyCode2 = keyEvent.getKeyCode();
                                        int i32 = b;
                                        int i33 = i32 ^ 109;
                                        int i34 = ((((i32 & 109) | i33) << 1) - (~(-i33))) - 1;
                                        a = i34 % 128;
                                        int i35 = i34 % 2;
                                        zV = layoutInflaterFactory2C0312o.V(aqzQ, keyCode2, keyEvent, 1);
                                        aqzQ.m = false;
                                        int i36 = a;
                                        int i37 = i36 & 55;
                                        int i38 = (((i36 ^ 55) | i37) << 1) - ((i36 | 55) & (~i37));
                                        b = i38 % 128;
                                        int i39 = i38 % 2;
                                        if (!zV) {
                                        }
                                    }
                                    int i40 = b;
                                    int i41 = i40 | 93;
                                    int i42 = ((i41 << 1) - (~(-((~(i40 & 93)) & i41)))) - 1;
                                    a = i42 % 128;
                                    int i43 = i42 % 2;
                                }
                                int i44 = a;
                                int i45 = ((i44 ^ 101) | (i44 & 101)) << 1;
                                int i46 = -(((~i44) & 101) | (i44 & (-102)));
                                int i47 = ((i45 | i46) << 1) - (i46 ^ i45);
                                b = i47 % 128;
                                int i48 = i47 % 2;
                                z2 = true;
                            } else {
                                if (layoutInflaterFactory2C0312o.O == null) {
                                    int i210 = b;
                                    int i211 = i210 & 121;
                                    i2 = (((i210 ^ 121) | i211) << 1) - ((i210 | 121) & (~i211));
                                    a = i2 % 128;
                                    if (i2 % 2 != 0) {
                                        aqzQ = layoutInflaterFactory2C0312o.Q(1);
                                    } else {
                                        aqzQ = layoutInflaterFactory2C0312o.Q(0);
                                    }
                                    int i212 = a;
                                    int i310 = ((i212 | 85) << 1) - (i212 ^ 85);
                                    b = i310 % 128;
                                    int i311 = i310 % 2;
                                    layoutInflaterFactory2C0312o.Z(aqzQ, keyEvent);
                                    int keyCode3 = keyEvent.getKeyCode();
                                    int i312 = b;
                                    int i313 = i312 ^ 109;
                                    int i314 = ((((i312 & 109) | i313) << 1) - (~(-i313))) - 1;
                                    a = i314 % 128;
                                    int i315 = i314 % 2;
                                    zV = layoutInflaterFactory2C0312o.V(aqzQ, keyCode3, keyEvent, 1);
                                    aqzQ.m = false;
                                    int i316 = a;
                                    int i317 = i316 & 55;
                                    int i318 = (((i316 ^ 55) | i317) << 1) - ((i316 | 55) & (~i317));
                                    b = i318 % 128;
                                    int i319 = i318 % 2;
                                    if (!zV) {
                                        int i49 = a;
                                        int i410 = ((i49 ^ 101) | (i49 & 101)) << 1;
                                        int i411 = -(((~i49) & 101) | (i49 & (-102)));
                                        int i412 = ((i410 | i411) << 1) - (i411 ^ i410);
                                        b = i412 % 128;
                                        int i413 = i412 % 2;
                                        z2 = true;
                                    }
                                }
                                int i414 = b;
                                int i415 = i414 | 93;
                                int i416 = ((i415 << 1) - (~(-((~(i414 & 93)) & i415)))) - 1;
                                a = i416 % 128;
                                int i417 = i416 % 2;
                            }
                        } else {
                            int i418 = a;
                            int i419 = ((i418 ^ 101) | (i418 & 101)) << 1;
                            int i4110 = -(((~i418) & 101) | (i418 & (-102)));
                            int i4111 = ((i419 | i4110) << 1) - (i4110 ^ i419);
                            b = i4111 % 128;
                            int i4112 = i4111 % 2;
                            z2 = true;
                        }
                    } else {
                        aqz = layoutInflaterFactory2C0312o.O;
                        if (aqz != null) {
                            int i110 = b + 21;
                            a = i110 % 128;
                            int i213 = i110 % 2;
                            if (layoutInflaterFactory2C0312o.V(aqz, keyEvent.getKeyCode(), keyEvent, 1)) {
                                i3 = b + 55;
                                a = i3 % 128;
                                if (i3 % 2 == 0) {
                                    aQz aqz4 = layoutInflaterFactory2C0312o.O;
                                    throw null;
                                }
                                aqz2 = layoutInflaterFactory2C0312o.O;
                                if (aqz2 != null) {
                                    int i214 = b;
                                    int i215 = i214 & 77;
                                    int i216 = (i214 | 77) & (~i215);
                                    int i217 = -(-(i215 << 1));
                                    i4 = (i216 & i217) + (i216 | i217);
                                    a = i4 % 128;
                                    if (i4 % 2 != 0) {
                                        aqz2.n = false;
                                    } else {
                                        aqz2.n = true;
                                    }
                                    int i218 = a + 111;
                                    b = i218 % 128;
                                    int i219 = i218 % 2;
                                }
                            } else {
                                if (layoutInflaterFactory2C0312o.O == null) {
                                    int i2110 = b;
                                    int i2111 = i2110 & 121;
                                    i2 = (((i2110 ^ 121) | i2111) << 1) - ((i2110 | 121) & (~i2111));
                                    a = i2 % 128;
                                    if (i2 % 2 != 0) {
                                        aqzQ = layoutInflaterFactory2C0312o.Q(1);
                                    } else {
                                        aqzQ = layoutInflaterFactory2C0312o.Q(0);
                                    }
                                    int i2112 = a;
                                    int i3110 = ((i2112 | 85) << 1) - (i2112 ^ 85);
                                    b = i3110 % 128;
                                    int i3111 = i3110 % 2;
                                    layoutInflaterFactory2C0312o.Z(aqzQ, keyEvent);
                                    int keyCode4 = keyEvent.getKeyCode();
                                    int i3112 = b;
                                    int i3113 = i3112 ^ 109;
                                    int i3114 = ((((i3112 & 109) | i3113) << 1) - (~(-i3113))) - 1;
                                    a = i3114 % 128;
                                    int i3115 = i3114 % 2;
                                    zV = layoutInflaterFactory2C0312o.V(aqzQ, keyCode4, keyEvent, 1);
                                    aqzQ.m = false;
                                    int i3116 = a;
                                    int i3117 = i3116 & 55;
                                    int i3118 = (((i3116 ^ 55) | i3117) << 1) - ((i3116 | 55) & (~i3117));
                                    b = i3118 % 128;
                                    int i3119 = i3118 % 2;
                                    if (!zV) {
                                    }
                                }
                                int i4113 = b;
                                int i4114 = i4113 | 93;
                                int i4115 = ((i4114 << 1) - (~(-((~(i4113 & 93)) & i4114)))) - 1;
                                a = i4115 % 128;
                                int i4116 = i4115 % 2;
                            }
                            int i4117 = a;
                            int i4118 = ((i4117 ^ 101) | (i4117 & 101)) << 1;
                            int i4119 = -(((~i4117) & 101) | (i4117 & (-102)));
                            int i41110 = ((i4118 | i4119) << 1) - (i4119 ^ i4118);
                            b = i41110 % 128;
                            int i41111 = i41110 % 2;
                            z2 = true;
                        } else {
                            if (layoutInflaterFactory2C0312o.O == null) {
                                int i2113 = b;
                                int i2114 = i2113 & 121;
                                i2 = (((i2113 ^ 121) | i2114) << 1) - ((i2113 | 121) & (~i2114));
                                a = i2 % 128;
                                if (i2 % 2 != 0) {
                                    aqzQ = layoutInflaterFactory2C0312o.Q(1);
                                } else {
                                    aqzQ = layoutInflaterFactory2C0312o.Q(0);
                                }
                                int i2115 = a;
                                int i31110 = ((i2115 | 85) << 1) - (i2115 ^ 85);
                                b = i31110 % 128;
                                int i31111 = i31110 % 2;
                                layoutInflaterFactory2C0312o.Z(aqzQ, keyEvent);
                                int keyCode5 = keyEvent.getKeyCode();
                                int i31112 = b;
                                int i31113 = i31112 ^ 109;
                                int i31114 = ((((i31112 & 109) | i31113) << 1) - (~(-i31113))) - 1;
                                a = i31114 % 128;
                                int i31115 = i31114 % 2;
                                zV = layoutInflaterFactory2C0312o.V(aqzQ, keyCode5, keyEvent, 1);
                                aqzQ.m = false;
                                int i31116 = a;
                                int i31117 = i31116 & 55;
                                int i31118 = (((i31116 ^ 55) | i31117) << 1) - ((i31116 | 55) & (~i31117));
                                b = i31118 % 128;
                                int i31119 = i31118 % 2;
                                if (!zV) {
                                    int i41112 = a;
                                    int i41113 = ((i41112 ^ 101) | (i41112 & 101)) << 1;
                                    int i41114 = -(((~i41112) & 101) | (i41112 & (-102)));
                                    int i41115 = ((i41113 | i41114) << 1) - (i41114 ^ i41113);
                                    b = i41115 % 128;
                                    int i41116 = i41115 % 2;
                                    z2 = true;
                                }
                            }
                            int i41117 = b;
                            int i41118 = i41117 | 93;
                            int i41119 = ((i41118 << 1) - (~(-((~(i41117 & 93)) & i41118)))) - 1;
                            a = i41119 % 128;
                            int i41120 = i41119 % 2;
                        }
                    }
                    if (!(!z2)) {
                    }
                }
                int i50 = a;
                int i51 = ((i50 ^ 105) | (i50 & 105)) << 1;
                int i52 = -(((~i50) & 105) | (i50 & (-106)));
                i = ((i51 | i52) << 1) - (i52 ^ i51);
                b = i % 128;
                if (i % 2 != 0) {
                    return z;
                }
                throw null;
            }
            if (!this.c.dispatchKeyShortcutEvent(keyEvent)) {
                z = false;
                layoutInflaterFactory2C0312o = LayoutInflaterFactory2C0312o.this;
                keyCode = keyEvent.getKeyCode();
                int i111 = b;
                int i112 = (i111 & (-6)) | ((~i111) & 5);
                int i113 = (i111 & 5) << 1;
                int i114 = (i112 & i113) + (i113 | i112);
                a = i114 % 128;
                int i115 = i114 % 2;
                layoutInflaterFactory2C0312o.T();
                zVar = layoutInflaterFactory2C0312o.i;
                if (zVar != null) {
                    int i116 = b;
                    int i117 = i116 ^ 123;
                    int i118 = -(-((i116 & 123) << 1));
                    i5 = (i117 ^ i118) + ((i118 & i117) << 1);
                    a = i5 % 128;
                    if (i5 % 2 == 0) {
                        zVar.c(keyCode, keyEvent);
                        obj.hashCode();
                        throw null;
                    }
                    if (!zVar.c(keyCode, keyEvent)) {
                        aqz = layoutInflaterFactory2C0312o.O;
                        if (aqz != null) {
                            int i119 = b + 21;
                            a = i119 % 128;
                            int i2116 = i119 % 2;
                            if (layoutInflaterFactory2C0312o.V(aqz, keyEvent.getKeyCode(), keyEvent, 1)) {
                                i3 = b + 55;
                                a = i3 % 128;
                                if (i3 % 2 == 0) {
                                    aQz aqz5 = layoutInflaterFactory2C0312o.O;
                                    throw null;
                                }
                                aqz2 = layoutInflaterFactory2C0312o.O;
                                if (aqz2 != null) {
                                    int i2117 = b;
                                    int i2118 = i2117 & 77;
                                    int i2119 = (i2117 | 77) & (~i2118);
                                    int i2120 = -(-(i2118 << 1));
                                    i4 = (i2119 & i2120) + (i2119 | i2120);
                                    a = i4 % 128;
                                    if (i4 % 2 != 0) {
                                        aqz2.n = false;
                                    } else {
                                        aqz2.n = true;
                                    }
                                    int i2121 = a + 111;
                                    b = i2121 % 128;
                                    int i2122 = i2121 % 2;
                                }
                            } else {
                                if (layoutInflaterFactory2C0312o.O == null) {
                                    int i21110 = b;
                                    int i21111 = i21110 & 121;
                                    i2 = (((i21110 ^ 121) | i21111) << 1) - ((i21110 | 121) & (~i21111));
                                    a = i2 % 128;
                                    if (i2 % 2 != 0) {
                                        aqzQ = layoutInflaterFactory2C0312o.Q(1);
                                    } else {
                                        aqzQ = layoutInflaterFactory2C0312o.Q(0);
                                    }
                                    int i21112 = a;
                                    int i311110 = ((i21112 | 85) << 1) - (i21112 ^ 85);
                                    b = i311110 % 128;
                                    int i311111 = i311110 % 2;
                                    layoutInflaterFactory2C0312o.Z(aqzQ, keyEvent);
                                    int keyCode6 = keyEvent.getKeyCode();
                                    int i311112 = b;
                                    int i311113 = i311112 ^ 109;
                                    int i311114 = ((((i311112 & 109) | i311113) << 1) - (~(-i311113))) - 1;
                                    a = i311114 % 128;
                                    int i311115 = i311114 % 2;
                                    zV = layoutInflaterFactory2C0312o.V(aqzQ, keyCode6, keyEvent, 1);
                                    aqzQ.m = false;
                                    int i311116 = a;
                                    int i311117 = i311116 & 55;
                                    int i311118 = (((i311116 ^ 55) | i311117) << 1) - ((i311116 | 55) & (~i311117));
                                    b = i311118 % 128;
                                    int i311119 = i311118 % 2;
                                    if (!zV) {
                                    }
                                }
                                int i411110 = b;
                                int i411111 = i411110 | 93;
                                int i411112 = ((i411111 << 1) - (~(-((~(i411110 & 93)) & i411111)))) - 1;
                                a = i411112 % 128;
                                int i41121 = i411112 % 2;
                            }
                            int i411113 = a;
                            int i411114 = ((i411113 ^ 101) | (i411113 & 101)) << 1;
                            int i411115 = -(((~i411113) & 101) | (i411113 & (-102)));
                            int i411116 = ((i411114 | i411115) << 1) - (i411115 ^ i411114);
                            b = i411116 % 128;
                            int i411117 = i411116 % 2;
                            z2 = true;
                        } else {
                            if (layoutInflaterFactory2C0312o.O == null) {
                                int i21113 = b;
                                int i21114 = i21113 & 121;
                                i2 = (((i21113 ^ 121) | i21114) << 1) - ((i21113 | 121) & (~i21114));
                                a = i2 % 128;
                                if (i2 % 2 != 0) {
                                    aqzQ = layoutInflaterFactory2C0312o.Q(1);
                                } else {
                                    aqzQ = layoutInflaterFactory2C0312o.Q(0);
                                }
                                int i21115 = a;
                                int i3111110 = ((i21115 | 85) << 1) - (i21115 ^ 85);
                                b = i3111110 % 128;
                                int i3111111 = i3111110 % 2;
                                layoutInflaterFactory2C0312o.Z(aqzQ, keyEvent);
                                int keyCode7 = keyEvent.getKeyCode();
                                int i3111112 = b;
                                int i3111113 = i3111112 ^ 109;
                                int i3111114 = ((((i3111112 & 109) | i3111113) << 1) - (~(-i3111113))) - 1;
                                a = i3111114 % 128;
                                int i3111115 = i3111114 % 2;
                                zV = layoutInflaterFactory2C0312o.V(aqzQ, keyCode7, keyEvent, 1);
                                aqzQ.m = false;
                                int i3111116 = a;
                                int i3111117 = i3111116 & 55;
                                int i3111118 = (((i3111116 ^ 55) | i3111117) << 1) - ((i3111116 | 55) & (~i3111117));
                                b = i3111118 % 128;
                                int i3111119 = i3111118 % 2;
                                if (!zV) {
                                    int i411118 = a;
                                    int i411119 = ((i411118 ^ 101) | (i411118 & 101)) << 1;
                                    int i4111110 = -(((~i411118) & 101) | (i411118 & (-102)));
                                    int i4111111 = ((i411119 | i4111110) << 1) - (i4111110 ^ i411119);
                                    b = i4111111 % 128;
                                    int i4111112 = i4111111 % 2;
                                    z2 = true;
                                }
                            }
                            int i4111113 = b;
                            int i4111114 = i4111113 | 93;
                            int i4111115 = ((i4111114 << 1) - (~(-((~(i4111113 & 93)) & i4111114)))) - 1;
                            a = i4111115 % 128;
                            int i41122 = i4111115 % 2;
                        }
                    } else {
                        int i4111116 = a;
                        int i4111117 = ((i4111116 ^ 101) | (i4111116 & 101)) << 1;
                        int i4111118 = -(((~i4111116) & 101) | (i4111116 & (-102)));
                        int i4111119 = ((i4111117 | i4111118) << 1) - (i4111118 ^ i4111117);
                        b = i4111119 % 128;
                        int i41111110 = i4111119 % 2;
                        z2 = true;
                    }
                } else {
                    aqz = layoutInflaterFactory2C0312o.O;
                    if (aqz != null) {
                        int i1110 = b + 21;
                        a = i1110 % 128;
                        int i21116 = i1110 % 2;
                        if (layoutInflaterFactory2C0312o.V(aqz, keyEvent.getKeyCode(), keyEvent, 1)) {
                            i3 = b + 55;
                            a = i3 % 128;
                            if (i3 % 2 == 0) {
                                aQz aqz6 = layoutInflaterFactory2C0312o.O;
                                throw null;
                            }
                            aqz2 = layoutInflaterFactory2C0312o.O;
                            if (aqz2 != null) {
                                int i21117 = b;
                                int i21118 = i21117 & 77;
                                int i21119 = (i21117 | 77) & (~i21118);
                                int i2123 = -(-(i21118 << 1));
                                i4 = (i21119 & i2123) + (i21119 | i2123);
                                a = i4 % 128;
                                if (i4 % 2 != 0) {
                                    aqz2.n = false;
                                } else {
                                    aqz2.n = true;
                                }
                                int i2124 = a + 111;
                                b = i2124 % 128;
                                int i2125 = i2124 % 2;
                            }
                        } else {
                            if (layoutInflaterFactory2C0312o.O == null) {
                                int i211110 = b;
                                int i211111 = i211110 & 121;
                                i2 = (((i211110 ^ 121) | i211111) << 1) - ((i211110 | 121) & (~i211111));
                                a = i2 % 128;
                                if (i2 % 2 != 0) {
                                    aqzQ = layoutInflaterFactory2C0312o.Q(1);
                                } else {
                                    aqzQ = layoutInflaterFactory2C0312o.Q(0);
                                }
                                int i211112 = a;
                                int i31111110 = ((i211112 | 85) << 1) - (i211112 ^ 85);
                                b = i31111110 % 128;
                                int i31111111 = i31111110 % 2;
                                layoutInflaterFactory2C0312o.Z(aqzQ, keyEvent);
                                int keyCode8 = keyEvent.getKeyCode();
                                int i31111112 = b;
                                int i31111113 = i31111112 ^ 109;
                                int i31111114 = ((((i31111112 & 109) | i31111113) << 1) - (~(-i31111113))) - 1;
                                a = i31111114 % 128;
                                int i31111115 = i31111114 % 2;
                                zV = layoutInflaterFactory2C0312o.V(aqzQ, keyCode8, keyEvent, 1);
                                aqzQ.m = false;
                                int i31111116 = a;
                                int i31111117 = i31111116 & 55;
                                int i31111118 = (((i31111116 ^ 55) | i31111117) << 1) - ((i31111116 | 55) & (~i31111117));
                                b = i31111118 % 128;
                                int i31111119 = i31111118 % 2;
                                if (!zV) {
                                }
                            }
                            int i41111111 = b;
                            int i41111112 = i41111111 | 93;
                            int i41111113 = ((i41111112 << 1) - (~(-((~(i41111111 & 93)) & i41111112)))) - 1;
                            a = i41111113 % 128;
                            int i41123 = i41111113 % 2;
                        }
                        int i41111114 = a;
                        int i41111115 = ((i41111114 ^ 101) | (i41111114 & 101)) << 1;
                        int i41111116 = -(((~i41111114) & 101) | (i41111114 & (-102)));
                        int i41111117 = ((i41111115 | i41111116) << 1) - (i41111116 ^ i41111115);
                        b = i41111117 % 128;
                        int i41111118 = i41111117 % 2;
                        z2 = true;
                    } else {
                        if (layoutInflaterFactory2C0312o.O == null) {
                            int i211113 = b;
                            int i211114 = i211113 & 121;
                            i2 = (((i211113 ^ 121) | i211114) << 1) - ((i211113 | 121) & (~i211114));
                            a = i2 % 128;
                            if (i2 % 2 != 0) {
                                aqzQ = layoutInflaterFactory2C0312o.Q(1);
                            } else {
                                aqzQ = layoutInflaterFactory2C0312o.Q(0);
                            }
                            int i211115 = a;
                            int i311111110 = ((i211115 | 85) << 1) - (i211115 ^ 85);
                            b = i311111110 % 128;
                            int i311111111 = i311111110 % 2;
                            layoutInflaterFactory2C0312o.Z(aqzQ, keyEvent);
                            int keyCode9 = keyEvent.getKeyCode();
                            int i311111112 = b;
                            int i311111113 = i311111112 ^ 109;
                            int i311111114 = ((((i311111112 & 109) | i311111113) << 1) - (~(-i311111113))) - 1;
                            a = i311111114 % 128;
                            int i311111115 = i311111114 % 2;
                            zV = layoutInflaterFactory2C0312o.V(aqzQ, keyCode9, keyEvent, 1);
                            aqzQ.m = false;
                            int i311111116 = a;
                            int i311111117 = i311111116 & 55;
                            int i311111118 = (((i311111116 ^ 55) | i311111117) << 1) - ((i311111116 | 55) & (~i311111117));
                            b = i311111118 % 128;
                            int i311111119 = i311111118 % 2;
                            if (!zV) {
                                int i41111119 = a;
                                int i411111110 = ((i41111119 ^ 101) | (i41111119 & 101)) << 1;
                                int i411111111 = -(((~i41111119) & 101) | (i41111119 & (-102)));
                                int i411111112 = ((i411111110 | i411111111) << 1) - (i411111111 ^ i411111110);
                                b = i411111112 % 128;
                                int i411111113 = i411111112 % 2;
                                z2 = true;
                            }
                        }
                        int i411111114 = b;
                        int i411111115 = i411111114 | 93;
                        int i411111116 = ((i411111115 << 1) - (~(-((~(i411111114 & 93)) & i411111115)))) - 1;
                        a = i411111116 % 128;
                        int i41124 = i411111116 % 2;
                    }
                }
                if (!(!z2)) {
                }
            }
            int i53 = a;
            int i54 = ((i53 ^ 105) | (i53 & 105)) << 1;
            int i55 = -(((~i53) & 105) | (i53 & (-106)));
            i = ((i54 | i55) << 1) - (i55 ^ i54);
            b = i % 128;
            if (i % 2 != 0) {
                return z;
            }
            throw null;
            int i56 = a;
            int i57 = (i56 ^ 103) + ((i56 & 103) << 1);
            b = i57 % 128;
            int i58 = i57 % 2;
            z = true;
            int i59 = a;
            int i510 = ((i59 ^ 105) | (i59 & 105)) << 1;
            int i511 = -(((~i59) & 105) | (i59 & (-106)));
            i = ((i510 | i511) << 1) - (i511 ^ i510);
            b = i % 128;
            if (i % 2 != 0) {
                return z;
            }
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:101:0x0406  */
        /* JADX WARN: Code duplicated, block: B:103:0x041c  */
        /* JADX WARN: Code duplicated, block: B:106:0x042b  */
        /* JADX WARN: Code duplicated, block: B:108:0x0439  */
        /* JADX WARN: Code duplicated, block: B:110:0x045a  */
        /* JADX WARN: Code duplicated, block: B:111:0x045e  */
        /* JADX WARN: Code duplicated, block: B:115:0x0469  */
        /* JADX WARN: Code duplicated, block: B:116:0x04a8  */
        /* JADX WARN: Code duplicated, block: B:118:0x04b1  */
        /* JADX WARN: Code duplicated, block: B:120:0x04c9  */
        /* JADX WARN: Code duplicated, block: B:30:0x00e2  */
        /* JADX WARN: Code duplicated, block: B:32:0x00ed  */
        /* JADX WARN: Code duplicated, block: B:86:0x035c  */
        /* JADX WARN: Code duplicated, block: B:88:0x036d  */
        /* JADX WARN: Code duplicated, block: B:90:0x037f  */
        /* JADX WARN: Code duplicated, block: B:92:0x0394  */
        /* JADX WARN: Code duplicated, block: B:93:0x039a  */
        /* JADX WARN: Code duplicated, block: B:96:0x03d2  */
        /* JADX WARN: Code duplicated, block: B:98:0x03dc  */
        /* JADX WARN: Code duplicated, block: B:99:0x03fa  */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final ActionMode c(ActionMode.Callback callback) {
            int i;
            j jVarG;
            boolean z;
            int i2;
            ActionBarContextView actionBarContextView;
            int i3;
            View view;
            int i4;
            int i5;
            R rD;
            N n;
            int i6;
            View view2;
            int i7;
            Context contextI;
            Context hVar;
            InterfaceC0310l interfaceC0310l;
            int i8 = 2 % 2;
            e.aRf arf = new e.aRf(LayoutInflaterFactory2C0312o.this.l, callback);
            int i9 = a;
            int i10 = (i9 & 115) + (i9 | 115);
            b = i10 % 128;
            int i11 = i10 % 2;
            LayoutInflaterFactory2C0312o layoutInflaterFactory2C0312o = LayoutInflaterFactory2C0312o.this;
            Objects.requireNonNull(layoutInflaterFactory2C0312o);
            j jVar = layoutInflaterFactory2C0312o.t;
            int i12 = b + 55;
            int i13 = i12 % 128;
            a = i13;
            int i14 = i12 % 2;
            if (jVar != null) {
                int i15 = (i13 & 17) + (i13 | 17);
                b = i15 % 128;
                int i16 = i15 % 2;
                jVar.d();
                int i17 = b;
                int i18 = (((i17 | 122) << 1) - (i17 ^ 122)) - 1;
                a = i18 % 128;
                int i19 = i18 % 2;
            }
            aQp aqp = layoutInflaterFactory2C0312o.new aQp(arf);
            int i20 = a;
            int i21 = (((i20 | 98) << 1) - (i20 ^ 98)) - 1;
            b = i21 % 128;
            int i22 = i21 % 2;
            layoutInflaterFactory2C0312o.T();
            z zVar = layoutInflaterFactory2C0312o.i;
            Object obj = null;
            if (zVar != null) {
                j jVarS = zVar.s(aqp);
                layoutInflaterFactory2C0312o.t = jVarS;
                if (jVarS != null) {
                    int i23 = a + 37;
                    b = i23 % 128;
                    if (i23 % 2 == 0) {
                        InterfaceC0310l interfaceC0310l2 = layoutInflaterFactory2C0312o.n;
                        obj.hashCode();
                        throw null;
                    }
                    InterfaceC0310l interfaceC0310l3 = layoutInflaterFactory2C0312o.n;
                    if (interfaceC0310l3 != null) {
                        interfaceC0310l3.f(jVarS);
                    }
                }
            }
            if (layoutInflaterFactory2C0312o.t == null) {
                int i24 = b + 81;
                a = i24 % 128;
                if (i24 % 2 != 0) {
                    layoutInflaterFactory2C0312o.L();
                    j jVar2 = layoutInflaterFactory2C0312o.t;
                    throw null;
                }
                layoutInflaterFactory2C0312o.L();
                j jVar3 = layoutInflaterFactory2C0312o.t;
                if (jVar3 != null) {
                    jVar3.d();
                    int i25 = b;
                    int i26 = ((i25 | 27) << 1) - (i25 ^ 27);
                    a = i26 % 128;
                    int i27 = i26 % 2;
                }
                InterfaceC0310l interfaceC0310l4 = layoutInflaterFactory2C0312o.n;
                if (interfaceC0310l4 != null) {
                    int i28 = a;
                    int i29 = (i28 ^ 125) + ((i28 & 125) << 1);
                    b = i29 % 128;
                    int i30 = i29 % 2;
                    if (layoutInflaterFactory2C0312o.S) {
                        i = a + 81;
                        b = i % 128;
                        if (i % 2 == 0) {
                            int i31 = 2 / 3;
                        }
                        jVarG = null;
                    } else {
                        int i32 = a + 7;
                        b = i32 % 128;
                        int i33 = i32 % 2;
                        try {
                            jVarG = interfaceC0310l4.g(aqp);
                            int i34 = a;
                            int i35 = (i34 & 90) + (i34 | 90);
                            int i36 = (i35 ^ (-1)) + (i35 << 1);
                            b = i36 % 128;
                            int i37 = i36 % 2;
                        } catch (AbstractMethodError unused) {
                            i = a + 81;
                            b = i % 128;
                            if (i % 2 == 0) {
                                int i38 = 2 / 3;
                            }
                            jVarG = null;
                        }
                    }
                } else {
                    i = a + 81;
                    b = i % 128;
                    if (i % 2 == 0) {
                        int i39 = 2 / 3;
                    }
                    jVarG = null;
                }
                if (jVarG != null) {
                    int i40 = a;
                    int i41 = i40 ^ 121;
                    int i42 = (i40 & 121) << 1;
                    int i43 = (i41 ^ i42) + ((i42 & i41) << 1);
                    b = i43 % 128;
                    if (i43 % 2 == 0) {
                        layoutInflaterFactory2C0312o.t = jVarG;
                        obj.hashCode();
                        throw null;
                    }
                    layoutInflaterFactory2C0312o.t = jVarG;
                } else {
                    if (layoutInflaterFactory2C0312o.u == null) {
                        int i44 = a + 21;
                        b = i44 % 128;
                        int i45 = i44 % 2;
                        if (layoutInflaterFactory2C0312o.I) {
                            TypedValue typedValue = new TypedValue();
                            Context context = layoutInflaterFactory2C0312o.l;
                            int i46 = b;
                            int i47 = ((i46 | 67) << 1) - (i46 ^ 67);
                            a = i47 % 128;
                            int i48 = i47 % 2;
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(ivas.gov.bisp.enumeration.R.attr.actionBarTheme, typedValue, true);
                            int i49 = a;
                            int i50 = i49 & 115;
                            int i51 = ((~i50) & (i49 | 115)) + (i50 << 1);
                            b = i51 % 128;
                            if (i51 % 2 == 0) {
                                int i52 = typedValue.resourceId;
                                obj.hashCode();
                                throw null;
                            }
                            if (typedValue.resourceId != 0) {
                                Resources.Theme themeNewTheme = layoutInflaterFactory2C0312o.l.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                                hVar = new h(layoutInflaterFactory2C0312o.l, 0);
                                int i53 = b;
                                int i54 = i53 & 77;
                                int i55 = i53 | 77;
                                int i56 = (i54 & i55) + (i55 | i54);
                                a = i56 % 128;
                                int i57 = i56 % 2;
                                hVar.getTheme().setTo(themeNewTheme);
                                int i58 = b;
                                int i59 = i58 ^ 89;
                                int i60 = (((i58 & 89) | i59) << 1) - i59;
                                a = i60 % 128;
                                int i61 = i60 % 2;
                            } else {
                                hVar = layoutInflaterFactory2C0312o.l;
                            }
                            layoutInflaterFactory2C0312o.u = new ActionBarContextView(hVar, null);
                            PopupWindow popupWindow = new PopupWindow(hVar, (AttributeSet) null, ivas.gov.bisp.enumeration.R.attr.actionModePopupWindowStyle);
                            int i62 = a;
                            int i63 = (i62 ^ 31) + ((i62 & 31) << 1);
                            b = i63 % 128;
                            if (i63 % 2 == 0) {
                                layoutInflaterFactory2C0312o.w = popupWindow;
                            } else {
                                layoutInflaterFactory2C0312o.w = popupWindow;
                            }
                            u.e(popupWindow, 2);
                            PopupWindow popupWindow2 = layoutInflaterFactory2C0312o.w;
                            ActionBarContextView actionBarContextView2 = layoutInflaterFactory2C0312o.u;
                            int i64 = a;
                            int i65 = i64 & 85;
                            int i66 = i65 + ((i64 ^ 85) | i65);
                            b = i66 % 128;
                            int i67 = i66 % 2;
                            popupWindow2.setContentView(actionBarContextView2);
                            layoutInflaterFactory2C0312o.w.setWidth(-1);
                            Resources.Theme theme2 = hVar.getTheme();
                            int i68 = b + 39;
                            a = i68 % 128;
                            int i69 = i68 % 2;
                            theme2.resolveAttribute(ivas.gov.bisp.enumeration.R.attr.actionBarSize, typedValue, true);
                            int i70 = typedValue.data;
                            DisplayMetrics displayMetrics = hVar.getResources().getDisplayMetrics();
                            int i71 = b;
                            int i72 = (i71 & 29) + (i71 | 29);
                            a = i72 % 128;
                            int i73 = i72 % 2;
                            layoutInflaterFactory2C0312o.u.setContentHeight(TypedValue.complexToDimensionPixelSize(i70, displayMetrics));
                            layoutInflaterFactory2C0312o.w.setHeight(-2);
                            M m = new M(layoutInflaterFactory2C0312o);
                            int i74 = b;
                            int i75 = (i74 & 49) + (i74 | 49);
                            a = i75 % 128;
                            int i76 = i75 % 2;
                            layoutInflaterFactory2C0312o.v = m;
                            int i77 = b;
                            int i78 = i77 ^ 87;
                            int i79 = (i77 & 87) << 1;
                            int i80 = ((i78 | i79) << 1) - (i79 ^ i78);
                            a = i80 % 128;
                            int i81 = i80 % 2;
                        } else {
                            ViewStubCompat viewStubCompat = (ViewStubCompat) layoutInflaterFactory2C0312o.B.findViewById(ivas.gov.bisp.enumeration.R.id.action_mode_bar_stub);
                            if (viewStubCompat != null) {
                                int i82 = a;
                                int i83 = (i82 ^ 61) + ((i82 & 61) << 1);
                                b = i83 % 128;
                                int i84 = i83 % 2;
                                layoutInflaterFactory2C0312o.T();
                                z zVar2 = layoutInflaterFactory2C0312o.i;
                                if (zVar2 != null) {
                                    int i85 = b;
                                    int i86 = i85 & 77;
                                    int i87 = -(-((i85 ^ 77) | i86));
                                    int i88 = ((i86 | i87) << 1) - (i87 ^ i86);
                                    a = i88 % 128;
                                    int i89 = i88 % 2;
                                    contextI = zVar2.i();
                                    int i90 = a;
                                    int i91 = i90 & 113;
                                    int i92 = ((i90 | 113) & (~i91)) + (i91 << 1);
                                    b = i92 % 128;
                                    int i93 = i92 % 2;
                                } else {
                                    contextI = null;
                                }
                                if (contextI == null) {
                                    int i94 = b;
                                    int i95 = ((((i94 ^ 27) | (i94 & 27)) << 1) - (~(-(((~i94) & 27) | (i94 & (-28)))))) - 1;
                                    a = i95 % 128;
                                    if (i95 % 2 != 0) {
                                        Context context2 = layoutInflaterFactory2C0312o.l;
                                        obj.hashCode();
                                        throw null;
                                    }
                                    contextI = layoutInflaterFactory2C0312o.l;
                                }
                                viewStubCompat.setLayoutInflater(LayoutInflater.from(contextI));
                                int i96 = a;
                                int i97 = (-2) - (((i96 ^ 126) + ((i96 & 126) << 1)) ^ (-1));
                                b = i97 % 128;
                                int i98 = i97 % 2;
                                layoutInflaterFactory2C0312o.u = (ActionBarContextView) viewStubCompat.b();
                            }
                        }
                    }
                    if (layoutInflaterFactory2C0312o.u != null) {
                        int i99 = a;
                        int i100 = i99 & 5;
                        int i101 = -(-((i99 ^ 5) | i100));
                        int i102 = ((i100 | i101) << 1) - (i101 ^ i100);
                        b = i102 % 128;
                        int i103 = i102 % 2;
                        layoutInflaterFactory2C0312o.L();
                        layoutInflaterFactory2C0312o.u.i();
                        int i104 = a;
                        int i105 = ((i104 | 83) << 1) - (i104 ^ 83);
                        b = i105 % 128;
                        if (i105 % 2 == 0) {
                            layoutInflaterFactory2C0312o.u.getContext();
                            ActionBarContextView actionBarContextView3 = layoutInflaterFactory2C0312o.u;
                            obj.hashCode();
                            throw null;
                        }
                        Context context3 = layoutInflaterFactory2C0312o.u.getContext();
                        ActionBarContextView actionBarContextView4 = layoutInflaterFactory2C0312o.u;
                        int i106 = a;
                        int i107 = i106 & 83;
                        int i108 = (i106 | 83) & (~i107);
                        int i109 = -(-(i107 << 1));
                        int i110 = (i108 ^ i109) + ((i108 & i109) << 1);
                        b = i110 % 128;
                        int i111 = i110 % 2;
                        if (layoutInflaterFactory2C0312o.w != null) {
                            int i112 = a;
                            int i113 = i112 + 97;
                            b = i113 % 128;
                            int i114 = i113 % 2;
                            int i115 = ((i112 ^ 62) + ((i112 & 62) << 1)) - 1;
                            b = i115 % 128;
                            int i116 = i115 % 2;
                            z = false;
                        } else {
                            z = true;
                        }
                        r rVar = new r(context3, actionBarContextView4, aqp, z);
                        n nVar = rVar.e;
                        int i117 = a;
                        int i118 = i117 ^ 69;
                        int i119 = ((((i117 & 69) | i118) << 1) - (~(-i118))) - 1;
                        b = i119 % 128;
                        if (i119 % 2 == 0) {
                            boolean zB = aqp.b(rVar, nVar);
                            int i120 = 25 / 0;
                            if (zB) {
                                int i121 = b;
                                int i122 = i121 & 63;
                                i2 = (i122 - (~((i121 ^ 63) | i122))) - 1;
                                a = i2 % 128;
                                if (i2 % 2 == 0) {
                                    rVar.c();
                                    layoutInflaterFactory2C0312o.u.b(rVar);
                                    throw null;
                                }
                                rVar.c();
                                layoutInflaterFactory2C0312o.u.b(rVar);
                                layoutInflaterFactory2C0312o.t = rVar;
                                if (layoutInflaterFactory2C0312o.W()) {
                                    int i123 = b;
                                    int i124 = i123 ^ 43;
                                    int i125 = -(-((i123 & 43) << 1));
                                    i5 = ((i124 | i125) << 1) - (i125 ^ i124);
                                    a = i5 % 128;
                                    if (i5 % 2 != 0) {
                                        layoutInflaterFactory2C0312o.u.setAlpha(1.0f);
                                    } else {
                                        layoutInflaterFactory2C0312o.u.setAlpha(0.0f);
                                    }
                                    int i126 = b;
                                    int i127 = ((i126 ^ 56) + ((i126 & 56) << 1)) - 1;
                                    a = i127 % 128;
                                    int i128 = i127 % 2;
                                    rD = T.d(layoutInflaterFactory2C0312o.u);
                                    rD.c(1.0f);
                                    layoutInflaterFactory2C0312o.x = rD;
                                    n = new N(layoutInflaterFactory2C0312o);
                                    int i129 = b;
                                    int i130 = i129 & 45;
                                    i6 = (((i129 ^ 45) | i130) << 1) - ((i129 | 45) & (~i130));
                                    a = i6 % 128;
                                    if (i6 % 2 == 0) {
                                        rD.c.get();
                                        obj.hashCode();
                                        throw null;
                                    }
                                    view2 = rD.c.get();
                                    if (view2 != null) {
                                        int i131 = a;
                                        int i132 = ((i131 ^ 11) | (i131 & 11)) << 1;
                                        int i133 = -(((~i131) & 11) | (i131 & (-12)));
                                        int i134 = ((i132 | i133) << 1) - (i133 ^ i132);
                                        b = i134 % 128;
                                        int i135 = i134 % 2;
                                        rD.h(view2, n);
                                    }
                                } else {
                                    layoutInflaterFactory2C0312o.u.setAlpha(1.0f);
                                    actionBarContextView = layoutInflaterFactory2C0312o.u;
                                    int i136 = a + 18;
                                    i3 = (i136 ^ (-1)) + (i136 << 1);
                                    b = i3 % 128;
                                    if (i3 % 2 == 0) {
                                        actionBarContextView.setVisibility(1);
                                        if (!(!(layoutInflaterFactory2C0312o.u.getParent() instanceof View))) {
                                            view = (View) layoutInflaterFactory2C0312o.u.getParent();
                                            WeakHashMap<View, R> weakHashMap = T.c;
                                            int i137 = b;
                                            int i138 = i137 | 101;
                                            int i139 = i138 << 1;
                                            int i140 = -((~(i137 & 101)) & i138);
                                            i4 = (i139 ^ i140) + ((i140 & i139) << 1);
                                            a = i4 % 128;
                                            if (i4 % 2 == 0) {
                                                T.aXd.d(view);
                                                obj.hashCode();
                                                throw null;
                                            }
                                            T.aXd.d(view);
                                        }
                                    } else {
                                        actionBarContextView.setVisibility(0);
                                        if (layoutInflaterFactory2C0312o.u.getParent() instanceof View) {
                                            view = (View) layoutInflaterFactory2C0312o.u.getParent();
                                            WeakHashMap<View, R> weakHashMap2 = T.c;
                                            int i1310 = b;
                                            int i1311 = i1310 | 101;
                                            int i1312 = i1311 << 1;
                                            int i141 = -((~(i1310 & 101)) & i1311);
                                            i4 = (i1312 ^ i141) + ((i141 & i1312) << 1);
                                            a = i4 % 128;
                                            if (i4 % 2 == 0) {
                                                T.aXd.d(view);
                                                obj.hashCode();
                                                throw null;
                                            }
                                            T.aXd.d(view);
                                        }
                                    }
                                }
                                if (layoutInflaterFactory2C0312o.w != null) {
                                    int i142 = a;
                                    int i143 = i142 & 85;
                                    int i144 = (i143 - (~((i142 ^ 85) | i143))) - 1;
                                    b = i144 % 128;
                                    int i145 = i144 % 2;
                                    View decorView = layoutInflaterFactory2C0312o.k.getDecorView();
                                    Runnable runnable = layoutInflaterFactory2C0312o.v;
                                    int i146 = a;
                                    int i147 = (((i146 ^ 113) | (i146 & 113)) << 1) - (((~i146) & 113) | (i146 & (-114)));
                                    b = i147 % 128;
                                    int i148 = i147 % 2;
                                    decorView.post(runnable);
                                    int i149 = a;
                                    int i150 = i149 & 7;
                                    int i151 = (i150 - (~(-(-((i149 ^ 7) | i150))))) - 1;
                                    b = i151 % 128;
                                    int i152 = i151 % 2;
                                }
                            } else {
                                layoutInflaterFactory2C0312o.t = null;
                                int i153 = a;
                                int i154 = i153 & 27;
                                i7 = (((i153 | 27) & (~i154)) - (~(-(-(i154 << 1))))) - 1;
                                b = i7 % 128;
                                if (i7 % 2 == 0) {
                                    int i155 = 4 % 3;
                                }
                            }
                        } else if (aqp.b(rVar, nVar)) {
                            int i1210 = b;
                            int i1211 = i1210 & 63;
                            i2 = (i1211 - (~((i1210 ^ 63) | i1211))) - 1;
                            a = i2 % 128;
                            if (i2 % 2 == 0) {
                                rVar.c();
                                layoutInflaterFactory2C0312o.u.b(rVar);
                                throw null;
                            }
                            rVar.c();
                            layoutInflaterFactory2C0312o.u.b(rVar);
                            layoutInflaterFactory2C0312o.t = rVar;
                            if (layoutInflaterFactory2C0312o.W()) {
                                int i1212 = b;
                                int i1213 = i1212 ^ 43;
                                int i1214 = -(-((i1212 & 43) << 1));
                                i5 = ((i1213 | i1214) << 1) - (i1214 ^ i1213);
                                a = i5 % 128;
                                if (i5 % 2 != 0) {
                                    layoutInflaterFactory2C0312o.u.setAlpha(1.0f);
                                } else {
                                    layoutInflaterFactory2C0312o.u.setAlpha(0.0f);
                                }
                                int i1215 = b;
                                int i1216 = ((i1215 ^ 56) + ((i1215 & 56) << 1)) - 1;
                                a = i1216 % 128;
                                int i1217 = i1216 % 2;
                                rD = T.d(layoutInflaterFactory2C0312o.u);
                                rD.c(1.0f);
                                layoutInflaterFactory2C0312o.x = rD;
                                n = new N(layoutInflaterFactory2C0312o);
                                int i1218 = b;
                                int i1313 = i1218 & 45;
                                i6 = (((i1218 ^ 45) | i1313) << 1) - ((i1218 | 45) & (~i1313));
                                a = i6 % 128;
                                if (i6 % 2 == 0) {
                                    rD.c.get();
                                    obj.hashCode();
                                    throw null;
                                }
                                view2 = rD.c.get();
                                if (view2 != null) {
                                    int i1314 = a;
                                    int i1315 = ((i1314 ^ 11) | (i1314 & 11)) << 1;
                                    int i1316 = -(((~i1314) & 11) | (i1314 & (-12)));
                                    int i1317 = ((i1315 | i1316) << 1) - (i1316 ^ i1315);
                                    b = i1317 % 128;
                                    int i1318 = i1317 % 2;
                                    rD.h(view2, n);
                                }
                            } else {
                                layoutInflaterFactory2C0312o.u.setAlpha(1.0f);
                                actionBarContextView = layoutInflaterFactory2C0312o.u;
                                int i1319 = a + 18;
                                i3 = (i1319 ^ (-1)) + (i1319 << 1);
                                b = i3 % 128;
                                if (i3 % 2 == 0) {
                                    actionBarContextView.setVisibility(1);
                                    if (!(!(layoutInflaterFactory2C0312o.u.getParent() instanceof View))) {
                                        view = (View) layoutInflaterFactory2C0312o.u.getParent();
                                        WeakHashMap<View, R> weakHashMap3 = T.c;
                                        int i13110 = b;
                                        int i13111 = i13110 | 101;
                                        int i13112 = i13111 << 1;
                                        int i1410 = -((~(i13110 & 101)) & i13111);
                                        i4 = (i13112 ^ i1410) + ((i1410 & i13112) << 1);
                                        a = i4 % 128;
                                        if (i4 % 2 == 0) {
                                            T.aXd.d(view);
                                            obj.hashCode();
                                            throw null;
                                        }
                                        T.aXd.d(view);
                                    }
                                } else {
                                    actionBarContextView.setVisibility(0);
                                    if (layoutInflaterFactory2C0312o.u.getParent() instanceof View) {
                                        view = (View) layoutInflaterFactory2C0312o.u.getParent();
                                        WeakHashMap<View, R> weakHashMap4 = T.c;
                                        int i13113 = b;
                                        int i13114 = i13113 | 101;
                                        int i13115 = i13114 << 1;
                                        int i1411 = -((~(i13113 & 101)) & i13114);
                                        i4 = (i13115 ^ i1411) + ((i1411 & i13115) << 1);
                                        a = i4 % 128;
                                        if (i4 % 2 == 0) {
                                            T.aXd.d(view);
                                            obj.hashCode();
                                            throw null;
                                        }
                                        T.aXd.d(view);
                                    }
                                }
                            }
                            if (layoutInflaterFactory2C0312o.w != null) {
                                int i1412 = a;
                                int i1413 = i1412 & 85;
                                int i1414 = (i1413 - (~((i1412 ^ 85) | i1413))) - 1;
                                b = i1414 % 128;
                                int i1415 = i1414 % 2;
                                View decorView2 = layoutInflaterFactory2C0312o.k.getDecorView();
                                Runnable runnable2 = layoutInflaterFactory2C0312o.v;
                                int i1416 = a;
                                int i1417 = (((i1416 ^ 113) | (i1416 & 113)) << 1) - (((~i1416) & 113) | (i1416 & (-114)));
                                b = i1417 % 128;
                                int i1418 = i1417 % 2;
                                decorView2.post(runnable2);
                                int i1419 = a;
                                int i156 = i1419 & 7;
                                int i157 = (i156 - (~(-(-((i1419 ^ 7) | i156))))) - 1;
                                b = i157 % 128;
                                int i158 = i157 % 2;
                            }
                        } else {
                            layoutInflaterFactory2C0312o.t = null;
                            int i159 = a;
                            int i1510 = i159 & 27;
                            i7 = (((i159 | 27) & (~i1510)) - (~(-(-(i1510 << 1))))) - 1;
                            b = i7 % 128;
                            if (i7 % 2 == 0) {
                                int i1511 = 4 % 3;
                            }
                        }
                    }
                }
                j jVar4 = layoutInflaterFactory2C0312o.t;
                if (jVar4 != null && (interfaceC0310l = layoutInflaterFactory2C0312o.n) != null) {
                    int i160 = a;
                    int i161 = i160 & 113;
                    int i162 = i161 + ((i160 ^ 113) | i161);
                    b = i162 % 128;
                    int i163 = i162 % 2;
                    interfaceC0310l.f(jVar4);
                    int i164 = a;
                    int i165 = ((i164 | 101) << 1) - (i164 ^ 101);
                    b = i165 % 128;
                    int i166 = i165 % 2;
                }
                layoutInflaterFactory2C0312o.t = layoutInflaterFactory2C0312o.t;
            }
            j jVar5 = layoutInflaterFactory2C0312o.t;
            if (jVar5 != null) {
                int i167 = b;
                int i168 = (-2) - ((((i167 | 90) << 1) - (i167 ^ 90)) ^ (-1));
                a = i168 % 128;
                int i169 = i168 % 2;
                return arf.h(jVar5);
            }
            int i170 = b;
            int i171 = ((i170 | 75) << 1) - (i170 ^ 75);
            a = i171 % 128;
            int i172 = i171 % 2;
            return null;
        }
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.j.o$aQv */
    public abstract class aQv {
        private static int a = 0;
        private static int b = 1;
        public BroadcastReceiver c;

        /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.j.o$aQv$aQx */
        public class aQx extends BroadcastReceiver {
            private static int a = 0;
            private static int b = 1;

            public aQx() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                int i = 2 % 2;
                int i2 = a;
                int i3 = ((i2 & 12) + (i2 | 12)) - 1;
                b = i3 % 128;
                int i4 = i3 % 2;
                aQv.this.f();
                int i5 = a;
                int i6 = i5 & 99;
                int i7 = (((i5 | 99) & (~i6)) - (~(i6 << 1))) - 1;
                b = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 34 / 0;
                }
            }
        }

        public aQv() {
        }

        public void c() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((((i2 ^ 69) | (i2 & 69)) << 1) - (~(-(((~i2) & 69) | (i2 & (-70)))))) - 1;
            b = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            BroadcastReceiver broadcastReceiver = this.c;
            if (broadcastReceiver != null) {
                try {
                    LayoutInflaterFactory2C0312o.this.l.unregisterReceiver(broadcastReceiver);
                    int i4 = a;
                    int i5 = (((i4 & (-120)) | ((~i4) & 119)) - (~(-(-((i4 & 119) << 1))))) - 1;
                    b = i5 % 128;
                    int i6 = i5 % 2;
                } catch (IllegalArgumentException unused) {
                }
                this.c = null;
                int i7 = b;
                int i8 = i7 & 97;
                int i9 = ((i7 ^ 97) | i8) << 1;
                int i10 = -((i7 | 97) & (~i8));
                int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
                a = i11 % 128;
                int i12 = i11 % 2;
            }
            int i13 = b + 89;
            a = i13 % 128;
            int i14 = i13 % 2;
        }

        public abstract IntentFilter d();

        public abstract int e();

        public abstract void f();

        public void g() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 77;
            int i4 = i2 | 77;
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            a = i5 % 128;
            int i6 = i5 % 2;
            c();
            IntentFilter intentFilterD = d();
            if (intentFilterD != null) {
                int i7 = a;
                int i8 = i7 & 111;
                int i9 = -(-((i7 ^ 111) | i8));
                int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
                b = i10 % 128;
                int i11 = i10 % 2;
                if (intentFilterD.countActions() != 0) {
                    int i12 = b;
                    int i13 = (((i12 | 16) << 1) - (i12 ^ 16)) - 1;
                    a = i13 % 128;
                    int i14 = i13 % 2;
                    if (this.c == null) {
                        this.c = new aQx();
                        int i15 = a;
                        int i16 = i15 & 67;
                        int i17 = (i15 | 67) & (~i16);
                        int i18 = -(-(i16 << 1));
                        int i19 = (i17 ^ i18) + ((i17 & i18) << 1);
                        b = i19 % 128;
                        int i20 = i19 % 2;
                    }
                    LayoutInflaterFactory2C0312o.this.l.registerReceiver(this.c, intentFilterD);
                    int i21 = a;
                    int i22 = i21 & 9;
                    int i23 = (i21 ^ 9) | i22;
                    int i24 = ((i22 | i23) << 1) - (i22 ^ i23);
                    b = i24 % 128;
                    int i25 = i24 % 2;
                    int i26 = i21 & 119;
                    int i27 = i26 + ((i21 ^ 119) | i26);
                    b = i27 % 128;
                    int i28 = i27 % 2;
                }
            }
            int i29 = a + 27;
            b = i29 % 128;
            if (i29 % 2 == 0) {
                int i30 = 1 / 0;
            }
        }
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.j.o$aQw */
    public class aQw extends aQv {
        private static int a = 1;
        private static int b;
        public final PowerManager e;

        public aQw(Context context) {
            super();
            this.e = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // ivas.gov.bisp.enumeration.p087j.LayoutInflaterFactory2C0312o.aQv
        public IntentFilter d() {
            int i = 2 % 2;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            int i2 = a;
            int i3 = i2 & 101;
            int i4 = (i2 | 101) & (~i3);
            int i5 = i3 << 1;
            int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
            int i7 = i6 % 128;
            b = i7;
            Object obj = null;
            if (i6 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i8 = i7 & 71;
            int i9 = -(-((i7 ^ 71) | i8));
            int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
            a = i10 % 128;
            if (i10 % 2 != 0) {
                return intentFilter;
            }
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.p087j.LayoutInflaterFactory2C0312o.aQv
        public void f() throws IllegalAccessException {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 ^ 15;
            int i4 = ((i2 & 15) | i3) << 1;
            int i5 = -i3;
            int i6 = (i4 & i5) + (i4 | i5);
            b = i6 % 128;
            int i7 = i6 % 2;
            LayoutInflaterFactory2C0312o.this.B();
            int i8 = a;
            int i9 = ((((i8 ^ 97) | (i8 & 97)) << 1) - (~(-(((~i8) & 97) | (i8 & (-98)))))) - 1;
            b = i9 % 128;
            int i10 = i9 % 2;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x003a  */
        /* JADX WARN: Code duplicated, block: B:9:0x0029  */
        @Override // ivas.gov.bisp.enumeration.p087j.LayoutInflaterFactory2C0312o.aQv
        public int e() {
            int i;
            int i2 = 2 % 2;
            int i3 = b + 116;
            int i4 = (i3 ^ (-1)) + (i3 << 1);
            a = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 77 / 0;
                if (this.e.isPowerSaveMode()) {
                    int i6 = b;
                    int i7 = i6 & 77;
                    int i8 = (77 ^ i6) | i7;
                    int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
                    a = i9 % 128;
                    int i10 = i9 % 2;
                    i = 2;
                } else {
                    int i11 = a;
                    int i12 = i11 & 29;
                    int i13 = ((i11 | 29) & (~i12)) + (i12 << 1);
                    b = i13 % 128;
                    int i14 = i13 % 2;
                    i = 1;
                }
            } else if (!this.e.isPowerSaveMode()) {
                int i15 = a;
                int i16 = i15 & 29;
                int i17 = ((i15 | 29) & (~i16)) + (i16 << 1);
                b = i17 % 128;
                int i18 = i17 % 2;
                i = 1;
            } else {
                int i19 = b;
                int i20 = i19 & 77;
                int i21 = (77 ^ i19) | i20;
                int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
                a = i22 % 128;
                int i110 = i22 % 2;
                i = 2;
            }
            int i23 = b;
            int i24 = i23 ^ 35;
            int i25 = (i23 & 35) << 1;
            int i26 = (i24 & i25) + (i25 | i24);
            a = i26 % 128;
            int i27 = i26 % 2;
            return i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i = a + 85;
        b = i % 128;
        int i2 = i % 2;
        f = new int[]{android.R.attr.windowBackground};
        String str = Build.FINGERPRINT;
        int i3 = a;
        int i4 = i3 & 71;
        int i5 = (i4 - (~(-(-((i3 ^ 71) | i4))))) - 1;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            boolean zEquals = "robolectric".equals(str);
            g = (zEquals & true) | (!zEquals);
        } else {
            boolean zEquals2 = "robolectric".equals(str);
            g = ((~(zEquals2 ? 1 : 0)) & 1) ^ ((zEquals2 ? 1 : 0) & (-2));
        }
        h = true;
        int i6 = b;
        int i7 = i6 & 105;
        int i8 = (i6 ^ 105) | i7;
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        a = i9 % 128;
        if (i9 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x009a  */
    /* JADX WARN: Code duplicated, block: B:22:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:23:0x00b6  */
    public LayoutInflaterFactory2C0312o(Context context, Window window, InterfaceC0310l interfaceC0310l, Object obj) {
        AppCompatActivity appCompatActivity;
        int i;
        Object obj2 = null;
        this.T = -100;
        this.l = context;
        this.n = interfaceC0310l;
        this.j = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    int i2 = b;
                    int i3 = i2 & 85;
                    int i4 = ((i2 ^ 85) | i3) << 1;
                    int i5 = -((i2 | 85) & (~i3));
                    int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
                    int i7 = i6 % 128;
                    a = i7;
                    int i8 = i6 % 2;
                    if (!(!(context instanceof AppCompatActivity))) {
                        int i9 = i7 + 73;
                        b = i9 % 128;
                        int i10 = i9 % 2;
                        appCompatActivity = (AppCompatActivity) context;
                        int i11 = (i7 & 91) + (i7 | 91);
                        b = i11 % 128;
                        if (i11 % 2 == 0) {
                            int i12 = 2 % 2;
                        }
                    } else if (context instanceof ContextWrapper) {
                        int i13 = i7 & 81;
                        int i14 = (i7 ^ 81) | i13;
                        int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
                        b = i15 % 128;
                        int i16 = i15 % 2;
                        context = ((ContextWrapper) context).getBaseContext();
                        int i17 = a;
                        int i18 = i17 & 69;
                        int i19 = -(-(i17 | 69));
                        int i20 = (i18 & i19) + (i19 | i18);
                        b = i20 % 128;
                        int i21 = i20 % 2;
                        int i22 = 2 % 2;
                    }
                    if (appCompatActivity != null) {
                        int i23 = a;
                        i = (((i23 | 2) << 1) - (i23 ^ 2)) - 1;
                        b = i % 128;
                        if (i % 2 == 0) {
                            this.T = appCompatActivity.m().g();
                            obj2.hashCode();
                            throw null;
                        }
                        this.T = appCompatActivity.m().g();
                        int i24 = 2 % 2;
                    }
                }
                int i25 = a;
                int i26 = (i25 & 1) + (i25 | 1);
                b = i26 % 128;
                if (i26 % 2 != 0) {
                    int i27 = 3 % 4;
                } else {
                    int i28 = 2 % 2;
                }
                appCompatActivity = null;
                if (appCompatActivity != null) {
                    int i29 = a;
                    i = (((i29 | 2) << 1) - (i29 ^ 2)) - 1;
                    b = i % 128;
                    if (i % 2 == 0) {
                        this.T = appCompatActivity.m().g();
                        obj2.hashCode();
                        throw null;
                    }
                    this.T = appCompatActivity.m().g();
                    int i210 = 2 % 2;
                }
            }
        }
        if (this.T == -100) {
            int i30 = a;
            int i31 = i30 & 53;
            int i32 = -(-(i30 | 53));
            int i33 = (i31 & i32) + (i32 | i31);
            b = i33 % 128;
            int i34 = i33 % 2;
            OooOOOO<String, Integer> oooOOOO = e;
            String name = this.j.getClass().getName();
            int i35 = a;
            int i36 = i35 & 89;
            int i37 = (i36 - (~((i35 ^ 89) | i36))) - 1;
            b = i37 % 128;
            int i38 = i37 % 2;
            Integer num = (Integer) oooOOOO.getOrDefault(name, null);
            if (num != null) {
                int i39 = b;
                int i40 = (i39 ^ 115) + ((i39 & 115) << 1);
                a = i40 % 128;
                int i41 = i40 % 2;
                this.T = num.intValue();
                Class<?> cls = this.j.getClass();
                int i42 = a;
                int i43 = i42 ^ 123;
                int i44 = (i42 & 123) << 1;
                int i45 = (i43 ^ i44) + ((i44 & i43) << 1);
                b = i45 % 128;
                if (i45 % 2 != 0) {
                    oooOOOO.remove(cls.getName());
                    int i46 = 25 / 0;
                } else {
                    oooOOOO.remove(cls.getName());
                }
                int i47 = 2 % 2;
            }
        }
        if (window != null) {
            int i48 = b;
            int i49 = (i48 | 67) << 1;
            int i50 = -(i48 ^ 67);
            int i51 = (i49 ^ i50) + ((i50 & i49) << 1);
            a = i51 % 128;
            if (i51 % 2 == 0) {
                C(window);
                int i52 = 6 / 0;
            } else {
                C(window);
            }
            int i53 = a;
            int i54 = i53 & 93;
            int i55 = (i53 ^ 93) | i54;
            int i56 = ((i54 | i55) << 1) - (i55 ^ i54);
            b = i56 % 128;
            if (i56 % 2 == 0) {
                int i57 = 2 % 2;
            }
        }
        P.f();
        int i58 = b + 53;
        a = i58 % 128;
        int i59 = i58 % 2;
    }

    public boolean B() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 117) + (i2 | 117);
        b = i3 % 128;
        int i4 = i3 % 2;
        boolean zD = D(true);
        int i5 = a + 115;
        b = i5 % 128;
        int i6 = i5 % 2;
        return zD;
    }

    public void E(int i, aQz aqz, Menu menu) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 123;
        int i5 = (i3 ^ 123) | i4;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        a = i6 % 128;
        Object obj = null;
        if (i6 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (menu == null) {
            int i7 = i3 & 79;
            int i8 = -(-((i3 ^ 79) | i7));
            int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
            a = i9 % 128;
            int i10 = i9 % 2;
            menu = aqz.k;
            int i11 = b + 78;
            int i12 = (i11 ^ (-1)) + (i11 << 1);
            a = i12 % 128;
            int i13 = i12 % 2;
        }
        if (!aqz.p) {
            int i14 = a;
            int i15 = ((i14 & 82) + (i14 | 82)) - 1;
            b = i15 % 128;
            int i16 = i15 % 2;
            return;
        }
        if (!this.S) {
            int i17 = a;
            int i18 = i17 & 81;
            int i19 = -(-(i17 | 81));
            int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
            b = i20 % 128;
            int i21 = i20 % 2;
            this.m.c.onPanelClosed(i, menu);
            int i22 = b + 109;
            a = i22 % 128;
            int i23 = i22 % 2;
        }
        int i24 = a;
        int i25 = ((((i24 ^ 69) | (i24 & 69)) << 1) - (~(-(((~i24) & 69) | (i24 & (-70)))))) - 1;
        b = i25 % 128;
        if (i25 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final Window.Callback G() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 & (-90)) | ((~i2) & 89)) - (~(-(-((i2 & 89) << 1))))) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        Window window = this.k;
        if (i4 != 0) {
            return window.getCallback();
        }
        window.getCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void L() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 1;
        int i4 = ((i2 | 1) & (~i3)) + (i3 << 1);
        b = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        R r = this.x;
        if (r != null) {
            r.d();
            int i5 = b + 63;
            a = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 5 % 5;
            }
        }
        int i7 = a;
        int i8 = (i7 & 65) + (i7 | 65);
        b = i8 % 128;
        int i9 = i8 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0065  */
    public final boolean W() {
        boolean z;
        ViewGroup viewGroup;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 15) + (i2 | 15);
        int i4 = i3 % 128;
        a = i4;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if ((!this.z) || (viewGroup = this.B) == null) {
            int i5 = a;
            int i6 = ((i5 | 112) << 1) - (i5 ^ 112);
            int i7 = (i6 ^ (-1)) + (i6 << 1);
            b = i7 % 128;
            int i8 = i7 % 2;
            z = false;
        } else {
            int i9 = (i4 & (-14)) | ((~i4) & 13);
            int i10 = (i4 & 13) << 1;
            int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
            b = i11 % 128;
            if (i11 % 2 != 0) {
                WeakHashMap<View, R> weakHashMap = T.c;
                T.aXa.d(viewGroup);
                throw null;
            }
            WeakHashMap<View, R> weakHashMap2 = T.c;
            if (!T.aXa.d(viewGroup)) {
                int i12 = a;
                int i13 = ((i12 | 112) << 1) - (i12 ^ 112);
                int i14 = (i13 ^ (-1)) + (i13 << 1);
                b = i14 % 128;
                int i15 = i14 % 2;
                z = false;
            } else {
                int i16 = b;
                int i17 = ((i16 | 87) << 1) - (i16 ^ 87);
                int i18 = i17 % 128;
                a = i18;
                int i19 = i17 % 2;
                int i20 = i18 & 83;
                int i21 = -(-((i18 ^ 83) | i20));
                int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
                b = i22 % 128;
                if (i22 % 2 != 0) {
                    int i23 = 2 / 5;
                }
                z = true;
            }
        }
        int i24 = b;
        int i25 = i24 & 51;
        int i26 = ((i24 | 51) & (~i25)) + (i25 << 1);
        a = i26 % 128;
        int i27 = i26 % 2;
        return z;
    }

    @Override // ivas.gov.bisp.enumeration.p087j.a
    public Context f(Context context) {
        Configuration configuration;
        this.P = true;
        int i = this.T;
        if (i == -100) {
            i = -100;
        }
        int iU = U(context, i);
        if (h && (context instanceof ContextThemeWrapper)) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(J(context, iU, null));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof h) {
            try {
                ((h) context).d(J(context, iU, null));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!g) {
            return context;
        }
        int i2 = Build.VERSION.SDK_INT;
        Configuration configuration2 = new Configuration();
        configuration2.uiMode = -1;
        configuration2.fontScale = 0.0f;
        Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
        Configuration configuration4 = context.getResources().getConfiguration();
        configuration3.uiMode = configuration4.uiMode;
        if (configuration3.equals(configuration4)) {
            configuration = null;
        } else {
            configuration = new Configuration();
            configuration.fontScale = 0.0f;
            if (configuration3.diff(configuration4) != 0) {
                float f2 = configuration3.fontScale;
                float f3 = configuration4.fontScale;
                if (f2 != f3) {
                    configuration.fontScale = f3;
                }
                int i3 = configuration3.mcc;
                int i4 = configuration4.mcc;
                if (i3 != i4) {
                    configuration.mcc = i4;
                }
                int i5 = configuration3.mnc;
                int i6 = configuration4.mnc;
                if (i5 != i6) {
                    configuration.mnc = i6;
                }
                if (i2 >= 24) {
                    LocaleList locales = configuration3.getLocales();
                    LocaleList locales2 = configuration4.getLocales();
                    if (!locales.equals(locales2)) {
                        configuration.setLocales(locales2);
                        configuration.locale = configuration4.locale;
                    }
                } else if (!Objects.equals(configuration3.locale, configuration4.locale)) {
                    configuration.locale = configuration4.locale;
                }
                int i7 = configuration3.touchscreen;
                int i8 = configuration4.touchscreen;
                if (i7 != i8) {
                    configuration.touchscreen = i8;
                }
                int i9 = configuration3.keyboard;
                int i10 = configuration4.keyboard;
                if (i9 != i10) {
                    configuration.keyboard = i10;
                }
                int i11 = configuration3.keyboardHidden;
                int i12 = configuration4.keyboardHidden;
                if (i11 != i12) {
                    configuration.keyboardHidden = i12;
                }
                int i13 = configuration3.navigation;
                int i14 = configuration4.navigation;
                if (i13 != i14) {
                    configuration.navigation = i14;
                }
                int i15 = configuration3.navigationHidden;
                int i16 = configuration4.navigationHidden;
                if (i15 != i16) {
                    configuration.navigationHidden = i16;
                }
                int i17 = configuration3.orientation;
                int i18 = configuration4.orientation;
                if (i17 != i18) {
                    configuration.orientation = i18;
                }
                int i19 = configuration3.screenLayout;
                int i20 = configuration4.screenLayout & 15;
                if ((i19 & 15) != i20) {
                    int i21 = configuration.screenLayout;
                    configuration.screenLayout = (i21 & i20) | ((~i20) & i21) | ((~i21) & i20);
                }
                int i22 = configuration3.screenLayout;
                int i23 = configuration4.screenLayout & 192;
                if ((i22 & 192) != i23) {
                    int i24 = configuration.screenLayout;
                    configuration.screenLayout = (i24 & i23) | (i24 ^ i23);
                }
                int i25 = configuration3.screenLayout;
                int i26 = configuration4.screenLayout & 48;
                if ((i25 & 48) != i26) {
                    int i27 = configuration.screenLayout;
                    int i28 = ((~i26) & i27) | ((~i27) & i26);
                    int i29 = i27 & i26;
                    configuration.screenLayout = (i29 & i28) | (i28 ^ i29);
                }
                int i30 = configuration3.screenLayout;
                int i31 = configuration4.screenLayout & 768;
                if ((i30 & 768) != i31) {
                    configuration.screenLayout |= i31;
                }
                if (i2 >= 26) {
                    int i32 = configuration3.colorMode;
                    int i33 = configuration4.colorMode & 3;
                    if ((i32 & 3) != i33) {
                        int i34 = configuration.colorMode;
                        configuration.colorMode = (i34 & i33) | (i34 ^ i33);
                    }
                    int i35 = configuration3.colorMode;
                    int i36 = configuration4.colorMode & 12;
                    if ((i35 & 12) != i36) {
                        int i37 = configuration.colorMode;
                        configuration.colorMode = (i37 & i36) | (i37 ^ i36);
                    }
                }
                int i38 = configuration3.uiMode;
                int i39 = configuration4.uiMode & 15;
                if ((i38 & 15) != i39) {
                    configuration.uiMode |= i39;
                }
                int i40 = configuration3.uiMode;
                int i41 = configuration4.uiMode & 48;
                if ((i40 & 48) != i41) {
                    int i42 = configuration.uiMode;
                    configuration.uiMode = (i42 & i41) | (i42 ^ i41);
                }
                int i43 = configuration3.screenWidthDp;
                int i44 = configuration4.screenWidthDp;
                if (i43 != i44) {
                    configuration.screenWidthDp = i44;
                }
                int i45 = configuration3.screenHeightDp;
                int i46 = configuration4.screenHeightDp;
                if (i45 != i46) {
                    configuration.screenHeightDp = i46;
                }
                int i47 = configuration3.smallestScreenWidthDp;
                int i48 = configuration4.smallestScreenWidthDp;
                if (i47 != i48) {
                    configuration.smallestScreenWidthDp = i48;
                }
                int i49 = configuration3.densityDpi;
                int i50 = configuration4.densityDpi;
                if (i49 != i50) {
                    configuration.densityDpi = i50;
                }
            }
        }
        Configuration configurationJ = J(context, iU, configuration);
        h hVar = new h(context, ivas.gov.bisp.enumeration.R.style.Theme_AppCompat_Empty);
        hVar.d(configurationJ);
        try {
            if (context.getTheme() != null) {
                Resources.Theme theme = hVar.getTheme();
                if (Build.VERSION.SDK_INT >= 29) {
                    theme.rebase();
                } else {
                    synchronized (O.c) {
                        if (!O.e) {
                            try {
                                Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                                O.d = declaredMethod;
                                declaredMethod.setAccessible(true);
                            } catch (NoSuchMethodException unused3) {
                            }
                            O.e = true;
                        }
                        Method method = O.d;
                        if (method != null) {
                            try {
                                method.invoke(theme, new Object[0]);
                            } catch (IllegalAccessException | InvocationTargetException unused4) {
                                O.d = null;
                            }
                        }
                    }
                }
            }
        } catch (NullPointerException unused5) {
        }
        return hVar;
    }

    @Override // ivas.gov.bisp.enumeration.p087j.a
    public int g() {
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 + 99;
        a = i4 % 128;
        if (i4 % 2 == 0) {
            i = this.T;
            int i5 = 57 / 0;
        } else {
            i = this.T;
        }
        int i6 = i3 & 11;
        int i7 = (i3 | 11) & (~i6);
        int i8 = -(-(i6 << 1));
        int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
        a = i9 % 128;
        int i10 = i9 % 2;
        return i;
    }

    @Override // ivas.gov.bisp.enumeration.p087j.a
    public z j() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 80) + ((i2 & 80) << 1)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        T();
        z zVar = this.i;
        int i5 = a;
        int i6 = (i5 & (-76)) | ((~i5) & 75);
        int i7 = (i5 & 75) << 1;
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        b = i8 % 128;
        int i9 = i8 % 2;
        return zVar;
    }

    @Override // ivas.gov.bisp.enumeration.p087j.a
    public void l(Configuration configuration) throws IllegalAccessException {
        if (this.F && this.z) {
            T();
            z zVar = this.i;
            if (zVar != null) {
                zVar.j(configuration);
            }
        }
        P pC = P.c();
        Context context = this.l;
        synchronized (pC) {
            K k = pC.e;
            synchronized (k) {
                C0083p c0083p = k.i.get(context);
                if (c0083p != null) {
                    c0083p.e();
                }
            }
        }
        this.R = new Configuration(this.l.getResources().getConfiguration());
        D(false);
    }

    @Override // ivas.gov.bisp.enumeration.p087j.a
    public void m(Bundle bundle) throws IllegalAccessException {
        String strD;
        this.P = true;
        D(false);
        O();
        Object obj = this.j;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strD = f.d(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e2) {
                    throw new IllegalArgumentException(e2);
                }
            } catch (IllegalArgumentException unused) {
                strD = null;
            }
            if (strD != null) {
                z zVar = this.i;
                if (zVar == null) {
                    this.aa = true;
                } else {
                    zVar.n(true);
                }
            }
            synchronized (a.d) {
                a.c(this);
                a.c.add(new WeakReference(this));
            }
        }
        this.R = new Configuration(this.l.getResources().getConfiguration());
        this.Q = true;
    }

    @Override // ivas.gov.bisp.enumeration.p087j.a
    public void n(Bundle bundle) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 ^ 5) | (i2 & 5)) << 1) - (((~i2) & 5) | (i2 & (-6)));
        a = i3 % 128;
        int i4 = i3 % 2;
        M();
        if (i4 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    @Override // ivas.gov.bisp.enumeration.p087j.a
    public void o() {
        if (this.j instanceof Activity) {
            synchronized (a.d) {
                a.c(this);
            }
        }
        if (this.V) {
            this.k.getDecorView().removeCallbacks(this.ae);
        }
        this.S = true;
        if (this.T != -100) {
            Object obj = this.j;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                e.put(this.j.getClass().getName(), Integer.valueOf(this.T));
            } else {
                e.remove(this.j.getClass().getName());
            }
        } else {
            e.remove(this.j.getClass().getName());
        }
        z zVar = this.i;
        if (zVar != null) {
            zVar.k();
        }
        aQv aqv = this.W;
        if (aqv != null) {
            aqv.c();
        }
        aQv aqv2 = this.Y;
        if (aqv2 != null) {
            aqv2.c();
        }
    }

    @Override // ivas.gov.bisp.enumeration.p087j.a
    public void q(Bundle bundle) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 17;
        int i4 = i3 + ((i2 ^ 17) | i3);
        a = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.p087j.a
    public void s() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 107;
        int i4 = -(-((i2 & 107) << 1));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        B();
        int i7 = a + 71;
        b = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 18 / 0;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p087j.a
    public void z(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 | 63) << 1) - (((~i3) & 63) | (i3 & (-64)));
        int i5 = i4 % 128;
        a = i5;
        if (i4 % 2 == 0) {
            this.U = i;
            int i6 = 30 / 0;
        } else {
            this.U = i;
        }
        int i7 = i5 & 35;
        int i8 = (i7 - (~(-(-((i5 ^ 35) | i7))))) - 1;
        b = i8 % 128;
        int i9 = i8 % 2;
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.j.o$aQp */
    public class aQp implements j.aQr {
        private static int a = 1;
        private static int b;
        public j.aQr c;

        public aQp(j.aQr aqr) {
            this.c = aqr;
        }

        @Override // ivas.gov.bisp.enumeration.u.j.aQr
        public boolean b(j jVar, Menu menu) {
            boolean zB;
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 ^ 109;
            int i4 = (((i2 & 109) | i3) << 1) - i3;
            a = i4 % 128;
            if (i4 % 2 == 0) {
                zB = this.c.b(jVar, menu);
                int i5 = 45 / 0;
            } else {
                zB = this.c.b(jVar, menu);
            }
            int i6 = a;
            int i7 = ((i6 | 59) << 1) - (i6 ^ 59);
            b = i7 % 128;
            if (i7 % 2 == 0) {
                return zB;
            }
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.u.j.aQr
        public boolean e(j jVar, MenuItem menuItem) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 ^ 48) + ((i2 & 48) << 1)) - 1;
            b = i3 % 128;
            int i4 = i3 % 2;
            boolean zE = this.c.e(jVar, menuItem);
            int i5 = b;
            int i6 = ((i5 | 41) << 1) - (((~i5) & 41) | (i5 & (-42)));
            a = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 83 / 0;
            }
            return zE;
        }

        @Override // ivas.gov.bisp.enumeration.u.j.aQr
        public boolean d(j jVar, Menu menu) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 & 88) + (i2 | 88)) - 1;
            b = i3 % 128;
            int i4 = i3 % 2;
            ViewGroup viewGroup = LayoutInflaterFactory2C0312o.this.B;
            WeakHashMap<View, R> weakHashMap = T.c;
            T.aXd.d(viewGroup);
            int i5 = a;
            int i6 = ((i5 ^ 39) | (i5 & 39)) << 1;
            int i7 = -(((~i5) & 39) | (i5 & (-40)));
            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
            b = i8 % 128;
            int i9 = i8 % 2;
            j.aQr aqr = this.c;
            if (i9 == 0) {
                return aqr.d(jVar, menu);
            }
            aqr.d(jVar, menu);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.j.o$aQp$aQs */
        public class aQs extends ivas.gov.bisp.enumeration.p100w.r {
            private static int a = 0;
            private static int b = 1;

            public aQs() {
            }

            @Override // ivas.gov.bisp.enumeration.p081d.v
            public void e(View view) {
                View view2;
                int i = 2 % 2;
                int i2 = b;
                int i3 = i2 & 19;
                int i4 = -(-((i2 ^ 19) | i3));
                int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
                a = i5 % 128;
                int i6 = i5 % 2;
                LayoutInflaterFactory2C0312o.this.u.setVisibility(8);
                int i7 = b;
                int i8 = i7 & 81;
                int i9 = (i7 | 81) & (~i8);
                int i10 = i8 << 1;
                int i11 = (i9 ^ i10) + ((i9 & i10) << 1);
                a = i11 % 128;
                Object obj = null;
                if (i11 % 2 != 0) {
                    PopupWindow popupWindow = LayoutInflaterFactory2C0312o.this.w;
                    obj.hashCode();
                    throw null;
                }
                LayoutInflaterFactory2C0312o layoutInflaterFactory2C0312o = LayoutInflaterFactory2C0312o.this;
                PopupWindow popupWindow2 = layoutInflaterFactory2C0312o.w;
                if (popupWindow2 != null) {
                    popupWindow2.dismiss();
                    int i12 = b;
                    int i13 = i12 & 5;
                    int i14 = (i12 | 5) & (~i13);
                    int i15 = -(-(i13 << 1));
                    int i16 = ((i14 | i15) << 1) - (i14 ^ i15);
                    a = i16 % 128;
                    int i17 = i16 % 2;
                } else if (!(!(layoutInflaterFactory2C0312o.u.getParent() instanceof View))) {
                    int i18 = b + 81;
                    a = i18 % 128;
                    if (i18 % 2 != 0) {
                        view2 = (View) LayoutInflaterFactory2C0312o.this.u.getParent();
                        int i19 = 91 / 0;
                    } else {
                        view2 = (View) LayoutInflaterFactory2C0312o.this.u.getParent();
                    }
                    int i20 = b;
                    int i21 = i20 & 9;
                    int i22 = ((i20 ^ 9) | i21) << 1;
                    int i23 = -((i20 | 9) & (~i21));
                    int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
                    a = i24 % 128;
                    if (i24 % 2 != 0) {
                        WeakHashMap<View, R> weakHashMap = T.c;
                        T.aXd.d(view2);
                        int i25 = 86 / 0;
                    } else {
                        WeakHashMap<View, R> weakHashMap2 = T.c;
                        T.aXd.d(view2);
                    }
                    int i26 = a;
                    int i27 = i26 & 85;
                    int i28 = ((i26 ^ 85) | i27) << 1;
                    int i29 = -((i26 | 85) & (~i27));
                    int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
                    b = i30 % 128;
                    int i31 = i30 % 2;
                }
                LayoutInflaterFactory2C0312o.this.u.i();
                int i32 = b + 77;
                a = i32 % 128;
                int i33 = i32 % 2;
                LayoutInflaterFactory2C0312o.this.x.f(null);
                int i34 = a;
                int i35 = i34 | 103;
                int i36 = ((i35 << 1) - (~(-((~(i34 & 103)) & i35)))) - 1;
                b = i36 % 128;
                if (i36 % 2 == 0) {
                    LayoutInflaterFactory2C0312o.this.x = null;
                    throw null;
                }
                LayoutInflaterFactory2C0312o layoutInflaterFactory2C0312o2 = LayoutInflaterFactory2C0312o.this;
                layoutInflaterFactory2C0312o2.x = null;
                ViewGroup viewGroup = layoutInflaterFactory2C0312o2.B;
                WeakHashMap<View, R> weakHashMap3 = T.c;
                T.aXd.d(viewGroup);
                int i37 = b;
                int i38 = ((i37 ^ 29) | (i37 & 29)) << 1;
                int i39 = -(((~i37) & 29) | (i37 & (-30)));
                int i40 = ((i38 | i39) << 1) - (i39 ^ i38);
                a = i40 % 128;
                if (i40 % 2 != 0) {
                    throw null;
                }
            }
        }

        @Override // ivas.gov.bisp.enumeration.u.j.aQr
        public void c(j jVar) {
            int i = 2 % 2;
            int i2 = b + 39;
            a = i2 % 128;
            int i3 = i2 % 2;
            this.c.c(jVar);
            LayoutInflaterFactory2C0312o layoutInflaterFactory2C0312o = LayoutInflaterFactory2C0312o.this;
            int i4 = a;
            int i5 = i4 & 117;
            int i6 = ((i4 ^ 117) | i5) << 1;
            int i7 = -((i4 | 117) & (~i5));
            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
            b = i8 % 128;
            Object obj = null;
            if (i8 % 2 != 0) {
                PopupWindow popupWindow = layoutInflaterFactory2C0312o.w;
                throw null;
            }
            if (layoutInflaterFactory2C0312o.w != null) {
                int i9 = b;
                int i10 = i9 & 101;
                int i11 = -(-((i9 ^ 101) | i10));
                int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
                a = i12 % 128;
                int i13 = i12 % 2;
                View decorView = layoutInflaterFactory2C0312o.k.getDecorView();
                if (i13 == 0) {
                    decorView.removeCallbacks(LayoutInflaterFactory2C0312o.this.v);
                    throw null;
                }
                decorView.removeCallbacks(LayoutInflaterFactory2C0312o.this.v);
                int i14 = a + 3;
                b = i14 % 128;
                int i15 = i14 % 2;
            }
            LayoutInflaterFactory2C0312o layoutInflaterFactory2C0312o2 = LayoutInflaterFactory2C0312o.this;
            if (layoutInflaterFactory2C0312o2.u != null) {
                int i16 = b;
                int i17 = i16 & 89;
                int i18 = -(-((i16 ^ 89) | i17));
                int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
                a = i19 % 128;
                if (i19 % 2 == 0) {
                    layoutInflaterFactory2C0312o2.L();
                    ActionBarContextView actionBarContextView = LayoutInflaterFactory2C0312o.this.u;
                    obj.hashCode();
                    throw null;
                }
                layoutInflaterFactory2C0312o2.L();
                LayoutInflaterFactory2C0312o layoutInflaterFactory2C0312o3 = LayoutInflaterFactory2C0312o.this;
                R rD = T.d(layoutInflaterFactory2C0312o3.u);
                rD.c(0.0f);
                int i20 = a;
                int i21 = i20 & 27;
                int i22 = (i20 | 27) & (~i21);
                int i23 = -(-(i21 << 1));
                int i24 = (i22 ^ i23) + ((i22 & i23) << 1);
                b = i24 % 128;
                int i25 = i24 % 2;
                layoutInflaterFactory2C0312o3.x = rD;
                R r = LayoutInflaterFactory2C0312o.this.x;
                aQs aqs = new aQs();
                int i26 = a;
                int i27 = i26 ^ 109;
                int i28 = ((((i26 & 109) | i27) << 1) - (~(-i27))) - 1;
                b = i28 % 128;
                int i29 = i28 % 2;
                View view = r.c.get();
                if (view != null) {
                    int i30 = b + 21;
                    a = i30 % 128;
                    int i31 = i30 % 2;
                    r.h(view, aqs);
                    int i32 = b;
                    int i33 = ((i32 & (-38)) | ((~i32) & 37)) + ((i32 & 37) << 1);
                    a = i33 % 128;
                    if (i33 % 2 == 0) {
                        int i34 = 4 / 4;
                    }
                }
            }
            LayoutInflaterFactory2C0312o layoutInflaterFactory2C0312o4 = LayoutInflaterFactory2C0312o.this;
            InterfaceC0310l interfaceC0310l = layoutInflaterFactory2C0312o4.n;
            if (interfaceC0310l != null) {
                int i35 = a;
                int i36 = i35 & 107;
                int i37 = (i35 ^ 107) | i36;
                int i38 = (i36 & i37) + (i37 | i36);
                b = i38 % 128;
                int i39 = i38 % 2;
                interfaceC0310l.b(layoutInflaterFactory2C0312o4.t);
                int i40 = a;
                int i41 = i40 ^ 23;
                int i42 = -(-((i40 & 23) << 1));
                int i43 = (i41 ^ i42) + ((i42 & i41) << 1);
                b = i43 % 128;
                int i44 = i43 % 2;
            }
            LayoutInflaterFactory2C0312o layoutInflaterFactory2C0312o5 = LayoutInflaterFactory2C0312o.this;
            layoutInflaterFactory2C0312o5.t = null;
            ViewGroup viewGroup = layoutInflaterFactory2C0312o5.B;
            int i45 = a + 115;
            b = i45 % 128;
            int i46 = i45 % 2;
            WeakHashMap<View, R> weakHashMap = T.c;
            T.aXd.d(viewGroup);
            int i47 = b;
            int i48 = ((i47 | 87) << 1) - (i47 ^ 87);
            a = i48 % 128;
            if (i48 % 2 == 0) {
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.j.o$aQy */
    public class aQy extends aQv {
        private static int a = 1;
        private static int b;
        public final R e;

        public aQy(R r) {
            super();
            this.e = r;
        }

        @Override // ivas.gov.bisp.enumeration.p087j.LayoutInflaterFactory2C0312o.aQv
        public void f() throws IllegalAccessException {
            int i = 2 % 2;
            int i2 = a + 45;
            b = i2 % 128;
            if (i2 % 2 != 0) {
                LayoutInflaterFactory2C0312o.this.B();
                int i3 = 22 / 0;
            } else {
                LayoutInflaterFactory2C0312o.this.B();
            }
            int i4 = a;
            int i5 = i4 & 37;
            int i6 = ((i4 ^ 37) | i5) << 1;
            int i7 = -((i4 | 37) & (~i5));
            int i8 = (i6 & i7) + (i7 | i6);
            b = i8 % 128;
            if (i8 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:126:0x03a0  */
        /* JADX WARN: Code duplicated, block: B:128:0x03b5  */
        /* JADX WARN: Code duplicated, block: B:130:0x03c7  */
        /* JADX WARN: Code duplicated, block: B:131:0x03c9  */
        /* JADX WARN: Code duplicated, block: B:132:0x03cb  */
        /* JADX WARN: Code duplicated, block: B:13:0x0055  */
        /* JADX WARN: Code duplicated, block: B:14:0x0068  */
        /* JADX WARN: Code duplicated, block: B:36:0x00bf A[Catch: Exception -> 0x00d8, TRY_LEAVE, TryCatch #2 {Exception -> 0x00d8, blocks: (B:26:0x00a8, B:28:0x00b0, B:36:0x00bf, B:34:0x00b7), top: B:141:0x00a6 }] */
        /* JADX WARN: Code duplicated, block: B:38:0x00d8  */
        /* JADX WARN: Code duplicated, block: B:53:0x0135  */
        /* JADX WARN: Code duplicated, block: B:65:0x0174  */
        /* JADX WARN: Code duplicated, block: B:66:0x018d A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:67:0x018f  */
        /* JADX WARN: Code duplicated, block: B:77:0x01d3 A[PHI: r4 r11
  0x01d3: PHI (r4v13 ivas.gov.bisp.enumeration.j.R$aQI) = (r4v12 ivas.gov.bisp.enumeration.j.R$aQI), (r4v15 ivas.gov.bisp.enumeration.j.R$aQI) binds: [B:76:0x01d1, B:73:0x01c6] A[DONT_GENERATE, DONT_INLINE]
  0x01d3: PHI (r11v11 long) = (r11v10 long), (r11v43 long) binds: [B:76:0x01d1, B:73:0x01c6] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:89:0x0245 A[PHI: r14
  0x0245: PHI (r14v9 ivas.gov.bisp.enumeration.j.L) = (r14v8 ivas.gov.bisp.enumeration.j.L), (r14v13 ivas.gov.bisp.enumeration.j.L) binds: [B:88:0x0243, B:85:0x023c] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:90:0x0253 A[PHI: r14
  0x0253: PHI (r14v12 ivas.gov.bisp.enumeration.j.L) = (r14v8 ivas.gov.bisp.enumeration.j.L), (r14v13 ivas.gov.bisp.enumeration.j.L) binds: [B:88:0x0243, B:85:0x023c] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // ivas.gov.bisp.enumeration.p087j.LayoutInflaterFactory2C0312o.aQv
        public int e() {
            R r;
            R.aQI aqi;
            boolean z;
            Location lastKnownLocation;
            Location lastKnownLocation2;
            R.aQI aqi2;
            long jCurrentTimeMillis;
            L l;
            long j;
            L l2;
            L l3;
            boolean z2;
            double latitude;
            double longitude;
            long j2;
            boolean z3;
            int i;
            int i2;
            int i3 = 2 % 2;
            int i4 = a;
            int i5 = ((i4 | 5) << 1) - (i4 ^ 5);
            b = i5 % 128;
            boolean z4 = false;
            if (i5 % 2 != 0) {
                r = this.e;
                aqi = r.d;
                int i6 = 95 / 0;
            } else {
                r = this.e;
                aqi = r.d;
            }
            int i7 = b + 45;
            a = i7 % 128;
            int i8 = i7 % 2;
            long j3 = aqi.b;
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            int i9 = a;
            int i10 = (((i9 ^ 99) | (i9 & 99)) << 1) - (((~i9) & 99) | (i9 & (-100)));
            int i11 = i10 % 128;
            b = i11;
            if (i10 % 2 != 0) {
                int i12 = 54 / 0;
                if (j3 > jCurrentTimeMillis2) {
                    int i13 = i11 & 115;
                    int i14 = (~i13) & (i11 | 115);
                    int i15 = i13 << 1;
                    int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
                    a = i16 % 128;
                    int i17 = i16 % 2;
                    z = true;
                } else {
                    z = false;
                }
            } else if (j3 > jCurrentTimeMillis2) {
                int i18 = i11 & 115;
                int i19 = (~i18) & (i11 | 115);
                int i110 = i18 << 1;
                int i111 = (i19 ^ i110) + ((i110 & i19) << 1);
                a = i111 % 128;
                int i112 = i111 % 2;
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (ivas.gov.bisp.enumeration.p100w.r.i(r.b, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                    int i20 = a + 108;
                    int i21 = (i20 ^ (-1)) + (i20 << 1);
                    b = i21 % 128;
                    try {
                        if (i21 % 2 != 0) {
                            int i22 = 88 / 0;
                            if (r.c.isProviderEnabled("network")) {
                                lastKnownLocation = r.c.getLastKnownLocation("network");
                                int i23 = a;
                                int i24 = i23 & 75;
                                int i25 = -(-((i23 ^ 75) | i24));
                                int i26 = (i24 & i25) + (i25 | i24);
                                b = i26 % 128;
                                int i27 = i26 % 2;
                            } else {
                                int i28 = b;
                                int i29 = i28 & 33;
                                int i30 = ((i28 | 33) & (~i29)) + (i29 << 1);
                                a = i30 % 128;
                                int i31 = i30 % 2;
                                lastKnownLocation = null;
                            }
                        } else if (r.c.isProviderEnabled("network")) {
                            lastKnownLocation = r.c.getLastKnownLocation("network");
                            int i210 = a;
                            int i211 = i210 & 75;
                            int i212 = -(-((i210 ^ 75) | i211));
                            int i213 = (i211 & i212) + (i212 | i211);
                            b = i213 % 128;
                            int i214 = i213 % 2;
                        } else {
                            int i215 = b;
                            int i216 = i215 & 33;
                            int i32 = ((i215 | 33) & (~i216)) + (i216 << 1);
                            a = i32 % 128;
                            int i33 = i32 % 2;
                            lastKnownLocation = null;
                        }
                    } catch (Exception unused) {
                    }
                } else {
                    int i217 = b;
                    int i218 = i217 & 33;
                    int i34 = ((i217 | 33) & (~i218)) + (i218 << 1);
                    a = i34 % 128;
                    int i35 = i34 % 2;
                    lastKnownLocation = null;
                }
                if (ivas.gov.bisp.enumeration.p100w.r.i(r.b, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                    int i36 = a + 79;
                    b = i36 % 128;
                    int i37 = i36 % 2;
                    try {
                        if (r.c.isProviderEnabled("gps")) {
                            int i38 = a;
                            int i39 = i38 & 7;
                            int i40 = (((i38 | 7) & (~i39)) - (~(-(-(i39 << 1))))) - 1;
                            b = i40 % 128;
                            if (i40 % 2 != 0) {
                                r.c.getLastKnownLocation("gps");
                                throw null;
                            }
                            lastKnownLocation2 = r.c.getLastKnownLocation("gps");
                            int i41 = b;
                            int i42 = i41 & 85;
                            int i43 = i42 + ((i41 ^ 85) | i42);
                            a = i43 % 128;
                            int i44 = i43 % 2;
                        } else {
                            lastKnownLocation2 = null;
                        }
                    } catch (Exception unused2) {
                    }
                } else {
                    lastKnownLocation2 = null;
                }
                if (lastKnownLocation2 != null) {
                    int i45 = b;
                    int i46 = i45 & 93;
                    int i47 = ((~i46) & (i45 | 93)) + (i46 << 1);
                    a = i47 % 128;
                    int i48 = i47 % 2;
                    if (lastKnownLocation != null) {
                        int i49 = (i45 ^ 49) + ((i45 & 49) << 1);
                        a = i49 % 128;
                        if (i49 % 2 != 0) {
                            if (lastKnownLocation2.getTime() > lastKnownLocation.getTime()) {
                                int i50 = a;
                                int i51 = ((i50 ^ 25) | (i50 & 25)) << 1;
                                int i52 = -(((~i50) & 25) | (i50 & (-26)));
                                int i53 = (i51 ^ i52) + ((i52 & i51) << 1);
                                b = i53 % 128;
                                int i54 = i53 % 2;
                                int i55 = b;
                                int i56 = (((i55 | 125) << 1) - (~(-(i55 ^ 125)))) - 1;
                                a = i56 % 128;
                                int i57 = i56 % 2;
                                lastKnownLocation = lastKnownLocation2;
                            }
                            if (z4) {
                                int i58 = b;
                                int i59 = i58 & 29;
                                int i60 = i58 | 29;
                                i2 = ((i59 | i60) << 1) - (i60 ^ i59);
                                a = i2 % 128;
                                if (i2 % 2 == 0) {
                                    i = 3;
                                } else {
                                    i = 2;
                                }
                            } else {
                                i = 1;
                            }
                            int i61 = a;
                            int i62 = (((i61 & (-90)) | ((~i61) & 89)) - (~(-(-((i61 & 89) << 1))))) - 1;
                            b = i62 % 128;
                            int i63 = i62 % 2;
                            return i;
                        }
                        int i64 = 71 / 0;
                        if (lastKnownLocation2.getTime() > lastKnownLocation.getTime()) {
                            int i510 = a;
                            int i511 = ((i510 ^ 25) | (i510 & 25)) << 1;
                            int i512 = -(((~i510) & 25) | (i510 & (-26)));
                            int i513 = (i511 ^ i512) + ((i512 & i511) << 1);
                            b = i513 % 128;
                            int i514 = i513 % 2;
                            int i515 = b;
                            int i516 = (((i515 | 125) << 1) - (~(-(i515 ^ 125)))) - 1;
                            a = i516 % 128;
                            int i517 = i516 % 2;
                            lastKnownLocation = lastKnownLocation2;
                        }
                        if (z4) {
                            int i518 = b;
                            int i519 = i518 & 29;
                            int i65 = i518 | 29;
                            i2 = ((i519 | i65) << 1) - (i65 ^ i519);
                            a = i2 % 128;
                            if (i2 % 2 == 0) {
                                i = 3;
                            } else {
                                i = 2;
                            }
                        } else {
                            i = 1;
                        }
                        int i66 = a;
                        int i67 = (((i66 & (-90)) | ((~i66) & 89)) - (~(-(-((i66 & 89) << 1))))) - 1;
                        b = i67 % 128;
                        int i68 = i67 % 2;
                        return i;
                    }
                    if (lastKnownLocation2 != null) {
                        int i5110 = b;
                        int i5111 = (((i5110 | 125) << 1) - (~(-(i5110 ^ 125)))) - 1;
                        a = i5111 % 128;
                        int i5112 = i5111 % 2;
                        lastKnownLocation = lastKnownLocation2;
                    }
                } else if (lastKnownLocation2 != null) {
                    int i5113 = b;
                    int i5114 = (((i5113 | 125) << 1) - (~(-(i5113 ^ 125)))) - 1;
                    a = i5114 % 128;
                    int i5115 = i5114 % 2;
                    lastKnownLocation = lastKnownLocation2;
                }
                if (lastKnownLocation != null) {
                    int i69 = b;
                    int i70 = (((i69 ^ 115) | (i69 & 115)) << 1) - (((~i69) & 115) | (i69 & (-116)));
                    a = i70 % 128;
                    if (i70 % 2 == 0) {
                        aqi2 = r.d;
                        jCurrentTimeMillis = System.currentTimeMillis();
                        int i71 = 7 / 0;
                        if (L.c == null) {
                            L.c = new L();
                            int i72 = b;
                            int i73 = i72 & 113;
                            int i74 = (((i72 ^ 113) | i73) << 1) - ((i72 | 113) & (~i73));
                            a = i74 % 128;
                            int i75 = i74 % 2;
                        }
                    } else {
                        aqi2 = r.d;
                        jCurrentTimeMillis = System.currentTimeMillis();
                        if (L.c == null) {
                            L.c = new L();
                            int i76 = b;
                            int i77 = i76 & 113;
                            int i78 = (((i76 ^ 113) | i77) << 1) - ((i76 | 113) & (~i77));
                            a = i78 % 128;
                            int i79 = i78 % 2;
                        }
                    }
                    long j4 = jCurrentTimeMillis;
                    L l4 = L.c;
                    double latitude2 = lastKnownLocation.getLatitude();
                    double longitude2 = lastKnownLocation.getLongitude();
                    int i80 = b;
                    int i81 = ((i80 & 62) + (i80 | 62)) - 1;
                    a = i81 % 128;
                    if (i81 % 2 == 0) {
                        j = j4 - 86400000;
                        l2 = l4;
                        l = l4;
                    } else {
                        l = l4;
                        j = j4 - 86400000;
                        l2 = l;
                    }
                    l2.c(j, latitude2, longitude2);
                    l.c(j4, lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude());
                    int i82 = b;
                    int i83 = (i82 & 103) + (i82 | 103);
                    a = i83 % 128;
                    if (i83 % 2 == 0) {
                        l3 = l;
                        if (l3.f == 0) {
                            int i84 = b;
                            int i85 = (i84 & 101) + (i84 | 101);
                            a = i85 % 128;
                            int i86 = i85 % 2;
                            z2 = true;
                        } else {
                            int i87 = b;
                            int i88 = (i87 ^ 94) + ((i87 & 94) << 1);
                            int i89 = (i88 ^ (-1)) + (i88 << 1);
                            a = i89 % 128;
                            int i90 = i89 % 2;
                            z2 = false;
                        }
                    } else {
                        l3 = l;
                        if (l3.f == 1) {
                            int i810 = b;
                            int i811 = (i810 & 101) + (i810 | 101);
                            a = i811 % 128;
                            int i812 = i811 % 2;
                            z2 = true;
                        } else {
                            int i813 = b;
                            int i814 = (i813 ^ 94) + ((i813 & 94) << 1);
                            int i815 = (i814 ^ (-1)) + (i814 << 1);
                            a = i815 % 128;
                            int i91 = i815 % 2;
                            z2 = false;
                        }
                    }
                    long j5 = l3.e;
                    long j6 = l3.d;
                    int i92 = b;
                    int i93 = ((i92 | 9) << 1) - (i92 ^ 9);
                    a = i93 % 128;
                    if (i93 % 2 == 0) {
                        latitude = lastKnownLocation.getLatitude();
                        longitude = lastKnownLocation.getLongitude();
                        int i94 = 63 / 0;
                    } else {
                        latitude = lastKnownLocation.getLatitude();
                        longitude = lastKnownLocation.getLongitude();
                    }
                    L l5 = l3;
                    boolean z5 = z2;
                    l3.c(j4 + 86400000, latitude, longitude);
                    int i95 = a;
                    int i96 = ((i95 & (-12)) | ((~i95) & 11)) + ((i95 & 11) << 1);
                    b = i96 % 128;
                    if (i96 % 2 != 0) {
                        long j7 = l5.e;
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    long j8 = l5.e;
                    if (j5 == -1 || j6 == -1) {
                        j2 = j4 + 43200000;
                        int i97 = a;
                        int i98 = ((i97 & (-28)) | ((~i97) & 27)) + ((i97 & 27) << 1);
                        b = i98 % 128;
                        int i99 = i98 % 2;
                    } else {
                        int i100 = a;
                        int i101 = ((((i100 ^ 113) | (i100 & 113)) << 1) - (~(-((i100 & (-114)) | (113 & (~i100)))))) - 1;
                        b = i101 % 128;
                        int i102 = i101 % 2;
                        if (j4 > j6) {
                            int i103 = ((i100 & (-64)) | ((~i100) & 63)) + ((i100 & 63) << 1);
                            int i104 = i103 % 128;
                            b = i104;
                            int i105 = i103 % 2;
                            int i106 = i104 & 67;
                            int i107 = -(-(i104 | 67));
                            int i108 = (i106 ^ i107) + ((i106 & i107) << 1);
                            a = i108 % 128;
                            int i109 = i108 % 2;
                        } else if (j4 > j5) {
                            int i113 = (-2) - (((i100 ^ 10) + ((i100 & 10) << 1)) ^ (-1));
                            b = i113 % 128;
                            int i114 = i113 % 2;
                            int i115 = i100 & 57;
                            int i116 = i115 + ((i100 ^ 57) | i115);
                            b = i116 % 128;
                            int i117 = i116 % 2;
                            j8 = j6;
                        } else {
                            j8 = j5;
                        }
                        j2 = j8 + 60000;
                        int i118 = b;
                        int i119 = i118 & 61;
                        int i120 = -(-((i118 ^ 61) | i119));
                        int i121 = (i119 & i120) + (i120 | i119);
                        a = i121 % 128;
                        int i122 = i121 % 2;
                    }
                    aqi2.a = z5;
                    int i123 = b;
                    int i124 = ((i123 & (-74)) | ((~i123) & 73)) + ((i123 & 73) << 1);
                    a = i124 % 128;
                    if (i124 % 2 == 0) {
                        aqi2.b = j2;
                        z3 = aqi.a;
                        int i125 = 79 / 0;
                    } else {
                        aqi2.b = j2;
                        z3 = aqi.a;
                    }
                } else {
                    int i126 = Calendar.getInstance().get(11);
                    if (i126 >= 6) {
                        int i127 = a;
                        int i128 = ((i127 | 57) << 1) - (i127 ^ 57);
                        int i129 = i128 % 128;
                        b = i129;
                        if (i128 % 2 == 0 ? i126 >= 22 : i126 >= 67) {
                            int i130 = a;
                            int i131 = (i130 & (-26)) | ((~i130) & 25);
                            int i132 = (i130 & 25) << 1;
                            int i133 = (i131 & i132) + (i132 | i131);
                            b = i133 % 128;
                            int i134 = i133 % 2;
                            z4 = true;
                        } else {
                            int i135 = i129 + 3;
                            a = i135 % 128;
                            int i136 = i135 % 2;
                        }
                    } else {
                        int i137 = a;
                        int i138 = (i137 & (-26)) | ((~i137) & 25);
                        int i139 = (i137 & 25) << 1;
                        int i1310 = (i138 & i139) + (i139 | i138);
                        b = i1310 % 128;
                        int i1311 = i1310 % 2;
                        z4 = true;
                    }
                }
                if (z4) {
                    int i5116 = b;
                    int i5117 = i5116 & 29;
                    int i610 = i5116 | 29;
                    i2 = ((i5117 | i610) << 1) - (i610 ^ i5117);
                    a = i2 % 128;
                    if (i2 % 2 == 0) {
                        i = 3;
                    } else {
                        i = 2;
                    }
                } else {
                    i = 1;
                }
                int i611 = a;
                int i612 = (((i611 & (-90)) | ((~i611) & 89)) - (~(-(-((i611 & 89) << 1))))) - 1;
                b = i612 % 128;
                int i613 = i612 % 2;
                return i;
            }
            int i140 = i11 & 83;
            int i141 = (~i140) & (i11 | 83);
            int i142 = -(-(i140 << 1));
            int i143 = (i141 ^ i142) + ((i142 & i141) << 1);
            a = i143 % 128;
            if (i143 % 2 == 0) {
                z3 = aqi.a;
                int i144 = 41 / 0;
            } else {
                z3 = aqi.a;
            }
            z4 = z3;
            if (z4) {
                int i5118 = b;
                int i5119 = i5118 & 29;
                int i614 = i5118 | 29;
                i2 = ((i5119 | i614) << 1) - (i614 ^ i5119);
                a = i2 % 128;
                if (i2 % 2 == 0) {
                    i = 3;
                } else {
                    i = 2;
                }
            } else {
                i = 1;
            }
            int i615 = a;
            int i616 = (((i615 & (-90)) | ((~i615) & 89)) - (~(-(-((i615 & 89) << 1))))) - 1;
            b = i616 % 128;
            int i617 = i616 % 2;
            return i;
        }

        @Override // ivas.gov.bisp.enumeration.p087j.LayoutInflaterFactory2C0312o.aQv
        public IntentFilter d() {
            int i = 2 % 2;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            int i2 = a;
            int i3 = (((i2 | 54) << 1) - (i2 ^ 54)) - 1;
            b = i3 % 128;
            int i4 = i3 % 2;
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            int i5 = a + 91;
            b = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 29 / 0;
            }
            return intentFilter;
        }
    }

    public final void O() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 103;
        int i4 = ((i2 | 103) & (~i3)) + (i3 << 1);
        int i5 = i4 % 128;
        a = i5;
        if (i4 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.k == null) {
            Object obj2 = this.j;
            if (!(!(obj2 instanceof Activity))) {
                int i6 = i5 + 11;
                b = i6 % 128;
                int i7 = i6 % 2;
                C(((Activity) obj2).getWindow());
                int i8 = b;
                int i9 = i8 & 107;
                int i10 = (i8 ^ 107) | i9;
                int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
                a = i11 % 128;
                int i12 = i11 % 2;
            }
        }
        if (this.k == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
        int i13 = a;
        int i14 = i13 & 67;
        int i15 = ((i13 | 67) & (~i14)) + (i14 << 1);
        b = i15 % 128;
        int i16 = i15 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        if ((r3 % 2) != 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        r0 = 96 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        throw new android.util.AndroidRuntimeException("Window feature must be requested before adding content");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (r4.z == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r4.z == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        r2 = (r1 | 17) << 1;
        r1 = -(r1 ^ 17);
        r3 = ((r2 | r1) << 1) - (r1 ^ r2);
        ivas.gov.bisp.enumeration.p087j.LayoutInflaterFactory2C0312o.a = r3 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void X() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.p087j.LayoutInflaterFactory2C0312o.b
            r2 = r1 ^ 39
            r3 = r1 & 39
            int r3 = r3 << 1
            int r2 = r2 + r3
            int r3 = r2 % 128
            ivas.gov.bisp.enumeration.p087j.LayoutInflaterFactory2C0312o.a = r3
            int r2 = r2 % r0
            if (r2 != 0) goto L1c
            boolean r2 = r4.z
            r3 = 76
            int r3 = r3 / 0
            if (r2 != 0) goto L39
            goto L20
        L1c:
            boolean r2 = r4.z
            if (r2 != 0) goto L39
        L20:
            r2 = r1 | 17
            int r2 = r2 << 1
            r1 = r1 ^ 17
            int r1 = -r1
            r3 = r2 | r1
            int r3 = r3 << 1
            r1 = r1 ^ r2
            int r3 = r3 - r1
            int r1 = r3 % 128
            ivas.gov.bisp.enumeration.p087j.LayoutInflaterFactory2C0312o.a = r1
            int r3 = r3 % r0
            if (r3 != 0) goto L38
            r0 = 96
            int r0 = r0 / 0
        L38:
            return
        L39:
            android.util.AndroidRuntimeException r0 = new android.util.AndroidRuntimeException
            java.lang.String r1 = "Window feature must be requested before adding content"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p087j.LayoutInflaterFactory2C0312o.X():void");
    }

    @Override // ivas.gov.bisp.enumeration.p087j.a
    public void e(View view, ViewGroup.LayoutParams layoutParams) {
        int i = 2 % 2;
        int i2 = b + 13;
        a = i2 % 128;
        int i3 = i2 % 2;
        M();
        View viewFindViewById = this.B.findViewById(android.R.id.content);
        int i4 = b;
        int i5 = ((i4 | 95) << 1) - (i4 ^ 95);
        a = i5 % 128;
        int i6 = i5 % 2;
        ((ViewGroup) viewFindViewById).addView(view, layoutParams);
        aQu aqu = this.m;
        int i7 = a;
        int i8 = (-2) - (((i7 ^ 62) + ((i7 & 62) << 1)) ^ (-1));
        b = i8 % 128;
        int i9 = i8 % 2;
        aqu.c.onContentChanged();
        int i10 = a + 125;
        b = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x01a4  */
    @Override // androidx.appcompat.view.menu.n.aII
    public void e(n nVar) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 53;
        int i4 = i3 + ((i2 ^ 53) | i3);
        int i5 = i4 % 128;
        b = i5;
        int i6 = i4 % 2;
        InterfaceC0320s interfaceC0320s = this.q;
        Object obj = null;
        if (interfaceC0320s != null) {
            int i7 = ((i5 & 51) - (~(i5 | 51))) - 1;
            a = i7 % 128;
            if (i7 % 2 == 0) {
                interfaceC0320s.g();
                throw null;
            }
            if (!(!interfaceC0320s.g())) {
                int i8 = b;
                int i9 = i8 ^ 95;
                int i10 = -(-((i8 & 95) << 1));
                int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
                a = i11 % 128;
                if (i11 % 2 == 0) {
                    ViewConfiguration.get(this.l).hasPermanentMenuKey();
                    obj.hashCode();
                    throw null;
                }
                if (ViewConfiguration.get(this.l).hasPermanentMenuKey()) {
                    int i12 = a;
                    int i13 = i12 & 115;
                    int i14 = ((i12 | 115) & (~i13)) + (i13 << 1);
                    b = i14 % 128;
                    int i15 = i14 % 2;
                    if (!this.q.e()) {
                        aQz aqzQ = Q(0);
                        aqzQ.f98o = true;
                        int i16 = b;
                        int i17 = i16 & 119;
                        int i18 = i17 + ((i16 ^ 119) | i17);
                        a = i18 % 128;
                        int i19 = i18 % 2;
                        I(aqzQ, false);
                        R(aqzQ, null);
                        int i20 = a + 121;
                        b = i20 % 128;
                        int i21 = i20 % 2;
                    }
                }
                Window.Callback callbackG = G();
                if (this.q.c()) {
                    int i22 = a;
                    int i23 = ((i22 | 69) << 1) - (i22 ^ 69);
                    b = i23 % 128;
                    if (i23 % 2 != 0) {
                        this.q.d();
                        obj.hashCode();
                        throw null;
                    }
                    this.q.d();
                    if (!this.S) {
                        int i24 = b + 97;
                        a = i24 % 128;
                        if (i24 % 2 == 0) {
                            callbackG.onPanelClosed(57, Q(1).k);
                        } else {
                            callbackG.onPanelClosed(108, Q(0).k);
                        }
                        int i25 = a;
                        int i26 = (i25 & 55) + (i25 | 55);
                        b = i26 % 128;
                        int i27 = i26 % 2;
                        return;
                    }
                } else if (callbackG != null) {
                    int i28 = a;
                    int i29 = i28 & 99;
                    int i30 = (i28 | 99) & (~i29);
                    int i31 = i29 << 1;
                    int i32 = (i30 & i31) + (i30 | i31);
                    int i33 = i32 % 128;
                    b = i33;
                    if (i32 % 2 != 0) {
                        throw null;
                    }
                    if (!this.S) {
                        int i34 = (((i33 | 38) << 1) - (i33 ^ 38)) - 1;
                        a = i34 % 128;
                        int i35 = i34 % 2;
                        if (this.V) {
                            int i36 = (i33 & 7) + (i33 | 7);
                            a = i36 % 128;
                            if (i36 % 2 != 0 ? (this.Z & 1) != 0 : (this.Z & 1) != 0) {
                                this.k.getDecorView().removeCallbacks(this.ae);
                                int i37 = a;
                                int i38 = ((i37 | 103) << 1) - (i37 ^ 103);
                                b = i38 % 128;
                                int i39 = i38 % 2;
                                this.ae.run();
                                int i40 = a;
                                int i41 = i40 & 81;
                                int i42 = (i40 ^ 81) | i41;
                                int i43 = ((i41 | i42) << 1) - (i42 ^ i41);
                                b = i43 % 128;
                                if (i43 % 2 != 0) {
                                    int i44 = 3 % 5;
                                }
                            }
                        }
                        aQz aqzQ2 = Q(0);
                        n nVar2 = aqzQ2.k;
                        if (nVar2 != null) {
                            int i45 = a;
                            int i46 = (i45 & 7) + (i45 | 7);
                            b = i46 % 128;
                            int i47 = i46 % 2;
                            if (!aqzQ2.q) {
                                int i48 = a;
                                int i49 = ((i48 | 29) << 1) - (i48 ^ 29);
                                b = i49 % 128;
                                int i50 = i49 % 2;
                                if (callbackG.onPreparePanel(0, aqzQ2.j, nVar2)) {
                                    int i51 = a;
                                    int i52 = ((i51 & 41) - (~(-(-(i51 | 41))))) - 1;
                                    b = i52 % 128;
                                    if (i52 % 2 != 0) {
                                        callbackG.onMenuOpened(55, aqzQ2.k);
                                    } else {
                                        callbackG.onMenuOpened(108, aqzQ2.k);
                                    }
                                    this.q.a();
                                    int i53 = a + 19;
                                    b = i53 % 128;
                                    int i54 = i53 % 2;
                                    return;
                                }
                            }
                        }
                    }
                }
            } else {
                aQz aqzQ3 = Q(0);
                aqzQ3.f98o = true;
                int i110 = b;
                int i111 = i110 & 119;
                int i112 = i111 + ((i110 ^ 119) | i111);
                a = i112 % 128;
                int i113 = i112 % 2;
                I(aqzQ3, false);
                R(aqzQ3, null);
                int i210 = a + 121;
                b = i210 % 128;
                int i211 = i210 % 2;
            }
        } else {
            aQz aqzQ4 = Q(0);
            aqzQ4.f98o = true;
            int i114 = b;
            int i115 = i114 & 119;
            int i116 = i115 + ((i114 ^ 119) | i115);
            a = i116 % 128;
            int i117 = i116 % 2;
            I(aqzQ4, false);
            R(aqzQ4, null);
            int i212 = a + 121;
            b = i212 % 128;
            int i213 = i212 % 2;
        }
        int i55 = a + 59;
        b = i55 % 128;
        int i56 = i55 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.p087j.a
    public <T extends View> T h(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 21;
        int i5 = i4 + ((i3 ^ 21) | i4);
        a = i5 % 128;
        int i6 = i5 % 2;
        M();
        T t = (T) this.k.findViewById(i);
        int i7 = b;
        int i8 = ((((i7 ^ 17) | (i7 & 17)) << 1) - (~(-(((~i7) & 17) | (i7 & (-18)))))) - 1;
        a = i8 % 128;
        if (i8 % 2 != 0) {
            return t;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p087j.a
    public void p() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 25;
        int i4 = (((i2 ^ 25) | i3) << 1) - ((i2 | 25) & (~i3));
        b = i4 % 128;
        int i5 = i4 % 2;
        T();
        z zVar = this.i;
        if (zVar != null) {
            int i6 = b + 89;
            a = i6 % 128;
            int i7 = i6 % 2;
            zVar.o(true);
            int i8 = a;
            int i9 = (((i8 | 102) << 1) - (i8 ^ 102)) - 1;
            b = i9 % 128;
            int i10 = i9 % 2;
        }
        int i11 = a;
        int i12 = i11 & 87;
        int i13 = ((((i11 ^ 87) | i12) << 1) - (~(-((i11 | 87) & (~i12))))) - 1;
        b = i13 % 128;
        int i14 = i13 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.p087j.a
    public void u(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 ^ 18) + ((i3 & 18) << 1)) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        M();
        View viewFindViewById = this.B.findViewById(android.R.id.content);
        int i6 = (-2) - ((a + 84) ^ (-1));
        b = i6 % 128;
        int i7 = i6 % 2;
        ViewGroup viewGroup = (ViewGroup) viewFindViewById;
        viewGroup.removeAllViews();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.l);
        int i8 = b;
        int i9 = i8 & 101;
        int i10 = -(-((i8 ^ 101) | i9));
        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
        a = i11 % 128;
        int i12 = i11 % 2;
        layoutInflaterFrom.inflate(i, viewGroup);
        this.m.c.onContentChanged();
        int i13 = b;
        int i14 = i13 & 93;
        int i15 = ((i13 ^ 93) | i14) << 1;
        int i16 = -((i13 | 93) & (~i14));
        int i17 = (i15 & i16) + (i16 | i15);
        a = i17 % 128;
        if (i17 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p087j.a
    public final void y(CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 81;
        int i4 = -(-((i2 ^ 81) | i3));
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        int i6 = i5 % 128;
        a = i6;
        Object obj = null;
        if (i5 % 2 == 0) {
            this.p = charSequence;
            obj.hashCode();
            throw null;
        }
        this.p = charSequence;
        InterfaceC0320s interfaceC0320s = this.q;
        if (interfaceC0320s != null) {
            int i7 = (((i2 | 60) << 1) - (i2 ^ 60)) - 1;
            a = i7 % 128;
            int i8 = i7 % 2;
            interfaceC0320s.setWindowTitle(charSequence);
            int i9 = a;
            int i10 = i9 & 75;
            int i11 = ((i9 ^ 75) | i10) << 1;
            int i12 = -((i9 | 75) & (~i10));
            int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
            b = i13 % 128;
            if (i13 % 2 != 0) {
                throw null;
            }
            return;
        }
        z zVar = this.i;
        if (zVar != null) {
            int i14 = i6 & 79;
            int i15 = (i6 ^ 79) | i14;
            int i16 = ((i14 | i15) << 1) - (i14 ^ i15);
            b = i16 % 128;
            int i17 = i16 % 2;
            zVar.r(charSequence);
            int i18 = a;
            int i19 = (((i18 | 57) << 1) - (~(-(i18 ^ 57)))) - 1;
            b = i19 % 128;
            int i20 = i19 % 2;
            return;
        }
        TextView textView = this.C;
        if (textView != null) {
            int i21 = (i2 | 11) << 1;
            int i22 = -(i2 ^ 11);
            int i23 = (i21 & i22) + (i22 | i21);
            a = i23 % 128;
            if (i23 % 2 == 0) {
                textView.setText(charSequence);
                int i24 = 9 / 0;
            } else {
                textView.setText(charSequence);
            }
            int i25 = b + 49;
            a = i25 % 128;
            int i26 = i25 % 2;
        }
        int i27 = b;
        int i28 = i27 & 89;
        int i29 = -(-(i27 | 89));
        int i30 = (i28 & i29) + (i29 | i28);
        a = i30 % 128;
        if (i30 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.j.o$aQz */
    public static final class aQz {
        private static int a = 1;
        private static int b;
        public c c;
        public int d;
        public int e;
        public int f;
        public int g;
        public View h;
        public ViewGroup i;
        public View j;
        public n k;
        public Context l;
        public boolean m;
        public boolean n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f98o = false;
        public boolean p;
        public boolean q;
        public Bundle r;

        public aQz(int i) {
            this.d = i;
        }

        public final void c(n nVar) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 ^ 79) + ((i2 & 79) << 1);
            a = i3 % 128;
            int i4 = i3 % 2;
            n nVar2 = this.k;
            if (nVar == nVar2) {
                int i5 = ((i2 ^ 5) | (i2 & 5)) << 1;
                int i6 = -(((~i2) & 5) | (i2 & (-6)));
                int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
                a = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 16 / 0;
                    return;
                }
                return;
            }
            if (nVar2 != null) {
                int i9 = ((i2 ^ 56) + ((i2 & 56) << 1)) - 1;
                a = i9 % 128;
                if (i9 % 2 == 0) {
                    nVar2.x(this.c);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                nVar2.x(this.c);
                int i10 = b;
                int i11 = i10 & 107;
                int i12 = i10 | 107;
                int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
                a = i13 % 128;
                int i14 = i13 % 2;
            }
            this.k = nVar;
            if (nVar != null) {
                int i15 = b;
                int i16 = i15 & 93;
                int i17 = (i15 ^ 93) | i16;
                int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
                int i19 = i18 % 128;
                a = i19;
                int i20 = i18 % 2;
                c cVar = this.c;
                if (cVar != null) {
                    int i21 = i19 & 9;
                    int i22 = (((i19 | 9) & (~i21)) - (~(i21 << 1))) - 1;
                    b = i22 % 128;
                    if (i22 % 2 != 0) {
                        nVar.e(cVar, nVar.c);
                        int i23 = 71 / 0;
                    } else {
                        nVar.e(cVar, nVar.c);
                    }
                }
            }
            int i24 = a;
            int i25 = (i24 ^ 29) + ((i24 & 29) << 1);
            b = i25 % 128;
            int i26 = i25 % 2;
        }
    }

    public aQz N(Menu menu) {
        aQz[] aqzArr;
        int length;
        int i;
        aQz aqz;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 ^ 79;
        int i5 = -(-((i3 & 79) << 1));
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        a = i6 % 128;
        if (i6 % 2 != 0 ? (aqzArr = this.N) == null : (aqzArr = this.N) == null) {
            int i7 = (i3 & 73) + (i3 | 73);
            a = i7 % 128;
            int i8 = i7 % 2;
            i = 0;
            length = 0;
        } else {
            length = aqzArr.length;
            int i9 = i3 + 64;
            int i10 = (i9 ^ (-1)) + (i9 << 1);
            a = i10 % 128;
            int i11 = i10 % 2;
            i = 0;
        }
        while (true) {
            if (i >= length) {
                int i12 = a;
                int i13 = i12 & 33;
                int i14 = (i13 - (~(-(-((i12 ^ 33) | i13))))) - 1;
                b = i14 % 128;
                if (i14 % 2 == 0) {
                    return null;
                }
                throw null;
            }
            int i15 = a;
            int i16 = i15 & 75;
            int i17 = i16 + ((i15 ^ 75) | i16);
            b = i17 % 128;
            if (i17 % 2 != 0) {
                aQz aqz2 = aqzArr[i];
                throw null;
            }
            aqz = aqzArr[i];
            if (aqz != null) {
                int i18 = ((i15 ^ 89) | (i15 & 89)) << 1;
                int i19 = -(((~i15) & 89) | (i15 & (-90)));
                int i20 = (i18 & i19) + (i19 | i18);
                b = i20 % 128;
                int i21 = i20 % 2;
                n nVar = aqz.k;
                if (i21 != 0) {
                    int i22 = 78 / 0;
                    if (nVar == menu) {
                        break;
                    }
                } else if (nVar == menu) {
                    break;
                }
            }
            int i23 = i - 10;
            int i24 = i23 & 11;
            i = (((i23 ^ 11) | i24) << 1) - ((i23 | 11) & (~i24));
            int i25 = a;
            int i26 = i25 & 101;
            int i27 = ((i25 | 101) & (~i26)) + (i26 << 1);
            b = i27 % 128;
            int i28 = i27 % 2;
        }
        int i29 = a;
        int i30 = i29 & 87;
        int i31 = ((i29 ^ 87) | i30) << 1;
        int i32 = -((i29 | 87) & (~i30));
        int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
        b = i33 % 128;
        if (i33 % 2 == 0) {
            return aqz;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
    
        if (r6.m != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0051, code lost:
    
        r2 = ivas.gov.bisp.enumeration.p087j.LayoutInflaterFactory2C0312o.a;
        r3 = ((r2 | 49) << 1) - (r2 ^ 49);
        ivas.gov.bisp.enumeration.p087j.LayoutInflaterFactory2C0312o.b = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005e, code lost:
    
        if ((r3 % 2) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0064, code lost:
    
        if (Z(r6, r8) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
    
        if (Z(r6, r8) == true) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006e, code lost:
    
        r2 = r6.k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0070, code lost:
    
        if (r2 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        r1 = ivas.gov.bisp.enumeration.p087j.LayoutInflaterFactory2C0312o.a;
        r3 = ((r1 & 82) + (r1 | 82)) - 1;
        ivas.gov.bisp.enumeration.p087j.LayoutInflaterFactory2C0312o.b = r3 % 128;
        r3 = r3 % 2;
        r1 = r2.performShortcut(r7, r8, r9);
        r7 = ivas.gov.bisp.enumeration.p087j.LayoutInflaterFactory2C0312o.a;
        r8 = ((r7 ^ 4) + ((r7 & 4) << 1)) - 1;
        ivas.gov.bisp.enumeration.p087j.LayoutInflaterFactory2C0312o.b = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0091, code lost:
    
        if (r1 == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0093, code lost:
    
        r7 = ivas.gov.bisp.enumeration.p087j.LayoutInflaterFactory2C0312o.b;
        r8 = r7 & 27;
        r8 = r8 + ((r7 ^ 27) | r8);
        ivas.gov.bisp.enumeration.p087j.LayoutInflaterFactory2C0312o.a = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a2, code lost:
    
        if ((r9 & 1) != 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a4, code lost:
    
        r8 = ((r7 & (-52)) | ((~r7) & 51)) + ((r7 & 51) << 1);
        ivas.gov.bisp.enumeration.p087j.LayoutInflaterFactory2C0312o.a = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b3, code lost:
    
        if ((r8 % 2) == 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b7, code lost:
    
        if (r5.q != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b9, code lost:
    
        I(r6, true);
        r6 = ivas.gov.bisp.enumeration.p087j.LayoutInflaterFactory2C0312o.a;
        r7 = (r6 & 115) + (r6 | 115);
        ivas.gov.bisp.enumeration.p087j.LayoutInflaterFactory2C0312o.b = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ca, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00cb, code lost:
    
        r6 = ivas.gov.bisp.enumeration.p087j.LayoutInflaterFactory2C0312o.b;
        r7 = (r6 | 83) << 1;
        r6 = -(r6 ^ 83);
        r8 = (r7 ^ r6) + ((r6 & r7) << 1);
        ivas.gov.bisp.enumeration.p087j.LayoutInflaterFactory2C0312o.a = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00dd, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0025, code lost:
    
        if (r8.isSystem() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        if (r8.isSystem() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
    
        r6 = ivas.gov.bisp.enumeration.p087j.LayoutInflaterFactory2C0312o.a;
        r7 = r6 & 9;
        r7 = r7 + ((r6 ^ 9) | r7);
        r6 = r7 % 128;
        ivas.gov.bisp.enumeration.p087j.LayoutInflaterFactory2C0312o.b = r6;
        r7 = r7 % 2;
        r7 = r6 & 15;
        r6 = -(-((r6 ^ 15) | r7));
        r8 = (r7 ^ r6) + ((r6 & r7) << 1);
        ivas.gov.bisp.enumeration.p087j.LayoutInflaterFactory2C0312o.a = r8 % 128;
        r8 = r8 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean V(ivas.gov.bisp.enumeration.p087j.LayoutInflaterFactory2C0312o.aQz r6, int r7, android.view.KeyEvent r8, int r9) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p087j.LayoutInflaterFactory2C0312o.V(ivas.gov.bisp.enumeration.j.o$aQz, int, android.view.KeyEvent, int):boolean");
    }

    @Override // androidx.appcompat.view.menu.n.aII
    public boolean b(n nVar, MenuItem menuItem) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 | 115) << 1;
        int i4 = -(((~i2) & 115) | (i2 & (-116)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            G();
            obj.hashCode();
            throw null;
        }
        Window.Callback callbackG = G();
        if (callbackG != null) {
            int i6 = b;
            int i7 = i6 ^ 125;
            int i8 = -(-((i6 & 125) << 1));
            int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
            a = i9 % 128;
            int i10 = i9 % 2;
            if (!this.S) {
                int i11 = (i6 ^ 9) + ((i6 & 9) << 1);
                a = i11 % 128;
                int i12 = i11 % 2;
                aQz aqzN = N(nVar.m());
                if (aqzN != null) {
                    int i13 = a;
                    int i14 = i13 & 99;
                    int i15 = ((i13 ^ 99) | i14) << 1;
                    int i16 = -((i13 | 99) & (~i14));
                    int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
                    b = i17 % 128;
                    int i18 = i17 % 2;
                    int i19 = aqzN.d;
                    if (i18 == 0) {
                        return callbackG.onMenuItemSelected(i19, menuItem);
                    }
                    callbackG.onMenuItemSelected(i19, menuItem);
                    obj.hashCode();
                    throw null;
                }
            }
        }
        int i20 = b;
        int i21 = (i20 ^ 81) + ((i20 & 81) << 1);
        a = i21 % 128;
        int i22 = i21 % 2;
        return false;
    }

    @Override // ivas.gov.bisp.enumeration.p087j.a
    public void r() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 33;
        int i4 = (((i2 & 33) | i3) << 1) - i3;
        a = i4 % 128;
        if (i4 % 2 == 0) {
            T();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        T();
        z zVar = this.i;
        if (zVar != null) {
            zVar.o(false);
            int i5 = a;
            int i6 = (i5 & (-98)) | ((~i5) & 97);
            int i7 = (i5 & 97) << 1;
            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
            b = i8 % 128;
            int i9 = i8 % 2;
        }
        int i10 = a;
        int i11 = i10 ^ 3;
        int i12 = ((((i10 & 3) | i11) << 1) - (~(-i11))) - 1;
        b = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0050  */
    /* JADX WARN: Code duplicated, block: B:17:0x0055  */
    /* JADX WARN: Code duplicated, block: B:19:0x0064  */
    /* JADX WARN: Code duplicated, block: B:21:0x006a  */
    public void F(n nVar) {
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = (i4 & 84) + (i4 | 84);
        int i6 = (i5 ^ (-1)) + (i5 << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        if (this.M) {
            int i8 = i4 & 39;
            int i9 = (((i4 ^ 39) | i8) << 1) - ((i4 | 39) & (~i8));
            b = i9 % 128;
            if (i9 % 2 != 0) {
                throw null;
            }
            return;
        }
        this.M = true;
        this.q.p();
        Window.Callback callbackG = G();
        int i10 = b;
        int i11 = i10 & 17;
        int i12 = i11 + ((i10 ^ 17) | i11);
        a = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 57 / 0;
            if (callbackG != null) {
                if (!this.S) {
                    int i14 = i10 & 121;
                    i = ((i10 | 121) & (~i14)) + (i14 << 1);
                    a = i % 128;
                    if (i % 2 == 0) {
                        i2 = 83;
                    } else {
                        i2 = 108;
                    }
                    callbackG.onPanelClosed(i2, nVar);
                }
            }
        } else if (callbackG != null) {
            if (!this.S) {
                int i15 = i10 & 121;
                i = ((i10 | 121) & (~i15)) + (i15 << 1);
                a = i % 128;
                if (i % 2 == 0) {
                    i2 = 83;
                } else {
                    i2 = 108;
                }
                callbackG.onPanelClosed(i2, nVar);
            }
        }
        this.M = false;
        int i16 = b;
        int i17 = ((i16 ^ 11) | (i16 & 11)) << 1;
        int i18 = -(((~i16) & 11) | (i16 & (-12)));
        int i19 = (i17 & i18) + (i18 | i17);
        a = i19 % 128;
        int i20 = i19 % 2;
    }

    public final Configuration J(Context context, int i, Configuration configuration) {
        int i2;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = ((i4 ^ 118) + ((i4 & 118) << 1)) - 1;
        b = i5 % 128;
        int i6 = i5 % 2;
        if (i != 1) {
            int i7 = i4 & 97;
            int i8 = (i7 - (~((i4 ^ 97) | i7))) - 1;
            int i9 = i8 % 128;
            b = i9;
            int i10 = i8 % 2;
            if (i != 2) {
                int i11 = i4 + 99;
                b = i11 % 128;
                int i12 = i11 % 2;
                int i13 = context.getApplicationContext().getResources().getConfiguration().uiMode;
                int i14 = b;
                int i15 = i14 ^ 73;
                int i16 = ((i14 & 73) | i15) << 1;
                int i17 = -i15;
                int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
                a = i18 % 128;
                int i19 = i18 % 2;
                i2 = i13 & 48;
                int i20 = (i14 & 113) + (i14 | 113);
                a = i20 % 128;
                int i21 = i20 % 2;
            } else {
                int i22 = ((i9 ^ 36) + ((i9 & 36) << 1)) - 1;
                a = i22 % 128;
                if (i22 % 2 == 0) {
                    int i23 = 4 / 5;
                }
                i2 = 32;
            }
        } else {
            int i24 = i4 + 67;
            b = i24 % 128;
            int i25 = i24 % 2;
            i2 = 16;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        int i26 = a;
        int i27 = i26 & 9;
        int i28 = -(-((i26 ^ 9) | i27));
        int i29 = (i27 ^ i28) + ((i27 & i28) << 1);
        b = i29 % 128;
        if (i29 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (configuration != null) {
            int i30 = i26 + 23;
            b = i30 % 128;
            int i31 = i30 % 2;
            configuration2.setTo(configuration);
            int i32 = b;
            int i33 = i32 & 99;
            int i34 = (i33 - (~(-(-((i32 ^ 99) | i33))))) - 1;
            a = i34 % 128;
            int i35 = i34 % 2;
        }
        int i36 = configuration2.uiMode & (-49);
        configuration2.uiMode = ((~i2) & i36) | ((~i36) & i2);
        int i37 = a;
        int i38 = i37 + 97;
        b = i38 % 128;
        int i39 = i38 % 2;
        int i40 = i37 + 73;
        b = i40 % 128;
        int i41 = i40 % 2;
        return configuration2;
    }

    @Override // ivas.gov.bisp.enumeration.p087j.a
    public void d() {
        int i = 2 % 2;
        int i2 = (-2) - ((b + 92) ^ (-1));
        a = i2 % 128;
        int i3 = i2 % 2;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.l);
        if (layoutInflaterFrom.getFactory() != null) {
            layoutInflaterFrom.getFactory2();
            int i4 = a;
            int i5 = (i4 ^ 81) + ((i4 & 81) << 1);
            b = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        int i7 = a;
        int i8 = (i7 ^ 55) + ((i7 & 55) << 1);
        b = i8 % 128;
        int i9 = i8 % 2;
        layoutInflaterFrom.setFactory2(this);
        int i10 = a;
        int i11 = ((((i10 ^ 117) | (i10 & 117)) << 1) - (~(-(((~i10) & 117) | (i10 & (-118)))))) - 1;
        b = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p087j.a
    public void k() {
        int i = 2 % 2;
        int i2 = a + 89;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            T();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        T();
        z zVar = this.i;
        if (zVar == null || !zVar.h()) {
            S(0);
            int i3 = a;
            int i4 = i3 ^ 7;
            int i5 = (((i3 & 7) | i4) << 1) - i4;
            b = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        int i7 = a;
        int i8 = ((i7 ^ 123) | (i7 & 123)) << 1;
        int i9 = -(((~i7) & 123) | (i7 & (-124)));
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        b = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0097  */
    /* JADX WARN: Code duplicated, block: B:24:0x009b  */
    public void H(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 115;
        int i5 = (i3 ^ 115) | i4;
        int i6 = (i4 & i5) + (i5 | i4);
        b = i6 % 128;
        Object obj = null;
        if (i6 % 2 != 0) {
            n nVar = Q(i).k;
            obj.hashCode();
            throw null;
        }
        aQz aqzQ = Q(i);
        if (aqzQ.k != null) {
            Bundle bundle = new Bundle();
            n nVar2 = aqzQ.k;
            int i7 = b;
            int i8 = i7 & 47;
            int i9 = (((i7 ^ 47) | i8) << 1) - ((i7 | 47) & (~i8));
            a = i9 % 128;
            if (i9 % 2 == 0) {
                nVar2.y(bundle);
                bundle.size();
                obj.hashCode();
                throw null;
            }
            nVar2.y(bundle);
            if (bundle.size() > 0) {
                aqzQ.r = bundle;
                int i10 = a + 73;
                b = i10 % 128;
                int i11 = i10 % 2;
            }
            aqzQ.k.A();
            aqzQ.k.clear();
            int i12 = a;
            int i13 = i12 & 23;
            int i14 = (i12 ^ 23) | i13;
            int i15 = (i13 & i14) + (i14 | i13);
            b = i15 % 128;
            int i16 = i15 % 2;
        }
        aqzQ.q = true;
        aqzQ.f98o = true;
        if (i != 108) {
            int i17 = b;
            int i18 = i17 ^ 73;
            int i19 = (i17 & 73) << 1;
            int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
            a = i20 % 128;
            if (i20 % 2 == 0) {
                int i21 = 29 / 0;
                if (i == 0) {
                    if (this.q != null) {
                        int i22 = b + 95;
                        a = i22 % 128;
                        int i23 = i22 % 2;
                        aQz aqzQ2 = Q(0);
                        aqzQ2.m = false;
                        int i24 = a + 29;
                        b = i24 % 128;
                        int i25 = i24 % 2;
                        Z(aqzQ2, null);
                        int i26 = b + 91;
                        a = i26 % 128;
                        int i27 = i26 % 2;
                    }
                }
            } else if (i == 0) {
                if (this.q != null) {
                    int i28 = b + 95;
                    a = i28 % 128;
                    int i29 = i28 % 2;
                    aQz aqzQ3 = Q(0);
                    aqzQ3.m = false;
                    int i210 = a + 29;
                    b = i210 % 128;
                    int i211 = i210 % 2;
                    Z(aqzQ3, null);
                    int i212 = b + 91;
                    a = i212 % 128;
                    int i213 = i212 % 2;
                }
            }
        } else if (this.q != null) {
            int i214 = b + 95;
            a = i214 % 128;
            int i215 = i214 % 2;
            aQz aqzQ4 = Q(0);
            aqzQ4.m = false;
            int i216 = a + 29;
            b = i216 % 128;
            int i217 = i216 % 2;
            Z(aqzQ4, null);
            int i218 = b + 91;
            a = i218 % 128;
            int i219 = i218 % 2;
        }
        int i30 = b;
        int i31 = ((((i30 ^ 119) | (i30 & 119)) << 1) - (~(-(((~i30) & 119) | (i30 & (-120)))))) - 1;
        a = i31 % 128;
        if (i31 % 2 == 0) {
            int i32 = 10 / 0;
        }
    }

    public final void S(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 ^ 47;
        int i5 = ((i3 & 47) | i4) << 1;
        int i6 = -i4;
        int i7 = (i5 & i6) + (i6 | i5);
        b = i7 % 128;
        int i8 = i7 % 2;
        int i9 = 1 << i;
        int i10 = this.Z;
        int i11 = i9 & i10;
        int i12 = (i9 | i10) & (~i11);
        this.Z = (i12 & i11) | (i12 ^ i11);
        int i13 = i3 & 99;
        int i14 = (i3 ^ 99) | i13;
        int i15 = ((i13 | i14) << 1) - (i13 ^ i14);
        b = i15 % 128;
        Object obj = null;
        if (i15 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (!this.V) {
            View decorView = this.k.getDecorView();
            Runnable runnable = this.ae;
            WeakHashMap<View, R> weakHashMap = T.c;
            int i16 = a;
            int i17 = i16 & 29;
            int i18 = i17 + ((i16 ^ 29) | i17);
            b = i18 % 128;
            int i19 = i18 % 2;
            T.aWX.o(decorView, runnable);
            this.V = true;
            int i20 = a;
            int i21 = i20 & 29;
            int i22 = (((i20 | 29) & (~i21)) - (~(i21 << 1))) - 1;
            b = i22 % 128;
            int i23 = i22 % 2;
        }
        int i24 = a + 58;
        int i25 = (i24 ^ (-1)) + (i24 << 1);
        b = i25 % 128;
        if (i25 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003f A[PHI: r1
  0x003f: PHI (r1v8 ivas.gov.bisp.enumeration.j.z) = (r1v7 ivas.gov.bisp.enumeration.j.z), (r1v18 ivas.gov.bisp.enumeration.j.z) binds: [B:10:0x003d, B:7:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:13:0x0051  */
    /* JADX WARN: Code duplicated, block: B:14:0x005a  */
    /* JADX WARN: Code duplicated, block: B:15:0x005f  */
    @Override // ivas.gov.bisp.enumeration.p087j.a
    public MenuInflater i() {
        z zVar;
        int i;
        Context contextI;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 | 80) << 1) - (i3 ^ 80);
        int i5 = (i4 ^ (-1)) + (i4 << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        if (this.f97o == null) {
            int i7 = ((i3 | 89) << 1) - (((~i3) & 89) | (i3 & (-90)));
            b = i7 % 128;
            if (i7 % 2 != 0) {
                T();
                zVar = this.i;
                int i8 = 42 / 0;
                if (zVar != null) {
                    int i9 = b;
                    int i10 = i9 & 121;
                    i = ((i9 | 121) & (~i10)) + (i10 << 1);
                    a = i % 128;
                    if (i % 2 == 0) {
                        contextI = zVar.i();
                        int i11 = 95 / 0;
                    } else {
                        contextI = zVar.i();
                    }
                } else {
                    contextI = this.l;
                    int i12 = b;
                    int i13 = i12 ^ 73;
                    int i14 = (i12 & 73) << 1;
                    int i15 = (i13 & i14) + (i14 | i13);
                    a = i15 % 128;
                    int i16 = i15 % 2;
                }
            } else {
                T();
                zVar = this.i;
                if (zVar != null) {
                    int i17 = b;
                    int i18 = i17 & 121;
                    i = ((i17 | 121) & (~i18)) + (i18 << 1);
                    a = i % 128;
                    if (i % 2 == 0) {
                        contextI = zVar.i();
                        int i19 = 95 / 0;
                    } else {
                        contextI = zVar.i();
                    }
                } else {
                    contextI = this.l;
                    int i110 = b;
                    int i111 = i110 ^ 73;
                    int i112 = (i110 & 73) << 1;
                    int i113 = (i111 & i112) + (i112 | i111);
                    a = i113 % 128;
                    int i114 = i113 % 2;
                }
            }
            this.f97o = new i(contextI);
            int i20 = a;
            int i21 = ((i20 | 28) << 1) - (i20 ^ 28);
            int i22 = (i21 ^ (-1)) + (i21 << 1);
            b = i22 % 128;
            int i23 = i22 % 2;
        }
        MenuInflater menuInflater = this.f97o;
        int i24 = a + 95;
        b = i24 % 128;
        if (i24 % 2 != 0) {
            int i25 = 23 / 0;
        }
        return menuInflater;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x002f  */
    /* JADX WARN: Code duplicated, block: B:8:0x003f  */
    public aQz Q(int i) {
        aQz[] aqzArr;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 51;
        int i5 = ((i3 ^ 51) | i4) << 1;
        int i6 = -((~i4) & (i3 | 51));
        int i7 = (i5 & i6) + (i5 | i6);
        a = i7 % 128;
        int i8 = i7 % 2;
        aQz[] aqzArr2 = this.N;
        if (aqzArr2 != null) {
            int i9 = i3 & 85;
            int i10 = (i3 ^ 85) | i9;
            int i11 = (i9 & i10) + (i9 | i10);
            a = i11 % 128;
            int i12 = i11 % 2;
            if (aqzArr2.length <= i) {
                int i13 = i ^ 1;
                int i14 = ((i & 1) | i13) << 1;
                int i15 = -i13;
                aqzArr = new aQz[(i14 & i15) + (i15 | i14)];
                if (aqzArr2 != null) {
                    int i16 = ((i3 ^ 113) | (i3 & 113)) << 1;
                    int i17 = -(((~i3) & 113) | (i3 & (-114)));
                    int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
                    a = i18 % 128;
                    int i19 = i18 % 2;
                    System.arraycopy(aqzArr2, 0, aqzArr, 0, aqzArr2.length);
                    int i20 = a;
                    int i21 = i20 & 87;
                    int i22 = ((i20 | 87) & (~i21)) + (i21 << 1);
                    b = i22 % 128;
                    int i23 = i22 % 2;
                }
                this.N = aqzArr;
                int i24 = b;
                int i25 = i24 ^ 21;
                int i26 = ((i24 & 21) | i25) << 1;
                int i27 = -i25;
                int i28 = (i26 & i27) + (i26 | i27);
                a = i28 % 128;
                int i29 = i28 % 2;
                aqzArr2 = aqzArr;
            }
        } else {
            int i110 = i ^ 1;
            int i111 = ((i & 1) | i110) << 1;
            int i112 = -i110;
            aqzArr = new aQz[(i111 & i112) + (i112 | i111)];
            if (aqzArr2 != null) {
                int i113 = ((i3 ^ 113) | (i3 & 113)) << 1;
                int i114 = -(((~i3) & 113) | (i3 & (-114)));
                int i115 = ((i113 | i114) << 1) - (i114 ^ i113);
                a = i115 % 128;
                int i116 = i115 % 2;
                System.arraycopy(aqzArr2, 0, aqzArr, 0, aqzArr2.length);
                int i210 = a;
                int i211 = i210 & 87;
                int i212 = ((i210 | 87) & (~i211)) + (i211 << 1);
                b = i212 % 128;
                int i213 = i212 % 2;
            }
            this.N = aqzArr;
            int i214 = b;
            int i215 = i214 ^ 21;
            int i216 = ((i214 & 21) | i215) << 1;
            int i217 = -i215;
            int i218 = (i216 & i217) + (i216 | i217);
            a = i218 % 128;
            int i219 = i218 % 2;
            aqzArr2 = aqzArr;
        }
        aQz aqz = aqzArr2[i];
        if (aqz == null) {
            aqz = new aQz(i);
            aqzArr2[i] = aqz;
            int i30 = a;
            int i31 = ((i30 ^ 7) | (i30 & 7)) << 1;
            int i32 = -(((~i30) & 7) | (i30 & (-8)));
            int i33 = (i31 & i32) + (i32 | i31);
            b = i33 % 128;
            int i34 = i33 % 2;
        }
        int i35 = b + 35;
        a = i35 % 128;
        int i36 = i35 % 2;
        return aqz;
    }

    @Override // ivas.gov.bisp.enumeration.p087j.a
    public boolean v(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 & 49) + (i3 | 49);
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        if (i == 8) {
            int i7 = (i5 & (-102)) | ((~i5) & 101);
            int i8 = -(-((i5 & 101) << 1));
            int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
            b = i9 % 128;
            i = i9 % 2 != 0 ? 19 : 108;
        } else if (i == 9) {
            int i10 = (-2) - (((i5 ^ 12) + ((i5 & 12) << 1)) ^ (-1));
            int i11 = i10 % 128;
            b = i11;
            i = i10 % 2 != 0 ? 9 : 109;
            int i12 = i11 & 61;
            int i13 = (i11 ^ 61) | i12;
            int i14 = (i12 & i13) + (i13 | i12);
            a = i14 % 128;
            int i15 = i14 % 2;
        }
        if (this.J) {
            int i16 = b;
            int i17 = i16 + 119;
            a = i17 % 128;
            if (i17 % 2 != 0 ? i == 108 : i == 97) {
                int i18 = i16 | 115;
                int i19 = (i18 << 1) - (i18 & (~(i16 & 115)));
                a = i19 % 128;
                return i19 % 2 == 0;
            }
        }
        if (!(!this.F)) {
            int i20 = b;
            int i21 = i20 + 23;
            a = i21 % 128;
            if (i21 % 2 != 0 ? i == 1 : i == 1) {
                this.F = false;
                int i22 = ((i20 ^ 44) + ((i20 & 44) << 1)) - 1;
                a = i22 % 128;
                int i23 = i22 % 2;
            }
        }
        if (i == 1) {
            X();
            this.J = true;
            int i24 = a;
            int i25 = i24 & 23;
            int i26 = (((i24 ^ 23) | i25) << 1) - ((i24 | 23) & (~i25));
            b = i26 % 128;
            int i27 = i26 % 2;
            return true;
        }
        int i28 = a;
        int i29 = ((i28 | 47) << 1) - (i28 ^ 47);
        b = i29 % 128;
        int i30 = i29 % 2;
        Object obj = null;
        if (i == 2) {
            X();
            this.E = true;
            int i31 = a;
            int i32 = (i31 ^ 123) + ((i31 & 123) << 1);
            b = i32 % 128;
            if (i32 % 2 == 0) {
                return true;
            }
            obj.hashCode();
            throw null;
        }
        int i33 = i28 + 7;
        int i34 = i33 % 128;
        b = i34;
        if (i33 % 2 == 0 ? i == 5 : i == 4) {
            X();
            this.D = true;
            int i35 = a;
            int i36 = (i35 & 83) + (i35 | 83);
            b = i36 % 128;
            int i37 = i36 % 2;
            return true;
        }
        int i38 = (((i34 | 107) << 1) - (~(-(i34 ^ 107)))) - 1;
        int i39 = i38 % 128;
        a = i39;
        int i40 = i38 % 2;
        if (i == 10) {
            X();
            this.G = true;
            int i41 = b;
            int i42 = ((i41 & (-90)) | ((~i41) & 89)) + ((i41 & 89) << 1);
            a = i42 % 128;
            int i43 = i42 % 2;
            return true;
        }
        int i44 = i39 & 17;
        int i45 = i44 + ((i39 ^ 17) | i44);
        int i46 = i45 % 128;
        b = i46;
        int i47 = i45 % 2;
        if (i == 108) {
            X();
            this.F = true;
            int i48 = a;
            int i49 = (-2) - (((i48 & 104) + (i48 | 104)) ^ (-1));
            b = i49 % 128;
            int i50 = i49 % 2;
            return true;
        }
        int i51 = i46 ^ 37;
        int i52 = (i46 & 37) << 1;
        int i53 = (i51 & i52) + (i51 | i52);
        int i54 = i53 % 128;
        a = i54;
        if (i53 % 2 != 0 ? i == 109 : i == 97) {
            X();
            this.H = true;
            int i55 = a;
            int i56 = (i55 ^ 45) + ((i55 & 45) << 1);
            b = i56 % 128;
            if (i56 % 2 == 0) {
                return true;
            }
            obj.hashCode();
            throw null;
        }
        int i57 = i54 & 89;
        int i58 = (i54 | 89) & (~i57);
        int i59 = -(-(i57 << 1));
        int i60 = ((i58 | i59) << 1) - (i58 ^ i59);
        b = i60 % 128;
        if (i60 % 2 != 0) {
            this.k.requestFeature(i);
            obj.hashCode();
            throw null;
        }
        boolean zRequestFeature = this.k.requestFeature(i);
        int i61 = b;
        int i62 = i61 & 29;
        int i63 = i62 + ((i61 ^ 29) | i62);
        a = i63 % 128;
        int i64 = i63 % 2;
        return zRequestFeature;
    }

    public final void C(Window window) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 101) << 1) - (((~i2) & 101) | (i2 & (-102)));
        a = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (this.k != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof aQu) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        aQu aqu = new aQu(callback);
        int i4 = a + 26;
        int i5 = (i4 ^ (-1)) + (i4 << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        this.m = aqu;
        window.setCallback(aqu);
        Context context = this.l;
        int i7 = a;
        int i8 = i7 & 65;
        int i9 = (((i7 ^ 65) | i8) << 1) - ((i7 | 65) & (~i8));
        b = i9 % 128;
        B bD = i9 % 2 != 0 ? B.d(context, null, f) : B.d(context, null, f);
        Drawable drawableM = bD.m(0);
        int i10 = a;
        int i11 = (i10 ^ 79) + ((i10 & 79) << 1);
        int i12 = i11 % 128;
        b = i12;
        if (i11 % 2 != 0) {
            throw null;
        }
        if (drawableM != null) {
            int i13 = i12 ^ 111;
            int i14 = (i12 & 111) << 1;
            int i15 = (i13 ^ i14) + ((i13 & i14) << 1);
            a = i15 % 128;
            int i16 = i15 % 2;
            window.setBackgroundDrawable(drawableM);
            int i17 = a + 121;
            b = i17 % 128;
            if (i17 % 2 != 0) {
                int i18 = 3 % 5;
            }
        }
        bD.d.recycle();
        this.k = window;
        int i19 = a + 7;
        b = i19 % 128;
        int i20 = i19 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    /* JADX WARN: Code duplicated, block: B:13:0x0044  */
    /* JADX WARN: Code duplicated, block: B:16:0x004c  */
    /* JADX WARN: Code duplicated, block: B:18:0x0050 A[PHI: r5
  0x0050: PHI (r5v23 ivas.gov.bisp.enumeration.k.s) = (r5v22 ivas.gov.bisp.enumeration.k.s), (r5v24 ivas.gov.bisp.enumeration.k.s) binds: [B:17:0x004e, B:14:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0061  */
    /* JADX WARN: Code duplicated, block: B:22:0x0067  */
    /* JADX WARN: Code duplicated, block: B:24:0x0076  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:46:0x0102  */
    /* JADX WARN: Code duplicated, block: B:55:0x012a  */
    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    public void I(aQz aqz, boolean z) {
        int i;
        ViewGroup viewGroup;
        int i2;
        int i3;
        int i4;
        InterfaceC0320s interfaceC0320s;
        int i5;
        int i6 = 2 % 2;
        int i7 = b;
        int i8 = i7 ^ 65;
        int i9 = ((((i7 & 65) | i8) << 1) - (~(-i8))) - 1;
        a = i9 % 128;
        Object obj = null;
        if (i9 % 2 == 0) {
            int i10 = 85 / 0;
            if (!(!z)) {
                if (aqz.d == 0) {
                    i3 = a;
                    int i11 = ((i3 ^ 15) | (i3 & 15)) << 1;
                    int i12 = -((i3 & (-16)) | ((~i3) & 15));
                    i4 = (i11 & i12) + (i11 | i12);
                    b = i4 % 128;
                    if (i4 % 2 != 0) {
                        interfaceC0320s = this.q;
                        int i13 = 19 / 0;
                        if (interfaceC0320s != null) {
                            int i14 = i3 & 35;
                            int i15 = (i3 ^ 35) | i14;
                            i5 = ((i14 | i15) << 1) - (i15 ^ i14);
                            b = i5 % 128;
                            if (i5 % 2 == 0) {
                                interfaceC0320s.c();
                                obj.hashCode();
                                throw null;
                            }
                            if (interfaceC0320s.c()) {
                                F(aqz.k);
                                int i16 = a + 87;
                                b = i16 % 128;
                                int i17 = i16 % 2;
                                return;
                            }
                        }
                    } else {
                        interfaceC0320s = this.q;
                        if (interfaceC0320s != null) {
                            int i18 = i3 & 35;
                            int i19 = (i3 ^ 35) | i18;
                            i5 = ((i18 | i19) << 1) - (i19 ^ i18);
                            b = i5 % 128;
                            if (i5 % 2 == 0) {
                                interfaceC0320s.c();
                                obj.hashCode();
                                throw null;
                            }
                            if (interfaceC0320s.c()) {
                                F(aqz.k);
                                int i110 = a + 87;
                                b = i110 % 128;
                                int i111 = i110 % 2;
                                return;
                            }
                        }
                    }
                }
            }
        } else if (!(!z)) {
            if (aqz.d == 0) {
                i3 = a;
                int i112 = ((i3 ^ 15) | (i3 & 15)) << 1;
                int i113 = -((i3 & (-16)) | ((~i3) & 15));
                i4 = (i112 & i113) + (i112 | i113);
                b = i4 % 128;
                if (i4 % 2 != 0) {
                    interfaceC0320s = this.q;
                    int i114 = 19 / 0;
                    if (interfaceC0320s != null) {
                        int i115 = i3 & 35;
                        int i116 = (i3 ^ 35) | i115;
                        i5 = ((i115 | i116) << 1) - (i116 ^ i115);
                        b = i5 % 128;
                        if (i5 % 2 == 0) {
                            interfaceC0320s.c();
                            obj.hashCode();
                            throw null;
                        }
                        if (interfaceC0320s.c()) {
                            F(aqz.k);
                            int i117 = a + 87;
                            b = i117 % 128;
                            int i118 = i117 % 2;
                            return;
                        }
                    }
                } else {
                    interfaceC0320s = this.q;
                    if (interfaceC0320s != null) {
                        int i119 = i3 & 35;
                        int i1110 = (i3 ^ 35) | i119;
                        i5 = ((i119 | i1110) << 1) - (i1110 ^ i119);
                        b = i5 % 128;
                        if (i5 % 2 == 0) {
                            interfaceC0320s.c();
                            obj.hashCode();
                            throw null;
                        }
                        if (interfaceC0320s.c()) {
                            F(aqz.k);
                            int i1111 = a + 87;
                            b = i1111 % 128;
                            int i1112 = i1111 % 2;
                            return;
                        }
                    }
                }
            }
        }
        WindowManager windowManager = (WindowManager) this.l.getSystemService("window");
        if (windowManager != null) {
            int i20 = a;
            int i21 = ((i20 ^ 49) | (i20 & 49)) << 1;
            int i22 = -(((~i20) & 49) | (i20 & (-50)));
            int i23 = (i21 & i22) + (i22 | i21);
            b = i23 % 128;
            if (i23 % 2 != 0) {
                int i24 = 88 / 0;
                if (aqz.p) {
                    int i25 = b;
                    i = (-2) - (((i25 ^ 116) + ((i25 & 116) << 1)) ^ (-1));
                    a = i % 128;
                    if (i % 2 != 0) {
                        ViewGroup viewGroup2 = aqz.i;
                        obj.hashCode();
                        throw null;
                    }
                    viewGroup = aqz.i;
                    if (viewGroup != null) {
                        int i26 = b;
                        int i27 = (i26 | 119) << 1;
                        int i28 = -(((~i26) & 119) | (i26 & (-120)));
                        int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
                        a = i29 % 128;
                        int i30 = i29 % 2;
                        windowManager.removeView(viewGroup);
                        if (z) {
                            int i31 = a;
                            int i32 = (i31 ^ 26) + ((i31 & 26) << 1);
                            i2 = (i32 ^ (-1)) + (i32 << 1);
                            b = i2 % 128;
                            if (i2 % 2 == 0) {
                                E(aqz.d, aqz, null);
                                throw null;
                            }
                            E(aqz.d, aqz, null);
                        }
                    }
                }
            } else if (aqz.p) {
                int i210 = b;
                i = (-2) - (((i210 ^ 116) + ((i210 & 116) << 1)) ^ (-1));
                a = i % 128;
                if (i % 2 != 0) {
                    ViewGroup viewGroup3 = aqz.i;
                    obj.hashCode();
                    throw null;
                }
                viewGroup = aqz.i;
                if (viewGroup != null) {
                    int i211 = b;
                    int i212 = (i211 | 119) << 1;
                    int i213 = -(((~i211) & 119) | (i211 & (-120)));
                    int i214 = ((i212 | i213) << 1) - (i213 ^ i212);
                    a = i214 % 128;
                    int i33 = i214 % 2;
                    windowManager.removeView(viewGroup);
                    if (z) {
                        int i34 = a;
                        int i35 = (i34 ^ 26) + ((i34 & 26) << 1);
                        i2 = (i35 ^ (-1)) + (i35 << 1);
                        b = i2 % 128;
                        if (i2 % 2 == 0) {
                            E(aqz.d, aqz, null);
                            throw null;
                        }
                        E(aqz.d, aqz, null);
                    }
                }
            }
        }
        aqz.m = false;
        aqz.n = false;
        aqz.p = false;
        int i36 = a + 65;
        b = i36 % 128;
        if (i36 % 2 != 0) {
            aqz.h = null;
            aqz.f98o = false;
            if (this.O == aqz) {
                this.O = null;
                int i37 = b;
                int i38 = i37 & 55;
                int i39 = (i37 ^ 55) | i38;
                int i40 = ((i38 | i39) << 1) - (i39 ^ i38);
                a = i40 % 128;
                int i41 = i40 % 2;
            }
        } else {
            aqz.h = null;
            aqz.f98o = true;
            if (this.O == aqz) {
                this.O = null;
                int i310 = b;
                int i311 = i310 & 55;
                int i312 = (i310 ^ 55) | i311;
                int i42 = ((i311 | i312) << 1) - (i312 ^ i311);
                a = i42 % 128;
                int i43 = i42 % 2;
            }
        }
        int i44 = (-2) - ((a + 76) ^ (-1));
        b = i44 % 128;
        int i45 = i44 % 2;
    }

    public final void T() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 73) | (i2 & 73)) << 1;
        int i4 = -(((~i2) & 73) | (i2 & (-74)));
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        M();
        Object obj = null;
        if (this.F) {
            int i7 = b;
            int i8 = i7 ^ 13;
            int i9 = -(-((i7 & 13) << 1));
            int i10 = (i8 ^ i9) + ((i8 & i9) << 1);
            a = i10 % 128;
            int i11 = i10 % 2;
            if (this.i == null) {
                int i12 = i7 & 17;
                int i13 = (i7 ^ 17) | i12;
                int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
                a = i14 % 128;
                int i15 = i14 % 2;
                Object obj2 = this.j;
                if (obj2 instanceof Activity) {
                    v vVar = new v((Activity) this.j, this.H);
                    int i16 = b;
                    int i17 = (i16 ^ 61) + ((i16 & 61) << 1);
                    int i18 = i17 % 128;
                    a = i18;
                    if (i17 % 2 == 0) {
                        this.i = vVar;
                        throw null;
                    }
                    this.i = vVar;
                    int i19 = ((i18 ^ 113) | (i18 & 113)) << 1;
                    int i20 = -(((~i18) & 113) | (i18 & (-114)));
                    int i21 = (i19 ^ i20) + ((i19 & i20) << 1);
                    b = i21 % 128;
                    int i22 = i21 % 2;
                } else if (obj2 instanceof Dialog) {
                    v vVar2 = new v((Dialog) this.j);
                    int i23 = b + 9;
                    a = i23 % 128;
                    if (i23 % 2 == 0) {
                        this.i = vVar2;
                        obj.hashCode();
                        throw null;
                    }
                    this.i = vVar2;
                }
                z zVar = this.i;
                if (zVar != null) {
                    int i24 = b;
                    int i25 = i24 & 43;
                    int i26 = (i24 | 43) & (~i25);
                    int i27 = -(-(i25 << 1));
                    int i28 = ((i26 | i27) << 1) - (i26 ^ i27);
                    a = i28 % 128;
                    if (i28 % 2 == 0) {
                        zVar.n(this.aa);
                        int i29 = 82 / 0;
                    } else {
                        zVar.n(this.aa);
                    }
                }
            }
        }
        int i30 = b;
        int i31 = ((i30 ^ 6) + ((i30 & 6) << 1)) - 1;
        a = i31 % 128;
        if (i31 % 2 == 0) {
            throw null;
        }
    }

    public int U(Context context, int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 111;
        int i5 = i4 + ((i3 ^ 111) | i4);
        int i6 = i5 % 128;
        a = i6;
        int i7 = i5 % 2;
        if (i == -100) {
            int i8 = i6 + 81;
            b = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 63 / 0;
            }
            return -1;
        }
        int i10 = ((i3 | 25) << 1) - (i3 ^ 25);
        a = i10 % 128;
        int i11 = i10 % 2;
        if (i != -1) {
            int i12 = i3 + 81;
            a = i12 % 128;
            Object obj = null;
            if (i12 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (i == 0) {
                UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
                int i13 = b;
                int i14 = i13 ^ 21;
                int i15 = ((((i13 & 21) | i14) << 1) - (~(-i14))) - 1;
                a = i15 % 128;
                int i16 = i15 % 2;
                if (uiModeManager.getNightMode() != 0) {
                    int iE = P(context).e();
                    int i17 = b;
                    int i18 = i17 & 47;
                    int i19 = ((i17 | 47) & (~i18)) + (i18 << 1);
                    a = i19 % 128;
                    if (i19 % 2 != 0) {
                        return iE;
                    }
                    throw null;
                }
                int i20 = a;
                int i21 = (i20 & 55) + (i20 | 55);
                int i22 = i21 % 128;
                b = i22;
                int i23 = i21 % 2;
                int i24 = i22 ^ 17;
                int i25 = ((((i22 & 17) | i24) << 1) - (~(-i24))) - 1;
                a = i25 % 128;
                int i26 = i25 % 2;
                return -1;
            }
            if (i != 1) {
                int i27 = ((i3 | 86) << 1) - (i3 ^ 86);
                int i28 = (i27 ^ (-1)) + (i27 << 1);
                int i29 = i28 % 128;
                a = i29;
                int i30 = i28 % 2;
                if (i != 2) {
                    int i31 = ((i29 ^ 98) + ((i29 & 98) << 1)) - 1;
                    b = i31 % 128;
                    if (i31 % 2 == 0 ? i != 3 : i != 2) {
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                    int i32 = i29 & 97;
                    int i33 = (((i29 ^ 97) | i32) << 1) - ((~i32) & (i29 | 97));
                    b = i33 % 128;
                    if (i33 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                    if (this.Y == null) {
                        this.Y = new aQw(context);
                        int i34 = b;
                        int i35 = ((i34 | 63) << 1) - (i34 ^ 63);
                        a = i35 % 128;
                        int i36 = i35 % 2;
                    }
                    int iE2 = this.Y.e();
                    int i37 = a;
                    int i38 = ((i37 ^ 44) + ((i37 & 44) << 1)) - 1;
                    b = i38 % 128;
                    int i39 = i38 % 2;
                    return iE2;
                }
            }
        }
        int i40 = i3 & 107;
        int i41 = (i40 - (~(-(-((i3 ^ 107) | i40))))) - 1;
        a = i41 % 128;
        if (i41 % 2 == 0) {
            int i42 = 73 / 0;
        }
        return i;
    }

    @Override // ivas.gov.bisp.enumeration.p087j.a
    public void w(View view) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 27;
        int i4 = (i2 | 27) & (~i3);
        int i5 = i3 << 1;
        int i6 = (i4 & i5) + (i4 | i5);
        a = i6 % 128;
        int i7 = i6 % 2;
        M();
        View viewFindViewById = this.B.findViewById(android.R.id.content);
        int i8 = a;
        int i9 = i8 & 73;
        int i10 = -(-((i8 ^ 73) | i9));
        int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
        b = i11 % 128;
        Object obj = null;
        if (i11 % 2 != 0) {
            ViewGroup viewGroup = (ViewGroup) viewFindViewById;
            viewGroup.removeAllViews();
            viewGroup.addView(view);
            obj.hashCode();
            throw null;
        }
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById;
        viewGroup2.removeAllViews();
        viewGroup2.addView(view);
        this.m.c.onContentChanged();
        int i12 = a;
        int i13 = i12 & 73;
        int i14 = (i12 ^ 73) | i13;
        int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
        b = i15 % 128;
        if (i15 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p087j.a
    public void x(View view, ViewGroup.LayoutParams layoutParams) {
        View viewFindViewById;
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & 103) - (~(-(-(i2 | 103))))) - 1;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            M();
            viewFindViewById = this.B.findViewById(android.R.id.content);
            int i4 = 64 / 0;
        } else {
            M();
            viewFindViewById = this.B.findViewById(android.R.id.content);
        }
        ViewGroup viewGroup = (ViewGroup) viewFindViewById;
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        int i5 = b;
        int i6 = i5 & 63;
        int i7 = ((i5 | 63) & (~i6)) + (i6 << 1);
        a = i7 % 128;
        int i8 = i7 % 2;
        this.m.c.onContentChanged();
        int i9 = a;
        int i10 = (-2) - ((((i9 | 62) << 1) - (i9 ^ 62)) ^ (-1));
        b = i10 % 128;
        if (i10 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final aQv P(Context context) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 97;
        int i4 = -(-((i2 ^ 97) | i3));
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        b = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (this.W == null) {
            int i6 = i2 + 31;
            b = i6 % 128;
            int i7 = i6 % 2;
            if (R.a == null) {
                Context applicationContext = context.getApplicationContext();
                R r = new R(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
                int i8 = b;
                int i9 = i8 & 87;
                int i10 = (i8 ^ 87) | i9;
                int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
                a = i11 % 128;
                if (i11 % 2 == 0) {
                    R.a = r;
                    throw null;
                }
                R.a = r;
            }
            this.W = new aQy(R.a);
            int i12 = a;
            int i13 = (i12 & 7) + (i12 | 7);
            b = i13 % 128;
            int i14 = i13 % 2;
        }
        aQv aqv = this.W;
        int i15 = b;
        int i16 = ((i15 ^ 79) | (i15 & 79)) << 1;
        int i17 = -(((~i15) & 79) | (i15 & (-80)));
        int i18 = (i16 & i17) + (i17 | i16);
        a = i18 % 128;
        if (i18 % 2 != 0) {
            return aqv;
        }
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p087j.a
    public void t(Toolbar toolbar) {
        CharSequence title;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 61;
        a = i3 % 128;
        int i4 = i3 % 2;
        if (!(this.j instanceof Activity)) {
            int i5 = i2 & 1;
            int i6 = i5 + ((i2 ^ 1) | i5);
            a = i6 % 128;
            int i7 = i6 % 2;
            return;
        }
        T();
        z zVar = this.i;
        if (zVar instanceof v) {
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
        int i8 = a;
        int i9 = i8 & 113;
        int i10 = i9 + ((i8 ^ 113) | i9);
        b = i10 % 128;
        int i11 = i10 % 2;
        Object obj = null;
        this.f97o = null;
        if (zVar != null) {
            int i12 = i8 & 5;
            int i13 = -(-((i8 ^ 5) | i12));
            int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
            b = i14 % 128;
            int i15 = i14 % 2;
            zVar.k();
            int i16 = a;
            int i17 = i16 & 93;
            int i18 = (i17 - (~((i16 ^ 93) | i17))) - 1;
            b = i18 % 128;
            int i19 = i18 % 2;
        }
        this.i = null;
        if (toolbar != null) {
            int i20 = a;
            int i21 = i20 & 17;
            int i22 = ((i20 ^ 17) | i21) << 1;
            int i23 = -((~i21) & (i20 | 17));
            int i24 = (i22 & i23) + (i22 | i23);
            int i25 = i24 % 128;
            b = i25;
            int i26 = i24 % 2;
            Object obj2 = this.j;
            if (obj2 instanceof Activity) {
                int i27 = ((i20 | 69) << 1) - (i20 ^ 69);
                b = i27 % 128;
                if (i27 % 2 != 0) {
                    ((Activity) obj2).getTitle();
                    throw null;
                }
                title = ((Activity) obj2).getTitle();
                int i28 = a + 103;
                b = i28 % 128;
                int i29 = i28 % 2;
            } else {
                title = this.p;
                int i30 = ((i25 | 101) << 1) - (i25 ^ 101);
                a = i30 % 128;
                int i31 = i30 % 2;
            }
            S s = new S(toolbar, title, this.m);
            int i32 = a;
            int i33 = i32 & 13;
            int i34 = (((i32 ^ 13) | i33) << 1) - ((i32 | 13) & (~i33));
            b = i34 % 128;
            if (i34 % 2 != 0) {
                this.i = s;
                obj.hashCode();
                throw null;
            }
            this.i = s;
            this.m.d = s.e;
            int i35 = a;
            int i36 = ((i35 & (-56)) | ((~i35) & 55)) + ((i35 & 55) << 1);
            b = i36 % 128;
            int i37 = i36 % 2;
        } else {
            this.m.d = null;
            int i38 = a;
            int i39 = i38 & 63;
            int i40 = i39 + ((i38 ^ 63) | i39);
            b = i40 % 128;
            int i41 = i40 % 2;
        }
        k();
        int i42 = b + 35;
        a = i42 % 128;
        int i43 = i42 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0346  */
    /* JADX WARN: Code duplicated, block: B:105:0x035a  */
    /* JADX WARN: Code duplicated, block: B:107:0x036c  */
    /* JADX WARN: Code duplicated, block: B:109:0x0379  */
    /* JADX WARN: Code duplicated, block: B:110:0x0382  */
    /* JADX WARN: Code duplicated, block: B:113:0x039c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:114:0x039d  */
    /* JADX WARN: Code duplicated, block: B:115:0x039e  */
    /* JADX WARN: Code duplicated, block: B:118:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:121:0x03f4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:122:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:124:0x0407  */
    /* JADX WARN: Code duplicated, block: B:127:0x0422 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:128:0x0424  */
    /* JADX WARN: Code duplicated, block: B:129:0x0437  */
    /* JADX WARN: Code duplicated, block: B:132:0x0442  */
    /* JADX WARN: Code duplicated, block: B:133:0x046a  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:56:0x0142  */
    /* JADX WARN: Code duplicated, block: B:58:0x0146  */
    /* JADX WARN: Code duplicated, block: B:60:0x0153  */
    /* JADX WARN: Code duplicated, block: B:62:0x0157  */
    /* JADX WARN: Code duplicated, block: B:64:0x0166  */
    /* JADX WARN: Code duplicated, block: B:66:0x0178  */
    /* JADX WARN: Code duplicated, block: B:68:0x017c  */
    /* JADX WARN: Code duplicated, block: B:70:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:72:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:73:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:74:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:77:0x0216 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x0218  */
    /* JADX WARN: Code duplicated, block: B:80:0x0223  */
    /* JADX WARN: Code duplicated, block: B:81:0x0232  */
    /* JADX WARN: Code duplicated, block: B:85:0x0258  */
    /* JADX WARN: Code duplicated, block: B:88:0x0293  */
    /* JADX WARN: Code duplicated, block: B:90:0x029a  */
    /* JADX WARN: Code duplicated, block: B:92:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:95:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:97:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:99:0x02f3  */
    public final boolean Z(aQz aqz, KeyEvent keyEvent) {
        boolean z;
        n nVar;
        int i;
        int i2;
        int i3;
        InterfaceC0320s interfaceC0320s;
        int i4;
        int i5;
        InterfaceC0320s interfaceC0320s2;
        Context context;
        int i6;
        TypedValue typedValue;
        Resources.Theme theme;
        Resources.Theme themeNewTheme;
        int i7;
        Resources.Theme themeNewTheme2;
        int i8;
        n nVar2;
        int i9;
        Bundle bundle;
        View view;
        n nVar3;
        int deviceId;
        boolean z2;
        InterfaceC0320s interfaceC0320s3;
        int i10 = 2 % 2;
        int i11 = b;
        int i12 = i11 & 83;
        int i13 = i12 + ((i11 ^ 83) | i12);
        a = i13 % 128;
        Object obj = null;
        if (i13 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (this.S) {
            int i14 = i11 & 111;
            int i15 = (i14 - (~((i11 ^ 111) | i14))) - 1;
            a = i15 % 128;
            if (i15 % 2 != 0) {
                return false;
            }
            throw null;
        }
        if (aqz.m) {
            int i16 = b;
            int i17 = (((i16 | 62) << 1) - (i16 ^ 62)) - 1;
            int i18 = i17 % 128;
            a = i18;
            int i19 = i17 % 2;
            int i20 = i18 & 59;
            int i21 = -(-((i18 ^ 59) | i20));
            int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
            b = i22 % 128;
            int i23 = i22 % 2;
            return true;
        }
        aQz aqz2 = this.O;
        if (aqz2 != null) {
            int i24 = a + 121;
            b = i24 % 128;
            if (i24 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (aqz2 != aqz) {
                I(aqz2, false);
            }
        }
        Window.Callback callbackG = G();
        if (callbackG != null) {
            int i25 = a;
            int i26 = i25 & 13;
            int i27 = (i25 ^ 13) | i26;
            int i28 = (i26 & i27) + (i27 | i26);
            b = i28 % 128;
            if (i28 % 2 != 0) {
                aqz.j = callbackG.onCreatePanelView(aqz.d);
                int i29 = 52 / 0;
            } else {
                aqz.j = callbackG.onCreatePanelView(aqz.d);
            }
        }
        int i30 = aqz.d;
        if (i30 != 0) {
            int i31 = b;
            int i32 = (((i31 | 84) << 1) - (i31 ^ 84)) - 1;
            a = i32 % 128;
            if (i32 % 2 != 0 ? i30 == 108 : i30 == 119) {
                z = true;
            } else {
                int i33 = i31 & 77;
                int i34 = (i31 | 77) & (~i33);
                int i35 = i33 << 1;
                int i36 = (i34 ^ i35) + ((i35 & i34) << 1);
                int i37 = i36 % 128;
                a = i37;
                int i38 = i36 % 2;
                int i39 = i37 & 53;
                int i40 = i39 + ((i37 ^ 53) | i39);
                b = i40 % 128;
                if (i40 % 2 != 0) {
                    int i41 = 4 % 2;
                }
                z = false;
            }
        } else {
            z = true;
        }
        if (z) {
            int i42 = (-2) - ((a + 112) ^ (-1));
            int i43 = i42 % 128;
            b = i43;
            int i44 = i42 % 2;
            InterfaceC0320s interfaceC0320s4 = this.q;
            if (interfaceC0320s4 != null) {
                int i45 = i43 & 15;
                int i46 = ((((i43 ^ 15) | i45) << 1) - (~(-((i43 | 15) & (~i45))))) - 1;
                a = i46 % 128;
                int i47 = i46 % 2;
                interfaceC0320s4.f();
            }
        }
        if (aqz.j == null) {
            int i48 = a;
            int i49 = i48 & 125;
            int i50 = ((i48 ^ 125) | i49) << 1;
            int i51 = -((~i49) & (i48 | 125));
            int i52 = ((i50 | i51) << 1) - (i50 ^ i51);
            b = i52 % 128;
            int i53 = i52 % 2;
            if (z) {
                int i54 = i48 ^ 21;
                int i55 = (i48 & 21) << 1;
                int i56 = ((i54 | i55) << 1) - (i55 ^ i54);
                b = i56 % 128;
                if (i56 % 2 != 0) {
                    int i57 = 45 / 0;
                    if (!(this.i instanceof S)) {
                        nVar = aqz.k;
                        if (nVar != null) {
                            int i58 = b + 65;
                            a = i58 % 128;
                            int i59 = i58 % 2;
                            if (aqz.q) {
                                if (nVar == null) {
                                    int i60 = a + 51;
                                    b = i60 % 128;
                                    int i61 = i60 % 2;
                                    context = this.l;
                                    i6 = aqz.d;
                                    if (i6 != 0) {
                                        int i62 = b;
                                        int i63 = i62 ^ 91;
                                        int i64 = ((i63 | (i62 & 91)) << 1) - i63;
                                        a = i64 % 128;
                                        int i65 = i64 % 2;
                                        if (i6 == 108) {
                                            if (this.q != null) {
                                                typedValue = new TypedValue();
                                                theme = context.getTheme();
                                                int i66 = b;
                                                int i67 = i66 & 53;
                                                int i68 = (((~i67) & (i66 | 53)) - (~(-(-(i67 << 1))))) - 1;
                                                a = i68 % 128;
                                                int i69 = i68 % 2;
                                                theme.resolveAttribute(ivas.gov.bisp.enumeration.R.attr.actionBarTheme, typedValue, true);
                                                if (typedValue.resourceId != 0) {
                                                    int i70 = a;
                                                    int i71 = i70 ^ 71;
                                                    int i72 = ((i70 & 71) | i71) << 1;
                                                    int i73 = -i71;
                                                    int i74 = ((i72 | i73) << 1) - (i72 ^ i73);
                                                    b = i74 % 128;
                                                    int i75 = i74 % 2;
                                                    themeNewTheme = context.getResources().newTheme();
                                                    themeNewTheme.setTo(theme);
                                                    int i76 = a + 19;
                                                    b = i76 % 128;
                                                    int i77 = i76 % 2;
                                                    themeNewTheme.applyStyle(typedValue.resourceId, true);
                                                    int i78 = b;
                                                    i8 = ((i78 & 94) + (i78 | 94)) - 1;
                                                    a = i8 % 128;
                                                    if (i8 % 2 == 0) {
                                                        themeNewTheme.resolveAttribute(ivas.gov.bisp.enumeration.R.attr.actionBarWidgetTheme, typedValue, false);
                                                    } else {
                                                        themeNewTheme.resolveAttribute(ivas.gov.bisp.enumeration.R.attr.actionBarWidgetTheme, typedValue, true);
                                                    }
                                                } else {
                                                    theme.resolveAttribute(ivas.gov.bisp.enumeration.R.attr.actionBarWidgetTheme, typedValue, true);
                                                    int i79 = a;
                                                    int i80 = (i79 & 14) + (i79 | 14);
                                                    int i81 = (i80 ^ (-1)) + (i80 << 1);
                                                    int i82 = i81 % 128;
                                                    b = i82;
                                                    int i83 = i81 % 2;
                                                    int i84 = i82 & 43;
                                                    int i85 = (i82 | 43) & (~i84);
                                                    int i86 = -(-(i84 << 1));
                                                    int i87 = (i85 ^ i86) + ((i86 & i85) << 1);
                                                    a = i87 % 128;
                                                    int i88 = i87 % 2;
                                                    themeNewTheme = null;
                                                }
                                                if (typedValue.resourceId != 0) {
                                                    if (themeNewTheme == null) {
                                                        i7 = a + 107;
                                                        b = i7 % 128;
                                                        if (i7 % 2 != 0) {
                                                            themeNewTheme2 = context.getResources().newTheme();
                                                            themeNewTheme2.setTo(theme);
                                                            int i89 = 50 / 0;
                                                        } else {
                                                            themeNewTheme2 = context.getResources().newTheme();
                                                            themeNewTheme2.setTo(theme);
                                                        }
                                                        themeNewTheme = themeNewTheme2;
                                                    }
                                                    themeNewTheme.applyStyle(typedValue.resourceId, true);
                                                    int i90 = b;
                                                    int i91 = i90 ^ 27;
                                                    int i92 = ((i90 & 27) | i91) << 1;
                                                    int i93 = -i91;
                                                    int i94 = (i92 ^ i93) + ((i92 & i93) << 1);
                                                    a = i94 % 128;
                                                    int i95 = i94 % 2;
                                                }
                                                if (themeNewTheme != null) {
                                                    h hVar = new h(context, 0);
                                                    int i96 = a;
                                                    int i97 = i96 & 65;
                                                    int i98 = (i96 | 65) & (~i97);
                                                    int i99 = i97 << 1;
                                                    int i100 = ((i98 | i99) << 1) - (i98 ^ i99);
                                                    b = i100 % 128;
                                                    int i101 = i100 % 2;
                                                    hVar.getTheme().setTo(themeNewTheme);
                                                    context = hVar;
                                                }
                                            }
                                        }
                                    } else if (this.q != null) {
                                        typedValue = new TypedValue();
                                        theme = context.getTheme();
                                        int i610 = b;
                                        int i611 = i610 & 53;
                                        int i612 = (((~i611) & (i610 | 53)) - (~(-(-(i611 << 1))))) - 1;
                                        a = i612 % 128;
                                        int i613 = i612 % 2;
                                        theme.resolveAttribute(ivas.gov.bisp.enumeration.R.attr.actionBarTheme, typedValue, true);
                                        if (typedValue.resourceId != 0) {
                                            int i710 = a;
                                            int i711 = i710 ^ 71;
                                            int i712 = ((i710 & 71) | i711) << 1;
                                            int i713 = -i711;
                                            int i714 = ((i712 | i713) << 1) - (i712 ^ i713);
                                            b = i714 % 128;
                                            int i715 = i714 % 2;
                                            themeNewTheme = context.getResources().newTheme();
                                            themeNewTheme.setTo(theme);
                                            int i716 = a + 19;
                                            b = i716 % 128;
                                            int i717 = i716 % 2;
                                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                                            int i718 = b;
                                            i8 = ((i718 & 94) + (i718 | 94)) - 1;
                                            a = i8 % 128;
                                            if (i8 % 2 == 0) {
                                                themeNewTheme.resolveAttribute(ivas.gov.bisp.enumeration.R.attr.actionBarWidgetTheme, typedValue, false);
                                            } else {
                                                themeNewTheme.resolveAttribute(ivas.gov.bisp.enumeration.R.attr.actionBarWidgetTheme, typedValue, true);
                                            }
                                        } else {
                                            theme.resolveAttribute(ivas.gov.bisp.enumeration.R.attr.actionBarWidgetTheme, typedValue, true);
                                            int i719 = a;
                                            int i810 = (i719 & 14) + (i719 | 14);
                                            int i811 = (i810 ^ (-1)) + (i810 << 1);
                                            int i812 = i811 % 128;
                                            b = i812;
                                            int i813 = i811 % 2;
                                            int i814 = i812 & 43;
                                            int i815 = (i812 | 43) & (~i814);
                                            int i816 = -(-(i814 << 1));
                                            int i817 = (i815 ^ i816) + ((i816 & i815) << 1);
                                            a = i817 % 128;
                                            int i818 = i817 % 2;
                                            themeNewTheme = null;
                                        }
                                        if (typedValue.resourceId != 0) {
                                            if (themeNewTheme == null) {
                                                i7 = a + 107;
                                                b = i7 % 128;
                                                if (i7 % 2 != 0) {
                                                    themeNewTheme2 = context.getResources().newTheme();
                                                    themeNewTheme2.setTo(theme);
                                                    int i819 = 50 / 0;
                                                } else {
                                                    themeNewTheme2 = context.getResources().newTheme();
                                                    themeNewTheme2.setTo(theme);
                                                }
                                                themeNewTheme = themeNewTheme2;
                                            }
                                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                                            int i910 = b;
                                            int i911 = i910 ^ 27;
                                            int i912 = ((i910 & 27) | i911) << 1;
                                            int i913 = -i911;
                                            int i914 = (i912 ^ i913) + ((i912 & i913) << 1);
                                            a = i914 % 128;
                                            int i915 = i914 % 2;
                                        }
                                        if (themeNewTheme != null) {
                                            h hVar2 = new h(context, 0);
                                            int i916 = a;
                                            int i917 = i916 & 65;
                                            int i918 = (i916 | 65) & (~i917);
                                            int i919 = i917 << 1;
                                            int i102 = ((i918 | i919) << 1) - (i918 ^ i919);
                                            b = i102 % 128;
                                            int i103 = i102 % 2;
                                            hVar2.getTheme().setTo(themeNewTheme);
                                            context = hVar2;
                                        }
                                    }
                                    nVar2 = new n(context);
                                    nVar2.h = this;
                                    int i104 = a;
                                    int i105 = i104 & 93;
                                    int i106 = (i104 | 93) & (~i105);
                                    int i107 = i105 << 1;
                                    i9 = ((i106 | i107) << 1) - (i106 ^ i107);
                                    b = i9 % 128;
                                    if (i9 % 2 == 0) {
                                        aqz.c(nVar2);
                                        n nVar4 = aqz.k;
                                        throw null;
                                    }
                                    aqz.c(nVar2);
                                    if (aqz.k == null) {
                                        int i108 = a;
                                        int i109 = i108 & 105;
                                        int i110 = ((i108 ^ 105) | i109) << 1;
                                        int i111 = -((~i109) & (i108 | 105));
                                        int i112 = (i110 & i111) + (i110 | i111);
                                        b = i112 % 128;
                                        int i113 = i112 % 2;
                                        int i114 = i108 & 61;
                                        int i115 = (((i108 ^ 61) | i114) << 1) - ((i108 | 61) & (~i114));
                                        b = i115 % 128;
                                        int i116 = i115 % 2;
                                        return false;
                                    }
                                }
                                if (z) {
                                    int i117 = a;
                                    int i118 = i117 & 51;
                                    int i119 = (i118 - (~((i117 ^ 51) | i118))) - 1;
                                    i5 = i119 % 128;
                                    b = i5;
                                    int i120 = i119 % 2;
                                    interfaceC0320s2 = this.q;
                                    if (interfaceC0320s2 != null) {
                                        int i121 = (i5 & (-14)) | ((~i5) & 13);
                                        int i122 = (i5 & 13) << 1;
                                        int i123 = (i121 ^ i122) + ((i122 & i121) << 1);
                                        a = i123 % 128;
                                        int i124 = i123 % 2;
                                        if (this.s == null) {
                                            this.s = new aQo();
                                            int i125 = a;
                                            int i126 = i125 & 63;
                                            int i127 = (i126 - (~(-(-((i125 ^ 63) | i126))))) - 1;
                                            b = i127 % 128;
                                            int i128 = i127 % 2;
                                        }
                                        interfaceC0320s2.b(aqz.k, this.s);
                                        int i129 = b;
                                        int i130 = ((i129 | 34) << 1) - (i129 ^ 34);
                                        int i131 = (i130 ^ (-1)) + (i130 << 1);
                                        a = i131 % 128;
                                        int i132 = i131 % 2;
                                    }
                                }
                                aqz.k.A();
                                i = aqz.d;
                                int i133 = b;
                                int i134 = (i133 | 65) << 1;
                                int i135 = -(((~i133) & 65) | (i133 & (-66)));
                                int i136 = (i134 & i135) + (i135 | i134);
                                a = i136 % 128;
                                int i137 = i136 % 2;
                                if (!callbackG.onCreatePanelMenu(i, aqz.k)) {
                                    int i138 = b;
                                    int i139 = ((i138 | 47) << 1) - (i138 ^ 47);
                                    a = i139 % 128;
                                    int i140 = i139 % 2;
                                    aqz.c(null);
                                    if (!(!z)) {
                                        int i141 = b;
                                        int i142 = ((i141 ^ 112) + ((i141 & 112) << 1)) - 1;
                                        i3 = i142 % 128;
                                        a = i3;
                                        int i143 = i142 % 2;
                                        interfaceC0320s = this.q;
                                        if (interfaceC0320s != null) {
                                            i4 = ((i3 & 60) + (i3 | 60)) - 1;
                                            b = i4 % 128;
                                            if (i4 % 2 != 0) {
                                                interfaceC0320s.b(null, this.s);
                                                int i144 = 18 / 0;
                                            } else {
                                                interfaceC0320s.b(null, this.s);
                                            }
                                        }
                                    }
                                    int i145 = a;
                                    int i146 = i145 & 5;
                                    int i147 = -(-((i145 ^ 5) | i146));
                                    i2 = ((i146 | i147) << 1) - (i147 ^ i146);
                                    b = i2 % 128;
                                    if (i2 % 2 == 0) {
                                        return false;
                                    }
                                    throw null;
                                }
                                aqz.q = false;
                                int i148 = a + 77;
                                b = i148 % 128;
                                int i149 = i148 % 2;
                            }
                        } else {
                            if (nVar == null) {
                                int i614 = a + 51;
                                b = i614 % 128;
                                int i615 = i614 % 2;
                                context = this.l;
                                i6 = aqz.d;
                                if (i6 != 0) {
                                    int i616 = b;
                                    int i617 = i616 ^ 91;
                                    int i618 = ((i617 | (i616 & 91)) << 1) - i617;
                                    a = i618 % 128;
                                    int i619 = i618 % 2;
                                    if (i6 == 108) {
                                        if (this.q != null) {
                                            typedValue = new TypedValue();
                                            theme = context.getTheme();
                                            int i6110 = b;
                                            int i6111 = i6110 & 53;
                                            int i6112 = (((~i6111) & (i6110 | 53)) - (~(-(-(i6111 << 1))))) - 1;
                                            a = i6112 % 128;
                                            int i6113 = i6112 % 2;
                                            theme.resolveAttribute(ivas.gov.bisp.enumeration.R.attr.actionBarTheme, typedValue, true);
                                            if (typedValue.resourceId != 0) {
                                                int i7110 = a;
                                                int i7111 = i7110 ^ 71;
                                                int i7112 = ((i7110 & 71) | i7111) << 1;
                                                int i7113 = -i7111;
                                                int i7114 = ((i7112 | i7113) << 1) - (i7112 ^ i7113);
                                                b = i7114 % 128;
                                                int i7115 = i7114 % 2;
                                                themeNewTheme = context.getResources().newTheme();
                                                themeNewTheme.setTo(theme);
                                                int i7116 = a + 19;
                                                b = i7116 % 128;
                                                int i7117 = i7116 % 2;
                                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                                                int i7118 = b;
                                                i8 = ((i7118 & 94) + (i7118 | 94)) - 1;
                                                a = i8 % 128;
                                                if (i8 % 2 == 0) {
                                                    themeNewTheme.resolveAttribute(ivas.gov.bisp.enumeration.R.attr.actionBarWidgetTheme, typedValue, false);
                                                } else {
                                                    themeNewTheme.resolveAttribute(ivas.gov.bisp.enumeration.R.attr.actionBarWidgetTheme, typedValue, true);
                                                }
                                            } else {
                                                theme.resolveAttribute(ivas.gov.bisp.enumeration.R.attr.actionBarWidgetTheme, typedValue, true);
                                                int i7119 = a;
                                                int i8110 = (i7119 & 14) + (i7119 | 14);
                                                int i8111 = (i8110 ^ (-1)) + (i8110 << 1);
                                                int i8112 = i8111 % 128;
                                                b = i8112;
                                                int i8113 = i8111 % 2;
                                                int i8114 = i8112 & 43;
                                                int i8115 = (i8112 | 43) & (~i8114);
                                                int i8116 = -(-(i8114 << 1));
                                                int i8117 = (i8115 ^ i8116) + ((i8116 & i8115) << 1);
                                                a = i8117 % 128;
                                                int i8118 = i8117 % 2;
                                                themeNewTheme = null;
                                            }
                                            if (typedValue.resourceId != 0) {
                                                if (themeNewTheme == null) {
                                                    i7 = a + 107;
                                                    b = i7 % 128;
                                                    if (i7 % 2 != 0) {
                                                        themeNewTheme2 = context.getResources().newTheme();
                                                        themeNewTheme2.setTo(theme);
                                                        int i8119 = 50 / 0;
                                                    } else {
                                                        themeNewTheme2 = context.getResources().newTheme();
                                                        themeNewTheme2.setTo(theme);
                                                    }
                                                    themeNewTheme = themeNewTheme2;
                                                }
                                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                                                int i9110 = b;
                                                int i9111 = i9110 ^ 27;
                                                int i9112 = ((i9110 & 27) | i9111) << 1;
                                                int i9113 = -i9111;
                                                int i9114 = (i9112 ^ i9113) + ((i9112 & i9113) << 1);
                                                a = i9114 % 128;
                                                int i9115 = i9114 % 2;
                                            }
                                            if (themeNewTheme != null) {
                                                h hVar3 = new h(context, 0);
                                                int i9116 = a;
                                                int i9117 = i9116 & 65;
                                                int i9118 = (i9116 | 65) & (~i9117);
                                                int i9119 = i9117 << 1;
                                                int i1010 = ((i9118 | i9119) << 1) - (i9118 ^ i9119);
                                                b = i1010 % 128;
                                                int i1011 = i1010 % 2;
                                                hVar3.getTheme().setTo(themeNewTheme);
                                                context = hVar3;
                                            }
                                        }
                                    }
                                } else if (this.q != null) {
                                    typedValue = new TypedValue();
                                    theme = context.getTheme();
                                    int i6114 = b;
                                    int i6115 = i6114 & 53;
                                    int i6116 = (((~i6115) & (i6114 | 53)) - (~(-(-(i6115 << 1))))) - 1;
                                    a = i6116 % 128;
                                    int i6117 = i6116 % 2;
                                    theme.resolveAttribute(ivas.gov.bisp.enumeration.R.attr.actionBarTheme, typedValue, true);
                                    if (typedValue.resourceId != 0) {
                                        int i71110 = a;
                                        int i71111 = i71110 ^ 71;
                                        int i71112 = ((i71110 & 71) | i71111) << 1;
                                        int i71113 = -i71111;
                                        int i71114 = ((i71112 | i71113) << 1) - (i71112 ^ i71113);
                                        b = i71114 % 128;
                                        int i71115 = i71114 % 2;
                                        themeNewTheme = context.getResources().newTheme();
                                        themeNewTheme.setTo(theme);
                                        int i71116 = a + 19;
                                        b = i71116 % 128;
                                        int i71117 = i71116 % 2;
                                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                                        int i71118 = b;
                                        i8 = ((i71118 & 94) + (i71118 | 94)) - 1;
                                        a = i8 % 128;
                                        if (i8 % 2 == 0) {
                                            themeNewTheme.resolveAttribute(ivas.gov.bisp.enumeration.R.attr.actionBarWidgetTheme, typedValue, false);
                                        } else {
                                            themeNewTheme.resolveAttribute(ivas.gov.bisp.enumeration.R.attr.actionBarWidgetTheme, typedValue, true);
                                        }
                                    } else {
                                        theme.resolveAttribute(ivas.gov.bisp.enumeration.R.attr.actionBarWidgetTheme, typedValue, true);
                                        int i71119 = a;
                                        int i81110 = (i71119 & 14) + (i71119 | 14);
                                        int i81111 = (i81110 ^ (-1)) + (i81110 << 1);
                                        int i81112 = i81111 % 128;
                                        b = i81112;
                                        int i81113 = i81111 % 2;
                                        int i81114 = i81112 & 43;
                                        int i81115 = (i81112 | 43) & (~i81114);
                                        int i81116 = -(-(i81114 << 1));
                                        int i81117 = (i81115 ^ i81116) + ((i81116 & i81115) << 1);
                                        a = i81117 % 128;
                                        int i81118 = i81117 % 2;
                                        themeNewTheme = null;
                                    }
                                    if (typedValue.resourceId != 0) {
                                        if (themeNewTheme == null) {
                                            i7 = a + 107;
                                            b = i7 % 128;
                                            if (i7 % 2 != 0) {
                                                themeNewTheme2 = context.getResources().newTheme();
                                                themeNewTheme2.setTo(theme);
                                                int i81119 = 50 / 0;
                                            } else {
                                                themeNewTheme2 = context.getResources().newTheme();
                                                themeNewTheme2.setTo(theme);
                                            }
                                            themeNewTheme = themeNewTheme2;
                                        }
                                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                                        int i91110 = b;
                                        int i91111 = i91110 ^ 27;
                                        int i91112 = ((i91110 & 27) | i91111) << 1;
                                        int i91113 = -i91111;
                                        int i91114 = (i91112 ^ i91113) + ((i91112 & i91113) << 1);
                                        a = i91114 % 128;
                                        int i91115 = i91114 % 2;
                                    }
                                    if (themeNewTheme != null) {
                                        h hVar4 = new h(context, 0);
                                        int i91116 = a;
                                        int i91117 = i91116 & 65;
                                        int i91118 = (i91116 | 65) & (~i91117);
                                        int i91119 = i91117 << 1;
                                        int i1012 = ((i91118 | i91119) << 1) - (i91118 ^ i91119);
                                        b = i1012 % 128;
                                        int i1013 = i1012 % 2;
                                        hVar4.getTheme().setTo(themeNewTheme);
                                        context = hVar4;
                                    }
                                }
                                nVar2 = new n(context);
                                nVar2.h = this;
                                int i1014 = a;
                                int i1015 = i1014 & 93;
                                int i1016 = (i1014 | 93) & (~i1015);
                                int i1017 = i1015 << 1;
                                i9 = ((i1016 | i1017) << 1) - (i1016 ^ i1017);
                                b = i9 % 128;
                                if (i9 % 2 == 0) {
                                    aqz.c(nVar2);
                                    n nVar5 = aqz.k;
                                    throw null;
                                }
                                aqz.c(nVar2);
                                if (aqz.k == null) {
                                    int i1018 = a;
                                    int i1019 = i1018 & 105;
                                    int i1110 = ((i1018 ^ 105) | i1019) << 1;
                                    int i1111 = -((~i1019) & (i1018 | 105));
                                    int i1112 = (i1110 & i1111) + (i1110 | i1111);
                                    b = i1112 % 128;
                                    int i1113 = i1112 % 2;
                                    int i1114 = i1018 & 61;
                                    int i1115 = (((i1018 ^ 61) | i1114) << 1) - ((i1018 | 61) & (~i1114));
                                    b = i1115 % 128;
                                    int i1116 = i1115 % 2;
                                    return false;
                                }
                            }
                            if (z) {
                                int i1117 = a;
                                int i1118 = i1117 & 51;
                                int i1119 = (i1118 - (~((i1117 ^ 51) | i1118))) - 1;
                                i5 = i1119 % 128;
                                b = i5;
                                int i1210 = i1119 % 2;
                                interfaceC0320s2 = this.q;
                                if (interfaceC0320s2 != null) {
                                    int i1211 = (i5 & (-14)) | ((~i5) & 13);
                                    int i1212 = (i5 & 13) << 1;
                                    int i1213 = (i1211 ^ i1212) + ((i1212 & i1211) << 1);
                                    a = i1213 % 128;
                                    int i1214 = i1213 % 2;
                                    if (this.s == null) {
                                        this.s = new aQo();
                                        int i1215 = a;
                                        int i1216 = i1215 & 63;
                                        int i1217 = (i1216 - (~(-(-((i1215 ^ 63) | i1216))))) - 1;
                                        b = i1217 % 128;
                                        int i1218 = i1217 % 2;
                                    }
                                    interfaceC0320s2.b(aqz.k, this.s);
                                    int i1219 = b;
                                    int i1310 = ((i1219 | 34) << 1) - (i1219 ^ 34);
                                    int i1311 = (i1310 ^ (-1)) + (i1310 << 1);
                                    a = i1311 % 128;
                                    int i1312 = i1311 % 2;
                                }
                            }
                            aqz.k.A();
                            i = aqz.d;
                            int i1313 = b;
                            int i1314 = (i1313 | 65) << 1;
                            int i1315 = -(((~i1313) & 65) | (i1313 & (-66)));
                            int i1316 = (i1314 & i1315) + (i1315 | i1314);
                            a = i1316 % 128;
                            int i1317 = i1316 % 2;
                            if (!callbackG.onCreatePanelMenu(i, aqz.k)) {
                                int i1318 = b;
                                int i1319 = ((i1318 | 47) << 1) - (i1318 ^ 47);
                                a = i1319 % 128;
                                int i1410 = i1319 % 2;
                                aqz.c(null);
                                if (!(!z)) {
                                    int i1411 = b;
                                    int i1412 = ((i1411 ^ 112) + ((i1411 & 112) << 1)) - 1;
                                    i3 = i1412 % 128;
                                    a = i3;
                                    int i1413 = i1412 % 2;
                                    interfaceC0320s = this.q;
                                    if (interfaceC0320s != null) {
                                        i4 = ((i3 & 60) + (i3 | 60)) - 1;
                                        b = i4 % 128;
                                        if (i4 % 2 != 0) {
                                            interfaceC0320s.b(null, this.s);
                                            int i1414 = 18 / 0;
                                        } else {
                                            interfaceC0320s.b(null, this.s);
                                        }
                                    }
                                }
                                int i1415 = a;
                                int i1416 = i1415 & 5;
                                int i1417 = -(-((i1415 ^ 5) | i1416));
                                i2 = ((i1416 | i1417) << 1) - (i1417 ^ i1416);
                                b = i2 % 128;
                                if (i2 % 2 == 0) {
                                    return false;
                                }
                                throw null;
                            }
                            aqz.q = false;
                            int i1418 = a + 77;
                            b = i1418 % 128;
                            int i1419 = i1418 % 2;
                        }
                        aqz.k.A();
                        bundle = aqz.r;
                        if (bundle != null) {
                            int i150 = b;
                            int i151 = i150 & 35;
                            int i152 = (i151 - (~(-(-((i150 ^ 35) | i151))))) - 1;
                            a = i152 % 128;
                            int i153 = i152 % 2;
                            aqz.k.w(bundle);
                            aqz.r = null;
                            int i154 = b;
                            int i155 = i154 & 119;
                            int i156 = ((i154 | 119) & (~i155)) + (i155 << 1);
                            a = i156 % 128;
                            int i157 = i156 % 2;
                        }
                        view = aqz.j;
                        nVar3 = aqz.k;
                        int i158 = a;
                        int i159 = (-2) - (((i158 & 38) + (i158 | 38)) ^ (-1));
                        b = i159 % 128;
                        int i160 = i159 % 2;
                        if (!callbackG.onPreparePanel(0, view, nVar3)) {
                            if (z) {
                                int i161 = a;
                                int i162 = ((i161 | 45) << 1) - (i161 ^ 45);
                                b = i162 % 128;
                                int i163 = i162 % 2;
                                interfaceC0320s3 = this.q;
                                if (interfaceC0320s3 != null) {
                                    interfaceC0320s3.b(null, this.s);
                                    int i164 = b;
                                    int i165 = ((i164 & (-8)) | ((~i164) & 7)) + ((i164 & 7) << 1);
                                    a = i165 % 128;
                                    int i166 = i165 % 2;
                                }
                            }
                            aqz.k.v();
                            return false;
                        }
                        if (keyEvent != null) {
                            int i167 = a;
                            int i168 = ((i167 ^ 26) + ((i167 & 26) << 1)) - 1;
                            b = i168 % 128;
                            int i169 = i168 % 2;
                            deviceId = keyEvent.getDeviceId();
                        } else {
                            deviceId = -1;
                        }
                        if (KeyCharacterMap.load(deviceId).getKeyboardType() != 1) {
                            int i170 = a;
                            int i171 = i170 & 113;
                            int i172 = (i171 - (~(-(-((i170 ^ 113) | i171))))) - 1;
                            int i173 = i172 % 128;
                            b = i173;
                            int i174 = i172 % 2;
                            int i175 = (i173 & (-34)) | ((~i173) & 33);
                            int i176 = -(-((i173 & 33) << 1));
                            int i177 = (i175 ^ i176) + ((i176 & i175) << 1);
                            a = i177 % 128;
                            int i178 = i177 % 2;
                            z2 = true;
                        } else {
                            int i179 = a;
                            int i180 = i179 & 3;
                            int i181 = (i180 - (~((i179 ^ 3) | i180))) - 1;
                            b = i181 % 128;
                            int i182 = i181 % 2;
                            z2 = false;
                        }
                        aqz.k.setQwertyMode(z2);
                        aqz.k.v();
                        int i183 = a;
                        int i184 = (i183 ^ 117) + ((i183 & 117) << 1);
                        b = i184 % 128;
                        int i185 = i184 % 2;
                    }
                } else if (!(this.i instanceof S)) {
                    nVar = aqz.k;
                    if (nVar != null) {
                        int i510 = b + 65;
                        a = i510 % 128;
                        int i511 = i510 % 2;
                        if (aqz.q) {
                            if (nVar == null) {
                                int i6118 = a + 51;
                                b = i6118 % 128;
                                int i6119 = i6118 % 2;
                                context = this.l;
                                i6 = aqz.d;
                                if (i6 != 0) {
                                    int i6120 = b;
                                    int i6121 = i6120 ^ 91;
                                    int i6122 = ((i6121 | (i6120 & 91)) << 1) - i6121;
                                    a = i6122 % 128;
                                    int i6123 = i6122 % 2;
                                    if (i6 == 108) {
                                        if (this.q != null) {
                                            typedValue = new TypedValue();
                                            theme = context.getTheme();
                                            int i61110 = b;
                                            int i61111 = i61110 & 53;
                                            int i61112 = (((~i61111) & (i61110 | 53)) - (~(-(-(i61111 << 1))))) - 1;
                                            a = i61112 % 128;
                                            int i61113 = i61112 % 2;
                                            theme.resolveAttribute(ivas.gov.bisp.enumeration.R.attr.actionBarTheme, typedValue, true);
                                            if (typedValue.resourceId != 0) {
                                                int i711110 = a;
                                                int i711111 = i711110 ^ 71;
                                                int i711112 = ((i711110 & 71) | i711111) << 1;
                                                int i711113 = -i711111;
                                                int i711114 = ((i711112 | i711113) << 1) - (i711112 ^ i711113);
                                                b = i711114 % 128;
                                                int i711115 = i711114 % 2;
                                                themeNewTheme = context.getResources().newTheme();
                                                themeNewTheme.setTo(theme);
                                                int i711116 = a + 19;
                                                b = i711116 % 128;
                                                int i711117 = i711116 % 2;
                                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                                                int i711118 = b;
                                                i8 = ((i711118 & 94) + (i711118 | 94)) - 1;
                                                a = i8 % 128;
                                                if (i8 % 2 == 0) {
                                                    themeNewTheme.resolveAttribute(ivas.gov.bisp.enumeration.R.attr.actionBarWidgetTheme, typedValue, false);
                                                } else {
                                                    themeNewTheme.resolveAttribute(ivas.gov.bisp.enumeration.R.attr.actionBarWidgetTheme, typedValue, true);
                                                }
                                            } else {
                                                theme.resolveAttribute(ivas.gov.bisp.enumeration.R.attr.actionBarWidgetTheme, typedValue, true);
                                                int i711119 = a;
                                                int i811110 = (i711119 & 14) + (i711119 | 14);
                                                int i811111 = (i811110 ^ (-1)) + (i811110 << 1);
                                                int i811112 = i811111 % 128;
                                                b = i811112;
                                                int i811113 = i811111 % 2;
                                                int i811114 = i811112 & 43;
                                                int i811115 = (i811112 | 43) & (~i811114);
                                                int i811116 = -(-(i811114 << 1));
                                                int i811117 = (i811115 ^ i811116) + ((i811116 & i811115) << 1);
                                                a = i811117 % 128;
                                                int i811118 = i811117 % 2;
                                                themeNewTheme = null;
                                            }
                                            if (typedValue.resourceId != 0) {
                                                if (themeNewTheme == null) {
                                                    i7 = a + 107;
                                                    b = i7 % 128;
                                                    if (i7 % 2 != 0) {
                                                        themeNewTheme2 = context.getResources().newTheme();
                                                        themeNewTheme2.setTo(theme);
                                                        int i811119 = 50 / 0;
                                                    } else {
                                                        themeNewTheme2 = context.getResources().newTheme();
                                                        themeNewTheme2.setTo(theme);
                                                    }
                                                    themeNewTheme = themeNewTheme2;
                                                }
                                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                                                int i911110 = b;
                                                int i911111 = i911110 ^ 27;
                                                int i911112 = ((i911110 & 27) | i911111) << 1;
                                                int i911113 = -i911111;
                                                int i911114 = (i911112 ^ i911113) + ((i911112 & i911113) << 1);
                                                a = i911114 % 128;
                                                int i911115 = i911114 % 2;
                                            }
                                            if (themeNewTheme != null) {
                                                h hVar5 = new h(context, 0);
                                                int i911116 = a;
                                                int i911117 = i911116 & 65;
                                                int i911118 = (i911116 | 65) & (~i911117);
                                                int i911119 = i911117 << 1;
                                                int i10110 = ((i911118 | i911119) << 1) - (i911118 ^ i911119);
                                                b = i10110 % 128;
                                                int i10111 = i10110 % 2;
                                                hVar5.getTheme().setTo(themeNewTheme);
                                                context = hVar5;
                                            }
                                        }
                                    }
                                } else if (this.q != null) {
                                    typedValue = new TypedValue();
                                    theme = context.getTheme();
                                    int i61114 = b;
                                    int i61115 = i61114 & 53;
                                    int i61116 = (((~i61115) & (i61114 | 53)) - (~(-(-(i61115 << 1))))) - 1;
                                    a = i61116 % 128;
                                    int i61117 = i61116 % 2;
                                    theme.resolveAttribute(ivas.gov.bisp.enumeration.R.attr.actionBarTheme, typedValue, true);
                                    if (typedValue.resourceId != 0) {
                                        int i7111110 = a;
                                        int i7111111 = i7111110 ^ 71;
                                        int i7111112 = ((i7111110 & 71) | i7111111) << 1;
                                        int i7111113 = -i7111111;
                                        int i7111114 = ((i7111112 | i7111113) << 1) - (i7111112 ^ i7111113);
                                        b = i7111114 % 128;
                                        int i7111115 = i7111114 % 2;
                                        themeNewTheme = context.getResources().newTheme();
                                        themeNewTheme.setTo(theme);
                                        int i7111116 = a + 19;
                                        b = i7111116 % 128;
                                        int i7111117 = i7111116 % 2;
                                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                                        int i7111118 = b;
                                        i8 = ((i7111118 & 94) + (i7111118 | 94)) - 1;
                                        a = i8 % 128;
                                        if (i8 % 2 == 0) {
                                            themeNewTheme.resolveAttribute(ivas.gov.bisp.enumeration.R.attr.actionBarWidgetTheme, typedValue, false);
                                        } else {
                                            themeNewTheme.resolveAttribute(ivas.gov.bisp.enumeration.R.attr.actionBarWidgetTheme, typedValue, true);
                                        }
                                    } else {
                                        theme.resolveAttribute(ivas.gov.bisp.enumeration.R.attr.actionBarWidgetTheme, typedValue, true);
                                        int i7111119 = a;
                                        int i8111110 = (i7111119 & 14) + (i7111119 | 14);
                                        int i8111111 = (i8111110 ^ (-1)) + (i8111110 << 1);
                                        int i8111112 = i8111111 % 128;
                                        b = i8111112;
                                        int i8111113 = i8111111 % 2;
                                        int i8111114 = i8111112 & 43;
                                        int i8111115 = (i8111112 | 43) & (~i8111114);
                                        int i8111116 = -(-(i8111114 << 1));
                                        int i8111117 = (i8111115 ^ i8111116) + ((i8111116 & i8111115) << 1);
                                        a = i8111117 % 128;
                                        int i8111118 = i8111117 % 2;
                                        themeNewTheme = null;
                                    }
                                    if (typedValue.resourceId != 0) {
                                        if (themeNewTheme == null) {
                                            i7 = a + 107;
                                            b = i7 % 128;
                                            if (i7 % 2 != 0) {
                                                themeNewTheme2 = context.getResources().newTheme();
                                                themeNewTheme2.setTo(theme);
                                                int i8111119 = 50 / 0;
                                            } else {
                                                themeNewTheme2 = context.getResources().newTheme();
                                                themeNewTheme2.setTo(theme);
                                            }
                                            themeNewTheme = themeNewTheme2;
                                        }
                                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                                        int i9111110 = b;
                                        int i9111111 = i9111110 ^ 27;
                                        int i9111112 = ((i9111110 & 27) | i9111111) << 1;
                                        int i9111113 = -i9111111;
                                        int i9111114 = (i9111112 ^ i9111113) + ((i9111112 & i9111113) << 1);
                                        a = i9111114 % 128;
                                        int i9111115 = i9111114 % 2;
                                    }
                                    if (themeNewTheme != null) {
                                        h hVar6 = new h(context, 0);
                                        int i9111116 = a;
                                        int i9111117 = i9111116 & 65;
                                        int i9111118 = (i9111116 | 65) & (~i9111117);
                                        int i9111119 = i9111117 << 1;
                                        int i10112 = ((i9111118 | i9111119) << 1) - (i9111118 ^ i9111119);
                                        b = i10112 % 128;
                                        int i10113 = i10112 % 2;
                                        hVar6.getTheme().setTo(themeNewTheme);
                                        context = hVar6;
                                    }
                                }
                                nVar2 = new n(context);
                                nVar2.h = this;
                                int i10114 = a;
                                int i10115 = i10114 & 93;
                                int i10116 = (i10114 | 93) & (~i10115);
                                int i10117 = i10115 << 1;
                                i9 = ((i10116 | i10117) << 1) - (i10116 ^ i10117);
                                b = i9 % 128;
                                if (i9 % 2 == 0) {
                                    aqz.c(nVar2);
                                    n nVar6 = aqz.k;
                                    throw null;
                                }
                                aqz.c(nVar2);
                                if (aqz.k == null) {
                                    int i10118 = a;
                                    int i10119 = i10118 & 105;
                                    int i11110 = ((i10118 ^ 105) | i10119) << 1;
                                    int i11111 = -((~i10119) & (i10118 | 105));
                                    int i11112 = (i11110 & i11111) + (i11110 | i11111);
                                    b = i11112 % 128;
                                    int i11113 = i11112 % 2;
                                    int i11114 = i10118 & 61;
                                    int i11115 = (((i10118 ^ 61) | i11114) << 1) - ((i10118 | 61) & (~i11114));
                                    b = i11115 % 128;
                                    int i11116 = i11115 % 2;
                                    return false;
                                }
                            }
                            if (z) {
                                int i11117 = a;
                                int i11118 = i11117 & 51;
                                int i11119 = (i11118 - (~((i11117 ^ 51) | i11118))) - 1;
                                i5 = i11119 % 128;
                                b = i5;
                                int i12110 = i11119 % 2;
                                interfaceC0320s2 = this.q;
                                if (interfaceC0320s2 != null) {
                                    int i12111 = (i5 & (-14)) | ((~i5) & 13);
                                    int i12112 = (i5 & 13) << 1;
                                    int i12113 = (i12111 ^ i12112) + ((i12112 & i12111) << 1);
                                    a = i12113 % 128;
                                    int i12114 = i12113 % 2;
                                    if (this.s == null) {
                                        this.s = new aQo();
                                        int i12115 = a;
                                        int i12116 = i12115 & 63;
                                        int i12117 = (i12116 - (~(-(-((i12115 ^ 63) | i12116))))) - 1;
                                        b = i12117 % 128;
                                        int i12118 = i12117 % 2;
                                    }
                                    interfaceC0320s2.b(aqz.k, this.s);
                                    int i12119 = b;
                                    int i13110 = ((i12119 | 34) << 1) - (i12119 ^ 34);
                                    int i13111 = (i13110 ^ (-1)) + (i13110 << 1);
                                    a = i13111 % 128;
                                    int i13112 = i13111 % 2;
                                }
                            }
                            aqz.k.A();
                            i = aqz.d;
                            int i13113 = b;
                            int i13114 = (i13113 | 65) << 1;
                            int i13115 = -(((~i13113) & 65) | (i13113 & (-66)));
                            int i13116 = (i13114 & i13115) + (i13115 | i13114);
                            a = i13116 % 128;
                            int i13117 = i13116 % 2;
                            if (!callbackG.onCreatePanelMenu(i, aqz.k)) {
                                int i13118 = b;
                                int i13119 = ((i13118 | 47) << 1) - (i13118 ^ 47);
                                a = i13119 % 128;
                                int i14110 = i13119 % 2;
                                aqz.c(null);
                                if (!(!z)) {
                                    int i14111 = b;
                                    int i14112 = ((i14111 ^ 112) + ((i14111 & 112) << 1)) - 1;
                                    i3 = i14112 % 128;
                                    a = i3;
                                    int i14113 = i14112 % 2;
                                    interfaceC0320s = this.q;
                                    if (interfaceC0320s != null) {
                                        i4 = ((i3 & 60) + (i3 | 60)) - 1;
                                        b = i4 % 128;
                                        if (i4 % 2 != 0) {
                                            interfaceC0320s.b(null, this.s);
                                            int i14114 = 18 / 0;
                                        } else {
                                            interfaceC0320s.b(null, this.s);
                                        }
                                    }
                                }
                                int i14115 = a;
                                int i14116 = i14115 & 5;
                                int i14117 = -(-((i14115 ^ 5) | i14116));
                                i2 = ((i14116 | i14117) << 1) - (i14117 ^ i14116);
                                b = i2 % 128;
                                if (i2 % 2 == 0) {
                                    return false;
                                }
                                throw null;
                            }
                            aqz.q = false;
                            int i14118 = a + 77;
                            b = i14118 % 128;
                            int i14119 = i14118 % 2;
                        }
                    } else {
                        if (nVar == null) {
                            int i61118 = a + 51;
                            b = i61118 % 128;
                            int i61119 = i61118 % 2;
                            context = this.l;
                            i6 = aqz.d;
                            if (i6 != 0) {
                                int i6124 = b;
                                int i6125 = i6124 ^ 91;
                                int i6126 = ((i6125 | (i6124 & 91)) << 1) - i6125;
                                a = i6126 % 128;
                                int i6127 = i6126 % 2;
                                if (i6 == 108) {
                                    if (this.q != null) {
                                        typedValue = new TypedValue();
                                        theme = context.getTheme();
                                        int i611110 = b;
                                        int i611111 = i611110 & 53;
                                        int i611112 = (((~i611111) & (i611110 | 53)) - (~(-(-(i611111 << 1))))) - 1;
                                        a = i611112 % 128;
                                        int i611113 = i611112 % 2;
                                        theme.resolveAttribute(ivas.gov.bisp.enumeration.R.attr.actionBarTheme, typedValue, true);
                                        if (typedValue.resourceId != 0) {
                                            int i71111110 = a;
                                            int i71111111 = i71111110 ^ 71;
                                            int i71111112 = ((i71111110 & 71) | i71111111) << 1;
                                            int i71111113 = -i71111111;
                                            int i71111114 = ((i71111112 | i71111113) << 1) - (i71111112 ^ i71111113);
                                            b = i71111114 % 128;
                                            int i71111115 = i71111114 % 2;
                                            themeNewTheme = context.getResources().newTheme();
                                            themeNewTheme.setTo(theme);
                                            int i71111116 = a + 19;
                                            b = i71111116 % 128;
                                            int i71111117 = i71111116 % 2;
                                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                                            int i71111118 = b;
                                            i8 = ((i71111118 & 94) + (i71111118 | 94)) - 1;
                                            a = i8 % 128;
                                            if (i8 % 2 == 0) {
                                                themeNewTheme.resolveAttribute(ivas.gov.bisp.enumeration.R.attr.actionBarWidgetTheme, typedValue, false);
                                            } else {
                                                themeNewTheme.resolveAttribute(ivas.gov.bisp.enumeration.R.attr.actionBarWidgetTheme, typedValue, true);
                                            }
                                        } else {
                                            theme.resolveAttribute(ivas.gov.bisp.enumeration.R.attr.actionBarWidgetTheme, typedValue, true);
                                            int i71111119 = a;
                                            int i81111110 = (i71111119 & 14) + (i71111119 | 14);
                                            int i81111111 = (i81111110 ^ (-1)) + (i81111110 << 1);
                                            int i81111112 = i81111111 % 128;
                                            b = i81111112;
                                            int i81111113 = i81111111 % 2;
                                            int i81111114 = i81111112 & 43;
                                            int i81111115 = (i81111112 | 43) & (~i81111114);
                                            int i81111116 = -(-(i81111114 << 1));
                                            int i81111117 = (i81111115 ^ i81111116) + ((i81111116 & i81111115) << 1);
                                            a = i81111117 % 128;
                                            int i81111118 = i81111117 % 2;
                                            themeNewTheme = null;
                                        }
                                        if (typedValue.resourceId != 0) {
                                            if (themeNewTheme == null) {
                                                i7 = a + 107;
                                                b = i7 % 128;
                                                if (i7 % 2 != 0) {
                                                    themeNewTheme2 = context.getResources().newTheme();
                                                    themeNewTheme2.setTo(theme);
                                                    int i81111119 = 50 / 0;
                                                } else {
                                                    themeNewTheme2 = context.getResources().newTheme();
                                                    themeNewTheme2.setTo(theme);
                                                }
                                                themeNewTheme = themeNewTheme2;
                                            }
                                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                                            int i91111110 = b;
                                            int i91111111 = i91111110 ^ 27;
                                            int i91111112 = ((i91111110 & 27) | i91111111) << 1;
                                            int i91111113 = -i91111111;
                                            int i91111114 = (i91111112 ^ i91111113) + ((i91111112 & i91111113) << 1);
                                            a = i91111114 % 128;
                                            int i91111115 = i91111114 % 2;
                                        }
                                        if (themeNewTheme != null) {
                                            h hVar7 = new h(context, 0);
                                            int i91111116 = a;
                                            int i91111117 = i91111116 & 65;
                                            int i91111118 = (i91111116 | 65) & (~i91111117);
                                            int i91111119 = i91111117 << 1;
                                            int i101110 = ((i91111118 | i91111119) << 1) - (i91111118 ^ i91111119);
                                            b = i101110 % 128;
                                            int i101111 = i101110 % 2;
                                            hVar7.getTheme().setTo(themeNewTheme);
                                            context = hVar7;
                                        }
                                    }
                                }
                            } else if (this.q != null) {
                                typedValue = new TypedValue();
                                theme = context.getTheme();
                                int i611114 = b;
                                int i611115 = i611114 & 53;
                                int i611116 = (((~i611115) & (i611114 | 53)) - (~(-(-(i611115 << 1))))) - 1;
                                a = i611116 % 128;
                                int i611117 = i611116 % 2;
                                theme.resolveAttribute(ivas.gov.bisp.enumeration.R.attr.actionBarTheme, typedValue, true);
                                if (typedValue.resourceId != 0) {
                                    int i711111110 = a;
                                    int i711111111 = i711111110 ^ 71;
                                    int i711111112 = ((i711111110 & 71) | i711111111) << 1;
                                    int i711111113 = -i711111111;
                                    int i711111114 = ((i711111112 | i711111113) << 1) - (i711111112 ^ i711111113);
                                    b = i711111114 % 128;
                                    int i711111115 = i711111114 % 2;
                                    themeNewTheme = context.getResources().newTheme();
                                    themeNewTheme.setTo(theme);
                                    int i711111116 = a + 19;
                                    b = i711111116 % 128;
                                    int i711111117 = i711111116 % 2;
                                    themeNewTheme.applyStyle(typedValue.resourceId, true);
                                    int i711111118 = b;
                                    i8 = ((i711111118 & 94) + (i711111118 | 94)) - 1;
                                    a = i8 % 128;
                                    if (i8 % 2 == 0) {
                                        themeNewTheme.resolveAttribute(ivas.gov.bisp.enumeration.R.attr.actionBarWidgetTheme, typedValue, false);
                                    } else {
                                        themeNewTheme.resolveAttribute(ivas.gov.bisp.enumeration.R.attr.actionBarWidgetTheme, typedValue, true);
                                    }
                                } else {
                                    theme.resolveAttribute(ivas.gov.bisp.enumeration.R.attr.actionBarWidgetTheme, typedValue, true);
                                    int i711111119 = a;
                                    int i811111110 = (i711111119 & 14) + (i711111119 | 14);
                                    int i811111111 = (i811111110 ^ (-1)) + (i811111110 << 1);
                                    int i811111112 = i811111111 % 128;
                                    b = i811111112;
                                    int i811111113 = i811111111 % 2;
                                    int i811111114 = i811111112 & 43;
                                    int i811111115 = (i811111112 | 43) & (~i811111114);
                                    int i811111116 = -(-(i811111114 << 1));
                                    int i811111117 = (i811111115 ^ i811111116) + ((i811111116 & i811111115) << 1);
                                    a = i811111117 % 128;
                                    int i811111118 = i811111117 % 2;
                                    themeNewTheme = null;
                                }
                                if (typedValue.resourceId != 0) {
                                    if (themeNewTheme == null) {
                                        i7 = a + 107;
                                        b = i7 % 128;
                                        if (i7 % 2 != 0) {
                                            themeNewTheme2 = context.getResources().newTheme();
                                            themeNewTheme2.setTo(theme);
                                            int i811111119 = 50 / 0;
                                        } else {
                                            themeNewTheme2 = context.getResources().newTheme();
                                            themeNewTheme2.setTo(theme);
                                        }
                                        themeNewTheme = themeNewTheme2;
                                    }
                                    themeNewTheme.applyStyle(typedValue.resourceId, true);
                                    int i911111110 = b;
                                    int i911111111 = i911111110 ^ 27;
                                    int i911111112 = ((i911111110 & 27) | i911111111) << 1;
                                    int i911111113 = -i911111111;
                                    int i911111114 = (i911111112 ^ i911111113) + ((i911111112 & i911111113) << 1);
                                    a = i911111114 % 128;
                                    int i911111115 = i911111114 % 2;
                                }
                                if (themeNewTheme != null) {
                                    h hVar8 = new h(context, 0);
                                    int i911111116 = a;
                                    int i911111117 = i911111116 & 65;
                                    int i911111118 = (i911111116 | 65) & (~i911111117);
                                    int i911111119 = i911111117 << 1;
                                    int i101112 = ((i911111118 | i911111119) << 1) - (i911111118 ^ i911111119);
                                    b = i101112 % 128;
                                    int i101113 = i101112 % 2;
                                    hVar8.getTheme().setTo(themeNewTheme);
                                    context = hVar8;
                                }
                            }
                            nVar2 = new n(context);
                            nVar2.h = this;
                            int i101114 = a;
                            int i101115 = i101114 & 93;
                            int i101116 = (i101114 | 93) & (~i101115);
                            int i101117 = i101115 << 1;
                            i9 = ((i101116 | i101117) << 1) - (i101116 ^ i101117);
                            b = i9 % 128;
                            if (i9 % 2 == 0) {
                                aqz.c(nVar2);
                                n nVar7 = aqz.k;
                                throw null;
                            }
                            aqz.c(nVar2);
                            if (aqz.k == null) {
                                int i101118 = a;
                                int i101119 = i101118 & 105;
                                int i111110 = ((i101118 ^ 105) | i101119) << 1;
                                int i111111 = -((~i101119) & (i101118 | 105));
                                int i111112 = (i111110 & i111111) + (i111110 | i111111);
                                b = i111112 % 128;
                                int i111113 = i111112 % 2;
                                int i111114 = i101118 & 61;
                                int i111115 = (((i101118 ^ 61) | i111114) << 1) - ((i101118 | 61) & (~i111114));
                                b = i111115 % 128;
                                int i111116 = i111115 % 2;
                                return false;
                            }
                        }
                        if (z) {
                            int i111117 = a;
                            int i111118 = i111117 & 51;
                            int i111119 = (i111118 - (~((i111117 ^ 51) | i111118))) - 1;
                            i5 = i111119 % 128;
                            b = i5;
                            int i121110 = i111119 % 2;
                            interfaceC0320s2 = this.q;
                            if (interfaceC0320s2 != null) {
                                int i121111 = (i5 & (-14)) | ((~i5) & 13);
                                int i121112 = (i5 & 13) << 1;
                                int i121113 = (i121111 ^ i121112) + ((i121112 & i121111) << 1);
                                a = i121113 % 128;
                                int i121114 = i121113 % 2;
                                if (this.s == null) {
                                    this.s = new aQo();
                                    int i121115 = a;
                                    int i121116 = i121115 & 63;
                                    int i121117 = (i121116 - (~(-(-((i121115 ^ 63) | i121116))))) - 1;
                                    b = i121117 % 128;
                                    int i121118 = i121117 % 2;
                                }
                                interfaceC0320s2.b(aqz.k, this.s);
                                int i121119 = b;
                                int i131110 = ((i121119 | 34) << 1) - (i121119 ^ 34);
                                int i131111 = (i131110 ^ (-1)) + (i131110 << 1);
                                a = i131111 % 128;
                                int i131112 = i131111 % 2;
                            }
                        }
                        aqz.k.A();
                        i = aqz.d;
                        int i131113 = b;
                        int i131114 = (i131113 | 65) << 1;
                        int i131115 = -(((~i131113) & 65) | (i131113 & (-66)));
                        int i131116 = (i131114 & i131115) + (i131115 | i131114);
                        a = i131116 % 128;
                        int i131117 = i131116 % 2;
                        if (!callbackG.onCreatePanelMenu(i, aqz.k)) {
                            int i131118 = b;
                            int i131119 = ((i131118 | 47) << 1) - (i131118 ^ 47);
                            a = i131119 % 128;
                            int i141110 = i131119 % 2;
                            aqz.c(null);
                            if (!(!z)) {
                                int i141111 = b;
                                int i141112 = ((i141111 ^ 112) + ((i141111 & 112) << 1)) - 1;
                                i3 = i141112 % 128;
                                a = i3;
                                int i141113 = i141112 % 2;
                                interfaceC0320s = this.q;
                                if (interfaceC0320s != null) {
                                    i4 = ((i3 & 60) + (i3 | 60)) - 1;
                                    b = i4 % 128;
                                    if (i4 % 2 != 0) {
                                        interfaceC0320s.b(null, this.s);
                                        int i141114 = 18 / 0;
                                    } else {
                                        interfaceC0320s.b(null, this.s);
                                    }
                                }
                            }
                            int i141115 = a;
                            int i141116 = i141115 & 5;
                            int i141117 = -(-((i141115 ^ 5) | i141116));
                            i2 = ((i141116 | i141117) << 1) - (i141117 ^ i141116);
                            b = i2 % 128;
                            if (i2 % 2 == 0) {
                                return false;
                            }
                            throw null;
                        }
                        aqz.q = false;
                        int i141118 = a + 77;
                        b = i141118 % 128;
                        int i141119 = i141118 % 2;
                    }
                    aqz.k.A();
                    bundle = aqz.r;
                    if (bundle != null) {
                        int i1510 = b;
                        int i1511 = i1510 & 35;
                        int i1512 = (i1511 - (~(-(-((i1510 ^ 35) | i1511))))) - 1;
                        a = i1512 % 128;
                        int i1513 = i1512 % 2;
                        aqz.k.w(bundle);
                        aqz.r = null;
                        int i1514 = b;
                        int i1515 = i1514 & 119;
                        int i1516 = ((i1514 | 119) & (~i1515)) + (i1515 << 1);
                        a = i1516 % 128;
                        int i1517 = i1516 % 2;
                    }
                    view = aqz.j;
                    nVar3 = aqz.k;
                    int i1518 = a;
                    int i1519 = (-2) - (((i1518 & 38) + (i1518 | 38)) ^ (-1));
                    b = i1519 % 128;
                    int i1610 = i1519 % 2;
                    if (!callbackG.onPreparePanel(0, view, nVar3)) {
                        if (z) {
                            int i1611 = a;
                            int i1612 = ((i1611 | 45) << 1) - (i1611 ^ 45);
                            b = i1612 % 128;
                            int i1613 = i1612 % 2;
                            interfaceC0320s3 = this.q;
                            if (interfaceC0320s3 != null) {
                                interfaceC0320s3.b(null, this.s);
                                int i1614 = b;
                                int i1615 = ((i1614 & (-8)) | ((~i1614) & 7)) + ((i1614 & 7) << 1);
                                a = i1615 % 128;
                                int i1616 = i1615 % 2;
                            }
                        }
                        aqz.k.v();
                        return false;
                    }
                    if (keyEvent != null) {
                        int i1617 = a;
                        int i1618 = ((i1617 ^ 26) + ((i1617 & 26) << 1)) - 1;
                        b = i1618 % 128;
                        int i1619 = i1618 % 2;
                        deviceId = keyEvent.getDeviceId();
                    } else {
                        deviceId = -1;
                    }
                    if (KeyCharacterMap.load(deviceId).getKeyboardType() != 1) {
                        int i1710 = a;
                        int i1711 = i1710 & 113;
                        int i1712 = (i1711 - (~(-(-((i1710 ^ 113) | i1711))))) - 1;
                        int i1713 = i1712 % 128;
                        b = i1713;
                        int i1714 = i1712 % 2;
                        int i1715 = (i1713 & (-34)) | ((~i1713) & 33);
                        int i1716 = -(-((i1713 & 33) << 1));
                        int i1717 = (i1715 ^ i1716) + ((i1716 & i1715) << 1);
                        a = i1717 % 128;
                        int i1718 = i1717 % 2;
                        z2 = true;
                    } else {
                        int i1719 = a;
                        int i186 = i1719 & 3;
                        int i187 = (i186 - (~((i1719 ^ 3) | i186))) - 1;
                        b = i187 % 128;
                        int i188 = i187 % 2;
                        z2 = false;
                    }
                    aqz.k.setQwertyMode(z2);
                    aqz.k.v();
                    int i189 = a;
                    int i1810 = (i189 ^ 117) + ((i189 & 117) << 1);
                    b = i1810 % 128;
                    int i1811 = i1810 % 2;
                }
            } else {
                nVar = aqz.k;
                if (nVar != null) {
                    int i512 = b + 65;
                    a = i512 % 128;
                    int i513 = i512 % 2;
                    if (aqz.q) {
                        if (nVar == null) {
                            int i611118 = a + 51;
                            b = i611118 % 128;
                            int i611119 = i611118 % 2;
                            context = this.l;
                            i6 = aqz.d;
                            if (i6 != 0) {
                                int i6128 = b;
                                int i6129 = i6128 ^ 91;
                                int i61210 = ((i6129 | (i6128 & 91)) << 1) - i6129;
                                a = i61210 % 128;
                                int i61211 = i61210 % 2;
                                if (i6 == 108) {
                                    if (this.q != null) {
                                        typedValue = new TypedValue();
                                        theme = context.getTheme();
                                        int i6111110 = b;
                                        int i6111111 = i6111110 & 53;
                                        int i6111112 = (((~i6111111) & (i6111110 | 53)) - (~(-(-(i6111111 << 1))))) - 1;
                                        a = i6111112 % 128;
                                        int i6111113 = i6111112 % 2;
                                        theme.resolveAttribute(ivas.gov.bisp.enumeration.R.attr.actionBarTheme, typedValue, true);
                                        if (typedValue.resourceId != 0) {
                                            int i7111111110 = a;
                                            int i7111111111 = i7111111110 ^ 71;
                                            int i7111111112 = ((i7111111110 & 71) | i7111111111) << 1;
                                            int i7111111113 = -i7111111111;
                                            int i7111111114 = ((i7111111112 | i7111111113) << 1) - (i7111111112 ^ i7111111113);
                                            b = i7111111114 % 128;
                                            int i7111111115 = i7111111114 % 2;
                                            themeNewTheme = context.getResources().newTheme();
                                            themeNewTheme.setTo(theme);
                                            int i7111111116 = a + 19;
                                            b = i7111111116 % 128;
                                            int i7111111117 = i7111111116 % 2;
                                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                                            int i7111111118 = b;
                                            i8 = ((i7111111118 & 94) + (i7111111118 | 94)) - 1;
                                            a = i8 % 128;
                                            if (i8 % 2 == 0) {
                                                themeNewTheme.resolveAttribute(ivas.gov.bisp.enumeration.R.attr.actionBarWidgetTheme, typedValue, false);
                                            } else {
                                                themeNewTheme.resolveAttribute(ivas.gov.bisp.enumeration.R.attr.actionBarWidgetTheme, typedValue, true);
                                            }
                                        } else {
                                            theme.resolveAttribute(ivas.gov.bisp.enumeration.R.attr.actionBarWidgetTheme, typedValue, true);
                                            int i7111111119 = a;
                                            int i8111111110 = (i7111111119 & 14) + (i7111111119 | 14);
                                            int i8111111111 = (i8111111110 ^ (-1)) + (i8111111110 << 1);
                                            int i8111111112 = i8111111111 % 128;
                                            b = i8111111112;
                                            int i8111111113 = i8111111111 % 2;
                                            int i8111111114 = i8111111112 & 43;
                                            int i8111111115 = (i8111111112 | 43) & (~i8111111114);
                                            int i8111111116 = -(-(i8111111114 << 1));
                                            int i8111111117 = (i8111111115 ^ i8111111116) + ((i8111111116 & i8111111115) << 1);
                                            a = i8111111117 % 128;
                                            int i8111111118 = i8111111117 % 2;
                                            themeNewTheme = null;
                                        }
                                        if (typedValue.resourceId != 0) {
                                            if (themeNewTheme == null) {
                                                i7 = a + 107;
                                                b = i7 % 128;
                                                if (i7 % 2 != 0) {
                                                    themeNewTheme2 = context.getResources().newTheme();
                                                    themeNewTheme2.setTo(theme);
                                                    int i8111111119 = 50 / 0;
                                                } else {
                                                    themeNewTheme2 = context.getResources().newTheme();
                                                    themeNewTheme2.setTo(theme);
                                                }
                                                themeNewTheme = themeNewTheme2;
                                            }
                                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                                            int i9111111110 = b;
                                            int i9111111111 = i9111111110 ^ 27;
                                            int i9111111112 = ((i9111111110 & 27) | i9111111111) << 1;
                                            int i9111111113 = -i9111111111;
                                            int i9111111114 = (i9111111112 ^ i9111111113) + ((i9111111112 & i9111111113) << 1);
                                            a = i9111111114 % 128;
                                            int i9111111115 = i9111111114 % 2;
                                        }
                                        if (themeNewTheme != null) {
                                            h hVar9 = new h(context, 0);
                                            int i9111111116 = a;
                                            int i9111111117 = i9111111116 & 65;
                                            int i9111111118 = (i9111111116 | 65) & (~i9111111117);
                                            int i9111111119 = i9111111117 << 1;
                                            int i1011110 = ((i9111111118 | i9111111119) << 1) - (i9111111118 ^ i9111111119);
                                            b = i1011110 % 128;
                                            int i1011111 = i1011110 % 2;
                                            hVar9.getTheme().setTo(themeNewTheme);
                                            context = hVar9;
                                        }
                                    }
                                }
                            } else if (this.q != null) {
                                typedValue = new TypedValue();
                                theme = context.getTheme();
                                int i6111114 = b;
                                int i6111115 = i6111114 & 53;
                                int i6111116 = (((~i6111115) & (i6111114 | 53)) - (~(-(-(i6111115 << 1))))) - 1;
                                a = i6111116 % 128;
                                int i6111117 = i6111116 % 2;
                                theme.resolveAttribute(ivas.gov.bisp.enumeration.R.attr.actionBarTheme, typedValue, true);
                                if (typedValue.resourceId != 0) {
                                    int i71111111110 = a;
                                    int i71111111111 = i71111111110 ^ 71;
                                    int i71111111112 = ((i71111111110 & 71) | i71111111111) << 1;
                                    int i71111111113 = -i71111111111;
                                    int i71111111114 = ((i71111111112 | i71111111113) << 1) - (i71111111112 ^ i71111111113);
                                    b = i71111111114 % 128;
                                    int i71111111115 = i71111111114 % 2;
                                    themeNewTheme = context.getResources().newTheme();
                                    themeNewTheme.setTo(theme);
                                    int i71111111116 = a + 19;
                                    b = i71111111116 % 128;
                                    int i71111111117 = i71111111116 % 2;
                                    themeNewTheme.applyStyle(typedValue.resourceId, true);
                                    int i71111111118 = b;
                                    i8 = ((i71111111118 & 94) + (i71111111118 | 94)) - 1;
                                    a = i8 % 128;
                                    if (i8 % 2 == 0) {
                                        themeNewTheme.resolveAttribute(ivas.gov.bisp.enumeration.R.attr.actionBarWidgetTheme, typedValue, false);
                                    } else {
                                        themeNewTheme.resolveAttribute(ivas.gov.bisp.enumeration.R.attr.actionBarWidgetTheme, typedValue, true);
                                    }
                                } else {
                                    theme.resolveAttribute(ivas.gov.bisp.enumeration.R.attr.actionBarWidgetTheme, typedValue, true);
                                    int i71111111119 = a;
                                    int i81111111110 = (i71111111119 & 14) + (i71111111119 | 14);
                                    int i81111111111 = (i81111111110 ^ (-1)) + (i81111111110 << 1);
                                    int i81111111112 = i81111111111 % 128;
                                    b = i81111111112;
                                    int i81111111113 = i81111111111 % 2;
                                    int i81111111114 = i81111111112 & 43;
                                    int i81111111115 = (i81111111112 | 43) & (~i81111111114);
                                    int i81111111116 = -(-(i81111111114 << 1));
                                    int i81111111117 = (i81111111115 ^ i81111111116) + ((i81111111116 & i81111111115) << 1);
                                    a = i81111111117 % 128;
                                    int i81111111118 = i81111111117 % 2;
                                    themeNewTheme = null;
                                }
                                if (typedValue.resourceId != 0) {
                                    if (themeNewTheme == null) {
                                        i7 = a + 107;
                                        b = i7 % 128;
                                        if (i7 % 2 != 0) {
                                            themeNewTheme2 = context.getResources().newTheme();
                                            themeNewTheme2.setTo(theme);
                                            int i81111111119 = 50 / 0;
                                        } else {
                                            themeNewTheme2 = context.getResources().newTheme();
                                            themeNewTheme2.setTo(theme);
                                        }
                                        themeNewTheme = themeNewTheme2;
                                    }
                                    themeNewTheme.applyStyle(typedValue.resourceId, true);
                                    int i91111111110 = b;
                                    int i91111111111 = i91111111110 ^ 27;
                                    int i91111111112 = ((i91111111110 & 27) | i91111111111) << 1;
                                    int i91111111113 = -i91111111111;
                                    int i91111111114 = (i91111111112 ^ i91111111113) + ((i91111111112 & i91111111113) << 1);
                                    a = i91111111114 % 128;
                                    int i91111111115 = i91111111114 % 2;
                                }
                                if (themeNewTheme != null) {
                                    h hVar10 = new h(context, 0);
                                    int i91111111116 = a;
                                    int i91111111117 = i91111111116 & 65;
                                    int i91111111118 = (i91111111116 | 65) & (~i91111111117);
                                    int i91111111119 = i91111111117 << 1;
                                    int i1011112 = ((i91111111118 | i91111111119) << 1) - (i91111111118 ^ i91111111119);
                                    b = i1011112 % 128;
                                    int i1011113 = i1011112 % 2;
                                    hVar10.getTheme().setTo(themeNewTheme);
                                    context = hVar10;
                                }
                            }
                            nVar2 = new n(context);
                            nVar2.h = this;
                            int i1011114 = a;
                            int i1011115 = i1011114 & 93;
                            int i1011116 = (i1011114 | 93) & (~i1011115);
                            int i1011117 = i1011115 << 1;
                            i9 = ((i1011116 | i1011117) << 1) - (i1011116 ^ i1011117);
                            b = i9 % 128;
                            if (i9 % 2 == 0) {
                                aqz.c(nVar2);
                                n nVar8 = aqz.k;
                                throw null;
                            }
                            aqz.c(nVar2);
                            if (aqz.k == null) {
                                int i1011118 = a;
                                int i1011119 = i1011118 & 105;
                                int i1111110 = ((i1011118 ^ 105) | i1011119) << 1;
                                int i1111111 = -((~i1011119) & (i1011118 | 105));
                                int i1111112 = (i1111110 & i1111111) + (i1111110 | i1111111);
                                b = i1111112 % 128;
                                int i1111113 = i1111112 % 2;
                                int i1111114 = i1011118 & 61;
                                int i1111115 = (((i1011118 ^ 61) | i1111114) << 1) - ((i1011118 | 61) & (~i1111114));
                                b = i1111115 % 128;
                                int i1111116 = i1111115 % 2;
                                return false;
                            }
                        }
                        if (z) {
                            int i1111117 = a;
                            int i1111118 = i1111117 & 51;
                            int i1111119 = (i1111118 - (~((i1111117 ^ 51) | i1111118))) - 1;
                            i5 = i1111119 % 128;
                            b = i5;
                            int i1211110 = i1111119 % 2;
                            interfaceC0320s2 = this.q;
                            if (interfaceC0320s2 != null) {
                                int i1211111 = (i5 & (-14)) | ((~i5) & 13);
                                int i1211112 = (i5 & 13) << 1;
                                int i1211113 = (i1211111 ^ i1211112) + ((i1211112 & i1211111) << 1);
                                a = i1211113 % 128;
                                int i1211114 = i1211113 % 2;
                                if (this.s == null) {
                                    this.s = new aQo();
                                    int i1211115 = a;
                                    int i1211116 = i1211115 & 63;
                                    int i1211117 = (i1211116 - (~(-(-((i1211115 ^ 63) | i1211116))))) - 1;
                                    b = i1211117 % 128;
                                    int i1211118 = i1211117 % 2;
                                }
                                interfaceC0320s2.b(aqz.k, this.s);
                                int i1211119 = b;
                                int i1311110 = ((i1211119 | 34) << 1) - (i1211119 ^ 34);
                                int i1311111 = (i1311110 ^ (-1)) + (i1311110 << 1);
                                a = i1311111 % 128;
                                int i1311112 = i1311111 % 2;
                            }
                        }
                        aqz.k.A();
                        i = aqz.d;
                        int i1311113 = b;
                        int i1311114 = (i1311113 | 65) << 1;
                        int i1311115 = -(((~i1311113) & 65) | (i1311113 & (-66)));
                        int i1311116 = (i1311114 & i1311115) + (i1311115 | i1311114);
                        a = i1311116 % 128;
                        int i1311117 = i1311116 % 2;
                        if (!callbackG.onCreatePanelMenu(i, aqz.k)) {
                            int i1311118 = b;
                            int i1311119 = ((i1311118 | 47) << 1) - (i1311118 ^ 47);
                            a = i1311119 % 128;
                            int i1411110 = i1311119 % 2;
                            aqz.c(null);
                            if (!(!z)) {
                                int i1411111 = b;
                                int i1411112 = ((i1411111 ^ 112) + ((i1411111 & 112) << 1)) - 1;
                                i3 = i1411112 % 128;
                                a = i3;
                                int i1411113 = i1411112 % 2;
                                interfaceC0320s = this.q;
                                if (interfaceC0320s != null) {
                                    i4 = ((i3 & 60) + (i3 | 60)) - 1;
                                    b = i4 % 128;
                                    if (i4 % 2 != 0) {
                                        interfaceC0320s.b(null, this.s);
                                        int i1411114 = 18 / 0;
                                    } else {
                                        interfaceC0320s.b(null, this.s);
                                    }
                                }
                            }
                            int i1411115 = a;
                            int i1411116 = i1411115 & 5;
                            int i1411117 = -(-((i1411115 ^ 5) | i1411116));
                            i2 = ((i1411116 | i1411117) << 1) - (i1411117 ^ i1411116);
                            b = i2 % 128;
                            if (i2 % 2 == 0) {
                                return false;
                            }
                            throw null;
                        }
                        aqz.q = false;
                        int i1411118 = a + 77;
                        b = i1411118 % 128;
                        int i1411119 = i1411118 % 2;
                    }
                } else {
                    if (nVar == null) {
                        int i6111118 = a + 51;
                        b = i6111118 % 128;
                        int i6111119 = i6111118 % 2;
                        context = this.l;
                        i6 = aqz.d;
                        if (i6 != 0) {
                            int i61212 = b;
                            int i61213 = i61212 ^ 91;
                            int i61214 = ((i61213 | (i61212 & 91)) << 1) - i61213;
                            a = i61214 % 128;
                            int i61215 = i61214 % 2;
                            if (i6 == 108) {
                                if (this.q != null) {
                                    typedValue = new TypedValue();
                                    theme = context.getTheme();
                                    int i61111110 = b;
                                    int i61111111 = i61111110 & 53;
                                    int i61111112 = (((~i61111111) & (i61111110 | 53)) - (~(-(-(i61111111 << 1))))) - 1;
                                    a = i61111112 % 128;
                                    int i61111113 = i61111112 % 2;
                                    theme.resolveAttribute(ivas.gov.bisp.enumeration.R.attr.actionBarTheme, typedValue, true);
                                    if (typedValue.resourceId != 0) {
                                        int i711111111110 = a;
                                        int i711111111111 = i711111111110 ^ 71;
                                        int i711111111112 = ((i711111111110 & 71) | i711111111111) << 1;
                                        int i711111111113 = -i711111111111;
                                        int i711111111114 = ((i711111111112 | i711111111113) << 1) - (i711111111112 ^ i711111111113);
                                        b = i711111111114 % 128;
                                        int i711111111115 = i711111111114 % 2;
                                        themeNewTheme = context.getResources().newTheme();
                                        themeNewTheme.setTo(theme);
                                        int i711111111116 = a + 19;
                                        b = i711111111116 % 128;
                                        int i711111111117 = i711111111116 % 2;
                                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                                        int i711111111118 = b;
                                        i8 = ((i711111111118 & 94) + (i711111111118 | 94)) - 1;
                                        a = i8 % 128;
                                        if (i8 % 2 == 0) {
                                            themeNewTheme.resolveAttribute(ivas.gov.bisp.enumeration.R.attr.actionBarWidgetTheme, typedValue, false);
                                        } else {
                                            themeNewTheme.resolveAttribute(ivas.gov.bisp.enumeration.R.attr.actionBarWidgetTheme, typedValue, true);
                                        }
                                    } else {
                                        theme.resolveAttribute(ivas.gov.bisp.enumeration.R.attr.actionBarWidgetTheme, typedValue, true);
                                        int i711111111119 = a;
                                        int i811111111110 = (i711111111119 & 14) + (i711111111119 | 14);
                                        int i811111111111 = (i811111111110 ^ (-1)) + (i811111111110 << 1);
                                        int i811111111112 = i811111111111 % 128;
                                        b = i811111111112;
                                        int i811111111113 = i811111111111 % 2;
                                        int i811111111114 = i811111111112 & 43;
                                        int i811111111115 = (i811111111112 | 43) & (~i811111111114);
                                        int i811111111116 = -(-(i811111111114 << 1));
                                        int i811111111117 = (i811111111115 ^ i811111111116) + ((i811111111116 & i811111111115) << 1);
                                        a = i811111111117 % 128;
                                        int i811111111118 = i811111111117 % 2;
                                        themeNewTheme = null;
                                    }
                                    if (typedValue.resourceId != 0) {
                                        if (themeNewTheme == null) {
                                            i7 = a + 107;
                                            b = i7 % 128;
                                            if (i7 % 2 != 0) {
                                                themeNewTheme2 = context.getResources().newTheme();
                                                themeNewTheme2.setTo(theme);
                                                int i811111111119 = 50 / 0;
                                            } else {
                                                themeNewTheme2 = context.getResources().newTheme();
                                                themeNewTheme2.setTo(theme);
                                            }
                                            themeNewTheme = themeNewTheme2;
                                        }
                                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                                        int i911111111110 = b;
                                        int i911111111111 = i911111111110 ^ 27;
                                        int i911111111112 = ((i911111111110 & 27) | i911111111111) << 1;
                                        int i911111111113 = -i911111111111;
                                        int i911111111114 = (i911111111112 ^ i911111111113) + ((i911111111112 & i911111111113) << 1);
                                        a = i911111111114 % 128;
                                        int i911111111115 = i911111111114 % 2;
                                    }
                                    if (themeNewTheme != null) {
                                        h hVar11 = new h(context, 0);
                                        int i911111111116 = a;
                                        int i911111111117 = i911111111116 & 65;
                                        int i911111111118 = (i911111111116 | 65) & (~i911111111117);
                                        int i911111111119 = i911111111117 << 1;
                                        int i10111110 = ((i911111111118 | i911111111119) << 1) - (i911111111118 ^ i911111111119);
                                        b = i10111110 % 128;
                                        int i10111111 = i10111110 % 2;
                                        hVar11.getTheme().setTo(themeNewTheme);
                                        context = hVar11;
                                    }
                                }
                            }
                        } else if (this.q != null) {
                            typedValue = new TypedValue();
                            theme = context.getTheme();
                            int i61111114 = b;
                            int i61111115 = i61111114 & 53;
                            int i61111116 = (((~i61111115) & (i61111114 | 53)) - (~(-(-(i61111115 << 1))))) - 1;
                            a = i61111116 % 128;
                            int i61111117 = i61111116 % 2;
                            theme.resolveAttribute(ivas.gov.bisp.enumeration.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                int i7111111111110 = a;
                                int i7111111111111 = i7111111111110 ^ 71;
                                int i7111111111112 = ((i7111111111110 & 71) | i7111111111111) << 1;
                                int i7111111111113 = -i7111111111111;
                                int i7111111111114 = ((i7111111111112 | i7111111111113) << 1) - (i7111111111112 ^ i7111111111113);
                                b = i7111111111114 % 128;
                                int i7111111111115 = i7111111111114 % 2;
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                                int i7111111111116 = a + 19;
                                b = i7111111111116 % 128;
                                int i7111111111117 = i7111111111116 % 2;
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                                int i7111111111118 = b;
                                i8 = ((i7111111111118 & 94) + (i7111111111118 | 94)) - 1;
                                a = i8 % 128;
                                if (i8 % 2 == 0) {
                                    themeNewTheme.resolveAttribute(ivas.gov.bisp.enumeration.R.attr.actionBarWidgetTheme, typedValue, false);
                                } else {
                                    themeNewTheme.resolveAttribute(ivas.gov.bisp.enumeration.R.attr.actionBarWidgetTheme, typedValue, true);
                                }
                            } else {
                                theme.resolveAttribute(ivas.gov.bisp.enumeration.R.attr.actionBarWidgetTheme, typedValue, true);
                                int i7111111111119 = a;
                                int i8111111111110 = (i7111111111119 & 14) + (i7111111111119 | 14);
                                int i8111111111111 = (i8111111111110 ^ (-1)) + (i8111111111110 << 1);
                                int i8111111111112 = i8111111111111 % 128;
                                b = i8111111111112;
                                int i8111111111113 = i8111111111111 % 2;
                                int i8111111111114 = i8111111111112 & 43;
                                int i8111111111115 = (i8111111111112 | 43) & (~i8111111111114);
                                int i8111111111116 = -(-(i8111111111114 << 1));
                                int i8111111111117 = (i8111111111115 ^ i8111111111116) + ((i8111111111116 & i8111111111115) << 1);
                                a = i8111111111117 % 128;
                                int i8111111111118 = i8111111111117 % 2;
                                themeNewTheme = null;
                            }
                            if (typedValue.resourceId != 0) {
                                if (themeNewTheme == null) {
                                    i7 = a + 107;
                                    b = i7 % 128;
                                    if (i7 % 2 != 0) {
                                        themeNewTheme2 = context.getResources().newTheme();
                                        themeNewTheme2.setTo(theme);
                                        int i8111111111119 = 50 / 0;
                                    } else {
                                        themeNewTheme2 = context.getResources().newTheme();
                                        themeNewTheme2.setTo(theme);
                                    }
                                    themeNewTheme = themeNewTheme2;
                                }
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                                int i9111111111110 = b;
                                int i9111111111111 = i9111111111110 ^ 27;
                                int i9111111111112 = ((i9111111111110 & 27) | i9111111111111) << 1;
                                int i9111111111113 = -i9111111111111;
                                int i9111111111114 = (i9111111111112 ^ i9111111111113) + ((i9111111111112 & i9111111111113) << 1);
                                a = i9111111111114 % 128;
                                int i9111111111115 = i9111111111114 % 2;
                            }
                            if (themeNewTheme != null) {
                                h hVar12 = new h(context, 0);
                                int i9111111111116 = a;
                                int i9111111111117 = i9111111111116 & 65;
                                int i9111111111118 = (i9111111111116 | 65) & (~i9111111111117);
                                int i9111111111119 = i9111111111117 << 1;
                                int i10111112 = ((i9111111111118 | i9111111111119) << 1) - (i9111111111118 ^ i9111111111119);
                                b = i10111112 % 128;
                                int i10111113 = i10111112 % 2;
                                hVar12.getTheme().setTo(themeNewTheme);
                                context = hVar12;
                            }
                        }
                        nVar2 = new n(context);
                        nVar2.h = this;
                        int i10111114 = a;
                        int i10111115 = i10111114 & 93;
                        int i10111116 = (i10111114 | 93) & (~i10111115);
                        int i10111117 = i10111115 << 1;
                        i9 = ((i10111116 | i10111117) << 1) - (i10111116 ^ i10111117);
                        b = i9 % 128;
                        if (i9 % 2 == 0) {
                            aqz.c(nVar2);
                            n nVar9 = aqz.k;
                            throw null;
                        }
                        aqz.c(nVar2);
                        if (aqz.k == null) {
                            int i10111118 = a;
                            int i10111119 = i10111118 & 105;
                            int i11111110 = ((i10111118 ^ 105) | i10111119) << 1;
                            int i11111111 = -((~i10111119) & (i10111118 | 105));
                            int i11111112 = (i11111110 & i11111111) + (i11111110 | i11111111);
                            b = i11111112 % 128;
                            int i11111113 = i11111112 % 2;
                            int i11111114 = i10111118 & 61;
                            int i11111115 = (((i10111118 ^ 61) | i11111114) << 1) - ((i10111118 | 61) & (~i11111114));
                            b = i11111115 % 128;
                            int i11111116 = i11111115 % 2;
                            return false;
                        }
                    }
                    if (z) {
                        int i11111117 = a;
                        int i11111118 = i11111117 & 51;
                        int i11111119 = (i11111118 - (~((i11111117 ^ 51) | i11111118))) - 1;
                        i5 = i11111119 % 128;
                        b = i5;
                        int i12111110 = i11111119 % 2;
                        interfaceC0320s2 = this.q;
                        if (interfaceC0320s2 != null) {
                            int i12111111 = (i5 & (-14)) | ((~i5) & 13);
                            int i12111112 = (i5 & 13) << 1;
                            int i12111113 = (i12111111 ^ i12111112) + ((i12111112 & i12111111) << 1);
                            a = i12111113 % 128;
                            int i12111114 = i12111113 % 2;
                            if (this.s == null) {
                                this.s = new aQo();
                                int i12111115 = a;
                                int i12111116 = i12111115 & 63;
                                int i12111117 = (i12111116 - (~(-(-((i12111115 ^ 63) | i12111116))))) - 1;
                                b = i12111117 % 128;
                                int i12111118 = i12111117 % 2;
                            }
                            interfaceC0320s2.b(aqz.k, this.s);
                            int i12111119 = b;
                            int i13111110 = ((i12111119 | 34) << 1) - (i12111119 ^ 34);
                            int i13111111 = (i13111110 ^ (-1)) + (i13111110 << 1);
                            a = i13111111 % 128;
                            int i13111112 = i13111111 % 2;
                        }
                    }
                    aqz.k.A();
                    i = aqz.d;
                    int i13111113 = b;
                    int i13111114 = (i13111113 | 65) << 1;
                    int i13111115 = -(((~i13111113) & 65) | (i13111113 & (-66)));
                    int i13111116 = (i13111114 & i13111115) + (i13111115 | i13111114);
                    a = i13111116 % 128;
                    int i13111117 = i13111116 % 2;
                    if (!callbackG.onCreatePanelMenu(i, aqz.k)) {
                        int i13111118 = b;
                        int i13111119 = ((i13111118 | 47) << 1) - (i13111118 ^ 47);
                        a = i13111119 % 128;
                        int i14111110 = i13111119 % 2;
                        aqz.c(null);
                        if (!(!z)) {
                            int i14111111 = b;
                            int i14111112 = ((i14111111 ^ 112) + ((i14111111 & 112) << 1)) - 1;
                            i3 = i14111112 % 128;
                            a = i3;
                            int i14111113 = i14111112 % 2;
                            interfaceC0320s = this.q;
                            if (interfaceC0320s != null) {
                                i4 = ((i3 & 60) + (i3 | 60)) - 1;
                                b = i4 % 128;
                                if (i4 % 2 != 0) {
                                    interfaceC0320s.b(null, this.s);
                                    int i14111114 = 18 / 0;
                                } else {
                                    interfaceC0320s.b(null, this.s);
                                }
                            }
                        }
                        int i14111115 = a;
                        int i14111116 = i14111115 & 5;
                        int i14111117 = -(-((i14111115 ^ 5) | i14111116));
                        i2 = ((i14111116 | i14111117) << 1) - (i14111117 ^ i14111116);
                        b = i2 % 128;
                        if (i2 % 2 == 0) {
                            return false;
                        }
                        throw null;
                    }
                    aqz.q = false;
                    int i14111118 = a + 77;
                    b = i14111118 % 128;
                    int i14111119 = i14111118 % 2;
                }
                aqz.k.A();
                bundle = aqz.r;
                if (bundle != null) {
                    int i15110 = b;
                    int i15111 = i15110 & 35;
                    int i15112 = (i15111 - (~(-(-((i15110 ^ 35) | i15111))))) - 1;
                    a = i15112 % 128;
                    int i15113 = i15112 % 2;
                    aqz.k.w(bundle);
                    aqz.r = null;
                    int i15114 = b;
                    int i15115 = i15114 & 119;
                    int i15116 = ((i15114 | 119) & (~i15115)) + (i15115 << 1);
                    a = i15116 % 128;
                    int i15117 = i15116 % 2;
                }
                view = aqz.j;
                nVar3 = aqz.k;
                int i15118 = a;
                int i15119 = (-2) - (((i15118 & 38) + (i15118 | 38)) ^ (-1));
                b = i15119 % 128;
                int i16110 = i15119 % 2;
                if (!callbackG.onPreparePanel(0, view, nVar3)) {
                    if (z) {
                        int i16111 = a;
                        int i16112 = ((i16111 | 45) << 1) - (i16111 ^ 45);
                        b = i16112 % 128;
                        int i16113 = i16112 % 2;
                        interfaceC0320s3 = this.q;
                        if (interfaceC0320s3 != null) {
                            interfaceC0320s3.b(null, this.s);
                            int i16114 = b;
                            int i16115 = ((i16114 & (-8)) | ((~i16114) & 7)) + ((i16114 & 7) << 1);
                            a = i16115 % 128;
                            int i16116 = i16115 % 2;
                        }
                    }
                    aqz.k.v();
                    return false;
                }
                if (keyEvent != null) {
                    int i16117 = a;
                    int i16118 = ((i16117 ^ 26) + ((i16117 & 26) << 1)) - 1;
                    b = i16118 % 128;
                    int i16119 = i16118 % 2;
                    deviceId = keyEvent.getDeviceId();
                } else {
                    deviceId = -1;
                }
                if (KeyCharacterMap.load(deviceId).getKeyboardType() != 1) {
                    int i17110 = a;
                    int i17111 = i17110 & 113;
                    int i17112 = (i17111 - (~(-(-((i17110 ^ 113) | i17111))))) - 1;
                    int i17113 = i17112 % 128;
                    b = i17113;
                    int i17114 = i17112 % 2;
                    int i17115 = (i17113 & (-34)) | ((~i17113) & 33);
                    int i17116 = -(-((i17113 & 33) << 1));
                    int i17117 = (i17115 ^ i17116) + ((i17116 & i17115) << 1);
                    a = i17117 % 128;
                    int i17118 = i17117 % 2;
                    z2 = true;
                } else {
                    int i17119 = a;
                    int i1812 = i17119 & 3;
                    int i1813 = (i1812 - (~((i17119 ^ 3) | i1812))) - 1;
                    b = i1813 % 128;
                    int i1814 = i1813 % 2;
                    z2 = false;
                }
                aqz.k.setQwertyMode(z2);
                aqz.k.v();
                int i1815 = a;
                int i1816 = (i1815 ^ 117) + ((i1815 & 117) << 1);
                b = i1816 % 128;
                int i1817 = i1816 % 2;
            }
        }
        aqz.m = true;
        aqz.n = false;
        this.O = aqz;
        int i190 = b;
        int i191 = i190 & 47;
        int i192 = ((((i190 ^ 47) | i191) << 1) - (~(-((i190 | 47) & (~i191))))) - 1;
        int i193 = i192 % 128;
        a = i193;
        int i194 = i192 % 2;
        int i195 = ((i193 ^ 80) + ((i193 & 80) << 1)) - 1;
        b = i195 % 128;
        int i196 = i195 % 2;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0275  */
    /* JADX WARN: Code duplicated, block: B:103:0x028c  */
    /* JADX WARN: Code duplicated, block: B:106:0x0294  */
    /* JADX WARN: Code duplicated, block: B:109:0x029b  */
    /* JADX WARN: Code duplicated, block: B:111:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:113:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:116:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:119:0x0312  */
    /* JADX WARN: Code duplicated, block: B:120:0x0316  */
    /* JADX WARN: Code duplicated, block: B:121:0x031b  */
    /* JADX WARN: Code duplicated, block: B:123:0x032f  */
    /* JADX WARN: Code duplicated, block: B:126:0x0346  */
    /* JADX WARN: Code duplicated, block: B:133:0x038e  */
    /* JADX WARN: Code duplicated, block: B:134:0x0392  */
    /* JADX WARN: Code duplicated, block: B:135:0x0393  */
    /* JADX WARN: Code duplicated, block: B:137:0x03af  */
    /* JADX WARN: Code duplicated, block: B:139:0x03bd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:141:0x03c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:146:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:148:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:150:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:151:0x040d  */
    /* JADX WARN: Code duplicated, block: B:153:0x0414  */
    /* JADX WARN: Code duplicated, block: B:155:0x041b  */
    /* JADX WARN: Code duplicated, block: B:157:0x042d  */
    /* JADX WARN: Code duplicated, block: B:160:0x0437  */
    /* JADX WARN: Code duplicated, block: B:26:0x006c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0085  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:40:0x0106  */
    /* JADX WARN: Code duplicated, block: B:43:0x010b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:54:0x014b  */
    /* JADX WARN: Code duplicated, block: B:55:0x014e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0156  */
    /* JADX WARN: Code duplicated, block: B:59:0x0177 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x0179  */
    /* JADX WARN: Code duplicated, block: B:62:0x0188 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:64:0x018b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:72:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:75:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:99:0x0271  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x011a, code lost:
    
        if (r18.getRepeatCount() == 0) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean K(android.view.KeyEvent r18) {
        /*
            Method dump skipped, instruction units count: 1176
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p087j.LayoutInflaterFactory2C0312o.K(android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0316  */
    /* JADX WARN: Code duplicated, block: B:102:0x0322  */
    /* JADX WARN: Code duplicated, block: B:104:0x0334  */
    /* JADX WARN: Code duplicated, block: B:106:0x033e  */
    /* JADX WARN: Code duplicated, block: B:108:0x036a  */
    /* JADX WARN: Code duplicated, block: B:109:0x0396  */
    /* JADX WARN: Code duplicated, block: B:111:0x039c  */
    /* JADX WARN: Code duplicated, block: B:113:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:119:0x03db  */
    /* JADX WARN: Code duplicated, block: B:121:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:124:0x03ec A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:125:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:128:0x0419  */
    /* JADX WARN: Code duplicated, block: B:129:0x044c  */
    /* JADX WARN: Code duplicated, block: B:12:0x0055  */
    /* JADX WARN: Code duplicated, block: B:131:0x0450  */
    /* JADX WARN: Code duplicated, block: B:133:0x0455  */
    /* JADX WARN: Code duplicated, block: B:135:0x0459  */
    /* JADX WARN: Code duplicated, block: B:137:0x0460  */
    /* JADX WARN: Code duplicated, block: B:139:0x0464  */
    /* JADX WARN: Code duplicated, block: B:143:0x0473  */
    /* JADX WARN: Code duplicated, block: B:145:0x0482  */
    /* JADX WARN: Code duplicated, block: B:146:0x049a  */
    /* JADX WARN: Code duplicated, block: B:14:0x008d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:150:0x04be  */
    /* JADX WARN: Code duplicated, block: B:15:0x008f  */
    /* JADX WARN: Code duplicated, block: B:17:0x0093  */
    /* JADX WARN: Code duplicated, block: B:19:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:20:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:22:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:23:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:25:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:27:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:30:0x0111  */
    /* JADX WARN: Code duplicated, block: B:32:0x012a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0133  */
    /* JADX WARN: Code duplicated, block: B:36:0x013e A[Catch: Exception -> 0x015d, TRY_ENTER, TryCatch #0 {Exception -> 0x015d, blocks: (B:36:0x013e, B:40:0x0154, B:41:0x0156, B:42:0x015a, B:37:0x0143), top: B:153:0x013c }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0143 A[Catch: Exception -> 0x015d, TRY_LEAVE, TryCatch #0 {Exception -> 0x015d, blocks: (B:36:0x013e, B:40:0x0154, B:41:0x0156, B:42:0x015a, B:37:0x0143), top: B:153:0x013c }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0154 A[Catch: Exception -> 0x015d, TRY_ENTER, TryCatch #0 {Exception -> 0x015d, blocks: (B:36:0x013e, B:40:0x0154, B:41:0x0156, B:42:0x015a, B:37:0x0143), top: B:153:0x013c }] */
    /* JADX WARN: Code duplicated, block: B:42:0x015a A[Catch: Exception -> 0x015d, TRY_LEAVE, TryCatch #0 {Exception -> 0x015d, blocks: (B:36:0x013e, B:40:0x0154, B:41:0x0156, B:42:0x015a, B:37:0x0143), top: B:153:0x013c }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0173  */
    /* JADX WARN: Code duplicated, block: B:48:0x018e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0194  */
    /* JADX WARN: Code duplicated, block: B:52:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:53:0x01af  */
    /* JADX WARN: Code duplicated, block: B:54:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:56:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:57:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:60:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:62:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:67:0x0209  */
    /* JADX WARN: Code duplicated, block: B:69:0x020f  */
    /* JADX WARN: Code duplicated, block: B:72:0x023f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0254  */
    /* JADX WARN: Code duplicated, block: B:76:0x0275  */
    /* JADX WARN: Code duplicated, block: B:77:0x0282  */
    /* JADX WARN: Code duplicated, block: B:79:0x0287  */
    /* JADX WARN: Code duplicated, block: B:81:0x028b  */
    /* JADX WARN: Code duplicated, block: B:83:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:85:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:87:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:89:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:92:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:94:0x02df  */
    /* JADX WARN: Code duplicated, block: B:95:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:99:0x0302  */
    /* JADX WARN: Code duplicated, block: B:9:0x0032 A[PHI: r4 r7
  0x0032: PHI (r4v5 int) = (r4v4 int), (r4v17 int) binds: [B:8:0x0030, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]
  0x0032: PHI (r7v1 androidx.appcompat.widget.ActionBarContextView) = (r7v0 androidx.appcompat.widget.ActionBarContextView), (r7v21 androidx.appcompat.widget.ActionBarContextView) binds: [B:8:0x0030, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    public final int Y(am amVar, Rect rect) {
        int iJ;
        ActionBarContextView actionBarContextView;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        boolean zIsShown;
        int i;
        int i2;
        Object obj;
        int i3;
        Rect rect2;
        Rect rect3;
        int iH;
        int iJ2;
        int i4;
        int i5;
        int iG;
        int i6;
        ViewGroup viewGroup;
        Method method;
        int i7;
        int i8;
        int i9;
        int i10;
        ViewGroup viewGroup2;
        int i11;
        am amVarB;
        int iH2;
        int i12;
        boolean z;
        View view;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        int i13;
        int i14;
        int i15;
        int i16;
        View view2;
        boolean z2;
        boolean z3;
        boolean z4;
        int i17;
        int i18;
        View view3;
        int i19;
        int iB;
        int i20;
        FrameLayout.LayoutParams layoutParams;
        int i21;
        int i22;
        int i23;
        int i24;
        Object[] objArr;
        int i25;
        int i26;
        View view4;
        int i27;
        int i28;
        int i29;
        int i30 = 2 % 2;
        int i31 = a;
        int i32 = i31 | 115;
        int i33 = ((i32 << 1) - (~(-((~(i31 & 115)) & i32)))) - 1;
        b = i33 % 128;
        if (i33 % 2 != 0) {
            iJ = amVar.j();
            actionBarContextView = this.u;
            int i34 = 16 / 0;
            if (actionBarContextView != null) {
                int i35 = a;
                int i36 = ((i35 ^ 33) | (i35 & 33)) << 1;
                int i37 = -(((~i35) & 33) | (i35 & (-34)));
                int i38 = (i36 & i37) + (i37 | i36);
                b = i38 % 128;
                int i39 = i38 % 2;
                if (!(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                    int i40 = b;
                    int i41 = (i40 & 99) + (i40 | 99);
                    a = i41 % 128;
                    int i42 = i41 % 2;
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) this.u.getLayoutParams();
                    int i43 = a;
                    int i44 = i43 & 77;
                    int i45 = (i43 | 77) & (~i44);
                    int i46 = i44 << 1;
                    int i47 = (i45 & i46) + (i45 | i46);
                    b = i47 % 128;
                    int i48 = i47 % 2;
                    zIsShown = this.u.isShown();
                    i = b;
                    i2 = i + 53;
                    a = i2 % 128;
                    obj = null;
                    if (i2 % 2 != 0) {
                        throw null;
                    }
                    if (!zIsShown) {
                        i3 = i + 105;
                        a = i3 % 128;
                        if (i3 % 2 != 0) {
                            obj.hashCode();
                            throw null;
                        }
                        if (this.ab == null) {
                            this.ab = new Rect();
                            this.ac = new Rect();
                        }
                        rect2 = this.ab;
                        rect3 = this.ac;
                        int i49 = b;
                        int i50 = i49 & 85;
                        int i51 = -(-((i49 ^ 85) | i50));
                        int i52 = (i50 ^ i51) + ((i51 & i50) << 1);
                        a = i52 % 128;
                        int i53 = i52 % 2;
                        iH = amVar.h();
                        iJ2 = amVar.j();
                        i4 = b + 89;
                        a = i4 % 128;
                        if (i4 % 2 != 0) {
                            amVar.i();
                            amVar.g();
                            throw null;
                        }
                        i5 = amVar.i();
                        iG = amVar.g();
                        int i54 = a;
                        i6 = ((i54 & 34) + (i54 | 34)) - 1;
                        b = i6 % 128;
                        if (i6 % 2 == 0) {
                            rect2.set(iH, iJ2, i5, iG);
                            throw null;
                        }
                        rect2.set(iH, iJ2, i5, iG);
                        viewGroup = this.B;
                        method = aj.c;
                        if (method != null) {
                            int i55 = a;
                            i24 = i55 + 3;
                            b = i24 % 128;
                            try {
                                if (i24 % 2 != 0) {
                                    objArr = new Object[2];
                                    objArr[0] = rect2;
                                } else {
                                    objArr = new Object[2];
                                    objArr[0] = rect2;
                                }
                                int i56 = i55 & 115;
                                i25 = i56 + ((i55 ^ 115) | i56);
                                b = i25 % 128;
                                if (i25 % 2 != 0) {
                                    objArr[1] = rect3;
                                } else {
                                    objArr[1] = rect3;
                                }
                                method.invoke(viewGroup, objArr);
                            } catch (Exception unused) {
                            }
                        }
                        i7 = rect2.top;
                        i8 = rect2.left;
                        int i57 = b;
                        int i58 = (i57 & 52) + (i57 | 52);
                        i9 = (i58 ^ (-1)) + (i58 << 1);
                        a = i9 % 128;
                        if (i9 % 2 != 0) {
                            int i59 = rect2.right;
                            WeakHashMap<View, R> weakHashMap = T.c;
                            throw null;
                        }
                        i10 = rect2.right;
                        viewGroup2 = this.B;
                        WeakHashMap<View, R> weakHashMap2 = T.c;
                        int i60 = a;
                        int i61 = i60 ^ 97;
                        int i62 = ((i60 & 97) | i61) << 1;
                        int i63 = -i61;
                        i11 = ((i62 | i63) << 1) - (i62 ^ i63);
                        b = i11 % 128;
                        if (i11 % 2 == 0) {
                            T.aXe.b(viewGroup2);
                            throw null;
                        }
                        amVarB = T.aXe.b(viewGroup2);
                        if (amVarB == null) {
                            int i64 = a;
                            i23 = ((((i64 ^ 9) | (i64 & 9)) << 1) - (~(-(((~i64) & 9) | (i64 & (-10)))))) - 1;
                            b = i23 % 128;
                            if (i23 % 2 != 0) {
                                iH2 = 1;
                            } else {
                                iH2 = 0;
                            }
                        } else {
                            iH2 = amVarB.h();
                            int i65 = b;
                            int i66 = ((i65 | 75) << 1) - (i65 ^ 75);
                            a = i66 % 128;
                            int i67 = i66 % 2;
                        }
                        if (amVarB == null) {
                            int i68 = a;
                            int i69 = (i68 & 59) + (i68 | 59);
                            b = i69 % 128;
                            int i70 = i69 % 2;
                            i12 = 0;
                        } else {
                            i12 = amVarB.i();
                            int i71 = a + 77;
                            b = i71 % 128;
                            int i72 = i71 % 2;
                        }
                        if (marginLayoutParams.topMargin == i7) {
                            i22 = a + 81;
                            b = i22 % 128;
                            if (i22 % 2 == 0) {
                                int i73 = marginLayoutParams.leftMargin;
                                obj.hashCode();
                                throw null;
                            }
                            if (marginLayoutParams.leftMargin == i8 || marginLayoutParams.rightMargin != i10) {
                                marginLayoutParams.topMargin = i7;
                                marginLayoutParams.leftMargin = i8;
                                marginLayoutParams.rightMargin = i10;
                                int i74 = a;
                                int i75 = i74 & 1;
                                int i76 = (i74 | 1) & (~i75);
                                int i77 = i75 << 1;
                                int i78 = ((i76 | i77) << 1) - (i76 ^ i77);
                                int i79 = i78 % 128;
                                b = i79;
                                int i80 = i78 % 2;
                                int i81 = (i79 & (-48)) | ((~i79) & 47);
                                int i82 = -(-((i79 & 47) << 1));
                                int i83 = (i81 & i82) + (i82 | i81);
                                a = i83 % 128;
                                int i84 = i83 % 2;
                                z = true;
                            } else {
                                int i85 = b;
                                int i86 = i85 ^ 121;
                                int i87 = ((((i85 & 121) | i86) << 1) - (~(-i86))) - 1;
                                a = i87 % 128;
                                int i88 = i87 % 2;
                                z = false;
                            }
                        } else {
                            marginLayoutParams.topMargin = i7;
                            marginLayoutParams.leftMargin = i8;
                            marginLayoutParams.rightMargin = i10;
                            int i710 = a;
                            int i711 = i710 & 1;
                            int i712 = (i710 | 1) & (~i711);
                            int i713 = i711 << 1;
                            int i714 = ((i712 | i713) << 1) - (i712 ^ i713);
                            int i715 = i714 % 128;
                            b = i715;
                            int i89 = i714 % 2;
                            int i810 = (i715 & (-48)) | ((~i715) & 47);
                            int i811 = -(-((i715 & 47) << 1));
                            int i812 = (i810 & i811) + (i811 | i810);
                            a = i812 % 128;
                            int i813 = i812 % 2;
                            z = true;
                        }
                        if (i7 > 0) {
                            int i90 = a;
                            int i91 = i90 & 75;
                            int i92 = (i90 ^ 75) | i91;
                            int i93 = ((i91 | i92) << 1) - (i92 ^ i91);
                            b = i93 % 128;
                            int i94 = i93 % 2;
                            if (this.y == null) {
                                View view5 = new View(this.l);
                                this.y = view5;
                                view5.setVisibility(8);
                                layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                                i21 = b + 89;
                                a = i21 % 128;
                                if (i21 % 2 != 0) {
                                    layoutParams.leftMargin = iH2;
                                    layoutParams.rightMargin = i12;
                                    throw null;
                                }
                                layoutParams.leftMargin = iH2;
                                layoutParams.rightMargin = i12;
                                this.B.addView(this.y, -1, layoutParams);
                            } else {
                                view = this.y;
                                if (view != null) {
                                    int i95 = a;
                                    int i96 = i95 & 11;
                                    int i97 = (i95 | 11) & (~i96);
                                    int i98 = -(-(i96 << 1));
                                    int i99 = (i97 ^ i98) + ((i97 & i98) << 1);
                                    b = i99 % 128;
                                    int i100 = i99 % 2;
                                    marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                                    i13 = marginLayoutParams2.height;
                                    int i101 = a;
                                    i14 = (((~i101) & 3) | (i101 & (-4))) + ((i101 & 3) << 1);
                                    b = i14 % 128;
                                    if (i14 % 2 == 0) {
                                        int i102 = marginLayoutParams.topMargin;
                                        obj.hashCode();
                                        throw null;
                                    }
                                    i15 = marginLayoutParams.topMargin;
                                    if (i13 == i15) {
                                        int i103 = a;
                                        int i104 = i103 ^ 105;
                                        int i105 = ((i103 & 105) | i104) << 1;
                                        int i106 = -i104;
                                        i16 = (i105 & i106) + (i105 | i106);
                                        b = i16 % 128;
                                        if (i16 % 2 == 0) {
                                            int i107 = marginLayoutParams2.leftMargin;
                                            throw null;
                                        }
                                        if (marginLayoutParams2.leftMargin == iH2 || marginLayoutParams2.rightMargin != i12) {
                                            marginLayoutParams2.height = i15;
                                            marginLayoutParams2.leftMargin = iH2;
                                            int i108 = a;
                                            int i109 = ((i108 | 113) << 1) - (i108 ^ 113);
                                            b = i109 % 128;
                                            int i110 = i109 % 2;
                                            marginLayoutParams2.rightMargin = i12;
                                            this.y.setLayoutParams(marginLayoutParams2);
                                        }
                                    } else {
                                        marginLayoutParams2.height = i15;
                                        marginLayoutParams2.leftMargin = iH2;
                                        int i1010 = a;
                                        int i1011 = ((i1010 | 113) << 1) - (i1010 ^ 113);
                                        b = i1011 % 128;
                                        int i111 = i1011 % 2;
                                        marginLayoutParams2.rightMargin = i12;
                                        this.y.setLayoutParams(marginLayoutParams2);
                                    }
                                }
                            }
                        } else {
                            view = this.y;
                            if (view != null) {
                                int i910 = a;
                                int i911 = i910 & 11;
                                int i912 = (i910 | 11) & (~i911);
                                int i913 = -(-(i911 << 1));
                                int i914 = (i912 ^ i913) + ((i912 & i913) << 1);
                                b = i914 % 128;
                                int i1012 = i914 % 2;
                                marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                                i13 = marginLayoutParams2.height;
                                int i1013 = a;
                                i14 = (((~i1013) & 3) | (i1013 & (-4))) + ((i1013 & 3) << 1);
                                b = i14 % 128;
                                if (i14 % 2 == 0) {
                                    int i1014 = marginLayoutParams.topMargin;
                                    obj.hashCode();
                                    throw null;
                                }
                                i15 = marginLayoutParams.topMargin;
                                if (i13 == i15) {
                                    int i1015 = a;
                                    int i1016 = i1015 ^ 105;
                                    int i1017 = ((i1015 & 105) | i1016) << 1;
                                    int i1018 = -i1016;
                                    i16 = (i1017 & i1018) + (i1017 | i1018);
                                    b = i16 % 128;
                                    if (i16 % 2 == 0) {
                                        int i1019 = marginLayoutParams2.leftMargin;
                                        throw null;
                                    }
                                    if (marginLayoutParams2.leftMargin == iH2) {
                                        marginLayoutParams2.height = i15;
                                        marginLayoutParams2.leftMargin = iH2;
                                        int i10110 = a;
                                        int i10111 = ((i10110 | 113) << 1) - (i10110 ^ 113);
                                        b = i10111 % 128;
                                        int i112 = i10111 % 2;
                                        marginLayoutParams2.rightMargin = i12;
                                        this.y.setLayoutParams(marginLayoutParams2);
                                    } else {
                                        marginLayoutParams2.height = i15;
                                        marginLayoutParams2.leftMargin = iH2;
                                        int i10112 = a;
                                        int i10113 = ((i10112 | 113) << 1) - (i10112 ^ 113);
                                        b = i10113 % 128;
                                        int i113 = i10113 % 2;
                                        marginLayoutParams2.rightMargin = i12;
                                        this.y.setLayoutParams(marginLayoutParams2);
                                    }
                                } else {
                                    marginLayoutParams2.height = i15;
                                    marginLayoutParams2.leftMargin = iH2;
                                    int i10114 = a;
                                    int i10115 = ((i10114 | 113) << 1) - (i10114 ^ 113);
                                    b = i10115 % 128;
                                    int i114 = i10115 % 2;
                                    marginLayoutParams2.rightMargin = i12;
                                    this.y.setLayoutParams(marginLayoutParams2);
                                }
                            }
                        }
                        view2 = this.y;
                        if (view2 != null) {
                            int i115 = b;
                            int i116 = i115 ^ 97;
                            int i117 = -(-((i115 & 97) << 1));
                            int i118 = (i116 & i117) + (i117 | i116);
                            a = i118 % 128;
                            int i119 = i118 % 2;
                            z2 = true;
                        } else {
                            int i120 = b + 103;
                            a = i120 % 128;
                            int i121 = i120 % 2;
                            z2 = false;
                        }
                        if (z2) {
                            int i122 = b;
                            int i123 = (i122 & 41) + (i122 | 41);
                            a = i123 % 128;
                            int i124 = i123 % 2;
                            if (view2.getVisibility() != 0) {
                                view3 = this.y;
                                if ((T.aWX.i(view3) & 8192) != 0) {
                                    int i125 = b;
                                    int i126 = ((i125 | 2) << 1) - (i125 ^ 2);
                                    int i127 = (i126 ^ (-1)) + (i126 << 1);
                                    int i128 = i127 % 128;
                                    a = i128;
                                    int i129 = i127 % 2;
                                    int i130 = (i128 & 23) + (i128 | 23);
                                    b = i130 % 128;
                                    int i131 = i130 % 2;
                                    int i132 = i128 & 83;
                                    i20 = (((i128 ^ 83) | i132) << 1) - ((i128 | 83) & (~i132));
                                    b = i20 % 128;
                                    if (i20 % 2 == 0) {
                                        Object obj2 = l.c;
                                        obj.hashCode();
                                        throw null;
                                    }
                                    Context context = this.l;
                                    Object obj3 = l.c;
                                    int i133 = a;
                                    int i134 = ((i133 | 103) << 1) - (i133 ^ 103);
                                    b = i134 % 128;
                                    int i135 = i134 % 2;
                                    iB = l.aUI.b(context, ivas.gov.bisp.enumeration.R.color.abc_decor_view_status_guard_light);
                                    int i136 = b;
                                    int i137 = i136 & 59;
                                    int i138 = -(-((i136 ^ 59) | i137));
                                    int i139 = ((i137 | i138) << 1) - (i138 ^ i137);
                                    a = i139 % 128;
                                    int i140 = i139 % 2;
                                } else {
                                    Context context2 = this.l;
                                    Object obj4 = l.c;
                                    int iB2 = l.aUI.b(context2, ivas.gov.bisp.enumeration.R.color.abc_decor_view_status_guard);
                                    int i141 = b;
                                    int i142 = (((i141 | 79) << 1) - (~(-(((~i141) & 79) | (i141 & (-80)))))) - 1;
                                    int i143 = i142 % 128;
                                    a = i143;
                                    int i144 = i142 % 2;
                                    int i145 = i143 | 53;
                                    int i146 = i145 << 1;
                                    int i147 = -((~(i143 & 53)) & i145);
                                    i19 = (i146 ^ i147) + ((i147 & i146) << 1);
                                    b = i19 % 128;
                                    if (i19 % 2 != 0) {
                                        int i148 = 3 / 4;
                                    }
                                    iB = iB2;
                                }
                                view3.setBackgroundColor(iB);
                            }
                        }
                        if (!this.G) {
                            i17 = a + 83;
                            i18 = i17 % 128;
                            b = i18;
                            if (i17 % 2 != 0) {
                                int i149 = 26 / 0;
                                if (z2) {
                                    int i150 = (i18 & (-40)) | ((~i18) & 39);
                                    int i151 = -(-((i18 & 39) << 1));
                                    int i152 = (i150 & i151) + (i150 | i151);
                                    a = i152 % 128;
                                    int i153 = i152 % 2;
                                    iJ = 0;
                                }
                            } else if (z2) {
                                int i154 = (i18 & (-40)) | ((~i18) & 39);
                                int i155 = -(-((i18 & 39) << 1));
                                int i156 = (i154 & i155) + (i154 | i155);
                                a = i156 % 128;
                                int i157 = i156 % 2;
                                iJ = 0;
                            }
                        }
                        int i158 = b;
                        int i159 = i158 ^ 45;
                        int i160 = ((i158 & 45) | i159) << 1;
                        int i161 = -i159;
                        int i162 = (i160 & i161) + (i160 | i161);
                        a = i162 % 128;
                        int i163 = i162 % 2;
                        z3 = z;
                        z4 = z2;
                    } else if (marginLayoutParams.topMargin != 0) {
                        int i164 = a;
                        int i165 = (i164 & (-34)) | ((~i164) & 33);
                        int i166 = -(-((i164 & 33) << 1));
                        i26 = (i165 & i166) + (i166 | i165);
                        b = i26 % 128;
                        if (i26 % 2 != 0) {
                            marginLayoutParams.topMargin = 1;
                            z4 = true;
                        } else {
                            marginLayoutParams.topMargin = 0;
                            z4 = false;
                        }
                        int i167 = a;
                        int i168 = i167 & 83;
                        int i169 = ((((i167 ^ 83) | i168) << 1) - (~(-((i167 | 83) & (~i168))))) - 1;
                        b = i169 % 128;
                        int i170 = i169 % 2;
                        z3 = true;
                    } else {
                        z3 = false;
                        z4 = false;
                    }
                    if (z3) {
                        int i171 = a;
                        int i172 = i171 & 75;
                        int i173 = i171 | 75;
                        int i174 = (i172 & i173) + (i173 | i172);
                        b = i174 % 128;
                        int i175 = i174 % 2;
                        this.u.setLayoutParams(marginLayoutParams);
                        int i176 = a;
                        int i177 = (i176 & 109) + (i176 | 109);
                        int i178 = i177 % 128;
                        b = i178;
                        int i179 = i177 % 2;
                        int i180 = i178 & 123;
                        int i181 = (i178 | 123) & (~i180);
                        int i182 = -(-(i180 << 1));
                        int i183 = (i181 & i182) + (i181 | i182);
                        a = i183 % 128;
                        int i184 = i183 % 2;
                    }
                }
            }
            view4 = this.y;
            if (view4 != null) {
                int i185 = b;
                int i186 = ((i185 | 53) << 1) - (i185 ^ 53);
                i28 = i186 % 128;
                a = i28;
                int i187 = i186 % 2;
                if (z4) {
                    int i188 = i28 & 41;
                    int i189 = ((i28 ^ 41) | i188) << 1;
                    int i190 = -((i28 | 41) & (~i188));
                    int i191 = ((i189 | i190) << 1) - (i190 ^ i189);
                    b = i191 % 128;
                    int i192 = i191 % 2;
                    i29 = 0;
                } else {
                    i29 = 8;
                }
                view4.setVisibility(i29);
                int i193 = b;
                int i194 = i193 & 59;
                int i195 = -(-(i193 | 59));
                int i196 = (i194 & i195) + (i195 | i194);
                a = i196 % 128;
                int i197 = i196 % 2;
            }
            int i198 = a;
            i27 = (i198 & 37) + (i198 | 37);
            b = i27 % 128;
            if (i27 % 2 != 0) {
                int i199 = 11 / 0;
            }
            return iJ;
        }
        iJ = amVar.j();
        actionBarContextView = this.u;
        if (actionBarContextView != null) {
            int i310 = a;
            int i311 = ((i310 ^ 33) | (i310 & 33)) << 1;
            int i312 = -(((~i310) & 33) | (i310 & (-34)));
            int i313 = (i311 & i312) + (i312 | i311);
            b = i313 % 128;
            int i314 = i313 % 2;
            if (!(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                int i410 = b;
                int i411 = (i410 & 99) + (i410 | 99);
                a = i411 % 128;
                int i412 = i411 % 2;
                marginLayoutParams = (ViewGroup.MarginLayoutParams) this.u.getLayoutParams();
                int i413 = a;
                int i414 = i413 & 77;
                int i415 = (i413 | 77) & (~i414);
                int i416 = i414 << 1;
                int i417 = (i415 & i416) + (i415 | i416);
                b = i417 % 128;
                int i418 = i417 % 2;
                zIsShown = this.u.isShown();
                i = b;
                i2 = i + 53;
                a = i2 % 128;
                obj = null;
                if (i2 % 2 != 0) {
                    throw null;
                }
                if (!zIsShown) {
                    i3 = i + 105;
                    a = i3 % 128;
                    if (i3 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                    if (this.ab == null) {
                        this.ab = new Rect();
                        this.ac = new Rect();
                    }
                    rect2 = this.ab;
                    rect3 = this.ac;
                    int i419 = b;
                    int i510 = i419 & 85;
                    int i511 = -(-((i419 ^ 85) | i510));
                    int i512 = (i510 ^ i511) + ((i511 & i510) << 1);
                    a = i512 % 128;
                    int i513 = i512 % 2;
                    iH = amVar.h();
                    iJ2 = amVar.j();
                    i4 = b + 89;
                    a = i4 % 128;
                    if (i4 % 2 != 0) {
                        amVar.i();
                        amVar.g();
                        throw null;
                    }
                    i5 = amVar.i();
                    iG = amVar.g();
                    int i514 = a;
                    i6 = ((i514 & 34) + (i514 | 34)) - 1;
                    b = i6 % 128;
                    if (i6 % 2 == 0) {
                        rect2.set(iH, iJ2, i5, iG);
                        throw null;
                    }
                    rect2.set(iH, iJ2, i5, iG);
                    viewGroup = this.B;
                    method = aj.c;
                    if (method != null) {
                        int i515 = a;
                        i24 = i515 + 3;
                        b = i24 % 128;
                        if (i24 % 2 != 0) {
                            objArr = new Object[2];
                            objArr[0] = rect2;
                        } else {
                            objArr = new Object[2];
                            objArr[0] = rect2;
                        }
                        int i516 = i515 & 115;
                        i25 = i516 + ((i515 ^ 115) | i516);
                        b = i25 % 128;
                        if (i25 % 2 != 0) {
                            objArr[1] = rect3;
                        } else {
                            objArr[1] = rect3;
                        }
                        method.invoke(viewGroup, objArr);
                    }
                    i7 = rect2.top;
                    i8 = rect2.left;
                    int i517 = b;
                    int i518 = (i517 & 52) + (i517 | 52);
                    i9 = (i518 ^ (-1)) + (i518 << 1);
                    a = i9 % 128;
                    if (i9 % 2 != 0) {
                        int i519 = rect2.right;
                        WeakHashMap<View, R> weakHashMap3 = T.c;
                        throw null;
                    }
                    i10 = rect2.right;
                    viewGroup2 = this.B;
                    WeakHashMap<View, R> weakHashMap4 = T.c;
                    int i610 = a;
                    int i611 = i610 ^ 97;
                    int i612 = ((i610 & 97) | i611) << 1;
                    int i613 = -i611;
                    i11 = ((i612 | i613) << 1) - (i612 ^ i613);
                    b = i11 % 128;
                    if (i11 % 2 == 0) {
                        T.aXe.b(viewGroup2);
                        throw null;
                    }
                    amVarB = T.aXe.b(viewGroup2);
                    if (amVarB == null) {
                        int i614 = a;
                        i23 = ((((i614 ^ 9) | (i614 & 9)) << 1) - (~(-(((~i614) & 9) | (i614 & (-10)))))) - 1;
                        b = i23 % 128;
                        if (i23 % 2 != 0) {
                            iH2 = 1;
                        } else {
                            iH2 = 0;
                        }
                    } else {
                        iH2 = amVarB.h();
                        int i615 = b;
                        int i616 = ((i615 | 75) << 1) - (i615 ^ 75);
                        a = i616 % 128;
                        int i617 = i616 % 2;
                    }
                    if (amVarB == null) {
                        int i618 = a;
                        int i619 = (i618 & 59) + (i618 | 59);
                        b = i619 % 128;
                        int i716 = i619 % 2;
                        i12 = 0;
                    } else {
                        i12 = amVarB.i();
                        int i717 = a + 77;
                        b = i717 % 128;
                        int i718 = i717 % 2;
                    }
                    if (marginLayoutParams.topMargin == i7) {
                        i22 = a + 81;
                        b = i22 % 128;
                        if (i22 % 2 == 0) {
                            int i719 = marginLayoutParams.leftMargin;
                            obj.hashCode();
                            throw null;
                        }
                        if (marginLayoutParams.leftMargin == i8) {
                            marginLayoutParams.topMargin = i7;
                            marginLayoutParams.leftMargin = i8;
                            marginLayoutParams.rightMargin = i10;
                            int i7110 = a;
                            int i7111 = i7110 & 1;
                            int i7112 = (i7110 | 1) & (~i7111);
                            int i7113 = i7111 << 1;
                            int i7114 = ((i7112 | i7113) << 1) - (i7112 ^ i7113);
                            int i7115 = i7114 % 128;
                            b = i7115;
                            int i814 = i7114 % 2;
                            int i815 = (i7115 & (-48)) | ((~i7115) & 47);
                            int i816 = -(-((i7115 & 47) << 1));
                            int i817 = (i815 & i816) + (i816 | i815);
                            a = i817 % 128;
                            int i818 = i817 % 2;
                            z = true;
                        } else {
                            marginLayoutParams.topMargin = i7;
                            marginLayoutParams.leftMargin = i8;
                            marginLayoutParams.rightMargin = i10;
                            int i7116 = a;
                            int i7117 = i7116 & 1;
                            int i7118 = (i7116 | 1) & (~i7117);
                            int i7119 = i7117 << 1;
                            int i71110 = ((i7118 | i7119) << 1) - (i7118 ^ i7119);
                            int i71111 = i71110 % 128;
                            b = i71111;
                            int i819 = i71110 % 2;
                            int i8110 = (i71111 & (-48)) | ((~i71111) & 47);
                            int i8111 = -(-((i71111 & 47) << 1));
                            int i8112 = (i8110 & i8111) + (i8111 | i8110);
                            a = i8112 % 128;
                            int i8113 = i8112 % 2;
                            z = true;
                        }
                    } else {
                        marginLayoutParams.topMargin = i7;
                        marginLayoutParams.leftMargin = i8;
                        marginLayoutParams.rightMargin = i10;
                        int i71112 = a;
                        int i71113 = i71112 & 1;
                        int i71114 = (i71112 | 1) & (~i71113);
                        int i71115 = i71113 << 1;
                        int i71116 = ((i71114 | i71115) << 1) - (i71114 ^ i71115);
                        int i71117 = i71116 % 128;
                        b = i71117;
                        int i8114 = i71116 % 2;
                        int i8115 = (i71117 & (-48)) | ((~i71117) & 47);
                        int i8116 = -(-((i71117 & 47) << 1));
                        int i8117 = (i8115 & i8116) + (i8116 | i8115);
                        a = i8117 % 128;
                        int i8118 = i8117 % 2;
                        z = true;
                    }
                    if (i7 > 0) {
                        int i915 = a;
                        int i916 = i915 & 75;
                        int i917 = (i915 ^ 75) | i916;
                        int i918 = ((i916 | i917) << 1) - (i917 ^ i916);
                        b = i918 % 128;
                        int i919 = i918 % 2;
                        if (this.y == null) {
                            View view6 = new View(this.l);
                            this.y = view6;
                            view6.setVisibility(8);
                            layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                            i21 = b + 89;
                            a = i21 % 128;
                            if (i21 % 2 != 0) {
                                layoutParams.leftMargin = iH2;
                                layoutParams.rightMargin = i12;
                                throw null;
                            }
                            layoutParams.leftMargin = iH2;
                            layoutParams.rightMargin = i12;
                            this.B.addView(this.y, -1, layoutParams);
                        } else {
                            view = this.y;
                            if (view != null) {
                                int i9110 = a;
                                int i9111 = i9110 & 11;
                                int i9112 = (i9110 | 11) & (~i9111);
                                int i9113 = -(-(i9111 << 1));
                                int i9114 = (i9112 ^ i9113) + ((i9112 & i9113) << 1);
                                b = i9114 % 128;
                                int i10116 = i9114 % 2;
                                marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                                i13 = marginLayoutParams2.height;
                                int i10117 = a;
                                i14 = (((~i10117) & 3) | (i10117 & (-4))) + ((i10117 & 3) << 1);
                                b = i14 % 128;
                                if (i14 % 2 == 0) {
                                    int i10118 = marginLayoutParams.topMargin;
                                    obj.hashCode();
                                    throw null;
                                }
                                i15 = marginLayoutParams.topMargin;
                                if (i13 == i15) {
                                    int i10119 = a;
                                    int i10120 = i10119 ^ 105;
                                    int i10121 = ((i10119 & 105) | i10120) << 1;
                                    int i10122 = -i10120;
                                    i16 = (i10121 & i10122) + (i10121 | i10122);
                                    b = i16 % 128;
                                    if (i16 % 2 == 0) {
                                        int i10123 = marginLayoutParams2.leftMargin;
                                        throw null;
                                    }
                                    if (marginLayoutParams2.leftMargin == iH2) {
                                        marginLayoutParams2.height = i15;
                                        marginLayoutParams2.leftMargin = iH2;
                                        int i101110 = a;
                                        int i101111 = ((i101110 | 113) << 1) - (i101110 ^ 113);
                                        b = i101111 % 128;
                                        int i1110 = i101111 % 2;
                                        marginLayoutParams2.rightMargin = i12;
                                        this.y.setLayoutParams(marginLayoutParams2);
                                    } else {
                                        marginLayoutParams2.height = i15;
                                        marginLayoutParams2.leftMargin = iH2;
                                        int i101112 = a;
                                        int i101113 = ((i101112 | 113) << 1) - (i101112 ^ 113);
                                        b = i101113 % 128;
                                        int i1111 = i101113 % 2;
                                        marginLayoutParams2.rightMargin = i12;
                                        this.y.setLayoutParams(marginLayoutParams2);
                                    }
                                } else {
                                    marginLayoutParams2.height = i15;
                                    marginLayoutParams2.leftMargin = iH2;
                                    int i101114 = a;
                                    int i101115 = ((i101114 | 113) << 1) - (i101114 ^ 113);
                                    b = i101115 % 128;
                                    int i1112 = i101115 % 2;
                                    marginLayoutParams2.rightMargin = i12;
                                    this.y.setLayoutParams(marginLayoutParams2);
                                }
                            }
                        }
                    } else {
                        view = this.y;
                        if (view != null) {
                            int i9115 = a;
                            int i9116 = i9115 & 11;
                            int i9117 = (i9115 | 11) & (~i9116);
                            int i9118 = -(-(i9116 << 1));
                            int i9119 = (i9117 ^ i9118) + ((i9117 & i9118) << 1);
                            b = i9119 % 128;
                            int i101116 = i9119 % 2;
                            marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                            i13 = marginLayoutParams2.height;
                            int i101117 = a;
                            i14 = (((~i101117) & 3) | (i101117 & (-4))) + ((i101117 & 3) << 1);
                            b = i14 % 128;
                            if (i14 % 2 == 0) {
                                int i101118 = marginLayoutParams.topMargin;
                                obj.hashCode();
                                throw null;
                            }
                            i15 = marginLayoutParams.topMargin;
                            if (i13 == i15) {
                                int i101119 = a;
                                int i10124 = i101119 ^ 105;
                                int i10125 = ((i101119 & 105) | i10124) << 1;
                                int i10126 = -i10124;
                                i16 = (i10125 & i10126) + (i10125 | i10126);
                                b = i16 % 128;
                                if (i16 % 2 == 0) {
                                    int i10127 = marginLayoutParams2.leftMargin;
                                    throw null;
                                }
                                if (marginLayoutParams2.leftMargin == iH2) {
                                    marginLayoutParams2.height = i15;
                                    marginLayoutParams2.leftMargin = iH2;
                                    int i1011110 = a;
                                    int i1011111 = ((i1011110 | 113) << 1) - (i1011110 ^ 113);
                                    b = i1011111 % 128;
                                    int i1113 = i1011111 % 2;
                                    marginLayoutParams2.rightMargin = i12;
                                    this.y.setLayoutParams(marginLayoutParams2);
                                } else {
                                    marginLayoutParams2.height = i15;
                                    marginLayoutParams2.leftMargin = iH2;
                                    int i1011112 = a;
                                    int i1011113 = ((i1011112 | 113) << 1) - (i1011112 ^ 113);
                                    b = i1011113 % 128;
                                    int i1114 = i1011113 % 2;
                                    marginLayoutParams2.rightMargin = i12;
                                    this.y.setLayoutParams(marginLayoutParams2);
                                }
                            } else {
                                marginLayoutParams2.height = i15;
                                marginLayoutParams2.leftMargin = iH2;
                                int i1011114 = a;
                                int i1011115 = ((i1011114 | 113) << 1) - (i1011114 ^ 113);
                                b = i1011115 % 128;
                                int i1115 = i1011115 % 2;
                                marginLayoutParams2.rightMargin = i12;
                                this.y.setLayoutParams(marginLayoutParams2);
                            }
                        }
                    }
                    view2 = this.y;
                    if (view2 != null) {
                        int i1116 = b;
                        int i1117 = i1116 ^ 97;
                        int i1118 = -(-((i1116 & 97) << 1));
                        int i1119 = (i1117 & i1118) + (i1118 | i1117);
                        a = i1119 % 128;
                        int i1120 = i1119 % 2;
                        z2 = true;
                    } else {
                        int i1210 = b + 103;
                        a = i1210 % 128;
                        int i1211 = i1210 % 2;
                        z2 = false;
                    }
                    if (z2) {
                        int i1212 = b;
                        int i1213 = (i1212 & 41) + (i1212 | 41);
                        a = i1213 % 128;
                        int i1214 = i1213 % 2;
                        if (view2.getVisibility() != 0) {
                            view3 = this.y;
                            if ((T.aWX.i(view3) & 8192) != 0) {
                                int i1215 = b;
                                int i1216 = ((i1215 | 2) << 1) - (i1215 ^ 2);
                                int i1217 = (i1216 ^ (-1)) + (i1216 << 1);
                                int i1218 = i1217 % 128;
                                a = i1218;
                                int i1219 = i1217 % 2;
                                int i1310 = (i1218 & 23) + (i1218 | 23);
                                b = i1310 % 128;
                                int i1311 = i1310 % 2;
                                int i1312 = i1218 & 83;
                                i20 = (((i1218 ^ 83) | i1312) << 1) - ((i1218 | 83) & (~i1312));
                                b = i20 % 128;
                                if (i20 % 2 == 0) {
                                    Object obj5 = l.c;
                                    obj.hashCode();
                                    throw null;
                                }
                                Context context3 = this.l;
                                Object obj6 = l.c;
                                int i1313 = a;
                                int i1314 = ((i1313 | 103) << 1) - (i1313 ^ 103);
                                b = i1314 % 128;
                                int i1315 = i1314 % 2;
                                iB = l.aUI.b(context3, ivas.gov.bisp.enumeration.R.color.abc_decor_view_status_guard_light);
                                int i1316 = b;
                                int i1317 = i1316 & 59;
                                int i1318 = -(-((i1316 ^ 59) | i1317));
                                int i1319 = ((i1317 | i1318) << 1) - (i1318 ^ i1317);
                                a = i1319 % 128;
                                int i1410 = i1319 % 2;
                            } else {
                                Context context4 = this.l;
                                Object obj7 = l.c;
                                int iB3 = l.aUI.b(context4, ivas.gov.bisp.enumeration.R.color.abc_decor_view_status_guard);
                                int i1411 = b;
                                int i1412 = (((i1411 | 79) << 1) - (~(-(((~i1411) & 79) | (i1411 & (-80)))))) - 1;
                                int i1413 = i1412 % 128;
                                a = i1413;
                                int i1414 = i1412 % 2;
                                int i1415 = i1413 | 53;
                                int i1416 = i1415 << 1;
                                int i1417 = -((~(i1413 & 53)) & i1415);
                                i19 = (i1416 ^ i1417) + ((i1417 & i1416) << 1);
                                b = i19 % 128;
                                if (i19 % 2 != 0) {
                                    int i1418 = 3 / 4;
                                }
                                iB = iB3;
                            }
                            view3.setBackgroundColor(iB);
                        }
                    }
                    if (!this.G) {
                        i17 = a + 83;
                        i18 = i17 % 128;
                        b = i18;
                        if (i17 % 2 != 0) {
                            int i1419 = 26 / 0;
                            if (z2) {
                                int i1510 = (i18 & (-40)) | ((~i18) & 39);
                                int i1511 = -(-((i18 & 39) << 1));
                                int i1512 = (i1510 & i1511) + (i1510 | i1511);
                                a = i1512 % 128;
                                int i1513 = i1512 % 2;
                                iJ = 0;
                            }
                        } else if (z2) {
                            int i1514 = (i18 & (-40)) | ((~i18) & 39);
                            int i1515 = -(-((i18 & 39) << 1));
                            int i1516 = (i1514 & i1515) + (i1514 | i1515);
                            a = i1516 % 128;
                            int i1517 = i1516 % 2;
                            iJ = 0;
                        }
                    }
                    int i1518 = b;
                    int i1519 = i1518 ^ 45;
                    int i1610 = ((i1518 & 45) | i1519) << 1;
                    int i1611 = -i1519;
                    int i1612 = (i1610 & i1611) + (i1610 | i1611);
                    a = i1612 % 128;
                    int i1613 = i1612 % 2;
                    z3 = z;
                    z4 = z2;
                } else if (marginLayoutParams.topMargin != 0) {
                    int i1614 = a;
                    int i1615 = (i1614 & (-34)) | ((~i1614) & 33);
                    int i1616 = -(-((i1614 & 33) << 1));
                    i26 = (i1615 & i1616) + (i1616 | i1615);
                    b = i26 % 128;
                    if (i26 % 2 != 0) {
                        marginLayoutParams.topMargin = 1;
                        z4 = true;
                    } else {
                        marginLayoutParams.topMargin = 0;
                        z4 = false;
                    }
                    int i1617 = a;
                    int i1618 = i1617 & 83;
                    int i1619 = ((((i1617 ^ 83) | i1618) << 1) - (~(-((i1617 | 83) & (~i1618))))) - 1;
                    b = i1619 % 128;
                    int i1710 = i1619 % 2;
                    z3 = true;
                } else {
                    z3 = false;
                    z4 = false;
                }
                if (z3) {
                    int i1711 = a;
                    int i1712 = i1711 & 75;
                    int i1713 = i1711 | 75;
                    int i1714 = (i1712 & i1713) + (i1713 | i1712);
                    b = i1714 % 128;
                    int i1715 = i1714 % 2;
                    this.u.setLayoutParams(marginLayoutParams);
                    int i1716 = a;
                    int i1717 = (i1716 & 109) + (i1716 | 109);
                    int i1718 = i1717 % 128;
                    b = i1718;
                    int i1719 = i1717 % 2;
                    int i1810 = i1718 & 123;
                    int i1811 = (i1718 | 123) & (~i1810);
                    int i1812 = -(-(i1810 << 1));
                    int i1813 = (i1811 & i1812) + (i1811 | i1812);
                    a = i1813 % 128;
                    int i1814 = i1813 % 2;
                }
            }
        }
        view4 = this.y;
        if (view4 != null) {
            int i1815 = b;
            int i1816 = ((i1815 | 53) << 1) - (i1815 ^ 53);
            i28 = i1816 % 128;
            a = i28;
            int i1817 = i1816 % 2;
            if (z4) {
                int i1818 = i28 & 41;
                int i1819 = ((i28 ^ 41) | i1818) << 1;
                int i1910 = -((i28 | 41) & (~i1818));
                int i1911 = ((i1819 | i1910) << 1) - (i1910 ^ i1819);
                b = i1911 % 128;
                int i1912 = i1911 % 2;
                i29 = 0;
            } else {
                i29 = 8;
            }
            view4.setVisibility(i29);
            int i1913 = b;
            int i1914 = i1913 & 59;
            int i1915 = -(-(i1913 | 59));
            int i1916 = (i1914 & i1915) + (i1915 | i1914);
            a = i1916 % 128;
            int i1917 = i1916 % 2;
        }
        int i1918 = a;
        i27 = (i1918 & 37) + (i1918 | 37);
        b = i27 % 128;
        if (i27 % 2 != 0) {
            int i1919 = 11 / 0;
        }
        return iJ;
        int i200 = b + 37;
        a = i200 % 128;
        int i201 = i200 % 2;
        z4 = false;
        view4 = this.y;
        if (view4 != null) {
            int i18110 = b;
            int i18111 = ((i18110 | 53) << 1) - (i18110 ^ 53);
            i28 = i18111 % 128;
            a = i28;
            int i18112 = i18111 % 2;
            if (z4) {
                int i18113 = i28 & 41;
                int i18114 = ((i28 ^ 41) | i18113) << 1;
                int i19110 = -((i28 | 41) & (~i18113));
                int i19111 = ((i18114 | i19110) << 1) - (i19110 ^ i18114);
                b = i19111 % 128;
                int i19112 = i19111 % 2;
                i29 = 0;
            } else {
                i29 = 8;
            }
            view4.setVisibility(i29);
            int i19113 = b;
            int i19114 = i19113 & 59;
            int i19115 = -(-(i19113 | 59));
            int i19116 = (i19114 & i19115) + (i19115 | i19114);
            a = i19116 % 128;
            int i19117 = i19116 % 2;
        }
        int i19118 = a;
        i27 = (i19118 & 37) + (i19118 | 37);
        b = i27 % 128;
        if (i27 % 2 != 0) {
            int i19119 = 11 / 0;
        }
        return iJ;
    }

    /* JADX WARN: Code duplicated, block: B:172:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:184:0x0547 A[PHI: r0
  0x0547: PHI (r0v29 android.content.res.TypedArray) = (r0v23 android.content.res.TypedArray), (r0v31 android.content.res.TypedArray) binds: [B:182:0x0544, B:179:0x0537] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:23:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:26:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:67:0x01ec  */
    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        Context hVar;
        View oo000oVar;
        TypedArray typedArrayObtainStyledAttributes;
        Object[] objArr;
        char c;
        Object[] objArr2;
        String attributeValue = str;
        int i = 2 % 2;
        if (this.ad == null) {
            int i2 = b;
            int i3 = i2 & 21;
            int i4 = (((i2 ^ 21) | i3) << 1) - ((i2 | 21) & (~i3));
            a = i4 % 128;
            int i5 = i4 % 2;
            String string = this.l.obtainStyledAttributes(ivas.gov.bisp.enumeration.p006af.h.l).getString(116);
            if (string == null) {
                this.ad = new O();
            } else {
                try {
                    Constructor<?> declaredConstructor = this.l.getClassLoader().loadClass(string).getDeclaredConstructor(new Class[0]);
                    int i6 = a;
                    int i7 = (i6 ^ 35) + ((i6 & 35) << 1);
                    b = i7 % 128;
                    int i8 = i7 % 2;
                    O o2 = (O) declaredConstructor.newInstance(new Object[0]);
                    int i9 = b;
                    int i10 = (i9 & 121) + (i9 | 121);
                    a = i10 % 128;
                    int i11 = i10 % 2;
                    this.ad = o2;
                } catch (Throwable unused) {
                    this.ad = new O();
                }
            }
        }
        O o3 = this.ad;
        int i12 = ah.a;
        Objects.requireNonNull(o3);
        int[] iArr = ivas.gov.bisp.enumeration.p006af.h.B;
        int i13 = a + 31;
        b = i13 % 128;
        int i14 = i13 % 2;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        byte b2 = 4;
        int resourceId = typedArrayObtainStyledAttributes2.getResourceId(4, 0);
        int i15 = b + 66;
        int i16 = (i15 ^ (-1)) + (i15 << 1);
        a = i16 % 128;
        int i17 = i16 % 2;
        typedArrayObtainStyledAttributes2.recycle();
        if (resourceId != 0) {
            int i18 = b;
            int i19 = i18 | 33;
            int i20 = (i19 << 1) - (i19 & (~(i18 & 33)));
            a = i20 % 128;
            if (i20 % 2 == 0) {
                int i21 = 50 / 0;
                if (context instanceof h) {
                    int i22 = ((((i18 ^ 3) | (i18 & 3)) << 1) - (~(-(((~i18) & 3) | (i18 & (-4)))))) - 1;
                    a = i22 % 128;
                    int i23 = i22 % 2;
                    if (((h) context).c != resourceId) {
                        hVar = context;
                    }
                }
            } else if (context instanceof h) {
                int i24 = ((((i18 ^ 3) | (i18 & 3)) << 1) - (~(-(((~i18) & 3) | (i18 & (-4)))))) - 1;
                a = i24 % 128;
                int i25 = i24 % 2;
                if (((h) context).c != resourceId) {
                    hVar = context;
                }
            }
            hVar = new h(context, resourceId);
            int i26 = a;
            int i27 = i26 & 125;
            int i28 = -(-(i26 | 125));
            int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
            b = i29 % 128;
            int i30 = i29 % 2;
        } else {
            hVar = context;
        }
        Objects.requireNonNull(str);
        switch (str.hashCode()) {
            case -1946472170:
                if (!attributeValue.equals("RatingBar")) {
                    b2 = -1;
                } else {
                    int i31 = b;
                    int i32 = i31 + 91;
                    a = i32 % 128;
                    int i33 = i32 % 2;
                    int i34 = ((i31 | 75) << 1) - (i31 ^ 75);
                    a = i34 % 128;
                    int i35 = i34 % 2;
                    b2 = 0;
                }
                break;
            case -1455429095:
                if (!(!attributeValue.equals("CheckedTextView"))) {
                    int i36 = a + 91;
                    int i37 = i36 % 128;
                    b = i37;
                    int i38 = i36 % 2;
                    int i39 = ((i37 | 19) << 1) - (i37 ^ 19);
                    a = i39 % 128;
                    if (i39 % 2 == 0) {
                        int i40 = 4 / 4;
                    }
                    b2 = 1;
                } else {
                    b2 = -1;
                }
                break;
            case -1346021293:
                if (!attributeValue.equals("MultiAutoCompleteTextView")) {
                    b2 = -1;
                } else {
                    int i41 = b + 35;
                    a = i41 % 128;
                    int i42 = i41 % 2;
                    b2 = 2;
                }
                break;
            case -938935918:
                if (attributeValue.equals("TextView")) {
                    int i43 = b;
                    int i44 = ((i43 ^ 43) | (i43 & 43)) << 1;
                    int i45 = -((i43 & (-44)) | ((~i43) & 43));
                    int i46 = (i44 ^ i45) + ((i45 & i44) << 1);
                    a = i46 % 128;
                    if (i46 % 2 != 0) {
                        b2 = 3;
                    } else {
                        b2 = 5;
                    }
                } else {
                    b2 = -1;
                }
                break;
            case -937446323:
                if (!attributeValue.equals("ImageButton")) {
                    b2 = -1;
                }
                break;
            case -658531749:
                if (!attributeValue.equals("SeekBar")) {
                    b2 = -1;
                } else {
                    b2 = 5;
                }
                break;
            case -339785223:
                if (!attributeValue.equals("Spinner")) {
                    b2 = -1;
                } else {
                    int i47 = a;
                    int i48 = ((i47 & 70) + (i47 | 70)) - 1;
                    b = i48 % 128;
                    b2 = i48 % 2 == 0 ? (byte) 6 : (byte) 47;
                }
                break;
            case 776382189:
                if (!attributeValue.equals("RadioButton")) {
                    b2 = -1;
                } else {
                    int i49 = b;
                    int i50 = i49 + 16;
                    int i51 = (i50 ^ (-1)) + (i50 << 1);
                    a = i51 % 128;
                    int i52 = i51 % 2;
                    int i53 = i49 & 75;
                    int i54 = (i53 - (~((i49 ^ 75) | i53))) - 1;
                    a = i54 % 128;
                    int i55 = i54 % 2;
                    b2 = 7;
                }
                break;
            case 799298502:
                b2 = attributeValue.equals("ToggleButton") ? (byte) 8 : (byte) -1;
                break;
            case 1125864064:
                if (!attributeValue.equals("ImageView")) {
                    b2 = -1;
                } else {
                    int i56 = b;
                    int i57 = (i56 ^ 45) + ((i56 & 45) << 1);
                    a = i57 % 128;
                    b2 = i57 % 2 != 0 ? (byte) 9 : (byte) 74;
                }
                break;
            case 1413872058:
                if (!attributeValue.equals("AutoCompleteTextView")) {
                    b2 = -1;
                } else {
                    int i58 = a;
                    int i59 = i58 & 71;
                    int i60 = ((i58 | 71) & (~i59)) + (i59 << 1);
                    b = i60 % 128;
                    int i61 = i60 % 2;
                    b2 = 10;
                }
                break;
            case 1601505219:
                if (!attributeValue.equals("CheckBox")) {
                    b2 = -1;
                } else {
                    int i62 = b;
                    int i63 = i62 & 111;
                    int i64 = (i63 - (~(-(-((i62 ^ 111) | i63))))) - 1;
                    a = i64 % 128;
                    b2 = i64 % 2 != 0 ? (byte) 11 : (byte) 55;
                }
                break;
            case 1666676343:
                b2 = attributeValue.equals("EditText") ? (byte) 12 : (byte) -1;
                break;
            case 2001146706:
                if (!attributeValue.equals("Button")) {
                    b2 = -1;
                } else {
                    int i65 = b;
                    int i66 = i65 | 113;
                    int i67 = i66 << 1;
                    int i68 = -((~(i65 & 113)) & i66);
                    int i69 = (i67 & i68) + (i68 | i67);
                    a = i69 % 128;
                    int i70 = i69 % 2;
                    b2 = 13;
                }
                break;
            default:
                b2 = -1;
                break;
        }
        View view2 = null;
        switch (b2) {
            case 0:
                oo000oVar = new oo000o(hVar, attributeSet);
                int i71 = a;
                int i72 = ((i71 | 87) << 1) - (i71 ^ 87);
                b = i72 % 128;
                int i73 = i72 % 2;
                break;
            case 1:
                oo000oVar = new OooOO0(hVar, attributeSet);
                break;
            case 2:
                oo000oVar = new o0OoOo0(hVar, attributeSet);
                int i74 = b;
                int i75 = (i74 ^ 35) + ((i74 & 35) << 1);
                a = i75 % 128;
                int i76 = i75 % 2;
                break;
            case 3:
                oo000oVar = o3.h(hVar, attributeSet);
                o3.i(oo000oVar, attributeValue);
                break;
            case 4:
                oo000oVar = new Oooo000(hVar, attributeSet);
                break;
            case 5:
                oo000oVar = new o0ooOOo(hVar, attributeSet);
                int i77 = a;
                int i78 = (i77 & (-100)) | ((~i77) & 99);
                int i79 = (i77 & 99) << 1;
                int i80 = ((i78 | i79) << 1) - (i79 ^ i78);
                b = i80 % 128;
                if (i80 % 2 != 0) {
                    throw null;
                }
                break;
            case 6:
                oo000oVar = new o0OO00O(hVar, attributeSet, ivas.gov.bisp.enumeration.R.attr.spinnerStyle);
                int i81 = b;
                int i82 = ((i81 | 102) << 1) - (i81 ^ 102);
                int i83 = (i82 ^ (-1)) + (i82 << 1);
                a = i83 % 128;
                int i84 = i83 % 2;
                break;
            case 7:
                oo000oVar = o3.f(hVar, attributeSet);
                o3.i(oo000oVar, attributeValue);
                break;
            case 8:
                oo000oVar = new o000000O(hVar, attributeSet);
                break;
            case 9:
                oo000oVar = new o000oOoO(hVar, attributeSet, 0);
                int i85 = b;
                int i86 = ((i85 ^ 11) - (~(-(-((i85 & 11) << 1))))) - 1;
                a = i86 % 128;
                if (i86 % 2 == 0) {
                    int i87 = 3 % 2;
                }
                break;
            case 10:
                oo000oVar = o3.c(hVar, attributeSet);
                int i88 = b;
                int i89 = (i88 & (-116)) | ((~i88) & 115);
                int i90 = (i88 & 115) << 1;
                int i91 = (i89 & i90) + (i90 | i89);
                a = i91 % 128;
                int i92 = i91 % 2;
                o3.i(oo000oVar, attributeValue);
                break;
            case 11:
                oo000oVar = o3.e(hVar, attributeSet);
                o3.i(oo000oVar, attributeValue);
                break;
            case 12:
                oo000oVar = new ivas.gov.bisp.enumeration.OooOOO0.OooOOOO(hVar, attributeSet);
                int i93 = b;
                int i94 = (i93 | 19) << 1;
                int i95 = -((i93 & (-20)) | ((~i93) & 19));
                int i96 = (i94 & i95) + (i95 | i94);
                a = i96 % 128;
                int i97 = i96 % 2;
                break;
            case 13:
                oo000oVar = o3.d(hVar, attributeSet);
                int i98 = b + 18;
                int i99 = (i98 ^ (-1)) + (i98 << 1);
                a = i99 % 128;
                if (i99 % 2 == 0) {
                    o3.i(oo000oVar, attributeValue);
                    view2.hashCode();
                    throw null;
                }
                o3.i(oo000oVar, attributeValue);
                break;
                break;
            default:
                oo000oVar = null;
                break;
        }
        if (oo000oVar == null) {
            int i100 = a;
            int i101 = i100 & 97;
            int i102 = ((i100 ^ 97) | i101) << 1;
            int i103 = -((i100 | 97) & (~i101));
            int i104 = ((i102 | i103) << 1) - (i103 ^ i102);
            int i105 = i104 % 128;
            b = i105;
            int i106 = i104 % 2;
            if (context != hVar) {
                int i107 = ((i105 & 100) + (i105 | 100)) - 1;
                a = i107 % 128;
                if (i107 % 2 == 0) {
                    attributeValue.equals("view");
                    throw null;
                }
                if (!(!attributeValue.equals("view"))) {
                    attributeValue = attributeSet.getAttributeValue(null, "class");
                }
                try {
                    Object[] objArr3 = o3.j;
                    objArr3[0] = hVar;
                    int i108 = a;
                    int i109 = (i108 & (-48)) | ((~i108) & 47);
                    int i110 = (i108 & 47) << 1;
                    int i111 = (i109 & i110) + (i110 | i109);
                    b = i111 % 128;
                    int i112 = i111 % 2;
                    objArr3[1] = attributeSet;
                    if (-1 == attributeValue.indexOf(46)) {
                        int i113 = a;
                        int i114 = i113 & 61;
                        int i115 = -(-((i113 ^ 61) | i114));
                        int i116 = (i114 & i115) + (i115 | i114);
                        b = i116 % 128;
                        int i117 = i116 % 2;
                        int i118 = 0;
                        while (true) {
                            String[] strArr = O.h;
                            if (i118 < strArr.length) {
                                int i119 = a + 19;
                                b = i119 % 128;
                                int i120 = i119 % 2;
                                View viewG = o3.g(hVar, attributeValue, strArr[i118]);
                                int i121 = a;
                                int i122 = i121 ^ 103;
                                int i123 = ((i121 & 103) | i122) << 1;
                                int i124 = -i122;
                                int i125 = (i123 ^ i124) + ((i124 & i123) << 1);
                                int i126 = i125 % 128;
                                b = i126;
                                if (i125 % 2 != 0) {
                                    view2.hashCode();
                                    throw null;
                                }
                                if (viewG != null) {
                                    int i127 = ((i121 | 31) << 1) - (i121 ^ 31);
                                    b = i127 % 128;
                                    if (i127 % 2 != 0) {
                                        objArr2 = o3.j;
                                        objArr2[0] = null;
                                    } else {
                                        objArr2 = o3.j;
                                        objArr2[0] = null;
                                    }
                                    objArr2[1] = null;
                                    int i128 = b;
                                    int i129 = ((i128 & 58) + (i128 | 58)) - 1;
                                    a = i129 % 128;
                                    int i130 = i129 % 2;
                                    view2 = viewG;
                                } else {
                                    i118++;
                                    int i131 = (-2) - ((i126 + 94) ^ (-1));
                                    a = i131 % 128;
                                    int i132 = i131 % 2;
                                }
                            } else {
                                Object[] objArr4 = o3.j;
                                objArr4[0] = null;
                                objArr4[1] = null;
                            }
                        }
                    } else {
                        View viewG2 = o3.g(hVar, attributeValue, null);
                        int i133 = b;
                        int i134 = ((i133 ^ 97) | (i133 & 97)) << 1;
                        int i135 = -(((~i133) & 97) | (i133 & (-98)));
                        int i136 = ((i134 | i135) << 1) - (i135 ^ i134);
                        a = i136 % 128;
                        if (i136 % 2 == 0) {
                            objArr = o3.j;
                            objArr[1] = null;
                            c = 0;
                        } else {
                            objArr = o3.j;
                            objArr[0] = null;
                            c = 1;
                        }
                        objArr[c] = null;
                        int i137 = a;
                        int i138 = i137 ^ 33;
                        int i139 = (i137 & 33) << 1;
                        int i140 = (i138 ^ i139) + ((i139 & i138) << 1);
                        b = i140 % 128;
                        int i141 = i140 % 2;
                        view2 = viewG2;
                    }
                } catch (Exception unused2) {
                    Object[] objArr5 = o3.j;
                    objArr5[0] = null;
                    objArr5[1] = null;
                } catch (Throwable th) {
                    Object[] objArr6 = o3.j;
                    objArr6[0] = null;
                    objArr6[1] = null;
                    throw th;
                }
                int i142 = a;
                int i143 = i142 & 61;
                int i144 = (i143 - (~((i142 ^ 61) | i143))) - 1;
                b = i144 % 128;
                int i145 = i144 % 2;
                oo000oVar = view2;
            }
        }
        if (oo000oVar != null) {
            int i146 = a;
            int i147 = ((i146 | 75) << 1) - (i146 ^ 75);
            b = i147 % 128;
            int i148 = i147 % 2;
            Context context2 = oo000oVar.getContext();
            if (context2 instanceof ContextWrapper) {
                int i149 = a + 81;
                b = i149 % 128;
                int i150 = i149 % 2;
                WeakHashMap<View, R> weakHashMap = T.c;
                if (T.aWW.b(oo000oVar)) {
                    TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, O.d);
                    String string2 = typedArrayObtainStyledAttributes3.getString(0);
                    int i151 = b + 29;
                    a = i151 % 128;
                    if (i151 % 2 == 0) {
                        int i152 = 32 / 0;
                        if (string2 != null) {
                            oo000oVar.setOnClickListener(new O.aQS(oo000oVar, string2));
                            int i153 = b + 39;
                            a = i153 % 128;
                            int i154 = i153 % 2;
                        }
                    } else if (string2 != null) {
                        oo000oVar.setOnClickListener(new O.aQS(oo000oVar, string2));
                        int i155 = b + 39;
                        a = i155 % 128;
                        int i156 = i155 % 2;
                    }
                    typedArrayObtainStyledAttributes3.recycle();
                }
            }
            if (Build.VERSION.SDK_INT <= 28) {
                int i157 = a;
                int i158 = i157 & 85;
                int i159 = -(-((i157 ^ 85) | i158));
                int i160 = (i158 ^ i159) + ((i159 & i158) << 1);
                b = i160 % 128;
                if (i160 % 2 != 0) {
                    typedArrayObtainStyledAttributes = hVar.obtainStyledAttributes(attributeSet, O.e);
                    if (typedArrayObtainStyledAttributes.hasValue(0)) {
                        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
                        WeakHashMap<View, R> weakHashMap2 = T.c;
                        new Q(ivas.gov.bisp.enumeration.R.id.tag_accessibility_heading, Boolean.class, 28).i(oo000oVar, Boolean.valueOf(z));
                    }
                } else {
                    typedArrayObtainStyledAttributes = hVar.obtainStyledAttributes(attributeSet, O.e);
                    if (typedArrayObtainStyledAttributes.hasValue(0)) {
                        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(0, false);
                        WeakHashMap<View, R> weakHashMap3 = T.c;
                        new Q(ivas.gov.bisp.enumeration.R.id.tag_accessibility_heading, Boolean.class, 28).i(oo000oVar, Boolean.valueOf(z2));
                    }
                }
                typedArrayObtainStyledAttributes.recycle();
                TypedArray typedArrayObtainStyledAttributes4 = hVar.obtainStyledAttributes(attributeSet, O.g);
                if (typedArrayObtainStyledAttributes4.hasValue(0)) {
                    int i161 = a;
                    int i162 = i161 & 5;
                    int i163 = -(-((i161 ^ 5) | i162));
                    int i164 = (i162 & i163) + (i163 | i162);
                    b = i164 % 128;
                    int i165 = i164 % 2;
                    T.r(oo000oVar, typedArrayObtainStyledAttributes4.getString(0));
                    int i166 = a;
                    int i167 = (i166 ^ 23) + ((i166 & 23) << 1);
                    b = i167 % 128;
                    int i168 = i167 % 2;
                }
                typedArrayObtainStyledAttributes4.recycle();
                TypedArray typedArrayObtainStyledAttributes5 = hVar.obtainStyledAttributes(attributeSet, O.f);
                if (typedArrayObtainStyledAttributes5.hasValue(0)) {
                    boolean z3 = typedArrayObtainStyledAttributes5.getBoolean(0, false);
                    WeakHashMap<View, R> weakHashMap4 = T.c;
                    C0285m c0285m = new C0285m(ivas.gov.bisp.enumeration.R.id.tag_screen_reader_focusable, Boolean.class, 28);
                    int i169 = a;
                    int i170 = i169 & 91;
                    int i171 = (((i169 ^ 91) | i170) << 1) - ((i169 | 91) & (~i170));
                    b = i171 % 128;
                    int i172 = i171 % 2;
                    c0285m.i(oo000oVar, Boolean.valueOf(z3));
                }
                typedArrayObtainStyledAttributes5.recycle();
            }
        }
        int i173 = b;
        int i174 = i173 & 95;
        int i175 = -(-(i173 | 95));
        int i176 = (i174 & i175) + (i175 | i174);
        a = i176 % 128;
        if (i176 % 2 == 0) {
            int i177 = 79 / 0;
        }
        return oo000oVar;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x023c  */
    /* JADX WARN: Code duplicated, block: B:103:0x0261  */
    /* JADX WARN: Code duplicated, block: B:104:0x0262  */
    /* JADX WARN: Code duplicated, block: B:106:0x0268  */
    /* JADX WARN: Code duplicated, block: B:108:0x026d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0277  */
    /* JADX WARN: Code duplicated, block: B:113:0x0281  */
    /* JADX WARN: Code duplicated, block: B:122:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:124:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:125:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:128:0x02de  */
    /* JADX WARN: Code duplicated, block: B:129:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:132:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:140:0x0312  */
    /* JADX WARN: Code duplicated, block: B:142:0x0316  */
    /* JADX WARN: Code duplicated, block: B:144:0x0329 A[Catch: NoSuchFieldException -> 0x0369, TRY_ENTER, TRY_LEAVE, TryCatch #0 {NoSuchFieldException -> 0x0369, blocks: (B:144:0x0329, B:146:0x0348, B:148:0x0359, B:149:0x0363, B:150:0x0366), top: B:269:0x0327 }] */
    /* JADX WARN: Code duplicated, block: B:148:0x0359 A[Catch: NoSuchFieldException -> 0x0369, TRY_ENTER, TRY_LEAVE, TryCatch #0 {NoSuchFieldException -> 0x0369, blocks: (B:144:0x0329, B:146:0x0348, B:148:0x0359, B:149:0x0363, B:150:0x0366), top: B:269:0x0327 }] */
    /* JADX WARN: Code duplicated, block: B:158:0x0375  */
    /* JADX WARN: Code duplicated, block: B:164:0x0398  */
    /* JADX WARN: Code duplicated, block: B:166:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:174:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:176:0x03da A[Catch: IllegalAccessException -> 0x03df, TRY_ENTER, TryCatch #3 {IllegalAccessException -> 0x03df, blocks: (B:176:0x03da, B:179:0x03e1, B:180:0x03e4), top: B:274:0x03d8 }] */
    /* JADX WARN: Code duplicated, block: B:179:0x03e1 A[Catch: IllegalAccessException -> 0x03df, TRY_LEAVE, TryCatch #3 {IllegalAccessException -> 0x03df, blocks: (B:176:0x03da, B:179:0x03e1, B:180:0x03e4), top: B:274:0x03d8 }] */
    /* JADX WARN: Code duplicated, block: B:185:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:187:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:189:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:190:0x0400  */
    /* JADX WARN: Code duplicated, block: B:192:0x0407  */
    /* JADX WARN: Code duplicated, block: B:194:0x040b  */
    /* JADX WARN: Code duplicated, block: B:198:0x0438 A[Catch: NoSuchFieldException -> 0x0445, TRY_ENTER, TryCatch #7 {NoSuchFieldException -> 0x0445, blocks: (B:195:0x0425, B:198:0x0438, B:199:0x043f), top: B:281:0x0425 }] */
    /* JADX WARN: Code duplicated, block: B:199:0x043f A[Catch: NoSuchFieldException -> 0x0445, TRY_LEAVE, TryCatch #7 {NoSuchFieldException -> 0x0445, blocks: (B:195:0x0425, B:198:0x0438, B:199:0x043f), top: B:281:0x0425 }] */
    /* JADX WARN: Code duplicated, block: B:206:0x0461  */
    /* JADX WARN: Code duplicated, block: B:212:0x047f  */
    /* JADX WARN: Code duplicated, block: B:215:0x049f  */
    /* JADX WARN: Code duplicated, block: B:217:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:218:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:220:0x04de  */
    /* JADX WARN: Code duplicated, block: B:222:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:225:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:227:0x04fa A[PHI: r3
  0x04fa: PHI (r3v28 java.lang.Object) = (r3v27 java.lang.Object), (r3v30 java.lang.Object) binds: [B:226:0x04f8, B:223:0x04f1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:229:0x0507  */
    /* JADX WARN: Code duplicated, block: B:231:0x052b  */
    /* JADX WARN: Code duplicated, block: B:232:0x0551  */
    /* JADX WARN: Code duplicated, block: B:234:0x0554  */
    /* JADX WARN: Code duplicated, block: B:235:0x0565  */
    /* JADX WARN: Code duplicated, block: B:237:0x0569  */
    /* JADX WARN: Code duplicated, block: B:26:0x0098  */
    /* JADX WARN: Code duplicated, block: B:277:0x00b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:30:0x00af  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:36:0x00cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:48:0x0117 A[Catch: NameNotFoundException -> 0x0152, TRY_ENTER, TryCatch #5 {NameNotFoundException -> 0x0152, blocks: (B:32:0x00b5, B:45:0x00f7, B:48:0x0117, B:50:0x011d, B:55:0x0148, B:56:0x014b), top: B:277:0x00b5 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0147  */
    /* JADX WARN: Code duplicated, block: B:56:0x014b A[Catch: NameNotFoundException -> 0x0152, TRY_LEAVE, TryCatch #5 {NameNotFoundException -> 0x0152, blocks: (B:32:0x00b5, B:45:0x00f7, B:48:0x0117, B:50:0x011d, B:55:0x0148, B:56:0x014b), top: B:277:0x00b5 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:77:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:79:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:82:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:84:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:90:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:92:0x0206  */
    /* JADX WARN: Code duplicated, block: B:94:0x020e  */
    /* JADX WARN: Code duplicated, block: B:96:0x0221  */
    /* JADX WARN: Code duplicated, block: B:98:0x022d  */
    /* JADX WARN: Code duplicated, block: B:99:0x023a A[DONT_INVERT] */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean D(boolean z) throws IllegalAccessException {
        Configuration configurationJ;
        boolean z2;
        boolean z3;
        Resources resources;
        Configuration configuration;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Object obj;
        int i8;
        Activity activity;
        boolean z4;
        Resources.Theme theme;
        int i9;
        int i10;
        Field field;
        Field declaredField;
        int i11;
        Field field2;
        Object obj2;
        Field field3;
        Object obj3;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Object obj4;
        int i18;
        int i19;
        Activity activity2;
        int i20;
        int i21;
        PackageManager packageManager;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        ComponentName componentName;
        int i27;
        ActivityInfo activityInfo;
        boolean z5;
        int i28;
        int i29 = 2 % 2;
        int i30 = a;
        int i31 = i30 & 27;
        int i32 = (~i31) & (i30 | 27);
        int i33 = i31 << 1;
        int i34 = (i32 ^ i33) + ((i33 & i32) << 1);
        int i35 = i34 % 128;
        b = i35;
        int i36 = i34 % 2;
        if (this.S) {
            int i37 = ((i30 ^ 111) | (i30 & 111)) << 1;
            int i38 = -(((~i30) & 111) | (i30 & (-112)));
            int i39 = (i37 & i38) + (i38 | i37);
            b = i39 % 128;
            int i40 = i39 % 2;
            return false;
        }
        int i41 = this.T;
        int i42 = -100;
        if (i41 == -100) {
            int i43 = (i35 & 89) + (i35 | 89);
            a = i43 % 128;
            if (i43 % 2 == 0) {
                i42 = 2;
            }
        } else {
            i42 = i41;
        }
        int iU = U(this.l, i42);
        int i44 = b;
        int i45 = (i44 ^ 95) + ((i44 & 95) << 1);
        a = i45 % 128;
        Object obj5 = null;
        if (i45 % 2 == 0) {
            configurationJ = J(this.l, iU, null);
            int i46 = 86 / 0;
        } else {
            configurationJ = J(this.l, iU, null);
        }
        if (this.X) {
            this.X = true;
            z2 = this.K;
        } else {
            int i47 = b;
            int i48 = (i47 & 95) + (i47 | 95);
            a = i48 % 128;
            if (i48 % 2 == 0) {
                int i49 = 56 / 0;
                if (this.j instanceof Activity) {
                    packageManager = this.l.getPackageManager();
                    if (packageManager == null) {
                        int i50 = a;
                        i28 = ((i50 | 97) << 1) - (i50 ^ 97);
                        b = i28 % 128;
                        if (i28 % 2 != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } else {
                        try {
                            i22 = Build.VERSION.SDK_INT;
                            if (i22 >= 29) {
                                int i51 = a;
                                int i52 = i51 & 73;
                                int i53 = (i51 ^ 73) | i52;
                                int i54 = (i52 ^ i53) + ((i53 & i52) << 1);
                                b = i54 % 128;
                                int i55 = i54 % 2;
                                i23 = 269221888;
                            } else if (i22 >= 24) {
                                int i56 = a;
                                i24 = (((i56 & (-84)) | ((~i56) & 83)) - (~(-(-((i56 & 83) << 1))))) - 1;
                                i25 = i24 % 128;
                                b = i25;
                                if (i24 % 2 == 0) {
                                    throw null;
                                }
                                i26 = i25 + 23;
                                a = i26 % 128;
                                if (i26 % 2 == 0) {
                                    int i57 = 5 % 2;
                                }
                                i23 = 786432;
                            } else {
                                i23 = 0;
                            }
                            componentName = new ComponentName(this.l, this.j.getClass());
                            int i58 = b;
                            int i59 = i58 & 17;
                            i27 = (((i58 | 17) & (~i59)) - (~(i59 << 1))) - 1;
                            a = i27 % 128;
                            if (i27 % 2 != 0) {
                                packageManager.getActivityInfo(componentName, i23);
                                obj5.hashCode();
                                throw null;
                            }
                            activityInfo = packageManager.getActivityInfo(componentName, i23);
                            if (activityInfo != null || (activityInfo.configChanges & 512) == 0) {
                                z5 = false;
                            } else {
                                int i60 = a;
                                int i61 = i60 & 87;
                                int i62 = (~i61) & (i60 | 87);
                                int i63 = -(-(i61 << 1));
                                int i64 = ((i62 | i63) << 1) - (i63 ^ i62);
                                b = i64 % 128;
                                int i65 = i64 % 2;
                                int i66 = i60 & 113;
                                int i67 = (i66 - (~((i60 ^ 113) | i66))) - 1;
                                b = i67 % 128;
                                int i68 = i67 % 2;
                                z5 = true;
                            }
                            this.K = z5;
                        } catch (PackageManager.NameNotFoundException unused) {
                            this.K = false;
                        }
                    }
                }
            } else if (this.j instanceof Activity) {
                packageManager = this.l.getPackageManager();
                if (packageManager == null) {
                    int i510 = a;
                    i28 = ((i510 | 97) << 1) - (i510 ^ 97);
                    b = i28 % 128;
                    if (i28 % 2 != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    i22 = Build.VERSION.SDK_INT;
                    if (i22 >= 29) {
                        int i511 = a;
                        int i512 = i511 & 73;
                        int i513 = (i511 ^ 73) | i512;
                        int i514 = (i512 ^ i513) + ((i513 & i512) << 1);
                        b = i514 % 128;
                        int i515 = i514 % 2;
                        i23 = 269221888;
                    } else if (i22 >= 24) {
                        int i516 = a;
                        i24 = (((i516 & (-84)) | ((~i516) & 83)) - (~(-(-((i516 & 83) << 1))))) - 1;
                        i25 = i24 % 128;
                        b = i25;
                        if (i24 % 2 == 0) {
                            throw null;
                        }
                        i26 = i25 + 23;
                        a = i26 % 128;
                        if (i26 % 2 == 0) {
                            int i517 = 5 % 2;
                        }
                        i23 = 786432;
                    } else {
                        i23 = 0;
                    }
                    componentName = new ComponentName(this.l, this.j.getClass());
                    int i518 = b;
                    int i519 = i518 & 17;
                    i27 = (((i518 | 17) & (~i519)) - (~(i519 << 1))) - 1;
                    a = i27 % 128;
                    if (i27 % 2 != 0) {
                        packageManager.getActivityInfo(componentName, i23);
                        obj5.hashCode();
                        throw null;
                    }
                    activityInfo = packageManager.getActivityInfo(componentName, i23);
                    if (activityInfo != null) {
                        z5 = false;
                    } else {
                        z5 = false;
                    }
                    this.K = z5;
                }
            }
            this.X = true;
            z2 = this.K;
        }
        Configuration configuration2 = this.R;
        if (configuration2 == null) {
            configuration2 = this.l.getResources().getConfiguration();
        }
        int i69 = configuration2.uiMode & 48;
        int i70 = configurationJ.uiMode;
        int i71 = b;
        int i72 = ((i71 ^ 39) - (~(-(-((i71 & 39) << 1))))) - 1;
        int i73 = i72 % 128;
        a = i73;
        int i74 = i72 % 2;
        int i75 = i70 & 48;
        if (i69 != i75) {
            int i76 = i73 ^ 27;
            int i77 = ((i73 & 27) | i76) << 1;
            int i78 = -i76;
            int i79 = (i77 & i78) + (i77 | i78);
            int i80 = i79 % 128;
            b = i80;
            if (i79 % 2 != 0) {
                throw null;
            }
            if (z) {
                int i81 = i80 ^ 33;
                int i82 = ((i80 & 33) | i81) << 1;
                int i83 = -i81;
                int i84 = ((i82 | i83) << 1) - (i83 ^ i82);
                a = i84 % 128;
                if (i84 % 2 == 0) {
                    int i85 = 10 / 0;
                    if (!z2) {
                        int i86 = (((i80 | 60) << 1) - (i80 ^ 60)) - 1;
                        i15 = i86 % 128;
                        a = i15;
                        int i87 = i86 % 2;
                        if (this.P) {
                            i16 = (-2) - (((i15 & 76) + (i15 | 76)) ^ (-1));
                            i17 = i16 % 128;
                            b = i17;
                            if (i16 % 2 != 0) {
                                int i88 = 18 / 0;
                                if (!g) {
                                    if (!this.Q) {
                                    }
                                }
                            } else if (!g) {
                                if (!this.Q) {
                                }
                            }
                            obj4 = this.j;
                            if (!(obj4 instanceof Activity)) {
                                int i89 = i17 & 97;
                                int i90 = ((i17 ^ 97) | i89) << 1;
                                int i91 = -((~i89) & (i17 | 97));
                                i18 = (i90 ^ i91) + ((i91 & i90) << 1);
                                a = i18 % 128;
                                if (i18 % 2 != 0) {
                                    ((Activity) obj4).isChild();
                                    obj5.hashCode();
                                    throw null;
                                }
                                if (!((Activity) obj4).isChild()) {
                                    int i92 = a;
                                    int i93 = i92 ^ 49;
                                    i19 = ((((i92 & 49) | i93) << 1) - (~(-i93))) - 1;
                                    b = i19 % 128;
                                    if (i19 % 2 == 0) {
                                        int i94 = k.d;
                                        obj5.hashCode();
                                        throw null;
                                    }
                                    activity2 = (Activity) this.j;
                                    int i95 = k.d;
                                    i20 = Build.VERSION.SDK_INT;
                                    if (i20 >= 28) {
                                        int i96 = a + 29;
                                        b = i96 % 128;
                                        int i97 = i96 % 2;
                                        activity2.recreate();
                                    } else if (i20 <= 23) {
                                        new Handler(activity2.getMainLooper()).post(new ap(activity2));
                                        int i98 = a;
                                        int i99 = i98 ^ 37;
                                        int i100 = (i98 & 37) << 1;
                                        i21 = ((i99 | i100) << 1) - (i100 ^ i99);
                                        b = i21 % 128;
                                        if (i21 % 2 != 0) {
                                            throw null;
                                        }
                                    } else if (!H.c(activity2)) {
                                        activity2.recreate();
                                    }
                                    z3 = true;
                                }
                            }
                        }
                    }
                } else if (!z2) {
                    int i810 = (((i80 | 60) << 1) - (i80 ^ 60)) - 1;
                    i15 = i810 % 128;
                    a = i15;
                    int i811 = i810 % 2;
                    if (this.P) {
                        i16 = (-2) - (((i15 & 76) + (i15 | 76)) ^ (-1));
                        i17 = i16 % 128;
                        b = i17;
                        if (i16 % 2 != 0) {
                            int i812 = 18 / 0;
                            if (!g) {
                                if (!this.Q) {
                                }
                            }
                        } else if (!g) {
                            if (!this.Q) {
                            }
                        }
                        obj4 = this.j;
                        if (!(obj4 instanceof Activity)) {
                            int i813 = i17 & 97;
                            int i910 = ((i17 ^ 97) | i813) << 1;
                            int i911 = -((~i813) & (i17 | 97));
                            i18 = (i910 ^ i911) + ((i911 & i910) << 1);
                            a = i18 % 128;
                            if (i18 % 2 != 0) {
                                ((Activity) obj4).isChild();
                                obj5.hashCode();
                                throw null;
                            }
                            if (!((Activity) obj4).isChild()) {
                                int i912 = a;
                                int i913 = i912 ^ 49;
                                i19 = ((((i912 & 49) | i913) << 1) - (~(-i913))) - 1;
                                b = i19 % 128;
                                if (i19 % 2 == 0) {
                                    int i914 = k.d;
                                    obj5.hashCode();
                                    throw null;
                                }
                                activity2 = (Activity) this.j;
                                int i915 = k.d;
                                i20 = Build.VERSION.SDK_INT;
                                if (i20 >= 28) {
                                    int i916 = a + 29;
                                    b = i916 % 128;
                                    int i917 = i916 % 2;
                                    activity2.recreate();
                                } else if (i20 <= 23) {
                                    new Handler(activity2.getMainLooper()).post(new ap(activity2));
                                    int i918 = a;
                                    int i919 = i918 ^ 37;
                                    int i101 = (i918 & 37) << 1;
                                    i21 = ((i919 | i101) << 1) - (i101 ^ i919);
                                    b = i21 % 128;
                                    if (i21 % 2 != 0) {
                                        throw null;
                                    }
                                } else if (!H.c(activity2)) {
                                    activity2.recreate();
                                }
                                z3 = true;
                            }
                        }
                    }
                }
                z3 = false;
            } else {
                z3 = false;
            }
        } else {
            z3 = false;
        }
        if (!z3) {
            int i102 = b;
            int i103 = i102 & 1;
            int i104 = (i102 | 1) & (~i103);
            int i105 = i103 << 1;
            int i106 = (i104 ^ i105) + ((i104 & i105) << 1);
            a = i106 % 128;
            if (i106 % 2 == 0) {
                int i107 = 34 / 0;
                if (i69 != i75) {
                    resources = this.l.getResources();
                    configuration = new Configuration(resources.getConfiguration());
                    i = b + 29;
                    a = i % 128;
                    if (i % 2 == 0) {
                        i2 = resources.getConfiguration().uiMode & 13;
                    } else {
                        i2 = resources.getConfiguration().uiMode & (-49);
                    }
                    int i108 = a;
                    int i109 = i108 & 15;
                    i3 = ((~i109) & (i108 | 15)) + (i109 << 1);
                    b = i3 % 128;
                    if (i3 % 2 != 0) {
                        configuration.uiMode = i75 ^ i2;
                    } else {
                        configuration.uiMode = i75 | i2;
                    }
                    resources.updateConfiguration(configuration, null);
                    i4 = Build.VERSION.SDK_INT;
                    if (i4 < 26) {
                        int i110 = a;
                        int i111 = i110 & 73;
                        int i112 = ((i110 ^ 73) | i111) << 1;
                        int i113 = -((i110 | 73) & (~i111));
                        i10 = ((i112 | i113) << 1) - (i113 ^ i112);
                        b = i10 % 128;
                        if (i10 % 2 != 0 ? i4 < 28 : i4 < 60) {
                            if (i4 >= 24) {
                                if (!T.j) {
                                    int i114 = b;
                                    int i115 = i114 ^ 97;
                                    i14 = ((((i114 & 97) | i115) << 1) - (~(-i115))) - 1;
                                    a = i14 % 128;
                                    try {
                                        if (i14 % 2 == 0) {
                                            T.i = Resources.class.getDeclaredField("mResourcesImpl");
                                            obj5.hashCode();
                                            throw null;
                                        }
                                        Field declaredField2 = Resources.class.getDeclaredField("mResourcesImpl");
                                        T.i = declaredField2;
                                        int i116 = a;
                                        int i117 = i116 & 115;
                                        int i118 = ((((i116 ^ 115) | i117) << 1) - (~(-((i116 | 115) & (~i117))))) - 1;
                                        b = i118 % 128;
                                        int i119 = i118 % 2;
                                        declaredField2.setAccessible(true);
                                        int i120 = a;
                                        int i121 = i120 ^ 3;
                                        int i122 = (((i120 & 3) | i121) << 1) - i121;
                                        b = i122 % 128;
                                        int i123 = i122 % 2;
                                        T.j = true;
                                    } catch (NoSuchFieldException e2) {
                                        Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e2);
                                    }
                                }
                                field2 = T.i;
                                if (field2 != null) {
                                    int i124 = a;
                                    int i125 = (((i124 & (-58)) | ((~i124) & 57)) - (~((i124 & 57) << 1))) - 1;
                                    b = i125 % 128;
                                    int i126 = i125 % 2;
                                    try {
                                        obj2 = field2.get(resources);
                                    } catch (IllegalAccessException e3) {
                                        Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e3);
                                        obj2 = null;
                                    }
                                    if (obj2 != null) {
                                        int i127 = a;
                                        int i128 = (((i127 | 86) << 1) - (i127 ^ 86)) - 1;
                                        b = i128 % 128;
                                        int i129 = i128 % 2;
                                        if (!T.d) {
                                            int i130 = a + 95;
                                            b = i130 % 128;
                                            int i131 = i130 % 2;
                                            try {
                                                Field declaredField3 = obj2.getClass().getDeclaredField("mDrawableCache");
                                                T.c = declaredField3;
                                                declaredField3.setAccessible(true);
                                            } catch (NoSuchFieldException e4) {
                                                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e4);
                                            }
                                            T.d = true;
                                        }
                                        field3 = T.c;
                                        if (field3 != null) {
                                            i13 = a + 85;
                                            b = i13 % 128;
                                            try {
                                                if (i13 % 2 != 0) {
                                                    field3.get(obj2);
                                                    throw null;
                                                }
                                                obj3 = field3.get(obj2);
                                            } catch (IllegalAccessException e5) {
                                                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e5);
                                                obj3 = null;
                                            }
                                        } else {
                                            obj3 = null;
                                        }
                                        if (obj3 != null) {
                                            i12 = a + 85;
                                            b = i12 % 128;
                                            if (i12 % 2 != 0) {
                                                T.b(obj3);
                                                obj5.hashCode();
                                                throw null;
                                            }
                                            T.b(obj3);
                                        }
                                    }
                                }
                            } else {
                                if (!T.d) {
                                    int i132 = a;
                                    int i133 = ((i132 ^ 69) | (i132 & 69)) << 1;
                                    int i134 = -(((~i132) & 69) | (i132 & (-70)));
                                    int i135 = ((i133 | i134) << 1) - (i134 ^ i133);
                                    b = i135 % 128;
                                    int i136 = i135 % 2;
                                    try {
                                        declaredField = Resources.class.getDeclaredField("mDrawableCache");
                                        i11 = b + 21;
                                        a = i11 % 128;
                                        if (i11 % 2 == 0) {
                                            T.c = declaredField;
                                            declaredField.setAccessible(false);
                                        } else {
                                            T.c = declaredField;
                                            declaredField.setAccessible(true);
                                        }
                                    } catch (NoSuchFieldException e6) {
                                        Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e6);
                                    }
                                    T.d = true;
                                    int i137 = a;
                                    int i138 = i137 & 85;
                                    int i139 = (i137 ^ 85) | i138;
                                    int i140 = (i138 & i139) + (i139 | i138);
                                    b = i140 % 128;
                                    int i141 = i140 % 2;
                                }
                                field = T.c;
                                if (field != null) {
                                    int i142 = b;
                                    int i143 = (-2) - (((i142 & 8) + (i142 | 8)) ^ (-1));
                                    a = i143 % 128;
                                    int i144 = i143 % 2;
                                    try {
                                        obj5 = field.get(resources);
                                    } catch (IllegalAccessException e7) {
                                        Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e7);
                                    }
                                }
                                if (obj5 != null) {
                                    T.b(obj5);
                                    int i145 = b;
                                    int i146 = ((i145 ^ 37) | (i145 & 37)) << 1;
                                    int i147 = -(((~i145) & 37) | (i145 & (-38)));
                                    int i148 = (i146 & i147) + (i147 | i146);
                                    a = i148 % 128;
                                    int i149 = i148 % 2;
                                }
                            }
                        }
                    }
                    i5 = this.U;
                    if (i5 != 0) {
                        int i150 = a;
                        int i151 = i150 ^ 119;
                        int i152 = -(-((i150 & 119) << 1));
                        int i153 = ((i151 | i152) << 1) - (i152 ^ i151);
                        b = i153 % 128;
                        int i154 = i153 % 2;
                        this.l.setTheme(i5);
                        theme = this.l.getTheme();
                        int i155 = a;
                        int i156 = ((i155 | 98) << 1) - (i155 ^ 98);
                        i9 = (i156 ^ (-1)) + (i156 << 1);
                        b = i9 % 128;
                        if (i9 % 2 != 0) {
                            theme.applyStyle(this.U, false);
                        } else {
                            theme.applyStyle(this.U, true);
                        }
                    }
                    if (z2) {
                        int i157 = b;
                        i6 = ((i157 | 45) << 1) - (i157 ^ 45);
                        i7 = i6 % 128;
                        a = i7;
                        if (i6 % 2 == 0) {
                            obj = this.j;
                            if (obj instanceof Activity) {
                                int i158 = i7 + 121;
                                i8 = i158 % 128;
                                b = i8;
                                int i159 = i158 % 2;
                                activity = (Activity) obj;
                                if (activity instanceof d) {
                                    int i160 = i8 & 111;
                                    int i161 = (((~i160) & (i8 | 111)) - (~(-(-(i160 << 1))))) - 1;
                                    a = i161 % 128;
                                    int i162 = i161 % 2;
                                    if (((androidx.lifecycle.c) ((d) activity).getLifecycle()).b.compareTo(androidx.lifecycle.d.aMa.CREATED) >= 0) {
                                        int i163 = b;
                                        int i164 = (i163 & (-34)) | ((~i163) & 33);
                                        int i165 = -(-((i163 & 33) << 1));
                                        int i166 = (i164 & i165) + (i165 | i164);
                                        int i167 = i166 % 128;
                                        a = i167;
                                        int i168 = i166 % 2;
                                        int i169 = i167 & 55;
                                        int i170 = (i167 ^ 55) | i169;
                                        int i171 = (i169 & i170) + (i170 | i169);
                                        b = i171 % 128;
                                        int i172 = i171 % 2;
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (z4) {
                                        int i173 = a;
                                        int i174 = i173 & 59;
                                        int i175 = i174 + ((i173 ^ 59) | i174);
                                        b = i175 % 128;
                                        int i176 = i175 % 2;
                                        activity.onConfigurationChanged(configuration);
                                    }
                                } else if (this.Q && !this.S) {
                                    int i177 = i7 & 113;
                                    int i178 = (i177 - (~((i7 ^ 113) | i177))) - 1;
                                    b = i178 % 128;
                                    int i179 = i178 % 2;
                                    activity.onConfigurationChanged(configuration);
                                }
                            }
                        } else {
                            obj = this.j;
                            if (obj instanceof Activity) {
                                int i1510 = i7 + 121;
                                i8 = i1510 % 128;
                                b = i8;
                                int i1511 = i1510 % 2;
                                activity = (Activity) obj;
                                if (activity instanceof d) {
                                    int i1610 = i8 & 111;
                                    int i1611 = (((~i1610) & (i8 | 111)) - (~(-(-(i1610 << 1))))) - 1;
                                    a = i1611 % 128;
                                    int i1612 = i1611 % 2;
                                    if (((androidx.lifecycle.c) ((d) activity).getLifecycle()).b.compareTo(androidx.lifecycle.d.aMa.CREATED) >= 0) {
                                        int i1613 = b;
                                        int i1614 = (i1613 & (-34)) | ((~i1613) & 33);
                                        int i1615 = -(-((i1613 & 33) << 1));
                                        int i1616 = (i1614 & i1615) + (i1615 | i1614);
                                        int i1617 = i1616 % 128;
                                        a = i1617;
                                        int i1618 = i1616 % 2;
                                        int i1619 = i1617 & 55;
                                        int i1710 = (i1617 ^ 55) | i1619;
                                        int i1711 = (i1619 & i1710) + (i1710 | i1619);
                                        b = i1711 % 128;
                                        int i1712 = i1711 % 2;
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (z4) {
                                        int i1713 = a;
                                        int i1714 = i1713 & 59;
                                        int i1715 = i1714 + ((i1713 ^ 59) | i1714);
                                        b = i1715 % 128;
                                        int i1716 = i1715 % 2;
                                        activity.onConfigurationChanged(configuration);
                                    }
                                } else if (this.Q) {
                                    int i1717 = i7 & 113;
                                    int i1718 = (i1717 - (~((i7 ^ 113) | i1717))) - 1;
                                    b = i1718 % 128;
                                    int i1719 = i1718 % 2;
                                    activity.onConfigurationChanged(configuration);
                                }
                            }
                        }
                    }
                    z3 = true;
                }
            } else if (i69 != i75) {
                resources = this.l.getResources();
                configuration = new Configuration(resources.getConfiguration());
                i = b + 29;
                a = i % 128;
                if (i % 2 == 0) {
                    i2 = resources.getConfiguration().uiMode & 13;
                } else {
                    i2 = resources.getConfiguration().uiMode & (-49);
                }
                int i1010 = a;
                int i1011 = i1010 & 15;
                i3 = ((~i1011) & (i1010 | 15)) + (i1011 << 1);
                b = i3 % 128;
                if (i3 % 2 != 0) {
                    configuration.uiMode = i75 ^ i2;
                } else {
                    configuration.uiMode = i75 | i2;
                }
                resources.updateConfiguration(configuration, null);
                i4 = Build.VERSION.SDK_INT;
                if (i4 < 26) {
                    int i1110 = a;
                    int i1111 = i1110 & 73;
                    int i1112 = ((i1110 ^ 73) | i1111) << 1;
                    int i1113 = -((i1110 | 73) & (~i1111));
                    i10 = ((i1112 | i1113) << 1) - (i1113 ^ i1112);
                    b = i10 % 128;
                    if (i10 % 2 != 0) {
                        if (i4 >= 24) {
                            if (!T.j) {
                                int i1114 = b;
                                int i1115 = i1114 ^ 97;
                                i14 = ((((i1114 & 97) | i1115) << 1) - (~(-i1115))) - 1;
                                a = i14 % 128;
                                if (i14 % 2 == 0) {
                                    T.i = Resources.class.getDeclaredField("mResourcesImpl");
                                    obj5.hashCode();
                                    throw null;
                                }
                                Field declaredField4 = Resources.class.getDeclaredField("mResourcesImpl");
                                T.i = declaredField4;
                                int i1116 = a;
                                int i1117 = i1116 & 115;
                                int i1118 = ((((i1116 ^ 115) | i1117) << 1) - (~(-((i1116 | 115) & (~i1117))))) - 1;
                                b = i1118 % 128;
                                int i1119 = i1118 % 2;
                                declaredField4.setAccessible(true);
                                int i1210 = a;
                                int i1211 = i1210 ^ 3;
                                int i1212 = (((i1210 & 3) | i1211) << 1) - i1211;
                                b = i1212 % 128;
                                int i1213 = i1212 % 2;
                                T.j = true;
                            }
                            field2 = T.i;
                            if (field2 != null) {
                                int i1214 = a;
                                int i1215 = (((i1214 & (-58)) | ((~i1214) & 57)) - (~((i1214 & 57) << 1))) - 1;
                                b = i1215 % 128;
                                int i1216 = i1215 % 2;
                                obj2 = field2.get(resources);
                                if (obj2 != null) {
                                    int i1217 = a;
                                    int i1218 = (((i1217 | 86) << 1) - (i1217 ^ 86)) - 1;
                                    b = i1218 % 128;
                                    int i1219 = i1218 % 2;
                                    if (!T.d) {
                                        int i1310 = a + 95;
                                        b = i1310 % 128;
                                        int i1311 = i1310 % 2;
                                        Field declaredField5 = obj2.getClass().getDeclaredField("mDrawableCache");
                                        T.c = declaredField5;
                                        declaredField5.setAccessible(true);
                                        T.d = true;
                                    }
                                    field3 = T.c;
                                    if (field3 != null) {
                                        i13 = a + 85;
                                        b = i13 % 128;
                                        if (i13 % 2 != 0) {
                                            field3.get(obj2);
                                            throw null;
                                        }
                                        obj3 = field3.get(obj2);
                                    } else {
                                        obj3 = null;
                                    }
                                    if (obj3 != null) {
                                        i12 = a + 85;
                                        b = i12 % 128;
                                        if (i12 % 2 != 0) {
                                            T.b(obj3);
                                            obj5.hashCode();
                                            throw null;
                                        }
                                        T.b(obj3);
                                    }
                                }
                            }
                        } else {
                            if (!T.d) {
                                int i1312 = a;
                                int i1313 = ((i1312 ^ 69) | (i1312 & 69)) << 1;
                                int i1314 = -(((~i1312) & 69) | (i1312 & (-70)));
                                int i1315 = ((i1313 | i1314) << 1) - (i1314 ^ i1313);
                                b = i1315 % 128;
                                int i1316 = i1315 % 2;
                                declaredField = Resources.class.getDeclaredField("mDrawableCache");
                                i11 = b + 21;
                                a = i11 % 128;
                                if (i11 % 2 == 0) {
                                    T.c = declaredField;
                                    declaredField.setAccessible(false);
                                } else {
                                    T.c = declaredField;
                                    declaredField.setAccessible(true);
                                }
                                T.d = true;
                                int i1317 = a;
                                int i1318 = i1317 & 85;
                                int i1319 = (i1317 ^ 85) | i1318;
                                int i1410 = (i1318 & i1319) + (i1319 | i1318);
                                b = i1410 % 128;
                                int i1411 = i1410 % 2;
                            }
                            field = T.c;
                            if (field != null) {
                                int i1412 = b;
                                int i1413 = (-2) - (((i1412 & 8) + (i1412 | 8)) ^ (-1));
                                a = i1413 % 128;
                                int i1414 = i1413 % 2;
                                obj5 = field.get(resources);
                            }
                            if (obj5 != null) {
                                T.b(obj5);
                                int i1415 = b;
                                int i1416 = ((i1415 ^ 37) | (i1415 & 37)) << 1;
                                int i1417 = -(((~i1415) & 37) | (i1415 & (-38)));
                                int i1418 = (i1416 & i1417) + (i1417 | i1416);
                                a = i1418 % 128;
                                int i1419 = i1418 % 2;
                            }
                        }
                    } else if (i4 >= 24) {
                        if (!T.j) {
                            int i11110 = b;
                            int i11111 = i11110 ^ 97;
                            i14 = ((((i11110 & 97) | i11111) << 1) - (~(-i11111))) - 1;
                            a = i14 % 128;
                            if (i14 % 2 == 0) {
                                T.i = Resources.class.getDeclaredField("mResourcesImpl");
                                obj5.hashCode();
                                throw null;
                            }
                            Field declaredField6 = Resources.class.getDeclaredField("mResourcesImpl");
                            T.i = declaredField6;
                            int i11112 = a;
                            int i11113 = i11112 & 115;
                            int i11114 = ((((i11112 ^ 115) | i11113) << 1) - (~(-((i11112 | 115) & (~i11113))))) - 1;
                            b = i11114 % 128;
                            int i11115 = i11114 % 2;
                            declaredField6.setAccessible(true);
                            int i12110 = a;
                            int i12111 = i12110 ^ 3;
                            int i12112 = (((i12110 & 3) | i12111) << 1) - i12111;
                            b = i12112 % 128;
                            int i12113 = i12112 % 2;
                            T.j = true;
                        }
                        field2 = T.i;
                        if (field2 != null) {
                            int i12114 = a;
                            int i12115 = (((i12114 & (-58)) | ((~i12114) & 57)) - (~((i12114 & 57) << 1))) - 1;
                            b = i12115 % 128;
                            int i12116 = i12115 % 2;
                            obj2 = field2.get(resources);
                            if (obj2 != null) {
                                int i12117 = a;
                                int i12118 = (((i12117 | 86) << 1) - (i12117 ^ 86)) - 1;
                                b = i12118 % 128;
                                int i12119 = i12118 % 2;
                                if (!T.d) {
                                    int i13110 = a + 95;
                                    b = i13110 % 128;
                                    int i13111 = i13110 % 2;
                                    Field declaredField7 = obj2.getClass().getDeclaredField("mDrawableCache");
                                    T.c = declaredField7;
                                    declaredField7.setAccessible(true);
                                    T.d = true;
                                }
                                field3 = T.c;
                                if (field3 != null) {
                                    i13 = a + 85;
                                    b = i13 % 128;
                                    if (i13 % 2 != 0) {
                                        field3.get(obj2);
                                        throw null;
                                    }
                                    obj3 = field3.get(obj2);
                                } else {
                                    obj3 = null;
                                }
                                if (obj3 != null) {
                                    i12 = a + 85;
                                    b = i12 % 128;
                                    if (i12 % 2 != 0) {
                                        T.b(obj3);
                                        obj5.hashCode();
                                        throw null;
                                    }
                                    T.b(obj3);
                                }
                            }
                        }
                    } else {
                        if (!T.d) {
                            int i13112 = a;
                            int i13113 = ((i13112 ^ 69) | (i13112 & 69)) << 1;
                            int i13114 = -(((~i13112) & 69) | (i13112 & (-70)));
                            int i13115 = ((i13113 | i13114) << 1) - (i13114 ^ i13113);
                            b = i13115 % 128;
                            int i13116 = i13115 % 2;
                            declaredField = Resources.class.getDeclaredField("mDrawableCache");
                            i11 = b + 21;
                            a = i11 % 128;
                            if (i11 % 2 == 0) {
                                T.c = declaredField;
                                declaredField.setAccessible(false);
                            } else {
                                T.c = declaredField;
                                declaredField.setAccessible(true);
                            }
                            T.d = true;
                            int i13117 = a;
                            int i13118 = i13117 & 85;
                            int i13119 = (i13117 ^ 85) | i13118;
                            int i14110 = (i13118 & i13119) + (i13119 | i13118);
                            b = i14110 % 128;
                            int i14111 = i14110 % 2;
                        }
                        field = T.c;
                        if (field != null) {
                            int i14112 = b;
                            int i14113 = (-2) - (((i14112 & 8) + (i14112 | 8)) ^ (-1));
                            a = i14113 % 128;
                            int i14114 = i14113 % 2;
                            obj5 = field.get(resources);
                        }
                        if (obj5 != null) {
                            T.b(obj5);
                            int i14115 = b;
                            int i14116 = ((i14115 ^ 37) | (i14115 & 37)) << 1;
                            int i14117 = -(((~i14115) & 37) | (i14115 & (-38)));
                            int i14118 = (i14116 & i14117) + (i14117 | i14116);
                            a = i14118 % 128;
                            int i14119 = i14118 % 2;
                        }
                    }
                }
                i5 = this.U;
                if (i5 != 0) {
                    int i1512 = a;
                    int i1513 = i1512 ^ 119;
                    int i1514 = -(-((i1512 & 119) << 1));
                    int i1515 = ((i1513 | i1514) << 1) - (i1514 ^ i1513);
                    b = i1515 % 128;
                    int i1516 = i1515 % 2;
                    this.l.setTheme(i5);
                    theme = this.l.getTheme();
                    int i1517 = a;
                    int i1518 = ((i1517 | 98) << 1) - (i1517 ^ 98);
                    i9 = (i1518 ^ (-1)) + (i1518 << 1);
                    b = i9 % 128;
                    if (i9 % 2 != 0) {
                        theme.applyStyle(this.U, false);
                    } else {
                        theme.applyStyle(this.U, true);
                    }
                }
                if (z2) {
                    int i1519 = b;
                    i6 = ((i1519 | 45) << 1) - (i1519 ^ 45);
                    i7 = i6 % 128;
                    a = i7;
                    if (i6 % 2 == 0) {
                        obj = this.j;
                        if (obj instanceof Activity) {
                            int i15110 = i7 + 121;
                            i8 = i15110 % 128;
                            b = i8;
                            int i15111 = i15110 % 2;
                            activity = (Activity) obj;
                            if (activity instanceof d) {
                                int i16110 = i8 & 111;
                                int i16111 = (((~i16110) & (i8 | 111)) - (~(-(-(i16110 << 1))))) - 1;
                                a = i16111 % 128;
                                int i16112 = i16111 % 2;
                                if (((androidx.lifecycle.c) ((d) activity).getLifecycle()).b.compareTo(androidx.lifecycle.d.aMa.CREATED) >= 0) {
                                    int i16113 = b;
                                    int i16114 = (i16113 & (-34)) | ((~i16113) & 33);
                                    int i16115 = -(-((i16113 & 33) << 1));
                                    int i16116 = (i16114 & i16115) + (i16115 | i16114);
                                    int i16117 = i16116 % 128;
                                    a = i16117;
                                    int i16118 = i16116 % 2;
                                    int i16119 = i16117 & 55;
                                    int i17110 = (i16117 ^ 55) | i16119;
                                    int i17111 = (i16119 & i17110) + (i17110 | i16119);
                                    b = i17111 % 128;
                                    int i17112 = i17111 % 2;
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (z4) {
                                    int i17113 = a;
                                    int i17114 = i17113 & 59;
                                    int i17115 = i17114 + ((i17113 ^ 59) | i17114);
                                    b = i17115 % 128;
                                    int i17116 = i17115 % 2;
                                    activity.onConfigurationChanged(configuration);
                                }
                            } else if (this.Q) {
                                int i17117 = i7 & 113;
                                int i17118 = (i17117 - (~((i7 ^ 113) | i17117))) - 1;
                                b = i17118 % 128;
                                int i17119 = i17118 % 2;
                                activity.onConfigurationChanged(configuration);
                            }
                        }
                    } else {
                        obj = this.j;
                        if (obj instanceof Activity) {
                            int i15112 = i7 + 121;
                            i8 = i15112 % 128;
                            b = i8;
                            int i15113 = i15112 % 2;
                            activity = (Activity) obj;
                            if (activity instanceof d) {
                                int i161110 = i8 & 111;
                                int i161111 = (((~i161110) & (i8 | 111)) - (~(-(-(i161110 << 1))))) - 1;
                                a = i161111 % 128;
                                int i161112 = i161111 % 2;
                                if (((androidx.lifecycle.c) ((d) activity).getLifecycle()).b.compareTo(androidx.lifecycle.d.aMa.CREATED) >= 0) {
                                    int i161113 = b;
                                    int i161114 = (i161113 & (-34)) | ((~i161113) & 33);
                                    int i161115 = -(-((i161113 & 33) << 1));
                                    int i161116 = (i161114 & i161115) + (i161115 | i161114);
                                    int i161117 = i161116 % 128;
                                    a = i161117;
                                    int i161118 = i161116 % 2;
                                    int i161119 = i161117 & 55;
                                    int i171110 = (i161117 ^ 55) | i161119;
                                    int i171111 = (i161119 & i171110) + (i171110 | i161119);
                                    b = i171111 % 128;
                                    int i171112 = i171111 % 2;
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (z4) {
                                    int i171113 = a;
                                    int i171114 = i171113 & 59;
                                    int i171115 = i171114 + ((i171113 ^ 59) | i171114);
                                    b = i171115 % 128;
                                    int i171116 = i171115 % 2;
                                    activity.onConfigurationChanged(configuration);
                                }
                            } else if (this.Q) {
                                int i171117 = i7 & 113;
                                int i171118 = (i171117 - (~((i7 ^ 113) | i171117))) - 1;
                                b = i171118 % 128;
                                int i171119 = i171118 % 2;
                                activity.onConfigurationChanged(configuration);
                            }
                        }
                    }
                }
                z3 = true;
            }
        }
        if (!(!z3)) {
            Object obj6 = this.j;
            if (!(!(obj6 instanceof AppCompatActivity))) {
                int i180 = a;
                int i181 = ((i180 | 49) << 1) - (i180 ^ 49);
                b = i181 % 128;
                if (i181 % 2 != 0) {
                    Objects.requireNonNull((AppCompatActivity) obj6);
                    int i182 = 36 / 0;
                } else {
                    Objects.requireNonNull((AppCompatActivity) obj6);
                }
            }
        }
        if (i42 == 0) {
            P(this.l).g();
        } else {
            aQv aqv = this.W;
            if (aqv != null) {
                int i183 = a + 99;
                b = i183 % 128;
                if (i183 % 2 != 0) {
                    aqv.c();
                    int i184 = 39 / 0;
                } else {
                    aqv.c();
                }
            }
        }
        if (i42 == 3) {
            Context context = this.l;
            if (this.Y == null) {
                this.Y = new aQw(context);
            }
            this.Y.g();
            int i185 = b + 125;
            a = i185 % 128;
            if (i185 % 2 == 0) {
                int i186 = 4 / 5;
            }
        } else {
            aQv aqv2 = this.Y;
            if (aqv2 != null) {
                aqv2.c();
            }
        }
        return z3;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:102:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:105:0x030a  */
    /* JADX WARN: Code duplicated, block: B:107:0x0336  */
    /* JADX WARN: Code duplicated, block: B:108:0x0351  */
    /* JADX WARN: Code duplicated, block: B:112:0x035f  */
    /* JADX WARN: Code duplicated, block: B:114:0x0370  */
    /* JADX WARN: Code duplicated, block: B:117:0x039c  */
    /* JADX WARN: Code duplicated, block: B:118:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:124:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:126:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:128:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:130:0x03de  */
    /* JADX WARN: Code duplicated, block: B:133:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:137:0x040e  */
    /* JADX WARN: Code duplicated, block: B:139:0x0416  */
    /* JADX WARN: Code duplicated, block: B:142:0x0441  */
    /* JADX WARN: Code duplicated, block: B:144:0x044b  */
    /* JADX WARN: Code duplicated, block: B:147:0x048c  */
    /* JADX WARN: Code duplicated, block: B:154:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:156:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:160:0x050e  */
    /* JADX WARN: Code duplicated, block: B:161:0x0511  */
    /* JADX WARN: Code duplicated, block: B:166:0x0545  */
    /* JADX WARN: Code duplicated, block: B:171:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0142 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x0144  */
    /* JADX WARN: Code duplicated, block: B:60:0x015d  */
    /* JADX WARN: Code duplicated, block: B:62:0x0164  */
    /* JADX WARN: Code duplicated, block: B:63:0x0179  */
    /* JADX WARN: Code duplicated, block: B:65:0x017c  */
    /* JADX WARN: Code duplicated, block: B:67:0x018d  */
    /* JADX WARN: Code duplicated, block: B:68:0x0190  */
    /* JADX WARN: Code duplicated, block: B:71:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:74:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:77:0x0203 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x0205  */
    /* JADX WARN: Code duplicated, block: B:80:0x021b  */
    /* JADX WARN: Code duplicated, block: B:81:0x021f  */
    /* JADX WARN: Code duplicated, block: B:82:0x0223  */
    /* JADX WARN: Code duplicated, block: B:84:0x0278  */
    /* JADX WARN: Code duplicated, block: B:86:0x027c  */
    /* JADX WARN: Code duplicated, block: B:88:0x0280  */
    /* JADX WARN: Code duplicated, block: B:90:0x0293  */
    /* JADX WARN: Code duplicated, block: B:93:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:95:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:96:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:98:0x02e6  */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x03ea, code lost:
    
        if (((androidx.appcompat.view.menu.c.aIV) r21.c.e()).getCount() > 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0070, code lost:
    
        if (((r4 & r9) | (r9 ^ r4)) == 4) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0075, code lost:
    
        if ((r4 & 15) == 4) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0077, code lost:
    
        r1 = (r8 & (-122)) | ((~r8) & 121);
        r3 = (r8 & 121) << 1;
        r4 = ((r1 | r3) << 1) - (r1 ^ r3);
        ivas.gov.bisp.enumeration.p087j.LayoutInflaterFactory2C0312o.a = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008b, code lost:
    
        r4 = ((r10 | 123) << 1) - (r10 ^ 123);
        ivas.gov.bisp.enumeration.p087j.LayoutInflaterFactory2C0312o.b = r4 % 128;
        r4 = r4 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void R(ivas.gov.bisp.enumeration.p087j.LayoutInflaterFactory2C0312o.aQz r21, android.view.KeyEvent r22) {
        /*
            Method dump skipped, instruction units count: 1356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p087j.LayoutInflaterFactory2C0312o.R(ivas.gov.bisp.enumeration.j.o$aQz, android.view.KeyEvent):void");
    }

    /* JADX WARN: Code duplicated, block: B:178:? A[PHI: r13
  PHI (r13v5 android.view.ViewGroup) = (r13v4 android.view.ViewGroup), (r13v18 android.view.ViewGroup) binds: [B:83:0x0307, B:80:0x02fc] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0142  */
    /* JADX WARN: Code duplicated, block: B:35:0x015a  */
    /* JADX WARN: Code duplicated, block: B:37:0x015e  */
    /* JADX WARN: Code duplicated, block: B:39:0x017d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0181  */
    /* JADX WARN: Code duplicated, block: B:42:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:45:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:48:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:52:0x0212  */
    /* JADX WARN: Code duplicated, block: B:53:0x0225  */
    /* JADX WARN: Code duplicated, block: B:55:0x0228  */
    /* JADX WARN: Code duplicated, block: B:86:0x030f A[LOOP:0: B:84:0x0309->B:86:0x030f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:89:0x034c  */
    /* JADX WARN: Code duplicated, block: B:91:0x0357  */
    /* JADX WARN: Code duplicated, block: B:92:0x0360  */
    public final void M() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        int i;
        TypedValue fixedHeightMinor;
        TypedValue typedValue;
        int i2;
        Context hVar;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = i4 + 56;
        int i6 = (i5 ^ (-1)) + (i5 << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        if (this.z) {
            return;
        }
        int i8 = ((i4 & 47) - (~(i4 | 47))) - 1;
        b = i8 % 128;
        int i9 = i8 % 2;
        TypedArray typedArrayObtainStyledAttributes = this.l.obtainStyledAttributes(ivas.gov.bisp.enumeration.p006af.h.l);
        int i10 = a;
        int i11 = (i10 & (-14)) | ((~i10) & 13);
        int i12 = -(-((i10 & 13) << 1));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        b = i13 % 128;
        Object obj = null;
        if (i13 % 2 != 0) {
            typedArrayObtainStyledAttributes.hasValue(117);
            throw null;
        }
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        int i14 = a;
        int i15 = ((i14 ^ 53) | (i14 & 53)) << 1;
        int i16 = -(((~i14) & 53) | (i14 & (-54)));
        int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
        b = i17 % 128;
        int i18 = i17 % 2;
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            int i19 = b;
            int i20 = i19 & 67;
            int i21 = i20 + ((i19 ^ 67) | i20);
            a = i21 % 128;
            int i22 = i21 % 2;
            v(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            v(108);
            int i23 = a;
            int i24 = ((i23 | 1) << 1) - (i23 ^ 1);
            b = i24 % 128;
            int i25 = i24 % 2;
        }
        if (!(!typedArrayObtainStyledAttributes.getBoolean(118, false))) {
            int i26 = a;
            int i27 = ((i26 & 56) + (i26 | 56)) - 1;
            b = i27 % 128;
            if (i27 % 2 != 0) {
                v(61);
            } else {
                v(109);
            }
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            int i28 = a;
            int i29 = (i28 & (-54)) | ((~i28) & 53);
            int i30 = -(-((i28 & 53) << 1));
            int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
            b = i31 % 128;
            int i32 = i31 % 2;
            v(10);
        }
        this.I = typedArrayObtainStyledAttributes.getBoolean(0, false);
        int i33 = b;
        int i34 = ((i33 ^ 105) | (i33 & 105)) << 1;
        int i35 = -(((~i33) & 105) | (i33 & (-106)));
        int i36 = (i34 ^ i35) + ((i35 & i34) << 1);
        a = i36 % 128;
        if (i36 % 2 == 0) {
            typedArrayObtainStyledAttributes.recycle();
            O();
            obj.hashCode();
            throw null;
        }
        typedArrayObtainStyledAttributes.recycle();
        O();
        Window window = this.k;
        int i37 = a;
        int i38 = i37 & 95;
        int i39 = ((i37 | 95) & (~i38)) + (i38 << 1);
        b = i39 % 128;
        int i40 = i39 % 2;
        window.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.l);
        if (!this.J) {
            int i41 = b;
            int i42 = i41 ^ 51;
            int i43 = (((i41 & 51) | i42) << 1) - i42;
            a = i43 % 128;
            if (i43 % 2 == 0) {
                int i44 = 24 / 0;
                if (!(!this.I)) {
                    viewGroup = (ViewGroup) layoutInflaterFrom.inflate(ivas.gov.bisp.enumeration.R.layout.abc_dialog_title_material, (ViewGroup) null);
                    int i45 = b + 49;
                    a = i45 % 128;
                    int i46 = i45 % 2;
                    this.H = false;
                    this.F = false;
                } else if (this.F) {
                    typedValue = new TypedValue();
                    this.l.getTheme().resolveAttribute(ivas.gov.bisp.enumeration.R.attr.actionBarTheme, typedValue, true);
                    int i47 = b;
                    i2 = ((i47 & 126) + (126 | i47)) - 1;
                    a = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i48 = typedValue.resourceId;
                        throw null;
                    }
                    if (typedValue.resourceId != 0) {
                        hVar = new h(this.l, typedValue.resourceId);
                        int i49 = b;
                        int i50 = i49 & 31;
                        int i51 = ((i49 ^ 31) | i50) << 1;
                        int i52 = -((i49 | 31) & (~i50));
                        int i53 = ((i51 | i52) << 1) - (i52 ^ i51);
                        a = i53 % 128;
                        int i54 = i53 % 2;
                    } else {
                        hVar = this.l;
                    }
                    viewGroup = (ViewGroup) LayoutInflater.from(hVar).inflate(ivas.gov.bisp.enumeration.R.layout.abc_screen_toolbar, (ViewGroup) null);
                    int i55 = a;
                    int i56 = i55 | 35;
                    int i57 = (i56 << 1) - ((~(i55 & 35)) & i56);
                    b = i57 % 128;
                    int i58 = i57 % 2;
                    InterfaceC0320s interfaceC0320s = (InterfaceC0320s) viewGroup.findViewById(ivas.gov.bisp.enumeration.R.id.decor_content_parent);
                    int i59 = b + 103;
                    a = i59 % 128;
                    int i60 = i59 % 2;
                    this.q = interfaceC0320s;
                    interfaceC0320s.setWindowCallback(G());
                    if (this.H) {
                        int i61 = a;
                        int i62 = (i61 & 25) + (i61 | 25);
                        b = i62 % 128;
                        int i63 = i62 % 2;
                        this.q.i(109);
                    }
                    if (!(!this.E)) {
                        int i64 = b;
                        int i65 = i64 ^ 25;
                        int i66 = ((i64 & 25) | i65) << 1;
                        int i67 = -i65;
                        int i68 = (i66 & i67) + (i66 | i67);
                        a = i68 % 128;
                        int i69 = i68 % 2;
                        this.q.i(2);
                    }
                    if (this.D) {
                        int i70 = a;
                        int i71 = ((i70 & 124) + (i70 | 124)) - 1;
                        b = i71 % 128;
                        int i72 = i71 % 2;
                        this.q.i(5);
                    }
                } else {
                    viewGroup = null;
                }
            } else if (this.I) {
                viewGroup = (ViewGroup) layoutInflaterFrom.inflate(ivas.gov.bisp.enumeration.R.layout.abc_dialog_title_material, (ViewGroup) null);
                int i410 = b + 49;
                a = i410 % 128;
                int i411 = i410 % 2;
                this.H = false;
                this.F = false;
            } else if (this.F) {
                typedValue = new TypedValue();
                this.l.getTheme().resolveAttribute(ivas.gov.bisp.enumeration.R.attr.actionBarTheme, typedValue, true);
                int i412 = b;
                i2 = ((i412 & 126) + (126 | i412)) - 1;
                a = i2 % 128;
                if (i2 % 2 != 0) {
                    int i413 = typedValue.resourceId;
                    throw null;
                }
                if (typedValue.resourceId != 0) {
                    hVar = new h(this.l, typedValue.resourceId);
                    int i414 = b;
                    int i510 = i414 & 31;
                    int i511 = ((i414 ^ 31) | i510) << 1;
                    int i512 = -((i414 | 31) & (~i510));
                    int i513 = ((i511 | i512) << 1) - (i512 ^ i511);
                    a = i513 % 128;
                    int i514 = i513 % 2;
                } else {
                    hVar = this.l;
                }
                viewGroup = (ViewGroup) LayoutInflater.from(hVar).inflate(ivas.gov.bisp.enumeration.R.layout.abc_screen_toolbar, (ViewGroup) null);
                int i515 = a;
                int i516 = i515 | 35;
                int i517 = (i516 << 1) - ((~(i515 & 35)) & i516);
                b = i517 % 128;
                int i518 = i517 % 2;
                InterfaceC0320s interfaceC0320s2 = (InterfaceC0320s) viewGroup.findViewById(ivas.gov.bisp.enumeration.R.id.decor_content_parent);
                int i519 = b + 103;
                a = i519 % 128;
                int i610 = i519 % 2;
                this.q = interfaceC0320s2;
                interfaceC0320s2.setWindowCallback(G());
                if (this.H) {
                    int i611 = a;
                    int i612 = (i611 & 25) + (i611 | 25);
                    b = i612 % 128;
                    int i613 = i612 % 2;
                    this.q.i(109);
                }
                if (!(!this.E)) {
                    int i614 = b;
                    int i615 = i614 ^ 25;
                    int i616 = ((i614 & 25) | i615) << 1;
                    int i617 = -i615;
                    int i618 = (i616 & i617) + (i616 | i617);
                    a = i618 % 128;
                    int i619 = i618 % 2;
                    this.q.i(2);
                }
                if (this.D) {
                    int i73 = a;
                    int i74 = ((i73 & 124) + (i73 | 124)) - 1;
                    b = i74 % 128;
                    int i75 = i74 % 2;
                    this.q.i(5);
                }
            } else {
                viewGroup = null;
            }
        } else if (this.G) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(ivas.gov.bisp.enumeration.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null);
            int i76 = b;
            int i77 = i76 & 67;
            int i78 = (((i76 | 67) & (~i77)) - (~(-(-(i77 << 1))))) - 1;
            a = i78 % 128;
            int i79 = i78 % 2;
        } else {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(ivas.gov.bisp.enumeration.R.layout.abc_screen_simple, (ViewGroup) null);
        }
        int i80 = 121;
        if (viewGroup == null) {
            StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("AppCompat does not support the current theme features: { windowActionBar: ");
            sbW.append(this.F);
            int i81 = a;
            int i82 = i81 & 121;
            int i83 = ((i81 | 121) & (~i82)) + (i82 << 1);
            b = i83 % 128;
            int i84 = i83 % 2;
            sbW.append(", windowActionBarOverlay: ");
            boolean z = this.H;
            int i85 = b;
            int i86 = i85 & 111;
            int i87 = -(-((i85 ^ 111) | i86));
            int i88 = (i86 & i87) + (i87 | i86);
            a = i88 % 128;
            if (i88 % 2 == 0) {
                sbW.append(z);
                sbW.append(", android:windowIsFloating: ");
                obj.hashCode();
                throw null;
            }
            sbW.append(z);
            sbW.append(", android:windowIsFloating: ");
            sbW.append(this.I);
            sbW.append(", windowActionModeOverlay: ");
            int i89 = a;
            int i90 = (-2) - ((((i89 | 110) << 1) - (i89 ^ 110)) ^ (-1));
            b = i90 % 128;
            int i91 = i90 % 2;
            sbW.append(this.G);
            int i92 = b;
            int i93 = ((i92 ^ 78) + ((i92 & 78) << 1)) - 1;
            a = i93 % 128;
            if (i93 % 2 == 0) {
                sbW.append(", windowNoTitle: ");
                sbW.append(this.J);
                obj.hashCode();
                throw null;
            }
            sbW.append(", windowNoTitle: ");
            sbW.append(this.J);
            sbW.append(" }");
            throw new IllegalArgumentException(sbW.toString());
        }
        J j = new J(this);
        WeakHashMap<View, R> weakHashMap = T.c;
        T.aXb.v(viewGroup, j);
        if (this.q == null) {
            int i94 = b;
            int i95 = ((i94 ^ 119) - (~((i94 & 119) << 1))) - 1;
            a = i95 % 128;
            if (i95 % 2 == 0) {
                this.C = (TextView) viewGroup.findViewById(ivas.gov.bisp.enumeration.R.id.title);
                throw null;
            }
            this.C = (TextView) viewGroup.findViewById(ivas.gov.bisp.enumeration.R.id.title);
        }
        Method method = aj.c;
        try {
            Class<?> cls = viewGroup.getClass();
            Class<?>[] clsArr = new Class[0];
            int i96 = b;
            int i97 = i96 & 45;
            int i98 = ((((i96 ^ 45) | i97) << 1) - (~(-((~i97) & (i96 | 45))))) - 1;
            a = i98 % 128;
            int i99 = i98 % 2;
            Method method2 = cls.getMethod("makeOptionalFitsSystemWindows", clsArr);
            if (!method2.isAccessible()) {
                method2.setAccessible(true);
            }
            method2.invoke(viewGroup, new Object[0]);
            int i100 = b;
            int i101 = i100 ^ 33;
            int i102 = (i100 & 33) << 1;
            int i103 = (i101 & i102) + (i102 | i101);
            a = i103 % 128;
            int i104 = i103 % 2;
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(ivas.gov.bisp.enumeration.R.id.action_bar_activity_content);
        int i105 = b;
        int i106 = i105 & 21;
        int i107 = -(-(i105 | 21));
        int i108 = (i106 ^ i107) + ((i107 & i106) << 1);
        a = i108 % 128;
        if (i108 % 2 == 0) {
            viewGroup2 = (ViewGroup) this.k.findViewById(android.R.id.content);
            int i109 = 83 / 0;
            if (viewGroup2 != null) {
                while (viewGroup2.getChildCount() > 0) {
                    int i110 = a;
                    int i111 = (81 & (~i110)) | (i110 & (-82));
                    int i112 = -(-((i110 & 81) << 1));
                    int i113 = (i111 ^ i112) + ((i111 & i112) << 1);
                    b = i113 % 128;
                    int i114 = i113 % 2;
                    View childAt = viewGroup2.getChildAt(0);
                    viewGroup2.removeViewAt(0);
                    contentFrameLayout.addView(childAt);
                    int i115 = a;
                    int i116 = ((i115 & 22) + (i115 | 22)) - 1;
                    b = i116 % 128;
                    int i117 = i116 % 2;
                }
                viewGroup2.setId(-1);
                contentFrameLayout.setId(android.R.id.content);
                if (viewGroup2 instanceof FrameLayout) {
                    i = a + 101;
                    b = i % 128;
                    if (i % 2 != 0) {
                        ((FrameLayout) viewGroup2).setForeground(null);
                        int i118 = 71 / 0;
                    } else {
                        ((FrameLayout) viewGroup2).setForeground(null);
                    }
                }
            }
        } else {
            viewGroup2 = (ViewGroup) this.k.findViewById(android.R.id.content);
            if (viewGroup2 != null) {
                while (viewGroup2.getChildCount() > 0) {
                    int i119 = a;
                    int i1110 = (81 & (~i119)) | (i119 & (-82));
                    int i1111 = -(-((i119 & 81) << 1));
                    int i1112 = (i1110 ^ i1111) + ((i1110 & i1111) << 1);
                    b = i1112 % 128;
                    int i1113 = i1112 % 2;
                    View childAt2 = viewGroup2.getChildAt(0);
                    viewGroup2.removeViewAt(0);
                    contentFrameLayout.addView(childAt2);
                    int i1114 = a;
                    int i1115 = ((i1114 & 22) + (i1114 | 22)) - 1;
                    b = i1115 % 128;
                    int i1116 = i1115 % 2;
                }
                viewGroup2.setId(-1);
                contentFrameLayout.setId(android.R.id.content);
                if (viewGroup2 instanceof FrameLayout) {
                    i = a + 101;
                    b = i % 128;
                    if (i % 2 != 0) {
                        ((FrameLayout) viewGroup2).setForeground(null);
                        int i1117 = 71 / 0;
                    } else {
                        ((FrameLayout) viewGroup2).setForeground(null);
                    }
                }
            }
        }
        this.k.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new x(this));
        int i120 = a;
        int i121 = i120 & 51;
        int i122 = i121 + ((i120 ^ 51) | i121);
        b = i122 % 128;
        if (i122 % 2 != 0) {
            this.B = viewGroup;
            obj.hashCode();
            throw null;
        }
        this.B = viewGroup;
        Object obj2 = this.j;
        CharSequence title = (obj2 instanceof Activity) ^ true ? this.p : ((Activity) obj2).getTitle();
        if (!TextUtils.isEmpty(title)) {
            int i123 = a;
            int i124 = i123 + 15;
            int i125 = i124 % 128;
            b = i125;
            int i126 = i124 % 2;
            InterfaceC0320s interfaceC0320s3 = this.q;
            if (interfaceC0320s3 != null) {
                int i127 = i125 & 49;
                int i128 = ((((i125 ^ 49) | i127) << 1) - (~(-((i125 | 49) & (~i127))))) - 1;
                a = i128 % 128;
                int i129 = i128 % 2;
                interfaceC0320s3.setWindowTitle(title);
                int i130 = a;
                int i131 = (i130 ^ 13) + ((i130 & 13) << 1);
                b = i131 % 128;
                int i132 = i131 % 2;
            } else {
                z zVar = this.i;
                if (zVar != null) {
                    int i133 = (((i125 | 36) << 1) - (i125 ^ 36)) - 1;
                    a = i133 % 128;
                    int i134 = i133 % 2;
                    zVar.r(title);
                } else {
                    TextView textView = this.C;
                    if (textView != null) {
                        int i135 = (i123 ^ 57) + ((i123 & 57) << 1);
                        b = i135 % 128;
                        if (i135 % 2 != 0) {
                            textView.setText(title);
                            int i136 = 23 / 0;
                        } else {
                            textView.setText(title);
                        }
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.B.findViewById(android.R.id.content);
        int i137 = b;
        int i138 = i137 ^ 125;
        int i139 = -(-((i137 & 125) << 1));
        int i140 = (i138 ^ i139) + ((i139 & i138) << 1);
        a = i140 % 128;
        if (i140 % 2 == 0) {
            this.k.getDecorView().getPaddingLeft();
            obj.hashCode();
            throw null;
        }
        View decorView = this.k.getDecorView();
        int paddingLeft = decorView.getPaddingLeft();
        int paddingTop = decorView.getPaddingTop();
        int paddingRight = decorView.getPaddingRight();
        int i141 = a;
        int i142 = i141 | 57;
        int i143 = (i142 << 1) - ((~(i141 & 57)) & i142);
        b = i143 % 128;
        int i144 = i143 % 2;
        contentFrameLayout2.h.set(paddingLeft, paddingTop, paddingRight, decorView.getPaddingBottom());
        WeakHashMap<View, R> weakHashMap2 = T.c;
        int i145 = a;
        int i146 = i145 & 49;
        int i147 = -(-((i145 ^ 49) | i146));
        int i148 = (i146 & i147) + (i147 | i146);
        b = i148 % 128;
        int i149 = i148 % 2;
        if (T.aXa.d(contentFrameLayout2)) {
            int i150 = a;
            int i151 = ((i150 | 1) << 1) - (i150 ^ 1);
            b = i151 % 128;
            int i152 = i151 % 2;
            contentFrameLayout2.requestLayout();
            int i153 = a;
            int i154 = (i153 & 35) + (i153 | 35);
            b = i154 % 128;
            int i155 = i154 % 2;
        }
        TypedArray typedArrayObtainStyledAttributes2 = this.l.obtainStyledAttributes(ivas.gov.bisp.enumeration.p006af.h.l);
        int i156 = a;
        int i157 = i156 & 109;
        int i158 = ((109 | i156) & (~i157)) + (i157 << 1);
        b = i158 % 128;
        int i159 = i158 % 2;
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        int i160 = b;
        int i161 = (i160 & (-100)) | ((~i160) & 99);
        int i162 = (i160 & 99) << 1;
        int i163 = (i161 & i162) + (i162 | i161);
        a = i163 % 128;
        typedArrayObtainStyledAttributes2.getValue(i163 % 2 == 0 ? 69 : 125, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            int i164 = b;
            int i165 = ((i164 | 101) << 1) - (i164 ^ 101);
            a = i165 % 128;
            int i166 = i165 % 2;
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
            int i167 = a;
            int i168 = i167 ^ 115;
            int i169 = (i167 & 115) << 1;
            int i170 = ((i168 | i169) << 1) - (i169 ^ i168);
            b = i170 % 128;
            int i171 = i170 % 2;
        }
        if (!(!typedArrayObtainStyledAttributes2.hasValue(123))) {
            int i172 = b;
            int i173 = (i172 ^ 5) + ((i172 & 5) << 1);
            a = i173 % 128;
            int i174 = i173 % 2;
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            int i175 = a + 41;
            b = i175 % 128;
            if (i175 % 2 != 0) {
                fixedHeightMinor = contentFrameLayout2.getFixedHeightMinor();
                i80 = 97;
            } else {
                fixedHeightMinor = contentFrameLayout2.getFixedHeightMinor();
            }
            int i176 = b;
            int i177 = (i176 & (-120)) | ((~i176) & 119);
            int i178 = -(-((i176 & 119) << 1));
            int i179 = ((i177 | i178) << 1) - (i178 ^ i177);
            a = i179 % 128;
            if (i179 % 2 == 0) {
                typedArrayObtainStyledAttributes2.getValue(i80, fixedHeightMinor);
                int i180 = 19 / 0;
            } else {
                typedArrayObtainStyledAttributes2.getValue(i80, fixedHeightMinor);
            }
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.z = true;
        aQz aqzQ = Q(0);
        if (this.S) {
            return;
        }
        int i181 = a;
        int i182 = ((i181 ^ 50) + ((i181 & 50) << 1)) - 1;
        b = i182 % 128;
        if (i182 % 2 != 0) {
            n nVar = aqzQ.k;
            throw null;
        }
        if (aqzQ.k == null) {
            S(108);
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 117;
        int i4 = ((i2 | 117) & (~i3)) + (i3 << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        View viewOnCreateView = onCreateView(null, str, context, attributeSet);
        int i6 = a;
        int i7 = i6 & 37;
        int i8 = i7 + ((i6 ^ 37) | i7);
        b = i8 % 128;
        int i9 = i8 % 2;
        return viewOnCreateView;
    }
}
