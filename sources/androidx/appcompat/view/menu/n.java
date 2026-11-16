package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import ivas.gov.bisp.enumeration.p081d.L;
import ivas.gov.bisp.enumeration.p086i.l;
import ivas.gov.bisp.enumeration.p092o.h;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class n implements h {
    public static final int[] a = {1, 4, 5, 3, 2, 0};
    public ArrayList<u> b;
    public final Context c;
    public final Resources d;
    public boolean e;
    public boolean f;
    public ArrayList<u> g;
    public aII h;
    public ArrayList<u> i;
    public boolean j;
    public ArrayList<u> k;
    public boolean l;
    public Drawable n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public CharSequence f6o;
    public View p;
    public boolean u;
    public u x;
    public int m = 0;
    public boolean q = false;
    public boolean s = false;
    public boolean r = false;
    public boolean t = false;
    public ArrayList<u> w = new ArrayList<>();
    public CopyOnWriteArrayList<WeakReference<p>> v = new CopyOnWriteArrayList<>();
    public boolean y = false;

    public interface aIH {
        boolean b(u uVar);
    }

    public interface aII {
        boolean b(n nVar, MenuItem menuItem);

        void e(n nVar);
    }

    public n(Context context) {
        boolean zShouldShowMenuShortcutsWhenKeyboardPresent;
        boolean z = false;
        this.c = context;
        Resources resources = context.getResources();
        this.d = resources;
        this.g = new ArrayList<>();
        this.i = new ArrayList<>();
        this.j = true;
        this.b = new ArrayList<>();
        this.k = new ArrayList<>();
        this.l = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = L.c;
            if (Build.VERSION.SDK_INT >= 28) {
                zShouldShowMenuShortcutsWhenKeyboardPresent = viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                zShouldShowMenuShortcutsWhenKeyboardPresent = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zShouldShowMenuShortcutsWhenKeyboardPresent) {
                z = true;
            }
        }
        this.f = z;
    }

    public void A() {
        if (this.q) {
            return;
        }
        this.q = true;
        this.s = false;
        this.r = false;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return d(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.c.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = d(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void c() {
        ArrayList<u> arrayListN = n();
        if (this.l) {
            boolean zD = false;
            for (WeakReference<p> weakReference : this.v) {
                p pVar = weakReference.get();
                if (pVar == null) {
                    this.v.remove(weakReference);
                } else {
                    zD |= pVar.d();
                }
            }
            if (zD) {
                this.b.clear();
                this.k.clear();
                int size = arrayListN.size();
                for (int i = 0; i < size; i++) {
                    u uVar = arrayListN.get(i);
                    if (uVar.j()) {
                        this.b.add(uVar);
                    } else {
                        this.k.add(uVar);
                    }
                }
            } else {
                this.b.clear();
                this.k.clear();
                this.k.addAll(n());
            }
            this.l = false;
        }
    }

    @Override // android.view.Menu
    public void clear() {
        u uVar = this.x;
        if (uVar != null) {
            g(uVar);
        }
        this.g.clear();
        r(true);
    }

    public void clearHeader() {
        this.n = null;
        this.f6o = null;
        this.p = null;
        r(false);
    }

    @Override // android.view.Menu
    public void close() {
        f(true);
    }

    public MenuItem d(int i, int i2, int i3, CharSequence charSequence) {
        int i4 = ((-65536) & i3) >> 16;
        if (i4 >= 0) {
            int[] iArr = a;
            if (i4 < iArr.length) {
                int i5 = (iArr[i4] << 16) | (65535 & i3);
                u uVar = new u(this, i, i2, i3, i5, charSequence, this.m);
                ArrayList<u> arrayList = this.g;
                int size = arrayList.size();
                while (true) {
                    int i6 = size - 1;
                    if (i6 < 0) {
                        size = 0;
                        break;
                    }
                    if (arrayList.get(i6).e <= i5) {
                        break;
                    }
                    size = i6;
                }
                arrayList.add(size, uVar);
                r(true);
                return uVar;
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    public void e(p pVar, Context context) {
        this.v.add(new WeakReference<>(pVar));
        pVar.g(context, this);
        this.l = true;
    }

    public final void f(boolean z) {
        if (this.t) {
            return;
        }
        this.t = true;
        for (WeakReference<p> weakReference : this.v) {
            p pVar = weakReference.get();
            if (pVar == null) {
                this.v.remove(weakReference);
            } else {
                pVar.b(this, z);
            }
        }
        this.t = false;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            u uVar = this.g.get(i2);
            if (uVar.b == i) {
                return uVar;
            }
            if (uVar.hasSubMenu() && (menuItemFindItem = uVar.f7o.findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public boolean g(u uVar) {
        boolean zH = false;
        if (!this.v.isEmpty() && this.x == uVar) {
            A();
            for (WeakReference<p> weakReference : this.v) {
                p pVar = weakReference.get();
                if (pVar != null) {
                    zH = pVar.h(this, uVar);
                    if (zH) {
                        break;
                    }
                } else {
                    this.v.remove(weakReference);
                }
            }
            v();
            if (zH) {
                this.x = null;
            }
        }
        return zH;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return this.g.get(i);
    }

    public boolean h(u uVar) {
        boolean zO = false;
        if (this.v.isEmpty()) {
            return false;
        }
        A();
        for (WeakReference<p> weakReference : this.v) {
            p pVar = weakReference.get();
            if (pVar != null) {
                zO = pVar.o(this, uVar);
                if (zO) {
                    break;
                }
            } else {
                this.v.remove(weakReference);
            }
        }
        v();
        if (zO) {
            this.x = uVar;
        }
        return zO;
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.u) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.g.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public boolean i(n nVar, MenuItem menuItem) {
        aII aii = this.h;
        return aii != null && aii.b(nVar, menuItem);
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return j(i, keyEvent) != null;
    }

    public u j(int i, KeyEvent keyEvent) {
        ArrayList<u> arrayList = this.w;
        arrayList.clear();
        k(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean zO = o();
        for (int i2 = 0; i2 < size; i2++) {
            u uVar = arrayList.get(i2);
            char c = zO ? uVar.j : uVar.i;
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (zO && c == '\b' && i == 67))) {
                return uVar;
            }
        }
        return null;
    }

    public void k(List<u> list, int i, KeyEvent keyEvent) {
        boolean zO = o();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.g.size();
            for (int i2 = 0; i2 < size; i2++) {
                u uVar = this.g.get(i2);
                if (uVar.hasSubMenu()) {
                    uVar.f7o.k(list, i, keyEvent);
                }
                char c = zO ? uVar.j : uVar.i;
                if ((modifiers & 69647) == ((zO ? uVar.k : uVar.a) & 69647) && c != 0) {
                    char[] cArr = keyData.meta;
                    if ((c == cArr[0] || c == cArr[2] || (zO && c == '\b' && i == 67)) && uVar.isEnabled()) {
                        list.add(uVar);
                    }
                }
            }
        }
    }

    public String l() {
        return "android:menu:actionviewstates";
    }

    public n m() {
        return this;
    }

    public ArrayList<u> n() {
        if (!this.j) {
            return this.i;
        }
        this.i.clear();
        int size = this.g.size();
        for (int i = 0; i < size; i++) {
            u uVar = this.g.get(i);
            if (uVar.isVisible()) {
                this.i.add(uVar);
            }
        }
        this.j = false;
        this.l = true;
        return this.i;
    }

    public boolean o() {
        return this.e;
    }

    public boolean p() {
        return this.y;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return t(findItem(i), i2);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        u uVarJ = j(i, keyEvent);
        boolean zS = uVarJ != null ? s(uVarJ, null, i2) : false;
        if ((i2 & 2) != 0) {
            f(true);
        }
        return zS;
    }

    public boolean q() {
        return this.f;
    }

    public void r(boolean z) {
        if (this.q) {
            this.s = true;
            if (z) {
                this.r = true;
                return;
            }
            return;
        }
        if (z) {
            this.j = true;
            this.l = true;
        }
        if (this.v.isEmpty()) {
            return;
        }
        A();
        for (WeakReference<p> weakReference : this.v) {
            p pVar = weakReference.get();
            if (pVar == null) {
                this.v.remove(weakReference);
            } else {
                pVar.q(z);
            }
        }
        v();
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (this.g.get(i2).c == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            int size2 = this.g.size();
            for (int i3 = 0; i3 < size2 - i2 && this.g.get(i2).c == i; i3++) {
                u(i2, false);
            }
            r(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        int size = size();
        int i2 = 0;
        while (i2 < size) {
            if (this.g.get(i2).b == i) {
                u(i2, true);
            }
            i2++;
        }
        i2 = -1;
        u(i2, true);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x003f  */
    /* JADX WARN: Code duplicated, block: B:30:0x004c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0053  */
    /* JADX WARN: Code duplicated, block: B:35:0x005a  */
    /* JADX WARN: Code duplicated, block: B:36:0x005f  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0073  */
    /* JADX WARN: Code duplicated, block: B:47:0x007c  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x009b  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00a5 A[SYNTHETIC] */
    public boolean s(MenuItem menuItem, p pVar, int i) {
        ivas.gov.bisp.enumeration.p081d.c cVar;
        boolean zExpandActionView;
        ivas.gov.bisp.enumeration.p081d.c cVar2;
        boolean z;
        w wVar;
        p pVar2;
        u uVar = (u) menuItem;
        boolean zR = false;
        if (uVar == null || !uVar.isEnabled()) {
            return false;
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = uVar.p;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(uVar)) {
            n nVar = uVar.m;
            if (nVar.i(nVar, uVar)) {
                zExpandActionView = true;
            } else {
                Intent intent = uVar.h;
                if (intent != null) {
                    try {
                        uVar.m.c.startActivity(intent);
                    } catch (ActivityNotFoundException e) {
                        Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
                        cVar = uVar.A;
                        if (cVar == null) {
                        }
                        zExpandActionView = false;
                        cVar2 = uVar.A;
                        if (cVar2 == null) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (uVar.h()) {
                            zExpandActionView |= uVar.expandActionView();
                            if (zExpandActionView) {
                                f(true);
                            }
                        } else if (uVar.hasSubMenu()) {
                            if ((i & 4) == 0) {
                                f(false);
                            }
                            if (!uVar.hasSubMenu()) {
                                w wVar2 = new w(this.c, this, uVar);
                                uVar.f7o = wVar2;
                                wVar2.setHeaderTitle(uVar.g);
                            }
                            wVar = uVar.f7o;
                            if (z) {
                                cVar2.g(wVar);
                            }
                            if (!this.v.isEmpty()) {
                                if (pVar != null) {
                                }
                                for (WeakReference<p> weakReference : this.v) {
                                    pVar2 = weakReference.get();
                                    if (pVar2 == null) {
                                        this.v.remove(weakReference);
                                    } else if (!zR) {
                                        zR = pVar2.r(wVar);
                                    }
                                }
                            }
                            zExpandActionView |= zR;
                            if (!zExpandActionView) {
                                f(true);
                            }
                        } else {
                            if ((i & 4) == 0) {
                                f(false);
                            }
                            if (!uVar.hasSubMenu()) {
                                w wVar3 = new w(this.c, this, uVar);
                                uVar.f7o = wVar3;
                                wVar3.setHeaderTitle(uVar.g);
                            }
                            wVar = uVar.f7o;
                            if (z) {
                                cVar2.g(wVar);
                            }
                            if (!this.v.isEmpty()) {
                                zR = pVar != null ? pVar.r(wVar) : false;
                                while (r8.hasNext()) {
                                    pVar2 = weakReference.get();
                                    if (pVar2 == null) {
                                        this.v.remove(weakReference);
                                    } else if (!zR) {
                                        zR = pVar2.r(wVar);
                                    }
                                }
                            }
                            zExpandActionView |= zR;
                            if (!zExpandActionView) {
                                f(true);
                            }
                        }
                        return zExpandActionView;
                    }
                    zExpandActionView = true;
                } else {
                    cVar = uVar.A;
                    if (cVar == null && cVar.h()) {
                        zExpandActionView = true;
                    } else {
                        zExpandActionView = false;
                    }
                }
            }
        } else {
            zExpandActionView = true;
        }
        cVar2 = uVar.A;
        if (cVar2 == null && cVar2.c()) {
            z = true;
        } else {
            z = false;
        }
        if (uVar.h()) {
            zExpandActionView |= uVar.expandActionView();
            if (zExpandActionView) {
                f(true);
            }
        } else if (uVar.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                f(false);
            }
            if (!uVar.hasSubMenu()) {
                w wVar4 = new w(this.c, this, uVar);
                uVar.f7o = wVar4;
                wVar4.setHeaderTitle(uVar.g);
            }
            wVar = uVar.f7o;
            if (z) {
                cVar2.g(wVar);
            }
            if (!this.v.isEmpty()) {
                if (pVar != null) {
                }
                while (r8.hasNext()) {
                    pVar2 = weakReference.get();
                    if (pVar2 == null) {
                        this.v.remove(weakReference);
                    } else if (!zR) {
                        zR = pVar2.r(wVar);
                    }
                }
            }
            zExpandActionView |= zR;
            if (!zExpandActionView) {
                f(true);
            }
        } else if ((i & 1) == 0) {
            f(true);
        }
        return zExpandActionView;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.g.size();
        for (int i2 = 0; i2 < size; i2++) {
            u uVar = this.g.get(i2);
            if (uVar.c == i) {
                uVar.m(z2);
                uVar.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.y = z;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        int size = this.g.size();
        for (int i2 = 0; i2 < size; i2++) {
            u uVar = this.g.get(i2);
            if (uVar.c == i) {
                uVar.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        int size = this.g.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            u uVar = this.g.get(i2);
            if (uVar.c == i && uVar.p(z)) {
                z2 = true;
            }
        }
        if (z2) {
            r(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.e = z;
        r(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.g.size();
    }

    public boolean t(MenuItem menuItem, int i) {
        return s(menuItem, null, i);
    }

    public final void u(int i, boolean z) {
        if (i < 0 || i >= this.g.size()) {
            return;
        }
        this.g.remove(i);
        if (z) {
            r(true);
        }
    }

    public void v() {
        this.q = false;
        if (this.s) {
            this.s = false;
            r(this.r);
        }
    }

    public void w(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(l());
        int size = size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((w) item.getSubMenu()).w(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (menuItemFindItem = findItem(i2)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    public void x(p pVar) {
        for (WeakReference<p> weakReference : this.v) {
            p pVar2 = weakReference.get();
            if (pVar2 == null || pVar2 == pVar) {
                this.v.remove(weakReference);
            }
        }
    }

    public void y(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((w) item.getSubMenu()).y(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(l(), sparseArray);
        }
    }

    public final void z(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources resources = this.d;
        if (view != null) {
            this.p = view;
            this.f6o = null;
            this.n = null;
        } else {
            if (i > 0) {
                this.f6o = resources.getText(i);
            } else if (charSequence != null) {
                this.f6o = charSequence;
            }
            if (i2 > 0) {
                Context context = this.c;
                Object obj = l.c;
                this.n = l.aUH.c(context, i2);
            } else if (drawable != null) {
                this.n = drawable;
            }
            this.p = null;
        }
        r(false);
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return d(0, 0, 0, this.d.getString(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.d.getString(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return d(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        u uVar = (u) d(i, i2, i3, charSequence);
        w wVar = new w(this.c, this, uVar);
        uVar.f7o = wVar;
        wVar.setHeaderTitle(uVar.g);
        return wVar;
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return d(i, i2, i3, this.d.getString(i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.d.getString(i4));
    }
}
