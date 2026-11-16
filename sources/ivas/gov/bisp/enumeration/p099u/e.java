package ivas.gov.bisp.enumeration.p099u;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import ivas.gov.bisp.enumeration.OooOOoo.OooOOOO;
import ivas.gov.bisp.enumeration.p001aa.t;
import ivas.gov.bisp.enumeration.p092o.h;
import ivas.gov.bisp.enumeration.p092o.r;
import ivas.gov.bisp.enumeration.p097r.a;
import ivas.gov.bisp.enumeration.p097r.u;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class e extends ActionMode {
    private static int a = 1;
    private static int b;
    public final Context c;
    public final j d;

    public e(Context context, j jVar) {
        this.c = context;
        this.d = jVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 93;
        int i4 = (i2 ^ 93) | i3;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            this.d.d();
        } else {
            this.d.d();
            throw null;
        }
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 85;
        int i4 = (((i2 | 85) & (~i3)) - (~(i3 << 1))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        View viewE = this.d.e();
        int i6 = b + 88;
        int i7 = (i6 ^ (-1)) + (i6 << 1);
        a = i7 % 128;
        int i8 = i7 % 2;
        return viewE;
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        int i = 2 % 2;
        a aVar = new a(this.c, (h) this.d.g());
        int i2 = b;
        int i3 = i2 ^ 109;
        int i4 = ((i2 & 109) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        return aVar;
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & (-86)) | ((~i2) & 85)) + ((i2 & 85) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        MenuInflater menuInflaterF = this.d.f();
        int i5 = a;
        int i6 = i5 & 41;
        int i7 = (i5 | 41) & (~i6);
        int i8 = i6 << 1;
        int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
        b = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 34 / 0;
        }
        return menuInflaterF;
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        CharSequence charSequenceH;
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 35) | (i2 & 35)) << 1;
        int i4 = -(((~i2) & 35) | (i2 & (-36)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            charSequenceH = this.d.h();
            int i6 = 70 / 0;
        } else {
            charSequenceH = this.d.h();
        }
        int i7 = a + 11;
        b = i7 % 128;
        int i8 = i7 % 2;
        return charSequenceH;
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 79) + (i2 | 79);
        b = i3 % 128;
        int i4 = i3 % 2;
        CharSequence charSequenceI = this.d.i();
        if (i4 != 0) {
            int i5 = 85 / 0;
        }
        return charSequenceI;
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 79) | (i2 & 79)) << 1;
        int i4 = -(((~i2) & 79) | (i2 & (-80)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        if (i5 % 2 == 0) {
            this.d.c();
            throw null;
        }
        this.d.c();
        int i6 = b;
        int i7 = ((i6 ^ 126) + ((i6 & 126) << 1)) - 1;
        a = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        int i = 2 % 2;
        int i2 = b + 89;
        a = i2 % 128;
        if (i2 % 2 != 0) {
            return this.d.j();
        }
        int i3 = 12 / 0;
        return this.d.j();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & 63) - (~(-(-(i2 | 63))))) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        this.d.k(view);
        int i5 = b;
        int i6 = ((i5 | 13) << 1) - (i5 ^ 13);
        a = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 27) + ((i2 & 27) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        this.d.n(charSequence);
        int i5 = b;
        int i6 = ((i5 & (-10)) | ((~i5) & 9)) + ((i5 & 9) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 87) + (i2 | 87);
        b = i3 % 128;
        if (i3 % 2 == 0) {
            this.d.a = obj;
        } else {
            this.d.a = obj;
            throw null;
        }
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 97) << 1) - (i2 ^ 97);
        a = i3 % 128;
        if (i3 % 2 != 0) {
            this.d.o(charSequence);
            return;
        }
        this.d.o(charSequence);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 ^ 37) | (i2 & 37)) << 1) - (((~i2) & 37) | (i2 & (-38)));
        b = i3 % 128;
        int i4 = i3 % 2;
        this.d.p(z);
        int i5 = a;
        int i6 = (i5 ^ 67) + ((i5 & 67) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
    }

    public static class aRf implements j.aQr {
        private static int a = 1;
        private static int b;
        public final ActionMode.Callback c;
        public final Context d;
        public final ArrayList<e> e = new ArrayList<>();
        public final OooOOOO<Menu, Menu> f = new t();

        public aRf(Context context, ActionMode.Callback callback) {
            this.d = context;
            this.c = callback;
        }

        @Override // ivas.gov.bisp.enumeration.u.j.aQr
        public void c(j jVar) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 ^ 65) + ((i2 & 65) << 1);
            a = i3 % 128;
            if (i3 % 2 != 0) {
                this.c.onDestroyActionMode(h(jVar));
            } else {
                this.c.onDestroyActionMode(h(jVar));
                int i4 = 2 / 0;
            }
        }

        @Override // ivas.gov.bisp.enumeration.u.j.aQr
        public boolean e(j jVar, MenuItem menuItem) {
            int i = 2 % 2;
            ActionMode.Callback callback = this.c;
            ActionMode actionModeH = h(jVar);
            u uVar = new u(this.d, (r) menuItem);
            int i2 = b + 31;
            a = i2 % 128;
            if (i2 % 2 != 0) {
                return callback.onActionItemClicked(actionModeH, uVar);
            }
            callback.onActionItemClicked(actionModeH, uVar);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.u.j.aQr
        public boolean b(j jVar, Menu menu) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 49;
            int i4 = ((i2 ^ 49) | i3) << 1;
            int i5 = -((i2 | 49) & (~i3));
            int i6 = (i4 & i5) + (i5 | i4);
            b = i6 % 128;
            int i7 = i6 % 2;
            ActionMode.Callback callback = this.c;
            ActionMode actionModeH = h(jVar);
            Menu menuG = g(menu);
            int i8 = b;
            int i9 = ((i8 ^ 83) | (i8 & 83)) << 1;
            int i10 = -(((~i8) & 83) | (i8 & (-84)));
            int i11 = (i9 & i10) + (i10 | i9);
            a = i11 % 128;
            int i12 = i11 % 2;
            boolean zOnCreateActionMode = callback.onCreateActionMode(actionModeH, menuG);
            int i13 = a + 39;
            b = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 29 / 0;
            }
            return zOnCreateActionMode;
        }

        @Override // ivas.gov.bisp.enumeration.u.j.aQr
        public boolean d(j jVar, Menu menu) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 | 95) << 1) - (i2 ^ 95);
            b = i3 % 128;
            int i4 = i3 % 2;
            ActionMode.Callback callback = this.c;
            ActionMode actionModeH = h(jVar);
            Menu menuG = g(menu);
            int i5 = a;
            int i6 = (-2) - (((i5 & 42) + (i5 | 42)) ^ (-1));
            b = i6 % 128;
            int i7 = i6 % 2;
            boolean zOnPrepareActionMode = callback.onPrepareActionMode(actionModeH, menuG);
            int i8 = b;
            int i9 = i8 & 21;
            int i10 = -(-((i8 ^ 21) | i9));
            int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
            a = i11 % 128;
            int i12 = i11 % 2;
            return zOnPrepareActionMode;
        }

        public final Menu g(Menu menu) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 & (-122)) | ((~i2) & 121)) + ((i2 & 121) << 1);
            a = i3 % 128;
            int i4 = i3 % 2;
            Object obj = null;
            Menu aVar = (Menu) this.f.getOrDefault(menu, null);
            int i5 = b;
            int i6 = i5 & 105;
            int i7 = (i5 ^ 105) | i6;
            int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
            a = i8 % 128;
            if (i8 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (aVar == null) {
                aVar = new a(this.d, (h) menu);
                int i9 = b + 9;
                a = i9 % 128;
                int i10 = i9 % 2;
                this.f.put(menu, aVar);
                int i11 = b;
                int i12 = i11 ^ 9;
                int i13 = -(-((i11 & 9) << 1));
                int i14 = (i12 & i13) + (i13 | i12);
                a = i14 % 128;
                int i15 = i14 % 2;
            }
            int i16 = b + 68;
            int i17 = (i16 ^ (-1)) + (i16 << 1);
            a = i17 % 128;
            int i18 = i17 % 2;
            return aVar;
        }

        public ActionMode h(j jVar) {
            e eVar;
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 91;
            int i4 = (i2 ^ 91) | i3;
            int i5 = (i3 & i4) + (i4 | i3);
            b = i5 % 128;
            int i6 = i5 % 2;
            int size = this.e.size();
            int i7 = a;
            int i8 = i7 & 121;
            int i9 = ((i7 | 121) & (~i8)) + (i8 << 1);
            b = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    e eVar2 = new e(this.d, jVar);
                    int i12 = b;
                    int i13 = (i12 ^ 55) + ((i12 & 55) << 1);
                    a = i13 % 128;
                    int i14 = i13 % 2;
                    this.e.add(eVar2);
                    int i15 = b + 51;
                    a = i15 % 128;
                    int i16 = i15 % 2;
                    return eVar2;
                }
                int i17 = a + 59;
                b = i17 % 128;
                int i18 = i17 % 2;
                eVar = this.e.get(i11);
                if (eVar != null) {
                    int i19 = a;
                    int i20 = (i19 & 79) + (i19 | 79);
                    b = i20 % 128;
                    if (i20 % 2 != 0) {
                        int i21 = 16 / 0;
                        if (eVar.d == jVar) {
                            break;
                        }
                    } else if (eVar.d == jVar) {
                        break;
                    }
                }
                i11++;
                int i22 = b;
                int i23 = (i22 & 12) + (i22 | 12);
                int i24 = (i23 ^ (-1)) + (i23 << 1);
                a = i24 % 128;
                int i25 = i24 % 2;
            }
            int i26 = a;
            int i27 = (-2) - ((((i26 | 112) << 1) - (i26 ^ 112)) ^ (-1));
            b = i27 % 128;
            int i28 = i27 % 2;
            int i29 = i26 ^ 117;
            int i30 = ((((i26 & 117) | i29) << 1) - (~(-i29))) - 1;
            b = i30 % 128;
            if (i30 % 2 != 0) {
                int i31 = 45 / 0;
            }
            return eVar;
        }
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 59;
        int i4 = ((((i2 ^ 59) | i3) << 1) - (~(-((i2 | 59) & (~i3))))) - 1;
        a = i4 % 128;
        if (i4 % 2 != 0) {
            return this.d.a;
        }
        Object obj = this.d.a;
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        int i = 2 % 2;
        int i2 = a + 77;
        b = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.d.b;
        int i4 = b;
        int i5 = i4 ^ 59;
        int i6 = ((((i4 & 59) | i5) << 1) - (~(-i5))) - 1;
        a = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 69 / 0;
        }
        return z;
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 125;
        int i5 = (i3 ^ 125) | i4;
        int i6 = (i4 & i5) + (i5 | i4);
        a = i6 % 128;
        if (i6 % 2 == 0) {
            this.d.l(i);
            int i7 = 81 / 0;
        } else {
            this.d.l(i);
        }
        int i8 = a;
        int i9 = i8 & 39;
        int i10 = (i8 | 39) & (~i9);
        int i11 = i9 << 1;
        int i12 = (i10 & i11) + (i10 | i11);
        b = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.view.ActionMode
    public void setTitle(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 113;
        int i5 = -(-((i3 ^ 113) | i4));
        int i6 = (i4 & i5) + (i5 | i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        this.d.m(i);
        int i8 = a + 123;
        b = i8 % 128;
        int i9 = i8 % 2;
    }
}
