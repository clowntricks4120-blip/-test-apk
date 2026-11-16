package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import ivas.gov.bisp.enumeration.R;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class c implements p, AdapterView.OnItemClickListener {
    public Context a;
    public LayoutInflater b;
    public n c;
    public p.aIX d;
    public ExpandedMenuView e;
    public aIV f;

    public class aIV extends BaseAdapter {
        public int a = -1;

        public aIV() {
            b();
        }

        public void b() {
            n nVar = c.this.c;
            u uVar = nVar.x;
            if (uVar != null) {
                nVar.c();
                ArrayList<u> arrayList = nVar.k;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    if (arrayList.get(i) == uVar) {
                        this.a = i;
                        return;
                    }
                }
            }
            this.a = -1;
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public u getItem(int i) {
            n nVar = c.this.c;
            nVar.c();
            ArrayList<u> arrayList = nVar.k;
            Objects.requireNonNull(c.this);
            int i2 = this.a;
            if (i2 >= 0 && i >= i2) {
                i++;
            }
            return arrayList.get(i);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            n nVar = c.this.c;
            nVar.c();
            int size = nVar.k.size();
            Objects.requireNonNull(c.this);
            return this.a < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = c.this.b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
            }
            ((m.aIE) view).d(getItem(i), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            b();
            super.notifyDataSetChanged();
        }
    }

    public c(Context context, int i) {
        this.a = context;
        this.b = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.p
    public Parcelable a() {
        if (this.e == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.e;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.p
    public void b(n nVar, boolean z) {
        p.aIX aix = this.d;
        if (aix != null) {
            aix.b(nVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public int c() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.p
    public boolean d() {
        return false;
    }

    public ListAdapter e() {
        if (this.f == null) {
            this.f = new aIV();
        }
        return this.f;
    }

    @Override // androidx.appcompat.view.menu.p
    public void g(Context context, n nVar) {
        if (this.a != null) {
            this.a = context;
            if (this.b == null) {
                this.b = LayoutInflater.from(context);
            }
        }
        this.c = nVar;
        aIV aiv = this.f;
        if (aiv != null) {
            aiv.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public boolean h(n nVar, u uVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.p
    public void n(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.e.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public boolean o(n nVar, u uVar) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.c.s(this.f.getItem(i), this, 0);
    }

    @Override // androidx.appcompat.view.menu.p
    public void p(p.aIX aix) {
        this.d = aix;
    }

    @Override // androidx.appcompat.view.menu.p
    public void q(boolean z) {
        aIV aiv = this.f;
        if (aiv != null) {
            aiv.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public boolean r(w wVar) {
        if (!wVar.hasVisibleItems()) {
            return false;
        }
        t tVar = new t(wVar);
        b.aIz aiz = new b.aIz(wVar.c);
        c cVar = new c(aiz.a.b, R.layout.abc_list_menu_item_layout);
        tVar.c = cVar;
        cVar.d = tVar;
        n nVar = tVar.a;
        nVar.e(cVar, nVar.c);
        ListAdapter listAdapterE = tVar.c.e();
        AlertController.OooO0O0 oooO0O0 = aiz.a;
        oooO0O0.n = listAdapterE;
        oooO0O0.m = tVar;
        View view = wVar.p;
        if (view != null) {
            oooO0O0.g = view;
        } else {
            oooO0O0.d = wVar.n;
            oooO0O0.e = wVar.f6o;
        }
        oooO0O0.l = tVar;
        b bVarB = aiz.b();
        tVar.b = bVarB;
        bVarB.setOnDismissListener(tVar);
        WindowManager.LayoutParams attributes = tVar.b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        tVar.b.show();
        p.aIX aix = this.d;
        if (aix == null) {
            return true;
        }
        aix.e(wVar);
        return true;
    }
}
